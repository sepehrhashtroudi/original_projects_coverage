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

package org.apache.commons.math3.ml.clustering;

import java.io.Serializable;
import java.util.Arrays;

/**
 * A simple implementation of {@link Clusterable} for points with double coordinates.
 * @version $Id$
 * @since 3.2
 */
public class DoublePoint implements Clusterable, Serializable {public static class __CLR4_4_1o6zo6zlb90p97j{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,31375,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** Serializable version identifier. */
    private static final long serialVersionUID = 3946024775784901369L;

    /** Point coordinates. */
    private final double[] point;

    /**
     * Build an instance wrapping an double array.
     * <p>
     * The wrapped array is referenced, it is <em>not</em> copied.
     *
     * @param point the n-dimensional point in double space
     */
    public DoublePoint(final double[] point) {try{__CLR4_4_1o6zo6zlb90p97j.R.inc(31355);
        __CLR4_4_1o6zo6zlb90p97j.R.inc(31356);this.point = point;
    }finally{__CLR4_4_1o6zo6zlb90p97j.R.flushNeeded();}}

    /**
     * Build an instance wrapping an integer array.
     * <p>
     * The wrapped array is copied to an internal double array.
     *
     * @param point the n-dimensional point in integer space
     */
    public DoublePoint(final int[] point) {try{__CLR4_4_1o6zo6zlb90p97j.R.inc(31357);
        __CLR4_4_1o6zo6zlb90p97j.R.inc(31358);this.point = new double[point.length];
        __CLR4_4_1o6zo6zlb90p97j.R.inc(31359);for ( int i = 0; (((i < point.length)&&(__CLR4_4_1o6zo6zlb90p97j.R.iget(31360)!=0|true))||(__CLR4_4_1o6zo6zlb90p97j.R.iget(31361)==0&false)); i++) {{
            __CLR4_4_1o6zo6zlb90p97j.R.inc(31362);this.point[i] = point[i];
        }
    }}finally{__CLR4_4_1o6zo6zlb90p97j.R.flushNeeded();}}

    /** {@inheritDoc} */
    public double[] getPoint() {try{__CLR4_4_1o6zo6zlb90p97j.R.inc(31363);
        __CLR4_4_1o6zo6zlb90p97j.R.inc(31364);return point;
    }finally{__CLR4_4_1o6zo6zlb90p97j.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public boolean equals(final Object other) {try{__CLR4_4_1o6zo6zlb90p97j.R.inc(31365);
        __CLR4_4_1o6zo6zlb90p97j.R.inc(31366);if ((((!(other instanceof DoublePoint))&&(__CLR4_4_1o6zo6zlb90p97j.R.iget(31367)!=0|true))||(__CLR4_4_1o6zo6zlb90p97j.R.iget(31368)==0&false))) {{
            __CLR4_4_1o6zo6zlb90p97j.R.inc(31369);return false;
        }
        }__CLR4_4_1o6zo6zlb90p97j.R.inc(31370);return Arrays.equals(point, ((DoublePoint) other).point);
    }finally{__CLR4_4_1o6zo6zlb90p97j.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public int hashCode() {try{__CLR4_4_1o6zo6zlb90p97j.R.inc(31371);
        __CLR4_4_1o6zo6zlb90p97j.R.inc(31372);return Arrays.hashCode(point);
    }finally{__CLR4_4_1o6zo6zlb90p97j.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public String toString() {try{__CLR4_4_1o6zo6zlb90p97j.R.inc(31373);
        __CLR4_4_1o6zo6zlb90p97j.R.inc(31374);return Arrays.toString(point);
    }finally{__CLR4_4_1o6zo6zlb90p97j.R.flushNeeded();}}

}
