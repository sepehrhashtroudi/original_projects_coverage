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

import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collection;
import java.util.Collections;
import org.apache.commons.math3.analysis.function.Gaussian;
import org.apache.commons.math3.linear.DiagonalMatrix;
import org.apache.commons.math3.exception.NullArgumentException;
import org.apache.commons.math3.exception.NumberIsTooSmallException;
import org.apache.commons.math3.exception.OutOfRangeException;
import org.apache.commons.math3.exception.ZeroException;
import org.apache.commons.math3.exception.NotStrictlyPositiveException;
import org.apache.commons.math3.exception.util.LocalizedFormats;
import org.apache.commons.math3.fitting.leastsquares.LevenbergMarquardtOptimizer;
import org.apache.commons.math3.fitting.leastsquares.WithStartPoint;
import org.apache.commons.math3.fitting.leastsquares.WithMaxIterations;
import org.apache.commons.math3.util.FastMath;

/**
 * Fits points to a {@link
 * org.apache.commons.math3.analysis.function.Gaussian.Parametric Gaussian}
 * function.
 * <br/>
 * The {@link #withStartPoint(double[]) initial guess values} must be passed
 * in the following order:
 * <ul>
 *  <li>Normalization</li>
 *  <li>Mean</li>
 *  <li>Sigma</li>
 * </ul>
 * The optimal values will be returned in the same order.
 *
 * <p>
 * Usage example:
 * <pre>
 *   WeightedObservedPoints obs = new WeightedObservedPoints();
 *   obs.add(4.0254623,  531026.0);
 *   obs.add(4.03128248, 984167.0);
 *   obs.add(4.03839603, 1887233.0);
 *   obs.add(4.04421621, 2687152.0);
 *   obs.add(4.05132976, 3461228.0);
 *   obs.add(4.05326982, 3580526.0);
 *   obs.add(4.05779662, 3439750.0);
 *   obs.add(4.0636168,  2877648.0);
 *   obs.add(4.06943698, 2175960.0);
 *   obs.add(4.07525716, 1447024.0);
 *   obs.add(4.08237071, 717104.0);
 *   obs.add(4.08366408, 620014.0);
 *   double[] parameters = GaussianCurveFitter.create().fit(obs);
 * </pre>
 *
 * @version $Id$
 * @since 3.3
 */
