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

/** This class implements the dimension-independent parts of {@link SubHyperplane}.

 * <p>sub-hyperplanes are obtained when parts of an {@link
 * Hyperplane hyperplane} are chopped off by other hyperplanes that
 * intersect it. The remaining part is a convex region. Such objects
 * appear in {@link BSPTree BSP trees} as the intersection of a cut
 * hyperplane with the convex region which it splits, the chopping
 * hyperplanes are the cut hyperplanes closer to the tree root.</p>

 * @param <S> Type of the embedding space.
 * @param <T> Type of the embedded sub-space.

 * @version $Id$
 * @since 3.0
 */
public abstract class AbstractSubHyperplane<S extends Space, T extends Space>
    implements SubHyperplane<S> {public static class __CLR4_4_1f40f40lb90p8fq{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,19621,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** Underlying hyperplane. */
    private final Hyperplane<S> hyperplane;

    /** Remaining region of the hyperplane. */
    private final Region<T> remainingRegion;

    /** Build a sub-hyperplane from an hyperplane and a region.
     * @param hyperplane underlying hyperplane
     * @param remainingRegion remaining region of the hyperplane
     */
    protected AbstractSubHyperplane(final Hyperplane<S> hyperplane,
                                    final Region<T> remainingRegion) {try{__CLR4_4_1f40f40lb90p8fq.R.inc(19584);
        __CLR4_4_1f40f40lb90p8fq.R.inc(19585);this.hyperplane      = hyperplane;
        __CLR4_4_1f40f40lb90p8fq.R.inc(19586);this.remainingRegion = remainingRegion;
    }finally{__CLR4_4_1f40f40lb90p8fq.R.flushNeeded();}}

    /** Build a sub-hyperplane from an hyperplane and a region.
     * @param hyper underlying hyperplane
     * @param remaining remaining region of the hyperplane
     * @return a new sub-hyperplane
     */
    protected abstract AbstractSubHyperplane<S, T> buildNew(final Hyperplane<S> hyper,
                                                            final Region<T> remaining);

    /** {@inheritDoc} */
    public AbstractSubHyperplane<S, T> copySelf() {try{__CLR4_4_1f40f40lb90p8fq.R.inc(19587);
        __CLR4_4_1f40f40lb90p8fq.R.inc(19588);return buildNew(hyperplane, remainingRegion);
    }finally{__CLR4_4_1f40f40lb90p8fq.R.flushNeeded();}}

    /** Get the underlying hyperplane.
     * @return underlying hyperplane
     */
    public Hyperplane<S> getHyperplane() {try{__CLR4_4_1f40f40lb90p8fq.R.inc(19589);
        __CLR4_4_1f40f40lb90p8fq.R.inc(19590);return hyperplane;
    }finally{__CLR4_4_1f40f40lb90p8fq.R.flushNeeded();}}

    /** Get the remaining region of the hyperplane.
     * <p>The returned region is expressed in the canonical hyperplane
     * frame and has the hyperplane dimension. For example a chopped
     * hyperplane in the 3D euclidean is a 2D plane and the
     * corresponding region is a convex 2D polygon.</p>
     * @return remaining region of the hyperplane
     */
    public Region<T> getRemainingRegion() {try{__CLR4_4_1f40f40lb90p8fq.R.inc(19591);
        __CLR4_4_1f40f40lb90p8fq.R.inc(19592);return remainingRegion;
    }finally{__CLR4_4_1f40f40lb90p8fq.R.flushNeeded();}}

    /** {@inheritDoc} */
    public double getSize() {try{__CLR4_4_1f40f40lb90p8fq.R.inc(19593);
        __CLR4_4_1f40f40lb90p8fq.R.inc(19594);return remainingRegion.getSize();
    }finally{__CLR4_4_1f40f40lb90p8fq.R.flushNeeded();}}

    /** {@inheritDoc} */
    public AbstractSubHyperplane<S, T> reunite(final SubHyperplane<S> other) {try{__CLR4_4_1f40f40lb90p8fq.R.inc(19595);
        __CLR4_4_1f40f40lb90p8fq.R.inc(19596);@SuppressWarnings("unchecked")
        AbstractSubHyperplane<S, T> o = (AbstractSubHyperplane<S, T>) other;
        __CLR4_4_1f40f40lb90p8fq.R.inc(19597);return buildNew(hyperplane,
                        new RegionFactory<T>().union(remainingRegion, o.remainingRegion));
    }finally{__CLR4_4_1f40f40lb90p8fq.R.flushNeeded();}}

    /** Apply a transform to the instance.
     * <p>The instance must be a (D-1)-dimension sub-hyperplane with
     * respect to the transform <em>not</em> a (D-2)-dimension
     * sub-hyperplane the transform knows how to transform by
     * itself. The transform will consist in transforming first the
     * hyperplane and then the all region using the various methods
     * provided by the transform.</p>
     * @param transform D-dimension transform to apply
     * @return the transformed instance
     */
    public AbstractSubHyperplane<S, T> applyTransform(final Transform<S, T> transform) {try{__CLR4_4_1f40f40lb90p8fq.R.inc(19598);
        __CLR4_4_1f40f40lb90p8fq.R.inc(19599);final Hyperplane<S> tHyperplane = transform.apply(hyperplane);
        __CLR4_4_1f40f40lb90p8fq.R.inc(19600);final BSPTree<T> tTree =
            recurseTransform(remainingRegion.getTree(false), tHyperplane, transform);
        __CLR4_4_1f40f40lb90p8fq.R.inc(19601);return buildNew(tHyperplane, remainingRegion.buildNew(tTree));
    }finally{__CLR4_4_1f40f40lb90p8fq.R.flushNeeded();}}

    /** Recursively transform a BSP-tree from a sub-hyperplane.
     * @param node current BSP tree node
     * @param transformed image of the instance hyperplane by the transform
     * @param transform transform to apply
     * @return a new tree
     */
    private BSPTree<T> recurseTransform(final BSPTree<T> node,
                                        final Hyperplane<S> transformed,
                                        final Transform<S, T> transform) {try{__CLR4_4_1f40f40lb90p8fq.R.inc(19602);
        __CLR4_4_1f40f40lb90p8fq.R.inc(19603);if ((((node.getCut() == null)&&(__CLR4_4_1f40f40lb90p8fq.R.iget(19604)!=0|true))||(__CLR4_4_1f40f40lb90p8fq.R.iget(19605)==0&false))) {{
            __CLR4_4_1f40f40lb90p8fq.R.inc(19606);return new BSPTree<T>(node.getAttribute());
        }

        }__CLR4_4_1f40f40lb90p8fq.R.inc(19607);@SuppressWarnings("unchecked")
        BoundaryAttribute<T> attribute =
            (BoundaryAttribute<T>) node.getAttribute();
        __CLR4_4_1f40f40lb90p8fq.R.inc(19608);if ((((attribute != null)&&(__CLR4_4_1f40f40lb90p8fq.R.iget(19609)!=0|true))||(__CLR4_4_1f40f40lb90p8fq.R.iget(19610)==0&false))) {{
            __CLR4_4_1f40f40lb90p8fq.R.inc(19611);final SubHyperplane<T> tPO = ((((attribute.getPlusOutside() == null) )&&(__CLR4_4_1f40f40lb90p8fq.R.iget(19612)!=0|true))||(__CLR4_4_1f40f40lb90p8fq.R.iget(19613)==0&false))?
                null : transform.apply(attribute.getPlusOutside(), hyperplane, transformed);
            __CLR4_4_1f40f40lb90p8fq.R.inc(19614);final SubHyperplane<T> tPI = ((((attribute.getPlusInside() == null) )&&(__CLR4_4_1f40f40lb90p8fq.R.iget(19615)!=0|true))||(__CLR4_4_1f40f40lb90p8fq.R.iget(19616)==0&false))?
                null : transform.apply(attribute.getPlusInside(), hyperplane, transformed);
            __CLR4_4_1f40f40lb90p8fq.R.inc(19617);attribute = new BoundaryAttribute<T>(tPO, tPI);
        }

        }__CLR4_4_1f40f40lb90p8fq.R.inc(19618);return new BSPTree<T>(transform.apply(node.getCut(), hyperplane, transformed),
                              recurseTransform(node.getPlus(), transformed, transform),
                              recurseTransform(node.getMinus(), transformed, transform),
                              attribute);

    }finally{__CLR4_4_1f40f40lb90p8fq.R.flushNeeded();}}

    /** {@inheritDoc} */
    public abstract Side side(Hyperplane<S> hyper);

    /** {@inheritDoc} */
    public abstract SplitSubHyperplane<S> split(Hyperplane<S> hyper);

    /** {@inheritDoc} */
    public boolean isEmpty() {try{__CLR4_4_1f40f40lb90p8fq.R.inc(19619);
        __CLR4_4_1f40f40lb90p8fq.R.inc(19620);return remainingRegion.isEmpty();
    }finally{__CLR4_4_1f40f40lb90p8fq.R.flushNeeded();}}

}
