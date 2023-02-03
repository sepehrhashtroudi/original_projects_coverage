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

import org.apache.commons.math3.analysis.differentiation.DerivativeStructure;
import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.exception.MathArithmeticException;
import org.apache.commons.math3.random.Well1024a;
import org.apache.commons.math3.util.FastMath;
import org.apache.commons.math3.util.Precision;
import org.junit.Assert;
import org.junit.Test;

public class FieldVector3DTest {static class __CLR4_4_11p2k1p2klb90pcsb{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,79544,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testConstructors() throws DimensionMismatchException {__CLR4_4_11p2k1p2klb90pcsb.R.globalSliceStart(getClass().getName(),79148);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lwxahe1p2k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11p2k1p2klb90pcsb.R.rethrow($CLV_t2$);}finally{__CLR4_4_11p2k1p2klb90pcsb.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.euclidean.threed.FieldVector3DTest.testConstructors",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),79148,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lwxahe1p2k() throws DimensionMismatchException{try{__CLR4_4_11p2k1p2klb90pcsb.R.inc(79148);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79149);double cosAlpha = 1 / 2.0;
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79150);double sinAlpha = FastMath.sqrt(3) / 2.0;
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79151);double cosDelta = FastMath.sqrt(2) / 2.0;
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79152);double sinDelta = -FastMath.sqrt(2) / 2.0;
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79153);FieldVector3D<DerivativeStructure> u = new FieldVector3D<DerivativeStructure>(2,
                new FieldVector3D<DerivativeStructure>(new DerivativeStructure(2, 1, 0,  FastMath.PI / 3),
                        new DerivativeStructure(2, 1, 1, -FastMath.PI / 4)));
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79154);checkVector(u, 2 * cosAlpha * cosDelta, 2 * sinAlpha * cosDelta, 2 * sinDelta);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79155);Assert.assertEquals(-2 * sinAlpha * cosDelta, u.getX().getPartialDerivative(1, 0), 1.0e-12);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79156);Assert.assertEquals(+2 * cosAlpha * cosDelta, u.getY().getPartialDerivative(1, 0), 1.0e-12);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79157);Assert.assertEquals(0,                        u.getZ().getPartialDerivative(1, 0), 1.0e-12);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79158);Assert.assertEquals(-2 * cosAlpha * sinDelta, u.getX().getPartialDerivative(0, 1), 1.0e-12);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79159);Assert.assertEquals(-2 * sinAlpha * sinDelta, u.getY().getPartialDerivative(0, 1), 1.0e-12);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79160);Assert.assertEquals(2 * cosDelta,             u.getZ().getPartialDerivative(0, 1), 1.0e-12);

        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79161);checkVector(new FieldVector3D<DerivativeStructure>(2, createVector(1, 0,  0, 3)),
                                   2, 0, 0, 2, 0, 0, 0, 2, 0, 0, 0, 2);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79162);checkVector(new FieldVector3D<DerivativeStructure>(new DerivativeStructure(4, 1, 3,  2.0),
                                   createVector(1, 0,  0, 4)),
                                   2, 0, 0, 2, 0, 0, 1, 0, 2, 0, 0, 0, 0, 2, 0);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79163);checkVector(new FieldVector3D<DerivativeStructure>(new DerivativeStructure(4, 1, 3,  2.0),
                                   new Vector3D(1, 0,  0)),
                                   2, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0);

        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79164);checkVector(new FieldVector3D<DerivativeStructure>(2, createVector(1, 0,  0, 3),
                                   -3, createVector(0, 0, -1, 3)),
                                   2, 0, 3, -1, 0, 0, 0, -1, 0, 0, 0, -1);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79165);checkVector(new FieldVector3D<DerivativeStructure>(new DerivativeStructure(4, 1, 3,  2.0),
                                   createVector(1, 0,  0, 4),
                                   new DerivativeStructure(4, 1, 3, -3.0),
                                   createVector(0, 0, -1, 4)),
                                   2, 0, 3, -1, 0, 0, 1, 0, -1, 0, 0, 0, 0, -1, -1);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79166);checkVector(new FieldVector3D<DerivativeStructure>(new DerivativeStructure(4, 1, 3,  2.0),
                                   new Vector3D(1, 0,  0),
                                   new DerivativeStructure(4, 1, 3, -3.0),
                                   new Vector3D(0, 0, -1)),
                                   2, 0, 3, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, -1);

        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79167);checkVector(new FieldVector3D<DerivativeStructure>(2, createVector(1, 0, 0, 3),
                                   5, createVector(0, 1, 0, 3),
                                   -3, createVector(0, 0, -1, 3)),
                                   2, 5, 3, 4, 0, 0, 0, 4, 0, 0, 0, 4);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79168);checkVector(new FieldVector3D<DerivativeStructure>(new DerivativeStructure(4, 1, 3,  2.0),
                                   createVector(1, 0,  0, 4),
                                   new DerivativeStructure(4, 1, 3,  5.0),
                                   createVector(0, 1,  0, 4),
                                   new DerivativeStructure(4, 1, 3, -3.0),
                                   createVector(0, 0, -1, 4)),
                                   2, 5, 3, 4, 0, 0, 1, 0, 4, 0, 1, 0, 0, 4, -1);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79169);checkVector(new FieldVector3D<DerivativeStructure>(new DerivativeStructure(4, 1, 3,  2.0),
                                   new Vector3D(1, 0,  0),
                                   new DerivativeStructure(4, 1, 3,  5.0),
                                   new Vector3D(0, 1,  0),
                                   new DerivativeStructure(4, 1, 3, -3.0),
                                   new Vector3D(0, 0, -1)),
                                   2, 5, 3, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, -1);

        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79170);checkVector(new FieldVector3D<DerivativeStructure>(2, createVector(1, 0, 0, 3),
                                   5, createVector(0, 1, 0, 3),
                                   5, createVector(0, -1, 0, 3),
                                   -3, createVector(0, 0, -1, 3)),
                                   2, 0, 3, 9, 0, 0, 0, 9, 0, 0, 0, 9);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79171);checkVector(new FieldVector3D<DerivativeStructure>(new DerivativeStructure(4, 1, 3,  2.0),
                                   createVector(1, 0,  0, 4),
                                   new DerivativeStructure(4, 1, 3,  5.0),
                                   createVector(0, 1,  0, 4),
                                   new DerivativeStructure(4, 1, 3,  5.0),
                                   createVector(0, -1,  0, 4),
                                   new DerivativeStructure(4, 1, 3, -3.0),
                                   createVector(0, 0, -1, 4)),
                                   2, 0, 3, 9, 0, 0, 1, 0, 9, 0, 0, 0, 0, 9, -1);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79172);checkVector(new FieldVector3D<DerivativeStructure>(new DerivativeStructure(4, 1, 3,  2.0),
                                   new Vector3D(1, 0,  0),
                                   new DerivativeStructure(4, 1, 3,  5.0),
                                   new Vector3D(0, 1,  0),
                                   new DerivativeStructure(4, 1, 3,  5.0),
                                   new Vector3D(0, -1,  0),
                                   new DerivativeStructure(4, 1, 3, -3.0),
                                   new Vector3D(0, 0, -1)),
                                   2, 0, 3, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, -1);

        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79173);checkVector(new FieldVector3D<DerivativeStructure>(new DerivativeStructure[] {
            new DerivativeStructure(3, 1, 2,  2),
            new DerivativeStructure(3, 1, 1,  5),
            new DerivativeStructure(3, 1, 0, -3)
        }),
        2, 5, -3, 0, 0, 1, 0, 1, 0, 1, 0, 0);

    }finally{__CLR4_4_11p2k1p2klb90pcsb.R.flushNeeded();}}

    @Test
    public void testEquals() {__CLR4_4_11p2k1p2klb90pcsb.R.globalSliceStart(getClass().getName(),79174);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s4e6081p3a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11p2k1p2klb90pcsb.R.rethrow($CLV_t2$);}finally{__CLR4_4_11p2k1p2klb90pcsb.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.euclidean.threed.FieldVector3DTest.testEquals",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),79174,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s4e6081p3a(){try{__CLR4_4_11p2k1p2klb90pcsb.R.inc(79174);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79175);FieldVector3D<DerivativeStructure> u1 = createVector(1, 2, 3, 3);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79176);FieldVector3D<DerivativeStructure> v  = createVector(1, 2, 3 + 10 * Precision.EPSILON, 3);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79177);Assert.assertTrue(u1.equals(u1));
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79178);Assert.assertTrue(u1.equals(new FieldVector3D<DerivativeStructure>(new DerivativeStructure(3, 1, 0, 1.0),
                                                   new DerivativeStructure(3, 1, 1, 2.0),
                                                   new DerivativeStructure(3, 1, 2, 3.0))));
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79179);Assert.assertFalse(u1.equals(new FieldVector3D<DerivativeStructure>(new DerivativeStructure(3, 1, 1.0),
                                                    new DerivativeStructure(3, 1, 1, 2.0),
                                                    new DerivativeStructure(3, 1, 2, 3.0))));
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79180);Assert.assertFalse(u1.equals(new FieldVector3D<DerivativeStructure>(new DerivativeStructure(3, 1, 0, 1.0),
                                                    new DerivativeStructure(3, 1, 2.0),
                                                    new DerivativeStructure(3, 1, 2, 3.0))));
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79181);Assert.assertFalse(u1.equals(new FieldVector3D<DerivativeStructure>(new DerivativeStructure(3, 1, 0, 1.0),
                                                    new DerivativeStructure(3, 1, 1, 2.0),
                                                    new DerivativeStructure(3, 1, 3.0))));
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79182);Assert.assertFalse(u1.equals(v));
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79183);Assert.assertFalse(u1.equals(u1.toVector3D()));
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79184);Assert.assertTrue(createVector(0, Double.NaN, 0, 3).equals(createVector(0, 0, Double.NaN, 3)));
    }finally{__CLR4_4_11p2k1p2klb90pcsb.R.flushNeeded();}}

    @Test
    public void testHash() {__CLR4_4_11p2k1p2klb90pcsb.R.globalSliceStart(getClass().getName(),79185);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1djgsu11p3l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11p2k1p2klb90pcsb.R.rethrow($CLV_t2$);}finally{__CLR4_4_11p2k1p2klb90pcsb.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.euclidean.threed.FieldVector3DTest.testHash",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),79185,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1djgsu11p3l(){try{__CLR4_4_11p2k1p2klb90pcsb.R.inc(79185);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79186);Assert.assertEquals(createVector(0, Double.NaN, 0, 3).hashCode(), createVector(0, 0, Double.NaN, 3).hashCode());
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79187);FieldVector3D<DerivativeStructure> u = createVector(1, 2, 3, 3);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79188);FieldVector3D<DerivativeStructure> v = createVector(1, 2, 3 + 10 * Precision.EPSILON, 3);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79189);Assert.assertTrue(u.hashCode() != v.hashCode());
    }finally{__CLR4_4_11p2k1p2klb90pcsb.R.flushNeeded();}}

    @Test
    public void testInfinite() {__CLR4_4_11p2k1p2klb90pcsb.R.globalSliceStart(getClass().getName(),79190);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1foyoc31p3q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11p2k1p2klb90pcsb.R.rethrow($CLV_t2$);}finally{__CLR4_4_11p2k1p2klb90pcsb.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.euclidean.threed.FieldVector3DTest.testInfinite",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),79190,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1foyoc31p3q(){try{__CLR4_4_11p2k1p2klb90pcsb.R.inc(79190);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79191);Assert.assertTrue(createVector(1, 1, Double.NEGATIVE_INFINITY, 3).isInfinite());
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79192);Assert.assertTrue(createVector(1, Double.NEGATIVE_INFINITY, 1, 3).isInfinite());
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79193);Assert.assertTrue(createVector(Double.NEGATIVE_INFINITY, 1, 1, 3).isInfinite());
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79194);Assert.assertFalse(createVector(1, 1, 2, 3).isInfinite());
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79195);Assert.assertFalse(createVector(1, Double.NaN, Double.NEGATIVE_INFINITY, 3).isInfinite());
    }finally{__CLR4_4_11p2k1p2klb90pcsb.R.flushNeeded();}}

    @Test
    public void testNaN() {__CLR4_4_11p2k1p2klb90pcsb.R.globalSliceStart(getClass().getName(),79196);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1eihm8g1p3w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11p2k1p2klb90pcsb.R.rethrow($CLV_t2$);}finally{__CLR4_4_11p2k1p2klb90pcsb.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.euclidean.threed.FieldVector3DTest.testNaN",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),79196,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1eihm8g1p3w(){try{__CLR4_4_11p2k1p2klb90pcsb.R.inc(79196);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79197);Assert.assertTrue(createVector(1, 1, Double.NaN, 3).isNaN());
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79198);Assert.assertTrue(createVector(1, Double.NaN, 1, 3).isNaN());
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79199);Assert.assertTrue(createVector(Double.NaN, 1, 1, 3).isNaN());
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79200);Assert.assertFalse(createVector(1, 1, 2, 3).isNaN());
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79201);Assert.assertFalse(createVector(1, 1, Double.NEGATIVE_INFINITY, 3).isNaN());
    }finally{__CLR4_4_11p2k1p2klb90pcsb.R.flushNeeded();}}

    @Test
    public void testToString() {__CLR4_4_11p2k1p2klb90pcsb.R.globalSliceStart(getClass().getName(),79202);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hrxdid1p42();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11p2k1p2klb90pcsb.R.rethrow($CLV_t2$);}finally{__CLR4_4_11p2k1p2klb90pcsb.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.euclidean.threed.FieldVector3DTest.testToString",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),79202,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hrxdid1p42(){try{__CLR4_4_11p2k1p2klb90pcsb.R.inc(79202);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79203);Assert.assertEquals("{3; 2; 1}", createVector(3, 2, 1, 3).toString());
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79204);NumberFormat format = new DecimalFormat("0.000", new DecimalFormatSymbols(Locale.US));
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79205);Assert.assertEquals("{3.000; 2.000; 1.000}", createVector(3, 2, 1, 3).toString(format));
    }finally{__CLR4_4_11p2k1p2klb90pcsb.R.flushNeeded();}}

    @Test(expected=DimensionMismatchException.class)
    public void testWrongDimension() throws DimensionMismatchException {__CLR4_4_11p2k1p2klb90pcsb.R.globalSliceStart(getClass().getName(),79206);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rgoocy1p46();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,87,114,111,110,103,68,105,109,101,110,115,105,111,110,58,32,91,68,105,109,101,110,115,105,111,110,77,105,115,109,97,116,99,104,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof DimensionMismatchException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11p2k1p2klb90pcsb.R.rethrow($CLV_t2$);}finally{__CLR4_4_11p2k1p2klb90pcsb.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.euclidean.threed.FieldVector3DTest.testWrongDimension",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),79206,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rgoocy1p46() throws DimensionMismatchException{try{__CLR4_4_11p2k1p2klb90pcsb.R.inc(79206);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79207);new FieldVector3D<DerivativeStructure>(new DerivativeStructure[] {
            new DerivativeStructure(3, 1, 0, 2),
            new DerivativeStructure(3, 1, 0, 5)
        });
    }finally{__CLR4_4_11p2k1p2klb90pcsb.R.flushNeeded();}}

    @Test
    public void testCoordinates() {__CLR4_4_11p2k1p2klb90pcsb.R.globalSliceStart(getClass().getName(),79208);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jq43001p48();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11p2k1p2klb90pcsb.R.rethrow($CLV_t2$);}finally{__CLR4_4_11p2k1p2klb90pcsb.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.euclidean.threed.FieldVector3DTest.testCoordinates",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),79208,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jq43001p48(){try{__CLR4_4_11p2k1p2klb90pcsb.R.inc(79208);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79209);FieldVector3D<DerivativeStructure> v = createVector(1, 2, 3, 3);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79210);Assert.assertTrue(FastMath.abs(v.getX().getReal() - 1) < 1.0e-12);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79211);Assert.assertTrue(FastMath.abs(v.getY().getReal() - 2) < 1.0e-12);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79212);Assert.assertTrue(FastMath.abs(v.getZ().getReal() - 3) < 1.0e-12);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79213);DerivativeStructure[] coordinates = v.toArray();
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79214);Assert.assertTrue(FastMath.abs(coordinates[0].getReal() - 1) < 1.0e-12);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79215);Assert.assertTrue(FastMath.abs(coordinates[1].getReal() - 2) < 1.0e-12);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79216);Assert.assertTrue(FastMath.abs(coordinates[2].getReal() - 3) < 1.0e-12);
    }finally{__CLR4_4_11p2k1p2klb90pcsb.R.flushNeeded();}}

    @Test
    public void testNorm1() {__CLR4_4_11p2k1p2klb90pcsb.R.globalSliceStart(getClass().getName(),79217);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1unx1m21p4h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11p2k1p2klb90pcsb.R.rethrow($CLV_t2$);}finally{__CLR4_4_11p2k1p2klb90pcsb.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.euclidean.threed.FieldVector3DTest.testNorm1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),79217,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1unx1m21p4h(){try{__CLR4_4_11p2k1p2klb90pcsb.R.inc(79217);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79218);Assert.assertEquals( 0.0, createVector(0, 0, 0, 3).getNorm1().getReal(), 0);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79219);Assert.assertEquals( 6.0, createVector(1, -2, 3, 3).getNorm1().getReal(), 0);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79220);Assert.assertEquals( 1.0, createVector(1, -2, 3, 3).getNorm1().getPartialDerivative(1, 0, 0), 0);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79221);Assert.assertEquals(-1.0, createVector(1, -2, 3, 3).getNorm1().getPartialDerivative(0, 1, 0), 0);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79222);Assert.assertEquals( 1.0, createVector(1, -2, 3, 3).getNorm1().getPartialDerivative(0, 0, 1), 0);
    }finally{__CLR4_4_11p2k1p2klb90pcsb.R.flushNeeded();}}

    @Test
    public void testNorm() {__CLR4_4_11p2k1p2klb90pcsb.R.globalSliceStart(getClass().getName(),79223);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rs5o971p4n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11p2k1p2klb90pcsb.R.rethrow($CLV_t2$);}finally{__CLR4_4_11p2k1p2klb90pcsb.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.euclidean.threed.FieldVector3DTest.testNorm",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),79223,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rs5o971p4n(){try{__CLR4_4_11p2k1p2klb90pcsb.R.inc(79223);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79224);double r = FastMath.sqrt(14);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79225);Assert.assertEquals(0.0, createVector(0, 0, 0, 3).getNorm().getReal(), 0);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79226);Assert.assertEquals(r, createVector(1, 2, 3, 3).getNorm().getReal(), 1.0e-12);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79227);Assert.assertEquals( 1.0 / r, createVector(1, 2, 3, 3).getNorm().getPartialDerivative(1, 0, 0), 0);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79228);Assert.assertEquals( 2.0 / r, createVector(1, 2, 3, 3).getNorm().getPartialDerivative(0, 1, 0), 0);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79229);Assert.assertEquals( 3.0 / r, createVector(1, 2, 3, 3).getNorm().getPartialDerivative(0, 0, 1), 0);
    }finally{__CLR4_4_11p2k1p2klb90pcsb.R.flushNeeded();}}

    @Test
    public void testNormSq() {__CLR4_4_11p2k1p2klb90pcsb.R.globalSliceStart(getClass().getName(),79230);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16ljjn71p4u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11p2k1p2klb90pcsb.R.rethrow($CLV_t2$);}finally{__CLR4_4_11p2k1p2klb90pcsb.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.euclidean.threed.FieldVector3DTest.testNormSq",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),79230,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16ljjn71p4u(){try{__CLR4_4_11p2k1p2klb90pcsb.R.inc(79230);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79231);Assert.assertEquals(0.0, createVector(0, 0, 0, 3).getNormSq().getReal(), 0);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79232);Assert.assertEquals(14, createVector(1, 2, 3, 3).getNormSq().getReal(), 1.0e-12);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79233);Assert.assertEquals( 2, createVector(1, 2, 3, 3).getNormSq().getPartialDerivative(1, 0, 0), 0);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79234);Assert.assertEquals( 4, createVector(1, 2, 3, 3).getNormSq().getPartialDerivative(0, 1, 0), 0);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79235);Assert.assertEquals( 6, createVector(1, 2, 3, 3).getNormSq().getPartialDerivative(0, 0, 1), 0);
    }finally{__CLR4_4_11p2k1p2klb90pcsb.R.flushNeeded();}}

    @Test
    public void testNormInf() {__CLR4_4_11p2k1p2klb90pcsb.R.globalSliceStart(getClass().getName(),79236);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16mdo5i1p50();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11p2k1p2klb90pcsb.R.rethrow($CLV_t2$);}finally{__CLR4_4_11p2k1p2klb90pcsb.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.euclidean.threed.FieldVector3DTest.testNormInf",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),79236,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16mdo5i1p50(){try{__CLR4_4_11p2k1p2klb90pcsb.R.inc(79236);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79237);Assert.assertEquals( 0.0, createVector(0, 0, 0, 3).getNormInf().getReal(), 0);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79238);Assert.assertEquals( 3.0, createVector(1, -2, 3, 3).getNormInf().getReal(), 0);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79239);Assert.assertEquals( 0.0, createVector(1, -2, 3, 3).getNormInf().getPartialDerivative(1, 0, 0), 0);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79240);Assert.assertEquals( 0.0, createVector(1, -2, 3, 3).getNormInf().getPartialDerivative(0, 1, 0), 0);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79241);Assert.assertEquals( 1.0, createVector(1, -2, 3, 3).getNormInf().getPartialDerivative(0, 0, 1), 0);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79242);Assert.assertEquals( 3.0, createVector(2, -1, 3, 3).getNormInf().getReal(), 0);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79243);Assert.assertEquals( 0.0, createVector(2, -1, 3, 3).getNormInf().getPartialDerivative(1, 0, 0), 0);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79244);Assert.assertEquals( 0.0, createVector(2, -1, 3, 3).getNormInf().getPartialDerivative(0, 1, 0), 0);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79245);Assert.assertEquals( 1.0, createVector(2, -1, 3, 3).getNormInf().getPartialDerivative(0, 0, 1), 0);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79246);Assert.assertEquals( 3.0, createVector(1, -3, 2, 3).getNormInf().getReal(), 0);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79247);Assert.assertEquals( 0.0, createVector(1, -3, 2, 3).getNormInf().getPartialDerivative(1, 0, 0), 0);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79248);Assert.assertEquals(-1.0, createVector(1, -3, 2, 3).getNormInf().getPartialDerivative(0, 1, 0), 0);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79249);Assert.assertEquals( 0.0, createVector(1, -3, 2, 3).getNormInf().getPartialDerivative(0, 0, 1), 0);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79250);Assert.assertEquals( 3.0, createVector(2, -3, 1, 3).getNormInf().getReal(), 0);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79251);Assert.assertEquals( 0.0, createVector(2, -3, 1, 3).getNormInf().getPartialDerivative(1, 0, 0), 0);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79252);Assert.assertEquals(-1.0, createVector(2, -3, 1, 3).getNormInf().getPartialDerivative(0, 1, 0), 0);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79253);Assert.assertEquals( 0.0, createVector(2, -3, 1, 3).getNormInf().getPartialDerivative(0, 0, 1), 0);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79254);Assert.assertEquals( 3.0, createVector(3, -1, 2, 3).getNormInf().getReal(), 0);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79255);Assert.assertEquals( 1.0, createVector(3, -1, 2, 3).getNormInf().getPartialDerivative(1, 0, 0), 0);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79256);Assert.assertEquals( 0.0, createVector(3, -1, 2, 3).getNormInf().getPartialDerivative(0, 1, 0), 0);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79257);Assert.assertEquals( 0.0, createVector(3, -1, 2, 3).getNormInf().getPartialDerivative(0, 0, 1), 0);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79258);Assert.assertEquals( 3.0, createVector(3, -2, 1, 3).getNormInf().getReal(), 0);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79259);Assert.assertEquals( 1.0, createVector(3, -2, 1, 3).getNormInf().getPartialDerivative(1, 0, 0), 0);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79260);Assert.assertEquals( 0.0, createVector(3, -2, 1, 3).getNormInf().getPartialDerivative(0, 1, 0), 0);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79261);Assert.assertEquals( 0.0, createVector(3, -2, 1, 3).getNormInf().getPartialDerivative(0, 0, 1), 0);
    }finally{__CLR4_4_11p2k1p2klb90pcsb.R.flushNeeded();}}

    @Test
    public void testDistance1() {__CLR4_4_11p2k1p2klb90pcsb.R.globalSliceStart(getClass().getName(),79262);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_195deup1p5q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11p2k1p2klb90pcsb.R.rethrow($CLV_t2$);}finally{__CLR4_4_11p2k1p2klb90pcsb.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.euclidean.threed.FieldVector3DTest.testDistance1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),79262,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_195deup1p5q(){try{__CLR4_4_11p2k1p2klb90pcsb.R.inc(79262);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79263);FieldVector3D<DerivativeStructure> v1 = createVector(1, -2, 3, 3);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79264);FieldVector3D<DerivativeStructure> v2 = createVector(-4, 2, 0, 3);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79265);Assert.assertEquals(0.0, FieldVector3D.distance1(createVector(-1, 0, 0, 3), createVector(-1, 0, 0, 3)).getReal(), 0);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79266);DerivativeStructure distance = FieldVector3D.distance1(v1, v2);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79267);Assert.assertEquals(12.0, distance.getReal(), 1.0e-12);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79268);Assert.assertEquals(0, distance.getPartialDerivative(1, 0, 0), 1.0e-12);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79269);Assert.assertEquals(0, distance.getPartialDerivative(0, 1, 0), 1.0e-12);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79270);Assert.assertEquals(0, distance.getPartialDerivative(0, 0, 1), 1.0e-12);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79271);distance = FieldVector3D.distance1(v1, new Vector3D(-4, 2, 0));
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79272);Assert.assertEquals(12.0, distance.getReal(), 1.0e-12);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79273);Assert.assertEquals( 1, distance.getPartialDerivative(1, 0, 0), 1.0e-12);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79274);Assert.assertEquals(-1, distance.getPartialDerivative(0, 1, 0), 1.0e-12);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79275);Assert.assertEquals( 1, distance.getPartialDerivative(0, 0, 1), 1.0e-12);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79276);distance = FieldVector3D.distance1(new Vector3D(-4, 2, 0), v1);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79277);Assert.assertEquals(12.0, distance.getReal(), 1.0e-12);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79278);Assert.assertEquals( 1, distance.getPartialDerivative(1, 0, 0), 1.0e-12);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79279);Assert.assertEquals(-1, distance.getPartialDerivative(0, 1, 0), 1.0e-12);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79280);Assert.assertEquals( 1, distance.getPartialDerivative(0, 0, 1), 1.0e-12);
    }finally{__CLR4_4_11p2k1p2klb90pcsb.R.flushNeeded();}}

    @Test
    public void testDistance() {__CLR4_4_11p2k1p2klb90pcsb.R.globalSliceStart(getClass().getName(),79281);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1o82ia61p69();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11p2k1p2klb90pcsb.R.rethrow($CLV_t2$);}finally{__CLR4_4_11p2k1p2klb90pcsb.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.euclidean.threed.FieldVector3DTest.testDistance",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),79281,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1o82ia61p69(){try{__CLR4_4_11p2k1p2klb90pcsb.R.inc(79281);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79282);FieldVector3D<DerivativeStructure> v1 = createVector(1, -2, 3, 3);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79283);FieldVector3D<DerivativeStructure> v2 = createVector(-4, 2, 0, 3);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79284);Assert.assertEquals(0.0, FieldVector3D.distance(createVector(-1, 0, 0, 3), createVector(-1, 0, 0, 3)).getReal(), 0);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79285);DerivativeStructure distance = FieldVector3D.distance(v1, v2);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79286);Assert.assertEquals(FastMath.sqrt(50), distance.getReal(), 1.0e-12);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79287);Assert.assertEquals(0, distance.getPartialDerivative(1, 0, 0), 1.0e-12);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79288);Assert.assertEquals(0, distance.getPartialDerivative(0, 1, 0), 1.0e-12);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79289);Assert.assertEquals(0, distance.getPartialDerivative(0, 0, 1), 1.0e-12);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79290);distance = FieldVector3D.distance(v1, new Vector3D(-4, 2, 0));
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79291);Assert.assertEquals(FastMath.sqrt(50), distance.getReal(), 1.0e-12);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79292);Assert.assertEquals( 5 / FastMath.sqrt(50), distance.getPartialDerivative(1, 0, 0), 1.0e-12);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79293);Assert.assertEquals(-4 / FastMath.sqrt(50), distance.getPartialDerivative(0, 1, 0), 1.0e-12);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79294);Assert.assertEquals( 3 / FastMath.sqrt(50), distance.getPartialDerivative(0, 0, 1), 1.0e-12);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79295);distance = FieldVector3D.distance(new Vector3D(-4, 2, 0), v1);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79296);Assert.assertEquals(FastMath.sqrt(50), distance.getReal(), 1.0e-12);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79297);Assert.assertEquals( 5 / FastMath.sqrt(50), distance.getPartialDerivative(1, 0, 0), 1.0e-12);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79298);Assert.assertEquals(-4 / FastMath.sqrt(50), distance.getPartialDerivative(0, 1, 0), 1.0e-12);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79299);Assert.assertEquals( 3 / FastMath.sqrt(50), distance.getPartialDerivative(0, 0, 1), 1.0e-12);
    }finally{__CLR4_4_11p2k1p2klb90pcsb.R.flushNeeded();}}

    @Test
    public void testDistanceSq() {__CLR4_4_11p2k1p2klb90pcsb.R.globalSliceStart(getClass().getName(),79300);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1l3ck501p6s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11p2k1p2klb90pcsb.R.rethrow($CLV_t2$);}finally{__CLR4_4_11p2k1p2klb90pcsb.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.euclidean.threed.FieldVector3DTest.testDistanceSq",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),79300,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1l3ck501p6s(){try{__CLR4_4_11p2k1p2klb90pcsb.R.inc(79300);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79301);FieldVector3D<DerivativeStructure> v1 = createVector(1, -2, 3, 3);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79302);FieldVector3D<DerivativeStructure> v2 = createVector(-4, 2, 0, 3);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79303);Assert.assertEquals(0.0, FieldVector3D.distanceSq(createVector(-1, 0, 0, 3), createVector(-1, 0, 0, 3)).getReal(), 0);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79304);DerivativeStructure distanceSq = FieldVector3D.distanceSq(v1, v2);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79305);Assert.assertEquals(50.0, distanceSq.getReal(), 1.0e-12);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79306);Assert.assertEquals(0, distanceSq.getPartialDerivative(1, 0, 0), 1.0e-12);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79307);Assert.assertEquals(0, distanceSq.getPartialDerivative(0, 1, 0), 1.0e-12);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79308);Assert.assertEquals(0, distanceSq.getPartialDerivative(0, 0, 1), 1.0e-12);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79309);distanceSq = FieldVector3D.distanceSq(v1, new Vector3D(-4, 2, 0));
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79310);Assert.assertEquals(50.0, distanceSq.getReal(), 1.0e-12);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79311);Assert.assertEquals(10, distanceSq.getPartialDerivative(1, 0, 0), 1.0e-12);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79312);Assert.assertEquals(-8, distanceSq.getPartialDerivative(0, 1, 0), 1.0e-12);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79313);Assert.assertEquals( 6, distanceSq.getPartialDerivative(0, 0, 1), 1.0e-12);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79314);distanceSq = FieldVector3D.distanceSq(new Vector3D(-4, 2, 0), v1);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79315);Assert.assertEquals(50.0, distanceSq.getReal(), 1.0e-12);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79316);Assert.assertEquals(10, distanceSq.getPartialDerivative(1, 0, 0), 1.0e-12);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79317);Assert.assertEquals(-8, distanceSq.getPartialDerivative(0, 1, 0), 1.0e-12);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79318);Assert.assertEquals( 6, distanceSq.getPartialDerivative(0, 0, 1), 1.0e-12);
  }finally{__CLR4_4_11p2k1p2klb90pcsb.R.flushNeeded();}}

    @Test
    public void testDistanceInf() {__CLR4_4_11p2k1p2klb90pcsb.R.globalSliceStart(getClass().getName(),79319);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1coo9q71p7b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11p2k1p2klb90pcsb.R.rethrow($CLV_t2$);}finally{__CLR4_4_11p2k1p2klb90pcsb.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.euclidean.threed.FieldVector3DTest.testDistanceInf",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),79319,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1coo9q71p7b(){try{__CLR4_4_11p2k1p2klb90pcsb.R.inc(79319);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79320);FieldVector3D<DerivativeStructure> v1 = createVector(1, -2, 3, 3);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79321);FieldVector3D<DerivativeStructure> v2 = createVector(-4, 2, 0, 3);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79322);Assert.assertEquals(0.0, FieldVector3D.distanceInf(createVector(-1, 0, 0, 3), createVector(-1, 0, 0, 3)).getReal(), 0);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79323);DerivativeStructure distance = FieldVector3D.distanceInf(v1, v2);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79324);Assert.assertEquals(5.0, distance.getReal(), 1.0e-12);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79325);Assert.assertEquals(0, distance.getPartialDerivative(1, 0, 0), 1.0e-12);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79326);Assert.assertEquals(0, distance.getPartialDerivative(0, 1, 0), 1.0e-12);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79327);Assert.assertEquals(0, distance.getPartialDerivative(0, 0, 1), 1.0e-12);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79328);distance = FieldVector3D.distanceInf(v1, new Vector3D(-4, 2, 0));
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79329);Assert.assertEquals(5.0, distance.getReal(), 1.0e-12);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79330);Assert.assertEquals(1, distance.getPartialDerivative(1, 0, 0), 1.0e-12);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79331);Assert.assertEquals(0, distance.getPartialDerivative(0, 1, 0), 1.0e-12);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79332);Assert.assertEquals(0, distance.getPartialDerivative(0, 0, 1), 1.0e-12);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79333);distance = FieldVector3D.distanceInf(new Vector3D(-4, 2, 0), v1);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79334);Assert.assertEquals(5.0, distance.getReal(), 1.0e-12);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79335);Assert.assertEquals(1, distance.getPartialDerivative(1, 0, 0), 1.0e-12);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79336);Assert.assertEquals(0, distance.getPartialDerivative(0, 1, 0), 1.0e-12);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79337);Assert.assertEquals(0, distance.getPartialDerivative(0, 0, 1), 1.0e-12);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79338);Assert.assertEquals(v1.subtract(v2).getNormInf().getReal(), FieldVector3D.distanceInf(v1, v2).getReal(), 1.0e-12);

        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79339);Assert.assertEquals(5.0,
                            FieldVector3D.distanceInf(createVector( 1, -2, 3, 3), createVector(-4,  2, 0, 3)).getReal(),
                            1.0e-12);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79340);Assert.assertEquals(5.0,
                            FieldVector3D.distanceInf(createVector( 1, 3, -2, 3), createVector(-4, 0,  2, 3)).getReal(),
                            1.0e-12);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79341);Assert.assertEquals(5.0,
                            FieldVector3D.distanceInf(createVector(-2,  1, 3, 3), createVector( 2, -4, 0, 3)).getReal(),
                            1.0e-12);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79342);Assert.assertEquals(5.0,
                            FieldVector3D.distanceInf(createVector(-2, 3,  1, 3), createVector( 2, 0, -4, 3)).getReal(),
                            1.0e-12);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79343);Assert.assertEquals(5.0,
                            FieldVector3D.distanceInf(createVector(3, -2,  1, 3), createVector(0,  2, -4, 3)).getReal(),
                            1.0e-12);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79344);Assert.assertEquals(5.0,
                            FieldVector3D.distanceInf(createVector(3,  1, -2, 3), createVector(0, -4,  2, 3)).getReal(),
                            1.0e-12);

        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79345);Assert.assertEquals(5.0,
                            FieldVector3D.distanceInf(createVector( 1, -2, 3, 3), new Vector3D(-4,  2, 0)).getReal(),
                            1.0e-12);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79346);Assert.assertEquals(5.0,
                            FieldVector3D.distanceInf(createVector( 1, 3, -2, 3), new Vector3D(-4, 0,  2)).getReal(),
                            1.0e-12);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79347);Assert.assertEquals(5.0,
                            FieldVector3D.distanceInf(createVector(-2,  1, 3, 3), new Vector3D( 2, -4, 0)).getReal(),
                            1.0e-12);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79348);Assert.assertEquals(5.0,
                            FieldVector3D.distanceInf(createVector(-2, 3,  1, 3), new Vector3D( 2, 0, -4)).getReal(),
                            1.0e-12);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79349);Assert.assertEquals(5.0,
                            FieldVector3D.distanceInf(createVector(3, -2,  1, 3), new Vector3D(0,  2, -4)).getReal(),
                            1.0e-12);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79350);Assert.assertEquals(5.0,
                            FieldVector3D.distanceInf(createVector(3,  1, -2, 3), new Vector3D(0, -4,  2)).getReal(),
                            1.0e-12);

    }finally{__CLR4_4_11p2k1p2klb90pcsb.R.flushNeeded();}}

    @Test
    public void testSubtract() {__CLR4_4_11p2k1p2klb90pcsb.R.globalSliceStart(getClass().getName(),79351);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hib6tp1p87();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11p2k1p2klb90pcsb.R.rethrow($CLV_t2$);}finally{__CLR4_4_11p2k1p2klb90pcsb.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.euclidean.threed.FieldVector3DTest.testSubtract",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),79351,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hib6tp1p87(){try{__CLR4_4_11p2k1p2klb90pcsb.R.inc(79351);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79352);FieldVector3D<DerivativeStructure> v1 = createVector(1, 2, 3, 3);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79353);FieldVector3D<DerivativeStructure> v2 = createVector(-3, -2, -1, 3);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79354);v1 = v1.subtract(v2);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79355);checkVector(v1, 4, 4, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0);

        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79356);checkVector(v2.subtract(v1), -7, -6, -5, 1, 0, 0, 0, 1, 0, 0, 0, 1);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79357);checkVector(v2.subtract(new Vector3D(4, 4, 4)), -7, -6, -5, 1, 0, 0, 0, 1, 0, 0, 0, 1);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79358);checkVector(v2.subtract(3, v1), -15, -14, -13, 1, 0, 0, 0, 1, 0, 0, 0, 1);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79359);checkVector(v2.subtract(3, new Vector3D(4, 4, 4)), -15, -14, -13, 1, 0, 0, 0, 1, 0, 0, 0, 1);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79360);checkVector(v2.subtract(new DerivativeStructure(3, 1, 2, 3), new Vector3D(4, 4, 4)),
                    -15, -14, -13, 1, 0, -4, 0, 1, -4, 0, 0, -3);

        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79361);checkVector(createVector(1, 2, 3, 4).subtract(new DerivativeStructure(4, 1, 3, 5.0),
                                                      createVector(3, -2, 1, 4)),
                    -14, 12, -2,
                     -4,  0,  0, -3,
                      0, -4,  0,  2,
                      0,  0, -4, -1);

    }finally{__CLR4_4_11p2k1p2klb90pcsb.R.flushNeeded();}}

    @Test
    public void testAdd() {__CLR4_4_11p2k1p2klb90pcsb.R.globalSliceStart(getClass().getName(),79362);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vtx82e1p8i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11p2k1p2klb90pcsb.R.rethrow($CLV_t2$);}finally{__CLR4_4_11p2k1p2klb90pcsb.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.euclidean.threed.FieldVector3DTest.testAdd",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),79362,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vtx82e1p8i(){try{__CLR4_4_11p2k1p2klb90pcsb.R.inc(79362);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79363);FieldVector3D<DerivativeStructure> v1 = createVector(1, 2, 3, 3);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79364);FieldVector3D<DerivativeStructure> v2 = createVector(-3, -2, -1, 3);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79365);v1 = v1.add(v2);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79366);checkVector(v1, -2, 0, 2, 2, 0, 0, 0, 2, 0, 0, 0, 2);

        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79367);checkVector(v2.add(v1), -5, -2, 1, 3, 0, 0, 0, 3, 0, 0, 0, 3);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79368);checkVector(v2.add(new Vector3D(-2, 0, 2)), -5, -2, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79369);checkVector(v2.add(3, v1), -9, -2, 5, 7, 0, 0, 0, 7, 0, 0, 0, 7);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79370);checkVector(v2.add(3, new Vector3D(-2, 0, 2)), -9, -2, 5, 1, 0, 0, 0, 1, 0, 0, 0, 1);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79371);checkVector(v2.add(new DerivativeStructure(3, 1, 2, 3), new Vector3D(-2, 0, 2)),
                    -9, -2, 5, 1, 0, -2, 0, 1, 0, 0, 0, 3);

        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79372);checkVector(createVector(1, 2, 3, 4).add(new DerivativeStructure(4, 1, 3, 5.0),
                                                 createVector(3, -2, 1, 4)),
                    16, -8,  8,
                     6,  0,  0,  3,
                     0,  6,  0, -2,
                     0,  0,  6,  1);

    }finally{__CLR4_4_11p2k1p2klb90pcsb.R.flushNeeded();}}

    @Test
    public void testScalarProduct() {__CLR4_4_11p2k1p2klb90pcsb.R.globalSliceStart(getClass().getName(),79373);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vgfiso1p8t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11p2k1p2klb90pcsb.R.rethrow($CLV_t2$);}finally{__CLR4_4_11p2k1p2klb90pcsb.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.euclidean.threed.FieldVector3DTest.testScalarProduct",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),79373,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vgfiso1p8t(){try{__CLR4_4_11p2k1p2klb90pcsb.R.inc(79373);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79374);FieldVector3D<DerivativeStructure> v = createVector(1, 2, 3, 3);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79375);v = v.scalarMultiply(3);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79376);checkVector(v, 3, 6, 9);

        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79377);checkVector(v.scalarMultiply(0.5), 1.5, 3, 4.5);
    }finally{__CLR4_4_11p2k1p2klb90pcsb.R.flushNeeded();}}

    @Test
    public void testVectorialProducts() {__CLR4_4_11p2k1p2klb90pcsb.R.globalSliceStart(getClass().getName(),79378);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hnfkk61p8y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11p2k1p2klb90pcsb.R.rethrow($CLV_t2$);}finally{__CLR4_4_11p2k1p2klb90pcsb.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.euclidean.threed.FieldVector3DTest.testVectorialProducts",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),79378,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hnfkk61p8y(){try{__CLR4_4_11p2k1p2klb90pcsb.R.inc(79378);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79379);FieldVector3D<DerivativeStructure> v1 = createVector(2, 1, -4, 3);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79380);FieldVector3D<DerivativeStructure> v2 = createVector(3, 1, -1, 3);

        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79381);Assert.assertTrue(FastMath.abs(FieldVector3D.dotProduct(v1, v2).getReal() - 11) < 1.0e-12);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79382);Assert.assertTrue(FastMath.abs(FieldVector3D.dotProduct(v1, v2.toVector3D()).getReal() - 11) < 1.0e-12);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79383);Assert.assertTrue(FastMath.abs(FieldVector3D.dotProduct(v1.toVector3D(), v2).getReal() - 11) < 1.0e-12);

        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79384);FieldVector3D<DerivativeStructure> v3 = FieldVector3D.crossProduct(v1, v2);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79385);checkVector(v3, 3, -10, -1);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79386);Assert.assertTrue(FastMath.abs(FieldVector3D.dotProduct(v1, v3).getReal()) < 1.0e-12);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79387);Assert.assertTrue(FastMath.abs(FieldVector3D.dotProduct(v2, v3).getReal()) < 1.0e-12);

        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79388);v3 = FieldVector3D.crossProduct(v1, v2.toVector3D());
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79389);checkVector(v3, 3, -10, -1);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79390);Assert.assertTrue(FastMath.abs(FieldVector3D.dotProduct(v1, v3).getReal()) < 1.0e-12);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79391);Assert.assertTrue(FastMath.abs(FieldVector3D.dotProduct(v2, v3).getReal()) < 1.0e-12);

        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79392);v3 = FieldVector3D.crossProduct(v1.toVector3D(), v2);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79393);checkVector(v3, 3, -10, -1);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79394);Assert.assertTrue(FastMath.abs(FieldVector3D.dotProduct(v1, v3).getReal()) < 1.0e-12);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79395);Assert.assertTrue(FastMath.abs(FieldVector3D.dotProduct(v2, v3).getReal()) < 1.0e-12);

    }finally{__CLR4_4_11p2k1p2klb90pcsb.R.flushNeeded();}}

    @Test
    public void testCrossProductCancellation() {__CLR4_4_11p2k1p2klb90pcsb.R.globalSliceStart(getClass().getName(),79396);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kcgm231p9g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11p2k1p2klb90pcsb.R.rethrow($CLV_t2$);}finally{__CLR4_4_11p2k1p2klb90pcsb.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.euclidean.threed.FieldVector3DTest.testCrossProductCancellation",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),79396,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kcgm231p9g(){try{__CLR4_4_11p2k1p2klb90pcsb.R.inc(79396);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79397);FieldVector3D<DerivativeStructure> v1 = createVector(9070467121.0, 4535233560.0, 1, 3);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79398);FieldVector3D<DerivativeStructure> v2 = createVector(9070467123.0, 4535233561.0, 1, 3);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79399);checkVector(FieldVector3D.crossProduct(v1, v2), -1, 2, 1);

        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79400);double scale    = FastMath.scalb(1.0, 100);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79401);FieldVector3D<DerivativeStructure> big1   = new FieldVector3D<DerivativeStructure>(scale, v1);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79402);FieldVector3D<DerivativeStructure> small2 = new FieldVector3D<DerivativeStructure>(1 / scale, v2);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79403);checkVector(FieldVector3D.crossProduct(big1, small2), -1, 2, 1);

    }finally{__CLR4_4_11p2k1p2klb90pcsb.R.flushNeeded();}}

    @Test
    public void testAngular() {__CLR4_4_11p2k1p2klb90pcsb.R.globalSliceStart(getClass().getName(),79404);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11l4a471p9o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11p2k1p2klb90pcsb.R.rethrow($CLV_t2$);}finally{__CLR4_4_11p2k1p2klb90pcsb.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.euclidean.threed.FieldVector3DTest.testAngular",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),79404,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11l4a471p9o(){try{__CLR4_4_11p2k1p2klb90pcsb.R.inc(79404);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79405);Assert.assertEquals(0,           createVector(1, 0, 0, 3).getAlpha().getReal(), 1.0e-10);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79406);Assert.assertEquals(0,           createVector(1, 0, 0, 3).getDelta().getReal(), 1.0e-10);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79407);Assert.assertEquals(FastMath.PI / 2, createVector(0, 1, 0, 3).getAlpha().getReal(), 1.0e-10);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79408);Assert.assertEquals(0,           createVector(0, 1, 0, 3).getDelta().getReal(), 1.0e-10);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79409);Assert.assertEquals(FastMath.PI / 2, createVector(0, 0, 1, 3).getDelta().getReal(), 1.0e-10);
      
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79410);FieldVector3D<DerivativeStructure> u = createVector(-1, 1, -1, 3);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79411);Assert.assertEquals(3 * FastMath.PI /4, u.getAlpha().getReal(), 1.0e-10);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79412);Assert.assertEquals(-1.0 / FastMath.sqrt(3), u.getDelta().sin().getReal(), 1.0e-10);
    }finally{__CLR4_4_11p2k1p2klb90pcsb.R.flushNeeded();}}

    @Test
    public void testAngularSeparation() throws MathArithmeticException {__CLR4_4_11p2k1p2klb90pcsb.R.globalSliceStart(getClass().getName(),79413);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1b9uxib1p9x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11p2k1p2klb90pcsb.R.rethrow($CLV_t2$);}finally{__CLR4_4_11p2k1p2klb90pcsb.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.euclidean.threed.FieldVector3DTest.testAngularSeparation",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),79413,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1b9uxib1p9x() throws MathArithmeticException{try{__CLR4_4_11p2k1p2klb90pcsb.R.inc(79413);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79414);FieldVector3D<DerivativeStructure> v1 = createVector(2, -1, 4, 3);

        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79415);FieldVector3D<DerivativeStructure>  k = v1.normalize();
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79416);FieldVector3D<DerivativeStructure>  i = k.orthogonal();
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79417);FieldVector3D<DerivativeStructure> v2 = k.scalarMultiply(FastMath.cos(1.2)).add(i.scalarMultiply(FastMath.sin(1.2)));

        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79418);Assert.assertTrue(FastMath.abs(FieldVector3D.angle(v1, v2).getReal() - 1.2) < 1.0e-12);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79419);Assert.assertTrue(FastMath.abs(FieldVector3D.angle(v1, v2.toVector3D()).getReal() - 1.2) < 1.0e-12);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79420);Assert.assertTrue(FastMath.abs(FieldVector3D.angle(v1.toVector3D(), v2).getReal() - 1.2) < 1.0e-12);

        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79421);try {
            __CLR4_4_11p2k1p2klb90pcsb.R.inc(79422);FieldVector3D.angle(v1, Vector3D.ZERO);
            __CLR4_4_11p2k1p2klb90pcsb.R.inc(79423);Assert.fail("an exception should have been thrown");
        } catch (MathArithmeticException mae) {
            // expected
        }
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79424);Assert.assertEquals(0.0, FieldVector3D.angle(v1, v1.toVector3D()).getReal(), 1.0e-15);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79425);Assert.assertEquals(FastMath.PI, FieldVector3D.angle(v1, v1.negate().toVector3D()).getReal(), 1.0e-15);

    }finally{__CLR4_4_11p2k1p2klb90pcsb.R.flushNeeded();}}

    @Test
    public void testNormalize() throws MathArithmeticException {__CLR4_4_11p2k1p2klb90pcsb.R.globalSliceStart(getClass().getName(),79426);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1i0t4se1paa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11p2k1p2klb90pcsb.R.rethrow($CLV_t2$);}finally{__CLR4_4_11p2k1p2klb90pcsb.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.euclidean.threed.FieldVector3DTest.testNormalize",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),79426,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1i0t4se1paa() throws MathArithmeticException{try{__CLR4_4_11p2k1p2klb90pcsb.R.inc(79426);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79427);Assert.assertEquals(1.0, createVector(5, -4, 2, 3).normalize().getNorm().getReal(), 1.0e-12);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79428);try {
            __CLR4_4_11p2k1p2klb90pcsb.R.inc(79429);createVector(0, 0, 0, 3).normalize();
            __CLR4_4_11p2k1p2klb90pcsb.R.inc(79430);Assert.fail("an exception should have been thrown");
        } catch (MathArithmeticException ae) {
            // expected behavior
        }
    }finally{__CLR4_4_11p2k1p2klb90pcsb.R.flushNeeded();}}

    @Test
    public void testNegate() {__CLR4_4_11p2k1p2klb90pcsb.R.globalSliceStart(getClass().getName(),79431);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ffqfwl1paf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11p2k1p2klb90pcsb.R.rethrow($CLV_t2$);}finally{__CLR4_4_11p2k1p2klb90pcsb.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.euclidean.threed.FieldVector3DTest.testNegate",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),79431,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ffqfwl1paf(){try{__CLR4_4_11p2k1p2klb90pcsb.R.inc(79431);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79432);checkVector(createVector(0.1, 2.5, 1.3, 3).negate(),
                    -0.1, -2.5, -1.3, -1, 0, 0, 0, -1, 0, 0, 0, -1);
    }finally{__CLR4_4_11p2k1p2klb90pcsb.R.flushNeeded();}}

    @Test
    public void testOrthogonal() throws MathArithmeticException {__CLR4_4_11p2k1p2klb90pcsb.R.globalSliceStart(getClass().getName(),79433);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1olwq5q1pah();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11p2k1p2klb90pcsb.R.rethrow($CLV_t2$);}finally{__CLR4_4_11p2k1p2klb90pcsb.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.euclidean.threed.FieldVector3DTest.testOrthogonal",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),79433,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1olwq5q1pah() throws MathArithmeticException{try{__CLR4_4_11p2k1p2klb90pcsb.R.inc(79433);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79434);FieldVector3D<DerivativeStructure> v1 = createVector(0.1, 2.5, 1.3, 3);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79435);Assert.assertEquals(0.0, FieldVector3D.dotProduct(v1, v1.orthogonal()).getReal(), 1.0e-12);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79436);FieldVector3D<DerivativeStructure> v2 = createVector(2.3, -0.003, 7.6, 3);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79437);Assert.assertEquals(0.0, FieldVector3D.dotProduct(v2, v2.orthogonal()).getReal(), 1.0e-12);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79438);FieldVector3D<DerivativeStructure> v3 = createVector(-1.7, 1.4, 0.2, 3);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79439);Assert.assertEquals(0.0, FieldVector3D.dotProduct(v3, v3.orthogonal()).getReal(), 1.0e-12);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79440);FieldVector3D<DerivativeStructure> v4 = createVector(4.2, 0.1, -1.8, 3);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79441);Assert.assertEquals(0.0, FieldVector3D.dotProduct(v4, v4.orthogonal()).getReal(), 1.0e-12);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79442);try {
            __CLR4_4_11p2k1p2klb90pcsb.R.inc(79443);createVector(0, 0, 0, 3).orthogonal();
            __CLR4_4_11p2k1p2klb90pcsb.R.inc(79444);Assert.fail("an exception should have been thrown");
        } catch (MathArithmeticException ae) {
            // expected behavior
        }
    }finally{__CLR4_4_11p2k1p2klb90pcsb.R.flushNeeded();}}

    @Test
    public void testAngle() throws MathArithmeticException {__CLR4_4_11p2k1p2klb90pcsb.R.globalSliceStart(getClass().getName(),79445);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18umwlk1pat();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11p2k1p2klb90pcsb.R.rethrow($CLV_t2$);}finally{__CLR4_4_11p2k1p2klb90pcsb.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.euclidean.threed.FieldVector3DTest.testAngle",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),79445,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18umwlk1pat() throws MathArithmeticException{try{__CLR4_4_11p2k1p2klb90pcsb.R.inc(79445);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79446);Assert.assertEquals(0.22572612855273393616,
                            FieldVector3D.angle(createVector(1, 2, 3, 3), createVector(4, 5, 6, 3)).getReal(),
                            1.0e-12);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79447);Assert.assertEquals(7.98595620686106654517199e-8,
                            FieldVector3D.angle(createVector(1, 2, 3, 3), createVector(2, 4, 6.000001, 3)).getReal(),
                            1.0e-12);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79448);Assert.assertEquals(3.14159257373023116985197793156,
                            FieldVector3D.angle(createVector(1, 2, 3, 3), createVector(-2, -4, -6.000001, 3)).getReal(),
                            1.0e-12);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79449);try {
            __CLR4_4_11p2k1p2klb90pcsb.R.inc(79450);FieldVector3D.angle(createVector(0, 0, 0, 3), createVector(1, 0, 0, 3));
            __CLR4_4_11p2k1p2klb90pcsb.R.inc(79451);Assert.fail("an exception should have been thrown");
        } catch (MathArithmeticException ae) {
            // expected behavior
        }
    }finally{__CLR4_4_11p2k1p2klb90pcsb.R.flushNeeded();}}

    @Test
    public void testAccurateDotProduct() {__CLR4_4_11p2k1p2klb90pcsb.R.globalSliceStart(getClass().getName(),79452);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kwjjoz1pb0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11p2k1p2klb90pcsb.R.rethrow($CLV_t2$);}finally{__CLR4_4_11p2k1p2klb90pcsb.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.euclidean.threed.FieldVector3DTest.testAccurateDotProduct",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),79452,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kwjjoz1pb0(){try{__CLR4_4_11p2k1p2klb90pcsb.R.inc(79452);
        // the following two vectors are nearly but not exactly orthogonal
        // naive dot product (i.e. computing u1.x * u2.x + u1.y * u2.y + u1.z * u2.z
        // leads to a result of 0.0, instead of the correct -1.855129...
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79453);FieldVector3D<DerivativeStructure> u1 = createVector(-1321008684645961.0 /  268435456.0,
                                   -5774608829631843.0 /  268435456.0,
                                   -7645843051051357.0 / 8589934592.0, 3);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79454);FieldVector3D<DerivativeStructure> u2 = createVector(-5712344449280879.0 /    2097152.0,
                                   -4550117129121957.0 /    2097152.0,
                                    8846951984510141.0 /     131072.0, 3);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79455);DerivativeStructure sNaive = u1.getX().multiply(u2.getX()).add(u1.getY().multiply(u2.getY())).add(u1.getZ().multiply(u2.getZ()));
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79456);DerivativeStructure sAccurate = FieldVector3D.dotProduct(u1, u2);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79457);Assert.assertEquals(0.0, sNaive.getReal(), 1.0e-30);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79458);Assert.assertEquals(-2088690039198397.0 / 1125899906842624.0, sAccurate.getReal(), 1.0e-16);
    }finally{__CLR4_4_11p2k1p2klb90pcsb.R.flushNeeded();}}

    @Test
    public void testDotProduct() {__CLR4_4_11p2k1p2klb90pcsb.R.globalSliceStart(getClass().getName(),79459);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_151tsyn1pb7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11p2k1p2klb90pcsb.R.rethrow($CLV_t2$);}finally{__CLR4_4_11p2k1p2klb90pcsb.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.euclidean.threed.FieldVector3DTest.testDotProduct",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),79459,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_151tsyn1pb7(){try{__CLR4_4_11p2k1p2klb90pcsb.R.inc(79459);
        // we compare accurate versus naive dot product implementations
        // on regular vectors (i.e. not extreme cases like in the previous test)
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79460);Well1024a random = new Well1024a(553267312521321234l);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79461);for (int i = 0; (((i < 10000)&&(__CLR4_4_11p2k1p2klb90pcsb.R.iget(79462)!=0|true))||(__CLR4_4_11p2k1p2klb90pcsb.R.iget(79463)==0&false)); ++i) {{
            __CLR4_4_11p2k1p2klb90pcsb.R.inc(79464);double ux = 10000 * random.nextDouble();
            __CLR4_4_11p2k1p2klb90pcsb.R.inc(79465);double uy = 10000 * random.nextDouble();
            __CLR4_4_11p2k1p2klb90pcsb.R.inc(79466);double uz = 10000 * random.nextDouble();
            __CLR4_4_11p2k1p2klb90pcsb.R.inc(79467);double vx = 10000 * random.nextDouble();
            __CLR4_4_11p2k1p2klb90pcsb.R.inc(79468);double vy = 10000 * random.nextDouble();
            __CLR4_4_11p2k1p2klb90pcsb.R.inc(79469);double vz = 10000 * random.nextDouble();
            __CLR4_4_11p2k1p2klb90pcsb.R.inc(79470);double sNaive = ux * vx + uy * vy + uz * vz;

            __CLR4_4_11p2k1p2klb90pcsb.R.inc(79471);FieldVector3D<DerivativeStructure> uds = createVector(ux, uy, uz, 3);
            __CLR4_4_11p2k1p2klb90pcsb.R.inc(79472);FieldVector3D<DerivativeStructure> vds = createVector(vx, vy, vz, 3);
            __CLR4_4_11p2k1p2klb90pcsb.R.inc(79473);Vector3D v = new Vector3D(vx, vy, vz);

            __CLR4_4_11p2k1p2klb90pcsb.R.inc(79474);DerivativeStructure sAccurate = FieldVector3D.dotProduct(uds, vds);
            __CLR4_4_11p2k1p2klb90pcsb.R.inc(79475);Assert.assertEquals(sNaive, sAccurate.getReal(), 2.5e-16 * sNaive);
            __CLR4_4_11p2k1p2klb90pcsb.R.inc(79476);Assert.assertEquals(ux + vx, sAccurate.getPartialDerivative(1, 0, 0), 2.5e-16 * sNaive);
            __CLR4_4_11p2k1p2klb90pcsb.R.inc(79477);Assert.assertEquals(uy + vy, sAccurate.getPartialDerivative(0, 1, 0), 2.5e-16 * sNaive);
            __CLR4_4_11p2k1p2klb90pcsb.R.inc(79478);Assert.assertEquals(uz + vz, sAccurate.getPartialDerivative(0, 0, 1), 2.5e-16 * sNaive);

            __CLR4_4_11p2k1p2klb90pcsb.R.inc(79479);sAccurate = FieldVector3D.dotProduct(uds, v);
            __CLR4_4_11p2k1p2klb90pcsb.R.inc(79480);Assert.assertEquals(sNaive, sAccurate.getReal(), 2.5e-16 * sNaive);
            __CLR4_4_11p2k1p2klb90pcsb.R.inc(79481);Assert.assertEquals(vx, sAccurate.getPartialDerivative(1, 0, 0), 2.5e-16 * sNaive);
            __CLR4_4_11p2k1p2klb90pcsb.R.inc(79482);Assert.assertEquals(vy, sAccurate.getPartialDerivative(0, 1, 0), 2.5e-16 * sNaive);
            __CLR4_4_11p2k1p2klb90pcsb.R.inc(79483);Assert.assertEquals(vz, sAccurate.getPartialDerivative(0, 0, 1), 2.5e-16 * sNaive);

        }
    }}finally{__CLR4_4_11p2k1p2klb90pcsb.R.flushNeeded();}}

    @Test
    public void testAccurateCrossProduct() {__CLR4_4_11p2k1p2klb90pcsb.R.globalSliceStart(getClass().getName(),79484);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yuetqc1pbw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11p2k1p2klb90pcsb.R.rethrow($CLV_t2$);}finally{__CLR4_4_11p2k1p2klb90pcsb.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.euclidean.threed.FieldVector3DTest.testAccurateCrossProduct",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),79484,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yuetqc1pbw(){try{__CLR4_4_11p2k1p2klb90pcsb.R.inc(79484);
        // the vectors u1 and u2 are nearly but not exactly anti-parallel
        // (7.31e-16 degrees from 180 degrees) naive cross product (i.e.
        // computing u1.x * u2.x + u1.y * u2.y + u1.z * u2.z
        // leads to a result of   [0.0009765, -0.0001220, -0.0039062],
        // instead of the correct [0.0006913, -0.0001254, -0.0007909]
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79485);final FieldVector3D<DerivativeStructure> u1 = createVector(-1321008684645961.0 /   268435456.0,
                                         -5774608829631843.0 /   268435456.0,
                                         -7645843051051357.0 /  8589934592.0, 3);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79486);final FieldVector3D<DerivativeStructure> u2 = createVector( 1796571811118507.0 /  2147483648.0,
                                          7853468008299307.0 /  2147483648.0,
                                          2599586637357461.0 / 17179869184.0, 3);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79487);final FieldVector3D<DerivativeStructure> u3 = createVector(12753243807587107.0 / 18446744073709551616.0, 
                                         -2313766922703915.0 / 18446744073709551616.0, 
                                          -227970081415313.0 /   288230376151711744.0, 3);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79488);FieldVector3D<DerivativeStructure> cNaive = new FieldVector3D<DerivativeStructure>(u1.getY().multiply(u2.getZ()).subtract(u1.getZ().multiply(u2.getY())),
                                       u1.getZ().multiply(u2.getX()).subtract(u1.getX().multiply(u2.getZ())),
                                       u1.getX().multiply(u2.getY()).subtract(u1.getY().multiply(u2.getX())));
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79489);FieldVector3D<DerivativeStructure> cAccurate = FieldVector3D.crossProduct(u1, u2);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79490);Assert.assertTrue(FieldVector3D.distance(u3, cNaive).getReal() > 2.9 * u3.getNorm().getReal());
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79491);Assert.assertEquals(0.0, FieldVector3D.distance(u3, cAccurate).getReal(), 1.0e-30 * cAccurate.getNorm().getReal());
    }finally{__CLR4_4_11p2k1p2klb90pcsb.R.flushNeeded();}}

    @Test
    public void testCrossProduct() {__CLR4_4_11p2k1p2klb90pcsb.R.globalSliceStart(getClass().getName(),79492);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11vme081pc4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11p2k1p2klb90pcsb.R.rethrow($CLV_t2$);}finally{__CLR4_4_11p2k1p2klb90pcsb.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.euclidean.threed.FieldVector3DTest.testCrossProduct",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),79492,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11vme081pc4(){try{__CLR4_4_11p2k1p2klb90pcsb.R.inc(79492);
        // we compare accurate versus naive cross product implementations
        // on regular vectors (i.e. not extreme cases like in the previous test)
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79493);Well1024a random = new Well1024a(885362227452043214l);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79494);for (int i = 0; (((i < 10000)&&(__CLR4_4_11p2k1p2klb90pcsb.R.iget(79495)!=0|true))||(__CLR4_4_11p2k1p2klb90pcsb.R.iget(79496)==0&false)); ++i) {{
            __CLR4_4_11p2k1p2klb90pcsb.R.inc(79497);double ux = random.nextDouble();
            __CLR4_4_11p2k1p2klb90pcsb.R.inc(79498);double uy = random.nextDouble();
            __CLR4_4_11p2k1p2klb90pcsb.R.inc(79499);double uz = random.nextDouble();
            __CLR4_4_11p2k1p2klb90pcsb.R.inc(79500);double vx = random.nextDouble();
            __CLR4_4_11p2k1p2klb90pcsb.R.inc(79501);double vy = random.nextDouble();
            __CLR4_4_11p2k1p2klb90pcsb.R.inc(79502);double vz = random.nextDouble();
            __CLR4_4_11p2k1p2klb90pcsb.R.inc(79503);Vector3D cNaive = new Vector3D(uy * vz - uz * vy, uz * vx - ux * vz, ux * vy - uy * vx);

            __CLR4_4_11p2k1p2klb90pcsb.R.inc(79504);FieldVector3D<DerivativeStructure> uds = createVector(ux, uy, uz, 3);
            __CLR4_4_11p2k1p2klb90pcsb.R.inc(79505);FieldVector3D<DerivativeStructure> vds = createVector(vx, vy, vz, 3);
            __CLR4_4_11p2k1p2klb90pcsb.R.inc(79506);Vector3D v = new Vector3D(vx, vy, vz);

            __CLR4_4_11p2k1p2klb90pcsb.R.inc(79507);checkVector(FieldVector3D.crossProduct(uds, vds),
                        cNaive.getX(), cNaive.getY(), cNaive.getZ(),
                        0, vz - uz, uy - vy,
                        uz - vz, 0, vx - ux,
                        vy - uy, ux - vx, 0);

            __CLR4_4_11p2k1p2klb90pcsb.R.inc(79508);checkVector(FieldVector3D.crossProduct(uds, v),
                        cNaive.getX(), cNaive.getY(), cNaive.getZ(),
                          0,  vz, -vy,
                        -vz,   0,  vx,
                         vy, -vx,   0);

        }
    }}finally{__CLR4_4_11p2k1p2klb90pcsb.R.flushNeeded();}}

    private FieldVector3D<DerivativeStructure> createVector(double x, double y, double z, int params) {try{__CLR4_4_11p2k1p2klb90pcsb.R.inc(79509);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79510);return new FieldVector3D<DerivativeStructure>(new DerivativeStructure(params, 1, 0, x),
                              new DerivativeStructure(params, 1, 1, y),
                              new DerivativeStructure(params, 1, 2, z));
    }finally{__CLR4_4_11p2k1p2klb90pcsb.R.flushNeeded();}}

    private void checkVector(FieldVector3D<DerivativeStructure> v, double x, double y, double z) {try{__CLR4_4_11p2k1p2klb90pcsb.R.inc(79511);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79512);Assert.assertEquals(x, v.getX().getReal(), 1.0e-12);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79513);Assert.assertEquals(y, v.getY().getReal(), 1.0e-12);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79514);Assert.assertEquals(z, v.getZ().getReal(), 1.0e-12);
    }finally{__CLR4_4_11p2k1p2klb90pcsb.R.flushNeeded();}}

    private void checkVector(FieldVector3D<DerivativeStructure> v, double x, double y, double z,
                             double dxdx, double dxdy, double dxdz,
                             double dydx, double dydy, double dydz,
                             double dzdx, double dzdy, double dzdz) {try{__CLR4_4_11p2k1p2klb90pcsb.R.inc(79515);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79516);Assert.assertEquals(x, v.getX().getReal(), 1.0e-12);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79517);Assert.assertEquals(y, v.getY().getReal(), 1.0e-12);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79518);Assert.assertEquals(z, v.getZ().getReal(), 1.0e-12);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79519);Assert.assertEquals(dxdx, v.getX().getPartialDerivative(1, 0, 0), 1.0e-12);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79520);Assert.assertEquals(dxdy, v.getX().getPartialDerivative(0, 1, 0), 1.0e-12);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79521);Assert.assertEquals(dxdz, v.getX().getPartialDerivative(0, 0, 1), 1.0e-12);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79522);Assert.assertEquals(dydx, v.getY().getPartialDerivative(1, 0, 0), 1.0e-12);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79523);Assert.assertEquals(dydy, v.getY().getPartialDerivative(0, 1, 0), 1.0e-12);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79524);Assert.assertEquals(dydz, v.getY().getPartialDerivative(0, 0, 1), 1.0e-12);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79525);Assert.assertEquals(dzdx, v.getZ().getPartialDerivative(1, 0, 0), 1.0e-12);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79526);Assert.assertEquals(dzdy, v.getZ().getPartialDerivative(0, 1, 0), 1.0e-12);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79527);Assert.assertEquals(dzdz, v.getZ().getPartialDerivative(0, 0, 1), 1.0e-12);
    }finally{__CLR4_4_11p2k1p2klb90pcsb.R.flushNeeded();}}

    private void checkVector(FieldVector3D<DerivativeStructure> v, double x, double y, double z,
                             double dxdx, double dxdy, double dxdz, double dxdt,
                             double dydx, double dydy, double dydz, double dydt,
                             double dzdx, double dzdy, double dzdz, double dzdt) {try{__CLR4_4_11p2k1p2klb90pcsb.R.inc(79528);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79529);Assert.assertEquals(x, v.getX().getReal(), 1.0e-12);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79530);Assert.assertEquals(y, v.getY().getReal(), 1.0e-12);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79531);Assert.assertEquals(z, v.getZ().getReal(), 1.0e-12);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79532);Assert.assertEquals(dxdx, v.getX().getPartialDerivative(1, 0, 0, 0), 1.0e-12);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79533);Assert.assertEquals(dxdy, v.getX().getPartialDerivative(0, 1, 0, 0), 1.0e-12);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79534);Assert.assertEquals(dxdz, v.getX().getPartialDerivative(0, 0, 1, 0), 1.0e-12);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79535);Assert.assertEquals(dxdt, v.getX().getPartialDerivative(0, 0, 0, 1), 1.0e-12);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79536);Assert.assertEquals(dydx, v.getY().getPartialDerivative(1, 0, 0, 0), 1.0e-12);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79537);Assert.assertEquals(dydy, v.getY().getPartialDerivative(0, 1, 0, 0), 1.0e-12);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79538);Assert.assertEquals(dydz, v.getY().getPartialDerivative(0, 0, 1, 0), 1.0e-12);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79539);Assert.assertEquals(dydt, v.getY().getPartialDerivative(0, 0, 0, 1), 1.0e-12);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79540);Assert.assertEquals(dzdx, v.getZ().getPartialDerivative(1, 0, 0, 0), 1.0e-12);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79541);Assert.assertEquals(dzdy, v.getZ().getPartialDerivative(0, 1, 0, 0), 1.0e-12);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79542);Assert.assertEquals(dzdz, v.getZ().getPartialDerivative(0, 0, 1, 0), 1.0e-12);
        __CLR4_4_11p2k1p2klb90pcsb.R.inc(79543);Assert.assertEquals(dzdt, v.getZ().getPartialDerivative(0, 0, 0, 1), 1.0e-12);
    }finally{__CLR4_4_11p2k1p2klb90pcsb.R.flushNeeded();}}

}
