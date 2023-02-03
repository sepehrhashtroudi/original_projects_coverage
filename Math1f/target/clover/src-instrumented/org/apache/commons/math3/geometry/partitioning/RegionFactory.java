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

import org.apache.commons.math3.geometry.Space;

/** This class is a factory for {@link Region}.

 * @param <S> Type of the space.

 * @version $Id$
 * @since 3.0
 */
public class RegionFactory<S extends Space> {public static class __CLR4_4_1fcpfcplb90p8gu{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,19996,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** Visitor removing internal nodes attributes. */
    private final NodesCleaner nodeCleaner;

    /** Simple constructor.
     */
    public RegionFactory() {try{__CLR4_4_1fcpfcplb90p8gu.R.inc(19897);
        __CLR4_4_1fcpfcplb90p8gu.R.inc(19898);nodeCleaner = new NodesCleaner();
    }finally{__CLR4_4_1fcpfcplb90p8gu.R.flushNeeded();}}

    /** Build a convex region from a collection of bounding hyperplanes.
     * @param hyperplanes collection of bounding hyperplanes
     * @return a new convex region, or null if the collection is empty
     */
    public Region<S> buildConvex(final Hyperplane<S> ... hyperplanes) {try{__CLR4_4_1fcpfcplb90p8gu.R.inc(19899);
        __CLR4_4_1fcpfcplb90p8gu.R.inc(19900);if (((((hyperplanes == null) || (hyperplanes.length == 0))&&(__CLR4_4_1fcpfcplb90p8gu.R.iget(19901)!=0|true))||(__CLR4_4_1fcpfcplb90p8gu.R.iget(19902)==0&false))) {{
            __CLR4_4_1fcpfcplb90p8gu.R.inc(19903);return null;
        }

        // use the first hyperplane to build the right class
        }__CLR4_4_1fcpfcplb90p8gu.R.inc(19904);final Region<S> region = hyperplanes[0].wholeSpace();

        // chop off parts of the space
        __CLR4_4_1fcpfcplb90p8gu.R.inc(19905);BSPTree<S> node = region.getTree(false);
        __CLR4_4_1fcpfcplb90p8gu.R.inc(19906);node.setAttribute(Boolean.TRUE);
        __CLR4_4_1fcpfcplb90p8gu.R.inc(19907);for (final Hyperplane<S> hyperplane : hyperplanes) {{
            __CLR4_4_1fcpfcplb90p8gu.R.inc(19908);if ((((node.insertCut(hyperplane))&&(__CLR4_4_1fcpfcplb90p8gu.R.iget(19909)!=0|true))||(__CLR4_4_1fcpfcplb90p8gu.R.iget(19910)==0&false))) {{
                __CLR4_4_1fcpfcplb90p8gu.R.inc(19911);node.setAttribute(null);
                __CLR4_4_1fcpfcplb90p8gu.R.inc(19912);node.getPlus().setAttribute(Boolean.FALSE);
                __CLR4_4_1fcpfcplb90p8gu.R.inc(19913);node = node.getMinus();
                __CLR4_4_1fcpfcplb90p8gu.R.inc(19914);node.setAttribute(Boolean.TRUE);
            }
        }}

        }__CLR4_4_1fcpfcplb90p8gu.R.inc(19915);return region;

    }finally{__CLR4_4_1fcpfcplb90p8gu.R.flushNeeded();}}

    /** Compute the union of two regions.
     * @param region1 first region (will be unusable after the operation as
     * parts of it will be reused in the new region)
     * @param region2 second region (will be unusable after the operation as
     * parts of it will be reused in the new region)
     * @return a new region, result of {@code region1 union region2}
     */
    public Region<S> union(final Region<S> region1, final Region<S> region2) {try{__CLR4_4_1fcpfcplb90p8gu.R.inc(19916);
        __CLR4_4_1fcpfcplb90p8gu.R.inc(19917);final BSPTree<S> tree =
            region1.getTree(false).merge(region2.getTree(false), new UnionMerger());
        __CLR4_4_1fcpfcplb90p8gu.R.inc(19918);tree.visit(nodeCleaner);
        __CLR4_4_1fcpfcplb90p8gu.R.inc(19919);return region1.buildNew(tree);
    }finally{__CLR4_4_1fcpfcplb90p8gu.R.flushNeeded();}}

