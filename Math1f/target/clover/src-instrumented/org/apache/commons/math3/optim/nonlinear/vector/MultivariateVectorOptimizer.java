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

import org.apache.commons.math3.exception.TooManyEvaluationsException;
import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.analysis.MultivariateVectorFunction;
import org.apache.commons.math3.optim.OptimizationData;
import org.apache.commons.math3.optim.BaseMultivariateOptimizer;
import org.apache.commons.math3.optim.ConvergenceChecker;
import org.apache.commons.math3.optim.PointVectorValuePair;
import org.apache.commons.math3.linear.RealMatrix;

/**
 * Base class for a multivariate vector function optimizer.
 *
 * @version $Id$
 * @since 3.1
 */
public abstract class MultivariateVectorOptimizer
    extends BaseMultivariateOptimizer<PointVectorValuePair> {public static class __CLR4_4_1upruprlb90p9u2{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,39844,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /** Target values for the model function at optimum. */
    private double[] target;
    /** Weight matrix. */
    private RealMatrix weightMatrix;
    /** Model function. */
    private MultivariateVectorFunction model;

    /**
     * @param checker Convergence checker.
     */
    protected MultivariateVectorOptimizer(ConvergenceChecker<PointVectorValuePair> checker) {
        super(checker);__CLR4_4_1upruprlb90p9u2.R.inc(39808);try{__CLR4_4_1upruprlb90p9u2.R.inc(39807);
    }finally{__CLR4_4_1upruprlb90p9u2.R.flushNeeded();}}

    /**
     * Computes the objective function value.
     * This method <em>must</em> be called by subclasses to enforce the
     * evaluation counter limit.
     *
     * @param params Point at which the objective function must be evaluated.
     * @return the objective function value at the specified point.
     * @throws TooManyEvaluationsException if the maximal number of evaluations
     * (of the model vector function) is exceeded.
     */
    protected double[] computeObjectiveValue(double[] params) {try{__CLR4_4_1upruprlb90p9u2.R.inc(39809);
        __CLR4_4_1upruprlb90p9u2.R.inc(39810);super.incrementEvaluationCount();
        __CLR4_4_1upruprlb90p9u2.R.inc(39811);return model.value(params);
    }finally{__CLR4_4_1upruprlb90p9u2.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     *
     * @param optData Optimization data. In addition to those documented in
     * {@link BaseMultivariateOptimizer#parseOptimizationData(OptimizationData[])
     * BaseMultivariateOptimizer}, this method will register the following data:
     * <ul>
     *  <li>{@link Target}</li>
     *  <li>{@link Weight}</li>
     *  <li>{@link ModelFunction}</li>
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
               DimensionMismatchException {try{__CLR4_4_1upruprlb90p9u2.R.inc(39812);
        // Set up base class and perform computation.
        __CLR4_4_1upruprlb90p9u2.R.inc(39813);return super.optimize(optData);
    }finally{__CLR4_4_1upruprlb90p9u2.R.flushNeeded();}}

    /**
     * Gets the weight matrix of the observations.
     *
     * @return the weight matrix.
     */
    public RealMatrix getWeight() {try{__CLR4_4_1upruprlb90p9u2.R.inc(39814);
        __CLR4_4_1upruprlb90p9u2.R.inc(39815);return weightMatrix.copy();
    }finally{__CLR4_4_1upruprlb90p9u2.R.flushNeeded();}}
    /**
     * Gets the observed values to be matched by the objective vector
     * function.
     *
     * @return the target values.
     */
    public double[] getTarget() {try{__CLR4_4_1upruprlb90p9u2.R.inc(39816);
        __CLR4_4_1upruprlb90p9u2.R.inc(39817);return target.clone();
    }finally{__CLR4_4_1upruprlb90p9u2.R.flushNeeded();}}

    /**
     * Gets the number of observed values.
     *
     * @return the length of the target vector.
     */
    public int getTargetSize() {try{__CLR4_4_1upruprlb90p9u2.R.inc(39818);
        __CLR4_4_1upruprlb90p9u2.R.inc(39819);return target.length;
    }finally{__CLR4_4_1upruprlb90p9u2.R.flushNeeded();}}

    /**
     * Scans the list of (required and optional) optimization data that
     * characterize the problem.
     *
     * @param optData Optimization data. The following data will be looked for:
     * <ul>
     *  <li>{@link Target}</li>
     *  <li>{@link Weight}</li>
     *  <li>{@link ModelFunction}</li>
     * </ul>
     */
    @Override
    protected void parseOptimizationData(OptimizationData... optData) {try{__CLR4_4_1upruprlb90p9u2.R.inc(39820);
        // Allow base class to register its own data.
        __CLR4_4_1upruprlb90p9u2.R.inc(39821);super.parseOptimizationData(optData);

        // The existing values (as set by the previous call) are reused if
        // not provided in the argument list.
        __CLR4_4_1upruprlb90p9u2.R.inc(39822);for (OptimizationData data : optData) {{
            __CLR4_4_1upruprlb90p9u2.R.inc(39823);if ((((data instanceof ModelFunction)&&(__CLR4_4_1upruprlb90p9u2.R.iget(39824)!=0|true))||(__CLR4_4_1upruprlb90p9u2.R.iget(39825)==0&false))) {{
                __CLR4_4_1upruprlb90p9u2.R.inc(39826);model = ((ModelFunction) data).getModelFunction();
                __CLR4_4_1upruprlb90p9u2.R.inc(39827);continue;
            }
            }__CLR4_4_1upruprlb90p9u2.R.inc(39828);if ((((data instanceof Target)&&(__CLR4_4_1upruprlb90p9u2.R.iget(39829)!=0|true))||(__CLR4_4_1upruprlb90p9u2.R.iget(39830)==0&false))) {{
                __CLR4_4_1upruprlb90p9u2.R.inc(39831);target = ((Target) data).getTarget();
                __CLR4_4_1upruprlb90p9u2.R.inc(39832);continue;
            }
            }__CLR4_4_1upruprlb90p9u2.R.inc(39833);if ((((data instanceof Weight)&&(__CLR4_4_1upruprlb90p9u2.R.iget(39834)!=0|true))||(__CLR4_4_1upruprlb90p9u2.R.iget(39835)==0&false))) {{
                __CLR4_4_1upruprlb90p9u2.R.inc(39836);weightMatrix = ((Weight) data).getWeight();
                __CLR4_4_1upruprlb90p9u2.R.inc(39837);continue;
            }
        }}

        // Check input consistency.
        }__CLR4_4_1upruprlb90p9u2.R.inc(39838);checkParameters();
    }finally{__CLR4_4_1upruprlb90p9u2.R.flushNeeded();}}

    /**
     * Check parameters consistency.
     *
     * @throws DimensionMismatchException if {@link #target} and
     * {@link #weightMatrix} have inconsistent dimensions.
     */
    private void checkParameters() {try{__CLR4_4_1upruprlb90p9u2.R.inc(39839);
        __CLR4_4_1upruprlb90p9u2.R.inc(39840);if ((((target.length != weightMatrix.getColumnDimension())&&(__CLR4_4_1upruprlb90p9u2.R.iget(39841)!=0|true))||(__CLR4_4_1upruprlb90p9u2.R.iget(39842)==0&false))) {{
            __CLR4_4_1upruprlb90p9u2.R.inc(39843);throw new DimensionMismatchException(target.length,
                                                 weightMatrix.getColumnDimension());
        }
    }}finally{__CLR4_4_1upruprlb90p9u2.R.flushNeeded();}}
}
