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

package org.apache.commons.math3.optimization.general;

import org.apache.commons.math3.analysis.DifferentiableMultivariateVectorFunction;
import org.apache.commons.math3.analysis.FunctionUtils;
import org.apache.commons.math3.analysis.differentiation.DerivativeStructure;
import org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableVectorFunction;
import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.exception.NumberIsTooSmallException;
import org.apache.commons.math3.exception.util.LocalizedFormats;
import org.apache.commons.math3.linear.ArrayRealVector;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.DiagonalMatrix;
import org.apache.commons.math3.linear.DecompositionSolver;
import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.QRDecomposition;
import org.apache.commons.math3.linear.EigenDecomposition;
import org.apache.commons.math3.optimization.OptimizationData;
import org.apache.commons.math3.optimization.InitialGuess;
import org.apache.commons.math3.optimization.Target;
import org.apache.commons.math3.optimization.Weight;
import org.apache.commons.math3.optimization.ConvergenceChecker;
import org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer;
import org.apache.commons.math3.optimization.PointVectorValuePair;
import org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer;
import org.apache.commons.math3.util.FastMath;

/**
 * Base class for implementing least squares optimizers.
 * It handles the boilerplate methods associated to thresholds settings,
 * Jacobian and error estimation.
 * <br/>
 * This class constructs the Jacobian matrix of the function argument in method
 * {@link BaseAbstractMultivariateVectorOptimizer#optimize(int,MultivariateVectorFunction,OptimizationData[])
 * optimize} and assumes that the rows of that matrix iterate on the model
 * functions while the columns iterate on the parameters; thus, the numbers
 * of rows is equal to the dimension of the
 * {@link org.apache.commons.math3.optimization.Target Target} while
 * the number of columns is equal to the dimension of the
 * {@link org.apache.commons.math3.optimization.InitialGuess InitialGuess}.
 *
 * @version $Id$
 * @deprecated As of 3.1 (to be removed in 4.0).
 * @since 1.2
 */
