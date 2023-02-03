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

import org.apache.commons.math3.exception.MathArithmeticException;
import org.apache.commons.math3.exception.MathIllegalArgumentException;
import org.apache.commons.math3.geometry.euclidean.threed.Line;
import org.apache.commons.math3.geometry.euclidean.threed.Vector3D;
import org.apache.commons.math3.util.FastMath;
import org.junit.Assert;
import org.junit.Test;

public class LineTest {static class __CLR4_4_11pdo1pdolb90pcso{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,79602,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testContains() throws MathIllegalArgumentException, MathArithmeticException {__CLR4_4_11pdo1pdolb90pcso.R.globalSliceStart(getClass().getName(),79548);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1y9zhfs1pdo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11pdo1pdolb90pcso.R.rethrow($CLV_t2$);}finally{__CLR4_4_11pdo1pdolb90pcso.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.euclidean.threed.LineTest.testContains",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),79548,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1y9zhfs1pdo() throws MathIllegalArgumentException, MathArithmeticException{try{__CLR4_4_11pdo1pdolb90pcso.R.inc(79548);
        __CLR4_4_11pdo1pdolb90pcso.R.inc(79549);Vector3D p1 = new Vector3D(0, 0, 1);
        __CLR4_4_11pdo1pdolb90pcso.R.inc(79550);Line l = new Line(p1, new Vector3D(0, 0, 2));
        __CLR4_4_11pdo1pdolb90pcso.R.inc(79551);Assert.assertTrue(l.contains(p1));
        __CLR4_4_11pdo1pdolb90pcso.R.inc(79552);Assert.assertTrue(l.contains(new Vector3D(1.0, p1, 0.3, l.getDirection())));
        __CLR4_4_11pdo1pdolb90pcso.R.inc(79553);Vector3D u = l.getDirection().orthogonal();
        __CLR4_4_11pdo1pdolb90pcso.R.inc(79554);Vector3D v = Vector3D.crossProduct(l.getDirection(), u);
        __CLR4_4_11pdo1pdolb90pcso.R.inc(79555);for (double alpha = 0; (((alpha < 2 * FastMath.PI)&&(__CLR4_4_11pdo1pdolb90pcso.R.iget(79556)!=0|true))||(__CLR4_4_11pdo1pdolb90pcso.R.iget(79557)==0&false)); alpha += 0.3) {{
            __CLR4_4_11pdo1pdolb90pcso.R.inc(79558);Assert.assertTrue(! l.contains(p1.add(new Vector3D(FastMath.cos(alpha), u,
                                                               FastMath.sin(alpha), v))));
        }
    }}finally{__CLR4_4_11pdo1pdolb90pcso.R.flushNeeded();}}

