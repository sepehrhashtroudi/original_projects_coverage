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
package org.apache.commons.math3.special;

import org.apache.commons.math3.exception.MaxCountExceededException;
import org.apache.commons.math3.exception.NumberIsTooLargeException;
import org.apache.commons.math3.exception.NumberIsTooSmallException;
import org.apache.commons.math3.util.ContinuedFraction;
import org.apache.commons.math3.util.FastMath;

/**
 * <p>
 * This is a utility class that provides computation methods related to the
 * &Gamma; (Gamma) family of functions.
 * </p>
 * <p>
 * Implementation of {@link #invGamma1pm1(double)} and
 * {@link #logGamma1p(double)} is based on the algorithms described in
 * <ul>
 * <li><a href="http://dx.doi.org/10.1145/22721.23109">Didonato and Morris
 * (1986)</a>, <em>Computation of the Incomplete Gamma Function Ratios and
 *     their Inverse</em>, TOMS 12(4), 377-393,</li>
 * <li><a href="http://dx.doi.org/10.1145/131766.131776">Didonato and Morris
 * (1992)</a>, <em>Algorithm 708: Significant Digit Computation of the
 *     Incomplete Beta Function Ratios</em>, TOMS 18(3), 360-373,</li>
 * </ul>
 * and implemented in the
 * <a href="http://www.dtic.mil/docs/citations/ADA476840">NSWC Library of Mathematical Functions</a>,
 * available
 * <a href="http://www.ualberta.ca/CNS/RESEARCH/Software/NumericalNSWC/site.html">here</a>.
 * This library is "approved for public release", and the
 * <a href="http://www.dtic.mil/dtic/pdf/announcements/CopyrightGuidance.pdf">Copyright guidance</a>
 * indicates that unless otherwise stated in the code, all FORTRAN functions in
 * this library are license free. Since no such notice appears in the code these
 * functions can safely be ported to Commons-Math.
 * </p>
 *
 * @version $Id$
 */
public class Gamma {public static class __CLR4_4_111xp11xplb90paid{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,49406,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /**
     * <a href="http://en.wikipedia.org/wiki/Euler-Mascheroni_constant">Euler-Mascheroni constant</a>
     * @since 2.0
     */
    public static final double GAMMA = 0.577215664901532860606512090082;

    /**
     * The value of the {@code g} constant in the Lanczos approximation, see
     * {@link #lanczos(double)}.
     * @since 3.1
     */
    public static final double LANCZOS_G = 607.0 / 128.0;

    /** Maximum allowed numerical error. */
    private static final double DEFAULT_EPSILON = 10e-15;

    /** Lanczos coefficients */
    private static final double[] LANCZOS = {
        0.99999999999999709182,
        57.156235665862923517,
        -59.597960355475491248,
        14.136097974741747174,
        -0.49191381609762019978,
        .33994649984811888699e-4,
        .46523628927048575665e-4,
        -.98374475304879564677e-4,
        .15808870322491248884e-3,
        -.21026444172410488319e-3,
        .21743961811521264320e-3,
        -.16431810653676389022e-3,
        .84418223983852743293e-4,
        -.26190838401581408670e-4,
        .36899182659531622704e-5,
    };

    /** Avoid repeated computation of log of 2 PI in logGamma */
    private static final double HALF_LOG_2_PI = 0.5 * FastMath.log(2.0 * FastMath.PI);

    /** The constant value of &radic;(2&pi;). */
    private static final double SQRT_TWO_PI = 2.506628274631000502;

    // limits for switching algorithm in digamma
    /** C limit. */
    private static final double C_LIMIT = 49;

    /** S limit. */
    private static final double S_LIMIT = 1e-5;

    /*
     * Constants for the computation of double invGamma1pm1(double).
     * Copied from DGAM1 in the NSWC library.
     */

    /** The constant {@code A0} defined in {@code DGAM1}. */
    private static final double INV_GAMMA1P_M1_A0 = .611609510448141581788E-08;

    /** The constant {@code A1} defined in {@code DGAM1}. */
    private static final double INV_GAMMA1P_M1_A1 = .624730830116465516210E-08;

    /** The constant {@code B1} defined in {@code DGAM1}. */
    private static final double INV_GAMMA1P_M1_B1 = .203610414066806987300E+00;

    /** The constant {@code B2} defined in {@code DGAM1}. */
    private static final double INV_GAMMA1P_M1_B2 = .266205348428949217746E-01;

    /** The constant {@code B3} defined in {@code DGAM1}. */
    private static final double INV_GAMMA1P_M1_B3 = .493944979382446875238E-03;

    /** The constant {@code B4} defined in {@code DGAM1}. */
    private static final double INV_GAMMA1P_M1_B4 = -.851419432440314906588E-05;

    /** The constant {@code B5} defined in {@code DGAM1}. */
    private static final double INV_GAMMA1P_M1_B5 = -.643045481779353022248E-05;

    /** The constant {@code B6} defined in {@code DGAM1}. */
    private static final double INV_GAMMA1P_M1_B6 = .992641840672773722196E-06;

    /** The constant {@code B7} defined in {@code DGAM1}. */
    private static final double INV_GAMMA1P_M1_B7 = -.607761895722825260739E-07;

    /** The constant {@code B8} defined in {@code DGAM1}. */
    private static final double INV_GAMMA1P_M1_B8 = .195755836614639731882E-09;

    /** The constant {@code P0} defined in {@code DGAM1}. */
    private static final double INV_GAMMA1P_M1_P0 = .6116095104481415817861E-08;

    /** The constant {@code P1} defined in {@code DGAM1}. */
    private static final double INV_GAMMA1P_M1_P1 = .6871674113067198736152E-08;

    /** The constant {@code P2} defined in {@code DGAM1}. */
    private static final double INV_GAMMA1P_M1_P2 = .6820161668496170657918E-09;

    /** The constant {@code P3} defined in {@code DGAM1}. */
    private static final double INV_GAMMA1P_M1_P3 = .4686843322948848031080E-10;

