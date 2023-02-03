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

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;

import org.apache.commons.math3.TestUtils;
import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.exception.MathArithmeticException;
import org.apache.commons.math3.geometry.Space;
import org.apache.commons.math3.random.Well1024a;
import org.apache.commons.math3.util.FastMath;
import org.apache.commons.math3.util.Precision;
import org.junit.Assert;
import org.junit.Test;

public class Vector3DTest {static class __CLR4_4_11q5a1q5alb90pcw2{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,80759,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    @Test
    public void testConstructors() throws DimensionMismatchException {__CLR4_4_11q5a1q5alb90pcw2.R.globalSliceStart(getClass().getName(),80542);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lwxahe1q5a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11q5a1q5alb90pcw2.R.rethrow($CLV_t2$);}finally{__CLR4_4_11q5a1q5alb90pcw2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.euclidean.threed.Vector3DTest.testConstructors",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),80542,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lwxahe1q5a() throws DimensionMismatchException{try{__CLR4_4_11q5a1q5alb90pcw2.R.inc(80542);
        __CLR4_4_11q5a1q5alb90pcw2.R.inc(80543);double r = FastMath.sqrt(2) /2;
        __CLR4_4_11q5a1q5alb90pcw2.R.inc(80544);checkVector(new Vector3D(2, new Vector3D(FastMath.PI / 3, -FastMath.PI / 4)),
                    r, r * FastMath.sqrt(3), -2 * r);
        __CLR4_4_11q5a1q5alb90pcw2.R.inc(80545);checkVector(new Vector3D(2, Vector3D.PLUS_I,
                                 -3, Vector3D.MINUS_K),
                    2, 0, 3);
        __CLR4_4_11q5a1q5alb90pcw2.R.inc(80546);checkVector(new Vector3D(2, Vector3D.PLUS_I,
                                 5, Vector3D.PLUS_J,
                                 -3, Vector3D.MINUS_K),
                    2, 5, 3);
        __CLR4_4_11q5a1q5alb90pcw2.R.inc(80547);checkVector(new Vector3D(2, Vector3D.PLUS_I,
                                 5, Vector3D.PLUS_J,
                                 5, Vector3D.MINUS_J,
                                 -3, Vector3D.MINUS_K),
                    2, 0, 3);
        __CLR4_4_11q5a1q5alb90pcw2.R.inc(80548);checkVector(new Vector3D(new double[] { 2,  5,  -3 }),
                    2, 5, -3);
    }finally{__CLR4_4_11q5a1q5alb90pcw2.R.flushNeeded();}}

