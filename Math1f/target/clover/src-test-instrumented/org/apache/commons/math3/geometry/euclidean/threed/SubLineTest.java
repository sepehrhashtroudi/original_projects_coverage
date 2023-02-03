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

import java.util.List;

import org.apache.commons.math3.exception.MathIllegalArgumentException;
import org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D;
import org.apache.commons.math3.geometry.euclidean.oned.IntervalsSet;
import org.apache.commons.math3.geometry.partitioning.RegionFactory;
import org.junit.Assert;
import org.junit.Test;

public class SubLineTest {static class __CLR4_4_11pyx1pyxlb90pcvd{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,80391,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testEndPoints() throws MathIllegalArgumentException {__CLR4_4_11pyx1pyxlb90pcvd.R.globalSliceStart(getClass().getName(),80313);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16e85xp1pyx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11pyx1pyxlb90pcvd.R.rethrow($CLV_t2$);}finally{__CLR4_4_11pyx1pyxlb90pcvd.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.euclidean.threed.SubLineTest.testEndPoints",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),80313,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16e85xp1pyx() throws MathIllegalArgumentException{try{__CLR4_4_11pyx1pyxlb90pcvd.R.inc(80313);
        __CLR4_4_11pyx1pyxlb90pcvd.R.inc(80314);Vector3D p1 = new Vector3D(-1, -7, 2);
        __CLR4_4_11pyx1pyxlb90pcvd.R.inc(80315);Vector3D p2 = new Vector3D(7, -1, 0);
        __CLR4_4_11pyx1pyxlb90pcvd.R.inc(80316);Segment segment = new Segment(p1, p2, new Line(p1, p2));
        __CLR4_4_11pyx1pyxlb90pcvd.R.inc(80317);SubLine sub = new SubLine(segment);
        __CLR4_4_11pyx1pyxlb90pcvd.R.inc(80318);List<Segment> segments = sub.getSegments();
        __CLR4_4_11pyx1pyxlb90pcvd.R.inc(80319);Assert.assertEquals(1, segments.size());
        __CLR4_4_11pyx1pyxlb90pcvd.R.inc(80320);Assert.assertEquals(0.0, new Vector3D(-1, -7, 2).distance(segments.get(0).getStart()), 1.0e-10);
        __CLR4_4_11pyx1pyxlb90pcvd.R.inc(80321);Assert.assertEquals(0.0, new Vector3D( 7, -1, 0).distance(segments.get(0).getEnd()), 1.0e-10);
    }finally{__CLR4_4_11pyx1pyxlb90pcvd.R.flushNeeded();}}

