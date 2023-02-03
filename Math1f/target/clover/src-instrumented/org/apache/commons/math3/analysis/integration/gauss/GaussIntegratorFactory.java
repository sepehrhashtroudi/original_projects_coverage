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

import java.math.BigDecimal;

import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.exception.NotStrictlyPositiveException;
import org.apache.commons.math3.util.Pair;

/**
 * Class that provides different ways to compute the nodes and weights to be
 * used by the {@link GaussIntegrator Gaussian integration rule}.
 *
 * @since 3.1
 * @version $Id$
 */
public class GaussIntegratorFactory {public static class __CLR4_4_1256256lb90p6pn{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,2801,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /** Generator of Gauss-Legendre integrators. */
    private final BaseRuleFactory<Double> legendre = new LegendreRuleFactory();
    /** Generator of Gauss-Legendre integrators. */
    private final BaseRuleFactory<BigDecimal> legendreHighPrecision = new LegendreHighPrecisionRuleFactory();
    /** Generator of Gauss-Hermite integrators. */
    private final BaseRuleFactory<Double> hermite = new HermiteRuleFactory();

    /**
     * Creates a Gauss-Legendre integrator of the given order.
     * The call to the
     * {@link GaussIntegrator#integrate(org.apache.commons.math3.analysis.UnivariateFunction)
     * integrate} method will perform an integration on the natural interval
     * {@code [-1 , 1]}.
     *
     * @param numberOfPoints Order of the integration rule.
     * @return a Gauss-Legendre integrator.
     */
    public GaussIntegrator legendre(int numberOfPoints) {try{__CLR4_4_1256256lb90p6pn.R.inc(2778);
        __CLR4_4_1256256lb90p6pn.R.inc(2779);return new GaussIntegrator(getRule(legendre, numberOfPoints));
    }finally{__CLR4_4_1256256lb90p6pn.R.flushNeeded();}}

    /**
     * Creates a Gauss-Legendre integrator of the given order.
     * The call to the
     * {@link GaussIntegrator#integrate(org.apache.commons.math3.analysis.UnivariateFunction)
     * integrate} method will perform an integration on the given interval.
     *
     * @param numberOfPoints Order of the integration rule.
     * @param lowerBound Lower bound of the integration interval.
     * @param upperBound Upper bound of the integration interval.
     * @return a Gauss-Legendre integrator.
     * @throws NotStrictlyPositiveException if number of points is not positive
     */
    public GaussIntegrator legendre(int numberOfPoints,
                                    double lowerBound,
                                    double upperBound)
        throws NotStrictlyPositiveException {try{__CLR4_4_1256256lb90p6pn.R.inc(2780);
        __CLR4_4_1256256lb90p6pn.R.inc(2781);return new GaussIntegrator(transform(getRule(legendre, numberOfPoints),
                                             lowerBound, upperBound));
    }finally{__CLR4_4_1256256lb90p6pn.R.flushNeeded();}}

    /**
     * Creates a Gauss-Legendre integrator of the given order.
     * The call to the
     * {@link GaussIntegrator#integrate(org.apache.commons.math3.analysis.UnivariateFunction)
     * integrate} method will perform an integration on the natural interval
     * {@code [-1 , 1]}.
     *
     * @param numberOfPoints Order of the integration rule.
     * @return a Gauss-Legendre integrator.
     * @throws NotStrictlyPositiveException if number of points is not positive
     */
    public GaussIntegrator legendreHighPrecision(int numberOfPoints)
        throws NotStrictlyPositiveException {try{__CLR4_4_1256256lb90p6pn.R.inc(2782);
        __CLR4_4_1256256lb90p6pn.R.inc(2783);return new GaussIntegrator(getRule(legendreHighPrecision, numberOfPoints));
    }finally{__CLR4_4_1256256lb90p6pn.R.flushNeeded();}}

