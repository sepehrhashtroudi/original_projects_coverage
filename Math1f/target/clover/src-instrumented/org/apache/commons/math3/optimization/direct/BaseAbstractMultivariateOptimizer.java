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
import org.apache.commons.math3.analysis.MultivariateFunction;
import org.apache.commons.math3.optimization.BaseMultivariateOptimizer;
import org.apache.commons.math3.optimization.OptimizationData;
import org.apache.commons.math3.optimization.GoalType;
import org.apache.commons.math3.optimization.InitialGuess;
import org.apache.commons.math3.optimization.SimpleBounds;
import org.apache.commons.math3.optimization.ConvergenceChecker;
import org.apache.commons.math3.optimization.PointValuePair;
import org.apache.commons.math3.optimization.SimpleValueChecker;
import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.exception.NumberIsTooSmallException;
import org.apache.commons.math3.exception.NumberIsTooLargeException;

/**
 * Base class for implementing optimizers for multivariate scalar functions.
 * This base class handles the boiler-plate methods associated to thresholds,
 * evaluations counting, initial guess and simple bounds settings.
 *
 * @param <FUNC> Type of the objective function to be optimized.
 *
 * @version $Id$
 * @deprecated As of 3.1 (to be removed in 4.0).
 * @since 2.2
 */
