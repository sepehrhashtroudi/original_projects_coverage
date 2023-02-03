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

import java.util.Arrays;
import java.util.Comparator;
import org.apache.commons.math3.analysis.function.Gaussian;
import org.apache.commons.math3.exception.NullArgumentException;
import org.apache.commons.math3.exception.NumberIsTooSmallException;
import org.apache.commons.math3.exception.OutOfRangeException;
import org.apache.commons.math3.exception.ZeroException;
import org.apache.commons.math3.exception.NotStrictlyPositiveException;
import org.apache.commons.math3.exception.util.LocalizedFormats;
import org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer;
import org.apache.commons.math3.util.FastMath;

/**
 * Fits points to a {@link
 * org.apache.commons.math3.analysis.function.Gaussian.Parametric Gaussian} function.
 * <p>
 * Usage example:
 * <pre>
 *   GaussianFitter fitter = new GaussianFitter(
 *     new LevenbergMarquardtOptimizer());
 *   fitter.addObservedPoint(4.0254623,  531026.0);
 *   fitter.addObservedPoint(4.03128248, 984167.0);
 *   fitter.addObservedPoint(4.03839603, 1887233.0);
 *   fitter.addObservedPoint(4.04421621, 2687152.0);
 *   fitter.addObservedPoint(4.05132976, 3461228.0);
 *   fitter.addObservedPoint(4.05326982, 3580526.0);
 *   fitter.addObservedPoint(4.05779662, 3439750.0);
 *   fitter.addObservedPoint(4.0636168,  2877648.0);
 *   fitter.addObservedPoint(4.06943698, 2175960.0);
 *   fitter.addObservedPoint(4.07525716, 1447024.0);
 *   fitter.addObservedPoint(4.08237071, 717104.0);
 *   fitter.addObservedPoint(4.08366408, 620014.0);
 *   double[] parameters = fitter.fit();
 * </pre>
 *
 * @since 2.2
 * @version $Id: GaussianFitter.java 1416643 2012-12-03 19:37:14Z tn $
 * @deprecated As of 3.3. Please use {@link GaussianCurveFitter} and
 * {@link WeightedObservedPoints} instead.
 */
@Deprecated
public class GaussianFitter extends CurveFitter<Gaussian.Parametric> {public static class __CLR4_4_1a45a45lb90p7rb{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,13249,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /**
     * Constructs an instance using the specified optimizer.
     *
     * @param optimizer Optimizer to use for the fitting.
     */
    public GaussianFitter(MultivariateVectorOptimizer optimizer) {
        super(optimizer);__CLR4_4_1a45a45lb90p7rb.R.inc(13110);try{__CLR4_4_1a45a45lb90p7rb.R.inc(13109);
    }finally{__CLR4_4_1a45a45lb90p7rb.R.flushNeeded();}}

    /**
     * Fits a Gaussian function to the observed points.
     *
     * @param initialGuess First guess values in the following order:
     * <ul>
     *  <li>Norm</li>
     *  <li>Mean</li>
     *  <li>Sigma</li>
     * </ul>
     * @return the parameters of the Gaussian function that best fits the
     * observed points (in the same order as above).
     * @since 3.0
     */
    public double[] fit(double[] initialGuess) {try{__CLR4_4_1a45a45lb90p7rb.R.inc(13111);
        __CLR4_4_1a45a45lb90p7rb.R.inc(13112);final Gaussian.Parametric f = new Gaussian.Parametric() {
                @Override
                public double value(double x, double ... p) {try{__CLR4_4_1a45a45lb90p7rb.R.inc(13113);
                    __CLR4_4_1a45a45lb90p7rb.R.inc(13114);double v = Double.POSITIVE_INFINITY;
                    __CLR4_4_1a45a45lb90p7rb.R.inc(13115);try {
                        __CLR4_4_1a45a45lb90p7rb.R.inc(13116);v = super.value(x, p);
                    } catch (NotStrictlyPositiveException e) { // NOPMD
                        // Do nothing.
                    }
                    __CLR4_4_1a45a45lb90p7rb.R.inc(13117);return v;
                }finally{__CLR4_4_1a45a45lb90p7rb.R.flushNeeded();}}

                @Override
                public double[] gradient(double x, double ... p) {try{__CLR4_4_1a45a45lb90p7rb.R.inc(13118);
                    __CLR4_4_1a45a45lb90p7rb.R.inc(13119);double[] v = { Double.POSITIVE_INFINITY,
                                   Double.POSITIVE_INFINITY,
                                   Double.POSITIVE_INFINITY };
                    __CLR4_4_1a45a45lb90p7rb.R.inc(13120);try {
                        __CLR4_4_1a45a45lb90p7rb.R.inc(13121);v = super.gradient(x, p);
                    } catch (NotStrictlyPositiveException e) { // NOPMD
                        // Do nothing.
                    }
                    __CLR4_4_1a45a45lb90p7rb.R.inc(13122);return v;
                }finally{__CLR4_4_1a45a45lb90p7rb.R.flushNeeded();}}
            };

        __CLR4_4_1a45a45lb90p7rb.R.inc(13123);return fit(f, initialGuess);
    }finally{__CLR4_4_1a45a45lb90p7rb.R.flushNeeded();}}

