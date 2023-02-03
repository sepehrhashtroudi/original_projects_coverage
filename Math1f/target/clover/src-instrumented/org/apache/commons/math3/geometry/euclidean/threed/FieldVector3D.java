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

import org.apache.commons.math3.RealFieldElement;
import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.exception.MathArithmeticException;
import org.apache.commons.math3.exception.util.LocalizedFormats;
import org.apache.commons.math3.util.FastMath;
import org.apache.commons.math3.util.MathArrays;

/**
 * This class is a re-implementation of {@link Vector3D} using {@link RealFieldElement}.
 * <p>Instance of this class are guaranteed to be immutable.</p>
 * @param <T> the type of the field elements
 * @version $Id$
 * @since 3.2
 */
public class FieldVector3D<T extends RealFieldElement<T>> implements Serializable {public static class __CLR4_4_1cvzcvzlb90p882{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,17048,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** Serializable version identifier. */
    private static final long serialVersionUID = 20130224L;

    /** Abscissa. */
    private final T x;

    /** Ordinate. */
    private final T y;

    /** Height. */
    private final T z;

    /** Simple constructor.
     * Build a vector from its coordinates
     * @param x abscissa
     * @param y ordinate
     * @param z height
     * @see #getX()
     * @see #getY()
     * @see #getZ()
     */
    public FieldVector3D(final T x, final T y, final T z) {try{__CLR4_4_1cvzcvzlb90p882.R.inc(16703);
        __CLR4_4_1cvzcvzlb90p882.R.inc(16704);this.x = x;
        __CLR4_4_1cvzcvzlb90p882.R.inc(16705);this.y = y;
        __CLR4_4_1cvzcvzlb90p882.R.inc(16706);this.z = z;
    }finally{__CLR4_4_1cvzcvzlb90p882.R.flushNeeded();}}

    /** Simple constructor.
     * Build a vector from its coordinates
     * @param v coordinates array
     * @exception DimensionMismatchException if array does not have 3 elements
     * @see #toArray()
     */
    public FieldVector3D(final T[] v) throws DimensionMismatchException {try{__CLR4_4_1cvzcvzlb90p882.R.inc(16707);
        __CLR4_4_1cvzcvzlb90p882.R.inc(16708);if ((((v.length != 3)&&(__CLR4_4_1cvzcvzlb90p882.R.iget(16709)!=0|true))||(__CLR4_4_1cvzcvzlb90p882.R.iget(16710)==0&false))) {{
            __CLR4_4_1cvzcvzlb90p882.R.inc(16711);throw new DimensionMismatchException(v.length, 3);
        }
        }__CLR4_4_1cvzcvzlb90p882.R.inc(16712);this.x = v[0];
        __CLR4_4_1cvzcvzlb90p882.R.inc(16713);this.y = v[1];
        __CLR4_4_1cvzcvzlb90p882.R.inc(16714);this.z = v[2];
    }finally{__CLR4_4_1cvzcvzlb90p882.R.flushNeeded();}}

    /** Simple constructor.
     * Build a vector from its azimuthal coordinates
     * @param alpha azimuth (&alpha;) around Z
     *              (0 is +X, &pi;/2 is +Y, &pi; is -X and 3&pi;/2 is -Y)
     * @param delta elevation (&delta;) above (XY) plane, from -&pi;/2 to +&pi;/2
     * @see #getAlpha()
     * @see #getDelta()
     */
    public FieldVector3D(final T alpha, final T delta) {try{__CLR4_4_1cvzcvzlb90p882.R.inc(16715);
        __CLR4_4_1cvzcvzlb90p882.R.inc(16716);T cosDelta = delta.cos();
        __CLR4_4_1cvzcvzlb90p882.R.inc(16717);this.x = alpha.cos().multiply(cosDelta);
        __CLR4_4_1cvzcvzlb90p882.R.inc(16718);this.y = alpha.sin().multiply(cosDelta);
        __CLR4_4_1cvzcvzlb90p882.R.inc(16719);this.z = delta.sin();
    }finally{__CLR4_4_1cvzcvzlb90p882.R.flushNeeded();}}

    /** Multiplicative constructor
     * Build a vector from another one and a scale factor.
     * The vector built will be a * u
     * @param a scale factor
     * @param u base (unscaled) vector
     */
    public FieldVector3D(final T a, final FieldVector3D<T>u) {try{__CLR4_4_1cvzcvzlb90p882.R.inc(16720);
        __CLR4_4_1cvzcvzlb90p882.R.inc(16721);this.x = a.multiply(u.x);
        __CLR4_4_1cvzcvzlb90p882.R.inc(16722);this.y = a.multiply(u.y);
        __CLR4_4_1cvzcvzlb90p882.R.inc(16723);this.z = a.multiply(u.z);
    }finally{__CLR4_4_1cvzcvzlb90p882.R.flushNeeded();}}

    /** Multiplicative constructor
     * Build a vector from another one and a scale factor.
     * The vector built will be a * u
     * @param a scale factor
     * @param u base (unscaled) vector
     */
    public FieldVector3D(final T a, final Vector3D u) {try{__CLR4_4_1cvzcvzlb90p882.R.inc(16724);
        __CLR4_4_1cvzcvzlb90p882.R.inc(16725);this.x = a.multiply(u.getX());
        __CLR4_4_1cvzcvzlb90p882.R.inc(16726);this.y = a.multiply(u.getY());
        __CLR4_4_1cvzcvzlb90p882.R.inc(16727);this.z = a.multiply(u.getZ());
    }finally{__CLR4_4_1cvzcvzlb90p882.R.flushNeeded();}}

    /** Multiplicative constructor
     * Build a vector from another one and a scale factor.
     * The vector built will be a * u
     * @param a scale factor
     * @param u base (unscaled) vector
     */
    public FieldVector3D(final double a, final FieldVector3D<T> u) {try{__CLR4_4_1cvzcvzlb90p882.R.inc(16728);
        __CLR4_4_1cvzcvzlb90p882.R.inc(16729);this.x = u.x.multiply(a);
        __CLR4_4_1cvzcvzlb90p882.R.inc(16730);this.y = u.y.multiply(a);
        __CLR4_4_1cvzcvzlb90p882.R.inc(16731);this.z = u.z.multiply(a);
    }finally{__CLR4_4_1cvzcvzlb90p882.R.flushNeeded();}}

    /** Linear constructor
     * Build a vector from two other ones and corresponding scale factors.
     * The vector built will be a1 * u1 + a2 * u2
     * @param a1 first scale factor
     * @param u1 first base (unscaled) vector
     * @param a2 second scale factor
     * @param u2 second base (unscaled) vector
     */
    public FieldVector3D(final T a1, final FieldVector3D<T> u1,
                         final T a2, final FieldVector3D<T> u2) {try{__CLR4_4_1cvzcvzlb90p882.R.inc(16732);
        __CLR4_4_1cvzcvzlb90p882.R.inc(16733);final T prototype = a1;
        __CLR4_4_1cvzcvzlb90p882.R.inc(16734);this.x = prototype.linearCombination(a1, u1.getX(), a2, u2.getX());
        __CLR4_4_1cvzcvzlb90p882.R.inc(16735);this.y = prototype.linearCombination(a1, u1.getY(), a2, u2.getY());
        __CLR4_4_1cvzcvzlb90p882.R.inc(16736);this.z = prototype.linearCombination(a1, u1.getZ(), a2, u2.getZ());
    }finally{__CLR4_4_1cvzcvzlb90p882.R.flushNeeded();}}

    /** Linear constructor
     * Build a vector from two other ones and corresponding scale factors.
     * The vector built will be a1 * u1 + a2 * u2
     * @param a1 first scale factor
     * @param u1 first base (unscaled) vector
     * @param a2 second scale factor
     * @param u2 second base (unscaled) vector
     */
    public FieldVector3D(final T a1, final Vector3D u1,
                         final T a2, final Vector3D u2) {try{__CLR4_4_1cvzcvzlb90p882.R.inc(16737);
        __CLR4_4_1cvzcvzlb90p882.R.inc(16738);final T prototype = a1;
        __CLR4_4_1cvzcvzlb90p882.R.inc(16739);this.x = prototype.linearCombination(u1.getX(), a1, u2.getX(), a2);
        __CLR4_4_1cvzcvzlb90p882.R.inc(16740);this.y = prototype.linearCombination(u1.getY(), a1, u2.getY(), a2);
        __CLR4_4_1cvzcvzlb90p882.R.inc(16741);this.z = prototype.linearCombination(u1.getZ(), a1, u2.getZ(), a2);
    }finally{__CLR4_4_1cvzcvzlb90p882.R.flushNeeded();}}

