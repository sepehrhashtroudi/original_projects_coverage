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

import java.util.Arrays;

import org.apache.commons.math3.exception.MathArithmeticException;
import org.apache.commons.math3.exception.NotFiniteNumberException;
import org.apache.commons.math3.exception.NullArgumentException;
import org.apache.commons.math3.exception.util.Localizable;
import org.apache.commons.math3.exception.util.LocalizedFormats;

/**
 * Miscellaneous utility functions.
 *
 * @see ArithmeticUtils
 * @see Precision
 * @see MathArrays
 *
 * @version $Id$
 */
public final class MathUtils {public static class __CLR4_4_11ad41ad4lb90pb9n{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,60162,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /**
     * 2 &pi;.
     * @since 2.1
     */
    public static final double TWO_PI = 2 * FastMath.PI;

    /**
     * Class contains only static methods.
     */
    private MathUtils() {try{__CLR4_4_11ad41ad4lb90pb9n.R.inc(60088);}finally{__CLR4_4_11ad41ad4lb90pb9n.R.flushNeeded();}}


    /**
     * Returns an integer hash code representing the given double value.
     *
     * @param value the value to be hashed
     * @return the hash code
     */
    public static int hash(double value) {try{__CLR4_4_11ad41ad4lb90pb9n.R.inc(60089);
        __CLR4_4_11ad41ad4lb90pb9n.R.inc(60090);return new Double(value).hashCode();
    }finally{__CLR4_4_11ad41ad4lb90pb9n.R.flushNeeded();}}

    /**
     * Returns an integer hash code representing the given double array.
     *
     * @param value the value to be hashed (may be null)
     * @return the hash code
     * @since 1.2
     */
    public static int hash(double[] value) {try{__CLR4_4_11ad41ad4lb90pb9n.R.inc(60091);
        __CLR4_4_11ad41ad4lb90pb9n.R.inc(60092);return Arrays.hashCode(value);
    }finally{__CLR4_4_11ad41ad4lb90pb9n.R.flushNeeded();}}

    /**
     * Normalize an angle in a 2&pi; wide interval around a center value.
     * <p>This method has three main uses:</p>
     * <ul>
     *   <li>normalize an angle between 0 and 2&pi;:<br/>
     *       {@code a = MathUtils.normalizeAngle(a, FastMath.PI);}</li>
     *   <li>normalize an angle between -&pi; and +&pi;<br/>
     *       {@code a = MathUtils.normalizeAngle(a, 0.0);}</li>
     *   <li>compute the angle between two defining angular positions:<br>
     *       {@code angle = MathUtils.normalizeAngle(end, start) - start;}</li>
     * </ul>
     * <p>Note that due to numerical accuracy and since &pi; cannot be represented
     * exactly, the result interval is <em>closed</em>, it cannot be half-closed
     * as would be more satisfactory in a purely mathematical view.</p>
     * @param a angle to normalize
     * @param center center of the desired 2&pi; interval for the result
     * @return a-2k&pi; with integer k and center-&pi; &lt;= a-2k&pi; &lt;= center+&pi;
     * @since 1.2
     */
     public static double normalizeAngle(double a, double center) {try{__CLR4_4_11ad41ad4lb90pb9n.R.inc(60093);
         __CLR4_4_11ad41ad4lb90pb9n.R.inc(60094);return a - TWO_PI * FastMath.floor((a + FastMath.PI - center) / TWO_PI);
     }finally{__CLR4_4_11ad41ad4lb90pb9n.R.flushNeeded();}}

    /**
     * <p>Reduce {@code |a - offset|} to the primary interval
     * {@code [0, |period|)}.</p>
     *
     * <p>Specifically, the value returned is <br/>
     * {@code a - |period| * floor((a - offset) / |period|) - offset}.</p>
     *
     * <p>If any of the parameters are {@code NaN} or infinite, the result is
     * {@code NaN}.</p>
     *
     * @param a Value to reduce.
     * @param period Period.
     * @param offset Value that will be mapped to {@code 0}.
     * @return the value, within the interval {@code [0 |period|)},
     * that corresponds to {@code a}.
     */
    public static double reduce(double a,
                                double period,
                                double offset) {try{__CLR4_4_11ad41ad4lb90pb9n.R.inc(60095);
        __CLR4_4_11ad41ad4lb90pb9n.R.inc(60096);final double p = FastMath.abs(period);
        __CLR4_4_11ad41ad4lb90pb9n.R.inc(60097);return a - p * FastMath.floor((a - offset) / p) - offset;
    }finally{__CLR4_4_11ad41ad4lb90pb9n.R.flushNeeded();}}

