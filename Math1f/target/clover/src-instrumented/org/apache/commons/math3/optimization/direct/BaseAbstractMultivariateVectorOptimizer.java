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

package org.apache.commons.math3.optimization.direct;

import org.apache.commons.math3.util.Incrementor;
import org.apache.commons.math3.exception.MaxCountExceededException;
import org.apache.commons.math3.exception.TooManyEvaluationsException;
import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.exception.NullArgumentException;
import org.apache.commons.math3.analysis.MultivariateVectorFunction;
import org.apache.commons.math3.optimization.OptimizationData;
import org.apache.commons.math3.optimization.InitialGuess;
import org.apache.commons.math3.optimization.Target;
import org.apache.commons.math3.optimization.Weight;
import org.apache.commons.math3.optimization.BaseMultivariateVectorOptimizer;
import org.apache.commons.math3.optimization.ConvergenceChecker;
import org.apache.commons.math3.optimization.PointVectorValuePair;
import org.apache.commons.math3.optimization.SimpleVectorValueChecker;
import org.apache.commons.math3.linear.RealMatrix;

/**
 * Base class for implementing optimizers for multivariate scalar functions.
 * This base class handles the boiler-plate methods associated to thresholds
 * settings, iterations and evaluations counting.
 *
 * @param <FUNC> the type of the objective function to be optimized
 *
 * @version $Id$
 * @deprecated As of 3.1 (to be removed in 4.0).
 * @since 3.0
 */
