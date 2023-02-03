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

import org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D;
import org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet;
import org.apache.commons.math3.geometry.euclidean.twod.Vector2D;
import org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane;
import org.apache.commons.math3.geometry.partitioning.BSPTree;
import org.apache.commons.math3.geometry.partitioning.BSPTreeVisitor;
import org.apache.commons.math3.geometry.partitioning.BoundaryAttribute;
import org.apache.commons.math3.geometry.partitioning.RegionFactory;
import org.apache.commons.math3.geometry.partitioning.SubHyperplane;
import org.apache.commons.math3.util.FastMath;

/** Extractor for {@link PolygonsSet polyhedrons sets} outlines.
 * <p>This class extracts the 2D outlines from {{@link PolygonsSet
 * polyhedrons sets} in a specified projection plane.</p>
 * @version $Id$
 * @since 3.0
 */
public class OutlineExtractor {public static class __CLR4_4_1d7gd7glb90p88v{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,17243,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** Abscissa axis of the projection plane. */
    private Vector3D u;

    /** Ordinate axis of the projection plane. */
    private Vector3D v;

    /** Normal of the projection plane (viewing direction). */
    private Vector3D w;

    /** Build an extractor for a specific projection plane.
     * @param u abscissa axis of the projection point
     * @param v ordinate axis of the projection point
     */
    public OutlineExtractor(final Vector3D u, final Vector3D v) {try{__CLR4_4_1d7gd7glb90p88v.R.inc(17116);
        __CLR4_4_1d7gd7glb90p88v.R.inc(17117);this.u = u;
        __CLR4_4_1d7gd7glb90p88v.R.inc(17118);this.v = v;
        __CLR4_4_1d7gd7glb90p88v.R.inc(17119);w = Vector3D.crossProduct(u, v);
    }finally{__CLR4_4_1d7gd7glb90p88v.R.flushNeeded();}}

    /** Extract the outline of a polyhedrons set.
     * @param polyhedronsSet polyhedrons set whose outline must be extracted
     * @return an outline, as an array of loops.
     */
    public Vector2D[][] getOutline(final PolyhedronsSet polyhedronsSet) {try{__CLR4_4_1d7gd7glb90p88v.R.inc(17120);

        // project all boundary facets into one polygons set
        __CLR4_4_1d7gd7glb90p88v.R.inc(17121);final BoundaryProjector projector = new BoundaryProjector();
        __CLR4_4_1d7gd7glb90p88v.R.inc(17122);polyhedronsSet.getTree(true).visit(projector);
        __CLR4_4_1d7gd7glb90p88v.R.inc(17123);final PolygonsSet projected = projector.getProjected();

        // Remove the spurious intermediate vertices from the outline
        __CLR4_4_1d7gd7glb90p88v.R.inc(17124);final Vector2D[][] outline = projected.getVertices();
        __CLR4_4_1d7gd7glb90p88v.R.inc(17125);for (int i = 0; (((i < outline.length)&&(__CLR4_4_1d7gd7glb90p88v.R.iget(17126)!=0|true))||(__CLR4_4_1d7gd7glb90p88v.R.iget(17127)==0&false)); ++i) {{
            __CLR4_4_1d7gd7glb90p88v.R.inc(17128);final Vector2D[] rawLoop = outline[i];
            __CLR4_4_1d7gd7glb90p88v.R.inc(17129);int end = rawLoop.length;
            __CLR4_4_1d7gd7glb90p88v.R.inc(17130);int j = 0;
            __CLR4_4_1d7gd7glb90p88v.R.inc(17131);while ((((j < end)&&(__CLR4_4_1d7gd7glb90p88v.R.iget(17132)!=0|true))||(__CLR4_4_1d7gd7glb90p88v.R.iget(17133)==0&false))) {{
                __CLR4_4_1d7gd7glb90p88v.R.inc(17134);if ((((pointIsBetween(rawLoop, end, j))&&(__CLR4_4_1d7gd7glb90p88v.R.iget(17135)!=0|true))||(__CLR4_4_1d7gd7glb90p88v.R.iget(17136)==0&false))) {{
                    // the point should be removed
                    __CLR4_4_1d7gd7glb90p88v.R.inc(17137);for (int k = j; (((k < (end - 1))&&(__CLR4_4_1d7gd7glb90p88v.R.iget(17138)!=0|true))||(__CLR4_4_1d7gd7glb90p88v.R.iget(17139)==0&false)); ++k) {{
                        __CLR4_4_1d7gd7glb90p88v.R.inc(17140);rawLoop[k] = rawLoop[k + 1];
                    }
                    }__CLR4_4_1d7gd7glb90p88v.R.inc(17141);--end;
                } }else {{
                    // the point remains in the loop
                    __CLR4_4_1d7gd7glb90p88v.R.inc(17142);++j;
                }
            }}
            }__CLR4_4_1d7gd7glb90p88v.R.inc(17143);if ((((end != rawLoop.length)&&(__CLR4_4_1d7gd7glb90p88v.R.iget(17144)!=0|true))||(__CLR4_4_1d7gd7glb90p88v.R.iget(17145)==0&false))) {{
                // resize the array
                __CLR4_4_1d7gd7glb90p88v.R.inc(17146);outline[i] = new Vector2D[end];
                __CLR4_4_1d7gd7glb90p88v.R.inc(17147);System.arraycopy(rawLoop, 0, outline[i], 0, end);
            }
        }}

        }__CLR4_4_1d7gd7glb90p88v.R.inc(17148);return outline;

    }finally{__CLR4_4_1d7gd7glb90p88v.R.flushNeeded();}}

