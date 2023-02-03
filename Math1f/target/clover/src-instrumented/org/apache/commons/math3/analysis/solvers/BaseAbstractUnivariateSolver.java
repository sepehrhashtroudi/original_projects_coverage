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

package org.apache.commons.math3.analysis.solvers;

import org.apache.commons.math3.analysis.UnivariateFunction;
import org.apache.commons.math3.exception.MaxCountExceededException;
import org.apache.commons.math3.exception.NoBracketingException;
import org.apache.commons.math3.exception.TooManyEvaluationsException;
import org.apache.commons.math3.exception.NumberIsTooLargeException;
import org.apache.commons.math3.exception.NullArgumentException;
import org.apache.commons.math3.util.Incrementor;
import org.apache.commons.math3.util.MathUtils;

/**
 * Provide a default implementation for several functions useful to generic
 * solvers.
 *
 * @param <FUNC> Type of function to solve.
 *
 * @since 2.0
 * @version $Id$
 */
public abstract class BaseAbstractUnivariateSolver<FUNC extends UnivariateFunction>
    implements BaseUnivariateSolver<FUNC> {public static class __CLR4_4_13xp3xplb90p72e{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,5157,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /** Default relative accuracy. */
    private static final double DEFAULT_RELATIVE_ACCURACY = 1e-14;
    /** Default function value accuracy. */
    private static final double DEFAULT_FUNCTION_VALUE_ACCURACY = 1e-15;
    /** Function value accuracy. */
    private final double functionValueAccuracy;
    /** Absolute accuracy. */
    private final double absoluteAccuracy;
    /** Relative accuracy. */
    private final double relativeAccuracy;
    /** Evaluations counter. */
    private final Incrementor evaluations = new Incrementor();
    /** Lower end of search interval. */
    private double searchMin;
    /** Higher end of search interval. */
    private double searchMax;
    /** Initial guess. */
    private double searchStart;
    /** Function to solve. */
    private FUNC function;

    /**
     * Construct a solver with given absolute accuracy.
     *
     * @param absoluteAccuracy Maximum absolute error.
     */
    protected BaseAbstractUnivariateSolver(final double absoluteAccuracy) {
        this(DEFAULT_RELATIVE_ACCURACY,
             absoluteAccuracy,
             DEFAULT_FUNCTION_VALUE_ACCURACY);__CLR4_4_13xp3xplb90p72e.R.inc(5102);try{__CLR4_4_13xp3xplb90p72e.R.inc(5101);
    }finally{__CLR4_4_13xp3xplb90p72e.R.flushNeeded();}}

    /**
     * Construct a solver with given accuracies.
     *
     * @param relativeAccuracy Maximum relative error.
     * @param absoluteAccuracy Maximum absolute error.
     */
    protected BaseAbstractUnivariateSolver(final double relativeAccuracy,
                                               final double absoluteAccuracy) {
        this(relativeAccuracy,
             absoluteAccuracy,
             DEFAULT_FUNCTION_VALUE_ACCURACY);__CLR4_4_13xp3xplb90p72e.R.inc(5104);try{__CLR4_4_13xp3xplb90p72e.R.inc(5103);
    }finally{__CLR4_4_13xp3xplb90p72e.R.flushNeeded();}}

    /**
     * Construct a solver with given accuracies.
     *
     * @param relativeAccuracy Maximum relative error.
     * @param absoluteAccuracy Maximum absolute error.
     * @param functionValueAccuracy Maximum function value error.
     */
    protected BaseAbstractUnivariateSolver(final double relativeAccuracy,
                                               final double absoluteAccuracy,
                                               final double functionValueAccuracy) {try{__CLR4_4_13xp3xplb90p72e.R.inc(5105);
        __CLR4_4_13xp3xplb90p72e.R.inc(5106);this.absoluteAccuracy = absoluteAccuracy;
        __CLR4_4_13xp3xplb90p72e.R.inc(5107);this.relativeAccuracy = relativeAccuracy;
        __CLR4_4_13xp3xplb90p72e.R.inc(5108);this.functionValueAccuracy = functionValueAccuracy;
    }finally{__CLR4_4_13xp3xplb90p72e.R.flushNeeded();}}

    /** {@inheritDoc} */
    public int getMaxEvaluations() {try{__CLR4_4_13xp3xplb90p72e.R.inc(5109);
        __CLR4_4_13xp3xplb90p72e.R.inc(5110);return evaluations.getMaximalCount();
    }finally{__CLR4_4_13xp3xplb90p72e.R.flushNeeded();}}
    /** {@inheritDoc} */
    public int getEvaluations() {try{__CLR4_4_13xp3xplb90p72e.R.inc(5111);
        __CLR4_4_13xp3xplb90p72e.R.inc(5112);return evaluations.getCount();
    }finally{__CLR4_4_13xp3xplb90p72e.R.flushNeeded();}}
    /**
     * @return the lower end of the search interval.
     */
    public double getMin() {try{__CLR4_4_13xp3xplb90p72e.R.inc(5113);
        __CLR4_4_13xp3xplb90p72e.R.inc(5114);return searchMin;
    }finally{__CLR4_4_13xp3xplb90p72e.R.flushNeeded();}}
    /**
     * @return the higher end of the search interval.
     */
    public double getMax() {try{__CLR4_4_13xp3xplb90p72e.R.inc(5115);
        __CLR4_4_13xp3xplb90p72e.R.inc(5116);return searchMax;
    }finally{__CLR4_4_13xp3xplb90p72e.R.flushNeeded();}}
    /**
     * @return the initial guess.
     */
    public double getStartValue() {try{__CLR4_4_13xp3xplb90p72e.R.inc(5117);
        __CLR4_4_13xp3xplb90p72e.R.inc(5118);return searchStart;
    }finally{__CLR4_4_13xp3xplb90p72e.R.flushNeeded();}}
    /**
     * {@inheritDoc}
     */
    public double getAbsoluteAccuracy() {try{__CLR4_4_13xp3xplb90p72e.R.inc(5119);
        __CLR4_4_13xp3xplb90p72e.R.inc(5120);return absoluteAccuracy;
    }finally{__CLR4_4_13xp3xplb90p72e.R.flushNeeded();}}
    /**
     * {@inheritDoc}
     */
    public double getRelativeAccuracy() {try{__CLR4_4_13xp3xplb90p72e.R.inc(5121);
        __CLR4_4_13xp3xplb90p72e.R.inc(5122);return relativeAccuracy;
    }finally{__CLR4_4_13xp3xplb90p72e.R.flushNeeded();}}
    /**
     * {@inheritDoc}
     */
    public double getFunctionValueAccuracy() {try{__CLR4_4_13xp3xplb90p72e.R.inc(5123);
        __CLR4_4_13xp3xplb90p72e.R.inc(5124);return functionValueAccuracy;
    }finally{__CLR4_4_13xp3xplb90p72e.R.flushNeeded();}}

    /**
     * Compute the objective function value.
     *
     * @param point Point at which the objective function must be evaluated.
     * @return the objective function value at specified point.
     * @throws TooManyEvaluationsException if the maximal number of evaluations
     * is exceeded.
     */
    protected double computeObjectiveValue(double point)
        throws TooManyEvaluationsException {try{__CLR4_4_13xp3xplb90p72e.R.inc(5125);
        __CLR4_4_13xp3xplb90p72e.R.inc(5126);incrementEvaluationCount();
        __CLR4_4_13xp3xplb90p72e.R.inc(5127);return function.value(point);
    }finally{__CLR4_4_13xp3xplb90p72e.R.flushNeeded();}}

    /**
     * Prepare for computation.
     * Subclasses must call this method if they override any of the
     * {@code solve} methods.
     *
     * @param f Function to solve.
     * @param min Lower bound for the interval.
     * @param max Upper bound for the interval.
     * @param startValue Start value to use.
     * @param maxEval Maximum number of evaluations.
     * @exception NullArgumentException if f is null
     */
    protected void setup(int maxEval,
                         FUNC f,
                         double min, double max,
                         double startValue)
        throws NullArgumentException {try{__CLR4_4_13xp3xplb90p72e.R.inc(5128);
        // Checks.
        __CLR4_4_13xp3xplb90p72e.R.inc(5129);MathUtils.checkNotNull(f);

        // Reset.
        __CLR4_4_13xp3xplb90p72e.R.inc(5130);searchMin = min;
        __CLR4_4_13xp3xplb90p72e.R.inc(5131);searchMax = max;
        __CLR4_4_13xp3xplb90p72e.R.inc(5132);searchStart = startValue;
        __CLR4_4_13xp3xplb90p72e.R.inc(5133);function = f;
        __CLR4_4_13xp3xplb90p72e.R.inc(5134);evaluations.setMaximalCount(maxEval);
        __CLR4_4_13xp3xplb90p72e.R.inc(5135);evaluations.resetCount();
    }finally{__CLR4_4_13xp3xplb90p72e.R.flushNeeded();}}

    /** {@inheritDoc} */
    public double solve(int maxEval, FUNC f, double min, double max, double startValue)
        throws TooManyEvaluationsException,
               NoBracketingException {try{__CLR4_4_13xp3xplb90p72e.R.inc(5136);
        // Initialization.
        __CLR4_4_13xp3xplb90p72e.R.inc(5137);setup(maxEval, f, min, max, startValue);

        // Perform computation.
        __CLR4_4_13xp3xplb90p72e.R.inc(5138);return doSolve();
    }finally{__CLR4_4_13xp3xplb90p72e.R.flushNeeded();}}

    /** {@inheritDoc} */
    public double solve(int maxEval, FUNC f, double min, double max) {try{__CLR4_4_13xp3xplb90p72e.R.inc(5139);
        __CLR4_4_13xp3xplb90p72e.R.inc(5140);return solve(maxEval, f, min, max, min + 0.5 * (max - min));
    }finally{__CLR4_4_13xp3xplb90p72e.R.flushNeeded();}}

    /** {@inheritDoc} */
    public double solve(int maxEval, FUNC f, double startValue)
        throws TooManyEvaluationsException,
               NoBracketingException {try{__CLR4_4_13xp3xplb90p72e.R.inc(5141);
        __CLR4_4_13xp3xplb90p72e.R.inc(5142);return solve(maxEval, f, Double.NaN, Double.NaN, startValue);
    }finally{__CLR4_4_13xp3xplb90p72e.R.flushNeeded();}}

    /**
     * Method for implementing actual optimization algorithms in derived
     * classes.
     *
     * @return the root.
     * @throws TooManyEvaluationsException if the maximal number of evaluations
     * is exceeded.
     * @throws NoBracketingException if the initial search interval does not bracket
     * a root and the solver requires it.
     */
    protected abstract double doSolve()
        throws TooManyEvaluationsException, NoBracketingException;

    /**
     * Check whether the function takes opposite signs at the endpoints.
     *
     * @param lower Lower endpoint.
     * @param upper Upper endpoint.
     * @return {@code true} if the function values have opposite signs at the
     * given points.
     */
    protected boolean isBracketing(final double lower,
                                   final double upper) {try{__CLR4_4_13xp3xplb90p72e.R.inc(5143);
        __CLR4_4_13xp3xplb90p72e.R.inc(5144);return UnivariateSolverUtils.isBracketing(function, lower, upper);
    }finally{__CLR4_4_13xp3xplb90p72e.R.flushNeeded();}}

    /**
     * Check whether the arguments form a (strictly) increasing sequence.
     *
     * @param start First number.
     * @param mid Second number.
     * @param end Third number.
     * @return {@code true} if the arguments form an increasing sequence.
     */
    protected boolean isSequence(final double start,
                                 final double mid,
                                 final double end) {try{__CLR4_4_13xp3xplb90p72e.R.inc(5145);
        __CLR4_4_13xp3xplb90p72e.R.inc(5146);return UnivariateSolverUtils.isSequence(start, mid, end);
    }finally{__CLR4_4_13xp3xplb90p72e.R.flushNeeded();}}

    /**
     * Check that the endpoints specify an interval.
     *
     * @param lower Lower endpoint.
     * @param upper Upper endpoint.
     * @throws NumberIsTooLargeException if {@code lower >= upper}.
     */
    protected void verifyInterval(final double lower,
                                  final double upper)
        throws NumberIsTooLargeException {try{__CLR4_4_13xp3xplb90p72e.R.inc(5147);
        __CLR4_4_13xp3xplb90p72e.R.inc(5148);UnivariateSolverUtils.verifyInterval(lower, upper);
    }finally{__CLR4_4_13xp3xplb90p72e.R.flushNeeded();}}

    /**
     * Check that {@code lower < initial < upper}.
     *
     * @param lower Lower endpoint.
     * @param initial Initial value.
     * @param upper Upper endpoint.
     * @throws NumberIsTooLargeException if {@code lower >= initial} or
     * {@code initial >= upper}.
     */
    protected void verifySequence(final double lower,
                                  final double initial,
                                  final double upper)
        throws NumberIsTooLargeException {try{__CLR4_4_13xp3xplb90p72e.R.inc(5149);
        __CLR4_4_13xp3xplb90p72e.R.inc(5150);UnivariateSolverUtils.verifySequence(lower, initial, upper);
    }finally{__CLR4_4_13xp3xplb90p72e.R.flushNeeded();}}

    /**
     * Check that the endpoints specify an interval and the function takes
     * opposite signs at the endpoints.
     *
     * @param lower Lower endpoint.
     * @param upper Upper endpoint.
     * @throws NullArgumentException if the function has not been set.
     * @throws NoBracketingException if the function has the same sign at
     * the endpoints.
     */
    protected void verifyBracketing(final double lower,
                                    final double upper)
        throws NullArgumentException,
               NoBracketingException {try{__CLR4_4_13xp3xplb90p72e.R.inc(5151);
        __CLR4_4_13xp3xplb90p72e.R.inc(5152);UnivariateSolverUtils.verifyBracketing(function, lower, upper);
    }finally{__CLR4_4_13xp3xplb90p72e.R.flushNeeded();}}

    /**
     * Increment the evaluation count by one.
     * Method {@link #computeObjectiveValue(double)} calls this method internally.
     * It is provided for subclasses that do not exclusively use
     * {@code computeObjectiveValue} to solve the function.
     * See e.g. {@link AbstractUnivariateDifferentiableSolver}.
     *
     * @throws TooManyEvaluationsException when the allowed number of function
     * evaluations has been exhausted.
     */
    protected void incrementEvaluationCount()
        throws TooManyEvaluationsException {try{__CLR4_4_13xp3xplb90p72e.R.inc(5153);
        __CLR4_4_13xp3xplb90p72e.R.inc(5154);try {
            __CLR4_4_13xp3xplb90p72e.R.inc(5155);evaluations.incrementCount();
        } catch (MaxCountExceededException e) {
            __CLR4_4_13xp3xplb90p72e.R.inc(5156);throw new TooManyEvaluationsException(e.getMax());
        }
    }finally{__CLR4_4_13xp3xplb90p72e.R.flushNeeded();}}
}
