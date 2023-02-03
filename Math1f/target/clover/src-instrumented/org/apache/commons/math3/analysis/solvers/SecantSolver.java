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
import org.apache.commons.math3.exception.NoBracketingException;
import org.apache.commons.math3.exception.TooManyEvaluationsException;

/**
 * Implements the <em>Secant</em> method for root-finding (approximating a
 * zero of a univariate real function). The solution that is maintained is
 * not bracketed, and as such convergence is not guaranteed.
 *
 * <p>Implementation based on the following article: M. Dowell and P. Jarratt,
 * <em>A modified regula falsi method for computing the root of an
 * equation</em>, BIT Numerical Mathematics, volume 11, number 2,
 * pages 168-174, Springer, 1971.</p>
 *
 * <p>Note that since release 3.0 this class implements the actual
 * <em>Secant</em> algorithm, and not a modified one. As such, the 3.0 version
 * is not backwards compatible with previous versions. To use an algorithm
 * similar to the pre-3.0 releases, use the
 * {@link IllinoisSolver <em>Illinois</em>} algorithm or the
 * {@link PegasusSolver <em>Pegasus</em>} algorithm.</p>
 *
 * @version $Id$
 */
public class SecantSolver extends AbstractUnivariateSolver {public static class __CLR4_4_14ok4oklb90p76l{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,6110,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** Default absolute accuracy. */
    protected static final double DEFAULT_ABSOLUTE_ACCURACY = 1e-6;

    /** Construct a solver with default accuracy (1e-6). */
    public SecantSolver() {
        super(DEFAULT_ABSOLUTE_ACCURACY);__CLR4_4_14ok4oklb90p76l.R.inc(6069);try{__CLR4_4_14ok4oklb90p76l.R.inc(6068);
    }finally{__CLR4_4_14ok4oklb90p76l.R.flushNeeded();}}

    /**
     * Construct a solver.
     *
     * @param absoluteAccuracy absolute accuracy
     */
    public SecantSolver(final double absoluteAccuracy) {
        super(absoluteAccuracy);__CLR4_4_14ok4oklb90p76l.R.inc(6071);try{__CLR4_4_14ok4oklb90p76l.R.inc(6070);
    }finally{__CLR4_4_14ok4oklb90p76l.R.flushNeeded();}}

    /**
     * Construct a solver.
     *
     * @param relativeAccuracy relative accuracy
     * @param absoluteAccuracy absolute accuracy
     */
    public SecantSolver(final double relativeAccuracy,
                        final double absoluteAccuracy) {
        super(relativeAccuracy, absoluteAccuracy);__CLR4_4_14ok4oklb90p76l.R.inc(6073);try{__CLR4_4_14ok4oklb90p76l.R.inc(6072);
    }finally{__CLR4_4_14ok4oklb90p76l.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    protected final double doSolve()
        throws TooManyEvaluationsException,
               NoBracketingException {try{__CLR4_4_14ok4oklb90p76l.R.inc(6074);
        // Get initial solution
        __CLR4_4_14ok4oklb90p76l.R.inc(6075);double x0 = getMin();
        __CLR4_4_14ok4oklb90p76l.R.inc(6076);double x1 = getMax();
        __CLR4_4_14ok4oklb90p76l.R.inc(6077);double f0 = computeObjectiveValue(x0);
        __CLR4_4_14ok4oklb90p76l.R.inc(6078);double f1 = computeObjectiveValue(x1);

        // If one of the bounds is the exact root, return it. Since these are
        // not under-approximations or over-approximations, we can return them
        // regardless of the allowed solutions.
        __CLR4_4_14ok4oklb90p76l.R.inc(6079);if ((((f0 == 0.0)&&(__CLR4_4_14ok4oklb90p76l.R.iget(6080)!=0|true))||(__CLR4_4_14ok4oklb90p76l.R.iget(6081)==0&false))) {{
            __CLR4_4_14ok4oklb90p76l.R.inc(6082);return x0;
        }
        }__CLR4_4_14ok4oklb90p76l.R.inc(6083);if ((((f1 == 0.0)&&(__CLR4_4_14ok4oklb90p76l.R.iget(6084)!=0|true))||(__CLR4_4_14ok4oklb90p76l.R.iget(6085)==0&false))) {{
            __CLR4_4_14ok4oklb90p76l.R.inc(6086);return x1;
        }

        // Verify bracketing of initial solution.
        }__CLR4_4_14ok4oklb90p76l.R.inc(6087);verifyBracketing(x0, x1);

        // Get accuracies.
        __CLR4_4_14ok4oklb90p76l.R.inc(6088);final double ftol = getFunctionValueAccuracy();
        __CLR4_4_14ok4oklb90p76l.R.inc(6089);final double atol = getAbsoluteAccuracy();
        __CLR4_4_14ok4oklb90p76l.R.inc(6090);final double rtol = getRelativeAccuracy();

        // Keep finding better approximations.
        __CLR4_4_14ok4oklb90p76l.R.inc(6091);while (true) {{
            // Calculate the next approximation.
            __CLR4_4_14ok4oklb90p76l.R.inc(6092);final double x = x1 - ((f1 * (x1 - x0)) / (f1 - f0));
            __CLR4_4_14ok4oklb90p76l.R.inc(6093);final double fx = computeObjectiveValue(x);

            // If the new approximation is the exact root, return it. Since
            // this is not an under-approximation or an over-approximation,
            // we can return it regardless of the allowed solutions.
            __CLR4_4_14ok4oklb90p76l.R.inc(6094);if ((((fx == 0.0)&&(__CLR4_4_14ok4oklb90p76l.R.iget(6095)!=0|true))||(__CLR4_4_14ok4oklb90p76l.R.iget(6096)==0&false))) {{
                __CLR4_4_14ok4oklb90p76l.R.inc(6097);return x;
            }

            // Update the bounds with the new approximation.
            }__CLR4_4_14ok4oklb90p76l.R.inc(6098);x0 = x1;
            __CLR4_4_14ok4oklb90p76l.R.inc(6099);f0 = f1;
            __CLR4_4_14ok4oklb90p76l.R.inc(6100);x1 = x;
            __CLR4_4_14ok4oklb90p76l.R.inc(6101);f1 = fx;

            // If the function value of the last approximation is too small,
            // given the function value accuracy, then we can't get closer to
            // the root than we already are.
            __CLR4_4_14ok4oklb90p76l.R.inc(6102);if ((((FastMath.abs(f1) <= ftol)&&(__CLR4_4_14ok4oklb90p76l.R.iget(6103)!=0|true))||(__CLR4_4_14ok4oklb90p76l.R.iget(6104)==0&false))) {{
                __CLR4_4_14ok4oklb90p76l.R.inc(6105);return x1;
            }

            // If the current interval is within the given accuracies, we
            // are satisfied with the current approximation.
            }__CLR4_4_14ok4oklb90p76l.R.inc(6106);if ((((FastMath.abs(x1 - x0) < FastMath.max(rtol * FastMath.abs(x1), atol))&&(__CLR4_4_14ok4oklb90p76l.R.iget(6107)!=0|true))||(__CLR4_4_14ok4oklb90p76l.R.iget(6108)==0&false))) {{
                __CLR4_4_14ok4oklb90p76l.R.inc(6109);return x1;
            }
        }}
    }}finally{__CLR4_4_14ok4oklb90p76l.R.flushNeeded();}}

}