    /**
     * Returns the first argument with the sign of the second argument.
     *
     * @param magnitude Magnitude of the returned value.
     * @param sign Sign of the returned value.
     * @return a value with magnitude equal to {@code magnitude} and with the
     * same sign as the {@code sign} argument.
     * @throws MathArithmeticException if {@code magnitude == Byte.MIN_VALUE}
     * and {@code sign >= 0}.
     */
    public static byte copySign(byte magnitude, byte sign)
        throws MathArithmeticException {try{__CLR4_4_11ad41ad4lb90pb9n.R.inc(60098);
        __CLR4_4_11ad41ad4lb90pb9n.R.inc(60099);if (((((magnitude >= 0 && sign >= 0) ||
            (magnitude < 0 && sign < 0))&&(__CLR4_4_11ad41ad4lb90pb9n.R.iget(60100)!=0|true))||(__CLR4_4_11ad41ad4lb90pb9n.R.iget(60101)==0&false))) {{ // Sign is OK.
            __CLR4_4_11ad41ad4lb90pb9n.R.inc(60102);return magnitude;
        } }else {__CLR4_4_11ad41ad4lb90pb9n.R.inc(60103);if ((((sign >= 0 &&
                   magnitude == Byte.MIN_VALUE)&&(__CLR4_4_11ad41ad4lb90pb9n.R.iget(60104)!=0|true))||(__CLR4_4_11ad41ad4lb90pb9n.R.iget(60105)==0&false))) {{
            __CLR4_4_11ad41ad4lb90pb9n.R.inc(60106);throw new MathArithmeticException(LocalizedFormats.OVERFLOW);
        } }else {{
            __CLR4_4_11ad41ad4lb90pb9n.R.inc(60107);return (byte) -magnitude; // Flip sign.
        }
    }}}finally{__CLR4_4_11ad41ad4lb90pb9n.R.flushNeeded();}}

    /**
     * Returns the first argument with the sign of the second argument.
     *
     * @param magnitude Magnitude of the returned value.
     * @param sign Sign of the returned value.
     * @return a value with magnitude equal to {@code magnitude} and with the
     * same sign as the {@code sign} argument.
     * @throws MathArithmeticException if {@code magnitude == Short.MIN_VALUE}
     * and {@code sign >= 0}.
     */
    public static short copySign(short magnitude, short sign)
            throws MathArithmeticException {try{__CLR4_4_11ad41ad4lb90pb9n.R.inc(60108);
        __CLR4_4_11ad41ad4lb90pb9n.R.inc(60109);if (((((magnitude >= 0 && sign >= 0) ||
            (magnitude < 0 && sign < 0))&&(__CLR4_4_11ad41ad4lb90pb9n.R.iget(60110)!=0|true))||(__CLR4_4_11ad41ad4lb90pb9n.R.iget(60111)==0&false))) {{ // Sign is OK.
            __CLR4_4_11ad41ad4lb90pb9n.R.inc(60112);return magnitude;
        } }else {__CLR4_4_11ad41ad4lb90pb9n.R.inc(60113);if ((((sign >= 0 &&
                   magnitude == Short.MIN_VALUE)&&(__CLR4_4_11ad41ad4lb90pb9n.R.iget(60114)!=0|true))||(__CLR4_4_11ad41ad4lb90pb9n.R.iget(60115)==0&false))) {{
            __CLR4_4_11ad41ad4lb90pb9n.R.inc(60116);throw new MathArithmeticException(LocalizedFormats.OVERFLOW);
        } }else {{
            __CLR4_4_11ad41ad4lb90pb9n.R.inc(60117);return (short) -magnitude; // Flip sign.
        }
    }}}finally{__CLR4_4_11ad41ad4lb90pb9n.R.flushNeeded();}}

