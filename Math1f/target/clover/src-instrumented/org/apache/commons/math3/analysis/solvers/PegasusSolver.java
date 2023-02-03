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

package org.apache.commons.math3.analysis.solvers;

/**
 * Implements the <em>Pegasus</em> method for root-finding (approximating
 * a zero of a univariate real function). It is a modified
 * {@link RegulaFalsiSolver <em>Regula Falsi</em>} method.
 *
 * <p>Like the <em>Regula Falsi</em> method, convergence is guaranteed by
 * maintaining a bracketed solution. The <em>Pegasus</em> method however,
 * should converge much faster than the original <em>Regula Falsi</em>
 * method. Furthermore, this implementation of the <em>Pegasus</em> method
 * should not suffer from the same implementation issues as the <em>Regula
 * Falsi</em> method, which may fail to convergence in certain cases. Also,
 * the <em>Pegasus</em> method should converge faster than the
 * {@link IllinoisSolver <em>Illinois</em>} method, another <em>Regula
 * Falsi</em>-based method.</p>
 *
 * <p>The <em>Pegasus</em> method assumes that the function is continuous,
 * but not necessarily smooth.</p>
 *
 * <p>Implementation based on the following article: M. Dowell and P. Jarratt,
 * <em>The "Pegasus" method for computing the root of an equation</em>,
 * BIT Numerical Mathematics, volume 12, number 4, pages 503-508, Springer,
 * 1972.</p>
 *
 * @since 3.0
 * @version $Id$
 */
public class PegasusSolver extends BaseSecantSolver {public static class __CLR4_4_14m84m8lb90p761{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,5992,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** Construct a solver with default accuracy (1e-6). */
    public PegasusSolver() {
        super(DEFAULT_ABSOLUTE_ACCURACY, Method.PEGASUS);__CLR4_4_14m84m8lb90p761.R.inc(5985);try{__CLR4_4_14m84m8lb90p761.R.inc(5984);
    }finally{__CLR4_4_14m84m8lb90p761.R.flushNeeded();}}

    /**
     * Construct a solver.
     *
     * @param absoluteAccuracy Absolute accuracy.
     */
    public PegasusSolver(final double absoluteAccuracy) {
        super(absoluteAccuracy, Method.PEGASUS);__CLR4_4_14m84m8lb90p761.R.inc(5987);try{__CLR4_4_14m84m8lb90p761.R.inc(5986);
    }finally{__CLR4_4_14m84m8lb90p761.R.flushNeeded();}}

    /**
     * Construct a solver.
     *
     * @param relativeAccuracy Relative accuracy.
     * @param absoluteAccuracy Absolute accuracy.
     */
    public PegasusSolver(final double relativeAccuracy,
                         final double absoluteAccuracy) {
        super(relativeAccuracy, absoluteAccuracy, Method.PEGASUS);__CLR4_4_14m84m8lb90p761.R.inc(5989);try{__CLR4_4_14m84m8lb90p761.R.inc(5988);
    }finally{__CLR4_4_14m84m8lb90p761.R.flushNeeded();}}

    /**
     * Construct a solver.
     *
     * @param relativeAccuracy Relative accuracy.
     * @param absoluteAccuracy Absolute accuracy.
     * @param functionValueAccuracy Maximum function value error.
     */
    public PegasusSolver(final double relativeAccuracy,
                         final double absoluteAccuracy,
                         final double functionValueAccuracy) {
        super(relativeAccuracy, absoluteAccuracy, functionValueAccuracy, Method.PEGASUS);__CLR4_4_14m84m8lb90p761.R.inc(5991);try{__CLR4_4_14m84m8lb90p761.R.inc(5990);
    }finally{__CLR4_4_14m84m8lb90p761.R.flushNeeded();}}
}
