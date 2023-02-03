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

package org.apache.commons.math3.optim.nonlinear.scalar.noderiv;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.exception.NotPositiveException;
import org.apache.commons.math3.exception.NotStrictlyPositiveException;
import org.apache.commons.math3.exception.OutOfRangeException;
import org.apache.commons.math3.exception.TooManyEvaluationsException;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.EigenDecomposition;
import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.optim.ConvergenceChecker;
import org.apache.commons.math3.optim.OptimizationData;
import org.apache.commons.math3.optim.nonlinear.scalar.GoalType;
import org.apache.commons.math3.optim.PointValuePair;
import org.apache.commons.math3.optim.nonlinear.scalar.MultivariateOptimizer;
import org.apache.commons.math3.random.RandomGenerator;
import org.apache.commons.math3.util.MathArrays;

/**
 * <p>An implementation of the active Covariance Matrix Adaptation Evolution Strategy (CMA-ES)
 * for non-linear, non-convex, non-smooth, global function minimization.
 * The CMA-Evolution Strategy (CMA-ES) is a reliable stochastic optimization method
 * which should be applied if derivative-based methods, e.g. quasi-Newton BFGS or
 * conjugate gradient, fail due to a rugged search landscape (e.g. noise, local
 * optima, outlier, etc.) of the objective function. Like a
 * quasi-Newton method, the CMA-ES learns and applies a variable metric
 * on the underlying search space. Unlike a quasi-Newton method, the
 * CMA-ES neither estimates nor uses gradients, making it considerably more
 * reliable in terms of finding a good, or even close to optimal, solution.</p>
 *
 * <p>In general, on smooth objective functions the CMA-ES is roughly ten times
 * slower than BFGS (counting objective function evaluations, no gradients provided).
 * For up to <math>N=10</math> variables also the derivative-free simplex
 * direct search method (Nelder and Mead) can be faster, but it is
 * far less reliable than CMA-ES.</p>
 *
 * <p>The CMA-ES is particularly well suited for non-separable
 * and/or badly conditioned problems. To observe the advantage of CMA compared
 * to a conventional evolution strategy, it will usually take about
 * <math>30 N</math> function evaluations. On difficult problems the complete
 * optimization (a single run) is expected to take <em>roughly</em> between
 * <math>30 N</math> and <math>300 N<sup>2</sup></math>
 * function evaluations.</p>
 *
 * <p>This implementation is translated and adapted from the Matlab version
 * of the CMA-ES algorithm as implemented in module {@code cmaes.m} version 3.51.</p>
 *
 * For more information, please refer to the following links:
 * <ul>
 *  <li><a href="http://www.lri.fr/~hansen/cmaes.m">Matlab code</a></li>
 *  <li><a href="http://www.lri.fr/~hansen/cmaesintro.html">Introduction to CMA-ES</a></li>
 *  <li><a href="http://en.wikipedia.org/wiki/CMA-ES">Wikipedia</a></li>
 * </ul>
 *
 * @version $Id$
 * @since 3.0
 */