    /**
     * Fits a Gaussian function to the observed points.
     *
     * @return the parameters of the Gaussian function that best fits the
     * observed points (in the same order as above).
     */
    public double[] fit() {try{__CLR4_4_1a45a45lb90p7rb.R.inc(13124);
        __CLR4_4_1a45a45lb90p7rb.R.inc(13125);final double[] guess = (new ParameterGuesser(getObservations())).guess();
        __CLR4_4_1a45a45lb90p7rb.R.inc(13126);return fit(guess);
    }finally{__CLR4_4_1a45a45lb90p7rb.R.flushNeeded();}}

    /**
     * Guesses the parameters {@code norm}, {@code mean}, and {@code sigma}
     * of a {@link org.apache.commons.math3.analysis.function.Gaussian.Parametric}
     * based on the specified observed points.
     */
    public static class ParameterGuesser {
        /** Normalization factor. */
        private final double norm;
        /** Mean. */
        private final double mean;
        /** Standard deviation. */
        private final double sigma;

        /**
         * Constructs instance with the specified observed points.
         *
         * @param observations Observed points from which to guess the
         * parameters of the Gaussian.
         * @throws NullArgumentException if {@code observations} is
         * {@code null}.
         * @throws NumberIsTooSmallException if there are less than 3
         * observations.
         */
        public ParameterGuesser(WeightedObservedPoint[] observations) {try{__CLR4_4_1a45a45lb90p7rb.R.inc(13127);
            __CLR4_4_1a45a45lb90p7rb.R.inc(13128);if ((((observations == null)&&(__CLR4_4_1a45a45lb90p7rb.R.iget(13129)!=0|true))||(__CLR4_4_1a45a45lb90p7rb.R.iget(13130)==0&false))) {{
                __CLR4_4_1a45a45lb90p7rb.R.inc(13131);throw new NullArgumentException(LocalizedFormats.INPUT_ARRAY);
            }
            }__CLR4_4_1a45a45lb90p7rb.R.inc(13132);if ((((observations.length < 3)&&(__CLR4_4_1a45a45lb90p7rb.R.iget(13133)!=0|true))||(__CLR4_4_1a45a45lb90p7rb.R.iget(13134)==0&false))) {{
                __CLR4_4_1a45a45lb90p7rb.R.inc(13135);throw new NumberIsTooSmallException(observations.length, 3, true);
            }

            }__CLR4_4_1a45a45lb90p7rb.R.inc(13136);final WeightedObservedPoint[] sorted = sortObservations(observations);
            __CLR4_4_1a45a45lb90p7rb.R.inc(13137);final double[] params = basicGuess(sorted);

            __CLR4_4_1a45a45lb90p7rb.R.inc(13138);norm = params[0];
            __CLR4_4_1a45a45lb90p7rb.R.inc(13139);mean = params[1];
            __CLR4_4_1a45a45lb90p7rb.R.inc(13140);sigma = params[2];
        }finally{__CLR4_4_1a45a45lb90p7rb.R.flushNeeded();}}

