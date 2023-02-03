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

import java.util.Collection;
import org.apache.commons.math3.analysis.MultivariateVectorFunction;
import org.apache.commons.math3.analysis.MultivariateMatrixFunction;
import org.apache.commons.math3.analysis.ParametricUnivariateFunction;
import org.apache.commons.math3.optim.PointVectorValuePair;
import org.apache.commons.math3.optim.AbstractOptimizer;

/**
 * Base class that contains common code for fitting parametric univariate
 * real functions <code>y = f(p<sub>i</sub>;x)</code>, where {@code x} is
 * the independent variable and the <code>p<sub>i</sub></code> are the
 * <em>parameters</em>.
 * <br/>
 * A fitter will find the optimal values of the parameters by
 * <em>fitting</em> the curve so it remains very close to a set of
 * {@code N} observed points <code>(x<sub>k</sub>, y<sub>k</sub>)</code>,
 * {@code 0 <= k < N}.
 * <br/>
 * An algorithm usually performs the fit by finding the parameter
 * values that minimizes the objective function
 * <pre><code>
 *  &sum;y<sub>k</sub> - f(x<sub>k</sub>)<sup>2</sup>,
 * </code></pre>
 * which is actually a least-squares problem.
 * This class contains boilerplate code for calling the
 * {@link #fit(Collection)} method for obtaining the parameters.
 * The problem setup, such as the choice of optimization algorithm
 * for fitting a specific function is delegated to subclasses.
 *
 * @param <OPTIM> Optimizer to use for the fit.
 *
 * @version $Id$
 * @since 3.3
 */
public abstract class AbstractCurveFitter<OPTIM extends AbstractOptimizer<PointVectorValuePair, OPTIM>> {public static class __CLR4_4_19xt9xtlb90p7q2{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,12910,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /**
     * Fits a curve.
     * This method computes the coefficients of the curve that best
     * fit the sample of observed points.
     *
     * @param points Observations.
     * @return the fitted parameters.
     */
    public double[] fit(Collection<WeightedObservedPoint> points) {try{__CLR4_4_19xt9xtlb90p7q2.R.inc(12881);
        // Perform the fit.
        __CLR4_4_19xt9xtlb90p7q2.R.inc(12882);return getOptimizer(points).optimize().getPoint();
    }finally{__CLR4_4_19xt9xtlb90p7q2.R.flushNeeded();}}

    /**
     * Creates an optimizer set up to fit the appropriate curve.
     *
     * @param points Sample points.
     * @return the optimizer to use for fitting the curve to the
     * given {@code points}.
     */
    protected abstract OPTIM getOptimizer(Collection<WeightedObservedPoint> points);

    /**
     * Vector function for computing function theoretical values.
     */
    protected static class TheoreticalValuesFunction {
        /** Function to fit. */
        private final ParametricUnivariateFunction f;
        /** Observations. */
        private final double[] points;

        /**
         * @param f function to fit.
         * @param observations Observations.
         */
        public TheoreticalValuesFunction(final ParametricUnivariateFunction f,
                                         final Collection<WeightedObservedPoint> observations) {try{__CLR4_4_19xt9xtlb90p7q2.R.inc(12883);
            __CLR4_4_19xt9xtlb90p7q2.R.inc(12884);this.f = f;

            __CLR4_4_19xt9xtlb90p7q2.R.inc(12885);final int len = observations.size();
            __CLR4_4_19xt9xtlb90p7q2.R.inc(12886);this.points = new double[len];
            __CLR4_4_19xt9xtlb90p7q2.R.inc(12887);int i = 0;
            __CLR4_4_19xt9xtlb90p7q2.R.inc(12888);for (WeightedObservedPoint obs : observations) {{
                __CLR4_4_19xt9xtlb90p7q2.R.inc(12889);this.points[i++] = obs.getX();
            }
        }}finally{__CLR4_4_19xt9xtlb90p7q2.R.flushNeeded();}}

        /**
         * @return the model function values.
         */
        public MultivariateVectorFunction getModelFunction() {try{__CLR4_4_19xt9xtlb90p7q2.R.inc(12890);
            __CLR4_4_19xt9xtlb90p7q2.R.inc(12891);return new MultivariateVectorFunction() {
                /** {@inheritDoc} */
                public double[] value(double[] p) {try{__CLR4_4_19xt9xtlb90p7q2.R.inc(12892);
                    __CLR4_4_19xt9xtlb90p7q2.R.inc(12893);final int len = points.length;
                    __CLR4_4_19xt9xtlb90p7q2.R.inc(12894);final double[] values = new double[len];
                    __CLR4_4_19xt9xtlb90p7q2.R.inc(12895);for (int i = 0; (((i < len)&&(__CLR4_4_19xt9xtlb90p7q2.R.iget(12896)!=0|true))||(__CLR4_4_19xt9xtlb90p7q2.R.iget(12897)==0&false)); i++) {{
                        __CLR4_4_19xt9xtlb90p7q2.R.inc(12898);values[i] = f.value(points[i], p);
                    }

                    }__CLR4_4_19xt9xtlb90p7q2.R.inc(12899);return values;
                }finally{__CLR4_4_19xt9xtlb90p7q2.R.flushNeeded();}}
            };
        }finally{__CLR4_4_19xt9xtlb90p7q2.R.flushNeeded();}}

        /**
         * @return the model function Jacobian.
         */
        public MultivariateMatrixFunction getModelFunctionJacobian() {try{__CLR4_4_19xt9xtlb90p7q2.R.inc(12900);
            __CLR4_4_19xt9xtlb90p7q2.R.inc(12901);return new MultivariateMatrixFunction() {
                public double[][] value(double[] p) {try{__CLR4_4_19xt9xtlb90p7q2.R.inc(12902);
                    __CLR4_4_19xt9xtlb90p7q2.R.inc(12903);final int len = points.length;
                    __CLR4_4_19xt9xtlb90p7q2.R.inc(12904);final double[][] jacobian = new double[len][];
                    __CLR4_4_19xt9xtlb90p7q2.R.inc(12905);for (int i = 0; (((i < len)&&(__CLR4_4_19xt9xtlb90p7q2.R.iget(12906)!=0|true))||(__CLR4_4_19xt9xtlb90p7q2.R.iget(12907)==0&false)); i++) {{
                        __CLR4_4_19xt9xtlb90p7q2.R.inc(12908);jacobian[i] = f.gradient(points[i], p);
                    }
                    }__CLR4_4_19xt9xtlb90p7q2.R.inc(12909);return jacobian;
                }finally{__CLR4_4_19xt9xtlb90p7q2.R.flushNeeded();}}
            };
        }finally{__CLR4_4_19xt9xtlb90p7q2.R.flushNeeded();}}
    }
}