    /** Compute the intersection of two regions.
     * @param region1 first region (will be unusable after the operation as
     * parts of it will be reused in the new region)
     * @param region2 second region (will be unusable after the operation as
     * parts of it will be reused in the new region)
     * @return a new region, result of {@code region1 intersection region2}
     */
    public Region<S> intersection(final Region<S> region1, final Region<S> region2) {try{__CLR4_4_1fcpfcplb90p8gu.R.inc(19920);
        __CLR4_4_1fcpfcplb90p8gu.R.inc(19921);final BSPTree<S> tree =
            region1.getTree(false).merge(region2.getTree(false), new IntersectionMerger());
        __CLR4_4_1fcpfcplb90p8gu.R.inc(19922);tree.visit(nodeCleaner);
        __CLR4_4_1fcpfcplb90p8gu.R.inc(19923);return region1.buildNew(tree);
    }finally{__CLR4_4_1fcpfcplb90p8gu.R.flushNeeded();}}

    /** Compute the symmetric difference (exclusive or) of two regions.
     * @param region1 first region (will be unusable after the operation as
     * parts of it will be reused in the new region)
     * @param region2 second region (will be unusable after the operation as
     * parts of it will be reused in the new region)
     * @return a new region, result of {@code region1 xor region2}
     */
    public Region<S> xor(final Region<S> region1, final Region<S> region2) {try{__CLR4_4_1fcpfcplb90p8gu.R.inc(19924);
        __CLR4_4_1fcpfcplb90p8gu.R.inc(19925);final BSPTree<S> tree =
            region1.getTree(false).merge(region2.getTree(false), new XorMerger());
        __CLR4_4_1fcpfcplb90p8gu.R.inc(19926);tree.visit(nodeCleaner);
        __CLR4_4_1fcpfcplb90p8gu.R.inc(19927);return region1.buildNew(tree);
    }finally{__CLR4_4_1fcpfcplb90p8gu.R.flushNeeded();}}

    /** Compute the difference of two regions.
     * @param region1 first region (will be unusable after the operation as
     * parts of it will be reused in the new region)
     * @param region2 second region (will be unusable after the operation as
     * parts of it will be reused in the new region)
     * @return a new region, result of {@code region1 minus region2}
     */
    public Region<S> difference(final Region<S> region1, final Region<S> region2) {try{__CLR4_4_1fcpfcplb90p8gu.R.inc(19928);
        __CLR4_4_1fcpfcplb90p8gu.R.inc(19929);final BSPTree<S> tree =
            region1.getTree(false).merge(region2.getTree(false), new DifferenceMerger());
        __CLR4_4_1fcpfcplb90p8gu.R.inc(19930);tree.visit(nodeCleaner);
        __CLR4_4_1fcpfcplb90p8gu.R.inc(19931);return region1.buildNew(tree);
    }finally{__CLR4_4_1fcpfcplb90p8gu.R.flushNeeded();}}

    /** Get the complement of the region (exchanged interior/exterior).
     * @param region region to complement, it will not modified, a new
     * region independent region will be built
     * @return a new region, complement of the specified one
     */
    public Region<S> getComplement(final Region<S> region) {try{__CLR4_4_1fcpfcplb90p8gu.R.inc(19932);
        __CLR4_4_1fcpfcplb90p8gu.R.inc(19933);return region.buildNew(recurseComplement(region.getTree(false)));
    }finally{__CLR4_4_1fcpfcplb90p8gu.R.flushNeeded();}}

