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

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.math3.analysis.DifferentiableMultivariateVectorFunction;
import org.apache.commons.math3.analysis.MultivariateMatrixFunction;
import org.apache.commons.math3.analysis.ParametricUnivariateFunction;
import org.apache.commons.math3.analysis.differentiation.DerivativeStructure;
import org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableVectorFunction;
import org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer;
import org.apache.commons.math3.optimization.MultivariateDifferentiableVectorOptimizer;
import org.apache.commons.math3.optimization.PointVectorValuePair;

/** Fitter for parametric univariate real functions y = f(x).
 * <br/>
 * When a univariate real function y = f(x) does depend on some
 * unknown parameters p<sub>0</sub>, p<sub>1</sub> ... p<sub>n-1</sub>,
 * this class can be used to find these parameters. It does this
 * by <em>fitting</em> the curve so it remains very close to a set of
 * observed points (x<sub>0</sub>, y<sub>0</sub>), (x<sub>1</sub>,
 * y<sub>1</sub>) ... (x<sub>k-1</sub>, y<sub>k-1</sub>). This fitting
 * is done by finding the parameters values that minimizes the objective
 * function &sum;(y<sub>i</sub>-f(x<sub>i</sub>))<sup>2</sup>. This is
 * really a least squares problem.
 *
 * @param <T> Function to use for the fit.
 *
 * @version $Id$
 * @deprecated As of 3.1 (to be removed in 4.0).
 * @since 2.0
 */
