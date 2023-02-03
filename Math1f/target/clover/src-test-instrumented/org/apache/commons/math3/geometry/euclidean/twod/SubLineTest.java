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
package org.apache.commons.math3.geometry.euclidean.twod;

import java.util.List;

import org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D;
import org.apache.commons.math3.geometry.euclidean.oned.IntervalsSet;
import org.apache.commons.math3.geometry.partitioning.RegionFactory;
import org.junit.Assert;
import org.junit.Test;

public class SubLineTest {static class __CLR4_4_11qla1qlalb90pcy3{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,81192,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testEndPoints() {__CLR4_4_11qla1qlalb90pcy3.R.globalSliceStart(getClass().getName(),81118);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16e85xp1qla();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11qla1qlalb90pcy3.R.rethrow($CLV_t2$);}finally{__CLR4_4_11qla1qlalb90pcy3.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.euclidean.twod.SubLineTest.testEndPoints",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),81118,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16e85xp1qla(){try{__CLR4_4_11qla1qlalb90pcy3.R.inc(81118);
        __CLR4_4_11qla1qlalb90pcy3.R.inc(81119);Vector2D p1 = new Vector2D(-1, -7);
        __CLR4_4_11qla1qlalb90pcy3.R.inc(81120);Vector2D p2 = new Vector2D(7, -1);
        __CLR4_4_11qla1qlalb90pcy3.R.inc(81121);Segment segment = new Segment(p1, p2, new Line(p1, p2));
        __CLR4_4_11qla1qlalb90pcy3.R.inc(81122);SubLine sub = new SubLine(segment);
        __CLR4_4_11qla1qlalb90pcy3.R.inc(81123);List<Segment> segments = sub.getSegments();
        __CLR4_4_11qla1qlalb90pcy3.R.inc(81124);Assert.assertEquals(1, segments.size());
        __CLR4_4_11qla1qlalb90pcy3.R.inc(81125);Assert.assertEquals(0.0, new Vector2D(-1, -7).distance(segments.get(0).getStart()), 1.0e-10);
        __CLR4_4_11qla1qlalb90pcy3.R.inc(81126);Assert.assertEquals(0.0, new Vector2D( 7, -1).distance(segments.get(0).getEnd()), 1.0e-10);
    }finally{__CLR4_4_11qla1qlalb90pcy3.R.flushNeeded();}}