public class CMAESOptimizer
    extends MultivariateOptimizer {public static class __CLR4_4_1tvrtvrlb90p9sz{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,39402,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    // global search parameters
    /**
     * Population size, offspring number. The primary strategy parameter to play
     * with, which can be increased from its default value. Increasing the
     * population size improves global search properties in exchange to speed.
     * Speed decreases, as a rule, at most linearly with increasing population
     * size. It is advisable to begin with the default small population size.
     */
    private int lambda; // population size
    /**
     * Covariance update mechanism, default is active CMA. isActiveCMA = true
     * turns on "active CMA" with a negative update of the covariance matrix and
     * checks for positive definiteness. OPTS.CMA.active = 2 does not check for
     * pos. def. and is numerically faster. Active CMA usually speeds up the
     * adaptation.
     */
    private final boolean isActiveCMA;
    /**
     * Determines how often a new random offspring is generated in case it is
     * not feasible / beyond the defined limits, default is 0.
     */
    private final int checkFeasableCount;
    /**
     * @see Sigma
     */
    private double[] inputSigma;
    /** Number of objective variables/problem dimension */
    private int dimension;
    /**
     * Defines the number of initial iterations, where the covariance matrix
     * remains diagonal and the algorithm has internally linear time complexity.
     * diagonalOnly = 1 means keeping the covariance matrix always diagonal and
     * this setting also exhibits linear space complexity. This can be
     * particularly useful for dimension > 100.
     * @see <a href="http://hal.archives-ouvertes.fr/inria-00287367/en">A Simple Modification in CMA-ES</a>
     */
    private int diagonalOnly;
    /** Number of objective variables/problem dimension */
    private boolean isMinimize = true;
    /** Indicates whether statistic data is collected. */
    private final boolean generateStatistics;

    // termination criteria
    /** Maximal number of iterations allowed. */
    private final int maxIterations;
    /** Limit for fitness value. */
    private final double stopFitness;
    /** Stop if x-changes larger stopTolUpX. */
    private double stopTolUpX;
    /** Stop if x-change smaller stopTolX. */
    private double stopTolX;
    /** Stop if fun-changes smaller stopTolFun. */
    private double stopTolFun;
    /** Stop if back fun-changes smaller stopTolHistFun. */
    private double stopTolHistFun;

    // selection strategy parameters
    /** Number of parents/points for recombination. */
    private int mu; //
    /** log(mu + 0.5), stored for efficiency. */
    private double logMu2;
    /** Array for weighted recombination. */
    private RealMatrix weights;
    /** Variance-effectiveness of sum w_i x_i. */
    private double mueff; //

    // dynamic strategy parameters and constants
    /** Overall standard deviation - search volume. */
    private double sigma;
    /** Cumulation constant. */
    private double cc;
    /** Cumulation constant for step-size. */
    private double cs;
    /** Damping for step-size. */
    private double damps;
    /** Learning rate for rank-one update. */
    private double ccov1;
    /** Learning rate for rank-mu update' */
    private double ccovmu;
    /** Expectation of ||N(0,I)|| == norm(randn(N,1)). */
    private double chiN;
    /** Learning rate for rank-one update - diagonalOnly */
    private double ccov1Sep;
    /** Learning rate for rank-mu update - diagonalOnly */
    private double ccovmuSep;

    // CMA internal values - updated each generation
    /** Objective variables. */
    private RealMatrix xmean;
    /** Evolution path. */
    private RealMatrix pc;
    /** Evolution path for sigma. */
    private RealMatrix ps;
    /** Norm of ps, stored for efficiency. */
    private double normps;
    /** Coordinate system. */
    private RealMatrix B;
    /** Scaling. */
    private RealMatrix D;
    /** B*D, stored for efficiency. */
    private RealMatrix BD;
    /** Diagonal of sqrt(D), stored for efficiency. */
    private RealMatrix diagD;
    /** Covariance matrix. */
    private RealMatrix C;
    /** Diagonal of C, used for diagonalOnly. */
    private RealMatrix diagC;
    /** Number of iterations already performed. */
    private int iterations;

    /** History queue of best values. */
    private double[] fitnessHistory;
    /** Size of history queue of best values. */
    private int historySize;

    /** Random generator. */
    private final RandomGenerator random;

    /** History of sigma values. */
    private final List<Double> statisticsSigmaHistory = new ArrayList<Double>();
    /** History of mean matrix. */
    private final List<RealMatrix> statisticsMeanHistory = new ArrayList<RealMatrix>();
    /** History of fitness values. */
    private final List<Double> statisticsFitnessHistory = new ArrayList<Double>();
    /** History of D matrix. */
    private final List<RealMatrix> statisticsDHistory = new ArrayList<RealMatrix>();

    /**
     * @param maxIterations Maximal number of iterations.
     * @param stopFitness Whether to stop if objective function value is smaller than
     * {@code stopFitness}.
     * @param isActiveCMA Chooses the covariance matrix update method.
     * @param diagonalOnly Number of initial iterations, where the covariance matrix
     * remains diagonal.
     * @param checkFeasableCount Determines how often new random objective variables are
     * generated in case they are out of bounds.
     * @param random Random generator.
     * @param generateStatistics Whether statistic data is collected.
     * @param checker Convergence checker.
     *
     * @since 3.1
     */
    public CMAESOptimizer(int maxIterations,
                          double stopFitness,
                          boolean isActiveCMA,
                          int diagonalOnly,
                          int checkFeasableCount,
                          RandomGenerator random,
                          boolean generateStatistics,
                          ConvergenceChecker<PointValuePair> checker) {
        super(checker);__CLR4_4_1tvrtvrlb90p9sz.R.inc(38728);try{__CLR4_4_1tvrtvrlb90p9sz.R.inc(38727);
        __CLR4_4_1tvrtvrlb90p9sz.R.inc(38729);this.maxIterations = maxIterations;
        __CLR4_4_1tvrtvrlb90p9sz.R.inc(38730);this.stopFitness = stopFitness;
        __CLR4_4_1tvrtvrlb90p9sz.R.inc(38731);this.isActiveCMA = isActiveCMA;
        __CLR4_4_1tvrtvrlb90p9sz.R.inc(38732);this.diagonalOnly = diagonalOnly;
        __CLR4_4_1tvrtvrlb90p9sz.R.inc(38733);this.checkFeasableCount = checkFeasableCount;
        __CLR4_4_1tvrtvrlb90p9sz.R.inc(38734);this.random = random;
        __CLR4_4_1tvrtvrlb90p9sz.R.inc(38735);this.generateStatistics = generateStatistics;
    }finally{__CLR4_4_1tvrtvrlb90p9sz.R.flushNeeded();}}

    /**
     * @return History of sigma values.
     */
    public List<Double> getStatisticsSigmaHistory() {try{__CLR4_4_1tvrtvrlb90p9sz.R.inc(38736);
        __CLR4_4_1tvrtvrlb90p9sz.R.inc(38737);return statisticsSigmaHistory;
    }finally{__CLR4_4_1tvrtvrlb90p9sz.R.flushNeeded();}}

    /**
     * @return History of mean matrix.
     */
    public List<RealMatrix> getStatisticsMeanHistory() {try{__CLR4_4_1tvrtvrlb90p9sz.R.inc(38738);
        __CLR4_4_1tvrtvrlb90p9sz.R.inc(38739);return statisticsMeanHistory;
    }finally{__CLR4_4_1tvrtvrlb90p9sz.R.flushNeeded();}}

    /**
     * @return History of fitness values.
     */
    public List<Double> getStatisticsFitnessHistory() {try{__CLR4_4_1tvrtvrlb90p9sz.R.inc(38740);
        __CLR4_4_1tvrtvrlb90p9sz.R.inc(38741);return statisticsFitnessHistory;
    }finally{__CLR4_4_1tvrtvrlb90p9sz.R.flushNeeded();}}

    /**
     * @return History of D matrix.
     */
    public List<RealMatrix> getStatisticsDHistory() {try{__CLR4_4_1tvrtvrlb90p9sz.R.inc(38742);
        __CLR4_4_1tvrtvrlb90p9sz.R.inc(38743);return statisticsDHistory;
    }finally{__CLR4_4_1tvrtvrlb90p9sz.R.flushNeeded();}}

    /**
     * Input sigma values.
     * They define the initial coordinate-wise standard deviations for
     * sampling new search points around the initial guess.
     * It is suggested to set them to the estimated distance from the
     * initial to the desired optimum.
     * Small values induce the search to be more local (and very small
     * values are more likely to find a local optimum close to the initial
     * guess).
     * Too small values might however lead to early termination.
     */
    public static class Sigma implements OptimizationData {
        /** Sigma values. */
        private final double[] sigma;

        /**
         * @param s Sigma values.
         * @throws NotPositiveException if any of the array entries is smaller
         * than zero.
         */
        public Sigma(double[] s)
            throws NotPositiveException {try{__CLR4_4_1tvrtvrlb90p9sz.R.inc(38744);
            __CLR4_4_1tvrtvrlb90p9sz.R.inc(38745);for (int i = 0; (((i < s.length)&&(__CLR4_4_1tvrtvrlb90p9sz.R.iget(38746)!=0|true))||(__CLR4_4_1tvrtvrlb90p9sz.R.iget(38747)==0&false)); i++) {{
                __CLR4_4_1tvrtvrlb90p9sz.R.inc(38748);if ((((s[i] < 0)&&(__CLR4_4_1tvrtvrlb90p9sz.R.iget(38749)!=0|true))||(__CLR4_4_1tvrtvrlb90p9sz.R.iget(38750)==0&false))) {{
                    __CLR4_4_1tvrtvrlb90p9sz.R.inc(38751);throw new NotPositiveException(s[i]);
                }
            }}

            }__CLR4_4_1tvrtvrlb90p9sz.R.inc(38752);sigma = s.clone();
        }finally{__CLR4_4_1tvrtvrlb90p9sz.R.flushNeeded();}}

        /**
         * @return the sigma values.
         */
        public double[] getSigma() {try{__CLR4_4_1tvrtvrlb90p9sz.R.inc(38753);
            __CLR4_4_1tvrtvrlb90p9sz.R.inc(38754);return sigma.clone();
        }finally{__CLR4_4_1tvrtvrlb90p9sz.R.flushNeeded();}}
    }

    /**
     * Population size.
     * The number of offspring is the primary strategy parameter.
     * In the absence of better clues, a good default could be an
     * integer close to {@code 4 + 3 ln(n)}, where {@code n} is the
     * number of optimized parameters.
     * Increasing the population size improves global search properties
     * at the expense of speed (which in general decreases at most
     * linearly with increasing population size).
     */
    public static class PopulationSize implements OptimizationData {
        /** Population size. */
        private final int lambda;

        /**
         * @param size Population size.
         * @throws NotStrictlyPositiveException if {@code size <= 0}.
         */
        public PopulationSize(int size)
            throws NotStrictlyPositiveException {try{__CLR4_4_1tvrtvrlb90p9sz.R.inc(38755);
            __CLR4_4_1tvrtvrlb90p9sz.R.inc(38756);if ((((size <= 0)&&(__CLR4_4_1tvrtvrlb90p9sz.R.iget(38757)!=0|true))||(__CLR4_4_1tvrtvrlb90p9sz.R.iget(38758)==0&false))) {{
                __CLR4_4_1tvrtvrlb90p9sz.R.inc(38759);throw new NotStrictlyPositiveException(size);
            }
            }__CLR4_4_1tvrtvrlb90p9sz.R.inc(38760);lambda = size;
        }finally{__CLR4_4_1tvrtvrlb90p9sz.R.flushNeeded();}}

        /**
         * @return the population size.
         */
        public int getPopulationSize() {try{__CLR4_4_1tvrtvrlb90p9sz.R.inc(38761);
            __CLR4_4_1tvrtvrlb90p9sz.R.inc(38762);return lambda;
        }finally{__CLR4_4_1tvrtvrlb90p9sz.R.flushNeeded();}}
    }

    /**
     * {@inheritDoc}
     *
     * @param optData Optimization data. In addition to those documented in
     * {@link MultivariateOptimizer#parseOptimizationData(OptimizationData[])
     * MultivariateOptimizer}, this method will register the following data:
     * <ul>
     *  <li>{@link Sigma}</li>
     *  <li>{@link PopulationSize}</li>
     * </ul>
     * @return {@inheritDoc}
     * @throws TooManyEvaluationsException if the maximal number of
     * evaluations is exceeded.
     * @throws DimensionMismatchException if the initial guess, target, and weight
     * arguments have inconsistent dimensions.
     */
    @Override
    public PointValuePair optimize(OptimizationData... optData)
        throws TooManyEvaluationsException,
               DimensionMismatchException {try{__CLR4_4_1tvrtvrlb90p9sz.R.inc(38763);
        // Set up base class and perform computation.
        __CLR4_4_1tvrtvrlb90p9sz.R.inc(38764);return super.optimize(optData);
    }finally{__CLR4_4_1tvrtvrlb90p9sz.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    protected PointValuePair doOptimize() {try{__CLR4_4_1tvrtvrlb90p9sz.R.inc(38765);
         // -------------------- Initialization --------------------------------
        __CLR4_4_1tvrtvrlb90p9sz.R.inc(38766);isMinimize = getGoalType().equals(GoalType.MINIMIZE);
        __CLR4_4_1tvrtvrlb90p9sz.R.inc(38767);final FitnessFunction fitfun = new FitnessFunction();
        __CLR4_4_1tvrtvrlb90p9sz.R.inc(38768);final double[] guess = getStartPoint();
        // number of objective variables/problem dimension
        __CLR4_4_1tvrtvrlb90p9sz.R.inc(38769);dimension = guess.length;
        __CLR4_4_1tvrtvrlb90p9sz.R.inc(38770);initializeCMA(guess);
        __CLR4_4_1tvrtvrlb90p9sz.R.inc(38771);iterations = 0;
        __CLR4_4_1tvrtvrlb90p9sz.R.inc(38772);double bestValue = fitfun.value(guess);
        __CLR4_4_1tvrtvrlb90p9sz.R.inc(38773);push(fitnessHistory, bestValue);
        __CLR4_4_1tvrtvrlb90p9sz.R.inc(38774);PointValuePair optimum
            = new PointValuePair(getStartPoint(),
                                 (((isMinimize )&&(__CLR4_4_1tvrtvrlb90p9sz.R.iget(38775)!=0|true))||(__CLR4_4_1tvrtvrlb90p9sz.R.iget(38776)==0&false))? bestValue : -bestValue);
        __CLR4_4_1tvrtvrlb90p9sz.R.inc(38777);PointValuePair lastResult = null;

        // -------------------- Generation Loop --------------------------------

        __CLR4_4_1tvrtvrlb90p9sz.R.inc(38778);generationLoop:
        for (iterations = 1; (((iterations <= maxIterations)&&(__CLR4_4_1tvrtvrlb90p9sz.R.iget(38779)!=0|true))||(__CLR4_4_1tvrtvrlb90p9sz.R.iget(38780)==0&false)); iterations++) {{
            __CLR4_4_1tvrtvrlb90p9sz.R.inc(38781);incrementIterationCount();

            // Generate and evaluate lambda offspring
            __CLR4_4_1tvrtvrlb90p9sz.R.inc(38782);final RealMatrix arz = randn1(dimension, lambda);
            __CLR4_4_1tvrtvrlb90p9sz.R.inc(38783);final RealMatrix arx = zeros(dimension, lambda);
            __CLR4_4_1tvrtvrlb90p9sz.R.inc(38784);final double[] fitness = new double[lambda];
            // generate random offspring
            __CLR4_4_1tvrtvrlb90p9sz.R.inc(38785);for (int k = 0; (((k < lambda)&&(__CLR4_4_1tvrtvrlb90p9sz.R.iget(38786)!=0|true))||(__CLR4_4_1tvrtvrlb90p9sz.R.iget(38787)==0&false)); k++) {{
                __CLR4_4_1tvrtvrlb90p9sz.R.inc(38788);RealMatrix arxk = null;
                __CLR4_4_1tvrtvrlb90p9sz.R.inc(38789);for (int i = 0; (((i < checkFeasableCount + 1)&&(__CLR4_4_1tvrtvrlb90p9sz.R.iget(38790)!=0|true))||(__CLR4_4_1tvrtvrlb90p9sz.R.iget(38791)==0&false)); i++) {{
                    __CLR4_4_1tvrtvrlb90p9sz.R.inc(38792);if ((((diagonalOnly <= 0)&&(__CLR4_4_1tvrtvrlb90p9sz.R.iget(38793)!=0|true))||(__CLR4_4_1tvrtvrlb90p9sz.R.iget(38794)==0&false))) {{
                        __CLR4_4_1tvrtvrlb90p9sz.R.inc(38795);arxk = xmean.add(BD.multiply(arz.getColumnMatrix(k))
                                         .scalarMultiply(sigma)); // m + sig * Normal(0,C)
                    } }else {{
                        __CLR4_4_1tvrtvrlb90p9sz.R.inc(38796);arxk = xmean.add(times(diagD,arz.getColumnMatrix(k))
                                         .scalarMultiply(sigma));
                    }
                    }__CLR4_4_1tvrtvrlb90p9sz.R.inc(38797);if ((((i >= checkFeasableCount ||
                        fitfun.isFeasible(arxk.getColumn(0)))&&(__CLR4_4_1tvrtvrlb90p9sz.R.iget(38798)!=0|true))||(__CLR4_4_1tvrtvrlb90p9sz.R.iget(38799)==0&false))) {{
                        __CLR4_4_1tvrtvrlb90p9sz.R.inc(38800);break;
                    }
                    // regenerate random arguments for row
                    }__CLR4_4_1tvrtvrlb90p9sz.R.inc(38801);arz.setColumn(k, randn(dimension));
                }
                }__CLR4_4_1tvrtvrlb90p9sz.R.inc(38802);copyColumn(arxk, 0, arx, k);
                __CLR4_4_1tvrtvrlb90p9sz.R.inc(38803);try {
                    __CLR4_4_1tvrtvrlb90p9sz.R.inc(38804);fitness[k] = fitfun.value(arx.getColumn(k)); // compute fitness
                } catch (TooManyEvaluationsException e) {
                    __CLR4_4_1tvrtvrlb90p9sz.R.inc(38805);break generationLoop;
                }
            }
            // Sort by fitness and compute weighted mean into xmean
            }__CLR4_4_1tvrtvrlb90p9sz.R.inc(38806);final int[] arindex = sortedIndices(fitness);
            // Calculate new xmean, this is selection and recombination
            __CLR4_4_1tvrtvrlb90p9sz.R.inc(38807);final RealMatrix xold = xmean; // for speed up of Eq. (2) and (3)
            __CLR4_4_1tvrtvrlb90p9sz.R.inc(38808);final RealMatrix bestArx = selectColumns(arx, MathArrays.copyOf(arindex, mu));
            __CLR4_4_1tvrtvrlb90p9sz.R.inc(38809);xmean = bestArx.multiply(weights);
            __CLR4_4_1tvrtvrlb90p9sz.R.inc(38810);final RealMatrix bestArz = selectColumns(arz, MathArrays.copyOf(arindex, mu));
            __CLR4_4_1tvrtvrlb90p9sz.R.inc(38811);final RealMatrix zmean = bestArz.multiply(weights);
            __CLR4_4_1tvrtvrlb90p9sz.R.inc(38812);final boolean hsig = updateEvolutionPaths(zmean, xold);
            __CLR4_4_1tvrtvrlb90p9sz.R.inc(38813);if ((((diagonalOnly <= 0)&&(__CLR4_4_1tvrtvrlb90p9sz.R.iget(38814)!=0|true))||(__CLR4_4_1tvrtvrlb90p9sz.R.iget(38815)==0&false))) {{
                __CLR4_4_1tvrtvrlb90p9sz.R.inc(38816);updateCovariance(hsig, bestArx, arz, arindex, xold);
            } }else {{
                __CLR4_4_1tvrtvrlb90p9sz.R.inc(38817);updateCovarianceDiagonalOnly(hsig, bestArz);
            }
            // Adapt step size sigma - Eq. (5)
            }__CLR4_4_1tvrtvrlb90p9sz.R.inc(38818);sigma *= Math.exp(Math.min(1, (normps/chiN - 1) * cs / damps));
            __CLR4_4_1tvrtvrlb90p9sz.R.inc(38819);final double bestFitness = fitness[arindex[0]];
            __CLR4_4_1tvrtvrlb90p9sz.R.inc(38820);final double worstFitness = fitness[arindex[arindex.length - 1]];
            __CLR4_4_1tvrtvrlb90p9sz.R.inc(38821);if ((((bestValue > bestFitness)&&(__CLR4_4_1tvrtvrlb90p9sz.R.iget(38822)!=0|true))||(__CLR4_4_1tvrtvrlb90p9sz.R.iget(38823)==0&false))) {{
                __CLR4_4_1tvrtvrlb90p9sz.R.inc(38824);bestValue = bestFitness;
                __CLR4_4_1tvrtvrlb90p9sz.R.inc(38825);lastResult = optimum;
                __CLR4_4_1tvrtvrlb90p9sz.R.inc(38826);optimum = new PointValuePair(fitfun.repair(bestArx.getColumn(0)),
                                             (((isMinimize )&&(__CLR4_4_1tvrtvrlb90p9sz.R.iget(38827)!=0|true))||(__CLR4_4_1tvrtvrlb90p9sz.R.iget(38828)==0&false))? bestFitness : -bestFitness);
                __CLR4_4_1tvrtvrlb90p9sz.R.inc(38829);if ((((getConvergenceChecker() != null && lastResult != null &&
                    getConvergenceChecker().converged(iterations, optimum, lastResult))&&(__CLR4_4_1tvrtvrlb90p9sz.R.iget(38830)!=0|true))||(__CLR4_4_1tvrtvrlb90p9sz.R.iget(38831)==0&false))) {{
                    __CLR4_4_1tvrtvrlb90p9sz.R.inc(38832);break generationLoop;
                }
            }}
            // handle termination criteria
            // Break, if fitness is good enough
            }__CLR4_4_1tvrtvrlb90p9sz.R.inc(38833);if ((((stopFitness != 0 && bestFitness < ((((isMinimize )&&(__CLR4_4_1tvrtvrlb90p9sz.R.iget(38834)!=0|true))||(__CLR4_4_1tvrtvrlb90p9sz.R.iget(38835)==0&false))? stopFitness : -stopFitness))&&(__CLR4_4_1tvrtvrlb90p9sz.R.iget(38836)!=0|true))||(__CLR4_4_1tvrtvrlb90p9sz.R.iget(38837)==0&false))) {{
                __CLR4_4_1tvrtvrlb90p9sz.R.inc(38838);break generationLoop;
            }
            }__CLR4_4_1tvrtvrlb90p9sz.R.inc(38839);final double[] sqrtDiagC = sqrt(diagC).getColumn(0);
            __CLR4_4_1tvrtvrlb90p9sz.R.inc(38840);final double[] pcCol = pc.getColumn(0);
            __CLR4_4_1tvrtvrlb90p9sz.R.inc(38841);for (int i = 0; (((i < dimension)&&(__CLR4_4_1tvrtvrlb90p9sz.R.iget(38842)!=0|true))||(__CLR4_4_1tvrtvrlb90p9sz.R.iget(38843)==0&false)); i++) {{
                __CLR4_4_1tvrtvrlb90p9sz.R.inc(38844);if ((((sigma * Math.max(Math.abs(pcCol[i]), sqrtDiagC[i]) > stopTolX)&&(__CLR4_4_1tvrtvrlb90p9sz.R.iget(38845)!=0|true))||(__CLR4_4_1tvrtvrlb90p9sz.R.iget(38846)==0&false))) {{
                    __CLR4_4_1tvrtvrlb90p9sz.R.inc(38847);break;
                }
                }__CLR4_4_1tvrtvrlb90p9sz.R.inc(38848);if ((((i >= dimension - 1)&&(__CLR4_4_1tvrtvrlb90p9sz.R.iget(38849)!=0|true))||(__CLR4_4_1tvrtvrlb90p9sz.R.iget(38850)==0&false))) {{
                    __CLR4_4_1tvrtvrlb90p9sz.R.inc(38851);break generationLoop;
                }
            }}
            }__CLR4_4_1tvrtvrlb90p9sz.R.inc(38852);for (int i = 0; (((i < dimension)&&(__CLR4_4_1tvrtvrlb90p9sz.R.iget(38853)!=0|true))||(__CLR4_4_1tvrtvrlb90p9sz.R.iget(38854)==0&false)); i++) {{
                __CLR4_4_1tvrtvrlb90p9sz.R.inc(38855);if ((((sigma * sqrtDiagC[i] > stopTolUpX)&&(__CLR4_4_1tvrtvrlb90p9sz.R.iget(38856)!=0|true))||(__CLR4_4_1tvrtvrlb90p9sz.R.iget(38857)==0&false))) {{
                    __CLR4_4_1tvrtvrlb90p9sz.R.inc(38858);break generationLoop;
                }
            }}
            }__CLR4_4_1tvrtvrlb90p9sz.R.inc(38859);final double historyBest = min(fitnessHistory);
            __CLR4_4_1tvrtvrlb90p9sz.R.inc(38860);final double historyWorst = max(fitnessHistory);
            __CLR4_4_1tvrtvrlb90p9sz.R.inc(38861);if ((((iterations > 2 &&
                Math.max(historyWorst, worstFitness) -
                Math.min(historyBest, bestFitness) < stopTolFun)&&(__CLR4_4_1tvrtvrlb90p9sz.R.iget(38862)!=0|true))||(__CLR4_4_1tvrtvrlb90p9sz.R.iget(38863)==0&false))) {{
                __CLR4_4_1tvrtvrlb90p9sz.R.inc(38864);break generationLoop;
            }
            }__CLR4_4_1tvrtvrlb90p9sz.R.inc(38865);if ((((iterations > fitnessHistory.length &&
                historyWorst - historyBest < stopTolHistFun)&&(__CLR4_4_1tvrtvrlb90p9sz.R.iget(38866)!=0|true))||(__CLR4_4_1tvrtvrlb90p9sz.R.iget(38867)==0&false))) {{
                __CLR4_4_1tvrtvrlb90p9sz.R.inc(38868);break generationLoop;
            }
            // condition number of the covariance matrix exceeds 1e14
            }__CLR4_4_1tvrtvrlb90p9sz.R.inc(38869);if ((((max(diagD) / min(diagD) > 1e7)&&(__CLR4_4_1tvrtvrlb90p9sz.R.iget(38870)!=0|true))||(__CLR4_4_1tvrtvrlb90p9sz.R.iget(38871)==0&false))) {{
                __CLR4_4_1tvrtvrlb90p9sz.R.inc(38872);break generationLoop;
            }
            // user defined termination
            }__CLR4_4_1tvrtvrlb90p9sz.R.inc(38873);if ((((getConvergenceChecker() != null)&&(__CLR4_4_1tvrtvrlb90p9sz.R.iget(38874)!=0|true))||(__CLR4_4_1tvrtvrlb90p9sz.R.iget(38875)==0&false))) {{
                __CLR4_4_1tvrtvrlb90p9sz.R.inc(38876);final PointValuePair current
                    = new PointValuePair(bestArx.getColumn(0),
                                         (((isMinimize )&&(__CLR4_4_1tvrtvrlb90p9sz.R.iget(38877)!=0|true))||(__CLR4_4_1tvrtvrlb90p9sz.R.iget(38878)==0&false))? bestFitness : -bestFitness);
                __CLR4_4_1tvrtvrlb90p9sz.R.inc(38879);if ((((lastResult != null &&
                    getConvergenceChecker().converged(iterations, current, lastResult))&&(__CLR4_4_1tvrtvrlb90p9sz.R.iget(38880)!=0|true))||(__CLR4_4_1tvrtvrlb90p9sz.R.iget(38881)==0&false))) {{
                    __CLR4_4_1tvrtvrlb90p9sz.R.inc(38882);break generationLoop;
                    }
                }__CLR4_4_1tvrtvrlb90p9sz.R.inc(38883);lastResult = current;
            }
            // Adjust step size in case of equal function values (flat fitness)
            }__CLR4_4_1tvrtvrlb90p9sz.R.inc(38884);if ((((bestValue == fitness[arindex[(int)(0.1+lambda/4.)]])&&(__CLR4_4_1tvrtvrlb90p9sz.R.iget(38885)!=0|true))||(__CLR4_4_1tvrtvrlb90p9sz.R.iget(38886)==0&false))) {{
                __CLR4_4_1tvrtvrlb90p9sz.R.inc(38887);sigma = sigma * Math.exp(0.2 + cs / damps);
            }
            }__CLR4_4_1tvrtvrlb90p9sz.R.inc(38888);if ((((iterations > 2 && Math.max(historyWorst, bestFitness) -
                Math.min(historyBest, bestFitness) == 0)&&(__CLR4_4_1tvrtvrlb90p9sz.R.iget(38889)!=0|true))||(__CLR4_4_1tvrtvrlb90p9sz.R.iget(38890)==0&false))) {{
                __CLR4_4_1tvrtvrlb90p9sz.R.inc(38891);sigma = sigma * Math.exp(0.2 + cs / damps);
            }
            // store best in history
            }__CLR4_4_1tvrtvrlb90p9sz.R.inc(38892);push(fitnessHistory,bestFitness);
            __CLR4_4_1tvrtvrlb90p9sz.R.inc(38893);fitfun.setValueRange(worstFitness-bestFitness);
            __CLR4_4_1tvrtvrlb90p9sz.R.inc(38894);if ((((generateStatistics)&&(__CLR4_4_1tvrtvrlb90p9sz.R.iget(38895)!=0|true))||(__CLR4_4_1tvrtvrlb90p9sz.R.iget(38896)==0&false))) {{
                __CLR4_4_1tvrtvrlb90p9sz.R.inc(38897);statisticsSigmaHistory.add(sigma);
                __CLR4_4_1tvrtvrlb90p9sz.R.inc(38898);statisticsFitnessHistory.add(bestFitness);
                __CLR4_4_1tvrtvrlb90p9sz.R.inc(38899);statisticsMeanHistory.add(xmean.transpose());
                __CLR4_4_1tvrtvrlb90p9sz.R.inc(38900);statisticsDHistory.add(diagD.transpose().scalarMultiply(1E5));
            }
        }}
        }__CLR4_4_1tvrtvrlb90p9sz.R.inc(38901);return optimum;
    }finally{__CLR4_4_1tvrtvrlb90p9sz.R.flushNeeded();}}

    /**
     * Scans the list of (required and optional) optimization data that
     * characterize the problem.
     *
     * @param optData Optimization data. The following data will be looked for:
     * <ul>
     *  <li>{@link Sigma}</li>
     *  <li>{@link PopulationSize}</li>
     * </ul>
     */
    @Override
    protected void parseOptimizationData(OptimizationData... optData) {try{__CLR4_4_1tvrtvrlb90p9sz.R.inc(38902);
        // Allow base class to register its own data.
        __CLR4_4_1tvrtvrlb90p9sz.R.inc(38903);super.parseOptimizationData(optData);

        // The existing values (as set by the previous call) are reused if
        // not provided in the argument list.
        __CLR4_4_1tvrtvrlb90p9sz.R.inc(38904);for (OptimizationData data : optData) {{
            __CLR4_4_1tvrtvrlb90p9sz.R.inc(38905);if ((((data instanceof Sigma)&&(__CLR4_4_1tvrtvrlb90p9sz.R.iget(38906)!=0|true))||(__CLR4_4_1tvrtvrlb90p9sz.R.iget(38907)==0&false))) {{
                __CLR4_4_1tvrtvrlb90p9sz.R.inc(38908);inputSigma = ((Sigma) data).getSigma();
                __CLR4_4_1tvrtvrlb90p9sz.R.inc(38909);continue;
            }
            }__CLR4_4_1tvrtvrlb90p9sz.R.inc(38910);if ((((data instanceof PopulationSize)&&(__CLR4_4_1tvrtvrlb90p9sz.R.iget(38911)!=0|true))||(__CLR4_4_1tvrtvrlb90p9sz.R.iget(38912)==0&false))) {{
                __CLR4_4_1tvrtvrlb90p9sz.R.inc(38913);lambda = ((PopulationSize) data).getPopulationSize();
                __CLR4_4_1tvrtvrlb90p9sz.R.inc(38914);continue;
            }
        }}

        }__CLR4_4_1tvrtvrlb90p9sz.R.inc(38915);checkParameters();
    }finally{__CLR4_4_1tvrtvrlb90p9sz.R.flushNeeded();}}

    /**
     * Checks dimensions and values of boundaries and inputSigma if defined.
     */
    private void checkParameters() {try{__CLR4_4_1tvrtvrlb90p9sz.R.inc(38916);
        __CLR4_4_1tvrtvrlb90p9sz.R.inc(38917);final double[] init = getStartPoint();
        __CLR4_4_1tvrtvrlb90p9sz.R.inc(38918);final double[] lB = getLowerBound();
        __CLR4_4_1tvrtvrlb90p9sz.R.inc(38919);final double[] uB = getUpperBound();

        __CLR4_4_1tvrtvrlb90p9sz.R.inc(38920);if ((((inputSigma != null)&&(__CLR4_4_1tvrtvrlb90p9sz.R.iget(38921)!=0|true))||(__CLR4_4_1tvrtvrlb90p9sz.R.iget(38922)==0&false))) {{
            __CLR4_4_1tvrtvrlb90p9sz.R.inc(38923);if ((((inputSigma.length != init.length)&&(__CLR4_4_1tvrtvrlb90p9sz.R.iget(38924)!=0|true))||(__CLR4_4_1tvrtvrlb90p9sz.R.iget(38925)==0&false))) {{
                __CLR4_4_1tvrtvrlb90p9sz.R.inc(38926);throw new DimensionMismatchException(inputSigma.length, init.length);
            }
            }__CLR4_4_1tvrtvrlb90p9sz.R.inc(38927);for (int i = 0; (((i < init.length)&&(__CLR4_4_1tvrtvrlb90p9sz.R.iget(38928)!=0|true))||(__CLR4_4_1tvrtvrlb90p9sz.R.iget(38929)==0&false)); i++) {{
                __CLR4_4_1tvrtvrlb90p9sz.R.inc(38930);if ((((inputSigma[i] > uB[i] - lB[i])&&(__CLR4_4_1tvrtvrlb90p9sz.R.iget(38931)!=0|true))||(__CLR4_4_1tvrtvrlb90p9sz.R.iget(38932)==0&false))) {{
                    __CLR4_4_1tvrtvrlb90p9sz.R.inc(38933);throw new OutOfRangeException(inputSigma[i], 0, uB[i] - lB[i]);
                }
            }}
        }}
    }}finally{__CLR4_4_1tvrtvrlb90p9sz.R.flushNeeded();}}

    /**
     * Initialization of the dynamic search parameters
     *
     * @param guess Initial guess for the arguments of the fitness function.
     */
    private void initializeCMA(double[] guess) {try{__CLR4_4_1tvrtvrlb90p9sz.R.inc(38934);
        __CLR4_4_1tvrtvrlb90p9sz.R.inc(38935);if ((((lambda <= 0)&&(__CLR4_4_1tvrtvrlb90p9sz.R.iget(38936)!=0|true))||(__CLR4_4_1tvrtvrlb90p9sz.R.iget(38937)==0&false))) {{
            __CLR4_4_1tvrtvrlb90p9sz.R.inc(38938);throw new NotStrictlyPositiveException(lambda);
        }
        // initialize sigma
        }__CLR4_4_1tvrtvrlb90p9sz.R.inc(38939);final double[][] sigmaArray = new double[guess.length][1];
        __CLR4_4_1tvrtvrlb90p9sz.R.inc(38940);for (int i = 0; (((i < guess.length)&&(__CLR4_4_1tvrtvrlb90p9sz.R.iget(38941)!=0|true))||(__CLR4_4_1tvrtvrlb90p9sz.R.iget(38942)==0&false)); i++) {{
            __CLR4_4_1tvrtvrlb90p9sz.R.inc(38943);sigmaArray[i][0] = inputSigma[i];
        }
        }__CLR4_4_1tvrtvrlb90p9sz.R.inc(38944);final RealMatrix insigma = new Array2DRowRealMatrix(sigmaArray, false);
        __CLR4_4_1tvrtvrlb90p9sz.R.inc(38945);sigma = max(insigma); // overall standard deviation

        // initialize termination criteria
        __CLR4_4_1tvrtvrlb90p9sz.R.inc(38946);stopTolUpX = 1e3 * max(insigma);
        __CLR4_4_1tvrtvrlb90p9sz.R.inc(38947);stopTolX = 1e-11 * max(insigma);
        __CLR4_4_1tvrtvrlb90p9sz.R.inc(38948);stopTolFun = 1e-12;
        __CLR4_4_1tvrtvrlb90p9sz.R.inc(38949);stopTolHistFun = 1e-13;

        // initialize selection strategy parameters
        __CLR4_4_1tvrtvrlb90p9sz.R.inc(38950);mu = lambda / 2; // number of parents/points for recombination
        __CLR4_4_1tvrtvrlb90p9sz.R.inc(38951);logMu2 = Math.log(mu + 0.5);
        __CLR4_4_1tvrtvrlb90p9sz.R.inc(38952);weights = log(sequence(1, mu, 1)).scalarMultiply(-1).scalarAdd(logMu2);
        __CLR4_4_1tvrtvrlb90p9sz.R.inc(38953);double sumw = 0;
        __CLR4_4_1tvrtvrlb90p9sz.R.inc(38954);double sumwq = 0;
        __CLR4_4_1tvrtvrlb90p9sz.R.inc(38955);for (int i = 0; (((i < mu)&&(__CLR4_4_1tvrtvrlb90p9sz.R.iget(38956)!=0|true))||(__CLR4_4_1tvrtvrlb90p9sz.R.iget(38957)==0&false)); i++) {{
            __CLR4_4_1tvrtvrlb90p9sz.R.inc(38958);double w = weights.getEntry(i, 0);
            __CLR4_4_1tvrtvrlb90p9sz.R.inc(38959);sumw += w;
            __CLR4_4_1tvrtvrlb90p9sz.R.inc(38960);sumwq += w * w;
        }
        }__CLR4_4_1tvrtvrlb90p9sz.R.inc(38961);weights = weights.scalarMultiply(1 / sumw);
        __CLR4_4_1tvrtvrlb90p9sz.R.inc(38962);mueff = sumw * sumw / sumwq; // variance-effectiveness of sum w_i x_i

        // initialize dynamic strategy parameters and constants
        __CLR4_4_1tvrtvrlb90p9sz.R.inc(38963);cc = (4 + mueff / dimension) /
                (dimension + 4 + 2 * mueff / dimension);
        __CLR4_4_1tvrtvrlb90p9sz.R.inc(38964);cs = (mueff + 2) / (dimension + mueff + 3.);
        __CLR4_4_1tvrtvrlb90p9sz.R.inc(38965);damps = (1 + 2 * Math.max(0, Math.sqrt((mueff - 1) /
                                               (dimension + 1)) - 1)) *
            Math.max(0.3,
                     1 - dimension / (1e-6 + maxIterations)) + cs; // minor increment
        __CLR4_4_1tvrtvrlb90p9sz.R.inc(38966);ccov1 = 2 / ((dimension + 1.3) * (dimension + 1.3) + mueff);
        __CLR4_4_1tvrtvrlb90p9sz.R.inc(38967);ccovmu = Math.min(1 - ccov1, 2 * (mueff - 2 + 1 / mueff) /
                          ((dimension + 2) * (dimension + 2) + mueff));
        __CLR4_4_1tvrtvrlb90p9sz.R.inc(38968);ccov1Sep = Math.min(1, ccov1 * (dimension + 1.5) / 3);
        __CLR4_4_1tvrtvrlb90p9sz.R.inc(38969);ccovmuSep = Math.min(1 - ccov1, ccovmu * (dimension + 1.5) / 3);
        __CLR4_4_1tvrtvrlb90p9sz.R.inc(38970);chiN = Math.sqrt(dimension) *
            (1 - 1 / ((double) 4 * dimension) + 1 / ((double) 21 * dimension * dimension));
        // intialize CMA internal values - updated each generation
        __CLR4_4_1tvrtvrlb90p9sz.R.inc(38971);xmean = MatrixUtils.createColumnRealMatrix(guess); // objective variables
        __CLR4_4_1tvrtvrlb90p9sz.R.inc(38972);diagD = insigma.scalarMultiply(1 / sigma);
        __CLR4_4_1tvrtvrlb90p9sz.R.inc(38973);diagC = square(diagD);
        __CLR4_4_1tvrtvrlb90p9sz.R.inc(38974);pc = zeros(dimension, 1); // evolution paths for C and sigma
        __CLR4_4_1tvrtvrlb90p9sz.R.inc(38975);ps = zeros(dimension, 1); // B defines the coordinate system
        __CLR4_4_1tvrtvrlb90p9sz.R.inc(38976);normps = ps.getFrobeniusNorm();

        __CLR4_4_1tvrtvrlb90p9sz.R.inc(38977);B = eye(dimension, dimension);
        __CLR4_4_1tvrtvrlb90p9sz.R.inc(38978);D = ones(dimension, 1); // diagonal D defines the scaling
        __CLR4_4_1tvrtvrlb90p9sz.R.inc(38979);BD = times(B, repmat(diagD.transpose(), dimension, 1));
        __CLR4_4_1tvrtvrlb90p9sz.R.inc(38980);C = B.multiply(diag(square(D)).multiply(B.transpose())); // covariance
        __CLR4_4_1tvrtvrlb90p9sz.R.inc(38981);historySize = 10 + (int) (3 * 10 * dimension / (double) lambda);
        __CLR4_4_1tvrtvrlb90p9sz.R.inc(38982);fitnessHistory = new double[historySize]; // history of fitness values
        __CLR4_4_1tvrtvrlb90p9sz.R.inc(38983);for (int i = 0; (((i < historySize)&&(__CLR4_4_1tvrtvrlb90p9sz.R.iget(38984)!=0|true))||(__CLR4_4_1tvrtvrlb90p9sz.R.iget(38985)==0&false)); i++) {{
            __CLR4_4_1tvrtvrlb90p9sz.R.inc(38986);fitnessHistory[i] = Double.MAX_VALUE;
        }
    }}finally{__CLR4_4_1tvrtvrlb90p9sz.R.flushNeeded();}}

    /**
     * Update of the evolution paths ps and pc.
     *
     * @param zmean Weighted row matrix of the gaussian random numbers generating
     * the current offspring.
     * @param xold xmean matrix of the previous generation.
     * @return hsig flag indicating a small correction.
     */
    private boolean updateEvolutionPaths(RealMatrix zmean, RealMatrix xold) {try{__CLR4_4_1tvrtvrlb90p9sz.R.inc(38987);
        __CLR4_4_1tvrtvrlb90p9sz.R.inc(38988);ps = ps.scalarMultiply(1 - cs).add(
                B.multiply(zmean).scalarMultiply(
                        Math.sqrt(cs * (2 - cs) * mueff)));
        __CLR4_4_1tvrtvrlb90p9sz.R.inc(38989);normps = ps.getFrobeniusNorm();
        __CLR4_4_1tvrtvrlb90p9sz.R.inc(38990);final boolean hsig = normps /
            Math.sqrt(1 - Math.pow(1 - cs, 2 * iterations)) /
            chiN < 1.4 + 2 / ((double) dimension + 1);
        __CLR4_4_1tvrtvrlb90p9sz.R.inc(38991);pc = pc.scalarMultiply(1 - cc);
        __CLR4_4_1tvrtvrlb90p9sz.R.inc(38992);if ((((hsig)&&(__CLR4_4_1tvrtvrlb90p9sz.R.iget(38993)!=0|true))||(__CLR4_4_1tvrtvrlb90p9sz.R.iget(38994)==0&false))) {{
            __CLR4_4_1tvrtvrlb90p9sz.R.inc(38995);pc = pc.add(xmean.subtract(xold).scalarMultiply(Math.sqrt(cc * (2 - cc) * mueff) / sigma));
        }
        }__CLR4_4_1tvrtvrlb90p9sz.R.inc(38996);return hsig;
    }finally{__CLR4_4_1tvrtvrlb90p9sz.R.flushNeeded();}}

    /**
     * Update of the covariance matrix C for diagonalOnly > 0
     *
     * @param hsig Flag indicating a small correction.
     * @param bestArz Fitness-sorted matrix of the gaussian random values of the
     * current offspring.
     */
    private void updateCovarianceDiagonalOnly(boolean hsig,
                                              final RealMatrix bestArz) {try{__CLR4_4_1tvrtvrlb90p9sz.R.inc(38997);
        // minor correction if hsig==false
        __CLR4_4_1tvrtvrlb90p9sz.R.inc(38998);double oldFac = (((hsig )&&(__CLR4_4_1tvrtvrlb90p9sz.R.iget(38999)!=0|true))||(__CLR4_4_1tvrtvrlb90p9sz.R.iget(39000)==0&false))? 0 : ccov1Sep * cc * (2 - cc);
        __CLR4_4_1tvrtvrlb90p9sz.R.inc(39001);oldFac += 1 - ccov1Sep - ccovmuSep;
        __CLR4_4_1tvrtvrlb90p9sz.R.inc(39002);diagC = diagC.scalarMultiply(oldFac) // regard old matrix
            .add(square(pc).scalarMultiply(ccov1Sep)) // plus rank one update
            .add((times(diagC, square(bestArz).multiply(weights))) // plus rank mu update
                 .scalarMultiply(ccovmuSep));
        __CLR4_4_1tvrtvrlb90p9sz.R.inc(39003);diagD = sqrt(diagC); // replaces eig(C)
        __CLR4_4_1tvrtvrlb90p9sz.R.inc(39004);if ((((diagonalOnly > 1 &&
            iterations > diagonalOnly)&&(__CLR4_4_1tvrtvrlb90p9sz.R.iget(39005)!=0|true))||(__CLR4_4_1tvrtvrlb90p9sz.R.iget(39006)==0&false))) {{
            // full covariance matrix from now on
            __CLR4_4_1tvrtvrlb90p9sz.R.inc(39007);diagonalOnly = 0;
            __CLR4_4_1tvrtvrlb90p9sz.R.inc(39008);B = eye(dimension, dimension);
            __CLR4_4_1tvrtvrlb90p9sz.R.inc(39009);BD = diag(diagD);
            __CLR4_4_1tvrtvrlb90p9sz.R.inc(39010);C = diag(diagC);
        }
    }}finally{__CLR4_4_1tvrtvrlb90p9sz.R.flushNeeded();}}

    /**
     * Update of the covariance matrix C.
     *
     * @param hsig Flag indicating a small correction.
     * @param bestArx Fitness-sorted matrix of the argument vectors producing the
     * current offspring.
     * @param arz Unsorted matrix containing the gaussian random values of the
     * current offspring.
     * @param arindex Indices indicating the fitness-order of the current offspring.
     * @param xold xmean matrix of the previous generation.
     */
    private void updateCovariance(boolean hsig, final RealMatrix bestArx,
                                  final RealMatrix arz, final int[] arindex,
                                  final RealMatrix xold) {try{__CLR4_4_1tvrtvrlb90p9sz.R.inc(39011);
        __CLR4_4_1tvrtvrlb90p9sz.R.inc(39012);double negccov = 0;
        __CLR4_4_1tvrtvrlb90p9sz.R.inc(39013);if ((((ccov1 + ccovmu > 0)&&(__CLR4_4_1tvrtvrlb90p9sz.R.iget(39014)!=0|true))||(__CLR4_4_1tvrtvrlb90p9sz.R.iget(39015)==0&false))) {{
            __CLR4_4_1tvrtvrlb90p9sz.R.inc(39016);final RealMatrix arpos = bestArx.subtract(repmat(xold, 1, mu))
                .scalarMultiply(1 / sigma); // mu difference vectors
            __CLR4_4_1tvrtvrlb90p9sz.R.inc(39017);final RealMatrix roneu = pc.multiply(pc.transpose())
                .scalarMultiply(ccov1); // rank one update
            // minor correction if hsig==false
            __CLR4_4_1tvrtvrlb90p9sz.R.inc(39018);double oldFac = (((hsig )&&(__CLR4_4_1tvrtvrlb90p9sz.R.iget(39019)!=0|true))||(__CLR4_4_1tvrtvrlb90p9sz.R.iget(39020)==0&false))? 0 : ccov1 * cc * (2 - cc);
            __CLR4_4_1tvrtvrlb90p9sz.R.inc(39021);oldFac += 1 - ccov1 - ccovmu;
            __CLR4_4_1tvrtvrlb90p9sz.R.inc(39022);if ((((isActiveCMA)&&(__CLR4_4_1tvrtvrlb90p9sz.R.iget(39023)!=0|true))||(__CLR4_4_1tvrtvrlb90p9sz.R.iget(39024)==0&false))) {{
                // Adapt covariance matrix C active CMA
                __CLR4_4_1tvrtvrlb90p9sz.R.inc(39025);negccov = (1 - ccovmu) * 0.25 * mueff /
                    (Math.pow(dimension + 2, 1.5) + 2 * mueff);
                // keep at least 0.66 in all directions, small popsize are most
                // critical
                __CLR4_4_1tvrtvrlb90p9sz.R.inc(39026);final double negminresidualvariance = 0.66;
                // where to make up for the variance loss
                __CLR4_4_1tvrtvrlb90p9sz.R.inc(39027);final double negalphaold = 0.5;
                // prepare vectors, compute negative updating matrix Cneg
                __CLR4_4_1tvrtvrlb90p9sz.R.inc(39028);final int[] arReverseIndex = reverse(arindex);
                __CLR4_4_1tvrtvrlb90p9sz.R.inc(39029);RealMatrix arzneg = selectColumns(arz, MathArrays.copyOf(arReverseIndex, mu));
                __CLR4_4_1tvrtvrlb90p9sz.R.inc(39030);RealMatrix arnorms = sqrt(sumRows(square(arzneg)));
                __CLR4_4_1tvrtvrlb90p9sz.R.inc(39031);final int[] idxnorms = sortedIndices(arnorms.getRow(0));
                __CLR4_4_1tvrtvrlb90p9sz.R.inc(39032);final RealMatrix arnormsSorted = selectColumns(arnorms, idxnorms);
                __CLR4_4_1tvrtvrlb90p9sz.R.inc(39033);final int[] idxReverse = reverse(idxnorms);
                __CLR4_4_1tvrtvrlb90p9sz.R.inc(39034);final RealMatrix arnormsReverse = selectColumns(arnorms, idxReverse);
                __CLR4_4_1tvrtvrlb90p9sz.R.inc(39035);arnorms = divide(arnormsReverse, arnormsSorted);
                __CLR4_4_1tvrtvrlb90p9sz.R.inc(39036);final int[] idxInv = inverse(idxnorms);
                __CLR4_4_1tvrtvrlb90p9sz.R.inc(39037);final RealMatrix arnormsInv = selectColumns(arnorms, idxInv);
                // check and set learning rate negccov
                __CLR4_4_1tvrtvrlb90p9sz.R.inc(39038);final double negcovMax = (1 - negminresidualvariance) /
                    square(arnormsInv).multiply(weights).getEntry(0, 0);
                __CLR4_4_1tvrtvrlb90p9sz.R.inc(39039);if ((((negccov > negcovMax)&&(__CLR4_4_1tvrtvrlb90p9sz.R.iget(39040)!=0|true))||(__CLR4_4_1tvrtvrlb90p9sz.R.iget(39041)==0&false))) {{
                    __CLR4_4_1tvrtvrlb90p9sz.R.inc(39042);negccov = negcovMax;
                }
                }__CLR4_4_1tvrtvrlb90p9sz.R.inc(39043);arzneg = times(arzneg, repmat(arnormsInv, dimension, 1));
                __CLR4_4_1tvrtvrlb90p9sz.R.inc(39044);final RealMatrix artmp = BD.multiply(arzneg);
                __CLR4_4_1tvrtvrlb90p9sz.R.inc(39045);final RealMatrix Cneg = artmp.multiply(diag(weights)).multiply(artmp.transpose());
                __CLR4_4_1tvrtvrlb90p9sz.R.inc(39046);oldFac += negalphaold * negccov;
                __CLR4_4_1tvrtvrlb90p9sz.R.inc(39047);C = C.scalarMultiply(oldFac)
                    .add(roneu) // regard old matrix
                    .add(arpos.scalarMultiply( // plus rank one update
                                              ccovmu + (1 - negalphaold) * negccov) // plus rank mu update
                         .multiply(times(repmat(weights, 1, dimension),
                                         arpos.transpose())))
                    .subtract(Cneg.scalarMultiply(negccov));
            } }else {{
                // Adapt covariance matrix C - nonactive
                __CLR4_4_1tvrtvrlb90p9sz.R.inc(39048);C = C.scalarMultiply(oldFac) // regard old matrix
                    .add(roneu) // plus rank one update
                    .add(arpos.scalarMultiply(ccovmu) // plus rank mu update
                         .multiply(times(repmat(weights, 1, dimension),
                                         arpos.transpose())));
            }
        }}
        }__CLR4_4_1tvrtvrlb90p9sz.R.inc(39049);updateBD(negccov);
    }finally{__CLR4_4_1tvrtvrlb90p9sz.R.flushNeeded();}}

    /**
     * Update B and D from C.
     *
     * @param negccov Negative covariance factor.
     */
    private void updateBD(double negccov) {try{__CLR4_4_1tvrtvrlb90p9sz.R.inc(39050);
        __CLR4_4_1tvrtvrlb90p9sz.R.inc(39051);if ((((ccov1 + ccovmu + negccov > 0 &&
            (iterations % 1. / (ccov1 + ccovmu + negccov) / dimension / 10.) < 1)&&(__CLR4_4_1tvrtvrlb90p9sz.R.iget(39052)!=0|true))||(__CLR4_4_1tvrtvrlb90p9sz.R.iget(39053)==0&false))) {{
            // to achieve O(N^2)
            __CLR4_4_1tvrtvrlb90p9sz.R.inc(39054);C = triu(C, 0).add(triu(C, 1).transpose());
            // enforce symmetry to prevent complex numbers
            __CLR4_4_1tvrtvrlb90p9sz.R.inc(39055);final EigenDecomposition eig = new EigenDecomposition(C);
            __CLR4_4_1tvrtvrlb90p9sz.R.inc(39056);B = eig.getV(); // eigen decomposition, B==normalized eigenvectors
            __CLR4_4_1tvrtvrlb90p9sz.R.inc(39057);D = eig.getD();
            __CLR4_4_1tvrtvrlb90p9sz.R.inc(39058);diagD = diag(D);
            __CLR4_4_1tvrtvrlb90p9sz.R.inc(39059);if ((((min(diagD) <= 0)&&(__CLR4_4_1tvrtvrlb90p9sz.R.iget(39060)!=0|true))||(__CLR4_4_1tvrtvrlb90p9sz.R.iget(39061)==0&false))) {{
                __CLR4_4_1tvrtvrlb90p9sz.R.inc(39062);for (int i = 0; (((i < dimension)&&(__CLR4_4_1tvrtvrlb90p9sz.R.iget(39063)!=0|true))||(__CLR4_4_1tvrtvrlb90p9sz.R.iget(39064)==0&false)); i++) {{
                    __CLR4_4_1tvrtvrlb90p9sz.R.inc(39065);if ((((diagD.getEntry(i, 0) < 0)&&(__CLR4_4_1tvrtvrlb90p9sz.R.iget(39066)!=0|true))||(__CLR4_4_1tvrtvrlb90p9sz.R.iget(39067)==0&false))) {{
                        __CLR4_4_1tvrtvrlb90p9sz.R.inc(39068);diagD.setEntry(i, 0, 0);
                    }
                }}
                }__CLR4_4_1tvrtvrlb90p9sz.R.inc(39069);final double tfac = max(diagD) / 1e14;
                __CLR4_4_1tvrtvrlb90p9sz.R.inc(39070);C = C.add(eye(dimension, dimension).scalarMultiply(tfac));
                __CLR4_4_1tvrtvrlb90p9sz.R.inc(39071);diagD = diagD.add(ones(dimension, 1).scalarMultiply(tfac));
            }
            }__CLR4_4_1tvrtvrlb90p9sz.R.inc(39072);if ((((max(diagD) > 1e14 * min(diagD))&&(__CLR4_4_1tvrtvrlb90p9sz.R.iget(39073)!=0|true))||(__CLR4_4_1tvrtvrlb90p9sz.R.iget(39074)==0&false))) {{
                __CLR4_4_1tvrtvrlb90p9sz.R.inc(39075);final double tfac = max(diagD) / 1e14 - min(diagD);
                __CLR4_4_1tvrtvrlb90p9sz.R.inc(39076);C = C.add(eye(dimension, dimension).scalarMultiply(tfac));
                __CLR4_4_1tvrtvrlb90p9sz.R.inc(39077);diagD = diagD.add(ones(dimension, 1).scalarMultiply(tfac));
            }
            }__CLR4_4_1tvrtvrlb90p9sz.R.inc(39078);diagC = diag(C);
            __CLR4_4_1tvrtvrlb90p9sz.R.inc(39079);diagD = sqrt(diagD); // D contains standard deviations now
            __CLR4_4_1tvrtvrlb90p9sz.R.inc(39080);BD = times(B, repmat(diagD.transpose(), dimension, 1)); // O(n^2)
        }
    }}finally{__CLR4_4_1tvrtvrlb90p9sz.R.flushNeeded();}}

    /**
     * Pushes the current best fitness value in a history queue.
     *
     * @param vals History queue.
     * @param val Current best fitness value.
     */
    private static void push(double[] vals, double val) {try{__CLR4_4_1tvrtvrlb90p9sz.R.inc(39081);
        __CLR4_4_1tvrtvrlb90p9sz.R.inc(39082);for (int i = vals.length-1; (((i > 0)&&(__CLR4_4_1tvrtvrlb90p9sz.R.iget(39083)!=0|true))||(__CLR4_4_1tvrtvrlb90p9sz.R.iget(39084)==0&false)); i--) {{
            __CLR4_4_1tvrtvrlb90p9sz.R.inc(39085);vals[i] = vals[i-1];
        }
        }__CLR4_4_1tvrtvrlb90p9sz.R.inc(39086);vals[0] = val;
    }finally{__CLR4_4_1tvrtvrlb90p9sz.R.flushNeeded();}}

    /**
     * Sorts fitness values.
     *
     * @param doubles Array of values to be sorted.
     * @return a sorted array of indices pointing into doubles.
     */
    private int[] sortedIndices(final double[] doubles) {try{__CLR4_4_1tvrtvrlb90p9sz.R.inc(39087);
        __CLR4_4_1tvrtvrlb90p9sz.R.inc(39088);final DoubleIndex[] dis = new DoubleIndex[doubles.length];
        __CLR4_4_1tvrtvrlb90p9sz.R.inc(39089);for (int i = 0; (((i < doubles.length)&&(__CLR4_4_1tvrtvrlb90p9sz.R.iget(39090)!=0|true))||(__CLR4_4_1tvrtvrlb90p9sz.R.iget(39091)==0&false)); i++) {{
            __CLR4_4_1tvrtvrlb90p9sz.R.inc(39092);dis[i] = new DoubleIndex(doubles[i], i);
        }
        }__CLR4_4_1tvrtvrlb90p9sz.R.inc(39093);Arrays.sort(dis);
        __CLR4_4_1tvrtvrlb90p9sz.R.inc(39094);final int[] indices = new int[doubles.length];
        __CLR4_4_1tvrtvrlb90p9sz.R.inc(39095);for (int i = 0; (((i < doubles.length)&&(__CLR4_4_1tvrtvrlb90p9sz.R.iget(39096)!=0|true))||(__CLR4_4_1tvrtvrlb90p9sz.R.iget(39097)==0&false)); i++) {{
            __CLR4_4_1tvrtvrlb90p9sz.R.inc(39098);indices[i] = dis[i].index;
        }
        }__CLR4_4_1tvrtvrlb90p9sz.R.inc(39099);return indices;
    }finally{__CLR4_4_1tvrtvrlb90p9sz.R.flushNeeded();}}

    /**
     * Used to sort fitness values. Sorting is always in lower value first
     * order.
     */
    private static class DoubleIndex implements Comparable<DoubleIndex> {
        /** Value to compare. */
        private final double value;
        /** Index into sorted array. */
        private final int index;

        /**
         * @param value Value to compare.
         * @param index Index into sorted array.
         */
        DoubleIndex(double value, int index) {try{__CLR4_4_1tvrtvrlb90p9sz.R.inc(39100);
            __CLR4_4_1tvrtvrlb90p9sz.R.inc(39101);this.value = value;
            __CLR4_4_1tvrtvrlb90p9sz.R.inc(39102);this.index = index;
        }finally{__CLR4_4_1tvrtvrlb90p9sz.R.flushNeeded();}}

        /** {@inheritDoc} */
        public int compareTo(DoubleIndex o) {try{__CLR4_4_1tvrtvrlb90p9sz.R.inc(39103);
            __CLR4_4_1tvrtvrlb90p9sz.R.inc(39104);return Double.compare(value, o.value);
        }finally{__CLR4_4_1tvrtvrlb90p9sz.R.flushNeeded();}}

        /** {@inheritDoc} */
        @Override
        public boolean equals(Object other) {try{__CLR4_4_1tvrtvrlb90p9sz.R.inc(39105);

            __CLR4_4_1tvrtvrlb90p9sz.R.inc(39106);if ((((this == other)&&(__CLR4_4_1tvrtvrlb90p9sz.R.iget(39107)!=0|true))||(__CLR4_4_1tvrtvrlb90p9sz.R.iget(39108)==0&false))) {{
                __CLR4_4_1tvrtvrlb90p9sz.R.inc(39109);return true;
            }

            }__CLR4_4_1tvrtvrlb90p9sz.R.inc(39110);if ((((other instanceof DoubleIndex)&&(__CLR4_4_1tvrtvrlb90p9sz.R.iget(39111)!=0|true))||(__CLR4_4_1tvrtvrlb90p9sz.R.iget(39112)==0&false))) {{
                __CLR4_4_1tvrtvrlb90p9sz.R.inc(39113);return Double.compare(value, ((DoubleIndex) other).value) == 0;
            }

            }__CLR4_4_1tvrtvrlb90p9sz.R.inc(39114);return false;
        }finally{__CLR4_4_1tvrtvrlb90p9sz.R.flushNeeded();}}

        /** {@inheritDoc} */
        @Override
        public int hashCode() {try{__CLR4_4_1tvrtvrlb90p9sz.R.inc(39115);
            __CLR4_4_1tvrtvrlb90p9sz.R.inc(39116);long bits = Double.doubleToLongBits(value);
            __CLR4_4_1tvrtvrlb90p9sz.R.inc(39117);return (int) ((1438542 ^ (bits >>> 32) ^ bits) & 0xffffffff);
        }finally{__CLR4_4_1tvrtvrlb90p9sz.R.flushNeeded();}}
    }

    /**
     * Normalizes fitness values to the range [0,1]. Adds a penalty to the
     * fitness value if out of range. The penalty is adjusted by calling
     * setValueRange().
     */
    private class FitnessFunction {
        /** Determines the penalty for boundary violations */
        private double valueRange;
        /**
         * Flag indicating whether the objective variables are forced into their
         * bounds if defined
         */
        private final boolean isRepairMode;

        /** Simple constructor.
         */
        public FitnessFunction() {try{__CLR4_4_1tvrtvrlb90p9sz.R.inc(39118);
            __CLR4_4_1tvrtvrlb90p9sz.R.inc(39119);valueRange = 1;
            __CLR4_4_1tvrtvrlb90p9sz.R.inc(39120);isRepairMode = true;
        }finally{__CLR4_4_1tvrtvrlb90p9sz.R.flushNeeded();}}

        /**
         * @param point Normalized objective variables.
         * @return the objective value + penalty for violated bounds.
         */
        public double value(final double[] point) {try{__CLR4_4_1tvrtvrlb90p9sz.R.inc(39121);
            __CLR4_4_1tvrtvrlb90p9sz.R.inc(39122);double value;
            __CLR4_4_1tvrtvrlb90p9sz.R.inc(39123);if ((((isRepairMode)&&(__CLR4_4_1tvrtvrlb90p9sz.R.iget(39124)!=0|true))||(__CLR4_4_1tvrtvrlb90p9sz.R.iget(39125)==0&false))) {{
                __CLR4_4_1tvrtvrlb90p9sz.R.inc(39126);double[] repaired = repair(point);
                __CLR4_4_1tvrtvrlb90p9sz.R.inc(39127);value = CMAESOptimizer.this.computeObjectiveValue(repaired) +
                    penalty(point, repaired);
            } }else {{
                __CLR4_4_1tvrtvrlb90p9sz.R.inc(39128);value = CMAESOptimizer.this.computeObjectiveValue(point);
            }
            }__CLR4_4_1tvrtvrlb90p9sz.R.inc(39129);return (((isMinimize )&&(__CLR4_4_1tvrtvrlb90p9sz.R.iget(39130)!=0|true))||(__CLR4_4_1tvrtvrlb90p9sz.R.iget(39131)==0&false))? value : -value;
        }finally{__CLR4_4_1tvrtvrlb90p9sz.R.flushNeeded();}}

        /**
         * @param x Normalized objective variables.
         * @return {@code true} if in bounds.
         */
        public boolean isFeasible(final double[] x) {try{__CLR4_4_1tvrtvrlb90p9sz.R.inc(39132);
            __CLR4_4_1tvrtvrlb90p9sz.R.inc(39133);final double[] lB = CMAESOptimizer.this.getLowerBound();
            __CLR4_4_1tvrtvrlb90p9sz.R.inc(39134);final double[] uB = CMAESOptimizer.this.getUpperBound();

            __CLR4_4_1tvrtvrlb90p9sz.R.inc(39135);for (int i = 0; (((i < x.length)&&(__CLR4_4_1tvrtvrlb90p9sz.R.iget(39136)!=0|true))||(__CLR4_4_1tvrtvrlb90p9sz.R.iget(39137)==0&false)); i++) {{
                __CLR4_4_1tvrtvrlb90p9sz.R.inc(39138);if ((((x[i] < lB[i])&&(__CLR4_4_1tvrtvrlb90p9sz.R.iget(39139)!=0|true))||(__CLR4_4_1tvrtvrlb90p9sz.R.iget(39140)==0&false))) {{
                    __CLR4_4_1tvrtvrlb90p9sz.R.inc(39141);return false;
                }
                }__CLR4_4_1tvrtvrlb90p9sz.R.inc(39142);if ((((x[i] > uB[i])&&(__CLR4_4_1tvrtvrlb90p9sz.R.iget(39143)!=0|true))||(__CLR4_4_1tvrtvrlb90p9sz.R.iget(39144)==0&false))) {{
                    __CLR4_4_1tvrtvrlb90p9sz.R.inc(39145);return false;
                }
            }}
            }__CLR4_4_1tvrtvrlb90p9sz.R.inc(39146);return true;
        }finally{__CLR4_4_1tvrtvrlb90p9sz.R.flushNeeded();}}

        /**
         * @param valueRange Adjusts the penalty computation.
         */
        public void setValueRange(double valueRange) {try{__CLR4_4_1tvrtvrlb90p9sz.R.inc(39147);
            __CLR4_4_1tvrtvrlb90p9sz.R.inc(39148);this.valueRange = valueRange;
        }finally{__CLR4_4_1tvrtvrlb90p9sz.R.flushNeeded();}}

        /**
         * @param x Normalized objective variables.
         * @return the repaired (i.e. all in bounds) objective variables.
         */
        private double[] repair(final double[] x) {try{__CLR4_4_1tvrtvrlb90p9sz.R.inc(39149);
            __CLR4_4_1tvrtvrlb90p9sz.R.inc(39150);final double[] lB = CMAESOptimizer.this.getLowerBound();
            __CLR4_4_1tvrtvrlb90p9sz.R.inc(39151);final double[] uB = CMAESOptimizer.this.getUpperBound();

            __CLR4_4_1tvrtvrlb90p9sz.R.inc(39152);final double[] repaired = new double[x.length];
            __CLR4_4_1tvrtvrlb90p9sz.R.inc(39153);for (int i = 0; (((i < x.length)&&(__CLR4_4_1tvrtvrlb90p9sz.R.iget(39154)!=0|true))||(__CLR4_4_1tvrtvrlb90p9sz.R.iget(39155)==0&false)); i++) {{
                __CLR4_4_1tvrtvrlb90p9sz.R.inc(39156);if ((((x[i] < lB[i])&&(__CLR4_4_1tvrtvrlb90p9sz.R.iget(39157)!=0|true))||(__CLR4_4_1tvrtvrlb90p9sz.R.iget(39158)==0&false))) {{
                    __CLR4_4_1tvrtvrlb90p9sz.R.inc(39159);repaired[i] = lB[i];
                } }else {__CLR4_4_1tvrtvrlb90p9sz.R.inc(39160);if ((((x[i] > uB[i])&&(__CLR4_4_1tvrtvrlb90p9sz.R.iget(39161)!=0|true))||(__CLR4_4_1tvrtvrlb90p9sz.R.iget(39162)==0&false))) {{
                    __CLR4_4_1tvrtvrlb90p9sz.R.inc(39163);repaired[i] = uB[i];
                } }else {{
                    __CLR4_4_1tvrtvrlb90p9sz.R.inc(39164);repaired[i] = x[i];
                }
            }}}
            }__CLR4_4_1tvrtvrlb90p9sz.R.inc(39165);return repaired;
        }finally{__CLR4_4_1tvrtvrlb90p9sz.R.flushNeeded();}}

        /**
         * @param x Normalized objective variables.
         * @param repaired Repaired objective variables.
         * @return Penalty value according to the violation of the bounds.
         */
        private double penalty(final double[] x, final double[] repaired) {try{__CLR4_4_1tvrtvrlb90p9sz.R.inc(39166);
            __CLR4_4_1tvrtvrlb90p9sz.R.inc(39167);double penalty = 0;
            __CLR4_4_1tvrtvrlb90p9sz.R.inc(39168);for (int i = 0; (((i < x.length)&&(__CLR4_4_1tvrtvrlb90p9sz.R.iget(39169)!=0|true))||(__CLR4_4_1tvrtvrlb90p9sz.R.iget(39170)==0&false)); i++) {{
                __CLR4_4_1tvrtvrlb90p9sz.R.inc(39171);double diff = Math.abs(x[i] - repaired[i]);
                __CLR4_4_1tvrtvrlb90p9sz.R.inc(39172);penalty += diff * valueRange;
            }
            }__CLR4_4_1tvrtvrlb90p9sz.R.inc(39173);return (((isMinimize )&&(__CLR4_4_1tvrtvrlb90p9sz.R.iget(39174)!=0|true))||(__CLR4_4_1tvrtvrlb90p9sz.R.iget(39175)==0&false))? penalty : -penalty;
        }finally{__CLR4_4_1tvrtvrlb90p9sz.R.flushNeeded();}}
    }

    // -----Matrix utility functions similar to the Matlab build in functions------

    /**
     * @param m Input matrix
     * @return Matrix representing the element-wise logarithm of m.
     */
    private static RealMatrix log(final RealMatrix m) {try{__CLR4_4_1tvrtvrlb90p9sz.R.inc(39176);
        __CLR4_4_1tvrtvrlb90p9sz.R.inc(39177);final double[][] d = new double[m.getRowDimension()][m.getColumnDimension()];
        __CLR4_4_1tvrtvrlb90p9sz.R.inc(39178);for (int r = 0; (((r < m.getRowDimension())&&(__CLR4_4_1tvrtvrlb90p9sz.R.iget(39179)!=0|true))||(__CLR4_4_1tvrtvrlb90p9sz.R.iget(39180)==0&false)); r++) {{
            __CLR4_4_1tvrtvrlb90p9sz.R.inc(39181);for (int c = 0; (((c < m.getColumnDimension())&&(__CLR4_4_1tvrtvrlb90p9sz.R.iget(39182)!=0|true))||(__CLR4_4_1tvrtvrlb90p9sz.R.iget(39183)==0&false)); c++) {{
                __CLR4_4_1tvrtvrlb90p9sz.R.inc(39184);d[r][c] = Math.log(m.getEntry(r, c));
            }
        }}
        }__CLR4_4_1tvrtvrlb90p9sz.R.inc(39185);return new Array2DRowRealMatrix(d, false);
    }finally{__CLR4_4_1tvrtvrlb90p9sz.R.flushNeeded();}}

    /**
     * @param m Input matrix.
     * @return Matrix representing the element-wise square root of m.
     */
    private static RealMatrix sqrt(final RealMatrix m) {try{__CLR4_4_1tvrtvrlb90p9sz.R.inc(39186);
        __CLR4_4_1tvrtvrlb90p9sz.R.inc(39187);final double[][] d = new double[m.getRowDimension()][m.getColumnDimension()];
        __CLR4_4_1tvrtvrlb90p9sz.R.inc(39188);for (int r = 0; (((r < m.getRowDimension())&&(__CLR4_4_1tvrtvrlb90p9sz.R.iget(39189)!=0|true))||(__CLR4_4_1tvrtvrlb90p9sz.R.iget(39190)==0&false)); r++) {{
            __CLR4_4_1tvrtvrlb90p9sz.R.inc(39191);for (int c = 0; (((c < m.getColumnDimension())&&(__CLR4_4_1tvrtvrlb90p9sz.R.iget(39192)!=0|true))||(__CLR4_4_1tvrtvrlb90p9sz.R.iget(39193)==0&false)); c++) {{
                __CLR4_4_1tvrtvrlb90p9sz.R.inc(39194);d[r][c] = Math.sqrt(m.getEntry(r, c));
            }
        }}
        }__CLR4_4_1tvrtvrlb90p9sz.R.inc(39195);return new Array2DRowRealMatrix(d, false);
    }finally{__CLR4_4_1tvrtvrlb90p9sz.R.flushNeeded();}}

    /**
     * @param m Input matrix.
     * @return Matrix representing the element-wise square of m.
     */
    private static RealMatrix square(final RealMatrix m) {try{__CLR4_4_1tvrtvrlb90p9sz.R.inc(39196);
        __CLR4_4_1tvrtvrlb90p9sz.R.inc(39197);final double[][] d = new double[m.getRowDimension()][m.getColumnDimension()];
        __CLR4_4_1tvrtvrlb90p9sz.R.inc(39198);for (int r = 0; (((r < m.getRowDimension())&&(__CLR4_4_1tvrtvrlb90p9sz.R.iget(39199)!=0|true))||(__CLR4_4_1tvrtvrlb90p9sz.R.iget(39200)==0&false)); r++) {{
            __CLR4_4_1tvrtvrlb90p9sz.R.inc(39201);for (int c = 0; (((c < m.getColumnDimension())&&(__CLR4_4_1tvrtvrlb90p9sz.R.iget(39202)!=0|true))||(__CLR4_4_1tvrtvrlb90p9sz.R.iget(39203)==0&false)); c++) {{
                __CLR4_4_1tvrtvrlb90p9sz.R.inc(39204);double e = m.getEntry(r, c);
                __CLR4_4_1tvrtvrlb90p9sz.R.inc(39205);d[r][c] = e * e;
            }
        }}
        }__CLR4_4_1tvrtvrlb90p9sz.R.inc(39206);return new Array2DRowRealMatrix(d, false);
    }finally{__CLR4_4_1tvrtvrlb90p9sz.R.flushNeeded();}}

    /**
     * @param m Input matrix 1.
     * @param n Input matrix 2.
     * @return the matrix where the elements of m and n are element-wise multiplied.
     */
    private static RealMatrix times(final RealMatrix m, final RealMatrix n) {try{__CLR4_4_1tvrtvrlb90p9sz.R.inc(39207);
        __CLR4_4_1tvrtvrlb90p9sz.R.inc(39208);final double[][] d = new double[m.getRowDimension()][m.getColumnDimension()];
        __CLR4_4_1tvrtvrlb90p9sz.R.inc(39209);for (int r = 0; (((r < m.getRowDimension())&&(__CLR4_4_1tvrtvrlb90p9sz.R.iget(39210)!=0|true))||(__CLR4_4_1tvrtvrlb90p9sz.R.iget(39211)==0&false)); r++) {{
            __CLR4_4_1tvrtvrlb90p9sz.R.inc(39212);for (int c = 0; (((c < m.getColumnDimension())&&(__CLR4_4_1tvrtvrlb90p9sz.R.iget(39213)!=0|true))||(__CLR4_4_1tvrtvrlb90p9sz.R.iget(39214)==0&false)); c++) {{
                __CLR4_4_1tvrtvrlb90p9sz.R.inc(39215);d[r][c] = m.getEntry(r, c) * n.getEntry(r, c);
            }
        }}
        }__CLR4_4_1tvrtvrlb90p9sz.R.inc(39216);return new Array2DRowRealMatrix(d, false);
    }finally{__CLR4_4_1tvrtvrlb90p9sz.R.flushNeeded();}}

    /**
     * @param m Input matrix 1.
     * @param n Input matrix 2.
     * @return Matrix where the elements of m and n are element-wise divided.
     */
    private static RealMatrix divide(final RealMatrix m, final RealMatrix n) {try{__CLR4_4_1tvrtvrlb90p9sz.R.inc(39217);
        __CLR4_4_1tvrtvrlb90p9sz.R.inc(39218);final double[][] d = new double[m.getRowDimension()][m.getColumnDimension()];
        __CLR4_4_1tvrtvrlb90p9sz.R.inc(39219);for (int r = 0; (((r < m.getRowDimension())&&(__CLR4_4_1tvrtvrlb90p9sz.R.iget(39220)!=0|true))||(__CLR4_4_1tvrtvrlb90p9sz.R.iget(39221)==0&false)); r++) {{
            __CLR4_4_1tvrtvrlb90p9sz.R.inc(39222);for (int c = 0; (((c < m.getColumnDimension())&&(__CLR4_4_1tvrtvrlb90p9sz.R.iget(39223)!=0|true))||(__CLR4_4_1tvrtvrlb90p9sz.R.iget(39224)==0&false)); c++) {{
                __CLR4_4_1tvrtvrlb90p9sz.R.inc(39225);d[r][c] = m.getEntry(r, c) / n.getEntry(r, c);
            }
        }}
        }__CLR4_4_1tvrtvrlb90p9sz.R.inc(39226);return new Array2DRowRealMatrix(d, false);
    }finally{__CLR4_4_1tvrtvrlb90p9sz.R.flushNeeded();}}

    /**
     * @param m Input matrix.
     * @param cols Columns to select.
     * @return Matrix representing the selected columns.
     */
    private static RealMatrix selectColumns(final RealMatrix m, final int[] cols) {try{__CLR4_4_1tvrtvrlb90p9sz.R.inc(39227);
        __CLR4_4_1tvrtvrlb90p9sz.R.inc(39228);final double[][] d = new double[m.getRowDimension()][cols.length];
        __CLR4_4_1tvrtvrlb90p9sz.R.inc(39229);for (int r = 0; (((r < m.getRowDimension())&&(__CLR4_4_1tvrtvrlb90p9sz.R.iget(39230)!=0|true))||(__CLR4_4_1tvrtvrlb90p9sz.R.iget(39231)==0&false)); r++) {{
            __CLR4_4_1tvrtvrlb90p9sz.R.inc(39232);for (int c = 0; (((c < cols.length)&&(__CLR4_4_1tvrtvrlb90p9sz.R.iget(39233)!=0|true))||(__CLR4_4_1tvrtvrlb90p9sz.R.iget(39234)==0&false)); c++) {{
                __CLR4_4_1tvrtvrlb90p9sz.R.inc(39235);d[r][c] = m.getEntry(r, cols[c]);
            }
        }}
        }__CLR4_4_1tvrtvrlb90p9sz.R.inc(39236);return new Array2DRowRealMatrix(d, false);
    }finally{__CLR4_4_1tvrtvrlb90p9sz.R.flushNeeded();}}

    /**
     * @param m Input matrix.
     * @param k Diagonal position.
     * @return Upper triangular part of matrix.
     */
    private static RealMatrix triu(final RealMatrix m, int k) {try{__CLR4_4_1tvrtvrlb90p9sz.R.inc(39237);
        __CLR4_4_1tvrtvrlb90p9sz.R.inc(39238);final double[][] d = new double[m.getRowDimension()][m.getColumnDimension()];
        __CLR4_4_1tvrtvrlb90p9sz.R.inc(39239);for (int r = 0; (((r < m.getRowDimension())&&(__CLR4_4_1tvrtvrlb90p9sz.R.iget(39240)!=0|true))||(__CLR4_4_1tvrtvrlb90p9sz.R.iget(39241)==0&false)); r++) {{
            __CLR4_4_1tvrtvrlb90p9sz.R.inc(39242);for (int c = 0; (((c < m.getColumnDimension())&&(__CLR4_4_1tvrtvrlb90p9sz.R.iget(39243)!=0|true))||(__CLR4_4_1tvrtvrlb90p9sz.R.iget(39244)==0&false)); c++) {{
                __CLR4_4_1tvrtvrlb90p9sz.R.inc(39245);d[r][c] = (((r <= c - k )&&(__CLR4_4_1tvrtvrlb90p9sz.R.iget(39246)!=0|true))||(__CLR4_4_1tvrtvrlb90p9sz.R.iget(39247)==0&false))? m.getEntry(r, c) : 0;
            }
        }}
        }__CLR4_4_1tvrtvrlb90p9sz.R.inc(39248);return new Array2DRowRealMatrix(d, false);
    }finally{__CLR4_4_1tvrtvrlb90p9sz.R.flushNeeded();}}

    /**
     * @param m Input matrix.
     * @return Row matrix representing the sums of the rows.
     */
    private static RealMatrix sumRows(final RealMatrix m) {try{__CLR4_4_1tvrtvrlb90p9sz.R.inc(39249);
        __CLR4_4_1tvrtvrlb90p9sz.R.inc(39250);final double[][] d = new double[1][m.getColumnDimension()];
        __CLR4_4_1tvrtvrlb90p9sz.R.inc(39251);for (int c = 0; (((c < m.getColumnDimension())&&(__CLR4_4_1tvrtvrlb90p9sz.R.iget(39252)!=0|true))||(__CLR4_4_1tvrtvrlb90p9sz.R.iget(39253)==0&false)); c++) {{
            __CLR4_4_1tvrtvrlb90p9sz.R.inc(39254);double sum = 0;
            __CLR4_4_1tvrtvrlb90p9sz.R.inc(39255);for (int r = 0; (((r < m.getRowDimension())&&(__CLR4_4_1tvrtvrlb90p9sz.R.iget(39256)!=0|true))||(__CLR4_4_1tvrtvrlb90p9sz.R.iget(39257)==0&false)); r++) {{
                __CLR4_4_1tvrtvrlb90p9sz.R.inc(39258);sum += m.getEntry(r, c);
            }
            }__CLR4_4_1tvrtvrlb90p9sz.R.inc(39259);d[0][c] = sum;
        }
        }__CLR4_4_1tvrtvrlb90p9sz.R.inc(39260);return new Array2DRowRealMatrix(d, false);
    }finally{__CLR4_4_1tvrtvrlb90p9sz.R.flushNeeded();}}

    /**
     * @param m Input matrix.
     * @return the diagonal n-by-n matrix if m is a column matrix or the column
     * matrix representing the diagonal if m is a n-by-n matrix.
     */
    private static RealMatrix diag(final RealMatrix m) {try{__CLR4_4_1tvrtvrlb90p9sz.R.inc(39261);
        __CLR4_4_1tvrtvrlb90p9sz.R.inc(39262);if ((((m.getColumnDimension() == 1)&&(__CLR4_4_1tvrtvrlb90p9sz.R.iget(39263)!=0|true))||(__CLR4_4_1tvrtvrlb90p9sz.R.iget(39264)==0&false))) {{
            __CLR4_4_1tvrtvrlb90p9sz.R.inc(39265);final double[][] d = new double[m.getRowDimension()][m.getRowDimension()];
            __CLR4_4_1tvrtvrlb90p9sz.R.inc(39266);for (int i = 0; (((i < m.getRowDimension())&&(__CLR4_4_1tvrtvrlb90p9sz.R.iget(39267)!=0|true))||(__CLR4_4_1tvrtvrlb90p9sz.R.iget(39268)==0&false)); i++) {{
                __CLR4_4_1tvrtvrlb90p9sz.R.inc(39269);d[i][i] = m.getEntry(i, 0);
            }
            }__CLR4_4_1tvrtvrlb90p9sz.R.inc(39270);return new Array2DRowRealMatrix(d, false);
        } }else {{
            __CLR4_4_1tvrtvrlb90p9sz.R.inc(39271);final double[][] d = new double[m.getRowDimension()][1];
            __CLR4_4_1tvrtvrlb90p9sz.R.inc(39272);for (int i = 0; (((i < m.getColumnDimension())&&(__CLR4_4_1tvrtvrlb90p9sz.R.iget(39273)!=0|true))||(__CLR4_4_1tvrtvrlb90p9sz.R.iget(39274)==0&false)); i++) {{
                __CLR4_4_1tvrtvrlb90p9sz.R.inc(39275);d[i][0] = m.getEntry(i, i);
            }
            }__CLR4_4_1tvrtvrlb90p9sz.R.inc(39276);return new Array2DRowRealMatrix(d, false);
        }
    }}finally{__CLR4_4_1tvrtvrlb90p9sz.R.flushNeeded();}}

    /**
     * Copies a column from m1 to m2.
     *
     * @param m1 Source matrix.
     * @param col1 Source column.
     * @param m2 Target matrix.
     * @param col2 Target column.
     */
    private static void copyColumn(final RealMatrix m1, int col1,
                                   RealMatrix m2, int col2) {try{__CLR4_4_1tvrtvrlb90p9sz.R.inc(39277);
        __CLR4_4_1tvrtvrlb90p9sz.R.inc(39278);for (int i = 0; (((i < m1.getRowDimension())&&(__CLR4_4_1tvrtvrlb90p9sz.R.iget(39279)!=0|true))||(__CLR4_4_1tvrtvrlb90p9sz.R.iget(39280)==0&false)); i++) {{
            __CLR4_4_1tvrtvrlb90p9sz.R.inc(39281);m2.setEntry(i, col2, m1.getEntry(i, col1));
        }
    }}finally{__CLR4_4_1tvrtvrlb90p9sz.R.flushNeeded();}}

    /**
     * @param n Number of rows.
     * @param m Number of columns.
     * @return n-by-m matrix filled with 1.
     */
    private static RealMatrix ones(int n, int m) {try{__CLR4_4_1tvrtvrlb90p9sz.R.inc(39282);
        __CLR4_4_1tvrtvrlb90p9sz.R.inc(39283);final double[][] d = new double[n][m];
        __CLR4_4_1tvrtvrlb90p9sz.R.inc(39284);for (int r = 0; (((r < n)&&(__CLR4_4_1tvrtvrlb90p9sz.R.iget(39285)!=0|true))||(__CLR4_4_1tvrtvrlb90p9sz.R.iget(39286)==0&false)); r++) {{
            __CLR4_4_1tvrtvrlb90p9sz.R.inc(39287);Arrays.fill(d[r], 1);
        }
        }__CLR4_4_1tvrtvrlb90p9sz.R.inc(39288);return new Array2DRowRealMatrix(d, false);
    }finally{__CLR4_4_1tvrtvrlb90p9sz.R.flushNeeded();}}

    /**
     * @param n Number of rows.
     * @param m Number of columns.
     * @return n-by-m matrix of 0 values out of diagonal, and 1 values on
     * the diagonal.
     */
    private static RealMatrix eye(int n, int m) {try{__CLR4_4_1tvrtvrlb90p9sz.R.inc(39289);
        __CLR4_4_1tvrtvrlb90p9sz.R.inc(39290);final double[][] d = new double[n][m];
        __CLR4_4_1tvrtvrlb90p9sz.R.inc(39291);for (int r = 0; (((r < n)&&(__CLR4_4_1tvrtvrlb90p9sz.R.iget(39292)!=0|true))||(__CLR4_4_1tvrtvrlb90p9sz.R.iget(39293)==0&false)); r++) {{
            __CLR4_4_1tvrtvrlb90p9sz.R.inc(39294);if ((((r < m)&&(__CLR4_4_1tvrtvrlb90p9sz.R.iget(39295)!=0|true))||(__CLR4_4_1tvrtvrlb90p9sz.R.iget(39296)==0&false))) {{
                __CLR4_4_1tvrtvrlb90p9sz.R.inc(39297);d[r][r] = 1;
            }
        }}
        }__CLR4_4_1tvrtvrlb90p9sz.R.inc(39298);return new Array2DRowRealMatrix(d, false);
    }finally{__CLR4_4_1tvrtvrlb90p9sz.R.flushNeeded();}}

    /**
     * @param n Number of rows.
     * @param m Number of columns.
     * @return n-by-m matrix of zero values.
     */
    private static RealMatrix zeros(int n, int m) {try{__CLR4_4_1tvrtvrlb90p9sz.R.inc(39299);
        __CLR4_4_1tvrtvrlb90p9sz.R.inc(39300);return new Array2DRowRealMatrix(n, m);
    }finally{__CLR4_4_1tvrtvrlb90p9sz.R.flushNeeded();}}

    /**
     * @param mat Input matrix.
     * @param n Number of row replicates.
     * @param m Number of column replicates.
     * @return a matrix which replicates the input matrix in both directions.
     */
    private static RealMatrix repmat(final RealMatrix mat, int n, int m) {try{__CLR4_4_1tvrtvrlb90p9sz.R.inc(39301);
        __CLR4_4_1tvrtvrlb90p9sz.R.inc(39302);final int rd = mat.getRowDimension();
        __CLR4_4_1tvrtvrlb90p9sz.R.inc(39303);final int cd = mat.getColumnDimension();
        __CLR4_4_1tvrtvrlb90p9sz.R.inc(39304);final double[][] d = new double[n * rd][m * cd];
        __CLR4_4_1tvrtvrlb90p9sz.R.inc(39305);for (int r = 0; (((r < n * rd)&&(__CLR4_4_1tvrtvrlb90p9sz.R.iget(39306)!=0|true))||(__CLR4_4_1tvrtvrlb90p9sz.R.iget(39307)==0&false)); r++) {{
            __CLR4_4_1tvrtvrlb90p9sz.R.inc(39308);for (int c = 0; (((c < m * cd)&&(__CLR4_4_1tvrtvrlb90p9sz.R.iget(39309)!=0|true))||(__CLR4_4_1tvrtvrlb90p9sz.R.iget(39310)==0&false)); c++) {{
                __CLR4_4_1tvrtvrlb90p9sz.R.inc(39311);d[r][c] = mat.getEntry(r % rd, c % cd);
            }
        }}
        }__CLR4_4_1tvrtvrlb90p9sz.R.inc(39312);return new Array2DRowRealMatrix(d, false);
    }finally{__CLR4_4_1tvrtvrlb90p9sz.R.flushNeeded();}}

    /**
     * @param start Start value.
     * @param end End value.
     * @param step Step size.
     * @return a sequence as column matrix.
     */
    private static RealMatrix sequence(double start, double end, double step) {try{__CLR4_4_1tvrtvrlb90p9sz.R.inc(39313);
        __CLR4_4_1tvrtvrlb90p9sz.R.inc(39314);final int size = (int) ((end - start) / step + 1);
        __CLR4_4_1tvrtvrlb90p9sz.R.inc(39315);final double[][] d = new double[size][1];
        __CLR4_4_1tvrtvrlb90p9sz.R.inc(39316);double value = start;
        __CLR4_4_1tvrtvrlb90p9sz.R.inc(39317);for (int r = 0; (((r < size)&&(__CLR4_4_1tvrtvrlb90p9sz.R.iget(39318)!=0|true))||(__CLR4_4_1tvrtvrlb90p9sz.R.iget(39319)==0&false)); r++) {{
            __CLR4_4_1tvrtvrlb90p9sz.R.inc(39320);d[r][0] = value;
            __CLR4_4_1tvrtvrlb90p9sz.R.inc(39321);value += step;
        }
        }__CLR4_4_1tvrtvrlb90p9sz.R.inc(39322);return new Array2DRowRealMatrix(d, false);
    }finally{__CLR4_4_1tvrtvrlb90p9sz.R.flushNeeded();}}

    /**
     * @param m Input matrix.
     * @return the maximum of the matrix element values.
     */
    private static double max(final RealMatrix m) {try{__CLR4_4_1tvrtvrlb90p9sz.R.inc(39323);
        __CLR4_4_1tvrtvrlb90p9sz.R.inc(39324);double max = -Double.MAX_VALUE;
        __CLR4_4_1tvrtvrlb90p9sz.R.inc(39325);for (int r = 0; (((r < m.getRowDimension())&&(__CLR4_4_1tvrtvrlb90p9sz.R.iget(39326)!=0|true))||(__CLR4_4_1tvrtvrlb90p9sz.R.iget(39327)==0&false)); r++) {{
            __CLR4_4_1tvrtvrlb90p9sz.R.inc(39328);for (int c = 0; (((c < m.getColumnDimension())&&(__CLR4_4_1tvrtvrlb90p9sz.R.iget(39329)!=0|true))||(__CLR4_4_1tvrtvrlb90p9sz.R.iget(39330)==0&false)); c++) {{
                __CLR4_4_1tvrtvrlb90p9sz.R.inc(39331);double e = m.getEntry(r, c);
                __CLR4_4_1tvrtvrlb90p9sz.R.inc(39332);if ((((max < e)&&(__CLR4_4_1tvrtvrlb90p9sz.R.iget(39333)!=0|true))||(__CLR4_4_1tvrtvrlb90p9sz.R.iget(39334)==0&false))) {{
                    __CLR4_4_1tvrtvrlb90p9sz.R.inc(39335);max = e;
                }
            }}
        }}
        }__CLR4_4_1tvrtvrlb90p9sz.R.inc(39336);return max;
    }finally{__CLR4_4_1tvrtvrlb90p9sz.R.flushNeeded();}}

    /**
     * @param m Input matrix.
     * @return the minimum of the matrix element values.
     */
    private static double min(final RealMatrix m) {try{__CLR4_4_1tvrtvrlb90p9sz.R.inc(39337);
        __CLR4_4_1tvrtvrlb90p9sz.R.inc(39338);double min = Double.MAX_VALUE;
        __CLR4_4_1tvrtvrlb90p9sz.R.inc(39339);for (int r = 0; (((r < m.getRowDimension())&&(__CLR4_4_1tvrtvrlb90p9sz.R.iget(39340)!=0|true))||(__CLR4_4_1tvrtvrlb90p9sz.R.iget(39341)==0&false)); r++) {{
            __CLR4_4_1tvrtvrlb90p9sz.R.inc(39342);for (int c = 0; (((c < m.getColumnDimension())&&(__CLR4_4_1tvrtvrlb90p9sz.R.iget(39343)!=0|true))||(__CLR4_4_1tvrtvrlb90p9sz.R.iget(39344)==0&false)); c++) {{
                __CLR4_4_1tvrtvrlb90p9sz.R.inc(39345);double e = m.getEntry(r, c);
                __CLR4_4_1tvrtvrlb90p9sz.R.inc(39346);if ((((min > e)&&(__CLR4_4_1tvrtvrlb90p9sz.R.iget(39347)!=0|true))||(__CLR4_4_1tvrtvrlb90p9sz.R.iget(39348)==0&false))) {{
                    __CLR4_4_1tvrtvrlb90p9sz.R.inc(39349);min = e;
                }
            }}
        }}
        }__CLR4_4_1tvrtvrlb90p9sz.R.inc(39350);return min;
    }finally{__CLR4_4_1tvrtvrlb90p9sz.R.flushNeeded();}}

    /**
     * @param m Input array.
     * @return the maximum of the array values.
     */
    private static double max(final double[] m) {try{__CLR4_4_1tvrtvrlb90p9sz.R.inc(39351);
        __CLR4_4_1tvrtvrlb90p9sz.R.inc(39352);double max = -Double.MAX_VALUE;
        __CLR4_4_1tvrtvrlb90p9sz.R.inc(39353);for (int r = 0; (((r < m.length)&&(__CLR4_4_1tvrtvrlb90p9sz.R.iget(39354)!=0|true))||(__CLR4_4_1tvrtvrlb90p9sz.R.iget(39355)==0&false)); r++) {{
            __CLR4_4_1tvrtvrlb90p9sz.R.inc(39356);if ((((max < m[r])&&(__CLR4_4_1tvrtvrlb90p9sz.R.iget(39357)!=0|true))||(__CLR4_4_1tvrtvrlb90p9sz.R.iget(39358)==0&false))) {{
                __CLR4_4_1tvrtvrlb90p9sz.R.inc(39359);max = m[r];
            }
        }}
        }__CLR4_4_1tvrtvrlb90p9sz.R.inc(39360);return max;
    }finally{__CLR4_4_1tvrtvrlb90p9sz.R.flushNeeded();}}

    /**
     * @param m Input array.
     * @return the minimum of the array values.
     */
    private static double min(final double[] m) {try{__CLR4_4_1tvrtvrlb90p9sz.R.inc(39361);
        __CLR4_4_1tvrtvrlb90p9sz.R.inc(39362);double min = Double.MAX_VALUE;
        __CLR4_4_1tvrtvrlb90p9sz.R.inc(39363);for (int r = 0; (((r < m.length)&&(__CLR4_4_1tvrtvrlb90p9sz.R.iget(39364)!=0|true))||(__CLR4_4_1tvrtvrlb90p9sz.R.iget(39365)==0&false)); r++) {{
            __CLR4_4_1tvrtvrlb90p9sz.R.inc(39366);if ((((min > m[r])&&(__CLR4_4_1tvrtvrlb90p9sz.R.iget(39367)!=0|true))||(__CLR4_4_1tvrtvrlb90p9sz.R.iget(39368)==0&false))) {{
                __CLR4_4_1tvrtvrlb90p9sz.R.inc(39369);min = m[r];
            }
        }}
        }__CLR4_4_1tvrtvrlb90p9sz.R.inc(39370);return min;
    }finally{__CLR4_4_1tvrtvrlb90p9sz.R.flushNeeded();}}

    /**
     * @param indices Input index array.
     * @return the inverse of the mapping defined by indices.
     */
    private static int[] inverse(final int[] indices) {try{__CLR4_4_1tvrtvrlb90p9sz.R.inc(39371);
        __CLR4_4_1tvrtvrlb90p9sz.R.inc(39372);final int[] inverse = new int[indices.length];
        __CLR4_4_1tvrtvrlb90p9sz.R.inc(39373);for (int i = 0; (((i < indices.length)&&(__CLR4_4_1tvrtvrlb90p9sz.R.iget(39374)!=0|true))||(__CLR4_4_1tvrtvrlb90p9sz.R.iget(39375)==0&false)); i++) {{
            __CLR4_4_1tvrtvrlb90p9sz.R.inc(39376);inverse[indices[i]] = i;
        }
        }__CLR4_4_1tvrtvrlb90p9sz.R.inc(39377);return inverse;
    }finally{__CLR4_4_1tvrtvrlb90p9sz.R.flushNeeded();}}

    /**
     * @param indices Input index array.
     * @return the indices in inverse order (last is first).
     */
    private static int[] reverse(final int[] indices) {try{__CLR4_4_1tvrtvrlb90p9sz.R.inc(39378);
        __CLR4_4_1tvrtvrlb90p9sz.R.inc(39379);final int[] reverse = new int[indices.length];
        __CLR4_4_1tvrtvrlb90p9sz.R.inc(39380);for (int i = 0; (((i < indices.length)&&(__CLR4_4_1tvrtvrlb90p9sz.R.iget(39381)!=0|true))||(__CLR4_4_1tvrtvrlb90p9sz.R.iget(39382)==0&false)); i++) {{
            __CLR4_4_1tvrtvrlb90p9sz.R.inc(39383);reverse[i] = indices[indices.length - i - 1];
        }
        }__CLR4_4_1tvrtvrlb90p9sz.R.inc(39384);return reverse;
    }finally{__CLR4_4_1tvrtvrlb90p9sz.R.flushNeeded();}}

    /**
     * @param size Length of random array.
     * @return an array of Gaussian random numbers.
     */
    private double[] randn(int size) {try{__CLR4_4_1tvrtvrlb90p9sz.R.inc(39385);
        __CLR4_4_1tvrtvrlb90p9sz.R.inc(39386);final double[] randn = new double[size];
        __CLR4_4_1tvrtvrlb90p9sz.R.inc(39387);for (int i = 0; (((i < size)&&(__CLR4_4_1tvrtvrlb90p9sz.R.iget(39388)!=0|true))||(__CLR4_4_1tvrtvrlb90p9sz.R.iget(39389)==0&false)); i++) {{
            __CLR4_4_1tvrtvrlb90p9sz.R.inc(39390);randn[i] = random.nextGaussian();
        }
        }__CLR4_4_1tvrtvrlb90p9sz.R.inc(39391);return randn;
    }finally{__CLR4_4_1tvrtvrlb90p9sz.R.flushNeeded();}}

    /**
     * @param size Number of rows.
     * @param popSize Population size.
     * @return a 2-dimensional matrix of Gaussian random numbers.
     */
    private RealMatrix randn1(int size, int popSize) {try{__CLR4_4_1tvrtvrlb90p9sz.R.inc(39392);
        __CLR4_4_1tvrtvrlb90p9sz.R.inc(39393);final double[][] d = new double[size][popSize];
        __CLR4_4_1tvrtvrlb90p9sz.R.inc(39394);for (int r = 0; (((r < size)&&(__CLR4_4_1tvrtvrlb90p9sz.R.iget(39395)!=0|true))||(__CLR4_4_1tvrtvrlb90p9sz.R.iget(39396)==0&false)); r++) {{
            __CLR4_4_1tvrtvrlb90p9sz.R.inc(39397);for (int c = 0; (((c < popSize)&&(__CLR4_4_1tvrtvrlb90p9sz.R.iget(39398)!=0|true))||(__CLR4_4_1tvrtvrlb90p9sz.R.iget(39399)==0&false)); c++) {{
                __CLR4_4_1tvrtvrlb90p9sz.R.inc(39400);d[r][c] = random.nextGaussian();
            }
        }}
        }__CLR4_4_1tvrtvrlb90p9sz.R.inc(39401);return new Array2DRowRealMatrix(d, false);
    }finally{__CLR4_4_1tvrtvrlb90p9sz.R.flushNeeded();}}
}
