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

import org.apache.commons.math3.exception.MathInternalError;
import org.apache.commons.math3.geometry.Vector;
import org.apache.commons.math3.geometry.Space;
import org.apache.commons.math3.util.FastMath;

/** This class represent a Binary Space Partition tree.

 * <p>BSP trees are an efficient way to represent space partitions and
 * to associate attributes with each cell. Each node in a BSP tree
 * represents a convex region which is partitioned in two convex
 * sub-regions at each side of a cut hyperplane. The root tree
 * contains the complete space.</p>

 * <p>The main use of such partitions is to use a boolean attribute to
 * define an inside/outside property, hence representing arbitrary
 * polytopes (line segments in 1D, polygons in 2D and polyhedrons in
 * 3D) and to operate on them.</p>

 * <p>Another example would be to represent Voronoi tesselations, the
 * attribute of each cell holding the defining point of the cell.</p>

 * <p>The application-defined attributes are shared among copied
 * instances and propagated to split parts. These attributes are not
 * used by the BSP-tree algorithms themselves, so the application can
 * use them for any purpose. Since the tree visiting method holds
 * internal and leaf nodes differently, it is possible to use
 * different classes for internal nodes attributes and leaf nodes
 * attributes. This should be used with care, though, because if the
 * tree is modified in any way after attributes have been set, some
 * internal nodes may become leaf nodes and some leaf nodes may become
 * internal nodes.</p>

 * <p>One of the main sources for the development of this package was
 * Bruce Naylor, John Amanatides and William Thibault paper <a
 * href="http://www.cs.yorku.ca/~amana/research/bsptSetOp.pdf">Merging
 * BSP Trees Yields Polyhedral Set Operations</a> Proc. Siggraph '90,
 * Computer Graphics 24(4), August 1990, pp 115-124, published by the
 * Association for Computing Machinery (ACM).</p>

 * @param <S> Type of the space.

 * @version $Id$
 * @since 3.0
 */