    /**
     * Returns the first argument with the sign of the second argument.
     *
     * @param magnitude Magnitude of the returned value.
     * @param sign Sign of the returned value.
     * @return a value with magnitude equal to {@code magnitude} and with the
     * same sign as the {@code sign} argument.
     * @throws MathArithmeticException if {@code magnitude == Integer.MIN_VALUE}
     * and {@code sign >= 0}.
     */
    public static int copySign(int magnitude, int sign)
            throws MathArithmeticException {try{__CLR4_4_11ad41ad4lb90pb9n.R.inc(60118);
        __CLR4_4_11ad41ad4lb90pb9n.R.inc(60119);if (((((magnitude >= 0 && sign >= 0) ||
            (magnitude < 0 && sign < 0))&&(__CLR4_4_11ad41ad4lb90pb9n.R.iget(60120)!=0|true))||(__CLR4_4_11ad41ad4lb90pb9n.R.iget(60121)==0&false))) {{ // Sign is OK.
            __CLR4_4_11ad41ad4lb90pb9n.R.inc(60122);return magnitude;
        } }else {__CLR4_4_11ad41ad4lb90pb9n.R.inc(60123);if ((((sign >= 0 &&
                   magnitude == Integer.MIN_VALUE)&&(__CLR4_4_11ad41ad4lb90pb9n.R.iget(60124)!=0|true))||(__CLR4_4_11ad41ad4lb90pb9n.R.iget(60125)==0&false))) {{
            __CLR4_4_11ad41ad4lb90pb9n.R.inc(60126);throw new MathArithmeticException(LocalizedFormats.OVERFLOW);
        } }else {{
            __CLR4_4_11ad41ad4lb90pb9n.R.inc(60127);return -magnitude; // Flip sign.
        }
    }}}finally{__CLR4_4_11ad41ad4lb90pb9n.R.flushNeeded();}}

    /**
     * Returns the first argument with the sign of the second argument.
     *
     * @param magnitude Magnitude of the returned value.
     * @param sign Sign of the returned value.
     * @return a value with magnitude equal to {@code magnitude} and with the
     * same sign as the {@code sign} argument.
     * @throws MathArithmeticException if {@code magnitude == Long.MIN_VALUE}
     * and {@code sign >= 0}.
     */
    public static long copySign(long magnitude, long sign)
        throws MathArithmeticException {try{__CLR4_4_11ad41ad4lb90pb9n.R.inc(60128);
        __CLR4_4_11ad41ad4lb90pb9n.R.inc(60129);if (((((magnitude >= 0 && sign >= 0) ||
            (magnitude < 0 && sign < 0))&&(__CLR4_4_11ad41ad4lb90pb9n.R.iget(60130)!=0|true))||(__CLR4_4_11ad41ad4lb90pb9n.R.iget(60131)==0&false))) {{ // Sign is OK.
            __CLR4_4_11ad41ad4lb90pb9n.R.inc(60132);return magnitude;
        } }else {__CLR4_4_11ad41ad4lb90pb9n.R.inc(60133);if ((((sign >= 0 &&
                   magnitude == Long.MIN_VALUE)&&(__CLR4_4_11ad41ad4lb90pb9n.R.iget(60134)!=0|true))||(__CLR4_4_11ad41ad4lb90pb9n.R.iget(60135)==0&false))) {{
            __CLR4_4_11ad41ad4lb90pb9n.R.inc(60136);throw new MathArithmeticException(LocalizedFormats.OVERFLOW);
        } }else {{
            __CLR4_4_11ad41ad4lb90pb9n.R.inc(60137);return -magnitude; // Flip sign.
        }
    }}}finally{__CLR4_4_11ad41ad4lb90pb9n.R.flushNeeded();}}
    /**
     * Check that the argument is a real number.
     *
     * @param x Argument.
     * @throws NotFiniteNumberException if {@code x} is not a
     * finite real number.
     */
    public static void checkFinite(final double x)
        throws NotFiniteNumberException {try{__CLR4_4_11ad41ad4lb90pb9n.R.inc(60138);
        __CLR4_4_11ad41ad4lb90pb9n.R.inc(60139);if ((((Double.isInfinite(x) || Double.isNaN(x))&&(__CLR4_4_11ad41ad4lb90pb9n.R.iget(60140)!=0|true))||(__CLR4_4_11ad41ad4lb90pb9n.R.iget(60141)==0&false))) {{
            __CLR4_4_11ad41ad4lb90pb9n.R.inc(60142);throw new NotFiniteNumberException(x);
        }
    }}finally{__CLR4_4_11ad41ad4lb90pb9n.R.flushNeeded();}}

