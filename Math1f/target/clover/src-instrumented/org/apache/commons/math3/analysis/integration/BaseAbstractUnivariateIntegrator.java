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
package org.apache.commons.math3.analysis.integration;

import org.apache.commons.math3.analysis.UnivariateFunction;
import org.apache.commons.math3.analysis.solvers.UnivariateSolverUtils;
import org.apache.commons.math3.exception.MathIllegalArgumentException;
import org.apache.commons.math3.exception.MaxCountExceededException;
import org.apache.commons.math3.exception.NotStrictlyPositiveException;
import org.apache.commons.math3.exception.NullArgumentException;
import org.apache.commons.math3.exception.NumberIsTooSmallException;
import org.apache.commons.math3.exception.TooManyEvaluationsException;
import org.apache.commons.math3.util.Incrementor;
import org.apache.commons.math3.util.MathUtils;

/**
 * Provide a default implementation for several generic functions.
 *
 * @version $Id$
 * @since 1.2
 */
public abstract class BaseAbstractUnivariateIntegrator implements UnivariateIntegrator {public static class __CLR4_4_11u71u7lb90p6mo{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,2435,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** Default absolute accuracy. */
    public static final double DEFAULT_ABSOLUTE_ACCURACY = 1.0e-15;

    /** Default relative accuracy. */
    public static final double DEFAULT_RELATIVE_ACCURACY = 1.0e-6;

    /** Default minimal iteration count. */
    public static final int DEFAULT_MIN_ITERATIONS_COUNT = 3;

    /** Default maximal iteration count. */
    public static final int DEFAULT_MAX_ITERATIONS_COUNT = Integer.MAX_VALUE;

    /** The iteration count. */
    protected final Incrementor iterations;

    /** Maximum absolute error. */
    private final double absoluteAccuracy;

    /** Maximum relative error. */
    private final double relativeAccuracy;

    /** minimum number of iterations */
    private final int minimalIterationCount;

    /** The functions evaluation count. */
    private final Incrementor evaluations;

    /** Function to integrate. */
    private UnivariateFunction function;

    /** Lower bound for the interval. */
    private double min;

    /** Upper bound for the interval. */
    private double max;

    /**
     * Construct an integrator with given accuracies and iteration counts.
     * <p>
     * The meanings of the various parameters are:
     * <ul>
     *   <li>relative accuracy:
     *       this is used to stop iterations if the absolute accuracy can't be
     *       achieved due to large values or short mantissa length. If this
     *       should be the primary criterion for convergence rather then a
     *       safety measure, set the absolute accuracy to a ridiculously small value,
     *       like {@link org.apache.commons.math3.util.Precision#SAFE_MIN Precision.SAFE_MIN}.</li>
     *   <li>absolute accuracy:
     *       The default is usually chosen so that results in the interval
     *       -10..-0.1 and +0.1..+10 can be found with a reasonable accuracy. If the
     *       expected absolute value of your results is of much smaller magnitude, set
     *       this to a smaller value.</li>
     *   <li>minimum number of iterations:
     *       minimal iteration is needed to avoid false early convergence, e.g.
     *       the sample points happen to be zeroes of the function. Users can
     *       use the default value or choose one that they see as appropriate.</li>
     *   <li>maximum number of iterations:
     *       usually a high iteration count indicates convergence problems. However,
     *       the "reasonable value" varies widely for different algorithms. Users are
     *       advised to use the default value supplied by the algorithm.</li>
     * </ul>
     * </p>
     * @param relativeAccuracy relative accuracy of the result
     * @param absoluteAccuracy absolute accuracy of the result
     * @param minimalIterationCount minimum number of iterations
     * @param maximalIterationCount maximum number of iterations
     * @exception NotStrictlyPositiveException if minimal number of iterations
     * is not strictly positive
     * @exception NumberIsTooSmallException if maximal number of iterations
     * is lesser than or equal to the minimal number of iterations
     */
    protected BaseAbstractUnivariateIntegrator(final double relativeAccuracy,
                                               final double absoluteAccuracy,
                                               final int minimalIterationCount,
                                               final int maximalIterationCount)
        throws NotStrictlyPositiveException, NumberIsTooSmallException {try{__CLR4_4_11u71u7lb90p6mo.R.inc(2383);

        // accuracy settings
        __CLR4_4_11u71u7lb90p6mo.R.inc(2384);this.relativeAccuracy      = relativeAccuracy;
        __CLR4_4_11u71u7lb90p6mo.R.inc(2385);this.absoluteAccuracy      = absoluteAccuracy;

        // iterations count settings
        __CLR4_4_11u71u7lb90p6mo.R.inc(2386);if ((((minimalIterationCount <= 0)&&(__CLR4_4_11u71u7lb90p6mo.R.iget(2387)!=0|true))||(__CLR4_4_11u71u7lb90p6mo.R.iget(2388)==0&false))) {{
            __CLR4_4_11u71u7lb90p6mo.R.inc(2389);throw new NotStrictlyPositiveException(minimalIterationCount);
        }
        }__CLR4_4_11u71u7lb90p6mo.R.inc(2390);if ((((maximalIterationCount <= minimalIterationCount)&&(__CLR4_4_11u71u7lb90p6mo.R.iget(2391)!=0|true))||(__CLR4_4_11u71u7lb90p6mo.R.iget(2392)==0&false))) {{
            __CLR4_4_11u71u7lb90p6mo.R.inc(2393);throw new NumberIsTooSmallException(maximalIterationCount, minimalIterationCount, false);
        }
        }__CLR4_4_11u71u7lb90p6mo.R.inc(2394);this.minimalIterationCount = minimalIterationCount;
        __CLR4_4_11u71u7lb90p6mo.R.inc(2395);this.iterations            = new Incrementor();
        __CLR4_4_11u71u7lb90p6mo.R.inc(2396);iterations.setMaximalCount(maximalIterationCount);

        // prepare evaluations counter, but do not set it yet
        __CLR4_4_11u71u7lb90p6mo.R.inc(2397);evaluations = new Incrementor();

    }finally{__CLR4_4_11u71u7lb90p6mo.R.flushNeeded();}}

