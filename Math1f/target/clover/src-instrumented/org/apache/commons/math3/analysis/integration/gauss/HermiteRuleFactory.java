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

import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.util.Pair;
import org.apache.commons.math3.util.FastMath;

/**
 * Factory that creates a
 * <a href="http://en.wikipedia.org/wiki/Gauss-Hermite_quadrature">
 *  Gauss-type quadrature rule using Hermite polynomials</a>
 * of the first kind.
 * Such a quadrature rule allows the calculation of improper integrals
 * of a function
 * <code>
 *  f(x) e<sup>-x<sup>2</sup></sup>
 * </code>
 * <br/>
 * Recurrence relation and weights computation follow
 * <a href="http://en.wikipedia.org/wiki/Abramowitz_and_Stegun"
 * Abramowitz and Stegun, 1964</a>.
 * <br/>
 * The coefficients of the standard Hermite polynomials grow very rapidly;
 * in order to avoid overflows, each Hermite polynomial is normalized with
 * respect to the underlying scalar product.
 * The initial interval for the application of the bisection method is
 * based on the roots of the previous Hermite polynomial (interlacing).
 * Upper and lower bounds of these roots are provided by
 * <quote>
 *  I. Krasikov,
 *  <em>Nonnegative quadratic forms and bounds on orthogonal polynomials</em>,
 *  Journal of Approximation theory <b>111</b>, 31-49
 * </quote>
 *
 * @since 3.3
 * @version $Id$
 */
public class HermiteRuleFactory extends BaseRuleFactory<Double> {public static class __CLR4_4_125t25tlb90p6py{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,2891,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /** &pi;<sup>1/2</sup> */
    private static final double SQRT_PI = 1.77245385090551602729;
    /** &pi;<sup>-1/4</sup> */
    private static final double H0 = 7.5112554446494248286e-1;
    /** &pi;<sup>-1/4</sup> &radic;2 */
    private static final double H1 = 1.0622519320271969145;

