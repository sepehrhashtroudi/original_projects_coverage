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

import org.apache.commons.math3.geometry.euclidean.oned.Vector1D;
import org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D;
import org.apache.commons.math3.geometry.euclidean.twod.Vector2D;
import org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet;
import org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane;
import org.apache.commons.math3.geometry.partitioning.BSPTree;
import org.apache.commons.math3.geometry.partitioning.Hyperplane;
import org.apache.commons.math3.geometry.partitioning.Region;
import org.apache.commons.math3.geometry.partitioning.Side;
import org.apache.commons.math3.geometry.partitioning.SubHyperplane;

/** This class represents a sub-hyperplane for {@link Plane}.
 * @version $Id$
 * @since 3.0
 */
public class SubPlane extends AbstractSubHyperplane<Euclidean3D, Euclidean2D> {public static class __CLR4_4_1dzidzilb90p8bw{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,18184,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** Simple constructor.
     * @param hyperplane underlying hyperplane
     * @param remainingRegion remaining region of the hyperplane
     */
    public SubPlane(final Hyperplane<Euclidean3D> hyperplane,
                    final Region<Euclidean2D> remainingRegion) {
        super(hyperplane, remainingRegion);__CLR4_4_1dzidzilb90p8bw.R.inc(18127);try{__CLR4_4_1dzidzilb90p8bw.R.inc(18126);
    }finally{__CLR4_4_1dzidzilb90p8bw.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    protected AbstractSubHyperplane<Euclidean3D, Euclidean2D> buildNew(final Hyperplane<Euclidean3D> hyperplane,
                                                                       final Region<Euclidean2D> remainingRegion) {try{__CLR4_4_1dzidzilb90p8bw.R.inc(18128);
        __CLR4_4_1dzidzilb90p8bw.R.inc(18129);return new SubPlane(hyperplane, remainingRegion);
    }finally{__CLR4_4_1dzidzilb90p8bw.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public Side side(Hyperplane<Euclidean3D> hyperplane) {try{__CLR4_4_1dzidzilb90p8bw.R.inc(18130);

        __CLR4_4_1dzidzilb90p8bw.R.inc(18131);final Plane otherPlane = (Plane) hyperplane;
        __CLR4_4_1dzidzilb90p8bw.R.inc(18132);final Plane thisPlane  = (Plane) getHyperplane();
        __CLR4_4_1dzidzilb90p8bw.R.inc(18133);final Line  inter      = otherPlane.intersection(thisPlane);

        __CLR4_4_1dzidzilb90p8bw.R.inc(18134);if ((((inter == null)&&(__CLR4_4_1dzidzilb90p8bw.R.iget(18135)!=0|true))||(__CLR4_4_1dzidzilb90p8bw.R.iget(18136)==0&false))) {{
            // the hyperplanes are parallel,
            // any point can be used to check their relative position
            __CLR4_4_1dzidzilb90p8bw.R.inc(18137);final double global = otherPlane.getOffset(thisPlane);
            __CLR4_4_1dzidzilb90p8bw.R.inc(18138);return ((((global < -1.0e-10) )&&(__CLR4_4_1dzidzilb90p8bw.R.iget(18139)!=0|true))||(__CLR4_4_1dzidzilb90p8bw.R.iget(18140)==0&false))? Side.MINUS : (((((global > 1.0e-10) )&&(__CLR4_4_1dzidzilb90p8bw.R.iget(18141)!=0|true))||(__CLR4_4_1dzidzilb90p8bw.R.iget(18142)==0&false))? Side.PLUS : Side.HYPER);
        }

        // create a 2D line in the otherPlane canonical 2D frame such that:
        //   - the line is the crossing line of the two planes in 3D
        //   - the line splits the otherPlane in two half planes with an
        //     orientation consistent with the orientation of the instance
        //     (i.e. the 3D half space on the plus side (resp. minus side)
        //      of the instance contains the 2D half plane on the plus side
        //      (resp. minus side) of the 2D line
        }__CLR4_4_1dzidzilb90p8bw.R.inc(18143);Vector2D p = thisPlane.toSubSpace(inter.toSpace(Vector1D.ZERO));
        __CLR4_4_1dzidzilb90p8bw.R.inc(18144);Vector2D q = thisPlane.toSubSpace(inter.toSpace(Vector1D.ONE));
        __CLR4_4_1dzidzilb90p8bw.R.inc(18145);Vector3D crossP = Vector3D.crossProduct(inter.getDirection(), thisPlane.getNormal());
        __CLR4_4_1dzidzilb90p8bw.R.inc(18146);if ((((crossP.dotProduct(otherPlane.getNormal()) < 0)&&(__CLR4_4_1dzidzilb90p8bw.R.iget(18147)!=0|true))||(__CLR4_4_1dzidzilb90p8bw.R.iget(18148)==0&false))) {{
            __CLR4_4_1dzidzilb90p8bw.R.inc(18149);final Vector2D tmp = p;
            __CLR4_4_1dzidzilb90p8bw.R.inc(18150);p           = q;
            __CLR4_4_1dzidzilb90p8bw.R.inc(18151);q           = tmp;
        }
        }__CLR4_4_1dzidzilb90p8bw.R.inc(18152);final org.apache.commons.math3.geometry.euclidean.twod.Line line2D =
            new org.apache.commons.math3.geometry.euclidean.twod.Line(p, q);

        // check the side on the 2D plane
        __CLR4_4_1dzidzilb90p8bw.R.inc(18153);return getRemainingRegion().side(line2D);

    }finally{__CLR4_4_1dzidzilb90p8bw.R.flushNeeded();}}

    /** Split the instance in two parts by an hyperplane.
     * @param hyperplane splitting hyperplane
     * @return an object containing both the part of the instance
     * on the plus side of the instance and the part of the
     * instance on the minus side of the instance
     */
    @Override
    public SplitSubHyperplane<Euclidean3D> split(Hyperplane<Euclidean3D> hyperplane) {try{__CLR4_4_1dzidzilb90p8bw.R.inc(18154);

        __CLR4_4_1dzidzilb90p8bw.R.inc(18155);final Plane otherPlane = (Plane) hyperplane;
        __CLR4_4_1dzidzilb90p8bw.R.inc(18156);final Plane thisPlane  = (Plane) getHyperplane();
        __CLR4_4_1dzidzilb90p8bw.R.inc(18157);final Line  inter      = otherPlane.intersection(thisPlane);

        __CLR4_4_1dzidzilb90p8bw.R.inc(18158);if ((((inter == null)&&(__CLR4_4_1dzidzilb90p8bw.R.iget(18159)!=0|true))||(__CLR4_4_1dzidzilb90p8bw.R.iget(18160)==0&false))) {{
            // the hyperplanes are parallel
            __CLR4_4_1dzidzilb90p8bw.R.inc(18161);final double global = otherPlane.getOffset(thisPlane);
            __CLR4_4_1dzidzilb90p8bw.R.inc(18162);return ((((global < -1.0e-10) )&&(__CLR4_4_1dzidzilb90p8bw.R.iget(18163)!=0|true))||(__CLR4_4_1dzidzilb90p8bw.R.iget(18164)==0&false))?
                   new SplitSubHyperplane<Euclidean3D>(null, this) :
                   new SplitSubHyperplane<Euclidean3D>(this, null);
        }

        // the hyperplanes do intersect
        }__CLR4_4_1dzidzilb90p8bw.R.inc(18165);Vector2D p = thisPlane.toSubSpace(inter.toSpace(Vector1D.ZERO));
        __CLR4_4_1dzidzilb90p8bw.R.inc(18166);Vector2D q = thisPlane.toSubSpace(inter.toSpace(Vector1D.ONE));
        __CLR4_4_1dzidzilb90p8bw.R.inc(18167);Vector3D crossP = Vector3D.crossProduct(inter.getDirection(), thisPlane.getNormal());
        __CLR4_4_1dzidzilb90p8bw.R.inc(18168);if ((((crossP.dotProduct(otherPlane.getNormal()) < 0)&&(__CLR4_4_1dzidzilb90p8bw.R.iget(18169)!=0|true))||(__CLR4_4_1dzidzilb90p8bw.R.iget(18170)==0&false))) {{
            __CLR4_4_1dzidzilb90p8bw.R.inc(18171);final Vector2D tmp = p;
            __CLR4_4_1dzidzilb90p8bw.R.inc(18172);p           = q;
            __CLR4_4_1dzidzilb90p8bw.R.inc(18173);q           = tmp;
        }
        }__CLR4_4_1dzidzilb90p8bw.R.inc(18174);final SubHyperplane<Euclidean2D> l2DMinus =
            new org.apache.commons.math3.geometry.euclidean.twod.Line(p, q).wholeHyperplane();
        __CLR4_4_1dzidzilb90p8bw.R.inc(18175);final SubHyperplane<Euclidean2D> l2DPlus =
            new org.apache.commons.math3.geometry.euclidean.twod.Line(q, p).wholeHyperplane();

        __CLR4_4_1dzidzilb90p8bw.R.inc(18176);final BSPTree<Euclidean2D> splitTree = getRemainingRegion().getTree(false).split(l2DMinus);
        __CLR4_4_1dzidzilb90p8bw.R.inc(18177);final BSPTree<Euclidean2D> plusTree  = (((getRemainingRegion().isEmpty(splitTree.getPlus()) )&&(__CLR4_4_1dzidzilb90p8bw.R.iget(18178)!=0|true))||(__CLR4_4_1dzidzilb90p8bw.R.iget(18179)==0&false))?
                                               new BSPTree<Euclidean2D>(Boolean.FALSE) :
                                               new BSPTree<Euclidean2D>(l2DPlus, new BSPTree<Euclidean2D>(Boolean.FALSE),
                                                                        splitTree.getPlus(), null);

        __CLR4_4_1dzidzilb90p8bw.R.inc(18180);final BSPTree<Euclidean2D> minusTree = (((getRemainingRegion().isEmpty(splitTree.getMinus()) )&&(__CLR4_4_1dzidzilb90p8bw.R.iget(18181)!=0|true))||(__CLR4_4_1dzidzilb90p8bw.R.iget(18182)==0&false))?
                                               new BSPTree<Euclidean2D>(Boolean.FALSE) :
                                                   new BSPTree<Euclidean2D>(l2DMinus, new BSPTree<Euclidean2D>(Boolean.FALSE),
                                                                            splitTree.getMinus(), null);

        __CLR4_4_1dzidzilb90p8bw.R.inc(18183);return new SplitSubHyperplane<Euclidean3D>(new SubPlane(thisPlane.copySelf(), new PolygonsSet(plusTree)),
                                                   new SubPlane(thisPlane.copySelf(), new PolygonsSet(minusTree)));

    }finally{__CLR4_4_1dzidzilb90p8bw.R.flushNeeded();}}

}
