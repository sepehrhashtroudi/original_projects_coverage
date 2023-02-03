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

import org.apache.commons.math3.analysis.DifferentiableUnivariateFunction;
import org.apache.commons.math3.util.FastMath;
import org.apache.commons.math3.exception.TooManyEvaluationsException;

/**
 * Implements <a href="http://mathworld.wolfram.com/NewtonsMethod.html">
 * Newton's Method</a> for finding zeros of real univariate functions.
 * <p>
 * The function should be continuous but not necessarily smooth.</p>
 *
 * @deprecated as of 3.1, replaced by {@link NewtonRaphsonSolver}
 * @version $Id$
 */
@Deprecated
public class NewtonSolver extends AbstractDifferentiableUnivariateSolver {public static class __CLR4_4_14lq4lqlb90p75x{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,5984,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /** Default absolute accuracy. */
    private static final double DEFAULT_ABSOLUTE_ACCURACY = 1e-6;

    /**
     * Construct a solver.
     */
    public NewtonSolver() {
        this(DEFAULT_ABSOLUTE_ACCURACY);__CLR4_4_14lq4lqlb90p75x.R.inc(5967);try{__CLR4_4_14lq4lqlb90p75x.R.inc(5966);
    }finally{__CLR4_4_14lq4lqlb90p75x.R.flushNeeded();}}
    /**
     * Construct a solver.
     *
     * @param absoluteAccuracy Absolute accuracy.
     */
    public NewtonSolver(double absoluteAccuracy) {
        super(absoluteAccuracy);__CLR4_4_14lq4lqlb90p75x.R.inc(5969);try{__CLR4_4_14lq4lqlb90p75x.R.inc(5968);
    }finally{__CLR4_4_14lq4lqlb90p75x.R.flushNeeded();}}

    /**
     * Find a zero near the midpoint of {@code min} and {@code max}.
     *
     * @param f Function to solve.
     * @param min Lower bound for the interval.
     * @param max Upper bound for the interval.
     * @param maxEval Maximum number of evaluations.
     * @return the value where the function is zero.
     * @throws org.apache.commons.math3.exception.TooManyEvaluationsException
     * if the maximum evaluation count is exceeded.
     * @throws org.apache.commons.math3.exception.NumberIsTooLargeException
     * if {@code min >= max}.
     */
    @Override
    public double solve(int maxEval, final DifferentiableUnivariateFunction f,
                        final double min, final double max)
        throws TooManyEvaluationsException {try{__CLR4_4_14lq4lqlb90p75x.R.inc(5970);
        __CLR4_4_14lq4lqlb90p75x.R.inc(5971);return super.solve(maxEval, f, UnivariateSolverUtils.midpoint(min, max));
    }finally{__CLR4_4_14lq4lqlb90p75x.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    protected double doSolve()
        throws TooManyEvaluationsException {try{__CLR4_4_14lq4lqlb90p75x.R.inc(5972);
        __CLR4_4_14lq4lqlb90p75x.R.inc(5973);final double startValue = getStartValue();
        __CLR4_4_14lq4lqlb90p75x.R.inc(5974);final double absoluteAccuracy = getAbsoluteAccuracy();

        __CLR4_4_14lq4lqlb90p75x.R.inc(5975);double x0 = startValue;
        __CLR4_4_14lq4lqlb90p75x.R.inc(5976);double x1;
        __CLR4_4_14lq4lqlb90p75x.R.inc(5977);while (true) {{
            __CLR4_4_14lq4lqlb90p75x.R.inc(5978);x1 = x0 - (computeObjectiveValue(x0) / computeDerivativeObjectiveValue(x0));
            __CLR4_4_14lq4lqlb90p75x.R.inc(5979);if ((((FastMath.abs(x1 - x0) <= absoluteAccuracy)&&(__CLR4_4_14lq4lqlb90p75x.R.iget(5980)!=0|true))||(__CLR4_4_14lq4lqlb90p75x.R.iget(5981)==0&false))) {{
                __CLR4_4_14lq4lqlb90p75x.R.inc(5982);return x1;
            }

            }__CLR4_4_14lq4lqlb90p75x.R.inc(5983);x0 = x1;
        }
    }}finally{__CLR4_4_14lq4lqlb90p75x.R.flushNeeded();}}
}
