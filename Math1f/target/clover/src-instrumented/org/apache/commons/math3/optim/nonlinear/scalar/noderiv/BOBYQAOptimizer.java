/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */// CHECKSTYLE: stop all
/*
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

import org.apache.commons.math3.exception.MathIllegalStateException;
import org.apache.commons.math3.exception.NumberIsTooSmallException;
import org.apache.commons.math3.exception.OutOfRangeException;
import org.apache.commons.math3.exception.util.LocalizedFormats;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.ArrayRealVector;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.optim.nonlinear.scalar.GoalType;
import org.apache.commons.math3.optim.PointValuePair;
import org.apache.commons.math3.optim.nonlinear.scalar.MultivariateOptimizer;

/**
 * Powell's BOBYQA algorithm. This implementation is translated and
 * adapted from the Fortran version available
 * <a href="http://plato.asu.edu/ftp/other_software/bobyqa.zip">here</a>.
 * See <a href="http://www.optimization-online.org/DB_HTML/2010/05/2616.html">
 * this paper</a> for an introduction.
 * <br/>
 * BOBYQA is particularly well suited for high dimensional problems
 * where derivatives are not available. In most cases it outperforms the
 * {@link PowellOptimizer} significantly. Stochastic algorithms like
 * {@link CMAESOptimizer} succeed more often than BOBYQA, but are more
 * expensive. BOBYQA could also be considered as a replacement of any
 * derivative-based optimizer when the derivatives are approximated by
 * finite differences.
 *
 * @version $Id$
 * @since 3.0
 */