    /** Linear constructor
     * Build a vector from two other ones and corresponding scale factors.
     * The vector built will be a1 * u1 + a2 * u2
     * @param a1 first scale factor
     * @param u1 first base (unscaled) vector
     * @param a2 second scale factor
     * @param u2 second base (unscaled) vector
     */
    public FieldVector3D(final double a1, final FieldVector3D<T> u1,
                         final double a2, final FieldVector3D<T> u2) {try{__CLR4_4_1cvzcvzlb90p882.R.inc(16742);
        __CLR4_4_1cvzcvzlb90p882.R.inc(16743);final T prototype = u1.getX();
        __CLR4_4_1cvzcvzlb90p882.R.inc(16744);this.x = prototype.linearCombination(a1, u1.getX(), a2, u2.getX());
        __CLR4_4_1cvzcvzlb90p882.R.inc(16745);this.y = prototype.linearCombination(a1, u1.getY(), a2, u2.getY());
        __CLR4_4_1cvzcvzlb90p882.R.inc(16746);this.z = prototype.linearCombination(a1, u1.getZ(), a2, u2.getZ());
    }finally{__CLR4_4_1cvzcvzlb90p882.R.flushNeeded();}}

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
    public FieldVector3D(final T a1, final FieldVector3D<T> u1,
                         final T a2, final FieldVector3D<T> u2,
                         final T a3, final FieldVector3D<T> u3) {try{__CLR4_4_1cvzcvzlb90p882.R.inc(16747);
        __CLR4_4_1cvzcvzlb90p882.R.inc(16748);final T prototype = a1;
        __CLR4_4_1cvzcvzlb90p882.R.inc(16749);this.x = prototype.linearCombination(a1, u1.getX(), a2, u2.getX(), a3, u3.getX());
        __CLR4_4_1cvzcvzlb90p882.R.inc(16750);this.y = prototype.linearCombination(a1, u1.getY(), a2, u2.getY(), a3, u3.getY());
        __CLR4_4_1cvzcvzlb90p882.R.inc(16751);this.z = prototype.linearCombination(a1, u1.getZ(), a2, u2.getZ(), a3, u3.getZ());
    }finally{__CLR4_4_1cvzcvzlb90p882.R.flushNeeded();}}

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
    public FieldVector3D(final T a1, final Vector3D u1,
                         final T a2, final Vector3D u2,
                         final T a3, final Vector3D u3) {try{__CLR4_4_1cvzcvzlb90p882.R.inc(16752);
        __CLR4_4_1cvzcvzlb90p882.R.inc(16753);final T prototype = a1;
        __CLR4_4_1cvzcvzlb90p882.R.inc(16754);this.x = prototype.linearCombination(u1.getX(), a1, u2.getX(), a2, u3.getX(), a3);
        __CLR4_4_1cvzcvzlb90p882.R.inc(16755);this.y = prototype.linearCombination(u1.getY(), a1, u2.getY(), a2, u3.getY(), a3);
        __CLR4_4_1cvzcvzlb90p882.R.inc(16756);this.z = prototype.linearCombination(u1.getZ(), a1, u2.getZ(), a2, u3.getZ(), a3);
    }finally{__CLR4_4_1cvzcvzlb90p882.R.flushNeeded();}}

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
    public FieldVector3D(final double a1, final FieldVector3D<T> u1,
                         final double a2, final FieldVector3D<T> u2,
                         final double a3, final FieldVector3D<T> u3) {try{__CLR4_4_1cvzcvzlb90p882.R.inc(16757);
        __CLR4_4_1cvzcvzlb90p882.R.inc(16758);final T prototype = u1.getX();
        __CLR4_4_1cvzcvzlb90p882.R.inc(16759);this.x = prototype.linearCombination(a1, u1.getX(), a2, u2.getX(), a3, u3.getX());
        __CLR4_4_1cvzcvzlb90p882.R.inc(16760);this.y = prototype.linearCombination(a1, u1.getY(), a2, u2.getY(), a3, u3.getY());
        __CLR4_4_1cvzcvzlb90p882.R.inc(16761);this.z = prototype.linearCombination(a1, u1.getZ(), a2, u2.getZ(), a3, u3.getZ());
    }finally{__CLR4_4_1cvzcvzlb90p882.R.flushNeeded();}}

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
    public FieldVector3D(final T a1, final FieldVector3D<T> u1,
                         final T a2, final FieldVector3D<T> u2,
                         final T a3, final FieldVector3D<T> u3,
                         final T a4, final FieldVector3D<T> u4) {try{__CLR4_4_1cvzcvzlb90p882.R.inc(16762);
        __CLR4_4_1cvzcvzlb90p882.R.inc(16763);final T prototype = a1;
        __CLR4_4_1cvzcvzlb90p882.R.inc(16764);this.x = prototype.linearCombination(a1, u1.getX(), a2, u2.getX(), a3, u3.getX(), a4, u4.getX());
        __CLR4_4_1cvzcvzlb90p882.R.inc(16765);this.y = prototype.linearCombination(a1, u1.getY(), a2, u2.getY(), a3, u3.getY(), a4, u4.getY());
        __CLR4_4_1cvzcvzlb90p882.R.inc(16766);this.z = prototype.linearCombination(a1, u1.getZ(), a2, u2.getZ(), a3, u3.getZ(), a4, u4.getZ());
    }finally{__CLR4_4_1cvzcvzlb90p882.R.flushNeeded();}}

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
    public FieldVector3D(final T a1, final Vector3D u1,
                         final T a2, final Vector3D u2,
                         final T a3, final Vector3D u3,
                         final T a4, final Vector3D u4) {try{__CLR4_4_1cvzcvzlb90p882.R.inc(16767);
        __CLR4_4_1cvzcvzlb90p882.R.inc(16768);final T prototype = a1;
        __CLR4_4_1cvzcvzlb90p882.R.inc(16769);this.x = prototype.linearCombination(u1.getX(), a1, u2.getX(), a2, u3.getX(), a3, u4.getX(), a4);
        __CLR4_4_1cvzcvzlb90p882.R.inc(16770);this.y = prototype.linearCombination(u1.getY(), a1, u2.getY(), a2, u3.getY(), a3, u4.getY(), a4);
        __CLR4_4_1cvzcvzlb90p882.R.inc(16771);this.z = prototype.linearCombination(u1.getZ(), a1, u2.getZ(), a2, u3.getZ(), a3, u4.getZ(), a4);
    }finally{__CLR4_4_1cvzcvzlb90p882.R.flushNeeded();}}

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
    public FieldVector3D(final double a1, final FieldVector3D<T> u1,
                         final double a2, final FieldVector3D<T> u2,
                         final double a3, final FieldVector3D<T> u3,
                         final double a4, final FieldVector3D<T> u4) {try{__CLR4_4_1cvzcvzlb90p882.R.inc(16772);
        __CLR4_4_1cvzcvzlb90p882.R.inc(16773);final T prototype = u1.getX();
        __CLR4_4_1cvzcvzlb90p882.R.inc(16774);this.x = prototype.linearCombination(a1, u1.getX(), a2, u2.getX(), a3, u3.getX(), a4, u4.getX());
        __CLR4_4_1cvzcvzlb90p882.R.inc(16775);this.y = prototype.linearCombination(a1, u1.getY(), a2, u2.getY(), a3, u3.getY(), a4, u4.getY());
        __CLR4_4_1cvzcvzlb90p882.R.inc(16776);this.z = prototype.linearCombination(a1, u1.getZ(), a2, u2.getZ(), a3, u3.getZ(), a4, u4.getZ());
    }finally{__CLR4_4_1cvzcvzlb90p882.R.flushNeeded();}}

    /** Get the abscissa of the vector.
     * @return abscissa of the vector
     * @see #FieldVector3D(RealFieldElement, RealFieldElement, RealFieldElement)
     */
    public T getX() {try{__CLR4_4_1cvzcvzlb90p882.R.inc(16777);
        __CLR4_4_1cvzcvzlb90p882.R.inc(16778);return x;
    }finally{__CLR4_4_1cvzcvzlb90p882.R.flushNeeded();}}

    /** Get the ordinate of the vector.
     * @return ordinate of the vector
     * @see #FieldVector3D(RealFieldElement, RealFieldElement, RealFieldElement)
     */
    public T getY() {try{__CLR4_4_1cvzcvzlb90p882.R.inc(16779);
        __CLR4_4_1cvzcvzlb90p882.R.inc(16780);return y;
    }finally{__CLR4_4_1cvzcvzlb90p882.R.flushNeeded();}}

    /** Get the height of the vector.
     * @return height of the vector
     * @see #FieldVector3D(RealFieldElement, RealFieldElement, RealFieldElement)
     */
    public T getZ() {try{__CLR4_4_1cvzcvzlb90p882.R.inc(16781);
        __CLR4_4_1cvzcvzlb90p882.R.inc(16782);return z;
    }finally{__CLR4_4_1cvzcvzlb90p882.R.flushNeeded();}}

    /** Get the vector coordinates as a dimension 3 array.
     * @return vector coordinates
     * @see #FieldVector3D(RealFieldElement[])
     */
    public T[] toArray() {try{__CLR4_4_1cvzcvzlb90p882.R.inc(16783);
        __CLR4_4_1cvzcvzlb90p882.R.inc(16784);final T[] array = MathArrays.buildArray(x.getField(), 3);
        __CLR4_4_1cvzcvzlb90p882.R.inc(16785);array[0] = x;
        __CLR4_4_1cvzcvzlb90p882.R.inc(16786);array[1] = y;
        __CLR4_4_1cvzcvzlb90p882.R.inc(16787);array[2] = z;
        __CLR4_4_1cvzcvzlb90p882.R.inc(16788);return array;
    }finally{__CLR4_4_1cvzcvzlb90p882.R.flushNeeded();}}

    /** Convert to a constant vector without derivatives.
     * @return a constant vector
     */
    public Vector3D toVector3D() {try{__CLR4_4_1cvzcvzlb90p882.R.inc(16789);
        __CLR4_4_1cvzcvzlb90p882.R.inc(16790);return new Vector3D(x.getReal(), y.getReal(), z.getReal());
    }finally{__CLR4_4_1cvzcvzlb90p882.R.flushNeeded();}}

