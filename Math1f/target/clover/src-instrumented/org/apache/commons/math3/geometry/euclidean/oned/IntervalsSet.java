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
package org.apache.commons.math3.geometry.euclidean.oned;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.apache.commons.math3.geometry.partitioning.AbstractRegion;
import org.apache.commons.math3.geometry.partitioning.BSPTree;
import org.apache.commons.math3.geometry.partitioning.SubHyperplane;
import org.apache.commons.math3.util.Precision;

/** This class represents a 1D region: a set of intervals.
 * @version $Id$
 * @since 3.0
 */
public class IntervalsSet extends AbstractRegion<Euclidean1D, Euclidean1D> {public static class __CLR4_4_1cb1cb1lb90p821{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,16054,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** Build an intervals set representing the whole real line.
     */
    public IntervalsSet() {
        super();__CLR4_4_1cb1cb1lb90p821.R.inc(15950);try{__CLR4_4_1cb1cb1lb90p821.R.inc(15949);
    }finally{__CLR4_4_1cb1cb1lb90p821.R.flushNeeded();}}

    /** Build an intervals set corresponding to a single interval.
     * @param lower lower bound of the interval, must be lesser or equal
     * to {@code upper} (may be {@code Double.NEGATIVE_INFINITY})
     * @param upper upper bound of the interval, must be greater or equal
     * to {@code lower} (may be {@code Double.POSITIVE_INFINITY})
     */
    public IntervalsSet(final double lower, final double upper) {
        super(buildTree(lower, upper));__CLR4_4_1cb1cb1lb90p821.R.inc(15952);try{__CLR4_4_1cb1cb1lb90p821.R.inc(15951);
    }finally{__CLR4_4_1cb1cb1lb90p821.R.flushNeeded();}}

    /** Build an intervals set from an inside/outside BSP tree.
     * <p>The leaf nodes of the BSP tree <em>must</em> have a
     * {@code Boolean} attribute representing the inside status of
     * the corresponding cell (true for inside cells, false for outside
     * cells). In order to avoid building too many small objects, it is
     * recommended to use the predefined constants
     * {@code Boolean.TRUE} and {@code Boolean.FALSE}</p>
     * @param tree inside/outside BSP tree representing the intervals set
     */
    public IntervalsSet(final BSPTree<Euclidean1D> tree) {
        super(tree);__CLR4_4_1cb1cb1lb90p821.R.inc(15954);try{__CLR4_4_1cb1cb1lb90p821.R.inc(15953);
    }finally{__CLR4_4_1cb1cb1lb90p821.R.flushNeeded();}}

    /** Build an intervals set from a Boundary REPresentation (B-rep).
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
     * calls to the {@link
     * org.apache.commons.math3.geometry.partitioning.Region#checkPoint(org.apache.commons.math3.geometry.Vector)
     * checkPoint} method will not be meaningful anymore.</p>
     * <p>If the boundary is empty, the region will represent the whole
     * space.</p>
     * @param boundary collection of boundary elements
     */
    public IntervalsSet(final Collection<SubHyperplane<Euclidean1D>> boundary) {
        super(boundary);__CLR4_4_1cb1cb1lb90p821.R.inc(15956);try{__CLR4_4_1cb1cb1lb90p821.R.inc(15955);
    }finally{__CLR4_4_1cb1cb1lb90p821.R.flushNeeded();}}

