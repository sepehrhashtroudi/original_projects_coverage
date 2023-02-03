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

import org.apache.commons.math3.exception.NumberIsTooSmallException;
import org.apache.commons.math3.exception.OutOfRangeException;
import org.apache.commons.math3.util.ContinuedFraction;
import org.apache.commons.math3.util.FastMath;

/**
 * <p>
 * This is a utility class that provides computation methods related to the
 * Beta family of functions.
 * </p>
 * <p>
 * Implementation of {@link #logBeta(double, double)} is based on the
 * algorithms described in
 * <ul>
 * <li><a href="http://dx.doi.org/10.1145/22721.23109">Didonato and Morris
 *     (1986)</a>, <em>Computation of the Incomplete Gamma Function Ratios
 *     and their Inverse</em>, TOMS 12(4), 377-393,</li>
 * <li><a href="http://dx.doi.org/10.1145/131766.131776">Didonato and Morris
 *     (1992)</a>, <em>Algorithm 708: Significant Digit Computation of the
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
 *
 * @version $Id$
 */
public class Beta {public static class __CLR4_4_111oy11oylb90pahg{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,49052,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /** Maximum allowed numerical error. */
    private static final double DEFAULT_EPSILON = 1E-14;

    /** The constant value of \u00bdlog 2\u03c0. */
    private static final double HALF_LOG_TWO_PI = .9189385332046727;

    /**
     * <p>
     * The coefficients of the series expansion of the \u0394 function. This function
     * is defined as follows
     * </p>
     * <center>\u0394(x) = log \u0393(x) - (x - 0.5) log a + a - 0.5 log 2\u03c0,</center>
     * <p>
     * see equation (23) in Didonato and Morris (1992). The series expansion,
     * which applies for x \u2265 10, reads
     * </p>
     * <pre>
     *                 14
     *                ====
     *             1  \                2 n
     *     \u0394(x) = ---  >    d  (10 / x)
     *             x  /      n
     *                ====
     *                n = 0
     * <pre>
     */
    private static final double[] DELTA = {
        .833333333333333333333333333333E-01,
        -.277777777777777777777777752282E-04,
        .793650793650793650791732130419E-07,
        -.595238095238095232389839236182E-09,
        .841750841750832853294451671990E-11,
        -.191752691751854612334149171243E-12,
        .641025640510325475730918472625E-14,
        -.295506514125338232839867823991E-15,
        .179643716359402238723287696452E-16,
        -.139228964661627791231203060395E-17,
        .133802855014020915603275339093E-18,
        -.154246009867966094273710216533E-19,
        .197701992980957427278370133333E-20,
        -.234065664793997056856992426667E-21,
        .171348014966398575409015466667E-22
    };

    /**
     * Default constructor.  Prohibit instantiation.
     */
    private Beta() {try{__CLR4_4_111oy11oylb90pahg.R.inc(48850);}finally{__CLR4_4_111oy11oylb90pahg.R.flushNeeded();}}

    /**
     * Returns the
     * <a href="http://mathworld.wolfram.com/RegularizedBetaFunction.html">
     * regularized beta function</a> I(x, a, b).
     *
     * @param x Value.
     * @param a Parameter {@code a}.
     * @param b Parameter {@code b}.
     * @return the regularized beta function I(x, a, b).
     * @throws org.apache.commons.math3.exception.MaxCountExceededException
     * if the algorithm fails to converge.
     */
    public static double regularizedBeta(double x, double a, double b) {try{__CLR4_4_111oy11oylb90pahg.R.inc(48851);
        __CLR4_4_111oy11oylb90pahg.R.inc(48852);return regularizedBeta(x, a, b, DEFAULT_EPSILON, Integer.MAX_VALUE);
    }finally{__CLR4_4_111oy11oylb90pahg.R.flushNeeded();}}

    /**
     * Returns the
     * <a href="http://mathworld.wolfram.com/RegularizedBetaFunction.html">
     * regularized beta function</a> I(x, a, b).
     *
     * @param x Value.
     * @param a Parameter {@code a}.
     * @param b Parameter {@code b}.
     * @param epsilon When the absolute value of the nth item in the
     * series is less than epsilon the approximation ceases to calculate
     * further elements in the series.
     * @return the regularized beta function I(x, a, b)
     * @throws org.apache.commons.math3.exception.MaxCountExceededException
     * if the algorithm fails to converge.
     */
    public static double regularizedBeta(double x,
                                         double a, double b,
                                         double epsilon) {try{__CLR4_4_111oy11oylb90pahg.R.inc(48853);
        __CLR4_4_111oy11oylb90pahg.R.inc(48854);return regularizedBeta(x, a, b, epsilon, Integer.MAX_VALUE);
    }finally{__CLR4_4_111oy11oylb90pahg.R.flushNeeded();}}