    @Test
    public void testNoEndPoints() throws MathIllegalArgumentException {__CLR4_4_11pyx1pyxlb90pcvd.R.globalSliceStart(getClass().getName(),80322);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1j5o17y1pz6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11pyx1pyxlb90pcvd.R.rethrow($CLV_t2$);}finally{__CLR4_4_11pyx1pyxlb90pcvd.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.euclidean.threed.SubLineTest.testNoEndPoints",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),80322,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1j5o17y1pz6() throws MathIllegalArgumentException{try{__CLR4_4_11pyx1pyxlb90pcvd.R.inc(80322);
        __CLR4_4_11pyx1pyxlb90pcvd.R.inc(80323);SubLine wholeLine = new Line(new Vector3D(-1, 7, 2), new Vector3D(7, 1, 0)).wholeLine();
        __CLR4_4_11pyx1pyxlb90pcvd.R.inc(80324);List<Segment> segments = wholeLine.getSegments();
        __CLR4_4_11pyx1pyxlb90pcvd.R.inc(80325);Assert.assertEquals(1, segments.size());
        __CLR4_4_11pyx1pyxlb90pcvd.R.inc(80326);Assert.assertTrue(Double.isInfinite(segments.get(0).getStart().getX()) &&
                          segments.get(0).getStart().getX() < 0);
        __CLR4_4_11pyx1pyxlb90pcvd.R.inc(80327);Assert.assertTrue(Double.isInfinite(segments.get(0).getStart().getY()) &&
                          segments.get(0).getStart().getY() > 0);
        __CLR4_4_11pyx1pyxlb90pcvd.R.inc(80328);Assert.assertTrue(Double.isInfinite(segments.get(0).getStart().getZ()) &&
                          segments.get(0).getStart().getZ() > 0);
        __CLR4_4_11pyx1pyxlb90pcvd.R.inc(80329);Assert.assertTrue(Double.isInfinite(segments.get(0).getEnd().getX()) &&
                          segments.get(0).getEnd().getX() > 0);
        __CLR4_4_11pyx1pyxlb90pcvd.R.inc(80330);Assert.assertTrue(Double.isInfinite(segments.get(0).getEnd().getY()) &&
                          segments.get(0).getEnd().getY() < 0);
        __CLR4_4_11pyx1pyxlb90pcvd.R.inc(80331);Assert.assertTrue(Double.isInfinite(segments.get(0).getEnd().getZ()) &&
                          segments.get(0).getEnd().getZ() < 0);
    }finally{__CLR4_4_11pyx1pyxlb90pcvd.R.flushNeeded();}}

    @Test
    public void testNoSegments() throws MathIllegalArgumentException {__CLR4_4_11pyx1pyxlb90pcvd.R.globalSliceStart(getClass().getName(),80332);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16wv59i1pzg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11pyx1pyxlb90pcvd.R.rethrow($CLV_t2$);}finally{__CLR4_4_11pyx1pyxlb90pcvd.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.euclidean.threed.SubLineTest.testNoSegments",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),80332,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16wv59i1pzg() throws MathIllegalArgumentException{try{__CLR4_4_11pyx1pyxlb90pcvd.R.inc(80332);
        __CLR4_4_11pyx1pyxlb90pcvd.R.inc(80333);SubLine empty = new SubLine(new Line(new Vector3D(-1, -7, 2), new Vector3D(7, -1, 0)),
                                    (IntervalsSet) new RegionFactory<Euclidean1D>().getComplement(new IntervalsSet()));
        __CLR4_4_11pyx1pyxlb90pcvd.R.inc(80334);List<Segment> segments = empty.getSegments();
        __CLR4_4_11pyx1pyxlb90pcvd.R.inc(80335);Assert.assertEquals(0, segments.size());
    }finally{__CLR4_4_11pyx1pyxlb90pcvd.R.flushNeeded();}}

    @Test
    public void testSeveralSegments() throws MathIllegalArgumentException {__CLR4_4_11pyx1pyxlb90pcvd.R.globalSliceStart(getClass().getName(),80336);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1m6801b1pzk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11pyx1pyxlb90pcvd.R.rethrow($CLV_t2$);}finally{__CLR4_4_11pyx1pyxlb90pcvd.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.euclidean.threed.SubLineTest.testSeveralSegments",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),80336,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1m6801b1pzk() throws MathIllegalArgumentException{try{__CLR4_4_11pyx1pyxlb90pcvd.R.inc(80336);
        __CLR4_4_11pyx1pyxlb90pcvd.R.inc(80337);SubLine twoSubs = new SubLine(new Line(new Vector3D(-1, -7, 2), new Vector3D(7, -1, 0)),
                                      (IntervalsSet) new RegionFactory<Euclidean1D>().union(new IntervalsSet(1, 2),
                                                                                            new IntervalsSet(3, 4)));
        __CLR4_4_11pyx1pyxlb90pcvd.R.inc(80338);List<Segment> segments = twoSubs.getSegments();
        __CLR4_4_11pyx1pyxlb90pcvd.R.inc(80339);Assert.assertEquals(2, segments.size());
    }finally{__CLR4_4_11pyx1pyxlb90pcvd.R.flushNeeded();}}

    @Test
    public void testHalfInfiniteNeg() throws MathIllegalArgumentException {__CLR4_4_11pyx1pyxlb90pcvd.R.globalSliceStart(getClass().getName(),80340);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wst2hu1pzo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11pyx1pyxlb90pcvd.R.rethrow($CLV_t2$);}finally{__CLR4_4_11pyx1pyxlb90pcvd.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.euclidean.threed.SubLineTest.testHalfInfiniteNeg",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),80340,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wst2hu1pzo() throws MathIllegalArgumentException{try{__CLR4_4_11pyx1pyxlb90pcvd.R.inc(80340);
        __CLR4_4_11pyx1pyxlb90pcvd.R.inc(80341);SubLine empty = new SubLine(new Line(new Vector3D(-1, -7, 2), new Vector3D(7, -1, -2)),
                                    new IntervalsSet(Double.NEGATIVE_INFINITY, 0.0));
        __CLR4_4_11pyx1pyxlb90pcvd.R.inc(80342);List<Segment> segments = empty.getSegments();
        __CLR4_4_11pyx1pyxlb90pcvd.R.inc(80343);Assert.assertEquals(1, segments.size());
        __CLR4_4_11pyx1pyxlb90pcvd.R.inc(80344);Assert.assertTrue(Double.isInfinite(segments.get(0).getStart().getX()) &&
                          segments.get(0).getStart().getX() < 0);
        __CLR4_4_11pyx1pyxlb90pcvd.R.inc(80345);Assert.assertTrue(Double.isInfinite(segments.get(0).getStart().getY()) &&
                          segments.get(0).getStart().getY() < 0);
        __CLR4_4_11pyx1pyxlb90pcvd.R.inc(80346);Assert.assertTrue(Double.isInfinite(segments.get(0).getStart().getZ()) &&
                          segments.get(0).getStart().getZ() > 0);
        __CLR4_4_11pyx1pyxlb90pcvd.R.inc(80347);Assert.assertEquals(0.0, new Vector3D(3, -4, 0).distance(segments.get(0).getEnd()), 1.0e-10);
    }finally{__CLR4_4_11pyx1pyxlb90pcvd.R.flushNeeded();}}

    @Test
    public void testHalfInfinitePos() throws MathIllegalArgumentException {__CLR4_4_11pyx1pyxlb90pcvd.R.globalSliceStart(getClass().getName(),80348);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ezlysi1pzw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11pyx1pyxlb90pcvd.R.rethrow($CLV_t2$);}finally{__CLR4_4_11pyx1pyxlb90pcvd.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.euclidean.threed.SubLineTest.testHalfInfinitePos",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),80348,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ezlysi1pzw() throws MathIllegalArgumentException{try{__CLR4_4_11pyx1pyxlb90pcvd.R.inc(80348);
        __CLR4_4_11pyx1pyxlb90pcvd.R.inc(80349);SubLine empty = new SubLine(new Line(new Vector3D(-1, -7, 2), new Vector3D(7, -1, -2)),
                                    new IntervalsSet(0.0, Double.POSITIVE_INFINITY));
        __CLR4_4_11pyx1pyxlb90pcvd.R.inc(80350);List<Segment> segments = empty.getSegments();
        __CLR4_4_11pyx1pyxlb90pcvd.R.inc(80351);Assert.assertEquals(1, segments.size());
        __CLR4_4_11pyx1pyxlb90pcvd.R.inc(80352);Assert.assertEquals(0.0, new Vector3D(3, -4, 0).distance(segments.get(0).getStart()), 1.0e-10);
        __CLR4_4_11pyx1pyxlb90pcvd.R.inc(80353);Assert.assertTrue(Double.isInfinite(segments.get(0).getEnd().getX()) &&
                          segments.get(0).getEnd().getX() > 0);
        __CLR4_4_11pyx1pyxlb90pcvd.R.inc(80354);Assert.assertTrue(Double.isInfinite(segments.get(0).getEnd().getY()) &&
                          segments.get(0).getEnd().getY() > 0);
        __CLR4_4_11pyx1pyxlb90pcvd.R.inc(80355);Assert.assertTrue(Double.isInfinite(segments.get(0).getEnd().getZ()) &&
                          segments.get(0).getEnd().getZ() < 0);
    }finally{__CLR4_4_11pyx1pyxlb90pcvd.R.flushNeeded();}}

    @Test
    public void testIntersectionInsideInside() throws MathIllegalArgumentException {__CLR4_4_11pyx1pyxlb90pcvd.R.globalSliceStart(getClass().getName(),80356);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_169kdsq1q04();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11pyx1pyxlb90pcvd.R.rethrow($CLV_t2$);}finally{__CLR4_4_11pyx1pyxlb90pcvd.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.euclidean.threed.SubLineTest.testIntersectionInsideInside",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),80356,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_169kdsq1q04() throws MathIllegalArgumentException{try{__CLR4_4_11pyx1pyxlb90pcvd.R.inc(80356);
        __CLR4_4_11pyx1pyxlb90pcvd.R.inc(80357);SubLine sub1 = new SubLine(new Vector3D(1, 1, 1), new Vector3D(3, 1, 1));
        __CLR4_4_11pyx1pyxlb90pcvd.R.inc(80358);SubLine sub2 = new SubLine(new Vector3D(2, 0, 0), new Vector3D(2, 2, 2));
        __CLR4_4_11pyx1pyxlb90pcvd.R.inc(80359);Assert.assertEquals(0.0, new Vector3D(2, 1, 1).distance(sub1.intersection(sub2, true)),  1.0e-12);
        __CLR4_4_11pyx1pyxlb90pcvd.R.inc(80360);Assert.assertEquals(0.0, new Vector3D(2, 1, 1).distance(sub1.intersection(sub2, false)), 1.0e-12);
    }finally{__CLR4_4_11pyx1pyxlb90pcvd.R.flushNeeded();}}

    @Test
    public void testIntersectionInsideBoundary() throws MathIllegalArgumentException {__CLR4_4_11pyx1pyxlb90pcvd.R.globalSliceStart(getClass().getName(),80361);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1srfds81q09();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11pyx1pyxlb90pcvd.R.rethrow($CLV_t2$);}finally{__CLR4_4_11pyx1pyxlb90pcvd.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.euclidean.threed.SubLineTest.testIntersectionInsideBoundary",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),80361,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1srfds81q09() throws MathIllegalArgumentException{try{__CLR4_4_11pyx1pyxlb90pcvd.R.inc(80361);
        __CLR4_4_11pyx1pyxlb90pcvd.R.inc(80362);SubLine sub1 = new SubLine(new Vector3D(1, 1, 1), new Vector3D(3, 1, 1));
        __CLR4_4_11pyx1pyxlb90pcvd.R.inc(80363);SubLine sub2 = new SubLine(new Vector3D(2, 0, 0), new Vector3D(2, 1, 1));
        __CLR4_4_11pyx1pyxlb90pcvd.R.inc(80364);Assert.assertEquals(0.0, new Vector3D(2, 1, 1).distance(sub1.intersection(sub2, true)),  1.0e-12);
        __CLR4_4_11pyx1pyxlb90pcvd.R.inc(80365);Assert.assertNull(sub1.intersection(sub2, false));
    }finally{__CLR4_4_11pyx1pyxlb90pcvd.R.flushNeeded();}}

    @Test
    public void testIntersectionInsideOutside() throws MathIllegalArgumentException {__CLR4_4_11pyx1pyxlb90pcvd.R.globalSliceStart(getClass().getName(),80366);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ba2sr91q0e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11pyx1pyxlb90pcvd.R.rethrow($CLV_t2$);}finally{__CLR4_4_11pyx1pyxlb90pcvd.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.euclidean.threed.SubLineTest.testIntersectionInsideOutside",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),80366,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ba2sr91q0e() throws MathIllegalArgumentException{try{__CLR4_4_11pyx1pyxlb90pcvd.R.inc(80366);
        __CLR4_4_11pyx1pyxlb90pcvd.R.inc(80367);SubLine sub1 = new SubLine(new Vector3D(1, 1, 1), new Vector3D(3, 1, 1));
        __CLR4_4_11pyx1pyxlb90pcvd.R.inc(80368);SubLine sub2 = new SubLine(new Vector3D(2, 0, 0), new Vector3D(2, 0.5, 0.5));
        __CLR4_4_11pyx1pyxlb90pcvd.R.inc(80369);Assert.assertNull(sub1.intersection(sub2, true));
        __CLR4_4_11pyx1pyxlb90pcvd.R.inc(80370);Assert.assertNull(sub1.intersection(sub2, false));
    }finally{__CLR4_4_11pyx1pyxlb90pcvd.R.flushNeeded();}}

    @Test
    public void testIntersectionBoundaryBoundary() throws MathIllegalArgumentException {__CLR4_4_11pyx1pyxlb90pcvd.R.globalSliceStart(getClass().getName(),80371);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hsuswa1q0j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11pyx1pyxlb90pcvd.R.rethrow($CLV_t2$);}finally{__CLR4_4_11pyx1pyxlb90pcvd.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.euclidean.threed.SubLineTest.testIntersectionBoundaryBoundary",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),80371,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hsuswa1q0j() throws MathIllegalArgumentException{try{__CLR4_4_11pyx1pyxlb90pcvd.R.inc(80371);
        __CLR4_4_11pyx1pyxlb90pcvd.R.inc(80372);SubLine sub1 = new SubLine(new Vector3D(1, 1, 1), new Vector3D(2, 1, 1));
        __CLR4_4_11pyx1pyxlb90pcvd.R.inc(80373);SubLine sub2 = new SubLine(new Vector3D(2, 0, 0), new Vector3D(2, 1, 1));
        __CLR4_4_11pyx1pyxlb90pcvd.R.inc(80374);Assert.assertEquals(0.0, new Vector3D(2, 1, 1).distance(sub1.intersection(sub2, true)),  1.0e-12);
        __CLR4_4_11pyx1pyxlb90pcvd.R.inc(80375);Assert.assertNull(sub1.intersection(sub2, false));
    }finally{__CLR4_4_11pyx1pyxlb90pcvd.R.flushNeeded();}}

    @Test
    public void testIntersectionBoundaryOutside() throws MathIllegalArgumentException {__CLR4_4_11pyx1pyxlb90pcvd.R.globalSliceStart(getClass().getName(),80376);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qvsnkp1q0o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11pyx1pyxlb90pcvd.R.rethrow($CLV_t2$);}finally{__CLR4_4_11pyx1pyxlb90pcvd.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.euclidean.threed.SubLineTest.testIntersectionBoundaryOutside",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),80376,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qvsnkp1q0o() throws MathIllegalArgumentException{try{__CLR4_4_11pyx1pyxlb90pcvd.R.inc(80376);
        __CLR4_4_11pyx1pyxlb90pcvd.R.inc(80377);SubLine sub1 = new SubLine(new Vector3D(1, 1, 1), new Vector3D(2, 1, 1));
        __CLR4_4_11pyx1pyxlb90pcvd.R.inc(80378);SubLine sub2 = new SubLine(new Vector3D(2, 0, 0), new Vector3D(2, 0.5, 0.5));
        __CLR4_4_11pyx1pyxlb90pcvd.R.inc(80379);Assert.assertNull(sub1.intersection(sub2, true));
        __CLR4_4_11pyx1pyxlb90pcvd.R.inc(80380);Assert.assertNull(sub1.intersection(sub2, false));
    }finally{__CLR4_4_11pyx1pyxlb90pcvd.R.flushNeeded();}}

    @Test
    public void testIntersectionOutsideOutside() throws MathIllegalArgumentException {__CLR4_4_11pyx1pyxlb90pcvd.R.globalSliceStart(getClass().getName(),80381);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xkqbwe1q0t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11pyx1pyxlb90pcvd.R.rethrow($CLV_t2$);}finally{__CLR4_4_11pyx1pyxlb90pcvd.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.euclidean.threed.SubLineTest.testIntersectionOutsideOutside",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),80381,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xkqbwe1q0t() throws MathIllegalArgumentException{try{__CLR4_4_11pyx1pyxlb90pcvd.R.inc(80381);
        __CLR4_4_11pyx1pyxlb90pcvd.R.inc(80382);SubLine sub1 = new SubLine(new Vector3D(1, 1, 1), new Vector3D(1.5, 1, 1));
        __CLR4_4_11pyx1pyxlb90pcvd.R.inc(80383);SubLine sub2 = new SubLine(new Vector3D(2, 0, 0), new Vector3D(2, 0.5, 0.5));
        __CLR4_4_11pyx1pyxlb90pcvd.R.inc(80384);Assert.assertNull(sub1.intersection(sub2, true));
        __CLR4_4_11pyx1pyxlb90pcvd.R.inc(80385);Assert.assertNull(sub1.intersection(sub2, false));
    }finally{__CLR4_4_11pyx1pyxlb90pcvd.R.flushNeeded();}}
    
    @Test
    public void testIntersectionNotIntersecting() throws MathIllegalArgumentException {__CLR4_4_11pyx1pyxlb90pcvd.R.globalSliceStart(getClass().getName(),80386);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1j1uxoi1q0y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11pyx1pyxlb90pcvd.R.rethrow($CLV_t2$);}finally{__CLR4_4_11pyx1pyxlb90pcvd.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.euclidean.threed.SubLineTest.testIntersectionNotIntersecting",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),80386,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1j1uxoi1q0y() throws MathIllegalArgumentException{try{__CLR4_4_11pyx1pyxlb90pcvd.R.inc(80386);
        __CLR4_4_11pyx1pyxlb90pcvd.R.inc(80387);SubLine sub1 = new SubLine(new Vector3D(1, 1, 1), new Vector3D(1.5, 1, 1));
        __CLR4_4_11pyx1pyxlb90pcvd.R.inc(80388);SubLine sub2 = new SubLine(new Vector3D(2, 3, 0), new Vector3D(2, 3, 0.5));
        __CLR4_4_11pyx1pyxlb90pcvd.R.inc(80389);Assert.assertNull(sub1.intersection(sub2, true));
        __CLR4_4_11pyx1pyxlb90pcvd.R.inc(80390);Assert.assertNull(sub1.intersection(sub2, false));
    }finally{__CLR4_4_11pyx1pyxlb90pcvd.R.flushNeeded();}}

}