@Deprecated
public class CurveFitter<T extends ParametricUnivariateFunction> {public static class __CLR4_4_1yhzyhzlb90pa33{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,44786,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** Optimizer to use for the fitting.
     * @deprecated as of 3.1 replaced by {@link #optimizer}
     */
    @Deprecated
    private final DifferentiableMultivariateVectorOptimizer oldOptimizer;

    /** Optimizer to use for the fitting. */
    private final MultivariateDifferentiableVectorOptimizer optimizer;

    /** Observed points. */
    private final List<WeightedObservedPoint> observations;

    /** Simple constructor.
     * @param optimizer optimizer to use for the fitting
     * @deprecated as of 3.1 replaced by {@link #CurveFitter(MultivariateDifferentiableVectorOptimizer)}
     */
    @Deprecated
    public CurveFitter(final DifferentiableMultivariateVectorOptimizer optimizer) {try{__CLR4_4_1yhzyhzlb90pa33.R.inc(44711);
        __CLR4_4_1yhzyhzlb90pa33.R.inc(44712);this.oldOptimizer = optimizer;
        __CLR4_4_1yhzyhzlb90pa33.R.inc(44713);this.optimizer    = null;
        __CLR4_4_1yhzyhzlb90pa33.R.inc(44714);observations      = new ArrayList<WeightedObservedPoint>();
    }finally{__CLR4_4_1yhzyhzlb90pa33.R.flushNeeded();}}

    /** Simple constructor.
     * @param optimizer optimizer to use for the fitting
     * @since 3.1
     */
    public CurveFitter(final MultivariateDifferentiableVectorOptimizer optimizer) {try{__CLR4_4_1yhzyhzlb90pa33.R.inc(44715);
        __CLR4_4_1yhzyhzlb90pa33.R.inc(44716);this.oldOptimizer = null;
        __CLR4_4_1yhzyhzlb90pa33.R.inc(44717);this.optimizer    = optimizer;
        __CLR4_4_1yhzyhzlb90pa33.R.inc(44718);observations      = new ArrayList<WeightedObservedPoint>();
    }finally{__CLR4_4_1yhzyhzlb90pa33.R.flushNeeded();}}

    /** Add an observed (x,y) point to the sample with unit weight.
     * <p>Calling this method is equivalent to call
     * {@code addObservedPoint(1.0, x, y)}.</p>
     * @param x abscissa of the point
     * @param y observed value of the point at x, after fitting we should
     * have f(x) as close as possible to this value
     * @see #addObservedPoint(double, double, double)
     * @see #addObservedPoint(WeightedObservedPoint)
     * @see #getObservations()
     */
    public void addObservedPoint(double x, double y) {try{__CLR4_4_1yhzyhzlb90pa33.R.inc(44719);
        __CLR4_4_1yhzyhzlb90pa33.R.inc(44720);addObservedPoint(1.0, x, y);
    }finally{__CLR4_4_1yhzyhzlb90pa33.R.flushNeeded();}}

    /** Add an observed weighted (x,y) point to the sample.
     * @param weight weight of the observed point in the fit
     * @param x abscissa of the point
     * @param y observed value of the point at x, after fitting we should
     * have f(x) as close as possible to this value
     * @see #addObservedPoint(double, double)
     * @see #addObservedPoint(WeightedObservedPoint)
     * @see #getObservations()
     */
    public void addObservedPoint(double weight, double x, double y) {try{__CLR4_4_1yhzyhzlb90pa33.R.inc(44721);
        __CLR4_4_1yhzyhzlb90pa33.R.inc(44722);observations.add(new WeightedObservedPoint(weight, x, y));
    }finally{__CLR4_4_1yhzyhzlb90pa33.R.flushNeeded();}}

    /** Add an observed weighted (x,y) point to the sample.
     * @param observed observed point to add
     * @see #addObservedPoint(double, double)
     * @see #addObservedPoint(double, double, double)
     * @see #getObservations()
     */
    public void addObservedPoint(WeightedObservedPoint observed) {try{__CLR4_4_1yhzyhzlb90pa33.R.inc(44723);
        __CLR4_4_1yhzyhzlb90pa33.R.inc(44724);observations.add(observed);
    }finally{__CLR4_4_1yhzyhzlb90pa33.R.flushNeeded();}}

    /** Get the observed points.
     * @return observed points
     * @see #addObservedPoint(double, double)
     * @see #addObservedPoint(double, double, double)
     * @see #addObservedPoint(WeightedObservedPoint)
     */
    public WeightedObservedPoint[] getObservations() {try{__CLR4_4_1yhzyhzlb90pa33.R.inc(44725);
        __CLR4_4_1yhzyhzlb90pa33.R.inc(44726);return observations.toArray(new WeightedObservedPoint[observations.size()]);
    }finally{__CLR4_4_1yhzyhzlb90pa33.R.flushNeeded();}}

    /**
     * Remove all observations.
     */
    public void clearObservations() {try{__CLR4_4_1yhzyhzlb90pa33.R.inc(44727);
        __CLR4_4_1yhzyhzlb90pa33.R.inc(44728);observations.clear();
    }finally{__CLR4_4_1yhzyhzlb90pa33.R.flushNeeded();}}

    /**
     * Fit a curve.
     * This method compute the coefficients of the curve that best
     * fit the sample of observed points previously given through calls
     * to the {@link #addObservedPoint(WeightedObservedPoint)
     * addObservedPoint} method.
     *
     * @param f parametric function to fit.
     * @param initialGuess first guess of the function parameters.
     * @return the fitted parameters.
     * @throws org.apache.commons.math3.exception.DimensionMismatchException
     * if the start point dimension is wrong.
     */
    public double[] fit(T f, final double[] initialGuess) {try{__CLR4_4_1yhzyhzlb90pa33.R.inc(44729);
        __CLR4_4_1yhzyhzlb90pa33.R.inc(44730);return fit(Integer.MAX_VALUE, f, initialGuess);
    }finally{__CLR4_4_1yhzyhzlb90pa33.R.flushNeeded();}}

    /**
     * Fit a curve.
     * This method compute the coefficients of the curve that best
     * fit the sample of observed points previously given through calls
     * to the {@link #addObservedPoint(WeightedObservedPoint)
     * addObservedPoint} method.
     *
     * @param f parametric function to fit.
     * @param initialGuess first guess of the function parameters.
     * @param maxEval Maximum number of function evaluations.
     * @return the fitted parameters.
     * @throws org.apache.commons.math3.exception.TooManyEvaluationsException
     * if the number of allowed evaluations is exceeded.
     * @throws org.apache.commons.math3.exception.DimensionMismatchException
     * if the start point dimension is wrong.
     * @since 3.0
     */
    public double[] fit(int maxEval, T f,
                        final double[] initialGuess) {try{__CLR4_4_1yhzyhzlb90pa33.R.inc(44731);
        // prepare least squares problem
        __CLR4_4_1yhzyhzlb90pa33.R.inc(44732);double[] target  = new double[observations.size()];
        __CLR4_4_1yhzyhzlb90pa33.R.inc(44733);double[] weights = new double[observations.size()];
        __CLR4_4_1yhzyhzlb90pa33.R.inc(44734);int i = 0;
        __CLR4_4_1yhzyhzlb90pa33.R.inc(44735);for (WeightedObservedPoint point : observations) {{
            __CLR4_4_1yhzyhzlb90pa33.R.inc(44736);target[i]  = point.getY();
            __CLR4_4_1yhzyhzlb90pa33.R.inc(44737);weights[i] = point.getWeight();
            __CLR4_4_1yhzyhzlb90pa33.R.inc(44738);++i;
        }

        // perform the fit
        }__CLR4_4_1yhzyhzlb90pa33.R.inc(44739);final PointVectorValuePair optimum;
        __CLR4_4_1yhzyhzlb90pa33.R.inc(44740);if ((((optimizer == null)&&(__CLR4_4_1yhzyhzlb90pa33.R.iget(44741)!=0|true))||(__CLR4_4_1yhzyhzlb90pa33.R.iget(44742)==0&false))) {{
            // to be removed in 4.0
            __CLR4_4_1yhzyhzlb90pa33.R.inc(44743);optimum = oldOptimizer.optimize(maxEval, new OldTheoreticalValuesFunction(f),
                                            target, weights, initialGuess);
        } }else {{
            __CLR4_4_1yhzyhzlb90pa33.R.inc(44744);optimum = optimizer.optimize(maxEval, new TheoreticalValuesFunction(f),
                                         target, weights, initialGuess);
        }

        // extract the coefficients
        }__CLR4_4_1yhzyhzlb90pa33.R.inc(44745);return optimum.getPointRef();
    }finally{__CLR4_4_1yhzyhzlb90pa33.R.flushNeeded();}}

    /** Vectorial function computing function theoretical values. */
    @Deprecated
    private class OldTheoreticalValuesFunction
        implements DifferentiableMultivariateVectorFunction {
        /** Function to fit. */
        private final ParametricUnivariateFunction f;

        /** Simple constructor.
         * @param f function to fit.
         */
        public OldTheoreticalValuesFunction(final ParametricUnivariateFunction f) {try{__CLR4_4_1yhzyhzlb90pa33.R.inc(44746);
            __CLR4_4_1yhzyhzlb90pa33.R.inc(44747);this.f = f;
        }finally{__CLR4_4_1yhzyhzlb90pa33.R.flushNeeded();}}

        /** {@inheritDoc} */
        public MultivariateMatrixFunction jacobian() {try{__CLR4_4_1yhzyhzlb90pa33.R.inc(44748);
            __CLR4_4_1yhzyhzlb90pa33.R.inc(44749);return new MultivariateMatrixFunction() {
                public double[][] value(double[] point) {try{__CLR4_4_1yhzyhzlb90pa33.R.inc(44750);
                    __CLR4_4_1yhzyhzlb90pa33.R.inc(44751);final double[][] jacobian = new double[observations.size()][];

                    __CLR4_4_1yhzyhzlb90pa33.R.inc(44752);int i = 0;
                    __CLR4_4_1yhzyhzlb90pa33.R.inc(44753);for (WeightedObservedPoint observed : observations) {{
                        __CLR4_4_1yhzyhzlb90pa33.R.inc(44754);jacobian[i++] = f.gradient(observed.getX(), point);
                    }

                    }__CLR4_4_1yhzyhzlb90pa33.R.inc(44755);return jacobian;
                }finally{__CLR4_4_1yhzyhzlb90pa33.R.flushNeeded();}}
            };
        }finally{__CLR4_4_1yhzyhzlb90pa33.R.flushNeeded();}}

        /** {@inheritDoc} */
        public double[] value(double[] point) {try{__CLR4_4_1yhzyhzlb90pa33.R.inc(44756);
            // compute the residuals
            __CLR4_4_1yhzyhzlb90pa33.R.inc(44757);final double[] values = new double[observations.size()];
            __CLR4_4_1yhzyhzlb90pa33.R.inc(44758);int i = 0;
            __CLR4_4_1yhzyhzlb90pa33.R.inc(44759);for (WeightedObservedPoint observed : observations) {{
                __CLR4_4_1yhzyhzlb90pa33.R.inc(44760);values[i++] = f.value(observed.getX(), point);
            }

            }__CLR4_4_1yhzyhzlb90pa33.R.inc(44761);return values;
        }finally{__CLR4_4_1yhzyhzlb90pa33.R.flushNeeded();}}
    }

    /** Vectorial function computing function theoretical values. */
    private class TheoreticalValuesFunction implements MultivariateDifferentiableVectorFunction {

        /** Function to fit. */
        private final ParametricUnivariateFunction f;

        /** Simple constructor.
         * @param f function to fit.
         */
        public TheoreticalValuesFunction(final ParametricUnivariateFunction f) {try{__CLR4_4_1yhzyhzlb90pa33.R.inc(44762);
            __CLR4_4_1yhzyhzlb90pa33.R.inc(44763);this.f = f;
        }finally{__CLR4_4_1yhzyhzlb90pa33.R.flushNeeded();}}

        /** {@inheritDoc} */
        public double[] value(double[] point) {try{__CLR4_4_1yhzyhzlb90pa33.R.inc(44764);
            // compute the residuals
            __CLR4_4_1yhzyhzlb90pa33.R.inc(44765);final double[] values = new double[observations.size()];
            __CLR4_4_1yhzyhzlb90pa33.R.inc(44766);int i = 0;
            __CLR4_4_1yhzyhzlb90pa33.R.inc(44767);for (WeightedObservedPoint observed : observations) {{
                __CLR4_4_1yhzyhzlb90pa33.R.inc(44768);values[i++] = f.value(observed.getX(), point);
            }

            }__CLR4_4_1yhzyhzlb90pa33.R.inc(44769);return values;
        }finally{__CLR4_4_1yhzyhzlb90pa33.R.flushNeeded();}}

        /** {@inheritDoc} */
        public DerivativeStructure[] value(DerivativeStructure[] point) {try{__CLR4_4_1yhzyhzlb90pa33.R.inc(44770);

            // extract parameters
            __CLR4_4_1yhzyhzlb90pa33.R.inc(44771);final double[] parameters = new double[point.length];
            __CLR4_4_1yhzyhzlb90pa33.R.inc(44772);for (int k = 0; (((k < point.length)&&(__CLR4_4_1yhzyhzlb90pa33.R.iget(44773)!=0|true))||(__CLR4_4_1yhzyhzlb90pa33.R.iget(44774)==0&false)); ++k) {{
                __CLR4_4_1yhzyhzlb90pa33.R.inc(44775);parameters[k] = point[k].getValue();
            }

            // compute the residuals
            }__CLR4_4_1yhzyhzlb90pa33.R.inc(44776);final DerivativeStructure[] values = new DerivativeStructure[observations.size()];
            __CLR4_4_1yhzyhzlb90pa33.R.inc(44777);int i = 0;
            __CLR4_4_1yhzyhzlb90pa33.R.inc(44778);for (WeightedObservedPoint observed : observations) {{

                // build the DerivativeStructure by adding first the value as a constant
                // and then adding derivatives
                __CLR4_4_1yhzyhzlb90pa33.R.inc(44779);DerivativeStructure vi = new DerivativeStructure(point.length, 1, f.value(observed.getX(), parameters));
                __CLR4_4_1yhzyhzlb90pa33.R.inc(44780);for (int k = 0; (((k < point.length)&&(__CLR4_4_1yhzyhzlb90pa33.R.iget(44781)!=0|true))||(__CLR4_4_1yhzyhzlb90pa33.R.iget(44782)==0&false)); ++k) {{
                    __CLR4_4_1yhzyhzlb90pa33.R.inc(44783);vi = vi.add(new DerivativeStructure(point.length, 1, k, 0.0));
                }

                }__CLR4_4_1yhzyhzlb90pa33.R.inc(44784);values[i++] = vi;

            }

            }__CLR4_4_1yhzyhzlb90pa33.R.inc(44785);return values;
        }finally{__CLR4_4_1yhzyhzlb90pa33.R.flushNeeded();}}

    }

}
