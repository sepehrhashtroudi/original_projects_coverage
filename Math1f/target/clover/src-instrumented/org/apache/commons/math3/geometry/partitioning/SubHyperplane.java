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

/** This interface represents the remaining parts of an hyperplane after
 * other parts have been chopped off.

 * <p>sub-hyperplanes are obtained when parts of an {@link
 * Hyperplane hyperplane} are chopped off by other hyperplanes that
 * intersect it. The remaining part is a convex region. Such objects
 * appear in {@link BSPTree BSP trees} as the intersection of a cut
 * hyperplane with the convex region which it splits, the chopping
 * hyperplanes are the cut hyperplanes closer to the tree root.</p>

 * @param <S> Type of the embedding space.

 * @version $Id$
 * @since 3.0
 */
public interface SubHyperplane<S extends Space> {public static class __CLR4_4_1ffgffglb90p8gy{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,20003,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** Copy the instance.
     * <p>The instance created is completely independent of the original
     * one. A deep copy is used, none of the underlying objects are
     * shared (except for the nodes attributes and immutable
     * objects).</p>
     * @return a new sub-hyperplane, copy of the instance
     */
    SubHyperplane<S> copySelf();

    /** Get the underlying hyperplane.
     * @return underlying hyperplane
     */
    Hyperplane<S> getHyperplane();

    /** Check if the instance is empty.
     * @return true if the instance is empty
     */
    boolean isEmpty();

    /** Get the size of the instance.
     * @return the size of the instance (this is a length in 1D, an area
     * in 2D, a volume in 3D ...)
     */
    double getSize();

    /** Compute the relative position of the instance with respect
     * to an hyperplane.
     * @param hyperplane hyperplane to check instance against
     * @return one of {@link Side#PLUS}, {@link Side#MINUS}, {@link Side#BOTH},
     * {@link Side#HYPER}
     */
    Side side(Hyperplane<S> hyperplane);

    /** Split the instance in two parts by an hyperplane.
     * @param hyperplane splitting hyperplane
     * @return an object containing both the part of the instance
     * on the plus side of the instance and the part of the
     * instance on the minus side of the instance
     */
    SplitSubHyperplane<S> split(Hyperplane<S> hyperplane);

    /** Compute the union of the instance and another sub-hyperplane.
     * @param other other sub-hyperplane to union (<em>must</em> be in the
     * same hyperplane as the instance)
     * @return a new sub-hyperplane, union of the instance and other
     */
    SubHyperplane<S> reunite(SubHyperplane<S> other);

    /** Class holding the results of the {@link #split split} method.
     * @param <U> Type of the embedding space.
     */
    public static class SplitSubHyperplane<U extends Space> {

        /** Part of the sub-hyperplane on the plus side of the splitting hyperplane. */
        private final SubHyperplane<U> plus;

        /** Part of the sub-hyperplane on the minus side of the splitting hyperplane. */
        private final SubHyperplane<U> minus;

        /** Build a SplitSubHyperplane from its parts.
         * @param plus part of the sub-hyperplane on the plus side of the
         * splitting hyperplane
         * @param minus part of the sub-hyperplane on the minus side of the
         * splitting hyperplane
         */
        public SplitSubHyperplane(final SubHyperplane<U> plus,
                                  final SubHyperplane<U> minus) {try{__CLR4_4_1ffgffglb90p8gy.R.inc(19996);
            __CLR4_4_1ffgffglb90p8gy.R.inc(19997);this.plus  = plus;
            __CLR4_4_1ffgffglb90p8gy.R.inc(19998);this.minus = minus;
        }finally{__CLR4_4_1ffgffglb90p8gy.R.flushNeeded();}}

        /** Get the part of the sub-hyperplane on the plus side of the splitting hyperplane.
         * @return part of the sub-hyperplane on the plus side of the splitting hyperplane
         */
        public SubHyperplane<U> getPlus() {try{__CLR4_4_1ffgffglb90p8gy.R.inc(19999);
            __CLR4_4_1ffgffglb90p8gy.R.inc(20000);return plus;
        }finally{__CLR4_4_1ffgffglb90p8gy.R.flushNeeded();}}

        /** Get the part of the sub-hyperplane on the minus side of the splitting hyperplane.
         * @return part of the sub-hyperplane on the minus side of the splitting hyperplane
         */
        public SubHyperplane<U> getMinus() {try{__CLR4_4_1ffgffglb90p8gy.R.inc(20001);
            __CLR4_4_1ffgffglb90p8gy.R.inc(20002);return minus;
        }finally{__CLR4_4_1ffgffglb90p8gy.R.flushNeeded();}}

    }

}
