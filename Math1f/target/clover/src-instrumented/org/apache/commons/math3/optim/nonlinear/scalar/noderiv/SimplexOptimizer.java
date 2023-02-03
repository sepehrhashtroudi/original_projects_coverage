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
package org.apache.commons.math3.optim.nonlinear.scalar.noderiv;

import java.util.Comparator;
import org.apache.commons.math3.analysis.MultivariateFunction;
import org.apache.commons.math3.exception.NullArgumentException;
import org.apache.commons.math3.exception.MathUnsupportedOperationException;
import org.apache.commons.math3.exception.util.LocalizedFormats;
import org.apache.commons.math3.optim.nonlinear.scalar.GoalType;
import org.apache.commons.math3.optim.ConvergenceChecker;
import org.apache.commons.math3.optim.PointValuePair;
import org.apache.commons.math3.optim.SimpleValueChecker;
import org.apache.commons.math3.optim.OptimizationData;
import org.apache.commons.math3.optim.nonlinear.scalar.MultivariateOptimizer;

/**
 * This class implements simplex-based direct search optimization.
 *
 * <p>
 *  Direct search methods only use objective function values, they do
 *  not need derivatives and don't either try to compute approximation
 *  of the derivatives. According to a 1996 paper by Margaret H. Wright
 *  (<a href="http://cm.bell-labs.com/cm/cs/doc/96/4-02.ps.gz">Direct
 *  Search Methods: Once Scorned, Now Respectable</a>), they are used
 *  when either the computation of the derivative is impossible (noisy
 *  functions, unpredictable discontinuities) or difficult (complexity,
 *  computation cost). In the first cases, rather than an optimum, a
 *  <em>not too bad</em> point is desired. In the latter cases, an
 *  optimum is desired but cannot be reasonably found. In all cases
 *  direct search methods can be useful.
 * </p>
 * <p>
 *  Simplex-based direct search methods are based on comparison of
 *  the objective function values at the vertices of a simplex (which is a
 *  set of n+1 points in dimension n) that is updated by the algorithms
 *  steps.
 * <p>
 * <p>
 *  The simplex update procedure ({@link NelderMeadSimplex} or
 * {@link MultiDirectionalSimplex})  must be passed to the
 * {@code optimize} method.
 * </p>
 * <p>
 *  Each call to {@code optimize} will re-use the start configuration of
 *  the current simplex and move it such that its first vertex is at the
 *  provided start point of the optimization.
 *  If the {@code optimize} method is called to solve a different problem
 *  and the number of parameters change, the simplex must be re-initialized
 *  to one with the appropriate dimensions.
 * </p>
 * <p>
 *  Convergence is checked by providing the <em>worst</em> points of
 *  previous and current simplex to the convergence checker, not the best
 *  ones.
 * </p>
 * <p>
 *  This simplex optimizer implementation does not directly support constrained
 *  optimization with simple bounds; so, for such optimizations, either a more
 *  dedicated algorithm must be used like
 *  {@link CMAESOptimizer} or {@link BOBYQAOptimizer}, or the objective
 *  function must be wrapped in an adapter like
 *  {@link org.apache.commons.math3.optim.nonlinear.scalar.MultivariateFunctionMappingAdapter
 *  MultivariateFunctionMappingAdapter} or
 *  {@link org.apache.commons.math3.optim.nonlinear.scalar.MultivariateFunctionPenaltyAdapter
 *  MultivariateFunctionPenaltyAdapter}.
 *  <br/>
 *  The call to {@link #optimize(OptimizationData[]) optimize} will throw
 *  {@link MathUnsupportedOperationException} if bounds are passed to it.
 * </p>
 *
 * @version $Id$
 * @since 3.0
 */
public class SimplexOptimizer extends MultivariateOptimizer {public static class __CLR4_4_1umrumrlb90p9ts{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,39757,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /** Simplex update rule. */
    private AbstractSimplex simplex;

    /**
     * @param checker Convergence checker.
     */
    public SimplexOptimizer(ConvergenceChecker<PointValuePair> checker) {
        super(checker);__CLR4_4_1umrumrlb90p9ts.R.inc(39700);try{__CLR4_4_1umrumrlb90p9ts.R.inc(39699);
    }finally{__CLR4_4_1umrumrlb90p9ts.R.flushNeeded();}}