    /**
     * Returns the regularized beta function I(x, a, b).
     *
     * @param x the value.
     * @param a Parameter {@code a}.
     * @param b Parameter {@code b}.
     * @param maxIterations Maximum number of "iterations" to complete.
     * @return the regularized beta function I(x, a, b)
     * @throws org.apache.commons.math3.exception.MaxCountExceededException
     * if the algorithm fails to converge.
     */
    public static double regularizedBeta(double x,
                                         double a, double b,
                                         int maxIterations) {try{__CLR4_4_111oy11oylb90pahg.R.inc(48855);
        __CLR4_4_111oy11oylb90pahg.R.inc(48856);return regularizedBeta(x, a, b, DEFAULT_EPSILON, maxIterations);
    }finally{__CLR4_4_111oy11oylb90pahg.R.flushNeeded();}}

    /**
     * Returns the regularized beta function I(x, a, b).
     *
     * The implementation of this method is based on:
     * <ul>
     * <li>
     * <a href="http://mathworld.wolfram.com/RegularizedBetaFunction.html">
     * Regularized Beta Function</a>.</li>
     * <li>
     * <a href="http://functions.wolfram.com/06.21.10.0001.01">
     * Regularized Beta Function</a>.</li>
     * </ul>
     *
     * @param x the value.
     * @param a Parameter {@code a}.
     * @param b Parameter {@code b}.
     * @param epsilon When the absolute value of the nth item in the
     * series is less than epsilon the approximation ceases to calculate
     * further elements in the series.
     * @param maxIterations Maximum number of "iterations" to complete.
     * @return the regularized beta function I(x, a, b)
     * @throws org.apache.commons.math3.exception.MaxCountExceededException
     * if the algorithm fails to converge.
     */
    public static double regularizedBeta(double x,
                                         final double a, final double b,
                                         double epsilon, int maxIterations) {try{__CLR4_4_111oy11oylb90pahg.R.inc(48857);
        __CLR4_4_111oy11oylb90pahg.R.inc(48858);double ret;

        __CLR4_4_111oy11oylb90pahg.R.inc(48859);if ((((Double.isNaN(x) ||
            Double.isNaN(a) ||
            Double.isNaN(b) ||
            x < 0 ||
            x > 1 ||
            a <= 0.0 ||
            b <= 0.0)&&(__CLR4_4_111oy11oylb90pahg.R.iget(48860)!=0|true))||(__CLR4_4_111oy11oylb90pahg.R.iget(48861)==0&false))) {{
            __CLR4_4_111oy11oylb90pahg.R.inc(48862);ret = Double.NaN;
        } }else {__CLR4_4_111oy11oylb90pahg.R.inc(48863);if ((((x > (a + 1.0) / (a + b + 2.0))&&(__CLR4_4_111oy11oylb90pahg.R.iget(48864)!=0|true))||(__CLR4_4_111oy11oylb90pahg.R.iget(48865)==0&false))) {{
            __CLR4_4_111oy11oylb90pahg.R.inc(48866);ret = 1.0 - regularizedBeta(1.0 - x, b, a, epsilon, maxIterations);
        } }else {{
            __CLR4_4_111oy11oylb90pahg.R.inc(48867);ContinuedFraction fraction = new ContinuedFraction() {

                @Override
                protected double getB(int n, double x) {try{__CLR4_4_111oy11oylb90pahg.R.inc(48868);
                    __CLR4_4_111oy11oylb90pahg.R.inc(48869);double ret;
                    __CLR4_4_111oy11oylb90pahg.R.inc(48870);double m;
                    __CLR4_4_111oy11oylb90pahg.R.inc(48871);if ((((n % 2 == 0)&&(__CLR4_4_111oy11oylb90pahg.R.iget(48872)!=0|true))||(__CLR4_4_111oy11oylb90pahg.R.iget(48873)==0&false))) {{ // even
                        __CLR4_4_111oy11oylb90pahg.R.inc(48874);m = n / 2.0;
                        __CLR4_4_111oy11oylb90pahg.R.inc(48875);ret = (m * (b - m) * x) /
                            ((a + (2 * m) - 1) * (a + (2 * m)));
                    } }else {{
                        __CLR4_4_111oy11oylb90pahg.R.inc(48876);m = (n - 1.0) / 2.0;
                        __CLR4_4_111oy11oylb90pahg.R.inc(48877);ret = -((a + m) * (a + b + m) * x) /
                                ((a + (2 * m)) * (a + (2 * m) + 1.0));
                    }
                    }__CLR4_4_111oy11oylb90pahg.R.inc(48878);return ret;
                }finally{__CLR4_4_111oy11oylb90pahg.R.flushNeeded();}}

                @Override
                protected double getA(int n, double x) {try{__CLR4_4_111oy11oylb90pahg.R.inc(48879);
                    __CLR4_4_111oy11oylb90pahg.R.inc(48880);return 1.0;
                }finally{__CLR4_4_111oy11oylb90pahg.R.flushNeeded();}}
            };
            __CLR4_4_111oy11oylb90pahg.R.inc(48881);ret = FastMath.exp((a * FastMath.log(x)) + (b * FastMath.log(1.0 - x)) -
                FastMath.log(a) - logBeta(a, b)) *
                1.0 / fraction.evaluate(x, epsilon, maxIterations);
        }

        }}__CLR4_4_111oy11oylb90pahg.R.inc(48882);return ret;
    }finally{__CLR4_4_111oy11oylb90pahg.R.flushNeeded();}}

