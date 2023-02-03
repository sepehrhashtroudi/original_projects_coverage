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

import org.apache.commons.math3.optim.PointValuePair;
import org.apache.commons.math3.analysis.MultivariateFunction;

/**
 * This class implements the Nelder-Mead simplex algorithm.
 *
 * @version $Id$
 * @since 3.0
 */
public class NelderMeadSimplex extends AbstractSimplex {public static class __CLR4_4_1ufzufzlb90p9td{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,39563,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /** Default value for {@link #rho}: {@value}. */
    private static final double DEFAULT_RHO = 1;
    /** Default value for {@link #khi}: {@value}. */
    private static final double DEFAULT_KHI = 2;
    /** Default value for {@link #gamma}: {@value}. */
    private static final double DEFAULT_GAMMA = 0.5;
    /** Default value for {@link #sigma}: {@value}. */
    private static final double DEFAULT_SIGMA = 0.5;
    /** Reflection coefficient. */
    private final double rho;
    /** Expansion coefficient. */
    private final double khi;
    /** Contraction coefficient. */
    private final double gamma;
    /** Shrinkage coefficient. */
    private final double sigma;

    /**
     * Build a Nelder-Mead simplex with default coefficients.
     * The default coefficients are 1.0 for rho, 2.0 for khi and 0.5
     * for both gamma and sigma.
     *
     * @param n Dimension of the simplex.
     */
    public NelderMeadSimplex(final int n) {
        this(n, 1d);__CLR4_4_1ufzufzlb90p9td.R.inc(39456);try{__CLR4_4_1ufzufzlb90p9td.R.inc(39455);
    }finally{__CLR4_4_1ufzufzlb90p9td.R.flushNeeded();}}

    /**
     * Build a Nelder-Mead simplex with default coefficients.
     * The default coefficients are 1.0 for rho, 2.0 for khi and 0.5
     * for both gamma and sigma.
     *
     * @param n Dimension of the simplex.
     * @param sideLength Length of the sides of the default (hypercube)
     * simplex. See {@link AbstractSimplex#AbstractSimplex(int,double)}.
     */
    public NelderMeadSimplex(final int n, double sideLength) {
        this(n, sideLength,
             DEFAULT_RHO, DEFAULT_KHI, DEFAULT_GAMMA, DEFAULT_SIGMA);__CLR4_4_1ufzufzlb90p9td.R.inc(39458);try{__CLR4_4_1ufzufzlb90p9td.R.inc(39457);
    }finally{__CLR4_4_1ufzufzlb90p9td.R.flushNeeded();}}

    /**
     * Build a Nelder-Mead simplex with specified coefficients.
     *
     * @param n Dimension of the simplex. See
     * {@link AbstractSimplex#AbstractSimplex(int,double)}.
     * @param sideLength Length of the sides of the default (hypercube)
     * simplex. See {@link AbstractSimplex#AbstractSimplex(int,double)}.
     * @param rho Reflection coefficient.
     * @param khi Expansion coefficient.
     * @param gamma Contraction coefficient.
     * @param sigma Shrinkage coefficient.
     */
    public NelderMeadSimplex(final int n, double sideLength,
                             final double rho, final double khi,
                             final double gamma, final double sigma) {
        super(n, sideLength);__CLR4_4_1ufzufzlb90p9td.R.inc(39460);try{__CLR4_4_1ufzufzlb90p9td.R.inc(39459);

        __CLR4_4_1ufzufzlb90p9td.R.inc(39461);this.rho = rho;
        __CLR4_4_1ufzufzlb90p9td.R.inc(39462);this.khi = khi;
        __CLR4_4_1ufzufzlb90p9td.R.inc(39463);this.gamma = gamma;
        __CLR4_4_1ufzufzlb90p9td.R.inc(39464);this.sigma = sigma;
    }finally{__CLR4_4_1ufzufzlb90p9td.R.flushNeeded();}}

    /**
     * Build a Nelder-Mead simplex with specified coefficients.
     *
     * @param n Dimension of the simplex. See
     * {@link AbstractSimplex#AbstractSimplex(int)}.
     * @param rho Reflection coefficient.
     * @param khi Expansion coefficient.
     * @param gamma Contraction coefficient.
     * @param sigma Shrinkage coefficient.
     */
    public NelderMeadSimplex(final int n,
                             final double rho, final double khi,
                             final double gamma, final double sigma) {
        this(n, 1d, rho, khi, gamma, sigma);__CLR4_4_1ufzufzlb90p9td.R.inc(39466);try{__CLR4_4_1ufzufzlb90p9td.R.inc(39465);
    }finally{__CLR4_4_1ufzufzlb90p9td.R.flushNeeded();}}

