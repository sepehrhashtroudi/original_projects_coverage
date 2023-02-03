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
package org.apache.commons.math3.optim.nonlinear.scalar.noderiv;

import java.util.Comparator;

import org.apache.commons.math3.analysis.MultivariateFunction;
import org.apache.commons.math3.optim.PointValuePair;

/**
 * This class implements the multi-directional direct search method.
 *
 * @version $Id$
 * @since 3.0
 */
public class MultiDirectionalSimplex extends AbstractSimplex {public static class __CLR4_4_1ueiueilb90p9t8{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,39455,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /** Default value for {@link #khi}: {@value}. */
    private static final double DEFAULT_KHI = 2;
    /** Default value for {@link #gamma}: {@value}. */
    private static final double DEFAULT_GAMMA = 0.5;
    /** Expansion coefficient. */
    private final double khi;
    /** Contraction coefficient. */
    private final double gamma;

    /**
     * Build a multi-directional simplex with default coefficients.
     * The default values are 2.0 for khi and 0.5 for gamma.
     *
     * @param n Dimension of the simplex.
     */
    public MultiDirectionalSimplex(final int n) {
        this(n, 1d);__CLR4_4_1ueiueilb90p9t8.R.inc(39403);try{__CLR4_4_1ueiueilb90p9t8.R.inc(39402);
    }finally{__CLR4_4_1ueiueilb90p9t8.R.flushNeeded();}}

    /**
     * Build a multi-directional simplex with default coefficients.
     * The default values are 2.0 for khi and 0.5 for gamma.
     *
     * @param n Dimension of the simplex.
     * @param sideLength Length of the sides of the default (hypercube)
     * simplex. See {@link AbstractSimplex#AbstractSimplex(int,double)}.
     */
    public MultiDirectionalSimplex(final int n, double sideLength) {
        this(n, sideLength, DEFAULT_KHI, DEFAULT_GAMMA);__CLR4_4_1ueiueilb90p9t8.R.inc(39405);try{__CLR4_4_1ueiueilb90p9t8.R.inc(39404);
    }finally{__CLR4_4_1ueiueilb90p9t8.R.flushNeeded();}}

    /**
     * Build a multi-directional simplex with specified coefficients.
     *
     * @param n Dimension of the simplex. See
     * {@link AbstractSimplex#AbstractSimplex(int,double)}.
     * @param khi Expansion coefficient.
     * @param gamma Contraction coefficient.
     */
    public MultiDirectionalSimplex(final int n,
                                   final double khi, final double gamma) {
        this(n, 1d, khi, gamma);__CLR4_4_1ueiueilb90p9t8.R.inc(39407);try{__CLR4_4_1ueiueilb90p9t8.R.inc(39406);
    }finally{__CLR4_4_1ueiueilb90p9t8.R.flushNeeded();}}

    /**
     * Build a multi-directional simplex with specified coefficients.
     *
     * @param n Dimension of the simplex. See
     * {@link AbstractSimplex#AbstractSimplex(int,double)}.
     * @param sideLength Length of the sides of the default (hypercube)
     * simplex. See {@link AbstractSimplex#AbstractSimplex(int,double)}.
     * @param khi Expansion coefficient.
     * @param gamma Contraction coefficient.
     */
    public MultiDirectionalSimplex(final int n, double sideLength,
                                   final double khi, final double gamma) {
        super(n, sideLength);__CLR4_4_1ueiueilb90p9t8.R.inc(39409);try{__CLR4_4_1ueiueilb90p9t8.R.inc(39408);

        __CLR4_4_1ueiueilb90p9t8.R.inc(39410);this.khi   = khi;
        __CLR4_4_1ueiueilb90p9t8.R.inc(39411);this.gamma = gamma;
    }finally{__CLR4_4_1ueiueilb90p9t8.R.flushNeeded();}}