    /**
     * Returns the natural logarithm of the beta function B(a, b).
     *
     * The implementation of this method is based on:
     * <ul>
     * <li><a href="http://mathworld.wolfram.com/BetaFunction.html">
     * Beta Function</a>, equation (1).</li>
     * </ul>
     *
     * @param a Parameter {@code a}.
     * @param b Parameter {@code b}.
     * @param epsilon This parameter is ignored.
     * @param maxIterations This parameter is ignored.
     * @return log(B(a, b)).
     * @deprecated as of version 3.1, this method is deprecated as the
     * computation of the beta function is no longer iterative; it will be
     * removed in version 4.0. Current implementation of this method
     * internally calls {@link #logBeta(double, double)}.
     */
    @Deprecated
    public static double logBeta(double a, double b,
                                 double epsilon,
                                 int maxIterations) {try{__CLR4_4_111oy11oylb90pahg.R.inc(48883);

        __CLR4_4_111oy11oylb90pahg.R.inc(48884);return logBeta(a, b);
    }finally{__CLR4_4_111oy11oylb90pahg.R.flushNeeded();}}


    /**
     * Returns the value of log \u0393(a + b) for 1 \u2264 a, b \u2264 2. Based on the
     * <em>NSWC Library of Mathematics Subroutines</em> double precision
     * implementation, {@code DGSMLN}. In {@link BetaTest#testLogGammaSum()},
     * this private method is accessed through reflection.
     *
     * @param a First argument.
     * @param b Second argument.
     * @return the value of {@code log(Gamma(a + b))}.
     * @throws OutOfRangeException if {@code a} or {@code b} is lower than
     * {@code 1.0} or greater than {@code 2.0}.
     */
    private static double logGammaSum(final double a, final double b)
        throws OutOfRangeException {try{__CLR4_4_111oy11oylb90pahg.R.inc(48885);

        __CLR4_4_111oy11oylb90pahg.R.inc(48886);if (((((a < 1.0) || (a > 2.0))&&(__CLR4_4_111oy11oylb90pahg.R.iget(48887)!=0|true))||(__CLR4_4_111oy11oylb90pahg.R.iget(48888)==0&false))) {{
            __CLR4_4_111oy11oylb90pahg.R.inc(48889);throw new OutOfRangeException(a, 1.0, 2.0);
        }
        }__CLR4_4_111oy11oylb90pahg.R.inc(48890);if (((((b < 1.0) || (b > 2.0))&&(__CLR4_4_111oy11oylb90pahg.R.iget(48891)!=0|true))||(__CLR4_4_111oy11oylb90pahg.R.iget(48892)==0&false))) {{
            __CLR4_4_111oy11oylb90pahg.R.inc(48893);throw new OutOfRangeException(b, 1.0, 2.0);
        }

        }__CLR4_4_111oy11oylb90pahg.R.inc(48894);final double x = (a - 1.0) + (b - 1.0);
        __CLR4_4_111oy11oylb90pahg.R.inc(48895);if ((((x <= 0.5)&&(__CLR4_4_111oy11oylb90pahg.R.iget(48896)!=0|true))||(__CLR4_4_111oy11oylb90pahg.R.iget(48897)==0&false))) {{
            __CLR4_4_111oy11oylb90pahg.R.inc(48898);return Gamma.logGamma1p(1.0 + x);
        } }else {__CLR4_4_111oy11oylb90pahg.R.inc(48899);if ((((x <= 1.5)&&(__CLR4_4_111oy11oylb90pahg.R.iget(48900)!=0|true))||(__CLR4_4_111oy11oylb90pahg.R.iget(48901)==0&false))) {{
            __CLR4_4_111oy11oylb90pahg.R.inc(48902);return Gamma.logGamma1p(x) + FastMath.log1p(x);
        } }else {{
            __CLR4_4_111oy11oylb90pahg.R.inc(48903);return Gamma.logGamma1p(x - 1.0) + FastMath.log(x * (1.0 + x));
        }
    }}}finally{__CLR4_4_111oy11oylb90pahg.R.flushNeeded();}}