    /** The constant {@code P4} defined in {@code DGAM1}. */
    private static final double INV_GAMMA1P_M1_P4 = .1572833027710446286995E-11;

    /** The constant {@code P5} defined in {@code DGAM1}. */
    private static final double INV_GAMMA1P_M1_P5 = -.1249441572276366213222E-12;

    /** The constant {@code P6} defined in {@code DGAM1}. */
    private static final double INV_GAMMA1P_M1_P6 = .4343529937408594255178E-14;

    /** The constant {@code Q1} defined in {@code DGAM1}. */
    private static final double INV_GAMMA1P_M1_Q1 = .3056961078365221025009E+00;

    /** The constant {@code Q2} defined in {@code DGAM1}. */
    private static final double INV_GAMMA1P_M1_Q2 = .5464213086042296536016E-01;

    /** The constant {@code Q3} defined in {@code DGAM1}. */
    private static final double INV_GAMMA1P_M1_Q3 = .4956830093825887312020E-02;

    /** The constant {@code Q4} defined in {@code DGAM1}. */
    private static final double INV_GAMMA1P_M1_Q4 = .2692369466186361192876E-03;

    /** The constant {@code C} defined in {@code DGAM1}. */
    private static final double INV_GAMMA1P_M1_C = -.422784335098467139393487909917598E+00;

    /** The constant {@code C0} defined in {@code DGAM1}. */
    private static final double INV_GAMMA1P_M1_C0 = .577215664901532860606512090082402E+00;

    /** The constant {@code C1} defined in {@code DGAM1}. */
    private static final double INV_GAMMA1P_M1_C1 = -.655878071520253881077019515145390E+00;

    /** The constant {@code C2} defined in {@code DGAM1}. */
    private static final double INV_GAMMA1P_M1_C2 = -.420026350340952355290039348754298E-01;

    /** The constant {@code C3} defined in {@code DGAM1}. */
    private static final double INV_GAMMA1P_M1_C3 = .166538611382291489501700795102105E+00;

    /** The constant {@code C4} defined in {@code DGAM1}. */
    private static final double INV_GAMMA1P_M1_C4 = -.421977345555443367482083012891874E-01;

    /** The constant {@code C5} defined in {@code DGAM1}. */
    private static final double INV_GAMMA1P_M1_C5 = -.962197152787697356211492167234820E-02;

    /** The constant {@code C6} defined in {@code DGAM1}. */
    private static final double INV_GAMMA1P_M1_C6 = .721894324666309954239501034044657E-02;

    /** The constant {@code C7} defined in {@code DGAM1}. */
    private static final double INV_GAMMA1P_M1_C7 = -.116516759185906511211397108401839E-02;

    /** The constant {@code C8} defined in {@code DGAM1}. */
    private static final double INV_GAMMA1P_M1_C8 = -.215241674114950972815729963053648E-03;

    /** The constant {@code C9} defined in {@code DGAM1}. */
    private static final double INV_GAMMA1P_M1_C9 = .128050282388116186153198626328164E-03;

    /** The constant {@code C10} defined in {@code DGAM1}. */
    private static final double INV_GAMMA1P_M1_C10 = -.201348547807882386556893914210218E-04;

    /** The constant {@code C11} defined in {@code DGAM1}. */
    private static final double INV_GAMMA1P_M1_C11 = -.125049348214267065734535947383309E-05;

    /** The constant {@code C12} defined in {@code DGAM1}. */
    private static final double INV_GAMMA1P_M1_C12 = .113302723198169588237412962033074E-05;

    /** The constant {@code C13} defined in {@code DGAM1}. */
    private static final double INV_GAMMA1P_M1_C13 = -.205633841697760710345015413002057E-06;

    /**
     * Default constructor.  Prohibit instantiation.
     */
    private Gamma() {try{__CLR4_4_111xp11xplb90paid.R.inc(49165);}finally{__CLR4_4_111xp11xplb90paid.R.flushNeeded();}}