    /** Recursively build the complement of a BSP tree.
     * @param node current node of the original tree
     * @return new tree, complement of the node
     */
    private BSPTree<S> recurseComplement(final BSPTree<S> node) {try{__CLR4_4_1fcpfcplb90p8gu.R.inc(19934);
        __CLR4_4_1fcpfcplb90p8gu.R.inc(19935);if ((((node.getCut() == null)&&(__CLR4_4_1fcpfcplb90p8gu.R.iget(19936)!=0|true))||(__CLR4_4_1fcpfcplb90p8gu.R.iget(19937)==0&false))) {{
            __CLR4_4_1fcpfcplb90p8gu.R.inc(19938);return new BSPTree<S>((((((Boolean) node.getAttribute()) )&&(__CLR4_4_1fcpfcplb90p8gu.R.iget(19939)!=0|true))||(__CLR4_4_1fcpfcplb90p8gu.R.iget(19940)==0&false))? Boolean.FALSE : Boolean.TRUE);
        }

        }__CLR4_4_1fcpfcplb90p8gu.R.inc(19941);@SuppressWarnings("unchecked")
        BoundaryAttribute<S> attribute = (BoundaryAttribute<S>) node.getAttribute();
        __CLR4_4_1fcpfcplb90p8gu.R.inc(19942);if ((((attribute != null)&&(__CLR4_4_1fcpfcplb90p8gu.R.iget(19943)!=0|true))||(__CLR4_4_1fcpfcplb90p8gu.R.iget(19944)==0&false))) {{
            __CLR4_4_1fcpfcplb90p8gu.R.inc(19945);final SubHyperplane<S> plusOutside =
                ((((attribute.getPlusInside() == null) )&&(__CLR4_4_1fcpfcplb90p8gu.R.iget(19946)!=0|true))||(__CLR4_4_1fcpfcplb90p8gu.R.iget(19947)==0&false))? null : attribute.getPlusInside().copySelf();
            __CLR4_4_1fcpfcplb90p8gu.R.inc(19948);final SubHyperplane<S> plusInside  =
                ((((attribute.getPlusOutside() == null) )&&(__CLR4_4_1fcpfcplb90p8gu.R.iget(19949)!=0|true))||(__CLR4_4_1fcpfcplb90p8gu.R.iget(19950)==0&false))? null : attribute.getPlusOutside().copySelf();
            __CLR4_4_1fcpfcplb90p8gu.R.inc(19951);attribute = new BoundaryAttribute<S>(plusOutside, plusInside);
        }

        }__CLR4_4_1fcpfcplb90p8gu.R.inc(19952);return new BSPTree<S>(node.getCut().copySelf(),
                              recurseComplement(node.getPlus()),
                              recurseComplement(node.getMinus()),
                              attribute);

    }finally{__CLR4_4_1fcpfcplb90p8gu.R.flushNeeded();}}

    /** BSP tree leaf merger computing union of two regions. */
    private class UnionMerger implements BSPTree.LeafMerger<S> {
        /** {@inheritDoc} */
        public BSPTree<S> merge(final BSPTree<S> leaf, final BSPTree<S> tree,
                                final BSPTree<S> parentTree,
                                final boolean isPlusChild, final boolean leafFromInstance) {try{__CLR4_4_1fcpfcplb90p8gu.R.inc(19953);
            __CLR4_4_1fcpfcplb90p8gu.R.inc(19954);if (((((Boolean) leaf.getAttribute())&&(__CLR4_4_1fcpfcplb90p8gu.R.iget(19955)!=0|true))||(__CLR4_4_1fcpfcplb90p8gu.R.iget(19956)==0&false))) {{
                // the leaf node represents an inside cell
                __CLR4_4_1fcpfcplb90p8gu.R.inc(19957);leaf.insertInTree(parentTree, isPlusChild);
                __CLR4_4_1fcpfcplb90p8gu.R.inc(19958);return leaf;
            }
            // the leaf node represents an outside cell
            }__CLR4_4_1fcpfcplb90p8gu.R.inc(19959);tree.insertInTree(parentTree, isPlusChild);
            __CLR4_4_1fcpfcplb90p8gu.R.inc(19960);return tree;
        }finally{__CLR4_4_1fcpfcplb90p8gu.R.flushNeeded();}}
    }

    /** BSP tree leaf merger computing union of two regions. */
    private class IntersectionMerger implements BSPTree.LeafMerger<S> {
        /** {@inheritDoc} */
        public BSPTree<S> merge(final BSPTree<S> leaf, final BSPTree<S> tree,
                                final BSPTree<S> parentTree,
                                final boolean isPlusChild, final boolean leafFromInstance) {try{__CLR4_4_1fcpfcplb90p8gu.R.inc(19961);
            __CLR4_4_1fcpfcplb90p8gu.R.inc(19962);if (((((Boolean) leaf.getAttribute())&&(__CLR4_4_1fcpfcplb90p8gu.R.iget(19963)!=0|true))||(__CLR4_4_1fcpfcplb90p8gu.R.iget(19964)==0&false))) {{
                // the leaf node represents an inside cell
                __CLR4_4_1fcpfcplb90p8gu.R.inc(19965);tree.insertInTree(parentTree, isPlusChild);
                __CLR4_4_1fcpfcplb90p8gu.R.inc(19966);return tree;
            }
            // the leaf node represents an outside cell
            }__CLR4_4_1fcpfcplb90p8gu.R.inc(19967);leaf.insertInTree(parentTree, isPlusChild);
            __CLR4_4_1fcpfcplb90p8gu.R.inc(19968);return leaf;
        }finally{__CLR4_4_1fcpfcplb90p8gu.R.flushNeeded();}}
    }

