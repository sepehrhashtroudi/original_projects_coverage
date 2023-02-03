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
package org.apache.commons.math3.analysis.integration.gauss;

import org.apache.commons.math3.analysis.UnivariateFunction;
import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.exception.NonMonotonicSequenceException;
import org.apache.commons.math3.util.MathArrays;
import org.apache.commons.math3.util.Pair;

/**
 * Class that implements the Gaussian rule for
 * {@link #integrate(UnivariateFunction) integrating} a weighted
 * function.
 *
 * @since 3.1
 * @version $Id$
 */
public class GaussIntegrator {public static class __CLR4_4_124d24dlb90p6pd{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,2778,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /** Nodes. */
    private final double[] points;
    /** Nodes weights. */
    private final double[] weights;

    /**
     * Creates an integrator from the given {@code points} and {@code weights}.
     * The integration interval is defined by the first and last value of
     * {@code points} which must be sorted in increasing order.
     *
     * @param points Integration points.
     * @param weights Weights of the corresponding integration nodes.
     * @throws NonMonotonicSequenceException if the {@code points} are not
     * sorted in increasing order.
     * @throws DimensionMismatchException if points and weights don't have the same length
     */
    public GaussIntegrator(double[] points,
                           double[] weights)
        throws NonMonotonicSequenceException, DimensionMismatchException {try{__CLR4_4_124d24dlb90p6pd.R.inc(2749);
        __CLR4_4_124d24dlb90p6pd.R.inc(2750);if ((((points.length != weights.length)&&(__CLR4_4_124d24dlb90p6pd.R.iget(2751)!=0|true))||(__CLR4_4_124d24dlb90p6pd.R.iget(2752)==0&false))) {{
            __CLR4_4_124d24dlb90p6pd.R.inc(2753);throw new DimensionMismatchException(points.length,
                                                 weights.length);
        }

        }__CLR4_4_124d24dlb90p6pd.R.inc(2754);MathArrays.checkOrder(points, MathArrays.OrderDirection.INCREASING, true, true);

        __CLR4_4_124d24dlb90p6pd.R.inc(2755);this.points = points.clone();
        __CLR4_4_124d24dlb90p6pd.R.inc(2756);this.weights = weights.clone();
    }finally{__CLR4_4_124d24dlb90p6pd.R.flushNeeded();}}

    /**
     * Creates an integrator from the given pair of points (first element of
     * the pair) and weights (second element of the pair.
     *
     * @param pointsAndWeights Integration points and corresponding weights.
     * @throws NonMonotonicSequenceException if the {@code points} are not
     * sorted in increasing order.
     *
     * @see #GaussIntegrator(double[], double[])
     */
    public GaussIntegrator(Pair<double[], double[]> pointsAndWeights)
        throws NonMonotonicSequenceException {
        this(pointsAndWeights.getFirst(), pointsAndWeights.getSecond());__CLR4_4_124d24dlb90p6pd.R.inc(2758);try{__CLR4_4_124d24dlb90p6pd.R.inc(2757);
    }finally{__CLR4_4_124d24dlb90p6pd.R.flushNeeded();}}

    /**
     * Returns an estimate of the integral of {@code f(x) * w(x)},
     * where {@code w} is a weight function that depends on the actual
     * flavor of the Gauss integration scheme.
     * The algorithm uses the points and associated weights, as passed
     * to the {@link #GaussIntegrator(double[],double[]) constructor}.
     *
     * @param f Function to integrate.
     * @return the integral of the weighted function.
     */
    public double integrate(UnivariateFunction f) {try{__CLR4_4_124d24dlb90p6pd.R.inc(2759);
        __CLR4_4_124d24dlb90p6pd.R.inc(2760);double s = 0;
        __CLR4_4_124d24dlb90p6pd.R.inc(2761);double c = 0;
        __CLR4_4_124d24dlb90p6pd.R.inc(2762);for (int i = 0; (((i < points.length)&&(__CLR4_4_124d24dlb90p6pd.R.iget(2763)!=0|true))||(__CLR4_4_124d24dlb90p6pd.R.iget(2764)==0&false)); i++) {{
            __CLR4_4_124d24dlb90p6pd.R.inc(2765);final double x = points[i];
            __CLR4_4_124d24dlb90p6pd.R.inc(2766);final double w = weights[i];
            __CLR4_4_124d24dlb90p6pd.R.inc(2767);final double y = w * f.value(x) - c;
            __CLR4_4_124d24dlb90p6pd.R.inc(2768);final double t = s + y;
            __CLR4_4_124d24dlb90p6pd.R.inc(2769);c = (t - s) - y;
            __CLR4_4_124d24dlb90p6pd.R.inc(2770);s = t;
        }
        }__CLR4_4_124d24dlb90p6pd.R.inc(2771);return s;
    }finally{__CLR4_4_124d24dlb90p6pd.R.flushNeeded();}}

    /**
     * @return the order of the integration rule (the number of integration
     * points).
     */
    public int getNumberOfPoints() {try{__CLR4_4_124d24dlb90p6pd.R.inc(2772);
        __CLR4_4_124d24dlb90p6pd.R.inc(2773);return points.length;
    }finally{__CLR4_4_124d24dlb90p6pd.R.flushNeeded();}}

    /**
     * Gets the integration point at the given index.
     * The index must be in the valid range but no check is performed.
     * @param index index of the integration point
     * @return the integration point.
     */
    public double getPoint(int index) {try{__CLR4_4_124d24dlb90p6pd.R.inc(2774);
        __CLR4_4_124d24dlb90p6pd.R.inc(2775);return points[index];
    }finally{__CLR4_4_124d24dlb90p6pd.R.flushNeeded();}}

    /**
     * Gets the weight of the integration point at the given index.
     * The index must be in the valid range but no check is performed.
     * @param index index of the integration point
     * @return the weight.
     */
    public double getWeight(int index) {try{__CLR4_4_124d24dlb90p6pd.R.inc(2776);
        __CLR4_4_124d24dlb90p6pd.R.inc(2777);return weights[index];
    }finally{__CLR4_4_124d24dlb90p6pd.R.flushNeeded();}}
}