    /** Check if a point is geometrically between its neighbour in an array.
     * <p>The neighbours are computed considering the array is a loop
     * (i.e. point at index (n-1) is before point at index 0)</p>
     * @param loop points array
     * @param n number of points to consider in the array
     * @param i index of the point to check (must be between 0 and n-1)
     * @return true if the point is exactly between its neighbours
     */
    private boolean pointIsBetween(final Vector2D[] loop, final int n, final int i) {try{__CLR4_4_1d7gd7glb90p88v.R.inc(17149);
        __CLR4_4_1d7gd7glb90p88v.R.inc(17150);final Vector2D previous = loop[(i + n - 1) % n];
        __CLR4_4_1d7gd7glb90p88v.R.inc(17151);final Vector2D current  = loop[i];
        __CLR4_4_1d7gd7glb90p88v.R.inc(17152);final Vector2D next     = loop[(i + 1) % n];
        __CLR4_4_1d7gd7glb90p88v.R.inc(17153);final double dx1       = current.getX() - previous.getX();
        __CLR4_4_1d7gd7glb90p88v.R.inc(17154);final double dy1       = current.getY() - previous.getY();
        __CLR4_4_1d7gd7glb90p88v.R.inc(17155);final double dx2       = next.getX()    - current.getX();
        __CLR4_4_1d7gd7glb90p88v.R.inc(17156);final double dy2       = next.getY()    - current.getY();
        __CLR4_4_1d7gd7glb90p88v.R.inc(17157);final double cross     = dx1 * dy2 - dx2 * dy1;
        __CLR4_4_1d7gd7glb90p88v.R.inc(17158);final double dot       = dx1 * dx2 + dy1 * dy2;
        __CLR4_4_1d7gd7glb90p88v.R.inc(17159);final double d1d2      = FastMath.sqrt((dx1 * dx1 + dy1 * dy1) * (dx2 * dx2 + dy2 * dy2));
        __CLR4_4_1d7gd7glb90p88v.R.inc(17160);return (FastMath.abs(cross) <= (1.0e-6 * d1d2)) && (dot >= 0.0);
    }finally{__CLR4_4_1d7gd7glb90p88v.R.flushNeeded();}}

    /** Visitor projecting the boundary facets on a plane. */
    private class BoundaryProjector implements BSPTreeVisitor<Euclidean3D> {

        /** Projection of the polyhedrons set on the plane. */
        private PolygonsSet projected;