    /** BSP tree leaf merger computing union of two regions. */
    private class XorMerger implements BSPTree.LeafMerger<S> {
        /** {@inheritDoc} */
        public BSPTree<S> merge(final BSPTree<S> leaf, final BSPTree<S> tree,
                                final BSPTree<S> parentTree, final boolean isPlusChild,
                                final boolean leafFromInstance) {try{__CLR4_4_1fcpfcplb90p8gu.R.inc(19969);
            __CLR4_4_1fcpfcplb90p8gu.R.inc(19970);BSPTree<S> t = tree;
            __CLR4_4_1fcpfcplb90p8gu.R.inc(19971);if (((((Boolean) leaf.getAttribute())&&(__CLR4_4_1fcpfcplb90p8gu.R.iget(19972)!=0|true))||(__CLR4_4_1fcpfcplb90p8gu.R.iget(19973)==0&false))) {{
                // the leaf node represents an inside cell
                __CLR4_4_1fcpfcplb90p8gu.R.inc(19974);t = recurseComplement(t);
            }
            }__CLR4_4_1fcpfcplb90p8gu.R.inc(19975);t.insertInTree(parentTree, isPlusChild);
            __CLR4_4_1fcpfcplb90p8gu.R.inc(19976);return t;
        }finally{__CLR4_4_1fcpfcplb90p8gu.R.flushNeeded();}}
    }

    /** BSP tree leaf merger computing union of two regions. */
    private class DifferenceMerger implements BSPTree.LeafMerger<S> {
        /** {@inheritDoc} */
        public BSPTree<S> merge(final BSPTree<S> leaf, final BSPTree<S> tree,
                                final BSPTree<S> parentTree, final boolean isPlusChild,
                                final boolean leafFromInstance) {try{__CLR4_4_1fcpfcplb90p8gu.R.inc(19977);
            __CLR4_4_1fcpfcplb90p8gu.R.inc(19978);if (((((Boolean) leaf.getAttribute())&&(__CLR4_4_1fcpfcplb90p8gu.R.iget(19979)!=0|true))||(__CLR4_4_1fcpfcplb90p8gu.R.iget(19980)==0&false))) {{
                // the leaf node represents an inside cell
                __CLR4_4_1fcpfcplb90p8gu.R.inc(19981);final BSPTree<S> argTree =
                    recurseComplement((((leafFromInstance )&&(__CLR4_4_1fcpfcplb90p8gu.R.iget(19982)!=0|true))||(__CLR4_4_1fcpfcplb90p8gu.R.iget(19983)==0&false))? tree : leaf);
                __CLR4_4_1fcpfcplb90p8gu.R.inc(19984);argTree.insertInTree(parentTree, isPlusChild);
                __CLR4_4_1fcpfcplb90p8gu.R.inc(19985);return argTree;
            }
            // the leaf node represents an outside cell
            }__CLR4_4_1fcpfcplb90p8gu.R.inc(19986);final BSPTree<S> instanceTree =
                (((leafFromInstance )&&(__CLR4_4_1fcpfcplb90p8gu.R.iget(19987)!=0|true))||(__CLR4_4_1fcpfcplb90p8gu.R.iget(19988)==0&false))? leaf : tree;
            __CLR4_4_1fcpfcplb90p8gu.R.inc(19989);instanceTree.insertInTree(parentTree, isPlusChild);
            __CLR4_4_1fcpfcplb90p8gu.R.inc(19990);return instanceTree;
        }finally{__CLR4_4_1fcpfcplb90p8gu.R.flushNeeded();}}
    }

    /** Visitor removing internal nodes attributes. */
    private class NodesCleaner implements  BSPTreeVisitor<S> {

        /** {@inheritDoc} */
        public Order visitOrder(final BSPTree<S> node) {try{__CLR4_4_1fcpfcplb90p8gu.R.inc(19991);
            __CLR4_4_1fcpfcplb90p8gu.R.inc(19992);return Order.PLUS_SUB_MINUS;
        }finally{__CLR4_4_1fcpfcplb90p8gu.R.flushNeeded();}}

        /** {@inheritDoc} */
        public void visitInternalNode(final BSPTree<S> node) {try{__CLR4_4_1fcpfcplb90p8gu.R.inc(19993);
            __CLR4_4_1fcpfcplb90p8gu.R.inc(19994);node.setAttribute(null);
        }finally{__CLR4_4_1fcpfcplb90p8gu.R.flushNeeded();}}

        /** {@inheritDoc} */
        public void visitLeafNode(final BSPTree<S> node) {try{__CLR4_4_1fcpfcplb90p8gu.R.inc(19995);
        }finally{__CLR4_4_1fcpfcplb90p8gu.R.flushNeeded();}}

    }

}