@Deprecated
public abstract class BaseAbstractMultivariateOptimizer<FUNC extends MultivariateFunction>
    implements BaseMultivariateOptimizer<FUNC> {public static class __CLR4_4_1xfrxfrlb90pa11{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,43445,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /** Evaluations counter. */
    protected final Incrementor evaluations = new Incrementor();
    /** Convergence checker. */
    private ConvergenceChecker<PointValuePair> checker;
    /** Type of optimization. */
    private GoalType goal;
    /** Initial guess. */
    private double[] start;
    /** Lower bounds. */
    private double[] lowerBound;
    /** Upper bounds. */
    private double[] upperBound;
    /** Objective function. */
    private MultivariateFunction function;

    /**
     * Simple constructor with default settings.
     * The convergence check is set to a {@link SimpleValueChecker}.
     * @deprecated See {@link SimpleValueChecker#SimpleValueChecker()}
     */
    @Deprecated
    protected BaseAbstractMultivariateOptimizer() {
        this(new SimpleValueChecker());__CLR4_4_1xfrxfrlb90pa11.R.inc(43336);try{__CLR4_4_1xfrxfrlb90pa11.R.inc(43335);
    }finally{__CLR4_4_1xfrxfrlb90pa11.R.flushNeeded();}}
    /**
     * @param checker Convergence checker.
     */
    protected BaseAbstractMultivariateOptimizer(ConvergenceChecker<PointValuePair> checker) {try{__CLR4_4_1xfrxfrlb90pa11.R.inc(43337);
        __CLR4_4_1xfrxfrlb90pa11.R.inc(43338);this.checker = checker;
    }finally{__CLR4_4_1xfrxfrlb90pa11.R.flushNeeded();}}

    /** {@inheritDoc} */
    public int getMaxEvaluations() {try{__CLR4_4_1xfrxfrlb90pa11.R.inc(43339);
        __CLR4_4_1xfrxfrlb90pa11.R.inc(43340);return evaluations.getMaximalCount();
    }finally{__CLR4_4_1xfrxfrlb90pa11.R.flushNeeded();}}

    /** {@inheritDoc} */
    public int getEvaluations() {try{__CLR4_4_1xfrxfrlb90pa11.R.inc(43341);
        __CLR4_4_1xfrxfrlb90pa11.R.inc(43342);return evaluations.getCount();
    }finally{__CLR4_4_1xfrxfrlb90pa11.R.flushNeeded();}}

    /** {@inheritDoc} */
    public ConvergenceChecker<PointValuePair> getConvergenceChecker() {try{__CLR4_4_1xfrxfrlb90pa11.R.inc(43343);
        __CLR4_4_1xfrxfrlb90pa11.R.inc(43344);return checker;
    }finally{__CLR4_4_1xfrxfrlb90pa11.R.flushNeeded();}}

    /**
     * Compute the objective function value.
     *
     * @param point Point at which the objective function must be evaluated.
     * @return the objective function value at the specified point.
     * @throws TooManyEvaluationsException if the maximal number of
     * evaluations is exceeded.
     */
    protected double computeObjectiveValue(double[] point) {try{__CLR4_4_1xfrxfrlb90pa11.R.inc(43345);
        __CLR4_4_1xfrxfrlb90pa11.R.inc(43346);try {
            __CLR4_4_1xfrxfrlb90pa11.R.inc(43347);evaluations.incrementCount();
        } catch (MaxCountExceededException e) {
            __CLR4_4_1xfrxfrlb90pa11.R.inc(43348);throw new TooManyEvaluationsException(e.getMax());
        }
        __CLR4_4_1xfrxfrlb90pa11.R.inc(43349);return function.value(point);
    }finally{__CLR4_4_1xfrxfrlb90pa11.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     *
     * @deprecated As of 3.1. Please use
     * {@link #optimize(int,MultivariateFunction,GoalType,OptimizationData[])}
     * instead.
     */
    @Deprecated
    public PointValuePair optimize(int maxEval, FUNC f, GoalType goalType,
                                   double[] startPoint) {try{__CLR4_4_1xfrxfrlb90pa11.R.inc(43350);
        __CLR4_4_1xfrxfrlb90pa11.R.inc(43351);return optimizeInternal(maxEval, f, goalType, new InitialGuess(startPoint));
    }finally{__CLR4_4_1xfrxfrlb90pa11.R.flushNeeded();}}

    /**
     * Optimize an objective function.
     *
     * @param maxEval Allowed number of evaluations of the objective function.
     * @param f Objective function.
     * @param goalType Optimization type.
     * @param optData Optimization data. The following data will be looked for:
     * <ul>
     *  <li>{@link InitialGuess}</li>
     *  <li>{@link SimpleBounds}</li>
     * </ul>
     * @return the point/value pair giving the optimal value of the objective
     * function.
     * @since 3.1
     */
    public PointValuePair optimize(int maxEval,
                                   FUNC f,
                                   GoalType goalType,
                                   OptimizationData... optData) {try{__CLR4_4_1xfrxfrlb90pa11.R.inc(43352);
        __CLR4_4_1xfrxfrlb90pa11.R.inc(43353);return optimizeInternal(maxEval, f, goalType, optData);
    }finally{__CLR4_4_1xfrxfrlb90pa11.R.flushNeeded();}}

    /**
     * Optimize an objective function.
     *
     * @param f Objective function.
     * @param goalType Type of optimization goal: either
     * {@link GoalType#MAXIMIZE} or {@link GoalType#MINIMIZE}.
     * @param startPoint Start point for optimization.
     * @param maxEval Maximum number of function evaluations.
     * @return the point/value pair giving the optimal value for objective
     * function.
     * @throws org.apache.commons.math3.exception.DimensionMismatchException
     * if the start point dimension is wrong.
     * @throws org.apache.commons.math3.exception.TooManyEvaluationsException
     * if the maximal number of evaluations is exceeded.
     * @throws org.apache.commons.math3.exception.NullArgumentException if
     * any argument is {@code null}.
     * @deprecated As of 3.1. Please use
     * {@link #optimize(int,MultivariateFunction,GoalType,OptimizationData[])}
     * instead.
     */
    @Deprecated
    protected PointValuePair optimizeInternal(int maxEval, FUNC f, GoalType goalType,
                                              double[] startPoint) {try{__CLR4_4_1xfrxfrlb90pa11.R.inc(43354);
        __CLR4_4_1xfrxfrlb90pa11.R.inc(43355);return optimizeInternal(maxEval, f, goalType, new InitialGuess(startPoint));
    }finally{__CLR4_4_1xfrxfrlb90pa11.R.flushNeeded();}}

    /**
     * Optimize an objective function.
     *
     * @param maxEval Allowed number of evaluations of the objective function.
     * @param f Objective function.
     * @param goalType Optimization type.
     * @param optData Optimization data. The following data will be looked for:
     * <ul>
     *  <li>{@link InitialGuess}</li>
     *  <li>{@link SimpleBounds}</li>
     * </ul>
     * @return the point/value pair giving the optimal value of the objective
     * function.
     * @throws TooManyEvaluationsException if the maximal number of
     * evaluations is exceeded.
     * @since 3.1
     */
    protected PointValuePair optimizeInternal(int maxEval,
                                              FUNC f,
                                              GoalType goalType,
                                              OptimizationData... optData)
        throws TooManyEvaluationsException {try{__CLR4_4_1xfrxfrlb90pa11.R.inc(43356);
        // Set internal state.
        __CLR4_4_1xfrxfrlb90pa11.R.inc(43357);evaluations.setMaximalCount(maxEval);
        __CLR4_4_1xfrxfrlb90pa11.R.inc(43358);evaluations.resetCount();
        __CLR4_4_1xfrxfrlb90pa11.R.inc(43359);function = f;
        __CLR4_4_1xfrxfrlb90pa11.R.inc(43360);goal = goalType;
        // Retrieve other settings.
        __CLR4_4_1xfrxfrlb90pa11.R.inc(43361);parseOptimizationData(optData);
        // Check input consistency.
        __CLR4_4_1xfrxfrlb90pa11.R.inc(43362);checkParameters();
        // Perform computation.
        __CLR4_4_1xfrxfrlb90pa11.R.inc(43363);return doOptimize();
    }finally{__CLR4_4_1xfrxfrlb90pa11.R.flushNeeded();}}

    /**
     * Scans the list of (required and optional) optimization data that
     * characterize the problem.
     *
     * @param optData Optimization data. The following data will be looked for:
     * <ul>
     *  <li>{@link InitialGuess}</li>
     *  <li>{@link SimpleBounds}</li>
     * </ul>
     */
    private void parseOptimizationData(OptimizationData... optData) {try{__CLR4_4_1xfrxfrlb90pa11.R.inc(43364);
        // The existing values (as set by the previous call) are reused if
        // not provided in the argument list.
        __CLR4_4_1xfrxfrlb90pa11.R.inc(43365);for (OptimizationData data : optData) {{
            __CLR4_4_1xfrxfrlb90pa11.R.inc(43366);if ((((data instanceof InitialGuess)&&(__CLR4_4_1xfrxfrlb90pa11.R.iget(43367)!=0|true))||(__CLR4_4_1xfrxfrlb90pa11.R.iget(43368)==0&false))) {{
                __CLR4_4_1xfrxfrlb90pa11.R.inc(43369);start = ((InitialGuess) data).getInitialGuess();
                __CLR4_4_1xfrxfrlb90pa11.R.inc(43370);continue;
            }
            }__CLR4_4_1xfrxfrlb90pa11.R.inc(43371);if ((((data instanceof SimpleBounds)&&(__CLR4_4_1xfrxfrlb90pa11.R.iget(43372)!=0|true))||(__CLR4_4_1xfrxfrlb90pa11.R.iget(43373)==0&false))) {{
                __CLR4_4_1xfrxfrlb90pa11.R.inc(43374);final SimpleBounds bounds = (SimpleBounds) data;
                __CLR4_4_1xfrxfrlb90pa11.R.inc(43375);lowerBound = bounds.getLower();
                __CLR4_4_1xfrxfrlb90pa11.R.inc(43376);upperBound = bounds.getUpper();
                __CLR4_4_1xfrxfrlb90pa11.R.inc(43377);continue;
            }
        }}
    }}finally{__CLR4_4_1xfrxfrlb90pa11.R.flushNeeded();}}

    /**
     * @return the optimization type.
     */
    public GoalType getGoalType() {try{__CLR4_4_1xfrxfrlb90pa11.R.inc(43378);
        __CLR4_4_1xfrxfrlb90pa11.R.inc(43379);return goal;
    }finally{__CLR4_4_1xfrxfrlb90pa11.R.flushNeeded();}}

    /**
     * @return the initial guess.
     */
    public double[] getStartPoint() {try{__CLR4_4_1xfrxfrlb90pa11.R.inc(43380);
        __CLR4_4_1xfrxfrlb90pa11.R.inc(43381);return (((start == null )&&(__CLR4_4_1xfrxfrlb90pa11.R.iget(43382)!=0|true))||(__CLR4_4_1xfrxfrlb90pa11.R.iget(43383)==0&false))? null : start.clone();
    }finally{__CLR4_4_1xfrxfrlb90pa11.R.flushNeeded();}}
    /**
     * @return the lower bounds.
     * @since 3.1
     */
    public double[] getLowerBound() {try{__CLR4_4_1xfrxfrlb90pa11.R.inc(43384);
        __CLR4_4_1xfrxfrlb90pa11.R.inc(43385);return (((lowerBound == null )&&(__CLR4_4_1xfrxfrlb90pa11.R.iget(43386)!=0|true))||(__CLR4_4_1xfrxfrlb90pa11.R.iget(43387)==0&false))? null : lowerBound.clone();
    }finally{__CLR4_4_1xfrxfrlb90pa11.R.flushNeeded();}}
    /**
     * @return the upper bounds.
     * @since 3.1
     */
    public double[] getUpperBound() {try{__CLR4_4_1xfrxfrlb90pa11.R.inc(43388);
        __CLR4_4_1xfrxfrlb90pa11.R.inc(43389);return (((upperBound == null )&&(__CLR4_4_1xfrxfrlb90pa11.R.iget(43390)!=0|true))||(__CLR4_4_1xfrxfrlb90pa11.R.iget(43391)==0&false))? null : upperBound.clone();
    }finally{__CLR4_4_1xfrxfrlb90pa11.R.flushNeeded();}}

    /**
     * Perform the bulk of the optimization algorithm.
     *
     * @return the point/value pair giving the optimal value of the
     * objective function.
     */
    protected abstract PointValuePair doOptimize();

    /**
     * Check parameters consistency.
     */
    private void checkParameters() {try{__CLR4_4_1xfrxfrlb90pa11.R.inc(43392);
        __CLR4_4_1xfrxfrlb90pa11.R.inc(43393);if ((((start != null)&&(__CLR4_4_1xfrxfrlb90pa11.R.iget(43394)!=0|true))||(__CLR4_4_1xfrxfrlb90pa11.R.iget(43395)==0&false))) {{
            __CLR4_4_1xfrxfrlb90pa11.R.inc(43396);final int dim = start.length;
            __CLR4_4_1xfrxfrlb90pa11.R.inc(43397);if ((((lowerBound != null)&&(__CLR4_4_1xfrxfrlb90pa11.R.iget(43398)!=0|true))||(__CLR4_4_1xfrxfrlb90pa11.R.iget(43399)==0&false))) {{
                __CLR4_4_1xfrxfrlb90pa11.R.inc(43400);if ((((lowerBound.length != dim)&&(__CLR4_4_1xfrxfrlb90pa11.R.iget(43401)!=0|true))||(__CLR4_4_1xfrxfrlb90pa11.R.iget(43402)==0&false))) {{
                    __CLR4_4_1xfrxfrlb90pa11.R.inc(43403);throw new DimensionMismatchException(lowerBound.length, dim);
                }
                }__CLR4_4_1xfrxfrlb90pa11.R.inc(43404);for (int i = 0; (((i < dim)&&(__CLR4_4_1xfrxfrlb90pa11.R.iget(43405)!=0|true))||(__CLR4_4_1xfrxfrlb90pa11.R.iget(43406)==0&false)); i++) {{
                    __CLR4_4_1xfrxfrlb90pa11.R.inc(43407);final double v = start[i];
                    __CLR4_4_1xfrxfrlb90pa11.R.inc(43408);final double lo = lowerBound[i];
                    __CLR4_4_1xfrxfrlb90pa11.R.inc(43409);if ((((v < lo)&&(__CLR4_4_1xfrxfrlb90pa11.R.iget(43410)!=0|true))||(__CLR4_4_1xfrxfrlb90pa11.R.iget(43411)==0&false))) {{
                        __CLR4_4_1xfrxfrlb90pa11.R.inc(43412);throw new NumberIsTooSmallException(v, lo, true);
                    }
                }}
            }}
            }__CLR4_4_1xfrxfrlb90pa11.R.inc(43413);if ((((upperBound != null)&&(__CLR4_4_1xfrxfrlb90pa11.R.iget(43414)!=0|true))||(__CLR4_4_1xfrxfrlb90pa11.R.iget(43415)==0&false))) {{
                __CLR4_4_1xfrxfrlb90pa11.R.inc(43416);if ((((upperBound.length != dim)&&(__CLR4_4_1xfrxfrlb90pa11.R.iget(43417)!=0|true))||(__CLR4_4_1xfrxfrlb90pa11.R.iget(43418)==0&false))) {{
                    __CLR4_4_1xfrxfrlb90pa11.R.inc(43419);throw new DimensionMismatchException(upperBound.length, dim);
                }
                }__CLR4_4_1xfrxfrlb90pa11.R.inc(43420);for (int i = 0; (((i < dim)&&(__CLR4_4_1xfrxfrlb90pa11.R.iget(43421)!=0|true))||(__CLR4_4_1xfrxfrlb90pa11.R.iget(43422)==0&false)); i++) {{
                    __CLR4_4_1xfrxfrlb90pa11.R.inc(43423);final double v = start[i];
                    __CLR4_4_1xfrxfrlb90pa11.R.inc(43424);final double hi = upperBound[i];
                    __CLR4_4_1xfrxfrlb90pa11.R.inc(43425);if ((((v > hi)&&(__CLR4_4_1xfrxfrlb90pa11.R.iget(43426)!=0|true))||(__CLR4_4_1xfrxfrlb90pa11.R.iget(43427)==0&false))) {{
                        __CLR4_4_1xfrxfrlb90pa11.R.inc(43428);throw new NumberIsTooLargeException(v, hi, true);
                    }
                }}
            }}

            // If the bounds were not specified, the allowed interval is
            // assumed to be [-inf, +inf].
            }__CLR4_4_1xfrxfrlb90pa11.R.inc(43429);if ((((lowerBound == null)&&(__CLR4_4_1xfrxfrlb90pa11.R.iget(43430)!=0|true))||(__CLR4_4_1xfrxfrlb90pa11.R.iget(43431)==0&false))) {{
                __CLR4_4_1xfrxfrlb90pa11.R.inc(43432);lowerBound = new double[dim];
                __CLR4_4_1xfrxfrlb90pa11.R.inc(43433);for (int i = 0; (((i < dim)&&(__CLR4_4_1xfrxfrlb90pa11.R.iget(43434)!=0|true))||(__CLR4_4_1xfrxfrlb90pa11.R.iget(43435)==0&false)); i++) {{
                    __CLR4_4_1xfrxfrlb90pa11.R.inc(43436);lowerBound[i] = Double.NEGATIVE_INFINITY;
                }
            }}
            }__CLR4_4_1xfrxfrlb90pa11.R.inc(43437);if ((((upperBound == null)&&(__CLR4_4_1xfrxfrlb90pa11.R.iget(43438)!=0|true))||(__CLR4_4_1xfrxfrlb90pa11.R.iget(43439)==0&false))) {{
                __CLR4_4_1xfrxfrlb90pa11.R.inc(43440);upperBound = new double[dim];
                __CLR4_4_1xfrxfrlb90pa11.R.inc(43441);for (int i = 0; (((i < dim)&&(__CLR4_4_1xfrxfrlb90pa11.R.iget(43442)!=0|true))||(__CLR4_4_1xfrxfrlb90pa11.R.iget(43443)==0&false)); i++) {{
                    __CLR4_4_1xfrxfrlb90pa11.R.inc(43444);upperBound[i] = Double.POSITIVE_INFINITY;
                }
            }}
        }}
    }}finally{__CLR4_4_1xfrxfrlb90pa11.R.flushNeeded();}}
}
