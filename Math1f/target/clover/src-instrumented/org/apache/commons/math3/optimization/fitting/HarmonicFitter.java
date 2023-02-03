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

package org.apache.commons.math3.optimization.fitting;

import org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer;
import org.apache.commons.math3.analysis.function.HarmonicOscillator;
import org.apache.commons.math3.exception.ZeroException;
import org.apache.commons.math3.exception.NumberIsTooSmallException;
import org.apache.commons.math3.exception.MathIllegalStateException;
import org.apache.commons.math3.exception.util.LocalizedFormats;
import org.apache.commons.math3.util.FastMath;

/**
 * Class that implements a curve fitting specialized for sinusoids.
 *
 * Harmonic fitting is a very simple case of curve fitting. The
 * estimated coefficients are the amplitude a, the pulsation &omega; and
 * the phase &phi;: <code>f (t) = a cos (&omega; t + &phi;)</code>. They are
 * searched by a least square estimator initialized with a rough guess
 * based on integrals.
 *
 * @version $Id$
 * @deprecated As of 3.1 (to be removed in 4.0).
 * @since 2.0
 */
@Deprecated
public class HarmonicFitter extends CurveFitter<HarmonicOscillator.Parametric> {public static class __CLR4_4_1ynyynylb90pa3k{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,45053,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /**
     * Simple constructor.
     * @param optimizer Optimizer to use for the fitting.
     */
    public HarmonicFitter(final DifferentiableMultivariateVectorOptimizer optimizer) {
        super(optimizer);__CLR4_4_1ynyynylb90pa3k.R.inc(44927);try{__CLR4_4_1ynyynylb90pa3k.R.inc(44926);
    }finally{__CLR4_4_1ynyynylb90pa3k.R.flushNeeded();}}

    /**
     * Fit an harmonic function to the observed points.
     *
     * @param initialGuess First guess values in the following order:
     * <ul>
     *  <li>Amplitude</li>
     *  <li>Angular frequency</li>
     *  <li>Phase</li>
     * </ul>
     * @return the parameters of the harmonic function that best fits the
     * observed points (in the same order as above).
     */
    public double[] fit(double[] initialGuess) {try{__CLR4_4_1ynyynylb90pa3k.R.inc(44928);
        __CLR4_4_1ynyynylb90pa3k.R.inc(44929);return fit(new HarmonicOscillator.Parametric(), initialGuess);
    }finally{__CLR4_4_1ynyynylb90pa3k.R.flushNeeded();}}

    /**
     * Fit an harmonic function to the observed points.
     * An initial guess will be automatically computed.
     *
     * @return the parameters of the harmonic function that best fits the
     * observed points (see the other {@link #fit(double[]) fit} method.
     * @throws NumberIsTooSmallException if the sample is too short for the
     * the first guess to be computed.
     * @throws ZeroException if the first guess cannot be computed because
     * the abscissa range is zero.
     */
    public double[] fit() {try{__CLR4_4_1ynyynylb90pa3k.R.inc(44930);
        __CLR4_4_1ynyynylb90pa3k.R.inc(44931);return fit((new ParameterGuesser(getObservations())).guess());
    }finally{__CLR4_4_1ynyynylb90pa3k.R.flushNeeded();}}

