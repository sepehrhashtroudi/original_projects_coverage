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

import java.util.Arrays;
import org.apache.commons.math3.exception.ConvergenceException;
import org.apache.commons.math3.exception.MathUnsupportedOperationException;
import org.apache.commons.math3.exception.util.LocalizedFormats;
import org.apache.commons.math3.optim.PointVectorValuePair;
import org.apache.commons.math3.optim.ConvergenceChecker;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.util.Precision;
import org.apache.commons.math3.util.FastMath;


/**
 * This class solves a least-squares problem using the Levenberg-Marquardt
 * algorithm.
 * <br/>
 * Constraints are not supported: the call to
 * {@link #optimize(OptimizationData[]) optimize} will throw
 * {@link MathUnsupportedOperationException} if bounds are passed to it.
 *
 * <p>This implementation <em>should</em> work even for over-determined systems
 * (i.e. systems having more point than equations). Over-determined systems
 * are solved by ignoring the point which have the smallest impact according
 * to their jacobian column norm. Only the rank of the matrix and some loop bounds
 * are changed to implement this.</p>
 *
 * <p>The resolution engine is a simple translation of the MINPACK <a
 * href="http://www.netlib.org/minpack/lmder.f">lmder</a> routine with minor
 * changes. The changes include the over-determined resolution, the use of
 * inherited convergence checker and the Q.R. decomposition which has been
 * rewritten following the algorithm described in the
 * P. Lascaux and R. Theodor book <i>Analyse num&eacute;rique matricielle
 * appliqu&eacute;e &agrave; l'art de l'ing&eacute;nieur</i>, Masson 1986.</p>
 * <p>The authors of the original fortran version are:
 * <ul>
 * <li>Argonne National Laboratory. MINPACK project. March 1980</li>
 * <li>Burton S. Garbow</li>
 * <li>Kenneth E. Hillstrom</li>
 * <li>Jorge J. More</li>
 * </ul>
 * The redistribution policy for MINPACK is available <a
 * href="http://www.netlib.org/minpack/disclaimer">here</a>, for convenience, it
 * is reproduced below.</p>
 *
 * <table border="0" width="80%" cellpadding="10" align="center" bgcolor="#E0E0E0">
 * <tr><td>
 *    Minpack Copyright Notice (1999) University of Chicago.
 *    All rights reserved
 * </td></tr>
 * <tr><td>
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 * <ol>
 *  <li>Redistributions of source code must retain the above copyright
 *      notice, this list of conditions and the following disclaimer.</li>
 * <li>Redistributions in binary form must reproduce the above
 *     copyright notice, this list of conditions and the following
 *     disclaimer in the documentation and/or other materials provided
 *     with the distribution.</li>
 * <li>The end-user documentation included with the redistribution, if any,
 *     must include the following acknowledgment:
 *     <code>This product includes software developed by the University of
 *           Chicago, as Operator of Argonne National Laboratory.</code>
 *     Alternately, this acknowledgment may appear in the software itself,
 *     if and wherever such third-party acknowledgments normally appear.</li>
 * <li><strong>WARRANTY DISCLAIMER. THE SOFTWARE IS SUPPLIED "AS IS"
 *     WITHOUT WARRANTY OF ANY KIND. THE COPYRIGHT HOLDER, THE
 *     UNITED STATES, THE UNITED STATES DEPARTMENT OF ENERGY, AND
 *     THEIR EMPLOYEES: (1) DISCLAIM ANY WARRANTIES, EXPRESS OR
 *     IMPLIED, INCLUDING BUT NOT LIMITED TO ANY IMPLIED WARRANTIES
 *     OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE, TITLE
 *     OR NON-INFRINGEMENT, (2) DO NOT ASSUME ANY LEGAL LIABILITY
 *     OR RESPONSIBILITY FOR THE ACCURACY, COMPLETENESS, OR
 *     USEFULNESS OF THE SOFTWARE, (3) DO NOT REPRESENT THAT USE OF
 *     THE SOFTWARE WOULD NOT INFRINGE PRIVATELY OWNED RIGHTS, (4)
 *     DO NOT WARRANT THAT THE SOFTWARE WILL FUNCTION
 *     UNINTERRUPTED, THAT IT IS ERROR-FREE OR THAT ANY ERRORS WILL
 *     BE CORRECTED.</strong></li>
 * <li><strong>LIMITATION OF LIABILITY. IN NO EVENT WILL THE COPYRIGHT
 *     HOLDER, THE UNITED STATES, THE UNITED STATES DEPARTMENT OF
 *     ENERGY, OR THEIR EMPLOYEES: BE LIABLE FOR ANY INDIRECT,
 *     INCIDENTAL, CONSEQUENTIAL, SPECIAL OR PUNITIVE DAMAGES OF
 *     ANY KIND OR NATURE, INCLUDING BUT NOT LIMITED TO LOSS OF
 *     PROFITS OR LOSS OF DATA, FOR ANY REASON WHATSOEVER, WHETHER
 *     SUCH LIABILITY IS ASSERTED ON THE BASIS OF CONTRACT, TORT
 *     (INCLUDING NEGLIGENCE OR STRICT LIABILITY), OR OTHERWISE,
 *     EVEN IF ANY OF SAID PARTIES HAS BEEN WARNED OF THE
 *     POSSIBILITY OF SUCH LOSS OR DAMAGES.</strong></li>
 * <ol></td></tr>
 * </table>
 *
 * @version $Id$
 * @since 2.0
 * @deprecated All classes and interfaces in this package are deprecated.
 * The optimizers that were provided here were moved to the
 * {@link org.apache.commons.math3.fitting.leastsquares} package
 * (cf. MATH-1008).
 */
