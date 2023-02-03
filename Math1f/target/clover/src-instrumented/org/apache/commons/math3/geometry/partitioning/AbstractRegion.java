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
package org.apache.commons.math3.geometry.partitioning;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

import org.apache.commons.math3.exception.MathInternalError;
import org.apache.commons.math3.geometry.Space;
import org.apache.commons.math3.geometry.Vector;

/** Abstract class for all regions, independently of geometry type or dimension.

 * @param <S> Type of the space.
 * @param <T> Type of the sub-space.

 * @version $Id$
 * @since 3.0
 */
@java.lang.SuppressWarnings({"fallthrough"}) public abstract class AbstractRegion<S extends Space, T extends Space> implements Region<S> {public static class __CLR4_4_1eukeuklb90p8fi{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,19584,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** Inside/Outside BSP tree. */
    private BSPTree<S> tree;

    /** Size of the instance. */
    private double size;

    /** Barycenter. */
    private Vector<S> barycenter;

    /** Build a region representing the whole space.
     */
    protected AbstractRegion() {try{__CLR4_4_1eukeuklb90p8fi.R.inc(19244);
        __CLR4_4_1eukeuklb90p8fi.R.inc(19245);tree = new BSPTree<S>(Boolean.TRUE);
    }finally{__CLR4_4_1eukeuklb90p8fi.R.flushNeeded();}}

    /** Build a region from an inside/outside BSP tree.
     * <p>The leaf nodes of the BSP tree <em>must</em> have a
     * {@code Boolean} attribute representing the inside status of
     * the corresponding cell (true for inside cells, false for outside
     * cells). In order to avoid building too many small objects, it is
     * recommended to use the predefined constants
     * {@code Boolean.TRUE} and {@code Boolean.FALSE}. The
     * tree also <em>must</em> have either null internal nodes or
     * internal nodes representing the boundary as specified in the
     * {@link #getTree getTree} method).</p>
     * @param tree inside/outside BSP tree representing the region
     */
    protected AbstractRegion(final BSPTree<S> tree) {try{__CLR4_4_1eukeuklb90p8fi.R.inc(19246);
        __CLR4_4_1eukeuklb90p8fi.R.inc(19247);this.tree = tree;
    }finally{__CLR4_4_1eukeuklb90p8fi.R.flushNeeded();}}

    /** Build a Region from a Boundary REPresentation (B-rep).
     * <p>The boundary is provided as a collection of {@link
     * SubHyperplane sub-hyperplanes}. Each sub-hyperplane has the
     * interior part of the region on its minus side and the exterior on
     * its plus side.</p>
     * <p>The boundary elements can be in any order, and can form
     * several non-connected sets (like for example polygons with holes
     * or a set of disjoints polyhedrons considered as a whole). In
     * fact, the elements do not even need to be connected together
     * (their topological connections are not used here). However, if the
     * boundary does not really separate an inside open from an outside
     * open (open having here its topological meaning), then subsequent
     * calls to the {@link #checkPoint(Vector) checkPoint} method will not be
     * meaningful anymore.</p>
     * <p>If the boundary is empty, the region will represent the whole
     * space.</p>
     * @param boundary collection of boundary elements, as a
     * collection of {@link SubHyperplane SubHyperplane} objects
     */
    protected AbstractRegion(final Collection<SubHyperplane<S>> boundary) {try{__CLR4_4_1eukeuklb90p8fi.R.inc(19248);

        __CLR4_4_1eukeuklb90p8fi.R.inc(19249);if ((((boundary.size() == 0)&&(__CLR4_4_1eukeuklb90p8fi.R.iget(19250)!=0|true))||(__CLR4_4_1eukeuklb90p8fi.R.iget(19251)==0&false))) {{

            // the tree represents the whole space
            __CLR4_4_1eukeuklb90p8fi.R.inc(19252);tree = new BSPTree<S>(Boolean.TRUE);

        } }else {{

            // sort the boundary elements in decreasing size order
            // (we don't want equal size elements to be removed, so
            // we use a trick to fool the TreeSet)
            __CLR4_4_1eukeuklb90p8fi.R.inc(19253);final TreeSet<SubHyperplane<S>> ordered = new TreeSet<SubHyperplane<S>>(new Comparator<SubHyperplane<S>>() {
                public int compare(final SubHyperplane<S> o1, final SubHyperplane<S> o2) {try{__CLR4_4_1eukeuklb90p8fi.R.inc(19254);
                    __CLR4_4_1eukeuklb90p8fi.R.inc(19255);final double size1 = o1.getSize();
                    __CLR4_4_1eukeuklb90p8fi.R.inc(19256);final double size2 = o2.getSize();
                    __CLR4_4_1eukeuklb90p8fi.R.inc(19257);return ((((size2 < size1) )&&(__CLR4_4_1eukeuklb90p8fi.R.iget(19258)!=0|true))||(__CLR4_4_1eukeuklb90p8fi.R.iget(19259)==0&false))? -1 : (((((o1 == o2) )&&(__CLR4_4_1eukeuklb90p8fi.R.iget(19260)!=0|true))||(__CLR4_4_1eukeuklb90p8fi.R.iget(19261)==0&false))? 0 : +1);
                }finally{__CLR4_4_1eukeuklb90p8fi.R.flushNeeded();}}
            });
            __CLR4_4_1eukeuklb90p8fi.R.inc(19262);ordered.addAll(boundary);

            // build the tree top-down
            __CLR4_4_1eukeuklb90p8fi.R.inc(19263);tree = new BSPTree<S>();
            __CLR4_4_1eukeuklb90p8fi.R.inc(19264);insertCuts(tree, ordered);

            // set up the inside/outside flags
            __CLR4_4_1eukeuklb90p8fi.R.inc(19265);tree.visit(new BSPTreeVisitor<S>() {

                /** {@inheritDoc} */
                public Order visitOrder(final BSPTree<S> node) {try{__CLR4_4_1eukeuklb90p8fi.R.inc(19266);
                    __CLR4_4_1eukeuklb90p8fi.R.inc(19267);return Order.PLUS_SUB_MINUS;
                }finally{__CLR4_4_1eukeuklb90p8fi.R.flushNeeded();}}

                /** {@inheritDoc} */
                public void visitInternalNode(final BSPTree<S> node) {try{__CLR4_4_1eukeuklb90p8fi.R.inc(19268);
                }finally{__CLR4_4_1eukeuklb90p8fi.R.flushNeeded();}}

                /** {@inheritDoc} */
                public void visitLeafNode(final BSPTree<S> node) {try{__CLR4_4_1eukeuklb90p8fi.R.inc(19269);
                    __CLR4_4_1eukeuklb90p8fi.R.inc(19270);node.setAttribute(((((node == node.getParent().getPlus()) )&&(__CLR4_4_1eukeuklb90p8fi.R.iget(19271)!=0|true))||(__CLR4_4_1eukeuklb90p8fi.R.iget(19272)==0&false))?
                                                                            Boolean.FALSE : Boolean.TRUE);
                }finally{__CLR4_4_1eukeuklb90p8fi.R.flushNeeded();}}
            });

        }

    }}finally{__CLR4_4_1eukeuklb90p8fi.R.flushNeeded();}}

    /** Build a convex region from an array of bounding hyperplanes.
     * @param hyperplanes array of bounding hyperplanes (if null, an
     * empty region will be built)
     */
    public AbstractRegion(final Hyperplane<S>[] hyperplanes) {try{__CLR4_4_1eukeuklb90p8fi.R.inc(19273);
        __CLR4_4_1eukeuklb90p8fi.R.inc(19274);if (((((hyperplanes == null) || (hyperplanes.length == 0))&&(__CLR4_4_1eukeuklb90p8fi.R.iget(19275)!=0|true))||(__CLR4_4_1eukeuklb90p8fi.R.iget(19276)==0&false))) {{
            __CLR4_4_1eukeuklb90p8fi.R.inc(19277);tree = new BSPTree<S>(Boolean.FALSE);
        } }else {{

            // use the first hyperplane to build the right class
            __CLR4_4_1eukeuklb90p8fi.R.inc(19278);tree = hyperplanes[0].wholeSpace().getTree(false);

            // chop off parts of the space
            __CLR4_4_1eukeuklb90p8fi.R.inc(19279);BSPTree<S> node = tree;
            __CLR4_4_1eukeuklb90p8fi.R.inc(19280);node.setAttribute(Boolean.TRUE);
            __CLR4_4_1eukeuklb90p8fi.R.inc(19281);for (final Hyperplane<S> hyperplane : hyperplanes) {{
                __CLR4_4_1eukeuklb90p8fi.R.inc(19282);if ((((node.insertCut(hyperplane))&&(__CLR4_4_1eukeuklb90p8fi.R.iget(19283)!=0|true))||(__CLR4_4_1eukeuklb90p8fi.R.iget(19284)==0&false))) {{
                    __CLR4_4_1eukeuklb90p8fi.R.inc(19285);node.setAttribute(null);
                    __CLR4_4_1eukeuklb90p8fi.R.inc(19286);node.getPlus().setAttribute(Boolean.FALSE);
                    __CLR4_4_1eukeuklb90p8fi.R.inc(19287);node = node.getMinus();
                    __CLR4_4_1eukeuklb90p8fi.R.inc(19288);node.setAttribute(Boolean.TRUE);
                }
            }}

        }}

    }}finally{__CLR4_4_1eukeuklb90p8fi.R.flushNeeded();}}

    /** {@inheritDoc} */
    public abstract AbstractRegion<S, T> buildNew(BSPTree<S> newTree);

    /** Recursively build a tree by inserting cut sub-hyperplanes.
     * @param node current tree node (it is a leaf node at the beginning
     * of the call)
     * @param boundary collection of edges belonging to the cell defined
     * by the node
     */
    private void insertCuts(final BSPTree<S> node, final Collection<SubHyperplane<S>> boundary) {try{__CLR4_4_1eukeuklb90p8fi.R.inc(19289);

        __CLR4_4_1eukeuklb90p8fi.R.inc(19290);final Iterator<SubHyperplane<S>> iterator = boundary.iterator();

        // build the current level
        __CLR4_4_1eukeuklb90p8fi.R.inc(19291);Hyperplane<S> inserted = null;
        __CLR4_4_1eukeuklb90p8fi.R.inc(19292);while (((((inserted == null) && iterator.hasNext())&&(__CLR4_4_1eukeuklb90p8fi.R.iget(19293)!=0|true))||(__CLR4_4_1eukeuklb90p8fi.R.iget(19294)==0&false))) {{
            __CLR4_4_1eukeuklb90p8fi.R.inc(19295);inserted = iterator.next().getHyperplane();
            __CLR4_4_1eukeuklb90p8fi.R.inc(19296);if ((((!node.insertCut(inserted.copySelf()))&&(__CLR4_4_1eukeuklb90p8fi.R.iget(19297)!=0|true))||(__CLR4_4_1eukeuklb90p8fi.R.iget(19298)==0&false))) {{
                __CLR4_4_1eukeuklb90p8fi.R.inc(19299);inserted = null;
            }
        }}

        }__CLR4_4_1eukeuklb90p8fi.R.inc(19300);if ((((!iterator.hasNext())&&(__CLR4_4_1eukeuklb90p8fi.R.iget(19301)!=0|true))||(__CLR4_4_1eukeuklb90p8fi.R.iget(19302)==0&false))) {{
            __CLR4_4_1eukeuklb90p8fi.R.inc(19303);return;
        }

        // distribute the remaining edges in the two sub-trees
        }__CLR4_4_1eukeuklb90p8fi.R.inc(19304);final ArrayList<SubHyperplane<S>> plusList  = new ArrayList<SubHyperplane<S>>();
        __CLR4_4_1eukeuklb90p8fi.R.inc(19305);final ArrayList<SubHyperplane<S>> minusList = new ArrayList<SubHyperplane<S>>();
        __CLR4_4_1eukeuklb90p8fi.R.inc(19306);while ((((iterator.hasNext())&&(__CLR4_4_1eukeuklb90p8fi.R.iget(19307)!=0|true))||(__CLR4_4_1eukeuklb90p8fi.R.iget(19308)==0&false))) {{
            __CLR4_4_1eukeuklb90p8fi.R.inc(19309);final SubHyperplane<S> other = iterator.next();
            boolean __CLB4_4_1_bool0=false;__CLR4_4_1eukeuklb90p8fi.R.inc(19310);switch (other.side(inserted)) {
            case PLUS:if (!__CLB4_4_1_bool0) {__CLR4_4_1eukeuklb90p8fi.R.inc(19311);__CLB4_4_1_bool0=true;}
                __CLR4_4_1eukeuklb90p8fi.R.inc(19312);plusList.add(other);
                __CLR4_4_1eukeuklb90p8fi.R.inc(19313);break;
            case MINUS:if (!__CLB4_4_1_bool0) {__CLR4_4_1eukeuklb90p8fi.R.inc(19314);__CLB4_4_1_bool0=true;}
                __CLR4_4_1eukeuklb90p8fi.R.inc(19315);minusList.add(other);
                __CLR4_4_1eukeuklb90p8fi.R.inc(19316);break;
            case BOTH:if (!__CLB4_4_1_bool0) {__CLR4_4_1eukeuklb90p8fi.R.inc(19317);__CLB4_4_1_bool0=true;}
                __CLR4_4_1eukeuklb90p8fi.R.inc(19318);final SubHyperplane.SplitSubHyperplane<S> split = other.split(inserted);
                __CLR4_4_1eukeuklb90p8fi.R.inc(19319);plusList.add(split.getPlus());
                __CLR4_4_1eukeuklb90p8fi.R.inc(19320);minusList.add(split.getMinus());
                __CLR4_4_1eukeuklb90p8fi.R.inc(19321);break;
            default:if (!__CLB4_4_1_bool0) {__CLR4_4_1eukeuklb90p8fi.R.inc(19322);__CLB4_4_1_bool0=true;}
                // ignore the sub-hyperplanes belonging to the cut hyperplane
            }
        }

        // recurse through lower levels
        }__CLR4_4_1eukeuklb90p8fi.R.inc(19323);insertCuts(node.getPlus(),  plusList);
        __CLR4_4_1eukeuklb90p8fi.R.inc(19324);insertCuts(node.getMinus(), minusList);

    }finally{__CLR4_4_1eukeuklb90p8fi.R.flushNeeded();}}

    /** {@inheritDoc} */
    public AbstractRegion<S, T> copySelf() {try{__CLR4_4_1eukeuklb90p8fi.R.inc(19325);
        __CLR4_4_1eukeuklb90p8fi.R.inc(19326);return buildNew(tree.copySelf());
    }finally{__CLR4_4_1eukeuklb90p8fi.R.flushNeeded();}}

    /** {@inheritDoc} */
    public boolean isEmpty() {try{__CLR4_4_1eukeuklb90p8fi.R.inc(19327);
        __CLR4_4_1eukeuklb90p8fi.R.inc(19328);return isEmpty(tree);
    }finally{__CLR4_4_1eukeuklb90p8fi.R.flushNeeded();}}

    /** {@inheritDoc} */
    public boolean isEmpty(final BSPTree<S> node) {try{__CLR4_4_1eukeuklb90p8fi.R.inc(19329);

        // we use a recursive function rather than the BSPTreeVisitor
        // interface because we can stop visiting the tree as soon as we
        // have found an inside cell

        __CLR4_4_1eukeuklb90p8fi.R.inc(19330);if ((((node.getCut() == null)&&(__CLR4_4_1eukeuklb90p8fi.R.iget(19331)!=0|true))||(__CLR4_4_1eukeuklb90p8fi.R.iget(19332)==0&false))) {{
            // if we find an inside node, the region is not empty
            __CLR4_4_1eukeuklb90p8fi.R.inc(19333);return !((Boolean) node.getAttribute());
        }

        // check both sides of the sub-tree
        }__CLR4_4_1eukeuklb90p8fi.R.inc(19334);return isEmpty(node.getMinus()) && isEmpty(node.getPlus());

    }finally{__CLR4_4_1eukeuklb90p8fi.R.flushNeeded();}}

    /** {@inheritDoc} */
    public boolean contains(final Region<S> region) {try{__CLR4_4_1eukeuklb90p8fi.R.inc(19335);
        __CLR4_4_1eukeuklb90p8fi.R.inc(19336);return new RegionFactory<S>().difference(region, this).isEmpty();
    }finally{__CLR4_4_1eukeuklb90p8fi.R.flushNeeded();}}

    /** {@inheritDoc} */
    public Location checkPoint(final Vector<S> point) {try{__CLR4_4_1eukeuklb90p8fi.R.inc(19337);
        __CLR4_4_1eukeuklb90p8fi.R.inc(19338);return checkPoint(tree, point);
    }finally{__CLR4_4_1eukeuklb90p8fi.R.flushNeeded();}}

    /** Check a point with respect to the region starting at a given node.
     * @param node root node of the region
     * @param point point to check
     * @return a code representing the point status: either {@link
     * Region.Location#INSIDE INSIDE}, {@link Region.Location#OUTSIDE
     * OUTSIDE} or {@link Region.Location#BOUNDARY BOUNDARY}
     */
    protected Location checkPoint(final BSPTree<S> node, final Vector<S> point) {try{__CLR4_4_1eukeuklb90p8fi.R.inc(19339);
        __CLR4_4_1eukeuklb90p8fi.R.inc(19340);final BSPTree<S> cell = node.getCell(point);
        __CLR4_4_1eukeuklb90p8fi.R.inc(19341);if ((((cell.getCut() == null)&&(__CLR4_4_1eukeuklb90p8fi.R.iget(19342)!=0|true))||(__CLR4_4_1eukeuklb90p8fi.R.iget(19343)==0&false))) {{
            // the point is in the interior of a cell, just check the attribute
            __CLR4_4_1eukeuklb90p8fi.R.inc(19344);return (((((Boolean) cell.getAttribute()) )&&(__CLR4_4_1eukeuklb90p8fi.R.iget(19345)!=0|true))||(__CLR4_4_1eukeuklb90p8fi.R.iget(19346)==0&false))? Location.INSIDE : Location.OUTSIDE;
        }

        // the point is on a cut-sub-hyperplane, is it on a boundary ?
        }__CLR4_4_1eukeuklb90p8fi.R.inc(19347);final Location minusCode = checkPoint(cell.getMinus(), point);
        __CLR4_4_1eukeuklb90p8fi.R.inc(19348);final Location plusCode  = checkPoint(cell.getPlus(),  point);
        __CLR4_4_1eukeuklb90p8fi.R.inc(19349);return ((((minusCode == plusCode) )&&(__CLR4_4_1eukeuklb90p8fi.R.iget(19350)!=0|true))||(__CLR4_4_1eukeuklb90p8fi.R.iget(19351)==0&false))? minusCode : Location.BOUNDARY;

    }finally{__CLR4_4_1eukeuklb90p8fi.R.flushNeeded();}}

    /** {@inheritDoc} */
    public BSPTree<S> getTree(final boolean includeBoundaryAttributes) {try{__CLR4_4_1eukeuklb90p8fi.R.inc(19352);
        __CLR4_4_1eukeuklb90p8fi.R.inc(19353);if ((((includeBoundaryAttributes && (tree.getCut() != null) && (tree.getAttribute() == null))&&(__CLR4_4_1eukeuklb90p8fi.R.iget(19354)!=0|true))||(__CLR4_4_1eukeuklb90p8fi.R.iget(19355)==0&false))) {{
            // we need to compute the boundary attributes
            __CLR4_4_1eukeuklb90p8fi.R.inc(19356);tree.visit(new BoundaryBuilder<S>());
        }
        }__CLR4_4_1eukeuklb90p8fi.R.inc(19357);return tree;
    }finally{__CLR4_4_1eukeuklb90p8fi.R.flushNeeded();}}

    /** Visitor building boundary shell tree.
     * <p>
     * The boundary shell is represented as {@link BoundaryAttribute boundary attributes}
     * at each internal node.
     * </p>
     */
    private static class BoundaryBuilder<S extends Space> implements BSPTreeVisitor<S> {

        /** {@inheritDoc} */
        public Order visitOrder(BSPTree<S> node) {try{__CLR4_4_1eukeuklb90p8fi.R.inc(19358);
            __CLR4_4_1eukeuklb90p8fi.R.inc(19359);return Order.PLUS_MINUS_SUB;
        }finally{__CLR4_4_1eukeuklb90p8fi.R.flushNeeded();}}

        /** {@inheritDoc} */
        public void visitInternalNode(BSPTree<S> node) {try{__CLR4_4_1eukeuklb90p8fi.R.inc(19360);

            __CLR4_4_1eukeuklb90p8fi.R.inc(19361);SubHyperplane<S> plusOutside = null;
            __CLR4_4_1eukeuklb90p8fi.R.inc(19362);SubHyperplane<S> plusInside  = null;

            // characterize the cut sub-hyperplane,
            // first with respect to the plus sub-tree
            __CLR4_4_1eukeuklb90p8fi.R.inc(19363);@SuppressWarnings("unchecked")
            final SubHyperplane<S>[] plusChar = (SubHyperplane<S>[]) Array.newInstance(SubHyperplane.class, 2);
            __CLR4_4_1eukeuklb90p8fi.R.inc(19364);characterize(node.getPlus(), node.getCut().copySelf(), plusChar);

            __CLR4_4_1eukeuklb90p8fi.R.inc(19365);if ((((plusChar[0] != null && !plusChar[0].isEmpty())&&(__CLR4_4_1eukeuklb90p8fi.R.iget(19366)!=0|true))||(__CLR4_4_1eukeuklb90p8fi.R.iget(19367)==0&false))) {{
                // plusChar[0] corresponds to a subset of the cut sub-hyperplane known to have
                // outside cells on its plus side, we want to check if parts of this subset
                // do have inside cells on their minus side
                __CLR4_4_1eukeuklb90p8fi.R.inc(19368);@SuppressWarnings("unchecked")
                final SubHyperplane<S>[] minusChar = (SubHyperplane<S>[]) Array.newInstance(SubHyperplane.class, 2);
                __CLR4_4_1eukeuklb90p8fi.R.inc(19369);characterize(node.getMinus(), plusChar[0], minusChar);
                __CLR4_4_1eukeuklb90p8fi.R.inc(19370);if ((((minusChar[1] != null && !minusChar[1].isEmpty())&&(__CLR4_4_1eukeuklb90p8fi.R.iget(19371)!=0|true))||(__CLR4_4_1eukeuklb90p8fi.R.iget(19372)==0&false))) {{
                    // this part belongs to the boundary,
                    // it has the outside on its plus side and the inside on its minus side
                    __CLR4_4_1eukeuklb90p8fi.R.inc(19373);plusOutside = minusChar[1];
                }
            }}

            }__CLR4_4_1eukeuklb90p8fi.R.inc(19374);if ((((plusChar[1] != null && !plusChar[1].isEmpty())&&(__CLR4_4_1eukeuklb90p8fi.R.iget(19375)!=0|true))||(__CLR4_4_1eukeuklb90p8fi.R.iget(19376)==0&false))) {{
                // plusChar[1] corresponds to a subset of the cut sub-hyperplane known to have
                // inside cells on its plus side, we want to check if parts of this subset
                // do have outside cells on their minus side
                __CLR4_4_1eukeuklb90p8fi.R.inc(19377);@SuppressWarnings("unchecked")
                final SubHyperplane<S>[] minusChar = (SubHyperplane<S>[]) Array.newInstance(SubHyperplane.class, 2);
                __CLR4_4_1eukeuklb90p8fi.R.inc(19378);characterize(node.getMinus(), plusChar[1], minusChar);
                __CLR4_4_1eukeuklb90p8fi.R.inc(19379);if ((((minusChar[0] != null && !minusChar[0].isEmpty())&&(__CLR4_4_1eukeuklb90p8fi.R.iget(19380)!=0|true))||(__CLR4_4_1eukeuklb90p8fi.R.iget(19381)==0&false))) {{
                    // this part belongs to the boundary,
                    // it has the inside on its plus side and the outside on its minus side
                    __CLR4_4_1eukeuklb90p8fi.R.inc(19382);plusInside = minusChar[0];
                }
            }}

            // set the boundary attribute at non-leaf nodes
            }__CLR4_4_1eukeuklb90p8fi.R.inc(19383);node.setAttribute(new BoundaryAttribute<S>(plusOutside, plusInside));

        }finally{__CLR4_4_1eukeuklb90p8fi.R.flushNeeded();}}

        /** {@inheritDoc} */
        public void visitLeafNode(BSPTree<S> node) {try{__CLR4_4_1eukeuklb90p8fi.R.inc(19384);
        }finally{__CLR4_4_1eukeuklb90p8fi.R.flushNeeded();}}

        /** Filter the parts of an hyperplane belonging to the boundary.
         * <p>The filtering consist in splitting the specified
         * sub-hyperplane into several parts lying in inside and outside
         * cells of the tree. The principle is to call this method twice for
         * each cut sub-hyperplane in the tree, once one the plus node and
         * once on the minus node. The parts that have the same flag
         * (inside/inside or outside/outside) do not belong to the boundary
         * while parts that have different flags (inside/outside or
         * outside/inside) do belong to the boundary.</p>
         * @param node current BSP tree node
         * @param sub sub-hyperplane to characterize
         * @param characterization placeholder where to put the characterized parts
         */
        private void characterize(final BSPTree<S> node, final SubHyperplane<S> sub,
                                  final SubHyperplane<S>[] characterization) {try{__CLR4_4_1eukeuklb90p8fi.R.inc(19385);
            __CLR4_4_1eukeuklb90p8fi.R.inc(19386);if ((((node.getCut() == null)&&(__CLR4_4_1eukeuklb90p8fi.R.iget(19387)!=0|true))||(__CLR4_4_1eukeuklb90p8fi.R.iget(19388)==0&false))) {{
                // we have reached a leaf node
                __CLR4_4_1eukeuklb90p8fi.R.inc(19389);final boolean inside = (Boolean) node.getAttribute();
                __CLR4_4_1eukeuklb90p8fi.R.inc(19390);if ((((inside)&&(__CLR4_4_1eukeuklb90p8fi.R.iget(19391)!=0|true))||(__CLR4_4_1eukeuklb90p8fi.R.iget(19392)==0&false))) {{
                    __CLR4_4_1eukeuklb90p8fi.R.inc(19393);if ((((characterization[1] == null)&&(__CLR4_4_1eukeuklb90p8fi.R.iget(19394)!=0|true))||(__CLR4_4_1eukeuklb90p8fi.R.iget(19395)==0&false))) {{
                        __CLR4_4_1eukeuklb90p8fi.R.inc(19396);characterization[1] = sub;
                    } }else {{
                        __CLR4_4_1eukeuklb90p8fi.R.inc(19397);characterization[1] = characterization[1].reunite(sub);
                    }
                }} }else {{
                    __CLR4_4_1eukeuklb90p8fi.R.inc(19398);if ((((characterization[0] == null)&&(__CLR4_4_1eukeuklb90p8fi.R.iget(19399)!=0|true))||(__CLR4_4_1eukeuklb90p8fi.R.iget(19400)==0&false))) {{
                        __CLR4_4_1eukeuklb90p8fi.R.inc(19401);characterization[0] = sub;
                    } }else {{
                        __CLR4_4_1eukeuklb90p8fi.R.inc(19402);characterization[0] = characterization[0].reunite(sub);
                    }
                }}
            }} }else {{
                __CLR4_4_1eukeuklb90p8fi.R.inc(19403);final Hyperplane<S> hyperplane = node.getCut().getHyperplane();
                boolean __CLB4_4_1_bool1=false;__CLR4_4_1eukeuklb90p8fi.R.inc(19404);switch (sub.side(hyperplane)) {
                case PLUS:if (!__CLB4_4_1_bool1) {__CLR4_4_1eukeuklb90p8fi.R.inc(19405);__CLB4_4_1_bool1=true;}
                    __CLR4_4_1eukeuklb90p8fi.R.inc(19406);characterize(node.getPlus(), sub, characterization);
                    __CLR4_4_1eukeuklb90p8fi.R.inc(19407);break;
                case MINUS:if (!__CLB4_4_1_bool1) {__CLR4_4_1eukeuklb90p8fi.R.inc(19408);__CLB4_4_1_bool1=true;}
                    __CLR4_4_1eukeuklb90p8fi.R.inc(19409);characterize(node.getMinus(), sub, characterization);
                    __CLR4_4_1eukeuklb90p8fi.R.inc(19410);break;
                case BOTH:if (!__CLB4_4_1_bool1) {__CLR4_4_1eukeuklb90p8fi.R.inc(19411);__CLB4_4_1_bool1=true;}
                    __CLR4_4_1eukeuklb90p8fi.R.inc(19412);final SubHyperplane.SplitSubHyperplane<S> split = sub.split(hyperplane);
                    __CLR4_4_1eukeuklb90p8fi.R.inc(19413);characterize(node.getPlus(),  split.getPlus(),  characterization);
                    __CLR4_4_1eukeuklb90p8fi.R.inc(19414);characterize(node.getMinus(), split.getMinus(), characterization);
                    __CLR4_4_1eukeuklb90p8fi.R.inc(19415);break;
                default:if (!__CLB4_4_1_bool1) {__CLR4_4_1eukeuklb90p8fi.R.inc(19416);__CLB4_4_1_bool1=true;}
                    // this should not happen
                    __CLR4_4_1eukeuklb90p8fi.R.inc(19417);throw new MathInternalError();
                }
            }
        }}finally{__CLR4_4_1eukeuklb90p8fi.R.flushNeeded();}}

    }

    /** {@inheritDoc} */
    public double getBoundarySize() {try{__CLR4_4_1eukeuklb90p8fi.R.inc(19418);
        __CLR4_4_1eukeuklb90p8fi.R.inc(19419);final BoundarySizeVisitor<S> visitor = new BoundarySizeVisitor<S>();
        __CLR4_4_1eukeuklb90p8fi.R.inc(19420);getTree(true).visit(visitor);
        __CLR4_4_1eukeuklb90p8fi.R.inc(19421);return visitor.getSize();
    }finally{__CLR4_4_1eukeuklb90p8fi.R.flushNeeded();}}

    /** {@inheritDoc} */
    public double getSize() {try{__CLR4_4_1eukeuklb90p8fi.R.inc(19422);
        __CLR4_4_1eukeuklb90p8fi.R.inc(19423);if ((((barycenter == null)&&(__CLR4_4_1eukeuklb90p8fi.R.iget(19424)!=0|true))||(__CLR4_4_1eukeuklb90p8fi.R.iget(19425)==0&false))) {{
            __CLR4_4_1eukeuklb90p8fi.R.inc(19426);computeGeometricalProperties();
        }
        }__CLR4_4_1eukeuklb90p8fi.R.inc(19427);return size;
    }finally{__CLR4_4_1eukeuklb90p8fi.R.flushNeeded();}}

    /** Set the size of the instance.
     * @param size size of the instance
     */
    protected void setSize(final double size) {try{__CLR4_4_1eukeuklb90p8fi.R.inc(19428);
        __CLR4_4_1eukeuklb90p8fi.R.inc(19429);this.size = size;
    }finally{__CLR4_4_1eukeuklb90p8fi.R.flushNeeded();}}

    /** {@inheritDoc} */
    public Vector<S> getBarycenter() {try{__CLR4_4_1eukeuklb90p8fi.R.inc(19430);
        __CLR4_4_1eukeuklb90p8fi.R.inc(19431);if ((((barycenter == null)&&(__CLR4_4_1eukeuklb90p8fi.R.iget(19432)!=0|true))||(__CLR4_4_1eukeuklb90p8fi.R.iget(19433)==0&false))) {{
            __CLR4_4_1eukeuklb90p8fi.R.inc(19434);computeGeometricalProperties();
        }
        }__CLR4_4_1eukeuklb90p8fi.R.inc(19435);return barycenter;
    }finally{__CLR4_4_1eukeuklb90p8fi.R.flushNeeded();}}

    /** Set the barycenter of the instance.
     * @param barycenter barycenter of the instance
     */
    protected void setBarycenter(final Vector<S> barycenter) {try{__CLR4_4_1eukeuklb90p8fi.R.inc(19436);
        __CLR4_4_1eukeuklb90p8fi.R.inc(19437);this.barycenter = barycenter;
    }finally{__CLR4_4_1eukeuklb90p8fi.R.flushNeeded();}}

    /** Compute some geometrical properties.
     * <p>The properties to compute are the barycenter and the size.</p>
     */
    protected abstract void computeGeometricalProperties();

    /** {@inheritDoc} */
    public Side side(final Hyperplane<S> hyperplane) {try{__CLR4_4_1eukeuklb90p8fi.R.inc(19438);
        __CLR4_4_1eukeuklb90p8fi.R.inc(19439);final Sides sides = new Sides();
        __CLR4_4_1eukeuklb90p8fi.R.inc(19440);recurseSides(tree, hyperplane.wholeHyperplane(), sides);
        __CLR4_4_1eukeuklb90p8fi.R.inc(19441);return (((sides.plusFound() )&&(__CLR4_4_1eukeuklb90p8fi.R.iget(19442)!=0|true))||(__CLR4_4_1eukeuklb90p8fi.R.iget(19443)==0&false))?
              ((((sides.minusFound() )&&(__CLR4_4_1eukeuklb90p8fi.R.iget(19444)!=0|true))||(__CLR4_4_1eukeuklb90p8fi.R.iget(19445)==0&false))? Side.BOTH  : Side.PLUS) :
              ((((sides.minusFound() )&&(__CLR4_4_1eukeuklb90p8fi.R.iget(19446)!=0|true))||(__CLR4_4_1eukeuklb90p8fi.R.iget(19447)==0&false))? Side.MINUS : Side.HYPER);
    }finally{__CLR4_4_1eukeuklb90p8fi.R.flushNeeded();}}

    /** Search recursively for inside leaf nodes on each side of the given hyperplane.

     * <p>The algorithm used here is directly derived from the one
     * described in section III (<i>Binary Partitioning of a BSP
     * Tree</i>) of the Bruce Naylor, John Amanatides and William
     * Thibault paper <a
     * href="http://www.cs.yorku.ca/~amana/research/bsptSetOp.pdf">Merging
     * BSP Trees Yields Polyhedral Set Operations</a> Proc. Siggraph
     * '90, Computer Graphics 24(4), August 1990, pp 115-124, published
     * by the Association for Computing Machinery (ACM)..</p>

     * @param node current BSP tree node
     * @param sub sub-hyperplane
     * @param sides object holding the sides found
     */
    private void recurseSides(final BSPTree<S> node, final SubHyperplane<S> sub, final Sides sides) {try{__CLR4_4_1eukeuklb90p8fi.R.inc(19448);

        __CLR4_4_1eukeuklb90p8fi.R.inc(19449);if ((((node.getCut() == null)&&(__CLR4_4_1eukeuklb90p8fi.R.iget(19450)!=0|true))||(__CLR4_4_1eukeuklb90p8fi.R.iget(19451)==0&false))) {{
            __CLR4_4_1eukeuklb90p8fi.R.inc(19452);if (((((Boolean) node.getAttribute())&&(__CLR4_4_1eukeuklb90p8fi.R.iget(19453)!=0|true))||(__CLR4_4_1eukeuklb90p8fi.R.iget(19454)==0&false))) {{
                // this is an inside cell expanding across the hyperplane
                __CLR4_4_1eukeuklb90p8fi.R.inc(19455);sides.rememberPlusFound();
                __CLR4_4_1eukeuklb90p8fi.R.inc(19456);sides.rememberMinusFound();
            }
            }__CLR4_4_1eukeuklb90p8fi.R.inc(19457);return;
        }

        }__CLR4_4_1eukeuklb90p8fi.R.inc(19458);final Hyperplane<S> hyperplane = node.getCut().getHyperplane();
        boolean __CLB4_4_1_bool2=false;__CLR4_4_1eukeuklb90p8fi.R.inc(19459);switch (sub.side(hyperplane)) {
        case PLUS :if (!__CLB4_4_1_bool2) {__CLR4_4_1eukeuklb90p8fi.R.inc(19460);__CLB4_4_1_bool2=true;}
            // the sub-hyperplane is entirely in the plus sub-tree
            __CLR4_4_1eukeuklb90p8fi.R.inc(19461);if ((((node.getCut().side(sub.getHyperplane()) == Side.PLUS)&&(__CLR4_4_1eukeuklb90p8fi.R.iget(19462)!=0|true))||(__CLR4_4_1eukeuklb90p8fi.R.iget(19463)==0&false))) {{
                __CLR4_4_1eukeuklb90p8fi.R.inc(19464);if ((((!isEmpty(node.getMinus()))&&(__CLR4_4_1eukeuklb90p8fi.R.iget(19465)!=0|true))||(__CLR4_4_1eukeuklb90p8fi.R.iget(19466)==0&false))) {{
                    __CLR4_4_1eukeuklb90p8fi.R.inc(19467);sides.rememberPlusFound();
                }
            }} }else {{
                __CLR4_4_1eukeuklb90p8fi.R.inc(19468);if ((((!isEmpty(node.getMinus()))&&(__CLR4_4_1eukeuklb90p8fi.R.iget(19469)!=0|true))||(__CLR4_4_1eukeuklb90p8fi.R.iget(19470)==0&false))) {{
                    __CLR4_4_1eukeuklb90p8fi.R.inc(19471);sides.rememberMinusFound();
                }
            }}
            }__CLR4_4_1eukeuklb90p8fi.R.inc(19472);if ((((!(sides.plusFound() && sides.minusFound()))&&(__CLR4_4_1eukeuklb90p8fi.R.iget(19473)!=0|true))||(__CLR4_4_1eukeuklb90p8fi.R.iget(19474)==0&false))) {{
                __CLR4_4_1eukeuklb90p8fi.R.inc(19475);recurseSides(node.getPlus(), sub, sides);
            }
            }__CLR4_4_1eukeuklb90p8fi.R.inc(19476);break;
        case MINUS :if (!__CLB4_4_1_bool2) {__CLR4_4_1eukeuklb90p8fi.R.inc(19477);__CLB4_4_1_bool2=true;}
            // the sub-hyperplane is entirely in the minus sub-tree
            __CLR4_4_1eukeuklb90p8fi.R.inc(19478);if ((((node.getCut().side(sub.getHyperplane()) == Side.PLUS)&&(__CLR4_4_1eukeuklb90p8fi.R.iget(19479)!=0|true))||(__CLR4_4_1eukeuklb90p8fi.R.iget(19480)==0&false))) {{
                __CLR4_4_1eukeuklb90p8fi.R.inc(19481);if ((((!isEmpty(node.getPlus()))&&(__CLR4_4_1eukeuklb90p8fi.R.iget(19482)!=0|true))||(__CLR4_4_1eukeuklb90p8fi.R.iget(19483)==0&false))) {{
                    __CLR4_4_1eukeuklb90p8fi.R.inc(19484);sides.rememberPlusFound();
                }
            }} }else {{
                __CLR4_4_1eukeuklb90p8fi.R.inc(19485);if ((((!isEmpty(node.getPlus()))&&(__CLR4_4_1eukeuklb90p8fi.R.iget(19486)!=0|true))||(__CLR4_4_1eukeuklb90p8fi.R.iget(19487)==0&false))) {{
                    __CLR4_4_1eukeuklb90p8fi.R.inc(19488);sides.rememberMinusFound();
                }
            }}
            }__CLR4_4_1eukeuklb90p8fi.R.inc(19489);if ((((!(sides.plusFound() && sides.minusFound()))&&(__CLR4_4_1eukeuklb90p8fi.R.iget(19490)!=0|true))||(__CLR4_4_1eukeuklb90p8fi.R.iget(19491)==0&false))) {{
                __CLR4_4_1eukeuklb90p8fi.R.inc(19492);recurseSides(node.getMinus(), sub, sides);
            }
            }__CLR4_4_1eukeuklb90p8fi.R.inc(19493);break;
        case BOTH :if (!__CLB4_4_1_bool2) {__CLR4_4_1eukeuklb90p8fi.R.inc(19494);__CLB4_4_1_bool2=true;}
            // the sub-hyperplane extends in both sub-trees
            __CLR4_4_1eukeuklb90p8fi.R.inc(19495);final SubHyperplane.SplitSubHyperplane<S> split = sub.split(hyperplane);

            // explore first the plus sub-tree
            __CLR4_4_1eukeuklb90p8fi.R.inc(19496);recurseSides(node.getPlus(), split.getPlus(), sides);

            // if needed, explore the minus sub-tree
            __CLR4_4_1eukeuklb90p8fi.R.inc(19497);if ((((!(sides.plusFound() && sides.minusFound()))&&(__CLR4_4_1eukeuklb90p8fi.R.iget(19498)!=0|true))||(__CLR4_4_1eukeuklb90p8fi.R.iget(19499)==0&false))) {{
                __CLR4_4_1eukeuklb90p8fi.R.inc(19500);recurseSides(node.getMinus(), split.getMinus(), sides);
            }
            }__CLR4_4_1eukeuklb90p8fi.R.inc(19501);break;
        default :if (!__CLB4_4_1_bool2) {__CLR4_4_1eukeuklb90p8fi.R.inc(19502);__CLB4_4_1_bool2=true;}
            // the sub-hyperplane and the cut sub-hyperplane share the same hyperplane
            __CLR4_4_1eukeuklb90p8fi.R.inc(19503);if ((((node.getCut().getHyperplane().sameOrientationAs(sub.getHyperplane()))&&(__CLR4_4_1eukeuklb90p8fi.R.iget(19504)!=0|true))||(__CLR4_4_1eukeuklb90p8fi.R.iget(19505)==0&false))) {{
                __CLR4_4_1eukeuklb90p8fi.R.inc(19506);if (((((node.getPlus().getCut() != null) || ((Boolean) node.getPlus().getAttribute()))&&(__CLR4_4_1eukeuklb90p8fi.R.iget(19507)!=0|true))||(__CLR4_4_1eukeuklb90p8fi.R.iget(19508)==0&false))) {{
                    __CLR4_4_1eukeuklb90p8fi.R.inc(19509);sides.rememberPlusFound();
                }
                }__CLR4_4_1eukeuklb90p8fi.R.inc(19510);if (((((node.getMinus().getCut() != null) || ((Boolean) node.getMinus().getAttribute()))&&(__CLR4_4_1eukeuklb90p8fi.R.iget(19511)!=0|true))||(__CLR4_4_1eukeuklb90p8fi.R.iget(19512)==0&false))) {{
                    __CLR4_4_1eukeuklb90p8fi.R.inc(19513);sides.rememberMinusFound();
                }
            }} }else {{
                __CLR4_4_1eukeuklb90p8fi.R.inc(19514);if (((((node.getPlus().getCut() != null) || ((Boolean) node.getPlus().getAttribute()))&&(__CLR4_4_1eukeuklb90p8fi.R.iget(19515)!=0|true))||(__CLR4_4_1eukeuklb90p8fi.R.iget(19516)==0&false))) {{
                    __CLR4_4_1eukeuklb90p8fi.R.inc(19517);sides.rememberMinusFound();
                }
                }__CLR4_4_1eukeuklb90p8fi.R.inc(19518);if (((((node.getMinus().getCut() != null) || ((Boolean) node.getMinus().getAttribute()))&&(__CLR4_4_1eukeuklb90p8fi.R.iget(19519)!=0|true))||(__CLR4_4_1eukeuklb90p8fi.R.iget(19520)==0&false))) {{
                    __CLR4_4_1eukeuklb90p8fi.R.inc(19521);sides.rememberPlusFound();
                }
            }}
        }}

    }finally{__CLR4_4_1eukeuklb90p8fi.R.flushNeeded();}}

    /** Utility class holding the already found sides. */
    private static final class Sides {

        /** Indicator of inside leaf nodes found on the plus side. */
        private boolean plusFound;

        /** Indicator of inside leaf nodes found on the plus side. */
        private boolean minusFound;

        /** Simple constructor.
         */
        public Sides() {try{__CLR4_4_1eukeuklb90p8fi.R.inc(19522);
            __CLR4_4_1eukeuklb90p8fi.R.inc(19523);plusFound  = false;
            __CLR4_4_1eukeuklb90p8fi.R.inc(19524);minusFound = false;
        }finally{__CLR4_4_1eukeuklb90p8fi.R.flushNeeded();}}

        /** Remember the fact that inside leaf nodes have been found on the plus side.
         */
        public void rememberPlusFound() {try{__CLR4_4_1eukeuklb90p8fi.R.inc(19525);
            __CLR4_4_1eukeuklb90p8fi.R.inc(19526);plusFound = true;
        }finally{__CLR4_4_1eukeuklb90p8fi.R.flushNeeded();}}

        /** Check if inside leaf nodes have been found on the plus side.
         * @return true if inside leaf nodes have been found on the plus side
         */
        public boolean plusFound() {try{__CLR4_4_1eukeuklb90p8fi.R.inc(19527);
            __CLR4_4_1eukeuklb90p8fi.R.inc(19528);return plusFound;
        }finally{__CLR4_4_1eukeuklb90p8fi.R.flushNeeded();}}

        /** Remember the fact that inside leaf nodes have been found on the minus side.
         */
        public void rememberMinusFound() {try{__CLR4_4_1eukeuklb90p8fi.R.inc(19529);
            __CLR4_4_1eukeuklb90p8fi.R.inc(19530);minusFound = true;
        }finally{__CLR4_4_1eukeuklb90p8fi.R.flushNeeded();}}

        /** Check if inside leaf nodes have been found on the minus side.
         * @return true if inside leaf nodes have been found on the minus side
         */
        public boolean minusFound() {try{__CLR4_4_1eukeuklb90p8fi.R.inc(19531);
            __CLR4_4_1eukeuklb90p8fi.R.inc(19532);return minusFound;
        }finally{__CLR4_4_1eukeuklb90p8fi.R.flushNeeded();}}

    }

    /** {@inheritDoc} */
    public SubHyperplane<S> intersection(final SubHyperplane<S> sub) {try{__CLR4_4_1eukeuklb90p8fi.R.inc(19533);
        __CLR4_4_1eukeuklb90p8fi.R.inc(19534);return recurseIntersection(tree, sub);
    }finally{__CLR4_4_1eukeuklb90p8fi.R.flushNeeded();}}

    /** Recursively compute the parts of a sub-hyperplane that are
     * contained in the region.
     * @param node current BSP tree node
     * @param sub sub-hyperplane traversing the region
     * @return filtered sub-hyperplane
     */
    private SubHyperplane<S> recurseIntersection(final BSPTree<S> node, final SubHyperplane<S> sub) {try{__CLR4_4_1eukeuklb90p8fi.R.inc(19535);

        __CLR4_4_1eukeuklb90p8fi.R.inc(19536);if ((((node.getCut() == null)&&(__CLR4_4_1eukeuklb90p8fi.R.iget(19537)!=0|true))||(__CLR4_4_1eukeuklb90p8fi.R.iget(19538)==0&false))) {{
            __CLR4_4_1eukeuklb90p8fi.R.inc(19539);return ((((Boolean) node.getAttribute() )&&(__CLR4_4_1eukeuklb90p8fi.R.iget(19540)!=0|true))||(__CLR4_4_1eukeuklb90p8fi.R.iget(19541)==0&false))? sub.copySelf() : null;
        }

        }__CLR4_4_1eukeuklb90p8fi.R.inc(19542);final Hyperplane<S> hyperplane = node.getCut().getHyperplane();
        boolean __CLB4_4_1_bool3=false;__CLR4_4_1eukeuklb90p8fi.R.inc(19543);switch (sub.side(hyperplane)) {
        case PLUS :if (!__CLB4_4_1_bool3) {__CLR4_4_1eukeuklb90p8fi.R.inc(19544);__CLB4_4_1_bool3=true;}
            __CLR4_4_1eukeuklb90p8fi.R.inc(19545);return recurseIntersection(node.getPlus(), sub);
        case MINUS :if (!__CLB4_4_1_bool3) {__CLR4_4_1eukeuklb90p8fi.R.inc(19546);__CLB4_4_1_bool3=true;}
            __CLR4_4_1eukeuklb90p8fi.R.inc(19547);return recurseIntersection(node.getMinus(), sub);
        case BOTH :if (!__CLB4_4_1_bool3) {__CLR4_4_1eukeuklb90p8fi.R.inc(19548);__CLB4_4_1_bool3=true;}
            __CLR4_4_1eukeuklb90p8fi.R.inc(19549);final SubHyperplane.SplitSubHyperplane<S> split = sub.split(hyperplane);
            __CLR4_4_1eukeuklb90p8fi.R.inc(19550);final SubHyperplane<S> plus  = recurseIntersection(node.getPlus(),  split.getPlus());
            __CLR4_4_1eukeuklb90p8fi.R.inc(19551);final SubHyperplane<S> minus = recurseIntersection(node.getMinus(), split.getMinus());
            __CLR4_4_1eukeuklb90p8fi.R.inc(19552);if ((((plus == null)&&(__CLR4_4_1eukeuklb90p8fi.R.iget(19553)!=0|true))||(__CLR4_4_1eukeuklb90p8fi.R.iget(19554)==0&false))) {{
                __CLR4_4_1eukeuklb90p8fi.R.inc(19555);return minus;
            } }else {__CLR4_4_1eukeuklb90p8fi.R.inc(19556);if ((((minus == null)&&(__CLR4_4_1eukeuklb90p8fi.R.iget(19557)!=0|true))||(__CLR4_4_1eukeuklb90p8fi.R.iget(19558)==0&false))) {{
                __CLR4_4_1eukeuklb90p8fi.R.inc(19559);return plus;
            } }else {{
                __CLR4_4_1eukeuklb90p8fi.R.inc(19560);return plus.reunite(minus);
            }
        }}default :if (!__CLB4_4_1_bool3) {__CLR4_4_1eukeuklb90p8fi.R.inc(19561);__CLB4_4_1_bool3=true;}
            __CLR4_4_1eukeuklb90p8fi.R.inc(19562);return recurseIntersection(node.getPlus(),
                                       recurseIntersection(node.getMinus(), sub));
        }

    }finally{__CLR4_4_1eukeuklb90p8fi.R.flushNeeded();}}

    /** Transform a region.
     * <p>Applying a transform to a region consist in applying the
     * transform to all the hyperplanes of the underlying BSP tree and
     * of the boundary (and also to the sub-hyperplanes embedded in
     * these hyperplanes) and to the barycenter. The instance is not
     * modified, a new instance is built.</p>
     * @param transform transform to apply
     * @return a new region, resulting from the application of the
     * transform to the instance
     */
    public AbstractRegion<S, T> applyTransform(final Transform<S, T> transform) {try{__CLR4_4_1eukeuklb90p8fi.R.inc(19563);
        __CLR4_4_1eukeuklb90p8fi.R.inc(19564);return buildNew(recurseTransform(getTree(false), transform));
    }finally{__CLR4_4_1eukeuklb90p8fi.R.flushNeeded();}}

    /** Recursively transform an inside/outside BSP-tree.
     * @param node current BSP tree node
     * @param transform transform to apply
     * @return a new tree
     */
    @SuppressWarnings("unchecked")
    private BSPTree<S> recurseTransform(final BSPTree<S> node, final Transform<S, T> transform) {try{__CLR4_4_1eukeuklb90p8fi.R.inc(19565);

        __CLR4_4_1eukeuklb90p8fi.R.inc(19566);if ((((node.getCut() == null)&&(__CLR4_4_1eukeuklb90p8fi.R.iget(19567)!=0|true))||(__CLR4_4_1eukeuklb90p8fi.R.iget(19568)==0&false))) {{
            __CLR4_4_1eukeuklb90p8fi.R.inc(19569);return new BSPTree<S>(node.getAttribute());
        }

        }__CLR4_4_1eukeuklb90p8fi.R.inc(19570);final SubHyperplane<S>  sub = node.getCut();
        __CLR4_4_1eukeuklb90p8fi.R.inc(19571);final SubHyperplane<S> tSub = ((AbstractSubHyperplane<S, T>) sub).applyTransform(transform);
        __CLR4_4_1eukeuklb90p8fi.R.inc(19572);BoundaryAttribute<S> attribute = (BoundaryAttribute<S>) node.getAttribute();
        __CLR4_4_1eukeuklb90p8fi.R.inc(19573);if ((((attribute != null)&&(__CLR4_4_1eukeuklb90p8fi.R.iget(19574)!=0|true))||(__CLR4_4_1eukeuklb90p8fi.R.iget(19575)==0&false))) {{
            __CLR4_4_1eukeuklb90p8fi.R.inc(19576);final SubHyperplane<S> tPO = ((((attribute.getPlusOutside() == null) )&&(__CLR4_4_1eukeuklb90p8fi.R.iget(19577)!=0|true))||(__CLR4_4_1eukeuklb90p8fi.R.iget(19578)==0&false))?
                null : ((AbstractSubHyperplane<S, T>) attribute.getPlusOutside()).applyTransform(transform);
            __CLR4_4_1eukeuklb90p8fi.R.inc(19579);final SubHyperplane<S> tPI = ((((attribute.getPlusInside()  == null) )&&(__CLR4_4_1eukeuklb90p8fi.R.iget(19580)!=0|true))||(__CLR4_4_1eukeuklb90p8fi.R.iget(19581)==0&false))?
                null  : ((AbstractSubHyperplane<S, T>) attribute.getPlusInside()).applyTransform(transform);
            __CLR4_4_1eukeuklb90p8fi.R.inc(19582);attribute = new BoundaryAttribute<S>(tPO, tPI);
        }

        }__CLR4_4_1eukeuklb90p8fi.R.inc(19583);return new BSPTree<S>(tSub,
                                    recurseTransform(node.getPlus(),  transform),
                                    recurseTransform(node.getMinus(), transform),
                                    attribute);

    }finally{__CLR4_4_1eukeuklb90p8fi.R.flushNeeded();}}

}