    /** Build an inside/outside tree representing a single interval.
     * @param lower lower bound of the interval, must be lesser or equal
     * to {@code upper} (may be {@code Double.NEGATIVE_INFINITY})
     * @param upper upper bound of the interval, must be greater or equal
     * to {@code lower} (may be {@code Double.POSITIVE_INFINITY})
     * @return the built tree
     */
    private static BSPTree<Euclidean1D> buildTree(final double lower, final double upper) {try{__CLR4_4_1cb1cb1lb90p821.R.inc(15957);
        __CLR4_4_1cb1cb1lb90p821.R.inc(15958);if ((((Double.isInfinite(lower) && (lower < 0))&&(__CLR4_4_1cb1cb1lb90p821.R.iget(15959)!=0|true))||(__CLR4_4_1cb1cb1lb90p821.R.iget(15960)==0&false))) {{
            __CLR4_4_1cb1cb1lb90p821.R.inc(15961);if ((((Double.isInfinite(upper) && (upper > 0))&&(__CLR4_4_1cb1cb1lb90p821.R.iget(15962)!=0|true))||(__CLR4_4_1cb1cb1lb90p821.R.iget(15963)==0&false))) {{
                // the tree must cover the whole real line
                __CLR4_4_1cb1cb1lb90p821.R.inc(15964);return new BSPTree<Euclidean1D>(Boolean.TRUE);
            }
            // the tree must be open on the negative infinity side
            }__CLR4_4_1cb1cb1lb90p821.R.inc(15965);final SubHyperplane<Euclidean1D> upperCut =
                new OrientedPoint(new Vector1D(upper), true).wholeHyperplane();
            __CLR4_4_1cb1cb1lb90p821.R.inc(15966);return new BSPTree<Euclidean1D>(upperCut,
                               new BSPTree<Euclidean1D>(Boolean.FALSE),
                               new BSPTree<Euclidean1D>(Boolean.TRUE),
                               null);
        }
        }__CLR4_4_1cb1cb1lb90p821.R.inc(15967);final SubHyperplane<Euclidean1D> lowerCut =
            new OrientedPoint(new Vector1D(lower), false).wholeHyperplane();
        __CLR4_4_1cb1cb1lb90p821.R.inc(15968);if ((((Double.isInfinite(upper) && (upper > 0))&&(__CLR4_4_1cb1cb1lb90p821.R.iget(15969)!=0|true))||(__CLR4_4_1cb1cb1lb90p821.R.iget(15970)==0&false))) {{
            // the tree must be open on the positive infinity side
            __CLR4_4_1cb1cb1lb90p821.R.inc(15971);return new BSPTree<Euclidean1D>(lowerCut,
                                            new BSPTree<Euclidean1D>(Boolean.FALSE),
                                            new BSPTree<Euclidean1D>(Boolean.TRUE),
                                            null);
        }

        // the tree must be bounded on the two sides
        }__CLR4_4_1cb1cb1lb90p821.R.inc(15972);final SubHyperplane<Euclidean1D> upperCut =
            new OrientedPoint(new Vector1D(upper), true).wholeHyperplane();
        __CLR4_4_1cb1cb1lb90p821.R.inc(15973);return new BSPTree<Euclidean1D>(lowerCut,
                                        new BSPTree<Euclidean1D>(Boolean.FALSE),
                                        new BSPTree<Euclidean1D>(upperCut,
                                                                 new BSPTree<Euclidean1D>(Boolean.FALSE),
                                                                 new BSPTree<Euclidean1D>(Boolean.TRUE),
                                                                 null),
                                        null);

    }finally{__CLR4_4_1cb1cb1lb90p821.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public IntervalsSet buildNew(final BSPTree<Euclidean1D> tree) {try{__CLR4_4_1cb1cb1lb90p821.R.inc(15974);
        __CLR4_4_1cb1cb1lb90p821.R.inc(15975);return new IntervalsSet(tree);
    }finally{__CLR4_4_1cb1cb1lb90p821.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    protected void computeGeometricalProperties() {try{__CLR4_4_1cb1cb1lb90p821.R.inc(15976);
        __CLR4_4_1cb1cb1lb90p821.R.inc(15977);if ((((getTree(false).getCut() == null)&&(__CLR4_4_1cb1cb1lb90p821.R.iget(15978)!=0|true))||(__CLR4_4_1cb1cb1lb90p821.R.iget(15979)==0&false))) {{
            __CLR4_4_1cb1cb1lb90p821.R.inc(15980);setBarycenter(Vector1D.NaN);
            __CLR4_4_1cb1cb1lb90p821.R.inc(15981);setSize((((((Boolean) getTree(false).getAttribute()) )&&(__CLR4_4_1cb1cb1lb90p821.R.iget(15982)!=0|true))||(__CLR4_4_1cb1cb1lb90p821.R.iget(15983)==0&false))? Double.POSITIVE_INFINITY : 0);
        } }else {{
            __CLR4_4_1cb1cb1lb90p821.R.inc(15984);double size = 0.0;
            __CLR4_4_1cb1cb1lb90p821.R.inc(15985);double sum = 0.0;
            __CLR4_4_1cb1cb1lb90p821.R.inc(15986);for (final Interval interval : asList()) {{
                __CLR4_4_1cb1cb1lb90p821.R.inc(15987);size += interval.getSize();
                __CLR4_4_1cb1cb1lb90p821.R.inc(15988);sum  += interval.getSize() * interval.getBarycenter();
            }
            }__CLR4_4_1cb1cb1lb90p821.R.inc(15989);setSize(size);
            __CLR4_4_1cb1cb1lb90p821.R.inc(15990);if ((((Double.isInfinite(size))&&(__CLR4_4_1cb1cb1lb90p821.R.iget(15991)!=0|true))||(__CLR4_4_1cb1cb1lb90p821.R.iget(15992)==0&false))) {{
                __CLR4_4_1cb1cb1lb90p821.R.inc(15993);setBarycenter(Vector1D.NaN);
            } }else {__CLR4_4_1cb1cb1lb90p821.R.inc(15994);if ((((size >= Precision.SAFE_MIN)&&(__CLR4_4_1cb1cb1lb90p821.R.iget(15995)!=0|true))||(__CLR4_4_1cb1cb1lb90p821.R.iget(15996)==0&false))) {{
                __CLR4_4_1cb1cb1lb90p821.R.inc(15997);setBarycenter(new Vector1D(sum / size));
            } }else {{
                __CLR4_4_1cb1cb1lb90p821.R.inc(15998);setBarycenter(((OrientedPoint) getTree(false).getCut().getHyperplane()).getLocation());
            }
        }}}
    }}finally{__CLR4_4_1cb1cb1lb90p821.R.flushNeeded();}}

    /** Get the lowest value belonging to the instance.
     * @return lowest value belonging to the instance
     * ({@code Double.NEGATIVE_INFINITY} if the instance doesn't
     * have any low bound, {@code Double.POSITIVE_INFINITY} if the
     * instance is empty)
     */
    public double getInf() {try{__CLR4_4_1cb1cb1lb90p821.R.inc(15999);
        __CLR4_4_1cb1cb1lb90p821.R.inc(16000);BSPTree<Euclidean1D> node = getTree(false);
        __CLR4_4_1cb1cb1lb90p821.R.inc(16001);double  inf  = Double.POSITIVE_INFINITY;
        __CLR4_4_1cb1cb1lb90p821.R.inc(16002);while ((((node.getCut() != null)&&(__CLR4_4_1cb1cb1lb90p821.R.iget(16003)!=0|true))||(__CLR4_4_1cb1cb1lb90p821.R.iget(16004)==0&false))) {{
            __CLR4_4_1cb1cb1lb90p821.R.inc(16005);final OrientedPoint op = (OrientedPoint) node.getCut().getHyperplane();
            __CLR4_4_1cb1cb1lb90p821.R.inc(16006);inf  = op.getLocation().getX();
            __CLR4_4_1cb1cb1lb90p821.R.inc(16007);node = (((op.isDirect() )&&(__CLR4_4_1cb1cb1lb90p821.R.iget(16008)!=0|true))||(__CLR4_4_1cb1cb1lb90p821.R.iget(16009)==0&false))? node.getMinus() : node.getPlus();
        }
        }__CLR4_4_1cb1cb1lb90p821.R.inc(16010);return (((((Boolean) node.getAttribute()) )&&(__CLR4_4_1cb1cb1lb90p821.R.iget(16011)!=0|true))||(__CLR4_4_1cb1cb1lb90p821.R.iget(16012)==0&false))? Double.NEGATIVE_INFINITY : inf;
    }finally{__CLR4_4_1cb1cb1lb90p821.R.flushNeeded();}}

    /** Get the highest value belonging to the instance.
     * @return highest value belonging to the instance
     * ({@code Double.POSITIVE_INFINITY} if the instance doesn't
     * have any high bound, {@code Double.NEGATIVE_INFINITY} if the
     * instance is empty)
     */
    public double getSup() {try{__CLR4_4_1cb1cb1lb90p821.R.inc(16013);
        __CLR4_4_1cb1cb1lb90p821.R.inc(16014);BSPTree<Euclidean1D> node = getTree(false);
        __CLR4_4_1cb1cb1lb90p821.R.inc(16015);double  sup  = Double.NEGATIVE_INFINITY;
        __CLR4_4_1cb1cb1lb90p821.R.inc(16016);while ((((node.getCut() != null)&&(__CLR4_4_1cb1cb1lb90p821.R.iget(16017)!=0|true))||(__CLR4_4_1cb1cb1lb90p821.R.iget(16018)==0&false))) {{
            __CLR4_4_1cb1cb1lb90p821.R.inc(16019);final OrientedPoint op = (OrientedPoint) node.getCut().getHyperplane();
            __CLR4_4_1cb1cb1lb90p821.R.inc(16020);sup  = op.getLocation().getX();
            __CLR4_4_1cb1cb1lb90p821.R.inc(16021);node = (((op.isDirect() )&&(__CLR4_4_1cb1cb1lb90p821.R.iget(16022)!=0|true))||(__CLR4_4_1cb1cb1lb90p821.R.iget(16023)==0&false))? node.getPlus() : node.getMinus();
        }
        }__CLR4_4_1cb1cb1lb90p821.R.inc(16024);return (((((Boolean) node.getAttribute()) )&&(__CLR4_4_1cb1cb1lb90p821.R.iget(16025)!=0|true))||(__CLR4_4_1cb1cb1lb90p821.R.iget(16026)==0&false))? Double.POSITIVE_INFINITY : sup;
    }finally{__CLR4_4_1cb1cb1lb90p821.R.flushNeeded();}}

    /** Build an ordered list of intervals representing the instance.
     * <p>This method builds this intervals set as an ordered list of
     * {@link Interval Interval} elements. If the intervals set has no
     * lower limit, the first interval will have its low bound equal to
     * {@code Double.NEGATIVE_INFINITY}. If the intervals set has
     * no upper limit, the last interval will have its upper bound equal
     * to {@code Double.POSITIVE_INFINITY}. An empty tree will
     * build an empty list while a tree representing the whole real line
     * will build a one element list with both bounds beeing
     * infinite.</p>
     * @return a new ordered list containing {@link Interval Interval}
     * elements
     */
    public List<Interval> asList() {try{__CLR4_4_1cb1cb1lb90p821.R.inc(16027);
        __CLR4_4_1cb1cb1lb90p821.R.inc(16028);final List<Interval> list = new ArrayList<Interval>();
        __CLR4_4_1cb1cb1lb90p821.R.inc(16029);recurseList(getTree(false), list,
                    Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY);
        __CLR4_4_1cb1cb1lb90p821.R.inc(16030);return list;
    }finally{__CLR4_4_1cb1cb1lb90p821.R.flushNeeded();}}

    /** Update an intervals list.
     * @param node current node
     * @param list list to update
     * @param lower lower bound of the current convex cell
     * @param upper upper bound of the current convex cell
     */
    private void recurseList(final BSPTree<Euclidean1D> node,
                             final List<Interval> list,
                             final double lower, final double upper) {try{__CLR4_4_1cb1cb1lb90p821.R.inc(16031);

        __CLR4_4_1cb1cb1lb90p821.R.inc(16032);if ((((node.getCut() == null)&&(__CLR4_4_1cb1cb1lb90p821.R.iget(16033)!=0|true))||(__CLR4_4_1cb1cb1lb90p821.R.iget(16034)==0&false))) {{
            __CLR4_4_1cb1cb1lb90p821.R.inc(16035);if (((((Boolean) node.getAttribute())&&(__CLR4_4_1cb1cb1lb90p821.R.iget(16036)!=0|true))||(__CLR4_4_1cb1cb1lb90p821.R.iget(16037)==0&false))) {{
                // this leaf cell is an inside cell: an interval
                __CLR4_4_1cb1cb1lb90p821.R.inc(16038);list.add(new Interval(lower, upper));
            }
        }} }else {{
            __CLR4_4_1cb1cb1lb90p821.R.inc(16039);final OrientedPoint op  = (OrientedPoint) node.getCut().getHyperplane();
            __CLR4_4_1cb1cb1lb90p821.R.inc(16040);final Vector1D       loc = op.getLocation();
            __CLR4_4_1cb1cb1lb90p821.R.inc(16041);double              x   = loc.getX();

            // make sure we explore the tree in increasing order
            __CLR4_4_1cb1cb1lb90p821.R.inc(16042);final BSPTree<Euclidean1D> low  =
                (((op.isDirect() )&&(__CLR4_4_1cb1cb1lb90p821.R.iget(16043)!=0|true))||(__CLR4_4_1cb1cb1lb90p821.R.iget(16044)==0&false))? node.getMinus() : node.getPlus();
            __CLR4_4_1cb1cb1lb90p821.R.inc(16045);final BSPTree<Euclidean1D> high =
                (((op.isDirect() )&&(__CLR4_4_1cb1cb1lb90p821.R.iget(16046)!=0|true))||(__CLR4_4_1cb1cb1lb90p821.R.iget(16047)==0&false))? node.getPlus()  : node.getMinus();

            __CLR4_4_1cb1cb1lb90p821.R.inc(16048);recurseList(low, list, lower, x);
            __CLR4_4_1cb1cb1lb90p821.R.inc(16049);if (((((checkPoint(low,  loc) == Location.INSIDE) &&
                (checkPoint(high, loc) == Location.INSIDE))&&(__CLR4_4_1cb1cb1lb90p821.R.iget(16050)!=0|true))||(__CLR4_4_1cb1cb1lb90p821.R.iget(16051)==0&false))) {{
                // merge the last interval added and the first one of the high sub-tree
                __CLR4_4_1cb1cb1lb90p821.R.inc(16052);x = list.remove(list.size() - 1).getInf();
            }
            }__CLR4_4_1cb1cb1lb90p821.R.inc(16053);recurseList(high, list, x, upper);

        }

    }}finally{__CLR4_4_1cb1cb1lb90p821.R.flushNeeded();}}

}