    /** Get the L<sub>1</sub> norm for the vector.
     * @return L<sub>1</sub> norm for the vector
     */
    public T getNorm1() {try{__CLR4_4_1cvzcvzlb90p882.R.inc(16791);
        __CLR4_4_1cvzcvzlb90p882.R.inc(16792);return x.abs().add(y.abs()).add(z.abs());
    }finally{__CLR4_4_1cvzcvzlb90p882.R.flushNeeded();}}

    /** Get the L<sub>2</sub> norm for the vector.
     * @return Euclidean norm for the vector
     */
    public T getNorm() {try{__CLR4_4_1cvzcvzlb90p882.R.inc(16793);
        // there are no cancellation problems here, so we use the straightforward formula
        __CLR4_4_1cvzcvzlb90p882.R.inc(16794);return x.multiply(x).add(y.multiply(y)).add(z.multiply(z)).sqrt();
    }finally{__CLR4_4_1cvzcvzlb90p882.R.flushNeeded();}}

    /** Get the square of the norm for the vector.
     * @return square of the Euclidean norm for the vector
     */
    public T getNormSq() {try{__CLR4_4_1cvzcvzlb90p882.R.inc(16795);
        // there are no cancellation problems here, so we use the straightforward formula
        __CLR4_4_1cvzcvzlb90p882.R.inc(16796);return x.multiply(x).add(y.multiply(y)).add(z.multiply(z));
    }finally{__CLR4_4_1cvzcvzlb90p882.R.flushNeeded();}}

    /** Get the L<sub>&infin;</sub> norm for the vector.
     * @return L<sub>&infin;</sub> norm for the vector
     */
    public T getNormInf() {try{__CLR4_4_1cvzcvzlb90p882.R.inc(16797);
        __CLR4_4_1cvzcvzlb90p882.R.inc(16798);final T xAbs = x.abs();
        __CLR4_4_1cvzcvzlb90p882.R.inc(16799);final T yAbs = y.abs();
        __CLR4_4_1cvzcvzlb90p882.R.inc(16800);final T zAbs = z.abs();
        __CLR4_4_1cvzcvzlb90p882.R.inc(16801);if ((((xAbs.getReal() <= yAbs.getReal())&&(__CLR4_4_1cvzcvzlb90p882.R.iget(16802)!=0|true))||(__CLR4_4_1cvzcvzlb90p882.R.iget(16803)==0&false))) {{
            __CLR4_4_1cvzcvzlb90p882.R.inc(16804);if ((((yAbs.getReal() <= zAbs.getReal())&&(__CLR4_4_1cvzcvzlb90p882.R.iget(16805)!=0|true))||(__CLR4_4_1cvzcvzlb90p882.R.iget(16806)==0&false))) {{
                __CLR4_4_1cvzcvzlb90p882.R.inc(16807);return zAbs;
            } }else {{
                __CLR4_4_1cvzcvzlb90p882.R.inc(16808);return yAbs;
            }
        }} }else {{
            __CLR4_4_1cvzcvzlb90p882.R.inc(16809);if ((((xAbs.getReal() <= zAbs.getReal())&&(__CLR4_4_1cvzcvzlb90p882.R.iget(16810)!=0|true))||(__CLR4_4_1cvzcvzlb90p882.R.iget(16811)==0&false))) {{
                __CLR4_4_1cvzcvzlb90p882.R.inc(16812);return zAbs;
            } }else {{
                __CLR4_4_1cvzcvzlb90p882.R.inc(16813);return xAbs;
            }
        }}
    }}finally{__CLR4_4_1cvzcvzlb90p882.R.flushNeeded();}}

    /** Get the azimuth of the vector.
     * @return azimuth (&alpha;) of the vector, between -&pi; and +&pi;
     * @see #FieldVector3D(RealFieldElement, RealFieldElement)
     */
    public T getAlpha() {try{__CLR4_4_1cvzcvzlb90p882.R.inc(16814);
        __CLR4_4_1cvzcvzlb90p882.R.inc(16815);return y.atan2(x);
    }finally{__CLR4_4_1cvzcvzlb90p882.R.flushNeeded();}}

    /** Get the elevation of the vector.
     * @return elevation (&delta;) of the vector, between -&pi;/2 and +&pi;/2
     * @see #FieldVector3D(RealFieldElement, RealFieldElement)
     */
    public T getDelta() {try{__CLR4_4_1cvzcvzlb90p882.R.inc(16816);
        __CLR4_4_1cvzcvzlb90p882.R.inc(16817);return z.divide(getNorm()).asin();
    }finally{__CLR4_4_1cvzcvzlb90p882.R.flushNeeded();}}

    /** Add a vector to the instance.
     * @param v vector to add
     * @return a new vector
     */
    public FieldVector3D<T> add(final FieldVector3D<T> v) {try{__CLR4_4_1cvzcvzlb90p882.R.inc(16818);
        __CLR4_4_1cvzcvzlb90p882.R.inc(16819);return new FieldVector3D<T>(x.add(v.x), y.add(v.y), z.add(v.z));
    }finally{__CLR4_4_1cvzcvzlb90p882.R.flushNeeded();}}

    /** Add a vector to the instance.
     * @param v vector to add
     * @return a new vector
     */
    public FieldVector3D<T> add(final Vector3D v) {try{__CLR4_4_1cvzcvzlb90p882.R.inc(16820);
        __CLR4_4_1cvzcvzlb90p882.R.inc(16821);return new FieldVector3D<T>(x.add(v.getX()), y.add(v.getY()), z.add(v.getZ()));
    }finally{__CLR4_4_1cvzcvzlb90p882.R.flushNeeded();}}

    /** Add a scaled vector to the instance.
     * @param factor scale factor to apply to v before adding it
     * @param v vector to add
     * @return a new vector
     */
    public FieldVector3D<T> add(final T factor, final FieldVector3D<T> v) {try{__CLR4_4_1cvzcvzlb90p882.R.inc(16822);
        __CLR4_4_1cvzcvzlb90p882.R.inc(16823);return new FieldVector3D<T>(x.getField().getOne(), this, factor, v);
    }finally{__CLR4_4_1cvzcvzlb90p882.R.flushNeeded();}}

    /** Add a scaled vector to the instance.
     * @param factor scale factor to apply to v before adding it
     * @param v vector to add
     * @return a new vector
     */
    public FieldVector3D<T> add(final T factor, final Vector3D v) {try{__CLR4_4_1cvzcvzlb90p882.R.inc(16824);
        __CLR4_4_1cvzcvzlb90p882.R.inc(16825);return new FieldVector3D<T>(x.add(factor.multiply(v.getX())),
                                    y.add(factor.multiply(v.getY())),
                                    z.add(factor.multiply(v.getZ())));
    }finally{__CLR4_4_1cvzcvzlb90p882.R.flushNeeded();}}

    /** Add a scaled vector to the instance.
     * @param factor scale factor to apply to v before adding it
     * @param v vector to add
     * @return a new vector
     */
    public FieldVector3D<T> add(final double factor, final FieldVector3D<T> v) {try{__CLR4_4_1cvzcvzlb90p882.R.inc(16826);
        __CLR4_4_1cvzcvzlb90p882.R.inc(16827);return new FieldVector3D<T>(1.0, this, factor, v);
    }finally{__CLR4_4_1cvzcvzlb90p882.R.flushNeeded();}}

    /** Add a scaled vector to the instance.
     * @param factor scale factor to apply to v before adding it
     * @param v vector to add
     * @return a new vector
     */
    public FieldVector3D<T> add(final double factor, final Vector3D v) {try{__CLR4_4_1cvzcvzlb90p882.R.inc(16828);
        __CLR4_4_1cvzcvzlb90p882.R.inc(16829);return new FieldVector3D<T>(x.add(factor * v.getX()),
                                    y.add(factor * v.getY()),
                                    z.add(factor * v.getZ()));
    }finally{__CLR4_4_1cvzcvzlb90p882.R.flushNeeded();}}

    /** Subtract a vector from the instance.
     * @param v vector to subtract
     * @return a new vector
     */
    public FieldVector3D<T> subtract(final FieldVector3D<T> v) {try{__CLR4_4_1cvzcvzlb90p882.R.inc(16830);
        __CLR4_4_1cvzcvzlb90p882.R.inc(16831);return new FieldVector3D<T>(x.subtract(v.x), y.subtract(v.y), z.subtract(v.z));
    }finally{__CLR4_4_1cvzcvzlb90p882.R.flushNeeded();}}

    /** Subtract a vector from the instance.
     * @param v vector to subtract
     * @return a new vector
     */
    public FieldVector3D<T> subtract(final Vector3D v) {try{__CLR4_4_1cvzcvzlb90p882.R.inc(16832);
        __CLR4_4_1cvzcvzlb90p882.R.inc(16833);return new FieldVector3D<T>(x.subtract(v.getX()), y.subtract(v.getY()), z.subtract(v.getZ()));
    }finally{__CLR4_4_1cvzcvzlb90p882.R.flushNeeded();}}

    /** Subtract a scaled vector from the instance.
     * @param factor scale factor to apply to v before subtracting it
     * @param v vector to subtract
     * @return a new vector
     */
    public FieldVector3D<T> subtract(final T factor, final FieldVector3D<T> v) {try{__CLR4_4_1cvzcvzlb90p882.R.inc(16834);
        __CLR4_4_1cvzcvzlb90p882.R.inc(16835);return new FieldVector3D<T>(x.getField().getOne(), this, factor.negate(), v);
    }finally{__CLR4_4_1cvzcvzlb90p882.R.flushNeeded();}}

