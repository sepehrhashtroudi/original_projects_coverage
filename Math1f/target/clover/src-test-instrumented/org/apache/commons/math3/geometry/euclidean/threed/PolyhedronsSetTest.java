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

import java.util.ArrayList;

import org.apache.commons.math3.exception.MathArithmeticException;
import org.apache.commons.math3.exception.MathIllegalArgumentException;
import org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D;
import org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet;
import org.apache.commons.math3.geometry.euclidean.twod.SubLine;
import org.apache.commons.math3.geometry.euclidean.twod.Vector2D;
import org.apache.commons.math3.geometry.partitioning.BSPTree;
import org.apache.commons.math3.geometry.partitioning.BSPTreeVisitor;
import org.apache.commons.math3.geometry.partitioning.BoundaryAttribute;
import org.apache.commons.math3.geometry.partitioning.Region;
import org.apache.commons.math3.geometry.partitioning.RegionFactory;
import org.apache.commons.math3.geometry.partitioning.SubHyperplane;
import org.apache.commons.math3.util.FastMath;
import org.junit.Assert;
import org.junit.Test;

public class PolyhedronsSetTest {static class __CLR4_4_11phs1phslb90pctr{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,79847,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testBox() {__CLR4_4_11phs1phslb90pctr.R.globalSliceStart(getClass().getName(),79696);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14l6iv41phs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11phs1phslb90pctr.R.rethrow($CLV_t2$);}finally{__CLR4_4_11phs1phslb90pctr.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.euclidean.threed.PolyhedronsSetTest.testBox",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),79696,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14l6iv41phs(){try{__CLR4_4_11phs1phslb90pctr.R.inc(79696);
        __CLR4_4_11phs1phslb90pctr.R.inc(79697);PolyhedronsSet tree = new PolyhedronsSet(0, 1, 0, 1, 0, 1);
        __CLR4_4_11phs1phslb90pctr.R.inc(79698);Assert.assertEquals(1.0, tree.getSize(), 1.0e-10);
        __CLR4_4_11phs1phslb90pctr.R.inc(79699);Assert.assertEquals(6.0, tree.getBoundarySize(), 1.0e-10);
        __CLR4_4_11phs1phslb90pctr.R.inc(79700);Vector3D barycenter = (Vector3D) tree.getBarycenter();
        __CLR4_4_11phs1phslb90pctr.R.inc(79701);Assert.assertEquals(0.5, barycenter.getX(), 1.0e-10);
        __CLR4_4_11phs1phslb90pctr.R.inc(79702);Assert.assertEquals(0.5, barycenter.getY(), 1.0e-10);
        __CLR4_4_11phs1phslb90pctr.R.inc(79703);Assert.assertEquals(0.5, barycenter.getZ(), 1.0e-10);
        __CLR4_4_11phs1phslb90pctr.R.inc(79704);for (double x = -0.25; (((x < 1.25)&&(__CLR4_4_11phs1phslb90pctr.R.iget(79705)!=0|true))||(__CLR4_4_11phs1phslb90pctr.R.iget(79706)==0&false)); x += 0.1) {{
            __CLR4_4_11phs1phslb90pctr.R.inc(79707);boolean xOK = (x >= 0.0) && (x <= 1.0);
            __CLR4_4_11phs1phslb90pctr.R.inc(79708);for (double y = -0.25; (((y < 1.25)&&(__CLR4_4_11phs1phslb90pctr.R.iget(79709)!=0|true))||(__CLR4_4_11phs1phslb90pctr.R.iget(79710)==0&false)); y += 0.1) {{
                __CLR4_4_11phs1phslb90pctr.R.inc(79711);boolean yOK = (y >= 0.0) && (y <= 1.0);
                __CLR4_4_11phs1phslb90pctr.R.inc(79712);for (double z = -0.25; (((z < 1.25)&&(__CLR4_4_11phs1phslb90pctr.R.iget(79713)!=0|true))||(__CLR4_4_11phs1phslb90pctr.R.iget(79714)==0&false)); z += 0.1) {{
                    __CLR4_4_11phs1phslb90pctr.R.inc(79715);boolean zOK = (z >= 0.0) && (z <= 1.0);
                    __CLR4_4_11phs1phslb90pctr.R.inc(79716);Region.Location expected =
                        ((((xOK && yOK && zOK) )&&(__CLR4_4_11phs1phslb90pctr.R.iget(79717)!=0|true))||(__CLR4_4_11phs1phslb90pctr.R.iget(79718)==0&false))? Region.Location.INSIDE : Region.Location.OUTSIDE;
                    __CLR4_4_11phs1phslb90pctr.R.inc(79719);Assert.assertEquals(expected, tree.checkPoint(new Vector3D(x, y, z)));
                }
            }}
        }}
        }__CLR4_4_11phs1phslb90pctr.R.inc(79720);checkPoints(Region.Location.BOUNDARY, tree, new Vector3D[] {
            new Vector3D(0.0, 0.5, 0.5),
            new Vector3D(1.0, 0.5, 0.5),
            new Vector3D(0.5, 0.0, 0.5),
            new Vector3D(0.5, 1.0, 0.5),
            new Vector3D(0.5, 0.5, 0.0),
            new Vector3D(0.5, 0.5, 1.0)
        });
        __CLR4_4_11phs1phslb90pctr.R.inc(79721);checkPoints(Region.Location.OUTSIDE, tree, new Vector3D[] {
            new Vector3D(0.0, 1.2, 1.2),
            new Vector3D(1.0, 1.2, 1.2),
            new Vector3D(1.2, 0.0, 1.2),
            new Vector3D(1.2, 1.0, 1.2),
            new Vector3D(1.2, 1.2, 0.0),
            new Vector3D(1.2, 1.2, 1.0)
        });
    }finally{__CLR4_4_11phs1phslb90pctr.R.flushNeeded();}}

