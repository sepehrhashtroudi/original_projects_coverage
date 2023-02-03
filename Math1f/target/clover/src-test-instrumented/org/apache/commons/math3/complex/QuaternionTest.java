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

import java.util.Random;
import org.apache.commons.math3.complex.Quaternion;
import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.exception.ZeroException;
import org.apache.commons.math3.geometry.euclidean.threed.Rotation;
import org.apache.commons.math3.geometry.euclidean.threed.Vector3D;
import org.apache.commons.math3.util.FastMath;
import org.junit.Test;
import org.junit.Assert;

public class QuaternionTest {static class __CLR4_4_11hx91hx9lb90pc7j{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,70144,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /** Epsilon for double comparison. */
    private static final double EPS = Math.ulp(1d);
    /** Epsilon for double comparison. */
    private static final double COMPARISON_EPS = 1e-14;

    @Test
    public final void testAccessors1() {__CLR4_4_11hx91hx9lb90pc7j.R.globalSliceStart(getClass().getName(),69885);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19tp35q1hx9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11hx91hx9lb90pc7j.R.rethrow($CLV_t2$);}finally{__CLR4_4_11hx91hx9lb90pc7j.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.complex.QuaternionTest.testAccessors1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69885,$CLV_p$,$CLV_t$);}}private final void  __CLR4_4_19tp35q1hx9(){try{__CLR4_4_11hx91hx9lb90pc7j.R.inc(69885);
        __CLR4_4_11hx91hx9lb90pc7j.R.inc(69886);final double q0 = 2;
        __CLR4_4_11hx91hx9lb90pc7j.R.inc(69887);final double q1 = 5.4;
        __CLR4_4_11hx91hx9lb90pc7j.R.inc(69888);final double q2 = 17;
        __CLR4_4_11hx91hx9lb90pc7j.R.inc(69889);final double q3 = 0.0005;
        __CLR4_4_11hx91hx9lb90pc7j.R.inc(69890);final Quaternion q = new Quaternion(q0, q1, q2, q3);

        __CLR4_4_11hx91hx9lb90pc7j.R.inc(69891);Assert.assertEquals(q0, q.getQ0(), 0);
        __CLR4_4_11hx91hx9lb90pc7j.R.inc(69892);Assert.assertEquals(q1, q.getQ1(), 0);
        __CLR4_4_11hx91hx9lb90pc7j.R.inc(69893);Assert.assertEquals(q2, q.getQ2(), 0);
        __CLR4_4_11hx91hx9lb90pc7j.R.inc(69894);Assert.assertEquals(q3, q.getQ3(), 0);
    }finally{__CLR4_4_11hx91hx9lb90pc7j.R.flushNeeded();}}

    @Test
    public final void testAccessors2() {__CLR4_4_11hx91hx9lb90pc7j.R.globalSliceStart(getClass().getName(),69895);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1d2p1y71hxj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11hx91hx9lb90pc7j.R.rethrow($CLV_t2$);}finally{__CLR4_4_11hx91hx9lb90pc7j.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.complex.QuaternionTest.testAccessors2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69895,$CLV_p$,$CLV_t$);}}private final void  __CLR4_4_1d2p1y71hxj(){try{__CLR4_4_11hx91hx9lb90pc7j.R.inc(69895);
        __CLR4_4_11hx91hx9lb90pc7j.R.inc(69896);final double q0 = 2;
        __CLR4_4_11hx91hx9lb90pc7j.R.inc(69897);final double q1 = 5.4;
        __CLR4_4_11hx91hx9lb90pc7j.R.inc(69898);final double q2 = 17;
        __CLR4_4_11hx91hx9lb90pc7j.R.inc(69899);final double q3 = 0.0005;
        __CLR4_4_11hx91hx9lb90pc7j.R.inc(69900);final Quaternion q = new Quaternion(q0, q1, q2, q3);

        __CLR4_4_11hx91hx9lb90pc7j.R.inc(69901);final double sP = q.getScalarPart();
        __CLR4_4_11hx91hx9lb90pc7j.R.inc(69902);final double[] vP = q.getVectorPart();

        __CLR4_4_11hx91hx9lb90pc7j.R.inc(69903);Assert.assertEquals(q0, sP, 0);
        __CLR4_4_11hx91hx9lb90pc7j.R.inc(69904);Assert.assertEquals(q1, vP[0], 0);
        __CLR4_4_11hx91hx9lb90pc7j.R.inc(69905);Assert.assertEquals(q2, vP[1], 0);
        __CLR4_4_11hx91hx9lb90pc7j.R.inc(69906);Assert.assertEquals(q3, vP[2], 0);
    }finally{__CLR4_4_11hx91hx9lb90pc7j.R.flushNeeded();}}

    @Test
    public final void testAccessors3() {__CLR4_4_11hx91hx9lb90pc7j.R.globalSliceStart(getClass().getName(),69907);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gbp0qo1hxv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11hx91hx9lb90pc7j.R.rethrow($CLV_t2$);}finally{__CLR4_4_11hx91hx9lb90pc7j.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.complex.QuaternionTest.testAccessors3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69907,$CLV_p$,$CLV_t$);}}private final void  __CLR4_4_1gbp0qo1hxv(){try{__CLR4_4_11hx91hx9lb90pc7j.R.inc(69907);
        __CLR4_4_11hx91hx9lb90pc7j.R.inc(69908);final double q0 = 2;
        __CLR4_4_11hx91hx9lb90pc7j.R.inc(69909);final double q1 = 5.4;
        __CLR4_4_11hx91hx9lb90pc7j.R.inc(69910);final double q2 = 17;
        __CLR4_4_11hx91hx9lb90pc7j.R.inc(69911);final double q3 = 0.0005;
        __CLR4_4_11hx91hx9lb90pc7j.R.inc(69912);final Quaternion q = new Quaternion(q0, new double[] { q1, q2, q3 });

        __CLR4_4_11hx91hx9lb90pc7j.R.inc(69913);final double sP = q.getScalarPart();
        __CLR4_4_11hx91hx9lb90pc7j.R.inc(69914);final double[] vP = q.getVectorPart();

        __CLR4_4_11hx91hx9lb90pc7j.R.inc(69915);Assert.assertEquals(q0, sP, 0);
        __CLR4_4_11hx91hx9lb90pc7j.R.inc(69916);Assert.assertEquals(q1, vP[0], 0);
        __CLR4_4_11hx91hx9lb90pc7j.R.inc(69917);Assert.assertEquals(q2, vP[1], 0);
        __CLR4_4_11hx91hx9lb90pc7j.R.inc(69918);Assert.assertEquals(q3, vP[2], 0);
    }finally{__CLR4_4_11hx91hx9lb90pc7j.R.flushNeeded();}}

    @Test(expected=DimensionMismatchException.class)
    public void testWrongDimension() {__CLR4_4_11hx91hx9lb90pc7j.R.globalSliceStart(getClass().getName(),69919);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rgoocy1hy7();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,87,114,111,110,103,68,105,109,101,110,115,105,111,110,58,32,91,68,105,109,101,110,115,105,111,110,77,105,115,109,97,116,99,104,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof DimensionMismatchException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11hx91hx9lb90pc7j.R.rethrow($CLV_t2$);}finally{__CLR4_4_11hx91hx9lb90pc7j.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.complex.QuaternionTest.testWrongDimension",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69919,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rgoocy1hy7(){try{__CLR4_4_11hx91hx9lb90pc7j.R.inc(69919);
        __CLR4_4_11hx91hx9lb90pc7j.R.inc(69920);new Quaternion(new double[] { 1, 2 });
    }finally{__CLR4_4_11hx91hx9lb90pc7j.R.flushNeeded();}}
    
    @Test
    public final void testConjugate() {__CLR4_4_11hx91hx9lb90pc7j.R.globalSliceStart(getClass().getName(),69921);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ylifkj1hy9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11hx91hx9lb90pc7j.R.rethrow($CLV_t2$);}finally{__CLR4_4_11hx91hx9lb90pc7j.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.complex.QuaternionTest.testConjugate",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69921,$CLV_p$,$CLV_t$);}}private final void  __CLR4_4_1ylifkj1hy9(){try{__CLR4_4_11hx91hx9lb90pc7j.R.inc(69921);
        __CLR4_4_11hx91hx9lb90pc7j.R.inc(69922);final double q0 = 2;
        __CLR4_4_11hx91hx9lb90pc7j.R.inc(69923);final double q1 = 5.4;
        __CLR4_4_11hx91hx9lb90pc7j.R.inc(69924);final double q2 = 17;
        __CLR4_4_11hx91hx9lb90pc7j.R.inc(69925);final double q3 = 0.0005;
        __CLR4_4_11hx91hx9lb90pc7j.R.inc(69926);final Quaternion q = new Quaternion(q0, q1, q2, q3);

        __CLR4_4_11hx91hx9lb90pc7j.R.inc(69927);final Quaternion qConjugate = q.getConjugate();

        __CLR4_4_11hx91hx9lb90pc7j.R.inc(69928);Assert.assertEquals(q0, qConjugate.getQ0(), 0);
        __CLR4_4_11hx91hx9lb90pc7j.R.inc(69929);Assert.assertEquals(-q1, qConjugate.getQ1(), 0);
        __CLR4_4_11hx91hx9lb90pc7j.R.inc(69930);Assert.assertEquals(-q2, qConjugate.getQ2(), 0);
        __CLR4_4_11hx91hx9lb90pc7j.R.inc(69931);Assert.assertEquals(-q3, qConjugate.getQ3(), 0);
    }finally{__CLR4_4_11hx91hx9lb90pc7j.R.flushNeeded();}}

    @Test
    public final void testProductQuaternionQuaternion() {__CLR4_4_11hx91hx9lb90pc7j.R.globalSliceStart(getClass().getName(),69932);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qacn8g1hyk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11hx91hx9lb90pc7j.R.rethrow($CLV_t2$);}finally{__CLR4_4_11hx91hx9lb90pc7j.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.complex.QuaternionTest.testProductQuaternionQuaternion",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69932,$CLV_p$,$CLV_t$);}}private final void  __CLR4_4_1qacn8g1hyk(){try{__CLR4_4_11hx91hx9lb90pc7j.R.inc(69932);

        // Case : analytic test case

        __CLR4_4_11hx91hx9lb90pc7j.R.inc(69933);final Quaternion qA = new Quaternion(1, 0.5, -3, 4);
        __CLR4_4_11hx91hx9lb90pc7j.R.inc(69934);final Quaternion qB = new Quaternion(6, 2, 1, -9);
        __CLR4_4_11hx91hx9lb90pc7j.R.inc(69935);final Quaternion qResult = Quaternion.multiply(qA, qB);

        __CLR4_4_11hx91hx9lb90pc7j.R.inc(69936);Assert.assertEquals(44, qResult.getQ0(), EPS);
        __CLR4_4_11hx91hx9lb90pc7j.R.inc(69937);Assert.assertEquals(28, qResult.getQ1(), EPS);
        __CLR4_4_11hx91hx9lb90pc7j.R.inc(69938);Assert.assertEquals(-4.5, qResult.getQ2(), EPS);
        __CLR4_4_11hx91hx9lb90pc7j.R.inc(69939);Assert.assertEquals(21.5, qResult.getQ3(), EPS);

        // comparison with the result given by the formula :
        // qResult = (scalarA * scalarB - vectorA . vectorB) + (scalarA * vectorB + scalarB * vectorA + vectorA ^
        // vectorB)

        __CLR4_4_11hx91hx9lb90pc7j.R.inc(69940);final Vector3D vectorA = new Vector3D(qA.getVectorPart());
        __CLR4_4_11hx91hx9lb90pc7j.R.inc(69941);final Vector3D vectorB = new Vector3D(qB.getVectorPart());
        __CLR4_4_11hx91hx9lb90pc7j.R.inc(69942);final Vector3D vectorResult = new Vector3D(qResult.getVectorPart());

        __CLR4_4_11hx91hx9lb90pc7j.R.inc(69943);final double scalarPartRef = qA.getScalarPart() * qB.getScalarPart() - Vector3D.dotProduct(vectorA, vectorB);

        __CLR4_4_11hx91hx9lb90pc7j.R.inc(69944);Assert.assertEquals(scalarPartRef, qResult.getScalarPart(), EPS);

        __CLR4_4_11hx91hx9lb90pc7j.R.inc(69945);final Vector3D vectorPartRef = ((vectorA.scalarMultiply(qB.getScalarPart())).add(vectorB.scalarMultiply(qA
                .getScalarPart()))).add(Vector3D.crossProduct(vectorA, vectorB));
        __CLR4_4_11hx91hx9lb90pc7j.R.inc(69946);final double norm = (vectorResult.subtract(vectorPartRef)).getNorm();

        __CLR4_4_11hx91hx9lb90pc7j.R.inc(69947);Assert.assertEquals(0, norm, EPS);

        // Conjugate of the product of two quaternions and product of their conjugates :
        // Conj(qA * qB) = Conj(qB) * Conj(qA)

        __CLR4_4_11hx91hx9lb90pc7j.R.inc(69948);final Quaternion conjugateOfProduct = qB.getConjugate().multiply(qA.getConjugate());
        __CLR4_4_11hx91hx9lb90pc7j.R.inc(69949);final Quaternion productOfConjugate = (qA.multiply(qB)).getConjugate();

        __CLR4_4_11hx91hx9lb90pc7j.R.inc(69950);Assert.assertEquals(conjugateOfProduct.getQ0(), productOfConjugate.getQ0(), EPS);
        __CLR4_4_11hx91hx9lb90pc7j.R.inc(69951);Assert.assertEquals(conjugateOfProduct.getQ1(), productOfConjugate.getQ1(), EPS);
        __CLR4_4_11hx91hx9lb90pc7j.R.inc(69952);Assert.assertEquals(conjugateOfProduct.getQ2(), productOfConjugate.getQ2(), EPS);
        __CLR4_4_11hx91hx9lb90pc7j.R.inc(69953);Assert.assertEquals(conjugateOfProduct.getQ3(), productOfConjugate.getQ3(), EPS);
    }finally{__CLR4_4_11hx91hx9lb90pc7j.R.flushNeeded();}}

    @Test
    public final void testProductQuaternionVector() {__CLR4_4_11hx91hx9lb90pc7j.R.globalSliceStart(getClass().getName(),69954);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1p1mf6j1hz6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11hx91hx9lb90pc7j.R.rethrow($CLV_t2$);}finally{__CLR4_4_11hx91hx9lb90pc7j.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.complex.QuaternionTest.testProductQuaternionVector",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69954,$CLV_p$,$CLV_t$);}}private final void  __CLR4_4_1p1mf6j1hz6(){try{__CLR4_4_11hx91hx9lb90pc7j.R.inc(69954);

        // Case : Product between a vector and a quaternion : QxV

        __CLR4_4_11hx91hx9lb90pc7j.R.inc(69955);final Quaternion quaternion = new Quaternion(4, 7, -1, 2);
        __CLR4_4_11hx91hx9lb90pc7j.R.inc(69956);final double[] vector = {2.0, 1.0, 3.0};
        __CLR4_4_11hx91hx9lb90pc7j.R.inc(69957);final Quaternion qResultQxV = Quaternion.multiply(quaternion, new Quaternion(vector));

        __CLR4_4_11hx91hx9lb90pc7j.R.inc(69958);Assert.assertEquals(-19, qResultQxV.getQ0(), EPS);
        __CLR4_4_11hx91hx9lb90pc7j.R.inc(69959);Assert.assertEquals(3, qResultQxV.getQ1(), EPS);
        __CLR4_4_11hx91hx9lb90pc7j.R.inc(69960);Assert.assertEquals(-13, qResultQxV.getQ2(), EPS);
        __CLR4_4_11hx91hx9lb90pc7j.R.inc(69961);Assert.assertEquals(21, qResultQxV.getQ3(), EPS);

        // comparison with the result given by the formula :
        // qResult = (- vectorQ . vector) + (scalarQ * vector + vectorQ ^ vector)

        __CLR4_4_11hx91hx9lb90pc7j.R.inc(69962);final double[] vectorQ = quaternion.getVectorPart();
        __CLR4_4_11hx91hx9lb90pc7j.R.inc(69963);final double[] vectorResultQxV = qResultQxV.getVectorPart();

        __CLR4_4_11hx91hx9lb90pc7j.R.inc(69964);final double scalarPartRefQxV = -Vector3D.dotProduct(new Vector3D(vectorQ), new Vector3D(vector));
        __CLR4_4_11hx91hx9lb90pc7j.R.inc(69965);Assert.assertEquals(scalarPartRefQxV, qResultQxV.getScalarPart(), EPS);

        __CLR4_4_11hx91hx9lb90pc7j.R.inc(69966);final Vector3D vectorPartRefQxV = (new Vector3D(vector).scalarMultiply(quaternion.getScalarPart())).add(Vector3D
                .crossProduct(new Vector3D(vectorQ), new Vector3D(vector)));
        __CLR4_4_11hx91hx9lb90pc7j.R.inc(69967);final double normQxV = (new Vector3D(vectorResultQxV).subtract(vectorPartRefQxV)).getNorm();
        __CLR4_4_11hx91hx9lb90pc7j.R.inc(69968);Assert.assertEquals(0, normQxV, EPS);

        // Case : Product between a vector and a quaternion : VxQ

        __CLR4_4_11hx91hx9lb90pc7j.R.inc(69969);final Quaternion qResultVxQ = Quaternion.multiply(new Quaternion(vector), quaternion);

        __CLR4_4_11hx91hx9lb90pc7j.R.inc(69970);Assert.assertEquals(-19, qResultVxQ.getQ0(), EPS);
        __CLR4_4_11hx91hx9lb90pc7j.R.inc(69971);Assert.assertEquals(13, qResultVxQ.getQ1(), EPS);
        __CLR4_4_11hx91hx9lb90pc7j.R.inc(69972);Assert.assertEquals(21, qResultVxQ.getQ2(), EPS);
        __CLR4_4_11hx91hx9lb90pc7j.R.inc(69973);Assert.assertEquals(3, qResultVxQ.getQ3(), EPS);

        __CLR4_4_11hx91hx9lb90pc7j.R.inc(69974);final double[] vectorResultVxQ = qResultVxQ.getVectorPart();

        // comparison with the result given by the formula :
        // qResult = (- vector . vectorQ) + (scalarQ * vector + vector ^ vectorQ)

        __CLR4_4_11hx91hx9lb90pc7j.R.inc(69975);final double scalarPartRefVxQ = -Vector3D.dotProduct(new Vector3D(vectorQ), new Vector3D(vector));
        __CLR4_4_11hx91hx9lb90pc7j.R.inc(69976);Assert.assertEquals(scalarPartRefVxQ, qResultVxQ.getScalarPart(), EPS);

        __CLR4_4_11hx91hx9lb90pc7j.R.inc(69977);final Vector3D vectorPartRefVxQ = (new Vector3D(vector).scalarMultiply(quaternion.getScalarPart())).add(Vector3D
                .crossProduct(new Vector3D(vector), new Vector3D(vectorQ)));
        __CLR4_4_11hx91hx9lb90pc7j.R.inc(69978);final double normVxQ = (new Vector3D(vectorResultVxQ).subtract(vectorPartRefVxQ)).getNorm();
        __CLR4_4_11hx91hx9lb90pc7j.R.inc(69979);Assert.assertEquals(0, normVxQ, EPS);
    }finally{__CLR4_4_11hx91hx9lb90pc7j.R.flushNeeded();}}

    @Test
    public final void testDotProductQuaternionQuaternion() {__CLR4_4_11hx91hx9lb90pc7j.R.globalSliceStart(getClass().getName(),69980);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1c1897p1hzw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11hx91hx9lb90pc7j.R.rethrow($CLV_t2$);}finally{__CLR4_4_11hx91hx9lb90pc7j.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.complex.QuaternionTest.testDotProductQuaternionQuaternion",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69980,$CLV_p$,$CLV_t$);}}private final void  __CLR4_4_1c1897p1hzw(){try{__CLR4_4_11hx91hx9lb90pc7j.R.inc(69980);
        // expected output
        __CLR4_4_11hx91hx9lb90pc7j.R.inc(69981);final double expected = -6.;
        // inputs
        __CLR4_4_11hx91hx9lb90pc7j.R.inc(69982);final Quaternion q1 = new Quaternion(1, 2, 2, 1);
        __CLR4_4_11hx91hx9lb90pc7j.R.inc(69983);final Quaternion q2 = new Quaternion(3, -2, -1, -3);

        __CLR4_4_11hx91hx9lb90pc7j.R.inc(69984);final double actual1 = Quaternion.dotProduct(q1, q2);
        __CLR4_4_11hx91hx9lb90pc7j.R.inc(69985);final double actual2 = q1.dotProduct(q2);

        __CLR4_4_11hx91hx9lb90pc7j.R.inc(69986);Assert.assertEquals(expected, actual1, EPS);
        __CLR4_4_11hx91hx9lb90pc7j.R.inc(69987);Assert.assertEquals(expected, actual2, EPS);
    }finally{__CLR4_4_11hx91hx9lb90pc7j.R.flushNeeded();}}

    @Test
    public final void testScalarMultiplyDouble() {__CLR4_4_11hx91hx9lb90pc7j.R.globalSliceStart(getClass().getName(),69988);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rolpyy1i04();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11hx91hx9lb90pc7j.R.rethrow($CLV_t2$);}finally{__CLR4_4_11hx91hx9lb90pc7j.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.complex.QuaternionTest.testScalarMultiplyDouble",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69988,$CLV_p$,$CLV_t$);}}private final void  __CLR4_4_1rolpyy1i04(){try{__CLR4_4_11hx91hx9lb90pc7j.R.inc(69988);
        // expected outputs
        __CLR4_4_11hx91hx9lb90pc7j.R.inc(69989);final double w = 1.6;
        __CLR4_4_11hx91hx9lb90pc7j.R.inc(69990);final double x = -4.8;
        __CLR4_4_11hx91hx9lb90pc7j.R.inc(69991);final double y = 11.20;
        __CLR4_4_11hx91hx9lb90pc7j.R.inc(69992);final double z = 2.56;
        // inputs
        __CLR4_4_11hx91hx9lb90pc7j.R.inc(69993);final Quaternion q1 = new Quaternion(0.5, -1.5, 3.5, 0.8);
        __CLR4_4_11hx91hx9lb90pc7j.R.inc(69994);final double a = 3.2;

        __CLR4_4_11hx91hx9lb90pc7j.R.inc(69995);final Quaternion q = q1.multiply(a);

        __CLR4_4_11hx91hx9lb90pc7j.R.inc(69996);Assert.assertEquals(w, q.getQ0(), COMPARISON_EPS);
        __CLR4_4_11hx91hx9lb90pc7j.R.inc(69997);Assert.assertEquals(x, q.getQ1(), COMPARISON_EPS);
        __CLR4_4_11hx91hx9lb90pc7j.R.inc(69998);Assert.assertEquals(y, q.getQ2(), COMPARISON_EPS);
        __CLR4_4_11hx91hx9lb90pc7j.R.inc(69999);Assert.assertEquals(z, q.getQ3(), COMPARISON_EPS);
    }finally{__CLR4_4_11hx91hx9lb90pc7j.R.flushNeeded();}}

    @Test
    public final void testAddQuaternionQuaternion() {__CLR4_4_11hx91hx9lb90pc7j.R.globalSliceStart(getClass().getName(),70000);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1w3d5hu1i0g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11hx91hx9lb90pc7j.R.rethrow($CLV_t2$);}finally{__CLR4_4_11hx91hx9lb90pc7j.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.complex.QuaternionTest.testAddQuaternionQuaternion",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),70000,$CLV_p$,$CLV_t$);}}private final void  __CLR4_4_1w3d5hu1i0g(){try{__CLR4_4_11hx91hx9lb90pc7j.R.inc(70000);
        // expected outputs
        __CLR4_4_11hx91hx9lb90pc7j.R.inc(70001);final double w = 4;
        __CLR4_4_11hx91hx9lb90pc7j.R.inc(70002);final double x = -1;
        __CLR4_4_11hx91hx9lb90pc7j.R.inc(70003);final double y = 2;
        __CLR4_4_11hx91hx9lb90pc7j.R.inc(70004);final double z = -4;
        // inputs
        __CLR4_4_11hx91hx9lb90pc7j.R.inc(70005);final Quaternion q1 = new Quaternion(1., 2., -2., -1.);
        __CLR4_4_11hx91hx9lb90pc7j.R.inc(70006);final Quaternion q2 = new Quaternion(3., -3., 4., -3.);

        __CLR4_4_11hx91hx9lb90pc7j.R.inc(70007);final Quaternion qa = Quaternion.add(q1, q2);
        __CLR4_4_11hx91hx9lb90pc7j.R.inc(70008);final Quaternion qb = q1.add(q2);

        __CLR4_4_11hx91hx9lb90pc7j.R.inc(70009);Assert.assertEquals(w, qa.getQ0(), EPS);
        __CLR4_4_11hx91hx9lb90pc7j.R.inc(70010);Assert.assertEquals(x, qa.getQ1(), EPS);
        __CLR4_4_11hx91hx9lb90pc7j.R.inc(70011);Assert.assertEquals(y, qa.getQ2(), EPS);
        __CLR4_4_11hx91hx9lb90pc7j.R.inc(70012);Assert.assertEquals(z, qa.getQ3(), EPS);

        __CLR4_4_11hx91hx9lb90pc7j.R.inc(70013);Assert.assertEquals(w, qb.getQ0(), EPS);
        __CLR4_4_11hx91hx9lb90pc7j.R.inc(70014);Assert.assertEquals(x, qb.getQ1(), EPS);
        __CLR4_4_11hx91hx9lb90pc7j.R.inc(70015);Assert.assertEquals(y, qb.getQ2(), EPS);
        __CLR4_4_11hx91hx9lb90pc7j.R.inc(70016);Assert.assertEquals(z, qb.getQ3(), EPS);
    }finally{__CLR4_4_11hx91hx9lb90pc7j.R.flushNeeded();}}

    @Test
    public final void testSubtractQuaternionQuaternion() {__CLR4_4_11hx91hx9lb90pc7j.R.globalSliceStart(getClass().getName(),70017);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17h35jd1i0x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11hx91hx9lb90pc7j.R.rethrow($CLV_t2$);}finally{__CLR4_4_11hx91hx9lb90pc7j.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.complex.QuaternionTest.testSubtractQuaternionQuaternion",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),70017,$CLV_p$,$CLV_t$);}}private final void  __CLR4_4_17h35jd1i0x(){try{__CLR4_4_11hx91hx9lb90pc7j.R.inc(70017);
        // expected outputs
        __CLR4_4_11hx91hx9lb90pc7j.R.inc(70018);final double w = -2.;
        __CLR4_4_11hx91hx9lb90pc7j.R.inc(70019);final double x = 5.;
        __CLR4_4_11hx91hx9lb90pc7j.R.inc(70020);final double y = -6.;
        __CLR4_4_11hx91hx9lb90pc7j.R.inc(70021);final double z = 2.;
        // inputs
        __CLR4_4_11hx91hx9lb90pc7j.R.inc(70022);final Quaternion q1 = new Quaternion(1., 2., -2., -1.);
        __CLR4_4_11hx91hx9lb90pc7j.R.inc(70023);final Quaternion q2 = new Quaternion(3., -3., 4., -3.);

        __CLR4_4_11hx91hx9lb90pc7j.R.inc(70024);final Quaternion qa = Quaternion.subtract(q1, q2);
        __CLR4_4_11hx91hx9lb90pc7j.R.inc(70025);final Quaternion qb = q1.subtract(q2);

        __CLR4_4_11hx91hx9lb90pc7j.R.inc(70026);Assert.assertEquals(w, qa.getQ0(), EPS);
        __CLR4_4_11hx91hx9lb90pc7j.R.inc(70027);Assert.assertEquals(x, qa.getQ1(), EPS);
        __CLR4_4_11hx91hx9lb90pc7j.R.inc(70028);Assert.assertEquals(y, qa.getQ2(), EPS);
        __CLR4_4_11hx91hx9lb90pc7j.R.inc(70029);Assert.assertEquals(z, qa.getQ3(), EPS);

        __CLR4_4_11hx91hx9lb90pc7j.R.inc(70030);Assert.assertEquals(w, qb.getQ0(), EPS);
        __CLR4_4_11hx91hx9lb90pc7j.R.inc(70031);Assert.assertEquals(x, qb.getQ1(), EPS);
        __CLR4_4_11hx91hx9lb90pc7j.R.inc(70032);Assert.assertEquals(y, qb.getQ2(), EPS);
        __CLR4_4_11hx91hx9lb90pc7j.R.inc(70033);Assert.assertEquals(z, qb.getQ3(), EPS);
}finally{__CLR4_4_11hx91hx9lb90pc7j.R.flushNeeded();}}

    @Test
    public final void testNorm() {__CLR4_4_11hx91hx9lb90pc7j.R.globalSliceStart(getClass().getName(),70034);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rs5o971i1e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11hx91hx9lb90pc7j.R.rethrow($CLV_t2$);}finally{__CLR4_4_11hx91hx9lb90pc7j.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.complex.QuaternionTest.testNorm",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),70034,$CLV_p$,$CLV_t$);}}private final void  __CLR4_4_1rs5o971i1e(){try{__CLR4_4_11hx91hx9lb90pc7j.R.inc(70034);

        __CLR4_4_11hx91hx9lb90pc7j.R.inc(70035);final double q0 = 2;
        __CLR4_4_11hx91hx9lb90pc7j.R.inc(70036);final double q1 = 1;
        __CLR4_4_11hx91hx9lb90pc7j.R.inc(70037);final double q2 = -4;
        __CLR4_4_11hx91hx9lb90pc7j.R.inc(70038);final double q3 = 3;
        __CLR4_4_11hx91hx9lb90pc7j.R.inc(70039);final Quaternion q = new Quaternion(q0, q1, q2, q3);

        __CLR4_4_11hx91hx9lb90pc7j.R.inc(70040);final double norm = q.getNorm();

        __CLR4_4_11hx91hx9lb90pc7j.R.inc(70041);Assert.assertEquals(Math.sqrt(30), norm, 0);

        __CLR4_4_11hx91hx9lb90pc7j.R.inc(70042);final double normSquareRef = Quaternion.multiply(q, q.getConjugate()).getScalarPart();
        __CLR4_4_11hx91hx9lb90pc7j.R.inc(70043);Assert.assertEquals(Math.sqrt(normSquareRef), norm, 0);
    }finally{__CLR4_4_11hx91hx9lb90pc7j.R.flushNeeded();}}

    @Test
    public final void testNormalize() {__CLR4_4_11hx91hx9lb90pc7j.R.globalSliceStart(getClass().getName(),70044);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1i0t4se1i1o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11hx91hx9lb90pc7j.R.rethrow($CLV_t2$);}finally{__CLR4_4_11hx91hx9lb90pc7j.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.complex.QuaternionTest.testNormalize",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),70044,$CLV_p$,$CLV_t$);}}private final void  __CLR4_4_1i0t4se1i1o(){try{__CLR4_4_11hx91hx9lb90pc7j.R.inc(70044);

        __CLR4_4_11hx91hx9lb90pc7j.R.inc(70045);final Quaternion q = new Quaternion(2, 1, -4, -2);

        __CLR4_4_11hx91hx9lb90pc7j.R.inc(70046);final Quaternion versor = q.normalize();

        __CLR4_4_11hx91hx9lb90pc7j.R.inc(70047);Assert.assertEquals(2.0 / 5.0, versor.getQ0(), 0);
        __CLR4_4_11hx91hx9lb90pc7j.R.inc(70048);Assert.assertEquals(1.0 / 5.0, versor.getQ1(), 0);
        __CLR4_4_11hx91hx9lb90pc7j.R.inc(70049);Assert.assertEquals(-4.0 / 5.0, versor.getQ2(), 0);
        __CLR4_4_11hx91hx9lb90pc7j.R.inc(70050);Assert.assertEquals(-2.0 / 5.0, versor.getQ3(), 0);

        __CLR4_4_11hx91hx9lb90pc7j.R.inc(70051);Assert.assertEquals(1, versor.getNorm(), 0);
    }finally{__CLR4_4_11hx91hx9lb90pc7j.R.flushNeeded();}}

    @Test(expected=ZeroException.class)
    public final void testNormalizeFail() {__CLR4_4_11hx91hx9lb90pc7j.R.globalSliceStart(getClass().getName(),70052);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11a8zuo1i1w();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,78,111,114,109,97,108,105,122,101,70,97,105,108,58,32,91,90,101,114,111,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof ZeroException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11hx91hx9lb90pc7j.R.rethrow($CLV_t2$);}finally{__CLR4_4_11hx91hx9lb90pc7j.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.complex.QuaternionTest.testNormalizeFail",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),70052,$CLV_p$,$CLV_t$);}}private final void  __CLR4_4_11a8zuo1i1w(){try{__CLR4_4_11hx91hx9lb90pc7j.R.inc(70052);
        __CLR4_4_11hx91hx9lb90pc7j.R.inc(70053);final Quaternion zeroQ = new Quaternion(0, 0, 0, 0);
        __CLR4_4_11hx91hx9lb90pc7j.R.inc(70054);zeroQ.normalize();
    }finally{__CLR4_4_11hx91hx9lb90pc7j.R.flushNeeded();}}

    @Test
    public final void testObjectEquals() {__CLR4_4_11hx91hx9lb90pc7j.R.globalSliceStart(getClass().getName(),70055);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ykqnmx1i1z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11hx91hx9lb90pc7j.R.rethrow($CLV_t2$);}finally{__CLR4_4_11hx91hx9lb90pc7j.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.complex.QuaternionTest.testObjectEquals",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),70055,$CLV_p$,$CLV_t$);}}private final void  __CLR4_4_1ykqnmx1i1z(){try{__CLR4_4_11hx91hx9lb90pc7j.R.inc(70055);
        __CLR4_4_11hx91hx9lb90pc7j.R.inc(70056);final double one = 1;
        __CLR4_4_11hx91hx9lb90pc7j.R.inc(70057);final Quaternion q1 = new Quaternion(one, one, one, one);
        __CLR4_4_11hx91hx9lb90pc7j.R.inc(70058);Assert.assertTrue(q1.equals(q1));

        __CLR4_4_11hx91hx9lb90pc7j.R.inc(70059);final Quaternion q2 = new Quaternion(one, one, one, one);
        __CLR4_4_11hx91hx9lb90pc7j.R.inc(70060);Assert.assertTrue(q2.equals(q1));

        __CLR4_4_11hx91hx9lb90pc7j.R.inc(70061);final Quaternion q3 = new Quaternion(one, FastMath.nextUp(one), one, one);
        __CLR4_4_11hx91hx9lb90pc7j.R.inc(70062);Assert.assertFalse(q3.equals(q1));
    }finally{__CLR4_4_11hx91hx9lb90pc7j.R.flushNeeded();}}

    @Test
    public final void testQuaternionEquals() {__CLR4_4_11hx91hx9lb90pc7j.R.globalSliceStart(getClass().getName(),70063);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sbkrdi1i27();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11hx91hx9lb90pc7j.R.rethrow($CLV_t2$);}finally{__CLR4_4_11hx91hx9lb90pc7j.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.complex.QuaternionTest.testQuaternionEquals",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),70063,$CLV_p$,$CLV_t$);}}private final void  __CLR4_4_1sbkrdi1i27(){try{__CLR4_4_11hx91hx9lb90pc7j.R.inc(70063);
        __CLR4_4_11hx91hx9lb90pc7j.R.inc(70064);final double inc = 1e-5;
        __CLR4_4_11hx91hx9lb90pc7j.R.inc(70065);final Quaternion q1 = new Quaternion(2, 1, -4, -2);
        __CLR4_4_11hx91hx9lb90pc7j.R.inc(70066);final Quaternion q2 = new Quaternion(q1.getQ0() + inc, q1.getQ1(), q1.getQ2(), q1.getQ3());
        __CLR4_4_11hx91hx9lb90pc7j.R.inc(70067);final Quaternion q3 = new Quaternion(q1.getQ0(), q1.getQ1() + inc, q1.getQ2(), q1.getQ3());
        __CLR4_4_11hx91hx9lb90pc7j.R.inc(70068);final Quaternion q4 = new Quaternion(q1.getQ0(), q1.getQ1(), q1.getQ2() + inc, q1.getQ3());
        __CLR4_4_11hx91hx9lb90pc7j.R.inc(70069);final Quaternion q5 = new Quaternion(q1.getQ0(), q1.getQ1(), q1.getQ2(), q1.getQ3() + inc);

        __CLR4_4_11hx91hx9lb90pc7j.R.inc(70070);Assert.assertFalse(q1.equals(q2, 0.9 * inc));
        __CLR4_4_11hx91hx9lb90pc7j.R.inc(70071);Assert.assertFalse(q1.equals(q3, 0.9 * inc));
        __CLR4_4_11hx91hx9lb90pc7j.R.inc(70072);Assert.assertFalse(q1.equals(q4, 0.9 * inc));
        __CLR4_4_11hx91hx9lb90pc7j.R.inc(70073);Assert.assertFalse(q1.equals(q5, 0.9 * inc));

        __CLR4_4_11hx91hx9lb90pc7j.R.inc(70074);Assert.assertTrue(q1.equals(q2, 1.1 * inc));
        __CLR4_4_11hx91hx9lb90pc7j.R.inc(70075);Assert.assertTrue(q1.equals(q3, 1.1 * inc));
        __CLR4_4_11hx91hx9lb90pc7j.R.inc(70076);Assert.assertTrue(q1.equals(q4, 1.1 * inc));
        __CLR4_4_11hx91hx9lb90pc7j.R.inc(70077);Assert.assertTrue(q1.equals(q5, 1.1 * inc));
    }finally{__CLR4_4_11hx91hx9lb90pc7j.R.flushNeeded();}}

    @Test
    public final void testQuaternionEquals2() {__CLR4_4_11hx91hx9lb90pc7j.R.globalSliceStart(getClass().getName(),70078);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12n4wfq1i2m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11hx91hx9lb90pc7j.R.rethrow($CLV_t2$);}finally{__CLR4_4_11hx91hx9lb90pc7j.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.complex.QuaternionTest.testQuaternionEquals2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),70078,$CLV_p$,$CLV_t$);}}private final void  __CLR4_4_12n4wfq1i2m(){try{__CLR4_4_11hx91hx9lb90pc7j.R.inc(70078);
        __CLR4_4_11hx91hx9lb90pc7j.R.inc(70079);final Quaternion q1 = new Quaternion(1, 4, 2, 3);
        __CLR4_4_11hx91hx9lb90pc7j.R.inc(70080);final double gap = 1e-5;
        __CLR4_4_11hx91hx9lb90pc7j.R.inc(70081);final Quaternion q2 = new Quaternion(1 + gap, 4 + gap, 2 + gap, 3 + gap);

        __CLR4_4_11hx91hx9lb90pc7j.R.inc(70082);Assert.assertTrue(q1.equals(q2, 10 * gap));
        __CLR4_4_11hx91hx9lb90pc7j.R.inc(70083);Assert.assertFalse(q1.equals(q2, gap));
        __CLR4_4_11hx91hx9lb90pc7j.R.inc(70084);Assert.assertFalse(q1.equals(q2, gap / 10));
    }finally{__CLR4_4_11hx91hx9lb90pc7j.R.flushNeeded();}}

    @Test
    public final void testIsUnitQuaternion() {__CLR4_4_11hx91hx9lb90pc7j.R.globalSliceStart(getClass().getName(),70085);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xsdg6z1i2t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11hx91hx9lb90pc7j.R.rethrow($CLV_t2$);}finally{__CLR4_4_11hx91hx9lb90pc7j.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.complex.QuaternionTest.testIsUnitQuaternion",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),70085,$CLV_p$,$CLV_t$);}}private final void  __CLR4_4_1xsdg6z1i2t(){try{__CLR4_4_11hx91hx9lb90pc7j.R.inc(70085);
        __CLR4_4_11hx91hx9lb90pc7j.R.inc(70086);final Random r = new Random(48);
        __CLR4_4_11hx91hx9lb90pc7j.R.inc(70087);final int numberOfTrials = 1000;
        __CLR4_4_11hx91hx9lb90pc7j.R.inc(70088);for (int i = 0; (((i < numberOfTrials)&&(__CLR4_4_11hx91hx9lb90pc7j.R.iget(70089)!=0|true))||(__CLR4_4_11hx91hx9lb90pc7j.R.iget(70090)==0&false)); i++) {{
            __CLR4_4_11hx91hx9lb90pc7j.R.inc(70091);final Quaternion q1 = new Quaternion(r.nextDouble(), r.nextDouble(), r.nextDouble(), r.nextDouble());
            __CLR4_4_11hx91hx9lb90pc7j.R.inc(70092);final Quaternion q2 = q1.normalize();
            __CLR4_4_11hx91hx9lb90pc7j.R.inc(70093);Assert.assertTrue(q2.isUnitQuaternion(COMPARISON_EPS));
        }

        }__CLR4_4_11hx91hx9lb90pc7j.R.inc(70094);final Quaternion q = new Quaternion(1, 1, 1, 1);
        __CLR4_4_11hx91hx9lb90pc7j.R.inc(70095);Assert.assertFalse(q.isUnitQuaternion(COMPARISON_EPS));
    }finally{__CLR4_4_11hx91hx9lb90pc7j.R.flushNeeded();}}

    @Test
    public final void testIsPureQuaternion() {__CLR4_4_11hx91hx9lb90pc7j.R.globalSliceStart(getClass().getName(),70096);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1u577i11i34();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11hx91hx9lb90pc7j.R.rethrow($CLV_t2$);}finally{__CLR4_4_11hx91hx9lb90pc7j.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.complex.QuaternionTest.testIsPureQuaternion",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),70096,$CLV_p$,$CLV_t$);}}private final void  __CLR4_4_1u577i11i34(){try{__CLR4_4_11hx91hx9lb90pc7j.R.inc(70096);
        __CLR4_4_11hx91hx9lb90pc7j.R.inc(70097);final Quaternion q1 = new Quaternion(0, 5, 4, 8);
        __CLR4_4_11hx91hx9lb90pc7j.R.inc(70098);Assert.assertTrue(q1.isPureQuaternion(EPS));

        __CLR4_4_11hx91hx9lb90pc7j.R.inc(70099);final Quaternion q2 = new Quaternion(0 - EPS, 5, 4, 8);
        __CLR4_4_11hx91hx9lb90pc7j.R.inc(70100);Assert.assertTrue(q2.isPureQuaternion(EPS));

        __CLR4_4_11hx91hx9lb90pc7j.R.inc(70101);final Quaternion q3 = new Quaternion(0 - 1.1 * EPS, 5, 4, 8);
        __CLR4_4_11hx91hx9lb90pc7j.R.inc(70102);Assert.assertFalse(q3.isPureQuaternion(EPS));

        __CLR4_4_11hx91hx9lb90pc7j.R.inc(70103);final Random r = new Random(48);
        __CLR4_4_11hx91hx9lb90pc7j.R.inc(70104);final double[] v = {r.nextDouble(), r.nextDouble(), r.nextDouble()};
        __CLR4_4_11hx91hx9lb90pc7j.R.inc(70105);final Quaternion q4 = new Quaternion(v);
        __CLR4_4_11hx91hx9lb90pc7j.R.inc(70106);Assert.assertTrue(q4.isPureQuaternion(0));

        __CLR4_4_11hx91hx9lb90pc7j.R.inc(70107);final Quaternion q5 = new Quaternion(0, v);
        __CLR4_4_11hx91hx9lb90pc7j.R.inc(70108);Assert.assertTrue(q5.isPureQuaternion(0));
    }finally{__CLR4_4_11hx91hx9lb90pc7j.R.flushNeeded();}}

    @Test
    public final void testPolarForm() {__CLR4_4_11hx91hx9lb90pc7j.R.globalSliceStart(getClass().getName(),70109);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13bo93d1i3h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11hx91hx9lb90pc7j.R.rethrow($CLV_t2$);}finally{__CLR4_4_11hx91hx9lb90pc7j.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.complex.QuaternionTest.testPolarForm",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),70109,$CLV_p$,$CLV_t$);}}private final void  __CLR4_4_13bo93d1i3h(){try{__CLR4_4_11hx91hx9lb90pc7j.R.inc(70109);
        __CLR4_4_11hx91hx9lb90pc7j.R.inc(70110);final Random r = new Random(48);
        __CLR4_4_11hx91hx9lb90pc7j.R.inc(70111);final int numberOfTrials = 1000;
        __CLR4_4_11hx91hx9lb90pc7j.R.inc(70112);for (int i = 0; (((i < numberOfTrials)&&(__CLR4_4_11hx91hx9lb90pc7j.R.iget(70113)!=0|true))||(__CLR4_4_11hx91hx9lb90pc7j.R.iget(70114)==0&false)); i++) {{
            __CLR4_4_11hx91hx9lb90pc7j.R.inc(70115);final Quaternion q = new Quaternion(2 * (r.nextDouble() - 0.5), 2 * (r.nextDouble() - 0.5),
                                                2 * (r.nextDouble() - 0.5), 2 * (r.nextDouble() - 0.5));
            __CLR4_4_11hx91hx9lb90pc7j.R.inc(70116);final Quaternion qP = q.getPositivePolarForm();

            __CLR4_4_11hx91hx9lb90pc7j.R.inc(70117);Assert.assertTrue(qP.isUnitQuaternion(COMPARISON_EPS));
            __CLR4_4_11hx91hx9lb90pc7j.R.inc(70118);Assert.assertTrue(qP.getQ0() >= 0);

            __CLR4_4_11hx91hx9lb90pc7j.R.inc(70119);final Rotation rot = new Rotation(q.getQ0(), q.getQ1(), q.getQ2(), q.getQ3(), true);
            __CLR4_4_11hx91hx9lb90pc7j.R.inc(70120);final Rotation rotP = new Rotation(qP.getQ0(), qP.getQ1(), qP.getQ2(), qP.getQ3(), true);

            __CLR4_4_11hx91hx9lb90pc7j.R.inc(70121);Assert.assertEquals(rot.getAngle(), rotP.getAngle(), COMPARISON_EPS);
            __CLR4_4_11hx91hx9lb90pc7j.R.inc(70122);Assert.assertEquals(rot.getAxis().getX(), rot.getAxis().getX(), COMPARISON_EPS);
            __CLR4_4_11hx91hx9lb90pc7j.R.inc(70123);Assert.assertEquals(rot.getAxis().getY(), rot.getAxis().getY(), COMPARISON_EPS);
            __CLR4_4_11hx91hx9lb90pc7j.R.inc(70124);Assert.assertEquals(rot.getAxis().getZ(), rot.getAxis().getZ(), COMPARISON_EPS);
        }
    }}finally{__CLR4_4_11hx91hx9lb90pc7j.R.flushNeeded();}}

    @Test
    public final void testGetInverse() {__CLR4_4_11hx91hx9lb90pc7j.R.globalSliceStart(getClass().getName(),70125);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16zce8d1i3x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11hx91hx9lb90pc7j.R.rethrow($CLV_t2$);}finally{__CLR4_4_11hx91hx9lb90pc7j.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.complex.QuaternionTest.testGetInverse",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),70125,$CLV_p$,$CLV_t$);}}private final void  __CLR4_4_16zce8d1i3x(){try{__CLR4_4_11hx91hx9lb90pc7j.R.inc(70125);
        __CLR4_4_11hx91hx9lb90pc7j.R.inc(70126);final Quaternion q = new Quaternion(1.5, 4, 2, -2.5);

        __CLR4_4_11hx91hx9lb90pc7j.R.inc(70127);final Quaternion inverseQ = q.getInverse();
        __CLR4_4_11hx91hx9lb90pc7j.R.inc(70128);Assert.assertEquals(1.5 / 28.5, inverseQ.getQ0(), 0);
        __CLR4_4_11hx91hx9lb90pc7j.R.inc(70129);Assert.assertEquals(-4.0 / 28.5, inverseQ.getQ1(), 0);
        __CLR4_4_11hx91hx9lb90pc7j.R.inc(70130);Assert.assertEquals(-2.0 / 28.5, inverseQ.getQ2(), 0);
        __CLR4_4_11hx91hx9lb90pc7j.R.inc(70131);Assert.assertEquals(2.5 / 28.5, inverseQ.getQ3(), 0);

        __CLR4_4_11hx91hx9lb90pc7j.R.inc(70132);final Quaternion product = Quaternion.multiply(inverseQ, q);
        __CLR4_4_11hx91hx9lb90pc7j.R.inc(70133);Assert.assertEquals(1, product.getQ0(), EPS);
        __CLR4_4_11hx91hx9lb90pc7j.R.inc(70134);Assert.assertEquals(0, product.getQ1(), EPS);
        __CLR4_4_11hx91hx9lb90pc7j.R.inc(70135);Assert.assertEquals(0, product.getQ2(), EPS);
        __CLR4_4_11hx91hx9lb90pc7j.R.inc(70136);Assert.assertEquals(0, product.getQ3(), EPS);

        __CLR4_4_11hx91hx9lb90pc7j.R.inc(70137);final Quaternion qNul = new Quaternion(0, 0, 0, 0);
        __CLR4_4_11hx91hx9lb90pc7j.R.inc(70138);try {
            __CLR4_4_11hx91hx9lb90pc7j.R.inc(70139);final Quaternion inverseQNul = qNul.getInverse();
            __CLR4_4_11hx91hx9lb90pc7j.R.inc(70140);Assert.fail("expecting ZeroException but got : " + inverseQNul);
        } catch (ZeroException ex) {
            // expected
        }
    }finally{__CLR4_4_11hx91hx9lb90pc7j.R.flushNeeded();}}

    @Test
    public final void testToString() {__CLR4_4_11hx91hx9lb90pc7j.R.globalSliceStart(getClass().getName(),70141);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hrxdid1i4d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11hx91hx9lb90pc7j.R.rethrow($CLV_t2$);}finally{__CLR4_4_11hx91hx9lb90pc7j.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.complex.QuaternionTest.testToString",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),70141,$CLV_p$,$CLV_t$);}}private final void  __CLR4_4_1hrxdid1i4d(){try{__CLR4_4_11hx91hx9lb90pc7j.R.inc(70141);
        __CLR4_4_11hx91hx9lb90pc7j.R.inc(70142);final Quaternion q = new Quaternion(1, 2, 3, 4);
        __CLR4_4_11hx91hx9lb90pc7j.R.inc(70143);Assert.assertTrue(q.toString().equals("[1.0 2.0 3.0 4.0]"));
    }finally{__CLR4_4_11hx91hx9lb90pc7j.R.flushNeeded();}}
}