    /** Subtract a scaled vector from the instance.
     * @param factor scale factor to apply to v before subtracting it
     * @param v vector to subtract
     * @return a new vector
     */
    public FieldVector3D<T> subtract(final T factor, final Vector3D v) {try{__CLR4_4_1cvzcvzlb90p882.R.inc(16836);
        __CLR4_4_1cvzcvzlb90p882.R.inc(16837);return new FieldVector3D<T>(x.subtract(factor.multiply(v.getX())),
                                    y.subtract(factor.multiply(v.getY())),
                                    z.subtract(factor.multiply(v.getZ())));
    }finally{__CLR4_4_1cvzcvzlb90p882.R.flushNeeded();}}

    /** Subtract a scaled vector from the instance.
     * @param factor scale factor to apply to v before subtracting it
     * @param v vector to subtract
     * @return a new vector
     */
    public FieldVector3D<T> subtract(final double factor, final FieldVector3D<T> v) {try{__CLR4_4_1cvzcvzlb90p882.R.inc(16838);
        __CLR4_4_1cvzcvzlb90p882.R.inc(16839);return new FieldVector3D<T>(1.0, this, -factor, v);
    }finally{__CLR4_4_1cvzcvzlb90p882.R.flushNeeded();}}

    /** Subtract a scaled vector from the instance.
     * @param factor scale factor to apply to v before subtracting it
     * @param v vector to subtract
     * @return a new vector
     */
    public FieldVector3D<T> subtract(final double factor, final Vector3D v) {try{__CLR4_4_1cvzcvzlb90p882.R.inc(16840);
        __CLR4_4_1cvzcvzlb90p882.R.inc(16841);return new FieldVector3D<T>(x.subtract(factor * v.getX()),
                                    y.subtract(factor * v.getY()),
                                    z.subtract(factor * v.getZ()));
    }finally{__CLR4_4_1cvzcvzlb90p882.R.flushNeeded();}}

    /** Get a normalized vector aligned with the instance.
     * @return a new normalized vector
     * @exception MathArithmeticException if the norm is zero
     */
    public FieldVector3D<T> normalize() throws MathArithmeticException {try{__CLR4_4_1cvzcvzlb90p882.R.inc(16842);
        __CLR4_4_1cvzcvzlb90p882.R.inc(16843);final T s = getNorm();
        __CLR4_4_1cvzcvzlb90p882.R.inc(16844);if ((((s.getReal() == 0)&&(__CLR4_4_1cvzcvzlb90p882.R.iget(16845)!=0|true))||(__CLR4_4_1cvzcvzlb90p882.R.iget(16846)==0&false))) {{
            __CLR4_4_1cvzcvzlb90p882.R.inc(16847);throw new MathArithmeticException(LocalizedFormats.CANNOT_NORMALIZE_A_ZERO_NORM_VECTOR);
        }
        }__CLR4_4_1cvzcvzlb90p882.R.inc(16848);return scalarMultiply(s.reciprocal());
    }finally{__CLR4_4_1cvzcvzlb90p882.R.flushNeeded();}}

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
    public FieldVector3D<T> orthogonal() throws MathArithmeticException {try{__CLR4_4_1cvzcvzlb90p882.R.inc(16849);

        __CLR4_4_1cvzcvzlb90p882.R.inc(16850);final double threshold = 0.6 * getNorm().getReal();
        __CLR4_4_1cvzcvzlb90p882.R.inc(16851);if ((((threshold == 0)&&(__CLR4_4_1cvzcvzlb90p882.R.iget(16852)!=0|true))||(__CLR4_4_1cvzcvzlb90p882.R.iget(16853)==0&false))) {{
            __CLR4_4_1cvzcvzlb90p882.R.inc(16854);throw new MathArithmeticException(LocalizedFormats.ZERO_NORM);
        }

        }__CLR4_4_1cvzcvzlb90p882.R.inc(16855);if ((((FastMath.abs(x.getReal()) <= threshold)&&(__CLR4_4_1cvzcvzlb90p882.R.iget(16856)!=0|true))||(__CLR4_4_1cvzcvzlb90p882.R.iget(16857)==0&false))) {{
            __CLR4_4_1cvzcvzlb90p882.R.inc(16858);final T inverse  = y.multiply(y).add(z.multiply(z)).sqrt().reciprocal();
            __CLR4_4_1cvzcvzlb90p882.R.inc(16859);return new FieldVector3D<T>(inverse.getField().getZero(), inverse.multiply(z), inverse.multiply(y).negate());
        } }else {__CLR4_4_1cvzcvzlb90p882.R.inc(16860);if ((((FastMath.abs(y.getReal()) <= threshold)&&(__CLR4_4_1cvzcvzlb90p882.R.iget(16861)!=0|true))||(__CLR4_4_1cvzcvzlb90p882.R.iget(16862)==0&false))) {{
            __CLR4_4_1cvzcvzlb90p882.R.inc(16863);final T inverse  = x.multiply(x).add(z.multiply(z)).sqrt().reciprocal();
            __CLR4_4_1cvzcvzlb90p882.R.inc(16864);return new FieldVector3D<T>(inverse.multiply(z).negate(), inverse.getField().getZero(), inverse.multiply(x));
        } }else {{
            __CLR4_4_1cvzcvzlb90p882.R.inc(16865);final T inverse  = x.multiply(x).add(y.multiply(y)).sqrt().reciprocal();
            __CLR4_4_1cvzcvzlb90p882.R.inc(16866);return new FieldVector3D<T>(inverse.multiply(y), inverse.multiply(x).negate(), inverse.getField().getZero());
        }

    }}}finally{__CLR4_4_1cvzcvzlb90p882.R.flushNeeded();}}

    /** Compute the angular separation between two vectors.
     * <p>This method computes the angular separation between two
     * vectors using the dot product for well separated vectors and the
     * cross product for almost aligned vectors. This allows to have a
     * good accuracy in all cases, even for vectors very close to each
     * other.</p>
     * @param v1 first vector
     * @param v2 second vector
     * @param <T> the type of the field elements
     * @return angular separation between v1 and v2
     * @exception MathArithmeticException if either vector has a null norm
     */
    public static <T extends RealFieldElement<T>> T angle(final FieldVector3D<T> v1, final FieldVector3D<T> v2)
        throws MathArithmeticException {try{__CLR4_4_1cvzcvzlb90p882.R.inc(16867);

        __CLR4_4_1cvzcvzlb90p882.R.inc(16868);final T normProduct = v1.getNorm().multiply(v2.getNorm());
        __CLR4_4_1cvzcvzlb90p882.R.inc(16869);if ((((normProduct.getReal() == 0)&&(__CLR4_4_1cvzcvzlb90p882.R.iget(16870)!=0|true))||(__CLR4_4_1cvzcvzlb90p882.R.iget(16871)==0&false))) {{
            __CLR4_4_1cvzcvzlb90p882.R.inc(16872);throw new MathArithmeticException(LocalizedFormats.ZERO_NORM);
        }

        }__CLR4_4_1cvzcvzlb90p882.R.inc(16873);final T dot = dotProduct(v1, v2);
        __CLR4_4_1cvzcvzlb90p882.R.inc(16874);final double threshold = normProduct.getReal() * 0.9999;
        __CLR4_4_1cvzcvzlb90p882.R.inc(16875);if (((((dot.getReal() < -threshold) || (dot.getReal() > threshold))&&(__CLR4_4_1cvzcvzlb90p882.R.iget(16876)!=0|true))||(__CLR4_4_1cvzcvzlb90p882.R.iget(16877)==0&false))) {{
            // the vectors are almost aligned, compute using the sine
            __CLR4_4_1cvzcvzlb90p882.R.inc(16878);FieldVector3D<T> v3 = crossProduct(v1, v2);
            __CLR4_4_1cvzcvzlb90p882.R.inc(16879);if ((((dot.getReal() >= 0)&&(__CLR4_4_1cvzcvzlb90p882.R.iget(16880)!=0|true))||(__CLR4_4_1cvzcvzlb90p882.R.iget(16881)==0&false))) {{
                __CLR4_4_1cvzcvzlb90p882.R.inc(16882);return v3.getNorm().divide(normProduct).asin();
            }
            }__CLR4_4_1cvzcvzlb90p882.R.inc(16883);return v3.getNorm().divide(normProduct).asin().subtract(FastMath.PI).negate();
        }

        // the vectors are sufficiently separated to use the cosine
        }__CLR4_4_1cvzcvzlb90p882.R.inc(16884);return dot.divide(normProduct).acos();

    }finally{__CLR4_4_1cvzcvzlb90p882.R.flushNeeded();}}