    /**
     * <p>
     * Returns the value of log&nbsp;&Gamma;(x) for x&nbsp;&gt;&nbsp;0.
     * </p>
     * <p>
     * For x &le; 8, the implementation is based on the double precision
     * implementation in the <em>NSWC Library of Mathematics Subroutines</em>,
     * {@code DGAMLN}. For x &gt; 8, the implementation is based on
     * </p>
     * <ul>
     * <li><a href="http://mathworld.wolfram.com/GammaFunction.html">Gamma
     *     Function</a>, equation (28).</li>
     * <li><a href="http://mathworld.wolfram.com/LanczosApproximation.html">
     *     Lanczos Approximation</a>, equations (1) through (5).</li>
     * <li><a href="http://my.fit.edu/~gabdo/gamma.txt">Paul Godfrey, A note on
     *     the computation of the convergent Lanczos complex Gamma
     *     approximation</a></li>
     * </ul>
     *
     * @param x Argument.
     * @return the value of {@code log(Gamma(x))}, {@code Double.NaN} if
     * {@code x <= 0.0}.
     */
    public static double logGamma(double x) {try{__CLR4_4_111xp11xplb90paid.R.inc(49166);
        __CLR4_4_111xp11xplb90paid.R.inc(49167);double ret;

        __CLR4_4_111xp11xplb90paid.R.inc(49168);if ((((Double.isNaN(x) || (x <= 0.0))&&(__CLR4_4_111xp11xplb90paid.R.iget(49169)!=0|true))||(__CLR4_4_111xp11xplb90paid.R.iget(49170)==0&false))) {{
            __CLR4_4_111xp11xplb90paid.R.inc(49171);ret = Double.NaN;
        } }else {__CLR4_4_111xp11xplb90paid.R.inc(49172);if ((((x < 0.5)&&(__CLR4_4_111xp11xplb90paid.R.iget(49173)!=0|true))||(__CLR4_4_111xp11xplb90paid.R.iget(49174)==0&false))) {{
            __CLR4_4_111xp11xplb90paid.R.inc(49175);return logGamma1p(x) - FastMath.log(x);
        } }else {__CLR4_4_111xp11xplb90paid.R.inc(49176);if ((((x <= 2.5)&&(__CLR4_4_111xp11xplb90paid.R.iget(49177)!=0|true))||(__CLR4_4_111xp11xplb90paid.R.iget(49178)==0&false))) {{
            __CLR4_4_111xp11xplb90paid.R.inc(49179);return logGamma1p((x - 0.5) - 0.5);
        } }else {__CLR4_4_111xp11xplb90paid.R.inc(49180);if ((((x <= 8.0)&&(__CLR4_4_111xp11xplb90paid.R.iget(49181)!=0|true))||(__CLR4_4_111xp11xplb90paid.R.iget(49182)==0&false))) {{
            __CLR4_4_111xp11xplb90paid.R.inc(49183);final int n = (int) FastMath.floor(x - 1.5);
            __CLR4_4_111xp11xplb90paid.R.inc(49184);double prod = 1.0;
            __CLR4_4_111xp11xplb90paid.R.inc(49185);for (int i = 1; (((i <= n)&&(__CLR4_4_111xp11xplb90paid.R.iget(49186)!=0|true))||(__CLR4_4_111xp11xplb90paid.R.iget(49187)==0&false)); i++) {{
                __CLR4_4_111xp11xplb90paid.R.inc(49188);prod *= x - i;
            }
            }__CLR4_4_111xp11xplb90paid.R.inc(49189);return logGamma1p(x - (n + 1)) + FastMath.log(prod);
        } }else {{
            __CLR4_4_111xp11xplb90paid.R.inc(49190);double sum = lanczos(x);
            __CLR4_4_111xp11xplb90paid.R.inc(49191);double tmp = x + LANCZOS_G + .5;
            __CLR4_4_111xp11xplb90paid.R.inc(49192);ret = ((x + .5) * FastMath.log(tmp)) - tmp +
                HALF_LOG_2_PI + FastMath.log(sum / x);
        }

        }}}}__CLR4_4_111xp11xplb90paid.R.inc(49193);return ret;
    }finally{__CLR4_4_111xp11xplb90paid.R.flushNeeded();}}

    /**
     * Returns the regularized gamma function P(a, x).
     *
     * @param a Parameter.
     * @param x Value.
     * @return the regularized gamma function P(a, x).
     * @throws MaxCountExceededException if the algorithm fails to converge.
     */
    public static double regularizedGammaP(double a, double x) {try{__CLR4_4_111xp11xplb90paid.R.inc(49194);
        __CLR4_4_111xp11xplb90paid.R.inc(49195);return regularizedGammaP(a, x, DEFAULT_EPSILON, Integer.MAX_VALUE);
    }finally{__CLR4_4_111xp11xplb90paid.R.flushNeeded();}}

    /**
     * Returns the regularized gamma function P(a, x).
     *
     * The implementation of this method is based on:
     * <ul>
     *  <li>
     *   <a href="http://mathworld.wolfram.com/RegularizedGammaFunction.html">
     *   Regularized Gamma Function</a>, equation (1)
     *  </li>
     *  <li>
     *   <a href="http://mathworld.wolfram.com/IncompleteGammaFunction.html">
     *   Incomplete Gamma Function</a>, equation (4).
     *  </li>
     *  <li>
     *   <a href="http://mathworld.wolfram.com/ConfluentHypergeometricFunctionoftheFirstKind.html">
     *   Confluent Hypergeometric Function of the First Kind</a>, equation (1).
     *  </li>
     * </ul>
     *
     * @param a the a parameter.
     * @param x the value.
     * @param epsilon When the absolute value of the nth item in the
     * series is less than epsilon the approximation ceases to calculate
     * further elements in the series.
     * @param maxIterations Maximum number of "iterations" to complete.
     * @return the regularized gamma function P(a, x)
     * @throws MaxCountExceededException if the algorithm fails to converge.
     */
    public static double regularizedGammaP(double a,
                                           double x,
                                           double epsilon,
                                           int maxIterations) {try{__CLR4_4_111xp11xplb90paid.R.inc(49196);
        __CLR4_4_111xp11xplb90paid.R.inc(49197);double ret;

        __CLR4_4_111xp11xplb90paid.R.inc(49198);if ((((Double.isNaN(a) || Double.isNaN(x) || (a <= 0.0) || (x < 0.0))&&(__CLR4_4_111xp11xplb90paid.R.iget(49199)!=0|true))||(__CLR4_4_111xp11xplb90paid.R.iget(49200)==0&false))) {{
            __CLR4_4_111xp11xplb90paid.R.inc(49201);ret = Double.NaN;
        } }else {__CLR4_4_111xp11xplb90paid.R.inc(49202);if ((((x == 0.0)&&(__CLR4_4_111xp11xplb90paid.R.iget(49203)!=0|true))||(__CLR4_4_111xp11xplb90paid.R.iget(49204)==0&false))) {{
            __CLR4_4_111xp11xplb90paid.R.inc(49205);ret = 0.0;
        } }else {__CLR4_4_111xp11xplb90paid.R.inc(49206);if ((((x >= a + 1)&&(__CLR4_4_111xp11xplb90paid.R.iget(49207)!=0|true))||(__CLR4_4_111xp11xplb90paid.R.iget(49208)==0&false))) {{
            // use regularizedGammaQ because it should converge faster in this
            // case.
            __CLR4_4_111xp11xplb90paid.R.inc(49209);ret = 1.0 - regularizedGammaQ(a, x, epsilon, maxIterations);
        } }else {{
            // calculate series
            __CLR4_4_111xp11xplb90paid.R.inc(49210);double n = 0.0; // current element index
            __CLR4_4_111xp11xplb90paid.R.inc(49211);double an = 1.0 / a; // n-th element in the series
            __CLR4_4_111xp11xplb90paid.R.inc(49212);double sum = an; // partial sum
            __CLR4_4_111xp11xplb90paid.R.inc(49213);while ((((FastMath.abs(an/sum) > epsilon &&
                   n < maxIterations &&
                   sum < Double.POSITIVE_INFINITY)&&(__CLR4_4_111xp11xplb90paid.R.iget(49214)!=0|true))||(__CLR4_4_111xp11xplb90paid.R.iget(49215)==0&false))) {{
                // compute next element in the series
                __CLR4_4_111xp11xplb90paid.R.inc(49216);n = n + 1.0;
                __CLR4_4_111xp11xplb90paid.R.inc(49217);an = an * (x / (a + n));

                // update partial sum
                __CLR4_4_111xp11xplb90paid.R.inc(49218);sum = sum + an;
            }
            }__CLR4_4_111xp11xplb90paid.R.inc(49219);if ((((n >= maxIterations)&&(__CLR4_4_111xp11xplb90paid.R.iget(49220)!=0|true))||(__CLR4_4_111xp11xplb90paid.R.iget(49221)==0&false))) {{
                __CLR4_4_111xp11xplb90paid.R.inc(49222);throw new MaxCountExceededException(maxIterations);
            } }else {__CLR4_4_111xp11xplb90paid.R.inc(49223);if ((((Double.isInfinite(sum))&&(__CLR4_4_111xp11xplb90paid.R.iget(49224)!=0|true))||(__CLR4_4_111xp11xplb90paid.R.iget(49225)==0&false))) {{
                __CLR4_4_111xp11xplb90paid.R.inc(49226);ret = 1.0;
            } }else {{
                __CLR4_4_111xp11xplb90paid.R.inc(49227);ret = FastMath.exp(-x + (a * FastMath.log(x)) - logGamma(a)) * sum;
            }
        }}}

        }}}__CLR4_4_111xp11xplb90paid.R.inc(49228);return ret;
    }finally{__CLR4_4_111xp11xplb90paid.R.flushNeeded();}}