@Deprecated
public abstract class BaseAbstractMultivariateVectorOptimizer<FUNC extends MultivariateVectorFunction>
    implements BaseMultivariateVectorOptimizer<FUNC> {public static class __CLR4_4_1xj0xj0lb90pa1b{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,43542,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /** Evaluations counter. */
    protected final Incrementor evaluations = new Incrementor();
    /** Convergence checker. */
    private ConvergenceChecker<PointVectorValuePair> checker;
    /** Target value for the objective functions at optimum. */
    private double[] target;
    /** Weight matrix. */
    private RealMatrix weightMatrix;
    /** Weight for the least squares cost computation.
     * @deprecated
     */
    @Deprecated
    private double[] weight;
    /** Initial guess. */
    private double[] start;
    /** Objective function. */
    private FUNC function;

    /**
     * Simple constructor with default settings.
     * The convergence check is set to a {@link SimpleVectorValueChecker}.
     * @deprecated See {@link SimpleVectorValueChecker#SimpleVectorValueChecker()}
     */
    @Deprecated
    protected BaseAbstractMultivariateVectorOptimizer() {
        this(new SimpleVectorValueChecker());__CLR4_4_1xj0xj0lb90pa1b.R.inc(43453);try{__CLR4_4_1xj0xj0lb90pa1b.R.inc(43452);
    }finally{__CLR4_4_1xj0xj0lb90pa1b.R.flushNeeded();}}
    /**
     * @param checker Convergence checker.
     */
    protected BaseAbstractMultivariateVectorOptimizer(ConvergenceChecker<PointVectorValuePair> checker) {try{__CLR4_4_1xj0xj0lb90pa1b.R.inc(43454);
        __CLR4_4_1xj0xj0lb90pa1b.R.inc(43455);this.checker = checker;
    }finally{__CLR4_4_1xj0xj0lb90pa1b.R.flushNeeded();}}

    /** {@inheritDoc} */
    public int getMaxEvaluations() {try{__CLR4_4_1xj0xj0lb90pa1b.R.inc(43456);
        __CLR4_4_1xj0xj0lb90pa1b.R.inc(43457);return evaluations.getMaximalCount();
    }finally{__CLR4_4_1xj0xj0lb90pa1b.R.flushNeeded();}}

    /** {@inheritDoc} */
    public int getEvaluations() {try{__CLR4_4_1xj0xj0lb90pa1b.R.inc(43458);
        __CLR4_4_1xj0xj0lb90pa1b.R.inc(43459);return evaluations.getCount();
    }finally{__CLR4_4_1xj0xj0lb90pa1b.R.flushNeeded();}}

    /** {@inheritDoc} */
    public ConvergenceChecker<PointVectorValuePair> getConvergenceChecker() {try{__CLR4_4_1xj0xj0lb90pa1b.R.inc(43460);
        __CLR4_4_1xj0xj0lb90pa1b.R.inc(43461);return checker;
    }finally{__CLR4_4_1xj0xj0lb90pa1b.R.flushNeeded();}}

    /**
     * Compute the objective function value.
     *
     * @param point Point at which the objective function must be evaluated.
     * @return the objective function value at the specified point.
     * @throws TooManyEvaluationsException if the maximal number of evaluations is
     * exceeded.
     */
    protected double[] computeObjectiveValue(double[] point) {try{__CLR4_4_1xj0xj0lb90pa1b.R.inc(43462);
        __CLR4_4_1xj0xj0lb90pa1b.R.inc(43463);try {
            __CLR4_4_1xj0xj0lb90pa1b.R.inc(43464);evaluations.incrementCount();
        } catch (MaxCountExceededException e) {
            __CLR4_4_1xj0xj0lb90pa1b.R.inc(43465);throw new TooManyEvaluationsException(e.getMax());
        }
        __CLR4_4_1xj0xj0lb90pa1b.R.inc(43466);return function.value(point);
    }finally{__CLR4_4_1xj0xj0lb90pa1b.R.flushNeeded();}}

    /** {@inheritDoc}
     *
     * @deprecated As of 3.1. Please use
     * {@link #optimize(int,MultivariateVectorFunction,OptimizationData[])}
     * instead.
     */
    @Deprecated
    public PointVectorValuePair optimize(int maxEval, FUNC f, double[] t, double[] w,
                                         double[] startPoint) {try{__CLR4_4_1xj0xj0lb90pa1b.R.inc(43467);
        __CLR4_4_1xj0xj0lb90pa1b.R.inc(43468);return optimizeInternal(maxEval, f, t, w, startPoint);
    }finally{__CLR4_4_1xj0xj0lb90pa1b.R.flushNeeded();}}

    /**
     * Optimize an objective function.
     *
     * @param maxEval Allowed number of evaluations of the objective function.
     * @param f Objective function.
     * @param optData Optimization data. The following data will be looked for:
     * <ul>
     *  <li>{@link Target}</li>
     *  <li>{@link Weight}</li>
     *  <li>{@link InitialGuess}</li>
     * </ul>
     * @return the point/value pair giving the optimal value of the objective
     * function.
     * @throws TooManyEvaluationsException if the maximal number of
     * evaluations is exceeded.
     * @throws DimensionMismatchException if the initial guess, target, and weight
     * arguments have inconsistent dimensions.
     *
     * @since 3.1
     */
    protected PointVectorValuePair optimize(int maxEval,
                                            FUNC f,
                                            OptimizationData... optData)
        throws TooManyEvaluationsException,
               DimensionMismatchException {try{__CLR4_4_1xj0xj0lb90pa1b.R.inc(43469);
        __CLR4_4_1xj0xj0lb90pa1b.R.inc(43470);return optimizeInternal(maxEval, f, optData);
    }finally{__CLR4_4_1xj0xj0lb90pa1b.R.flushNeeded();}}

    /**
     * Optimize an objective function.
     * Optimization is considered to be a weighted least-squares minimization.
     * The cost function to be minimized is
     * <code>&sum;weight<sub>i</sub>(objective<sub>i</sub> - target<sub>i</sub>)<sup>2</sup></code>
     *
     * @param f Objective function.
     * @param t Target value for the objective functions at optimum.
     * @param w Weights for the least squares cost computation.
     * @param startPoint Start point for optimization.
     * @return the point/value pair giving the optimal value for objective
     * function.
     * @param maxEval Maximum number of function evaluations.
     * @throws org.apache.commons.math3.exception.DimensionMismatchException
     * if the start point dimension is wrong.
     * @throws org.apache.commons.math3.exception.TooManyEvaluationsException
     * if the maximal number of evaluations is exceeded.
     * @throws org.apache.commons.math3.exception.NullArgumentException if
     * any argument is {@code null}.
     * @deprecated As of 3.1. Please use
     * {@link #optimizeInternal(int,MultivariateVectorFunction,OptimizationData[])}
     * instead.
     */
    @Deprecated
    protected PointVectorValuePair optimizeInternal(final int maxEval, final FUNC f,
                                                    final double[] t, final double[] w,
                                                    final double[] startPoint) {try{__CLR4_4_1xj0xj0lb90pa1b.R.inc(43471);
        // Checks.
        __CLR4_4_1xj0xj0lb90pa1b.R.inc(43472);if ((((f == null)&&(__CLR4_4_1xj0xj0lb90pa1b.R.iget(43473)!=0|true))||(__CLR4_4_1xj0xj0lb90pa1b.R.iget(43474)==0&false))) {{
            __CLR4_4_1xj0xj0lb90pa1b.R.inc(43475);throw new NullArgumentException();
        }
        }__CLR4_4_1xj0xj0lb90pa1b.R.inc(43476);if ((((t == null)&&(__CLR4_4_1xj0xj0lb90pa1b.R.iget(43477)!=0|true))||(__CLR4_4_1xj0xj0lb90pa1b.R.iget(43478)==0&false))) {{
            __CLR4_4_1xj0xj0lb90pa1b.R.inc(43479);throw new NullArgumentException();
        }
        }__CLR4_4_1xj0xj0lb90pa1b.R.inc(43480);if ((((w == null)&&(__CLR4_4_1xj0xj0lb90pa1b.R.iget(43481)!=0|true))||(__CLR4_4_1xj0xj0lb90pa1b.R.iget(43482)==0&false))) {{
            __CLR4_4_1xj0xj0lb90pa1b.R.inc(43483);throw new NullArgumentException();
        }
        }__CLR4_4_1xj0xj0lb90pa1b.R.inc(43484);if ((((startPoint == null)&&(__CLR4_4_1xj0xj0lb90pa1b.R.iget(43485)!=0|true))||(__CLR4_4_1xj0xj0lb90pa1b.R.iget(43486)==0&false))) {{
            __CLR4_4_1xj0xj0lb90pa1b.R.inc(43487);throw new NullArgumentException();
        }
        }__CLR4_4_1xj0xj0lb90pa1b.R.inc(43488);if ((((t.length != w.length)&&(__CLR4_4_1xj0xj0lb90pa1b.R.iget(43489)!=0|true))||(__CLR4_4_1xj0xj0lb90pa1b.R.iget(43490)==0&false))) {{
            __CLR4_4_1xj0xj0lb90pa1b.R.inc(43491);throw new DimensionMismatchException(t.length, w.length);
        }

        }__CLR4_4_1xj0xj0lb90pa1b.R.inc(43492);return optimizeInternal(maxEval, f,
                                new Target(t),
                                new Weight(w),
                                new InitialGuess(startPoint));
    }finally{__CLR4_4_1xj0xj0lb90pa1b.R.flushNeeded();}}

    /**
     * Optimize an objective function.
     *
     * @param maxEval Allowed number of evaluations of the objective function.
     * @param f Objective function.
     * @param optData Optimization data. The following data will be looked for:
     * <ul>
     *  <li>{@link Target}</li>
     *  <li>{@link Weight}</li>
     *  <li>{@link InitialGuess}</li>
     * </ul>
     * @return the point/value pair giving the optimal value of the objective
     * function.
     * @throws TooManyEvaluationsException if the maximal number of
     * evaluations is exceeded.
     * @throws DimensionMismatchException if the initial guess, target, and weight
     * arguments have inconsistent dimensions.
     *
     * @since 3.1
     */
    protected PointVectorValuePair optimizeInternal(int maxEval,
                                                    FUNC f,
                                                    OptimizationData... optData)
        throws TooManyEvaluationsException,
               DimensionMismatchException {try{__CLR4_4_1xj0xj0lb90pa1b.R.inc(43493);
        // Set internal state.
        __CLR4_4_1xj0xj0lb90pa1b.R.inc(43494);evaluations.setMaximalCount(maxEval);
        __CLR4_4_1xj0xj0lb90pa1b.R.inc(43495);evaluations.resetCount();
        __CLR4_4_1xj0xj0lb90pa1b.R.inc(43496);function = f;
        // Retrieve other settings.
        __CLR4_4_1xj0xj0lb90pa1b.R.inc(43497);parseOptimizationData(optData);
        // Check input consistency.
        __CLR4_4_1xj0xj0lb90pa1b.R.inc(43498);checkParameters();
        // Allow subclasses to reset their own internal state.
        __CLR4_4_1xj0xj0lb90pa1b.R.inc(43499);setUp();
        // Perform computation.
        __CLR4_4_1xj0xj0lb90pa1b.R.inc(43500);return doOptimize();
    }finally{__CLR4_4_1xj0xj0lb90pa1b.R.flushNeeded();}}

    /**
     * Gets the initial values of the optimized parameters.
     *
     * @return the initial guess.
     */
    public double[] getStartPoint() {try{__CLR4_4_1xj0xj0lb90pa1b.R.inc(43501);
        __CLR4_4_1xj0xj0lb90pa1b.R.inc(43502);return start.clone();
    }finally{__CLR4_4_1xj0xj0lb90pa1b.R.flushNeeded();}}

    /**
     * Gets the weight matrix of the observations.
     *
     * @return the weight matrix.
     * @since 3.1
     */
    public RealMatrix getWeight() {try{__CLR4_4_1xj0xj0lb90pa1b.R.inc(43503);
        __CLR4_4_1xj0xj0lb90pa1b.R.inc(43504);return weightMatrix.copy();
    }finally{__CLR4_4_1xj0xj0lb90pa1b.R.flushNeeded();}}
    /**
     * Gets the observed values to be matched by the objective vector
     * function.
     *
     * @return the target values.
     * @since 3.1
     */
    public double[] getTarget() {try{__CLR4_4_1xj0xj0lb90pa1b.R.inc(43505);
        __CLR4_4_1xj0xj0lb90pa1b.R.inc(43506);return target.clone();
    }finally{__CLR4_4_1xj0xj0lb90pa1b.R.flushNeeded();}}

    /**
     * Gets the objective vector function.
     * Note that this access bypasses the evaluation counter.
     *
     * @return the objective vector function.
     * @since 3.1
     */
    protected FUNC getObjectiveFunction() {try{__CLR4_4_1xj0xj0lb90pa1b.R.inc(43507);
        __CLR4_4_1xj0xj0lb90pa1b.R.inc(43508);return function;
    }finally{__CLR4_4_1xj0xj0lb90pa1b.R.flushNeeded();}}

    /**
     * Perform the bulk of the optimization algorithm.
     *
     * @return the point/value pair giving the optimal value for the
     * objective function.
     */
    protected abstract PointVectorValuePair doOptimize();

    /**
     * @return a reference to the {@link #target array}.
     * @deprecated As of 3.1.
     */
    @Deprecated
    protected double[] getTargetRef() {try{__CLR4_4_1xj0xj0lb90pa1b.R.inc(43509);
        __CLR4_4_1xj0xj0lb90pa1b.R.inc(43510);return target;
    }finally{__CLR4_4_1xj0xj0lb90pa1b.R.flushNeeded();}}
    /**
     * @return a reference to the {@link #weight array}.
     * @deprecated As of 3.1.
     */
    @Deprecated
    protected double[] getWeightRef() {try{__CLR4_4_1xj0xj0lb90pa1b.R.inc(43511);
        __CLR4_4_1xj0xj0lb90pa1b.R.inc(43512);return weight;
    }finally{__CLR4_4_1xj0xj0lb90pa1b.R.flushNeeded();}}

    /**
     * Method which a subclass <em>must</em> override whenever its internal
     * state depend on the {@link OptimizationData input} parsed by this base
     * class.
     * It will be called after the parsing step performed in the
     * {@link #optimize(int,MultivariateVectorFunction,OptimizationData[])
     * optimize} method and just before {@link #doOptimize()}.
     *
     * @since 3.1
     */
    protected void setUp() {try{__CLR4_4_1xj0xj0lb90pa1b.R.inc(43513);
        // XXX Temporary code until the new internal data is used everywhere.
        __CLR4_4_1xj0xj0lb90pa1b.R.inc(43514);final int dim = target.length;
        __CLR4_4_1xj0xj0lb90pa1b.R.inc(43515);weight = new double[dim];
        __CLR4_4_1xj0xj0lb90pa1b.R.inc(43516);for (int i = 0; (((i < dim)&&(__CLR4_4_1xj0xj0lb90pa1b.R.iget(43517)!=0|true))||(__CLR4_4_1xj0xj0lb90pa1b.R.iget(43518)==0&false)); i++) {{
            __CLR4_4_1xj0xj0lb90pa1b.R.inc(43519);weight[i] = weightMatrix.getEntry(i, i);
        }
    }}finally{__CLR4_4_1xj0xj0lb90pa1b.R.flushNeeded();}}

    /**
     * Scans the list of (required and optional) optimization data that
     * characterize the problem.
     *
     * @param optData Optimization data. The following data will be looked for:
     * <ul>
     *  <li>{@link Target}</li>
     *  <li>{@link Weight}</li>
     *  <li>{@link InitialGuess}</li>
     * </ul>
     */
    private void parseOptimizationData(OptimizationData... optData) {try{__CLR4_4_1xj0xj0lb90pa1b.R.inc(43520);
        // The existing values (as set by the previous call) are reused if
        // not provided in the argument list.
        __CLR4_4_1xj0xj0lb90pa1b.R.inc(43521);for (OptimizationData data : optData) {{
            __CLR4_4_1xj0xj0lb90pa1b.R.inc(43522);if ((((data instanceof Target)&&(__CLR4_4_1xj0xj0lb90pa1b.R.iget(43523)!=0|true))||(__CLR4_4_1xj0xj0lb90pa1b.R.iget(43524)==0&false))) {{
                __CLR4_4_1xj0xj0lb90pa1b.R.inc(43525);target = ((Target) data).getTarget();
                __CLR4_4_1xj0xj0lb90pa1b.R.inc(43526);continue;
            }
            }__CLR4_4_1xj0xj0lb90pa1b.R.inc(43527);if ((((data instanceof Weight)&&(__CLR4_4_1xj0xj0lb90pa1b.R.iget(43528)!=0|true))||(__CLR4_4_1xj0xj0lb90pa1b.R.iget(43529)==0&false))) {{
                __CLR4_4_1xj0xj0lb90pa1b.R.inc(43530);weightMatrix = ((Weight) data).getWeight();
                __CLR4_4_1xj0xj0lb90pa1b.R.inc(43531);continue;
            }
            }__CLR4_4_1xj0xj0lb90pa1b.R.inc(43532);if ((((data instanceof InitialGuess)&&(__CLR4_4_1xj0xj0lb90pa1b.R.iget(43533)!=0|true))||(__CLR4_4_1xj0xj0lb90pa1b.R.iget(43534)==0&false))) {{
                __CLR4_4_1xj0xj0lb90pa1b.R.inc(43535);start = ((InitialGuess) data).getInitialGuess();
                __CLR4_4_1xj0xj0lb90pa1b.R.inc(43536);continue;
            }
        }}
    }}finally{__CLR4_4_1xj0xj0lb90pa1b.R.flushNeeded();}}

    /**
     * Check parameters consistency.
     *
     * @throws DimensionMismatchException if {@link #target} and
     * {@link #weightMatrix} have inconsistent dimensions.
     */
    private void checkParameters() {try{__CLR4_4_1xj0xj0lb90pa1b.R.inc(43537);
        __CLR4_4_1xj0xj0lb90pa1b.R.inc(43538);if ((((target.length != weightMatrix.getColumnDimension())&&(__CLR4_4_1xj0xj0lb90pa1b.R.iget(43539)!=0|true))||(__CLR4_4_1xj0xj0lb90pa1b.R.iget(43540)==0&false))) {{
            __CLR4_4_1xj0xj0lb90pa1b.R.inc(43541);throw new DimensionMismatchException(target.length,
                                                 weightMatrix.getColumnDimension());
        }
    }}finally{__CLR4_4_1xj0xj0lb90pa1b.R.flushNeeded();}}
}