    @Test
    public void testTetrahedron() throws MathArithmeticException {__CLR4_4_11phs1phslb90pctr.R.globalSliceStart(getClass().getName(),79722);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hfyv0x1pii();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11phs1phslb90pctr.R.rethrow($CLV_t2$);}finally{__CLR4_4_11phs1phslb90pctr.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.euclidean.threed.PolyhedronsSetTest.testTetrahedron",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),79722,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hfyv0x1pii() throws MathArithmeticException{try{__CLR4_4_11phs1phslb90pctr.R.inc(79722);
        __CLR4_4_11phs1phslb90pctr.R.inc(79723);Vector3D vertex1 = new Vector3D(1, 2, 3);
        __CLR4_4_11phs1phslb90pctr.R.inc(79724);Vector3D vertex2 = new Vector3D(2, 2, 4);
        __CLR4_4_11phs1phslb90pctr.R.inc(79725);Vector3D vertex3 = new Vector3D(2, 3, 3);
        __CLR4_4_11phs1phslb90pctr.R.inc(79726);Vector3D vertex4 = new Vector3D(1, 3, 4);
        __CLR4_4_11phs1phslb90pctr.R.inc(79727);@SuppressWarnings("unchecked")
        PolyhedronsSet tree =
            (PolyhedronsSet) new RegionFactory<Euclidean3D>().buildConvex(
                new Plane(vertex3, vertex2, vertex1),
                new Plane(vertex2, vertex3, vertex4),
                new Plane(vertex4, vertex3, vertex1),
                new Plane(vertex1, vertex2, vertex4));
        __CLR4_4_11phs1phslb90pctr.R.inc(79728);Assert.assertEquals(1.0 / 3.0, tree.getSize(), 1.0e-10);
        __CLR4_4_11phs1phslb90pctr.R.inc(79729);Assert.assertEquals(2.0 * FastMath.sqrt(3.0), tree.getBoundarySize(), 1.0e-10);
        __CLR4_4_11phs1phslb90pctr.R.inc(79730);Vector3D barycenter = (Vector3D) tree.getBarycenter();
        __CLR4_4_11phs1phslb90pctr.R.inc(79731);Assert.assertEquals(1.5, barycenter.getX(), 1.0e-10);
        __CLR4_4_11phs1phslb90pctr.R.inc(79732);Assert.assertEquals(2.5, barycenter.getY(), 1.0e-10);
        __CLR4_4_11phs1phslb90pctr.R.inc(79733);Assert.assertEquals(3.5, barycenter.getZ(), 1.0e-10);
        __CLR4_4_11phs1phslb90pctr.R.inc(79734);double third = 1.0 / 3.0;
        __CLR4_4_11phs1phslb90pctr.R.inc(79735);checkPoints(Region.Location.BOUNDARY, tree, new Vector3D[] {
            vertex1, vertex2, vertex3, vertex4,
            new Vector3D(third, vertex1, third, vertex2, third, vertex3),
            new Vector3D(third, vertex2, third, vertex3, third, vertex4),
            new Vector3D(third, vertex3, third, vertex4, third, vertex1),
            new Vector3D(third, vertex4, third, vertex1, third, vertex2)
        });
        __CLR4_4_11phs1phslb90pctr.R.inc(79736);checkPoints(Region.Location.OUTSIDE, tree, new Vector3D[] {
            new Vector3D(1, 2, 4),
            new Vector3D(2, 2, 3),
            new Vector3D(2, 3, 4),
            new Vector3D(1, 3, 3)
        });
    }finally{__CLR4_4_11phs1phslb90pctr.R.flushNeeded();}}

    @Test
    public void testIsometry() throws MathArithmeticException, MathIllegalArgumentException {__CLR4_4_11phs1phslb90pctr.R.globalSliceStart(getClass().getName(),79737);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cx4w951pix();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11phs1phslb90pctr.R.rethrow($CLV_t2$);}finally{__CLR4_4_11phs1phslb90pctr.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.euclidean.threed.PolyhedronsSetTest.testIsometry",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),79737,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cx4w951pix() throws MathArithmeticException, MathIllegalArgumentException{try{__CLR4_4_11phs1phslb90pctr.R.inc(79737);
        __CLR4_4_11phs1phslb90pctr.R.inc(79738);Vector3D vertex1 = new Vector3D(1.1, 2.2, 3.3);
        __CLR4_4_11phs1phslb90pctr.R.inc(79739);Vector3D vertex2 = new Vector3D(2.0, 2.4, 4.2);
        __CLR4_4_11phs1phslb90pctr.R.inc(79740);Vector3D vertex3 = new Vector3D(2.8, 3.3, 3.7);
        __CLR4_4_11phs1phslb90pctr.R.inc(79741);Vector3D vertex4 = new Vector3D(1.0, 3.6, 4.5);
        __CLR4_4_11phs1phslb90pctr.R.inc(79742);@SuppressWarnings("unchecked")
        PolyhedronsSet tree =
            (PolyhedronsSet) new RegionFactory<Euclidean3D>().buildConvex(
                new Plane(vertex3, vertex2, vertex1),
                new Plane(vertex2, vertex3, vertex4),
                new Plane(vertex4, vertex3, vertex1),
                new Plane(vertex1, vertex2, vertex4));
        __CLR4_4_11phs1phslb90pctr.R.inc(79743);Vector3D barycenter = (Vector3D) tree.getBarycenter();
        __CLR4_4_11phs1phslb90pctr.R.inc(79744);Vector3D s = new Vector3D(10.2, 4.3, -6.7);
        __CLR4_4_11phs1phslb90pctr.R.inc(79745);Vector3D c = new Vector3D(-0.2, 2.1, -3.2);
        __CLR4_4_11phs1phslb90pctr.R.inc(79746);Rotation r = new Rotation(new Vector3D(6.2, -4.4, 2.1), 0.12);

        __CLR4_4_11phs1phslb90pctr.R.inc(79747);tree = tree.rotate(c, r).translate(s);

        __CLR4_4_11phs1phslb90pctr.R.inc(79748);Vector3D newB =
            new Vector3D(1.0, s,
                         1.0, c,
                         1.0, r.applyTo(barycenter.subtract(c)));
        __CLR4_4_11phs1phslb90pctr.R.inc(79749);Assert.assertEquals(0.0,
                            newB.subtract(tree.getBarycenter()).getNorm(),
                            1.0e-10);

        __CLR4_4_11phs1phslb90pctr.R.inc(79750);final Vector3D[] expectedV = new Vector3D[] {
            new Vector3D(1.0, s,
                         1.0, c,
                         1.0, r.applyTo(vertex1.subtract(c))),
                         new Vector3D(1.0, s,
                                      1.0, c,
                                      1.0, r.applyTo(vertex2.subtract(c))),
                                      new Vector3D(1.0, s,
                                                   1.0, c,
                                                   1.0, r.applyTo(vertex3.subtract(c))),
                                                   new Vector3D(1.0, s,
                                                                1.0, c,
                                                                1.0, r.applyTo(vertex4.subtract(c)))
        };
        __CLR4_4_11phs1phslb90pctr.R.inc(79751);tree.getTree(true).visit(new BSPTreeVisitor<Euclidean3D>() {

            public Order visitOrder(BSPTree<Euclidean3D> node) {try{__CLR4_4_11phs1phslb90pctr.R.inc(79752);
                __CLR4_4_11phs1phslb90pctr.R.inc(79753);return Order.MINUS_SUB_PLUS;
            }finally{__CLR4_4_11phs1phslb90pctr.R.flushNeeded();}}

            public void visitInternalNode(BSPTree<Euclidean3D> node) {try{__CLR4_4_11phs1phslb90pctr.R.inc(79754);
                __CLR4_4_11phs1phslb90pctr.R.inc(79755);@SuppressWarnings("unchecked")
                BoundaryAttribute<Euclidean3D> attribute =
                    (BoundaryAttribute<Euclidean3D>) node.getAttribute();
                __CLR4_4_11phs1phslb90pctr.R.inc(79756);if ((((attribute.getPlusOutside() != null)&&(__CLR4_4_11phs1phslb90pctr.R.iget(79757)!=0|true))||(__CLR4_4_11phs1phslb90pctr.R.iget(79758)==0&false))) {{
                    __CLR4_4_11phs1phslb90pctr.R.inc(79759);checkFacet((SubPlane) attribute.getPlusOutside());
                }
                }__CLR4_4_11phs1phslb90pctr.R.inc(79760);if ((((attribute.getPlusInside() != null)&&(__CLR4_4_11phs1phslb90pctr.R.iget(79761)!=0|true))||(__CLR4_4_11phs1phslb90pctr.R.iget(79762)==0&false))) {{
                    __CLR4_4_11phs1phslb90pctr.R.inc(79763);checkFacet((SubPlane) attribute.getPlusInside());
                }
            }}finally{__CLR4_4_11phs1phslb90pctr.R.flushNeeded();}}

            public void visitLeafNode(BSPTree<Euclidean3D> node) {try{__CLR4_4_11phs1phslb90pctr.R.inc(79764);
            }finally{__CLR4_4_11phs1phslb90pctr.R.flushNeeded();}}

            private void checkFacet(SubPlane facet) {try{__CLR4_4_11phs1phslb90pctr.R.inc(79765);
                __CLR4_4_11phs1phslb90pctr.R.inc(79766);Plane plane = (Plane) facet.getHyperplane();
                __CLR4_4_11phs1phslb90pctr.R.inc(79767);Vector2D[][] vertices =
                    ((PolygonsSet) facet.getRemainingRegion()).getVertices();
                __CLR4_4_11phs1phslb90pctr.R.inc(79768);Assert.assertEquals(1, vertices.length);
                __CLR4_4_11phs1phslb90pctr.R.inc(79769);for (int i = 0; (((i < vertices[0].length)&&(__CLR4_4_11phs1phslb90pctr.R.iget(79770)!=0|true))||(__CLR4_4_11phs1phslb90pctr.R.iget(79771)==0&false)); ++i) {{
                    __CLR4_4_11phs1phslb90pctr.R.inc(79772);Vector3D v = plane.toSpace(vertices[0][i]);
                    __CLR4_4_11phs1phslb90pctr.R.inc(79773);double d = Double.POSITIVE_INFINITY;
                    __CLR4_4_11phs1phslb90pctr.R.inc(79774);for (int k = 0; (((k < expectedV.length)&&(__CLR4_4_11phs1phslb90pctr.R.iget(79775)!=0|true))||(__CLR4_4_11phs1phslb90pctr.R.iget(79776)==0&false)); ++k) {{
                        __CLR4_4_11phs1phslb90pctr.R.inc(79777);d = FastMath.min(d, v.subtract(expectedV[k]).getNorm());
                    }
                    }__CLR4_4_11phs1phslb90pctr.R.inc(79778);Assert.assertEquals(0, d, 1.0e-10);
                }
            }}finally{__CLR4_4_11phs1phslb90pctr.R.flushNeeded();}}

        });

    }finally{__CLR4_4_11phs1phslb90pctr.R.flushNeeded();}}

    @Test
    public void testBuildBox() {__CLR4_4_11phs1phslb90pctr.R.globalSliceStart(getClass().getName(),79779);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1r84ivq1pk3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11phs1phslb90pctr.R.rethrow($CLV_t2$);}finally{__CLR4_4_11phs1phslb90pctr.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.euclidean.threed.PolyhedronsSetTest.testBuildBox",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),79779,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1r84ivq1pk3(){try{__CLR4_4_11phs1phslb90pctr.R.inc(79779);
        __CLR4_4_11phs1phslb90pctr.R.inc(79780);double x = 1.0;
        __CLR4_4_11phs1phslb90pctr.R.inc(79781);double y = 2.0;
        __CLR4_4_11phs1phslb90pctr.R.inc(79782);double z = 3.0;
        __CLR4_4_11phs1phslb90pctr.R.inc(79783);double w = 0.1;
        __CLR4_4_11phs1phslb90pctr.R.inc(79784);double l = 1.0;
        __CLR4_4_11phs1phslb90pctr.R.inc(79785);PolyhedronsSet tree =
            new PolyhedronsSet(x - l, x + l, y - w, y + w, z - w, z + w);
        __CLR4_4_11phs1phslb90pctr.R.inc(79786);Vector3D barycenter = (Vector3D) tree.getBarycenter();
        __CLR4_4_11phs1phslb90pctr.R.inc(79787);Assert.assertEquals(x, barycenter.getX(), 1.0e-10);
        __CLR4_4_11phs1phslb90pctr.R.inc(79788);Assert.assertEquals(y, barycenter.getY(), 1.0e-10);
        __CLR4_4_11phs1phslb90pctr.R.inc(79789);Assert.assertEquals(z, barycenter.getZ(), 1.0e-10);
        __CLR4_4_11phs1phslb90pctr.R.inc(79790);Assert.assertEquals(8 * l * w * w, tree.getSize(), 1.0e-10);
        __CLR4_4_11phs1phslb90pctr.R.inc(79791);Assert.assertEquals(8 * w * (2 * l + w), tree.getBoundarySize(), 1.0e-10);
    }finally{__CLR4_4_11phs1phslb90pctr.R.flushNeeded();}}

    @Test
    public void testCross() {__CLR4_4_11phs1phslb90pctr.R.globalSliceStart(getClass().getName(),79792);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12ownfv1pkg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11phs1phslb90pctr.R.rethrow($CLV_t2$);}finally{__CLR4_4_11phs1phslb90pctr.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.euclidean.threed.PolyhedronsSetTest.testCross",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),79792,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12ownfv1pkg(){try{__CLR4_4_11phs1phslb90pctr.R.inc(79792);

        __CLR4_4_11phs1phslb90pctr.R.inc(79793);double x = 1.0;
        __CLR4_4_11phs1phslb90pctr.R.inc(79794);double y = 2.0;
        __CLR4_4_11phs1phslb90pctr.R.inc(79795);double z = 3.0;
        __CLR4_4_11phs1phslb90pctr.R.inc(79796);double w = 0.1;
        __CLR4_4_11phs1phslb90pctr.R.inc(79797);double l = 1.0;
        __CLR4_4_11phs1phslb90pctr.R.inc(79798);PolyhedronsSet xBeam =
            new PolyhedronsSet(x - l, x + l, y - w, y + w, z - w, z + w);
        __CLR4_4_11phs1phslb90pctr.R.inc(79799);PolyhedronsSet yBeam =
            new PolyhedronsSet(x - w, x + w, y - l, y + l, z - w, z + w);
        __CLR4_4_11phs1phslb90pctr.R.inc(79800);PolyhedronsSet zBeam =
            new PolyhedronsSet(x - w, x + w, y - w, y + w, z - l, z + l);
        __CLR4_4_11phs1phslb90pctr.R.inc(79801);RegionFactory<Euclidean3D> factory = new RegionFactory<Euclidean3D>();
        __CLR4_4_11phs1phslb90pctr.R.inc(79802);PolyhedronsSet tree = (PolyhedronsSet) factory.union(xBeam, factory.union(yBeam, zBeam));
        __CLR4_4_11phs1phslb90pctr.R.inc(79803);Vector3D barycenter = (Vector3D) tree.getBarycenter();

        __CLR4_4_11phs1phslb90pctr.R.inc(79804);Assert.assertEquals(x, barycenter.getX(), 1.0e-10);
        __CLR4_4_11phs1phslb90pctr.R.inc(79805);Assert.assertEquals(y, barycenter.getY(), 1.0e-10);
        __CLR4_4_11phs1phslb90pctr.R.inc(79806);Assert.assertEquals(z, barycenter.getZ(), 1.0e-10);
        __CLR4_4_11phs1phslb90pctr.R.inc(79807);Assert.assertEquals(8 * w * w * (3 * l - 2 * w), tree.getSize(), 1.0e-10);
        __CLR4_4_11phs1phslb90pctr.R.inc(79808);Assert.assertEquals(24 * w * (2 * l - w), tree.getBoundarySize(), 1.0e-10);

    }finally{__CLR4_4_11phs1phslb90pctr.R.flushNeeded();}}

    @Test
    public void testIssue780() throws MathArithmeticException {__CLR4_4_11phs1phslb90pctr.R.globalSliceStart(getClass().getName(),79809);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tn6kup1pkx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11phs1phslb90pctr.R.rethrow($CLV_t2$);}finally{__CLR4_4_11phs1phslb90pctr.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.euclidean.threed.PolyhedronsSetTest.testIssue780",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),79809,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tn6kup1pkx() throws MathArithmeticException{try{__CLR4_4_11phs1phslb90pctr.R.inc(79809);
        __CLR4_4_11phs1phslb90pctr.R.inc(79810);float[] coords = {
            1.000000f, -1.000000f, -1.000000f, 
            1.000000f, -1.000000f, 1.000000f, 
            -1.000000f, -1.000000f, 1.000000f, 
            -1.000000f, -1.000000f, -1.000000f, 
            1.000000f, 1.000000f, -1f, 
            0.999999f, 1.000000f, 1.000000f,   // 1.000000f, 1.000000f, 1.000000f, 
            -1.000000f, 1.000000f, 1.000000f, 
            -1.000000f, 1.000000f, -1.000000f};
        __CLR4_4_11phs1phslb90pctr.R.inc(79811);int[] indices = {
            0, 1, 2, 0, 2, 3, 
            4, 7, 6, 4, 6, 5, 
            0, 4, 5, 0, 5, 1, 
            1, 5, 6, 1, 6, 2, 
            2, 6, 7, 2, 7, 3, 
            4, 0, 3, 4, 3, 7};
        __CLR4_4_11phs1phslb90pctr.R.inc(79812);ArrayList<SubHyperplane<Euclidean3D>> subHyperplaneList = new ArrayList<SubHyperplane<Euclidean3D>>();
        __CLR4_4_11phs1phslb90pctr.R.inc(79813);for (int idx = 0; (((idx < indices.length)&&(__CLR4_4_11phs1phslb90pctr.R.iget(79814)!=0|true))||(__CLR4_4_11phs1phslb90pctr.R.iget(79815)==0&false)); idx += 3) {{
            __CLR4_4_11phs1phslb90pctr.R.inc(79816);int idxA = indices[idx] * 3;
            __CLR4_4_11phs1phslb90pctr.R.inc(79817);int idxB = indices[idx + 1] * 3;
            __CLR4_4_11phs1phslb90pctr.R.inc(79818);int idxC = indices[idx + 2] * 3;
            __CLR4_4_11phs1phslb90pctr.R.inc(79819);Vector3D v_1 = new Vector3D(coords[idxA], coords[idxA + 1], coords[idxA + 2]);
            __CLR4_4_11phs1phslb90pctr.R.inc(79820);Vector3D v_2 = new Vector3D(coords[idxB], coords[idxB + 1], coords[idxB + 2]);
            __CLR4_4_11phs1phslb90pctr.R.inc(79821);Vector3D v_3 = new Vector3D(coords[idxC], coords[idxC + 1], coords[idxC + 2]);
            __CLR4_4_11phs1phslb90pctr.R.inc(79822);Vector3D[] vertices = {v_1, v_2, v_3};
            __CLR4_4_11phs1phslb90pctr.R.inc(79823);Plane polyPlane = new Plane(v_1, v_2, v_3);
            __CLR4_4_11phs1phslb90pctr.R.inc(79824);ArrayList<SubHyperplane<Euclidean2D>> lines = new ArrayList<SubHyperplane<Euclidean2D>>();

            __CLR4_4_11phs1phslb90pctr.R.inc(79825);Vector2D[] projPts = new Vector2D[vertices.length];
            __CLR4_4_11phs1phslb90pctr.R.inc(79826);for (int ptIdx = 0; (((ptIdx < projPts.length)&&(__CLR4_4_11phs1phslb90pctr.R.iget(79827)!=0|true))||(__CLR4_4_11phs1phslb90pctr.R.iget(79828)==0&false)); ptIdx++) {{
                __CLR4_4_11phs1phslb90pctr.R.inc(79829);projPts[ptIdx] = polyPlane.toSubSpace(vertices[ptIdx]);
            }

            }__CLR4_4_11phs1phslb90pctr.R.inc(79830);SubLine lineInPlane = null;
            __CLR4_4_11phs1phslb90pctr.R.inc(79831);for (int ptIdx = 0; (((ptIdx < projPts.length)&&(__CLR4_4_11phs1phslb90pctr.R.iget(79832)!=0|true))||(__CLR4_4_11phs1phslb90pctr.R.iget(79833)==0&false)); ptIdx++) {{
                __CLR4_4_11phs1phslb90pctr.R.inc(79834);lineInPlane = new SubLine(projPts[ptIdx], projPts[(ptIdx + 1) % projPts.length]);
                __CLR4_4_11phs1phslb90pctr.R.inc(79835);lines.add(lineInPlane);
            }
            }__CLR4_4_11phs1phslb90pctr.R.inc(79836);Region<Euclidean2D> polyRegion = new PolygonsSet(lines);
            __CLR4_4_11phs1phslb90pctr.R.inc(79837);SubPlane polygon = new SubPlane(polyPlane, polyRegion);
            __CLR4_4_11phs1phslb90pctr.R.inc(79838);subHyperplaneList.add(polygon);
        }
        }__CLR4_4_11phs1phslb90pctr.R.inc(79839);PolyhedronsSet polyhedronsSet = new PolyhedronsSet(subHyperplaneList);
        __CLR4_4_11phs1phslb90pctr.R.inc(79840);Assert.assertEquals( 8.0, polyhedronsSet.getSize(), 3.0e-6);
        __CLR4_4_11phs1phslb90pctr.R.inc(79841);Assert.assertEquals(24.0, polyhedronsSet.getBoundarySize(), 5.0e-6);
    }finally{__CLR4_4_11phs1phslb90pctr.R.flushNeeded();}}

    private void checkPoints(Region.Location expected, PolyhedronsSet tree, Vector3D[] points) {try{__CLR4_4_11phs1phslb90pctr.R.inc(79842);
        __CLR4_4_11phs1phslb90pctr.R.inc(79843);for (int i = 0; (((i < points.length)&&(__CLR4_4_11phs1phslb90pctr.R.iget(79844)!=0|true))||(__CLR4_4_11phs1phslb90pctr.R.iget(79845)==0&false)); ++i) {{
            __CLR4_4_11phs1phslb90pctr.R.inc(79846);Assert.assertEquals(expected, tree.checkPoint(points[i]));
        }
    }}finally{__CLR4_4_11phs1phslb90pctr.R.flushNeeded();}}

}
