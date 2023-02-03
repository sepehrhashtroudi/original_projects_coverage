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

import java.awt.geom.AffineTransform;
import java.util.Collection;

import org.apache.commons.math3.geometry.Vector;
import org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D;
import org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D;
import org.apache.commons.math3.geometry.euclidean.twod.SubLine;
import org.apache.commons.math3.geometry.euclidean.twod.Vector2D;
import org.apache.commons.math3.geometry.partitioning.AbstractRegion;
import org.apache.commons.math3.geometry.partitioning.BSPTree;
import org.apache.commons.math3.geometry.partitioning.BSPTreeVisitor;
import org.apache.commons.math3.geometry.partitioning.BoundaryAttribute;
import org.apache.commons.math3.geometry.partitioning.Hyperplane;
import org.apache.commons.math3.geometry.partitioning.Region;
import org.apache.commons.math3.geometry.partitioning.RegionFactory;
import org.apache.commons.math3.geometry.partitioning.SubHyperplane;
import org.apache.commons.math3.geometry.partitioning.Transform;
import org.apache.commons.math3.util.FastMath;

/** This class represents a 3D region: a set of polyhedrons.
 * @version $Id$
 * @since 3.0
 */
public class PolyhedronsSet extends AbstractRegion<Euclidean3D, Euclidean2D> {public static class __CLR4_4_1dekdeklb90p89t{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,17538,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** Build a polyhedrons set representing the whole real line.
     */
    public PolyhedronsSet() {
        super();__CLR4_4_1dekdeklb90p89t.R.inc(17373);try{__CLR4_4_1dekdeklb90p89t.R.inc(17372);
    }finally{__CLR4_4_1dekdeklb90p89t.R.flushNeeded();}}

    /** Build a polyhedrons set from a BSP tree.
     * <p>The leaf nodes of the BSP tree <em>must</em> have a
     * {@code Boolean} attribute representing the inside status of
     * the corresponding cell (true for inside cells, false for outside
     * cells). In order to avoid building too many small objects, it is
     * recommended to use the predefined constants
     * {@code Boolean.TRUE} and {@code Boolean.FALSE}</p>
     * @param tree inside/outside BSP tree representing the region
     */
    public PolyhedronsSet(final BSPTree<Euclidean3D> tree) {
        super(tree);__CLR4_4_1dekdeklb90p89t.R.inc(17375);try{__CLR4_4_1dekdeklb90p89t.R.inc(17374);
    }finally{__CLR4_4_1dekdeklb90p89t.R.flushNeeded();}}

    /** Build a polyhedrons set from a Boundary REPresentation (B-rep).
     * <p>The boundary is provided as a collection of {@link
     * SubHyperplane sub-hyperplanes}. Each sub-hyperplane has the
     * interior part of the region on its minus side and the exterior on
     * its plus side.</p>
     * <p>The boundary elements can be in any order, and can form
     * several non-connected sets (like for example polyhedrons with holes
     * or a set of disjoint polyhedrons considered as a whole). In
     * fact, the elements do not even need to be connected together
     * (their topological connections are not used here). However, if the
     * boundary does not really separate an inside open from an outside
     * open (open having here its topological meaning), then subsequent
     * calls to the {@link Region#checkPoint(Vector) checkPoint} method will
     * not be meaningful anymore.</p>
     * <p>If the boundary is empty, the region will represent the whole
     * space.</p>
     * @param boundary collection of boundary elements, as a
     * collection of {@link SubHyperplane SubHyperplane} objects
     */
    public PolyhedronsSet(final Collection<SubHyperplane<Euclidean3D>> boundary) {
        super(boundary);__CLR4_4_1dekdeklb90p89t.R.inc(17377);try{__CLR4_4_1dekdeklb90p89t.R.inc(17376);
    }finally{__CLR4_4_1dekdeklb90p89t.R.flushNeeded();}}