public class GaussianCurveFitter extends AbstractCurveFitter<LevenbergMarquardtOptimizer>
    implements WithStartPoint<GaussianCurveFitter>,
               WithMaxIterations<GaussianCurveFitter> {public static class __CLR4_4_19zu9zulb90p7qu{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,13109,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /** Parametric function to be fitted. */
    private static final Gaussian.Parametric FUNCTION = new Gaussian.Parametric() {
            @Override
            public double value(double x, double ... p) {try{__CLR4_4_19zu9zulb90p7qu.R.inc(12954);
                __CLR4_4_19zu9zulb90p7qu.R.inc(12955);double v = Double.POSITIVE_INFINITY;
                __CLR4_4_19zu9zulb90p7qu.R.inc(12956);try {
                    __CLR4_4_19zu9zulb90p7qu.R.inc(12957);v = super.value(x, p);
                } catch (NotStrictlyPositiveException e) { // NOPMD
                    // Do nothing.
                }
                __CLR4_4_19zu9zulb90p7qu.R.inc(12958);return v;
            }finally{__CLR4_4_19zu9zulb90p7qu.R.flushNeeded();}}

            @Override
            public double[] gradient(double x, double ... p) {try{__CLR4_4_19zu9zulb90p7qu.R.inc(12959);
                __CLR4_4_19zu9zulb90p7qu.R.inc(12960);double[] v = { Double.POSITIVE_INFINITY,
                               Double.POSITIVE_INFINITY,
                               Double.POSITIVE_INFINITY };
                __CLR4_4_19zu9zulb90p7qu.R.inc(12961);try {
                    __CLR4_4_19zu9zulb90p7qu.R.inc(12962);v = super.gradient(x, p);
                } catch (NotStrictlyPositiveException e) { // NOPMD
                    // Do nothing.
                }
                __CLR4_4_19zu9zulb90p7qu.R.inc(12963);return v;
            }finally{__CLR4_4_19zu9zulb90p7qu.R.flushNeeded();}}
        };
    /** Initial guess. */
    private final double[] initialGuess;
    /** Maximum number of iterations of the optimization algorithm. */
    private final int maxIter;

    /**
     * Contructor used by the factory methods.
     *
     * @param initialGuess Initial guess. If set to {@code null}, the initial guess
     * will be estimated using the {@link ParameterGuesser}.
     * @param maxIter Maximum number of iterations of the optimization algorithm.
     */
    private GaussianCurveFitter(double[] initialGuess,
                                int maxIter) {try{__CLR4_4_19zu9zulb90p7qu.R.inc(12964);
        __CLR4_4_19zu9zulb90p7qu.R.inc(12965);this.initialGuess = initialGuess;
        __CLR4_4_19zu9zulb90p7qu.R.inc(12966);this.maxIter = maxIter;
    }finally{__CLR4_4_19zu9zulb90p7qu.R.flushNeeded();}}

    /**
     * Creates a default curve fitter.
     * The initial guess for the parameters will be {@link ParameterGuesser}
     * computed automatically, and the maximum number of iterations of the
     * optimization algorithm is set to {@link Integer#MAX_VALUE}.
     *
     * @return a curve fitter.
     *
     * @see #withStartPoint(double[])
     * @see #withMaxIterations(int)
     */
    public static GaussianCurveFitter create() {try{__CLR4_4_19zu9zulb90p7qu.R.inc(12967);
        __CLR4_4_19zu9zulb90p7qu.R.inc(12968);return new GaussianCurveFitter(null, Integer.MAX_VALUE);
    }finally{__CLR4_4_19zu9zulb90p7qu.R.flushNeeded();}}

    /** {@inheritDoc} */
    public GaussianCurveFitter withStartPoint(double[] start) {try{__CLR4_4_19zu9zulb90p7qu.R.inc(12969);
        __CLR4_4_19zu9zulb90p7qu.R.inc(12970);return new GaussianCurveFitter(start.clone(),
                                       maxIter);
    }finally{__CLR4_4_19zu9zulb90p7qu.R.flushNeeded();}}

    /** {@inheritDoc} */
    public GaussianCurveFitter withMaxIterations(int max) {try{__CLR4_4_19zu9zulb90p7qu.R.inc(12971);
        __CLR4_4_19zu9zulb90p7qu.R.inc(12972);return new GaussianCurveFitter(initialGuess,
                                       max);
    }finally{__CLR4_4_19zu9zulb90p7qu.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    protected LevenbergMarquardtOptimizer getOptimizer(Collection<WeightedObservedPoint> observations) {try{__CLR4_4_19zu9zulb90p7qu.R.inc(12973);
        // Prepare least-squares problem.
        __CLR4_4_19zu9zulb90p7qu.R.inc(12974);final int len = observations.size();
        __CLR4_4_19zu9zulb90p7qu.R.inc(12975);final double[] target  = new double[len];
        __CLR4_4_19zu9zulb90p7qu.R.inc(12976);final double[] weights = new double[len];

        __CLR4_4_19zu9zulb90p7qu.R.inc(12977);int i = 0;
        __CLR4_4_19zu9zulb90p7qu.R.inc(12978);for (WeightedObservedPoint obs : observations) {{
            __CLR4_4_19zu9zulb90p7qu.R.inc(12979);target[i]  = obs.getY();
            __CLR4_4_19zu9zulb90p7qu.R.inc(12980);weights[i] = obs.getWeight();
            __CLR4_4_19zu9zulb90p7qu.R.inc(12981);++i;
        }

        }__CLR4_4_19zu9zulb90p7qu.R.inc(12982);final AbstractCurveFitter.TheoreticalValuesFunction model
            = new AbstractCurveFitter.TheoreticalValuesFunction(FUNCTION,
                                                                observations);

        __CLR4_4_19zu9zulb90p7qu.R.inc(12983);final double[] startPoint = (((initialGuess != null )&&(__CLR4_4_19zu9zulb90p7qu.R.iget(12984)!=0|true))||(__CLR4_4_19zu9zulb90p7qu.R.iget(12985)==0&false))?
            initialGuess :
            // Compute estimation.
            new ParameterGuesser(observations).guess();

        // Return a new optimizer set up to fit a Gaussian curve to the
        // observed points.
        __CLR4_4_19zu9zulb90p7qu.R.inc(12986);return LevenbergMarquardtOptimizer.create()
            .withMaxEvaluations(Integer.MAX_VALUE)
            .withMaxIterations(maxIter)
            .withStartPoint(startPoint)
            .withTarget(target)
            .withWeight(new DiagonalMatrix(weights))
            .withModelAndJacobian(model.getModelFunction(),
                                  model.getModelFunctionJacobian());
    }finally{__CLR4_4_19zu9zulb90p7qu.R.flushNeeded();}}

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
        public ParameterGuesser(Collection<WeightedObservedPoint> observations) {try{__CLR4_4_19zu9zulb90p7qu.R.inc(12987);
            __CLR4_4_19zu9zulb90p7qu.R.inc(12988);if ((((observations == null)&&(__CLR4_4_19zu9zulb90p7qu.R.iget(12989)!=0|true))||(__CLR4_4_19zu9zulb90p7qu.R.iget(12990)==0&false))) {{
                __CLR4_4_19zu9zulb90p7qu.R.inc(12991);throw new NullArgumentException(LocalizedFormats.INPUT_ARRAY);
            }
            }__CLR4_4_19zu9zulb90p7qu.R.inc(12992);if ((((observations.size() < 3)&&(__CLR4_4_19zu9zulb90p7qu.R.iget(12993)!=0|true))||(__CLR4_4_19zu9zulb90p7qu.R.iget(12994)==0&false))) {{
                __CLR4_4_19zu9zulb90p7qu.R.inc(12995);throw new NumberIsTooSmallException(observations.size(), 3, true);
            }

            }__CLR4_4_19zu9zulb90p7qu.R.inc(12996);final List<WeightedObservedPoint> sorted = sortObservations(observations);
            __CLR4_4_19zu9zulb90p7qu.R.inc(12997);final double[] params = basicGuess(sorted.toArray(new WeightedObservedPoint[0]));

            __CLR4_4_19zu9zulb90p7qu.R.inc(12998);norm = params[0];
            __CLR4_4_19zu9zulb90p7qu.R.inc(12999);mean = params[1];
            __CLR4_4_19zu9zulb90p7qu.R.inc(13000);sigma = params[2];
        }finally{__CLR4_4_19zu9zulb90p7qu.R.flushNeeded();}}

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
        public double[] guess() {try{__CLR4_4_19zu9zulb90p7qu.R.inc(13001);
            __CLR4_4_19zu9zulb90p7qu.R.inc(13002);return new double[] { norm, mean, sigma };
        }finally{__CLR4_4_19zu9zulb90p7qu.R.flushNeeded();}}

        /**
         * Sort the observations.
         *
         * @param unsorted Input observations.
         * @return the input observations, sorted.
         */
        private List<WeightedObservedPoint> sortObservations(Collection<WeightedObservedPoint> unsorted) {try{__CLR4_4_19zu9zulb90p7qu.R.inc(13003);
            __CLR4_4_19zu9zulb90p7qu.R.inc(13004);final List<WeightedObservedPoint> observations = new ArrayList<WeightedObservedPoint>(unsorted);

            __CLR4_4_19zu9zulb90p7qu.R.inc(13005);final Comparator<WeightedObservedPoint> cmp = new Comparator<WeightedObservedPoint>() {
                public int compare(WeightedObservedPoint p1,
                                   WeightedObservedPoint p2) {try{__CLR4_4_19zu9zulb90p7qu.R.inc(13006);
                    __CLR4_4_19zu9zulb90p7qu.R.inc(13007);if ((((p1 == null && p2 == null)&&(__CLR4_4_19zu9zulb90p7qu.R.iget(13008)!=0|true))||(__CLR4_4_19zu9zulb90p7qu.R.iget(13009)==0&false))) {{
                        __CLR4_4_19zu9zulb90p7qu.R.inc(13010);return 0;
                    }
                    }__CLR4_4_19zu9zulb90p7qu.R.inc(13011);if ((((p1 == null)&&(__CLR4_4_19zu9zulb90p7qu.R.iget(13012)!=0|true))||(__CLR4_4_19zu9zulb90p7qu.R.iget(13013)==0&false))) {{
                        __CLR4_4_19zu9zulb90p7qu.R.inc(13014);return -1;
                    }
                    }__CLR4_4_19zu9zulb90p7qu.R.inc(13015);if ((((p2 == null)&&(__CLR4_4_19zu9zulb90p7qu.R.iget(13016)!=0|true))||(__CLR4_4_19zu9zulb90p7qu.R.iget(13017)==0&false))) {{
                        __CLR4_4_19zu9zulb90p7qu.R.inc(13018);return 1;
                    }
                    }__CLR4_4_19zu9zulb90p7qu.R.inc(13019);if ((((p1.getX() < p2.getX())&&(__CLR4_4_19zu9zulb90p7qu.R.iget(13020)!=0|true))||(__CLR4_4_19zu9zulb90p7qu.R.iget(13021)==0&false))) {{
                        __CLR4_4_19zu9zulb90p7qu.R.inc(13022);return -1;
                    }
                    }__CLR4_4_19zu9zulb90p7qu.R.inc(13023);if ((((p1.getX() > p2.getX())&&(__CLR4_4_19zu9zulb90p7qu.R.iget(13024)!=0|true))||(__CLR4_4_19zu9zulb90p7qu.R.iget(13025)==0&false))) {{
                        __CLR4_4_19zu9zulb90p7qu.R.inc(13026);return 1;
                    }
                    }__CLR4_4_19zu9zulb90p7qu.R.inc(13027);if ((((p1.getY() < p2.getY())&&(__CLR4_4_19zu9zulb90p7qu.R.iget(13028)!=0|true))||(__CLR4_4_19zu9zulb90p7qu.R.iget(13029)==0&false))) {{
                        __CLR4_4_19zu9zulb90p7qu.R.inc(13030);return -1;
                    }
                    }__CLR4_4_19zu9zulb90p7qu.R.inc(13031);if ((((p1.getY() > p2.getY())&&(__CLR4_4_19zu9zulb90p7qu.R.iget(13032)!=0|true))||(__CLR4_4_19zu9zulb90p7qu.R.iget(13033)==0&false))) {{
                        __CLR4_4_19zu9zulb90p7qu.R.inc(13034);return 1;
                    }
                    }__CLR4_4_19zu9zulb90p7qu.R.inc(13035);if ((((p1.getWeight() < p2.getWeight())&&(__CLR4_4_19zu9zulb90p7qu.R.iget(13036)!=0|true))||(__CLR4_4_19zu9zulb90p7qu.R.iget(13037)==0&false))) {{
                        __CLR4_4_19zu9zulb90p7qu.R.inc(13038);return -1;
                    }
                    }__CLR4_4_19zu9zulb90p7qu.R.inc(13039);if ((((p1.getWeight() > p2.getWeight())&&(__CLR4_4_19zu9zulb90p7qu.R.iget(13040)!=0|true))||(__CLR4_4_19zu9zulb90p7qu.R.iget(13041)==0&false))) {{
                        __CLR4_4_19zu9zulb90p7qu.R.inc(13042);return 1;
                    }
                    }__CLR4_4_19zu9zulb90p7qu.R.inc(13043);return 0;
                }finally{__CLR4_4_19zu9zulb90p7qu.R.flushNeeded();}}
            };

            __CLR4_4_19zu9zulb90p7qu.R.inc(13044);Collections.sort(observations, cmp);
            __CLR4_4_19zu9zulb90p7qu.R.inc(13045);return observations;
        }finally{__CLR4_4_19zu9zulb90p7qu.R.flushNeeded();}}

        /**
         * Guesses the parameters based on the specified observed points.
         *
         * @param points Observed points, sorted.
         * @return the guessed parameters (normalization factor, mean and
         * sigma).
         */
        private double[] basicGuess(WeightedObservedPoint[] points) {try{__CLR4_4_19zu9zulb90p7qu.R.inc(13046);
            __CLR4_4_19zu9zulb90p7qu.R.inc(13047);final int maxYIdx = findMaxY(points);
            __CLR4_4_19zu9zulb90p7qu.R.inc(13048);final double n = points[maxYIdx].getY();
            __CLR4_4_19zu9zulb90p7qu.R.inc(13049);final double m = points[maxYIdx].getX();

            __CLR4_4_19zu9zulb90p7qu.R.inc(13050);double fwhmApprox;
            __CLR4_4_19zu9zulb90p7qu.R.inc(13051);try {
                __CLR4_4_19zu9zulb90p7qu.R.inc(13052);final double halfY = n + ((m - n) / 2);
                __CLR4_4_19zu9zulb90p7qu.R.inc(13053);final double fwhmX1 = interpolateXAtY(points, maxYIdx, -1, halfY);
                __CLR4_4_19zu9zulb90p7qu.R.inc(13054);final double fwhmX2 = interpolateXAtY(points, maxYIdx, 1, halfY);
                __CLR4_4_19zu9zulb90p7qu.R.inc(13055);fwhmApprox = fwhmX2 - fwhmX1;
            } catch (OutOfRangeException e) {
                // TODO: Exceptions should not be used for flow control.
                __CLR4_4_19zu9zulb90p7qu.R.inc(13056);fwhmApprox = points[points.length - 1].getX() - points[0].getX();
            }
            __CLR4_4_19zu9zulb90p7qu.R.inc(13057);final double s = fwhmApprox / (2 * FastMath.sqrt(2 * FastMath.log(2)));

            __CLR4_4_19zu9zulb90p7qu.R.inc(13058);return new double[] { n, m, s };
        }finally{__CLR4_4_19zu9zulb90p7qu.R.flushNeeded();}}

        /**
         * Finds index of point in specified points with the largest Y.
         *
         * @param points Points to search.
         * @return the index in specified points array.
         */
        private int findMaxY(WeightedObservedPoint[] points) {try{__CLR4_4_19zu9zulb90p7qu.R.inc(13059);
            __CLR4_4_19zu9zulb90p7qu.R.inc(13060);int maxYIdx = 0;
            __CLR4_4_19zu9zulb90p7qu.R.inc(13061);for (int i = 1; (((i < points.length)&&(__CLR4_4_19zu9zulb90p7qu.R.iget(13062)!=0|true))||(__CLR4_4_19zu9zulb90p7qu.R.iget(13063)==0&false)); i++) {{
                __CLR4_4_19zu9zulb90p7qu.R.inc(13064);if ((((points[i].getY() > points[maxYIdx].getY())&&(__CLR4_4_19zu9zulb90p7qu.R.iget(13065)!=0|true))||(__CLR4_4_19zu9zulb90p7qu.R.iget(13066)==0&false))) {{
                    __CLR4_4_19zu9zulb90p7qu.R.inc(13067);maxYIdx = i;
                }
            }}
            }__CLR4_4_19zu9zulb90p7qu.R.inc(13068);return maxYIdx;
        }finally{__CLR4_4_19zu9zulb90p7qu.R.flushNeeded();}}

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
            throws OutOfRangeException {try{__CLR4_4_19zu9zulb90p7qu.R.inc(13069);
            __CLR4_4_19zu9zulb90p7qu.R.inc(13070);if ((((idxStep == 0)&&(__CLR4_4_19zu9zulb90p7qu.R.iget(13071)!=0|true))||(__CLR4_4_19zu9zulb90p7qu.R.iget(13072)==0&false))) {{
                __CLR4_4_19zu9zulb90p7qu.R.inc(13073);throw new ZeroException();
            }
            }__CLR4_4_19zu9zulb90p7qu.R.inc(13074);final WeightedObservedPoint[] twoPoints
                = getInterpolationPointsForY(points, startIdx, idxStep, y);
            __CLR4_4_19zu9zulb90p7qu.R.inc(13075);final WeightedObservedPoint p1 = twoPoints[0];
            __CLR4_4_19zu9zulb90p7qu.R.inc(13076);final WeightedObservedPoint p2 = twoPoints[1];
            __CLR4_4_19zu9zulb90p7qu.R.inc(13077);if ((((p1.getY() == y)&&(__CLR4_4_19zu9zulb90p7qu.R.iget(13078)!=0|true))||(__CLR4_4_19zu9zulb90p7qu.R.iget(13079)==0&false))) {{
                __CLR4_4_19zu9zulb90p7qu.R.inc(13080);return p1.getX();
            }
            }__CLR4_4_19zu9zulb90p7qu.R.inc(13081);if ((((p2.getY() == y)&&(__CLR4_4_19zu9zulb90p7qu.R.iget(13082)!=0|true))||(__CLR4_4_19zu9zulb90p7qu.R.iget(13083)==0&false))) {{
                __CLR4_4_19zu9zulb90p7qu.R.inc(13084);return p2.getX();
            }
            }__CLR4_4_19zu9zulb90p7qu.R.inc(13085);return p1.getX() + (((y - p1.getY()) * (p2.getX() - p1.getX())) /
                                (p2.getY() - p1.getY()));
        }finally{__CLR4_4_19zu9zulb90p7qu.R.flushNeeded();}}

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
            throws OutOfRangeException {try{__CLR4_4_19zu9zulb90p7qu.R.inc(13086);
            __CLR4_4_19zu9zulb90p7qu.R.inc(13087);if ((((idxStep == 0)&&(__CLR4_4_19zu9zulb90p7qu.R.iget(13088)!=0|true))||(__CLR4_4_19zu9zulb90p7qu.R.iget(13089)==0&false))) {{
                __CLR4_4_19zu9zulb90p7qu.R.inc(13090);throw new ZeroException();
            }
            }__CLR4_4_19zu9zulb90p7qu.R.inc(13091);for (int i = startIdx;
                 ((((((idxStep < 0 )&&(__CLR4_4_19zu9zulb90p7qu.R.iget(13092)!=0|true))||(__CLR4_4_19zu9zulb90p7qu.R.iget(13093)==0&false))? i + idxStep >= 0 : i + idxStep < points.length)&&(__CLR4_4_19zu9zulb90p7qu.R.iget(13094)!=0|true))||(__CLR4_4_19zu9zulb90p7qu.R.iget(13095)==0&false));
                 i += idxStep) {{
                __CLR4_4_19zu9zulb90p7qu.R.inc(13096);final WeightedObservedPoint p1 = points[i];
                __CLR4_4_19zu9zulb90p7qu.R.inc(13097);final WeightedObservedPoint p2 = points[i + idxStep];
                __CLR4_4_19zu9zulb90p7qu.R.inc(13098);if ((((isBetween(y, p1.getY(), p2.getY()))&&(__CLR4_4_19zu9zulb90p7qu.R.iget(13099)!=0|true))||(__CLR4_4_19zu9zulb90p7qu.R.iget(13100)==0&false))) {{
                    __CLR4_4_19zu9zulb90p7qu.R.inc(13101);if ((((idxStep < 0)&&(__CLR4_4_19zu9zulb90p7qu.R.iget(13102)!=0|true))||(__CLR4_4_19zu9zulb90p7qu.R.iget(13103)==0&false))) {{
                        __CLR4_4_19zu9zulb90p7qu.R.inc(13104);return new WeightedObservedPoint[] { p2, p1 };
                    } }else {{
                        __CLR4_4_19zu9zulb90p7qu.R.inc(13105);return new WeightedObservedPoint[] { p1, p2 };
                    }
                }}
            }}

            // Boundaries are replaced by dummy values because the raised
            // exception is caught and the message never displayed.
            // TODO: Exceptions should not be used for flow control.
            }__CLR4_4_19zu9zulb90p7qu.R.inc(13106);throw new OutOfRangeException(y,
                                          Double.NEGATIVE_INFINITY,
                                          Double.POSITIVE_INFINITY);
        }finally{__CLR4_4_19zu9zulb90p7qu.R.flushNeeded();}}

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
                                  double boundary2) {try{__CLR4_4_19zu9zulb90p7qu.R.inc(13107);
            __CLR4_4_19zu9zulb90p7qu.R.inc(13108);return (value >= boundary1 && value <= boundary2) ||
                (value >= boundary2 && value <= boundary1);
        }finally{__CLR4_4_19zu9zulb90p7qu.R.flushNeeded();}}
    }
}
