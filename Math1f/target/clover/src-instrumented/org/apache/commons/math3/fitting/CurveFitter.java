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

import java.util.ArrayList;
import java.util.List;
import org.apache.commons.math3.analysis.MultivariateVectorFunction;
import org.apache.commons.math3.analysis.MultivariateMatrixFunction;
import org.apache.commons.math3.analysis.ParametricUnivariateFunction;
import org.apache.commons.math3.optim.MaxEval;
import org.apache.commons.math3.optim.InitialGuess;
import org.apache.commons.math3.optim.PointVectorValuePair;
import org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer;
import org.apache.commons.math3.optim.nonlinear.vector.ModelFunction;
import org.apache.commons.math3.optim.nonlinear.vector.ModelFunctionJacobian;
import org.apache.commons.math3.optim.nonlinear.vector.Target;
import org.apache.commons.math3.optim.nonlinear.vector.Weight;

/**
 * Fitter for parametric univariate real functions y = f(x).
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
 * @version $Id: CurveFitter.java 1416643 2012-12-03 19:37:14Z tn $
 * @since 2.0
 * @deprecated As of 3.3. Please use {@link AbstractCurveFitter} and
 * {@link WeightedObservedPoints} instead.
 */
@Deprecated
public class CurveFitter<T extends ParametricUnivariateFunction> {public static class __CLR4_4_19ym9ymlb90p7qb{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,12954,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /** Optimizer to use for the fitting. */
    private final MultivariateVectorOptimizer optimizer;
    /** Observed points. */
    private final List<WeightedObservedPoint> observations;

    /**
     * Simple constructor.
     *
     * @param optimizer Optimizer to use for the fitting.
     * @since 3.1
     */
    public CurveFitter(final MultivariateVectorOptimizer optimizer) {try{__CLR4_4_19ym9ymlb90p7qb.R.inc(12910);
        __CLR4_4_19ym9ymlb90p7qb.R.inc(12911);this.optimizer = optimizer;
        __CLR4_4_19ym9ymlb90p7qb.R.inc(12912);observations = new ArrayList<WeightedObservedPoint>();
    }finally{__CLR4_4_19ym9ymlb90p7qb.R.flushNeeded();}}

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
    public void addObservedPoint(double x, double y) {try{__CLR4_4_19ym9ymlb90p7qb.R.inc(12913);
        __CLR4_4_19ym9ymlb90p7qb.R.inc(12914);addObservedPoint(1.0, x, y);
    }finally{__CLR4_4_19ym9ymlb90p7qb.R.flushNeeded();}}

    /** Add an observed weighted (x,y) point to the sample.
     * @param weight weight of the observed point in the fit
     * @param x abscissa of the point
     * @param y observed value of the point at x, after fitting we should
     * have f(x) as close as possible to this value
     * @see #addObservedPoint(double, double)
     * @see #addObservedPoint(WeightedObservedPoint)
     * @see #getObservations()
     */
    public void addObservedPoint(double weight, double x, double y) {try{__CLR4_4_19ym9ymlb90p7qb.R.inc(12915);
        __CLR4_4_19ym9ymlb90p7qb.R.inc(12916);observations.add(new WeightedObservedPoint(weight, x, y));
    }finally{__CLR4_4_19ym9ymlb90p7qb.R.flushNeeded();}}

    /** Add an observed weighted (x,y) point to the sample.
     * @param observed observed point to add
     * @see #addObservedPoint(double, double)
     * @see #addObservedPoint(double, double, double)
     * @see #getObservations()
     */
    public void addObservedPoint(WeightedObservedPoint observed) {try{__CLR4_4_19ym9ymlb90p7qb.R.inc(12917);
        __CLR4_4_19ym9ymlb90p7qb.R.inc(12918);observations.add(observed);
    }finally{__CLR4_4_19ym9ymlb90p7qb.R.flushNeeded();}}

    /** Get the observed points.
     * @return observed points
     * @see #addObservedPoint(double, double)
     * @see #addObservedPoint(double, double, double)
     * @see #addObservedPoint(WeightedObservedPoint)
     */
    public WeightedObservedPoint[] getObservations() {try{__CLR4_4_19ym9ymlb90p7qb.R.inc(12919);
        __CLR4_4_19ym9ymlb90p7qb.R.inc(12920);return observations.toArray(new WeightedObservedPoint[observations.size()]);
    }finally{__CLR4_4_19ym9ymlb90p7qb.R.flushNeeded();}}

