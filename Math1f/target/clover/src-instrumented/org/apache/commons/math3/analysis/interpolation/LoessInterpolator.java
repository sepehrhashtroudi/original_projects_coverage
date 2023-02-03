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
package org.apache.commons.math3.analysis.interpolation;

import java.io.Serializable;
import java.util.Arrays;

import org.apache.commons.math3.analysis.polynomials.PolynomialSplineFunction;
import org.apache.commons.math3.exception.NotPositiveException;
import org.apache.commons.math3.exception.OutOfRangeException;
import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.exception.NoDataException;
import org.apache.commons.math3.exception.NumberIsTooSmallException;
import org.apache.commons.math3.exception.NonMonotonicSequenceException;
import org.apache.commons.math3.exception.NotFiniteNumberException;
import org.apache.commons.math3.exception.util.LocalizedFormats;
import org.apache.commons.math3.util.FastMath;
import org.apache.commons.math3.util.MathUtils;
import org.apache.commons.math3.util.MathArrays;

/**
 * Implements the <a href="http://en.wikipedia.org/wiki/Local_regression">
 * Local Regression Algorithm</a> (also Loess, Lowess) for interpolation of
 * real univariate functions.
 * <p/>
 * For reference, see
 * <a href="http://www.math.tau.ac.il/~yekutiel/MA seminar/Cleveland 1979.pdf">
 * William S. Cleveland - Robust Locally Weighted Regression and Smoothing
 * Scatterplots</a>
 * <p/>
 * This class implements both the loess method and serves as an interpolation
 * adapter to it, allowing one to build a spline on the obtained loess fit.
 *
 * @version $Id$
 * @since 2.0
 */
