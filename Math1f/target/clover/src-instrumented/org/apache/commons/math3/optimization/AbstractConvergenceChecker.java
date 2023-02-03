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

package org.apache.commons.math3.optimization;

import org.apache.commons.math3.util.Precision;

/**
 * Base class for all convergence checker implementations.
 *
 * @param <PAIR> Type of (point, value) pair.
 *
 * @version $Id$
 * @deprecated As of 3.1 (to be removed in 4.0).
 * @since 3.0
 */
@Deprecated
public abstract class AbstractConvergenceChecker<PAIR>
    implements ConvergenceChecker<PAIR> {public static class __CLR4_4_1vntvntlb90p9w4{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,41043,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /**
     * Default relative threshold.
     * @deprecated in 3.1 (to be removed in 4.0) because this value is too small
     * to be useful as a default (cf. MATH-798).
     */
    @Deprecated
    private static final double DEFAULT_RELATIVE_THRESHOLD = 100 * Precision.EPSILON;
    /**
     * Default absolute threshold.
     * @deprecated in 3.1 (to be removed in 4.0) because this value is too small
     * to be useful as a default (cf. MATH-798).
     */
    @Deprecated
    private static final double DEFAULT_ABSOLUTE_THRESHOLD = 100 * Precision.SAFE_MIN;
    /**
     * Relative tolerance threshold.
     */
    private final double relativeThreshold;
    /**
     * Absolute tolerance threshold.
     */
    private final double absoluteThreshold;

    /**
     * Build an instance with default thresholds.
     * @deprecated in 3.1 (to be removed in 4.0). Convergence thresholds are
     * problem-dependent. As this class is intended for users who want to set
     * their own convergence criterion instead of relying on an algorithm's
     * default procedure, they should also set the thresholds appropriately
     * (cf. MATH-798).
     */
    @Deprecated
    public AbstractConvergenceChecker() {try{__CLR4_4_1vntvntlb90p9w4.R.inc(41033);
        __CLR4_4_1vntvntlb90p9w4.R.inc(41034);this.relativeThreshold = DEFAULT_RELATIVE_THRESHOLD;
        __CLR4_4_1vntvntlb90p9w4.R.inc(41035);this.absoluteThreshold = DEFAULT_ABSOLUTE_THRESHOLD;
    }finally{__CLR4_4_1vntvntlb90p9w4.R.flushNeeded();}}

    /**
     * Build an instance with a specified thresholds.
     *
     * @param relativeThreshold relative tolerance threshold
     * @param absoluteThreshold absolute tolerance threshold
     */
    public AbstractConvergenceChecker(final double relativeThreshold,
                                      final double absoluteThreshold) {try{__CLR4_4_1vntvntlb90p9w4.R.inc(41036);
        __CLR4_4_1vntvntlb90p9w4.R.inc(41037);this.relativeThreshold = relativeThreshold;
        __CLR4_4_1vntvntlb90p9w4.R.inc(41038);this.absoluteThreshold = absoluteThreshold;
    }finally{__CLR4_4_1vntvntlb90p9w4.R.flushNeeded();}}

    /**
     * @return the relative threshold.
     */
    public double getRelativeThreshold() {try{__CLR4_4_1vntvntlb90p9w4.R.inc(41039);
        __CLR4_4_1vntvntlb90p9w4.R.inc(41040);return relativeThreshold;
    }finally{__CLR4_4_1vntvntlb90p9w4.R.flushNeeded();}}

    /**
     * @return the absolute threshold.
     */
    public double getAbsoluteThreshold() {try{__CLR4_4_1vntvntlb90p9w4.R.inc(41041);
        __CLR4_4_1vntvntlb90p9w4.R.inc(41042);return absoluteThreshold;
    }finally{__CLR4_4_1vntvntlb90p9w4.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    public abstract boolean converged(int iteration,
                                      PAIR previous,
                                      PAIR current);
}