    /**
     * Remove all observations.
     */
    public void clearObservations() {try{__CLR4_4_19ym9ymlb90p7qb.R.inc(12921);
        __CLR4_4_19ym9ymlb90p7qb.R.inc(12922);observations.clear();
    }finally{__CLR4_4_19ym9ymlb90p7qb.R.flushNeeded();}}

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
    public double[] fit(T f, final double[] initialGuess) {try{__CLR4_4_19ym9ymlb90p7qb.R.inc(12923);
        __CLR4_4_19ym9ymlb90p7qb.R.inc(12924);return fit(Integer.MAX_VALUE, f, initialGuess);
    }finally{__CLR4_4_19ym9ymlb90p7qb.R.flushNeeded();}}

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
                        final double[] initialGuess) {try{__CLR4_4_19ym9ymlb90p7qb.R.inc(12925);
        // Prepare least squares problem.
        __CLR4_4_19ym9ymlb90p7qb.R.inc(12926);double[] target  = new double[observations.size()];
        __CLR4_4_19ym9ymlb90p7qb.R.inc(12927);double[] weights = new double[observations.size()];
        __CLR4_4_19ym9ymlb90p7qb.R.inc(12928);int i = 0;
        __CLR4_4_19ym9ymlb90p7qb.R.inc(12929);for (WeightedObservedPoint point : observations) {{
            __CLR4_4_19ym9ymlb90p7qb.R.inc(12930);target[i]  = point.getY();
            __CLR4_4_19ym9ymlb90p7qb.R.inc(12931);weights[i] = point.getWeight();
            __CLR4_4_19ym9ymlb90p7qb.R.inc(12932);++i;
        }

        // Input to the optimizer: the model and its Jacobian.
        }__CLR4_4_19ym9ymlb90p7qb.R.inc(12933);final TheoreticalValuesFunction model = new TheoreticalValuesFunction(f);

        // Perform the fit.
        __CLR4_4_19ym9ymlb90p7qb.R.inc(12934);final PointVectorValuePair optimum
            = optimizer.optimize(new MaxEval(maxEval),
                                 model.getModelFunction(),
                                 model.getModelFunctionJacobian(),
                                 new Target(target),
                                 new Weight(weights),
                                 new InitialGuess(initialGuess));
        // Extract the coefficients.
        __CLR4_4_19ym9ymlb90p7qb.R.inc(12935);return optimum.getPointRef();
    }finally{__CLR4_4_19ym9ymlb90p7qb.R.flushNeeded();}}

    /** Vectorial function computing function theoretical values. */
    private class TheoreticalValuesFunction {
        /** Function to fit. */
        private final ParametricUnivariateFunction f;

        /**
         * @param f function to fit.
         */
        public TheoreticalValuesFunction(final ParametricUnivariateFunction f) {try{__CLR4_4_19ym9ymlb90p7qb.R.inc(12936);
            __CLR4_4_19ym9ymlb90p7qb.R.inc(12937);this.f = f;
        }finally{__CLR4_4_19ym9ymlb90p7qb.R.flushNeeded();}}

        /**
         * @return the model function values.
         */
        public ModelFunction getModelFunction() {try{__CLR4_4_19ym9ymlb90p7qb.R.inc(12938);
            __CLR4_4_19ym9ymlb90p7qb.R.inc(12939);return new ModelFunction(new MultivariateVectorFunction() {
                    /** {@inheritDoc} */
                    public double[] value(double[] point) {try{__CLR4_4_19ym9ymlb90p7qb.R.inc(12940);
                        // compute the residuals
                        __CLR4_4_19ym9ymlb90p7qb.R.inc(12941);final double[] values = new double[observations.size()];
                        __CLR4_4_19ym9ymlb90p7qb.R.inc(12942);int i = 0;
                        __CLR4_4_19ym9ymlb90p7qb.R.inc(12943);for (WeightedObservedPoint observed : observations) {{
                            __CLR4_4_19ym9ymlb90p7qb.R.inc(12944);values[i++] = f.value(observed.getX(), point);
                        }

                        }__CLR4_4_19ym9ymlb90p7qb.R.inc(12945);return values;
                    }finally{__CLR4_4_19ym9ymlb90p7qb.R.flushNeeded();}}
                });
        }finally{__CLR4_4_19ym9ymlb90p7qb.R.flushNeeded();}}

        /**
         * @return the model function Jacobian.
         */
        public ModelFunctionJacobian getModelFunctionJacobian() {try{__CLR4_4_19ym9ymlb90p7qb.R.inc(12946);
            __CLR4_4_19ym9ymlb90p7qb.R.inc(12947);return new ModelFunctionJacobian(new MultivariateMatrixFunction() {
                    public double[][] value(double[] point) {try{__CLR4_4_19ym9ymlb90p7qb.R.inc(12948);
                        __CLR4_4_19ym9ymlb90p7qb.R.inc(12949);final double[][] jacobian = new double[observations.size()][];
                        __CLR4_4_19ym9ymlb90p7qb.R.inc(12950);int i = 0;
                        __CLR4_4_19ym9ymlb90p7qb.R.inc(12951);for (WeightedObservedPoint observed : observations) {{
                            __CLR4_4_19ym9ymlb90p7qb.R.inc(12952);jacobian[i++] = f.gradient(observed.getX(), point);
                        }
                        }__CLR4_4_19ym9ymlb90p7qb.R.inc(12953);return jacobian;
                    }finally{__CLR4_4_19ym9ymlb90p7qb.R.flushNeeded();}}
                });
        }finally{__CLR4_4_19ym9ymlb90p7qb.R.flushNeeded();}}
    }
}
