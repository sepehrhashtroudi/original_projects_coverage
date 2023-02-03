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
package org.apache.commons.math3.fitting;

import org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer;
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
 * @version $Id: HarmonicFitter.java 1416643 2012-12-03 19:37:14Z tn $
 * @since 2.0
 */
public class HarmonicFitter extends CurveFitter<HarmonicOscillator.Parametric> {public static class __CLR4_4_1a81a81lb90p7rn{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,13376,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /**
     * Simple constructor.
     * @param optimizer Optimizer to use for the fitting.
     */
    public HarmonicFitter(final MultivariateVectorOptimizer optimizer) {
        super(optimizer);__CLR4_4_1a81a81lb90p7rn.R.inc(13250);try{__CLR4_4_1a81a81lb90p7rn.R.inc(13249);
    }finally{__CLR4_4_1a81a81lb90p7rn.R.flushNeeded();}}

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
    public double[] fit(double[] initialGuess) {try{__CLR4_4_1a81a81lb90p7rn.R.inc(13251);
        __CLR4_4_1a81a81lb90p7rn.R.inc(13252);return fit(new HarmonicOscillator.Parametric(), initialGuess);
    }finally{__CLR4_4_1a81a81lb90p7rn.R.flushNeeded();}}

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
    public double[] fit() {try{__CLR4_4_1a81a81lb90p7rn.R.inc(13253);
        __CLR4_4_1a81a81lb90p7rn.R.inc(13254);return fit((new ParameterGuesser(getObservations())).guess());
    }finally{__CLR4_4_1a81a81lb90p7rn.R.flushNeeded();}}

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
        public ParameterGuesser(WeightedObservedPoint[] observations) {try{__CLR4_4_1a81a81lb90p7rn.R.inc(13255);
            __CLR4_4_1a81a81lb90p7rn.R.inc(13256);if ((((observations.length < 4)&&(__CLR4_4_1a81a81lb90p7rn.R.iget(13257)!=0|true))||(__CLR4_4_1a81a81lb90p7rn.R.iget(13258)==0&false))) {{
                __CLR4_4_1a81a81lb90p7rn.R.inc(13259);throw new NumberIsTooSmallException(LocalizedFormats.INSUFFICIENT_OBSERVED_POINTS_IN_SAMPLE,
                                                    observations.length, 4, true);
            }

            }__CLR4_4_1a81a81lb90p7rn.R.inc(13260);final WeightedObservedPoint[] sorted = sortObservations(observations);

            __CLR4_4_1a81a81lb90p7rn.R.inc(13261);final double aOmega[] = guessAOmega(sorted);
            __CLR4_4_1a81a81lb90p7rn.R.inc(13262);a = aOmega[0];
            __CLR4_4_1a81a81lb90p7rn.R.inc(13263);omega = aOmega[1];

            __CLR4_4_1a81a81lb90p7rn.R.inc(13264);phi = guessPhi(sorted);
        }finally{__CLR4_4_1a81a81lb90p7rn.R.flushNeeded();}}

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
        public double[] guess() {try{__CLR4_4_1a81a81lb90p7rn.R.inc(13265);
            __CLR4_4_1a81a81lb90p7rn.R.inc(13266);return new double[] { a, omega, phi };
        }finally{__CLR4_4_1a81a81lb90p7rn.R.flushNeeded();}}