        /**
         * Gets an estimation of the parameters.
         *
         * @return the guessed parameters, in the following order:
         * <ul>
         *  <li>Normalization factor</li>
         *  <li>Mean</li>
         *  <li>Standard deviation</li>
         * </ul>
         */
        public double[] guess() {try{__CLR4_4_1a45a45lb90p7rb.R.inc(13141);
            __CLR4_4_1a45a45lb90p7rb.R.inc(13142);return new double[] { norm, mean, sigma };
        }finally{__CLR4_4_1a45a45lb90p7rb.R.flushNeeded();}}

        /**
         * Sort the observations.
         *
         * @param unsorted Input observations.
         * @return the input observations, sorted.
         */
        private WeightedObservedPoint[] sortObservations(WeightedObservedPoint[] unsorted) {try{__CLR4_4_1a45a45lb90p7rb.R.inc(13143);
            __CLR4_4_1a45a45lb90p7rb.R.inc(13144);final WeightedObservedPoint[] observations = unsorted.clone();
            __CLR4_4_1a45a45lb90p7rb.R.inc(13145);final Comparator<WeightedObservedPoint> cmp
                = new Comparator<WeightedObservedPoint>() {
                public int compare(WeightedObservedPoint p1,
                                   WeightedObservedPoint p2) {try{__CLR4_4_1a45a45lb90p7rb.R.inc(13146);
                    __CLR4_4_1a45a45lb90p7rb.R.inc(13147);if ((((p1 == null && p2 == null)&&(__CLR4_4_1a45a45lb90p7rb.R.iget(13148)!=0|true))||(__CLR4_4_1a45a45lb90p7rb.R.iget(13149)==0&false))) {{
                        __CLR4_4_1a45a45lb90p7rb.R.inc(13150);return 0;
                    }
                    }__CLR4_4_1a45a45lb90p7rb.R.inc(13151);if ((((p1 == null)&&(__CLR4_4_1a45a45lb90p7rb.R.iget(13152)!=0|true))||(__CLR4_4_1a45a45lb90p7rb.R.iget(13153)==0&false))) {{
                        __CLR4_4_1a45a45lb90p7rb.R.inc(13154);return -1;
                    }
                    }__CLR4_4_1a45a45lb90p7rb.R.inc(13155);if ((((p2 == null)&&(__CLR4_4_1a45a45lb90p7rb.R.iget(13156)!=0|true))||(__CLR4_4_1a45a45lb90p7rb.R.iget(13157)==0&false))) {{
                        __CLR4_4_1a45a45lb90p7rb.R.inc(13158);return 1;
                    }
                    }__CLR4_4_1a45a45lb90p7rb.R.inc(13159);if ((((p1.getX() < p2.getX())&&(__CLR4_4_1a45a45lb90p7rb.R.iget(13160)!=0|true))||(__CLR4_4_1a45a45lb90p7rb.R.iget(13161)==0&false))) {{
                        __CLR4_4_1a45a45lb90p7rb.R.inc(13162);return -1;
                    }
                    }__CLR4_4_1a45a45lb90p7rb.R.inc(13163);if ((((p1.getX() > p2.getX())&&(__CLR4_4_1a45a45lb90p7rb.R.iget(13164)!=0|true))||(__CLR4_4_1a45a45lb90p7rb.R.iget(13165)==0&false))) {{
                        __CLR4_4_1a45a45lb90p7rb.R.inc(13166);return 1;
                    }
                    }__CLR4_4_1a45a45lb90p7rb.R.inc(13167);if ((((p1.getY() < p2.getY())&&(__CLR4_4_1a45a45lb90p7rb.R.iget(13168)!=0|true))||(__CLR4_4_1a45a45lb90p7rb.R.iget(13169)==0&false))) {{
                        __CLR4_4_1a45a45lb90p7rb.R.inc(13170);return -1;
                    }
                    }__CLR4_4_1a45a45lb90p7rb.R.inc(13171);if ((((p1.getY() > p2.getY())&&(__CLR4_4_1a45a45lb90p7rb.R.iget(13172)!=0|true))||(__CLR4_4_1a45a45lb90p7rb.R.iget(13173)==0&false))) {{
                        __CLR4_4_1a45a45lb90p7rb.R.inc(13174);return 1;
                    }
                    }__CLR4_4_1a45a45lb90p7rb.R.inc(13175);if ((((p1.getWeight() < p2.getWeight())&&(__CLR4_4_1a45a45lb90p7rb.R.iget(13176)!=0|true))||(__CLR4_4_1a45a45lb90p7rb.R.iget(13177)==0&false))) {{
                        __CLR4_4_1a45a45lb90p7rb.R.inc(13178);return -1;
                    }
                    }__CLR4_4_1a45a45lb90p7rb.R.inc(13179);if ((((p1.getWeight() > p2.getWeight())&&(__CLR4_4_1a45a45lb90p7rb.R.iget(13180)!=0|true))||(__CLR4_4_1a45a45lb90p7rb.R.iget(13181)==0&false))) {{
                        __CLR4_4_1a45a45lb90p7rb.R.inc(13182);return 1;
                    }
                    }__CLR4_4_1a45a45lb90p7rb.R.inc(13183);return 0;
                }finally{__CLR4_4_1a45a45lb90p7rb.R.flushNeeded();}}
            };

            __CLR4_4_1a45a45lb90p7rb.R.inc(13184);Arrays.sort(observations, cmp);
            __CLR4_4_1a45a45lb90p7rb.R.inc(13185);return observations;
        }finally{__CLR4_4_1a45a45lb90p7rb.R.flushNeeded();}}