@java.lang.SuppressWarnings({"fallthrough"}) public class BOBYQAOptimizer
    extends MultivariateOptimizer {public static class __CLR4_4_1shvshvlb90p9re{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,38727,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /** Minimum dimension of the problem: {@value} */
    public static final int MINIMUM_PROBLEM_DIMENSION = 2;
    /** Default value for {@link #initialTrustRegionRadius}: {@value} . */
    public static final double DEFAULT_INITIAL_RADIUS = 10.0;
    /** Default value for {@link #stoppingTrustRegionRadius}: {@value} . */
    public static final double DEFAULT_STOPPING_RADIUS = 1E-8;

    private static final double ZERO = 0d;
    private static final double ONE = 1d;
    private static final double TWO = 2d;
    private static final double TEN = 10d;
    private static final double SIXTEEN = 16d;
    private static final double TWO_HUNDRED_FIFTY = 250d;
    private static final double MINUS_ONE = -ONE;
    private static final double HALF = ONE / 2;
    private static final double ONE_OVER_FOUR = ONE / 4;
    private static final double ONE_OVER_EIGHT = ONE / 8;
    private static final double ONE_OVER_TEN = ONE / 10;
    private static final double ONE_OVER_A_THOUSAND = ONE / 1000;

    /**
     * numberOfInterpolationPoints XXX
     */
    private final int numberOfInterpolationPoints;
    /**
     * initialTrustRegionRadius XXX
     */
    private double initialTrustRegionRadius;
    /**
     * stoppingTrustRegionRadius XXX
     */
    private final double stoppingTrustRegionRadius;
    /** Goal type (minimize or maximize). */
    private boolean isMinimize;
    /**
     * Current best values for the variables to be optimized.
     * The vector will be changed in-place to contain the values of the least
     * calculated objective function values.
     */
    private ArrayRealVector currentBest;
    /** Differences between the upper and lower bounds. */
    private double[] boundDifference;
    /**
     * Index of the interpolation point at the trust region center.
     */
    private int trustRegionCenterInterpolationPointIndex;
    /**
     * Last <em>n</em> columns of matrix H (where <em>n</em> is the dimension
     * of the problem).
     * XXX "bmat" in the original code.
     */
    private Array2DRowRealMatrix bMatrix;
    /**
     * Factorization of the leading <em>npt</em> square submatrix of H, this
     * factorization being Z Z<sup>T</sup>, which provides both the correct
     * rank and positive semi-definiteness.
     * XXX "zmat" in the original code.
     */
    private Array2DRowRealMatrix zMatrix;
    /**
     * Coordinates of the interpolation points relative to {@link #originShift}.
     * XXX "xpt" in the original code.
     */
    private Array2DRowRealMatrix interpolationPoints;
    /**
     * Shift of origin that should reduce the contributions from rounding
     * errors to values of the model and Lagrange functions.
     * XXX "xbase" in the original code.
     */
    private ArrayRealVector originShift;
    /**
     * Values of the objective function at the interpolation points.
     * XXX "fval" in the original code.
     */
    private ArrayRealVector fAtInterpolationPoints;
    /**
     * Displacement from {@link #originShift} of the trust region center.
     * XXX "xopt" in the original code.
     */
    private ArrayRealVector trustRegionCenterOffset;
    /**
     * Gradient of the quadratic model at {@link #originShift} +
     * {@link #trustRegionCenterOffset}.
     * XXX "gopt" in the original code.
     */
    private ArrayRealVector gradientAtTrustRegionCenter;
    /**
     * Differences {@link #getLowerBound()} - {@link #originShift}.
     * All the components of every {@link #trustRegionCenterOffset} are going
     * to satisfy the bounds<br/>
     * {@link #getLowerBound() lowerBound}<sub>i</sub> &le;
     * {@link #trustRegionCenterOffset}<sub>i</sub>,<br/>
     * with appropriate equalities when {@link #trustRegionCenterOffset} is
     * on a constraint boundary.
     * XXX "sl" in the original code.
     */
    private ArrayRealVector lowerDifference;
    /**
     * Differences {@link #getUpperBound()} - {@link #originShift}
     * All the components of every {@link #trustRegionCenterOffset} are going
     * to satisfy the bounds<br/>
     *  {@link #trustRegionCenterOffset}<sub>i</sub> &le;
     *  {@link #getUpperBound() upperBound}<sub>i</sub>,<br/>
     * with appropriate equalities when {@link #trustRegionCenterOffset} is
     * on a constraint boundary.
     * XXX "su" in the original code.
     */
    private ArrayRealVector upperDifference;
    /**
     * Parameters of the implicit second derivatives of the quadratic model.
     * XXX "pq" in the original code.
     */
    private ArrayRealVector modelSecondDerivativesParameters;
    /**
     * Point chosen by function {@link #trsbox(double,ArrayRealVector,
     * ArrayRealVector, ArrayRealVector,ArrayRealVector,ArrayRealVector) trsbox}
     * or {@link #altmov(int,double) altmov}.
     * Usually {@link #originShift} + {@link #newPoint} is the vector of
     * variables for the next evaluation of the objective function.
     * It also satisfies the constraints indicated in {@link #lowerDifference}
     * and {@link #upperDifference}.
     * XXX "xnew" in the original code.
     */
    private ArrayRealVector newPoint;
    /**
     * Alternative to {@link #newPoint}, chosen by
     * {@link #altmov(int,double) altmov}.
     * It may replace {@link #newPoint} in order to increase the denominator
     * in the {@link #update(double, double, int) updating procedure}.
     * XXX "xalt" in the original code.
     */
    private ArrayRealVector alternativeNewPoint;
    /**
     * Trial step from {@link #trustRegionCenterOffset} which is usually
     * {@link #newPoint} - {@link #trustRegionCenterOffset}.
     * XXX "d__" in the original code.
     */
    private ArrayRealVector trialStepPoint;
    /**
     * Values of the Lagrange functions at a new point.
     * XXX "vlag" in the original code.
     */
    private ArrayRealVector lagrangeValuesAtNewPoint;
    /**
     * Explicit second derivatives of the quadratic model.
     * XXX "hq" in the original code.
     */
    private ArrayRealVector modelSecondDerivativesValues;

    /**
     * @param numberOfInterpolationPoints Number of interpolation conditions.
     * For a problem of dimension {@code n}, its value must be in the interval
     * {@code [n+2, (n+1)(n+2)/2]}.
     * Choices that exceed {@code 2n+1} are not recommended.
     */
    public BOBYQAOptimizer(int numberOfInterpolationPoints) {
        this(numberOfInterpolationPoints,
             DEFAULT_INITIAL_RADIUS,
             DEFAULT_STOPPING_RADIUS);__CLR4_4_1shvshvlb90p9re.R.inc(36932);try{__CLR4_4_1shvshvlb90p9re.R.inc(36931);
    }finally{__CLR4_4_1shvshvlb90p9re.R.flushNeeded();}}

    /**
     * @param numberOfInterpolationPoints Number of interpolation conditions.
     * For a problem of dimension {@code n}, its value must be in the interval
     * {@code [n+2, (n+1)(n+2)/2]}.
     * Choices that exceed {@code 2n+1} are not recommended.
     * @param initialTrustRegionRadius Initial trust region radius.
     * @param stoppingTrustRegionRadius Stopping trust region radius.
     */
    public BOBYQAOptimizer(int numberOfInterpolationPoints,
                           double initialTrustRegionRadius,
                           double stoppingTrustRegionRadius) {
        super(null);__CLR4_4_1shvshvlb90p9re.R.inc(36934);try{__CLR4_4_1shvshvlb90p9re.R.inc(36933); // No custom convergence criterion.
        __CLR4_4_1shvshvlb90p9re.R.inc(36935);this.numberOfInterpolationPoints = numberOfInterpolationPoints;
        __CLR4_4_1shvshvlb90p9re.R.inc(36936);this.initialTrustRegionRadius = initialTrustRegionRadius;
        __CLR4_4_1shvshvlb90p9re.R.inc(36937);this.stoppingTrustRegionRadius = stoppingTrustRegionRadius;
    }finally{__CLR4_4_1shvshvlb90p9re.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    protected PointValuePair doOptimize() {try{__CLR4_4_1shvshvlb90p9re.R.inc(36938);
        __CLR4_4_1shvshvlb90p9re.R.inc(36939);final double[] lowerBound = getLowerBound();
        __CLR4_4_1shvshvlb90p9re.R.inc(36940);final double[] upperBound = getUpperBound();

        // Validity checks.
        __CLR4_4_1shvshvlb90p9re.R.inc(36941);setup(lowerBound, upperBound);

        __CLR4_4_1shvshvlb90p9re.R.inc(36942);isMinimize = (getGoalType() == GoalType.MINIMIZE);
        __CLR4_4_1shvshvlb90p9re.R.inc(36943);currentBest = new ArrayRealVector(getStartPoint());

        __CLR4_4_1shvshvlb90p9re.R.inc(36944);final double value = bobyqa(lowerBound, upperBound);

        __CLR4_4_1shvshvlb90p9re.R.inc(36945);return new PointValuePair(currentBest.getDataRef(),
                                  (((isMinimize )&&(__CLR4_4_1shvshvlb90p9re.R.iget(36946)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(36947)==0&false))? value : -value);
    }finally{__CLR4_4_1shvshvlb90p9re.R.flushNeeded();}}

    /**
     *     This subroutine seeks the least value of a function of many variables,
     *     by applying a trust region method that forms quadratic models by
     *     interpolation. There is usually some freedom in the interpolation
     *     conditions, which is taken up by minimizing the Frobenius norm of
     *     the change to the second derivative of the model, beginning with the
     *     zero matrix. The values of the variables are constrained by upper and
     *     lower bounds. The arguments of the subroutine are as follows.
     *
     *     N must be set to the number of variables and must be at least two.
     *     NPT is the number of interpolation conditions. Its value must be in
     *       the interval [N+2,(N+1)(N+2)/2]. Choices that exceed 2*N+1 are not
     *       recommended.
     *     Initial values of the variables must be set in X(1),X(2),...,X(N). They
     *       will be changed to the values that give the least calculated F.
     *     For I=1,2,...,N, XL(I) and XU(I) must provide the lower and upper
     *       bounds, respectively, on X(I). The construction of quadratic models
     *       requires XL(I) to be strictly less than XU(I) for each I. Further,
     *       the contribution to a model from changes to the I-th variable is
     *       damaged severely by rounding errors if XU(I)-XL(I) is too small.
     *     RHOBEG and RHOEND must be set to the initial and final values of a trust
     *       region radius, so both must be positive with RHOEND no greater than
     *       RHOBEG. Typically, RHOBEG should be about one tenth of the greatest
     *       expected change to a variable, while RHOEND should indicate the
     *       accuracy that is required in the final values of the variables. An
     *       error return occurs if any of the differences XU(I)-XL(I), I=1,...,N,
     *       is less than 2*RHOBEG.
     *     MAXFUN must be set to an upper bound on the number of calls of CALFUN.
     *     The array W will be used for working space. Its length must be at least
     *       (NPT+5)*(NPT+N)+3*N*(N+5)/2.
     *
     * @param lowerBound Lower bounds.
     * @param upperBound Upper bounds.
     * @return the value of the objective at the optimum.
     */
    private double bobyqa(double[] lowerBound,
                          double[] upperBound) {try{__CLR4_4_1shvshvlb90p9re.R.inc(36948);
        __CLR4_4_1shvshvlb90p9re.R.inc(36949);printMethod(); // XXX

        __CLR4_4_1shvshvlb90p9re.R.inc(36950);final int n = currentBest.getDimension();

        // Return if there is insufficient space between the bounds. Modify the
        // initial X if necessary in order to avoid conflicts between the bounds
        // and the construction of the first quadratic model. The lower and upper
        // bounds on moves from the updated X are set now, in the ISL and ISU
        // partitions of W, in order to provide useful and exact information about
        // components of X that become within distance RHOBEG from their bounds.

        __CLR4_4_1shvshvlb90p9re.R.inc(36951);for (int j = 0; (((j < n)&&(__CLR4_4_1shvshvlb90p9re.R.iget(36952)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(36953)==0&false)); j++) {{
            __CLR4_4_1shvshvlb90p9re.R.inc(36954);final double boundDiff = boundDifference[j];
            __CLR4_4_1shvshvlb90p9re.R.inc(36955);lowerDifference.setEntry(j, lowerBound[j] - currentBest.getEntry(j));
            __CLR4_4_1shvshvlb90p9re.R.inc(36956);upperDifference.setEntry(j, upperBound[j] - currentBest.getEntry(j));
            __CLR4_4_1shvshvlb90p9re.R.inc(36957);if ((((lowerDifference.getEntry(j) >= -initialTrustRegionRadius)&&(__CLR4_4_1shvshvlb90p9re.R.iget(36958)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(36959)==0&false))) {{
                __CLR4_4_1shvshvlb90p9re.R.inc(36960);if ((((lowerDifference.getEntry(j) >= ZERO)&&(__CLR4_4_1shvshvlb90p9re.R.iget(36961)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(36962)==0&false))) {{
                    __CLR4_4_1shvshvlb90p9re.R.inc(36963);currentBest.setEntry(j, lowerBound[j]);
                    __CLR4_4_1shvshvlb90p9re.R.inc(36964);lowerDifference.setEntry(j, ZERO);
                    __CLR4_4_1shvshvlb90p9re.R.inc(36965);upperDifference.setEntry(j, boundDiff);
                } }else {{
                    __CLR4_4_1shvshvlb90p9re.R.inc(36966);currentBest.setEntry(j, lowerBound[j] + initialTrustRegionRadius);
                    __CLR4_4_1shvshvlb90p9re.R.inc(36967);lowerDifference.setEntry(j, -initialTrustRegionRadius);
                    // Computing MAX
                    __CLR4_4_1shvshvlb90p9re.R.inc(36968);final double deltaOne = upperBound[j] - currentBest.getEntry(j);
                    __CLR4_4_1shvshvlb90p9re.R.inc(36969);upperDifference.setEntry(j, Math.max(deltaOne, initialTrustRegionRadius));
                }
            }} }else {__CLR4_4_1shvshvlb90p9re.R.inc(36970);if ((((upperDifference.getEntry(j) <= initialTrustRegionRadius)&&(__CLR4_4_1shvshvlb90p9re.R.iget(36971)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(36972)==0&false))) {{
                __CLR4_4_1shvshvlb90p9re.R.inc(36973);if ((((upperDifference.getEntry(j) <= ZERO)&&(__CLR4_4_1shvshvlb90p9re.R.iget(36974)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(36975)==0&false))) {{
                    __CLR4_4_1shvshvlb90p9re.R.inc(36976);currentBest.setEntry(j, upperBound[j]);
                    __CLR4_4_1shvshvlb90p9re.R.inc(36977);lowerDifference.setEntry(j, -boundDiff);
                    __CLR4_4_1shvshvlb90p9re.R.inc(36978);upperDifference.setEntry(j, ZERO);
                } }else {{
                    __CLR4_4_1shvshvlb90p9re.R.inc(36979);currentBest.setEntry(j, upperBound[j] - initialTrustRegionRadius);
                    // Computing MIN
                    __CLR4_4_1shvshvlb90p9re.R.inc(36980);final double deltaOne = lowerBound[j] - currentBest.getEntry(j);
                    __CLR4_4_1shvshvlb90p9re.R.inc(36981);final double deltaTwo = -initialTrustRegionRadius;
                    __CLR4_4_1shvshvlb90p9re.R.inc(36982);lowerDifference.setEntry(j, Math.min(deltaOne, deltaTwo));
                    __CLR4_4_1shvshvlb90p9re.R.inc(36983);upperDifference.setEntry(j, initialTrustRegionRadius);
                }
            }}
        }}}

        // Make the call of BOBYQB.

        }__CLR4_4_1shvshvlb90p9re.R.inc(36984);return bobyqb(lowerBound, upperBound);
    }finally{__CLR4_4_1shvshvlb90p9re.R.flushNeeded();}} // bobyqa

    // ----------------------------------------------------------------------------------------

    /**
     *     The arguments N, NPT, X, XL, XU, RHOBEG, RHOEND, IPRINT and MAXFUN
     *       are identical to the corresponding arguments in SUBROUTINE BOBYQA.
     *     XBASE holds a shift of origin that should reduce the contributions
     *       from rounding errors to values of the model and Lagrange functions.
     *     XPT is a two-dimensional array that holds the coordinates of the
     *       interpolation points relative to XBASE.
     *     FVAL holds the values of F at the interpolation points.
     *     XOPT is set to the displacement from XBASE of the trust region centre.
     *     GOPT holds the gradient of the quadratic model at XBASE+XOPT.
     *     HQ holds the explicit second derivatives of the quadratic model.
     *     PQ contains the parameters of the implicit second derivatives of the
     *       quadratic model.
     *     BMAT holds the last N columns of H.
     *     ZMAT holds the factorization of the leading NPT by NPT submatrix of H,
     *       this factorization being ZMAT times ZMAT^T, which provides both the
     *       correct rank and positive semi-definiteness.
     *     NDIM is the first dimension of BMAT and has the value NPT+N.
     *     SL and SU hold the differences XL-XBASE and XU-XBASE, respectively.
     *       All the components of every XOPT are going to satisfy the bounds
     *       SL(I) .LEQ. XOPT(I) .LEQ. SU(I), with appropriate equalities when
     *       XOPT is on a constraint boundary.
     *     XNEW is chosen by SUBROUTINE TRSBOX or ALTMOV. Usually XBASE+XNEW is the
     *       vector of variables for the next call of CALFUN. XNEW also satisfies
     *       the SL and SU constraints in the way that has just been mentioned.
     *     XALT is an alternative to XNEW, chosen by ALTMOV, that may replace XNEW
     *       in order to increase the denominator in the updating of UPDATE.
     *     D is reserved for a trial step from XOPT, which is usually XNEW-XOPT.
     *     VLAG contains the values of the Lagrange functions at a new point X.
     *       They are part of a product that requires VLAG to be of length NDIM.
     *     W is a one-dimensional array that is used for working space. Its length
     *       must be at least 3*NDIM = 3*(NPT+N).
     *
     * @param lowerBound Lower bounds.
     * @param upperBound Upper bounds.
     * @return the value of the objective at the optimum.
     */
    private double bobyqb(double[] lowerBound,
                          double[] upperBound) {try{__CLR4_4_1shvshvlb90p9re.R.inc(36985);
        __CLR4_4_1shvshvlb90p9re.R.inc(36986);printMethod(); // XXX

        __CLR4_4_1shvshvlb90p9re.R.inc(36987);final int n = currentBest.getDimension();
        __CLR4_4_1shvshvlb90p9re.R.inc(36988);final int npt = numberOfInterpolationPoints;
        __CLR4_4_1shvshvlb90p9re.R.inc(36989);final int np = n + 1;
        __CLR4_4_1shvshvlb90p9re.R.inc(36990);final int nptm = npt - np;
        __CLR4_4_1shvshvlb90p9re.R.inc(36991);final int nh = n * np / 2;

        __CLR4_4_1shvshvlb90p9re.R.inc(36992);final ArrayRealVector work1 = new ArrayRealVector(n);
        __CLR4_4_1shvshvlb90p9re.R.inc(36993);final ArrayRealVector work2 = new ArrayRealVector(npt);
        __CLR4_4_1shvshvlb90p9re.R.inc(36994);final ArrayRealVector work3 = new ArrayRealVector(npt);

        __CLR4_4_1shvshvlb90p9re.R.inc(36995);double cauchy = Double.NaN;
        __CLR4_4_1shvshvlb90p9re.R.inc(36996);double alpha = Double.NaN;
        __CLR4_4_1shvshvlb90p9re.R.inc(36997);double dsq = Double.NaN;
        __CLR4_4_1shvshvlb90p9re.R.inc(36998);double crvmin = Double.NaN;

        // Set some constants.
        // Parameter adjustments

        // Function Body

        // The call of PRELIM sets the elements of XBASE, XPT, FVAL, GOPT, HQ, PQ,
        // BMAT and ZMAT for the first iteration, with the corresponding values of
        // of NF and KOPT, which are the number of calls of CALFUN so far and the
        // index of the interpolation point at the trust region centre. Then the
        // initial XOPT is set too. The branch to label 720 occurs if MAXFUN is
        // less than NPT. GOPT will be updated if KOPT is different from KBASE.

        __CLR4_4_1shvshvlb90p9re.R.inc(36999);trustRegionCenterInterpolationPointIndex = 0;

        __CLR4_4_1shvshvlb90p9re.R.inc(37000);prelim(lowerBound, upperBound);
        __CLR4_4_1shvshvlb90p9re.R.inc(37001);double xoptsq = ZERO;
        __CLR4_4_1shvshvlb90p9re.R.inc(37002);for (int i = 0; (((i < n)&&(__CLR4_4_1shvshvlb90p9re.R.iget(37003)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(37004)==0&false)); i++) {{
            __CLR4_4_1shvshvlb90p9re.R.inc(37005);trustRegionCenterOffset.setEntry(i, interpolationPoints.getEntry(trustRegionCenterInterpolationPointIndex, i));
            // Computing 2nd power
            __CLR4_4_1shvshvlb90p9re.R.inc(37006);final double deltaOne = trustRegionCenterOffset.getEntry(i);
            __CLR4_4_1shvshvlb90p9re.R.inc(37007);xoptsq += deltaOne * deltaOne;
        }
        }__CLR4_4_1shvshvlb90p9re.R.inc(37008);double fsave = fAtInterpolationPoints.getEntry(0);
        __CLR4_4_1shvshvlb90p9re.R.inc(37009);final int kbase = 0;

        // Complete the settings that are required for the iterative procedure.

        __CLR4_4_1shvshvlb90p9re.R.inc(37010);int ntrits = 0;
        __CLR4_4_1shvshvlb90p9re.R.inc(37011);int itest = 0;
        __CLR4_4_1shvshvlb90p9re.R.inc(37012);int knew = 0;
        __CLR4_4_1shvshvlb90p9re.R.inc(37013);int nfsav = getEvaluations();
        __CLR4_4_1shvshvlb90p9re.R.inc(37014);double rho = initialTrustRegionRadius;
        __CLR4_4_1shvshvlb90p9re.R.inc(37015);double delta = rho;
        __CLR4_4_1shvshvlb90p9re.R.inc(37016);double diffa = ZERO;
        __CLR4_4_1shvshvlb90p9re.R.inc(37017);double diffb = ZERO;
        __CLR4_4_1shvshvlb90p9re.R.inc(37018);double diffc = ZERO;
        __CLR4_4_1shvshvlb90p9re.R.inc(37019);double f = ZERO;
        __CLR4_4_1shvshvlb90p9re.R.inc(37020);double beta = ZERO;
        __CLR4_4_1shvshvlb90p9re.R.inc(37021);double adelt = ZERO;
        __CLR4_4_1shvshvlb90p9re.R.inc(37022);double denom = ZERO;
        __CLR4_4_1shvshvlb90p9re.R.inc(37023);double ratio = ZERO;
        __CLR4_4_1shvshvlb90p9re.R.inc(37024);double dnorm = ZERO;
        __CLR4_4_1shvshvlb90p9re.R.inc(37025);double scaden = ZERO;
        __CLR4_4_1shvshvlb90p9re.R.inc(37026);double biglsq = ZERO;
        __CLR4_4_1shvshvlb90p9re.R.inc(37027);double distsq = ZERO;

        // Update GOPT if necessary before the first iteration and after each
        // call of RESCUE that makes a call of CALFUN.

        __CLR4_4_1shvshvlb90p9re.R.inc(37028);int state = 20;
        __CLR4_4_1shvshvlb90p9re.R.inc(37029);for(;;) {boolean __CLB4_4_1_bool0=false;__CLR4_4_1shvshvlb90p9re.R.inc(37030);switch (state) {
        case 20:if (!__CLB4_4_1_bool0) {__CLR4_4_1shvshvlb90p9re.R.inc(37031);__CLB4_4_1_bool0=true;} {
            __CLR4_4_1shvshvlb90p9re.R.inc(37032);printState(20); // XXX
            __CLR4_4_1shvshvlb90p9re.R.inc(37033);if ((((trustRegionCenterInterpolationPointIndex != kbase)&&(__CLR4_4_1shvshvlb90p9re.R.iget(37034)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(37035)==0&false))) {{
                __CLR4_4_1shvshvlb90p9re.R.inc(37036);int ih = 0;
                __CLR4_4_1shvshvlb90p9re.R.inc(37037);for (int j = 0; (((j < n)&&(__CLR4_4_1shvshvlb90p9re.R.iget(37038)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(37039)==0&false)); j++) {{
                    __CLR4_4_1shvshvlb90p9re.R.inc(37040);for (int i = 0; (((i <= j)&&(__CLR4_4_1shvshvlb90p9re.R.iget(37041)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(37042)==0&false)); i++) {{
                        __CLR4_4_1shvshvlb90p9re.R.inc(37043);if ((((i < j)&&(__CLR4_4_1shvshvlb90p9re.R.iget(37044)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(37045)==0&false))) {{
                            __CLR4_4_1shvshvlb90p9re.R.inc(37046);gradientAtTrustRegionCenter.setEntry(j, gradientAtTrustRegionCenter.getEntry(j) + modelSecondDerivativesValues.getEntry(ih) * trustRegionCenterOffset.getEntry(i));
                        }
                        }__CLR4_4_1shvshvlb90p9re.R.inc(37047);gradientAtTrustRegionCenter.setEntry(i, gradientAtTrustRegionCenter.getEntry(i) + modelSecondDerivativesValues.getEntry(ih) * trustRegionCenterOffset.getEntry(j));
                        __CLR4_4_1shvshvlb90p9re.R.inc(37048);ih++;
                    }
                }}
                }__CLR4_4_1shvshvlb90p9re.R.inc(37049);if ((((getEvaluations() > npt)&&(__CLR4_4_1shvshvlb90p9re.R.iget(37050)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(37051)==0&false))) {{
                    __CLR4_4_1shvshvlb90p9re.R.inc(37052);for (int k = 0; (((k < npt)&&(__CLR4_4_1shvshvlb90p9re.R.iget(37053)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(37054)==0&false)); k++) {{
                        __CLR4_4_1shvshvlb90p9re.R.inc(37055);double temp = ZERO;
                        __CLR4_4_1shvshvlb90p9re.R.inc(37056);for (int j = 0; (((j < n)&&(__CLR4_4_1shvshvlb90p9re.R.iget(37057)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(37058)==0&false)); j++) {{
                            __CLR4_4_1shvshvlb90p9re.R.inc(37059);temp += interpolationPoints.getEntry(k, j) * trustRegionCenterOffset.getEntry(j);
                        }
                        }__CLR4_4_1shvshvlb90p9re.R.inc(37060);temp *= modelSecondDerivativesParameters.getEntry(k);
                        __CLR4_4_1shvshvlb90p9re.R.inc(37061);for (int i = 0; (((i < n)&&(__CLR4_4_1shvshvlb90p9re.R.iget(37062)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(37063)==0&false)); i++) {{
                            __CLR4_4_1shvshvlb90p9re.R.inc(37064);gradientAtTrustRegionCenter.setEntry(i, gradientAtTrustRegionCenter.getEntry(i) + temp * interpolationPoints.getEntry(k, i));
                        }
                    }}
                    // throw new PathIsExploredException(); // XXX
                }}
            }}

            // Generate the next point in the trust region that provides a small value
            // of the quadratic model subject to the constraints on the variables.
            // The int NTRITS is set to the number "trust region" iterations that
            // have occurred since the last "alternative" iteration. If the length
            // of XNEW-XOPT is less than HALF*RHO, however, then there is a branch to
            // label 650 or 680 with NTRITS=-1, instead of calculating F at XNEW.

        }}
        case 60:if (!__CLB4_4_1_bool0) {__CLR4_4_1shvshvlb90p9re.R.inc(37065);__CLB4_4_1_bool0=true;} {
            __CLR4_4_1shvshvlb90p9re.R.inc(37066);printState(60); // XXX
            __CLR4_4_1shvshvlb90p9re.R.inc(37067);final ArrayRealVector gnew = new ArrayRealVector(n);
            __CLR4_4_1shvshvlb90p9re.R.inc(37068);final ArrayRealVector xbdi = new ArrayRealVector(n);
            __CLR4_4_1shvshvlb90p9re.R.inc(37069);final ArrayRealVector s = new ArrayRealVector(n);
            __CLR4_4_1shvshvlb90p9re.R.inc(37070);final ArrayRealVector hs = new ArrayRealVector(n);
            __CLR4_4_1shvshvlb90p9re.R.inc(37071);final ArrayRealVector hred = new ArrayRealVector(n);

            __CLR4_4_1shvshvlb90p9re.R.inc(37072);final double[] dsqCrvmin = trsbox(delta, gnew, xbdi, s,
                                              hs, hred);
            __CLR4_4_1shvshvlb90p9re.R.inc(37073);dsq = dsqCrvmin[0];
            __CLR4_4_1shvshvlb90p9re.R.inc(37074);crvmin = dsqCrvmin[1];

            // Computing MIN
            __CLR4_4_1shvshvlb90p9re.R.inc(37075);double deltaOne = delta;
            __CLR4_4_1shvshvlb90p9re.R.inc(37076);double deltaTwo = Math.sqrt(dsq);
            __CLR4_4_1shvshvlb90p9re.R.inc(37077);dnorm = Math.min(deltaOne, deltaTwo);
            __CLR4_4_1shvshvlb90p9re.R.inc(37078);if ((((dnorm < HALF * rho)&&(__CLR4_4_1shvshvlb90p9re.R.iget(37079)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(37080)==0&false))) {{
                __CLR4_4_1shvshvlb90p9re.R.inc(37081);ntrits = -1;
                // Computing 2nd power
                __CLR4_4_1shvshvlb90p9re.R.inc(37082);deltaOne = TEN * rho;
                __CLR4_4_1shvshvlb90p9re.R.inc(37083);distsq = deltaOne * deltaOne;
                __CLR4_4_1shvshvlb90p9re.R.inc(37084);if ((((getEvaluations() <= nfsav + 2)&&(__CLR4_4_1shvshvlb90p9re.R.iget(37085)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(37086)==0&false))) {{
                    __CLR4_4_1shvshvlb90p9re.R.inc(37087);state = 650; __CLR4_4_1shvshvlb90p9re.R.inc(37088);break;
                }

                // The following choice between labels 650 and 680 depends on whether or
                // not our work with the current RHO seems to be complete. Either RHO is
                // decreased or termination occurs if the errors in the quadratic model at
                // the last three interpolation points compare favourably with predictions
                // of likely improvements to the model within distance HALF*RHO of XOPT.

                // Computing MAX
                }__CLR4_4_1shvshvlb90p9re.R.inc(37089);deltaOne = Math.max(diffa, diffb);
                __CLR4_4_1shvshvlb90p9re.R.inc(37090);final double errbig = Math.max(deltaOne, diffc);
                __CLR4_4_1shvshvlb90p9re.R.inc(37091);final double frhosq = rho * ONE_OVER_EIGHT * rho;
                __CLR4_4_1shvshvlb90p9re.R.inc(37092);if ((((crvmin > ZERO &&
                    errbig > frhosq * crvmin)&&(__CLR4_4_1shvshvlb90p9re.R.iget(37093)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(37094)==0&false))) {{
                    __CLR4_4_1shvshvlb90p9re.R.inc(37095);state = 650; __CLR4_4_1shvshvlb90p9re.R.inc(37096);break;
                }
                }__CLR4_4_1shvshvlb90p9re.R.inc(37097);final double bdtol = errbig / rho;
                __CLR4_4_1shvshvlb90p9re.R.inc(37098);for (int j = 0; (((j < n)&&(__CLR4_4_1shvshvlb90p9re.R.iget(37099)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(37100)==0&false)); j++) {{
                    __CLR4_4_1shvshvlb90p9re.R.inc(37101);double bdtest = bdtol;
                    __CLR4_4_1shvshvlb90p9re.R.inc(37102);if ((((newPoint.getEntry(j) == lowerDifference.getEntry(j))&&(__CLR4_4_1shvshvlb90p9re.R.iget(37103)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(37104)==0&false))) {{
                        __CLR4_4_1shvshvlb90p9re.R.inc(37105);bdtest = work1.getEntry(j);
                    }
                    }__CLR4_4_1shvshvlb90p9re.R.inc(37106);if ((((newPoint.getEntry(j) == upperDifference.getEntry(j))&&(__CLR4_4_1shvshvlb90p9re.R.iget(37107)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(37108)==0&false))) {{
                        __CLR4_4_1shvshvlb90p9re.R.inc(37109);bdtest = -work1.getEntry(j);
                    }
                    }__CLR4_4_1shvshvlb90p9re.R.inc(37110);if ((((bdtest < bdtol)&&(__CLR4_4_1shvshvlb90p9re.R.iget(37111)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(37112)==0&false))) {{
                        __CLR4_4_1shvshvlb90p9re.R.inc(37113);double curv = modelSecondDerivativesValues.getEntry((j + j * j) / 2);
                        __CLR4_4_1shvshvlb90p9re.R.inc(37114);for (int k = 0; (((k < npt)&&(__CLR4_4_1shvshvlb90p9re.R.iget(37115)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(37116)==0&false)); k++) {{
                            // Computing 2nd power
                            __CLR4_4_1shvshvlb90p9re.R.inc(37117);final double d1 = interpolationPoints.getEntry(k, j);
                            __CLR4_4_1shvshvlb90p9re.R.inc(37118);curv += modelSecondDerivativesParameters.getEntry(k) * (d1 * d1);
                        }
                        }__CLR4_4_1shvshvlb90p9re.R.inc(37119);bdtest += HALF * curv * rho;
                        __CLR4_4_1shvshvlb90p9re.R.inc(37120);if ((((bdtest < bdtol)&&(__CLR4_4_1shvshvlb90p9re.R.iget(37121)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(37122)==0&false))) {{
                            __CLR4_4_1shvshvlb90p9re.R.inc(37123);state = 650; __CLR4_4_1shvshvlb90p9re.R.inc(37124);break;
                        }
                        // throw new PathIsExploredException(); // XXX
                    }}
                }}
                }__CLR4_4_1shvshvlb90p9re.R.inc(37125);state = 680; __CLR4_4_1shvshvlb90p9re.R.inc(37126);break;
            }
            }__CLR4_4_1shvshvlb90p9re.R.inc(37127);++ntrits;

            // Severe cancellation is likely to occur if XOPT is too far from XBASE.
            // If the following test holds, then XBASE is shifted so that XOPT becomes
            // zero. The appropriate changes are made to BMAT and to the second
            // derivatives of the current model, beginning with the changes to BMAT
            // that do not depend on ZMAT. VLAG is used temporarily for working space.

        }
        case 90:if (!__CLB4_4_1_bool0) {__CLR4_4_1shvshvlb90p9re.R.inc(37128);__CLB4_4_1_bool0=true;} {
            __CLR4_4_1shvshvlb90p9re.R.inc(37129);printState(90); // XXX
            __CLR4_4_1shvshvlb90p9re.R.inc(37130);if ((((dsq <= xoptsq * ONE_OVER_A_THOUSAND)&&(__CLR4_4_1shvshvlb90p9re.R.iget(37131)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(37132)==0&false))) {{
                __CLR4_4_1shvshvlb90p9re.R.inc(37133);final double fracsq = xoptsq * ONE_OVER_FOUR;
                __CLR4_4_1shvshvlb90p9re.R.inc(37134);double sumpq = ZERO;
                // final RealVector sumVector
                //     = new ArrayRealVector(npt, -HALF * xoptsq).add(interpolationPoints.operate(trustRegionCenter));
                __CLR4_4_1shvshvlb90p9re.R.inc(37135);for (int k = 0; (((k < npt)&&(__CLR4_4_1shvshvlb90p9re.R.iget(37136)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(37137)==0&false)); k++) {{
                    __CLR4_4_1shvshvlb90p9re.R.inc(37138);sumpq += modelSecondDerivativesParameters.getEntry(k);
                    __CLR4_4_1shvshvlb90p9re.R.inc(37139);double sum = -HALF * xoptsq;
                    __CLR4_4_1shvshvlb90p9re.R.inc(37140);for (int i = 0; (((i < n)&&(__CLR4_4_1shvshvlb90p9re.R.iget(37141)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(37142)==0&false)); i++) {{
                        __CLR4_4_1shvshvlb90p9re.R.inc(37143);sum += interpolationPoints.getEntry(k, i) * trustRegionCenterOffset.getEntry(i);
                    }
                    // sum = sumVector.getEntry(k); // XXX "testAckley" and "testDiffPow" fail.
                    }__CLR4_4_1shvshvlb90p9re.R.inc(37144);work2.setEntry(k, sum);
                    __CLR4_4_1shvshvlb90p9re.R.inc(37145);final double temp = fracsq - HALF * sum;
                    __CLR4_4_1shvshvlb90p9re.R.inc(37146);for (int i = 0; (((i < n)&&(__CLR4_4_1shvshvlb90p9re.R.iget(37147)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(37148)==0&false)); i++) {{
                        __CLR4_4_1shvshvlb90p9re.R.inc(37149);work1.setEntry(i, bMatrix.getEntry(k, i));
                        __CLR4_4_1shvshvlb90p9re.R.inc(37150);lagrangeValuesAtNewPoint.setEntry(i, sum * interpolationPoints.getEntry(k, i) + temp * trustRegionCenterOffset.getEntry(i));
                        __CLR4_4_1shvshvlb90p9re.R.inc(37151);final int ip = npt + i;
                        __CLR4_4_1shvshvlb90p9re.R.inc(37152);for (int j = 0; (((j <= i)&&(__CLR4_4_1shvshvlb90p9re.R.iget(37153)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(37154)==0&false)); j++) {{
                            __CLR4_4_1shvshvlb90p9re.R.inc(37155);bMatrix.setEntry(ip, j,
                                          bMatrix.getEntry(ip, j)
                                          + work1.getEntry(i) * lagrangeValuesAtNewPoint.getEntry(j)
                                          + lagrangeValuesAtNewPoint.getEntry(i) * work1.getEntry(j));
                        }
                    }}
                }}

                // Then the revisions of BMAT that depend on ZMAT are calculated.

                }__CLR4_4_1shvshvlb90p9re.R.inc(37156);for (int m = 0; (((m < nptm)&&(__CLR4_4_1shvshvlb90p9re.R.iget(37157)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(37158)==0&false)); m++) {{
                    __CLR4_4_1shvshvlb90p9re.R.inc(37159);double sumz = ZERO;
                    __CLR4_4_1shvshvlb90p9re.R.inc(37160);double sumw = ZERO;
                    __CLR4_4_1shvshvlb90p9re.R.inc(37161);for (int k = 0; (((k < npt)&&(__CLR4_4_1shvshvlb90p9re.R.iget(37162)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(37163)==0&false)); k++) {{
                        __CLR4_4_1shvshvlb90p9re.R.inc(37164);sumz += zMatrix.getEntry(k, m);
                        __CLR4_4_1shvshvlb90p9re.R.inc(37165);lagrangeValuesAtNewPoint.setEntry(k, work2.getEntry(k) * zMatrix.getEntry(k, m));
                        __CLR4_4_1shvshvlb90p9re.R.inc(37166);sumw += lagrangeValuesAtNewPoint.getEntry(k);
                    }
                    }__CLR4_4_1shvshvlb90p9re.R.inc(37167);for (int j = 0; (((j < n)&&(__CLR4_4_1shvshvlb90p9re.R.iget(37168)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(37169)==0&false)); j++) {{
                        __CLR4_4_1shvshvlb90p9re.R.inc(37170);double sum = (fracsq * sumz - HALF * sumw) * trustRegionCenterOffset.getEntry(j);
                        __CLR4_4_1shvshvlb90p9re.R.inc(37171);for (int k = 0; (((k < npt)&&(__CLR4_4_1shvshvlb90p9re.R.iget(37172)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(37173)==0&false)); k++) {{
                            __CLR4_4_1shvshvlb90p9re.R.inc(37174);sum += lagrangeValuesAtNewPoint.getEntry(k) * interpolationPoints.getEntry(k, j);
                        }
                        }__CLR4_4_1shvshvlb90p9re.R.inc(37175);work1.setEntry(j, sum);
                        __CLR4_4_1shvshvlb90p9re.R.inc(37176);for (int k = 0; (((k < npt)&&(__CLR4_4_1shvshvlb90p9re.R.iget(37177)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(37178)==0&false)); k++) {{
                            __CLR4_4_1shvshvlb90p9re.R.inc(37179);bMatrix.setEntry(k, j,
                                          bMatrix.getEntry(k, j)
                                          + sum * zMatrix.getEntry(k, m));
                        }
                    }}
                    }__CLR4_4_1shvshvlb90p9re.R.inc(37180);for (int i = 0; (((i < n)&&(__CLR4_4_1shvshvlb90p9re.R.iget(37181)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(37182)==0&false)); i++) {{
                        __CLR4_4_1shvshvlb90p9re.R.inc(37183);final int ip = i + npt;
                        __CLR4_4_1shvshvlb90p9re.R.inc(37184);final double temp = work1.getEntry(i);
                        __CLR4_4_1shvshvlb90p9re.R.inc(37185);for (int j = 0; (((j <= i)&&(__CLR4_4_1shvshvlb90p9re.R.iget(37186)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(37187)==0&false)); j++) {{
                            __CLR4_4_1shvshvlb90p9re.R.inc(37188);bMatrix.setEntry(ip, j,
                                          bMatrix.getEntry(ip, j)
                                          + temp * work1.getEntry(j));
                        }
                    }}
                }}

                // The following instructions complete the shift, including the changes
                // to the second derivative parameters of the quadratic model.

                }__CLR4_4_1shvshvlb90p9re.R.inc(37189);int ih = 0;
                __CLR4_4_1shvshvlb90p9re.R.inc(37190);for (int j = 0; (((j < n)&&(__CLR4_4_1shvshvlb90p9re.R.iget(37191)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(37192)==0&false)); j++) {{
                    __CLR4_4_1shvshvlb90p9re.R.inc(37193);work1.setEntry(j, -HALF * sumpq * trustRegionCenterOffset.getEntry(j));
                    __CLR4_4_1shvshvlb90p9re.R.inc(37194);for (int k = 0; (((k < npt)&&(__CLR4_4_1shvshvlb90p9re.R.iget(37195)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(37196)==0&false)); k++) {{
                        __CLR4_4_1shvshvlb90p9re.R.inc(37197);work1.setEntry(j, work1.getEntry(j) + modelSecondDerivativesParameters.getEntry(k) * interpolationPoints.getEntry(k, j));
                        __CLR4_4_1shvshvlb90p9re.R.inc(37198);interpolationPoints.setEntry(k, j, interpolationPoints.getEntry(k, j) - trustRegionCenterOffset.getEntry(j));
                    }
                    }__CLR4_4_1shvshvlb90p9re.R.inc(37199);for (int i = 0; (((i <= j)&&(__CLR4_4_1shvshvlb90p9re.R.iget(37200)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(37201)==0&false)); i++) {{
                         __CLR4_4_1shvshvlb90p9re.R.inc(37202);modelSecondDerivativesValues.setEntry(ih,
                                    modelSecondDerivativesValues.getEntry(ih)
                                    + work1.getEntry(i) * trustRegionCenterOffset.getEntry(j)
                                    + trustRegionCenterOffset.getEntry(i) * work1.getEntry(j));
                        __CLR4_4_1shvshvlb90p9re.R.inc(37203);bMatrix.setEntry(npt + i, j, bMatrix.getEntry(npt + j, i));
                        __CLR4_4_1shvshvlb90p9re.R.inc(37204);ih++;
                    }
                }}
                }__CLR4_4_1shvshvlb90p9re.R.inc(37205);for (int i = 0; (((i < n)&&(__CLR4_4_1shvshvlb90p9re.R.iget(37206)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(37207)==0&false)); i++) {{
                    __CLR4_4_1shvshvlb90p9re.R.inc(37208);originShift.setEntry(i, originShift.getEntry(i) + trustRegionCenterOffset.getEntry(i));
                    __CLR4_4_1shvshvlb90p9re.R.inc(37209);newPoint.setEntry(i, newPoint.getEntry(i) - trustRegionCenterOffset.getEntry(i));
                    __CLR4_4_1shvshvlb90p9re.R.inc(37210);lowerDifference.setEntry(i, lowerDifference.getEntry(i) - trustRegionCenterOffset.getEntry(i));
                    __CLR4_4_1shvshvlb90p9re.R.inc(37211);upperDifference.setEntry(i, upperDifference.getEntry(i) - trustRegionCenterOffset.getEntry(i));
                    __CLR4_4_1shvshvlb90p9re.R.inc(37212);trustRegionCenterOffset.setEntry(i, ZERO);
                }
                }__CLR4_4_1shvshvlb90p9re.R.inc(37213);xoptsq = ZERO;
            }
            }__CLR4_4_1shvshvlb90p9re.R.inc(37214);if ((((ntrits == 0)&&(__CLR4_4_1shvshvlb90p9re.R.iget(37215)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(37216)==0&false))) {{
                __CLR4_4_1shvshvlb90p9re.R.inc(37217);state = 210; __CLR4_4_1shvshvlb90p9re.R.inc(37218);break;
            }
            }__CLR4_4_1shvshvlb90p9re.R.inc(37219);state = 230; __CLR4_4_1shvshvlb90p9re.R.inc(37220);break;

            // XBASE is also moved to XOPT by a call of RESCUE. This calculation is
            // more expensive than the previous shift, because new matrices BMAT and
            // ZMAT are generated from scratch, which may include the replacement of
            // interpolation points whose positions seem to be causing near linear
            // dependence in the interpolation conditions. Therefore RESCUE is called
            // only if rounding errors have reduced by at least a factor of two the
            // denominator of the formula for updating the H matrix. It provides a
            // useful safeguard, but is not invoked in most applications of BOBYQA.

        }
        case 210:if (!__CLB4_4_1_bool0) {__CLR4_4_1shvshvlb90p9re.R.inc(37221);__CLB4_4_1_bool0=true;} {
            __CLR4_4_1shvshvlb90p9re.R.inc(37222);printState(210); // XXX
            // Pick two alternative vectors of variables, relative to XBASE, that
            // are suitable as new positions of the KNEW-th interpolation point.
            // Firstly, XNEW is set to the point on a line through XOPT and another
            // interpolation point that minimizes the predicted value of the next
            // denominator, subject to ||XNEW - XOPT|| .LEQ. ADELT and to the SL
            // and SU bounds. Secondly, XALT is set to the best feasible point on
            // a constrained version of the Cauchy step of the KNEW-th Lagrange
            // function, the corresponding value of the square of this function
            // being returned in CAUCHY. The choice between these alternatives is
            // going to be made when the denominator is calculated.

            __CLR4_4_1shvshvlb90p9re.R.inc(37223);final double[] alphaCauchy = altmov(knew, adelt);
            __CLR4_4_1shvshvlb90p9re.R.inc(37224);alpha = alphaCauchy[0];
            __CLR4_4_1shvshvlb90p9re.R.inc(37225);cauchy = alphaCauchy[1];

            __CLR4_4_1shvshvlb90p9re.R.inc(37226);for (int i = 0; (((i < n)&&(__CLR4_4_1shvshvlb90p9re.R.iget(37227)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(37228)==0&false)); i++) {{
                __CLR4_4_1shvshvlb90p9re.R.inc(37229);trialStepPoint.setEntry(i, newPoint.getEntry(i) - trustRegionCenterOffset.getEntry(i));
            }

            // Calculate VLAG and BETA for the current choice of D. The scalar
            // product of D with XPT(K,.) is going to be held in W(NPT+K) for
            // use when VQUAD is calculated.

        }}
        case 230:if (!__CLB4_4_1_bool0) {__CLR4_4_1shvshvlb90p9re.R.inc(37230);__CLB4_4_1_bool0=true;} {
            __CLR4_4_1shvshvlb90p9re.R.inc(37231);printState(230); // XXX
            __CLR4_4_1shvshvlb90p9re.R.inc(37232);for (int k = 0; (((k < npt)&&(__CLR4_4_1shvshvlb90p9re.R.iget(37233)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(37234)==0&false)); k++) {{
                __CLR4_4_1shvshvlb90p9re.R.inc(37235);double suma = ZERO;
                __CLR4_4_1shvshvlb90p9re.R.inc(37236);double sumb = ZERO;
                __CLR4_4_1shvshvlb90p9re.R.inc(37237);double sum = ZERO;
                __CLR4_4_1shvshvlb90p9re.R.inc(37238);for (int j = 0; (((j < n)&&(__CLR4_4_1shvshvlb90p9re.R.iget(37239)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(37240)==0&false)); j++) {{
                    __CLR4_4_1shvshvlb90p9re.R.inc(37241);suma += interpolationPoints.getEntry(k, j) * trialStepPoint.getEntry(j);
                    __CLR4_4_1shvshvlb90p9re.R.inc(37242);sumb += interpolationPoints.getEntry(k, j) * trustRegionCenterOffset.getEntry(j);
                    __CLR4_4_1shvshvlb90p9re.R.inc(37243);sum += bMatrix.getEntry(k, j) * trialStepPoint.getEntry(j);
                }
                }__CLR4_4_1shvshvlb90p9re.R.inc(37244);work3.setEntry(k, suma * (HALF * suma + sumb));
                __CLR4_4_1shvshvlb90p9re.R.inc(37245);lagrangeValuesAtNewPoint.setEntry(k, sum);
                __CLR4_4_1shvshvlb90p9re.R.inc(37246);work2.setEntry(k, suma);
            }
            }__CLR4_4_1shvshvlb90p9re.R.inc(37247);beta = ZERO;
            __CLR4_4_1shvshvlb90p9re.R.inc(37248);for (int m = 0; (((m < nptm)&&(__CLR4_4_1shvshvlb90p9re.R.iget(37249)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(37250)==0&false)); m++) {{
                __CLR4_4_1shvshvlb90p9re.R.inc(37251);double sum = ZERO;
                __CLR4_4_1shvshvlb90p9re.R.inc(37252);for (int k = 0; (((k < npt)&&(__CLR4_4_1shvshvlb90p9re.R.iget(37253)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(37254)==0&false)); k++) {{
                    __CLR4_4_1shvshvlb90p9re.R.inc(37255);sum += zMatrix.getEntry(k, m) * work3.getEntry(k);
                }
                }__CLR4_4_1shvshvlb90p9re.R.inc(37256);beta -= sum * sum;
                __CLR4_4_1shvshvlb90p9re.R.inc(37257);for (int k = 0; (((k < npt)&&(__CLR4_4_1shvshvlb90p9re.R.iget(37258)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(37259)==0&false)); k++) {{
                    __CLR4_4_1shvshvlb90p9re.R.inc(37260);lagrangeValuesAtNewPoint.setEntry(k, lagrangeValuesAtNewPoint.getEntry(k) + sum * zMatrix.getEntry(k, m));
                }
            }}
            }__CLR4_4_1shvshvlb90p9re.R.inc(37261);dsq = ZERO;
            __CLR4_4_1shvshvlb90p9re.R.inc(37262);double bsum = ZERO;
            __CLR4_4_1shvshvlb90p9re.R.inc(37263);double dx = ZERO;
            __CLR4_4_1shvshvlb90p9re.R.inc(37264);for (int j = 0; (((j < n)&&(__CLR4_4_1shvshvlb90p9re.R.iget(37265)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(37266)==0&false)); j++) {{
                // Computing 2nd power
                __CLR4_4_1shvshvlb90p9re.R.inc(37267);final double d1 = trialStepPoint.getEntry(j);
                __CLR4_4_1shvshvlb90p9re.R.inc(37268);dsq += d1 * d1;
                __CLR4_4_1shvshvlb90p9re.R.inc(37269);double sum = ZERO;
                __CLR4_4_1shvshvlb90p9re.R.inc(37270);for (int k = 0; (((k < npt)&&(__CLR4_4_1shvshvlb90p9re.R.iget(37271)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(37272)==0&false)); k++) {{
                    __CLR4_4_1shvshvlb90p9re.R.inc(37273);sum += work3.getEntry(k) * bMatrix.getEntry(k, j);
                }
                }__CLR4_4_1shvshvlb90p9re.R.inc(37274);bsum += sum * trialStepPoint.getEntry(j);
                __CLR4_4_1shvshvlb90p9re.R.inc(37275);final int jp = npt + j;
                __CLR4_4_1shvshvlb90p9re.R.inc(37276);for (int i = 0; (((i < n)&&(__CLR4_4_1shvshvlb90p9re.R.iget(37277)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(37278)==0&false)); i++) {{
                    __CLR4_4_1shvshvlb90p9re.R.inc(37279);sum += bMatrix.getEntry(jp, i) * trialStepPoint.getEntry(i);
                }
                }__CLR4_4_1shvshvlb90p9re.R.inc(37280);lagrangeValuesAtNewPoint.setEntry(jp, sum);
                __CLR4_4_1shvshvlb90p9re.R.inc(37281);bsum += sum * trialStepPoint.getEntry(j);
                __CLR4_4_1shvshvlb90p9re.R.inc(37282);dx += trialStepPoint.getEntry(j) * trustRegionCenterOffset.getEntry(j);
            }

            }__CLR4_4_1shvshvlb90p9re.R.inc(37283);beta = dx * dx + dsq * (xoptsq + dx + dx + HALF * dsq) + beta - bsum; // Original
            // beta += dx * dx + dsq * (xoptsq + dx + dx + HALF * dsq) - bsum; // XXX "testAckley" and "testDiffPow" fail.
            // beta = dx * dx + dsq * (xoptsq + 2 * dx + HALF * dsq) + beta - bsum; // XXX "testDiffPow" fails.

            __CLR4_4_1shvshvlb90p9re.R.inc(37284);lagrangeValuesAtNewPoint.setEntry(trustRegionCenterInterpolationPointIndex,
                          lagrangeValuesAtNewPoint.getEntry(trustRegionCenterInterpolationPointIndex) + ONE);

            // If NTRITS is zero, the denominator may be increased by replacing
            // the step D of ALTMOV by a Cauchy step. Then RESCUE may be called if
            // rounding errors have damaged the chosen denominator.

            __CLR4_4_1shvshvlb90p9re.R.inc(37285);if ((((ntrits == 0)&&(__CLR4_4_1shvshvlb90p9re.R.iget(37286)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(37287)==0&false))) {{
                // Computing 2nd power
                __CLR4_4_1shvshvlb90p9re.R.inc(37288);final double d1 = lagrangeValuesAtNewPoint.getEntry(knew);
                __CLR4_4_1shvshvlb90p9re.R.inc(37289);denom = d1 * d1 + alpha * beta;
                __CLR4_4_1shvshvlb90p9re.R.inc(37290);if ((((denom < cauchy && cauchy > ZERO)&&(__CLR4_4_1shvshvlb90p9re.R.iget(37291)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(37292)==0&false))) {{
                    __CLR4_4_1shvshvlb90p9re.R.inc(37293);for (int i = 0; (((i < n)&&(__CLR4_4_1shvshvlb90p9re.R.iget(37294)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(37295)==0&false)); i++) {{
                        __CLR4_4_1shvshvlb90p9re.R.inc(37296);newPoint.setEntry(i, alternativeNewPoint.getEntry(i));
                        __CLR4_4_1shvshvlb90p9re.R.inc(37297);trialStepPoint.setEntry(i, newPoint.getEntry(i) - trustRegionCenterOffset.getEntry(i));
                    }
                    }__CLR4_4_1shvshvlb90p9re.R.inc(37298);cauchy = ZERO; // XXX Useful statement?
                    __CLR4_4_1shvshvlb90p9re.R.inc(37299);state = 230; __CLR4_4_1shvshvlb90p9re.R.inc(37300);break;
                }
                // Alternatively, if NTRITS is positive, then set KNEW to the index of
                // the next interpolation point to be deleted to make room for a trust
                // region step. Again RESCUE may be called if rounding errors have damaged_
                // the chosen denominator, which is the reason for attempting to select
                // KNEW before calculating the next value of the objective function.

            }} }else {{
                __CLR4_4_1shvshvlb90p9re.R.inc(37301);final double delsq = delta * delta;
                __CLR4_4_1shvshvlb90p9re.R.inc(37302);scaden = ZERO;
                __CLR4_4_1shvshvlb90p9re.R.inc(37303);biglsq = ZERO;
                __CLR4_4_1shvshvlb90p9re.R.inc(37304);knew = 0;
                __CLR4_4_1shvshvlb90p9re.R.inc(37305);for (int k = 0; (((k < npt)&&(__CLR4_4_1shvshvlb90p9re.R.iget(37306)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(37307)==0&false)); k++) {{
                    __CLR4_4_1shvshvlb90p9re.R.inc(37308);if ((((k == trustRegionCenterInterpolationPointIndex)&&(__CLR4_4_1shvshvlb90p9re.R.iget(37309)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(37310)==0&false))) {{
                        __CLR4_4_1shvshvlb90p9re.R.inc(37311);continue;
                    }
                    }__CLR4_4_1shvshvlb90p9re.R.inc(37312);double hdiag = ZERO;
                    __CLR4_4_1shvshvlb90p9re.R.inc(37313);for (int m = 0; (((m < nptm)&&(__CLR4_4_1shvshvlb90p9re.R.iget(37314)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(37315)==0&false)); m++) {{
                        // Computing 2nd power
                        __CLR4_4_1shvshvlb90p9re.R.inc(37316);final double d1 = zMatrix.getEntry(k, m);
                        __CLR4_4_1shvshvlb90p9re.R.inc(37317);hdiag += d1 * d1;
                    }
                    // Computing 2nd power
                    }__CLR4_4_1shvshvlb90p9re.R.inc(37318);final double d2 = lagrangeValuesAtNewPoint.getEntry(k);
                    __CLR4_4_1shvshvlb90p9re.R.inc(37319);final double den = beta * hdiag + d2 * d2;
                    __CLR4_4_1shvshvlb90p9re.R.inc(37320);distsq = ZERO;
                    __CLR4_4_1shvshvlb90p9re.R.inc(37321);for (int j = 0; (((j < n)&&(__CLR4_4_1shvshvlb90p9re.R.iget(37322)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(37323)==0&false)); j++) {{
                        // Computing 2nd power
                        __CLR4_4_1shvshvlb90p9re.R.inc(37324);final double d3 = interpolationPoints.getEntry(k, j) - trustRegionCenterOffset.getEntry(j);
                        __CLR4_4_1shvshvlb90p9re.R.inc(37325);distsq += d3 * d3;
                    }
                    // Computing MAX
                    // Computing 2nd power
                    }__CLR4_4_1shvshvlb90p9re.R.inc(37326);final double d4 = distsq / delsq;
                    __CLR4_4_1shvshvlb90p9re.R.inc(37327);final double temp = Math.max(ONE, d4 * d4);
                    __CLR4_4_1shvshvlb90p9re.R.inc(37328);if ((((temp * den > scaden)&&(__CLR4_4_1shvshvlb90p9re.R.iget(37329)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(37330)==0&false))) {{
                        __CLR4_4_1shvshvlb90p9re.R.inc(37331);scaden = temp * den;
                        __CLR4_4_1shvshvlb90p9re.R.inc(37332);knew = k;
                        __CLR4_4_1shvshvlb90p9re.R.inc(37333);denom = den;
                    }
                    // Computing MAX
                    // Computing 2nd power
                    }__CLR4_4_1shvshvlb90p9re.R.inc(37334);final double d5 = lagrangeValuesAtNewPoint.getEntry(k);
                    __CLR4_4_1shvshvlb90p9re.R.inc(37335);biglsq = Math.max(biglsq, temp * (d5 * d5));
                }
            }}

            // Put the variables for the next calculation of the objective function
            //   in XNEW, with any adjustments for the bounds.

            // Calculate the value of the objective function at XBASE+XNEW, unless
            //   the limit on the number of calculations of F has been reached.

        }}
        case 360:if (!__CLB4_4_1_bool0) {__CLR4_4_1shvshvlb90p9re.R.inc(37336);__CLB4_4_1_bool0=true;} {
            __CLR4_4_1shvshvlb90p9re.R.inc(37337);printState(360); // XXX
            __CLR4_4_1shvshvlb90p9re.R.inc(37338);for (int i = 0; (((i < n)&&(__CLR4_4_1shvshvlb90p9re.R.iget(37339)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(37340)==0&false)); i++) {{
                // Computing MIN
                // Computing MAX
                __CLR4_4_1shvshvlb90p9re.R.inc(37341);final double d3 = lowerBound[i];
                __CLR4_4_1shvshvlb90p9re.R.inc(37342);final double d4 = originShift.getEntry(i) + newPoint.getEntry(i);
                __CLR4_4_1shvshvlb90p9re.R.inc(37343);final double d1 = Math.max(d3, d4);
                __CLR4_4_1shvshvlb90p9re.R.inc(37344);final double d2 = upperBound[i];
                __CLR4_4_1shvshvlb90p9re.R.inc(37345);currentBest.setEntry(i, Math.min(d1, d2));
                __CLR4_4_1shvshvlb90p9re.R.inc(37346);if ((((newPoint.getEntry(i) == lowerDifference.getEntry(i))&&(__CLR4_4_1shvshvlb90p9re.R.iget(37347)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(37348)==0&false))) {{
                    __CLR4_4_1shvshvlb90p9re.R.inc(37349);currentBest.setEntry(i, lowerBound[i]);
                }
                }__CLR4_4_1shvshvlb90p9re.R.inc(37350);if ((((newPoint.getEntry(i) == upperDifference.getEntry(i))&&(__CLR4_4_1shvshvlb90p9re.R.iget(37351)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(37352)==0&false))) {{
                    __CLR4_4_1shvshvlb90p9re.R.inc(37353);currentBest.setEntry(i, upperBound[i]);
                }
            }}

            }__CLR4_4_1shvshvlb90p9re.R.inc(37354);f = computeObjectiveValue(currentBest.toArray());

            __CLR4_4_1shvshvlb90p9re.R.inc(37355);if ((((!isMinimize)&&(__CLR4_4_1shvshvlb90p9re.R.iget(37356)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(37357)==0&false)))
                {__CLR4_4_1shvshvlb90p9re.R.inc(37358);f = -f;
            }__CLR4_4_1shvshvlb90p9re.R.inc(37359);if ((((ntrits == -1)&&(__CLR4_4_1shvshvlb90p9re.R.iget(37360)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(37361)==0&false))) {{
                __CLR4_4_1shvshvlb90p9re.R.inc(37362);fsave = f;
                __CLR4_4_1shvshvlb90p9re.R.inc(37363);state = 720; __CLR4_4_1shvshvlb90p9re.R.inc(37364);break;
            }

            // Use the quadratic model to predict the change in F due to the step D,
            //   and set DIFF to the error of this prediction.

            }__CLR4_4_1shvshvlb90p9re.R.inc(37365);final double fopt = fAtInterpolationPoints.getEntry(trustRegionCenterInterpolationPointIndex);
            __CLR4_4_1shvshvlb90p9re.R.inc(37366);double vquad = ZERO;
            __CLR4_4_1shvshvlb90p9re.R.inc(37367);int ih = 0;
            __CLR4_4_1shvshvlb90p9re.R.inc(37368);for (int j = 0; (((j < n)&&(__CLR4_4_1shvshvlb90p9re.R.iget(37369)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(37370)==0&false)); j++) {{
                __CLR4_4_1shvshvlb90p9re.R.inc(37371);vquad += trialStepPoint.getEntry(j) * gradientAtTrustRegionCenter.getEntry(j);
                __CLR4_4_1shvshvlb90p9re.R.inc(37372);for (int i = 0; (((i <= j)&&(__CLR4_4_1shvshvlb90p9re.R.iget(37373)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(37374)==0&false)); i++) {{
                    __CLR4_4_1shvshvlb90p9re.R.inc(37375);double temp = trialStepPoint.getEntry(i) * trialStepPoint.getEntry(j);
                    __CLR4_4_1shvshvlb90p9re.R.inc(37376);if ((((i == j)&&(__CLR4_4_1shvshvlb90p9re.R.iget(37377)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(37378)==0&false))) {{
                        __CLR4_4_1shvshvlb90p9re.R.inc(37379);temp *= HALF;
                    }
                    }__CLR4_4_1shvshvlb90p9re.R.inc(37380);vquad += modelSecondDerivativesValues.getEntry(ih) * temp;
                    __CLR4_4_1shvshvlb90p9re.R.inc(37381);ih++;
               }
            }}
            }__CLR4_4_1shvshvlb90p9re.R.inc(37382);for (int k = 0; (((k < npt)&&(__CLR4_4_1shvshvlb90p9re.R.iget(37383)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(37384)==0&false)); k++) {{
                // Computing 2nd power
                __CLR4_4_1shvshvlb90p9re.R.inc(37385);final double d1 = work2.getEntry(k);
                __CLR4_4_1shvshvlb90p9re.R.inc(37386);final double d2 = d1 * d1; // "d1" must be squared first to prevent test failures.
                __CLR4_4_1shvshvlb90p9re.R.inc(37387);vquad += HALF * modelSecondDerivativesParameters.getEntry(k) * d2;
            }
            }__CLR4_4_1shvshvlb90p9re.R.inc(37388);final double diff = f - fopt - vquad;
            __CLR4_4_1shvshvlb90p9re.R.inc(37389);diffc = diffb;
            __CLR4_4_1shvshvlb90p9re.R.inc(37390);diffb = diffa;
            __CLR4_4_1shvshvlb90p9re.R.inc(37391);diffa = Math.abs(diff);
            __CLR4_4_1shvshvlb90p9re.R.inc(37392);if ((((dnorm > rho)&&(__CLR4_4_1shvshvlb90p9re.R.iget(37393)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(37394)==0&false))) {{
                __CLR4_4_1shvshvlb90p9re.R.inc(37395);nfsav = getEvaluations();
            }

            // Pick the next value of DELTA after a trust region step.

            }__CLR4_4_1shvshvlb90p9re.R.inc(37396);if ((((ntrits > 0)&&(__CLR4_4_1shvshvlb90p9re.R.iget(37397)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(37398)==0&false))) {{
                __CLR4_4_1shvshvlb90p9re.R.inc(37399);if ((((vquad >= ZERO)&&(__CLR4_4_1shvshvlb90p9re.R.iget(37400)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(37401)==0&false))) {{
                    __CLR4_4_1shvshvlb90p9re.R.inc(37402);throw new MathIllegalStateException(LocalizedFormats.TRUST_REGION_STEP_FAILED, vquad);
                }
                }__CLR4_4_1shvshvlb90p9re.R.inc(37403);ratio = (f - fopt) / vquad;
                __CLR4_4_1shvshvlb90p9re.R.inc(37404);final double hDelta = HALF * delta;
                __CLR4_4_1shvshvlb90p9re.R.inc(37405);if ((((ratio <= ONE_OVER_TEN)&&(__CLR4_4_1shvshvlb90p9re.R.iget(37406)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(37407)==0&false))) {{
                    // Computing MIN
                    __CLR4_4_1shvshvlb90p9re.R.inc(37408);delta = Math.min(hDelta, dnorm);
                } }else {__CLR4_4_1shvshvlb90p9re.R.inc(37409);if ((((ratio <= .7)&&(__CLR4_4_1shvshvlb90p9re.R.iget(37410)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(37411)==0&false))) {{
                    // Computing MAX
                    __CLR4_4_1shvshvlb90p9re.R.inc(37412);delta = Math.max(hDelta, dnorm);
                } }else {{
                    // Computing MAX
                    __CLR4_4_1shvshvlb90p9re.R.inc(37413);delta = Math.max(hDelta, 2 * dnorm);
                }
                }}__CLR4_4_1shvshvlb90p9re.R.inc(37414);if ((((delta <= rho * 1.5)&&(__CLR4_4_1shvshvlb90p9re.R.iget(37415)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(37416)==0&false))) {{
                    __CLR4_4_1shvshvlb90p9re.R.inc(37417);delta = rho;
                }

                // Recalculate KNEW and DENOM if the new F is less than FOPT.

                }__CLR4_4_1shvshvlb90p9re.R.inc(37418);if ((((f < fopt)&&(__CLR4_4_1shvshvlb90p9re.R.iget(37419)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(37420)==0&false))) {{
                    __CLR4_4_1shvshvlb90p9re.R.inc(37421);final int ksav = knew;
                    __CLR4_4_1shvshvlb90p9re.R.inc(37422);final double densav = denom;
                    __CLR4_4_1shvshvlb90p9re.R.inc(37423);final double delsq = delta * delta;
                    __CLR4_4_1shvshvlb90p9re.R.inc(37424);scaden = ZERO;
                    __CLR4_4_1shvshvlb90p9re.R.inc(37425);biglsq = ZERO;
                    __CLR4_4_1shvshvlb90p9re.R.inc(37426);knew = 0;
                    __CLR4_4_1shvshvlb90p9re.R.inc(37427);for (int k = 0; (((k < npt)&&(__CLR4_4_1shvshvlb90p9re.R.iget(37428)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(37429)==0&false)); k++) {{
                        __CLR4_4_1shvshvlb90p9re.R.inc(37430);double hdiag = ZERO;
                        __CLR4_4_1shvshvlb90p9re.R.inc(37431);for (int m = 0; (((m < nptm)&&(__CLR4_4_1shvshvlb90p9re.R.iget(37432)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(37433)==0&false)); m++) {{
                            // Computing 2nd power
                            __CLR4_4_1shvshvlb90p9re.R.inc(37434);final double d1 = zMatrix.getEntry(k, m);
                            __CLR4_4_1shvshvlb90p9re.R.inc(37435);hdiag += d1 * d1;
                        }
                        // Computing 2nd power
                        }__CLR4_4_1shvshvlb90p9re.R.inc(37436);final double d1 = lagrangeValuesAtNewPoint.getEntry(k);
                        __CLR4_4_1shvshvlb90p9re.R.inc(37437);final double den = beta * hdiag + d1 * d1;
                        __CLR4_4_1shvshvlb90p9re.R.inc(37438);distsq = ZERO;
                        __CLR4_4_1shvshvlb90p9re.R.inc(37439);for (int j = 0; (((j < n)&&(__CLR4_4_1shvshvlb90p9re.R.iget(37440)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(37441)==0&false)); j++) {{
                            // Computing 2nd power
                            __CLR4_4_1shvshvlb90p9re.R.inc(37442);final double d2 = interpolationPoints.getEntry(k, j) - newPoint.getEntry(j);
                            __CLR4_4_1shvshvlb90p9re.R.inc(37443);distsq += d2 * d2;
                        }
                        // Computing MAX
                        // Computing 2nd power
                        }__CLR4_4_1shvshvlb90p9re.R.inc(37444);final double d3 = distsq / delsq;
                        __CLR4_4_1shvshvlb90p9re.R.inc(37445);final double temp = Math.max(ONE, d3 * d3);
                        __CLR4_4_1shvshvlb90p9re.R.inc(37446);if ((((temp * den > scaden)&&(__CLR4_4_1shvshvlb90p9re.R.iget(37447)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(37448)==0&false))) {{
                            __CLR4_4_1shvshvlb90p9re.R.inc(37449);scaden = temp * den;
                            __CLR4_4_1shvshvlb90p9re.R.inc(37450);knew = k;
                            __CLR4_4_1shvshvlb90p9re.R.inc(37451);denom = den;
                        }
                        // Computing MAX
                        // Computing 2nd power
                        }__CLR4_4_1shvshvlb90p9re.R.inc(37452);final double d4 = lagrangeValuesAtNewPoint.getEntry(k);
                        __CLR4_4_1shvshvlb90p9re.R.inc(37453);final double d5 = temp * (d4 * d4);
                        __CLR4_4_1shvshvlb90p9re.R.inc(37454);biglsq = Math.max(biglsq, d5);
                    }
                    }__CLR4_4_1shvshvlb90p9re.R.inc(37455);if ((((scaden <= HALF * biglsq)&&(__CLR4_4_1shvshvlb90p9re.R.iget(37456)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(37457)==0&false))) {{
                        __CLR4_4_1shvshvlb90p9re.R.inc(37458);knew = ksav;
                        __CLR4_4_1shvshvlb90p9re.R.inc(37459);denom = densav;
                    }
                }}
            }}

            // Update BMAT and ZMAT, so that the KNEW-th interpolation point can be
            // moved. Also update the second derivative terms of the model.

            }__CLR4_4_1shvshvlb90p9re.R.inc(37460);update(beta, denom, knew);

            __CLR4_4_1shvshvlb90p9re.R.inc(37461);ih = 0;
            __CLR4_4_1shvshvlb90p9re.R.inc(37462);final double pqold = modelSecondDerivativesParameters.getEntry(knew);
            __CLR4_4_1shvshvlb90p9re.R.inc(37463);modelSecondDerivativesParameters.setEntry(knew, ZERO);
            __CLR4_4_1shvshvlb90p9re.R.inc(37464);for (int i = 0; (((i < n)&&(__CLR4_4_1shvshvlb90p9re.R.iget(37465)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(37466)==0&false)); i++) {{
                __CLR4_4_1shvshvlb90p9re.R.inc(37467);final double temp = pqold * interpolationPoints.getEntry(knew, i);
                __CLR4_4_1shvshvlb90p9re.R.inc(37468);for (int j = 0; (((j <= i)&&(__CLR4_4_1shvshvlb90p9re.R.iget(37469)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(37470)==0&false)); j++) {{
                    __CLR4_4_1shvshvlb90p9re.R.inc(37471);modelSecondDerivativesValues.setEntry(ih, modelSecondDerivativesValues.getEntry(ih) + temp * interpolationPoints.getEntry(knew, j));
                    __CLR4_4_1shvshvlb90p9re.R.inc(37472);ih++;
                }
            }}
            }__CLR4_4_1shvshvlb90p9re.R.inc(37473);for (int m = 0; (((m < nptm)&&(__CLR4_4_1shvshvlb90p9re.R.iget(37474)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(37475)==0&false)); m++) {{
                __CLR4_4_1shvshvlb90p9re.R.inc(37476);final double temp = diff * zMatrix.getEntry(knew, m);
                __CLR4_4_1shvshvlb90p9re.R.inc(37477);for (int k = 0; (((k < npt)&&(__CLR4_4_1shvshvlb90p9re.R.iget(37478)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(37479)==0&false)); k++) {{
                    __CLR4_4_1shvshvlb90p9re.R.inc(37480);modelSecondDerivativesParameters.setEntry(k, modelSecondDerivativesParameters.getEntry(k) + temp * zMatrix.getEntry(k, m));
                }
            }}

            // Include the new interpolation point, and make the changes to GOPT at
            // the old XOPT that are caused by the updating of the quadratic model.

            }__CLR4_4_1shvshvlb90p9re.R.inc(37481);fAtInterpolationPoints.setEntry(knew,  f);
            __CLR4_4_1shvshvlb90p9re.R.inc(37482);for (int i = 0; (((i < n)&&(__CLR4_4_1shvshvlb90p9re.R.iget(37483)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(37484)==0&false)); i++) {{
                __CLR4_4_1shvshvlb90p9re.R.inc(37485);interpolationPoints.setEntry(knew, i, newPoint.getEntry(i));
                __CLR4_4_1shvshvlb90p9re.R.inc(37486);work1.setEntry(i, bMatrix.getEntry(knew, i));
            }
            }__CLR4_4_1shvshvlb90p9re.R.inc(37487);for (int k = 0; (((k < npt)&&(__CLR4_4_1shvshvlb90p9re.R.iget(37488)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(37489)==0&false)); k++) {{
                __CLR4_4_1shvshvlb90p9re.R.inc(37490);double suma = ZERO;
                __CLR4_4_1shvshvlb90p9re.R.inc(37491);for (int m = 0; (((m < nptm)&&(__CLR4_4_1shvshvlb90p9re.R.iget(37492)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(37493)==0&false)); m++) {{
                    __CLR4_4_1shvshvlb90p9re.R.inc(37494);suma += zMatrix.getEntry(knew, m) * zMatrix.getEntry(k, m);
                }
                }__CLR4_4_1shvshvlb90p9re.R.inc(37495);double sumb = ZERO;
                __CLR4_4_1shvshvlb90p9re.R.inc(37496);for (int j = 0; (((j < n)&&(__CLR4_4_1shvshvlb90p9re.R.iget(37497)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(37498)==0&false)); j++) {{
                    __CLR4_4_1shvshvlb90p9re.R.inc(37499);sumb += interpolationPoints.getEntry(k, j) * trustRegionCenterOffset.getEntry(j);
                }
                }__CLR4_4_1shvshvlb90p9re.R.inc(37500);final double temp = suma * sumb;
                __CLR4_4_1shvshvlb90p9re.R.inc(37501);for (int i = 0; (((i < n)&&(__CLR4_4_1shvshvlb90p9re.R.iget(37502)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(37503)==0&false)); i++) {{
                    __CLR4_4_1shvshvlb90p9re.R.inc(37504);work1.setEntry(i, work1.getEntry(i) + temp * interpolationPoints.getEntry(k, i));
                }
            }}
            }__CLR4_4_1shvshvlb90p9re.R.inc(37505);for (int i = 0; (((i < n)&&(__CLR4_4_1shvshvlb90p9re.R.iget(37506)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(37507)==0&false)); i++) {{
                __CLR4_4_1shvshvlb90p9re.R.inc(37508);gradientAtTrustRegionCenter.setEntry(i, gradientAtTrustRegionCenter.getEntry(i) + diff * work1.getEntry(i));
            }

            // Update XOPT, GOPT and KOPT if the new calculated F is less than FOPT.

            }__CLR4_4_1shvshvlb90p9re.R.inc(37509);if ((((f < fopt)&&(__CLR4_4_1shvshvlb90p9re.R.iget(37510)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(37511)==0&false))) {{
                __CLR4_4_1shvshvlb90p9re.R.inc(37512);trustRegionCenterInterpolationPointIndex = knew;
                __CLR4_4_1shvshvlb90p9re.R.inc(37513);xoptsq = ZERO;
                __CLR4_4_1shvshvlb90p9re.R.inc(37514);ih = 0;
                __CLR4_4_1shvshvlb90p9re.R.inc(37515);for (int j = 0; (((j < n)&&(__CLR4_4_1shvshvlb90p9re.R.iget(37516)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(37517)==0&false)); j++) {{
                    __CLR4_4_1shvshvlb90p9re.R.inc(37518);trustRegionCenterOffset.setEntry(j, newPoint.getEntry(j));
                    // Computing 2nd power
                    __CLR4_4_1shvshvlb90p9re.R.inc(37519);final double d1 = trustRegionCenterOffset.getEntry(j);
                    __CLR4_4_1shvshvlb90p9re.R.inc(37520);xoptsq += d1 * d1;
                    __CLR4_4_1shvshvlb90p9re.R.inc(37521);for (int i = 0; (((i <= j)&&(__CLR4_4_1shvshvlb90p9re.R.iget(37522)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(37523)==0&false)); i++) {{
                        __CLR4_4_1shvshvlb90p9re.R.inc(37524);if ((((i < j)&&(__CLR4_4_1shvshvlb90p9re.R.iget(37525)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(37526)==0&false))) {{
                            __CLR4_4_1shvshvlb90p9re.R.inc(37527);gradientAtTrustRegionCenter.setEntry(j, gradientAtTrustRegionCenter.getEntry(j) + modelSecondDerivativesValues.getEntry(ih) * trialStepPoint.getEntry(i));
                        }
                        }__CLR4_4_1shvshvlb90p9re.R.inc(37528);gradientAtTrustRegionCenter.setEntry(i, gradientAtTrustRegionCenter.getEntry(i) + modelSecondDerivativesValues.getEntry(ih) * trialStepPoint.getEntry(j));
                        __CLR4_4_1shvshvlb90p9re.R.inc(37529);ih++;
                    }
                }}
                }__CLR4_4_1shvshvlb90p9re.R.inc(37530);for (int k = 0; (((k < npt)&&(__CLR4_4_1shvshvlb90p9re.R.iget(37531)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(37532)==0&false)); k++) {{
                    __CLR4_4_1shvshvlb90p9re.R.inc(37533);double temp = ZERO;
                    __CLR4_4_1shvshvlb90p9re.R.inc(37534);for (int j = 0; (((j < n)&&(__CLR4_4_1shvshvlb90p9re.R.iget(37535)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(37536)==0&false)); j++) {{
                        __CLR4_4_1shvshvlb90p9re.R.inc(37537);temp += interpolationPoints.getEntry(k, j) * trialStepPoint.getEntry(j);
                    }
                    }__CLR4_4_1shvshvlb90p9re.R.inc(37538);temp *= modelSecondDerivativesParameters.getEntry(k);
                    __CLR4_4_1shvshvlb90p9re.R.inc(37539);for (int i = 0; (((i < n)&&(__CLR4_4_1shvshvlb90p9re.R.iget(37540)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(37541)==0&false)); i++) {{
                        __CLR4_4_1shvshvlb90p9re.R.inc(37542);gradientAtTrustRegionCenter.setEntry(i, gradientAtTrustRegionCenter.getEntry(i) + temp * interpolationPoints.getEntry(k, i));
                    }
                }}
            }}

            // Calculate the parameters of the least Frobenius norm interpolant to
            // the current data, the gradient of this interpolant at XOPT being put
            // into VLAG(NPT+I), I=1,2,...,N.

            }__CLR4_4_1shvshvlb90p9re.R.inc(37543);if ((((ntrits > 0)&&(__CLR4_4_1shvshvlb90p9re.R.iget(37544)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(37545)==0&false))) {{
                __CLR4_4_1shvshvlb90p9re.R.inc(37546);for (int k = 0; (((k < npt)&&(__CLR4_4_1shvshvlb90p9re.R.iget(37547)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(37548)==0&false)); k++) {{
                    __CLR4_4_1shvshvlb90p9re.R.inc(37549);lagrangeValuesAtNewPoint.setEntry(k, fAtInterpolationPoints.getEntry(k) - fAtInterpolationPoints.getEntry(trustRegionCenterInterpolationPointIndex));
                    __CLR4_4_1shvshvlb90p9re.R.inc(37550);work3.setEntry(k, ZERO);
                }
                }__CLR4_4_1shvshvlb90p9re.R.inc(37551);for (int j = 0; (((j < nptm)&&(__CLR4_4_1shvshvlb90p9re.R.iget(37552)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(37553)==0&false)); j++) {{
                    __CLR4_4_1shvshvlb90p9re.R.inc(37554);double sum = ZERO;
                    __CLR4_4_1shvshvlb90p9re.R.inc(37555);for (int k = 0; (((k < npt)&&(__CLR4_4_1shvshvlb90p9re.R.iget(37556)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(37557)==0&false)); k++) {{
                        __CLR4_4_1shvshvlb90p9re.R.inc(37558);sum += zMatrix.getEntry(k, j) * lagrangeValuesAtNewPoint.getEntry(k);
                    }
                    }__CLR4_4_1shvshvlb90p9re.R.inc(37559);for (int k = 0; (((k < npt)&&(__CLR4_4_1shvshvlb90p9re.R.iget(37560)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(37561)==0&false)); k++) {{
                        __CLR4_4_1shvshvlb90p9re.R.inc(37562);work3.setEntry(k, work3.getEntry(k) + sum * zMatrix.getEntry(k, j));
                    }
                }}
                }__CLR4_4_1shvshvlb90p9re.R.inc(37563);for (int k = 0; (((k < npt)&&(__CLR4_4_1shvshvlb90p9re.R.iget(37564)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(37565)==0&false)); k++) {{
                    __CLR4_4_1shvshvlb90p9re.R.inc(37566);double sum = ZERO;
                    __CLR4_4_1shvshvlb90p9re.R.inc(37567);for (int j = 0; (((j < n)&&(__CLR4_4_1shvshvlb90p9re.R.iget(37568)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(37569)==0&false)); j++) {{
                        __CLR4_4_1shvshvlb90p9re.R.inc(37570);sum += interpolationPoints.getEntry(k, j) * trustRegionCenterOffset.getEntry(j);
                    }
                    }__CLR4_4_1shvshvlb90p9re.R.inc(37571);work2.setEntry(k, work3.getEntry(k));
                    __CLR4_4_1shvshvlb90p9re.R.inc(37572);work3.setEntry(k, sum * work3.getEntry(k));
                }
                }__CLR4_4_1shvshvlb90p9re.R.inc(37573);double gqsq = ZERO;
                __CLR4_4_1shvshvlb90p9re.R.inc(37574);double gisq = ZERO;
                __CLR4_4_1shvshvlb90p9re.R.inc(37575);for (int i = 0; (((i < n)&&(__CLR4_4_1shvshvlb90p9re.R.iget(37576)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(37577)==0&false)); i++) {{
                    __CLR4_4_1shvshvlb90p9re.R.inc(37578);double sum = ZERO;
                    __CLR4_4_1shvshvlb90p9re.R.inc(37579);for (int k = 0; (((k < npt)&&(__CLR4_4_1shvshvlb90p9re.R.iget(37580)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(37581)==0&false)); k++) {{
                        __CLR4_4_1shvshvlb90p9re.R.inc(37582);sum += bMatrix.getEntry(k, i) *
                            lagrangeValuesAtNewPoint.getEntry(k) + interpolationPoints.getEntry(k, i) * work3.getEntry(k);
                    }
                    }__CLR4_4_1shvshvlb90p9re.R.inc(37583);if ((((trustRegionCenterOffset.getEntry(i) == lowerDifference.getEntry(i))&&(__CLR4_4_1shvshvlb90p9re.R.iget(37584)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(37585)==0&false))) {{
                        // Computing MIN
                        // Computing 2nd power
                        __CLR4_4_1shvshvlb90p9re.R.inc(37586);final double d1 = Math.min(ZERO, gradientAtTrustRegionCenter.getEntry(i));
                        __CLR4_4_1shvshvlb90p9re.R.inc(37587);gqsq += d1 * d1;
                        // Computing 2nd power
                        __CLR4_4_1shvshvlb90p9re.R.inc(37588);final double d2 = Math.min(ZERO, sum);
                        __CLR4_4_1shvshvlb90p9re.R.inc(37589);gisq += d2 * d2;
                    } }else {__CLR4_4_1shvshvlb90p9re.R.inc(37590);if ((((trustRegionCenterOffset.getEntry(i) == upperDifference.getEntry(i))&&(__CLR4_4_1shvshvlb90p9re.R.iget(37591)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(37592)==0&false))) {{
                        // Computing MAX
                        // Computing 2nd power
                        __CLR4_4_1shvshvlb90p9re.R.inc(37593);final double d1 = Math.max(ZERO, gradientAtTrustRegionCenter.getEntry(i));
                        __CLR4_4_1shvshvlb90p9re.R.inc(37594);gqsq += d1 * d1;
                        // Computing 2nd power
                        __CLR4_4_1shvshvlb90p9re.R.inc(37595);final double d2 = Math.max(ZERO, sum);
                        __CLR4_4_1shvshvlb90p9re.R.inc(37596);gisq += d2 * d2;
                    } }else {{
                        // Computing 2nd power
                        __CLR4_4_1shvshvlb90p9re.R.inc(37597);final double d1 = gradientAtTrustRegionCenter.getEntry(i);
                        __CLR4_4_1shvshvlb90p9re.R.inc(37598);gqsq += d1 * d1;
                        __CLR4_4_1shvshvlb90p9re.R.inc(37599);gisq += sum * sum;
                    }
                    }}__CLR4_4_1shvshvlb90p9re.R.inc(37600);lagrangeValuesAtNewPoint.setEntry(npt + i, sum);
                }

                // Test whether to replace the new quadratic model by the least Frobenius
                // norm interpolant, making the replacement if the test is satisfied.

                }__CLR4_4_1shvshvlb90p9re.R.inc(37601);++itest;
                __CLR4_4_1shvshvlb90p9re.R.inc(37602);if ((((gqsq < TEN * gisq)&&(__CLR4_4_1shvshvlb90p9re.R.iget(37603)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(37604)==0&false))) {{
                    __CLR4_4_1shvshvlb90p9re.R.inc(37605);itest = 0;
                }
                }__CLR4_4_1shvshvlb90p9re.R.inc(37606);if ((((itest >= 3)&&(__CLR4_4_1shvshvlb90p9re.R.iget(37607)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(37608)==0&false))) {{
                    __CLR4_4_1shvshvlb90p9re.R.inc(37609);for (int i = 0, max = Math.max(npt, nh); (((i < max)&&(__CLR4_4_1shvshvlb90p9re.R.iget(37610)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(37611)==0&false)); i++) {{
                        __CLR4_4_1shvshvlb90p9re.R.inc(37612);if ((((i < n)&&(__CLR4_4_1shvshvlb90p9re.R.iget(37613)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(37614)==0&false))) {{
                            __CLR4_4_1shvshvlb90p9re.R.inc(37615);gradientAtTrustRegionCenter.setEntry(i, lagrangeValuesAtNewPoint.getEntry(npt + i));
                        }
                        }__CLR4_4_1shvshvlb90p9re.R.inc(37616);if ((((i < npt)&&(__CLR4_4_1shvshvlb90p9re.R.iget(37617)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(37618)==0&false))) {{
                            __CLR4_4_1shvshvlb90p9re.R.inc(37619);modelSecondDerivativesParameters.setEntry(i, work2.getEntry(i));
                        }
                        }__CLR4_4_1shvshvlb90p9re.R.inc(37620);if ((((i < nh)&&(__CLR4_4_1shvshvlb90p9re.R.iget(37621)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(37622)==0&false))) {{
                            __CLR4_4_1shvshvlb90p9re.R.inc(37623);modelSecondDerivativesValues.setEntry(i, ZERO);
                        }
                        }__CLR4_4_1shvshvlb90p9re.R.inc(37624);itest = 0;
                    }
                }}
            }}

            // If a trust region step has provided a sufficient decrease in F, then
            // branch for another trust region calculation. The case NTRITS=0 occurs
            // when the new interpolation point was reached by an alternative step.

            }__CLR4_4_1shvshvlb90p9re.R.inc(37625);if ((((ntrits == 0)&&(__CLR4_4_1shvshvlb90p9re.R.iget(37626)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(37627)==0&false))) {{
                __CLR4_4_1shvshvlb90p9re.R.inc(37628);state = 60; __CLR4_4_1shvshvlb90p9re.R.inc(37629);break;
            }
            }__CLR4_4_1shvshvlb90p9re.R.inc(37630);if ((((f <= fopt + ONE_OVER_TEN * vquad)&&(__CLR4_4_1shvshvlb90p9re.R.iget(37631)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(37632)==0&false))) {{
                __CLR4_4_1shvshvlb90p9re.R.inc(37633);state = 60; __CLR4_4_1shvshvlb90p9re.R.inc(37634);break;
            }

            // Alternatively, find out if the interpolation points are close enough
            //   to the best point so far.

            // Computing MAX
            // Computing 2nd power
            }__CLR4_4_1shvshvlb90p9re.R.inc(37635);final double d1 = TWO * delta;
            // Computing 2nd power
            __CLR4_4_1shvshvlb90p9re.R.inc(37636);final double d2 = TEN * rho;
            __CLR4_4_1shvshvlb90p9re.R.inc(37637);distsq = Math.max(d1 * d1, d2 * d2);
        }
        case 650:if (!__CLB4_4_1_bool0) {__CLR4_4_1shvshvlb90p9re.R.inc(37638);__CLB4_4_1_bool0=true;} {
            __CLR4_4_1shvshvlb90p9re.R.inc(37639);printState(650); // XXX
            __CLR4_4_1shvshvlb90p9re.R.inc(37640);knew = -1;
            __CLR4_4_1shvshvlb90p9re.R.inc(37641);for (int k = 0; (((k < npt)&&(__CLR4_4_1shvshvlb90p9re.R.iget(37642)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(37643)==0&false)); k++) {{
                __CLR4_4_1shvshvlb90p9re.R.inc(37644);double sum = ZERO;
                __CLR4_4_1shvshvlb90p9re.R.inc(37645);for (int j = 0; (((j < n)&&(__CLR4_4_1shvshvlb90p9re.R.iget(37646)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(37647)==0&false)); j++) {{
                    // Computing 2nd power
                    __CLR4_4_1shvshvlb90p9re.R.inc(37648);final double d1 = interpolationPoints.getEntry(k, j) - trustRegionCenterOffset.getEntry(j);
                    __CLR4_4_1shvshvlb90p9re.R.inc(37649);sum += d1 * d1;
                }
                }__CLR4_4_1shvshvlb90p9re.R.inc(37650);if ((((sum > distsq)&&(__CLR4_4_1shvshvlb90p9re.R.iget(37651)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(37652)==0&false))) {{
                    __CLR4_4_1shvshvlb90p9re.R.inc(37653);knew = k;
                    __CLR4_4_1shvshvlb90p9re.R.inc(37654);distsq = sum;
                }
            }}

            // If KNEW is positive, then ALTMOV finds alternative new positions for
            // the KNEW-th interpolation point within distance ADELT of XOPT. It is
            // reached via label 90. Otherwise, there is a branch to label 60 for
            // another trust region iteration, unless the calculations with the
            // current RHO are complete.

            }__CLR4_4_1shvshvlb90p9re.R.inc(37655);if ((((knew >= 0)&&(__CLR4_4_1shvshvlb90p9re.R.iget(37656)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(37657)==0&false))) {{
                __CLR4_4_1shvshvlb90p9re.R.inc(37658);final double dist = Math.sqrt(distsq);
                __CLR4_4_1shvshvlb90p9re.R.inc(37659);if ((((ntrits == -1)&&(__CLR4_4_1shvshvlb90p9re.R.iget(37660)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(37661)==0&false))) {{
                    // Computing MIN
                    __CLR4_4_1shvshvlb90p9re.R.inc(37662);delta = Math.min(ONE_OVER_TEN * delta, HALF * dist);
                    __CLR4_4_1shvshvlb90p9re.R.inc(37663);if ((((delta <= rho * 1.5)&&(__CLR4_4_1shvshvlb90p9re.R.iget(37664)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(37665)==0&false))) {{
                        __CLR4_4_1shvshvlb90p9re.R.inc(37666);delta = rho;
                    }
                }}
                }__CLR4_4_1shvshvlb90p9re.R.inc(37667);ntrits = 0;
                // Computing MAX
                // Computing MIN
                __CLR4_4_1shvshvlb90p9re.R.inc(37668);final double d1 = Math.min(ONE_OVER_TEN * dist, delta);
                __CLR4_4_1shvshvlb90p9re.R.inc(37669);adelt = Math.max(d1, rho);
                __CLR4_4_1shvshvlb90p9re.R.inc(37670);dsq = adelt * adelt;
                __CLR4_4_1shvshvlb90p9re.R.inc(37671);state = 90; __CLR4_4_1shvshvlb90p9re.R.inc(37672);break;
            }
            }__CLR4_4_1shvshvlb90p9re.R.inc(37673);if ((((ntrits == -1)&&(__CLR4_4_1shvshvlb90p9re.R.iget(37674)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(37675)==0&false))) {{
                __CLR4_4_1shvshvlb90p9re.R.inc(37676);state = 680; __CLR4_4_1shvshvlb90p9re.R.inc(37677);break;
            }
            }__CLR4_4_1shvshvlb90p9re.R.inc(37678);if ((((ratio > ZERO)&&(__CLR4_4_1shvshvlb90p9re.R.iget(37679)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(37680)==0&false))) {{
                __CLR4_4_1shvshvlb90p9re.R.inc(37681);state = 60; __CLR4_4_1shvshvlb90p9re.R.inc(37682);break;
            }
            }__CLR4_4_1shvshvlb90p9re.R.inc(37683);if ((((Math.max(delta, dnorm) > rho)&&(__CLR4_4_1shvshvlb90p9re.R.iget(37684)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(37685)==0&false))) {{
                __CLR4_4_1shvshvlb90p9re.R.inc(37686);state = 60; __CLR4_4_1shvshvlb90p9re.R.inc(37687);break;
            }

            // The calculations with the current value of RHO are complete. Pick the
            //   next values of RHO and DELTA.
        }}
        case 680:if (!__CLB4_4_1_bool0) {__CLR4_4_1shvshvlb90p9re.R.inc(37688);__CLB4_4_1_bool0=true;} {
            __CLR4_4_1shvshvlb90p9re.R.inc(37689);printState(680); // XXX
            __CLR4_4_1shvshvlb90p9re.R.inc(37690);if ((((rho > stoppingTrustRegionRadius)&&(__CLR4_4_1shvshvlb90p9re.R.iget(37691)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(37692)==0&false))) {{
                __CLR4_4_1shvshvlb90p9re.R.inc(37693);delta = HALF * rho;
                __CLR4_4_1shvshvlb90p9re.R.inc(37694);ratio = rho / stoppingTrustRegionRadius;
                __CLR4_4_1shvshvlb90p9re.R.inc(37695);if ((((ratio <= SIXTEEN)&&(__CLR4_4_1shvshvlb90p9re.R.iget(37696)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(37697)==0&false))) {{
                    __CLR4_4_1shvshvlb90p9re.R.inc(37698);rho = stoppingTrustRegionRadius;
                } }else {__CLR4_4_1shvshvlb90p9re.R.inc(37699);if ((((ratio <= TWO_HUNDRED_FIFTY)&&(__CLR4_4_1shvshvlb90p9re.R.iget(37700)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(37701)==0&false))) {{
                    __CLR4_4_1shvshvlb90p9re.R.inc(37702);rho = Math.sqrt(ratio) * stoppingTrustRegionRadius;
                } }else {{
                    __CLR4_4_1shvshvlb90p9re.R.inc(37703);rho *= ONE_OVER_TEN;
                }
                }}__CLR4_4_1shvshvlb90p9re.R.inc(37704);delta = Math.max(delta, rho);
                __CLR4_4_1shvshvlb90p9re.R.inc(37705);ntrits = 0;
                __CLR4_4_1shvshvlb90p9re.R.inc(37706);nfsav = getEvaluations();
                __CLR4_4_1shvshvlb90p9re.R.inc(37707);state = 60; __CLR4_4_1shvshvlb90p9re.R.inc(37708);break;
            }

            // Return from the calculation, after another Newton-Raphson step, if
            //   it is too short to have been tried before.

            }__CLR4_4_1shvshvlb90p9re.R.inc(37709);if ((((ntrits == -1)&&(__CLR4_4_1shvshvlb90p9re.R.iget(37710)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(37711)==0&false))) {{
                __CLR4_4_1shvshvlb90p9re.R.inc(37712);state = 360; __CLR4_4_1shvshvlb90p9re.R.inc(37713);break;
            }
        }}
        case 720:if (!__CLB4_4_1_bool0) {__CLR4_4_1shvshvlb90p9re.R.inc(37714);__CLB4_4_1_bool0=true;} {
            __CLR4_4_1shvshvlb90p9re.R.inc(37715);printState(720); // XXX
            __CLR4_4_1shvshvlb90p9re.R.inc(37716);if ((((fAtInterpolationPoints.getEntry(trustRegionCenterInterpolationPointIndex) <= fsave)&&(__CLR4_4_1shvshvlb90p9re.R.iget(37717)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(37718)==0&false))) {{
                __CLR4_4_1shvshvlb90p9re.R.inc(37719);for (int i = 0; (((i < n)&&(__CLR4_4_1shvshvlb90p9re.R.iget(37720)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(37721)==0&false)); i++) {{
                    // Computing MIN
                    // Computing MAX
                    __CLR4_4_1shvshvlb90p9re.R.inc(37722);final double d3 = lowerBound[i];
                    __CLR4_4_1shvshvlb90p9re.R.inc(37723);final double d4 = originShift.getEntry(i) + trustRegionCenterOffset.getEntry(i);
                    __CLR4_4_1shvshvlb90p9re.R.inc(37724);final double d1 = Math.max(d3, d4);
                    __CLR4_4_1shvshvlb90p9re.R.inc(37725);final double d2 = upperBound[i];
                    __CLR4_4_1shvshvlb90p9re.R.inc(37726);currentBest.setEntry(i, Math.min(d1, d2));
                    __CLR4_4_1shvshvlb90p9re.R.inc(37727);if ((((trustRegionCenterOffset.getEntry(i) == lowerDifference.getEntry(i))&&(__CLR4_4_1shvshvlb90p9re.R.iget(37728)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(37729)==0&false))) {{
                        __CLR4_4_1shvshvlb90p9re.R.inc(37730);currentBest.setEntry(i, lowerBound[i]);
                    }
                    }__CLR4_4_1shvshvlb90p9re.R.inc(37731);if ((((trustRegionCenterOffset.getEntry(i) == upperDifference.getEntry(i))&&(__CLR4_4_1shvshvlb90p9re.R.iget(37732)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(37733)==0&false))) {{
                        __CLR4_4_1shvshvlb90p9re.R.inc(37734);currentBest.setEntry(i, upperBound[i]);
                    }
                }}
                }__CLR4_4_1shvshvlb90p9re.R.inc(37735);f = fAtInterpolationPoints.getEntry(trustRegionCenterInterpolationPointIndex);
            }
            }__CLR4_4_1shvshvlb90p9re.R.inc(37736);return f;
        }
        default:if (!__CLB4_4_1_bool0) {__CLR4_4_1shvshvlb90p9re.R.inc(37737);__CLB4_4_1_bool0=true;} {
            __CLR4_4_1shvshvlb90p9re.R.inc(37738);throw new MathIllegalStateException(LocalizedFormats.SIMPLE_MESSAGE, "bobyqb");
        }}
    }}finally{__CLR4_4_1shvshvlb90p9re.R.flushNeeded();}} // bobyqb

    // ----------------------------------------------------------------------------------------

    /**
     *     The arguments N, NPT, XPT, XOPT, BMAT, ZMAT, NDIM, SL and SU all have
     *       the same meanings as the corresponding arguments of BOBYQB.
     *     KOPT is the index of the optimal interpolation point.
     *     KNEW is the index of the interpolation point that is going to be moved.
     *     ADELT is the current trust region bound.
     *     XNEW will be set to a suitable new position for the interpolation point
     *       XPT(KNEW,.). Specifically, it satisfies the SL, SU and trust region
     *       bounds and it should provide a large denominator in the next call of
     *       UPDATE. The step XNEW-XOPT from XOPT is restricted to moves along the
     *       straight lines through XOPT and another interpolation point.
     *     XALT also provides a large value of the modulus of the KNEW-th Lagrange
     *       function subject to the constraints that have been mentioned, its main
     *       difference from XNEW being that XALT-XOPT is a constrained version of
     *       the Cauchy step within the trust region. An exception is that XALT is
     *       not calculated if all components of GLAG (see below) are zero.
     *     ALPHA will be set to the KNEW-th diagonal element of the H matrix.
     *     CAUCHY will be set to the square of the KNEW-th Lagrange function at
     *       the step XALT-XOPT from XOPT for the vector XALT that is returned,
     *       except that CAUCHY is set to zero if XALT is not calculated.
     *     GLAG is a working space vector of length N for the gradient of the
     *       KNEW-th Lagrange function at XOPT.
     *     HCOL is a working space vector of length NPT for the second derivative
     *       coefficients of the KNEW-th Lagrange function.
     *     W is a working space vector of length 2N that is going to hold the
     *       constrained Cauchy step from XOPT of the Lagrange function, followed
     *       by the downhill version of XALT when the uphill step is calculated.
     *
     *     Set the first NPT components of W to the leading elements of the
     *     KNEW-th column of the H matrix.
     * @param knew
     * @param adelt
     */
    private double[] altmov(
            int knew,
            double adelt
    ) {try{__CLR4_4_1shvshvlb90p9re.R.inc(37739);
        __CLR4_4_1shvshvlb90p9re.R.inc(37740);printMethod(); // XXX

        __CLR4_4_1shvshvlb90p9re.R.inc(37741);final int n = currentBest.getDimension();
        __CLR4_4_1shvshvlb90p9re.R.inc(37742);final int npt = numberOfInterpolationPoints;

        __CLR4_4_1shvshvlb90p9re.R.inc(37743);final ArrayRealVector glag = new ArrayRealVector(n);
        __CLR4_4_1shvshvlb90p9re.R.inc(37744);final ArrayRealVector hcol = new ArrayRealVector(npt);

        __CLR4_4_1shvshvlb90p9re.R.inc(37745);final ArrayRealVector work1 = new ArrayRealVector(n);
        __CLR4_4_1shvshvlb90p9re.R.inc(37746);final ArrayRealVector work2 = new ArrayRealVector(n);

        __CLR4_4_1shvshvlb90p9re.R.inc(37747);for (int k = 0; (((k < npt)&&(__CLR4_4_1shvshvlb90p9re.R.iget(37748)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(37749)==0&false)); k++) {{
            __CLR4_4_1shvshvlb90p9re.R.inc(37750);hcol.setEntry(k, ZERO);
        }
        }__CLR4_4_1shvshvlb90p9re.R.inc(37751);for (int j = 0, max = npt - n - 1; (((j < max)&&(__CLR4_4_1shvshvlb90p9re.R.iget(37752)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(37753)==0&false)); j++) {{
            __CLR4_4_1shvshvlb90p9re.R.inc(37754);final double tmp = zMatrix.getEntry(knew, j);
            __CLR4_4_1shvshvlb90p9re.R.inc(37755);for (int k = 0; (((k < npt)&&(__CLR4_4_1shvshvlb90p9re.R.iget(37756)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(37757)==0&false)); k++) {{
                __CLR4_4_1shvshvlb90p9re.R.inc(37758);hcol.setEntry(k, hcol.getEntry(k) + tmp * zMatrix.getEntry(k, j));
            }
        }}
        }__CLR4_4_1shvshvlb90p9re.R.inc(37759);final double alpha = hcol.getEntry(knew);
        __CLR4_4_1shvshvlb90p9re.R.inc(37760);final double ha = HALF * alpha;

        // Calculate the gradient of the KNEW-th Lagrange function at XOPT.

        __CLR4_4_1shvshvlb90p9re.R.inc(37761);for (int i = 0; (((i < n)&&(__CLR4_4_1shvshvlb90p9re.R.iget(37762)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(37763)==0&false)); i++) {{
            __CLR4_4_1shvshvlb90p9re.R.inc(37764);glag.setEntry(i, bMatrix.getEntry(knew, i));
        }
        }__CLR4_4_1shvshvlb90p9re.R.inc(37765);for (int k = 0; (((k < npt)&&(__CLR4_4_1shvshvlb90p9re.R.iget(37766)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(37767)==0&false)); k++) {{
            __CLR4_4_1shvshvlb90p9re.R.inc(37768);double tmp = ZERO;
            __CLR4_4_1shvshvlb90p9re.R.inc(37769);for (int j = 0; (((j < n)&&(__CLR4_4_1shvshvlb90p9re.R.iget(37770)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(37771)==0&false)); j++) {{
                __CLR4_4_1shvshvlb90p9re.R.inc(37772);tmp += interpolationPoints.getEntry(k, j) * trustRegionCenterOffset.getEntry(j);
            }
            }__CLR4_4_1shvshvlb90p9re.R.inc(37773);tmp *= hcol.getEntry(k);
            __CLR4_4_1shvshvlb90p9re.R.inc(37774);for (int i = 0; (((i < n)&&(__CLR4_4_1shvshvlb90p9re.R.iget(37775)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(37776)==0&false)); i++) {{
                __CLR4_4_1shvshvlb90p9re.R.inc(37777);glag.setEntry(i, glag.getEntry(i) + tmp * interpolationPoints.getEntry(k, i));
            }
        }}

        // Search for a large denominator along the straight lines through XOPT
        // and another interpolation point. SLBD and SUBD will be lower and upper
        // bounds on the step along each of these lines in turn. PREDSQ will be
        // set to the square of the predicted denominator for each line. PRESAV
        // will be set to the largest admissible value of PREDSQ that occurs.

        }__CLR4_4_1shvshvlb90p9re.R.inc(37778);double presav = ZERO;
        __CLR4_4_1shvshvlb90p9re.R.inc(37779);double step = Double.NaN;
        __CLR4_4_1shvshvlb90p9re.R.inc(37780);int ksav = 0;
        __CLR4_4_1shvshvlb90p9re.R.inc(37781);int ibdsav = 0;
        __CLR4_4_1shvshvlb90p9re.R.inc(37782);double stpsav = 0;
        __CLR4_4_1shvshvlb90p9re.R.inc(37783);for (int k = 0; (((k < npt)&&(__CLR4_4_1shvshvlb90p9re.R.iget(37784)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(37785)==0&false)); k++) {{
            __CLR4_4_1shvshvlb90p9re.R.inc(37786);if ((((k == trustRegionCenterInterpolationPointIndex)&&(__CLR4_4_1shvshvlb90p9re.R.iget(37787)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(37788)==0&false))) {{
                __CLR4_4_1shvshvlb90p9re.R.inc(37789);continue;
            }
            }__CLR4_4_1shvshvlb90p9re.R.inc(37790);double dderiv = ZERO;
            __CLR4_4_1shvshvlb90p9re.R.inc(37791);double distsq = ZERO;
            __CLR4_4_1shvshvlb90p9re.R.inc(37792);for (int i = 0; (((i < n)&&(__CLR4_4_1shvshvlb90p9re.R.iget(37793)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(37794)==0&false)); i++) {{
                __CLR4_4_1shvshvlb90p9re.R.inc(37795);final double tmp = interpolationPoints.getEntry(k, i) - trustRegionCenterOffset.getEntry(i);
                __CLR4_4_1shvshvlb90p9re.R.inc(37796);dderiv += glag.getEntry(i) * tmp;
                __CLR4_4_1shvshvlb90p9re.R.inc(37797);distsq += tmp * tmp;
            }
            }__CLR4_4_1shvshvlb90p9re.R.inc(37798);double subd = adelt / Math.sqrt(distsq);
            __CLR4_4_1shvshvlb90p9re.R.inc(37799);double slbd = -subd;
            __CLR4_4_1shvshvlb90p9re.R.inc(37800);int ilbd = 0;
            __CLR4_4_1shvshvlb90p9re.R.inc(37801);int iubd = 0;
            __CLR4_4_1shvshvlb90p9re.R.inc(37802);final double sumin = Math.min(ONE, subd);

            // Revise SLBD and SUBD if necessary because of the bounds in SL and SU.

            __CLR4_4_1shvshvlb90p9re.R.inc(37803);for (int i = 0; (((i < n)&&(__CLR4_4_1shvshvlb90p9re.R.iget(37804)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(37805)==0&false)); i++) {{
                __CLR4_4_1shvshvlb90p9re.R.inc(37806);final double tmp = interpolationPoints.getEntry(k, i) - trustRegionCenterOffset.getEntry(i);
                __CLR4_4_1shvshvlb90p9re.R.inc(37807);if ((((tmp > ZERO)&&(__CLR4_4_1shvshvlb90p9re.R.iget(37808)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(37809)==0&false))) {{
                    __CLR4_4_1shvshvlb90p9re.R.inc(37810);if ((((slbd * tmp < lowerDifference.getEntry(i) - trustRegionCenterOffset.getEntry(i))&&(__CLR4_4_1shvshvlb90p9re.R.iget(37811)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(37812)==0&false))) {{
                        __CLR4_4_1shvshvlb90p9re.R.inc(37813);slbd = (lowerDifference.getEntry(i) - trustRegionCenterOffset.getEntry(i)) / tmp;
                        __CLR4_4_1shvshvlb90p9re.R.inc(37814);ilbd = -i - 1;
                    }
                    }__CLR4_4_1shvshvlb90p9re.R.inc(37815);if ((((subd * tmp > upperDifference.getEntry(i) - trustRegionCenterOffset.getEntry(i))&&(__CLR4_4_1shvshvlb90p9re.R.iget(37816)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(37817)==0&false))) {{
                        // Computing MAX
                        __CLR4_4_1shvshvlb90p9re.R.inc(37818);subd = Math.max(sumin,
                                        (upperDifference.getEntry(i) - trustRegionCenterOffset.getEntry(i)) / tmp);
                        __CLR4_4_1shvshvlb90p9re.R.inc(37819);iubd = i + 1;
                    }
                }} }else {__CLR4_4_1shvshvlb90p9re.R.inc(37820);if ((((tmp < ZERO)&&(__CLR4_4_1shvshvlb90p9re.R.iget(37821)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(37822)==0&false))) {{
                    __CLR4_4_1shvshvlb90p9re.R.inc(37823);if ((((slbd * tmp > upperDifference.getEntry(i) - trustRegionCenterOffset.getEntry(i))&&(__CLR4_4_1shvshvlb90p9re.R.iget(37824)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(37825)==0&false))) {{
                        __CLR4_4_1shvshvlb90p9re.R.inc(37826);slbd = (upperDifference.getEntry(i) - trustRegionCenterOffset.getEntry(i)) / tmp;
                        __CLR4_4_1shvshvlb90p9re.R.inc(37827);ilbd = i + 1;
                    }
                    }__CLR4_4_1shvshvlb90p9re.R.inc(37828);if ((((subd * tmp < lowerDifference.getEntry(i) - trustRegionCenterOffset.getEntry(i))&&(__CLR4_4_1shvshvlb90p9re.R.iget(37829)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(37830)==0&false))) {{
                        // Computing MAX
                        __CLR4_4_1shvshvlb90p9re.R.inc(37831);subd = Math.max(sumin,
                                        (lowerDifference.getEntry(i) - trustRegionCenterOffset.getEntry(i)) / tmp);
                        __CLR4_4_1shvshvlb90p9re.R.inc(37832);iubd = -i - 1;
                    }
                }}
            }}}

            // Seek a large modulus of the KNEW-th Lagrange function when the index
            // of the other interpolation point on the line through XOPT is KNEW.

            }__CLR4_4_1shvshvlb90p9re.R.inc(37833);step = slbd;
            __CLR4_4_1shvshvlb90p9re.R.inc(37834);int isbd = ilbd;
            __CLR4_4_1shvshvlb90p9re.R.inc(37835);double vlag = Double.NaN;
            __CLR4_4_1shvshvlb90p9re.R.inc(37836);if ((((k == knew)&&(__CLR4_4_1shvshvlb90p9re.R.iget(37837)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(37838)==0&false))) {{
                __CLR4_4_1shvshvlb90p9re.R.inc(37839);final double diff = dderiv - ONE;
                __CLR4_4_1shvshvlb90p9re.R.inc(37840);vlag = slbd * (dderiv - slbd * diff);
                __CLR4_4_1shvshvlb90p9re.R.inc(37841);final double d1 = subd * (dderiv - subd * diff);
                __CLR4_4_1shvshvlb90p9re.R.inc(37842);if ((((Math.abs(d1) > Math.abs(vlag))&&(__CLR4_4_1shvshvlb90p9re.R.iget(37843)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(37844)==0&false))) {{
                    __CLR4_4_1shvshvlb90p9re.R.inc(37845);step = subd;
                    __CLR4_4_1shvshvlb90p9re.R.inc(37846);vlag = d1;
                    __CLR4_4_1shvshvlb90p9re.R.inc(37847);isbd = iubd;
                }
                }__CLR4_4_1shvshvlb90p9re.R.inc(37848);final double d2 = HALF * dderiv;
                __CLR4_4_1shvshvlb90p9re.R.inc(37849);final double d3 = d2 - diff * slbd;
                __CLR4_4_1shvshvlb90p9re.R.inc(37850);final double d4 = d2 - diff * subd;
                __CLR4_4_1shvshvlb90p9re.R.inc(37851);if ((((d3 * d4 < ZERO)&&(__CLR4_4_1shvshvlb90p9re.R.iget(37852)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(37853)==0&false))) {{
                    __CLR4_4_1shvshvlb90p9re.R.inc(37854);final double d5 = d2 * d2 / diff;
                    __CLR4_4_1shvshvlb90p9re.R.inc(37855);if ((((Math.abs(d5) > Math.abs(vlag))&&(__CLR4_4_1shvshvlb90p9re.R.iget(37856)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(37857)==0&false))) {{
                        __CLR4_4_1shvshvlb90p9re.R.inc(37858);step = d2 / diff;
                        __CLR4_4_1shvshvlb90p9re.R.inc(37859);vlag = d5;
                        __CLR4_4_1shvshvlb90p9re.R.inc(37860);isbd = 0;
                    }
                }}

                // Search along each of the other lines through XOPT and another point.

            }} }else {{
                __CLR4_4_1shvshvlb90p9re.R.inc(37861);vlag = slbd * (ONE - slbd);
                __CLR4_4_1shvshvlb90p9re.R.inc(37862);final double tmp = subd * (ONE - subd);
                __CLR4_4_1shvshvlb90p9re.R.inc(37863);if ((((Math.abs(tmp) > Math.abs(vlag))&&(__CLR4_4_1shvshvlb90p9re.R.iget(37864)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(37865)==0&false))) {{
                    __CLR4_4_1shvshvlb90p9re.R.inc(37866);step = subd;
                    __CLR4_4_1shvshvlb90p9re.R.inc(37867);vlag = tmp;
                    __CLR4_4_1shvshvlb90p9re.R.inc(37868);isbd = iubd;
                }
                }__CLR4_4_1shvshvlb90p9re.R.inc(37869);if ((((subd > HALF && Math.abs(vlag) < ONE_OVER_FOUR)&&(__CLR4_4_1shvshvlb90p9re.R.iget(37870)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(37871)==0&false))) {{
                    __CLR4_4_1shvshvlb90p9re.R.inc(37872);step = HALF;
                    __CLR4_4_1shvshvlb90p9re.R.inc(37873);vlag = ONE_OVER_FOUR;
                    __CLR4_4_1shvshvlb90p9re.R.inc(37874);isbd = 0;
                }
                }__CLR4_4_1shvshvlb90p9re.R.inc(37875);vlag *= dderiv;
            }

            // Calculate PREDSQ for the current line search and maintain PRESAV.

            }__CLR4_4_1shvshvlb90p9re.R.inc(37876);final double tmp = step * (ONE - step) * distsq;
            __CLR4_4_1shvshvlb90p9re.R.inc(37877);final double predsq = vlag * vlag * (vlag * vlag + ha * tmp * tmp);
            __CLR4_4_1shvshvlb90p9re.R.inc(37878);if ((((predsq > presav)&&(__CLR4_4_1shvshvlb90p9re.R.iget(37879)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(37880)==0&false))) {{
                __CLR4_4_1shvshvlb90p9re.R.inc(37881);presav = predsq;
                __CLR4_4_1shvshvlb90p9re.R.inc(37882);ksav = k;
                __CLR4_4_1shvshvlb90p9re.R.inc(37883);stpsav = step;
                __CLR4_4_1shvshvlb90p9re.R.inc(37884);ibdsav = isbd;
            }
        }}

        // Construct XNEW in a way that satisfies the bound constraints exactly.

        }__CLR4_4_1shvshvlb90p9re.R.inc(37885);for (int i = 0; (((i < n)&&(__CLR4_4_1shvshvlb90p9re.R.iget(37886)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(37887)==0&false)); i++) {{
            __CLR4_4_1shvshvlb90p9re.R.inc(37888);final double tmp = trustRegionCenterOffset.getEntry(i) + stpsav * (interpolationPoints.getEntry(ksav, i) - trustRegionCenterOffset.getEntry(i));
            __CLR4_4_1shvshvlb90p9re.R.inc(37889);newPoint.setEntry(i, Math.max(lowerDifference.getEntry(i),
                                      Math.min(upperDifference.getEntry(i), tmp)));
        }
        }__CLR4_4_1shvshvlb90p9re.R.inc(37890);if ((((ibdsav < 0)&&(__CLR4_4_1shvshvlb90p9re.R.iget(37891)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(37892)==0&false))) {{
            __CLR4_4_1shvshvlb90p9re.R.inc(37893);newPoint.setEntry(-ibdsav - 1, lowerDifference.getEntry(-ibdsav - 1));
        }
        }__CLR4_4_1shvshvlb90p9re.R.inc(37894);if ((((ibdsav > 0)&&(__CLR4_4_1shvshvlb90p9re.R.iget(37895)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(37896)==0&false))) {{
            __CLR4_4_1shvshvlb90p9re.R.inc(37897);newPoint.setEntry(ibdsav - 1, upperDifference.getEntry(ibdsav - 1));
        }

        // Prepare for the iterative method that assembles the constrained Cauchy
        // step in W. The sum of squares of the fixed components of W is formed in
        // WFIXSQ, and the free components of W are set to BIGSTP.

        }__CLR4_4_1shvshvlb90p9re.R.inc(37898);final double bigstp = adelt + adelt;
        __CLR4_4_1shvshvlb90p9re.R.inc(37899);int iflag = 0;
        __CLR4_4_1shvshvlb90p9re.R.inc(37900);double cauchy = Double.NaN;
        __CLR4_4_1shvshvlb90p9re.R.inc(37901);double csave = ZERO;
        __CLR4_4_1shvshvlb90p9re.R.inc(37902);while (true) {{
            __CLR4_4_1shvshvlb90p9re.R.inc(37903);double wfixsq = ZERO;
            __CLR4_4_1shvshvlb90p9re.R.inc(37904);double ggfree = ZERO;
            __CLR4_4_1shvshvlb90p9re.R.inc(37905);for (int i = 0; (((i < n)&&(__CLR4_4_1shvshvlb90p9re.R.iget(37906)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(37907)==0&false)); i++) {{
                __CLR4_4_1shvshvlb90p9re.R.inc(37908);final double glagValue = glag.getEntry(i);
                __CLR4_4_1shvshvlb90p9re.R.inc(37909);work1.setEntry(i, ZERO);
                __CLR4_4_1shvshvlb90p9re.R.inc(37910);if ((((Math.min(trustRegionCenterOffset.getEntry(i) - lowerDifference.getEntry(i), glagValue) > ZERO ||
                    Math.max(trustRegionCenterOffset.getEntry(i) - upperDifference.getEntry(i), glagValue) < ZERO)&&(__CLR4_4_1shvshvlb90p9re.R.iget(37911)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(37912)==0&false))) {{
                    __CLR4_4_1shvshvlb90p9re.R.inc(37913);work1.setEntry(i, bigstp);
                    // Computing 2nd power
                    __CLR4_4_1shvshvlb90p9re.R.inc(37914);ggfree += glagValue * glagValue;
                }
            }}
            }__CLR4_4_1shvshvlb90p9re.R.inc(37915);if ((((ggfree == ZERO)&&(__CLR4_4_1shvshvlb90p9re.R.iget(37916)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(37917)==0&false))) {{
                __CLR4_4_1shvshvlb90p9re.R.inc(37918);return new double[] { alpha, ZERO };
            }

            // Investigate whether more components of W can be fixed.
            }__CLR4_4_1shvshvlb90p9re.R.inc(37919);final double tmp1 = adelt * adelt - wfixsq;
            __CLR4_4_1shvshvlb90p9re.R.inc(37920);if ((((tmp1 > ZERO)&&(__CLR4_4_1shvshvlb90p9re.R.iget(37921)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(37922)==0&false))) {{
                __CLR4_4_1shvshvlb90p9re.R.inc(37923);step = Math.sqrt(tmp1 / ggfree);
                __CLR4_4_1shvshvlb90p9re.R.inc(37924);ggfree = ZERO;
                __CLR4_4_1shvshvlb90p9re.R.inc(37925);for (int i = 0; (((i < n)&&(__CLR4_4_1shvshvlb90p9re.R.iget(37926)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(37927)==0&false)); i++) {{
                    __CLR4_4_1shvshvlb90p9re.R.inc(37928);if ((((work1.getEntry(i) == bigstp)&&(__CLR4_4_1shvshvlb90p9re.R.iget(37929)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(37930)==0&false))) {{
                        __CLR4_4_1shvshvlb90p9re.R.inc(37931);final double tmp2 = trustRegionCenterOffset.getEntry(i) - step * glag.getEntry(i);
                        __CLR4_4_1shvshvlb90p9re.R.inc(37932);if ((((tmp2 <= lowerDifference.getEntry(i))&&(__CLR4_4_1shvshvlb90p9re.R.iget(37933)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(37934)==0&false))) {{
                            __CLR4_4_1shvshvlb90p9re.R.inc(37935);work1.setEntry(i, lowerDifference.getEntry(i) - trustRegionCenterOffset.getEntry(i));
                            // Computing 2nd power
                            __CLR4_4_1shvshvlb90p9re.R.inc(37936);final double d1 = work1.getEntry(i);
                            __CLR4_4_1shvshvlb90p9re.R.inc(37937);wfixsq += d1 * d1;
                        } }else {__CLR4_4_1shvshvlb90p9re.R.inc(37938);if ((((tmp2 >= upperDifference.getEntry(i))&&(__CLR4_4_1shvshvlb90p9re.R.iget(37939)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(37940)==0&false))) {{
                            __CLR4_4_1shvshvlb90p9re.R.inc(37941);work1.setEntry(i, upperDifference.getEntry(i) - trustRegionCenterOffset.getEntry(i));
                            // Computing 2nd power
                            __CLR4_4_1shvshvlb90p9re.R.inc(37942);final double d1 = work1.getEntry(i);
                            __CLR4_4_1shvshvlb90p9re.R.inc(37943);wfixsq += d1 * d1;
                        } }else {{
                            // Computing 2nd power
                            __CLR4_4_1shvshvlb90p9re.R.inc(37944);final double d1 = glag.getEntry(i);
                            __CLR4_4_1shvshvlb90p9re.R.inc(37945);ggfree += d1 * d1;
                        }
                    }}}
                }}
            }}

            // Set the remaining free components of W and all components of XALT,
            // except that W may be scaled later.

            }__CLR4_4_1shvshvlb90p9re.R.inc(37946);double gw = ZERO;
            __CLR4_4_1shvshvlb90p9re.R.inc(37947);for (int i = 0; (((i < n)&&(__CLR4_4_1shvshvlb90p9re.R.iget(37948)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(37949)==0&false)); i++) {{
                __CLR4_4_1shvshvlb90p9re.R.inc(37950);final double glagValue = glag.getEntry(i);
                __CLR4_4_1shvshvlb90p9re.R.inc(37951);if ((((work1.getEntry(i) == bigstp)&&(__CLR4_4_1shvshvlb90p9re.R.iget(37952)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(37953)==0&false))) {{
                    __CLR4_4_1shvshvlb90p9re.R.inc(37954);work1.setEntry(i, -step * glagValue);
                    __CLR4_4_1shvshvlb90p9re.R.inc(37955);final double min = Math.min(upperDifference.getEntry(i),
                                                trustRegionCenterOffset.getEntry(i) + work1.getEntry(i));
                    __CLR4_4_1shvshvlb90p9re.R.inc(37956);alternativeNewPoint.setEntry(i, Math.max(lowerDifference.getEntry(i), min));
                } }else {__CLR4_4_1shvshvlb90p9re.R.inc(37957);if ((((work1.getEntry(i) == ZERO)&&(__CLR4_4_1shvshvlb90p9re.R.iget(37958)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(37959)==0&false))) {{
                    __CLR4_4_1shvshvlb90p9re.R.inc(37960);alternativeNewPoint.setEntry(i, trustRegionCenterOffset.getEntry(i));
                } }else {__CLR4_4_1shvshvlb90p9re.R.inc(37961);if ((((glagValue > ZERO)&&(__CLR4_4_1shvshvlb90p9re.R.iget(37962)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(37963)==0&false))) {{
                    __CLR4_4_1shvshvlb90p9re.R.inc(37964);alternativeNewPoint.setEntry(i, lowerDifference.getEntry(i));
                } }else {{
                    __CLR4_4_1shvshvlb90p9re.R.inc(37965);alternativeNewPoint.setEntry(i, upperDifference.getEntry(i));
                }
                }}}__CLR4_4_1shvshvlb90p9re.R.inc(37966);gw += glagValue * work1.getEntry(i);
            }

            // Set CURV to the curvature of the KNEW-th Lagrange function along W.
            // Scale W by a factor less than one if that can reduce the modulus of
            // the Lagrange function at XOPT+W. Set CAUCHY to the final value of
            // the square of this function.

            }__CLR4_4_1shvshvlb90p9re.R.inc(37967);double curv = ZERO;
            __CLR4_4_1shvshvlb90p9re.R.inc(37968);for (int k = 0; (((k < npt)&&(__CLR4_4_1shvshvlb90p9re.R.iget(37969)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(37970)==0&false)); k++) {{
                __CLR4_4_1shvshvlb90p9re.R.inc(37971);double tmp = ZERO;
                __CLR4_4_1shvshvlb90p9re.R.inc(37972);for (int j = 0; (((j < n)&&(__CLR4_4_1shvshvlb90p9re.R.iget(37973)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(37974)==0&false)); j++) {{
                    __CLR4_4_1shvshvlb90p9re.R.inc(37975);tmp += interpolationPoints.getEntry(k, j) * work1.getEntry(j);
                }
                }__CLR4_4_1shvshvlb90p9re.R.inc(37976);curv += hcol.getEntry(k) * tmp * tmp;
            }
            }__CLR4_4_1shvshvlb90p9re.R.inc(37977);if ((((iflag == 1)&&(__CLR4_4_1shvshvlb90p9re.R.iget(37978)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(37979)==0&false))) {{
                __CLR4_4_1shvshvlb90p9re.R.inc(37980);curv = -curv;
            }
            }__CLR4_4_1shvshvlb90p9re.R.inc(37981);if ((((curv > -gw &&
                curv < -gw * (ONE + Math.sqrt(TWO)))&&(__CLR4_4_1shvshvlb90p9re.R.iget(37982)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(37983)==0&false))) {{
                __CLR4_4_1shvshvlb90p9re.R.inc(37984);final double scale = -gw / curv;
                __CLR4_4_1shvshvlb90p9re.R.inc(37985);for (int i = 0; (((i < n)&&(__CLR4_4_1shvshvlb90p9re.R.iget(37986)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(37987)==0&false)); i++) {{
                    __CLR4_4_1shvshvlb90p9re.R.inc(37988);final double tmp = trustRegionCenterOffset.getEntry(i) + scale * work1.getEntry(i);
                    __CLR4_4_1shvshvlb90p9re.R.inc(37989);alternativeNewPoint.setEntry(i, Math.max(lowerDifference.getEntry(i),
                                              Math.min(upperDifference.getEntry(i), tmp)));
                }
                // Computing 2nd power
                }__CLR4_4_1shvshvlb90p9re.R.inc(37990);final double d1 = HALF * gw * scale;
                __CLR4_4_1shvshvlb90p9re.R.inc(37991);cauchy = d1 * d1;
            } }else {{
                // Computing 2nd power
                __CLR4_4_1shvshvlb90p9re.R.inc(37992);final double d1 = gw + HALF * curv;
                __CLR4_4_1shvshvlb90p9re.R.inc(37993);cauchy = d1 * d1;
            }

            // If IFLAG is zero, then XALT is calculated as before after reversing
            // the sign of GLAG. Thus two XALT vectors become available. The one that
            // is chosen is the one that gives the larger value of CAUCHY.

            }__CLR4_4_1shvshvlb90p9re.R.inc(37994);if ((((iflag == 0)&&(__CLR4_4_1shvshvlb90p9re.R.iget(37995)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(37996)==0&false))) {{
                __CLR4_4_1shvshvlb90p9re.R.inc(37997);for (int i = 0; (((i < n)&&(__CLR4_4_1shvshvlb90p9re.R.iget(37998)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(37999)==0&false)); i++) {{
                    __CLR4_4_1shvshvlb90p9re.R.inc(38000);glag.setEntry(i, -glag.getEntry(i));
                    __CLR4_4_1shvshvlb90p9re.R.inc(38001);work2.setEntry(i, alternativeNewPoint.getEntry(i));
                }
                }__CLR4_4_1shvshvlb90p9re.R.inc(38002);csave = cauchy;
                __CLR4_4_1shvshvlb90p9re.R.inc(38003);iflag = 1;
            } }else {{
                __CLR4_4_1shvshvlb90p9re.R.inc(38004);break;
            }
        }}
        }__CLR4_4_1shvshvlb90p9re.R.inc(38005);if ((((csave > cauchy)&&(__CLR4_4_1shvshvlb90p9re.R.iget(38006)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(38007)==0&false))) {{
            __CLR4_4_1shvshvlb90p9re.R.inc(38008);for (int i = 0; (((i < n)&&(__CLR4_4_1shvshvlb90p9re.R.iget(38009)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(38010)==0&false)); i++) {{
                __CLR4_4_1shvshvlb90p9re.R.inc(38011);alternativeNewPoint.setEntry(i, work2.getEntry(i));
            }
            }__CLR4_4_1shvshvlb90p9re.R.inc(38012);cauchy = csave;
        }

        }__CLR4_4_1shvshvlb90p9re.R.inc(38013);return new double[] { alpha, cauchy };
    }finally{__CLR4_4_1shvshvlb90p9re.R.flushNeeded();}} // altmov

    // ----------------------------------------------------------------------------------------

    /**
     *     SUBROUTINE PRELIM sets the elements of XBASE, XPT, FVAL, GOPT, HQ, PQ,
     *     BMAT and ZMAT for the first iteration, and it maintains the values of
     *     NF and KOPT. The vector X is also changed by PRELIM.
     *
     *     The arguments N, NPT, X, XL, XU, RHOBEG, IPRINT and MAXFUN are the
     *       same as the corresponding arguments in SUBROUTINE BOBYQA.
     *     The arguments XBASE, XPT, FVAL, HQ, PQ, BMAT, ZMAT, NDIM, SL and SU
     *       are the same as the corresponding arguments in BOBYQB, the elements
     *       of SL and SU being set in BOBYQA.
     *     GOPT is usually the gradient of the quadratic model at XOPT+XBASE, but
     *       it is set by PRELIM to the gradient of the quadratic model at XBASE.
     *       If XOPT is nonzero, BOBYQB will change it to its usual value later.
     *     NF is maintaned as the number of calls of CALFUN so far.
     *     KOPT will be such that the least calculated value of F so far is at
     *       the point XPT(KOPT,.)+XBASE in the space of the variables.
     *
     * @param lowerBound Lower bounds.
     * @param upperBound Upper bounds.
     */
    private void prelim(double[] lowerBound,
                        double[] upperBound) {try{__CLR4_4_1shvshvlb90p9re.R.inc(38014);
        __CLR4_4_1shvshvlb90p9re.R.inc(38015);printMethod(); // XXX

        __CLR4_4_1shvshvlb90p9re.R.inc(38016);final int n = currentBest.getDimension();
        __CLR4_4_1shvshvlb90p9re.R.inc(38017);final int npt = numberOfInterpolationPoints;
        __CLR4_4_1shvshvlb90p9re.R.inc(38018);final int ndim = bMatrix.getRowDimension();

        __CLR4_4_1shvshvlb90p9re.R.inc(38019);final double rhosq = initialTrustRegionRadius * initialTrustRegionRadius;
        __CLR4_4_1shvshvlb90p9re.R.inc(38020);final double recip = 1d / rhosq;
        __CLR4_4_1shvshvlb90p9re.R.inc(38021);final int np = n + 1;

        // Set XBASE to the initial vector of variables, and set the initial
        // elements of XPT, BMAT, HQ, PQ and ZMAT to zero.

        __CLR4_4_1shvshvlb90p9re.R.inc(38022);for (int j = 0; (((j < n)&&(__CLR4_4_1shvshvlb90p9re.R.iget(38023)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(38024)==0&false)); j++) {{
            __CLR4_4_1shvshvlb90p9re.R.inc(38025);originShift.setEntry(j, currentBest.getEntry(j));
            __CLR4_4_1shvshvlb90p9re.R.inc(38026);for (int k = 0; (((k < npt)&&(__CLR4_4_1shvshvlb90p9re.R.iget(38027)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(38028)==0&false)); k++) {{
                __CLR4_4_1shvshvlb90p9re.R.inc(38029);interpolationPoints.setEntry(k, j, ZERO);
            }
            }__CLR4_4_1shvshvlb90p9re.R.inc(38030);for (int i = 0; (((i < ndim)&&(__CLR4_4_1shvshvlb90p9re.R.iget(38031)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(38032)==0&false)); i++) {{
                __CLR4_4_1shvshvlb90p9re.R.inc(38033);bMatrix.setEntry(i, j, ZERO);
            }
        }}
        }__CLR4_4_1shvshvlb90p9re.R.inc(38034);for (int i = 0, max = n * np / 2; (((i < max)&&(__CLR4_4_1shvshvlb90p9re.R.iget(38035)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(38036)==0&false)); i++) {{
            __CLR4_4_1shvshvlb90p9re.R.inc(38037);modelSecondDerivativesValues.setEntry(i, ZERO);
        }
        }__CLR4_4_1shvshvlb90p9re.R.inc(38038);for (int k = 0; (((k < npt)&&(__CLR4_4_1shvshvlb90p9re.R.iget(38039)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(38040)==0&false)); k++) {{
            __CLR4_4_1shvshvlb90p9re.R.inc(38041);modelSecondDerivativesParameters.setEntry(k, ZERO);
            __CLR4_4_1shvshvlb90p9re.R.inc(38042);for (int j = 0, max = npt - np; (((j < max)&&(__CLR4_4_1shvshvlb90p9re.R.iget(38043)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(38044)==0&false)); j++) {{
                __CLR4_4_1shvshvlb90p9re.R.inc(38045);zMatrix.setEntry(k, j, ZERO);
            }
        }}

        // Begin the initialization procedure. NF becomes one more than the number
        // of function values so far. The coordinates of the displacement of the
        // next initial interpolation point from XBASE are set in XPT(NF+1,.).

        }__CLR4_4_1shvshvlb90p9re.R.inc(38046);int ipt = 0;
        __CLR4_4_1shvshvlb90p9re.R.inc(38047);int jpt = 0;
        __CLR4_4_1shvshvlb90p9re.R.inc(38048);double fbeg = Double.NaN;
        __CLR4_4_1shvshvlb90p9re.R.inc(38049);do {{
            __CLR4_4_1shvshvlb90p9re.R.inc(38050);final int nfm = getEvaluations();
            __CLR4_4_1shvshvlb90p9re.R.inc(38051);final int nfx = nfm - n;
            __CLR4_4_1shvshvlb90p9re.R.inc(38052);final int nfmm = nfm - 1;
            __CLR4_4_1shvshvlb90p9re.R.inc(38053);final int nfxm = nfx - 1;
            __CLR4_4_1shvshvlb90p9re.R.inc(38054);double stepa = 0;
            __CLR4_4_1shvshvlb90p9re.R.inc(38055);double stepb = 0;
            __CLR4_4_1shvshvlb90p9re.R.inc(38056);if ((((nfm <= 2 * n)&&(__CLR4_4_1shvshvlb90p9re.R.iget(38057)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(38058)==0&false))) {{
                __CLR4_4_1shvshvlb90p9re.R.inc(38059);if ((((nfm >= 1 &&
                    nfm <= n)&&(__CLR4_4_1shvshvlb90p9re.R.iget(38060)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(38061)==0&false))) {{
                    __CLR4_4_1shvshvlb90p9re.R.inc(38062);stepa = initialTrustRegionRadius;
                    __CLR4_4_1shvshvlb90p9re.R.inc(38063);if ((((upperDifference.getEntry(nfmm) == ZERO)&&(__CLR4_4_1shvshvlb90p9re.R.iget(38064)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(38065)==0&false))) {{
                        __CLR4_4_1shvshvlb90p9re.R.inc(38066);stepa = -stepa;
                        // throw new PathIsExploredException(); // XXX
                    }
                    }__CLR4_4_1shvshvlb90p9re.R.inc(38067);interpolationPoints.setEntry(nfm, nfmm, stepa);
                } }else {__CLR4_4_1shvshvlb90p9re.R.inc(38068);if ((((nfm > n)&&(__CLR4_4_1shvshvlb90p9re.R.iget(38069)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(38070)==0&false))) {{
                    __CLR4_4_1shvshvlb90p9re.R.inc(38071);stepa = interpolationPoints.getEntry(nfx, nfxm);
                    __CLR4_4_1shvshvlb90p9re.R.inc(38072);stepb = -initialTrustRegionRadius;
                    __CLR4_4_1shvshvlb90p9re.R.inc(38073);if ((((lowerDifference.getEntry(nfxm) == ZERO)&&(__CLR4_4_1shvshvlb90p9re.R.iget(38074)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(38075)==0&false))) {{
                        __CLR4_4_1shvshvlb90p9re.R.inc(38076);stepb = Math.min(TWO * initialTrustRegionRadius, upperDifference.getEntry(nfxm));
                        // throw new PathIsExploredException(); // XXX
                    }
                    }__CLR4_4_1shvshvlb90p9re.R.inc(38077);if ((((upperDifference.getEntry(nfxm) == ZERO)&&(__CLR4_4_1shvshvlb90p9re.R.iget(38078)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(38079)==0&false))) {{
                        __CLR4_4_1shvshvlb90p9re.R.inc(38080);stepb = Math.max(-TWO * initialTrustRegionRadius, lowerDifference.getEntry(nfxm));
                        // throw new PathIsExploredException(); // XXX
                    }
                    }__CLR4_4_1shvshvlb90p9re.R.inc(38081);interpolationPoints.setEntry(nfm, nfxm, stepb);
                }
            }}} }else {{
                __CLR4_4_1shvshvlb90p9re.R.inc(38082);final int tmp1 = (nfm - np) / n;
                __CLR4_4_1shvshvlb90p9re.R.inc(38083);jpt = nfm - tmp1 * n - n;
                __CLR4_4_1shvshvlb90p9re.R.inc(38084);ipt = jpt + tmp1;
                __CLR4_4_1shvshvlb90p9re.R.inc(38085);if ((((ipt > n)&&(__CLR4_4_1shvshvlb90p9re.R.iget(38086)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(38087)==0&false))) {{
                    __CLR4_4_1shvshvlb90p9re.R.inc(38088);final int tmp2 = jpt;
                    __CLR4_4_1shvshvlb90p9re.R.inc(38089);jpt = ipt - n;
                    __CLR4_4_1shvshvlb90p9re.R.inc(38090);ipt = tmp2;
//                     throw new PathIsExploredException(); // XXX
                }
                }__CLR4_4_1shvshvlb90p9re.R.inc(38091);final int iptMinus1 = ipt - 1;
                __CLR4_4_1shvshvlb90p9re.R.inc(38092);final int jptMinus1 = jpt - 1;
                __CLR4_4_1shvshvlb90p9re.R.inc(38093);interpolationPoints.setEntry(nfm, iptMinus1, interpolationPoints.getEntry(ipt, iptMinus1));
                __CLR4_4_1shvshvlb90p9re.R.inc(38094);interpolationPoints.setEntry(nfm, jptMinus1, interpolationPoints.getEntry(jpt, jptMinus1));
            }

            // Calculate the next value of F. The least function value so far and
            // its index are required.

            }__CLR4_4_1shvshvlb90p9re.R.inc(38095);for (int j = 0; (((j < n)&&(__CLR4_4_1shvshvlb90p9re.R.iget(38096)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(38097)==0&false)); j++) {{
                __CLR4_4_1shvshvlb90p9re.R.inc(38098);currentBest.setEntry(j, Math.min(Math.max(lowerBound[j],
                                                          originShift.getEntry(j) + interpolationPoints.getEntry(nfm, j)),
                                                 upperBound[j]));
                __CLR4_4_1shvshvlb90p9re.R.inc(38099);if ((((interpolationPoints.getEntry(nfm, j) == lowerDifference.getEntry(j))&&(__CLR4_4_1shvshvlb90p9re.R.iget(38100)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(38101)==0&false))) {{
                    __CLR4_4_1shvshvlb90p9re.R.inc(38102);currentBest.setEntry(j, lowerBound[j]);
                }
                }__CLR4_4_1shvshvlb90p9re.R.inc(38103);if ((((interpolationPoints.getEntry(nfm, j) == upperDifference.getEntry(j))&&(__CLR4_4_1shvshvlb90p9re.R.iget(38104)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(38105)==0&false))) {{
                    __CLR4_4_1shvshvlb90p9re.R.inc(38106);currentBest.setEntry(j, upperBound[j]);
                }
            }}

            }__CLR4_4_1shvshvlb90p9re.R.inc(38107);final double objectiveValue = computeObjectiveValue(currentBest.toArray());
            __CLR4_4_1shvshvlb90p9re.R.inc(38108);final double f = (((isMinimize )&&(__CLR4_4_1shvshvlb90p9re.R.iget(38109)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(38110)==0&false))? objectiveValue : -objectiveValue;
            __CLR4_4_1shvshvlb90p9re.R.inc(38111);final int numEval = getEvaluations(); // nfm + 1
            __CLR4_4_1shvshvlb90p9re.R.inc(38112);fAtInterpolationPoints.setEntry(nfm, f);

            __CLR4_4_1shvshvlb90p9re.R.inc(38113);if ((((numEval == 1)&&(__CLR4_4_1shvshvlb90p9re.R.iget(38114)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(38115)==0&false))) {{
                __CLR4_4_1shvshvlb90p9re.R.inc(38116);fbeg = f;
                __CLR4_4_1shvshvlb90p9re.R.inc(38117);trustRegionCenterInterpolationPointIndex = 0;
            } }else {__CLR4_4_1shvshvlb90p9re.R.inc(38118);if ((((f < fAtInterpolationPoints.getEntry(trustRegionCenterInterpolationPointIndex))&&(__CLR4_4_1shvshvlb90p9re.R.iget(38119)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(38120)==0&false))) {{
                __CLR4_4_1shvshvlb90p9re.R.inc(38121);trustRegionCenterInterpolationPointIndex = nfm;
            }

            // Set the nonzero initial elements of BMAT and the quadratic model in the
            // cases when NF is at most 2*N+1. If NF exceeds N+1, then the positions
            // of the NF-th and (NF-N)-th interpolation points may be switched, in
            // order that the function value at the first of them contributes to the
            // off-diagonal second derivative terms of the initial quadratic model.

            }}__CLR4_4_1shvshvlb90p9re.R.inc(38122);if ((((numEval <= 2 * n + 1)&&(__CLR4_4_1shvshvlb90p9re.R.iget(38123)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(38124)==0&false))) {{
                __CLR4_4_1shvshvlb90p9re.R.inc(38125);if ((((numEval >= 2 &&
                    numEval <= n + 1)&&(__CLR4_4_1shvshvlb90p9re.R.iget(38126)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(38127)==0&false))) {{
                    __CLR4_4_1shvshvlb90p9re.R.inc(38128);gradientAtTrustRegionCenter.setEntry(nfmm, (f - fbeg) / stepa);
                    __CLR4_4_1shvshvlb90p9re.R.inc(38129);if ((((npt < numEval + n)&&(__CLR4_4_1shvshvlb90p9re.R.iget(38130)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(38131)==0&false))) {{
                        __CLR4_4_1shvshvlb90p9re.R.inc(38132);final double oneOverStepA = ONE / stepa;
                        __CLR4_4_1shvshvlb90p9re.R.inc(38133);bMatrix.setEntry(0, nfmm, -oneOverStepA);
                        __CLR4_4_1shvshvlb90p9re.R.inc(38134);bMatrix.setEntry(nfm, nfmm, oneOverStepA);
                        __CLR4_4_1shvshvlb90p9re.R.inc(38135);bMatrix.setEntry(npt + nfmm, nfmm, -HALF * rhosq);
                        // throw new PathIsExploredException(); // XXX
                    }
                }} }else {__CLR4_4_1shvshvlb90p9re.R.inc(38136);if ((((numEval >= n + 2)&&(__CLR4_4_1shvshvlb90p9re.R.iget(38137)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(38138)==0&false))) {{
                    __CLR4_4_1shvshvlb90p9re.R.inc(38139);final int ih = nfx * (nfx + 1) / 2 - 1;
                    __CLR4_4_1shvshvlb90p9re.R.inc(38140);final double tmp = (f - fbeg) / stepb;
                    __CLR4_4_1shvshvlb90p9re.R.inc(38141);final double diff = stepb - stepa;
                    __CLR4_4_1shvshvlb90p9re.R.inc(38142);modelSecondDerivativesValues.setEntry(ih, TWO * (tmp - gradientAtTrustRegionCenter.getEntry(nfxm)) / diff);
                    __CLR4_4_1shvshvlb90p9re.R.inc(38143);gradientAtTrustRegionCenter.setEntry(nfxm, (gradientAtTrustRegionCenter.getEntry(nfxm) * stepb - tmp * stepa) / diff);
                    __CLR4_4_1shvshvlb90p9re.R.inc(38144);if ((((stepa * stepb < ZERO && f < fAtInterpolationPoints.getEntry(nfm - n))&&(__CLR4_4_1shvshvlb90p9re.R.iget(38145)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(38146)==0&false))) {{
                        __CLR4_4_1shvshvlb90p9re.R.inc(38147);fAtInterpolationPoints.setEntry(nfm, fAtInterpolationPoints.getEntry(nfm - n));
                        __CLR4_4_1shvshvlb90p9re.R.inc(38148);fAtInterpolationPoints.setEntry(nfm - n, f);
                        __CLR4_4_1shvshvlb90p9re.R.inc(38149);if ((((trustRegionCenterInterpolationPointIndex == nfm)&&(__CLR4_4_1shvshvlb90p9re.R.iget(38150)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(38151)==0&false))) {{
                            __CLR4_4_1shvshvlb90p9re.R.inc(38152);trustRegionCenterInterpolationPointIndex = nfm - n;
                        }
                        }__CLR4_4_1shvshvlb90p9re.R.inc(38153);interpolationPoints.setEntry(nfm - n, nfxm, stepb);
                        __CLR4_4_1shvshvlb90p9re.R.inc(38154);interpolationPoints.setEntry(nfm, nfxm, stepa);
                    }
                    }__CLR4_4_1shvshvlb90p9re.R.inc(38155);bMatrix.setEntry(0, nfxm, -(stepa + stepb) / (stepa * stepb));
                    __CLR4_4_1shvshvlb90p9re.R.inc(38156);bMatrix.setEntry(nfm, nfxm, -HALF / interpolationPoints.getEntry(nfm - n, nfxm));
                    __CLR4_4_1shvshvlb90p9re.R.inc(38157);bMatrix.setEntry(nfm - n, nfxm,
                                  -bMatrix.getEntry(0, nfxm) - bMatrix.getEntry(nfm, nfxm));
                    __CLR4_4_1shvshvlb90p9re.R.inc(38158);zMatrix.setEntry(0, nfxm, Math.sqrt(TWO) / (stepa * stepb));
                    __CLR4_4_1shvshvlb90p9re.R.inc(38159);zMatrix.setEntry(nfm, nfxm, Math.sqrt(HALF) / rhosq);
                    // zMatrix.setEntry(nfm, nfxm, Math.sqrt(HALF) * recip); // XXX "testAckley" and "testDiffPow" fail.
                    __CLR4_4_1shvshvlb90p9re.R.inc(38160);zMatrix.setEntry(nfm - n, nfxm,
                                  -zMatrix.getEntry(0, nfxm) - zMatrix.getEntry(nfm, nfxm));
                }

                // Set the off-diagonal second derivatives of the Lagrange functions and
                // the initial quadratic model.

            }}} }else {{
                __CLR4_4_1shvshvlb90p9re.R.inc(38161);zMatrix.setEntry(0, nfxm, recip);
                __CLR4_4_1shvshvlb90p9re.R.inc(38162);zMatrix.setEntry(nfm, nfxm, recip);
                __CLR4_4_1shvshvlb90p9re.R.inc(38163);zMatrix.setEntry(ipt, nfxm, -recip);
                __CLR4_4_1shvshvlb90p9re.R.inc(38164);zMatrix.setEntry(jpt, nfxm, -recip);

                __CLR4_4_1shvshvlb90p9re.R.inc(38165);final int ih = ipt * (ipt - 1) / 2 + jpt - 1;
                __CLR4_4_1shvshvlb90p9re.R.inc(38166);final double tmp = interpolationPoints.getEntry(nfm, ipt - 1) * interpolationPoints.getEntry(nfm, jpt - 1);
                __CLR4_4_1shvshvlb90p9re.R.inc(38167);modelSecondDerivativesValues.setEntry(ih, (fbeg - fAtInterpolationPoints.getEntry(ipt) - fAtInterpolationPoints.getEntry(jpt) + f) / tmp);
//                 throw new PathIsExploredException(); // XXX
            }
        }} }while ((((getEvaluations() < npt)&&(__CLR4_4_1shvshvlb90p9re.R.iget(38168)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(38169)==0&false)));
    }finally{__CLR4_4_1shvshvlb90p9re.R.flushNeeded();}} // prelim


    // ----------------------------------------------------------------------------------------

    /**
     *     A version of the truncated conjugate gradient is applied. If a line
     *     search is restricted by a constraint, then the procedure is restarted,
     *     the values of the variables that are at their bounds being fixed. If
     *     the trust region boundary is reached, then further changes may be made
     *     to D, each one being in the two dimensional space that is spanned
     *     by the current D and the gradient of Q at XOPT+D, staying on the trust
     *     region boundary. Termination occurs when the reduction in Q seems to
     *     be close to the greatest reduction that can be achieved.
     *     The arguments N, NPT, XPT, XOPT, GOPT, HQ, PQ, SL and SU have the same
     *       meanings as the corresponding arguments of BOBYQB.
     *     DELTA is the trust region radius for the present calculation, which
     *       seeks a small value of the quadratic model within distance DELTA of
     *       XOPT subject to the bounds on the variables.
     *     XNEW will be set to a new vector of variables that is approximately
     *       the one that minimizes the quadratic model within the trust region
     *       subject to the SL and SU constraints on the variables. It satisfies
     *       as equations the bounds that become active during the calculation.
     *     D is the calculated trial step from XOPT, generated iteratively from an
     *       initial value of zero. Thus XNEW is XOPT+D after the final iteration.
     *     GNEW holds the gradient of the quadratic model at XOPT+D. It is updated
     *       when D is updated.
     *     xbdi.get( is a working space vector. For I=1,2,...,N, the element xbdi.get((I) is
     *       set to -1.0, 0.0, or 1.0, the value being nonzero if and only if the
     *       I-th variable has become fixed at a bound, the bound being SL(I) or
     *       SU(I) in the case xbdi.get((I)=-1.0 or xbdi.get((I)=1.0, respectively. This
     *       information is accumulated during the construction of XNEW.
     *     The arrays S, HS and HRED are also used for working space. They hold the
     *       current search direction, and the changes in the gradient of Q along S
     *       and the reduced D, respectively, where the reduced D is the same as D,
     *       except that the components of the fixed variables are zero.
     *     DSQ will be set to the square of the length of XNEW-XOPT.
     *     CRVMIN is set to zero if D reaches the trust region boundary. Otherwise
     *       it is set to the least curvature of H that occurs in the conjugate
     *       gradient searches that are not restricted by any constraints. The
     *       value CRVMIN=-1.0D0 is set, however, if all of these searches are
     *       constrained.
     * @param delta
     * @param gnew
     * @param xbdi
     * @param s
     * @param hs
     * @param hred
     */
    private double[] trsbox(
            double delta,
            ArrayRealVector gnew,
            ArrayRealVector xbdi,
            ArrayRealVector s,
            ArrayRealVector hs,
            ArrayRealVector hred
    ) {try{__CLR4_4_1shvshvlb90p9re.R.inc(38170);
        __CLR4_4_1shvshvlb90p9re.R.inc(38171);printMethod(); // XXX

        __CLR4_4_1shvshvlb90p9re.R.inc(38172);final int n = currentBest.getDimension();
        __CLR4_4_1shvshvlb90p9re.R.inc(38173);final int npt = numberOfInterpolationPoints;

        __CLR4_4_1shvshvlb90p9re.R.inc(38174);double dsq = Double.NaN;
        __CLR4_4_1shvshvlb90p9re.R.inc(38175);double crvmin = Double.NaN;

        // Local variables
        __CLR4_4_1shvshvlb90p9re.R.inc(38176);double ds;
        __CLR4_4_1shvshvlb90p9re.R.inc(38177);int iu;
        __CLR4_4_1shvshvlb90p9re.R.inc(38178);double dhd, dhs, cth, shs, sth, ssq, beta=0, sdec, blen;
        __CLR4_4_1shvshvlb90p9re.R.inc(38179);int iact = -1;
        __CLR4_4_1shvshvlb90p9re.R.inc(38180);int nact = 0;
        __CLR4_4_1shvshvlb90p9re.R.inc(38181);double angt = 0, qred;
        __CLR4_4_1shvshvlb90p9re.R.inc(38182);int isav;
        __CLR4_4_1shvshvlb90p9re.R.inc(38183);double temp = 0, xsav = 0, xsum = 0, angbd = 0, dredg = 0, sredg = 0;
        __CLR4_4_1shvshvlb90p9re.R.inc(38184);int iterc;
        __CLR4_4_1shvshvlb90p9re.R.inc(38185);double resid = 0, delsq = 0, ggsav = 0, tempa = 0, tempb = 0,
        redmax = 0, dredsq = 0, redsav = 0, gredsq = 0, rednew = 0;
        __CLR4_4_1shvshvlb90p9re.R.inc(38186);int itcsav = 0;
        __CLR4_4_1shvshvlb90p9re.R.inc(38187);double rdprev = 0, rdnext = 0, stplen = 0, stepsq = 0;
        __CLR4_4_1shvshvlb90p9re.R.inc(38188);int itermax = 0;

        // Set some constants.

        // Function Body

        // The sign of GOPT(I) gives the sign of the change to the I-th variable
        // that will reduce Q from its value at XOPT. Thus xbdi.get((I) shows whether
        // or not to fix the I-th variable at one of its bounds initially, with
        // NACT being set to the number of fixed variables. D and GNEW are also
        // set for the first iteration. DELSQ is the upper bound on the sum of
        // squares of the free variables. QRED is the reduction in Q so far.

        __CLR4_4_1shvshvlb90p9re.R.inc(38189);iterc = 0;
        __CLR4_4_1shvshvlb90p9re.R.inc(38190);nact = 0;
        __CLR4_4_1shvshvlb90p9re.R.inc(38191);for (int i = 0; (((i < n)&&(__CLR4_4_1shvshvlb90p9re.R.iget(38192)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(38193)==0&false)); i++) {{
            __CLR4_4_1shvshvlb90p9re.R.inc(38194);xbdi.setEntry(i, ZERO);
            __CLR4_4_1shvshvlb90p9re.R.inc(38195);if ((((trustRegionCenterOffset.getEntry(i) <= lowerDifference.getEntry(i))&&(__CLR4_4_1shvshvlb90p9re.R.iget(38196)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(38197)==0&false))) {{
                __CLR4_4_1shvshvlb90p9re.R.inc(38198);if ((((gradientAtTrustRegionCenter.getEntry(i) >= ZERO)&&(__CLR4_4_1shvshvlb90p9re.R.iget(38199)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(38200)==0&false))) {{
                    __CLR4_4_1shvshvlb90p9re.R.inc(38201);xbdi.setEntry(i, MINUS_ONE);
                }
            }} }else {__CLR4_4_1shvshvlb90p9re.R.inc(38202);if ((((trustRegionCenterOffset.getEntry(i) >= upperDifference.getEntry(i) &&
                    gradientAtTrustRegionCenter.getEntry(i) <= ZERO)&&(__CLR4_4_1shvshvlb90p9re.R.iget(38203)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(38204)==0&false))) {{
                __CLR4_4_1shvshvlb90p9re.R.inc(38205);xbdi.setEntry(i, ONE);
            }
            }}__CLR4_4_1shvshvlb90p9re.R.inc(38206);if ((((xbdi.getEntry(i) != ZERO)&&(__CLR4_4_1shvshvlb90p9re.R.iget(38207)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(38208)==0&false))) {{
                __CLR4_4_1shvshvlb90p9re.R.inc(38209);++nact;
            }
            }__CLR4_4_1shvshvlb90p9re.R.inc(38210);trialStepPoint.setEntry(i, ZERO);
            __CLR4_4_1shvshvlb90p9re.R.inc(38211);gnew.setEntry(i, gradientAtTrustRegionCenter.getEntry(i));
        }
        }__CLR4_4_1shvshvlb90p9re.R.inc(38212);delsq = delta * delta;
        __CLR4_4_1shvshvlb90p9re.R.inc(38213);qred = ZERO;
        __CLR4_4_1shvshvlb90p9re.R.inc(38214);crvmin = MINUS_ONE;

        // Set the next search direction of the conjugate gradient method. It is
        // the steepest descent direction initially and when the iterations are
        // restarted because a variable has just been fixed by a bound, and of
        // course the components of the fixed variables are zero. ITERMAX is an
        // upper bound on the indices of the conjugate gradient iterations.

        __CLR4_4_1shvshvlb90p9re.R.inc(38215);int state = 20;
        __CLR4_4_1shvshvlb90p9re.R.inc(38216);for(;;) {{
            boolean __CLB4_4_1_bool1=false;__CLR4_4_1shvshvlb90p9re.R.inc(38217);switch (state) {
        case 20:if (!__CLB4_4_1_bool1) {__CLR4_4_1shvshvlb90p9re.R.inc(38218);__CLB4_4_1_bool1=true;} {
            __CLR4_4_1shvshvlb90p9re.R.inc(38219);printState(20); // XXX
            __CLR4_4_1shvshvlb90p9re.R.inc(38220);beta = ZERO;
        }
        case 30:if (!__CLB4_4_1_bool1) {__CLR4_4_1shvshvlb90p9re.R.inc(38221);__CLB4_4_1_bool1=true;} {
            __CLR4_4_1shvshvlb90p9re.R.inc(38222);printState(30); // XXX
            __CLR4_4_1shvshvlb90p9re.R.inc(38223);stepsq = ZERO;
            __CLR4_4_1shvshvlb90p9re.R.inc(38224);for (int i = 0; (((i < n)&&(__CLR4_4_1shvshvlb90p9re.R.iget(38225)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(38226)==0&false)); i++) {{
                __CLR4_4_1shvshvlb90p9re.R.inc(38227);if ((((xbdi.getEntry(i) != ZERO)&&(__CLR4_4_1shvshvlb90p9re.R.iget(38228)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(38229)==0&false))) {{
                    __CLR4_4_1shvshvlb90p9re.R.inc(38230);s.setEntry(i, ZERO);
                } }else {__CLR4_4_1shvshvlb90p9re.R.inc(38231);if ((((beta == ZERO)&&(__CLR4_4_1shvshvlb90p9re.R.iget(38232)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(38233)==0&false))) {{
                    __CLR4_4_1shvshvlb90p9re.R.inc(38234);s.setEntry(i, -gnew.getEntry(i));
                } }else {{
                    __CLR4_4_1shvshvlb90p9re.R.inc(38235);s.setEntry(i, beta * s.getEntry(i) - gnew.getEntry(i));
                }
                // Computing 2nd power
                }}__CLR4_4_1shvshvlb90p9re.R.inc(38236);final double d1 = s.getEntry(i);
                __CLR4_4_1shvshvlb90p9re.R.inc(38237);stepsq += d1 * d1;
            }
            }__CLR4_4_1shvshvlb90p9re.R.inc(38238);if ((((stepsq == ZERO)&&(__CLR4_4_1shvshvlb90p9re.R.iget(38239)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(38240)==0&false))) {{
                __CLR4_4_1shvshvlb90p9re.R.inc(38241);state = 190; __CLR4_4_1shvshvlb90p9re.R.inc(38242);break;
            }
            }__CLR4_4_1shvshvlb90p9re.R.inc(38243);if ((((beta == ZERO)&&(__CLR4_4_1shvshvlb90p9re.R.iget(38244)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(38245)==0&false))) {{
                __CLR4_4_1shvshvlb90p9re.R.inc(38246);gredsq = stepsq;
                __CLR4_4_1shvshvlb90p9re.R.inc(38247);itermax = iterc + n - nact;
            }
            }__CLR4_4_1shvshvlb90p9re.R.inc(38248);if ((((gredsq * delsq <= qred * 1e-4 * qred)&&(__CLR4_4_1shvshvlb90p9re.R.iget(38249)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(38250)==0&false))) {{
                __CLR4_4_1shvshvlb90p9re.R.inc(38251);state = 190; __CLR4_4_1shvshvlb90p9re.R.inc(38252);break;
            }

            // Multiply the search direction by the second derivative matrix of Q and
            // calculate some scalars for the choice of steplength. Then set BLEN to
            // the length of the the step to the trust region boundary and STPLEN to
            // the steplength, ignoring the simple bounds.

            }__CLR4_4_1shvshvlb90p9re.R.inc(38253);state = 210; __CLR4_4_1shvshvlb90p9re.R.inc(38254);break;
        }
        case 50:if (!__CLB4_4_1_bool1) {__CLR4_4_1shvshvlb90p9re.R.inc(38255);__CLB4_4_1_bool1=true;} {
            __CLR4_4_1shvshvlb90p9re.R.inc(38256);printState(50); // XXX
            __CLR4_4_1shvshvlb90p9re.R.inc(38257);resid = delsq;
            __CLR4_4_1shvshvlb90p9re.R.inc(38258);ds = ZERO;
            __CLR4_4_1shvshvlb90p9re.R.inc(38259);shs = ZERO;
            __CLR4_4_1shvshvlb90p9re.R.inc(38260);for (int i = 0; (((i < n)&&(__CLR4_4_1shvshvlb90p9re.R.iget(38261)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(38262)==0&false)); i++) {{
                __CLR4_4_1shvshvlb90p9re.R.inc(38263);if ((((xbdi.getEntry(i) == ZERO)&&(__CLR4_4_1shvshvlb90p9re.R.iget(38264)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(38265)==0&false))) {{
                    // Computing 2nd power
                    __CLR4_4_1shvshvlb90p9re.R.inc(38266);final double d1 = trialStepPoint.getEntry(i);
                    __CLR4_4_1shvshvlb90p9re.R.inc(38267);resid -= d1 * d1;
                    __CLR4_4_1shvshvlb90p9re.R.inc(38268);ds += s.getEntry(i) * trialStepPoint.getEntry(i);
                    __CLR4_4_1shvshvlb90p9re.R.inc(38269);shs += s.getEntry(i) * hs.getEntry(i);
                }
            }}
            }__CLR4_4_1shvshvlb90p9re.R.inc(38270);if ((((resid <= ZERO)&&(__CLR4_4_1shvshvlb90p9re.R.iget(38271)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(38272)==0&false))) {{
                __CLR4_4_1shvshvlb90p9re.R.inc(38273);state = 90; __CLR4_4_1shvshvlb90p9re.R.inc(38274);break;
            }
            }__CLR4_4_1shvshvlb90p9re.R.inc(38275);temp = Math.sqrt(stepsq * resid + ds * ds);
            __CLR4_4_1shvshvlb90p9re.R.inc(38276);if ((((ds < ZERO)&&(__CLR4_4_1shvshvlb90p9re.R.iget(38277)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(38278)==0&false))) {{
                __CLR4_4_1shvshvlb90p9re.R.inc(38279);blen = (temp - ds) / stepsq;
            } }else {{
                __CLR4_4_1shvshvlb90p9re.R.inc(38280);blen = resid / (temp + ds);
            }
            }__CLR4_4_1shvshvlb90p9re.R.inc(38281);stplen = blen;
            __CLR4_4_1shvshvlb90p9re.R.inc(38282);if ((((shs > ZERO)&&(__CLR4_4_1shvshvlb90p9re.R.iget(38283)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(38284)==0&false))) {{
                // Computing MIN
                __CLR4_4_1shvshvlb90p9re.R.inc(38285);stplen = Math.min(blen, gredsq / shs);
            }

            // Reduce STPLEN if necessary in order to preserve the simple bounds,
            // letting IACT be the index of the new constrained variable.

            }__CLR4_4_1shvshvlb90p9re.R.inc(38286);iact = -1;
            __CLR4_4_1shvshvlb90p9re.R.inc(38287);for (int i = 0; (((i < n)&&(__CLR4_4_1shvshvlb90p9re.R.iget(38288)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(38289)==0&false)); i++) {{
                __CLR4_4_1shvshvlb90p9re.R.inc(38290);if ((((s.getEntry(i) != ZERO)&&(__CLR4_4_1shvshvlb90p9re.R.iget(38291)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(38292)==0&false))) {{
                    __CLR4_4_1shvshvlb90p9re.R.inc(38293);xsum = trustRegionCenterOffset.getEntry(i) + trialStepPoint.getEntry(i);
                    __CLR4_4_1shvshvlb90p9re.R.inc(38294);if ((((s.getEntry(i) > ZERO)&&(__CLR4_4_1shvshvlb90p9re.R.iget(38295)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(38296)==0&false))) {{
                        __CLR4_4_1shvshvlb90p9re.R.inc(38297);temp = (upperDifference.getEntry(i) - xsum) / s.getEntry(i);
                    } }else {{
                        __CLR4_4_1shvshvlb90p9re.R.inc(38298);temp = (lowerDifference.getEntry(i) - xsum) / s.getEntry(i);
                    }
                    }__CLR4_4_1shvshvlb90p9re.R.inc(38299);if ((((temp < stplen)&&(__CLR4_4_1shvshvlb90p9re.R.iget(38300)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(38301)==0&false))) {{
                        __CLR4_4_1shvshvlb90p9re.R.inc(38302);stplen = temp;
                        __CLR4_4_1shvshvlb90p9re.R.inc(38303);iact = i;
                    }
                }}
            }}

            // Update CRVMIN, GNEW and D. Set SDEC to the decrease that occurs in Q.

            }__CLR4_4_1shvshvlb90p9re.R.inc(38304);sdec = ZERO;
            __CLR4_4_1shvshvlb90p9re.R.inc(38305);if ((((stplen > ZERO)&&(__CLR4_4_1shvshvlb90p9re.R.iget(38306)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(38307)==0&false))) {{
                __CLR4_4_1shvshvlb90p9re.R.inc(38308);++iterc;
                __CLR4_4_1shvshvlb90p9re.R.inc(38309);temp = shs / stepsq;
                __CLR4_4_1shvshvlb90p9re.R.inc(38310);if ((((iact == -1 && temp > ZERO)&&(__CLR4_4_1shvshvlb90p9re.R.iget(38311)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(38312)==0&false))) {{
                    __CLR4_4_1shvshvlb90p9re.R.inc(38313);crvmin = Math.min(crvmin,temp);
                    __CLR4_4_1shvshvlb90p9re.R.inc(38314);if ((((crvmin == MINUS_ONE)&&(__CLR4_4_1shvshvlb90p9re.R.iget(38315)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(38316)==0&false))) {{
                        __CLR4_4_1shvshvlb90p9re.R.inc(38317);crvmin = temp;
                    }
                }}
                }__CLR4_4_1shvshvlb90p9re.R.inc(38318);ggsav = gredsq;
                __CLR4_4_1shvshvlb90p9re.R.inc(38319);gredsq = ZERO;
                __CLR4_4_1shvshvlb90p9re.R.inc(38320);for (int i = 0; (((i < n)&&(__CLR4_4_1shvshvlb90p9re.R.iget(38321)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(38322)==0&false)); i++) {{
                    __CLR4_4_1shvshvlb90p9re.R.inc(38323);gnew.setEntry(i, gnew.getEntry(i) + stplen * hs.getEntry(i));
                    __CLR4_4_1shvshvlb90p9re.R.inc(38324);if ((((xbdi.getEntry(i) == ZERO)&&(__CLR4_4_1shvshvlb90p9re.R.iget(38325)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(38326)==0&false))) {{
                        // Computing 2nd power
                        __CLR4_4_1shvshvlb90p9re.R.inc(38327);final double d1 = gnew.getEntry(i);
                        __CLR4_4_1shvshvlb90p9re.R.inc(38328);gredsq += d1 * d1;
                    }
                    }__CLR4_4_1shvshvlb90p9re.R.inc(38329);trialStepPoint.setEntry(i, trialStepPoint.getEntry(i) + stplen * s.getEntry(i));
                }
                // Computing MAX
                }__CLR4_4_1shvshvlb90p9re.R.inc(38330);final double d1 = stplen * (ggsav - HALF * stplen * shs);
                __CLR4_4_1shvshvlb90p9re.R.inc(38331);sdec = Math.max(d1, ZERO);
                __CLR4_4_1shvshvlb90p9re.R.inc(38332);qred += sdec;
            }

            // Restart the conjugate gradient method if it has hit a new bound.

            }__CLR4_4_1shvshvlb90p9re.R.inc(38333);if ((((iact >= 0)&&(__CLR4_4_1shvshvlb90p9re.R.iget(38334)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(38335)==0&false))) {{
                __CLR4_4_1shvshvlb90p9re.R.inc(38336);++nact;
                __CLR4_4_1shvshvlb90p9re.R.inc(38337);xbdi.setEntry(iact, ONE);
                __CLR4_4_1shvshvlb90p9re.R.inc(38338);if ((((s.getEntry(iact) < ZERO)&&(__CLR4_4_1shvshvlb90p9re.R.iget(38339)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(38340)==0&false))) {{
                    __CLR4_4_1shvshvlb90p9re.R.inc(38341);xbdi.setEntry(iact, MINUS_ONE);
                }
                // Computing 2nd power
                }__CLR4_4_1shvshvlb90p9re.R.inc(38342);final double d1 = trialStepPoint.getEntry(iact);
                __CLR4_4_1shvshvlb90p9re.R.inc(38343);delsq -= d1 * d1;
                __CLR4_4_1shvshvlb90p9re.R.inc(38344);if ((((delsq <= ZERO)&&(__CLR4_4_1shvshvlb90p9re.R.iget(38345)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(38346)==0&false))) {{
                    __CLR4_4_1shvshvlb90p9re.R.inc(38347);state = 190; __CLR4_4_1shvshvlb90p9re.R.inc(38348);break;
                }
                }__CLR4_4_1shvshvlb90p9re.R.inc(38349);state = 20; __CLR4_4_1shvshvlb90p9re.R.inc(38350);break;
            }

            // If STPLEN is less than BLEN, then either apply another conjugate
            // gradient iteration or RETURN.

            }__CLR4_4_1shvshvlb90p9re.R.inc(38351);if ((((stplen < blen)&&(__CLR4_4_1shvshvlb90p9re.R.iget(38352)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(38353)==0&false))) {{
                __CLR4_4_1shvshvlb90p9re.R.inc(38354);if ((((iterc == itermax)&&(__CLR4_4_1shvshvlb90p9re.R.iget(38355)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(38356)==0&false))) {{
                    __CLR4_4_1shvshvlb90p9re.R.inc(38357);state = 190; __CLR4_4_1shvshvlb90p9re.R.inc(38358);break;
                }
                }__CLR4_4_1shvshvlb90p9re.R.inc(38359);if ((((sdec <= qred * .01)&&(__CLR4_4_1shvshvlb90p9re.R.iget(38360)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(38361)==0&false))) {{
                    __CLR4_4_1shvshvlb90p9re.R.inc(38362);state = 190; __CLR4_4_1shvshvlb90p9re.R.inc(38363);break;
                }
                }__CLR4_4_1shvshvlb90p9re.R.inc(38364);beta = gredsq / ggsav;
                __CLR4_4_1shvshvlb90p9re.R.inc(38365);state = 30; __CLR4_4_1shvshvlb90p9re.R.inc(38366);break;
            }
        }}
        case 90:if (!__CLB4_4_1_bool1) {__CLR4_4_1shvshvlb90p9re.R.inc(38367);__CLB4_4_1_bool1=true;} {
            __CLR4_4_1shvshvlb90p9re.R.inc(38368);printState(90); // XXX
            __CLR4_4_1shvshvlb90p9re.R.inc(38369);crvmin = ZERO;

            // Prepare for the alternative iteration by calculating some scalars
            // and by multiplying the reduced D by the second derivative matrix of
            // Q, where S holds the reduced D in the call of GGMULT.

        }
        case 100:if (!__CLB4_4_1_bool1) {__CLR4_4_1shvshvlb90p9re.R.inc(38370);__CLB4_4_1_bool1=true;} {
            __CLR4_4_1shvshvlb90p9re.R.inc(38371);printState(100); // XXX
            __CLR4_4_1shvshvlb90p9re.R.inc(38372);if ((((nact >= n - 1)&&(__CLR4_4_1shvshvlb90p9re.R.iget(38373)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(38374)==0&false))) {{
                __CLR4_4_1shvshvlb90p9re.R.inc(38375);state = 190; __CLR4_4_1shvshvlb90p9re.R.inc(38376);break;
            }
            }__CLR4_4_1shvshvlb90p9re.R.inc(38377);dredsq = ZERO;
            __CLR4_4_1shvshvlb90p9re.R.inc(38378);dredg = ZERO;
            __CLR4_4_1shvshvlb90p9re.R.inc(38379);gredsq = ZERO;
            __CLR4_4_1shvshvlb90p9re.R.inc(38380);for (int i = 0; (((i < n)&&(__CLR4_4_1shvshvlb90p9re.R.iget(38381)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(38382)==0&false)); i++) {{
                __CLR4_4_1shvshvlb90p9re.R.inc(38383);if ((((xbdi.getEntry(i) == ZERO)&&(__CLR4_4_1shvshvlb90p9re.R.iget(38384)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(38385)==0&false))) {{
                    // Computing 2nd power
                    __CLR4_4_1shvshvlb90p9re.R.inc(38386);double d1 = trialStepPoint.getEntry(i);
                    __CLR4_4_1shvshvlb90p9re.R.inc(38387);dredsq += d1 * d1;
                    __CLR4_4_1shvshvlb90p9re.R.inc(38388);dredg += trialStepPoint.getEntry(i) * gnew.getEntry(i);
                    // Computing 2nd power
                    __CLR4_4_1shvshvlb90p9re.R.inc(38389);d1 = gnew.getEntry(i);
                    __CLR4_4_1shvshvlb90p9re.R.inc(38390);gredsq += d1 * d1;
                    __CLR4_4_1shvshvlb90p9re.R.inc(38391);s.setEntry(i, trialStepPoint.getEntry(i));
                } }else {{
                    __CLR4_4_1shvshvlb90p9re.R.inc(38392);s.setEntry(i, ZERO);
                }
            }}
            }__CLR4_4_1shvshvlb90p9re.R.inc(38393);itcsav = iterc;
            __CLR4_4_1shvshvlb90p9re.R.inc(38394);state = 210; __CLR4_4_1shvshvlb90p9re.R.inc(38395);break;
            // Let the search direction S be a linear combination of the reduced D
            // and the reduced G that is orthogonal to the reduced D.
        }
        case 120:if (!__CLB4_4_1_bool1) {__CLR4_4_1shvshvlb90p9re.R.inc(38396);__CLB4_4_1_bool1=true;} {
            __CLR4_4_1shvshvlb90p9re.R.inc(38397);printState(120); // XXX
            __CLR4_4_1shvshvlb90p9re.R.inc(38398);++iterc;
            __CLR4_4_1shvshvlb90p9re.R.inc(38399);temp = gredsq * dredsq - dredg * dredg;
            __CLR4_4_1shvshvlb90p9re.R.inc(38400);if ((((temp <= qred * 1e-4 * qred)&&(__CLR4_4_1shvshvlb90p9re.R.iget(38401)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(38402)==0&false))) {{
                __CLR4_4_1shvshvlb90p9re.R.inc(38403);state = 190; __CLR4_4_1shvshvlb90p9re.R.inc(38404);break;
            }
            }__CLR4_4_1shvshvlb90p9re.R.inc(38405);temp = Math.sqrt(temp);
            __CLR4_4_1shvshvlb90p9re.R.inc(38406);for (int i = 0; (((i < n)&&(__CLR4_4_1shvshvlb90p9re.R.iget(38407)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(38408)==0&false)); i++) {{
                __CLR4_4_1shvshvlb90p9re.R.inc(38409);if ((((xbdi.getEntry(i) == ZERO)&&(__CLR4_4_1shvshvlb90p9re.R.iget(38410)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(38411)==0&false))) {{
                    __CLR4_4_1shvshvlb90p9re.R.inc(38412);s.setEntry(i, (dredg * trialStepPoint.getEntry(i) - dredsq * gnew.getEntry(i)) / temp);
                } }else {{
                    __CLR4_4_1shvshvlb90p9re.R.inc(38413);s.setEntry(i, ZERO);
                }
            }}
            }__CLR4_4_1shvshvlb90p9re.R.inc(38414);sredg = -temp;

            // By considering the simple bounds on the variables, calculate an upper
            // bound on the tangent of half the angle of the alternative iteration,
            // namely ANGBD, except that, if already a free variable has reached a
            // bound, there is a branch back to label 100 after fixing that variable.

            __CLR4_4_1shvshvlb90p9re.R.inc(38415);angbd = ONE;
            __CLR4_4_1shvshvlb90p9re.R.inc(38416);iact = -1;
            __CLR4_4_1shvshvlb90p9re.R.inc(38417);for (int i = 0; (((i < n)&&(__CLR4_4_1shvshvlb90p9re.R.iget(38418)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(38419)==0&false)); i++) {{
                __CLR4_4_1shvshvlb90p9re.R.inc(38420);if ((((xbdi.getEntry(i) == ZERO)&&(__CLR4_4_1shvshvlb90p9re.R.iget(38421)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(38422)==0&false))) {{
                    __CLR4_4_1shvshvlb90p9re.R.inc(38423);tempa = trustRegionCenterOffset.getEntry(i) + trialStepPoint.getEntry(i) - lowerDifference.getEntry(i);
                    __CLR4_4_1shvshvlb90p9re.R.inc(38424);tempb = upperDifference.getEntry(i) - trustRegionCenterOffset.getEntry(i) - trialStepPoint.getEntry(i);
                    __CLR4_4_1shvshvlb90p9re.R.inc(38425);if ((((tempa <= ZERO)&&(__CLR4_4_1shvshvlb90p9re.R.iget(38426)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(38427)==0&false))) {{
                        __CLR4_4_1shvshvlb90p9re.R.inc(38428);++nact;
                        __CLR4_4_1shvshvlb90p9re.R.inc(38429);xbdi.setEntry(i, MINUS_ONE);
                        __CLR4_4_1shvshvlb90p9re.R.inc(38430);state = 100; __CLR4_4_1shvshvlb90p9re.R.inc(38431);break;
                    } }else {__CLR4_4_1shvshvlb90p9re.R.inc(38432);if ((((tempb <= ZERO)&&(__CLR4_4_1shvshvlb90p9re.R.iget(38433)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(38434)==0&false))) {{
                        __CLR4_4_1shvshvlb90p9re.R.inc(38435);++nact;
                        __CLR4_4_1shvshvlb90p9re.R.inc(38436);xbdi.setEntry(i, ONE);
                        __CLR4_4_1shvshvlb90p9re.R.inc(38437);state = 100; __CLR4_4_1shvshvlb90p9re.R.inc(38438);break;
                    }
                    // Computing 2nd power
                    }}__CLR4_4_1shvshvlb90p9re.R.inc(38439);double d1 = trialStepPoint.getEntry(i);
                    // Computing 2nd power
                    __CLR4_4_1shvshvlb90p9re.R.inc(38440);double d2 = s.getEntry(i);
                    __CLR4_4_1shvshvlb90p9re.R.inc(38441);ssq = d1 * d1 + d2 * d2;
                    // Computing 2nd power
                    __CLR4_4_1shvshvlb90p9re.R.inc(38442);d1 = trustRegionCenterOffset.getEntry(i) - lowerDifference.getEntry(i);
                    __CLR4_4_1shvshvlb90p9re.R.inc(38443);temp = ssq - d1 * d1;
                    __CLR4_4_1shvshvlb90p9re.R.inc(38444);if ((((temp > ZERO)&&(__CLR4_4_1shvshvlb90p9re.R.iget(38445)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(38446)==0&false))) {{
                        __CLR4_4_1shvshvlb90p9re.R.inc(38447);temp = Math.sqrt(temp) - s.getEntry(i);
                        __CLR4_4_1shvshvlb90p9re.R.inc(38448);if ((((angbd * temp > tempa)&&(__CLR4_4_1shvshvlb90p9re.R.iget(38449)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(38450)==0&false))) {{
                            __CLR4_4_1shvshvlb90p9re.R.inc(38451);angbd = tempa / temp;
                            __CLR4_4_1shvshvlb90p9re.R.inc(38452);iact = i;
                            __CLR4_4_1shvshvlb90p9re.R.inc(38453);xsav = MINUS_ONE;
                        }
                    }}
                    // Computing 2nd power
                    }__CLR4_4_1shvshvlb90p9re.R.inc(38454);d1 = upperDifference.getEntry(i) - trustRegionCenterOffset.getEntry(i);
                    __CLR4_4_1shvshvlb90p9re.R.inc(38455);temp = ssq - d1 * d1;
                    __CLR4_4_1shvshvlb90p9re.R.inc(38456);if ((((temp > ZERO)&&(__CLR4_4_1shvshvlb90p9re.R.iget(38457)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(38458)==0&false))) {{
                        __CLR4_4_1shvshvlb90p9re.R.inc(38459);temp = Math.sqrt(temp) + s.getEntry(i);
                        __CLR4_4_1shvshvlb90p9re.R.inc(38460);if ((((angbd * temp > tempb)&&(__CLR4_4_1shvshvlb90p9re.R.iget(38461)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(38462)==0&false))) {{
                            __CLR4_4_1shvshvlb90p9re.R.inc(38463);angbd = tempb / temp;
                            __CLR4_4_1shvshvlb90p9re.R.inc(38464);iact = i;
                            __CLR4_4_1shvshvlb90p9re.R.inc(38465);xsav = ONE;
                        }
                    }}
                }}
            }}

            // Calculate HHD and some curvatures for the alternative iteration.

            }__CLR4_4_1shvshvlb90p9re.R.inc(38466);state = 210; __CLR4_4_1shvshvlb90p9re.R.inc(38467);break;
        }
        case 150:if (!__CLB4_4_1_bool1) {__CLR4_4_1shvshvlb90p9re.R.inc(38468);__CLB4_4_1_bool1=true;} {
            __CLR4_4_1shvshvlb90p9re.R.inc(38469);printState(150); // XXX
            __CLR4_4_1shvshvlb90p9re.R.inc(38470);shs = ZERO;
            __CLR4_4_1shvshvlb90p9re.R.inc(38471);dhs = ZERO;
            __CLR4_4_1shvshvlb90p9re.R.inc(38472);dhd = ZERO;
            __CLR4_4_1shvshvlb90p9re.R.inc(38473);for (int i = 0; (((i < n)&&(__CLR4_4_1shvshvlb90p9re.R.iget(38474)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(38475)==0&false)); i++) {{
                __CLR4_4_1shvshvlb90p9re.R.inc(38476);if ((((xbdi.getEntry(i) == ZERO)&&(__CLR4_4_1shvshvlb90p9re.R.iget(38477)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(38478)==0&false))) {{
                    __CLR4_4_1shvshvlb90p9re.R.inc(38479);shs += s.getEntry(i) * hs.getEntry(i);
                    __CLR4_4_1shvshvlb90p9re.R.inc(38480);dhs += trialStepPoint.getEntry(i) * hs.getEntry(i);
                    __CLR4_4_1shvshvlb90p9re.R.inc(38481);dhd += trialStepPoint.getEntry(i) * hred.getEntry(i);
                }
            }}

            // Seek the greatest reduction in Q for a range of equally spaced values
            // of ANGT in [0,ANGBD], where ANGT is the tangent of half the angle of
            // the alternative iteration.

            }__CLR4_4_1shvshvlb90p9re.R.inc(38482);redmax = ZERO;
            __CLR4_4_1shvshvlb90p9re.R.inc(38483);isav = -1;
            __CLR4_4_1shvshvlb90p9re.R.inc(38484);redsav = ZERO;
            __CLR4_4_1shvshvlb90p9re.R.inc(38485);iu = (int) (angbd * 17. + 3.1);
            __CLR4_4_1shvshvlb90p9re.R.inc(38486);for (int i = 0; (((i < iu)&&(__CLR4_4_1shvshvlb90p9re.R.iget(38487)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(38488)==0&false)); i++) {{
                __CLR4_4_1shvshvlb90p9re.R.inc(38489);angt = angbd * i / iu;
                __CLR4_4_1shvshvlb90p9re.R.inc(38490);sth = (angt + angt) / (ONE + angt * angt);
                __CLR4_4_1shvshvlb90p9re.R.inc(38491);temp = shs + angt * (angt * dhd - dhs - dhs);
                __CLR4_4_1shvshvlb90p9re.R.inc(38492);rednew = sth * (angt * dredg - sredg - HALF * sth * temp);
                __CLR4_4_1shvshvlb90p9re.R.inc(38493);if ((((rednew > redmax)&&(__CLR4_4_1shvshvlb90p9re.R.iget(38494)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(38495)==0&false))) {{
                    __CLR4_4_1shvshvlb90p9re.R.inc(38496);redmax = rednew;
                    __CLR4_4_1shvshvlb90p9re.R.inc(38497);isav = i;
                    __CLR4_4_1shvshvlb90p9re.R.inc(38498);rdprev = redsav;
                } }else {__CLR4_4_1shvshvlb90p9re.R.inc(38499);if ((((i == isav + 1)&&(__CLR4_4_1shvshvlb90p9re.R.iget(38500)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(38501)==0&false))) {{
                    __CLR4_4_1shvshvlb90p9re.R.inc(38502);rdnext = rednew;
                }
                }}__CLR4_4_1shvshvlb90p9re.R.inc(38503);redsav = rednew;
            }

            // Return if the reduction is zero. Otherwise, set the sine and cosine
            // of the angle of the alternative iteration, and calculate SDEC.

            }__CLR4_4_1shvshvlb90p9re.R.inc(38504);if ((((isav < 0)&&(__CLR4_4_1shvshvlb90p9re.R.iget(38505)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(38506)==0&false))) {{
                __CLR4_4_1shvshvlb90p9re.R.inc(38507);state = 190; __CLR4_4_1shvshvlb90p9re.R.inc(38508);break;
            }
            }__CLR4_4_1shvshvlb90p9re.R.inc(38509);if ((((isav < iu)&&(__CLR4_4_1shvshvlb90p9re.R.iget(38510)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(38511)==0&false))) {{
                __CLR4_4_1shvshvlb90p9re.R.inc(38512);temp = (rdnext - rdprev) / (redmax + redmax - rdprev - rdnext);
                __CLR4_4_1shvshvlb90p9re.R.inc(38513);angt = angbd * (isav + HALF * temp) / iu;
            }
            }__CLR4_4_1shvshvlb90p9re.R.inc(38514);cth = (ONE - angt * angt) / (ONE + angt * angt);
            __CLR4_4_1shvshvlb90p9re.R.inc(38515);sth = (angt + angt) / (ONE + angt * angt);
            __CLR4_4_1shvshvlb90p9re.R.inc(38516);temp = shs + angt * (angt * dhd - dhs - dhs);
            __CLR4_4_1shvshvlb90p9re.R.inc(38517);sdec = sth * (angt * dredg - sredg - HALF * sth * temp);
            __CLR4_4_1shvshvlb90p9re.R.inc(38518);if ((((sdec <= ZERO)&&(__CLR4_4_1shvshvlb90p9re.R.iget(38519)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(38520)==0&false))) {{
                __CLR4_4_1shvshvlb90p9re.R.inc(38521);state = 190; __CLR4_4_1shvshvlb90p9re.R.inc(38522);break;
            }

            // Update GNEW, D and HRED. If the angle of the alternative iteration
            // is restricted by a bound on a free variable, that variable is fixed
            // at the bound.

            }__CLR4_4_1shvshvlb90p9re.R.inc(38523);dredg = ZERO;
            __CLR4_4_1shvshvlb90p9re.R.inc(38524);gredsq = ZERO;
            __CLR4_4_1shvshvlb90p9re.R.inc(38525);for (int i = 0; (((i < n)&&(__CLR4_4_1shvshvlb90p9re.R.iget(38526)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(38527)==0&false)); i++) {{
                __CLR4_4_1shvshvlb90p9re.R.inc(38528);gnew.setEntry(i, gnew.getEntry(i) + (cth - ONE) * hred.getEntry(i) + sth * hs.getEntry(i));
                __CLR4_4_1shvshvlb90p9re.R.inc(38529);if ((((xbdi.getEntry(i) == ZERO)&&(__CLR4_4_1shvshvlb90p9re.R.iget(38530)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(38531)==0&false))) {{
                    __CLR4_4_1shvshvlb90p9re.R.inc(38532);trialStepPoint.setEntry(i, cth * trialStepPoint.getEntry(i) + sth * s.getEntry(i));
                    __CLR4_4_1shvshvlb90p9re.R.inc(38533);dredg += trialStepPoint.getEntry(i) * gnew.getEntry(i);
                    // Computing 2nd power
                    __CLR4_4_1shvshvlb90p9re.R.inc(38534);final double d1 = gnew.getEntry(i);
                    __CLR4_4_1shvshvlb90p9re.R.inc(38535);gredsq += d1 * d1;
                }
                }__CLR4_4_1shvshvlb90p9re.R.inc(38536);hred.setEntry(i, cth * hred.getEntry(i) + sth * hs.getEntry(i));
            }
            }__CLR4_4_1shvshvlb90p9re.R.inc(38537);qred += sdec;
            __CLR4_4_1shvshvlb90p9re.R.inc(38538);if ((((iact >= 0 && isav == iu)&&(__CLR4_4_1shvshvlb90p9re.R.iget(38539)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(38540)==0&false))) {{
                __CLR4_4_1shvshvlb90p9re.R.inc(38541);++nact;
                __CLR4_4_1shvshvlb90p9re.R.inc(38542);xbdi.setEntry(iact, xsav);
                __CLR4_4_1shvshvlb90p9re.R.inc(38543);state = 100; __CLR4_4_1shvshvlb90p9re.R.inc(38544);break;
            }

            // If SDEC is sufficiently small, then RETURN after setting XNEW to
            // XOPT+D, giving careful attention to the bounds.

            }__CLR4_4_1shvshvlb90p9re.R.inc(38545);if ((((sdec > qred * .01)&&(__CLR4_4_1shvshvlb90p9re.R.iget(38546)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(38547)==0&false))) {{
                __CLR4_4_1shvshvlb90p9re.R.inc(38548);state = 120; __CLR4_4_1shvshvlb90p9re.R.inc(38549);break;
            }
        }}
        case 190:if (!__CLB4_4_1_bool1) {__CLR4_4_1shvshvlb90p9re.R.inc(38550);__CLB4_4_1_bool1=true;} {
            __CLR4_4_1shvshvlb90p9re.R.inc(38551);printState(190); // XXX
            __CLR4_4_1shvshvlb90p9re.R.inc(38552);dsq = ZERO;
            __CLR4_4_1shvshvlb90p9re.R.inc(38553);for (int i = 0; (((i < n)&&(__CLR4_4_1shvshvlb90p9re.R.iget(38554)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(38555)==0&false)); i++) {{
                // Computing MAX
                // Computing MIN
                __CLR4_4_1shvshvlb90p9re.R.inc(38556);final double min = Math.min(trustRegionCenterOffset.getEntry(i) + trialStepPoint.getEntry(i),
                                            upperDifference.getEntry(i));
                __CLR4_4_1shvshvlb90p9re.R.inc(38557);newPoint.setEntry(i, Math.max(min, lowerDifference.getEntry(i)));
                __CLR4_4_1shvshvlb90p9re.R.inc(38558);if ((((xbdi.getEntry(i) == MINUS_ONE)&&(__CLR4_4_1shvshvlb90p9re.R.iget(38559)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(38560)==0&false))) {{
                    __CLR4_4_1shvshvlb90p9re.R.inc(38561);newPoint.setEntry(i, lowerDifference.getEntry(i));
                }
                }__CLR4_4_1shvshvlb90p9re.R.inc(38562);if ((((xbdi.getEntry(i) == ONE)&&(__CLR4_4_1shvshvlb90p9re.R.iget(38563)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(38564)==0&false))) {{
                    __CLR4_4_1shvshvlb90p9re.R.inc(38565);newPoint.setEntry(i, upperDifference.getEntry(i));
                }
                }__CLR4_4_1shvshvlb90p9re.R.inc(38566);trialStepPoint.setEntry(i, newPoint.getEntry(i) - trustRegionCenterOffset.getEntry(i));
                // Computing 2nd power
                __CLR4_4_1shvshvlb90p9re.R.inc(38567);final double d1 = trialStepPoint.getEntry(i);
                __CLR4_4_1shvshvlb90p9re.R.inc(38568);dsq += d1 * d1;
            }
            }__CLR4_4_1shvshvlb90p9re.R.inc(38569);return new double[] { dsq, crvmin };
            // The following instructions multiply the current S-vector by the second
            // derivative matrix of the quadratic model, putting the product in HS.
            // They are reached from three different parts of the software above and
            // they can be regarded as an external subroutine.
        }
        case 210:if (!__CLB4_4_1_bool1) {__CLR4_4_1shvshvlb90p9re.R.inc(38570);__CLB4_4_1_bool1=true;} {
            __CLR4_4_1shvshvlb90p9re.R.inc(38571);printState(210); // XXX
            __CLR4_4_1shvshvlb90p9re.R.inc(38572);int ih = 0;
            __CLR4_4_1shvshvlb90p9re.R.inc(38573);for (int j = 0; (((j < n)&&(__CLR4_4_1shvshvlb90p9re.R.iget(38574)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(38575)==0&false)); j++) {{
                __CLR4_4_1shvshvlb90p9re.R.inc(38576);hs.setEntry(j, ZERO);
                __CLR4_4_1shvshvlb90p9re.R.inc(38577);for (int i = 0; (((i <= j)&&(__CLR4_4_1shvshvlb90p9re.R.iget(38578)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(38579)==0&false)); i++) {{
                    __CLR4_4_1shvshvlb90p9re.R.inc(38580);if ((((i < j)&&(__CLR4_4_1shvshvlb90p9re.R.iget(38581)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(38582)==0&false))) {{
                        __CLR4_4_1shvshvlb90p9re.R.inc(38583);hs.setEntry(j, hs.getEntry(j) + modelSecondDerivativesValues.getEntry(ih) * s.getEntry(i));
                    }
                    }__CLR4_4_1shvshvlb90p9re.R.inc(38584);hs.setEntry(i, hs.getEntry(i) + modelSecondDerivativesValues.getEntry(ih) * s.getEntry(j));
                    __CLR4_4_1shvshvlb90p9re.R.inc(38585);ih++;
                }
            }}
            }__CLR4_4_1shvshvlb90p9re.R.inc(38586);final RealVector tmp = interpolationPoints.operate(s).ebeMultiply(modelSecondDerivativesParameters);
            __CLR4_4_1shvshvlb90p9re.R.inc(38587);for (int k = 0; (((k < npt)&&(__CLR4_4_1shvshvlb90p9re.R.iget(38588)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(38589)==0&false)); k++) {{
                __CLR4_4_1shvshvlb90p9re.R.inc(38590);if ((((modelSecondDerivativesParameters.getEntry(k) != ZERO)&&(__CLR4_4_1shvshvlb90p9re.R.iget(38591)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(38592)==0&false))) {{
                    __CLR4_4_1shvshvlb90p9re.R.inc(38593);for (int i = 0; (((i < n)&&(__CLR4_4_1shvshvlb90p9re.R.iget(38594)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(38595)==0&false)); i++) {{
                        __CLR4_4_1shvshvlb90p9re.R.inc(38596);hs.setEntry(i, hs.getEntry(i) + tmp.getEntry(k) * interpolationPoints.getEntry(k, i));
                    }
                }}
            }}
            }__CLR4_4_1shvshvlb90p9re.R.inc(38597);if ((((crvmin != ZERO)&&(__CLR4_4_1shvshvlb90p9re.R.iget(38598)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(38599)==0&false))) {{
                __CLR4_4_1shvshvlb90p9re.R.inc(38600);state = 50; __CLR4_4_1shvshvlb90p9re.R.inc(38601);break;
            }
            }__CLR4_4_1shvshvlb90p9re.R.inc(38602);if ((((iterc > itcsav)&&(__CLR4_4_1shvshvlb90p9re.R.iget(38603)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(38604)==0&false))) {{
                __CLR4_4_1shvshvlb90p9re.R.inc(38605);state = 150; __CLR4_4_1shvshvlb90p9re.R.inc(38606);break;
            }
            }__CLR4_4_1shvshvlb90p9re.R.inc(38607);for (int i = 0; (((i < n)&&(__CLR4_4_1shvshvlb90p9re.R.iget(38608)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(38609)==0&false)); i++) {{
                __CLR4_4_1shvshvlb90p9re.R.inc(38610);hred.setEntry(i, hs.getEntry(i));
            }
            }__CLR4_4_1shvshvlb90p9re.R.inc(38611);state = 120; __CLR4_4_1shvshvlb90p9re.R.inc(38612);break;
        }
        default:if (!__CLB4_4_1_bool1) {__CLR4_4_1shvshvlb90p9re.R.inc(38613);__CLB4_4_1_bool1=true;} {
            __CLR4_4_1shvshvlb90p9re.R.inc(38614);throw new MathIllegalStateException(LocalizedFormats.SIMPLE_MESSAGE, "trsbox");
        }}
        }
    }}finally{__CLR4_4_1shvshvlb90p9re.R.flushNeeded();}} // trsbox

    // ----------------------------------------------------------------------------------------

    /**
     *     The arrays BMAT and ZMAT are updated, as required by the new position
     *     of the interpolation point that has the index KNEW. The vector VLAG has
     *     N+NPT components, set on entry to the first NPT and last N components
     *     of the product Hw in equation (4.11) of the Powell (2006) paper on
     *     NEWUOA. Further, BETA is set on entry to the value of the parameter
     *     with that name, and DENOM is set to the denominator of the updating
     *     formula. Elements of ZMAT may be treated as zero if their moduli are
     *     at most ZTEST. The first NDIM elements of W are used for working space.
     * @param beta
     * @param denom
     * @param knew
     */
    private void update(
            double beta,
            double denom,
            int knew
    ) {try{__CLR4_4_1shvshvlb90p9re.R.inc(38615);
        __CLR4_4_1shvshvlb90p9re.R.inc(38616);printMethod(); // XXX

        __CLR4_4_1shvshvlb90p9re.R.inc(38617);final int n = currentBest.getDimension();
        __CLR4_4_1shvshvlb90p9re.R.inc(38618);final int npt = numberOfInterpolationPoints;
        __CLR4_4_1shvshvlb90p9re.R.inc(38619);final int nptm = npt - n - 1;

        // XXX Should probably be split into two arrays.
        __CLR4_4_1shvshvlb90p9re.R.inc(38620);final ArrayRealVector work = new ArrayRealVector(npt + n);

        __CLR4_4_1shvshvlb90p9re.R.inc(38621);double ztest = ZERO;
        __CLR4_4_1shvshvlb90p9re.R.inc(38622);for (int k = 0; (((k < npt)&&(__CLR4_4_1shvshvlb90p9re.R.iget(38623)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(38624)==0&false)); k++) {{
            __CLR4_4_1shvshvlb90p9re.R.inc(38625);for (int j = 0; (((j < nptm)&&(__CLR4_4_1shvshvlb90p9re.R.iget(38626)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(38627)==0&false)); j++) {{
                // Computing MAX
                __CLR4_4_1shvshvlb90p9re.R.inc(38628);ztest = Math.max(ztest, Math.abs(zMatrix.getEntry(k, j)));
            }
        }}
        }__CLR4_4_1shvshvlb90p9re.R.inc(38629);ztest *= 1e-20;

        // Apply the rotations that put zeros in the KNEW-th row of ZMAT.

        __CLR4_4_1shvshvlb90p9re.R.inc(38630);for (int j = 1; (((j < nptm)&&(__CLR4_4_1shvshvlb90p9re.R.iget(38631)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(38632)==0&false)); j++) {{
            __CLR4_4_1shvshvlb90p9re.R.inc(38633);final double d1 = zMatrix.getEntry(knew, j);
            __CLR4_4_1shvshvlb90p9re.R.inc(38634);if ((((Math.abs(d1) > ztest)&&(__CLR4_4_1shvshvlb90p9re.R.iget(38635)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(38636)==0&false))) {{
                // Computing 2nd power
                __CLR4_4_1shvshvlb90p9re.R.inc(38637);final double d2 = zMatrix.getEntry(knew, 0);
                // Computing 2nd power
                __CLR4_4_1shvshvlb90p9re.R.inc(38638);final double d3 = zMatrix.getEntry(knew, j);
                __CLR4_4_1shvshvlb90p9re.R.inc(38639);final double d4 = Math.sqrt(d2 * d2 + d3 * d3);
                __CLR4_4_1shvshvlb90p9re.R.inc(38640);final double d5 = zMatrix.getEntry(knew, 0) / d4;
                __CLR4_4_1shvshvlb90p9re.R.inc(38641);final double d6 = zMatrix.getEntry(knew, j) / d4;
                __CLR4_4_1shvshvlb90p9re.R.inc(38642);for (int i = 0; (((i < npt)&&(__CLR4_4_1shvshvlb90p9re.R.iget(38643)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(38644)==0&false)); i++) {{
                    __CLR4_4_1shvshvlb90p9re.R.inc(38645);final double d7 = d5 * zMatrix.getEntry(i, 0) + d6 * zMatrix.getEntry(i, j);
                    __CLR4_4_1shvshvlb90p9re.R.inc(38646);zMatrix.setEntry(i, j, d5 * zMatrix.getEntry(i, j) - d6 * zMatrix.getEntry(i, 0));
                    __CLR4_4_1shvshvlb90p9re.R.inc(38647);zMatrix.setEntry(i, 0, d7);
                }
            }}
            }__CLR4_4_1shvshvlb90p9re.R.inc(38648);zMatrix.setEntry(knew, j, ZERO);
        }

        // Put the first NPT components of the KNEW-th column of HLAG into W,
        // and calculate the parameters of the updating formula.

        }__CLR4_4_1shvshvlb90p9re.R.inc(38649);for (int i = 0; (((i < npt)&&(__CLR4_4_1shvshvlb90p9re.R.iget(38650)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(38651)==0&false)); i++) {{
            __CLR4_4_1shvshvlb90p9re.R.inc(38652);work.setEntry(i, zMatrix.getEntry(knew, 0) * zMatrix.getEntry(i, 0));
        }
        }__CLR4_4_1shvshvlb90p9re.R.inc(38653);final double alpha = work.getEntry(knew);
        __CLR4_4_1shvshvlb90p9re.R.inc(38654);final double tau = lagrangeValuesAtNewPoint.getEntry(knew);
        __CLR4_4_1shvshvlb90p9re.R.inc(38655);lagrangeValuesAtNewPoint.setEntry(knew, lagrangeValuesAtNewPoint.getEntry(knew) - ONE);

        // Complete the updating of ZMAT.

        __CLR4_4_1shvshvlb90p9re.R.inc(38656);final double sqrtDenom = Math.sqrt(denom);
        __CLR4_4_1shvshvlb90p9re.R.inc(38657);final double d1 = tau / sqrtDenom;
        __CLR4_4_1shvshvlb90p9re.R.inc(38658);final double d2 = zMatrix.getEntry(knew, 0) / sqrtDenom;
        __CLR4_4_1shvshvlb90p9re.R.inc(38659);for (int i = 0; (((i < npt)&&(__CLR4_4_1shvshvlb90p9re.R.iget(38660)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(38661)==0&false)); i++) {{
            __CLR4_4_1shvshvlb90p9re.R.inc(38662);zMatrix.setEntry(i, 0,
                          d1 * zMatrix.getEntry(i, 0) - d2 * lagrangeValuesAtNewPoint.getEntry(i));
        }

        // Finally, update the matrix BMAT.

        }__CLR4_4_1shvshvlb90p9re.R.inc(38663);for (int j = 0; (((j < n)&&(__CLR4_4_1shvshvlb90p9re.R.iget(38664)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(38665)==0&false)); j++) {{
            __CLR4_4_1shvshvlb90p9re.R.inc(38666);final int jp = npt + j;
            __CLR4_4_1shvshvlb90p9re.R.inc(38667);work.setEntry(jp, bMatrix.getEntry(knew, j));
            __CLR4_4_1shvshvlb90p9re.R.inc(38668);final double d3 = (alpha * lagrangeValuesAtNewPoint.getEntry(jp) - tau * work.getEntry(jp)) / denom;
            __CLR4_4_1shvshvlb90p9re.R.inc(38669);final double d4 = (-beta * work.getEntry(jp) - tau * lagrangeValuesAtNewPoint.getEntry(jp)) / denom;
            __CLR4_4_1shvshvlb90p9re.R.inc(38670);for (int i = 0; (((i <= jp)&&(__CLR4_4_1shvshvlb90p9re.R.iget(38671)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(38672)==0&false)); i++) {{
                __CLR4_4_1shvshvlb90p9re.R.inc(38673);bMatrix.setEntry(i, j,
                              bMatrix.getEntry(i, j) + d3 * lagrangeValuesAtNewPoint.getEntry(i) + d4 * work.getEntry(i));
                __CLR4_4_1shvshvlb90p9re.R.inc(38674);if ((((i >= npt)&&(__CLR4_4_1shvshvlb90p9re.R.iget(38675)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(38676)==0&false))) {{
                    __CLR4_4_1shvshvlb90p9re.R.inc(38677);bMatrix.setEntry(jp, (i - npt), bMatrix.getEntry(i, j));
                }
            }}
        }}
    }}finally{__CLR4_4_1shvshvlb90p9re.R.flushNeeded();}} // update

    /**
     * Performs validity checks.
     *
     * @param lowerBound Lower bounds (constraints) of the objective variables.
     * @param upperBound Upperer bounds (constraints) of the objective variables.
     */
    private void setup(double[] lowerBound,
                       double[] upperBound) {try{__CLR4_4_1shvshvlb90p9re.R.inc(38678);
        __CLR4_4_1shvshvlb90p9re.R.inc(38679);printMethod(); // XXX

        __CLR4_4_1shvshvlb90p9re.R.inc(38680);double[] init = getStartPoint();
        __CLR4_4_1shvshvlb90p9re.R.inc(38681);final int dimension = init.length;

        // Check problem dimension.
        __CLR4_4_1shvshvlb90p9re.R.inc(38682);if ((((dimension < MINIMUM_PROBLEM_DIMENSION)&&(__CLR4_4_1shvshvlb90p9re.R.iget(38683)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(38684)==0&false))) {{
            __CLR4_4_1shvshvlb90p9re.R.inc(38685);throw new NumberIsTooSmallException(dimension, MINIMUM_PROBLEM_DIMENSION, true);
        }
        // Check number of interpolation points.
        }__CLR4_4_1shvshvlb90p9re.R.inc(38686);final int[] nPointsInterval = { dimension + 2, (dimension + 2) * (dimension + 1) / 2 };
        __CLR4_4_1shvshvlb90p9re.R.inc(38687);if ((((numberOfInterpolationPoints < nPointsInterval[0] ||
            numberOfInterpolationPoints > nPointsInterval[1])&&(__CLR4_4_1shvshvlb90p9re.R.iget(38688)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(38689)==0&false))) {{
            __CLR4_4_1shvshvlb90p9re.R.inc(38690);throw new OutOfRangeException(LocalizedFormats.NUMBER_OF_INTERPOLATION_POINTS,
                                          numberOfInterpolationPoints,
                                          nPointsInterval[0],
                                          nPointsInterval[1]);
        }

        // Initialize bound differences.
        }__CLR4_4_1shvshvlb90p9re.R.inc(38691);boundDifference = new double[dimension];

        __CLR4_4_1shvshvlb90p9re.R.inc(38692);double requiredMinDiff = 2 * initialTrustRegionRadius;
        __CLR4_4_1shvshvlb90p9re.R.inc(38693);double minDiff = Double.POSITIVE_INFINITY;
        __CLR4_4_1shvshvlb90p9re.R.inc(38694);for (int i = 0; (((i < dimension)&&(__CLR4_4_1shvshvlb90p9re.R.iget(38695)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(38696)==0&false)); i++) {{
            __CLR4_4_1shvshvlb90p9re.R.inc(38697);boundDifference[i] = upperBound[i] - lowerBound[i];
            __CLR4_4_1shvshvlb90p9re.R.inc(38698);minDiff = Math.min(minDiff, boundDifference[i]);
        }
        }__CLR4_4_1shvshvlb90p9re.R.inc(38699);if ((((minDiff < requiredMinDiff)&&(__CLR4_4_1shvshvlb90p9re.R.iget(38700)!=0|true))||(__CLR4_4_1shvshvlb90p9re.R.iget(38701)==0&false))) {{
            __CLR4_4_1shvshvlb90p9re.R.inc(38702);initialTrustRegionRadius = minDiff / 3.0;
        }

        // Initialize the data structures used by the "bobyqa" method.
        }__CLR4_4_1shvshvlb90p9re.R.inc(38703);bMatrix = new Array2DRowRealMatrix(dimension + numberOfInterpolationPoints,
                                           dimension);
        __CLR4_4_1shvshvlb90p9re.R.inc(38704);zMatrix = new Array2DRowRealMatrix(numberOfInterpolationPoints,
                                           numberOfInterpolationPoints - dimension - 1);
        __CLR4_4_1shvshvlb90p9re.R.inc(38705);interpolationPoints = new Array2DRowRealMatrix(numberOfInterpolationPoints,
                                                       dimension);
        __CLR4_4_1shvshvlb90p9re.R.inc(38706);originShift = new ArrayRealVector(dimension);
        __CLR4_4_1shvshvlb90p9re.R.inc(38707);fAtInterpolationPoints = new ArrayRealVector(numberOfInterpolationPoints);
        __CLR4_4_1shvshvlb90p9re.R.inc(38708);trustRegionCenterOffset = new ArrayRealVector(dimension);
        __CLR4_4_1shvshvlb90p9re.R.inc(38709);gradientAtTrustRegionCenter = new ArrayRealVector(dimension);
        __CLR4_4_1shvshvlb90p9re.R.inc(38710);lowerDifference = new ArrayRealVector(dimension);
        __CLR4_4_1shvshvlb90p9re.R.inc(38711);upperDifference = new ArrayRealVector(dimension);
        __CLR4_4_1shvshvlb90p9re.R.inc(38712);modelSecondDerivativesParameters = new ArrayRealVector(numberOfInterpolationPoints);
        __CLR4_4_1shvshvlb90p9re.R.inc(38713);newPoint = new ArrayRealVector(dimension);
        __CLR4_4_1shvshvlb90p9re.R.inc(38714);alternativeNewPoint = new ArrayRealVector(dimension);
        __CLR4_4_1shvshvlb90p9re.R.inc(38715);trialStepPoint = new ArrayRealVector(dimension);
        __CLR4_4_1shvshvlb90p9re.R.inc(38716);lagrangeValuesAtNewPoint = new ArrayRealVector(dimension + numberOfInterpolationPoints);
        __CLR4_4_1shvshvlb90p9re.R.inc(38717);modelSecondDerivativesValues = new ArrayRealVector(dimension * (dimension + 1) / 2);
    }finally{__CLR4_4_1shvshvlb90p9re.R.flushNeeded();}}

    // XXX utility for figuring out call sequence.
    private static String caller(int n) {try{__CLR4_4_1shvshvlb90p9re.R.inc(38718);
        __CLR4_4_1shvshvlb90p9re.R.inc(38719);final Throwable t = new Throwable();
        __CLR4_4_1shvshvlb90p9re.R.inc(38720);final StackTraceElement[] elements = t.getStackTrace();
        __CLR4_4_1shvshvlb90p9re.R.inc(38721);final StackTraceElement e = elements[n];
        __CLR4_4_1shvshvlb90p9re.R.inc(38722);return e.getMethodName() + " (at line " + e.getLineNumber() + ")";
    }finally{__CLR4_4_1shvshvlb90p9re.R.flushNeeded();}}
    // XXX utility for figuring out call sequence.
    private static void printState(int s) {try{__CLR4_4_1shvshvlb90p9re.R.inc(38723);
        //        System.out.println(caller(2) + ": state " + s);
    }finally{__CLR4_4_1shvshvlb90p9re.R.flushNeeded();}}
    // XXX utility for figuring out call sequence.
    private static void printMethod() {try{__CLR4_4_1shvshvlb90p9re.R.inc(38724);
        //        System.out.println(caller(2));
    }finally{__CLR4_4_1shvshvlb90p9re.R.flushNeeded();}}

    /**
     * Marker for code paths that are not explored with the current unit tests.
     * If the path becomes explored, it should just be removed from the code.
     */
    private static class PathIsExploredException extends RuntimeException {
        private static final long serialVersionUID = 745350979634801853L;

        private static final String PATH_IS_EXPLORED
            = "If this exception is thrown, just remove it from the code";

        PathIsExploredException() {
            super(PATH_IS_EXPLORED + " " + BOBYQAOptimizer.caller(3));__CLR4_4_1shvshvlb90p9re.R.inc(38726);try{__CLR4_4_1shvshvlb90p9re.R.inc(38725);
        }finally{__CLR4_4_1shvshvlb90p9re.R.flushNeeded();}}
    }
}
//CHECKSTYLE: resume all
