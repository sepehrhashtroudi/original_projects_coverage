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
package org.apache.commons.math3.optim.nonlinear.vector;

import org.apache.commons.math3.analysis.MultivariateMatrixFunction;
import org.apache.commons.math3.optim.ConvergenceChecker;
import org.apache.commons.math3.optim.OptimizationData;
import org.apache.commons.math3.optim.PointVectorValuePair;
import org.apache.commons.math3.exception.TooManyEvaluationsException;
import org.apache.commons.math3.exception.DimensionMismatchException;

/**
 * Base class for implementing optimizers for multivariate vector
 * differentiable functions.
 * It contains boiler-plate code for dealing with Jacobian evaluation.
 * It assumes that the rows of the Jacobian matrix iterate on the model
 * functions while the columns iterate on the parameters; thus, the numbers
 * of rows is equal to the dimension of the {@link Target} while the
 * number of columns is equal to the dimension of the
 * {@link org.apache.commons.math3.optim.InitialGuess InitialGuess}.
 *
 * @version $Id$
 * @since 3.1
 * @deprecated All classes and interfaces in this package are deprecated.
 * The optimizers that were provided here were moved to the
 * {@link org.apache.commons.math3.fitting.leastsquares} package
 * (cf. MATH-1008).
 */
@Deprecated
public abstract class JacobianMultivariateVectorOptimizer
    extends MultivariateVectorOptimizer {public static class __CLR4_4_1uoduodlb90p9tv{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,39771,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /**
     * Jacobian of the model function.
     */
    private MultivariateMatrixFunction jacobian;

    /**
     * @param checker Convergence checker.
     */
    protected JacobianMultivariateVectorOptimizer(ConvergenceChecker<PointVectorValuePair> checker) {
        super(checker);__CLR4_4_1uoduodlb90p9tv.R.inc(39758);try{__CLR4_4_1uoduodlb90p9tv.R.inc(39757);
    }finally{__CLR4_4_1uoduodlb90p9tv.R.flushNeeded();}}

    /**
     * Computes the Jacobian matrix.
     *
     * @param params Point at which the Jacobian must be evaluated.
     * @return the Jacobian at the specified point.
     */
    protected double[][] computeJacobian(final double[] params) {try{__CLR4_4_1uoduodlb90p9tv.R.inc(39759);
        __CLR4_4_1uoduodlb90p9tv.R.inc(39760);return jacobian.value(params);
    }finally{__CLR4_4_1uoduodlb90p9tv.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     *
     * @param optData Optimization data. In addition to those documented in
     * {@link MultivariateVectorOptimizer#optimize(OptimizationData...)}
     * MultivariateOptimizer}, this method will register the following data:
     * <ul>
     *  <li>{@link ModelFunctionJacobian}</li>
     * </ul>
     * @return {@inheritDoc}
     * @throws TooManyEvaluationsException if the maximal number of
     * evaluations is exceeded.
     * @throws DimensionMismatchException if the initial guess, target, and weight
     * arguments have inconsistent dimensions.
     */
    @Override
    public PointVectorValuePair optimize(OptimizationData... optData)
        throws TooManyEvaluationsException,
               DimensionMismatchException {try{__CLR4_4_1uoduodlb90p9tv.R.inc(39761);
        // Set up base class and perform computation.
        __CLR4_4_1uoduodlb90p9tv.R.inc(39762);return super.optimize(optData);
    }finally{__CLR4_4_1uoduodlb90p9tv.R.flushNeeded();}}

    /**
     * Scans the list of (required and optional) optimization data that
     * characterize the problem.
     *
     * @param optData Optimization data.
     * The following data will be looked for:
     * <ul>
     *  <li>{@link ModelFunctionJacobian}</li>
     * </ul>
     */
    @Override
    protected void parseOptimizationData(OptimizationData... optData) {try{__CLR4_4_1uoduodlb90p9tv.R.inc(39763);
        // Allow base class to register its own data.
        __CLR4_4_1uoduodlb90p9tv.R.inc(39764);super.parseOptimizationData(optData);

        // The existing values (as set by the previous call) are reused if
        // not provided in the argument list.
        __CLR4_4_1uoduodlb90p9tv.R.inc(39765);for (OptimizationData data : optData) {{
            __CLR4_4_1uoduodlb90p9tv.R.inc(39766);if ((((data instanceof ModelFunctionJacobian)&&(__CLR4_4_1uoduodlb90p9tv.R.iget(39767)!=0|true))||(__CLR4_4_1uoduodlb90p9tv.R.iget(39768)==0&false))) {{
                __CLR4_4_1uoduodlb90p9tv.R.inc(39769);jacobian = ((ModelFunctionJacobian) data).getModelFunctionJacobian();
                // If more data must be parsed, this statement _must_ be
                // changed to "continue".
                __CLR4_4_1uoduodlb90p9tv.R.inc(39770);break;
            }
        }}
    }}finally{__CLR4_4_1uoduodlb90p9tv.R.flushNeeded();}}
}
