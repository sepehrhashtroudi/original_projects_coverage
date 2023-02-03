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

import org.apache.commons.math3.util.FastMath;

/** This class provides conversions related to <a
 * href="http://mathworld.wolfram.com/SphericalCoordinates.html">spherical coordinates</a>.
 * <p>
 * The conventions used here are the mathematical ones, i.e. spherical coordinates are
 * related to Cartesian coordinates as follows:
 * </p>
 * <ul>
 *   <li>x = r cos(&theta;) sin(&Phi;)</li>
 *   <li>y = r sin(&theta;) sin(&Phi;)</li>
 *   <li>z = r cos(&Phi;)</li>
 * </ul>
 * <ul>
 *   <li>r       = &radic;(x<sup>2</sup>+y<sup>2</sup>+z<sup>2</sup>)</li>
 *   <li>&theta; = atan2(y, x)</li>
 *   <li>&Phi;   = acos(z/r)</li>
 * </ul>
 * <p>
 * r is the radius, &theta; is the azimuthal angle in the x-y plane and &Phi; is the polar
 * (co-latitude) angle. These conventions are <em>different</em> from the conventions used
 * in physics (and in particular in spherical harmonics) where the meanings of &theta; and
 * &Phi; are reversed.
 * </p>
 * <p>
 * This class provides conversion of coordinates and also of gradient and Hessian
 * between spherical and Cartesian coordinates.
 * </p>
 * @since 3.2
 * @version $Id$
 */
public class SphericalCoordinates implements Serializable {public static class __CLR4_4_1duvduvlb90p8bi{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,18091,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** Serializable UID. */
    private static final long serialVersionUID = 20130206L;

    /** Cartesian coordinates. */
    private final Vector3D v;

    /** Radius. */
    private final double r;

    /** Azimuthal angle in the x-y plane &theta;. */
    private final double theta;

    /** Polar angle (co-latitude) &Phi;. */
    private final double phi;

    /** Jacobian of (r, &theta; &Phi). */
    private double[][] jacobian;

    /** Hessian of radius. */
    private double[][] rHessian;

    /** Hessian of azimuthal angle in the x-y plane &theta;. */
    private double[][] thetaHessian;

    /** Hessian of polar (co-latitude) angle &Phi;. */
    private double[][] phiHessian;

    /** Build a spherical coordinates transformer from Cartesian coordinates.
     * @param v Cartesian coordinates
     */
    public SphericalCoordinates(final Vector3D v) {try{__CLR4_4_1duvduvlb90p8bi.R.inc(17959);

        // Cartesian coordinates
        __CLR4_4_1duvduvlb90p8bi.R.inc(17960);this.v = v;

        // remaining spherical coordinates
        __CLR4_4_1duvduvlb90p8bi.R.inc(17961);this.r     = v.getNorm();
        __CLR4_4_1duvduvlb90p8bi.R.inc(17962);this.theta = v.getAlpha();
        __CLR4_4_1duvduvlb90p8bi.R.inc(17963);this.phi   = FastMath.acos(v.getZ() / r);

    }finally{__CLR4_4_1duvduvlb90p8bi.R.flushNeeded();}}

    /** Build a spherical coordinates transformer from spherical coordinates.
     * @param r radius
     * @param theta azimuthal angle in x-y plane
     * @param phi polar (co-latitude) angle
     */
    public SphericalCoordinates(final double r, final double theta, final double phi) {try{__CLR4_4_1duvduvlb90p8bi.R.inc(17964);

        __CLR4_4_1duvduvlb90p8bi.R.inc(17965);final double cosTheta = FastMath.cos(theta);
        __CLR4_4_1duvduvlb90p8bi.R.inc(17966);final double sinTheta = FastMath.sin(theta);
        __CLR4_4_1duvduvlb90p8bi.R.inc(17967);final double cosPhi   = FastMath.cos(phi);
        __CLR4_4_1duvduvlb90p8bi.R.inc(17968);final double sinPhi   = FastMath.sin(phi);

        // spherical coordinates
        __CLR4_4_1duvduvlb90p8bi.R.inc(17969);this.r     = r;
        __CLR4_4_1duvduvlb90p8bi.R.inc(17970);this.theta = theta;
        __CLR4_4_1duvduvlb90p8bi.R.inc(17971);this.phi   = phi;

        // Cartesian coordinates
        __CLR4_4_1duvduvlb90p8bi.R.inc(17972);this.v  = new Vector3D(r * cosTheta * sinPhi,
                               r * sinTheta * sinPhi,
                               r * cosPhi);

    }finally{__CLR4_4_1duvduvlb90p8bi.R.flushNeeded();}}