    /**
     * Construct an integrator with given accuracies.
     * @param relativeAccuracy relative accuracy of the result
     * @param absoluteAccuracy absolute accuracy of the result
     */
    protected BaseAbstractUnivariateIntegrator(final double relativeAccuracy,
                                           final double absoluteAccuracy) {
        this(relativeAccuracy, absoluteAccuracy,
             DEFAULT_MIN_ITERATIONS_COUNT, DEFAULT_MAX_ITERATIONS_COUNT);__CLR4_4_11u71u7lb90p6mo.R.inc(2399);try{__CLR4_4_11u71u7lb90p6mo.R.inc(2398);
    }finally{__CLR4_4_11u71u7lb90p6mo.R.flushNeeded();}}

    /**
     * Construct an integrator with given iteration counts.
     * @param minimalIterationCount minimum number of iterations
     * @param maximalIterationCount maximum number of iterations
     * @exception NotStrictlyPositiveException if minimal number of iterations
     * is not strictly positive
     * @exception NumberIsTooSmallException if maximal number of iterations
     * is lesser than or equal to the minimal number of iterations
     */
    protected BaseAbstractUnivariateIntegrator(final int minimalIterationCount,
                                           final int maximalIterationCount)
        throws NotStrictlyPositiveException, NumberIsTooSmallException {
        this(DEFAULT_RELATIVE_ACCURACY, DEFAULT_ABSOLUTE_ACCURACY,
             minimalIterationCount, maximalIterationCount);__CLR4_4_11u71u7lb90p6mo.R.inc(2401);try{__CLR4_4_11u71u7lb90p6mo.R.inc(2400);
    }finally{__CLR4_4_11u71u7lb90p6mo.R.flushNeeded();}}

    /** {@inheritDoc} */
    public double getRelativeAccuracy() {try{__CLR4_4_11u71u7lb90p6mo.R.inc(2402);
        __CLR4_4_11u71u7lb90p6mo.R.inc(2403);return relativeAccuracy;
    }finally{__CLR4_4_11u71u7lb90p6mo.R.flushNeeded();}}

    /** {@inheritDoc} */
    public double getAbsoluteAccuracy() {try{__CLR4_4_11u71u7lb90p6mo.R.inc(2404);
        __CLR4_4_11u71u7lb90p6mo.R.inc(2405);return absoluteAccuracy;
    }finally{__CLR4_4_11u71u7lb90p6mo.R.flushNeeded();}}

    /** {@inheritDoc} */
    public int getMinimalIterationCount() {try{__CLR4_4_11u71u7lb90p6mo.R.inc(2406);
        __CLR4_4_11u71u7lb90p6mo.R.inc(2407);return minimalIterationCount;
    }finally{__CLR4_4_11u71u7lb90p6mo.R.flushNeeded();}}

    /** {@inheritDoc} */
    public int getMaximalIterationCount() {try{__CLR4_4_11u71u7lb90p6mo.R.inc(2408);
        __CLR4_4_11u71u7lb90p6mo.R.inc(2409);return iterations.getMaximalCount();
    }finally{__CLR4_4_11u71u7lb90p6mo.R.flushNeeded();}}

    /** {@inheritDoc} */
    public int getEvaluations() {try{__CLR4_4_11u71u7lb90p6mo.R.inc(2410);
        __CLR4_4_11u71u7lb90p6mo.R.inc(2411);return evaluations.getCount();
    }finally{__CLR4_4_11u71u7lb90p6mo.R.flushNeeded();}}