    @Test
    public void testNoEndPoints() {__CLR4_4_11qla1qlalb90pcy3.R.globalSliceStart(getClass().getName(),81127);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1j5o17y1qlj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11qla1qlalb90pcy3.R.rethrow($CLV_t2$);}finally{__CLR4_4_11qla1qlalb90pcy3.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.euclidean.twod.SubLineTest.testNoEndPoints",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),81127,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1j5o17y1qlj(){try{__CLR4_4_11qla1qlalb90pcy3.R.inc(81127);
        __CLR4_4_11qla1qlalb90pcy3.R.inc(81128);SubLine wholeLine = new Line(new Vector2D(-1, 7), new Vector2D(7, 1)).wholeHyperplane();
        __CLR4_4_11qla1qlalb90pcy3.R.inc(81129);List<Segment> segments = wholeLine.getSegments();
        __CLR4_4_11qla1qlalb90pcy3.R.inc(81130);Assert.assertEquals(1, segments.size());
        __CLR4_4_11qla1qlalb90pcy3.R.inc(81131);Assert.assertTrue(Double.isInfinite(segments.get(0).getStart().getX()) &&
                          segments.get(0).getStart().getX() < 0);
        __CLR4_4_11qla1qlalb90pcy3.R.inc(81132);Assert.assertTrue(Double.isInfinite(segments.get(0).getStart().getY()) &&
                          segments.get(0).getStart().getY() > 0);
        __CLR4_4_11qla1qlalb90pcy3.R.inc(81133);Assert.assertTrue(Double.isInfinite(segments.get(0).getEnd().getX()) &&
                          segments.get(0).getEnd().getX() > 0);
        __CLR4_4_11qla1qlalb90pcy3.R.inc(81134);Assert.assertTrue(Double.isInfinite(segments.get(0).getEnd().getY()) &&
                          segments.get(0).getEnd().getY() < 0);
    }finally{__CLR4_4_11qla1qlalb90pcy3.R.flushNeeded();}}

    @Test
    public void testNoSegments() {__CLR4_4_11qla1qlalb90pcy3.R.globalSliceStart(getClass().getName(),81135);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16wv59i1qlr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11qla1qlalb90pcy3.R.rethrow($CLV_t2$);}finally{__CLR4_4_11qla1qlalb90pcy3.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.euclidean.twod.SubLineTest.testNoSegments",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),81135,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16wv59i1qlr(){try{__CLR4_4_11qla1qlalb90pcy3.R.inc(81135);
        __CLR4_4_11qla1qlalb90pcy3.R.inc(81136);SubLine empty = new SubLine(new Line(new Vector2D(-1, -7), new Vector2D(7, -1)),
                                    new RegionFactory<Euclidean1D>().getComplement(new IntervalsSet()));
        __CLR4_4_11qla1qlalb90pcy3.R.inc(81137);List<Segment> segments = empty.getSegments();
        __CLR4_4_11qla1qlalb90pcy3.R.inc(81138);Assert.assertEquals(0, segments.size());
    }finally{__CLR4_4_11qla1qlalb90pcy3.R.flushNeeded();}}

    @Test
    public void testSeveralSegments() {__CLR4_4_11qla1qlalb90pcy3.R.globalSliceStart(getClass().getName(),81139);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1m6801b1qlv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11qla1qlalb90pcy3.R.rethrow($CLV_t2$);}finally{__CLR4_4_11qla1qlalb90pcy3.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.euclidean.twod.SubLineTest.testSeveralSegments",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),81139,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1m6801b1qlv(){try{__CLR4_4_11qla1qlalb90pcy3.R.inc(81139);
        __CLR4_4_11qla1qlalb90pcy3.R.inc(81140);SubLine twoSubs = new SubLine(new Line(new Vector2D(-1, -7), new Vector2D(7, -1)),
                                    new RegionFactory<Euclidean1D>().union(new IntervalsSet(1, 2),
                                                                           new IntervalsSet(3, 4)));
        __CLR4_4_11qla1qlalb90pcy3.R.inc(81141);List<Segment> segments = twoSubs.getSegments();
        __CLR4_4_11qla1qlalb90pcy3.R.inc(81142);Assert.assertEquals(2, segments.size());
    }finally{__CLR4_4_11qla1qlalb90pcy3.R.flushNeeded();}}

    @Test
    public void testHalfInfiniteNeg() {__CLR4_4_11qla1qlalb90pcy3.R.globalSliceStart(getClass().getName(),81143);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wst2hu1qlz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11qla1qlalb90pcy3.R.rethrow($CLV_t2$);}finally{__CLR4_4_11qla1qlalb90pcy3.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.euclidean.twod.SubLineTest.testHalfInfiniteNeg",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),81143,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wst2hu1qlz(){try{__CLR4_4_11qla1qlalb90pcy3.R.inc(81143);
        __CLR4_4_11qla1qlalb90pcy3.R.inc(81144);SubLine empty = new SubLine(new Line(new Vector2D(-1, -7), new Vector2D(7, -1)),
                                    new IntervalsSet(Double.NEGATIVE_INFINITY, 0.0));
        __CLR4_4_11qla1qlalb90pcy3.R.inc(81145);List<Segment> segments = empty.getSegments();
        __CLR4_4_11qla1qlalb90pcy3.R.inc(81146);Assert.assertEquals(1, segments.size());
        __CLR4_4_11qla1qlalb90pcy3.R.inc(81147);Assert.assertTrue(Double.isInfinite(segments.get(0).getStart().getX()) &&
                          segments.get(0).getStart().getX() < 0);
        __CLR4_4_11qla1qlalb90pcy3.R.inc(81148);Assert.assertTrue(Double.isInfinite(segments.get(0).getStart().getY()) &&
                          segments.get(0).getStart().getY() < 0);
        __CLR4_4_11qla1qlalb90pcy3.R.inc(81149);Assert.assertEquals(0.0, new Vector2D(3, -4).distance(segments.get(0).getEnd()), 1.0e-10);
    }finally{__CLR4_4_11qla1qlalb90pcy3.R.flushNeeded();}}

    @Test
    public void testHalfInfinitePos() {__CLR4_4_11qla1qlalb90pcy3.R.globalSliceStart(getClass().getName(),81150);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ezlysi1qm6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11qla1qlalb90pcy3.R.rethrow($CLV_t2$);}finally{__CLR4_4_11qla1qlalb90pcy3.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.euclidean.twod.SubLineTest.testHalfInfinitePos",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),81150,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ezlysi1qm6(){try{__CLR4_4_11qla1qlalb90pcy3.R.inc(81150);
        __CLR4_4_11qla1qlalb90pcy3.R.inc(81151);SubLine empty = new SubLine(new Line(new Vector2D(-1, -7), new Vector2D(7, -1)),
                                    new IntervalsSet(0.0, Double.POSITIVE_INFINITY));
        __CLR4_4_11qla1qlalb90pcy3.R.inc(81152);List<Segment> segments = empty.getSegments();
        __CLR4_4_11qla1qlalb90pcy3.R.inc(81153);Assert.assertEquals(1, segments.size());
        __CLR4_4_11qla1qlalb90pcy3.R.inc(81154);Assert.assertEquals(0.0, new Vector2D(3, -4).distance(segments.get(0).getStart()), 1.0e-10);
        __CLR4_4_11qla1qlalb90pcy3.R.inc(81155);Assert.assertTrue(Double.isInfinite(segments.get(0).getEnd().getX()) &&
                          segments.get(0).getEnd().getX() > 0);
        __CLR4_4_11qla1qlalb90pcy3.R.inc(81156);Assert.assertTrue(Double.isInfinite(segments.get(0).getEnd().getY()) &&
                          segments.get(0).getEnd().getY() > 0);
    }finally{__CLR4_4_11qla1qlalb90pcy3.R.flushNeeded();}}

    @Test
    public void testIntersectionInsideInside() {__CLR4_4_11qla1qlalb90pcy3.R.globalSliceStart(getClass().getName(),81157);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_169kdsq1qmd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11qla1qlalb90pcy3.R.rethrow($CLV_t2$);}finally{__CLR4_4_11qla1qlalb90pcy3.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.euclidean.twod.SubLineTest.testIntersectionInsideInside",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),81157,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_169kdsq1qmd(){try{__CLR4_4_11qla1qlalb90pcy3.R.inc(81157);
        __CLR4_4_11qla1qlalb90pcy3.R.inc(81158);SubLine sub1 = new SubLine(new Vector2D(1, 1), new Vector2D(3, 1));
        __CLR4_4_11qla1qlalb90pcy3.R.inc(81159);SubLine sub2 = new SubLine(new Vector2D(2, 0), new Vector2D(2, 2));
        __CLR4_4_11qla1qlalb90pcy3.R.inc(81160);Assert.assertEquals(0.0, new Vector2D(2, 1).distance(sub1.intersection(sub2, true)),  1.0e-12);
        __CLR4_4_11qla1qlalb90pcy3.R.inc(81161);Assert.assertEquals(0.0, new Vector2D(2, 1).distance(sub1.intersection(sub2, false)), 1.0e-12);
    }finally{__CLR4_4_11qla1qlalb90pcy3.R.flushNeeded();}}

    @Test
    public void testIntersectionInsideBoundary() {__CLR4_4_11qla1qlalb90pcy3.R.globalSliceStart(getClass().getName(),81162);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1srfds81qmi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11qla1qlalb90pcy3.R.rethrow($CLV_t2$);}finally{__CLR4_4_11qla1qlalb90pcy3.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.euclidean.twod.SubLineTest.testIntersectionInsideBoundary",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),81162,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1srfds81qmi(){try{__CLR4_4_11qla1qlalb90pcy3.R.inc(81162);
        __CLR4_4_11qla1qlalb90pcy3.R.inc(81163);SubLine sub1 = new SubLine(new Vector2D(1, 1), new Vector2D(3, 1));
        __CLR4_4_11qla1qlalb90pcy3.R.inc(81164);SubLine sub2 = new SubLine(new Vector2D(2, 0), new Vector2D(2, 1));
        __CLR4_4_11qla1qlalb90pcy3.R.inc(81165);Assert.assertEquals(0.0, new Vector2D(2, 1).distance(sub1.intersection(sub2, true)),  1.0e-12);
        __CLR4_4_11qla1qlalb90pcy3.R.inc(81166);Assert.assertNull(sub1.intersection(sub2, false));
    }finally{__CLR4_4_11qla1qlalb90pcy3.R.flushNeeded();}}

    @Test
    public void testIntersectionInsideOutside() {__CLR4_4_11qla1qlalb90pcy3.R.globalSliceStart(getClass().getName(),81167);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ba2sr91qmn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11qla1qlalb90pcy3.R.rethrow($CLV_t2$);}finally{__CLR4_4_11qla1qlalb90pcy3.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.euclidean.twod.SubLineTest.testIntersectionInsideOutside",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),81167,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ba2sr91qmn(){try{__CLR4_4_11qla1qlalb90pcy3.R.inc(81167);
        __CLR4_4_11qla1qlalb90pcy3.R.inc(81168);SubLine sub1 = new SubLine(new Vector2D(1, 1), new Vector2D(3, 1));
        __CLR4_4_11qla1qlalb90pcy3.R.inc(81169);SubLine sub2 = new SubLine(new Vector2D(2, 0), new Vector2D(2, 0.5));
        __CLR4_4_11qla1qlalb90pcy3.R.inc(81170);Assert.assertNull(sub1.intersection(sub2, true));
        __CLR4_4_11qla1qlalb90pcy3.R.inc(81171);Assert.assertNull(sub1.intersection(sub2, false));
    }finally{__CLR4_4_11qla1qlalb90pcy3.R.flushNeeded();}}

    @Test
    public void testIntersectionBoundaryBoundary() {__CLR4_4_11qla1qlalb90pcy3.R.globalSliceStart(getClass().getName(),81172);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hsuswa1qms();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11qla1qlalb90pcy3.R.rethrow($CLV_t2$);}finally{__CLR4_4_11qla1qlalb90pcy3.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.euclidean.twod.SubLineTest.testIntersectionBoundaryBoundary",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),81172,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hsuswa1qms(){try{__CLR4_4_11qla1qlalb90pcy3.R.inc(81172);
        __CLR4_4_11qla1qlalb90pcy3.R.inc(81173);SubLine sub1 = new SubLine(new Vector2D(1, 1), new Vector2D(2, 1));
        __CLR4_4_11qla1qlalb90pcy3.R.inc(81174);SubLine sub2 = new SubLine(new Vector2D(2, 0), new Vector2D(2, 1));
        __CLR4_4_11qla1qlalb90pcy3.R.inc(81175);Assert.assertEquals(0.0, new Vector2D(2, 1).distance(sub1.intersection(sub2, true)),  1.0e-12);
        __CLR4_4_11qla1qlalb90pcy3.R.inc(81176);Assert.assertNull(sub1.intersection(sub2, false));
    }finally{__CLR4_4_11qla1qlalb90pcy3.R.flushNeeded();}}

    @Test
    public void testIntersectionBoundaryOutside() {__CLR4_4_11qla1qlalb90pcy3.R.globalSliceStart(getClass().getName(),81177);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qvsnkp1qmx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11qla1qlalb90pcy3.R.rethrow($CLV_t2$);}finally{__CLR4_4_11qla1qlalb90pcy3.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.euclidean.twod.SubLineTest.testIntersectionBoundaryOutside",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),81177,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qvsnkp1qmx(){try{__CLR4_4_11qla1qlalb90pcy3.R.inc(81177);
        __CLR4_4_11qla1qlalb90pcy3.R.inc(81178);SubLine sub1 = new SubLine(new Vector2D(1, 1), new Vector2D(2, 1));
        __CLR4_4_11qla1qlalb90pcy3.R.inc(81179);SubLine sub2 = new SubLine(new Vector2D(2, 0), new Vector2D(2, 0.5));
        __CLR4_4_11qla1qlalb90pcy3.R.inc(81180);Assert.assertNull(sub1.intersection(sub2, true));
        __CLR4_4_11qla1qlalb90pcy3.R.inc(81181);Assert.assertNull(sub1.intersection(sub2, false));
    }finally{__CLR4_4_11qla1qlalb90pcy3.R.flushNeeded();}}

    @Test
    public void testIntersectionOutsideOutside() {__CLR4_4_11qla1qlalb90pcy3.R.globalSliceStart(getClass().getName(),81182);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xkqbwe1qn2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11qla1qlalb90pcy3.R.rethrow($CLV_t2$);}finally{__CLR4_4_11qla1qlalb90pcy3.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.euclidean.twod.SubLineTest.testIntersectionOutsideOutside",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),81182,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xkqbwe1qn2(){try{__CLR4_4_11qla1qlalb90pcy3.R.inc(81182);
        __CLR4_4_11qla1qlalb90pcy3.R.inc(81183);SubLine sub1 = new SubLine(new Vector2D(1, 1), new Vector2D(1.5, 1));
        __CLR4_4_11qla1qlalb90pcy3.R.inc(81184);SubLine sub2 = new SubLine(new Vector2D(2, 0), new Vector2D(2, 0.5));
        __CLR4_4_11qla1qlalb90pcy3.R.inc(81185);Assert.assertNull(sub1.intersection(sub2, true));
        __CLR4_4_11qla1qlalb90pcy3.R.inc(81186);Assert.assertNull(sub1.intersection(sub2, false));
    }finally{__CLR4_4_11qla1qlalb90pcy3.R.flushNeeded();}}

    @Test
    public void testIntersectionParallel() {__CLR4_4_11qla1qlalb90pcy3.R.globalSliceStart(getClass().getName(),81187);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18hbqeh1qn7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11qla1qlalb90pcy3.R.rethrow($CLV_t2$);}finally{__CLR4_4_11qla1qlalb90pcy3.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.euclidean.twod.SubLineTest.testIntersectionParallel",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),81187,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18hbqeh1qn7(){try{__CLR4_4_11qla1qlalb90pcy3.R.inc(81187);
        __CLR4_4_11qla1qlalb90pcy3.R.inc(81188);final SubLine sub1 = new SubLine(new Vector2D(0, 1), new Vector2D(0, 2));
        __CLR4_4_11qla1qlalb90pcy3.R.inc(81189);final SubLine sub2 = new SubLine(new Vector2D(66, 3), new Vector2D(66, 4));
        __CLR4_4_11qla1qlalb90pcy3.R.inc(81190);Assert.assertNull(sub1.intersection(sub2, true));
        __CLR4_4_11qla1qlalb90pcy3.R.inc(81191);Assert.assertNull(sub1.intersection(sub2, false));
    }finally{__CLR4_4_11qla1qlalb90pcy3.R.flushNeeded();}}

}
