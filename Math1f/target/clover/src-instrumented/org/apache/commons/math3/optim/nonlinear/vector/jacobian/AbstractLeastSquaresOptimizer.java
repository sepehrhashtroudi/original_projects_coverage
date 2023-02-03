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
package org.apache.commons.math3.optim.nonlinear.vector.jacobian;

import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.exception.TooManyEvaluationsException;
import org.apache.commons.math3.linear.ArrayRealVector;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.DiagonalMatrix;
import org.apache.commons.math3.linear.DecompositionSolver;
import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.QRDecomposition;
import org.apache.commons.math3.linear.EigenDecomposition;
import org.apache.commons.math3.optim.OptimizationData;
import org.apache.commons.math3.optim.ConvergenceChecker;
import org.apache.commons.math3.optim.PointVectorValuePair;
import org.apache.commons.math3.optim.nonlinear.vector.Weight;
import org.apache.commons.math3.optim.nonlinear.vector.JacobianMultivariateVectorOptimizer;
import org.apache.commons.math3.util.FastMath;

/**
 * Base class for implementing least-squares optimizers.
 * It provides methods for error estimation.
 *
 * @version $Id$
 * @since 3.1
 * @deprecated All classes and interfaces in this package are deprecated.
 * The optimizers that were provided here were moved to the
 * {@link org.apache.commons.math3.fitting.leastsquares} package
 * (cf. MATH-1008).
 */