    /** {@inheritDoc} */
    public int getIterations() {try{__CLR4_4_11u71u7lb90p6mo.R.inc(2412);
        __CLR4_4_11u71u7lb90p6mo.R.inc(2413);return iterations.getCount();
    }finally{__CLR4_4_11u71u7lb90p6mo.R.flushNeeded();}}

    /**
     * @return the lower bound.
     */
    protected double getMin() {try{__CLR4_4_11u71u7lb90p6mo.R.inc(2414);
        __CLR4_4_11u71u7lb90p6mo.R.inc(2415);return min;
    }finally{__CLR4_4_11u71u7lb90p6mo.R.flushNeeded();}}
    /**
     * @return the upper bound.
     */
    protected double getMax() {try{__CLR4_4_11u71u7lb90p6mo.R.inc(2416);
        __CLR4_4_11u71u7lb90p6mo.R.inc(2417);return max;
    }finally{__CLR4_4_11u71u7lb90p6mo.R.flushNeeded();}}

    /**
     * Compute the objective function value.
     *
     * @param point Point at which the objective function must be evaluated.
     * @return the objective function value at specified point.
     * @throws TooManyEvaluationsException if the maximal number of function
     * evaluations is exceeded.
     */
    protected double computeObjectiveValue(final double point)
        throws TooManyEvaluationsException {try{__CLR4_4_11u71u7lb90p6mo.R.inc(2418);
        __CLR4_4_11u71u7lb90p6mo.R.inc(2419);try {
            __CLR4_4_11u71u7lb90p6mo.R.inc(2420);evaluations.incrementCount();
        } catch (MaxCountExceededException e) {
            __CLR4_4_11u71u7lb90p6mo.R.inc(2421);throw new TooManyEvaluationsException(e.getMax());
        }
        __CLR4_4_11u71u7lb90p6mo.R.inc(2422);return function.value(point);
    }finally{__CLR4_4_11u71u7lb90p6mo.R.flushNeeded();}}

    /**
     * Prepare for computation.
     * Subclasses must call this method if they override any of the
     * {@code solve} methods.
     *
     * @param maxEval Maximum number of evaluations.
     * @param f the integrand function
     * @param lower the min bound for the interval
     * @param upper the upper bound for the interval
     * @throws NullArgumentException if {@code f} is {@code null}.
     * @throws MathIllegalArgumentException if {@code min >= max}.
     */
    protected void setup(final int maxEval,
                         final UnivariateFunction f,
                         final double lower, final double upper)
        throws NullArgumentException, MathIllegalArgumentException {try{__CLR4_4_11u71u7lb90p6mo.R.inc(2423);

        // Checks.
        __CLR4_4_11u71u7lb90p6mo.R.inc(2424);MathUtils.checkNotNull(f);
        __CLR4_4_11u71u7lb90p6mo.R.inc(2425);UnivariateSolverUtils.verifyInterval(lower, upper);

        // Reset.
        __CLR4_4_11u71u7lb90p6mo.R.inc(2426);min = lower;
        __CLR4_4_11u71u7lb90p6mo.R.inc(2427);max = upper;
        __CLR4_4_11u71u7lb90p6mo.R.inc(2428);function = f;
        __CLR4_4_11u71u7lb90p6mo.R.inc(2429);evaluations.setMaximalCount(maxEval);
        __CLR4_4_11u71u7lb90p6mo.R.inc(2430);evaluations.resetCount();
        __CLR4_4_11u71u7lb90p6mo.R.inc(2431);iterations.resetCount();

    }finally{__CLR4_4_11u71u7lb90p6mo.R.flushNeeded();}}

    /** {@inheritDoc} */
    public double integrate(final int maxEval, final UnivariateFunction f,
                            final double lower, final double upper)
        throws TooManyEvaluationsException, MaxCountExceededException,
               MathIllegalArgumentException, NullArgumentException {try{__CLR4_4_11u71u7lb90p6mo.R.inc(2432);

        // Initialization.
        __CLR4_4_11u71u7lb90p6mo.R.inc(2433);setup(maxEval, f, lower, upper);

        // Perform computation.
        __CLR4_4_11u71u7lb90p6mo.R.inc(2434);return doIntegrate();

    }finally{__CLR4_4_11u71u7lb90p6mo.R.flushNeeded();}}

    /**
     * Method for implementing actual integration algorithms in derived
     * classes.
     *
     * @return the root.
     * @throws TooManyEvaluationsException if the maximal number of evaluations
     * is exceeded.
     * @throws MaxCountExceededException if the maximum iteration count is exceeded
     * or the integrator detects convergence problems otherwise
     */
    protected abstract double doIntegrate()
        throws TooManyEvaluationsException, MaxCountExceededException;

}
