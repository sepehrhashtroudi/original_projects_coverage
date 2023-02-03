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

package org.apache.commons.math3.optimization.linear;

import java.util.Collection;
import java.util.Collections;

import org.apache.commons.math3.exception.MathIllegalStateException;
import org.apache.commons.math3.exception.MaxCountExceededException;
import org.apache.commons.math3.optimization.GoalType;
import org.apache.commons.math3.optimization.PointValuePair;

/**
 * Base class for implementing linear optimizers.
 * <p>
 * This base class handles the boilerplate methods associated to thresholds
 * settings and iterations counters.
 *
 * @version $Id$
 * @deprecated As of 3.1 (to be removed in 4.0).
 * @since 2.0
 */
@Deprecated
public abstract class AbstractLinearOptimizer implements LinearOptimizer {public static class __CLR4_4_1zgvzgvlb90pa5w{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,45995,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** Default maximal number of iterations allowed. */
    public static final int DEFAULT_MAX_ITERATIONS = 100;

    /**
     * Linear objective function.
     * @since 2.1
     */
    private LinearObjectiveFunction function;

    /**
     * Linear constraints.
     * @since 2.1
     */
    private Collection<LinearConstraint> linearConstraints;

    /**
     * Type of optimization goal: either {@link GoalType#MAXIMIZE} or {@link GoalType#MINIMIZE}.
     * @since 2.1
     */
    private GoalType goal;

    /**
     * Whether to restrict the variables to non-negative values.
     * @since 2.1
     */
    private boolean nonNegative;

    /** Maximal number of iterations allowed. */
    private int maxIterations;

    /** Number of iterations already performed. */
    private int iterations;

    /**
     * Simple constructor with default settings.
     * <p>The maximal number of evaluation is set to its default value.</p>
     */
    protected AbstractLinearOptimizer() {try{__CLR4_4_1zgvzgvlb90pa5w.R.inc(45967);
        __CLR4_4_1zgvzgvlb90pa5w.R.inc(45968);setMaxIterations(DEFAULT_MAX_ITERATIONS);
    }finally{__CLR4_4_1zgvzgvlb90pa5w.R.flushNeeded();}}

    /**
     * @return {@code true} if the variables are restricted to non-negative values.
     */
    protected boolean restrictToNonNegative() {try{__CLR4_4_1zgvzgvlb90pa5w.R.inc(45969);
        __CLR4_4_1zgvzgvlb90pa5w.R.inc(45970);return nonNegative;
    }finally{__CLR4_4_1zgvzgvlb90pa5w.R.flushNeeded();}}

    /**
     * @return the optimization type.
     */
    protected GoalType getGoalType() {try{__CLR4_4_1zgvzgvlb90pa5w.R.inc(45971);
        __CLR4_4_1zgvzgvlb90pa5w.R.inc(45972);return goal;
    }finally{__CLR4_4_1zgvzgvlb90pa5w.R.flushNeeded();}}

    /**
     * @return the optimization type.
     */
    protected LinearObjectiveFunction getFunction() {try{__CLR4_4_1zgvzgvlb90pa5w.R.inc(45973);
        __CLR4_4_1zgvzgvlb90pa5w.R.inc(45974);return function;
    }finally{__CLR4_4_1zgvzgvlb90pa5w.R.flushNeeded();}}

    /**
     * @return the optimization type.
     */
    protected Collection<LinearConstraint> getConstraints() {try{__CLR4_4_1zgvzgvlb90pa5w.R.inc(45975);
        __CLR4_4_1zgvzgvlb90pa5w.R.inc(45976);return Collections.unmodifiableCollection(linearConstraints);
    }finally{__CLR4_4_1zgvzgvlb90pa5w.R.flushNeeded();}}

    /** {@inheritDoc} */
    public void setMaxIterations(int maxIterations) {try{__CLR4_4_1zgvzgvlb90pa5w.R.inc(45977);
        __CLR4_4_1zgvzgvlb90pa5w.R.inc(45978);this.maxIterations = maxIterations;
    }finally{__CLR4_4_1zgvzgvlb90pa5w.R.flushNeeded();}}

    /** {@inheritDoc} */
    public int getMaxIterations() {try{__CLR4_4_1zgvzgvlb90pa5w.R.inc(45979);
        __CLR4_4_1zgvzgvlb90pa5w.R.inc(45980);return maxIterations;
    }finally{__CLR4_4_1zgvzgvlb90pa5w.R.flushNeeded();}}

    /** {@inheritDoc} */
    public int getIterations() {try{__CLR4_4_1zgvzgvlb90pa5w.R.inc(45981);
        __CLR4_4_1zgvzgvlb90pa5w.R.inc(45982);return iterations;
    }finally{__CLR4_4_1zgvzgvlb90pa5w.R.flushNeeded();}}

    /**
     * Increment the iterations counter by 1.
     * @exception MaxCountExceededException if the maximal number of iterations is exceeded
     */
    protected void incrementIterationsCounter()
        throws MaxCountExceededException {try{__CLR4_4_1zgvzgvlb90pa5w.R.inc(45983);
        __CLR4_4_1zgvzgvlb90pa5w.R.inc(45984);if ((((++iterations > maxIterations)&&(__CLR4_4_1zgvzgvlb90pa5w.R.iget(45985)!=0|true))||(__CLR4_4_1zgvzgvlb90pa5w.R.iget(45986)==0&false))) {{
            __CLR4_4_1zgvzgvlb90pa5w.R.inc(45987);throw new MaxCountExceededException(maxIterations);
        }
    }}finally{__CLR4_4_1zgvzgvlb90pa5w.R.flushNeeded();}}

    /** {@inheritDoc} */
    public PointValuePair optimize(final LinearObjectiveFunction f,
                                   final Collection<LinearConstraint> constraints,
                                   final GoalType goalType, final boolean restrictToNonNegative)
        throws MathIllegalStateException {try{__CLR4_4_1zgvzgvlb90pa5w.R.inc(45988);

        // store linear problem characteristics
        __CLR4_4_1zgvzgvlb90pa5w.R.inc(45989);this.function          = f;
        __CLR4_4_1zgvzgvlb90pa5w.R.inc(45990);this.linearConstraints = constraints;
        __CLR4_4_1zgvzgvlb90pa5w.R.inc(45991);this.goal              = goalType;
        __CLR4_4_1zgvzgvlb90pa5w.R.inc(45992);this.nonNegative       = restrictToNonNegative;

        __CLR4_4_1zgvzgvlb90pa5w.R.inc(45993);iterations  = 0;

        // solve the problem
        __CLR4_4_1zgvzgvlb90pa5w.R.inc(45994);return doOptimize();

    }finally{__CLR4_4_1zgvzgvlb90pa5w.R.flushNeeded();}}

    /**
     * Perform the bulk of optimization algorithm.
     * @return the point/value pair giving the optimal value for objective function
     * @exception MathIllegalStateException if no solution fulfilling the constraints
     * can be found in the allowed number of iterations
     */
    protected abstract PointValuePair doOptimize() throws MathIllegalStateException;

}