    /**
     * Build a Nelder-Mead simplex with default coefficients.
     * The default coefficients are 1.0 for rho, 2.0 for khi and 0.5
     * for both gamma and sigma.
     *
     * @param steps Steps along the canonical axes representing box edges.
     * They may be negative but not zero. See
     */
    public NelderMeadSimplex(final double[] steps) {
        this(steps, DEFAULT_RHO, DEFAULT_KHI, DEFAULT_GAMMA, DEFAULT_SIGMA);__CLR4_4_1ufzufzlb90p9td.R.inc(39468);try{__CLR4_4_1ufzufzlb90p9td.R.inc(39467);
    }finally{__CLR4_4_1ufzufzlb90p9td.R.flushNeeded();}}

    /**
     * Build a Nelder-Mead simplex with specified coefficients.
     *
     * @param steps Steps along the canonical axes representing box edges.
     * They may be negative but not zero. See
     * {@link AbstractSimplex#AbstractSimplex(double[])}.
     * @param rho Reflection coefficient.
     * @param khi Expansion coefficient.
     * @param gamma Contraction coefficient.
     * @param sigma Shrinkage coefficient.
     * @throws IllegalArgumentException if one of the steps is zero.
     */
    public NelderMeadSimplex(final double[] steps,
                             final double rho, final double khi,
                             final double gamma, final double sigma) {
        super(steps);__CLR4_4_1ufzufzlb90p9td.R.inc(39470);try{__CLR4_4_1ufzufzlb90p9td.R.inc(39469);

        __CLR4_4_1ufzufzlb90p9td.R.inc(39471);this.rho = rho;
        __CLR4_4_1ufzufzlb90p9td.R.inc(39472);this.khi = khi;
        __CLR4_4_1ufzufzlb90p9td.R.inc(39473);this.gamma = gamma;
        __CLR4_4_1ufzufzlb90p9td.R.inc(39474);this.sigma = sigma;
    }finally{__CLR4_4_1ufzufzlb90p9td.R.flushNeeded();}}

    /**
     * Build a Nelder-Mead simplex with default coefficients.
     * The default coefficients are 1.0 for rho, 2.0 for khi and 0.5
     * for both gamma and sigma.
     *
     * @param referenceSimplex Reference simplex. See
     * {@link AbstractSimplex#AbstractSimplex(double[][])}.
     */
    public NelderMeadSimplex(final double[][] referenceSimplex) {
        this(referenceSimplex, DEFAULT_RHO, DEFAULT_KHI, DEFAULT_GAMMA, DEFAULT_SIGMA);__CLR4_4_1ufzufzlb90p9td.R.inc(39476);try{__CLR4_4_1ufzufzlb90p9td.R.inc(39475);
    }finally{__CLR4_4_1ufzufzlb90p9td.R.flushNeeded();}}