    /**
     * This class guesses harmonic coefficients from a sample.
     * <p>The algorithm used to guess the coefficients is as follows:</p>
     *
     * <p>We know f (t) at some sampling points t<sub>i</sub> and want to find a,
     * &omega; and &phi; such that f (t) = a cos (&omega; t + &phi;).
     * </p>
     *
     * <p>From the analytical expression, we can compute two primitives :
     * <pre>
     *     If2  (t) = &int; f<sup>2</sup>  = a<sup>2</sup> &times; [t + S (t)] / 2
     *     If'2 (t) = &int; f'<sup>2</sup> = a<sup>2</sup> &omega;<sup>2</sup> &times; [t - S (t)] / 2
     *     where S (t) = sin (2 (&omega; t + &phi;)) / (2 &omega;)
     * </pre>
     * </p>
     *
     * <p>We can remove S between these expressions :
     * <pre>
     *     If'2 (t) = a<sup>2</sup> &omega;<sup>2</sup> t - &omega;<sup>2</sup> If2 (t)
     * </pre>
     * </p>
     *
     * <p>The preceding expression shows that If'2 (t) is a linear
     * combination of both t and If2 (t): If'2 (t) = A &times; t + B &times; If2 (t)
     * </p>
     *
     * <p>From the primitive, we can deduce the same form for definite
     * integrals between t<sub>1</sub> and t<sub>i</sub> for each t<sub>i</sub> :
     * <pre>
     *   If2 (t<sub>i</sub>) - If2 (t<sub>1</sub>) = A &times; (t<sub>i</sub> - t<sub>1</sub>) + B &times; (If2 (t<sub>i</sub>) - If2 (t<sub>1</sub>))
     * </pre>
     * </p>
     *
     * <p>We can find the coefficients A and B that best fit the sample
     * to this linear expression by computing the definite integrals for
     * each sample points.
     * </p>
     *
     * <p>For a bilinear expression z (x<sub>i</sub>, y<sub>i</sub>) = A &times; x<sub>i</sub> + B &times; y<sub>i</sub>, the
     * coefficients A and B that minimize a least square criterion
     * &sum; (z<sub>i</sub> - z (x<sub>i</sub>, y<sub>i</sub>))<sup>2</sup> are given by these expressions:</p>
     * <pre>
     *
     *         &sum;y<sub>i</sub>y<sub>i</sub> &sum;x<sub>i</sub>z<sub>i</sub> - &sum;x<sub>i</sub>y<sub>i</sub> &sum;y<sub>i</sub>z<sub>i</sub>
     *     A = ------------------------
     *         &sum;x<sub>i</sub>x<sub>i</sub> &sum;y<sub>i</sub>y<sub>i</sub> - &sum;x<sub>i</sub>y<sub>i</sub> &sum;x<sub>i</sub>y<sub>i</sub>
     *
     *         &sum;x<sub>i</sub>x<sub>i</sub> &sum;y<sub>i</sub>z<sub>i</sub> - &sum;x<sub>i</sub>y<sub>i</sub> &sum;x<sub>i</sub>z<sub>i</sub>
     *     B = ------------------------
     *         &sum;x<sub>i</sub>x<sub>i</sub> &sum;y<sub>i</sub>y<sub>i</sub> - &sum;x<sub>i</sub>y<sub>i</sub> &sum;x<sub>i</sub>y<sub>i</sub>
     * </pre>
     * </p>
     *
     *
     * <p>In fact, we can assume both a and &omega; are positive and
     * compute them directly, knowing that A = a<sup>2</sup> &omega;<sup>2</sup> and that
     * B = - &omega;<sup>2</sup>. The complete algorithm is therefore:</p>
     * <pre>
     *
     * for each t<sub>i</sub> from t<sub>1</sub> to t<sub>n-1</sub>, compute:
     *   f  (t<sub>i</sub>)
     *   f' (t<sub>i</sub>) = (f (t<sub>i+1</sub>) - f(t<sub>i-1</sub>)) / (t<sub>i+1</sub> - t<sub>i-1</sub>)
     *   x<sub>i</sub> = t<sub>i</sub> - t<sub>1</sub>
     *   y<sub>i</sub> = &int; f<sup>2</sup> from t<sub>1</sub> to t<sub>i</sub>
     *   z<sub>i</sub> = &int; f'<sup>2</sup> from t<sub>1</sub> to t<sub>i</sub>
     *   update the sums &sum;x<sub>i</sub>x<sub>i</sub>, &sum;y<sub>i</sub>y<sub>i</sub>, &sum;x<sub>i</sub>y<sub>i</sub>, &sum;x<sub>i</sub>z<sub>i</sub> and &sum;y<sub>i</sub>z<sub>i</sub>
     * end for
     *
     *            |--------------------------
     *         \  | &sum;y<sub>i</sub>y<sub>i</sub> &sum;x<sub>i</sub>z<sub>i</sub> - &sum;x<sub>i</sub>y<sub>i</sub> &sum;y<sub>i</sub>z<sub>i</sub>
     * a     =  \ | ------------------------
     *           \| &sum;x<sub>i</sub>y<sub>i</sub> &sum;x<sub>i</sub>z<sub>i</sub> - &sum;x<sub>i</sub>x<sub>i</sub> &sum;y<sub>i</sub>z<sub>i</sub>
     *
     *
     *            |--------------------------
     *         \  | &sum;x<sub>i</sub>y<sub>i</sub> &sum;x<sub>i</sub>z<sub>i</sub> - &sum;x<sub>i</sub>x<sub>i</sub> &sum;y<sub>i</sub>z<sub>i</sub>
     * &omega;     =  \ | ------------------------
     *           \| &sum;x<sub>i</sub>x<sub>i</sub> &sum;y<sub>i</sub>y<sub>i</sub> - &sum;x<sub>i</sub>y<sub>i</sub> &sum;x<sub>i</sub>y<sub>i</sub>
     *
     * </pre>
     * </p>
     *
     * <p>Once we know &omega;, we can compute:
     * <pre>
     *    fc = &omega; f (t) cos (&omega; t) - f' (t) sin (&omega; t)
     *    fs = &omega; f (t) sin (&omega; t) + f' (t) cos (&omega; t)
     * </pre>
     * </p>
     *
     * <p>It appears that <code>fc = a &omega; cos (&phi;)</code> and
     * <code>fs = -a &omega; sin (&phi;)</code>, so we can use these
     * expressions to compute &phi;. The best estimate over the sample is
     * given by averaging these expressions.
     * </p>
     *
     * <p>Since integrals and means are involved in the preceding
     * estimations, these operations run in O(n) time, where n is the
     * number of measurements.</p>
     */
    public static class ParameterGuesser {
        /** Amplitude. */
        private final double a;
        /** Angular frequency. */
        private final double omega;
        /** Phase. */
        private final double phi;

