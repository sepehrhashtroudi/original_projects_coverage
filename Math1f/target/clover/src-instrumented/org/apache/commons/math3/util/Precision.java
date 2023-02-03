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

import java.math.BigDecimal;

import org.apache.commons.math3.exception.MathArithmeticException;
import org.apache.commons.math3.exception.MathIllegalArgumentException;
import org.apache.commons.math3.exception.util.LocalizedFormats;

/**
 * Utilities for comparing numbers.
 *
 * @since 3.0
 * @version $Id$
 */
@java.lang.SuppressWarnings({"fallthrough"}) public class Precision {public static class __CLR4_4_11ay81ay8lb90pbba{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,61009,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /**
     * <p>
     * Largest double-precision floating-point number such that
     * {@code 1 + EPSILON} is numerically equal to 1. This value is an upper
     * bound on the relative error due to rounding real numbers to double
     * precision floating-point numbers.
     * </p>
     * <p>
     * In IEEE 754 arithmetic, this is 2<sup>-53</sup>.
     * </p>
     *
     * @see <a href="http://en.wikipedia.org/wiki/Machine_epsilon">Machine epsilon</a>
     */
    public static final double EPSILON;

    /**
     * Safe minimum, such that {@code 1 / SAFE_MIN} does not overflow.
     * <br/>
     * In IEEE 754 arithmetic, this is also the smallest normalized
     * number 2<sup>-1022</sup>.
     */
    public static final double SAFE_MIN;

    /** Exponent offset in IEEE754 representation. */
    private static final long EXPONENT_OFFSET = 1023l;

    /** Offset to order signed double numbers lexicographically. */
    private static final long SGN_MASK = 0x8000000000000000L;
    /** Offset to order signed double numbers lexicographically. */
    private static final int SGN_MASK_FLOAT = 0x80000000;

    static {try{__CLR4_4_11ay81ay8lb90pbba.R.inc(60848);
        /*
         *  This was previously expressed as = 0x1.0p-53;
         *  However, OpenJDK (Sparc Solaris) cannot handle such small
         *  constants: MATH-721
         */
        __CLR4_4_11ay81ay8lb90pbba.R.inc(60849);EPSILON = Double.longBitsToDouble((EXPONENT_OFFSET - 53l) << 52);

        /*
         * This was previously expressed as = 0x1.0p-1022;
         * However, OpenJDK (Sparc Solaris) cannot handle such small
         * constants: MATH-721
         */
        __CLR4_4_11ay81ay8lb90pbba.R.inc(60850);SAFE_MIN = Double.longBitsToDouble((EXPONENT_OFFSET - 1022l) << 52);
    }finally{__CLR4_4_11ay81ay8lb90pbba.R.flushNeeded();}}

    /**
     * Private constructor.
     */
    private Precision() {try{__CLR4_4_11ay81ay8lb90pbba.R.inc(60851);}finally{__CLR4_4_11ay81ay8lb90pbba.R.flushNeeded();}}

    /**
     * Compares two numbers given some amount of allowed error.
     *
     * @param x the first number
     * @param y the second number
     * @param eps the amount of error to allow when checking for equality
     * @return <ul><li>0 if  {@link #equals(double, double, double) equals(x, y, eps)}</li>
     *       <li>&lt; 0 if !{@link #equals(double, double, double) equals(x, y, eps)} &amp;&amp; x &lt; y</li>
     *       <li>> 0 if !{@link #equals(double, double, double) equals(x, y, eps)} &amp;&amp; x > y</li></ul>
     */
    public static int compareTo(double x, double y, double eps) {try{__CLR4_4_11ay81ay8lb90pbba.R.inc(60852);
        __CLR4_4_11ay81ay8lb90pbba.R.inc(60853);if ((((equals(x, y, eps))&&(__CLR4_4_11ay81ay8lb90pbba.R.iget(60854)!=0|true))||(__CLR4_4_11ay81ay8lb90pbba.R.iget(60855)==0&false))) {{
            __CLR4_4_11ay81ay8lb90pbba.R.inc(60856);return 0;
        } }else {__CLR4_4_11ay81ay8lb90pbba.R.inc(60857);if ((((x < y)&&(__CLR4_4_11ay81ay8lb90pbba.R.iget(60858)!=0|true))||(__CLR4_4_11ay81ay8lb90pbba.R.iget(60859)==0&false))) {{
            __CLR4_4_11ay81ay8lb90pbba.R.inc(60860);return -1;
        }
        }}__CLR4_4_11ay81ay8lb90pbba.R.inc(60861);return 1;
    }finally{__CLR4_4_11ay81ay8lb90pbba.R.flushNeeded();}}

    /**
     * Compares two numbers given some amount of allowed error.
     * Two float numbers are considered equal if there are {@code (maxUlps - 1)}
     * (or fewer) floating point numbers between them, i.e. two adjacent floating
     * point numbers are considered equal.
     * Adapted from <a
     * href="http://www.cygnus-software.com/papers/comparingfloats/comparingfloats.htm">
     * Bruce Dawson</a>
     *
     * @param x first value
     * @param y second value
     * @param maxUlps {@code (maxUlps - 1)} is the number of floating point
     * values between {@code x} and {@code y}.
     * @return <ul><li>0 if  {@link #equals(double, double, int) equals(x, y, maxUlps)}</li>
     *       <li>&lt; 0 if !{@link #equals(double, double, int) equals(x, y, maxUlps)} &amp;&amp; x &lt; y</li>
     *       <li>> 0 if !{@link #equals(double, double, int) equals(x, y, maxUlps)} &amp;&amp; x > y</li></ul>
     */
    public static int compareTo(final double x, final double y, final int maxUlps) {try{__CLR4_4_11ay81ay8lb90pbba.R.inc(60862);
        __CLR4_4_11ay81ay8lb90pbba.R.inc(60863);if ((((equals(x, y, maxUlps))&&(__CLR4_4_11ay81ay8lb90pbba.R.iget(60864)!=0|true))||(__CLR4_4_11ay81ay8lb90pbba.R.iget(60865)==0&false))) {{
            __CLR4_4_11ay81ay8lb90pbba.R.inc(60866);return 0;
        } }else {__CLR4_4_11ay81ay8lb90pbba.R.inc(60867);if ((((x < y)&&(__CLR4_4_11ay81ay8lb90pbba.R.iget(60868)!=0|true))||(__CLR4_4_11ay81ay8lb90pbba.R.iget(60869)==0&false))) {{
            __CLR4_4_11ay81ay8lb90pbba.R.inc(60870);return -1;
        }
        }}__CLR4_4_11ay81ay8lb90pbba.R.inc(60871);return 1;
    }finally{__CLR4_4_11ay81ay8lb90pbba.R.flushNeeded();}}

    /**
     * Returns true iff they are equal as defined by
     * {@link #equals(float,float,int) equals(x, y, 1)}.
     *
     * @param x first value
     * @param y second value
     * @return {@code true} if the values are equal.
     */
    public static boolean equals(float x, float y) {try{__CLR4_4_11ay81ay8lb90pbba.R.inc(60872);
        __CLR4_4_11ay81ay8lb90pbba.R.inc(60873);return equals(x, y, 1);
    }finally{__CLR4_4_11ay81ay8lb90pbba.R.flushNeeded();}}

    /**
     * Returns true if both arguments are NaN or neither is NaN and they are
     * equal as defined by {@link #equals(float,float) equals(x, y, 1)}.
     *
     * @param x first value
     * @param y second value
     * @return {@code true} if the values are equal or both are NaN.
     * @since 2.2
     */
    public static boolean equalsIncludingNaN(float x, float y) {try{__CLR4_4_11ay81ay8lb90pbba.R.inc(60874);
        __CLR4_4_11ay81ay8lb90pbba.R.inc(60875);return (Float.isNaN(x) && Float.isNaN(y)) || equals(x, y, 1);
    }finally{__CLR4_4_11ay81ay8lb90pbba.R.flushNeeded();}}

    /**
     * Returns true if both arguments are equal or within the range of allowed
     * error (inclusive).
     *
     * @param x first value
     * @param y second value
     * @param eps the amount of absolute error to allow.
     * @return {@code true} if the values are equal or within range of each other.
     * @since 2.2
     */
    public static boolean equals(float x, float y, float eps) {try{__CLR4_4_11ay81ay8lb90pbba.R.inc(60876);
        __CLR4_4_11ay81ay8lb90pbba.R.inc(60877);return equals(x, y, 1) || FastMath.abs(y - x) <= eps;
    }finally{__CLR4_4_11ay81ay8lb90pbba.R.flushNeeded();}}

    /**
     * Returns true if both arguments are NaN or are equal or within the range
     * of allowed error (inclusive).
     *
     * @param x first value
     * @param y second value
     * @param eps the amount of absolute error to allow.
     * @return {@code true} if the values are equal or within range of each other,
     * or both are NaN.
     * @since 2.2
     */
    public static boolean equalsIncludingNaN(float x, float y, float eps) {try{__CLR4_4_11ay81ay8lb90pbba.R.inc(60878);
        __CLR4_4_11ay81ay8lb90pbba.R.inc(60879);return equalsIncludingNaN(x, y) || (FastMath.abs(y - x) <= eps);
    }finally{__CLR4_4_11ay81ay8lb90pbba.R.flushNeeded();}}

    /**
     * Returns true if both arguments are equal or within the range of allowed
     * error (inclusive).
     * Two float numbers are considered equal if there are {@code (maxUlps - 1)}
     * (or fewer) floating point numbers between them, i.e. two adjacent floating
     * point numbers are considered equal.
     * Adapted from <a
     * href="http://www.cygnus-software.com/papers/comparingfloats/comparingfloats.htm">
     * Bruce Dawson</a>
     *
     * @param x first value
     * @param y second value
     * @param maxUlps {@code (maxUlps - 1)} is the number of floating point
     * values between {@code x} and {@code y}.
     * @return {@code true} if there are fewer than {@code maxUlps} floating
     * point values between {@code x} and {@code y}.
     * @since 2.2
     */
    public static boolean equals(float x, float y, int maxUlps) {try{__CLR4_4_11ay81ay8lb90pbba.R.inc(60880);
        __CLR4_4_11ay81ay8lb90pbba.R.inc(60881);int xInt = Float.floatToIntBits(x);
        __CLR4_4_11ay81ay8lb90pbba.R.inc(60882);int yInt = Float.floatToIntBits(y);

        // Make lexicographically ordered as a two's-complement integer.
        __CLR4_4_11ay81ay8lb90pbba.R.inc(60883);if ((((xInt < 0)&&(__CLR4_4_11ay81ay8lb90pbba.R.iget(60884)!=0|true))||(__CLR4_4_11ay81ay8lb90pbba.R.iget(60885)==0&false))) {{
            __CLR4_4_11ay81ay8lb90pbba.R.inc(60886);xInt = SGN_MASK_FLOAT - xInt;
        }
        }__CLR4_4_11ay81ay8lb90pbba.R.inc(60887);if ((((yInt < 0)&&(__CLR4_4_11ay81ay8lb90pbba.R.iget(60888)!=0|true))||(__CLR4_4_11ay81ay8lb90pbba.R.iget(60889)==0&false))) {{
            __CLR4_4_11ay81ay8lb90pbba.R.inc(60890);yInt = SGN_MASK_FLOAT - yInt;
        }

        }__CLR4_4_11ay81ay8lb90pbba.R.inc(60891);final boolean isEqual = FastMath.abs(xInt - yInt) <= maxUlps;

        __CLR4_4_11ay81ay8lb90pbba.R.inc(60892);return isEqual && !Float.isNaN(x) && !Float.isNaN(y);
    }finally{__CLR4_4_11ay81ay8lb90pbba.R.flushNeeded();}}

    /**
     * Returns true if both arguments are NaN or if they are equal as defined
     * by {@link #equals(float,float,int) equals(x, y, maxUlps)}.
     *
     * @param x first value
     * @param y second value
     * @param maxUlps {@code (maxUlps - 1)} is the number of floating point
     * values between {@code x} and {@code y}.
     * @return {@code true} if both arguments are NaN or if there are less than
     * {@code maxUlps} floating point values between {@code x} and {@code y}.
     * @since 2.2
     */
    public static boolean equalsIncludingNaN(float x, float y, int maxUlps) {try{__CLR4_4_11ay81ay8lb90pbba.R.inc(60893);
        __CLR4_4_11ay81ay8lb90pbba.R.inc(60894);return (Float.isNaN(x) && Float.isNaN(y)) || equals(x, y, maxUlps);
    }finally{__CLR4_4_11ay81ay8lb90pbba.R.flushNeeded();}}

    /**
     * Returns true iff they are equal as defined by
     * {@link #equals(double,double,int) equals(x, y, 1)}.
     *
     * @param x first value
     * @param y second value
     * @return {@code true} if the values are equal.
     */
    public static boolean equals(double x, double y) {try{__CLR4_4_11ay81ay8lb90pbba.R.inc(60895);
        __CLR4_4_11ay81ay8lb90pbba.R.inc(60896);return equals(x, y, 1);
    }finally{__CLR4_4_11ay81ay8lb90pbba.R.flushNeeded();}}

    /**
     * Returns true if both arguments are NaN or neither is NaN and they are
     * equal as defined by {@link #equals(double,double) equals(x, y, 1)}.
     *
     * @param x first value
     * @param y second value
     * @return {@code true} if the values are equal or both are NaN.
     * @since 2.2
     */
    public static boolean equalsIncludingNaN(double x, double y) {try{__CLR4_4_11ay81ay8lb90pbba.R.inc(60897);
        __CLR4_4_11ay81ay8lb90pbba.R.inc(60898);return (Double.isNaN(x) && Double.isNaN(y)) || equals(x, y, 1);
    }finally{__CLR4_4_11ay81ay8lb90pbba.R.flushNeeded();}}

    /**
     * Returns {@code true} if there is no double value strictly between the
     * arguments or the difference between them is within the range of allowed
     * error (inclusive).
     *
     * @param x First value.
     * @param y Second value.
     * @param eps Amount of allowed absolute error.
     * @return {@code true} if the values are two adjacent floating point
     * numbers or they are within range of each other.
     */
    public static boolean equals(double x, double y, double eps) {try{__CLR4_4_11ay81ay8lb90pbba.R.inc(60899);
        __CLR4_4_11ay81ay8lb90pbba.R.inc(60900);return equals(x, y, 1) || FastMath.abs(y - x) <= eps;
    }finally{__CLR4_4_11ay81ay8lb90pbba.R.flushNeeded();}}

    /**
     * Returns {@code true} if there is no double value strictly between the
     * arguments or the reltaive difference between them is smaller or equal
     * to the given tolerance.
     *
     * @param x First value.
     * @param y Second value.
     * @param eps Amount of allowed relative error.
     * @return {@code true} if the values are two adjacent floating point
     * numbers or they are within range of each other.
     * @since 3.1
     */
    public static boolean equalsWithRelativeTolerance(double x, double y, double eps) {try{__CLR4_4_11ay81ay8lb90pbba.R.inc(60901);
        __CLR4_4_11ay81ay8lb90pbba.R.inc(60902);if ((((equals(x, y, 1))&&(__CLR4_4_11ay81ay8lb90pbba.R.iget(60903)!=0|true))||(__CLR4_4_11ay81ay8lb90pbba.R.iget(60904)==0&false))) {{
            __CLR4_4_11ay81ay8lb90pbba.R.inc(60905);return true;
        }

        }__CLR4_4_11ay81ay8lb90pbba.R.inc(60906);final double absoluteMax = FastMath.max(FastMath.abs(x), FastMath.abs(y));
        __CLR4_4_11ay81ay8lb90pbba.R.inc(60907);final double relativeDifference = FastMath.abs((x - y) / absoluteMax);

        __CLR4_4_11ay81ay8lb90pbba.R.inc(60908);return relativeDifference <= eps;
    }finally{__CLR4_4_11ay81ay8lb90pbba.R.flushNeeded();}}

    /**
     * Returns true if both arguments are NaN or are equal or within the range
     * of allowed error (inclusive).
     *
     * @param x first value
     * @param y second value
     * @param eps the amount of absolute error to allow.
     * @return {@code true} if the values are equal or within range of each other,
     * or both are NaN.
     * @since 2.2
     */
    public static boolean equalsIncludingNaN(double x, double y, double eps) {try{__CLR4_4_11ay81ay8lb90pbba.R.inc(60909);
        __CLR4_4_11ay81ay8lb90pbba.R.inc(60910);return equalsIncludingNaN(x, y) || (FastMath.abs(y - x) <= eps);
    }finally{__CLR4_4_11ay81ay8lb90pbba.R.flushNeeded();}}

    /**
     * Returns true if both arguments are equal or within the range of allowed
     * error (inclusive).
     * Two float numbers are considered equal if there are {@code (maxUlps - 1)}
     * (or fewer) floating point numbers between them, i.e. two adjacent floating
     * point numbers are considered equal.
     * Adapted from <a
     * href="http://www.cygnus-software.com/papers/comparingfloats/comparingfloats.htm">
     * Bruce Dawson</a>
     *
     * @param x first value
     * @param y second value
     * @param maxUlps {@code (maxUlps - 1)} is the number of floating point
     * values between {@code x} and {@code y}.
     * @return {@code true} if there are fewer than {@code maxUlps} floating
     * point values between {@code x} and {@code y}.
     */
    public static boolean equals(double x, double y, int maxUlps) {try{__CLR4_4_11ay81ay8lb90pbba.R.inc(60911);
        __CLR4_4_11ay81ay8lb90pbba.R.inc(60912);long xInt = Double.doubleToLongBits(x);
        __CLR4_4_11ay81ay8lb90pbba.R.inc(60913);long yInt = Double.doubleToLongBits(y);

        // Make lexicographically ordered as a two's-complement integer.
        __CLR4_4_11ay81ay8lb90pbba.R.inc(60914);if ((((xInt < 0)&&(__CLR4_4_11ay81ay8lb90pbba.R.iget(60915)!=0|true))||(__CLR4_4_11ay81ay8lb90pbba.R.iget(60916)==0&false))) {{
            __CLR4_4_11ay81ay8lb90pbba.R.inc(60917);xInt = SGN_MASK - xInt;
        }
        }__CLR4_4_11ay81ay8lb90pbba.R.inc(60918);if ((((yInt < 0)&&(__CLR4_4_11ay81ay8lb90pbba.R.iget(60919)!=0|true))||(__CLR4_4_11ay81ay8lb90pbba.R.iget(60920)==0&false))) {{
            __CLR4_4_11ay81ay8lb90pbba.R.inc(60921);yInt = SGN_MASK - yInt;
        }

        }__CLR4_4_11ay81ay8lb90pbba.R.inc(60922);final boolean isEqual = FastMath.abs(xInt - yInt) <= maxUlps;

        __CLR4_4_11ay81ay8lb90pbba.R.inc(60923);return isEqual && !Double.isNaN(x) && !Double.isNaN(y);
    }finally{__CLR4_4_11ay81ay8lb90pbba.R.flushNeeded();}}

    /**
     * Returns true if both arguments are NaN or if they are equal as defined
     * by {@link #equals(double,double,int) equals(x, y, maxUlps)}.
     *
     * @param x first value
     * @param y second value
     * @param maxUlps {@code (maxUlps - 1)} is the number of floating point
     * values between {@code x} and {@code y}.
     * @return {@code true} if both arguments are NaN or if there are less than
     * {@code maxUlps} floating point values between {@code x} and {@code y}.
     * @since 2.2
     */
    public static boolean equalsIncludingNaN(double x, double y, int maxUlps) {try{__CLR4_4_11ay81ay8lb90pbba.R.inc(60924);
        __CLR4_4_11ay81ay8lb90pbba.R.inc(60925);return (Double.isNaN(x) && Double.isNaN(y)) || equals(x, y, maxUlps);
    }finally{__CLR4_4_11ay81ay8lb90pbba.R.flushNeeded();}}

    /**
     * Rounds the given value to the specified number of decimal places.
     * The value is rounded using the {@link BigDecimal#ROUND_HALF_UP} method.
     *
     * @param x Value to round.
     * @param scale Number of digits to the right of the decimal point.
     * @return the rounded value.
     * @since 1.1 (previously in {@code MathUtils}, moved as of version 3.0)
     */
    public static double round(double x, int scale) {try{__CLR4_4_11ay81ay8lb90pbba.R.inc(60926);
        __CLR4_4_11ay81ay8lb90pbba.R.inc(60927);return round(x, scale, BigDecimal.ROUND_HALF_UP);
    }finally{__CLR4_4_11ay81ay8lb90pbba.R.flushNeeded();}}

    /**
     * Rounds the given value to the specified number of decimal places.
     * The value is rounded using the given method which is any method defined
     * in {@link BigDecimal}.
     * If {@code x} is infinite or {@code NaN}, then the value of {@code x} is
     * returned unchanged, regardless of the other parameters.
     *
     * @param x Value to round.
     * @param scale Number of digits to the right of the decimal point.
     * @param roundingMethod Rounding method as defined in {@link BigDecimal}.
     * @return the rounded value.
     * @throws ArithmeticException if {@code roundingMethod == ROUND_UNNECESSARY}
     * and the specified scaling operation would require rounding.
     * @throws IllegalArgumentException if {@code roundingMethod} does not
     * represent a valid rounding mode.
     * @since 1.1 (previously in {@code MathUtils}, moved as of version 3.0)
     */
    public static double round(double x, int scale, int roundingMethod) {try{__CLR4_4_11ay81ay8lb90pbba.R.inc(60928);
        __CLR4_4_11ay81ay8lb90pbba.R.inc(60929);try {
            __CLR4_4_11ay81ay8lb90pbba.R.inc(60930);return (new BigDecimal
                   (Double.toString(x))
                   .setScale(scale, roundingMethod))
                   .doubleValue();
        } catch (NumberFormatException ex) {
            __CLR4_4_11ay81ay8lb90pbba.R.inc(60931);if ((((Double.isInfinite(x))&&(__CLR4_4_11ay81ay8lb90pbba.R.iget(60932)!=0|true))||(__CLR4_4_11ay81ay8lb90pbba.R.iget(60933)==0&false))) {{
                __CLR4_4_11ay81ay8lb90pbba.R.inc(60934);return x;
            } }else {{
                __CLR4_4_11ay81ay8lb90pbba.R.inc(60935);return Double.NaN;
            }
        }}
    }finally{__CLR4_4_11ay81ay8lb90pbba.R.flushNeeded();}}

    /**
     * Rounds the given value to the specified number of decimal places.
     * The value is rounded using the {@link BigDecimal#ROUND_HALF_UP} method.
     *
     * @param x Value to round.
     * @param scale Number of digits to the right of the decimal point.
     * @return the rounded value.
     * @since 1.1 (previously in {@code MathUtils}, moved as of version 3.0)
     */
    public static float round(float x, int scale) {try{__CLR4_4_11ay81ay8lb90pbba.R.inc(60936);
        __CLR4_4_11ay81ay8lb90pbba.R.inc(60937);return round(x, scale, BigDecimal.ROUND_HALF_UP);
    }finally{__CLR4_4_11ay81ay8lb90pbba.R.flushNeeded();}}

    /**
     * Rounds the given value to the specified number of decimal places.
     * The value is rounded using the given method which is any method defined
     * in {@link BigDecimal}.
     *
     * @param x Value to round.
     * @param scale Number of digits to the right of the decimal point.
     * @param roundingMethod Rounding method as defined in {@link BigDecimal}.
     * @return the rounded value.
     * @since 1.1 (previously in {@code MathUtils}, moved as of version 3.0)
     * @throws MathArithmeticException if an exact operation is required but result is not exact
     * @throws MathIllegalArgumentException if {@code roundingMethod} is not a valid rounding method.
     */
    public static float round(float x, int scale, int roundingMethod)
        throws MathArithmeticException, MathIllegalArgumentException {try{__CLR4_4_11ay81ay8lb90pbba.R.inc(60938);
        __CLR4_4_11ay81ay8lb90pbba.R.inc(60939);final float sign = FastMath.copySign(1f, x);
        __CLR4_4_11ay81ay8lb90pbba.R.inc(60940);final float factor = (float) FastMath.pow(10.0f, scale) * sign;
        __CLR4_4_11ay81ay8lb90pbba.R.inc(60941);return (float) roundUnscaled(x * factor, sign, roundingMethod) / factor;
    }finally{__CLR4_4_11ay81ay8lb90pbba.R.flushNeeded();}}

    /**
     * Rounds the given non-negative value to the "nearest" integer. Nearest is
     * determined by the rounding method specified. Rounding methods are defined
     * in {@link BigDecimal}.
     *
     * @param unscaled Value to round.
     * @param sign Sign of the original, scaled value.
     * @param roundingMethod Rounding method, as defined in {@link BigDecimal}.
     * @return the rounded value.
     * @throws MathArithmeticException if an exact operation is required but result is not exact
     * @throws MathIllegalArgumentException if {@code roundingMethod} is not a valid rounding method.
     * @since 1.1 (previously in {@code MathUtils}, moved as of version 3.0)
     */
    private static double roundUnscaled(double unscaled,
                                        double sign,
                                        int roundingMethod)
        throws MathArithmeticException, MathIllegalArgumentException {try{__CLR4_4_11ay81ay8lb90pbba.R.inc(60942);
        boolean __CLB4_4_1_bool0=false;__CLR4_4_11ay81ay8lb90pbba.R.inc(60943);switch (roundingMethod) {
        case BigDecimal.ROUND_CEILING :if (!__CLB4_4_1_bool0) {__CLR4_4_11ay81ay8lb90pbba.R.inc(60944);__CLB4_4_1_bool0=true;}
            __CLR4_4_11ay81ay8lb90pbba.R.inc(60945);if ((((sign == -1)&&(__CLR4_4_11ay81ay8lb90pbba.R.iget(60946)!=0|true))||(__CLR4_4_11ay81ay8lb90pbba.R.iget(60947)==0&false))) {{
                __CLR4_4_11ay81ay8lb90pbba.R.inc(60948);unscaled = FastMath.floor(FastMath.nextAfter(unscaled, Double.NEGATIVE_INFINITY));
            } }else {{
                __CLR4_4_11ay81ay8lb90pbba.R.inc(60949);unscaled = FastMath.ceil(FastMath.nextAfter(unscaled, Double.POSITIVE_INFINITY));
            }
            }__CLR4_4_11ay81ay8lb90pbba.R.inc(60950);break;
        case BigDecimal.ROUND_DOWN :if (!__CLB4_4_1_bool0) {__CLR4_4_11ay81ay8lb90pbba.R.inc(60951);__CLB4_4_1_bool0=true;}
            __CLR4_4_11ay81ay8lb90pbba.R.inc(60952);unscaled = FastMath.floor(FastMath.nextAfter(unscaled, Double.NEGATIVE_INFINITY));
            __CLR4_4_11ay81ay8lb90pbba.R.inc(60953);break;
        case BigDecimal.ROUND_FLOOR :if (!__CLB4_4_1_bool0) {__CLR4_4_11ay81ay8lb90pbba.R.inc(60954);__CLB4_4_1_bool0=true;}
            __CLR4_4_11ay81ay8lb90pbba.R.inc(60955);if ((((sign == -1)&&(__CLR4_4_11ay81ay8lb90pbba.R.iget(60956)!=0|true))||(__CLR4_4_11ay81ay8lb90pbba.R.iget(60957)==0&false))) {{
                __CLR4_4_11ay81ay8lb90pbba.R.inc(60958);unscaled = FastMath.ceil(FastMath.nextAfter(unscaled, Double.POSITIVE_INFINITY));
            } }else {{
                __CLR4_4_11ay81ay8lb90pbba.R.inc(60959);unscaled = FastMath.floor(FastMath.nextAfter(unscaled, Double.NEGATIVE_INFINITY));
            }
            }__CLR4_4_11ay81ay8lb90pbba.R.inc(60960);break;
        case BigDecimal.ROUND_HALF_DOWN :if (!__CLB4_4_1_bool0) {__CLR4_4_11ay81ay8lb90pbba.R.inc(60961);__CLB4_4_1_bool0=true;} {
            __CLR4_4_11ay81ay8lb90pbba.R.inc(60962);unscaled = FastMath.nextAfter(unscaled, Double.NEGATIVE_INFINITY);
            __CLR4_4_11ay81ay8lb90pbba.R.inc(60963);double fraction = unscaled - FastMath.floor(unscaled);
            __CLR4_4_11ay81ay8lb90pbba.R.inc(60964);if ((((fraction > 0.5)&&(__CLR4_4_11ay81ay8lb90pbba.R.iget(60965)!=0|true))||(__CLR4_4_11ay81ay8lb90pbba.R.iget(60966)==0&false))) {{
                __CLR4_4_11ay81ay8lb90pbba.R.inc(60967);unscaled = FastMath.ceil(unscaled);
            } }else {{
                __CLR4_4_11ay81ay8lb90pbba.R.inc(60968);unscaled = FastMath.floor(unscaled);
            }
            }__CLR4_4_11ay81ay8lb90pbba.R.inc(60969);break;
        }
        case BigDecimal.ROUND_HALF_EVEN :if (!__CLB4_4_1_bool0) {__CLR4_4_11ay81ay8lb90pbba.R.inc(60970);__CLB4_4_1_bool0=true;} {
            __CLR4_4_11ay81ay8lb90pbba.R.inc(60971);double fraction = unscaled - FastMath.floor(unscaled);
            __CLR4_4_11ay81ay8lb90pbba.R.inc(60972);if ((((fraction > 0.5)&&(__CLR4_4_11ay81ay8lb90pbba.R.iget(60973)!=0|true))||(__CLR4_4_11ay81ay8lb90pbba.R.iget(60974)==0&false))) {{
                __CLR4_4_11ay81ay8lb90pbba.R.inc(60975);unscaled = FastMath.ceil(unscaled);
            } }else {__CLR4_4_11ay81ay8lb90pbba.R.inc(60976);if ((((fraction < 0.5)&&(__CLR4_4_11ay81ay8lb90pbba.R.iget(60977)!=0|true))||(__CLR4_4_11ay81ay8lb90pbba.R.iget(60978)==0&false))) {{
                __CLR4_4_11ay81ay8lb90pbba.R.inc(60979);unscaled = FastMath.floor(unscaled);
            } }else {{
                // The following equality test is intentional and needed for rounding purposes
                __CLR4_4_11ay81ay8lb90pbba.R.inc(60980);if ((((FastMath.floor(unscaled) / 2.0 == FastMath.floor(Math
                    .floor(unscaled) / 2.0))&&(__CLR4_4_11ay81ay8lb90pbba.R.iget(60981)!=0|true))||(__CLR4_4_11ay81ay8lb90pbba.R.iget(60982)==0&false))) {{ // even
                    __CLR4_4_11ay81ay8lb90pbba.R.inc(60983);unscaled = FastMath.floor(unscaled);
                } }else {{ // odd
                    __CLR4_4_11ay81ay8lb90pbba.R.inc(60984);unscaled = FastMath.ceil(unscaled);
                }
            }}
            }}__CLR4_4_11ay81ay8lb90pbba.R.inc(60985);break;
        }
        case BigDecimal.ROUND_HALF_UP :if (!__CLB4_4_1_bool0) {__CLR4_4_11ay81ay8lb90pbba.R.inc(60986);__CLB4_4_1_bool0=true;} {
            __CLR4_4_11ay81ay8lb90pbba.R.inc(60987);unscaled = FastMath.nextAfter(unscaled, Double.POSITIVE_INFINITY);
            __CLR4_4_11ay81ay8lb90pbba.R.inc(60988);double fraction = unscaled - FastMath.floor(unscaled);
            __CLR4_4_11ay81ay8lb90pbba.R.inc(60989);if ((((fraction >= 0.5)&&(__CLR4_4_11ay81ay8lb90pbba.R.iget(60990)!=0|true))||(__CLR4_4_11ay81ay8lb90pbba.R.iget(60991)==0&false))) {{
                __CLR4_4_11ay81ay8lb90pbba.R.inc(60992);unscaled = FastMath.ceil(unscaled);
            } }else {{
                __CLR4_4_11ay81ay8lb90pbba.R.inc(60993);unscaled = FastMath.floor(unscaled);
            }
            }__CLR4_4_11ay81ay8lb90pbba.R.inc(60994);break;
        }
        case BigDecimal.ROUND_UNNECESSARY :if (!__CLB4_4_1_bool0) {__CLR4_4_11ay81ay8lb90pbba.R.inc(60995);__CLB4_4_1_bool0=true;}
            __CLR4_4_11ay81ay8lb90pbba.R.inc(60996);if ((((unscaled != FastMath.floor(unscaled))&&(__CLR4_4_11ay81ay8lb90pbba.R.iget(60997)!=0|true))||(__CLR4_4_11ay81ay8lb90pbba.R.iget(60998)==0&false))) {{
                __CLR4_4_11ay81ay8lb90pbba.R.inc(60999);throw new MathArithmeticException();
            }
            }__CLR4_4_11ay81ay8lb90pbba.R.inc(61000);break;
        case BigDecimal.ROUND_UP :if (!__CLB4_4_1_bool0) {__CLR4_4_11ay81ay8lb90pbba.R.inc(61001);__CLB4_4_1_bool0=true;}
            __CLR4_4_11ay81ay8lb90pbba.R.inc(61002);unscaled = FastMath.ceil(FastMath.nextAfter(unscaled,  Double.POSITIVE_INFINITY));
            __CLR4_4_11ay81ay8lb90pbba.R.inc(61003);break;
        default :if (!__CLB4_4_1_bool0) {__CLR4_4_11ay81ay8lb90pbba.R.inc(61004);__CLB4_4_1_bool0=true;}
            __CLR4_4_11ay81ay8lb90pbba.R.inc(61005);throw new MathIllegalArgumentException(LocalizedFormats.INVALID_ROUNDING_METHOD,
                                                   roundingMethod,
                                                   "ROUND_CEILING", BigDecimal.ROUND_CEILING,
                                                   "ROUND_DOWN", BigDecimal.ROUND_DOWN,
                                                   "ROUND_FLOOR", BigDecimal.ROUND_FLOOR,
                                                   "ROUND_HALF_DOWN", BigDecimal.ROUND_HALF_DOWN,
                                                   "ROUND_HALF_EVEN", BigDecimal.ROUND_HALF_EVEN,
                                                   "ROUND_HALF_UP", BigDecimal.ROUND_HALF_UP,
                                                   "ROUND_UNNECESSARY", BigDecimal.ROUND_UNNECESSARY,
                                                   "ROUND_UP", BigDecimal.ROUND_UP);
        }
        __CLR4_4_11ay81ay8lb90pbba.R.inc(61006);return unscaled;
    }finally{__CLR4_4_11ay81ay8lb90pbba.R.flushNeeded();}}


    /**
     * Computes a number {@code delta} close to {@code originalDelta} with
     * the property that <pre><code>
     *   x + delta - x
     * </code></pre>
     * is exactly machine-representable.
     * This is useful when computing numerical derivatives, in order to reduce
     * roundoff errors.
     *
     * @param x Value.
     * @param originalDelta Offset value.
     * @return a number {@code delta} so that {@code x + delta} and {@code x}
     * differ by a representable floating number.
     */
    public static double representableDelta(double x,
                                            double originalDelta) {try{__CLR4_4_11ay81ay8lb90pbba.R.inc(61007);
        __CLR4_4_11ay81ay8lb90pbba.R.inc(61008);return x + originalDelta - x;
    }finally{__CLR4_4_11ay81ay8lb90pbba.R.flushNeeded();}}
}
