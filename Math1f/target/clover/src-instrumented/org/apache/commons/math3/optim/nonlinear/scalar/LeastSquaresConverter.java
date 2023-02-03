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

package org.apache.commons.math3.optim.nonlinear.scalar;

import org.apache.commons.math3.analysis.MultivariateFunction;
import org.apache.commons.math3.analysis.MultivariateVectorFunction;
import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.linear.RealMatrix;

/**
 * This class converts
 * {@link MultivariateVectorFunction vectorial objective functions} to
 * {@link MultivariateFunction scalar objective functions}
 * when the goal is to minimize them.
 * <br/>
 * This class is mostly used when the vectorial objective function represents
 * a theoretical result computed from a point set applied to a model and
 * the models point must be adjusted to fit the theoretical result to some
 * reference observations. The observations may be obtained for example from
 * physical measurements whether the model is built from theoretical
 * considerations.
 * <br/>
 * This class computes a possibly weighted squared sum of the residuals, which is
 * a scalar value. The residuals are the difference between the theoretical model
 * (i.e. the output of the vectorial objective function) and the observations. The
 * class implements the {@link MultivariateFunction} interface and can therefore be
 * minimized by any optimizer supporting scalar objectives functions.This is one way
 * to perform a least square estimation. There are other ways to do this without using
 * this converter, as some optimization algorithms directly support vectorial objective
 * functions.
 * <br/>
 * This class support combination of residuals with or without weights and correlations.
  *
 * @see MultivariateFunction
 * @see MultivariateVectorFunction
 * @version $Id$
 * @since 2.0
 */

public class LeastSquaresConverter implements MultivariateFunction {public static class __CLR4_4_1s3ts3tlb90p9nd{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,36475,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /** Underlying vectorial function. */
    private final MultivariateVectorFunction function;
    /** Observations to be compared to objective function to compute residuals. */
    private final double[] observations;
    /** Optional weights for the residuals. */
    private final double[] weights;
    /** Optional scaling matrix (weight and correlations) for the residuals. */
    private final RealMatrix scale;

    /**
     * Builds a simple converter for uncorrelated residuals with identical
     * weights.
     *
     * @param function vectorial residuals function to wrap
     * @param observations observations to be compared to objective function to compute residuals
     */
    public LeastSquaresConverter(final MultivariateVectorFunction function,
                                 final double[] observations) {try{__CLR4_4_1s3ts3tlb90p9nd.R.inc(36425);
        __CLR4_4_1s3ts3tlb90p9nd.R.inc(36426);this.function     = function;
        __CLR4_4_1s3ts3tlb90p9nd.R.inc(36427);this.observations = observations.clone();
        __CLR4_4_1s3ts3tlb90p9nd.R.inc(36428);this.weights      = null;
        __CLR4_4_1s3ts3tlb90p9nd.R.inc(36429);this.scale        = null;
    }finally{__CLR4_4_1s3ts3tlb90p9nd.R.flushNeeded();}}

    /**
     * Builds a simple converter for uncorrelated residuals with the
     * specified weights.
     * <p>
     * The scalar objective function value is computed as:
     * <pre>
     * objective = &sum;weight<sub>i</sub>(observation<sub>i</sub>-objective<sub>i</sub>)<sup>2</sup>
     * </pre>
     * </p>
     * <p>
     * Weights can be used for example to combine residuals with different standard
     * deviations. As an example, consider a residuals array in which even elements
     * are angular measurements in degrees with a 0.01&deg; standard deviation and
     * odd elements are distance measurements in meters with a 15m standard deviation.
     * In this case, the weights array should be initialized with value
     * 1.0/(0.01<sup>2</sup>) in the even elements and 1.0/(15.0<sup>2</sup>) in the
     * odd elements (i.e. reciprocals of variances).
     * </p>
     * <p>
     * The array computed by the objective function, the observations array and the
     * weights array must have consistent sizes or a {@link DimensionMismatchException}
     * will be triggered while computing the scalar objective.
     * </p>
     *
     * @param function vectorial residuals function to wrap
     * @param observations observations to be compared to objective function to compute residuals
     * @param weights weights to apply to the residuals
     * @throws DimensionMismatchException if the observations vector and the weights
     * vector dimensions do not match (objective function dimension is checked only when
     * the {@link #value(double[])} method is called)
     */
    public LeastSquaresConverter(final MultivariateVectorFunction function,
                                 final double[] observations,
                                 final double[] weights) {try{__CLR4_4_1s3ts3tlb90p9nd.R.inc(36430);
        __CLR4_4_1s3ts3tlb90p9nd.R.inc(36431);if ((((observations.length != weights.length)&&(__CLR4_4_1s3ts3tlb90p9nd.R.iget(36432)!=0|true))||(__CLR4_4_1s3ts3tlb90p9nd.R.iget(36433)==0&false))) {{
            __CLR4_4_1s3ts3tlb90p9nd.R.inc(36434);throw new DimensionMismatchException(observations.length, weights.length);
        }
        }__CLR4_4_1s3ts3tlb90p9nd.R.inc(36435);this.function     = function;
        __CLR4_4_1s3ts3tlb90p9nd.R.inc(36436);this.observations = observations.clone();
        __CLR4_4_1s3ts3tlb90p9nd.R.inc(36437);this.weights      = weights.clone();
        __CLR4_4_1s3ts3tlb90p9nd.R.inc(36438);this.scale        = null;
    }finally{__CLR4_4_1s3ts3tlb90p9nd.R.flushNeeded();}}