        /**
         * Simple constructor.
         *
         * @param observations Sampled observations.
         * @throws NumberIsTooSmallException if the sample is too short.
         * @throws ZeroException if the abscissa range is zero.
         * @throws MathIllegalStateException when the guessing procedure cannot
         * produce sensible results.
         */
        public ParameterGuesser(WeightedObservedPoint[] observations) {try{__CLR4_4_1ynyynylb90pa3k.R.inc(44932);
            __CLR4_4_1ynyynylb90pa3k.R.inc(44933);if ((((observations.length < 4)&&(__CLR4_4_1ynyynylb90pa3k.R.iget(44934)!=0|true))||(__CLR4_4_1ynyynylb90pa3k.R.iget(44935)==0&false))) {{
                __CLR4_4_1ynyynylb90pa3k.R.inc(44936);throw new NumberIsTooSmallException(LocalizedFormats.INSUFFICIENT_OBSERVED_POINTS_IN_SAMPLE,
                                                    observations.length, 4, true);
            }

            }__CLR4_4_1ynyynylb90pa3k.R.inc(44937);final WeightedObservedPoint[] sorted = sortObservations(observations);

            __CLR4_4_1ynyynylb90pa3k.R.inc(44938);final double aOmega[] = guessAOmega(sorted);
            __CLR4_4_1ynyynylb90pa3k.R.inc(44939);a = aOmega[0];
            __CLR4_4_1ynyynylb90pa3k.R.inc(44940);omega = aOmega[1];

            __CLR4_4_1ynyynylb90pa3k.R.inc(44941);phi = guessPhi(sorted);
        }finally{__CLR4_4_1ynyynylb90pa3k.R.flushNeeded();}}

        /**
         * Gets an estimation of the parameters.
         *
         * @return the guessed parameters, in the following order:
         * <ul>
         *  <li>Amplitude</li>
         *  <li>Angular frequency</li>
         *  <li>Phase</li>
         * </ul>
         */
        public double[] guess() {try{__CLR4_4_1ynyynylb90pa3k.R.inc(44942);
            __CLR4_4_1ynyynylb90pa3k.R.inc(44943);return new double[] { a, omega, phi };
        }finally{__CLR4_4_1ynyynylb90pa3k.R.flushNeeded();}}

