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
import java.math.MathContext;

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
public class LegendreHighPrecisionRuleFactory extends BaseRuleFactory<BigDecimal> {public static class __CLR4_4_128b28blb90p6qf{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,3010,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /** Settings for enhanced precision computations. */
    private final MathContext mContext;
    /** The number {@code 2}. */
    private final BigDecimal two;
    /** The number {@code -1}. */
    private final BigDecimal minusOne;
    /** The number {@code 0.5}. */
    private final BigDecimal oneHalf;

    /**
     * Default precision is {@link MathContext#DECIMAL128 DECIMAL128}.
     */
    public LegendreHighPrecisionRuleFactory() {
        this(MathContext.DECIMAL128);__CLR4_4_128b28blb90p6qf.R.inc(2892);try{__CLR4_4_128b28blb90p6qf.R.inc(2891);
    }finally{__CLR4_4_128b28blb90p6qf.R.flushNeeded();}}

    /**
     * @param mContext Precision setting for computing the quadrature rules.
     */
    public LegendreHighPrecisionRuleFactory(MathContext mContext) {try{__CLR4_4_128b28blb90p6qf.R.inc(2893);
        __CLR4_4_128b28blb90p6qf.R.inc(2894);this.mContext = mContext;
        __CLR4_4_128b28blb90p6qf.R.inc(2895);two = new BigDecimal("2", mContext);
        __CLR4_4_128b28blb90p6qf.R.inc(2896);minusOne = new BigDecimal("-1", mContext);
        __CLR4_4_128b28blb90p6qf.R.inc(2897);oneHalf = new BigDecimal("0.5", mContext);
    }finally{__CLR4_4_128b28blb90p6qf.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    protected Pair<BigDecimal[], BigDecimal[]> computeRule(int numberOfPoints)
        throws DimensionMismatchException {try{__CLR4_4_128b28blb90p6qf.R.inc(2898);

        __CLR4_4_128b28blb90p6qf.R.inc(2899);if ((((numberOfPoints == 1)&&(__CLR4_4_128b28blb90p6qf.R.iget(2900)!=0|true))||(__CLR4_4_128b28blb90p6qf.R.iget(2901)==0&false))) {{
            // Break recursion.
            __CLR4_4_128b28blb90p6qf.R.inc(2902);return new Pair<BigDecimal[], BigDecimal[]>(new BigDecimal[] { BigDecimal.ZERO },
                                                        new BigDecimal[] { two });
        }

        // Get previous rule.
        // If it has not been computed yet it will trigger a recursive call
        // to this method.
        }__CLR4_4_128b28blb90p6qf.R.inc(2903);final BigDecimal[] previousPoints = getRuleInternal(numberOfPoints - 1).getFirst();

        // Compute next rule.
        __CLR4_4_128b28blb90p6qf.R.inc(2904);final BigDecimal[] points = new BigDecimal[numberOfPoints];
        __CLR4_4_128b28blb90p6qf.R.inc(2905);final BigDecimal[] weights = new BigDecimal[numberOfPoints];

        // Find i-th root of P[n+1] by bracketing.
        __CLR4_4_128b28blb90p6qf.R.inc(2906);final int iMax = numberOfPoints / 2;
        __CLR4_4_128b28blb90p6qf.R.inc(2907);for (int i = 0; (((i < iMax)&&(__CLR4_4_128b28blb90p6qf.R.iget(2908)!=0|true))||(__CLR4_4_128b28blb90p6qf.R.iget(2909)==0&false)); i++) {{
            // Lower-bound of the interval.
            __CLR4_4_128b28blb90p6qf.R.inc(2910);BigDecimal a = ((((i == 0) )&&(__CLR4_4_128b28blb90p6qf.R.iget(2911)!=0|true))||(__CLR4_4_128b28blb90p6qf.R.iget(2912)==0&false))? minusOne : previousPoints[i - 1];
            // Upper-bound of the interval.
            __CLR4_4_128b28blb90p6qf.R.inc(2913);BigDecimal b = ((((iMax == 1) )&&(__CLR4_4_128b28blb90p6qf.R.iget(2914)!=0|true))||(__CLR4_4_128b28blb90p6qf.R.iget(2915)==0&false))? BigDecimal.ONE : previousPoints[i];
            // P[j-1](a)
            __CLR4_4_128b28blb90p6qf.R.inc(2916);BigDecimal pma = BigDecimal.ONE;
            // P[j](a)
            __CLR4_4_128b28blb90p6qf.R.inc(2917);BigDecimal pa = a;
            // P[j-1](b)
            __CLR4_4_128b28blb90p6qf.R.inc(2918);BigDecimal pmb = BigDecimal.ONE;
            // P[j](b)
            __CLR4_4_128b28blb90p6qf.R.inc(2919);BigDecimal pb = b;
            __CLR4_4_128b28blb90p6qf.R.inc(2920);for (int j = 1; (((j < numberOfPoints)&&(__CLR4_4_128b28blb90p6qf.R.iget(2921)!=0|true))||(__CLR4_4_128b28blb90p6qf.R.iget(2922)==0&false)); j++) {{
                __CLR4_4_128b28blb90p6qf.R.inc(2923);final BigDecimal b_two_j_p_1 = new BigDecimal(2 * j + 1, mContext);
                __CLR4_4_128b28blb90p6qf.R.inc(2924);final BigDecimal b_j = new BigDecimal(j, mContext);
                __CLR4_4_128b28blb90p6qf.R.inc(2925);final BigDecimal b_j_p_1 = new BigDecimal(j + 1, mContext);

                // Compute P[j+1](a)
                // ppa = ((2 * j + 1) * a * pa - j * pma) / (j + 1);

                __CLR4_4_128b28blb90p6qf.R.inc(2926);BigDecimal tmp1 = a.multiply(b_two_j_p_1, mContext);
                __CLR4_4_128b28blb90p6qf.R.inc(2927);tmp1 = pa.multiply(tmp1, mContext);
                __CLR4_4_128b28blb90p6qf.R.inc(2928);BigDecimal tmp2 = pma.multiply(b_j, mContext);
                // P[j+1](a)
                __CLR4_4_128b28blb90p6qf.R.inc(2929);BigDecimal ppa = tmp1.subtract(tmp2, mContext);
                __CLR4_4_128b28blb90p6qf.R.inc(2930);ppa = ppa.divide(b_j_p_1, mContext);

                // Compute P[j+1](b)
                // ppb = ((2 * j + 1) * b * pb - j * pmb) / (j + 1);

                __CLR4_4_128b28blb90p6qf.R.inc(2931);tmp1 = b.multiply(b_two_j_p_1, mContext);
                __CLR4_4_128b28blb90p6qf.R.inc(2932);tmp1 = pb.multiply(tmp1, mContext);
                __CLR4_4_128b28blb90p6qf.R.inc(2933);tmp2 = pmb.multiply(b_j, mContext);
                // P[j+1](b)
                __CLR4_4_128b28blb90p6qf.R.inc(2934);BigDecimal ppb = tmp1.subtract(tmp2, mContext);
                __CLR4_4_128b28blb90p6qf.R.inc(2935);ppb = ppb.divide(b_j_p_1, mContext);

                __CLR4_4_128b28blb90p6qf.R.inc(2936);pma = pa;
                __CLR4_4_128b28blb90p6qf.R.inc(2937);pa = ppa;
                __CLR4_4_128b28blb90p6qf.R.inc(2938);pmb = pb;
                __CLR4_4_128b28blb90p6qf.R.inc(2939);pb = ppb;
            }
            // Now pa = P[n+1](a), and pma = P[n](a). Same holds for b.
            // Middle of the interval.
            }__CLR4_4_128b28blb90p6qf.R.inc(2940);BigDecimal c = a.add(b, mContext).multiply(oneHalf, mContext);
            // P[j-1](c)
            __CLR4_4_128b28blb90p6qf.R.inc(2941);BigDecimal pmc = BigDecimal.ONE;
            // P[j](c)
            __CLR4_4_128b28blb90p6qf.R.inc(2942);BigDecimal pc = c;
            __CLR4_4_128b28blb90p6qf.R.inc(2943);boolean done = false;
            __CLR4_4_128b28blb90p6qf.R.inc(2944);while ((((!done)&&(__CLR4_4_128b28blb90p6qf.R.iget(2945)!=0|true))||(__CLR4_4_128b28blb90p6qf.R.iget(2946)==0&false))) {{
                __CLR4_4_128b28blb90p6qf.R.inc(2947);BigDecimal tmp1 = b.subtract(a, mContext);
                __CLR4_4_128b28blb90p6qf.R.inc(2948);BigDecimal tmp2 = c.ulp().multiply(BigDecimal.TEN, mContext);
                __CLR4_4_128b28blb90p6qf.R.inc(2949);done = tmp1.compareTo(tmp2) <= 0;
                __CLR4_4_128b28blb90p6qf.R.inc(2950);pmc = BigDecimal.ONE;
                __CLR4_4_128b28blb90p6qf.R.inc(2951);pc = c;
                __CLR4_4_128b28blb90p6qf.R.inc(2952);for (int j = 1; (((j < numberOfPoints)&&(__CLR4_4_128b28blb90p6qf.R.iget(2953)!=0|true))||(__CLR4_4_128b28blb90p6qf.R.iget(2954)==0&false)); j++) {{
                    __CLR4_4_128b28blb90p6qf.R.inc(2955);final BigDecimal b_two_j_p_1 = new BigDecimal(2 * j + 1, mContext);
                    __CLR4_4_128b28blb90p6qf.R.inc(2956);final BigDecimal b_j = new BigDecimal(j, mContext);
                    __CLR4_4_128b28blb90p6qf.R.inc(2957);final BigDecimal b_j_p_1 = new BigDecimal(j + 1, mContext);

                    // Compute P[j+1](c)
                    __CLR4_4_128b28blb90p6qf.R.inc(2958);tmp1 = c.multiply(b_two_j_p_1, mContext);
                    __CLR4_4_128b28blb90p6qf.R.inc(2959);tmp1 = pc.multiply(tmp1, mContext);
                    __CLR4_4_128b28blb90p6qf.R.inc(2960);tmp2 = pmc.multiply(b_j, mContext);
                    // P[j+1](c)
                    __CLR4_4_128b28blb90p6qf.R.inc(2961);BigDecimal ppc = tmp1.subtract(tmp2, mContext);
                    __CLR4_4_128b28blb90p6qf.R.inc(2962);ppc = ppc.divide(b_j_p_1, mContext);

                    __CLR4_4_128b28blb90p6qf.R.inc(2963);pmc = pc;
                    __CLR4_4_128b28blb90p6qf.R.inc(2964);pc = ppc;
                }
                // Now pc = P[n+1](c) and pmc = P[n](c).
                }__CLR4_4_128b28blb90p6qf.R.inc(2965);if ((((!done)&&(__CLR4_4_128b28blb90p6qf.R.iget(2966)!=0|true))||(__CLR4_4_128b28blb90p6qf.R.iget(2967)==0&false))) {{
                    __CLR4_4_128b28blb90p6qf.R.inc(2968);if ((((pa.signum() * pc.signum() <= 0)&&(__CLR4_4_128b28blb90p6qf.R.iget(2969)!=0|true))||(__CLR4_4_128b28blb90p6qf.R.iget(2970)==0&false))) {{
                        __CLR4_4_128b28blb90p6qf.R.inc(2971);b = c;
                        __CLR4_4_128b28blb90p6qf.R.inc(2972);pmb = pmc;
                        __CLR4_4_128b28blb90p6qf.R.inc(2973);pb = pc;
                    } }else {{
                        __CLR4_4_128b28blb90p6qf.R.inc(2974);a = c;
                        __CLR4_4_128b28blb90p6qf.R.inc(2975);pma = pmc;
                        __CLR4_4_128b28blb90p6qf.R.inc(2976);pa = pc;
                    }
                    }__CLR4_4_128b28blb90p6qf.R.inc(2977);c = a.add(b, mContext).multiply(oneHalf, mContext);
                }
            }}
            }__CLR4_4_128b28blb90p6qf.R.inc(2978);final BigDecimal nP = new BigDecimal(numberOfPoints, mContext);
            __CLR4_4_128b28blb90p6qf.R.inc(2979);BigDecimal tmp1 = pmc.subtract(c.multiply(pc, mContext), mContext);
            __CLR4_4_128b28blb90p6qf.R.inc(2980);tmp1 = tmp1.multiply(nP);
            __CLR4_4_128b28blb90p6qf.R.inc(2981);tmp1 = tmp1.pow(2, mContext);
            __CLR4_4_128b28blb90p6qf.R.inc(2982);BigDecimal tmp2 = c.pow(2, mContext);
            __CLR4_4_128b28blb90p6qf.R.inc(2983);tmp2 = BigDecimal.ONE.subtract(tmp2, mContext);
            __CLR4_4_128b28blb90p6qf.R.inc(2984);tmp2 = tmp2.multiply(two, mContext);
            __CLR4_4_128b28blb90p6qf.R.inc(2985);tmp2 = tmp2.divide(tmp1, mContext);

            __CLR4_4_128b28blb90p6qf.R.inc(2986);points[i] = c;
            __CLR4_4_128b28blb90p6qf.R.inc(2987);weights[i] = tmp2;

            __CLR4_4_128b28blb90p6qf.R.inc(2988);final int idx = numberOfPoints - i - 1;
            __CLR4_4_128b28blb90p6qf.R.inc(2989);points[idx] = c.negate(mContext);
            __CLR4_4_128b28blb90p6qf.R.inc(2990);weights[idx] = tmp2;
        }
        // If "numberOfPoints" is odd, 0 is a root.
        // Note: as written, the test for oddness will work for negative
        // integers too (although it is not necessary here), preventing
        // a FindBugs warning.
        }__CLR4_4_128b28blb90p6qf.R.inc(2991);if ((((numberOfPoints % 2 != 0)&&(__CLR4_4_128b28blb90p6qf.R.iget(2992)!=0|true))||(__CLR4_4_128b28blb90p6qf.R.iget(2993)==0&false))) {{
            __CLR4_4_128b28blb90p6qf.R.inc(2994);BigDecimal pmc = BigDecimal.ONE;
            __CLR4_4_128b28blb90p6qf.R.inc(2995);for (int j = 1; (((j < numberOfPoints)&&(__CLR4_4_128b28blb90p6qf.R.iget(2996)!=0|true))||(__CLR4_4_128b28blb90p6qf.R.iget(2997)==0&false)); j += 2) {{
                __CLR4_4_128b28blb90p6qf.R.inc(2998);final BigDecimal b_j = new BigDecimal(j, mContext);
                __CLR4_4_128b28blb90p6qf.R.inc(2999);final BigDecimal b_j_p_1 = new BigDecimal(j + 1, mContext);

                // pmc = -j * pmc / (j + 1);
                __CLR4_4_128b28blb90p6qf.R.inc(3000);pmc = pmc.multiply(b_j, mContext);
                __CLR4_4_128b28blb90p6qf.R.inc(3001);pmc = pmc.divide(b_j_p_1, mContext);
                __CLR4_4_128b28blb90p6qf.R.inc(3002);pmc = pmc.negate(mContext);
            }

            // 2 / pow(numberOfPoints * pmc, 2);
            }__CLR4_4_128b28blb90p6qf.R.inc(3003);final BigDecimal nP = new BigDecimal(numberOfPoints, mContext);
            __CLR4_4_128b28blb90p6qf.R.inc(3004);BigDecimal tmp1 = pmc.multiply(nP, mContext);
            __CLR4_4_128b28blb90p6qf.R.inc(3005);tmp1 = tmp1.pow(2, mContext);
            __CLR4_4_128b28blb90p6qf.R.inc(3006);BigDecimal tmp2 = two.divide(tmp1, mContext);

            __CLR4_4_128b28blb90p6qf.R.inc(3007);points[iMax] = BigDecimal.ZERO;
            __CLR4_4_128b28blb90p6qf.R.inc(3008);weights[iMax] = tmp2;
        }

        }__CLR4_4_128b28blb90p6qf.R.inc(3009);return new Pair<BigDecimal[], BigDecimal[]>(points, weights);
    }finally{__CLR4_4_128b28blb90p6qf.R.flushNeeded();}}
}
