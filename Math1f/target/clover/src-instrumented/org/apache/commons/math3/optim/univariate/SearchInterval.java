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
package org.apache.commons.math3.optim.univariate;

import org.apache.commons.math3.optim.OptimizationData;
import org.apache.commons.math3.exception.NumberIsTooLargeException;
import org.apache.commons.math3.exception.OutOfRangeException;

/**
 * Search interval and (optional) start value.
 * <br/>
 * Immutable class.
 *
 * @version $Id$
 * @since 3.1
 */
public class SearchInterval implements OptimizationData {public static class __CLR4_4_1vlevlelb90p9vr{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,40966,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /** Lower bound. */
    private final double lower;
    /** Upper bound. */
    private final double upper;
    /** Start value. */
    private final double start;

    /**
     * @param lo Lower bound.
     * @param hi Upper bound.
     * @param init Start value.
     * @throws NumberIsTooLargeException if {@code lo >= hi}.
     * @throws OutOfRangeException if {@code init < lo} or {@code init > hi}.
     */
    public SearchInterval(double lo,
                          double hi,
                          double init) {try{__CLR4_4_1vlevlelb90p9vr.R.inc(40946);
        __CLR4_4_1vlevlelb90p9vr.R.inc(40947);if ((((lo >= hi)&&(__CLR4_4_1vlevlelb90p9vr.R.iget(40948)!=0|true))||(__CLR4_4_1vlevlelb90p9vr.R.iget(40949)==0&false))) {{
            __CLR4_4_1vlevlelb90p9vr.R.inc(40950);throw new NumberIsTooLargeException(lo, hi, false);
        }
        }__CLR4_4_1vlevlelb90p9vr.R.inc(40951);if ((((init < lo ||
            init > hi)&&(__CLR4_4_1vlevlelb90p9vr.R.iget(40952)!=0|true))||(__CLR4_4_1vlevlelb90p9vr.R.iget(40953)==0&false))) {{
            __CLR4_4_1vlevlelb90p9vr.R.inc(40954);throw new OutOfRangeException(init, lo, hi);
        }

        }__CLR4_4_1vlevlelb90p9vr.R.inc(40955);lower = lo;
        __CLR4_4_1vlevlelb90p9vr.R.inc(40956);upper = hi;
        __CLR4_4_1vlevlelb90p9vr.R.inc(40957);start = init;
    }finally{__CLR4_4_1vlevlelb90p9vr.R.flushNeeded();}}

    /**
     * @param lo Lower bound.
     * @param hi Upper bound.
     * @throws NumberIsTooLargeException if {@code lo >= hi}.
     */
    public SearchInterval(double lo,
                          double hi) {
        this(lo, hi, 0.5 * (lo + hi));__CLR4_4_1vlevlelb90p9vr.R.inc(40959);try{__CLR4_4_1vlevlelb90p9vr.R.inc(40958);
    }finally{__CLR4_4_1vlevlelb90p9vr.R.flushNeeded();}}

    /**
     * Gets the lower bound.
     *
     * @return the lower bound.
     */
    public double getMin() {try{__CLR4_4_1vlevlelb90p9vr.R.inc(40960);
        __CLR4_4_1vlevlelb90p9vr.R.inc(40961);return lower;
    }finally{__CLR4_4_1vlevlelb90p9vr.R.flushNeeded();}}
    /**
     * Gets the upper bound.
     *
     * @return the upper bound.
     */
    public double getMax() {try{__CLR4_4_1vlevlelb90p9vr.R.inc(40962);
        __CLR4_4_1vlevlelb90p9vr.R.inc(40963);return upper;
    }finally{__CLR4_4_1vlevlelb90p9vr.R.flushNeeded();}}
    /**
     * Gets the start value.
     *
     * @return the start value.
     */
    public double getStartValue() {try{__CLR4_4_1vlevlelb90p9vr.R.inc(40964);
        __CLR4_4_1vlevlelb90p9vr.R.inc(40965);return start;
    }finally{__CLR4_4_1vlevlelb90p9vr.R.flushNeeded();}}
}
