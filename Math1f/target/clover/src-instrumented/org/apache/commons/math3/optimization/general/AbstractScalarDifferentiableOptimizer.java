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

package org.apache.commons.math3.optimization.general;

import org.apache.commons.math3.analysis.DifferentiableMultivariateFunction;
import org.apache.commons.math3.analysis.MultivariateVectorFunction;
import org.apache.commons.math3.analysis.FunctionUtils;
import org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableFunction;
import org.apache.commons.math3.optimization.DifferentiableMultivariateOptimizer;
import org.apache.commons.math3.optimization.GoalType;
import org.apache.commons.math3.optimization.ConvergenceChecker;
import org.apache.commons.math3.optimization.PointValuePair;
import org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateOptimizer;

/**
 * Base class for implementing optimizers for multivariate scalar
 * differentiable functions.
 * It contains boiler-plate code for dealing with gradient evaluation.
 *
 * @version $Id$
 * @deprecated As of 3.1 (to be removed in 4.0).
 * @since 2.0
 */
@Deprecated
public abstract class AbstractScalarDifferentiableOptimizer
    extends BaseAbstractMultivariateOptimizer<DifferentiableMultivariateFunction>
    implements DifferentiableMultivariateOptimizer {public static class __CLR4_4_1yvpyvplb90pa48{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,45215,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /**
     * Objective function gradient.
     */
    private MultivariateVectorFunction gradient;

    /**
     * Simple constructor with default settings.
     * The convergence check is set to a
     * {@link org.apache.commons.math3.optimization.SimpleValueChecker
     * SimpleValueChecker}.
     * @deprecated See {@link org.apache.commons.math3.optimization.SimpleValueChecker#SimpleValueChecker()}
     */
    @Deprecated
    protected AbstractScalarDifferentiableOptimizer() {try{__CLR4_4_1yvpyvplb90pa48.R.inc(45205);}finally{__CLR4_4_1yvpyvplb90pa48.R.flushNeeded();}}

    /**
     * @param checker Convergence checker.
     */
    protected AbstractScalarDifferentiableOptimizer(ConvergenceChecker<PointValuePair> checker) {
        super(checker);__CLR4_4_1yvpyvplb90pa48.R.inc(45207);try{__CLR4_4_1yvpyvplb90pa48.R.inc(45206);
    }finally{__CLR4_4_1yvpyvplb90pa48.R.flushNeeded();}}

    /**
     * Compute the gradient vector.
     *
     * @param evaluationPoint Point at which the gradient must be evaluated.
     * @return the gradient at the specified point.
     * @throws org.apache.commons.math3.exception.TooManyEvaluationsException
     * if the allowed number of evaluations is exceeded.
     */
    protected double[] computeObjectiveGradient(final double[] evaluationPoint) {try{__CLR4_4_1yvpyvplb90pa48.R.inc(45208);
        __CLR4_4_1yvpyvplb90pa48.R.inc(45209);return gradient.value(evaluationPoint);
    }finally{__CLR4_4_1yvpyvplb90pa48.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    protected PointValuePair optimizeInternal(int maxEval,
                                              final DifferentiableMultivariateFunction f,
                                              final GoalType goalType,
                                              final double[] startPoint) {try{__CLR4_4_1yvpyvplb90pa48.R.inc(45210);
        // Store optimization problem characteristics.
        __CLR4_4_1yvpyvplb90pa48.R.inc(45211);gradient = f.gradient();

        __CLR4_4_1yvpyvplb90pa48.R.inc(45212);return super.optimizeInternal(maxEval, f, goalType, startPoint);
    }finally{__CLR4_4_1yvpyvplb90pa48.R.flushNeeded();}}

    /**
     * Optimize an objective function.
     *
     * @param f Objective function.
     * @param goalType Type of optimization goal: either
     * {@link GoalType#MAXIMIZE} or {@link GoalType#MINIMIZE}.
     * @param startPoint Start point for optimization.
     * @param maxEval Maximum number of function evaluations.
     * @return the point/value pair giving the optimal value for objective
     * function.
     * @throws org.apache.commons.math3.exception.DimensionMismatchException
     * if the start point dimension is wrong.
     * @throws org.apache.commons.math3.exception.TooManyEvaluationsException
     * if the maximal number of evaluations is exceeded.
     * @throws org.apache.commons.math3.exception.NullArgumentException if
     * any argument is {@code null}.
     */
    public PointValuePair optimize(final int maxEval,
                                   final MultivariateDifferentiableFunction f,
                                   final GoalType goalType,
                                   final double[] startPoint) {try{__CLR4_4_1yvpyvplb90pa48.R.inc(45213);
        __CLR4_4_1yvpyvplb90pa48.R.inc(45214);return optimizeInternal(maxEval,
                                FunctionUtils.toDifferentiableMultivariateFunction(f),
                                goalType,
                                startPoint);
    }finally{__CLR4_4_1yvpyvplb90pa48.R.flushNeeded();}}
}
