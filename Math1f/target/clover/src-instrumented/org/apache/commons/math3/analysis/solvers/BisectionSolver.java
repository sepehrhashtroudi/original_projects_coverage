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

import org.apache.commons.math3.util.FastMath;
import org.apache.commons.math3.exception.TooManyEvaluationsException;

/**
 * Implements the <a href="http://mathworld.wolfram.com/Bisection.html">
 * bisection algorithm</a> for finding zeros of univariate real functions.
 * <p>
 * The function should be continuous but not necessarily smooth.</p>
 *
 * @version $Id$
 */
public class BisectionSolver extends AbstractUnivariateSolver {public static class __CLR4_4_142o42olb90p733{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,5308,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /** Default absolute accuracy. */
    private static final double DEFAULT_ABSOLUTE_ACCURACY = 1e-6;

    /**
     * Construct a solver with default accuracy (1e-6).
     */
    public BisectionSolver() {
        this(DEFAULT_ABSOLUTE_ACCURACY);__CLR4_4_142o42olb90p733.R.inc(5281);try{__CLR4_4_142o42olb90p733.R.inc(5280);
    }finally{__CLR4_4_142o42olb90p733.R.flushNeeded();}}
    /**
     * Construct a solver.
     *
     * @param absoluteAccuracy Absolute accuracy.
     */
    public BisectionSolver(double absoluteAccuracy) {
        super(absoluteAccuracy);__CLR4_4_142o42olb90p733.R.inc(5283);try{__CLR4_4_142o42olb90p733.R.inc(5282);
    }finally{__CLR4_4_142o42olb90p733.R.flushNeeded();}}
    /**
     * Construct a solver.
     *
     * @param relativeAccuracy Relative accuracy.
     * @param absoluteAccuracy Absolute accuracy.
     */
    public BisectionSolver(double relativeAccuracy,
                           double absoluteAccuracy) {
        super(relativeAccuracy, absoluteAccuracy);__CLR4_4_142o42olb90p733.R.inc(5285);try{__CLR4_4_142o42olb90p733.R.inc(5284);
    }finally{__CLR4_4_142o42olb90p733.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    protected double doSolve()
        throws TooManyEvaluationsException {try{__CLR4_4_142o42olb90p733.R.inc(5286);
        __CLR4_4_142o42olb90p733.R.inc(5287);double min = getMin();
        __CLR4_4_142o42olb90p733.R.inc(5288);double max = getMax();
        __CLR4_4_142o42olb90p733.R.inc(5289);verifyInterval(min, max);
        __CLR4_4_142o42olb90p733.R.inc(5290);final double absoluteAccuracy = getAbsoluteAccuracy();
        __CLR4_4_142o42olb90p733.R.inc(5291);double m;
        __CLR4_4_142o42olb90p733.R.inc(5292);double fm;
        __CLR4_4_142o42olb90p733.R.inc(5293);double fmin;

        __CLR4_4_142o42olb90p733.R.inc(5294);while (true) {{
            __CLR4_4_142o42olb90p733.R.inc(5295);m = UnivariateSolverUtils.midpoint(min, max);
            __CLR4_4_142o42olb90p733.R.inc(5296);fmin = computeObjectiveValue(min);
            __CLR4_4_142o42olb90p733.R.inc(5297);fm = computeObjectiveValue(m);

            __CLR4_4_142o42olb90p733.R.inc(5298);if ((((fm * fmin > 0)&&(__CLR4_4_142o42olb90p733.R.iget(5299)!=0|true))||(__CLR4_4_142o42olb90p733.R.iget(5300)==0&false))) {{
                // max and m bracket the root.
                __CLR4_4_142o42olb90p733.R.inc(5301);min = m;
            } }else {{
                // min and m bracket the root.
                __CLR4_4_142o42olb90p733.R.inc(5302);max = m;
            }

            }__CLR4_4_142o42olb90p733.R.inc(5303);if ((((FastMath.abs(max - min) <= absoluteAccuracy)&&(__CLR4_4_142o42olb90p733.R.iget(5304)!=0|true))||(__CLR4_4_142o42olb90p733.R.iget(5305)==0&false))) {{
                __CLR4_4_142o42olb90p733.R.inc(5306);m = UnivariateSolverUtils.midpoint(min, max);
                __CLR4_4_142o42olb90p733.R.inc(5307);return m;
            }
        }}
    }}finally{__CLR4_4_142o42olb90p733.R.flushNeeded();}}
}