    /**
     * Returns the regularized gamma function Q(a, x) = 1 - P(a, x).
     *
     * @param a the a parameter.
     * @param x the value.
     * @return the regularized gamma function Q(a, x)
     * @throws MaxCountExceededException if the algorithm fails to converge.
     */
    public static double regularizedGammaQ(double a, double x) {try{__CLR4_4_111xp11xplb90paid.R.inc(49229);
        __CLR4_4_111xp11xplb90paid.R.inc(49230);return regularizedGammaQ(a, x, DEFAULT_EPSILON, Integer.MAX_VALUE);
    }finally{__CLR4_4_111xp11xplb90paid.R.flushNeeded();}}

    /**
     * Returns the regularized gamma function Q(a, x) = 1 - P(a, x).
     *
     * The implementation of this method is based on:
     * <ul>
     *  <li>
     *   <a href="http://mathworld.wolfram.com/RegularizedGammaFunction.html">
     *   Regularized Gamma Function</a>, equation (1).
     *  </li>
     *  <li>
     *   <a href="http://functions.wolfram.com/GammaBetaErf/GammaRegularized/10/0003/">
     *   Regularized incomplete gamma function: Continued fraction representations
     *   (formula 06.08.10.0003)</a>
     *  </li>
     * </ul>
     *
     * @param a the a parameter.
     * @param x the value.
     * @param epsilon When the absolute value of the nth item in the
     * series is less than epsilon the approximation ceases to calculate
     * further elements in the series.
     * @param maxIterations Maximum number of "iterations" to complete.
     * @return the regularized gamma function P(a, x)
     * @throws MaxCountExceededException if the algorithm fails to converge.
     */
    public static double regularizedGammaQ(final double a,
                                           double x,
                                           double epsilon,
                                           int maxIterations) {try{__CLR4_4_111xp11xplb90paid.R.inc(49231);
        __CLR4_4_111xp11xplb90paid.R.inc(49232);double ret;

        __CLR4_4_111xp11xplb90paid.R.inc(49233);if ((((Double.isNaN(a) || Double.isNaN(x) || (a <= 0.0) || (x < 0.0))&&(__CLR4_4_111xp11xplb90paid.R.iget(49234)!=0|true))||(__CLR4_4_111xp11xplb90paid.R.iget(49235)==0&false))) {{
            __CLR4_4_111xp11xplb90paid.R.inc(49236);ret = Double.NaN;
        } }else {__CLR4_4_111xp11xplb90paid.R.inc(49237);if ((((x == 0.0)&&(__CLR4_4_111xp11xplb90paid.R.iget(49238)!=0|true))||(__CLR4_4_111xp11xplb90paid.R.iget(49239)==0&false))) {{
            __CLR4_4_111xp11xplb90paid.R.inc(49240);ret = 1.0;
        } }else {__CLR4_4_111xp11xplb90paid.R.inc(49241);if ((((x < a + 1.0)&&(__CLR4_4_111xp11xplb90paid.R.iget(49242)!=0|true))||(__CLR4_4_111xp11xplb90paid.R.iget(49243)==0&false))) {{
            // use regularizedGammaP because it should converge faster in this
            // case.
            __CLR4_4_111xp11xplb90paid.R.inc(49244);ret = 1.0 - regularizedGammaP(a, x, epsilon, maxIterations);
        } }else {{
            // create continued fraction
            __CLR4_4_111xp11xplb90paid.R.inc(49245);ContinuedFraction cf = new ContinuedFraction() {

                @Override
                protected double getA(int n, double x) {try{__CLR4_4_111xp11xplb90paid.R.inc(49246);
                    __CLR4_4_111xp11xplb90paid.R.inc(49247);return ((2.0 * n) + 1.0) - a + x;
                }finally{__CLR4_4_111xp11xplb90paid.R.flushNeeded();}}

                @Override
                protected double getB(int n, double x) {try{__CLR4_4_111xp11xplb90paid.R.inc(49248);
                    __CLR4_4_111xp11xplb90paid.R.inc(49249);return n * (a - n);
                }finally{__CLR4_4_111xp11xplb90paid.R.flushNeeded();}}
            };

            __CLR4_4_111xp11xplb90paid.R.inc(49250);ret = 1.0 / cf.evaluate(x, epsilon, maxIterations);
            __CLR4_4_111xp11xplb90paid.R.inc(49251);ret = FastMath.exp(-x + (a * FastMath.log(x)) - logGamma(a)) * ret;
        }

        }}}__CLR4_4_111xp11xplb90paid.R.inc(49252);return ret;
    }finally{__CLR4_4_111xp11xplb90paid.R.flushNeeded();}}