@Deprecated
public class LevenbergMarquardtOptimizer
    extends AbstractLeastSquaresOptimizer {public static class __CLR4_4_1uv6uv6lb90p9v3{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,40553,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /** Twice the "epsilon machine". */
    private static final double TWO_EPS = 2 * Precision.EPSILON;
    /** Number of solved point. */
    private int solvedCols;
    /** Diagonal elements of the R matrix in the Q.R. decomposition. */
    private double[] diagR;
    /** Norms of the columns of the jacobian matrix. */
    private double[] jacNorm;
    /** Coefficients of the Householder transforms vectors. */
    private double[] beta;
    /** Columns permutation array. */
    private int[] permutation;
    /** Rank of the jacobian matrix. */
    private int rank;
    /** Levenberg-Marquardt parameter. */
    private double lmPar;
    /** Parameters evolution direction associated with lmPar. */
    private double[] lmDir;
    /** Positive input variable used in determining the initial step bound. */
    private final double initialStepBoundFactor;
    /** Desired relative error in the sum of squares. */
    private final double costRelativeTolerance;
    /**  Desired relative error in the approximate solution parameters. */
    private final double parRelativeTolerance;
    /** Desired max cosine on the orthogonality between the function vector
     * and the columns of the jacobian. */
    private final double orthoTolerance;
    /** Threshold for QR ranking. */
    private final double qrRankingThreshold;
    /** Weighted residuals. */
    private double[] weightedResidual;
    /** Weighted Jacobian. */
    private double[][] weightedJacobian;

    /**
     * Build an optimizer for least squares problems with default values
     * for all the tuning parameters (see the {@link
     * #LevenbergMarquardtOptimizer(double,double,double,double,double)
     * other contructor}.
     * The default values for the algorithm settings are:
     * <ul>
     *  <li>Initial step bound factor: 100</li>
     *  <li>Cost relative tolerance: 1e-10</li>
     *  <li>Parameters relative tolerance: 1e-10</li>
     *  <li>Orthogonality tolerance: 1e-10</li>
     *  <li>QR ranking threshold: {@link Precision#SAFE_MIN}</li>
     * </ul>
     */
    public LevenbergMarquardtOptimizer() {
        this(100, 1e-10, 1e-10, 1e-10, Precision.SAFE_MIN);__CLR4_4_1uv6uv6lb90p9v3.R.inc(40003);try{__CLR4_4_1uv6uv6lb90p9v3.R.inc(40002);
    }finally{__CLR4_4_1uv6uv6lb90p9v3.R.flushNeeded();}}

    /**
     * Constructor that allows the specification of a custom convergence
     * checker.
     * Note that all the usual convergence checks will be <em>disabled</em>.
     * The default values for the algorithm settings are:
     * <ul>
     *  <li>Initial step bound factor: 100</li>
     *  <li>Cost relative tolerance: 1e-10</li>
     *  <li>Parameters relative tolerance: 1e-10</li>
     *  <li>Orthogonality tolerance: 1e-10</li>
     *  <li>QR ranking threshold: {@link Precision#SAFE_MIN}</li>
     * </ul>
     *
     * @param checker Convergence checker.
     */
    public LevenbergMarquardtOptimizer(ConvergenceChecker<PointVectorValuePair> checker) {
        this(100, checker, 1e-10, 1e-10, 1e-10, Precision.SAFE_MIN);__CLR4_4_1uv6uv6lb90p9v3.R.inc(40005);try{__CLR4_4_1uv6uv6lb90p9v3.R.inc(40004);
    }finally{__CLR4_4_1uv6uv6lb90p9v3.R.flushNeeded();}}

    /**
     * Constructor that allows the specification of a custom convergence
     * checker, in addition to the standard ones.
     *
     * @param initialStepBoundFactor Positive input variable used in
     * determining the initial step bound. This bound is set to the
     * product of initialStepBoundFactor and the euclidean norm of
     * {@code diag * x} if non-zero, or else to {@code initialStepBoundFactor}
     * itself. In most cases factor should lie in the interval
     * {@code (0.1, 100.0)}. {@code 100} is a generally recommended value.
     * @param checker Convergence checker.
     * @param costRelativeTolerance Desired relative error in the sum of
     * squares.
     * @param parRelativeTolerance Desired relative error in the approximate
     * solution parameters.
     * @param orthoTolerance Desired max cosine on the orthogonality between
     * the function vector and the columns of the Jacobian.
     * @param threshold Desired threshold for QR ranking. If the squared norm
     * of a column vector is smaller or equal to this threshold during QR
     * decomposition, it is considered to be a zero vector and hence the rank
     * of the matrix is reduced.
     */
    public LevenbergMarquardtOptimizer(double initialStepBoundFactor,
                                       ConvergenceChecker<PointVectorValuePair> checker,
                                       double costRelativeTolerance,
                                       double parRelativeTolerance,
                                       double orthoTolerance,
                                       double threshold) {
        super(checker);__CLR4_4_1uv6uv6lb90p9v3.R.inc(40007);try{__CLR4_4_1uv6uv6lb90p9v3.R.inc(40006);
        __CLR4_4_1uv6uv6lb90p9v3.R.inc(40008);this.initialStepBoundFactor = initialStepBoundFactor;
        __CLR4_4_1uv6uv6lb90p9v3.R.inc(40009);this.costRelativeTolerance = costRelativeTolerance;
        __CLR4_4_1uv6uv6lb90p9v3.R.inc(40010);this.parRelativeTolerance = parRelativeTolerance;
        __CLR4_4_1uv6uv6lb90p9v3.R.inc(40011);this.orthoTolerance = orthoTolerance;
        __CLR4_4_1uv6uv6lb90p9v3.R.inc(40012);this.qrRankingThreshold = threshold;
    }finally{__CLR4_4_1uv6uv6lb90p9v3.R.flushNeeded();}}

    /**
     * Build an optimizer for least squares problems with default values
     * for some of the tuning parameters (see the {@link
     * #LevenbergMarquardtOptimizer(double,double,double,double,double)
     * other contructor}.
     * The default values for the algorithm settings are:
     * <ul>
     *  <li>Initial step bound factor}: 100</li>
     *  <li>QR ranking threshold}: {@link Precision#SAFE_MIN}</li>
     * </ul>
     *
     * @param costRelativeTolerance Desired relative error in the sum of
     * squares.
     * @param parRelativeTolerance Desired relative error in the approximate
     * solution parameters.
     * @param orthoTolerance Desired max cosine on the orthogonality between
     * the function vector and the columns of the Jacobian.
     */
    public LevenbergMarquardtOptimizer(double costRelativeTolerance,
                                       double parRelativeTolerance,
                                       double orthoTolerance) {
        this(100,
             costRelativeTolerance, parRelativeTolerance, orthoTolerance,
             Precision.SAFE_MIN);__CLR4_4_1uv6uv6lb90p9v3.R.inc(40014);try{__CLR4_4_1uv6uv6lb90p9v3.R.inc(40013);
    }finally{__CLR4_4_1uv6uv6lb90p9v3.R.flushNeeded();}}

    /**
     * The arguments control the behaviour of the default convergence checking
     * procedure.
     * Additional criteria can defined through the setting of a {@link
     * ConvergenceChecker}.
     *
     * @param initialStepBoundFactor Positive input variable used in
     * determining the initial step bound. This bound is set to the
     * product of initialStepBoundFactor and the euclidean norm of
     * {@code diag * x} if non-zero, or else to {@code initialStepBoundFactor}
     * itself. In most cases factor should lie in the interval
     * {@code (0.1, 100.0)}. {@code 100} is a generally recommended value.
     * @param costRelativeTolerance Desired relative error in the sum of
     * squares.
     * @param parRelativeTolerance Desired relative error in the approximate
     * solution parameters.
     * @param orthoTolerance Desired max cosine on the orthogonality between
     * the function vector and the columns of the Jacobian.
     * @param threshold Desired threshold for QR ranking. If the squared norm
     * of a column vector is smaller or equal to this threshold during QR
     * decomposition, it is considered to be a zero vector and hence the rank
     * of the matrix is reduced.
     */
    public LevenbergMarquardtOptimizer(double initialStepBoundFactor,
                                       double costRelativeTolerance,
                                       double parRelativeTolerance,
                                       double orthoTolerance,
                                       double threshold) {
        super(null);__CLR4_4_1uv6uv6lb90p9v3.R.inc(40016);try{__CLR4_4_1uv6uv6lb90p9v3.R.inc(40015); // No custom convergence criterion.
        __CLR4_4_1uv6uv6lb90p9v3.R.inc(40017);this.initialStepBoundFactor = initialStepBoundFactor;
        __CLR4_4_1uv6uv6lb90p9v3.R.inc(40018);this.costRelativeTolerance = costRelativeTolerance;
        __CLR4_4_1uv6uv6lb90p9v3.R.inc(40019);this.parRelativeTolerance = parRelativeTolerance;
        __CLR4_4_1uv6uv6lb90p9v3.R.inc(40020);this.orthoTolerance = orthoTolerance;
        __CLR4_4_1uv6uv6lb90p9v3.R.inc(40021);this.qrRankingThreshold = threshold;
    }finally{__CLR4_4_1uv6uv6lb90p9v3.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    protected PointVectorValuePair doOptimize() {try{__CLR4_4_1uv6uv6lb90p9v3.R.inc(40022);
        __CLR4_4_1uv6uv6lb90p9v3.R.inc(40023);checkParameters();

        __CLR4_4_1uv6uv6lb90p9v3.R.inc(40024);final int nR = getTarget().length; // Number of observed data.
        __CLR4_4_1uv6uv6lb90p9v3.R.inc(40025);final double[] currentPoint = getStartPoint();
        __CLR4_4_1uv6uv6lb90p9v3.R.inc(40026);final int nC = currentPoint.length; // Number of parameters.

        // arrays shared with the other private methods
        __CLR4_4_1uv6uv6lb90p9v3.R.inc(40027);solvedCols  = FastMath.min(nR, nC);
        __CLR4_4_1uv6uv6lb90p9v3.R.inc(40028);diagR       = new double[nC];
        __CLR4_4_1uv6uv6lb90p9v3.R.inc(40029);jacNorm     = new double[nC];
        __CLR4_4_1uv6uv6lb90p9v3.R.inc(40030);beta        = new double[nC];
        __CLR4_4_1uv6uv6lb90p9v3.R.inc(40031);permutation = new int[nC];
        __CLR4_4_1uv6uv6lb90p9v3.R.inc(40032);lmDir       = new double[nC];

        // local point
        __CLR4_4_1uv6uv6lb90p9v3.R.inc(40033);double   delta   = 0;
        __CLR4_4_1uv6uv6lb90p9v3.R.inc(40034);double   xNorm   = 0;
        __CLR4_4_1uv6uv6lb90p9v3.R.inc(40035);double[] diag    = new double[nC];
        __CLR4_4_1uv6uv6lb90p9v3.R.inc(40036);double[] oldX    = new double[nC];
        __CLR4_4_1uv6uv6lb90p9v3.R.inc(40037);double[] oldRes  = new double[nR];
        __CLR4_4_1uv6uv6lb90p9v3.R.inc(40038);double[] oldObj  = new double[nR];
        __CLR4_4_1uv6uv6lb90p9v3.R.inc(40039);double[] qtf     = new double[nR];
        __CLR4_4_1uv6uv6lb90p9v3.R.inc(40040);double[] work1   = new double[nC];
        __CLR4_4_1uv6uv6lb90p9v3.R.inc(40041);double[] work2   = new double[nC];
        __CLR4_4_1uv6uv6lb90p9v3.R.inc(40042);double[] work3   = new double[nC];

        __CLR4_4_1uv6uv6lb90p9v3.R.inc(40043);final RealMatrix weightMatrixSqrt = getWeightSquareRoot();

        // Evaluate the function at the starting point and calculate its norm.
        __CLR4_4_1uv6uv6lb90p9v3.R.inc(40044);double[] currentObjective = computeObjectiveValue(currentPoint);
        __CLR4_4_1uv6uv6lb90p9v3.R.inc(40045);double[] currentResiduals = computeResiduals(currentObjective);
        __CLR4_4_1uv6uv6lb90p9v3.R.inc(40046);PointVectorValuePair current = new PointVectorValuePair(currentPoint, currentObjective);
        __CLR4_4_1uv6uv6lb90p9v3.R.inc(40047);double currentCost = computeCost(currentResiduals);

        // Outer loop.
        __CLR4_4_1uv6uv6lb90p9v3.R.inc(40048);lmPar = 0;
        __CLR4_4_1uv6uv6lb90p9v3.R.inc(40049);boolean firstIteration = true;
        __CLR4_4_1uv6uv6lb90p9v3.R.inc(40050);final ConvergenceChecker<PointVectorValuePair> checker = getConvergenceChecker();
        __CLR4_4_1uv6uv6lb90p9v3.R.inc(40051);while (true) {{
            __CLR4_4_1uv6uv6lb90p9v3.R.inc(40052);incrementIterationCount();

            __CLR4_4_1uv6uv6lb90p9v3.R.inc(40053);final PointVectorValuePair previous = current;

            // QR decomposition of the jacobian matrix
            __CLR4_4_1uv6uv6lb90p9v3.R.inc(40054);qrDecomposition(computeWeightedJacobian(currentPoint));

            __CLR4_4_1uv6uv6lb90p9v3.R.inc(40055);weightedResidual = weightMatrixSqrt.operate(currentResiduals);
            __CLR4_4_1uv6uv6lb90p9v3.R.inc(40056);for (int i = 0; (((i < nR)&&(__CLR4_4_1uv6uv6lb90p9v3.R.iget(40057)!=0|true))||(__CLR4_4_1uv6uv6lb90p9v3.R.iget(40058)==0&false)); i++) {{
                __CLR4_4_1uv6uv6lb90p9v3.R.inc(40059);qtf[i] = weightedResidual[i];
            }

            // compute Qt.res
            }__CLR4_4_1uv6uv6lb90p9v3.R.inc(40060);qTy(qtf);

            // now we don't need Q anymore,
            // so let jacobian contain the R matrix with its diagonal elements
            __CLR4_4_1uv6uv6lb90p9v3.R.inc(40061);for (int k = 0; (((k < solvedCols)&&(__CLR4_4_1uv6uv6lb90p9v3.R.iget(40062)!=0|true))||(__CLR4_4_1uv6uv6lb90p9v3.R.iget(40063)==0&false)); ++k) {{
                __CLR4_4_1uv6uv6lb90p9v3.R.inc(40064);int pk = permutation[k];
                __CLR4_4_1uv6uv6lb90p9v3.R.inc(40065);weightedJacobian[k][pk] = diagR[pk];
            }

            }__CLR4_4_1uv6uv6lb90p9v3.R.inc(40066);if ((((firstIteration)&&(__CLR4_4_1uv6uv6lb90p9v3.R.iget(40067)!=0|true))||(__CLR4_4_1uv6uv6lb90p9v3.R.iget(40068)==0&false))) {{
                // scale the point according to the norms of the columns
                // of the initial jacobian
                __CLR4_4_1uv6uv6lb90p9v3.R.inc(40069);xNorm = 0;
                __CLR4_4_1uv6uv6lb90p9v3.R.inc(40070);for (int k = 0; (((k < nC)&&(__CLR4_4_1uv6uv6lb90p9v3.R.iget(40071)!=0|true))||(__CLR4_4_1uv6uv6lb90p9v3.R.iget(40072)==0&false)); ++k) {{
                    __CLR4_4_1uv6uv6lb90p9v3.R.inc(40073);double dk = jacNorm[k];
                    __CLR4_4_1uv6uv6lb90p9v3.R.inc(40074);if ((((dk == 0)&&(__CLR4_4_1uv6uv6lb90p9v3.R.iget(40075)!=0|true))||(__CLR4_4_1uv6uv6lb90p9v3.R.iget(40076)==0&false))) {{
                        __CLR4_4_1uv6uv6lb90p9v3.R.inc(40077);dk = 1.0;
                    }
                    }__CLR4_4_1uv6uv6lb90p9v3.R.inc(40078);double xk = dk * currentPoint[k];
                    __CLR4_4_1uv6uv6lb90p9v3.R.inc(40079);xNorm  += xk * xk;
                    __CLR4_4_1uv6uv6lb90p9v3.R.inc(40080);diag[k] = dk;
                }
                }__CLR4_4_1uv6uv6lb90p9v3.R.inc(40081);xNorm = FastMath.sqrt(xNorm);

                // initialize the step bound delta
                __CLR4_4_1uv6uv6lb90p9v3.R.inc(40082);delta = ((((xNorm == 0) )&&(__CLR4_4_1uv6uv6lb90p9v3.R.iget(40083)!=0|true))||(__CLR4_4_1uv6uv6lb90p9v3.R.iget(40084)==0&false))? initialStepBoundFactor : (initialStepBoundFactor * xNorm);
            }

            // check orthogonality between function vector and jacobian columns
            }__CLR4_4_1uv6uv6lb90p9v3.R.inc(40085);double maxCosine = 0;
            __CLR4_4_1uv6uv6lb90p9v3.R.inc(40086);if ((((currentCost != 0)&&(__CLR4_4_1uv6uv6lb90p9v3.R.iget(40087)!=0|true))||(__CLR4_4_1uv6uv6lb90p9v3.R.iget(40088)==0&false))) {{
                __CLR4_4_1uv6uv6lb90p9v3.R.inc(40089);for (int j = 0; (((j < solvedCols)&&(__CLR4_4_1uv6uv6lb90p9v3.R.iget(40090)!=0|true))||(__CLR4_4_1uv6uv6lb90p9v3.R.iget(40091)==0&false)); ++j) {{
                    __CLR4_4_1uv6uv6lb90p9v3.R.inc(40092);int    pj = permutation[j];
                    __CLR4_4_1uv6uv6lb90p9v3.R.inc(40093);double s  = jacNorm[pj];
                    __CLR4_4_1uv6uv6lb90p9v3.R.inc(40094);if ((((s != 0)&&(__CLR4_4_1uv6uv6lb90p9v3.R.iget(40095)!=0|true))||(__CLR4_4_1uv6uv6lb90p9v3.R.iget(40096)==0&false))) {{
                        __CLR4_4_1uv6uv6lb90p9v3.R.inc(40097);double sum = 0;
                        __CLR4_4_1uv6uv6lb90p9v3.R.inc(40098);for (int i = 0; (((i <= j)&&(__CLR4_4_1uv6uv6lb90p9v3.R.iget(40099)!=0|true))||(__CLR4_4_1uv6uv6lb90p9v3.R.iget(40100)==0&false)); ++i) {{
                            __CLR4_4_1uv6uv6lb90p9v3.R.inc(40101);sum += weightedJacobian[i][pj] * qtf[i];
                        }
                        }__CLR4_4_1uv6uv6lb90p9v3.R.inc(40102);maxCosine = FastMath.max(maxCosine, FastMath.abs(sum) / (s * currentCost));
                    }
                }}
            }}
            }__CLR4_4_1uv6uv6lb90p9v3.R.inc(40103);if ((((maxCosine <= orthoTolerance)&&(__CLR4_4_1uv6uv6lb90p9v3.R.iget(40104)!=0|true))||(__CLR4_4_1uv6uv6lb90p9v3.R.iget(40105)==0&false))) {{
                // Convergence has been reached.
                __CLR4_4_1uv6uv6lb90p9v3.R.inc(40106);setCost(currentCost);
                __CLR4_4_1uv6uv6lb90p9v3.R.inc(40107);return current;
            }

            // rescale if necessary
            }__CLR4_4_1uv6uv6lb90p9v3.R.inc(40108);for (int j = 0; (((j < nC)&&(__CLR4_4_1uv6uv6lb90p9v3.R.iget(40109)!=0|true))||(__CLR4_4_1uv6uv6lb90p9v3.R.iget(40110)==0&false)); ++j) {{
                __CLR4_4_1uv6uv6lb90p9v3.R.inc(40111);diag[j] = FastMath.max(diag[j], jacNorm[j]);
            }

            // Inner loop.
            }__CLR4_4_1uv6uv6lb90p9v3.R.inc(40112);for (double ratio = 0; (((ratio < 1.0e-4)&&(__CLR4_4_1uv6uv6lb90p9v3.R.iget(40113)!=0|true))||(__CLR4_4_1uv6uv6lb90p9v3.R.iget(40114)==0&false));) {{

                // save the state
                __CLR4_4_1uv6uv6lb90p9v3.R.inc(40115);for (int j = 0; (((j < solvedCols)&&(__CLR4_4_1uv6uv6lb90p9v3.R.iget(40116)!=0|true))||(__CLR4_4_1uv6uv6lb90p9v3.R.iget(40117)==0&false)); ++j) {{
                    __CLR4_4_1uv6uv6lb90p9v3.R.inc(40118);int pj = permutation[j];
                    __CLR4_4_1uv6uv6lb90p9v3.R.inc(40119);oldX[pj] = currentPoint[pj];
                }
                }__CLR4_4_1uv6uv6lb90p9v3.R.inc(40120);final double previousCost = currentCost;
                __CLR4_4_1uv6uv6lb90p9v3.R.inc(40121);double[] tmpVec = weightedResidual;
                __CLR4_4_1uv6uv6lb90p9v3.R.inc(40122);weightedResidual = oldRes;
                __CLR4_4_1uv6uv6lb90p9v3.R.inc(40123);oldRes    = tmpVec;
                __CLR4_4_1uv6uv6lb90p9v3.R.inc(40124);tmpVec    = currentObjective;
                __CLR4_4_1uv6uv6lb90p9v3.R.inc(40125);currentObjective = oldObj;
                __CLR4_4_1uv6uv6lb90p9v3.R.inc(40126);oldObj    = tmpVec;

                // determine the Levenberg-Marquardt parameter
                __CLR4_4_1uv6uv6lb90p9v3.R.inc(40127);determineLMParameter(qtf, delta, diag, work1, work2, work3);

                // compute the new point and the norm of the evolution direction
                __CLR4_4_1uv6uv6lb90p9v3.R.inc(40128);double lmNorm = 0;
                __CLR4_4_1uv6uv6lb90p9v3.R.inc(40129);for (int j = 0; (((j < solvedCols)&&(__CLR4_4_1uv6uv6lb90p9v3.R.iget(40130)!=0|true))||(__CLR4_4_1uv6uv6lb90p9v3.R.iget(40131)==0&false)); ++j) {{
                    __CLR4_4_1uv6uv6lb90p9v3.R.inc(40132);int pj = permutation[j];
                    __CLR4_4_1uv6uv6lb90p9v3.R.inc(40133);lmDir[pj] = -lmDir[pj];
                    __CLR4_4_1uv6uv6lb90p9v3.R.inc(40134);currentPoint[pj] = oldX[pj] + lmDir[pj];
                    __CLR4_4_1uv6uv6lb90p9v3.R.inc(40135);double s = diag[pj] * lmDir[pj];
                    __CLR4_4_1uv6uv6lb90p9v3.R.inc(40136);lmNorm  += s * s;
                }
                }__CLR4_4_1uv6uv6lb90p9v3.R.inc(40137);lmNorm = FastMath.sqrt(lmNorm);
                // on the first iteration, adjust the initial step bound.
                __CLR4_4_1uv6uv6lb90p9v3.R.inc(40138);if ((((firstIteration)&&(__CLR4_4_1uv6uv6lb90p9v3.R.iget(40139)!=0|true))||(__CLR4_4_1uv6uv6lb90p9v3.R.iget(40140)==0&false))) {{
                    __CLR4_4_1uv6uv6lb90p9v3.R.inc(40141);delta = FastMath.min(delta, lmNorm);
                }

                // Evaluate the function at x + p and calculate its norm.
                }__CLR4_4_1uv6uv6lb90p9v3.R.inc(40142);currentObjective = computeObjectiveValue(currentPoint);
                __CLR4_4_1uv6uv6lb90p9v3.R.inc(40143);currentResiduals = computeResiduals(currentObjective);
                __CLR4_4_1uv6uv6lb90p9v3.R.inc(40144);current = new PointVectorValuePair(currentPoint, currentObjective);
                __CLR4_4_1uv6uv6lb90p9v3.R.inc(40145);currentCost = computeCost(currentResiduals);

                // compute the scaled actual reduction
                __CLR4_4_1uv6uv6lb90p9v3.R.inc(40146);double actRed = -1.0;
                __CLR4_4_1uv6uv6lb90p9v3.R.inc(40147);if ((((0.1 * currentCost < previousCost)&&(__CLR4_4_1uv6uv6lb90p9v3.R.iget(40148)!=0|true))||(__CLR4_4_1uv6uv6lb90p9v3.R.iget(40149)==0&false))) {{
                    __CLR4_4_1uv6uv6lb90p9v3.R.inc(40150);double r = currentCost / previousCost;
                    __CLR4_4_1uv6uv6lb90p9v3.R.inc(40151);actRed = 1.0 - r * r;
                }

                // compute the scaled predicted reduction
                // and the scaled directional derivative
                }__CLR4_4_1uv6uv6lb90p9v3.R.inc(40152);for (int j = 0; (((j < solvedCols)&&(__CLR4_4_1uv6uv6lb90p9v3.R.iget(40153)!=0|true))||(__CLR4_4_1uv6uv6lb90p9v3.R.iget(40154)==0&false)); ++j) {{
                    __CLR4_4_1uv6uv6lb90p9v3.R.inc(40155);int pj = permutation[j];
                    __CLR4_4_1uv6uv6lb90p9v3.R.inc(40156);double dirJ = lmDir[pj];
                    __CLR4_4_1uv6uv6lb90p9v3.R.inc(40157);work1[j] = 0;
                    __CLR4_4_1uv6uv6lb90p9v3.R.inc(40158);for (int i = 0; (((i <= j)&&(__CLR4_4_1uv6uv6lb90p9v3.R.iget(40159)!=0|true))||(__CLR4_4_1uv6uv6lb90p9v3.R.iget(40160)==0&false)); ++i) {{
                        __CLR4_4_1uv6uv6lb90p9v3.R.inc(40161);work1[i] += weightedJacobian[i][pj] * dirJ;
                    }
                }}
                }__CLR4_4_1uv6uv6lb90p9v3.R.inc(40162);double coeff1 = 0;
                __CLR4_4_1uv6uv6lb90p9v3.R.inc(40163);for (int j = 0; (((j < solvedCols)&&(__CLR4_4_1uv6uv6lb90p9v3.R.iget(40164)!=0|true))||(__CLR4_4_1uv6uv6lb90p9v3.R.iget(40165)==0&false)); ++j) {{
                    __CLR4_4_1uv6uv6lb90p9v3.R.inc(40166);coeff1 += work1[j] * work1[j];
                }
                }__CLR4_4_1uv6uv6lb90p9v3.R.inc(40167);double pc2 = previousCost * previousCost;
                __CLR4_4_1uv6uv6lb90p9v3.R.inc(40168);coeff1 = coeff1 / pc2;
                __CLR4_4_1uv6uv6lb90p9v3.R.inc(40169);double coeff2 = lmPar * lmNorm * lmNorm / pc2;
                __CLR4_4_1uv6uv6lb90p9v3.R.inc(40170);double preRed = coeff1 + 2 * coeff2;
                __CLR4_4_1uv6uv6lb90p9v3.R.inc(40171);double dirDer = -(coeff1 + coeff2);

                // ratio of the actual to the predicted reduction
                __CLR4_4_1uv6uv6lb90p9v3.R.inc(40172);ratio = ((((preRed == 0) )&&(__CLR4_4_1uv6uv6lb90p9v3.R.iget(40173)!=0|true))||(__CLR4_4_1uv6uv6lb90p9v3.R.iget(40174)==0&false))? 0 : (actRed / preRed);

                // update the step bound
                __CLR4_4_1uv6uv6lb90p9v3.R.inc(40175);if ((((ratio <= 0.25)&&(__CLR4_4_1uv6uv6lb90p9v3.R.iget(40176)!=0|true))||(__CLR4_4_1uv6uv6lb90p9v3.R.iget(40177)==0&false))) {{
                    __CLR4_4_1uv6uv6lb90p9v3.R.inc(40178);double tmp =
                        ((((actRed < 0) )&&(__CLR4_4_1uv6uv6lb90p9v3.R.iget(40179)!=0|true))||(__CLR4_4_1uv6uv6lb90p9v3.R.iget(40180)==0&false))? (0.5 * dirDer / (dirDer + 0.5 * actRed)) : 0.5;
                        __CLR4_4_1uv6uv6lb90p9v3.R.inc(40181);if (((((0.1 * currentCost >= previousCost) || (tmp < 0.1))&&(__CLR4_4_1uv6uv6lb90p9v3.R.iget(40182)!=0|true))||(__CLR4_4_1uv6uv6lb90p9v3.R.iget(40183)==0&false))) {{
                            __CLR4_4_1uv6uv6lb90p9v3.R.inc(40184);tmp = 0.1;
                        }
                        }__CLR4_4_1uv6uv6lb90p9v3.R.inc(40185);delta = tmp * FastMath.min(delta, 10.0 * lmNorm);
                        __CLR4_4_1uv6uv6lb90p9v3.R.inc(40186);lmPar /= tmp;
                } }else {__CLR4_4_1uv6uv6lb90p9v3.R.inc(40187);if (((((lmPar == 0) || (ratio >= 0.75))&&(__CLR4_4_1uv6uv6lb90p9v3.R.iget(40188)!=0|true))||(__CLR4_4_1uv6uv6lb90p9v3.R.iget(40189)==0&false))) {{
                    __CLR4_4_1uv6uv6lb90p9v3.R.inc(40190);delta = 2 * lmNorm;
                    __CLR4_4_1uv6uv6lb90p9v3.R.inc(40191);lmPar *= 0.5;
                }

                // test for successful iteration.
                }}__CLR4_4_1uv6uv6lb90p9v3.R.inc(40192);if ((((ratio >= 1.0e-4)&&(__CLR4_4_1uv6uv6lb90p9v3.R.iget(40193)!=0|true))||(__CLR4_4_1uv6uv6lb90p9v3.R.iget(40194)==0&false))) {{
                    // successful iteration, update the norm
                    __CLR4_4_1uv6uv6lb90p9v3.R.inc(40195);firstIteration = false;
                    __CLR4_4_1uv6uv6lb90p9v3.R.inc(40196);xNorm = 0;
                    __CLR4_4_1uv6uv6lb90p9v3.R.inc(40197);for (int k = 0; (((k < nC)&&(__CLR4_4_1uv6uv6lb90p9v3.R.iget(40198)!=0|true))||(__CLR4_4_1uv6uv6lb90p9v3.R.iget(40199)==0&false)); ++k) {{
                        __CLR4_4_1uv6uv6lb90p9v3.R.inc(40200);double xK = diag[k] * currentPoint[k];
                        __CLR4_4_1uv6uv6lb90p9v3.R.inc(40201);xNorm += xK * xK;
                    }
                    }__CLR4_4_1uv6uv6lb90p9v3.R.inc(40202);xNorm = FastMath.sqrt(xNorm);

                    // tests for convergence.
                    __CLR4_4_1uv6uv6lb90p9v3.R.inc(40203);if ((((checker != null && checker.converged(getIterations(), previous, current))&&(__CLR4_4_1uv6uv6lb90p9v3.R.iget(40204)!=0|true))||(__CLR4_4_1uv6uv6lb90p9v3.R.iget(40205)==0&false))) {{
                        __CLR4_4_1uv6uv6lb90p9v3.R.inc(40206);setCost(currentCost);
                        __CLR4_4_1uv6uv6lb90p9v3.R.inc(40207);return current;
                    }
                }} }else {{
                    // failed iteration, reset the previous values
                    __CLR4_4_1uv6uv6lb90p9v3.R.inc(40208);currentCost = previousCost;
                    __CLR4_4_1uv6uv6lb90p9v3.R.inc(40209);for (int j = 0; (((j < solvedCols)&&(__CLR4_4_1uv6uv6lb90p9v3.R.iget(40210)!=0|true))||(__CLR4_4_1uv6uv6lb90p9v3.R.iget(40211)==0&false)); ++j) {{
                        __CLR4_4_1uv6uv6lb90p9v3.R.inc(40212);int pj = permutation[j];
                        __CLR4_4_1uv6uv6lb90p9v3.R.inc(40213);currentPoint[pj] = oldX[pj];
                    }
                    }__CLR4_4_1uv6uv6lb90p9v3.R.inc(40214);tmpVec    = weightedResidual;
                    __CLR4_4_1uv6uv6lb90p9v3.R.inc(40215);weightedResidual = oldRes;
                    __CLR4_4_1uv6uv6lb90p9v3.R.inc(40216);oldRes    = tmpVec;
                    __CLR4_4_1uv6uv6lb90p9v3.R.inc(40217);tmpVec    = currentObjective;
                    __CLR4_4_1uv6uv6lb90p9v3.R.inc(40218);currentObjective = oldObj;
                    __CLR4_4_1uv6uv6lb90p9v3.R.inc(40219);oldObj    = tmpVec;
                    // Reset "current" to previous values.
                    __CLR4_4_1uv6uv6lb90p9v3.R.inc(40220);current = new PointVectorValuePair(currentPoint, currentObjective);
                }

                // Default convergence criteria.
                }__CLR4_4_1uv6uv6lb90p9v3.R.inc(40221);if (((((FastMath.abs(actRed) <= costRelativeTolerance &&
                     preRed <= costRelativeTolerance &&
                     ratio <= 2.0) ||
                    delta <= parRelativeTolerance * xNorm)&&(__CLR4_4_1uv6uv6lb90p9v3.R.iget(40222)!=0|true))||(__CLR4_4_1uv6uv6lb90p9v3.R.iget(40223)==0&false))) {{
                    __CLR4_4_1uv6uv6lb90p9v3.R.inc(40224);setCost(currentCost);
                    __CLR4_4_1uv6uv6lb90p9v3.R.inc(40225);return current;
                }

                // tests for termination and stringent tolerances
                }__CLR4_4_1uv6uv6lb90p9v3.R.inc(40226);if ((((FastMath.abs(actRed) <= TWO_EPS &&
                    preRed <= TWO_EPS &&
                    ratio <= 2.0)&&(__CLR4_4_1uv6uv6lb90p9v3.R.iget(40227)!=0|true))||(__CLR4_4_1uv6uv6lb90p9v3.R.iget(40228)==0&false))) {{
                    __CLR4_4_1uv6uv6lb90p9v3.R.inc(40229);throw new ConvergenceException(LocalizedFormats.TOO_SMALL_COST_RELATIVE_TOLERANCE,
                                                   costRelativeTolerance);
                } }else {__CLR4_4_1uv6uv6lb90p9v3.R.inc(40230);if ((((delta <= TWO_EPS * xNorm)&&(__CLR4_4_1uv6uv6lb90p9v3.R.iget(40231)!=0|true))||(__CLR4_4_1uv6uv6lb90p9v3.R.iget(40232)==0&false))) {{
                    __CLR4_4_1uv6uv6lb90p9v3.R.inc(40233);throw new ConvergenceException(LocalizedFormats.TOO_SMALL_PARAMETERS_RELATIVE_TOLERANCE,
                                                   parRelativeTolerance);
                } }else {__CLR4_4_1uv6uv6lb90p9v3.R.inc(40234);if ((((maxCosine <= TWO_EPS)&&(__CLR4_4_1uv6uv6lb90p9v3.R.iget(40235)!=0|true))||(__CLR4_4_1uv6uv6lb90p9v3.R.iget(40236)==0&false))) {{
                    __CLR4_4_1uv6uv6lb90p9v3.R.inc(40237);throw new ConvergenceException(LocalizedFormats.TOO_SMALL_ORTHOGONALITY_TOLERANCE,
                                                   orthoTolerance);
                }
            }}}}
        }}
    }}finally{__CLR4_4_1uv6uv6lb90p9v3.R.flushNeeded();}}

    /**
     * Determine the Levenberg-Marquardt parameter.
     * <p>This implementation is a translation in Java of the MINPACK
     * <a href="http://www.netlib.org/minpack/lmpar.f">lmpar</a>
     * routine.</p>
     * <p>This method sets the lmPar and lmDir attributes.</p>
     * <p>The authors of the original fortran function are:</p>
     * <ul>
     *   <li>Argonne National Laboratory. MINPACK project. March 1980</li>
     *   <li>Burton  S. Garbow</li>
     *   <li>Kenneth E. Hillstrom</li>
     *   <li>Jorge   J. More</li>
     * </ul>
     * <p>Luc Maisonobe did the Java translation.</p>
     *
     * @param qy array containing qTy
     * @param delta upper bound on the euclidean norm of diagR * lmDir
     * @param diag diagonal matrix
     * @param work1 work array
     * @param work2 work array
     * @param work3 work array
     */
    private void determineLMParameter(double[] qy, double delta, double[] diag,
                                      double[] work1, double[] work2, double[] work3) {try{__CLR4_4_1uv6uv6lb90p9v3.R.inc(40238);
        __CLR4_4_1uv6uv6lb90p9v3.R.inc(40239);final int nC = weightedJacobian[0].length;

        // compute and store in x the gauss-newton direction, if the
        // jacobian is rank-deficient, obtain a least squares solution
        __CLR4_4_1uv6uv6lb90p9v3.R.inc(40240);for (int j = 0; (((j < rank)&&(__CLR4_4_1uv6uv6lb90p9v3.R.iget(40241)!=0|true))||(__CLR4_4_1uv6uv6lb90p9v3.R.iget(40242)==0&false)); ++j) {{
            __CLR4_4_1uv6uv6lb90p9v3.R.inc(40243);lmDir[permutation[j]] = qy[j];
        }
        }__CLR4_4_1uv6uv6lb90p9v3.R.inc(40244);for (int j = rank; (((j < nC)&&(__CLR4_4_1uv6uv6lb90p9v3.R.iget(40245)!=0|true))||(__CLR4_4_1uv6uv6lb90p9v3.R.iget(40246)==0&false)); ++j) {{
            __CLR4_4_1uv6uv6lb90p9v3.R.inc(40247);lmDir[permutation[j]] = 0;
        }
        }__CLR4_4_1uv6uv6lb90p9v3.R.inc(40248);for (int k = rank - 1; (((k >= 0)&&(__CLR4_4_1uv6uv6lb90p9v3.R.iget(40249)!=0|true))||(__CLR4_4_1uv6uv6lb90p9v3.R.iget(40250)==0&false)); --k) {{
            __CLR4_4_1uv6uv6lb90p9v3.R.inc(40251);int pk = permutation[k];
            __CLR4_4_1uv6uv6lb90p9v3.R.inc(40252);double ypk = lmDir[pk] / diagR[pk];
            __CLR4_4_1uv6uv6lb90p9v3.R.inc(40253);for (int i = 0; (((i < k)&&(__CLR4_4_1uv6uv6lb90p9v3.R.iget(40254)!=0|true))||(__CLR4_4_1uv6uv6lb90p9v3.R.iget(40255)==0&false)); ++i) {{
                __CLR4_4_1uv6uv6lb90p9v3.R.inc(40256);lmDir[permutation[i]] -= ypk * weightedJacobian[i][pk];
            }
            }__CLR4_4_1uv6uv6lb90p9v3.R.inc(40257);lmDir[pk] = ypk;
        }

        // evaluate the function at the origin, and test
        // for acceptance of the Gauss-Newton direction
        }__CLR4_4_1uv6uv6lb90p9v3.R.inc(40258);double dxNorm = 0;
        __CLR4_4_1uv6uv6lb90p9v3.R.inc(40259);for (int j = 0; (((j < solvedCols)&&(__CLR4_4_1uv6uv6lb90p9v3.R.iget(40260)!=0|true))||(__CLR4_4_1uv6uv6lb90p9v3.R.iget(40261)==0&false)); ++j) {{
            __CLR4_4_1uv6uv6lb90p9v3.R.inc(40262);int pj = permutation[j];
            __CLR4_4_1uv6uv6lb90p9v3.R.inc(40263);double s = diag[pj] * lmDir[pj];
            __CLR4_4_1uv6uv6lb90p9v3.R.inc(40264);work1[pj] = s;
            __CLR4_4_1uv6uv6lb90p9v3.R.inc(40265);dxNorm += s * s;
        }
        }__CLR4_4_1uv6uv6lb90p9v3.R.inc(40266);dxNorm = FastMath.sqrt(dxNorm);
        __CLR4_4_1uv6uv6lb90p9v3.R.inc(40267);double fp = dxNorm - delta;
        __CLR4_4_1uv6uv6lb90p9v3.R.inc(40268);if ((((fp <= 0.1 * delta)&&(__CLR4_4_1uv6uv6lb90p9v3.R.iget(40269)!=0|true))||(__CLR4_4_1uv6uv6lb90p9v3.R.iget(40270)==0&false))) {{
            __CLR4_4_1uv6uv6lb90p9v3.R.inc(40271);lmPar = 0;
            __CLR4_4_1uv6uv6lb90p9v3.R.inc(40272);return;
        }

        // if the jacobian is not rank deficient, the Newton step provides
        // a lower bound, parl, for the zero of the function,
        // otherwise set this bound to zero
        }__CLR4_4_1uv6uv6lb90p9v3.R.inc(40273);double sum2;
        __CLR4_4_1uv6uv6lb90p9v3.R.inc(40274);double parl = 0;
        __CLR4_4_1uv6uv6lb90p9v3.R.inc(40275);if ((((rank == solvedCols)&&(__CLR4_4_1uv6uv6lb90p9v3.R.iget(40276)!=0|true))||(__CLR4_4_1uv6uv6lb90p9v3.R.iget(40277)==0&false))) {{
            __CLR4_4_1uv6uv6lb90p9v3.R.inc(40278);for (int j = 0; (((j < solvedCols)&&(__CLR4_4_1uv6uv6lb90p9v3.R.iget(40279)!=0|true))||(__CLR4_4_1uv6uv6lb90p9v3.R.iget(40280)==0&false)); ++j) {{
                __CLR4_4_1uv6uv6lb90p9v3.R.inc(40281);int pj = permutation[j];
                __CLR4_4_1uv6uv6lb90p9v3.R.inc(40282);work1[pj] *= diag[pj] / dxNorm;
            }
            }__CLR4_4_1uv6uv6lb90p9v3.R.inc(40283);sum2 = 0;
            __CLR4_4_1uv6uv6lb90p9v3.R.inc(40284);for (int j = 0; (((j < solvedCols)&&(__CLR4_4_1uv6uv6lb90p9v3.R.iget(40285)!=0|true))||(__CLR4_4_1uv6uv6lb90p9v3.R.iget(40286)==0&false)); ++j) {{
                __CLR4_4_1uv6uv6lb90p9v3.R.inc(40287);int pj = permutation[j];
                __CLR4_4_1uv6uv6lb90p9v3.R.inc(40288);double sum = 0;
                __CLR4_4_1uv6uv6lb90p9v3.R.inc(40289);for (int i = 0; (((i < j)&&(__CLR4_4_1uv6uv6lb90p9v3.R.iget(40290)!=0|true))||(__CLR4_4_1uv6uv6lb90p9v3.R.iget(40291)==0&false)); ++i) {{
                    __CLR4_4_1uv6uv6lb90p9v3.R.inc(40292);sum += weightedJacobian[i][pj] * work1[permutation[i]];
                }
                }__CLR4_4_1uv6uv6lb90p9v3.R.inc(40293);double s = (work1[pj] - sum) / diagR[pj];
                __CLR4_4_1uv6uv6lb90p9v3.R.inc(40294);work1[pj] = s;
                __CLR4_4_1uv6uv6lb90p9v3.R.inc(40295);sum2 += s * s;
            }
            }__CLR4_4_1uv6uv6lb90p9v3.R.inc(40296);parl = fp / (delta * sum2);
        }

        // calculate an upper bound, paru, for the zero of the function
        }__CLR4_4_1uv6uv6lb90p9v3.R.inc(40297);sum2 = 0;
        __CLR4_4_1uv6uv6lb90p9v3.R.inc(40298);for (int j = 0; (((j < solvedCols)&&(__CLR4_4_1uv6uv6lb90p9v3.R.iget(40299)!=0|true))||(__CLR4_4_1uv6uv6lb90p9v3.R.iget(40300)==0&false)); ++j) {{
            __CLR4_4_1uv6uv6lb90p9v3.R.inc(40301);int pj = permutation[j];
            __CLR4_4_1uv6uv6lb90p9v3.R.inc(40302);double sum = 0;
            __CLR4_4_1uv6uv6lb90p9v3.R.inc(40303);for (int i = 0; (((i <= j)&&(__CLR4_4_1uv6uv6lb90p9v3.R.iget(40304)!=0|true))||(__CLR4_4_1uv6uv6lb90p9v3.R.iget(40305)==0&false)); ++i) {{
                __CLR4_4_1uv6uv6lb90p9v3.R.inc(40306);sum += weightedJacobian[i][pj] * qy[i];
            }
            }__CLR4_4_1uv6uv6lb90p9v3.R.inc(40307);sum /= diag[pj];
            __CLR4_4_1uv6uv6lb90p9v3.R.inc(40308);sum2 += sum * sum;
        }
        }__CLR4_4_1uv6uv6lb90p9v3.R.inc(40309);double gNorm = FastMath.sqrt(sum2);
        __CLR4_4_1uv6uv6lb90p9v3.R.inc(40310);double paru = gNorm / delta;
        __CLR4_4_1uv6uv6lb90p9v3.R.inc(40311);if ((((paru == 0)&&(__CLR4_4_1uv6uv6lb90p9v3.R.iget(40312)!=0|true))||(__CLR4_4_1uv6uv6lb90p9v3.R.iget(40313)==0&false))) {{
            __CLR4_4_1uv6uv6lb90p9v3.R.inc(40314);paru = Precision.SAFE_MIN / FastMath.min(delta, 0.1);
        }

        // if the input par lies outside of the interval (parl,paru),
        // set par to the closer endpoint
        }__CLR4_4_1uv6uv6lb90p9v3.R.inc(40315);lmPar = FastMath.min(paru, FastMath.max(lmPar, parl));
        __CLR4_4_1uv6uv6lb90p9v3.R.inc(40316);if ((((lmPar == 0)&&(__CLR4_4_1uv6uv6lb90p9v3.R.iget(40317)!=0|true))||(__CLR4_4_1uv6uv6lb90p9v3.R.iget(40318)==0&false))) {{
            __CLR4_4_1uv6uv6lb90p9v3.R.inc(40319);lmPar = gNorm / dxNorm;
        }

        }__CLR4_4_1uv6uv6lb90p9v3.R.inc(40320);for (int countdown = 10; (((countdown >= 0)&&(__CLR4_4_1uv6uv6lb90p9v3.R.iget(40321)!=0|true))||(__CLR4_4_1uv6uv6lb90p9v3.R.iget(40322)==0&false)); --countdown) {{

            // evaluate the function at the current value of lmPar
            __CLR4_4_1uv6uv6lb90p9v3.R.inc(40323);if ((((lmPar == 0)&&(__CLR4_4_1uv6uv6lb90p9v3.R.iget(40324)!=0|true))||(__CLR4_4_1uv6uv6lb90p9v3.R.iget(40325)==0&false))) {{
                __CLR4_4_1uv6uv6lb90p9v3.R.inc(40326);lmPar = FastMath.max(Precision.SAFE_MIN, 0.001 * paru);
            }
            }__CLR4_4_1uv6uv6lb90p9v3.R.inc(40327);double sPar = FastMath.sqrt(lmPar);
            __CLR4_4_1uv6uv6lb90p9v3.R.inc(40328);for (int j = 0; (((j < solvedCols)&&(__CLR4_4_1uv6uv6lb90p9v3.R.iget(40329)!=0|true))||(__CLR4_4_1uv6uv6lb90p9v3.R.iget(40330)==0&false)); ++j) {{
                __CLR4_4_1uv6uv6lb90p9v3.R.inc(40331);int pj = permutation[j];
                __CLR4_4_1uv6uv6lb90p9v3.R.inc(40332);work1[pj] = sPar * diag[pj];
            }
            }__CLR4_4_1uv6uv6lb90p9v3.R.inc(40333);determineLMDirection(qy, work1, work2, work3);

            __CLR4_4_1uv6uv6lb90p9v3.R.inc(40334);dxNorm = 0;
            __CLR4_4_1uv6uv6lb90p9v3.R.inc(40335);for (int j = 0; (((j < solvedCols)&&(__CLR4_4_1uv6uv6lb90p9v3.R.iget(40336)!=0|true))||(__CLR4_4_1uv6uv6lb90p9v3.R.iget(40337)==0&false)); ++j) {{
                __CLR4_4_1uv6uv6lb90p9v3.R.inc(40338);int pj = permutation[j];
                __CLR4_4_1uv6uv6lb90p9v3.R.inc(40339);double s = diag[pj] * lmDir[pj];
                __CLR4_4_1uv6uv6lb90p9v3.R.inc(40340);work3[pj] = s;
                __CLR4_4_1uv6uv6lb90p9v3.R.inc(40341);dxNorm += s * s;
            }
            }__CLR4_4_1uv6uv6lb90p9v3.R.inc(40342);dxNorm = FastMath.sqrt(dxNorm);
            __CLR4_4_1uv6uv6lb90p9v3.R.inc(40343);double previousFP = fp;
            __CLR4_4_1uv6uv6lb90p9v3.R.inc(40344);fp = dxNorm - delta;

            // if the function is small enough, accept the current value
            // of lmPar, also test for the exceptional cases where parl is zero
            __CLR4_4_1uv6uv6lb90p9v3.R.inc(40345);if (((((FastMath.abs(fp) <= 0.1 * delta) ||
                    ((parl == 0) && (fp <= previousFP) && (previousFP < 0)))&&(__CLR4_4_1uv6uv6lb90p9v3.R.iget(40346)!=0|true))||(__CLR4_4_1uv6uv6lb90p9v3.R.iget(40347)==0&false))) {{
                __CLR4_4_1uv6uv6lb90p9v3.R.inc(40348);return;
            }

            // compute the Newton correction
            }__CLR4_4_1uv6uv6lb90p9v3.R.inc(40349);for (int j = 0; (((j < solvedCols)&&(__CLR4_4_1uv6uv6lb90p9v3.R.iget(40350)!=0|true))||(__CLR4_4_1uv6uv6lb90p9v3.R.iget(40351)==0&false)); ++j) {{
                __CLR4_4_1uv6uv6lb90p9v3.R.inc(40352);int pj = permutation[j];
                __CLR4_4_1uv6uv6lb90p9v3.R.inc(40353);work1[pj] = work3[pj] * diag[pj] / dxNorm;
            }
            }__CLR4_4_1uv6uv6lb90p9v3.R.inc(40354);for (int j = 0; (((j < solvedCols)&&(__CLR4_4_1uv6uv6lb90p9v3.R.iget(40355)!=0|true))||(__CLR4_4_1uv6uv6lb90p9v3.R.iget(40356)==0&false)); ++j) {{
                __CLR4_4_1uv6uv6lb90p9v3.R.inc(40357);int pj = permutation[j];
                __CLR4_4_1uv6uv6lb90p9v3.R.inc(40358);work1[pj] /= work2[j];
                __CLR4_4_1uv6uv6lb90p9v3.R.inc(40359);double tmp = work1[pj];
                __CLR4_4_1uv6uv6lb90p9v3.R.inc(40360);for (int i = j + 1; (((i < solvedCols)&&(__CLR4_4_1uv6uv6lb90p9v3.R.iget(40361)!=0|true))||(__CLR4_4_1uv6uv6lb90p9v3.R.iget(40362)==0&false)); ++i) {{
                    __CLR4_4_1uv6uv6lb90p9v3.R.inc(40363);work1[permutation[i]] -= weightedJacobian[i][pj] * tmp;
                }
            }}
            }__CLR4_4_1uv6uv6lb90p9v3.R.inc(40364);sum2 = 0;
            __CLR4_4_1uv6uv6lb90p9v3.R.inc(40365);for (int j = 0; (((j < solvedCols)&&(__CLR4_4_1uv6uv6lb90p9v3.R.iget(40366)!=0|true))||(__CLR4_4_1uv6uv6lb90p9v3.R.iget(40367)==0&false)); ++j) {{
                __CLR4_4_1uv6uv6lb90p9v3.R.inc(40368);double s = work1[permutation[j]];
                __CLR4_4_1uv6uv6lb90p9v3.R.inc(40369);sum2 += s * s;
            }
            }__CLR4_4_1uv6uv6lb90p9v3.R.inc(40370);double correction = fp / (delta * sum2);

            // depending on the sign of the function, update parl or paru.
            __CLR4_4_1uv6uv6lb90p9v3.R.inc(40371);if ((((fp > 0)&&(__CLR4_4_1uv6uv6lb90p9v3.R.iget(40372)!=0|true))||(__CLR4_4_1uv6uv6lb90p9v3.R.iget(40373)==0&false))) {{
                __CLR4_4_1uv6uv6lb90p9v3.R.inc(40374);parl = FastMath.max(parl, lmPar);
            } }else {__CLR4_4_1uv6uv6lb90p9v3.R.inc(40375);if ((((fp < 0)&&(__CLR4_4_1uv6uv6lb90p9v3.R.iget(40376)!=0|true))||(__CLR4_4_1uv6uv6lb90p9v3.R.iget(40377)==0&false))) {{
                __CLR4_4_1uv6uv6lb90p9v3.R.inc(40378);paru = FastMath.min(paru, lmPar);
            }

            // compute an improved estimate for lmPar
            }}__CLR4_4_1uv6uv6lb90p9v3.R.inc(40379);lmPar = FastMath.max(parl, lmPar + correction);

        }
    }}finally{__CLR4_4_1uv6uv6lb90p9v3.R.flushNeeded();}}

    /**
     * Solve a*x = b and d*x = 0 in the least squares sense.
     * <p>This implementation is a translation in Java of the MINPACK
     * <a href="http://www.netlib.org/minpack/qrsolv.f">qrsolv</a>
     * routine.</p>
     * <p>This method sets the lmDir and lmDiag attributes.</p>
     * <p>The authors of the original fortran function are:</p>
     * <ul>
     *   <li>Argonne National Laboratory. MINPACK project. March 1980</li>
     *   <li>Burton  S. Garbow</li>
     *   <li>Kenneth E. Hillstrom</li>
     *   <li>Jorge   J. More</li>
     * </ul>
     * <p>Luc Maisonobe did the Java translation.</p>
     *
     * @param qy array containing qTy
     * @param diag diagonal matrix
     * @param lmDiag diagonal elements associated with lmDir
     * @param work work array
     */
    private void determineLMDirection(double[] qy, double[] diag,
                                      double[] lmDiag, double[] work) {try{__CLR4_4_1uv6uv6lb90p9v3.R.inc(40380);

        // copy R and Qty to preserve input and initialize s
        //  in particular, save the diagonal elements of R in lmDir
        __CLR4_4_1uv6uv6lb90p9v3.R.inc(40381);for (int j = 0; (((j < solvedCols)&&(__CLR4_4_1uv6uv6lb90p9v3.R.iget(40382)!=0|true))||(__CLR4_4_1uv6uv6lb90p9v3.R.iget(40383)==0&false)); ++j) {{
            __CLR4_4_1uv6uv6lb90p9v3.R.inc(40384);int pj = permutation[j];
            __CLR4_4_1uv6uv6lb90p9v3.R.inc(40385);for (int i = j + 1; (((i < solvedCols)&&(__CLR4_4_1uv6uv6lb90p9v3.R.iget(40386)!=0|true))||(__CLR4_4_1uv6uv6lb90p9v3.R.iget(40387)==0&false)); ++i) {{
                __CLR4_4_1uv6uv6lb90p9v3.R.inc(40388);weightedJacobian[i][pj] = weightedJacobian[j][permutation[i]];
            }
            }__CLR4_4_1uv6uv6lb90p9v3.R.inc(40389);lmDir[j] = diagR[pj];
            __CLR4_4_1uv6uv6lb90p9v3.R.inc(40390);work[j]  = qy[j];
        }

        // eliminate the diagonal matrix d using a Givens rotation
        }__CLR4_4_1uv6uv6lb90p9v3.R.inc(40391);for (int j = 0; (((j < solvedCols)&&(__CLR4_4_1uv6uv6lb90p9v3.R.iget(40392)!=0|true))||(__CLR4_4_1uv6uv6lb90p9v3.R.iget(40393)==0&false)); ++j) {{

            // prepare the row of d to be eliminated, locating the
            // diagonal element using p from the Q.R. factorization
            __CLR4_4_1uv6uv6lb90p9v3.R.inc(40394);int pj = permutation[j];
            __CLR4_4_1uv6uv6lb90p9v3.R.inc(40395);double dpj = diag[pj];
            __CLR4_4_1uv6uv6lb90p9v3.R.inc(40396);if ((((dpj != 0)&&(__CLR4_4_1uv6uv6lb90p9v3.R.iget(40397)!=0|true))||(__CLR4_4_1uv6uv6lb90p9v3.R.iget(40398)==0&false))) {{
                __CLR4_4_1uv6uv6lb90p9v3.R.inc(40399);Arrays.fill(lmDiag, j + 1, lmDiag.length, 0);
            }
            }__CLR4_4_1uv6uv6lb90p9v3.R.inc(40400);lmDiag[j] = dpj;

            //  the transformations to eliminate the row of d
            // modify only a single element of Qty
            // beyond the first n, which is initially zero.
            __CLR4_4_1uv6uv6lb90p9v3.R.inc(40401);double qtbpj = 0;
            __CLR4_4_1uv6uv6lb90p9v3.R.inc(40402);for (int k = j; (((k < solvedCols)&&(__CLR4_4_1uv6uv6lb90p9v3.R.iget(40403)!=0|true))||(__CLR4_4_1uv6uv6lb90p9v3.R.iget(40404)==0&false)); ++k) {{
                __CLR4_4_1uv6uv6lb90p9v3.R.inc(40405);int pk = permutation[k];

                // determine a Givens rotation which eliminates the
                // appropriate element in the current row of d
                __CLR4_4_1uv6uv6lb90p9v3.R.inc(40406);if ((((lmDiag[k] != 0)&&(__CLR4_4_1uv6uv6lb90p9v3.R.iget(40407)!=0|true))||(__CLR4_4_1uv6uv6lb90p9v3.R.iget(40408)==0&false))) {{

                    __CLR4_4_1uv6uv6lb90p9v3.R.inc(40409);final double sin;
                    __CLR4_4_1uv6uv6lb90p9v3.R.inc(40410);final double cos;
                    __CLR4_4_1uv6uv6lb90p9v3.R.inc(40411);double rkk = weightedJacobian[k][pk];
                    __CLR4_4_1uv6uv6lb90p9v3.R.inc(40412);if ((((FastMath.abs(rkk) < FastMath.abs(lmDiag[k]))&&(__CLR4_4_1uv6uv6lb90p9v3.R.iget(40413)!=0|true))||(__CLR4_4_1uv6uv6lb90p9v3.R.iget(40414)==0&false))) {{
                        __CLR4_4_1uv6uv6lb90p9v3.R.inc(40415);final double cotan = rkk / lmDiag[k];
                        __CLR4_4_1uv6uv6lb90p9v3.R.inc(40416);sin   = 1.0 / FastMath.sqrt(1.0 + cotan * cotan);
                        __CLR4_4_1uv6uv6lb90p9v3.R.inc(40417);cos   = sin * cotan;
                    } }else {{
                        __CLR4_4_1uv6uv6lb90p9v3.R.inc(40418);final double tan = lmDiag[k] / rkk;
                        __CLR4_4_1uv6uv6lb90p9v3.R.inc(40419);cos = 1.0 / FastMath.sqrt(1.0 + tan * tan);
                        __CLR4_4_1uv6uv6lb90p9v3.R.inc(40420);sin = cos * tan;
                    }

                    // compute the modified diagonal element of R and
                    // the modified element of (Qty,0)
                    }__CLR4_4_1uv6uv6lb90p9v3.R.inc(40421);weightedJacobian[k][pk] = cos * rkk + sin * lmDiag[k];
                    __CLR4_4_1uv6uv6lb90p9v3.R.inc(40422);final double temp = cos * work[k] + sin * qtbpj;
                    __CLR4_4_1uv6uv6lb90p9v3.R.inc(40423);qtbpj = -sin * work[k] + cos * qtbpj;
                    __CLR4_4_1uv6uv6lb90p9v3.R.inc(40424);work[k] = temp;

                    // accumulate the tranformation in the row of s
                    __CLR4_4_1uv6uv6lb90p9v3.R.inc(40425);for (int i = k + 1; (((i < solvedCols)&&(__CLR4_4_1uv6uv6lb90p9v3.R.iget(40426)!=0|true))||(__CLR4_4_1uv6uv6lb90p9v3.R.iget(40427)==0&false)); ++i) {{
                        __CLR4_4_1uv6uv6lb90p9v3.R.inc(40428);double rik = weightedJacobian[i][pk];
                        __CLR4_4_1uv6uv6lb90p9v3.R.inc(40429);final double temp2 = cos * rik + sin * lmDiag[i];
                        __CLR4_4_1uv6uv6lb90p9v3.R.inc(40430);lmDiag[i] = -sin * rik + cos * lmDiag[i];
                        __CLR4_4_1uv6uv6lb90p9v3.R.inc(40431);weightedJacobian[i][pk] = temp2;
                    }
                }}
            }}

            // store the diagonal element of s and restore
            // the corresponding diagonal element of R
            }__CLR4_4_1uv6uv6lb90p9v3.R.inc(40432);lmDiag[j] = weightedJacobian[j][permutation[j]];
            __CLR4_4_1uv6uv6lb90p9v3.R.inc(40433);weightedJacobian[j][permutation[j]] = lmDir[j];
        }

        // solve the triangular system for z, if the system is
        // singular, then obtain a least squares solution
        }__CLR4_4_1uv6uv6lb90p9v3.R.inc(40434);int nSing = solvedCols;
        __CLR4_4_1uv6uv6lb90p9v3.R.inc(40435);for (int j = 0; (((j < solvedCols)&&(__CLR4_4_1uv6uv6lb90p9v3.R.iget(40436)!=0|true))||(__CLR4_4_1uv6uv6lb90p9v3.R.iget(40437)==0&false)); ++j) {{
            __CLR4_4_1uv6uv6lb90p9v3.R.inc(40438);if (((((lmDiag[j] == 0) && (nSing == solvedCols))&&(__CLR4_4_1uv6uv6lb90p9v3.R.iget(40439)!=0|true))||(__CLR4_4_1uv6uv6lb90p9v3.R.iget(40440)==0&false))) {{
                __CLR4_4_1uv6uv6lb90p9v3.R.inc(40441);nSing = j;
            }
            }__CLR4_4_1uv6uv6lb90p9v3.R.inc(40442);if ((((nSing < solvedCols)&&(__CLR4_4_1uv6uv6lb90p9v3.R.iget(40443)!=0|true))||(__CLR4_4_1uv6uv6lb90p9v3.R.iget(40444)==0&false))) {{
                __CLR4_4_1uv6uv6lb90p9v3.R.inc(40445);work[j] = 0;
            }
        }}
        }__CLR4_4_1uv6uv6lb90p9v3.R.inc(40446);if ((((nSing > 0)&&(__CLR4_4_1uv6uv6lb90p9v3.R.iget(40447)!=0|true))||(__CLR4_4_1uv6uv6lb90p9v3.R.iget(40448)==0&false))) {{
            __CLR4_4_1uv6uv6lb90p9v3.R.inc(40449);for (int j = nSing - 1; (((j >= 0)&&(__CLR4_4_1uv6uv6lb90p9v3.R.iget(40450)!=0|true))||(__CLR4_4_1uv6uv6lb90p9v3.R.iget(40451)==0&false)); --j) {{
                __CLR4_4_1uv6uv6lb90p9v3.R.inc(40452);int pj = permutation[j];
                __CLR4_4_1uv6uv6lb90p9v3.R.inc(40453);double sum = 0;
                __CLR4_4_1uv6uv6lb90p9v3.R.inc(40454);for (int i = j + 1; (((i < nSing)&&(__CLR4_4_1uv6uv6lb90p9v3.R.iget(40455)!=0|true))||(__CLR4_4_1uv6uv6lb90p9v3.R.iget(40456)==0&false)); ++i) {{
                    __CLR4_4_1uv6uv6lb90p9v3.R.inc(40457);sum += weightedJacobian[i][pj] * work[i];
                }
                }__CLR4_4_1uv6uv6lb90p9v3.R.inc(40458);work[j] = (work[j] - sum) / lmDiag[j];
            }
        }}

        // permute the components of z back to components of lmDir
        }__CLR4_4_1uv6uv6lb90p9v3.R.inc(40459);for (int j = 0; (((j < lmDir.length)&&(__CLR4_4_1uv6uv6lb90p9v3.R.iget(40460)!=0|true))||(__CLR4_4_1uv6uv6lb90p9v3.R.iget(40461)==0&false)); ++j) {{
            __CLR4_4_1uv6uv6lb90p9v3.R.inc(40462);lmDir[permutation[j]] = work[j];
        }
    }}finally{__CLR4_4_1uv6uv6lb90p9v3.R.flushNeeded();}}

    /**
     * Decompose a matrix A as A.P = Q.R using Householder transforms.
     * <p>As suggested in the P. Lascaux and R. Theodor book
     * <i>Analyse num&eacute;rique matricielle appliqu&eacute;e &agrave;
     * l'art de l'ing&eacute;nieur</i> (Masson, 1986), instead of representing
     * the Householder transforms with u<sub>k</sub> unit vectors such that:
     * <pre>
     * H<sub>k</sub> = I - 2u<sub>k</sub>.u<sub>k</sub><sup>t</sup>
     * </pre>
     * we use <sub>k</sub> non-unit vectors such that:
     * <pre>
     * H<sub>k</sub> = I - beta<sub>k</sub>v<sub>k</sub>.v<sub>k</sub><sup>t</sup>
     * </pre>
     * where v<sub>k</sub> = a<sub>k</sub> - alpha<sub>k</sub> e<sub>k</sub>.
     * The beta<sub>k</sub> coefficients are provided upon exit as recomputing
     * them from the v<sub>k</sub> vectors would be costly.</p>
     * <p>This decomposition handles rank deficient cases since the tranformations
     * are performed in non-increasing columns norms order thanks to columns
     * pivoting. The diagonal elements of the R matrix are therefore also in
     * non-increasing absolute values order.</p>
     *
     * @param jacobian Weighted Jacobian matrix at the current point.
     * @exception ConvergenceException if the decomposition cannot be performed
     */
    private void qrDecomposition(RealMatrix jacobian) throws ConvergenceException {try{__CLR4_4_1uv6uv6lb90p9v3.R.inc(40463);
        // Code in this class assumes that the weighted Jacobian is -(W^(1/2) J),
        // hence the multiplication by -1.
        __CLR4_4_1uv6uv6lb90p9v3.R.inc(40464);weightedJacobian = jacobian.scalarMultiply(-1).getData();

        __CLR4_4_1uv6uv6lb90p9v3.R.inc(40465);final int nR = weightedJacobian.length;
        __CLR4_4_1uv6uv6lb90p9v3.R.inc(40466);final int nC = weightedJacobian[0].length;

        // initializations
        __CLR4_4_1uv6uv6lb90p9v3.R.inc(40467);for (int k = 0; (((k < nC)&&(__CLR4_4_1uv6uv6lb90p9v3.R.iget(40468)!=0|true))||(__CLR4_4_1uv6uv6lb90p9v3.R.iget(40469)==0&false)); ++k) {{
            __CLR4_4_1uv6uv6lb90p9v3.R.inc(40470);permutation[k] = k;
            __CLR4_4_1uv6uv6lb90p9v3.R.inc(40471);double norm2 = 0;
            __CLR4_4_1uv6uv6lb90p9v3.R.inc(40472);for (int i = 0; (((i < nR)&&(__CLR4_4_1uv6uv6lb90p9v3.R.iget(40473)!=0|true))||(__CLR4_4_1uv6uv6lb90p9v3.R.iget(40474)==0&false)); ++i) {{
                __CLR4_4_1uv6uv6lb90p9v3.R.inc(40475);double akk = weightedJacobian[i][k];
                __CLR4_4_1uv6uv6lb90p9v3.R.inc(40476);norm2 += akk * akk;
            }
            }__CLR4_4_1uv6uv6lb90p9v3.R.inc(40477);jacNorm[k] = FastMath.sqrt(norm2);
        }

        // transform the matrix column after column
        }__CLR4_4_1uv6uv6lb90p9v3.R.inc(40478);for (int k = 0; (((k < nC)&&(__CLR4_4_1uv6uv6lb90p9v3.R.iget(40479)!=0|true))||(__CLR4_4_1uv6uv6lb90p9v3.R.iget(40480)==0&false)); ++k) {{

            // select the column with the greatest norm on active components
            __CLR4_4_1uv6uv6lb90p9v3.R.inc(40481);int nextColumn = -1;
            __CLR4_4_1uv6uv6lb90p9v3.R.inc(40482);double ak2 = Double.NEGATIVE_INFINITY;
            __CLR4_4_1uv6uv6lb90p9v3.R.inc(40483);for (int i = k; (((i < nC)&&(__CLR4_4_1uv6uv6lb90p9v3.R.iget(40484)!=0|true))||(__CLR4_4_1uv6uv6lb90p9v3.R.iget(40485)==0&false)); ++i) {{
                __CLR4_4_1uv6uv6lb90p9v3.R.inc(40486);double norm2 = 0;
                __CLR4_4_1uv6uv6lb90p9v3.R.inc(40487);for (int j = k; (((j < nR)&&(__CLR4_4_1uv6uv6lb90p9v3.R.iget(40488)!=0|true))||(__CLR4_4_1uv6uv6lb90p9v3.R.iget(40489)==0&false)); ++j) {{
                    __CLR4_4_1uv6uv6lb90p9v3.R.inc(40490);double aki = weightedJacobian[j][permutation[i]];
                    __CLR4_4_1uv6uv6lb90p9v3.R.inc(40491);norm2 += aki * aki;
                }
                }__CLR4_4_1uv6uv6lb90p9v3.R.inc(40492);if ((((Double.isInfinite(norm2) || Double.isNaN(norm2))&&(__CLR4_4_1uv6uv6lb90p9v3.R.iget(40493)!=0|true))||(__CLR4_4_1uv6uv6lb90p9v3.R.iget(40494)==0&false))) {{
                    __CLR4_4_1uv6uv6lb90p9v3.R.inc(40495);throw new ConvergenceException(LocalizedFormats.UNABLE_TO_PERFORM_QR_DECOMPOSITION_ON_JACOBIAN,
                                                   nR, nC);
                }
                }__CLR4_4_1uv6uv6lb90p9v3.R.inc(40496);if ((((norm2 > ak2)&&(__CLR4_4_1uv6uv6lb90p9v3.R.iget(40497)!=0|true))||(__CLR4_4_1uv6uv6lb90p9v3.R.iget(40498)==0&false))) {{
                    __CLR4_4_1uv6uv6lb90p9v3.R.inc(40499);nextColumn = i;
                    __CLR4_4_1uv6uv6lb90p9v3.R.inc(40500);ak2        = norm2;
                }
            }}
            }__CLR4_4_1uv6uv6lb90p9v3.R.inc(40501);if ((((ak2 <= qrRankingThreshold)&&(__CLR4_4_1uv6uv6lb90p9v3.R.iget(40502)!=0|true))||(__CLR4_4_1uv6uv6lb90p9v3.R.iget(40503)==0&false))) {{
                __CLR4_4_1uv6uv6lb90p9v3.R.inc(40504);rank = k;
                __CLR4_4_1uv6uv6lb90p9v3.R.inc(40505);return;
            }
            }__CLR4_4_1uv6uv6lb90p9v3.R.inc(40506);int pk                  = permutation[nextColumn];
            __CLR4_4_1uv6uv6lb90p9v3.R.inc(40507);permutation[nextColumn] = permutation[k];
            __CLR4_4_1uv6uv6lb90p9v3.R.inc(40508);permutation[k]          = pk;

            // choose alpha such that Hk.u = alpha ek
            __CLR4_4_1uv6uv6lb90p9v3.R.inc(40509);double akk   = weightedJacobian[k][pk];
            __CLR4_4_1uv6uv6lb90p9v3.R.inc(40510);double alpha = ((((akk > 0) )&&(__CLR4_4_1uv6uv6lb90p9v3.R.iget(40511)!=0|true))||(__CLR4_4_1uv6uv6lb90p9v3.R.iget(40512)==0&false))? -FastMath.sqrt(ak2) : FastMath.sqrt(ak2);
            __CLR4_4_1uv6uv6lb90p9v3.R.inc(40513);double betak = 1.0 / (ak2 - akk * alpha);
            __CLR4_4_1uv6uv6lb90p9v3.R.inc(40514);beta[pk]     = betak;

            // transform the current column
            __CLR4_4_1uv6uv6lb90p9v3.R.inc(40515);diagR[pk]        = alpha;
            __CLR4_4_1uv6uv6lb90p9v3.R.inc(40516);weightedJacobian[k][pk] -= alpha;

            // transform the remaining columns
            __CLR4_4_1uv6uv6lb90p9v3.R.inc(40517);for (int dk = nC - 1 - k; (((dk > 0)&&(__CLR4_4_1uv6uv6lb90p9v3.R.iget(40518)!=0|true))||(__CLR4_4_1uv6uv6lb90p9v3.R.iget(40519)==0&false)); --dk) {{
                __CLR4_4_1uv6uv6lb90p9v3.R.inc(40520);double gamma = 0;
                __CLR4_4_1uv6uv6lb90p9v3.R.inc(40521);for (int j = k; (((j < nR)&&(__CLR4_4_1uv6uv6lb90p9v3.R.iget(40522)!=0|true))||(__CLR4_4_1uv6uv6lb90p9v3.R.iget(40523)==0&false)); ++j) {{
                    __CLR4_4_1uv6uv6lb90p9v3.R.inc(40524);gamma += weightedJacobian[j][pk] * weightedJacobian[j][permutation[k + dk]];
                }
                }__CLR4_4_1uv6uv6lb90p9v3.R.inc(40525);gamma *= betak;
                __CLR4_4_1uv6uv6lb90p9v3.R.inc(40526);for (int j = k; (((j < nR)&&(__CLR4_4_1uv6uv6lb90p9v3.R.iget(40527)!=0|true))||(__CLR4_4_1uv6uv6lb90p9v3.R.iget(40528)==0&false)); ++j) {{
                    __CLR4_4_1uv6uv6lb90p9v3.R.inc(40529);weightedJacobian[j][permutation[k + dk]] -= gamma * weightedJacobian[j][pk];
                }
            }}
        }}
        }__CLR4_4_1uv6uv6lb90p9v3.R.inc(40530);rank = solvedCols;
    }finally{__CLR4_4_1uv6uv6lb90p9v3.R.flushNeeded();}}

    /**
     * Compute the product Qt.y for some Q.R. decomposition.
     *
     * @param y vector to multiply (will be overwritten with the result)
     */
    private void qTy(double[] y) {try{__CLR4_4_1uv6uv6lb90p9v3.R.inc(40531);
        __CLR4_4_1uv6uv6lb90p9v3.R.inc(40532);final int nR = weightedJacobian.length;
        __CLR4_4_1uv6uv6lb90p9v3.R.inc(40533);final int nC = weightedJacobian[0].length;

        __CLR4_4_1uv6uv6lb90p9v3.R.inc(40534);for (int k = 0; (((k < nC)&&(__CLR4_4_1uv6uv6lb90p9v3.R.iget(40535)!=0|true))||(__CLR4_4_1uv6uv6lb90p9v3.R.iget(40536)==0&false)); ++k) {{
            __CLR4_4_1uv6uv6lb90p9v3.R.inc(40537);int pk = permutation[k];
            __CLR4_4_1uv6uv6lb90p9v3.R.inc(40538);double gamma = 0;
            __CLR4_4_1uv6uv6lb90p9v3.R.inc(40539);for (int i = k; (((i < nR)&&(__CLR4_4_1uv6uv6lb90p9v3.R.iget(40540)!=0|true))||(__CLR4_4_1uv6uv6lb90p9v3.R.iget(40541)==0&false)); ++i) {{
                __CLR4_4_1uv6uv6lb90p9v3.R.inc(40542);gamma += weightedJacobian[i][pk] * y[i];
            }
            }__CLR4_4_1uv6uv6lb90p9v3.R.inc(40543);gamma *= beta[pk];
            __CLR4_4_1uv6uv6lb90p9v3.R.inc(40544);for (int i = k; (((i < nR)&&(__CLR4_4_1uv6uv6lb90p9v3.R.iget(40545)!=0|true))||(__CLR4_4_1uv6uv6lb90p9v3.R.iget(40546)==0&false)); ++i) {{
                __CLR4_4_1uv6uv6lb90p9v3.R.inc(40547);y[i] -= gamma * weightedJacobian[i][pk];
            }
        }}
    }}finally{__CLR4_4_1uv6uv6lb90p9v3.R.flushNeeded();}}

    /**
     * @throws MathUnsupportedOperationException if bounds were passed to the
     * {@link #optimize(OptimizationData[]) optimize} method.
     */
    private void checkParameters() {try{__CLR4_4_1uv6uv6lb90p9v3.R.inc(40548);
        __CLR4_4_1uv6uv6lb90p9v3.R.inc(40549);if ((((getLowerBound() != null ||
            getUpperBound() != null)&&(__CLR4_4_1uv6uv6lb90p9v3.R.iget(40550)!=0|true))||(__CLR4_4_1uv6uv6lb90p9v3.R.iget(40551)==0&false))) {{
            __CLR4_4_1uv6uv6lb90p9v3.R.inc(40552);throw new MathUnsupportedOperationException(LocalizedFormats.CONSTRAINT);
        }
    }}finally{__CLR4_4_1uv6uv6lb90p9v3.R.flushNeeded();}}
}
