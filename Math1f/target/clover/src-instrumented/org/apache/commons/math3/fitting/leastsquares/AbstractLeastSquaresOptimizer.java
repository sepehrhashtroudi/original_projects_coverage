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
package org.apache.commons.math3.fitting.leastsquares;

import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.analysis.MultivariateVectorFunction;
import org.apache.commons.math3.analysis.MultivariateMatrixFunction;
import org.apache.commons.math3.linear.ArrayRealVector;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.DiagonalMatrix;
import org.apache.commons.math3.linear.DecompositionSolver;
import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.QRDecomposition;
import org.apache.commons.math3.linear.EigenDecomposition;
import org.apache.commons.math3.optim.AbstractOptimizer;
import org.apache.commons.math3.optim.PointVectorValuePair;
import org.apache.commons.math3.util.FastMath;

/**
 * Base class for implementing least-squares optimizers.
 * It provides methods for error estimation.
 *
 * @param <OPTIM> Concrete optimizer.
 *
 * @version $Id$
 * @since 3.3
 */
public abstract class AbstractLeastSquaresOptimizer<OPTIM extends AbstractLeastSquaresOptimizer<OPTIM>>
    extends AbstractOptimizer<PointVectorValuePair, OPTIM>
    implements WithTarget<OPTIM>,
               WithWeight<OPTIM>,
               WithModelAndJacobian<OPTIM>,
               WithStartPoint<OPTIM> {public static class __CLR4_4_1acaacalb90p7s6{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,13502,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /** Target values for the model function at optimum. */
    private double[] target;
    /** Weight matrix. */
    private RealMatrix weight;
    /** Model function. */
    private MultivariateVectorFunction model;
    /** Jacobian of the model function. */
    private MultivariateMatrixFunction jacobian;
    /** Square-root of the weight matrix. */
    private RealMatrix weightSqrt;
    /** Initial guess. */
    private double[] start;

    /**
     * Default constructor.
     */
    protected AbstractLeastSquaresOptimizer() {try{__CLR4_4_1acaacalb90p7s6.R.inc(13402);}finally{__CLR4_4_1acaacalb90p7s6.R.flushNeeded();}}

    /**
     * Copy constructor.
     *
     * @param other Instance to copy.
     */
    protected AbstractLeastSquaresOptimizer(AbstractLeastSquaresOptimizer other) {
        super(other);__CLR4_4_1acaacalb90p7s6.R.inc(13404);try{__CLR4_4_1acaacalb90p7s6.R.inc(13403);

        __CLR4_4_1acaacalb90p7s6.R.inc(13405);target = (((other.target == null )&&(__CLR4_4_1acaacalb90p7s6.R.iget(13406)!=0|true))||(__CLR4_4_1acaacalb90p7s6.R.iget(13407)==0&false))? null : other.target.clone();
        __CLR4_4_1acaacalb90p7s6.R.inc(13408);start = (((other.start == null )&&(__CLR4_4_1acaacalb90p7s6.R.iget(13409)!=0|true))||(__CLR4_4_1acaacalb90p7s6.R.iget(13410)==0&false))? null : other.start.clone();
        __CLR4_4_1acaacalb90p7s6.R.inc(13411);weight = (((other.weight == null )&&(__CLR4_4_1acaacalb90p7s6.R.iget(13412)!=0|true))||(__CLR4_4_1acaacalb90p7s6.R.iget(13413)==0&false))? null : other.weight.copy();
        __CLR4_4_1acaacalb90p7s6.R.inc(13414);weightSqrt = (((other.weightSqrt == null )&&(__CLR4_4_1acaacalb90p7s6.R.iget(13415)!=0|true))||(__CLR4_4_1acaacalb90p7s6.R.iget(13416)==0&false))? null : other.weightSqrt.copy();
        __CLR4_4_1acaacalb90p7s6.R.inc(13417);model = other.model; // XXX Not thread-safe
        __CLR4_4_1acaacalb90p7s6.R.inc(13418);jacobian = other.jacobian; // XXX Not thread-safe
    }finally{__CLR4_4_1acaacalb90p7s6.R.flushNeeded();}}

    /** {@inheritDoc} */
    public OPTIM withTarget(double[] newTarget) {try{__CLR4_4_1acaacalb90p7s6.R.inc(13419);
        __CLR4_4_1acaacalb90p7s6.R.inc(13420);this.target = newTarget.clone();
        __CLR4_4_1acaacalb90p7s6.R.inc(13421);return self();
    }finally{__CLR4_4_1acaacalb90p7s6.R.flushNeeded();}}

    /** {@inheritDoc} */
    public OPTIM withWeight(RealMatrix newWeight) {try{__CLR4_4_1acaacalb90p7s6.R.inc(13422);
        __CLR4_4_1acaacalb90p7s6.R.inc(13423);this.weight = newWeight; // XXX Not thread-safe
        __CLR4_4_1acaacalb90p7s6.R.inc(13424);weightSqrt = squareRoot(newWeight);
        __CLR4_4_1acaacalb90p7s6.R.inc(13425);return self();
    }finally{__CLR4_4_1acaacalb90p7s6.R.flushNeeded();}}

    /** {@inheritDoc} */
    public OPTIM withModelAndJacobian(MultivariateVectorFunction newModel,
                                      MultivariateMatrixFunction newJacobian) {try{__CLR4_4_1acaacalb90p7s6.R.inc(13426);
        __CLR4_4_1acaacalb90p7s6.R.inc(13427);this.model = newModel; // XXX Not thread-safe
        __CLR4_4_1acaacalb90p7s6.R.inc(13428);this.jacobian = newJacobian; // XXX Not thread-safe
        __CLR4_4_1acaacalb90p7s6.R.inc(13429);return self();
    }finally{__CLR4_4_1acaacalb90p7s6.R.flushNeeded();}}

    /** {@inheritDoc} */
    public OPTIM withStartPoint(double[] newStart) {try{__CLR4_4_1acaacalb90p7s6.R.inc(13430);
        __CLR4_4_1acaacalb90p7s6.R.inc(13431);this.start = newStart.clone();
        __CLR4_4_1acaacalb90p7s6.R.inc(13432);return self();
    }finally{__CLR4_4_1acaacalb90p7s6.R.flushNeeded();}}

    /**
     * Gets the target values.
     *
     * @return the target values.
     */
    public double[] getTarget() {try{__CLR4_4_1acaacalb90p7s6.R.inc(13433);
        __CLR4_4_1acaacalb90p7s6.R.inc(13434);return (((target == null )&&(__CLR4_4_1acaacalb90p7s6.R.iget(13435)!=0|true))||(__CLR4_4_1acaacalb90p7s6.R.iget(13436)==0&false))? null : target.clone();
    }finally{__CLR4_4_1acaacalb90p7s6.R.flushNeeded();}}

    /**
     * Gets the initial guess.
     *
     * @return the initial guess values.
     */
    public double[] getStart() {try{__CLR4_4_1acaacalb90p7s6.R.inc(13437);
        __CLR4_4_1acaacalb90p7s6.R.inc(13438);return (((start == null )&&(__CLR4_4_1acaacalb90p7s6.R.iget(13439)!=0|true))||(__CLR4_4_1acaacalb90p7s6.R.iget(13440)==0&false))? null : start.clone();
    }finally{__CLR4_4_1acaacalb90p7s6.R.flushNeeded();}}

    /**
     * Gets the square-root of the weight matrix.
     *
     * @return the square-root of the weight matrix.
     */
    public RealMatrix getWeightSquareRoot() {try{__CLR4_4_1acaacalb90p7s6.R.inc(13441);
        __CLR4_4_1acaacalb90p7s6.R.inc(13442);return (((weightSqrt == null )&&(__CLR4_4_1acaacalb90p7s6.R.iget(13443)!=0|true))||(__CLR4_4_1acaacalb90p7s6.R.iget(13444)==0&false))? null : weightSqrt.copy();
    }finally{__CLR4_4_1acaacalb90p7s6.R.flushNeeded();}}

    /**
     * Gets the model function.
     *
     * @return the model function.
     */
    public MultivariateVectorFunction getModel() {try{__CLR4_4_1acaacalb90p7s6.R.inc(13445);
        __CLR4_4_1acaacalb90p7s6.R.inc(13446);return model;
    }finally{__CLR4_4_1acaacalb90p7s6.R.flushNeeded();}}

    /**
     * Gets the model function's Jacobian.
     *
     * @return the Jacobian.
     */
    public MultivariateMatrixFunction getJacobian() {try{__CLR4_4_1acaacalb90p7s6.R.inc(13447);
        __CLR4_4_1acaacalb90p7s6.R.inc(13448);return jacobian;
    }finally{__CLR4_4_1acaacalb90p7s6.R.flushNeeded();}}

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
                                         double threshold) {try{__CLR4_4_1acaacalb90p7s6.R.inc(13449);
        // Set up the Jacobian.
        __CLR4_4_1acaacalb90p7s6.R.inc(13450);final RealMatrix j = computeWeightedJacobian(params);

        // Compute transpose(J)J.
        __CLR4_4_1acaacalb90p7s6.R.inc(13451);final RealMatrix jTj = j.transpose().multiply(j);

        // Compute the covariances matrix.
        __CLR4_4_1acaacalb90p7s6.R.inc(13452);final DecompositionSolver solver
            = new QRDecomposition(jTj, threshold).getSolver();
        __CLR4_4_1acaacalb90p7s6.R.inc(13453);return solver.getInverse().getData();
    }finally{__CLR4_4_1acaacalb90p7s6.R.flushNeeded();}}

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
                                 double covarianceSingularityThreshold) {try{__CLR4_4_1acaacalb90p7s6.R.inc(13454);
        __CLR4_4_1acaacalb90p7s6.R.inc(13455);final int nC = params.length;
        __CLR4_4_1acaacalb90p7s6.R.inc(13456);final double[] sig = new double[nC];
        __CLR4_4_1acaacalb90p7s6.R.inc(13457);final double[][] cov = computeCovariances(params, covarianceSingularityThreshold);
        __CLR4_4_1acaacalb90p7s6.R.inc(13458);for (int i = 0; (((i < nC)&&(__CLR4_4_1acaacalb90p7s6.R.iget(13459)!=0|true))||(__CLR4_4_1acaacalb90p7s6.R.iget(13460)==0&false)); ++i) {{
            __CLR4_4_1acaacalb90p7s6.R.inc(13461);sig[i] = FastMath.sqrt(cov[i][i]);
        }
        }__CLR4_4_1acaacalb90p7s6.R.inc(13462);return sig;
    }finally{__CLR4_4_1acaacalb90p7s6.R.flushNeeded();}}

    /**
     * Gets the weight matrix of the observations.
     *
     * @return the weight matrix.
     */
    public RealMatrix getWeight() {try{__CLR4_4_1acaacalb90p7s6.R.inc(13463);
        __CLR4_4_1acaacalb90p7s6.R.inc(13464);return weight.copy();
    }finally{__CLR4_4_1acaacalb90p7s6.R.flushNeeded();}}

    /**
     * Computes the normalized cost.
     * It is the square-root of the sum of squared of the residuals, divided
     * by the number of measurements.
     *
     * @param params Model function parameters.
     * @return the cost.
     */
    public double computeRMS(double[] params) {try{__CLR4_4_1acaacalb90p7s6.R.inc(13465);
        __CLR4_4_1acaacalb90p7s6.R.inc(13466);final double cost = computeCost(computeResiduals(getModel().value(params)));
        __CLR4_4_1acaacalb90p7s6.R.inc(13467);return FastMath.sqrt(cost * cost / target.length);
    }finally{__CLR4_4_1acaacalb90p7s6.R.flushNeeded();}}

    /**
     * Computes the objective function value.
     * This method <em>must</em> be called by subclasses to enforce the
     * evaluation counter limit.
     *
     * @param params Point at which the objective function must be evaluated.
     * @return the objective function value at the specified point.
     * @throws org.apache.commons.math3.exception.TooManyEvaluationsException
     * if the maximal number of evaluations (of the model vector function) is
     * exceeded.
     */
    protected double[] computeObjectiveValue(double[] params) {try{__CLR4_4_1acaacalb90p7s6.R.inc(13468);
        __CLR4_4_1acaacalb90p7s6.R.inc(13469);super.incrementEvaluationCount();
        __CLR4_4_1acaacalb90p7s6.R.inc(13470);return model.value(params);
    }finally{__CLR4_4_1acaacalb90p7s6.R.flushNeeded();}}

    /**
     * Computes the weighted Jacobian matrix.
     *
     * @param params Model parameters at which to compute the Jacobian.
     * @return the weighted Jacobian: W<sup>1/2</sup> J.
     * @throws DimensionMismatchException if the Jacobian dimension does not
     * match problem dimension.
     */
    protected RealMatrix computeWeightedJacobian(double[] params) {try{__CLR4_4_1acaacalb90p7s6.R.inc(13471);
        __CLR4_4_1acaacalb90p7s6.R.inc(13472);return weightSqrt.multiply(MatrixUtils.createRealMatrix(computeJacobian(params)));
    }finally{__CLR4_4_1acaacalb90p7s6.R.flushNeeded();}}

    /**
     * Computes the Jacobian matrix.
     *
     * @param params Point at which the Jacobian must be evaluated.
     * @return the Jacobian at the specified point.
     */
    protected double[][] computeJacobian(final double[] params) {try{__CLR4_4_1acaacalb90p7s6.R.inc(13473);
        __CLR4_4_1acaacalb90p7s6.R.inc(13474);return jacobian.value(params);
    }finally{__CLR4_4_1acaacalb90p7s6.R.flushNeeded();}}

    /**
     * Computes the cost.
     *
     * @param residuals Residuals.
     * @return the cost.
     * @see #computeResiduals(double[])
     */
    protected double computeCost(double[] residuals) {try{__CLR4_4_1acaacalb90p7s6.R.inc(13475);
        __CLR4_4_1acaacalb90p7s6.R.inc(13476);final ArrayRealVector r = new ArrayRealVector(residuals);
        __CLR4_4_1acaacalb90p7s6.R.inc(13477);return FastMath.sqrt(r.dotProduct(weight.operate(r)));
    }finally{__CLR4_4_1acaacalb90p7s6.R.flushNeeded();}}

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
    protected double[] computeResiduals(double[] objectiveValue) {try{__CLR4_4_1acaacalb90p7s6.R.inc(13478);
        __CLR4_4_1acaacalb90p7s6.R.inc(13479);if ((((objectiveValue.length != target.length)&&(__CLR4_4_1acaacalb90p7s6.R.iget(13480)!=0|true))||(__CLR4_4_1acaacalb90p7s6.R.iget(13481)==0&false))) {{
            __CLR4_4_1acaacalb90p7s6.R.inc(13482);throw new DimensionMismatchException(target.length,
                                                 objectiveValue.length);
        }

        }__CLR4_4_1acaacalb90p7s6.R.inc(13483);final double[] residuals = new double[target.length];
        __CLR4_4_1acaacalb90p7s6.R.inc(13484);for (int i = 0; (((i < target.length)&&(__CLR4_4_1acaacalb90p7s6.R.iget(13485)!=0|true))||(__CLR4_4_1acaacalb90p7s6.R.iget(13486)==0&false)); i++) {{
            __CLR4_4_1acaacalb90p7s6.R.inc(13487);residuals[i] = target[i] - objectiveValue[i];
        }

        }__CLR4_4_1acaacalb90p7s6.R.inc(13488);return residuals;
    }finally{__CLR4_4_1acaacalb90p7s6.R.flushNeeded();}}

    /**
     * Computes the square-root of the weight matrix.
     *
     * @param m Symmetric, positive-definite (weight) matrix.
     * @return the square-root of the weight matrix.
     */
    private RealMatrix squareRoot(RealMatrix m) {try{__CLR4_4_1acaacalb90p7s6.R.inc(13489);
        __CLR4_4_1acaacalb90p7s6.R.inc(13490);if ((((m instanceof DiagonalMatrix)&&(__CLR4_4_1acaacalb90p7s6.R.iget(13491)!=0|true))||(__CLR4_4_1acaacalb90p7s6.R.iget(13492)==0&false))) {{
            __CLR4_4_1acaacalb90p7s6.R.inc(13493);final int dim = m.getRowDimension();
            __CLR4_4_1acaacalb90p7s6.R.inc(13494);final RealMatrix sqrtM = new DiagonalMatrix(dim);
            __CLR4_4_1acaacalb90p7s6.R.inc(13495);for (int i = 0; (((i < dim)&&(__CLR4_4_1acaacalb90p7s6.R.iget(13496)!=0|true))||(__CLR4_4_1acaacalb90p7s6.R.iget(13497)==0&false)); i++) {{
                __CLR4_4_1acaacalb90p7s6.R.inc(13498);sqrtM.setEntry(i, i, FastMath.sqrt(m.getEntry(i, i)));
            }
            }__CLR4_4_1acaacalb90p7s6.R.inc(13499);return sqrtM;
        } }else {{
            __CLR4_4_1acaacalb90p7s6.R.inc(13500);final EigenDecomposition dec = new EigenDecomposition(m);
            __CLR4_4_1acaacalb90p7s6.R.inc(13501);return dec.getSquareRoot();
        }
    }}finally{__CLR4_4_1acaacalb90p7s6.R.flushNeeded();}}
}