    /**
     * <p>Computes the digamma function of x.</p>
     *
     * <p>This is an independently written implementation of the algorithm described in
     * Jose Bernardo, Algorithm AS 103: Psi (Digamma) Function, Applied Statistics, 1976.</p>
     *
     * <p>Some of the constants have been changed to increase accuracy at the moderate expense
     * of run-time.  The result should be accurate to within 10^-8 absolute tolerance for
     * x >= 10^-5 and within 10^-8 relative tolerance for x > 0.</p>
     *
     * <p>Performance for large negative values of x will be quite expensive (proportional to
     * |x|).  Accuracy for negative values of x should be about 10^-8 absolute for results
     * less than 10^5 and 10^-8 relative for results larger than that.</p>
     *
     * @param x Argument.
     * @return digamma(x) to within 10-8 relative or absolute error whichever is smaller.
     * @see <a href="http://en.wikipedia.org/wiki/Digamma_function">Digamma</a>
     * @see <a href="http://www.uv.es/~bernardo/1976AppStatist.pdf">Bernardo&apos;s original article </a>
     * @since 2.0
     */
    public static double digamma(double x) {try{__CLR4_4_111xp11xplb90paid.R.inc(49253);
        __CLR4_4_111xp11xplb90paid.R.inc(49254);if ((((x > 0 && x <= S_LIMIT)&&(__CLR4_4_111xp11xplb90paid.R.iget(49255)!=0|true))||(__CLR4_4_111xp11xplb90paid.R.iget(49256)==0&false))) {{
            // use method 5 from Bernardo AS103
            // accurate to O(x)
            __CLR4_4_111xp11xplb90paid.R.inc(49257);return -GAMMA - 1 / x;
        }

        }__CLR4_4_111xp11xplb90paid.R.inc(49258);if ((((x >= C_LIMIT)&&(__CLR4_4_111xp11xplb90paid.R.iget(49259)!=0|true))||(__CLR4_4_111xp11xplb90paid.R.iget(49260)==0&false))) {{
            // use method 4 (accurate to O(1/x^8)
            __CLR4_4_111xp11xplb90paid.R.inc(49261);double inv = 1 / (x * x);
            //            1       1        1         1
            // log(x) -  --- - ------ + ------- - -------
            //           2 x   12 x^2   120 x^4   252 x^6
            __CLR4_4_111xp11xplb90paid.R.inc(49262);return FastMath.log(x) - 0.5 / x - inv * ((1.0 / 12) + inv * (1.0 / 120 - inv / 252));
        }

        }__CLR4_4_111xp11xplb90paid.R.inc(49263);return digamma(x + 1) - 1 / x;
    }finally{__CLR4_4_111xp11xplb90paid.R.flushNeeded();}}

    /**
     * Computes the trigamma function of x.
     * This function is derived by taking the derivative of the implementation
     * of digamma.
     *
     * @param x Argument.
     * @return trigamma(x) to within 10-8 relative or absolute error whichever is smaller
     * @see <a href="http://en.wikipedia.org/wiki/Trigamma_function">Trigamma</a>
     * @see Gamma#digamma(double)
     * @since 2.0
     */
    public static double trigamma(double x) {try{__CLR4_4_111xp11xplb90paid.R.inc(49264);
        __CLR4_4_111xp11xplb90paid.R.inc(49265);if ((((x > 0 && x <= S_LIMIT)&&(__CLR4_4_111xp11xplb90paid.R.iget(49266)!=0|true))||(__CLR4_4_111xp11xplb90paid.R.iget(49267)==0&false))) {{
            __CLR4_4_111xp11xplb90paid.R.inc(49268);return 1 / (x * x);
        }

        }__CLR4_4_111xp11xplb90paid.R.inc(49269);if ((((x >= C_LIMIT)&&(__CLR4_4_111xp11xplb90paid.R.iget(49270)!=0|true))||(__CLR4_4_111xp11xplb90paid.R.iget(49271)==0&false))) {{
            __CLR4_4_111xp11xplb90paid.R.inc(49272);double inv = 1 / (x * x);
            //  1    1      1       1       1
            //  - + ---- + ---- - ----- + -----
            //  x      2      3       5       7
            //      2 x    6 x    30 x    42 x
            __CLR4_4_111xp11xplb90paid.R.inc(49273);return 1 / x + inv / 2 + inv / x * (1.0 / 6 - inv * (1.0 / 30 + inv / 42));
        }

        }__CLR4_4_111xp11xplb90paid.R.inc(49274);return trigamma(x + 1) + 1 / (x * x);
    }finally{__CLR4_4_111xp11xplb90paid.R.flushNeeded();}}

    /**
     * <p>
     * Returns the Lanczos approximation used to compute the gamma function.
     * The Lanczos approximation is related to the Gamma function by the
     * following equation
     * <center>
     * {@code gamma(x) = sqrt(2 * pi) / x * (x + g + 0.5) ^ (x + 0.5)
     *                   * exp(-x - g - 0.5) * lanczos(x)},
     * </center>
     * where {@code g} is the Lanczos constant.
     * </p>
     *
     * @param x Argument.
     * @return The Lanczos approximation.
     * @see <a href="http://mathworld.wolfram.com/LanczosApproximation.html">Lanczos Approximation</a>
     * equations (1) through (5), and Paul Godfrey's
     * <a href="http://my.fit.edu/~gabdo/gamma.txt">Note on the computation
     * of the convergent Lanczos complex Gamma approximation</a>
     * @since 3.1
     */
    public static double lanczos(final double x) {try{__CLR4_4_111xp11xplb90paid.R.inc(49275);
        __CLR4_4_111xp11xplb90paid.R.inc(49276);double sum = 0.0;
        __CLR4_4_111xp11xplb90paid.R.inc(49277);for (int i = LANCZOS.length - 1; (((i > 0)&&(__CLR4_4_111xp11xplb90paid.R.iget(49278)!=0|true))||(__CLR4_4_111xp11xplb90paid.R.iget(49279)==0&false)); --i) {{
            __CLR4_4_111xp11xplb90paid.R.inc(49280);sum = sum + (LANCZOS[i] / (x + i));
        }
        }__CLR4_4_111xp11xplb90paid.R.inc(49281);return sum + LANCZOS[0];
    }finally{__CLR4_4_111xp11xplb90paid.R.flushNeeded();}}