        /**
         * Guesses the parameters based on the specified observed points.
         *
         * @param points Observed points, sorted.
         * @return the guessed parameters (normalization factor, mean and
         * sigma).
         */
        private double[] basicGuess(WeightedObservedPoint[] points) {try{__CLR4_4_1a45a45lb90p7rb.R.inc(13186);
            __CLR4_4_1a45a45lb90p7rb.R.inc(13187);final int maxYIdx = findMaxY(points);
            __CLR4_4_1a45a45lb90p7rb.R.inc(13188);final double n = points[maxYIdx].getY();
            __CLR4_4_1a45a45lb90p7rb.R.inc(13189);final double m = points[maxYIdx].getX();

            __CLR4_4_1a45a45lb90p7rb.R.inc(13190);double fwhmApprox;
            __CLR4_4_1a45a45lb90p7rb.R.inc(13191);try {
                __CLR4_4_1a45a45lb90p7rb.R.inc(13192);final double halfY = n + ((m - n) / 2);
                __CLR4_4_1a45a45lb90p7rb.R.inc(13193);final double fwhmX1 = interpolateXAtY(points, maxYIdx, -1, halfY);
                __CLR4_4_1a45a45lb90p7rb.R.inc(13194);final double fwhmX2 = interpolateXAtY(points, maxYIdx, 1, halfY);
                __CLR4_4_1a45a45lb90p7rb.R.inc(13195);fwhmApprox = fwhmX2 - fwhmX1;
            } catch (OutOfRangeException e) {
                // TODO: Exceptions should not be used for flow control.
                __CLR4_4_1a45a45lb90p7rb.R.inc(13196);fwhmApprox = points[points.length - 1].getX() - points[0].getX();
            }
            __CLR4_4_1a45a45lb90p7rb.R.inc(13197);final double s = fwhmApprox / (2 * FastMath.sqrt(2 * FastMath.log(2)));

            __CLR4_4_1a45a45lb90p7rb.R.inc(13198);return new double[] { n, m, s };
        }finally{__CLR4_4_1a45a45lb90p7rb.R.flushNeeded();}}

