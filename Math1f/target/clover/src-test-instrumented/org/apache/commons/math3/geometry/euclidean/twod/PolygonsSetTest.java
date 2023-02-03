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

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.math3.geometry.euclidean.oned.Interval;
import org.apache.commons.math3.geometry.euclidean.oned.IntervalsSet;
import org.apache.commons.math3.geometry.euclidean.oned.Vector1D;
import org.apache.commons.math3.geometry.partitioning.BSPTree;
import org.apache.commons.math3.geometry.partitioning.Region;
import org.apache.commons.math3.geometry.partitioning.Region.Location;
import org.apache.commons.math3.geometry.partitioning.RegionFactory;
import org.apache.commons.math3.geometry.partitioning.SubHyperplane;
import org.apache.commons.math3.util.FastMath;
import org.junit.Assert;
import org.junit.Test;

public class PolygonsSetTest {static class __CLR4_4_11qd01qd0lb90pcxu{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,81110,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testSimplyConnected() {__CLR4_4_11qd01qd0lb90pcxu.R.globalSliceStart(getClass().getName(),80820);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15zmkfc1qd0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11qd01qd0lb90pcxu.R.rethrow($CLV_t2$);}finally{__CLR4_4_11qd01qd0lb90pcxu.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSetTest.testSimplyConnected",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),80820,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15zmkfc1qd0(){try{__CLR4_4_11qd01qd0lb90pcxu.R.inc(80820);
        __CLR4_4_11qd01qd0lb90pcxu.R.inc(80821);Vector2D[][] vertices = new Vector2D[][] {
            new Vector2D[] {
                new Vector2D(36.0, 22.0),
                new Vector2D(39.0, 32.0),
                new Vector2D(19.0, 32.0),
                new Vector2D( 6.0, 16.0),
                new Vector2D(31.0, 10.0),
                new Vector2D(42.0, 16.0),
                new Vector2D(34.0, 20.0),
                new Vector2D(29.0, 19.0),
                new Vector2D(23.0, 22.0),
                new Vector2D(33.0, 25.0)
            }
        };
        __CLR4_4_11qd01qd0lb90pcxu.R.inc(80822);PolygonsSet set = buildSet(vertices);
        __CLR4_4_11qd01qd0lb90pcxu.R.inc(80823);Assert.assertEquals(Region.Location.OUTSIDE, set.checkPoint(new Vector2D(50.0, 30.0)));
        __CLR4_4_11qd01qd0lb90pcxu.R.inc(80824);checkPoints(Region.Location.INSIDE, set, new Vector2D[] {
            new Vector2D(30.0, 15.0),
            new Vector2D(15.0, 20.0),
            new Vector2D(24.0, 25.0),
            new Vector2D(35.0, 30.0),
            new Vector2D(19.0, 17.0)
        });
        __CLR4_4_11qd01qd0lb90pcxu.R.inc(80825);checkPoints(Region.Location.OUTSIDE, set, new Vector2D[] {
            new Vector2D(50.0, 30.0),
            new Vector2D(30.0, 35.0),
            new Vector2D(10.0, 25.0),
            new Vector2D(10.0, 10.0),
            new Vector2D(40.0, 10.0),
            new Vector2D(50.0, 15.0),
            new Vector2D(30.0, 22.0)
        });
        __CLR4_4_11qd01qd0lb90pcxu.R.inc(80826);checkPoints(Region.Location.BOUNDARY, set, new Vector2D[] {
            new Vector2D(30.0, 32.0),
            new Vector2D(34.0, 20.0)
        });
        __CLR4_4_11qd01qd0lb90pcxu.R.inc(80827);checkVertices(set.getVertices(), vertices);
    }finally{__CLR4_4_11qd01qd0lb90pcxu.R.flushNeeded();}}