        /** Simple constructor.
         */
        public BoundaryProjector() {try{__CLR4_4_1d7gd7glb90p88v.R.inc(17161);
            __CLR4_4_1d7gd7glb90p88v.R.inc(17162);projected = new PolygonsSet(new BSPTree<Euclidean2D>(Boolean.FALSE));
        }finally{__CLR4_4_1d7gd7glb90p88v.R.flushNeeded();}}

        /** {@inheritDoc} */
        public Order visitOrder(final BSPTree<Euclidean3D> node) {try{__CLR4_4_1d7gd7glb90p88v.R.inc(17163);
            __CLR4_4_1d7gd7glb90p88v.R.inc(17164);return Order.MINUS_SUB_PLUS;
        }finally{__CLR4_4_1d7gd7glb90p88v.R.flushNeeded();}}

        /** {@inheritDoc} */
        public void visitInternalNode(final BSPTree<Euclidean3D> node) {try{__CLR4_4_1d7gd7glb90p88v.R.inc(17165);
            __CLR4_4_1d7gd7glb90p88v.R.inc(17166);@SuppressWarnings("unchecked")
            final BoundaryAttribute<Euclidean3D> attribute =
                (BoundaryAttribute<Euclidean3D>) node.getAttribute();
            __CLR4_4_1d7gd7glb90p88v.R.inc(17167);if ((((attribute.getPlusOutside() != null)&&(__CLR4_4_1d7gd7glb90p88v.R.iget(17168)!=0|true))||(__CLR4_4_1d7gd7glb90p88v.R.iget(17169)==0&false))) {{
                __CLR4_4_1d7gd7glb90p88v.R.inc(17170);addContribution(attribute.getPlusOutside(), false);
            }
            }__CLR4_4_1d7gd7glb90p88v.R.inc(17171);if ((((attribute.getPlusInside() != null)&&(__CLR4_4_1d7gd7glb90p88v.R.iget(17172)!=0|true))||(__CLR4_4_1d7gd7glb90p88v.R.iget(17173)==0&false))) {{
                __CLR4_4_1d7gd7glb90p88v.R.inc(17174);addContribution(attribute.getPlusInside(), true);
            }
        }}finally{__CLR4_4_1d7gd7glb90p88v.R.flushNeeded();}}

        /** {@inheritDoc} */
        public void visitLeafNode(final BSPTree<Euclidean3D> node) {try{__CLR4_4_1d7gd7glb90p88v.R.inc(17175);
        }finally{__CLR4_4_1d7gd7glb90p88v.R.flushNeeded();}}

