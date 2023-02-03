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

import org.apache.commons.math3.TestUtils;
import org.apache.commons.math3.analysis.differentiation.DerivativeStructure;
import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.util.FastMath;
import org.junit.Assert;
import org.junit.Test;

public class SphericalCoordinatesTest {static class __CLR4_4_11pvp1pvplb90pcv2{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,80313,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testCoordinatesStoC() throws DimensionMismatchException {__CLR4_4_11pvp1pvplb90pcv2.R.globalSliceStart(getClass().getName(),80197);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pxu1vp1pvp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11pvp1pvplb90pcv2.R.rethrow($CLV_t2$);}finally{__CLR4_4_11pvp1pvplb90pcv2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.euclidean.threed.SphericalCoordinatesTest.testCoordinatesStoC",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),80197,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pxu1vp1pvp() throws DimensionMismatchException{try{__CLR4_4_11pvp1pvplb90pcv2.R.inc(80197);
        __CLR4_4_11pvp1pvplb90pcv2.R.inc(80198);double piO2 = 0.5 * FastMath.PI;
        __CLR4_4_11pvp1pvplb90pcv2.R.inc(80199);SphericalCoordinates sc1 = new SphericalCoordinates(2.0, 0, piO2);
        __CLR4_4_11pvp1pvplb90pcv2.R.inc(80200);Assert.assertEquals(0, sc1.getCartesian().distance(new Vector3D(2, 0, 0)), 1.0e-10);
        __CLR4_4_11pvp1pvplb90pcv2.R.inc(80201);SphericalCoordinates sc2 = new SphericalCoordinates(2.0, piO2, piO2);
        __CLR4_4_11pvp1pvplb90pcv2.R.inc(80202);Assert.assertEquals(0, sc2.getCartesian().distance(new Vector3D(0, 2, 0)), 1.0e-10);
        __CLR4_4_11pvp1pvplb90pcv2.R.inc(80203);SphericalCoordinates sc3 = new SphericalCoordinates(2.0, FastMath.PI, piO2);
        __CLR4_4_11pvp1pvplb90pcv2.R.inc(80204);Assert.assertEquals(0, sc3.getCartesian().distance(new Vector3D(-2, 0, 0)), 1.0e-10);
        __CLR4_4_11pvp1pvplb90pcv2.R.inc(80205);SphericalCoordinates sc4 = new SphericalCoordinates(2.0, -piO2, piO2);
        __CLR4_4_11pvp1pvplb90pcv2.R.inc(80206);Assert.assertEquals(0, sc4.getCartesian().distance(new Vector3D(0, -2, 0)), 1.0e-10);
        __CLR4_4_11pvp1pvplb90pcv2.R.inc(80207);SphericalCoordinates sc5 = new SphericalCoordinates(2.0, 1.23456, 0);
        __CLR4_4_11pvp1pvplb90pcv2.R.inc(80208);Assert.assertEquals(0, sc5.getCartesian().distance(new Vector3D(0, 0, 2)), 1.0e-10);
        __CLR4_4_11pvp1pvplb90pcv2.R.inc(80209);SphericalCoordinates sc6 = new SphericalCoordinates(2.0, 6.54321, FastMath.PI);
        __CLR4_4_11pvp1pvplb90pcv2.R.inc(80210);Assert.assertEquals(0, sc6.getCartesian().distance(new Vector3D(0, 0, -2)), 1.0e-10);
    }finally{__CLR4_4_11pvp1pvplb90pcv2.R.flushNeeded();}}

