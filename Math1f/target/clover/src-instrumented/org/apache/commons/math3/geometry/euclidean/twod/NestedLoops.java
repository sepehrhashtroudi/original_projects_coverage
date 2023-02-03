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
import java.util.Iterator;

import org.apache.commons.math3.exception.MathIllegalArgumentException;
import org.apache.commons.math3.exception.util.LocalizedFormats;
import org.apache.commons.math3.geometry.euclidean.oned.IntervalsSet;
import org.apache.commons.math3.geometry.partitioning.Region;
import org.apache.commons.math3.geometry.partitioning.RegionFactory;
import org.apache.commons.math3.geometry.partitioning.SubHyperplane;

/** This class represent a tree of nested 2D boundary loops.

 * <p>This class is used for piecewise polygons construction.
 * Polygons are built using the outline edges as
 * representative of boundaries, the orientation of these lines are
 * meaningful. However, we want to allow the user to specify its
 * outline loops without having to take care of this orientation. This
 * class is devoted to correct mis-oriented loops.<p>

 * <p>Orientation is computed assuming the piecewise polygon is finite,
 * i.e. the outermost loops have their exterior side facing points at
 * infinity, and hence are oriented counter-clockwise. The orientation of
 * internal loops is computed as the reverse of the orientation of
 * their immediate surrounding loop.</p>

 * @version $Id$
 * @since 3.0
 */
class NestedLoops {public static class __CLR4_4_1eb2eb2lb90p8d4{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,18610,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** Boundary loop. */
    private Vector2D[] loop;

    /** Surrounded loops. */
    private ArrayList<NestedLoops> surrounded;

    /** Polygon enclosing a finite region. */
    private Region<Euclidean2D> polygon;

    /** Indicator for original loop orientation. */
    private boolean originalIsClockwise;

    /** Simple Constructor.
     * <p>Build an empty tree of nested loops. This instance will become
     * the root node of a complete tree, it is not associated with any
     * loop by itself, the outermost loops are in the root tree child
     * nodes.</p>
     */
    public NestedLoops() {try{__CLR4_4_1eb2eb2lb90p8d4.R.inc(18542);
        __CLR4_4_1eb2eb2lb90p8d4.R.inc(18543);surrounded = new ArrayList<NestedLoops>();
    }finally{__CLR4_4_1eb2eb2lb90p8d4.R.flushNeeded();}}