    /**
     * Build a multi-directional simplex with default coefficients.
     * The default values are 2.0 for khi and 0.5 for gamma.
     *
     * @param steps Steps along the canonical axes representing box edges.
     * They may be negative but not zero. See
     */
    public MultiDirectionalSimplex(final double[] steps) {
        this(steps, DEFAULT_KHI, DEFAULT_GAMMA);__CLR4_4_1ueiueilb90p9t8.R.inc(39413);try{__CLR4_4_1ueiueilb90p9t8.R.inc(39412);
    }finally{__CLR4_4_1ueiueilb90p9t8.R.flushNeeded();}}

    /**
     * Build a multi-directional simplex with specified coefficients.
     *
     * @param steps Steps along the canonical axes representing box edges.
     * They may be negative but not zero. See
     * {@link AbstractSimplex#AbstractSimplex(double[])}.
     * @param khi Expansion coefficient.
     * @param gamma Contraction coefficient.
     */
    public MultiDirectionalSimplex(final double[] steps,
                                   final double khi, final double gamma) {
        super(steps);__CLR4_4_1ueiueilb90p9t8.R.inc(39415);try{__CLR4_4_1ueiueilb90p9t8.R.inc(39414);

        __CLR4_4_1ueiueilb90p9t8.R.inc(39416);this.khi   = khi;
        __CLR4_4_1ueiueilb90p9t8.R.inc(39417);this.gamma = gamma;
    }finally{__CLR4_4_1ueiueilb90p9t8.R.flushNeeded();}}

    /**
     * Build a multi-directional simplex with default coefficients.
     * The default values are 2.0 for khi and 0.5 for gamma.
     *
     * @param referenceSimplex Reference simplex. See
     * {@link AbstractSimplex#AbstractSimplex(double[][])}.
     */
    public MultiDirectionalSimplex(final double[][] referenceSimplex) {
        this(referenceSimplex, DEFAULT_KHI, DEFAULT_GAMMA);__CLR4_4_1ueiueilb90p9t8.R.inc(39419);try{__CLR4_4_1ueiueilb90p9t8.R.inc(39418);
    }finally{__CLR4_4_1ueiueilb90p9t8.R.flushNeeded();}}

