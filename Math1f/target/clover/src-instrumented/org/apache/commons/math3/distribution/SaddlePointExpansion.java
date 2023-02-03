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
package org.apache.commons.math3.distribution;

import org.apache.commons.math3.special.Gamma;
import org.apache.commons.math3.util.FastMath;
import org.apache.commons.math3.util.MathUtils;

/**
 * <p>
 * Utility class used by various distributions to accurately compute their
 * respective probability mass functions. The implementation for this class is
 * based on the Catherine Loader's <a target="_blank"
 * href="http://www.herine.net/stat/software/dbinom.html">dbinom</a> routines.
 * </p>
 * <p>
 * This class is not intended to be called directly.
 * </p>
 * <p>
 * References:
 * <ol>
 * <li>Catherine Loader (2000). "Fast and Accurate Computation of Binomial
 * Probabilities.". <a target="_blank"
 * href="http://www.herine.net/stat/papers/dbinom.pdf">
 * http://www.herine.net/stat/papers/dbinom.pdf</a></li>
 * </ol>
 * </p>
 *
 * @since 2.1
 * @version $Id$
 */
final class SaddlePointExpansion {public static class __CLR4_4_1926926lb90p7l3{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,11802,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** 1/2 * log(2 &#960;). */
    private static final double HALF_LOG_2_PI = 0.5 * FastMath.log(MathUtils.TWO_PI);

    /** exact Stirling expansion error for certain values. */
    private static final double[] EXACT_STIRLING_ERRORS = { 0.0, /* 0.0 */
    0.1534264097200273452913848, /* 0.5 */
    0.0810614667953272582196702, /* 1.0 */
    0.0548141210519176538961390, /* 1.5 */
    0.0413406959554092940938221, /* 2.0 */
    0.03316287351993628748511048, /* 2.5 */
    0.02767792568499833914878929, /* 3.0 */
    0.02374616365629749597132920, /* 3.5 */
    0.02079067210376509311152277, /* 4.0 */
    0.01848845053267318523077934, /* 4.5 */
    0.01664469118982119216319487, /* 5.0 */
    0.01513497322191737887351255, /* 5.5 */
    0.01387612882307074799874573, /* 6.0 */
    0.01281046524292022692424986, /* 6.5 */
    0.01189670994589177009505572, /* 7.0 */
    0.01110455975820691732662991, /* 7.5 */
    0.010411265261972096497478567, /* 8.0 */
    0.009799416126158803298389475, /* 8.5 */
    0.009255462182712732917728637, /* 9.0 */
    0.008768700134139385462952823, /* 9.5 */
    0.008330563433362871256469318, /* 10.0 */
    0.007934114564314020547248100, /* 10.5 */
    0.007573675487951840794972024, /* 11.0 */
    0.007244554301320383179543912, /* 11.5 */
    0.006942840107209529865664152, /* 12.0 */
    0.006665247032707682442354394, /* 12.5 */
    0.006408994188004207068439631, /* 13.0 */
    0.006171712263039457647532867, /* 13.5 */
    0.005951370112758847735624416, /* 14.0 */
    0.005746216513010115682023589, /* 14.5 */
    0.005554733551962801371038690 /* 15.0 */
    };

    /**
     * Default constructor.
     */
    private SaddlePointExpansion() {
        super();__CLR4_4_1926926lb90p7l3.R.inc(11743);try{__CLR4_4_1926926lb90p7l3.R.inc(11742);
    }finally{__CLR4_4_1926926lb90p7l3.R.flushNeeded();}}

    /**
     * Compute the error of Stirling's series at the given value.
     * <p>
     * References:
     * <ol>
     * <li>Eric W. Weisstein. "Stirling's Series." From MathWorld--A Wolfram Web
     * Resource. <a target="_blank"
     * href="http://mathworld.wolfram.com/StirlingsSeries.html">
     * http://mathworld.wolfram.com/StirlingsSeries.html</a></li>
     * </ol>
     * </p>
     *
     * @param z the value.
     * @return the Striling's series error.
     */
    static double getStirlingError(double z) {try{__CLR4_4_1926926lb90p7l3.R.inc(11744);
        __CLR4_4_1926926lb90p7l3.R.inc(11745);double ret;
        __CLR4_4_1926926lb90p7l3.R.inc(11746);if ((((z < 15.0)&&(__CLR4_4_1926926lb90p7l3.R.iget(11747)!=0|true))||(__CLR4_4_1926926lb90p7l3.R.iget(11748)==0&false))) {{
            __CLR4_4_1926926lb90p7l3.R.inc(11749);double z2 = 2.0 * z;
            __CLR4_4_1926926lb90p7l3.R.inc(11750);if ((((FastMath.floor(z2) == z2)&&(__CLR4_4_1926926lb90p7l3.R.iget(11751)!=0|true))||(__CLR4_4_1926926lb90p7l3.R.iget(11752)==0&false))) {{
                __CLR4_4_1926926lb90p7l3.R.inc(11753);ret = EXACT_STIRLING_ERRORS[(int) z2];
            } }else {{
                __CLR4_4_1926926lb90p7l3.R.inc(11754);ret = Gamma.logGamma(z + 1.0) - (z + 0.5) * FastMath.log(z) +
                      z - HALF_LOG_2_PI;
            }
        }} }else {{
            __CLR4_4_1926926lb90p7l3.R.inc(11755);double z2 = z * z;
            __CLR4_4_1926926lb90p7l3.R.inc(11756);ret = (0.083333333333333333333 -
                    (0.00277777777777777777778 -
                            (0.00079365079365079365079365 -
                                    (0.000595238095238095238095238 -
                                            0.0008417508417508417508417508 /
                                            z2) / z2) / z2) / z2) / z;
        }
        }__CLR4_4_1926926lb90p7l3.R.inc(11757);return ret;
    }finally{__CLR4_4_1926926lb90p7l3.R.flushNeeded();}}

    /**
     * A part of the deviance portion of the saddle point approximation.
     * <p>
     * References:
     * <ol>
     * <li>Catherine Loader (2000). "Fast and Accurate Computation of Binomial
     * Probabilities.". <a target="_blank"
     * href="http://www.herine.net/stat/papers/dbinom.pdf">
     * http://www.herine.net/stat/papers/dbinom.pdf</a></li>
     * </ol>
     * </p>
     *
     * @param x the x value.
     * @param mu the average.
     * @return a part of the deviance.
     */
    static double getDeviancePart(double x, double mu) {try{__CLR4_4_1926926lb90p7l3.R.inc(11758);
        __CLR4_4_1926926lb90p7l3.R.inc(11759);double ret;
        __CLR4_4_1926926lb90p7l3.R.inc(11760);if ((((FastMath.abs(x - mu) < 0.1 * (x + mu))&&(__CLR4_4_1926926lb90p7l3.R.iget(11761)!=0|true))||(__CLR4_4_1926926lb90p7l3.R.iget(11762)==0&false))) {{
            __CLR4_4_1926926lb90p7l3.R.inc(11763);double d = x - mu;
            __CLR4_4_1926926lb90p7l3.R.inc(11764);double v = d / (x + mu);
            __CLR4_4_1926926lb90p7l3.R.inc(11765);double s1 = v * d;
            __CLR4_4_1926926lb90p7l3.R.inc(11766);double s = Double.NaN;
            __CLR4_4_1926926lb90p7l3.R.inc(11767);double ej = 2.0 * x * v;
            __CLR4_4_1926926lb90p7l3.R.inc(11768);v = v * v;
            __CLR4_4_1926926lb90p7l3.R.inc(11769);int j = 1;
            __CLR4_4_1926926lb90p7l3.R.inc(11770);while ((((s1 != s)&&(__CLR4_4_1926926lb90p7l3.R.iget(11771)!=0|true))||(__CLR4_4_1926926lb90p7l3.R.iget(11772)==0&false))) {{
                __CLR4_4_1926926lb90p7l3.R.inc(11773);s = s1;
                __CLR4_4_1926926lb90p7l3.R.inc(11774);ej *= v;
                __CLR4_4_1926926lb90p7l3.R.inc(11775);s1 = s + ej / ((j * 2) + 1);
                __CLR4_4_1926926lb90p7l3.R.inc(11776);++j;
            }
            }__CLR4_4_1926926lb90p7l3.R.inc(11777);ret = s1;
        } }else {{
            __CLR4_4_1926926lb90p7l3.R.inc(11778);ret = x * FastMath.log(x / mu) + mu - x;
        }
        }__CLR4_4_1926926lb90p7l3.R.inc(11779);return ret;
    }finally{__CLR4_4_1926926lb90p7l3.R.flushNeeded();}}

    /**
     * Compute the logarithm of the PMF for a binomial distribution
     * using the saddle point expansion.
     *
     * @param x the value at which the probability is evaluated.
     * @param n the number of trials.
     * @param p the probability of success.
     * @param q the probability of failure (1 - p).
     * @return log(p(x)).
     */
    static double logBinomialProbability(int x, int n, double p, double q) {try{__CLR4_4_1926926lb90p7l3.R.inc(11780);
        __CLR4_4_1926926lb90p7l3.R.inc(11781);double ret;
        __CLR4_4_1926926lb90p7l3.R.inc(11782);if ((((x == 0)&&(__CLR4_4_1926926lb90p7l3.R.iget(11783)!=0|true))||(__CLR4_4_1926926lb90p7l3.R.iget(11784)==0&false))) {{
            __CLR4_4_1926926lb90p7l3.R.inc(11785);if ((((p < 0.1)&&(__CLR4_4_1926926lb90p7l3.R.iget(11786)!=0|true))||(__CLR4_4_1926926lb90p7l3.R.iget(11787)==0&false))) {{
                __CLR4_4_1926926lb90p7l3.R.inc(11788);ret = -getDeviancePart(n, n * q) - n * p;
            } }else {{
                __CLR4_4_1926926lb90p7l3.R.inc(11789);ret = n * FastMath.log(q);
            }
        }} }else {__CLR4_4_1926926lb90p7l3.R.inc(11790);if ((((x == n)&&(__CLR4_4_1926926lb90p7l3.R.iget(11791)!=0|true))||(__CLR4_4_1926926lb90p7l3.R.iget(11792)==0&false))) {{
            __CLR4_4_1926926lb90p7l3.R.inc(11793);if ((((q < 0.1)&&(__CLR4_4_1926926lb90p7l3.R.iget(11794)!=0|true))||(__CLR4_4_1926926lb90p7l3.R.iget(11795)==0&false))) {{
                __CLR4_4_1926926lb90p7l3.R.inc(11796);ret = -getDeviancePart(n, n * p) - n * q;
            } }else {{
                __CLR4_4_1926926lb90p7l3.R.inc(11797);ret = n * FastMath.log(p);
            }
        }} }else {{
            __CLR4_4_1926926lb90p7l3.R.inc(11798);ret = getStirlingError(n) - getStirlingError(x) -
                  getStirlingError(n - x) - getDeviancePart(x, n * p) -
                  getDeviancePart(n - x, n * q);
            __CLR4_4_1926926lb90p7l3.R.inc(11799);double f = (MathUtils.TWO_PI * x * (n - x)) / n;
            __CLR4_4_1926926lb90p7l3.R.inc(11800);ret = -0.5 * FastMath.log(f) + ret;
        }
        }}__CLR4_4_1926926lb90p7l3.R.inc(11801);return ret;
    }finally{__CLR4_4_1926926lb90p7l3.R.flushNeeded();}}
}