    /** Compute the angular separation between two vectors.
     * <p>This method computes the angular separation between two
     * vectors using the dot product for well separated vectors and the
     * cross product for almost aligned vectors. This allows to have a
     * good accuracy in all cases, even for vectors very close to each
     * other.</p>
     * @param v1 first vector
     * @param v2 second vector
     * @param <T> the type of the field elements
     * @return angular separation between v1 and v2
     * @exception MathArithmeticException if either vector has a null norm
     */
    public static <T extends RealFieldElement<T>> T angle(final FieldVector3D<T> v1, final Vector3D v2)
        throws MathArithmeticException {try{__CLR4_4_1cvzcvzlb90p882.R.inc(16885);

        __CLR4_4_1cvzcvzlb90p882.R.inc(16886);final T normProduct = v1.getNorm().multiply(v2.getNorm());
        __CLR4_4_1cvzcvzlb90p882.R.inc(16887);if ((((normProduct.getReal() == 0)&&(__CLR4_4_1cvzcvzlb90p882.R.iget(16888)!=0|true))||(__CLR4_4_1cvzcvzlb90p882.R.iget(16889)==0&false))) {{
            __CLR4_4_1cvzcvzlb90p882.R.inc(16890);throw new MathArithmeticException(LocalizedFormats.ZERO_NORM);
        }

        }__CLR4_4_1cvzcvzlb90p882.R.inc(16891);final T dot = dotProduct(v1, v2);
        __CLR4_4_1cvzcvzlb90p882.R.inc(16892);final double threshold = normProduct.getReal() * 0.9999;
        __CLR4_4_1cvzcvzlb90p882.R.inc(16893);if (((((dot.getReal() < -threshold) || (dot.getReal() > threshold))&&(__CLR4_4_1cvzcvzlb90p882.R.iget(16894)!=0|true))||(__CLR4_4_1cvzcvzlb90p882.R.iget(16895)==0&false))) {{
            // the vectors are almost aligned, compute using the sine
            __CLR4_4_1cvzcvzlb90p882.R.inc(16896);FieldVector3D<T> v3 = crossProduct(v1, v2);
            __CLR4_4_1cvzcvzlb90p882.R.inc(16897);if ((((dot.getReal() >= 0)&&(__CLR4_4_1cvzcvzlb90p882.R.iget(16898)!=0|true))||(__CLR4_4_1cvzcvzlb90p882.R.iget(16899)==0&false))) {{
                __CLR4_4_1cvzcvzlb90p882.R.inc(16900);return v3.getNorm().divide(normProduct).asin();
            }
            }__CLR4_4_1cvzcvzlb90p882.R.inc(16901);return v3.getNorm().divide(normProduct).asin().subtract(FastMath.PI).negate();
        }

        // the vectors are sufficiently separated to use the cosine
        }__CLR4_4_1cvzcvzlb90p882.R.inc(16902);return dot.divide(normProduct).acos();

    }finally{__CLR4_4_1cvzcvzlb90p882.R.flushNeeded();}}

    /** Compute the angular separation between two vectors.
     * <p>This method computes the angular separation between two
     * vectors using the dot product for well separated vectors and the
     * cross product for almost aligned vectors. This allows to have a
     * good accuracy in all cases, even for vectors very close to each
     * other.</p>
     * @param v1 first vector
     * @param v2 second vector
     * @param <T> the type of the field elements
     * @return angular separation between v1 and v2
     * @exception MathArithmeticException if either vector has a null norm
     */
    public static <T extends RealFieldElement<T>> T angle(final Vector3D v1, final FieldVector3D<T> v2)
        throws MathArithmeticException {try{__CLR4_4_1cvzcvzlb90p882.R.inc(16903);
        __CLR4_4_1cvzcvzlb90p882.R.inc(16904);return angle(v2, v1);
    }finally{__CLR4_4_1cvzcvzlb90p882.R.flushNeeded();}}

    /** Get the opposite of the instance.
     * @return a new vector which is opposite to the instance
     */
    public FieldVector3D<T> negate() {try{__CLR4_4_1cvzcvzlb90p882.R.inc(16905);
        __CLR4_4_1cvzcvzlb90p882.R.inc(16906);return new FieldVector3D<T>(x.negate(), y.negate(), z.negate());
    }finally{__CLR4_4_1cvzcvzlb90p882.R.flushNeeded();}}

    /** Multiply the instance by a scalar.
     * @param a scalar
     * @return a new vector
     */
    public FieldVector3D<T> scalarMultiply(final T a) {try{__CLR4_4_1cvzcvzlb90p882.R.inc(16907);
        __CLR4_4_1cvzcvzlb90p882.R.inc(16908);return new FieldVector3D<T>(x.multiply(a), y.multiply(a), z.multiply(a));
    }finally{__CLR4_4_1cvzcvzlb90p882.R.flushNeeded();}}

    /** Multiply the instance by a scalar.
     * @param a scalar
     * @return a new vector
     */
    public FieldVector3D<T> scalarMultiply(final double a) {try{__CLR4_4_1cvzcvzlb90p882.R.inc(16909);
        __CLR4_4_1cvzcvzlb90p882.R.inc(16910);return new FieldVector3D<T>(x.multiply(a), y.multiply(a), z.multiply(a));
    }finally{__CLR4_4_1cvzcvzlb90p882.R.flushNeeded();}}

    /**
     * Returns true if any coordinate of this vector is NaN; false otherwise
     * @return  true if any coordinate of this vector is NaN; false otherwise
     */
    public boolean isNaN() {try{__CLR4_4_1cvzcvzlb90p882.R.inc(16911);
        __CLR4_4_1cvzcvzlb90p882.R.inc(16912);return Double.isNaN(x.getReal()) || Double.isNaN(y.getReal()) || Double.isNaN(z.getReal());
    }finally{__CLR4_4_1cvzcvzlb90p882.R.flushNeeded();}}

    /**
     * Returns true if any coordinate of this vector is infinite and none are NaN;
     * false otherwise
     * @return  true if any coordinate of this vector is infinite and none are NaN;
     * false otherwise
     */
    public boolean isInfinite() {try{__CLR4_4_1cvzcvzlb90p882.R.inc(16913);
        __CLR4_4_1cvzcvzlb90p882.R.inc(16914);return !isNaN() && (Double.isInfinite(x.getReal()) || Double.isInfinite(y.getReal()) || Double.isInfinite(z.getReal()));
    }finally{__CLR4_4_1cvzcvzlb90p882.R.flushNeeded();}}

    /**
     * Test for the equality of two 3D vectors.
     * <p>
     * If all coordinates of two 3D vectors are exactly the same, and none of their
     * {@link RealFieldElement#getReal() real part} are <code>NaN</code>, the
     * two 3D vectors are considered to be equal.
     * </p>
     * <p>
     * <code>NaN</code> coordinates are considered to affect globally the vector
     * and be equals to each other - i.e, if either (or all) real part of the
     * coordinates of the 3D vector are <code>NaN</code>, the 3D vector is <code>NaN</code>.
     * </p>
     *
     * @param other Object to test for equality to this
     * @return true if two 3D vector objects are equal, false if
     *         object is null, not an instance of Vector3D, or
     *         not equal to this Vector3D instance
     *
     */
    @Override
    public boolean equals(Object other) {try{__CLR4_4_1cvzcvzlb90p882.R.inc(16915);

        __CLR4_4_1cvzcvzlb90p882.R.inc(16916);if ((((this == other)&&(__CLR4_4_1cvzcvzlb90p882.R.iget(16917)!=0|true))||(__CLR4_4_1cvzcvzlb90p882.R.iget(16918)==0&false))) {{
            __CLR4_4_1cvzcvzlb90p882.R.inc(16919);return true;
        }

        }__CLR4_4_1cvzcvzlb90p882.R.inc(16920);if ((((other instanceof FieldVector3D)&&(__CLR4_4_1cvzcvzlb90p882.R.iget(16921)!=0|true))||(__CLR4_4_1cvzcvzlb90p882.R.iget(16922)==0&false))) {{
            __CLR4_4_1cvzcvzlb90p882.R.inc(16923);@SuppressWarnings("unchecked")
            final FieldVector3D<T> rhs = (FieldVector3D<T>) other;
            __CLR4_4_1cvzcvzlb90p882.R.inc(16924);if ((((rhs.isNaN())&&(__CLR4_4_1cvzcvzlb90p882.R.iget(16925)!=0|true))||(__CLR4_4_1cvzcvzlb90p882.R.iget(16926)==0&false))) {{
                __CLR4_4_1cvzcvzlb90p882.R.inc(16927);return this.isNaN();
            }

            }__CLR4_4_1cvzcvzlb90p882.R.inc(16928);return x.equals(rhs.x) && y.equals(rhs.y) && z.equals(rhs.z);

        }
        }__CLR4_4_1cvzcvzlb90p882.R.inc(16929);return false;
    }finally{__CLR4_4_1cvzcvzlb90p882.R.flushNeeded();}}

    /**
     * Get a hashCode for the 3D vector.
     * <p>
     * All NaN values have the same hash code.</p>
     *
     * @return a hash code value for this object
     */
    @Override
    public int hashCode() {try{__CLR4_4_1cvzcvzlb90p882.R.inc(16930);
        __CLR4_4_1cvzcvzlb90p882.R.inc(16931);if ((((isNaN())&&(__CLR4_4_1cvzcvzlb90p882.R.iget(16932)!=0|true))||(__CLR4_4_1cvzcvzlb90p882.R.iget(16933)==0&false))) {{
            __CLR4_4_1cvzcvzlb90p882.R.inc(16934);return 409;
        }
        }__CLR4_4_1cvzcvzlb90p882.R.inc(16935);return 311 * (107 * x.hashCode() + 83 * y.hashCode() +  z.hashCode());
    }finally{__CLR4_4_1cvzcvzlb90p882.R.flushNeeded();}}