        /**
         * Sort the observations with respect to the abscissa.
         *
         * @param unsorted Input observations.
         * @return the input observations, sorted.
         */
        private WeightedObservedPoint[] sortObservations(WeightedObservedPoint[] unsorted) {try{__CLR4_4_1ynyynylb90pa3k.R.inc(44944);
            __CLR4_4_1ynyynylb90pa3k.R.inc(44945);final WeightedObservedPoint[] observations = unsorted.clone();

            // Since the samples are almost always already sorted, this
            // method is implemented as an insertion sort that reorders the
            // elements in place. Insertion sort is very efficient in this case.
            __CLR4_4_1ynyynylb90pa3k.R.inc(44946);WeightedObservedPoint curr = observations[0];
            __CLR4_4_1ynyynylb90pa3k.R.inc(44947);for (int j = 1; (((j < observations.length)&&(__CLR4_4_1ynyynylb90pa3k.R.iget(44948)!=0|true))||(__CLR4_4_1ynyynylb90pa3k.R.iget(44949)==0&false)); ++j) {{
                __CLR4_4_1ynyynylb90pa3k.R.inc(44950);WeightedObservedPoint prec = curr;
                __CLR4_4_1ynyynylb90pa3k.R.inc(44951);curr = observations[j];
                __CLR4_4_1ynyynylb90pa3k.R.inc(44952);if ((((curr.getX() < prec.getX())&&(__CLR4_4_1ynyynylb90pa3k.R.iget(44953)!=0|true))||(__CLR4_4_1ynyynylb90pa3k.R.iget(44954)==0&false))) {{
                    // the current element should be inserted closer to the beginning
                    __CLR4_4_1ynyynylb90pa3k.R.inc(44955);int i = j - 1;
                    __CLR4_4_1ynyynylb90pa3k.R.inc(44956);WeightedObservedPoint mI = observations[i];
                    __CLR4_4_1ynyynylb90pa3k.R.inc(44957);while (((((i >= 0) && (curr.getX() < mI.getX()))&&(__CLR4_4_1ynyynylb90pa3k.R.iget(44958)!=0|true))||(__CLR4_4_1ynyynylb90pa3k.R.iget(44959)==0&false))) {{
                        __CLR4_4_1ynyynylb90pa3k.R.inc(44960);observations[i + 1] = mI;
                        __CLR4_4_1ynyynylb90pa3k.R.inc(44961);if ((((i-- != 0)&&(__CLR4_4_1ynyynylb90pa3k.R.iget(44962)!=0|true))||(__CLR4_4_1ynyynylb90pa3k.R.iget(44963)==0&false))) {{
                            __CLR4_4_1ynyynylb90pa3k.R.inc(44964);mI = observations[i];
                        }
                    }}
                    }__CLR4_4_1ynyynylb90pa3k.R.inc(44965);observations[i + 1] = curr;
                    __CLR4_4_1ynyynylb90pa3k.R.inc(44966);curr = observations[j];
                }
            }}

            }__CLR4_4_1ynyynylb90pa3k.R.inc(44967);return observations;
        }finally{__CLR4_4_1ynyynylb90pa3k.R.flushNeeded();}}