    /**
     * @param rel Relative threshold.
     * @param abs Absolute threshold.
     */
    public SimplexOptimizer(double rel, double abs) {
        this(new SimpleValueChecker(rel, abs));__CLR4_4_1umrumrlb90p9ts.R.inc(39702);try{__CLR4_4_1umrumrlb90p9ts.R.inc(39701);
    }finally{__CLR4_4_1umrumrlb90p9ts.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     *
     * @param optData Optimization data. In addition to those documented in
     * {@link MultivariateOptimizer#parseOptimizationData(OptimizationData[])
     * MultivariateOptimizer}, this method will register the following data:
     * <ul>
     *  <li>{@link AbstractSimplex}</li>
     * </ul>
     * @return {@inheritDoc}
     */
    @Override
    public PointValuePair optimize(OptimizationData... optData) {try{__CLR4_4_1umrumrlb90p9ts.R.inc(39703);
        // Set up base class and perform computation.
        __CLR4_4_1umrumrlb90p9ts.R.inc(39704);return super.optimize(optData);
    }finally{__CLR4_4_1umrumrlb90p9ts.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    protected PointValuePair doOptimize() {try{__CLR4_4_1umrumrlb90p9ts.R.inc(39705);
        __CLR4_4_1umrumrlb90p9ts.R.inc(39706);checkParameters();

        // Indirect call to "computeObjectiveValue" in order to update the
        // evaluations counter.
        __CLR4_4_1umrumrlb90p9ts.R.inc(39707);final MultivariateFunction evalFunc
            = new MultivariateFunction() {
                public double value(double[] point) {try{__CLR4_4_1umrumrlb90p9ts.R.inc(39708);
                    __CLR4_4_1umrumrlb90p9ts.R.inc(39709);return computeObjectiveValue(point);
                }finally{__CLR4_4_1umrumrlb90p9ts.R.flushNeeded();}}
            };

        __CLR4_4_1umrumrlb90p9ts.R.inc(39710);final boolean isMinim = getGoalType() == GoalType.MINIMIZE;
        __CLR4_4_1umrumrlb90p9ts.R.inc(39711);final Comparator<PointValuePair> comparator
            = new Comparator<PointValuePair>() {
            public int compare(final PointValuePair o1,
                               final PointValuePair o2) {try{__CLR4_4_1umrumrlb90p9ts.R.inc(39712);
                __CLR4_4_1umrumrlb90p9ts.R.inc(39713);final double v1 = o1.getValue();
                __CLR4_4_1umrumrlb90p9ts.R.inc(39714);final double v2 = o2.getValue();
                __CLR4_4_1umrumrlb90p9ts.R.inc(39715);return (((isMinim )&&(__CLR4_4_1umrumrlb90p9ts.R.iget(39716)!=0|true))||(__CLR4_4_1umrumrlb90p9ts.R.iget(39717)==0&false))? Double.compare(v1, v2) : Double.compare(v2, v1);
            }finally{__CLR4_4_1umrumrlb90p9ts.R.flushNeeded();}}
        };

        // Initialize search.
        __CLR4_4_1umrumrlb90p9ts.R.inc(39718);simplex.build(getStartPoint());
        __CLR4_4_1umrumrlb90p9ts.R.inc(39719);simplex.evaluate(evalFunc, comparator);

        __CLR4_4_1umrumrlb90p9ts.R.inc(39720);PointValuePair[] previous = null;
        __CLR4_4_1umrumrlb90p9ts.R.inc(39721);int iteration = 0;
        __CLR4_4_1umrumrlb90p9ts.R.inc(39722);final ConvergenceChecker<PointValuePair> checker = getConvergenceChecker();
        __CLR4_4_1umrumrlb90p9ts.R.inc(39723);while (true) {{
            __CLR4_4_1umrumrlb90p9ts.R.inc(39724);if ((((getIterations() > 0)&&(__CLR4_4_1umrumrlb90p9ts.R.iget(39725)!=0|true))||(__CLR4_4_1umrumrlb90p9ts.R.iget(39726)==0&false))) {{
                __CLR4_4_1umrumrlb90p9ts.R.inc(39727);boolean converged = true;
                __CLR4_4_1umrumrlb90p9ts.R.inc(39728);for (int i = 0; (((i < simplex.getSize())&&(__CLR4_4_1umrumrlb90p9ts.R.iget(39729)!=0|true))||(__CLR4_4_1umrumrlb90p9ts.R.iget(39730)==0&false)); i++) {{
                    __CLR4_4_1umrumrlb90p9ts.R.inc(39731);PointValuePair prev = previous[i];
                    __CLR4_4_1umrumrlb90p9ts.R.inc(39732);converged = converged &&
                        checker.converged(iteration, prev, simplex.getPoint(i));
                }
                }__CLR4_4_1umrumrlb90p9ts.R.inc(39733);if ((((converged)&&(__CLR4_4_1umrumrlb90p9ts.R.iget(39734)!=0|true))||(__CLR4_4_1umrumrlb90p9ts.R.iget(39735)==0&false))) {{
                    // We have found an optimum.
                    __CLR4_4_1umrumrlb90p9ts.R.inc(39736);return simplex.getPoint(0);
                }
            }}

            // We still need to search.
            }__CLR4_4_1umrumrlb90p9ts.R.inc(39737);previous = simplex.getPoints();
            __CLR4_4_1umrumrlb90p9ts.R.inc(39738);simplex.iterate(evalFunc, comparator);

            __CLR4_4_1umrumrlb90p9ts.R.inc(39739);incrementIterationCount();
        }
    }}finally{__CLR4_4_1umrumrlb90p9ts.R.flushNeeded();}}

    /**
     * Scans the list of (required and optional) optimization data that
     * characterize the problem.
     *
     * @param optData Optimization data.
     * The following data will be looked for:
     * <ul>
     *  <li>{@link AbstractSimplex}</li>
     * </ul>
     */
    @Override
    protected void parseOptimizationData(OptimizationData... optData) {try{__CLR4_4_1umrumrlb90p9ts.R.inc(39740);
        // Allow base class to register its own data.
        __CLR4_4_1umrumrlb90p9ts.R.inc(39741);super.parseOptimizationData(optData);

        // The existing values (as set by the previous call) are reused if
        // not provided in the argument list.
        __CLR4_4_1umrumrlb90p9ts.R.inc(39742);for (OptimizationData data : optData) {{
            __CLR4_4_1umrumrlb90p9ts.R.inc(39743);if ((((data instanceof AbstractSimplex)&&(__CLR4_4_1umrumrlb90p9ts.R.iget(39744)!=0|true))||(__CLR4_4_1umrumrlb90p9ts.R.iget(39745)==0&false))) {{
                __CLR4_4_1umrumrlb90p9ts.R.inc(39746);simplex = (AbstractSimplex) data;
                // If more data must be parsed, this statement _must_ be
                // changed to "continue".
                __CLR4_4_1umrumrlb90p9ts.R.inc(39747);break;
            }
        }}
    }}finally{__CLR4_4_1umrumrlb90p9ts.R.flushNeeded();}}

    /**
     * @throws MathUnsupportedOperationException if bounds were passed to the
     * {@link #optimize(OptimizationData[]) optimize} method.
     * @throws NullArgumentException if no initial simplex was passed to the
     * {@link #optimize(OptimizationData[]) optimize} method.
     */
    private void checkParameters() {try{__CLR4_4_1umrumrlb90p9ts.R.inc(39748);
        __CLR4_4_1umrumrlb90p9ts.R.inc(39749);if ((((simplex == null)&&(__CLR4_4_1umrumrlb90p9ts.R.iget(39750)!=0|true))||(__CLR4_4_1umrumrlb90p9ts.R.iget(39751)==0&false))) {{
            __CLR4_4_1umrumrlb90p9ts.R.inc(39752);throw new NullArgumentException();
        }
        }__CLR4_4_1umrumrlb90p9ts.R.inc(39753);if ((((getLowerBound() != null ||
            getUpperBound() != null)&&(__CLR4_4_1umrumrlb90p9ts.R.iget(39754)!=0|true))||(__CLR4_4_1umrumrlb90p9ts.R.iget(39755)==0&false))) {{
            __CLR4_4_1umrumrlb90p9ts.R.inc(39756);throw new MathUnsupportedOperationException(LocalizedFormats.CONSTRAINT);
        }
    }}finally{__CLR4_4_1umrumrlb90p9ts.R.flushNeeded();}}
}
