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

import org.apache.commons.math3.analysis.MultivariateVectorFunction;
import org.apache.commons.math3.analysis.differentiation.GradientFunction;
import org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableFunction;
import org.apache.commons.math3.optimization.ConvergenceChecker;
import org.apache.commons.math3.optimization.GoalType;
import org.apache.commons.math3.optimization.OptimizationData;
import org.apache.commons.math3.optimization.InitialGuess;
import org.apache.commons.math3.optimization.PointValuePair;
import org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateOptimizer;

/**
 * Base class for implementing optimizers for multivariate scalar
 * differentiable functions.
 * It contains boiler-plate code for dealing with gradient evaluation.
 *
 * @version $Id$
 * @deprecated As of 3.1 (to be removed in 4.0).
 * @since 3.1
 */
@Deprecated
public abstract class AbstractDifferentiableOptimizer
    extends BaseAbstractMultivariateOptimizer<MultivariateDifferentiableFunction> {public static class __CLR4_4_1ys3ys3lb90pa3q{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,45084,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /**
     * Objective function gradient.
     */
    private MultivariateVectorFunction gradient;

    /**
     * @param checker Convergence checker.
     */
    protected AbstractDifferentiableOptimizer(ConvergenceChecker<PointValuePair> checker) {
        super(checker);__CLR4_4_1ys3ys3lb90pa3q.R.inc(45076);try{__CLR4_4_1ys3ys3lb90pa3q.R.inc(45075);
    }finally{__CLR4_4_1ys3ys3lb90pa3q.R.flushNeeded();}}

    /**
     * Compute the gradient vector.
     *
     * @param evaluationPoint Point at which the gradient must be evaluated.
     * @return the gradient at the specified point.
     */
    protected double[] computeObjectiveGradient(final double[] evaluationPoint) {try{__CLR4_4_1ys3ys3lb90pa3q.R.inc(45077);
        __CLR4_4_1ys3ys3lb90pa3q.R.inc(45078);return gradient.value(evaluationPoint);
    }finally{__CLR4_4_1ys3ys3lb90pa3q.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     *
     * @deprecated In 3.1. Please use
     * {@link #optimizeInternal(int,MultivariateDifferentiableFunction,GoalType,OptimizationData[])}
     * instead.
     */
    @Override@Deprecated
    protected PointValuePair optimizeInternal(final int maxEval,
                                              final MultivariateDifferentiableFunction f,
                                              final GoalType goalType,
                                              final double[] startPoint) {try{__CLR4_4_1ys3ys3lb90pa3q.R.inc(45079);
        __CLR4_4_1ys3ys3lb90pa3q.R.inc(45080);return optimizeInternal(maxEval, f, goalType, new InitialGuess(startPoint));
    }finally{__CLR4_4_1ys3ys3lb90pa3q.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    protected PointValuePair optimizeInternal(final int maxEval,
                                              final MultivariateDifferentiableFunction f,
                                              final GoalType goalType,
                                              final OptimizationData... optData) {try{__CLR4_4_1ys3ys3lb90pa3q.R.inc(45081);
        // Store optimization problem characteristics.
        __CLR4_4_1ys3ys3lb90pa3q.R.inc(45082);gradient = new GradientFunction(f);

        // Perform optimization.
        __CLR4_4_1ys3ys3lb90pa3q.R.inc(45083);return super.optimizeInternal(maxEval, f, goalType, optData);
    }finally{__CLR4_4_1ys3ys3lb90pa3q.R.flushNeeded();}}
}