        /**
         * Finds index of point in specified points with the largest Y.
         *
         * @param points Points to search.
         * @return the index in specified points array.
         */
        private int findMaxY(WeightedObservedPoint[] points) {try{__CLR4_4_1a45a45lb90p7rb.R.inc(13199);
            __CLR4_4_1a45a45lb90p7rb.R.inc(13200);int maxYIdx = 0;
            __CLR4_4_1a45a45lb90p7rb.R.inc(13201);for (int i = 1; (((i < points.length)&&(__CLR4_4_1a45a45lb90p7rb.R.iget(13202)!=0|true))||(__CLR4_4_1a45a45lb90p7rb.R.iget(13203)==0&false)); i++) {{
                __CLR4_4_1a45a45lb90p7rb.R.inc(13204);if ((((points[i].getY() > points[maxYIdx].getY())&&(__CLR4_4_1a45a45lb90p7rb.R.iget(13205)!=0|true))||(__CLR4_4_1a45a45lb90p7rb.R.iget(13206)==0&false))) {{
                    __CLR4_4_1a45a45lb90p7rb.R.inc(13207);maxYIdx = i;
                }
            }}
            }__CLR4_4_1a45a45lb90p7rb.R.inc(13208);return maxYIdx;
        }finally{__CLR4_4_1a45a45lb90p7rb.R.flushNeeded();}}

        /**
         * Interpolates using the specified points to determine X at the
         * specified Y.
         *
         * @param points Points to use for interpolation.
         * @param startIdx Index within points from which to start the search for
         * interpolation bounds points.
         * @param idxStep Index step for searching interpolation bounds points.
         * @param y Y value for which X should be determined.
         * @return the value of X for the specified Y.
         * @throws ZeroException if {@code idxStep} is 0.
         * @throws OutOfRangeException if specified {@code y} is not within the
         * range of the specified {@code points}.
         */
        private double interpolateXAtY(WeightedObservedPoint[] points,
                                       int startIdx,
                                       int idxStep,
                                       double y)
            throws OutOfRangeException {try{__CLR4_4_1a45a45lb90p7rb.R.inc(13209);
            __CLR4_4_1a45a45lb90p7rb.R.inc(13210);if ((((idxStep == 0)&&(__CLR4_4_1a45a45lb90p7rb.R.iget(13211)!=0|true))||(__CLR4_4_1a45a45lb90p7rb.R.iget(13212)==0&false))) {{
                __CLR4_4_1a45a45lb90p7rb.R.inc(13213);throw new ZeroException();
            }
            }__CLR4_4_1a45a45lb90p7rb.R.inc(13214);final WeightedObservedPoint[] twoPoints
                = getInterpolationPointsForY(points, startIdx, idxStep, y);
            __CLR4_4_1a45a45lb90p7rb.R.inc(13215);final WeightedObservedPoint p1 = twoPoints[0];
            __CLR4_4_1a45a45lb90p7rb.R.inc(13216);final WeightedObservedPoint p2 = twoPoints[1];
            __CLR4_4_1a45a45lb90p7rb.R.inc(13217);if ((((p1.getY() == y)&&(__CLR4_4_1a45a45lb90p7rb.R.iget(13218)!=0|true))||(__CLR4_4_1a45a45lb90p7rb.R.iget(13219)==0&false))) {{
                __CLR4_4_1a45a45lb90p7rb.R.inc(13220);return p1.getX();
            }
            }__CLR4_4_1a45a45lb90p7rb.R.inc(13221);if ((((p2.getY() == y)&&(__CLR4_4_1a45a45lb90p7rb.R.iget(13222)!=0|true))||(__CLR4_4_1a45a45lb90p7rb.R.iget(13223)==0&false))) {{
                __CLR4_4_1a45a45lb90p7rb.R.inc(13224);return p2.getX();
            }
            }__CLR4_4_1a45a45lb90p7rb.R.inc(13225);return p1.getX() + (((y - p1.getY()) * (p2.getX() - p1.getX())) /
                                (p2.getY() - p1.getY()));
        }finally{__CLR4_4_1a45a45lb90p7rb.R.flushNeeded();}}