    @Test
    public void testSimilar() throws MathIllegalArgumentException, MathArithmeticException {__CLR4_4_11pdo1pdolb90pcso.R.globalSliceStart(getClass().getName(),79559);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dyiqjk1pdz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11pdo1pdolb90pcso.R.rethrow($CLV_t2$);}finally{__CLR4_4_11pdo1pdolb90pcso.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.euclidean.threed.LineTest.testSimilar",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),79559,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dyiqjk1pdz() throws MathIllegalArgumentException, MathArithmeticException{try{__CLR4_4_11pdo1pdolb90pcso.R.inc(79559);
        __CLR4_4_11pdo1pdolb90pcso.R.inc(79560);Vector3D p1  = new Vector3D (1.2, 3.4, -5.8);
        __CLR4_4_11pdo1pdolb90pcso.R.inc(79561);Vector3D p2  = new Vector3D (3.4, -5.8, 1.2);
        __CLR4_4_11pdo1pdolb90pcso.R.inc(79562);Line     lA  = new Line(p1, p2);
        __CLR4_4_11pdo1pdolb90pcso.R.inc(79563);Line     lB  = new Line(p2, p1);
        __CLR4_4_11pdo1pdolb90pcso.R.inc(79564);Assert.assertTrue(lA.isSimilarTo(lB));
        __CLR4_4_11pdo1pdolb90pcso.R.inc(79565);Assert.assertTrue(! lA.isSimilarTo(new Line(p1, p1.add(lA.getDirection().orthogonal()))));
    }finally{__CLR4_4_11pdo1pdolb90pcso.R.flushNeeded();}}

    @Test
    public void testPointDistance() throws MathIllegalArgumentException {__CLR4_4_11pdo1pdolb90pcso.R.globalSliceStart(getClass().getName(),79566);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19bkw7u1pe6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11pdo1pdolb90pcso.R.rethrow($CLV_t2$);}finally{__CLR4_4_11pdo1pdolb90pcso.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.euclidean.threed.LineTest.testPointDistance",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),79566,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19bkw7u1pe6() throws MathIllegalArgumentException{try{__CLR4_4_11pdo1pdolb90pcso.R.inc(79566);
        __CLR4_4_11pdo1pdolb90pcso.R.inc(79567);Line l = new Line(new Vector3D(0, 1, 1), new Vector3D(0, 2, 2));
        __CLR4_4_11pdo1pdolb90pcso.R.inc(79568);Assert.assertEquals(FastMath.sqrt(3.0 / 2.0), l.distance(new Vector3D(1, 0, 1)), 1.0e-10);
        __CLR4_4_11pdo1pdolb90pcso.R.inc(79569);Assert.assertEquals(0, l.distance(new Vector3D(0, -4, -4)), 1.0e-10);
    }finally{__CLR4_4_11pdo1pdolb90pcso.R.flushNeeded();}}

    @Test
    public void testLineDistance() throws MathIllegalArgumentException {__CLR4_4_11pdo1pdolb90pcso.R.globalSliceStart(getClass().getName(),79570);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1r55ffi1pea();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11pdo1pdolb90pcso.R.rethrow($CLV_t2$);}finally{__CLR4_4_11pdo1pdolb90pcso.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.euclidean.threed.LineTest.testLineDistance",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),79570,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1r55ffi1pea() throws MathIllegalArgumentException{try{__CLR4_4_11pdo1pdolb90pcso.R.inc(79570);
        __CLR4_4_11pdo1pdolb90pcso.R.inc(79571);Line l = new Line(new Vector3D(0, 1, 1), new Vector3D(0, 2, 2));
        __CLR4_4_11pdo1pdolb90pcso.R.inc(79572);Assert.assertEquals(1.0,
                            l.distance(new Line(new Vector3D(1, 0, 1), new Vector3D(1, 0, 2))),
                            1.0e-10);
        __CLR4_4_11pdo1pdolb90pcso.R.inc(79573);Assert.assertEquals(0.5,
                            l.distance(new Line(new Vector3D(-0.5, 0, 0), new Vector3D(-0.5, -1, -1))),
                            1.0e-10);
        __CLR4_4_11pdo1pdolb90pcso.R.inc(79574);Assert.assertEquals(0.0,
                            l.distance(l),
                            1.0e-10);
        __CLR4_4_11pdo1pdolb90pcso.R.inc(79575);Assert.assertEquals(0.0,
                            l.distance(new Line(new Vector3D(0, -4, -4), new Vector3D(0, -5, -5))),
                            1.0e-10);
        __CLR4_4_11pdo1pdolb90pcso.R.inc(79576);Assert.assertEquals(0.0,
                            l.distance(new Line(new Vector3D(0, -4, -4), new Vector3D(0, -3, -4))),
                            1.0e-10);
        __CLR4_4_11pdo1pdolb90pcso.R.inc(79577);Assert.assertEquals(0.0,
                            l.distance(new Line(new Vector3D(0, -4, -4), new Vector3D(1, -4, -4))),
                            1.0e-10);
        __CLR4_4_11pdo1pdolb90pcso.R.inc(79578);Assert.assertEquals(FastMath.sqrt(8),
                            l.distance(new Line(new Vector3D(0, -4, 0), new Vector3D(1, -4, 0))),
                            1.0e-10);
    }finally{__CLR4_4_11pdo1pdolb90pcso.R.flushNeeded();}}

    @Test
    public void testClosest() throws MathIllegalArgumentException {__CLR4_4_11pdo1pdolb90pcso.R.globalSliceStart(getClass().getName(),79579);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1seyc6q1pej();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11pdo1pdolb90pcso.R.rethrow($CLV_t2$);}finally{__CLR4_4_11pdo1pdolb90pcso.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.euclidean.threed.LineTest.testClosest",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),79579,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1seyc6q1pej() throws MathIllegalArgumentException{try{__CLR4_4_11pdo1pdolb90pcso.R.inc(79579);
        __CLR4_4_11pdo1pdolb90pcso.R.inc(79580);Line l = new Line(new Vector3D(0, 1, 1), new Vector3D(0, 2, 2));
        __CLR4_4_11pdo1pdolb90pcso.R.inc(79581);Assert.assertEquals(0.0,
                            l.closestPoint(new Line(new Vector3D(1, 0, 1), new Vector3D(1, 0, 2))).distance(new Vector3D(0, 0, 0)),
                            1.0e-10);
        __CLR4_4_11pdo1pdolb90pcso.R.inc(79582);Assert.assertEquals(0.5,
                            l.closestPoint(new Line(new Vector3D(-0.5, 0, 0), new Vector3D(-0.5, -1, -1))).distance(new Vector3D(-0.5, 0, 0)),
                            1.0e-10);
        __CLR4_4_11pdo1pdolb90pcso.R.inc(79583);Assert.assertEquals(0.0,
                            l.closestPoint(l).distance(new Vector3D(0, 0, 0)),
                            1.0e-10);
        __CLR4_4_11pdo1pdolb90pcso.R.inc(79584);Assert.assertEquals(0.0,
                            l.closestPoint(new Line(new Vector3D(0, -4, -4), new Vector3D(0, -5, -5))).distance(new Vector3D(0, 0, 0)),
                            1.0e-10);
        __CLR4_4_11pdo1pdolb90pcso.R.inc(79585);Assert.assertEquals(0.0,
                            l.closestPoint(new Line(new Vector3D(0, -4, -4), new Vector3D(0, -3, -4))).distance(new Vector3D(0, -4, -4)),
                            1.0e-10);
        __CLR4_4_11pdo1pdolb90pcso.R.inc(79586);Assert.assertEquals(0.0,
                            l.closestPoint(new Line(new Vector3D(0, -4, -4), new Vector3D(1, -4, -4))).distance(new Vector3D(0, -4, -4)),
                            1.0e-10);
        __CLR4_4_11pdo1pdolb90pcso.R.inc(79587);Assert.assertEquals(0.0,
                            l.closestPoint(new Line(new Vector3D(0, -4, 0), new Vector3D(1, -4, 0))).distance(new Vector3D(0, -2, -2)),
                            1.0e-10);
    }finally{__CLR4_4_11pdo1pdolb90pcso.R.flushNeeded();}}

    @Test
    public void testIntersection() throws MathIllegalArgumentException {__CLR4_4_11pdo1pdolb90pcso.R.globalSliceStart(getClass().getName(),79588);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16g463i1pes();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11pdo1pdolb90pcso.R.rethrow($CLV_t2$);}finally{__CLR4_4_11pdo1pdolb90pcso.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.euclidean.threed.LineTest.testIntersection",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),79588,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16g463i1pes() throws MathIllegalArgumentException{try{__CLR4_4_11pdo1pdolb90pcso.R.inc(79588);
        __CLR4_4_11pdo1pdolb90pcso.R.inc(79589);Line l = new Line(new Vector3D(0, 1, 1), new Vector3D(0, 2, 2));
        __CLR4_4_11pdo1pdolb90pcso.R.inc(79590);Assert.assertNull(l.intersection(new Line(new Vector3D(1, 0, 1), new Vector3D(1, 0, 2))));
        __CLR4_4_11pdo1pdolb90pcso.R.inc(79591);Assert.assertNull(l.intersection(new Line(new Vector3D(-0.5, 0, 0), new Vector3D(-0.5, -1, -1))));
        __CLR4_4_11pdo1pdolb90pcso.R.inc(79592);Assert.assertEquals(0.0,
                            l.intersection(l).distance(new Vector3D(0, 0, 0)),
                            1.0e-10);
        __CLR4_4_11pdo1pdolb90pcso.R.inc(79593);Assert.assertEquals(0.0,
                            l.intersection(new Line(new Vector3D(0, -4, -4), new Vector3D(0, -5, -5))).distance(new Vector3D(0, 0, 0)),
                            1.0e-10);
        __CLR4_4_11pdo1pdolb90pcso.R.inc(79594);Assert.assertEquals(0.0,
                            l.intersection(new Line(new Vector3D(0, -4, -4), new Vector3D(0, -3, -4))).distance(new Vector3D(0, -4, -4)),
                            1.0e-10);
        __CLR4_4_11pdo1pdolb90pcso.R.inc(79595);Assert.assertEquals(0.0,
                            l.intersection(new Line(new Vector3D(0, -4, -4), new Vector3D(1, -4, -4))).distance(new Vector3D(0, -4, -4)),
                            1.0e-10);
        __CLR4_4_11pdo1pdolb90pcso.R.inc(79596);Assert.assertNull(l.intersection(new Line(new Vector3D(0, -4, 0), new Vector3D(1, -4, 0))));
    }finally{__CLR4_4_11pdo1pdolb90pcso.R.flushNeeded();}}

    @Test
    public void testRevert() {__CLR4_4_11pdo1pdolb90pcso.R.globalSliceStart(getClass().getName(),79597);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19f9xul1pf1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11pdo1pdolb90pcso.R.rethrow($CLV_t2$);}finally{__CLR4_4_11pdo1pdolb90pcso.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.euclidean.threed.LineTest.testRevert",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),79597,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19f9xul1pf1(){try{__CLR4_4_11pdo1pdolb90pcso.R.inc(79597);
        
        // setup
        __CLR4_4_11pdo1pdolb90pcso.R.inc(79598);Line line = new Line(new Vector3D(1653345.6696423641, 6170370.041579291, 90000),
                             new Vector3D(1650757.5050732433, 6160710.879908984, 0.9));
        __CLR4_4_11pdo1pdolb90pcso.R.inc(79599);Vector3D expected = line.getDirection().negate();

        // action
        __CLR4_4_11pdo1pdolb90pcso.R.inc(79600);Line reverted = line.revert();

        // verify
        __CLR4_4_11pdo1pdolb90pcso.R.inc(79601);Assert.assertArrayEquals(expected.toArray(), reverted.getDirection().toArray(), 0);

    }finally{__CLR4_4_11pdo1pdolb90pcso.R.flushNeeded();}}

}
