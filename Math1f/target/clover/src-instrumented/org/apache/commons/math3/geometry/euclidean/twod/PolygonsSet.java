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
import java.util.Collection;
import java.util.List;

import org.apache.commons.math3.exception.MathInternalError;
import org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D;
import org.apache.commons.math3.geometry.euclidean.oned.Interval;
import org.apache.commons.math3.geometry.euclidean.oned.IntervalsSet;
import org.apache.commons.math3.geometry.euclidean.oned.Vector1D;
import org.apache.commons.math3.geometry.partitioning.AbstractRegion;
import org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane;
import org.apache.commons.math3.geometry.partitioning.BSPTree;
import org.apache.commons.math3.geometry.partitioning.BSPTreeVisitor;
import org.apache.commons.math3.geometry.partitioning.BoundaryAttribute;
import org.apache.commons.math3.geometry.partitioning.Side;
import org.apache.commons.math3.geometry.partitioning.SubHyperplane;
import org.apache.commons.math3.geometry.partitioning.utilities.AVLTree;
import org.apache.commons.math3.geometry.partitioning.utilities.OrderedTuple;
import org.apache.commons.math3.util.FastMath;

/** This class represents a 2D region: a set of polygons.
 * @version $Id$
 * @since 3.0
 */
@java.lang.SuppressWarnings({"fallthrough"}) public class PolygonsSet extends AbstractRegion<Euclidean2D, Euclidean1D> {public static class __CLR4_4_1ecyecylb90p8ds{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,18991,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** Vertices organized as boundary loops. */
    private Vector2D[][] vertices;

    /** Build a polygons set representing the whole real line.
     */
    public PolygonsSet() {
        super();__CLR4_4_1ecyecylb90p8ds.R.inc(18611);try{__CLR4_4_1ecyecylb90p8ds.R.inc(18610);
    }finally{__CLR4_4_1ecyecylb90p8ds.R.flushNeeded();}}

    /** Build a polygons set from a BSP tree.
     * <p>The leaf nodes of the BSP tree <em>must</em> have a
     * {@code Boolean} attribute representing the inside status of
     * the corresponding cell (true for inside cells, false for outside
     * cells). In order to avoid building too many small objects, it is
     * recommended to use the predefined constants
     * {@code Boolean.TRUE} and {@code Boolean.FALSE}</p>
     * @param tree inside/outside BSP tree representing the region
     */
    public PolygonsSet(final BSPTree<Euclidean2D> tree) {
        super(tree);__CLR4_4_1ecyecylb90p8ds.R.inc(18613);try{__CLR4_4_1ecyecylb90p8ds.R.inc(18612);
    }finally{__CLR4_4_1ecyecylb90p8ds.R.flushNeeded();}}

    /** Build a polygons set from a Boundary REPresentation (B-rep).
     * <p>The boundary is provided as a collection of {@link
     * SubHyperplane sub-hyperplanes}. Each sub-hyperplane has the
     * interior part of the region on its minus side and the exterior on
     * its plus side.</p>
     * <p>The boundary elements can be in any order, and can form
     * several non-connected sets (like for example polygons with holes
     * or a set of disjoint polyhedrons considered as a whole). In
     * fact, the elements do not even need to be connected together
     * (their topological connections are not used here). However, if the
     * boundary does not really separate an inside open from an outside
     * open (open having here its topological meaning), then subsequent
     * calls to the {@link
     * org.apache.commons.math3.geometry.partitioning.Region#checkPoint(org.apache.commons.math3.geometry.Vector)
     * checkPoint} method will not be meaningful anymore.</p>
     * <p>If the boundary is empty, the region will represent the whole
     * space.</p>
     * @param boundary collection of boundary elements, as a
     * collection of {@link SubHyperplane SubHyperplane} objects
     */
    public PolygonsSet(final Collection<SubHyperplane<Euclidean2D>> boundary) {
        super(boundary);__CLR4_4_1ecyecylb90p8ds.R.inc(18615);try{__CLR4_4_1ecyecylb90p8ds.R.inc(18614);
    }finally{__CLR4_4_1ecyecylb90p8ds.R.flushNeeded();}}

    /** Build a parallellepipedic box.
     * @param xMin low bound along the x direction
     * @param xMax high bound along the x direction
     * @param yMin low bound along the y direction
     * @param yMax high bound along the y direction
     */
    public PolygonsSet(final double xMin, final double xMax,
                       final double yMin, final double yMax) {
        super(boxBoundary(xMin, xMax, yMin, yMax));__CLR4_4_1ecyecylb90p8ds.R.inc(18617);try{__CLR4_4_1ecyecylb90p8ds.R.inc(18616);
    }finally{__CLR4_4_1ecyecylb90p8ds.R.flushNeeded();}}

    /** Build a polygon from a simple list of vertices.
     * <p>The boundary is provided as a list of points considering to
     * represent the vertices of a simple loop. The interior part of the
     * region is on the left side of this path and the exterior is on its
     * right side.</p>
     * <p>This constructor does not handle polygons with a boundary
     * forming several disconnected paths (such as polygons with holes).</p>
     * <p>For cases where this simple constructor applies, it is expected to
     * be numerically more robust than the {@link #PolygonsSet(Collection) general
     * constructor} using {@link SubHyperplane subhyperplanes}.</p>
     * <p>If the list is empty, the region will represent the whole
     * space.</p>
     * <p>
     * Polygons with thin pikes or dents are inherently difficult to handle because
     * they involve lines with almost opposite directions at some vertices. Polygons
     * whose vertices come from some physical measurement with noise are also
     * difficult because an edge that should be straight may be broken in lots of
     * different pieces with almost equal directions. In both cases, computing the
     * lines intersections is not numerically robust due to the almost 0 or almost
     * &pi; angle. Such cases need to carefully adjust the {@code hyperplaneThickness}
     * parameter. A too small value would often lead to completely wrong polygons
     * with large area wrongly identified as inside or outside. Large values are
     * often much safer. As a rule of thumb, a value slightly below the size of the
     * most accurate detail needed is a good value for the {@code hyperplaneThickness}
     * parameter.
     * </p>
     * @param hyperplaneThickness tolerance below which points are considered to
     * belong to the hyperplane (which is therefore more a slab)
     * @param vertices vertices of the simple loop boundary
     * @since 3.1
     */
    public PolygonsSet(final double hyperplaneThickness, final Vector2D ... vertices) {
        super(verticesToTree(hyperplaneThickness, vertices));__CLR4_4_1ecyecylb90p8ds.R.inc(18619);try{__CLR4_4_1ecyecylb90p8ds.R.inc(18618);
    }finally{__CLR4_4_1ecyecylb90p8ds.R.flushNeeded();}}

    /** Create a list of hyperplanes representing the boundary of a box.
     * @param xMin low bound along the x direction
     * @param xMax high bound along the x direction
     * @param yMin low bound along the y direction
     * @param yMax high bound along the y direction
     * @return boundary of the box
     */
    private static Line[] boxBoundary(final double xMin, final double xMax,
                                      final double yMin, final double yMax) {try{__CLR4_4_1ecyecylb90p8ds.R.inc(18620);
        __CLR4_4_1ecyecylb90p8ds.R.inc(18621);final Vector2D minMin = new Vector2D(xMin, yMin);
        __CLR4_4_1ecyecylb90p8ds.R.inc(18622);final Vector2D minMax = new Vector2D(xMin, yMax);
        __CLR4_4_1ecyecylb90p8ds.R.inc(18623);final Vector2D maxMin = new Vector2D(xMax, yMin);
        __CLR4_4_1ecyecylb90p8ds.R.inc(18624);final Vector2D maxMax = new Vector2D(xMax, yMax);
        __CLR4_4_1ecyecylb90p8ds.R.inc(18625);return new Line[] {
            new Line(minMin, maxMin),
            new Line(maxMin, maxMax),
            new Line(maxMax, minMax),
            new Line(minMax, minMin)
        };
    }finally{__CLR4_4_1ecyecylb90p8ds.R.flushNeeded();}}

    /** Build the BSP tree of a polygons set from a simple list of vertices.
     * <p>The boundary is provided as a list of points considering to
     * represent the vertices of a simple loop. The interior part of the
     * region is on the left side of this path and the exterior is on its
     * right side.</p>
     * <p>This constructor does not handle polygons with a boundary
     * forming several disconnected paths (such as polygons with holes).</p>
     * <p>For cases where this simple constructor applies, it is expected to
     * be numerically more robust than the {@link #PolygonsSet(Collection) general
     * constructor} using {@link SubHyperplane subhyperplanes}.</p>
     * @param hyperplaneThickness tolerance below which points are consider to
     * belong to the hyperplane (which is therefore more a slab)
     * @param vertices vertices of the simple loop boundary
     * @return the BSP tree of the input vertices
     */
    private static BSPTree<Euclidean2D> verticesToTree(final double hyperplaneThickness,
                                                       final Vector2D ... vertices) {try{__CLR4_4_1ecyecylb90p8ds.R.inc(18626);

        __CLR4_4_1ecyecylb90p8ds.R.inc(18627);final int n = vertices.length;
        __CLR4_4_1ecyecylb90p8ds.R.inc(18628);if ((((n == 0)&&(__CLR4_4_1ecyecylb90p8ds.R.iget(18629)!=0|true))||(__CLR4_4_1ecyecylb90p8ds.R.iget(18630)==0&false))) {{
            // the tree represents the whole space
            __CLR4_4_1ecyecylb90p8ds.R.inc(18631);return new BSPTree<Euclidean2D>(Boolean.TRUE);
        }

        // build the vertices
        }__CLR4_4_1ecyecylb90p8ds.R.inc(18632);final Vertex[] vArray = new Vertex[n];
        __CLR4_4_1ecyecylb90p8ds.R.inc(18633);for (int i = 0; (((i < n)&&(__CLR4_4_1ecyecylb90p8ds.R.iget(18634)!=0|true))||(__CLR4_4_1ecyecylb90p8ds.R.iget(18635)==0&false)); ++i) {{
            __CLR4_4_1ecyecylb90p8ds.R.inc(18636);vArray[i] = new Vertex(vertices[i]);
        }

        // build the edges
        }__CLR4_4_1ecyecylb90p8ds.R.inc(18637);List<Edge> edges = new ArrayList<Edge>(n);
        __CLR4_4_1ecyecylb90p8ds.R.inc(18638);for (int i = 0; (((i < n)&&(__CLR4_4_1ecyecylb90p8ds.R.iget(18639)!=0|true))||(__CLR4_4_1ecyecylb90p8ds.R.iget(18640)==0&false)); ++i) {{

            // get the endpoints of the edge
            __CLR4_4_1ecyecylb90p8ds.R.inc(18641);final Vertex start = vArray[i];
            __CLR4_4_1ecyecylb90p8ds.R.inc(18642);final Vertex end   = vArray[(i + 1) % n];

            // get the line supporting the edge, taking care not to recreate it
            // if it was already created earlier due to another edge being aligned
            // with the current one
            __CLR4_4_1ecyecylb90p8ds.R.inc(18643);Line line = start.sharedLineWith(end);
            __CLR4_4_1ecyecylb90p8ds.R.inc(18644);if ((((line == null)&&(__CLR4_4_1ecyecylb90p8ds.R.iget(18645)!=0|true))||(__CLR4_4_1ecyecylb90p8ds.R.iget(18646)==0&false))) {{
                __CLR4_4_1ecyecylb90p8ds.R.inc(18647);line = new Line(start.getLocation(), end.getLocation());
            }

            // create the edge and store it
            }__CLR4_4_1ecyecylb90p8ds.R.inc(18648);edges.add(new Edge(start, end, line));

            // check if another vertex also happens to be on this line
            __CLR4_4_1ecyecylb90p8ds.R.inc(18649);for (final Vertex vertex : vArray) {{
                __CLR4_4_1ecyecylb90p8ds.R.inc(18650);if ((((vertex != start && vertex != end &&
                    FastMath.abs(line.getOffset(vertex.getLocation())) <= hyperplaneThickness)&&(__CLR4_4_1ecyecylb90p8ds.R.iget(18651)!=0|true))||(__CLR4_4_1ecyecylb90p8ds.R.iget(18652)==0&false))) {{
                    __CLR4_4_1ecyecylb90p8ds.R.inc(18653);vertex.bindWith(line);
                }
            }}

        }}

        // build the tree top-down
        }__CLR4_4_1ecyecylb90p8ds.R.inc(18654);final BSPTree<Euclidean2D> tree = new BSPTree<Euclidean2D>();
        __CLR4_4_1ecyecylb90p8ds.R.inc(18655);insertEdges(hyperplaneThickness, tree, edges);

        __CLR4_4_1ecyecylb90p8ds.R.inc(18656);return tree;

    }finally{__CLR4_4_1ecyecylb90p8ds.R.flushNeeded();}}

    /** Recursively build a tree by inserting cut sub-hyperplanes.
     * @param hyperplaneThickness tolerance below which points are consider to
     * belong to the hyperplane (which is therefore more a slab)
     * @param node current tree node (it is a leaf node at the beginning
     * of the call)
     * @param edges list of edges to insert in the cell defined by this node
     * (excluding edges not belonging to the cell defined by this node)
     */
    private static void insertEdges(final double hyperplaneThickness,
                                    final BSPTree<Euclidean2D> node,
                                    final List<Edge> edges) {try{__CLR4_4_1ecyecylb90p8ds.R.inc(18657);

        // find an edge with an hyperplane that can be inserted in the node
        __CLR4_4_1ecyecylb90p8ds.R.inc(18658);int index = 0;
        __CLR4_4_1ecyecylb90p8ds.R.inc(18659);Edge inserted =null;
        __CLR4_4_1ecyecylb90p8ds.R.inc(18660);while ((((inserted == null && index < edges.size())&&(__CLR4_4_1ecyecylb90p8ds.R.iget(18661)!=0|true))||(__CLR4_4_1ecyecylb90p8ds.R.iget(18662)==0&false))) {{
            __CLR4_4_1ecyecylb90p8ds.R.inc(18663);inserted = edges.get(index++);
            __CLR4_4_1ecyecylb90p8ds.R.inc(18664);if ((((inserted.getNode() == null)&&(__CLR4_4_1ecyecylb90p8ds.R.iget(18665)!=0|true))||(__CLR4_4_1ecyecylb90p8ds.R.iget(18666)==0&false))) {{
                __CLR4_4_1ecyecylb90p8ds.R.inc(18667);if ((((node.insertCut(inserted.getLine()))&&(__CLR4_4_1ecyecylb90p8ds.R.iget(18668)!=0|true))||(__CLR4_4_1ecyecylb90p8ds.R.iget(18669)==0&false))) {{
                    __CLR4_4_1ecyecylb90p8ds.R.inc(18670);inserted.setNode(node);
                } }else {{
                    __CLR4_4_1ecyecylb90p8ds.R.inc(18671);inserted = null;
                }
            }} }else {{
                __CLR4_4_1ecyecylb90p8ds.R.inc(18672);inserted = null;
            }
        }}

        }__CLR4_4_1ecyecylb90p8ds.R.inc(18673);if ((((inserted == null)&&(__CLR4_4_1ecyecylb90p8ds.R.iget(18674)!=0|true))||(__CLR4_4_1ecyecylb90p8ds.R.iget(18675)==0&false))) {{
            // no suitable edge was found, the node remains a leaf node
            // we need to set its inside/outside boolean indicator
            __CLR4_4_1ecyecylb90p8ds.R.inc(18676);final BSPTree<Euclidean2D> parent = node.getParent();
            __CLR4_4_1ecyecylb90p8ds.R.inc(18677);if ((((parent == null || node == parent.getMinus())&&(__CLR4_4_1ecyecylb90p8ds.R.iget(18678)!=0|true))||(__CLR4_4_1ecyecylb90p8ds.R.iget(18679)==0&false))) {{
                __CLR4_4_1ecyecylb90p8ds.R.inc(18680);node.setAttribute(Boolean.TRUE);
            } }else {{
                __CLR4_4_1ecyecylb90p8ds.R.inc(18681);node.setAttribute(Boolean.FALSE);
            }
            }__CLR4_4_1ecyecylb90p8ds.R.inc(18682);return;
        }

        // we have split the node by inserted an edge as a cut sub-hyperplane
        // distribute the remaining edges in the two sub-trees
        }__CLR4_4_1ecyecylb90p8ds.R.inc(18683);final List<Edge> plusList  = new ArrayList<Edge>();
        __CLR4_4_1ecyecylb90p8ds.R.inc(18684);final List<Edge> minusList = new ArrayList<Edge>();
        __CLR4_4_1ecyecylb90p8ds.R.inc(18685);for (final Edge edge : edges) {{
            __CLR4_4_1ecyecylb90p8ds.R.inc(18686);if ((((edge != inserted)&&(__CLR4_4_1ecyecylb90p8ds.R.iget(18687)!=0|true))||(__CLR4_4_1ecyecylb90p8ds.R.iget(18688)==0&false))) {{
                __CLR4_4_1ecyecylb90p8ds.R.inc(18689);final double startOffset = inserted.getLine().getOffset(edge.getStart().getLocation());
                __CLR4_4_1ecyecylb90p8ds.R.inc(18690);final double endOffset   = inserted.getLine().getOffset(edge.getEnd().getLocation());
                __CLR4_4_1ecyecylb90p8ds.R.inc(18691);Side startSide = ((((FastMath.abs(startOffset) <= hyperplaneThickness) )&&(__CLR4_4_1ecyecylb90p8ds.R.iget(18692)!=0|true))||(__CLR4_4_1ecyecylb90p8ds.R.iget(18693)==0&false))?
                                 Side.HYPER : (((((startOffset < 0) )&&(__CLR4_4_1ecyecylb90p8ds.R.iget(18694)!=0|true))||(__CLR4_4_1ecyecylb90p8ds.R.iget(18695)==0&false))? Side.MINUS : Side.PLUS);
                __CLR4_4_1ecyecylb90p8ds.R.inc(18696);Side endSide   = ((((FastMath.abs(endOffset) <= hyperplaneThickness) )&&(__CLR4_4_1ecyecylb90p8ds.R.iget(18697)!=0|true))||(__CLR4_4_1ecyecylb90p8ds.R.iget(18698)==0&false))?
                                 Side.HYPER : (((((endOffset < 0) )&&(__CLR4_4_1ecyecylb90p8ds.R.iget(18699)!=0|true))||(__CLR4_4_1ecyecylb90p8ds.R.iget(18700)==0&false))? Side.MINUS : Side.PLUS);
                boolean __CLB4_4_1_bool0=false;__CLR4_4_1ecyecylb90p8ds.R.inc(18701);switch (startSide) {
                    case PLUS:if (!__CLB4_4_1_bool0) {__CLR4_4_1ecyecylb90p8ds.R.inc(18702);__CLB4_4_1_bool0=true;}
                        __CLR4_4_1ecyecylb90p8ds.R.inc(18703);if ((((endSide == Side.MINUS)&&(__CLR4_4_1ecyecylb90p8ds.R.iget(18704)!=0|true))||(__CLR4_4_1ecyecylb90p8ds.R.iget(18705)==0&false))) {{
                            // we need to insert a split point on the hyperplane
                            __CLR4_4_1ecyecylb90p8ds.R.inc(18706);final Vertex splitPoint = edge.split(inserted.getLine());
                            __CLR4_4_1ecyecylb90p8ds.R.inc(18707);minusList.add(splitPoint.getOutgoing());
                            __CLR4_4_1ecyecylb90p8ds.R.inc(18708);plusList.add(splitPoint.getIncoming());
                        } }else {{
                            __CLR4_4_1ecyecylb90p8ds.R.inc(18709);plusList.add(edge);
                        }
                        }__CLR4_4_1ecyecylb90p8ds.R.inc(18710);break;
                    case MINUS:if (!__CLB4_4_1_bool0) {__CLR4_4_1ecyecylb90p8ds.R.inc(18711);__CLB4_4_1_bool0=true;}
                        __CLR4_4_1ecyecylb90p8ds.R.inc(18712);if ((((endSide == Side.PLUS)&&(__CLR4_4_1ecyecylb90p8ds.R.iget(18713)!=0|true))||(__CLR4_4_1ecyecylb90p8ds.R.iget(18714)==0&false))) {{
                            // we need to insert a split point on the hyperplane
                            __CLR4_4_1ecyecylb90p8ds.R.inc(18715);final Vertex splitPoint = edge.split(inserted.getLine());
                            __CLR4_4_1ecyecylb90p8ds.R.inc(18716);minusList.add(splitPoint.getIncoming());
                            __CLR4_4_1ecyecylb90p8ds.R.inc(18717);plusList.add(splitPoint.getOutgoing());
                        } }else {{
                            __CLR4_4_1ecyecylb90p8ds.R.inc(18718);minusList.add(edge);
                        }
                        }__CLR4_4_1ecyecylb90p8ds.R.inc(18719);break;
                    default:if (!__CLB4_4_1_bool0) {__CLR4_4_1ecyecylb90p8ds.R.inc(18720);__CLB4_4_1_bool0=true;}
                        __CLR4_4_1ecyecylb90p8ds.R.inc(18721);if ((((endSide == Side.PLUS)&&(__CLR4_4_1ecyecylb90p8ds.R.iget(18722)!=0|true))||(__CLR4_4_1ecyecylb90p8ds.R.iget(18723)==0&false))) {{
                            __CLR4_4_1ecyecylb90p8ds.R.inc(18724);plusList.add(edge);
                        } }else {__CLR4_4_1ecyecylb90p8ds.R.inc(18725);if ((((endSide == Side.MINUS)&&(__CLR4_4_1ecyecylb90p8ds.R.iget(18726)!=0|true))||(__CLR4_4_1ecyecylb90p8ds.R.iget(18727)==0&false))) {{
                            __CLR4_4_1ecyecylb90p8ds.R.inc(18728);minusList.add(edge);
                        }
                        }}__CLR4_4_1ecyecylb90p8ds.R.inc(18729);break;
                }
            }
        }}

        // recurse through lower levels
        }__CLR4_4_1ecyecylb90p8ds.R.inc(18730);if ((((!plusList.isEmpty())&&(__CLR4_4_1ecyecylb90p8ds.R.iget(18731)!=0|true))||(__CLR4_4_1ecyecylb90p8ds.R.iget(18732)==0&false))) {{
            __CLR4_4_1ecyecylb90p8ds.R.inc(18733);insertEdges(hyperplaneThickness, node.getPlus(),  plusList);
        } }else {{
            __CLR4_4_1ecyecylb90p8ds.R.inc(18734);node.getPlus().setAttribute(Boolean.FALSE);
        }
        }__CLR4_4_1ecyecylb90p8ds.R.inc(18735);if ((((!minusList.isEmpty())&&(__CLR4_4_1ecyecylb90p8ds.R.iget(18736)!=0|true))||(__CLR4_4_1ecyecylb90p8ds.R.iget(18737)==0&false))) {{
            __CLR4_4_1ecyecylb90p8ds.R.inc(18738);insertEdges(hyperplaneThickness, node.getMinus(), minusList);
        } }else {{
            __CLR4_4_1ecyecylb90p8ds.R.inc(18739);node.getMinus().setAttribute(Boolean.TRUE);
        }

    }}finally{__CLR4_4_1ecyecylb90p8ds.R.flushNeeded();}}

    /** Internal class for holding vertices while they are processed to build a BSP tree. */
    private static class Vertex {

        /** Vertex location. */
        private final Vector2D location;

        /** Incoming edge. */
        private Edge incoming;

        /** Outgoing edge. */
        private Edge outgoing;

        /** Lines bound with this vertex. */
        private final List<Line> lines;

        /** Build a non-processed vertex not owned by any node yet.
         * @param location vertex location
         */
        public Vertex(final Vector2D location) {try{__CLR4_4_1ecyecylb90p8ds.R.inc(18740);
            __CLR4_4_1ecyecylb90p8ds.R.inc(18741);this.location = location;
            __CLR4_4_1ecyecylb90p8ds.R.inc(18742);this.incoming = null;
            __CLR4_4_1ecyecylb90p8ds.R.inc(18743);this.outgoing = null;
            __CLR4_4_1ecyecylb90p8ds.R.inc(18744);this.lines    = new ArrayList<Line>();
        }finally{__CLR4_4_1ecyecylb90p8ds.R.flushNeeded();}}

        /** Get Vertex location.
         * @return vertex location
         */
        public Vector2D getLocation() {try{__CLR4_4_1ecyecylb90p8ds.R.inc(18745);
            __CLR4_4_1ecyecylb90p8ds.R.inc(18746);return location;
        }finally{__CLR4_4_1ecyecylb90p8ds.R.flushNeeded();}}

        /** Bind a line considered to contain this vertex.
         * @param line line to bind with this vertex
         */
        public void bindWith(final Line line) {try{__CLR4_4_1ecyecylb90p8ds.R.inc(18747);
            __CLR4_4_1ecyecylb90p8ds.R.inc(18748);lines.add(line);
        }finally{__CLR4_4_1ecyecylb90p8ds.R.flushNeeded();}}

        /** Get the common line bound with both the instance and another vertex, if any.
         * <p>
         * When two vertices are both bound to the same line, this means they are
         * already handled by node associated with this line, so there is no need
         * to create a cut hyperplane for them.
         * </p>
         * @param vertex other vertex to check instance against
         * @return line bound with both the instance and another vertex, or null if the
         * two vertices do not share a line yet
         */
        public Line sharedLineWith(final Vertex vertex) {try{__CLR4_4_1ecyecylb90p8ds.R.inc(18749);
            __CLR4_4_1ecyecylb90p8ds.R.inc(18750);for (final Line line1 : lines) {{
                __CLR4_4_1ecyecylb90p8ds.R.inc(18751);for (final Line line2 : vertex.lines) {{
                    __CLR4_4_1ecyecylb90p8ds.R.inc(18752);if ((((line1 == line2)&&(__CLR4_4_1ecyecylb90p8ds.R.iget(18753)!=0|true))||(__CLR4_4_1ecyecylb90p8ds.R.iget(18754)==0&false))) {{
                        __CLR4_4_1ecyecylb90p8ds.R.inc(18755);return line1;
                    }
                }}
            }}
            }__CLR4_4_1ecyecylb90p8ds.R.inc(18756);return null;
        }finally{__CLR4_4_1ecyecylb90p8ds.R.flushNeeded();}}

        /** Set incoming edge.
         * <p>
         * The line supporting the incoming edge is automatically bound
         * with the instance.
         * </p>
         * @param incoming incoming edge
         */
        public void setIncoming(final Edge incoming) {try{__CLR4_4_1ecyecylb90p8ds.R.inc(18757);
            __CLR4_4_1ecyecylb90p8ds.R.inc(18758);this.incoming = incoming;
            __CLR4_4_1ecyecylb90p8ds.R.inc(18759);bindWith(incoming.getLine());
        }finally{__CLR4_4_1ecyecylb90p8ds.R.flushNeeded();}}

        /** Get incoming edge.
         * @return incoming edge
         */
        public Edge getIncoming() {try{__CLR4_4_1ecyecylb90p8ds.R.inc(18760);
            __CLR4_4_1ecyecylb90p8ds.R.inc(18761);return incoming;
        }finally{__CLR4_4_1ecyecylb90p8ds.R.flushNeeded();}}

        /** Set outgoing edge.
         * <p>
         * The line supporting the outgoing edge is automatically bound
         * with the instance.
         * </p>
         * @param outgoing outgoing edge
         */
        public void setOutgoing(final Edge outgoing) {try{__CLR4_4_1ecyecylb90p8ds.R.inc(18762);
            __CLR4_4_1ecyecylb90p8ds.R.inc(18763);this.outgoing = outgoing;
            __CLR4_4_1ecyecylb90p8ds.R.inc(18764);bindWith(outgoing.getLine());
        }finally{__CLR4_4_1ecyecylb90p8ds.R.flushNeeded();}}

        /** Get outgoing edge.
         * @return outgoing edge
         */
        public Edge getOutgoing() {try{__CLR4_4_1ecyecylb90p8ds.R.inc(18765);
            __CLR4_4_1ecyecylb90p8ds.R.inc(18766);return outgoing;
        }finally{__CLR4_4_1ecyecylb90p8ds.R.flushNeeded();}}

    }

    /** Internal class for holding edges while they are processed to build a BSP tree. */
    private static class Edge {

        /** Start vertex. */
        private final Vertex start;

        /** End vertex. */
        private final Vertex end;

        /** Line supporting the edge. */
        private final Line line;

        /** Node whose cut hyperplane contains this edge. */
        private BSPTree<Euclidean2D> node;

        /** Build an edge not contained in any node yet.
         * @param start start vertex
         * @param end end vertex
         * @param line line supporting the edge
         */
        public Edge(final Vertex start, final Vertex end, final Line line) {try{__CLR4_4_1ecyecylb90p8ds.R.inc(18767);

            __CLR4_4_1ecyecylb90p8ds.R.inc(18768);this.start = start;
            __CLR4_4_1ecyecylb90p8ds.R.inc(18769);this.end   = end;
            __CLR4_4_1ecyecylb90p8ds.R.inc(18770);this.line  = line;
            __CLR4_4_1ecyecylb90p8ds.R.inc(18771);this.node  = null;

            // connect the vertices back to the edge
            __CLR4_4_1ecyecylb90p8ds.R.inc(18772);start.setOutgoing(this);
            __CLR4_4_1ecyecylb90p8ds.R.inc(18773);end.setIncoming(this);

        }finally{__CLR4_4_1ecyecylb90p8ds.R.flushNeeded();}}

        /** Get start vertex.
         * @return start vertex
         */
        public Vertex getStart() {try{__CLR4_4_1ecyecylb90p8ds.R.inc(18774);
            __CLR4_4_1ecyecylb90p8ds.R.inc(18775);return start;
        }finally{__CLR4_4_1ecyecylb90p8ds.R.flushNeeded();}}

        /** Get end vertex.
         * @return end vertex
         */
        public Vertex getEnd() {try{__CLR4_4_1ecyecylb90p8ds.R.inc(18776);
            __CLR4_4_1ecyecylb90p8ds.R.inc(18777);return end;
        }finally{__CLR4_4_1ecyecylb90p8ds.R.flushNeeded();}}

        /** Get the line supporting this edge.
         * @return line supporting this edge
         */
        public Line getLine() {try{__CLR4_4_1ecyecylb90p8ds.R.inc(18778);
            __CLR4_4_1ecyecylb90p8ds.R.inc(18779);return line;
        }finally{__CLR4_4_1ecyecylb90p8ds.R.flushNeeded();}}

        /** Set the node whose cut hyperplane contains this edge.
         * @param node node whose cut hyperplane contains this edge
         */
        public void setNode(final BSPTree<Euclidean2D> node) {try{__CLR4_4_1ecyecylb90p8ds.R.inc(18780);
            __CLR4_4_1ecyecylb90p8ds.R.inc(18781);this.node = node;
        }finally{__CLR4_4_1ecyecylb90p8ds.R.flushNeeded();}}

        /** Get the node whose cut hyperplane contains this edge.
         * @return node whose cut hyperplane contains this edge
         * (null if edge has not yet been inserted into the BSP tree)
         */
        public BSPTree<Euclidean2D> getNode() {try{__CLR4_4_1ecyecylb90p8ds.R.inc(18782);
            __CLR4_4_1ecyecylb90p8ds.R.inc(18783);return node;
        }finally{__CLR4_4_1ecyecylb90p8ds.R.flushNeeded();}}

        /** Split the edge.
         * <p>
         * Once split, this edge is not referenced anymore by the vertices,
         * it is replaced by the two half-edges and an intermediate splitting
         * vertex is introduced to connect these two halves.
         * </p>
         * @param splitLine line splitting the edge in two halves
         * @return split vertex (its incoming and outgoing edges are the two halves)
         */
        public Vertex split(final Line splitLine) {try{__CLR4_4_1ecyecylb90p8ds.R.inc(18784);
            __CLR4_4_1ecyecylb90p8ds.R.inc(18785);final Vertex splitVertex = new Vertex(line.intersection(splitLine));
            __CLR4_4_1ecyecylb90p8ds.R.inc(18786);splitVertex.bindWith(splitLine);
            __CLR4_4_1ecyecylb90p8ds.R.inc(18787);final Edge startHalf = new Edge(start, splitVertex, line);
            __CLR4_4_1ecyecylb90p8ds.R.inc(18788);final Edge endHalf   = new Edge(splitVertex, end, line);
            __CLR4_4_1ecyecylb90p8ds.R.inc(18789);startHalf.node = node;
            __CLR4_4_1ecyecylb90p8ds.R.inc(18790);endHalf.node   = node;
            __CLR4_4_1ecyecylb90p8ds.R.inc(18791);return splitVertex;
        }finally{__CLR4_4_1ecyecylb90p8ds.R.flushNeeded();}}

    }

    /** {@inheritDoc} */
    @Override
    public PolygonsSet buildNew(final BSPTree<Euclidean2D> tree) {try{__CLR4_4_1ecyecylb90p8ds.R.inc(18792);
        __CLR4_4_1ecyecylb90p8ds.R.inc(18793);return new PolygonsSet(tree);
    }finally{__CLR4_4_1ecyecylb90p8ds.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    protected void computeGeometricalProperties() {try{__CLR4_4_1ecyecylb90p8ds.R.inc(18794);

        __CLR4_4_1ecyecylb90p8ds.R.inc(18795);final Vector2D[][] v = getVertices();

        __CLR4_4_1ecyecylb90p8ds.R.inc(18796);if ((((v.length == 0)&&(__CLR4_4_1ecyecylb90p8ds.R.iget(18797)!=0|true))||(__CLR4_4_1ecyecylb90p8ds.R.iget(18798)==0&false))) {{
            __CLR4_4_1ecyecylb90p8ds.R.inc(18799);final BSPTree<Euclidean2D> tree = getTree(false);
            __CLR4_4_1ecyecylb90p8ds.R.inc(18800);if ((((tree.getCut() == null && (Boolean) tree.getAttribute())&&(__CLR4_4_1ecyecylb90p8ds.R.iget(18801)!=0|true))||(__CLR4_4_1ecyecylb90p8ds.R.iget(18802)==0&false))) {{
                // the instance covers the whole space
                __CLR4_4_1ecyecylb90p8ds.R.inc(18803);setSize(Double.POSITIVE_INFINITY);
                __CLR4_4_1ecyecylb90p8ds.R.inc(18804);setBarycenter(Vector2D.NaN);
            } }else {{
                __CLR4_4_1ecyecylb90p8ds.R.inc(18805);setSize(0);
                __CLR4_4_1ecyecylb90p8ds.R.inc(18806);setBarycenter(new Vector2D(0, 0));
            }
        }} }else {__CLR4_4_1ecyecylb90p8ds.R.inc(18807);if ((((v[0][0] == null)&&(__CLR4_4_1ecyecylb90p8ds.R.iget(18808)!=0|true))||(__CLR4_4_1ecyecylb90p8ds.R.iget(18809)==0&false))) {{
            // there is at least one open-loop: the polygon is infinite
            __CLR4_4_1ecyecylb90p8ds.R.inc(18810);setSize(Double.POSITIVE_INFINITY);
            __CLR4_4_1ecyecylb90p8ds.R.inc(18811);setBarycenter(Vector2D.NaN);
        } }else {{
            // all loops are closed, we compute some integrals around the shape

            __CLR4_4_1ecyecylb90p8ds.R.inc(18812);double sum  = 0;
            __CLR4_4_1ecyecylb90p8ds.R.inc(18813);double sumX = 0;
            __CLR4_4_1ecyecylb90p8ds.R.inc(18814);double sumY = 0;

            __CLR4_4_1ecyecylb90p8ds.R.inc(18815);for (Vector2D[] loop : v) {{
                __CLR4_4_1ecyecylb90p8ds.R.inc(18816);double x1 = loop[loop.length - 1].getX();
                __CLR4_4_1ecyecylb90p8ds.R.inc(18817);double y1 = loop[loop.length - 1].getY();
                __CLR4_4_1ecyecylb90p8ds.R.inc(18818);for (final Vector2D point : loop) {{
                    __CLR4_4_1ecyecylb90p8ds.R.inc(18819);final double x0 = x1;
                    __CLR4_4_1ecyecylb90p8ds.R.inc(18820);final double y0 = y1;
                    __CLR4_4_1ecyecylb90p8ds.R.inc(18821);x1 = point.getX();
                    __CLR4_4_1ecyecylb90p8ds.R.inc(18822);y1 = point.getY();
                    __CLR4_4_1ecyecylb90p8ds.R.inc(18823);final double factor = x0 * y1 - y0 * x1;
                    __CLR4_4_1ecyecylb90p8ds.R.inc(18824);sum  += factor;
                    __CLR4_4_1ecyecylb90p8ds.R.inc(18825);sumX += factor * (x0 + x1);
                    __CLR4_4_1ecyecylb90p8ds.R.inc(18826);sumY += factor * (y0 + y1);
                }
            }}

            }__CLR4_4_1ecyecylb90p8ds.R.inc(18827);if ((((sum < 0)&&(__CLR4_4_1ecyecylb90p8ds.R.iget(18828)!=0|true))||(__CLR4_4_1ecyecylb90p8ds.R.iget(18829)==0&false))) {{
                // the polygon as a finite outside surrounded by an infinite inside
                __CLR4_4_1ecyecylb90p8ds.R.inc(18830);setSize(Double.POSITIVE_INFINITY);
                __CLR4_4_1ecyecylb90p8ds.R.inc(18831);setBarycenter(Vector2D.NaN);
            } }else {{
                __CLR4_4_1ecyecylb90p8ds.R.inc(18832);setSize(sum / 2);
                __CLR4_4_1ecyecylb90p8ds.R.inc(18833);setBarycenter(new Vector2D(sumX / (3 * sum), sumY / (3 * sum)));
            }

        }}

    }}}finally{__CLR4_4_1ecyecylb90p8ds.R.flushNeeded();}}

    /** Get the vertices of the polygon.
     * <p>The polygon boundary can be represented as an array of loops,
     * each loop being itself an array of vertices.</p>
     * <p>In order to identify open loops which start and end by
     * infinite edges, the open loops arrays start with a null point. In
     * this case, the first non null point and the last point of the
     * array do not represent real vertices, they are dummy points
     * intended only to get the direction of the first and last edge. An
     * open loop consisting of a single infinite line will therefore be
     * represented by a three elements array with one null point
     * followed by two dummy points. The open loops are always the first
     * ones in the loops array.</p>
     * <p>If the polygon has no boundary at all, a zero length loop
     * array will be returned.</p>
     * <p>All line segments in the various loops have the inside of the
     * region on their left side and the outside on their right side
     * when moving in the underlying line direction. This means that
     * closed loops surrounding finite areas obey the direct
     * trigonometric orientation.</p>
     * @return vertices of the polygon, organized as oriented boundary
     * loops with the open loops first (the returned value is guaranteed
     * to be non-null)
     */
    public Vector2D[][] getVertices() {try{__CLR4_4_1ecyecylb90p8ds.R.inc(18834);
        __CLR4_4_1ecyecylb90p8ds.R.inc(18835);if ((((vertices == null)&&(__CLR4_4_1ecyecylb90p8ds.R.iget(18836)!=0|true))||(__CLR4_4_1ecyecylb90p8ds.R.iget(18837)==0&false))) {{
            __CLR4_4_1ecyecylb90p8ds.R.inc(18838);if ((((getTree(false).getCut() == null)&&(__CLR4_4_1ecyecylb90p8ds.R.iget(18839)!=0|true))||(__CLR4_4_1ecyecylb90p8ds.R.iget(18840)==0&false))) {{
                __CLR4_4_1ecyecylb90p8ds.R.inc(18841);vertices = new Vector2D[0][];
            } }else {{

                // sort the segments according to their start point
                __CLR4_4_1ecyecylb90p8ds.R.inc(18842);final SegmentsBuilder visitor = new SegmentsBuilder();
                __CLR4_4_1ecyecylb90p8ds.R.inc(18843);getTree(true).visit(visitor);
                __CLR4_4_1ecyecylb90p8ds.R.inc(18844);final AVLTree<ComparableSegment> sorted = visitor.getSorted();

                // identify the loops, starting from the open ones
                // (their start segments are naturally at the sorted set beginning)
                __CLR4_4_1ecyecylb90p8ds.R.inc(18845);final ArrayList<List<ComparableSegment>> loops = new ArrayList<List<ComparableSegment>>();
                __CLR4_4_1ecyecylb90p8ds.R.inc(18846);while ((((!sorted.isEmpty())&&(__CLR4_4_1ecyecylb90p8ds.R.iget(18847)!=0|true))||(__CLR4_4_1ecyecylb90p8ds.R.iget(18848)==0&false))) {{
                    __CLR4_4_1ecyecylb90p8ds.R.inc(18849);final AVLTree<ComparableSegment>.Node node = sorted.getSmallest();
                    __CLR4_4_1ecyecylb90p8ds.R.inc(18850);final List<ComparableSegment> loop = followLoop(node, sorted);
                    __CLR4_4_1ecyecylb90p8ds.R.inc(18851);if ((((loop != null)&&(__CLR4_4_1ecyecylb90p8ds.R.iget(18852)!=0|true))||(__CLR4_4_1ecyecylb90p8ds.R.iget(18853)==0&false))) {{
                        __CLR4_4_1ecyecylb90p8ds.R.inc(18854);loops.add(loop);
                    }
                }}

                // tranform the loops in an array of arrays of points
                }__CLR4_4_1ecyecylb90p8ds.R.inc(18855);vertices = new Vector2D[loops.size()][];
                __CLR4_4_1ecyecylb90p8ds.R.inc(18856);int i = 0;

                __CLR4_4_1ecyecylb90p8ds.R.inc(18857);for (final List<ComparableSegment> loop : loops) {{
                    __CLR4_4_1ecyecylb90p8ds.R.inc(18858);if ((((loop.size() < 2)&&(__CLR4_4_1ecyecylb90p8ds.R.iget(18859)!=0|true))||(__CLR4_4_1ecyecylb90p8ds.R.iget(18860)==0&false))) {{
                        // single infinite line
                        __CLR4_4_1ecyecylb90p8ds.R.inc(18861);final Line line = loop.get(0).getLine();
                        __CLR4_4_1ecyecylb90p8ds.R.inc(18862);vertices[i++] = new Vector2D[] {
                            null,
                            line.toSpace(new Vector1D(-Float.MAX_VALUE)),
                            line.toSpace(new Vector1D(+Float.MAX_VALUE))
                        };
                    } }else {__CLR4_4_1ecyecylb90p8ds.R.inc(18863);if ((((loop.get(0).getStart() == null)&&(__CLR4_4_1ecyecylb90p8ds.R.iget(18864)!=0|true))||(__CLR4_4_1ecyecylb90p8ds.R.iget(18865)==0&false))) {{
                        // open loop with at least one real point
                        __CLR4_4_1ecyecylb90p8ds.R.inc(18866);final Vector2D[] array = new Vector2D[loop.size() + 2];
                        __CLR4_4_1ecyecylb90p8ds.R.inc(18867);int j = 0;
                        __CLR4_4_1ecyecylb90p8ds.R.inc(18868);for (Segment segment : loop) {{

                            __CLR4_4_1ecyecylb90p8ds.R.inc(18869);if ((((j == 0)&&(__CLR4_4_1ecyecylb90p8ds.R.iget(18870)!=0|true))||(__CLR4_4_1ecyecylb90p8ds.R.iget(18871)==0&false))) {{
                                // null point and first dummy point
                                __CLR4_4_1ecyecylb90p8ds.R.inc(18872);double x = segment.getLine().toSubSpace(segment.getEnd()).getX();
                                __CLR4_4_1ecyecylb90p8ds.R.inc(18873);x -= FastMath.max(1.0, FastMath.abs(x / 2));
                                __CLR4_4_1ecyecylb90p8ds.R.inc(18874);array[j++] = null;
                                __CLR4_4_1ecyecylb90p8ds.R.inc(18875);array[j++] = segment.getLine().toSpace(new Vector1D(x));
                            }

                            }__CLR4_4_1ecyecylb90p8ds.R.inc(18876);if ((((j < (array.length - 1))&&(__CLR4_4_1ecyecylb90p8ds.R.iget(18877)!=0|true))||(__CLR4_4_1ecyecylb90p8ds.R.iget(18878)==0&false))) {{
                                // current point
                                __CLR4_4_1ecyecylb90p8ds.R.inc(18879);array[j++] = segment.getEnd();
                            }

                            }__CLR4_4_1ecyecylb90p8ds.R.inc(18880);if ((((j == (array.length - 1))&&(__CLR4_4_1ecyecylb90p8ds.R.iget(18881)!=0|true))||(__CLR4_4_1ecyecylb90p8ds.R.iget(18882)==0&false))) {{
                                // last dummy point
                                __CLR4_4_1ecyecylb90p8ds.R.inc(18883);double x = segment.getLine().toSubSpace(segment.getStart()).getX();
                                __CLR4_4_1ecyecylb90p8ds.R.inc(18884);x += FastMath.max(1.0, FastMath.abs(x / 2));
                                __CLR4_4_1ecyecylb90p8ds.R.inc(18885);array[j++] = segment.getLine().toSpace(new Vector1D(x));
                            }

                        }}
                        }__CLR4_4_1ecyecylb90p8ds.R.inc(18886);vertices[i++] = array;
                    } }else {{
                        __CLR4_4_1ecyecylb90p8ds.R.inc(18887);final Vector2D[] array = new Vector2D[loop.size()];
                        __CLR4_4_1ecyecylb90p8ds.R.inc(18888);int j = 0;
                        __CLR4_4_1ecyecylb90p8ds.R.inc(18889);for (Segment segment : loop) {{
                            __CLR4_4_1ecyecylb90p8ds.R.inc(18890);array[j++] = segment.getStart();
                        }
                        }__CLR4_4_1ecyecylb90p8ds.R.inc(18891);vertices[i++] = array;
                    }
                }}}

            }}
        }}

        }__CLR4_4_1ecyecylb90p8ds.R.inc(18892);return vertices.clone();

    }finally{__CLR4_4_1ecyecylb90p8ds.R.flushNeeded();}}

    /** Follow a boundary loop.
     * @param node node containing the segment starting the loop
     * @param sorted set of segments belonging to the boundary, sorted by
     * start points (contains {@code node})
     * @return a list of connected sub-hyperplanes starting at
     * {@code node}
     */
    private List<ComparableSegment> followLoop(final AVLTree<ComparableSegment>.Node node,
                                               final AVLTree<ComparableSegment> sorted) {try{__CLR4_4_1ecyecylb90p8ds.R.inc(18893);

        __CLR4_4_1ecyecylb90p8ds.R.inc(18894);final ArrayList<ComparableSegment> loop = new ArrayList<ComparableSegment>();
        __CLR4_4_1ecyecylb90p8ds.R.inc(18895);ComparableSegment segment = node.getElement();
        __CLR4_4_1ecyecylb90p8ds.R.inc(18896);loop.add(segment);
        __CLR4_4_1ecyecylb90p8ds.R.inc(18897);final Vector2D globalStart = segment.getStart();
        __CLR4_4_1ecyecylb90p8ds.R.inc(18898);Vector2D end = segment.getEnd();
        __CLR4_4_1ecyecylb90p8ds.R.inc(18899);node.delete();

        // is this an open or a closed loop ?
        __CLR4_4_1ecyecylb90p8ds.R.inc(18900);final boolean open = segment.getStart() == null;

        __CLR4_4_1ecyecylb90p8ds.R.inc(18901);while (((((end != null) && (open || (globalStart.distance(end) > 1.0e-10)))&&(__CLR4_4_1ecyecylb90p8ds.R.iget(18902)!=0|true))||(__CLR4_4_1ecyecylb90p8ds.R.iget(18903)==0&false))) {{

            // search the sub-hyperplane starting where the previous one ended
            __CLR4_4_1ecyecylb90p8ds.R.inc(18904);AVLTree<ComparableSegment>.Node selectedNode = null;
            __CLR4_4_1ecyecylb90p8ds.R.inc(18905);ComparableSegment       selectedSegment  = null;
            __CLR4_4_1ecyecylb90p8ds.R.inc(18906);double                  selectedDistance = Double.POSITIVE_INFINITY;
            __CLR4_4_1ecyecylb90p8ds.R.inc(18907);final ComparableSegment lowerLeft        = new ComparableSegment(end, -1.0e-10, -1.0e-10);
            __CLR4_4_1ecyecylb90p8ds.R.inc(18908);final ComparableSegment upperRight       = new ComparableSegment(end, +1.0e-10, +1.0e-10);
            __CLR4_4_1ecyecylb90p8ds.R.inc(18909);for (AVLTree<ComparableSegment>.Node n = sorted.getNotSmaller(lowerLeft);
                 ((((n != null) && (n.getElement().compareTo(upperRight) <= 0))&&(__CLR4_4_1ecyecylb90p8ds.R.iget(18910)!=0|true))||(__CLR4_4_1ecyecylb90p8ds.R.iget(18911)==0&false));
                 n = n.getNext()) {{
                __CLR4_4_1ecyecylb90p8ds.R.inc(18912);segment = n.getElement();
                __CLR4_4_1ecyecylb90p8ds.R.inc(18913);final double distance = end.distance(segment.getStart());
                __CLR4_4_1ecyecylb90p8ds.R.inc(18914);if ((((distance < selectedDistance)&&(__CLR4_4_1ecyecylb90p8ds.R.iget(18915)!=0|true))||(__CLR4_4_1ecyecylb90p8ds.R.iget(18916)==0&false))) {{
                    __CLR4_4_1ecyecylb90p8ds.R.inc(18917);selectedNode     = n;
                    __CLR4_4_1ecyecylb90p8ds.R.inc(18918);selectedSegment  = segment;
                    __CLR4_4_1ecyecylb90p8ds.R.inc(18919);selectedDistance = distance;
                }
            }}

            }__CLR4_4_1ecyecylb90p8ds.R.inc(18920);if ((((selectedDistance > 1.0e-10)&&(__CLR4_4_1ecyecylb90p8ds.R.iget(18921)!=0|true))||(__CLR4_4_1ecyecylb90p8ds.R.iget(18922)==0&false))) {{
                // this is a degenerated loop, it probably comes from a very
                // tiny region with some segments smaller than the threshold, we
                // simply ignore it
                __CLR4_4_1ecyecylb90p8ds.R.inc(18923);return null;
            }

            }__CLR4_4_1ecyecylb90p8ds.R.inc(18924);end = selectedSegment.getEnd();
            __CLR4_4_1ecyecylb90p8ds.R.inc(18925);loop.add(selectedSegment);
            __CLR4_4_1ecyecylb90p8ds.R.inc(18926);selectedNode.delete();

        }

        }__CLR4_4_1ecyecylb90p8ds.R.inc(18927);if (((((loop.size() == 2) && !open)&&(__CLR4_4_1ecyecylb90p8ds.R.iget(18928)!=0|true))||(__CLR4_4_1ecyecylb90p8ds.R.iget(18929)==0&false))) {{
            // this is a degenerated infinitely thin loop, we simply ignore it
            __CLR4_4_1ecyecylb90p8ds.R.inc(18930);return null;
        }

        }__CLR4_4_1ecyecylb90p8ds.R.inc(18931);if (((((end == null) && !open)&&(__CLR4_4_1ecyecylb90p8ds.R.iget(18932)!=0|true))||(__CLR4_4_1ecyecylb90p8ds.R.iget(18933)==0&false))) {{
            __CLR4_4_1ecyecylb90p8ds.R.inc(18934);throw new MathInternalError();
        }

        }__CLR4_4_1ecyecylb90p8ds.R.inc(18935);return loop;

    }finally{__CLR4_4_1ecyecylb90p8ds.R.flushNeeded();}}

    /** Private extension of Segment allowing comparison. */
    private static class ComparableSegment extends Segment implements Comparable<ComparableSegment> {

        /** Sorting key. */
        private OrderedTuple sortingKey;

        /** Build a segment.
         * @param start start point of the segment
         * @param end end point of the segment
         * @param line line containing the segment
         */
        public ComparableSegment(final Vector2D start, final Vector2D end, final Line line) {
            super(start, end, line);__CLR4_4_1ecyecylb90p8ds.R.inc(18937);try{__CLR4_4_1ecyecylb90p8ds.R.inc(18936);
            __CLR4_4_1ecyecylb90p8ds.R.inc(18938);sortingKey = ((((start == null) )&&(__CLR4_4_1ecyecylb90p8ds.R.iget(18939)!=0|true))||(__CLR4_4_1ecyecylb90p8ds.R.iget(18940)==0&false))?
                         new OrderedTuple(Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY) :
                         new OrderedTuple(start.getX(), start.getY());
        }finally{__CLR4_4_1ecyecylb90p8ds.R.flushNeeded();}}

        /** Build a dummy segment.
         * <p>
         * The object built is not a real segment, only the sorting key is used to
         * allow searching in the neighborhood of a point. This is an horrible hack ...
         * </p>
         * @param start start point of the segment
         * @param dx abscissa offset from the start point
         * @param dy ordinate offset from the start point
         */
        public ComparableSegment(final Vector2D start, final double dx, final double dy) {
            super(null, null, null);__CLR4_4_1ecyecylb90p8ds.R.inc(18942);try{__CLR4_4_1ecyecylb90p8ds.R.inc(18941);
            __CLR4_4_1ecyecylb90p8ds.R.inc(18943);sortingKey = new OrderedTuple(start.getX() + dx, start.getY() + dy);
        }finally{__CLR4_4_1ecyecylb90p8ds.R.flushNeeded();}}

        /** {@inheritDoc} */
        public int compareTo(final ComparableSegment o) {try{__CLR4_4_1ecyecylb90p8ds.R.inc(18944);
            __CLR4_4_1ecyecylb90p8ds.R.inc(18945);return sortingKey.compareTo(o.sortingKey);
        }finally{__CLR4_4_1ecyecylb90p8ds.R.flushNeeded();}}

        /** {@inheritDoc} */
        @Override
        public boolean equals(final Object other) {try{__CLR4_4_1ecyecylb90p8ds.R.inc(18946);
            __CLR4_4_1ecyecylb90p8ds.R.inc(18947);if ((((this == other)&&(__CLR4_4_1ecyecylb90p8ds.R.iget(18948)!=0|true))||(__CLR4_4_1ecyecylb90p8ds.R.iget(18949)==0&false))) {{
                __CLR4_4_1ecyecylb90p8ds.R.inc(18950);return true;
            } }else {__CLR4_4_1ecyecylb90p8ds.R.inc(18951);if ((((other instanceof ComparableSegment)&&(__CLR4_4_1ecyecylb90p8ds.R.iget(18952)!=0|true))||(__CLR4_4_1ecyecylb90p8ds.R.iget(18953)==0&false))) {{
                __CLR4_4_1ecyecylb90p8ds.R.inc(18954);return compareTo((ComparableSegment) other) == 0;
            } }else {{
                __CLR4_4_1ecyecylb90p8ds.R.inc(18955);return false;
            }
        }}}finally{__CLR4_4_1ecyecylb90p8ds.R.flushNeeded();}}

        /** {@inheritDoc} */
        @Override
        public int hashCode() {try{__CLR4_4_1ecyecylb90p8ds.R.inc(18956);
            __CLR4_4_1ecyecylb90p8ds.R.inc(18957);return getStart().hashCode() ^ getEnd().hashCode() ^
                   getLine().hashCode() ^ sortingKey.hashCode();
        }finally{__CLR4_4_1ecyecylb90p8ds.R.flushNeeded();}}

    }

    /** Visitor building segments. */
    private static class SegmentsBuilder implements BSPTreeVisitor<Euclidean2D> {

        /** Sorted segments. */
        private AVLTree<ComparableSegment> sorted;

        /** Simple constructor. */
        public SegmentsBuilder() {try{__CLR4_4_1ecyecylb90p8ds.R.inc(18958);
            __CLR4_4_1ecyecylb90p8ds.R.inc(18959);sorted = new AVLTree<ComparableSegment>();
        }finally{__CLR4_4_1ecyecylb90p8ds.R.flushNeeded();}}

        /** {@inheritDoc} */
        public Order visitOrder(final BSPTree<Euclidean2D> node) {try{__CLR4_4_1ecyecylb90p8ds.R.inc(18960);
            __CLR4_4_1ecyecylb90p8ds.R.inc(18961);return Order.MINUS_SUB_PLUS;
        }finally{__CLR4_4_1ecyecylb90p8ds.R.flushNeeded();}}

        /** {@inheritDoc} */
        public void visitInternalNode(final BSPTree<Euclidean2D> node) {try{__CLR4_4_1ecyecylb90p8ds.R.inc(18962);
            __CLR4_4_1ecyecylb90p8ds.R.inc(18963);@SuppressWarnings("unchecked")
            final BoundaryAttribute<Euclidean2D> attribute = (BoundaryAttribute<Euclidean2D>) node.getAttribute();
            __CLR4_4_1ecyecylb90p8ds.R.inc(18964);if ((((attribute.getPlusOutside() != null)&&(__CLR4_4_1ecyecylb90p8ds.R.iget(18965)!=0|true))||(__CLR4_4_1ecyecylb90p8ds.R.iget(18966)==0&false))) {{
                __CLR4_4_1ecyecylb90p8ds.R.inc(18967);addContribution(attribute.getPlusOutside(), false);
            }
            }__CLR4_4_1ecyecylb90p8ds.R.inc(18968);if ((((attribute.getPlusInside() != null)&&(__CLR4_4_1ecyecylb90p8ds.R.iget(18969)!=0|true))||(__CLR4_4_1ecyecylb90p8ds.R.iget(18970)==0&false))) {{
                __CLR4_4_1ecyecylb90p8ds.R.inc(18971);addContribution(attribute.getPlusInside(), true);
            }
        }}finally{__CLR4_4_1ecyecylb90p8ds.R.flushNeeded();}}

        /** {@inheritDoc} */
        public void visitLeafNode(final BSPTree<Euclidean2D> node) {try{__CLR4_4_1ecyecylb90p8ds.R.inc(18972);
        }finally{__CLR4_4_1ecyecylb90p8ds.R.flushNeeded();}}

        /** Add he contribution of a boundary facet.
         * @param sub boundary facet
         * @param reversed if true, the facet has the inside on its plus side
         */
        private void addContribution(final SubHyperplane<Euclidean2D> sub, final boolean reversed) {try{__CLR4_4_1ecyecylb90p8ds.R.inc(18973);
            __CLR4_4_1ecyecylb90p8ds.R.inc(18974);@SuppressWarnings("unchecked")
            final AbstractSubHyperplane<Euclidean2D, Euclidean1D> absSub =
                (AbstractSubHyperplane<Euclidean2D, Euclidean1D>) sub;
            __CLR4_4_1ecyecylb90p8ds.R.inc(18975);final Line line      = (Line) sub.getHyperplane();
            __CLR4_4_1ecyecylb90p8ds.R.inc(18976);final List<Interval> intervals = ((IntervalsSet) absSub.getRemainingRegion()).asList();
            __CLR4_4_1ecyecylb90p8ds.R.inc(18977);for (final Interval i : intervals) {{
                __CLR4_4_1ecyecylb90p8ds.R.inc(18978);final Vector2D start = (((Double.isInfinite(i.getInf()) )&&(__CLR4_4_1ecyecylb90p8ds.R.iget(18979)!=0|true))||(__CLR4_4_1ecyecylb90p8ds.R.iget(18980)==0&false))?
                                      null : (Vector2D) line.toSpace(new Vector1D(i.getInf()));
                __CLR4_4_1ecyecylb90p8ds.R.inc(18981);final Vector2D end   = (((Double.isInfinite(i.getSup()) )&&(__CLR4_4_1ecyecylb90p8ds.R.iget(18982)!=0|true))||(__CLR4_4_1ecyecylb90p8ds.R.iget(18983)==0&false))?
                                      null : (Vector2D) line.toSpace(new Vector1D(i.getSup()));
                __CLR4_4_1ecyecylb90p8ds.R.inc(18984);if ((((reversed)&&(__CLR4_4_1ecyecylb90p8ds.R.iget(18985)!=0|true))||(__CLR4_4_1ecyecylb90p8ds.R.iget(18986)==0&false))) {{
                    __CLR4_4_1ecyecylb90p8ds.R.inc(18987);sorted.insert(new ComparableSegment(end, start, line.getReverse()));
                } }else {{
                    __CLR4_4_1ecyecylb90p8ds.R.inc(18988);sorted.insert(new ComparableSegment(start, end, line));
                }
            }}
        }}finally{__CLR4_4_1ecyecylb90p8ds.R.flushNeeded();}}

        /** Get the sorted segments.
         * @return sorted segments
         */
        public AVLTree<ComparableSegment> getSorted() {try{__CLR4_4_1ecyecylb90p8ds.R.inc(18989);
            __CLR4_4_1ecyecylb90p8ds.R.inc(18990);return sorted;
        }finally{__CLR4_4_1ecyecylb90p8ds.R.flushNeeded();}}

    }

}