    /** Get the Cartesian coordinates.
     * @return Cartesian coordinates
     */
    public Vector3D getCartesian() {try{__CLR4_4_1duvduvlb90p8bi.R.inc(17973);
        __CLR4_4_1duvduvlb90p8bi.R.inc(17974);return v;
    }finally{__CLR4_4_1duvduvlb90p8bi.R.flushNeeded();}}

    /** Get the radius.
     * @return radius r
     * @see #getTheta()
     * @see #getPhi()
     */
    public double getR() {try{__CLR4_4_1duvduvlb90p8bi.R.inc(17975);
        __CLR4_4_1duvduvlb90p8bi.R.inc(17976);return r;
    }finally{__CLR4_4_1duvduvlb90p8bi.R.flushNeeded();}}

    /** Get the azimuthal angle in x-y plane.
     * @return azimuthal angle in x-y plane &theta;
     * @see #getR()
     * @see #getPhi()
     */
    public double getTheta() {try{__CLR4_4_1duvduvlb90p8bi.R.inc(17977);
        __CLR4_4_1duvduvlb90p8bi.R.inc(17978);return theta;
    }finally{__CLR4_4_1duvduvlb90p8bi.R.flushNeeded();}}

    /** Get the polar (co-latitude) angle.
     * @return polar (co-latitude) angle &Phi;
     * @see #getR()
     * @see #getTheta()
     */
    public double getPhi() {try{__CLR4_4_1duvduvlb90p8bi.R.inc(17979);
        __CLR4_4_1duvduvlb90p8bi.R.inc(17980);return phi;
    }finally{__CLR4_4_1duvduvlb90p8bi.R.flushNeeded();}}

    /** Convert a gradient with respect to spherical coordinates into a gradient
     * with respect to Cartesian coordinates.
     * @param sGradient gradient with respect to spherical coordinates
     * {df/dr, df/d&theta;, df/d&Phi;}
     * @return gradient with respect to Cartesian coordinates
     * {df/dx, df/dy, df/dz}
     */
    public double[] toCartesianGradient(final double[] sGradient) {try{__CLR4_4_1duvduvlb90p8bi.R.inc(17981);

        // lazy evaluation of Jacobian
        __CLR4_4_1duvduvlb90p8bi.R.inc(17982);computeJacobian();

        // compose derivatives as gradient^T . J
        // the expressions have been simplified since we know jacobian[1][2] = dTheta/dZ = 0
        __CLR4_4_1duvduvlb90p8bi.R.inc(17983);return new double[] {
            sGradient[0] * jacobian[0][0] + sGradient[1] * jacobian[1][0] + sGradient[2] * jacobian[2][0],
            sGradient[0] * jacobian[0][1] + sGradient[1] * jacobian[1][1] + sGradient[2] * jacobian[2][1],
            sGradient[0] * jacobian[0][2]                                 + sGradient[2] * jacobian[2][2]
        };

    }finally{__CLR4_4_1duvduvlb90p8bi.R.flushNeeded();}}