    @Test
    public void testSpace() {__CLR4_4_11q5a1q5alb90pcw2.R.globalSliceStart(getClass().getName(),80549);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ekjz511q5h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11q5a1q5alb90pcw2.R.rethrow($CLV_t2$);}finally{__CLR4_4_11q5a1q5alb90pcw2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.euclidean.threed.Vector3DTest.testSpace",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),80549,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ekjz511q5h(){try{__CLR4_4_11q5a1q5alb90pcw2.R.inc(80549);
        __CLR4_4_11q5a1q5alb90pcw2.R.inc(80550);Space space = new Vector3D(1, 2, 2).getSpace();
        __CLR4_4_11q5a1q5alb90pcw2.R.inc(80551);Assert.assertEquals(3, space.getDimension());
        __CLR4_4_11q5a1q5alb90pcw2.R.inc(80552);Assert.assertEquals(2, space.getSubSpace().getDimension());
        __CLR4_4_11q5a1q5alb90pcw2.R.inc(80553);Space deserialized = (Space) TestUtils.serializeAndRecover(space);
        __CLR4_4_11q5a1q5alb90pcw2.R.inc(80554);Assert.assertTrue(space == deserialized);
    }finally{__CLR4_4_11q5a1q5alb90pcw2.R.flushNeeded();}}

    @Test
    public void testZero() {__CLR4_4_11q5a1q5alb90pcw2.R.globalSliceStart(getClass().getName(),80555);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cqj5i71q5n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11q5a1q5alb90pcw2.R.rethrow($CLV_t2$);}finally{__CLR4_4_11q5a1q5alb90pcw2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.euclidean.threed.Vector3DTest.testZero",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),80555,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cqj5i71q5n(){try{__CLR4_4_11q5a1q5alb90pcw2.R.inc(80555);
        __CLR4_4_11q5a1q5alb90pcw2.R.inc(80556);Assert.assertEquals(0, new Vector3D(1, 2, 2).getZero().getNorm(), 1.0e-15);
    }finally{__CLR4_4_11q5a1q5alb90pcw2.R.flushNeeded();}}

    @Test
    public void testEquals() {__CLR4_4_11q5a1q5alb90pcw2.R.globalSliceStart(getClass().getName(),80557);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s4e6081q5p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11q5a1q5alb90pcw2.R.rethrow($CLV_t2$);}finally{__CLR4_4_11q5a1q5alb90pcw2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.euclidean.threed.Vector3DTest.testEquals",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),80557,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s4e6081q5p(){try{__CLR4_4_11q5a1q5alb90pcw2.R.inc(80557);
        __CLR4_4_11q5a1q5alb90pcw2.R.inc(80558);Vector3D u1 = new Vector3D(1, 2, 3);
        __CLR4_4_11q5a1q5alb90pcw2.R.inc(80559);Vector3D u2 = new Vector3D(1, 2, 3);
        __CLR4_4_11q5a1q5alb90pcw2.R.inc(80560);Assert.assertTrue(u1.equals(u1));
        __CLR4_4_11q5a1q5alb90pcw2.R.inc(80561);Assert.assertTrue(u1.equals(u2));
        __CLR4_4_11q5a1q5alb90pcw2.R.inc(80562);Assert.assertFalse(u1.equals(new Rotation(1, 0, 0, 0, false)));
        __CLR4_4_11q5a1q5alb90pcw2.R.inc(80563);Assert.assertFalse(u1.equals(new Vector3D(1, 2, 3 + 10 * Precision.EPSILON)));
        __CLR4_4_11q5a1q5alb90pcw2.R.inc(80564);Assert.assertFalse(u1.equals(new Vector3D(1, 2 + 10 * Precision.EPSILON, 3)));
        __CLR4_4_11q5a1q5alb90pcw2.R.inc(80565);Assert.assertFalse(u1.equals(new Vector3D(1 + 10 * Precision.EPSILON, 2, 3)));
        __CLR4_4_11q5a1q5alb90pcw2.R.inc(80566);Assert.assertTrue(new Vector3D(0, Double.NaN, 0).equals(new Vector3D(0, 0, Double.NaN)));
    }finally{__CLR4_4_11q5a1q5alb90pcw2.R.flushNeeded();}}

    @Test
    public void testHash() {__CLR4_4_11q5a1q5alb90pcw2.R.globalSliceStart(getClass().getName(),80567);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1djgsu11q5z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11q5a1q5alb90pcw2.R.rethrow($CLV_t2$);}finally{__CLR4_4_11q5a1q5alb90pcw2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.euclidean.threed.Vector3DTest.testHash",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),80567,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1djgsu11q5z(){try{__CLR4_4_11q5a1q5alb90pcw2.R.inc(80567);
        __CLR4_4_11q5a1q5alb90pcw2.R.inc(80568);Assert.assertEquals(new Vector3D(0, Double.NaN, 0).hashCode(), new Vector3D(0, 0, Double.NaN).hashCode());
        __CLR4_4_11q5a1q5alb90pcw2.R.inc(80569);Vector3D u = new Vector3D(1, 2, 3);
        __CLR4_4_11q5a1q5alb90pcw2.R.inc(80570);Vector3D v = new Vector3D(1, 2, 3 + 10 * Precision.EPSILON);
        __CLR4_4_11q5a1q5alb90pcw2.R.inc(80571);Assert.assertTrue(u.hashCode() != v.hashCode());
    }finally{__CLR4_4_11q5a1q5alb90pcw2.R.flushNeeded();}}

    @Test
    public void testInfinite() {__CLR4_4_11q5a1q5alb90pcw2.R.globalSliceStart(getClass().getName(),80572);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1foyoc31q64();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11q5a1q5alb90pcw2.R.rethrow($CLV_t2$);}finally{__CLR4_4_11q5a1q5alb90pcw2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.euclidean.threed.Vector3DTest.testInfinite",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),80572,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1foyoc31q64(){try{__CLR4_4_11q5a1q5alb90pcw2.R.inc(80572);
        __CLR4_4_11q5a1q5alb90pcw2.R.inc(80573);Assert.assertTrue(new Vector3D(1, 1, Double.NEGATIVE_INFINITY).isInfinite());
        __CLR4_4_11q5a1q5alb90pcw2.R.inc(80574);Assert.assertTrue(new Vector3D(1, Double.NEGATIVE_INFINITY, 1).isInfinite());
        __CLR4_4_11q5a1q5alb90pcw2.R.inc(80575);Assert.assertTrue(new Vector3D(Double.NEGATIVE_INFINITY, 1, 1).isInfinite());
        __CLR4_4_11q5a1q5alb90pcw2.R.inc(80576);Assert.assertFalse(new Vector3D(1, 1, 2).isInfinite());
        __CLR4_4_11q5a1q5alb90pcw2.R.inc(80577);Assert.assertFalse(new Vector3D(1, Double.NaN, Double.NEGATIVE_INFINITY).isInfinite());
    }finally{__CLR4_4_11q5a1q5alb90pcw2.R.flushNeeded();}}

    @Test
    public void testNaN() {__CLR4_4_11q5a1q5alb90pcw2.R.globalSliceStart(getClass().getName(),80578);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1eihm8g1q6a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11q5a1q5alb90pcw2.R.rethrow($CLV_t2$);}finally{__CLR4_4_11q5a1q5alb90pcw2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.euclidean.threed.Vector3DTest.testNaN",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),80578,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1eihm8g1q6a(){try{__CLR4_4_11q5a1q5alb90pcw2.R.inc(80578);
        __CLR4_4_11q5a1q5alb90pcw2.R.inc(80579);Assert.assertTrue(new Vector3D(1, 1, Double.NaN).isNaN());
        __CLR4_4_11q5a1q5alb90pcw2.R.inc(80580);Assert.assertTrue(new Vector3D(1, Double.NaN, 1).isNaN());
        __CLR4_4_11q5a1q5alb90pcw2.R.inc(80581);Assert.assertTrue(new Vector3D(Double.NaN, 1, 1).isNaN());
        __CLR4_4_11q5a1q5alb90pcw2.R.inc(80582);Assert.assertFalse(new Vector3D(1, 1, 2).isNaN());
        __CLR4_4_11q5a1q5alb90pcw2.R.inc(80583);Assert.assertFalse(new Vector3D(1, 1, Double.NEGATIVE_INFINITY).isNaN());
    }finally{__CLR4_4_11q5a1q5alb90pcw2.R.flushNeeded();}}

    @Test
    public void testToString() {__CLR4_4_11q5a1q5alb90pcw2.R.globalSliceStart(getClass().getName(),80584);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hrxdid1q6g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11q5a1q5alb90pcw2.R.rethrow($CLV_t2$);}finally{__CLR4_4_11q5a1q5alb90pcw2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.euclidean.threed.Vector3DTest.testToString",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),80584,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hrxdid1q6g(){try{__CLR4_4_11q5a1q5alb90pcw2.R.inc(80584);
        __CLR4_4_11q5a1q5alb90pcw2.R.inc(80585);Assert.assertEquals("{3; 2; 1}", new Vector3D(3, 2, 1).toString());
        __CLR4_4_11q5a1q5alb90pcw2.R.inc(80586);NumberFormat format = new DecimalFormat("0.000", new DecimalFormatSymbols(Locale.US));
        __CLR4_4_11q5a1q5alb90pcw2.R.inc(80587);Assert.assertEquals("{3.000; 2.000; 1.000}", new Vector3D(3, 2, 1).toString(format));
    }finally{__CLR4_4_11q5a1q5alb90pcw2.R.flushNeeded();}}

    @Test(expected=DimensionMismatchException.class)
    public void testWrongDimension() throws DimensionMismatchException {__CLR4_4_11q5a1q5alb90pcw2.R.globalSliceStart(getClass().getName(),80588);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rgoocy1q6k();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,87,114,111,110,103,68,105,109,101,110,115,105,111,110,58,32,91,68,105,109,101,110,115,105,111,110,77,105,115,109,97,116,99,104,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof DimensionMismatchException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11q5a1q5alb90pcw2.R.rethrow($CLV_t2$);}finally{__CLR4_4_11q5a1q5alb90pcw2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.euclidean.threed.Vector3DTest.testWrongDimension",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),80588,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rgoocy1q6k() throws DimensionMismatchException{try{__CLR4_4_11q5a1q5alb90pcw2.R.inc(80588);
        __CLR4_4_11q5a1q5alb90pcw2.R.inc(80589);new Vector3D(new double[] { 2,  5 });
    }finally{__CLR4_4_11q5a1q5alb90pcw2.R.flushNeeded();}}

    @Test
    public void testCoordinates() {__CLR4_4_11q5a1q5alb90pcw2.R.globalSliceStart(getClass().getName(),80590);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jq43001q6m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11q5a1q5alb90pcw2.R.rethrow($CLV_t2$);}finally{__CLR4_4_11q5a1q5alb90pcw2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.euclidean.threed.Vector3DTest.testCoordinates",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),80590,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jq43001q6m(){try{__CLR4_4_11q5a1q5alb90pcw2.R.inc(80590);
        __CLR4_4_11q5a1q5alb90pcw2.R.inc(80591);Vector3D v = new Vector3D(1, 2, 3);
        __CLR4_4_11q5a1q5alb90pcw2.R.inc(80592);Assert.assertTrue(FastMath.abs(v.getX() - 1) < 1.0e-12);
        __CLR4_4_11q5a1q5alb90pcw2.R.inc(80593);Assert.assertTrue(FastMath.abs(v.getY() - 2) < 1.0e-12);
        __CLR4_4_11q5a1q5alb90pcw2.R.inc(80594);Assert.assertTrue(FastMath.abs(v.getZ() - 3) < 1.0e-12);
        __CLR4_4_11q5a1q5alb90pcw2.R.inc(80595);double[] coordinates = v.toArray();
        __CLR4_4_11q5a1q5alb90pcw2.R.inc(80596);Assert.assertTrue(FastMath.abs(coordinates[0] - 1) < 1.0e-12);
        __CLR4_4_11q5a1q5alb90pcw2.R.inc(80597);Assert.assertTrue(FastMath.abs(coordinates[1] - 2) < 1.0e-12);
        __CLR4_4_11q5a1q5alb90pcw2.R.inc(80598);Assert.assertTrue(FastMath.abs(coordinates[2] - 3) < 1.0e-12);
    }finally{__CLR4_4_11q5a1q5alb90pcw2.R.flushNeeded();}}

    @Test
    public void testNorm1() {__CLR4_4_11q5a1q5alb90pcw2.R.globalSliceStart(getClass().getName(),80599);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1unx1m21q6v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11q5a1q5alb90pcw2.R.rethrow($CLV_t2$);}finally{__CLR4_4_11q5a1q5alb90pcw2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.euclidean.threed.Vector3DTest.testNorm1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),80599,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1unx1m21q6v(){try{__CLR4_4_11q5a1q5alb90pcw2.R.inc(80599);
        __CLR4_4_11q5a1q5alb90pcw2.R.inc(80600);Assert.assertEquals(0.0, Vector3D.ZERO.getNorm1(), 0);
        __CLR4_4_11q5a1q5alb90pcw2.R.inc(80601);Assert.assertEquals(6.0, new Vector3D(1, -2, 3).getNorm1(), 0);
    }finally{__CLR4_4_11q5a1q5alb90pcw2.R.flushNeeded();}}

    @Test
    public void testNorm() {__CLR4_4_11q5a1q5alb90pcw2.R.globalSliceStart(getClass().getName(),80602);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rs5o971q6y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11q5a1q5alb90pcw2.R.rethrow($CLV_t2$);}finally{__CLR4_4_11q5a1q5alb90pcw2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.euclidean.threed.Vector3DTest.testNorm",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),80602,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rs5o971q6y(){try{__CLR4_4_11q5a1q5alb90pcw2.R.inc(80602);
        __CLR4_4_11q5a1q5alb90pcw2.R.inc(80603);Assert.assertEquals(0.0, Vector3D.ZERO.getNorm(), 0);
        __CLR4_4_11q5a1q5alb90pcw2.R.inc(80604);Assert.assertEquals(FastMath.sqrt(14), new Vector3D(1, 2, 3).getNorm(), 1.0e-12);
    }finally{__CLR4_4_11q5a1q5alb90pcw2.R.flushNeeded();}}

    @Test
    public void testNormSq() {__CLR4_4_11q5a1q5alb90pcw2.R.globalSliceStart(getClass().getName(),80605);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16ljjn71q71();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11q5a1q5alb90pcw2.R.rethrow($CLV_t2$);}finally{__CLR4_4_11q5a1q5alb90pcw2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.euclidean.threed.Vector3DTest.testNormSq",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),80605,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16ljjn71q71(){try{__CLR4_4_11q5a1q5alb90pcw2.R.inc(80605);
        __CLR4_4_11q5a1q5alb90pcw2.R.inc(80606);Assert.assertEquals(0.0, new Vector3D(0, 0, 0).getNormSq(), 0);
        __CLR4_4_11q5a1q5alb90pcw2.R.inc(80607);Assert.assertEquals(14, new Vector3D(1, 2, 3).getNormSq(), 1.0e-12);
    }finally{__CLR4_4_11q5a1q5alb90pcw2.R.flushNeeded();}}

    @Test
    public void testNormInf() {__CLR4_4_11q5a1q5alb90pcw2.R.globalSliceStart(getClass().getName(),80608);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16mdo5i1q74();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11q5a1q5alb90pcw2.R.rethrow($CLV_t2$);}finally{__CLR4_4_11q5a1q5alb90pcw2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.euclidean.threed.Vector3DTest.testNormInf",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),80608,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16mdo5i1q74(){try{__CLR4_4_11q5a1q5alb90pcw2.R.inc(80608);
        __CLR4_4_11q5a1q5alb90pcw2.R.inc(80609);Assert.assertEquals(0.0, Vector3D.ZERO.getNormInf(), 0);
        __CLR4_4_11q5a1q5alb90pcw2.R.inc(80610);Assert.assertEquals(3.0, new Vector3D(1, -2, 3).getNormInf(), 0);
    }finally{__CLR4_4_11q5a1q5alb90pcw2.R.flushNeeded();}}

    @Test
    public void testDistance1() {__CLR4_4_11q5a1q5alb90pcw2.R.globalSliceStart(getClass().getName(),80611);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_195deup1q77();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11q5a1q5alb90pcw2.R.rethrow($CLV_t2$);}finally{__CLR4_4_11q5a1q5alb90pcw2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.euclidean.threed.Vector3DTest.testDistance1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),80611,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_195deup1q77(){try{__CLR4_4_11q5a1q5alb90pcw2.R.inc(80611);
        __CLR4_4_11q5a1q5alb90pcw2.R.inc(80612);Vector3D v1 = new Vector3D(1, -2, 3);
        __CLR4_4_11q5a1q5alb90pcw2.R.inc(80613);Vector3D v2 = new Vector3D(-4, 2, 0);
        __CLR4_4_11q5a1q5alb90pcw2.R.inc(80614);Assert.assertEquals(0.0, Vector3D.distance1(Vector3D.MINUS_I, Vector3D.MINUS_I), 0);
        __CLR4_4_11q5a1q5alb90pcw2.R.inc(80615);Assert.assertEquals(12.0, Vector3D.distance1(v1, v2), 1.0e-12);
        __CLR4_4_11q5a1q5alb90pcw2.R.inc(80616);Assert.assertEquals(v1.subtract(v2).getNorm1(), Vector3D.distance1(v1, v2), 1.0e-12);
    }finally{__CLR4_4_11q5a1q5alb90pcw2.R.flushNeeded();}}

    @Test
    public void testDistance() {__CLR4_4_11q5a1q5alb90pcw2.R.globalSliceStart(getClass().getName(),80617);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1o82ia61q7d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11q5a1q5alb90pcw2.R.rethrow($CLV_t2$);}finally{__CLR4_4_11q5a1q5alb90pcw2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.euclidean.threed.Vector3DTest.testDistance",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),80617,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1o82ia61q7d(){try{__CLR4_4_11q5a1q5alb90pcw2.R.inc(80617);
        __CLR4_4_11q5a1q5alb90pcw2.R.inc(80618);Vector3D v1 = new Vector3D(1, -2, 3);
        __CLR4_4_11q5a1q5alb90pcw2.R.inc(80619);Vector3D v2 = new Vector3D(-4, 2, 0);
        __CLR4_4_11q5a1q5alb90pcw2.R.inc(80620);Assert.assertEquals(0.0, Vector3D.distance(Vector3D.MINUS_I, Vector3D.MINUS_I), 0);
        __CLR4_4_11q5a1q5alb90pcw2.R.inc(80621);Assert.assertEquals(FastMath.sqrt(50), Vector3D.distance(v1, v2), 1.0e-12);
        __CLR4_4_11q5a1q5alb90pcw2.R.inc(80622);Assert.assertEquals(v1.subtract(v2).getNorm(), Vector3D.distance(v1, v2), 1.0e-12);
    }finally{__CLR4_4_11q5a1q5alb90pcw2.R.flushNeeded();}}

    @Test
    public void testDistanceSq() {__CLR4_4_11q5a1q5alb90pcw2.R.globalSliceStart(getClass().getName(),80623);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1l3ck501q7j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11q5a1q5alb90pcw2.R.rethrow($CLV_t2$);}finally{__CLR4_4_11q5a1q5alb90pcw2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.euclidean.threed.Vector3DTest.testDistanceSq",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),80623,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1l3ck501q7j(){try{__CLR4_4_11q5a1q5alb90pcw2.R.inc(80623);
        __CLR4_4_11q5a1q5alb90pcw2.R.inc(80624);Vector3D v1 = new Vector3D(1, -2, 3);
        __CLR4_4_11q5a1q5alb90pcw2.R.inc(80625);Vector3D v2 = new Vector3D(-4, 2, 0);
        __CLR4_4_11q5a1q5alb90pcw2.R.inc(80626);Assert.assertEquals(0.0, Vector3D.distanceSq(Vector3D.MINUS_I, Vector3D.MINUS_I), 0);
        __CLR4_4_11q5a1q5alb90pcw2.R.inc(80627);Assert.assertEquals(50.0, Vector3D.distanceSq(v1, v2), 1.0e-12);
        __CLR4_4_11q5a1q5alb90pcw2.R.inc(80628);Assert.assertEquals(Vector3D.distance(v1, v2) * Vector3D.distance(v1, v2),
                            Vector3D.distanceSq(v1, v2), 1.0e-12);
  }finally{__CLR4_4_11q5a1q5alb90pcw2.R.flushNeeded();}}

    @Test
    public void testDistanceInf() {__CLR4_4_11q5a1q5alb90pcw2.R.globalSliceStart(getClass().getName(),80629);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1coo9q71q7p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11q5a1q5alb90pcw2.R.rethrow($CLV_t2$);}finally{__CLR4_4_11q5a1q5alb90pcw2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.euclidean.threed.Vector3DTest.testDistanceInf",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),80629,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1coo9q71q7p(){try{__CLR4_4_11q5a1q5alb90pcw2.R.inc(80629);
        __CLR4_4_11q5a1q5alb90pcw2.R.inc(80630);Vector3D v1 = new Vector3D(1, -2, 3);
        __CLR4_4_11q5a1q5alb90pcw2.R.inc(80631);Vector3D v2 = new Vector3D(-4, 2, 0);
        __CLR4_4_11q5a1q5alb90pcw2.R.inc(80632);Assert.assertEquals(0.0, Vector3D.distanceInf(Vector3D.MINUS_I, Vector3D.MINUS_I), 0);
        __CLR4_4_11q5a1q5alb90pcw2.R.inc(80633);Assert.assertEquals(5.0, Vector3D.distanceInf(v1, v2), 1.0e-12);
        __CLR4_4_11q5a1q5alb90pcw2.R.inc(80634);Assert.assertEquals(v1.subtract(v2).getNormInf(), Vector3D.distanceInf(v1, v2), 1.0e-12);
    }finally{__CLR4_4_11q5a1q5alb90pcw2.R.flushNeeded();}}

    @Test
    public void testSubtract() {__CLR4_4_11q5a1q5alb90pcw2.R.globalSliceStart(getClass().getName(),80635);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hib6tp1q7v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11q5a1q5alb90pcw2.R.rethrow($CLV_t2$);}finally{__CLR4_4_11q5a1q5alb90pcw2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.euclidean.threed.Vector3DTest.testSubtract",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),80635,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hib6tp1q7v(){try{__CLR4_4_11q5a1q5alb90pcw2.R.inc(80635);
        __CLR4_4_11q5a1q5alb90pcw2.R.inc(80636);Vector3D v1 = new Vector3D(1, 2, 3);
        __CLR4_4_11q5a1q5alb90pcw2.R.inc(80637);Vector3D v2 = new Vector3D(-3, -2, -1);
        __CLR4_4_11q5a1q5alb90pcw2.R.inc(80638);v1 = v1.subtract(v2);
        __CLR4_4_11q5a1q5alb90pcw2.R.inc(80639);checkVector(v1, 4, 4, 4);

        __CLR4_4_11q5a1q5alb90pcw2.R.inc(80640);checkVector(v2.subtract(v1), -7, -6, -5);
        __CLR4_4_11q5a1q5alb90pcw2.R.inc(80641);checkVector(v2.subtract(3, v1), -15, -14, -13);
    }finally{__CLR4_4_11q5a1q5alb90pcw2.R.flushNeeded();}}

    @Test
    public void testAdd() {__CLR4_4_11q5a1q5alb90pcw2.R.globalSliceStart(getClass().getName(),80642);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vtx82e1q82();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11q5a1q5alb90pcw2.R.rethrow($CLV_t2$);}finally{__CLR4_4_11q5a1q5alb90pcw2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.euclidean.threed.Vector3DTest.testAdd",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),80642,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vtx82e1q82(){try{__CLR4_4_11q5a1q5alb90pcw2.R.inc(80642);
        __CLR4_4_11q5a1q5alb90pcw2.R.inc(80643);Vector3D v1 = new Vector3D(1, 2, 3);
        __CLR4_4_11q5a1q5alb90pcw2.R.inc(80644);Vector3D v2 = new Vector3D(-3, -2, -1);
        __CLR4_4_11q5a1q5alb90pcw2.R.inc(80645);v1 = v1.add(v2);
        __CLR4_4_11q5a1q5alb90pcw2.R.inc(80646);checkVector(v1, -2, 0, 2);

        __CLR4_4_11q5a1q5alb90pcw2.R.inc(80647);checkVector(v2.add(v1), -5, -2, 1);
        __CLR4_4_11q5a1q5alb90pcw2.R.inc(80648);checkVector(v2.add(3, v1), -9, -2, 5);
    }finally{__CLR4_4_11q5a1q5alb90pcw2.R.flushNeeded();}}

    @Test
    public void testScalarProduct() {__CLR4_4_11q5a1q5alb90pcw2.R.globalSliceStart(getClass().getName(),80649);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vgfiso1q89();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11q5a1q5alb90pcw2.R.rethrow($CLV_t2$);}finally{__CLR4_4_11q5a1q5alb90pcw2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.euclidean.threed.Vector3DTest.testScalarProduct",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),80649,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vgfiso1q89(){try{__CLR4_4_11q5a1q5alb90pcw2.R.inc(80649);
        __CLR4_4_11q5a1q5alb90pcw2.R.inc(80650);Vector3D v = new Vector3D(1, 2, 3);
        __CLR4_4_11q5a1q5alb90pcw2.R.inc(80651);v = v.scalarMultiply(3);
        __CLR4_4_11q5a1q5alb90pcw2.R.inc(80652);checkVector(v, 3, 6, 9);

        __CLR4_4_11q5a1q5alb90pcw2.R.inc(80653);checkVector(v.scalarMultiply(0.5), 1.5, 3, 4.5);
    }finally{__CLR4_4_11q5a1q5alb90pcw2.R.flushNeeded();}}

    @Test
    public void testVectorialProducts() {__CLR4_4_11q5a1q5alb90pcw2.R.globalSliceStart(getClass().getName(),80654);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hnfkk61q8e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11q5a1q5alb90pcw2.R.rethrow($CLV_t2$);}finally{__CLR4_4_11q5a1q5alb90pcw2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.euclidean.threed.Vector3DTest.testVectorialProducts",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),80654,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hnfkk61q8e(){try{__CLR4_4_11q5a1q5alb90pcw2.R.inc(80654);
        __CLR4_4_11q5a1q5alb90pcw2.R.inc(80655);Vector3D v1 = new Vector3D(2, 1, -4);
        __CLR4_4_11q5a1q5alb90pcw2.R.inc(80656);Vector3D v2 = new Vector3D(3, 1, -1);

        __CLR4_4_11q5a1q5alb90pcw2.R.inc(80657);Assert.assertTrue(FastMath.abs(Vector3D.dotProduct(v1, v2) - 11) < 1.0e-12);

        __CLR4_4_11q5a1q5alb90pcw2.R.inc(80658);Vector3D v3 = Vector3D.crossProduct(v1, v2);
        __CLR4_4_11q5a1q5alb90pcw2.R.inc(80659);checkVector(v3, 3, -10, -1);

        __CLR4_4_11q5a1q5alb90pcw2.R.inc(80660);Assert.assertTrue(FastMath.abs(Vector3D.dotProduct(v1, v3)) < 1.0e-12);
        __CLR4_4_11q5a1q5alb90pcw2.R.inc(80661);Assert.assertTrue(FastMath.abs(Vector3D.dotProduct(v2, v3)) < 1.0e-12);
    }finally{__CLR4_4_11q5a1q5alb90pcw2.R.flushNeeded();}}

    @Test
    public void testCrossProductCancellation() {__CLR4_4_11q5a1q5alb90pcw2.R.globalSliceStart(getClass().getName(),80662);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kcgm231q8m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11q5a1q5alb90pcw2.R.rethrow($CLV_t2$);}finally{__CLR4_4_11q5a1q5alb90pcw2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.euclidean.threed.Vector3DTest.testCrossProductCancellation",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),80662,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kcgm231q8m(){try{__CLR4_4_11q5a1q5alb90pcw2.R.inc(80662);
        __CLR4_4_11q5a1q5alb90pcw2.R.inc(80663);Vector3D v1 = new Vector3D(9070467121.0, 4535233560.0, 1);
        __CLR4_4_11q5a1q5alb90pcw2.R.inc(80664);Vector3D v2 = new Vector3D(9070467123.0, 4535233561.0, 1);
        __CLR4_4_11q5a1q5alb90pcw2.R.inc(80665);checkVector(Vector3D.crossProduct(v1, v2), -1, 2, 1);

        __CLR4_4_11q5a1q5alb90pcw2.R.inc(80666);double scale    = FastMath.scalb(1.0, 100);
        __CLR4_4_11q5a1q5alb90pcw2.R.inc(80667);Vector3D big1   = new Vector3D(scale, v1);
        __CLR4_4_11q5a1q5alb90pcw2.R.inc(80668);Vector3D small2 = new Vector3D(1 / scale, v2);
        __CLR4_4_11q5a1q5alb90pcw2.R.inc(80669);checkVector(Vector3D.crossProduct(big1, small2), -1, 2, 1);

    }finally{__CLR4_4_11q5a1q5alb90pcw2.R.flushNeeded();}}

    @Test
    public void testAngular() {__CLR4_4_11q5a1q5alb90pcw2.R.globalSliceStart(getClass().getName(),80670);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11l4a471q8u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11q5a1q5alb90pcw2.R.rethrow($CLV_t2$);}finally{__CLR4_4_11q5a1q5alb90pcw2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.euclidean.threed.Vector3DTest.testAngular",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),80670,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11l4a471q8u(){try{__CLR4_4_11q5a1q5alb90pcw2.R.inc(80670);
        __CLR4_4_11q5a1q5alb90pcw2.R.inc(80671);Assert.assertEquals(0,           Vector3D.PLUS_I.getAlpha(), 1.0e-10);
        __CLR4_4_11q5a1q5alb90pcw2.R.inc(80672);Assert.assertEquals(0,           Vector3D.PLUS_I.getDelta(), 1.0e-10);
        __CLR4_4_11q5a1q5alb90pcw2.R.inc(80673);Assert.assertEquals(FastMath.PI / 2, Vector3D.PLUS_J.getAlpha(), 1.0e-10);
        __CLR4_4_11q5a1q5alb90pcw2.R.inc(80674);Assert.assertEquals(0,           Vector3D.PLUS_J.getDelta(), 1.0e-10);
        __CLR4_4_11q5a1q5alb90pcw2.R.inc(80675);Assert.assertEquals(0,           Vector3D.PLUS_K.getAlpha(), 1.0e-10);
        __CLR4_4_11q5a1q5alb90pcw2.R.inc(80676);Assert.assertEquals(FastMath.PI / 2, Vector3D.PLUS_K.getDelta(), 1.0e-10);
      
        __CLR4_4_11q5a1q5alb90pcw2.R.inc(80677);Vector3D u = new Vector3D(-1, 1, -1);
        __CLR4_4_11q5a1q5alb90pcw2.R.inc(80678);Assert.assertEquals(3 * FastMath.PI /4, u.getAlpha(), 1.0e-10);
        __CLR4_4_11q5a1q5alb90pcw2.R.inc(80679);Assert.assertEquals(-1.0 / FastMath.sqrt(3), FastMath.sin(u.getDelta()), 1.0e-10);
    }finally{__CLR4_4_11q5a1q5alb90pcw2.R.flushNeeded();}}

    @Test
    public void testAngularSeparation() throws MathArithmeticException {__CLR4_4_11q5a1q5alb90pcw2.R.globalSliceStart(getClass().getName(),80680);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1b9uxib1q94();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11q5a1q5alb90pcw2.R.rethrow($CLV_t2$);}finally{__CLR4_4_11q5a1q5alb90pcw2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.euclidean.threed.Vector3DTest.testAngularSeparation",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),80680,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1b9uxib1q94() throws MathArithmeticException{try{__CLR4_4_11q5a1q5alb90pcw2.R.inc(80680);
        __CLR4_4_11q5a1q5alb90pcw2.R.inc(80681);Vector3D v1 = new Vector3D(2, -1, 4);

        __CLR4_4_11q5a1q5alb90pcw2.R.inc(80682);Vector3D  k = v1.normalize();
        __CLR4_4_11q5a1q5alb90pcw2.R.inc(80683);Vector3D  i = k.orthogonal();
        __CLR4_4_11q5a1q5alb90pcw2.R.inc(80684);Vector3D v2 = k.scalarMultiply(FastMath.cos(1.2)).add(i.scalarMultiply(FastMath.sin(1.2)));

        __CLR4_4_11q5a1q5alb90pcw2.R.inc(80685);Assert.assertTrue(FastMath.abs(Vector3D.angle(v1, v2) - 1.2) < 1.0e-12);
  }finally{__CLR4_4_11q5a1q5alb90pcw2.R.flushNeeded();}}

    @Test
    public void testNormalize() throws MathArithmeticException {__CLR4_4_11q5a1q5alb90pcw2.R.globalSliceStart(getClass().getName(),80686);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1i0t4se1q9a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11q5a1q5alb90pcw2.R.rethrow($CLV_t2$);}finally{__CLR4_4_11q5a1q5alb90pcw2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.euclidean.threed.Vector3DTest.testNormalize",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),80686,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1i0t4se1q9a() throws MathArithmeticException{try{__CLR4_4_11q5a1q5alb90pcw2.R.inc(80686);
        __CLR4_4_11q5a1q5alb90pcw2.R.inc(80687);Assert.assertEquals(1.0, new Vector3D(5, -4, 2).normalize().getNorm(), 1.0e-12);
        __CLR4_4_11q5a1q5alb90pcw2.R.inc(80688);try {
            __CLR4_4_11q5a1q5alb90pcw2.R.inc(80689);Vector3D.ZERO.normalize();
            __CLR4_4_11q5a1q5alb90pcw2.R.inc(80690);Assert.fail("an exception should have been thrown");
        } catch (MathArithmeticException ae) {
            // expected behavior
        }
    }finally{__CLR4_4_11q5a1q5alb90pcw2.R.flushNeeded();}}

    @Test
    public void testNegate() {__CLR4_4_11q5a1q5alb90pcw2.R.globalSliceStart(getClass().getName(),80691);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ffqfwl1q9f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11q5a1q5alb90pcw2.R.rethrow($CLV_t2$);}finally{__CLR4_4_11q5a1q5alb90pcw2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.euclidean.threed.Vector3DTest.testNegate",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),80691,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ffqfwl1q9f(){try{__CLR4_4_11q5a1q5alb90pcw2.R.inc(80691);
        __CLR4_4_11q5a1q5alb90pcw2.R.inc(80692);checkVector(new Vector3D(0.1, 2.5, 1.3).negate(), -0.1, -2.5, -1.3);
    }finally{__CLR4_4_11q5a1q5alb90pcw2.R.flushNeeded();}}

    @Test
    public void testOrthogonal() throws MathArithmeticException {__CLR4_4_11q5a1q5alb90pcw2.R.globalSliceStart(getClass().getName(),80693);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1olwq5q1q9h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11q5a1q5alb90pcw2.R.rethrow($CLV_t2$);}finally{__CLR4_4_11q5a1q5alb90pcw2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.euclidean.threed.Vector3DTest.testOrthogonal",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),80693,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1olwq5q1q9h() throws MathArithmeticException{try{__CLR4_4_11q5a1q5alb90pcw2.R.inc(80693);
        __CLR4_4_11q5a1q5alb90pcw2.R.inc(80694);Vector3D v1 = new Vector3D(0.1, 2.5, 1.3);
        __CLR4_4_11q5a1q5alb90pcw2.R.inc(80695);Assert.assertEquals(0.0, Vector3D.dotProduct(v1, v1.orthogonal()), 1.0e-12);
        __CLR4_4_11q5a1q5alb90pcw2.R.inc(80696);Vector3D v2 = new Vector3D(2.3, -0.003, 7.6);
        __CLR4_4_11q5a1q5alb90pcw2.R.inc(80697);Assert.assertEquals(0.0, Vector3D.dotProduct(v2, v2.orthogonal()), 1.0e-12);
        __CLR4_4_11q5a1q5alb90pcw2.R.inc(80698);Vector3D v3 = new Vector3D(-1.7, 1.4, 0.2);
        __CLR4_4_11q5a1q5alb90pcw2.R.inc(80699);Assert.assertEquals(0.0, Vector3D.dotProduct(v3, v3.orthogonal()), 1.0e-12);
        __CLR4_4_11q5a1q5alb90pcw2.R.inc(80700);Vector3D v4 = new Vector3D(4.2, 0.1, -1.8);
        __CLR4_4_11q5a1q5alb90pcw2.R.inc(80701);Assert.assertEquals(0.0, Vector3D.dotProduct(v4, v4.orthogonal()), 1.0e-12);
        __CLR4_4_11q5a1q5alb90pcw2.R.inc(80702);try {
            __CLR4_4_11q5a1q5alb90pcw2.R.inc(80703);new Vector3D(0, 0, 0).orthogonal();
            __CLR4_4_11q5a1q5alb90pcw2.R.inc(80704);Assert.fail("an exception should have been thrown");
        } catch (MathArithmeticException ae) {
            // expected behavior
        }
    }finally{__CLR4_4_11q5a1q5alb90pcw2.R.flushNeeded();}}
    @Test
    public void testAngle() throws MathArithmeticException {__CLR4_4_11q5a1q5alb90pcw2.R.globalSliceStart(getClass().getName(),80705);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18umwlk1q9t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11q5a1q5alb90pcw2.R.rethrow($CLV_t2$);}finally{__CLR4_4_11q5a1q5alb90pcw2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.euclidean.threed.Vector3DTest.testAngle",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),80705,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18umwlk1q9t() throws MathArithmeticException{try{__CLR4_4_11q5a1q5alb90pcw2.R.inc(80705);
        __CLR4_4_11q5a1q5alb90pcw2.R.inc(80706);Assert.assertEquals(0.22572612855273393616,
                            Vector3D.angle(new Vector3D(1, 2, 3), new Vector3D(4, 5, 6)),
                            1.0e-12);
        __CLR4_4_11q5a1q5alb90pcw2.R.inc(80707);Assert.assertEquals(7.98595620686106654517199e-8,
                            Vector3D.angle(new Vector3D(1, 2, 3), new Vector3D(2, 4, 6.000001)),
                            1.0e-12);
        __CLR4_4_11q5a1q5alb90pcw2.R.inc(80708);Assert.assertEquals(3.14159257373023116985197793156,
                            Vector3D.angle(new Vector3D(1, 2, 3), new Vector3D(-2, -4, -6.000001)),
                            1.0e-12);
        __CLR4_4_11q5a1q5alb90pcw2.R.inc(80709);try {
            __CLR4_4_11q5a1q5alb90pcw2.R.inc(80710);Vector3D.angle(Vector3D.ZERO, Vector3D.PLUS_I);
            __CLR4_4_11q5a1q5alb90pcw2.R.inc(80711);Assert.fail("an exception should have been thrown");
        } catch (MathArithmeticException ae) {
            // expected behavior
        }
    }finally{__CLR4_4_11q5a1q5alb90pcw2.R.flushNeeded();}}

    @Test
    public void testAccurateDotProduct() {__CLR4_4_11q5a1q5alb90pcw2.R.globalSliceStart(getClass().getName(),80712);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kwjjoz1qa0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11q5a1q5alb90pcw2.R.rethrow($CLV_t2$);}finally{__CLR4_4_11q5a1q5alb90pcw2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.euclidean.threed.Vector3DTest.testAccurateDotProduct",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),80712,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kwjjoz1qa0(){try{__CLR4_4_11q5a1q5alb90pcw2.R.inc(80712);
        // the following two vectors are nearly but not exactly orthogonal
        // naive dot product (i.e. computing u1.x * u2.x + u1.y * u2.y + u1.z * u2.z
        // leads to a result of 0.0, instead of the correct -1.855129...
        __CLR4_4_11q5a1q5alb90pcw2.R.inc(80713);Vector3D u1 = new Vector3D(-1321008684645961.0 /  268435456.0,
                                   -5774608829631843.0 /  268435456.0,
                                   -7645843051051357.0 / 8589934592.0);
        __CLR4_4_11q5a1q5alb90pcw2.R.inc(80714);Vector3D u2 = new Vector3D(-5712344449280879.0 /    2097152.0,
                                   -4550117129121957.0 /    2097152.0,
                                    8846951984510141.0 /     131072.0);
        __CLR4_4_11q5a1q5alb90pcw2.R.inc(80715);double sNaive = u1.getX() * u2.getX() + u1.getY() * u2.getY() + u1.getZ() * u2.getZ();
        __CLR4_4_11q5a1q5alb90pcw2.R.inc(80716);double sAccurate = u1.dotProduct(u2);
        __CLR4_4_11q5a1q5alb90pcw2.R.inc(80717);Assert.assertEquals(0.0, sNaive, 1.0e-30);
        __CLR4_4_11q5a1q5alb90pcw2.R.inc(80718);Assert.assertEquals(-2088690039198397.0 / 1125899906842624.0, sAccurate, 1.0e-16);
    }finally{__CLR4_4_11q5a1q5alb90pcw2.R.flushNeeded();}}

    @Test
    public void testDotProduct() {__CLR4_4_11q5a1q5alb90pcw2.R.globalSliceStart(getClass().getName(),80719);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_151tsyn1qa7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11q5a1q5alb90pcw2.R.rethrow($CLV_t2$);}finally{__CLR4_4_11q5a1q5alb90pcw2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.euclidean.threed.Vector3DTest.testDotProduct",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),80719,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_151tsyn1qa7(){try{__CLR4_4_11q5a1q5alb90pcw2.R.inc(80719);
        // we compare accurate versus naive dot product implementations
        // on regular vectors (i.e. not extreme cases like in the previous test)
        __CLR4_4_11q5a1q5alb90pcw2.R.inc(80720);Well1024a random = new Well1024a(553267312521321234l);
        __CLR4_4_11q5a1q5alb90pcw2.R.inc(80721);for (int i = 0; (((i < 10000)&&(__CLR4_4_11q5a1q5alb90pcw2.R.iget(80722)!=0|true))||(__CLR4_4_11q5a1q5alb90pcw2.R.iget(80723)==0&false)); ++i) {{
            __CLR4_4_11q5a1q5alb90pcw2.R.inc(80724);double ux = 10000 * random.nextDouble();
            __CLR4_4_11q5a1q5alb90pcw2.R.inc(80725);double uy = 10000 * random.nextDouble();
            __CLR4_4_11q5a1q5alb90pcw2.R.inc(80726);double uz = 10000 * random.nextDouble();
            __CLR4_4_11q5a1q5alb90pcw2.R.inc(80727);double vx = 10000 * random.nextDouble();
            __CLR4_4_11q5a1q5alb90pcw2.R.inc(80728);double vy = 10000 * random.nextDouble();
            __CLR4_4_11q5a1q5alb90pcw2.R.inc(80729);double vz = 10000 * random.nextDouble();
            __CLR4_4_11q5a1q5alb90pcw2.R.inc(80730);double sNaive = ux * vx + uy * vy + uz * vz;
            __CLR4_4_11q5a1q5alb90pcw2.R.inc(80731);double sAccurate = new Vector3D(ux, uy, uz).dotProduct(new Vector3D(vx, vy, vz));
            __CLR4_4_11q5a1q5alb90pcw2.R.inc(80732);Assert.assertEquals(sNaive, sAccurate, 2.5e-16 * sAccurate);
        }
    }}finally{__CLR4_4_11q5a1q5alb90pcw2.R.flushNeeded();}}

    @Test
    public void testAccurateCrossProduct() {__CLR4_4_11q5a1q5alb90pcw2.R.globalSliceStart(getClass().getName(),80733);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yuetqc1qal();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11q5a1q5alb90pcw2.R.rethrow($CLV_t2$);}finally{__CLR4_4_11q5a1q5alb90pcw2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.euclidean.threed.Vector3DTest.testAccurateCrossProduct",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),80733,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yuetqc1qal(){try{__CLR4_4_11q5a1q5alb90pcw2.R.inc(80733);
        // the vectors u1 and u2 are nearly but not exactly anti-parallel
        // (7.31e-16 degrees from 180 degrees) naive cross product (i.e.
        // computing u1.x * u2.x + u1.y * u2.y + u1.z * u2.z
        // leads to a result of   [0.0009765, -0.0001220, -0.0039062],
        // instead of the correct [0.0006913, -0.0001254, -0.0007909]
        __CLR4_4_11q5a1q5alb90pcw2.R.inc(80734);final Vector3D u1 = new Vector3D(-1321008684645961.0 /   268435456.0,
                                         -5774608829631843.0 /   268435456.0,
                                         -7645843051051357.0 /  8589934592.0);
        __CLR4_4_11q5a1q5alb90pcw2.R.inc(80735);final Vector3D u2 = new Vector3D( 1796571811118507.0 /  2147483648.0,
                                          7853468008299307.0 /  2147483648.0,
                                          2599586637357461.0 / 17179869184.0);
        __CLR4_4_11q5a1q5alb90pcw2.R.inc(80736);final Vector3D u3 = new Vector3D(12753243807587107.0 / 18446744073709551616.0, 
                                         -2313766922703915.0 / 18446744073709551616.0, 
                                          -227970081415313.0 /   288230376151711744.0);
        __CLR4_4_11q5a1q5alb90pcw2.R.inc(80737);Vector3D cNaive = new Vector3D(u1.getY() * u2.getZ() - u1.getZ() * u2.getY(),
                                       u1.getZ() * u2.getX() - u1.getX() * u2.getZ(),
                                       u1.getX() * u2.getY() - u1.getY() * u2.getX());
        __CLR4_4_11q5a1q5alb90pcw2.R.inc(80738);Vector3D cAccurate = u1.crossProduct(u2);
        __CLR4_4_11q5a1q5alb90pcw2.R.inc(80739);Assert.assertTrue(u3.distance(cNaive) > 2.9 * u3.getNorm());
        __CLR4_4_11q5a1q5alb90pcw2.R.inc(80740);Assert.assertEquals(0.0, u3.distance(cAccurate), 1.0e-30 * cAccurate.getNorm());
    }finally{__CLR4_4_11q5a1q5alb90pcw2.R.flushNeeded();}}

    @Test
    public void testCrossProduct() {__CLR4_4_11q5a1q5alb90pcw2.R.globalSliceStart(getClass().getName(),80741);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11vme081qat();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11q5a1q5alb90pcw2.R.rethrow($CLV_t2$);}finally{__CLR4_4_11q5a1q5alb90pcw2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.euclidean.threed.Vector3DTest.testCrossProduct",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),80741,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11vme081qat(){try{__CLR4_4_11q5a1q5alb90pcw2.R.inc(80741);
        // we compare accurate versus naive cross product implementations
        // on regular vectors (i.e. not extreme cases like in the previous test)
        __CLR4_4_11q5a1q5alb90pcw2.R.inc(80742);Well1024a random = new Well1024a(885362227452043214l);
        __CLR4_4_11q5a1q5alb90pcw2.R.inc(80743);for (int i = 0; (((i < 10000)&&(__CLR4_4_11q5a1q5alb90pcw2.R.iget(80744)!=0|true))||(__CLR4_4_11q5a1q5alb90pcw2.R.iget(80745)==0&false)); ++i) {{
            __CLR4_4_11q5a1q5alb90pcw2.R.inc(80746);double ux = 10000 * random.nextDouble();
            __CLR4_4_11q5a1q5alb90pcw2.R.inc(80747);double uy = 10000 * random.nextDouble();
            __CLR4_4_11q5a1q5alb90pcw2.R.inc(80748);double uz = 10000 * random.nextDouble();
            __CLR4_4_11q5a1q5alb90pcw2.R.inc(80749);double vx = 10000 * random.nextDouble();
            __CLR4_4_11q5a1q5alb90pcw2.R.inc(80750);double vy = 10000 * random.nextDouble();
            __CLR4_4_11q5a1q5alb90pcw2.R.inc(80751);double vz = 10000 * random.nextDouble();
            __CLR4_4_11q5a1q5alb90pcw2.R.inc(80752);Vector3D cNaive = new Vector3D(uy * vz - uz * vy, uz * vx - ux * vz, ux * vy - uy * vx);
            __CLR4_4_11q5a1q5alb90pcw2.R.inc(80753);Vector3D cAccurate = new Vector3D(ux, uy, uz).crossProduct(new Vector3D(vx, vy, vz));
            __CLR4_4_11q5a1q5alb90pcw2.R.inc(80754);Assert.assertEquals(0.0, cAccurate.distance(cNaive), 6.0e-15 * cAccurate.getNorm());
        }
    }}finally{__CLR4_4_11q5a1q5alb90pcw2.R.flushNeeded();}}

    private void checkVector(Vector3D v, double x, double y, double z) {try{__CLR4_4_11q5a1q5alb90pcw2.R.inc(80755);
        __CLR4_4_11q5a1q5alb90pcw2.R.inc(80756);Assert.assertEquals(x, v.getX(), 1.0e-12);
        __CLR4_4_11q5a1q5alb90pcw2.R.inc(80757);Assert.assertEquals(y, v.getY(), 1.0e-12);
        __CLR4_4_11q5a1q5alb90pcw2.R.inc(80758);Assert.assertEquals(z, v.getZ(), 1.0e-12);
    }finally{__CLR4_4_11q5a1q5alb90pcw2.R.flushNeeded();}}
}