    /** Compute the dot-product of the instance and another vector.
     * <p>
     * The implementation uses specific multiplication and addition
     * algorithms to preserve accuracy and reduce cancellation effects.
     * It should be very accurate even for nearly orthogonal vectors.
     * </p>
     * @see MathArrays#linearCombination(double, double, double, double, double, double)
     * @param v second vector
     * @return the dot product this.v
     */
    public T dotProduct(final FieldVector3D<T> v) {try{__CLR4_4_1cvzcvzlb90p882.R.inc(16936);
        __CLR4_4_1cvzcvzlb90p882.R.inc(16937);return x.linearCombination(x, v.x, y, v.y, z, v.z);
    }finally{__CLR4_4_1cvzcvzlb90p882.R.flushNeeded();}}

    /** Compute the dot-product of the instance and another vector.
     * <p>
     * The implementation uses specific multiplication and addition
     * algorithms to preserve accuracy and reduce cancellation effects.
     * It should be very accurate even for nearly orthogonal vectors.
     * </p>
     * @see MathArrays#linearCombination(double, double, double, double, double, double)
     * @param v second vector
     * @return the dot product this.v
     */
    public T dotProduct(final Vector3D v) {try{__CLR4_4_1cvzcvzlb90p882.R.inc(16938);
        __CLR4_4_1cvzcvzlb90p882.R.inc(16939);return x.linearCombination(v.getX(), x, v.getY(), y, v.getZ(), z);
    }finally{__CLR4_4_1cvzcvzlb90p882.R.flushNeeded();}}

    /** Compute the cross-product of the instance with another vector.
     * @param v other vector
     * @return the cross product this ^ v as a new Vector3D
     */
    public FieldVector3D<T> crossProduct(final FieldVector3D<T> v) {try{__CLR4_4_1cvzcvzlb90p882.R.inc(16940);
        __CLR4_4_1cvzcvzlb90p882.R.inc(16941);return new FieldVector3D<T>(x.linearCombination(y, v.z, z.negate(), v.y),
                                    y.linearCombination(z, v.x, x.negate(), v.z),
                                    z.linearCombination(x, v.y, y.negate(), v.x));
    }finally{__CLR4_4_1cvzcvzlb90p882.R.flushNeeded();}}

    /** Compute the cross-product of the instance with another vector.
     * @param v other vector
     * @return the cross product this ^ v as a new Vector3D
     */
    public FieldVector3D<T> crossProduct(final Vector3D v) {try{__CLR4_4_1cvzcvzlb90p882.R.inc(16942);
        __CLR4_4_1cvzcvzlb90p882.R.inc(16943);return new FieldVector3D<T>(x.linearCombination(v.getZ(), y, -v.getY(), z),
                                    y.linearCombination(v.getX(), z, -v.getZ(), x),
                                    z.linearCombination(v.getY(), x, -v.getX(), y));
    }finally{__CLR4_4_1cvzcvzlb90p882.R.flushNeeded();}}

    /** Compute the distance between the instance and another vector according to the L<sub>1</sub> norm.
     * <p>Calling this method is equivalent to calling:
     * <code>q.subtract(p).getNorm1()</code> except that no intermediate
     * vector is built</p>
     * @param v second vector
     * @return the distance between the instance and p according to the L<sub>1</sub> norm
     */
    public T distance1(final FieldVector3D<T> v) {try{__CLR4_4_1cvzcvzlb90p882.R.inc(16944);
        __CLR4_4_1cvzcvzlb90p882.R.inc(16945);final T dx = v.x.subtract(x).abs();
        __CLR4_4_1cvzcvzlb90p882.R.inc(16946);final T dy = v.y.subtract(y).abs();
        __CLR4_4_1cvzcvzlb90p882.R.inc(16947);final T dz = v.z.subtract(z).abs();
        __CLR4_4_1cvzcvzlb90p882.R.inc(16948);return dx.add(dy).add(dz);
    }finally{__CLR4_4_1cvzcvzlb90p882.R.flushNeeded();}}

    /** Compute the distance between the instance and another vector according to the L<sub>1</sub> norm.
     * <p>Calling this method is equivalent to calling:
     * <code>q.subtract(p).getNorm1()</code> except that no intermediate
     * vector is built</p>
     * @param v second vector
     * @return the distance between the instance and p according to the L<sub>1</sub> norm
     */
    public T distance1(final Vector3D v) {try{__CLR4_4_1cvzcvzlb90p882.R.inc(16949);
        __CLR4_4_1cvzcvzlb90p882.R.inc(16950);final T dx = x.subtract(v.getX()).abs();
        __CLR4_4_1cvzcvzlb90p882.R.inc(16951);final T dy = y.subtract(v.getY()).abs();
        __CLR4_4_1cvzcvzlb90p882.R.inc(16952);final T dz = z.subtract(v.getZ()).abs();
        __CLR4_4_1cvzcvzlb90p882.R.inc(16953);return dx.add(dy).add(dz);
    }finally{__CLR4_4_1cvzcvzlb90p882.R.flushNeeded();}}

    /** Compute the distance between the instance and another vector according to the L<sub>2</sub> norm.
     * <p>Calling this method is equivalent to calling:
     * <code>q.subtract(p).getNorm()</code> except that no intermediate
     * vector is built</p>
     * @param v second vector
     * @return the distance between the instance and p according to the L<sub>2</sub> norm
     */
    public T distance(final FieldVector3D<T> v) {try{__CLR4_4_1cvzcvzlb90p882.R.inc(16954);
        __CLR4_4_1cvzcvzlb90p882.R.inc(16955);final T dx = v.x.subtract(x);
        __CLR4_4_1cvzcvzlb90p882.R.inc(16956);final T dy = v.y.subtract(y);
        __CLR4_4_1cvzcvzlb90p882.R.inc(16957);final T dz = v.z.subtract(z);
        __CLR4_4_1cvzcvzlb90p882.R.inc(16958);return dx.multiply(dx).add(dy.multiply(dy)).add(dz.multiply(dz)).sqrt();
    }finally{__CLR4_4_1cvzcvzlb90p882.R.flushNeeded();}}

    /** Compute the distance between the instance and another vector according to the L<sub>2</sub> norm.
     * <p>Calling this method is equivalent to calling:
     * <code>q.subtract(p).getNorm()</code> except that no intermediate
     * vector is built</p>
     * @param v second vector
     * @return the distance between the instance and p according to the L<sub>2</sub> norm
     */
    public T distance(final Vector3D v) {try{__CLR4_4_1cvzcvzlb90p882.R.inc(16959);
        __CLR4_4_1cvzcvzlb90p882.R.inc(16960);final T dx = x.subtract(v.getX());
        __CLR4_4_1cvzcvzlb90p882.R.inc(16961);final T dy = y.subtract(v.getY());
        __CLR4_4_1cvzcvzlb90p882.R.inc(16962);final T dz = z.subtract(v.getZ());
        __CLR4_4_1cvzcvzlb90p882.R.inc(16963);return dx.multiply(dx).add(dy.multiply(dy)).add(dz.multiply(dz)).sqrt();
    }finally{__CLR4_4_1cvzcvzlb90p882.R.flushNeeded();}}

    /** Compute the distance between the instance and another vector according to the L<sub>&infin;</sub> norm.
     * <p>Calling this method is equivalent to calling:
     * <code>q.subtract(p).getNormInf()</code> except that no intermediate
     * vector is built</p>
     * @param v second vector
     * @return the distance between the instance and p according to the L<sub>&infin;</sub> norm
     */
    public T distanceInf(final FieldVector3D<T> v) {try{__CLR4_4_1cvzcvzlb90p882.R.inc(16964);
        __CLR4_4_1cvzcvzlb90p882.R.inc(16965);final T dx = v.x.subtract(x).abs();
        __CLR4_4_1cvzcvzlb90p882.R.inc(16966);final T dy = v.y.subtract(y).abs();
        __CLR4_4_1cvzcvzlb90p882.R.inc(16967);final T dz = v.z.subtract(z).abs();
        __CLR4_4_1cvzcvzlb90p882.R.inc(16968);if ((((dx.getReal() <= dy.getReal())&&(__CLR4_4_1cvzcvzlb90p882.R.iget(16969)!=0|true))||(__CLR4_4_1cvzcvzlb90p882.R.iget(16970)==0&false))) {{
            __CLR4_4_1cvzcvzlb90p882.R.inc(16971);if ((((dy.getReal() <= dz.getReal())&&(__CLR4_4_1cvzcvzlb90p882.R.iget(16972)!=0|true))||(__CLR4_4_1cvzcvzlb90p882.R.iget(16973)==0&false))) {{
                __CLR4_4_1cvzcvzlb90p882.R.inc(16974);return dz;
            } }else {{
                __CLR4_4_1cvzcvzlb90p882.R.inc(16975);return dy;
            }
        }} }else {{
            __CLR4_4_1cvzcvzlb90p882.R.inc(16976);if ((((dx.getReal() <= dz.getReal())&&(__CLR4_4_1cvzcvzlb90p882.R.iget(16977)!=0|true))||(__CLR4_4_1cvzcvzlb90p882.R.iget(16978)==0&false))) {{
                __CLR4_4_1cvzcvzlb90p882.R.inc(16979);return dz;
            } }else {{
                __CLR4_4_1cvzcvzlb90p882.R.inc(16980);return dx;
            }
        }}
    }}finally{__CLR4_4_1cvzcvzlb90p882.R.flushNeeded();}}