@Deprecated
public abstract class AbstractLeastSquaresOptimizer
    extends BaseAbstractMultivariateVectorOptimizer<DifferentiableMultivariateVectorFunction>
    implements DifferentiableMultivariateVectorOptimizer {public static class __CLR4_4_1yscysclb90pa44{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,45205,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /**
     * Singularity threshold (cf. {@link #getCovariances(double)}).
     * @deprecated As of 3.1.
     */
    @Deprecated
    private static final double DEFAULT_SINGULARITY_THRESHOLD = 1e-14;
    /**
     * Jacobian matrix of the weighted residuals.
     * This matrix is in canonical form just after the calls to
     * {@link #updateJacobian()}, but may be modified by the solver
     * in the derived class (the {@link LevenbergMarquardtOptimizer
     * Levenberg-Marquardt optimizer} does this).
     * @deprecated As of 3.1. To be removed in 4.0. Please use
     * {@link #computeWeightedJacobian(double[])} instead.
     */
    @Deprecated
    protected double[][] weightedResidualJacobian;
    /** Number of columns of the jacobian matrix.
     * @deprecated As of 3.1.
     */
    @Deprecated
    protected int cols;
    /** Number of rows of the jacobian matrix.
     * @deprecated As of 3.1.
     */
    @Deprecated
    protected int rows;
    /** Current point.
     * @deprecated As of 3.1.
     */
    @Deprecated
    protected double[] point;
    /** Current objective function value.
     * @deprecated As of 3.1.
     */
    @Deprecated
    protected double[] objective;
    /** Weighted residuals
     * @deprecated As of 3.1.
     */
    @Deprecated
    protected double[] weightedResiduals;
    /** Cost value (square root of the sum of the residuals).
     * @deprecated As of 3.1. Field to become "private" in 4.0.
     * Please use {@link #setCost(double)}.
     */
    @Deprecated
    protected double cost;
    /** Objective function derivatives. */
    private MultivariateDifferentiableVectorFunction jF;
    /** Number of evaluations of the Jacobian. */
    private int jacobianEvaluations;
    /** Square-root of the weight matrix. */
    private RealMatrix weightMatrixSqrt;

    /**
     * Simple constructor with default settings.
     * The convergence check is set to a {@link
     * org.apache.commons.math3.optimization.SimpleVectorValueChecker}.
     * @deprecated See {@link org.apache.commons.math3.optimization.SimpleValueChecker#SimpleValueChecker()}
     */
    @Deprecated
    protected AbstractLeastSquaresOptimizer() {try{__CLR4_4_1yscysclb90pa44.R.inc(45084);}finally{__CLR4_4_1yscysclb90pa44.R.flushNeeded();}}

    /**
     * @param checker Convergence checker.
     */
    protected AbstractLeastSquaresOptimizer(ConvergenceChecker<PointVectorValuePair> checker) {
        super(checker);__CLR4_4_1yscysclb90pa44.R.inc(45086);try{__CLR4_4_1yscysclb90pa44.R.inc(45085);
    }finally{__CLR4_4_1yscysclb90pa44.R.flushNeeded();}}

    /**
     * @return the number of evaluations of the Jacobian function.
     */
    public int getJacobianEvaluations() {try{__CLR4_4_1yscysclb90pa44.R.inc(45087);
        __CLR4_4_1yscysclb90pa44.R.inc(45088);return jacobianEvaluations;
    }finally{__CLR4_4_1yscysclb90pa44.R.flushNeeded();}}

    /**
     * Update the jacobian matrix.
     *
     * @throws DimensionMismatchException if the Jacobian dimension does not
     * match problem dimension.
     * @deprecated As of 3.1. Please use {@link #computeWeightedJacobian(double[])}
     * instead.
     */
    @Deprecated
    protected void updateJacobian() {try{__CLR4_4_1yscysclb90pa44.R.inc(45089);
        __CLR4_4_1yscysclb90pa44.R.inc(45090);final RealMatrix weightedJacobian = computeWeightedJacobian(point);
        __CLR4_4_1yscysclb90pa44.R.inc(45091);weightedResidualJacobian = weightedJacobian.scalarMultiply(-1).getData();
    }finally{__CLR4_4_1yscysclb90pa44.R.flushNeeded();}}

    /**
     * Computes the Jacobian matrix.
     *
     * @param params Model parameters at which to compute the Jacobian.
     * @return the weighted Jacobian: W<sup>1/2</sup> J.
     * @throws DimensionMismatchException if the Jacobian dimension does not
     * match problem dimension.
     * @since 3.1
     */
    protected RealMatrix computeWeightedJacobian(double[] params) {try{__CLR4_4_1yscysclb90pa44.R.inc(45092);
        __CLR4_4_1yscysclb90pa44.R.inc(45093);++jacobianEvaluations;

        __CLR4_4_1yscysclb90pa44.R.inc(45094);final DerivativeStructure[] dsPoint = new DerivativeStructure[params.length];
        __CLR4_4_1yscysclb90pa44.R.inc(45095);final int nC = params.length;
        __CLR4_4_1yscysclb90pa44.R.inc(45096);for (int i = 0; (((i < nC)&&(__CLR4_4_1yscysclb90pa44.R.iget(45097)!=0|true))||(__CLR4_4_1yscysclb90pa44.R.iget(45098)==0&false)); ++i) {{
            __CLR4_4_1yscysclb90pa44.R.inc(45099);dsPoint[i] = new DerivativeStructure(nC, 1, i, params[i]);
        }
        }__CLR4_4_1yscysclb90pa44.R.inc(45100);final DerivativeStructure[] dsValue = jF.value(dsPoint);
        __CLR4_4_1yscysclb90pa44.R.inc(45101);final int nR = getTarget().length;
        __CLR4_4_1yscysclb90pa44.R.inc(45102);if ((((dsValue.length != nR)&&(__CLR4_4_1yscysclb90pa44.R.iget(45103)!=0|true))||(__CLR4_4_1yscysclb90pa44.R.iget(45104)==0&false))) {{
            __CLR4_4_1yscysclb90pa44.R.inc(45105);throw new DimensionMismatchException(dsValue.length, nR);
        }
        }__CLR4_4_1yscysclb90pa44.R.inc(45106);final double[][] jacobianData = new double[nR][nC];
        __CLR4_4_1yscysclb90pa44.R.inc(45107);for (int i = 0; (((i < nR)&&(__CLR4_4_1yscysclb90pa44.R.iget(45108)!=0|true))||(__CLR4_4_1yscysclb90pa44.R.iget(45109)==0&false)); ++i) {{
            __CLR4_4_1yscysclb90pa44.R.inc(45110);int[] orders = new int[nC];
            __CLR4_4_1yscysclb90pa44.R.inc(45111);for (int j = 0; (((j < nC)&&(__CLR4_4_1yscysclb90pa44.R.iget(45112)!=0|true))||(__CLR4_4_1yscysclb90pa44.R.iget(45113)==0&false)); ++j) {{
                __CLR4_4_1yscysclb90pa44.R.inc(45114);orders[j] = 1;
                __CLR4_4_1yscysclb90pa44.R.inc(45115);jacobianData[i][j] = dsValue[i].getPartialDerivative(orders);
                __CLR4_4_1yscysclb90pa44.R.inc(45116);orders[j] = 0;
            }
        }}

        }__CLR4_4_1yscysclb90pa44.R.inc(45117);return weightMatrixSqrt.multiply(MatrixUtils.createRealMatrix(jacobianData));
    }finally{__CLR4_4_1yscysclb90pa44.R.flushNeeded();}}

    /**
     * Update the residuals array and cost function value.
     * @throws DimensionMismatchException if the dimension does not match the
     * problem dimension.
     * @throws org.apache.commons.math3.exception.TooManyEvaluationsException
     * if the maximal number of evaluations is exceeded.
     * @deprecated As of 3.1. Please use {@link #computeResiduals(double[])},
     * {@link #computeObjectiveValue(double[])}, {@link #computeCost(double[])}
     * and {@link #setCost(double)} instead.
     */
    @Deprecated
    protected void updateResidualsAndCost() {try{__CLR4_4_1yscysclb90pa44.R.inc(45118);
        __CLR4_4_1yscysclb90pa44.R.inc(45119);objective = computeObjectiveValue(point);
        __CLR4_4_1yscysclb90pa44.R.inc(45120);final double[] res = computeResiduals(objective);

        // Compute cost.
        __CLR4_4_1yscysclb90pa44.R.inc(45121);cost = computeCost(res);

        // Compute weighted residuals.
        __CLR4_4_1yscysclb90pa44.R.inc(45122);final ArrayRealVector residuals = new ArrayRealVector(res);
        __CLR4_4_1yscysclb90pa44.R.inc(45123);weightedResiduals = weightMatrixSqrt.operate(residuals).toArray();
    }finally{__CLR4_4_1yscysclb90pa44.R.flushNeeded();}}

    /**
     * Computes the cost.
     *
     * @param residuals Residuals.
     * @return the cost.
     * @see #computeResiduals(double[])
     * @since 3.1
     */
    protected double computeCost(double[] residuals) {try{__CLR4_4_1yscysclb90pa44.R.inc(45124);
        __CLR4_4_1yscysclb90pa44.R.inc(45125);final ArrayRealVector r = new ArrayRealVector(residuals);
        __CLR4_4_1yscysclb90pa44.R.inc(45126);return FastMath.sqrt(r.dotProduct(getWeight().operate(r)));
    }finally{__CLR4_4_1yscysclb90pa44.R.flushNeeded();}}

    /**
     * Get the Root Mean Square value.
     * Get the Root Mean Square value, i.e. the root of the arithmetic
     * mean of the square of all weighted residuals. This is related to the
     * criterion that is minimized by the optimizer as follows: if
     * <em>c</em> if the criterion, and <em>n</em> is the number of
     * measurements, then the RMS is <em>sqrt (c/n)</em>.
     *
     * @return RMS value
     */
    public double getRMS() {try{__CLR4_4_1yscysclb90pa44.R.inc(45127);
        __CLR4_4_1yscysclb90pa44.R.inc(45128);return FastMath.sqrt(getChiSquare() / rows);
    }finally{__CLR4_4_1yscysclb90pa44.R.flushNeeded();}}

    /**
     * Get a Chi-Square-like value assuming the N residuals follow N
     * distinct normal distributions centered on 0 and whose variances are
     * the reciprocal of the weights.
     * @return chi-square value
     */
    public double getChiSquare() {try{__CLR4_4_1yscysclb90pa44.R.inc(45129);
        __CLR4_4_1yscysclb90pa44.R.inc(45130);return cost * cost;
    }finally{__CLR4_4_1yscysclb90pa44.R.flushNeeded();}}

    /**
     * Gets the square-root of the weight matrix.
     *
     * @return the square-root of the weight matrix.
     * @since 3.1
     */
    public RealMatrix getWeightSquareRoot() {try{__CLR4_4_1yscysclb90pa44.R.inc(45131);
        __CLR4_4_1yscysclb90pa44.R.inc(45132);return weightMatrixSqrt.copy();
    }finally{__CLR4_4_1yscysclb90pa44.R.flushNeeded();}}

    /**
     * Sets the cost.
     *
     * @param cost Cost value.
     * @since 3.1
     */
    protected void setCost(double cost) {try{__CLR4_4_1yscysclb90pa44.R.inc(45133);
        __CLR4_4_1yscysclb90pa44.R.inc(45134);this.cost = cost;
    }finally{__CLR4_4_1yscysclb90pa44.R.flushNeeded();}}

    /**
     * Get the covariance matrix of the optimized parameters.
     *
     * @return the covariance matrix.
     * @throws org.apache.commons.math3.linear.SingularMatrixException
     * if the covariance matrix cannot be computed (singular problem).
     * @see #getCovariances(double)
     * @deprecated As of 3.1. Please use {@link #computeCovariances(double[],double)}
     * instead.
     */
    @Deprecated
    public double[][] getCovariances() {try{__CLR4_4_1yscysclb90pa44.R.inc(45135);
        __CLR4_4_1yscysclb90pa44.R.inc(45136);return getCovariances(DEFAULT_SINGULARITY_THRESHOLD);
    }finally{__CLR4_4_1yscysclb90pa44.R.flushNeeded();}}

    /**
     * Get the covariance matrix of the optimized parameters.
     * <br/>
     * Note that this operation involves the inversion of the
     * <code>J<sup>T</sup>J</code> matrix, where {@code J} is the
     * Jacobian matrix.
     * The {@code threshold} parameter is a way for the caller to specify
     * that the result of this computation should be considered meaningless,
     * and thus trigger an exception.
     *
     * @param threshold Singularity threshold.
     * @return the covariance matrix.
     * @throws org.apache.commons.math3.linear.SingularMatrixException
     * if the covariance matrix cannot be computed (singular problem).
     * @deprecated As of 3.1. Please use {@link #computeCovariances(double[],double)}
     * instead.
     */
    @Deprecated
    public double[][] getCovariances(double threshold) {try{__CLR4_4_1yscysclb90pa44.R.inc(45137);
        __CLR4_4_1yscysclb90pa44.R.inc(45138);return computeCovariances(point, threshold);
    }finally{__CLR4_4_1yscysclb90pa44.R.flushNeeded();}}

    /**
     * Get the covariance matrix of the optimized parameters.
     * <br/>
     * Note that this operation involves the inversion of the
     * <code>J<sup>T</sup>J</code> matrix, where {@code J} is the
     * Jacobian matrix.
     * The {@code threshold} parameter is a way for the caller to specify
     * that the result of this computation should be considered meaningless,
     * and thus trigger an exception.
     *
     * @param params Model parameters.
     * @param threshold Singularity threshold.
     * @return the covariance matrix.
     * @throws org.apache.commons.math3.linear.SingularMatrixException
     * if the covariance matrix cannot be computed (singular problem).
     * @since 3.1
     */
    public double[][] computeCovariances(double[] params,
                                         double threshold) {try{__CLR4_4_1yscysclb90pa44.R.inc(45139);
        // Set up the Jacobian.
        __CLR4_4_1yscysclb90pa44.R.inc(45140);final RealMatrix j = computeWeightedJacobian(params);

        // Compute transpose(J)J.
        __CLR4_4_1yscysclb90pa44.R.inc(45141);final RealMatrix jTj = j.transpose().multiply(j);

        // Compute the covariances matrix.
        __CLR4_4_1yscysclb90pa44.R.inc(45142);final DecompositionSolver solver
            = new QRDecomposition(jTj, threshold).getSolver();
        __CLR4_4_1yscysclb90pa44.R.inc(45143);return solver.getInverse().getData();
    }finally{__CLR4_4_1yscysclb90pa44.R.flushNeeded();}}

    /**
     * <p>
     * Returns an estimate of the standard deviation of each parameter. The
     * returned values are the so-called (asymptotic) standard errors on the
     * parameters, defined as {@code sd(a[i]) = sqrt(S / (n - m) * C[i][i])},
     * where {@code a[i]} is the optimized value of the {@code i}-th parameter,
     * {@code S} is the minimized value of the sum of squares objective function
     * (as returned by {@link #getChiSquare()}), {@code n} is the number of
     * observations, {@code m} is the number of parameters and {@code C} is the
     * covariance matrix.
     * </p>
     * <p>
     * See also
     * <a href="http://en.wikipedia.org/wiki/Least_squares">Wikipedia</a>,
     * or
     * <a href="http://mathworld.wolfram.com/LeastSquaresFitting.html">MathWorld</a>,
     * equations (34) and (35) for a particular case.
     * </p>
     *
     * @return an estimate of the standard deviation of the optimized parameters
     * @throws org.apache.commons.math3.linear.SingularMatrixException
     * if the covariance matrix cannot be computed.
     * @throws NumberIsTooSmallException if the number of degrees of freedom is not
     * positive, i.e. the number of measurements is less or equal to the number of
     * parameters.
     * @deprecated as of version 3.1, {@link #computeSigma(double[],double)} should be used
     * instead. It should be emphasized that {@code guessParametersErrors} and
     * {@code computeSigma} are <em>not</em> strictly equivalent.
     */
    @Deprecated
    public double[] guessParametersErrors() {try{__CLR4_4_1yscysclb90pa44.R.inc(45144);
        __CLR4_4_1yscysclb90pa44.R.inc(45145);if ((((rows <= cols)&&(__CLR4_4_1yscysclb90pa44.R.iget(45146)!=0|true))||(__CLR4_4_1yscysclb90pa44.R.iget(45147)==0&false))) {{
            __CLR4_4_1yscysclb90pa44.R.inc(45148);throw new NumberIsTooSmallException(LocalizedFormats.NO_DEGREES_OF_FREEDOM,
                                                rows, cols, false);
        }
        }__CLR4_4_1yscysclb90pa44.R.inc(45149);double[] errors = new double[cols];
        __CLR4_4_1yscysclb90pa44.R.inc(45150);final double c = FastMath.sqrt(getChiSquare() / (rows - cols));
        __CLR4_4_1yscysclb90pa44.R.inc(45151);double[][] covar = computeCovariances(point, 1e-14);
        __CLR4_4_1yscysclb90pa44.R.inc(45152);for (int i = 0; (((i < errors.length)&&(__CLR4_4_1yscysclb90pa44.R.iget(45153)!=0|true))||(__CLR4_4_1yscysclb90pa44.R.iget(45154)==0&false)); ++i) {{
            __CLR4_4_1yscysclb90pa44.R.inc(45155);errors[i] = FastMath.sqrt(covar[i][i]) * c;
        }
        }__CLR4_4_1yscysclb90pa44.R.inc(45156);return errors;
    }finally{__CLR4_4_1yscysclb90pa44.R.flushNeeded();}}

    /**
     * Computes an estimate of the standard deviation of the parameters. The
     * returned values are the square root of the diagonal coefficients of the
     * covariance matrix, {@code sd(a[i]) ~= sqrt(C[i][i])}, where {@code a[i]}
     * is the optimized value of the {@code i}-th parameter, and {@code C} is
     * the covariance matrix.
     *
     * @param params Model parameters.
     * @param covarianceSingularityThreshold Singularity threshold (see
     * {@link #computeCovariances(double[],double) computeCovariances}).
     * @return an estimate of the standard deviation of the optimized parameters
     * @throws org.apache.commons.math3.linear.SingularMatrixException
     * if the covariance matrix cannot be computed.
     * @since 3.1
     */
    public double[] computeSigma(double[] params,
                                 double covarianceSingularityThreshold) {try{__CLR4_4_1yscysclb90pa44.R.inc(45157);
        __CLR4_4_1yscysclb90pa44.R.inc(45158);final int nC = params.length;
        __CLR4_4_1yscysclb90pa44.R.inc(45159);final double[] sig = new double[nC];
        __CLR4_4_1yscysclb90pa44.R.inc(45160);final double[][] cov = computeCovariances(params, covarianceSingularityThreshold);
        __CLR4_4_1yscysclb90pa44.R.inc(45161);for (int i = 0; (((i < nC)&&(__CLR4_4_1yscysclb90pa44.R.iget(45162)!=0|true))||(__CLR4_4_1yscysclb90pa44.R.iget(45163)==0&false)); ++i) {{
            __CLR4_4_1yscysclb90pa44.R.inc(45164);sig[i] = FastMath.sqrt(cov[i][i]);
        }
        }__CLR4_4_1yscysclb90pa44.R.inc(45165);return sig;
    }finally{__CLR4_4_1yscysclb90pa44.R.flushNeeded();}}

    /** {@inheritDoc}
     * @deprecated As of 3.1. Please use
     * {@link BaseAbstractMultivariateVectorOptimizer#optimize(int,MultivariateVectorFunction,OptimizationData[])
     * optimize(int,MultivariateDifferentiableVectorFunction,OptimizationData...)}
     * instead.
     */
    @Override
    @Deprecated
    public PointVectorValuePair optimize(int maxEval,
                                         final DifferentiableMultivariateVectorFunction f,
                                         final double[] target, final double[] weights,
                                         final double[] startPoint) {try{__CLR4_4_1yscysclb90pa44.R.inc(45166);
        __CLR4_4_1yscysclb90pa44.R.inc(45167);return optimizeInternal(maxEval,
                                FunctionUtils.toMultivariateDifferentiableVectorFunction(f),
                                new Target(target),
                                new Weight(weights),
                                new InitialGuess(startPoint));
    }finally{__CLR4_4_1yscysclb90pa44.R.flushNeeded();}}

    /**
     * Optimize an objective function.
     * Optimization is considered to be a weighted least-squares minimization.
     * The cost function to be minimized is
     * <code>&sum;weight<sub>i</sub>(objective<sub>i</sub> - target<sub>i</sub>)<sup>2</sup></code>
     *
     * @param f Objective function.
     * @param target Target value for the objective functions at optimum.
     * @param weights Weights for the least squares cost computation.
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
     * {@link BaseAbstractMultivariateVectorOptimizer#optimize(int,MultivariateVectorFunction,OptimizationData[])
     * optimize(int,MultivariateDifferentiableVectorFunction,OptimizationData...)}
     * instead.
     */
    @Deprecated
    public PointVectorValuePair optimize(final int maxEval,
                                         final MultivariateDifferentiableVectorFunction f,
                                         final double[] target, final double[] weights,
                                         final double[] startPoint) {try{__CLR4_4_1yscysclb90pa44.R.inc(45168);
        __CLR4_4_1yscysclb90pa44.R.inc(45169);return optimizeInternal(maxEval, f,
                                new Target(target),
                                new Weight(weights),
                                new InitialGuess(startPoint));
    }finally{__CLR4_4_1yscysclb90pa44.R.flushNeeded();}}

    /**
     * Optimize an objective function.
     * Optimization is considered to be a weighted least-squares minimization.
     * The cost function to be minimized is
     * <code>&sum;weight<sub>i</sub>(objective<sub>i</sub> - target<sub>i</sub>)<sup>2</sup></code>
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
     * @throws org.apache.commons.math3.exception.TooManyEvaluationsException if
     * the maximal number of evaluations is exceeded.
     * @throws DimensionMismatchException if the target, and weight arguments
     * have inconsistent dimensions.
     * @see BaseAbstractMultivariateVectorOptimizer#optimizeInternal(int,MultivariateVectorFunction,OptimizationData[])
     * @since 3.1
     * @deprecated As of 3.1. Override is necessary only until this class's generic
     * argument is changed to {@code MultivariateDifferentiableVectorFunction}.
     */
    @Deprecated
    protected PointVectorValuePair optimizeInternal(final int maxEval,
                                                    final MultivariateDifferentiableVectorFunction f,
                                                    OptimizationData... optData) {try{__CLR4_4_1yscysclb90pa44.R.inc(45170);
        // XXX Conversion will be removed when the generic argument of the
        // base class becomes "MultivariateDifferentiableVectorFunction".
        __CLR4_4_1yscysclb90pa44.R.inc(45171);return super.optimizeInternal(maxEval, FunctionUtils.toDifferentiableMultivariateVectorFunction(f), optData);
    }finally{__CLR4_4_1yscysclb90pa44.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    protected void setUp() {try{__CLR4_4_1yscysclb90pa44.R.inc(45172);
        __CLR4_4_1yscysclb90pa44.R.inc(45173);super.setUp();

        // Reset counter.
        __CLR4_4_1yscysclb90pa44.R.inc(45174);jacobianEvaluations = 0;

        // Square-root of the weight matrix.
        __CLR4_4_1yscysclb90pa44.R.inc(45175);weightMatrixSqrt = squareRoot(getWeight());

        // Store least squares problem characteristics.
        // XXX The conversion won't be necessary when the generic argument of
        // the base class becomes "MultivariateDifferentiableVectorFunction".
        // XXX "jF" is not strictly necessary anymore but is currently more
        // efficient than converting the value returned from "getObjectiveFunction()"
        // every time it is used.
        __CLR4_4_1yscysclb90pa44.R.inc(45176);jF = FunctionUtils.toMultivariateDifferentiableVectorFunction((DifferentiableMultivariateVectorFunction) getObjectiveFunction());

        // Arrays shared with "private" and "protected" methods.
        __CLR4_4_1yscysclb90pa44.R.inc(45177);point = getStartPoint();
        __CLR4_4_1yscysclb90pa44.R.inc(45178);rows = getTarget().length;
        __CLR4_4_1yscysclb90pa44.R.inc(45179);cols = point.length;
    }finally{__CLR4_4_1yscysclb90pa44.R.flushNeeded();}}

    /**
     * Computes the residuals.
     * The residual is the difference between the observed (target)
     * values and the model (objective function) value.
     * There is one residual for each element of the vector-valued
     * function.
     *
     * @param objectiveValue Value of the the objective function. This is
     * the value returned from a call to
     * {@link #computeObjectiveValue(double[]) computeObjectiveValue}
     * (whose array argument contains the model parameters).
     * @return the residuals.
     * @throws DimensionMismatchException if {@code params} has a wrong
     * length.
     * @since 3.1
     */
    protected double[] computeResiduals(double[] objectiveValue) {try{__CLR4_4_1yscysclb90pa44.R.inc(45180);
        __CLR4_4_1yscysclb90pa44.R.inc(45181);final double[] target = getTarget();
        __CLR4_4_1yscysclb90pa44.R.inc(45182);if ((((objectiveValue.length != target.length)&&(__CLR4_4_1yscysclb90pa44.R.iget(45183)!=0|true))||(__CLR4_4_1yscysclb90pa44.R.iget(45184)==0&false))) {{
            __CLR4_4_1yscysclb90pa44.R.inc(45185);throw new DimensionMismatchException(target.length,
                                                 objectiveValue.length);
        }

        }__CLR4_4_1yscysclb90pa44.R.inc(45186);final double[] residuals = new double[target.length];
        __CLR4_4_1yscysclb90pa44.R.inc(45187);for (int i = 0; (((i < target.length)&&(__CLR4_4_1yscysclb90pa44.R.iget(45188)!=0|true))||(__CLR4_4_1yscysclb90pa44.R.iget(45189)==0&false)); i++) {{
            __CLR4_4_1yscysclb90pa44.R.inc(45190);residuals[i] = target[i] - objectiveValue[i];
        }

        }__CLR4_4_1yscysclb90pa44.R.inc(45191);return residuals;
    }finally{__CLR4_4_1yscysclb90pa44.R.flushNeeded();}}

    /**
     * Computes the square-root of the weight matrix.
     *
     * @param m Symmetric, positive-definite (weight) matrix.
     * @return the square-root of the weight matrix.
     */
    private RealMatrix squareRoot(RealMatrix m) {try{__CLR4_4_1yscysclb90pa44.R.inc(45192);
        __CLR4_4_1yscysclb90pa44.R.inc(45193);if ((((m instanceof DiagonalMatrix)&&(__CLR4_4_1yscysclb90pa44.R.iget(45194)!=0|true))||(__CLR4_4_1yscysclb90pa44.R.iget(45195)==0&false))) {{
            __CLR4_4_1yscysclb90pa44.R.inc(45196);final int dim = m.getRowDimension();
            __CLR4_4_1yscysclb90pa44.R.inc(45197);final RealMatrix sqrtM = new DiagonalMatrix(dim);
            __CLR4_4_1yscysclb90pa44.R.inc(45198);for (int i = 0; (((i < dim)&&(__CLR4_4_1yscysclb90pa44.R.iget(45199)!=0|true))||(__CLR4_4_1yscysclb90pa44.R.iget(45200)==0&false)); i++) {{
               __CLR4_4_1yscysclb90pa44.R.inc(45201);sqrtM.setEntry(i, i, FastMath.sqrt(m.getEntry(i, i)));
            }
            }__CLR4_4_1yscysclb90pa44.R.inc(45202);return sqrtM;
        } }else {{
            __CLR4_4_1yscysclb90pa44.R.inc(45203);final EigenDecomposition dec = new EigenDecomposition(m);
            __CLR4_4_1yscysclb90pa44.R.inc(45204);return dec.getSquareRoot();
        }
    }}finally{__CLR4_4_1yscysclb90pa44.R.flushNeeded();}}
}
