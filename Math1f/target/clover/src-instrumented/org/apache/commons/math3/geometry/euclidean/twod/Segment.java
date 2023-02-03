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

import org.apache.commons.math3.util.FastMath;

/** Simple container for a two-points segment.
 * @version $Id$
 * @since 3.0
 */
public class Segment {public static class __CLR4_4_1enjenjlb90p8dz{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,19015,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** Start point of the segment. */
    private final Vector2D start;

    /** End point of the segments. */
    private final Vector2D end;

    /** Line containing the segment. */
    private final Line     line;

    /** Build a segment.
     * @param start start point of the segment
     * @param end end point of the segment
     * @param line line containing the segment
     */
    public Segment(final Vector2D start, final Vector2D end, final Line line) {try{__CLR4_4_1enjenjlb90p8dz.R.inc(18991);
        __CLR4_4_1enjenjlb90p8dz.R.inc(18992);this.start  = start;
        __CLR4_4_1enjenjlb90p8dz.R.inc(18993);this.end    = end;
        __CLR4_4_1enjenjlb90p8dz.R.inc(18994);this.line   = line;
    }finally{__CLR4_4_1enjenjlb90p8dz.R.flushNeeded();}}

    /** Get the start point of the segment.
     * @return start point of the segment
     */
    public Vector2D getStart() {try{__CLR4_4_1enjenjlb90p8dz.R.inc(18995);
        __CLR4_4_1enjenjlb90p8dz.R.inc(18996);return start;
    }finally{__CLR4_4_1enjenjlb90p8dz.R.flushNeeded();}}

    /** Get the end point of the segment.
     * @return end point of the segment
     */
    public Vector2D getEnd() {try{__CLR4_4_1enjenjlb90p8dz.R.inc(18997);
        __CLR4_4_1enjenjlb90p8dz.R.inc(18998);return end;
    }finally{__CLR4_4_1enjenjlb90p8dz.R.flushNeeded();}}

    /** Get the line containing the segment.
     * @return line containing the segment
     */
    public Line getLine() {try{__CLR4_4_1enjenjlb90p8dz.R.inc(18999);
        __CLR4_4_1enjenjlb90p8dz.R.inc(19000);return line;
    }finally{__CLR4_4_1enjenjlb90p8dz.R.flushNeeded();}}

    /** Calculates the shortest distance from a point to this line segment.
     * <p>
     * If the perpendicular extension from the point to the line does not
     * cross in the bounds of the line segment, the shortest distance to
     * the two end points will be returned.
     * </p>
     *
     * Algorithm adapted from:
     * <a href="http://www.codeguru.com/forum/printthread.php?s=cc8cf0596231f9a7dba4da6e77c29db3&t=194400&pp=15&page=1">
     * Thread @ Codeguru</a>
     *
     * @param p to check
     * @return distance between the instance and the point
     * @since 3.1
     */
    public double distance(final Vector2D p) {try{__CLR4_4_1enjenjlb90p8dz.R.inc(19001);
        __CLR4_4_1enjenjlb90p8dz.R.inc(19002);final double deltaX = end.getX() - start.getX();
        __CLR4_4_1enjenjlb90p8dz.R.inc(19003);final double deltaY = end.getY() - start.getY();

        __CLR4_4_1enjenjlb90p8dz.R.inc(19004);final double r = ((p.getX() - start.getX()) * deltaX + (p.getY() - start.getY()) * deltaY) /
                         (deltaX * deltaX + deltaY * deltaY);

        // r == 0 => P = startPt
        // r == 1 => P = endPt
        // r < 0 => P is on the backward extension of the segment
        // r > 1 => P is on the forward extension of the segment
        // 0 < r < 1 => P is on the segment

        // if point isn't on the line segment, just return the shortest distance to the end points
        __CLR4_4_1enjenjlb90p8dz.R.inc(19005);if ((((r < 0 || r > 1)&&(__CLR4_4_1enjenjlb90p8dz.R.iget(19006)!=0|true))||(__CLR4_4_1enjenjlb90p8dz.R.iget(19007)==0&false))) {{
            __CLR4_4_1enjenjlb90p8dz.R.inc(19008);final double dist1 = getStart().distance(p);
            __CLR4_4_1enjenjlb90p8dz.R.inc(19009);final double dist2 = getEnd().distance(p);

            __CLR4_4_1enjenjlb90p8dz.R.inc(19010);return FastMath.min(dist1, dist2);
        }
        }else {{
            // find point on line and see if it is in the line segment
            __CLR4_4_1enjenjlb90p8dz.R.inc(19011);final double px = start.getX() + r * deltaX;
            __CLR4_4_1enjenjlb90p8dz.R.inc(19012);final double py = start.getY() + r * deltaY;

            __CLR4_4_1enjenjlb90p8dz.R.inc(19013);final Vector2D interPt = new Vector2D(px, py);
            __CLR4_4_1enjenjlb90p8dz.R.inc(19014);return interPt.distance(p);
        }
    }}finally{__CLR4_4_1enjenjlb90p8dz.R.flushNeeded();}}
}
