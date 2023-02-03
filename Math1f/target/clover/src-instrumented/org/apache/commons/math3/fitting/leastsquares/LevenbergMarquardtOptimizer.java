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

import java.util.Arrays;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.exception.ConvergenceException;
import org.apache.commons.math3.exception.util.LocalizedFormats;
import org.apache.commons.math3.optim.ConvergenceChecker;
import org.apache.commons.math3.optim.PointVectorValuePair;
import org.apache.commons.math3.util.Precision;
import org.apache.commons.math3.util.FastMath;


/**
 * This class solves a least-squares problem using the Levenberg-Marquardt
 * algorithm.
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
 * @since 3.3
 */
public class LevenbergMarquardtOptimizer extends AbstractLeastSquaresOptimizer<LevenbergMarquardtOptimizer> {public static class __CLR4_4_1ahjahjlb90p7ti{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,14173,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /** Twice the "epsilon machine". */
    private static final double TWO_EPS = 2 * Precision.EPSILON;
    /** Positive input variable used in determining the initial step bound. */
    private double initialStepBoundFactor = 100;
    /** Desired relative error in the sum of squares. */
    private double costRelativeTolerance = 1e-10;
    /** Desired relative error in the approximate solution parameters. */
    private double parRelativeTolerance = 1e-10;
    /**
     * Desired max cosine on the orthogonality between the function vector
     * and the columns of the jacobian.
     */
    private double orthoTolerance = 1e-10;
    /** Threshold for QR ranking. */
    private double qrRankingThreshold = Precision.SAFE_MIN;
    /** Levenberg-Marquardt parameter. */
    private double lmPar;
    /** Parameters evolution direction associated with lmPar. */
    private double[] lmDir;

    /**
     * Default constructor.
     */
    protected LevenbergMarquardtOptimizer() {try{__CLR4_4_1ahjahjlb90p7ti.R.inc(13591);}finally{__CLR4_4_1ahjahjlb90p7ti.R.flushNeeded();}}

    /**
     * Copy constructor.
     *
     * @param other object to copy.
     */
    protected LevenbergMarquardtOptimizer(LevenbergMarquardtOptimizer other) {
        super(other);__CLR4_4_1ahjahjlb90p7ti.R.inc(13593);try{__CLR4_4_1ahjahjlb90p7ti.R.inc(13592);

        __CLR4_4_1ahjahjlb90p7ti.R.inc(13594);this.initialStepBoundFactor = other.initialStepBoundFactor;
        __CLR4_4_1ahjahjlb90p7ti.R.inc(13595);this.costRelativeTolerance = other.costRelativeTolerance;
        __CLR4_4_1ahjahjlb90p7ti.R.inc(13596);this.parRelativeTolerance = other.parRelativeTolerance;
        __CLR4_4_1ahjahjlb90p7ti.R.inc(13597);this.orthoTolerance = other.orthoTolerance;
        __CLR4_4_1ahjahjlb90p7ti.R.inc(13598);this.qrRankingThreshold = other.qrRankingThreshold;

        __CLR4_4_1ahjahjlb90p7ti.R.inc(13599);lmPar = 0; // Re-initialized in "doOptimize".
        __CLR4_4_1ahjahjlb90p7ti.R.inc(13600);lmDir = null; // Re-initialized in "doOptimize".
    }finally{__CLR4_4_1ahjahjlb90p7ti.R.flushNeeded();}}

