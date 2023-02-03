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
import org.apache.commons.math3.geometry.euclidean.threed.Plane;
import org.apache.commons.math3.geometry.euclidean.threed.Rotation;
import org.apache.commons.math3.geometry.euclidean.threed.Vector3D;
import org.junit.Assert;
import org.junit.Test;

public class PlaneTest {static class __CLR4_4_11pf61pf6lb90pct1{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,79696,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testContains() throws MathArithmeticException {__CLR4_4_11pf61pf6lb90pct1.R.globalSliceStart(getClass().getName(),79602);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1y9zhfs1pf6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11pf61pf6lb90pct1.R.rethrow($CLV_t2$);}finally{__CLR4_4_11pf61pf6lb90pct1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.euclidean.threed.PlaneTest.testContains",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),79602,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1y9zhfs1pf6() throws MathArithmeticException{try{__CLR4_4_11pf61pf6lb90pct1.R.inc(79602);
        __CLR4_4_11pf61pf6lb90pct1.R.inc(79603);Plane p = new Plane(new Vector3D(0, 0, 1), new Vector3D(0, 0, 1));
        __CLR4_4_11pf61pf6lb90pct1.R.inc(79604);Assert.assertTrue(p.contains(new Vector3D(0, 0, 1)));
        __CLR4_4_11pf61pf6lb90pct1.R.inc(79605);Assert.assertTrue(p.contains(new Vector3D(17, -32, 1)));
        __CLR4_4_11pf61pf6lb90pct1.R.inc(79606);Assert.assertTrue(! p.contains(new Vector3D(17, -32, 1.001)));
    }finally{__CLR4_4_11pf61pf6lb90pct1.R.flushNeeded();}}