        /**
         * Estimate a first guess of the amplitude and angular frequency.
         * This method assumes that the {@link #sortObservations()} method
         * has been called previously.
         *
         * @param observations Observations, sorted w.r.t. abscissa.
         * @throws ZeroException if the abscissa range is zero.
         * @throws MathIllegalStateException when the guessing procedure cannot
         * produce sensible results.
         * @return the guessed amplitude (at index 0) and circular frequency
         * (at index 1).
         */
        private double[] guessAOmega(WeightedObservedPoint[] observations) {try{__CLR4_4_1ynyynylb90pa3k.R.inc(44968);
            __CLR4_4_1ynyynylb90pa3k.R.inc(44969);final double[] aOmega = new double[2];

            // initialize the sums for the linear model between the two integrals
            __CLR4_4_1ynyynylb90pa3k.R.inc(44970);double sx2 = 0;
            __CLR4_4_1ynyynylb90pa3k.R.inc(44971);double sy2 = 0;
            __CLR4_4_1ynyynylb90pa3k.R.inc(44972);double sxy = 0;
            __CLR4_4_1ynyynylb90pa3k.R.inc(44973);double sxz = 0;
            __CLR4_4_1ynyynylb90pa3k.R.inc(44974);double syz = 0;

            __CLR4_4_1ynyynylb90pa3k.R.inc(44975);double currentX = observations[0].getX();
            __CLR4_4_1ynyynylb90pa3k.R.inc(44976);double currentY = observations[0].getY();
            __CLR4_4_1ynyynylb90pa3k.R.inc(44977);double f2Integral = 0;
            __CLR4_4_1ynyynylb90pa3k.R.inc(44978);double fPrime2Integral = 0;
            __CLR4_4_1ynyynylb90pa3k.R.inc(44979);final double startX = currentX;
            __CLR4_4_1ynyynylb90pa3k.R.inc(44980);for (int i = 1; (((i < observations.length)&&(__CLR4_4_1ynyynylb90pa3k.R.iget(44981)!=0|true))||(__CLR4_4_1ynyynylb90pa3k.R.iget(44982)==0&false)); ++i) {{
                // one step forward
                __CLR4_4_1ynyynylb90pa3k.R.inc(44983);final double previousX = currentX;
                __CLR4_4_1ynyynylb90pa3k.R.inc(44984);final double previousY = currentY;
                __CLR4_4_1ynyynylb90pa3k.R.inc(44985);currentX = observations[i].getX();
                __CLR4_4_1ynyynylb90pa3k.R.inc(44986);currentY = observations[i].getY();

                // update the integrals of f<sup>2</sup> and f'<sup>2</sup>
                // considering a linear model for f (and therefore constant f')
                __CLR4_4_1ynyynylb90pa3k.R.inc(44987);final double dx = currentX - previousX;
                __CLR4_4_1ynyynylb90pa3k.R.inc(44988);final double dy = currentY - previousY;
                __CLR4_4_1ynyynylb90pa3k.R.inc(44989);final double f2StepIntegral =
                    dx * (previousY * previousY + previousY * currentY + currentY * currentY) / 3;
                __CLR4_4_1ynyynylb90pa3k.R.inc(44990);final double fPrime2StepIntegral = dy * dy / dx;

                __CLR4_4_1ynyynylb90pa3k.R.inc(44991);final double x = currentX - startX;
                __CLR4_4_1ynyynylb90pa3k.R.inc(44992);f2Integral += f2StepIntegral;
                __CLR4_4_1ynyynylb90pa3k.R.inc(44993);fPrime2Integral += fPrime2StepIntegral;

                __CLR4_4_1ynyynylb90pa3k.R.inc(44994);sx2 += x * x;
                __CLR4_4_1ynyynylb90pa3k.R.inc(44995);sy2 += f2Integral * f2Integral;
                __CLR4_4_1ynyynylb90pa3k.R.inc(44996);sxy += x * f2Integral;
                __CLR4_4_1ynyynylb90pa3k.R.inc(44997);sxz += x * fPrime2Integral;
                __CLR4_4_1ynyynylb90pa3k.R.inc(44998);syz += f2Integral * fPrime2Integral;
            }

            // compute the amplitude and pulsation coefficients
            }__CLR4_4_1ynyynylb90pa3k.R.inc(44999);double c1 = sy2 * sxz - sxy * syz;
            __CLR4_4_1ynyynylb90pa3k.R.inc(45000);double c2 = sxy * sxz - sx2 * syz;
            __CLR4_4_1ynyynylb90pa3k.R.inc(45001);double c3 = sx2 * sy2 - sxy * sxy;
            __CLR4_4_1ynyynylb90pa3k.R.inc(45002);if (((((c1 / c2 < 0) || (c2 / c3 < 0))&&(__CLR4_4_1ynyynylb90pa3k.R.iget(45003)!=0|true))||(__CLR4_4_1ynyynylb90pa3k.R.iget(45004)==0&false))) {{
                __CLR4_4_1ynyynylb90pa3k.R.inc(45005);final int last = observations.length - 1;
                // Range of the observations, assuming that the
                // observations are sorted.
                __CLR4_4_1ynyynylb90pa3k.R.inc(45006);final double xRange = observations[last].getX() - observations[0].getX();
                __CLR4_4_1ynyynylb90pa3k.R.inc(45007);if ((((xRange == 0)&&(__CLR4_4_1ynyynylb90pa3k.R.iget(45008)!=0|true))||(__CLR4_4_1ynyynylb90pa3k.R.iget(45009)==0&false))) {{
                    __CLR4_4_1ynyynylb90pa3k.R.inc(45010);throw new ZeroException();
                }
                }__CLR4_4_1ynyynylb90pa3k.R.inc(45011);aOmega[1] = 2 * Math.PI / xRange;

                __CLR4_4_1ynyynylb90pa3k.R.inc(45012);double yMin = Double.POSITIVE_INFINITY;
                __CLR4_4_1ynyynylb90pa3k.R.inc(45013);double yMax = Double.NEGATIVE_INFINITY;
                __CLR4_4_1ynyynylb90pa3k.R.inc(45014);for (int i = 1; (((i < observations.length)&&(__CLR4_4_1ynyynylb90pa3k.R.iget(45015)!=0|true))||(__CLR4_4_1ynyynylb90pa3k.R.iget(45016)==0&false)); ++i) {{
                    __CLR4_4_1ynyynylb90pa3k.R.inc(45017);final double y = observations[i].getY();
                    __CLR4_4_1ynyynylb90pa3k.R.inc(45018);if ((((y < yMin)&&(__CLR4_4_1ynyynylb90pa3k.R.iget(45019)!=0|true))||(__CLR4_4_1ynyynylb90pa3k.R.iget(45020)==0&false))) {{
                        __CLR4_4_1ynyynylb90pa3k.R.inc(45021);yMin = y;
                    }
                    }__CLR4_4_1ynyynylb90pa3k.R.inc(45022);if ((((y > yMax)&&(__CLR4_4_1ynyynylb90pa3k.R.iget(45023)!=0|true))||(__CLR4_4_1ynyynylb90pa3k.R.iget(45024)==0&false))) {{
                        __CLR4_4_1ynyynylb90pa3k.R.inc(45025);yMax = y;
                    }
                }}
                }__CLR4_4_1ynyynylb90pa3k.R.inc(45026);aOmega[0] = 0.5 * (yMax - yMin);
            } }else {{
                __CLR4_4_1ynyynylb90pa3k.R.inc(45027);if ((((c2 == 0)&&(__CLR4_4_1ynyynylb90pa3k.R.iget(45028)!=0|true))||(__CLR4_4_1ynyynylb90pa3k.R.iget(45029)==0&false))) {{
                    // In some ill-conditioned cases (cf. MATH-844), the guesser
                    // procedure cannot produce sensible results.
                    __CLR4_4_1ynyynylb90pa3k.R.inc(45030);throw new MathIllegalStateException(LocalizedFormats.ZERO_DENOMINATOR);
                }

                }__CLR4_4_1ynyynylb90pa3k.R.inc(45031);aOmega[0] = FastMath.sqrt(c1 / c2);
                __CLR4_4_1ynyynylb90pa3k.R.inc(45032);aOmega[1] = FastMath.sqrt(c2 / c3);
            }

            }__CLR4_4_1ynyynylb90pa3k.R.inc(45033);return aOmega;
        }finally{__CLR4_4_1ynyynylb90pa3k.R.flushNeeded();}}