    /** Build a parallellepipedic box.
     * @param xMin low bound along the x direction
     * @param xMax high bound along the x direction
     * @param yMin low bound along the y direction
     * @param yMax high bound along the y direction
     * @param zMin low bound along the z direction
     * @param zMax high bound along the z direction
     */
    public PolyhedronsSet(final double xMin, final double xMax,
                          final double yMin, final double yMax,
                          final double zMin, final double zMax) {
        super(buildBoundary(xMin, xMax, yMin, yMax, zMin, zMax));__CLR4_4_1dekdeklb90p89t.R.inc(17379);try{__CLR4_4_1dekdeklb90p89t.R.inc(17378);
    }finally{__CLR4_4_1dekdeklb90p89t.R.flushNeeded();}}

    /** Build a parallellepipedic box boundary.
     * @param xMin low bound along the x direction
     * @param xMax high bound along the x direction
     * @param yMin low bound along the y direction
     * @param yMax high bound along the y direction
     * @param zMin low bound along the z direction
     * @param zMax high bound along the z direction
     * @return boundary tree
     */
    private static BSPTree<Euclidean3D> buildBoundary(final double xMin, final double xMax,
                                                      final double yMin, final double yMax,
                                                      final double zMin, final double zMax) {try{__CLR4_4_1dekdeklb90p89t.R.inc(17380);
        __CLR4_4_1dekdeklb90p89t.R.inc(17381);final Plane pxMin = new Plane(new Vector3D(xMin, 0,    0),   Vector3D.MINUS_I);
        __CLR4_4_1dekdeklb90p89t.R.inc(17382);final Plane pxMax = new Plane(new Vector3D(xMax, 0,    0),   Vector3D.PLUS_I);
        __CLR4_4_1dekdeklb90p89t.R.inc(17383);final Plane pyMin = new Plane(new Vector3D(0,    yMin, 0),   Vector3D.MINUS_J);
        __CLR4_4_1dekdeklb90p89t.R.inc(17384);final Plane pyMax = new Plane(new Vector3D(0,    yMax, 0),   Vector3D.PLUS_J);
        __CLR4_4_1dekdeklb90p89t.R.inc(17385);final Plane pzMin = new Plane(new Vector3D(0,    0,   zMin), Vector3D.MINUS_K);
        __CLR4_4_1dekdeklb90p89t.R.inc(17386);final Plane pzMax = new Plane(new Vector3D(0,    0,   zMax), Vector3D.PLUS_K);
        __CLR4_4_1dekdeklb90p89t.R.inc(17387);@SuppressWarnings("unchecked")
        final Region<Euclidean3D> boundary =
        new RegionFactory<Euclidean3D>().buildConvex(pxMin, pxMax, pyMin, pyMax, pzMin, pzMax);
        __CLR4_4_1dekdeklb90p89t.R.inc(17388);return boundary.getTree(false);
    }finally{__CLR4_4_1dekdeklb90p89t.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public PolyhedronsSet buildNew(final BSPTree<Euclidean3D> tree) {try{__CLR4_4_1dekdeklb90p89t.R.inc(17389);
        __CLR4_4_1dekdeklb90p89t.R.inc(17390);return new PolyhedronsSet(tree);
    }finally{__CLR4_4_1dekdeklb90p89t.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    protected void computeGeometricalProperties() {try{__CLR4_4_1dekdeklb90p89t.R.inc(17391);

        // compute the contribution of all boundary facets
        __CLR4_4_1dekdeklb90p89t.R.inc(17392);getTree(true).visit(new FacetsContributionVisitor());

        __CLR4_4_1dekdeklb90p89t.R.inc(17393);if ((((getSize() < 0)&&(__CLR4_4_1dekdeklb90p89t.R.iget(17394)!=0|true))||(__CLR4_4_1dekdeklb90p89t.R.iget(17395)==0&false))) {{
            // the polyhedrons set as a finite outside
            // surrounded by an infinite inside
            __CLR4_4_1dekdeklb90p89t.R.inc(17396);setSize(Double.POSITIVE_INFINITY);
            __CLR4_4_1dekdeklb90p89t.R.inc(17397);setBarycenter(Vector3D.NaN);
        } }else {{
            // the polyhedrons set is finite, apply the remaining scaling factors
            __CLR4_4_1dekdeklb90p89t.R.inc(17398);setSize(getSize() / 3.0);
            __CLR4_4_1dekdeklb90p89t.R.inc(17399);setBarycenter(new Vector3D(1.0 / (4 * getSize()), (Vector3D) getBarycenter()));
        }

    }}finally{__CLR4_4_1dekdeklb90p89t.R.flushNeeded();}}

    /** Visitor computing geometrical properties. */
    private class FacetsContributionVisitor implements BSPTreeVisitor<Euclidean3D> {

        /** Simple constructor. */
        public FacetsContributionVisitor() {try{__CLR4_4_1dekdeklb90p89t.R.inc(17400);
            __CLR4_4_1dekdeklb90p89t.R.inc(17401);setSize(0);
            __CLR4_4_1dekdeklb90p89t.R.inc(17402);setBarycenter(new Vector3D(0, 0, 0));
        }finally{__CLR4_4_1dekdeklb90p89t.R.flushNeeded();}}

        /** {@inheritDoc} */
        public Order visitOrder(final BSPTree<Euclidean3D> node) {try{__CLR4_4_1dekdeklb90p89t.R.inc(17403);
            __CLR4_4_1dekdeklb90p89t.R.inc(17404);return Order.MINUS_SUB_PLUS;
        }finally{__CLR4_4_1dekdeklb90p89t.R.flushNeeded();}}

        /** {@inheritDoc} */
        public void visitInternalNode(final BSPTree<Euclidean3D> node) {try{__CLR4_4_1dekdeklb90p89t.R.inc(17405);
            __CLR4_4_1dekdeklb90p89t.R.inc(17406);@SuppressWarnings("unchecked")
            final BoundaryAttribute<Euclidean3D> attribute =
                (BoundaryAttribute<Euclidean3D>) node.getAttribute();
            __CLR4_4_1dekdeklb90p89t.R.inc(17407);if ((((attribute.getPlusOutside() != null)&&(__CLR4_4_1dekdeklb90p89t.R.iget(17408)!=0|true))||(__CLR4_4_1dekdeklb90p89t.R.iget(17409)==0&false))) {{
                __CLR4_4_1dekdeklb90p89t.R.inc(17410);addContribution(attribute.getPlusOutside(), false);
            }
            }__CLR4_4_1dekdeklb90p89t.R.inc(17411);if ((((attribute.getPlusInside() != null)&&(__CLR4_4_1dekdeklb90p89t.R.iget(17412)!=0|true))||(__CLR4_4_1dekdeklb90p89t.R.iget(17413)==0&false))) {{
                __CLR4_4_1dekdeklb90p89t.R.inc(17414);addContribution(attribute.getPlusInside(), true);
            }
        }}finally{__CLR4_4_1dekdeklb90p89t.R.flushNeeded();}}

        /** {@inheritDoc} */
        public void visitLeafNode(final BSPTree<Euclidean3D> node) {try{__CLR4_4_1dekdeklb90p89t.R.inc(17415);
        }finally{__CLR4_4_1dekdeklb90p89t.R.flushNeeded();}}

        /** Add he contribution of a boundary facet.
         * @param facet boundary facet
         * @param reversed if true, the facet has the inside on its plus side
         */
        private void addContribution(final SubHyperplane<Euclidean3D> facet, final boolean reversed) {try{__CLR4_4_1dekdeklb90p89t.R.inc(17416);

            __CLR4_4_1dekdeklb90p89t.R.inc(17417);final Region<Euclidean2D> polygon = ((SubPlane) facet).getRemainingRegion();
            __CLR4_4_1dekdeklb90p89t.R.inc(17418);final double area    = polygon.getSize();

            __CLR4_4_1dekdeklb90p89t.R.inc(17419);if ((((Double.isInfinite(area))&&(__CLR4_4_1dekdeklb90p89t.R.iget(17420)!=0|true))||(__CLR4_4_1dekdeklb90p89t.R.iget(17421)==0&false))) {{
                __CLR4_4_1dekdeklb90p89t.R.inc(17422);setSize(Double.POSITIVE_INFINITY);
                __CLR4_4_1dekdeklb90p89t.R.inc(17423);setBarycenter(Vector3D.NaN);
            } }else {{

                __CLR4_4_1dekdeklb90p89t.R.inc(17424);final Plane    plane  = (Plane) facet.getHyperplane();
                __CLR4_4_1dekdeklb90p89t.R.inc(17425);final Vector3D facetB = plane.toSpace(polygon.getBarycenter());
                __CLR4_4_1dekdeklb90p89t.R.inc(17426);double   scaled = area * facetB.dotProduct(plane.getNormal());
                __CLR4_4_1dekdeklb90p89t.R.inc(17427);if ((((reversed)&&(__CLR4_4_1dekdeklb90p89t.R.iget(17428)!=0|true))||(__CLR4_4_1dekdeklb90p89t.R.iget(17429)==0&false))) {{
                    __CLR4_4_1dekdeklb90p89t.R.inc(17430);scaled = -scaled;
                }

                }__CLR4_4_1dekdeklb90p89t.R.inc(17431);setSize(getSize() + scaled);
                __CLR4_4_1dekdeklb90p89t.R.inc(17432);setBarycenter(new Vector3D(1.0, (Vector3D) getBarycenter(), scaled, facetB));

            }

        }}finally{__CLR4_4_1dekdeklb90p89t.R.flushNeeded();}}

    }

    /** Get the first sub-hyperplane crossed by a semi-infinite line.
     * @param point start point of the part of the line considered
     * @param line line to consider (contains point)
     * @return the first sub-hyperplaned crossed by the line after the
     * given point, or null if the line does not intersect any
     * sub-hyperplaned
     */
    public SubHyperplane<Euclidean3D> firstIntersection(final Vector3D point, final Line line) {try{__CLR4_4_1dekdeklb90p89t.R.inc(17433);
        __CLR4_4_1dekdeklb90p89t.R.inc(17434);return recurseFirstIntersection(getTree(true), point, line);
    }finally{__CLR4_4_1dekdeklb90p89t.R.flushNeeded();}}

    /** Get the first sub-hyperplane crossed by a semi-infinite line.
     * @param node current node
     * @param point start point of the part of the line considered
     * @param line line to consider (contains point)
     * @return the first sub-hyperplaned crossed by the line after the
     * given point, or null if the line does not intersect any
     * sub-hyperplaned
     */
    private SubHyperplane<Euclidean3D> recurseFirstIntersection(final BSPTree<Euclidean3D> node,
                                                                final Vector3D point,
                                                                final Line line) {try{__CLR4_4_1dekdeklb90p89t.R.inc(17435);

        __CLR4_4_1dekdeklb90p89t.R.inc(17436);final SubHyperplane<Euclidean3D> cut = node.getCut();
        __CLR4_4_1dekdeklb90p89t.R.inc(17437);if ((((cut == null)&&(__CLR4_4_1dekdeklb90p89t.R.iget(17438)!=0|true))||(__CLR4_4_1dekdeklb90p89t.R.iget(17439)==0&false))) {{
            __CLR4_4_1dekdeklb90p89t.R.inc(17440);return null;
        }
        }__CLR4_4_1dekdeklb90p89t.R.inc(17441);final BSPTree<Euclidean3D> minus = node.getMinus();
        __CLR4_4_1dekdeklb90p89t.R.inc(17442);final BSPTree<Euclidean3D> plus  = node.getPlus();
        __CLR4_4_1dekdeklb90p89t.R.inc(17443);final Plane               plane = (Plane) cut.getHyperplane();

        // establish search order
        __CLR4_4_1dekdeklb90p89t.R.inc(17444);final double offset = plane.getOffset(point);
        __CLR4_4_1dekdeklb90p89t.R.inc(17445);final boolean in    = FastMath.abs(offset) < 1.0e-10;
        __CLR4_4_1dekdeklb90p89t.R.inc(17446);final BSPTree<Euclidean3D> near;
        __CLR4_4_1dekdeklb90p89t.R.inc(17447);final BSPTree<Euclidean3D> far;
        __CLR4_4_1dekdeklb90p89t.R.inc(17448);if ((((offset < 0)&&(__CLR4_4_1dekdeklb90p89t.R.iget(17449)!=0|true))||(__CLR4_4_1dekdeklb90p89t.R.iget(17450)==0&false))) {{
            __CLR4_4_1dekdeklb90p89t.R.inc(17451);near = minus;
            __CLR4_4_1dekdeklb90p89t.R.inc(17452);far  = plus;
        } }else {{
            __CLR4_4_1dekdeklb90p89t.R.inc(17453);near = plus;
            __CLR4_4_1dekdeklb90p89t.R.inc(17454);far  = minus;
        }

        }__CLR4_4_1dekdeklb90p89t.R.inc(17455);if ((((in)&&(__CLR4_4_1dekdeklb90p89t.R.iget(17456)!=0|true))||(__CLR4_4_1dekdeklb90p89t.R.iget(17457)==0&false))) {{
            // search in the cut hyperplane
            __CLR4_4_1dekdeklb90p89t.R.inc(17458);final SubHyperplane<Euclidean3D> facet = boundaryFacet(point, node);
            __CLR4_4_1dekdeklb90p89t.R.inc(17459);if ((((facet != null)&&(__CLR4_4_1dekdeklb90p89t.R.iget(17460)!=0|true))||(__CLR4_4_1dekdeklb90p89t.R.iget(17461)==0&false))) {{
                __CLR4_4_1dekdeklb90p89t.R.inc(17462);return facet;
            }
        }}

        // search in the near branch
        }__CLR4_4_1dekdeklb90p89t.R.inc(17463);final SubHyperplane<Euclidean3D> crossed = recurseFirstIntersection(near, point, line);
        __CLR4_4_1dekdeklb90p89t.R.inc(17464);if ((((crossed != null)&&(__CLR4_4_1dekdeklb90p89t.R.iget(17465)!=0|true))||(__CLR4_4_1dekdeklb90p89t.R.iget(17466)==0&false))) {{
            __CLR4_4_1dekdeklb90p89t.R.inc(17467);return crossed;
        }

        }__CLR4_4_1dekdeklb90p89t.R.inc(17468);if ((((!in)&&(__CLR4_4_1dekdeklb90p89t.R.iget(17469)!=0|true))||(__CLR4_4_1dekdeklb90p89t.R.iget(17470)==0&false))) {{
            // search in the cut hyperplane
            __CLR4_4_1dekdeklb90p89t.R.inc(17471);final Vector3D hit3D = plane.intersection(line);
            __CLR4_4_1dekdeklb90p89t.R.inc(17472);if ((((hit3D != null)&&(__CLR4_4_1dekdeklb90p89t.R.iget(17473)!=0|true))||(__CLR4_4_1dekdeklb90p89t.R.iget(17474)==0&false))) {{
                __CLR4_4_1dekdeklb90p89t.R.inc(17475);final SubHyperplane<Euclidean3D> facet = boundaryFacet(hit3D, node);
                __CLR4_4_1dekdeklb90p89t.R.inc(17476);if ((((facet != null)&&(__CLR4_4_1dekdeklb90p89t.R.iget(17477)!=0|true))||(__CLR4_4_1dekdeklb90p89t.R.iget(17478)==0&false))) {{
                    __CLR4_4_1dekdeklb90p89t.R.inc(17479);return facet;
                }
            }}
        }}

        // search in the far branch
        }__CLR4_4_1dekdeklb90p89t.R.inc(17480);return recurseFirstIntersection(far, point, line);

    }finally{__CLR4_4_1dekdeklb90p89t.R.flushNeeded();}}

    /** Check if a point belongs to the boundary part of a node.
     * @param point point to check
     * @param node node containing the boundary facet to check
     * @return the boundary facet this points belongs to (or null if it
     * does not belong to any boundary facet)
     */
    private SubHyperplane<Euclidean3D> boundaryFacet(final Vector3D point,
                                                     final BSPTree<Euclidean3D> node) {try{__CLR4_4_1dekdeklb90p89t.R.inc(17481);
        __CLR4_4_1dekdeklb90p89t.R.inc(17482);final Vector2D point2D = ((Plane) node.getCut().getHyperplane()).toSubSpace(point);
        __CLR4_4_1dekdeklb90p89t.R.inc(17483);@SuppressWarnings("unchecked")
        final BoundaryAttribute<Euclidean3D> attribute =
            (BoundaryAttribute<Euclidean3D>) node.getAttribute();
        __CLR4_4_1dekdeklb90p89t.R.inc(17484);if (((((attribute.getPlusOutside() != null) &&
            (((SubPlane) attribute.getPlusOutside()).getRemainingRegion().checkPoint(point2D) == Location.INSIDE))&&(__CLR4_4_1dekdeklb90p89t.R.iget(17485)!=0|true))||(__CLR4_4_1dekdeklb90p89t.R.iget(17486)==0&false))) {{
            __CLR4_4_1dekdeklb90p89t.R.inc(17487);return attribute.getPlusOutside();
        }
        }__CLR4_4_1dekdeklb90p89t.R.inc(17488);if (((((attribute.getPlusInside() != null) &&
            (((SubPlane) attribute.getPlusInside()).getRemainingRegion().checkPoint(point2D) == Location.INSIDE))&&(__CLR4_4_1dekdeklb90p89t.R.iget(17489)!=0|true))||(__CLR4_4_1dekdeklb90p89t.R.iget(17490)==0&false))) {{
            __CLR4_4_1dekdeklb90p89t.R.inc(17491);return attribute.getPlusInside();
        }
        }__CLR4_4_1dekdeklb90p89t.R.inc(17492);return null;
    }finally{__CLR4_4_1dekdeklb90p89t.R.flushNeeded();}}

    /** Rotate the region around the specified point.
     * <p>The instance is not modified, a new instance is created.</p>
     * @param center rotation center
     * @param rotation vectorial rotation operator
     * @return a new instance representing the rotated region
     */
    public PolyhedronsSet rotate(final Vector3D center, final Rotation rotation) {try{__CLR4_4_1dekdeklb90p89t.R.inc(17493);
        __CLR4_4_1dekdeklb90p89t.R.inc(17494);return (PolyhedronsSet) applyTransform(new RotationTransform(center, rotation));
    }finally{__CLR4_4_1dekdeklb90p89t.R.flushNeeded();}}

    /** 3D rotation as a Transform. */
    private static class RotationTransform implements Transform<Euclidean3D, Euclidean2D> {

        /** Center point of the rotation. */
        private Vector3D   center;

        /** Vectorial rotation. */
        private Rotation   rotation;

        /** Cached original hyperplane. */
        private Plane cachedOriginal;

        /** Cached 2D transform valid inside the cached original hyperplane. */
        private Transform<Euclidean2D, Euclidean1D>  cachedTransform;

        /** Build a rotation transform.
         * @param center center point of the rotation
         * @param rotation vectorial rotation
         */
        public RotationTransform(final Vector3D center, final Rotation rotation) {try{__CLR4_4_1dekdeklb90p89t.R.inc(17495);
            __CLR4_4_1dekdeklb90p89t.R.inc(17496);this.center   = center;
            __CLR4_4_1dekdeklb90p89t.R.inc(17497);this.rotation = rotation;
        }finally{__CLR4_4_1dekdeklb90p89t.R.flushNeeded();}}

        /** {@inheritDoc} */
        public Vector3D apply(final Vector<Euclidean3D> point) {try{__CLR4_4_1dekdeklb90p89t.R.inc(17498);
            __CLR4_4_1dekdeklb90p89t.R.inc(17499);final Vector3D delta = ((Vector3D) point).subtract(center);
            __CLR4_4_1dekdeklb90p89t.R.inc(17500);return new Vector3D(1.0, center, 1.0, rotation.applyTo(delta));
        }finally{__CLR4_4_1dekdeklb90p89t.R.flushNeeded();}}

        /** {@inheritDoc} */
        public Plane apply(final Hyperplane<Euclidean3D> hyperplane) {try{__CLR4_4_1dekdeklb90p89t.R.inc(17501);
            __CLR4_4_1dekdeklb90p89t.R.inc(17502);return ((Plane) hyperplane).rotate(center, rotation);
        }finally{__CLR4_4_1dekdeklb90p89t.R.flushNeeded();}}

        /** {@inheritDoc} */
        public SubHyperplane<Euclidean2D> apply(final SubHyperplane<Euclidean2D> sub,
                                                final Hyperplane<Euclidean3D> original,
                                                final Hyperplane<Euclidean3D> transformed) {try{__CLR4_4_1dekdeklb90p89t.R.inc(17503);
            __CLR4_4_1dekdeklb90p89t.R.inc(17504);if ((((original != cachedOriginal)&&(__CLR4_4_1dekdeklb90p89t.R.iget(17505)!=0|true))||(__CLR4_4_1dekdeklb90p89t.R.iget(17506)==0&false))) {{
                // we have changed hyperplane, reset the in-hyperplane transform

                __CLR4_4_1dekdeklb90p89t.R.inc(17507);final Plane    oPlane = (Plane) original;
                __CLR4_4_1dekdeklb90p89t.R.inc(17508);final Plane    tPlane = (Plane) transformed;
                __CLR4_4_1dekdeklb90p89t.R.inc(17509);final Vector3D p00    = oPlane.getOrigin();
                __CLR4_4_1dekdeklb90p89t.R.inc(17510);final Vector3D p10    = oPlane.toSpace(new Vector2D(1.0, 0.0));
                __CLR4_4_1dekdeklb90p89t.R.inc(17511);final Vector3D p01    = oPlane.toSpace(new Vector2D(0.0, 1.0));
                __CLR4_4_1dekdeklb90p89t.R.inc(17512);final Vector2D tP00   = tPlane.toSubSpace(apply(p00));
                __CLR4_4_1dekdeklb90p89t.R.inc(17513);final Vector2D tP10   = tPlane.toSubSpace(apply(p10));
                __CLR4_4_1dekdeklb90p89t.R.inc(17514);final Vector2D tP01   = tPlane.toSubSpace(apply(p01));
                __CLR4_4_1dekdeklb90p89t.R.inc(17515);final AffineTransform at =
                    new AffineTransform(tP10.getX() - tP00.getX(), tP10.getY() - tP00.getY(),
                                        tP01.getX() - tP00.getX(), tP01.getY() - tP00.getY(),
                                        tP00.getX(), tP00.getY());

                __CLR4_4_1dekdeklb90p89t.R.inc(17516);cachedOriginal  = (Plane) original;
                __CLR4_4_1dekdeklb90p89t.R.inc(17517);cachedTransform = org.apache.commons.math3.geometry.euclidean.twod.Line.getTransform(at);

            }
            }__CLR4_4_1dekdeklb90p89t.R.inc(17518);return ((SubLine) sub).applyTransform(cachedTransform);
        }finally{__CLR4_4_1dekdeklb90p89t.R.flushNeeded();}}

    }

    /** Translate the region by the specified amount.
     * <p>The instance is not modified, a new instance is created.</p>
     * @param translation translation to apply
     * @return a new instance representing the translated region
     */
    public PolyhedronsSet translate(final Vector3D translation) {try{__CLR4_4_1dekdeklb90p89t.R.inc(17519);
        __CLR4_4_1dekdeklb90p89t.R.inc(17520);return (PolyhedronsSet) applyTransform(new TranslationTransform(translation));
    }finally{__CLR4_4_1dekdeklb90p89t.R.flushNeeded();}}

    /** 3D translation as a transform. */
    private static class TranslationTransform implements Transform<Euclidean3D, Euclidean2D> {

        /** Translation vector. */
        private Vector3D   translation;

        /** Cached original hyperplane. */
        private Plane cachedOriginal;

        /** Cached 2D transform valid inside the cached original hyperplane. */
        private Transform<Euclidean2D, Euclidean1D>  cachedTransform;

        /** Build a translation transform.
         * @param translation translation vector
         */
        public TranslationTransform(final Vector3D translation) {try{__CLR4_4_1dekdeklb90p89t.R.inc(17521);
            __CLR4_4_1dekdeklb90p89t.R.inc(17522);this.translation = translation;
        }finally{__CLR4_4_1dekdeklb90p89t.R.flushNeeded();}}

        /** {@inheritDoc} */
        public Vector3D apply(final Vector<Euclidean3D> point) {try{__CLR4_4_1dekdeklb90p89t.R.inc(17523);
            __CLR4_4_1dekdeklb90p89t.R.inc(17524);return new Vector3D(1.0, (Vector3D) point, 1.0, translation);
        }finally{__CLR4_4_1dekdeklb90p89t.R.flushNeeded();}}

        /** {@inheritDoc} */
        public Plane apply(final Hyperplane<Euclidean3D> hyperplane) {try{__CLR4_4_1dekdeklb90p89t.R.inc(17525);
            __CLR4_4_1dekdeklb90p89t.R.inc(17526);return ((Plane) hyperplane).translate(translation);
        }finally{__CLR4_4_1dekdeklb90p89t.R.flushNeeded();}}

        /** {@inheritDoc} */
        public SubHyperplane<Euclidean2D> apply(final SubHyperplane<Euclidean2D> sub,
                                                final Hyperplane<Euclidean3D> original,
                                                final Hyperplane<Euclidean3D> transformed) {try{__CLR4_4_1dekdeklb90p89t.R.inc(17527);
            __CLR4_4_1dekdeklb90p89t.R.inc(17528);if ((((original != cachedOriginal)&&(__CLR4_4_1dekdeklb90p89t.R.iget(17529)!=0|true))||(__CLR4_4_1dekdeklb90p89t.R.iget(17530)==0&false))) {{
                // we have changed hyperplane, reset the in-hyperplane transform

                __CLR4_4_1dekdeklb90p89t.R.inc(17531);final Plane   oPlane = (Plane) original;
                __CLR4_4_1dekdeklb90p89t.R.inc(17532);final Plane   tPlane = (Plane) transformed;
                __CLR4_4_1dekdeklb90p89t.R.inc(17533);final Vector2D shift  = tPlane.toSubSpace(apply(oPlane.getOrigin()));
                __CLR4_4_1dekdeklb90p89t.R.inc(17534);final AffineTransform at =
                    AffineTransform.getTranslateInstance(shift.getX(), shift.getY());

                __CLR4_4_1dekdeklb90p89t.R.inc(17535);cachedOriginal  = (Plane) original;
                __CLR4_4_1dekdeklb90p89t.R.inc(17536);cachedTransform =
                        org.apache.commons.math3.geometry.euclidean.twod.Line.getTransform(at);

            }

            }__CLR4_4_1dekdeklb90p89t.R.inc(17537);return ((SubLine) sub).applyTransform(cachedTransform);

        }finally{__CLR4_4_1dekdeklb90p89t.R.flushNeeded();}}

    }

}
