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

/**
 * Factory that creates Gauss-type quadrature rule using Legendre polynomials.
 * In this implementation, the lower and upper bounds of the natural interval
 * of integration are -1 and 1, respectively.
 * The Legendre polynomials are evaluated using the recurrence relation
 * presented in <a href="http://en.wikipedia.org/wiki/Abramowitz_and_Stegun"
 * Abramowitz and Stegun, 1964</a>.
 *
 * @since 3.1
 * @version $Id$
 */
public class LegendreRuleFactory extends BaseRuleFactory<Double> {public static class __CLR4_4_12bm2bmlb90p6qq{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,3092,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /** {@inheritDoc} */
    @Override
    protected Pair<Double[], Double[]> computeRule(int numberOfPoints)
        throws DimensionMismatchException {try{__CLR4_4_12bm2bmlb90p6qq.R.inc(3010);

        __CLR4_4_12bm2bmlb90p6qq.R.inc(3011);if ((((numberOfPoints == 1)&&(__CLR4_4_12bm2bmlb90p6qq.R.iget(3012)!=0|true))||(__CLR4_4_12bm2bmlb90p6qq.R.iget(3013)==0&false))) {{
            // Break recursion.
            __CLR4_4_12bm2bmlb90p6qq.R.inc(3014);return new Pair<Double[], Double[]>(new Double[] { 0d },
                                                new Double[] { 2d });
        }

        // Get previous rule.
        // If it has not been computed yet it will trigger a recursive call
        // to this method.
        }__CLR4_4_12bm2bmlb90p6qq.R.inc(3015);final Double[] previousPoints = getRuleInternal(numberOfPoints - 1).getFirst();

        // Compute next rule.
        __CLR4_4_12bm2bmlb90p6qq.R.inc(3016);final Double[] points = new Double[numberOfPoints];
        __CLR4_4_12bm2bmlb90p6qq.R.inc(3017);final Double[] weights = new Double[numberOfPoints];

        // Find i-th root of P[n+1] by bracketing.
        __CLR4_4_12bm2bmlb90p6qq.R.inc(3018);final int iMax = numberOfPoints / 2;
        __CLR4_4_12bm2bmlb90p6qq.R.inc(3019);for (int i = 0; (((i < iMax)&&(__CLR4_4_12bm2bmlb90p6qq.R.iget(3020)!=0|true))||(__CLR4_4_12bm2bmlb90p6qq.R.iget(3021)==0&false)); i++) {{
            // Lower-bound of the interval.
            __CLR4_4_12bm2bmlb90p6qq.R.inc(3022);double a = ((((i == 0) )&&(__CLR4_4_12bm2bmlb90p6qq.R.iget(3023)!=0|true))||(__CLR4_4_12bm2bmlb90p6qq.R.iget(3024)==0&false))? -1 : previousPoints[i - 1].doubleValue();
            // Upper-bound of the interval.
            __CLR4_4_12bm2bmlb90p6qq.R.inc(3025);double b = ((((iMax == 1) )&&(__CLR4_4_12bm2bmlb90p6qq.R.iget(3026)!=0|true))||(__CLR4_4_12bm2bmlb90p6qq.R.iget(3027)==0&false))? 1 : previousPoints[i].doubleValue();
            // P[j-1](a)
            __CLR4_4_12bm2bmlb90p6qq.R.inc(3028);double pma = 1;
            // P[j](a)
            __CLR4_4_12bm2bmlb90p6qq.R.inc(3029);double pa = a;
            // P[j-1](b)
            __CLR4_4_12bm2bmlb90p6qq.R.inc(3030);double pmb = 1;
            // P[j](b)
            __CLR4_4_12bm2bmlb90p6qq.R.inc(3031);double pb = b;
            __CLR4_4_12bm2bmlb90p6qq.R.inc(3032);for (int j = 1; (((j < numberOfPoints)&&(__CLR4_4_12bm2bmlb90p6qq.R.iget(3033)!=0|true))||(__CLR4_4_12bm2bmlb90p6qq.R.iget(3034)==0&false)); j++) {{
                __CLR4_4_12bm2bmlb90p6qq.R.inc(3035);final int two_j_p_1 = 2 * j + 1;
                __CLR4_4_12bm2bmlb90p6qq.R.inc(3036);final int j_p_1 = j + 1;
                // P[j+1](a)
                __CLR4_4_12bm2bmlb90p6qq.R.inc(3037);final double ppa = (two_j_p_1 * a * pa - j * pma) / j_p_1;
                // P[j+1](b)
                __CLR4_4_12bm2bmlb90p6qq.R.inc(3038);final double ppb = (two_j_p_1 * b * pb - j * pmb) / j_p_1;
                __CLR4_4_12bm2bmlb90p6qq.R.inc(3039);pma = pa;
                __CLR4_4_12bm2bmlb90p6qq.R.inc(3040);pa = ppa;
                __CLR4_4_12bm2bmlb90p6qq.R.inc(3041);pmb = pb;
                __CLR4_4_12bm2bmlb90p6qq.R.inc(3042);pb = ppb;
            }
            // Now pa = P[n+1](a), and pma = P[n](a) (same holds for b).
            // Middle of the interval.
            }__CLR4_4_12bm2bmlb90p6qq.R.inc(3043);double c = 0.5 * (a + b);
            // P[j-1](c)
            __CLR4_4_12bm2bmlb90p6qq.R.inc(3044);double pmc = 1;
            // P[j](c)
            __CLR4_4_12bm2bmlb90p6qq.R.inc(3045);double pc = c;
            __CLR4_4_12bm2bmlb90p6qq.R.inc(3046);boolean done = false;
            __CLR4_4_12bm2bmlb90p6qq.R.inc(3047);while ((((!done)&&(__CLR4_4_12bm2bmlb90p6qq.R.iget(3048)!=0|true))||(__CLR4_4_12bm2bmlb90p6qq.R.iget(3049)==0&false))) {{
                __CLR4_4_12bm2bmlb90p6qq.R.inc(3050);done = b - a <= Math.ulp(c);
                __CLR4_4_12bm2bmlb90p6qq.R.inc(3051);pmc = 1;
                __CLR4_4_12bm2bmlb90p6qq.R.inc(3052);pc = c;
                __CLR4_4_12bm2bmlb90p6qq.R.inc(3053);for (int j = 1; (((j < numberOfPoints)&&(__CLR4_4_12bm2bmlb90p6qq.R.iget(3054)!=0|true))||(__CLR4_4_12bm2bmlb90p6qq.R.iget(3055)==0&false)); j++) {{
                    // P[j+1](c)
                    __CLR4_4_12bm2bmlb90p6qq.R.inc(3056);final double ppc = ((2 * j + 1) * c * pc - j * pmc) / (j + 1);
                    __CLR4_4_12bm2bmlb90p6qq.R.inc(3057);pmc = pc;
                    __CLR4_4_12bm2bmlb90p6qq.R.inc(3058);pc = ppc;
                }
                // Now pc = P[n+1](c) and pmc = P[n](c).
                }__CLR4_4_12bm2bmlb90p6qq.R.inc(3059);if ((((!done)&&(__CLR4_4_12bm2bmlb90p6qq.R.iget(3060)!=0|true))||(__CLR4_4_12bm2bmlb90p6qq.R.iget(3061)==0&false))) {{
                    __CLR4_4_12bm2bmlb90p6qq.R.inc(3062);if ((((pa * pc <= 0)&&(__CLR4_4_12bm2bmlb90p6qq.R.iget(3063)!=0|true))||(__CLR4_4_12bm2bmlb90p6qq.R.iget(3064)==0&false))) {{
                        __CLR4_4_12bm2bmlb90p6qq.R.inc(3065);b = c;
                        __CLR4_4_12bm2bmlb90p6qq.R.inc(3066);pmb = pmc;
                        __CLR4_4_12bm2bmlb90p6qq.R.inc(3067);pb = pc;
                    } }else {{
                        __CLR4_4_12bm2bmlb90p6qq.R.inc(3068);a = c;
                        __CLR4_4_12bm2bmlb90p6qq.R.inc(3069);pma = pmc;
                        __CLR4_4_12bm2bmlb90p6qq.R.inc(3070);pa = pc;
                    }
                    }__CLR4_4_12bm2bmlb90p6qq.R.inc(3071);c = 0.5 * (a + b);
                }
            }}
            }__CLR4_4_12bm2bmlb90p6qq.R.inc(3072);final double d = numberOfPoints * (pmc - c * pc);
            __CLR4_4_12bm2bmlb90p6qq.R.inc(3073);final double w = 2 * (1 - c * c) / (d * d);

            __CLR4_4_12bm2bmlb90p6qq.R.inc(3074);points[i] = c;
            __CLR4_4_12bm2bmlb90p6qq.R.inc(3075);weights[i] = w;

            __CLR4_4_12bm2bmlb90p6qq.R.inc(3076);final int idx = numberOfPoints - i - 1;
            __CLR4_4_12bm2bmlb90p6qq.R.inc(3077);points[idx] = -c;
            __CLR4_4_12bm2bmlb90p6qq.R.inc(3078);weights[idx] = w;
        }
        // If "numberOfPoints" is odd, 0 is a root.
        // Note: as written, the test for oddness will work for negative
        // integers too (although it is not necessary here), preventing
        // a FindBugs warning.
        }__CLR4_4_12bm2bmlb90p6qq.R.inc(3079);if ((((numberOfPoints % 2 != 0)&&(__CLR4_4_12bm2bmlb90p6qq.R.iget(3080)!=0|true))||(__CLR4_4_12bm2bmlb90p6qq.R.iget(3081)==0&false))) {{
            __CLR4_4_12bm2bmlb90p6qq.R.inc(3082);double pmc = 1;
            __CLR4_4_12bm2bmlb90p6qq.R.inc(3083);for (int j = 1; (((j < numberOfPoints)&&(__CLR4_4_12bm2bmlb90p6qq.R.iget(3084)!=0|true))||(__CLR4_4_12bm2bmlb90p6qq.R.iget(3085)==0&false)); j += 2) {{
                __CLR4_4_12bm2bmlb90p6qq.R.inc(3086);pmc = -j * pmc / (j + 1);
            }
            }__CLR4_4_12bm2bmlb90p6qq.R.inc(3087);final double d = numberOfPoints * pmc;
            __CLR4_4_12bm2bmlb90p6qq.R.inc(3088);final double w = 2 / (d * d);

            __CLR4_4_12bm2bmlb90p6qq.R.inc(3089);points[iMax] = 0d;
            __CLR4_4_12bm2bmlb90p6qq.R.inc(3090);weights[iMax] = w;
        }

        }__CLR4_4_12bm2bmlb90p6qq.R.inc(3091);return new Pair<Double[], Double[]>(points, weights);
    }finally{__CLR4_4_12bm2bmlb90p6qq.R.flushNeeded();}}
}