    /**
     * Returns the value of log[\u0393(b) / \u0393(a + b)] for a \u2265 0 and b \u2265 10. Based on
     * the <em>NSWC Library of Mathematics Subroutines</em> double precision
     * implementation, {@code DLGDIV}. In
     * {@link BetaTest#testLogGammaMinusLogGammaSum()}, this private method is
     * accessed through reflection.
     *
     * @param a First argument.
     * @param b Second argument.
     * @return the value of {@code log(Gamma(b) / Gamma(a + b))}.
     * @throws NumberIsTooSmallException if {@code a < 0.0} or {@code b < 10.0}.
     */
    private static double logGammaMinusLogGammaSum(final double a,
                                                   final double b)
        throws NumberIsTooSmallException {try{__CLR4_4_111oy11oylb90pahg.R.inc(48904);

        __CLR4_4_111oy11oylb90pahg.R.inc(48905);if ((((a < 0.0)&&(__CLR4_4_111oy11oylb90pahg.R.iget(48906)!=0|true))||(__CLR4_4_111oy11oylb90pahg.R.iget(48907)==0&false))) {{
            __CLR4_4_111oy11oylb90pahg.R.inc(48908);throw new NumberIsTooSmallException(a, 0.0, true);
        }
        }__CLR4_4_111oy11oylb90pahg.R.inc(48909);if ((((b < 10.0)&&(__CLR4_4_111oy11oylb90pahg.R.iget(48910)!=0|true))||(__CLR4_4_111oy11oylb90pahg.R.iget(48911)==0&false))) {{
            __CLR4_4_111oy11oylb90pahg.R.inc(48912);throw new NumberIsTooSmallException(b, 10.0, true);
        }

        /*
         * d = a + b - 0.5
         */
        }__CLR4_4_111oy11oylb90pahg.R.inc(48913);final double d;
        __CLR4_4_111oy11oylb90pahg.R.inc(48914);final double w;
        __CLR4_4_111oy11oylb90pahg.R.inc(48915);if ((((a <= b)&&(__CLR4_4_111oy11oylb90pahg.R.iget(48916)!=0|true))||(__CLR4_4_111oy11oylb90pahg.R.iget(48917)==0&false))) {{
            __CLR4_4_111oy11oylb90pahg.R.inc(48918);d = b + (a - 0.5);
            __CLR4_4_111oy11oylb90pahg.R.inc(48919);w = deltaMinusDeltaSum(a, b);
        } }else {{
            __CLR4_4_111oy11oylb90pahg.R.inc(48920);d = a + (b - 0.5);
            __CLR4_4_111oy11oylb90pahg.R.inc(48921);w = deltaMinusDeltaSum(b, a);
        }

        }__CLR4_4_111oy11oylb90pahg.R.inc(48922);final double u = d * FastMath.log1p(a / b);
        __CLR4_4_111oy11oylb90pahg.R.inc(48923);final double v = a * (FastMath.log(b) - 1.0);

        __CLR4_4_111oy11oylb90pahg.R.inc(48924);return (((u <= v )&&(__CLR4_4_111oy11oylb90pahg.R.iget(48925)!=0|true))||(__CLR4_4_111oy11oylb90pahg.R.iget(48926)==0&false))? (w - u) - v : (w - v) - u;
    }finally{__CLR4_4_111oy11oylb90pahg.R.flushNeeded();}}