    /**
     * Builds a simple converter for correlated residuals with the
     * specified weights.
     * <p>
     * The scalar objective function value is computed as:
     * <pre>
     * objective = y<sup>T</sup>y with y = scale&times;(observation-objective)
     * </pre>
     * </p>
     * <p>
     * The array computed by the objective function, the observations array and the
     * the scaling matrix must have consistent sizes or a {@link DimensionMismatchException}
     * will be triggered while computing the scalar objective.
     * </p>
     *
     * @param function vectorial residuals function to wrap
     * @param observations observations to be compared to objective function to compute residuals
     * @param scale scaling matrix
     * @throws DimensionMismatchException if the observations vector and the scale
     * matrix dimensions do not match (objective function dimension is checked only when
     * the {@link #value(double[])} method is called)
     */
    public LeastSquaresConverter(final MultivariateVectorFunction function,
                                 final double[] observations,
                                 final RealMatrix scale) {try{__CLR4_4_1s3ts3tlb90p9nd.R.inc(36439);
        __CLR4_4_1s3ts3tlb90p9nd.R.inc(36440);if ((((observations.length != scale.getColumnDimension())&&(__CLR4_4_1s3ts3tlb90p9nd.R.iget(36441)!=0|true))||(__CLR4_4_1s3ts3tlb90p9nd.R.iget(36442)==0&false))) {{
            __CLR4_4_1s3ts3tlb90p9nd.R.inc(36443);throw new DimensionMismatchException(observations.length, scale.getColumnDimension());
        }
        }__CLR4_4_1s3ts3tlb90p9nd.R.inc(36444);this.function     = function;
        __CLR4_4_1s3ts3tlb90p9nd.R.inc(36445);this.observations = observations.clone();
        __CLR4_4_1s3ts3tlb90p9nd.R.inc(36446);this.weights      = null;
        __CLR4_4_1s3ts3tlb90p9nd.R.inc(36447);this.scale        = scale.copy();
    }finally{__CLR4_4_1s3ts3tlb90p9nd.R.flushNeeded();}}

    /** {@inheritDoc} */
    public double value(final double[] point) {try{__CLR4_4_1s3ts3tlb90p9nd.R.inc(36448);
        // compute residuals
        __CLR4_4_1s3ts3tlb90p9nd.R.inc(36449);final double[] residuals = function.value(point);
        __CLR4_4_1s3ts3tlb90p9nd.R.inc(36450);if ((((residuals.length != observations.length)&&(__CLR4_4_1s3ts3tlb90p9nd.R.iget(36451)!=0|true))||(__CLR4_4_1s3ts3tlb90p9nd.R.iget(36452)==0&false))) {{
            __CLR4_4_1s3ts3tlb90p9nd.R.inc(36453);throw new DimensionMismatchException(residuals.length, observations.length);
        }
        }__CLR4_4_1s3ts3tlb90p9nd.R.inc(36454);for (int i = 0; (((i < residuals.length)&&(__CLR4_4_1s3ts3tlb90p9nd.R.iget(36455)!=0|true))||(__CLR4_4_1s3ts3tlb90p9nd.R.iget(36456)==0&false)); ++i) {{
            __CLR4_4_1s3ts3tlb90p9nd.R.inc(36457);residuals[i] -= observations[i];
        }

        // compute sum of squares
        }__CLR4_4_1s3ts3tlb90p9nd.R.inc(36458);double sumSquares = 0;
        __CLR4_4_1s3ts3tlb90p9nd.R.inc(36459);if ((((weights != null)&&(__CLR4_4_1s3ts3tlb90p9nd.R.iget(36460)!=0|true))||(__CLR4_4_1s3ts3tlb90p9nd.R.iget(36461)==0&false))) {{
            __CLR4_4_1s3ts3tlb90p9nd.R.inc(36462);for (int i = 0; (((i < residuals.length)&&(__CLR4_4_1s3ts3tlb90p9nd.R.iget(36463)!=0|true))||(__CLR4_4_1s3ts3tlb90p9nd.R.iget(36464)==0&false)); ++i) {{
                __CLR4_4_1s3ts3tlb90p9nd.R.inc(36465);final double ri = residuals[i];
                __CLR4_4_1s3ts3tlb90p9nd.R.inc(36466);sumSquares +=  weights[i] * ri * ri;
            }
        }} }else {__CLR4_4_1s3ts3tlb90p9nd.R.inc(36467);if ((((scale != null)&&(__CLR4_4_1s3ts3tlb90p9nd.R.iget(36468)!=0|true))||(__CLR4_4_1s3ts3tlb90p9nd.R.iget(36469)==0&false))) {{
            __CLR4_4_1s3ts3tlb90p9nd.R.inc(36470);for (final double yi : scale.operate(residuals)) {{
                __CLR4_4_1s3ts3tlb90p9nd.R.inc(36471);sumSquares += yi * yi;
            }
        }} }else {{
            __CLR4_4_1s3ts3tlb90p9nd.R.inc(36472);for (final double ri : residuals) {{
                __CLR4_4_1s3ts3tlb90p9nd.R.inc(36473);sumSquares += ri * ri;
            }
        }}

        }}__CLR4_4_1s3ts3tlb90p9nd.R.inc(36474);return sumSquares;
    }finally{__CLR4_4_1s3ts3tlb90p9nd.R.flushNeeded();}}
}