@java.lang.SuppressWarnings({"fallthrough"}) public class BSPTree<S extends Space> {public static class __CLR4_4_1f51f51lb90p8g8{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,19873,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** Cut sub-hyperplane. */
    private SubHyperplane<S> cut;

    /** Tree at the plus side of the cut hyperplane. */
    private BSPTree<S> plus;

    /** Tree at the minus side of the cut hyperplane. */
    private BSPTree<S> minus;

    /** Parent tree. */
    private BSPTree<S> parent;

    /** Application-defined attribute. */
    private Object attribute;

    /** Build a tree having only one root cell representing the whole space.
     */
    public BSPTree() {try{__CLR4_4_1f51f51lb90p8g8.R.inc(19621);
        __CLR4_4_1f51f51lb90p8g8.R.inc(19622);cut       = null;
        __CLR4_4_1f51f51lb90p8g8.R.inc(19623);plus      = null;
        __CLR4_4_1f51f51lb90p8g8.R.inc(19624);minus     = null;
        __CLR4_4_1f51f51lb90p8g8.R.inc(19625);parent    = null;
        __CLR4_4_1f51f51lb90p8g8.R.inc(19626);attribute = null;
    }finally{__CLR4_4_1f51f51lb90p8g8.R.flushNeeded();}}

    /** Build a tree having only one root cell representing the whole space.
     * @param attribute attribute of the tree (may be null)
     */
    public BSPTree(final Object attribute) {try{__CLR4_4_1f51f51lb90p8g8.R.inc(19627);
        __CLR4_4_1f51f51lb90p8g8.R.inc(19628);cut    = null;
        __CLR4_4_1f51f51lb90p8g8.R.inc(19629);plus   = null;
        __CLR4_4_1f51f51lb90p8g8.R.inc(19630);minus  = null;
        __CLR4_4_1f51f51lb90p8g8.R.inc(19631);parent = null;
        __CLR4_4_1f51f51lb90p8g8.R.inc(19632);this.attribute = attribute;
    }finally{__CLR4_4_1f51f51lb90p8g8.R.flushNeeded();}}

    /** Build a BSPTree from its underlying elements.
     * <p>This method does <em>not</em> perform any verification on
     * consistency of its arguments, it should therefore be used only
     * when then caller knows what it is doing.</p>
     * <p>This method is mainly useful kto build trees
     * bottom-up. Building trees top-down is realized with the help of
     * method {@link #insertCut insertCut}.</p>
     * @param cut cut sub-hyperplane for the tree
     * @param plus plus side sub-tree
     * @param minus minus side sub-tree
     * @param attribute attribute associated with the node (may be null)
     * @see #insertCut
     */
    public BSPTree(final SubHyperplane<S> cut, final BSPTree<S> plus, final BSPTree<S> minus,
                   final Object attribute) {try{__CLR4_4_1f51f51lb90p8g8.R.inc(19633);
        __CLR4_4_1f51f51lb90p8g8.R.inc(19634);this.cut       = cut;
        __CLR4_4_1f51f51lb90p8g8.R.inc(19635);this.plus      = plus;
        __CLR4_4_1f51f51lb90p8g8.R.inc(19636);this.minus     = minus;
        __CLR4_4_1f51f51lb90p8g8.R.inc(19637);this.parent    = null;
        __CLR4_4_1f51f51lb90p8g8.R.inc(19638);this.attribute = attribute;
        __CLR4_4_1f51f51lb90p8g8.R.inc(19639);plus.parent    = this;
        __CLR4_4_1f51f51lb90p8g8.R.inc(19640);minus.parent   = this;
    }finally{__CLR4_4_1f51f51lb90p8g8.R.flushNeeded();}}

    /** Insert a cut sub-hyperplane in a node.
     * <p>The sub-tree starting at this node will be completely
     * overwritten. The new cut sub-hyperplane will be built from the
     * intersection of the provided hyperplane with the cell. If the
     * hyperplane does intersect the cell, the cell will have two
     * children cells with {@code null} attributes on each side of
     * the inserted cut sub-hyperplane. If the hyperplane does not
     * intersect the cell then <em>no</em> cut hyperplane will be
     * inserted and the cell will be changed to a leaf cell. The
     * attribute of the node is never changed.</p>
     * <p>This method is mainly useful when called on leaf nodes
     * (i.e. nodes for which {@link #getCut getCut} returns
     * {@code null}), in this case it provides a way to build a
     * tree top-down (whereas the {@link #BSPTree(SubHyperplane,
     * BSPTree, BSPTree, Object) 4 arguments constructor} is devoted to
     * build trees bottom-up).</p>
     * @param hyperplane hyperplane to insert, it will be chopped in
     * order to fit in the cell defined by the parent nodes of the
     * instance
     * @return true if a cut sub-hyperplane has been inserted (i.e. if
     * the cell now has two leaf child nodes)
     * @see #BSPTree(SubHyperplane, BSPTree, BSPTree, Object)
     */
    public boolean insertCut(final Hyperplane<S> hyperplane) {try{__CLR4_4_1f51f51lb90p8g8.R.inc(19641);

        __CLR4_4_1f51f51lb90p8g8.R.inc(19642);if ((((cut != null)&&(__CLR4_4_1f51f51lb90p8g8.R.iget(19643)!=0|true))||(__CLR4_4_1f51f51lb90p8g8.R.iget(19644)==0&false))) {{
            __CLR4_4_1f51f51lb90p8g8.R.inc(19645);plus.parent  = null;
            __CLR4_4_1f51f51lb90p8g8.R.inc(19646);minus.parent = null;
        }

        }__CLR4_4_1f51f51lb90p8g8.R.inc(19647);final SubHyperplane<S> chopped = fitToCell(hyperplane.wholeHyperplane());
        __CLR4_4_1f51f51lb90p8g8.R.inc(19648);if ((((chopped == null || chopped.isEmpty())&&(__CLR4_4_1f51f51lb90p8g8.R.iget(19649)!=0|true))||(__CLR4_4_1f51f51lb90p8g8.R.iget(19650)==0&false))) {{
            __CLR4_4_1f51f51lb90p8g8.R.inc(19651);cut          = null;
            __CLR4_4_1f51f51lb90p8g8.R.inc(19652);plus         = null;
            __CLR4_4_1f51f51lb90p8g8.R.inc(19653);minus        = null;
            __CLR4_4_1f51f51lb90p8g8.R.inc(19654);return false;
        }

        }__CLR4_4_1f51f51lb90p8g8.R.inc(19655);cut          = chopped;
        __CLR4_4_1f51f51lb90p8g8.R.inc(19656);plus         = new BSPTree<S>();
        __CLR4_4_1f51f51lb90p8g8.R.inc(19657);plus.parent  = this;
        __CLR4_4_1f51f51lb90p8g8.R.inc(19658);minus        = new BSPTree<S>();
        __CLR4_4_1f51f51lb90p8g8.R.inc(19659);minus.parent = this;
        __CLR4_4_1f51f51lb90p8g8.R.inc(19660);return true;

    }finally{__CLR4_4_1f51f51lb90p8g8.R.flushNeeded();}}

    /** Copy the instance.
     * <p>The instance created is completely independant of the original
     * one. A deep copy is used, none of the underlying objects are
     * shared (except for the nodes attributes and immutable
     * objects).</p>
     * @return a new tree, copy of the instance
     */
    public BSPTree<S> copySelf() {try{__CLR4_4_1f51f51lb90p8g8.R.inc(19661);

        __CLR4_4_1f51f51lb90p8g8.R.inc(19662);if ((((cut == null)&&(__CLR4_4_1f51f51lb90p8g8.R.iget(19663)!=0|true))||(__CLR4_4_1f51f51lb90p8g8.R.iget(19664)==0&false))) {{
            __CLR4_4_1f51f51lb90p8g8.R.inc(19665);return new BSPTree<S>(attribute);
        }

        }__CLR4_4_1f51f51lb90p8g8.R.inc(19666);return new BSPTree<S>(cut.copySelf(), plus.copySelf(), minus.copySelf(),
                           attribute);

    }finally{__CLR4_4_1f51f51lb90p8g8.R.flushNeeded();}}

    /** Get the cut sub-hyperplane.
     * @return cut sub-hyperplane, null if this is a leaf tree
     */
    public SubHyperplane<S> getCut() {try{__CLR4_4_1f51f51lb90p8g8.R.inc(19667);
        __CLR4_4_1f51f51lb90p8g8.R.inc(19668);return cut;
    }finally{__CLR4_4_1f51f51lb90p8g8.R.flushNeeded();}}

    /** Get the tree on the plus side of the cut hyperplane.
     * @return tree on the plus side of the cut hyperplane, null if this
     * is a leaf tree
     */
    public BSPTree<S> getPlus() {try{__CLR4_4_1f51f51lb90p8g8.R.inc(19669);
        __CLR4_4_1f51f51lb90p8g8.R.inc(19670);return plus;
    }finally{__CLR4_4_1f51f51lb90p8g8.R.flushNeeded();}}

    /** Get the tree on the minus side of the cut hyperplane.
     * @return tree on the minus side of the cut hyperplane, null if this
     * is a leaf tree
     */
    public BSPTree<S> getMinus() {try{__CLR4_4_1f51f51lb90p8g8.R.inc(19671);
        __CLR4_4_1f51f51lb90p8g8.R.inc(19672);return minus;
    }finally{__CLR4_4_1f51f51lb90p8g8.R.flushNeeded();}}

    /** Get the parent node.
     * @return parent node, null if the node has no parents
     */
    public BSPTree<S> getParent() {try{__CLR4_4_1f51f51lb90p8g8.R.inc(19673);
        __CLR4_4_1f51f51lb90p8g8.R.inc(19674);return parent;
    }finally{__CLR4_4_1f51f51lb90p8g8.R.flushNeeded();}}

    /** Associate an attribute with the instance.
     * @param attribute attribute to associate with the node
     * @see #getAttribute
     */
    public void setAttribute(final Object attribute) {try{__CLR4_4_1f51f51lb90p8g8.R.inc(19675);
        __CLR4_4_1f51f51lb90p8g8.R.inc(19676);this.attribute = attribute;
    }finally{__CLR4_4_1f51f51lb90p8g8.R.flushNeeded();}}

    /** Get the attribute associated with the instance.
     * @return attribute associated with the node or null if no
     * attribute has been explicitly set using the {@link #setAttribute
     * setAttribute} method
     * @see #setAttribute
     */
    public Object getAttribute() {try{__CLR4_4_1f51f51lb90p8g8.R.inc(19677);
        __CLR4_4_1f51f51lb90p8g8.R.inc(19678);return attribute;
    }finally{__CLR4_4_1f51f51lb90p8g8.R.flushNeeded();}}

    /** Visit the BSP tree nodes.
     * @param visitor object visiting the tree nodes
     */
    public void visit(final BSPTreeVisitor<S> visitor) {try{__CLR4_4_1f51f51lb90p8g8.R.inc(19679);
        __CLR4_4_1f51f51lb90p8g8.R.inc(19680);if ((((cut == null)&&(__CLR4_4_1f51f51lb90p8g8.R.iget(19681)!=0|true))||(__CLR4_4_1f51f51lb90p8g8.R.iget(19682)==0&false))) {{
            __CLR4_4_1f51f51lb90p8g8.R.inc(19683);visitor.visitLeafNode(this);
        } }else {{
            boolean __CLB4_4_1_bool0=false;__CLR4_4_1f51f51lb90p8g8.R.inc(19684);switch (visitor.visitOrder(this)) {
            case PLUS_MINUS_SUB:if (!__CLB4_4_1_bool0) {__CLR4_4_1f51f51lb90p8g8.R.inc(19685);__CLB4_4_1_bool0=true;}
                __CLR4_4_1f51f51lb90p8g8.R.inc(19686);plus.visit(visitor);
                __CLR4_4_1f51f51lb90p8g8.R.inc(19687);minus.visit(visitor);
                __CLR4_4_1f51f51lb90p8g8.R.inc(19688);visitor.visitInternalNode(this);
                __CLR4_4_1f51f51lb90p8g8.R.inc(19689);break;
            case PLUS_SUB_MINUS:if (!__CLB4_4_1_bool0) {__CLR4_4_1f51f51lb90p8g8.R.inc(19690);__CLB4_4_1_bool0=true;}
                __CLR4_4_1f51f51lb90p8g8.R.inc(19691);plus.visit(visitor);
                __CLR4_4_1f51f51lb90p8g8.R.inc(19692);visitor.visitInternalNode(this);
                __CLR4_4_1f51f51lb90p8g8.R.inc(19693);minus.visit(visitor);
                __CLR4_4_1f51f51lb90p8g8.R.inc(19694);break;
            case MINUS_PLUS_SUB:if (!__CLB4_4_1_bool0) {__CLR4_4_1f51f51lb90p8g8.R.inc(19695);__CLB4_4_1_bool0=true;}
                __CLR4_4_1f51f51lb90p8g8.R.inc(19696);minus.visit(visitor);
                __CLR4_4_1f51f51lb90p8g8.R.inc(19697);plus.visit(visitor);
                __CLR4_4_1f51f51lb90p8g8.R.inc(19698);visitor.visitInternalNode(this);
                __CLR4_4_1f51f51lb90p8g8.R.inc(19699);break;
            case MINUS_SUB_PLUS:if (!__CLB4_4_1_bool0) {__CLR4_4_1f51f51lb90p8g8.R.inc(19700);__CLB4_4_1_bool0=true;}
                __CLR4_4_1f51f51lb90p8g8.R.inc(19701);minus.visit(visitor);
                __CLR4_4_1f51f51lb90p8g8.R.inc(19702);visitor.visitInternalNode(this);
                __CLR4_4_1f51f51lb90p8g8.R.inc(19703);plus.visit(visitor);
                __CLR4_4_1f51f51lb90p8g8.R.inc(19704);break;
            case SUB_PLUS_MINUS:if (!__CLB4_4_1_bool0) {__CLR4_4_1f51f51lb90p8g8.R.inc(19705);__CLB4_4_1_bool0=true;}
                __CLR4_4_1f51f51lb90p8g8.R.inc(19706);visitor.visitInternalNode(this);
                __CLR4_4_1f51f51lb90p8g8.R.inc(19707);plus.visit(visitor);
                __CLR4_4_1f51f51lb90p8g8.R.inc(19708);minus.visit(visitor);
                __CLR4_4_1f51f51lb90p8g8.R.inc(19709);break;
            case SUB_MINUS_PLUS:if (!__CLB4_4_1_bool0) {__CLR4_4_1f51f51lb90p8g8.R.inc(19710);__CLB4_4_1_bool0=true;}
                __CLR4_4_1f51f51lb90p8g8.R.inc(19711);visitor.visitInternalNode(this);
                __CLR4_4_1f51f51lb90p8g8.R.inc(19712);minus.visit(visitor);
                __CLR4_4_1f51f51lb90p8g8.R.inc(19713);plus.visit(visitor);
                __CLR4_4_1f51f51lb90p8g8.R.inc(19714);break;
            default:if (!__CLB4_4_1_bool0) {__CLR4_4_1f51f51lb90p8g8.R.inc(19715);__CLB4_4_1_bool0=true;}
                __CLR4_4_1f51f51lb90p8g8.R.inc(19716);throw new MathInternalError();
            }

        }
    }}finally{__CLR4_4_1f51f51lb90p8g8.R.flushNeeded();}}

    /** Fit a sub-hyperplane inside the cell defined by the instance.
     * <p>Fitting is done by chopping off the parts of the
     * sub-hyperplane that lie outside of the cell using the
     * cut-hyperplanes of the parent nodes of the instance.</p>
     * @param sub sub-hyperplane to fit
     * @return a new sub-hyperplane, guaranteed to have no part outside
     * of the instance cell
     */
    private SubHyperplane<S> fitToCell(final SubHyperplane<S> sub) {try{__CLR4_4_1f51f51lb90p8g8.R.inc(19717);
        __CLR4_4_1f51f51lb90p8g8.R.inc(19718);SubHyperplane<S> s = sub;
        __CLR4_4_1f51f51lb90p8g8.R.inc(19719);for (BSPTree<S> tree = this; (((tree.parent != null)&&(__CLR4_4_1f51f51lb90p8g8.R.iget(19720)!=0|true))||(__CLR4_4_1f51f51lb90p8g8.R.iget(19721)==0&false)); tree = tree.parent) {{
            __CLR4_4_1f51f51lb90p8g8.R.inc(19722);if ((((tree == tree.parent.plus)&&(__CLR4_4_1f51f51lb90p8g8.R.iget(19723)!=0|true))||(__CLR4_4_1f51f51lb90p8g8.R.iget(19724)==0&false))) {{
                __CLR4_4_1f51f51lb90p8g8.R.inc(19725);s = s.split(tree.parent.cut.getHyperplane()).getPlus();
            } }else {{
                __CLR4_4_1f51f51lb90p8g8.R.inc(19726);s = s.split(tree.parent.cut.getHyperplane()).getMinus();
            }
        }}
        }__CLR4_4_1f51f51lb90p8g8.R.inc(19727);return s;
    }finally{__CLR4_4_1f51f51lb90p8g8.R.flushNeeded();}}

    /** Get the cell to which a point belongs.
     * <p>If the returned cell is a leaf node the points belongs to the
     * interior of the node, if the cell is an internal node the points
     * belongs to the node cut sub-hyperplane.</p>
     * @param point point to check
     * @return the tree cell to which the point belongs (can be
     */
    public BSPTree<S> getCell(final Vector<S> point) {try{__CLR4_4_1f51f51lb90p8g8.R.inc(19728);

        __CLR4_4_1f51f51lb90p8g8.R.inc(19729);if ((((cut == null)&&(__CLR4_4_1f51f51lb90p8g8.R.iget(19730)!=0|true))||(__CLR4_4_1f51f51lb90p8g8.R.iget(19731)==0&false))) {{
            __CLR4_4_1f51f51lb90p8g8.R.inc(19732);return this;
        }

        // position of the point with respect to the cut hyperplane
        }__CLR4_4_1f51f51lb90p8g8.R.inc(19733);final double offset = cut.getHyperplane().getOffset(point);

        __CLR4_4_1f51f51lb90p8g8.R.inc(19734);if ((((FastMath.abs(offset) < 1.0e-10)&&(__CLR4_4_1f51f51lb90p8g8.R.iget(19735)!=0|true))||(__CLR4_4_1f51f51lb90p8g8.R.iget(19736)==0&false))) {{
            __CLR4_4_1f51f51lb90p8g8.R.inc(19737);return this;
        } }else {__CLR4_4_1f51f51lb90p8g8.R.inc(19738);if ((((offset <= 0)&&(__CLR4_4_1f51f51lb90p8g8.R.iget(19739)!=0|true))||(__CLR4_4_1f51f51lb90p8g8.R.iget(19740)==0&false))) {{
            // point is on the minus side of the cut hyperplane
            __CLR4_4_1f51f51lb90p8g8.R.inc(19741);return minus.getCell(point);
        } }else {{
            // point is on the plus side of the cut hyperplane
            __CLR4_4_1f51f51lb90p8g8.R.inc(19742);return plus.getCell(point);
        }

    }}}finally{__CLR4_4_1f51f51lb90p8g8.R.flushNeeded();}}

    /** Perform condensation on a tree.
     * <p>The condensation operation is not recursive, it must be called
     * explicitely from leaves to root.</p>
     */
    private void condense() {try{__CLR4_4_1f51f51lb90p8g8.R.inc(19743);
        __CLR4_4_1f51f51lb90p8g8.R.inc(19744);if (((((cut != null) && (plus.cut == null) && (minus.cut == null) &&
            (((plus.attribute == null) && (minus.attribute == null)) ||
             ((plus.attribute != null) && plus.attribute.equals(minus.attribute))))&&(__CLR4_4_1f51f51lb90p8g8.R.iget(19745)!=0|true))||(__CLR4_4_1f51f51lb90p8g8.R.iget(19746)==0&false))) {{
            __CLR4_4_1f51f51lb90p8g8.R.inc(19747);attribute = ((((plus.attribute == null) )&&(__CLR4_4_1f51f51lb90p8g8.R.iget(19748)!=0|true))||(__CLR4_4_1f51f51lb90p8g8.R.iget(19749)==0&false))? minus.attribute : plus.attribute;
            __CLR4_4_1f51f51lb90p8g8.R.inc(19750);cut       = null;
            __CLR4_4_1f51f51lb90p8g8.R.inc(19751);plus      = null;
            __CLR4_4_1f51f51lb90p8g8.R.inc(19752);minus     = null;
        }
    }}finally{__CLR4_4_1f51f51lb90p8g8.R.flushNeeded();}}

    /** Merge a BSP tree with the instance.
     * <p>All trees are modified (parts of them are reused in the new
     * tree), it is the responsibility of the caller to ensure a copy
     * has been done before if any of the former tree should be
     * preserved, <em>no</em> such copy is done here!</p>
     * <p>The algorithm used here is directly derived from the one
     * described in the Naylor, Amanatides and Thibault paper (section
     * III, Binary Partitioning of a BSP Tree).</p>
     * @param tree other tree to merge with the instance (will be
     * <em>unusable</em> after the operation, as well as the
     * instance itself)
     * @param leafMerger object implementing the final merging phase
     * (this is where the semantic of the operation occurs, generally
     * depending on the attribute of the leaf node)
     * @return a new tree, result of <code>instance &lt;op&gt;
     * tree</code>, this value can be ignored if parentTree is not null
     * since all connections have already been established
     */
    public BSPTree<S> merge(final BSPTree<S> tree, final LeafMerger<S> leafMerger) {try{__CLR4_4_1f51f51lb90p8g8.R.inc(19753);
        __CLR4_4_1f51f51lb90p8g8.R.inc(19754);return merge(tree, leafMerger, null, false);
    }finally{__CLR4_4_1f51f51lb90p8g8.R.flushNeeded();}}

    /** Merge a BSP tree with the instance.
     * @param tree other tree to merge with the instance (will be
     * <em>unusable</em> after the operation, as well as the
     * instance itself)
     * @param leafMerger object implementing the final merging phase
     * (this is where the semantic of the operation occurs, generally
     * depending on the attribute of the leaf node)
     * @param parentTree parent tree to connect to (may be null)
     * @param isPlusChild if true and if parentTree is not null, the
     * resulting tree should be the plus child of its parent, ignored if
     * parentTree is null
     * @return a new tree, result of <code>instance &lt;op&gt;
     * tree</code>, this value can be ignored if parentTree is not null
     * since all connections have already been established
     */
    private BSPTree<S> merge(final BSPTree<S> tree, final LeafMerger<S> leafMerger,
                             final BSPTree<S> parentTree, final boolean isPlusChild) {try{__CLR4_4_1f51f51lb90p8g8.R.inc(19755);
        __CLR4_4_1f51f51lb90p8g8.R.inc(19756);if ((((cut == null)&&(__CLR4_4_1f51f51lb90p8g8.R.iget(19757)!=0|true))||(__CLR4_4_1f51f51lb90p8g8.R.iget(19758)==0&false))) {{
            // cell/tree operation
            __CLR4_4_1f51f51lb90p8g8.R.inc(19759);return leafMerger.merge(this, tree, parentTree, isPlusChild, true);
        } }else {__CLR4_4_1f51f51lb90p8g8.R.inc(19760);if ((((tree.cut == null)&&(__CLR4_4_1f51f51lb90p8g8.R.iget(19761)!=0|true))||(__CLR4_4_1f51f51lb90p8g8.R.iget(19762)==0&false))) {{
            // tree/cell operation
            __CLR4_4_1f51f51lb90p8g8.R.inc(19763);return leafMerger.merge(tree, this, parentTree, isPlusChild, false);
        } }else {{
            // tree/tree operation
            __CLR4_4_1f51f51lb90p8g8.R.inc(19764);final BSPTree<S> merged = tree.split(cut);
            __CLR4_4_1f51f51lb90p8g8.R.inc(19765);if ((((parentTree != null)&&(__CLR4_4_1f51f51lb90p8g8.R.iget(19766)!=0|true))||(__CLR4_4_1f51f51lb90p8g8.R.iget(19767)==0&false))) {{
                __CLR4_4_1f51f51lb90p8g8.R.inc(19768);merged.parent = parentTree;
                __CLR4_4_1f51f51lb90p8g8.R.inc(19769);if ((((isPlusChild)&&(__CLR4_4_1f51f51lb90p8g8.R.iget(19770)!=0|true))||(__CLR4_4_1f51f51lb90p8g8.R.iget(19771)==0&false))) {{
                    __CLR4_4_1f51f51lb90p8g8.R.inc(19772);parentTree.plus = merged;
                } }else {{
                    __CLR4_4_1f51f51lb90p8g8.R.inc(19773);parentTree.minus = merged;
                }
            }}

            // merging phase
            }__CLR4_4_1f51f51lb90p8g8.R.inc(19774);plus.merge(merged.plus, leafMerger, merged, true);
            __CLR4_4_1f51f51lb90p8g8.R.inc(19775);minus.merge(merged.minus, leafMerger, merged, false);
            __CLR4_4_1f51f51lb90p8g8.R.inc(19776);merged.condense();
            __CLR4_4_1f51f51lb90p8g8.R.inc(19777);if ((((merged.cut != null)&&(__CLR4_4_1f51f51lb90p8g8.R.iget(19778)!=0|true))||(__CLR4_4_1f51f51lb90p8g8.R.iget(19779)==0&false))) {{
                __CLR4_4_1f51f51lb90p8g8.R.inc(19780);merged.cut =
                    merged.fitToCell(merged.cut.getHyperplane().wholeHyperplane());
            }

            }__CLR4_4_1f51f51lb90p8g8.R.inc(19781);return merged;

        }
    }}}finally{__CLR4_4_1f51f51lb90p8g8.R.flushNeeded();}}

    /** This interface gather the merging operations between a BSP tree
     * leaf and another BSP tree.
     * <p>As explained in Bruce Naylor, John Amanatides and William
     * Thibault paper <a
     * href="http://www.cs.yorku.ca/~amana/research/bsptSetOp.pdf">Merging
     * BSP Trees Yields Polyhedral Set Operations</a>,
     * the operations on {@link BSPTree BSP trees} can be expressed as a
     * generic recursive merging operation where only the final part,
     * when one of the operand is a leaf, is specific to the real
     * operation semantics. For example, a tree representing a region
     * using a boolean attribute to identify inside cells and outside
     * cells would use four different objects to implement the final
     * merging phase of the four set operations union, intersection,
     * difference and symmetric difference (exclusive or).</p>
     * @param <S> Type of the space.
     */
    public interface LeafMerger<S extends Space> {

        /** Merge a leaf node and a tree node.
         * <p>This method is called at the end of a recursive merging
         * resulting from a {@code tree1.merge(tree2, leafMerger)}
         * call, when one of the sub-trees involved is a leaf (i.e. when
         * its cut-hyperplane is null). This is the only place where the
         * precise semantics of the operation are required. For all upper
         * level nodes in the tree, the merging operation is only a
         * generic partitioning algorithm.</p>
         * <p>Since the final operation may be non-commutative, it is
         * important to know if the leaf node comes from the instance tree
         * ({@code tree1}) or the argument tree
         * ({@code tree2}). The third argument of the method is
         * devoted to this. It can be ignored for commutative
         * operations.</p>
         * <p>The {@link BSPTree#insertInTree BSPTree.insertInTree} method
         * may be useful to implement this method.</p>
         * @param leaf leaf node (its cut hyperplane is guaranteed to be
         * null)
         * @param tree tree node (its cut hyperplane may be null or not)
         * @param parentTree parent tree to connect to (may be null)
         * @param isPlusChild if true and if parentTree is not null, the
         * resulting tree should be the plus child of its parent, ignored if
         * parentTree is null
         * @param leafFromInstance if true, the leaf node comes from the
         * instance tree ({@code tree1}) and the tree node comes from
         * the argument tree ({@code tree2})
         * @return the BSP tree resulting from the merging (may be one of
         * the arguments)
         */
        BSPTree<S> merge(BSPTree<S> leaf, BSPTree<S> tree, BSPTree<S> parentTree,
                         boolean isPlusChild, boolean leafFromInstance);

    }

    /** Split a BSP tree by an external sub-hyperplane.
     * <p>Split a tree in two halves, on each side of the
     * sub-hyperplane. The instance is not modified.</p>
     * <p>The tree returned is not upward-consistent: despite all of its
     * sub-trees cut sub-hyperplanes (including its own cut
     * sub-hyperplane) are bounded to the current cell, it is <em>not</em>
     * attached to any parent tree yet. This tree is intended to be
     * later inserted into an higher level tree.</p>
     * <p>The algorithm used here is the one given in Naylor, Amanatides
     * and Thibault paper (section III, Binary Partitioning of a BSP
     * Tree).</p>
     * @param sub partitioning sub-hyperplane, must be already clipped
     * to the convex region represented by the instance, will be used as
     * the cut sub-hyperplane of the returned tree
     * @return a tree having the specified sub-hyperplane as its cut
     * sub-hyperplane, the two parts of the split instance as its two
     * sub-trees and a null parent
     */
    public BSPTree<S> split(final SubHyperplane<S> sub) {try{__CLR4_4_1f51f51lb90p8g8.R.inc(19782);

        __CLR4_4_1f51f51lb90p8g8.R.inc(19783);if ((((cut == null)&&(__CLR4_4_1f51f51lb90p8g8.R.iget(19784)!=0|true))||(__CLR4_4_1f51f51lb90p8g8.R.iget(19785)==0&false))) {{
            __CLR4_4_1f51f51lb90p8g8.R.inc(19786);return new BSPTree<S>(sub, copySelf(),
                    new BSPTree<S>(attribute), null);
        }

        }__CLR4_4_1f51f51lb90p8g8.R.inc(19787);final Hyperplane<S> cHyperplane = cut.getHyperplane();
        __CLR4_4_1f51f51lb90p8g8.R.inc(19788);final Hyperplane<S> sHyperplane = sub.getHyperplane();
        boolean __CLB4_4_1_bool1=false;__CLR4_4_1f51f51lb90p8g8.R.inc(19789);switch (sub.side(cHyperplane)) {
        case PLUS :if (!__CLB4_4_1_bool1) {__CLR4_4_1f51f51lb90p8g8.R.inc(19790);__CLB4_4_1_bool1=true;}
        { // the partitioning sub-hyperplane is entirely in the plus sub-tree
            __CLR4_4_1f51f51lb90p8g8.R.inc(19791);final BSPTree<S> split = plus.split(sub);
            __CLR4_4_1f51f51lb90p8g8.R.inc(19792);if ((((cut.side(sHyperplane) == Side.PLUS)&&(__CLR4_4_1f51f51lb90p8g8.R.iget(19793)!=0|true))||(__CLR4_4_1f51f51lb90p8g8.R.iget(19794)==0&false))) {{
                __CLR4_4_1f51f51lb90p8g8.R.inc(19795);split.plus =
                    new BSPTree<S>(cut.copySelf(), split.plus, minus.copySelf(), attribute);
                __CLR4_4_1f51f51lb90p8g8.R.inc(19796);split.plus.condense();
                __CLR4_4_1f51f51lb90p8g8.R.inc(19797);split.plus.parent = split;
            } }else {{
                __CLR4_4_1f51f51lb90p8g8.R.inc(19798);split.minus =
                    new BSPTree<S>(cut.copySelf(), split.minus, minus.copySelf(), attribute);
                __CLR4_4_1f51f51lb90p8g8.R.inc(19799);split.minus.condense();
                __CLR4_4_1f51f51lb90p8g8.R.inc(19800);split.minus.parent = split;
            }
            }__CLR4_4_1f51f51lb90p8g8.R.inc(19801);return split;
        }
        case MINUS :if (!__CLB4_4_1_bool1) {__CLR4_4_1f51f51lb90p8g8.R.inc(19802);__CLB4_4_1_bool1=true;}
        { // the partitioning sub-hyperplane is entirely in the minus sub-tree
            __CLR4_4_1f51f51lb90p8g8.R.inc(19803);final BSPTree<S> split = minus.split(sub);
            __CLR4_4_1f51f51lb90p8g8.R.inc(19804);if ((((cut.side(sHyperplane) == Side.PLUS)&&(__CLR4_4_1f51f51lb90p8g8.R.iget(19805)!=0|true))||(__CLR4_4_1f51f51lb90p8g8.R.iget(19806)==0&false))) {{
                __CLR4_4_1f51f51lb90p8g8.R.inc(19807);split.plus =
                    new BSPTree<S>(cut.copySelf(), plus.copySelf(), split.plus, attribute);
                __CLR4_4_1f51f51lb90p8g8.R.inc(19808);split.plus.condense();
                __CLR4_4_1f51f51lb90p8g8.R.inc(19809);split.plus.parent = split;
            } }else {{
                __CLR4_4_1f51f51lb90p8g8.R.inc(19810);split.minus =
                    new BSPTree<S>(cut.copySelf(), plus.copySelf(), split.minus, attribute);
                __CLR4_4_1f51f51lb90p8g8.R.inc(19811);split.minus.condense();
                __CLR4_4_1f51f51lb90p8g8.R.inc(19812);split.minus.parent = split;
            }
            }__CLR4_4_1f51f51lb90p8g8.R.inc(19813);return split;
        }
        case BOTH :if (!__CLB4_4_1_bool1) {__CLR4_4_1f51f51lb90p8g8.R.inc(19814);__CLB4_4_1_bool1=true;}
        {
            __CLR4_4_1f51f51lb90p8g8.R.inc(19815);final SubHyperplane.SplitSubHyperplane<S> cutParts = cut.split(sHyperplane);
            __CLR4_4_1f51f51lb90p8g8.R.inc(19816);final SubHyperplane.SplitSubHyperplane<S> subParts = sub.split(cHyperplane);
            __CLR4_4_1f51f51lb90p8g8.R.inc(19817);final BSPTree<S> split =
                new BSPTree<S>(sub, plus.split(subParts.getPlus()), minus.split(subParts.getMinus()),
                               null);
            __CLR4_4_1f51f51lb90p8g8.R.inc(19818);split.plus.cut          = cutParts.getPlus();
            __CLR4_4_1f51f51lb90p8g8.R.inc(19819);split.minus.cut         = cutParts.getMinus();
            __CLR4_4_1f51f51lb90p8g8.R.inc(19820);final BSPTree<S> tmp    = split.plus.minus;
            __CLR4_4_1f51f51lb90p8g8.R.inc(19821);split.plus.minus        = split.minus.plus;
            __CLR4_4_1f51f51lb90p8g8.R.inc(19822);split.plus.minus.parent = split.plus;
            __CLR4_4_1f51f51lb90p8g8.R.inc(19823);split.minus.plus        = tmp;
            __CLR4_4_1f51f51lb90p8g8.R.inc(19824);split.minus.plus.parent = split.minus;
            __CLR4_4_1f51f51lb90p8g8.R.inc(19825);split.plus.condense();
            __CLR4_4_1f51f51lb90p8g8.R.inc(19826);split.minus.condense();
            __CLR4_4_1f51f51lb90p8g8.R.inc(19827);return split;
        }
        default :if (!__CLB4_4_1_bool1) {__CLR4_4_1f51f51lb90p8g8.R.inc(19828);__CLB4_4_1_bool1=true;}
            __CLR4_4_1f51f51lb90p8g8.R.inc(19829);return (((cHyperplane.sameOrientationAs(sHyperplane) )&&(__CLR4_4_1f51f51lb90p8g8.R.iget(19830)!=0|true))||(__CLR4_4_1f51f51lb90p8g8.R.iget(19831)==0&false))?
                   new BSPTree<S>(sub, plus.copySelf(),  minus.copySelf(), attribute) :
                   new BSPTree<S>(sub, minus.copySelf(), plus.copySelf(),  attribute);
        }

    }finally{__CLR4_4_1f51f51lb90p8g8.R.flushNeeded();}}

    /** Insert the instance into another tree.
     * <p>The instance itself is modified so its former parent should
     * not be used anymore.</p>
     * @param parentTree parent tree to connect to (may be null)
     * @param isPlusChild if true and if parentTree is not null, the
     * resulting tree should be the plus child of its parent, ignored if
     * parentTree is null
     * @see LeafMerger
     */
    public void insertInTree(final BSPTree<S> parentTree, final boolean isPlusChild) {try{__CLR4_4_1f51f51lb90p8g8.R.inc(19832);

        // set up parent/child links
        __CLR4_4_1f51f51lb90p8g8.R.inc(19833);parent = parentTree;
        __CLR4_4_1f51f51lb90p8g8.R.inc(19834);if ((((parentTree != null)&&(__CLR4_4_1f51f51lb90p8g8.R.iget(19835)!=0|true))||(__CLR4_4_1f51f51lb90p8g8.R.iget(19836)==0&false))) {{
            __CLR4_4_1f51f51lb90p8g8.R.inc(19837);if ((((isPlusChild)&&(__CLR4_4_1f51f51lb90p8g8.R.iget(19838)!=0|true))||(__CLR4_4_1f51f51lb90p8g8.R.iget(19839)==0&false))) {{
                __CLR4_4_1f51f51lb90p8g8.R.inc(19840);parentTree.plus = this;
            } }else {{
                __CLR4_4_1f51f51lb90p8g8.R.inc(19841);parentTree.minus = this;
            }
        }}

        // make sure the inserted tree lies in the cell defined by its parent nodes
        }__CLR4_4_1f51f51lb90p8g8.R.inc(19842);if ((((cut != null)&&(__CLR4_4_1f51f51lb90p8g8.R.iget(19843)!=0|true))||(__CLR4_4_1f51f51lb90p8g8.R.iget(19844)==0&false))) {{

            // explore the parent nodes from here towards tree root
            __CLR4_4_1f51f51lb90p8g8.R.inc(19845);for (BSPTree<S> tree = this; (((tree.parent != null)&&(__CLR4_4_1f51f51lb90p8g8.R.iget(19846)!=0|true))||(__CLR4_4_1f51f51lb90p8g8.R.iget(19847)==0&false)); tree = tree.parent) {{

                // this is an hyperplane of some parent node
                __CLR4_4_1f51f51lb90p8g8.R.inc(19848);final Hyperplane<S> hyperplane = tree.parent.cut.getHyperplane();

                // chop off the parts of the inserted tree that extend
                // on the wrong side of this parent hyperplane
                __CLR4_4_1f51f51lb90p8g8.R.inc(19849);if ((((tree == tree.parent.plus)&&(__CLR4_4_1f51f51lb90p8g8.R.iget(19850)!=0|true))||(__CLR4_4_1f51f51lb90p8g8.R.iget(19851)==0&false))) {{
                    __CLR4_4_1f51f51lb90p8g8.R.inc(19852);cut = cut.split(hyperplane).getPlus();
                    __CLR4_4_1f51f51lb90p8g8.R.inc(19853);plus.chopOffMinus(hyperplane);
                    __CLR4_4_1f51f51lb90p8g8.R.inc(19854);minus.chopOffMinus(hyperplane);
                } }else {{
                    __CLR4_4_1f51f51lb90p8g8.R.inc(19855);cut = cut.split(hyperplane).getMinus();
                    __CLR4_4_1f51f51lb90p8g8.R.inc(19856);plus.chopOffPlus(hyperplane);
                    __CLR4_4_1f51f51lb90p8g8.R.inc(19857);minus.chopOffPlus(hyperplane);
                }

            }}

            // since we may have drop some parts of the inserted tree,
            // perform a condensation pass to keep the tree structure simple
            }__CLR4_4_1f51f51lb90p8g8.R.inc(19858);condense();

        }

    }}finally{__CLR4_4_1f51f51lb90p8g8.R.flushNeeded();}}

    /** Chop off parts of the tree.
     * <p>The instance is modified in place, all the parts that are on
     * the minus side of the chopping hyperplane are discarded, only the
     * parts on the plus side remain.</p>
     * @param hyperplane chopping hyperplane
     */
    private void chopOffMinus(final Hyperplane<S> hyperplane) {try{__CLR4_4_1f51f51lb90p8g8.R.inc(19859);
        __CLR4_4_1f51f51lb90p8g8.R.inc(19860);if ((((cut != null)&&(__CLR4_4_1f51f51lb90p8g8.R.iget(19861)!=0|true))||(__CLR4_4_1f51f51lb90p8g8.R.iget(19862)==0&false))) {{
            __CLR4_4_1f51f51lb90p8g8.R.inc(19863);cut = cut.split(hyperplane).getPlus();
            __CLR4_4_1f51f51lb90p8g8.R.inc(19864);plus.chopOffMinus(hyperplane);
            __CLR4_4_1f51f51lb90p8g8.R.inc(19865);minus.chopOffMinus(hyperplane);
        }
    }}finally{__CLR4_4_1f51f51lb90p8g8.R.flushNeeded();}}

    /** Chop off parts of the tree.
     * <p>The instance is modified in place, all the parts that are on
     * the plus side of the chopping hyperplane are discarded, only the
     * parts on the minus side remain.</p>
     * @param hyperplane chopping hyperplane
     */
    private void chopOffPlus(final Hyperplane<S> hyperplane) {try{__CLR4_4_1f51f51lb90p8g8.R.inc(19866);
        __CLR4_4_1f51f51lb90p8g8.R.inc(19867);if ((((cut != null)&&(__CLR4_4_1f51f51lb90p8g8.R.iget(19868)!=0|true))||(__CLR4_4_1f51f51lb90p8g8.R.iget(19869)==0&false))) {{
            __CLR4_4_1f51f51lb90p8g8.R.inc(19870);cut = cut.split(hyperplane).getMinus();
            __CLR4_4_1f51f51lb90p8g8.R.inc(19871);plus.chopOffPlus(hyperplane);
            __CLR4_4_1f51f51lb90p8g8.R.inc(19872);minus.chopOffPlus(hyperplane);
        }
    }}finally{__CLR4_4_1f51f51lb90p8g8.R.flushNeeded();}}

}