    /**
     * Build a multi-directional simplex with specified coefficients.
     *
     * @param referenceSimplex Reference simplex. See
     * {@link AbstractSimplex#AbstractSimplex(double[][])}.
     * @param khi Expansion coefficient.
     * @param gamma Contraction coefficient.
     * @throws org.apache.commons.math3.exception.NotStrictlyPositiveException
     * if the reference simplex does not contain at least one point.
     * @throws org.apache.commons.math3.exception.DimensionMismatchException
     * if there is a dimension mismatch in the reference simplex.
     */
    public MultiDirectionalSimplex(final double[][] referenceSimplex,
                                   final double khi, final double gamma) {
        super(referenceSimplex);__CLR4_4_1ueiueilb90p9t8.R.inc(39421);try{__CLR4_4_1ueiueilb90p9t8.R.inc(39420);

        __CLR4_4_1ueiueilb90p9t8.R.inc(39422);this.khi   = khi;
        __CLR4_4_1ueiueilb90p9t8.R.inc(39423);this.gamma = gamma;
    }finally{__CLR4_4_1ueiueilb90p9t8.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public void iterate(final MultivariateFunction evaluationFunction,
                        final Comparator<PointValuePair> comparator) {try{__CLR4_4_1ueiueilb90p9t8.R.inc(39424);
        // Save the original simplex.
        __CLR4_4_1ueiueilb90p9t8.R.inc(39425);final PointValuePair[] original = getPoints();
        __CLR4_4_1ueiueilb90p9t8.R.inc(39426);final PointValuePair best = original[0];

        // Perform a reflection step.
        __CLR4_4_1ueiueilb90p9t8.R.inc(39427);final PointValuePair reflected = evaluateNewSimplex(evaluationFunction,
                                                                original, 1, comparator);
        __CLR4_4_1ueiueilb90p9t8.R.inc(39428);if ((((comparator.compare(reflected, best) < 0)&&(__CLR4_4_1ueiueilb90p9t8.R.iget(39429)!=0|true))||(__CLR4_4_1ueiueilb90p9t8.R.iget(39430)==0&false))) {{
            // Compute the expanded simplex.
            __CLR4_4_1ueiueilb90p9t8.R.inc(39431);final PointValuePair[] reflectedSimplex = getPoints();
            __CLR4_4_1ueiueilb90p9t8.R.inc(39432);final PointValuePair expanded = evaluateNewSimplex(evaluationFunction,
                                                                   original, khi, comparator);
            __CLR4_4_1ueiueilb90p9t8.R.inc(39433);if ((((comparator.compare(reflected, expanded) <= 0)&&(__CLR4_4_1ueiueilb90p9t8.R.iget(39434)!=0|true))||(__CLR4_4_1ueiueilb90p9t8.R.iget(39435)==0&false))) {{
                // Keep the reflected simplex.
                __CLR4_4_1ueiueilb90p9t8.R.inc(39436);setPoints(reflectedSimplex);
            }
            // Keep the expanded simplex.
            }__CLR4_4_1ueiueilb90p9t8.R.inc(39437);return;
        }

        // Compute the contracted simplex.
        }__CLR4_4_1ueiueilb90p9t8.R.inc(39438);evaluateNewSimplex(evaluationFunction, original, gamma, comparator);

    }finally{__CLR4_4_1ueiueilb90p9t8.R.flushNeeded();}}

    /**
     * Compute and evaluate a new simplex.
     *
     * @param evaluationFunction Evaluation function.
     * @param original Original simplex (to be preserved).
     * @param coeff Linear coefficient.
     * @param comparator Comparator to use to sort simplex vertices from best
     * to poorest.
     * @return the best point in the transformed simplex.
     * @throws org.apache.commons.math3.exception.TooManyEvaluationsException
     * if the maximal number of evaluations is exceeded.
     */
    private PointValuePair evaluateNewSimplex(final MultivariateFunction evaluationFunction,
                                                  final PointValuePair[] original,
                                                  final double coeff,
                                                  final Comparator<PointValuePair> comparator) {try{__CLR4_4_1ueiueilb90p9t8.R.inc(39439);
        __CLR4_4_1ueiueilb90p9t8.R.inc(39440);final double[] xSmallest = original[0].getPointRef();
        // Perform a linear transformation on all the simplex points,
        // except the first one.
        __CLR4_4_1ueiueilb90p9t8.R.inc(39441);setPoint(0, original[0]);
        __CLR4_4_1ueiueilb90p9t8.R.inc(39442);final int dim = getDimension();
        __CLR4_4_1ueiueilb90p9t8.R.inc(39443);for (int i = 1; (((i < getSize())&&(__CLR4_4_1ueiueilb90p9t8.R.iget(39444)!=0|true))||(__CLR4_4_1ueiueilb90p9t8.R.iget(39445)==0&false)); i++) {{
            __CLR4_4_1ueiueilb90p9t8.R.inc(39446);final double[] xOriginal = original[i].getPointRef();
            __CLR4_4_1ueiueilb90p9t8.R.inc(39447);final double[] xTransformed = new double[dim];
            __CLR4_4_1ueiueilb90p9t8.R.inc(39448);for (int j = 0; (((j < dim)&&(__CLR4_4_1ueiueilb90p9t8.R.iget(39449)!=0|true))||(__CLR4_4_1ueiueilb90p9t8.R.iget(39450)==0&false)); j++) {{
                __CLR4_4_1ueiueilb90p9t8.R.inc(39451);xTransformed[j] = xSmallest[j] + coeff * (xSmallest[j] - xOriginal[j]);
            }
            }__CLR4_4_1ueiueilb90p9t8.R.inc(39452);setPoint(i, new PointValuePair(xTransformed, Double.NaN, false));
        }

        // Evaluate the simplex.
        }__CLR4_4_1ueiueilb90p9t8.R.inc(39453);evaluate(evaluationFunction, comparator);

        __CLR4_4_1ueiueilb90p9t8.R.inc(39454);return getPoint(0);
    }finally{__CLR4_4_1ueiueilb90p9t8.R.flushNeeded();}}
}
