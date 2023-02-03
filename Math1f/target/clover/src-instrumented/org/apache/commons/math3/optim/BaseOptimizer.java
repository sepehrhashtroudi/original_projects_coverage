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
package org.apache.commons.math3.optim;

import org.apache.commons.math3.util.Incrementor;
import org.apache.commons.math3.exception.TooManyEvaluationsException;
import org.apache.commons.math3.exception.TooManyIterationsException;

/**
 * Base class for implementing optimizers.
 * It contains the boiler-plate code for counting the number of evaluations
 * of the objective function and the number of iterations of the algorithm,
 * and storing the convergence checker.
 * <em>It is not a "user" class.</em>
 *
 * @param <PAIR> Type of the point/value pair returned by the optimization
 * algorithm.
 *
 * @version $Id$
 * @since 3.1
 */
public abstract class BaseOptimizer<PAIR> {public static class __CLR4_4_1rierielb90p9ky{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,35699,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /** Evaluations counter. */
    protected final Incrementor evaluations;
    /** Iterations counter. */
    protected final Incrementor iterations;
    /** Convergence checker. */
    private final ConvergenceChecker<PAIR> checker;

    /**
     * @param checker Convergence checker.
     */
    protected BaseOptimizer(ConvergenceChecker<PAIR> checker) {
        this(checker, 0, Integer.MAX_VALUE);__CLR4_4_1rierielb90p9ky.R.inc(35655);try{__CLR4_4_1rierielb90p9ky.R.inc(35654);
    }finally{__CLR4_4_1rierielb90p9ky.R.flushNeeded();}}

    /**
     * @param checker Convergence checker.
     * @param maxEval Maximum number of objective function evaluations.
     * @param maxIter Maximum number of algorithm iterations.
     */
    protected BaseOptimizer(ConvergenceChecker<PAIR> checker,
                            int maxEval,
                            int maxIter) {try{__CLR4_4_1rierielb90p9ky.R.inc(35656);
        __CLR4_4_1rierielb90p9ky.R.inc(35657);this.checker = checker;

        __CLR4_4_1rierielb90p9ky.R.inc(35658);evaluations = new Incrementor(maxEval, new MaxEvalCallback());
        __CLR4_4_1rierielb90p9ky.R.inc(35659);iterations = new Incrementor(maxIter, new MaxIterCallback());
    }finally{__CLR4_4_1rierielb90p9ky.R.flushNeeded();}}

    /**
     * Gets the maximal number of function evaluations.
     *
     * @return the maximal number of function evaluations.
     */
    public int getMaxEvaluations() {try{__CLR4_4_1rierielb90p9ky.R.inc(35660);
        __CLR4_4_1rierielb90p9ky.R.inc(35661);return evaluations.getMaximalCount();
    }finally{__CLR4_4_1rierielb90p9ky.R.flushNeeded();}}

    /**
     * Gets the number of evaluations of the objective function.
     * The number of evaluations corresponds to the last call to the
     * {@code optimize} method. It is 0 if the method has not been
     * called yet.
     *
     * @return the number of evaluations of the objective function.
     */
    public int getEvaluations() {try{__CLR4_4_1rierielb90p9ky.R.inc(35662);
        __CLR4_4_1rierielb90p9ky.R.inc(35663);return evaluations.getCount();
    }finally{__CLR4_4_1rierielb90p9ky.R.flushNeeded();}}

    /**
     * Gets the maximal number of iterations.
     *
     * @return the maximal number of iterations.
     */
    public int getMaxIterations() {try{__CLR4_4_1rierielb90p9ky.R.inc(35664);
        __CLR4_4_1rierielb90p9ky.R.inc(35665);return iterations.getMaximalCount();
    }finally{__CLR4_4_1rierielb90p9ky.R.flushNeeded();}}

    /**
     * Gets the number of iterations performed by the algorithm.
     * The number iterations corresponds to the last call to the
     * {@code optimize} method. It is 0 if the method has not been
     * called yet.
     *
     * @return the number of evaluations of the objective function.
     */
    public int getIterations() {try{__CLR4_4_1rierielb90p9ky.R.inc(35666);
        __CLR4_4_1rierielb90p9ky.R.inc(35667);return iterations.getCount();
    }finally{__CLR4_4_1rierielb90p9ky.R.flushNeeded();}}

    /**
     * Gets the convergence checker.
     *
     * @return the object used to check for convergence.
     */
    public ConvergenceChecker<PAIR> getConvergenceChecker() {try{__CLR4_4_1rierielb90p9ky.R.inc(35668);
        __CLR4_4_1rierielb90p9ky.R.inc(35669);return checker;
    }finally{__CLR4_4_1rierielb90p9ky.R.flushNeeded();}}

    /**
     * Stores data and performs the optimization.
     * <br/>
     * The list of parameters is open-ended so that sub-classes can extend it
     * with arguments specific to their concrete implementations.
     * <br/>
     * When the method is called multiple times, instance data is overwritten
     * only when actually present in the list of arguments: when not specified,
     * data set in a previous call is retained (and thus is optional in
     * subsequent calls).
     * <br/>
     * Important note: Subclasses <em>must</em> override
     * {@link #parseOptimizationData(OptimizationData[])} if they need to register
     * their own options; but then, they <em>must</em> also call
     * {@code super.parseOptimizationData(optData)} within that method.
     *
     * @param optData Optimization data.
     * This method will register the following data:
     * <ul>
     *  <li>{@link MaxEval}</li>
     *  <li>{@link MaxIter}</li>
     * </ul>
     * @return a point/value pair that satifies the convergence criteria.
     * @throws TooManyEvaluationsException if the maximal number of
     * evaluations is exceeded.
     * @throws TooManyIterationsException if the maximal number of
     * iterations is exceeded.
     */
    public PAIR optimize(OptimizationData... optData)
        throws TooManyEvaluationsException,
               TooManyIterationsException {try{__CLR4_4_1rierielb90p9ky.R.inc(35670);
        // Parse options.
        __CLR4_4_1rierielb90p9ky.R.inc(35671);parseOptimizationData(optData);

        // Reset counters.
        __CLR4_4_1rierielb90p9ky.R.inc(35672);evaluations.resetCount();
        __CLR4_4_1rierielb90p9ky.R.inc(35673);iterations.resetCount();
        // Perform optimization.
        __CLR4_4_1rierielb90p9ky.R.inc(35674);return doOptimize();
    }finally{__CLR4_4_1rierielb90p9ky.R.flushNeeded();}}

