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
package org.apache.commons.math3.util;

import java.io.PrintStream;

/**
 * Faster, more accurate, portable alternative to {@link Math} and
 * {@link StrictMath} for large scale computation.
 * <p>
 * FastMath is a drop-in replacement for both Math and StrictMath. This
 * means that for any method in Math (say {@code Math.sin(x)} or
 * {@code Math.cbrt(y)}), user can directly change the class and use the
 * methods as is (using {@code FastMath.sin(x)} or {@code FastMath.cbrt(y)}
 * in the previous example).
 * </p>
 * <p>
 * FastMath speed is achieved by relying heavily on optimizing compilers
 * to native code present in many JVMs today and use of large tables.
 * The larger tables are lazily initialised on first use, so that the setup
 * time does not penalise methods that don't need them.
 * </p>
 * <p>
 * Note that FastMath is
 * extensively used inside Apache Commons Math, so by calling some algorithms,
 * the overhead when the the tables need to be intialised will occur
 * regardless of the end-user calling FastMath methods directly or not.
 * Performance figures for a specific JVM and hardware can be evaluated by
 * running the FastMathTestPerformance tests in the test directory of the source
 * distribution.
 * </p>
 * <p>
 * FastMath accuracy should be mostly independent of the JVM as it relies only
 * on IEEE-754 basic operations and on embedded tables. Almost all operations
 * are accurate to about 0.5 ulp throughout the domain range. This statement,
 * of course is only a rough global observed behavior, it is <em>not</em> a
 * guarantee for <em>every</em> double numbers input (see William Kahan's <a
 * href="http://en.wikipedia.org/wiki/Rounding#The_table-maker.27s_dilemma">Table
 * Maker's Dilemma</a>).
 * </p>
 * <p>
 * FastMath additionally implements the following methods not found in Math/StrictMath:
 * <ul>
 * <li>{@link #asinh(double)}</li>
 * <li>{@link #acosh(double)}</li>
 * <li>{@link #atanh(double)}</li>
 * </ul>
 * The following methods are found in Math/StrictMath since 1.6 only, they are provided
 * by FastMath even in 1.5 Java virtual machines
 * <ul>
 * <li>{@link #copySign(double, double)}</li>
 * <li>{@link #getExponent(double)}</li>
 * <li>{@link #nextAfter(double,double)}</li>
 * <li>{@link #nextUp(double)}</li>
 * <li>{@link #scalb(double, int)}</li>
 * <li>{@link #copySign(float, float)}</li>
 * <li>{@link #getExponent(float)}</li>
 * <li>{@link #nextAfter(float,double)}</li>
 * <li>{@link #nextUp(float)}</li>
 * <li>{@link #scalb(float, int)}</li>
 * </ul>
 * </p>
 * @version $Id$
 * @since 2.2
 */