    /**
     * Returns the value of 1 / &Gamma;(1 + x) - 1 for -0&#46;5 &le; x &le;
     * 1&#46;5. This implementation is based on the double precision
     * implementation in the <em>NSWC Library of Mathematics Subroutines</em>,
     * {@code DGAM1}.
     *
     * @param x Argument.
     * @return The value of {@code 1.0 / Gamma(1.0 + x) - 1.0}.
     * @throws NumberIsTooSmallException if {@code x < -0.5}
     * @throws NumberIsTooLargeException if {@code x > 1.5}
     * @since 3.1
     */
    public static double invGamma1pm1(final double x) {try{__CLR4_4_111xp11xplb90paid.R.inc(49282);

        __CLR4_4_111xp11xplb90paid.R.inc(49283);if ((((x < -0.5)&&(__CLR4_4_111xp11xplb90paid.R.iget(49284)!=0|true))||(__CLR4_4_111xp11xplb90paid.R.iget(49285)==0&false))) {{
            __CLR4_4_111xp11xplb90paid.R.inc(49286);throw new NumberIsTooSmallException(x, -0.5, true);
        }
        }__CLR4_4_111xp11xplb90paid.R.inc(49287);if ((((x > 1.5)&&(__CLR4_4_111xp11xplb90paid.R.iget(49288)!=0|true))||(__CLR4_4_111xp11xplb90paid.R.iget(49289)==0&false))) {{
            __CLR4_4_111xp11xplb90paid.R.inc(49290);throw new NumberIsTooLargeException(x, 1.5, true);
        }

        }__CLR4_4_111xp11xplb90paid.R.inc(49291);final double ret;
        __CLR4_4_111xp11xplb90paid.R.inc(49292);final double t = (((x <= 0.5 )&&(__CLR4_4_111xp11xplb90paid.R.iget(49293)!=0|true))||(__CLR4_4_111xp11xplb90paid.R.iget(49294)==0&false))? x : (x - 0.5) - 0.5;
        __CLR4_4_111xp11xplb90paid.R.inc(49295);if ((((t < 0.0)&&(__CLR4_4_111xp11xplb90paid.R.iget(49296)!=0|true))||(__CLR4_4_111xp11xplb90paid.R.iget(49297)==0&false))) {{
            __CLR4_4_111xp11xplb90paid.R.inc(49298);final double a = INV_GAMMA1P_M1_A0 + t * INV_GAMMA1P_M1_A1;
            __CLR4_4_111xp11xplb90paid.R.inc(49299);double b = INV_GAMMA1P_M1_B8;
            __CLR4_4_111xp11xplb90paid.R.inc(49300);b = INV_GAMMA1P_M1_B7 + t * b;
            __CLR4_4_111xp11xplb90paid.R.inc(49301);b = INV_GAMMA1P_M1_B6 + t * b;
            __CLR4_4_111xp11xplb90paid.R.inc(49302);b = INV_GAMMA1P_M1_B5 + t * b;
            __CLR4_4_111xp11xplb90paid.R.inc(49303);b = INV_GAMMA1P_M1_B4 + t * b;
            __CLR4_4_111xp11xplb90paid.R.inc(49304);b = INV_GAMMA1P_M1_B3 + t * b;
            __CLR4_4_111xp11xplb90paid.R.inc(49305);b = INV_GAMMA1P_M1_B2 + t * b;
            __CLR4_4_111xp11xplb90paid.R.inc(49306);b = INV_GAMMA1P_M1_B1 + t * b;
            __CLR4_4_111xp11xplb90paid.R.inc(49307);b = 1.0 + t * b;

            __CLR4_4_111xp11xplb90paid.R.inc(49308);double c = INV_GAMMA1P_M1_C13 + t * (a / b);
            __CLR4_4_111xp11xplb90paid.R.inc(49309);c = INV_GAMMA1P_M1_C12 + t * c;
            __CLR4_4_111xp11xplb90paid.R.inc(49310);c = INV_GAMMA1P_M1_C11 + t * c;
            __CLR4_4_111xp11xplb90paid.R.inc(49311);c = INV_GAMMA1P_M1_C10 + t * c;
            __CLR4_4_111xp11xplb90paid.R.inc(49312);c = INV_GAMMA1P_M1_C9 + t * c;
            __CLR4_4_111xp11xplb90paid.R.inc(49313);c = INV_GAMMA1P_M1_C8 + t * c;
            __CLR4_4_111xp11xplb90paid.R.inc(49314);c = INV_GAMMA1P_M1_C7 + t * c;
            __CLR4_4_111xp11xplb90paid.R.inc(49315);c = INV_GAMMA1P_M1_C6 + t * c;
            __CLR4_4_111xp11xplb90paid.R.inc(49316);c = INV_GAMMA1P_M1_C5 + t * c;
            __CLR4_4_111xp11xplb90paid.R.inc(49317);c = INV_GAMMA1P_M1_C4 + t * c;
            __CLR4_4_111xp11xplb90paid.R.inc(49318);c = INV_GAMMA1P_M1_C3 + t * c;
            __CLR4_4_111xp11xplb90paid.R.inc(49319);c = INV_GAMMA1P_M1_C2 + t * c;
            __CLR4_4_111xp11xplb90paid.R.inc(49320);c = INV_GAMMA1P_M1_C1 + t * c;
            __CLR4_4_111xp11xplb90paid.R.inc(49321);c = INV_GAMMA1P_M1_C + t * c;
            __CLR4_4_111xp11xplb90paid.R.inc(49322);if ((((x > 0.5)&&(__CLR4_4_111xp11xplb90paid.R.iget(49323)!=0|true))||(__CLR4_4_111xp11xplb90paid.R.iget(49324)==0&false))) {{
                __CLR4_4_111xp11xplb90paid.R.inc(49325);ret = t * c / x;
            } }else {{
                __CLR4_4_111xp11xplb90paid.R.inc(49326);ret = x * ((c + 0.5) + 0.5);
            }
        }} }else {{
            __CLR4_4_111xp11xplb90paid.R.inc(49327);double p = INV_GAMMA1P_M1_P6;
            __CLR4_4_111xp11xplb90paid.R.inc(49328);p = INV_GAMMA1P_M1_P5 + t * p;
            __CLR4_4_111xp11xplb90paid.R.inc(49329);p = INV_GAMMA1P_M1_P4 + t * p;
            __CLR4_4_111xp11xplb90paid.R.inc(49330);p = INV_GAMMA1P_M1_P3 + t * p;
            __CLR4_4_111xp11xplb90paid.R.inc(49331);p = INV_GAMMA1P_M1_P2 + t * p;
            __CLR4_4_111xp11xplb90paid.R.inc(49332);p = INV_GAMMA1P_M1_P1 + t * p;
            __CLR4_4_111xp11xplb90paid.R.inc(49333);p = INV_GAMMA1P_M1_P0 + t * p;

            __CLR4_4_111xp11xplb90paid.R.inc(49334);double q = INV_GAMMA1P_M1_Q4;
            __CLR4_4_111xp11xplb90paid.R.inc(49335);q = INV_GAMMA1P_M1_Q3 + t * q;
            __CLR4_4_111xp11xplb90paid.R.inc(49336);q = INV_GAMMA1P_M1_Q2 + t * q;
            __CLR4_4_111xp11xplb90paid.R.inc(49337);q = INV_GAMMA1P_M1_Q1 + t * q;
            __CLR4_4_111xp11xplb90paid.R.inc(49338);q = 1.0 + t * q;

            __CLR4_4_111xp11xplb90paid.R.inc(49339);double c = INV_GAMMA1P_M1_C13 + (p / q) * t;
            __CLR4_4_111xp11xplb90paid.R.inc(49340);c = INV_GAMMA1P_M1_C12 + t * c;
            __CLR4_4_111xp11xplb90paid.R.inc(49341);c = INV_GAMMA1P_M1_C11 + t * c;
            __CLR4_4_111xp11xplb90paid.R.inc(49342);c = INV_GAMMA1P_M1_C10 + t * c;
            __CLR4_4_111xp11xplb90paid.R.inc(49343);c = INV_GAMMA1P_M1_C9 + t * c;
            __CLR4_4_111xp11xplb90paid.R.inc(49344);c = INV_GAMMA1P_M1_C8 + t * c;
            __CLR4_4_111xp11xplb90paid.R.inc(49345);c = INV_GAMMA1P_M1_C7 + t * c;
            __CLR4_4_111xp11xplb90paid.R.inc(49346);c = INV_GAMMA1P_M1_C6 + t * c;
            __CLR4_4_111xp11xplb90paid.R.inc(49347);c = INV_GAMMA1P_M1_C5 + t * c;
            __CLR4_4_111xp11xplb90paid.R.inc(49348);c = INV_GAMMA1P_M1_C4 + t * c;
            __CLR4_4_111xp11xplb90paid.R.inc(49349);c = INV_GAMMA1P_M1_C3 + t * c;
            __CLR4_4_111xp11xplb90paid.R.inc(49350);c = INV_GAMMA1P_M1_C2 + t * c;
            __CLR4_4_111xp11xplb90paid.R.inc(49351);c = INV_GAMMA1P_M1_C1 + t * c;
            __CLR4_4_111xp11xplb90paid.R.inc(49352);c = INV_GAMMA1P_M1_C0 + t * c;

            __CLR4_4_111xp11xplb90paid.R.inc(49353);if ((((x > 0.5)&&(__CLR4_4_111xp11xplb90paid.R.iget(49354)!=0|true))||(__CLR4_4_111xp11xplb90paid.R.iget(49355)==0&false))) {{
                __CLR4_4_111xp11xplb90paid.R.inc(49356);ret = (t / x) * ((c - 0.5) - 0.5);
            } }else {{
                __CLR4_4_111xp11xplb90paid.R.inc(49357);ret = x * c;
            }
        }}

        }__CLR4_4_111xp11xplb90paid.R.inc(49358);return ret;
    }finally{__CLR4_4_111xp11xplb90paid.R.flushNeeded();}}