    /** Compute the distance between the instance and another vector according to the L<sub>&infin;</sub> norm.
     * <p>Calling this method is equivalent to calling:
     * <code>q.subtract(p).getNormInf()</code> except that no intermediate
     * vector is built</p>
     * @param v second vector
     * @return the distance between the instance and p according to the L<sub>&infin;</sub> norm
     */
    public T distanceInf(final Vector3D v) {try{__CLR4_4_1cvzcvzlb90p882.R.inc(16981);
        __CLR4_4_1cvzcvzlb90p882.R.inc(16982);final T dx = x.subtract(v.getX()).abs();
        __CLR4_4_1cvzcvzlb90p882.R.inc(16983);final T dy = y.subtract(v.getY()).abs();
        __CLR4_4_1cvzcvzlb90p882.R.inc(16984);final T dz = z.subtract(v.getZ()).abs();
        __CLR4_4_1cvzcvzlb90p882.R.inc(16985);if ((((dx.getReal() <= dy.getReal())&&(__CLR4_4_1cvzcvzlb90p882.R.iget(16986)!=0|true))||(__CLR4_4_1cvzcvzlb90p882.R.iget(16987)==0&false))) {{
            __CLR4_4_1cvzcvzlb90p882.R.inc(16988);if ((((dy.getReal() <= dz.getReal())&&(__CLR4_4_1cvzcvzlb90p882.R.iget(16989)!=0|true))||(__CLR4_4_1cvzcvzlb90p882.R.iget(16990)==0&false))) {{
                __CLR4_4_1cvzcvzlb90p882.R.inc(16991);return dz;
            } }else {{
                __CLR4_4_1cvzcvzlb90p882.R.inc(16992);return dy;
            }
        }} }else {{
            __CLR4_4_1cvzcvzlb90p882.R.inc(16993);if ((((dx.getReal() <= dz.getReal())&&(__CLR4_4_1cvzcvzlb90p882.R.iget(16994)!=0|true))||(__CLR4_4_1cvzcvzlb90p882.R.iget(16995)==0&false))) {{
                __CLR4_4_1cvzcvzlb90p882.R.inc(16996);return dz;
            } }else {{
                __CLR4_4_1cvzcvzlb90p882.R.inc(16997);return dx;
            }
        }}
    }}finally{__CLR4_4_1cvzcvzlb90p882.R.flushNeeded();}}

    /** Compute the square of the distance between the instance and another vector.
     * <p>Calling this method is equivalent to calling:
     * <code>q.subtract(p).getNormSq()</code> except that no intermediate
     * vector is built</p>
     * @param v second vector
     * @return the square of the distance between the instance and p
     */
    public T distanceSq(final FieldVector3D<T> v) {try{__CLR4_4_1cvzcvzlb90p882.R.inc(16998);
        __CLR4_4_1cvzcvzlb90p882.R.inc(16999);final T dx = v.x.subtract(x);
        __CLR4_4_1cvzcvzlb90p882.R.inc(17000);final T dy = v.y.subtract(y);
        __CLR4_4_1cvzcvzlb90p882.R.inc(17001);final T dz = v.z.subtract(z);
        __CLR4_4_1cvzcvzlb90p882.R.inc(17002);return dx.multiply(dx).add(dy.multiply(dy)).add(dz.multiply(dz));
    }finally{__CLR4_4_1cvzcvzlb90p882.R.flushNeeded();}}

    /** Compute the square of the distance between the instance and another vector.
     * <p>Calling this method is equivalent to calling:
     * <code>q.subtract(p).getNormSq()</code> except that no intermediate
     * vector is built</p>
     * @param v second vector
     * @return the square of the distance between the instance and p
     */
    public T distanceSq(final Vector3D v) {try{__CLR4_4_1cvzcvzlb90p882.R.inc(17003);
        __CLR4_4_1cvzcvzlb90p882.R.inc(17004);final T dx = x.subtract(v.getX());
        __CLR4_4_1cvzcvzlb90p882.R.inc(17005);final T dy = y.subtract(v.getY());
        __CLR4_4_1cvzcvzlb90p882.R.inc(17006);final T dz = z.subtract(v.getZ());
        __CLR4_4_1cvzcvzlb90p882.R.inc(17007);return dx.multiply(dx).add(dy.multiply(dy)).add(dz.multiply(dz));
    }finally{__CLR4_4_1cvzcvzlb90p882.R.flushNeeded();}}

    /** Compute the dot-product of two vectors.
     * @param v1 first vector
     * @param v2 second vector
     * @param <T> the type of the field elements
     * @return the dot product v1.v2
     */
    public static <T extends RealFieldElement<T>> T dotProduct(final FieldVector3D<T> v1,
                                                                   final FieldVector3D<T> v2) {try{__CLR4_4_1cvzcvzlb90p882.R.inc(17008);
        __CLR4_4_1cvzcvzlb90p882.R.inc(17009);return v1.dotProduct(v2);
    }finally{__CLR4_4_1cvzcvzlb90p882.R.flushNeeded();}}

    /** Compute the dot-product of two vectors.
     * @param v1 first vector
     * @param v2 second vector
     * @param <T> the type of the field elements
     * @return the dot product v1.v2
     */
    public static <T extends RealFieldElement<T>> T dotProduct(final FieldVector3D<T> v1,
                                                                   final Vector3D v2) {try{__CLR4_4_1cvzcvzlb90p882.R.inc(17010);
        __CLR4_4_1cvzcvzlb90p882.R.inc(17011);return v1.dotProduct(v2);
    }finally{__CLR4_4_1cvzcvzlb90p882.R.flushNeeded();}}

    /** Compute the dot-product of two vectors.
     * @param v1 first vector
     * @param v2 second vector
     * @param <T> the type of the field elements
     * @return the dot product v1.v2
     */
    public static <T extends RealFieldElement<T>> T dotProduct(final Vector3D v1,
                                                                   final FieldVector3D<T> v2) {try{__CLR4_4_1cvzcvzlb90p882.R.inc(17012);
        __CLR4_4_1cvzcvzlb90p882.R.inc(17013);return v2.dotProduct(v1);
    }finally{__CLR4_4_1cvzcvzlb90p882.R.flushNeeded();}}

    /** Compute the cross-product of two vectors.
     * @param v1 first vector
     * @param v2 second vector
     * @param <T> the type of the field elements
     * @return the cross product v1 ^ v2 as a new Vector
     */
    public static <T extends RealFieldElement<T>> FieldVector3D<T> crossProduct(final FieldVector3D<T> v1,
                                                                                    final FieldVector3D<T> v2) {try{__CLR4_4_1cvzcvzlb90p882.R.inc(17014);
        __CLR4_4_1cvzcvzlb90p882.R.inc(17015);return v1.crossProduct(v2);
    }finally{__CLR4_4_1cvzcvzlb90p882.R.flushNeeded();}}

    /** Compute the cross-product of two vectors.
     * @param v1 first vector
     * @param v2 second vector
     * @param <T> the type of the field elements
     * @return the cross product v1 ^ v2 as a new Vector
     */
    public static <T extends RealFieldElement<T>> FieldVector3D<T> crossProduct(final FieldVector3D<T> v1,
                                                                                    final Vector3D v2) {try{__CLR4_4_1cvzcvzlb90p882.R.inc(17016);
        __CLR4_4_1cvzcvzlb90p882.R.inc(17017);return v1.crossProduct(v2);
    }finally{__CLR4_4_1cvzcvzlb90p882.R.flushNeeded();}}

    /** Compute the cross-product of two vectors.
     * @param v1 first vector
     * @param v2 second vector
     * @param <T> the type of the field elements
     * @return the cross product v1 ^ v2 as a new Vector
     */
    public static <T extends RealFieldElement<T>> FieldVector3D<T> crossProduct(final Vector3D v1,
                                                                                    final FieldVector3D<T> v2) {try{__CLR4_4_1cvzcvzlb90p882.R.inc(17018);
        __CLR4_4_1cvzcvzlb90p882.R.inc(17019);return new FieldVector3D<T>(v2.x.linearCombination(v1.getY(), v2.z, -v1.getZ(), v2.y),
                                    v2.y.linearCombination(v1.getZ(), v2.x, -v1.getX(), v2.z),
                                    v2.z.linearCombination(v1.getX(), v2.y, -v1.getY(), v2.x));
    }finally{__CLR4_4_1cvzcvzlb90p882.R.flushNeeded();}}

    /** Compute the distance between two vectors according to the L<sub>1</sub> norm.
     * <p>Calling this method is equivalent to calling:
     * <code>v1.subtract(v2).getNorm1()</code> except that no intermediate
     * vector is built</p>
     * @param v1 first vector
     * @param v2 second vector
     * @param <T> the type of the field elements
     * @return the distance between v1 and v2 according to the L<sub>1</sub> norm
     */
    public static <T extends RealFieldElement<T>> T distance1(final FieldVector3D<T> v1,
                                                                  final FieldVector3D<T> v2) {try{__CLR4_4_1cvzcvzlb90p882.R.inc(17020);
        __CLR4_4_1cvzcvzlb90p882.R.inc(17021);return v1.distance1(v2);
    }finally{__CLR4_4_1cvzcvzlb90p882.R.flushNeeded();}}