    @Test
    public void testCoordinatesCtoS() throws DimensionMismatchException {__CLR4_4_11pvp1pvplb90pcv2.R.globalSliceStart(getClass().getName(),80211);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1av76t1pw3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11pvp1pvplb90pcv2.R.rethrow($CLV_t2$);}finally{__CLR4_4_11pvp1pvplb90pcv2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.euclidean.threed.SphericalCoordinatesTest.testCoordinatesCtoS",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),80211,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1av76t1pw3() throws DimensionMismatchException{try{__CLR4_4_11pvp1pvplb90pcv2.R.inc(80211);
        __CLR4_4_11pvp1pvplb90pcv2.R.inc(80212);double piO2 = 0.5 * FastMath.PI;
        __CLR4_4_11pvp1pvplb90pcv2.R.inc(80213);SphericalCoordinates sc1 = new SphericalCoordinates(new Vector3D(2, 0, 0));
        __CLR4_4_11pvp1pvplb90pcv2.R.inc(80214);Assert.assertEquals(2,           sc1.getR(),     1.0e-10);
        __CLR4_4_11pvp1pvplb90pcv2.R.inc(80215);Assert.assertEquals(0,           sc1.getTheta(), 1.0e-10);
        __CLR4_4_11pvp1pvplb90pcv2.R.inc(80216);Assert.assertEquals(piO2,        sc1.getPhi(),   1.0e-10);
        __CLR4_4_11pvp1pvplb90pcv2.R.inc(80217);SphericalCoordinates sc2 = new SphericalCoordinates(new Vector3D(0, 2, 0));
        __CLR4_4_11pvp1pvplb90pcv2.R.inc(80218);Assert.assertEquals(2,           sc2.getR(),     1.0e-10);
        __CLR4_4_11pvp1pvplb90pcv2.R.inc(80219);Assert.assertEquals(piO2,        sc2.getTheta(), 1.0e-10);
        __CLR4_4_11pvp1pvplb90pcv2.R.inc(80220);Assert.assertEquals(piO2,        sc2.getPhi(),   1.0e-10);
        __CLR4_4_11pvp1pvplb90pcv2.R.inc(80221);SphericalCoordinates sc3 = new SphericalCoordinates(new Vector3D(-2, 0, 0));
        __CLR4_4_11pvp1pvplb90pcv2.R.inc(80222);Assert.assertEquals(2,           sc3.getR(),     1.0e-10);
        __CLR4_4_11pvp1pvplb90pcv2.R.inc(80223);Assert.assertEquals(FastMath.PI, sc3.getTheta(), 1.0e-10);
        __CLR4_4_11pvp1pvplb90pcv2.R.inc(80224);Assert.assertEquals(piO2,        sc3.getPhi(),   1.0e-10);
        __CLR4_4_11pvp1pvplb90pcv2.R.inc(80225);SphericalCoordinates sc4 = new SphericalCoordinates(new Vector3D(0, -2, 0));
        __CLR4_4_11pvp1pvplb90pcv2.R.inc(80226);Assert.assertEquals(2,           sc4.getR(),     1.0e-10);
        __CLR4_4_11pvp1pvplb90pcv2.R.inc(80227);Assert.assertEquals(-piO2,       sc4.getTheta(), 1.0e-10);
        __CLR4_4_11pvp1pvplb90pcv2.R.inc(80228);Assert.assertEquals(piO2,        sc4.getPhi(),   1.0e-10);
        __CLR4_4_11pvp1pvplb90pcv2.R.inc(80229);SphericalCoordinates sc5 = new SphericalCoordinates(new Vector3D(0, 0, 2));
        __CLR4_4_11pvp1pvplb90pcv2.R.inc(80230);Assert.assertEquals(2,           sc5.getR(),     1.0e-10);
        //  don't check theta on poles, as it is singular
        __CLR4_4_11pvp1pvplb90pcv2.R.inc(80231);Assert.assertEquals(0,           sc5.getPhi(),   1.0e-10);
        __CLR4_4_11pvp1pvplb90pcv2.R.inc(80232);SphericalCoordinates sc6 = new SphericalCoordinates(new Vector3D(0, 0, -2));
        __CLR4_4_11pvp1pvplb90pcv2.R.inc(80233);Assert.assertEquals(2,           sc6.getR(),     1.0e-10);
        //  don't check theta on poles, as it is singular
        __CLR4_4_11pvp1pvplb90pcv2.R.inc(80234);Assert.assertEquals(FastMath.PI, sc6.getPhi(),   1.0e-10);
    }finally{__CLR4_4_11pvp1pvplb90pcv2.R.flushNeeded();}}

    @Test
    public void testGradient() {__CLR4_4_11pvp1pvplb90pcv2.R.globalSliceStart(getClass().getName(),80235);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ey7s91pwr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11pvp1pvplb90pcv2.R.rethrow($CLV_t2$);}finally{__CLR4_4_11pvp1pvplb90pcv2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.euclidean.threed.SphericalCoordinatesTest.testGradient",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),80235,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ey7s91pwr(){try{__CLR4_4_11pvp1pvplb90pcv2.R.inc(80235);
        __CLR4_4_11pvp1pvplb90pcv2.R.inc(80236);for (double r = 0.2; (((r < 10)&&(__CLR4_4_11pvp1pvplb90pcv2.R.iget(80237)!=0|true))||(__CLR4_4_11pvp1pvplb90pcv2.R.iget(80238)==0&false)); r += 0.5) {{
            __CLR4_4_11pvp1pvplb90pcv2.R.inc(80239);for (double theta = 0; (((theta < 2 * FastMath.PI)&&(__CLR4_4_11pvp1pvplb90pcv2.R.iget(80240)!=0|true))||(__CLR4_4_11pvp1pvplb90pcv2.R.iget(80241)==0&false)); theta += 0.1) {{
                __CLR4_4_11pvp1pvplb90pcv2.R.inc(80242);for (double phi = 0.1; (((phi < FastMath.PI)&&(__CLR4_4_11pvp1pvplb90pcv2.R.iget(80243)!=0|true))||(__CLR4_4_11pvp1pvplb90pcv2.R.iget(80244)==0&false)); phi += 0.1) {{
                    __CLR4_4_11pvp1pvplb90pcv2.R.inc(80245);SphericalCoordinates sc = new SphericalCoordinates(r, theta, phi);

                    __CLR4_4_11pvp1pvplb90pcv2.R.inc(80246);DerivativeStructure svalue = valueSpherical(new DerivativeStructure(3, 1, 0, r),
                                                                new DerivativeStructure(3, 1, 1, theta),
                                                                new DerivativeStructure(3, 1, 2, phi));
                    __CLR4_4_11pvp1pvplb90pcv2.R.inc(80247);double[] sGradient = new double[] {
                        svalue.getPartialDerivative(1, 0, 0),
                        svalue.getPartialDerivative(0, 1, 0),
                        svalue.getPartialDerivative(0, 0, 1),
                    };

                    __CLR4_4_11pvp1pvplb90pcv2.R.inc(80248);DerivativeStructure cvalue = valueCartesian(new DerivativeStructure(3, 1, 0, sc.getCartesian().getX()),
                                                                new DerivativeStructure(3, 1, 1, sc.getCartesian().getY()),
                                                                new DerivativeStructure(3, 1, 2, sc.getCartesian().getZ()));
                    __CLR4_4_11pvp1pvplb90pcv2.R.inc(80249);Vector3D refCGradient = new Vector3D(cvalue.getPartialDerivative(1, 0, 0),
                                                         cvalue.getPartialDerivative(0, 1, 0),
                                                         cvalue.getPartialDerivative(0, 0, 1));

                    __CLR4_4_11pvp1pvplb90pcv2.R.inc(80250);Vector3D testCGradient = new Vector3D(sc.toCartesianGradient(sGradient));
                    
                    __CLR4_4_11pvp1pvplb90pcv2.R.inc(80251);Assert.assertEquals(0, testCGradient.distance(refCGradient) / refCGradient.getNorm(), 5.0e-14);

                }
            }}
        }}
    }}finally{__CLR4_4_11pvp1pvplb90pcv2.R.flushNeeded();}}

    @Test
    public void testHessian() {__CLR4_4_11pvp1pvplb90pcv2.R.globalSliceStart(getClass().getName(),80252);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dyfo9a1px8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11pvp1pvplb90pcv2.R.rethrow($CLV_t2$);}finally{__CLR4_4_11pvp1pvplb90pcv2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.euclidean.threed.SphericalCoordinatesTest.testHessian",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),80252,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dyfo9a1px8(){try{__CLR4_4_11pvp1pvplb90pcv2.R.inc(80252);
        __CLR4_4_11pvp1pvplb90pcv2.R.inc(80253);for (double r = 0.2; (((r < 10)&&(__CLR4_4_11pvp1pvplb90pcv2.R.iget(80254)!=0|true))||(__CLR4_4_11pvp1pvplb90pcv2.R.iget(80255)==0&false)); r += 0.5) {{
            __CLR4_4_11pvp1pvplb90pcv2.R.inc(80256);for (double theta = 0; (((theta < 2 * FastMath.PI)&&(__CLR4_4_11pvp1pvplb90pcv2.R.iget(80257)!=0|true))||(__CLR4_4_11pvp1pvplb90pcv2.R.iget(80258)==0&false)); theta += 0.2) {{
                __CLR4_4_11pvp1pvplb90pcv2.R.inc(80259);for (double phi = 0.1; (((phi < FastMath.PI)&&(__CLR4_4_11pvp1pvplb90pcv2.R.iget(80260)!=0|true))||(__CLR4_4_11pvp1pvplb90pcv2.R.iget(80261)==0&false)); phi += 0.2) {{
                    __CLR4_4_11pvp1pvplb90pcv2.R.inc(80262);SphericalCoordinates sc = new SphericalCoordinates(r, theta, phi);

                    __CLR4_4_11pvp1pvplb90pcv2.R.inc(80263);DerivativeStructure svalue = valueSpherical(new DerivativeStructure(3, 2, 0, r),
                                                                new DerivativeStructure(3, 2, 1, theta),
                                                                new DerivativeStructure(3, 2, 2, phi));
                    __CLR4_4_11pvp1pvplb90pcv2.R.inc(80264);double[] sGradient = new double[] {
                        svalue.getPartialDerivative(1, 0, 0),
                        svalue.getPartialDerivative(0, 1, 0),
                        svalue.getPartialDerivative(0, 0, 1),
                    };
                    __CLR4_4_11pvp1pvplb90pcv2.R.inc(80265);double[][] sHessian = new double[3][3];
                    __CLR4_4_11pvp1pvplb90pcv2.R.inc(80266);sHessian[0][0] = svalue.getPartialDerivative(2, 0, 0); // d2F/dR2
                    __CLR4_4_11pvp1pvplb90pcv2.R.inc(80267);sHessian[1][0] = svalue.getPartialDerivative(1, 1, 0); // d2F/dRdTheta
                    __CLR4_4_11pvp1pvplb90pcv2.R.inc(80268);sHessian[2][0] = svalue.getPartialDerivative(1, 0, 1); // d2F/dRdPhi
                    __CLR4_4_11pvp1pvplb90pcv2.R.inc(80269);sHessian[0][1] = Double.NaN; // just to check upper-right part is not used
                    __CLR4_4_11pvp1pvplb90pcv2.R.inc(80270);sHessian[1][1] = svalue.getPartialDerivative(0, 2, 0); // d2F/dTheta2
                    __CLR4_4_11pvp1pvplb90pcv2.R.inc(80271);sHessian[2][1] = svalue.getPartialDerivative(0, 1, 1); // d2F/dThetadPhi
                    __CLR4_4_11pvp1pvplb90pcv2.R.inc(80272);sHessian[0][2] = Double.NaN; // just to check upper-right part is not used
                    __CLR4_4_11pvp1pvplb90pcv2.R.inc(80273);sHessian[1][2] = Double.NaN; // just to check upper-right part is not used
                    __CLR4_4_11pvp1pvplb90pcv2.R.inc(80274);sHessian[2][2] = svalue.getPartialDerivative(0, 0, 2); // d2F/dPhi2

                    __CLR4_4_11pvp1pvplb90pcv2.R.inc(80275);DerivativeStructure cvalue = valueCartesian(new DerivativeStructure(3, 2, 0, sc.getCartesian().getX()),
                                                                new DerivativeStructure(3, 2, 1, sc.getCartesian().getY()),
                                                                new DerivativeStructure(3, 2, 2, sc.getCartesian().getZ()));
                    __CLR4_4_11pvp1pvplb90pcv2.R.inc(80276);double[][] refCHessian = new double[3][3];
                    __CLR4_4_11pvp1pvplb90pcv2.R.inc(80277);refCHessian[0][0] = cvalue.getPartialDerivative(2, 0, 0); // d2F/dX2
                    __CLR4_4_11pvp1pvplb90pcv2.R.inc(80278);refCHessian[1][0] = cvalue.getPartialDerivative(1, 1, 0); // d2F/dXdY
                    __CLR4_4_11pvp1pvplb90pcv2.R.inc(80279);refCHessian[2][0] = cvalue.getPartialDerivative(1, 0, 1); // d2F/dXdZ
                    __CLR4_4_11pvp1pvplb90pcv2.R.inc(80280);refCHessian[0][1] = refCHessian[1][0];
                    __CLR4_4_11pvp1pvplb90pcv2.R.inc(80281);refCHessian[1][1] = cvalue.getPartialDerivative(0, 2, 0); // d2F/dY2
                    __CLR4_4_11pvp1pvplb90pcv2.R.inc(80282);refCHessian[2][1] = cvalue.getPartialDerivative(0, 1, 1); // d2F/dYdZ
                    __CLR4_4_11pvp1pvplb90pcv2.R.inc(80283);refCHessian[0][2] = refCHessian[2][0];
                    __CLR4_4_11pvp1pvplb90pcv2.R.inc(80284);refCHessian[1][2] = refCHessian[2][1];
                    __CLR4_4_11pvp1pvplb90pcv2.R.inc(80285);refCHessian[2][2] = cvalue.getPartialDerivative(0, 0, 2); // d2F/dZ2
                    __CLR4_4_11pvp1pvplb90pcv2.R.inc(80286);double norm =  0;
                    __CLR4_4_11pvp1pvplb90pcv2.R.inc(80287);for (int i = 0; (((i < 3)&&(__CLR4_4_11pvp1pvplb90pcv2.R.iget(80288)!=0|true))||(__CLR4_4_11pvp1pvplb90pcv2.R.iget(80289)==0&false)); ++i) {{
                        __CLR4_4_11pvp1pvplb90pcv2.R.inc(80290);for (int j = 0; (((j < 3)&&(__CLR4_4_11pvp1pvplb90pcv2.R.iget(80291)!=0|true))||(__CLR4_4_11pvp1pvplb90pcv2.R.iget(80292)==0&false)); ++j) {{
                            __CLR4_4_11pvp1pvplb90pcv2.R.inc(80293);norm = FastMath.max(norm, FastMath.abs(refCHessian[i][j]));
                        }
                    }}

                    }__CLR4_4_11pvp1pvplb90pcv2.R.inc(80294);double[][] testCHessian = sc.toCartesianHessian(sHessian, sGradient);
                    __CLR4_4_11pvp1pvplb90pcv2.R.inc(80295);for (int i = 0; (((i < 3)&&(__CLR4_4_11pvp1pvplb90pcv2.R.iget(80296)!=0|true))||(__CLR4_4_11pvp1pvplb90pcv2.R.iget(80297)==0&false)); ++i) {{
                        __CLR4_4_11pvp1pvplb90pcv2.R.inc(80298);for (int j = 0; (((j < 3)&&(__CLR4_4_11pvp1pvplb90pcv2.R.iget(80299)!=0|true))||(__CLR4_4_11pvp1pvplb90pcv2.R.iget(80300)==0&false)); ++j) {{
                            __CLR4_4_11pvp1pvplb90pcv2.R.inc(80301);Assert.assertEquals("" + FastMath.abs((refCHessian[i][j] - testCHessian[i][j]) / norm),
                                                refCHessian[i][j], testCHessian[i][j], 1.0e-14 * norm);
                        }
                    }}

                }}
            }}
        }}
    }}finally{__CLR4_4_11pvp1pvplb90pcv2.R.flushNeeded();}}

    public DerivativeStructure valueCartesian(DerivativeStructure x, DerivativeStructure y, DerivativeStructure z) {try{__CLR4_4_11pvp1pvplb90pcv2.R.inc(80302);
        __CLR4_4_11pvp1pvplb90pcv2.R.inc(80303);return x.divide(y.multiply(5).add(10)).multiply(z.pow(3));
    }finally{__CLR4_4_11pvp1pvplb90pcv2.R.flushNeeded();}}

    public DerivativeStructure valueSpherical(DerivativeStructure r, DerivativeStructure theta, DerivativeStructure phi) {try{__CLR4_4_11pvp1pvplb90pcv2.R.inc(80304);
        __CLR4_4_11pvp1pvplb90pcv2.R.inc(80305);return valueCartesian(r.multiply(theta.cos()).multiply(phi.sin()),
                              r.multiply(theta.sin()).multiply(phi.sin()),
                              r.multiply(phi.cos()));
    }finally{__CLR4_4_11pvp1pvplb90pcv2.R.flushNeeded();}}

    @Test
    public void testSerialization() {__CLR4_4_11pvp1pvplb90pcv2.R.globalSliceStart(getClass().getName(),80306);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16m1on91pyq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11pvp1pvplb90pcv2.R.rethrow($CLV_t2$);}finally{__CLR4_4_11pvp1pvplb90pcv2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.euclidean.threed.SphericalCoordinatesTest.testSerialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),80306,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16m1on91pyq(){try{__CLR4_4_11pvp1pvplb90pcv2.R.inc(80306);
        __CLR4_4_11pvp1pvplb90pcv2.R.inc(80307);SphericalCoordinates a = new SphericalCoordinates(3, 2, 1);
        __CLR4_4_11pvp1pvplb90pcv2.R.inc(80308);SphericalCoordinates b = (SphericalCoordinates) TestUtils.serializeAndRecover(a);
        __CLR4_4_11pvp1pvplb90pcv2.R.inc(80309);Assert.assertEquals(0, a.getCartesian().distance(b.getCartesian()), 1.0e-10);
        __CLR4_4_11pvp1pvplb90pcv2.R.inc(80310);Assert.assertEquals(a.getR(),     b.getR(),     1.0e-10);
        __CLR4_4_11pvp1pvplb90pcv2.R.inc(80311);Assert.assertEquals(a.getTheta(), b.getTheta(), 1.0e-10);
        __CLR4_4_11pvp1pvplb90pcv2.R.inc(80312);Assert.assertEquals(a.getPhi(),   b.getPhi(),   1.0e-10);
    }finally{__CLR4_4_11pvp1pvplb90pcv2.R.flushNeeded();}}

}
