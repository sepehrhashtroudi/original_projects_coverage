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

package org.apache.commons.math3.optimization.direct;

import java.util.Comparator;

import org.apache.commons.math3.analysis.MultivariateFunction;
import org.apache.commons.math3.exception.NullArgumentException;
import org.apache.commons.math3.optimization.GoalType;
import org.apache.commons.math3.optimization.ConvergenceChecker;
import org.apache.commons.math3.optimization.PointValuePair;
import org.apache.commons.math3.optimization.SimpleValueChecker;
import org.apache.commons.math3.optimization.MultivariateOptimizer;
import org.apache.commons.math3.optimization.OptimizationData;

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
 *  The {@link #setSimplex(AbstractSimplex) setSimplex} method <em>must</em>
 *  be called prior to calling the {@code optimize} method.
 * </p>
 * <p>
 *  Each call to {@link #optimize(int,MultivariateFunction,GoalType,double[])
 *  optimize} will re-use the start configuration of the current simplex and
 *  move it such that its first vertex is at the provided start point of the
 *  optimization. If the {@code optimize} method is called to solve a different
 *  problem and the number of parameters change, the simplex must be
 *  re-initialized to one with the appropriate dimensions.
 * </p>
 * <p>
 *  Convergence is checked by providing the <em>worst</em> points of
 *  previous and current simplex to the convergence checker, not the best
 *  ones.
 * </p>
 * <p>
 * This simplex optimizer implementation does not directly support constrained
 * optimization with simple bounds, so for such optimizations, either a more
 * dedicated method must be used like {@link CMAESOptimizer} or {@link
 * BOBYQAOptimizer}, or the optimized method must be wrapped in an adapter like
 * {@link MultivariateFunctionMappingAdapter} or {@link
 * MultivariateFunctionPenaltyAdapter}.
 * </p>
 *
 * @see AbstractSimplex
 * @see MultivariateFunctionMappingAdapter
 * @see MultivariateFunctionPenaltyAdapter
 * @see CMAESOptimizer
 * @see BOBYQAOptimizer
 * @version $Id$
 * @deprecated As of 3.1 (to be removed in 4.0).
 * @since 3.0
 */
@SuppressWarnings("boxing") // deprecated anyway
@Deprecated
public class SimplexOptimizer
    extends BaseAbstractMultivariateOptimizer<MultivariateFunction>
    implements MultivariateOptimizer {public static class __CLR4_4_1ygfygflb90pa2x{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,44711,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /** Simplex. */
    private AbstractSimplex simplex;

    /**
     * Constructor using a default {@link SimpleValueChecker convergence
     * checker}.
     * @deprecated See {@link SimpleValueChecker#SimpleValueChecker()}
     */
    @Deprecated
    public SimplexOptimizer() {
        this(new SimpleValueChecker());__CLR4_4_1ygfygflb90pa2x.R.inc(44656);try{__CLR4_4_1ygfygflb90pa2x.R.inc(44655);
    }finally{__CLR4_4_1ygfygflb90pa2x.R.flushNeeded();}}

    /**
     * @param checker Convergence checker.
     */
    public SimplexOptimizer(ConvergenceChecker<PointValuePair> checker) {
        super(checker);__CLR4_4_1ygfygflb90pa2x.R.inc(44658);try{__CLR4_4_1ygfygflb90pa2x.R.inc(44657);
    }finally{__CLR4_4_1ygfygflb90pa2x.R.flushNeeded();}}

    /**
     * @param rel Relative threshold.
     * @param abs Absolute threshold.
     */
    public SimplexOptimizer(double rel, double abs) {
        this(new SimpleValueChecker(rel, abs));__CLR4_4_1ygfygflb90pa2x.R.inc(44660);try{__CLR4_4_1ygfygflb90pa2x.R.inc(44659);
    }finally{__CLR4_4_1ygfygflb90pa2x.R.flushNeeded();}}

    /**
     * Set the simplex algorithm.
     *
     * @param simplex Simplex.
     * @deprecated As of 3.1. The initial simplex can now be passed as an
     * argument of the {@link #optimize(int,MultivariateFunction,GoalType,OptimizationData[])}
     * method.
     */
    @Deprecated
    public void setSimplex(AbstractSimplex simplex) {try{__CLR4_4_1ygfygflb90pa2x.R.inc(44661);
        __CLR4_4_1ygfygflb90pa2x.R.inc(44662);parseOptimizationData(simplex);
    }finally{__CLR4_4_1ygfygflb90pa2x.R.flushNeeded();}}

    /**
     * Optimize an objective function.
     *
     * @param maxEval Allowed number of evaluations of the objective function.
     * @param f Objective function.
     * @param goalType Optimization type.
     * @param optData Optimization data. The following data will be looked for:
     * <ul>
     *  <li>{@link org.apache.commons.math3.optimization.InitialGuess InitialGuess}</li>
     *  <li>{@link AbstractSimplex}</li>
     * </ul>
     * @return the point/value pair giving the optimal value for objective
     * function.
     */
    @Override
    protected PointValuePair optimizeInternal(int maxEval, MultivariateFunction f,
                                              GoalType goalType,
                                              OptimizationData... optData) {try{__CLR4_4_1ygfygflb90pa2x.R.inc(44663);
        // Scan "optData" for the input specific to this optimizer.
        __CLR4_4_1ygfygflb90pa2x.R.inc(44664);parseOptimizationData(optData);

        // The parent's method will retrieve the common parameters from
        // "optData" and call "doOptimize".
        __CLR4_4_1ygfygflb90pa2x.R.inc(44665);return super.optimizeInternal(maxEval, f, goalType, optData);
    }finally{__CLR4_4_1ygfygflb90pa2x.R.flushNeeded();}}

    /**
     * Scans the list of (required and optional) optimization data that
     * characterize the problem.
     *
     * @param optData Optimization data. The following data will be looked for:
     * <ul>
     *  <li>{@link AbstractSimplex}</li>
     * </ul>
     */
    private void parseOptimizationData(OptimizationData... optData) {try{__CLR4_4_1ygfygflb90pa2x.R.inc(44666);
        // The existing values (as set by the previous call) are reused if
        // not provided in the argument list.
        __CLR4_4_1ygfygflb90pa2x.R.inc(44667);for (OptimizationData data : optData) {{
            __CLR4_4_1ygfygflb90pa2x.R.inc(44668);if ((((data instanceof AbstractSimplex)&&(__CLR4_4_1ygfygflb90pa2x.R.iget(44669)!=0|true))||(__CLR4_4_1ygfygflb90pa2x.R.iget(44670)==0&false))) {{
                __CLR4_4_1ygfygflb90pa2x.R.inc(44671);simplex = (AbstractSimplex) data;
                __CLR4_4_1ygfygflb90pa2x.R.inc(44672);continue;
            }
        }}
    }}finally{__CLR4_4_1ygfygflb90pa2x.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    protected PointValuePair doOptimize() {try{__CLR4_4_1ygfygflb90pa2x.R.inc(44673);
        __CLR4_4_1ygfygflb90pa2x.R.inc(44674);if ((((simplex == null)&&(__CLR4_4_1ygfygflb90pa2x.R.iget(44675)!=0|true))||(__CLR4_4_1ygfygflb90pa2x.R.iget(44676)==0&false))) {{
            __CLR4_4_1ygfygflb90pa2x.R.inc(44677);throw new NullArgumentException();
        }

        // Indirect call to "computeObjectiveValue" in order to update the
        // evaluations counter.
        }__CLR4_4_1ygfygflb90pa2x.R.inc(44678);final MultivariateFunction evalFunc
            = new MultivariateFunction() {
                public double value(double[] point) {try{__CLR4_4_1ygfygflb90pa2x.R.inc(44679);
                    __CLR4_4_1ygfygflb90pa2x.R.inc(44680);return computeObjectiveValue(point);
                }finally{__CLR4_4_1ygfygflb90pa2x.R.flushNeeded();}}
            };

        __CLR4_4_1ygfygflb90pa2x.R.inc(44681);final boolean isMinim = getGoalType() == GoalType.MINIMIZE;
        __CLR4_4_1ygfygflb90pa2x.R.inc(44682);final Comparator<PointValuePair> comparator
            = new Comparator<PointValuePair>() {
            public int compare(final PointValuePair o1,
                               final PointValuePair o2) {try{__CLR4_4_1ygfygflb90pa2x.R.inc(44683);
                __CLR4_4_1ygfygflb90pa2x.R.inc(44684);final double v1 = o1.getValue();
                __CLR4_4_1ygfygflb90pa2x.R.inc(44685);final double v2 = o2.getValue();
                __CLR4_4_1ygfygflb90pa2x.R.inc(44686);return (((isMinim )&&(__CLR4_4_1ygfygflb90pa2x.R.iget(44687)!=0|true))||(__CLR4_4_1ygfygflb90pa2x.R.iget(44688)==0&false))? Double.compare(v1, v2) : Double.compare(v2, v1);
            }finally{__CLR4_4_1ygfygflb90pa2x.R.flushNeeded();}}
        };

        // Initialize search.
        __CLR4_4_1ygfygflb90pa2x.R.inc(44689);simplex.build(getStartPoint());
        __CLR4_4_1ygfygflb90pa2x.R.inc(44690);simplex.evaluate(evalFunc, comparator);

        __CLR4_4_1ygfygflb90pa2x.R.inc(44691);PointValuePair[] previous = null;
        __CLR4_4_1ygfygflb90pa2x.R.inc(44692);int iteration = 0;
        __CLR4_4_1ygfygflb90pa2x.R.inc(44693);final ConvergenceChecker<PointValuePair> checker = getConvergenceChecker();
        __CLR4_4_1ygfygflb90pa2x.R.inc(44694);while (true) {{
            __CLR4_4_1ygfygflb90pa2x.R.inc(44695);if ((((iteration > 0)&&(__CLR4_4_1ygfygflb90pa2x.R.iget(44696)!=0|true))||(__CLR4_4_1ygfygflb90pa2x.R.iget(44697)==0&false))) {{
                __CLR4_4_1ygfygflb90pa2x.R.inc(44698);boolean converged = true;
                __CLR4_4_1ygfygflb90pa2x.R.inc(44699);for (int i = 0; (((i < simplex.getSize())&&(__CLR4_4_1ygfygflb90pa2x.R.iget(44700)!=0|true))||(__CLR4_4_1ygfygflb90pa2x.R.iget(44701)==0&false)); i++) {{
                    __CLR4_4_1ygfygflb90pa2x.R.inc(44702);PointValuePair prev = previous[i];
                    __CLR4_4_1ygfygflb90pa2x.R.inc(44703);converged = converged &&
                        checker.converged(iteration, prev, simplex.getPoint(i));
                }
                }__CLR4_4_1ygfygflb90pa2x.R.inc(44704);if ((((converged)&&(__CLR4_4_1ygfygflb90pa2x.R.iget(44705)!=0|true))||(__CLR4_4_1ygfygflb90pa2x.R.iget(44706)==0&false))) {{
                    // We have found an optimum.
                    __CLR4_4_1ygfygflb90pa2x.R.inc(44707);return simplex.getPoint(0);
                }
            }}

            // We still need to search.
            }__CLR4_4_1ygfygflb90pa2x.R.inc(44708);previous = simplex.getPoints();
            __CLR4_4_1ygfygflb90pa2x.R.inc(44709);simplex.iterate(evalFunc, comparator);
            __CLR4_4_1ygfygflb90pa2x.R.inc(44710);++iteration;
        }
    }}finally{__CLR4_4_1ygfygflb90pa2x.R.flushNeeded();}}
}