@Deprecated
public abstract class AbstractLeastSquaresOptimizer
    extends JacobianMultivariateVectorOptimizer {public static class __CLR4_4_1ur6ur6lb90p9u9{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,39922,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /** Square-root of the weight matrix. */
    private RealMatrix weightMatrixSqrt;
    /** Cost value (square root of the sum of the residuals). */
    private double cost;

    /**
     * @param checker Convergence checker.
     */
    protected AbstractLeastSquaresOptimizer(ConvergenceChecker<PointVectorValuePair> checker) {
        super(checker);__CLR4_4_1ur6ur6lb90p9u9.R.inc(39859);try{__CLR4_4_1ur6ur6lb90p9u9.R.inc(39858);
    }finally{__CLR4_4_1ur6ur6lb90p9u9.R.flushNeeded();}}

    /**
     * Computes the weighted Jacobian matrix.
     *
     * @param params Model parameters at which to compute the Jacobian.
     * @return the weighted Jacobian: W<sup>1/2</sup> J.
     * @throws DimensionMismatchException if the Jacobian dimension does not
     * match problem dimension.
     */
    protected RealMatrix computeWeightedJacobian(double[] params) {try{__CLR4_4_1ur6ur6lb90p9u9.R.inc(39860);
        __CLR4_4_1ur6ur6lb90p9u9.R.inc(39861);return weightMatrixSqrt.multiply(MatrixUtils.createRealMatrix(computeJacobian(params)));
    }finally{__CLR4_4_1ur6ur6lb90p9u9.R.flushNeeded();}}

    /**
     * Computes the cost.
     *
     * @param residuals Residuals.
     * @return the cost.
     * @see #computeResiduals(double[])
     */
    protected double computeCost(double[] residuals) {try{__CLR4_4_1ur6ur6lb90p9u9.R.inc(39862);
        __CLR4_4_1ur6ur6lb90p9u9.R.inc(39863);final ArrayRealVector r = new ArrayRealVector(residuals);
        __CLR4_4_1ur6ur6lb90p9u9.R.inc(39864);return FastMath.sqrt(r.dotProduct(getWeight().operate(r)));
    }finally{__CLR4_4_1ur6ur6lb90p9u9.R.flushNeeded();}}

    /**
     * Gets the root-mean-square (RMS) value.
     *
     * The RMS the root of the arithmetic mean of the square of all weighted
     * residuals.
     * This is related to the criterion that is minimized by the optimizer
     * as follows: If <em>c</em> if the criterion, and <em>n</em> is the
     * number of measurements, then the RMS is <em>sqrt (c/n)</em>.
     *
     * @return the RMS value.
     */
    public double getRMS() {try{__CLR4_4_1ur6ur6lb90p9u9.R.inc(39865);
        __CLR4_4_1ur6ur6lb90p9u9.R.inc(39866);return FastMath.sqrt(getChiSquare() / getTargetSize());
    }finally{__CLR4_4_1ur6ur6lb90p9u9.R.flushNeeded();}}

    /**
     * Get a Chi-Square-like value assuming the N residuals follow N
     * distinct normal distributions centered on 0 and whose variances are
     * the reciprocal of the weights.
     * @return chi-square value
     */
    public double getChiSquare() {try{__CLR4_4_1ur6ur6lb90p9u9.R.inc(39867);
        __CLR4_4_1ur6ur6lb90p9u9.R.inc(39868);return cost * cost;
    }finally{__CLR4_4_1ur6ur6lb90p9u9.R.flushNeeded();}}

    /**
     * Gets the square-root of the weight matrix.
     *
     * @return the square-root of the weight matrix.
     */
    public RealMatrix getWeightSquareRoot() {try{__CLR4_4_1ur6ur6lb90p9u9.R.inc(39869);
        __CLR4_4_1ur6ur6lb90p9u9.R.inc(39870);return weightMatrixSqrt.copy();
    }finally{__CLR4_4_1ur6ur6lb90p9u9.R.flushNeeded();}}

    /**
     * Sets the cost.
     *
     * @param cost Cost value.
     */
    protected void setCost(double cost) {try{__CLR4_4_1ur6ur6lb90p9u9.R.inc(39871);
        __CLR4_4_1ur6ur6lb90p9u9.R.inc(39872);this.cost = cost;
    }finally{__CLR4_4_1ur6ur6lb90p9u9.R.flushNeeded();}}

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
     */
    public double[][] computeCovariances(double[] params,
                                         double threshold) {try{__CLR4_4_1ur6ur6lb90p9u9.R.inc(39873);
        // Set up the Jacobian.
        __CLR4_4_1ur6ur6lb90p9u9.R.inc(39874);final RealMatrix j = computeWeightedJacobian(params);

        // Compute transpose(J)J.
        __CLR4_4_1ur6ur6lb90p9u9.R.inc(39875);final RealMatrix jTj = j.transpose().multiply(j);

        // Compute the covariances matrix.
        __CLR4_4_1ur6ur6lb90p9u9.R.inc(39876);final DecompositionSolver solver
            = new QRDecomposition(jTj, threshold).getSolver();
        __CLR4_4_1ur6ur6lb90p9u9.R.inc(39877);return solver.getInverse().getData();
    }finally{__CLR4_4_1ur6ur6lb90p9u9.R.flushNeeded();}}

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
     */
    public double[] computeSigma(double[] params,
                                 double covarianceSingularityThreshold) {try{__CLR4_4_1ur6ur6lb90p9u9.R.inc(39878);
        __CLR4_4_1ur6ur6lb90p9u9.R.inc(39879);final int nC = params.length;
        __CLR4_4_1ur6ur6lb90p9u9.R.inc(39880);final double[] sig = new double[nC];
        __CLR4_4_1ur6ur6lb90p9u9.R.inc(39881);final double[][] cov = computeCovariances(params, covarianceSingularityThreshold);
        __CLR4_4_1ur6ur6lb90p9u9.R.inc(39882);for (int i = 0; (((i < nC)&&(__CLR4_4_1ur6ur6lb90p9u9.R.iget(39883)!=0|true))||(__CLR4_4_1ur6ur6lb90p9u9.R.iget(39884)==0&false)); ++i) {{
            __CLR4_4_1ur6ur6lb90p9u9.R.inc(39885);sig[i] = FastMath.sqrt(cov[i][i]);
        }
        }__CLR4_4_1ur6ur6lb90p9u9.R.inc(39886);return sig;
    }finally{__CLR4_4_1ur6ur6lb90p9u9.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     *
     * @param optData Optimization data. In addition to those documented in
     * {@link JacobianMultivariateVectorOptimizer#parseOptimizationData(OptimizationData[])
     * JacobianMultivariateVectorOptimizer}, this method will register the following data:
     * <ul>
     *  <li>{@link org.apache.commons.math3.optim.nonlinear.vector.Weight}</li>
     * </ul>
     * @return {@inheritDoc}
     * @throws TooManyEvaluationsException if the maximal number of
     * evaluations is exceeded.
     * @throws DimensionMismatchException if the initial guess, target, and weight
     * arguments have inconsistent dimensions.
     */
    @Override
    public PointVectorValuePair optimize(OptimizationData... optData)
        throws TooManyEvaluationsException {try{__CLR4_4_1ur6ur6lb90p9u9.R.inc(39887);
        // Set up base class and perform computation.
        __CLR4_4_1ur6ur6lb90p9u9.R.inc(39888);return super.optimize(optData);
    }finally{__CLR4_4_1ur6ur6lb90p9u9.R.flushNeeded();}}

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
     */
    protected double[] computeResiduals(double[] objectiveValue) {try{__CLR4_4_1ur6ur6lb90p9u9.R.inc(39889);
        __CLR4_4_1ur6ur6lb90p9u9.R.inc(39890);final double[] target = getTarget();
        __CLR4_4_1ur6ur6lb90p9u9.R.inc(39891);if ((((objectiveValue.length != target.length)&&(__CLR4_4_1ur6ur6lb90p9u9.R.iget(39892)!=0|true))||(__CLR4_4_1ur6ur6lb90p9u9.R.iget(39893)==0&false))) {{
            __CLR4_4_1ur6ur6lb90p9u9.R.inc(39894);throw new DimensionMismatchException(target.length,
                                                 objectiveValue.length);
        }

        }__CLR4_4_1ur6ur6lb90p9u9.R.inc(39895);final double[] residuals = new double[target.length];
        __CLR4_4_1ur6ur6lb90p9u9.R.inc(39896);for (int i = 0; (((i < target.length)&&(__CLR4_4_1ur6ur6lb90p9u9.R.iget(39897)!=0|true))||(__CLR4_4_1ur6ur6lb90p9u9.R.iget(39898)==0&false)); i++) {{
            __CLR4_4_1ur6ur6lb90p9u9.R.inc(39899);residuals[i] = target[i] - objectiveValue[i];
        }

        }__CLR4_4_1ur6ur6lb90p9u9.R.inc(39900);return residuals;
    }finally{__CLR4_4_1ur6ur6lb90p9u9.R.flushNeeded();}}

    /**
     * Scans the list of (required and optional) optimization data that
     * characterize the problem.
     * If the weight matrix is specified, the {@link #weightMatrixSqrt}
     * field is recomputed.
     *
     * @param optData Optimization data. The following data will be looked for:
     * <ul>
     *  <li>{@link Weight}</li>
     * </ul>
     */
    @Override
    protected void parseOptimizationData(OptimizationData... optData) {try{__CLR4_4_1ur6ur6lb90p9u9.R.inc(39901);
        // Allow base class to register its own data.
        __CLR4_4_1ur6ur6lb90p9u9.R.inc(39902);super.parseOptimizationData(optData);

        // The existing values (as set by the previous call) are reused if
        // not provided in the argument list.
        __CLR4_4_1ur6ur6lb90p9u9.R.inc(39903);for (OptimizationData data : optData) {{
            __CLR4_4_1ur6ur6lb90p9u9.R.inc(39904);if ((((data instanceof Weight)&&(__CLR4_4_1ur6ur6lb90p9u9.R.iget(39905)!=0|true))||(__CLR4_4_1ur6ur6lb90p9u9.R.iget(39906)==0&false))) {{
                __CLR4_4_1ur6ur6lb90p9u9.R.inc(39907);weightMatrixSqrt = squareRoot(((Weight) data).getWeight());
                // If more data must be parsed, this statement _must_ be
                // changed to "continue".
                __CLR4_4_1ur6ur6lb90p9u9.R.inc(39908);break;
            }
        }}
    }}finally{__CLR4_4_1ur6ur6lb90p9u9.R.flushNeeded();}}

    /**
     * Computes the square-root of the weight matrix.
     *
     * @param m Symmetric, positive-definite (weight) matrix.
     * @return the square-root of the weight matrix.
     */
    private RealMatrix squareRoot(RealMatrix m) {try{__CLR4_4_1ur6ur6lb90p9u9.R.inc(39909);
        __CLR4_4_1ur6ur6lb90p9u9.R.inc(39910);if ((((m instanceof DiagonalMatrix)&&(__CLR4_4_1ur6ur6lb90p9u9.R.iget(39911)!=0|true))||(__CLR4_4_1ur6ur6lb90p9u9.R.iget(39912)==0&false))) {{
            __CLR4_4_1ur6ur6lb90p9u9.R.inc(39913);final int dim = m.getRowDimension();
            __CLR4_4_1ur6ur6lb90p9u9.R.inc(39914);final RealMatrix sqrtM = new DiagonalMatrix(dim);
            __CLR4_4_1ur6ur6lb90p9u9.R.inc(39915);for (int i = 0; (((i < dim)&&(__CLR4_4_1ur6ur6lb90p9u9.R.iget(39916)!=0|true))||(__CLR4_4_1ur6ur6lb90p9u9.R.iget(39917)==0&false)); i++) {{
                __CLR4_4_1ur6ur6lb90p9u9.R.inc(39918);sqrtM.setEntry(i, i, FastMath.sqrt(m.getEntry(i, i)));
            }
            }__CLR4_4_1ur6ur6lb90p9u9.R.inc(39919);return sqrtM;
        } }else {{
            __CLR4_4_1ur6ur6lb90p9u9.R.inc(39920);final EigenDecomposition dec = new EigenDecomposition(m);
            __CLR4_4_1ur6ur6lb90p9u9.R.inc(39921);return dec.getSquareRoot();
        }
    }}finally{__CLR4_4_1ur6ur6lb90p9u9.R.flushNeeded();}}
}