    /** Convert a Hessian with respect to spherical coordinates into a Hessian
     * with respect to Cartesian coordinates.
     * <p>
     * As Hessian are always symmetric, we use only the lower left part of the provided
     * spherical Hessian, so the upper part may not be initialized. However, we still
     * do fill up the complete array we create, with guaranteed symmetry.
     * </p>
     * @param sHessian Hessian with respect to spherical coordinates
     * {{d<sup>2</sup>f/dr<sup>2</sup>, d<sup>2</sup>f/drd&theta;, d<sup>2</sup>f/drd&Phi;},
     *  {d<sup>2</sup>f/drd&theta;, d<sup>2</sup>f/d&theta;<sup>2</sup>, d<sup>2</sup>f/d&theta;d&Phi;},
     *  {d<sup>2</sup>f/drd&Phi;, d<sup>2</sup>f/d&theta;d&Phi;, d<sup>2</sup>f/d&Phi;<sup>2</sup>}
     * @param sGradient gradient with respect to spherical coordinates
     * {df/dr, df/d&theta;, df/d&Phi;}
     * @return Hessian with respect to Cartesian coordinates
     * {{d<sup>2</sup>f/dx<sup>2</sup>, d<sup>2</sup>f/dxdy, d<sup>2</sup>f/dxdz},
     *  {d<sup>2</sup>f/dxdy, d<sup>2</sup>f/dy<sup>2</sup>, d<sup>2</sup>f/dydz},
     *  {d<sup>2</sup>f/dxdz, d<sup>2</sup>f/dydz, d<sup>2</sup>f/dz<sup>2</sup>}}
     */
    public double[][] toCartesianHessian(final double[][] sHessian, final double[] sGradient) {try{__CLR4_4_1duvduvlb90p8bi.R.inc(17984);

        __CLR4_4_1duvduvlb90p8bi.R.inc(17985);computeJacobian();
        __CLR4_4_1duvduvlb90p8bi.R.inc(17986);computeHessians();

        // compose derivative as J^T . H_f . J + df/dr H_r + df/dtheta H_theta + df/dphi H_phi
        // the expressions have been simplified since we know jacobian[1][2] = dTheta/dZ = 0
        // and H_theta is only a 2x2 matrix as it does not depend on z
        __CLR4_4_1duvduvlb90p8bi.R.inc(17987);final double[][] hj = new double[3][3];
        __CLR4_4_1duvduvlb90p8bi.R.inc(17988);final double[][] cHessian = new double[3][3];

        // compute H_f . J
        // beware we use ONLY the lower-left part of sHessian
        __CLR4_4_1duvduvlb90p8bi.R.inc(17989);hj[0][0] = sHessian[0][0] * jacobian[0][0] + sHessian[1][0] * jacobian[1][0] + sHessian[2][0] * jacobian[2][0];
        __CLR4_4_1duvduvlb90p8bi.R.inc(17990);hj[0][1] = sHessian[0][0] * jacobian[0][1] + sHessian[1][0] * jacobian[1][1] + sHessian[2][0] * jacobian[2][1];
        __CLR4_4_1duvduvlb90p8bi.R.inc(17991);hj[0][2] = sHessian[0][0] * jacobian[0][2]                                   + sHessian[2][0] * jacobian[2][2];
        __CLR4_4_1duvduvlb90p8bi.R.inc(17992);hj[1][0] = sHessian[1][0] * jacobian[0][0] + sHessian[1][1] * jacobian[1][0] + sHessian[2][1] * jacobian[2][0];
        __CLR4_4_1duvduvlb90p8bi.R.inc(17993);hj[1][1] = sHessian[1][0] * jacobian[0][1] + sHessian[1][1] * jacobian[1][1] + sHessian[2][1] * jacobian[2][1];
        // don't compute hj[1][2] as it is not used below
        __CLR4_4_1duvduvlb90p8bi.R.inc(17994);hj[2][0] = sHessian[2][0] * jacobian[0][0] + sHessian[2][1] * jacobian[1][0] + sHessian[2][2] * jacobian[2][0];
        __CLR4_4_1duvduvlb90p8bi.R.inc(17995);hj[2][1] = sHessian[2][0] * jacobian[0][1] + sHessian[2][1] * jacobian[1][1] + sHessian[2][2] * jacobian[2][1];
        __CLR4_4_1duvduvlb90p8bi.R.inc(17996);hj[2][2] = sHessian[2][0] * jacobian[0][2]                                   + sHessian[2][2] * jacobian[2][2];

        // compute lower-left part of J^T . H_f . J
        __CLR4_4_1duvduvlb90p8bi.R.inc(17997);cHessian[0][0] = jacobian[0][0] * hj[0][0] + jacobian[1][0] * hj[1][0] + jacobian[2][0] * hj[2][0];
        __CLR4_4_1duvduvlb90p8bi.R.inc(17998);cHessian[1][0] = jacobian[0][1] * hj[0][0] + jacobian[1][1] * hj[1][0] + jacobian[2][1] * hj[2][0];
        __CLR4_4_1duvduvlb90p8bi.R.inc(17999);cHessian[2][0] = jacobian[0][2] * hj[0][0]                             + jacobian[2][2] * hj[2][0];
        __CLR4_4_1duvduvlb90p8bi.R.inc(18000);cHessian[1][1] = jacobian[0][1] * hj[0][1] + jacobian[1][1] * hj[1][1] + jacobian[2][1] * hj[2][1];
        __CLR4_4_1duvduvlb90p8bi.R.inc(18001);cHessian[2][1] = jacobian[0][2] * hj[0][1]                             + jacobian[2][2] * hj[2][1];
        __CLR4_4_1duvduvlb90p8bi.R.inc(18002);cHessian[2][2] = jacobian[0][2] * hj[0][2]                             + jacobian[2][2] * hj[2][2];

        // add gradient contribution
        __CLR4_4_1duvduvlb90p8bi.R.inc(18003);cHessian[0][0] += sGradient[0] * rHessian[0][0] + sGradient[1] * thetaHessian[0][0] + sGradient[2] * phiHessian[0][0];
        __CLR4_4_1duvduvlb90p8bi.R.inc(18004);cHessian[1][0] += sGradient[0] * rHessian[1][0] + sGradient[1] * thetaHessian[1][0] + sGradient[2] * phiHessian[1][0];
        __CLR4_4_1duvduvlb90p8bi.R.inc(18005);cHessian[2][0] += sGradient[0] * rHessian[2][0]                                     + sGradient[2] * phiHessian[2][0];
        __CLR4_4_1duvduvlb90p8bi.R.inc(18006);cHessian[1][1] += sGradient[0] * rHessian[1][1] + sGradient[1] * thetaHessian[1][1] + sGradient[2] * phiHessian[1][1];
        __CLR4_4_1duvduvlb90p8bi.R.inc(18007);cHessian[2][1] += sGradient[0] * rHessian[2][1]                                     + sGradient[2] * phiHessian[2][1];
        __CLR4_4_1duvduvlb90p8bi.R.inc(18008);cHessian[2][2] += sGradient[0] * rHessian[2][2]                                     + sGradient[2] * phiHessian[2][2];

        // ensure symmetry
        __CLR4_4_1duvduvlb90p8bi.R.inc(18009);cHessian[0][1] = cHessian[1][0];
        __CLR4_4_1duvduvlb90p8bi.R.inc(18010);cHessian[0][2] = cHessian[2][0];
        __CLR4_4_1duvduvlb90p8bi.R.inc(18011);cHessian[1][2] = cHessian[2][1];

        __CLR4_4_1duvduvlb90p8bi.R.inc(18012);return cHessian;

    }finally{__CLR4_4_1duvduvlb90p8bi.R.flushNeeded();}}