    /**
     * Performs the optimization.
     *
     * @return a point/value pair that satifies the convergence criteria.
     * @throws TooManyEvaluationsException if the maximal number of
     * evaluations is exceeded.
     * @throws TooManyIterationsException if the maximal number of
     * iterations is exceeded.
     */
    public PAIR optimize()
        throws TooManyEvaluationsException,
               TooManyIterationsException {try{__CLR4_4_1rierielb90p9ky.R.inc(35675);
        // Reset counters.
        __CLR4_4_1rierielb90p9ky.R.inc(35676);evaluations.resetCount();
        __CLR4_4_1rierielb90p9ky.R.inc(35677);iterations.resetCount();
        // Perform optimization.
        __CLR4_4_1rierielb90p9ky.R.inc(35678);return doOptimize();
    }finally{__CLR4_4_1rierielb90p9ky.R.flushNeeded();}}

    /**
     * Performs the bulk of the optimization algorithm.
     *
     * @return the point/value pair giving the optimal value of the
     * objective function.
     */
    protected abstract PAIR doOptimize();

    /**
     * Increment the evaluation count.
     *
     * @throws TooManyEvaluationsException if the allowed evaluations
     * have been exhausted.
     */
    protected void incrementEvaluationCount()
        throws TooManyEvaluationsException {try{__CLR4_4_1rierielb90p9ky.R.inc(35679);
        __CLR4_4_1rierielb90p9ky.R.inc(35680);evaluations.incrementCount();
    }finally{__CLR4_4_1rierielb90p9ky.R.flushNeeded();}}

    /**
     * Increment the iteration count.
     *
     * @throws TooManyIterationsException if the allowed iterations
     * have been exhausted.
     */
    protected void incrementIterationCount()
        throws TooManyIterationsException {try{__CLR4_4_1rierielb90p9ky.R.inc(35681);
        __CLR4_4_1rierielb90p9ky.R.inc(35682);iterations.incrementCount();
    }finally{__CLR4_4_1rierielb90p9ky.R.flushNeeded();}}

    /**
     * Scans the list of (required and optional) optimization data that
     * characterize the problem.
     *
     * @param optData Optimization data.
     * The following data will be looked for:
     * <ul>
     *  <li>{@link MaxEval}</li>
     *  <li>{@link MaxIter}</li>
     * </ul>
     */
    protected void parseOptimizationData(OptimizationData... optData) {try{__CLR4_4_1rierielb90p9ky.R.inc(35683);
        // The existing values (as set by the previous call) are reused if
        // not provided in the argument list.
        __CLR4_4_1rierielb90p9ky.R.inc(35684);for (OptimizationData data : optData) {{
            __CLR4_4_1rierielb90p9ky.R.inc(35685);if ((((data instanceof MaxEval)&&(__CLR4_4_1rierielb90p9ky.R.iget(35686)!=0|true))||(__CLR4_4_1rierielb90p9ky.R.iget(35687)==0&false))) {{
                __CLR4_4_1rierielb90p9ky.R.inc(35688);evaluations.setMaximalCount(((MaxEval) data).getMaxEval());
                __CLR4_4_1rierielb90p9ky.R.inc(35689);continue;
            }
            }__CLR4_4_1rierielb90p9ky.R.inc(35690);if ((((data instanceof MaxIter)&&(__CLR4_4_1rierielb90p9ky.R.iget(35691)!=0|true))||(__CLR4_4_1rierielb90p9ky.R.iget(35692)==0&false))) {{
                __CLR4_4_1rierielb90p9ky.R.inc(35693);iterations.setMaximalCount(((MaxIter) data).getMaxIter());
                __CLR4_4_1rierielb90p9ky.R.inc(35694);continue;
            }
        }}
    }}finally{__CLR4_4_1rierielb90p9ky.R.flushNeeded();}}

    /**
     * Defines the action to perform when reaching the maximum number
     * of evaluations.
     */
    private static class MaxEvalCallback
        implements  Incrementor.MaxCountExceededCallback {
        /**
         * {@inheritDoc}
         * @throws TooManyEvaluationsException
         */
        public void trigger(int max) {try{__CLR4_4_1rierielb90p9ky.R.inc(35695);
            __CLR4_4_1rierielb90p9ky.R.inc(35696);throw new TooManyEvaluationsException(max);
        }finally{__CLR4_4_1rierielb90p9ky.R.flushNeeded();}}
    }

    /**
     * Defines the action to perform when reaching the maximum number
     * of evaluations.
     */
    private static class MaxIterCallback
        implements Incrementor.MaxCountExceededCallback {
        /**
         * {@inheritDoc}
         * @throws TooManyIterationsException
         */
        public void trigger(int max) {try{__CLR4_4_1rierielb90p9ky.R.inc(35697);
            __CLR4_4_1rierielb90p9ky.R.inc(35698);throw new TooManyIterationsException(max);
        }finally{__CLR4_4_1rierielb90p9ky.R.flushNeeded();}}
    }
}
