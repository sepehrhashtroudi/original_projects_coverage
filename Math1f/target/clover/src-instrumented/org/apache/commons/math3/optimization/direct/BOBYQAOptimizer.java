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

package org.apache.commons.math3.optimization.direct;

import org.apache.commons.math3.analysis.MultivariateFunction;
import org.apache.commons.math3.exception.MathIllegalStateException;
import org.apache.commons.math3.exception.NumberIsTooSmallException;
import org.apache.commons.math3.exception.OutOfRangeException;
import org.apache.commons.math3.exception.util.LocalizedFormats;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.ArrayRealVector;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.optimization.GoalType;
import org.apache.commons.math3.optimization.PointValuePair;
import org.apache.commons.math3.optimization.MultivariateOptimizer;

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
 * @deprecated As of 3.1 (to be removed in 4.0).
 * @since 3.0
 */
@java.lang.SuppressWarnings({"fallthrough"}) @Deprecated
public class BOBYQAOptimizer
    extends BaseAbstractMultivariateSimpleBoundsOptimizer<MultivariateFunction>
    implements MultivariateOptimizer {public static class __CLR4_4_1w1vw1vlb90pa0k{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,43335,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
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
             DEFAULT_STOPPING_RADIUS);__CLR4_4_1w1vw1vlb90pa0k.R.inc(41540);try{__CLR4_4_1w1vw1vlb90pa0k.R.inc(41539);
    }finally{__CLR4_4_1w1vw1vlb90pa0k.R.flushNeeded();}}

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
        super(null);__CLR4_4_1w1vw1vlb90pa0k.R.inc(41542);try{__CLR4_4_1w1vw1vlb90pa0k.R.inc(41541); // No custom convergence criterion.
        __CLR4_4_1w1vw1vlb90pa0k.R.inc(41543);this.numberOfInterpolationPoints = numberOfInterpolationPoints;
        __CLR4_4_1w1vw1vlb90pa0k.R.inc(41544);this.initialTrustRegionRadius = initialTrustRegionRadius;
        __CLR4_4_1w1vw1vlb90pa0k.R.inc(41545);this.stoppingTrustRegionRadius = stoppingTrustRegionRadius;
    }finally{__CLR4_4_1w1vw1vlb90pa0k.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    protected PointValuePair doOptimize() {try{__CLR4_4_1w1vw1vlb90pa0k.R.inc(41546);
        __CLR4_4_1w1vw1vlb90pa0k.R.inc(41547);final double[] lowerBound = getLowerBound();
        __CLR4_4_1w1vw1vlb90pa0k.R.inc(41548);final double[] upperBound = getUpperBound();

        // Validity checks.
        __CLR4_4_1w1vw1vlb90pa0k.R.inc(41549);setup(lowerBound, upperBound);

        __CLR4_4_1w1vw1vlb90pa0k.R.inc(41550);isMinimize = (getGoalType() == GoalType.MINIMIZE);
        __CLR4_4_1w1vw1vlb90pa0k.R.inc(41551);currentBest = new ArrayRealVector(getStartPoint());

        __CLR4_4_1w1vw1vlb90pa0k.R.inc(41552);final double value = bobyqa(lowerBound, upperBound);

        __CLR4_4_1w1vw1vlb90pa0k.R.inc(41553);return new PointValuePair(currentBest.getDataRef(),
                                      (((isMinimize )&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(41554)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(41555)==0&false))? value : -value);
    }finally{__CLR4_4_1w1vw1vlb90pa0k.R.flushNeeded();}}

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
                          double[] upperBound) {try{__CLR4_4_1w1vw1vlb90pa0k.R.inc(41556);
        __CLR4_4_1w1vw1vlb90pa0k.R.inc(41557);printMethod(); // XXX

        __CLR4_4_1w1vw1vlb90pa0k.R.inc(41558);final int n = currentBest.getDimension();

        // Return if there is insufficient space between the bounds. Modify the
        // initial X if necessary in order to avoid conflicts between the bounds
        // and the construction of the first quadratic model. The lower and upper
        // bounds on moves from the updated X are set now, in the ISL and ISU
        // partitions of W, in order to provide useful and exact information about
        // components of X that become within distance RHOBEG from their bounds.

        __CLR4_4_1w1vw1vlb90pa0k.R.inc(41559);for (int j = 0; (((j < n)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(41560)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(41561)==0&false)); j++) {{
            __CLR4_4_1w1vw1vlb90pa0k.R.inc(41562);final double boundDiff = boundDifference[j];
            __CLR4_4_1w1vw1vlb90pa0k.R.inc(41563);lowerDifference.setEntry(j, lowerBound[j] - currentBest.getEntry(j));
            __CLR4_4_1w1vw1vlb90pa0k.R.inc(41564);upperDifference.setEntry(j, upperBound[j] - currentBest.getEntry(j));
            __CLR4_4_1w1vw1vlb90pa0k.R.inc(41565);if ((((lowerDifference.getEntry(j) >= -initialTrustRegionRadius)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(41566)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(41567)==0&false))) {{
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(41568);if ((((lowerDifference.getEntry(j) >= ZERO)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(41569)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(41570)==0&false))) {{
                    __CLR4_4_1w1vw1vlb90pa0k.R.inc(41571);currentBest.setEntry(j, lowerBound[j]);
                    __CLR4_4_1w1vw1vlb90pa0k.R.inc(41572);lowerDifference.setEntry(j, ZERO);
                    __CLR4_4_1w1vw1vlb90pa0k.R.inc(41573);upperDifference.setEntry(j, boundDiff);
                } }else {{
                    __CLR4_4_1w1vw1vlb90pa0k.R.inc(41574);currentBest.setEntry(j, lowerBound[j] + initialTrustRegionRadius);
                    __CLR4_4_1w1vw1vlb90pa0k.R.inc(41575);lowerDifference.setEntry(j, -initialTrustRegionRadius);
                    // Computing MAX
                    __CLR4_4_1w1vw1vlb90pa0k.R.inc(41576);final double deltaOne = upperBound[j] - currentBest.getEntry(j);
                    __CLR4_4_1w1vw1vlb90pa0k.R.inc(41577);upperDifference.setEntry(j, Math.max(deltaOne, initialTrustRegionRadius));
                }
            }} }else {__CLR4_4_1w1vw1vlb90pa0k.R.inc(41578);if ((((upperDifference.getEntry(j) <= initialTrustRegionRadius)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(41579)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(41580)==0&false))) {{
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(41581);if ((((upperDifference.getEntry(j) <= ZERO)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(41582)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(41583)==0&false))) {{
                    __CLR4_4_1w1vw1vlb90pa0k.R.inc(41584);currentBest.setEntry(j, upperBound[j]);
                    __CLR4_4_1w1vw1vlb90pa0k.R.inc(41585);lowerDifference.setEntry(j, -boundDiff);
                    __CLR4_4_1w1vw1vlb90pa0k.R.inc(41586);upperDifference.setEntry(j, ZERO);
                } }else {{
                    __CLR4_4_1w1vw1vlb90pa0k.R.inc(41587);currentBest.setEntry(j, upperBound[j] - initialTrustRegionRadius);
                    // Computing MIN
                    __CLR4_4_1w1vw1vlb90pa0k.R.inc(41588);final double deltaOne = lowerBound[j] - currentBest.getEntry(j);
                    __CLR4_4_1w1vw1vlb90pa0k.R.inc(41589);final double deltaTwo = -initialTrustRegionRadius;
                    __CLR4_4_1w1vw1vlb90pa0k.R.inc(41590);lowerDifference.setEntry(j, Math.min(deltaOne, deltaTwo));
                    __CLR4_4_1w1vw1vlb90pa0k.R.inc(41591);upperDifference.setEntry(j, initialTrustRegionRadius);
                }
            }}
        }}}

        // Make the call of BOBYQB.

        }__CLR4_4_1w1vw1vlb90pa0k.R.inc(41592);return bobyqb(lowerBound, upperBound);
    }finally{__CLR4_4_1w1vw1vlb90pa0k.R.flushNeeded();}} // bobyqa

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
                          double[] upperBound) {try{__CLR4_4_1w1vw1vlb90pa0k.R.inc(41593);
        __CLR4_4_1w1vw1vlb90pa0k.R.inc(41594);printMethod(); // XXX

        __CLR4_4_1w1vw1vlb90pa0k.R.inc(41595);final int n = currentBest.getDimension();
        __CLR4_4_1w1vw1vlb90pa0k.R.inc(41596);final int npt = numberOfInterpolationPoints;
        __CLR4_4_1w1vw1vlb90pa0k.R.inc(41597);final int np = n + 1;
        __CLR4_4_1w1vw1vlb90pa0k.R.inc(41598);final int nptm = npt - np;
        __CLR4_4_1w1vw1vlb90pa0k.R.inc(41599);final int nh = n * np / 2;

        __CLR4_4_1w1vw1vlb90pa0k.R.inc(41600);final ArrayRealVector work1 = new ArrayRealVector(n);
        __CLR4_4_1w1vw1vlb90pa0k.R.inc(41601);final ArrayRealVector work2 = new ArrayRealVector(npt);
        __CLR4_4_1w1vw1vlb90pa0k.R.inc(41602);final ArrayRealVector work3 = new ArrayRealVector(npt);

        __CLR4_4_1w1vw1vlb90pa0k.R.inc(41603);double cauchy = Double.NaN;
        __CLR4_4_1w1vw1vlb90pa0k.R.inc(41604);double alpha = Double.NaN;
        __CLR4_4_1w1vw1vlb90pa0k.R.inc(41605);double dsq = Double.NaN;
        __CLR4_4_1w1vw1vlb90pa0k.R.inc(41606);double crvmin = Double.NaN;

        // Set some constants.
        // Parameter adjustments

        // Function Body

        // The call of PRELIM sets the elements of XBASE, XPT, FVAL, GOPT, HQ, PQ,
        // BMAT and ZMAT for the first iteration, with the corresponding values of
        // of NF and KOPT, which are the number of calls of CALFUN so far and the
        // index of the interpolation point at the trust region centre. Then the
        // initial XOPT is set too. The branch to label 720 occurs if MAXFUN is
        // less than NPT. GOPT will be updated if KOPT is different from KBASE.

        __CLR4_4_1w1vw1vlb90pa0k.R.inc(41607);trustRegionCenterInterpolationPointIndex = 0;

        __CLR4_4_1w1vw1vlb90pa0k.R.inc(41608);prelim(lowerBound, upperBound);
        __CLR4_4_1w1vw1vlb90pa0k.R.inc(41609);double xoptsq = ZERO;
        __CLR4_4_1w1vw1vlb90pa0k.R.inc(41610);for (int i = 0; (((i < n)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(41611)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(41612)==0&false)); i++) {{
            __CLR4_4_1w1vw1vlb90pa0k.R.inc(41613);trustRegionCenterOffset.setEntry(i, interpolationPoints.getEntry(trustRegionCenterInterpolationPointIndex, i));
            // Computing 2nd power
            __CLR4_4_1w1vw1vlb90pa0k.R.inc(41614);final double deltaOne = trustRegionCenterOffset.getEntry(i);
            __CLR4_4_1w1vw1vlb90pa0k.R.inc(41615);xoptsq += deltaOne * deltaOne;
        }
        }__CLR4_4_1w1vw1vlb90pa0k.R.inc(41616);double fsave = fAtInterpolationPoints.getEntry(0);
        __CLR4_4_1w1vw1vlb90pa0k.R.inc(41617);final int kbase = 0;

        // Complete the settings that are required for the iterative procedure.

        __CLR4_4_1w1vw1vlb90pa0k.R.inc(41618);int ntrits = 0;
        __CLR4_4_1w1vw1vlb90pa0k.R.inc(41619);int itest = 0;
        __CLR4_4_1w1vw1vlb90pa0k.R.inc(41620);int knew = 0;
        __CLR4_4_1w1vw1vlb90pa0k.R.inc(41621);int nfsav = getEvaluations();
        __CLR4_4_1w1vw1vlb90pa0k.R.inc(41622);double rho = initialTrustRegionRadius;
        __CLR4_4_1w1vw1vlb90pa0k.R.inc(41623);double delta = rho;
        __CLR4_4_1w1vw1vlb90pa0k.R.inc(41624);double diffa = ZERO;
        __CLR4_4_1w1vw1vlb90pa0k.R.inc(41625);double diffb = ZERO;
        __CLR4_4_1w1vw1vlb90pa0k.R.inc(41626);double diffc = ZERO;
        __CLR4_4_1w1vw1vlb90pa0k.R.inc(41627);double f = ZERO;
        __CLR4_4_1w1vw1vlb90pa0k.R.inc(41628);double beta = ZERO;
        __CLR4_4_1w1vw1vlb90pa0k.R.inc(41629);double adelt = ZERO;
        __CLR4_4_1w1vw1vlb90pa0k.R.inc(41630);double denom = ZERO;
        __CLR4_4_1w1vw1vlb90pa0k.R.inc(41631);double ratio = ZERO;
        __CLR4_4_1w1vw1vlb90pa0k.R.inc(41632);double dnorm = ZERO;
        __CLR4_4_1w1vw1vlb90pa0k.R.inc(41633);double scaden = ZERO;
        __CLR4_4_1w1vw1vlb90pa0k.R.inc(41634);double biglsq = ZERO;
        __CLR4_4_1w1vw1vlb90pa0k.R.inc(41635);double distsq = ZERO;

        // Update GOPT if necessary before the first iteration and after each
        // call of RESCUE that makes a call of CALFUN.

        __CLR4_4_1w1vw1vlb90pa0k.R.inc(41636);int state = 20;
        __CLR4_4_1w1vw1vlb90pa0k.R.inc(41637);for(;;) {boolean __CLB4_4_1_bool0=false;__CLR4_4_1w1vw1vlb90pa0k.R.inc(41638);switch (state) {
        case 20:if (!__CLB4_4_1_bool0) {__CLR4_4_1w1vw1vlb90pa0k.R.inc(41639);__CLB4_4_1_bool0=true;} {
            __CLR4_4_1w1vw1vlb90pa0k.R.inc(41640);printState(20); // XXX
            __CLR4_4_1w1vw1vlb90pa0k.R.inc(41641);if ((((trustRegionCenterInterpolationPointIndex != kbase)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(41642)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(41643)==0&false))) {{
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(41644);int ih = 0;
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(41645);for (int j = 0; (((j < n)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(41646)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(41647)==0&false)); j++) {{
                    __CLR4_4_1w1vw1vlb90pa0k.R.inc(41648);for (int i = 0; (((i <= j)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(41649)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(41650)==0&false)); i++) {{
                        __CLR4_4_1w1vw1vlb90pa0k.R.inc(41651);if ((((i < j)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(41652)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(41653)==0&false))) {{
                            __CLR4_4_1w1vw1vlb90pa0k.R.inc(41654);gradientAtTrustRegionCenter.setEntry(j,  gradientAtTrustRegionCenter.getEntry(j) + modelSecondDerivativesValues.getEntry(ih) * trustRegionCenterOffset.getEntry(i));
                        }
                        }__CLR4_4_1w1vw1vlb90pa0k.R.inc(41655);gradientAtTrustRegionCenter.setEntry(i,  gradientAtTrustRegionCenter.getEntry(i) + modelSecondDerivativesValues.getEntry(ih) * trustRegionCenterOffset.getEntry(j));
                        __CLR4_4_1w1vw1vlb90pa0k.R.inc(41656);ih++;
                    }
                }}
                }__CLR4_4_1w1vw1vlb90pa0k.R.inc(41657);if ((((getEvaluations() > npt)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(41658)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(41659)==0&false))) {{
                    __CLR4_4_1w1vw1vlb90pa0k.R.inc(41660);for (int k = 0; (((k < npt)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(41661)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(41662)==0&false)); k++) {{
                        __CLR4_4_1w1vw1vlb90pa0k.R.inc(41663);double temp = ZERO;
                        __CLR4_4_1w1vw1vlb90pa0k.R.inc(41664);for (int j = 0; (((j < n)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(41665)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(41666)==0&false)); j++) {{
                            __CLR4_4_1w1vw1vlb90pa0k.R.inc(41667);temp += interpolationPoints.getEntry(k, j) * trustRegionCenterOffset.getEntry(j);
                        }
                        }__CLR4_4_1w1vw1vlb90pa0k.R.inc(41668);temp *= modelSecondDerivativesParameters.getEntry(k);
                        __CLR4_4_1w1vw1vlb90pa0k.R.inc(41669);for (int i = 0; (((i < n)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(41670)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(41671)==0&false)); i++) {{
                            __CLR4_4_1w1vw1vlb90pa0k.R.inc(41672);gradientAtTrustRegionCenter.setEntry(i, gradientAtTrustRegionCenter.getEntry(i) + temp * interpolationPoints.getEntry(k, i));
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
        case 60:if (!__CLB4_4_1_bool0) {__CLR4_4_1w1vw1vlb90pa0k.R.inc(41673);__CLB4_4_1_bool0=true;} {
            __CLR4_4_1w1vw1vlb90pa0k.R.inc(41674);printState(60); // XXX
            __CLR4_4_1w1vw1vlb90pa0k.R.inc(41675);final ArrayRealVector gnew = new ArrayRealVector(n);
            __CLR4_4_1w1vw1vlb90pa0k.R.inc(41676);final ArrayRealVector xbdi = new ArrayRealVector(n);
            __CLR4_4_1w1vw1vlb90pa0k.R.inc(41677);final ArrayRealVector s = new ArrayRealVector(n);
            __CLR4_4_1w1vw1vlb90pa0k.R.inc(41678);final ArrayRealVector hs = new ArrayRealVector(n);
            __CLR4_4_1w1vw1vlb90pa0k.R.inc(41679);final ArrayRealVector hred = new ArrayRealVector(n);

            __CLR4_4_1w1vw1vlb90pa0k.R.inc(41680);final double[] dsqCrvmin = trsbox(delta, gnew, xbdi, s,
                                              hs, hred);
            __CLR4_4_1w1vw1vlb90pa0k.R.inc(41681);dsq = dsqCrvmin[0];
            __CLR4_4_1w1vw1vlb90pa0k.R.inc(41682);crvmin = dsqCrvmin[1];

            // Computing MIN
            __CLR4_4_1w1vw1vlb90pa0k.R.inc(41683);double deltaOne = delta;
            __CLR4_4_1w1vw1vlb90pa0k.R.inc(41684);double deltaTwo = Math.sqrt(dsq);
            __CLR4_4_1w1vw1vlb90pa0k.R.inc(41685);dnorm = Math.min(deltaOne, deltaTwo);
            __CLR4_4_1w1vw1vlb90pa0k.R.inc(41686);if ((((dnorm < HALF * rho)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(41687)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(41688)==0&false))) {{
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(41689);ntrits = -1;
                // Computing 2nd power
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(41690);deltaOne = TEN * rho;
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(41691);distsq = deltaOne * deltaOne;
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(41692);if ((((getEvaluations() <= nfsav + 2)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(41693)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(41694)==0&false))) {{
                    __CLR4_4_1w1vw1vlb90pa0k.R.inc(41695);state = 650; __CLR4_4_1w1vw1vlb90pa0k.R.inc(41696);break;
                }

                // The following choice between labels 650 and 680 depends on whether or
                // not our work with the current RHO seems to be complete. Either RHO is
                // decreased or termination occurs if the errors in the quadratic model at
                // the last three interpolation points compare favourably with predictions
                // of likely improvements to the model within distance HALF*RHO of XOPT.

                // Computing MAX
                }__CLR4_4_1w1vw1vlb90pa0k.R.inc(41697);deltaOne = Math.max(diffa, diffb);
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(41698);final double errbig = Math.max(deltaOne, diffc);
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(41699);final double frhosq = rho * ONE_OVER_EIGHT * rho;
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(41700);if ((((crvmin > ZERO &&
                    errbig > frhosq * crvmin)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(41701)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(41702)==0&false))) {{
                    __CLR4_4_1w1vw1vlb90pa0k.R.inc(41703);state = 650; __CLR4_4_1w1vw1vlb90pa0k.R.inc(41704);break;
                }
                }__CLR4_4_1w1vw1vlb90pa0k.R.inc(41705);final double bdtol = errbig / rho;
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(41706);for (int j = 0; (((j < n)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(41707)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(41708)==0&false)); j++) {{
                    __CLR4_4_1w1vw1vlb90pa0k.R.inc(41709);double bdtest = bdtol;
                    __CLR4_4_1w1vw1vlb90pa0k.R.inc(41710);if ((((newPoint.getEntry(j) == lowerDifference.getEntry(j))&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(41711)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(41712)==0&false))) {{
                        __CLR4_4_1w1vw1vlb90pa0k.R.inc(41713);bdtest = work1.getEntry(j);
                    }
                    }__CLR4_4_1w1vw1vlb90pa0k.R.inc(41714);if ((((newPoint.getEntry(j) == upperDifference.getEntry(j))&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(41715)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(41716)==0&false))) {{
                        __CLR4_4_1w1vw1vlb90pa0k.R.inc(41717);bdtest = -work1.getEntry(j);
                    }
                    }__CLR4_4_1w1vw1vlb90pa0k.R.inc(41718);if ((((bdtest < bdtol)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(41719)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(41720)==0&false))) {{
                        __CLR4_4_1w1vw1vlb90pa0k.R.inc(41721);double curv = modelSecondDerivativesValues.getEntry((j + j * j) / 2);
                        __CLR4_4_1w1vw1vlb90pa0k.R.inc(41722);for (int k = 0; (((k < npt)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(41723)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(41724)==0&false)); k++) {{
                            // Computing 2nd power
                            __CLR4_4_1w1vw1vlb90pa0k.R.inc(41725);final double d1 = interpolationPoints.getEntry(k, j);
                            __CLR4_4_1w1vw1vlb90pa0k.R.inc(41726);curv += modelSecondDerivativesParameters.getEntry(k) * (d1 * d1);
                        }
                        }__CLR4_4_1w1vw1vlb90pa0k.R.inc(41727);bdtest += HALF * curv * rho;
                        __CLR4_4_1w1vw1vlb90pa0k.R.inc(41728);if ((((bdtest < bdtol)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(41729)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(41730)==0&false))) {{
                            __CLR4_4_1w1vw1vlb90pa0k.R.inc(41731);state = 650; __CLR4_4_1w1vw1vlb90pa0k.R.inc(41732);break;
                        }
                        // throw new PathIsExploredException(); // XXX
                    }}
                }}
                }__CLR4_4_1w1vw1vlb90pa0k.R.inc(41733);state = 680; __CLR4_4_1w1vw1vlb90pa0k.R.inc(41734);break;
            }
            }__CLR4_4_1w1vw1vlb90pa0k.R.inc(41735);++ntrits;

            // Severe cancellation is likely to occur if XOPT is too far from XBASE.
            // If the following test holds, then XBASE is shifted so that XOPT becomes
            // zero. The appropriate changes are made to BMAT and to the second
            // derivatives of the current model, beginning with the changes to BMAT
            // that do not depend on ZMAT. VLAG is used temporarily for working space.

        }
        case 90:if (!__CLB4_4_1_bool0) {__CLR4_4_1w1vw1vlb90pa0k.R.inc(41736);__CLB4_4_1_bool0=true;} {
            __CLR4_4_1w1vw1vlb90pa0k.R.inc(41737);printState(90); // XXX
            __CLR4_4_1w1vw1vlb90pa0k.R.inc(41738);if ((((dsq <= xoptsq * ONE_OVER_A_THOUSAND)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(41739)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(41740)==0&false))) {{
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(41741);final double fracsq = xoptsq * ONE_OVER_FOUR;
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(41742);double sumpq = ZERO;
                // final RealVector sumVector
                //     = new ArrayRealVector(npt, -HALF * xoptsq).add(interpolationPoints.operate(trustRegionCenter));
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(41743);for (int k = 0; (((k < npt)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(41744)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(41745)==0&false)); k++) {{
                    __CLR4_4_1w1vw1vlb90pa0k.R.inc(41746);sumpq += modelSecondDerivativesParameters.getEntry(k);
                    __CLR4_4_1w1vw1vlb90pa0k.R.inc(41747);double sum = -HALF * xoptsq;
                    __CLR4_4_1w1vw1vlb90pa0k.R.inc(41748);for (int i = 0; (((i < n)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(41749)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(41750)==0&false)); i++) {{
                        __CLR4_4_1w1vw1vlb90pa0k.R.inc(41751);sum += interpolationPoints.getEntry(k, i) * trustRegionCenterOffset.getEntry(i);
                    }
                    // sum = sumVector.getEntry(k); // XXX "testAckley" and "testDiffPow" fail.
                    }__CLR4_4_1w1vw1vlb90pa0k.R.inc(41752);work2.setEntry(k, sum);
                    __CLR4_4_1w1vw1vlb90pa0k.R.inc(41753);final double temp = fracsq - HALF * sum;
                    __CLR4_4_1w1vw1vlb90pa0k.R.inc(41754);for (int i = 0; (((i < n)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(41755)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(41756)==0&false)); i++) {{
                        __CLR4_4_1w1vw1vlb90pa0k.R.inc(41757);work1.setEntry(i, bMatrix.getEntry(k, i));
                        __CLR4_4_1w1vw1vlb90pa0k.R.inc(41758);lagrangeValuesAtNewPoint.setEntry(i, sum * interpolationPoints.getEntry(k, i) + temp * trustRegionCenterOffset.getEntry(i));
                        __CLR4_4_1w1vw1vlb90pa0k.R.inc(41759);final int ip = npt + i;
                        __CLR4_4_1w1vw1vlb90pa0k.R.inc(41760);for (int j = 0; (((j <= i)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(41761)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(41762)==0&false)); j++) {{
                            __CLR4_4_1w1vw1vlb90pa0k.R.inc(41763);bMatrix.setEntry(ip, j,
                                          bMatrix.getEntry(ip, j)
                                          + work1.getEntry(i) * lagrangeValuesAtNewPoint.getEntry(j)
                                          + lagrangeValuesAtNewPoint.getEntry(i) * work1.getEntry(j));
                        }
                    }}
                }}

                // Then the revisions of BMAT that depend on ZMAT are calculated.

                }__CLR4_4_1w1vw1vlb90pa0k.R.inc(41764);for (int m = 0; (((m < nptm)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(41765)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(41766)==0&false)); m++) {{
                    __CLR4_4_1w1vw1vlb90pa0k.R.inc(41767);double sumz = ZERO;
                    __CLR4_4_1w1vw1vlb90pa0k.R.inc(41768);double sumw = ZERO;
                    __CLR4_4_1w1vw1vlb90pa0k.R.inc(41769);for (int k = 0; (((k < npt)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(41770)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(41771)==0&false)); k++) {{
                        __CLR4_4_1w1vw1vlb90pa0k.R.inc(41772);sumz += zMatrix.getEntry(k, m);
                        __CLR4_4_1w1vw1vlb90pa0k.R.inc(41773);lagrangeValuesAtNewPoint.setEntry(k, work2.getEntry(k) * zMatrix.getEntry(k, m));
                        __CLR4_4_1w1vw1vlb90pa0k.R.inc(41774);sumw += lagrangeValuesAtNewPoint.getEntry(k);
                    }
                    }__CLR4_4_1w1vw1vlb90pa0k.R.inc(41775);for (int j = 0; (((j < n)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(41776)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(41777)==0&false)); j++) {{
                        __CLR4_4_1w1vw1vlb90pa0k.R.inc(41778);double sum = (fracsq * sumz - HALF * sumw) * trustRegionCenterOffset.getEntry(j);
                        __CLR4_4_1w1vw1vlb90pa0k.R.inc(41779);for (int k = 0; (((k < npt)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(41780)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(41781)==0&false)); k++) {{
                            __CLR4_4_1w1vw1vlb90pa0k.R.inc(41782);sum += lagrangeValuesAtNewPoint.getEntry(k) * interpolationPoints.getEntry(k, j);
                        }
                        }__CLR4_4_1w1vw1vlb90pa0k.R.inc(41783);work1.setEntry(j, sum);
                        __CLR4_4_1w1vw1vlb90pa0k.R.inc(41784);for (int k = 0; (((k < npt)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(41785)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(41786)==0&false)); k++) {{
                            __CLR4_4_1w1vw1vlb90pa0k.R.inc(41787);bMatrix.setEntry(k, j,
                                          bMatrix.getEntry(k, j)
                                          + sum * zMatrix.getEntry(k, m));
                        }
                    }}
                    }__CLR4_4_1w1vw1vlb90pa0k.R.inc(41788);for (int i = 0; (((i < n)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(41789)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(41790)==0&false)); i++) {{
                        __CLR4_4_1w1vw1vlb90pa0k.R.inc(41791);final int ip = i + npt;
                        __CLR4_4_1w1vw1vlb90pa0k.R.inc(41792);final double temp = work1.getEntry(i);
                        __CLR4_4_1w1vw1vlb90pa0k.R.inc(41793);for (int j = 0; (((j <= i)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(41794)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(41795)==0&false)); j++) {{
                            __CLR4_4_1w1vw1vlb90pa0k.R.inc(41796);bMatrix.setEntry(ip, j,
                                          bMatrix.getEntry(ip, j)
                                          + temp * work1.getEntry(j));
                        }
                    }}
                }}

                // The following instructions complete the shift, including the changes
                // to the second derivative parameters of the quadratic model.

                }__CLR4_4_1w1vw1vlb90pa0k.R.inc(41797);int ih = 0;
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(41798);for (int j = 0; (((j < n)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(41799)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(41800)==0&false)); j++) {{
                    __CLR4_4_1w1vw1vlb90pa0k.R.inc(41801);work1.setEntry(j, -HALF * sumpq * trustRegionCenterOffset.getEntry(j));
                    __CLR4_4_1w1vw1vlb90pa0k.R.inc(41802);for (int k = 0; (((k < npt)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(41803)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(41804)==0&false)); k++) {{
                        __CLR4_4_1w1vw1vlb90pa0k.R.inc(41805);work1.setEntry(j, work1.getEntry(j) + modelSecondDerivativesParameters.getEntry(k) * interpolationPoints.getEntry(k, j));
                        __CLR4_4_1w1vw1vlb90pa0k.R.inc(41806);interpolationPoints.setEntry(k, j, interpolationPoints.getEntry(k, j) - trustRegionCenterOffset.getEntry(j));
                    }
                    }__CLR4_4_1w1vw1vlb90pa0k.R.inc(41807);for (int i = 0; (((i <= j)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(41808)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(41809)==0&false)); i++) {{
                         __CLR4_4_1w1vw1vlb90pa0k.R.inc(41810);modelSecondDerivativesValues.setEntry(ih,
                                    modelSecondDerivativesValues.getEntry(ih)
                                    + work1.getEntry(i) * trustRegionCenterOffset.getEntry(j)
                                    + trustRegionCenterOffset.getEntry(i) * work1.getEntry(j));
                        __CLR4_4_1w1vw1vlb90pa0k.R.inc(41811);bMatrix.setEntry(npt + i, j, bMatrix.getEntry(npt + j, i));
                        __CLR4_4_1w1vw1vlb90pa0k.R.inc(41812);ih++;
                    }
                }}
                }__CLR4_4_1w1vw1vlb90pa0k.R.inc(41813);for (int i = 0; (((i < n)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(41814)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(41815)==0&false)); i++) {{
                    __CLR4_4_1w1vw1vlb90pa0k.R.inc(41816);originShift.setEntry(i, originShift.getEntry(i) + trustRegionCenterOffset.getEntry(i));
                    __CLR4_4_1w1vw1vlb90pa0k.R.inc(41817);newPoint.setEntry(i, newPoint.getEntry(i) - trustRegionCenterOffset.getEntry(i));
                    __CLR4_4_1w1vw1vlb90pa0k.R.inc(41818);lowerDifference.setEntry(i, lowerDifference.getEntry(i) - trustRegionCenterOffset.getEntry(i));
                    __CLR4_4_1w1vw1vlb90pa0k.R.inc(41819);upperDifference.setEntry(i, upperDifference.getEntry(i) - trustRegionCenterOffset.getEntry(i));
                    __CLR4_4_1w1vw1vlb90pa0k.R.inc(41820);trustRegionCenterOffset.setEntry(i, ZERO);
                }
                }__CLR4_4_1w1vw1vlb90pa0k.R.inc(41821);xoptsq = ZERO;
            }
            }__CLR4_4_1w1vw1vlb90pa0k.R.inc(41822);if ((((ntrits == 0)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(41823)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(41824)==0&false))) {{
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(41825);state = 210; __CLR4_4_1w1vw1vlb90pa0k.R.inc(41826);break;
            }
            }__CLR4_4_1w1vw1vlb90pa0k.R.inc(41827);state = 230; __CLR4_4_1w1vw1vlb90pa0k.R.inc(41828);break;

            // XBASE is also moved to XOPT by a call of RESCUE. This calculation is
            // more expensive than the previous shift, because new matrices BMAT and
            // ZMAT are generated from scratch, which may include the replacement of
            // interpolation points whose positions seem to be causing near linear
            // dependence in the interpolation conditions. Therefore RESCUE is called
            // only if rounding errors have reduced by at least a factor of two the
            // denominator of the formula for updating the H matrix. It provides a
            // useful safeguard, but is not invoked in most applications of BOBYQA.

        }
        case 210:if (!__CLB4_4_1_bool0) {__CLR4_4_1w1vw1vlb90pa0k.R.inc(41829);__CLB4_4_1_bool0=true;} {
            __CLR4_4_1w1vw1vlb90pa0k.R.inc(41830);printState(210); // XXX
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

            __CLR4_4_1w1vw1vlb90pa0k.R.inc(41831);final double[] alphaCauchy = altmov(knew, adelt);
            __CLR4_4_1w1vw1vlb90pa0k.R.inc(41832);alpha = alphaCauchy[0];
            __CLR4_4_1w1vw1vlb90pa0k.R.inc(41833);cauchy = alphaCauchy[1];

            __CLR4_4_1w1vw1vlb90pa0k.R.inc(41834);for (int i = 0; (((i < n)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(41835)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(41836)==0&false)); i++) {{
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(41837);trialStepPoint.setEntry(i, newPoint.getEntry(i) - trustRegionCenterOffset.getEntry(i));
            }

            // Calculate VLAG and BETA for the current choice of D. The scalar
            // product of D with XPT(K,.) is going to be held in W(NPT+K) for
            // use when VQUAD is calculated.

        }}
        case 230:if (!__CLB4_4_1_bool0) {__CLR4_4_1w1vw1vlb90pa0k.R.inc(41838);__CLB4_4_1_bool0=true;} {
            __CLR4_4_1w1vw1vlb90pa0k.R.inc(41839);printState(230); // XXX
            __CLR4_4_1w1vw1vlb90pa0k.R.inc(41840);for (int k = 0; (((k < npt)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(41841)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(41842)==0&false)); k++) {{
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(41843);double suma = ZERO;
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(41844);double sumb = ZERO;
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(41845);double sum = ZERO;
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(41846);for (int j = 0; (((j < n)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(41847)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(41848)==0&false)); j++) {{
                    __CLR4_4_1w1vw1vlb90pa0k.R.inc(41849);suma += interpolationPoints.getEntry(k, j) * trialStepPoint.getEntry(j);
                    __CLR4_4_1w1vw1vlb90pa0k.R.inc(41850);sumb += interpolationPoints.getEntry(k, j) * trustRegionCenterOffset.getEntry(j);
                    __CLR4_4_1w1vw1vlb90pa0k.R.inc(41851);sum += bMatrix.getEntry(k, j) * trialStepPoint.getEntry(j);
                }
                }__CLR4_4_1w1vw1vlb90pa0k.R.inc(41852);work3.setEntry(k, suma * (HALF * suma + sumb));
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(41853);lagrangeValuesAtNewPoint.setEntry(k, sum);
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(41854);work2.setEntry(k, suma);
            }
            }__CLR4_4_1w1vw1vlb90pa0k.R.inc(41855);beta = ZERO;
            __CLR4_4_1w1vw1vlb90pa0k.R.inc(41856);for (int m = 0; (((m < nptm)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(41857)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(41858)==0&false)); m++) {{
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(41859);double sum = ZERO;
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(41860);for (int k = 0; (((k < npt)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(41861)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(41862)==0&false)); k++) {{
                    __CLR4_4_1w1vw1vlb90pa0k.R.inc(41863);sum += zMatrix.getEntry(k, m) * work3.getEntry(k);
                }
                }__CLR4_4_1w1vw1vlb90pa0k.R.inc(41864);beta -= sum * sum;
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(41865);for (int k = 0; (((k < npt)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(41866)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(41867)==0&false)); k++) {{
                    __CLR4_4_1w1vw1vlb90pa0k.R.inc(41868);lagrangeValuesAtNewPoint.setEntry(k, lagrangeValuesAtNewPoint.getEntry(k) + sum * zMatrix.getEntry(k, m));
                }
            }}
            }__CLR4_4_1w1vw1vlb90pa0k.R.inc(41869);dsq = ZERO;
            __CLR4_4_1w1vw1vlb90pa0k.R.inc(41870);double bsum = ZERO;
            __CLR4_4_1w1vw1vlb90pa0k.R.inc(41871);double dx = ZERO;
            __CLR4_4_1w1vw1vlb90pa0k.R.inc(41872);for (int j = 0; (((j < n)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(41873)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(41874)==0&false)); j++) {{
                // Computing 2nd power
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(41875);final double d1 = trialStepPoint.getEntry(j);
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(41876);dsq += d1 * d1;
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(41877);double sum = ZERO;
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(41878);for (int k = 0; (((k < npt)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(41879)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(41880)==0&false)); k++) {{
                    __CLR4_4_1w1vw1vlb90pa0k.R.inc(41881);sum += work3.getEntry(k) * bMatrix.getEntry(k, j);
                }
                }__CLR4_4_1w1vw1vlb90pa0k.R.inc(41882);bsum += sum * trialStepPoint.getEntry(j);
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(41883);final int jp = npt + j;
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(41884);for (int i = 0; (((i < n)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(41885)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(41886)==0&false)); i++) {{
                    __CLR4_4_1w1vw1vlb90pa0k.R.inc(41887);sum += bMatrix.getEntry(jp, i) * trialStepPoint.getEntry(i);
                }
                }__CLR4_4_1w1vw1vlb90pa0k.R.inc(41888);lagrangeValuesAtNewPoint.setEntry(jp, sum);
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(41889);bsum += sum * trialStepPoint.getEntry(j);
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(41890);dx += trialStepPoint.getEntry(j) * trustRegionCenterOffset.getEntry(j);
            }

            }__CLR4_4_1w1vw1vlb90pa0k.R.inc(41891);beta = dx * dx + dsq * (xoptsq + dx + dx + HALF * dsq) + beta - bsum; // Original
            // beta += dx * dx + dsq * (xoptsq + dx + dx + HALF * dsq) - bsum; // XXX "testAckley" and "testDiffPow" fail.
            // beta = dx * dx + dsq * (xoptsq + 2 * dx + HALF * dsq) + beta - bsum; // XXX "testDiffPow" fails.

            __CLR4_4_1w1vw1vlb90pa0k.R.inc(41892);lagrangeValuesAtNewPoint.setEntry(trustRegionCenterInterpolationPointIndex,
                          lagrangeValuesAtNewPoint.getEntry(trustRegionCenterInterpolationPointIndex) + ONE);

            // If NTRITS is zero, the denominator may be increased by replacing
            // the step D of ALTMOV by a Cauchy step. Then RESCUE may be called if
            // rounding errors have damaged the chosen denominator.

            __CLR4_4_1w1vw1vlb90pa0k.R.inc(41893);if ((((ntrits == 0)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(41894)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(41895)==0&false))) {{
                // Computing 2nd power
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(41896);final double d1 = lagrangeValuesAtNewPoint.getEntry(knew);
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(41897);denom = d1 * d1 + alpha * beta;
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(41898);if ((((denom < cauchy && cauchy > ZERO)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(41899)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(41900)==0&false))) {{
                    __CLR4_4_1w1vw1vlb90pa0k.R.inc(41901);for (int i = 0; (((i < n)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(41902)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(41903)==0&false)); i++) {{
                        __CLR4_4_1w1vw1vlb90pa0k.R.inc(41904);newPoint.setEntry(i, alternativeNewPoint.getEntry(i));
                        __CLR4_4_1w1vw1vlb90pa0k.R.inc(41905);trialStepPoint.setEntry(i, newPoint.getEntry(i) - trustRegionCenterOffset.getEntry(i));
                    }
                    }__CLR4_4_1w1vw1vlb90pa0k.R.inc(41906);cauchy = ZERO; // XXX Useful statement?
                    __CLR4_4_1w1vw1vlb90pa0k.R.inc(41907);state = 230; __CLR4_4_1w1vw1vlb90pa0k.R.inc(41908);break;
                }
                // Alternatively, if NTRITS is positive, then set KNEW to the index of
                // the next interpolation point to be deleted to make room for a trust
                // region step. Again RESCUE may be called if rounding errors have damaged_
                // the chosen denominator, which is the reason for attempting to select
                // KNEW before calculating the next value of the objective function.

            }} }else {{
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(41909);final double delsq = delta * delta;
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(41910);scaden = ZERO;
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(41911);biglsq = ZERO;
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(41912);knew = 0;
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(41913);for (int k = 0; (((k < npt)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(41914)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(41915)==0&false)); k++) {{
                    __CLR4_4_1w1vw1vlb90pa0k.R.inc(41916);if ((((k == trustRegionCenterInterpolationPointIndex)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(41917)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(41918)==0&false))) {{
                        __CLR4_4_1w1vw1vlb90pa0k.R.inc(41919);continue;
                    }
                    }__CLR4_4_1w1vw1vlb90pa0k.R.inc(41920);double hdiag = ZERO;
                    __CLR4_4_1w1vw1vlb90pa0k.R.inc(41921);for (int m = 0; (((m < nptm)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(41922)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(41923)==0&false)); m++) {{
                        // Computing 2nd power
                        __CLR4_4_1w1vw1vlb90pa0k.R.inc(41924);final double d1 = zMatrix.getEntry(k, m);
                        __CLR4_4_1w1vw1vlb90pa0k.R.inc(41925);hdiag += d1 * d1;
                    }
                    // Computing 2nd power
                    }__CLR4_4_1w1vw1vlb90pa0k.R.inc(41926);final double d2 = lagrangeValuesAtNewPoint.getEntry(k);
                    __CLR4_4_1w1vw1vlb90pa0k.R.inc(41927);final double den = beta * hdiag + d2 * d2;
                    __CLR4_4_1w1vw1vlb90pa0k.R.inc(41928);distsq = ZERO;
                    __CLR4_4_1w1vw1vlb90pa0k.R.inc(41929);for (int j = 0; (((j < n)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(41930)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(41931)==0&false)); j++) {{
                        // Computing 2nd power
                        __CLR4_4_1w1vw1vlb90pa0k.R.inc(41932);final double d3 = interpolationPoints.getEntry(k, j) - trustRegionCenterOffset.getEntry(j);
                        __CLR4_4_1w1vw1vlb90pa0k.R.inc(41933);distsq += d3 * d3;
                    }
                    // Computing MAX
                    // Computing 2nd power
                    }__CLR4_4_1w1vw1vlb90pa0k.R.inc(41934);final double d4 = distsq / delsq;
                    __CLR4_4_1w1vw1vlb90pa0k.R.inc(41935);final double temp = Math.max(ONE, d4 * d4);
                    __CLR4_4_1w1vw1vlb90pa0k.R.inc(41936);if ((((temp * den > scaden)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(41937)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(41938)==0&false))) {{
                        __CLR4_4_1w1vw1vlb90pa0k.R.inc(41939);scaden = temp * den;
                        __CLR4_4_1w1vw1vlb90pa0k.R.inc(41940);knew = k;
                        __CLR4_4_1w1vw1vlb90pa0k.R.inc(41941);denom = den;
                    }
                    // Computing MAX
                    // Computing 2nd power
                    }__CLR4_4_1w1vw1vlb90pa0k.R.inc(41942);final double d5 = lagrangeValuesAtNewPoint.getEntry(k);
                    __CLR4_4_1w1vw1vlb90pa0k.R.inc(41943);biglsq = Math.max(biglsq, temp * (d5 * d5));
                }
            }}

            // Put the variables for the next calculation of the objective function
            //   in XNEW, with any adjustments for the bounds.

            // Calculate the value of the objective function at XBASE+XNEW, unless
            //   the limit on the number of calculations of F has been reached.

        }}
        case 360:if (!__CLB4_4_1_bool0) {__CLR4_4_1w1vw1vlb90pa0k.R.inc(41944);__CLB4_4_1_bool0=true;} {
            __CLR4_4_1w1vw1vlb90pa0k.R.inc(41945);printState(360); // XXX
            __CLR4_4_1w1vw1vlb90pa0k.R.inc(41946);for (int i = 0; (((i < n)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(41947)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(41948)==0&false)); i++) {{
                // Computing MIN
                // Computing MAX
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(41949);final double d3 = lowerBound[i];
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(41950);final double d4 = originShift.getEntry(i) + newPoint.getEntry(i);
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(41951);final double d1 = Math.max(d3, d4);
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(41952);final double d2 = upperBound[i];
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(41953);currentBest.setEntry(i, Math.min(d1, d2));
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(41954);if ((((newPoint.getEntry(i) == lowerDifference.getEntry(i))&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(41955)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(41956)==0&false))) {{
                    __CLR4_4_1w1vw1vlb90pa0k.R.inc(41957);currentBest.setEntry(i, lowerBound[i]);
                }
                }__CLR4_4_1w1vw1vlb90pa0k.R.inc(41958);if ((((newPoint.getEntry(i) == upperDifference.getEntry(i))&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(41959)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(41960)==0&false))) {{
                    __CLR4_4_1w1vw1vlb90pa0k.R.inc(41961);currentBest.setEntry(i, upperBound[i]);
                }
            }}

            }__CLR4_4_1w1vw1vlb90pa0k.R.inc(41962);f = computeObjectiveValue(currentBest.toArray());

            __CLR4_4_1w1vw1vlb90pa0k.R.inc(41963);if ((((!isMinimize)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(41964)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(41965)==0&false)))
                {__CLR4_4_1w1vw1vlb90pa0k.R.inc(41966);f = -f;
            }__CLR4_4_1w1vw1vlb90pa0k.R.inc(41967);if ((((ntrits == -1)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(41968)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(41969)==0&false))) {{
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(41970);fsave = f;
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(41971);state = 720; __CLR4_4_1w1vw1vlb90pa0k.R.inc(41972);break;
            }

            // Use the quadratic model to predict the change in F due to the step D,
            //   and set DIFF to the error of this prediction.

            }__CLR4_4_1w1vw1vlb90pa0k.R.inc(41973);final double fopt = fAtInterpolationPoints.getEntry(trustRegionCenterInterpolationPointIndex);
            __CLR4_4_1w1vw1vlb90pa0k.R.inc(41974);double vquad = ZERO;
            __CLR4_4_1w1vw1vlb90pa0k.R.inc(41975);int ih = 0;
            __CLR4_4_1w1vw1vlb90pa0k.R.inc(41976);for (int j = 0; (((j < n)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(41977)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(41978)==0&false)); j++) {{
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(41979);vquad += trialStepPoint.getEntry(j) * gradientAtTrustRegionCenter.getEntry(j);
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(41980);for (int i = 0; (((i <= j)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(41981)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(41982)==0&false)); i++) {{
                    __CLR4_4_1w1vw1vlb90pa0k.R.inc(41983);double temp = trialStepPoint.getEntry(i) * trialStepPoint.getEntry(j);
                    __CLR4_4_1w1vw1vlb90pa0k.R.inc(41984);if ((((i == j)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(41985)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(41986)==0&false))) {{
                        __CLR4_4_1w1vw1vlb90pa0k.R.inc(41987);temp *= HALF;
                    }
                    }__CLR4_4_1w1vw1vlb90pa0k.R.inc(41988);vquad += modelSecondDerivativesValues.getEntry(ih) * temp;
                    __CLR4_4_1w1vw1vlb90pa0k.R.inc(41989);ih++;
               }
            }}
            }__CLR4_4_1w1vw1vlb90pa0k.R.inc(41990);for (int k = 0; (((k < npt)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(41991)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(41992)==0&false)); k++) {{
                // Computing 2nd power
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(41993);final double d1 = work2.getEntry(k);
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(41994);final double d2 = d1 * d1; // "d1" must be squared first to prevent test failures.
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(41995);vquad += HALF * modelSecondDerivativesParameters.getEntry(k) * d2;
            }
            }__CLR4_4_1w1vw1vlb90pa0k.R.inc(41996);final double diff = f - fopt - vquad;
            __CLR4_4_1w1vw1vlb90pa0k.R.inc(41997);diffc = diffb;
            __CLR4_4_1w1vw1vlb90pa0k.R.inc(41998);diffb = diffa;
            __CLR4_4_1w1vw1vlb90pa0k.R.inc(41999);diffa = Math.abs(diff);
            __CLR4_4_1w1vw1vlb90pa0k.R.inc(42000);if ((((dnorm > rho)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42001)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42002)==0&false))) {{
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(42003);nfsav = getEvaluations();
            }

            // Pick the next value of DELTA after a trust region step.

            }__CLR4_4_1w1vw1vlb90pa0k.R.inc(42004);if ((((ntrits > 0)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42005)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42006)==0&false))) {{
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(42007);if ((((vquad >= ZERO)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42008)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42009)==0&false))) {{
                    __CLR4_4_1w1vw1vlb90pa0k.R.inc(42010);throw new MathIllegalStateException(LocalizedFormats.TRUST_REGION_STEP_FAILED, vquad);
                }
                }__CLR4_4_1w1vw1vlb90pa0k.R.inc(42011);ratio = (f - fopt) / vquad;
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(42012);final double hDelta = HALF * delta;
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(42013);if ((((ratio <= ONE_OVER_TEN)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42014)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42015)==0&false))) {{
                    // Computing MIN
                    __CLR4_4_1w1vw1vlb90pa0k.R.inc(42016);delta = Math.min(hDelta, dnorm);
                } }else {__CLR4_4_1w1vw1vlb90pa0k.R.inc(42017);if ((((ratio <= .7)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42018)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42019)==0&false))) {{
                    // Computing MAX
                    __CLR4_4_1w1vw1vlb90pa0k.R.inc(42020);delta = Math.max(hDelta, dnorm);
                } }else {{
                    // Computing MAX
                    __CLR4_4_1w1vw1vlb90pa0k.R.inc(42021);delta = Math.max(hDelta, 2 * dnorm);
                }
                }}__CLR4_4_1w1vw1vlb90pa0k.R.inc(42022);if ((((delta <= rho * 1.5)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42023)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42024)==0&false))) {{
                    __CLR4_4_1w1vw1vlb90pa0k.R.inc(42025);delta = rho;
                }

                // Recalculate KNEW and DENOM if the new F is less than FOPT.

                }__CLR4_4_1w1vw1vlb90pa0k.R.inc(42026);if ((((f < fopt)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42027)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42028)==0&false))) {{
                    __CLR4_4_1w1vw1vlb90pa0k.R.inc(42029);final int ksav = knew;
                    __CLR4_4_1w1vw1vlb90pa0k.R.inc(42030);final double densav = denom;
                    __CLR4_4_1w1vw1vlb90pa0k.R.inc(42031);final double delsq = delta * delta;
                    __CLR4_4_1w1vw1vlb90pa0k.R.inc(42032);scaden = ZERO;
                    __CLR4_4_1w1vw1vlb90pa0k.R.inc(42033);biglsq = ZERO;
                    __CLR4_4_1w1vw1vlb90pa0k.R.inc(42034);knew = 0;
                    __CLR4_4_1w1vw1vlb90pa0k.R.inc(42035);for (int k = 0; (((k < npt)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42036)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42037)==0&false)); k++) {{
                        __CLR4_4_1w1vw1vlb90pa0k.R.inc(42038);double hdiag = ZERO;
                        __CLR4_4_1w1vw1vlb90pa0k.R.inc(42039);for (int m = 0; (((m < nptm)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42040)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42041)==0&false)); m++) {{
                            // Computing 2nd power
                            __CLR4_4_1w1vw1vlb90pa0k.R.inc(42042);final double d1 = zMatrix.getEntry(k, m);
                            __CLR4_4_1w1vw1vlb90pa0k.R.inc(42043);hdiag += d1 * d1;
                        }
                        // Computing 2nd power
                        }__CLR4_4_1w1vw1vlb90pa0k.R.inc(42044);final double d1 = lagrangeValuesAtNewPoint.getEntry(k);
                        __CLR4_4_1w1vw1vlb90pa0k.R.inc(42045);final double den = beta * hdiag + d1 * d1;
                        __CLR4_4_1w1vw1vlb90pa0k.R.inc(42046);distsq = ZERO;
                        __CLR4_4_1w1vw1vlb90pa0k.R.inc(42047);for (int j = 0; (((j < n)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42048)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42049)==0&false)); j++) {{
                            // Computing 2nd power
                            __CLR4_4_1w1vw1vlb90pa0k.R.inc(42050);final double d2 = interpolationPoints.getEntry(k, j) - newPoint.getEntry(j);
                            __CLR4_4_1w1vw1vlb90pa0k.R.inc(42051);distsq += d2 * d2;
                        }
                        // Computing MAX
                        // Computing 2nd power
                        }__CLR4_4_1w1vw1vlb90pa0k.R.inc(42052);final double d3 = distsq / delsq;
                        __CLR4_4_1w1vw1vlb90pa0k.R.inc(42053);final double temp = Math.max(ONE, d3 * d3);
                        __CLR4_4_1w1vw1vlb90pa0k.R.inc(42054);if ((((temp * den > scaden)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42055)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42056)==0&false))) {{
                            __CLR4_4_1w1vw1vlb90pa0k.R.inc(42057);scaden = temp * den;
                            __CLR4_4_1w1vw1vlb90pa0k.R.inc(42058);knew = k;
                            __CLR4_4_1w1vw1vlb90pa0k.R.inc(42059);denom = den;
                        }
                        // Computing MAX
                        // Computing 2nd power
                        }__CLR4_4_1w1vw1vlb90pa0k.R.inc(42060);final double d4 = lagrangeValuesAtNewPoint.getEntry(k);
                        __CLR4_4_1w1vw1vlb90pa0k.R.inc(42061);final double d5 = temp * (d4 * d4);
                        __CLR4_4_1w1vw1vlb90pa0k.R.inc(42062);biglsq = Math.max(biglsq, d5);
                    }
                    }__CLR4_4_1w1vw1vlb90pa0k.R.inc(42063);if ((((scaden <= HALF * biglsq)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42064)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42065)==0&false))) {{
                        __CLR4_4_1w1vw1vlb90pa0k.R.inc(42066);knew = ksav;
                        __CLR4_4_1w1vw1vlb90pa0k.R.inc(42067);denom = densav;
                    }
                }}
            }}

            // Update BMAT and ZMAT, so that the KNEW-th interpolation point can be
            // moved. Also update the second derivative terms of the model.

            }__CLR4_4_1w1vw1vlb90pa0k.R.inc(42068);update(beta, denom, knew);

            __CLR4_4_1w1vw1vlb90pa0k.R.inc(42069);ih = 0;
            __CLR4_4_1w1vw1vlb90pa0k.R.inc(42070);final double pqold = modelSecondDerivativesParameters.getEntry(knew);
            __CLR4_4_1w1vw1vlb90pa0k.R.inc(42071);modelSecondDerivativesParameters.setEntry(knew, ZERO);
            __CLR4_4_1w1vw1vlb90pa0k.R.inc(42072);for (int i = 0; (((i < n)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42073)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42074)==0&false)); i++) {{
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(42075);final double temp = pqold * interpolationPoints.getEntry(knew, i);
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(42076);for (int j = 0; (((j <= i)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42077)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42078)==0&false)); j++) {{
                    __CLR4_4_1w1vw1vlb90pa0k.R.inc(42079);modelSecondDerivativesValues.setEntry(ih, modelSecondDerivativesValues.getEntry(ih) + temp * interpolationPoints.getEntry(knew, j));
                    __CLR4_4_1w1vw1vlb90pa0k.R.inc(42080);ih++;
                }
            }}
            }__CLR4_4_1w1vw1vlb90pa0k.R.inc(42081);for (int m = 0; (((m < nptm)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42082)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42083)==0&false)); m++) {{
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(42084);final double temp = diff * zMatrix.getEntry(knew, m);
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(42085);for (int k = 0; (((k < npt)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42086)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42087)==0&false)); k++) {{
                    __CLR4_4_1w1vw1vlb90pa0k.R.inc(42088);modelSecondDerivativesParameters.setEntry(k, modelSecondDerivativesParameters.getEntry(k) + temp * zMatrix.getEntry(k, m));
                }
            }}

            // Include the new interpolation point, and make the changes to GOPT at
            // the old XOPT that are caused by the updating of the quadratic model.

            }__CLR4_4_1w1vw1vlb90pa0k.R.inc(42089);fAtInterpolationPoints.setEntry(knew,  f);
            __CLR4_4_1w1vw1vlb90pa0k.R.inc(42090);for (int i = 0; (((i < n)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42091)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42092)==0&false)); i++) {{
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(42093);interpolationPoints.setEntry(knew, i, newPoint.getEntry(i));
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(42094);work1.setEntry(i, bMatrix.getEntry(knew, i));
            }
            }__CLR4_4_1w1vw1vlb90pa0k.R.inc(42095);for (int k = 0; (((k < npt)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42096)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42097)==0&false)); k++) {{
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(42098);double suma = ZERO;
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(42099);for (int m = 0; (((m < nptm)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42100)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42101)==0&false)); m++) {{
                    __CLR4_4_1w1vw1vlb90pa0k.R.inc(42102);suma += zMatrix.getEntry(knew, m) * zMatrix.getEntry(k, m);
                }
                }__CLR4_4_1w1vw1vlb90pa0k.R.inc(42103);double sumb = ZERO;
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(42104);for (int j = 0; (((j < n)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42105)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42106)==0&false)); j++) {{
                    __CLR4_4_1w1vw1vlb90pa0k.R.inc(42107);sumb += interpolationPoints.getEntry(k, j) * trustRegionCenterOffset.getEntry(j);
                }
                }__CLR4_4_1w1vw1vlb90pa0k.R.inc(42108);final double temp = suma * sumb;
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(42109);for (int i = 0; (((i < n)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42110)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42111)==0&false)); i++) {{
                    __CLR4_4_1w1vw1vlb90pa0k.R.inc(42112);work1.setEntry(i, work1.getEntry(i) + temp * interpolationPoints.getEntry(k, i));
                }
            }}
            }__CLR4_4_1w1vw1vlb90pa0k.R.inc(42113);for (int i = 0; (((i < n)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42114)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42115)==0&false)); i++) {{
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(42116);gradientAtTrustRegionCenter.setEntry(i, gradientAtTrustRegionCenter.getEntry(i) + diff * work1.getEntry(i));
            }

            // Update XOPT, GOPT and KOPT if the new calculated F is less than FOPT.

            }__CLR4_4_1w1vw1vlb90pa0k.R.inc(42117);if ((((f < fopt)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42118)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42119)==0&false))) {{
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(42120);trustRegionCenterInterpolationPointIndex = knew;
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(42121);xoptsq = ZERO;
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(42122);ih = 0;
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(42123);for (int j = 0; (((j < n)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42124)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42125)==0&false)); j++) {{
                    __CLR4_4_1w1vw1vlb90pa0k.R.inc(42126);trustRegionCenterOffset.setEntry(j, newPoint.getEntry(j));
                    // Computing 2nd power
                    __CLR4_4_1w1vw1vlb90pa0k.R.inc(42127);final double d1 = trustRegionCenterOffset.getEntry(j);
                    __CLR4_4_1w1vw1vlb90pa0k.R.inc(42128);xoptsq += d1 * d1;
                    __CLR4_4_1w1vw1vlb90pa0k.R.inc(42129);for (int i = 0; (((i <= j)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42130)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42131)==0&false)); i++) {{
                        __CLR4_4_1w1vw1vlb90pa0k.R.inc(42132);if ((((i < j)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42133)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42134)==0&false))) {{
                            __CLR4_4_1w1vw1vlb90pa0k.R.inc(42135);gradientAtTrustRegionCenter.setEntry(j, gradientAtTrustRegionCenter.getEntry(j) + modelSecondDerivativesValues.getEntry(ih) * trialStepPoint.getEntry(i));
                        }
                        }__CLR4_4_1w1vw1vlb90pa0k.R.inc(42136);gradientAtTrustRegionCenter.setEntry(i, gradientAtTrustRegionCenter.getEntry(i) + modelSecondDerivativesValues.getEntry(ih) * trialStepPoint.getEntry(j));
                        __CLR4_4_1w1vw1vlb90pa0k.R.inc(42137);ih++;
                    }
                }}
                }__CLR4_4_1w1vw1vlb90pa0k.R.inc(42138);for (int k = 0; (((k < npt)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42139)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42140)==0&false)); k++) {{
                    __CLR4_4_1w1vw1vlb90pa0k.R.inc(42141);double temp = ZERO;
                    __CLR4_4_1w1vw1vlb90pa0k.R.inc(42142);for (int j = 0; (((j < n)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42143)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42144)==0&false)); j++) {{
                        __CLR4_4_1w1vw1vlb90pa0k.R.inc(42145);temp += interpolationPoints.getEntry(k, j) * trialStepPoint.getEntry(j);
                    }
                    }__CLR4_4_1w1vw1vlb90pa0k.R.inc(42146);temp *= modelSecondDerivativesParameters.getEntry(k);
                    __CLR4_4_1w1vw1vlb90pa0k.R.inc(42147);for (int i = 0; (((i < n)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42148)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42149)==0&false)); i++) {{
                        __CLR4_4_1w1vw1vlb90pa0k.R.inc(42150);gradientAtTrustRegionCenter.setEntry(i, gradientAtTrustRegionCenter.getEntry(i) + temp * interpolationPoints.getEntry(k, i));
                    }
                }}
            }}

            // Calculate the parameters of the least Frobenius norm interpolant to
            // the current data, the gradient of this interpolant at XOPT being put
            // into VLAG(NPT+I), I=1,2,...,N.

            }__CLR4_4_1w1vw1vlb90pa0k.R.inc(42151);if ((((ntrits > 0)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42152)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42153)==0&false))) {{
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(42154);for (int k = 0; (((k < npt)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42155)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42156)==0&false)); k++) {{
                    __CLR4_4_1w1vw1vlb90pa0k.R.inc(42157);lagrangeValuesAtNewPoint.setEntry(k, fAtInterpolationPoints.getEntry(k) - fAtInterpolationPoints.getEntry(trustRegionCenterInterpolationPointIndex));
                    __CLR4_4_1w1vw1vlb90pa0k.R.inc(42158);work3.setEntry(k, ZERO);
                }
                }__CLR4_4_1w1vw1vlb90pa0k.R.inc(42159);for (int j = 0; (((j < nptm)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42160)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42161)==0&false)); j++) {{
                    __CLR4_4_1w1vw1vlb90pa0k.R.inc(42162);double sum = ZERO;
                    __CLR4_4_1w1vw1vlb90pa0k.R.inc(42163);for (int k = 0; (((k < npt)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42164)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42165)==0&false)); k++) {{
                        __CLR4_4_1w1vw1vlb90pa0k.R.inc(42166);sum += zMatrix.getEntry(k, j) * lagrangeValuesAtNewPoint.getEntry(k);
                    }
                    }__CLR4_4_1w1vw1vlb90pa0k.R.inc(42167);for (int k = 0; (((k < npt)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42168)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42169)==0&false)); k++) {{
                        __CLR4_4_1w1vw1vlb90pa0k.R.inc(42170);work3.setEntry(k, work3.getEntry(k) + sum * zMatrix.getEntry(k, j));
                    }
                }}
                }__CLR4_4_1w1vw1vlb90pa0k.R.inc(42171);for (int k = 0; (((k < npt)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42172)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42173)==0&false)); k++) {{
                    __CLR4_4_1w1vw1vlb90pa0k.R.inc(42174);double sum = ZERO;
                    __CLR4_4_1w1vw1vlb90pa0k.R.inc(42175);for (int j = 0; (((j < n)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42176)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42177)==0&false)); j++) {{
                        __CLR4_4_1w1vw1vlb90pa0k.R.inc(42178);sum += interpolationPoints.getEntry(k, j) * trustRegionCenterOffset.getEntry(j);
                    }
                    }__CLR4_4_1w1vw1vlb90pa0k.R.inc(42179);work2.setEntry(k, work3.getEntry(k));
                    __CLR4_4_1w1vw1vlb90pa0k.R.inc(42180);work3.setEntry(k, sum * work3.getEntry(k));
                }
                }__CLR4_4_1w1vw1vlb90pa0k.R.inc(42181);double gqsq = ZERO;
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(42182);double gisq = ZERO;
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(42183);for (int i = 0; (((i < n)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42184)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42185)==0&false)); i++) {{
                    __CLR4_4_1w1vw1vlb90pa0k.R.inc(42186);double sum = ZERO;
                    __CLR4_4_1w1vw1vlb90pa0k.R.inc(42187);for (int k = 0; (((k < npt)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42188)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42189)==0&false)); k++) {{
                        __CLR4_4_1w1vw1vlb90pa0k.R.inc(42190);sum += bMatrix.getEntry(k, i) *
                            lagrangeValuesAtNewPoint.getEntry(k) + interpolationPoints.getEntry(k, i) * work3.getEntry(k);
                    }
                    }__CLR4_4_1w1vw1vlb90pa0k.R.inc(42191);if ((((trustRegionCenterOffset.getEntry(i) == lowerDifference.getEntry(i))&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42192)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42193)==0&false))) {{
                        // Computing MIN
                        // Computing 2nd power
                        __CLR4_4_1w1vw1vlb90pa0k.R.inc(42194);final double d1 = Math.min(ZERO, gradientAtTrustRegionCenter.getEntry(i));
                        __CLR4_4_1w1vw1vlb90pa0k.R.inc(42195);gqsq += d1 * d1;
                        // Computing 2nd power
                        __CLR4_4_1w1vw1vlb90pa0k.R.inc(42196);final double d2 = Math.min(ZERO, sum);
                        __CLR4_4_1w1vw1vlb90pa0k.R.inc(42197);gisq += d2 * d2;
                    } }else {__CLR4_4_1w1vw1vlb90pa0k.R.inc(42198);if ((((trustRegionCenterOffset.getEntry(i) == upperDifference.getEntry(i))&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42199)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42200)==0&false))) {{
                        // Computing MAX
                        // Computing 2nd power
                        __CLR4_4_1w1vw1vlb90pa0k.R.inc(42201);final double d1 = Math.max(ZERO, gradientAtTrustRegionCenter.getEntry(i));
                        __CLR4_4_1w1vw1vlb90pa0k.R.inc(42202);gqsq += d1 * d1;
                        // Computing 2nd power
                        __CLR4_4_1w1vw1vlb90pa0k.R.inc(42203);final double d2 = Math.max(ZERO, sum);
                        __CLR4_4_1w1vw1vlb90pa0k.R.inc(42204);gisq += d2 * d2;
                    } }else {{
                        // Computing 2nd power
                        __CLR4_4_1w1vw1vlb90pa0k.R.inc(42205);final double d1 = gradientAtTrustRegionCenter.getEntry(i);
                        __CLR4_4_1w1vw1vlb90pa0k.R.inc(42206);gqsq += d1 * d1;
                        __CLR4_4_1w1vw1vlb90pa0k.R.inc(42207);gisq += sum * sum;
                    }
                    }}__CLR4_4_1w1vw1vlb90pa0k.R.inc(42208);lagrangeValuesAtNewPoint.setEntry(npt + i, sum);
                }

                // Test whether to replace the new quadratic model by the least Frobenius
                // norm interpolant, making the replacement if the test is satisfied.

                }__CLR4_4_1w1vw1vlb90pa0k.R.inc(42209);++itest;
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(42210);if ((((gqsq < TEN * gisq)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42211)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42212)==0&false))) {{
                    __CLR4_4_1w1vw1vlb90pa0k.R.inc(42213);itest = 0;
                }
                }__CLR4_4_1w1vw1vlb90pa0k.R.inc(42214);if ((((itest >= 3)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42215)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42216)==0&false))) {{
                    __CLR4_4_1w1vw1vlb90pa0k.R.inc(42217);for (int i = 0, max = Math.max(npt, nh); (((i < max)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42218)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42219)==0&false)); i++) {{
                        __CLR4_4_1w1vw1vlb90pa0k.R.inc(42220);if ((((i < n)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42221)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42222)==0&false))) {{
                            __CLR4_4_1w1vw1vlb90pa0k.R.inc(42223);gradientAtTrustRegionCenter.setEntry(i, lagrangeValuesAtNewPoint.getEntry(npt + i));
                        }
                        }__CLR4_4_1w1vw1vlb90pa0k.R.inc(42224);if ((((i < npt)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42225)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42226)==0&false))) {{
                            __CLR4_4_1w1vw1vlb90pa0k.R.inc(42227);modelSecondDerivativesParameters.setEntry(i, work2.getEntry(i));
                        }
                        }__CLR4_4_1w1vw1vlb90pa0k.R.inc(42228);if ((((i < nh)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42229)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42230)==0&false))) {{
                            __CLR4_4_1w1vw1vlb90pa0k.R.inc(42231);modelSecondDerivativesValues.setEntry(i, ZERO);
                        }
                        }__CLR4_4_1w1vw1vlb90pa0k.R.inc(42232);itest = 0;
                    }
                }}
            }}

            // If a trust region step has provided a sufficient decrease in F, then
            // branch for another trust region calculation. The case NTRITS=0 occurs
            // when the new interpolation point was reached by an alternative step.

            }__CLR4_4_1w1vw1vlb90pa0k.R.inc(42233);if ((((ntrits == 0)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42234)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42235)==0&false))) {{
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(42236);state = 60; __CLR4_4_1w1vw1vlb90pa0k.R.inc(42237);break;
            }
            }__CLR4_4_1w1vw1vlb90pa0k.R.inc(42238);if ((((f <= fopt + ONE_OVER_TEN * vquad)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42239)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42240)==0&false))) {{
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(42241);state = 60; __CLR4_4_1w1vw1vlb90pa0k.R.inc(42242);break;
            }

            // Alternatively, find out if the interpolation points are close enough
            //   to the best point so far.

            // Computing MAX
            // Computing 2nd power
            }__CLR4_4_1w1vw1vlb90pa0k.R.inc(42243);final double d1 = TWO * delta;
            // Computing 2nd power
            __CLR4_4_1w1vw1vlb90pa0k.R.inc(42244);final double d2 = TEN * rho;
            __CLR4_4_1w1vw1vlb90pa0k.R.inc(42245);distsq = Math.max(d1 * d1, d2 * d2);
        }
        case 650:if (!__CLB4_4_1_bool0) {__CLR4_4_1w1vw1vlb90pa0k.R.inc(42246);__CLB4_4_1_bool0=true;} {
            __CLR4_4_1w1vw1vlb90pa0k.R.inc(42247);printState(650); // XXX
            __CLR4_4_1w1vw1vlb90pa0k.R.inc(42248);knew = -1;
            __CLR4_4_1w1vw1vlb90pa0k.R.inc(42249);for (int k = 0; (((k < npt)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42250)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42251)==0&false)); k++) {{
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(42252);double sum = ZERO;
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(42253);for (int j = 0; (((j < n)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42254)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42255)==0&false)); j++) {{
                    // Computing 2nd power
                    __CLR4_4_1w1vw1vlb90pa0k.R.inc(42256);final double d1 = interpolationPoints.getEntry(k, j) - trustRegionCenterOffset.getEntry(j);
                    __CLR4_4_1w1vw1vlb90pa0k.R.inc(42257);sum += d1 * d1;
                }
                }__CLR4_4_1w1vw1vlb90pa0k.R.inc(42258);if ((((sum > distsq)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42259)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42260)==0&false))) {{
                    __CLR4_4_1w1vw1vlb90pa0k.R.inc(42261);knew = k;
                    __CLR4_4_1w1vw1vlb90pa0k.R.inc(42262);distsq = sum;
                }
            }}

            // If KNEW is positive, then ALTMOV finds alternative new positions for
            // the KNEW-th interpolation point within distance ADELT of XOPT. It is
            // reached via label 90. Otherwise, there is a branch to label 60 for
            // another trust region iteration, unless the calculations with the
            // current RHO are complete.

            }__CLR4_4_1w1vw1vlb90pa0k.R.inc(42263);if ((((knew >= 0)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42264)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42265)==0&false))) {{
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(42266);final double dist = Math.sqrt(distsq);
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(42267);if ((((ntrits == -1)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42268)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42269)==0&false))) {{
                    // Computing MIN
                    __CLR4_4_1w1vw1vlb90pa0k.R.inc(42270);delta = Math.min(ONE_OVER_TEN * delta, HALF * dist);
                    __CLR4_4_1w1vw1vlb90pa0k.R.inc(42271);if ((((delta <= rho * 1.5)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42272)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42273)==0&false))) {{
                        __CLR4_4_1w1vw1vlb90pa0k.R.inc(42274);delta = rho;
                    }
                }}
                }__CLR4_4_1w1vw1vlb90pa0k.R.inc(42275);ntrits = 0;
                // Computing MAX
                // Computing MIN
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(42276);final double d1 = Math.min(ONE_OVER_TEN * dist, delta);
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(42277);adelt = Math.max(d1, rho);
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(42278);dsq = adelt * adelt;
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(42279);state = 90; __CLR4_4_1w1vw1vlb90pa0k.R.inc(42280);break;
            }
            }__CLR4_4_1w1vw1vlb90pa0k.R.inc(42281);if ((((ntrits == -1)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42282)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42283)==0&false))) {{
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(42284);state = 680; __CLR4_4_1w1vw1vlb90pa0k.R.inc(42285);break;
            }
            }__CLR4_4_1w1vw1vlb90pa0k.R.inc(42286);if ((((ratio > ZERO)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42287)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42288)==0&false))) {{
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(42289);state = 60; __CLR4_4_1w1vw1vlb90pa0k.R.inc(42290);break;
            }
            }__CLR4_4_1w1vw1vlb90pa0k.R.inc(42291);if ((((Math.max(delta, dnorm) > rho)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42292)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42293)==0&false))) {{
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(42294);state = 60; __CLR4_4_1w1vw1vlb90pa0k.R.inc(42295);break;
            }

            // The calculations with the current value of RHO are complete. Pick the
            //   next values of RHO and DELTA.
        }}
        case 680:if (!__CLB4_4_1_bool0) {__CLR4_4_1w1vw1vlb90pa0k.R.inc(42296);__CLB4_4_1_bool0=true;} {
            __CLR4_4_1w1vw1vlb90pa0k.R.inc(42297);printState(680); // XXX
            __CLR4_4_1w1vw1vlb90pa0k.R.inc(42298);if ((((rho > stoppingTrustRegionRadius)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42299)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42300)==0&false))) {{
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(42301);delta = HALF * rho;
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(42302);ratio = rho / stoppingTrustRegionRadius;
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(42303);if ((((ratio <= SIXTEEN)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42304)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42305)==0&false))) {{
                    __CLR4_4_1w1vw1vlb90pa0k.R.inc(42306);rho = stoppingTrustRegionRadius;
                } }else {__CLR4_4_1w1vw1vlb90pa0k.R.inc(42307);if ((((ratio <= TWO_HUNDRED_FIFTY)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42308)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42309)==0&false))) {{
                    __CLR4_4_1w1vw1vlb90pa0k.R.inc(42310);rho = Math.sqrt(ratio) * stoppingTrustRegionRadius;
                } }else {{
                    __CLR4_4_1w1vw1vlb90pa0k.R.inc(42311);rho *= ONE_OVER_TEN;
                }
                }}__CLR4_4_1w1vw1vlb90pa0k.R.inc(42312);delta = Math.max(delta, rho);
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(42313);ntrits = 0;
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(42314);nfsav = getEvaluations();
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(42315);state = 60; __CLR4_4_1w1vw1vlb90pa0k.R.inc(42316);break;
            }

            // Return from the calculation, after another Newton-Raphson step, if
            //   it is too short to have been tried before.

            }__CLR4_4_1w1vw1vlb90pa0k.R.inc(42317);if ((((ntrits == -1)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42318)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42319)==0&false))) {{
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(42320);state = 360; __CLR4_4_1w1vw1vlb90pa0k.R.inc(42321);break;
            }
        }}
        case 720:if (!__CLB4_4_1_bool0) {__CLR4_4_1w1vw1vlb90pa0k.R.inc(42322);__CLB4_4_1_bool0=true;} {
            __CLR4_4_1w1vw1vlb90pa0k.R.inc(42323);printState(720); // XXX
            __CLR4_4_1w1vw1vlb90pa0k.R.inc(42324);if ((((fAtInterpolationPoints.getEntry(trustRegionCenterInterpolationPointIndex) <= fsave)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42325)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42326)==0&false))) {{
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(42327);for (int i = 0; (((i < n)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42328)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42329)==0&false)); i++) {{
                    // Computing MIN
                    // Computing MAX
                    __CLR4_4_1w1vw1vlb90pa0k.R.inc(42330);final double d3 = lowerBound[i];
                    __CLR4_4_1w1vw1vlb90pa0k.R.inc(42331);final double d4 = originShift.getEntry(i) + trustRegionCenterOffset.getEntry(i);
                    __CLR4_4_1w1vw1vlb90pa0k.R.inc(42332);final double d1 = Math.max(d3, d4);
                    __CLR4_4_1w1vw1vlb90pa0k.R.inc(42333);final double d2 = upperBound[i];
                    __CLR4_4_1w1vw1vlb90pa0k.R.inc(42334);currentBest.setEntry(i, Math.min(d1, d2));
                    __CLR4_4_1w1vw1vlb90pa0k.R.inc(42335);if ((((trustRegionCenterOffset.getEntry(i) == lowerDifference.getEntry(i))&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42336)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42337)==0&false))) {{
                        __CLR4_4_1w1vw1vlb90pa0k.R.inc(42338);currentBest.setEntry(i, lowerBound[i]);
                    }
                    }__CLR4_4_1w1vw1vlb90pa0k.R.inc(42339);if ((((trustRegionCenterOffset.getEntry(i) == upperDifference.getEntry(i))&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42340)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42341)==0&false))) {{
                        __CLR4_4_1w1vw1vlb90pa0k.R.inc(42342);currentBest.setEntry(i, upperBound[i]);
                    }
                }}
                }__CLR4_4_1w1vw1vlb90pa0k.R.inc(42343);f = fAtInterpolationPoints.getEntry(trustRegionCenterInterpolationPointIndex);
            }
            }__CLR4_4_1w1vw1vlb90pa0k.R.inc(42344);return f;
        }
        default:if (!__CLB4_4_1_bool0) {__CLR4_4_1w1vw1vlb90pa0k.R.inc(42345);__CLB4_4_1_bool0=true;} {
            __CLR4_4_1w1vw1vlb90pa0k.R.inc(42346);throw new MathIllegalStateException(LocalizedFormats.SIMPLE_MESSAGE, "bobyqb");
        }}
    }}finally{__CLR4_4_1w1vw1vlb90pa0k.R.flushNeeded();}} // bobyqb

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
    ) {try{__CLR4_4_1w1vw1vlb90pa0k.R.inc(42347);
        __CLR4_4_1w1vw1vlb90pa0k.R.inc(42348);printMethod(); // XXX

        __CLR4_4_1w1vw1vlb90pa0k.R.inc(42349);final int n = currentBest.getDimension();
        __CLR4_4_1w1vw1vlb90pa0k.R.inc(42350);final int npt = numberOfInterpolationPoints;

        __CLR4_4_1w1vw1vlb90pa0k.R.inc(42351);final ArrayRealVector glag = new ArrayRealVector(n);
        __CLR4_4_1w1vw1vlb90pa0k.R.inc(42352);final ArrayRealVector hcol = new ArrayRealVector(npt);

        __CLR4_4_1w1vw1vlb90pa0k.R.inc(42353);final ArrayRealVector work1 = new ArrayRealVector(n);
        __CLR4_4_1w1vw1vlb90pa0k.R.inc(42354);final ArrayRealVector work2 = new ArrayRealVector(n);

        __CLR4_4_1w1vw1vlb90pa0k.R.inc(42355);for (int k = 0; (((k < npt)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42356)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42357)==0&false)); k++) {{
            __CLR4_4_1w1vw1vlb90pa0k.R.inc(42358);hcol.setEntry(k, ZERO);
        }
        }__CLR4_4_1w1vw1vlb90pa0k.R.inc(42359);for (int j = 0, max = npt - n - 1; (((j < max)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42360)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42361)==0&false)); j++) {{
            __CLR4_4_1w1vw1vlb90pa0k.R.inc(42362);final double tmp = zMatrix.getEntry(knew, j);
            __CLR4_4_1w1vw1vlb90pa0k.R.inc(42363);for (int k = 0; (((k < npt)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42364)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42365)==0&false)); k++) {{
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(42366);hcol.setEntry(k, hcol.getEntry(k) + tmp * zMatrix.getEntry(k, j));
            }
        }}
        }__CLR4_4_1w1vw1vlb90pa0k.R.inc(42367);final double alpha = hcol.getEntry(knew);
        __CLR4_4_1w1vw1vlb90pa0k.R.inc(42368);final double ha = HALF * alpha;

        // Calculate the gradient of the KNEW-th Lagrange function at XOPT.

        __CLR4_4_1w1vw1vlb90pa0k.R.inc(42369);for (int i = 0; (((i < n)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42370)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42371)==0&false)); i++) {{
            __CLR4_4_1w1vw1vlb90pa0k.R.inc(42372);glag.setEntry(i, bMatrix.getEntry(knew, i));
        }
        }__CLR4_4_1w1vw1vlb90pa0k.R.inc(42373);for (int k = 0; (((k < npt)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42374)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42375)==0&false)); k++) {{
            __CLR4_4_1w1vw1vlb90pa0k.R.inc(42376);double tmp = ZERO;
            __CLR4_4_1w1vw1vlb90pa0k.R.inc(42377);for (int j = 0; (((j < n)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42378)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42379)==0&false)); j++) {{
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(42380);tmp += interpolationPoints.getEntry(k, j) * trustRegionCenterOffset.getEntry(j);
            }
            }__CLR4_4_1w1vw1vlb90pa0k.R.inc(42381);tmp *= hcol.getEntry(k);
            __CLR4_4_1w1vw1vlb90pa0k.R.inc(42382);for (int i = 0; (((i < n)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42383)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42384)==0&false)); i++) {{
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(42385);glag.setEntry(i, glag.getEntry(i) + tmp * interpolationPoints.getEntry(k, i));
            }
        }}

        // Search for a large denominator along the straight lines through XOPT
        // and another interpolation point. SLBD and SUBD will be lower and upper
        // bounds on the step along each of these lines in turn. PREDSQ will be
        // set to the square of the predicted denominator for each line. PRESAV
        // will be set to the largest admissible value of PREDSQ that occurs.

        }__CLR4_4_1w1vw1vlb90pa0k.R.inc(42386);double presav = ZERO;
        __CLR4_4_1w1vw1vlb90pa0k.R.inc(42387);double step = Double.NaN;
        __CLR4_4_1w1vw1vlb90pa0k.R.inc(42388);int ksav = 0;
        __CLR4_4_1w1vw1vlb90pa0k.R.inc(42389);int ibdsav = 0;
        __CLR4_4_1w1vw1vlb90pa0k.R.inc(42390);double stpsav = 0;
        __CLR4_4_1w1vw1vlb90pa0k.R.inc(42391);for (int k = 0; (((k < npt)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42392)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42393)==0&false)); k++) {{
            __CLR4_4_1w1vw1vlb90pa0k.R.inc(42394);if ((((k == trustRegionCenterInterpolationPointIndex)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42395)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42396)==0&false))) {{
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(42397);continue;
            }
            }__CLR4_4_1w1vw1vlb90pa0k.R.inc(42398);double dderiv = ZERO;
            __CLR4_4_1w1vw1vlb90pa0k.R.inc(42399);double distsq = ZERO;
            __CLR4_4_1w1vw1vlb90pa0k.R.inc(42400);for (int i = 0; (((i < n)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42401)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42402)==0&false)); i++) {{
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(42403);final double tmp = interpolationPoints.getEntry(k, i) - trustRegionCenterOffset.getEntry(i);
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(42404);dderiv += glag.getEntry(i) * tmp;
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(42405);distsq += tmp * tmp;
            }
            }__CLR4_4_1w1vw1vlb90pa0k.R.inc(42406);double subd = adelt / Math.sqrt(distsq);
            __CLR4_4_1w1vw1vlb90pa0k.R.inc(42407);double slbd = -subd;
            __CLR4_4_1w1vw1vlb90pa0k.R.inc(42408);int ilbd = 0;
            __CLR4_4_1w1vw1vlb90pa0k.R.inc(42409);int iubd = 0;
            __CLR4_4_1w1vw1vlb90pa0k.R.inc(42410);final double sumin = Math.min(ONE, subd);

            // Revise SLBD and SUBD if necessary because of the bounds in SL and SU.

            __CLR4_4_1w1vw1vlb90pa0k.R.inc(42411);for (int i = 0; (((i < n)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42412)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42413)==0&false)); i++) {{
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(42414);final double tmp = interpolationPoints.getEntry(k, i) - trustRegionCenterOffset.getEntry(i);
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(42415);if ((((tmp > ZERO)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42416)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42417)==0&false))) {{
                    __CLR4_4_1w1vw1vlb90pa0k.R.inc(42418);if ((((slbd * tmp < lowerDifference.getEntry(i) - trustRegionCenterOffset.getEntry(i))&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42419)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42420)==0&false))) {{
                        __CLR4_4_1w1vw1vlb90pa0k.R.inc(42421);slbd = (lowerDifference.getEntry(i) - trustRegionCenterOffset.getEntry(i)) / tmp;
                        __CLR4_4_1w1vw1vlb90pa0k.R.inc(42422);ilbd = -i - 1;
                    }
                    }__CLR4_4_1w1vw1vlb90pa0k.R.inc(42423);if ((((subd * tmp > upperDifference.getEntry(i) - trustRegionCenterOffset.getEntry(i))&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42424)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42425)==0&false))) {{
                        // Computing MAX
                        __CLR4_4_1w1vw1vlb90pa0k.R.inc(42426);subd = Math.max(sumin,
                                        (upperDifference.getEntry(i) - trustRegionCenterOffset.getEntry(i)) / tmp);
                        __CLR4_4_1w1vw1vlb90pa0k.R.inc(42427);iubd = i + 1;
                    }
                }} }else {__CLR4_4_1w1vw1vlb90pa0k.R.inc(42428);if ((((tmp < ZERO)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42429)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42430)==0&false))) {{
                    __CLR4_4_1w1vw1vlb90pa0k.R.inc(42431);if ((((slbd * tmp > upperDifference.getEntry(i) - trustRegionCenterOffset.getEntry(i))&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42432)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42433)==0&false))) {{
                        __CLR4_4_1w1vw1vlb90pa0k.R.inc(42434);slbd = (upperDifference.getEntry(i) - trustRegionCenterOffset.getEntry(i)) / tmp;
                        __CLR4_4_1w1vw1vlb90pa0k.R.inc(42435);ilbd = i + 1;
                    }
                    }__CLR4_4_1w1vw1vlb90pa0k.R.inc(42436);if ((((subd * tmp < lowerDifference.getEntry(i) - trustRegionCenterOffset.getEntry(i))&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42437)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42438)==0&false))) {{
                        // Computing MAX
                        __CLR4_4_1w1vw1vlb90pa0k.R.inc(42439);subd = Math.max(sumin,
                                        (lowerDifference.getEntry(i) - trustRegionCenterOffset.getEntry(i)) / tmp);
                        __CLR4_4_1w1vw1vlb90pa0k.R.inc(42440);iubd = -i - 1;
                    }
                }}
            }}}

            // Seek a large modulus of the KNEW-th Lagrange function when the index
            // of the other interpolation point on the line through XOPT is KNEW.

            }__CLR4_4_1w1vw1vlb90pa0k.R.inc(42441);step = slbd;
            __CLR4_4_1w1vw1vlb90pa0k.R.inc(42442);int isbd = ilbd;
            __CLR4_4_1w1vw1vlb90pa0k.R.inc(42443);double vlag = Double.NaN;
            __CLR4_4_1w1vw1vlb90pa0k.R.inc(42444);if ((((k == knew)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42445)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42446)==0&false))) {{
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(42447);final double diff = dderiv - ONE;
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(42448);vlag = slbd * (dderiv - slbd * diff);
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(42449);final double d1 = subd * (dderiv - subd * diff);
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(42450);if ((((Math.abs(d1) > Math.abs(vlag))&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42451)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42452)==0&false))) {{
                    __CLR4_4_1w1vw1vlb90pa0k.R.inc(42453);step = subd;
                    __CLR4_4_1w1vw1vlb90pa0k.R.inc(42454);vlag = d1;
                    __CLR4_4_1w1vw1vlb90pa0k.R.inc(42455);isbd = iubd;
                }
                }__CLR4_4_1w1vw1vlb90pa0k.R.inc(42456);final double d2 = HALF * dderiv;
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(42457);final double d3 = d2 - diff * slbd;
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(42458);final double d4 = d2 - diff * subd;
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(42459);if ((((d3 * d4 < ZERO)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42460)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42461)==0&false))) {{
                    __CLR4_4_1w1vw1vlb90pa0k.R.inc(42462);final double d5 = d2 * d2 / diff;
                    __CLR4_4_1w1vw1vlb90pa0k.R.inc(42463);if ((((Math.abs(d5) > Math.abs(vlag))&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42464)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42465)==0&false))) {{
                        __CLR4_4_1w1vw1vlb90pa0k.R.inc(42466);step = d2 / diff;
                        __CLR4_4_1w1vw1vlb90pa0k.R.inc(42467);vlag = d5;
                        __CLR4_4_1w1vw1vlb90pa0k.R.inc(42468);isbd = 0;
                    }
                }}

                // Search along each of the other lines through XOPT and another point.

            }} }else {{
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(42469);vlag = slbd * (ONE - slbd);
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(42470);final double tmp = subd * (ONE - subd);
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(42471);if ((((Math.abs(tmp) > Math.abs(vlag))&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42472)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42473)==0&false))) {{
                    __CLR4_4_1w1vw1vlb90pa0k.R.inc(42474);step = subd;
                    __CLR4_4_1w1vw1vlb90pa0k.R.inc(42475);vlag = tmp;
                    __CLR4_4_1w1vw1vlb90pa0k.R.inc(42476);isbd = iubd;
                }
                }__CLR4_4_1w1vw1vlb90pa0k.R.inc(42477);if ((((subd > HALF && Math.abs(vlag) < ONE_OVER_FOUR)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42478)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42479)==0&false))) {{
                    __CLR4_4_1w1vw1vlb90pa0k.R.inc(42480);step = HALF;
                    __CLR4_4_1w1vw1vlb90pa0k.R.inc(42481);vlag = ONE_OVER_FOUR;
                    __CLR4_4_1w1vw1vlb90pa0k.R.inc(42482);isbd = 0;
                }
                }__CLR4_4_1w1vw1vlb90pa0k.R.inc(42483);vlag *= dderiv;
            }

            // Calculate PREDSQ for the current line search and maintain PRESAV.

            }__CLR4_4_1w1vw1vlb90pa0k.R.inc(42484);final double tmp = step * (ONE - step) * distsq;
            __CLR4_4_1w1vw1vlb90pa0k.R.inc(42485);final double predsq = vlag * vlag * (vlag * vlag + ha * tmp * tmp);
            __CLR4_4_1w1vw1vlb90pa0k.R.inc(42486);if ((((predsq > presav)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42487)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42488)==0&false))) {{
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(42489);presav = predsq;
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(42490);ksav = k;
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(42491);stpsav = step;
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(42492);ibdsav = isbd;
            }
        }}

        // Construct XNEW in a way that satisfies the bound constraints exactly.

        }__CLR4_4_1w1vw1vlb90pa0k.R.inc(42493);for (int i = 0; (((i < n)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42494)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42495)==0&false)); i++) {{
            __CLR4_4_1w1vw1vlb90pa0k.R.inc(42496);final double tmp = trustRegionCenterOffset.getEntry(i) + stpsav * (interpolationPoints.getEntry(ksav, i) - trustRegionCenterOffset.getEntry(i));
            __CLR4_4_1w1vw1vlb90pa0k.R.inc(42497);newPoint.setEntry(i, Math.max(lowerDifference.getEntry(i),
                                      Math.min(upperDifference.getEntry(i), tmp)));
        }
        }__CLR4_4_1w1vw1vlb90pa0k.R.inc(42498);if ((((ibdsav < 0)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42499)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42500)==0&false))) {{
            __CLR4_4_1w1vw1vlb90pa0k.R.inc(42501);newPoint.setEntry(-ibdsav - 1, lowerDifference.getEntry(-ibdsav - 1));
        }
        }__CLR4_4_1w1vw1vlb90pa0k.R.inc(42502);if ((((ibdsav > 0)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42503)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42504)==0&false))) {{
            __CLR4_4_1w1vw1vlb90pa0k.R.inc(42505);newPoint.setEntry(ibdsav - 1, upperDifference.getEntry(ibdsav - 1));
        }

        // Prepare for the iterative method that assembles the constrained Cauchy
        // step in W. The sum of squares of the fixed components of W is formed in
        // WFIXSQ, and the free components of W are set to BIGSTP.

        }__CLR4_4_1w1vw1vlb90pa0k.R.inc(42506);final double bigstp = adelt + adelt;
        __CLR4_4_1w1vw1vlb90pa0k.R.inc(42507);int iflag = 0;
        __CLR4_4_1w1vw1vlb90pa0k.R.inc(42508);double cauchy = Double.NaN;
        __CLR4_4_1w1vw1vlb90pa0k.R.inc(42509);double csave = ZERO;
        __CLR4_4_1w1vw1vlb90pa0k.R.inc(42510);while (true) {{
            __CLR4_4_1w1vw1vlb90pa0k.R.inc(42511);double wfixsq = ZERO;
            __CLR4_4_1w1vw1vlb90pa0k.R.inc(42512);double ggfree = ZERO;
            __CLR4_4_1w1vw1vlb90pa0k.R.inc(42513);for (int i = 0; (((i < n)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42514)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42515)==0&false)); i++) {{
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(42516);final double glagValue = glag.getEntry(i);
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(42517);work1.setEntry(i, ZERO);
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(42518);if ((((Math.min(trustRegionCenterOffset.getEntry(i) - lowerDifference.getEntry(i), glagValue) > ZERO ||
                    Math.max(trustRegionCenterOffset.getEntry(i) - upperDifference.getEntry(i), glagValue) < ZERO)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42519)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42520)==0&false))) {{
                    __CLR4_4_1w1vw1vlb90pa0k.R.inc(42521);work1.setEntry(i, bigstp);
                    // Computing 2nd power
                    __CLR4_4_1w1vw1vlb90pa0k.R.inc(42522);ggfree += glagValue * glagValue;
                }
            }}
            }__CLR4_4_1w1vw1vlb90pa0k.R.inc(42523);if ((((ggfree == ZERO)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42524)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42525)==0&false))) {{
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(42526);return new double[] { alpha, ZERO };
            }

            // Investigate whether more components of W can be fixed.
            }__CLR4_4_1w1vw1vlb90pa0k.R.inc(42527);final double tmp1 = adelt * adelt - wfixsq;
            __CLR4_4_1w1vw1vlb90pa0k.R.inc(42528);if ((((tmp1 > ZERO)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42529)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42530)==0&false))) {{
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(42531);step = Math.sqrt(tmp1 / ggfree);
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(42532);ggfree = ZERO;
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(42533);for (int i = 0; (((i < n)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42534)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42535)==0&false)); i++) {{
                    __CLR4_4_1w1vw1vlb90pa0k.R.inc(42536);if ((((work1.getEntry(i) == bigstp)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42537)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42538)==0&false))) {{
                        __CLR4_4_1w1vw1vlb90pa0k.R.inc(42539);final double tmp2 = trustRegionCenterOffset.getEntry(i) - step * glag.getEntry(i);
                        __CLR4_4_1w1vw1vlb90pa0k.R.inc(42540);if ((((tmp2 <= lowerDifference.getEntry(i))&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42541)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42542)==0&false))) {{
                            __CLR4_4_1w1vw1vlb90pa0k.R.inc(42543);work1.setEntry(i, lowerDifference.getEntry(i) - trustRegionCenterOffset.getEntry(i));
                            // Computing 2nd power
                            __CLR4_4_1w1vw1vlb90pa0k.R.inc(42544);final double d1 = work1.getEntry(i);
                            __CLR4_4_1w1vw1vlb90pa0k.R.inc(42545);wfixsq += d1 * d1;
                        } }else {__CLR4_4_1w1vw1vlb90pa0k.R.inc(42546);if ((((tmp2 >= upperDifference.getEntry(i))&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42547)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42548)==0&false))) {{
                            __CLR4_4_1w1vw1vlb90pa0k.R.inc(42549);work1.setEntry(i, upperDifference.getEntry(i) - trustRegionCenterOffset.getEntry(i));
                            // Computing 2nd power
                            __CLR4_4_1w1vw1vlb90pa0k.R.inc(42550);final double d1 = work1.getEntry(i);
                            __CLR4_4_1w1vw1vlb90pa0k.R.inc(42551);wfixsq += d1 * d1;
                        } }else {{
                            // Computing 2nd power
                            __CLR4_4_1w1vw1vlb90pa0k.R.inc(42552);final double d1 = glag.getEntry(i);
                            __CLR4_4_1w1vw1vlb90pa0k.R.inc(42553);ggfree += d1 * d1;
                        }
                    }}}
                }}
            }}

            // Set the remaining free components of W and all components of XALT,
            // except that W may be scaled later.

            }__CLR4_4_1w1vw1vlb90pa0k.R.inc(42554);double gw = ZERO;
            __CLR4_4_1w1vw1vlb90pa0k.R.inc(42555);for (int i = 0; (((i < n)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42556)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42557)==0&false)); i++) {{
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(42558);final double glagValue = glag.getEntry(i);
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(42559);if ((((work1.getEntry(i) == bigstp)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42560)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42561)==0&false))) {{
                    __CLR4_4_1w1vw1vlb90pa0k.R.inc(42562);work1.setEntry(i, -step * glagValue);
                    __CLR4_4_1w1vw1vlb90pa0k.R.inc(42563);final double min = Math.min(upperDifference.getEntry(i),
                                                trustRegionCenterOffset.getEntry(i) + work1.getEntry(i));
                    __CLR4_4_1w1vw1vlb90pa0k.R.inc(42564);alternativeNewPoint.setEntry(i, Math.max(lowerDifference.getEntry(i), min));
                } }else {__CLR4_4_1w1vw1vlb90pa0k.R.inc(42565);if ((((work1.getEntry(i) == ZERO)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42566)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42567)==0&false))) {{
                    __CLR4_4_1w1vw1vlb90pa0k.R.inc(42568);alternativeNewPoint.setEntry(i, trustRegionCenterOffset.getEntry(i));
                } }else {__CLR4_4_1w1vw1vlb90pa0k.R.inc(42569);if ((((glagValue > ZERO)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42570)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42571)==0&false))) {{
                    __CLR4_4_1w1vw1vlb90pa0k.R.inc(42572);alternativeNewPoint.setEntry(i, lowerDifference.getEntry(i));
                } }else {{
                    __CLR4_4_1w1vw1vlb90pa0k.R.inc(42573);alternativeNewPoint.setEntry(i, upperDifference.getEntry(i));
                }
                }}}__CLR4_4_1w1vw1vlb90pa0k.R.inc(42574);gw += glagValue * work1.getEntry(i);
            }

            // Set CURV to the curvature of the KNEW-th Lagrange function along W.
            // Scale W by a factor less than one if that can reduce the modulus of
            // the Lagrange function at XOPT+W. Set CAUCHY to the final value of
            // the square of this function.

            }__CLR4_4_1w1vw1vlb90pa0k.R.inc(42575);double curv = ZERO;
            __CLR4_4_1w1vw1vlb90pa0k.R.inc(42576);for (int k = 0; (((k < npt)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42577)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42578)==0&false)); k++) {{
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(42579);double tmp = ZERO;
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(42580);for (int j = 0; (((j < n)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42581)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42582)==0&false)); j++) {{
                    __CLR4_4_1w1vw1vlb90pa0k.R.inc(42583);tmp += interpolationPoints.getEntry(k, j) * work1.getEntry(j);
                }
                }__CLR4_4_1w1vw1vlb90pa0k.R.inc(42584);curv += hcol.getEntry(k) * tmp * tmp;
            }
            }__CLR4_4_1w1vw1vlb90pa0k.R.inc(42585);if ((((iflag == 1)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42586)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42587)==0&false))) {{
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(42588);curv = -curv;
            }
            }__CLR4_4_1w1vw1vlb90pa0k.R.inc(42589);if ((((curv > -gw &&
                curv < -gw * (ONE + Math.sqrt(TWO)))&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42590)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42591)==0&false))) {{
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(42592);final double scale = -gw / curv;
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(42593);for (int i = 0; (((i < n)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42594)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42595)==0&false)); i++) {{
                    __CLR4_4_1w1vw1vlb90pa0k.R.inc(42596);final double tmp = trustRegionCenterOffset.getEntry(i) + scale * work1.getEntry(i);
                    __CLR4_4_1w1vw1vlb90pa0k.R.inc(42597);alternativeNewPoint.setEntry(i, Math.max(lowerDifference.getEntry(i),
                                              Math.min(upperDifference.getEntry(i), tmp)));
                }
                // Computing 2nd power
                }__CLR4_4_1w1vw1vlb90pa0k.R.inc(42598);final double d1 = HALF * gw * scale;
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(42599);cauchy = d1 * d1;
            } }else {{
                // Computing 2nd power
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(42600);final double d1 = gw + HALF * curv;
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(42601);cauchy = d1 * d1;
            }

            // If IFLAG is zero, then XALT is calculated as before after reversing
            // the sign of GLAG. Thus two XALT vectors become available. The one that
            // is chosen is the one that gives the larger value of CAUCHY.

            }__CLR4_4_1w1vw1vlb90pa0k.R.inc(42602);if ((((iflag == 0)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42603)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42604)==0&false))) {{
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(42605);for (int i = 0; (((i < n)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42606)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42607)==0&false)); i++) {{
                    __CLR4_4_1w1vw1vlb90pa0k.R.inc(42608);glag.setEntry(i, -glag.getEntry(i));
                    __CLR4_4_1w1vw1vlb90pa0k.R.inc(42609);work2.setEntry(i, alternativeNewPoint.getEntry(i));
                }
                }__CLR4_4_1w1vw1vlb90pa0k.R.inc(42610);csave = cauchy;
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(42611);iflag = 1;
            } }else {{
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(42612);break;
            }
        }}
        }__CLR4_4_1w1vw1vlb90pa0k.R.inc(42613);if ((((csave > cauchy)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42614)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42615)==0&false))) {{
            __CLR4_4_1w1vw1vlb90pa0k.R.inc(42616);for (int i = 0; (((i < n)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42617)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42618)==0&false)); i++) {{
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(42619);alternativeNewPoint.setEntry(i, work2.getEntry(i));
            }
            }__CLR4_4_1w1vw1vlb90pa0k.R.inc(42620);cauchy = csave;
        }

        }__CLR4_4_1w1vw1vlb90pa0k.R.inc(42621);return new double[] { alpha, cauchy };
    }finally{__CLR4_4_1w1vw1vlb90pa0k.R.flushNeeded();}} // altmov

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
                        double[] upperBound) {try{__CLR4_4_1w1vw1vlb90pa0k.R.inc(42622);
        __CLR4_4_1w1vw1vlb90pa0k.R.inc(42623);printMethod(); // XXX

        __CLR4_4_1w1vw1vlb90pa0k.R.inc(42624);final int n = currentBest.getDimension();
        __CLR4_4_1w1vw1vlb90pa0k.R.inc(42625);final int npt = numberOfInterpolationPoints;
        __CLR4_4_1w1vw1vlb90pa0k.R.inc(42626);final int ndim = bMatrix.getRowDimension();

        __CLR4_4_1w1vw1vlb90pa0k.R.inc(42627);final double rhosq = initialTrustRegionRadius * initialTrustRegionRadius;
        __CLR4_4_1w1vw1vlb90pa0k.R.inc(42628);final double recip = 1d / rhosq;
        __CLR4_4_1w1vw1vlb90pa0k.R.inc(42629);final int np = n + 1;

        // Set XBASE to the initial vector of variables, and set the initial
        // elements of XPT, BMAT, HQ, PQ and ZMAT to zero.

        __CLR4_4_1w1vw1vlb90pa0k.R.inc(42630);for (int j = 0; (((j < n)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42631)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42632)==0&false)); j++) {{
            __CLR4_4_1w1vw1vlb90pa0k.R.inc(42633);originShift.setEntry(j, currentBest.getEntry(j));
            __CLR4_4_1w1vw1vlb90pa0k.R.inc(42634);for (int k = 0; (((k < npt)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42635)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42636)==0&false)); k++) {{
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(42637);interpolationPoints.setEntry(k, j, ZERO);
            }
            }__CLR4_4_1w1vw1vlb90pa0k.R.inc(42638);for (int i = 0; (((i < ndim)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42639)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42640)==0&false)); i++) {{
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(42641);bMatrix.setEntry(i, j, ZERO);
            }
        }}
        }__CLR4_4_1w1vw1vlb90pa0k.R.inc(42642);for (int i = 0, max = n * np / 2; (((i < max)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42643)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42644)==0&false)); i++) {{
            __CLR4_4_1w1vw1vlb90pa0k.R.inc(42645);modelSecondDerivativesValues.setEntry(i, ZERO);
        }
        }__CLR4_4_1w1vw1vlb90pa0k.R.inc(42646);for (int k = 0; (((k < npt)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42647)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42648)==0&false)); k++) {{
            __CLR4_4_1w1vw1vlb90pa0k.R.inc(42649);modelSecondDerivativesParameters.setEntry(k, ZERO);
            __CLR4_4_1w1vw1vlb90pa0k.R.inc(42650);for (int j = 0, max = npt - np; (((j < max)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42651)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42652)==0&false)); j++) {{
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(42653);zMatrix.setEntry(k, j, ZERO);
            }
        }}

        // Begin the initialization procedure. NF becomes one more than the number
        // of function values so far. The coordinates of the displacement of the
        // next initial interpolation point from XBASE are set in XPT(NF+1,.).

        }__CLR4_4_1w1vw1vlb90pa0k.R.inc(42654);int ipt = 0;
        __CLR4_4_1w1vw1vlb90pa0k.R.inc(42655);int jpt = 0;
        __CLR4_4_1w1vw1vlb90pa0k.R.inc(42656);double fbeg = Double.NaN;
        __CLR4_4_1w1vw1vlb90pa0k.R.inc(42657);do {{
            __CLR4_4_1w1vw1vlb90pa0k.R.inc(42658);final int nfm = getEvaluations();
            __CLR4_4_1w1vw1vlb90pa0k.R.inc(42659);final int nfx = nfm - n;
            __CLR4_4_1w1vw1vlb90pa0k.R.inc(42660);final int nfmm = nfm - 1;
            __CLR4_4_1w1vw1vlb90pa0k.R.inc(42661);final int nfxm = nfx - 1;
            __CLR4_4_1w1vw1vlb90pa0k.R.inc(42662);double stepa = 0;
            __CLR4_4_1w1vw1vlb90pa0k.R.inc(42663);double stepb = 0;
            __CLR4_4_1w1vw1vlb90pa0k.R.inc(42664);if ((((nfm <= 2 * n)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42665)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42666)==0&false))) {{
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(42667);if ((((nfm >= 1 &&
                    nfm <= n)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42668)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42669)==0&false))) {{
                    __CLR4_4_1w1vw1vlb90pa0k.R.inc(42670);stepa = initialTrustRegionRadius;
                    __CLR4_4_1w1vw1vlb90pa0k.R.inc(42671);if ((((upperDifference.getEntry(nfmm) == ZERO)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42672)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42673)==0&false))) {{
                        __CLR4_4_1w1vw1vlb90pa0k.R.inc(42674);stepa = -stepa;
                        // throw new PathIsExploredException(); // XXX
                    }
                    }__CLR4_4_1w1vw1vlb90pa0k.R.inc(42675);interpolationPoints.setEntry(nfm, nfmm, stepa);
                } }else {__CLR4_4_1w1vw1vlb90pa0k.R.inc(42676);if ((((nfm > n)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42677)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42678)==0&false))) {{
                    __CLR4_4_1w1vw1vlb90pa0k.R.inc(42679);stepa = interpolationPoints.getEntry(nfx, nfxm);
                    __CLR4_4_1w1vw1vlb90pa0k.R.inc(42680);stepb = -initialTrustRegionRadius;
                    __CLR4_4_1w1vw1vlb90pa0k.R.inc(42681);if ((((lowerDifference.getEntry(nfxm) == ZERO)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42682)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42683)==0&false))) {{
                        __CLR4_4_1w1vw1vlb90pa0k.R.inc(42684);stepb = Math.min(TWO * initialTrustRegionRadius, upperDifference.getEntry(nfxm));
                        // throw new PathIsExploredException(); // XXX
                    }
                    }__CLR4_4_1w1vw1vlb90pa0k.R.inc(42685);if ((((upperDifference.getEntry(nfxm) == ZERO)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42686)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42687)==0&false))) {{
                        __CLR4_4_1w1vw1vlb90pa0k.R.inc(42688);stepb = Math.max(-TWO * initialTrustRegionRadius, lowerDifference.getEntry(nfxm));
                        // throw new PathIsExploredException(); // XXX
                    }
                    }__CLR4_4_1w1vw1vlb90pa0k.R.inc(42689);interpolationPoints.setEntry(nfm, nfxm, stepb);
                }
            }}} }else {{
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(42690);final int tmp1 = (nfm - np) / n;
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(42691);jpt = nfm - tmp1 * n - n;
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(42692);ipt = jpt + tmp1;
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(42693);if ((((ipt > n)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42694)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42695)==0&false))) {{
                    __CLR4_4_1w1vw1vlb90pa0k.R.inc(42696);final int tmp2 = jpt;
                    __CLR4_4_1w1vw1vlb90pa0k.R.inc(42697);jpt = ipt - n;
                    __CLR4_4_1w1vw1vlb90pa0k.R.inc(42698);ipt = tmp2;
//                     throw new PathIsExploredException(); // XXX
                }
                }__CLR4_4_1w1vw1vlb90pa0k.R.inc(42699);final int iptMinus1 = ipt - 1;
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(42700);final int jptMinus1 = jpt - 1;
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(42701);interpolationPoints.setEntry(nfm, iptMinus1, interpolationPoints.getEntry(ipt, iptMinus1));
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(42702);interpolationPoints.setEntry(nfm, jptMinus1, interpolationPoints.getEntry(jpt, jptMinus1));
            }

            // Calculate the next value of F. The least function value so far and
            // its index are required.

            }__CLR4_4_1w1vw1vlb90pa0k.R.inc(42703);for (int j = 0; (((j < n)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42704)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42705)==0&false)); j++) {{
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(42706);currentBest.setEntry(j, Math.min(Math.max(lowerBound[j],
                                                          originShift.getEntry(j) + interpolationPoints.getEntry(nfm, j)),
                                                 upperBound[j]));
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(42707);if ((((interpolationPoints.getEntry(nfm, j) == lowerDifference.getEntry(j))&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42708)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42709)==0&false))) {{
                    __CLR4_4_1w1vw1vlb90pa0k.R.inc(42710);currentBest.setEntry(j, lowerBound[j]);
                }
                }__CLR4_4_1w1vw1vlb90pa0k.R.inc(42711);if ((((interpolationPoints.getEntry(nfm, j) == upperDifference.getEntry(j))&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42712)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42713)==0&false))) {{
                    __CLR4_4_1w1vw1vlb90pa0k.R.inc(42714);currentBest.setEntry(j, upperBound[j]);
                }
            }}

            }__CLR4_4_1w1vw1vlb90pa0k.R.inc(42715);final double objectiveValue = computeObjectiveValue(currentBest.toArray());
            __CLR4_4_1w1vw1vlb90pa0k.R.inc(42716);final double f = (((isMinimize )&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42717)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42718)==0&false))? objectiveValue : -objectiveValue;
            __CLR4_4_1w1vw1vlb90pa0k.R.inc(42719);final int numEval = getEvaluations(); // nfm + 1
            __CLR4_4_1w1vw1vlb90pa0k.R.inc(42720);fAtInterpolationPoints.setEntry(nfm, f);

            __CLR4_4_1w1vw1vlb90pa0k.R.inc(42721);if ((((numEval == 1)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42722)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42723)==0&false))) {{
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(42724);fbeg = f;
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(42725);trustRegionCenterInterpolationPointIndex = 0;
            } }else {__CLR4_4_1w1vw1vlb90pa0k.R.inc(42726);if ((((f < fAtInterpolationPoints.getEntry(trustRegionCenterInterpolationPointIndex))&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42727)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42728)==0&false))) {{
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(42729);trustRegionCenterInterpolationPointIndex = nfm;
            }

            // Set the nonzero initial elements of BMAT and the quadratic model in the
            // cases when NF is at most 2*N+1. If NF exceeds N+1, then the positions
            // of the NF-th and (NF-N)-th interpolation points may be switched, in
            // order that the function value at the first of them contributes to the
            // off-diagonal second derivative terms of the initial quadratic model.

            }}__CLR4_4_1w1vw1vlb90pa0k.R.inc(42730);if ((((numEval <= 2 * n + 1)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42731)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42732)==0&false))) {{
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(42733);if ((((numEval >= 2 &&
                    numEval <= n + 1)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42734)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42735)==0&false))) {{
                    __CLR4_4_1w1vw1vlb90pa0k.R.inc(42736);gradientAtTrustRegionCenter.setEntry(nfmm, (f - fbeg) / stepa);
                    __CLR4_4_1w1vw1vlb90pa0k.R.inc(42737);if ((((npt < numEval + n)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42738)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42739)==0&false))) {{
                        __CLR4_4_1w1vw1vlb90pa0k.R.inc(42740);final double oneOverStepA = ONE / stepa;
                        __CLR4_4_1w1vw1vlb90pa0k.R.inc(42741);bMatrix.setEntry(0, nfmm, -oneOverStepA);
                        __CLR4_4_1w1vw1vlb90pa0k.R.inc(42742);bMatrix.setEntry(nfm, nfmm, oneOverStepA);
                        __CLR4_4_1w1vw1vlb90pa0k.R.inc(42743);bMatrix.setEntry(npt + nfmm, nfmm, -HALF * rhosq);
                        // throw new PathIsExploredException(); // XXX
                    }
                }} }else {__CLR4_4_1w1vw1vlb90pa0k.R.inc(42744);if ((((numEval >= n + 2)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42745)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42746)==0&false))) {{
                    __CLR4_4_1w1vw1vlb90pa0k.R.inc(42747);final int ih = nfx * (nfx + 1) / 2 - 1;
                    __CLR4_4_1w1vw1vlb90pa0k.R.inc(42748);final double tmp = (f - fbeg) / stepb;
                    __CLR4_4_1w1vw1vlb90pa0k.R.inc(42749);final double diff = stepb - stepa;
                    __CLR4_4_1w1vw1vlb90pa0k.R.inc(42750);modelSecondDerivativesValues.setEntry(ih, TWO * (tmp - gradientAtTrustRegionCenter.getEntry(nfxm)) / diff);
                    __CLR4_4_1w1vw1vlb90pa0k.R.inc(42751);gradientAtTrustRegionCenter.setEntry(nfxm, (gradientAtTrustRegionCenter.getEntry(nfxm) * stepb - tmp * stepa) / diff);
                    __CLR4_4_1w1vw1vlb90pa0k.R.inc(42752);if ((((stepa * stepb < ZERO && f < fAtInterpolationPoints.getEntry(nfm - n))&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42753)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42754)==0&false))) {{
                        __CLR4_4_1w1vw1vlb90pa0k.R.inc(42755);fAtInterpolationPoints.setEntry(nfm, fAtInterpolationPoints.getEntry(nfm - n));
                        __CLR4_4_1w1vw1vlb90pa0k.R.inc(42756);fAtInterpolationPoints.setEntry(nfm - n, f);
                        __CLR4_4_1w1vw1vlb90pa0k.R.inc(42757);if ((((trustRegionCenterInterpolationPointIndex == nfm)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42758)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42759)==0&false))) {{
                            __CLR4_4_1w1vw1vlb90pa0k.R.inc(42760);trustRegionCenterInterpolationPointIndex = nfm - n;
                        }
                        }__CLR4_4_1w1vw1vlb90pa0k.R.inc(42761);interpolationPoints.setEntry(nfm - n, nfxm, stepb);
                        __CLR4_4_1w1vw1vlb90pa0k.R.inc(42762);interpolationPoints.setEntry(nfm, nfxm, stepa);
                    }
                    }__CLR4_4_1w1vw1vlb90pa0k.R.inc(42763);bMatrix.setEntry(0, nfxm, -(stepa + stepb) / (stepa * stepb));
                    __CLR4_4_1w1vw1vlb90pa0k.R.inc(42764);bMatrix.setEntry(nfm, nfxm, -HALF / interpolationPoints.getEntry(nfm - n, nfxm));
                    __CLR4_4_1w1vw1vlb90pa0k.R.inc(42765);bMatrix.setEntry(nfm - n, nfxm,
                                  -bMatrix.getEntry(0, nfxm) - bMatrix.getEntry(nfm, nfxm));
                    __CLR4_4_1w1vw1vlb90pa0k.R.inc(42766);zMatrix.setEntry(0, nfxm, Math.sqrt(TWO) / (stepa * stepb));
                    __CLR4_4_1w1vw1vlb90pa0k.R.inc(42767);zMatrix.setEntry(nfm, nfxm, Math.sqrt(HALF) / rhosq);
                    // zMatrix.setEntry(nfm, nfxm, Math.sqrt(HALF) * recip); // XXX "testAckley" and "testDiffPow" fail.
                    __CLR4_4_1w1vw1vlb90pa0k.R.inc(42768);zMatrix.setEntry(nfm - n, nfxm,
                                  -zMatrix.getEntry(0, nfxm) - zMatrix.getEntry(nfm, nfxm));
                }

                // Set the off-diagonal second derivatives of the Lagrange functions and
                // the initial quadratic model.

            }}} }else {{
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(42769);zMatrix.setEntry(0, nfxm, recip);
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(42770);zMatrix.setEntry(nfm, nfxm, recip);
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(42771);zMatrix.setEntry(ipt, nfxm, -recip);
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(42772);zMatrix.setEntry(jpt, nfxm, -recip);

                __CLR4_4_1w1vw1vlb90pa0k.R.inc(42773);final int ih = ipt * (ipt - 1) / 2 + jpt - 1;
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(42774);final double tmp = interpolationPoints.getEntry(nfm, ipt - 1) * interpolationPoints.getEntry(nfm, jpt - 1);
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(42775);modelSecondDerivativesValues.setEntry(ih, (fbeg - fAtInterpolationPoints.getEntry(ipt) - fAtInterpolationPoints.getEntry(jpt) + f) / tmp);
//                 throw new PathIsExploredException(); // XXX
            }
        }} }while ((((getEvaluations() < npt)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42776)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42777)==0&false)));
    }finally{__CLR4_4_1w1vw1vlb90pa0k.R.flushNeeded();}} // prelim


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
    ) {try{__CLR4_4_1w1vw1vlb90pa0k.R.inc(42778);
        __CLR4_4_1w1vw1vlb90pa0k.R.inc(42779);printMethod(); // XXX

        __CLR4_4_1w1vw1vlb90pa0k.R.inc(42780);final int n = currentBest.getDimension();
        __CLR4_4_1w1vw1vlb90pa0k.R.inc(42781);final int npt = numberOfInterpolationPoints;

        __CLR4_4_1w1vw1vlb90pa0k.R.inc(42782);double dsq = Double.NaN;
        __CLR4_4_1w1vw1vlb90pa0k.R.inc(42783);double crvmin = Double.NaN;

        // Local variables
        __CLR4_4_1w1vw1vlb90pa0k.R.inc(42784);double ds;
        __CLR4_4_1w1vw1vlb90pa0k.R.inc(42785);int iu;
        __CLR4_4_1w1vw1vlb90pa0k.R.inc(42786);double dhd, dhs, cth, shs, sth, ssq, beta=0, sdec, blen;
        __CLR4_4_1w1vw1vlb90pa0k.R.inc(42787);int iact = -1;
        __CLR4_4_1w1vw1vlb90pa0k.R.inc(42788);int nact = 0;
        __CLR4_4_1w1vw1vlb90pa0k.R.inc(42789);double angt = 0, qred;
        __CLR4_4_1w1vw1vlb90pa0k.R.inc(42790);int isav;
        __CLR4_4_1w1vw1vlb90pa0k.R.inc(42791);double temp = 0, xsav = 0, xsum = 0, angbd = 0, dredg = 0, sredg = 0;
        __CLR4_4_1w1vw1vlb90pa0k.R.inc(42792);int iterc;
        __CLR4_4_1w1vw1vlb90pa0k.R.inc(42793);double resid = 0, delsq = 0, ggsav = 0, tempa = 0, tempb = 0,
        redmax = 0, dredsq = 0, redsav = 0, gredsq = 0, rednew = 0;
        __CLR4_4_1w1vw1vlb90pa0k.R.inc(42794);int itcsav = 0;
        __CLR4_4_1w1vw1vlb90pa0k.R.inc(42795);double rdprev = 0, rdnext = 0, stplen = 0, stepsq = 0;
        __CLR4_4_1w1vw1vlb90pa0k.R.inc(42796);int itermax = 0;

        // Set some constants.

        // Function Body

        // The sign of GOPT(I) gives the sign of the change to the I-th variable
        // that will reduce Q from its value at XOPT. Thus xbdi.get((I) shows whether
        // or not to fix the I-th variable at one of its bounds initially, with
        // NACT being set to the number of fixed variables. D and GNEW are also
        // set for the first iteration. DELSQ is the upper bound on the sum of
        // squares of the free variables. QRED is the reduction in Q so far.

        __CLR4_4_1w1vw1vlb90pa0k.R.inc(42797);iterc = 0;
        __CLR4_4_1w1vw1vlb90pa0k.R.inc(42798);nact = 0;
        __CLR4_4_1w1vw1vlb90pa0k.R.inc(42799);for (int i = 0; (((i < n)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42800)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42801)==0&false)); i++) {{
            __CLR4_4_1w1vw1vlb90pa0k.R.inc(42802);xbdi.setEntry(i, ZERO);
            __CLR4_4_1w1vw1vlb90pa0k.R.inc(42803);if ((((trustRegionCenterOffset.getEntry(i) <= lowerDifference.getEntry(i))&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42804)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42805)==0&false))) {{
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(42806);if ((((gradientAtTrustRegionCenter.getEntry(i) >= ZERO)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42807)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42808)==0&false))) {{
                    __CLR4_4_1w1vw1vlb90pa0k.R.inc(42809);xbdi.setEntry(i, MINUS_ONE);
                }
            }} }else {__CLR4_4_1w1vw1vlb90pa0k.R.inc(42810);if ((((trustRegionCenterOffset.getEntry(i) >= upperDifference.getEntry(i) &&
                       gradientAtTrustRegionCenter.getEntry(i) <= ZERO)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42811)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42812)==0&false))) {{
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(42813);xbdi.setEntry(i, ONE);
            }
            }}__CLR4_4_1w1vw1vlb90pa0k.R.inc(42814);if ((((xbdi.getEntry(i) != ZERO)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42815)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42816)==0&false))) {{
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(42817);++nact;
            }
            }__CLR4_4_1w1vw1vlb90pa0k.R.inc(42818);trialStepPoint.setEntry(i, ZERO);
            __CLR4_4_1w1vw1vlb90pa0k.R.inc(42819);gnew.setEntry(i, gradientAtTrustRegionCenter.getEntry(i));
        }
        }__CLR4_4_1w1vw1vlb90pa0k.R.inc(42820);delsq = delta * delta;
        __CLR4_4_1w1vw1vlb90pa0k.R.inc(42821);qred = ZERO;
        __CLR4_4_1w1vw1vlb90pa0k.R.inc(42822);crvmin = MINUS_ONE;

        // Set the next search direction of the conjugate gradient method. It is
        // the steepest descent direction initially and when the iterations are
        // restarted because a variable has just been fixed by a bound, and of
        // course the components of the fixed variables are zero. ITERMAX is an
        // upper bound on the indices of the conjugate gradient iterations.

        __CLR4_4_1w1vw1vlb90pa0k.R.inc(42823);int state = 20;
        __CLR4_4_1w1vw1vlb90pa0k.R.inc(42824);for(;;) {{
            boolean __CLB4_4_1_bool1=false;__CLR4_4_1w1vw1vlb90pa0k.R.inc(42825);switch (state) {
        case 20:if (!__CLB4_4_1_bool1) {__CLR4_4_1w1vw1vlb90pa0k.R.inc(42826);__CLB4_4_1_bool1=true;} {
            __CLR4_4_1w1vw1vlb90pa0k.R.inc(42827);printState(20); // XXX
            __CLR4_4_1w1vw1vlb90pa0k.R.inc(42828);beta = ZERO;
        }
        case 30:if (!__CLB4_4_1_bool1) {__CLR4_4_1w1vw1vlb90pa0k.R.inc(42829);__CLB4_4_1_bool1=true;} {
            __CLR4_4_1w1vw1vlb90pa0k.R.inc(42830);printState(30); // XXX
            __CLR4_4_1w1vw1vlb90pa0k.R.inc(42831);stepsq = ZERO;
            __CLR4_4_1w1vw1vlb90pa0k.R.inc(42832);for (int i = 0; (((i < n)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42833)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42834)==0&false)); i++) {{
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(42835);if ((((xbdi.getEntry(i) != ZERO)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42836)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42837)==0&false))) {{
                    __CLR4_4_1w1vw1vlb90pa0k.R.inc(42838);s.setEntry(i, ZERO);
                } }else {__CLR4_4_1w1vw1vlb90pa0k.R.inc(42839);if ((((beta == ZERO)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42840)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42841)==0&false))) {{
                    __CLR4_4_1w1vw1vlb90pa0k.R.inc(42842);s.setEntry(i, -gnew.getEntry(i));
                } }else {{
                    __CLR4_4_1w1vw1vlb90pa0k.R.inc(42843);s.setEntry(i, beta * s.getEntry(i) - gnew.getEntry(i));
                }
                // Computing 2nd power
                }}__CLR4_4_1w1vw1vlb90pa0k.R.inc(42844);final double d1 = s.getEntry(i);
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(42845);stepsq += d1 * d1;
            }
            }__CLR4_4_1w1vw1vlb90pa0k.R.inc(42846);if ((((stepsq == ZERO)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42847)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42848)==0&false))) {{
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(42849);state = 190; __CLR4_4_1w1vw1vlb90pa0k.R.inc(42850);break;
            }
            }__CLR4_4_1w1vw1vlb90pa0k.R.inc(42851);if ((((beta == ZERO)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42852)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42853)==0&false))) {{
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(42854);gredsq = stepsq;
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(42855);itermax = iterc + n - nact;
            }
            }__CLR4_4_1w1vw1vlb90pa0k.R.inc(42856);if ((((gredsq * delsq <= qred * 1e-4 * qred)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42857)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42858)==0&false))) {{
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(42859);state = 190; __CLR4_4_1w1vw1vlb90pa0k.R.inc(42860);break;
            }

            // Multiply the search direction by the second derivative matrix of Q and
            // calculate some scalars for the choice of steplength. Then set BLEN to
            // the length of the the step to the trust region boundary and STPLEN to
            // the steplength, ignoring the simple bounds.

            }__CLR4_4_1w1vw1vlb90pa0k.R.inc(42861);state = 210; __CLR4_4_1w1vw1vlb90pa0k.R.inc(42862);break;
        }
        case 50:if (!__CLB4_4_1_bool1) {__CLR4_4_1w1vw1vlb90pa0k.R.inc(42863);__CLB4_4_1_bool1=true;} {
            __CLR4_4_1w1vw1vlb90pa0k.R.inc(42864);printState(50); // XXX
            __CLR4_4_1w1vw1vlb90pa0k.R.inc(42865);resid = delsq;
            __CLR4_4_1w1vw1vlb90pa0k.R.inc(42866);ds = ZERO;
            __CLR4_4_1w1vw1vlb90pa0k.R.inc(42867);shs = ZERO;
            __CLR4_4_1w1vw1vlb90pa0k.R.inc(42868);for (int i = 0; (((i < n)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42869)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42870)==0&false)); i++) {{
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(42871);if ((((xbdi.getEntry(i) == ZERO)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42872)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42873)==0&false))) {{
                    // Computing 2nd power
                    __CLR4_4_1w1vw1vlb90pa0k.R.inc(42874);final double d1 = trialStepPoint.getEntry(i);
                    __CLR4_4_1w1vw1vlb90pa0k.R.inc(42875);resid -= d1 * d1;
                    __CLR4_4_1w1vw1vlb90pa0k.R.inc(42876);ds += s.getEntry(i) * trialStepPoint.getEntry(i);
                    __CLR4_4_1w1vw1vlb90pa0k.R.inc(42877);shs += s.getEntry(i) * hs.getEntry(i);
                }
            }}
            }__CLR4_4_1w1vw1vlb90pa0k.R.inc(42878);if ((((resid <= ZERO)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42879)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42880)==0&false))) {{
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(42881);state = 90; __CLR4_4_1w1vw1vlb90pa0k.R.inc(42882);break;
            }
            }__CLR4_4_1w1vw1vlb90pa0k.R.inc(42883);temp = Math.sqrt(stepsq * resid + ds * ds);
            __CLR4_4_1w1vw1vlb90pa0k.R.inc(42884);if ((((ds < ZERO)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42885)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42886)==0&false))) {{
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(42887);blen = (temp - ds) / stepsq;
            } }else {{
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(42888);blen = resid / (temp + ds);
            }
            }__CLR4_4_1w1vw1vlb90pa0k.R.inc(42889);stplen = blen;
            __CLR4_4_1w1vw1vlb90pa0k.R.inc(42890);if ((((shs > ZERO)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42891)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42892)==0&false))) {{
                // Computing MIN
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(42893);stplen = Math.min(blen, gredsq / shs);
            }

            // Reduce STPLEN if necessary in order to preserve the simple bounds,
            // letting IACT be the index of the new constrained variable.

            }__CLR4_4_1w1vw1vlb90pa0k.R.inc(42894);iact = -1;
            __CLR4_4_1w1vw1vlb90pa0k.R.inc(42895);for (int i = 0; (((i < n)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42896)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42897)==0&false)); i++) {{
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(42898);if ((((s.getEntry(i) != ZERO)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42899)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42900)==0&false))) {{
                    __CLR4_4_1w1vw1vlb90pa0k.R.inc(42901);xsum = trustRegionCenterOffset.getEntry(i) + trialStepPoint.getEntry(i);
                    __CLR4_4_1w1vw1vlb90pa0k.R.inc(42902);if ((((s.getEntry(i) > ZERO)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42903)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42904)==0&false))) {{
                        __CLR4_4_1w1vw1vlb90pa0k.R.inc(42905);temp = (upperDifference.getEntry(i) - xsum) / s.getEntry(i);
                    } }else {{
                        __CLR4_4_1w1vw1vlb90pa0k.R.inc(42906);temp = (lowerDifference.getEntry(i) - xsum) / s.getEntry(i);
                    }
                    }__CLR4_4_1w1vw1vlb90pa0k.R.inc(42907);if ((((temp < stplen)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42908)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42909)==0&false))) {{
                        __CLR4_4_1w1vw1vlb90pa0k.R.inc(42910);stplen = temp;
                        __CLR4_4_1w1vw1vlb90pa0k.R.inc(42911);iact = i;
                    }
                }}
            }}

            // Update CRVMIN, GNEW and D. Set SDEC to the decrease that occurs in Q.

            }__CLR4_4_1w1vw1vlb90pa0k.R.inc(42912);sdec = ZERO;
            __CLR4_4_1w1vw1vlb90pa0k.R.inc(42913);if ((((stplen > ZERO)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42914)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42915)==0&false))) {{
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(42916);++iterc;
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(42917);temp = shs / stepsq;
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(42918);if ((((iact == -1 && temp > ZERO)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42919)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42920)==0&false))) {{
                    __CLR4_4_1w1vw1vlb90pa0k.R.inc(42921);crvmin = Math.min(crvmin,temp);
                    __CLR4_4_1w1vw1vlb90pa0k.R.inc(42922);if ((((crvmin == MINUS_ONE)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42923)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42924)==0&false))) {{
                        __CLR4_4_1w1vw1vlb90pa0k.R.inc(42925);crvmin = temp;
                    }
                }}
                }__CLR4_4_1w1vw1vlb90pa0k.R.inc(42926);ggsav = gredsq;
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(42927);gredsq = ZERO;
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(42928);for (int i = 0; (((i < n)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42929)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42930)==0&false)); i++) {{
                    __CLR4_4_1w1vw1vlb90pa0k.R.inc(42931);gnew.setEntry(i, gnew.getEntry(i) + stplen * hs.getEntry(i));
                    __CLR4_4_1w1vw1vlb90pa0k.R.inc(42932);if ((((xbdi.getEntry(i) == ZERO)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42933)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42934)==0&false))) {{
                        // Computing 2nd power
                        __CLR4_4_1w1vw1vlb90pa0k.R.inc(42935);final double d1 = gnew.getEntry(i);
                        __CLR4_4_1w1vw1vlb90pa0k.R.inc(42936);gredsq += d1 * d1;
                    }
                    }__CLR4_4_1w1vw1vlb90pa0k.R.inc(42937);trialStepPoint.setEntry(i, trialStepPoint.getEntry(i) + stplen * s.getEntry(i));
                }
                // Computing MAX
                }__CLR4_4_1w1vw1vlb90pa0k.R.inc(42938);final double d1 = stplen * (ggsav - HALF * stplen * shs);
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(42939);sdec = Math.max(d1, ZERO);
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(42940);qred += sdec;
            }

            // Restart the conjugate gradient method if it has hit a new bound.

            }__CLR4_4_1w1vw1vlb90pa0k.R.inc(42941);if ((((iact >= 0)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42942)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42943)==0&false))) {{
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(42944);++nact;
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(42945);xbdi.setEntry(iact, ONE);
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(42946);if ((((s.getEntry(iact) < ZERO)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42947)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42948)==0&false))) {{
                    __CLR4_4_1w1vw1vlb90pa0k.R.inc(42949);xbdi.setEntry(iact, MINUS_ONE);
                }
                // Computing 2nd power
                }__CLR4_4_1w1vw1vlb90pa0k.R.inc(42950);final double d1 = trialStepPoint.getEntry(iact);
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(42951);delsq -= d1 * d1;
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(42952);if ((((delsq <= ZERO)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42953)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42954)==0&false))) {{
                    __CLR4_4_1w1vw1vlb90pa0k.R.inc(42955);state = 190; __CLR4_4_1w1vw1vlb90pa0k.R.inc(42956);break;
                }
                }__CLR4_4_1w1vw1vlb90pa0k.R.inc(42957);state = 20; __CLR4_4_1w1vw1vlb90pa0k.R.inc(42958);break;
            }

            // If STPLEN is less than BLEN, then either apply another conjugate
            // gradient iteration or RETURN.

            }__CLR4_4_1w1vw1vlb90pa0k.R.inc(42959);if ((((stplen < blen)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42960)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42961)==0&false))) {{
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(42962);if ((((iterc == itermax)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42963)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42964)==0&false))) {{
                    __CLR4_4_1w1vw1vlb90pa0k.R.inc(42965);state = 190; __CLR4_4_1w1vw1vlb90pa0k.R.inc(42966);break;
                }
                }__CLR4_4_1w1vw1vlb90pa0k.R.inc(42967);if ((((sdec <= qred * .01)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42968)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42969)==0&false))) {{
                    __CLR4_4_1w1vw1vlb90pa0k.R.inc(42970);state = 190; __CLR4_4_1w1vw1vlb90pa0k.R.inc(42971);break;
                }
                }__CLR4_4_1w1vw1vlb90pa0k.R.inc(42972);beta = gredsq / ggsav;
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(42973);state = 30; __CLR4_4_1w1vw1vlb90pa0k.R.inc(42974);break;
            }
        }}
        case 90:if (!__CLB4_4_1_bool1) {__CLR4_4_1w1vw1vlb90pa0k.R.inc(42975);__CLB4_4_1_bool1=true;} {
            __CLR4_4_1w1vw1vlb90pa0k.R.inc(42976);printState(90); // XXX
            __CLR4_4_1w1vw1vlb90pa0k.R.inc(42977);crvmin = ZERO;

            // Prepare for the alternative iteration by calculating some scalars
            // and by multiplying the reduced D by the second derivative matrix of
            // Q, where S holds the reduced D in the call of GGMULT.

        }
        case 100:if (!__CLB4_4_1_bool1) {__CLR4_4_1w1vw1vlb90pa0k.R.inc(42978);__CLB4_4_1_bool1=true;} {
            __CLR4_4_1w1vw1vlb90pa0k.R.inc(42979);printState(100); // XXX
            __CLR4_4_1w1vw1vlb90pa0k.R.inc(42980);if ((((nact >= n - 1)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42981)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42982)==0&false))) {{
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(42983);state = 190; __CLR4_4_1w1vw1vlb90pa0k.R.inc(42984);break;
            }
            }__CLR4_4_1w1vw1vlb90pa0k.R.inc(42985);dredsq = ZERO;
            __CLR4_4_1w1vw1vlb90pa0k.R.inc(42986);dredg = ZERO;
            __CLR4_4_1w1vw1vlb90pa0k.R.inc(42987);gredsq = ZERO;
            __CLR4_4_1w1vw1vlb90pa0k.R.inc(42988);for (int i = 0; (((i < n)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42989)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42990)==0&false)); i++) {{
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(42991);if ((((xbdi.getEntry(i) == ZERO)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42992)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(42993)==0&false))) {{
                    // Computing 2nd power
                    __CLR4_4_1w1vw1vlb90pa0k.R.inc(42994);double d1 = trialStepPoint.getEntry(i);
                    __CLR4_4_1w1vw1vlb90pa0k.R.inc(42995);dredsq += d1 * d1;
                    __CLR4_4_1w1vw1vlb90pa0k.R.inc(42996);dredg += trialStepPoint.getEntry(i) * gnew.getEntry(i);
                    // Computing 2nd power
                    __CLR4_4_1w1vw1vlb90pa0k.R.inc(42997);d1 = gnew.getEntry(i);
                    __CLR4_4_1w1vw1vlb90pa0k.R.inc(42998);gredsq += d1 * d1;
                    __CLR4_4_1w1vw1vlb90pa0k.R.inc(42999);s.setEntry(i, trialStepPoint.getEntry(i));
                } }else {{
                    __CLR4_4_1w1vw1vlb90pa0k.R.inc(43000);s.setEntry(i, ZERO);
                }
            }}
            }__CLR4_4_1w1vw1vlb90pa0k.R.inc(43001);itcsav = iterc;
            __CLR4_4_1w1vw1vlb90pa0k.R.inc(43002);state = 210; __CLR4_4_1w1vw1vlb90pa0k.R.inc(43003);break;
            // Let the search direction S be a linear combination of the reduced D
            // and the reduced G that is orthogonal to the reduced D.
        }
        case 120:if (!__CLB4_4_1_bool1) {__CLR4_4_1w1vw1vlb90pa0k.R.inc(43004);__CLB4_4_1_bool1=true;} {
            __CLR4_4_1w1vw1vlb90pa0k.R.inc(43005);printState(120); // XXX
            __CLR4_4_1w1vw1vlb90pa0k.R.inc(43006);++iterc;
            __CLR4_4_1w1vw1vlb90pa0k.R.inc(43007);temp = gredsq * dredsq - dredg * dredg;
            __CLR4_4_1w1vw1vlb90pa0k.R.inc(43008);if ((((temp <= qred * 1e-4 * qred)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(43009)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(43010)==0&false))) {{
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(43011);state = 190; __CLR4_4_1w1vw1vlb90pa0k.R.inc(43012);break;
            }
            }__CLR4_4_1w1vw1vlb90pa0k.R.inc(43013);temp = Math.sqrt(temp);
            __CLR4_4_1w1vw1vlb90pa0k.R.inc(43014);for (int i = 0; (((i < n)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(43015)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(43016)==0&false)); i++) {{
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(43017);if ((((xbdi.getEntry(i) == ZERO)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(43018)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(43019)==0&false))) {{
                    __CLR4_4_1w1vw1vlb90pa0k.R.inc(43020);s.setEntry(i, (dredg * trialStepPoint.getEntry(i) - dredsq * gnew.getEntry(i)) / temp);
                } }else {{
                    __CLR4_4_1w1vw1vlb90pa0k.R.inc(43021);s.setEntry(i, ZERO);
                }
            }}
            }__CLR4_4_1w1vw1vlb90pa0k.R.inc(43022);sredg = -temp;

            // By considering the simple bounds on the variables, calculate an upper
            // bound on the tangent of half the angle of the alternative iteration,
            // namely ANGBD, except that, if already a free variable has reached a
            // bound, there is a branch back to label 100 after fixing that variable.

            __CLR4_4_1w1vw1vlb90pa0k.R.inc(43023);angbd = ONE;
            __CLR4_4_1w1vw1vlb90pa0k.R.inc(43024);iact = -1;
            __CLR4_4_1w1vw1vlb90pa0k.R.inc(43025);for (int i = 0; (((i < n)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(43026)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(43027)==0&false)); i++) {{
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(43028);if ((((xbdi.getEntry(i) == ZERO)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(43029)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(43030)==0&false))) {{
                    __CLR4_4_1w1vw1vlb90pa0k.R.inc(43031);tempa = trustRegionCenterOffset.getEntry(i) + trialStepPoint.getEntry(i) - lowerDifference.getEntry(i);
                    __CLR4_4_1w1vw1vlb90pa0k.R.inc(43032);tempb = upperDifference.getEntry(i) - trustRegionCenterOffset.getEntry(i) - trialStepPoint.getEntry(i);
                    __CLR4_4_1w1vw1vlb90pa0k.R.inc(43033);if ((((tempa <= ZERO)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(43034)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(43035)==0&false))) {{
                        __CLR4_4_1w1vw1vlb90pa0k.R.inc(43036);++nact;
                        __CLR4_4_1w1vw1vlb90pa0k.R.inc(43037);xbdi.setEntry(i, MINUS_ONE);
                        __CLR4_4_1w1vw1vlb90pa0k.R.inc(43038);state = 100; __CLR4_4_1w1vw1vlb90pa0k.R.inc(43039);break;
                    } }else {__CLR4_4_1w1vw1vlb90pa0k.R.inc(43040);if ((((tempb <= ZERO)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(43041)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(43042)==0&false))) {{
                        __CLR4_4_1w1vw1vlb90pa0k.R.inc(43043);++nact;
                        __CLR4_4_1w1vw1vlb90pa0k.R.inc(43044);xbdi.setEntry(i, ONE);
                        __CLR4_4_1w1vw1vlb90pa0k.R.inc(43045);state = 100; __CLR4_4_1w1vw1vlb90pa0k.R.inc(43046);break;
                    }
                    // Computing 2nd power
                    }}__CLR4_4_1w1vw1vlb90pa0k.R.inc(43047);double d1 = trialStepPoint.getEntry(i);
                    // Computing 2nd power
                    __CLR4_4_1w1vw1vlb90pa0k.R.inc(43048);double d2 = s.getEntry(i);
                    __CLR4_4_1w1vw1vlb90pa0k.R.inc(43049);ssq = d1 * d1 + d2 * d2;
                    // Computing 2nd power
                    __CLR4_4_1w1vw1vlb90pa0k.R.inc(43050);d1 = trustRegionCenterOffset.getEntry(i) - lowerDifference.getEntry(i);
                    __CLR4_4_1w1vw1vlb90pa0k.R.inc(43051);temp = ssq - d1 * d1;
                    __CLR4_4_1w1vw1vlb90pa0k.R.inc(43052);if ((((temp > ZERO)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(43053)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(43054)==0&false))) {{
                        __CLR4_4_1w1vw1vlb90pa0k.R.inc(43055);temp = Math.sqrt(temp) - s.getEntry(i);
                        __CLR4_4_1w1vw1vlb90pa0k.R.inc(43056);if ((((angbd * temp > tempa)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(43057)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(43058)==0&false))) {{
                            __CLR4_4_1w1vw1vlb90pa0k.R.inc(43059);angbd = tempa / temp;
                            __CLR4_4_1w1vw1vlb90pa0k.R.inc(43060);iact = i;
                            __CLR4_4_1w1vw1vlb90pa0k.R.inc(43061);xsav = MINUS_ONE;
                        }
                    }}
                    // Computing 2nd power
                    }__CLR4_4_1w1vw1vlb90pa0k.R.inc(43062);d1 = upperDifference.getEntry(i) - trustRegionCenterOffset.getEntry(i);
                    __CLR4_4_1w1vw1vlb90pa0k.R.inc(43063);temp = ssq - d1 * d1;
                    __CLR4_4_1w1vw1vlb90pa0k.R.inc(43064);if ((((temp > ZERO)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(43065)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(43066)==0&false))) {{
                        __CLR4_4_1w1vw1vlb90pa0k.R.inc(43067);temp = Math.sqrt(temp) + s.getEntry(i);
                        __CLR4_4_1w1vw1vlb90pa0k.R.inc(43068);if ((((angbd * temp > tempb)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(43069)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(43070)==0&false))) {{
                            __CLR4_4_1w1vw1vlb90pa0k.R.inc(43071);angbd = tempb / temp;
                            __CLR4_4_1w1vw1vlb90pa0k.R.inc(43072);iact = i;
                            __CLR4_4_1w1vw1vlb90pa0k.R.inc(43073);xsav = ONE;
                        }
                    }}
                }}
            }}

            // Calculate HHD and some curvatures for the alternative iteration.

            }__CLR4_4_1w1vw1vlb90pa0k.R.inc(43074);state = 210; __CLR4_4_1w1vw1vlb90pa0k.R.inc(43075);break;
        }
        case 150:if (!__CLB4_4_1_bool1) {__CLR4_4_1w1vw1vlb90pa0k.R.inc(43076);__CLB4_4_1_bool1=true;} {
            __CLR4_4_1w1vw1vlb90pa0k.R.inc(43077);printState(150); // XXX
            __CLR4_4_1w1vw1vlb90pa0k.R.inc(43078);shs = ZERO;
            __CLR4_4_1w1vw1vlb90pa0k.R.inc(43079);dhs = ZERO;
            __CLR4_4_1w1vw1vlb90pa0k.R.inc(43080);dhd = ZERO;
            __CLR4_4_1w1vw1vlb90pa0k.R.inc(43081);for (int i = 0; (((i < n)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(43082)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(43083)==0&false)); i++) {{
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(43084);if ((((xbdi.getEntry(i) == ZERO)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(43085)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(43086)==0&false))) {{
                    __CLR4_4_1w1vw1vlb90pa0k.R.inc(43087);shs += s.getEntry(i) * hs.getEntry(i);
                    __CLR4_4_1w1vw1vlb90pa0k.R.inc(43088);dhs += trialStepPoint.getEntry(i) * hs.getEntry(i);
                    __CLR4_4_1w1vw1vlb90pa0k.R.inc(43089);dhd += trialStepPoint.getEntry(i) * hred.getEntry(i);
                }
            }}

            // Seek the greatest reduction in Q for a range of equally spaced values
            // of ANGT in [0,ANGBD], where ANGT is the tangent of half the angle of
            // the alternative iteration.

            }__CLR4_4_1w1vw1vlb90pa0k.R.inc(43090);redmax = ZERO;
            __CLR4_4_1w1vw1vlb90pa0k.R.inc(43091);isav = -1;
            __CLR4_4_1w1vw1vlb90pa0k.R.inc(43092);redsav = ZERO;
            __CLR4_4_1w1vw1vlb90pa0k.R.inc(43093);iu = (int) (angbd * 17. + 3.1);
            __CLR4_4_1w1vw1vlb90pa0k.R.inc(43094);for (int i = 0; (((i < iu)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(43095)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(43096)==0&false)); i++) {{
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(43097);angt = angbd * i / iu;
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(43098);sth = (angt + angt) / (ONE + angt * angt);
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(43099);temp = shs + angt * (angt * dhd - dhs - dhs);
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(43100);rednew = sth * (angt * dredg - sredg - HALF * sth * temp);
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(43101);if ((((rednew > redmax)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(43102)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(43103)==0&false))) {{
                    __CLR4_4_1w1vw1vlb90pa0k.R.inc(43104);redmax = rednew;
                    __CLR4_4_1w1vw1vlb90pa0k.R.inc(43105);isav = i;
                    __CLR4_4_1w1vw1vlb90pa0k.R.inc(43106);rdprev = redsav;
                } }else {__CLR4_4_1w1vw1vlb90pa0k.R.inc(43107);if ((((i == isav + 1)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(43108)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(43109)==0&false))) {{
                    __CLR4_4_1w1vw1vlb90pa0k.R.inc(43110);rdnext = rednew;
                }
                }}__CLR4_4_1w1vw1vlb90pa0k.R.inc(43111);redsav = rednew;
            }

            // Return if the reduction is zero. Otherwise, set the sine and cosine
            // of the angle of the alternative iteration, and calculate SDEC.

            }__CLR4_4_1w1vw1vlb90pa0k.R.inc(43112);if ((((isav < 0)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(43113)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(43114)==0&false))) {{
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(43115);state = 190; __CLR4_4_1w1vw1vlb90pa0k.R.inc(43116);break;
            }
            }__CLR4_4_1w1vw1vlb90pa0k.R.inc(43117);if ((((isav < iu)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(43118)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(43119)==0&false))) {{
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(43120);temp = (rdnext - rdprev) / (redmax + redmax - rdprev - rdnext);
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(43121);angt = angbd * (isav + HALF * temp) / iu;
            }
            }__CLR4_4_1w1vw1vlb90pa0k.R.inc(43122);cth = (ONE - angt * angt) / (ONE + angt * angt);
            __CLR4_4_1w1vw1vlb90pa0k.R.inc(43123);sth = (angt + angt) / (ONE + angt * angt);
            __CLR4_4_1w1vw1vlb90pa0k.R.inc(43124);temp = shs + angt * (angt * dhd - dhs - dhs);
            __CLR4_4_1w1vw1vlb90pa0k.R.inc(43125);sdec = sth * (angt * dredg - sredg - HALF * sth * temp);
            __CLR4_4_1w1vw1vlb90pa0k.R.inc(43126);if ((((sdec <= ZERO)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(43127)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(43128)==0&false))) {{
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(43129);state = 190; __CLR4_4_1w1vw1vlb90pa0k.R.inc(43130);break;
            }

            // Update GNEW, D and HRED. If the angle of the alternative iteration
            // is restricted by a bound on a free variable, that variable is fixed
            // at the bound.

            }__CLR4_4_1w1vw1vlb90pa0k.R.inc(43131);dredg = ZERO;
            __CLR4_4_1w1vw1vlb90pa0k.R.inc(43132);gredsq = ZERO;
            __CLR4_4_1w1vw1vlb90pa0k.R.inc(43133);for (int i = 0; (((i < n)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(43134)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(43135)==0&false)); i++) {{
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(43136);gnew.setEntry(i, gnew.getEntry(i) + (cth - ONE) * hred.getEntry(i) + sth * hs.getEntry(i));
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(43137);if ((((xbdi.getEntry(i) == ZERO)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(43138)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(43139)==0&false))) {{
                    __CLR4_4_1w1vw1vlb90pa0k.R.inc(43140);trialStepPoint.setEntry(i, cth * trialStepPoint.getEntry(i) + sth * s.getEntry(i));
                    __CLR4_4_1w1vw1vlb90pa0k.R.inc(43141);dredg += trialStepPoint.getEntry(i) * gnew.getEntry(i);
                    // Computing 2nd power
                    __CLR4_4_1w1vw1vlb90pa0k.R.inc(43142);final double d1 = gnew.getEntry(i);
                    __CLR4_4_1w1vw1vlb90pa0k.R.inc(43143);gredsq += d1 * d1;
                }
                }__CLR4_4_1w1vw1vlb90pa0k.R.inc(43144);hred.setEntry(i, cth * hred.getEntry(i) + sth * hs.getEntry(i));
            }
            }__CLR4_4_1w1vw1vlb90pa0k.R.inc(43145);qred += sdec;
            __CLR4_4_1w1vw1vlb90pa0k.R.inc(43146);if ((((iact >= 0 && isav == iu)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(43147)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(43148)==0&false))) {{
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(43149);++nact;
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(43150);xbdi.setEntry(iact, xsav);
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(43151);state = 100; __CLR4_4_1w1vw1vlb90pa0k.R.inc(43152);break;
            }

            // If SDEC is sufficiently small, then RETURN after setting XNEW to
            // XOPT+D, giving careful attention to the bounds.

            }__CLR4_4_1w1vw1vlb90pa0k.R.inc(43153);if ((((sdec > qred * .01)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(43154)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(43155)==0&false))) {{
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(43156);state = 120; __CLR4_4_1w1vw1vlb90pa0k.R.inc(43157);break;
            }
        }}
        case 190:if (!__CLB4_4_1_bool1) {__CLR4_4_1w1vw1vlb90pa0k.R.inc(43158);__CLB4_4_1_bool1=true;} {
            __CLR4_4_1w1vw1vlb90pa0k.R.inc(43159);printState(190); // XXX
            __CLR4_4_1w1vw1vlb90pa0k.R.inc(43160);dsq = ZERO;
            __CLR4_4_1w1vw1vlb90pa0k.R.inc(43161);for (int i = 0; (((i < n)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(43162)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(43163)==0&false)); i++) {{
                // Computing MAX
                // Computing MIN
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(43164);final double min = Math.min(trustRegionCenterOffset.getEntry(i) + trialStepPoint.getEntry(i),
                                            upperDifference.getEntry(i));
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(43165);newPoint.setEntry(i, Math.max(min, lowerDifference.getEntry(i)));
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(43166);if ((((xbdi.getEntry(i) == MINUS_ONE)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(43167)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(43168)==0&false))) {{
                    __CLR4_4_1w1vw1vlb90pa0k.R.inc(43169);newPoint.setEntry(i, lowerDifference.getEntry(i));
                }
                }__CLR4_4_1w1vw1vlb90pa0k.R.inc(43170);if ((((xbdi.getEntry(i) == ONE)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(43171)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(43172)==0&false))) {{
                    __CLR4_4_1w1vw1vlb90pa0k.R.inc(43173);newPoint.setEntry(i, upperDifference.getEntry(i));
                }
                }__CLR4_4_1w1vw1vlb90pa0k.R.inc(43174);trialStepPoint.setEntry(i, newPoint.getEntry(i) - trustRegionCenterOffset.getEntry(i));
                // Computing 2nd power
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(43175);final double d1 = trialStepPoint.getEntry(i);
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(43176);dsq += d1 * d1;
            }
            }__CLR4_4_1w1vw1vlb90pa0k.R.inc(43177);return new double[] { dsq, crvmin };
            // The following instructions multiply the current S-vector by the second
            // derivative matrix of the quadratic model, putting the product in HS.
            // They are reached from three different parts of the software above and
            // they can be regarded as an external subroutine.
        }
        case 210:if (!__CLB4_4_1_bool1) {__CLR4_4_1w1vw1vlb90pa0k.R.inc(43178);__CLB4_4_1_bool1=true;} {
            __CLR4_4_1w1vw1vlb90pa0k.R.inc(43179);printState(210); // XXX
            __CLR4_4_1w1vw1vlb90pa0k.R.inc(43180);int ih = 0;
            __CLR4_4_1w1vw1vlb90pa0k.R.inc(43181);for (int j = 0; (((j < n)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(43182)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(43183)==0&false)); j++) {{
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(43184);hs.setEntry(j, ZERO);
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(43185);for (int i = 0; (((i <= j)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(43186)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(43187)==0&false)); i++) {{
                    __CLR4_4_1w1vw1vlb90pa0k.R.inc(43188);if ((((i < j)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(43189)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(43190)==0&false))) {{
                        __CLR4_4_1w1vw1vlb90pa0k.R.inc(43191);hs.setEntry(j, hs.getEntry(j) + modelSecondDerivativesValues.getEntry(ih) * s.getEntry(i));
                    }
                    }__CLR4_4_1w1vw1vlb90pa0k.R.inc(43192);hs.setEntry(i, hs.getEntry(i) + modelSecondDerivativesValues.getEntry(ih) * s.getEntry(j));
                    __CLR4_4_1w1vw1vlb90pa0k.R.inc(43193);ih++;
                }
            }}
            }__CLR4_4_1w1vw1vlb90pa0k.R.inc(43194);final RealVector tmp = interpolationPoints.operate(s).ebeMultiply(modelSecondDerivativesParameters);
            __CLR4_4_1w1vw1vlb90pa0k.R.inc(43195);for (int k = 0; (((k < npt)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(43196)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(43197)==0&false)); k++) {{
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(43198);if ((((modelSecondDerivativesParameters.getEntry(k) != ZERO)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(43199)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(43200)==0&false))) {{
                    __CLR4_4_1w1vw1vlb90pa0k.R.inc(43201);for (int i = 0; (((i < n)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(43202)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(43203)==0&false)); i++) {{
                        __CLR4_4_1w1vw1vlb90pa0k.R.inc(43204);hs.setEntry(i, hs.getEntry(i) + tmp.getEntry(k) * interpolationPoints.getEntry(k, i));
                    }
                }}
            }}
            }__CLR4_4_1w1vw1vlb90pa0k.R.inc(43205);if ((((crvmin != ZERO)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(43206)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(43207)==0&false))) {{
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(43208);state = 50; __CLR4_4_1w1vw1vlb90pa0k.R.inc(43209);break;
            }
            }__CLR4_4_1w1vw1vlb90pa0k.R.inc(43210);if ((((iterc > itcsav)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(43211)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(43212)==0&false))) {{
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(43213);state = 150; __CLR4_4_1w1vw1vlb90pa0k.R.inc(43214);break;
            }
            }__CLR4_4_1w1vw1vlb90pa0k.R.inc(43215);for (int i = 0; (((i < n)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(43216)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(43217)==0&false)); i++) {{
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(43218);hred.setEntry(i, hs.getEntry(i));
            }
            }__CLR4_4_1w1vw1vlb90pa0k.R.inc(43219);state = 120; __CLR4_4_1w1vw1vlb90pa0k.R.inc(43220);break;
        }
        default:if (!__CLB4_4_1_bool1) {__CLR4_4_1w1vw1vlb90pa0k.R.inc(43221);__CLB4_4_1_bool1=true;} {
            __CLR4_4_1w1vw1vlb90pa0k.R.inc(43222);throw new MathIllegalStateException(LocalizedFormats.SIMPLE_MESSAGE, "trsbox");
        }}
        }
    }}finally{__CLR4_4_1w1vw1vlb90pa0k.R.flushNeeded();}} // trsbox

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
    ) {try{__CLR4_4_1w1vw1vlb90pa0k.R.inc(43223);
        __CLR4_4_1w1vw1vlb90pa0k.R.inc(43224);printMethod(); // XXX

        __CLR4_4_1w1vw1vlb90pa0k.R.inc(43225);final int n = currentBest.getDimension();
        __CLR4_4_1w1vw1vlb90pa0k.R.inc(43226);final int npt = numberOfInterpolationPoints;
        __CLR4_4_1w1vw1vlb90pa0k.R.inc(43227);final int nptm = npt - n - 1;

        // XXX Should probably be split into two arrays.
        __CLR4_4_1w1vw1vlb90pa0k.R.inc(43228);final ArrayRealVector work = new ArrayRealVector(npt + n);

        __CLR4_4_1w1vw1vlb90pa0k.R.inc(43229);double ztest = ZERO;
        __CLR4_4_1w1vw1vlb90pa0k.R.inc(43230);for (int k = 0; (((k < npt)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(43231)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(43232)==0&false)); k++) {{
            __CLR4_4_1w1vw1vlb90pa0k.R.inc(43233);for (int j = 0; (((j < nptm)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(43234)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(43235)==0&false)); j++) {{
                // Computing MAX
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(43236);ztest = Math.max(ztest, Math.abs(zMatrix.getEntry(k, j)));
            }
        }}
        }__CLR4_4_1w1vw1vlb90pa0k.R.inc(43237);ztest *= 1e-20;

        // Apply the rotations that put zeros in the KNEW-th row of ZMAT.

        __CLR4_4_1w1vw1vlb90pa0k.R.inc(43238);for (int j = 1; (((j < nptm)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(43239)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(43240)==0&false)); j++) {{
            __CLR4_4_1w1vw1vlb90pa0k.R.inc(43241);final double d1 = zMatrix.getEntry(knew, j);
            __CLR4_4_1w1vw1vlb90pa0k.R.inc(43242);if ((((Math.abs(d1) > ztest)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(43243)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(43244)==0&false))) {{
                // Computing 2nd power
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(43245);final double d2 = zMatrix.getEntry(knew, 0);
                // Computing 2nd power
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(43246);final double d3 = zMatrix.getEntry(knew, j);
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(43247);final double d4 = Math.sqrt(d2 * d2 + d3 * d3);
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(43248);final double d5 = zMatrix.getEntry(knew, 0) / d4;
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(43249);final double d6 = zMatrix.getEntry(knew, j) / d4;
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(43250);for (int i = 0; (((i < npt)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(43251)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(43252)==0&false)); i++) {{
                    __CLR4_4_1w1vw1vlb90pa0k.R.inc(43253);final double d7 = d5 * zMatrix.getEntry(i, 0) + d6 * zMatrix.getEntry(i, j);
                    __CLR4_4_1w1vw1vlb90pa0k.R.inc(43254);zMatrix.setEntry(i, j, d5 * zMatrix.getEntry(i, j) - d6 * zMatrix.getEntry(i, 0));
                    __CLR4_4_1w1vw1vlb90pa0k.R.inc(43255);zMatrix.setEntry(i, 0, d7);
                }
            }}
            }__CLR4_4_1w1vw1vlb90pa0k.R.inc(43256);zMatrix.setEntry(knew, j, ZERO);
        }

        // Put the first NPT components of the KNEW-th column of HLAG into W,
        // and calculate the parameters of the updating formula.

        }__CLR4_4_1w1vw1vlb90pa0k.R.inc(43257);for (int i = 0; (((i < npt)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(43258)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(43259)==0&false)); i++) {{
            __CLR4_4_1w1vw1vlb90pa0k.R.inc(43260);work.setEntry(i, zMatrix.getEntry(knew, 0) * zMatrix.getEntry(i, 0));
        }
        }__CLR4_4_1w1vw1vlb90pa0k.R.inc(43261);final double alpha = work.getEntry(knew);
        __CLR4_4_1w1vw1vlb90pa0k.R.inc(43262);final double tau = lagrangeValuesAtNewPoint.getEntry(knew);
        __CLR4_4_1w1vw1vlb90pa0k.R.inc(43263);lagrangeValuesAtNewPoint.setEntry(knew, lagrangeValuesAtNewPoint.getEntry(knew) - ONE);

        // Complete the updating of ZMAT.

        __CLR4_4_1w1vw1vlb90pa0k.R.inc(43264);final double sqrtDenom = Math.sqrt(denom);
        __CLR4_4_1w1vw1vlb90pa0k.R.inc(43265);final double d1 = tau / sqrtDenom;
        __CLR4_4_1w1vw1vlb90pa0k.R.inc(43266);final double d2 = zMatrix.getEntry(knew, 0) / sqrtDenom;
        __CLR4_4_1w1vw1vlb90pa0k.R.inc(43267);for (int i = 0; (((i < npt)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(43268)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(43269)==0&false)); i++) {{
            __CLR4_4_1w1vw1vlb90pa0k.R.inc(43270);zMatrix.setEntry(i, 0,
                          d1 * zMatrix.getEntry(i, 0) - d2 * lagrangeValuesAtNewPoint.getEntry(i));
        }

        // Finally, update the matrix BMAT.

        }__CLR4_4_1w1vw1vlb90pa0k.R.inc(43271);for (int j = 0; (((j < n)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(43272)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(43273)==0&false)); j++) {{
            __CLR4_4_1w1vw1vlb90pa0k.R.inc(43274);final int jp = npt + j;
            __CLR4_4_1w1vw1vlb90pa0k.R.inc(43275);work.setEntry(jp, bMatrix.getEntry(knew, j));
            __CLR4_4_1w1vw1vlb90pa0k.R.inc(43276);final double d3 = (alpha * lagrangeValuesAtNewPoint.getEntry(jp) - tau * work.getEntry(jp)) / denom;
            __CLR4_4_1w1vw1vlb90pa0k.R.inc(43277);final double d4 = (-beta * work.getEntry(jp) - tau * lagrangeValuesAtNewPoint.getEntry(jp)) / denom;
            __CLR4_4_1w1vw1vlb90pa0k.R.inc(43278);for (int i = 0; (((i <= jp)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(43279)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(43280)==0&false)); i++) {{
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(43281);bMatrix.setEntry(i, j,
                              bMatrix.getEntry(i, j) + d3 * lagrangeValuesAtNewPoint.getEntry(i) + d4 * work.getEntry(i));
                __CLR4_4_1w1vw1vlb90pa0k.R.inc(43282);if ((((i >= npt)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(43283)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(43284)==0&false))) {{
                    __CLR4_4_1w1vw1vlb90pa0k.R.inc(43285);bMatrix.setEntry(jp, (i - npt), bMatrix.getEntry(i, j));
                }
            }}
        }}
    }}finally{__CLR4_4_1w1vw1vlb90pa0k.R.flushNeeded();}} // update

    /**
     * Performs validity checks.
     *
     * @param lowerBound Lower bounds (constraints) of the objective variables.
     * @param upperBound Upperer bounds (constraints) of the objective variables.
     */
    private void setup(double[] lowerBound,
                       double[] upperBound) {try{__CLR4_4_1w1vw1vlb90pa0k.R.inc(43286);
        __CLR4_4_1w1vw1vlb90pa0k.R.inc(43287);printMethod(); // XXX

        __CLR4_4_1w1vw1vlb90pa0k.R.inc(43288);double[] init = getStartPoint();
        __CLR4_4_1w1vw1vlb90pa0k.R.inc(43289);final int dimension = init.length;

        // Check problem dimension.
        __CLR4_4_1w1vw1vlb90pa0k.R.inc(43290);if ((((dimension < MINIMUM_PROBLEM_DIMENSION)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(43291)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(43292)==0&false))) {{
            __CLR4_4_1w1vw1vlb90pa0k.R.inc(43293);throw new NumberIsTooSmallException(dimension, MINIMUM_PROBLEM_DIMENSION, true);
        }
        // Check number of interpolation points.
        }__CLR4_4_1w1vw1vlb90pa0k.R.inc(43294);final int[] nPointsInterval = { dimension + 2, (dimension + 2) * (dimension + 1) / 2 };
        __CLR4_4_1w1vw1vlb90pa0k.R.inc(43295);if ((((numberOfInterpolationPoints < nPointsInterval[0] ||
            numberOfInterpolationPoints > nPointsInterval[1])&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(43296)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(43297)==0&false))) {{
            __CLR4_4_1w1vw1vlb90pa0k.R.inc(43298);throw new OutOfRangeException(LocalizedFormats.NUMBER_OF_INTERPOLATION_POINTS,
                                          numberOfInterpolationPoints,
                                          nPointsInterval[0],
                                          nPointsInterval[1]);
        }

        // Initialize bound differences.
        }__CLR4_4_1w1vw1vlb90pa0k.R.inc(43299);boundDifference = new double[dimension];

        __CLR4_4_1w1vw1vlb90pa0k.R.inc(43300);double requiredMinDiff = 2 * initialTrustRegionRadius;
        __CLR4_4_1w1vw1vlb90pa0k.R.inc(43301);double minDiff = Double.POSITIVE_INFINITY;
        __CLR4_4_1w1vw1vlb90pa0k.R.inc(43302);for (int i = 0; (((i < dimension)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(43303)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(43304)==0&false)); i++) {{
            __CLR4_4_1w1vw1vlb90pa0k.R.inc(43305);boundDifference[i] = upperBound[i] - lowerBound[i];
            __CLR4_4_1w1vw1vlb90pa0k.R.inc(43306);minDiff = Math.min(minDiff, boundDifference[i]);
        }
        }__CLR4_4_1w1vw1vlb90pa0k.R.inc(43307);if ((((minDiff < requiredMinDiff)&&(__CLR4_4_1w1vw1vlb90pa0k.R.iget(43308)!=0|true))||(__CLR4_4_1w1vw1vlb90pa0k.R.iget(43309)==0&false))) {{
            __CLR4_4_1w1vw1vlb90pa0k.R.inc(43310);initialTrustRegionRadius = minDiff / 3.0;
        }

        // Initialize the data structures used by the "bobyqa" method.
        }__CLR4_4_1w1vw1vlb90pa0k.R.inc(43311);bMatrix = new Array2DRowRealMatrix(dimension + numberOfInterpolationPoints,
                                           dimension);
        __CLR4_4_1w1vw1vlb90pa0k.R.inc(43312);zMatrix = new Array2DRowRealMatrix(numberOfInterpolationPoints,
                                           numberOfInterpolationPoints - dimension - 1);
        __CLR4_4_1w1vw1vlb90pa0k.R.inc(43313);interpolationPoints = new Array2DRowRealMatrix(numberOfInterpolationPoints,
                                                       dimension);
        __CLR4_4_1w1vw1vlb90pa0k.R.inc(43314);originShift = new ArrayRealVector(dimension);
        __CLR4_4_1w1vw1vlb90pa0k.R.inc(43315);fAtInterpolationPoints = new ArrayRealVector(numberOfInterpolationPoints);
        __CLR4_4_1w1vw1vlb90pa0k.R.inc(43316);trustRegionCenterOffset = new ArrayRealVector(dimension);
        __CLR4_4_1w1vw1vlb90pa0k.R.inc(43317);gradientAtTrustRegionCenter = new ArrayRealVector(dimension);
        __CLR4_4_1w1vw1vlb90pa0k.R.inc(43318);lowerDifference = new ArrayRealVector(dimension);
        __CLR4_4_1w1vw1vlb90pa0k.R.inc(43319);upperDifference = new ArrayRealVector(dimension);
        __CLR4_4_1w1vw1vlb90pa0k.R.inc(43320);modelSecondDerivativesParameters = new ArrayRealVector(numberOfInterpolationPoints);
        __CLR4_4_1w1vw1vlb90pa0k.R.inc(43321);newPoint = new ArrayRealVector(dimension);
        __CLR4_4_1w1vw1vlb90pa0k.R.inc(43322);alternativeNewPoint = new ArrayRealVector(dimension);
        __CLR4_4_1w1vw1vlb90pa0k.R.inc(43323);trialStepPoint = new ArrayRealVector(dimension);
        __CLR4_4_1w1vw1vlb90pa0k.R.inc(43324);lagrangeValuesAtNewPoint = new ArrayRealVector(dimension + numberOfInterpolationPoints);
        __CLR4_4_1w1vw1vlb90pa0k.R.inc(43325);modelSecondDerivativesValues = new ArrayRealVector(dimension * (dimension + 1) / 2);
    }finally{__CLR4_4_1w1vw1vlb90pa0k.R.flushNeeded();}}

    // XXX utility for figuring out call sequence.
    private static String caller(int n) {try{__CLR4_4_1w1vw1vlb90pa0k.R.inc(43326);
        __CLR4_4_1w1vw1vlb90pa0k.R.inc(43327);final Throwable t = new Throwable();
        __CLR4_4_1w1vw1vlb90pa0k.R.inc(43328);final StackTraceElement[] elements = t.getStackTrace();
        __CLR4_4_1w1vw1vlb90pa0k.R.inc(43329);final StackTraceElement e = elements[n];
        __CLR4_4_1w1vw1vlb90pa0k.R.inc(43330);return e.getMethodName() + " (at line " + e.getLineNumber() + ")";
    }finally{__CLR4_4_1w1vw1vlb90pa0k.R.flushNeeded();}}
    // XXX utility for figuring out call sequence.
    private static void printState(int s) {try{__CLR4_4_1w1vw1vlb90pa0k.R.inc(43331);
        //        System.out.println(caller(2) + ": state " + s);
    }finally{__CLR4_4_1w1vw1vlb90pa0k.R.flushNeeded();}}
    // XXX utility for figuring out call sequence.
    private static void printMethod() {try{__CLR4_4_1w1vw1vlb90pa0k.R.inc(43332);
        //        System.out.println(caller(2));
    }finally{__CLR4_4_1w1vw1vlb90pa0k.R.flushNeeded();}}

    /**
     * Marker for code paths that are not explored with the current unit tests.
     * If the path becomes explored, it should just be removed from the code.
     */
    private static class PathIsExploredException extends RuntimeException {
        private static final long serialVersionUID = 745350979634801853L;

        private static final String PATH_IS_EXPLORED
            = "If this exception is thrown, just remove it from the code";

        PathIsExploredException() {
            super(PATH_IS_EXPLORED + " " + BOBYQAOptimizer.caller(3));__CLR4_4_1w1vw1vlb90pa0k.R.inc(43334);try{__CLR4_4_1w1vw1vlb90pa0k.R.inc(43333);
        }finally{__CLR4_4_1w1vw1vlb90pa0k.R.flushNeeded();}}
    }
}
//CHECKSTYLE: resume all