    /** Lazy evaluation of (r, &theta;, &phi;) Jacobian.
     */
    private void computeJacobian() {try{__CLR4_4_1duvduvlb90p8bi.R.inc(18013);
        __CLR4_4_1duvduvlb90p8bi.R.inc(18014);if ((((jacobian == null)&&(__CLR4_4_1duvduvlb90p8bi.R.iget(18015)!=0|true))||(__CLR4_4_1duvduvlb90p8bi.R.iget(18016)==0&false))) {{

            // intermediate variables
            __CLR4_4_1duvduvlb90p8bi.R.inc(18017);final double x    = v.getX();
            __CLR4_4_1duvduvlb90p8bi.R.inc(18018);final double y    = v.getY();
            __CLR4_4_1duvduvlb90p8bi.R.inc(18019);final double z    = v.getZ();
            __CLR4_4_1duvduvlb90p8bi.R.inc(18020);final double rho2 = x * x + y * y;
            __CLR4_4_1duvduvlb90p8bi.R.inc(18021);final double rho  = FastMath.sqrt(rho2);
            __CLR4_4_1duvduvlb90p8bi.R.inc(18022);final double r2   = rho2 + z * z;

            __CLR4_4_1duvduvlb90p8bi.R.inc(18023);jacobian = new double[3][3];

            // row representing the gradient of r
            __CLR4_4_1duvduvlb90p8bi.R.inc(18024);jacobian[0][0] = x / r;
            __CLR4_4_1duvduvlb90p8bi.R.inc(18025);jacobian[0][1] = y / r;
            __CLR4_4_1duvduvlb90p8bi.R.inc(18026);jacobian[0][2] = z / r;

            // row representing the gradient of theta
            __CLR4_4_1duvduvlb90p8bi.R.inc(18027);jacobian[1][0] = -y / rho2;
            __CLR4_4_1duvduvlb90p8bi.R.inc(18028);jacobian[1][1] =  x / rho2;
            // jacobian[1][2] is already set to 0 at allocation time

            // row representing the gradient of phi
            __CLR4_4_1duvduvlb90p8bi.R.inc(18029);jacobian[2][0] = x * z / (rho * r2);
            __CLR4_4_1duvduvlb90p8bi.R.inc(18030);jacobian[2][1] = y * z / (rho * r2);
            __CLR4_4_1duvduvlb90p8bi.R.inc(18031);jacobian[2][2] = -rho / r2;

        }
    }}finally{__CLR4_4_1duvduvlb90p8bi.R.flushNeeded();}}

