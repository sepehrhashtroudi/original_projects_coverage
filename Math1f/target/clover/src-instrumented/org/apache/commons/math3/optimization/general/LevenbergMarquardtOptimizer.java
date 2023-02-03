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

import java.util.Arrays;

import org.apache.commons.math3.exception.ConvergenceException;
import org.apache.commons.math3.exception.util.LocalizedFormats;
import org.apache.commons.math3.optimization.PointVectorValuePair;
import org.apache.commons.math3.optimization.ConvergenceChecker;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.util.Precision;
import org.apache.commons.math3.util.FastMath;


/**
 * This class solves a least squares problem using the Levenberg-Marquardt algorithm.
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
 * @version $Id$
 * @deprecated As of 3.1 (to be removed in 4.0).
 * @since 2.0
 *
 */
@Deprecated
public class LevenbergMarquardtOptimizer extends AbstractLeastSquaresOptimizer {public static class __CLR4_4_1yy7yy7lb90pa5e{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,45844,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
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
        this(100, 1e-10, 1e-10, 1e-10, Precision.SAFE_MIN);__CLR4_4_1yy7yy7lb90pa5e.R.inc(45296);try{__CLR4_4_1yy7yy7lb90pa5e.R.inc(45295);
    }finally{__CLR4_4_1yy7yy7lb90pa5e.R.flushNeeded();}}

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
        this(100, checker, 1e-10, 1e-10, 1e-10, Precision.SAFE_MIN);__CLR4_4_1yy7yy7lb90pa5e.R.inc(45298);try{__CLR4_4_1yy7yy7lb90pa5e.R.inc(45297);
    }finally{__CLR4_4_1yy7yy7lb90pa5e.R.flushNeeded();}}

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
        super(checker);__CLR4_4_1yy7yy7lb90pa5e.R.inc(45300);try{__CLR4_4_1yy7yy7lb90pa5e.R.inc(45299);
        __CLR4_4_1yy7yy7lb90pa5e.R.inc(45301);this.initialStepBoundFactor = initialStepBoundFactor;
        __CLR4_4_1yy7yy7lb90pa5e.R.inc(45302);this.costRelativeTolerance = costRelativeTolerance;
        __CLR4_4_1yy7yy7lb90pa5e.R.inc(45303);this.parRelativeTolerance = parRelativeTolerance;
        __CLR4_4_1yy7yy7lb90pa5e.R.inc(45304);this.orthoTolerance = orthoTolerance;
        __CLR4_4_1yy7yy7lb90pa5e.R.inc(45305);this.qrRankingThreshold = threshold;
    }finally{__CLR4_4_1yy7yy7lb90pa5e.R.flushNeeded();}}

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
             Precision.SAFE_MIN);__CLR4_4_1yy7yy7lb90pa5e.R.inc(45307);try{__CLR4_4_1yy7yy7lb90pa5e.R.inc(45306);
    }finally{__CLR4_4_1yy7yy7lb90pa5e.R.flushNeeded();}}

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
        super(null);__CLR4_4_1yy7yy7lb90pa5e.R.inc(45309);try{__CLR4_4_1yy7yy7lb90pa5e.R.inc(45308); // No custom convergence criterion.
        __CLR4_4_1yy7yy7lb90pa5e.R.inc(45310);this.initialStepBoundFactor = initialStepBoundFactor;
        __CLR4_4_1yy7yy7lb90pa5e.R.inc(45311);this.costRelativeTolerance = costRelativeTolerance;
        __CLR4_4_1yy7yy7lb90pa5e.R.inc(45312);this.parRelativeTolerance = parRelativeTolerance;
        __CLR4_4_1yy7yy7lb90pa5e.R.inc(45313);this.orthoTolerance = orthoTolerance;
        __CLR4_4_1yy7yy7lb90pa5e.R.inc(45314);this.qrRankingThreshold = threshold;
    }finally{__CLR4_4_1yy7yy7lb90pa5e.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    protected PointVectorValuePair doOptimize() {try{__CLR4_4_1yy7yy7lb90pa5e.R.inc(45315);
        __CLR4_4_1yy7yy7lb90pa5e.R.inc(45316);final int nR = getTarget().length; // Number of observed data.
        __CLR4_4_1yy7yy7lb90pa5e.R.inc(45317);final double[] currentPoint = getStartPoint();
        __CLR4_4_1yy7yy7lb90pa5e.R.inc(45318);final int nC = currentPoint.length; // Number of parameters.

        // arrays shared with the other private methods
        __CLR4_4_1yy7yy7lb90pa5e.R.inc(45319);solvedCols  = FastMath.min(nR, nC);
        __CLR4_4_1yy7yy7lb90pa5e.R.inc(45320);diagR       = new double[nC];
        __CLR4_4_1yy7yy7lb90pa5e.R.inc(45321);jacNorm     = new double[nC];
        __CLR4_4_1yy7yy7lb90pa5e.R.inc(45322);beta        = new double[nC];
        __CLR4_4_1yy7yy7lb90pa5e.R.inc(45323);permutation = new int[nC];
        __CLR4_4_1yy7yy7lb90pa5e.R.inc(45324);lmDir       = new double[nC];

        // local point
        __CLR4_4_1yy7yy7lb90pa5e.R.inc(45325);double   delta   = 0;
        __CLR4_4_1yy7yy7lb90pa5e.R.inc(45326);double   xNorm   = 0;
        __CLR4_4_1yy7yy7lb90pa5e.R.inc(45327);double[] diag    = new double[nC];
        __CLR4_4_1yy7yy7lb90pa5e.R.inc(45328);double[] oldX    = new double[nC];
        __CLR4_4_1yy7yy7lb90pa5e.R.inc(45329);double[] oldRes  = new double[nR];
        __CLR4_4_1yy7yy7lb90pa5e.R.inc(45330);double[] oldObj  = new double[nR];
        __CLR4_4_1yy7yy7lb90pa5e.R.inc(45331);double[] qtf     = new double[nR];
        __CLR4_4_1yy7yy7lb90pa5e.R.inc(45332);double[] work1   = new double[nC];
        __CLR4_4_1yy7yy7lb90pa5e.R.inc(45333);double[] work2   = new double[nC];
        __CLR4_4_1yy7yy7lb90pa5e.R.inc(45334);double[] work3   = new double[nC];

        __CLR4_4_1yy7yy7lb90pa5e.R.inc(45335);final RealMatrix weightMatrixSqrt = getWeightSquareRoot();

        // Evaluate the function at the starting point and calculate its norm.
        __CLR4_4_1yy7yy7lb90pa5e.R.inc(45336);double[] currentObjective = computeObjectiveValue(currentPoint);
        __CLR4_4_1yy7yy7lb90pa5e.R.inc(45337);double[] currentResiduals = computeResiduals(currentObjective);
        __CLR4_4_1yy7yy7lb90pa5e.R.inc(45338);PointVectorValuePair current = new PointVectorValuePair(currentPoint, currentObjective);
        __CLR4_4_1yy7yy7lb90pa5e.R.inc(45339);double currentCost = computeCost(currentResiduals);

        // Outer loop.
        __CLR4_4_1yy7yy7lb90pa5e.R.inc(45340);lmPar = 0;
        __CLR4_4_1yy7yy7lb90pa5e.R.inc(45341);boolean firstIteration = true;
        __CLR4_4_1yy7yy7lb90pa5e.R.inc(45342);int iter = 0;
        __CLR4_4_1yy7yy7lb90pa5e.R.inc(45343);final ConvergenceChecker<PointVectorValuePair> checker = getConvergenceChecker();
        __CLR4_4_1yy7yy7lb90pa5e.R.inc(45344);while (true) {{
            __CLR4_4_1yy7yy7lb90pa5e.R.inc(45345);++iter;
            __CLR4_4_1yy7yy7lb90pa5e.R.inc(45346);final PointVectorValuePair previous = current;

            // QR decomposition of the jacobian matrix
            __CLR4_4_1yy7yy7lb90pa5e.R.inc(45347);qrDecomposition(computeWeightedJacobian(currentPoint));

            __CLR4_4_1yy7yy7lb90pa5e.R.inc(45348);weightedResidual = weightMatrixSqrt.operate(currentResiduals);
            __CLR4_4_1yy7yy7lb90pa5e.R.inc(45349);for (int i = 0; (((i < nR)&&(__CLR4_4_1yy7yy7lb90pa5e.R.iget(45350)!=0|true))||(__CLR4_4_1yy7yy7lb90pa5e.R.iget(45351)==0&false)); i++) {{
                __CLR4_4_1yy7yy7lb90pa5e.R.inc(45352);qtf[i] = weightedResidual[i];
            }

            // compute Qt.res
            }__CLR4_4_1yy7yy7lb90pa5e.R.inc(45353);qTy(qtf);

            // now we don't need Q anymore,
            // so let jacobian contain the R matrix with its diagonal elements
            __CLR4_4_1yy7yy7lb90pa5e.R.inc(45354);for (int k = 0; (((k < solvedCols)&&(__CLR4_4_1yy7yy7lb90pa5e.R.iget(45355)!=0|true))||(__CLR4_4_1yy7yy7lb90pa5e.R.iget(45356)==0&false)); ++k) {{
                __CLR4_4_1yy7yy7lb90pa5e.R.inc(45357);int pk = permutation[k];
                __CLR4_4_1yy7yy7lb90pa5e.R.inc(45358);weightedJacobian[k][pk] = diagR[pk];
            }

            }__CLR4_4_1yy7yy7lb90pa5e.R.inc(45359);if ((((firstIteration)&&(__CLR4_4_1yy7yy7lb90pa5e.R.iget(45360)!=0|true))||(__CLR4_4_1yy7yy7lb90pa5e.R.iget(45361)==0&false))) {{
                // scale the point according to the norms of the columns
                // of the initial jacobian
                __CLR4_4_1yy7yy7lb90pa5e.R.inc(45362);xNorm = 0;
                __CLR4_4_1yy7yy7lb90pa5e.R.inc(45363);for (int k = 0; (((k < nC)&&(__CLR4_4_1yy7yy7lb90pa5e.R.iget(45364)!=0|true))||(__CLR4_4_1yy7yy7lb90pa5e.R.iget(45365)==0&false)); ++k) {{
                    __CLR4_4_1yy7yy7lb90pa5e.R.inc(45366);double dk = jacNorm[k];
                    __CLR4_4_1yy7yy7lb90pa5e.R.inc(45367);if ((((dk == 0)&&(__CLR4_4_1yy7yy7lb90pa5e.R.iget(45368)!=0|true))||(__CLR4_4_1yy7yy7lb90pa5e.R.iget(45369)==0&false))) {{
                        __CLR4_4_1yy7yy7lb90pa5e.R.inc(45370);dk = 1.0;
                    }
                    }__CLR4_4_1yy7yy7lb90pa5e.R.inc(45371);double xk = dk * currentPoint[k];
                    __CLR4_4_1yy7yy7lb90pa5e.R.inc(45372);xNorm  += xk * xk;
                    __CLR4_4_1yy7yy7lb90pa5e.R.inc(45373);diag[k] = dk;
                }
                }__CLR4_4_1yy7yy7lb90pa5e.R.inc(45374);xNorm = FastMath.sqrt(xNorm);

                // initialize the step bound delta
                __CLR4_4_1yy7yy7lb90pa5e.R.inc(45375);delta = ((((xNorm == 0) )&&(__CLR4_4_1yy7yy7lb90pa5e.R.iget(45376)!=0|true))||(__CLR4_4_1yy7yy7lb90pa5e.R.iget(45377)==0&false))? initialStepBoundFactor : (initialStepBoundFactor * xNorm);
            }

            // check orthogonality between function vector and jacobian columns
            }__CLR4_4_1yy7yy7lb90pa5e.R.inc(45378);double maxCosine = 0;
            __CLR4_4_1yy7yy7lb90pa5e.R.inc(45379);if ((((currentCost != 0)&&(__CLR4_4_1yy7yy7lb90pa5e.R.iget(45380)!=0|true))||(__CLR4_4_1yy7yy7lb90pa5e.R.iget(45381)==0&false))) {{
                __CLR4_4_1yy7yy7lb90pa5e.R.inc(45382);for (int j = 0; (((j < solvedCols)&&(__CLR4_4_1yy7yy7lb90pa5e.R.iget(45383)!=0|true))||(__CLR4_4_1yy7yy7lb90pa5e.R.iget(45384)==0&false)); ++j) {{
                    __CLR4_4_1yy7yy7lb90pa5e.R.inc(45385);int    pj = permutation[j];
                    __CLR4_4_1yy7yy7lb90pa5e.R.inc(45386);double s  = jacNorm[pj];
                    __CLR4_4_1yy7yy7lb90pa5e.R.inc(45387);if ((((s != 0)&&(__CLR4_4_1yy7yy7lb90pa5e.R.iget(45388)!=0|true))||(__CLR4_4_1yy7yy7lb90pa5e.R.iget(45389)==0&false))) {{
                        __CLR4_4_1yy7yy7lb90pa5e.R.inc(45390);double sum = 0;
                        __CLR4_4_1yy7yy7lb90pa5e.R.inc(45391);for (int i = 0; (((i <= j)&&(__CLR4_4_1yy7yy7lb90pa5e.R.iget(45392)!=0|true))||(__CLR4_4_1yy7yy7lb90pa5e.R.iget(45393)==0&false)); ++i) {{
                            __CLR4_4_1yy7yy7lb90pa5e.R.inc(45394);sum += weightedJacobian[i][pj] * qtf[i];
                        }
                        }__CLR4_4_1yy7yy7lb90pa5e.R.inc(45395);maxCosine = FastMath.max(maxCosine, FastMath.abs(sum) / (s * currentCost));
                    }
                }}
            }}
            }__CLR4_4_1yy7yy7lb90pa5e.R.inc(45396);if ((((maxCosine <= orthoTolerance)&&(__CLR4_4_1yy7yy7lb90pa5e.R.iget(45397)!=0|true))||(__CLR4_4_1yy7yy7lb90pa5e.R.iget(45398)==0&false))) {{
                // Convergence has been reached.
                __CLR4_4_1yy7yy7lb90pa5e.R.inc(45399);setCost(currentCost);
                // Update (deprecated) "point" field.
                __CLR4_4_1yy7yy7lb90pa5e.R.inc(45400);point = current.getPoint();
                __CLR4_4_1yy7yy7lb90pa5e.R.inc(45401);return current;
            }

            // rescale if necessary
            }__CLR4_4_1yy7yy7lb90pa5e.R.inc(45402);for (int j = 0; (((j < nC)&&(__CLR4_4_1yy7yy7lb90pa5e.R.iget(45403)!=0|true))||(__CLR4_4_1yy7yy7lb90pa5e.R.iget(45404)==0&false)); ++j) {{
                __CLR4_4_1yy7yy7lb90pa5e.R.inc(45405);diag[j] = FastMath.max(diag[j], jacNorm[j]);
            }

            // Inner loop.
            }__CLR4_4_1yy7yy7lb90pa5e.R.inc(45406);for (double ratio = 0; (((ratio < 1.0e-4)&&(__CLR4_4_1yy7yy7lb90pa5e.R.iget(45407)!=0|true))||(__CLR4_4_1yy7yy7lb90pa5e.R.iget(45408)==0&false));) {{

                // save the state
                __CLR4_4_1yy7yy7lb90pa5e.R.inc(45409);for (int j = 0; (((j < solvedCols)&&(__CLR4_4_1yy7yy7lb90pa5e.R.iget(45410)!=0|true))||(__CLR4_4_1yy7yy7lb90pa5e.R.iget(45411)==0&false)); ++j) {{
                    __CLR4_4_1yy7yy7lb90pa5e.R.inc(45412);int pj = permutation[j];
                    __CLR4_4_1yy7yy7lb90pa5e.R.inc(45413);oldX[pj] = currentPoint[pj];
                }
                }__CLR4_4_1yy7yy7lb90pa5e.R.inc(45414);final double previousCost = currentCost;
                __CLR4_4_1yy7yy7lb90pa5e.R.inc(45415);double[] tmpVec = weightedResidual;
                __CLR4_4_1yy7yy7lb90pa5e.R.inc(45416);weightedResidual = oldRes;
                __CLR4_4_1yy7yy7lb90pa5e.R.inc(45417);oldRes    = tmpVec;
                __CLR4_4_1yy7yy7lb90pa5e.R.inc(45418);tmpVec    = currentObjective;
                __CLR4_4_1yy7yy7lb90pa5e.R.inc(45419);currentObjective = oldObj;
                __CLR4_4_1yy7yy7lb90pa5e.R.inc(45420);oldObj    = tmpVec;

                // determine the Levenberg-Marquardt parameter
                __CLR4_4_1yy7yy7lb90pa5e.R.inc(45421);determineLMParameter(qtf, delta, diag, work1, work2, work3);

                // compute the new point and the norm of the evolution direction
                __CLR4_4_1yy7yy7lb90pa5e.R.inc(45422);double lmNorm = 0;
                __CLR4_4_1yy7yy7lb90pa5e.R.inc(45423);for (int j = 0; (((j < solvedCols)&&(__CLR4_4_1yy7yy7lb90pa5e.R.iget(45424)!=0|true))||(__CLR4_4_1yy7yy7lb90pa5e.R.iget(45425)==0&false)); ++j) {{
                    __CLR4_4_1yy7yy7lb90pa5e.R.inc(45426);int pj = permutation[j];
                    __CLR4_4_1yy7yy7lb90pa5e.R.inc(45427);lmDir[pj] = -lmDir[pj];
                    __CLR4_4_1yy7yy7lb90pa5e.R.inc(45428);currentPoint[pj] = oldX[pj] + lmDir[pj];
                    __CLR4_4_1yy7yy7lb90pa5e.R.inc(45429);double s = diag[pj] * lmDir[pj];
                    __CLR4_4_1yy7yy7lb90pa5e.R.inc(45430);lmNorm  += s * s;
                }
                }__CLR4_4_1yy7yy7lb90pa5e.R.inc(45431);lmNorm = FastMath.sqrt(lmNorm);
                // on the first iteration, adjust the initial step bound.
                __CLR4_4_1yy7yy7lb90pa5e.R.inc(45432);if ((((firstIteration)&&(__CLR4_4_1yy7yy7lb90pa5e.R.iget(45433)!=0|true))||(__CLR4_4_1yy7yy7lb90pa5e.R.iget(45434)==0&false))) {{
                    __CLR4_4_1yy7yy7lb90pa5e.R.inc(45435);delta = FastMath.min(delta, lmNorm);
                }

                // Evaluate the function at x + p and calculate its norm.
                }__CLR4_4_1yy7yy7lb90pa5e.R.inc(45436);currentObjective = computeObjectiveValue(currentPoint);
                __CLR4_4_1yy7yy7lb90pa5e.R.inc(45437);currentResiduals = computeResiduals(currentObjective);
                __CLR4_4_1yy7yy7lb90pa5e.R.inc(45438);current = new PointVectorValuePair(currentPoint, currentObjective);
                __CLR4_4_1yy7yy7lb90pa5e.R.inc(45439);currentCost = computeCost(currentResiduals);

                // compute the scaled actual reduction
                __CLR4_4_1yy7yy7lb90pa5e.R.inc(45440);double actRed = -1.0;
                __CLR4_4_1yy7yy7lb90pa5e.R.inc(45441);if ((((0.1 * currentCost < previousCost)&&(__CLR4_4_1yy7yy7lb90pa5e.R.iget(45442)!=0|true))||(__CLR4_4_1yy7yy7lb90pa5e.R.iget(45443)==0&false))) {{
                    __CLR4_4_1yy7yy7lb90pa5e.R.inc(45444);double r = currentCost / previousCost;
                    __CLR4_4_1yy7yy7lb90pa5e.R.inc(45445);actRed = 1.0 - r * r;
                }

                // compute the scaled predicted reduction
                // and the scaled directional derivative
                }__CLR4_4_1yy7yy7lb90pa5e.R.inc(45446);for (int j = 0; (((j < solvedCols)&&(__CLR4_4_1yy7yy7lb90pa5e.R.iget(45447)!=0|true))||(__CLR4_4_1yy7yy7lb90pa5e.R.iget(45448)==0&false)); ++j) {{
                    __CLR4_4_1yy7yy7lb90pa5e.R.inc(45449);int pj = permutation[j];
                    __CLR4_4_1yy7yy7lb90pa5e.R.inc(45450);double dirJ = lmDir[pj];
                    __CLR4_4_1yy7yy7lb90pa5e.R.inc(45451);work1[j] = 0;
                    __CLR4_4_1yy7yy7lb90pa5e.R.inc(45452);for (int i = 0; (((i <= j)&&(__CLR4_4_1yy7yy7lb90pa5e.R.iget(45453)!=0|true))||(__CLR4_4_1yy7yy7lb90pa5e.R.iget(45454)==0&false)); ++i) {{
                        __CLR4_4_1yy7yy7lb90pa5e.R.inc(45455);work1[i] += weightedJacobian[i][pj] * dirJ;
                    }
                }}
                }__CLR4_4_1yy7yy7lb90pa5e.R.inc(45456);double coeff1 = 0;
                __CLR4_4_1yy7yy7lb90pa5e.R.inc(45457);for (int j = 0; (((j < solvedCols)&&(__CLR4_4_1yy7yy7lb90pa5e.R.iget(45458)!=0|true))||(__CLR4_4_1yy7yy7lb90pa5e.R.iget(45459)==0&false)); ++j) {{
                    __CLR4_4_1yy7yy7lb90pa5e.R.inc(45460);coeff1 += work1[j] * work1[j];
                }
                }__CLR4_4_1yy7yy7lb90pa5e.R.inc(45461);double pc2 = previousCost * previousCost;
                __CLR4_4_1yy7yy7lb90pa5e.R.inc(45462);coeff1 = coeff1 / pc2;
                __CLR4_4_1yy7yy7lb90pa5e.R.inc(45463);double coeff2 = lmPar * lmNorm * lmNorm / pc2;
                __CLR4_4_1yy7yy7lb90pa5e.R.inc(45464);double preRed = coeff1 + 2 * coeff2;
                __CLR4_4_1yy7yy7lb90pa5e.R.inc(45465);double dirDer = -(coeff1 + coeff2);

                // ratio of the actual to the predicted reduction
                __CLR4_4_1yy7yy7lb90pa5e.R.inc(45466);ratio = ((((preRed == 0) )&&(__CLR4_4_1yy7yy7lb90pa5e.R.iget(45467)!=0|true))||(__CLR4_4_1yy7yy7lb90pa5e.R.iget(45468)==0&false))? 0 : (actRed / preRed);

                // update the step bound
                __CLR4_4_1yy7yy7lb90pa5e.R.inc(45469);if ((((ratio <= 0.25)&&(__CLR4_4_1yy7yy7lb90pa5e.R.iget(45470)!=0|true))||(__CLR4_4_1yy7yy7lb90pa5e.R.iget(45471)==0&false))) {{
                    __CLR4_4_1yy7yy7lb90pa5e.R.inc(45472);double tmp =
                        ((((actRed < 0) )&&(__CLR4_4_1yy7yy7lb90pa5e.R.iget(45473)!=0|true))||(__CLR4_4_1yy7yy7lb90pa5e.R.iget(45474)==0&false))? (0.5 * dirDer / (dirDer + 0.5 * actRed)) : 0.5;
                        __CLR4_4_1yy7yy7lb90pa5e.R.inc(45475);if (((((0.1 * currentCost >= previousCost) || (tmp < 0.1))&&(__CLR4_4_1yy7yy7lb90pa5e.R.iget(45476)!=0|true))||(__CLR4_4_1yy7yy7lb90pa5e.R.iget(45477)==0&false))) {{
                            __CLR4_4_1yy7yy7lb90pa5e.R.inc(45478);tmp = 0.1;
                        }
                        }__CLR4_4_1yy7yy7lb90pa5e.R.inc(45479);delta = tmp * FastMath.min(delta, 10.0 * lmNorm);
                        __CLR4_4_1yy7yy7lb90pa5e.R.inc(45480);lmPar /= tmp;
                } }else {__CLR4_4_1yy7yy7lb90pa5e.R.inc(45481);if (((((lmPar == 0) || (ratio >= 0.75))&&(__CLR4_4_1yy7yy7lb90pa5e.R.iget(45482)!=0|true))||(__CLR4_4_1yy7yy7lb90pa5e.R.iget(45483)==0&false))) {{
                    __CLR4_4_1yy7yy7lb90pa5e.R.inc(45484);delta = 2 * lmNorm;
                    __CLR4_4_1yy7yy7lb90pa5e.R.inc(45485);lmPar *= 0.5;
                }

                // test for successful iteration.
                }}__CLR4_4_1yy7yy7lb90pa5e.R.inc(45486);if ((((ratio >= 1.0e-4)&&(__CLR4_4_1yy7yy7lb90pa5e.R.iget(45487)!=0|true))||(__CLR4_4_1yy7yy7lb90pa5e.R.iget(45488)==0&false))) {{
                    // successful iteration, update the norm
                    __CLR4_4_1yy7yy7lb90pa5e.R.inc(45489);firstIteration = false;
                    __CLR4_4_1yy7yy7lb90pa5e.R.inc(45490);xNorm = 0;
                    __CLR4_4_1yy7yy7lb90pa5e.R.inc(45491);for (int k = 0; (((k < nC)&&(__CLR4_4_1yy7yy7lb90pa5e.R.iget(45492)!=0|true))||(__CLR4_4_1yy7yy7lb90pa5e.R.iget(45493)==0&false)); ++k) {{
                        __CLR4_4_1yy7yy7lb90pa5e.R.inc(45494);double xK = diag[k] * currentPoint[k];
                        __CLR4_4_1yy7yy7lb90pa5e.R.inc(45495);xNorm += xK * xK;
                    }
                    }__CLR4_4_1yy7yy7lb90pa5e.R.inc(45496);xNorm = FastMath.sqrt(xNorm);

                    // tests for convergence.
                    __CLR4_4_1yy7yy7lb90pa5e.R.inc(45497);if ((((checker != null && checker.converged(iter, previous, current))&&(__CLR4_4_1yy7yy7lb90pa5e.R.iget(45498)!=0|true))||(__CLR4_4_1yy7yy7lb90pa5e.R.iget(45499)==0&false))) {{
                        __CLR4_4_1yy7yy7lb90pa5e.R.inc(45500);setCost(currentCost);
                        // Update (deprecated) "point" field.
                        __CLR4_4_1yy7yy7lb90pa5e.R.inc(45501);point = current.getPoint();
                        __CLR4_4_1yy7yy7lb90pa5e.R.inc(45502);return current;
                    }
                }} }else {{
                    // failed iteration, reset the previous values
                    __CLR4_4_1yy7yy7lb90pa5e.R.inc(45503);currentCost = previousCost;
                    __CLR4_4_1yy7yy7lb90pa5e.R.inc(45504);for (int j = 0; (((j < solvedCols)&&(__CLR4_4_1yy7yy7lb90pa5e.R.iget(45505)!=0|true))||(__CLR4_4_1yy7yy7lb90pa5e.R.iget(45506)==0&false)); ++j) {{
                        __CLR4_4_1yy7yy7lb90pa5e.R.inc(45507);int pj = permutation[j];
                        __CLR4_4_1yy7yy7lb90pa5e.R.inc(45508);currentPoint[pj] = oldX[pj];
                    }
                    }__CLR4_4_1yy7yy7lb90pa5e.R.inc(45509);tmpVec    = weightedResidual;
                    __CLR4_4_1yy7yy7lb90pa5e.R.inc(45510);weightedResidual = oldRes;
                    __CLR4_4_1yy7yy7lb90pa5e.R.inc(45511);oldRes    = tmpVec;
                    __CLR4_4_1yy7yy7lb90pa5e.R.inc(45512);tmpVec    = currentObjective;
                    __CLR4_4_1yy7yy7lb90pa5e.R.inc(45513);currentObjective = oldObj;
                    __CLR4_4_1yy7yy7lb90pa5e.R.inc(45514);oldObj    = tmpVec;
                    // Reset "current" to previous values.
                    __CLR4_4_1yy7yy7lb90pa5e.R.inc(45515);current = new PointVectorValuePair(currentPoint, currentObjective);
                }

                // Default convergence criteria.
                }__CLR4_4_1yy7yy7lb90pa5e.R.inc(45516);if (((((FastMath.abs(actRed) <= costRelativeTolerance &&
                     preRed <= costRelativeTolerance &&
                     ratio <= 2.0) ||
                    delta <= parRelativeTolerance * xNorm)&&(__CLR4_4_1yy7yy7lb90pa5e.R.iget(45517)!=0|true))||(__CLR4_4_1yy7yy7lb90pa5e.R.iget(45518)==0&false))) {{
                    __CLR4_4_1yy7yy7lb90pa5e.R.inc(45519);setCost(currentCost);
                    // Update (deprecated) "point" field.
                    __CLR4_4_1yy7yy7lb90pa5e.R.inc(45520);point = current.getPoint();
                    __CLR4_4_1yy7yy7lb90pa5e.R.inc(45521);return current;
                }

                // tests for termination and stringent tolerances
                // (2.2204e-16 is the machine epsilon for IEEE754)
                }__CLR4_4_1yy7yy7lb90pa5e.R.inc(45522);if (((((FastMath.abs(actRed) <= 2.2204e-16) && (preRed <= 2.2204e-16) && (ratio <= 2.0))&&(__CLR4_4_1yy7yy7lb90pa5e.R.iget(45523)!=0|true))||(__CLR4_4_1yy7yy7lb90pa5e.R.iget(45524)==0&false))) {{
                    __CLR4_4_1yy7yy7lb90pa5e.R.inc(45525);throw new ConvergenceException(LocalizedFormats.TOO_SMALL_COST_RELATIVE_TOLERANCE,
                                                   costRelativeTolerance);
                } }else {__CLR4_4_1yy7yy7lb90pa5e.R.inc(45526);if ((((delta <= 2.2204e-16 * xNorm)&&(__CLR4_4_1yy7yy7lb90pa5e.R.iget(45527)!=0|true))||(__CLR4_4_1yy7yy7lb90pa5e.R.iget(45528)==0&false))) {{
                    __CLR4_4_1yy7yy7lb90pa5e.R.inc(45529);throw new ConvergenceException(LocalizedFormats.TOO_SMALL_PARAMETERS_RELATIVE_TOLERANCE,
                                                   parRelativeTolerance);
                } }else {__CLR4_4_1yy7yy7lb90pa5e.R.inc(45530);if ((((maxCosine <= 2.2204e-16)&&(__CLR4_4_1yy7yy7lb90pa5e.R.iget(45531)!=0|true))||(__CLR4_4_1yy7yy7lb90pa5e.R.iget(45532)==0&false)))  {{
                    __CLR4_4_1yy7yy7lb90pa5e.R.inc(45533);throw new ConvergenceException(LocalizedFormats.TOO_SMALL_ORTHOGONALITY_TOLERANCE,
                                                   orthoTolerance);
                }
            }}}}
        }}
    }}finally{__CLR4_4_1yy7yy7lb90pa5e.R.flushNeeded();}}

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
                                      double[] work1, double[] work2, double[] work3) {try{__CLR4_4_1yy7yy7lb90pa5e.R.inc(45534);
        __CLR4_4_1yy7yy7lb90pa5e.R.inc(45535);final int nC = weightedJacobian[0].length;

        // compute and store in x the gauss-newton direction, if the
        // jacobian is rank-deficient, obtain a least squares solution
        __CLR4_4_1yy7yy7lb90pa5e.R.inc(45536);for (int j = 0; (((j < rank)&&(__CLR4_4_1yy7yy7lb90pa5e.R.iget(45537)!=0|true))||(__CLR4_4_1yy7yy7lb90pa5e.R.iget(45538)==0&false)); ++j) {{
            __CLR4_4_1yy7yy7lb90pa5e.R.inc(45539);lmDir[permutation[j]] = qy[j];
        }
        }__CLR4_4_1yy7yy7lb90pa5e.R.inc(45540);for (int j = rank; (((j < nC)&&(__CLR4_4_1yy7yy7lb90pa5e.R.iget(45541)!=0|true))||(__CLR4_4_1yy7yy7lb90pa5e.R.iget(45542)==0&false)); ++j) {{
            __CLR4_4_1yy7yy7lb90pa5e.R.inc(45543);lmDir[permutation[j]] = 0;
        }
        }__CLR4_4_1yy7yy7lb90pa5e.R.inc(45544);for (int k = rank - 1; (((k >= 0)&&(__CLR4_4_1yy7yy7lb90pa5e.R.iget(45545)!=0|true))||(__CLR4_4_1yy7yy7lb90pa5e.R.iget(45546)==0&false)); --k) {{
            __CLR4_4_1yy7yy7lb90pa5e.R.inc(45547);int pk = permutation[k];
            __CLR4_4_1yy7yy7lb90pa5e.R.inc(45548);double ypk = lmDir[pk] / diagR[pk];
            __CLR4_4_1yy7yy7lb90pa5e.R.inc(45549);for (int i = 0; (((i < k)&&(__CLR4_4_1yy7yy7lb90pa5e.R.iget(45550)!=0|true))||(__CLR4_4_1yy7yy7lb90pa5e.R.iget(45551)==0&false)); ++i) {{
                __CLR4_4_1yy7yy7lb90pa5e.R.inc(45552);lmDir[permutation[i]] -= ypk * weightedJacobian[i][pk];
            }
            }__CLR4_4_1yy7yy7lb90pa5e.R.inc(45553);lmDir[pk] = ypk;
        }

        // evaluate the function at the origin, and test
        // for acceptance of the Gauss-Newton direction
        }__CLR4_4_1yy7yy7lb90pa5e.R.inc(45554);double dxNorm = 0;
        __CLR4_4_1yy7yy7lb90pa5e.R.inc(45555);for (int j = 0; (((j < solvedCols)&&(__CLR4_4_1yy7yy7lb90pa5e.R.iget(45556)!=0|true))||(__CLR4_4_1yy7yy7lb90pa5e.R.iget(45557)==0&false)); ++j) {{
            __CLR4_4_1yy7yy7lb90pa5e.R.inc(45558);int pj = permutation[j];
            __CLR4_4_1yy7yy7lb90pa5e.R.inc(45559);double s = diag[pj] * lmDir[pj];
            __CLR4_4_1yy7yy7lb90pa5e.R.inc(45560);work1[pj] = s;
            __CLR4_4_1yy7yy7lb90pa5e.R.inc(45561);dxNorm += s * s;
        }
        }__CLR4_4_1yy7yy7lb90pa5e.R.inc(45562);dxNorm = FastMath.sqrt(dxNorm);
        __CLR4_4_1yy7yy7lb90pa5e.R.inc(45563);double fp = dxNorm - delta;
        __CLR4_4_1yy7yy7lb90pa5e.R.inc(45564);if ((((fp <= 0.1 * delta)&&(__CLR4_4_1yy7yy7lb90pa5e.R.iget(45565)!=0|true))||(__CLR4_4_1yy7yy7lb90pa5e.R.iget(45566)==0&false))) {{
            __CLR4_4_1yy7yy7lb90pa5e.R.inc(45567);lmPar = 0;
            __CLR4_4_1yy7yy7lb90pa5e.R.inc(45568);return;
        }

        // if the jacobian is not rank deficient, the Newton step provides
        // a lower bound, parl, for the zero of the function,
        // otherwise set this bound to zero
        }__CLR4_4_1yy7yy7lb90pa5e.R.inc(45569);double sum2;
        __CLR4_4_1yy7yy7lb90pa5e.R.inc(45570);double parl = 0;
        __CLR4_4_1yy7yy7lb90pa5e.R.inc(45571);if ((((rank == solvedCols)&&(__CLR4_4_1yy7yy7lb90pa5e.R.iget(45572)!=0|true))||(__CLR4_4_1yy7yy7lb90pa5e.R.iget(45573)==0&false))) {{
            __CLR4_4_1yy7yy7lb90pa5e.R.inc(45574);for (int j = 0; (((j < solvedCols)&&(__CLR4_4_1yy7yy7lb90pa5e.R.iget(45575)!=0|true))||(__CLR4_4_1yy7yy7lb90pa5e.R.iget(45576)==0&false)); ++j) {{
                __CLR4_4_1yy7yy7lb90pa5e.R.inc(45577);int pj = permutation[j];
                __CLR4_4_1yy7yy7lb90pa5e.R.inc(45578);work1[pj] *= diag[pj] / dxNorm;
            }
            }__CLR4_4_1yy7yy7lb90pa5e.R.inc(45579);sum2 = 0;
            __CLR4_4_1yy7yy7lb90pa5e.R.inc(45580);for (int j = 0; (((j < solvedCols)&&(__CLR4_4_1yy7yy7lb90pa5e.R.iget(45581)!=0|true))||(__CLR4_4_1yy7yy7lb90pa5e.R.iget(45582)==0&false)); ++j) {{
                __CLR4_4_1yy7yy7lb90pa5e.R.inc(45583);int pj = permutation[j];
                __CLR4_4_1yy7yy7lb90pa5e.R.inc(45584);double sum = 0;
                __CLR4_4_1yy7yy7lb90pa5e.R.inc(45585);for (int i = 0; (((i < j)&&(__CLR4_4_1yy7yy7lb90pa5e.R.iget(45586)!=0|true))||(__CLR4_4_1yy7yy7lb90pa5e.R.iget(45587)==0&false)); ++i) {{
                    __CLR4_4_1yy7yy7lb90pa5e.R.inc(45588);sum += weightedJacobian[i][pj] * work1[permutation[i]];
                }
                }__CLR4_4_1yy7yy7lb90pa5e.R.inc(45589);double s = (work1[pj] - sum) / diagR[pj];
                __CLR4_4_1yy7yy7lb90pa5e.R.inc(45590);work1[pj] = s;
                __CLR4_4_1yy7yy7lb90pa5e.R.inc(45591);sum2 += s * s;
            }
            }__CLR4_4_1yy7yy7lb90pa5e.R.inc(45592);parl = fp / (delta * sum2);
        }

        // calculate an upper bound, paru, for the zero of the function
        }__CLR4_4_1yy7yy7lb90pa5e.R.inc(45593);sum2 = 0;
        __CLR4_4_1yy7yy7lb90pa5e.R.inc(45594);for (int j = 0; (((j < solvedCols)&&(__CLR4_4_1yy7yy7lb90pa5e.R.iget(45595)!=0|true))||(__CLR4_4_1yy7yy7lb90pa5e.R.iget(45596)==0&false)); ++j) {{
            __CLR4_4_1yy7yy7lb90pa5e.R.inc(45597);int pj = permutation[j];
            __CLR4_4_1yy7yy7lb90pa5e.R.inc(45598);double sum = 0;
            __CLR4_4_1yy7yy7lb90pa5e.R.inc(45599);for (int i = 0; (((i <= j)&&(__CLR4_4_1yy7yy7lb90pa5e.R.iget(45600)!=0|true))||(__CLR4_4_1yy7yy7lb90pa5e.R.iget(45601)==0&false)); ++i) {{
                __CLR4_4_1yy7yy7lb90pa5e.R.inc(45602);sum += weightedJacobian[i][pj] * qy[i];
            }
            }__CLR4_4_1yy7yy7lb90pa5e.R.inc(45603);sum /= diag[pj];
            __CLR4_4_1yy7yy7lb90pa5e.R.inc(45604);sum2 += sum * sum;
        }
        }__CLR4_4_1yy7yy7lb90pa5e.R.inc(45605);double gNorm = FastMath.sqrt(sum2);
        __CLR4_4_1yy7yy7lb90pa5e.R.inc(45606);double paru = gNorm / delta;
        __CLR4_4_1yy7yy7lb90pa5e.R.inc(45607);if ((((paru == 0)&&(__CLR4_4_1yy7yy7lb90pa5e.R.iget(45608)!=0|true))||(__CLR4_4_1yy7yy7lb90pa5e.R.iget(45609)==0&false))) {{
            // 2.2251e-308 is the smallest positive real for IEE754
            __CLR4_4_1yy7yy7lb90pa5e.R.inc(45610);paru = 2.2251e-308 / FastMath.min(delta, 0.1);
        }

        // if the input par lies outside of the interval (parl,paru),
        // set par to the closer endpoint
        }__CLR4_4_1yy7yy7lb90pa5e.R.inc(45611);lmPar = FastMath.min(paru, FastMath.max(lmPar, parl));
        __CLR4_4_1yy7yy7lb90pa5e.R.inc(45612);if ((((lmPar == 0)&&(__CLR4_4_1yy7yy7lb90pa5e.R.iget(45613)!=0|true))||(__CLR4_4_1yy7yy7lb90pa5e.R.iget(45614)==0&false))) {{
            __CLR4_4_1yy7yy7lb90pa5e.R.inc(45615);lmPar = gNorm / dxNorm;
        }

        }__CLR4_4_1yy7yy7lb90pa5e.R.inc(45616);for (int countdown = 10; (((countdown >= 0)&&(__CLR4_4_1yy7yy7lb90pa5e.R.iget(45617)!=0|true))||(__CLR4_4_1yy7yy7lb90pa5e.R.iget(45618)==0&false)); --countdown) {{

            // evaluate the function at the current value of lmPar
            __CLR4_4_1yy7yy7lb90pa5e.R.inc(45619);if ((((lmPar == 0)&&(__CLR4_4_1yy7yy7lb90pa5e.R.iget(45620)!=0|true))||(__CLR4_4_1yy7yy7lb90pa5e.R.iget(45621)==0&false))) {{
                __CLR4_4_1yy7yy7lb90pa5e.R.inc(45622);lmPar = FastMath.max(2.2251e-308, 0.001 * paru);
            }
            }__CLR4_4_1yy7yy7lb90pa5e.R.inc(45623);double sPar = FastMath.sqrt(lmPar);
            __CLR4_4_1yy7yy7lb90pa5e.R.inc(45624);for (int j = 0; (((j < solvedCols)&&(__CLR4_4_1yy7yy7lb90pa5e.R.iget(45625)!=0|true))||(__CLR4_4_1yy7yy7lb90pa5e.R.iget(45626)==0&false)); ++j) {{
                __CLR4_4_1yy7yy7lb90pa5e.R.inc(45627);int pj = permutation[j];
                __CLR4_4_1yy7yy7lb90pa5e.R.inc(45628);work1[pj] = sPar * diag[pj];
            }
            }__CLR4_4_1yy7yy7lb90pa5e.R.inc(45629);determineLMDirection(qy, work1, work2, work3);

            __CLR4_4_1yy7yy7lb90pa5e.R.inc(45630);dxNorm = 0;
            __CLR4_4_1yy7yy7lb90pa5e.R.inc(45631);for (int j = 0; (((j < solvedCols)&&(__CLR4_4_1yy7yy7lb90pa5e.R.iget(45632)!=0|true))||(__CLR4_4_1yy7yy7lb90pa5e.R.iget(45633)==0&false)); ++j) {{
                __CLR4_4_1yy7yy7lb90pa5e.R.inc(45634);int pj = permutation[j];
                __CLR4_4_1yy7yy7lb90pa5e.R.inc(45635);double s = diag[pj] * lmDir[pj];
                __CLR4_4_1yy7yy7lb90pa5e.R.inc(45636);work3[pj] = s;
                __CLR4_4_1yy7yy7lb90pa5e.R.inc(45637);dxNorm += s * s;
            }
            }__CLR4_4_1yy7yy7lb90pa5e.R.inc(45638);dxNorm = FastMath.sqrt(dxNorm);
            __CLR4_4_1yy7yy7lb90pa5e.R.inc(45639);double previousFP = fp;
            __CLR4_4_1yy7yy7lb90pa5e.R.inc(45640);fp = dxNorm - delta;

            // if the function is small enough, accept the current value
            // of lmPar, also test for the exceptional cases where parl is zero
            __CLR4_4_1yy7yy7lb90pa5e.R.inc(45641);if (((((FastMath.abs(fp) <= 0.1 * delta) ||
                    ((parl == 0) && (fp <= previousFP) && (previousFP < 0)))&&(__CLR4_4_1yy7yy7lb90pa5e.R.iget(45642)!=0|true))||(__CLR4_4_1yy7yy7lb90pa5e.R.iget(45643)==0&false))) {{
                __CLR4_4_1yy7yy7lb90pa5e.R.inc(45644);return;
            }

            // compute the Newton correction
            }__CLR4_4_1yy7yy7lb90pa5e.R.inc(45645);for (int j = 0; (((j < solvedCols)&&(__CLR4_4_1yy7yy7lb90pa5e.R.iget(45646)!=0|true))||(__CLR4_4_1yy7yy7lb90pa5e.R.iget(45647)==0&false)); ++j) {{
                __CLR4_4_1yy7yy7lb90pa5e.R.inc(45648);int pj = permutation[j];
                __CLR4_4_1yy7yy7lb90pa5e.R.inc(45649);work1[pj] = work3[pj] * diag[pj] / dxNorm;
            }
            }__CLR4_4_1yy7yy7lb90pa5e.R.inc(45650);for (int j = 0; (((j < solvedCols)&&(__CLR4_4_1yy7yy7lb90pa5e.R.iget(45651)!=0|true))||(__CLR4_4_1yy7yy7lb90pa5e.R.iget(45652)==0&false)); ++j) {{
                __CLR4_4_1yy7yy7lb90pa5e.R.inc(45653);int pj = permutation[j];
                __CLR4_4_1yy7yy7lb90pa5e.R.inc(45654);work1[pj] /= work2[j];
                __CLR4_4_1yy7yy7lb90pa5e.R.inc(45655);double tmp = work1[pj];
                __CLR4_4_1yy7yy7lb90pa5e.R.inc(45656);for (int i = j + 1; (((i < solvedCols)&&(__CLR4_4_1yy7yy7lb90pa5e.R.iget(45657)!=0|true))||(__CLR4_4_1yy7yy7lb90pa5e.R.iget(45658)==0&false)); ++i) {{
                    __CLR4_4_1yy7yy7lb90pa5e.R.inc(45659);work1[permutation[i]] -= weightedJacobian[i][pj] * tmp;
                }
            }}
            }__CLR4_4_1yy7yy7lb90pa5e.R.inc(45660);sum2 = 0;
            __CLR4_4_1yy7yy7lb90pa5e.R.inc(45661);for (int j = 0; (((j < solvedCols)&&(__CLR4_4_1yy7yy7lb90pa5e.R.iget(45662)!=0|true))||(__CLR4_4_1yy7yy7lb90pa5e.R.iget(45663)==0&false)); ++j) {{
                __CLR4_4_1yy7yy7lb90pa5e.R.inc(45664);double s = work1[permutation[j]];
                __CLR4_4_1yy7yy7lb90pa5e.R.inc(45665);sum2 += s * s;
            }
            }__CLR4_4_1yy7yy7lb90pa5e.R.inc(45666);double correction = fp / (delta * sum2);

            // depending on the sign of the function, update parl or paru.
            __CLR4_4_1yy7yy7lb90pa5e.R.inc(45667);if ((((fp > 0)&&(__CLR4_4_1yy7yy7lb90pa5e.R.iget(45668)!=0|true))||(__CLR4_4_1yy7yy7lb90pa5e.R.iget(45669)==0&false))) {{
                __CLR4_4_1yy7yy7lb90pa5e.R.inc(45670);parl = FastMath.max(parl, lmPar);
            } }else {__CLR4_4_1yy7yy7lb90pa5e.R.inc(45671);if ((((fp < 0)&&(__CLR4_4_1yy7yy7lb90pa5e.R.iget(45672)!=0|true))||(__CLR4_4_1yy7yy7lb90pa5e.R.iget(45673)==0&false))) {{
                __CLR4_4_1yy7yy7lb90pa5e.R.inc(45674);paru = FastMath.min(paru, lmPar);
            }

            // compute an improved estimate for lmPar
            }}__CLR4_4_1yy7yy7lb90pa5e.R.inc(45675);lmPar = FastMath.max(parl, lmPar + correction);

        }
    }}finally{__CLR4_4_1yy7yy7lb90pa5e.R.flushNeeded();}}

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
                                      double[] lmDiag, double[] work) {try{__CLR4_4_1yy7yy7lb90pa5e.R.inc(45676);

        // copy R and Qty to preserve input and initialize s
        //  in particular, save the diagonal elements of R in lmDir
        __CLR4_4_1yy7yy7lb90pa5e.R.inc(45677);for (int j = 0; (((j < solvedCols)&&(__CLR4_4_1yy7yy7lb90pa5e.R.iget(45678)!=0|true))||(__CLR4_4_1yy7yy7lb90pa5e.R.iget(45679)==0&false)); ++j) {{
            __CLR4_4_1yy7yy7lb90pa5e.R.inc(45680);int pj = permutation[j];
            __CLR4_4_1yy7yy7lb90pa5e.R.inc(45681);for (int i = j + 1; (((i < solvedCols)&&(__CLR4_4_1yy7yy7lb90pa5e.R.iget(45682)!=0|true))||(__CLR4_4_1yy7yy7lb90pa5e.R.iget(45683)==0&false)); ++i) {{
                __CLR4_4_1yy7yy7lb90pa5e.R.inc(45684);weightedJacobian[i][pj] = weightedJacobian[j][permutation[i]];
            }
            }__CLR4_4_1yy7yy7lb90pa5e.R.inc(45685);lmDir[j] = diagR[pj];
            __CLR4_4_1yy7yy7lb90pa5e.R.inc(45686);work[j]  = qy[j];
        }

        // eliminate the diagonal matrix d using a Givens rotation
        }__CLR4_4_1yy7yy7lb90pa5e.R.inc(45687);for (int j = 0; (((j < solvedCols)&&(__CLR4_4_1yy7yy7lb90pa5e.R.iget(45688)!=0|true))||(__CLR4_4_1yy7yy7lb90pa5e.R.iget(45689)==0&false)); ++j) {{

            // prepare the row of d to be eliminated, locating the
            // diagonal element using p from the Q.R. factorization
            __CLR4_4_1yy7yy7lb90pa5e.R.inc(45690);int pj = permutation[j];
            __CLR4_4_1yy7yy7lb90pa5e.R.inc(45691);double dpj = diag[pj];
            __CLR4_4_1yy7yy7lb90pa5e.R.inc(45692);if ((((dpj != 0)&&(__CLR4_4_1yy7yy7lb90pa5e.R.iget(45693)!=0|true))||(__CLR4_4_1yy7yy7lb90pa5e.R.iget(45694)==0&false))) {{
                __CLR4_4_1yy7yy7lb90pa5e.R.inc(45695);Arrays.fill(lmDiag, j + 1, lmDiag.length, 0);
            }
            }__CLR4_4_1yy7yy7lb90pa5e.R.inc(45696);lmDiag[j] = dpj;

            //  the transformations to eliminate the row of d
            // modify only a single element of Qty
            // beyond the first n, which is initially zero.
            __CLR4_4_1yy7yy7lb90pa5e.R.inc(45697);double qtbpj = 0;
            __CLR4_4_1yy7yy7lb90pa5e.R.inc(45698);for (int k = j; (((k < solvedCols)&&(__CLR4_4_1yy7yy7lb90pa5e.R.iget(45699)!=0|true))||(__CLR4_4_1yy7yy7lb90pa5e.R.iget(45700)==0&false)); ++k) {{
                __CLR4_4_1yy7yy7lb90pa5e.R.inc(45701);int pk = permutation[k];

                // determine a Givens rotation which eliminates the
                // appropriate element in the current row of d
                __CLR4_4_1yy7yy7lb90pa5e.R.inc(45702);if ((((lmDiag[k] != 0)&&(__CLR4_4_1yy7yy7lb90pa5e.R.iget(45703)!=0|true))||(__CLR4_4_1yy7yy7lb90pa5e.R.iget(45704)==0&false))) {{

                    __CLR4_4_1yy7yy7lb90pa5e.R.inc(45705);final double sin;
                    __CLR4_4_1yy7yy7lb90pa5e.R.inc(45706);final double cos;
                    __CLR4_4_1yy7yy7lb90pa5e.R.inc(45707);double rkk = weightedJacobian[k][pk];
                    __CLR4_4_1yy7yy7lb90pa5e.R.inc(45708);if ((((FastMath.abs(rkk) < FastMath.abs(lmDiag[k]))&&(__CLR4_4_1yy7yy7lb90pa5e.R.iget(45709)!=0|true))||(__CLR4_4_1yy7yy7lb90pa5e.R.iget(45710)==0&false))) {{
                        __CLR4_4_1yy7yy7lb90pa5e.R.inc(45711);final double cotan = rkk / lmDiag[k];
                        __CLR4_4_1yy7yy7lb90pa5e.R.inc(45712);sin   = 1.0 / FastMath.sqrt(1.0 + cotan * cotan);
                        __CLR4_4_1yy7yy7lb90pa5e.R.inc(45713);cos   = sin * cotan;
                    } }else {{
                        __CLR4_4_1yy7yy7lb90pa5e.R.inc(45714);final double tan = lmDiag[k] / rkk;
                        __CLR4_4_1yy7yy7lb90pa5e.R.inc(45715);cos = 1.0 / FastMath.sqrt(1.0 + tan * tan);
                        __CLR4_4_1yy7yy7lb90pa5e.R.inc(45716);sin = cos * tan;
                    }

                    // compute the modified diagonal element of R and
                    // the modified element of (Qty,0)
                    }__CLR4_4_1yy7yy7lb90pa5e.R.inc(45717);weightedJacobian[k][pk] = cos * rkk + sin * lmDiag[k];
                    __CLR4_4_1yy7yy7lb90pa5e.R.inc(45718);final double temp = cos * work[k] + sin * qtbpj;
                    __CLR4_4_1yy7yy7lb90pa5e.R.inc(45719);qtbpj = -sin * work[k] + cos * qtbpj;
                    __CLR4_4_1yy7yy7lb90pa5e.R.inc(45720);work[k] = temp;

                    // accumulate the tranformation in the row of s
                    __CLR4_4_1yy7yy7lb90pa5e.R.inc(45721);for (int i = k + 1; (((i < solvedCols)&&(__CLR4_4_1yy7yy7lb90pa5e.R.iget(45722)!=0|true))||(__CLR4_4_1yy7yy7lb90pa5e.R.iget(45723)==0&false)); ++i) {{
                        __CLR4_4_1yy7yy7lb90pa5e.R.inc(45724);double rik = weightedJacobian[i][pk];
                        __CLR4_4_1yy7yy7lb90pa5e.R.inc(45725);final double temp2 = cos * rik + sin * lmDiag[i];
                        __CLR4_4_1yy7yy7lb90pa5e.R.inc(45726);lmDiag[i] = -sin * rik + cos * lmDiag[i];
                        __CLR4_4_1yy7yy7lb90pa5e.R.inc(45727);weightedJacobian[i][pk] = temp2;
                    }
                }}
            }}

            // store the diagonal element of s and restore
            // the corresponding diagonal element of R
            }__CLR4_4_1yy7yy7lb90pa5e.R.inc(45728);lmDiag[j] = weightedJacobian[j][permutation[j]];
            __CLR4_4_1yy7yy7lb90pa5e.R.inc(45729);weightedJacobian[j][permutation[j]] = lmDir[j];
        }

        // solve the triangular system for z, if the system is
        // singular, then obtain a least squares solution
        }__CLR4_4_1yy7yy7lb90pa5e.R.inc(45730);int nSing = solvedCols;
        __CLR4_4_1yy7yy7lb90pa5e.R.inc(45731);for (int j = 0; (((j < solvedCols)&&(__CLR4_4_1yy7yy7lb90pa5e.R.iget(45732)!=0|true))||(__CLR4_4_1yy7yy7lb90pa5e.R.iget(45733)==0&false)); ++j) {{
            __CLR4_4_1yy7yy7lb90pa5e.R.inc(45734);if (((((lmDiag[j] == 0) && (nSing == solvedCols))&&(__CLR4_4_1yy7yy7lb90pa5e.R.iget(45735)!=0|true))||(__CLR4_4_1yy7yy7lb90pa5e.R.iget(45736)==0&false))) {{
                __CLR4_4_1yy7yy7lb90pa5e.R.inc(45737);nSing = j;
            }
            }__CLR4_4_1yy7yy7lb90pa5e.R.inc(45738);if ((((nSing < solvedCols)&&(__CLR4_4_1yy7yy7lb90pa5e.R.iget(45739)!=0|true))||(__CLR4_4_1yy7yy7lb90pa5e.R.iget(45740)==0&false))) {{
                __CLR4_4_1yy7yy7lb90pa5e.R.inc(45741);work[j] = 0;
            }
        }}
        }__CLR4_4_1yy7yy7lb90pa5e.R.inc(45742);if ((((nSing > 0)&&(__CLR4_4_1yy7yy7lb90pa5e.R.iget(45743)!=0|true))||(__CLR4_4_1yy7yy7lb90pa5e.R.iget(45744)==0&false))) {{
            __CLR4_4_1yy7yy7lb90pa5e.R.inc(45745);for (int j = nSing - 1; (((j >= 0)&&(__CLR4_4_1yy7yy7lb90pa5e.R.iget(45746)!=0|true))||(__CLR4_4_1yy7yy7lb90pa5e.R.iget(45747)==0&false)); --j) {{
                __CLR4_4_1yy7yy7lb90pa5e.R.inc(45748);int pj = permutation[j];
                __CLR4_4_1yy7yy7lb90pa5e.R.inc(45749);double sum = 0;
                __CLR4_4_1yy7yy7lb90pa5e.R.inc(45750);for (int i = j + 1; (((i < nSing)&&(__CLR4_4_1yy7yy7lb90pa5e.R.iget(45751)!=0|true))||(__CLR4_4_1yy7yy7lb90pa5e.R.iget(45752)==0&false)); ++i) {{
                    __CLR4_4_1yy7yy7lb90pa5e.R.inc(45753);sum += weightedJacobian[i][pj] * work[i];
                }
                }__CLR4_4_1yy7yy7lb90pa5e.R.inc(45754);work[j] = (work[j] - sum) / lmDiag[j];
            }
        }}

        // permute the components of z back to components of lmDir
        }__CLR4_4_1yy7yy7lb90pa5e.R.inc(45755);for (int j = 0; (((j < lmDir.length)&&(__CLR4_4_1yy7yy7lb90pa5e.R.iget(45756)!=0|true))||(__CLR4_4_1yy7yy7lb90pa5e.R.iget(45757)==0&false)); ++j) {{
            __CLR4_4_1yy7yy7lb90pa5e.R.inc(45758);lmDir[permutation[j]] = work[j];
        }
    }}finally{__CLR4_4_1yy7yy7lb90pa5e.R.flushNeeded();}}

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
    private void qrDecomposition(RealMatrix jacobian) throws ConvergenceException {try{__CLR4_4_1yy7yy7lb90pa5e.R.inc(45759);
        // Code in this class assumes that the weighted Jacobian is -(W^(1/2) J),
        // hence the multiplication by -1.
        __CLR4_4_1yy7yy7lb90pa5e.R.inc(45760);weightedJacobian = jacobian.scalarMultiply(-1).getData();

        __CLR4_4_1yy7yy7lb90pa5e.R.inc(45761);final int nR = weightedJacobian.length;
        __CLR4_4_1yy7yy7lb90pa5e.R.inc(45762);final int nC = weightedJacobian[0].length;

        // initializations
        __CLR4_4_1yy7yy7lb90pa5e.R.inc(45763);for (int k = 0; (((k < nC)&&(__CLR4_4_1yy7yy7lb90pa5e.R.iget(45764)!=0|true))||(__CLR4_4_1yy7yy7lb90pa5e.R.iget(45765)==0&false)); ++k) {{
            __CLR4_4_1yy7yy7lb90pa5e.R.inc(45766);permutation[k] = k;
            __CLR4_4_1yy7yy7lb90pa5e.R.inc(45767);double norm2 = 0;
            __CLR4_4_1yy7yy7lb90pa5e.R.inc(45768);for (int i = 0; (((i < nR)&&(__CLR4_4_1yy7yy7lb90pa5e.R.iget(45769)!=0|true))||(__CLR4_4_1yy7yy7lb90pa5e.R.iget(45770)==0&false)); ++i) {{
                __CLR4_4_1yy7yy7lb90pa5e.R.inc(45771);double akk = weightedJacobian[i][k];
                __CLR4_4_1yy7yy7lb90pa5e.R.inc(45772);norm2 += akk * akk;
            }
            }__CLR4_4_1yy7yy7lb90pa5e.R.inc(45773);jacNorm[k] = FastMath.sqrt(norm2);
        }

        // transform the matrix column after column
        }__CLR4_4_1yy7yy7lb90pa5e.R.inc(45774);for (int k = 0; (((k < nC)&&(__CLR4_4_1yy7yy7lb90pa5e.R.iget(45775)!=0|true))||(__CLR4_4_1yy7yy7lb90pa5e.R.iget(45776)==0&false)); ++k) {{

            // select the column with the greatest norm on active components
            __CLR4_4_1yy7yy7lb90pa5e.R.inc(45777);int nextColumn = -1;
            __CLR4_4_1yy7yy7lb90pa5e.R.inc(45778);double ak2 = Double.NEGATIVE_INFINITY;
            __CLR4_4_1yy7yy7lb90pa5e.R.inc(45779);for (int i = k; (((i < nC)&&(__CLR4_4_1yy7yy7lb90pa5e.R.iget(45780)!=0|true))||(__CLR4_4_1yy7yy7lb90pa5e.R.iget(45781)==0&false)); ++i) {{
                __CLR4_4_1yy7yy7lb90pa5e.R.inc(45782);double norm2 = 0;
                __CLR4_4_1yy7yy7lb90pa5e.R.inc(45783);for (int j = k; (((j < nR)&&(__CLR4_4_1yy7yy7lb90pa5e.R.iget(45784)!=0|true))||(__CLR4_4_1yy7yy7lb90pa5e.R.iget(45785)==0&false)); ++j) {{
                    __CLR4_4_1yy7yy7lb90pa5e.R.inc(45786);double aki = weightedJacobian[j][permutation[i]];
                    __CLR4_4_1yy7yy7lb90pa5e.R.inc(45787);norm2 += aki * aki;
                }
                }__CLR4_4_1yy7yy7lb90pa5e.R.inc(45788);if ((((Double.isInfinite(norm2) || Double.isNaN(norm2))&&(__CLR4_4_1yy7yy7lb90pa5e.R.iget(45789)!=0|true))||(__CLR4_4_1yy7yy7lb90pa5e.R.iget(45790)==0&false))) {{
                    __CLR4_4_1yy7yy7lb90pa5e.R.inc(45791);throw new ConvergenceException(LocalizedFormats.UNABLE_TO_PERFORM_QR_DECOMPOSITION_ON_JACOBIAN,
                                                   nR, nC);
                }
                }__CLR4_4_1yy7yy7lb90pa5e.R.inc(45792);if ((((norm2 > ak2)&&(__CLR4_4_1yy7yy7lb90pa5e.R.iget(45793)!=0|true))||(__CLR4_4_1yy7yy7lb90pa5e.R.iget(45794)==0&false))) {{
                    __CLR4_4_1yy7yy7lb90pa5e.R.inc(45795);nextColumn = i;
                    __CLR4_4_1yy7yy7lb90pa5e.R.inc(45796);ak2        = norm2;
                }
            }}
            }__CLR4_4_1yy7yy7lb90pa5e.R.inc(45797);if ((((ak2 <= qrRankingThreshold)&&(__CLR4_4_1yy7yy7lb90pa5e.R.iget(45798)!=0|true))||(__CLR4_4_1yy7yy7lb90pa5e.R.iget(45799)==0&false))) {{
                __CLR4_4_1yy7yy7lb90pa5e.R.inc(45800);rank = k;
                __CLR4_4_1yy7yy7lb90pa5e.R.inc(45801);return;
            }
            }__CLR4_4_1yy7yy7lb90pa5e.R.inc(45802);int pk                  = permutation[nextColumn];
            __CLR4_4_1yy7yy7lb90pa5e.R.inc(45803);permutation[nextColumn] = permutation[k];
            __CLR4_4_1yy7yy7lb90pa5e.R.inc(45804);permutation[k]          = pk;

            // choose alpha such that Hk.u = alpha ek
            __CLR4_4_1yy7yy7lb90pa5e.R.inc(45805);double akk   = weightedJacobian[k][pk];
            __CLR4_4_1yy7yy7lb90pa5e.R.inc(45806);double alpha = ((((akk > 0) )&&(__CLR4_4_1yy7yy7lb90pa5e.R.iget(45807)!=0|true))||(__CLR4_4_1yy7yy7lb90pa5e.R.iget(45808)==0&false))? -FastMath.sqrt(ak2) : FastMath.sqrt(ak2);
            __CLR4_4_1yy7yy7lb90pa5e.R.inc(45809);double betak = 1.0 / (ak2 - akk * alpha);
            __CLR4_4_1yy7yy7lb90pa5e.R.inc(45810);beta[pk]     = betak;

            // transform the current column
            __CLR4_4_1yy7yy7lb90pa5e.R.inc(45811);diagR[pk]        = alpha;
            __CLR4_4_1yy7yy7lb90pa5e.R.inc(45812);weightedJacobian[k][pk] -= alpha;

            // transform the remaining columns
            __CLR4_4_1yy7yy7lb90pa5e.R.inc(45813);for (int dk = nC - 1 - k; (((dk > 0)&&(__CLR4_4_1yy7yy7lb90pa5e.R.iget(45814)!=0|true))||(__CLR4_4_1yy7yy7lb90pa5e.R.iget(45815)==0&false)); --dk) {{
                __CLR4_4_1yy7yy7lb90pa5e.R.inc(45816);double gamma = 0;
                __CLR4_4_1yy7yy7lb90pa5e.R.inc(45817);for (int j = k; (((j < nR)&&(__CLR4_4_1yy7yy7lb90pa5e.R.iget(45818)!=0|true))||(__CLR4_4_1yy7yy7lb90pa5e.R.iget(45819)==0&false)); ++j) {{
                    __CLR4_4_1yy7yy7lb90pa5e.R.inc(45820);gamma += weightedJacobian[j][pk] * weightedJacobian[j][permutation[k + dk]];
                }
                }__CLR4_4_1yy7yy7lb90pa5e.R.inc(45821);gamma *= betak;
                __CLR4_4_1yy7yy7lb90pa5e.R.inc(45822);for (int j = k; (((j < nR)&&(__CLR4_4_1yy7yy7lb90pa5e.R.iget(45823)!=0|true))||(__CLR4_4_1yy7yy7lb90pa5e.R.iget(45824)==0&false)); ++j) {{
                    __CLR4_4_1yy7yy7lb90pa5e.R.inc(45825);weightedJacobian[j][permutation[k + dk]] -= gamma * weightedJacobian[j][pk];
                }
            }}
        }}
        }__CLR4_4_1yy7yy7lb90pa5e.R.inc(45826);rank = solvedCols;
    }finally{__CLR4_4_1yy7yy7lb90pa5e.R.flushNeeded();}}

    /**
     * Compute the product Qt.y for some Q.R. decomposition.
     *
     * @param y vector to multiply (will be overwritten with the result)
     */
    private void qTy(double[] y) {try{__CLR4_4_1yy7yy7lb90pa5e.R.inc(45827);
        __CLR4_4_1yy7yy7lb90pa5e.R.inc(45828);final int nR = weightedJacobian.length;
        __CLR4_4_1yy7yy7lb90pa5e.R.inc(45829);final int nC = weightedJacobian[0].length;

        __CLR4_4_1yy7yy7lb90pa5e.R.inc(45830);for (int k = 0; (((k < nC)&&(__CLR4_4_1yy7yy7lb90pa5e.R.iget(45831)!=0|true))||(__CLR4_4_1yy7yy7lb90pa5e.R.iget(45832)==0&false)); ++k) {{
            __CLR4_4_1yy7yy7lb90pa5e.R.inc(45833);int pk = permutation[k];
            __CLR4_4_1yy7yy7lb90pa5e.R.inc(45834);double gamma = 0;
            __CLR4_4_1yy7yy7lb90pa5e.R.inc(45835);for (int i = k; (((i < nR)&&(__CLR4_4_1yy7yy7lb90pa5e.R.iget(45836)!=0|true))||(__CLR4_4_1yy7yy7lb90pa5e.R.iget(45837)==0&false)); ++i) {{
                __CLR4_4_1yy7yy7lb90pa5e.R.inc(45838);gamma += weightedJacobian[i][pk] * y[i];
            }
            }__CLR4_4_1yy7yy7lb90pa5e.R.inc(45839);gamma *= beta[pk];
            __CLR4_4_1yy7yy7lb90pa5e.R.inc(45840);for (int i = k; (((i < nR)&&(__CLR4_4_1yy7yy7lb90pa5e.R.iget(45841)!=0|true))||(__CLR4_4_1yy7yy7lb90pa5e.R.iget(45842)==0&false)); ++i) {{
                __CLR4_4_1yy7yy7lb90pa5e.R.inc(45843);y[i] -= gamma * weightedJacobian[i][pk];
            }
        }}
    }}finally{__CLR4_4_1yy7yy7lb90pa5e.R.flushNeeded();}}
}