        /**
         * Sort the observations with respect to the abscissa.
         *
         * @param unsorted Input observations.
         * @return the input observations, sorted.
         */
        private WeightedObservedPoint[] sortObservations(WeightedObservedPoint[] unsorted) {try{__CLR4_4_1a81a81lb90p7rn.R.inc(13267);
            __CLR4_4_1a81a81lb90p7rn.R.inc(13268);final WeightedObservedPoint[] observations = unsorted.clone();

            // Since the samples are almost always already sorted, this
            // method is implemented as an insertion sort that reorders the
            // elements in place. Insertion sort is very efficient in this case.
            __CLR4_4_1a81a81lb90p7rn.R.inc(13269);WeightedObservedPoint curr = observations[0];
            __CLR4_4_1a81a81lb90p7rn.R.inc(13270);for (int j = 1; (((j < observations.length)&&(__CLR4_4_1a81a81lb90p7rn.R.iget(13271)!=0|true))||(__CLR4_4_1a81a81lb90p7rn.R.iget(13272)==0&false)); ++j) {{
                __CLR4_4_1a81a81lb90p7rn.R.inc(13273);WeightedObservedPoint prec = curr;
                __CLR4_4_1a81a81lb90p7rn.R.inc(13274);curr = observations[j];
                __CLR4_4_1a81a81lb90p7rn.R.inc(13275);if ((((curr.getX() < prec.getX())&&(__CLR4_4_1a81a81lb90p7rn.R.iget(13276)!=0|true))||(__CLR4_4_1a81a81lb90p7rn.R.iget(13277)==0&false))) {{
                    // the current element should be inserted closer to the beginning
                    __CLR4_4_1a81a81lb90p7rn.R.inc(13278);int i = j - 1;
                    __CLR4_4_1a81a81lb90p7rn.R.inc(13279);WeightedObservedPoint mI = observations[i];
                    __CLR4_4_1a81a81lb90p7rn.R.inc(13280);while (((((i >= 0) && (curr.getX() < mI.getX()))&&(__CLR4_4_1a81a81lb90p7rn.R.iget(13281)!=0|true))||(__CLR4_4_1a81a81lb90p7rn.R.iget(13282)==0&false))) {{
                        __CLR4_4_1a81a81lb90p7rn.R.inc(13283);observations[i + 1] = mI;
                        __CLR4_4_1a81a81lb90p7rn.R.inc(13284);if ((((i-- != 0)&&(__CLR4_4_1a81a81lb90p7rn.R.iget(13285)!=0|true))||(__CLR4_4_1a81a81lb90p7rn.R.iget(13286)==0&false))) {{
                            __CLR4_4_1a81a81lb90p7rn.R.inc(13287);mI = observations[i];
                        }
                    }}
                    }__CLR4_4_1a81a81lb90p7rn.R.inc(13288);observations[i + 1] = curr;
                    __CLR4_4_1a81a81lb90p7rn.R.inc(13289);curr = observations[j];
                }
            }}

            }__CLR4_4_1a81a81lb90p7rn.R.inc(13290);return observations;
        }finally{__CLR4_4_1a81a81lb90p7rn.R.flushNeeded();}}

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
        private double[] guessAOmega(WeightedObservedPoint[] observations) {try{__CLR4_4_1a81a81lb90p7rn.R.inc(13291);
            __CLR4_4_1a81a81lb90p7rn.R.inc(13292);final double[] aOmega = new double[2];

            // initialize the sums for the linear model between the two integrals
            __CLR4_4_1a81a81lb90p7rn.R.inc(13293);double sx2 = 0;
            __CLR4_4_1a81a81lb90p7rn.R.inc(13294);double sy2 = 0;
            __CLR4_4_1a81a81lb90p7rn.R.inc(13295);double sxy = 0;
            __CLR4_4_1a81a81lb90p7rn.R.inc(13296);double sxz = 0;
            __CLR4_4_1a81a81lb90p7rn.R.inc(13297);double syz = 0;

            __CLR4_4_1a81a81lb90p7rn.R.inc(13298);double currentX = observations[0].getX();
            __CLR4_4_1a81a81lb90p7rn.R.inc(13299);double currentY = observations[0].getY();
            __CLR4_4_1a81a81lb90p7rn.R.inc(13300);double f2Integral = 0;
            __CLR4_4_1a81a81lb90p7rn.R.inc(13301);double fPrime2Integral = 0;
            __CLR4_4_1a81a81lb90p7rn.R.inc(13302);final double startX = currentX;
            __CLR4_4_1a81a81lb90p7rn.R.inc(13303);for (int i = 1; (((i < observations.length)&&(__CLR4_4_1a81a81lb90p7rn.R.iget(13304)!=0|true))||(__CLR4_4_1a81a81lb90p7rn.R.iget(13305)==0&false)); ++i) {{
                // one step forward
                __CLR4_4_1a81a81lb90p7rn.R.inc(13306);final double previousX = currentX;
                __CLR4_4_1a81a81lb90p7rn.R.inc(13307);final double previousY = currentY;
                __CLR4_4_1a81a81lb90p7rn.R.inc(13308);currentX = observations[i].getX();
                __CLR4_4_1a81a81lb90p7rn.R.inc(13309);currentY = observations[i].getY();

                // update the integrals of f<sup>2</sup> and f'<sup>2</sup>
                // considering a linear model for f (and therefore constant f')
                __CLR4_4_1a81a81lb90p7rn.R.inc(13310);final double dx = currentX - previousX;
                __CLR4_4_1a81a81lb90p7rn.R.inc(13311);final double dy = currentY - previousY;
                __CLR4_4_1a81a81lb90p7rn.R.inc(13312);final double f2StepIntegral =
                    dx * (previousY * previousY + previousY * currentY + currentY * currentY) / 3;
                __CLR4_4_1a81a81lb90p7rn.R.inc(13313);final double fPrime2StepIntegral = dy * dy / dx;

                __CLR4_4_1a81a81lb90p7rn.R.inc(13314);final double x = currentX - startX;
                __CLR4_4_1a81a81lb90p7rn.R.inc(13315);f2Integral += f2StepIntegral;
                __CLR4_4_1a81a81lb90p7rn.R.inc(13316);fPrime2Integral += fPrime2StepIntegral;

                __CLR4_4_1a81a81lb90p7rn.R.inc(13317);sx2 += x * x;
                __CLR4_4_1a81a81lb90p7rn.R.inc(13318);sy2 += f2Integral * f2Integral;
                __CLR4_4_1a81a81lb90p7rn.R.inc(13319);sxy += x * f2Integral;
                __CLR4_4_1a81a81lb90p7rn.R.inc(13320);sxz += x * fPrime2Integral;
                __CLR4_4_1a81a81lb90p7rn.R.inc(13321);syz += f2Integral * fPrime2Integral;
            }

            // compute the amplitude and pulsation coefficients
            }__CLR4_4_1a81a81lb90p7rn.R.inc(13322);double c1 = sy2 * sxz - sxy * syz;
            __CLR4_4_1a81a81lb90p7rn.R.inc(13323);double c2 = sxy * sxz - sx2 * syz;
            __CLR4_4_1a81a81lb90p7rn.R.inc(13324);double c3 = sx2 * sy2 - sxy * sxy;
            __CLR4_4_1a81a81lb90p7rn.R.inc(13325);if (((((c1 / c2 < 0) || (c2 / c3 < 0))&&(__CLR4_4_1a81a81lb90p7rn.R.iget(13326)!=0|true))||(__CLR4_4_1a81a81lb90p7rn.R.iget(13327)==0&false))) {{
                __CLR4_4_1a81a81lb90p7rn.R.inc(13328);final int last = observations.length - 1;
                // Range of the observations, assuming that the
                // observations are sorted.
                __CLR4_4_1a81a81lb90p7rn.R.inc(13329);final double xRange = observations[last].getX() - observations[0].getX();
                __CLR4_4_1a81a81lb90p7rn.R.inc(13330);if ((((xRange == 0)&&(__CLR4_4_1a81a81lb90p7rn.R.iget(13331)!=0|true))||(__CLR4_4_1a81a81lb90p7rn.R.iget(13332)==0&false))) {{
                    __CLR4_4_1a81a81lb90p7rn.R.inc(13333);throw new ZeroException();
                }
                }__CLR4_4_1a81a81lb90p7rn.R.inc(13334);aOmega[1] = 2 * Math.PI / xRange;

                __CLR4_4_1a81a81lb90p7rn.R.inc(13335);double yMin = Double.POSITIVE_INFINITY;
                __CLR4_4_1a81a81lb90p7rn.R.inc(13336);double yMax = Double.NEGATIVE_INFINITY;
                __CLR4_4_1a81a81lb90p7rn.R.inc(13337);for (int i = 1; (((i < observations.length)&&(__CLR4_4_1a81a81lb90p7rn.R.iget(13338)!=0|true))||(__CLR4_4_1a81a81lb90p7rn.R.iget(13339)==0&false)); ++i) {{
                    __CLR4_4_1a81a81lb90p7rn.R.inc(13340);final double y = observations[i].getY();
                    __CLR4_4_1a81a81lb90p7rn.R.inc(13341);if ((((y < yMin)&&(__CLR4_4_1a81a81lb90p7rn.R.iget(13342)!=0|true))||(__CLR4_4_1a81a81lb90p7rn.R.iget(13343)==0&false))) {{
                        __CLR4_4_1a81a81lb90p7rn.R.inc(13344);yMin = y;
                    }
                    }__CLR4_4_1a81a81lb90p7rn.R.inc(13345);if ((((y > yMax)&&(__CLR4_4_1a81a81lb90p7rn.R.iget(13346)!=0|true))||(__CLR4_4_1a81a81lb90p7rn.R.iget(13347)==0&false))) {{
                        __CLR4_4_1a81a81lb90p7rn.R.inc(13348);yMax = y;
                    }
                }}
                }__CLR4_4_1a81a81lb90p7rn.R.inc(13349);aOmega[0] = 0.5 * (yMax - yMin);
            } }else {{
                __CLR4_4_1a81a81lb90p7rn.R.inc(13350);if ((((c2 == 0)&&(__CLR4_4_1a81a81lb90p7rn.R.iget(13351)!=0|true))||(__CLR4_4_1a81a81lb90p7rn.R.iget(13352)==0&false))) {{
                    // In some ill-conditioned cases (cf. MATH-844), the guesser
                    // procedure cannot produce sensible results.
                    __CLR4_4_1a81a81lb90p7rn.R.inc(13353);throw new MathIllegalStateException(LocalizedFormats.ZERO_DENOMINATOR);
                }

                }__CLR4_4_1a81a81lb90p7rn.R.inc(13354);aOmega[0] = FastMath.sqrt(c1 / c2);
                __CLR4_4_1a81a81lb90p7rn.R.inc(13355);aOmega[1] = FastMath.sqrt(c2 / c3);
            }

            }__CLR4_4_1a81a81lb90p7rn.R.inc(13356);return aOmega;
        }finally{__CLR4_4_1a81a81lb90p7rn.R.flushNeeded();}}

