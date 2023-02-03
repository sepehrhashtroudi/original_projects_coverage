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

package org.apache.commons.math3.optimization.direct;

import java.util.Comparator;

import org.apache.commons.math3.optimization.PointValuePair;
import org.apache.commons.math3.analysis.MultivariateFunction;

/**
 * This class implements the Nelder-Mead simplex algorithm.
 *
 * @version $Id$
 * @deprecated As of 3.1 (to be removed in 4.0).
 * @since 3.0
 */
@Deprecated
public class NelderMeadSimplex extends AbstractSimplex {public static class __CLR4_4_1y9sy9slb90pa2m{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,44524,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
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
        this(n, 1d);__CLR4_4_1y9sy9slb90pa2m.R.inc(44417);try{__CLR4_4_1y9sy9slb90pa2m.R.inc(44416);
    }finally{__CLR4_4_1y9sy9slb90pa2m.R.flushNeeded();}}

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
             DEFAULT_RHO, DEFAULT_KHI, DEFAULT_GAMMA, DEFAULT_SIGMA);__CLR4_4_1y9sy9slb90pa2m.R.inc(44419);try{__CLR4_4_1y9sy9slb90pa2m.R.inc(44418);
    }finally{__CLR4_4_1y9sy9slb90pa2m.R.flushNeeded();}}

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
        super(n, sideLength);__CLR4_4_1y9sy9slb90pa2m.R.inc(44421);try{__CLR4_4_1y9sy9slb90pa2m.R.inc(44420);

        __CLR4_4_1y9sy9slb90pa2m.R.inc(44422);this.rho = rho;
        __CLR4_4_1y9sy9slb90pa2m.R.inc(44423);this.khi = khi;
        __CLR4_4_1y9sy9slb90pa2m.R.inc(44424);this.gamma = gamma;
        __CLR4_4_1y9sy9slb90pa2m.R.inc(44425);this.sigma = sigma;
    }finally{__CLR4_4_1y9sy9slb90pa2m.R.flushNeeded();}}

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
        this(n, 1d, rho, khi, gamma, sigma);__CLR4_4_1y9sy9slb90pa2m.R.inc(44427);try{__CLR4_4_1y9sy9slb90pa2m.R.inc(44426);
    }finally{__CLR4_4_1y9sy9slb90pa2m.R.flushNeeded();}}

    /**
     * Build a Nelder-Mead simplex with default coefficients.
     * The default coefficients are 1.0 for rho, 2.0 for khi and 0.5
     * for both gamma and sigma.
     *
     * @param steps Steps along the canonical axes representing box edges.
     * They may be negative but not zero. See
     */
    public NelderMeadSimplex(final double[] steps) {
        this(steps, DEFAULT_RHO, DEFAULT_KHI, DEFAULT_GAMMA, DEFAULT_SIGMA);__CLR4_4_1y9sy9slb90pa2m.R.inc(44429);try{__CLR4_4_1y9sy9slb90pa2m.R.inc(44428);
    }finally{__CLR4_4_1y9sy9slb90pa2m.R.flushNeeded();}}

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
        super(steps);__CLR4_4_1y9sy9slb90pa2m.R.inc(44431);try{__CLR4_4_1y9sy9slb90pa2m.R.inc(44430);

        __CLR4_4_1y9sy9slb90pa2m.R.inc(44432);this.rho = rho;
        __CLR4_4_1y9sy9slb90pa2m.R.inc(44433);this.khi = khi;
        __CLR4_4_1y9sy9slb90pa2m.R.inc(44434);this.gamma = gamma;
        __CLR4_4_1y9sy9slb90pa2m.R.inc(44435);this.sigma = sigma;
    }finally{__CLR4_4_1y9sy9slb90pa2m.R.flushNeeded();}}

    /**
     * Build a Nelder-Mead simplex with default coefficients.
     * The default coefficients are 1.0 for rho, 2.0 for khi and 0.5
     * for both gamma and sigma.
     *
     * @param referenceSimplex Reference simplex. See
     * {@link AbstractSimplex#AbstractSimplex(double[][])}.
     */
    public NelderMeadSimplex(final double[][] referenceSimplex) {
        this(referenceSimplex, DEFAULT_RHO, DEFAULT_KHI, DEFAULT_GAMMA, DEFAULT_SIGMA);__CLR4_4_1y9sy9slb90pa2m.R.inc(44437);try{__CLR4_4_1y9sy9slb90pa2m.R.inc(44436);
    }finally{__CLR4_4_1y9sy9slb90pa2m.R.flushNeeded();}}

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
        super(referenceSimplex);__CLR4_4_1y9sy9slb90pa2m.R.inc(44439);try{__CLR4_4_1y9sy9slb90pa2m.R.inc(44438);

        __CLR4_4_1y9sy9slb90pa2m.R.inc(44440);this.rho = rho;
        __CLR4_4_1y9sy9slb90pa2m.R.inc(44441);this.khi = khi;
        __CLR4_4_1y9sy9slb90pa2m.R.inc(44442);this.gamma = gamma;
        __CLR4_4_1y9sy9slb90pa2m.R.inc(44443);this.sigma = sigma;
    }finally{__CLR4_4_1y9sy9slb90pa2m.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public void iterate(final MultivariateFunction evaluationFunction,
                        final Comparator<PointValuePair> comparator) {try{__CLR4_4_1y9sy9slb90pa2m.R.inc(44444);
        // The simplex has n + 1 points if dimension is n.
        __CLR4_4_1y9sy9slb90pa2m.R.inc(44445);final int n = getDimension();

        // Interesting values.
        __CLR4_4_1y9sy9slb90pa2m.R.inc(44446);final PointValuePair best = getPoint(0);
        __CLR4_4_1y9sy9slb90pa2m.R.inc(44447);final PointValuePair secondBest = getPoint(n - 1);
        __CLR4_4_1y9sy9slb90pa2m.R.inc(44448);final PointValuePair worst = getPoint(n);
        __CLR4_4_1y9sy9slb90pa2m.R.inc(44449);final double[] xWorst = worst.getPointRef();

        // Compute the centroid of the best vertices (dismissing the worst
        // point at index n).
        __CLR4_4_1y9sy9slb90pa2m.R.inc(44450);final double[] centroid = new double[n];
        __CLR4_4_1y9sy9slb90pa2m.R.inc(44451);for (int i = 0; (((i < n)&&(__CLR4_4_1y9sy9slb90pa2m.R.iget(44452)!=0|true))||(__CLR4_4_1y9sy9slb90pa2m.R.iget(44453)==0&false)); i++) {{
            __CLR4_4_1y9sy9slb90pa2m.R.inc(44454);final double[] x = getPoint(i).getPointRef();
            __CLR4_4_1y9sy9slb90pa2m.R.inc(44455);for (int j = 0; (((j < n)&&(__CLR4_4_1y9sy9slb90pa2m.R.iget(44456)!=0|true))||(__CLR4_4_1y9sy9slb90pa2m.R.iget(44457)==0&false)); j++) {{
                __CLR4_4_1y9sy9slb90pa2m.R.inc(44458);centroid[j] += x[j];
            }
        }}
        }__CLR4_4_1y9sy9slb90pa2m.R.inc(44459);final double scaling = 1.0 / n;
        __CLR4_4_1y9sy9slb90pa2m.R.inc(44460);for (int j = 0; (((j < n)&&(__CLR4_4_1y9sy9slb90pa2m.R.iget(44461)!=0|true))||(__CLR4_4_1y9sy9slb90pa2m.R.iget(44462)==0&false)); j++) {{
            __CLR4_4_1y9sy9slb90pa2m.R.inc(44463);centroid[j] *= scaling;
        }

        // compute the reflection point
        }__CLR4_4_1y9sy9slb90pa2m.R.inc(44464);final double[] xR = new double[n];
        __CLR4_4_1y9sy9slb90pa2m.R.inc(44465);for (int j = 0; (((j < n)&&(__CLR4_4_1y9sy9slb90pa2m.R.iget(44466)!=0|true))||(__CLR4_4_1y9sy9slb90pa2m.R.iget(44467)==0&false)); j++) {{
            __CLR4_4_1y9sy9slb90pa2m.R.inc(44468);xR[j] = centroid[j] + rho * (centroid[j] - xWorst[j]);
        }
        }__CLR4_4_1y9sy9slb90pa2m.R.inc(44469);final PointValuePair reflected
            = new PointValuePair(xR, evaluationFunction.value(xR), false);

        __CLR4_4_1y9sy9slb90pa2m.R.inc(44470);if ((((comparator.compare(best, reflected) <= 0 &&
            comparator.compare(reflected, secondBest) < 0)&&(__CLR4_4_1y9sy9slb90pa2m.R.iget(44471)!=0|true))||(__CLR4_4_1y9sy9slb90pa2m.R.iget(44472)==0&false))) {{
            // Accept the reflected point.
            __CLR4_4_1y9sy9slb90pa2m.R.inc(44473);replaceWorstPoint(reflected, comparator);
        } }else {__CLR4_4_1y9sy9slb90pa2m.R.inc(44474);if ((((comparator.compare(reflected, best) < 0)&&(__CLR4_4_1y9sy9slb90pa2m.R.iget(44475)!=0|true))||(__CLR4_4_1y9sy9slb90pa2m.R.iget(44476)==0&false))) {{
            // Compute the expansion point.
            __CLR4_4_1y9sy9slb90pa2m.R.inc(44477);final double[] xE = new double[n];
            __CLR4_4_1y9sy9slb90pa2m.R.inc(44478);for (int j = 0; (((j < n)&&(__CLR4_4_1y9sy9slb90pa2m.R.iget(44479)!=0|true))||(__CLR4_4_1y9sy9slb90pa2m.R.iget(44480)==0&false)); j++) {{
                __CLR4_4_1y9sy9slb90pa2m.R.inc(44481);xE[j] = centroid[j] + khi * (xR[j] - centroid[j]);
            }
            }__CLR4_4_1y9sy9slb90pa2m.R.inc(44482);final PointValuePair expanded
                = new PointValuePair(xE, evaluationFunction.value(xE), false);

            __CLR4_4_1y9sy9slb90pa2m.R.inc(44483);if ((((comparator.compare(expanded, reflected) < 0)&&(__CLR4_4_1y9sy9slb90pa2m.R.iget(44484)!=0|true))||(__CLR4_4_1y9sy9slb90pa2m.R.iget(44485)==0&false))) {{
                // Accept the expansion point.
                __CLR4_4_1y9sy9slb90pa2m.R.inc(44486);replaceWorstPoint(expanded, comparator);
            } }else {{
                // Accept the reflected point.
                __CLR4_4_1y9sy9slb90pa2m.R.inc(44487);replaceWorstPoint(reflected, comparator);
            }
        }} }else {{
            __CLR4_4_1y9sy9slb90pa2m.R.inc(44488);if ((((comparator.compare(reflected, worst) < 0)&&(__CLR4_4_1y9sy9slb90pa2m.R.iget(44489)!=0|true))||(__CLR4_4_1y9sy9slb90pa2m.R.iget(44490)==0&false))) {{
                // Perform an outside contraction.
                __CLR4_4_1y9sy9slb90pa2m.R.inc(44491);final double[] xC = new double[n];
                __CLR4_4_1y9sy9slb90pa2m.R.inc(44492);for (int j = 0; (((j < n)&&(__CLR4_4_1y9sy9slb90pa2m.R.iget(44493)!=0|true))||(__CLR4_4_1y9sy9slb90pa2m.R.iget(44494)==0&false)); j++) {{
                    __CLR4_4_1y9sy9slb90pa2m.R.inc(44495);xC[j] = centroid[j] + gamma * (xR[j] - centroid[j]);
                }
                }__CLR4_4_1y9sy9slb90pa2m.R.inc(44496);final PointValuePair outContracted
                    = new PointValuePair(xC, evaluationFunction.value(xC), false);
                __CLR4_4_1y9sy9slb90pa2m.R.inc(44497);if ((((comparator.compare(outContracted, reflected) <= 0)&&(__CLR4_4_1y9sy9slb90pa2m.R.iget(44498)!=0|true))||(__CLR4_4_1y9sy9slb90pa2m.R.iget(44499)==0&false))) {{
                    // Accept the contraction point.
                    __CLR4_4_1y9sy9slb90pa2m.R.inc(44500);replaceWorstPoint(outContracted, comparator);
                    __CLR4_4_1y9sy9slb90pa2m.R.inc(44501);return;
                }
            }} }else {{
                // Perform an inside contraction.
                __CLR4_4_1y9sy9slb90pa2m.R.inc(44502);final double[] xC = new double[n];
                __CLR4_4_1y9sy9slb90pa2m.R.inc(44503);for (int j = 0; (((j < n)&&(__CLR4_4_1y9sy9slb90pa2m.R.iget(44504)!=0|true))||(__CLR4_4_1y9sy9slb90pa2m.R.iget(44505)==0&false)); j++) {{
                    __CLR4_4_1y9sy9slb90pa2m.R.inc(44506);xC[j] = centroid[j] - gamma * (centroid[j] - xWorst[j]);
                }
                }__CLR4_4_1y9sy9slb90pa2m.R.inc(44507);final PointValuePair inContracted
                    = new PointValuePair(xC, evaluationFunction.value(xC), false);

                __CLR4_4_1y9sy9slb90pa2m.R.inc(44508);if ((((comparator.compare(inContracted, worst) < 0)&&(__CLR4_4_1y9sy9slb90pa2m.R.iget(44509)!=0|true))||(__CLR4_4_1y9sy9slb90pa2m.R.iget(44510)==0&false))) {{
                    // Accept the contraction point.
                    __CLR4_4_1y9sy9slb90pa2m.R.inc(44511);replaceWorstPoint(inContracted, comparator);
                    __CLR4_4_1y9sy9slb90pa2m.R.inc(44512);return;
                }
            }}

            // Perform a shrink.
            }__CLR4_4_1y9sy9slb90pa2m.R.inc(44513);final double[] xSmallest = getPoint(0).getPointRef();
            __CLR4_4_1y9sy9slb90pa2m.R.inc(44514);for (int i = 1; (((i <= n)&&(__CLR4_4_1y9sy9slb90pa2m.R.iget(44515)!=0|true))||(__CLR4_4_1y9sy9slb90pa2m.R.iget(44516)==0&false)); i++) {{
                __CLR4_4_1y9sy9slb90pa2m.R.inc(44517);final double[] x = getPoint(i).getPoint();
                __CLR4_4_1y9sy9slb90pa2m.R.inc(44518);for (int j = 0; (((j < n)&&(__CLR4_4_1y9sy9slb90pa2m.R.iget(44519)!=0|true))||(__CLR4_4_1y9sy9slb90pa2m.R.iget(44520)==0&false)); j++) {{
                    __CLR4_4_1y9sy9slb90pa2m.R.inc(44521);x[j] = xSmallest[j] + sigma * (x[j] - xSmallest[j]);
                }
                }__CLR4_4_1y9sy9slb90pa2m.R.inc(44522);setPoint(i, new PointValuePair(x, Double.NaN, false));
            }
            }__CLR4_4_1y9sy9slb90pa2m.R.inc(44523);evaluate(evaluationFunction, comparator);
        }
    }}}finally{__CLR4_4_1y9sy9slb90pa2m.R.flushNeeded();}}
}