        /**
         * Estimate a first guess of the phase.
         *
         * @param observations Observations, sorted w.r.t. abscissa.
         * @return the guessed phase.
         */
        private double guessPhi(WeightedObservedPoint[] observations) {try{__CLR4_4_1ynyynylb90pa3k.R.inc(45034);
            // initialize the means
            __CLR4_4_1ynyynylb90pa3k.R.inc(45035);double fcMean = 0;
            __CLR4_4_1ynyynylb90pa3k.R.inc(45036);double fsMean = 0;

            __CLR4_4_1ynyynylb90pa3k.R.inc(45037);double currentX = observations[0].getX();
            __CLR4_4_1ynyynylb90pa3k.R.inc(45038);double currentY = observations[0].getY();
            __CLR4_4_1ynyynylb90pa3k.R.inc(45039);for (int i = 1; (((i < observations.length)&&(__CLR4_4_1ynyynylb90pa3k.R.iget(45040)!=0|true))||(__CLR4_4_1ynyynylb90pa3k.R.iget(45041)==0&false)); ++i) {{
                // one step forward
                __CLR4_4_1ynyynylb90pa3k.R.inc(45042);final double previousX = currentX;
                __CLR4_4_1ynyynylb90pa3k.R.inc(45043);final double previousY = currentY;
                __CLR4_4_1ynyynylb90pa3k.R.inc(45044);currentX = observations[i].getX();
                __CLR4_4_1ynyynylb90pa3k.R.inc(45045);currentY = observations[i].getY();
                __CLR4_4_1ynyynylb90pa3k.R.inc(45046);final double currentYPrime = (currentY - previousY) / (currentX - previousX);

                __CLR4_4_1ynyynylb90pa3k.R.inc(45047);double omegaX = omega * currentX;
                __CLR4_4_1ynyynylb90pa3k.R.inc(45048);double cosine = FastMath.cos(omegaX);
                __CLR4_4_1ynyynylb90pa3k.R.inc(45049);double sine = FastMath.sin(omegaX);
                __CLR4_4_1ynyynylb90pa3k.R.inc(45050);fcMean += omega * currentY * cosine - currentYPrime * sine;
                __CLR4_4_1ynyynylb90pa3k.R.inc(45051);fsMean += omega * currentY * sine + currentYPrime * cosine;
            }

            }__CLR4_4_1ynyynylb90pa3k.R.inc(45052);return FastMath.atan2(-fsMean, fcMean);
        }finally{__CLR4_4_1ynyynylb90pa3k.R.flushNeeded();}}
    }
}