    /**
     * Returns the value of log &Gamma;(1 + x) for -0&#46;5 &le; x &le; 1&#46;5.
     * This implementation is based on the double precision implementation in
     * the <em>NSWC Library of Mathematics Subroutines</em>, {@code DGMLN1}.
     *
     * @param x Argument.
     * @return The value of {@code log(Gamma(1 + x))}.
     * @throws NumberIsTooSmallException if {@code x < -0.5}.
     * @throws NumberIsTooLargeException if {@code x > 1.5}.
     * @since 3.1
     */
    public static double logGamma1p(final double x)
        throws NumberIsTooSmallException, NumberIsTooLargeException {try{__CLR4_4_111xp11xplb90paid.R.inc(49359);

        __CLR4_4_111xp11xplb90paid.R.inc(49360);if ((((x < -0.5)&&(__CLR4_4_111xp11xplb90paid.R.iget(49361)!=0|true))||(__CLR4_4_111xp11xplb90paid.R.iget(49362)==0&false))) {{
            __CLR4_4_111xp11xplb90paid.R.inc(49363);throw new NumberIsTooSmallException(x, -0.5, true);
        }
        }__CLR4_4_111xp11xplb90paid.R.inc(49364);if ((((x > 1.5)&&(__CLR4_4_111xp11xplb90paid.R.iget(49365)!=0|true))||(__CLR4_4_111xp11xplb90paid.R.iget(49366)==0&false))) {{
            __CLR4_4_111xp11xplb90paid.R.inc(49367);throw new NumberIsTooLargeException(x, 1.5, true);
        }

        }__CLR4_4_111xp11xplb90paid.R.inc(49368);return -FastMath.log1p(invGamma1pm1(x));
    }finally{__CLR4_4_111xp11xplb90paid.R.flushNeeded();}}