    /** Compute the distance between two vectors according to the L<sub>1</sub> norm.
     * <p>Calling this method is equivalent to calling:
     * <code>v1.subtract(v2).getNorm1()</code> except that no intermediate
     * vector is built</p>
     * @param v1 first vector
     * @param v2 second vector
     * @param <T> the type of the field elements
     * @return the distance between v1 and v2 according to the L<sub>1</sub> norm
     */
    public static <T extends RealFieldElement<T>> T distance1(final FieldVector3D<T> v1,
                                                                  final Vector3D v2) {try{__CLR4_4_1cvzcvzlb90p882.R.inc(17022);
        __CLR4_4_1cvzcvzlb90p882.R.inc(17023);return v1.distance1(v2);
    }finally{__CLR4_4_1cvzcvzlb90p882.R.flushNeeded();}}

    /** Compute the distance between two vectors according to the L<sub>1</sub> norm.
     * <p>Calling this method is equivalent to calling:
     * <code>v1.subtract(v2).getNorm1()</code> except that no intermediate
     * vector is built</p>
     * @param v1 first vector
     * @param v2 second vector
     * @param <T> the type of the field elements
     * @return the distance between v1 and v2 according to the L<sub>1</sub> norm
     */
    public static <T extends RealFieldElement<T>> T distance1(final Vector3D v1,
                                                                  final FieldVector3D<T> v2) {try{__CLR4_4_1cvzcvzlb90p882.R.inc(17024);
        __CLR4_4_1cvzcvzlb90p882.R.inc(17025);return v2.distance1(v1);
    }finally{__CLR4_4_1cvzcvzlb90p882.R.flushNeeded();}}

    /** Compute the distance between two vectors according to the L<sub>2</sub> norm.
     * <p>Calling this method is equivalent to calling:
     * <code>v1.subtract(v2).getNorm()</code> except that no intermediate
     * vector is built</p>
     * @param v1 first vector
     * @param v2 second vector
     * @param <T> the type of the field elements
     * @return the distance between v1 and v2 according to the L<sub>2</sub> norm
     */
    public static <T extends RealFieldElement<T>> T distance(final FieldVector3D<T> v1,
                                                                 final FieldVector3D<T> v2) {try{__CLR4_4_1cvzcvzlb90p882.R.inc(17026);
        __CLR4_4_1cvzcvzlb90p882.R.inc(17027);return v1.distance(v2);
    }finally{__CLR4_4_1cvzcvzlb90p882.R.flushNeeded();}}

    /** Compute the distance between two vectors according to the L<sub>2</sub> norm.
     * <p>Calling this method is equivalent to calling:
     * <code>v1.subtract(v2).getNorm()</code> except that no intermediate
     * vector is built</p>
     * @param v1 first vector
     * @param v2 second vector
     * @param <T> the type of the field elements
     * @return the distance between v1 and v2 according to the L<sub>2</sub> norm
     */
    public static <T extends RealFieldElement<T>> T distance(final FieldVector3D<T> v1,
                                                                 final Vector3D v2) {try{__CLR4_4_1cvzcvzlb90p882.R.inc(17028);
        __CLR4_4_1cvzcvzlb90p882.R.inc(17029);return v1.distance(v2);
    }finally{__CLR4_4_1cvzcvzlb90p882.R.flushNeeded();}}

    /** Compute the distance between two vectors according to the L<sub>2</sub> norm.
     * <p>Calling this method is equivalent to calling:
     * <code>v1.subtract(v2).getNorm()</code> except that no intermediate
     * vector is built</p>
     * @param v1 first vector
     * @param v2 second vector
     * @param <T> the type of the field elements
     * @return the distance between v1 and v2 according to the L<sub>2</sub> norm
     */
    public static <T extends RealFieldElement<T>> T distance(final Vector3D v1,
                                                                 final FieldVector3D<T> v2) {try{__CLR4_4_1cvzcvzlb90p882.R.inc(17030);
        __CLR4_4_1cvzcvzlb90p882.R.inc(17031);return v2.distance(v1);
    }finally{__CLR4_4_1cvzcvzlb90p882.R.flushNeeded();}}

    /** Compute the distance between two vectors according to the L<sub>&infin;</sub> norm.
     * <p>Calling this method is equivalent to calling:
     * <code>v1.subtract(v2).getNormInf()</code> except that no intermediate
     * vector is built</p>
     * @param v1 first vector
     * @param v2 second vector
     * @param <T> the type of the field elements
     * @return the distance between v1 and v2 according to the L<sub>&infin;</sub> norm
     */
    public static <T extends RealFieldElement<T>> T distanceInf(final FieldVector3D<T> v1,
                                                                    final FieldVector3D<T> v2) {try{__CLR4_4_1cvzcvzlb90p882.R.inc(17032);
        __CLR4_4_1cvzcvzlb90p882.R.inc(17033);return v1.distanceInf(v2);
    }finally{__CLR4_4_1cvzcvzlb90p882.R.flushNeeded();}}

    /** Compute the distance between two vectors according to the L<sub>&infin;</sub> norm.
     * <p>Calling this method is equivalent to calling:
     * <code>v1.subtract(v2).getNormInf()</code> except that no intermediate
     * vector is built</p>
     * @param v1 first vector
     * @param v2 second vector
     * @param <T> the type of the field elements
     * @return the distance between v1 and v2 according to the L<sub>&infin;</sub> norm
     */
    public static <T extends RealFieldElement<T>> T distanceInf(final FieldVector3D<T> v1,
                                                                    final Vector3D v2) {try{__CLR4_4_1cvzcvzlb90p882.R.inc(17034);
        __CLR4_4_1cvzcvzlb90p882.R.inc(17035);return v1.distanceInf(v2);
    }finally{__CLR4_4_1cvzcvzlb90p882.R.flushNeeded();}}

    /** Compute the distance between two vectors according to the L<sub>&infin;</sub> norm.
     * <p>Calling this method is equivalent to calling:
     * <code>v1.subtract(v2).getNormInf()</code> except that no intermediate
     * vector is built</p>
     * @param v1 first vector
     * @param v2 second vector
     * @param <T> the type of the field elements
     * @return the distance between v1 and v2 according to the L<sub>&infin;</sub> norm
     */
    public static <T extends RealFieldElement<T>> T distanceInf(final Vector3D v1,
                                                                    final FieldVector3D<T> v2) {try{__CLR4_4_1cvzcvzlb90p882.R.inc(17036);
        __CLR4_4_1cvzcvzlb90p882.R.inc(17037);return v2.distanceInf(v1);
    }finally{__CLR4_4_1cvzcvzlb90p882.R.flushNeeded();}}

    /** Compute the square of the distance between two vectors.
     * <p>Calling this method is equivalent to calling:
     * <code>v1.subtract(v2).getNormSq()</code> except that no intermediate
     * vector is built</p>
     * @param v1 first vector
     * @param v2 second vector
     * @param <T> the type of the field elements
     * @return the square of the distance between v1 and v2
     */
    public static <T extends RealFieldElement<T>> T distanceSq(final FieldVector3D<T> v1,
                                                                   final FieldVector3D<T> v2) {try{__CLR4_4_1cvzcvzlb90p882.R.inc(17038);
        __CLR4_4_1cvzcvzlb90p882.R.inc(17039);return v1.distanceSq(v2);
    }finally{__CLR4_4_1cvzcvzlb90p882.R.flushNeeded();}}

    /** Compute the square of the distance between two vectors.
     * <p>Calling this method is equivalent to calling:
     * <code>v1.subtract(v2).getNormSq()</code> except that no intermediate
     * vector is built</p>
     * @param v1 first vector
     * @param v2 second vector
     * @param <T> the type of the field elements
     * @return the square of the distance between v1 and v2
     */
    public static <T extends RealFieldElement<T>> T distanceSq(final FieldVector3D<T> v1,
                                                                   final Vector3D v2) {try{__CLR4_4_1cvzcvzlb90p882.R.inc(17040);
        __CLR4_4_1cvzcvzlb90p882.R.inc(17041);return v1.distanceSq(v2);
    }finally{__CLR4_4_1cvzcvzlb90p882.R.flushNeeded();}}

    /** Compute the square of the distance between two vectors.
     * <p>Calling this method is equivalent to calling:
     * <code>v1.subtract(v2).getNormSq()</code> except that no intermediate
     * vector is built</p>
     * @param v1 first vector
     * @param v2 second vector
     * @param <T> the type of the field elements
     * @return the square of the distance between v1 and v2
     */
    public static <T extends RealFieldElement<T>> T distanceSq(final Vector3D v1,
                                                                   final FieldVector3D<T> v2) {try{__CLR4_4_1cvzcvzlb90p882.R.inc(17042);
        __CLR4_4_1cvzcvzlb90p882.R.inc(17043);return v2.distanceSq(v1);
    }finally{__CLR4_4_1cvzcvzlb90p882.R.flushNeeded();}}

    /** Get a string representation of this vector.
     * @return a string representation of this vector
     */
    @Override
    public String toString() {try{__CLR4_4_1cvzcvzlb90p882.R.inc(17044);
        __CLR4_4_1cvzcvzlb90p882.R.inc(17045);return Vector3DFormat.getInstance().format(toVector3D());
    }finally{__CLR4_4_1cvzcvzlb90p882.R.flushNeeded();}}

    /** Get a string representation of this vector.
     * @param format the custom format for components
     * @return a string representation of this vector
     */
    public String toString(final NumberFormat format) {try{__CLR4_4_1cvzcvzlb90p882.R.inc(17046);
        __CLR4_4_1cvzcvzlb90p882.R.inc(17047);return new Vector3DFormat(format).format(toVector3D());
    }finally{__CLR4_4_1cvzcvzlb90p882.R.flushNeeded();}}

}
