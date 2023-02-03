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

/**
 * This class is a utility representing a rotation order specification
 * for Cardan or Euler angles specification.
 *
 * This class cannot be instanciated by the user. He can only use one
 * of the twelve predefined supported orders as an argument to either
 * the {@link Rotation#Rotation(RotationOrder,double,double,double)}
 * constructor or the {@link Rotation#getAngles} method.
 *
 * @version $Id$
 * @since 1.2
 */
public final class RotationOrder {public static class __CLR4_4_1du8du8lb90p8b4{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,17949,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** Set of Cardan angles.
     * this ordered set of rotations is around X, then around Y, then
     * around Z
     */
    public static final RotationOrder XYZ =
      new RotationOrder("XYZ", Vector3D.PLUS_I, Vector3D.PLUS_J, Vector3D.PLUS_K);

    /** Set of Cardan angles.
     * this ordered set of rotations is around X, then around Z, then
     * around Y
     */
    public static final RotationOrder XZY =
      new RotationOrder("XZY", Vector3D.PLUS_I, Vector3D.PLUS_K, Vector3D.PLUS_J);

    /** Set of Cardan angles.
     * this ordered set of rotations is around Y, then around X, then
     * around Z
     */
    public static final RotationOrder YXZ =
      new RotationOrder("YXZ", Vector3D.PLUS_J, Vector3D.PLUS_I, Vector3D.PLUS_K);

    /** Set of Cardan angles.
     * this ordered set of rotations is around Y, then around Z, then
     * around X
     */
    public static final RotationOrder YZX =
      new RotationOrder("YZX", Vector3D.PLUS_J, Vector3D.PLUS_K, Vector3D.PLUS_I);

    /** Set of Cardan angles.
     * this ordered set of rotations is around Z, then around X, then
     * around Y
     */
    public static final RotationOrder ZXY =
      new RotationOrder("ZXY", Vector3D.PLUS_K, Vector3D.PLUS_I, Vector3D.PLUS_J);

    /** Set of Cardan angles.
     * this ordered set of rotations is around Z, then around Y, then
     * around X
     */
    public static final RotationOrder ZYX =
      new RotationOrder("ZYX", Vector3D.PLUS_K, Vector3D.PLUS_J, Vector3D.PLUS_I);

    /** Set of Euler angles.
     * this ordered set of rotations is around X, then around Y, then
     * around X
     */
    public static final RotationOrder XYX =
      new RotationOrder("XYX", Vector3D.PLUS_I, Vector3D.PLUS_J, Vector3D.PLUS_I);

    /** Set of Euler angles.
     * this ordered set of rotations is around X, then around Z, then
     * around X
     */
    public static final RotationOrder XZX =
      new RotationOrder("XZX", Vector3D.PLUS_I, Vector3D.PLUS_K, Vector3D.PLUS_I);

    /** Set of Euler angles.
     * this ordered set of rotations is around Y, then around X, then
     * around Y
     */
    public static final RotationOrder YXY =
      new RotationOrder("YXY", Vector3D.PLUS_J, Vector3D.PLUS_I, Vector3D.PLUS_J);

    /** Set of Euler angles.
     * this ordered set of rotations is around Y, then around Z, then
     * around Y
     */
    public static final RotationOrder YZY =
      new RotationOrder("YZY", Vector3D.PLUS_J, Vector3D.PLUS_K, Vector3D.PLUS_J);

    /** Set of Euler angles.
     * this ordered set of rotations is around Z, then around X, then
     * around Z
     */
    public static final RotationOrder ZXZ =
      new RotationOrder("ZXZ", Vector3D.PLUS_K, Vector3D.PLUS_I, Vector3D.PLUS_K);

    /** Set of Euler angles.
     * this ordered set of rotations is around Z, then around Y, then
     * around Z
     */
    public static final RotationOrder ZYZ =
      new RotationOrder("ZYZ", Vector3D.PLUS_K, Vector3D.PLUS_J, Vector3D.PLUS_K);

    /** Name of the rotations order. */
    private final String name;

    /** Axis of the first rotation. */
    private final Vector3D a1;

    /** Axis of the second rotation. */
    private final Vector3D a2;

    /** Axis of the third rotation. */
    private final Vector3D a3;

    /** Private constructor.
     * This is a utility class that cannot be instantiated by the user,
     * so its only constructor is private.
     * @param name name of the rotation order
     * @param a1 axis of the first rotation
     * @param a2 axis of the second rotation
     * @param a3 axis of the third rotation
     */
    private RotationOrder(final String name,
                          final Vector3D a1, final Vector3D a2, final Vector3D a3) {try{__CLR4_4_1du8du8lb90p8b4.R.inc(17936);
        __CLR4_4_1du8du8lb90p8b4.R.inc(17937);this.name = name;
        __CLR4_4_1du8du8lb90p8b4.R.inc(17938);this.a1   = a1;
        __CLR4_4_1du8du8lb90p8b4.R.inc(17939);this.a2   = a2;
        __CLR4_4_1du8du8lb90p8b4.R.inc(17940);this.a3   = a3;
    }finally{__CLR4_4_1du8du8lb90p8b4.R.flushNeeded();}}

    /** Get a string representation of the instance.
     * @return a string representation of the instance (in fact, its name)
     */
    @Override
    public String toString() {try{__CLR4_4_1du8du8lb90p8b4.R.inc(17941);
        __CLR4_4_1du8du8lb90p8b4.R.inc(17942);return name;
    }finally{__CLR4_4_1du8du8lb90p8b4.R.flushNeeded();}}

    /** Get the axis of the first rotation.
     * @return axis of the first rotation
     */
    public Vector3D getA1() {try{__CLR4_4_1du8du8lb90p8b4.R.inc(17943);
        __CLR4_4_1du8du8lb90p8b4.R.inc(17944);return a1;
    }finally{__CLR4_4_1du8du8lb90p8b4.R.flushNeeded();}}

    /** Get the axis of the second rotation.
     * @return axis of the second rotation
     */
    public Vector3D getA2() {try{__CLR4_4_1du8du8lb90p8b4.R.inc(17945);
        __CLR4_4_1du8du8lb90p8b4.R.inc(17946);return a2;
    }finally{__CLR4_4_1du8du8lb90p8b4.R.flushNeeded();}}

    /** Get the axis of the second rotation.
     * @return axis of the second rotation
     */
    public Vector3D getA3() {try{__CLR4_4_1du8du8lb90p8b4.R.inc(17947);
        __CLR4_4_1du8du8lb90p8b4.R.inc(17948);return a3;
    }finally{__CLR4_4_1du8du8lb90p8b4.R.flushNeeded();}}

}
