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
package org.apache.commons.math3.optim.univariate;

import org.apache.commons.math3.analysis.UnivariateFunction;
import org.apache.commons.math3.optim.BaseOptimizer;
import org.apache.commons.math3.optim.OptimizationData;
import org.apache.commons.math3.optim.nonlinear.scalar.GoalType;
import org.apache.commons.math3.optim.ConvergenceChecker;
import org.apache.commons.math3.exception.TooManyEvaluationsException;

/**
 * Base class for a univariate scalar function optimizer.
 *
 * @version $Id$
 * @since 3.1
 */
public abstract class UnivariateOptimizer
    extends BaseOptimizer<UnivariatePointValuePair> {public static class __CLR4_4_1vmmvmmlb90p9vz{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,41026,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /** Objective function. */
    private UnivariateFunction function;
    /** Type of optimization. */
    private GoalType goal;
    /** Initial guess. */
    private double start;
    /** Lower bound. */
    private double min;
    /** Upper bound. */
    private double max;

    /**
     * @param checker Convergence checker.
     */
    protected UnivariateOptimizer(ConvergenceChecker<UnivariatePointValuePair> checker) {
        super(checker);__CLR4_4_1vmmvmmlb90p9vz.R.inc(40991);try{__CLR4_4_1vmmvmmlb90p9vz.R.inc(40990);
    }finally{__CLR4_4_1vmmvmmlb90p9vz.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     *
     * @param optData Optimization data. In addition to those documented in
     * {@link BaseOptimizer#parseOptimizationData(OptimizationData[])
     * BaseOptimizer}, this method will register the following data:
     * <ul>
     *  <li>{@link GoalType}</li>
     *  <li>{@link SearchInterval}</li>
     *  <li>{@link UnivariateObjectiveFunction}</li>
     * </ul>
     * @return {@inheritDoc}
     * @throws TooManyEvaluationsException if the maximal number of
     * evaluations is exceeded.
     */
    @Override
    public UnivariatePointValuePair optimize(OptimizationData... optData)
        throws TooManyEvaluationsException {try{__CLR4_4_1vmmvmmlb90p9vz.R.inc(40992);
        // Perform computation.
        __CLR4_4_1vmmvmmlb90p9vz.R.inc(40993);return super.optimize(optData);
    }finally{__CLR4_4_1vmmvmmlb90p9vz.R.flushNeeded();}}

    /**
     * @return the optimization type.
     */
    public GoalType getGoalType() {try{__CLR4_4_1vmmvmmlb90p9vz.R.inc(40994);
        __CLR4_4_1vmmvmmlb90p9vz.R.inc(40995);return goal;
    }finally{__CLR4_4_1vmmvmmlb90p9vz.R.flushNeeded();}}

    /**
     * Scans the list of (required and optional) optimization data that
     * characterize the problem.
     *
     * @param optData Optimization data.
     * The following data will be looked for:
     * <ul>
     *  <li>{@link GoalType}</li>
     *  <li>{@link SearchInterval}</li>
     *  <li>{@link UnivariateObjectiveFunction}</li>
     * </ul>
     */
    @Override
    protected void parseOptimizationData(OptimizationData... optData) {try{__CLR4_4_1vmmvmmlb90p9vz.R.inc(40996);
        // Allow base class to register its own data.
        __CLR4_4_1vmmvmmlb90p9vz.R.inc(40997);super.parseOptimizationData(optData);

        // The existing values (as set by the previous call) are reused if
        // not provided in the argument list.
        __CLR4_4_1vmmvmmlb90p9vz.R.inc(40998);for (OptimizationData data : optData) {{
            __CLR4_4_1vmmvmmlb90p9vz.R.inc(40999);if ((((data instanceof SearchInterval)&&(__CLR4_4_1vmmvmmlb90p9vz.R.iget(41000)!=0|true))||(__CLR4_4_1vmmvmmlb90p9vz.R.iget(41001)==0&false))) {{
                __CLR4_4_1vmmvmmlb90p9vz.R.inc(41002);final SearchInterval interval = (SearchInterval) data;
                __CLR4_4_1vmmvmmlb90p9vz.R.inc(41003);min = interval.getMin();
                __CLR4_4_1vmmvmmlb90p9vz.R.inc(41004);max = interval.getMax();
                __CLR4_4_1vmmvmmlb90p9vz.R.inc(41005);start = interval.getStartValue();
                __CLR4_4_1vmmvmmlb90p9vz.R.inc(41006);continue;
            }
            }__CLR4_4_1vmmvmmlb90p9vz.R.inc(41007);if ((((data instanceof UnivariateObjectiveFunction)&&(__CLR4_4_1vmmvmmlb90p9vz.R.iget(41008)!=0|true))||(__CLR4_4_1vmmvmmlb90p9vz.R.iget(41009)==0&false))) {{
                __CLR4_4_1vmmvmmlb90p9vz.R.inc(41010);function = ((UnivariateObjectiveFunction) data).getObjectiveFunction();
                __CLR4_4_1vmmvmmlb90p9vz.R.inc(41011);continue;
            }
            }__CLR4_4_1vmmvmmlb90p9vz.R.inc(41012);if ((((data instanceof GoalType)&&(__CLR4_4_1vmmvmmlb90p9vz.R.iget(41013)!=0|true))||(__CLR4_4_1vmmvmmlb90p9vz.R.iget(41014)==0&false))) {{
                __CLR4_4_1vmmvmmlb90p9vz.R.inc(41015);goal = (GoalType) data;
                __CLR4_4_1vmmvmmlb90p9vz.R.inc(41016);continue;
            }
        }}
    }}finally{__CLR4_4_1vmmvmmlb90p9vz.R.flushNeeded();}}

    /**
     * @return the initial guess.
     */
    public double getStartValue() {try{__CLR4_4_1vmmvmmlb90p9vz.R.inc(41017);
        __CLR4_4_1vmmvmmlb90p9vz.R.inc(41018);return start;
    }finally{__CLR4_4_1vmmvmmlb90p9vz.R.flushNeeded();}}
    /**
     * @return the lower bounds.
     */
    public double getMin() {try{__CLR4_4_1vmmvmmlb90p9vz.R.inc(41019);
        __CLR4_4_1vmmvmmlb90p9vz.R.inc(41020);return min;
    }finally{__CLR4_4_1vmmvmmlb90p9vz.R.flushNeeded();}}
    /**
     * @return the upper bounds.
     */
    public double getMax() {try{__CLR4_4_1vmmvmmlb90p9vz.R.inc(41021);
        __CLR4_4_1vmmvmmlb90p9vz.R.inc(41022);return max;
    }finally{__CLR4_4_1vmmvmmlb90p9vz.R.flushNeeded();}}

    /**
     * Computes the objective function value.
     * This method <em>must</em> be called by subclasses to enforce the
     * evaluation counter limit.
     *
     * @param x Point at which the objective function must be evaluated.
     * @return the objective function value at the specified point.
     * @throws TooManyEvaluationsException if the maximal number of
     * evaluations is exceeded.
     */
    protected double computeObjectiveValue(double x) {try{__CLR4_4_1vmmvmmlb90p9vz.R.inc(41023);
        __CLR4_4_1vmmvmmlb90p9vz.R.inc(41024);super.incrementEvaluationCount();
        __CLR4_4_1vmmvmmlb90p9vz.R.inc(41025);return function.value(x);
    }finally{__CLR4_4_1vmmvmmlb90p9vz.R.flushNeeded();}}
}