        /** Add he contribution of a boundary facet.
         * @param facet boundary facet
         * @param reversed if true, the facet has the inside on its plus side
         */
        private void addContribution(final SubHyperplane<Euclidean3D> facet, final boolean reversed) {try{__CLR4_4_1d7gd7glb90p88v.R.inc(17176);

            // extract the vertices of the facet
            __CLR4_4_1d7gd7glb90p88v.R.inc(17177);@SuppressWarnings("unchecked")
            final AbstractSubHyperplane<Euclidean3D, Euclidean2D> absFacet =
                (AbstractSubHyperplane<Euclidean3D, Euclidean2D>) facet;
            __CLR4_4_1d7gd7glb90p88v.R.inc(17178);final Plane plane    = (Plane) facet.getHyperplane();

            __CLR4_4_1d7gd7glb90p88v.R.inc(17179);final double scal = plane.getNormal().dotProduct(w);
            __CLR4_4_1d7gd7glb90p88v.R.inc(17180);if ((((FastMath.abs(scal) > 1.0e-3)&&(__CLR4_4_1d7gd7glb90p88v.R.iget(17181)!=0|true))||(__CLR4_4_1d7gd7glb90p88v.R.iget(17182)==0&false))) {{
                __CLR4_4_1d7gd7glb90p88v.R.inc(17183);Vector2D[][] vertices =
                    ((PolygonsSet) absFacet.getRemainingRegion()).getVertices();

                __CLR4_4_1d7gd7glb90p88v.R.inc(17184);if (((((scal < 0) ^ reversed)&&(__CLR4_4_1d7gd7glb90p88v.R.iget(17185)!=0|true))||(__CLR4_4_1d7gd7glb90p88v.R.iget(17186)==0&false))) {{
                    // the facet is seen from the inside,
                    // we need to invert its boundary orientation
                    __CLR4_4_1d7gd7glb90p88v.R.inc(17187);final Vector2D[][] newVertices = new Vector2D[vertices.length][];
                    __CLR4_4_1d7gd7glb90p88v.R.inc(17188);for (int i = 0; (((i < vertices.length)&&(__CLR4_4_1d7gd7glb90p88v.R.iget(17189)!=0|true))||(__CLR4_4_1d7gd7glb90p88v.R.iget(17190)==0&false)); ++i) {{
                        __CLR4_4_1d7gd7glb90p88v.R.inc(17191);final Vector2D[] loop = vertices[i];
                        __CLR4_4_1d7gd7glb90p88v.R.inc(17192);final Vector2D[] newLoop = new Vector2D[loop.length];
                        __CLR4_4_1d7gd7glb90p88v.R.inc(17193);if ((((loop[0] == null)&&(__CLR4_4_1d7gd7glb90p88v.R.iget(17194)!=0|true))||(__CLR4_4_1d7gd7glb90p88v.R.iget(17195)==0&false))) {{
                            __CLR4_4_1d7gd7glb90p88v.R.inc(17196);newLoop[0] = null;
                            __CLR4_4_1d7gd7glb90p88v.R.inc(17197);for (int j = 1; (((j < loop.length)&&(__CLR4_4_1d7gd7glb90p88v.R.iget(17198)!=0|true))||(__CLR4_4_1d7gd7glb90p88v.R.iget(17199)==0&false)); ++j) {{
                                __CLR4_4_1d7gd7glb90p88v.R.inc(17200);newLoop[j] = loop[loop.length - j];
                            }
                        }} }else {{
                            __CLR4_4_1d7gd7glb90p88v.R.inc(17201);for (int j = 0; (((j < loop.length)&&(__CLR4_4_1d7gd7glb90p88v.R.iget(17202)!=0|true))||(__CLR4_4_1d7gd7glb90p88v.R.iget(17203)==0&false)); ++j) {{
                                __CLR4_4_1d7gd7glb90p88v.R.inc(17204);newLoop[j] = loop[loop.length - (j + 1)];
                            }
                        }}
                        }__CLR4_4_1d7gd7glb90p88v.R.inc(17205);newVertices[i] = newLoop;
                    }

                    // use the reverted vertices
                    }__CLR4_4_1d7gd7glb90p88v.R.inc(17206);vertices = newVertices;

                }

                // compute the projection of the facet in the outline plane
                }__CLR4_4_1d7gd7glb90p88v.R.inc(17207);final ArrayList<SubHyperplane<Euclidean2D>> edges = new ArrayList<SubHyperplane<Euclidean2D>>();
                __CLR4_4_1d7gd7glb90p88v.R.inc(17208);for (Vector2D[] loop : vertices) {{
                    __CLR4_4_1d7gd7glb90p88v.R.inc(17209);final boolean closed = loop[0] != null;
                    __CLR4_4_1d7gd7glb90p88v.R.inc(17210);int previous         = (((closed )&&(__CLR4_4_1d7gd7glb90p88v.R.iget(17211)!=0|true))||(__CLR4_4_1d7gd7glb90p88v.R.iget(17212)==0&false))? (loop.length - 1) : 1;
                    __CLR4_4_1d7gd7glb90p88v.R.inc(17213);Vector3D previous3D  = plane.toSpace(loop[previous]);
                    __CLR4_4_1d7gd7glb90p88v.R.inc(17214);int current          = (previous + 1) % loop.length;
                    __CLR4_4_1d7gd7glb90p88v.R.inc(17215);Vector2D pPoint       = new Vector2D(previous3D.dotProduct(u),
                                                         previous3D.dotProduct(v));
                    __CLR4_4_1d7gd7glb90p88v.R.inc(17216);while ((((current < loop.length)&&(__CLR4_4_1d7gd7glb90p88v.R.iget(17217)!=0|true))||(__CLR4_4_1d7gd7glb90p88v.R.iget(17218)==0&false))) {{

                        __CLR4_4_1d7gd7glb90p88v.R.inc(17219);final Vector3D current3D = plane.toSpace(loop[current]);
                        __CLR4_4_1d7gd7glb90p88v.R.inc(17220);final Vector2D  cPoint    = new Vector2D(current3D.dotProduct(u),
                                                                 current3D.dotProduct(v));
                        __CLR4_4_1d7gd7glb90p88v.R.inc(17221);final org.apache.commons.math3.geometry.euclidean.twod.Line line =
                            new org.apache.commons.math3.geometry.euclidean.twod.Line(pPoint, cPoint);
                        __CLR4_4_1d7gd7glb90p88v.R.inc(17222);SubHyperplane<Euclidean2D> edge = line.wholeHyperplane();

                        __CLR4_4_1d7gd7glb90p88v.R.inc(17223);if ((((closed || (previous != 1))&&(__CLR4_4_1d7gd7glb90p88v.R.iget(17224)!=0|true))||(__CLR4_4_1d7gd7glb90p88v.R.iget(17225)==0&false))) {{
                            // the previous point is a real vertex
                            // it defines one bounding point of the edge
                            __CLR4_4_1d7gd7glb90p88v.R.inc(17226);final double angle = line.getAngle() + 0.5 * FastMath.PI;
                            __CLR4_4_1d7gd7glb90p88v.R.inc(17227);final org.apache.commons.math3.geometry.euclidean.twod.Line l =
                                new org.apache.commons.math3.geometry.euclidean.twod.Line(pPoint, angle);
                            __CLR4_4_1d7gd7glb90p88v.R.inc(17228);edge = edge.split(l).getPlus();
                        }

                        }__CLR4_4_1d7gd7glb90p88v.R.inc(17229);if ((((closed || (current != (loop.length - 1)))&&(__CLR4_4_1d7gd7glb90p88v.R.iget(17230)!=0|true))||(__CLR4_4_1d7gd7glb90p88v.R.iget(17231)==0&false))) {{
                            // the current point is a real vertex
                            // it defines one bounding point of the edge
                            __CLR4_4_1d7gd7glb90p88v.R.inc(17232);final double angle = line.getAngle() + 0.5 * FastMath.PI;
                            __CLR4_4_1d7gd7glb90p88v.R.inc(17233);final org.apache.commons.math3.geometry.euclidean.twod.Line l =
                                new org.apache.commons.math3.geometry.euclidean.twod.Line(cPoint, angle);
                            __CLR4_4_1d7gd7glb90p88v.R.inc(17234);edge = edge.split(l).getMinus();
                        }

                        }__CLR4_4_1d7gd7glb90p88v.R.inc(17235);edges.add(edge);

                        __CLR4_4_1d7gd7glb90p88v.R.inc(17236);previous   = current++;
                        __CLR4_4_1d7gd7glb90p88v.R.inc(17237);previous3D = current3D;
                        __CLR4_4_1d7gd7glb90p88v.R.inc(17238);pPoint     = cPoint;

                    }
                }}
                }__CLR4_4_1d7gd7glb90p88v.R.inc(17239);final PolygonsSet projectedFacet = new PolygonsSet(edges);

                // add the contribution of the facet to the global outline
                __CLR4_4_1d7gd7glb90p88v.R.inc(17240);projected = (PolygonsSet) new RegionFactory<Euclidean2D>().union(projected, projectedFacet);

            }
        }}finally{__CLR4_4_1d7gd7glb90p88v.R.flushNeeded();}}

        /** Get the projection of the polyhedrons set on the plane.
         * @return projection of the polyhedrons set on the plane
         */
        public PolygonsSet getProjected() {try{__CLR4_4_1d7gd7glb90p88v.R.inc(17241);
            __CLR4_4_1d7gd7glb90p88v.R.inc(17242);return projected;
        }finally{__CLR4_4_1d7gd7glb90p88v.R.flushNeeded();}}

    }

}