    /**
     * Creates an integrator of the given order, and whose call to the
     * {@link GaussIntegrator#integrate(org.apache.commons.math3.analysis.UnivariateFunction)
     * integrate} method will perform an integration on the given interval.
     *
     * @param numberOfPoints Order of the integration rule.
     * @param lowerBound Lower bound of the integration interval.
     * @param upperBound Upper bound of the integration interval.
     * @return a Gauss-Legendre integrator.
     * @throws NotStrictlyPositiveException if number of points is not positive
     */
    public GaussIntegrator legendreHighPrecision(int numberOfPoints,
                                                 double lowerBound,
                                                 double upperBound)
        throws NotStrictlyPositiveException {try{__CLR4_4_1256256lb90p6pn.R.inc(2784);
        __CLR4_4_1256256lb90p6pn.R.inc(2785);return new GaussIntegrator(transform(getRule(legendreHighPrecision, numberOfPoints),
                                             lowerBound, upperBound));
    }finally{__CLR4_4_1256256lb90p6pn.R.flushNeeded();}}

    /**
     * Creates a Gauss-Hermite integrator of the given order.
     * The call to the
     * {@link SymmetricGaussIntegrator#integrate(org.apache.commons.math3.analysis.UnivariateFunction)
     * integrate} method will perform a weighted integration on the interval
     * {@code [-&inf;, +&inf;]}: the computed value is the improper integral of
     * <code>
     *  e<sup>-x<sup>2</sup></sup> f(x)
     * </code>
     * where {@code f(x)} is the function passed to the
     * {@link SymmetricGaussIntegrator#integrate(org.apache.commons.math3.analysis.UnivariateFunction)
     * integrate} method.
     *
     * @param numberOfPoints Order of the integration rule.
     * @return a Gauss-Hermite integrator.
     */
    public SymmetricGaussIntegrator hermite(int numberOfPoints) {try{__CLR4_4_1256256lb90p6pn.R.inc(2786);
        __CLR4_4_1256256lb90p6pn.R.inc(2787);return new SymmetricGaussIntegrator(getRule(hermite, numberOfPoints));
    }finally{__CLR4_4_1256256lb90p6pn.R.flushNeeded();}}

    /**
     * @param factory Integration rule factory.
     * @param numberOfPoints Order of the integration rule.
     * @return the integration nodes and weights.
     * @throws NotStrictlyPositiveException if number of points is not positive
     * @throws DimensionMismatchException if the elements of the rule pair do not
     * have the same length.
     */
    private static Pair<double[], double[]> getRule(BaseRuleFactory<? extends Number> factory,
                                                    int numberOfPoints)
        throws NotStrictlyPositiveException, DimensionMismatchException {try{__CLR4_4_1256256lb90p6pn.R.inc(2788);
        __CLR4_4_1256256lb90p6pn.R.inc(2789);return factory.getRule(numberOfPoints);
    }finally{__CLR4_4_1256256lb90p6pn.R.flushNeeded();}}

    /**
     * Performs a change of variable so that the integration can be performed
     * on an arbitrary interval {@code [a, b]}.
     * It is assumed that the natural interval is {@code [-1, 1]}.
     *
     * @param rule Original points and weights.
     * @param a Lower bound of the integration interval.
     * @param b Lower bound of the integration interval.
     * @return the points and weights adapted to the new interval.
     */
    private static Pair<double[], double[]> transform(Pair<double[], double[]> rule,
                                                      double a,
                                                      double b) {try{__CLR4_4_1256256lb90p6pn.R.inc(2790);
        __CLR4_4_1256256lb90p6pn.R.inc(2791);final double[] points = rule.getFirst();
        __CLR4_4_1256256lb90p6pn.R.inc(2792);final double[] weights = rule.getSecond();

        // Scaling
        __CLR4_4_1256256lb90p6pn.R.inc(2793);final double scale = (b - a) / 2;
        __CLR4_4_1256256lb90p6pn.R.inc(2794);final double shift = a + scale;

        __CLR4_4_1256256lb90p6pn.R.inc(2795);for (int i = 0; (((i < points.length)&&(__CLR4_4_1256256lb90p6pn.R.iget(2796)!=0|true))||(__CLR4_4_1256256lb90p6pn.R.iget(2797)==0&false)); i++) {{
            __CLR4_4_1256256lb90p6pn.R.inc(2798);points[i] = points[i] * scale + shift;
            __CLR4_4_1256256lb90p6pn.R.inc(2799);weights[i] *= scale;
        }

        }__CLR4_4_1256256lb90p6pn.R.inc(2800);return new Pair<double[], double[]>(points, weights);
    }finally{__CLR4_4_1256256lb90p6pn.R.flushNeeded();}}
}