    /**
     * Creates a bare-bones instance.
     * Several calls to {@code withXxx} methods are necessary to obtain
     * an object with all necessary fields set to sensible values.
     * <br/>
     * The default values for the algorithm settings are:
     * <ul>
     *  <li>Initial step bound factor: 100</li>
     *  <li>Cost relative tolerance: 1e-10</li>
     *  <li>Parameters relative tolerance: 1e-10</li>
     *  <li>Orthogonality tolerance: 1e-10</li>
     *  <li>QR ranking threshold: {@link Precision#SAFE_MIN}</li>
     * </ul>
     *
     * @return an instance of this class.
     */
    public static LevenbergMarquardtOptimizer create() {try{__CLR4_4_1ahjahjlb90p7ti.R.inc(13601);
        __CLR4_4_1ahjahjlb90p7ti.R.inc(13602);return new LevenbergMarquardtOptimizer();
    }finally{__CLR4_4_1ahjahjlb90p7ti.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public LevenbergMarquardtOptimizer shallowCopy() {try{__CLR4_4_1ahjahjlb90p7ti.R.inc(13603);
        __CLR4_4_1ahjahjlb90p7ti.R.inc(13604);return new LevenbergMarquardtOptimizer(this);
    }finally{__CLR4_4_1ahjahjlb90p7ti.R.flushNeeded();}}

    /**
     * @param newInitialStepBoundFactor Positive input variable used in
     * determining the initial step bound. This bound is set to the
     * product of initialStepBoundFactor and the euclidean norm of
     * {@code diag * x} if non-zero, or else to {@code newInitialStepBoundFactor}
     * itself. In most cases factor should lie in the interval
     * {@code (0.1, 100.0)}. {@code 100} is a generally recommended value.
     * of the matrix is reduced.
     * @return this instance.
     */
    public LevenbergMarquardtOptimizer withInitialStepBoundFactor(double newInitialStepBoundFactor) {try{__CLR4_4_1ahjahjlb90p7ti.R.inc(13605);
        __CLR4_4_1ahjahjlb90p7ti.R.inc(13606);this.initialStepBoundFactor = newInitialStepBoundFactor;
        __CLR4_4_1ahjahjlb90p7ti.R.inc(13607);return self();
    }finally{__CLR4_4_1ahjahjlb90p7ti.R.flushNeeded();}}

    /**
     * Modifies the given parameter.
     *
     * @param newCostRelativeTolerance Desired relative error in the sum of squares.
     * @return this instance.
     */
    public LevenbergMarquardtOptimizer withCostRelativeTolerance(double newCostRelativeTolerance) {try{__CLR4_4_1ahjahjlb90p7ti.R.inc(13608);
        __CLR4_4_1ahjahjlb90p7ti.R.inc(13609);this.costRelativeTolerance = newCostRelativeTolerance;
        __CLR4_4_1ahjahjlb90p7ti.R.inc(13610);return self();
    }finally{__CLR4_4_1ahjahjlb90p7ti.R.flushNeeded();}}

    /**
     * Modifies the given parameter.
     *
     * @param parameterRelativeTolerance Desired relative error in the approximate solution
     * parameters.
     * @return this instance.
     */
    public LevenbergMarquardtOptimizer withParameterRelativeTolerance(double parameterRelativeTolerance) {try{__CLR4_4_1ahjahjlb90p7ti.R.inc(13611);
        __CLR4_4_1ahjahjlb90p7ti.R.inc(13612);this.parRelativeTolerance = parameterRelativeTolerance;
        __CLR4_4_1ahjahjlb90p7ti.R.inc(13613);return self();
    }finally{__CLR4_4_1ahjahjlb90p7ti.R.flushNeeded();}}

    /**
     * Modifies the given parameter.
     *
     * @param newOrthoTolerance Desired max cosine on the orthogonality between
     * the function vector and the columns of the Jacobian.
     * @return this instance.
     */
    public LevenbergMarquardtOptimizer withOrthoTolerance(double newOrthoTolerance) {try{__CLR4_4_1ahjahjlb90p7ti.R.inc(13614);
        __CLR4_4_1ahjahjlb90p7ti.R.inc(13615);this.orthoTolerance = newOrthoTolerance;
        __CLR4_4_1ahjahjlb90p7ti.R.inc(13616);return self();
    }finally{__CLR4_4_1ahjahjlb90p7ti.R.flushNeeded();}}

    /**
     * Modifies the given parameter.
     *
     * @param rankingThreshold Desired threshold for QR ranking.
     * If the squared norm of a column vector is smaller or equal to this
     * threshold during QR decomposition, it is considered to be a zero vector
     * and hence the rank of the matrix is reduced.
     * @return this instance.
     */
    public LevenbergMarquardtOptimizer withRankingThreshold(double rankingThreshold) {try{__CLR4_4_1ahjahjlb90p7ti.R.inc(13617);
        __CLR4_4_1ahjahjlb90p7ti.R.inc(13618);this.qrRankingThreshold = rankingThreshold;
        __CLR4_4_1ahjahjlb90p7ti.R.inc(13619);return self();
    }finally{__CLR4_4_1ahjahjlb90p7ti.R.flushNeeded();}}

    /**
     * Gets the value of a tuning parameter.
     * @see #withInitialStepBoundFactor(double)
     *
     * @return the parameter's value.
     */
    public double getInitialStepBoundFactor() {try{__CLR4_4_1ahjahjlb90p7ti.R.inc(13620);
        __CLR4_4_1ahjahjlb90p7ti.R.inc(13621);return initialStepBoundFactor;
    }finally{__CLR4_4_1ahjahjlb90p7ti.R.flushNeeded();}}

    /**
     * Gets the value of a tuning parameter.
     * @see #withCostRelativeTolerance(double)
     *
     * @return the parameter's value.
     */
    public double getCostRelativeTolerance() {try{__CLR4_4_1ahjahjlb90p7ti.R.inc(13622);
        __CLR4_4_1ahjahjlb90p7ti.R.inc(13623);return costRelativeTolerance;
    }finally{__CLR4_4_1ahjahjlb90p7ti.R.flushNeeded();}}

    /**
     * Gets the value of a tuning parameter.
     * @see #withParameterRelativeTolerance(double)
     *
     * @return the parameter's value.
     */
    public double getParameterRelativeTolerance() {try{__CLR4_4_1ahjahjlb90p7ti.R.inc(13624);
        __CLR4_4_1ahjahjlb90p7ti.R.inc(13625);return parRelativeTolerance;
    }finally{__CLR4_4_1ahjahjlb90p7ti.R.flushNeeded();}}

    /**
     * Gets the value of a tuning parameter.
     * @see #withOrthoTolerance(double)
     *
     * @return the parameter's value.
     */
    public double getOrthoTolerance() {try{__CLR4_4_1ahjahjlb90p7ti.R.inc(13626);
        __CLR4_4_1ahjahjlb90p7ti.R.inc(13627);return orthoTolerance;
    }finally{__CLR4_4_1ahjahjlb90p7ti.R.flushNeeded();}}

    /**
     * Gets the value of a tuning parameter.
     * @see #withRankingThreshold(double)
     *
     * @return the parameter's value.
     */
    public double getRankingThreshold() {try{__CLR4_4_1ahjahjlb90p7ti.R.inc(13628);
        __CLR4_4_1ahjahjlb90p7ti.R.inc(13629);return qrRankingThreshold;
    }finally{__CLR4_4_1ahjahjlb90p7ti.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    protected PointVectorValuePair doOptimize() {try{__CLR4_4_1ahjahjlb90p7ti.R.inc(13630);
        __CLR4_4_1ahjahjlb90p7ti.R.inc(13631);final int nR = getTarget().length; // Number of observed data.
        __CLR4_4_1ahjahjlb90p7ti.R.inc(13632);final double[] currentPoint = getStart();
        __CLR4_4_1ahjahjlb90p7ti.R.inc(13633);final int nC = currentPoint.length; // Number of parameters.

        // arrays shared with the other private methods
        __CLR4_4_1ahjahjlb90p7ti.R.inc(13634);final int solvedCols  = FastMath.min(nR, nC);
        __CLR4_4_1ahjahjlb90p7ti.R.inc(13635);lmDir = new double[nC];
        __CLR4_4_1ahjahjlb90p7ti.R.inc(13636);lmPar = 0;

        // local point
        __CLR4_4_1ahjahjlb90p7ti.R.inc(13637);double   delta   = 0;
        __CLR4_4_1ahjahjlb90p7ti.R.inc(13638);double   xNorm   = 0;
        __CLR4_4_1ahjahjlb90p7ti.R.inc(13639);double[] diag    = new double[nC];
        __CLR4_4_1ahjahjlb90p7ti.R.inc(13640);double[] oldX    = new double[nC];
        __CLR4_4_1ahjahjlb90p7ti.R.inc(13641);double[] oldRes  = new double[nR];
        __CLR4_4_1ahjahjlb90p7ti.R.inc(13642);double[] oldObj  = new double[nR];
        __CLR4_4_1ahjahjlb90p7ti.R.inc(13643);double[] qtf     = new double[nR];
        __CLR4_4_1ahjahjlb90p7ti.R.inc(13644);double[] work1   = new double[nC];
        __CLR4_4_1ahjahjlb90p7ti.R.inc(13645);double[] work2   = new double[nC];
        __CLR4_4_1ahjahjlb90p7ti.R.inc(13646);double[] work3   = new double[nC];

        __CLR4_4_1ahjahjlb90p7ti.R.inc(13647);final RealMatrix weightMatrixSqrt = getWeightSquareRoot();

        // Evaluate the function at the starting point and calculate its norm.
        __CLR4_4_1ahjahjlb90p7ti.R.inc(13648);double[] currentObjective = computeObjectiveValue(currentPoint);
        __CLR4_4_1ahjahjlb90p7ti.R.inc(13649);double[] currentResiduals = computeResiduals(currentObjective);
        __CLR4_4_1ahjahjlb90p7ti.R.inc(13650);PointVectorValuePair current = new PointVectorValuePair(currentPoint, currentObjective);
        __CLR4_4_1ahjahjlb90p7ti.R.inc(13651);double currentCost = computeCost(currentResiduals);

        // Outer loop.
        __CLR4_4_1ahjahjlb90p7ti.R.inc(13652);boolean firstIteration = true;
        __CLR4_4_1ahjahjlb90p7ti.R.inc(13653);final ConvergenceChecker<PointVectorValuePair> checker = getConvergenceChecker();
        __CLR4_4_1ahjahjlb90p7ti.R.inc(13654);while (true) {{
            __CLR4_4_1ahjahjlb90p7ti.R.inc(13655);incrementIterationCount();

            __CLR4_4_1ahjahjlb90p7ti.R.inc(13656);final PointVectorValuePair previous = current;

            // QR decomposition of the jacobian matrix
            __CLR4_4_1ahjahjlb90p7ti.R.inc(13657);final InternalData internalData = qrDecomposition(computeWeightedJacobian(currentPoint),
                                                              solvedCols);
            __CLR4_4_1ahjahjlb90p7ti.R.inc(13658);final double[][] weightedJacobian = internalData.weightedJacobian;
            __CLR4_4_1ahjahjlb90p7ti.R.inc(13659);final int[] permutation = internalData.permutation;
            __CLR4_4_1ahjahjlb90p7ti.R.inc(13660);final double[] diagR = internalData.diagR;
            __CLR4_4_1ahjahjlb90p7ti.R.inc(13661);final double[] jacNorm = internalData.jacNorm;

            __CLR4_4_1ahjahjlb90p7ti.R.inc(13662);double[] weightedResidual = weightMatrixSqrt.operate(currentResiduals);
            __CLR4_4_1ahjahjlb90p7ti.R.inc(13663);for (int i = 0; (((i < nR)&&(__CLR4_4_1ahjahjlb90p7ti.R.iget(13664)!=0|true))||(__CLR4_4_1ahjahjlb90p7ti.R.iget(13665)==0&false)); i++) {{
                __CLR4_4_1ahjahjlb90p7ti.R.inc(13666);qtf[i] = weightedResidual[i];
            }

            // compute Qt.res
            }__CLR4_4_1ahjahjlb90p7ti.R.inc(13667);qTy(qtf, internalData);

            // now we don't need Q anymore,
            // so let jacobian contain the R matrix with its diagonal elements
            __CLR4_4_1ahjahjlb90p7ti.R.inc(13668);for (int k = 0; (((k < solvedCols)&&(__CLR4_4_1ahjahjlb90p7ti.R.iget(13669)!=0|true))||(__CLR4_4_1ahjahjlb90p7ti.R.iget(13670)==0&false)); ++k) {{
                __CLR4_4_1ahjahjlb90p7ti.R.inc(13671);int pk = permutation[k];
                __CLR4_4_1ahjahjlb90p7ti.R.inc(13672);weightedJacobian[k][pk] = diagR[pk];
            }

            }__CLR4_4_1ahjahjlb90p7ti.R.inc(13673);if ((((firstIteration)&&(__CLR4_4_1ahjahjlb90p7ti.R.iget(13674)!=0|true))||(__CLR4_4_1ahjahjlb90p7ti.R.iget(13675)==0&false))) {{
                // scale the point according to the norms of the columns
                // of the initial jacobian
                __CLR4_4_1ahjahjlb90p7ti.R.inc(13676);xNorm = 0;
                __CLR4_4_1ahjahjlb90p7ti.R.inc(13677);for (int k = 0; (((k < nC)&&(__CLR4_4_1ahjahjlb90p7ti.R.iget(13678)!=0|true))||(__CLR4_4_1ahjahjlb90p7ti.R.iget(13679)==0&false)); ++k) {{
                    __CLR4_4_1ahjahjlb90p7ti.R.inc(13680);double dk = jacNorm[k];
                    __CLR4_4_1ahjahjlb90p7ti.R.inc(13681);if ((((dk == 0)&&(__CLR4_4_1ahjahjlb90p7ti.R.iget(13682)!=0|true))||(__CLR4_4_1ahjahjlb90p7ti.R.iget(13683)==0&false))) {{
                        __CLR4_4_1ahjahjlb90p7ti.R.inc(13684);dk = 1.0;
                    }
                    }__CLR4_4_1ahjahjlb90p7ti.R.inc(13685);double xk = dk * currentPoint[k];
                    __CLR4_4_1ahjahjlb90p7ti.R.inc(13686);xNorm  += xk * xk;
                    __CLR4_4_1ahjahjlb90p7ti.R.inc(13687);diag[k] = dk;
                }
                }__CLR4_4_1ahjahjlb90p7ti.R.inc(13688);xNorm = FastMath.sqrt(xNorm);

                // initialize the step bound delta
                __CLR4_4_1ahjahjlb90p7ti.R.inc(13689);delta = ((((xNorm == 0) )&&(__CLR4_4_1ahjahjlb90p7ti.R.iget(13690)!=0|true))||(__CLR4_4_1ahjahjlb90p7ti.R.iget(13691)==0&false))? initialStepBoundFactor : (initialStepBoundFactor * xNorm);
            }

            // check orthogonality between function vector and jacobian columns
            }__CLR4_4_1ahjahjlb90p7ti.R.inc(13692);double maxCosine = 0;
            __CLR4_4_1ahjahjlb90p7ti.R.inc(13693);if ((((currentCost != 0)&&(__CLR4_4_1ahjahjlb90p7ti.R.iget(13694)!=0|true))||(__CLR4_4_1ahjahjlb90p7ti.R.iget(13695)==0&false))) {{
                __CLR4_4_1ahjahjlb90p7ti.R.inc(13696);for (int j = 0; (((j < solvedCols)&&(__CLR4_4_1ahjahjlb90p7ti.R.iget(13697)!=0|true))||(__CLR4_4_1ahjahjlb90p7ti.R.iget(13698)==0&false)); ++j) {{
                    __CLR4_4_1ahjahjlb90p7ti.R.inc(13699);int    pj = permutation[j];
                    __CLR4_4_1ahjahjlb90p7ti.R.inc(13700);double s  = jacNorm[pj];
                    __CLR4_4_1ahjahjlb90p7ti.R.inc(13701);if ((((s != 0)&&(__CLR4_4_1ahjahjlb90p7ti.R.iget(13702)!=0|true))||(__CLR4_4_1ahjahjlb90p7ti.R.iget(13703)==0&false))) {{
                        __CLR4_4_1ahjahjlb90p7ti.R.inc(13704);double sum = 0;
                        __CLR4_4_1ahjahjlb90p7ti.R.inc(13705);for (int i = 0; (((i <= j)&&(__CLR4_4_1ahjahjlb90p7ti.R.iget(13706)!=0|true))||(__CLR4_4_1ahjahjlb90p7ti.R.iget(13707)==0&false)); ++i) {{
                            __CLR4_4_1ahjahjlb90p7ti.R.inc(13708);sum += weightedJacobian[i][pj] * qtf[i];
                        }
                        }__CLR4_4_1ahjahjlb90p7ti.R.inc(13709);maxCosine = FastMath.max(maxCosine, FastMath.abs(sum) / (s * currentCost));
                    }
                }}
            }}
            }__CLR4_4_1ahjahjlb90p7ti.R.inc(13710);if ((((maxCosine <= orthoTolerance)&&(__CLR4_4_1ahjahjlb90p7ti.R.iget(13711)!=0|true))||(__CLR4_4_1ahjahjlb90p7ti.R.iget(13712)==0&false))) {{
                // Convergence has been reached.
                __CLR4_4_1ahjahjlb90p7ti.R.inc(13713);return current;
            }

            // rescale if necessary
            }__CLR4_4_1ahjahjlb90p7ti.R.inc(13714);for (int j = 0; (((j < nC)&&(__CLR4_4_1ahjahjlb90p7ti.R.iget(13715)!=0|true))||(__CLR4_4_1ahjahjlb90p7ti.R.iget(13716)==0&false)); ++j) {{
                __CLR4_4_1ahjahjlb90p7ti.R.inc(13717);diag[j] = FastMath.max(diag[j], jacNorm[j]);
            }

            // Inner loop.
            }__CLR4_4_1ahjahjlb90p7ti.R.inc(13718);for (double ratio = 0; (((ratio < 1.0e-4)&&(__CLR4_4_1ahjahjlb90p7ti.R.iget(13719)!=0|true))||(__CLR4_4_1ahjahjlb90p7ti.R.iget(13720)==0&false));) {{

                // save the state
                __CLR4_4_1ahjahjlb90p7ti.R.inc(13721);for (int j = 0; (((j < solvedCols)&&(__CLR4_4_1ahjahjlb90p7ti.R.iget(13722)!=0|true))||(__CLR4_4_1ahjahjlb90p7ti.R.iget(13723)==0&false)); ++j) {{
                    __CLR4_4_1ahjahjlb90p7ti.R.inc(13724);int pj = permutation[j];
                    __CLR4_4_1ahjahjlb90p7ti.R.inc(13725);oldX[pj] = currentPoint[pj];
                }
                }__CLR4_4_1ahjahjlb90p7ti.R.inc(13726);final double previousCost = currentCost;
                __CLR4_4_1ahjahjlb90p7ti.R.inc(13727);double[] tmpVec = weightedResidual;
                __CLR4_4_1ahjahjlb90p7ti.R.inc(13728);weightedResidual = oldRes;
                __CLR4_4_1ahjahjlb90p7ti.R.inc(13729);oldRes    = tmpVec;
                __CLR4_4_1ahjahjlb90p7ti.R.inc(13730);tmpVec    = currentObjective;
                __CLR4_4_1ahjahjlb90p7ti.R.inc(13731);currentObjective = oldObj;
                __CLR4_4_1ahjahjlb90p7ti.R.inc(13732);oldObj    = tmpVec;

                // determine the Levenberg-Marquardt parameter
                __CLR4_4_1ahjahjlb90p7ti.R.inc(13733);determineLMParameter(qtf, delta, diag,
                                     internalData, solvedCols,
                                     work1, work2, work3);

                // compute the new point and the norm of the evolution direction
                __CLR4_4_1ahjahjlb90p7ti.R.inc(13734);double lmNorm = 0;
                __CLR4_4_1ahjahjlb90p7ti.R.inc(13735);for (int j = 0; (((j < solvedCols)&&(__CLR4_4_1ahjahjlb90p7ti.R.iget(13736)!=0|true))||(__CLR4_4_1ahjahjlb90p7ti.R.iget(13737)==0&false)); ++j) {{
                    __CLR4_4_1ahjahjlb90p7ti.R.inc(13738);int pj = permutation[j];
                    __CLR4_4_1ahjahjlb90p7ti.R.inc(13739);lmDir[pj] = -lmDir[pj];
                    __CLR4_4_1ahjahjlb90p7ti.R.inc(13740);currentPoint[pj] = oldX[pj] + lmDir[pj];
                    __CLR4_4_1ahjahjlb90p7ti.R.inc(13741);double s = diag[pj] * lmDir[pj];
                    __CLR4_4_1ahjahjlb90p7ti.R.inc(13742);lmNorm  += s * s;
                }
                }__CLR4_4_1ahjahjlb90p7ti.R.inc(13743);lmNorm = FastMath.sqrt(lmNorm);
                // on the first iteration, adjust the initial step bound.
                __CLR4_4_1ahjahjlb90p7ti.R.inc(13744);if ((((firstIteration)&&(__CLR4_4_1ahjahjlb90p7ti.R.iget(13745)!=0|true))||(__CLR4_4_1ahjahjlb90p7ti.R.iget(13746)==0&false))) {{
                    __CLR4_4_1ahjahjlb90p7ti.R.inc(13747);delta = FastMath.min(delta, lmNorm);
                }

                // Evaluate the function at x + p and calculate its norm.
                }__CLR4_4_1ahjahjlb90p7ti.R.inc(13748);currentObjective = computeObjectiveValue(currentPoint);
                __CLR4_4_1ahjahjlb90p7ti.R.inc(13749);currentResiduals = computeResiduals(currentObjective);
                __CLR4_4_1ahjahjlb90p7ti.R.inc(13750);current = new PointVectorValuePair(currentPoint, currentObjective);
                __CLR4_4_1ahjahjlb90p7ti.R.inc(13751);currentCost = computeCost(currentResiduals);

                // compute the scaled actual reduction
                __CLR4_4_1ahjahjlb90p7ti.R.inc(13752);double actRed = -1.0;
                __CLR4_4_1ahjahjlb90p7ti.R.inc(13753);if ((((0.1 * currentCost < previousCost)&&(__CLR4_4_1ahjahjlb90p7ti.R.iget(13754)!=0|true))||(__CLR4_4_1ahjahjlb90p7ti.R.iget(13755)==0&false))) {{
                    __CLR4_4_1ahjahjlb90p7ti.R.inc(13756);double r = currentCost / previousCost;
                    __CLR4_4_1ahjahjlb90p7ti.R.inc(13757);actRed = 1.0 - r * r;
                }

                // compute the scaled predicted reduction
                // and the scaled directional derivative
                }__CLR4_4_1ahjahjlb90p7ti.R.inc(13758);for (int j = 0; (((j < solvedCols)&&(__CLR4_4_1ahjahjlb90p7ti.R.iget(13759)!=0|true))||(__CLR4_4_1ahjahjlb90p7ti.R.iget(13760)==0&false)); ++j) {{
                    __CLR4_4_1ahjahjlb90p7ti.R.inc(13761);int pj = permutation[j];
                    __CLR4_4_1ahjahjlb90p7ti.R.inc(13762);double dirJ = lmDir[pj];
                    __CLR4_4_1ahjahjlb90p7ti.R.inc(13763);work1[j] = 0;
                    __CLR4_4_1ahjahjlb90p7ti.R.inc(13764);for (int i = 0; (((i <= j)&&(__CLR4_4_1ahjahjlb90p7ti.R.iget(13765)!=0|true))||(__CLR4_4_1ahjahjlb90p7ti.R.iget(13766)==0&false)); ++i) {{
                        __CLR4_4_1ahjahjlb90p7ti.R.inc(13767);work1[i] += weightedJacobian[i][pj] * dirJ;
                    }
                }}
                }__CLR4_4_1ahjahjlb90p7ti.R.inc(13768);double coeff1 = 0;
                __CLR4_4_1ahjahjlb90p7ti.R.inc(13769);for (int j = 0; (((j < solvedCols)&&(__CLR4_4_1ahjahjlb90p7ti.R.iget(13770)!=0|true))||(__CLR4_4_1ahjahjlb90p7ti.R.iget(13771)==0&false)); ++j) {{
                    __CLR4_4_1ahjahjlb90p7ti.R.inc(13772);coeff1 += work1[j] * work1[j];
                }
                }__CLR4_4_1ahjahjlb90p7ti.R.inc(13773);double pc2 = previousCost * previousCost;
                __CLR4_4_1ahjahjlb90p7ti.R.inc(13774);coeff1 = coeff1 / pc2;
                __CLR4_4_1ahjahjlb90p7ti.R.inc(13775);double coeff2 = lmPar * lmNorm * lmNorm / pc2;
                __CLR4_4_1ahjahjlb90p7ti.R.inc(13776);double preRed = coeff1 + 2 * coeff2;
                __CLR4_4_1ahjahjlb90p7ti.R.inc(13777);double dirDer = -(coeff1 + coeff2);

                // ratio of the actual to the predicted reduction
                __CLR4_4_1ahjahjlb90p7ti.R.inc(13778);ratio = ((((preRed == 0) )&&(__CLR4_4_1ahjahjlb90p7ti.R.iget(13779)!=0|true))||(__CLR4_4_1ahjahjlb90p7ti.R.iget(13780)==0&false))? 0 : (actRed / preRed);

                // update the step bound
                __CLR4_4_1ahjahjlb90p7ti.R.inc(13781);if ((((ratio <= 0.25)&&(__CLR4_4_1ahjahjlb90p7ti.R.iget(13782)!=0|true))||(__CLR4_4_1ahjahjlb90p7ti.R.iget(13783)==0&false))) {{
                    __CLR4_4_1ahjahjlb90p7ti.R.inc(13784);double tmp =
                        ((((actRed < 0) )&&(__CLR4_4_1ahjahjlb90p7ti.R.iget(13785)!=0|true))||(__CLR4_4_1ahjahjlb90p7ti.R.iget(13786)==0&false))? (0.5 * dirDer / (dirDer + 0.5 * actRed)) : 0.5;
                        __CLR4_4_1ahjahjlb90p7ti.R.inc(13787);if (((((0.1 * currentCost >= previousCost) || (tmp < 0.1))&&(__CLR4_4_1ahjahjlb90p7ti.R.iget(13788)!=0|true))||(__CLR4_4_1ahjahjlb90p7ti.R.iget(13789)==0&false))) {{
                            __CLR4_4_1ahjahjlb90p7ti.R.inc(13790);tmp = 0.1;
                        }
                        }__CLR4_4_1ahjahjlb90p7ti.R.inc(13791);delta = tmp * FastMath.min(delta, 10.0 * lmNorm);
                        __CLR4_4_1ahjahjlb90p7ti.R.inc(13792);lmPar /= tmp;
                } }else {__CLR4_4_1ahjahjlb90p7ti.R.inc(13793);if (((((lmPar == 0) || (ratio >= 0.75))&&(__CLR4_4_1ahjahjlb90p7ti.R.iget(13794)!=0|true))||(__CLR4_4_1ahjahjlb90p7ti.R.iget(13795)==0&false))) {{
                    __CLR4_4_1ahjahjlb90p7ti.R.inc(13796);delta = 2 * lmNorm;
                    __CLR4_4_1ahjahjlb90p7ti.R.inc(13797);lmPar *= 0.5;
                }

                // test for successful iteration.
                }}__CLR4_4_1ahjahjlb90p7ti.R.inc(13798);if ((((ratio >= 1.0e-4)&&(__CLR4_4_1ahjahjlb90p7ti.R.iget(13799)!=0|true))||(__CLR4_4_1ahjahjlb90p7ti.R.iget(13800)==0&false))) {{
                    // successful iteration, update the norm
                    __CLR4_4_1ahjahjlb90p7ti.R.inc(13801);firstIteration = false;
                    __CLR4_4_1ahjahjlb90p7ti.R.inc(13802);xNorm = 0;
                    __CLR4_4_1ahjahjlb90p7ti.R.inc(13803);for (int k = 0; (((k < nC)&&(__CLR4_4_1ahjahjlb90p7ti.R.iget(13804)!=0|true))||(__CLR4_4_1ahjahjlb90p7ti.R.iget(13805)==0&false)); ++k) {{
                        __CLR4_4_1ahjahjlb90p7ti.R.inc(13806);double xK = diag[k] * currentPoint[k];
                        __CLR4_4_1ahjahjlb90p7ti.R.inc(13807);xNorm += xK * xK;
                    }
                    }__CLR4_4_1ahjahjlb90p7ti.R.inc(13808);xNorm = FastMath.sqrt(xNorm);

                    // tests for convergence.
                    __CLR4_4_1ahjahjlb90p7ti.R.inc(13809);if ((((checker != null && checker.converged(getIterations(), previous, current))&&(__CLR4_4_1ahjahjlb90p7ti.R.iget(13810)!=0|true))||(__CLR4_4_1ahjahjlb90p7ti.R.iget(13811)==0&false))) {{
                        __CLR4_4_1ahjahjlb90p7ti.R.inc(13812);return current;
                    }
                }} }else {{
                    // failed iteration, reset the previous values
                    __CLR4_4_1ahjahjlb90p7ti.R.inc(13813);currentCost = previousCost;
                    __CLR4_4_1ahjahjlb90p7ti.R.inc(13814);for (int j = 0; (((j < solvedCols)&&(__CLR4_4_1ahjahjlb90p7ti.R.iget(13815)!=0|true))||(__CLR4_4_1ahjahjlb90p7ti.R.iget(13816)==0&false)); ++j) {{
                        __CLR4_4_1ahjahjlb90p7ti.R.inc(13817);int pj = permutation[j];
                        __CLR4_4_1ahjahjlb90p7ti.R.inc(13818);currentPoint[pj] = oldX[pj];
                    }
                    }__CLR4_4_1ahjahjlb90p7ti.R.inc(13819);tmpVec    = weightedResidual;
                    __CLR4_4_1ahjahjlb90p7ti.R.inc(13820);weightedResidual = oldRes;
                    __CLR4_4_1ahjahjlb90p7ti.R.inc(13821);oldRes    = tmpVec;
                    __CLR4_4_1ahjahjlb90p7ti.R.inc(13822);tmpVec    = currentObjective;
                    __CLR4_4_1ahjahjlb90p7ti.R.inc(13823);currentObjective = oldObj;
                    __CLR4_4_1ahjahjlb90p7ti.R.inc(13824);oldObj    = tmpVec;
                    // Reset "current" to previous values.
                    __CLR4_4_1ahjahjlb90p7ti.R.inc(13825);current = new PointVectorValuePair(currentPoint, currentObjective);
                }

                // Default convergence criteria.
                }__CLR4_4_1ahjahjlb90p7ti.R.inc(13826);if (((((FastMath.abs(actRed) <= costRelativeTolerance &&
                     preRed <= costRelativeTolerance &&
                     ratio <= 2.0) ||
                    delta <= parRelativeTolerance * xNorm)&&(__CLR4_4_1ahjahjlb90p7ti.R.iget(13827)!=0|true))||(__CLR4_4_1ahjahjlb90p7ti.R.iget(13828)==0&false))) {{
                    __CLR4_4_1ahjahjlb90p7ti.R.inc(13829);return current;
                }

                // tests for termination and stringent tolerances
                }__CLR4_4_1ahjahjlb90p7ti.R.inc(13830);if ((((FastMath.abs(actRed) <= TWO_EPS &&
                    preRed <= TWO_EPS &&
                    ratio <= 2.0)&&(__CLR4_4_1ahjahjlb90p7ti.R.iget(13831)!=0|true))||(__CLR4_4_1ahjahjlb90p7ti.R.iget(13832)==0&false))) {{
                    __CLR4_4_1ahjahjlb90p7ti.R.inc(13833);throw new ConvergenceException(LocalizedFormats.TOO_SMALL_COST_RELATIVE_TOLERANCE,
                                                   costRelativeTolerance);
                } }else {__CLR4_4_1ahjahjlb90p7ti.R.inc(13834);if ((((delta <= TWO_EPS * xNorm)&&(__CLR4_4_1ahjahjlb90p7ti.R.iget(13835)!=0|true))||(__CLR4_4_1ahjahjlb90p7ti.R.iget(13836)==0&false))) {{
                    __CLR4_4_1ahjahjlb90p7ti.R.inc(13837);throw new ConvergenceException(LocalizedFormats.TOO_SMALL_PARAMETERS_RELATIVE_TOLERANCE,
                                                   parRelativeTolerance);
                } }else {__CLR4_4_1ahjahjlb90p7ti.R.inc(13838);if ((((maxCosine <= TWO_EPS)&&(__CLR4_4_1ahjahjlb90p7ti.R.iget(13839)!=0|true))||(__CLR4_4_1ahjahjlb90p7ti.R.iget(13840)==0&false))) {{
                    __CLR4_4_1ahjahjlb90p7ti.R.inc(13841);throw new ConvergenceException(LocalizedFormats.TOO_SMALL_ORTHOGONALITY_TOLERANCE,
                                                   orthoTolerance);
                }
            }}}}
        }}
    }}finally{__CLR4_4_1ahjahjlb90p7ti.R.flushNeeded();}}

    /**
     * Holds internal data.
     * This structure was created so that all optimizer fields can be "final".
     * Code should be further refactored in order to not pass around arguments
     * that will modified in-place (cf. "work" arrays).
     */
    private static class InternalData {
        /** Weighted Jacobian. */
        private final double[][] weightedJacobian;
        /** Columns permutation array. */
        private final int[] permutation;
        /** Rank of the Jacobian matrix. */
        private final int rank;
        /** Diagonal elements of the R matrix in the QR decomposition. */
        private final double[] diagR;
        /** Norms of the columns of the jacobian matrix. */
        private final double[] jacNorm;
        /** Coefficients of the Householder transforms vectors. */
        private final double[] beta;

        /**
         * @param weightedJacobian Weighted Jacobian.
         * @param permutation Columns permutation array.
         * @param rank Rank of the Jacobian matrix.
         * @param diagR Diagonal elements of the R matrix in the QR decomposition.
         * @param jacNorm Norms of the columns of the jacobian matrix.
         * @param beta Coefficients of the Householder transforms vectors.
         */
        InternalData(double[][] weightedJacobian,
                     int[] permutation,
                     int rank,
                     double[] diagR,
                     double[] jacNorm,
                     double[] beta) {try{__CLR4_4_1ahjahjlb90p7ti.R.inc(13842);
            __CLR4_4_1ahjahjlb90p7ti.R.inc(13843);this.weightedJacobian = weightedJacobian;
            __CLR4_4_1ahjahjlb90p7ti.R.inc(13844);this.permutation = permutation;
            __CLR4_4_1ahjahjlb90p7ti.R.inc(13845);this.rank = rank;
            __CLR4_4_1ahjahjlb90p7ti.R.inc(13846);this.diagR = diagR;
            __CLR4_4_1ahjahjlb90p7ti.R.inc(13847);this.jacNorm = jacNorm;
            __CLR4_4_1ahjahjlb90p7ti.R.inc(13848);this.beta = beta;
        }finally{__CLR4_4_1ahjahjlb90p7ti.R.flushNeeded();}}
    }

    /**
     * Determines the Levenberg-Marquardt parameter.
     *
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
     * @param qy Array containing qTy.
     * @param delta Upper bound on the euclidean norm of diagR * lmDir.
     * @param diag Diagonal matrix.
     * @param internalData Data (modified in-place in this method).
     * @param solvedCols Number of solved point.
     * @param work1 work array
     * @param work2 work array
     * @param work3 work array
     */
    private void determineLMParameter(double[] qy, double delta, double[] diag,
                                      InternalData internalData, int solvedCols,
                                      double[] work1, double[] work2, double[] work3) {try{__CLR4_4_1ahjahjlb90p7ti.R.inc(13849);
        __CLR4_4_1ahjahjlb90p7ti.R.inc(13850);final double[][] weightedJacobian = internalData.weightedJacobian;
        __CLR4_4_1ahjahjlb90p7ti.R.inc(13851);final int[] permutation = internalData.permutation;
        __CLR4_4_1ahjahjlb90p7ti.R.inc(13852);final int rank = internalData.rank;
        __CLR4_4_1ahjahjlb90p7ti.R.inc(13853);final double[] diagR = internalData.diagR;

        __CLR4_4_1ahjahjlb90p7ti.R.inc(13854);final int nC = weightedJacobian[0].length;

        // compute and store in x the gauss-newton direction, if the
        // jacobian is rank-deficient, obtain a least squares solution
        __CLR4_4_1ahjahjlb90p7ti.R.inc(13855);for (int j = 0; (((j < rank)&&(__CLR4_4_1ahjahjlb90p7ti.R.iget(13856)!=0|true))||(__CLR4_4_1ahjahjlb90p7ti.R.iget(13857)==0&false)); ++j) {{
            __CLR4_4_1ahjahjlb90p7ti.R.inc(13858);lmDir[permutation[j]] = qy[j];
        }
        }__CLR4_4_1ahjahjlb90p7ti.R.inc(13859);for (int j = rank; (((j < nC)&&(__CLR4_4_1ahjahjlb90p7ti.R.iget(13860)!=0|true))||(__CLR4_4_1ahjahjlb90p7ti.R.iget(13861)==0&false)); ++j) {{
            __CLR4_4_1ahjahjlb90p7ti.R.inc(13862);lmDir[permutation[j]] = 0;
        }
        }__CLR4_4_1ahjahjlb90p7ti.R.inc(13863);for (int k = rank - 1; (((k >= 0)&&(__CLR4_4_1ahjahjlb90p7ti.R.iget(13864)!=0|true))||(__CLR4_4_1ahjahjlb90p7ti.R.iget(13865)==0&false)); --k) {{
            __CLR4_4_1ahjahjlb90p7ti.R.inc(13866);int pk = permutation[k];
            __CLR4_4_1ahjahjlb90p7ti.R.inc(13867);double ypk = lmDir[pk] / diagR[pk];
            __CLR4_4_1ahjahjlb90p7ti.R.inc(13868);for (int i = 0; (((i < k)&&(__CLR4_4_1ahjahjlb90p7ti.R.iget(13869)!=0|true))||(__CLR4_4_1ahjahjlb90p7ti.R.iget(13870)==0&false)); ++i) {{
                __CLR4_4_1ahjahjlb90p7ti.R.inc(13871);lmDir[permutation[i]] -= ypk * weightedJacobian[i][pk];
            }
            }__CLR4_4_1ahjahjlb90p7ti.R.inc(13872);lmDir[pk] = ypk;
        }

        // evaluate the function at the origin, and test
        // for acceptance of the Gauss-Newton direction
        }__CLR4_4_1ahjahjlb90p7ti.R.inc(13873);double dxNorm = 0;
        __CLR4_4_1ahjahjlb90p7ti.R.inc(13874);for (int j = 0; (((j < solvedCols)&&(__CLR4_4_1ahjahjlb90p7ti.R.iget(13875)!=0|true))||(__CLR4_4_1ahjahjlb90p7ti.R.iget(13876)==0&false)); ++j) {{
            __CLR4_4_1ahjahjlb90p7ti.R.inc(13877);int pj = permutation[j];
            __CLR4_4_1ahjahjlb90p7ti.R.inc(13878);double s = diag[pj] * lmDir[pj];
            __CLR4_4_1ahjahjlb90p7ti.R.inc(13879);work1[pj] = s;
            __CLR4_4_1ahjahjlb90p7ti.R.inc(13880);dxNorm += s * s;
        }
        }__CLR4_4_1ahjahjlb90p7ti.R.inc(13881);dxNorm = FastMath.sqrt(dxNorm);
        __CLR4_4_1ahjahjlb90p7ti.R.inc(13882);double fp = dxNorm - delta;
        __CLR4_4_1ahjahjlb90p7ti.R.inc(13883);if ((((fp <= 0.1 * delta)&&(__CLR4_4_1ahjahjlb90p7ti.R.iget(13884)!=0|true))||(__CLR4_4_1ahjahjlb90p7ti.R.iget(13885)==0&false))) {{
            __CLR4_4_1ahjahjlb90p7ti.R.inc(13886);lmPar = 0;
            __CLR4_4_1ahjahjlb90p7ti.R.inc(13887);return;
        }

        // if the jacobian is not rank deficient, the Newton step provides
        // a lower bound, parl, for the zero of the function,
        // otherwise set this bound to zero
        }__CLR4_4_1ahjahjlb90p7ti.R.inc(13888);double sum2;
        __CLR4_4_1ahjahjlb90p7ti.R.inc(13889);double parl = 0;
        __CLR4_4_1ahjahjlb90p7ti.R.inc(13890);if ((((rank == solvedCols)&&(__CLR4_4_1ahjahjlb90p7ti.R.iget(13891)!=0|true))||(__CLR4_4_1ahjahjlb90p7ti.R.iget(13892)==0&false))) {{
            __CLR4_4_1ahjahjlb90p7ti.R.inc(13893);for (int j = 0; (((j < solvedCols)&&(__CLR4_4_1ahjahjlb90p7ti.R.iget(13894)!=0|true))||(__CLR4_4_1ahjahjlb90p7ti.R.iget(13895)==0&false)); ++j) {{
                __CLR4_4_1ahjahjlb90p7ti.R.inc(13896);int pj = permutation[j];
                __CLR4_4_1ahjahjlb90p7ti.R.inc(13897);work1[pj] *= diag[pj] / dxNorm;
            }
            }__CLR4_4_1ahjahjlb90p7ti.R.inc(13898);sum2 = 0;
            __CLR4_4_1ahjahjlb90p7ti.R.inc(13899);for (int j = 0; (((j < solvedCols)&&(__CLR4_4_1ahjahjlb90p7ti.R.iget(13900)!=0|true))||(__CLR4_4_1ahjahjlb90p7ti.R.iget(13901)==0&false)); ++j) {{
                __CLR4_4_1ahjahjlb90p7ti.R.inc(13902);int pj = permutation[j];
                __CLR4_4_1ahjahjlb90p7ti.R.inc(13903);double sum = 0;
                __CLR4_4_1ahjahjlb90p7ti.R.inc(13904);for (int i = 0; (((i < j)&&(__CLR4_4_1ahjahjlb90p7ti.R.iget(13905)!=0|true))||(__CLR4_4_1ahjahjlb90p7ti.R.iget(13906)==0&false)); ++i) {{
                    __CLR4_4_1ahjahjlb90p7ti.R.inc(13907);sum += weightedJacobian[i][pj] * work1[permutation[i]];
                }
                }__CLR4_4_1ahjahjlb90p7ti.R.inc(13908);double s = (work1[pj] - sum) / diagR[pj];
                __CLR4_4_1ahjahjlb90p7ti.R.inc(13909);work1[pj] = s;
                __CLR4_4_1ahjahjlb90p7ti.R.inc(13910);sum2 += s * s;
            }
            }__CLR4_4_1ahjahjlb90p7ti.R.inc(13911);parl = fp / (delta * sum2);
        }

        // calculate an upper bound, paru, for the zero of the function
        }__CLR4_4_1ahjahjlb90p7ti.R.inc(13912);sum2 = 0;
        __CLR4_4_1ahjahjlb90p7ti.R.inc(13913);for (int j = 0; (((j < solvedCols)&&(__CLR4_4_1ahjahjlb90p7ti.R.iget(13914)!=0|true))||(__CLR4_4_1ahjahjlb90p7ti.R.iget(13915)==0&false)); ++j) {{
            __CLR4_4_1ahjahjlb90p7ti.R.inc(13916);int pj = permutation[j];
            __CLR4_4_1ahjahjlb90p7ti.R.inc(13917);double sum = 0;
            __CLR4_4_1ahjahjlb90p7ti.R.inc(13918);for (int i = 0; (((i <= j)&&(__CLR4_4_1ahjahjlb90p7ti.R.iget(13919)!=0|true))||(__CLR4_4_1ahjahjlb90p7ti.R.iget(13920)==0&false)); ++i) {{
                __CLR4_4_1ahjahjlb90p7ti.R.inc(13921);sum += weightedJacobian[i][pj] * qy[i];
            }
            }__CLR4_4_1ahjahjlb90p7ti.R.inc(13922);sum /= diag[pj];
            __CLR4_4_1ahjahjlb90p7ti.R.inc(13923);sum2 += sum * sum;
        }
        }__CLR4_4_1ahjahjlb90p7ti.R.inc(13924);double gNorm = FastMath.sqrt(sum2);
        __CLR4_4_1ahjahjlb90p7ti.R.inc(13925);double paru = gNorm / delta;
        __CLR4_4_1ahjahjlb90p7ti.R.inc(13926);if ((((paru == 0)&&(__CLR4_4_1ahjahjlb90p7ti.R.iget(13927)!=0|true))||(__CLR4_4_1ahjahjlb90p7ti.R.iget(13928)==0&false))) {{
            __CLR4_4_1ahjahjlb90p7ti.R.inc(13929);paru = Precision.SAFE_MIN / FastMath.min(delta, 0.1);
        }

        // if the input par lies outside of the interval (parl,paru),
        // set par to the closer endpoint
        }__CLR4_4_1ahjahjlb90p7ti.R.inc(13930);lmPar = FastMath.min(paru, FastMath.max(lmPar, parl));
        __CLR4_4_1ahjahjlb90p7ti.R.inc(13931);if ((((lmPar == 0)&&(__CLR4_4_1ahjahjlb90p7ti.R.iget(13932)!=0|true))||(__CLR4_4_1ahjahjlb90p7ti.R.iget(13933)==0&false))) {{
            __CLR4_4_1ahjahjlb90p7ti.R.inc(13934);lmPar = gNorm / dxNorm;
        }

        }__CLR4_4_1ahjahjlb90p7ti.R.inc(13935);for (int countdown = 10; (((countdown >= 0)&&(__CLR4_4_1ahjahjlb90p7ti.R.iget(13936)!=0|true))||(__CLR4_4_1ahjahjlb90p7ti.R.iget(13937)==0&false)); --countdown) {{

            // evaluate the function at the current value of lmPar
            __CLR4_4_1ahjahjlb90p7ti.R.inc(13938);if ((((lmPar == 0)&&(__CLR4_4_1ahjahjlb90p7ti.R.iget(13939)!=0|true))||(__CLR4_4_1ahjahjlb90p7ti.R.iget(13940)==0&false))) {{
                __CLR4_4_1ahjahjlb90p7ti.R.inc(13941);lmPar = FastMath.max(Precision.SAFE_MIN, 0.001 * paru);
            }
            }__CLR4_4_1ahjahjlb90p7ti.R.inc(13942);double sPar = FastMath.sqrt(lmPar);
            __CLR4_4_1ahjahjlb90p7ti.R.inc(13943);for (int j = 0; (((j < solvedCols)&&(__CLR4_4_1ahjahjlb90p7ti.R.iget(13944)!=0|true))||(__CLR4_4_1ahjahjlb90p7ti.R.iget(13945)==0&false)); ++j) {{
                __CLR4_4_1ahjahjlb90p7ti.R.inc(13946);int pj = permutation[j];
                __CLR4_4_1ahjahjlb90p7ti.R.inc(13947);work1[pj] = sPar * diag[pj];
            }
            }__CLR4_4_1ahjahjlb90p7ti.R.inc(13948);determineLMDirection(qy, work1, work2, internalData, solvedCols, work3);

            __CLR4_4_1ahjahjlb90p7ti.R.inc(13949);dxNorm = 0;
            __CLR4_4_1ahjahjlb90p7ti.R.inc(13950);for (int j = 0; (((j < solvedCols)&&(__CLR4_4_1ahjahjlb90p7ti.R.iget(13951)!=0|true))||(__CLR4_4_1ahjahjlb90p7ti.R.iget(13952)==0&false)); ++j) {{
                __CLR4_4_1ahjahjlb90p7ti.R.inc(13953);int pj = permutation[j];
                __CLR4_4_1ahjahjlb90p7ti.R.inc(13954);double s = diag[pj] * lmDir[pj];
                __CLR4_4_1ahjahjlb90p7ti.R.inc(13955);work3[pj] = s;
                __CLR4_4_1ahjahjlb90p7ti.R.inc(13956);dxNorm += s * s;
            }
            }__CLR4_4_1ahjahjlb90p7ti.R.inc(13957);dxNorm = FastMath.sqrt(dxNorm);
            __CLR4_4_1ahjahjlb90p7ti.R.inc(13958);double previousFP = fp;
            __CLR4_4_1ahjahjlb90p7ti.R.inc(13959);fp = dxNorm - delta;

            // if the function is small enough, accept the current value
            // of lmPar, also test for the exceptional cases where parl is zero
            __CLR4_4_1ahjahjlb90p7ti.R.inc(13960);if ((((FastMath.abs(fp) <= 0.1 * delta ||
                (parl == 0 &&
                 fp <= previousFP &&
                 previousFP < 0))&&(__CLR4_4_1ahjahjlb90p7ti.R.iget(13961)!=0|true))||(__CLR4_4_1ahjahjlb90p7ti.R.iget(13962)==0&false))) {{
                __CLR4_4_1ahjahjlb90p7ti.R.inc(13963);return;
            }

            // compute the Newton correction
            }__CLR4_4_1ahjahjlb90p7ti.R.inc(13964);for (int j = 0; (((j < solvedCols)&&(__CLR4_4_1ahjahjlb90p7ti.R.iget(13965)!=0|true))||(__CLR4_4_1ahjahjlb90p7ti.R.iget(13966)==0&false)); ++j) {{
                __CLR4_4_1ahjahjlb90p7ti.R.inc(13967);int pj = permutation[j];
                __CLR4_4_1ahjahjlb90p7ti.R.inc(13968);work1[pj] = work3[pj] * diag[pj] / dxNorm;
            }
            }__CLR4_4_1ahjahjlb90p7ti.R.inc(13969);for (int j = 0; (((j < solvedCols)&&(__CLR4_4_1ahjahjlb90p7ti.R.iget(13970)!=0|true))||(__CLR4_4_1ahjahjlb90p7ti.R.iget(13971)==0&false)); ++j) {{
                __CLR4_4_1ahjahjlb90p7ti.R.inc(13972);int pj = permutation[j];
                __CLR4_4_1ahjahjlb90p7ti.R.inc(13973);work1[pj] /= work2[j];
                __CLR4_4_1ahjahjlb90p7ti.R.inc(13974);double tmp = work1[pj];
                __CLR4_4_1ahjahjlb90p7ti.R.inc(13975);for (int i = j + 1; (((i < solvedCols)&&(__CLR4_4_1ahjahjlb90p7ti.R.iget(13976)!=0|true))||(__CLR4_4_1ahjahjlb90p7ti.R.iget(13977)==0&false)); ++i) {{
                    __CLR4_4_1ahjahjlb90p7ti.R.inc(13978);work1[permutation[i]] -= weightedJacobian[i][pj] * tmp;
                }
            }}
            }__CLR4_4_1ahjahjlb90p7ti.R.inc(13979);sum2 = 0;
            __CLR4_4_1ahjahjlb90p7ti.R.inc(13980);for (int j = 0; (((j < solvedCols)&&(__CLR4_4_1ahjahjlb90p7ti.R.iget(13981)!=0|true))||(__CLR4_4_1ahjahjlb90p7ti.R.iget(13982)==0&false)); ++j) {{
                __CLR4_4_1ahjahjlb90p7ti.R.inc(13983);double s = work1[permutation[j]];
                __CLR4_4_1ahjahjlb90p7ti.R.inc(13984);sum2 += s * s;
            }
            }__CLR4_4_1ahjahjlb90p7ti.R.inc(13985);double correction = fp / (delta * sum2);

            // depending on the sign of the function, update parl or paru.
            __CLR4_4_1ahjahjlb90p7ti.R.inc(13986);if ((((fp > 0)&&(__CLR4_4_1ahjahjlb90p7ti.R.iget(13987)!=0|true))||(__CLR4_4_1ahjahjlb90p7ti.R.iget(13988)==0&false))) {{
                __CLR4_4_1ahjahjlb90p7ti.R.inc(13989);parl = FastMath.max(parl, lmPar);
            } }else {__CLR4_4_1ahjahjlb90p7ti.R.inc(13990);if ((((fp < 0)&&(__CLR4_4_1ahjahjlb90p7ti.R.iget(13991)!=0|true))||(__CLR4_4_1ahjahjlb90p7ti.R.iget(13992)==0&false))) {{
                __CLR4_4_1ahjahjlb90p7ti.R.inc(13993);paru = FastMath.min(paru, lmPar);
            }

            // compute an improved estimate for lmPar
            }}__CLR4_4_1ahjahjlb90p7ti.R.inc(13994);lmPar = FastMath.max(parl, lmPar + correction);
        }

        }__CLR4_4_1ahjahjlb90p7ti.R.inc(13995);return;
    }finally{__CLR4_4_1ahjahjlb90p7ti.R.flushNeeded();}}

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
     * @param internalData Data (modified in-place in this method).
     * @param solvedCols Number of sloved point.
     * @param work work array
     */
    private void determineLMDirection(double[] qy, double[] diag,
                                      double[] lmDiag,
                                      InternalData internalData,
                                      int solvedCols,
                                      double[] work) {try{__CLR4_4_1ahjahjlb90p7ti.R.inc(13996);
        __CLR4_4_1ahjahjlb90p7ti.R.inc(13997);final int[] permutation = internalData.permutation;
        __CLR4_4_1ahjahjlb90p7ti.R.inc(13998);final double[][] weightedJacobian = internalData.weightedJacobian;
        __CLR4_4_1ahjahjlb90p7ti.R.inc(13999);final double[] diagR = internalData.diagR;

        // copy R and Qty to preserve input and initialize s
        //  in particular, save the diagonal elements of R in lmDir
        __CLR4_4_1ahjahjlb90p7ti.R.inc(14000);for (int j = 0; (((j < solvedCols)&&(__CLR4_4_1ahjahjlb90p7ti.R.iget(14001)!=0|true))||(__CLR4_4_1ahjahjlb90p7ti.R.iget(14002)==0&false)); ++j) {{
            __CLR4_4_1ahjahjlb90p7ti.R.inc(14003);int pj = permutation[j];
            __CLR4_4_1ahjahjlb90p7ti.R.inc(14004);for (int i = j + 1; (((i < solvedCols)&&(__CLR4_4_1ahjahjlb90p7ti.R.iget(14005)!=0|true))||(__CLR4_4_1ahjahjlb90p7ti.R.iget(14006)==0&false)); ++i) {{
                __CLR4_4_1ahjahjlb90p7ti.R.inc(14007);weightedJacobian[i][pj] = weightedJacobian[j][permutation[i]];
            }
            }__CLR4_4_1ahjahjlb90p7ti.R.inc(14008);lmDir[j] = diagR[pj];
            __CLR4_4_1ahjahjlb90p7ti.R.inc(14009);work[j]  = qy[j];
        }

        // eliminate the diagonal matrix d using a Givens rotation
        }__CLR4_4_1ahjahjlb90p7ti.R.inc(14010);for (int j = 0; (((j < solvedCols)&&(__CLR4_4_1ahjahjlb90p7ti.R.iget(14011)!=0|true))||(__CLR4_4_1ahjahjlb90p7ti.R.iget(14012)==0&false)); ++j) {{

            // prepare the row of d to be eliminated, locating the
            // diagonal element using p from the Q.R. factorization
            __CLR4_4_1ahjahjlb90p7ti.R.inc(14013);int pj = permutation[j];
            __CLR4_4_1ahjahjlb90p7ti.R.inc(14014);double dpj = diag[pj];
            __CLR4_4_1ahjahjlb90p7ti.R.inc(14015);if ((((dpj != 0)&&(__CLR4_4_1ahjahjlb90p7ti.R.iget(14016)!=0|true))||(__CLR4_4_1ahjahjlb90p7ti.R.iget(14017)==0&false))) {{
                __CLR4_4_1ahjahjlb90p7ti.R.inc(14018);Arrays.fill(lmDiag, j + 1, lmDiag.length, 0);
            }
            }__CLR4_4_1ahjahjlb90p7ti.R.inc(14019);lmDiag[j] = dpj;

            //  the transformations to eliminate the row of d
            // modify only a single element of Qty
            // beyond the first n, which is initially zero.
            __CLR4_4_1ahjahjlb90p7ti.R.inc(14020);double qtbpj = 0;
            __CLR4_4_1ahjahjlb90p7ti.R.inc(14021);for (int k = j; (((k < solvedCols)&&(__CLR4_4_1ahjahjlb90p7ti.R.iget(14022)!=0|true))||(__CLR4_4_1ahjahjlb90p7ti.R.iget(14023)==0&false)); ++k) {{
                __CLR4_4_1ahjahjlb90p7ti.R.inc(14024);int pk = permutation[k];

                // determine a Givens rotation which eliminates the
                // appropriate element in the current row of d
                __CLR4_4_1ahjahjlb90p7ti.R.inc(14025);if ((((lmDiag[k] != 0)&&(__CLR4_4_1ahjahjlb90p7ti.R.iget(14026)!=0|true))||(__CLR4_4_1ahjahjlb90p7ti.R.iget(14027)==0&false))) {{

                    __CLR4_4_1ahjahjlb90p7ti.R.inc(14028);final double sin;
                    __CLR4_4_1ahjahjlb90p7ti.R.inc(14029);final double cos;
                    __CLR4_4_1ahjahjlb90p7ti.R.inc(14030);double rkk = weightedJacobian[k][pk];
                    __CLR4_4_1ahjahjlb90p7ti.R.inc(14031);if ((((FastMath.abs(rkk) < FastMath.abs(lmDiag[k]))&&(__CLR4_4_1ahjahjlb90p7ti.R.iget(14032)!=0|true))||(__CLR4_4_1ahjahjlb90p7ti.R.iget(14033)==0&false))) {{
                        __CLR4_4_1ahjahjlb90p7ti.R.inc(14034);final double cotan = rkk / lmDiag[k];
                        __CLR4_4_1ahjahjlb90p7ti.R.inc(14035);sin   = 1.0 / FastMath.sqrt(1.0 + cotan * cotan);
                        __CLR4_4_1ahjahjlb90p7ti.R.inc(14036);cos   = sin * cotan;
                    } }else {{
                        __CLR4_4_1ahjahjlb90p7ti.R.inc(14037);final double tan = lmDiag[k] / rkk;
                        __CLR4_4_1ahjahjlb90p7ti.R.inc(14038);cos = 1.0 / FastMath.sqrt(1.0 + tan * tan);
                        __CLR4_4_1ahjahjlb90p7ti.R.inc(14039);sin = cos * tan;
                    }

                    // compute the modified diagonal element of R and
                    // the modified element of (Qty,0)
                    }__CLR4_4_1ahjahjlb90p7ti.R.inc(14040);weightedJacobian[k][pk] = cos * rkk + sin * lmDiag[k];
                    __CLR4_4_1ahjahjlb90p7ti.R.inc(14041);final double temp = cos * work[k] + sin * qtbpj;
                    __CLR4_4_1ahjahjlb90p7ti.R.inc(14042);qtbpj = -sin * work[k] + cos * qtbpj;
                    __CLR4_4_1ahjahjlb90p7ti.R.inc(14043);work[k] = temp;

                    // accumulate the tranformation in the row of s
                    __CLR4_4_1ahjahjlb90p7ti.R.inc(14044);for (int i = k + 1; (((i < solvedCols)&&(__CLR4_4_1ahjahjlb90p7ti.R.iget(14045)!=0|true))||(__CLR4_4_1ahjahjlb90p7ti.R.iget(14046)==0&false)); ++i) {{
                        __CLR4_4_1ahjahjlb90p7ti.R.inc(14047);double rik = weightedJacobian[i][pk];
                        __CLR4_4_1ahjahjlb90p7ti.R.inc(14048);final double temp2 = cos * rik + sin * lmDiag[i];
                        __CLR4_4_1ahjahjlb90p7ti.R.inc(14049);lmDiag[i] = -sin * rik + cos * lmDiag[i];
                        __CLR4_4_1ahjahjlb90p7ti.R.inc(14050);weightedJacobian[i][pk] = temp2;
                    }
                }}
            }}

            // store the diagonal element of s and restore
            // the corresponding diagonal element of R
            }__CLR4_4_1ahjahjlb90p7ti.R.inc(14051);lmDiag[j] = weightedJacobian[j][permutation[j]];
            __CLR4_4_1ahjahjlb90p7ti.R.inc(14052);weightedJacobian[j][permutation[j]] = lmDir[j];
        }

        // solve the triangular system for z, if the system is
        // singular, then obtain a least squares solution
        }__CLR4_4_1ahjahjlb90p7ti.R.inc(14053);int nSing = solvedCols;
        __CLR4_4_1ahjahjlb90p7ti.R.inc(14054);for (int j = 0; (((j < solvedCols)&&(__CLR4_4_1ahjahjlb90p7ti.R.iget(14055)!=0|true))||(__CLR4_4_1ahjahjlb90p7ti.R.iget(14056)==0&false)); ++j) {{
            __CLR4_4_1ahjahjlb90p7ti.R.inc(14057);if (((((lmDiag[j] == 0) && (nSing == solvedCols))&&(__CLR4_4_1ahjahjlb90p7ti.R.iget(14058)!=0|true))||(__CLR4_4_1ahjahjlb90p7ti.R.iget(14059)==0&false))) {{
                __CLR4_4_1ahjahjlb90p7ti.R.inc(14060);nSing = j;
            }
            }__CLR4_4_1ahjahjlb90p7ti.R.inc(14061);if ((((nSing < solvedCols)&&(__CLR4_4_1ahjahjlb90p7ti.R.iget(14062)!=0|true))||(__CLR4_4_1ahjahjlb90p7ti.R.iget(14063)==0&false))) {{
                __CLR4_4_1ahjahjlb90p7ti.R.inc(14064);work[j] = 0;
            }
        }}
        }__CLR4_4_1ahjahjlb90p7ti.R.inc(14065);if ((((nSing > 0)&&(__CLR4_4_1ahjahjlb90p7ti.R.iget(14066)!=0|true))||(__CLR4_4_1ahjahjlb90p7ti.R.iget(14067)==0&false))) {{
            __CLR4_4_1ahjahjlb90p7ti.R.inc(14068);for (int j = nSing - 1; (((j >= 0)&&(__CLR4_4_1ahjahjlb90p7ti.R.iget(14069)!=0|true))||(__CLR4_4_1ahjahjlb90p7ti.R.iget(14070)==0&false)); --j) {{
                __CLR4_4_1ahjahjlb90p7ti.R.inc(14071);int pj = permutation[j];
                __CLR4_4_1ahjahjlb90p7ti.R.inc(14072);double sum = 0;
                __CLR4_4_1ahjahjlb90p7ti.R.inc(14073);for (int i = j + 1; (((i < nSing)&&(__CLR4_4_1ahjahjlb90p7ti.R.iget(14074)!=0|true))||(__CLR4_4_1ahjahjlb90p7ti.R.iget(14075)==0&false)); ++i) {{
                    __CLR4_4_1ahjahjlb90p7ti.R.inc(14076);sum += weightedJacobian[i][pj] * work[i];
                }
                }__CLR4_4_1ahjahjlb90p7ti.R.inc(14077);work[j] = (work[j] - sum) / lmDiag[j];
            }
        }}

        // permute the components of z back to components of lmDir
        }__CLR4_4_1ahjahjlb90p7ti.R.inc(14078);for (int j = 0; (((j < lmDir.length)&&(__CLR4_4_1ahjahjlb90p7ti.R.iget(14079)!=0|true))||(__CLR4_4_1ahjahjlb90p7ti.R.iget(14080)==0&false)); ++j) {{
            __CLR4_4_1ahjahjlb90p7ti.R.inc(14081);lmDir[permutation[j]] = work[j];
        }
    }}finally{__CLR4_4_1ahjahjlb90p7ti.R.flushNeeded();}}

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
     * @param solvedCols Number of solved point.
     * @return data used in other methods of this class.
     * @throws ConvergenceException if the decomposition cannot be performed.
     */
    private InternalData qrDecomposition(RealMatrix jacobian,
                                         int solvedCols) throws ConvergenceException {try{__CLR4_4_1ahjahjlb90p7ti.R.inc(14082);
        // Code in this class assumes that the weighted Jacobian is -(W^(1/2) J),
        // hence the multiplication by -1.
        __CLR4_4_1ahjahjlb90p7ti.R.inc(14083);final double[][] weightedJacobian = jacobian.scalarMultiply(-1).getData();

        __CLR4_4_1ahjahjlb90p7ti.R.inc(14084);final int nR = weightedJacobian.length;
        __CLR4_4_1ahjahjlb90p7ti.R.inc(14085);final int nC = weightedJacobian[0].length;

        __CLR4_4_1ahjahjlb90p7ti.R.inc(14086);final int[] permutation = new int[nC];
        __CLR4_4_1ahjahjlb90p7ti.R.inc(14087);final double[] diagR = new double[nC];
        __CLR4_4_1ahjahjlb90p7ti.R.inc(14088);final double[] jacNorm = new double[nC];
        __CLR4_4_1ahjahjlb90p7ti.R.inc(14089);final double[] beta = new double[nC];

        // initializations
        __CLR4_4_1ahjahjlb90p7ti.R.inc(14090);for (int k = 0; (((k < nC)&&(__CLR4_4_1ahjahjlb90p7ti.R.iget(14091)!=0|true))||(__CLR4_4_1ahjahjlb90p7ti.R.iget(14092)==0&false)); ++k) {{
            __CLR4_4_1ahjahjlb90p7ti.R.inc(14093);permutation[k] = k;
            __CLR4_4_1ahjahjlb90p7ti.R.inc(14094);double norm2 = 0;
            __CLR4_4_1ahjahjlb90p7ti.R.inc(14095);for (int i = 0; (((i < nR)&&(__CLR4_4_1ahjahjlb90p7ti.R.iget(14096)!=0|true))||(__CLR4_4_1ahjahjlb90p7ti.R.iget(14097)==0&false)); ++i) {{
                __CLR4_4_1ahjahjlb90p7ti.R.inc(14098);double akk = weightedJacobian[i][k];
                __CLR4_4_1ahjahjlb90p7ti.R.inc(14099);norm2 += akk * akk;
            }
            }__CLR4_4_1ahjahjlb90p7ti.R.inc(14100);jacNorm[k] = FastMath.sqrt(norm2);
        }

        // transform the matrix column after column
        }__CLR4_4_1ahjahjlb90p7ti.R.inc(14101);for (int k = 0; (((k < nC)&&(__CLR4_4_1ahjahjlb90p7ti.R.iget(14102)!=0|true))||(__CLR4_4_1ahjahjlb90p7ti.R.iget(14103)==0&false)); ++k) {{

            // select the column with the greatest norm on active components
            __CLR4_4_1ahjahjlb90p7ti.R.inc(14104);int nextColumn = -1;
            __CLR4_4_1ahjahjlb90p7ti.R.inc(14105);double ak2 = Double.NEGATIVE_INFINITY;
            __CLR4_4_1ahjahjlb90p7ti.R.inc(14106);for (int i = k; (((i < nC)&&(__CLR4_4_1ahjahjlb90p7ti.R.iget(14107)!=0|true))||(__CLR4_4_1ahjahjlb90p7ti.R.iget(14108)==0&false)); ++i) {{
                __CLR4_4_1ahjahjlb90p7ti.R.inc(14109);double norm2 = 0;
                __CLR4_4_1ahjahjlb90p7ti.R.inc(14110);for (int j = k; (((j < nR)&&(__CLR4_4_1ahjahjlb90p7ti.R.iget(14111)!=0|true))||(__CLR4_4_1ahjahjlb90p7ti.R.iget(14112)==0&false)); ++j) {{
                    __CLR4_4_1ahjahjlb90p7ti.R.inc(14113);double aki = weightedJacobian[j][permutation[i]];
                    __CLR4_4_1ahjahjlb90p7ti.R.inc(14114);norm2 += aki * aki;
                }
                }__CLR4_4_1ahjahjlb90p7ti.R.inc(14115);if ((((Double.isInfinite(norm2) || Double.isNaN(norm2))&&(__CLR4_4_1ahjahjlb90p7ti.R.iget(14116)!=0|true))||(__CLR4_4_1ahjahjlb90p7ti.R.iget(14117)==0&false))) {{
                    __CLR4_4_1ahjahjlb90p7ti.R.inc(14118);throw new ConvergenceException(LocalizedFormats.UNABLE_TO_PERFORM_QR_DECOMPOSITION_ON_JACOBIAN,
                                                   nR, nC);
                }
                }__CLR4_4_1ahjahjlb90p7ti.R.inc(14119);if ((((norm2 > ak2)&&(__CLR4_4_1ahjahjlb90p7ti.R.iget(14120)!=0|true))||(__CLR4_4_1ahjahjlb90p7ti.R.iget(14121)==0&false))) {{
                    __CLR4_4_1ahjahjlb90p7ti.R.inc(14122);nextColumn = i;
                    __CLR4_4_1ahjahjlb90p7ti.R.inc(14123);ak2        = norm2;
                }
            }}
            }__CLR4_4_1ahjahjlb90p7ti.R.inc(14124);if ((((ak2 <= qrRankingThreshold)&&(__CLR4_4_1ahjahjlb90p7ti.R.iget(14125)!=0|true))||(__CLR4_4_1ahjahjlb90p7ti.R.iget(14126)==0&false))) {{
                __CLR4_4_1ahjahjlb90p7ti.R.inc(14127);return new InternalData(weightedJacobian, permutation, k, diagR, jacNorm, beta);
            }
            }__CLR4_4_1ahjahjlb90p7ti.R.inc(14128);int pk = permutation[nextColumn];
            __CLR4_4_1ahjahjlb90p7ti.R.inc(14129);permutation[nextColumn] = permutation[k];
            __CLR4_4_1ahjahjlb90p7ti.R.inc(14130);permutation[k] = pk;

            // choose alpha such that Hk.u = alpha ek
            __CLR4_4_1ahjahjlb90p7ti.R.inc(14131);double akk = weightedJacobian[k][pk];
            __CLR4_4_1ahjahjlb90p7ti.R.inc(14132);double alpha = ((((akk > 0) )&&(__CLR4_4_1ahjahjlb90p7ti.R.iget(14133)!=0|true))||(__CLR4_4_1ahjahjlb90p7ti.R.iget(14134)==0&false))? -FastMath.sqrt(ak2) : FastMath.sqrt(ak2);
            __CLR4_4_1ahjahjlb90p7ti.R.inc(14135);double betak = 1.0 / (ak2 - akk * alpha);
            __CLR4_4_1ahjahjlb90p7ti.R.inc(14136);beta[pk] = betak;

            // transform the current column
            __CLR4_4_1ahjahjlb90p7ti.R.inc(14137);diagR[pk] = alpha;
            __CLR4_4_1ahjahjlb90p7ti.R.inc(14138);weightedJacobian[k][pk] -= alpha;

            // transform the remaining columns
            __CLR4_4_1ahjahjlb90p7ti.R.inc(14139);for (int dk = nC - 1 - k; (((dk > 0)&&(__CLR4_4_1ahjahjlb90p7ti.R.iget(14140)!=0|true))||(__CLR4_4_1ahjahjlb90p7ti.R.iget(14141)==0&false)); --dk) {{
                __CLR4_4_1ahjahjlb90p7ti.R.inc(14142);double gamma = 0;
                __CLR4_4_1ahjahjlb90p7ti.R.inc(14143);for (int j = k; (((j < nR)&&(__CLR4_4_1ahjahjlb90p7ti.R.iget(14144)!=0|true))||(__CLR4_4_1ahjahjlb90p7ti.R.iget(14145)==0&false)); ++j) {{
                    __CLR4_4_1ahjahjlb90p7ti.R.inc(14146);gamma += weightedJacobian[j][pk] * weightedJacobian[j][permutation[k + dk]];
                }
                }__CLR4_4_1ahjahjlb90p7ti.R.inc(14147);gamma *= betak;
                __CLR4_4_1ahjahjlb90p7ti.R.inc(14148);for (int j = k; (((j < nR)&&(__CLR4_4_1ahjahjlb90p7ti.R.iget(14149)!=0|true))||(__CLR4_4_1ahjahjlb90p7ti.R.iget(14150)==0&false)); ++j) {{
                    __CLR4_4_1ahjahjlb90p7ti.R.inc(14151);weightedJacobian[j][permutation[k + dk]] -= gamma * weightedJacobian[j][pk];
                }
            }}
        }}

        }__CLR4_4_1ahjahjlb90p7ti.R.inc(14152);return new InternalData(weightedJacobian, permutation, solvedCols, diagR, jacNorm, beta);
    }finally{__CLR4_4_1ahjahjlb90p7ti.R.flushNeeded();}}

    /**
     * Compute the product Qt.y for some Q.R. decomposition.
     *
     * @param y vector to multiply (will be overwritten with the result)
     * @param internalData Data.
     */
    private void qTy(double[] y,
                     InternalData internalData) {try{__CLR4_4_1ahjahjlb90p7ti.R.inc(14153);
        __CLR4_4_1ahjahjlb90p7ti.R.inc(14154);final double[][] weightedJacobian = internalData.weightedJacobian;
        __CLR4_4_1ahjahjlb90p7ti.R.inc(14155);final int[] permutation = internalData.permutation;
        __CLR4_4_1ahjahjlb90p7ti.R.inc(14156);final double[] beta = internalData.beta;

        __CLR4_4_1ahjahjlb90p7ti.R.inc(14157);final int nR = weightedJacobian.length;
        __CLR4_4_1ahjahjlb90p7ti.R.inc(14158);final int nC = weightedJacobian[0].length;

        __CLR4_4_1ahjahjlb90p7ti.R.inc(14159);for (int k = 0; (((k < nC)&&(__CLR4_4_1ahjahjlb90p7ti.R.iget(14160)!=0|true))||(__CLR4_4_1ahjahjlb90p7ti.R.iget(14161)==0&false)); ++k) {{
            __CLR4_4_1ahjahjlb90p7ti.R.inc(14162);int pk = permutation[k];
            __CLR4_4_1ahjahjlb90p7ti.R.inc(14163);double gamma = 0;
            __CLR4_4_1ahjahjlb90p7ti.R.inc(14164);for (int i = k; (((i < nR)&&(__CLR4_4_1ahjahjlb90p7ti.R.iget(14165)!=0|true))||(__CLR4_4_1ahjahjlb90p7ti.R.iget(14166)==0&false)); ++i) {{
                __CLR4_4_1ahjahjlb90p7ti.R.inc(14167);gamma += weightedJacobian[i][pk] * y[i];
            }
            }__CLR4_4_1ahjahjlb90p7ti.R.inc(14168);gamma *= beta[pk];
            __CLR4_4_1ahjahjlb90p7ti.R.inc(14169);for (int i = k; (((i < nR)&&(__CLR4_4_1ahjahjlb90p7ti.R.iget(14170)!=0|true))||(__CLR4_4_1ahjahjlb90p7ti.R.iget(14171)==0&false)); ++i) {{
                __CLR4_4_1ahjahjlb90p7ti.R.inc(14172);y[i] -= gamma * weightedJacobian[i][pk];
            }
        }}
    }}finally{__CLR4_4_1ahjahjlb90p7ti.R.flushNeeded();}}
}