    @Test
    public void testOffset() throws MathArithmeticException {__CLR4_4_11pf61pf6lb90pct1.R.globalSliceStart(getClass().getName(),79607);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1owkm0c1pfb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11pf61pf6lb90pct1.R.rethrow($CLV_t2$);}finally{__CLR4_4_11pf61pf6lb90pct1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.euclidean.threed.PlaneTest.testOffset",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),79607,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1owkm0c1pfb() throws MathArithmeticException{try{__CLR4_4_11pf61pf6lb90pct1.R.inc(79607);
        __CLR4_4_11pf61pf6lb90pct1.R.inc(79608);Vector3D p1 = new Vector3D(1, 1, 1);
        __CLR4_4_11pf61pf6lb90pct1.R.inc(79609);Plane p = new Plane(p1, new Vector3D(0.2, 0, 0));
        __CLR4_4_11pf61pf6lb90pct1.R.inc(79610);Assert.assertEquals(-5.0, p.getOffset(new Vector3D(-4, 0, 0)), 1.0e-10);
        __CLR4_4_11pf61pf6lb90pct1.R.inc(79611);Assert.assertEquals(+5.0, p.getOffset(new Vector3D(6, 10, -12)), 1.0e-10);
        __CLR4_4_11pf61pf6lb90pct1.R.inc(79612);Assert.assertEquals(0.3,
                            p.getOffset(new Vector3D(1.0, p1, 0.3, p.getNormal())),
                            1.0e-10);
        __CLR4_4_11pf61pf6lb90pct1.R.inc(79613);Assert.assertEquals(-0.3,
                            p.getOffset(new Vector3D(1.0, p1, -0.3, p.getNormal())),
                            1.0e-10);
    }finally{__CLR4_4_11pf61pf6lb90pct1.R.flushNeeded();}}

    @Test
    public void testPoint() throws MathArithmeticException {__CLR4_4_11pf61pf6lb90pct1.R.globalSliceStart(getClass().getName(),79614);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1txxg2t1pfi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11pf61pf6lb90pct1.R.rethrow($CLV_t2$);}finally{__CLR4_4_11pf61pf6lb90pct1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.euclidean.threed.PlaneTest.testPoint",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),79614,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1txxg2t1pfi() throws MathArithmeticException{try{__CLR4_4_11pf61pf6lb90pct1.R.inc(79614);
        __CLR4_4_11pf61pf6lb90pct1.R.inc(79615);Plane p = new Plane(new Vector3D(2, -3, 1), new Vector3D(1, 4, 9));
        __CLR4_4_11pf61pf6lb90pct1.R.inc(79616);Assert.assertTrue(p.contains(p.getOrigin()));
    }finally{__CLR4_4_11pf61pf6lb90pct1.R.flushNeeded();}}

    @Test
    public void testThreePoints() throws MathArithmeticException {__CLR4_4_11pf61pf6lb90pct1.R.globalSliceStart(getClass().getName(),79617);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n6uro61pfl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11pf61pf6lb90pct1.R.rethrow($CLV_t2$);}finally{__CLR4_4_11pf61pf6lb90pct1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.euclidean.threed.PlaneTest.testThreePoints",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),79617,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n6uro61pfl() throws MathArithmeticException{try{__CLR4_4_11pf61pf6lb90pct1.R.inc(79617);
        __CLR4_4_11pf61pf6lb90pct1.R.inc(79618);Vector3D p1 = new Vector3D(1.2, 3.4, -5.8);
        __CLR4_4_11pf61pf6lb90pct1.R.inc(79619);Vector3D p2 = new Vector3D(3.4, -5.8, 1.2);
        __CLR4_4_11pf61pf6lb90pct1.R.inc(79620);Vector3D p3 = new Vector3D(-2.0, 4.3, 0.7);
        __CLR4_4_11pf61pf6lb90pct1.R.inc(79621);Plane    p  = new Plane(p1, p2, p3);
        __CLR4_4_11pf61pf6lb90pct1.R.inc(79622);Assert.assertTrue(p.contains(p1));
        __CLR4_4_11pf61pf6lb90pct1.R.inc(79623);Assert.assertTrue(p.contains(p2));
        __CLR4_4_11pf61pf6lb90pct1.R.inc(79624);Assert.assertTrue(p.contains(p3));
    }finally{__CLR4_4_11pf61pf6lb90pct1.R.flushNeeded();}}

    @Test
    public void testRotate() throws MathArithmeticException, MathIllegalArgumentException {__CLR4_4_11pf61pf6lb90pct1.R.globalSliceStart(getClass().getName(),79625);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1viwfg41pft();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11pf61pf6lb90pct1.R.rethrow($CLV_t2$);}finally{__CLR4_4_11pf61pf6lb90pct1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.euclidean.threed.PlaneTest.testRotate",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),79625,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1viwfg41pft() throws MathArithmeticException, MathIllegalArgumentException{try{__CLR4_4_11pf61pf6lb90pct1.R.inc(79625);
        __CLR4_4_11pf61pf6lb90pct1.R.inc(79626);Vector3D p1 = new Vector3D(1.2, 3.4, -5.8);
        __CLR4_4_11pf61pf6lb90pct1.R.inc(79627);Vector3D p2 = new Vector3D(3.4, -5.8, 1.2);
        __CLR4_4_11pf61pf6lb90pct1.R.inc(79628);Vector3D p3 = new Vector3D(-2.0, 4.3, 0.7);
        __CLR4_4_11pf61pf6lb90pct1.R.inc(79629);Plane    p  = new Plane(p1, p2, p3);
        __CLR4_4_11pf61pf6lb90pct1.R.inc(79630);Vector3D oldNormal = p.getNormal();

        __CLR4_4_11pf61pf6lb90pct1.R.inc(79631);p = p.rotate(p2, new Rotation(p2.subtract(p1), 1.7));
        __CLR4_4_11pf61pf6lb90pct1.R.inc(79632);Assert.assertTrue(p.contains(p1));
        __CLR4_4_11pf61pf6lb90pct1.R.inc(79633);Assert.assertTrue(p.contains(p2));
        __CLR4_4_11pf61pf6lb90pct1.R.inc(79634);Assert.assertTrue(! p.contains(p3));

        __CLR4_4_11pf61pf6lb90pct1.R.inc(79635);p = p.rotate(p2, new Rotation(oldNormal, 0.1));
        __CLR4_4_11pf61pf6lb90pct1.R.inc(79636);Assert.assertTrue(! p.contains(p1));
        __CLR4_4_11pf61pf6lb90pct1.R.inc(79637);Assert.assertTrue(p.contains(p2));
        __CLR4_4_11pf61pf6lb90pct1.R.inc(79638);Assert.assertTrue(! p.contains(p3));

        __CLR4_4_11pf61pf6lb90pct1.R.inc(79639);p = p.rotate(p1, new Rotation(oldNormal, 0.1));
        __CLR4_4_11pf61pf6lb90pct1.R.inc(79640);Assert.assertTrue(! p.contains(p1));
        __CLR4_4_11pf61pf6lb90pct1.R.inc(79641);Assert.assertTrue(! p.contains(p2));
        __CLR4_4_11pf61pf6lb90pct1.R.inc(79642);Assert.assertTrue(! p.contains(p3));

    }finally{__CLR4_4_11pf61pf6lb90pct1.R.flushNeeded();}}

    @Test
    public void testTranslate() throws MathArithmeticException {__CLR4_4_11pf61pf6lb90pct1.R.globalSliceStart(getClass().getName(),79643);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nd83fh1pgb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11pf61pf6lb90pct1.R.rethrow($CLV_t2$);}finally{__CLR4_4_11pf61pf6lb90pct1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.euclidean.threed.PlaneTest.testTranslate",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),79643,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nd83fh1pgb() throws MathArithmeticException{try{__CLR4_4_11pf61pf6lb90pct1.R.inc(79643);
        __CLR4_4_11pf61pf6lb90pct1.R.inc(79644);Vector3D p1 = new Vector3D(1.2, 3.4, -5.8);
        __CLR4_4_11pf61pf6lb90pct1.R.inc(79645);Vector3D p2 = new Vector3D(3.4, -5.8, 1.2);
        __CLR4_4_11pf61pf6lb90pct1.R.inc(79646);Vector3D p3 = new Vector3D(-2.0, 4.3, 0.7);
        __CLR4_4_11pf61pf6lb90pct1.R.inc(79647);Plane    p  = new Plane(p1, p2, p3);

        __CLR4_4_11pf61pf6lb90pct1.R.inc(79648);p = p.translate(new Vector3D(2.0, p.getU(), -1.5, p.getV()));
        __CLR4_4_11pf61pf6lb90pct1.R.inc(79649);Assert.assertTrue(p.contains(p1));
        __CLR4_4_11pf61pf6lb90pct1.R.inc(79650);Assert.assertTrue(p.contains(p2));
        __CLR4_4_11pf61pf6lb90pct1.R.inc(79651);Assert.assertTrue(p.contains(p3));

        __CLR4_4_11pf61pf6lb90pct1.R.inc(79652);p = p.translate(new Vector3D(-1.2, p.getNormal()));
        __CLR4_4_11pf61pf6lb90pct1.R.inc(79653);Assert.assertTrue(! p.contains(p1));
        __CLR4_4_11pf61pf6lb90pct1.R.inc(79654);Assert.assertTrue(! p.contains(p2));
        __CLR4_4_11pf61pf6lb90pct1.R.inc(79655);Assert.assertTrue(! p.contains(p3));

        __CLR4_4_11pf61pf6lb90pct1.R.inc(79656);p = p.translate(new Vector3D(+1.2, p.getNormal()));
        __CLR4_4_11pf61pf6lb90pct1.R.inc(79657);Assert.assertTrue(p.contains(p1));
        __CLR4_4_11pf61pf6lb90pct1.R.inc(79658);Assert.assertTrue(p.contains(p2));
        __CLR4_4_11pf61pf6lb90pct1.R.inc(79659);Assert.assertTrue(p.contains(p3));

    }finally{__CLR4_4_11pf61pf6lb90pct1.R.flushNeeded();}}

    @Test
    public void testIntersection() throws MathArithmeticException, MathIllegalArgumentException {__CLR4_4_11pf61pf6lb90pct1.R.globalSliceStart(getClass().getName(),79660);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16g463i1pgs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11pf61pf6lb90pct1.R.rethrow($CLV_t2$);}finally{__CLR4_4_11pf61pf6lb90pct1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.euclidean.threed.PlaneTest.testIntersection",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),79660,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16g463i1pgs() throws MathArithmeticException, MathIllegalArgumentException{try{__CLR4_4_11pf61pf6lb90pct1.R.inc(79660);
        __CLR4_4_11pf61pf6lb90pct1.R.inc(79661);Plane p = new Plane(new Vector3D(1, 2, 3), new Vector3D(-4, 1, -5));
        __CLR4_4_11pf61pf6lb90pct1.R.inc(79662);Line  l = new Line(new Vector3D(0.2, -3.5, 0.7), new Vector3D(1.2, -2.5, -0.3));
        __CLR4_4_11pf61pf6lb90pct1.R.inc(79663);Vector3D point = p.intersection(l);
        __CLR4_4_11pf61pf6lb90pct1.R.inc(79664);Assert.assertTrue(p.contains(point));
        __CLR4_4_11pf61pf6lb90pct1.R.inc(79665);Assert.assertTrue(l.contains(point));
        __CLR4_4_11pf61pf6lb90pct1.R.inc(79666);Assert.assertNull(p.intersection(new Line(new Vector3D(10, 10, 10),
                                                  new Vector3D(10, 10, 10).add(p.getNormal().orthogonal()))));
    }finally{__CLR4_4_11pf61pf6lb90pct1.R.flushNeeded();}}

    @Test
    public void testIntersection2() throws MathArithmeticException {__CLR4_4_11pf61pf6lb90pct1.R.globalSliceStart(getClass().getName(),79667);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f0wwg21pgz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11pf61pf6lb90pct1.R.rethrow($CLV_t2$);}finally{__CLR4_4_11pf61pf6lb90pct1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.euclidean.threed.PlaneTest.testIntersection2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),79667,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f0wwg21pgz() throws MathArithmeticException{try{__CLR4_4_11pf61pf6lb90pct1.R.inc(79667);
        __CLR4_4_11pf61pf6lb90pct1.R.inc(79668);Vector3D p1  = new Vector3D (1.2, 3.4, -5.8);
        __CLR4_4_11pf61pf6lb90pct1.R.inc(79669);Vector3D p2  = new Vector3D (3.4, -5.8, 1.2);
        __CLR4_4_11pf61pf6lb90pct1.R.inc(79670);Plane    pA  = new Plane(p1, p2, new Vector3D (-2.0, 4.3, 0.7));
        __CLR4_4_11pf61pf6lb90pct1.R.inc(79671);Plane    pB  = new Plane(p1, new Vector3D (11.4, -3.8, 5.1), p2);
        __CLR4_4_11pf61pf6lb90pct1.R.inc(79672);Line     l   = pA.intersection(pB);
        __CLR4_4_11pf61pf6lb90pct1.R.inc(79673);Assert.assertTrue(l.contains(p1));
        __CLR4_4_11pf61pf6lb90pct1.R.inc(79674);Assert.assertTrue(l.contains(p2));
        __CLR4_4_11pf61pf6lb90pct1.R.inc(79675);Assert.assertNull(pA.intersection(pA));
    }finally{__CLR4_4_11pf61pf6lb90pct1.R.flushNeeded();}}

    @Test
    public void testIntersection3() throws MathArithmeticException {__CLR4_4_11pf61pf6lb90pct1.R.globalSliceStart(getClass().getName(),79676);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1brwxnl1ph8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11pf61pf6lb90pct1.R.rethrow($CLV_t2$);}finally{__CLR4_4_11pf61pf6lb90pct1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.euclidean.threed.PlaneTest.testIntersection3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),79676,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1brwxnl1ph8() throws MathArithmeticException{try{__CLR4_4_11pf61pf6lb90pct1.R.inc(79676);
        __CLR4_4_11pf61pf6lb90pct1.R.inc(79677);Vector3D reference = new Vector3D (1.2, 3.4, -5.8);
        __CLR4_4_11pf61pf6lb90pct1.R.inc(79678);Plane p1 = new Plane(reference, new Vector3D(1, 3, 3));
        __CLR4_4_11pf61pf6lb90pct1.R.inc(79679);Plane p2 = new Plane(reference, new Vector3D(-2, 4, 0));
        __CLR4_4_11pf61pf6lb90pct1.R.inc(79680);Plane p3 = new Plane(reference, new Vector3D(7, 0, -4));
        __CLR4_4_11pf61pf6lb90pct1.R.inc(79681);Vector3D p = Plane.intersection(p1, p2, p3);
        __CLR4_4_11pf61pf6lb90pct1.R.inc(79682);Assert.assertEquals(reference.getX(), p.getX(), 1.0e-10);
        __CLR4_4_11pf61pf6lb90pct1.R.inc(79683);Assert.assertEquals(reference.getY(), p.getY(), 1.0e-10);
        __CLR4_4_11pf61pf6lb90pct1.R.inc(79684);Assert.assertEquals(reference.getZ(), p.getZ(), 1.0e-10);
    }finally{__CLR4_4_11pf61pf6lb90pct1.R.flushNeeded();}}

    @Test
    public void testSimilar() throws MathArithmeticException {__CLR4_4_11pf61pf6lb90pct1.R.globalSliceStart(getClass().getName(),79685);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dyiqjk1phh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11pf61pf6lb90pct1.R.rethrow($CLV_t2$);}finally{__CLR4_4_11pf61pf6lb90pct1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.euclidean.threed.PlaneTest.testSimilar",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),79685,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dyiqjk1phh() throws MathArithmeticException{try{__CLR4_4_11pf61pf6lb90pct1.R.inc(79685);
        __CLR4_4_11pf61pf6lb90pct1.R.inc(79686);Vector3D p1  = new Vector3D (1.2, 3.4, -5.8);
        __CLR4_4_11pf61pf6lb90pct1.R.inc(79687);Vector3D p2  = new Vector3D (3.4, -5.8, 1.2);
        __CLR4_4_11pf61pf6lb90pct1.R.inc(79688);Vector3D p3  = new Vector3D (-2.0, 4.3, 0.7);
        __CLR4_4_11pf61pf6lb90pct1.R.inc(79689);Plane    pA  = new Plane(p1, p2, p3);
        __CLR4_4_11pf61pf6lb90pct1.R.inc(79690);Plane    pB  = new Plane(p1, new Vector3D (11.4, -3.8, 5.1), p2);
        __CLR4_4_11pf61pf6lb90pct1.R.inc(79691);Assert.assertTrue(! pA.isSimilarTo(pB));
        __CLR4_4_11pf61pf6lb90pct1.R.inc(79692);Assert.assertTrue(pA.isSimilarTo(pA));
        __CLR4_4_11pf61pf6lb90pct1.R.inc(79693);Assert.assertTrue(pA.isSimilarTo(new Plane(p1, p3, p2)));
        __CLR4_4_11pf61pf6lb90pct1.R.inc(79694);Vector3D shift = new Vector3D(0.3, pA.getNormal());
        __CLR4_4_11pf61pf6lb90pct1.R.inc(79695);Assert.assertTrue(! pA.isSimilarTo(new Plane(p1.add(shift),
                                                     p3.add(shift),
                                                     p2.add(shift))));
    }finally{__CLR4_4_11pf61pf6lb90pct1.R.flushNeeded();}}

}