    /**
     * Returns the value of \u0393(x). Based on the <em>NSWC Library of
     * Mathematics Subroutines</em> double precision implementation,
     * {@code DGAMMA}.
     *
     * @param x Argument.
     * @return the value of {@code Gamma(x)}.
     * @since 3.1
     */
    public static double gamma(final double x) {try{__CLR4_4_111xp11xplb90paid.R.inc(49369);

        __CLR4_4_111xp11xplb90paid.R.inc(49370);if (((((x == FastMath.rint(x)) && (x <= 0.0))&&(__CLR4_4_111xp11xplb90paid.R.iget(49371)!=0|true))||(__CLR4_4_111xp11xplb90paid.R.iget(49372)==0&false))) {{
            __CLR4_4_111xp11xplb90paid.R.inc(49373);return Double.NaN;
        }

        }__CLR4_4_111xp11xplb90paid.R.inc(49374);final double ret;
        __CLR4_4_111xp11xplb90paid.R.inc(49375);final double absX = FastMath.abs(x);
        __CLR4_4_111xp11xplb90paid.R.inc(49376);if ((((absX <= 20.0)&&(__CLR4_4_111xp11xplb90paid.R.iget(49377)!=0|true))||(__CLR4_4_111xp11xplb90paid.R.iget(49378)==0&false))) {{
            __CLR4_4_111xp11xplb90paid.R.inc(49379);if ((((x >= 1.0)&&(__CLR4_4_111xp11xplb90paid.R.iget(49380)!=0|true))||(__CLR4_4_111xp11xplb90paid.R.iget(49381)==0&false))) {{
                /*
                 * From the recurrence relation
                 * Gamma(x) = (x - 1) * ... * (x - n) * Gamma(x - n),
                 * then
                 * Gamma(t) = 1 / [1 + invGamma1pm1(t - 1)],
                 * where t = x - n. This means that t must satisfy
                 * -0.5 <= t - 1 <= 1.5.
                 */
                __CLR4_4_111xp11xplb90paid.R.inc(49382);double prod = 1.0;
                __CLR4_4_111xp11xplb90paid.R.inc(49383);double t = x;
                __CLR4_4_111xp11xplb90paid.R.inc(49384);while ((((t > 2.5)&&(__CLR4_4_111xp11xplb90paid.R.iget(49385)!=0|true))||(__CLR4_4_111xp11xplb90paid.R.iget(49386)==0&false))) {{
                    __CLR4_4_111xp11xplb90paid.R.inc(49387);t = t - 1.0;
                    __CLR4_4_111xp11xplb90paid.R.inc(49388);prod *= t;
                }
                }__CLR4_4_111xp11xplb90paid.R.inc(49389);ret = prod / (1.0 + invGamma1pm1(t - 1.0));
            } }else {{
                /*
                 * From the recurrence relation
                 * Gamma(x) = Gamma(x + n + 1) / [x * (x + 1) * ... * (x + n)]
                 * then
                 * Gamma(x + n + 1) = 1 / [1 + invGamma1pm1(x + n)],
                 * which requires -0.5 <= x + n <= 1.5.
                 */
                __CLR4_4_111xp11xplb90paid.R.inc(49390);double prod = x;
                __CLR4_4_111xp11xplb90paid.R.inc(49391);double t = x;
                __CLR4_4_111xp11xplb90paid.R.inc(49392);while ((((t < -0.5)&&(__CLR4_4_111xp11xplb90paid.R.iget(49393)!=0|true))||(__CLR4_4_111xp11xplb90paid.R.iget(49394)==0&false))) {{
                    __CLR4_4_111xp11xplb90paid.R.inc(49395);t = t + 1.0;
                    __CLR4_4_111xp11xplb90paid.R.inc(49396);prod *= t;
                }
                }__CLR4_4_111xp11xplb90paid.R.inc(49397);ret = 1.0 / (prod * (1.0 + invGamma1pm1(t)));
            }
        }} }else {{
            __CLR4_4_111xp11xplb90paid.R.inc(49398);final double y = absX + LANCZOS_G + 0.5;
            __CLR4_4_111xp11xplb90paid.R.inc(49399);final double gammaAbs = SQRT_TWO_PI / x *
                                    FastMath.pow(y, absX + 0.5) *
                                    FastMath.exp(-y) * lanczos(absX);
            __CLR4_4_111xp11xplb90paid.R.inc(49400);if ((((x > 0.0)&&(__CLR4_4_111xp11xplb90paid.R.iget(49401)!=0|true))||(__CLR4_4_111xp11xplb90paid.R.iget(49402)==0&false))) {{
                __CLR4_4_111xp11xplb90paid.R.inc(49403);ret = gammaAbs;
            } }else {{
                /*
                 * From the reflection formula
                 * Gamma(x) * Gamma(1 - x) * sin(pi * x) = pi,
                 * and the recurrence relation
                 * Gamma(1 - x) = -x * Gamma(-x),
                 * it is found
                 * Gamma(x) = -pi / [x * sin(pi * x) * Gamma(-x)].
                 */
                __CLR4_4_111xp11xplb90paid.R.inc(49404);ret = -FastMath.PI /
                      (x * FastMath.sin(FastMath.PI * x) * gammaAbs);
            }
        }}
        }__CLR4_4_111xp11xplb90paid.R.inc(49405);return ret;
    }finally{__CLR4_4_111xp11xplb90paid.R.flushNeeded();}}
}