    /** Lazy evaluation of Hessians.
     */
    private void computeHessians() {try{__CLR4_4_1duvduvlb90p8bi.R.inc(18032);

        __CLR4_4_1duvduvlb90p8bi.R.inc(18033);if ((((rHessian == null)&&(__CLR4_4_1duvduvlb90p8bi.R.iget(18034)!=0|true))||(__CLR4_4_1duvduvlb90p8bi.R.iget(18035)==0&false))) {{

            // intermediate variables
            __CLR4_4_1duvduvlb90p8bi.R.inc(18036);final double x      = v.getX();
            __CLR4_4_1duvduvlb90p8bi.R.inc(18037);final double y      = v.getY();
            __CLR4_4_1duvduvlb90p8bi.R.inc(18038);final double z      = v.getZ();
            __CLR4_4_1duvduvlb90p8bi.R.inc(18039);final double x2     = x * x;
            __CLR4_4_1duvduvlb90p8bi.R.inc(18040);final double y2     = y * y;
            __CLR4_4_1duvduvlb90p8bi.R.inc(18041);final double z2     = z * z;
            __CLR4_4_1duvduvlb90p8bi.R.inc(18042);final double rho2   = x2 + y2;
            __CLR4_4_1duvduvlb90p8bi.R.inc(18043);final double rho    = FastMath.sqrt(rho2);
            __CLR4_4_1duvduvlb90p8bi.R.inc(18044);final double r2     = rho2 + z2;
            __CLR4_4_1duvduvlb90p8bi.R.inc(18045);final double xOr    = x / r;
            __CLR4_4_1duvduvlb90p8bi.R.inc(18046);final double yOr    = y / r;
            __CLR4_4_1duvduvlb90p8bi.R.inc(18047);final double zOr    = z / r;
            __CLR4_4_1duvduvlb90p8bi.R.inc(18048);final double xOrho2 = x / rho2;
            __CLR4_4_1duvduvlb90p8bi.R.inc(18049);final double yOrho2 = y / rho2;
            __CLR4_4_1duvduvlb90p8bi.R.inc(18050);final double xOr3   = xOr / r2;
            __CLR4_4_1duvduvlb90p8bi.R.inc(18051);final double yOr3   = yOr / r2;
            __CLR4_4_1duvduvlb90p8bi.R.inc(18052);final double zOr3   = zOr / r2;

            // lower-left part of Hessian of r
            __CLR4_4_1duvduvlb90p8bi.R.inc(18053);rHessian = new double[3][3];
            __CLR4_4_1duvduvlb90p8bi.R.inc(18054);rHessian[0][0] = y * yOr3 + z * zOr3;
            __CLR4_4_1duvduvlb90p8bi.R.inc(18055);rHessian[1][0] = -x * yOr3;
            __CLR4_4_1duvduvlb90p8bi.R.inc(18056);rHessian[2][0] = -z * xOr3;
            __CLR4_4_1duvduvlb90p8bi.R.inc(18057);rHessian[1][1] = x * xOr3 + z * zOr3;
            __CLR4_4_1duvduvlb90p8bi.R.inc(18058);rHessian[2][1] = -y * zOr3;
            __CLR4_4_1duvduvlb90p8bi.R.inc(18059);rHessian[2][2] = x * xOr3 + y * yOr3;

            // upper-right part is symmetric
            __CLR4_4_1duvduvlb90p8bi.R.inc(18060);rHessian[0][1] = rHessian[1][0];
            __CLR4_4_1duvduvlb90p8bi.R.inc(18061);rHessian[0][2] = rHessian[2][0];
            __CLR4_4_1duvduvlb90p8bi.R.inc(18062);rHessian[1][2] = rHessian[2][1];

            // lower-left part of Hessian of azimuthal angle theta
            __CLR4_4_1duvduvlb90p8bi.R.inc(18063);thetaHessian = new double[2][2];
            __CLR4_4_1duvduvlb90p8bi.R.inc(18064);thetaHessian[0][0] = 2 * xOrho2 * yOrho2;
            __CLR4_4_1duvduvlb90p8bi.R.inc(18065);thetaHessian[1][0] = yOrho2 * yOrho2 - xOrho2 * xOrho2;
            __CLR4_4_1duvduvlb90p8bi.R.inc(18066);thetaHessian[1][1] = -2 * xOrho2 * yOrho2;

            // upper-right part is symmetric
            __CLR4_4_1duvduvlb90p8bi.R.inc(18067);thetaHessian[0][1] = thetaHessian[1][0];

            // lower-left part of Hessian of polar (co-latitude) angle phi
            __CLR4_4_1duvduvlb90p8bi.R.inc(18068);final double rhor2       = rho * r2;
            __CLR4_4_1duvduvlb90p8bi.R.inc(18069);final double rho2r2      = rho * rhor2;
            __CLR4_4_1duvduvlb90p8bi.R.inc(18070);final double rhor4       = rhor2 * r2;
            __CLR4_4_1duvduvlb90p8bi.R.inc(18071);final double rho3r4      = rhor4 * rho2;
            __CLR4_4_1duvduvlb90p8bi.R.inc(18072);final double r2P2rho2    = 3 * rho2 + z2;
            __CLR4_4_1duvduvlb90p8bi.R.inc(18073);phiHessian = new double[3][3];
            __CLR4_4_1duvduvlb90p8bi.R.inc(18074);phiHessian[0][0] = z * (rho2r2 - x2 * r2P2rho2) / rho3r4;
            __CLR4_4_1duvduvlb90p8bi.R.inc(18075);phiHessian[1][0] = -x * y * z * r2P2rho2 / rho3r4;
            __CLR4_4_1duvduvlb90p8bi.R.inc(18076);phiHessian[2][0] = x * (rho2 - z2) / rhor4;
            __CLR4_4_1duvduvlb90p8bi.R.inc(18077);phiHessian[1][1] = z * (rho2r2 - y2 * r2P2rho2) / rho3r4;
            __CLR4_4_1duvduvlb90p8bi.R.inc(18078);phiHessian[2][1] = y * (rho2 - z2) / rhor4;
            __CLR4_4_1duvduvlb90p8bi.R.inc(18079);phiHessian[2][2] = 2 * rho * zOr3 / r;

            // upper-right part is symmetric
            __CLR4_4_1duvduvlb90p8bi.R.inc(18080);phiHessian[0][1] = phiHessian[1][0];
            __CLR4_4_1duvduvlb90p8bi.R.inc(18081);phiHessian[0][2] = phiHessian[2][0];
            __CLR4_4_1duvduvlb90p8bi.R.inc(18082);phiHessian[1][2] = phiHessian[2][1];

        }

    }}finally{__CLR4_4_1duvduvlb90p8bi.R.flushNeeded();}}