    /** Constructor.
     * <p>Build a tree node with neither parent nor children</p>
     * @param loop boundary loop (will be reversed in place if needed)
     * @exception MathIllegalArgumentException if an outline has an open boundary loop
     */
    private NestedLoops(final Vector2D[] loop) throws MathIllegalArgumentException {try{__CLR4_4_1eb2eb2lb90p8d4.R.inc(18544);

        __CLR4_4_1eb2eb2lb90p8d4.R.inc(18545);if ((((loop[0] == null)&&(__CLR4_4_1eb2eb2lb90p8d4.R.iget(18546)!=0|true))||(__CLR4_4_1eb2eb2lb90p8d4.R.iget(18547)==0&false))) {{
            __CLR4_4_1eb2eb2lb90p8d4.R.inc(18548);throw new MathIllegalArgumentException(LocalizedFormats.OUTLINE_BOUNDARY_LOOP_OPEN);
        }

        }__CLR4_4_1eb2eb2lb90p8d4.R.inc(18549);this.loop = loop;
        __CLR4_4_1eb2eb2lb90p8d4.R.inc(18550);surrounded = new ArrayList<NestedLoops>();

        // build the polygon defined by the loop
        __CLR4_4_1eb2eb2lb90p8d4.R.inc(18551);final ArrayList<SubHyperplane<Euclidean2D>> edges = new ArrayList<SubHyperplane<Euclidean2D>>();
        __CLR4_4_1eb2eb2lb90p8d4.R.inc(18552);Vector2D current = loop[loop.length - 1];
        __CLR4_4_1eb2eb2lb90p8d4.R.inc(18553);for (int i = 0; (((i < loop.length)&&(__CLR4_4_1eb2eb2lb90p8d4.R.iget(18554)!=0|true))||(__CLR4_4_1eb2eb2lb90p8d4.R.iget(18555)==0&false)); ++i) {{
            __CLR4_4_1eb2eb2lb90p8d4.R.inc(18556);final Vector2D previous = current;
            __CLR4_4_1eb2eb2lb90p8d4.R.inc(18557);current = loop[i];
            __CLR4_4_1eb2eb2lb90p8d4.R.inc(18558);final Line   line   = new Line(previous, current);
            __CLR4_4_1eb2eb2lb90p8d4.R.inc(18559);final IntervalsSet region =
                new IntervalsSet(line.toSubSpace(previous).getX(), line.toSubSpace(current).getX());
            __CLR4_4_1eb2eb2lb90p8d4.R.inc(18560);edges.add(new SubLine(line, region));
        }
        }__CLR4_4_1eb2eb2lb90p8d4.R.inc(18561);polygon = new PolygonsSet(edges);

        // ensure the polygon encloses a finite region of the plane
        __CLR4_4_1eb2eb2lb90p8d4.R.inc(18562);if ((((Double.isInfinite(polygon.getSize()))&&(__CLR4_4_1eb2eb2lb90p8d4.R.iget(18563)!=0|true))||(__CLR4_4_1eb2eb2lb90p8d4.R.iget(18564)==0&false))) {{
            __CLR4_4_1eb2eb2lb90p8d4.R.inc(18565);polygon = new RegionFactory<Euclidean2D>().getComplement(polygon);
            __CLR4_4_1eb2eb2lb90p8d4.R.inc(18566);originalIsClockwise = false;
        } }else {{
            __CLR4_4_1eb2eb2lb90p8d4.R.inc(18567);originalIsClockwise = true;
        }

    }}finally{__CLR4_4_1eb2eb2lb90p8d4.R.flushNeeded();}}

    /** Add a loop in a tree.
     * @param bLoop boundary loop (will be reversed in place if needed)
     * @exception MathIllegalArgumentException if an outline has crossing
     * boundary loops or open boundary loops
     */
    public void add(final Vector2D[] bLoop) throws MathIllegalArgumentException {try{__CLR4_4_1eb2eb2lb90p8d4.R.inc(18568);
        __CLR4_4_1eb2eb2lb90p8d4.R.inc(18569);add(new NestedLoops(bLoop));
    }finally{__CLR4_4_1eb2eb2lb90p8d4.R.flushNeeded();}}

    /** Add a loop in a tree.
     * @param node boundary loop (will be reversed in place if needed)
     * @exception MathIllegalArgumentException if an outline has boundary
     * loops that cross each other
     */
    private void add(final NestedLoops node) throws MathIllegalArgumentException {try{__CLR4_4_1eb2eb2lb90p8d4.R.inc(18570);

        // check if we can go deeper in the tree
        __CLR4_4_1eb2eb2lb90p8d4.R.inc(18571);for (final NestedLoops child : surrounded) {{
            __CLR4_4_1eb2eb2lb90p8d4.R.inc(18572);if ((((child.polygon.contains(node.polygon))&&(__CLR4_4_1eb2eb2lb90p8d4.R.iget(18573)!=0|true))||(__CLR4_4_1eb2eb2lb90p8d4.R.iget(18574)==0&false))) {{
                __CLR4_4_1eb2eb2lb90p8d4.R.inc(18575);child.add(node);
                __CLR4_4_1eb2eb2lb90p8d4.R.inc(18576);return;
            }
        }}

        // check if we can absorb some of the instance children
        }__CLR4_4_1eb2eb2lb90p8d4.R.inc(18577);for (final Iterator<NestedLoops> iterator = surrounded.iterator(); (((iterator.hasNext())&&(__CLR4_4_1eb2eb2lb90p8d4.R.iget(18578)!=0|true))||(__CLR4_4_1eb2eb2lb90p8d4.R.iget(18579)==0&false));) {{
            __CLR4_4_1eb2eb2lb90p8d4.R.inc(18580);final NestedLoops child = iterator.next();
            __CLR4_4_1eb2eb2lb90p8d4.R.inc(18581);if ((((node.polygon.contains(child.polygon))&&(__CLR4_4_1eb2eb2lb90p8d4.R.iget(18582)!=0|true))||(__CLR4_4_1eb2eb2lb90p8d4.R.iget(18583)==0&false))) {{
                __CLR4_4_1eb2eb2lb90p8d4.R.inc(18584);node.surrounded.add(child);
                __CLR4_4_1eb2eb2lb90p8d4.R.inc(18585);iterator.remove();
            }
        }}

        // we should be separate from the remaining children
        }__CLR4_4_1eb2eb2lb90p8d4.R.inc(18586);RegionFactory<Euclidean2D> factory = new RegionFactory<Euclidean2D>();
        __CLR4_4_1eb2eb2lb90p8d4.R.inc(18587);for (final NestedLoops child : surrounded) {{
            __CLR4_4_1eb2eb2lb90p8d4.R.inc(18588);if ((((!factory.intersection(node.polygon, child.polygon).isEmpty())&&(__CLR4_4_1eb2eb2lb90p8d4.R.iget(18589)!=0|true))||(__CLR4_4_1eb2eb2lb90p8d4.R.iget(18590)==0&false))) {{
                __CLR4_4_1eb2eb2lb90p8d4.R.inc(18591);throw new MathIllegalArgumentException(LocalizedFormats.CROSSING_BOUNDARY_LOOPS);
            }
        }}

        }__CLR4_4_1eb2eb2lb90p8d4.R.inc(18592);surrounded.add(node);

    }finally{__CLR4_4_1eb2eb2lb90p8d4.R.flushNeeded();}}