    /**
     * Returns the value of \u0394(b) - \u0394(a + b), with 0 \u2264 a \u2264 b and b \u2265 10. Based
     * on equations (26), (27) and (28) in Didonato and Morris (1992).
     *
     * @param a First argument.
     * @param b Second argument.
     * @return the value of {@code Delta(b) - Delta(a + b)}
     * @throws OutOfRangeException if {@code a < 0} or {@code a > b}
     * @throws NumberIsTooSmallException if {@code b < 10}
     */
    private static double deltaMinusDeltaSum(final double a,
                                             final double b)
        throws OutOfRangeException, NumberIsTooSmallException {try{__CLR4_4_111oy11oylb90pahg.R.inc(48927);

        __CLR4_4_111oy11oylb90pahg.R.inc(48928);if (((((a < 0) || (a > b))&&(__CLR4_4_111oy11oylb90pahg.R.iget(48929)!=0|true))||(__CLR4_4_111oy11oylb90pahg.R.iget(48930)==0&false))) {{
            __CLR4_4_111oy11oylb90pahg.R.inc(48931);throw new OutOfRangeException(a, 0, b);
        }
        }__CLR4_4_111oy11oylb90pahg.R.inc(48932);if ((((b < 10)&&(__CLR4_4_111oy11oylb90pahg.R.iget(48933)!=0|true))||(__CLR4_4_111oy11oylb90pahg.R.iget(48934)==0&false))) {{
            __CLR4_4_111oy11oylb90pahg.R.inc(48935);throw new NumberIsTooSmallException(b, 10, true);
        }

        }__CLR4_4_111oy11oylb90pahg.R.inc(48936);final double h = a / b;
        __CLR4_4_111oy11oylb90pahg.R.inc(48937);final double p = h / (1.0 + h);
        __CLR4_4_111oy11oylb90pahg.R.inc(48938);final double q = 1.0 / (1.0 + h);
        __CLR4_4_111oy11oylb90pahg.R.inc(48939);final double q2 = q * q;
        /*
         * s[i] = 1 + q + ... - q**(2 * i)
         */
        __CLR4_4_111oy11oylb90pahg.R.inc(48940);final double[] s = new double[DELTA.length];
        __CLR4_4_111oy11oylb90pahg.R.inc(48941);s[0] = 1.0;
        __CLR4_4_111oy11oylb90pahg.R.inc(48942);for (int i = 1; (((i < s.length)&&(__CLR4_4_111oy11oylb90pahg.R.iget(48943)!=0|true))||(__CLR4_4_111oy11oylb90pahg.R.iget(48944)==0&false)); i++) {{
            __CLR4_4_111oy11oylb90pahg.R.inc(48945);s[i] = 1.0 + (q + q2 * s[i - 1]);
        }
        /*
         * w = Delta(b) - Delta(a + b)
         */
        }__CLR4_4_111oy11oylb90pahg.R.inc(48946);final double sqrtT = 10.0 / b;
        __CLR4_4_111oy11oylb90pahg.R.inc(48947);final double t = sqrtT * sqrtT;
        __CLR4_4_111oy11oylb90pahg.R.inc(48948);double w = DELTA[DELTA.length - 1] * s[s.length - 1];
        __CLR4_4_111oy11oylb90pahg.R.inc(48949);for (int i = DELTA.length - 2; (((i >= 0)&&(__CLR4_4_111oy11oylb90pahg.R.iget(48950)!=0|true))||(__CLR4_4_111oy11oylb90pahg.R.iget(48951)==0&false)); i--) {{
            __CLR4_4_111oy11oylb90pahg.R.inc(48952);w = t * w + DELTA[i] * s[i];
        }
        }__CLR4_4_111oy11oylb90pahg.R.inc(48953);return w * p / b;
    }finally{__CLR4_4_111oy11oylb90pahg.R.flushNeeded();}}