public class LoessInterpolator
    implements UnivariateInterpolator, Serializable {public static class __CLR4_4_12uf2uflb90p6u7{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,3853,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /** Default value of the bandwidth parameter. */
    public static final double DEFAULT_BANDWIDTH = 0.3;
    /** Default value of the number of robustness iterations. */
    public static final int DEFAULT_ROBUSTNESS_ITERS = 2;
    /**
     * Default value for accuracy.
     * @since 2.1
     */
    public static final double DEFAULT_ACCURACY = 1e-12;
    /** serializable version identifier. */
    private static final long serialVersionUID = 5204927143605193821L;
    /**
     * The bandwidth parameter: when computing the loess fit at
     * a particular point, this fraction of source points closest
     * to the current point is taken into account for computing
     * a least-squares regression.
     * <p/>
     * A sensible value is usually 0.25 to 0.5.
     */
    private final double bandwidth;
    /**
     * The number of robustness iterations parameter: this many
     * robustness iterations are done.
     * <p/>
     * A sensible value is usually 0 (just the initial fit without any
     * robustness iterations) to 4.
     */
    private final int robustnessIters;
    /**
     * If the median residual at a certain robustness iteration
     * is less than this amount, no more iterations are done.
     */
    private final double accuracy;

    /**
     * Constructs a new {@link LoessInterpolator}
     * with a bandwidth of {@link #DEFAULT_BANDWIDTH},
     * {@link #DEFAULT_ROBUSTNESS_ITERS} robustness iterations
     * and an accuracy of {#link #DEFAULT_ACCURACY}.
     * See {@link #LoessInterpolator(double, int, double)} for an explanation of
     * the parameters.
     */
    public LoessInterpolator() {try{__CLR4_4_12uf2uflb90p6u7.R.inc(3687);
        __CLR4_4_12uf2uflb90p6u7.R.inc(3688);this.bandwidth = DEFAULT_BANDWIDTH;
        __CLR4_4_12uf2uflb90p6u7.R.inc(3689);this.robustnessIters = DEFAULT_ROBUSTNESS_ITERS;
        __CLR4_4_12uf2uflb90p6u7.R.inc(3690);this.accuracy = DEFAULT_ACCURACY;
    }finally{__CLR4_4_12uf2uflb90p6u7.R.flushNeeded();}}

    /**
     * Construct a new {@link LoessInterpolator}
     * with given bandwidth and number of robustness iterations.
     * <p>
     * Calling this constructor is equivalent to calling {link {@link
     * #LoessInterpolator(double, int, double) LoessInterpolator(bandwidth,
     * robustnessIters, LoessInterpolator.DEFAULT_ACCURACY)}
     * </p>
     *
     * @param bandwidth  when computing the loess fit at
     * a particular point, this fraction of source points closest
     * to the current point is taken into account for computing
     * a least-squares regression.</br>
     * A sensible value is usually 0.25 to 0.5, the default value is
     * {@link #DEFAULT_BANDWIDTH}.
     * @param robustnessIters This many robustness iterations are done.</br>
     * A sensible value is usually 0 (just the initial fit without any
     * robustness iterations) to 4, the default value is
     * {@link #DEFAULT_ROBUSTNESS_ITERS}.

     * @see #LoessInterpolator(double, int, double)
     */
    public LoessInterpolator(double bandwidth, int robustnessIters) {
        this(bandwidth, robustnessIters, DEFAULT_ACCURACY);__CLR4_4_12uf2uflb90p6u7.R.inc(3692);try{__CLR4_4_12uf2uflb90p6u7.R.inc(3691);
    }finally{__CLR4_4_12uf2uflb90p6u7.R.flushNeeded();}}

    /**
     * Construct a new {@link LoessInterpolator}
     * with given bandwidth, number of robustness iterations and accuracy.
     *
     * @param bandwidth  when computing the loess fit at
     * a particular point, this fraction of source points closest
     * to the current point is taken into account for computing
     * a least-squares regression.</br>
     * A sensible value is usually 0.25 to 0.5, the default value is
     * {@link #DEFAULT_BANDWIDTH}.
     * @param robustnessIters This many robustness iterations are done.</br>
     * A sensible value is usually 0 (just the initial fit without any
     * robustness iterations) to 4, the default value is
     * {@link #DEFAULT_ROBUSTNESS_ITERS}.
     * @param accuracy If the median residual at a certain robustness iteration
     * is less than this amount, no more iterations are done.
     * @throws OutOfRangeException if bandwidth does not lie in the interval [0,1].
     * @throws NotPositiveException if {@code robustnessIters} is negative.
     * @see #LoessInterpolator(double, int)
     * @since 2.1
     */
    public LoessInterpolator(double bandwidth, int robustnessIters, double accuracy)
        throws OutOfRangeException,
               NotPositiveException {try{__CLR4_4_12uf2uflb90p6u7.R.inc(3693);
        __CLR4_4_12uf2uflb90p6u7.R.inc(3694);if ((((bandwidth < 0 ||
            bandwidth > 1)&&(__CLR4_4_12uf2uflb90p6u7.R.iget(3695)!=0|true))||(__CLR4_4_12uf2uflb90p6u7.R.iget(3696)==0&false))) {{
            __CLR4_4_12uf2uflb90p6u7.R.inc(3697);throw new OutOfRangeException(LocalizedFormats.BANDWIDTH, bandwidth, 0, 1);
        }
        }__CLR4_4_12uf2uflb90p6u7.R.inc(3698);this.bandwidth = bandwidth;
        __CLR4_4_12uf2uflb90p6u7.R.inc(3699);if ((((robustnessIters < 0)&&(__CLR4_4_12uf2uflb90p6u7.R.iget(3700)!=0|true))||(__CLR4_4_12uf2uflb90p6u7.R.iget(3701)==0&false))) {{
            __CLR4_4_12uf2uflb90p6u7.R.inc(3702);throw new NotPositiveException(LocalizedFormats.ROBUSTNESS_ITERATIONS, robustnessIters);
        }
        }__CLR4_4_12uf2uflb90p6u7.R.inc(3703);this.robustnessIters = robustnessIters;
        __CLR4_4_12uf2uflb90p6u7.R.inc(3704);this.accuracy = accuracy;
    }finally{__CLR4_4_12uf2uflb90p6u7.R.flushNeeded();}}

    /**
     * Compute an interpolating function by performing a loess fit
     * on the data at the original abscissae and then building a cubic spline
     * with a
     * {@link org.apache.commons.math3.analysis.interpolation.SplineInterpolator}
     * on the resulting fit.
     *
     * @param xval the arguments for the interpolation points
     * @param yval the values for the interpolation points
     * @return A cubic spline built upon a loess fit to the data at the original abscissae
     * @throws NonMonotonicSequenceException if {@code xval} not sorted in
     * strictly increasing order.
     * @throws DimensionMismatchException if {@code xval} and {@code yval} have
     * different sizes.
     * @throws NoDataException if {@code xval} or {@code yval} has zero size.
     * @throws NotFiniteNumberException if any of the arguments and values are
     * not finite real numbers.
     * @throws NumberIsTooSmallException if the bandwidth is too small to
     * accomodate the size of the input data (i.e. the bandwidth must be
     * larger than 2/n).
     */
    public final PolynomialSplineFunction interpolate(final double[] xval,
                                                      final double[] yval)
        throws NonMonotonicSequenceException,
               DimensionMismatchException,
               NoDataException,
               NotFiniteNumberException,
               NumberIsTooSmallException {try{__CLR4_4_12uf2uflb90p6u7.R.inc(3705);
        __CLR4_4_12uf2uflb90p6u7.R.inc(3706);return new SplineInterpolator().interpolate(xval, smooth(xval, yval));
    }finally{__CLR4_4_12uf2uflb90p6u7.R.flushNeeded();}}

    /**
     * Compute a weighted loess fit on the data at the original abscissae.
     *
     * @param xval Arguments for the interpolation points.
     * @param yval Values for the interpolation points.
     * @param weights point weights: coefficients by which the robustness weight
     * of a point is multiplied.
     * @return the values of the loess fit at corresponding original abscissae.
     * @throws NonMonotonicSequenceException if {@code xval} not sorted in
     * strictly increasing order.
     * @throws DimensionMismatchException if {@code xval} and {@code yval} have
     * different sizes.
     * @throws NoDataException if {@code xval} or {@code yval} has zero size.
     * @throws NotFiniteNumberException if any of the arguments and values are
     not finite real numbers.
     * @throws NumberIsTooSmallException if the bandwidth is too small to
     * accomodate the size of the input data (i.e. the bandwidth must be
     * larger than 2/n).
     * @since 2.1
     */
    public final double[] smooth(final double[] xval, final double[] yval,
                                 final double[] weights)
        throws NonMonotonicSequenceException,
               DimensionMismatchException,
               NoDataException,
               NotFiniteNumberException,
               NumberIsTooSmallException {try{__CLR4_4_12uf2uflb90p6u7.R.inc(3707);
        __CLR4_4_12uf2uflb90p6u7.R.inc(3708);if ((((xval.length != yval.length)&&(__CLR4_4_12uf2uflb90p6u7.R.iget(3709)!=0|true))||(__CLR4_4_12uf2uflb90p6u7.R.iget(3710)==0&false))) {{
            __CLR4_4_12uf2uflb90p6u7.R.inc(3711);throw new DimensionMismatchException(xval.length, yval.length);
        }

        }__CLR4_4_12uf2uflb90p6u7.R.inc(3712);final int n = xval.length;

        __CLR4_4_12uf2uflb90p6u7.R.inc(3713);if ((((n == 0)&&(__CLR4_4_12uf2uflb90p6u7.R.iget(3714)!=0|true))||(__CLR4_4_12uf2uflb90p6u7.R.iget(3715)==0&false))) {{
            __CLR4_4_12uf2uflb90p6u7.R.inc(3716);throw new NoDataException();
        }

        }__CLR4_4_12uf2uflb90p6u7.R.inc(3717);checkAllFiniteReal(xval);
        __CLR4_4_12uf2uflb90p6u7.R.inc(3718);checkAllFiniteReal(yval);
        __CLR4_4_12uf2uflb90p6u7.R.inc(3719);checkAllFiniteReal(weights);

        __CLR4_4_12uf2uflb90p6u7.R.inc(3720);MathArrays.checkOrder(xval);

        __CLR4_4_12uf2uflb90p6u7.R.inc(3721);if ((((n == 1)&&(__CLR4_4_12uf2uflb90p6u7.R.iget(3722)!=0|true))||(__CLR4_4_12uf2uflb90p6u7.R.iget(3723)==0&false))) {{
            __CLR4_4_12uf2uflb90p6u7.R.inc(3724);return new double[]{yval[0]};
        }

        }__CLR4_4_12uf2uflb90p6u7.R.inc(3725);if ((((n == 2)&&(__CLR4_4_12uf2uflb90p6u7.R.iget(3726)!=0|true))||(__CLR4_4_12uf2uflb90p6u7.R.iget(3727)==0&false))) {{
            __CLR4_4_12uf2uflb90p6u7.R.inc(3728);return new double[]{yval[0], yval[1]};
        }

        }__CLR4_4_12uf2uflb90p6u7.R.inc(3729);int bandwidthInPoints = (int) (bandwidth * n);

        __CLR4_4_12uf2uflb90p6u7.R.inc(3730);if ((((bandwidthInPoints < 2)&&(__CLR4_4_12uf2uflb90p6u7.R.iget(3731)!=0|true))||(__CLR4_4_12uf2uflb90p6u7.R.iget(3732)==0&false))) {{
            __CLR4_4_12uf2uflb90p6u7.R.inc(3733);throw new NumberIsTooSmallException(LocalizedFormats.BANDWIDTH,
                                                bandwidthInPoints, 2, true);
        }

        }__CLR4_4_12uf2uflb90p6u7.R.inc(3734);final double[] res = new double[n];

        __CLR4_4_12uf2uflb90p6u7.R.inc(3735);final double[] residuals = new double[n];
        __CLR4_4_12uf2uflb90p6u7.R.inc(3736);final double[] sortedResiduals = new double[n];

        __CLR4_4_12uf2uflb90p6u7.R.inc(3737);final double[] robustnessWeights = new double[n];

        // Do an initial fit and 'robustnessIters' robustness iterations.
        // This is equivalent to doing 'robustnessIters+1' robustness iterations
        // starting with all robustness weights set to 1.
        __CLR4_4_12uf2uflb90p6u7.R.inc(3738);Arrays.fill(robustnessWeights, 1);

        __CLR4_4_12uf2uflb90p6u7.R.inc(3739);for (int iter = 0; (((iter <= robustnessIters)&&(__CLR4_4_12uf2uflb90p6u7.R.iget(3740)!=0|true))||(__CLR4_4_12uf2uflb90p6u7.R.iget(3741)==0&false)); ++iter) {{
            __CLR4_4_12uf2uflb90p6u7.R.inc(3742);final int[] bandwidthInterval = {0, bandwidthInPoints - 1};
            // At each x, compute a local weighted linear regression
            __CLR4_4_12uf2uflb90p6u7.R.inc(3743);for (int i = 0; (((i < n)&&(__CLR4_4_12uf2uflb90p6u7.R.iget(3744)!=0|true))||(__CLR4_4_12uf2uflb90p6u7.R.iget(3745)==0&false)); ++i) {{
                __CLR4_4_12uf2uflb90p6u7.R.inc(3746);final double x = xval[i];

                // Find out the interval of source points on which
                // a regression is to be made.
                __CLR4_4_12uf2uflb90p6u7.R.inc(3747);if ((((i > 0)&&(__CLR4_4_12uf2uflb90p6u7.R.iget(3748)!=0|true))||(__CLR4_4_12uf2uflb90p6u7.R.iget(3749)==0&false))) {{
                    __CLR4_4_12uf2uflb90p6u7.R.inc(3750);updateBandwidthInterval(xval, weights, i, bandwidthInterval);
                }

                }__CLR4_4_12uf2uflb90p6u7.R.inc(3751);final int ileft = bandwidthInterval[0];
                __CLR4_4_12uf2uflb90p6u7.R.inc(3752);final int iright = bandwidthInterval[1];

                // Compute the point of the bandwidth interval that is
                // farthest from x
                __CLR4_4_12uf2uflb90p6u7.R.inc(3753);final int edge;
                __CLR4_4_12uf2uflb90p6u7.R.inc(3754);if ((((xval[i] - xval[ileft] > xval[iright] - xval[i])&&(__CLR4_4_12uf2uflb90p6u7.R.iget(3755)!=0|true))||(__CLR4_4_12uf2uflb90p6u7.R.iget(3756)==0&false))) {{
                    __CLR4_4_12uf2uflb90p6u7.R.inc(3757);edge = ileft;
                } }else {{
                    __CLR4_4_12uf2uflb90p6u7.R.inc(3758);edge = iright;
                }

                // Compute a least-squares linear fit weighted by
                // the product of robustness weights and the tricube
                // weight function.
                // See http://en.wikipedia.org/wiki/Linear_regression
                // (section "Univariate linear case")
                // and http://en.wikipedia.org/wiki/Weighted_least_squares
                // (section "Weighted least squares")
                }__CLR4_4_12uf2uflb90p6u7.R.inc(3759);double sumWeights = 0;
                __CLR4_4_12uf2uflb90p6u7.R.inc(3760);double sumX = 0;
                __CLR4_4_12uf2uflb90p6u7.R.inc(3761);double sumXSquared = 0;
                __CLR4_4_12uf2uflb90p6u7.R.inc(3762);double sumY = 0;
                __CLR4_4_12uf2uflb90p6u7.R.inc(3763);double sumXY = 0;
                __CLR4_4_12uf2uflb90p6u7.R.inc(3764);double denom = FastMath.abs(1.0 / (xval[edge] - x));
                __CLR4_4_12uf2uflb90p6u7.R.inc(3765);for (int k = ileft; (((k <= iright)&&(__CLR4_4_12uf2uflb90p6u7.R.iget(3766)!=0|true))||(__CLR4_4_12uf2uflb90p6u7.R.iget(3767)==0&false)); ++k) {{
                    __CLR4_4_12uf2uflb90p6u7.R.inc(3768);final double xk   = xval[k];
                    __CLR4_4_12uf2uflb90p6u7.R.inc(3769);final double yk   = yval[k];
                    __CLR4_4_12uf2uflb90p6u7.R.inc(3770);final double dist = ((((k < i) )&&(__CLR4_4_12uf2uflb90p6u7.R.iget(3771)!=0|true))||(__CLR4_4_12uf2uflb90p6u7.R.iget(3772)==0&false))? x - xk : xk - x;
                    __CLR4_4_12uf2uflb90p6u7.R.inc(3773);final double w    = tricube(dist * denom) * robustnessWeights[k] * weights[k];
                    __CLR4_4_12uf2uflb90p6u7.R.inc(3774);final double xkw  = xk * w;
                    __CLR4_4_12uf2uflb90p6u7.R.inc(3775);sumWeights += w;
                    __CLR4_4_12uf2uflb90p6u7.R.inc(3776);sumX += xkw;
                    __CLR4_4_12uf2uflb90p6u7.R.inc(3777);sumXSquared += xk * xkw;
                    __CLR4_4_12uf2uflb90p6u7.R.inc(3778);sumY += yk * w;
                    __CLR4_4_12uf2uflb90p6u7.R.inc(3779);sumXY += yk * xkw;
                }

                }__CLR4_4_12uf2uflb90p6u7.R.inc(3780);final double meanX = sumX / sumWeights;
                __CLR4_4_12uf2uflb90p6u7.R.inc(3781);final double meanY = sumY / sumWeights;
                __CLR4_4_12uf2uflb90p6u7.R.inc(3782);final double meanXY = sumXY / sumWeights;
                __CLR4_4_12uf2uflb90p6u7.R.inc(3783);final double meanXSquared = sumXSquared / sumWeights;

                __CLR4_4_12uf2uflb90p6u7.R.inc(3784);final double beta;
                __CLR4_4_12uf2uflb90p6u7.R.inc(3785);if ((((FastMath.sqrt(FastMath.abs(meanXSquared - meanX * meanX)) < accuracy)&&(__CLR4_4_12uf2uflb90p6u7.R.iget(3786)!=0|true))||(__CLR4_4_12uf2uflb90p6u7.R.iget(3787)==0&false))) {{
                    __CLR4_4_12uf2uflb90p6u7.R.inc(3788);beta = 0;
                } }else {{
                    __CLR4_4_12uf2uflb90p6u7.R.inc(3789);beta = (meanXY - meanX * meanY) / (meanXSquared - meanX * meanX);
                }

                }__CLR4_4_12uf2uflb90p6u7.R.inc(3790);final double alpha = meanY - beta * meanX;

                __CLR4_4_12uf2uflb90p6u7.R.inc(3791);res[i] = beta * x + alpha;
                __CLR4_4_12uf2uflb90p6u7.R.inc(3792);residuals[i] = FastMath.abs(yval[i] - res[i]);
            }

            // No need to recompute the robustness weights at the last
            // iteration, they won't be needed anymore
            }__CLR4_4_12uf2uflb90p6u7.R.inc(3793);if ((((iter == robustnessIters)&&(__CLR4_4_12uf2uflb90p6u7.R.iget(3794)!=0|true))||(__CLR4_4_12uf2uflb90p6u7.R.iget(3795)==0&false))) {{
                __CLR4_4_12uf2uflb90p6u7.R.inc(3796);break;
            }

            // Recompute the robustness weights.

            // Find the median residual.
            // An arraycopy and a sort are completely tractable here,
            // because the preceding loop is a lot more expensive
            }__CLR4_4_12uf2uflb90p6u7.R.inc(3797);System.arraycopy(residuals, 0, sortedResiduals, 0, n);
            __CLR4_4_12uf2uflb90p6u7.R.inc(3798);Arrays.sort(sortedResiduals);
            __CLR4_4_12uf2uflb90p6u7.R.inc(3799);final double medianResidual = sortedResiduals[n / 2];

            __CLR4_4_12uf2uflb90p6u7.R.inc(3800);if ((((FastMath.abs(medianResidual) < accuracy)&&(__CLR4_4_12uf2uflb90p6u7.R.iget(3801)!=0|true))||(__CLR4_4_12uf2uflb90p6u7.R.iget(3802)==0&false))) {{
                __CLR4_4_12uf2uflb90p6u7.R.inc(3803);break;
            }

            }__CLR4_4_12uf2uflb90p6u7.R.inc(3804);for (int i = 0; (((i < n)&&(__CLR4_4_12uf2uflb90p6u7.R.iget(3805)!=0|true))||(__CLR4_4_12uf2uflb90p6u7.R.iget(3806)==0&false)); ++i) {{
                __CLR4_4_12uf2uflb90p6u7.R.inc(3807);final double arg = residuals[i] / (6 * medianResidual);
                __CLR4_4_12uf2uflb90p6u7.R.inc(3808);if ((((arg >= 1)&&(__CLR4_4_12uf2uflb90p6u7.R.iget(3809)!=0|true))||(__CLR4_4_12uf2uflb90p6u7.R.iget(3810)==0&false))) {{
                    __CLR4_4_12uf2uflb90p6u7.R.inc(3811);robustnessWeights[i] = 0;
                } }else {{
                    __CLR4_4_12uf2uflb90p6u7.R.inc(3812);final double w = 1 - arg * arg;
                    __CLR4_4_12uf2uflb90p6u7.R.inc(3813);robustnessWeights[i] = w * w;
                }
            }}
        }}

        }__CLR4_4_12uf2uflb90p6u7.R.inc(3814);return res;
    }finally{__CLR4_4_12uf2uflb90p6u7.R.flushNeeded();}}

    /**
     * Compute a loess fit on the data at the original abscissae.
     *
     * @param xval the arguments for the interpolation points
     * @param yval the values for the interpolation points
     * @return values of the loess fit at corresponding original abscissae
     * @throws NonMonotonicSequenceException if {@code xval} not sorted in
     * strictly increasing order.
     * @throws DimensionMismatchException if {@code xval} and {@code yval} have
     * different sizes.
     * @throws NoDataException if {@code xval} or {@code yval} has zero size.
     * @throws NotFiniteNumberException if any of the arguments and values are
     * not finite real numbers.
     * @throws NumberIsTooSmallException if the bandwidth is too small to
     * accomodate the size of the input data (i.e. the bandwidth must be
     * larger than 2/n).
     */
    public final double[] smooth(final double[] xval, final double[] yval)
        throws NonMonotonicSequenceException,
               DimensionMismatchException,
               NoDataException,
               NotFiniteNumberException,
               NumberIsTooSmallException {try{__CLR4_4_12uf2uflb90p6u7.R.inc(3815);
        __CLR4_4_12uf2uflb90p6u7.R.inc(3816);if ((((xval.length != yval.length)&&(__CLR4_4_12uf2uflb90p6u7.R.iget(3817)!=0|true))||(__CLR4_4_12uf2uflb90p6u7.R.iget(3818)==0&false))) {{
            __CLR4_4_12uf2uflb90p6u7.R.inc(3819);throw new DimensionMismatchException(xval.length, yval.length);
        }

        }__CLR4_4_12uf2uflb90p6u7.R.inc(3820);final double[] unitWeights = new double[xval.length];
        __CLR4_4_12uf2uflb90p6u7.R.inc(3821);Arrays.fill(unitWeights, 1.0);

        __CLR4_4_12uf2uflb90p6u7.R.inc(3822);return smooth(xval, yval, unitWeights);
    }finally{__CLR4_4_12uf2uflb90p6u7.R.flushNeeded();}}

    /**
     * Given an index interval into xval that embraces a certain number of
     * points closest to {@code xval[i-1]}, update the interval so that it
     * embraces the same number of points closest to {@code xval[i]},
     * ignoring zero weights.
     *
     * @param xval Arguments array.
     * @param weights Weights array.
     * @param i Index around which the new interval should be computed.
     * @param bandwidthInterval a two-element array {left, right} such that:
     * {@code (left==0 or xval[i] - xval[left-1] > xval[right] - xval[i])}
     * and
     * {@code (right==xval.length-1 or xval[right+1] - xval[i] > xval[i] - xval[left])}.
     * The array will be updated.
     */
    private static void updateBandwidthInterval(final double[] xval, final double[] weights,
                                                final int i,
                                                final int[] bandwidthInterval) {try{__CLR4_4_12uf2uflb90p6u7.R.inc(3823);
        __CLR4_4_12uf2uflb90p6u7.R.inc(3824);final int left = bandwidthInterval[0];
        __CLR4_4_12uf2uflb90p6u7.R.inc(3825);final int right = bandwidthInterval[1];

        // The right edge should be adjusted if the next point to the right
        // is closer to xval[i] than the leftmost point of the current interval
        __CLR4_4_12uf2uflb90p6u7.R.inc(3826);int nextRight = nextNonzero(weights, right);
        __CLR4_4_12uf2uflb90p6u7.R.inc(3827);if ((((nextRight < xval.length && xval[nextRight] - xval[i] < xval[i] - xval[left])&&(__CLR4_4_12uf2uflb90p6u7.R.iget(3828)!=0|true))||(__CLR4_4_12uf2uflb90p6u7.R.iget(3829)==0&false))) {{
            __CLR4_4_12uf2uflb90p6u7.R.inc(3830);int nextLeft = nextNonzero(weights, bandwidthInterval[0]);
            __CLR4_4_12uf2uflb90p6u7.R.inc(3831);bandwidthInterval[0] = nextLeft;
            __CLR4_4_12uf2uflb90p6u7.R.inc(3832);bandwidthInterval[1] = nextRight;
        }
    }}finally{__CLR4_4_12uf2uflb90p6u7.R.flushNeeded();}}

    /**
     * Return the smallest index {@code j} such that
     * {@code j > i && (j == weights.length || weights[j] != 0)}.
     *
     * @param weights Weights array.
     * @param i Index from which to start search.
     * @return the smallest compliant index.
     */
    private static int nextNonzero(final double[] weights, final int i) {try{__CLR4_4_12uf2uflb90p6u7.R.inc(3833);
        __CLR4_4_12uf2uflb90p6u7.R.inc(3834);int j = i + 1;
        __CLR4_4_12uf2uflb90p6u7.R.inc(3835);while((((j < weights.length && weights[j] == 0)&&(__CLR4_4_12uf2uflb90p6u7.R.iget(3836)!=0|true))||(__CLR4_4_12uf2uflb90p6u7.R.iget(3837)==0&false))) {{
            __CLR4_4_12uf2uflb90p6u7.R.inc(3838);++j;
        }
        }__CLR4_4_12uf2uflb90p6u7.R.inc(3839);return j;
    }finally{__CLR4_4_12uf2uflb90p6u7.R.flushNeeded();}}

    /**
     * Compute the
     * <a href="http://en.wikipedia.org/wiki/Local_regression#Weight_function">tricube</a>
     * weight function
     *
     * @param x Argument.
     * @return <code>(1 - |x|<sup>3</sup>)<sup>3</sup></code> for |x| &lt; 1, 0 otherwise.
     */
    private static double tricube(final double x) {try{__CLR4_4_12uf2uflb90p6u7.R.inc(3840);
        __CLR4_4_12uf2uflb90p6u7.R.inc(3841);final double absX = FastMath.abs(x);
        __CLR4_4_12uf2uflb90p6u7.R.inc(3842);if ((((absX >= 1.0)&&(__CLR4_4_12uf2uflb90p6u7.R.iget(3843)!=0|true))||(__CLR4_4_12uf2uflb90p6u7.R.iget(3844)==0&false))) {{
            __CLR4_4_12uf2uflb90p6u7.R.inc(3845);return 0.0;
        }
        }__CLR4_4_12uf2uflb90p6u7.R.inc(3846);final double tmp = 1 - absX * absX * absX;
        __CLR4_4_12uf2uflb90p6u7.R.inc(3847);return tmp * tmp * tmp;
    }finally{__CLR4_4_12uf2uflb90p6u7.R.flushNeeded();}}

    /**
     * Check that all elements of an array are finite real numbers.
     *
     * @param values Values array.
     * @throws org.apache.commons.math3.exception.NotFiniteNumberException
     * if one of the values is not a finite real number.
     */
    private static void checkAllFiniteReal(final double[] values) {try{__CLR4_4_12uf2uflb90p6u7.R.inc(3848);
        __CLR4_4_12uf2uflb90p6u7.R.inc(3849);for (int i = 0; (((i < values.length)&&(__CLR4_4_12uf2uflb90p6u7.R.iget(3850)!=0|true))||(__CLR4_4_12uf2uflb90p6u7.R.iget(3851)==0&false)); i++) {{
            __CLR4_4_12uf2uflb90p6u7.R.inc(3852);MathUtils.checkFinite(values[i]);
        }
    }}finally{__CLR4_4_12uf2uflb90p6u7.R.flushNeeded();}}
}