    /** Correct the orientation of the loops contained in the tree.
     * <p>This is this method that really inverts the loops that where
     * provided through the {@link #add(Vector2D[]) add} method if
     * they are mis-oriented</p>
     */
    public void correctOrientation() {try{__CLR4_4_1eb2eb2lb90p8d4.R.inc(18593);
        __CLR4_4_1eb2eb2lb90p8d4.R.inc(18594);for (NestedLoops child : surrounded) {{
            __CLR4_4_1eb2eb2lb90p8d4.R.inc(18595);child.setClockWise(true);
        }
    }}finally{__CLR4_4_1eb2eb2lb90p8d4.R.flushNeeded();}}

    /** Set the loop orientation.
     * @param clockwise if true, the loop should be set to clockwise
     * orientation
     */
    private void setClockWise(final boolean clockwise) {try{__CLR4_4_1eb2eb2lb90p8d4.R.inc(18596);

        __CLR4_4_1eb2eb2lb90p8d4.R.inc(18597);if ((((originalIsClockwise ^ clockwise)&&(__CLR4_4_1eb2eb2lb90p8d4.R.iget(18598)!=0|true))||(__CLR4_4_1eb2eb2lb90p8d4.R.iget(18599)==0&false))) {{
            // we need to inverse the original loop
            __CLR4_4_1eb2eb2lb90p8d4.R.inc(18600);int min = -1;
            __CLR4_4_1eb2eb2lb90p8d4.R.inc(18601);int max = loop.length;
            __CLR4_4_1eb2eb2lb90p8d4.R.inc(18602);while ((((++min < --max)&&(__CLR4_4_1eb2eb2lb90p8d4.R.iget(18603)!=0|true))||(__CLR4_4_1eb2eb2lb90p8d4.R.iget(18604)==0&false))) {{
                __CLR4_4_1eb2eb2lb90p8d4.R.inc(18605);final Vector2D tmp = loop[min];
                __CLR4_4_1eb2eb2lb90p8d4.R.inc(18606);loop[min] = loop[max];
                __CLR4_4_1eb2eb2lb90p8d4.R.inc(18607);loop[max] = tmp;
            }
        }}

        // go deeper in the tree
        }__CLR4_4_1eb2eb2lb90p8d4.R.inc(18608);for (final NestedLoops child : surrounded) {{
            __CLR4_4_1eb2eb2lb90p8d4.R.inc(18609);child.setClockWise(!clockwise);
        }

    }}finally{__CLR4_4_1eb2eb2lb90p8d4.R.flushNeeded();}}

}
