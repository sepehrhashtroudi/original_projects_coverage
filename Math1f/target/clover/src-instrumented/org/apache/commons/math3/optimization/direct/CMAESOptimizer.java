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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.math3.analysis.MultivariateFunction;
import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.exception.NotPositiveException;
import org.apache.commons.math3.exception.NotStrictlyPositiveException;
import org.apache.commons.math3.exception.OutOfRangeException;
import org.apache.commons.math3.exception.TooManyEvaluationsException;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.EigenDecomposition;
import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.optimization.ConvergenceChecker;
import org.apache.commons.math3.optimization.OptimizationData;
import org.apache.commons.math3.optimization.GoalType;
import org.apache.commons.math3.optimization.MultivariateOptimizer;
import org.apache.commons.math3.optimization.PointValuePair;
import org.apache.commons.math3.optimization.SimpleValueChecker;
import org.apache.commons.math3.random.MersenneTwister;
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
 * @deprecated As of 3.1 (to be removed in 4.0).
 * @since 3.0
 */

@Deprecated
public class CMAESOptimizer
    extends BaseAbstractMultivariateSimpleBoundsOptimizer<MultivariateFunction>
    implements MultivariateOptimizer {public static class __CLR4_4_1xlixlilb90pa23{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,44243,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /** Default value for {@link #checkFeasableCount}: {@value}. */
    public static final int DEFAULT_CHECKFEASABLECOUNT = 0;
    /** Default value for {@link #stopFitness}: {@value}. */
    public static final double DEFAULT_STOPFITNESS = 0;
    /** Default value for {@link #isActiveCMA}: {@value}. */
    public static final boolean DEFAULT_ISACTIVECMA = true;
    /** Default value for {@link #maxIterations}: {@value}. */
    public static final int DEFAULT_MAXITERATIONS = 30000;
    /** Default value for {@link #diagonalOnly}: {@value}. */
    public static final int DEFAULT_DIAGONALONLY = 0;
    /** Default value for {@link #random}. */
    public static final RandomGenerator DEFAULT_RANDOMGENERATOR = new MersenneTwister();

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
    private boolean isActiveCMA;
    /**
     * Determines how often a new random offspring is generated in case it is
     * not feasible / beyond the defined limits, default is 0.
     */
    private int checkFeasableCount;
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
    private int diagonalOnly = 0;
    /** Number of objective variables/problem dimension */
    private boolean isMinimize = true;
    /** Indicates whether statistic data is collected. */
    private boolean generateStatistics = false;

    // termination criteria
    /** Maximal number of iterations allowed. */
    private int maxIterations;
    /** Limit for fitness value. */
    private double stopFitness;
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
    private RandomGenerator random;

    /** History of sigma values. */
    private List<Double> statisticsSigmaHistory = new ArrayList<Double>();
    /** History of mean matrix. */
    private List<RealMatrix> statisticsMeanHistory = new ArrayList<RealMatrix>();
    /** History of fitness values. */
    private List<Double> statisticsFitnessHistory = new ArrayList<Double>();
    /** History of D matrix. */
    private List<RealMatrix> statisticsDHistory = new ArrayList<RealMatrix>();

    /**
     * Default constructor, uses default parameters
     *
     * @deprecated As of version 3.1: Parameter {@code lambda} must be
     * passed with the call to {@link #optimize(int,MultivariateFunction,GoalType,OptimizationData[])
     * optimize} (whereas in the current code it is set to an undocumented value).
     */
    @Deprecated
    public CMAESOptimizer() {
        this(0);__CLR4_4_1xlixlilb90pa23.R.inc(43543);try{__CLR4_4_1xlixlilb90pa23.R.inc(43542);
    }finally{__CLR4_4_1xlixlilb90pa23.R.flushNeeded();}}

    /**
     * @param lambda Population size.
     * @deprecated As of version 3.1: Parameter {@code lambda} must be
     * passed with the call to {@link #optimize(int,MultivariateFunction,GoalType,OptimizationData[])
     * optimize} (whereas in the current code it is set to an undocumented value)..
     */
    @Deprecated
    public CMAESOptimizer(int lambda) {
        this(lambda, null, DEFAULT_MAXITERATIONS, DEFAULT_STOPFITNESS,
             DEFAULT_ISACTIVECMA, DEFAULT_DIAGONALONLY,
             DEFAULT_CHECKFEASABLECOUNT, DEFAULT_RANDOMGENERATOR,
             false, null);__CLR4_4_1xlixlilb90pa23.R.inc(43545);try{__CLR4_4_1xlixlilb90pa23.R.inc(43544);
    }finally{__CLR4_4_1xlixlilb90pa23.R.flushNeeded();}}

    /**
     * @param lambda Population size.
     * @param inputSigma Initial standard deviations to sample new points
     * around the initial guess.
     * @deprecated As of version 3.1: Parameters {@code lambda} and {@code inputSigma} must be
     * passed with the call to {@link #optimize(int,MultivariateFunction,GoalType,OptimizationData[])
     * optimize}.
     */
    @Deprecated
    public CMAESOptimizer(int lambda, double[] inputSigma) {
        this(lambda, inputSigma, DEFAULT_MAXITERATIONS, DEFAULT_STOPFITNESS,
             DEFAULT_ISACTIVECMA, DEFAULT_DIAGONALONLY,
             DEFAULT_CHECKFEASABLECOUNT, DEFAULT_RANDOMGENERATOR, false);__CLR4_4_1xlixlilb90pa23.R.inc(43547);try{__CLR4_4_1xlixlilb90pa23.R.inc(43546);
    }finally{__CLR4_4_1xlixlilb90pa23.R.flushNeeded();}}

    /**
     * @param lambda Population size.
     * @param inputSigma Initial standard deviations to sample new points
     * around the initial guess.
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
     * @deprecated See {@link SimpleValueChecker#SimpleValueChecker()}
     */
    @Deprecated
    public CMAESOptimizer(int lambda, double[] inputSigma,
                          int maxIterations, double stopFitness,
                          boolean isActiveCMA, int diagonalOnly, int checkFeasableCount,
                          RandomGenerator random, boolean generateStatistics) {
        this(lambda, inputSigma, maxIterations, stopFitness, isActiveCMA,
             diagonalOnly, checkFeasableCount, random, generateStatistics,
             new SimpleValueChecker());__CLR4_4_1xlixlilb90pa23.R.inc(43549);try{__CLR4_4_1xlixlilb90pa23.R.inc(43548);
    }finally{__CLR4_4_1xlixlilb90pa23.R.flushNeeded();}}

    /**
     * @param lambda Population size.
     * @param inputSigma Initial standard deviations to sample new points
     * around the initial guess.
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
     * @deprecated As of version 3.1: Parameters {@code lambda} and {@code inputSigma} must be
     * passed with the call to {@link #optimize(int,MultivariateFunction,GoalType,OptimizationData[])
     * optimize}.
     */
    @Deprecated
    public CMAESOptimizer(int lambda, double[] inputSigma,
                          int maxIterations, double stopFitness,
                          boolean isActiveCMA, int diagonalOnly, int checkFeasableCount,
                          RandomGenerator random, boolean generateStatistics,
                          ConvergenceChecker<PointValuePair> checker) {
        super(checker);__CLR4_4_1xlixlilb90pa23.R.inc(43551);try{__CLR4_4_1xlixlilb90pa23.R.inc(43550);
        __CLR4_4_1xlixlilb90pa23.R.inc(43552);this.lambda = lambda;
        __CLR4_4_1xlixlilb90pa23.R.inc(43553);this.inputSigma = (((inputSigma == null )&&(__CLR4_4_1xlixlilb90pa23.R.iget(43554)!=0|true))||(__CLR4_4_1xlixlilb90pa23.R.iget(43555)==0&false))? null : (double[]) inputSigma.clone();
        __CLR4_4_1xlixlilb90pa23.R.inc(43556);this.maxIterations = maxIterations;
        __CLR4_4_1xlixlilb90pa23.R.inc(43557);this.stopFitness = stopFitness;
        __CLR4_4_1xlixlilb90pa23.R.inc(43558);this.isActiveCMA = isActiveCMA;
        __CLR4_4_1xlixlilb90pa23.R.inc(43559);this.diagonalOnly = diagonalOnly;
        __CLR4_4_1xlixlilb90pa23.R.inc(43560);this.checkFeasableCount = checkFeasableCount;
        __CLR4_4_1xlixlilb90pa23.R.inc(43561);this.random = random;
        __CLR4_4_1xlixlilb90pa23.R.inc(43562);this.generateStatistics = generateStatistics;
    }finally{__CLR4_4_1xlixlilb90pa23.R.flushNeeded();}}

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
        super(checker);__CLR4_4_1xlixlilb90pa23.R.inc(43564);try{__CLR4_4_1xlixlilb90pa23.R.inc(43563);
        __CLR4_4_1xlixlilb90pa23.R.inc(43565);this.maxIterations = maxIterations;
        __CLR4_4_1xlixlilb90pa23.R.inc(43566);this.stopFitness = stopFitness;
        __CLR4_4_1xlixlilb90pa23.R.inc(43567);this.isActiveCMA = isActiveCMA;
        __CLR4_4_1xlixlilb90pa23.R.inc(43568);this.diagonalOnly = diagonalOnly;
        __CLR4_4_1xlixlilb90pa23.R.inc(43569);this.checkFeasableCount = checkFeasableCount;
        __CLR4_4_1xlixlilb90pa23.R.inc(43570);this.random = random;
        __CLR4_4_1xlixlilb90pa23.R.inc(43571);this.generateStatistics = generateStatistics;
    }finally{__CLR4_4_1xlixlilb90pa23.R.flushNeeded();}}

    /**
     * @return History of sigma values.
     */
    public List<Double> getStatisticsSigmaHistory() {try{__CLR4_4_1xlixlilb90pa23.R.inc(43572);
        __CLR4_4_1xlixlilb90pa23.R.inc(43573);return statisticsSigmaHistory;
    }finally{__CLR4_4_1xlixlilb90pa23.R.flushNeeded();}}

    /**
     * @return History of mean matrix.
     */
    public List<RealMatrix> getStatisticsMeanHistory() {try{__CLR4_4_1xlixlilb90pa23.R.inc(43574);
        __CLR4_4_1xlixlilb90pa23.R.inc(43575);return statisticsMeanHistory;
    }finally{__CLR4_4_1xlixlilb90pa23.R.flushNeeded();}}

    /**
     * @return History of fitness values.
     */
    public List<Double> getStatisticsFitnessHistory() {try{__CLR4_4_1xlixlilb90pa23.R.inc(43576);
        __CLR4_4_1xlixlilb90pa23.R.inc(43577);return statisticsFitnessHistory;
    }finally{__CLR4_4_1xlixlilb90pa23.R.flushNeeded();}}

    /**
     * @return History of D matrix.
     */
    public List<RealMatrix> getStatisticsDHistory() {try{__CLR4_4_1xlixlilb90pa23.R.inc(43578);
        __CLR4_4_1xlixlilb90pa23.R.inc(43579);return statisticsDHistory;
    }finally{__CLR4_4_1xlixlilb90pa23.R.flushNeeded();}}

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
     * @since 3.1
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
            throws NotPositiveException {try{__CLR4_4_1xlixlilb90pa23.R.inc(43580);
            __CLR4_4_1xlixlilb90pa23.R.inc(43581);for (int i = 0; (((i < s.length)&&(__CLR4_4_1xlixlilb90pa23.R.iget(43582)!=0|true))||(__CLR4_4_1xlixlilb90pa23.R.iget(43583)==0&false)); i++) {{
                __CLR4_4_1xlixlilb90pa23.R.inc(43584);if ((((s[i] < 0)&&(__CLR4_4_1xlixlilb90pa23.R.iget(43585)!=0|true))||(__CLR4_4_1xlixlilb90pa23.R.iget(43586)==0&false))) {{
                    __CLR4_4_1xlixlilb90pa23.R.inc(43587);throw new NotPositiveException(s[i]);
                }
            }}

            }__CLR4_4_1xlixlilb90pa23.R.inc(43588);sigma = s.clone();
        }finally{__CLR4_4_1xlixlilb90pa23.R.flushNeeded();}}

        /**
         * @return the sigma values.
         */
        public double[] getSigma() {try{__CLR4_4_1xlixlilb90pa23.R.inc(43589);
            __CLR4_4_1xlixlilb90pa23.R.inc(43590);return sigma.clone();
        }finally{__CLR4_4_1xlixlilb90pa23.R.flushNeeded();}}
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
     * @since 3.1
     */
    public static class PopulationSize implements OptimizationData {
        /** Population size. */
        private final int lambda;

        /**
         * @param size Population size.
         * @throws NotStrictlyPositiveException if {@code size <= 0}.
         */
        public PopulationSize(int size)
            throws NotStrictlyPositiveException {try{__CLR4_4_1xlixlilb90pa23.R.inc(43591);
            __CLR4_4_1xlixlilb90pa23.R.inc(43592);if ((((size <= 0)&&(__CLR4_4_1xlixlilb90pa23.R.iget(43593)!=0|true))||(__CLR4_4_1xlixlilb90pa23.R.iget(43594)==0&false))) {{
                __CLR4_4_1xlixlilb90pa23.R.inc(43595);throw new NotStrictlyPositiveException(size);
            }
            }__CLR4_4_1xlixlilb90pa23.R.inc(43596);lambda = size;
        }finally{__CLR4_4_1xlixlilb90pa23.R.flushNeeded();}}

        /**
         * @return the population size.
         */
        public int getPopulationSize() {try{__CLR4_4_1xlixlilb90pa23.R.inc(43597);
            __CLR4_4_1xlixlilb90pa23.R.inc(43598);return lambda;
        }finally{__CLR4_4_1xlixlilb90pa23.R.flushNeeded();}}
    }

    /**
     * Optimize an objective function.
     *
     * @param maxEval Allowed number of evaluations of the objective function.
     * @param f Objective function.
     * @param goalType Optimization type.
     * @param optData Optimization data. The following data will be looked for:
     * <ul>
     *  <li>{@link org.apache.commons.math3.optimization.InitialGuess InitialGuess}</li>
     *  <li>{@link Sigma}</li>
     *  <li>{@link PopulationSize}</li>
     * </ul>
     * @return the point/value pair giving the optimal value for objective
     * function.
     */
    @Override
    protected PointValuePair optimizeInternal(int maxEval, MultivariateFunction f,
                                              GoalType goalType,
                                              OptimizationData... optData) {try{__CLR4_4_1xlixlilb90pa23.R.inc(43599);
        // Scan "optData" for the input specific to this optimizer.
        __CLR4_4_1xlixlilb90pa23.R.inc(43600);parseOptimizationData(optData);

        // The parent's method will retrieve the common parameters from
        // "optData" and call "doOptimize".
        __CLR4_4_1xlixlilb90pa23.R.inc(43601);return super.optimizeInternal(maxEval, f, goalType, optData);
    }finally{__CLR4_4_1xlixlilb90pa23.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    protected PointValuePair doOptimize() {try{__CLR4_4_1xlixlilb90pa23.R.inc(43602);
        __CLR4_4_1xlixlilb90pa23.R.inc(43603);checkParameters();
         // -------------------- Initialization --------------------------------
        __CLR4_4_1xlixlilb90pa23.R.inc(43604);isMinimize = getGoalType().equals(GoalType.MINIMIZE);
        __CLR4_4_1xlixlilb90pa23.R.inc(43605);final FitnessFunction fitfun = new FitnessFunction();
        __CLR4_4_1xlixlilb90pa23.R.inc(43606);final double[] guess = getStartPoint();
        // number of objective variables/problem dimension
        __CLR4_4_1xlixlilb90pa23.R.inc(43607);dimension = guess.length;
        __CLR4_4_1xlixlilb90pa23.R.inc(43608);initializeCMA(guess);
        __CLR4_4_1xlixlilb90pa23.R.inc(43609);iterations = 0;
        __CLR4_4_1xlixlilb90pa23.R.inc(43610);double bestValue = fitfun.value(guess);
        __CLR4_4_1xlixlilb90pa23.R.inc(43611);push(fitnessHistory, bestValue);
        __CLR4_4_1xlixlilb90pa23.R.inc(43612);PointValuePair optimum = new PointValuePair(getStartPoint(),
                (((isMinimize )&&(__CLR4_4_1xlixlilb90pa23.R.iget(43613)!=0|true))||(__CLR4_4_1xlixlilb90pa23.R.iget(43614)==0&false))? bestValue : -bestValue);
        __CLR4_4_1xlixlilb90pa23.R.inc(43615);PointValuePair lastResult = null;

        // -------------------- Generation Loop --------------------------------

        __CLR4_4_1xlixlilb90pa23.R.inc(43616);generationLoop:
        for (iterations = 1; (((iterations <= maxIterations)&&(__CLR4_4_1xlixlilb90pa23.R.iget(43617)!=0|true))||(__CLR4_4_1xlixlilb90pa23.R.iget(43618)==0&false)); iterations++) {{
            // Generate and evaluate lambda offspring
            __CLR4_4_1xlixlilb90pa23.R.inc(43619);final RealMatrix arz = randn1(dimension, lambda);
            __CLR4_4_1xlixlilb90pa23.R.inc(43620);final RealMatrix arx = zeros(dimension, lambda);
            __CLR4_4_1xlixlilb90pa23.R.inc(43621);final double[] fitness = new double[lambda];
            // generate random offspring
            __CLR4_4_1xlixlilb90pa23.R.inc(43622);for (int k = 0; (((k < lambda)&&(__CLR4_4_1xlixlilb90pa23.R.iget(43623)!=0|true))||(__CLR4_4_1xlixlilb90pa23.R.iget(43624)==0&false)); k++) {{
                __CLR4_4_1xlixlilb90pa23.R.inc(43625);RealMatrix arxk = null;
                __CLR4_4_1xlixlilb90pa23.R.inc(43626);for (int i = 0; (((i < checkFeasableCount + 1)&&(__CLR4_4_1xlixlilb90pa23.R.iget(43627)!=0|true))||(__CLR4_4_1xlixlilb90pa23.R.iget(43628)==0&false)); i++) {{
                    __CLR4_4_1xlixlilb90pa23.R.inc(43629);if ((((diagonalOnly <= 0)&&(__CLR4_4_1xlixlilb90pa23.R.iget(43630)!=0|true))||(__CLR4_4_1xlixlilb90pa23.R.iget(43631)==0&false))) {{
                        __CLR4_4_1xlixlilb90pa23.R.inc(43632);arxk = xmean.add(BD.multiply(arz.getColumnMatrix(k))
                                         .scalarMultiply(sigma)); // m + sig * Normal(0,C)
                    } }else {{
                        __CLR4_4_1xlixlilb90pa23.R.inc(43633);arxk = xmean.add(times(diagD,arz.getColumnMatrix(k))
                                         .scalarMultiply(sigma));
                    }
                    }__CLR4_4_1xlixlilb90pa23.R.inc(43634);if ((((i >= checkFeasableCount ||
                        fitfun.isFeasible(arxk.getColumn(0)))&&(__CLR4_4_1xlixlilb90pa23.R.iget(43635)!=0|true))||(__CLR4_4_1xlixlilb90pa23.R.iget(43636)==0&false))) {{
                        __CLR4_4_1xlixlilb90pa23.R.inc(43637);break;
                    }
                    // regenerate random arguments for row
                    }__CLR4_4_1xlixlilb90pa23.R.inc(43638);arz.setColumn(k, randn(dimension));
                }
                }__CLR4_4_1xlixlilb90pa23.R.inc(43639);copyColumn(arxk, 0, arx, k);
                __CLR4_4_1xlixlilb90pa23.R.inc(43640);try {
                    __CLR4_4_1xlixlilb90pa23.R.inc(43641);fitness[k] = fitfun.value(arx.getColumn(k)); // compute fitness
                } catch (TooManyEvaluationsException e) {
                    __CLR4_4_1xlixlilb90pa23.R.inc(43642);break generationLoop;
                }
            }
            // Sort by fitness and compute weighted mean into xmean
            }__CLR4_4_1xlixlilb90pa23.R.inc(43643);final int[] arindex = sortedIndices(fitness);
            // Calculate new xmean, this is selection and recombination
            __CLR4_4_1xlixlilb90pa23.R.inc(43644);final RealMatrix xold = xmean; // for speed up of Eq. (2) and (3)
            __CLR4_4_1xlixlilb90pa23.R.inc(43645);final RealMatrix bestArx = selectColumns(arx, MathArrays.copyOf(arindex, mu));
            __CLR4_4_1xlixlilb90pa23.R.inc(43646);xmean = bestArx.multiply(weights);
            __CLR4_4_1xlixlilb90pa23.R.inc(43647);final RealMatrix bestArz = selectColumns(arz, MathArrays.copyOf(arindex, mu));
            __CLR4_4_1xlixlilb90pa23.R.inc(43648);final RealMatrix zmean = bestArz.multiply(weights);
            __CLR4_4_1xlixlilb90pa23.R.inc(43649);final boolean hsig = updateEvolutionPaths(zmean, xold);
            __CLR4_4_1xlixlilb90pa23.R.inc(43650);if ((((diagonalOnly <= 0)&&(__CLR4_4_1xlixlilb90pa23.R.iget(43651)!=0|true))||(__CLR4_4_1xlixlilb90pa23.R.iget(43652)==0&false))) {{
                __CLR4_4_1xlixlilb90pa23.R.inc(43653);updateCovariance(hsig, bestArx, arz, arindex, xold);
            } }else {{
                __CLR4_4_1xlixlilb90pa23.R.inc(43654);updateCovarianceDiagonalOnly(hsig, bestArz);
            }
            // Adapt step size sigma - Eq. (5)
            }__CLR4_4_1xlixlilb90pa23.R.inc(43655);sigma *= Math.exp(Math.min(1, (normps/chiN - 1) * cs / damps));
            __CLR4_4_1xlixlilb90pa23.R.inc(43656);final double bestFitness = fitness[arindex[0]];
            __CLR4_4_1xlixlilb90pa23.R.inc(43657);final double worstFitness = fitness[arindex[arindex.length - 1]];
            __CLR4_4_1xlixlilb90pa23.R.inc(43658);if ((((bestValue > bestFitness)&&(__CLR4_4_1xlixlilb90pa23.R.iget(43659)!=0|true))||(__CLR4_4_1xlixlilb90pa23.R.iget(43660)==0&false))) {{
                __CLR4_4_1xlixlilb90pa23.R.inc(43661);bestValue = bestFitness;
                __CLR4_4_1xlixlilb90pa23.R.inc(43662);lastResult = optimum;
                __CLR4_4_1xlixlilb90pa23.R.inc(43663);optimum = new PointValuePair(fitfun.repair(bestArx.getColumn(0)),
                                             (((isMinimize )&&(__CLR4_4_1xlixlilb90pa23.R.iget(43664)!=0|true))||(__CLR4_4_1xlixlilb90pa23.R.iget(43665)==0&false))? bestFitness : -bestFitness);
                __CLR4_4_1xlixlilb90pa23.R.inc(43666);if ((((getConvergenceChecker() != null && lastResult != null &&
                    getConvergenceChecker().converged(iterations, optimum, lastResult))&&(__CLR4_4_1xlixlilb90pa23.R.iget(43667)!=0|true))||(__CLR4_4_1xlixlilb90pa23.R.iget(43668)==0&false))) {{
                    __CLR4_4_1xlixlilb90pa23.R.inc(43669);break generationLoop;
                }
            }}
            // handle termination criteria
            // Break, if fitness is good enough
            }__CLR4_4_1xlixlilb90pa23.R.inc(43670);if ((((stopFitness != 0 && bestFitness < ((((isMinimize )&&(__CLR4_4_1xlixlilb90pa23.R.iget(43671)!=0|true))||(__CLR4_4_1xlixlilb90pa23.R.iget(43672)==0&false))? stopFitness : -stopFitness))&&(__CLR4_4_1xlixlilb90pa23.R.iget(43673)!=0|true))||(__CLR4_4_1xlixlilb90pa23.R.iget(43674)==0&false))) {{
                __CLR4_4_1xlixlilb90pa23.R.inc(43675);break generationLoop;
            }
            }__CLR4_4_1xlixlilb90pa23.R.inc(43676);final double[] sqrtDiagC = sqrt(diagC).getColumn(0);
            __CLR4_4_1xlixlilb90pa23.R.inc(43677);final double[] pcCol = pc.getColumn(0);
            __CLR4_4_1xlixlilb90pa23.R.inc(43678);for (int i = 0; (((i < dimension)&&(__CLR4_4_1xlixlilb90pa23.R.iget(43679)!=0|true))||(__CLR4_4_1xlixlilb90pa23.R.iget(43680)==0&false)); i++) {{
                __CLR4_4_1xlixlilb90pa23.R.inc(43681);if ((((sigma * Math.max(Math.abs(pcCol[i]), sqrtDiagC[i]) > stopTolX)&&(__CLR4_4_1xlixlilb90pa23.R.iget(43682)!=0|true))||(__CLR4_4_1xlixlilb90pa23.R.iget(43683)==0&false))) {{
                    __CLR4_4_1xlixlilb90pa23.R.inc(43684);break;
                }
                }__CLR4_4_1xlixlilb90pa23.R.inc(43685);if ((((i >= dimension - 1)&&(__CLR4_4_1xlixlilb90pa23.R.iget(43686)!=0|true))||(__CLR4_4_1xlixlilb90pa23.R.iget(43687)==0&false))) {{
                    __CLR4_4_1xlixlilb90pa23.R.inc(43688);break generationLoop;
                }
            }}
            }__CLR4_4_1xlixlilb90pa23.R.inc(43689);for (int i = 0; (((i < dimension)&&(__CLR4_4_1xlixlilb90pa23.R.iget(43690)!=0|true))||(__CLR4_4_1xlixlilb90pa23.R.iget(43691)==0&false)); i++) {{
                __CLR4_4_1xlixlilb90pa23.R.inc(43692);if ((((sigma * sqrtDiagC[i] > stopTolUpX)&&(__CLR4_4_1xlixlilb90pa23.R.iget(43693)!=0|true))||(__CLR4_4_1xlixlilb90pa23.R.iget(43694)==0&false))) {{
                    __CLR4_4_1xlixlilb90pa23.R.inc(43695);break generationLoop;
                }
            }}
            }__CLR4_4_1xlixlilb90pa23.R.inc(43696);final double historyBest = min(fitnessHistory);
            __CLR4_4_1xlixlilb90pa23.R.inc(43697);final double historyWorst = max(fitnessHistory);
            __CLR4_4_1xlixlilb90pa23.R.inc(43698);if ((((iterations > 2 &&
                Math.max(historyWorst, worstFitness) -
                Math.min(historyBest, bestFitness) < stopTolFun)&&(__CLR4_4_1xlixlilb90pa23.R.iget(43699)!=0|true))||(__CLR4_4_1xlixlilb90pa23.R.iget(43700)==0&false))) {{
                __CLR4_4_1xlixlilb90pa23.R.inc(43701);break generationLoop;
            }
            }__CLR4_4_1xlixlilb90pa23.R.inc(43702);if ((((iterations > fitnessHistory.length &&
                historyWorst-historyBest < stopTolHistFun)&&(__CLR4_4_1xlixlilb90pa23.R.iget(43703)!=0|true))||(__CLR4_4_1xlixlilb90pa23.R.iget(43704)==0&false))) {{
                __CLR4_4_1xlixlilb90pa23.R.inc(43705);break generationLoop;
            }
            // condition number of the covariance matrix exceeds 1e14
            }__CLR4_4_1xlixlilb90pa23.R.inc(43706);if ((((max(diagD)/min(diagD) > 1e7)&&(__CLR4_4_1xlixlilb90pa23.R.iget(43707)!=0|true))||(__CLR4_4_1xlixlilb90pa23.R.iget(43708)==0&false))) {{
                __CLR4_4_1xlixlilb90pa23.R.inc(43709);break generationLoop;
            }
            // user defined termination
            }__CLR4_4_1xlixlilb90pa23.R.inc(43710);if ((((getConvergenceChecker() != null)&&(__CLR4_4_1xlixlilb90pa23.R.iget(43711)!=0|true))||(__CLR4_4_1xlixlilb90pa23.R.iget(43712)==0&false))) {{
                __CLR4_4_1xlixlilb90pa23.R.inc(43713);final PointValuePair current
                    = new PointValuePair(bestArx.getColumn(0),
                                         (((isMinimize )&&(__CLR4_4_1xlixlilb90pa23.R.iget(43714)!=0|true))||(__CLR4_4_1xlixlilb90pa23.R.iget(43715)==0&false))? bestFitness : -bestFitness);
                __CLR4_4_1xlixlilb90pa23.R.inc(43716);if ((((lastResult != null &&
                    getConvergenceChecker().converged(iterations, current, lastResult))&&(__CLR4_4_1xlixlilb90pa23.R.iget(43717)!=0|true))||(__CLR4_4_1xlixlilb90pa23.R.iget(43718)==0&false))) {{
                    __CLR4_4_1xlixlilb90pa23.R.inc(43719);break generationLoop;
                    }
                }__CLR4_4_1xlixlilb90pa23.R.inc(43720);lastResult = current;
            }
            // Adjust step size in case of equal function values (flat fitness)
            }__CLR4_4_1xlixlilb90pa23.R.inc(43721);if ((((bestValue == fitness[arindex[(int)(0.1+lambda/4.)]])&&(__CLR4_4_1xlixlilb90pa23.R.iget(43722)!=0|true))||(__CLR4_4_1xlixlilb90pa23.R.iget(43723)==0&false))) {{
                __CLR4_4_1xlixlilb90pa23.R.inc(43724);sigma = sigma * Math.exp(0.2 + cs / damps);
            }
            }__CLR4_4_1xlixlilb90pa23.R.inc(43725);if ((((iterations > 2 && Math.max(historyWorst, bestFitness) -
                Math.min(historyBest, bestFitness) == 0)&&(__CLR4_4_1xlixlilb90pa23.R.iget(43726)!=0|true))||(__CLR4_4_1xlixlilb90pa23.R.iget(43727)==0&false))) {{
                __CLR4_4_1xlixlilb90pa23.R.inc(43728);sigma = sigma * Math.exp(0.2 + cs / damps);
            }
            // store best in history
            }__CLR4_4_1xlixlilb90pa23.R.inc(43729);push(fitnessHistory,bestFitness);
            __CLR4_4_1xlixlilb90pa23.R.inc(43730);fitfun.setValueRange(worstFitness-bestFitness);
            __CLR4_4_1xlixlilb90pa23.R.inc(43731);if ((((generateStatistics)&&(__CLR4_4_1xlixlilb90pa23.R.iget(43732)!=0|true))||(__CLR4_4_1xlixlilb90pa23.R.iget(43733)==0&false))) {{
                __CLR4_4_1xlixlilb90pa23.R.inc(43734);statisticsSigmaHistory.add(sigma);
                __CLR4_4_1xlixlilb90pa23.R.inc(43735);statisticsFitnessHistory.add(bestFitness);
                __CLR4_4_1xlixlilb90pa23.R.inc(43736);statisticsMeanHistory.add(xmean.transpose());
                __CLR4_4_1xlixlilb90pa23.R.inc(43737);statisticsDHistory.add(diagD.transpose().scalarMultiply(1E5));
            }
        }}
        }__CLR4_4_1xlixlilb90pa23.R.inc(43738);return optimum;
    }finally{__CLR4_4_1xlixlilb90pa23.R.flushNeeded();}}

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
    private void parseOptimizationData(OptimizationData... optData) {try{__CLR4_4_1xlixlilb90pa23.R.inc(43739);
        // The existing values (as set by the previous call) are reused if
        // not provided in the argument list.
        __CLR4_4_1xlixlilb90pa23.R.inc(43740);for (OptimizationData data : optData) {{
            __CLR4_4_1xlixlilb90pa23.R.inc(43741);if ((((data instanceof Sigma)&&(__CLR4_4_1xlixlilb90pa23.R.iget(43742)!=0|true))||(__CLR4_4_1xlixlilb90pa23.R.iget(43743)==0&false))) {{
                __CLR4_4_1xlixlilb90pa23.R.inc(43744);inputSigma = ((Sigma) data).getSigma();
                __CLR4_4_1xlixlilb90pa23.R.inc(43745);continue;
            }
            }__CLR4_4_1xlixlilb90pa23.R.inc(43746);if ((((data instanceof PopulationSize)&&(__CLR4_4_1xlixlilb90pa23.R.iget(43747)!=0|true))||(__CLR4_4_1xlixlilb90pa23.R.iget(43748)==0&false))) {{
                __CLR4_4_1xlixlilb90pa23.R.inc(43749);lambda = ((PopulationSize) data).getPopulationSize();
                __CLR4_4_1xlixlilb90pa23.R.inc(43750);continue;
            }
        }}
    }}finally{__CLR4_4_1xlixlilb90pa23.R.flushNeeded();}}

    /**
     * Checks dimensions and values of boundaries and inputSigma if defined.
     */
    private void checkParameters() {try{__CLR4_4_1xlixlilb90pa23.R.inc(43751);
        __CLR4_4_1xlixlilb90pa23.R.inc(43752);final double[] init = getStartPoint();
        __CLR4_4_1xlixlilb90pa23.R.inc(43753);final double[] lB = getLowerBound();
        __CLR4_4_1xlixlilb90pa23.R.inc(43754);final double[] uB = getUpperBound();

        __CLR4_4_1xlixlilb90pa23.R.inc(43755);if ((((inputSigma != null)&&(__CLR4_4_1xlixlilb90pa23.R.iget(43756)!=0|true))||(__CLR4_4_1xlixlilb90pa23.R.iget(43757)==0&false))) {{
            __CLR4_4_1xlixlilb90pa23.R.inc(43758);if ((((inputSigma.length != init.length)&&(__CLR4_4_1xlixlilb90pa23.R.iget(43759)!=0|true))||(__CLR4_4_1xlixlilb90pa23.R.iget(43760)==0&false))) {{
                __CLR4_4_1xlixlilb90pa23.R.inc(43761);throw new DimensionMismatchException(inputSigma.length, init.length);
            }
            }__CLR4_4_1xlixlilb90pa23.R.inc(43762);for (int i = 0; (((i < init.length)&&(__CLR4_4_1xlixlilb90pa23.R.iget(43763)!=0|true))||(__CLR4_4_1xlixlilb90pa23.R.iget(43764)==0&false)); i++) {{
                __CLR4_4_1xlixlilb90pa23.R.inc(43765);if ((((inputSigma[i] < 0)&&(__CLR4_4_1xlixlilb90pa23.R.iget(43766)!=0|true))||(__CLR4_4_1xlixlilb90pa23.R.iget(43767)==0&false))) {{
                    // XXX Remove this block in 4.0 (check performed in "Sigma" class).
                    __CLR4_4_1xlixlilb90pa23.R.inc(43768);throw new NotPositiveException(inputSigma[i]);
                }
                }__CLR4_4_1xlixlilb90pa23.R.inc(43769);if ((((inputSigma[i] > uB[i] - lB[i])&&(__CLR4_4_1xlixlilb90pa23.R.iget(43770)!=0|true))||(__CLR4_4_1xlixlilb90pa23.R.iget(43771)==0&false))) {{
                    __CLR4_4_1xlixlilb90pa23.R.inc(43772);throw new OutOfRangeException(inputSigma[i], 0, uB[i] - lB[i]);
                }
            }}
        }}
    }}finally{__CLR4_4_1xlixlilb90pa23.R.flushNeeded();}}

    /**
     * Initialization of the dynamic search parameters
     *
     * @param guess Initial guess for the arguments of the fitness function.
     */
    private void initializeCMA(double[] guess) {try{__CLR4_4_1xlixlilb90pa23.R.inc(43773);
        __CLR4_4_1xlixlilb90pa23.R.inc(43774);if ((((lambda <= 0)&&(__CLR4_4_1xlixlilb90pa23.R.iget(43775)!=0|true))||(__CLR4_4_1xlixlilb90pa23.R.iget(43776)==0&false))) {{
            // XXX Line below to replace the current one in 4.0 (MATH-879).
            // throw new NotStrictlyPositiveException(lambda);
            __CLR4_4_1xlixlilb90pa23.R.inc(43777);lambda = 4 + (int) (3 * Math.log(dimension));
        }
        // initialize sigma
        }__CLR4_4_1xlixlilb90pa23.R.inc(43778);final double[][] sigmaArray = new double[guess.length][1];
        __CLR4_4_1xlixlilb90pa23.R.inc(43779);for (int i = 0; (((i < guess.length)&&(__CLR4_4_1xlixlilb90pa23.R.iget(43780)!=0|true))||(__CLR4_4_1xlixlilb90pa23.R.iget(43781)==0&false)); i++) {{
            // XXX Line below to replace the current one in 4.0 (MATH-868).
            // sigmaArray[i][0] = inputSigma[i];
            __CLR4_4_1xlixlilb90pa23.R.inc(43782);sigmaArray[i][0] = (((inputSigma == null )&&(__CLR4_4_1xlixlilb90pa23.R.iget(43783)!=0|true))||(__CLR4_4_1xlixlilb90pa23.R.iget(43784)==0&false))? 0.3 : inputSigma[i];
        }
        }__CLR4_4_1xlixlilb90pa23.R.inc(43785);final RealMatrix insigma = new Array2DRowRealMatrix(sigmaArray, false);
        __CLR4_4_1xlixlilb90pa23.R.inc(43786);sigma = max(insigma); // overall standard deviation

        // initialize termination criteria
        __CLR4_4_1xlixlilb90pa23.R.inc(43787);stopTolUpX = 1e3 * max(insigma);
        __CLR4_4_1xlixlilb90pa23.R.inc(43788);stopTolX = 1e-11 * max(insigma);
        __CLR4_4_1xlixlilb90pa23.R.inc(43789);stopTolFun = 1e-12;
        __CLR4_4_1xlixlilb90pa23.R.inc(43790);stopTolHistFun = 1e-13;

        // initialize selection strategy parameters
        __CLR4_4_1xlixlilb90pa23.R.inc(43791);mu = lambda / 2; // number of parents/points for recombination
        __CLR4_4_1xlixlilb90pa23.R.inc(43792);logMu2 = Math.log(mu + 0.5);
        __CLR4_4_1xlixlilb90pa23.R.inc(43793);weights = log(sequence(1, mu, 1)).scalarMultiply(-1).scalarAdd(logMu2);
        __CLR4_4_1xlixlilb90pa23.R.inc(43794);double sumw = 0;
        __CLR4_4_1xlixlilb90pa23.R.inc(43795);double sumwq = 0;
        __CLR4_4_1xlixlilb90pa23.R.inc(43796);for (int i = 0; (((i < mu)&&(__CLR4_4_1xlixlilb90pa23.R.iget(43797)!=0|true))||(__CLR4_4_1xlixlilb90pa23.R.iget(43798)==0&false)); i++) {{
            __CLR4_4_1xlixlilb90pa23.R.inc(43799);double w = weights.getEntry(i, 0);
            __CLR4_4_1xlixlilb90pa23.R.inc(43800);sumw += w;
            __CLR4_4_1xlixlilb90pa23.R.inc(43801);sumwq += w * w;
        }
        }__CLR4_4_1xlixlilb90pa23.R.inc(43802);weights = weights.scalarMultiply(1 / sumw);
        __CLR4_4_1xlixlilb90pa23.R.inc(43803);mueff = sumw * sumw / sumwq; // variance-effectiveness of sum w_i x_i

        // initialize dynamic strategy parameters and constants
        __CLR4_4_1xlixlilb90pa23.R.inc(43804);cc = (4 + mueff / dimension) /
                (dimension + 4 + 2 * mueff / dimension);
        __CLR4_4_1xlixlilb90pa23.R.inc(43805);cs = (mueff + 2) / (dimension + mueff + 3.);
        __CLR4_4_1xlixlilb90pa23.R.inc(43806);damps = (1 + 2 * Math.max(0, Math.sqrt((mueff - 1) /
                                               (dimension + 1)) - 1)) *
            Math.max(0.3,
                     1 - dimension / (1e-6 + maxIterations)) + cs; // minor increment
        __CLR4_4_1xlixlilb90pa23.R.inc(43807);ccov1 = 2 / ((dimension + 1.3) * (dimension + 1.3) + mueff);
        __CLR4_4_1xlixlilb90pa23.R.inc(43808);ccovmu = Math.min(1 - ccov1, 2 * (mueff - 2 + 1 / mueff) /
                          ((dimension + 2) * (dimension + 2) + mueff));
        __CLR4_4_1xlixlilb90pa23.R.inc(43809);ccov1Sep = Math.min(1, ccov1 * (dimension + 1.5) / 3);
        __CLR4_4_1xlixlilb90pa23.R.inc(43810);ccovmuSep = Math.min(1 - ccov1, ccovmu * (dimension + 1.5) / 3);
        __CLR4_4_1xlixlilb90pa23.R.inc(43811);chiN = Math.sqrt(dimension) *
            (1 - 1 / ((double) 4 * dimension) + 1 / ((double) 21 * dimension * dimension));
        // intialize CMA internal values - updated each generation
        __CLR4_4_1xlixlilb90pa23.R.inc(43812);xmean = MatrixUtils.createColumnRealMatrix(guess); // objective variables
        __CLR4_4_1xlixlilb90pa23.R.inc(43813);diagD = insigma.scalarMultiply(1 / sigma);
        __CLR4_4_1xlixlilb90pa23.R.inc(43814);diagC = square(diagD);
        __CLR4_4_1xlixlilb90pa23.R.inc(43815);pc = zeros(dimension, 1); // evolution paths for C and sigma
        __CLR4_4_1xlixlilb90pa23.R.inc(43816);ps = zeros(dimension, 1); // B defines the coordinate system
        __CLR4_4_1xlixlilb90pa23.R.inc(43817);normps = ps.getFrobeniusNorm();

        __CLR4_4_1xlixlilb90pa23.R.inc(43818);B = eye(dimension, dimension);
        __CLR4_4_1xlixlilb90pa23.R.inc(43819);D = ones(dimension, 1); // diagonal D defines the scaling
        __CLR4_4_1xlixlilb90pa23.R.inc(43820);BD = times(B, repmat(diagD.transpose(), dimension, 1));
        __CLR4_4_1xlixlilb90pa23.R.inc(43821);C = B.multiply(diag(square(D)).multiply(B.transpose())); // covariance
        __CLR4_4_1xlixlilb90pa23.R.inc(43822);historySize = 10 + (int) (3 * 10 * dimension / (double) lambda);
        __CLR4_4_1xlixlilb90pa23.R.inc(43823);fitnessHistory = new double[historySize]; // history of fitness values
        __CLR4_4_1xlixlilb90pa23.R.inc(43824);for (int i = 0; (((i < historySize)&&(__CLR4_4_1xlixlilb90pa23.R.iget(43825)!=0|true))||(__CLR4_4_1xlixlilb90pa23.R.iget(43826)==0&false)); i++) {{
            __CLR4_4_1xlixlilb90pa23.R.inc(43827);fitnessHistory[i] = Double.MAX_VALUE;
        }
    }}finally{__CLR4_4_1xlixlilb90pa23.R.flushNeeded();}}

    /**
     * Update of the evolution paths ps and pc.
     *
     * @param zmean Weighted row matrix of the gaussian random numbers generating
     * the current offspring.
     * @param xold xmean matrix of the previous generation.
     * @return hsig flag indicating a small correction.
     */
    private boolean updateEvolutionPaths(RealMatrix zmean, RealMatrix xold) {try{__CLR4_4_1xlixlilb90pa23.R.inc(43828);
        __CLR4_4_1xlixlilb90pa23.R.inc(43829);ps = ps.scalarMultiply(1 - cs).add(
                B.multiply(zmean).scalarMultiply(
                        Math.sqrt(cs * (2 - cs) * mueff)));
        __CLR4_4_1xlixlilb90pa23.R.inc(43830);normps = ps.getFrobeniusNorm();
        __CLR4_4_1xlixlilb90pa23.R.inc(43831);final boolean hsig = normps /
            Math.sqrt(1 - Math.pow(1 - cs, 2 * iterations)) /
            chiN < 1.4 + 2 / ((double) dimension + 1);
        __CLR4_4_1xlixlilb90pa23.R.inc(43832);pc = pc.scalarMultiply(1 - cc);
        __CLR4_4_1xlixlilb90pa23.R.inc(43833);if ((((hsig)&&(__CLR4_4_1xlixlilb90pa23.R.iget(43834)!=0|true))||(__CLR4_4_1xlixlilb90pa23.R.iget(43835)==0&false))) {{
            __CLR4_4_1xlixlilb90pa23.R.inc(43836);pc = pc.add(xmean.subtract(xold).scalarMultiply(Math.sqrt(cc * (2 - cc) * mueff) / sigma));
        }
        }__CLR4_4_1xlixlilb90pa23.R.inc(43837);return hsig;
    }finally{__CLR4_4_1xlixlilb90pa23.R.flushNeeded();}}

    /**
     * Update of the covariance matrix C for diagonalOnly > 0
     *
     * @param hsig Flag indicating a small correction.
     * @param bestArz Fitness-sorted matrix of the gaussian random values of the
     * current offspring.
     */
    private void updateCovarianceDiagonalOnly(boolean hsig,
                                              final RealMatrix bestArz) {try{__CLR4_4_1xlixlilb90pa23.R.inc(43838);
        // minor correction if hsig==false
        __CLR4_4_1xlixlilb90pa23.R.inc(43839);double oldFac = (((hsig )&&(__CLR4_4_1xlixlilb90pa23.R.iget(43840)!=0|true))||(__CLR4_4_1xlixlilb90pa23.R.iget(43841)==0&false))? 0 : ccov1Sep * cc * (2 - cc);
        __CLR4_4_1xlixlilb90pa23.R.inc(43842);oldFac += 1 - ccov1Sep - ccovmuSep;
        __CLR4_4_1xlixlilb90pa23.R.inc(43843);diagC = diagC.scalarMultiply(oldFac) // regard old matrix
            .add(square(pc).scalarMultiply(ccov1Sep)) // plus rank one update
            .add((times(diagC, square(bestArz).multiply(weights))) // plus rank mu update
                 .scalarMultiply(ccovmuSep));
        __CLR4_4_1xlixlilb90pa23.R.inc(43844);diagD = sqrt(diagC); // replaces eig(C)
        __CLR4_4_1xlixlilb90pa23.R.inc(43845);if ((((diagonalOnly > 1 &&
            iterations > diagonalOnly)&&(__CLR4_4_1xlixlilb90pa23.R.iget(43846)!=0|true))||(__CLR4_4_1xlixlilb90pa23.R.iget(43847)==0&false))) {{
            // full covariance matrix from now on
            __CLR4_4_1xlixlilb90pa23.R.inc(43848);diagonalOnly = 0;
            __CLR4_4_1xlixlilb90pa23.R.inc(43849);B = eye(dimension, dimension);
            __CLR4_4_1xlixlilb90pa23.R.inc(43850);BD = diag(diagD);
            __CLR4_4_1xlixlilb90pa23.R.inc(43851);C = diag(diagC);
        }
    }}finally{__CLR4_4_1xlixlilb90pa23.R.flushNeeded();}}

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
                                  final RealMatrix xold) {try{__CLR4_4_1xlixlilb90pa23.R.inc(43852);
        __CLR4_4_1xlixlilb90pa23.R.inc(43853);double negccov = 0;
        __CLR4_4_1xlixlilb90pa23.R.inc(43854);if ((((ccov1 + ccovmu > 0)&&(__CLR4_4_1xlixlilb90pa23.R.iget(43855)!=0|true))||(__CLR4_4_1xlixlilb90pa23.R.iget(43856)==0&false))) {{
            __CLR4_4_1xlixlilb90pa23.R.inc(43857);final RealMatrix arpos = bestArx.subtract(repmat(xold, 1, mu))
                .scalarMultiply(1 / sigma); // mu difference vectors
            __CLR4_4_1xlixlilb90pa23.R.inc(43858);final RealMatrix roneu = pc.multiply(pc.transpose())
                .scalarMultiply(ccov1); // rank one update
            // minor correction if hsig==false
            __CLR4_4_1xlixlilb90pa23.R.inc(43859);double oldFac = (((hsig )&&(__CLR4_4_1xlixlilb90pa23.R.iget(43860)!=0|true))||(__CLR4_4_1xlixlilb90pa23.R.iget(43861)==0&false))? 0 : ccov1 * cc * (2 - cc);
            __CLR4_4_1xlixlilb90pa23.R.inc(43862);oldFac += 1 - ccov1 - ccovmu;
            __CLR4_4_1xlixlilb90pa23.R.inc(43863);if ((((isActiveCMA)&&(__CLR4_4_1xlixlilb90pa23.R.iget(43864)!=0|true))||(__CLR4_4_1xlixlilb90pa23.R.iget(43865)==0&false))) {{
                // Adapt covariance matrix C active CMA
                __CLR4_4_1xlixlilb90pa23.R.inc(43866);negccov = (1 - ccovmu) * 0.25 * mueff /
                    (Math.pow(dimension + 2, 1.5) + 2 * mueff);
                // keep at least 0.66 in all directions, small popsize are most
                // critical
                __CLR4_4_1xlixlilb90pa23.R.inc(43867);final double negminresidualvariance = 0.66;
                // where to make up for the variance loss
                __CLR4_4_1xlixlilb90pa23.R.inc(43868);final double negalphaold = 0.5;
                // prepare vectors, compute negative updating matrix Cneg
                __CLR4_4_1xlixlilb90pa23.R.inc(43869);final int[] arReverseIndex = reverse(arindex);
                __CLR4_4_1xlixlilb90pa23.R.inc(43870);RealMatrix arzneg = selectColumns(arz, MathArrays.copyOf(arReverseIndex, mu));
                __CLR4_4_1xlixlilb90pa23.R.inc(43871);RealMatrix arnorms = sqrt(sumRows(square(arzneg)));
                __CLR4_4_1xlixlilb90pa23.R.inc(43872);final int[] idxnorms = sortedIndices(arnorms.getRow(0));
                __CLR4_4_1xlixlilb90pa23.R.inc(43873);final RealMatrix arnormsSorted = selectColumns(arnorms, idxnorms);
                __CLR4_4_1xlixlilb90pa23.R.inc(43874);final int[] idxReverse = reverse(idxnorms);
                __CLR4_4_1xlixlilb90pa23.R.inc(43875);final RealMatrix arnormsReverse = selectColumns(arnorms, idxReverse);
                __CLR4_4_1xlixlilb90pa23.R.inc(43876);arnorms = divide(arnormsReverse, arnormsSorted);
                __CLR4_4_1xlixlilb90pa23.R.inc(43877);final int[] idxInv = inverse(idxnorms);
                __CLR4_4_1xlixlilb90pa23.R.inc(43878);final RealMatrix arnormsInv = selectColumns(arnorms, idxInv);
                // check and set learning rate negccov
                __CLR4_4_1xlixlilb90pa23.R.inc(43879);final double negcovMax = (1 - negminresidualvariance) /
                    square(arnormsInv).multiply(weights).getEntry(0, 0);
                __CLR4_4_1xlixlilb90pa23.R.inc(43880);if ((((negccov > negcovMax)&&(__CLR4_4_1xlixlilb90pa23.R.iget(43881)!=0|true))||(__CLR4_4_1xlixlilb90pa23.R.iget(43882)==0&false))) {{
                    __CLR4_4_1xlixlilb90pa23.R.inc(43883);negccov = negcovMax;
                }
                }__CLR4_4_1xlixlilb90pa23.R.inc(43884);arzneg = times(arzneg, repmat(arnormsInv, dimension, 1));
                __CLR4_4_1xlixlilb90pa23.R.inc(43885);final RealMatrix artmp = BD.multiply(arzneg);
                __CLR4_4_1xlixlilb90pa23.R.inc(43886);final RealMatrix Cneg = artmp.multiply(diag(weights)).multiply(artmp.transpose());
                __CLR4_4_1xlixlilb90pa23.R.inc(43887);oldFac += negalphaold * negccov;
                __CLR4_4_1xlixlilb90pa23.R.inc(43888);C = C.scalarMultiply(oldFac)
                    .add(roneu) // regard old matrix
                    .add(arpos.scalarMultiply( // plus rank one update
                                              ccovmu + (1 - negalphaold) * negccov) // plus rank mu update
                         .multiply(times(repmat(weights, 1, dimension),
                                         arpos.transpose())))
                    .subtract(Cneg.scalarMultiply(negccov));
            } }else {{
                // Adapt covariance matrix C - nonactive
                __CLR4_4_1xlixlilb90pa23.R.inc(43889);C = C.scalarMultiply(oldFac) // regard old matrix
                    .add(roneu) // plus rank one update
                    .add(arpos.scalarMultiply(ccovmu) // plus rank mu update
                         .multiply(times(repmat(weights, 1, dimension),
                                         arpos.transpose())));
            }
        }}
        }__CLR4_4_1xlixlilb90pa23.R.inc(43890);updateBD(negccov);
    }finally{__CLR4_4_1xlixlilb90pa23.R.flushNeeded();}}

    /**
     * Update B and D from C.
     *
     * @param negccov Negative covariance factor.
     */
    private void updateBD(double negccov) {try{__CLR4_4_1xlixlilb90pa23.R.inc(43891);
        __CLR4_4_1xlixlilb90pa23.R.inc(43892);if ((((ccov1 + ccovmu + negccov > 0 &&
            (iterations % 1. / (ccov1 + ccovmu + negccov) / dimension / 10.) < 1)&&(__CLR4_4_1xlixlilb90pa23.R.iget(43893)!=0|true))||(__CLR4_4_1xlixlilb90pa23.R.iget(43894)==0&false))) {{
            // to achieve O(N^2)
            __CLR4_4_1xlixlilb90pa23.R.inc(43895);C = triu(C, 0).add(triu(C, 1).transpose());
            // enforce symmetry to prevent complex numbers
            __CLR4_4_1xlixlilb90pa23.R.inc(43896);final EigenDecomposition eig = new EigenDecomposition(C);
            __CLR4_4_1xlixlilb90pa23.R.inc(43897);B = eig.getV(); // eigen decomposition, B==normalized eigenvectors
            __CLR4_4_1xlixlilb90pa23.R.inc(43898);D = eig.getD();
            __CLR4_4_1xlixlilb90pa23.R.inc(43899);diagD = diag(D);
            __CLR4_4_1xlixlilb90pa23.R.inc(43900);if ((((min(diagD) <= 0)&&(__CLR4_4_1xlixlilb90pa23.R.iget(43901)!=0|true))||(__CLR4_4_1xlixlilb90pa23.R.iget(43902)==0&false))) {{
                __CLR4_4_1xlixlilb90pa23.R.inc(43903);for (int i = 0; (((i < dimension)&&(__CLR4_4_1xlixlilb90pa23.R.iget(43904)!=0|true))||(__CLR4_4_1xlixlilb90pa23.R.iget(43905)==0&false)); i++) {{
                    __CLR4_4_1xlixlilb90pa23.R.inc(43906);if ((((diagD.getEntry(i, 0) < 0)&&(__CLR4_4_1xlixlilb90pa23.R.iget(43907)!=0|true))||(__CLR4_4_1xlixlilb90pa23.R.iget(43908)==0&false))) {{
                        __CLR4_4_1xlixlilb90pa23.R.inc(43909);diagD.setEntry(i, 0, 0);
                    }
                }}
                }__CLR4_4_1xlixlilb90pa23.R.inc(43910);final double tfac = max(diagD) / 1e14;
                __CLR4_4_1xlixlilb90pa23.R.inc(43911);C = C.add(eye(dimension, dimension).scalarMultiply(tfac));
                __CLR4_4_1xlixlilb90pa23.R.inc(43912);diagD = diagD.add(ones(dimension, 1).scalarMultiply(tfac));
            }
            }__CLR4_4_1xlixlilb90pa23.R.inc(43913);if ((((max(diagD) > 1e14 * min(diagD))&&(__CLR4_4_1xlixlilb90pa23.R.iget(43914)!=0|true))||(__CLR4_4_1xlixlilb90pa23.R.iget(43915)==0&false))) {{
                __CLR4_4_1xlixlilb90pa23.R.inc(43916);final double tfac = max(diagD) / 1e14 - min(diagD);
                __CLR4_4_1xlixlilb90pa23.R.inc(43917);C = C.add(eye(dimension, dimension).scalarMultiply(tfac));
                __CLR4_4_1xlixlilb90pa23.R.inc(43918);diagD = diagD.add(ones(dimension, 1).scalarMultiply(tfac));
            }
            }__CLR4_4_1xlixlilb90pa23.R.inc(43919);diagC = diag(C);
            __CLR4_4_1xlixlilb90pa23.R.inc(43920);diagD = sqrt(diagD); // D contains standard deviations now
            __CLR4_4_1xlixlilb90pa23.R.inc(43921);BD = times(B, repmat(diagD.transpose(), dimension, 1)); // O(n^2)
        }
    }}finally{__CLR4_4_1xlixlilb90pa23.R.flushNeeded();}}

    /**
     * Pushes the current best fitness value in a history queue.
     *
     * @param vals History queue.
     * @param val Current best fitness value.
     */
    private static void push(double[] vals, double val) {try{__CLR4_4_1xlixlilb90pa23.R.inc(43922);
        __CLR4_4_1xlixlilb90pa23.R.inc(43923);for (int i = vals.length-1; (((i > 0)&&(__CLR4_4_1xlixlilb90pa23.R.iget(43924)!=0|true))||(__CLR4_4_1xlixlilb90pa23.R.iget(43925)==0&false)); i--) {{
            __CLR4_4_1xlixlilb90pa23.R.inc(43926);vals[i] = vals[i-1];
        }
        }__CLR4_4_1xlixlilb90pa23.R.inc(43927);vals[0] = val;
    }finally{__CLR4_4_1xlixlilb90pa23.R.flushNeeded();}}

    /**
     * Sorts fitness values.
     *
     * @param doubles Array of values to be sorted.
     * @return a sorted array of indices pointing into doubles.
     */
    private int[] sortedIndices(final double[] doubles) {try{__CLR4_4_1xlixlilb90pa23.R.inc(43928);
        __CLR4_4_1xlixlilb90pa23.R.inc(43929);final DoubleIndex[] dis = new DoubleIndex[doubles.length];
        __CLR4_4_1xlixlilb90pa23.R.inc(43930);for (int i = 0; (((i < doubles.length)&&(__CLR4_4_1xlixlilb90pa23.R.iget(43931)!=0|true))||(__CLR4_4_1xlixlilb90pa23.R.iget(43932)==0&false)); i++) {{
            __CLR4_4_1xlixlilb90pa23.R.inc(43933);dis[i] = new DoubleIndex(doubles[i], i);
        }
        }__CLR4_4_1xlixlilb90pa23.R.inc(43934);Arrays.sort(dis);
        __CLR4_4_1xlixlilb90pa23.R.inc(43935);final int[] indices = new int[doubles.length];
        __CLR4_4_1xlixlilb90pa23.R.inc(43936);for (int i = 0; (((i < doubles.length)&&(__CLR4_4_1xlixlilb90pa23.R.iget(43937)!=0|true))||(__CLR4_4_1xlixlilb90pa23.R.iget(43938)==0&false)); i++) {{
            __CLR4_4_1xlixlilb90pa23.R.inc(43939);indices[i] = dis[i].index;
        }
        }__CLR4_4_1xlixlilb90pa23.R.inc(43940);return indices;
    }finally{__CLR4_4_1xlixlilb90pa23.R.flushNeeded();}}

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
        DoubleIndex(double value, int index) {try{__CLR4_4_1xlixlilb90pa23.R.inc(43941);
            __CLR4_4_1xlixlilb90pa23.R.inc(43942);this.value = value;
            __CLR4_4_1xlixlilb90pa23.R.inc(43943);this.index = index;
        }finally{__CLR4_4_1xlixlilb90pa23.R.flushNeeded();}}

        /** {@inheritDoc} */
        public int compareTo(DoubleIndex o) {try{__CLR4_4_1xlixlilb90pa23.R.inc(43944);
            __CLR4_4_1xlixlilb90pa23.R.inc(43945);return Double.compare(value, o.value);
        }finally{__CLR4_4_1xlixlilb90pa23.R.flushNeeded();}}

        /** {@inheritDoc} */
        @Override
        public boolean equals(Object other) {try{__CLR4_4_1xlixlilb90pa23.R.inc(43946);

            __CLR4_4_1xlixlilb90pa23.R.inc(43947);if ((((this == other)&&(__CLR4_4_1xlixlilb90pa23.R.iget(43948)!=0|true))||(__CLR4_4_1xlixlilb90pa23.R.iget(43949)==0&false))) {{
                __CLR4_4_1xlixlilb90pa23.R.inc(43950);return true;
            }

            }__CLR4_4_1xlixlilb90pa23.R.inc(43951);if ((((other instanceof DoubleIndex)&&(__CLR4_4_1xlixlilb90pa23.R.iget(43952)!=0|true))||(__CLR4_4_1xlixlilb90pa23.R.iget(43953)==0&false))) {{
                __CLR4_4_1xlixlilb90pa23.R.inc(43954);return Double.compare(value, ((DoubleIndex) other).value) == 0;
            }

            }__CLR4_4_1xlixlilb90pa23.R.inc(43955);return false;
        }finally{__CLR4_4_1xlixlilb90pa23.R.flushNeeded();}}

        /** {@inheritDoc} */
        @Override
        public int hashCode() {try{__CLR4_4_1xlixlilb90pa23.R.inc(43956);
            __CLR4_4_1xlixlilb90pa23.R.inc(43957);long bits = Double.doubleToLongBits(value);
            __CLR4_4_1xlixlilb90pa23.R.inc(43958);return (int) ((1438542 ^ (bits >>> 32) ^ bits) & 0xffffffff);
        }finally{__CLR4_4_1xlixlilb90pa23.R.flushNeeded();}}
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
        public FitnessFunction() {try{__CLR4_4_1xlixlilb90pa23.R.inc(43959);
            __CLR4_4_1xlixlilb90pa23.R.inc(43960);valueRange = 1;
            __CLR4_4_1xlixlilb90pa23.R.inc(43961);isRepairMode = true;
        }finally{__CLR4_4_1xlixlilb90pa23.R.flushNeeded();}}

        /**
         * @param point Normalized objective variables.
         * @return the objective value + penalty for violated bounds.
         */
        public double value(final double[] point) {try{__CLR4_4_1xlixlilb90pa23.R.inc(43962);
            __CLR4_4_1xlixlilb90pa23.R.inc(43963);double value;
            __CLR4_4_1xlixlilb90pa23.R.inc(43964);if ((((isRepairMode)&&(__CLR4_4_1xlixlilb90pa23.R.iget(43965)!=0|true))||(__CLR4_4_1xlixlilb90pa23.R.iget(43966)==0&false))) {{
                __CLR4_4_1xlixlilb90pa23.R.inc(43967);double[] repaired = repair(point);
                __CLR4_4_1xlixlilb90pa23.R.inc(43968);value = CMAESOptimizer.this.computeObjectiveValue(repaired) +
                    penalty(point, repaired);
            } }else {{
                __CLR4_4_1xlixlilb90pa23.R.inc(43969);value = CMAESOptimizer.this.computeObjectiveValue(point);
            }
            }__CLR4_4_1xlixlilb90pa23.R.inc(43970);return (((isMinimize )&&(__CLR4_4_1xlixlilb90pa23.R.iget(43971)!=0|true))||(__CLR4_4_1xlixlilb90pa23.R.iget(43972)==0&false))? value : -value;
        }finally{__CLR4_4_1xlixlilb90pa23.R.flushNeeded();}}

        /**
         * @param x Normalized objective variables.
         * @return {@code true} if in bounds.
         */
        public boolean isFeasible(final double[] x) {try{__CLR4_4_1xlixlilb90pa23.R.inc(43973);
            __CLR4_4_1xlixlilb90pa23.R.inc(43974);final double[] lB = CMAESOptimizer.this.getLowerBound();
            __CLR4_4_1xlixlilb90pa23.R.inc(43975);final double[] uB = CMAESOptimizer.this.getUpperBound();

            __CLR4_4_1xlixlilb90pa23.R.inc(43976);for (int i = 0; (((i < x.length)&&(__CLR4_4_1xlixlilb90pa23.R.iget(43977)!=0|true))||(__CLR4_4_1xlixlilb90pa23.R.iget(43978)==0&false)); i++) {{
                __CLR4_4_1xlixlilb90pa23.R.inc(43979);if ((((x[i] < lB[i])&&(__CLR4_4_1xlixlilb90pa23.R.iget(43980)!=0|true))||(__CLR4_4_1xlixlilb90pa23.R.iget(43981)==0&false))) {{
                    __CLR4_4_1xlixlilb90pa23.R.inc(43982);return false;
                }
                }__CLR4_4_1xlixlilb90pa23.R.inc(43983);if ((((x[i] > uB[i])&&(__CLR4_4_1xlixlilb90pa23.R.iget(43984)!=0|true))||(__CLR4_4_1xlixlilb90pa23.R.iget(43985)==0&false))) {{
                    __CLR4_4_1xlixlilb90pa23.R.inc(43986);return false;
                }
            }}
            }__CLR4_4_1xlixlilb90pa23.R.inc(43987);return true;
        }finally{__CLR4_4_1xlixlilb90pa23.R.flushNeeded();}}

        /**
         * @param valueRange Adjusts the penalty computation.
         */
        public void setValueRange(double valueRange) {try{__CLR4_4_1xlixlilb90pa23.R.inc(43988);
            __CLR4_4_1xlixlilb90pa23.R.inc(43989);this.valueRange = valueRange;
        }finally{__CLR4_4_1xlixlilb90pa23.R.flushNeeded();}}

        /**
         * @param x Normalized objective variables.
         * @return the repaired (i.e. all in bounds) objective variables.
         */
        private double[] repair(final double[] x) {try{__CLR4_4_1xlixlilb90pa23.R.inc(43990);
            __CLR4_4_1xlixlilb90pa23.R.inc(43991);final double[] lB = CMAESOptimizer.this.getLowerBound();
            __CLR4_4_1xlixlilb90pa23.R.inc(43992);final double[] uB = CMAESOptimizer.this.getUpperBound();

            __CLR4_4_1xlixlilb90pa23.R.inc(43993);final double[] repaired = new double[x.length];
            __CLR4_4_1xlixlilb90pa23.R.inc(43994);for (int i = 0; (((i < x.length)&&(__CLR4_4_1xlixlilb90pa23.R.iget(43995)!=0|true))||(__CLR4_4_1xlixlilb90pa23.R.iget(43996)==0&false)); i++) {{
                __CLR4_4_1xlixlilb90pa23.R.inc(43997);if ((((x[i] < lB[i])&&(__CLR4_4_1xlixlilb90pa23.R.iget(43998)!=0|true))||(__CLR4_4_1xlixlilb90pa23.R.iget(43999)==0&false))) {{
                    __CLR4_4_1xlixlilb90pa23.R.inc(44000);repaired[i] = lB[i];
                } }else {__CLR4_4_1xlixlilb90pa23.R.inc(44001);if ((((x[i] > uB[i])&&(__CLR4_4_1xlixlilb90pa23.R.iget(44002)!=0|true))||(__CLR4_4_1xlixlilb90pa23.R.iget(44003)==0&false))) {{
                    __CLR4_4_1xlixlilb90pa23.R.inc(44004);repaired[i] = uB[i];
                } }else {{
                    __CLR4_4_1xlixlilb90pa23.R.inc(44005);repaired[i] = x[i];
                }
            }}}
            }__CLR4_4_1xlixlilb90pa23.R.inc(44006);return repaired;
        }finally{__CLR4_4_1xlixlilb90pa23.R.flushNeeded();}}

        /**
         * @param x Normalized objective variables.
         * @param repaired Repaired objective variables.
         * @return Penalty value according to the violation of the bounds.
         */
        private double penalty(final double[] x, final double[] repaired) {try{__CLR4_4_1xlixlilb90pa23.R.inc(44007);
            __CLR4_4_1xlixlilb90pa23.R.inc(44008);double penalty = 0;
            __CLR4_4_1xlixlilb90pa23.R.inc(44009);for (int i = 0; (((i < x.length)&&(__CLR4_4_1xlixlilb90pa23.R.iget(44010)!=0|true))||(__CLR4_4_1xlixlilb90pa23.R.iget(44011)==0&false)); i++) {{
                __CLR4_4_1xlixlilb90pa23.R.inc(44012);double diff = Math.abs(x[i] - repaired[i]);
                __CLR4_4_1xlixlilb90pa23.R.inc(44013);penalty += diff * valueRange;
            }
            }__CLR4_4_1xlixlilb90pa23.R.inc(44014);return (((isMinimize )&&(__CLR4_4_1xlixlilb90pa23.R.iget(44015)!=0|true))||(__CLR4_4_1xlixlilb90pa23.R.iget(44016)==0&false))? penalty : -penalty;
        }finally{__CLR4_4_1xlixlilb90pa23.R.flushNeeded();}}
    }

    // -----Matrix utility functions similar to the Matlab build in functions------

    /**
     * @param m Input matrix
     * @return Matrix representing the element-wise logarithm of m.
     */
    private static RealMatrix log(final RealMatrix m) {try{__CLR4_4_1xlixlilb90pa23.R.inc(44017);
        __CLR4_4_1xlixlilb90pa23.R.inc(44018);final double[][] d = new double[m.getRowDimension()][m.getColumnDimension()];
        __CLR4_4_1xlixlilb90pa23.R.inc(44019);for (int r = 0; (((r < m.getRowDimension())&&(__CLR4_4_1xlixlilb90pa23.R.iget(44020)!=0|true))||(__CLR4_4_1xlixlilb90pa23.R.iget(44021)==0&false)); r++) {{
            __CLR4_4_1xlixlilb90pa23.R.inc(44022);for (int c = 0; (((c < m.getColumnDimension())&&(__CLR4_4_1xlixlilb90pa23.R.iget(44023)!=0|true))||(__CLR4_4_1xlixlilb90pa23.R.iget(44024)==0&false)); c++) {{
                __CLR4_4_1xlixlilb90pa23.R.inc(44025);d[r][c] = Math.log(m.getEntry(r, c));
            }
        }}
        }__CLR4_4_1xlixlilb90pa23.R.inc(44026);return new Array2DRowRealMatrix(d, false);
    }finally{__CLR4_4_1xlixlilb90pa23.R.flushNeeded();}}

    /**
     * @param m Input matrix.
     * @return Matrix representing the element-wise square root of m.
     */
    private static RealMatrix sqrt(final RealMatrix m) {try{__CLR4_4_1xlixlilb90pa23.R.inc(44027);
        __CLR4_4_1xlixlilb90pa23.R.inc(44028);final double[][] d = new double[m.getRowDimension()][m.getColumnDimension()];
        __CLR4_4_1xlixlilb90pa23.R.inc(44029);for (int r = 0; (((r < m.getRowDimension())&&(__CLR4_4_1xlixlilb90pa23.R.iget(44030)!=0|true))||(__CLR4_4_1xlixlilb90pa23.R.iget(44031)==0&false)); r++) {{
            __CLR4_4_1xlixlilb90pa23.R.inc(44032);for (int c = 0; (((c < m.getColumnDimension())&&(__CLR4_4_1xlixlilb90pa23.R.iget(44033)!=0|true))||(__CLR4_4_1xlixlilb90pa23.R.iget(44034)==0&false)); c++) {{
                __CLR4_4_1xlixlilb90pa23.R.inc(44035);d[r][c] = Math.sqrt(m.getEntry(r, c));
            }
        }}
        }__CLR4_4_1xlixlilb90pa23.R.inc(44036);return new Array2DRowRealMatrix(d, false);
    }finally{__CLR4_4_1xlixlilb90pa23.R.flushNeeded();}}

    /**
     * @param m Input matrix.
     * @return Matrix representing the element-wise square of m.
     */
    private static RealMatrix square(final RealMatrix m) {try{__CLR4_4_1xlixlilb90pa23.R.inc(44037);
        __CLR4_4_1xlixlilb90pa23.R.inc(44038);final double[][] d = new double[m.getRowDimension()][m.getColumnDimension()];
        __CLR4_4_1xlixlilb90pa23.R.inc(44039);for (int r = 0; (((r < m.getRowDimension())&&(__CLR4_4_1xlixlilb90pa23.R.iget(44040)!=0|true))||(__CLR4_4_1xlixlilb90pa23.R.iget(44041)==0&false)); r++) {{
            __CLR4_4_1xlixlilb90pa23.R.inc(44042);for (int c = 0; (((c < m.getColumnDimension())&&(__CLR4_4_1xlixlilb90pa23.R.iget(44043)!=0|true))||(__CLR4_4_1xlixlilb90pa23.R.iget(44044)==0&false)); c++) {{
                __CLR4_4_1xlixlilb90pa23.R.inc(44045);double e = m.getEntry(r, c);
                __CLR4_4_1xlixlilb90pa23.R.inc(44046);d[r][c] = e * e;
            }
        }}
        }__CLR4_4_1xlixlilb90pa23.R.inc(44047);return new Array2DRowRealMatrix(d, false);
    }finally{__CLR4_4_1xlixlilb90pa23.R.flushNeeded();}}

    /**
     * @param m Input matrix 1.
     * @param n Input matrix 2.
     * @return the matrix where the elements of m and n are element-wise multiplied.
     */
    private static RealMatrix times(final RealMatrix m, final RealMatrix n) {try{__CLR4_4_1xlixlilb90pa23.R.inc(44048);
        __CLR4_4_1xlixlilb90pa23.R.inc(44049);final double[][] d = new double[m.getRowDimension()][m.getColumnDimension()];
        __CLR4_4_1xlixlilb90pa23.R.inc(44050);for (int r = 0; (((r < m.getRowDimension())&&(__CLR4_4_1xlixlilb90pa23.R.iget(44051)!=0|true))||(__CLR4_4_1xlixlilb90pa23.R.iget(44052)==0&false)); r++) {{
            __CLR4_4_1xlixlilb90pa23.R.inc(44053);for (int c = 0; (((c < m.getColumnDimension())&&(__CLR4_4_1xlixlilb90pa23.R.iget(44054)!=0|true))||(__CLR4_4_1xlixlilb90pa23.R.iget(44055)==0&false)); c++) {{
                __CLR4_4_1xlixlilb90pa23.R.inc(44056);d[r][c] = m.getEntry(r, c) * n.getEntry(r, c);
            }
        }}
        }__CLR4_4_1xlixlilb90pa23.R.inc(44057);return new Array2DRowRealMatrix(d, false);
    }finally{__CLR4_4_1xlixlilb90pa23.R.flushNeeded();}}

    /**
     * @param m Input matrix 1.
     * @param n Input matrix 2.
     * @return Matrix where the elements of m and n are element-wise divided.
     */
    private static RealMatrix divide(final RealMatrix m, final RealMatrix n) {try{__CLR4_4_1xlixlilb90pa23.R.inc(44058);
        __CLR4_4_1xlixlilb90pa23.R.inc(44059);final double[][] d = new double[m.getRowDimension()][m.getColumnDimension()];
        __CLR4_4_1xlixlilb90pa23.R.inc(44060);for (int r = 0; (((r < m.getRowDimension())&&(__CLR4_4_1xlixlilb90pa23.R.iget(44061)!=0|true))||(__CLR4_4_1xlixlilb90pa23.R.iget(44062)==0&false)); r++) {{
            __CLR4_4_1xlixlilb90pa23.R.inc(44063);for (int c = 0; (((c < m.getColumnDimension())&&(__CLR4_4_1xlixlilb90pa23.R.iget(44064)!=0|true))||(__CLR4_4_1xlixlilb90pa23.R.iget(44065)==0&false)); c++) {{
                __CLR4_4_1xlixlilb90pa23.R.inc(44066);d[r][c] = m.getEntry(r, c) / n.getEntry(r, c);
            }
        }}
        }__CLR4_4_1xlixlilb90pa23.R.inc(44067);return new Array2DRowRealMatrix(d, false);
    }finally{__CLR4_4_1xlixlilb90pa23.R.flushNeeded();}}

    /**
     * @param m Input matrix.
     * @param cols Columns to select.
     * @return Matrix representing the selected columns.
     */
    private static RealMatrix selectColumns(final RealMatrix m, final int[] cols) {try{__CLR4_4_1xlixlilb90pa23.R.inc(44068);
        __CLR4_4_1xlixlilb90pa23.R.inc(44069);final double[][] d = new double[m.getRowDimension()][cols.length];
        __CLR4_4_1xlixlilb90pa23.R.inc(44070);for (int r = 0; (((r < m.getRowDimension())&&(__CLR4_4_1xlixlilb90pa23.R.iget(44071)!=0|true))||(__CLR4_4_1xlixlilb90pa23.R.iget(44072)==0&false)); r++) {{
            __CLR4_4_1xlixlilb90pa23.R.inc(44073);for (int c = 0; (((c < cols.length)&&(__CLR4_4_1xlixlilb90pa23.R.iget(44074)!=0|true))||(__CLR4_4_1xlixlilb90pa23.R.iget(44075)==0&false)); c++) {{
                __CLR4_4_1xlixlilb90pa23.R.inc(44076);d[r][c] = m.getEntry(r, cols[c]);
            }
        }}
        }__CLR4_4_1xlixlilb90pa23.R.inc(44077);return new Array2DRowRealMatrix(d, false);
    }finally{__CLR4_4_1xlixlilb90pa23.R.flushNeeded();}}

    /**
     * @param m Input matrix.
     * @param k Diagonal position.
     * @return Upper triangular part of matrix.
     */
    private static RealMatrix triu(final RealMatrix m, int k) {try{__CLR4_4_1xlixlilb90pa23.R.inc(44078);
        __CLR4_4_1xlixlilb90pa23.R.inc(44079);final double[][] d = new double[m.getRowDimension()][m.getColumnDimension()];
        __CLR4_4_1xlixlilb90pa23.R.inc(44080);for (int r = 0; (((r < m.getRowDimension())&&(__CLR4_4_1xlixlilb90pa23.R.iget(44081)!=0|true))||(__CLR4_4_1xlixlilb90pa23.R.iget(44082)==0&false)); r++) {{
            __CLR4_4_1xlixlilb90pa23.R.inc(44083);for (int c = 0; (((c < m.getColumnDimension())&&(__CLR4_4_1xlixlilb90pa23.R.iget(44084)!=0|true))||(__CLR4_4_1xlixlilb90pa23.R.iget(44085)==0&false)); c++) {{
                __CLR4_4_1xlixlilb90pa23.R.inc(44086);d[r][c] = (((r <= c - k )&&(__CLR4_4_1xlixlilb90pa23.R.iget(44087)!=0|true))||(__CLR4_4_1xlixlilb90pa23.R.iget(44088)==0&false))? m.getEntry(r, c) : 0;
            }
        }}
        }__CLR4_4_1xlixlilb90pa23.R.inc(44089);return new Array2DRowRealMatrix(d, false);
    }finally{__CLR4_4_1xlixlilb90pa23.R.flushNeeded();}}

    /**
     * @param m Input matrix.
     * @return Row matrix representing the sums of the rows.
     */
    private static RealMatrix sumRows(final RealMatrix m) {try{__CLR4_4_1xlixlilb90pa23.R.inc(44090);
        __CLR4_4_1xlixlilb90pa23.R.inc(44091);final double[][] d = new double[1][m.getColumnDimension()];
        __CLR4_4_1xlixlilb90pa23.R.inc(44092);for (int c = 0; (((c < m.getColumnDimension())&&(__CLR4_4_1xlixlilb90pa23.R.iget(44093)!=0|true))||(__CLR4_4_1xlixlilb90pa23.R.iget(44094)==0&false)); c++) {{
            __CLR4_4_1xlixlilb90pa23.R.inc(44095);double sum = 0;
            __CLR4_4_1xlixlilb90pa23.R.inc(44096);for (int r = 0; (((r < m.getRowDimension())&&(__CLR4_4_1xlixlilb90pa23.R.iget(44097)!=0|true))||(__CLR4_4_1xlixlilb90pa23.R.iget(44098)==0&false)); r++) {{
                __CLR4_4_1xlixlilb90pa23.R.inc(44099);sum += m.getEntry(r, c);
            }
            }__CLR4_4_1xlixlilb90pa23.R.inc(44100);d[0][c] = sum;
        }
        }__CLR4_4_1xlixlilb90pa23.R.inc(44101);return new Array2DRowRealMatrix(d, false);
    }finally{__CLR4_4_1xlixlilb90pa23.R.flushNeeded();}}

    /**
     * @param m Input matrix.
     * @return the diagonal n-by-n matrix if m is a column matrix or the column
     * matrix representing the diagonal if m is a n-by-n matrix.
     */
    private static RealMatrix diag(final RealMatrix m) {try{__CLR4_4_1xlixlilb90pa23.R.inc(44102);
        __CLR4_4_1xlixlilb90pa23.R.inc(44103);if ((((m.getColumnDimension() == 1)&&(__CLR4_4_1xlixlilb90pa23.R.iget(44104)!=0|true))||(__CLR4_4_1xlixlilb90pa23.R.iget(44105)==0&false))) {{
            __CLR4_4_1xlixlilb90pa23.R.inc(44106);final double[][] d = new double[m.getRowDimension()][m.getRowDimension()];
            __CLR4_4_1xlixlilb90pa23.R.inc(44107);for (int i = 0; (((i < m.getRowDimension())&&(__CLR4_4_1xlixlilb90pa23.R.iget(44108)!=0|true))||(__CLR4_4_1xlixlilb90pa23.R.iget(44109)==0&false)); i++) {{
                __CLR4_4_1xlixlilb90pa23.R.inc(44110);d[i][i] = m.getEntry(i, 0);
            }
            }__CLR4_4_1xlixlilb90pa23.R.inc(44111);return new Array2DRowRealMatrix(d, false);
        } }else {{
            __CLR4_4_1xlixlilb90pa23.R.inc(44112);final double[][] d = new double[m.getRowDimension()][1];
            __CLR4_4_1xlixlilb90pa23.R.inc(44113);for (int i = 0; (((i < m.getColumnDimension())&&(__CLR4_4_1xlixlilb90pa23.R.iget(44114)!=0|true))||(__CLR4_4_1xlixlilb90pa23.R.iget(44115)==0&false)); i++) {{
                __CLR4_4_1xlixlilb90pa23.R.inc(44116);d[i][0] = m.getEntry(i, i);
            }
            }__CLR4_4_1xlixlilb90pa23.R.inc(44117);return new Array2DRowRealMatrix(d, false);
        }
    }}finally{__CLR4_4_1xlixlilb90pa23.R.flushNeeded();}}

    /**
     * Copies a column from m1 to m2.
     *
     * @param m1 Source matrix.
     * @param col1 Source column.
     * @param m2 Target matrix.
     * @param col2 Target column.
     */
    private static void copyColumn(final RealMatrix m1, int col1,
                                   RealMatrix m2, int col2) {try{__CLR4_4_1xlixlilb90pa23.R.inc(44118);
        __CLR4_4_1xlixlilb90pa23.R.inc(44119);for (int i = 0; (((i < m1.getRowDimension())&&(__CLR4_4_1xlixlilb90pa23.R.iget(44120)!=0|true))||(__CLR4_4_1xlixlilb90pa23.R.iget(44121)==0&false)); i++) {{
            __CLR4_4_1xlixlilb90pa23.R.inc(44122);m2.setEntry(i, col2, m1.getEntry(i, col1));
        }
    }}finally{__CLR4_4_1xlixlilb90pa23.R.flushNeeded();}}

    /**
     * @param n Number of rows.
     * @param m Number of columns.
     * @return n-by-m matrix filled with 1.
     */
    private static RealMatrix ones(int n, int m) {try{__CLR4_4_1xlixlilb90pa23.R.inc(44123);
        __CLR4_4_1xlixlilb90pa23.R.inc(44124);final double[][] d = new double[n][m];
        __CLR4_4_1xlixlilb90pa23.R.inc(44125);for (int r = 0; (((r < n)&&(__CLR4_4_1xlixlilb90pa23.R.iget(44126)!=0|true))||(__CLR4_4_1xlixlilb90pa23.R.iget(44127)==0&false)); r++) {{
            __CLR4_4_1xlixlilb90pa23.R.inc(44128);Arrays.fill(d[r], 1);
        }
        }__CLR4_4_1xlixlilb90pa23.R.inc(44129);return new Array2DRowRealMatrix(d, false);
    }finally{__CLR4_4_1xlixlilb90pa23.R.flushNeeded();}}

    /**
     * @param n Number of rows.
     * @param m Number of columns.
     * @return n-by-m matrix of 0 values out of diagonal, and 1 values on
     * the diagonal.
     */
    private static RealMatrix eye(int n, int m) {try{__CLR4_4_1xlixlilb90pa23.R.inc(44130);
        __CLR4_4_1xlixlilb90pa23.R.inc(44131);final double[][] d = new double[n][m];
        __CLR4_4_1xlixlilb90pa23.R.inc(44132);for (int r = 0; (((r < n)&&(__CLR4_4_1xlixlilb90pa23.R.iget(44133)!=0|true))||(__CLR4_4_1xlixlilb90pa23.R.iget(44134)==0&false)); r++) {{
            __CLR4_4_1xlixlilb90pa23.R.inc(44135);if ((((r < m)&&(__CLR4_4_1xlixlilb90pa23.R.iget(44136)!=0|true))||(__CLR4_4_1xlixlilb90pa23.R.iget(44137)==0&false))) {{
                __CLR4_4_1xlixlilb90pa23.R.inc(44138);d[r][r] = 1;
            }
        }}
        }__CLR4_4_1xlixlilb90pa23.R.inc(44139);return new Array2DRowRealMatrix(d, false);
    }finally{__CLR4_4_1xlixlilb90pa23.R.flushNeeded();}}

    /**
     * @param n Number of rows.
     * @param m Number of columns.
     * @return n-by-m matrix of zero values.
     */
    private static RealMatrix zeros(int n, int m) {try{__CLR4_4_1xlixlilb90pa23.R.inc(44140);
        __CLR4_4_1xlixlilb90pa23.R.inc(44141);return new Array2DRowRealMatrix(n, m);
    }finally{__CLR4_4_1xlixlilb90pa23.R.flushNeeded();}}

    /**
     * @param mat Input matrix.
     * @param n Number of row replicates.
     * @param m Number of column replicates.
     * @return a matrix which replicates the input matrix in both directions.
     */
    private static RealMatrix repmat(final RealMatrix mat, int n, int m) {try{__CLR4_4_1xlixlilb90pa23.R.inc(44142);
        __CLR4_4_1xlixlilb90pa23.R.inc(44143);final int rd = mat.getRowDimension();
        __CLR4_4_1xlixlilb90pa23.R.inc(44144);final int cd = mat.getColumnDimension();
        __CLR4_4_1xlixlilb90pa23.R.inc(44145);final double[][] d = new double[n * rd][m * cd];
        __CLR4_4_1xlixlilb90pa23.R.inc(44146);for (int r = 0; (((r < n * rd)&&(__CLR4_4_1xlixlilb90pa23.R.iget(44147)!=0|true))||(__CLR4_4_1xlixlilb90pa23.R.iget(44148)==0&false)); r++) {{
            __CLR4_4_1xlixlilb90pa23.R.inc(44149);for (int c = 0; (((c < m * cd)&&(__CLR4_4_1xlixlilb90pa23.R.iget(44150)!=0|true))||(__CLR4_4_1xlixlilb90pa23.R.iget(44151)==0&false)); c++) {{
                __CLR4_4_1xlixlilb90pa23.R.inc(44152);d[r][c] = mat.getEntry(r % rd, c % cd);
            }
        }}
        }__CLR4_4_1xlixlilb90pa23.R.inc(44153);return new Array2DRowRealMatrix(d, false);
    }finally{__CLR4_4_1xlixlilb90pa23.R.flushNeeded();}}

    /**
     * @param start Start value.
     * @param end End value.
     * @param step Step size.
     * @return a sequence as column matrix.
     */
    private static RealMatrix sequence(double start, double end, double step) {try{__CLR4_4_1xlixlilb90pa23.R.inc(44154);
        __CLR4_4_1xlixlilb90pa23.R.inc(44155);final int size = (int) ((end - start) / step + 1);
        __CLR4_4_1xlixlilb90pa23.R.inc(44156);final double[][] d = new double[size][1];
        __CLR4_4_1xlixlilb90pa23.R.inc(44157);double value = start;
        __CLR4_4_1xlixlilb90pa23.R.inc(44158);for (int r = 0; (((r < size)&&(__CLR4_4_1xlixlilb90pa23.R.iget(44159)!=0|true))||(__CLR4_4_1xlixlilb90pa23.R.iget(44160)==0&false)); r++) {{
            __CLR4_4_1xlixlilb90pa23.R.inc(44161);d[r][0] = value;
            __CLR4_4_1xlixlilb90pa23.R.inc(44162);value += step;
        }
        }__CLR4_4_1xlixlilb90pa23.R.inc(44163);return new Array2DRowRealMatrix(d, false);
    }finally{__CLR4_4_1xlixlilb90pa23.R.flushNeeded();}}

    /**
     * @param m Input matrix.
     * @return the maximum of the matrix element values.
     */
    private static double max(final RealMatrix m) {try{__CLR4_4_1xlixlilb90pa23.R.inc(44164);
        __CLR4_4_1xlixlilb90pa23.R.inc(44165);double max = -Double.MAX_VALUE;
        __CLR4_4_1xlixlilb90pa23.R.inc(44166);for (int r = 0; (((r < m.getRowDimension())&&(__CLR4_4_1xlixlilb90pa23.R.iget(44167)!=0|true))||(__CLR4_4_1xlixlilb90pa23.R.iget(44168)==0&false)); r++) {{
            __CLR4_4_1xlixlilb90pa23.R.inc(44169);for (int c = 0; (((c < m.getColumnDimension())&&(__CLR4_4_1xlixlilb90pa23.R.iget(44170)!=0|true))||(__CLR4_4_1xlixlilb90pa23.R.iget(44171)==0&false)); c++) {{
                __CLR4_4_1xlixlilb90pa23.R.inc(44172);double e = m.getEntry(r, c);
                __CLR4_4_1xlixlilb90pa23.R.inc(44173);if ((((max < e)&&(__CLR4_4_1xlixlilb90pa23.R.iget(44174)!=0|true))||(__CLR4_4_1xlixlilb90pa23.R.iget(44175)==0&false))) {{
                    __CLR4_4_1xlixlilb90pa23.R.inc(44176);max = e;
                }
            }}
        }}
        }__CLR4_4_1xlixlilb90pa23.R.inc(44177);return max;
    }finally{__CLR4_4_1xlixlilb90pa23.R.flushNeeded();}}

    /**
     * @param m Input matrix.
     * @return the minimum of the matrix element values.
     */
    private static double min(final RealMatrix m) {try{__CLR4_4_1xlixlilb90pa23.R.inc(44178);
        __CLR4_4_1xlixlilb90pa23.R.inc(44179);double min = Double.MAX_VALUE;
        __CLR4_4_1xlixlilb90pa23.R.inc(44180);for (int r = 0; (((r < m.getRowDimension())&&(__CLR4_4_1xlixlilb90pa23.R.iget(44181)!=0|true))||(__CLR4_4_1xlixlilb90pa23.R.iget(44182)==0&false)); r++) {{
            __CLR4_4_1xlixlilb90pa23.R.inc(44183);for (int c = 0; (((c < m.getColumnDimension())&&(__CLR4_4_1xlixlilb90pa23.R.iget(44184)!=0|true))||(__CLR4_4_1xlixlilb90pa23.R.iget(44185)==0&false)); c++) {{
                __CLR4_4_1xlixlilb90pa23.R.inc(44186);double e = m.getEntry(r, c);
                __CLR4_4_1xlixlilb90pa23.R.inc(44187);if ((((min > e)&&(__CLR4_4_1xlixlilb90pa23.R.iget(44188)!=0|true))||(__CLR4_4_1xlixlilb90pa23.R.iget(44189)==0&false))) {{
                    __CLR4_4_1xlixlilb90pa23.R.inc(44190);min = e;
                }
            }}
        }}
        }__CLR4_4_1xlixlilb90pa23.R.inc(44191);return min;
    }finally{__CLR4_4_1xlixlilb90pa23.R.flushNeeded();}}

    /**
     * @param m Input array.
     * @return the maximum of the array values.
     */
    private static double max(final double[] m) {try{__CLR4_4_1xlixlilb90pa23.R.inc(44192);
        __CLR4_4_1xlixlilb90pa23.R.inc(44193);double max = -Double.MAX_VALUE;
        __CLR4_4_1xlixlilb90pa23.R.inc(44194);for (int r = 0; (((r < m.length)&&(__CLR4_4_1xlixlilb90pa23.R.iget(44195)!=0|true))||(__CLR4_4_1xlixlilb90pa23.R.iget(44196)==0&false)); r++) {{
            __CLR4_4_1xlixlilb90pa23.R.inc(44197);if ((((max < m[r])&&(__CLR4_4_1xlixlilb90pa23.R.iget(44198)!=0|true))||(__CLR4_4_1xlixlilb90pa23.R.iget(44199)==0&false))) {{
                __CLR4_4_1xlixlilb90pa23.R.inc(44200);max = m[r];
            }
        }}
        }__CLR4_4_1xlixlilb90pa23.R.inc(44201);return max;
    }finally{__CLR4_4_1xlixlilb90pa23.R.flushNeeded();}}

    /**
     * @param m Input array.
     * @return the minimum of the array values.
     */
    private static double min(final double[] m) {try{__CLR4_4_1xlixlilb90pa23.R.inc(44202);
        __CLR4_4_1xlixlilb90pa23.R.inc(44203);double min = Double.MAX_VALUE;
        __CLR4_4_1xlixlilb90pa23.R.inc(44204);for (int r = 0; (((r < m.length)&&(__CLR4_4_1xlixlilb90pa23.R.iget(44205)!=0|true))||(__CLR4_4_1xlixlilb90pa23.R.iget(44206)==0&false)); r++) {{
            __CLR4_4_1xlixlilb90pa23.R.inc(44207);if ((((min > m[r])&&(__CLR4_4_1xlixlilb90pa23.R.iget(44208)!=0|true))||(__CLR4_4_1xlixlilb90pa23.R.iget(44209)==0&false))) {{
                __CLR4_4_1xlixlilb90pa23.R.inc(44210);min = m[r];
            }
        }}
        }__CLR4_4_1xlixlilb90pa23.R.inc(44211);return min;
    }finally{__CLR4_4_1xlixlilb90pa23.R.flushNeeded();}}

    /**
     * @param indices Input index array.
     * @return the inverse of the mapping defined by indices.
     */
    private static int[] inverse(final int[] indices) {try{__CLR4_4_1xlixlilb90pa23.R.inc(44212);
        __CLR4_4_1xlixlilb90pa23.R.inc(44213);final int[] inverse = new int[indices.length];
        __CLR4_4_1xlixlilb90pa23.R.inc(44214);for (int i = 0; (((i < indices.length)&&(__CLR4_4_1xlixlilb90pa23.R.iget(44215)!=0|true))||(__CLR4_4_1xlixlilb90pa23.R.iget(44216)==0&false)); i++) {{
            __CLR4_4_1xlixlilb90pa23.R.inc(44217);inverse[indices[i]] = i;
        }
        }__CLR4_4_1xlixlilb90pa23.R.inc(44218);return inverse;
    }finally{__CLR4_4_1xlixlilb90pa23.R.flushNeeded();}}

    /**
     * @param indices Input index array.
     * @return the indices in inverse order (last is first).
     */
    private static int[] reverse(final int[] indices) {try{__CLR4_4_1xlixlilb90pa23.R.inc(44219);
        __CLR4_4_1xlixlilb90pa23.R.inc(44220);final int[] reverse = new int[indices.length];
        __CLR4_4_1xlixlilb90pa23.R.inc(44221);for (int i = 0; (((i < indices.length)&&(__CLR4_4_1xlixlilb90pa23.R.iget(44222)!=0|true))||(__CLR4_4_1xlixlilb90pa23.R.iget(44223)==0&false)); i++) {{
            __CLR4_4_1xlixlilb90pa23.R.inc(44224);reverse[i] = indices[indices.length - i - 1];
        }
        }__CLR4_4_1xlixlilb90pa23.R.inc(44225);return reverse;
    }finally{__CLR4_4_1xlixlilb90pa23.R.flushNeeded();}}

    /**
     * @param size Length of random array.
     * @return an array of Gaussian random numbers.
     */
    private double[] randn(int size) {try{__CLR4_4_1xlixlilb90pa23.R.inc(44226);
        __CLR4_4_1xlixlilb90pa23.R.inc(44227);final double[] randn = new double[size];
        __CLR4_4_1xlixlilb90pa23.R.inc(44228);for (int i = 0; (((i < size)&&(__CLR4_4_1xlixlilb90pa23.R.iget(44229)!=0|true))||(__CLR4_4_1xlixlilb90pa23.R.iget(44230)==0&false)); i++) {{
            __CLR4_4_1xlixlilb90pa23.R.inc(44231);randn[i] = random.nextGaussian();
        }
        }__CLR4_4_1xlixlilb90pa23.R.inc(44232);return randn;
    }finally{__CLR4_4_1xlixlilb90pa23.R.flushNeeded();}}

    /**
     * @param size Number of rows.
     * @param popSize Population size.
     * @return a 2-dimensional matrix of Gaussian random numbers.
     */
    private RealMatrix randn1(int size, int popSize) {try{__CLR4_4_1xlixlilb90pa23.R.inc(44233);
        __CLR4_4_1xlixlilb90pa23.R.inc(44234);final double[][] d = new double[size][popSize];
        __CLR4_4_1xlixlilb90pa23.R.inc(44235);for (int r = 0; (((r < size)&&(__CLR4_4_1xlixlilb90pa23.R.iget(44236)!=0|true))||(__CLR4_4_1xlixlilb90pa23.R.iget(44237)==0&false)); r++) {{
            __CLR4_4_1xlixlilb90pa23.R.inc(44238);for (int c = 0; (((c < popSize)&&(__CLR4_4_1xlixlilb90pa23.R.iget(44239)!=0|true))||(__CLR4_4_1xlixlilb90pa23.R.iget(44240)==0&false)); c++) {{
                __CLR4_4_1xlixlilb90pa23.R.inc(44241);d[r][c] = random.nextGaussian();
            }
        }}
        }__CLR4_4_1xlixlilb90pa23.R.inc(44242);return new Array2DRowRealMatrix(d, false);
    }finally{__CLR4_4_1xlixlilb90pa23.R.flushNeeded();}}
}