    @Test
    public void testStair() {__CLR4_4_11qd01qd0lb90pcxu.R.globalSliceStart(getClass().getName(),80828);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cazfb21qd8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11qd01qd0lb90pcxu.R.rethrow($CLV_t2$);}finally{__CLR4_4_11qd01qd0lb90pcxu.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSetTest.testStair",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),80828,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cazfb21qd8(){try{__CLR4_4_11qd01qd0lb90pcxu.R.inc(80828);
        __CLR4_4_11qd01qd0lb90pcxu.R.inc(80829);Vector2D[][] vertices = new Vector2D[][] {
            new Vector2D[] {
                new Vector2D( 0.0, 0.0),
                new Vector2D( 0.0, 2.0),
                new Vector2D(-0.1, 2.0),
                new Vector2D(-0.1, 1.0),
                new Vector2D(-0.3, 1.0),
                new Vector2D(-0.3, 1.5),
                new Vector2D(-1.3, 1.5),
                new Vector2D(-1.3, 2.0),
                new Vector2D(-1.8, 2.0),
                new Vector2D(-1.8 - 1.0 / FastMath.sqrt(2.0),
                            2.0 - 1.0 / FastMath.sqrt(2.0))
            }
        };

        __CLR4_4_11qd01qd0lb90pcxu.R.inc(80830);PolygonsSet set = buildSet(vertices);
        __CLR4_4_11qd01qd0lb90pcxu.R.inc(80831);checkVertices(set.getVertices(), vertices);

        __CLR4_4_11qd01qd0lb90pcxu.R.inc(80832);Assert.assertEquals(1.1 + 0.95 * FastMath.sqrt(2.0), set.getSize(), 1.0e-10);

    }finally{__CLR4_4_11qd01qd0lb90pcxu.R.flushNeeded();}}

    @Test
    public void testHole() {__CLR4_4_11qd01qd0lb90pcxu.R.globalSliceStart(getClass().getName(),80833);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mx1it51qdd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11qd01qd0lb90pcxu.R.rethrow($CLV_t2$);}finally{__CLR4_4_11qd01qd0lb90pcxu.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSetTest.testHole",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),80833,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mx1it51qdd(){try{__CLR4_4_11qd01qd0lb90pcxu.R.inc(80833);
        __CLR4_4_11qd01qd0lb90pcxu.R.inc(80834);Vector2D[][] vertices = new Vector2D[][] {
            new Vector2D[] {
                new Vector2D(0.0, 0.0),
                new Vector2D(3.0, 0.0),
                new Vector2D(3.0, 3.0),
                new Vector2D(0.0, 3.0)
            }, new Vector2D[] {
                new Vector2D(1.0, 2.0),
                new Vector2D(2.0, 2.0),
                new Vector2D(2.0, 1.0),
                new Vector2D(1.0, 1.0)
            }
        };
        __CLR4_4_11qd01qd0lb90pcxu.R.inc(80835);PolygonsSet set = buildSet(vertices);
        __CLR4_4_11qd01qd0lb90pcxu.R.inc(80836);checkPoints(Region.Location.INSIDE, set, new Vector2D[] {
            new Vector2D(0.5, 0.5),
            new Vector2D(1.5, 0.5),
            new Vector2D(2.5, 0.5),
            new Vector2D(0.5, 1.5),
            new Vector2D(2.5, 1.5),
            new Vector2D(0.5, 2.5),
            new Vector2D(1.5, 2.5),
            new Vector2D(2.5, 2.5),
            new Vector2D(0.5, 1.0)
        });
        __CLR4_4_11qd01qd0lb90pcxu.R.inc(80837);checkPoints(Region.Location.OUTSIDE, set, new Vector2D[] {
            new Vector2D(1.5, 1.5),
            new Vector2D(3.5, 1.0),
            new Vector2D(4.0, 1.5),
            new Vector2D(6.0, 6.0)
        });
        __CLR4_4_11qd01qd0lb90pcxu.R.inc(80838);checkPoints(Region.Location.BOUNDARY, set, new Vector2D[] {
            new Vector2D(1.0, 1.0),
            new Vector2D(1.5, 0.0),
            new Vector2D(1.5, 1.0),
            new Vector2D(1.5, 2.0),
            new Vector2D(1.5, 3.0),
            new Vector2D(3.0, 3.0)
        });
        __CLR4_4_11qd01qd0lb90pcxu.R.inc(80839);checkVertices(set.getVertices(), vertices);
    }finally{__CLR4_4_11qd01qd0lb90pcxu.R.flushNeeded();}}

    @Test
    public void testDisjointPolygons() {__CLR4_4_11qd01qd0lb90pcxu.R.globalSliceStart(getClass().getName(),80840);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gmg4nm1qdk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11qd01qd0lb90pcxu.R.rethrow($CLV_t2$);}finally{__CLR4_4_11qd01qd0lb90pcxu.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSetTest.testDisjointPolygons",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),80840,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gmg4nm1qdk(){try{__CLR4_4_11qd01qd0lb90pcxu.R.inc(80840);
        __CLR4_4_11qd01qd0lb90pcxu.R.inc(80841);Vector2D[][] vertices = new Vector2D[][] {
            new Vector2D[] {
                new Vector2D(0.0, 1.0),
                new Vector2D(2.0, 1.0),
                new Vector2D(1.0, 2.0)
            }, new Vector2D[] {
                new Vector2D(4.0, 0.0),
                new Vector2D(5.0, 1.0),
                new Vector2D(3.0, 1.0)
            }
        };
        __CLR4_4_11qd01qd0lb90pcxu.R.inc(80842);PolygonsSet set = buildSet(vertices);
        __CLR4_4_11qd01qd0lb90pcxu.R.inc(80843);Assert.assertEquals(Region.Location.INSIDE, set.checkPoint(new Vector2D(1.0, 1.5)));
        __CLR4_4_11qd01qd0lb90pcxu.R.inc(80844);checkPoints(Region.Location.INSIDE, set, new Vector2D[] {
            new Vector2D(1.0, 1.5),
            new Vector2D(4.5, 0.8)
        });
        __CLR4_4_11qd01qd0lb90pcxu.R.inc(80845);checkPoints(Region.Location.OUTSIDE, set, new Vector2D[] {
            new Vector2D(1.0, 0.0),
            new Vector2D(3.5, 1.2),
            new Vector2D(2.5, 1.0),
            new Vector2D(3.0, 4.0)
        });
        __CLR4_4_11qd01qd0lb90pcxu.R.inc(80846);checkPoints(Region.Location.BOUNDARY, set, new Vector2D[] {
            new Vector2D(1.0, 1.0),
            new Vector2D(3.5, 0.5),
            new Vector2D(0.0, 1.0)
        });
        __CLR4_4_11qd01qd0lb90pcxu.R.inc(80847);checkVertices(set.getVertices(), vertices);
    }finally{__CLR4_4_11qd01qd0lb90pcxu.R.flushNeeded();}}

    @Test
    public void testOppositeHyperplanes() {__CLR4_4_11qd01qd0lb90pcxu.R.globalSliceStart(getClass().getName(),80848);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1igoaxb1qds();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11qd01qd0lb90pcxu.R.rethrow($CLV_t2$);}finally{__CLR4_4_11qd01qd0lb90pcxu.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSetTest.testOppositeHyperplanes",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),80848,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1igoaxb1qds(){try{__CLR4_4_11qd01qd0lb90pcxu.R.inc(80848);
        __CLR4_4_11qd01qd0lb90pcxu.R.inc(80849);Vector2D[][] vertices = new Vector2D[][] {
            new Vector2D[] {
                new Vector2D(1.0, 0.0),
                new Vector2D(2.0, 1.0),
                new Vector2D(3.0, 1.0),
                new Vector2D(2.0, 2.0),
                new Vector2D(1.0, 1.0),
                new Vector2D(0.0, 1.0)
            }
        };
        __CLR4_4_11qd01qd0lb90pcxu.R.inc(80850);PolygonsSet set = buildSet(vertices);
        __CLR4_4_11qd01qd0lb90pcxu.R.inc(80851);checkVertices(set.getVertices(), vertices);
    }finally{__CLR4_4_11qd01qd0lb90pcxu.R.flushNeeded();}}

    @Test
    public void testSingularPoint() {__CLR4_4_11qd01qd0lb90pcxu.R.globalSliceStart(getClass().getName(),80852);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19ne5ke1qdw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11qd01qd0lb90pcxu.R.rethrow($CLV_t2$);}finally{__CLR4_4_11qd01qd0lb90pcxu.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSetTest.testSingularPoint",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),80852,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19ne5ke1qdw(){try{__CLR4_4_11qd01qd0lb90pcxu.R.inc(80852);
        __CLR4_4_11qd01qd0lb90pcxu.R.inc(80853);Vector2D[][] vertices = new Vector2D[][] {
            new Vector2D[] {
                new Vector2D( 0.0,  0.0),
                new Vector2D( 1.0,  0.0),
                new Vector2D( 1.0,  1.0),
                new Vector2D( 0.0,  1.0),
                new Vector2D( 0.0,  0.0),
                new Vector2D(-1.0,  0.0),
                new Vector2D(-1.0, -1.0),
                new Vector2D( 0.0, -1.0)
            }
        };
        __CLR4_4_11qd01qd0lb90pcxu.R.inc(80854);PolygonsSet set = buildSet(vertices);
        __CLR4_4_11qd01qd0lb90pcxu.R.inc(80855);checkVertices(set.getVertices(), vertices);
    }finally{__CLR4_4_11qd01qd0lb90pcxu.R.flushNeeded();}}

    @Test
    public void testLineIntersection() {__CLR4_4_11qd01qd0lb90pcxu.R.globalSliceStart(getClass().getName(),80856);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pdopqi1qe0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11qd01qd0lb90pcxu.R.rethrow($CLV_t2$);}finally{__CLR4_4_11qd01qd0lb90pcxu.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSetTest.testLineIntersection",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),80856,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pdopqi1qe0(){try{__CLR4_4_11qd01qd0lb90pcxu.R.inc(80856);
        __CLR4_4_11qd01qd0lb90pcxu.R.inc(80857);Vector2D[][] vertices = new Vector2D[][] {
            new Vector2D[] {
                new Vector2D( 0.0,  0.0),
                new Vector2D( 2.0,  0.0),
                new Vector2D( 2.0,  1.0),
                new Vector2D( 3.0,  1.0),
                new Vector2D( 3.0,  3.0),
                new Vector2D( 1.0,  3.0),
                new Vector2D( 1.0,  2.0),
                new Vector2D( 0.0,  2.0)
            }
        };
        __CLR4_4_11qd01qd0lb90pcxu.R.inc(80858);PolygonsSet set = buildSet(vertices);

        __CLR4_4_11qd01qd0lb90pcxu.R.inc(80859);Line l1 = new Line(new Vector2D(-1.5, 0.0), FastMath.PI / 4);
        __CLR4_4_11qd01qd0lb90pcxu.R.inc(80860);SubLine s1 = (SubLine) set.intersection(l1.wholeHyperplane());
        __CLR4_4_11qd01qd0lb90pcxu.R.inc(80861);List<Interval> i1 = ((IntervalsSet) s1.getRemainingRegion()).asList();
        __CLR4_4_11qd01qd0lb90pcxu.R.inc(80862);Assert.assertEquals(2, i1.size());
        __CLR4_4_11qd01qd0lb90pcxu.R.inc(80863);Interval v10 = i1.get(0);
        __CLR4_4_11qd01qd0lb90pcxu.R.inc(80864);Vector2D p10Lower = l1.toSpace(new Vector1D(v10.getInf()));
        __CLR4_4_11qd01qd0lb90pcxu.R.inc(80865);Assert.assertEquals(0.0, p10Lower.getX(), 1.0e-10);
        __CLR4_4_11qd01qd0lb90pcxu.R.inc(80866);Assert.assertEquals(1.5, p10Lower.getY(), 1.0e-10);
        __CLR4_4_11qd01qd0lb90pcxu.R.inc(80867);Vector2D p10Upper = l1.toSpace(new Vector1D(v10.getSup()));
        __CLR4_4_11qd01qd0lb90pcxu.R.inc(80868);Assert.assertEquals(0.5, p10Upper.getX(), 1.0e-10);
        __CLR4_4_11qd01qd0lb90pcxu.R.inc(80869);Assert.assertEquals(2.0, p10Upper.getY(), 1.0e-10);
        __CLR4_4_11qd01qd0lb90pcxu.R.inc(80870);Interval v11 = i1.get(1);
        __CLR4_4_11qd01qd0lb90pcxu.R.inc(80871);Vector2D p11Lower = l1.toSpace(new Vector1D(v11.getInf()));
        __CLR4_4_11qd01qd0lb90pcxu.R.inc(80872);Assert.assertEquals(1.0, p11Lower.getX(), 1.0e-10);
        __CLR4_4_11qd01qd0lb90pcxu.R.inc(80873);Assert.assertEquals(2.5, p11Lower.getY(), 1.0e-10);
        __CLR4_4_11qd01qd0lb90pcxu.R.inc(80874);Vector2D p11Upper = l1.toSpace(new Vector1D(v11.getSup()));
        __CLR4_4_11qd01qd0lb90pcxu.R.inc(80875);Assert.assertEquals(1.5, p11Upper.getX(), 1.0e-10);
        __CLR4_4_11qd01qd0lb90pcxu.R.inc(80876);Assert.assertEquals(3.0, p11Upper.getY(), 1.0e-10);

        __CLR4_4_11qd01qd0lb90pcxu.R.inc(80877);Line l2 = new Line(new Vector2D(-1.0, 2.0), 0);
        __CLR4_4_11qd01qd0lb90pcxu.R.inc(80878);SubLine s2 = (SubLine) set.intersection(l2.wholeHyperplane());
        __CLR4_4_11qd01qd0lb90pcxu.R.inc(80879);List<Interval> i2 = ((IntervalsSet) s2.getRemainingRegion()).asList();
        __CLR4_4_11qd01qd0lb90pcxu.R.inc(80880);Assert.assertEquals(1, i2.size());
        __CLR4_4_11qd01qd0lb90pcxu.R.inc(80881);Interval v20 = i2.get(0);
        __CLR4_4_11qd01qd0lb90pcxu.R.inc(80882);Vector2D p20Lower = l2.toSpace(new Vector1D(v20.getInf()));
        __CLR4_4_11qd01qd0lb90pcxu.R.inc(80883);Assert.assertEquals(1.0, p20Lower.getX(), 1.0e-10);
        __CLR4_4_11qd01qd0lb90pcxu.R.inc(80884);Assert.assertEquals(2.0, p20Lower.getY(), 1.0e-10);
        __CLR4_4_11qd01qd0lb90pcxu.R.inc(80885);Vector2D p20Upper = l2.toSpace(new Vector1D(v20.getSup()));
        __CLR4_4_11qd01qd0lb90pcxu.R.inc(80886);Assert.assertEquals(3.0, p20Upper.getX(), 1.0e-10);
        __CLR4_4_11qd01qd0lb90pcxu.R.inc(80887);Assert.assertEquals(2.0, p20Upper.getY(), 1.0e-10);

    }finally{__CLR4_4_11qd01qd0lb90pcxu.R.flushNeeded();}}

    @Test
    public void testUnlimitedSubHyperplane() {__CLR4_4_11qd01qd0lb90pcxu.R.globalSliceStart(getClass().getName(),80888);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xuierc1qew();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11qd01qd0lb90pcxu.R.rethrow($CLV_t2$);}finally{__CLR4_4_11qd01qd0lb90pcxu.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSetTest.testUnlimitedSubHyperplane",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),80888,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xuierc1qew(){try{__CLR4_4_11qd01qd0lb90pcxu.R.inc(80888);
        __CLR4_4_11qd01qd0lb90pcxu.R.inc(80889);Vector2D[][] vertices1 = new Vector2D[][] {
            new Vector2D[] {
                new Vector2D(0.0, 0.0),
                new Vector2D(4.0, 0.0),
                new Vector2D(1.4, 1.5),
                new Vector2D(0.0, 3.5)
            }
        };
        __CLR4_4_11qd01qd0lb90pcxu.R.inc(80890);PolygonsSet set1 = buildSet(vertices1);
        __CLR4_4_11qd01qd0lb90pcxu.R.inc(80891);Vector2D[][] vertices2 = new Vector2D[][] {
            new Vector2D[] {
                new Vector2D(1.4,  0.2),
                new Vector2D(2.8, -1.2),
                new Vector2D(2.5,  0.6)
            }
        };
        __CLR4_4_11qd01qd0lb90pcxu.R.inc(80892);PolygonsSet set2 = buildSet(vertices2);

        __CLR4_4_11qd01qd0lb90pcxu.R.inc(80893);PolygonsSet set =
            (PolygonsSet) new RegionFactory<Euclidean2D>().union(set1.copySelf(),
                                                                 set2.copySelf());
        __CLR4_4_11qd01qd0lb90pcxu.R.inc(80894);checkVertices(set1.getVertices(), vertices1);
        __CLR4_4_11qd01qd0lb90pcxu.R.inc(80895);checkVertices(set2.getVertices(), vertices2);
        __CLR4_4_11qd01qd0lb90pcxu.R.inc(80896);checkVertices(set.getVertices(), new Vector2D[][] {
            new Vector2D[] {
                new Vector2D(0.0,  0.0),
                new Vector2D(1.6,  0.0),
                new Vector2D(2.8, -1.2),
                new Vector2D(2.6,  0.0),
                new Vector2D(4.0,  0.0),
                new Vector2D(1.4,  1.5),
                new Vector2D(0.0,  3.5)
            }
        });

    }finally{__CLR4_4_11qd01qd0lb90pcxu.R.flushNeeded();}}

    @Test
    public void testUnion() {__CLR4_4_11qd01qd0lb90pcxu.R.globalSliceStart(getClass().getName(),80897);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_162z8ck1qf5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11qd01qd0lb90pcxu.R.rethrow($CLV_t2$);}finally{__CLR4_4_11qd01qd0lb90pcxu.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSetTest.testUnion",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),80897,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_162z8ck1qf5(){try{__CLR4_4_11qd01qd0lb90pcxu.R.inc(80897);
        __CLR4_4_11qd01qd0lb90pcxu.R.inc(80898);Vector2D[][] vertices1 = new Vector2D[][] {
            new Vector2D[] {
                new Vector2D( 0.0,  0.0),
                new Vector2D( 2.0,  0.0),
                new Vector2D( 2.0,  2.0),
                new Vector2D( 0.0,  2.0)
            }
        };
        __CLR4_4_11qd01qd0lb90pcxu.R.inc(80899);PolygonsSet set1 = buildSet(vertices1);
        __CLR4_4_11qd01qd0lb90pcxu.R.inc(80900);Vector2D[][] vertices2 = new Vector2D[][] {
            new Vector2D[] {
                new Vector2D( 1.0,  1.0),
                new Vector2D( 3.0,  1.0),
                new Vector2D( 3.0,  3.0),
                new Vector2D( 1.0,  3.0)
            }
        };
        __CLR4_4_11qd01qd0lb90pcxu.R.inc(80901);PolygonsSet set2 = buildSet(vertices2);
        __CLR4_4_11qd01qd0lb90pcxu.R.inc(80902);PolygonsSet set  = (PolygonsSet) new RegionFactory<Euclidean2D>().union(set1.copySelf(),
                                                                                set2.copySelf());
        __CLR4_4_11qd01qd0lb90pcxu.R.inc(80903);checkVertices(set1.getVertices(), vertices1);
        __CLR4_4_11qd01qd0lb90pcxu.R.inc(80904);checkVertices(set2.getVertices(), vertices2);
        __CLR4_4_11qd01qd0lb90pcxu.R.inc(80905);checkVertices(set.getVertices(), new Vector2D[][] {
            new Vector2D[] {
                new Vector2D( 0.0,  0.0),
                new Vector2D( 2.0,  0.0),
                new Vector2D( 2.0,  1.0),
                new Vector2D( 3.0,  1.0),
                new Vector2D( 3.0,  3.0),
                new Vector2D( 1.0,  3.0),
                new Vector2D( 1.0,  2.0),
                new Vector2D( 0.0,  2.0)
            }
        });
        __CLR4_4_11qd01qd0lb90pcxu.R.inc(80906);checkPoints(Region.Location.INSIDE, set, new Vector2D[] {
            new Vector2D(1.0, 1.0),
            new Vector2D(0.5, 0.5),
            new Vector2D(2.0, 2.0),
            new Vector2D(2.5, 2.5),
            new Vector2D(0.5, 1.5),
            new Vector2D(1.5, 1.5),
            new Vector2D(1.5, 0.5),
            new Vector2D(1.5, 2.5),
            new Vector2D(2.5, 1.5),
            new Vector2D(2.5, 2.5)
        });
        __CLR4_4_11qd01qd0lb90pcxu.R.inc(80907);checkPoints(Region.Location.OUTSIDE, set, new Vector2D[] {
            new Vector2D(-0.5, 0.5),
            new Vector2D( 0.5, 2.5),
            new Vector2D( 2.5, 0.5),
            new Vector2D( 3.5, 2.5)
        });
        __CLR4_4_11qd01qd0lb90pcxu.R.inc(80908);checkPoints(Region.Location.BOUNDARY, set, new Vector2D[] {
            new Vector2D(0.0, 0.0),
            new Vector2D(0.5, 2.0),
            new Vector2D(2.0, 0.5),
            new Vector2D(2.5, 1.0),
            new Vector2D(3.0, 2.5)
        });

    }finally{__CLR4_4_11qd01qd0lb90pcxu.R.flushNeeded();}}

    @Test
    public void testIntersection() {__CLR4_4_11qd01qd0lb90pcxu.R.globalSliceStart(getClass().getName(),80909);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16g463i1qfh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11qd01qd0lb90pcxu.R.rethrow($CLV_t2$);}finally{__CLR4_4_11qd01qd0lb90pcxu.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSetTest.testIntersection",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),80909,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16g463i1qfh(){try{__CLR4_4_11qd01qd0lb90pcxu.R.inc(80909);
        __CLR4_4_11qd01qd0lb90pcxu.R.inc(80910);Vector2D[][] vertices1 = new Vector2D[][] {
            new Vector2D[] {
                new Vector2D( 0.0,  0.0),
                new Vector2D( 2.0,  0.0),
                new Vector2D( 2.0,  2.0),
                new Vector2D( 0.0,  2.0)
            }
        };
        __CLR4_4_11qd01qd0lb90pcxu.R.inc(80911);PolygonsSet set1 = buildSet(vertices1);
        __CLR4_4_11qd01qd0lb90pcxu.R.inc(80912);Vector2D[][] vertices2 = new Vector2D[][] {
            new Vector2D[] {
                new Vector2D( 1.0,  1.0),
                new Vector2D( 3.0,  1.0),
                new Vector2D( 3.0,  3.0),
                new Vector2D( 1.0,  3.0)
            }
        };
        __CLR4_4_11qd01qd0lb90pcxu.R.inc(80913);PolygonsSet set2 = buildSet(vertices2);
        __CLR4_4_11qd01qd0lb90pcxu.R.inc(80914);PolygonsSet set  = (PolygonsSet) new RegionFactory<Euclidean2D>().intersection(set1.copySelf(),
                                                                                       set2.copySelf());
        __CLR4_4_11qd01qd0lb90pcxu.R.inc(80915);checkVertices(set1.getVertices(), vertices1);
        __CLR4_4_11qd01qd0lb90pcxu.R.inc(80916);checkVertices(set2.getVertices(), vertices2);
        __CLR4_4_11qd01qd0lb90pcxu.R.inc(80917);checkVertices(set.getVertices(), new Vector2D[][] {
            new Vector2D[] {
                new Vector2D( 1.0,  1.0),
                new Vector2D( 2.0,  1.0),
                new Vector2D( 2.0,  2.0),
                new Vector2D( 1.0,  2.0)
            }
        });
        __CLR4_4_11qd01qd0lb90pcxu.R.inc(80918);checkPoints(Region.Location.INSIDE, set, new Vector2D[] {
            new Vector2D(1.5, 1.5)
        });
        __CLR4_4_11qd01qd0lb90pcxu.R.inc(80919);checkPoints(Region.Location.OUTSIDE, set, new Vector2D[] {
            new Vector2D(0.5, 1.5),
            new Vector2D(2.5, 1.5),
            new Vector2D(1.5, 0.5),
            new Vector2D(0.5, 0.5)
        });
        __CLR4_4_11qd01qd0lb90pcxu.R.inc(80920);checkPoints(Region.Location.BOUNDARY, set, new Vector2D[] {
            new Vector2D(1.0, 1.0),
            new Vector2D(2.0, 2.0),
            new Vector2D(1.0, 1.5),
            new Vector2D(1.5, 2.0)
        });
    }finally{__CLR4_4_11qd01qd0lb90pcxu.R.flushNeeded();}}

    @Test
    public void testXor() {__CLR4_4_11qd01qd0lb90pcxu.R.globalSliceStart(getClass().getName(),80921);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tgmo1qft();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11qd01qd0lb90pcxu.R.rethrow($CLV_t2$);}finally{__CLR4_4_11qd01qd0lb90pcxu.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSetTest.testXor",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),80921,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tgmo1qft(){try{__CLR4_4_11qd01qd0lb90pcxu.R.inc(80921);
        __CLR4_4_11qd01qd0lb90pcxu.R.inc(80922);Vector2D[][] vertices1 = new Vector2D[][] {
            new Vector2D[] {
                new Vector2D( 0.0,  0.0),
                new Vector2D( 2.0,  0.0),
                new Vector2D( 2.0,  2.0),
                new Vector2D( 0.0,  2.0)
            }
        };
        __CLR4_4_11qd01qd0lb90pcxu.R.inc(80923);PolygonsSet set1 = buildSet(vertices1);
        __CLR4_4_11qd01qd0lb90pcxu.R.inc(80924);Vector2D[][] vertices2 = new Vector2D[][] {
            new Vector2D[] {
                new Vector2D( 1.0,  1.0),
                new Vector2D( 3.0,  1.0),
                new Vector2D( 3.0,  3.0),
                new Vector2D( 1.0,  3.0)
            }
        };
        __CLR4_4_11qd01qd0lb90pcxu.R.inc(80925);PolygonsSet set2 = buildSet(vertices2);
        __CLR4_4_11qd01qd0lb90pcxu.R.inc(80926);PolygonsSet set  = (PolygonsSet) new RegionFactory<Euclidean2D>().xor(set1.copySelf(),
                                                                              set2.copySelf());
        __CLR4_4_11qd01qd0lb90pcxu.R.inc(80927);checkVertices(set1.getVertices(), vertices1);
        __CLR4_4_11qd01qd0lb90pcxu.R.inc(80928);checkVertices(set2.getVertices(), vertices2);
        __CLR4_4_11qd01qd0lb90pcxu.R.inc(80929);checkVertices(set.getVertices(), new Vector2D[][] {
            new Vector2D[] {
                new Vector2D( 0.0,  0.0),
                new Vector2D( 2.0,  0.0),
                new Vector2D( 2.0,  1.0),
                new Vector2D( 3.0,  1.0),
                new Vector2D( 3.0,  3.0),
                new Vector2D( 1.0,  3.0),
                new Vector2D( 1.0,  2.0),
                new Vector2D( 0.0,  2.0)
            },
            new Vector2D[] {
                new Vector2D( 1.0,  1.0),
                new Vector2D( 1.0,  2.0),
                new Vector2D( 2.0,  2.0),
                new Vector2D( 2.0,  1.0)
            }
        });
        __CLR4_4_11qd01qd0lb90pcxu.R.inc(80930);checkPoints(Region.Location.INSIDE, set, new Vector2D[] {
            new Vector2D(0.5, 0.5),
            new Vector2D(2.5, 2.5),
            new Vector2D(0.5, 1.5),
            new Vector2D(1.5, 0.5),
            new Vector2D(1.5, 2.5),
            new Vector2D(2.5, 1.5),
            new Vector2D(2.5, 2.5)
        });
        __CLR4_4_11qd01qd0lb90pcxu.R.inc(80931);checkPoints(Region.Location.OUTSIDE, set, new Vector2D[] {
            new Vector2D(-0.5, 0.5),
            new Vector2D( 0.5, 2.5),
            new Vector2D( 2.5, 0.5),
            new Vector2D( 1.5, 1.5),
            new Vector2D( 3.5, 2.5)
        });
        __CLR4_4_11qd01qd0lb90pcxu.R.inc(80932);checkPoints(Region.Location.BOUNDARY, set, new Vector2D[] {
            new Vector2D(1.0, 1.0),
            new Vector2D(2.0, 2.0),
            new Vector2D(1.5, 1.0),
            new Vector2D(2.0, 1.5),
            new Vector2D(0.0, 0.0),
            new Vector2D(0.5, 2.0),
            new Vector2D(2.0, 0.5),
            new Vector2D(2.5, 1.0),
            new Vector2D(3.0, 2.5)
        });
    }finally{__CLR4_4_11qd01qd0lb90pcxu.R.flushNeeded();}}

    @Test
    public void testDifference() {__CLR4_4_11qd01qd0lb90pcxu.R.globalSliceStart(getClass().getName(),80933);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f52keu1qg5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11qd01qd0lb90pcxu.R.rethrow($CLV_t2$);}finally{__CLR4_4_11qd01qd0lb90pcxu.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSetTest.testDifference",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),80933,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f52keu1qg5(){try{__CLR4_4_11qd01qd0lb90pcxu.R.inc(80933);
        __CLR4_4_11qd01qd0lb90pcxu.R.inc(80934);Vector2D[][] vertices1 = new Vector2D[][] {
            new Vector2D[] {
                new Vector2D( 0.0,  0.0),
                new Vector2D( 2.0,  0.0),
                new Vector2D( 2.0,  2.0),
                new Vector2D( 0.0,  2.0)
            }
        };
        __CLR4_4_11qd01qd0lb90pcxu.R.inc(80935);PolygonsSet set1 = buildSet(vertices1);
        __CLR4_4_11qd01qd0lb90pcxu.R.inc(80936);Vector2D[][] vertices2 = new Vector2D[][] {
            new Vector2D[] {
                new Vector2D( 1.0,  1.0),
                new Vector2D( 3.0,  1.0),
                new Vector2D( 3.0,  3.0),
                new Vector2D( 1.0,  3.0)
            }
        };
        __CLR4_4_11qd01qd0lb90pcxu.R.inc(80937);PolygonsSet set2 = buildSet(vertices2);
        __CLR4_4_11qd01qd0lb90pcxu.R.inc(80938);PolygonsSet set  = (PolygonsSet) new RegionFactory<Euclidean2D>().difference(set1.copySelf(),
                                                                                     set2.copySelf());
        __CLR4_4_11qd01qd0lb90pcxu.R.inc(80939);checkVertices(set1.getVertices(), vertices1);
        __CLR4_4_11qd01qd0lb90pcxu.R.inc(80940);checkVertices(set2.getVertices(), vertices2);
        __CLR4_4_11qd01qd0lb90pcxu.R.inc(80941);checkVertices(set.getVertices(), new Vector2D[][] {
            new Vector2D[] {
                new Vector2D( 0.0,  0.0),
                new Vector2D( 2.0,  0.0),
                new Vector2D( 2.0,  1.0),
                new Vector2D( 1.0,  1.0),
                new Vector2D( 1.0,  2.0),
                new Vector2D( 0.0,  2.0)
            }
        });
        __CLR4_4_11qd01qd0lb90pcxu.R.inc(80942);checkPoints(Region.Location.INSIDE, set, new Vector2D[] {
            new Vector2D(0.5, 0.5),
            new Vector2D(0.5, 1.5),
            new Vector2D(1.5, 0.5)
        });
        __CLR4_4_11qd01qd0lb90pcxu.R.inc(80943);checkPoints(Region.Location.OUTSIDE, set, new Vector2D[] {
            new Vector2D( 2.5, 2.5),
            new Vector2D(-0.5, 0.5),
            new Vector2D( 0.5, 2.5),
            new Vector2D( 2.5, 0.5),
            new Vector2D( 1.5, 1.5),
            new Vector2D( 3.5, 2.5),
            new Vector2D( 1.5, 2.5),
            new Vector2D( 2.5, 1.5),
            new Vector2D( 2.0, 1.5),
            new Vector2D( 2.0, 2.0),
            new Vector2D( 2.5, 1.0),
            new Vector2D( 2.5, 2.5),
            new Vector2D( 3.0, 2.5)
        });
        __CLR4_4_11qd01qd0lb90pcxu.R.inc(80944);checkPoints(Region.Location.BOUNDARY, set, new Vector2D[] {
            new Vector2D(1.0, 1.0),
            new Vector2D(1.5, 1.0),
            new Vector2D(0.0, 0.0),
            new Vector2D(0.5, 2.0),
            new Vector2D(2.0, 0.5)
        });
    }finally{__CLR4_4_11qd01qd0lb90pcxu.R.flushNeeded();}}

    @Test
    public void testEmptyDifference() {__CLR4_4_11qd01qd0lb90pcxu.R.globalSliceStart(getClass().getName(),80945);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1zaoegx1qgh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11qd01qd0lb90pcxu.R.rethrow($CLV_t2$);}finally{__CLR4_4_11qd01qd0lb90pcxu.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSetTest.testEmptyDifference",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),80945,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1zaoegx1qgh(){try{__CLR4_4_11qd01qd0lb90pcxu.R.inc(80945);
        __CLR4_4_11qd01qd0lb90pcxu.R.inc(80946);Vector2D[][] vertices1 = new Vector2D[][] {
            new Vector2D[] {
                new Vector2D( 0.5, 3.5),
                new Vector2D( 0.5, 4.5),
                new Vector2D(-0.5, 4.5),
                new Vector2D(-0.5, 3.5)
            }
        };
        __CLR4_4_11qd01qd0lb90pcxu.R.inc(80947);PolygonsSet set1 = buildSet(vertices1);
        __CLR4_4_11qd01qd0lb90pcxu.R.inc(80948);Vector2D[][] vertices2 = new Vector2D[][] {
            new Vector2D[] {
                new Vector2D( 1.0, 2.0),
                new Vector2D( 1.0, 8.0),
                new Vector2D(-1.0, 8.0),
                new Vector2D(-1.0, 2.0)
            }
        };
        __CLR4_4_11qd01qd0lb90pcxu.R.inc(80949);PolygonsSet set2 = buildSet(vertices2);
        __CLR4_4_11qd01qd0lb90pcxu.R.inc(80950);Assert.assertTrue(new RegionFactory<Euclidean2D>().difference(set1.copySelf(), set2.copySelf()).isEmpty());
    }finally{__CLR4_4_11qd01qd0lb90pcxu.R.flushNeeded();}}

    @Test
    public void testChoppedHexagon() {__CLR4_4_11qd01qd0lb90pcxu.R.globalSliceStart(getClass().getName(),80951);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hauxv41qgn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11qd01qd0lb90pcxu.R.rethrow($CLV_t2$);}finally{__CLR4_4_11qd01qd0lb90pcxu.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSetTest.testChoppedHexagon",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),80951,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hauxv41qgn(){try{__CLR4_4_11qd01qd0lb90pcxu.R.inc(80951);
        __CLR4_4_11qd01qd0lb90pcxu.R.inc(80952);double pi6   = FastMath.PI / 6.0;
        __CLR4_4_11qd01qd0lb90pcxu.R.inc(80953);double sqrt3 = FastMath.sqrt(3.0);
        __CLR4_4_11qd01qd0lb90pcxu.R.inc(80954);SubLine[] hyp = {
            new Line(new Vector2D(   0.0, 1.0),  5 * pi6).wholeHyperplane(),
            new Line(new Vector2D(-sqrt3, 1.0),  7 * pi6).wholeHyperplane(),
            new Line(new Vector2D(-sqrt3, 1.0),  9 * pi6).wholeHyperplane(),
            new Line(new Vector2D(-sqrt3, 0.0), 11 * pi6).wholeHyperplane(),
            new Line(new Vector2D(   0.0, 0.0), 13 * pi6).wholeHyperplane(),
            new Line(new Vector2D(   0.0, 1.0),  3 * pi6).wholeHyperplane(),
            new Line(new Vector2D(-5.0 * sqrt3 / 6.0, 0.0), 9 * pi6).wholeHyperplane()
        };
        __CLR4_4_11qd01qd0lb90pcxu.R.inc(80955);hyp[1] = (SubLine) hyp[1].split(hyp[0].getHyperplane()).getMinus();
        __CLR4_4_11qd01qd0lb90pcxu.R.inc(80956);hyp[2] = (SubLine) hyp[2].split(hyp[1].getHyperplane()).getMinus();
        __CLR4_4_11qd01qd0lb90pcxu.R.inc(80957);hyp[3] = (SubLine) hyp[3].split(hyp[2].getHyperplane()).getMinus();
        __CLR4_4_11qd01qd0lb90pcxu.R.inc(80958);hyp[4] = (SubLine) hyp[4].split(hyp[3].getHyperplane()).getMinus().split(hyp[0].getHyperplane()).getMinus();
        __CLR4_4_11qd01qd0lb90pcxu.R.inc(80959);hyp[5] = (SubLine) hyp[5].split(hyp[4].getHyperplane()).getMinus().split(hyp[0].getHyperplane()).getMinus();
        __CLR4_4_11qd01qd0lb90pcxu.R.inc(80960);hyp[6] = (SubLine) hyp[6].split(hyp[3].getHyperplane()).getMinus().split(hyp[1].getHyperplane()).getMinus();
        __CLR4_4_11qd01qd0lb90pcxu.R.inc(80961);BSPTree<Euclidean2D> tree = new BSPTree<Euclidean2D>(Boolean.TRUE);
        __CLR4_4_11qd01qd0lb90pcxu.R.inc(80962);for (int i = hyp.length - 1; (((i >= 0)&&(__CLR4_4_11qd01qd0lb90pcxu.R.iget(80963)!=0|true))||(__CLR4_4_11qd01qd0lb90pcxu.R.iget(80964)==0&false)); --i) {{
            __CLR4_4_11qd01qd0lb90pcxu.R.inc(80965);tree = new BSPTree<Euclidean2D>(hyp[i], new BSPTree<Euclidean2D>(Boolean.FALSE), tree, null);
        }
        }__CLR4_4_11qd01qd0lb90pcxu.R.inc(80966);PolygonsSet set = new PolygonsSet(tree);
        __CLR4_4_11qd01qd0lb90pcxu.R.inc(80967);SubLine splitter =
            new Line(new Vector2D(-2.0 * sqrt3 / 3.0, 0.0), 9 * pi6).wholeHyperplane();
        __CLR4_4_11qd01qd0lb90pcxu.R.inc(80968);PolygonsSet slice =
            new PolygonsSet(new BSPTree<Euclidean2D>(splitter,
                                                     set.getTree(false).split(splitter).getPlus(),
                                                     new BSPTree<Euclidean2D>(Boolean.FALSE), null));
        __CLR4_4_11qd01qd0lb90pcxu.R.inc(80969);Assert.assertEquals(Region.Location.OUTSIDE,
                            slice.checkPoint(new Vector2D(0.1, 0.5)));
        __CLR4_4_11qd01qd0lb90pcxu.R.inc(80970);Assert.assertEquals(11.0 / 3.0, slice.getBoundarySize(), 1.0e-10);

    }finally{__CLR4_4_11qd01qd0lb90pcxu.R.flushNeeded();}}

    @Test
    public void testConcentric() {__CLR4_4_11qd01qd0lb90pcxu.R.globalSliceStart(getClass().getName(),80971);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rbb82j1qh7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11qd01qd0lb90pcxu.R.rethrow($CLV_t2$);}finally{__CLR4_4_11qd01qd0lb90pcxu.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSetTest.testConcentric",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),80971,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rbb82j1qh7(){try{__CLR4_4_11qd01qd0lb90pcxu.R.inc(80971);
        __CLR4_4_11qd01qd0lb90pcxu.R.inc(80972);double h = FastMath.sqrt(3.0) / 2.0;
        __CLR4_4_11qd01qd0lb90pcxu.R.inc(80973);Vector2D[][] vertices1 = new Vector2D[][] {
            new Vector2D[] {
                new Vector2D( 0.00, 0.1 * h),
                new Vector2D( 0.05, 0.1 * h),
                new Vector2D( 0.10, 0.2 * h),
                new Vector2D( 0.05, 0.3 * h),
                new Vector2D(-0.05, 0.3 * h),
                new Vector2D(-0.10, 0.2 * h),
                new Vector2D(-0.05, 0.1 * h)
            }
        };
        __CLR4_4_11qd01qd0lb90pcxu.R.inc(80974);PolygonsSet set1 = buildSet(vertices1);
        __CLR4_4_11qd01qd0lb90pcxu.R.inc(80975);Vector2D[][] vertices2 = new Vector2D[][] {
            new Vector2D[] {
                new Vector2D( 0.00, 0.0 * h),
                new Vector2D( 0.10, 0.0 * h),
                new Vector2D( 0.20, 0.2 * h),
                new Vector2D( 0.10, 0.4 * h),
                new Vector2D(-0.10, 0.4 * h),
                new Vector2D(-0.20, 0.2 * h),
                new Vector2D(-0.10, 0.0 * h)
            }
        };
        __CLR4_4_11qd01qd0lb90pcxu.R.inc(80976);PolygonsSet set2 = buildSet(vertices2);
        __CLR4_4_11qd01qd0lb90pcxu.R.inc(80977);Assert.assertTrue(set2.contains(set1));
    }finally{__CLR4_4_11qd01qd0lb90pcxu.R.flushNeeded();}}

    @Test
    public void testBug20040520() {__CLR4_4_11qd01qd0lb90pcxu.R.globalSliceStart(getClass().getName(),80978);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dash8y1qhe();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11qd01qd0lb90pcxu.R.rethrow($CLV_t2$);}finally{__CLR4_4_11qd01qd0lb90pcxu.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSetTest.testBug20040520",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),80978,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dash8y1qhe(){try{__CLR4_4_11qd01qd0lb90pcxu.R.inc(80978);
        __CLR4_4_11qd01qd0lb90pcxu.R.inc(80979);BSPTree<Euclidean2D> a0 =
            new BSPTree<Euclidean2D>(buildSegment(new Vector2D(0.85, -0.05),
                                                  new Vector2D(0.90, -0.10)),
                                                  new BSPTree<Euclidean2D>(Boolean.FALSE),
                                                  new BSPTree<Euclidean2D>(Boolean.TRUE),
                                                  null);
        __CLR4_4_11qd01qd0lb90pcxu.R.inc(80980);BSPTree<Euclidean2D> a1 =
            new BSPTree<Euclidean2D>(buildSegment(new Vector2D(0.85, -0.10),
                                                  new Vector2D(0.90, -0.10)),
                                                  new BSPTree<Euclidean2D>(Boolean.FALSE), a0, null);
        __CLR4_4_11qd01qd0lb90pcxu.R.inc(80981);BSPTree<Euclidean2D> a2 =
            new BSPTree<Euclidean2D>(buildSegment(new Vector2D(0.90, -0.05),
                                                  new Vector2D(0.85, -0.05)),
                                                  new BSPTree<Euclidean2D>(Boolean.FALSE), a1, null);
        __CLR4_4_11qd01qd0lb90pcxu.R.inc(80982);BSPTree<Euclidean2D> a3 =
            new BSPTree<Euclidean2D>(buildSegment(new Vector2D(0.82, -0.05),
                                                  new Vector2D(0.82, -0.08)),
                                                  new BSPTree<Euclidean2D>(Boolean.FALSE),
                                                  new BSPTree<Euclidean2D>(Boolean.TRUE),
                                                  null);
        __CLR4_4_11qd01qd0lb90pcxu.R.inc(80983);BSPTree<Euclidean2D> a4 =
            new BSPTree<Euclidean2D>(buildHalfLine(new Vector2D(0.85, -0.05),
                                                   new Vector2D(0.80, -0.05),
                                                   false),
                                                   new BSPTree<Euclidean2D>(Boolean.FALSE), a3, null);
        __CLR4_4_11qd01qd0lb90pcxu.R.inc(80984);BSPTree<Euclidean2D> a5 =
            new BSPTree<Euclidean2D>(buildSegment(new Vector2D(0.82, -0.08),
                                                  new Vector2D(0.82, -0.18)),
                                                  new BSPTree<Euclidean2D>(Boolean.FALSE),
                                                  new BSPTree<Euclidean2D>(Boolean.TRUE),
                                                  null);
        __CLR4_4_11qd01qd0lb90pcxu.R.inc(80985);BSPTree<Euclidean2D> a6 =
            new BSPTree<Euclidean2D>(buildHalfLine(new Vector2D(0.82, -0.18),
                                                   new Vector2D(0.85, -0.15),
                                                   true),
                                                   new BSPTree<Euclidean2D>(Boolean.FALSE), a5, null);
        __CLR4_4_11qd01qd0lb90pcxu.R.inc(80986);BSPTree<Euclidean2D> a7 =
            new BSPTree<Euclidean2D>(buildHalfLine(new Vector2D(0.85, -0.05),
                                                   new Vector2D(0.82, -0.08),
                                                   false),
                                                   a4, a6, null);
        __CLR4_4_11qd01qd0lb90pcxu.R.inc(80987);BSPTree<Euclidean2D> a8 =
            new BSPTree<Euclidean2D>(buildLine(new Vector2D(0.85, -0.25),
                                               new Vector2D(0.85,  0.05)),
                                               a2, a7, null);
        __CLR4_4_11qd01qd0lb90pcxu.R.inc(80988);BSPTree<Euclidean2D> a9 =
            new BSPTree<Euclidean2D>(buildLine(new Vector2D(0.90,  0.05),
                                               new Vector2D(0.90, -0.50)),
                                               a8, new BSPTree<Euclidean2D>(Boolean.FALSE), null);

        __CLR4_4_11qd01qd0lb90pcxu.R.inc(80989);BSPTree<Euclidean2D> b0 =
            new BSPTree<Euclidean2D>(buildSegment(new Vector2D(0.92, -0.12),
                                                  new Vector2D(0.92, -0.08)),
                                                  new BSPTree<Euclidean2D>(Boolean.FALSE), new BSPTree<Euclidean2D>(Boolean.TRUE),
                                                  null);
        __CLR4_4_11qd01qd0lb90pcxu.R.inc(80990);BSPTree<Euclidean2D> b1 =
            new BSPTree<Euclidean2D>(buildHalfLine(new Vector2D(0.92, -0.08),
                                                   new Vector2D(0.90, -0.10),
                                                   true),
                                                   new BSPTree<Euclidean2D>(Boolean.FALSE), b0, null);
        __CLR4_4_11qd01qd0lb90pcxu.R.inc(80991);BSPTree<Euclidean2D> b2 =
            new BSPTree<Euclidean2D>(buildSegment(new Vector2D(0.92, -0.18),
                                                  new Vector2D(0.92, -0.12)),
                                                  new BSPTree<Euclidean2D>(Boolean.FALSE), new BSPTree<Euclidean2D>(Boolean.TRUE),
                                                  null);
        __CLR4_4_11qd01qd0lb90pcxu.R.inc(80992);BSPTree<Euclidean2D> b3 =
            new BSPTree<Euclidean2D>(buildSegment(new Vector2D(0.85, -0.15),
                                                  new Vector2D(0.90, -0.20)),
                                                  new BSPTree<Euclidean2D>(Boolean.FALSE), b2, null);
        __CLR4_4_11qd01qd0lb90pcxu.R.inc(80993);BSPTree<Euclidean2D> b4 =
            new BSPTree<Euclidean2D>(buildSegment(new Vector2D(0.95, -0.15),
                                                  new Vector2D(0.85, -0.05)),
                                                  b1, b3, null);
        __CLR4_4_11qd01qd0lb90pcxu.R.inc(80994);BSPTree<Euclidean2D> b5 =
            new BSPTree<Euclidean2D>(buildHalfLine(new Vector2D(0.85, -0.05),
                                                   new Vector2D(0.85, -0.25),
                                                   true),
                                                   new BSPTree<Euclidean2D>(Boolean.FALSE), b4, null);
        __CLR4_4_11qd01qd0lb90pcxu.R.inc(80995);BSPTree<Euclidean2D> b6 =
            new BSPTree<Euclidean2D>(buildLine(new Vector2D(0.0, -1.10),
                                               new Vector2D(1.0, -0.10)),
                                               new BSPTree<Euclidean2D>(Boolean.FALSE), b5, null);

        __CLR4_4_11qd01qd0lb90pcxu.R.inc(80996);PolygonsSet c =
            (PolygonsSet) new RegionFactory<Euclidean2D>().union(new PolygonsSet(a9),
                                                                 new PolygonsSet(b6));

        __CLR4_4_11qd01qd0lb90pcxu.R.inc(80997);checkPoints(Region.Location.INSIDE, c, new Vector2D[] {
            new Vector2D(0.83, -0.06),
            new Vector2D(0.83, -0.15),
            new Vector2D(0.88, -0.15),
            new Vector2D(0.88, -0.09),
            new Vector2D(0.88, -0.07),
            new Vector2D(0.91, -0.18),
            new Vector2D(0.91, -0.10)
        });

        __CLR4_4_11qd01qd0lb90pcxu.R.inc(80998);checkPoints(Region.Location.OUTSIDE, c, new Vector2D[] {
            new Vector2D(0.80, -0.10),
            new Vector2D(0.83, -0.50),
            new Vector2D(0.83, -0.20),
            new Vector2D(0.83, -0.02),
            new Vector2D(0.87, -0.50),
            new Vector2D(0.87, -0.20),
            new Vector2D(0.87, -0.02),
            new Vector2D(0.91, -0.20),
            new Vector2D(0.91, -0.08),
            new Vector2D(0.93, -0.15)
        });

        __CLR4_4_11qd01qd0lb90pcxu.R.inc(80999);checkVertices(c.getVertices(),
                      new Vector2D[][] {
            new Vector2D[] {
                new Vector2D(0.85, -0.15),
                new Vector2D(0.90, -0.20),
                new Vector2D(0.92, -0.18),
                new Vector2D(0.92, -0.08),
                new Vector2D(0.90, -0.10),
                new Vector2D(0.90, -0.05),
                new Vector2D(0.82, -0.05),
                new Vector2D(0.82, -0.18),
            }
        });

    }finally{__CLR4_4_11qd01qd0lb90pcxu.R.flushNeeded();}}

    @Test
    public void testBug20041003() {__CLR4_4_11qd01qd0lb90pcxu.R.globalSliceStart(getClass().getName(),81000);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nkjrjh1qi0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11qd01qd0lb90pcxu.R.rethrow($CLV_t2$);}finally{__CLR4_4_11qd01qd0lb90pcxu.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSetTest.testBug20041003",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),81000,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nkjrjh1qi0(){try{__CLR4_4_11qd01qd0lb90pcxu.R.inc(81000);

        __CLR4_4_11qd01qd0lb90pcxu.R.inc(81001);Line[] l = {
            new Line(new Vector2D(0.0, 0.625000007541172),
                     new Vector2D(1.0, 0.625000007541172)),
                     new Line(new Vector2D(-0.19204433621902645, 0.0),
                              new Vector2D(-0.19204433621902645, 1.0)),
                              new Line(new Vector2D(-0.40303524786887,  0.4248364535319128),
                                       new Vector2D(-1.12851149797877, -0.2634107480798909)),
                                       new Line(new Vector2D(0.0, 2.0),
                                                new Vector2D(1.0, 2.0))
        };

        __CLR4_4_11qd01qd0lb90pcxu.R.inc(81002);BSPTree<Euclidean2D> node1 =
            new BSPTree<Euclidean2D>(new SubLine(l[0],
                                          new IntervalsSet(intersectionAbscissa(l[0], l[1]),
                                                           intersectionAbscissa(l[0], l[2]))),
                                                           new BSPTree<Euclidean2D>(Boolean.TRUE), new BSPTree<Euclidean2D>(Boolean.FALSE),
                                                           null);
        __CLR4_4_11qd01qd0lb90pcxu.R.inc(81003);BSPTree<Euclidean2D> node2 =
            new BSPTree<Euclidean2D>(new SubLine(l[1],
                                          new IntervalsSet(intersectionAbscissa(l[1], l[2]),
                                                           intersectionAbscissa(l[1], l[3]))),
                                                           node1, new BSPTree<Euclidean2D>(Boolean.FALSE), null);
        __CLR4_4_11qd01qd0lb90pcxu.R.inc(81004);BSPTree<Euclidean2D> node3 =
            new BSPTree<Euclidean2D>(new SubLine(l[2],
                                          new IntervalsSet(intersectionAbscissa(l[2], l[3]),
                                                           Double.POSITIVE_INFINITY)),
                                                           node2, new BSPTree<Euclidean2D>(Boolean.FALSE), null);
        __CLR4_4_11qd01qd0lb90pcxu.R.inc(81005);BSPTree<Euclidean2D> node4 =
            new BSPTree<Euclidean2D>(l[3].wholeHyperplane(), node3, new BSPTree<Euclidean2D>(Boolean.FALSE), null);

        __CLR4_4_11qd01qd0lb90pcxu.R.inc(81006);PolygonsSet set = new PolygonsSet(node4);
        __CLR4_4_11qd01qd0lb90pcxu.R.inc(81007);Assert.assertEquals(0, set.getVertices().length);

    }finally{__CLR4_4_11qd01qd0lb90pcxu.R.flushNeeded();}}

    @Test
    public void testSqueezedHexa() {__CLR4_4_11qd01qd0lb90pcxu.R.globalSliceStart(getClass().getName(),81008);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gd5c011qi8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11qd01qd0lb90pcxu.R.rethrow($CLV_t2$);}finally{__CLR4_4_11qd01qd0lb90pcxu.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSetTest.testSqueezedHexa",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),81008,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gd5c011qi8(){try{__CLR4_4_11qd01qd0lb90pcxu.R.inc(81008);
        __CLR4_4_11qd01qd0lb90pcxu.R.inc(81009);PolygonsSet set = new PolygonsSet(1.0e-10,
                                          new Vector2D(-6, -4), new Vector2D(-8, -8), new Vector2D(  8, -8),
                                          new Vector2D( 6, -4), new Vector2D(10,  4), new Vector2D(-10,  4));
        __CLR4_4_11qd01qd0lb90pcxu.R.inc(81010);Assert.assertEquals(Location.OUTSIDE, set.checkPoint(new Vector2D(0, 6)));
    }finally{__CLR4_4_11qd01qd0lb90pcxu.R.flushNeeded();}}

    @Test
    public void testIssue880Simplified() {__CLR4_4_11qd01qd0lb90pcxu.R.globalSliceStart(getClass().getName(),81011);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_165uc6w1qib();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11qd01qd0lb90pcxu.R.rethrow($CLV_t2$);}finally{__CLR4_4_11qd01qd0lb90pcxu.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSetTest.testIssue880Simplified",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),81011,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_165uc6w1qib(){try{__CLR4_4_11qd01qd0lb90pcxu.R.inc(81011);

        __CLR4_4_11qd01qd0lb90pcxu.R.inc(81012);Vector2D[] vertices1 = new Vector2D[] {
            new Vector2D( 90.13595870833188,  38.33604606376991),
            new Vector2D( 90.14047850603913,  38.34600084496253),
            new Vector2D( 90.11045289492762,  38.36801537312368),
            new Vector2D( 90.10871471476526,  38.36878044144294),
            new Vector2D( 90.10424901707671,  38.374300101757),
            new Vector2D( 90.0979455456843,   38.373578376172475),
            new Vector2D( 90.09081227075944,  38.37526295920463),
            new Vector2D( 90.09081378927135,  38.375193883266434)
        };
        __CLR4_4_11qd01qd0lb90pcxu.R.inc(81013);PolygonsSet set1 = new PolygonsSet(1.0e-10, vertices1);
        __CLR4_4_11qd01qd0lb90pcxu.R.inc(81014);Assert.assertEquals(Location.OUTSIDE, set1.checkPoint(new Vector2D(90.12,  38.32)));
        __CLR4_4_11qd01qd0lb90pcxu.R.inc(81015);Assert.assertEquals(Location.OUTSIDE, set1.checkPoint(new Vector2D(90.135, 38.355)));

    }finally{__CLR4_4_11qd01qd0lb90pcxu.R.flushNeeded();}}

    @Test
    public void testIssue880Complete() {__CLR4_4_11qd01qd0lb90pcxu.R.globalSliceStart(getClass().getName(),81016);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cxahmx1qig();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11qd01qd0lb90pcxu.R.rethrow($CLV_t2$);}finally{__CLR4_4_11qd01qd0lb90pcxu.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSetTest.testIssue880Complete",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),81016,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cxahmx1qig(){try{__CLR4_4_11qd01qd0lb90pcxu.R.inc(81016);
        __CLR4_4_11qd01qd0lb90pcxu.R.inc(81017);Vector2D[] vertices1 = new Vector2D[] {
                new Vector2D( 90.08714908223715,  38.370299337260235),
                new Vector2D( 90.08709517675004,  38.3702895991413),
                new Vector2D( 90.08401538704919,  38.368849330127944),
                new Vector2D( 90.08258210430711,  38.367634558585564),
                new Vector2D( 90.08251455106665,  38.36763409247078),
                new Vector2D( 90.08106599752608,  38.36761621664249),
                new Vector2D( 90.08249585300035,  38.36753627557965),
                new Vector2D( 90.09075743352184,  38.35914647644972),
                new Vector2D( 90.09099945896571,  38.35896264724079),
                new Vector2D( 90.09269383800086,  38.34595756121246),
                new Vector2D( 90.09638631543191,  38.3457988093121),
                new Vector2D( 90.09666417351019,  38.34523360999418),
                new Vector2D( 90.1297082145872,  38.337670454923625),
                new Vector2D( 90.12971687748956,  38.337669827794684),
                new Vector2D( 90.1240820219179,  38.34328502001131),
                new Vector2D( 90.13084259656404,  38.34017811765017),
                new Vector2D( 90.13378567942857,  38.33860579180606),
                new Vector2D( 90.13519557833206,  38.33621054663689),
                new Vector2D( 90.13545616732307,  38.33614965452864),
                new Vector2D( 90.13553111202748,  38.33613962818305),
                new Vector2D( 90.1356903436448,  38.33610227127048),
                new Vector2D( 90.13576283227428,  38.33609255422783),
                new Vector2D( 90.13595870833188,  38.33604606376991),
                new Vector2D( 90.1361556630693,  38.3360024198866),
                new Vector2D( 90.13622408795709,  38.335987048115726),
                new Vector2D( 90.13696189099994,  38.33581914328681),
                new Vector2D( 90.13746655304897,  38.33616706665265),
                new Vector2D( 90.13845973716064,  38.33650776167099),
                new Vector2D( 90.13950901827667,  38.3368469456463),
                new Vector2D( 90.14393814424852,  38.337591835857495),
                new Vector2D( 90.14483839716831,  38.337076122362475),
                new Vector2D( 90.14565474433601,  38.33769000964429),
                new Vector2D( 90.14569421179482,  38.3377117256905),
                new Vector2D( 90.14577067124333,  38.33770883625908),
                new Vector2D( 90.14600350631684,  38.337714326520995),
                new Vector2D( 90.14600355139731,  38.33771435193319),
                new Vector2D( 90.14600369112401,  38.33771443882085),
                new Vector2D( 90.14600382486884,  38.33771453466096),
                new Vector2D( 90.14600395205912,  38.33771463904344),
                new Vector2D( 90.14600407214999,  38.337714751520764),
                new Vector2D( 90.14600418462749,  38.337714871611695),
                new Vector2D( 90.14600422249327,  38.337714915811034),
                new Vector2D( 90.14867838361471,  38.34113888210675),
                new Vector2D( 90.14923750157374,  38.341582537502575),
                new Vector2D( 90.14877083250991,  38.34160685841391),
                new Vector2D( 90.14816667319519,  38.34244232585684),
                new Vector2D( 90.14797696744586,  38.34248455284745),
                new Vector2D( 90.14484318014337,  38.34385573215269),
                new Vector2D( 90.14477919958296,  38.3453797747614),
                new Vector2D( 90.14202393306448,  38.34464324839456),
                new Vector2D( 90.14198920640195,  38.344651155237216),
                new Vector2D( 90.14155207025175,  38.34486424263724),
                new Vector2D( 90.1415196143314,  38.344871730519),
                new Vector2D( 90.14128611910814,  38.34500196593859),
                new Vector2D( 90.14047850603913,  38.34600084496253),
                new Vector2D( 90.14045907000337,  38.34601860032171),
                new Vector2D( 90.14039496493928,  38.346223030432384),
                new Vector2D( 90.14037626063737,  38.346240203360026),
                new Vector2D( 90.14030005823724,  38.34646920000705),
                new Vector2D( 90.13799164754806,  38.34903093011013),
                new Vector2D( 90.11045289492762,  38.36801537312368),
                new Vector2D( 90.10871471476526,  38.36878044144294),
                new Vector2D( 90.10424901707671,  38.374300101757),
                new Vector2D( 90.10263482039932,  38.37310041316073),
                new Vector2D( 90.09834601753448,  38.373615053823414),
                new Vector2D( 90.0979455456843,  38.373578376172475),
                new Vector2D( 90.09086514328669,  38.37527884194668),
                new Vector2D( 90.09084931407364,  38.37590801712463),
                new Vector2D( 90.09081227075944,  38.37526295920463),
                new Vector2D( 90.09081378927135,  38.375193883266434)
        };
        __CLR4_4_11qd01qd0lb90pcxu.R.inc(81018);PolygonsSet set1 = new PolygonsSet(1.0e-8, vertices1);
        __CLR4_4_11qd01qd0lb90pcxu.R.inc(81019);Assert.assertEquals(Location.OUTSIDE, set1.checkPoint(new Vector2D(90.0905,  38.3755)));
        __CLR4_4_11qd01qd0lb90pcxu.R.inc(81020);Assert.assertEquals(Location.INSIDE,  set1.checkPoint(new Vector2D(90.09084, 38.3755)));
        __CLR4_4_11qd01qd0lb90pcxu.R.inc(81021);Assert.assertEquals(Location.OUTSIDE, set1.checkPoint(new Vector2D(90.0913,  38.3755)));
        __CLR4_4_11qd01qd0lb90pcxu.R.inc(81022);Assert.assertEquals(Location.INSIDE,  set1.checkPoint(new Vector2D(90.1042,  38.3739)));
        __CLR4_4_11qd01qd0lb90pcxu.R.inc(81023);Assert.assertEquals(Location.INSIDE,  set1.checkPoint(new Vector2D(90.1111,  38.3673)));
        __CLR4_4_11qd01qd0lb90pcxu.R.inc(81024);Assert.assertEquals(Location.OUTSIDE, set1.checkPoint(new Vector2D(90.0959,  38.3457)));

        __CLR4_4_11qd01qd0lb90pcxu.R.inc(81025);Vector2D[] vertices2 = new Vector2D[] {
                new Vector2D( 90.13067558880044,  38.36977255037573),
                new Vector2D( 90.12907570488,  38.36817308242706),
                new Vector2D( 90.1342774136516,  38.356886880294724),
                new Vector2D( 90.13090330629757,  38.34664392676211),
                new Vector2D( 90.13078571364593,  38.344904617518466),
                new Vector2D( 90.1315602208914,  38.3447185040846),
                new Vector2D( 90.1316336226821,  38.34470643148342),
                new Vector2D( 90.134020944832,  38.340936644972885),
                new Vector2D( 90.13912536387306,  38.335497255122334),
                new Vector2D( 90.1396178806582,  38.334878075552126),
                new Vector2D( 90.14083049696671,  38.33316530644106),
                new Vector2D( 90.14145252901329,  38.33152722916191),
                new Vector2D( 90.1404779335565,  38.32863516047786),
                new Vector2D( 90.14282712131586,  38.327504432532066),
                new Vector2D( 90.14616669875488,  38.3237354115015),
                new Vector2D( 90.14860976050608,  38.315714862457924),
                new Vector2D( 90.14999277782437,  38.3164932507504),
                new Vector2D( 90.15005207194997,  38.316534677663356),
                new Vector2D( 90.15508513859612,  38.31878731691609),
                new Vector2D( 90.15919938519221,  38.31852743183782),
                new Vector2D( 90.16093758658837,  38.31880662005153),
                new Vector2D( 90.16099420184912,  38.318825953291594),
                new Vector2D( 90.1665411125756,  38.31859497874757),
                new Vector2D( 90.16999653861313,  38.32505772048029),
                new Vector2D( 90.17475243391698,  38.32594398441148),
                new Vector2D( 90.17940844844992,  38.327427213761325),
                new Vector2D( 90.20951909541378,  38.330616833491774),
                new Vector2D( 90.2155400467941,  38.331746223670336),
                new Vector2D( 90.21559881391778,  38.33175551425302),
                new Vector2D( 90.21916646426041,  38.332584299620805),
                new Vector2D( 90.23863749852285,  38.34778978875795),
                new Vector2D( 90.25459855175802,  38.357790570608984),
                new Vector2D( 90.25964298227257,  38.356918010203174),
                new Vector2D( 90.26024593994703,  38.361692743151366),
                new Vector2D( 90.26146187570015,  38.36311080550837),
                new Vector2D( 90.26614159359622,  38.36510808579902),
                new Vector2D( 90.26621342936448,  38.36507942500333),
                new Vector2D( 90.26652190211962,  38.36494042196722),
                new Vector2D( 90.26621240678867,  38.365113172030874),
                new Vector2D( 90.26614057102057,  38.365141832826794),
                new Vector2D( 90.26380080055299,  38.3660381760273),
                new Vector2D( 90.26315345241,  38.36670658276421),
                new Vector2D( 90.26251574942881,  38.367490323488084),
                new Vector2D( 90.26247873448426,  38.36755266444749),
                new Vector2D( 90.26234628016698,  38.36787989125406),
                new Vector2D( 90.26214559424784,  38.36945909356126),
                new Vector2D( 90.25861728442555,  38.37200753430875),
                new Vector2D( 90.23905557537864,  38.375405314295904),
                new Vector2D( 90.22517251874075,  38.38984691662256),
                new Vector2D( 90.22549955153215,  38.3911564273979),
                new Vector2D( 90.22434386063355,  38.391476432092134),
                new Vector2D( 90.22147729457276,  38.39134652252034),
                new Vector2D( 90.22142070120117,  38.391349167741964),
                new Vector2D( 90.20665060751588,  38.39475580900313),
                new Vector2D( 90.20042268367109,  38.39842558622888),
                new Vector2D( 90.17423771242085,  38.402727751805344),
                new Vector2D( 90.16756796257476,  38.40913898597597),
                new Vector2D( 90.16728283954308,  38.411255399912875),
                new Vector2D( 90.16703538220418,  38.41136059866693),
                new Vector2D( 90.16725865657685,  38.41013618805954),
                new Vector2D( 90.16746107640665,  38.40902614307544),
                new Vector2D( 90.16122795307462,  38.39773101873203)
        };
        __CLR4_4_11qd01qd0lb90pcxu.R.inc(81026);PolygonsSet set2 = new PolygonsSet(1.0e-8, vertices2);
        __CLR4_4_11qd01qd0lb90pcxu.R.inc(81027);PolygonsSet set  = (PolygonsSet) new
                RegionFactory<Euclidean2D>().difference(set1.copySelf(),
                                                        set2.copySelf());

        __CLR4_4_11qd01qd0lb90pcxu.R.inc(81028);Vector2D[][] verticies = set.getVertices();
        __CLR4_4_11qd01qd0lb90pcxu.R.inc(81029);Assert.assertTrue(verticies[0][0] != null);
        __CLR4_4_11qd01qd0lb90pcxu.R.inc(81030);Assert.assertEquals(1, verticies.length);
    }finally{__CLR4_4_11qd01qd0lb90pcxu.R.flushNeeded();}}

    private PolygonsSet buildSet(Vector2D[][] vertices) {try{__CLR4_4_11qd01qd0lb90pcxu.R.inc(81031);
        __CLR4_4_11qd01qd0lb90pcxu.R.inc(81032);ArrayList<SubHyperplane<Euclidean2D>> edges = new ArrayList<SubHyperplane<Euclidean2D>>();
        __CLR4_4_11qd01qd0lb90pcxu.R.inc(81033);for (int i = 0; (((i < vertices.length)&&(__CLR4_4_11qd01qd0lb90pcxu.R.iget(81034)!=0|true))||(__CLR4_4_11qd01qd0lb90pcxu.R.iget(81035)==0&false)); ++i) {{
            __CLR4_4_11qd01qd0lb90pcxu.R.inc(81036);int l = vertices[i].length;
            __CLR4_4_11qd01qd0lb90pcxu.R.inc(81037);for (int j = 0; (((j < l)&&(__CLR4_4_11qd01qd0lb90pcxu.R.iget(81038)!=0|true))||(__CLR4_4_11qd01qd0lb90pcxu.R.iget(81039)==0&false)); ++j) {{
                __CLR4_4_11qd01qd0lb90pcxu.R.inc(81040);edges.add(buildSegment(vertices[i][j], vertices[i][(j + 1) % l]));
            }
        }}
        }__CLR4_4_11qd01qd0lb90pcxu.R.inc(81041);return new PolygonsSet(edges);
    }finally{__CLR4_4_11qd01qd0lb90pcxu.R.flushNeeded();}}

    private SubHyperplane<Euclidean2D> buildLine(Vector2D start, Vector2D end) {try{__CLR4_4_11qd01qd0lb90pcxu.R.inc(81042);
        __CLR4_4_11qd01qd0lb90pcxu.R.inc(81043);return new Line(start, end).wholeHyperplane();
    }finally{__CLR4_4_11qd01qd0lb90pcxu.R.flushNeeded();}}

    private double intersectionAbscissa(Line l0, Line l1) {try{__CLR4_4_11qd01qd0lb90pcxu.R.inc(81044);
        __CLR4_4_11qd01qd0lb90pcxu.R.inc(81045);Vector2D p = l0.intersection(l1);
        __CLR4_4_11qd01qd0lb90pcxu.R.inc(81046);return (l0.toSubSpace(p)).getX();
    }finally{__CLR4_4_11qd01qd0lb90pcxu.R.flushNeeded();}}

    private SubHyperplane<Euclidean2D> buildHalfLine(Vector2D start, Vector2D end,
                                                     boolean startIsVirtual) {try{__CLR4_4_11qd01qd0lb90pcxu.R.inc(81047);
        __CLR4_4_11qd01qd0lb90pcxu.R.inc(81048);Line   line  = new Line(start, end);
        __CLR4_4_11qd01qd0lb90pcxu.R.inc(81049);double lower = (((startIsVirtual
        )&&(__CLR4_4_11qd01qd0lb90pcxu.R.iget(81050)!=0|true))||(__CLR4_4_11qd01qd0lb90pcxu.R.iget(81051)==0&false))? Double.NEGATIVE_INFINITY
        : (line.toSubSpace(start)).getX();
        __CLR4_4_11qd01qd0lb90pcxu.R.inc(81052);double upper = (((startIsVirtual
        )&&(__CLR4_4_11qd01qd0lb90pcxu.R.iget(81053)!=0|true))||(__CLR4_4_11qd01qd0lb90pcxu.R.iget(81054)==0&false))? (line.toSubSpace(end)).getX()
        : Double.POSITIVE_INFINITY;
        __CLR4_4_11qd01qd0lb90pcxu.R.inc(81055);return new SubLine(line, new IntervalsSet(lower, upper));
    }finally{__CLR4_4_11qd01qd0lb90pcxu.R.flushNeeded();}}

    private SubHyperplane<Euclidean2D> buildSegment(Vector2D start, Vector2D end) {try{__CLR4_4_11qd01qd0lb90pcxu.R.inc(81056);
        __CLR4_4_11qd01qd0lb90pcxu.R.inc(81057);Line   line  = new Line(start, end);
        __CLR4_4_11qd01qd0lb90pcxu.R.inc(81058);double lower = (line.toSubSpace(start)).getX();
        __CLR4_4_11qd01qd0lb90pcxu.R.inc(81059);double upper = (line.toSubSpace(end)).getX();
        __CLR4_4_11qd01qd0lb90pcxu.R.inc(81060);return new SubLine(line, new IntervalsSet(lower, upper));
    }finally{__CLR4_4_11qd01qd0lb90pcxu.R.flushNeeded();}}

    private void checkPoints(Region.Location expected, PolygonsSet set,
                             Vector2D[] points) {try{__CLR4_4_11qd01qd0lb90pcxu.R.inc(81061);
        __CLR4_4_11qd01qd0lb90pcxu.R.inc(81062);for (int i = 0; (((i < points.length)&&(__CLR4_4_11qd01qd0lb90pcxu.R.iget(81063)!=0|true))||(__CLR4_4_11qd01qd0lb90pcxu.R.iget(81064)==0&false)); ++i) {{
            __CLR4_4_11qd01qd0lb90pcxu.R.inc(81065);Assert.assertEquals(expected, set.checkPoint(points[i]));
        }
    }}finally{__CLR4_4_11qd01qd0lb90pcxu.R.flushNeeded();}}

    private boolean checkInSegment(Vector2D p,
                                   Vector2D p1, Vector2D p2,
                                   double tolerance) {try{__CLR4_4_11qd01qd0lb90pcxu.R.inc(81066);
        __CLR4_4_11qd01qd0lb90pcxu.R.inc(81067);Line line = new Line(p1, p2);
        __CLR4_4_11qd01qd0lb90pcxu.R.inc(81068);if ((((line.getOffset(p) < tolerance)&&(__CLR4_4_11qd01qd0lb90pcxu.R.iget(81069)!=0|true))||(__CLR4_4_11qd01qd0lb90pcxu.R.iget(81070)==0&false))) {{
            __CLR4_4_11qd01qd0lb90pcxu.R.inc(81071);double x  = (line.toSubSpace(p)).getX();
            __CLR4_4_11qd01qd0lb90pcxu.R.inc(81072);double x1 = (line.toSubSpace(p1)).getX();
            __CLR4_4_11qd01qd0lb90pcxu.R.inc(81073);double x2 = (line.toSubSpace(p2)).getX();
            __CLR4_4_11qd01qd0lb90pcxu.R.inc(81074);return (((x - x1) * (x - x2) <= 0.0)
                    || (p1.distance(p) < tolerance)
                    || (p2.distance(p) < tolerance));
        } }else {{
            __CLR4_4_11qd01qd0lb90pcxu.R.inc(81075);return false;
        }
    }}finally{__CLR4_4_11qd01qd0lb90pcxu.R.flushNeeded();}}

    private void checkVertices(Vector2D[][] rebuiltVertices,
                               Vector2D[][] vertices) {try{__CLR4_4_11qd01qd0lb90pcxu.R.inc(81076);

        // each rebuilt vertex should be in a segment joining two original vertices
        __CLR4_4_11qd01qd0lb90pcxu.R.inc(81077);for (int i = 0; (((i < rebuiltVertices.length)&&(__CLR4_4_11qd01qd0lb90pcxu.R.iget(81078)!=0|true))||(__CLR4_4_11qd01qd0lb90pcxu.R.iget(81079)==0&false)); ++i) {{
            __CLR4_4_11qd01qd0lb90pcxu.R.inc(81080);for (int j = 0; (((j < rebuiltVertices[i].length)&&(__CLR4_4_11qd01qd0lb90pcxu.R.iget(81081)!=0|true))||(__CLR4_4_11qd01qd0lb90pcxu.R.iget(81082)==0&false)); ++j) {{
                __CLR4_4_11qd01qd0lb90pcxu.R.inc(81083);boolean inSegment = false;
                __CLR4_4_11qd01qd0lb90pcxu.R.inc(81084);Vector2D p = rebuiltVertices[i][j];
                __CLR4_4_11qd01qd0lb90pcxu.R.inc(81085);for (int k = 0; (((k < vertices.length)&&(__CLR4_4_11qd01qd0lb90pcxu.R.iget(81086)!=0|true))||(__CLR4_4_11qd01qd0lb90pcxu.R.iget(81087)==0&false)); ++k) {{
                    __CLR4_4_11qd01qd0lb90pcxu.R.inc(81088);Vector2D[] loop = vertices[k];
                    __CLR4_4_11qd01qd0lb90pcxu.R.inc(81089);int length = loop.length;
                    __CLR4_4_11qd01qd0lb90pcxu.R.inc(81090);for (int l = 0; ((((! inSegment) && (l < length))&&(__CLR4_4_11qd01qd0lb90pcxu.R.iget(81091)!=0|true))||(__CLR4_4_11qd01qd0lb90pcxu.R.iget(81092)==0&false)); ++l) {{
                        __CLR4_4_11qd01qd0lb90pcxu.R.inc(81093);inSegment = checkInSegment(p, loop[l], loop[(l + 1) % length], 1.0e-10);
                    }
                }}
                }__CLR4_4_11qd01qd0lb90pcxu.R.inc(81094);Assert.assertTrue(inSegment);
            }
        }}

        // each original vertex should have a corresponding rebuilt vertex
        }__CLR4_4_11qd01qd0lb90pcxu.R.inc(81095);for (int k = 0; (((k < vertices.length)&&(__CLR4_4_11qd01qd0lb90pcxu.R.iget(81096)!=0|true))||(__CLR4_4_11qd01qd0lb90pcxu.R.iget(81097)==0&false)); ++k) {{
            __CLR4_4_11qd01qd0lb90pcxu.R.inc(81098);for (int l = 0; (((l < vertices[k].length)&&(__CLR4_4_11qd01qd0lb90pcxu.R.iget(81099)!=0|true))||(__CLR4_4_11qd01qd0lb90pcxu.R.iget(81100)==0&false)); ++l) {{
                __CLR4_4_11qd01qd0lb90pcxu.R.inc(81101);double min = Double.POSITIVE_INFINITY;
                __CLR4_4_11qd01qd0lb90pcxu.R.inc(81102);for (int i = 0; (((i < rebuiltVertices.length)&&(__CLR4_4_11qd01qd0lb90pcxu.R.iget(81103)!=0|true))||(__CLR4_4_11qd01qd0lb90pcxu.R.iget(81104)==0&false)); ++i) {{
                    __CLR4_4_11qd01qd0lb90pcxu.R.inc(81105);for (int j = 0; (((j < rebuiltVertices[i].length)&&(__CLR4_4_11qd01qd0lb90pcxu.R.iget(81106)!=0|true))||(__CLR4_4_11qd01qd0lb90pcxu.R.iget(81107)==0&false)); ++j) {{
                        __CLR4_4_11qd01qd0lb90pcxu.R.inc(81108);min = FastMath.min(vertices[k][l].distance(rebuiltVertices[i][j]),
                                       min);
                    }
                }}
                }__CLR4_4_11qd01qd0lb90pcxu.R.inc(81109);Assert.assertEquals(0.0, min, 1.0e-10);
            }
        }}

    }}finally{__CLR4_4_11qd01qd0lb90pcxu.R.flushNeeded();}}

}