    /**
     * Replace the instance with a data transfer object for serialization.
     * @return data transfer object that will be serialized
     */
    private Object writeReplace() {try{__CLR4_4_1duvduvlb90p8bi.R.inc(18083);
        __CLR4_4_1duvduvlb90p8bi.R.inc(18084);return new DataTransferObject(v.getX(), v.getY(), v.getZ());
    }finally{__CLR4_4_1duvduvlb90p8bi.R.flushNeeded();}}

    /** Internal class used only for serialization. */
    private static class DataTransferObject implements Serializable {

        /** Serializable UID. */
        private static final long serialVersionUID = 20130206L;

        /** Abscissa.
         * @serial
         */
        private final double x;

        /** Ordinate.
         * @serial
         */
        private final double y;

        /** Height.
         * @serial
         */
        private final double z;

        /** Simple constructor.
         * @param x abscissa
         * @param y ordinate
         * @param z height
         */
        public DataTransferObject(final double x, final double y, final double z) {try{__CLR4_4_1duvduvlb90p8bi.R.inc(18085);
            __CLR4_4_1duvduvlb90p8bi.R.inc(18086);this.x = x;
            __CLR4_4_1duvduvlb90p8bi.R.inc(18087);this.y = y;
            __CLR4_4_1duvduvlb90p8bi.R.inc(18088);this.z = z;
        }finally{__CLR4_4_1duvduvlb90p8bi.R.flushNeeded();}}

        /** Replace the deserialized data transfer object with a {@link SphericalCoordinates}.
         * @return replacement {@link SphericalCoordinates}
         */
        private Object readResolve() {try{__CLR4_4_1duvduvlb90p8bi.R.inc(18089);
            __CLR4_4_1duvduvlb90p8bi.R.inc(18090);return new SphericalCoordinates(new Vector3D(x, y, z));
        }finally{__CLR4_4_1duvduvlb90p8bi.R.flushNeeded();}}

    }

}
