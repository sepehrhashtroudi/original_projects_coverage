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

package org.apache.commons.math3.stat.clustering;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;

import org.apache.commons.math3.util.MathArrays;

/**
 * A simple implementation of {@link Clusterable} for points with integer coordinates.
 * @version $Id$
 * @since 2.0
 * @deprecated As of 3.2 (to be removed in 4.0),
 * use {@link org.apache.commons.math3.ml.clustering.DoublePoint} instead
 */
@Deprecated
public class EuclideanIntegerPoint implements Clusterable<EuclideanIntegerPoint>, Serializable {public static class __CLR4_4_112h812h8lb90pajz{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,49896,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** Serializable version identifier. */
    private static final long serialVersionUID = 3946024775784901369L;

    /** Point coordinates. */
    private final int[] point;

    /**
     * Build an instance wrapping an integer array.
     * <p>The wrapped array is referenced, it is <em>not</em> copied.</p>
     * @param point the n-dimensional point in integer space
     */
    public EuclideanIntegerPoint(final int[] point) {try{__CLR4_4_112h812h8lb90pajz.R.inc(49868);
        __CLR4_4_112h812h8lb90pajz.R.inc(49869);this.point = point;
    }finally{__CLR4_4_112h812h8lb90pajz.R.flushNeeded();}}

    /**
     * Get the n-dimensional point in integer space.
     * @return a reference (not a copy!) to the wrapped array
     */
    public int[] getPoint() {try{__CLR4_4_112h812h8lb90pajz.R.inc(49870);
        __CLR4_4_112h812h8lb90pajz.R.inc(49871);return point;
    }finally{__CLR4_4_112h812h8lb90pajz.R.flushNeeded();}}

    /** {@inheritDoc} */
    public double distanceFrom(final EuclideanIntegerPoint p) {try{__CLR4_4_112h812h8lb90pajz.R.inc(49872);
        __CLR4_4_112h812h8lb90pajz.R.inc(49873);return MathArrays.distance(point, p.getPoint());
    }finally{__CLR4_4_112h812h8lb90pajz.R.flushNeeded();}}

    /** {@inheritDoc} */
    public EuclideanIntegerPoint centroidOf(final Collection<EuclideanIntegerPoint> points) {try{__CLR4_4_112h812h8lb90pajz.R.inc(49874);
        __CLR4_4_112h812h8lb90pajz.R.inc(49875);int[] centroid = new int[getPoint().length];
        __CLR4_4_112h812h8lb90pajz.R.inc(49876);for (EuclideanIntegerPoint p : points) {{
            __CLR4_4_112h812h8lb90pajz.R.inc(49877);for (int i = 0; (((i < centroid.length)&&(__CLR4_4_112h812h8lb90pajz.R.iget(49878)!=0|true))||(__CLR4_4_112h812h8lb90pajz.R.iget(49879)==0&false)); i++) {{
                __CLR4_4_112h812h8lb90pajz.R.inc(49880);centroid[i] += p.getPoint()[i];
            }
        }}
        }__CLR4_4_112h812h8lb90pajz.R.inc(49881);for (int i = 0; (((i < centroid.length)&&(__CLR4_4_112h812h8lb90pajz.R.iget(49882)!=0|true))||(__CLR4_4_112h812h8lb90pajz.R.iget(49883)==0&false)); i++) {{
            __CLR4_4_112h812h8lb90pajz.R.inc(49884);centroid[i] /= points.size();
        }
        }__CLR4_4_112h812h8lb90pajz.R.inc(49885);return new EuclideanIntegerPoint(centroid);
    }finally{__CLR4_4_112h812h8lb90pajz.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public boolean equals(final Object other) {try{__CLR4_4_112h812h8lb90pajz.R.inc(49886);
        __CLR4_4_112h812h8lb90pajz.R.inc(49887);if ((((!(other instanceof EuclideanIntegerPoint))&&(__CLR4_4_112h812h8lb90pajz.R.iget(49888)!=0|true))||(__CLR4_4_112h812h8lb90pajz.R.iget(49889)==0&false))) {{
            __CLR4_4_112h812h8lb90pajz.R.inc(49890);return false;
        }
        }__CLR4_4_112h812h8lb90pajz.R.inc(49891);return Arrays.equals(point, ((EuclideanIntegerPoint) other).point);
    }finally{__CLR4_4_112h812h8lb90pajz.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public int hashCode() {try{__CLR4_4_112h812h8lb90pajz.R.inc(49892);
        __CLR4_4_112h812h8lb90pajz.R.inc(49893);return Arrays.hashCode(point);
    }finally{__CLR4_4_112h812h8lb90pajz.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     * @since 2.1
     */
    @Override
    public String toString() {try{__CLR4_4_112h812h8lb90pajz.R.inc(49894);
        __CLR4_4_112h812h8lb90pajz.R.inc(49895);return Arrays.toString(point);
    }finally{__CLR4_4_112h812h8lb90pajz.R.flushNeeded();}}

}