    /**
     * Returns the value of \u0394(p) + \u0394(q) - \u0394(p + q), with p, q \u2265 10. Based on
     * the <em>NSWC Library of Mathematics Subroutines</em> double precision
     * implementation, {@code DBCORR}. In
     * {@link BetaTest#testSumDeltaMinusDeltaSum()}, this private method is
     * accessed through reflection.
     *
     * @param p First argument.
     * @param q Second argument.
     * @return the value of {@code Delta(p) + Delta(q) - Delta(p + q)}.
     * @throws NumberIsTooSmallException if {@code p < 10.0} or {@code q < 10.0}.
     */
    private static double sumDeltaMinusDeltaSum(final double p,
                                                final double q) {try{__CLR4_4_111oy11oylb90pahg.R.inc(48954);

        __CLR4_4_111oy11oylb90pahg.R.inc(48955);if ((((p < 10.0)&&(__CLR4_4_111oy11oylb90pahg.R.iget(48956)!=0|true))||(__CLR4_4_111oy11oylb90pahg.R.iget(48957)==0&false))) {{
            __CLR4_4_111oy11oylb90pahg.R.inc(48958);throw new NumberIsTooSmallException(p, 10.0, true);
        }
        }__CLR4_4_111oy11oylb90pahg.R.inc(48959);if ((((q < 10.0)&&(__CLR4_4_111oy11oylb90pahg.R.iget(48960)!=0|true))||(__CLR4_4_111oy11oylb90pahg.R.iget(48961)==0&false))) {{
            __CLR4_4_111oy11oylb90pahg.R.inc(48962);throw new NumberIsTooSmallException(q, 10.0, true);
        }

        }__CLR4_4_111oy11oylb90pahg.R.inc(48963);final double a = FastMath.min(p, q);
        __CLR4_4_111oy11oylb90pahg.R.inc(48964);final double b = FastMath.max(p, q);
        __CLR4_4_111oy11oylb90pahg.R.inc(48965);final double sqrtT = 10.0 / a;
        __CLR4_4_111oy11oylb90pahg.R.inc(48966);final double t = sqrtT * sqrtT;
        __CLR4_4_111oy11oylb90pahg.R.inc(48967);double z = DELTA[DELTA.length - 1];
        __CLR4_4_111oy11oylb90pahg.R.inc(48968);for (int i = DELTA.length - 2; (((i >= 0)&&(__CLR4_4_111oy11oylb90pahg.R.iget(48969)!=0|true))||(__CLR4_4_111oy11oylb90pahg.R.iget(48970)==0&false)); i--) {{
            __CLR4_4_111oy11oylb90pahg.R.inc(48971);z = t * z + DELTA[i];
        }
        }__CLR4_4_111oy11oylb90pahg.R.inc(48972);return z / a + deltaMinusDeltaSum(a, b);
    }finally{__CLR4_4_111oy11oylb90pahg.R.flushNeeded();}}