    /** {@inheritDoc} */
    @Override
    protected Pair<Double[], Double[]> computeRule(int numberOfPoints)
        throws DimensionMismatchException {try{__CLR4_4_125t25tlb90p6py.R.inc(2801);

        __CLR4_4_125t25tlb90p6py.R.inc(2802);if ((((numberOfPoints == 1)&&(__CLR4_4_125t25tlb90p6py.R.iget(2803)!=0|true))||(__CLR4_4_125t25tlb90p6py.R.iget(2804)==0&false))) {{
            // Break recursion.
            __CLR4_4_125t25tlb90p6py.R.inc(2805);return new Pair<Double[], Double[]>(new Double[] { 0d },
                                                new Double[] { SQRT_PI });
        }

        // Get previous rule.
        // If it has not been computed yet it will trigger a recursive call
        // to this method.
        }__CLR4_4_125t25tlb90p6py.R.inc(2806);final int lastNumPoints = numberOfPoints - 1;
        __CLR4_4_125t25tlb90p6py.R.inc(2807);final Double[] previousPoints = getRuleInternal(lastNumPoints).getFirst();

        // Compute next rule.
        __CLR4_4_125t25tlb90p6py.R.inc(2808);final Double[] points = new Double[numberOfPoints];
        __CLR4_4_125t25tlb90p6py.R.inc(2809);final Double[] weights = new Double[numberOfPoints];

        __CLR4_4_125t25tlb90p6py.R.inc(2810);final double sqrtTwoTimesLastNumPoints = FastMath.sqrt(2 * lastNumPoints);
        __CLR4_4_125t25tlb90p6py.R.inc(2811);final double sqrtTwoTimesNumPoints = FastMath.sqrt(2 * numberOfPoints);

        // Find i-th root of H[n+1] by bracketing.
        __CLR4_4_125t25tlb90p6py.R.inc(2812);final int iMax = numberOfPoints / 2;
        __CLR4_4_125t25tlb90p6py.R.inc(2813);for (int i = 0; (((i < iMax)&&(__CLR4_4_125t25tlb90p6py.R.iget(2814)!=0|true))||(__CLR4_4_125t25tlb90p6py.R.iget(2815)==0&false)); i++) {{
            // Lower-bound of the interval.
            __CLR4_4_125t25tlb90p6py.R.inc(2816);double a = ((((i == 0) )&&(__CLR4_4_125t25tlb90p6py.R.iget(2817)!=0|true))||(__CLR4_4_125t25tlb90p6py.R.iget(2818)==0&false))? -sqrtTwoTimesLastNumPoints : previousPoints[i - 1].doubleValue();
            // Upper-bound of the interval.
            __CLR4_4_125t25tlb90p6py.R.inc(2819);double b = ((((iMax == 1) )&&(__CLR4_4_125t25tlb90p6py.R.iget(2820)!=0|true))||(__CLR4_4_125t25tlb90p6py.R.iget(2821)==0&false))? -0.5 : previousPoints[i].doubleValue();

            // H[j-1](a)
            __CLR4_4_125t25tlb90p6py.R.inc(2822);double hma = H0;
            // H[j](a)
            __CLR4_4_125t25tlb90p6py.R.inc(2823);double ha = H1 * a;
            // H[j-1](b)
            __CLR4_4_125t25tlb90p6py.R.inc(2824);double hmb = H0;
            // H[j](b)
            __CLR4_4_125t25tlb90p6py.R.inc(2825);double hb = H1 * b;
            __CLR4_4_125t25tlb90p6py.R.inc(2826);for (int j = 1; (((j < numberOfPoints)&&(__CLR4_4_125t25tlb90p6py.R.iget(2827)!=0|true))||(__CLR4_4_125t25tlb90p6py.R.iget(2828)==0&false)); j++) {{
                // Compute H[j+1](a) and H[j+1](b)
                __CLR4_4_125t25tlb90p6py.R.inc(2829);final double jp1 = j + 1;
                __CLR4_4_125t25tlb90p6py.R.inc(2830);final double s = FastMath.sqrt(2 / jp1);
                __CLR4_4_125t25tlb90p6py.R.inc(2831);final double sm = FastMath.sqrt(j / jp1);
                __CLR4_4_125t25tlb90p6py.R.inc(2832);final double hpa = s * a * ha - sm * hma;
                __CLR4_4_125t25tlb90p6py.R.inc(2833);final double hpb = s * b * hb - sm * hmb;
                __CLR4_4_125t25tlb90p6py.R.inc(2834);hma = ha;
                __CLR4_4_125t25tlb90p6py.R.inc(2835);ha = hpa;
                __CLR4_4_125t25tlb90p6py.R.inc(2836);hmb = hb;
                __CLR4_4_125t25tlb90p6py.R.inc(2837);hb = hpb;
            }

            // Now ha = H[n+1](a), and hma = H[n](a) (same holds for b).
            // Middle of the interval.
            }__CLR4_4_125t25tlb90p6py.R.inc(2838);double c = 0.5 * (a + b);
            // P[j-1](c)
            __CLR4_4_125t25tlb90p6py.R.inc(2839);double hmc = H0;
            // P[j](c)
            __CLR4_4_125t25tlb90p6py.R.inc(2840);double hc = H1 * c;
            __CLR4_4_125t25tlb90p6py.R.inc(2841);boolean done = false;
            __CLR4_4_125t25tlb90p6py.R.inc(2842);while ((((!done)&&(__CLR4_4_125t25tlb90p6py.R.iget(2843)!=0|true))||(__CLR4_4_125t25tlb90p6py.R.iget(2844)==0&false))) {{
                __CLR4_4_125t25tlb90p6py.R.inc(2845);done = b - a <= Math.ulp(c);
                __CLR4_4_125t25tlb90p6py.R.inc(2846);hmc = H0;
                __CLR4_4_125t25tlb90p6py.R.inc(2847);hc = H1 * c;
                __CLR4_4_125t25tlb90p6py.R.inc(2848);for (int j = 1; (((j < numberOfPoints)&&(__CLR4_4_125t25tlb90p6py.R.iget(2849)!=0|true))||(__CLR4_4_125t25tlb90p6py.R.iget(2850)==0&false)); j++) {{
                    // Compute H[j+1](c)
                    __CLR4_4_125t25tlb90p6py.R.inc(2851);final double jp1 = j + 1;
                    __CLR4_4_125t25tlb90p6py.R.inc(2852);final double s = FastMath.sqrt(2 / jp1);
                    __CLR4_4_125t25tlb90p6py.R.inc(2853);final double sm = FastMath.sqrt(j / jp1);
                    __CLR4_4_125t25tlb90p6py.R.inc(2854);final double hpc = s * c * hc - sm * hmc;
                    __CLR4_4_125t25tlb90p6py.R.inc(2855);hmc = hc;
                    __CLR4_4_125t25tlb90p6py.R.inc(2856);hc = hpc;
                }
                // Now h = H[n+1](c) and hm = H[n](c).
                }__CLR4_4_125t25tlb90p6py.R.inc(2857);if ((((!done)&&(__CLR4_4_125t25tlb90p6py.R.iget(2858)!=0|true))||(__CLR4_4_125t25tlb90p6py.R.iget(2859)==0&false))) {{
                    __CLR4_4_125t25tlb90p6py.R.inc(2860);if ((((ha * hc < 0)&&(__CLR4_4_125t25tlb90p6py.R.iget(2861)!=0|true))||(__CLR4_4_125t25tlb90p6py.R.iget(2862)==0&false))) {{
                        __CLR4_4_125t25tlb90p6py.R.inc(2863);b = c;
                        __CLR4_4_125t25tlb90p6py.R.inc(2864);hmb = hmc;
                        __CLR4_4_125t25tlb90p6py.R.inc(2865);hb = hc;
                    } }else {{
                        __CLR4_4_125t25tlb90p6py.R.inc(2866);a = c;
                        __CLR4_4_125t25tlb90p6py.R.inc(2867);hma = hmc;
                        __CLR4_4_125t25tlb90p6py.R.inc(2868);ha = hc;
                    }
                    }__CLR4_4_125t25tlb90p6py.R.inc(2869);c = 0.5 * (a + b);
                }
            }}
            }__CLR4_4_125t25tlb90p6py.R.inc(2870);final double d = sqrtTwoTimesNumPoints * hmc;
            __CLR4_4_125t25tlb90p6py.R.inc(2871);final double w = 2 / (d * d);

            __CLR4_4_125t25tlb90p6py.R.inc(2872);points[i] = c;
            __CLR4_4_125t25tlb90p6py.R.inc(2873);weights[i] = w;

            __CLR4_4_125t25tlb90p6py.R.inc(2874);final int idx = lastNumPoints - i;
            __CLR4_4_125t25tlb90p6py.R.inc(2875);points[idx] = -c;
            __CLR4_4_125t25tlb90p6py.R.inc(2876);weights[idx] = w;
        }

        // If "numberOfPoints" is odd, 0 is a root.
        // Note: as written, the test for oddness will work for negative
        // integers too (although it is not necessary here), preventing
        // a FindBugs warning.
        }__CLR4_4_125t25tlb90p6py.R.inc(2877);if ((((numberOfPoints % 2 != 0)&&(__CLR4_4_125t25tlb90p6py.R.iget(2878)!=0|true))||(__CLR4_4_125t25tlb90p6py.R.iget(2879)==0&false))) {{
            __CLR4_4_125t25tlb90p6py.R.inc(2880);double hm = H0;
            __CLR4_4_125t25tlb90p6py.R.inc(2881);for (int j = 1; (((j < numberOfPoints)&&(__CLR4_4_125t25tlb90p6py.R.iget(2882)!=0|true))||(__CLR4_4_125t25tlb90p6py.R.iget(2883)==0&false)); j += 2) {{
                __CLR4_4_125t25tlb90p6py.R.inc(2884);final double jp1 = j + 1;
                __CLR4_4_125t25tlb90p6py.R.inc(2885);hm = -FastMath.sqrt(j / jp1) * hm;
            }
            }__CLR4_4_125t25tlb90p6py.R.inc(2886);final double d = sqrtTwoTimesNumPoints * hm;
            __CLR4_4_125t25tlb90p6py.R.inc(2887);final double w = 2 / (d * d);

            __CLR4_4_125t25tlb90p6py.R.inc(2888);points[iMax] = 0d;
            __CLR4_4_125t25tlb90p6py.R.inc(2889);weights[iMax] = w;
        }

        }__CLR4_4_125t25tlb90p6py.R.inc(2890);return new Pair<Double[], Double[]>(points, weights);
    }finally{__CLR4_4_125t25tlb90p6py.R.flushNeeded();}}
}