@java.lang.SuppressWarnings({"fallthrough"}) public class FastMath {public static class __CLR4_4_117tq17tqlb90pb0r{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,58984,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /** Archimede's constant PI, ratio of circle circumference to diameter. */
    public static final double PI = 105414357.0 / 33554432.0 + 1.984187159361080883e-9;

    /** Napier's constant e, base of the natural logarithm. */
    public static final double E = 2850325.0 / 1048576.0 + 8.254840070411028747e-8;

    /** Index of exp(0) in the array of integer exponentials. */
    static final int EXP_INT_TABLE_MAX_INDEX = 750;
    /** Length of the array of integer exponentials. */
    static final int EXP_INT_TABLE_LEN = EXP_INT_TABLE_MAX_INDEX * 2;
    /** Logarithm table length. */
    static final int LN_MANT_LEN = 1024;
    /** Exponential fractions table length. */
    static final int EXP_FRAC_TABLE_LEN = 1025; // 0, 1/1024, ... 1024/1024

    /** StrictMath.log(Double.MAX_VALUE): {@value} */
    private static final double LOG_MAX_VALUE = StrictMath.log(Double.MAX_VALUE);

    /** Indicator for tables initialization.
     * <p>
     * This compile-time constant should be set to true only if one explicitly
     * wants to compute the tables at class loading time instead of using the
     * already computed ones provided as literal arrays below.
     * </p>
     */
    private static final boolean RECOMPUTE_TABLES_AT_RUNTIME = false;

    /** log(2) (high bits). */
    private static final double LN_2_A = 0.693147063255310059;

    /** log(2) (low bits). */
    private static final double LN_2_B = 1.17304635250823482e-7;

    /** Coefficients for log, when input 0.99 < x < 1.01. */
    private static final double LN_QUICK_COEF[][] = {
        {1.0, 5.669184079525E-24},
        {-0.25, -0.25},
        {0.3333333134651184, 1.986821492305628E-8},
        {-0.25, -6.663542893624021E-14},
        {0.19999998807907104, 1.1921056801463227E-8},
        {-0.1666666567325592, -7.800414592973399E-9},
        {0.1428571343421936, 5.650007086920087E-9},
        {-0.12502530217170715, -7.44321345601866E-11},
        {0.11113807559013367, 9.219544613762692E-9},
    };

    /** Coefficients for log in the range of 1.0 < x < 1.0 + 2^-10. */
    private static final double LN_HI_PREC_COEF[][] = {
        {1.0, -6.032174644509064E-23},
        {-0.25, -0.25},
        {0.3333333134651184, 1.9868161777724352E-8},
        {-0.2499999701976776, -2.957007209750105E-8},
        {0.19999954104423523, 1.5830993332061267E-10},
        {-0.16624879837036133, -2.6033824355191673E-8}
    };

    /** Sine, Cosine, Tangent tables are for 0, 1/8, 2/8, ... 13/8 = PI/2 approx. */
    private static final int SINE_TABLE_LEN = 14;

    /** Sine table (high bits). */
    private static final double SINE_TABLE_A[] =
        {
        +0.0d,
        +0.1246747374534607d,
        +0.24740394949913025d,
        +0.366272509098053d,
        +0.4794255495071411d,
        +0.5850973129272461d,
        +0.6816387176513672d,
        +0.7675435543060303d,
        +0.8414709568023682d,
        +0.902267575263977d,
        +0.9489846229553223d,
        +0.9808930158615112d,
        +0.9974949359893799d,
        +0.9985313415527344d,
    };

    /** Sine table (low bits). */
    private static final double SINE_TABLE_B[] =
        {
        +0.0d,
        -4.068233003401932E-9d,
        +9.755392680573412E-9d,
        +1.9987994582857286E-8d,
        -1.0902938113007961E-8d,
        -3.9986783938944604E-8d,
        +4.23719669792332E-8d,
        -5.207000323380292E-8d,
        +2.800552834259E-8d,
        +1.883511811213715E-8d,
        -3.5997360512765566E-9d,
        +4.116164446561962E-8d,
        +5.0614674548127384E-8d,
        -1.0129027912496858E-9d,
    };

    /** Cosine table (high bits). */
    private static final double COSINE_TABLE_A[] =
        {
        +1.0d,
        +0.9921976327896118d,
        +0.9689123630523682d,
        +0.9305076599121094d,
        +0.8775825500488281d,
        +0.8109631538391113d,
        +0.7316888570785522d,
        +0.6409968137741089d,
        +0.5403022766113281d,
        +0.4311765432357788d,
        +0.3153223395347595d,
        +0.19454771280288696d,
        +0.07073719799518585d,
        -0.05417713522911072d,
    };

    /** Cosine table (low bits). */
    private static final double COSINE_TABLE_B[] =
        {
        +0.0d,
        +3.4439717236742845E-8d,
        +5.865827662008209E-8d,
        -3.7999795083850525E-8d,
        +1.184154459111628E-8d,
        -3.43338934259355E-8d,
        +1.1795268640216787E-8d,
        +4.438921624363781E-8d,
        +2.925681159240093E-8d,
        -2.6437112632041807E-8d,
        +2.2860509143963117E-8d,
        -4.813899778443457E-9d,
        +3.6725170580355583E-9d,
        +2.0217439756338078E-10d,
    };


    /** Tangent table, used by atan() (high bits). */
    private static final double TANGENT_TABLE_A[] =
        {
        +0.0d,
        +0.1256551444530487d,
        +0.25534194707870483d,
        +0.3936265707015991d,
        +0.5463024377822876d,
        +0.7214844226837158d,
        +0.9315965175628662d,
        +1.1974215507507324d,
        +1.5574076175689697d,
        +2.092571258544922d,
        +3.0095696449279785d,
        +5.041914939880371d,
        +14.101419448852539d,
        -18.430862426757812d,
    };

    /** Tangent table, used by atan() (low bits). */
    private static final double TANGENT_TABLE_B[] =
        {
        +0.0d,
        -7.877917738262007E-9d,
        -2.5857668567479893E-8d,
        +5.2240336371356666E-9d,
        +5.206150291559893E-8d,
        +1.8307188599677033E-8d,
        -5.7618793749770706E-8d,
        +7.848361555046424E-8d,
        +1.0708593250394448E-7d,
        +1.7827257129423813E-8d,
        +2.893485277253286E-8d,
        +3.1660099222737955E-7d,
        +4.983191803254889E-7d,
        -3.356118100840571E-7d,
    };

    /** Bits of 1/(2*pi), need for reducePayneHanek(). */
    private static final long RECIP_2PI[] = new long[] {
        (0x28be60dbL << 32) | 0x9391054aL,
        (0x7f09d5f4L << 32) | 0x7d4d3770L,
        (0x36d8a566L << 32) | 0x4f10e410L,
        (0x7f9458eaL << 32) | 0xf7aef158L,
        (0x6dc91b8eL << 32) | 0x909374b8L,
        (0x01924bbaL << 32) | 0x82746487L,
        (0x3f877ac7L << 32) | 0x2c4a69cfL,
        (0xba208d7dL << 32) | 0x4baed121L,
        (0x3a671c09L << 32) | 0xad17df90L,
        (0x4e64758eL << 32) | 0x60d4ce7dL,
        (0x272117e2L << 32) | 0xef7e4a0eL,
        (0xc7fe25ffL << 32) | 0xf7816603L,
        (0xfbcbc462L << 32) | 0xd6829b47L,
        (0xdb4d9fb3L << 32) | 0xc9f2c26dL,
        (0xd3d18fd9L << 32) | 0xa797fa8bL,
        (0x5d49eeb1L << 32) | 0xfaf97c5eL,
        (0xcf41ce7dL << 32) | 0xe294a4baL,
         0x9afed7ecL << 32  };

    /** Bits of pi/4, need for reducePayneHanek(). */
    private static final long PI_O_4_BITS[] = new long[] {
        (0xc90fdaa2L << 32) | 0x2168c234L,
        (0xc4c6628bL << 32) | 0x80dc1cd1L };

    /** Eighths.
     * This is used by sinQ, because its faster to do a table lookup than
     * a multiply in this time-critical routine
     */
    private static final double EIGHTHS[] = {0, 0.125, 0.25, 0.375, 0.5, 0.625, 0.75, 0.875, 1.0, 1.125, 1.25, 1.375, 1.5, 1.625};

    /** Table of 2^((n+2)/3) */
    private static final double CBRTTWO[] = { 0.6299605249474366,
                                            0.7937005259840998,
                                            1.0,
                                            1.2599210498948732,
                                            1.5874010519681994 };

    /*
     *  There are 52 bits in the mantissa of a double.
     *  For additional precision, the code splits double numbers into two parts,
     *  by clearing the low order 30 bits if possible, and then performs the arithmetic
     *  on each half separately.
     */

    /**
     * 0x40000000 - used to split a double into two parts, both with the low order bits cleared.
     * Equivalent to 2^30.
     */
    private static final long HEX_40000000 = 0x40000000L; // 1073741824L

    /** Mask used to clear low order 30 bits */
    private static final long MASK_30BITS = -1L - (HEX_40000000 -1); // 0xFFFFFFFFC0000000L;

    /** Mask used to clear the non-sign part of an int. */
    private static final int MASK_NON_SIGN_INT = 0x7fffffff;

    /** Mask used to clear the non-sign part of a long. */
    private static final long MASK_NON_SIGN_LONG = 0x7fffffffffffffffl;

    /** 2^52 - double numbers this large must be integral (no fraction) or NaN or Infinite */
    private static final double TWO_POWER_52 = 4503599627370496.0;
    /** 2^53 - double numbers this large must be even. */
    private static final double TWO_POWER_53 = 2 * TWO_POWER_52;

    /** Constant: {@value}. */
    private static final double F_1_3 = 1d / 3d;
    /** Constant: {@value}. */
    private static final double F_1_5 = 1d / 5d;
    /** Constant: {@value}. */
    private static final double F_1_7 = 1d / 7d;
    /** Constant: {@value}. */
    private static final double F_1_9 = 1d / 9d;
    /** Constant: {@value}. */
    private static final double F_1_11 = 1d / 11d;
    /** Constant: {@value}. */
    private static final double F_1_13 = 1d / 13d;
    /** Constant: {@value}. */
    private static final double F_1_15 = 1d / 15d;
    /** Constant: {@value}. */
    private static final double F_1_17 = 1d / 17d;
    /** Constant: {@value}. */
    private static final double F_3_4 = 3d / 4d;
    /** Constant: {@value}. */
    private static final double F_15_16 = 15d / 16d;
    /** Constant: {@value}. */
    private static final double F_13_14 = 13d / 14d;
    /** Constant: {@value}. */
    private static final double F_11_12 = 11d / 12d;
    /** Constant: {@value}. */
    private static final double F_9_10 = 9d / 10d;
    /** Constant: {@value}. */
    private static final double F_7_8 = 7d / 8d;
    /** Constant: {@value}. */
    private static final double F_5_6 = 5d / 6d;
    /** Constant: {@value}. */
    private static final double F_1_2 = 1d / 2d;
    /** Constant: {@value}. */
    private static final double F_1_4 = 1d / 4d;

    /**
     * Private Constructor
     */
    private FastMath() {try{__CLR4_4_117tq17tqlb90pb0r.R.inc(56798);}finally{__CLR4_4_117tq17tqlb90pb0r.R.flushNeeded();}}

    // Generic helper methods

    /**
     * Get the high order bits from the mantissa.
     * Equivalent to adding and subtracting HEX_40000 but also works for very large numbers
     *
     * @param d the value to split
     * @return the high order part of the mantissa
     */
    private static double doubleHighPart(double d) {try{__CLR4_4_117tq17tqlb90pb0r.R.inc(56799);
        __CLR4_4_117tq17tqlb90pb0r.R.inc(56800);if ((((d > -Precision.SAFE_MIN && d < Precision.SAFE_MIN)&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(56801)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(56802)==0&false))){{
            __CLR4_4_117tq17tqlb90pb0r.R.inc(56803);return d; // These are un-normalised - don't try to convert
        }
        }__CLR4_4_117tq17tqlb90pb0r.R.inc(56804);long xl = Double.doubleToRawLongBits(d); // can take raw bits because just gonna convert it back
        __CLR4_4_117tq17tqlb90pb0r.R.inc(56805);xl = xl & MASK_30BITS; // Drop low order bits
        __CLR4_4_117tq17tqlb90pb0r.R.inc(56806);return Double.longBitsToDouble(xl);
    }finally{__CLR4_4_117tq17tqlb90pb0r.R.flushNeeded();}}

    /** Compute the square root of a number.
     * <p><b>Note:</b> this implementation currently delegates to {@link Math#sqrt}
     * @param a number on which evaluation is done
     * @return square root of a
     */
    public static double sqrt(final double a) {try{__CLR4_4_117tq17tqlb90pb0r.R.inc(56807);
        __CLR4_4_117tq17tqlb90pb0r.R.inc(56808);return Math.sqrt(a);
    }finally{__CLR4_4_117tq17tqlb90pb0r.R.flushNeeded();}}

    /** Compute the hyperbolic cosine of a number.
     * @param x number on which evaluation is done
     * @return hyperbolic cosine of x
     */
    public static double cosh(double x) {try{__CLR4_4_117tq17tqlb90pb0r.R.inc(56809);
      __CLR4_4_117tq17tqlb90pb0r.R.inc(56810);if ((((x != x)&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(56811)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(56812)==0&false))) {{
          __CLR4_4_117tq17tqlb90pb0r.R.inc(56813);return x;
      }

      // cosh[z] = (exp(z) + exp(-z))/2

      // for numbers with magnitude 20 or so,
      // exp(-z) can be ignored in comparison with exp(z)

      }__CLR4_4_117tq17tqlb90pb0r.R.inc(56814);if ((((x > 20)&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(56815)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(56816)==0&false))) {{
          __CLR4_4_117tq17tqlb90pb0r.R.inc(56817);if ((((x >= LOG_MAX_VALUE)&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(56818)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(56819)==0&false))) {{
              // Avoid overflow (MATH-905).
              __CLR4_4_117tq17tqlb90pb0r.R.inc(56820);final double t = exp(0.5 * x);
              __CLR4_4_117tq17tqlb90pb0r.R.inc(56821);return (0.5 * t) * t;
          } }else {{
              __CLR4_4_117tq17tqlb90pb0r.R.inc(56822);return 0.5 * exp(x);
          }
      }} }else {__CLR4_4_117tq17tqlb90pb0r.R.inc(56823);if ((((x < -20)&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(56824)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(56825)==0&false))) {{
          __CLR4_4_117tq17tqlb90pb0r.R.inc(56826);if ((((x <= -LOG_MAX_VALUE)&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(56827)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(56828)==0&false))) {{
              // Avoid overflow (MATH-905).
              __CLR4_4_117tq17tqlb90pb0r.R.inc(56829);final double t = exp(-0.5 * x);
              __CLR4_4_117tq17tqlb90pb0r.R.inc(56830);return (0.5 * t) * t;
          } }else {{
              __CLR4_4_117tq17tqlb90pb0r.R.inc(56831);return 0.5 * exp(-x);
          }
      }}

      }}__CLR4_4_117tq17tqlb90pb0r.R.inc(56832);final double hiPrec[] = new double[2];
      __CLR4_4_117tq17tqlb90pb0r.R.inc(56833);if ((((x < 0.0)&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(56834)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(56835)==0&false))) {{
          __CLR4_4_117tq17tqlb90pb0r.R.inc(56836);x = -x;
      }
      }__CLR4_4_117tq17tqlb90pb0r.R.inc(56837);exp(x, 0.0, hiPrec);

      __CLR4_4_117tq17tqlb90pb0r.R.inc(56838);double ya = hiPrec[0] + hiPrec[1];
      __CLR4_4_117tq17tqlb90pb0r.R.inc(56839);double yb = -(ya - hiPrec[0] - hiPrec[1]);

      __CLR4_4_117tq17tqlb90pb0r.R.inc(56840);double temp = ya * HEX_40000000;
      __CLR4_4_117tq17tqlb90pb0r.R.inc(56841);double yaa = ya + temp - temp;
      __CLR4_4_117tq17tqlb90pb0r.R.inc(56842);double yab = ya - yaa;

      // recip = 1/y
      __CLR4_4_117tq17tqlb90pb0r.R.inc(56843);double recip = 1.0/ya;
      __CLR4_4_117tq17tqlb90pb0r.R.inc(56844);temp = recip * HEX_40000000;
      __CLR4_4_117tq17tqlb90pb0r.R.inc(56845);double recipa = recip + temp - temp;
      __CLR4_4_117tq17tqlb90pb0r.R.inc(56846);double recipb = recip - recipa;

      // Correct for rounding in division
      __CLR4_4_117tq17tqlb90pb0r.R.inc(56847);recipb += (1.0 - yaa*recipa - yaa*recipb - yab*recipa - yab*recipb) * recip;
      // Account for yb
      __CLR4_4_117tq17tqlb90pb0r.R.inc(56848);recipb += -yb * recip * recip;

      // y = y + 1/y
      __CLR4_4_117tq17tqlb90pb0r.R.inc(56849);temp = ya + recipa;
      __CLR4_4_117tq17tqlb90pb0r.R.inc(56850);yb += -(temp - ya - recipa);
      __CLR4_4_117tq17tqlb90pb0r.R.inc(56851);ya = temp;
      __CLR4_4_117tq17tqlb90pb0r.R.inc(56852);temp = ya + recipb;
      __CLR4_4_117tq17tqlb90pb0r.R.inc(56853);yb += -(temp - ya - recipb);
      __CLR4_4_117tq17tqlb90pb0r.R.inc(56854);ya = temp;

      __CLR4_4_117tq17tqlb90pb0r.R.inc(56855);double result = ya + yb;
      __CLR4_4_117tq17tqlb90pb0r.R.inc(56856);result *= 0.5;
      __CLR4_4_117tq17tqlb90pb0r.R.inc(56857);return result;
    }finally{__CLR4_4_117tq17tqlb90pb0r.R.flushNeeded();}}

    /** Compute the hyperbolic sine of a number.
     * @param x number on which evaluation is done
     * @return hyperbolic sine of x
     */
    public static double sinh(double x) {try{__CLR4_4_117tq17tqlb90pb0r.R.inc(56858);
      __CLR4_4_117tq17tqlb90pb0r.R.inc(56859);boolean negate = false;
      __CLR4_4_117tq17tqlb90pb0r.R.inc(56860);if ((((x != x)&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(56861)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(56862)==0&false))) {{
          __CLR4_4_117tq17tqlb90pb0r.R.inc(56863);return x;
      }

      // sinh[z] = (exp(z) - exp(-z) / 2

      // for values of z larger than about 20,
      // exp(-z) can be ignored in comparison with exp(z)

      }__CLR4_4_117tq17tqlb90pb0r.R.inc(56864);if ((((x > 20)&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(56865)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(56866)==0&false))) {{
          __CLR4_4_117tq17tqlb90pb0r.R.inc(56867);if ((((x >= LOG_MAX_VALUE)&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(56868)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(56869)==0&false))) {{
              // Avoid overflow (MATH-905).
              __CLR4_4_117tq17tqlb90pb0r.R.inc(56870);final double t = exp(0.5 * x);
              __CLR4_4_117tq17tqlb90pb0r.R.inc(56871);return (0.5 * t) * t;
          } }else {{
              __CLR4_4_117tq17tqlb90pb0r.R.inc(56872);return 0.5 * exp(x);
          }
      }} }else {__CLR4_4_117tq17tqlb90pb0r.R.inc(56873);if ((((x < -20)&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(56874)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(56875)==0&false))) {{
          __CLR4_4_117tq17tqlb90pb0r.R.inc(56876);if ((((x <= -LOG_MAX_VALUE)&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(56877)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(56878)==0&false))) {{
              // Avoid overflow (MATH-905).
              __CLR4_4_117tq17tqlb90pb0r.R.inc(56879);final double t = exp(-0.5 * x);
              __CLR4_4_117tq17tqlb90pb0r.R.inc(56880);return (-0.5 * t) * t;
          } }else {{
              __CLR4_4_117tq17tqlb90pb0r.R.inc(56881);return -0.5 * exp(-x);
          }
      }}

      }}__CLR4_4_117tq17tqlb90pb0r.R.inc(56882);if ((((x == 0)&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(56883)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(56884)==0&false))) {{
          __CLR4_4_117tq17tqlb90pb0r.R.inc(56885);return x;
      }

      }__CLR4_4_117tq17tqlb90pb0r.R.inc(56886);if ((((x < 0.0)&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(56887)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(56888)==0&false))) {{
          __CLR4_4_117tq17tqlb90pb0r.R.inc(56889);x = -x;
          __CLR4_4_117tq17tqlb90pb0r.R.inc(56890);negate = true;
      }

      }__CLR4_4_117tq17tqlb90pb0r.R.inc(56891);double result;

      __CLR4_4_117tq17tqlb90pb0r.R.inc(56892);if ((((x > 0.25)&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(56893)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(56894)==0&false))) {{
          __CLR4_4_117tq17tqlb90pb0r.R.inc(56895);double hiPrec[] = new double[2];
          __CLR4_4_117tq17tqlb90pb0r.R.inc(56896);exp(x, 0.0, hiPrec);

          __CLR4_4_117tq17tqlb90pb0r.R.inc(56897);double ya = hiPrec[0] + hiPrec[1];
          __CLR4_4_117tq17tqlb90pb0r.R.inc(56898);double yb = -(ya - hiPrec[0] - hiPrec[1]);

          __CLR4_4_117tq17tqlb90pb0r.R.inc(56899);double temp = ya * HEX_40000000;
          __CLR4_4_117tq17tqlb90pb0r.R.inc(56900);double yaa = ya + temp - temp;
          __CLR4_4_117tq17tqlb90pb0r.R.inc(56901);double yab = ya - yaa;

          // recip = 1/y
          __CLR4_4_117tq17tqlb90pb0r.R.inc(56902);double recip = 1.0/ya;
          __CLR4_4_117tq17tqlb90pb0r.R.inc(56903);temp = recip * HEX_40000000;
          __CLR4_4_117tq17tqlb90pb0r.R.inc(56904);double recipa = recip + temp - temp;
          __CLR4_4_117tq17tqlb90pb0r.R.inc(56905);double recipb = recip - recipa;

          // Correct for rounding in division
          __CLR4_4_117tq17tqlb90pb0r.R.inc(56906);recipb += (1.0 - yaa*recipa - yaa*recipb - yab*recipa - yab*recipb) * recip;
          // Account for yb
          __CLR4_4_117tq17tqlb90pb0r.R.inc(56907);recipb += -yb * recip * recip;

          __CLR4_4_117tq17tqlb90pb0r.R.inc(56908);recipa = -recipa;
          __CLR4_4_117tq17tqlb90pb0r.R.inc(56909);recipb = -recipb;

          // y = y + 1/y
          __CLR4_4_117tq17tqlb90pb0r.R.inc(56910);temp = ya + recipa;
          __CLR4_4_117tq17tqlb90pb0r.R.inc(56911);yb += -(temp - ya - recipa);
          __CLR4_4_117tq17tqlb90pb0r.R.inc(56912);ya = temp;
          __CLR4_4_117tq17tqlb90pb0r.R.inc(56913);temp = ya + recipb;
          __CLR4_4_117tq17tqlb90pb0r.R.inc(56914);yb += -(temp - ya - recipb);
          __CLR4_4_117tq17tqlb90pb0r.R.inc(56915);ya = temp;

          __CLR4_4_117tq17tqlb90pb0r.R.inc(56916);result = ya + yb;
          __CLR4_4_117tq17tqlb90pb0r.R.inc(56917);result *= 0.5;
      }
      }else {{
          __CLR4_4_117tq17tqlb90pb0r.R.inc(56918);double hiPrec[] = new double[2];
          __CLR4_4_117tq17tqlb90pb0r.R.inc(56919);expm1(x, hiPrec);

          __CLR4_4_117tq17tqlb90pb0r.R.inc(56920);double ya = hiPrec[0] + hiPrec[1];
          __CLR4_4_117tq17tqlb90pb0r.R.inc(56921);double yb = -(ya - hiPrec[0] - hiPrec[1]);

          /* Compute expm1(-x) = -expm1(x) / (expm1(x) + 1) */
          __CLR4_4_117tq17tqlb90pb0r.R.inc(56922);double denom = 1.0 + ya;
          __CLR4_4_117tq17tqlb90pb0r.R.inc(56923);double denomr = 1.0 / denom;
          __CLR4_4_117tq17tqlb90pb0r.R.inc(56924);double denomb = -(denom - 1.0 - ya) + yb;
          __CLR4_4_117tq17tqlb90pb0r.R.inc(56925);double ratio = ya * denomr;
          __CLR4_4_117tq17tqlb90pb0r.R.inc(56926);double temp = ratio * HEX_40000000;
          __CLR4_4_117tq17tqlb90pb0r.R.inc(56927);double ra = ratio + temp - temp;
          __CLR4_4_117tq17tqlb90pb0r.R.inc(56928);double rb = ratio - ra;

          __CLR4_4_117tq17tqlb90pb0r.R.inc(56929);temp = denom * HEX_40000000;
          __CLR4_4_117tq17tqlb90pb0r.R.inc(56930);double za = denom + temp - temp;
          __CLR4_4_117tq17tqlb90pb0r.R.inc(56931);double zb = denom - za;

          __CLR4_4_117tq17tqlb90pb0r.R.inc(56932);rb += (ya - za*ra - za*rb - zb*ra - zb*rb) * denomr;

          // Adjust for yb
          __CLR4_4_117tq17tqlb90pb0r.R.inc(56933);rb += yb*denomr;                        // numerator
          __CLR4_4_117tq17tqlb90pb0r.R.inc(56934);rb += -ya * denomb * denomr * denomr;   // denominator

          // y = y - 1/y
          __CLR4_4_117tq17tqlb90pb0r.R.inc(56935);temp = ya + ra;
          __CLR4_4_117tq17tqlb90pb0r.R.inc(56936);yb += -(temp - ya - ra);
          __CLR4_4_117tq17tqlb90pb0r.R.inc(56937);ya = temp;
          __CLR4_4_117tq17tqlb90pb0r.R.inc(56938);temp = ya + rb;
          __CLR4_4_117tq17tqlb90pb0r.R.inc(56939);yb += -(temp - ya - rb);
          __CLR4_4_117tq17tqlb90pb0r.R.inc(56940);ya = temp;

          __CLR4_4_117tq17tqlb90pb0r.R.inc(56941);result = ya + yb;
          __CLR4_4_117tq17tqlb90pb0r.R.inc(56942);result *= 0.5;
      }

      }__CLR4_4_117tq17tqlb90pb0r.R.inc(56943);if ((((negate)&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(56944)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(56945)==0&false))) {{
          __CLR4_4_117tq17tqlb90pb0r.R.inc(56946);result = -result;
      }

      }__CLR4_4_117tq17tqlb90pb0r.R.inc(56947);return result;
    }finally{__CLR4_4_117tq17tqlb90pb0r.R.flushNeeded();}}

    /** Compute the hyperbolic tangent of a number.
     * @param x number on which evaluation is done
     * @return hyperbolic tangent of x
     */
    public static double tanh(double x) {try{__CLR4_4_117tq17tqlb90pb0r.R.inc(56948);
      __CLR4_4_117tq17tqlb90pb0r.R.inc(56949);boolean negate = false;

      __CLR4_4_117tq17tqlb90pb0r.R.inc(56950);if ((((x != x)&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(56951)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(56952)==0&false))) {{
          __CLR4_4_117tq17tqlb90pb0r.R.inc(56953);return x;
      }

      // tanh[z] = sinh[z] / cosh[z]
      // = (exp(z) - exp(-z)) / (exp(z) + exp(-z))
      // = (exp(2x) - 1) / (exp(2x) + 1)

      // for magnitude > 20, sinh[z] == cosh[z] in double precision

      }__CLR4_4_117tq17tqlb90pb0r.R.inc(56954);if ((((x > 20.0)&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(56955)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(56956)==0&false))) {{
          __CLR4_4_117tq17tqlb90pb0r.R.inc(56957);return 1.0;
      }

      }__CLR4_4_117tq17tqlb90pb0r.R.inc(56958);if ((((x < -20)&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(56959)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(56960)==0&false))) {{
          __CLR4_4_117tq17tqlb90pb0r.R.inc(56961);return -1.0;
      }

      }__CLR4_4_117tq17tqlb90pb0r.R.inc(56962);if ((((x == 0)&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(56963)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(56964)==0&false))) {{
          __CLR4_4_117tq17tqlb90pb0r.R.inc(56965);return x;
      }

      }__CLR4_4_117tq17tqlb90pb0r.R.inc(56966);if ((((x < 0.0)&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(56967)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(56968)==0&false))) {{
          __CLR4_4_117tq17tqlb90pb0r.R.inc(56969);x = -x;
          __CLR4_4_117tq17tqlb90pb0r.R.inc(56970);negate = true;
      }

      }__CLR4_4_117tq17tqlb90pb0r.R.inc(56971);double result;
      __CLR4_4_117tq17tqlb90pb0r.R.inc(56972);if ((((x >= 0.5)&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(56973)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(56974)==0&false))) {{
          __CLR4_4_117tq17tqlb90pb0r.R.inc(56975);double hiPrec[] = new double[2];
          // tanh(x) = (exp(2x) - 1) / (exp(2x) + 1)
          __CLR4_4_117tq17tqlb90pb0r.R.inc(56976);exp(x*2.0, 0.0, hiPrec);

          __CLR4_4_117tq17tqlb90pb0r.R.inc(56977);double ya = hiPrec[0] + hiPrec[1];
          __CLR4_4_117tq17tqlb90pb0r.R.inc(56978);double yb = -(ya - hiPrec[0] - hiPrec[1]);

          /* Numerator */
          __CLR4_4_117tq17tqlb90pb0r.R.inc(56979);double na = -1.0 + ya;
          __CLR4_4_117tq17tqlb90pb0r.R.inc(56980);double nb = -(na + 1.0 - ya);
          __CLR4_4_117tq17tqlb90pb0r.R.inc(56981);double temp = na + yb;
          __CLR4_4_117tq17tqlb90pb0r.R.inc(56982);nb += -(temp - na - yb);
          __CLR4_4_117tq17tqlb90pb0r.R.inc(56983);na = temp;

          /* Denominator */
          __CLR4_4_117tq17tqlb90pb0r.R.inc(56984);double da = 1.0 + ya;
          __CLR4_4_117tq17tqlb90pb0r.R.inc(56985);double db = -(da - 1.0 - ya);
          __CLR4_4_117tq17tqlb90pb0r.R.inc(56986);temp = da + yb;
          __CLR4_4_117tq17tqlb90pb0r.R.inc(56987);db += -(temp - da - yb);
          __CLR4_4_117tq17tqlb90pb0r.R.inc(56988);da = temp;

          __CLR4_4_117tq17tqlb90pb0r.R.inc(56989);temp = da * HEX_40000000;
          __CLR4_4_117tq17tqlb90pb0r.R.inc(56990);double daa = da + temp - temp;
          __CLR4_4_117tq17tqlb90pb0r.R.inc(56991);double dab = da - daa;

          // ratio = na/da
          __CLR4_4_117tq17tqlb90pb0r.R.inc(56992);double ratio = na/da;
          __CLR4_4_117tq17tqlb90pb0r.R.inc(56993);temp = ratio * HEX_40000000;
          __CLR4_4_117tq17tqlb90pb0r.R.inc(56994);double ratioa = ratio + temp - temp;
          __CLR4_4_117tq17tqlb90pb0r.R.inc(56995);double ratiob = ratio - ratioa;

          // Correct for rounding in division
          __CLR4_4_117tq17tqlb90pb0r.R.inc(56996);ratiob += (na - daa*ratioa - daa*ratiob - dab*ratioa - dab*ratiob) / da;

          // Account for nb
          __CLR4_4_117tq17tqlb90pb0r.R.inc(56997);ratiob += nb / da;
          // Account for db
          __CLR4_4_117tq17tqlb90pb0r.R.inc(56998);ratiob += -db * na / da / da;

          __CLR4_4_117tq17tqlb90pb0r.R.inc(56999);result = ratioa + ratiob;
      }
      }else {{
          __CLR4_4_117tq17tqlb90pb0r.R.inc(57000);double hiPrec[] = new double[2];
          // tanh(x) = expm1(2x) / (expm1(2x) + 2)
          __CLR4_4_117tq17tqlb90pb0r.R.inc(57001);expm1(x*2.0, hiPrec);

          __CLR4_4_117tq17tqlb90pb0r.R.inc(57002);double ya = hiPrec[0] + hiPrec[1];
          __CLR4_4_117tq17tqlb90pb0r.R.inc(57003);double yb = -(ya - hiPrec[0] - hiPrec[1]);

          /* Numerator */
          __CLR4_4_117tq17tqlb90pb0r.R.inc(57004);double na = ya;
          __CLR4_4_117tq17tqlb90pb0r.R.inc(57005);double nb = yb;

          /* Denominator */
          __CLR4_4_117tq17tqlb90pb0r.R.inc(57006);double da = 2.0 + ya;
          __CLR4_4_117tq17tqlb90pb0r.R.inc(57007);double db = -(da - 2.0 - ya);
          __CLR4_4_117tq17tqlb90pb0r.R.inc(57008);double temp = da + yb;
          __CLR4_4_117tq17tqlb90pb0r.R.inc(57009);db += -(temp - da - yb);
          __CLR4_4_117tq17tqlb90pb0r.R.inc(57010);da = temp;

          __CLR4_4_117tq17tqlb90pb0r.R.inc(57011);temp = da * HEX_40000000;
          __CLR4_4_117tq17tqlb90pb0r.R.inc(57012);double daa = da + temp - temp;
          __CLR4_4_117tq17tqlb90pb0r.R.inc(57013);double dab = da - daa;

          // ratio = na/da
          __CLR4_4_117tq17tqlb90pb0r.R.inc(57014);double ratio = na/da;
          __CLR4_4_117tq17tqlb90pb0r.R.inc(57015);temp = ratio * HEX_40000000;
          __CLR4_4_117tq17tqlb90pb0r.R.inc(57016);double ratioa = ratio + temp - temp;
          __CLR4_4_117tq17tqlb90pb0r.R.inc(57017);double ratiob = ratio - ratioa;

          // Correct for rounding in division
          __CLR4_4_117tq17tqlb90pb0r.R.inc(57018);ratiob += (na - daa*ratioa - daa*ratiob - dab*ratioa - dab*ratiob) / da;

          // Account for nb
          __CLR4_4_117tq17tqlb90pb0r.R.inc(57019);ratiob += nb / da;
          // Account for db
          __CLR4_4_117tq17tqlb90pb0r.R.inc(57020);ratiob += -db * na / da / da;

          __CLR4_4_117tq17tqlb90pb0r.R.inc(57021);result = ratioa + ratiob;
      }

      }__CLR4_4_117tq17tqlb90pb0r.R.inc(57022);if ((((negate)&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(57023)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(57024)==0&false))) {{
          __CLR4_4_117tq17tqlb90pb0r.R.inc(57025);result = -result;
      }

      }__CLR4_4_117tq17tqlb90pb0r.R.inc(57026);return result;
    }finally{__CLR4_4_117tq17tqlb90pb0r.R.flushNeeded();}}

    /** Compute the inverse hyperbolic cosine of a number.
     * @param a number on which evaluation is done
     * @return inverse hyperbolic cosine of a
     */
    public static double acosh(final double a) {try{__CLR4_4_117tq17tqlb90pb0r.R.inc(57027);
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57028);return FastMath.log(a + FastMath.sqrt(a * a - 1));
    }finally{__CLR4_4_117tq17tqlb90pb0r.R.flushNeeded();}}

    /** Compute the inverse hyperbolic sine of a number.
     * @param a number on which evaluation is done
     * @return inverse hyperbolic sine of a
     */
    public static double asinh(double a) {try{__CLR4_4_117tq17tqlb90pb0r.R.inc(57029);
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57030);boolean negative = false;
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57031);if ((((a < 0)&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(57032)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(57033)==0&false))) {{
            __CLR4_4_117tq17tqlb90pb0r.R.inc(57034);negative = true;
            __CLR4_4_117tq17tqlb90pb0r.R.inc(57035);a = -a;
        }

        }__CLR4_4_117tq17tqlb90pb0r.R.inc(57036);double absAsinh;
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57037);if ((((a > 0.167)&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(57038)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(57039)==0&false))) {{
            __CLR4_4_117tq17tqlb90pb0r.R.inc(57040);absAsinh = FastMath.log(FastMath.sqrt(a * a + 1) + a);
        } }else {{
            __CLR4_4_117tq17tqlb90pb0r.R.inc(57041);final double a2 = a * a;
            __CLR4_4_117tq17tqlb90pb0r.R.inc(57042);if ((((a > 0.097)&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(57043)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(57044)==0&false))) {{
                __CLR4_4_117tq17tqlb90pb0r.R.inc(57045);absAsinh = a * (1 - a2 * (F_1_3 - a2 * (F_1_5 - a2 * (F_1_7 - a2 * (F_1_9 - a2 * (F_1_11 - a2 * (F_1_13 - a2 * (F_1_15 - a2 * F_1_17 * F_15_16) * F_13_14) * F_11_12) * F_9_10) * F_7_8) * F_5_6) * F_3_4) * F_1_2);
            } }else {__CLR4_4_117tq17tqlb90pb0r.R.inc(57046);if ((((a > 0.036)&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(57047)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(57048)==0&false))) {{
                __CLR4_4_117tq17tqlb90pb0r.R.inc(57049);absAsinh = a * (1 - a2 * (F_1_3 - a2 * (F_1_5 - a2 * (F_1_7 - a2 * (F_1_9 - a2 * (F_1_11 - a2 * F_1_13 * F_11_12) * F_9_10) * F_7_8) * F_5_6) * F_3_4) * F_1_2);
            } }else {__CLR4_4_117tq17tqlb90pb0r.R.inc(57050);if ((((a > 0.0036)&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(57051)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(57052)==0&false))) {{
                __CLR4_4_117tq17tqlb90pb0r.R.inc(57053);absAsinh = a * (1 - a2 * (F_1_3 - a2 * (F_1_5 - a2 * (F_1_7 - a2 * F_1_9 * F_7_8) * F_5_6) * F_3_4) * F_1_2);
            } }else {{
                __CLR4_4_117tq17tqlb90pb0r.R.inc(57054);absAsinh = a * (1 - a2 * (F_1_3 - a2 * F_1_5 * F_3_4) * F_1_2);
            }
        }}}}

        }__CLR4_4_117tq17tqlb90pb0r.R.inc(57055);return (((negative )&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(57056)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(57057)==0&false))? -absAsinh : absAsinh;
    }finally{__CLR4_4_117tq17tqlb90pb0r.R.flushNeeded();}}

    /** Compute the inverse hyperbolic tangent of a number.
     * @param a number on which evaluation is done
     * @return inverse hyperbolic tangent of a
     */
    public static double atanh(double a) {try{__CLR4_4_117tq17tqlb90pb0r.R.inc(57058);
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57059);boolean negative = false;
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57060);if ((((a < 0)&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(57061)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(57062)==0&false))) {{
            __CLR4_4_117tq17tqlb90pb0r.R.inc(57063);negative = true;
            __CLR4_4_117tq17tqlb90pb0r.R.inc(57064);a = -a;
        }

        }__CLR4_4_117tq17tqlb90pb0r.R.inc(57065);double absAtanh;
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57066);if ((((a > 0.15)&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(57067)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(57068)==0&false))) {{
            __CLR4_4_117tq17tqlb90pb0r.R.inc(57069);absAtanh = 0.5 * FastMath.log((1 + a) / (1 - a));
        } }else {{
            __CLR4_4_117tq17tqlb90pb0r.R.inc(57070);final double a2 = a * a;
            __CLR4_4_117tq17tqlb90pb0r.R.inc(57071);if ((((a > 0.087)&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(57072)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(57073)==0&false))) {{
                __CLR4_4_117tq17tqlb90pb0r.R.inc(57074);absAtanh = a * (1 + a2 * (F_1_3 + a2 * (F_1_5 + a2 * (F_1_7 + a2 * (F_1_9 + a2 * (F_1_11 + a2 * (F_1_13 + a2 * (F_1_15 + a2 * F_1_17))))))));
            } }else {__CLR4_4_117tq17tqlb90pb0r.R.inc(57075);if ((((a > 0.031)&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(57076)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(57077)==0&false))) {{
                __CLR4_4_117tq17tqlb90pb0r.R.inc(57078);absAtanh = a * (1 + a2 * (F_1_3 + a2 * (F_1_5 + a2 * (F_1_7 + a2 * (F_1_9 + a2 * (F_1_11 + a2 * F_1_13))))));
            } }else {__CLR4_4_117tq17tqlb90pb0r.R.inc(57079);if ((((a > 0.003)&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(57080)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(57081)==0&false))) {{
                __CLR4_4_117tq17tqlb90pb0r.R.inc(57082);absAtanh = a * (1 + a2 * (F_1_3 + a2 * (F_1_5 + a2 * (F_1_7 + a2 * F_1_9))));
            } }else {{
                __CLR4_4_117tq17tqlb90pb0r.R.inc(57083);absAtanh = a * (1 + a2 * (F_1_3 + a2 * F_1_5));
            }
        }}}}

        }__CLR4_4_117tq17tqlb90pb0r.R.inc(57084);return (((negative )&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(57085)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(57086)==0&false))? -absAtanh : absAtanh;
    }finally{__CLR4_4_117tq17tqlb90pb0r.R.flushNeeded();}}

    /** Compute the signum of a number.
     * The signum is -1 for negative numbers, +1 for positive numbers and 0 otherwise
     * @param a number on which evaluation is done
     * @return -1.0, -0.0, +0.0, +1.0 or NaN depending on sign of a
     */
    public static double signum(final double a) {try{__CLR4_4_117tq17tqlb90pb0r.R.inc(57087);
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57088);return ((((a < 0.0) )&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(57089)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(57090)==0&false))? -1.0 : (((((a > 0.0) )&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(57091)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(57092)==0&false))? 1.0 : a); // return +0.0/-0.0/NaN depending on a
    }finally{__CLR4_4_117tq17tqlb90pb0r.R.flushNeeded();}}

    /** Compute the signum of a number.
     * The signum is -1 for negative numbers, +1 for positive numbers and 0 otherwise
     * @param a number on which evaluation is done
     * @return -1.0, -0.0, +0.0, +1.0 or NaN depending on sign of a
     */
    public static float signum(final float a) {try{__CLR4_4_117tq17tqlb90pb0r.R.inc(57093);
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57094);return ((((a < 0.0f) )&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(57095)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(57096)==0&false))? -1.0f : (((((a > 0.0f) )&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(57097)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(57098)==0&false))? 1.0f : a); // return +0.0/-0.0/NaN depending on a
    }finally{__CLR4_4_117tq17tqlb90pb0r.R.flushNeeded();}}

    /** Compute next number towards positive infinity.
     * @param a number to which neighbor should be computed
     * @return neighbor of a towards positive infinity
     */
    public static double nextUp(final double a) {try{__CLR4_4_117tq17tqlb90pb0r.R.inc(57099);
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57100);return nextAfter(a, Double.POSITIVE_INFINITY);
    }finally{__CLR4_4_117tq17tqlb90pb0r.R.flushNeeded();}}

    /** Compute next number towards positive infinity.
     * @param a number to which neighbor should be computed
     * @return neighbor of a towards positive infinity
     */
    public static float nextUp(final float a) {try{__CLR4_4_117tq17tqlb90pb0r.R.inc(57101);
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57102);return nextAfter(a, Float.POSITIVE_INFINITY);
    }finally{__CLR4_4_117tq17tqlb90pb0r.R.flushNeeded();}}

    /** Returns a pseudo-random number between 0.0 and 1.0.
     * <p><b>Note:</b> this implementation currently delegates to {@link Math#random}
     * @return a random number between 0.0 and 1.0
     */
    public static double random() {try{__CLR4_4_117tq17tqlb90pb0r.R.inc(57103);
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57104);return Math.random();
    }finally{__CLR4_4_117tq17tqlb90pb0r.R.flushNeeded();}}

    /**
     * Exponential function.
     *
     * Computes exp(x), function result is nearly rounded.   It will be correctly
     * rounded to the theoretical value for 99.9% of input values, otherwise it will
     * have a 1 UPL error.
     *
     * Method:
     *    Lookup intVal = exp(int(x))
     *    Lookup fracVal = exp(int(x-int(x) / 1024.0) * 1024.0 );
     *    Compute z as the exponential of the remaining bits by a polynomial minus one
     *    exp(x) = intVal * fracVal * (1 + z)
     *
     * Accuracy:
     *    Calculation is done with 63 bits of precision, so result should be correctly
     *    rounded for 99.9% of input values, with less than 1 ULP error otherwise.
     *
     * @param x   a double
     * @return double e<sup>x</sup>
     */
    public static double exp(double x) {try{__CLR4_4_117tq17tqlb90pb0r.R.inc(57105);
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57106);return exp(x, 0.0, null);
    }finally{__CLR4_4_117tq17tqlb90pb0r.R.flushNeeded();}}

    /**
     * Internal helper method for exponential function.
     * @param x original argument of the exponential function
     * @param extra extra bits of precision on input (To Be Confirmed)
     * @param hiPrec extra bits of precision on output (To Be Confirmed)
     * @return exp(x)
     */
    private static double exp(double x, double extra, double[] hiPrec) {try{__CLR4_4_117tq17tqlb90pb0r.R.inc(57107);
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57108);double intPartA;
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57109);double intPartB;
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57110);int intVal;

        /* Lookup exp(floor(x)).
         * intPartA will have the upper 22 bits, intPartB will have the lower
         * 52 bits.
         */
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57111);if ((((x < 0.0)&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(57112)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(57113)==0&false))) {{
            __CLR4_4_117tq17tqlb90pb0r.R.inc(57114);intVal = (int) -x;

            __CLR4_4_117tq17tqlb90pb0r.R.inc(57115);if ((((intVal > 746)&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(57116)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(57117)==0&false))) {{
                __CLR4_4_117tq17tqlb90pb0r.R.inc(57118);if ((((hiPrec != null)&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(57119)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(57120)==0&false))) {{
                    __CLR4_4_117tq17tqlb90pb0r.R.inc(57121);hiPrec[0] = 0.0;
                    __CLR4_4_117tq17tqlb90pb0r.R.inc(57122);hiPrec[1] = 0.0;
                }
                }__CLR4_4_117tq17tqlb90pb0r.R.inc(57123);return 0.0;
            }

            }__CLR4_4_117tq17tqlb90pb0r.R.inc(57124);if ((((intVal > 709)&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(57125)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(57126)==0&false))) {{
                /* This will produce a subnormal output */
                __CLR4_4_117tq17tqlb90pb0r.R.inc(57127);final double result = exp(x+40.19140625, extra, hiPrec) / 285040095144011776.0;
                __CLR4_4_117tq17tqlb90pb0r.R.inc(57128);if ((((hiPrec != null)&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(57129)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(57130)==0&false))) {{
                    __CLR4_4_117tq17tqlb90pb0r.R.inc(57131);hiPrec[0] /= 285040095144011776.0;
                    __CLR4_4_117tq17tqlb90pb0r.R.inc(57132);hiPrec[1] /= 285040095144011776.0;
                }
                }__CLR4_4_117tq17tqlb90pb0r.R.inc(57133);return result;
            }

            }__CLR4_4_117tq17tqlb90pb0r.R.inc(57134);if ((((intVal == 709)&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(57135)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(57136)==0&false))) {{
                /* exp(1.494140625) is nearly a machine number... */
                __CLR4_4_117tq17tqlb90pb0r.R.inc(57137);final double result = exp(x+1.494140625, extra, hiPrec) / 4.455505956692756620;
                __CLR4_4_117tq17tqlb90pb0r.R.inc(57138);if ((((hiPrec != null)&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(57139)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(57140)==0&false))) {{
                    __CLR4_4_117tq17tqlb90pb0r.R.inc(57141);hiPrec[0] /= 4.455505956692756620;
                    __CLR4_4_117tq17tqlb90pb0r.R.inc(57142);hiPrec[1] /= 4.455505956692756620;
                }
                }__CLR4_4_117tq17tqlb90pb0r.R.inc(57143);return result;
            }

            }__CLR4_4_117tq17tqlb90pb0r.R.inc(57144);intVal++;

            __CLR4_4_117tq17tqlb90pb0r.R.inc(57145);intPartA = ExpIntTable.EXP_INT_TABLE_A[EXP_INT_TABLE_MAX_INDEX-intVal];
            __CLR4_4_117tq17tqlb90pb0r.R.inc(57146);intPartB = ExpIntTable.EXP_INT_TABLE_B[EXP_INT_TABLE_MAX_INDEX-intVal];

            __CLR4_4_117tq17tqlb90pb0r.R.inc(57147);intVal = -intVal;
        } }else {{
            __CLR4_4_117tq17tqlb90pb0r.R.inc(57148);intVal = (int) x;

            __CLR4_4_117tq17tqlb90pb0r.R.inc(57149);if ((((intVal > 709)&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(57150)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(57151)==0&false))) {{
                __CLR4_4_117tq17tqlb90pb0r.R.inc(57152);if ((((hiPrec != null)&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(57153)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(57154)==0&false))) {{
                    __CLR4_4_117tq17tqlb90pb0r.R.inc(57155);hiPrec[0] = Double.POSITIVE_INFINITY;
                    __CLR4_4_117tq17tqlb90pb0r.R.inc(57156);hiPrec[1] = 0.0;
                }
                }__CLR4_4_117tq17tqlb90pb0r.R.inc(57157);return Double.POSITIVE_INFINITY;
            }

            }__CLR4_4_117tq17tqlb90pb0r.R.inc(57158);intPartA = ExpIntTable.EXP_INT_TABLE_A[EXP_INT_TABLE_MAX_INDEX+intVal];
            __CLR4_4_117tq17tqlb90pb0r.R.inc(57159);intPartB = ExpIntTable.EXP_INT_TABLE_B[EXP_INT_TABLE_MAX_INDEX+intVal];
        }

        /* Get the fractional part of x, find the greatest multiple of 2^-10 less than
         * x and look up the exp function of it.
         * fracPartA will have the upper 22 bits, fracPartB the lower 52 bits.
         */
        }__CLR4_4_117tq17tqlb90pb0r.R.inc(57160);final int intFrac = (int) ((x - intVal) * 1024.0);
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57161);final double fracPartA = ExpFracTable.EXP_FRAC_TABLE_A[intFrac];
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57162);final double fracPartB = ExpFracTable.EXP_FRAC_TABLE_B[intFrac];

        /* epsilon is the difference in x from the nearest multiple of 2^-10.  It
         * has a value in the range 0 <= epsilon < 2^-10.
         * Do the subtraction from x as the last step to avoid possible loss of percison.
         */
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57163);final double epsilon = x - (intVal + intFrac / 1024.0);

        /* Compute z = exp(epsilon) - 1.0 via a minimax polynomial.  z has
       full double precision (52 bits).  Since z < 2^-10, we will have
       62 bits of precision when combined with the contant 1.  This will be
       used in the last addition below to get proper rounding. */

        /* Remez generated polynomial.  Converges on the interval [0, 2^-10], error
       is less than 0.5 ULP */
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57164);double z = 0.04168701738764507;
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57165);z = z * epsilon + 0.1666666505023083;
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57166);z = z * epsilon + 0.5000000000042687;
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57167);z = z * epsilon + 1.0;
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57168);z = z * epsilon + -3.940510424527919E-20;

        /* Compute (intPartA+intPartB) * (fracPartA+fracPartB) by binomial
       expansion.
       tempA is exact since intPartA and intPartB only have 22 bits each.
       tempB will have 52 bits of precision.
         */
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57169);double tempA = intPartA * fracPartA;
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57170);double tempB = intPartA * fracPartB + intPartB * fracPartA + intPartB * fracPartB;

        /* Compute the result.  (1+z)(tempA+tempB).  Order of operations is
       important.  For accuracy add by increasing size.  tempA is exact and
       much larger than the others.  If there are extra bits specified from the
       pow() function, use them. */
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57171);final double tempC = tempB + tempA;
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57172);final double result;
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57173);if ((((extra != 0.0)&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(57174)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(57175)==0&false))) {{
            __CLR4_4_117tq17tqlb90pb0r.R.inc(57176);result = tempC*extra*z + tempC*extra + tempC*z + tempB + tempA;
        } }else {{
            __CLR4_4_117tq17tqlb90pb0r.R.inc(57177);result = tempC*z + tempB + tempA;
        }

        }__CLR4_4_117tq17tqlb90pb0r.R.inc(57178);if ((((hiPrec != null)&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(57179)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(57180)==0&false))) {{
            // If requesting high precision
            __CLR4_4_117tq17tqlb90pb0r.R.inc(57181);hiPrec[0] = tempA;
            __CLR4_4_117tq17tqlb90pb0r.R.inc(57182);hiPrec[1] = tempC*extra*z + tempC*extra + tempC*z + tempB;
        }

        }__CLR4_4_117tq17tqlb90pb0r.R.inc(57183);return result;
    }finally{__CLR4_4_117tq17tqlb90pb0r.R.flushNeeded();}}

    /** Compute exp(x) - 1
     * @param x number to compute shifted exponential
     * @return exp(x) - 1
     */
    public static double expm1(double x) {try{__CLR4_4_117tq17tqlb90pb0r.R.inc(57184);
      __CLR4_4_117tq17tqlb90pb0r.R.inc(57185);return expm1(x, null);
    }finally{__CLR4_4_117tq17tqlb90pb0r.R.flushNeeded();}}

    /** Internal helper method for expm1
     * @param x number to compute shifted exponential
     * @param hiPrecOut receive high precision result for -1.0 < x < 1.0
     * @return exp(x) - 1
     */
    private static double expm1(double x, double hiPrecOut[]) {try{__CLR4_4_117tq17tqlb90pb0r.R.inc(57186);
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57187);if ((((x != x || x == 0.0)&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(57188)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(57189)==0&false))) {{ // NaN or zero
            __CLR4_4_117tq17tqlb90pb0r.R.inc(57190);return x;
        }

        }__CLR4_4_117tq17tqlb90pb0r.R.inc(57191);if ((((x <= -1.0 || x >= 1.0)&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(57192)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(57193)==0&false))) {{
            // If not between +/- 1.0
            //return exp(x) - 1.0;
            __CLR4_4_117tq17tqlb90pb0r.R.inc(57194);double hiPrec[] = new double[2];
            __CLR4_4_117tq17tqlb90pb0r.R.inc(57195);exp(x, 0.0, hiPrec);
            __CLR4_4_117tq17tqlb90pb0r.R.inc(57196);if ((((x > 0.0)&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(57197)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(57198)==0&false))) {{
                __CLR4_4_117tq17tqlb90pb0r.R.inc(57199);return -1.0 + hiPrec[0] + hiPrec[1];
            } }else {{
                __CLR4_4_117tq17tqlb90pb0r.R.inc(57200);final double ra = -1.0 + hiPrec[0];
                __CLR4_4_117tq17tqlb90pb0r.R.inc(57201);double rb = -(ra + 1.0 - hiPrec[0]);
                __CLR4_4_117tq17tqlb90pb0r.R.inc(57202);rb += hiPrec[1];
                __CLR4_4_117tq17tqlb90pb0r.R.inc(57203);return ra + rb;
            }
        }}

        }__CLR4_4_117tq17tqlb90pb0r.R.inc(57204);double baseA;
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57205);double baseB;
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57206);double epsilon;
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57207);boolean negative = false;

        __CLR4_4_117tq17tqlb90pb0r.R.inc(57208);if ((((x < 0.0)&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(57209)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(57210)==0&false))) {{
            __CLR4_4_117tq17tqlb90pb0r.R.inc(57211);x = -x;
            __CLR4_4_117tq17tqlb90pb0r.R.inc(57212);negative = true;
        }

        }{
            __CLR4_4_117tq17tqlb90pb0r.R.inc(57213);int intFrac = (int) (x * 1024.0);
            __CLR4_4_117tq17tqlb90pb0r.R.inc(57214);double tempA = ExpFracTable.EXP_FRAC_TABLE_A[intFrac] - 1.0;
            __CLR4_4_117tq17tqlb90pb0r.R.inc(57215);double tempB = ExpFracTable.EXP_FRAC_TABLE_B[intFrac];

            __CLR4_4_117tq17tqlb90pb0r.R.inc(57216);double temp = tempA + tempB;
            __CLR4_4_117tq17tqlb90pb0r.R.inc(57217);tempB = -(temp - tempA - tempB);
            __CLR4_4_117tq17tqlb90pb0r.R.inc(57218);tempA = temp;

            __CLR4_4_117tq17tqlb90pb0r.R.inc(57219);temp = tempA * HEX_40000000;
            __CLR4_4_117tq17tqlb90pb0r.R.inc(57220);baseA = tempA + temp - temp;
            __CLR4_4_117tq17tqlb90pb0r.R.inc(57221);baseB = tempB + (tempA - baseA);

            __CLR4_4_117tq17tqlb90pb0r.R.inc(57222);epsilon = x - intFrac/1024.0;
        }


        /* Compute expm1(epsilon) */
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57223);double zb = 0.008336750013465571;
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57224);zb = zb * epsilon + 0.041666663879186654;
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57225);zb = zb * epsilon + 0.16666666666745392;
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57226);zb = zb * epsilon + 0.49999999999999994;
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57227);zb = zb * epsilon;
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57228);zb = zb * epsilon;

        __CLR4_4_117tq17tqlb90pb0r.R.inc(57229);double za = epsilon;
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57230);double temp = za + zb;
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57231);zb = -(temp - za - zb);
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57232);za = temp;

        __CLR4_4_117tq17tqlb90pb0r.R.inc(57233);temp = za * HEX_40000000;
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57234);temp = za + temp - temp;
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57235);zb += za - temp;
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57236);za = temp;

        /* Combine the parts.   expm1(a+b) = expm1(a) + expm1(b) + expm1(a)*expm1(b) */
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57237);double ya = za * baseA;
        //double yb = za*baseB + zb*baseA + zb*baseB;
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57238);temp = ya + za * baseB;
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57239);double yb = -(temp - ya - za * baseB);
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57240);ya = temp;

        __CLR4_4_117tq17tqlb90pb0r.R.inc(57241);temp = ya + zb * baseA;
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57242);yb += -(temp - ya - zb * baseA);
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57243);ya = temp;

        __CLR4_4_117tq17tqlb90pb0r.R.inc(57244);temp = ya + zb * baseB;
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57245);yb += -(temp - ya - zb*baseB);
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57246);ya = temp;

        //ya = ya + za + baseA;
        //yb = yb + zb + baseB;
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57247);temp = ya + baseA;
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57248);yb += -(temp - baseA - ya);
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57249);ya = temp;

        __CLR4_4_117tq17tqlb90pb0r.R.inc(57250);temp = ya + za;
        //yb += (ya > za) ? -(temp - ya - za) : -(temp - za - ya);
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57251);yb += -(temp - ya - za);
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57252);ya = temp;

        __CLR4_4_117tq17tqlb90pb0r.R.inc(57253);temp = ya + baseB;
        //yb += (ya > baseB) ? -(temp - ya - baseB) : -(temp - baseB - ya);
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57254);yb += -(temp - ya - baseB);
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57255);ya = temp;

        __CLR4_4_117tq17tqlb90pb0r.R.inc(57256);temp = ya + zb;
        //yb += (ya > zb) ? -(temp - ya - zb) : -(temp - zb - ya);
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57257);yb += -(temp - ya - zb);
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57258);ya = temp;

        __CLR4_4_117tq17tqlb90pb0r.R.inc(57259);if ((((negative)&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(57260)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(57261)==0&false))) {{
            /* Compute expm1(-x) = -expm1(x) / (expm1(x) + 1) */
            __CLR4_4_117tq17tqlb90pb0r.R.inc(57262);double denom = 1.0 + ya;
            __CLR4_4_117tq17tqlb90pb0r.R.inc(57263);double denomr = 1.0 / denom;
            __CLR4_4_117tq17tqlb90pb0r.R.inc(57264);double denomb = -(denom - 1.0 - ya) + yb;
            __CLR4_4_117tq17tqlb90pb0r.R.inc(57265);double ratio = ya * denomr;
            __CLR4_4_117tq17tqlb90pb0r.R.inc(57266);temp = ratio * HEX_40000000;
            __CLR4_4_117tq17tqlb90pb0r.R.inc(57267);final double ra = ratio + temp - temp;
            __CLR4_4_117tq17tqlb90pb0r.R.inc(57268);double rb = ratio - ra;

            __CLR4_4_117tq17tqlb90pb0r.R.inc(57269);temp = denom * HEX_40000000;
            __CLR4_4_117tq17tqlb90pb0r.R.inc(57270);za = denom + temp - temp;
            __CLR4_4_117tq17tqlb90pb0r.R.inc(57271);zb = denom - za;

            __CLR4_4_117tq17tqlb90pb0r.R.inc(57272);rb += (ya - za * ra - za * rb - zb * ra - zb * rb) * denomr;

            // f(x) = x/1+x
            // Compute f'(x)
            // Product rule:  d(uv) = du*v + u*dv
            // Chain rule:  d(f(g(x)) = f'(g(x))*f(g'(x))
            // d(1/x) = -1/(x*x)
            // d(1/1+x) = -1/( (1+x)^2) *  1 =  -1/((1+x)*(1+x))
            // d(x/1+x) = -x/((1+x)(1+x)) + 1/1+x = 1 / ((1+x)(1+x))

            // Adjust for yb
            __CLR4_4_117tq17tqlb90pb0r.R.inc(57273);rb += yb * denomr;                      // numerator
            __CLR4_4_117tq17tqlb90pb0r.R.inc(57274);rb += -ya * denomb * denomr * denomr;   // denominator

            // negate
            __CLR4_4_117tq17tqlb90pb0r.R.inc(57275);ya = -ra;
            __CLR4_4_117tq17tqlb90pb0r.R.inc(57276);yb = -rb;
        }

        }__CLR4_4_117tq17tqlb90pb0r.R.inc(57277);if ((((hiPrecOut != null)&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(57278)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(57279)==0&false))) {{
            __CLR4_4_117tq17tqlb90pb0r.R.inc(57280);hiPrecOut[0] = ya;
            __CLR4_4_117tq17tqlb90pb0r.R.inc(57281);hiPrecOut[1] = yb;
        }

        }__CLR4_4_117tq17tqlb90pb0r.R.inc(57282);return ya + yb;
    }finally{__CLR4_4_117tq17tqlb90pb0r.R.flushNeeded();}}

    /**
     * Natural logarithm.
     *
     * @param x   a double
     * @return log(x)
     */
    public static double log(final double x) {try{__CLR4_4_117tq17tqlb90pb0r.R.inc(57283);
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57284);return log(x, null);
    }finally{__CLR4_4_117tq17tqlb90pb0r.R.flushNeeded();}}

    /**
     * Internal helper method for natural logarithm function.
     * @param x original argument of the natural logarithm function
     * @param hiPrec extra bits of precision on output (To Be Confirmed)
     * @return log(x)
     */
    private static double log(final double x, final double[] hiPrec) {try{__CLR4_4_117tq17tqlb90pb0r.R.inc(57285);
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57286);if ((((x==0)&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(57287)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(57288)==0&false))) {{ // Handle special case of +0/-0
            __CLR4_4_117tq17tqlb90pb0r.R.inc(57289);return Double.NEGATIVE_INFINITY;
        }
        }__CLR4_4_117tq17tqlb90pb0r.R.inc(57290);long bits = Double.doubleToRawLongBits(x);

        /* Handle special cases of negative input, and NaN */
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57291);if ((((((bits & 0x8000000000000000L) != 0 || x != x) && x != 0.0)&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(57292)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(57293)==0&false))) {{
            __CLR4_4_117tq17tqlb90pb0r.R.inc(57294);if ((((hiPrec != null)&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(57295)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(57296)==0&false))) {{
                __CLR4_4_117tq17tqlb90pb0r.R.inc(57297);hiPrec[0] = Double.NaN;
            }

            }__CLR4_4_117tq17tqlb90pb0r.R.inc(57298);return Double.NaN;
        }

        /* Handle special cases of Positive infinity. */
        }__CLR4_4_117tq17tqlb90pb0r.R.inc(57299);if ((((x == Double.POSITIVE_INFINITY)&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(57300)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(57301)==0&false))) {{
            __CLR4_4_117tq17tqlb90pb0r.R.inc(57302);if ((((hiPrec != null)&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(57303)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(57304)==0&false))) {{
                __CLR4_4_117tq17tqlb90pb0r.R.inc(57305);hiPrec[0] = Double.POSITIVE_INFINITY;
            }

            }__CLR4_4_117tq17tqlb90pb0r.R.inc(57306);return Double.POSITIVE_INFINITY;
        }

        /* Extract the exponent */
        }__CLR4_4_117tq17tqlb90pb0r.R.inc(57307);int exp = (int)(bits >> 52)-1023;

        __CLR4_4_117tq17tqlb90pb0r.R.inc(57308);if (((((bits & 0x7ff0000000000000L) == 0)&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(57309)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(57310)==0&false))) {{
            // Subnormal!
            __CLR4_4_117tq17tqlb90pb0r.R.inc(57311);if ((((x == 0)&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(57312)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(57313)==0&false))) {{
                // Zero
                __CLR4_4_117tq17tqlb90pb0r.R.inc(57314);if ((((hiPrec != null)&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(57315)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(57316)==0&false))) {{
                    __CLR4_4_117tq17tqlb90pb0r.R.inc(57317);hiPrec[0] = Double.NEGATIVE_INFINITY;
                }

                }__CLR4_4_117tq17tqlb90pb0r.R.inc(57318);return Double.NEGATIVE_INFINITY;
            }

            /* Normalize the subnormal number. */
            }__CLR4_4_117tq17tqlb90pb0r.R.inc(57319);bits <<= 1;
            __CLR4_4_117tq17tqlb90pb0r.R.inc(57320);while ( ((((bits & 0x0010000000000000L) == 0)&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(57321)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(57322)==0&false))) {{
                __CLR4_4_117tq17tqlb90pb0r.R.inc(57323);--exp;
                __CLR4_4_117tq17tqlb90pb0r.R.inc(57324);bits <<= 1;
            }
        }}


        }__CLR4_4_117tq17tqlb90pb0r.R.inc(57325);if (((((exp == -1 || exp == 0) && x < 1.01 && x > 0.99 && hiPrec == null)&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(57326)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(57327)==0&false))) {{
            /* The normal method doesn't work well in the range [0.99, 1.01], so call do a straight
           polynomial expansion in higer precision. */

            /* Compute x - 1.0 and split it */
            __CLR4_4_117tq17tqlb90pb0r.R.inc(57328);double xa = x - 1.0;
            __CLR4_4_117tq17tqlb90pb0r.R.inc(57329);double xb = xa - x + 1.0;
            __CLR4_4_117tq17tqlb90pb0r.R.inc(57330);double tmp = xa * HEX_40000000;
            __CLR4_4_117tq17tqlb90pb0r.R.inc(57331);double aa = xa + tmp - tmp;
            __CLR4_4_117tq17tqlb90pb0r.R.inc(57332);double ab = xa - aa;
            __CLR4_4_117tq17tqlb90pb0r.R.inc(57333);xa = aa;
            __CLR4_4_117tq17tqlb90pb0r.R.inc(57334);xb = ab;

            __CLR4_4_117tq17tqlb90pb0r.R.inc(57335);final double[] lnCoef_last = LN_QUICK_COEF[LN_QUICK_COEF.length - 1];
            __CLR4_4_117tq17tqlb90pb0r.R.inc(57336);double ya = lnCoef_last[0];
            __CLR4_4_117tq17tqlb90pb0r.R.inc(57337);double yb = lnCoef_last[1];

            __CLR4_4_117tq17tqlb90pb0r.R.inc(57338);for (int i = LN_QUICK_COEF.length - 2; (((i >= 0)&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(57339)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(57340)==0&false)); i--) {{
                /* Multiply a = y * x */
                __CLR4_4_117tq17tqlb90pb0r.R.inc(57341);aa = ya * xa;
                __CLR4_4_117tq17tqlb90pb0r.R.inc(57342);ab = ya * xb + yb * xa + yb * xb;
                /* split, so now y = a */
                __CLR4_4_117tq17tqlb90pb0r.R.inc(57343);tmp = aa * HEX_40000000;
                __CLR4_4_117tq17tqlb90pb0r.R.inc(57344);ya = aa + tmp - tmp;
                __CLR4_4_117tq17tqlb90pb0r.R.inc(57345);yb = aa - ya + ab;

                /* Add  a = y + lnQuickCoef */
                __CLR4_4_117tq17tqlb90pb0r.R.inc(57346);final double[] lnCoef_i = LN_QUICK_COEF[i];
                __CLR4_4_117tq17tqlb90pb0r.R.inc(57347);aa = ya + lnCoef_i[0];
                __CLR4_4_117tq17tqlb90pb0r.R.inc(57348);ab = yb + lnCoef_i[1];
                /* Split y = a */
                __CLR4_4_117tq17tqlb90pb0r.R.inc(57349);tmp = aa * HEX_40000000;
                __CLR4_4_117tq17tqlb90pb0r.R.inc(57350);ya = aa + tmp - tmp;
                __CLR4_4_117tq17tqlb90pb0r.R.inc(57351);yb = aa - ya + ab;
            }

            /* Multiply a = y * x */
            }__CLR4_4_117tq17tqlb90pb0r.R.inc(57352);aa = ya * xa;
            __CLR4_4_117tq17tqlb90pb0r.R.inc(57353);ab = ya * xb + yb * xa + yb * xb;
            /* split, so now y = a */
            __CLR4_4_117tq17tqlb90pb0r.R.inc(57354);tmp = aa * HEX_40000000;
            __CLR4_4_117tq17tqlb90pb0r.R.inc(57355);ya = aa + tmp - tmp;
            __CLR4_4_117tq17tqlb90pb0r.R.inc(57356);yb = aa - ya + ab;

            __CLR4_4_117tq17tqlb90pb0r.R.inc(57357);return ya + yb;
        }

        // lnm is a log of a number in the range of 1.0 - 2.0, so 0 <= lnm < ln(2)
        }__CLR4_4_117tq17tqlb90pb0r.R.inc(57358);final double[] lnm = lnMant.LN_MANT[(int)((bits & 0x000ffc0000000000L) >> 42)];

        /*
    double epsilon = x / Double.longBitsToDouble(bits & 0xfffffc0000000000L);

    epsilon -= 1.0;
         */

        // y is the most significant 10 bits of the mantissa
        //double y = Double.longBitsToDouble(bits & 0xfffffc0000000000L);
        //double epsilon = (x - y) / y;
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57359);final double epsilon = (bits & 0x3ffffffffffL) / (TWO_POWER_52 + (bits & 0x000ffc0000000000L));

        __CLR4_4_117tq17tqlb90pb0r.R.inc(57360);double lnza = 0.0;
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57361);double lnzb = 0.0;

        __CLR4_4_117tq17tqlb90pb0r.R.inc(57362);if ((((hiPrec != null)&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(57363)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(57364)==0&false))) {{
            /* split epsilon -> x */
            __CLR4_4_117tq17tqlb90pb0r.R.inc(57365);double tmp = epsilon * HEX_40000000;
            __CLR4_4_117tq17tqlb90pb0r.R.inc(57366);double aa = epsilon + tmp - tmp;
            __CLR4_4_117tq17tqlb90pb0r.R.inc(57367);double ab = epsilon - aa;
            __CLR4_4_117tq17tqlb90pb0r.R.inc(57368);double xa = aa;
            __CLR4_4_117tq17tqlb90pb0r.R.inc(57369);double xb = ab;

            /* Need a more accurate epsilon, so adjust the division. */
            __CLR4_4_117tq17tqlb90pb0r.R.inc(57370);final double numer = bits & 0x3ffffffffffL;
            __CLR4_4_117tq17tqlb90pb0r.R.inc(57371);final double denom = TWO_POWER_52 + (bits & 0x000ffc0000000000L);
            __CLR4_4_117tq17tqlb90pb0r.R.inc(57372);aa = numer - xa*denom - xb * denom;
            __CLR4_4_117tq17tqlb90pb0r.R.inc(57373);xb += aa / denom;

            /* Remez polynomial evaluation */
            __CLR4_4_117tq17tqlb90pb0r.R.inc(57374);final double[] lnCoef_last = LN_HI_PREC_COEF[LN_HI_PREC_COEF.length-1];
            __CLR4_4_117tq17tqlb90pb0r.R.inc(57375);double ya = lnCoef_last[0];
            __CLR4_4_117tq17tqlb90pb0r.R.inc(57376);double yb = lnCoef_last[1];

            __CLR4_4_117tq17tqlb90pb0r.R.inc(57377);for (int i = LN_HI_PREC_COEF.length - 2; (((i >= 0)&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(57378)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(57379)==0&false)); i--) {{
                /* Multiply a = y * x */
                __CLR4_4_117tq17tqlb90pb0r.R.inc(57380);aa = ya * xa;
                __CLR4_4_117tq17tqlb90pb0r.R.inc(57381);ab = ya * xb + yb * xa + yb * xb;
                /* split, so now y = a */
                __CLR4_4_117tq17tqlb90pb0r.R.inc(57382);tmp = aa * HEX_40000000;
                __CLR4_4_117tq17tqlb90pb0r.R.inc(57383);ya = aa + tmp - tmp;
                __CLR4_4_117tq17tqlb90pb0r.R.inc(57384);yb = aa - ya + ab;

                /* Add  a = y + lnHiPrecCoef */
                __CLR4_4_117tq17tqlb90pb0r.R.inc(57385);final double[] lnCoef_i = LN_HI_PREC_COEF[i];
                __CLR4_4_117tq17tqlb90pb0r.R.inc(57386);aa = ya + lnCoef_i[0];
                __CLR4_4_117tq17tqlb90pb0r.R.inc(57387);ab = yb + lnCoef_i[1];
                /* Split y = a */
                __CLR4_4_117tq17tqlb90pb0r.R.inc(57388);tmp = aa * HEX_40000000;
                __CLR4_4_117tq17tqlb90pb0r.R.inc(57389);ya = aa + tmp - tmp;
                __CLR4_4_117tq17tqlb90pb0r.R.inc(57390);yb = aa - ya + ab;
            }

            /* Multiply a = y * x */
            }__CLR4_4_117tq17tqlb90pb0r.R.inc(57391);aa = ya * xa;
            __CLR4_4_117tq17tqlb90pb0r.R.inc(57392);ab = ya * xb + yb * xa + yb * xb;

            /* split, so now lnz = a */
            /*
      tmp = aa * 1073741824.0;
      lnza = aa + tmp - tmp;
      lnzb = aa - lnza + ab;
             */
            __CLR4_4_117tq17tqlb90pb0r.R.inc(57393);lnza = aa + ab;
            __CLR4_4_117tq17tqlb90pb0r.R.inc(57394);lnzb = -(lnza - aa - ab);
        } }else {{
            /* High precision not required.  Eval Remez polynomial
         using standard double precision */
            __CLR4_4_117tq17tqlb90pb0r.R.inc(57395);lnza = -0.16624882440418567;
            __CLR4_4_117tq17tqlb90pb0r.R.inc(57396);lnza = lnza * epsilon + 0.19999954120254515;
            __CLR4_4_117tq17tqlb90pb0r.R.inc(57397);lnza = lnza * epsilon + -0.2499999997677497;
            __CLR4_4_117tq17tqlb90pb0r.R.inc(57398);lnza = lnza * epsilon + 0.3333333333332802;
            __CLR4_4_117tq17tqlb90pb0r.R.inc(57399);lnza = lnza * epsilon + -0.5;
            __CLR4_4_117tq17tqlb90pb0r.R.inc(57400);lnza = lnza * epsilon + 1.0;
            __CLR4_4_117tq17tqlb90pb0r.R.inc(57401);lnza = lnza * epsilon;
        }

        /* Relative sizes:
         * lnzb     [0, 2.33E-10]
         * lnm[1]   [0, 1.17E-7]
         * ln2B*exp [0, 1.12E-4]
         * lnza      [0, 9.7E-4]
         * lnm[0]   [0, 0.692]
         * ln2A*exp [0, 709]
         */

        /* Compute the following sum:
         * lnzb + lnm[1] + ln2B*exp + lnza + lnm[0] + ln2A*exp;
         */

        //return lnzb + lnm[1] + ln2B*exp + lnza + lnm[0] + ln2A*exp;
        }__CLR4_4_117tq17tqlb90pb0r.R.inc(57402);double a = LN_2_A*exp;
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57403);double b = 0.0;
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57404);double c = a+lnm[0];
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57405);double d = -(c-a-lnm[0]);
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57406);a = c;
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57407);b = b + d;

        __CLR4_4_117tq17tqlb90pb0r.R.inc(57408);c = a + lnza;
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57409);d = -(c - a - lnza);
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57410);a = c;
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57411);b = b + d;

        __CLR4_4_117tq17tqlb90pb0r.R.inc(57412);c = a + LN_2_B*exp;
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57413);d = -(c - a - LN_2_B*exp);
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57414);a = c;
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57415);b = b + d;

        __CLR4_4_117tq17tqlb90pb0r.R.inc(57416);c = a + lnm[1];
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57417);d = -(c - a - lnm[1]);
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57418);a = c;
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57419);b = b + d;

        __CLR4_4_117tq17tqlb90pb0r.R.inc(57420);c = a + lnzb;
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57421);d = -(c - a - lnzb);
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57422);a = c;
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57423);b = b + d;

        __CLR4_4_117tq17tqlb90pb0r.R.inc(57424);if ((((hiPrec != null)&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(57425)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(57426)==0&false))) {{
            __CLR4_4_117tq17tqlb90pb0r.R.inc(57427);hiPrec[0] = a;
            __CLR4_4_117tq17tqlb90pb0r.R.inc(57428);hiPrec[1] = b;
        }

        }__CLR4_4_117tq17tqlb90pb0r.R.inc(57429);return a + b;
    }finally{__CLR4_4_117tq17tqlb90pb0r.R.flushNeeded();}}

    /**
     * Computes log(1 + x).
     *
     * @param x Number.
     * @return {@code log(1 + x)}.
     */
    public static double log1p(final double x) {try{__CLR4_4_117tq17tqlb90pb0r.R.inc(57430);
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57431);if ((((x == -1)&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(57432)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(57433)==0&false))) {{
            __CLR4_4_117tq17tqlb90pb0r.R.inc(57434);return Double.NEGATIVE_INFINITY;
        }

        }__CLR4_4_117tq17tqlb90pb0r.R.inc(57435);if ((((x == Double.POSITIVE_INFINITY)&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(57436)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(57437)==0&false))) {{
            __CLR4_4_117tq17tqlb90pb0r.R.inc(57438);return Double.POSITIVE_INFINITY;
        }

        }__CLR4_4_117tq17tqlb90pb0r.R.inc(57439);if ((((x > 1e-6 ||
            x < -1e-6)&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(57440)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(57441)==0&false))) {{
            __CLR4_4_117tq17tqlb90pb0r.R.inc(57442);final double xpa = 1 + x;
            __CLR4_4_117tq17tqlb90pb0r.R.inc(57443);final double xpb = -(xpa - 1 - x);

            __CLR4_4_117tq17tqlb90pb0r.R.inc(57444);final double[] hiPrec = new double[2];
            __CLR4_4_117tq17tqlb90pb0r.R.inc(57445);final double lores = log(xpa, hiPrec);
            __CLR4_4_117tq17tqlb90pb0r.R.inc(57446);if ((((Double.isInfinite(lores))&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(57447)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(57448)==0&false))) {{ // Don't allow this to be converted to NaN
                __CLR4_4_117tq17tqlb90pb0r.R.inc(57449);return lores;
            }

            // Do a taylor series expansion around xpa:
            //   f(x+y) = f(x) + f'(x) y + f''(x)/2 y^2
            }__CLR4_4_117tq17tqlb90pb0r.R.inc(57450);final double fx1 = xpb / xpa;
            __CLR4_4_117tq17tqlb90pb0r.R.inc(57451);final double epsilon = 0.5 * fx1 + 1;
            __CLR4_4_117tq17tqlb90pb0r.R.inc(57452);return epsilon * fx1 + hiPrec[1] + hiPrec[0];
        } }else {{
            // Value is small |x| < 1e6, do a Taylor series centered on 1.
            __CLR4_4_117tq17tqlb90pb0r.R.inc(57453);final double y = (x * F_1_3 - F_1_2) * x + 1;
            __CLR4_4_117tq17tqlb90pb0r.R.inc(57454);return y * x;
        }
    }}finally{__CLR4_4_117tq17tqlb90pb0r.R.flushNeeded();}}

    /** Compute the base 10 logarithm.
     * @param x a number
     * @return log10(x)
     */
    public static double log10(final double x) {try{__CLR4_4_117tq17tqlb90pb0r.R.inc(57455);
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57456);final double hiPrec[] = new double[2];

        __CLR4_4_117tq17tqlb90pb0r.R.inc(57457);final double lores = log(x, hiPrec);
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57458);if ((((Double.isInfinite(lores))&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(57459)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(57460)==0&false))){{ // don't allow this to be converted to NaN
            __CLR4_4_117tq17tqlb90pb0r.R.inc(57461);return lores;
        }

        }__CLR4_4_117tq17tqlb90pb0r.R.inc(57462);final double tmp = hiPrec[0] * HEX_40000000;
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57463);final double lna = hiPrec[0] + tmp - tmp;
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57464);final double lnb = hiPrec[0] - lna + hiPrec[1];

        __CLR4_4_117tq17tqlb90pb0r.R.inc(57465);final double rln10a = 0.4342944622039795;
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57466);final double rln10b = 1.9699272335463627E-8;

        __CLR4_4_117tq17tqlb90pb0r.R.inc(57467);return rln10b * lnb + rln10b * lna + rln10a * lnb + rln10a * lna;
    }finally{__CLR4_4_117tq17tqlb90pb0r.R.flushNeeded();}}

    /**
     * Computes the <a href="http://mathworld.wolfram.com/Logarithm.html">
     * logarithm</a> in a given base.
     *
     * Returns {@code NaN} if either argument is negative.
     * If {@code base} is 0 and {@code x} is positive, 0 is returned.
     * If {@code base} is positive and {@code x} is 0,
     * {@code Double.NEGATIVE_INFINITY} is returned.
     * If both arguments are 0, the result is {@code NaN}.
     *
     * @param base Base of the logarithm, must be greater than 0.
     * @param x Argument, must be greater than 0.
     * @return the value of the logarithm, i.e. the number {@code y} such that
     * <code>base<sup>y</sup> = x</code>.
     * @since 1.2 (previously in {@code MathUtils}, moved as of version 3.0)
     */
    public static double log(double base, double x) {try{__CLR4_4_117tq17tqlb90pb0r.R.inc(57468);
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57469);return log(x) / log(base);
    }finally{__CLR4_4_117tq17tqlb90pb0r.R.flushNeeded();}}

    /**
     * Power function.  Compute x^y.
     *
     * @param x   a double
     * @param y   a double
     * @return double
     */
    public static double pow(double x, double y) {try{__CLR4_4_117tq17tqlb90pb0r.R.inc(57470);
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57471);final double lns[] = new double[2];

        __CLR4_4_117tq17tqlb90pb0r.R.inc(57472);if ((((y == 0.0)&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(57473)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(57474)==0&false))) {{
            __CLR4_4_117tq17tqlb90pb0r.R.inc(57475);return 1.0;
        }

        }__CLR4_4_117tq17tqlb90pb0r.R.inc(57476);if ((((x != x)&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(57477)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(57478)==0&false))) {{ // X is NaN
            __CLR4_4_117tq17tqlb90pb0r.R.inc(57479);return x;
        }


        }__CLR4_4_117tq17tqlb90pb0r.R.inc(57480);if ((((x == 0)&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(57481)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(57482)==0&false))) {{
            __CLR4_4_117tq17tqlb90pb0r.R.inc(57483);long bits = Double.doubleToRawLongBits(x);
            __CLR4_4_117tq17tqlb90pb0r.R.inc(57484);if (((((bits & 0x8000000000000000L) != 0)&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(57485)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(57486)==0&false))) {{
                // -zero
                __CLR4_4_117tq17tqlb90pb0r.R.inc(57487);long yi = (long) y;

                __CLR4_4_117tq17tqlb90pb0r.R.inc(57488);if ((((y < 0 && y == yi && (yi & 1) == 1)&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(57489)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(57490)==0&false))) {{
                    __CLR4_4_117tq17tqlb90pb0r.R.inc(57491);return Double.NEGATIVE_INFINITY;
                }

                }__CLR4_4_117tq17tqlb90pb0r.R.inc(57492);if ((((y > 0 && y == yi && (yi & 1) == 1)&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(57493)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(57494)==0&false))) {{
                    __CLR4_4_117tq17tqlb90pb0r.R.inc(57495);return -0.0;
                }
            }}

            }__CLR4_4_117tq17tqlb90pb0r.R.inc(57496);if ((((y < 0)&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(57497)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(57498)==0&false))) {{
                __CLR4_4_117tq17tqlb90pb0r.R.inc(57499);return Double.POSITIVE_INFINITY;
            }
            }__CLR4_4_117tq17tqlb90pb0r.R.inc(57500);if ((((y > 0)&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(57501)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(57502)==0&false))) {{
                __CLR4_4_117tq17tqlb90pb0r.R.inc(57503);return 0.0;
            }

            }__CLR4_4_117tq17tqlb90pb0r.R.inc(57504);return Double.NaN;
        }

        }__CLR4_4_117tq17tqlb90pb0r.R.inc(57505);if ((((x == Double.POSITIVE_INFINITY)&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(57506)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(57507)==0&false))) {{
            __CLR4_4_117tq17tqlb90pb0r.R.inc(57508);if ((((y != y)&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(57509)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(57510)==0&false))) {{ // y is NaN
                __CLR4_4_117tq17tqlb90pb0r.R.inc(57511);return y;
            }
            }__CLR4_4_117tq17tqlb90pb0r.R.inc(57512);if ((((y < 0.0)&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(57513)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(57514)==0&false))) {{
                __CLR4_4_117tq17tqlb90pb0r.R.inc(57515);return 0.0;
            } }else {{
                __CLR4_4_117tq17tqlb90pb0r.R.inc(57516);return Double.POSITIVE_INFINITY;
            }
        }}

        }__CLR4_4_117tq17tqlb90pb0r.R.inc(57517);if ((((y == Double.POSITIVE_INFINITY)&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(57518)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(57519)==0&false))) {{
            __CLR4_4_117tq17tqlb90pb0r.R.inc(57520);if ((((x * x == 1.0)&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(57521)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(57522)==0&false))) {{
                __CLR4_4_117tq17tqlb90pb0r.R.inc(57523);return Double.NaN;
            }

            }__CLR4_4_117tq17tqlb90pb0r.R.inc(57524);if ((((x * x > 1.0)&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(57525)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(57526)==0&false))) {{
                __CLR4_4_117tq17tqlb90pb0r.R.inc(57527);return Double.POSITIVE_INFINITY;
            } }else {{
                __CLR4_4_117tq17tqlb90pb0r.R.inc(57528);return 0.0;
            }
        }}

        }__CLR4_4_117tq17tqlb90pb0r.R.inc(57529);if ((((x == Double.NEGATIVE_INFINITY)&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(57530)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(57531)==0&false))) {{
            __CLR4_4_117tq17tqlb90pb0r.R.inc(57532);if ((((y != y)&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(57533)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(57534)==0&false))) {{ // y is NaN
                __CLR4_4_117tq17tqlb90pb0r.R.inc(57535);return y;
            }

            }__CLR4_4_117tq17tqlb90pb0r.R.inc(57536);if ((((y < 0)&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(57537)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(57538)==0&false))) {{
                __CLR4_4_117tq17tqlb90pb0r.R.inc(57539);long yi = (long) y;
                __CLR4_4_117tq17tqlb90pb0r.R.inc(57540);if ((((y == yi && (yi & 1) == 1)&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(57541)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(57542)==0&false))) {{
                    __CLR4_4_117tq17tqlb90pb0r.R.inc(57543);return -0.0;
                }

                }__CLR4_4_117tq17tqlb90pb0r.R.inc(57544);return 0.0;
            }

            }__CLR4_4_117tq17tqlb90pb0r.R.inc(57545);if ((((y > 0)&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(57546)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(57547)==0&false)))  {{
                __CLR4_4_117tq17tqlb90pb0r.R.inc(57548);long yi = (long) y;
                __CLR4_4_117tq17tqlb90pb0r.R.inc(57549);if ((((y == yi && (yi & 1) == 1)&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(57550)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(57551)==0&false))) {{
                    __CLR4_4_117tq17tqlb90pb0r.R.inc(57552);return Double.NEGATIVE_INFINITY;
                }

                }__CLR4_4_117tq17tqlb90pb0r.R.inc(57553);return Double.POSITIVE_INFINITY;
            }
        }}

        }__CLR4_4_117tq17tqlb90pb0r.R.inc(57554);if ((((y == Double.NEGATIVE_INFINITY)&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(57555)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(57556)==0&false))) {{

            __CLR4_4_117tq17tqlb90pb0r.R.inc(57557);if ((((x * x == 1.0)&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(57558)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(57559)==0&false))) {{
                __CLR4_4_117tq17tqlb90pb0r.R.inc(57560);return Double.NaN;
            }

            }__CLR4_4_117tq17tqlb90pb0r.R.inc(57561);if ((((x * x < 1.0)&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(57562)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(57563)==0&false))) {{
                __CLR4_4_117tq17tqlb90pb0r.R.inc(57564);return Double.POSITIVE_INFINITY;
            } }else {{
                __CLR4_4_117tq17tqlb90pb0r.R.inc(57565);return 0.0;
            }
        }}

        /* Handle special case x<0 */
        }__CLR4_4_117tq17tqlb90pb0r.R.inc(57566);if ((((x < 0)&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(57567)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(57568)==0&false))) {{
            // y is an even integer in this case
            __CLR4_4_117tq17tqlb90pb0r.R.inc(57569);if ((((y >= TWO_POWER_53 || y <= -TWO_POWER_53)&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(57570)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(57571)==0&false))) {{
                __CLR4_4_117tq17tqlb90pb0r.R.inc(57572);return pow(-x, y);
            }

            }__CLR4_4_117tq17tqlb90pb0r.R.inc(57573);if ((((y == (long) y)&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(57574)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(57575)==0&false))) {{
                // If y is an integer
                __CLR4_4_117tq17tqlb90pb0r.R.inc(57576);return (((((long)y & 1) == 0 )&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(57577)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(57578)==0&false))? pow(-x, y) : -pow(-x, y);
            } }else {{
                __CLR4_4_117tq17tqlb90pb0r.R.inc(57579);return Double.NaN;
            }
        }}

        /* Split y into ya and yb such that y = ya+yb */
        }__CLR4_4_117tq17tqlb90pb0r.R.inc(57580);double ya;
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57581);double yb;
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57582);if ((((y < 8e298 && y > -8e298)&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(57583)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(57584)==0&false))) {{
            __CLR4_4_117tq17tqlb90pb0r.R.inc(57585);double tmp1 = y * HEX_40000000;
            __CLR4_4_117tq17tqlb90pb0r.R.inc(57586);ya = y + tmp1 - tmp1;
            __CLR4_4_117tq17tqlb90pb0r.R.inc(57587);yb = y - ya;
        } }else {{
            __CLR4_4_117tq17tqlb90pb0r.R.inc(57588);double tmp1 = y * 9.31322574615478515625E-10;
            __CLR4_4_117tq17tqlb90pb0r.R.inc(57589);double tmp2 = tmp1 * 9.31322574615478515625E-10;
            __CLR4_4_117tq17tqlb90pb0r.R.inc(57590);ya = (tmp1 + tmp2 - tmp1) * HEX_40000000 * HEX_40000000;
            __CLR4_4_117tq17tqlb90pb0r.R.inc(57591);yb = y - ya;
        }

        /* Compute ln(x) */
        }__CLR4_4_117tq17tqlb90pb0r.R.inc(57592);final double lores = log(x, lns);
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57593);if ((((Double.isInfinite(lores))&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(57594)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(57595)==0&false))){{ // don't allow this to be converted to NaN
            __CLR4_4_117tq17tqlb90pb0r.R.inc(57596);return lores;
        }

        }__CLR4_4_117tq17tqlb90pb0r.R.inc(57597);double lna = lns[0];
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57598);double lnb = lns[1];

        /* resplit lns */
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57599);double tmp1 = lna * HEX_40000000;
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57600);double tmp2 = lna + tmp1 - tmp1;
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57601);lnb += lna - tmp2;
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57602);lna = tmp2;

        // y*ln(x) = (aa+ab)
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57603);final double aa = lna * ya;
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57604);final double ab = lna * yb + lnb * ya + lnb * yb;

        __CLR4_4_117tq17tqlb90pb0r.R.inc(57605);lna = aa+ab;
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57606);lnb = -(lna - aa - ab);

        __CLR4_4_117tq17tqlb90pb0r.R.inc(57607);double z = 1.0 / 120.0;
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57608);z = z * lnb + (1.0 / 24.0);
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57609);z = z * lnb + (1.0 / 6.0);
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57610);z = z * lnb + 0.5;
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57611);z = z * lnb + 1.0;
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57612);z = z * lnb;

        __CLR4_4_117tq17tqlb90pb0r.R.inc(57613);final double result = exp(lna, z, null);
        //result = result + result * z;
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57614);return result;
    }finally{__CLR4_4_117tq17tqlb90pb0r.R.flushNeeded();}}


    /**
     * Raise a double to an int power.
     *
     * @param d Number to raise.
     * @param e Exponent.
     * @return d<sup>e</sup>
     * @since 3.1
     */
    public static double pow(double d, int e) {try{__CLR4_4_117tq17tqlb90pb0r.R.inc(57615);

        __CLR4_4_117tq17tqlb90pb0r.R.inc(57616);if ((((e == 0)&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(57617)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(57618)==0&false))) {{
            __CLR4_4_117tq17tqlb90pb0r.R.inc(57619);return 1.0;
        } }else {__CLR4_4_117tq17tqlb90pb0r.R.inc(57620);if ((((e < 0)&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(57621)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(57622)==0&false))) {{
            __CLR4_4_117tq17tqlb90pb0r.R.inc(57623);e = -e;
            __CLR4_4_117tq17tqlb90pb0r.R.inc(57624);d = 1.0 / d;
        }

        // split d as two 26 bits numbers
        // beware the following expressions must NOT be simplified, they rely on floating point arithmetic properties
        }}__CLR4_4_117tq17tqlb90pb0r.R.inc(57625);final int splitFactor = 0x8000001;
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57626);final double cd       = splitFactor * d;
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57627);final double d1High   = cd - (cd - d);
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57628);final double d1Low    = d - d1High;

        // prepare result
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57629);double resultHigh = 1;
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57630);double resultLow  = 0;

        // d^(2p)
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57631);double d2p     = d;
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57632);double d2pHigh = d1High;
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57633);double d2pLow  = d1Low;

        __CLR4_4_117tq17tqlb90pb0r.R.inc(57634);while ((((e != 0)&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(57635)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(57636)==0&false))) {{

            __CLR4_4_117tq17tqlb90pb0r.R.inc(57637);if (((((e & 0x1) != 0)&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(57638)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(57639)==0&false))) {{
                // accurate multiplication result = result * d^(2p) using Veltkamp TwoProduct algorithm
                // beware the following expressions must NOT be simplified, they rely on floating point arithmetic properties
                __CLR4_4_117tq17tqlb90pb0r.R.inc(57640);final double tmpHigh = resultHigh * d2p;
                __CLR4_4_117tq17tqlb90pb0r.R.inc(57641);final double cRH     = splitFactor * resultHigh;
                __CLR4_4_117tq17tqlb90pb0r.R.inc(57642);final double rHH     = cRH - (cRH - resultHigh);
                __CLR4_4_117tq17tqlb90pb0r.R.inc(57643);final double rHL     = resultHigh - rHH;
                __CLR4_4_117tq17tqlb90pb0r.R.inc(57644);final double tmpLow  = rHL * d2pLow - (((tmpHigh - rHH * d2pHigh) - rHL * d2pHigh) - rHH * d2pLow);
                __CLR4_4_117tq17tqlb90pb0r.R.inc(57645);resultHigh = tmpHigh;
                __CLR4_4_117tq17tqlb90pb0r.R.inc(57646);resultLow  = resultLow * d2p + tmpLow;
            }

            // accurate squaring d^(2(p+1)) = d^(2p) * d^(2p) using Veltkamp TwoProduct algorithm
            // beware the following expressions must NOT be simplified, they rely on floating point arithmetic properties
            }__CLR4_4_117tq17tqlb90pb0r.R.inc(57647);final double tmpHigh = d2pHigh * d2p;
            __CLR4_4_117tq17tqlb90pb0r.R.inc(57648);final double cD2pH   = splitFactor * d2pHigh;
            __CLR4_4_117tq17tqlb90pb0r.R.inc(57649);final double d2pHH   = cD2pH - (cD2pH - d2pHigh);
            __CLR4_4_117tq17tqlb90pb0r.R.inc(57650);final double d2pHL   = d2pHigh - d2pHH;
            __CLR4_4_117tq17tqlb90pb0r.R.inc(57651);final double tmpLow  = d2pHL * d2pLow - (((tmpHigh - d2pHH * d2pHigh) - d2pHL * d2pHigh) - d2pHH * d2pLow);
            __CLR4_4_117tq17tqlb90pb0r.R.inc(57652);final double cTmpH   = splitFactor * tmpHigh;
            __CLR4_4_117tq17tqlb90pb0r.R.inc(57653);d2pHigh = cTmpH - (cTmpH - tmpHigh);
            __CLR4_4_117tq17tqlb90pb0r.R.inc(57654);d2pLow  = d2pLow * d2p + tmpLow + (tmpHigh - d2pHigh);
            __CLR4_4_117tq17tqlb90pb0r.R.inc(57655);d2p     = d2pHigh + d2pLow;

            __CLR4_4_117tq17tqlb90pb0r.R.inc(57656);e = e >> 1;

        }

        }__CLR4_4_117tq17tqlb90pb0r.R.inc(57657);return resultHigh + resultLow;

    }finally{__CLR4_4_117tq17tqlb90pb0r.R.flushNeeded();}}

    /**
     *  Computes sin(x) - x, where |x| < 1/16.
     *  Use a Remez polynomial approximation.
     *  @param x a number smaller than 1/16
     *  @return sin(x) - x
     */
    private static double polySine(final double x)
    {try{__CLR4_4_117tq17tqlb90pb0r.R.inc(57658);
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57659);double x2 = x*x;

        __CLR4_4_117tq17tqlb90pb0r.R.inc(57660);double p = 2.7553817452272217E-6;
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57661);p = p * x2 + -1.9841269659586505E-4;
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57662);p = p * x2 + 0.008333333333329196;
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57663);p = p * x2 + -0.16666666666666666;
        //p *= x2;
        //p *= x;
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57664);p = p * x2 * x;

        __CLR4_4_117tq17tqlb90pb0r.R.inc(57665);return p;
    }finally{__CLR4_4_117tq17tqlb90pb0r.R.flushNeeded();}}

    /**
     *  Computes cos(x) - 1, where |x| < 1/16.
     *  Use a Remez polynomial approximation.
     *  @param x a number smaller than 1/16
     *  @return cos(x) - 1
     */
    private static double polyCosine(double x) {try{__CLR4_4_117tq17tqlb90pb0r.R.inc(57666);
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57667);double x2 = x*x;

        __CLR4_4_117tq17tqlb90pb0r.R.inc(57668);double p = 2.479773539153719E-5;
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57669);p = p * x2 + -0.0013888888689039883;
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57670);p = p * x2 + 0.041666666666621166;
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57671);p = p * x2 + -0.49999999999999994;
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57672);p *= x2;

        __CLR4_4_117tq17tqlb90pb0r.R.inc(57673);return p;
    }finally{__CLR4_4_117tq17tqlb90pb0r.R.flushNeeded();}}

    /**
     *  Compute sine over the first quadrant (0 < x < pi/2).
     *  Use combination of table lookup and rational polynomial expansion.
     *  @param xa number from which sine is requested
     *  @param xb extra bits for x (may be 0.0)
     *  @return sin(xa + xb)
     */
    private static double sinQ(double xa, double xb) {try{__CLR4_4_117tq17tqlb90pb0r.R.inc(57674);
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57675);int idx = (int) ((xa * 8.0) + 0.5);
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57676);final double epsilon = xa - EIGHTHS[idx]; //idx*0.125;

        // Table lookups
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57677);final double sintA = SINE_TABLE_A[idx];
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57678);final double sintB = SINE_TABLE_B[idx];
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57679);final double costA = COSINE_TABLE_A[idx];
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57680);final double costB = COSINE_TABLE_B[idx];

        // Polynomial eval of sin(epsilon), cos(epsilon)
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57681);double sinEpsA = epsilon;
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57682);double sinEpsB = polySine(epsilon);
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57683);final double cosEpsA = 1.0;
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57684);final double cosEpsB = polyCosine(epsilon);

        // Split epsilon   xa + xb = x
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57685);final double temp = sinEpsA * HEX_40000000;
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57686);double temp2 = (sinEpsA + temp) - temp;
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57687);sinEpsB +=  sinEpsA - temp2;
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57688);sinEpsA = temp2;

        /* Compute sin(x) by angle addition formula */
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57689);double result;

        /* Compute the following sum:
         *
         * result = sintA + costA*sinEpsA + sintA*cosEpsB + costA*sinEpsB +
         *          sintB + costB*sinEpsA + sintB*cosEpsB + costB*sinEpsB;
         *
         * Ranges of elements
         *
         * xxxtA   0            PI/2
         * xxxtB   -1.5e-9      1.5e-9
         * sinEpsA -0.0625      0.0625
         * sinEpsB -6e-11       6e-11
         * cosEpsA  1.0
         * cosEpsB  0           -0.0625
         *
         */

        //result = sintA + costA*sinEpsA + sintA*cosEpsB + costA*sinEpsB +
        //          sintB + costB*sinEpsA + sintB*cosEpsB + costB*sinEpsB;

        //result = sintA + sintA*cosEpsB + sintB + sintB * cosEpsB;
        //result += costA*sinEpsA + costA*sinEpsB + costB*sinEpsA + costB * sinEpsB;
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57690);double a = 0;
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57691);double b = 0;

        __CLR4_4_117tq17tqlb90pb0r.R.inc(57692);double t = sintA;
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57693);double c = a + t;
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57694);double d = -(c - a - t);
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57695);a = c;
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57696);b = b + d;

        __CLR4_4_117tq17tqlb90pb0r.R.inc(57697);t = costA * sinEpsA;
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57698);c = a + t;
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57699);d = -(c - a - t);
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57700);a = c;
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57701);b = b + d;

        __CLR4_4_117tq17tqlb90pb0r.R.inc(57702);b = b + sintA * cosEpsB + costA * sinEpsB;
        /*
    t = sintA*cosEpsB;
    c = a + t;
    d = -(c - a - t);
    a = c;
    b = b + d;

    t = costA*sinEpsB;
    c = a + t;
    d = -(c - a - t);
    a = c;
    b = b + d;
         */

        __CLR4_4_117tq17tqlb90pb0r.R.inc(57703);b = b + sintB + costB * sinEpsA + sintB * cosEpsB + costB * sinEpsB;
        /*
    t = sintB;
    c = a + t;
    d = -(c - a - t);
    a = c;
    b = b + d;

    t = costB*sinEpsA;
    c = a + t;
    d = -(c - a - t);
    a = c;
    b = b + d;

    t = sintB*cosEpsB;
    c = a + t;
    d = -(c - a - t);
    a = c;
    b = b + d;

    t = costB*sinEpsB;
    c = a + t;
    d = -(c - a - t);
    a = c;
    b = b + d;
         */

        __CLR4_4_117tq17tqlb90pb0r.R.inc(57704);if ((((xb != 0.0)&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(57705)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(57706)==0&false))) {{
            __CLR4_4_117tq17tqlb90pb0r.R.inc(57707);t = ((costA + costB) * (cosEpsA + cosEpsB) -
                 (sintA + sintB) * (sinEpsA + sinEpsB)) * xb;  // approximate cosine*xb
            __CLR4_4_117tq17tqlb90pb0r.R.inc(57708);c = a + t;
            __CLR4_4_117tq17tqlb90pb0r.R.inc(57709);d = -(c - a - t);
            __CLR4_4_117tq17tqlb90pb0r.R.inc(57710);a = c;
            __CLR4_4_117tq17tqlb90pb0r.R.inc(57711);b = b + d;
        }

        }__CLR4_4_117tq17tqlb90pb0r.R.inc(57712);result = a + b;

        __CLR4_4_117tq17tqlb90pb0r.R.inc(57713);return result;
    }finally{__CLR4_4_117tq17tqlb90pb0r.R.flushNeeded();}}

    /**
     * Compute cosine in the first quadrant by subtracting input from PI/2 and
     * then calling sinQ.  This is more accurate as the input approaches PI/2.
     *  @param xa number from which cosine is requested
     *  @param xb extra bits for x (may be 0.0)
     *  @return cos(xa + xb)
     */
    private static double cosQ(double xa, double xb) {try{__CLR4_4_117tq17tqlb90pb0r.R.inc(57714);
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57715);final double pi2a = 1.5707963267948966;
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57716);final double pi2b = 6.123233995736766E-17;

        __CLR4_4_117tq17tqlb90pb0r.R.inc(57717);final double a = pi2a - xa;
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57718);double b = -(a - pi2a + xa);
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57719);b += pi2b - xb;

        __CLR4_4_117tq17tqlb90pb0r.R.inc(57720);return sinQ(a, b);
    }finally{__CLR4_4_117tq17tqlb90pb0r.R.flushNeeded();}}

    /**
     *  Compute tangent (or cotangent) over the first quadrant.   0 < x < pi/2
     *  Use combination of table lookup and rational polynomial expansion.
     *  @param xa number from which sine is requested
     *  @param xb extra bits for x (may be 0.0)
     *  @param cotanFlag if true, compute the cotangent instead of the tangent
     *  @return tan(xa+xb) (or cotangent, depending on cotanFlag)
     */
    private static double tanQ(double xa, double xb, boolean cotanFlag) {try{__CLR4_4_117tq17tqlb90pb0r.R.inc(57721);

        __CLR4_4_117tq17tqlb90pb0r.R.inc(57722);int idx = (int) ((xa * 8.0) + 0.5);
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57723);final double epsilon = xa - EIGHTHS[idx]; //idx*0.125;

        // Table lookups
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57724);final double sintA = SINE_TABLE_A[idx];
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57725);final double sintB = SINE_TABLE_B[idx];
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57726);final double costA = COSINE_TABLE_A[idx];
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57727);final double costB = COSINE_TABLE_B[idx];

        // Polynomial eval of sin(epsilon), cos(epsilon)
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57728);double sinEpsA = epsilon;
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57729);double sinEpsB = polySine(epsilon);
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57730);final double cosEpsA = 1.0;
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57731);final double cosEpsB = polyCosine(epsilon);

        // Split epsilon   xa + xb = x
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57732);double temp = sinEpsA * HEX_40000000;
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57733);double temp2 = (sinEpsA + temp) - temp;
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57734);sinEpsB +=  sinEpsA - temp2;
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57735);sinEpsA = temp2;

        /* Compute sin(x) by angle addition formula */

        /* Compute the following sum:
         *
         * result = sintA + costA*sinEpsA + sintA*cosEpsB + costA*sinEpsB +
         *          sintB + costB*sinEpsA + sintB*cosEpsB + costB*sinEpsB;
         *
         * Ranges of elements
         *
         * xxxtA   0            PI/2
         * xxxtB   -1.5e-9      1.5e-9
         * sinEpsA -0.0625      0.0625
         * sinEpsB -6e-11       6e-11
         * cosEpsA  1.0
         * cosEpsB  0           -0.0625
         *
         */

        //result = sintA + costA*sinEpsA + sintA*cosEpsB + costA*sinEpsB +
        //          sintB + costB*sinEpsA + sintB*cosEpsB + costB*sinEpsB;

        //result = sintA + sintA*cosEpsB + sintB + sintB * cosEpsB;
        //result += costA*sinEpsA + costA*sinEpsB + costB*sinEpsA + costB * sinEpsB;
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57736);double a = 0;
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57737);double b = 0;

        // Compute sine
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57738);double t = sintA;
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57739);double c = a + t;
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57740);double d = -(c - a - t);
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57741);a = c;
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57742);b = b + d;

        __CLR4_4_117tq17tqlb90pb0r.R.inc(57743);t = costA*sinEpsA;
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57744);c = a + t;
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57745);d = -(c - a - t);
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57746);a = c;
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57747);b = b + d;

        __CLR4_4_117tq17tqlb90pb0r.R.inc(57748);b = b + sintA*cosEpsB + costA*sinEpsB;
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57749);b = b + sintB + costB*sinEpsA + sintB*cosEpsB + costB*sinEpsB;

        __CLR4_4_117tq17tqlb90pb0r.R.inc(57750);double sina = a + b;
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57751);double sinb = -(sina - a - b);

        // Compute cosine

        __CLR4_4_117tq17tqlb90pb0r.R.inc(57752);a = b = c = d = 0.0;

        __CLR4_4_117tq17tqlb90pb0r.R.inc(57753);t = costA*cosEpsA;
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57754);c = a + t;
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57755);d = -(c - a - t);
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57756);a = c;
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57757);b = b + d;

        __CLR4_4_117tq17tqlb90pb0r.R.inc(57758);t = -sintA*sinEpsA;
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57759);c = a + t;
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57760);d = -(c - a - t);
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57761);a = c;
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57762);b = b + d;

        __CLR4_4_117tq17tqlb90pb0r.R.inc(57763);b = b + costB*cosEpsA + costA*cosEpsB + costB*cosEpsB;
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57764);b = b - (sintB*sinEpsA + sintA*sinEpsB + sintB*sinEpsB);

        __CLR4_4_117tq17tqlb90pb0r.R.inc(57765);double cosa = a + b;
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57766);double cosb = -(cosa - a - b);

        __CLR4_4_117tq17tqlb90pb0r.R.inc(57767);if ((((cotanFlag)&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(57768)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(57769)==0&false))) {{
            __CLR4_4_117tq17tqlb90pb0r.R.inc(57770);double tmp;
            __CLR4_4_117tq17tqlb90pb0r.R.inc(57771);tmp = cosa; __CLR4_4_117tq17tqlb90pb0r.R.inc(57772);cosa = sina; __CLR4_4_117tq17tqlb90pb0r.R.inc(57773);sina = tmp;
            __CLR4_4_117tq17tqlb90pb0r.R.inc(57774);tmp = cosb; __CLR4_4_117tq17tqlb90pb0r.R.inc(57775);cosb = sinb; __CLR4_4_117tq17tqlb90pb0r.R.inc(57776);sinb = tmp;
        }


        /* estimate and correct, compute 1.0/(cosa+cosb) */
        /*
    double est = (sina+sinb)/(cosa+cosb);
    double err = (sina - cosa*est) + (sinb - cosb*est);
    est += err/(cosa+cosb);
    err = (sina - cosa*est) + (sinb - cosb*est);
         */

        // f(x) = 1/x,   f'(x) = -1/x^2

        }__CLR4_4_117tq17tqlb90pb0r.R.inc(57777);double est = sina/cosa;

        /* Split the estimate to get more accurate read on division rounding */
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57778);temp = est * HEX_40000000;
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57779);double esta = (est + temp) - temp;
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57780);double estb =  est - esta;

        __CLR4_4_117tq17tqlb90pb0r.R.inc(57781);temp = cosa * HEX_40000000;
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57782);double cosaa = (cosa + temp) - temp;
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57783);double cosab =  cosa - cosaa;

        //double err = (sina - est*cosa)/cosa;  // Correction for division rounding
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57784);double err = (sina - esta*cosaa - esta*cosab - estb*cosaa - estb*cosab)/cosa;  // Correction for division rounding
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57785);err += sinb/cosa;                     // Change in est due to sinb
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57786);err += -sina * cosb / cosa / cosa;    // Change in est due to cosb

        __CLR4_4_117tq17tqlb90pb0r.R.inc(57787);if ((((xb != 0.0)&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(57788)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(57789)==0&false))) {{
            // tan' = 1 + tan^2      cot' = -(1 + cot^2)
            // Approximate impact of xb
            __CLR4_4_117tq17tqlb90pb0r.R.inc(57790);double xbadj = xb + est*est*xb;
            __CLR4_4_117tq17tqlb90pb0r.R.inc(57791);if ((((cotanFlag)&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(57792)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(57793)==0&false))) {{
                __CLR4_4_117tq17tqlb90pb0r.R.inc(57794);xbadj = -xbadj;
            }

            }__CLR4_4_117tq17tqlb90pb0r.R.inc(57795);err += xbadj;
        }

        }__CLR4_4_117tq17tqlb90pb0r.R.inc(57796);return est+err;
    }finally{__CLR4_4_117tq17tqlb90pb0r.R.flushNeeded();}}

    /** Reduce the input argument using the Payne and Hanek method.
     *  This is good for all inputs 0.0 < x < inf
     *  Output is remainder after dividing by PI/2
     *  The result array should contain 3 numbers.
     *  result[0] is the integer portion, so mod 4 this gives the quadrant.
     *  result[1] is the upper bits of the remainder
     *  result[2] is the lower bits of the remainder
     *
     * @param x number to reduce
     * @param result placeholder where to put the result
     */
    private static void reducePayneHanek(double x, double result[])
    {try{__CLR4_4_117tq17tqlb90pb0r.R.inc(57797);
        /* Convert input double to bits */
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57798);long inbits = Double.doubleToRawLongBits(x);
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57799);int exponent = (int) ((inbits >> 52) & 0x7ff) - 1023;

        /* Convert to fixed point representation */
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57800);inbits &= 0x000fffffffffffffL;
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57801);inbits |= 0x0010000000000000L;

        /* Normalize input to be between 0.5 and 1.0 */
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57802);exponent++;
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57803);inbits <<= 11;

        /* Based on the exponent, get a shifted copy of recip2pi */
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57804);long shpi0;
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57805);long shpiA;
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57806);long shpiB;
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57807);int idx = exponent >> 6;
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57808);int shift = exponent - (idx << 6);

        __CLR4_4_117tq17tqlb90pb0r.R.inc(57809);if ((((shift != 0)&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(57810)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(57811)==0&false))) {{
            __CLR4_4_117tq17tqlb90pb0r.R.inc(57812);shpi0 = ((((idx == 0) )&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(57813)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(57814)==0&false))? 0 : (RECIP_2PI[idx-1] << shift);
            __CLR4_4_117tq17tqlb90pb0r.R.inc(57815);shpi0 |= RECIP_2PI[idx] >>> (64-shift);
            __CLR4_4_117tq17tqlb90pb0r.R.inc(57816);shpiA = (RECIP_2PI[idx] << shift) | (RECIP_2PI[idx+1] >>> (64-shift));
            __CLR4_4_117tq17tqlb90pb0r.R.inc(57817);shpiB = (RECIP_2PI[idx+1] << shift) | (RECIP_2PI[idx+2] >>> (64-shift));
        } }else {{
            __CLR4_4_117tq17tqlb90pb0r.R.inc(57818);shpi0 = ((((idx == 0) )&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(57819)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(57820)==0&false))? 0 : RECIP_2PI[idx-1];
            __CLR4_4_117tq17tqlb90pb0r.R.inc(57821);shpiA = RECIP_2PI[idx];
            __CLR4_4_117tq17tqlb90pb0r.R.inc(57822);shpiB = RECIP_2PI[idx+1];
        }

        /* Multiply input by shpiA */
        }__CLR4_4_117tq17tqlb90pb0r.R.inc(57823);long a = inbits >>> 32;
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57824);long b = inbits & 0xffffffffL;

        __CLR4_4_117tq17tqlb90pb0r.R.inc(57825);long c = shpiA >>> 32;
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57826);long d = shpiA & 0xffffffffL;

        __CLR4_4_117tq17tqlb90pb0r.R.inc(57827);long ac = a * c;
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57828);long bd = b * d;
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57829);long bc = b * c;
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57830);long ad = a * d;

        __CLR4_4_117tq17tqlb90pb0r.R.inc(57831);long prodB = bd + (ad << 32);
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57832);long prodA = ac + (ad >>> 32);

        __CLR4_4_117tq17tqlb90pb0r.R.inc(57833);boolean bita = (bd & 0x8000000000000000L) != 0;
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57834);boolean bitb = (ad & 0x80000000L ) != 0;
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57835);boolean bitsum = (prodB & 0x8000000000000000L) != 0;

        /* Carry */
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57836);if ( ((((bita && bitb) ||
                ((bita || bitb) && !bitsum) )&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(57837)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(57838)==0&false))) {{
            __CLR4_4_117tq17tqlb90pb0r.R.inc(57839);prodA++;
        }

        }__CLR4_4_117tq17tqlb90pb0r.R.inc(57840);bita = (prodB & 0x8000000000000000L) != 0;
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57841);bitb = (bc & 0x80000000L ) != 0;

        __CLR4_4_117tq17tqlb90pb0r.R.inc(57842);prodB = prodB + (bc << 32);
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57843);prodA = prodA + (bc >>> 32);

        __CLR4_4_117tq17tqlb90pb0r.R.inc(57844);bitsum = (prodB & 0x8000000000000000L) != 0;

        /* Carry */
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57845);if ( ((((bita && bitb) ||
                ((bita || bitb) && !bitsum) )&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(57846)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(57847)==0&false))) {{
            __CLR4_4_117tq17tqlb90pb0r.R.inc(57848);prodA++;
        }

        /* Multiply input by shpiB */
        }__CLR4_4_117tq17tqlb90pb0r.R.inc(57849);c = shpiB >>> 32;
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57850);d = shpiB & 0xffffffffL;
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57851);ac = a * c;
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57852);bc = b * c;
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57853);ad = a * d;

        /* Collect terms */
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57854);ac = ac + ((bc + ad) >>> 32);

        __CLR4_4_117tq17tqlb90pb0r.R.inc(57855);bita = (prodB & 0x8000000000000000L) != 0;
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57856);bitb = (ac & 0x8000000000000000L ) != 0;
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57857);prodB += ac;
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57858);bitsum = (prodB & 0x8000000000000000L) != 0;
        /* Carry */
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57859);if ( ((((bita && bitb) ||
                ((bita || bitb) && !bitsum) )&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(57860)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(57861)==0&false))) {{
            __CLR4_4_117tq17tqlb90pb0r.R.inc(57862);prodA++;
        }

        /* Multiply by shpi0 */
        }__CLR4_4_117tq17tqlb90pb0r.R.inc(57863);c = shpi0 >>> 32;
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57864);d = shpi0 & 0xffffffffL;

        __CLR4_4_117tq17tqlb90pb0r.R.inc(57865);bd = b * d;
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57866);bc = b * c;
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57867);ad = a * d;

        __CLR4_4_117tq17tqlb90pb0r.R.inc(57868);prodA += bd + ((bc + ad) << 32);

        /*
         * prodA, prodB now contain the remainder as a fraction of PI.  We want this as a fraction of
         * PI/2, so use the following steps:
         * 1.) multiply by 4.
         * 2.) do a fixed point muliply by PI/4.
         * 3.) Convert to floating point.
         * 4.) Multiply by 2
         */

        /* This identifies the quadrant */
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57869);int intPart = (int)(prodA >>> 62);

        /* Multiply by 4 */
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57870);prodA <<= 2;
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57871);prodA |= prodB >>> 62;
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57872);prodB <<= 2;

        /* Multiply by PI/4 */
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57873);a = prodA >>> 32;
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57874);b = prodA & 0xffffffffL;

        __CLR4_4_117tq17tqlb90pb0r.R.inc(57875);c = PI_O_4_BITS[0] >>> 32;
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57876);d = PI_O_4_BITS[0] & 0xffffffffL;

        __CLR4_4_117tq17tqlb90pb0r.R.inc(57877);ac = a * c;
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57878);bd = b * d;
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57879);bc = b * c;
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57880);ad = a * d;

        __CLR4_4_117tq17tqlb90pb0r.R.inc(57881);long prod2B = bd + (ad << 32);
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57882);long prod2A = ac + (ad >>> 32);

        __CLR4_4_117tq17tqlb90pb0r.R.inc(57883);bita = (bd & 0x8000000000000000L) != 0;
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57884);bitb = (ad & 0x80000000L ) != 0;
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57885);bitsum = (prod2B & 0x8000000000000000L) != 0;

        /* Carry */
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57886);if ( ((((bita && bitb) ||
                ((bita || bitb) && !bitsum) )&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(57887)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(57888)==0&false))) {{
            __CLR4_4_117tq17tqlb90pb0r.R.inc(57889);prod2A++;
        }

        }__CLR4_4_117tq17tqlb90pb0r.R.inc(57890);bita = (prod2B & 0x8000000000000000L) != 0;
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57891);bitb = (bc & 0x80000000L ) != 0;

        __CLR4_4_117tq17tqlb90pb0r.R.inc(57892);prod2B = prod2B + (bc << 32);
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57893);prod2A = prod2A + (bc >>> 32);

        __CLR4_4_117tq17tqlb90pb0r.R.inc(57894);bitsum = (prod2B & 0x8000000000000000L) != 0;

        /* Carry */
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57895);if ( ((((bita && bitb) ||
                ((bita || bitb) && !bitsum) )&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(57896)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(57897)==0&false))) {{
            __CLR4_4_117tq17tqlb90pb0r.R.inc(57898);prod2A++;
        }

        /* Multiply input by pio4bits[1] */
        }__CLR4_4_117tq17tqlb90pb0r.R.inc(57899);c = PI_O_4_BITS[1] >>> 32;
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57900);d = PI_O_4_BITS[1] & 0xffffffffL;
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57901);ac = a * c;
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57902);bc = b * c;
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57903);ad = a * d;

        /* Collect terms */
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57904);ac = ac + ((bc + ad) >>> 32);

        __CLR4_4_117tq17tqlb90pb0r.R.inc(57905);bita = (prod2B & 0x8000000000000000L) != 0;
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57906);bitb = (ac & 0x8000000000000000L ) != 0;
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57907);prod2B += ac;
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57908);bitsum = (prod2B & 0x8000000000000000L) != 0;
        /* Carry */
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57909);if ( ((((bita && bitb) ||
                ((bita || bitb) && !bitsum) )&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(57910)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(57911)==0&false))) {{
            __CLR4_4_117tq17tqlb90pb0r.R.inc(57912);prod2A++;
        }

        /* Multiply inputB by pio4bits[0] */
        }__CLR4_4_117tq17tqlb90pb0r.R.inc(57913);a = prodB >>> 32;
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57914);b = prodB & 0xffffffffL;
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57915);c = PI_O_4_BITS[0] >>> 32;
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57916);d = PI_O_4_BITS[0] & 0xffffffffL;
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57917);ac = a * c;
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57918);bc = b * c;
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57919);ad = a * d;

        /* Collect terms */
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57920);ac = ac + ((bc + ad) >>> 32);

        __CLR4_4_117tq17tqlb90pb0r.R.inc(57921);bita = (prod2B & 0x8000000000000000L) != 0;
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57922);bitb = (ac & 0x8000000000000000L ) != 0;
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57923);prod2B += ac;
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57924);bitsum = (prod2B & 0x8000000000000000L) != 0;
        /* Carry */
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57925);if ( ((((bita && bitb) ||
                ((bita || bitb) && !bitsum) )&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(57926)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(57927)==0&false))) {{
            __CLR4_4_117tq17tqlb90pb0r.R.inc(57928);prod2A++;
        }

        /* Convert to double */
        }__CLR4_4_117tq17tqlb90pb0r.R.inc(57929);double tmpA = (prod2A >>> 12) / TWO_POWER_52;  // High order 52 bits
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57930);double tmpB = (((prod2A & 0xfffL) << 40) + (prod2B >>> 24)) / TWO_POWER_52 / TWO_POWER_52; // Low bits

        __CLR4_4_117tq17tqlb90pb0r.R.inc(57931);double sumA = tmpA + tmpB;
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57932);double sumB = -(sumA - tmpA - tmpB);

        /* Multiply by PI/2 and return */
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57933);result[0] = intPart;
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57934);result[1] = sumA * 2.0;
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57935);result[2] = sumB * 2.0;
    }finally{__CLR4_4_117tq17tqlb90pb0r.R.flushNeeded();}}

    /**
     * Sine function.
     *
     * @param x Argument.
     * @return sin(x)
     */
    public static double sin(double x) {try{__CLR4_4_117tq17tqlb90pb0r.R.inc(57936);
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57937);boolean negative = false;
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57938);int quadrant = 0;
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57939);double xa;
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57940);double xb = 0.0;

        /* Take absolute value of the input */
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57941);xa = x;
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57942);if ((((x < 0)&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(57943)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(57944)==0&false))) {{
            __CLR4_4_117tq17tqlb90pb0r.R.inc(57945);negative = true;
            __CLR4_4_117tq17tqlb90pb0r.R.inc(57946);xa = -xa;
        }

        /* Check for zero and negative zero */
        }__CLR4_4_117tq17tqlb90pb0r.R.inc(57947);if ((((xa == 0.0)&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(57948)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(57949)==0&false))) {{
            __CLR4_4_117tq17tqlb90pb0r.R.inc(57950);long bits = Double.doubleToRawLongBits(x);
            __CLR4_4_117tq17tqlb90pb0r.R.inc(57951);if ((((bits < 0)&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(57952)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(57953)==0&false))) {{
                __CLR4_4_117tq17tqlb90pb0r.R.inc(57954);return -0.0;
            }
            }__CLR4_4_117tq17tqlb90pb0r.R.inc(57955);return 0.0;
        }

        }__CLR4_4_117tq17tqlb90pb0r.R.inc(57956);if ((((xa != xa || xa == Double.POSITIVE_INFINITY)&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(57957)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(57958)==0&false))) {{
            __CLR4_4_117tq17tqlb90pb0r.R.inc(57959);return Double.NaN;
        }

        /* Perform any argument reduction */
        }__CLR4_4_117tq17tqlb90pb0r.R.inc(57960);if ((((xa > 3294198.0)&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(57961)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(57962)==0&false))) {{
            // PI * (2**20)
            // Argument too big for CodyWaite reduction.  Must use
            // PayneHanek.
            __CLR4_4_117tq17tqlb90pb0r.R.inc(57963);double reduceResults[] = new double[3];
            __CLR4_4_117tq17tqlb90pb0r.R.inc(57964);reducePayneHanek(xa, reduceResults);
            __CLR4_4_117tq17tqlb90pb0r.R.inc(57965);quadrant = ((int) reduceResults[0]) & 3;
            __CLR4_4_117tq17tqlb90pb0r.R.inc(57966);xa = reduceResults[1];
            __CLR4_4_117tq17tqlb90pb0r.R.inc(57967);xb = reduceResults[2];
        } }else {__CLR4_4_117tq17tqlb90pb0r.R.inc(57968);if ((((xa > 1.5707963267948966)&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(57969)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(57970)==0&false))) {{
            __CLR4_4_117tq17tqlb90pb0r.R.inc(57971);final CodyWaite cw = new CodyWaite(xa);
            __CLR4_4_117tq17tqlb90pb0r.R.inc(57972);quadrant = cw.getK() & 3;
            __CLR4_4_117tq17tqlb90pb0r.R.inc(57973);xa = cw.getRemA();
            __CLR4_4_117tq17tqlb90pb0r.R.inc(57974);xb = cw.getRemB();
        }

        }}__CLR4_4_117tq17tqlb90pb0r.R.inc(57975);if ((((negative)&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(57976)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(57977)==0&false))) {{
            __CLR4_4_117tq17tqlb90pb0r.R.inc(57978);quadrant ^= 2;  // Flip bit 1
        }

        }boolean __CLB4_4_1_bool0=false;__CLR4_4_117tq17tqlb90pb0r.R.inc(57979);switch (quadrant) {
            case 0:if (!__CLB4_4_1_bool0) {__CLR4_4_117tq17tqlb90pb0r.R.inc(57980);__CLB4_4_1_bool0=true;}
                __CLR4_4_117tq17tqlb90pb0r.R.inc(57981);return sinQ(xa, xb);
            case 1:if (!__CLB4_4_1_bool0) {__CLR4_4_117tq17tqlb90pb0r.R.inc(57982);__CLB4_4_1_bool0=true;}
                __CLR4_4_117tq17tqlb90pb0r.R.inc(57983);return cosQ(xa, xb);
            case 2:if (!__CLB4_4_1_bool0) {__CLR4_4_117tq17tqlb90pb0r.R.inc(57984);__CLB4_4_1_bool0=true;}
                __CLR4_4_117tq17tqlb90pb0r.R.inc(57985);return -sinQ(xa, xb);
            case 3:if (!__CLB4_4_1_bool0) {__CLR4_4_117tq17tqlb90pb0r.R.inc(57986);__CLB4_4_1_bool0=true;}
                __CLR4_4_117tq17tqlb90pb0r.R.inc(57987);return -cosQ(xa, xb);
            default:if (!__CLB4_4_1_bool0) {__CLR4_4_117tq17tqlb90pb0r.R.inc(57988);__CLB4_4_1_bool0=true;}
                __CLR4_4_117tq17tqlb90pb0r.R.inc(57989);return Double.NaN;
        }
    }finally{__CLR4_4_117tq17tqlb90pb0r.R.flushNeeded();}}

    /**
     * Cosine function.
     *
     * @param x Argument.
     * @return cos(x)
     */
    public static double cos(double x) {try{__CLR4_4_117tq17tqlb90pb0r.R.inc(57990);
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57991);int quadrant = 0;

        /* Take absolute value of the input */
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57992);double xa = x;
        __CLR4_4_117tq17tqlb90pb0r.R.inc(57993);if ((((x < 0)&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(57994)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(57995)==0&false))) {{
            __CLR4_4_117tq17tqlb90pb0r.R.inc(57996);xa = -xa;
        }

        }__CLR4_4_117tq17tqlb90pb0r.R.inc(57997);if ((((xa != xa || xa == Double.POSITIVE_INFINITY)&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(57998)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(57999)==0&false))) {{
            __CLR4_4_117tq17tqlb90pb0r.R.inc(58000);return Double.NaN;
        }

        /* Perform any argument reduction */
        }__CLR4_4_117tq17tqlb90pb0r.R.inc(58001);double xb = 0;
        __CLR4_4_117tq17tqlb90pb0r.R.inc(58002);if ((((xa > 3294198.0)&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(58003)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(58004)==0&false))) {{
            // PI * (2**20)
            // Argument too big for CodyWaite reduction.  Must use
            // PayneHanek.
            __CLR4_4_117tq17tqlb90pb0r.R.inc(58005);double reduceResults[] = new double[3];
            __CLR4_4_117tq17tqlb90pb0r.R.inc(58006);reducePayneHanek(xa, reduceResults);
            __CLR4_4_117tq17tqlb90pb0r.R.inc(58007);quadrant = ((int) reduceResults[0]) & 3;
            __CLR4_4_117tq17tqlb90pb0r.R.inc(58008);xa = reduceResults[1];
            __CLR4_4_117tq17tqlb90pb0r.R.inc(58009);xb = reduceResults[2];
        } }else {__CLR4_4_117tq17tqlb90pb0r.R.inc(58010);if ((((xa > 1.5707963267948966)&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(58011)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(58012)==0&false))) {{
            __CLR4_4_117tq17tqlb90pb0r.R.inc(58013);final CodyWaite cw = new CodyWaite(xa);
            __CLR4_4_117tq17tqlb90pb0r.R.inc(58014);quadrant = cw.getK() & 3;
            __CLR4_4_117tq17tqlb90pb0r.R.inc(58015);xa = cw.getRemA();
            __CLR4_4_117tq17tqlb90pb0r.R.inc(58016);xb = cw.getRemB();
        }

        //if (negative)
        //  quadrant = (quadrant + 2) % 4;

        }}boolean __CLB4_4_1_bool1=false;__CLR4_4_117tq17tqlb90pb0r.R.inc(58017);switch (quadrant) {
            case 0:if (!__CLB4_4_1_bool1) {__CLR4_4_117tq17tqlb90pb0r.R.inc(58018);__CLB4_4_1_bool1=true;}
                __CLR4_4_117tq17tqlb90pb0r.R.inc(58019);return cosQ(xa, xb);
            case 1:if (!__CLB4_4_1_bool1) {__CLR4_4_117tq17tqlb90pb0r.R.inc(58020);__CLB4_4_1_bool1=true;}
                __CLR4_4_117tq17tqlb90pb0r.R.inc(58021);return -sinQ(xa, xb);
            case 2:if (!__CLB4_4_1_bool1) {__CLR4_4_117tq17tqlb90pb0r.R.inc(58022);__CLB4_4_1_bool1=true;}
                __CLR4_4_117tq17tqlb90pb0r.R.inc(58023);return -cosQ(xa, xb);
            case 3:if (!__CLB4_4_1_bool1) {__CLR4_4_117tq17tqlb90pb0r.R.inc(58024);__CLB4_4_1_bool1=true;}
                __CLR4_4_117tq17tqlb90pb0r.R.inc(58025);return sinQ(xa, xb);
            default:if (!__CLB4_4_1_bool1) {__CLR4_4_117tq17tqlb90pb0r.R.inc(58026);__CLB4_4_1_bool1=true;}
                __CLR4_4_117tq17tqlb90pb0r.R.inc(58027);return Double.NaN;
        }
    }finally{__CLR4_4_117tq17tqlb90pb0r.R.flushNeeded();}}

    /**
     * Tangent function.
     *
     * @param x Argument.
     * @return tan(x)
     */
    public static double tan(double x) {try{__CLR4_4_117tq17tqlb90pb0r.R.inc(58028);
        __CLR4_4_117tq17tqlb90pb0r.R.inc(58029);boolean negative = false;
        __CLR4_4_117tq17tqlb90pb0r.R.inc(58030);int quadrant = 0;

        /* Take absolute value of the input */
        __CLR4_4_117tq17tqlb90pb0r.R.inc(58031);double xa = x;
        __CLR4_4_117tq17tqlb90pb0r.R.inc(58032);if ((((x < 0)&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(58033)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(58034)==0&false))) {{
            __CLR4_4_117tq17tqlb90pb0r.R.inc(58035);negative = true;
            __CLR4_4_117tq17tqlb90pb0r.R.inc(58036);xa = -xa;
        }

        /* Check for zero and negative zero */
        }__CLR4_4_117tq17tqlb90pb0r.R.inc(58037);if ((((xa == 0.0)&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(58038)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(58039)==0&false))) {{
            __CLR4_4_117tq17tqlb90pb0r.R.inc(58040);long bits = Double.doubleToRawLongBits(x);
            __CLR4_4_117tq17tqlb90pb0r.R.inc(58041);if ((((bits < 0)&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(58042)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(58043)==0&false))) {{
                __CLR4_4_117tq17tqlb90pb0r.R.inc(58044);return -0.0;
            }
            }__CLR4_4_117tq17tqlb90pb0r.R.inc(58045);return 0.0;
        }

        }__CLR4_4_117tq17tqlb90pb0r.R.inc(58046);if ((((xa != xa || xa == Double.POSITIVE_INFINITY)&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(58047)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(58048)==0&false))) {{
            __CLR4_4_117tq17tqlb90pb0r.R.inc(58049);return Double.NaN;
        }

        /* Perform any argument reduction */
        }__CLR4_4_117tq17tqlb90pb0r.R.inc(58050);double xb = 0;
        __CLR4_4_117tq17tqlb90pb0r.R.inc(58051);if ((((xa > 3294198.0)&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(58052)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(58053)==0&false))) {{
            // PI * (2**20)
            // Argument too big for CodyWaite reduction.  Must use
            // PayneHanek.
            __CLR4_4_117tq17tqlb90pb0r.R.inc(58054);double reduceResults[] = new double[3];
            __CLR4_4_117tq17tqlb90pb0r.R.inc(58055);reducePayneHanek(xa, reduceResults);
            __CLR4_4_117tq17tqlb90pb0r.R.inc(58056);quadrant = ((int) reduceResults[0]) & 3;
            __CLR4_4_117tq17tqlb90pb0r.R.inc(58057);xa = reduceResults[1];
            __CLR4_4_117tq17tqlb90pb0r.R.inc(58058);xb = reduceResults[2];
        } }else {__CLR4_4_117tq17tqlb90pb0r.R.inc(58059);if ((((xa > 1.5707963267948966)&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(58060)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(58061)==0&false))) {{
            __CLR4_4_117tq17tqlb90pb0r.R.inc(58062);final CodyWaite cw = new CodyWaite(xa);
            __CLR4_4_117tq17tqlb90pb0r.R.inc(58063);quadrant = cw.getK() & 3;
            __CLR4_4_117tq17tqlb90pb0r.R.inc(58064);xa = cw.getRemA();
            __CLR4_4_117tq17tqlb90pb0r.R.inc(58065);xb = cw.getRemB();
        }

        }}__CLR4_4_117tq17tqlb90pb0r.R.inc(58066);if ((((xa > 1.5)&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(58067)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(58068)==0&false))) {{
            // Accuracy suffers between 1.5 and PI/2
            __CLR4_4_117tq17tqlb90pb0r.R.inc(58069);final double pi2a = 1.5707963267948966;
            __CLR4_4_117tq17tqlb90pb0r.R.inc(58070);final double pi2b = 6.123233995736766E-17;

            __CLR4_4_117tq17tqlb90pb0r.R.inc(58071);final double a = pi2a - xa;
            __CLR4_4_117tq17tqlb90pb0r.R.inc(58072);double b = -(a - pi2a + xa);
            __CLR4_4_117tq17tqlb90pb0r.R.inc(58073);b += pi2b - xb;

            __CLR4_4_117tq17tqlb90pb0r.R.inc(58074);xa = a + b;
            __CLR4_4_117tq17tqlb90pb0r.R.inc(58075);xb = -(xa - a - b);
            __CLR4_4_117tq17tqlb90pb0r.R.inc(58076);quadrant ^= 1;
            __CLR4_4_117tq17tqlb90pb0r.R.inc(58077);negative ^= true;
        }

        }__CLR4_4_117tq17tqlb90pb0r.R.inc(58078);double result;
        __CLR4_4_117tq17tqlb90pb0r.R.inc(58079);if (((((quadrant & 1) == 0)&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(58080)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(58081)==0&false))) {{
            __CLR4_4_117tq17tqlb90pb0r.R.inc(58082);result = tanQ(xa, xb, false);
        } }else {{
            __CLR4_4_117tq17tqlb90pb0r.R.inc(58083);result = -tanQ(xa, xb, true);
        }

        }__CLR4_4_117tq17tqlb90pb0r.R.inc(58084);if ((((negative)&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(58085)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(58086)==0&false))) {{
            __CLR4_4_117tq17tqlb90pb0r.R.inc(58087);result = -result;
        }

        }__CLR4_4_117tq17tqlb90pb0r.R.inc(58088);return result;
    }finally{__CLR4_4_117tq17tqlb90pb0r.R.flushNeeded();}}

    /**
     * Arctangent function
     *  @param x a number
     *  @return atan(x)
     */
    public static double atan(double x) {try{__CLR4_4_117tq17tqlb90pb0r.R.inc(58089);
        __CLR4_4_117tq17tqlb90pb0r.R.inc(58090);return atan(x, 0.0, false);
    }finally{__CLR4_4_117tq17tqlb90pb0r.R.flushNeeded();}}

    /** Internal helper function to compute arctangent.
     * @param xa number from which arctangent is requested
     * @param xb extra bits for x (may be 0.0)
     * @param leftPlane if true, result angle must be put in the left half plane
     * @return atan(xa + xb) (or angle shifted by {@code PI} if leftPlane is true)
     */
    private static double atan(double xa, double xb, boolean leftPlane) {try{__CLR4_4_117tq17tqlb90pb0r.R.inc(58091);
        __CLR4_4_117tq17tqlb90pb0r.R.inc(58092);boolean negate = false;
        __CLR4_4_117tq17tqlb90pb0r.R.inc(58093);int idx;

        __CLR4_4_117tq17tqlb90pb0r.R.inc(58094);if ((((xa == 0.0)&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(58095)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(58096)==0&false))) {{ // Matches +/- 0.0; return correct sign
            __CLR4_4_117tq17tqlb90pb0r.R.inc(58097);return (((leftPlane )&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(58098)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(58099)==0&false))? copySign(Math.PI, xa) : xa;
        }

        }__CLR4_4_117tq17tqlb90pb0r.R.inc(58100);if ((((xa < 0)&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(58101)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(58102)==0&false))) {{
            // negative
            __CLR4_4_117tq17tqlb90pb0r.R.inc(58103);xa = -xa;
            __CLR4_4_117tq17tqlb90pb0r.R.inc(58104);xb = -xb;
            __CLR4_4_117tq17tqlb90pb0r.R.inc(58105);negate = true;
        }

        }__CLR4_4_117tq17tqlb90pb0r.R.inc(58106);if ((((xa > 1.633123935319537E16)&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(58107)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(58108)==0&false))) {{ // Very large input
            __CLR4_4_117tq17tqlb90pb0r.R.inc(58109);return ((((negate ^ leftPlane) )&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(58110)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(58111)==0&false))? (-Math.PI * F_1_2) : (Math.PI * F_1_2);
        }

        /* Estimate the closest tabulated arctan value, compute eps = xa-tangentTable */
        }__CLR4_4_117tq17tqlb90pb0r.R.inc(58112);if ((((xa < 1)&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(58113)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(58114)==0&false))) {{
            __CLR4_4_117tq17tqlb90pb0r.R.inc(58115);idx = (int) (((-1.7168146928204136 * xa * xa + 8.0) * xa) + 0.5);
        } }else {{
            __CLR4_4_117tq17tqlb90pb0r.R.inc(58116);final double oneOverXa = 1 / xa;
            __CLR4_4_117tq17tqlb90pb0r.R.inc(58117);idx = (int) (-((-1.7168146928204136 * oneOverXa * oneOverXa + 8.0) * oneOverXa) + 13.07);
        }
        }__CLR4_4_117tq17tqlb90pb0r.R.inc(58118);double epsA = xa - TANGENT_TABLE_A[idx];
        __CLR4_4_117tq17tqlb90pb0r.R.inc(58119);double epsB = -(epsA - xa + TANGENT_TABLE_A[idx]);
        __CLR4_4_117tq17tqlb90pb0r.R.inc(58120);epsB += xb - TANGENT_TABLE_B[idx];

        __CLR4_4_117tq17tqlb90pb0r.R.inc(58121);double temp = epsA + epsB;
        __CLR4_4_117tq17tqlb90pb0r.R.inc(58122);epsB = -(temp - epsA - epsB);
        __CLR4_4_117tq17tqlb90pb0r.R.inc(58123);epsA = temp;

        /* Compute eps = eps / (1.0 + xa*tangent) */
        __CLR4_4_117tq17tqlb90pb0r.R.inc(58124);temp = xa * HEX_40000000;
        __CLR4_4_117tq17tqlb90pb0r.R.inc(58125);double ya = xa + temp - temp;
        __CLR4_4_117tq17tqlb90pb0r.R.inc(58126);double yb = xb + xa - ya;
        __CLR4_4_117tq17tqlb90pb0r.R.inc(58127);xa = ya;
        __CLR4_4_117tq17tqlb90pb0r.R.inc(58128);xb += yb;

        //if (idx > 8 || idx == 0)
        __CLR4_4_117tq17tqlb90pb0r.R.inc(58129);if ((((idx == 0)&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(58130)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(58131)==0&false))) {{
            /* If the slope of the arctan is gentle enough (< 0.45), this approximation will suffice */
            //double denom = 1.0 / (1.0 + xa*tangentTableA[idx] + xb*tangentTableA[idx] + xa*tangentTableB[idx] + xb*tangentTableB[idx]);
            __CLR4_4_117tq17tqlb90pb0r.R.inc(58132);final double denom = 1d / (1d + (xa + xb) * (TANGENT_TABLE_A[idx] + TANGENT_TABLE_B[idx]));
            //double denom = 1.0 / (1.0 + xa*tangentTableA[idx]);
            __CLR4_4_117tq17tqlb90pb0r.R.inc(58133);ya = epsA * denom;
            __CLR4_4_117tq17tqlb90pb0r.R.inc(58134);yb = epsB * denom;
        } }else {{
            __CLR4_4_117tq17tqlb90pb0r.R.inc(58135);double temp2 = xa * TANGENT_TABLE_A[idx];
            __CLR4_4_117tq17tqlb90pb0r.R.inc(58136);double za = 1d + temp2;
            __CLR4_4_117tq17tqlb90pb0r.R.inc(58137);double zb = -(za - 1d - temp2);
            __CLR4_4_117tq17tqlb90pb0r.R.inc(58138);temp2 = xb * TANGENT_TABLE_A[idx] + xa * TANGENT_TABLE_B[idx];
            __CLR4_4_117tq17tqlb90pb0r.R.inc(58139);temp = za + temp2;
            __CLR4_4_117tq17tqlb90pb0r.R.inc(58140);zb += -(temp - za - temp2);
            __CLR4_4_117tq17tqlb90pb0r.R.inc(58141);za = temp;

            __CLR4_4_117tq17tqlb90pb0r.R.inc(58142);zb += xb * TANGENT_TABLE_B[idx];
            __CLR4_4_117tq17tqlb90pb0r.R.inc(58143);ya = epsA / za;

            __CLR4_4_117tq17tqlb90pb0r.R.inc(58144);temp = ya * HEX_40000000;
            __CLR4_4_117tq17tqlb90pb0r.R.inc(58145);final double yaa = (ya + temp) - temp;
            __CLR4_4_117tq17tqlb90pb0r.R.inc(58146);final double yab = ya - yaa;

            __CLR4_4_117tq17tqlb90pb0r.R.inc(58147);temp = za * HEX_40000000;
            __CLR4_4_117tq17tqlb90pb0r.R.inc(58148);final double zaa = (za + temp) - temp;
            __CLR4_4_117tq17tqlb90pb0r.R.inc(58149);final double zab = za - zaa;

            /* Correct for rounding in division */
            __CLR4_4_117tq17tqlb90pb0r.R.inc(58150);yb = (epsA - yaa * zaa - yaa * zab - yab * zaa - yab * zab) / za;

            __CLR4_4_117tq17tqlb90pb0r.R.inc(58151);yb += -epsA * zb / za / za;
            __CLR4_4_117tq17tqlb90pb0r.R.inc(58152);yb += epsB / za;
        }


        }__CLR4_4_117tq17tqlb90pb0r.R.inc(58153);epsA = ya;
        __CLR4_4_117tq17tqlb90pb0r.R.inc(58154);epsB = yb;

        /* Evaluate polynomial */
        __CLR4_4_117tq17tqlb90pb0r.R.inc(58155);final double epsA2 = epsA * epsA;

        /*
    yb = -0.09001346640161823;
    yb = yb * epsA2 + 0.11110718400605211;
    yb = yb * epsA2 + -0.1428571349122913;
    yb = yb * epsA2 + 0.19999999999273194;
    yb = yb * epsA2 + -0.33333333333333093;
    yb = yb * epsA2 * epsA;
         */

        __CLR4_4_117tq17tqlb90pb0r.R.inc(58156);yb = 0.07490822288864472;
        __CLR4_4_117tq17tqlb90pb0r.R.inc(58157);yb = yb * epsA2 + -0.09088450866185192;
        __CLR4_4_117tq17tqlb90pb0r.R.inc(58158);yb = yb * epsA2 + 0.11111095942313305;
        __CLR4_4_117tq17tqlb90pb0r.R.inc(58159);yb = yb * epsA2 + -0.1428571423679182;
        __CLR4_4_117tq17tqlb90pb0r.R.inc(58160);yb = yb * epsA2 + 0.19999999999923582;
        __CLR4_4_117tq17tqlb90pb0r.R.inc(58161);yb = yb * epsA2 + -0.33333333333333287;
        __CLR4_4_117tq17tqlb90pb0r.R.inc(58162);yb = yb * epsA2 * epsA;


        __CLR4_4_117tq17tqlb90pb0r.R.inc(58163);ya = epsA;

        __CLR4_4_117tq17tqlb90pb0r.R.inc(58164);temp = ya + yb;
        __CLR4_4_117tq17tqlb90pb0r.R.inc(58165);yb = -(temp - ya - yb);
        __CLR4_4_117tq17tqlb90pb0r.R.inc(58166);ya = temp;

        /* Add in effect of epsB.   atan'(x) = 1/(1+x^2) */
        __CLR4_4_117tq17tqlb90pb0r.R.inc(58167);yb += epsB / (1d + epsA * epsA);

        //result = yb + eighths[idx] + ya;
        __CLR4_4_117tq17tqlb90pb0r.R.inc(58168);double za = EIGHTHS[idx] + ya;
        __CLR4_4_117tq17tqlb90pb0r.R.inc(58169);double zb = -(za - EIGHTHS[idx] - ya);
        __CLR4_4_117tq17tqlb90pb0r.R.inc(58170);temp = za + yb;
        __CLR4_4_117tq17tqlb90pb0r.R.inc(58171);zb += -(temp - za - yb);
        __CLR4_4_117tq17tqlb90pb0r.R.inc(58172);za = temp;

        __CLR4_4_117tq17tqlb90pb0r.R.inc(58173);double result = za + zb;

        __CLR4_4_117tq17tqlb90pb0r.R.inc(58174);if ((((leftPlane)&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(58175)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(58176)==0&false))) {{
            // Result is in the left plane
            __CLR4_4_117tq17tqlb90pb0r.R.inc(58177);final double resultb = -(result - za - zb);
            __CLR4_4_117tq17tqlb90pb0r.R.inc(58178);final double pia = 1.5707963267948966 * 2;
            __CLR4_4_117tq17tqlb90pb0r.R.inc(58179);final double pib = 6.123233995736766E-17 * 2;

            __CLR4_4_117tq17tqlb90pb0r.R.inc(58180);za = pia - result;
            __CLR4_4_117tq17tqlb90pb0r.R.inc(58181);zb = -(za - pia + result);
            __CLR4_4_117tq17tqlb90pb0r.R.inc(58182);zb += pib - resultb;

            __CLR4_4_117tq17tqlb90pb0r.R.inc(58183);result = za + zb;
        }


        }__CLR4_4_117tq17tqlb90pb0r.R.inc(58184);if ((((negate ^ leftPlane)&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(58185)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(58186)==0&false))) {{
            __CLR4_4_117tq17tqlb90pb0r.R.inc(58187);result = -result;
        }

        }__CLR4_4_117tq17tqlb90pb0r.R.inc(58188);return result;
    }finally{__CLR4_4_117tq17tqlb90pb0r.R.flushNeeded();}}

    /**
     * Two arguments arctangent function
     * @param y ordinate
     * @param x abscissa
     * @return phase angle of point (x,y) between {@code -PI} and {@code PI}
     */
    public static double atan2(double y, double x) {try{__CLR4_4_117tq17tqlb90pb0r.R.inc(58189);
        __CLR4_4_117tq17tqlb90pb0r.R.inc(58190);if ((((x != x || y != y)&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(58191)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(58192)==0&false))) {{
            __CLR4_4_117tq17tqlb90pb0r.R.inc(58193);return Double.NaN;
        }

        }__CLR4_4_117tq17tqlb90pb0r.R.inc(58194);if ((((y == 0)&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(58195)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(58196)==0&false))) {{
            __CLR4_4_117tq17tqlb90pb0r.R.inc(58197);final double result = x * y;
            __CLR4_4_117tq17tqlb90pb0r.R.inc(58198);final double invx = 1d / x;
            __CLR4_4_117tq17tqlb90pb0r.R.inc(58199);final double invy = 1d / y;

            __CLR4_4_117tq17tqlb90pb0r.R.inc(58200);if ((((invx == 0)&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(58201)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(58202)==0&false))) {{ // X is infinite
                __CLR4_4_117tq17tqlb90pb0r.R.inc(58203);if ((((x > 0)&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(58204)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(58205)==0&false))) {{
                    __CLR4_4_117tq17tqlb90pb0r.R.inc(58206);return y; // return +/- 0.0
                } }else {{
                    __CLR4_4_117tq17tqlb90pb0r.R.inc(58207);return copySign(Math.PI, y);
                }
            }}

            }__CLR4_4_117tq17tqlb90pb0r.R.inc(58208);if ((((x < 0 || invx < 0)&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(58209)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(58210)==0&false))) {{
                __CLR4_4_117tq17tqlb90pb0r.R.inc(58211);if ((((y < 0 || invy < 0)&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(58212)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(58213)==0&false))) {{
                    __CLR4_4_117tq17tqlb90pb0r.R.inc(58214);return -Math.PI;
                } }else {{
                    __CLR4_4_117tq17tqlb90pb0r.R.inc(58215);return Math.PI;
                }
            }} }else {{
                __CLR4_4_117tq17tqlb90pb0r.R.inc(58216);return result;
            }
        }}

        // y cannot now be zero

        }__CLR4_4_117tq17tqlb90pb0r.R.inc(58217);if ((((y == Double.POSITIVE_INFINITY)&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(58218)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(58219)==0&false))) {{
            __CLR4_4_117tq17tqlb90pb0r.R.inc(58220);if ((((x == Double.POSITIVE_INFINITY)&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(58221)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(58222)==0&false))) {{
                __CLR4_4_117tq17tqlb90pb0r.R.inc(58223);return Math.PI * F_1_4;
            }

            }__CLR4_4_117tq17tqlb90pb0r.R.inc(58224);if ((((x == Double.NEGATIVE_INFINITY)&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(58225)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(58226)==0&false))) {{
                __CLR4_4_117tq17tqlb90pb0r.R.inc(58227);return Math.PI * F_3_4;
            }

            }__CLR4_4_117tq17tqlb90pb0r.R.inc(58228);return Math.PI * F_1_2;
        }

        }__CLR4_4_117tq17tqlb90pb0r.R.inc(58229);if ((((y == Double.NEGATIVE_INFINITY)&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(58230)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(58231)==0&false))) {{
            __CLR4_4_117tq17tqlb90pb0r.R.inc(58232);if ((((x == Double.POSITIVE_INFINITY)&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(58233)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(58234)==0&false))) {{
                __CLR4_4_117tq17tqlb90pb0r.R.inc(58235);return -Math.PI * F_1_4;
            }

            }__CLR4_4_117tq17tqlb90pb0r.R.inc(58236);if ((((x == Double.NEGATIVE_INFINITY)&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(58237)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(58238)==0&false))) {{
                __CLR4_4_117tq17tqlb90pb0r.R.inc(58239);return -Math.PI * F_3_4;
            }

            }__CLR4_4_117tq17tqlb90pb0r.R.inc(58240);return -Math.PI * F_1_2;
        }

        }__CLR4_4_117tq17tqlb90pb0r.R.inc(58241);if ((((x == Double.POSITIVE_INFINITY)&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(58242)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(58243)==0&false))) {{
            __CLR4_4_117tq17tqlb90pb0r.R.inc(58244);if ((((y > 0 || 1 / y > 0)&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(58245)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(58246)==0&false))) {{
                __CLR4_4_117tq17tqlb90pb0r.R.inc(58247);return 0d;
            }

            }__CLR4_4_117tq17tqlb90pb0r.R.inc(58248);if ((((y < 0 || 1 / y < 0)&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(58249)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(58250)==0&false))) {{
                __CLR4_4_117tq17tqlb90pb0r.R.inc(58251);return -0d;
            }
        }}

        }__CLR4_4_117tq17tqlb90pb0r.R.inc(58252);if ((((x == Double.NEGATIVE_INFINITY)&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(58253)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(58254)==0&false)))
        {{
            __CLR4_4_117tq17tqlb90pb0r.R.inc(58255);if ((((y > 0.0 || 1 / y > 0.0)&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(58256)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(58257)==0&false))) {{
                __CLR4_4_117tq17tqlb90pb0r.R.inc(58258);return Math.PI;
            }

            }__CLR4_4_117tq17tqlb90pb0r.R.inc(58259);if ((((y < 0 || 1 / y < 0)&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(58260)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(58261)==0&false))) {{
                __CLR4_4_117tq17tqlb90pb0r.R.inc(58262);return -Math.PI;
            }
        }}

        // Neither y nor x can be infinite or NAN here

        }__CLR4_4_117tq17tqlb90pb0r.R.inc(58263);if ((((x == 0)&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(58264)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(58265)==0&false))) {{
            __CLR4_4_117tq17tqlb90pb0r.R.inc(58266);if ((((y > 0 || 1 / y > 0)&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(58267)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(58268)==0&false))) {{
                __CLR4_4_117tq17tqlb90pb0r.R.inc(58269);return Math.PI * F_1_2;
            }

            }__CLR4_4_117tq17tqlb90pb0r.R.inc(58270);if ((((y < 0 || 1 / y < 0)&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(58271)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(58272)==0&false))) {{
                __CLR4_4_117tq17tqlb90pb0r.R.inc(58273);return -Math.PI * F_1_2;
            }
        }}

        // Compute ratio r = y/x
        }__CLR4_4_117tq17tqlb90pb0r.R.inc(58274);final double r = y / x;
        __CLR4_4_117tq17tqlb90pb0r.R.inc(58275);if ((((Double.isInfinite(r))&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(58276)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(58277)==0&false))) {{ // bypass calculations that can create NaN
            __CLR4_4_117tq17tqlb90pb0r.R.inc(58278);return atan(r, 0, x < 0);
        }

        }__CLR4_4_117tq17tqlb90pb0r.R.inc(58279);double ra = doubleHighPart(r);
        __CLR4_4_117tq17tqlb90pb0r.R.inc(58280);double rb = r - ra;

        // Split x
        __CLR4_4_117tq17tqlb90pb0r.R.inc(58281);final double xa = doubleHighPart(x);
        __CLR4_4_117tq17tqlb90pb0r.R.inc(58282);final double xb = x - xa;

        __CLR4_4_117tq17tqlb90pb0r.R.inc(58283);rb += (y - ra * xa - ra * xb - rb * xa - rb * xb) / x;

        __CLR4_4_117tq17tqlb90pb0r.R.inc(58284);final double temp = ra + rb;
        __CLR4_4_117tq17tqlb90pb0r.R.inc(58285);rb = -(temp - ra - rb);
        __CLR4_4_117tq17tqlb90pb0r.R.inc(58286);ra = temp;

        __CLR4_4_117tq17tqlb90pb0r.R.inc(58287);if ((((ra == 0)&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(58288)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(58289)==0&false))) {{ // Fix up the sign so atan works correctly
            __CLR4_4_117tq17tqlb90pb0r.R.inc(58290);ra = copySign(0d, y);
        }

        // Call atan
        }__CLR4_4_117tq17tqlb90pb0r.R.inc(58291);final double result = atan(ra, rb, x < 0);

        __CLR4_4_117tq17tqlb90pb0r.R.inc(58292);return result;
    }finally{__CLR4_4_117tq17tqlb90pb0r.R.flushNeeded();}}

    /** Compute the arc sine of a number.
     * @param x number on which evaluation is done
     * @return arc sine of x
     */
    public static double asin(double x) {try{__CLR4_4_117tq17tqlb90pb0r.R.inc(58293);
      __CLR4_4_117tq17tqlb90pb0r.R.inc(58294);if ((((x != x)&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(58295)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(58296)==0&false))) {{
          __CLR4_4_117tq17tqlb90pb0r.R.inc(58297);return Double.NaN;
      }

      }__CLR4_4_117tq17tqlb90pb0r.R.inc(58298);if ((((x > 1.0 || x < -1.0)&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(58299)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(58300)==0&false))) {{
          __CLR4_4_117tq17tqlb90pb0r.R.inc(58301);return Double.NaN;
      }

      }__CLR4_4_117tq17tqlb90pb0r.R.inc(58302);if ((((x == 1.0)&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(58303)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(58304)==0&false))) {{
          __CLR4_4_117tq17tqlb90pb0r.R.inc(58305);return Math.PI/2.0;
      }

      }__CLR4_4_117tq17tqlb90pb0r.R.inc(58306);if ((((x == -1.0)&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(58307)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(58308)==0&false))) {{
          __CLR4_4_117tq17tqlb90pb0r.R.inc(58309);return -Math.PI/2.0;
      }

      }__CLR4_4_117tq17tqlb90pb0r.R.inc(58310);if ((((x == 0.0)&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(58311)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(58312)==0&false))) {{ // Matches +/- 0.0; return correct sign
          __CLR4_4_117tq17tqlb90pb0r.R.inc(58313);return x;
      }

      /* Compute asin(x) = atan(x/sqrt(1-x*x)) */

      /* Split x */
      }__CLR4_4_117tq17tqlb90pb0r.R.inc(58314);double temp = x * HEX_40000000;
      __CLR4_4_117tq17tqlb90pb0r.R.inc(58315);final double xa = x + temp - temp;
      __CLR4_4_117tq17tqlb90pb0r.R.inc(58316);final double xb = x - xa;

      /* Square it */
      __CLR4_4_117tq17tqlb90pb0r.R.inc(58317);double ya = xa*xa;
      __CLR4_4_117tq17tqlb90pb0r.R.inc(58318);double yb = xa*xb*2.0 + xb*xb;

      /* Subtract from 1 */
      __CLR4_4_117tq17tqlb90pb0r.R.inc(58319);ya = -ya;
      __CLR4_4_117tq17tqlb90pb0r.R.inc(58320);yb = -yb;

      __CLR4_4_117tq17tqlb90pb0r.R.inc(58321);double za = 1.0 + ya;
      __CLR4_4_117tq17tqlb90pb0r.R.inc(58322);double zb = -(za - 1.0 - ya);

      __CLR4_4_117tq17tqlb90pb0r.R.inc(58323);temp = za + yb;
      __CLR4_4_117tq17tqlb90pb0r.R.inc(58324);zb += -(temp - za - yb);
      __CLR4_4_117tq17tqlb90pb0r.R.inc(58325);za = temp;

      /* Square root */
      __CLR4_4_117tq17tqlb90pb0r.R.inc(58326);double y;
      __CLR4_4_117tq17tqlb90pb0r.R.inc(58327);y = sqrt(za);
      __CLR4_4_117tq17tqlb90pb0r.R.inc(58328);temp = y * HEX_40000000;
      __CLR4_4_117tq17tqlb90pb0r.R.inc(58329);ya = y + temp - temp;
      __CLR4_4_117tq17tqlb90pb0r.R.inc(58330);yb = y - ya;

      /* Extend precision of sqrt */
      __CLR4_4_117tq17tqlb90pb0r.R.inc(58331);yb += (za - ya*ya - 2*ya*yb - yb*yb) / (2.0*y);

      /* Contribution of zb to sqrt */
      __CLR4_4_117tq17tqlb90pb0r.R.inc(58332);double dx = zb / (2.0*y);

      // Compute ratio r = x/y
      __CLR4_4_117tq17tqlb90pb0r.R.inc(58333);double r = x/y;
      __CLR4_4_117tq17tqlb90pb0r.R.inc(58334);temp = r * HEX_40000000;
      __CLR4_4_117tq17tqlb90pb0r.R.inc(58335);double ra = r + temp - temp;
      __CLR4_4_117tq17tqlb90pb0r.R.inc(58336);double rb = r - ra;

      __CLR4_4_117tq17tqlb90pb0r.R.inc(58337);rb += (x - ra*ya - ra*yb - rb*ya - rb*yb) / y;  // Correct for rounding in division
      __CLR4_4_117tq17tqlb90pb0r.R.inc(58338);rb += -x * dx / y / y;  // Add in effect additional bits of sqrt.

      __CLR4_4_117tq17tqlb90pb0r.R.inc(58339);temp = ra + rb;
      __CLR4_4_117tq17tqlb90pb0r.R.inc(58340);rb = -(temp - ra - rb);
      __CLR4_4_117tq17tqlb90pb0r.R.inc(58341);ra = temp;

      __CLR4_4_117tq17tqlb90pb0r.R.inc(58342);return atan(ra, rb, false);
    }finally{__CLR4_4_117tq17tqlb90pb0r.R.flushNeeded();}}

    /** Compute the arc cosine of a number.
     * @param x number on which evaluation is done
     * @return arc cosine of x
     */
    public static double acos(double x) {try{__CLR4_4_117tq17tqlb90pb0r.R.inc(58343);
      __CLR4_4_117tq17tqlb90pb0r.R.inc(58344);if ((((x != x)&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(58345)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(58346)==0&false))) {{
          __CLR4_4_117tq17tqlb90pb0r.R.inc(58347);return Double.NaN;
      }

      }__CLR4_4_117tq17tqlb90pb0r.R.inc(58348);if ((((x > 1.0 || x < -1.0)&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(58349)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(58350)==0&false))) {{
          __CLR4_4_117tq17tqlb90pb0r.R.inc(58351);return Double.NaN;
      }

      }__CLR4_4_117tq17tqlb90pb0r.R.inc(58352);if ((((x == -1.0)&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(58353)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(58354)==0&false))) {{
          __CLR4_4_117tq17tqlb90pb0r.R.inc(58355);return Math.PI;
      }

      }__CLR4_4_117tq17tqlb90pb0r.R.inc(58356);if ((((x == 1.0)&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(58357)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(58358)==0&false))) {{
          __CLR4_4_117tq17tqlb90pb0r.R.inc(58359);return 0.0;
      }

      }__CLR4_4_117tq17tqlb90pb0r.R.inc(58360);if ((((x == 0)&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(58361)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(58362)==0&false))) {{
          __CLR4_4_117tq17tqlb90pb0r.R.inc(58363);return Math.PI/2.0;
      }

      /* Compute acos(x) = atan(sqrt(1-x*x)/x) */

      /* Split x */
      }__CLR4_4_117tq17tqlb90pb0r.R.inc(58364);double temp = x * HEX_40000000;
      __CLR4_4_117tq17tqlb90pb0r.R.inc(58365);final double xa = x + temp - temp;
      __CLR4_4_117tq17tqlb90pb0r.R.inc(58366);final double xb = x - xa;

      /* Square it */
      __CLR4_4_117tq17tqlb90pb0r.R.inc(58367);double ya = xa*xa;
      __CLR4_4_117tq17tqlb90pb0r.R.inc(58368);double yb = xa*xb*2.0 + xb*xb;

      /* Subtract from 1 */
      __CLR4_4_117tq17tqlb90pb0r.R.inc(58369);ya = -ya;
      __CLR4_4_117tq17tqlb90pb0r.R.inc(58370);yb = -yb;

      __CLR4_4_117tq17tqlb90pb0r.R.inc(58371);double za = 1.0 + ya;
      __CLR4_4_117tq17tqlb90pb0r.R.inc(58372);double zb = -(za - 1.0 - ya);

      __CLR4_4_117tq17tqlb90pb0r.R.inc(58373);temp = za + yb;
      __CLR4_4_117tq17tqlb90pb0r.R.inc(58374);zb += -(temp - za - yb);
      __CLR4_4_117tq17tqlb90pb0r.R.inc(58375);za = temp;

      /* Square root */
      __CLR4_4_117tq17tqlb90pb0r.R.inc(58376);double y = sqrt(za);
      __CLR4_4_117tq17tqlb90pb0r.R.inc(58377);temp = y * HEX_40000000;
      __CLR4_4_117tq17tqlb90pb0r.R.inc(58378);ya = y + temp - temp;
      __CLR4_4_117tq17tqlb90pb0r.R.inc(58379);yb = y - ya;

      /* Extend precision of sqrt */
      __CLR4_4_117tq17tqlb90pb0r.R.inc(58380);yb += (za - ya*ya - 2*ya*yb - yb*yb) / (2.0*y);

      /* Contribution of zb to sqrt */
      __CLR4_4_117tq17tqlb90pb0r.R.inc(58381);yb += zb / (2.0*y);
      __CLR4_4_117tq17tqlb90pb0r.R.inc(58382);y = ya+yb;
      __CLR4_4_117tq17tqlb90pb0r.R.inc(58383);yb = -(y - ya - yb);

      // Compute ratio r = y/x
      __CLR4_4_117tq17tqlb90pb0r.R.inc(58384);double r = y/x;

      // Did r overflow?
      __CLR4_4_117tq17tqlb90pb0r.R.inc(58385);if ((((Double.isInfinite(r))&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(58386)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(58387)==0&false))) {{ // x is effectively zero
          __CLR4_4_117tq17tqlb90pb0r.R.inc(58388);return Math.PI/2; // so return the appropriate value
      }

      }__CLR4_4_117tq17tqlb90pb0r.R.inc(58389);double ra = doubleHighPart(r);
      __CLR4_4_117tq17tqlb90pb0r.R.inc(58390);double rb = r - ra;

      __CLR4_4_117tq17tqlb90pb0r.R.inc(58391);rb += (y - ra*xa - ra*xb - rb*xa - rb*xb) / x;  // Correct for rounding in division
      __CLR4_4_117tq17tqlb90pb0r.R.inc(58392);rb += yb / x;  // Add in effect additional bits of sqrt.

      __CLR4_4_117tq17tqlb90pb0r.R.inc(58393);temp = ra + rb;
      __CLR4_4_117tq17tqlb90pb0r.R.inc(58394);rb = -(temp - ra - rb);
      __CLR4_4_117tq17tqlb90pb0r.R.inc(58395);ra = temp;

      __CLR4_4_117tq17tqlb90pb0r.R.inc(58396);return atan(ra, rb, x<0);
    }finally{__CLR4_4_117tq17tqlb90pb0r.R.flushNeeded();}}

    /** Compute the cubic root of a number.
     * @param x number on which evaluation is done
     * @return cubic root of x
     */
    public static double cbrt(double x) {try{__CLR4_4_117tq17tqlb90pb0r.R.inc(58397);
      /* Convert input double to bits */
      __CLR4_4_117tq17tqlb90pb0r.R.inc(58398);long inbits = Double.doubleToRawLongBits(x);
      __CLR4_4_117tq17tqlb90pb0r.R.inc(58399);int exponent = (int) ((inbits >> 52) & 0x7ff) - 1023;
      __CLR4_4_117tq17tqlb90pb0r.R.inc(58400);boolean subnormal = false;

      __CLR4_4_117tq17tqlb90pb0r.R.inc(58401);if ((((exponent == -1023)&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(58402)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(58403)==0&false))) {{
          __CLR4_4_117tq17tqlb90pb0r.R.inc(58404);if ((((x == 0)&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(58405)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(58406)==0&false))) {{
              __CLR4_4_117tq17tqlb90pb0r.R.inc(58407);return x;
          }

          /* Subnormal, so normalize */
          }__CLR4_4_117tq17tqlb90pb0r.R.inc(58408);subnormal = true;
          __CLR4_4_117tq17tqlb90pb0r.R.inc(58409);x *= 1.8014398509481984E16;  // 2^54
          __CLR4_4_117tq17tqlb90pb0r.R.inc(58410);inbits = Double.doubleToRawLongBits(x);
          __CLR4_4_117tq17tqlb90pb0r.R.inc(58411);exponent = (int) ((inbits >> 52) & 0x7ff) - 1023;
      }

      }__CLR4_4_117tq17tqlb90pb0r.R.inc(58412);if ((((exponent == 1024)&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(58413)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(58414)==0&false))) {{
          // Nan or infinity.  Don't care which.
          __CLR4_4_117tq17tqlb90pb0r.R.inc(58415);return x;
      }

      /* Divide the exponent by 3 */
      }__CLR4_4_117tq17tqlb90pb0r.R.inc(58416);int exp3 = exponent / 3;

      /* p2 will be the nearest power of 2 to x with its exponent divided by 3 */
      __CLR4_4_117tq17tqlb90pb0r.R.inc(58417);double p2 = Double.longBitsToDouble((inbits & 0x8000000000000000L) |
                                          (long)(((exp3 + 1023) & 0x7ff)) << 52);

      /* This will be a number between 1 and 2 */
      __CLR4_4_117tq17tqlb90pb0r.R.inc(58418);final double mant = Double.longBitsToDouble((inbits & 0x000fffffffffffffL) | 0x3ff0000000000000L);

      /* Estimate the cube root of mant by polynomial */
      __CLR4_4_117tq17tqlb90pb0r.R.inc(58419);double est = -0.010714690733195933;
      __CLR4_4_117tq17tqlb90pb0r.R.inc(58420);est = est * mant + 0.0875862700108075;
      __CLR4_4_117tq17tqlb90pb0r.R.inc(58421);est = est * mant + -0.3058015757857271;
      __CLR4_4_117tq17tqlb90pb0r.R.inc(58422);est = est * mant + 0.7249995199969751;
      __CLR4_4_117tq17tqlb90pb0r.R.inc(58423);est = est * mant + 0.5039018405998233;

      __CLR4_4_117tq17tqlb90pb0r.R.inc(58424);est *= CBRTTWO[exponent % 3 + 2];

      // est should now be good to about 15 bits of precision.   Do 2 rounds of
      // Newton's method to get closer,  this should get us full double precision
      // Scale down x for the purpose of doing newtons method.  This avoids over/under flows.
      __CLR4_4_117tq17tqlb90pb0r.R.inc(58425);final double xs = x / (p2*p2*p2);
      __CLR4_4_117tq17tqlb90pb0r.R.inc(58426);est += (xs - est*est*est) / (3*est*est);
      __CLR4_4_117tq17tqlb90pb0r.R.inc(58427);est += (xs - est*est*est) / (3*est*est);

      // Do one round of Newton's method in extended precision to get the last bit right.
      __CLR4_4_117tq17tqlb90pb0r.R.inc(58428);double temp = est * HEX_40000000;
      __CLR4_4_117tq17tqlb90pb0r.R.inc(58429);double ya = est + temp - temp;
      __CLR4_4_117tq17tqlb90pb0r.R.inc(58430);double yb = est - ya;

      __CLR4_4_117tq17tqlb90pb0r.R.inc(58431);double za = ya * ya;
      __CLR4_4_117tq17tqlb90pb0r.R.inc(58432);double zb = ya * yb * 2.0 + yb * yb;
      __CLR4_4_117tq17tqlb90pb0r.R.inc(58433);temp = za * HEX_40000000;
      __CLR4_4_117tq17tqlb90pb0r.R.inc(58434);double temp2 = za + temp - temp;
      __CLR4_4_117tq17tqlb90pb0r.R.inc(58435);zb += za - temp2;
      __CLR4_4_117tq17tqlb90pb0r.R.inc(58436);za = temp2;

      __CLR4_4_117tq17tqlb90pb0r.R.inc(58437);zb = za * yb + ya * zb + zb * yb;
      __CLR4_4_117tq17tqlb90pb0r.R.inc(58438);za = za * ya;

      __CLR4_4_117tq17tqlb90pb0r.R.inc(58439);double na = xs - za;
      __CLR4_4_117tq17tqlb90pb0r.R.inc(58440);double nb = -(na - xs + za);
      __CLR4_4_117tq17tqlb90pb0r.R.inc(58441);nb -= zb;

      __CLR4_4_117tq17tqlb90pb0r.R.inc(58442);est += (na+nb)/(3*est*est);

      /* Scale by a power of two, so this is exact. */
      __CLR4_4_117tq17tqlb90pb0r.R.inc(58443);est *= p2;

      __CLR4_4_117tq17tqlb90pb0r.R.inc(58444);if ((((subnormal)&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(58445)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(58446)==0&false))) {{
          __CLR4_4_117tq17tqlb90pb0r.R.inc(58447);est *= 3.814697265625E-6;  // 2^-18
      }

      }__CLR4_4_117tq17tqlb90pb0r.R.inc(58448);return est;
    }finally{__CLR4_4_117tq17tqlb90pb0r.R.flushNeeded();}}

    /**
     *  Convert degrees to radians, with error of less than 0.5 ULP
     *  @param x angle in degrees
     *  @return x converted into radians
     */
    public static double toRadians(double x)
    {try{__CLR4_4_117tq17tqlb90pb0r.R.inc(58449);
        __CLR4_4_117tq17tqlb90pb0r.R.inc(58450);if ((((Double.isInfinite(x) || x == 0.0)&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(58451)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(58452)==0&false))) {{ // Matches +/- 0.0; return correct sign
            __CLR4_4_117tq17tqlb90pb0r.R.inc(58453);return x;
        }

        // These are PI/180 split into high and low order bits
        }__CLR4_4_117tq17tqlb90pb0r.R.inc(58454);final double facta = 0.01745329052209854;
        __CLR4_4_117tq17tqlb90pb0r.R.inc(58455);final double factb = 1.997844754509471E-9;

        __CLR4_4_117tq17tqlb90pb0r.R.inc(58456);double xa = doubleHighPart(x);
        __CLR4_4_117tq17tqlb90pb0r.R.inc(58457);double xb = x - xa;

        __CLR4_4_117tq17tqlb90pb0r.R.inc(58458);double result = xb * factb + xb * facta + xa * factb + xa * facta;
        __CLR4_4_117tq17tqlb90pb0r.R.inc(58459);if ((((result == 0)&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(58460)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(58461)==0&false))) {{
            __CLR4_4_117tq17tqlb90pb0r.R.inc(58462);result = result * x; // ensure correct sign if calculation underflows
        }
        }__CLR4_4_117tq17tqlb90pb0r.R.inc(58463);return result;
    }finally{__CLR4_4_117tq17tqlb90pb0r.R.flushNeeded();}}

    /**
     *  Convert radians to degrees, with error of less than 0.5 ULP
     *  @param x angle in radians
     *  @return x converted into degrees
     */
    public static double toDegrees(double x)
    {try{__CLR4_4_117tq17tqlb90pb0r.R.inc(58464);
        __CLR4_4_117tq17tqlb90pb0r.R.inc(58465);if ((((Double.isInfinite(x) || x == 0.0)&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(58466)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(58467)==0&false))) {{ // Matches +/- 0.0; return correct sign
            __CLR4_4_117tq17tqlb90pb0r.R.inc(58468);return x;
        }

        // These are 180/PI split into high and low order bits
        }__CLR4_4_117tq17tqlb90pb0r.R.inc(58469);final double facta = 57.2957763671875;
        __CLR4_4_117tq17tqlb90pb0r.R.inc(58470);final double factb = 3.145894820876798E-6;

        __CLR4_4_117tq17tqlb90pb0r.R.inc(58471);double xa = doubleHighPart(x);
        __CLR4_4_117tq17tqlb90pb0r.R.inc(58472);double xb = x - xa;

        __CLR4_4_117tq17tqlb90pb0r.R.inc(58473);return xb * factb + xb * facta + xa * factb + xa * facta;
    }finally{__CLR4_4_117tq17tqlb90pb0r.R.flushNeeded();}}

    /**
     * Absolute value.
     * @param x number from which absolute value is requested
     * @return abs(x)
     */
    public static int abs(final int x) {try{__CLR4_4_117tq17tqlb90pb0r.R.inc(58474);
        __CLR4_4_117tq17tqlb90pb0r.R.inc(58475);final int i = x >>> 31;
        __CLR4_4_117tq17tqlb90pb0r.R.inc(58476);return (x ^ (~i + 1)) + i;
    }finally{__CLR4_4_117tq17tqlb90pb0r.R.flushNeeded();}}

    /**
     * Absolute value.
     * @param x number from which absolute value is requested
     * @return abs(x)
     */
    public static long abs(final long x) {try{__CLR4_4_117tq17tqlb90pb0r.R.inc(58477);
        __CLR4_4_117tq17tqlb90pb0r.R.inc(58478);final long l = x >>> 63;
        // l is one if x negative zero else
        // ~l+1 is zero if x is positive, -1 if x is negative
        // x^(~l+1) is x is x is positive, ~x if x is negative
        // add around
        __CLR4_4_117tq17tqlb90pb0r.R.inc(58479);return (x ^ (~l + 1)) + l;
    }finally{__CLR4_4_117tq17tqlb90pb0r.R.flushNeeded();}}

    /**
     * Absolute value.
     * @param x number from which absolute value is requested
     * @return abs(x)
     */
    public static float abs(final float x) {try{__CLR4_4_117tq17tqlb90pb0r.R.inc(58480);
        __CLR4_4_117tq17tqlb90pb0r.R.inc(58481);return Float.intBitsToFloat(MASK_NON_SIGN_INT & Float.floatToRawIntBits(x));
    }finally{__CLR4_4_117tq17tqlb90pb0r.R.flushNeeded();}}

    /**
     * Absolute value.
     * @param x number from which absolute value is requested
     * @return abs(x)
     */
    public static double abs(double x) {try{__CLR4_4_117tq17tqlb90pb0r.R.inc(58482);
        __CLR4_4_117tq17tqlb90pb0r.R.inc(58483);return Double.longBitsToDouble(MASK_NON_SIGN_LONG & Double.doubleToRawLongBits(x));
    }finally{__CLR4_4_117tq17tqlb90pb0r.R.flushNeeded();}}

    /**
     * Compute least significant bit (Unit in Last Position) for a number.
     * @param x number from which ulp is requested
     * @return ulp(x)
     */
    public static double ulp(double x) {try{__CLR4_4_117tq17tqlb90pb0r.R.inc(58484);
        __CLR4_4_117tq17tqlb90pb0r.R.inc(58485);if ((((Double.isInfinite(x))&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(58486)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(58487)==0&false))) {{
            __CLR4_4_117tq17tqlb90pb0r.R.inc(58488);return Double.POSITIVE_INFINITY;
        }
        }__CLR4_4_117tq17tqlb90pb0r.R.inc(58489);return abs(x - Double.longBitsToDouble(Double.doubleToRawLongBits(x) ^ 1));
    }finally{__CLR4_4_117tq17tqlb90pb0r.R.flushNeeded();}}

    /**
     * Compute least significant bit (Unit in Last Position) for a number.
     * @param x number from which ulp is requested
     * @return ulp(x)
     */
    public static float ulp(float x) {try{__CLR4_4_117tq17tqlb90pb0r.R.inc(58490);
        __CLR4_4_117tq17tqlb90pb0r.R.inc(58491);if ((((Float.isInfinite(x))&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(58492)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(58493)==0&false))) {{
            __CLR4_4_117tq17tqlb90pb0r.R.inc(58494);return Float.POSITIVE_INFINITY;
        }
        }__CLR4_4_117tq17tqlb90pb0r.R.inc(58495);return abs(x - Float.intBitsToFloat(Float.floatToIntBits(x) ^ 1));
    }finally{__CLR4_4_117tq17tqlb90pb0r.R.flushNeeded();}}

    /**
     * Multiply a double number by a power of 2.
     * @param d number to multiply
     * @param n power of 2
     * @return d &times; 2<sup>n</sup>
     */
    public static double scalb(final double d, final int n) {try{__CLR4_4_117tq17tqlb90pb0r.R.inc(58496);

        // first simple and fast handling when 2^n can be represented using normal numbers
        __CLR4_4_117tq17tqlb90pb0r.R.inc(58497);if (((((n > -1023) && (n < 1024))&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(58498)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(58499)==0&false))) {{
            __CLR4_4_117tq17tqlb90pb0r.R.inc(58500);return d * Double.longBitsToDouble(((long) (n + 1023)) << 52);
        }

        // handle special cases
        }__CLR4_4_117tq17tqlb90pb0r.R.inc(58501);if ((((Double.isNaN(d) || Double.isInfinite(d) || (d == 0))&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(58502)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(58503)==0&false))) {{
            __CLR4_4_117tq17tqlb90pb0r.R.inc(58504);return d;
        }
        }__CLR4_4_117tq17tqlb90pb0r.R.inc(58505);if ((((n < -2098)&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(58506)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(58507)==0&false))) {{
            __CLR4_4_117tq17tqlb90pb0r.R.inc(58508);return ((((d > 0) )&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(58509)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(58510)==0&false))? 0.0 : -0.0;
        }
        }__CLR4_4_117tq17tqlb90pb0r.R.inc(58511);if ((((n > 2097)&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(58512)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(58513)==0&false))) {{
            __CLR4_4_117tq17tqlb90pb0r.R.inc(58514);return ((((d > 0) )&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(58515)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(58516)==0&false))? Double.POSITIVE_INFINITY : Double.NEGATIVE_INFINITY;
        }

        // decompose d
        }__CLR4_4_117tq17tqlb90pb0r.R.inc(58517);final long bits = Double.doubleToRawLongBits(d);
        __CLR4_4_117tq17tqlb90pb0r.R.inc(58518);final long sign = bits & 0x8000000000000000L;
        __CLR4_4_117tq17tqlb90pb0r.R.inc(58519);int  exponent   = ((int) (bits >>> 52)) & 0x7ff;
        __CLR4_4_117tq17tqlb90pb0r.R.inc(58520);long mantissa   = bits & 0x000fffffffffffffL;

        // compute scaled exponent
        __CLR4_4_117tq17tqlb90pb0r.R.inc(58521);int scaledExponent = exponent + n;

        __CLR4_4_117tq17tqlb90pb0r.R.inc(58522);if ((((n < 0)&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(58523)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(58524)==0&false))) {{
            // we are really in the case n <= -1023
            __CLR4_4_117tq17tqlb90pb0r.R.inc(58525);if ((((scaledExponent > 0)&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(58526)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(58527)==0&false))) {{
                // both the input and the result are normal numbers, we only adjust the exponent
                __CLR4_4_117tq17tqlb90pb0r.R.inc(58528);return Double.longBitsToDouble(sign | (((long) scaledExponent) << 52) | mantissa);
            } }else {__CLR4_4_117tq17tqlb90pb0r.R.inc(58529);if ((((scaledExponent > -53)&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(58530)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(58531)==0&false))) {{
                // the input is a normal number and the result is a subnormal number

                // recover the hidden mantissa bit
                __CLR4_4_117tq17tqlb90pb0r.R.inc(58532);mantissa = mantissa | (1L << 52);

                // scales down complete mantissa, hence losing least significant bits
                __CLR4_4_117tq17tqlb90pb0r.R.inc(58533);final long mostSignificantLostBit = mantissa & (1L << (-scaledExponent));
                __CLR4_4_117tq17tqlb90pb0r.R.inc(58534);mantissa = mantissa >>> (1 - scaledExponent);
                __CLR4_4_117tq17tqlb90pb0r.R.inc(58535);if ((((mostSignificantLostBit != 0)&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(58536)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(58537)==0&false))) {{
                    // we need to add 1 bit to round up the result
                    __CLR4_4_117tq17tqlb90pb0r.R.inc(58538);mantissa++;
                }
                }__CLR4_4_117tq17tqlb90pb0r.R.inc(58539);return Double.longBitsToDouble(sign | mantissa);

            } }else {{
                // no need to compute the mantissa, the number scales down to 0
                __CLR4_4_117tq17tqlb90pb0r.R.inc(58540);return ((((sign == 0L) )&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(58541)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(58542)==0&false))? 0.0 : -0.0;
            }
        }}} }else {{
            // we are really in the case n >= 1024
            __CLR4_4_117tq17tqlb90pb0r.R.inc(58543);if ((((exponent == 0)&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(58544)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(58545)==0&false))) {{

                // the input number is subnormal, normalize it
                __CLR4_4_117tq17tqlb90pb0r.R.inc(58546);while (((((mantissa >>> 52) != 1)&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(58547)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(58548)==0&false))) {{
                    __CLR4_4_117tq17tqlb90pb0r.R.inc(58549);mantissa = mantissa << 1;
                    __CLR4_4_117tq17tqlb90pb0r.R.inc(58550);--scaledExponent;
                }
                }__CLR4_4_117tq17tqlb90pb0r.R.inc(58551);++scaledExponent;
                __CLR4_4_117tq17tqlb90pb0r.R.inc(58552);mantissa = mantissa & 0x000fffffffffffffL;

                __CLR4_4_117tq17tqlb90pb0r.R.inc(58553);if ((((scaledExponent < 2047)&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(58554)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(58555)==0&false))) {{
                    __CLR4_4_117tq17tqlb90pb0r.R.inc(58556);return Double.longBitsToDouble(sign | (((long) scaledExponent) << 52) | mantissa);
                } }else {{
                    __CLR4_4_117tq17tqlb90pb0r.R.inc(58557);return ((((sign == 0L) )&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(58558)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(58559)==0&false))? Double.POSITIVE_INFINITY : Double.NEGATIVE_INFINITY;
                }

            }} }else {__CLR4_4_117tq17tqlb90pb0r.R.inc(58560);if ((((scaledExponent < 2047)&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(58561)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(58562)==0&false))) {{
                __CLR4_4_117tq17tqlb90pb0r.R.inc(58563);return Double.longBitsToDouble(sign | (((long) scaledExponent) << 52) | mantissa);
            } }else {{
                __CLR4_4_117tq17tqlb90pb0r.R.inc(58564);return ((((sign == 0L) )&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(58565)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(58566)==0&false))? Double.POSITIVE_INFINITY : Double.NEGATIVE_INFINITY;
            }
        }}}

    }}finally{__CLR4_4_117tq17tqlb90pb0r.R.flushNeeded();}}

    /**
     * Multiply a float number by a power of 2.
     * @param f number to multiply
     * @param n power of 2
     * @return f &times; 2<sup>n</sup>
     */
    public static float scalb(final float f, final int n) {try{__CLR4_4_117tq17tqlb90pb0r.R.inc(58567);

        // first simple and fast handling when 2^n can be represented using normal numbers
        __CLR4_4_117tq17tqlb90pb0r.R.inc(58568);if (((((n > -127) && (n < 128))&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(58569)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(58570)==0&false))) {{
            __CLR4_4_117tq17tqlb90pb0r.R.inc(58571);return f * Float.intBitsToFloat((n + 127) << 23);
        }

        // handle special cases
        }__CLR4_4_117tq17tqlb90pb0r.R.inc(58572);if ((((Float.isNaN(f) || Float.isInfinite(f) || (f == 0f))&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(58573)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(58574)==0&false))) {{
            __CLR4_4_117tq17tqlb90pb0r.R.inc(58575);return f;
        }
        }__CLR4_4_117tq17tqlb90pb0r.R.inc(58576);if ((((n < -277)&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(58577)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(58578)==0&false))) {{
            __CLR4_4_117tq17tqlb90pb0r.R.inc(58579);return ((((f > 0) )&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(58580)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(58581)==0&false))? 0.0f : -0.0f;
        }
        }__CLR4_4_117tq17tqlb90pb0r.R.inc(58582);if ((((n > 276)&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(58583)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(58584)==0&false))) {{
            __CLR4_4_117tq17tqlb90pb0r.R.inc(58585);return ((((f > 0) )&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(58586)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(58587)==0&false))? Float.POSITIVE_INFINITY : Float.NEGATIVE_INFINITY;
        }

        // decompose f
        }__CLR4_4_117tq17tqlb90pb0r.R.inc(58588);final int bits = Float.floatToIntBits(f);
        __CLR4_4_117tq17tqlb90pb0r.R.inc(58589);final int sign = bits & 0x80000000;
        __CLR4_4_117tq17tqlb90pb0r.R.inc(58590);int  exponent  = (bits >>> 23) & 0xff;
        __CLR4_4_117tq17tqlb90pb0r.R.inc(58591);int mantissa   = bits & 0x007fffff;

        // compute scaled exponent
        __CLR4_4_117tq17tqlb90pb0r.R.inc(58592);int scaledExponent = exponent + n;

        __CLR4_4_117tq17tqlb90pb0r.R.inc(58593);if ((((n < 0)&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(58594)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(58595)==0&false))) {{
            // we are really in the case n <= -127
            __CLR4_4_117tq17tqlb90pb0r.R.inc(58596);if ((((scaledExponent > 0)&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(58597)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(58598)==0&false))) {{
                // both the input and the result are normal numbers, we only adjust the exponent
                __CLR4_4_117tq17tqlb90pb0r.R.inc(58599);return Float.intBitsToFloat(sign | (scaledExponent << 23) | mantissa);
            } }else {__CLR4_4_117tq17tqlb90pb0r.R.inc(58600);if ((((scaledExponent > -24)&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(58601)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(58602)==0&false))) {{
                // the input is a normal number and the result is a subnormal number

                // recover the hidden mantissa bit
                __CLR4_4_117tq17tqlb90pb0r.R.inc(58603);mantissa = mantissa | (1 << 23);

                // scales down complete mantissa, hence losing least significant bits
                __CLR4_4_117tq17tqlb90pb0r.R.inc(58604);final int mostSignificantLostBit = mantissa & (1 << (-scaledExponent));
                __CLR4_4_117tq17tqlb90pb0r.R.inc(58605);mantissa = mantissa >>> (1 - scaledExponent);
                __CLR4_4_117tq17tqlb90pb0r.R.inc(58606);if ((((mostSignificantLostBit != 0)&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(58607)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(58608)==0&false))) {{
                    // we need to add 1 bit to round up the result
                    __CLR4_4_117tq17tqlb90pb0r.R.inc(58609);mantissa++;
                }
                }__CLR4_4_117tq17tqlb90pb0r.R.inc(58610);return Float.intBitsToFloat(sign | mantissa);

            } }else {{
                // no need to compute the mantissa, the number scales down to 0
                __CLR4_4_117tq17tqlb90pb0r.R.inc(58611);return ((((sign == 0) )&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(58612)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(58613)==0&false))? 0.0f : -0.0f;
            }
        }}} }else {{
            // we are really in the case n >= 128
            __CLR4_4_117tq17tqlb90pb0r.R.inc(58614);if ((((exponent == 0)&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(58615)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(58616)==0&false))) {{

                // the input number is subnormal, normalize it
                __CLR4_4_117tq17tqlb90pb0r.R.inc(58617);while (((((mantissa >>> 23) != 1)&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(58618)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(58619)==0&false))) {{
                    __CLR4_4_117tq17tqlb90pb0r.R.inc(58620);mantissa = mantissa << 1;
                    __CLR4_4_117tq17tqlb90pb0r.R.inc(58621);--scaledExponent;
                }
                }__CLR4_4_117tq17tqlb90pb0r.R.inc(58622);++scaledExponent;
                __CLR4_4_117tq17tqlb90pb0r.R.inc(58623);mantissa = mantissa & 0x007fffff;

                __CLR4_4_117tq17tqlb90pb0r.R.inc(58624);if ((((scaledExponent < 255)&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(58625)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(58626)==0&false))) {{
                    __CLR4_4_117tq17tqlb90pb0r.R.inc(58627);return Float.intBitsToFloat(sign | (scaledExponent << 23) | mantissa);
                } }else {{
                    __CLR4_4_117tq17tqlb90pb0r.R.inc(58628);return ((((sign == 0) )&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(58629)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(58630)==0&false))? Float.POSITIVE_INFINITY : Float.NEGATIVE_INFINITY;
                }

            }} }else {__CLR4_4_117tq17tqlb90pb0r.R.inc(58631);if ((((scaledExponent < 255)&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(58632)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(58633)==0&false))) {{
                __CLR4_4_117tq17tqlb90pb0r.R.inc(58634);return Float.intBitsToFloat(sign | (scaledExponent << 23) | mantissa);
            } }else {{
                __CLR4_4_117tq17tqlb90pb0r.R.inc(58635);return ((((sign == 0) )&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(58636)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(58637)==0&false))? Float.POSITIVE_INFINITY : Float.NEGATIVE_INFINITY;
            }
        }}}

    }}finally{__CLR4_4_117tq17tqlb90pb0r.R.flushNeeded();}}

    /**
     * Get the next machine representable number after a number, moving
     * in the direction of another number.
     * <p>
     * The ordering is as follows (increasing):
     * <ul>
     * <li>-INFINITY</li>
     * <li>-MAX_VALUE</li>
     * <li>-MIN_VALUE</li>
     * <li>-0.0</li>
     * <li>+0.0</li>
     * <li>+MIN_VALUE</li>
     * <li>+MAX_VALUE</li>
     * <li>+INFINITY</li>
     * <li></li>
     * <p>
     * If arguments compare equal, then the second argument is returned.
     * <p>
     * If {@code direction} is greater than {@code d},
     * the smallest machine representable number strictly greater than
     * {@code d} is returned; if less, then the largest representable number
     * strictly less than {@code d} is returned.</p>
     * <p>
     * If {@code d} is infinite and direction does not
     * bring it back to finite numbers, it is returned unchanged.</p>
     *
     * @param d base number
     * @param direction (the only important thing is whether
     * {@code direction} is greater or smaller than {@code d})
     * @return the next machine representable number in the specified direction
     */
    public static double nextAfter(double d, double direction) {try{__CLR4_4_117tq17tqlb90pb0r.R.inc(58638);

        // handling of some important special cases
        __CLR4_4_117tq17tqlb90pb0r.R.inc(58639);if ((((Double.isNaN(d) || Double.isNaN(direction))&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(58640)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(58641)==0&false))) {{
            __CLR4_4_117tq17tqlb90pb0r.R.inc(58642);return Double.NaN;
        } }else {__CLR4_4_117tq17tqlb90pb0r.R.inc(58643);if ((((d == direction)&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(58644)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(58645)==0&false))) {{
            __CLR4_4_117tq17tqlb90pb0r.R.inc(58646);return direction;
        } }else {__CLR4_4_117tq17tqlb90pb0r.R.inc(58647);if ((((Double.isInfinite(d))&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(58648)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(58649)==0&false))) {{
            __CLR4_4_117tq17tqlb90pb0r.R.inc(58650);return ((((d < 0) )&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(58651)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(58652)==0&false))? -Double.MAX_VALUE : Double.MAX_VALUE;
        } }else {__CLR4_4_117tq17tqlb90pb0r.R.inc(58653);if ((((d == 0)&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(58654)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(58655)==0&false))) {{
            __CLR4_4_117tq17tqlb90pb0r.R.inc(58656);return ((((direction < 0) )&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(58657)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(58658)==0&false))? -Double.MIN_VALUE : Double.MIN_VALUE;
        }
        // special cases MAX_VALUE to infinity and  MIN_VALUE to 0
        // are handled just as normal numbers
        // can use raw bits since already dealt with infinity and NaN
        }}}}__CLR4_4_117tq17tqlb90pb0r.R.inc(58659);final long bits = Double.doubleToRawLongBits(d);
        __CLR4_4_117tq17tqlb90pb0r.R.inc(58660);final long sign = bits & 0x8000000000000000L;
        __CLR4_4_117tq17tqlb90pb0r.R.inc(58661);if (((((direction < d) ^ (sign == 0L))&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(58662)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(58663)==0&false))) {{
            __CLR4_4_117tq17tqlb90pb0r.R.inc(58664);return Double.longBitsToDouble(sign | ((bits & 0x7fffffffffffffffL) + 1));
        } }else {{
            __CLR4_4_117tq17tqlb90pb0r.R.inc(58665);return Double.longBitsToDouble(sign | ((bits & 0x7fffffffffffffffL) - 1));
        }

    }}finally{__CLR4_4_117tq17tqlb90pb0r.R.flushNeeded();}}

    /**
     * Get the next machine representable number after a number, moving
     * in the direction of another number.
     * <p>
     * The ordering is as follows (increasing):
     * <ul>
     * <li>-INFINITY</li>
     * <li>-MAX_VALUE</li>
     * <li>-MIN_VALUE</li>
     * <li>-0.0</li>
     * <li>+0.0</li>
     * <li>+MIN_VALUE</li>
     * <li>+MAX_VALUE</li>
     * <li>+INFINITY</li>
     * <li></li>
     * <p>
     * If arguments compare equal, then the second argument is returned.
     * <p>
     * If {@code direction} is greater than {@code f},
     * the smallest machine representable number strictly greater than
     * {@code f} is returned; if less, then the largest representable number
     * strictly less than {@code f} is returned.</p>
     * <p>
     * If {@code f} is infinite and direction does not
     * bring it back to finite numbers, it is returned unchanged.</p>
     *
     * @param f base number
     * @param direction (the only important thing is whether
     * {@code direction} is greater or smaller than {@code f})
     * @return the next machine representable number in the specified direction
     */
    public static float nextAfter(final float f, final double direction) {try{__CLR4_4_117tq17tqlb90pb0r.R.inc(58666);

        // handling of some important special cases
        __CLR4_4_117tq17tqlb90pb0r.R.inc(58667);if ((((Double.isNaN(f) || Double.isNaN(direction))&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(58668)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(58669)==0&false))) {{
            __CLR4_4_117tq17tqlb90pb0r.R.inc(58670);return Float.NaN;
        } }else {__CLR4_4_117tq17tqlb90pb0r.R.inc(58671);if ((((f == direction)&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(58672)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(58673)==0&false))) {{
            __CLR4_4_117tq17tqlb90pb0r.R.inc(58674);return (float) direction;
        } }else {__CLR4_4_117tq17tqlb90pb0r.R.inc(58675);if ((((Float.isInfinite(f))&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(58676)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(58677)==0&false))) {{
            __CLR4_4_117tq17tqlb90pb0r.R.inc(58678);return ((((f < 0f) )&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(58679)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(58680)==0&false))? -Float.MAX_VALUE : Float.MAX_VALUE;
        } }else {__CLR4_4_117tq17tqlb90pb0r.R.inc(58681);if ((((f == 0f)&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(58682)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(58683)==0&false))) {{
            __CLR4_4_117tq17tqlb90pb0r.R.inc(58684);return ((((direction < 0) )&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(58685)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(58686)==0&false))? -Float.MIN_VALUE : Float.MIN_VALUE;
        }
        // special cases MAX_VALUE to infinity and  MIN_VALUE to 0
        // are handled just as normal numbers

        }}}}__CLR4_4_117tq17tqlb90pb0r.R.inc(58687);final int bits = Float.floatToIntBits(f);
        __CLR4_4_117tq17tqlb90pb0r.R.inc(58688);final int sign = bits & 0x80000000;
        __CLR4_4_117tq17tqlb90pb0r.R.inc(58689);if (((((direction < f) ^ (sign == 0))&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(58690)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(58691)==0&false))) {{
            __CLR4_4_117tq17tqlb90pb0r.R.inc(58692);return Float.intBitsToFloat(sign | ((bits & 0x7fffffff) + 1));
        } }else {{
            __CLR4_4_117tq17tqlb90pb0r.R.inc(58693);return Float.intBitsToFloat(sign | ((bits & 0x7fffffff) - 1));
        }

    }}finally{__CLR4_4_117tq17tqlb90pb0r.R.flushNeeded();}}

    /** Get the largest whole number smaller than x.
     * @param x number from which floor is requested
     * @return a double number f such that f is an integer f <= x < f + 1.0
     */
    public static double floor(double x) {try{__CLR4_4_117tq17tqlb90pb0r.R.inc(58694);
        __CLR4_4_117tq17tqlb90pb0r.R.inc(58695);long y;

        __CLR4_4_117tq17tqlb90pb0r.R.inc(58696);if ((((x != x)&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(58697)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(58698)==0&false))) {{ // NaN
            __CLR4_4_117tq17tqlb90pb0r.R.inc(58699);return x;
        }

        }__CLR4_4_117tq17tqlb90pb0r.R.inc(58700);if ((((x >= TWO_POWER_52 || x <= -TWO_POWER_52)&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(58701)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(58702)==0&false))) {{
            __CLR4_4_117tq17tqlb90pb0r.R.inc(58703);return x;
        }

        }__CLR4_4_117tq17tqlb90pb0r.R.inc(58704);y = (long) x;
        __CLR4_4_117tq17tqlb90pb0r.R.inc(58705);if ((((x < 0 && y != x)&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(58706)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(58707)==0&false))) {{
            __CLR4_4_117tq17tqlb90pb0r.R.inc(58708);y--;
        }

        }__CLR4_4_117tq17tqlb90pb0r.R.inc(58709);if ((((y == 0)&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(58710)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(58711)==0&false))) {{
            __CLR4_4_117tq17tqlb90pb0r.R.inc(58712);return x*y;
        }

        }__CLR4_4_117tq17tqlb90pb0r.R.inc(58713);return y;
    }finally{__CLR4_4_117tq17tqlb90pb0r.R.flushNeeded();}}

    /** Get the smallest whole number larger than x.
     * @param x number from which ceil is requested
     * @return a double number c such that c is an integer c - 1.0 < x <= c
     */
    public static double ceil(double x) {try{__CLR4_4_117tq17tqlb90pb0r.R.inc(58714);
        __CLR4_4_117tq17tqlb90pb0r.R.inc(58715);double y;

        __CLR4_4_117tq17tqlb90pb0r.R.inc(58716);if ((((x != x)&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(58717)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(58718)==0&false))) {{ // NaN
            __CLR4_4_117tq17tqlb90pb0r.R.inc(58719);return x;
        }

        }__CLR4_4_117tq17tqlb90pb0r.R.inc(58720);y = floor(x);
        __CLR4_4_117tq17tqlb90pb0r.R.inc(58721);if ((((y == x)&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(58722)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(58723)==0&false))) {{
            __CLR4_4_117tq17tqlb90pb0r.R.inc(58724);return y;
        }

        }__CLR4_4_117tq17tqlb90pb0r.R.inc(58725);y += 1.0;

        __CLR4_4_117tq17tqlb90pb0r.R.inc(58726);if ((((y == 0)&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(58727)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(58728)==0&false))) {{
            __CLR4_4_117tq17tqlb90pb0r.R.inc(58729);return x*y;
        }

        }__CLR4_4_117tq17tqlb90pb0r.R.inc(58730);return y;
    }finally{__CLR4_4_117tq17tqlb90pb0r.R.flushNeeded();}}

    /** Get the whole number that is the nearest to x, or the even one if x is exactly half way between two integers.
     * @param x number from which nearest whole number is requested
     * @return a double number r such that r is an integer r - 0.5 <= x <= r + 0.5
     */
    public static double rint(double x) {try{__CLR4_4_117tq17tqlb90pb0r.R.inc(58731);
        __CLR4_4_117tq17tqlb90pb0r.R.inc(58732);double y = floor(x);
        __CLR4_4_117tq17tqlb90pb0r.R.inc(58733);double d = x - y;

        __CLR4_4_117tq17tqlb90pb0r.R.inc(58734);if ((((d > 0.5)&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(58735)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(58736)==0&false))) {{
            __CLR4_4_117tq17tqlb90pb0r.R.inc(58737);if ((((y == -1.0)&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(58738)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(58739)==0&false))) {{
                __CLR4_4_117tq17tqlb90pb0r.R.inc(58740);return -0.0; // Preserve sign of operand
            }
            }__CLR4_4_117tq17tqlb90pb0r.R.inc(58741);return y+1.0;
        }
        }__CLR4_4_117tq17tqlb90pb0r.R.inc(58742);if ((((d < 0.5)&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(58743)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(58744)==0&false))) {{
            __CLR4_4_117tq17tqlb90pb0r.R.inc(58745);return y;
        }

        /* half way, round to even */
        }__CLR4_4_117tq17tqlb90pb0r.R.inc(58746);long z = (long) y;
        __CLR4_4_117tq17tqlb90pb0r.R.inc(58747);return ((((z & 1) == 0 )&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(58748)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(58749)==0&false))? y : y + 1.0;
    }finally{__CLR4_4_117tq17tqlb90pb0r.R.flushNeeded();}}

    /** Get the closest long to x.
     * @param x number from which closest long is requested
     * @return closest long to x
     */
    public static long round(double x) {try{__CLR4_4_117tq17tqlb90pb0r.R.inc(58750);
        __CLR4_4_117tq17tqlb90pb0r.R.inc(58751);return (long) floor(x + 0.5);
    }finally{__CLR4_4_117tq17tqlb90pb0r.R.flushNeeded();}}

    /** Get the closest int to x.
     * @param x number from which closest int is requested
     * @return closest int to x
     */
    public static int round(final float x) {try{__CLR4_4_117tq17tqlb90pb0r.R.inc(58752);
        __CLR4_4_117tq17tqlb90pb0r.R.inc(58753);return (int) floor(x + 0.5f);
    }finally{__CLR4_4_117tq17tqlb90pb0r.R.flushNeeded();}}

    /** Compute the minimum of two values
     * @param a first value
     * @param b second value
     * @return a if a is lesser or equal to b, b otherwise
     */
    public static int min(final int a, final int b) {try{__CLR4_4_117tq17tqlb90pb0r.R.inc(58754);
        __CLR4_4_117tq17tqlb90pb0r.R.inc(58755);return ((((a <= b) )&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(58756)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(58757)==0&false))? a : b;
    }finally{__CLR4_4_117tq17tqlb90pb0r.R.flushNeeded();}}

    /** Compute the minimum of two values
     * @param a first value
     * @param b second value
     * @return a if a is lesser or equal to b, b otherwise
     */
    public static long min(final long a, final long b) {try{__CLR4_4_117tq17tqlb90pb0r.R.inc(58758);
        __CLR4_4_117tq17tqlb90pb0r.R.inc(58759);return ((((a <= b) )&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(58760)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(58761)==0&false))? a : b;
    }finally{__CLR4_4_117tq17tqlb90pb0r.R.flushNeeded();}}

    /** Compute the minimum of two values
     * @param a first value
     * @param b second value
     * @return a if a is lesser or equal to b, b otherwise
     */
    public static float min(final float a, final float b) {try{__CLR4_4_117tq17tqlb90pb0r.R.inc(58762);
        __CLR4_4_117tq17tqlb90pb0r.R.inc(58763);if ((((a > b)&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(58764)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(58765)==0&false))) {{
            __CLR4_4_117tq17tqlb90pb0r.R.inc(58766);return b;
        }
        }__CLR4_4_117tq17tqlb90pb0r.R.inc(58767);if ((((a < b)&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(58768)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(58769)==0&false))) {{
            __CLR4_4_117tq17tqlb90pb0r.R.inc(58770);return a;
        }
        /* if either arg is NaN, return NaN */
        }__CLR4_4_117tq17tqlb90pb0r.R.inc(58771);if ((((a != b)&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(58772)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(58773)==0&false))) {{
            __CLR4_4_117tq17tqlb90pb0r.R.inc(58774);return Float.NaN;
        }
        /* min(+0.0,-0.0) == -0.0 */
        /* 0x80000000 == Float.floatToRawIntBits(-0.0d) */
        }__CLR4_4_117tq17tqlb90pb0r.R.inc(58775);int bits = Float.floatToRawIntBits(a);
        __CLR4_4_117tq17tqlb90pb0r.R.inc(58776);if ((((bits == 0x80000000)&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(58777)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(58778)==0&false))) {{
            __CLR4_4_117tq17tqlb90pb0r.R.inc(58779);return a;
        }
        }__CLR4_4_117tq17tqlb90pb0r.R.inc(58780);return b;
    }finally{__CLR4_4_117tq17tqlb90pb0r.R.flushNeeded();}}

    /** Compute the minimum of two values
     * @param a first value
     * @param b second value
     * @return a if a is lesser or equal to b, b otherwise
     */
    public static double min(final double a, final double b) {try{__CLR4_4_117tq17tqlb90pb0r.R.inc(58781);
        __CLR4_4_117tq17tqlb90pb0r.R.inc(58782);if ((((a > b)&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(58783)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(58784)==0&false))) {{
            __CLR4_4_117tq17tqlb90pb0r.R.inc(58785);return b;
        }
        }__CLR4_4_117tq17tqlb90pb0r.R.inc(58786);if ((((a < b)&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(58787)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(58788)==0&false))) {{
            __CLR4_4_117tq17tqlb90pb0r.R.inc(58789);return a;
        }
        /* if either arg is NaN, return NaN */
        }__CLR4_4_117tq17tqlb90pb0r.R.inc(58790);if ((((a != b)&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(58791)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(58792)==0&false))) {{
            __CLR4_4_117tq17tqlb90pb0r.R.inc(58793);return Double.NaN;
        }
        /* min(+0.0,-0.0) == -0.0 */
        /* 0x8000000000000000L == Double.doubleToRawLongBits(-0.0d) */
        }__CLR4_4_117tq17tqlb90pb0r.R.inc(58794);long bits = Double.doubleToRawLongBits(a);
        __CLR4_4_117tq17tqlb90pb0r.R.inc(58795);if ((((bits == 0x8000000000000000L)&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(58796)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(58797)==0&false))) {{
            __CLR4_4_117tq17tqlb90pb0r.R.inc(58798);return a;
        }
        }__CLR4_4_117tq17tqlb90pb0r.R.inc(58799);return b;
    }finally{__CLR4_4_117tq17tqlb90pb0r.R.flushNeeded();}}

    /** Compute the maximum of two values
     * @param a first value
     * @param b second value
     * @return b if a is lesser or equal to b, a otherwise
     */
    public static int max(final int a, final int b) {try{__CLR4_4_117tq17tqlb90pb0r.R.inc(58800);
        __CLR4_4_117tq17tqlb90pb0r.R.inc(58801);return ((((a <= b) )&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(58802)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(58803)==0&false))? b : a;
    }finally{__CLR4_4_117tq17tqlb90pb0r.R.flushNeeded();}}

    /** Compute the maximum of two values
     * @param a first value
     * @param b second value
     * @return b if a is lesser or equal to b, a otherwise
     */
    public static long max(final long a, final long b) {try{__CLR4_4_117tq17tqlb90pb0r.R.inc(58804);
        __CLR4_4_117tq17tqlb90pb0r.R.inc(58805);return ((((a <= b) )&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(58806)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(58807)==0&false))? b : a;
    }finally{__CLR4_4_117tq17tqlb90pb0r.R.flushNeeded();}}

    /** Compute the maximum of two values
     * @param a first value
     * @param b second value
     * @return b if a is lesser or equal to b, a otherwise
     */
    public static float max(final float a, final float b) {try{__CLR4_4_117tq17tqlb90pb0r.R.inc(58808);
        __CLR4_4_117tq17tqlb90pb0r.R.inc(58809);if ((((a > b)&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(58810)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(58811)==0&false))) {{
            __CLR4_4_117tq17tqlb90pb0r.R.inc(58812);return a;
        }
        }__CLR4_4_117tq17tqlb90pb0r.R.inc(58813);if ((((a < b)&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(58814)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(58815)==0&false))) {{
            __CLR4_4_117tq17tqlb90pb0r.R.inc(58816);return b;
        }
        /* if either arg is NaN, return NaN */
        }__CLR4_4_117tq17tqlb90pb0r.R.inc(58817);if ((((a != b)&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(58818)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(58819)==0&false))) {{
            __CLR4_4_117tq17tqlb90pb0r.R.inc(58820);return Float.NaN;
        }
        /* min(+0.0,-0.0) == -0.0 */
        /* 0x80000000 == Float.floatToRawIntBits(-0.0d) */
        }__CLR4_4_117tq17tqlb90pb0r.R.inc(58821);int bits = Float.floatToRawIntBits(a);
        __CLR4_4_117tq17tqlb90pb0r.R.inc(58822);if ((((bits == 0x80000000)&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(58823)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(58824)==0&false))) {{
            __CLR4_4_117tq17tqlb90pb0r.R.inc(58825);return b;
        }
        }__CLR4_4_117tq17tqlb90pb0r.R.inc(58826);return a;
    }finally{__CLR4_4_117tq17tqlb90pb0r.R.flushNeeded();}}

    /** Compute the maximum of two values
     * @param a first value
     * @param b second value
     * @return b if a is lesser or equal to b, a otherwise
     */
    public static double max(final double a, final double b) {try{__CLR4_4_117tq17tqlb90pb0r.R.inc(58827);
        __CLR4_4_117tq17tqlb90pb0r.R.inc(58828);if ((((a > b)&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(58829)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(58830)==0&false))) {{
            __CLR4_4_117tq17tqlb90pb0r.R.inc(58831);return a;
        }
        }__CLR4_4_117tq17tqlb90pb0r.R.inc(58832);if ((((a < b)&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(58833)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(58834)==0&false))) {{
            __CLR4_4_117tq17tqlb90pb0r.R.inc(58835);return b;
        }
        /* if either arg is NaN, return NaN */
        }__CLR4_4_117tq17tqlb90pb0r.R.inc(58836);if ((((a != b)&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(58837)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(58838)==0&false))) {{
            __CLR4_4_117tq17tqlb90pb0r.R.inc(58839);return Double.NaN;
        }
        /* min(+0.0,-0.0) == -0.0 */
        /* 0x8000000000000000L == Double.doubleToRawLongBits(-0.0d) */
        }__CLR4_4_117tq17tqlb90pb0r.R.inc(58840);long bits = Double.doubleToRawLongBits(a);
        __CLR4_4_117tq17tqlb90pb0r.R.inc(58841);if ((((bits == 0x8000000000000000L)&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(58842)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(58843)==0&false))) {{
            __CLR4_4_117tq17tqlb90pb0r.R.inc(58844);return b;
        }
        }__CLR4_4_117tq17tqlb90pb0r.R.inc(58845);return a;
    }finally{__CLR4_4_117tq17tqlb90pb0r.R.flushNeeded();}}

    /**
     * Returns the hypotenuse of a triangle with sides {@code x} and {@code y}
     * - sqrt(<i>x</i><sup>2</sup>&nbsp;+<i>y</i><sup>2</sup>)<br/>
     * avoiding intermediate overflow or underflow.
     *
     * <ul>
     * <li> If either argument is infinite, then the result is positive infinity.</li>
     * <li> else, if either argument is NaN then the result is NaN.</li>
     * </ul>
     *
     * @param x a value
     * @param y a value
     * @return sqrt(<i>x</i><sup>2</sup>&nbsp;+<i>y</i><sup>2</sup>)
     */
    public static double hypot(final double x, final double y) {try{__CLR4_4_117tq17tqlb90pb0r.R.inc(58846);
        __CLR4_4_117tq17tqlb90pb0r.R.inc(58847);if ((((Double.isInfinite(x) || Double.isInfinite(y))&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(58848)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(58849)==0&false))) {{
            __CLR4_4_117tq17tqlb90pb0r.R.inc(58850);return Double.POSITIVE_INFINITY;
        } }else {__CLR4_4_117tq17tqlb90pb0r.R.inc(58851);if ((((Double.isNaN(x) || Double.isNaN(y))&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(58852)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(58853)==0&false))) {{
            __CLR4_4_117tq17tqlb90pb0r.R.inc(58854);return Double.NaN;
        } }else {{

            __CLR4_4_117tq17tqlb90pb0r.R.inc(58855);final int expX = getExponent(x);
            __CLR4_4_117tq17tqlb90pb0r.R.inc(58856);final int expY = getExponent(y);
            __CLR4_4_117tq17tqlb90pb0r.R.inc(58857);if ((((expX > expY + 27)&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(58858)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(58859)==0&false))) {{
                // y is neglectible with respect to x
                __CLR4_4_117tq17tqlb90pb0r.R.inc(58860);return abs(x);
            } }else {__CLR4_4_117tq17tqlb90pb0r.R.inc(58861);if ((((expY > expX + 27)&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(58862)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(58863)==0&false))) {{
                // x is neglectible with respect to y
                __CLR4_4_117tq17tqlb90pb0r.R.inc(58864);return abs(y);
            } }else {{

                // find an intermediate scale to avoid both overflow and underflow
                __CLR4_4_117tq17tqlb90pb0r.R.inc(58865);final int middleExp = (expX + expY) / 2;

                // scale parameters without losing precision
                __CLR4_4_117tq17tqlb90pb0r.R.inc(58866);final double scaledX = scalb(x, -middleExp);
                __CLR4_4_117tq17tqlb90pb0r.R.inc(58867);final double scaledY = scalb(y, -middleExp);

                // compute scaled hypotenuse
                __CLR4_4_117tq17tqlb90pb0r.R.inc(58868);final double scaledH = sqrt(scaledX * scaledX + scaledY * scaledY);

                // remove scaling
                __CLR4_4_117tq17tqlb90pb0r.R.inc(58869);return scalb(scaledH, middleExp);

            }

        }}}
    }}}finally{__CLR4_4_117tq17tqlb90pb0r.R.flushNeeded();}}

    /**
     * Computes the remainder as prescribed by the IEEE 754 standard.
     * The remainder value is mathematically equal to {@code x - y*n}
     * where {@code n} is the mathematical integer closest to the exact mathematical value
     * of the quotient {@code x/y}.
     * If two mathematical integers are equally close to {@code x/y} then
     * {@code n} is the integer that is even.
     * <p>
     * <ul>
     * <li>If either operand is NaN, the result is NaN.</li>
     * <li>If the result is not NaN, the sign of the result equals the sign of the dividend.</li>
     * <li>If the dividend is an infinity, or the divisor is a zero, or both, the result is NaN.</li>
     * <li>If the dividend is finite and the divisor is an infinity, the result equals the dividend.</li>
     * <li>If the dividend is a zero and the divisor is finite, the result equals the dividend.</li>
     * </ul>
     * <p><b>Note:</b> this implementation currently delegates to {@link StrictMath#IEEEremainder}
     * @param dividend the number to be divided
     * @param divisor the number by which to divide
     * @return the remainder, rounded
     */
    public static double IEEEremainder(double dividend, double divisor) {try{__CLR4_4_117tq17tqlb90pb0r.R.inc(58870);
        __CLR4_4_117tq17tqlb90pb0r.R.inc(58871);return StrictMath.IEEEremainder(dividend, divisor); // TODO provide our own implementation
    }finally{__CLR4_4_117tq17tqlb90pb0r.R.flushNeeded();}}

    /**
     * Returns the first argument with the sign of the second argument.
     * A NaN {@code sign} argument is treated as positive.
     *
     * @param magnitude the value to return
     * @param sign the sign for the returned value
     * @return the magnitude with the same sign as the {@code sign} argument
     */
    public static double copySign(double magnitude, double sign){try{__CLR4_4_117tq17tqlb90pb0r.R.inc(58872);
        // The highest order bit is going to be zero if the
        // highest order bit of m and s is the same and one otherwise.
        // So (m^s) will be positive if both m and s have the same sign
        // and negative otherwise.
        __CLR4_4_117tq17tqlb90pb0r.R.inc(58873);final long m = Double.doubleToRawLongBits(magnitude); // don't care about NaN
        __CLR4_4_117tq17tqlb90pb0r.R.inc(58874);final long s = Double.doubleToRawLongBits(sign);
        __CLR4_4_117tq17tqlb90pb0r.R.inc(58875);if (((((m^s) >= 0)&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(58876)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(58877)==0&false))) {{
            __CLR4_4_117tq17tqlb90pb0r.R.inc(58878);return magnitude;
        }
        }__CLR4_4_117tq17tqlb90pb0r.R.inc(58879);return -magnitude; // flip sign
    }finally{__CLR4_4_117tq17tqlb90pb0r.R.flushNeeded();}}

    /**
     * Returns the first argument with the sign of the second argument.
     * A NaN {@code sign} argument is treated as positive.
     *
     * @param magnitude the value to return
     * @param sign the sign for the returned value
     * @return the magnitude with the same sign as the {@code sign} argument
     */
    public static float copySign(float magnitude, float sign){try{__CLR4_4_117tq17tqlb90pb0r.R.inc(58880);
        // The highest order bit is going to be zero if the
        // highest order bit of m and s is the same and one otherwise.
        // So (m^s) will be positive if both m and s have the same sign
        // and negative otherwise.
        __CLR4_4_117tq17tqlb90pb0r.R.inc(58881);final int m = Float.floatToRawIntBits(magnitude);
        __CLR4_4_117tq17tqlb90pb0r.R.inc(58882);final int s = Float.floatToRawIntBits(sign);
        __CLR4_4_117tq17tqlb90pb0r.R.inc(58883);if (((((m^s) >= 0)&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(58884)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(58885)==0&false))) {{
            __CLR4_4_117tq17tqlb90pb0r.R.inc(58886);return magnitude;
        }
        }__CLR4_4_117tq17tqlb90pb0r.R.inc(58887);return -magnitude; // flip sign
    }finally{__CLR4_4_117tq17tqlb90pb0r.R.flushNeeded();}}

    /**
     * Return the exponent of a double number, removing the bias.
     * <p>
     * For double numbers of the form 2<sup>x</sup>, the unbiased
     * exponent is exactly x.
     * </p>
     * @param d number from which exponent is requested
     * @return exponent for d in IEEE754 representation, without bias
     */
    public static int getExponent(final double d) {try{__CLR4_4_117tq17tqlb90pb0r.R.inc(58888);
        // NaN and Infinite will return 1024 anywho so can use raw bits
        __CLR4_4_117tq17tqlb90pb0r.R.inc(58889);return (int) ((Double.doubleToRawLongBits(d) >>> 52) & 0x7ff) - 1023;
    }finally{__CLR4_4_117tq17tqlb90pb0r.R.flushNeeded();}}

    /**
     * Return the exponent of a float number, removing the bias.
     * <p>
     * For float numbers of the form 2<sup>x</sup>, the unbiased
     * exponent is exactly x.
     * </p>
     * @param f number from which exponent is requested
     * @return exponent for d in IEEE754 representation, without bias
     */
    public static int getExponent(final float f) {try{__CLR4_4_117tq17tqlb90pb0r.R.inc(58890);
        // NaN and Infinite will return the same exponent anywho so can use raw bits
        __CLR4_4_117tq17tqlb90pb0r.R.inc(58891);return ((Float.floatToRawIntBits(f) >>> 23) & 0xff) - 127;
    }finally{__CLR4_4_117tq17tqlb90pb0r.R.flushNeeded();}}

    /**
     * Print out contents of arrays, and check the length.
     * <p>used to generate the preset arrays originally.</p>
     * @param a unused
     */
    public static void main(String[] a) {try{__CLR4_4_117tq17tqlb90pb0r.R.inc(58892);
        __CLR4_4_117tq17tqlb90pb0r.R.inc(58893);PrintStream out = System.out;
        __CLR4_4_117tq17tqlb90pb0r.R.inc(58894);FastMathCalc.printarray(out, "EXP_INT_TABLE_A", EXP_INT_TABLE_LEN, ExpIntTable.EXP_INT_TABLE_A);
        __CLR4_4_117tq17tqlb90pb0r.R.inc(58895);FastMathCalc.printarray(out, "EXP_INT_TABLE_B", EXP_INT_TABLE_LEN, ExpIntTable.EXP_INT_TABLE_B);
        __CLR4_4_117tq17tqlb90pb0r.R.inc(58896);FastMathCalc.printarray(out, "EXP_FRAC_TABLE_A", EXP_FRAC_TABLE_LEN, ExpFracTable.EXP_FRAC_TABLE_A);
        __CLR4_4_117tq17tqlb90pb0r.R.inc(58897);FastMathCalc.printarray(out, "EXP_FRAC_TABLE_B", EXP_FRAC_TABLE_LEN, ExpFracTable.EXP_FRAC_TABLE_B);
        __CLR4_4_117tq17tqlb90pb0r.R.inc(58898);FastMathCalc.printarray(out, "LN_MANT",LN_MANT_LEN, lnMant.LN_MANT);
        __CLR4_4_117tq17tqlb90pb0r.R.inc(58899);FastMathCalc.printarray(out, "SINE_TABLE_A", SINE_TABLE_LEN, SINE_TABLE_A);
        __CLR4_4_117tq17tqlb90pb0r.R.inc(58900);FastMathCalc.printarray(out, "SINE_TABLE_B", SINE_TABLE_LEN, SINE_TABLE_B);
        __CLR4_4_117tq17tqlb90pb0r.R.inc(58901);FastMathCalc.printarray(out, "COSINE_TABLE_A", SINE_TABLE_LEN, COSINE_TABLE_A);
        __CLR4_4_117tq17tqlb90pb0r.R.inc(58902);FastMathCalc.printarray(out, "COSINE_TABLE_B", SINE_TABLE_LEN, COSINE_TABLE_B);
        __CLR4_4_117tq17tqlb90pb0r.R.inc(58903);FastMathCalc.printarray(out, "TANGENT_TABLE_A", SINE_TABLE_LEN, TANGENT_TABLE_A);
        __CLR4_4_117tq17tqlb90pb0r.R.inc(58904);FastMathCalc.printarray(out, "TANGENT_TABLE_B", SINE_TABLE_LEN, TANGENT_TABLE_B);
    }finally{__CLR4_4_117tq17tqlb90pb0r.R.flushNeeded();}}

    /** Enclose large data table in nested static class so it's only loaded on first access. */
    private static class ExpIntTable {
        /** Exponential evaluated at integer values,
         * exp(x) =  expIntTableA[x + EXP_INT_TABLE_MAX_INDEX] + expIntTableB[x+EXP_INT_TABLE_MAX_INDEX].
         */
        private static final double[] EXP_INT_TABLE_A;
        /** Exponential evaluated at integer values,
         * exp(x) =  expIntTableA[x + EXP_INT_TABLE_MAX_INDEX] + expIntTableB[x+EXP_INT_TABLE_MAX_INDEX]
         */
        private static final double[] EXP_INT_TABLE_B;

        static {try{__CLR4_4_117tq17tqlb90pb0r.R.inc(58905);
            __CLR4_4_117tq17tqlb90pb0r.R.inc(58906);if ((((RECOMPUTE_TABLES_AT_RUNTIME)&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(58907)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(58908)==0&false))) {{
                __CLR4_4_117tq17tqlb90pb0r.R.inc(58909);EXP_INT_TABLE_A = new double[FastMath.EXP_INT_TABLE_LEN];
                __CLR4_4_117tq17tqlb90pb0r.R.inc(58910);EXP_INT_TABLE_B = new double[FastMath.EXP_INT_TABLE_LEN];

                __CLR4_4_117tq17tqlb90pb0r.R.inc(58911);final double tmp[] = new double[2];
                __CLR4_4_117tq17tqlb90pb0r.R.inc(58912);final double recip[] = new double[2];

                // Populate expIntTable
                __CLR4_4_117tq17tqlb90pb0r.R.inc(58913);for (int i = 0; (((i < FastMath.EXP_INT_TABLE_MAX_INDEX)&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(58914)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(58915)==0&false)); i++) {{
                    __CLR4_4_117tq17tqlb90pb0r.R.inc(58916);FastMathCalc.expint(i, tmp);
                    __CLR4_4_117tq17tqlb90pb0r.R.inc(58917);EXP_INT_TABLE_A[i + FastMath.EXP_INT_TABLE_MAX_INDEX] = tmp[0];
                    __CLR4_4_117tq17tqlb90pb0r.R.inc(58918);EXP_INT_TABLE_B[i + FastMath.EXP_INT_TABLE_MAX_INDEX] = tmp[1];

                    __CLR4_4_117tq17tqlb90pb0r.R.inc(58919);if ((((i != 0)&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(58920)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(58921)==0&false))) {{
                        // Negative integer powers
                        __CLR4_4_117tq17tqlb90pb0r.R.inc(58922);FastMathCalc.splitReciprocal(tmp, recip);
                        __CLR4_4_117tq17tqlb90pb0r.R.inc(58923);EXP_INT_TABLE_A[FastMath.EXP_INT_TABLE_MAX_INDEX - i] = recip[0];
                        __CLR4_4_117tq17tqlb90pb0r.R.inc(58924);EXP_INT_TABLE_B[FastMath.EXP_INT_TABLE_MAX_INDEX - i] = recip[1];
                    }
                }}
            }} }else {{
                __CLR4_4_117tq17tqlb90pb0r.R.inc(58925);EXP_INT_TABLE_A = FastMathLiteralArrays.loadExpIntA();
                __CLR4_4_117tq17tqlb90pb0r.R.inc(58926);EXP_INT_TABLE_B = FastMathLiteralArrays.loadExpIntB();
            }
        }}finally{__CLR4_4_117tq17tqlb90pb0r.R.flushNeeded();}}
    }

    /** Enclose large data table in nested static class so it's only loaded on first access. */
    private static class ExpFracTable {
        /** Exponential over the range of 0 - 1 in increments of 2^-10
         * exp(x/1024) =  expFracTableA[x] + expFracTableB[x].
         * 1024 = 2^10
         */
        private static final double[] EXP_FRAC_TABLE_A;
        /** Exponential over the range of 0 - 1 in increments of 2^-10
         * exp(x/1024) =  expFracTableA[x] + expFracTableB[x].
         */
        private static final double[] EXP_FRAC_TABLE_B;

        static {try{__CLR4_4_117tq17tqlb90pb0r.R.inc(58927);
            __CLR4_4_117tq17tqlb90pb0r.R.inc(58928);if ((((RECOMPUTE_TABLES_AT_RUNTIME)&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(58929)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(58930)==0&false))) {{
                __CLR4_4_117tq17tqlb90pb0r.R.inc(58931);EXP_FRAC_TABLE_A = new double[FastMath.EXP_FRAC_TABLE_LEN];
                __CLR4_4_117tq17tqlb90pb0r.R.inc(58932);EXP_FRAC_TABLE_B = new double[FastMath.EXP_FRAC_TABLE_LEN];

                __CLR4_4_117tq17tqlb90pb0r.R.inc(58933);final double tmp[] = new double[2];

                // Populate expFracTable
                __CLR4_4_117tq17tqlb90pb0r.R.inc(58934);final double factor = 1d / (EXP_FRAC_TABLE_LEN - 1);
                __CLR4_4_117tq17tqlb90pb0r.R.inc(58935);for (int i = 0; (((i < EXP_FRAC_TABLE_A.length)&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(58936)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(58937)==0&false)); i++) {{
                    __CLR4_4_117tq17tqlb90pb0r.R.inc(58938);FastMathCalc.slowexp(i * factor, tmp);
                    __CLR4_4_117tq17tqlb90pb0r.R.inc(58939);EXP_FRAC_TABLE_A[i] = tmp[0];
                    __CLR4_4_117tq17tqlb90pb0r.R.inc(58940);EXP_FRAC_TABLE_B[i] = tmp[1];
                }
            }} }else {{
                __CLR4_4_117tq17tqlb90pb0r.R.inc(58941);EXP_FRAC_TABLE_A = FastMathLiteralArrays.loadExpFracA();
                __CLR4_4_117tq17tqlb90pb0r.R.inc(58942);EXP_FRAC_TABLE_B = FastMathLiteralArrays.loadExpFracB();
            }
        }}finally{__CLR4_4_117tq17tqlb90pb0r.R.flushNeeded();}}
    }

    /** Enclose large data table in nested static class so it's only loaded on first access. */
    private static class lnMant {
        /** Extended precision logarithm table over the range 1 - 2 in increments of 2^-10. */
        private static final double[][] LN_MANT;

        static {try{__CLR4_4_117tq17tqlb90pb0r.R.inc(58943);
            __CLR4_4_117tq17tqlb90pb0r.R.inc(58944);if ((((RECOMPUTE_TABLES_AT_RUNTIME)&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(58945)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(58946)==0&false))) {{
                __CLR4_4_117tq17tqlb90pb0r.R.inc(58947);LN_MANT = new double[FastMath.LN_MANT_LEN][];

                // Populate lnMant table
                __CLR4_4_117tq17tqlb90pb0r.R.inc(58948);for (int i = 0; (((i < LN_MANT.length)&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(58949)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(58950)==0&false)); i++) {{
                    __CLR4_4_117tq17tqlb90pb0r.R.inc(58951);final double d = Double.longBitsToDouble( (((long) i) << 42) | 0x3ff0000000000000L );
                    __CLR4_4_117tq17tqlb90pb0r.R.inc(58952);LN_MANT[i] = FastMathCalc.slowLog(d);
                }
            }} }else {{
                __CLR4_4_117tq17tqlb90pb0r.R.inc(58953);LN_MANT = FastMathLiteralArrays.loadLnMant();
            }
        }}finally{__CLR4_4_117tq17tqlb90pb0r.R.flushNeeded();}}
    }

    /** Enclose the Cody/Waite reduction (used in "sin", "cos" and "tan"). */
    private static class CodyWaite {
        /** k */
        private final int finalK;
        /** remA */
        private final double finalRemA;
        /** remB */
        private final double finalRemB;

        /**
         * @param xa Argument.
         */
        CodyWaite(double xa) {try{__CLR4_4_117tq17tqlb90pb0r.R.inc(58954);
            // Estimate k.
            //k = (int)(xa / 1.5707963267948966);
            __CLR4_4_117tq17tqlb90pb0r.R.inc(58955);int k = (int)(xa * 0.6366197723675814);

            // Compute remainder.
            __CLR4_4_117tq17tqlb90pb0r.R.inc(58956);double remA;
            __CLR4_4_117tq17tqlb90pb0r.R.inc(58957);double remB;
            __CLR4_4_117tq17tqlb90pb0r.R.inc(58958);while (true) {{
                __CLR4_4_117tq17tqlb90pb0r.R.inc(58959);double a = -k * 1.570796251296997;
                __CLR4_4_117tq17tqlb90pb0r.R.inc(58960);remA = xa + a;
                __CLR4_4_117tq17tqlb90pb0r.R.inc(58961);remB = -(remA - xa - a);

                __CLR4_4_117tq17tqlb90pb0r.R.inc(58962);a = -k * 7.549789948768648E-8;
                __CLR4_4_117tq17tqlb90pb0r.R.inc(58963);double b = remA;
                __CLR4_4_117tq17tqlb90pb0r.R.inc(58964);remA = a + b;
                __CLR4_4_117tq17tqlb90pb0r.R.inc(58965);remB += -(remA - b - a);

                __CLR4_4_117tq17tqlb90pb0r.R.inc(58966);a = -k * 6.123233995736766E-17;
                __CLR4_4_117tq17tqlb90pb0r.R.inc(58967);b = remA;
                __CLR4_4_117tq17tqlb90pb0r.R.inc(58968);remA = a + b;
                __CLR4_4_117tq17tqlb90pb0r.R.inc(58969);remB += -(remA - b - a);

                __CLR4_4_117tq17tqlb90pb0r.R.inc(58970);if ((((remA > 0)&&(__CLR4_4_117tq17tqlb90pb0r.R.iget(58971)!=0|true))||(__CLR4_4_117tq17tqlb90pb0r.R.iget(58972)==0&false))) {{
                    __CLR4_4_117tq17tqlb90pb0r.R.inc(58973);break;
                }

                // Remainder is negative, so decrement k and try again.
                // This should only happen if the input is very close
                // to an even multiple of pi/2.
                }__CLR4_4_117tq17tqlb90pb0r.R.inc(58974);--k;
            }

            }__CLR4_4_117tq17tqlb90pb0r.R.inc(58975);this.finalK = k;
            __CLR4_4_117tq17tqlb90pb0r.R.inc(58976);this.finalRemA = remA;
            __CLR4_4_117tq17tqlb90pb0r.R.inc(58977);this.finalRemB = remB;
        }finally{__CLR4_4_117tq17tqlb90pb0r.R.flushNeeded();}}

        /**
         * @return k
         */
        int getK() {try{__CLR4_4_117tq17tqlb90pb0r.R.inc(58978);
            __CLR4_4_117tq17tqlb90pb0r.R.inc(58979);return finalK;
        }finally{__CLR4_4_117tq17tqlb90pb0r.R.flushNeeded();}}
        /**
         * @return remA
         */
        double getRemA() {try{__CLR4_4_117tq17tqlb90pb0r.R.inc(58980);
            __CLR4_4_117tq17tqlb90pb0r.R.inc(58981);return finalRemA;
        }finally{__CLR4_4_117tq17tqlb90pb0r.R.flushNeeded();}}
        /**
         * @return remB
         */
        double getRemB() {try{__CLR4_4_117tq17tqlb90pb0r.R.inc(58982);
            __CLR4_4_117tq17tqlb90pb0r.R.inc(58983);return finalRemB;
        }finally{__CLR4_4_117tq17tqlb90pb0r.R.flushNeeded();}}
    }
}