    /**
     * Check that all the elements are real numbers.
     *
     * @param val Arguments.
     * @throws NotFiniteNumberException if any values of the array is not a
     * finite real number.
     */
    public static void checkFinite(final double[] val)
        throws NotFiniteNumberException {try{__CLR4_4_11ad41ad4lb90pb9n.R.inc(60143);
        __CLR4_4_11ad41ad4lb90pb9n.R.inc(60144);for (int i = 0; (((i < val.length)&&(__CLR4_4_11ad41ad4lb90pb9n.R.iget(60145)!=0|true))||(__CLR4_4_11ad41ad4lb90pb9n.R.iget(60146)==0&false)); i++) {{
            __CLR4_4_11ad41ad4lb90pb9n.R.inc(60147);final double x = val[i];
            __CLR4_4_11ad41ad4lb90pb9n.R.inc(60148);if ((((Double.isInfinite(x) || Double.isNaN(x))&&(__CLR4_4_11ad41ad4lb90pb9n.R.iget(60149)!=0|true))||(__CLR4_4_11ad41ad4lb90pb9n.R.iget(60150)==0&false))) {{
                __CLR4_4_11ad41ad4lb90pb9n.R.inc(60151);throw new NotFiniteNumberException(LocalizedFormats.ARRAY_ELEMENT, x, i);
            }
        }}
    }}finally{__CLR4_4_11ad41ad4lb90pb9n.R.flushNeeded();}}

    /**
     * Checks that an object is not null.
     *
     * @param o Object to be checked.
     * @param pattern Message pattern.
     * @param args Arguments to replace the placeholders in {@code pattern}.
     * @throws NullArgumentException if {@code o} is {@code null}.
     */
    public static void checkNotNull(Object o,
                                    Localizable pattern,
                                    Object ... args)
        throws NullArgumentException {try{__CLR4_4_11ad41ad4lb90pb9n.R.inc(60152);
        __CLR4_4_11ad41ad4lb90pb9n.R.inc(60153);if ((((o == null)&&(__CLR4_4_11ad41ad4lb90pb9n.R.iget(60154)!=0|true))||(__CLR4_4_11ad41ad4lb90pb9n.R.iget(60155)==0&false))) {{
            __CLR4_4_11ad41ad4lb90pb9n.R.inc(60156);throw new NullArgumentException(pattern, args);
        }
    }}finally{__CLR4_4_11ad41ad4lb90pb9n.R.flushNeeded();}}

    /**
     * Checks that an object is not null.
     *
     * @param o Object to be checked.
     * @throws NullArgumentException if {@code o} is {@code null}.
     */
    public static void checkNotNull(Object o)
        throws NullArgumentException {try{__CLR4_4_11ad41ad4lb90pb9n.R.inc(60157);
        __CLR4_4_11ad41ad4lb90pb9n.R.inc(60158);if ((((o == null)&&(__CLR4_4_11ad41ad4lb90pb9n.R.iget(60159)!=0|true))||(__CLR4_4_11ad41ad4lb90pb9n.R.iget(60160)==0&false))) {{
            __CLR4_4_11ad41ad4lb90pb9n.R.inc(60161);throw new NullArgumentException();
        }
    }}finally{__CLR4_4_11ad41ad4lb90pb9n.R.flushNeeded();}}
}