        /**
         * Estimate a first guess of the phase.
         *
         * @param observations Observations, sorted w.r.t. abscissa.
         * @return the guessed phase.
         */
        private double guessPhi(WeightedObservedPoint[] observations) {try{__CLR4_4_1a81a81lb90p7rn.R.inc(13357);
            // initialize the means
            __CLR4_4_1a81a81lb90p7rn.R.inc(13358);double fcMean = 0;
            __CLR4_4_1a81a81lb90p7rn.R.inc(13359);double fsMean = 0;

            __CLR4_4_1a81a81lb90p7rn.R.inc(13360);double currentX = observations[0].getX();
            __CLR4_4_1a81a81lb90p7rn.R.inc(13361);double currentY = observations[0].getY();
            __CLR4_4_1a81a81lb90p7rn.R.inc(13362);for (int i = 1; (((i < observations.length)&&(__CLR4_4_1a81a81lb90p7rn.R.iget(13363)!=0|true))||(__CLR4_4_1a81a81lb90p7rn.R.iget(13364)==0&false)); ++i) {{
                // one step forward
                __CLR4_4_1a81a81lb90p7rn.R.inc(13365);final double previousX = currentX;
                __CLR4_4_1a81a81lb90p7rn.R.inc(13366);final double previousY = currentY;
                __CLR4_4_1a81a81lb90p7rn.R.inc(13367);currentX = observations[i].getX();
                __CLR4_4_1a81a81lb90p7rn.R.inc(13368);currentY = observations[i].getY();
                __CLR4_4_1a81a81lb90p7rn.R.inc(13369);final double currentYPrime = (currentY - previousY) / (currentX - previousX);

                __CLR4_4_1a81a81lb90p7rn.R.inc(13370);double omegaX = omega * currentX;
                __CLR4_4_1a81a81lb90p7rn.R.inc(13371);double cosine = FastMath.cos(omegaX);
                __CLR4_4_1a81a81lb90p7rn.R.inc(13372);double sine = FastMath.sin(omegaX);
                __CLR4_4_1a81a81lb90p7rn.R.inc(13373);fcMean += omega * currentY * cosine - currentYPrime * sine;
                __CLR4_4_1a81a81lb90p7rn.R.inc(13374);fsMean += omega * currentY * sine + currentYPrime * cosine;
            }

            }__CLR4_4_1a81a81lb90p7rn.R.inc(13375);return FastMath.atan2(-fsMean, fcMean);
        }finally{__CLR4_4_1a81a81lb90p7rn.R.flushNeeded();}}
    }
}
