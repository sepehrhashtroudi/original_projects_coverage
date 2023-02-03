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
import org.apache.commons.math3.fitting.leastsquares.WithMaxEvaluations;
import org.apache.commons.math3.fitting.leastsquares.WithMaxIterations;
import org.apache.commons.math3.fitting.leastsquares.WithConvergenceChecker;

/**
 * Base class for implementing optimizers.
 * It contains the boiler-plate code for counting the number of evaluations
 * of the objective function and the number of iterations of the algorithm,
 * and storing the convergence checker.
 *
 * @param <PAIR> Type of the point/value pair returned by the optimization
 * algorithm.
 * @param <OPTIM> Type of a subclass of this class.
 * This parameter allows to implement fluent API methods at upper levels
 * of the class hierarchy (since the fluent API requires that the actual
 * type of the subclass is returned).
 *
 * @version $Id$
 * @since 3.3
 */
public abstract class AbstractOptimizer<PAIR, OPTIM extends AbstractOptimizer<PAIR, OPTIM>>
    implements WithMaxEvaluations<OPTIM>,
               WithMaxIterations<OPTIM>,
               WithConvergenceChecker<PAIR, OPTIM> {public static class __CLR4_4_1rd5rd5lb90p9kk{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,35504,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /** Evaluations counter. */
    private Incrementor evaluations = new Incrementor(Integer.MAX_VALUE, new MaxEvalCallback());
    /** Iterations counter. */
    private Incrementor iterations = new Incrementor(Integer.MAX_VALUE, new MaxIterCallback());
    /** Convergence checker. */
    private ConvergenceChecker<PAIR> checker = null;

    /**
     * Default constructor.
     */
    protected AbstractOptimizer() {try{__CLR4_4_1rd5rd5lb90p9kk.R.inc(35465);}finally{__CLR4_4_1rd5rd5lb90p9kk.R.flushNeeded();}}

    /**
     * Copy constructor.
     *
     * @param other Instance to copy.
     */
    protected AbstractOptimizer(AbstractOptimizer<PAIR, OPTIM> other) {try{__CLR4_4_1rd5rd5lb90p9kk.R.inc(35466);
        __CLR4_4_1rd5rd5lb90p9kk.R.inc(35467);checker = other.checker; // XXX Not thread-safe.
        __CLR4_4_1rd5rd5lb90p9kk.R.inc(35468);evaluations.setMaximalCount(other.getMaxEvaluations());
        __CLR4_4_1rd5rd5lb90p9kk.R.inc(35469);iterations.setMaximalCount(other.getMaxIterations());
    }finally{__CLR4_4_1rd5rd5lb90p9kk.R.flushNeeded();}}

    /**
     * Returns this instance, cast to the type of its actual subclass.
     *
     * @return the "self-type" instance.
     */
    protected OPTIM self() {try{__CLR4_4_1rd5rd5lb90p9kk.R.inc(35470);
        __CLR4_4_1rd5rd5lb90p9kk.R.inc(35471);@SuppressWarnings("unchecked")
        final OPTIM optim = (OPTIM) this;
        __CLR4_4_1rd5rd5lb90p9kk.R.inc(35472);return optim;
    }finally{__CLR4_4_1rd5rd5lb90p9kk.R.flushNeeded();}}

    /** {@inheritDoc} */
    public OPTIM withConvergenceChecker(ConvergenceChecker<PAIR> newChecker) {try{__CLR4_4_1rd5rd5lb90p9kk.R.inc(35473);
        __CLR4_4_1rd5rd5lb90p9kk.R.inc(35474);this.checker = newChecker;
        __CLR4_4_1rd5rd5lb90p9kk.R.inc(35475);return self();
    }finally{__CLR4_4_1rd5rd5lb90p9kk.R.flushNeeded();}}

    /** {@inheritDoc} */
    public OPTIM withMaxEvaluations(int max) {try{__CLR4_4_1rd5rd5lb90p9kk.R.inc(35476);
        __CLR4_4_1rd5rd5lb90p9kk.R.inc(35477);evaluations.setMaximalCount(max);
        __CLR4_4_1rd5rd5lb90p9kk.R.inc(35478);return self();
    }finally{__CLR4_4_1rd5rd5lb90p9kk.R.flushNeeded();}}

    /** {@inheritDoc} */
    public OPTIM withMaxIterations(int max) {try{__CLR4_4_1rd5rd5lb90p9kk.R.inc(35479);
        __CLR4_4_1rd5rd5lb90p9kk.R.inc(35480);iterations.setMaximalCount(max);
        __CLR4_4_1rd5rd5lb90p9kk.R.inc(35481);return self();
    }finally{__CLR4_4_1rd5rd5lb90p9kk.R.flushNeeded();}}

    /**
     * Gets the maximal number of function evaluations.
     *
     * @return the maximal number of function evaluations.
     */
    public int getMaxEvaluations() {try{__CLR4_4_1rd5rd5lb90p9kk.R.inc(35482);
        __CLR4_4_1rd5rd5lb90p9kk.R.inc(35483);return evaluations.getMaximalCount();
    }finally{__CLR4_4_1rd5rd5lb90p9kk.R.flushNeeded();}}

    /**
     * Gets the number of evaluations of the objective function.
     * The number of evaluations corresponds to the last call to the
     * {@code optimize} method. It is 0 if the method has not been
     * called yet.
     *
     * @return the number of evaluations of the objective function.
     */
    public int getEvaluations() {try{__CLR4_4_1rd5rd5lb90p9kk.R.inc(35484);
        __CLR4_4_1rd5rd5lb90p9kk.R.inc(35485);return evaluations.getCount();
    }finally{__CLR4_4_1rd5rd5lb90p9kk.R.flushNeeded();}}

    /**
     * Gets the maximal number of iterations.
     *
     * @return the maximal number of iterations.
     */
    public int getMaxIterations() {try{__CLR4_4_1rd5rd5lb90p9kk.R.inc(35486);
        __CLR4_4_1rd5rd5lb90p9kk.R.inc(35487);return iterations.getMaximalCount();
    }finally{__CLR4_4_1rd5rd5lb90p9kk.R.flushNeeded();}}

    /**
     * Gets the number of iterations performed by the algorithm.
     * The number iterations corresponds to the last call to the
     * {@code optimize} method. It is 0 if the method has not been
     * called yet.
     *
     * @return the number of evaluations of the objective function.
     */
    public int getIterations() {try{__CLR4_4_1rd5rd5lb90p9kk.R.inc(35488);
        __CLR4_4_1rd5rd5lb90p9kk.R.inc(35489);return iterations.getCount();
    }finally{__CLR4_4_1rd5rd5lb90p9kk.R.flushNeeded();}}

    /**
     * Gets the convergence checker.
     *
     * @return the object used to check for convergence.
     */
    public ConvergenceChecker<PAIR> getConvergenceChecker() {try{__CLR4_4_1rd5rd5lb90p9kk.R.inc(35490);
        __CLR4_4_1rd5rd5lb90p9kk.R.inc(35491);return checker;
    }finally{__CLR4_4_1rd5rd5lb90p9kk.R.flushNeeded();}}

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
               TooManyIterationsException {try{__CLR4_4_1rd5rd5lb90p9kk.R.inc(35492);
        // Reset counters.
        __CLR4_4_1rd5rd5lb90p9kk.R.inc(35493);evaluations.resetCount();
        __CLR4_4_1rd5rd5lb90p9kk.R.inc(35494);iterations.resetCount();
        // Perform optimization.
        __CLR4_4_1rd5rd5lb90p9kk.R.inc(35495);return doOptimize();
    }finally{__CLR4_4_1rd5rd5lb90p9kk.R.flushNeeded();}}

    /**
     * Creates a shallow copy of this instance.
     * Further modifications of the returned object will not modify the
     * fields in this instance.
     *
     * @return a shallow copy.
     */
    public abstract OPTIM shallowCopy();

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
        throws TooManyEvaluationsException {try{__CLR4_4_1rd5rd5lb90p9kk.R.inc(35496);
        __CLR4_4_1rd5rd5lb90p9kk.R.inc(35497);evaluations.incrementCount();
    }finally{__CLR4_4_1rd5rd5lb90p9kk.R.flushNeeded();}}

    /**
     * Increment the iteration count.
     *
     * @throws TooManyIterationsException if the allowed iterations
     * have been exhausted.
     */
    protected void incrementIterationCount()
        throws TooManyIterationsException {try{__CLR4_4_1rd5rd5lb90p9kk.R.inc(35498);
        __CLR4_4_1rd5rd5lb90p9kk.R.inc(35499);iterations.incrementCount();
    }finally{__CLR4_4_1rd5rd5lb90p9kk.R.flushNeeded();}}

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
        public void trigger(int max) {try{__CLR4_4_1rd5rd5lb90p9kk.R.inc(35500);
            __CLR4_4_1rd5rd5lb90p9kk.R.inc(35501);throw new TooManyEvaluationsException(max);
        }finally{__CLR4_4_1rd5rd5lb90p9kk.R.flushNeeded();}}
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
        public void trigger(int max) {try{__CLR4_4_1rd5rd5lb90p9kk.R.inc(35502);
            __CLR4_4_1rd5rd5lb90p9kk.R.inc(35503);throw new TooManyIterationsException(max);
        }finally{__CLR4_4_1rd5rd5lb90p9kk.R.flushNeeded();}}
    }
}