    /**
     * Build a Nelder-Mead simplex with specified coefficients.
     *
     * @param referenceSimplex Reference simplex. See
     * {@link AbstractSimplex#AbstractSimplex(double[][])}.
     * @param rho Reflection coefficient.
     * @param khi Expansion coefficient.
     * @param gamma Contraction coefficient.
     * @param sigma Shrinkage coefficient.
     * @throws org.apache.commons.math3.exception.NotStrictlyPositiveException
     * if the reference simplex does not contain at least one point.
     * @throws org.apache.commons.math3.exception.DimensionMismatchException
     * if there is a dimension mismatch in the reference simplex.
     */
    public NelderMeadSimplex(final double[][] referenceSimplex,
                             final double rho, final double khi,
                             final double gamma, final double sigma) {
        super(referenceSimplex);__CLR4_4_1ufzufzlb90p9td.R.inc(39478);try{__CLR4_4_1ufzufzlb90p9td.R.inc(39477);

        __CLR4_4_1ufzufzlb90p9td.R.inc(39479);this.rho = rho;
        __CLR4_4_1ufzufzlb90p9td.R.inc(39480);this.khi = khi;
        __CLR4_4_1ufzufzlb90p9td.R.inc(39481);this.gamma = gamma;
        __CLR4_4_1ufzufzlb90p9td.R.inc(39482);this.sigma = sigma;
    }finally{__CLR4_4_1ufzufzlb90p9td.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public void iterate(final MultivariateFunction evaluationFunction,
                        final Comparator<PointValuePair> comparator) {try{__CLR4_4_1ufzufzlb90p9td.R.inc(39483);
        // The simplex has n + 1 points if dimension is n.
        __CLR4_4_1ufzufzlb90p9td.R.inc(39484);final int n = getDimension();

        // Interesting values.
        __CLR4_4_1ufzufzlb90p9td.R.inc(39485);final PointValuePair best = getPoint(0);
        __CLR4_4_1ufzufzlb90p9td.R.inc(39486);final PointValuePair secondBest = getPoint(n - 1);
        __CLR4_4_1ufzufzlb90p9td.R.inc(39487);final PointValuePair worst = getPoint(n);
        __CLR4_4_1ufzufzlb90p9td.R.inc(39488);final double[] xWorst = worst.getPointRef();

        // Compute the centroid of the best vertices (dismissing the worst
        // point at index n).
        __CLR4_4_1ufzufzlb90p9td.R.inc(39489);final double[] centroid = new double[n];
        __CLR4_4_1ufzufzlb90p9td.R.inc(39490);for (int i = 0; (((i < n)&&(__CLR4_4_1ufzufzlb90p9td.R.iget(39491)!=0|true))||(__CLR4_4_1ufzufzlb90p9td.R.iget(39492)==0&false)); i++) {{
            __CLR4_4_1ufzufzlb90p9td.R.inc(39493);final double[] x = getPoint(i).getPointRef();
            __CLR4_4_1ufzufzlb90p9td.R.inc(39494);for (int j = 0; (((j < n)&&(__CLR4_4_1ufzufzlb90p9td.R.iget(39495)!=0|true))||(__CLR4_4_1ufzufzlb90p9td.R.iget(39496)==0&false)); j++) {{
                __CLR4_4_1ufzufzlb90p9td.R.inc(39497);centroid[j] += x[j];
            }
        }}
        }__CLR4_4_1ufzufzlb90p9td.R.inc(39498);final double scaling = 1.0 / n;
        __CLR4_4_1ufzufzlb90p9td.R.inc(39499);for (int j = 0; (((j < n)&&(__CLR4_4_1ufzufzlb90p9td.R.iget(39500)!=0|true))||(__CLR4_4_1ufzufzlb90p9td.R.iget(39501)==0&false)); j++) {{
            __CLR4_4_1ufzufzlb90p9td.R.inc(39502);centroid[j] *= scaling;
        }

        // compute the reflection point
        }__CLR4_4_1ufzufzlb90p9td.R.inc(39503);final double[] xR = new double[n];
        __CLR4_4_1ufzufzlb90p9td.R.inc(39504);for (int j = 0; (((j < n)&&(__CLR4_4_1ufzufzlb90p9td.R.iget(39505)!=0|true))||(__CLR4_4_1ufzufzlb90p9td.R.iget(39506)==0&false)); j++) {{
            __CLR4_4_1ufzufzlb90p9td.R.inc(39507);xR[j] = centroid[j] + rho * (centroid[j] - xWorst[j]);
        }
        }__CLR4_4_1ufzufzlb90p9td.R.inc(39508);final PointValuePair reflected
            = new PointValuePair(xR, evaluationFunction.value(xR), false);

        __CLR4_4_1ufzufzlb90p9td.R.inc(39509);if ((((comparator.compare(best, reflected) <= 0 &&
            comparator.compare(reflected, secondBest) < 0)&&(__CLR4_4_1ufzufzlb90p9td.R.iget(39510)!=0|true))||(__CLR4_4_1ufzufzlb90p9td.R.iget(39511)==0&false))) {{
            // Accept the reflected point.
            __CLR4_4_1ufzufzlb90p9td.R.inc(39512);replaceWorstPoint(reflected, comparator);
        } }else {__CLR4_4_1ufzufzlb90p9td.R.inc(39513);if ((((comparator.compare(reflected, best) < 0)&&(__CLR4_4_1ufzufzlb90p9td.R.iget(39514)!=0|true))||(__CLR4_4_1ufzufzlb90p9td.R.iget(39515)==0&false))) {{
            // Compute the expansion point.
            __CLR4_4_1ufzufzlb90p9td.R.inc(39516);final double[] xE = new double[n];
            __CLR4_4_1ufzufzlb90p9td.R.inc(39517);for (int j = 0; (((j < n)&&(__CLR4_4_1ufzufzlb90p9td.R.iget(39518)!=0|true))||(__CLR4_4_1ufzufzlb90p9td.R.iget(39519)==0&false)); j++) {{
                __CLR4_4_1ufzufzlb90p9td.R.inc(39520);xE[j] = centroid[j] + khi * (xR[j] - centroid[j]);
            }
            }__CLR4_4_1ufzufzlb90p9td.R.inc(39521);final PointValuePair expanded
                = new PointValuePair(xE, evaluationFunction.value(xE), false);

            __CLR4_4_1ufzufzlb90p9td.R.inc(39522);if ((((comparator.compare(expanded, reflected) < 0)&&(__CLR4_4_1ufzufzlb90p9td.R.iget(39523)!=0|true))||(__CLR4_4_1ufzufzlb90p9td.R.iget(39524)==0&false))) {{
                // Accept the expansion point.
                __CLR4_4_1ufzufzlb90p9td.R.inc(39525);replaceWorstPoint(expanded, comparator);
            } }else {{
                // Accept the reflected point.
                __CLR4_4_1ufzufzlb90p9td.R.inc(39526);replaceWorstPoint(reflected, comparator);
            }
        }} }else {{
            __CLR4_4_1ufzufzlb90p9td.R.inc(39527);if ((((comparator.compare(reflected, worst) < 0)&&(__CLR4_4_1ufzufzlb90p9td.R.iget(39528)!=0|true))||(__CLR4_4_1ufzufzlb90p9td.R.iget(39529)==0&false))) {{
                // Perform an outside contraction.
                __CLR4_4_1ufzufzlb90p9td.R.inc(39530);final double[] xC = new double[n];
                __CLR4_4_1ufzufzlb90p9td.R.inc(39531);for (int j = 0; (((j < n)&&(__CLR4_4_1ufzufzlb90p9td.R.iget(39532)!=0|true))||(__CLR4_4_1ufzufzlb90p9td.R.iget(39533)==0&false)); j++) {{
                    __CLR4_4_1ufzufzlb90p9td.R.inc(39534);xC[j] = centroid[j] + gamma * (xR[j] - centroid[j]);
                }
                }__CLR4_4_1ufzufzlb90p9td.R.inc(39535);final PointValuePair outContracted
                    = new PointValuePair(xC, evaluationFunction.value(xC), false);
                __CLR4_4_1ufzufzlb90p9td.R.inc(39536);if ((((comparator.compare(outContracted, reflected) <= 0)&&(__CLR4_4_1ufzufzlb90p9td.R.iget(39537)!=0|true))||(__CLR4_4_1ufzufzlb90p9td.R.iget(39538)==0&false))) {{
                    // Accept the contraction point.
                    __CLR4_4_1ufzufzlb90p9td.R.inc(39539);replaceWorstPoint(outContracted, comparator);
                    __CLR4_4_1ufzufzlb90p9td.R.inc(39540);return;
                }
            }} }else {{
                // Perform an inside contraction.
                __CLR4_4_1ufzufzlb90p9td.R.inc(39541);final double[] xC = new double[n];
                __CLR4_4_1ufzufzlb90p9td.R.inc(39542);for (int j = 0; (((j < n)&&(__CLR4_4_1ufzufzlb90p9td.R.iget(39543)!=0|true))||(__CLR4_4_1ufzufzlb90p9td.R.iget(39544)==0&false)); j++) {{
                    __CLR4_4_1ufzufzlb90p9td.R.inc(39545);xC[j] = centroid[j] - gamma * (centroid[j] - xWorst[j]);
                }
                }__CLR4_4_1ufzufzlb90p9td.R.inc(39546);final PointValuePair inContracted
                    = new PointValuePair(xC, evaluationFunction.value(xC), false);

                __CLR4_4_1ufzufzlb90p9td.R.inc(39547);if ((((comparator.compare(inContracted, worst) < 0)&&(__CLR4_4_1ufzufzlb90p9td.R.iget(39548)!=0|true))||(__CLR4_4_1ufzufzlb90p9td.R.iget(39549)==0&false))) {{
                    // Accept the contraction point.
                    __CLR4_4_1ufzufzlb90p9td.R.inc(39550);replaceWorstPoint(inContracted, comparator);
                    __CLR4_4_1ufzufzlb90p9td.R.inc(39551);return;
                }
            }}

            // Perform a shrink.
            }__CLR4_4_1ufzufzlb90p9td.R.inc(39552);final double[] xSmallest = getPoint(0).getPointRef();
            __CLR4_4_1ufzufzlb90p9td.R.inc(39553);for (int i = 1; (((i <= n)&&(__CLR4_4_1ufzufzlb90p9td.R.iget(39554)!=0|true))||(__CLR4_4_1ufzufzlb90p9td.R.iget(39555)==0&false)); i++) {{
                __CLR4_4_1ufzufzlb90p9td.R.inc(39556);final double[] x = getPoint(i).getPoint();
                __CLR4_4_1ufzufzlb90p9td.R.inc(39557);for (int j = 0; (((j < n)&&(__CLR4_4_1ufzufzlb90p9td.R.iget(39558)!=0|true))||(__CLR4_4_1ufzufzlb90p9td.R.iget(39559)==0&false)); j++) {{
                    __CLR4_4_1ufzufzlb90p9td.R.inc(39560);x[j] = xSmallest[j] + sigma * (x[j] - xSmallest[j]);
                }
                }__CLR4_4_1ufzufzlb90p9td.R.inc(39561);setPoint(i, new PointValuePair(x, Double.NaN, false));
            }
            }__CLR4_4_1ufzufzlb90p9td.R.inc(39562);evaluate(evaluationFunction, comparator);
        }
    }}}finally{__CLR4_4_1ufzufzlb90p9td.R.flushNeeded();}}
}