    /**
     * Returns the value of log B(p, q) for 0 \u2264 x \u2264 1 and p, q > 0. Based on the
     * <em>NSWC Library of Mathematics Subroutines</em> implementation,
     * {@code DBETLN}.
     *
     * @param p First argument.
     * @param q Second argument.
     * @return the value of {@code log(Beta(p, q))}, {@code NaN} if
     * {@code p <= 0} or {@code q <= 0}.
     */
    public static double logBeta(final double p, final double q) {try{__CLR4_4_111oy11oylb90pahg.R.inc(48973);
        __CLR4_4_111oy11oylb90pahg.R.inc(48974);if ((((Double.isNaN(p) || Double.isNaN(q) || (p <= 0.0) || (q <= 0.0))&&(__CLR4_4_111oy11oylb90pahg.R.iget(48975)!=0|true))||(__CLR4_4_111oy11oylb90pahg.R.iget(48976)==0&false))) {{
            __CLR4_4_111oy11oylb90pahg.R.inc(48977);return Double.NaN;
        }

        }__CLR4_4_111oy11oylb90pahg.R.inc(48978);final double a = FastMath.min(p, q);
        __CLR4_4_111oy11oylb90pahg.R.inc(48979);final double b = FastMath.max(p, q);
        __CLR4_4_111oy11oylb90pahg.R.inc(48980);if ((((a >= 10.0)&&(__CLR4_4_111oy11oylb90pahg.R.iget(48981)!=0|true))||(__CLR4_4_111oy11oylb90pahg.R.iget(48982)==0&false))) {{
            __CLR4_4_111oy11oylb90pahg.R.inc(48983);final double w = sumDeltaMinusDeltaSum(a, b);
            __CLR4_4_111oy11oylb90pahg.R.inc(48984);final double h = a / b;
            __CLR4_4_111oy11oylb90pahg.R.inc(48985);final double c = h / (1.0 + h);
            __CLR4_4_111oy11oylb90pahg.R.inc(48986);final double u = -(a - 0.5) * FastMath.log(c);
            __CLR4_4_111oy11oylb90pahg.R.inc(48987);final double v = b * FastMath.log1p(h);
            __CLR4_4_111oy11oylb90pahg.R.inc(48988);if ((((u <= v)&&(__CLR4_4_111oy11oylb90pahg.R.iget(48989)!=0|true))||(__CLR4_4_111oy11oylb90pahg.R.iget(48990)==0&false))) {{
                __CLR4_4_111oy11oylb90pahg.R.inc(48991);return (((-0.5 * FastMath.log(b) + HALF_LOG_TWO_PI) + w) - u) - v;
            } }else {{
                __CLR4_4_111oy11oylb90pahg.R.inc(48992);return (((-0.5 * FastMath.log(b) + HALF_LOG_TWO_PI) + w) - v) - u;
            }
        }} }else {__CLR4_4_111oy11oylb90pahg.R.inc(48993);if ((((a > 2.0)&&(__CLR4_4_111oy11oylb90pahg.R.iget(48994)!=0|true))||(__CLR4_4_111oy11oylb90pahg.R.iget(48995)==0&false))) {{
            __CLR4_4_111oy11oylb90pahg.R.inc(48996);if ((((b > 1000.0)&&(__CLR4_4_111oy11oylb90pahg.R.iget(48997)!=0|true))||(__CLR4_4_111oy11oylb90pahg.R.iget(48998)==0&false))) {{
                __CLR4_4_111oy11oylb90pahg.R.inc(48999);final int n = (int) FastMath.floor(a - 1.0);
                __CLR4_4_111oy11oylb90pahg.R.inc(49000);double prod = 1.0;
                __CLR4_4_111oy11oylb90pahg.R.inc(49001);double ared = a;
                __CLR4_4_111oy11oylb90pahg.R.inc(49002);for (int i = 0; (((i < n)&&(__CLR4_4_111oy11oylb90pahg.R.iget(49003)!=0|true))||(__CLR4_4_111oy11oylb90pahg.R.iget(49004)==0&false)); i++) {{
                    __CLR4_4_111oy11oylb90pahg.R.inc(49005);ared -= 1.0;
                    __CLR4_4_111oy11oylb90pahg.R.inc(49006);prod *= ared / (1.0 + ared / b);
                }
                }__CLR4_4_111oy11oylb90pahg.R.inc(49007);return (FastMath.log(prod) - n * FastMath.log(b)) +
                        (Gamma.logGamma(ared) +
                         logGammaMinusLogGammaSum(ared, b));
            } }else {{
                __CLR4_4_111oy11oylb90pahg.R.inc(49008);double prod1 = 1.0;
                __CLR4_4_111oy11oylb90pahg.R.inc(49009);double ared = a;
                __CLR4_4_111oy11oylb90pahg.R.inc(49010);while ((((ared > 2.0)&&(__CLR4_4_111oy11oylb90pahg.R.iget(49011)!=0|true))||(__CLR4_4_111oy11oylb90pahg.R.iget(49012)==0&false))) {{
                    __CLR4_4_111oy11oylb90pahg.R.inc(49013);ared -= 1.0;
                    __CLR4_4_111oy11oylb90pahg.R.inc(49014);final double h = ared / b;
                    __CLR4_4_111oy11oylb90pahg.R.inc(49015);prod1 *= h / (1.0 + h);
                }
                }__CLR4_4_111oy11oylb90pahg.R.inc(49016);if ((((b < 10.0)&&(__CLR4_4_111oy11oylb90pahg.R.iget(49017)!=0|true))||(__CLR4_4_111oy11oylb90pahg.R.iget(49018)==0&false))) {{
                    __CLR4_4_111oy11oylb90pahg.R.inc(49019);double prod2 = 1.0;
                    __CLR4_4_111oy11oylb90pahg.R.inc(49020);double bred = b;
                    __CLR4_4_111oy11oylb90pahg.R.inc(49021);while ((((bred > 2.0)&&(__CLR4_4_111oy11oylb90pahg.R.iget(49022)!=0|true))||(__CLR4_4_111oy11oylb90pahg.R.iget(49023)==0&false))) {{
                        __CLR4_4_111oy11oylb90pahg.R.inc(49024);bred -= 1.0;
                        __CLR4_4_111oy11oylb90pahg.R.inc(49025);prod2 *= bred / (ared + bred);
                    }
                    }__CLR4_4_111oy11oylb90pahg.R.inc(49026);return FastMath.log(prod1) +
                           FastMath.log(prod2) +
                           (Gamma.logGamma(ared) +
                           (Gamma.logGamma(bred) -
                            logGammaSum(ared, bred)));
                } }else {{
                    __CLR4_4_111oy11oylb90pahg.R.inc(49027);return FastMath.log(prod1) +
                           Gamma.logGamma(ared) +
                           logGammaMinusLogGammaSum(ared, b);
                }
            }}
        }} }else {__CLR4_4_111oy11oylb90pahg.R.inc(49028);if ((((a >= 1.0)&&(__CLR4_4_111oy11oylb90pahg.R.iget(49029)!=0|true))||(__CLR4_4_111oy11oylb90pahg.R.iget(49030)==0&false))) {{
            __CLR4_4_111oy11oylb90pahg.R.inc(49031);if ((((b > 2.0)&&(__CLR4_4_111oy11oylb90pahg.R.iget(49032)!=0|true))||(__CLR4_4_111oy11oylb90pahg.R.iget(49033)==0&false))) {{
                __CLR4_4_111oy11oylb90pahg.R.inc(49034);if ((((b < 10.0)&&(__CLR4_4_111oy11oylb90pahg.R.iget(49035)!=0|true))||(__CLR4_4_111oy11oylb90pahg.R.iget(49036)==0&false))) {{
                    __CLR4_4_111oy11oylb90pahg.R.inc(49037);double prod = 1.0;
                    __CLR4_4_111oy11oylb90pahg.R.inc(49038);double bred = b;
                    __CLR4_4_111oy11oylb90pahg.R.inc(49039);while ((((bred > 2.0)&&(__CLR4_4_111oy11oylb90pahg.R.iget(49040)!=0|true))||(__CLR4_4_111oy11oylb90pahg.R.iget(49041)==0&false))) {{
                        __CLR4_4_111oy11oylb90pahg.R.inc(49042);bred -= 1.0;
                        __CLR4_4_111oy11oylb90pahg.R.inc(49043);prod *= bred / (a + bred);
                    }
                    }__CLR4_4_111oy11oylb90pahg.R.inc(49044);return FastMath.log(prod) +
                           (Gamma.logGamma(a) +
                            (Gamma.logGamma(bred) -
                             logGammaSum(a, bred)));
                } }else {{
                    __CLR4_4_111oy11oylb90pahg.R.inc(49045);return Gamma.logGamma(a) +
                           logGammaMinusLogGammaSum(a, b);
                }
            }} }else {{
                __CLR4_4_111oy11oylb90pahg.R.inc(49046);return Gamma.logGamma(a) +
                       Gamma.logGamma(b) -
                       logGammaSum(a, b);
            }
        }} }else {{
            __CLR4_4_111oy11oylb90pahg.R.inc(49047);if ((((b >= 10.0)&&(__CLR4_4_111oy11oylb90pahg.R.iget(49048)!=0|true))||(__CLR4_4_111oy11oylb90pahg.R.iget(49049)==0&false))) {{
                __CLR4_4_111oy11oylb90pahg.R.inc(49050);return Gamma.logGamma(a) +
                       logGammaMinusLogGammaSum(a, b);
            } }else {{
                // The following command is the original NSWC implementation.
                // return Gamma.logGamma(a) +
                // (Gamma.logGamma(b) - Gamma.logGamma(a + b));
                // The following command turns out to be more accurate.
                __CLR4_4_111oy11oylb90pahg.R.inc(49051);return FastMath.log(Gamma.gamma(a) * Gamma.gamma(b) /
                                    Gamma.gamma(a + b));
            }
        }}
    }}}}finally{__CLR4_4_111oy11oylb90pahg.R.flushNeeded();}}
}