        /**
         * Gets the two bounding interpolation points from the specified points
         * suitable for determining X at the specified Y.
         *
         * @param points Points to use for interpolation.
         * @param startIdx Index within points from which to start search for
         * interpolation bounds points.
         * @param idxStep Index step for search for interpolation bounds points.
         * @param y Y value for which X should be determined.
         * @return the array containing two points suitable for determining X at
         * the specified Y.
         * @throws ZeroException if {@code idxStep} is 0.
         * @throws OutOfRangeException if specified {@code y} is not within the
         * range of the specified {@code points}.
         */
        private WeightedObservedPoint[] getInterpolationPointsForY(WeightedObservedPoint[] points,
                                                                   int startIdx,
                                                                   int idxStep,
                                                                   double y)
            throws OutOfRangeException {try{__CLR4_4_1a45a45lb90p7rb.R.inc(13226);
            __CLR4_4_1a45a45lb90p7rb.R.inc(13227);if ((((idxStep == 0)&&(__CLR4_4_1a45a45lb90p7rb.R.iget(13228)!=0|true))||(__CLR4_4_1a45a45lb90p7rb.R.iget(13229)==0&false))) {{
                __CLR4_4_1a45a45lb90p7rb.R.inc(13230);throw new ZeroException();
            }
            }__CLR4_4_1a45a45lb90p7rb.R.inc(13231);for (int i = startIdx;
                 ((((((idxStep < 0 )&&(__CLR4_4_1a45a45lb90p7rb.R.iget(13232)!=0|true))||(__CLR4_4_1a45a45lb90p7rb.R.iget(13233)==0&false))? i + idxStep >= 0 : i + idxStep < points.length)&&(__CLR4_4_1a45a45lb90p7rb.R.iget(13234)!=0|true))||(__CLR4_4_1a45a45lb90p7rb.R.iget(13235)==0&false));
                 i += idxStep) {{
                __CLR4_4_1a45a45lb90p7rb.R.inc(13236);final WeightedObservedPoint p1 = points[i];
                __CLR4_4_1a45a45lb90p7rb.R.inc(13237);final WeightedObservedPoint p2 = points[i + idxStep];
                __CLR4_4_1a45a45lb90p7rb.R.inc(13238);if ((((isBetween(y, p1.getY(), p2.getY()))&&(__CLR4_4_1a45a45lb90p7rb.R.iget(13239)!=0|true))||(__CLR4_4_1a45a45lb90p7rb.R.iget(13240)==0&false))) {{
                    __CLR4_4_1a45a45lb90p7rb.R.inc(13241);if ((((idxStep < 0)&&(__CLR4_4_1a45a45lb90p7rb.R.iget(13242)!=0|true))||(__CLR4_4_1a45a45lb90p7rb.R.iget(13243)==0&false))) {{
                        __CLR4_4_1a45a45lb90p7rb.R.inc(13244);return new WeightedObservedPoint[] { p2, p1 };
                    } }else {{
                        __CLR4_4_1a45a45lb90p7rb.R.inc(13245);return new WeightedObservedPoint[] { p1, p2 };
                    }
                }}
            }}

            // Boundaries are replaced by dummy values because the raised
            // exception is caught and the message never displayed.
            // TODO: Exceptions should not be used for flow control.
            }__CLR4_4_1a45a45lb90p7rb.R.inc(13246);throw new OutOfRangeException(y,
                                          Double.NEGATIVE_INFINITY,
                                          Double.POSITIVE_INFINITY);
        }finally{__CLR4_4_1a45a45lb90p7rb.R.flushNeeded();}}

        /**
         * Determines whether a value is between two other values.
         *
         * @param value Value to test whether it is between {@code boundary1}
         * and {@code boundary2}.
         * @param boundary1 One end of the range.
         * @param boundary2 Other end of the range.
         * @return {@code true} if {@code value} is between {@code boundary1} and
         * {@code boundary2} (inclusive), {@code false} otherwise.
         */
        private boolean isBetween(double value,
                                  double boundary1,
                                  double boundary2) {try{__CLR4_4_1a45a45lb90p7rb.R.inc(13247);
            __CLR4_4_1a45a45lb90p7rb.R.inc(13248);return (value >= boundary1 && value <= boundary2) ||
                (value >= boundary2 && value <= boundary1);
        }finally{__CLR4_4_1a45a45lb90p7rb.R.flushNeeded();}}
    }
}
