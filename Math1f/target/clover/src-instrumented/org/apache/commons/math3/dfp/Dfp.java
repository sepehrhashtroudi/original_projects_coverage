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

package org.apache.commons.math3.dfp;

import java.util.Arrays;

import org.apache.commons.math3.RealFieldElement;
import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.util.FastMath;

/**
 *  Decimal floating point library for Java
 *
 *  <p>Another floating point class.  This one is built using radix 10000
 *  which is 10<sup>4</sup>, so its almost decimal.</p>
 *
 *  <p>The design goals here are:
 *  <ol>
 *    <li>Decimal math, or close to it</li>
 *    <li>Settable precision (but no mix between numbers using different settings)</li>
 *    <li>Portability.  Code should be kept as portable as possible.</li>
 *    <li>Performance</li>
 *    <li>Accuracy  - Results should always be +/- 1 ULP for basic
 *         algebraic operation</li>
 *    <li>Comply with IEEE 854-1987 as much as possible.
 *         (See IEEE 854-1987 notes below)</li>
 *  </ol></p>
 *
 *  <p>Trade offs:
 *  <ol>
 *    <li>Memory foot print.  I'm using more memory than necessary to
 *         represent numbers to get better performance.</li>
 *    <li>Digits are bigger, so rounding is a greater loss.  So, if you
 *         really need 12 decimal digits, better use 4 base 10000 digits
 *         there can be one partially filled.</li>
 *  </ol></p>
 *
 *  <p>Numbers are represented  in the following form:
 *  <pre>
 *  n  =  sign &times; mant &times; (radix)<sup>exp</sup>;</p>
 *  </pre>
 *  where sign is &plusmn;1, mantissa represents a fractional number between
 *  zero and one.  mant[0] is the least significant digit.
 *  exp is in the range of -32767 to 32768</p>
 *
 *  <p>IEEE 854-1987  Notes and differences</p>
 *
 *  <p>IEEE 854 requires the radix to be either 2 or 10.  The radix here is
 *  10000, so that requirement is not met, but  it is possible that a
 *  subclassed can be made to make it behave as a radix 10
 *  number.  It is my opinion that if it looks and behaves as a radix
 *  10 number then it is one and that requirement would be met.</p>
 *
 *  <p>The radix of 10000 was chosen because it should be faster to operate
 *  on 4 decimal digits at once instead of one at a time.  Radix 10 behavior
 *  can be realized by adding an additional rounding step to ensure that
 *  the number of decimal digits represented is constant.</p>
 *
 *  <p>The IEEE standard specifically leaves out internal data encoding,
 *  so it is reasonable to conclude that such a subclass of this radix
 *  10000 system is merely an encoding of a radix 10 system.</p>
 *
 *  <p>IEEE 854 also specifies the existence of "sub-normal" numbers.  This
 *  class does not contain any such entities.  The most significant radix
 *  10000 digit is always non-zero.  Instead, we support "gradual underflow"
 *  by raising the underflow flag for numbers less with exponent less than
 *  expMin, but don't flush to zero until the exponent reaches MIN_EXP-digits.
 *  Thus the smallest number we can represent would be:
 *  1E(-(MIN_EXP-digits-1)*4),  eg, for digits=5, MIN_EXP=-32767, that would
 *  be 1e-131092.</p>
 *
 *  <p>IEEE 854 defines that the implied radix point lies just to the right
 *  of the most significant digit and to the left of the remaining digits.
 *  This implementation puts the implied radix point to the left of all
 *  digits including the most significant one.  The most significant digit
 *  here is the one just to the right of the radix point.  This is a fine
 *  detail and is really only a matter of definition.  Any side effects of
 *  this can be rendered invisible by a subclass.</p>
 * @see DfpField
 * @version $Id$
 * @since 2.2
 */
@java.lang.SuppressWarnings({"fallthrough"}) public class Dfp implements RealFieldElement<Dfp> {public static class __CLR4_4_15ic5iclb90p7cr{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,8930,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** The radix, or base of this system.  Set to 10000 */
    public static final int RADIX = 10000;

    /** The minimum exponent before underflow is signaled.  Flush to zero
     *  occurs at minExp-DIGITS */
    public static final int MIN_EXP = -32767;

    /** The maximum exponent before overflow is signaled and results flushed
     *  to infinity */
    public static final int MAX_EXP =  32768;

    /** The amount under/overflows are scaled by before going to trap handler */
    public static final int ERR_SCALE = 32760;

    /** Indicator value for normal finite numbers. */
    public static final byte FINITE = 0;

    /** Indicator value for Infinity. */
    public static final byte INFINITE = 1;

    /** Indicator value for signaling NaN. */
    public static final byte SNAN = 2;

    /** Indicator value for quiet NaN. */
    public static final byte QNAN = 3;

    /** String for NaN representation. */
    private static final String NAN_STRING = "NaN";

    /** String for positive infinity representation. */
    private static final String POS_INFINITY_STRING = "Infinity";

    /** String for negative infinity representation. */
    private static final String NEG_INFINITY_STRING = "-Infinity";

    /** Name for traps triggered by addition. */
    private static final String ADD_TRAP = "add";

    /** Name for traps triggered by multiplication. */
    private static final String MULTIPLY_TRAP = "multiply";

    /** Name for traps triggered by division. */
    private static final String DIVIDE_TRAP = "divide";

    /** Name for traps triggered by square root. */
    private static final String SQRT_TRAP = "sqrt";

    /** Name for traps triggered by alignment. */
    private static final String ALIGN_TRAP = "align";

    /** Name for traps triggered by truncation. */
    private static final String TRUNC_TRAP = "trunc";

    /** Name for traps triggered by nextAfter. */
    private static final String NEXT_AFTER_TRAP = "nextAfter";

    /** Name for traps triggered by lessThan. */
    private static final String LESS_THAN_TRAP = "lessThan";

    /** Name for traps triggered by greaterThan. */
    private static final String GREATER_THAN_TRAP = "greaterThan";

    /** Name for traps triggered by newInstance. */
    private static final String NEW_INSTANCE_TRAP = "newInstance";

    /** Mantissa. */
    protected int[] mant;

    /** Sign bit: 1 for positive, -1 for negative. */
    protected byte sign;

    /** Exponent. */
    protected int exp;

    /** Indicator for non-finite / non-number values. */
    protected byte nans;

    /** Factory building similar Dfp's. */
    private final DfpField field;

    /** Makes an instance with a value of zero.
     * @param field field to which this instance belongs
     */
    protected Dfp(final DfpField field) {try{__CLR4_4_15ic5iclb90p7cr.R.inc(7140);
        __CLR4_4_15ic5iclb90p7cr.R.inc(7141);mant = new int[field.getRadixDigits()];
        __CLR4_4_15ic5iclb90p7cr.R.inc(7142);sign = 1;
        __CLR4_4_15ic5iclb90p7cr.R.inc(7143);exp = 0;
        __CLR4_4_15ic5iclb90p7cr.R.inc(7144);nans = FINITE;
        __CLR4_4_15ic5iclb90p7cr.R.inc(7145);this.field = field;
    }finally{__CLR4_4_15ic5iclb90p7cr.R.flushNeeded();}}

    /** Create an instance from a byte value.
     * @param field field to which this instance belongs
     * @param x value to convert to an instance
     */
    protected Dfp(final DfpField field, byte x) {
        this(field, (long) x);__CLR4_4_15ic5iclb90p7cr.R.inc(7147);try{__CLR4_4_15ic5iclb90p7cr.R.inc(7146);
    }finally{__CLR4_4_15ic5iclb90p7cr.R.flushNeeded();}}

    /** Create an instance from an int value.
     * @param field field to which this instance belongs
     * @param x value to convert to an instance
     */
    protected Dfp(final DfpField field, int x) {
        this(field, (long) x);__CLR4_4_15ic5iclb90p7cr.R.inc(7149);try{__CLR4_4_15ic5iclb90p7cr.R.inc(7148);
    }finally{__CLR4_4_15ic5iclb90p7cr.R.flushNeeded();}}

    /** Create an instance from a long value.
     * @param field field to which this instance belongs
     * @param x value to convert to an instance
     */
    protected Dfp(final DfpField field, long x) {try{__CLR4_4_15ic5iclb90p7cr.R.inc(7150);

        // initialize as if 0
        __CLR4_4_15ic5iclb90p7cr.R.inc(7151);mant = new int[field.getRadixDigits()];
        __CLR4_4_15ic5iclb90p7cr.R.inc(7152);nans = FINITE;
        __CLR4_4_15ic5iclb90p7cr.R.inc(7153);this.field = field;

        __CLR4_4_15ic5iclb90p7cr.R.inc(7154);boolean isLongMin = false;
        __CLR4_4_15ic5iclb90p7cr.R.inc(7155);if ((((x == Long.MIN_VALUE)&&(__CLR4_4_15ic5iclb90p7cr.R.iget(7156)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(7157)==0&false))) {{
            // special case for Long.MIN_VALUE (-9223372036854775808)
            // we must shift it before taking its absolute value
            __CLR4_4_15ic5iclb90p7cr.R.inc(7158);isLongMin = true;
            __CLR4_4_15ic5iclb90p7cr.R.inc(7159);++x;
        }

        // set the sign
        }__CLR4_4_15ic5iclb90p7cr.R.inc(7160);if ((((x < 0)&&(__CLR4_4_15ic5iclb90p7cr.R.iget(7161)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(7162)==0&false))) {{
            __CLR4_4_15ic5iclb90p7cr.R.inc(7163);sign = -1;
            __CLR4_4_15ic5iclb90p7cr.R.inc(7164);x = -x;
        } }else {{
            __CLR4_4_15ic5iclb90p7cr.R.inc(7165);sign = 1;
        }

        }__CLR4_4_15ic5iclb90p7cr.R.inc(7166);exp = 0;
        __CLR4_4_15ic5iclb90p7cr.R.inc(7167);while ((((x != 0)&&(__CLR4_4_15ic5iclb90p7cr.R.iget(7168)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(7169)==0&false))) {{
            __CLR4_4_15ic5iclb90p7cr.R.inc(7170);System.arraycopy(mant, mant.length - exp, mant, mant.length - 1 - exp, exp);
            __CLR4_4_15ic5iclb90p7cr.R.inc(7171);mant[mant.length - 1] = (int) (x % RADIX);
            __CLR4_4_15ic5iclb90p7cr.R.inc(7172);x /= RADIX;
            __CLR4_4_15ic5iclb90p7cr.R.inc(7173);exp++;
        }

        }__CLR4_4_15ic5iclb90p7cr.R.inc(7174);if ((((isLongMin)&&(__CLR4_4_15ic5iclb90p7cr.R.iget(7175)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(7176)==0&false))) {{
            // remove the shift added for Long.MIN_VALUE
            // we know in this case that fixing the last digit is sufficient
            __CLR4_4_15ic5iclb90p7cr.R.inc(7177);for (int i = 0; (((i < mant.length - 1)&&(__CLR4_4_15ic5iclb90p7cr.R.iget(7178)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(7179)==0&false)); i++) {{
                __CLR4_4_15ic5iclb90p7cr.R.inc(7180);if ((((mant[i] != 0)&&(__CLR4_4_15ic5iclb90p7cr.R.iget(7181)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(7182)==0&false))) {{
                    __CLR4_4_15ic5iclb90p7cr.R.inc(7183);mant[i]++;
                    __CLR4_4_15ic5iclb90p7cr.R.inc(7184);break;
                }
            }}
        }}
    }}finally{__CLR4_4_15ic5iclb90p7cr.R.flushNeeded();}}

    /** Create an instance from a double value.
     * @param field field to which this instance belongs
     * @param x value to convert to an instance
     */
    protected Dfp(final DfpField field, double x) {try{__CLR4_4_15ic5iclb90p7cr.R.inc(7185);

        // initialize as if 0
        __CLR4_4_15ic5iclb90p7cr.R.inc(7186);mant = new int[field.getRadixDigits()];
        __CLR4_4_15ic5iclb90p7cr.R.inc(7187);sign = 1;
        __CLR4_4_15ic5iclb90p7cr.R.inc(7188);exp = 0;
        __CLR4_4_15ic5iclb90p7cr.R.inc(7189);nans = FINITE;
        __CLR4_4_15ic5iclb90p7cr.R.inc(7190);this.field = field;

        __CLR4_4_15ic5iclb90p7cr.R.inc(7191);long bits = Double.doubleToLongBits(x);
        __CLR4_4_15ic5iclb90p7cr.R.inc(7192);long mantissa = bits & 0x000fffffffffffffL;
        __CLR4_4_15ic5iclb90p7cr.R.inc(7193);int exponent = (int) ((bits & 0x7ff0000000000000L) >> 52) - 1023;

        __CLR4_4_15ic5iclb90p7cr.R.inc(7194);if ((((exponent == -1023)&&(__CLR4_4_15ic5iclb90p7cr.R.iget(7195)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(7196)==0&false))) {{
            // Zero or sub-normal
            __CLR4_4_15ic5iclb90p7cr.R.inc(7197);if ((((x == 0)&&(__CLR4_4_15ic5iclb90p7cr.R.iget(7198)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(7199)==0&false))) {{
                // make sure 0 has the right sign
                __CLR4_4_15ic5iclb90p7cr.R.inc(7200);if (((((bits & 0x8000000000000000L) != 0)&&(__CLR4_4_15ic5iclb90p7cr.R.iget(7201)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(7202)==0&false))) {{
                    __CLR4_4_15ic5iclb90p7cr.R.inc(7203);sign = -1;
                }
                }__CLR4_4_15ic5iclb90p7cr.R.inc(7204);return;
            }

            }__CLR4_4_15ic5iclb90p7cr.R.inc(7205);exponent++;

            // Normalize the subnormal number
            __CLR4_4_15ic5iclb90p7cr.R.inc(7206);while ( ((((mantissa & 0x0010000000000000L) == 0)&&(__CLR4_4_15ic5iclb90p7cr.R.iget(7207)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(7208)==0&false))) {{
                __CLR4_4_15ic5iclb90p7cr.R.inc(7209);exponent--;
                __CLR4_4_15ic5iclb90p7cr.R.inc(7210);mantissa <<= 1;
            }
            }__CLR4_4_15ic5iclb90p7cr.R.inc(7211);mantissa &= 0x000fffffffffffffL;
        }

        }__CLR4_4_15ic5iclb90p7cr.R.inc(7212);if ((((exponent == 1024)&&(__CLR4_4_15ic5iclb90p7cr.R.iget(7213)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(7214)==0&false))) {{
            // infinity or NAN
            __CLR4_4_15ic5iclb90p7cr.R.inc(7215);if ((((x != x)&&(__CLR4_4_15ic5iclb90p7cr.R.iget(7216)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(7217)==0&false))) {{
                __CLR4_4_15ic5iclb90p7cr.R.inc(7218);sign = (byte) 1;
                __CLR4_4_15ic5iclb90p7cr.R.inc(7219);nans = QNAN;
            } }else {__CLR4_4_15ic5iclb90p7cr.R.inc(7220);if ((((x < 0)&&(__CLR4_4_15ic5iclb90p7cr.R.iget(7221)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(7222)==0&false))) {{
                __CLR4_4_15ic5iclb90p7cr.R.inc(7223);sign = (byte) -1;
                __CLR4_4_15ic5iclb90p7cr.R.inc(7224);nans = INFINITE;
            } }else {{
                __CLR4_4_15ic5iclb90p7cr.R.inc(7225);sign = (byte) 1;
                __CLR4_4_15ic5iclb90p7cr.R.inc(7226);nans = INFINITE;
            }
            }}__CLR4_4_15ic5iclb90p7cr.R.inc(7227);return;
        }

        }__CLR4_4_15ic5iclb90p7cr.R.inc(7228);Dfp xdfp = new Dfp(field, mantissa);
        __CLR4_4_15ic5iclb90p7cr.R.inc(7229);xdfp = xdfp.divide(new Dfp(field, 4503599627370496l)).add(field.getOne());  // Divide by 2^52, then add one
        __CLR4_4_15ic5iclb90p7cr.R.inc(7230);xdfp = xdfp.multiply(DfpMath.pow(field.getTwo(), exponent));

        __CLR4_4_15ic5iclb90p7cr.R.inc(7231);if (((((bits & 0x8000000000000000L) != 0)&&(__CLR4_4_15ic5iclb90p7cr.R.iget(7232)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(7233)==0&false))) {{
            __CLR4_4_15ic5iclb90p7cr.R.inc(7234);xdfp = xdfp.negate();
        }

        }__CLR4_4_15ic5iclb90p7cr.R.inc(7235);System.arraycopy(xdfp.mant, 0, mant, 0, mant.length);
        __CLR4_4_15ic5iclb90p7cr.R.inc(7236);sign = xdfp.sign;
        __CLR4_4_15ic5iclb90p7cr.R.inc(7237);exp  = xdfp.exp;
        __CLR4_4_15ic5iclb90p7cr.R.inc(7238);nans = xdfp.nans;

    }finally{__CLR4_4_15ic5iclb90p7cr.R.flushNeeded();}}

    /** Copy constructor.
     * @param d instance to copy
     */
    public Dfp(final Dfp d) {try{__CLR4_4_15ic5iclb90p7cr.R.inc(7239);
        __CLR4_4_15ic5iclb90p7cr.R.inc(7240);mant  = d.mant.clone();
        __CLR4_4_15ic5iclb90p7cr.R.inc(7241);sign  = d.sign;
        __CLR4_4_15ic5iclb90p7cr.R.inc(7242);exp   = d.exp;
        __CLR4_4_15ic5iclb90p7cr.R.inc(7243);nans  = d.nans;
        __CLR4_4_15ic5iclb90p7cr.R.inc(7244);field = d.field;
    }finally{__CLR4_4_15ic5iclb90p7cr.R.flushNeeded();}}

    /** Create an instance from a String representation.
     * @param field field to which this instance belongs
     * @param s string representation of the instance
     */
    protected Dfp(final DfpField field, final String s) {try{__CLR4_4_15ic5iclb90p7cr.R.inc(7245);

        // initialize as if 0
        __CLR4_4_15ic5iclb90p7cr.R.inc(7246);mant = new int[field.getRadixDigits()];
        __CLR4_4_15ic5iclb90p7cr.R.inc(7247);sign = 1;
        __CLR4_4_15ic5iclb90p7cr.R.inc(7248);exp = 0;
        __CLR4_4_15ic5iclb90p7cr.R.inc(7249);nans = FINITE;
        __CLR4_4_15ic5iclb90p7cr.R.inc(7250);this.field = field;

        __CLR4_4_15ic5iclb90p7cr.R.inc(7251);boolean decimalFound = false;
        __CLR4_4_15ic5iclb90p7cr.R.inc(7252);final int rsize = 4;   // size of radix in decimal digits
        __CLR4_4_15ic5iclb90p7cr.R.inc(7253);final int offset = 4;  // Starting offset into Striped
        __CLR4_4_15ic5iclb90p7cr.R.inc(7254);final char[] striped = new char[getRadixDigits() * rsize + offset * 2];

        // Check some special cases
        __CLR4_4_15ic5iclb90p7cr.R.inc(7255);if ((((s.equals(POS_INFINITY_STRING))&&(__CLR4_4_15ic5iclb90p7cr.R.iget(7256)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(7257)==0&false))) {{
            __CLR4_4_15ic5iclb90p7cr.R.inc(7258);sign = (byte) 1;
            __CLR4_4_15ic5iclb90p7cr.R.inc(7259);nans = INFINITE;
            __CLR4_4_15ic5iclb90p7cr.R.inc(7260);return;
        }

        }__CLR4_4_15ic5iclb90p7cr.R.inc(7261);if ((((s.equals(NEG_INFINITY_STRING))&&(__CLR4_4_15ic5iclb90p7cr.R.iget(7262)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(7263)==0&false))) {{
            __CLR4_4_15ic5iclb90p7cr.R.inc(7264);sign = (byte) -1;
            __CLR4_4_15ic5iclb90p7cr.R.inc(7265);nans = INFINITE;
            __CLR4_4_15ic5iclb90p7cr.R.inc(7266);return;
        }

        }__CLR4_4_15ic5iclb90p7cr.R.inc(7267);if ((((s.equals(NAN_STRING))&&(__CLR4_4_15ic5iclb90p7cr.R.iget(7268)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(7269)==0&false))) {{
            __CLR4_4_15ic5iclb90p7cr.R.inc(7270);sign = (byte) 1;
            __CLR4_4_15ic5iclb90p7cr.R.inc(7271);nans = QNAN;
            __CLR4_4_15ic5iclb90p7cr.R.inc(7272);return;
        }

        // Check for scientific notation
        }__CLR4_4_15ic5iclb90p7cr.R.inc(7273);int p = s.indexOf("e");
        __CLR4_4_15ic5iclb90p7cr.R.inc(7274);if ((((p == -1)&&(__CLR4_4_15ic5iclb90p7cr.R.iget(7275)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(7276)==0&false))) {{ // try upper case?
            __CLR4_4_15ic5iclb90p7cr.R.inc(7277);p = s.indexOf("E");
        }

        }__CLR4_4_15ic5iclb90p7cr.R.inc(7278);final String fpdecimal;
        __CLR4_4_15ic5iclb90p7cr.R.inc(7279);int sciexp = 0;
        __CLR4_4_15ic5iclb90p7cr.R.inc(7280);if ((((p != -1)&&(__CLR4_4_15ic5iclb90p7cr.R.iget(7281)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(7282)==0&false))) {{
            // scientific notation
            __CLR4_4_15ic5iclb90p7cr.R.inc(7283);fpdecimal = s.substring(0, p);
            __CLR4_4_15ic5iclb90p7cr.R.inc(7284);String fpexp = s.substring(p+1);
            __CLR4_4_15ic5iclb90p7cr.R.inc(7285);boolean negative = false;

            __CLR4_4_15ic5iclb90p7cr.R.inc(7286);for (int i=0; (((i<fpexp.length())&&(__CLR4_4_15ic5iclb90p7cr.R.iget(7287)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(7288)==0&false)); i++)
            {{
                __CLR4_4_15ic5iclb90p7cr.R.inc(7289);if ((((fpexp.charAt(i) == '-')&&(__CLR4_4_15ic5iclb90p7cr.R.iget(7290)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(7291)==0&false)))
                {{
                    __CLR4_4_15ic5iclb90p7cr.R.inc(7292);negative = true;
                    __CLR4_4_15ic5iclb90p7cr.R.inc(7293);continue;
                }
                }__CLR4_4_15ic5iclb90p7cr.R.inc(7294);if ((((fpexp.charAt(i) >= '0' && fpexp.charAt(i) <= '9')&&(__CLR4_4_15ic5iclb90p7cr.R.iget(7295)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(7296)==0&false))) {{
                    __CLR4_4_15ic5iclb90p7cr.R.inc(7297);sciexp = sciexp * 10 + fpexp.charAt(i) - '0';
                }
            }}

            }__CLR4_4_15ic5iclb90p7cr.R.inc(7298);if ((((negative)&&(__CLR4_4_15ic5iclb90p7cr.R.iget(7299)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(7300)==0&false))) {{
                __CLR4_4_15ic5iclb90p7cr.R.inc(7301);sciexp = -sciexp;
            }
        }} }else {{
            // normal case
            __CLR4_4_15ic5iclb90p7cr.R.inc(7302);fpdecimal = s;
        }

        // If there is a minus sign in the number then it is negative
        }__CLR4_4_15ic5iclb90p7cr.R.inc(7303);if ((((fpdecimal.indexOf("-") !=  -1)&&(__CLR4_4_15ic5iclb90p7cr.R.iget(7304)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(7305)==0&false))) {{
            __CLR4_4_15ic5iclb90p7cr.R.inc(7306);sign = -1;
        }

        // First off, find all of the leading zeros, trailing zeros, and significant digits
        }__CLR4_4_15ic5iclb90p7cr.R.inc(7307);p = 0;

        // Move p to first significant digit
        __CLR4_4_15ic5iclb90p7cr.R.inc(7308);int decimalPos = 0;
        __CLR4_4_15ic5iclb90p7cr.R.inc(7309);for (;;) {{
            __CLR4_4_15ic5iclb90p7cr.R.inc(7310);if ((((fpdecimal.charAt(p) >= '1' && fpdecimal.charAt(p) <= '9')&&(__CLR4_4_15ic5iclb90p7cr.R.iget(7311)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(7312)==0&false))) {{
                __CLR4_4_15ic5iclb90p7cr.R.inc(7313);break;
            }

            }__CLR4_4_15ic5iclb90p7cr.R.inc(7314);if ((((decimalFound && fpdecimal.charAt(p) == '0')&&(__CLR4_4_15ic5iclb90p7cr.R.iget(7315)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(7316)==0&false))) {{
                __CLR4_4_15ic5iclb90p7cr.R.inc(7317);decimalPos--;
            }

            }__CLR4_4_15ic5iclb90p7cr.R.inc(7318);if ((((fpdecimal.charAt(p) == '.')&&(__CLR4_4_15ic5iclb90p7cr.R.iget(7319)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(7320)==0&false))) {{
                __CLR4_4_15ic5iclb90p7cr.R.inc(7321);decimalFound = true;
            }

            }__CLR4_4_15ic5iclb90p7cr.R.inc(7322);p++;

            __CLR4_4_15ic5iclb90p7cr.R.inc(7323);if ((((p == fpdecimal.length())&&(__CLR4_4_15ic5iclb90p7cr.R.iget(7324)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(7325)==0&false))) {{
                __CLR4_4_15ic5iclb90p7cr.R.inc(7326);break;
            }
        }}

        // Copy the string onto Stripped
        }__CLR4_4_15ic5iclb90p7cr.R.inc(7327);int q = offset;
        __CLR4_4_15ic5iclb90p7cr.R.inc(7328);striped[0] = '0';
        __CLR4_4_15ic5iclb90p7cr.R.inc(7329);striped[1] = '0';
        __CLR4_4_15ic5iclb90p7cr.R.inc(7330);striped[2] = '0';
        __CLR4_4_15ic5iclb90p7cr.R.inc(7331);striped[3] = '0';
        __CLR4_4_15ic5iclb90p7cr.R.inc(7332);int significantDigits=0;
        __CLR4_4_15ic5iclb90p7cr.R.inc(7333);for(;;) {{
            __CLR4_4_15ic5iclb90p7cr.R.inc(7334);if ((((p == (fpdecimal.length()))&&(__CLR4_4_15ic5iclb90p7cr.R.iget(7335)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(7336)==0&false))) {{
                __CLR4_4_15ic5iclb90p7cr.R.inc(7337);break;
            }

            // Don't want to run pass the end of the array
            }__CLR4_4_15ic5iclb90p7cr.R.inc(7338);if ((((q == mant.length*rsize+offset+1)&&(__CLR4_4_15ic5iclb90p7cr.R.iget(7339)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(7340)==0&false))) {{
                __CLR4_4_15ic5iclb90p7cr.R.inc(7341);break;
            }

            }__CLR4_4_15ic5iclb90p7cr.R.inc(7342);if ((((fpdecimal.charAt(p) == '.')&&(__CLR4_4_15ic5iclb90p7cr.R.iget(7343)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(7344)==0&false))) {{
                __CLR4_4_15ic5iclb90p7cr.R.inc(7345);decimalFound = true;
                __CLR4_4_15ic5iclb90p7cr.R.inc(7346);decimalPos = significantDigits;
                __CLR4_4_15ic5iclb90p7cr.R.inc(7347);p++;
                __CLR4_4_15ic5iclb90p7cr.R.inc(7348);continue;
            }

            }__CLR4_4_15ic5iclb90p7cr.R.inc(7349);if ((((fpdecimal.charAt(p) < '0' || fpdecimal.charAt(p) > '9')&&(__CLR4_4_15ic5iclb90p7cr.R.iget(7350)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(7351)==0&false))) {{
                __CLR4_4_15ic5iclb90p7cr.R.inc(7352);p++;
                __CLR4_4_15ic5iclb90p7cr.R.inc(7353);continue;
            }

            }__CLR4_4_15ic5iclb90p7cr.R.inc(7354);striped[q] = fpdecimal.charAt(p);
            __CLR4_4_15ic5iclb90p7cr.R.inc(7355);q++;
            __CLR4_4_15ic5iclb90p7cr.R.inc(7356);p++;
            __CLR4_4_15ic5iclb90p7cr.R.inc(7357);significantDigits++;
        }


        // If the decimal point has been found then get rid of trailing zeros.
        }__CLR4_4_15ic5iclb90p7cr.R.inc(7358);if ((((decimalFound && q != offset)&&(__CLR4_4_15ic5iclb90p7cr.R.iget(7359)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(7360)==0&false))) {{
            __CLR4_4_15ic5iclb90p7cr.R.inc(7361);for (;;) {{
                __CLR4_4_15ic5iclb90p7cr.R.inc(7362);q--;
                __CLR4_4_15ic5iclb90p7cr.R.inc(7363);if ((((q == offset)&&(__CLR4_4_15ic5iclb90p7cr.R.iget(7364)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(7365)==0&false))) {{
                    __CLR4_4_15ic5iclb90p7cr.R.inc(7366);break;
                }
                }__CLR4_4_15ic5iclb90p7cr.R.inc(7367);if ((((striped[q] == '0')&&(__CLR4_4_15ic5iclb90p7cr.R.iget(7368)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(7369)==0&false))) {{
                    __CLR4_4_15ic5iclb90p7cr.R.inc(7370);significantDigits--;
                } }else {{
                    __CLR4_4_15ic5iclb90p7cr.R.inc(7371);break;
                }
            }}
        }}

        // special case of numbers like "0.00000"
        }__CLR4_4_15ic5iclb90p7cr.R.inc(7372);if ((((decimalFound && significantDigits == 0)&&(__CLR4_4_15ic5iclb90p7cr.R.iget(7373)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(7374)==0&false))) {{
            __CLR4_4_15ic5iclb90p7cr.R.inc(7375);decimalPos = 0;
        }

        // Implicit decimal point at end of number if not present
        }__CLR4_4_15ic5iclb90p7cr.R.inc(7376);if ((((!decimalFound)&&(__CLR4_4_15ic5iclb90p7cr.R.iget(7377)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(7378)==0&false))) {{
            __CLR4_4_15ic5iclb90p7cr.R.inc(7379);decimalPos = q-offset;
        }

        // Find the number of significant trailing zeros
        }__CLR4_4_15ic5iclb90p7cr.R.inc(7380);q = offset;  // set q to point to first sig digit
        __CLR4_4_15ic5iclb90p7cr.R.inc(7381);p = significantDigits-1+offset;

        __CLR4_4_15ic5iclb90p7cr.R.inc(7382);while ((((p > q)&&(__CLR4_4_15ic5iclb90p7cr.R.iget(7383)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(7384)==0&false))) {{
            __CLR4_4_15ic5iclb90p7cr.R.inc(7385);if ((((striped[p] != '0')&&(__CLR4_4_15ic5iclb90p7cr.R.iget(7386)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(7387)==0&false))) {{
                __CLR4_4_15ic5iclb90p7cr.R.inc(7388);break;
            }
            }__CLR4_4_15ic5iclb90p7cr.R.inc(7389);p--;
        }

        // Make sure the decimal is on a mod 10000 boundary
        }__CLR4_4_15ic5iclb90p7cr.R.inc(7390);int i = ((rsize * 100) - decimalPos - sciexp % rsize) % rsize;
        __CLR4_4_15ic5iclb90p7cr.R.inc(7391);q -= i;
        __CLR4_4_15ic5iclb90p7cr.R.inc(7392);decimalPos += i;

        // Make the mantissa length right by adding zeros at the end if necessary
        __CLR4_4_15ic5iclb90p7cr.R.inc(7393);while (((((p - q) < (mant.length * rsize))&&(__CLR4_4_15ic5iclb90p7cr.R.iget(7394)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(7395)==0&false))) {{
            __CLR4_4_15ic5iclb90p7cr.R.inc(7396);for (i = 0; (((i < rsize)&&(__CLR4_4_15ic5iclb90p7cr.R.iget(7397)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(7398)==0&false)); i++) {{
                __CLR4_4_15ic5iclb90p7cr.R.inc(7399);striped[++p] = '0';
            }
        }}

        // Ok, now we know how many trailing zeros there are,
        // and where the least significant digit is
        }__CLR4_4_15ic5iclb90p7cr.R.inc(7400);for (i = mant.length - 1; (((i >= 0)&&(__CLR4_4_15ic5iclb90p7cr.R.iget(7401)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(7402)==0&false)); i--) {{
            __CLR4_4_15ic5iclb90p7cr.R.inc(7403);mant[i] = (striped[q]   - '0') * 1000 +
                      (striped[q+1] - '0') * 100  +
                      (striped[q+2] - '0') * 10   +
                      (striped[q+3] - '0');
            __CLR4_4_15ic5iclb90p7cr.R.inc(7404);q += 4;
        }


        }__CLR4_4_15ic5iclb90p7cr.R.inc(7405);exp = (decimalPos+sciexp) / rsize;

        __CLR4_4_15ic5iclb90p7cr.R.inc(7406);if ((((q < striped.length)&&(__CLR4_4_15ic5iclb90p7cr.R.iget(7407)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(7408)==0&false))) {{
            // Is there possible another digit?
            __CLR4_4_15ic5iclb90p7cr.R.inc(7409);round((striped[q] - '0')*1000);
        }

    }}finally{__CLR4_4_15ic5iclb90p7cr.R.flushNeeded();}}

    /** Creates an instance with a non-finite value.
     * @param field field to which this instance belongs
     * @param sign sign of the Dfp to create
     * @param nans code of the value, must be one of {@link #INFINITE},
     * {@link #SNAN},  {@link #QNAN}
     */
    protected Dfp(final DfpField field, final byte sign, final byte nans) {try{__CLR4_4_15ic5iclb90p7cr.R.inc(7410);
        __CLR4_4_15ic5iclb90p7cr.R.inc(7411);this.field = field;
        __CLR4_4_15ic5iclb90p7cr.R.inc(7412);this.mant    = new int[field.getRadixDigits()];
        __CLR4_4_15ic5iclb90p7cr.R.inc(7413);this.sign    = sign;
        __CLR4_4_15ic5iclb90p7cr.R.inc(7414);this.exp     = 0;
        __CLR4_4_15ic5iclb90p7cr.R.inc(7415);this.nans    = nans;
    }finally{__CLR4_4_15ic5iclb90p7cr.R.flushNeeded();}}

    /** Create an instance with a value of 0.
     * Use this internally in preference to constructors to facilitate subclasses
     * @return a new instance with a value of 0
     */
    public Dfp newInstance() {try{__CLR4_4_15ic5iclb90p7cr.R.inc(7416);
        __CLR4_4_15ic5iclb90p7cr.R.inc(7417);return new Dfp(getField());
    }finally{__CLR4_4_15ic5iclb90p7cr.R.flushNeeded();}}

    /** Create an instance from a byte value.
     * @param x value to convert to an instance
     * @return a new instance with value x
     */
    public Dfp newInstance(final byte x) {try{__CLR4_4_15ic5iclb90p7cr.R.inc(7418);
        __CLR4_4_15ic5iclb90p7cr.R.inc(7419);return new Dfp(getField(), x);
    }finally{__CLR4_4_15ic5iclb90p7cr.R.flushNeeded();}}

    /** Create an instance from an int value.
     * @param x value to convert to an instance
     * @return a new instance with value x
     */
    public Dfp newInstance(final int x) {try{__CLR4_4_15ic5iclb90p7cr.R.inc(7420);
        __CLR4_4_15ic5iclb90p7cr.R.inc(7421);return new Dfp(getField(), x);
    }finally{__CLR4_4_15ic5iclb90p7cr.R.flushNeeded();}}

    /** Create an instance from a long value.
     * @param x value to convert to an instance
     * @return a new instance with value x
     */
    public Dfp newInstance(final long x) {try{__CLR4_4_15ic5iclb90p7cr.R.inc(7422);
        __CLR4_4_15ic5iclb90p7cr.R.inc(7423);return new Dfp(getField(), x);
    }finally{__CLR4_4_15ic5iclb90p7cr.R.flushNeeded();}}

    /** Create an instance from a double value.
     * @param x value to convert to an instance
     * @return a new instance with value x
     */
    public Dfp newInstance(final double x) {try{__CLR4_4_15ic5iclb90p7cr.R.inc(7424);
        __CLR4_4_15ic5iclb90p7cr.R.inc(7425);return new Dfp(getField(), x);
    }finally{__CLR4_4_15ic5iclb90p7cr.R.flushNeeded();}}

    /** Create an instance by copying an existing one.
     * Use this internally in preference to constructors to facilitate subclasses.
     * @param d instance to copy
     * @return a new instance with the same value as d
     */
    public Dfp newInstance(final Dfp d) {try{__CLR4_4_15ic5iclb90p7cr.R.inc(7426);

        // make sure we don't mix number with different precision
        __CLR4_4_15ic5iclb90p7cr.R.inc(7427);if ((((field.getRadixDigits() != d.field.getRadixDigits())&&(__CLR4_4_15ic5iclb90p7cr.R.iget(7428)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(7429)==0&false))) {{
            __CLR4_4_15ic5iclb90p7cr.R.inc(7430);field.setIEEEFlagsBits(DfpField.FLAG_INVALID);
            __CLR4_4_15ic5iclb90p7cr.R.inc(7431);final Dfp result = newInstance(getZero());
            __CLR4_4_15ic5iclb90p7cr.R.inc(7432);result.nans = QNAN;
            __CLR4_4_15ic5iclb90p7cr.R.inc(7433);return dotrap(DfpField.FLAG_INVALID, NEW_INSTANCE_TRAP, d, result);
        }

        }__CLR4_4_15ic5iclb90p7cr.R.inc(7434);return new Dfp(d);

    }finally{__CLR4_4_15ic5iclb90p7cr.R.flushNeeded();}}

    /** Create an instance from a String representation.
     * Use this internally in preference to constructors to facilitate subclasses.
     * @param s string representation of the instance
     * @return a new instance parsed from specified string
     */
    public Dfp newInstance(final String s) {try{__CLR4_4_15ic5iclb90p7cr.R.inc(7435);
        __CLR4_4_15ic5iclb90p7cr.R.inc(7436);return new Dfp(field, s);
    }finally{__CLR4_4_15ic5iclb90p7cr.R.flushNeeded();}}

    /** Creates an instance with a non-finite value.
     * @param sig sign of the Dfp to create
     * @param code code of the value, must be one of {@link #INFINITE},
     * {@link #SNAN},  {@link #QNAN}
     * @return a new instance with a non-finite value
     */
    public Dfp newInstance(final byte sig, final byte code) {try{__CLR4_4_15ic5iclb90p7cr.R.inc(7437);
        __CLR4_4_15ic5iclb90p7cr.R.inc(7438);return field.newDfp(sig, code);
    }finally{__CLR4_4_15ic5iclb90p7cr.R.flushNeeded();}}

    /** Get the {@link org.apache.commons.math3.Field Field} (really a {@link DfpField}) to which the instance belongs.
     * <p>
     * The field is linked to the number of digits and acts as a factory
     * for {@link Dfp} instances.
     * </p>
     * @return {@link org.apache.commons.math3.Field Field} (really a {@link DfpField}) to which the instance belongs
     */
    public DfpField getField() {try{__CLR4_4_15ic5iclb90p7cr.R.inc(7439);
        __CLR4_4_15ic5iclb90p7cr.R.inc(7440);return field;
    }finally{__CLR4_4_15ic5iclb90p7cr.R.flushNeeded();}}

    /** Get the number of radix digits of the instance.
     * @return number of radix digits
     */
    public int getRadixDigits() {try{__CLR4_4_15ic5iclb90p7cr.R.inc(7441);
        __CLR4_4_15ic5iclb90p7cr.R.inc(7442);return field.getRadixDigits();
    }finally{__CLR4_4_15ic5iclb90p7cr.R.flushNeeded();}}

    /** Get the constant 0.
     * @return a Dfp with value zero
     */
    public Dfp getZero() {try{__CLR4_4_15ic5iclb90p7cr.R.inc(7443);
        __CLR4_4_15ic5iclb90p7cr.R.inc(7444);return field.getZero();
    }finally{__CLR4_4_15ic5iclb90p7cr.R.flushNeeded();}}

    /** Get the constant 1.
     * @return a Dfp with value one
     */
    public Dfp getOne() {try{__CLR4_4_15ic5iclb90p7cr.R.inc(7445);
        __CLR4_4_15ic5iclb90p7cr.R.inc(7446);return field.getOne();
    }finally{__CLR4_4_15ic5iclb90p7cr.R.flushNeeded();}}

    /** Get the constant 2.
     * @return a Dfp with value two
     */
    public Dfp getTwo() {try{__CLR4_4_15ic5iclb90p7cr.R.inc(7447);
        __CLR4_4_15ic5iclb90p7cr.R.inc(7448);return field.getTwo();
    }finally{__CLR4_4_15ic5iclb90p7cr.R.flushNeeded();}}

    /** Shift the mantissa left, and adjust the exponent to compensate.
     */
    protected void shiftLeft() {try{__CLR4_4_15ic5iclb90p7cr.R.inc(7449);
        __CLR4_4_15ic5iclb90p7cr.R.inc(7450);for (int i = mant.length - 1; (((i > 0)&&(__CLR4_4_15ic5iclb90p7cr.R.iget(7451)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(7452)==0&false)); i--) {{
            __CLR4_4_15ic5iclb90p7cr.R.inc(7453);mant[i] = mant[i-1];
        }
        }__CLR4_4_15ic5iclb90p7cr.R.inc(7454);mant[0] = 0;
        __CLR4_4_15ic5iclb90p7cr.R.inc(7455);exp--;
    }finally{__CLR4_4_15ic5iclb90p7cr.R.flushNeeded();}}

    /* Note that shiftRight() does not call round() as that round() itself
     uses shiftRight() */
    /** Shift the mantissa right, and adjust the exponent to compensate.
     */
    protected void shiftRight() {try{__CLR4_4_15ic5iclb90p7cr.R.inc(7456);
        __CLR4_4_15ic5iclb90p7cr.R.inc(7457);for (int i = 0; (((i < mant.length - 1)&&(__CLR4_4_15ic5iclb90p7cr.R.iget(7458)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(7459)==0&false)); i++) {{
            __CLR4_4_15ic5iclb90p7cr.R.inc(7460);mant[i] = mant[i+1];
        }
        }__CLR4_4_15ic5iclb90p7cr.R.inc(7461);mant[mant.length - 1] = 0;
        __CLR4_4_15ic5iclb90p7cr.R.inc(7462);exp++;
    }finally{__CLR4_4_15ic5iclb90p7cr.R.flushNeeded();}}

    /** Make our exp equal to the supplied one, this may cause rounding.
     *  Also causes de-normalized numbers.  These numbers are generally
     *  dangerous because most routines assume normalized numbers.
     *  Align doesn't round, so it will return the last digit destroyed
     *  by shifting right.
     *  @param e desired exponent
     *  @return last digit destroyed by shifting right
     */
    protected int align(int e) {try{__CLR4_4_15ic5iclb90p7cr.R.inc(7463);
        __CLR4_4_15ic5iclb90p7cr.R.inc(7464);int lostdigit = 0;
        __CLR4_4_15ic5iclb90p7cr.R.inc(7465);boolean inexact = false;

        __CLR4_4_15ic5iclb90p7cr.R.inc(7466);int diff = exp - e;

        __CLR4_4_15ic5iclb90p7cr.R.inc(7467);int adiff = diff;
        __CLR4_4_15ic5iclb90p7cr.R.inc(7468);if ((((adiff < 0)&&(__CLR4_4_15ic5iclb90p7cr.R.iget(7469)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(7470)==0&false))) {{
            __CLR4_4_15ic5iclb90p7cr.R.inc(7471);adiff = -adiff;
        }

        }__CLR4_4_15ic5iclb90p7cr.R.inc(7472);if ((((diff == 0)&&(__CLR4_4_15ic5iclb90p7cr.R.iget(7473)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(7474)==0&false))) {{
            __CLR4_4_15ic5iclb90p7cr.R.inc(7475);return 0;
        }

        }__CLR4_4_15ic5iclb90p7cr.R.inc(7476);if ((((adiff > (mant.length + 1))&&(__CLR4_4_15ic5iclb90p7cr.R.iget(7477)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(7478)==0&false))) {{
            // Special case
            __CLR4_4_15ic5iclb90p7cr.R.inc(7479);Arrays.fill(mant, 0);
            __CLR4_4_15ic5iclb90p7cr.R.inc(7480);exp = e;

            __CLR4_4_15ic5iclb90p7cr.R.inc(7481);field.setIEEEFlagsBits(DfpField.FLAG_INEXACT);
            __CLR4_4_15ic5iclb90p7cr.R.inc(7482);dotrap(DfpField.FLAG_INEXACT, ALIGN_TRAP, this, this);

            __CLR4_4_15ic5iclb90p7cr.R.inc(7483);return 0;
        }

        }__CLR4_4_15ic5iclb90p7cr.R.inc(7484);for (int i = 0; (((i < adiff)&&(__CLR4_4_15ic5iclb90p7cr.R.iget(7485)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(7486)==0&false)); i++) {{
            __CLR4_4_15ic5iclb90p7cr.R.inc(7487);if ((((diff < 0)&&(__CLR4_4_15ic5iclb90p7cr.R.iget(7488)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(7489)==0&false))) {{
                /* Keep track of loss -- only signal inexact after losing 2 digits.
                 * the first lost digit is returned to add() and may be incorporated
                 * into the result.
                 */
                __CLR4_4_15ic5iclb90p7cr.R.inc(7490);if ((((lostdigit != 0)&&(__CLR4_4_15ic5iclb90p7cr.R.iget(7491)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(7492)==0&false))) {{
                    __CLR4_4_15ic5iclb90p7cr.R.inc(7493);inexact = true;
                }

                }__CLR4_4_15ic5iclb90p7cr.R.inc(7494);lostdigit = mant[0];

                __CLR4_4_15ic5iclb90p7cr.R.inc(7495);shiftRight();
            } }else {{
                __CLR4_4_15ic5iclb90p7cr.R.inc(7496);shiftLeft();
            }
        }}

        }__CLR4_4_15ic5iclb90p7cr.R.inc(7497);if ((((inexact)&&(__CLR4_4_15ic5iclb90p7cr.R.iget(7498)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(7499)==0&false))) {{
            __CLR4_4_15ic5iclb90p7cr.R.inc(7500);field.setIEEEFlagsBits(DfpField.FLAG_INEXACT);
            __CLR4_4_15ic5iclb90p7cr.R.inc(7501);dotrap(DfpField.FLAG_INEXACT, ALIGN_TRAP, this, this);
        }

        }__CLR4_4_15ic5iclb90p7cr.R.inc(7502);return lostdigit;

    }finally{__CLR4_4_15ic5iclb90p7cr.R.flushNeeded();}}

    /** Check if instance is less than x.
     * @param x number to check instance against
     * @return true if instance is less than x and neither are NaN, false otherwise
     */
    public boolean lessThan(final Dfp x) {try{__CLR4_4_15ic5iclb90p7cr.R.inc(7503);

        // make sure we don't mix number with different precision
        __CLR4_4_15ic5iclb90p7cr.R.inc(7504);if ((((field.getRadixDigits() != x.field.getRadixDigits())&&(__CLR4_4_15ic5iclb90p7cr.R.iget(7505)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(7506)==0&false))) {{
            __CLR4_4_15ic5iclb90p7cr.R.inc(7507);field.setIEEEFlagsBits(DfpField.FLAG_INVALID);
            __CLR4_4_15ic5iclb90p7cr.R.inc(7508);final Dfp result = newInstance(getZero());
            __CLR4_4_15ic5iclb90p7cr.R.inc(7509);result.nans = QNAN;
            __CLR4_4_15ic5iclb90p7cr.R.inc(7510);dotrap(DfpField.FLAG_INVALID, LESS_THAN_TRAP, x, result);
            __CLR4_4_15ic5iclb90p7cr.R.inc(7511);return false;
        }

        /* if a nan is involved, signal invalid and return false */
        }__CLR4_4_15ic5iclb90p7cr.R.inc(7512);if ((((isNaN() || x.isNaN())&&(__CLR4_4_15ic5iclb90p7cr.R.iget(7513)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(7514)==0&false))) {{
            __CLR4_4_15ic5iclb90p7cr.R.inc(7515);field.setIEEEFlagsBits(DfpField.FLAG_INVALID);
            __CLR4_4_15ic5iclb90p7cr.R.inc(7516);dotrap(DfpField.FLAG_INVALID, LESS_THAN_TRAP, x, newInstance(getZero()));
            __CLR4_4_15ic5iclb90p7cr.R.inc(7517);return false;
        }

        }__CLR4_4_15ic5iclb90p7cr.R.inc(7518);return compare(this, x) < 0;
    }finally{__CLR4_4_15ic5iclb90p7cr.R.flushNeeded();}}

    /** Check if instance is greater than x.
     * @param x number to check instance against
     * @return true if instance is greater than x and neither are NaN, false otherwise
     */
    public boolean greaterThan(final Dfp x) {try{__CLR4_4_15ic5iclb90p7cr.R.inc(7519);

        // make sure we don't mix number with different precision
        __CLR4_4_15ic5iclb90p7cr.R.inc(7520);if ((((field.getRadixDigits() != x.field.getRadixDigits())&&(__CLR4_4_15ic5iclb90p7cr.R.iget(7521)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(7522)==0&false))) {{
            __CLR4_4_15ic5iclb90p7cr.R.inc(7523);field.setIEEEFlagsBits(DfpField.FLAG_INVALID);
            __CLR4_4_15ic5iclb90p7cr.R.inc(7524);final Dfp result = newInstance(getZero());
            __CLR4_4_15ic5iclb90p7cr.R.inc(7525);result.nans = QNAN;
            __CLR4_4_15ic5iclb90p7cr.R.inc(7526);dotrap(DfpField.FLAG_INVALID, GREATER_THAN_TRAP, x, result);
            __CLR4_4_15ic5iclb90p7cr.R.inc(7527);return false;
        }

        /* if a nan is involved, signal invalid and return false */
        }__CLR4_4_15ic5iclb90p7cr.R.inc(7528);if ((((isNaN() || x.isNaN())&&(__CLR4_4_15ic5iclb90p7cr.R.iget(7529)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(7530)==0&false))) {{
            __CLR4_4_15ic5iclb90p7cr.R.inc(7531);field.setIEEEFlagsBits(DfpField.FLAG_INVALID);
            __CLR4_4_15ic5iclb90p7cr.R.inc(7532);dotrap(DfpField.FLAG_INVALID, GREATER_THAN_TRAP, x, newInstance(getZero()));
            __CLR4_4_15ic5iclb90p7cr.R.inc(7533);return false;
        }

        }__CLR4_4_15ic5iclb90p7cr.R.inc(7534);return compare(this, x) > 0;
    }finally{__CLR4_4_15ic5iclb90p7cr.R.flushNeeded();}}

    /** Check if instance is less than or equal to 0.
     * @return true if instance is not NaN and less than or equal to 0, false otherwise
     */
    public boolean negativeOrNull() {try{__CLR4_4_15ic5iclb90p7cr.R.inc(7535);

        __CLR4_4_15ic5iclb90p7cr.R.inc(7536);if ((((isNaN())&&(__CLR4_4_15ic5iclb90p7cr.R.iget(7537)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(7538)==0&false))) {{
            __CLR4_4_15ic5iclb90p7cr.R.inc(7539);field.setIEEEFlagsBits(DfpField.FLAG_INVALID);
            __CLR4_4_15ic5iclb90p7cr.R.inc(7540);dotrap(DfpField.FLAG_INVALID, LESS_THAN_TRAP, this, newInstance(getZero()));
            __CLR4_4_15ic5iclb90p7cr.R.inc(7541);return false;
        }

        }__CLR4_4_15ic5iclb90p7cr.R.inc(7542);return (sign < 0) || ((mant[mant.length - 1] == 0) && !isInfinite());

    }finally{__CLR4_4_15ic5iclb90p7cr.R.flushNeeded();}}

    /** Check if instance is strictly less than 0.
     * @return true if instance is not NaN and less than or equal to 0, false otherwise
     */
    public boolean strictlyNegative() {try{__CLR4_4_15ic5iclb90p7cr.R.inc(7543);

        __CLR4_4_15ic5iclb90p7cr.R.inc(7544);if ((((isNaN())&&(__CLR4_4_15ic5iclb90p7cr.R.iget(7545)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(7546)==0&false))) {{
            __CLR4_4_15ic5iclb90p7cr.R.inc(7547);field.setIEEEFlagsBits(DfpField.FLAG_INVALID);
            __CLR4_4_15ic5iclb90p7cr.R.inc(7548);dotrap(DfpField.FLAG_INVALID, LESS_THAN_TRAP, this, newInstance(getZero()));
            __CLR4_4_15ic5iclb90p7cr.R.inc(7549);return false;
        }

        }__CLR4_4_15ic5iclb90p7cr.R.inc(7550);return (sign < 0) && ((mant[mant.length - 1] != 0) || isInfinite());

    }finally{__CLR4_4_15ic5iclb90p7cr.R.flushNeeded();}}

    /** Check if instance is greater than or equal to 0.
     * @return true if instance is not NaN and greater than or equal to 0, false otherwise
     */
    public boolean positiveOrNull() {try{__CLR4_4_15ic5iclb90p7cr.R.inc(7551);

        __CLR4_4_15ic5iclb90p7cr.R.inc(7552);if ((((isNaN())&&(__CLR4_4_15ic5iclb90p7cr.R.iget(7553)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(7554)==0&false))) {{
            __CLR4_4_15ic5iclb90p7cr.R.inc(7555);field.setIEEEFlagsBits(DfpField.FLAG_INVALID);
            __CLR4_4_15ic5iclb90p7cr.R.inc(7556);dotrap(DfpField.FLAG_INVALID, LESS_THAN_TRAP, this, newInstance(getZero()));
            __CLR4_4_15ic5iclb90p7cr.R.inc(7557);return false;
        }

        }__CLR4_4_15ic5iclb90p7cr.R.inc(7558);return (sign > 0) || ((mant[mant.length - 1] == 0) && !isInfinite());

    }finally{__CLR4_4_15ic5iclb90p7cr.R.flushNeeded();}}

    /** Check if instance is strictly greater than 0.
     * @return true if instance is not NaN and greater than or equal to 0, false otherwise
     */
    public boolean strictlyPositive() {try{__CLR4_4_15ic5iclb90p7cr.R.inc(7559);

        __CLR4_4_15ic5iclb90p7cr.R.inc(7560);if ((((isNaN())&&(__CLR4_4_15ic5iclb90p7cr.R.iget(7561)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(7562)==0&false))) {{
            __CLR4_4_15ic5iclb90p7cr.R.inc(7563);field.setIEEEFlagsBits(DfpField.FLAG_INVALID);
            __CLR4_4_15ic5iclb90p7cr.R.inc(7564);dotrap(DfpField.FLAG_INVALID, LESS_THAN_TRAP, this, newInstance(getZero()));
            __CLR4_4_15ic5iclb90p7cr.R.inc(7565);return false;
        }

        }__CLR4_4_15ic5iclb90p7cr.R.inc(7566);return (sign > 0) && ((mant[mant.length - 1] != 0) || isInfinite());

    }finally{__CLR4_4_15ic5iclb90p7cr.R.flushNeeded();}}

    /** Get the absolute value of instance.
     * @return absolute value of instance
     * @since 3.2
     */
    public Dfp abs() {try{__CLR4_4_15ic5iclb90p7cr.R.inc(7567);
        __CLR4_4_15ic5iclb90p7cr.R.inc(7568);Dfp result = newInstance(this);
        __CLR4_4_15ic5iclb90p7cr.R.inc(7569);result.sign = 1;
        __CLR4_4_15ic5iclb90p7cr.R.inc(7570);return result;
    }finally{__CLR4_4_15ic5iclb90p7cr.R.flushNeeded();}}

    /** Check if instance is infinite.
     * @return true if instance is infinite
     */
    public boolean isInfinite() {try{__CLR4_4_15ic5iclb90p7cr.R.inc(7571);
        __CLR4_4_15ic5iclb90p7cr.R.inc(7572);return nans == INFINITE;
    }finally{__CLR4_4_15ic5iclb90p7cr.R.flushNeeded();}}

    /** Check if instance is not a number.
     * @return true if instance is not a number
     */
    public boolean isNaN() {try{__CLR4_4_15ic5iclb90p7cr.R.inc(7573);
        __CLR4_4_15ic5iclb90p7cr.R.inc(7574);return (nans == QNAN) || (nans == SNAN);
    }finally{__CLR4_4_15ic5iclb90p7cr.R.flushNeeded();}}

    /** Check if instance is equal to zero.
     * @return true if instance is equal to zero
     */
    public boolean isZero() {try{__CLR4_4_15ic5iclb90p7cr.R.inc(7575);

        __CLR4_4_15ic5iclb90p7cr.R.inc(7576);if ((((isNaN())&&(__CLR4_4_15ic5iclb90p7cr.R.iget(7577)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(7578)==0&false))) {{
            __CLR4_4_15ic5iclb90p7cr.R.inc(7579);field.setIEEEFlagsBits(DfpField.FLAG_INVALID);
            __CLR4_4_15ic5iclb90p7cr.R.inc(7580);dotrap(DfpField.FLAG_INVALID, LESS_THAN_TRAP, this, newInstance(getZero()));
            __CLR4_4_15ic5iclb90p7cr.R.inc(7581);return false;
        }

        }__CLR4_4_15ic5iclb90p7cr.R.inc(7582);return (mant[mant.length - 1] == 0) && !isInfinite();

    }finally{__CLR4_4_15ic5iclb90p7cr.R.flushNeeded();}}

    /** Check if instance is equal to x.
     * @param other object to check instance against
     * @return true if instance is equal to x and neither are NaN, false otherwise
     */
    @Override
    public boolean equals(final Object other) {try{__CLR4_4_15ic5iclb90p7cr.R.inc(7583);

        __CLR4_4_15ic5iclb90p7cr.R.inc(7584);if ((((other instanceof Dfp)&&(__CLR4_4_15ic5iclb90p7cr.R.iget(7585)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(7586)==0&false))) {{
            __CLR4_4_15ic5iclb90p7cr.R.inc(7587);final Dfp x = (Dfp) other;
            __CLR4_4_15ic5iclb90p7cr.R.inc(7588);if ((((isNaN() || x.isNaN() || field.getRadixDigits() != x.field.getRadixDigits())&&(__CLR4_4_15ic5iclb90p7cr.R.iget(7589)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(7590)==0&false))) {{
                __CLR4_4_15ic5iclb90p7cr.R.inc(7591);return false;
            }

            }__CLR4_4_15ic5iclb90p7cr.R.inc(7592);return compare(this, x) == 0;
        }

        }__CLR4_4_15ic5iclb90p7cr.R.inc(7593);return false;

    }finally{__CLR4_4_15ic5iclb90p7cr.R.flushNeeded();}}

    /**
     * Gets a hashCode for the instance.
     * @return a hash code value for this object
     */
    @Override
    public int hashCode() {try{__CLR4_4_15ic5iclb90p7cr.R.inc(7594);
        __CLR4_4_15ic5iclb90p7cr.R.inc(7595);return 17 + (sign << 8) + (nans << 16) + exp + Arrays.hashCode(mant);
    }finally{__CLR4_4_15ic5iclb90p7cr.R.flushNeeded();}}

    /** Check if instance is not equal to x.
     * @param x number to check instance against
     * @return true if instance is not equal to x and neither are NaN, false otherwise
     */
    public boolean unequal(final Dfp x) {try{__CLR4_4_15ic5iclb90p7cr.R.inc(7596);
        __CLR4_4_15ic5iclb90p7cr.R.inc(7597);if ((((isNaN() || x.isNaN() || field.getRadixDigits() != x.field.getRadixDigits())&&(__CLR4_4_15ic5iclb90p7cr.R.iget(7598)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(7599)==0&false))) {{
            __CLR4_4_15ic5iclb90p7cr.R.inc(7600);return false;
        }

        }__CLR4_4_15ic5iclb90p7cr.R.inc(7601);return greaterThan(x) || lessThan(x);
    }finally{__CLR4_4_15ic5iclb90p7cr.R.flushNeeded();}}

    /** Compare two instances.
     * @param a first instance in comparison
     * @param b second instance in comparison
     * @return -1 if a<b, 1 if a>b and 0 if a==b
     *  Note this method does not properly handle NaNs or numbers with different precision.
     */
    private static int compare(final Dfp a, final Dfp b) {try{__CLR4_4_15ic5iclb90p7cr.R.inc(7602);
        // Ignore the sign of zero
        __CLR4_4_15ic5iclb90p7cr.R.inc(7603);if ((((a.mant[a.mant.length - 1] == 0 && b.mant[b.mant.length - 1] == 0 &&
            a.nans == FINITE && b.nans == FINITE)&&(__CLR4_4_15ic5iclb90p7cr.R.iget(7604)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(7605)==0&false))) {{
            __CLR4_4_15ic5iclb90p7cr.R.inc(7606);return 0;
        }

        }__CLR4_4_15ic5iclb90p7cr.R.inc(7607);if ((((a.sign != b.sign)&&(__CLR4_4_15ic5iclb90p7cr.R.iget(7608)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(7609)==0&false))) {{
            __CLR4_4_15ic5iclb90p7cr.R.inc(7610);if ((((a.sign == -1)&&(__CLR4_4_15ic5iclb90p7cr.R.iget(7611)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(7612)==0&false))) {{
                __CLR4_4_15ic5iclb90p7cr.R.inc(7613);return -1;
            } }else {{
                __CLR4_4_15ic5iclb90p7cr.R.inc(7614);return 1;
            }
        }}

        // deal with the infinities
        }__CLR4_4_15ic5iclb90p7cr.R.inc(7615);if ((((a.nans == INFINITE && b.nans == FINITE)&&(__CLR4_4_15ic5iclb90p7cr.R.iget(7616)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(7617)==0&false))) {{
            __CLR4_4_15ic5iclb90p7cr.R.inc(7618);return a.sign;
        }

        }__CLR4_4_15ic5iclb90p7cr.R.inc(7619);if ((((a.nans == FINITE && b.nans == INFINITE)&&(__CLR4_4_15ic5iclb90p7cr.R.iget(7620)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(7621)==0&false))) {{
            __CLR4_4_15ic5iclb90p7cr.R.inc(7622);return -b.sign;
        }

        }__CLR4_4_15ic5iclb90p7cr.R.inc(7623);if ((((a.nans == INFINITE && b.nans == INFINITE)&&(__CLR4_4_15ic5iclb90p7cr.R.iget(7624)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(7625)==0&false))) {{
            __CLR4_4_15ic5iclb90p7cr.R.inc(7626);return 0;
        }

        // Handle special case when a or b is zero, by ignoring the exponents
        }__CLR4_4_15ic5iclb90p7cr.R.inc(7627);if ((((b.mant[b.mant.length-1] != 0 && a.mant[b.mant.length-1] != 0)&&(__CLR4_4_15ic5iclb90p7cr.R.iget(7628)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(7629)==0&false))) {{
            __CLR4_4_15ic5iclb90p7cr.R.inc(7630);if ((((a.exp < b.exp)&&(__CLR4_4_15ic5iclb90p7cr.R.iget(7631)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(7632)==0&false))) {{
                __CLR4_4_15ic5iclb90p7cr.R.inc(7633);return -a.sign;
            }

            }__CLR4_4_15ic5iclb90p7cr.R.inc(7634);if ((((a.exp > b.exp)&&(__CLR4_4_15ic5iclb90p7cr.R.iget(7635)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(7636)==0&false))) {{
                __CLR4_4_15ic5iclb90p7cr.R.inc(7637);return a.sign;
            }
        }}

        // compare the mantissas
        }__CLR4_4_15ic5iclb90p7cr.R.inc(7638);for (int i = a.mant.length - 1; (((i >= 0)&&(__CLR4_4_15ic5iclb90p7cr.R.iget(7639)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(7640)==0&false)); i--) {{
            __CLR4_4_15ic5iclb90p7cr.R.inc(7641);if ((((a.mant[i] > b.mant[i])&&(__CLR4_4_15ic5iclb90p7cr.R.iget(7642)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(7643)==0&false))) {{
                __CLR4_4_15ic5iclb90p7cr.R.inc(7644);return a.sign;
            }

            }__CLR4_4_15ic5iclb90p7cr.R.inc(7645);if ((((a.mant[i] < b.mant[i])&&(__CLR4_4_15ic5iclb90p7cr.R.iget(7646)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(7647)==0&false))) {{
                __CLR4_4_15ic5iclb90p7cr.R.inc(7648);return -a.sign;
            }
        }}

        }__CLR4_4_15ic5iclb90p7cr.R.inc(7649);return 0;

    }finally{__CLR4_4_15ic5iclb90p7cr.R.flushNeeded();}}

    /** Round to nearest integer using the round-half-even method.
     *  That is round to nearest integer unless both are equidistant.
     *  In which case round to the even one.
     *  @return rounded value
     * @since 3.2
     */
    public Dfp rint() {try{__CLR4_4_15ic5iclb90p7cr.R.inc(7650);
        __CLR4_4_15ic5iclb90p7cr.R.inc(7651);return trunc(DfpField.RoundingMode.ROUND_HALF_EVEN);
    }finally{__CLR4_4_15ic5iclb90p7cr.R.flushNeeded();}}

    /** Round to an integer using the round floor mode.
     * That is, round toward -Infinity
     *  @return rounded value
     * @since 3.2
     */
    public Dfp floor() {try{__CLR4_4_15ic5iclb90p7cr.R.inc(7652);
        __CLR4_4_15ic5iclb90p7cr.R.inc(7653);return trunc(DfpField.RoundingMode.ROUND_FLOOR);
    }finally{__CLR4_4_15ic5iclb90p7cr.R.flushNeeded();}}

    /** Round to an integer using the round ceil mode.
     * That is, round toward +Infinity
     *  @return rounded value
     * @since 3.2
     */
    public Dfp ceil() {try{__CLR4_4_15ic5iclb90p7cr.R.inc(7654);
        __CLR4_4_15ic5iclb90p7cr.R.inc(7655);return trunc(DfpField.RoundingMode.ROUND_CEIL);
    }finally{__CLR4_4_15ic5iclb90p7cr.R.flushNeeded();}}

    /** Returns the IEEE remainder.
     * @param d divisor
     * @return this less n &times; d, where n is the integer closest to this/d
     * @since 3.2
     */
    public Dfp remainder(final Dfp d) {try{__CLR4_4_15ic5iclb90p7cr.R.inc(7656);

        __CLR4_4_15ic5iclb90p7cr.R.inc(7657);final Dfp result = this.subtract(this.divide(d).rint().multiply(d));

        // IEEE 854-1987 says that if the result is zero, then it carries the sign of this
        __CLR4_4_15ic5iclb90p7cr.R.inc(7658);if ((((result.mant[mant.length-1] == 0)&&(__CLR4_4_15ic5iclb90p7cr.R.iget(7659)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(7660)==0&false))) {{
            __CLR4_4_15ic5iclb90p7cr.R.inc(7661);result.sign = sign;
        }

        }__CLR4_4_15ic5iclb90p7cr.R.inc(7662);return result;

    }finally{__CLR4_4_15ic5iclb90p7cr.R.flushNeeded();}}

    /** Does the integer conversions with the specified rounding.
     * @param rmode rounding mode to use
     * @return truncated value
     */
    protected Dfp trunc(final DfpField.RoundingMode rmode) {try{__CLR4_4_15ic5iclb90p7cr.R.inc(7663);
        __CLR4_4_15ic5iclb90p7cr.R.inc(7664);boolean changed = false;

        __CLR4_4_15ic5iclb90p7cr.R.inc(7665);if ((((isNaN())&&(__CLR4_4_15ic5iclb90p7cr.R.iget(7666)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(7667)==0&false))) {{
            __CLR4_4_15ic5iclb90p7cr.R.inc(7668);return newInstance(this);
        }

        }__CLR4_4_15ic5iclb90p7cr.R.inc(7669);if ((((nans == INFINITE)&&(__CLR4_4_15ic5iclb90p7cr.R.iget(7670)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(7671)==0&false))) {{
            __CLR4_4_15ic5iclb90p7cr.R.inc(7672);return newInstance(this);
        }

        }__CLR4_4_15ic5iclb90p7cr.R.inc(7673);if ((((mant[mant.length-1] == 0)&&(__CLR4_4_15ic5iclb90p7cr.R.iget(7674)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(7675)==0&false))) {{
            // a is zero
            __CLR4_4_15ic5iclb90p7cr.R.inc(7676);return newInstance(this);
        }

        /* If the exponent is less than zero then we can certainly
         * return zero */
        }__CLR4_4_15ic5iclb90p7cr.R.inc(7677);if ((((exp < 0)&&(__CLR4_4_15ic5iclb90p7cr.R.iget(7678)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(7679)==0&false))) {{
            __CLR4_4_15ic5iclb90p7cr.R.inc(7680);field.setIEEEFlagsBits(DfpField.FLAG_INEXACT);
            __CLR4_4_15ic5iclb90p7cr.R.inc(7681);Dfp result = newInstance(getZero());
            __CLR4_4_15ic5iclb90p7cr.R.inc(7682);result = dotrap(DfpField.FLAG_INEXACT, TRUNC_TRAP, this, result);
            __CLR4_4_15ic5iclb90p7cr.R.inc(7683);return result;
        }

        /* If the exponent is greater than or equal to digits, then it
         * must already be an integer since there is no precision left
         * for any fractional part */

        }__CLR4_4_15ic5iclb90p7cr.R.inc(7684);if ((((exp >= mant.length)&&(__CLR4_4_15ic5iclb90p7cr.R.iget(7685)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(7686)==0&false))) {{
            __CLR4_4_15ic5iclb90p7cr.R.inc(7687);return newInstance(this);
        }

        /* General case:  create another dfp, result, that contains the
         * a with the fractional part lopped off.  */

        }__CLR4_4_15ic5iclb90p7cr.R.inc(7688);Dfp result = newInstance(this);
        __CLR4_4_15ic5iclb90p7cr.R.inc(7689);for (int i = 0; (((i < mant.length-result.exp)&&(__CLR4_4_15ic5iclb90p7cr.R.iget(7690)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(7691)==0&false)); i++) {{
            __CLR4_4_15ic5iclb90p7cr.R.inc(7692);changed |= result.mant[i] != 0;
            __CLR4_4_15ic5iclb90p7cr.R.inc(7693);result.mant[i] = 0;
        }

        }__CLR4_4_15ic5iclb90p7cr.R.inc(7694);if ((((changed)&&(__CLR4_4_15ic5iclb90p7cr.R.iget(7695)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(7696)==0&false))) {{
            boolean __CLB4_4_1_bool0=false;__CLR4_4_15ic5iclb90p7cr.R.inc(7697);switch (rmode) {
                case ROUND_FLOOR:if (!__CLB4_4_1_bool0) {__CLR4_4_15ic5iclb90p7cr.R.inc(7698);__CLB4_4_1_bool0=true;}
                    __CLR4_4_15ic5iclb90p7cr.R.inc(7699);if ((((result.sign == -1)&&(__CLR4_4_15ic5iclb90p7cr.R.iget(7700)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(7701)==0&false))) {{
                        // then we must increment the mantissa by one
                        __CLR4_4_15ic5iclb90p7cr.R.inc(7702);result = result.add(newInstance(-1));
                    }
                    }__CLR4_4_15ic5iclb90p7cr.R.inc(7703);break;

                case ROUND_CEIL:if (!__CLB4_4_1_bool0) {__CLR4_4_15ic5iclb90p7cr.R.inc(7704);__CLB4_4_1_bool0=true;}
                    __CLR4_4_15ic5iclb90p7cr.R.inc(7705);if ((((result.sign == 1)&&(__CLR4_4_15ic5iclb90p7cr.R.iget(7706)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(7707)==0&false))) {{
                        // then we must increment the mantissa by one
                        __CLR4_4_15ic5iclb90p7cr.R.inc(7708);result = result.add(getOne());
                    }
                    }__CLR4_4_15ic5iclb90p7cr.R.inc(7709);break;

                case ROUND_HALF_EVEN:if (!__CLB4_4_1_bool0) {__CLR4_4_15ic5iclb90p7cr.R.inc(7710);__CLB4_4_1_bool0=true;}
                default:if (!__CLB4_4_1_bool0) {__CLR4_4_15ic5iclb90p7cr.R.inc(7711);__CLB4_4_1_bool0=true;}
                    __CLR4_4_15ic5iclb90p7cr.R.inc(7712);final Dfp half = newInstance("0.5");
                    __CLR4_4_15ic5iclb90p7cr.R.inc(7713);Dfp a = subtract(result);  // difference between this and result
                    __CLR4_4_15ic5iclb90p7cr.R.inc(7714);a.sign = 1;            // force positive (take abs)
                    __CLR4_4_15ic5iclb90p7cr.R.inc(7715);if ((((a.greaterThan(half))&&(__CLR4_4_15ic5iclb90p7cr.R.iget(7716)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(7717)==0&false))) {{
                        __CLR4_4_15ic5iclb90p7cr.R.inc(7718);a = newInstance(getOne());
                        __CLR4_4_15ic5iclb90p7cr.R.inc(7719);a.sign = sign;
                        __CLR4_4_15ic5iclb90p7cr.R.inc(7720);result = result.add(a);
                    }

                    /** If exactly equal to 1/2 and odd then increment */
                    }__CLR4_4_15ic5iclb90p7cr.R.inc(7721);if ((((a.equals(half) && result.exp > 0 && (result.mant[mant.length-result.exp]&1) != 0)&&(__CLR4_4_15ic5iclb90p7cr.R.iget(7722)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(7723)==0&false))) {{
                        __CLR4_4_15ic5iclb90p7cr.R.inc(7724);a = newInstance(getOne());
                        __CLR4_4_15ic5iclb90p7cr.R.inc(7725);a.sign = sign;
                        __CLR4_4_15ic5iclb90p7cr.R.inc(7726);result = result.add(a);
                    }
                    }__CLR4_4_15ic5iclb90p7cr.R.inc(7727);break;
            }

            __CLR4_4_15ic5iclb90p7cr.R.inc(7728);field.setIEEEFlagsBits(DfpField.FLAG_INEXACT);  // signal inexact
            __CLR4_4_15ic5iclb90p7cr.R.inc(7729);result = dotrap(DfpField.FLAG_INEXACT, TRUNC_TRAP, this, result);
            __CLR4_4_15ic5iclb90p7cr.R.inc(7730);return result;
        }

        }__CLR4_4_15ic5iclb90p7cr.R.inc(7731);return result;
    }finally{__CLR4_4_15ic5iclb90p7cr.R.flushNeeded();}}

    /** Convert this to an integer.
     * If greater than 2147483647, it returns 2147483647. If less than -2147483648 it returns -2147483648.
     * @return converted number
     */
    public int intValue() {try{__CLR4_4_15ic5iclb90p7cr.R.inc(7732);
        __CLR4_4_15ic5iclb90p7cr.R.inc(7733);Dfp rounded;
        __CLR4_4_15ic5iclb90p7cr.R.inc(7734);int result = 0;

        __CLR4_4_15ic5iclb90p7cr.R.inc(7735);rounded = rint();

        __CLR4_4_15ic5iclb90p7cr.R.inc(7736);if ((((rounded.greaterThan(newInstance(2147483647)))&&(__CLR4_4_15ic5iclb90p7cr.R.iget(7737)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(7738)==0&false))) {{
            __CLR4_4_15ic5iclb90p7cr.R.inc(7739);return 2147483647;
        }

        }__CLR4_4_15ic5iclb90p7cr.R.inc(7740);if ((((rounded.lessThan(newInstance(-2147483648)))&&(__CLR4_4_15ic5iclb90p7cr.R.iget(7741)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(7742)==0&false))) {{
            __CLR4_4_15ic5iclb90p7cr.R.inc(7743);return -2147483648;
        }

        }__CLR4_4_15ic5iclb90p7cr.R.inc(7744);for (int i = mant.length - 1; (((i >= mant.length - rounded.exp)&&(__CLR4_4_15ic5iclb90p7cr.R.iget(7745)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(7746)==0&false)); i--) {{
            __CLR4_4_15ic5iclb90p7cr.R.inc(7747);result = result * RADIX + rounded.mant[i];
        }

        }__CLR4_4_15ic5iclb90p7cr.R.inc(7748);if ((((rounded.sign == -1)&&(__CLR4_4_15ic5iclb90p7cr.R.iget(7749)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(7750)==0&false))) {{
            __CLR4_4_15ic5iclb90p7cr.R.inc(7751);result = -result;
        }

        }__CLR4_4_15ic5iclb90p7cr.R.inc(7752);return result;
    }finally{__CLR4_4_15ic5iclb90p7cr.R.flushNeeded();}}

    /** Get the exponent of the greatest power of 10000 that is
     *  less than or equal to the absolute value of this.  I.E.  if
     *  this is 10<sup>6</sup> then log10K would return 1.
     *  @return integer base 10000 logarithm
     */
    public int log10K() {try{__CLR4_4_15ic5iclb90p7cr.R.inc(7753);
        __CLR4_4_15ic5iclb90p7cr.R.inc(7754);return exp - 1;
    }finally{__CLR4_4_15ic5iclb90p7cr.R.flushNeeded();}}

    /** Get the specified  power of 10000.
     * @param e desired power
     * @return 10000<sup>e</sup>
     */
    public Dfp power10K(final int e) {try{__CLR4_4_15ic5iclb90p7cr.R.inc(7755);
        __CLR4_4_15ic5iclb90p7cr.R.inc(7756);Dfp d = newInstance(getOne());
        __CLR4_4_15ic5iclb90p7cr.R.inc(7757);d.exp = e + 1;
        __CLR4_4_15ic5iclb90p7cr.R.inc(7758);return d;
    }finally{__CLR4_4_15ic5iclb90p7cr.R.flushNeeded();}}

    /** Get the exponent of the greatest power of 10 that is less than or equal to abs(this).
     *  @return integer base 10 logarithm
     * @since 3.2
     */
    public int intLog10()  {try{__CLR4_4_15ic5iclb90p7cr.R.inc(7759);
        __CLR4_4_15ic5iclb90p7cr.R.inc(7760);if ((((mant[mant.length-1] > 1000)&&(__CLR4_4_15ic5iclb90p7cr.R.iget(7761)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(7762)==0&false))) {{
            __CLR4_4_15ic5iclb90p7cr.R.inc(7763);return exp * 4 - 1;
        }
        }__CLR4_4_15ic5iclb90p7cr.R.inc(7764);if ((((mant[mant.length-1] > 100)&&(__CLR4_4_15ic5iclb90p7cr.R.iget(7765)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(7766)==0&false))) {{
            __CLR4_4_15ic5iclb90p7cr.R.inc(7767);return exp * 4 - 2;
        }
        }__CLR4_4_15ic5iclb90p7cr.R.inc(7768);if ((((mant[mant.length-1] > 10)&&(__CLR4_4_15ic5iclb90p7cr.R.iget(7769)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(7770)==0&false))) {{
            __CLR4_4_15ic5iclb90p7cr.R.inc(7771);return exp * 4 - 3;
        }
        }__CLR4_4_15ic5iclb90p7cr.R.inc(7772);return exp * 4 - 4;
    }finally{__CLR4_4_15ic5iclb90p7cr.R.flushNeeded();}}

    /** Return the specified  power of 10.
     * @param e desired power
     * @return 10<sup>e</sup>
     */
    public Dfp power10(final int e) {try{__CLR4_4_15ic5iclb90p7cr.R.inc(7773);
        __CLR4_4_15ic5iclb90p7cr.R.inc(7774);Dfp d = newInstance(getOne());

        __CLR4_4_15ic5iclb90p7cr.R.inc(7775);if ((((e >= 0)&&(__CLR4_4_15ic5iclb90p7cr.R.iget(7776)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(7777)==0&false))) {{
            __CLR4_4_15ic5iclb90p7cr.R.inc(7778);d.exp = e / 4 + 1;
        } }else {{
            __CLR4_4_15ic5iclb90p7cr.R.inc(7779);d.exp = (e + 1) / 4;
        }

        }boolean __CLB4_4_1_bool1=false;__CLR4_4_15ic5iclb90p7cr.R.inc(7780);switch ((e % 4 + 4) % 4) {
            case 0:if (!__CLB4_4_1_bool1) {__CLR4_4_15ic5iclb90p7cr.R.inc(7781);__CLB4_4_1_bool1=true;}
                __CLR4_4_15ic5iclb90p7cr.R.inc(7782);break;
            case 1:if (!__CLB4_4_1_bool1) {__CLR4_4_15ic5iclb90p7cr.R.inc(7783);__CLB4_4_1_bool1=true;}
                __CLR4_4_15ic5iclb90p7cr.R.inc(7784);d = d.multiply(10);
                __CLR4_4_15ic5iclb90p7cr.R.inc(7785);break;
            case 2:if (!__CLB4_4_1_bool1) {__CLR4_4_15ic5iclb90p7cr.R.inc(7786);__CLB4_4_1_bool1=true;}
                __CLR4_4_15ic5iclb90p7cr.R.inc(7787);d = d.multiply(100);
                __CLR4_4_15ic5iclb90p7cr.R.inc(7788);break;
            default:if (!__CLB4_4_1_bool1) {__CLR4_4_15ic5iclb90p7cr.R.inc(7789);__CLB4_4_1_bool1=true;}
                __CLR4_4_15ic5iclb90p7cr.R.inc(7790);d = d.multiply(1000);
        }

        __CLR4_4_15ic5iclb90p7cr.R.inc(7791);return d;
    }finally{__CLR4_4_15ic5iclb90p7cr.R.flushNeeded();}}

    /** Negate the mantissa of this by computing the complement.
     *  Leaves the sign bit unchanged, used internally by add.
     *  Denormalized numbers are handled properly here.
     *  @param extra ???
     *  @return ???
     */
    protected int complement(int extra) {try{__CLR4_4_15ic5iclb90p7cr.R.inc(7792);

        __CLR4_4_15ic5iclb90p7cr.R.inc(7793);extra = RADIX-extra;
        __CLR4_4_15ic5iclb90p7cr.R.inc(7794);for (int i = 0; (((i < mant.length)&&(__CLR4_4_15ic5iclb90p7cr.R.iget(7795)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(7796)==0&false)); i++) {{
            __CLR4_4_15ic5iclb90p7cr.R.inc(7797);mant[i] = RADIX-mant[i]-1;
        }

        }__CLR4_4_15ic5iclb90p7cr.R.inc(7798);int rh = extra / RADIX;
        __CLR4_4_15ic5iclb90p7cr.R.inc(7799);extra = extra - rh * RADIX;
        __CLR4_4_15ic5iclb90p7cr.R.inc(7800);for (int i = 0; (((i < mant.length)&&(__CLR4_4_15ic5iclb90p7cr.R.iget(7801)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(7802)==0&false)); i++) {{
            __CLR4_4_15ic5iclb90p7cr.R.inc(7803);final int r = mant[i] + rh;
            __CLR4_4_15ic5iclb90p7cr.R.inc(7804);rh = r / RADIX;
            __CLR4_4_15ic5iclb90p7cr.R.inc(7805);mant[i] = r - rh * RADIX;
        }

        }__CLR4_4_15ic5iclb90p7cr.R.inc(7806);return extra;
    }finally{__CLR4_4_15ic5iclb90p7cr.R.flushNeeded();}}

    /** Add x to this.
     * @param x number to add
     * @return sum of this and x
     */
    public Dfp add(final Dfp x) {try{__CLR4_4_15ic5iclb90p7cr.R.inc(7807);

        // make sure we don't mix number with different precision
        __CLR4_4_15ic5iclb90p7cr.R.inc(7808);if ((((field.getRadixDigits() != x.field.getRadixDigits())&&(__CLR4_4_15ic5iclb90p7cr.R.iget(7809)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(7810)==0&false))) {{
            __CLR4_4_15ic5iclb90p7cr.R.inc(7811);field.setIEEEFlagsBits(DfpField.FLAG_INVALID);
            __CLR4_4_15ic5iclb90p7cr.R.inc(7812);final Dfp result = newInstance(getZero());
            __CLR4_4_15ic5iclb90p7cr.R.inc(7813);result.nans = QNAN;
            __CLR4_4_15ic5iclb90p7cr.R.inc(7814);return dotrap(DfpField.FLAG_INVALID, ADD_TRAP, x, result);
        }

        /* handle special cases */
        }__CLR4_4_15ic5iclb90p7cr.R.inc(7815);if ((((nans != FINITE || x.nans != FINITE)&&(__CLR4_4_15ic5iclb90p7cr.R.iget(7816)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(7817)==0&false))) {{
            __CLR4_4_15ic5iclb90p7cr.R.inc(7818);if ((((isNaN())&&(__CLR4_4_15ic5iclb90p7cr.R.iget(7819)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(7820)==0&false))) {{
                __CLR4_4_15ic5iclb90p7cr.R.inc(7821);return this;
            }

            }__CLR4_4_15ic5iclb90p7cr.R.inc(7822);if ((((x.isNaN())&&(__CLR4_4_15ic5iclb90p7cr.R.iget(7823)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(7824)==0&false))) {{
                __CLR4_4_15ic5iclb90p7cr.R.inc(7825);return x;
            }

            }__CLR4_4_15ic5iclb90p7cr.R.inc(7826);if ((((nans == INFINITE && x.nans == FINITE)&&(__CLR4_4_15ic5iclb90p7cr.R.iget(7827)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(7828)==0&false))) {{
                __CLR4_4_15ic5iclb90p7cr.R.inc(7829);return this;
            }

            }__CLR4_4_15ic5iclb90p7cr.R.inc(7830);if ((((x.nans == INFINITE && nans == FINITE)&&(__CLR4_4_15ic5iclb90p7cr.R.iget(7831)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(7832)==0&false))) {{
                __CLR4_4_15ic5iclb90p7cr.R.inc(7833);return x;
            }

            }__CLR4_4_15ic5iclb90p7cr.R.inc(7834);if ((((x.nans == INFINITE && nans == INFINITE && sign == x.sign)&&(__CLR4_4_15ic5iclb90p7cr.R.iget(7835)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(7836)==0&false))) {{
                __CLR4_4_15ic5iclb90p7cr.R.inc(7837);return x;
            }

            }__CLR4_4_15ic5iclb90p7cr.R.inc(7838);if ((((x.nans == INFINITE && nans == INFINITE && sign != x.sign)&&(__CLR4_4_15ic5iclb90p7cr.R.iget(7839)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(7840)==0&false))) {{
                __CLR4_4_15ic5iclb90p7cr.R.inc(7841);field.setIEEEFlagsBits(DfpField.FLAG_INVALID);
                __CLR4_4_15ic5iclb90p7cr.R.inc(7842);Dfp result = newInstance(getZero());
                __CLR4_4_15ic5iclb90p7cr.R.inc(7843);result.nans = QNAN;
                __CLR4_4_15ic5iclb90p7cr.R.inc(7844);result = dotrap(DfpField.FLAG_INVALID, ADD_TRAP, x, result);
                __CLR4_4_15ic5iclb90p7cr.R.inc(7845);return result;
            }
        }}

        /* copy this and the arg */
        }__CLR4_4_15ic5iclb90p7cr.R.inc(7846);Dfp a = newInstance(this);
        __CLR4_4_15ic5iclb90p7cr.R.inc(7847);Dfp b = newInstance(x);

        /* initialize the result object */
        __CLR4_4_15ic5iclb90p7cr.R.inc(7848);Dfp result = newInstance(getZero());

        /* Make all numbers positive, but remember their sign */
        __CLR4_4_15ic5iclb90p7cr.R.inc(7849);final byte asign = a.sign;
        __CLR4_4_15ic5iclb90p7cr.R.inc(7850);final byte bsign = b.sign;

        __CLR4_4_15ic5iclb90p7cr.R.inc(7851);a.sign = 1;
        __CLR4_4_15ic5iclb90p7cr.R.inc(7852);b.sign = 1;

        /* The result will be signed like the arg with greatest magnitude */
        __CLR4_4_15ic5iclb90p7cr.R.inc(7853);byte rsign = bsign;
        __CLR4_4_15ic5iclb90p7cr.R.inc(7854);if ((((compare(a, b) > 0)&&(__CLR4_4_15ic5iclb90p7cr.R.iget(7855)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(7856)==0&false))) {{
            __CLR4_4_15ic5iclb90p7cr.R.inc(7857);rsign = asign;
        }

        /* Handle special case when a or b is zero, by setting the exponent
       of the zero number equal to the other one.  This avoids an alignment
       which would cause catastropic loss of precision */
        }__CLR4_4_15ic5iclb90p7cr.R.inc(7858);if ((((b.mant[mant.length-1] == 0)&&(__CLR4_4_15ic5iclb90p7cr.R.iget(7859)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(7860)==0&false))) {{
            __CLR4_4_15ic5iclb90p7cr.R.inc(7861);b.exp = a.exp;
        }

        }__CLR4_4_15ic5iclb90p7cr.R.inc(7862);if ((((a.mant[mant.length-1] == 0)&&(__CLR4_4_15ic5iclb90p7cr.R.iget(7863)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(7864)==0&false))) {{
            __CLR4_4_15ic5iclb90p7cr.R.inc(7865);a.exp = b.exp;
        }

        /* align number with the smaller exponent */
        }__CLR4_4_15ic5iclb90p7cr.R.inc(7866);int aextradigit = 0;
        __CLR4_4_15ic5iclb90p7cr.R.inc(7867);int bextradigit = 0;
        __CLR4_4_15ic5iclb90p7cr.R.inc(7868);if ((((a.exp < b.exp)&&(__CLR4_4_15ic5iclb90p7cr.R.iget(7869)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(7870)==0&false))) {{
            __CLR4_4_15ic5iclb90p7cr.R.inc(7871);aextradigit = a.align(b.exp);
        } }else {{
            __CLR4_4_15ic5iclb90p7cr.R.inc(7872);bextradigit = b.align(a.exp);
        }

        /* complement the smaller of the two if the signs are different */
        }__CLR4_4_15ic5iclb90p7cr.R.inc(7873);if ((((asign != bsign)&&(__CLR4_4_15ic5iclb90p7cr.R.iget(7874)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(7875)==0&false))) {{
            __CLR4_4_15ic5iclb90p7cr.R.inc(7876);if ((((asign == rsign)&&(__CLR4_4_15ic5iclb90p7cr.R.iget(7877)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(7878)==0&false))) {{
                __CLR4_4_15ic5iclb90p7cr.R.inc(7879);bextradigit = b.complement(bextradigit);
            } }else {{
                __CLR4_4_15ic5iclb90p7cr.R.inc(7880);aextradigit = a.complement(aextradigit);
            }
        }}

        /* add the mantissas */
        }__CLR4_4_15ic5iclb90p7cr.R.inc(7881);int rh = 0; /* acts as a carry */
        __CLR4_4_15ic5iclb90p7cr.R.inc(7882);for (int i = 0; (((i < mant.length)&&(__CLR4_4_15ic5iclb90p7cr.R.iget(7883)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(7884)==0&false)); i++) {{
            __CLR4_4_15ic5iclb90p7cr.R.inc(7885);final int r = a.mant[i]+b.mant[i]+rh;
            __CLR4_4_15ic5iclb90p7cr.R.inc(7886);rh = r / RADIX;
            __CLR4_4_15ic5iclb90p7cr.R.inc(7887);result.mant[i] = r - rh * RADIX;
        }
        }__CLR4_4_15ic5iclb90p7cr.R.inc(7888);result.exp = a.exp;
        __CLR4_4_15ic5iclb90p7cr.R.inc(7889);result.sign = rsign;

        /* handle overflow -- note, when asign!=bsign an overflow is
         * normal and should be ignored.  */

        __CLR4_4_15ic5iclb90p7cr.R.inc(7890);if ((((rh != 0 && (asign == bsign))&&(__CLR4_4_15ic5iclb90p7cr.R.iget(7891)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(7892)==0&false))) {{
            __CLR4_4_15ic5iclb90p7cr.R.inc(7893);final int lostdigit = result.mant[0];
            __CLR4_4_15ic5iclb90p7cr.R.inc(7894);result.shiftRight();
            __CLR4_4_15ic5iclb90p7cr.R.inc(7895);result.mant[mant.length-1] = rh;
            __CLR4_4_15ic5iclb90p7cr.R.inc(7896);final int excp = result.round(lostdigit);
            __CLR4_4_15ic5iclb90p7cr.R.inc(7897);if ((((excp != 0)&&(__CLR4_4_15ic5iclb90p7cr.R.iget(7898)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(7899)==0&false))) {{
                __CLR4_4_15ic5iclb90p7cr.R.inc(7900);result = dotrap(excp, ADD_TRAP, x, result);
            }
        }}

        /* normalize the result */
        }__CLR4_4_15ic5iclb90p7cr.R.inc(7901);for (int i = 0; (((i < mant.length)&&(__CLR4_4_15ic5iclb90p7cr.R.iget(7902)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(7903)==0&false)); i++) {{
            __CLR4_4_15ic5iclb90p7cr.R.inc(7904);if ((((result.mant[mant.length-1] != 0)&&(__CLR4_4_15ic5iclb90p7cr.R.iget(7905)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(7906)==0&false))) {{
                __CLR4_4_15ic5iclb90p7cr.R.inc(7907);break;
            }
            }__CLR4_4_15ic5iclb90p7cr.R.inc(7908);result.shiftLeft();
            __CLR4_4_15ic5iclb90p7cr.R.inc(7909);if ((((i == 0)&&(__CLR4_4_15ic5iclb90p7cr.R.iget(7910)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(7911)==0&false))) {{
                __CLR4_4_15ic5iclb90p7cr.R.inc(7912);result.mant[0] = aextradigit+bextradigit;
                __CLR4_4_15ic5iclb90p7cr.R.inc(7913);aextradigit = 0;
                __CLR4_4_15ic5iclb90p7cr.R.inc(7914);bextradigit = 0;
            }
        }}

        /* result is zero if after normalization the most sig. digit is zero */
        }__CLR4_4_15ic5iclb90p7cr.R.inc(7915);if ((((result.mant[mant.length-1] == 0)&&(__CLR4_4_15ic5iclb90p7cr.R.iget(7916)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(7917)==0&false))) {{
            __CLR4_4_15ic5iclb90p7cr.R.inc(7918);result.exp = 0;

            __CLR4_4_15ic5iclb90p7cr.R.inc(7919);if ((((asign != bsign)&&(__CLR4_4_15ic5iclb90p7cr.R.iget(7920)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(7921)==0&false))) {{
                // Unless adding 2 negative zeros, sign is positive
                __CLR4_4_15ic5iclb90p7cr.R.inc(7922);result.sign = 1;  // Per IEEE 854-1987 Section 6.3
            }
        }}

        /* Call round to test for over/under flows */
        }__CLR4_4_15ic5iclb90p7cr.R.inc(7923);final int excp = result.round(aextradigit + bextradigit);
        __CLR4_4_15ic5iclb90p7cr.R.inc(7924);if ((((excp != 0)&&(__CLR4_4_15ic5iclb90p7cr.R.iget(7925)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(7926)==0&false))) {{
            __CLR4_4_15ic5iclb90p7cr.R.inc(7927);result = dotrap(excp, ADD_TRAP, x, result);
        }

        }__CLR4_4_15ic5iclb90p7cr.R.inc(7928);return result;
    }finally{__CLR4_4_15ic5iclb90p7cr.R.flushNeeded();}}

    /** Returns a number that is this number with the sign bit reversed.
     * @return the opposite of this
     */
    public Dfp negate() {try{__CLR4_4_15ic5iclb90p7cr.R.inc(7929);
        __CLR4_4_15ic5iclb90p7cr.R.inc(7930);Dfp result = newInstance(this);
        __CLR4_4_15ic5iclb90p7cr.R.inc(7931);result.sign = (byte) - result.sign;
        __CLR4_4_15ic5iclb90p7cr.R.inc(7932);return result;
    }finally{__CLR4_4_15ic5iclb90p7cr.R.flushNeeded();}}

    /** Subtract x from this.
     * @param x number to subtract
     * @return difference of this and a
     */
    public Dfp subtract(final Dfp x) {try{__CLR4_4_15ic5iclb90p7cr.R.inc(7933);
        __CLR4_4_15ic5iclb90p7cr.R.inc(7934);return add(x.negate());
    }finally{__CLR4_4_15ic5iclb90p7cr.R.flushNeeded();}}

    /** Round this given the next digit n using the current rounding mode.
     * @param n ???
     * @return the IEEE flag if an exception occurred
     */
    protected int round(int n) {try{__CLR4_4_15ic5iclb90p7cr.R.inc(7935);
        __CLR4_4_15ic5iclb90p7cr.R.inc(7936);boolean inc = false;
        boolean __CLB4_4_1_bool2=false;__CLR4_4_15ic5iclb90p7cr.R.inc(7937);switch (field.getRoundingMode()) {
            case ROUND_DOWN:if (!__CLB4_4_1_bool2) {__CLR4_4_15ic5iclb90p7cr.R.inc(7938);__CLB4_4_1_bool2=true;}
                __CLR4_4_15ic5iclb90p7cr.R.inc(7939);inc = false;
                __CLR4_4_15ic5iclb90p7cr.R.inc(7940);break;

            case ROUND_UP:if (!__CLB4_4_1_bool2) {__CLR4_4_15ic5iclb90p7cr.R.inc(7941);__CLB4_4_1_bool2=true;}
                __CLR4_4_15ic5iclb90p7cr.R.inc(7942);inc = n != 0;       // round up if n!=0
                __CLR4_4_15ic5iclb90p7cr.R.inc(7943);break;

            case ROUND_HALF_UP:if (!__CLB4_4_1_bool2) {__CLR4_4_15ic5iclb90p7cr.R.inc(7944);__CLB4_4_1_bool2=true;}
                __CLR4_4_15ic5iclb90p7cr.R.inc(7945);inc = n >= 5000;  // round half up
                __CLR4_4_15ic5iclb90p7cr.R.inc(7946);break;

            case ROUND_HALF_DOWN:if (!__CLB4_4_1_bool2) {__CLR4_4_15ic5iclb90p7cr.R.inc(7947);__CLB4_4_1_bool2=true;}
                __CLR4_4_15ic5iclb90p7cr.R.inc(7948);inc = n > 5000;  // round half down
                __CLR4_4_15ic5iclb90p7cr.R.inc(7949);break;

            case ROUND_HALF_EVEN:if (!__CLB4_4_1_bool2) {__CLR4_4_15ic5iclb90p7cr.R.inc(7950);__CLB4_4_1_bool2=true;}
                __CLR4_4_15ic5iclb90p7cr.R.inc(7951);inc = n > 5000 || (n == 5000 && (mant[0] & 1) == 1);  // round half-even
                __CLR4_4_15ic5iclb90p7cr.R.inc(7952);break;

            case ROUND_HALF_ODD:if (!__CLB4_4_1_bool2) {__CLR4_4_15ic5iclb90p7cr.R.inc(7953);__CLB4_4_1_bool2=true;}
                __CLR4_4_15ic5iclb90p7cr.R.inc(7954);inc = n > 5000 || (n == 5000 && (mant[0] & 1) == 0);  // round half-odd
                __CLR4_4_15ic5iclb90p7cr.R.inc(7955);break;

            case ROUND_CEIL:if (!__CLB4_4_1_bool2) {__CLR4_4_15ic5iclb90p7cr.R.inc(7956);__CLB4_4_1_bool2=true;}
                __CLR4_4_15ic5iclb90p7cr.R.inc(7957);inc = sign == 1 && n != 0;  // round ceil
                __CLR4_4_15ic5iclb90p7cr.R.inc(7958);break;

            case ROUND_FLOOR:if (!__CLB4_4_1_bool2) {__CLR4_4_15ic5iclb90p7cr.R.inc(7959);__CLB4_4_1_bool2=true;}
            default:if (!__CLB4_4_1_bool2) {__CLR4_4_15ic5iclb90p7cr.R.inc(7960);__CLB4_4_1_bool2=true;}
                __CLR4_4_15ic5iclb90p7cr.R.inc(7961);inc = sign == -1 && n != 0;  // round floor
                __CLR4_4_15ic5iclb90p7cr.R.inc(7962);break;
        }

        __CLR4_4_15ic5iclb90p7cr.R.inc(7963);if ((((inc)&&(__CLR4_4_15ic5iclb90p7cr.R.iget(7964)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(7965)==0&false))) {{
            // increment if necessary
            __CLR4_4_15ic5iclb90p7cr.R.inc(7966);int rh = 1;
            __CLR4_4_15ic5iclb90p7cr.R.inc(7967);for (int i = 0; (((i < mant.length)&&(__CLR4_4_15ic5iclb90p7cr.R.iget(7968)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(7969)==0&false)); i++) {{
                __CLR4_4_15ic5iclb90p7cr.R.inc(7970);final int r = mant[i] + rh;
                __CLR4_4_15ic5iclb90p7cr.R.inc(7971);rh = r / RADIX;
                __CLR4_4_15ic5iclb90p7cr.R.inc(7972);mant[i] = r - rh * RADIX;
            }

            }__CLR4_4_15ic5iclb90p7cr.R.inc(7973);if ((((rh != 0)&&(__CLR4_4_15ic5iclb90p7cr.R.iget(7974)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(7975)==0&false))) {{
                __CLR4_4_15ic5iclb90p7cr.R.inc(7976);shiftRight();
                __CLR4_4_15ic5iclb90p7cr.R.inc(7977);mant[mant.length-1] = rh;
            }
        }}

        // check for exceptional cases and raise signals if necessary
        }__CLR4_4_15ic5iclb90p7cr.R.inc(7978);if ((((exp < MIN_EXP)&&(__CLR4_4_15ic5iclb90p7cr.R.iget(7979)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(7980)==0&false))) {{
            // Gradual Underflow
            __CLR4_4_15ic5iclb90p7cr.R.inc(7981);field.setIEEEFlagsBits(DfpField.FLAG_UNDERFLOW);
            __CLR4_4_15ic5iclb90p7cr.R.inc(7982);return DfpField.FLAG_UNDERFLOW;
        }

        }__CLR4_4_15ic5iclb90p7cr.R.inc(7983);if ((((exp > MAX_EXP)&&(__CLR4_4_15ic5iclb90p7cr.R.iget(7984)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(7985)==0&false))) {{
            // Overflow
            __CLR4_4_15ic5iclb90p7cr.R.inc(7986);field.setIEEEFlagsBits(DfpField.FLAG_OVERFLOW);
            __CLR4_4_15ic5iclb90p7cr.R.inc(7987);return DfpField.FLAG_OVERFLOW;
        }

        }__CLR4_4_15ic5iclb90p7cr.R.inc(7988);if ((((n != 0)&&(__CLR4_4_15ic5iclb90p7cr.R.iget(7989)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(7990)==0&false))) {{
            // Inexact
            __CLR4_4_15ic5iclb90p7cr.R.inc(7991);field.setIEEEFlagsBits(DfpField.FLAG_INEXACT);
            __CLR4_4_15ic5iclb90p7cr.R.inc(7992);return DfpField.FLAG_INEXACT;
        }

        }__CLR4_4_15ic5iclb90p7cr.R.inc(7993);return 0;

    }finally{__CLR4_4_15ic5iclb90p7cr.R.flushNeeded();}}

    /** Multiply this by x.
     * @param x multiplicand
     * @return product of this and x
     */
    public Dfp multiply(final Dfp x) {try{__CLR4_4_15ic5iclb90p7cr.R.inc(7994);

        // make sure we don't mix number with different precision
        __CLR4_4_15ic5iclb90p7cr.R.inc(7995);if ((((field.getRadixDigits() != x.field.getRadixDigits())&&(__CLR4_4_15ic5iclb90p7cr.R.iget(7996)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(7997)==0&false))) {{
            __CLR4_4_15ic5iclb90p7cr.R.inc(7998);field.setIEEEFlagsBits(DfpField.FLAG_INVALID);
            __CLR4_4_15ic5iclb90p7cr.R.inc(7999);final Dfp result = newInstance(getZero());
            __CLR4_4_15ic5iclb90p7cr.R.inc(8000);result.nans = QNAN;
            __CLR4_4_15ic5iclb90p7cr.R.inc(8001);return dotrap(DfpField.FLAG_INVALID, MULTIPLY_TRAP, x, result);
        }

        }__CLR4_4_15ic5iclb90p7cr.R.inc(8002);Dfp result = newInstance(getZero());

        /* handle special cases */
        __CLR4_4_15ic5iclb90p7cr.R.inc(8003);if ((((nans != FINITE || x.nans != FINITE)&&(__CLR4_4_15ic5iclb90p7cr.R.iget(8004)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(8005)==0&false))) {{
            __CLR4_4_15ic5iclb90p7cr.R.inc(8006);if ((((isNaN())&&(__CLR4_4_15ic5iclb90p7cr.R.iget(8007)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(8008)==0&false))) {{
                __CLR4_4_15ic5iclb90p7cr.R.inc(8009);return this;
            }

            }__CLR4_4_15ic5iclb90p7cr.R.inc(8010);if ((((x.isNaN())&&(__CLR4_4_15ic5iclb90p7cr.R.iget(8011)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(8012)==0&false))) {{
                __CLR4_4_15ic5iclb90p7cr.R.inc(8013);return x;
            }

            }__CLR4_4_15ic5iclb90p7cr.R.inc(8014);if ((((nans == INFINITE && x.nans == FINITE && x.mant[mant.length-1] != 0)&&(__CLR4_4_15ic5iclb90p7cr.R.iget(8015)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(8016)==0&false))) {{
                __CLR4_4_15ic5iclb90p7cr.R.inc(8017);result = newInstance(this);
                __CLR4_4_15ic5iclb90p7cr.R.inc(8018);result.sign = (byte) (sign * x.sign);
                __CLR4_4_15ic5iclb90p7cr.R.inc(8019);return result;
            }

            }__CLR4_4_15ic5iclb90p7cr.R.inc(8020);if ((((x.nans == INFINITE && nans == FINITE && mant[mant.length-1] != 0)&&(__CLR4_4_15ic5iclb90p7cr.R.iget(8021)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(8022)==0&false))) {{
                __CLR4_4_15ic5iclb90p7cr.R.inc(8023);result = newInstance(x);
                __CLR4_4_15ic5iclb90p7cr.R.inc(8024);result.sign = (byte) (sign * x.sign);
                __CLR4_4_15ic5iclb90p7cr.R.inc(8025);return result;
            }

            }__CLR4_4_15ic5iclb90p7cr.R.inc(8026);if ((((x.nans == INFINITE && nans == INFINITE)&&(__CLR4_4_15ic5iclb90p7cr.R.iget(8027)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(8028)==0&false))) {{
                __CLR4_4_15ic5iclb90p7cr.R.inc(8029);result = newInstance(this);
                __CLR4_4_15ic5iclb90p7cr.R.inc(8030);result.sign = (byte) (sign * x.sign);
                __CLR4_4_15ic5iclb90p7cr.R.inc(8031);return result;
            }

            }__CLR4_4_15ic5iclb90p7cr.R.inc(8032);if ( ((((x.nans == INFINITE && nans == FINITE && mant[mant.length-1] == 0) ||
                    (nans == INFINITE && x.nans == FINITE && x.mant[mant.length-1] == 0) )&&(__CLR4_4_15ic5iclb90p7cr.R.iget(8033)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(8034)==0&false))) {{
                __CLR4_4_15ic5iclb90p7cr.R.inc(8035);field.setIEEEFlagsBits(DfpField.FLAG_INVALID);
                __CLR4_4_15ic5iclb90p7cr.R.inc(8036);result = newInstance(getZero());
                __CLR4_4_15ic5iclb90p7cr.R.inc(8037);result.nans = QNAN;
                __CLR4_4_15ic5iclb90p7cr.R.inc(8038);result = dotrap(DfpField.FLAG_INVALID, MULTIPLY_TRAP, x, result);
                __CLR4_4_15ic5iclb90p7cr.R.inc(8039);return result;
            }
        }}

        }__CLR4_4_15ic5iclb90p7cr.R.inc(8040);int[] product = new int[mant.length*2];  // Big enough to hold even the largest result

        __CLR4_4_15ic5iclb90p7cr.R.inc(8041);for (int i = 0; (((i < mant.length)&&(__CLR4_4_15ic5iclb90p7cr.R.iget(8042)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(8043)==0&false)); i++) {{
            __CLR4_4_15ic5iclb90p7cr.R.inc(8044);int rh = 0;  // acts as a carry
            __CLR4_4_15ic5iclb90p7cr.R.inc(8045);for (int j=0; (((j<mant.length)&&(__CLR4_4_15ic5iclb90p7cr.R.iget(8046)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(8047)==0&false)); j++) {{
                __CLR4_4_15ic5iclb90p7cr.R.inc(8048);int r = mant[i] * x.mant[j];    // multiply the 2 digits
                __CLR4_4_15ic5iclb90p7cr.R.inc(8049);r = r + product[i+j] + rh;  // add to the product digit with carry in

                __CLR4_4_15ic5iclb90p7cr.R.inc(8050);rh = r / RADIX;
                __CLR4_4_15ic5iclb90p7cr.R.inc(8051);product[i+j] = r - rh * RADIX;
            }
            }__CLR4_4_15ic5iclb90p7cr.R.inc(8052);product[i+mant.length] = rh;
        }

        // Find the most sig digit
        }__CLR4_4_15ic5iclb90p7cr.R.inc(8053);int md = mant.length * 2 - 1;  // default, in case result is zero
        __CLR4_4_15ic5iclb90p7cr.R.inc(8054);for (int i = mant.length * 2 - 1; (((i >= 0)&&(__CLR4_4_15ic5iclb90p7cr.R.iget(8055)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(8056)==0&false)); i--) {{
            __CLR4_4_15ic5iclb90p7cr.R.inc(8057);if ((((product[i] != 0)&&(__CLR4_4_15ic5iclb90p7cr.R.iget(8058)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(8059)==0&false))) {{
                __CLR4_4_15ic5iclb90p7cr.R.inc(8060);md = i;
                __CLR4_4_15ic5iclb90p7cr.R.inc(8061);break;
            }
        }}

        // Copy the digits into the result
        }__CLR4_4_15ic5iclb90p7cr.R.inc(8062);for (int i = 0; (((i < mant.length)&&(__CLR4_4_15ic5iclb90p7cr.R.iget(8063)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(8064)==0&false)); i++) {{
            __CLR4_4_15ic5iclb90p7cr.R.inc(8065);result.mant[mant.length - i - 1] = product[md - i];
        }

        // Fixup the exponent.
        }__CLR4_4_15ic5iclb90p7cr.R.inc(8066);result.exp = exp + x.exp + md - 2 * mant.length + 1;
        __CLR4_4_15ic5iclb90p7cr.R.inc(8067);result.sign = (byte)(((((sign == x.sign))&&(__CLR4_4_15ic5iclb90p7cr.R.iget(8068)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(8069)==0&false))?1:-1);

        __CLR4_4_15ic5iclb90p7cr.R.inc(8070);if ((((result.mant[mant.length-1] == 0)&&(__CLR4_4_15ic5iclb90p7cr.R.iget(8071)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(8072)==0&false))) {{
            // if result is zero, set exp to zero
            __CLR4_4_15ic5iclb90p7cr.R.inc(8073);result.exp = 0;
        }

        }__CLR4_4_15ic5iclb90p7cr.R.inc(8074);final int excp;
        __CLR4_4_15ic5iclb90p7cr.R.inc(8075);if ((((md > (mant.length-1))&&(__CLR4_4_15ic5iclb90p7cr.R.iget(8076)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(8077)==0&false))) {{
            __CLR4_4_15ic5iclb90p7cr.R.inc(8078);excp = result.round(product[md-mant.length]);
        } }else {{
            __CLR4_4_15ic5iclb90p7cr.R.inc(8079);excp = result.round(0); // has no effect except to check status
        }

        }__CLR4_4_15ic5iclb90p7cr.R.inc(8080);if ((((excp != 0)&&(__CLR4_4_15ic5iclb90p7cr.R.iget(8081)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(8082)==0&false))) {{
            __CLR4_4_15ic5iclb90p7cr.R.inc(8083);result = dotrap(excp, MULTIPLY_TRAP, x, result);
        }

        }__CLR4_4_15ic5iclb90p7cr.R.inc(8084);return result;

    }finally{__CLR4_4_15ic5iclb90p7cr.R.flushNeeded();}}

    /** Multiply this by a single digit x.
     * @param x multiplicand
     * @return product of this and x
     */
    public Dfp multiply(final int x) {try{__CLR4_4_15ic5iclb90p7cr.R.inc(8085);
        __CLR4_4_15ic5iclb90p7cr.R.inc(8086);if ((((x >= 0 && x < RADIX)&&(__CLR4_4_15ic5iclb90p7cr.R.iget(8087)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(8088)==0&false))) {{
            __CLR4_4_15ic5iclb90p7cr.R.inc(8089);return multiplyFast(x);
        } }else {{
            __CLR4_4_15ic5iclb90p7cr.R.inc(8090);return multiply(newInstance(x));
        }
    }}finally{__CLR4_4_15ic5iclb90p7cr.R.flushNeeded();}}

    /** Multiply this by a single digit 0&lt;=x&lt;radix.
     * There are speed advantages in this special case.
     * @param x multiplicand
     * @return product of this and x
     */
    private Dfp multiplyFast(final int x) {try{__CLR4_4_15ic5iclb90p7cr.R.inc(8091);
        __CLR4_4_15ic5iclb90p7cr.R.inc(8092);Dfp result = newInstance(this);

        /* handle special cases */
        __CLR4_4_15ic5iclb90p7cr.R.inc(8093);if ((((nans != FINITE)&&(__CLR4_4_15ic5iclb90p7cr.R.iget(8094)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(8095)==0&false))) {{
            __CLR4_4_15ic5iclb90p7cr.R.inc(8096);if ((((isNaN())&&(__CLR4_4_15ic5iclb90p7cr.R.iget(8097)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(8098)==0&false))) {{
                __CLR4_4_15ic5iclb90p7cr.R.inc(8099);return this;
            }

            }__CLR4_4_15ic5iclb90p7cr.R.inc(8100);if ((((nans == INFINITE && x != 0)&&(__CLR4_4_15ic5iclb90p7cr.R.iget(8101)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(8102)==0&false))) {{
                __CLR4_4_15ic5iclb90p7cr.R.inc(8103);result = newInstance(this);
                __CLR4_4_15ic5iclb90p7cr.R.inc(8104);return result;
            }

            }__CLR4_4_15ic5iclb90p7cr.R.inc(8105);if ((((nans == INFINITE && x == 0)&&(__CLR4_4_15ic5iclb90p7cr.R.iget(8106)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(8107)==0&false))) {{
                __CLR4_4_15ic5iclb90p7cr.R.inc(8108);field.setIEEEFlagsBits(DfpField.FLAG_INVALID);
                __CLR4_4_15ic5iclb90p7cr.R.inc(8109);result = newInstance(getZero());
                __CLR4_4_15ic5iclb90p7cr.R.inc(8110);result.nans = QNAN;
                __CLR4_4_15ic5iclb90p7cr.R.inc(8111);result = dotrap(DfpField.FLAG_INVALID, MULTIPLY_TRAP, newInstance(getZero()), result);
                __CLR4_4_15ic5iclb90p7cr.R.inc(8112);return result;
            }
        }}

        /* range check x */
        }__CLR4_4_15ic5iclb90p7cr.R.inc(8113);if ((((x < 0 || x >= RADIX)&&(__CLR4_4_15ic5iclb90p7cr.R.iget(8114)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(8115)==0&false))) {{
            __CLR4_4_15ic5iclb90p7cr.R.inc(8116);field.setIEEEFlagsBits(DfpField.FLAG_INVALID);
            __CLR4_4_15ic5iclb90p7cr.R.inc(8117);result = newInstance(getZero());
            __CLR4_4_15ic5iclb90p7cr.R.inc(8118);result.nans = QNAN;
            __CLR4_4_15ic5iclb90p7cr.R.inc(8119);result = dotrap(DfpField.FLAG_INVALID, MULTIPLY_TRAP, result, result);
            __CLR4_4_15ic5iclb90p7cr.R.inc(8120);return result;
        }

        }__CLR4_4_15ic5iclb90p7cr.R.inc(8121);int rh = 0;
        __CLR4_4_15ic5iclb90p7cr.R.inc(8122);for (int i = 0; (((i < mant.length)&&(__CLR4_4_15ic5iclb90p7cr.R.iget(8123)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(8124)==0&false)); i++) {{
            __CLR4_4_15ic5iclb90p7cr.R.inc(8125);final int r = mant[i] * x + rh;
            __CLR4_4_15ic5iclb90p7cr.R.inc(8126);rh = r / RADIX;
            __CLR4_4_15ic5iclb90p7cr.R.inc(8127);result.mant[i] = r - rh * RADIX;
        }

        }__CLR4_4_15ic5iclb90p7cr.R.inc(8128);int lostdigit = 0;
        __CLR4_4_15ic5iclb90p7cr.R.inc(8129);if ((((rh != 0)&&(__CLR4_4_15ic5iclb90p7cr.R.iget(8130)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(8131)==0&false))) {{
            __CLR4_4_15ic5iclb90p7cr.R.inc(8132);lostdigit = result.mant[0];
            __CLR4_4_15ic5iclb90p7cr.R.inc(8133);result.shiftRight();
            __CLR4_4_15ic5iclb90p7cr.R.inc(8134);result.mant[mant.length-1] = rh;
        }

        }__CLR4_4_15ic5iclb90p7cr.R.inc(8135);if ((((result.mant[mant.length-1] == 0)&&(__CLR4_4_15ic5iclb90p7cr.R.iget(8136)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(8137)==0&false))) {{ // if result is zero, set exp to zero
            __CLR4_4_15ic5iclb90p7cr.R.inc(8138);result.exp = 0;
        }

        }__CLR4_4_15ic5iclb90p7cr.R.inc(8139);final int excp = result.round(lostdigit);
        __CLR4_4_15ic5iclb90p7cr.R.inc(8140);if ((((excp != 0)&&(__CLR4_4_15ic5iclb90p7cr.R.iget(8141)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(8142)==0&false))) {{
            __CLR4_4_15ic5iclb90p7cr.R.inc(8143);result = dotrap(excp, MULTIPLY_TRAP, result, result);
        }

        }__CLR4_4_15ic5iclb90p7cr.R.inc(8144);return result;
    }finally{__CLR4_4_15ic5iclb90p7cr.R.flushNeeded();}}

    /** Divide this by divisor.
     * @param divisor divisor
     * @return quotient of this by divisor
     */
    public Dfp divide(Dfp divisor) {try{__CLR4_4_15ic5iclb90p7cr.R.inc(8145);
        __CLR4_4_15ic5iclb90p7cr.R.inc(8146);int dividend[]; // current status of the dividend
        __CLR4_4_15ic5iclb90p7cr.R.inc(8147);int quotient[]; // quotient
        __CLR4_4_15ic5iclb90p7cr.R.inc(8148);int remainder[];// remainder
        __CLR4_4_15ic5iclb90p7cr.R.inc(8149);int qd;         // current quotient digit we're working with
        __CLR4_4_15ic5iclb90p7cr.R.inc(8150);int nsqd;       // number of significant quotient digits we have
        __CLR4_4_15ic5iclb90p7cr.R.inc(8151);int trial=0;    // trial quotient digit
        __CLR4_4_15ic5iclb90p7cr.R.inc(8152);int minadj;     // minimum adjustment
        __CLR4_4_15ic5iclb90p7cr.R.inc(8153);boolean trialgood; // Flag to indicate a good trail digit
        __CLR4_4_15ic5iclb90p7cr.R.inc(8154);int md=0;       // most sig digit in result
        __CLR4_4_15ic5iclb90p7cr.R.inc(8155);int excp;       // exceptions

        // make sure we don't mix number with different precision
        __CLR4_4_15ic5iclb90p7cr.R.inc(8156);if ((((field.getRadixDigits() != divisor.field.getRadixDigits())&&(__CLR4_4_15ic5iclb90p7cr.R.iget(8157)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(8158)==0&false))) {{
            __CLR4_4_15ic5iclb90p7cr.R.inc(8159);field.setIEEEFlagsBits(DfpField.FLAG_INVALID);
            __CLR4_4_15ic5iclb90p7cr.R.inc(8160);final Dfp result = newInstance(getZero());
            __CLR4_4_15ic5iclb90p7cr.R.inc(8161);result.nans = QNAN;
            __CLR4_4_15ic5iclb90p7cr.R.inc(8162);return dotrap(DfpField.FLAG_INVALID, DIVIDE_TRAP, divisor, result);
        }

        }__CLR4_4_15ic5iclb90p7cr.R.inc(8163);Dfp result = newInstance(getZero());

        /* handle special cases */
        __CLR4_4_15ic5iclb90p7cr.R.inc(8164);if ((((nans != FINITE || divisor.nans != FINITE)&&(__CLR4_4_15ic5iclb90p7cr.R.iget(8165)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(8166)==0&false))) {{
            __CLR4_4_15ic5iclb90p7cr.R.inc(8167);if ((((isNaN())&&(__CLR4_4_15ic5iclb90p7cr.R.iget(8168)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(8169)==0&false))) {{
                __CLR4_4_15ic5iclb90p7cr.R.inc(8170);return this;
            }

            }__CLR4_4_15ic5iclb90p7cr.R.inc(8171);if ((((divisor.isNaN())&&(__CLR4_4_15ic5iclb90p7cr.R.iget(8172)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(8173)==0&false))) {{
                __CLR4_4_15ic5iclb90p7cr.R.inc(8174);return divisor;
            }

            }__CLR4_4_15ic5iclb90p7cr.R.inc(8175);if ((((nans == INFINITE && divisor.nans == FINITE)&&(__CLR4_4_15ic5iclb90p7cr.R.iget(8176)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(8177)==0&false))) {{
                __CLR4_4_15ic5iclb90p7cr.R.inc(8178);result = newInstance(this);
                __CLR4_4_15ic5iclb90p7cr.R.inc(8179);result.sign = (byte) (sign * divisor.sign);
                __CLR4_4_15ic5iclb90p7cr.R.inc(8180);return result;
            }

            }__CLR4_4_15ic5iclb90p7cr.R.inc(8181);if ((((divisor.nans == INFINITE && nans == FINITE)&&(__CLR4_4_15ic5iclb90p7cr.R.iget(8182)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(8183)==0&false))) {{
                __CLR4_4_15ic5iclb90p7cr.R.inc(8184);result = newInstance(getZero());
                __CLR4_4_15ic5iclb90p7cr.R.inc(8185);result.sign = (byte) (sign * divisor.sign);
                __CLR4_4_15ic5iclb90p7cr.R.inc(8186);return result;
            }

            }__CLR4_4_15ic5iclb90p7cr.R.inc(8187);if ((((divisor.nans == INFINITE && nans == INFINITE)&&(__CLR4_4_15ic5iclb90p7cr.R.iget(8188)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(8189)==0&false))) {{
                __CLR4_4_15ic5iclb90p7cr.R.inc(8190);field.setIEEEFlagsBits(DfpField.FLAG_INVALID);
                __CLR4_4_15ic5iclb90p7cr.R.inc(8191);result = newInstance(getZero());
                __CLR4_4_15ic5iclb90p7cr.R.inc(8192);result.nans = QNAN;
                __CLR4_4_15ic5iclb90p7cr.R.inc(8193);result = dotrap(DfpField.FLAG_INVALID, DIVIDE_TRAP, divisor, result);
                __CLR4_4_15ic5iclb90p7cr.R.inc(8194);return result;
            }
        }}

        /* Test for divide by zero */
        }__CLR4_4_15ic5iclb90p7cr.R.inc(8195);if ((((divisor.mant[mant.length-1] == 0)&&(__CLR4_4_15ic5iclb90p7cr.R.iget(8196)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(8197)==0&false))) {{
            __CLR4_4_15ic5iclb90p7cr.R.inc(8198);field.setIEEEFlagsBits(DfpField.FLAG_DIV_ZERO);
            __CLR4_4_15ic5iclb90p7cr.R.inc(8199);result = newInstance(getZero());
            __CLR4_4_15ic5iclb90p7cr.R.inc(8200);result.sign = (byte) (sign * divisor.sign);
            __CLR4_4_15ic5iclb90p7cr.R.inc(8201);result.nans = INFINITE;
            __CLR4_4_15ic5iclb90p7cr.R.inc(8202);result = dotrap(DfpField.FLAG_DIV_ZERO, DIVIDE_TRAP, divisor, result);
            __CLR4_4_15ic5iclb90p7cr.R.inc(8203);return result;
        }

        }__CLR4_4_15ic5iclb90p7cr.R.inc(8204);dividend = new int[mant.length+1];  // one extra digit needed
        __CLR4_4_15ic5iclb90p7cr.R.inc(8205);quotient = new int[mant.length+2];  // two extra digits needed 1 for overflow, 1 for rounding
        __CLR4_4_15ic5iclb90p7cr.R.inc(8206);remainder = new int[mant.length+1]; // one extra digit needed

        /* Initialize our most significant digits to zero */

        __CLR4_4_15ic5iclb90p7cr.R.inc(8207);dividend[mant.length] = 0;
        __CLR4_4_15ic5iclb90p7cr.R.inc(8208);quotient[mant.length] = 0;
        __CLR4_4_15ic5iclb90p7cr.R.inc(8209);quotient[mant.length+1] = 0;
        __CLR4_4_15ic5iclb90p7cr.R.inc(8210);remainder[mant.length] = 0;

        /* copy our mantissa into the dividend, initialize the
       quotient while we are at it */

        __CLR4_4_15ic5iclb90p7cr.R.inc(8211);for (int i = 0; (((i < mant.length)&&(__CLR4_4_15ic5iclb90p7cr.R.iget(8212)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(8213)==0&false)); i++) {{
            __CLR4_4_15ic5iclb90p7cr.R.inc(8214);dividend[i] = mant[i];
            __CLR4_4_15ic5iclb90p7cr.R.inc(8215);quotient[i] = 0;
            __CLR4_4_15ic5iclb90p7cr.R.inc(8216);remainder[i] = 0;
        }

        /* outer loop.  Once per quotient digit */
        }__CLR4_4_15ic5iclb90p7cr.R.inc(8217);nsqd = 0;
        __CLR4_4_15ic5iclb90p7cr.R.inc(8218);for (qd = mant.length+1; (((qd >= 0)&&(__CLR4_4_15ic5iclb90p7cr.R.iget(8219)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(8220)==0&false)); qd--) {{
            /* Determine outer limits of our quotient digit */

            // r =  most sig 2 digits of dividend
            __CLR4_4_15ic5iclb90p7cr.R.inc(8221);final int divMsb = dividend[mant.length]*RADIX+dividend[mant.length-1];
            __CLR4_4_15ic5iclb90p7cr.R.inc(8222);int min = divMsb       / (divisor.mant[mant.length-1]+1);
            __CLR4_4_15ic5iclb90p7cr.R.inc(8223);int max = (divMsb + 1) / divisor.mant[mant.length-1];

            __CLR4_4_15ic5iclb90p7cr.R.inc(8224);trialgood = false;
            __CLR4_4_15ic5iclb90p7cr.R.inc(8225);while ((((!trialgood)&&(__CLR4_4_15ic5iclb90p7cr.R.iget(8226)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(8227)==0&false))) {{
                // try the mean
                __CLR4_4_15ic5iclb90p7cr.R.inc(8228);trial = (min+max)/2;

                /* Multiply by divisor and store as remainder */
                __CLR4_4_15ic5iclb90p7cr.R.inc(8229);int rh = 0;
                __CLR4_4_15ic5iclb90p7cr.R.inc(8230);for (int i = 0; (((i < mant.length + 1)&&(__CLR4_4_15ic5iclb90p7cr.R.iget(8231)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(8232)==0&false)); i++) {{
                    __CLR4_4_15ic5iclb90p7cr.R.inc(8233);int dm = ((((i<mant.length))&&(__CLR4_4_15ic5iclb90p7cr.R.iget(8234)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(8235)==0&false))?divisor.mant[i]:0;
                    __CLR4_4_15ic5iclb90p7cr.R.inc(8236);final int r = (dm * trial) + rh;
                    __CLR4_4_15ic5iclb90p7cr.R.inc(8237);rh = r / RADIX;
                    __CLR4_4_15ic5iclb90p7cr.R.inc(8238);remainder[i] = r - rh * RADIX;
                }

                /* subtract the remainder from the dividend */
                }__CLR4_4_15ic5iclb90p7cr.R.inc(8239);rh = 1;  // carry in to aid the subtraction
                __CLR4_4_15ic5iclb90p7cr.R.inc(8240);for (int i = 0; (((i < mant.length + 1)&&(__CLR4_4_15ic5iclb90p7cr.R.iget(8241)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(8242)==0&false)); i++) {{
                    __CLR4_4_15ic5iclb90p7cr.R.inc(8243);final int r = ((RADIX-1) - remainder[i]) + dividend[i] + rh;
                    __CLR4_4_15ic5iclb90p7cr.R.inc(8244);rh = r / RADIX;
                    __CLR4_4_15ic5iclb90p7cr.R.inc(8245);remainder[i] = r - rh * RADIX;
                }

                /* Lets analyze what we have here */
                }__CLR4_4_15ic5iclb90p7cr.R.inc(8246);if ((((rh == 0)&&(__CLR4_4_15ic5iclb90p7cr.R.iget(8247)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(8248)==0&false))) {{
                    // trial is too big -- negative remainder
                    __CLR4_4_15ic5iclb90p7cr.R.inc(8249);max = trial-1;
                    __CLR4_4_15ic5iclb90p7cr.R.inc(8250);continue;
                }

                /* find out how far off the remainder is telling us we are */
                }__CLR4_4_15ic5iclb90p7cr.R.inc(8251);minadj = (remainder[mant.length] * RADIX)+remainder[mant.length-1];
                __CLR4_4_15ic5iclb90p7cr.R.inc(8252);minadj = minadj / (divisor.mant[mant.length-1]+1);

                __CLR4_4_15ic5iclb90p7cr.R.inc(8253);if ((((minadj >= 2)&&(__CLR4_4_15ic5iclb90p7cr.R.iget(8254)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(8255)==0&false))) {{
                    __CLR4_4_15ic5iclb90p7cr.R.inc(8256);min = trial+minadj;  // update the minimum
                    __CLR4_4_15ic5iclb90p7cr.R.inc(8257);continue;
                }

                /* May have a good one here, check more thoroughly.  Basically
           its a good one if it is less than the divisor */
                }__CLR4_4_15ic5iclb90p7cr.R.inc(8258);trialgood = false;  // assume false
                __CLR4_4_15ic5iclb90p7cr.R.inc(8259);for (int i = mant.length - 1; (((i >= 0)&&(__CLR4_4_15ic5iclb90p7cr.R.iget(8260)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(8261)==0&false)); i--) {{
                    __CLR4_4_15ic5iclb90p7cr.R.inc(8262);if ((((divisor.mant[i] > remainder[i])&&(__CLR4_4_15ic5iclb90p7cr.R.iget(8263)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(8264)==0&false))) {{
                        __CLR4_4_15ic5iclb90p7cr.R.inc(8265);trialgood = true;
                    }
                    }__CLR4_4_15ic5iclb90p7cr.R.inc(8266);if ((((divisor.mant[i] < remainder[i])&&(__CLR4_4_15ic5iclb90p7cr.R.iget(8267)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(8268)==0&false))) {{
                        __CLR4_4_15ic5iclb90p7cr.R.inc(8269);break;
                    }
                }}

                }__CLR4_4_15ic5iclb90p7cr.R.inc(8270);if ((((remainder[mant.length] != 0)&&(__CLR4_4_15ic5iclb90p7cr.R.iget(8271)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(8272)==0&false))) {{
                    __CLR4_4_15ic5iclb90p7cr.R.inc(8273);trialgood = false;
                }

                }__CLR4_4_15ic5iclb90p7cr.R.inc(8274);if ((((trialgood == false)&&(__CLR4_4_15ic5iclb90p7cr.R.iget(8275)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(8276)==0&false))) {{
                    __CLR4_4_15ic5iclb90p7cr.R.inc(8277);min = trial+1;
                }
            }}

            /* Great we have a digit! */
            }__CLR4_4_15ic5iclb90p7cr.R.inc(8278);quotient[qd] = trial;
            __CLR4_4_15ic5iclb90p7cr.R.inc(8279);if ((((trial != 0 || nsqd != 0)&&(__CLR4_4_15ic5iclb90p7cr.R.iget(8280)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(8281)==0&false))) {{
                __CLR4_4_15ic5iclb90p7cr.R.inc(8282);nsqd++;
            }

            }__CLR4_4_15ic5iclb90p7cr.R.inc(8283);if ((((field.getRoundingMode() == DfpField.RoundingMode.ROUND_DOWN && nsqd == mant.length)&&(__CLR4_4_15ic5iclb90p7cr.R.iget(8284)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(8285)==0&false))) {{
                // We have enough for this mode
                __CLR4_4_15ic5iclb90p7cr.R.inc(8286);break;
            }

            }__CLR4_4_15ic5iclb90p7cr.R.inc(8287);if ((((nsqd > mant.length)&&(__CLR4_4_15ic5iclb90p7cr.R.iget(8288)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(8289)==0&false))) {{
                // We have enough digits
                __CLR4_4_15ic5iclb90p7cr.R.inc(8290);break;
            }

            /* move the remainder into the dividend while left shifting */
            }__CLR4_4_15ic5iclb90p7cr.R.inc(8291);dividend[0] = 0;
            __CLR4_4_15ic5iclb90p7cr.R.inc(8292);for (int i = 0; (((i < mant.length)&&(__CLR4_4_15ic5iclb90p7cr.R.iget(8293)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(8294)==0&false)); i++) {{
                __CLR4_4_15ic5iclb90p7cr.R.inc(8295);dividend[i + 1] = remainder[i];
            }
        }}

        /* Find the most sig digit */
        }__CLR4_4_15ic5iclb90p7cr.R.inc(8296);md = mant.length;  // default
        __CLR4_4_15ic5iclb90p7cr.R.inc(8297);for (int i = mant.length + 1; (((i >= 0)&&(__CLR4_4_15ic5iclb90p7cr.R.iget(8298)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(8299)==0&false)); i--) {{
            __CLR4_4_15ic5iclb90p7cr.R.inc(8300);if ((((quotient[i] != 0)&&(__CLR4_4_15ic5iclb90p7cr.R.iget(8301)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(8302)==0&false))) {{
                __CLR4_4_15ic5iclb90p7cr.R.inc(8303);md = i;
                __CLR4_4_15ic5iclb90p7cr.R.inc(8304);break;
            }
        }}

        /* Copy the digits into the result */
        }__CLR4_4_15ic5iclb90p7cr.R.inc(8305);for (int i=0; (((i<mant.length)&&(__CLR4_4_15ic5iclb90p7cr.R.iget(8306)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(8307)==0&false)); i++) {{
            __CLR4_4_15ic5iclb90p7cr.R.inc(8308);result.mant[mant.length-i-1] = quotient[md-i];
        }

        /* Fixup the exponent. */
        }__CLR4_4_15ic5iclb90p7cr.R.inc(8309);result.exp = exp - divisor.exp + md - mant.length;
        __CLR4_4_15ic5iclb90p7cr.R.inc(8310);result.sign = (byte) (((((sign == divisor.sign) )&&(__CLR4_4_15ic5iclb90p7cr.R.iget(8311)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(8312)==0&false))? 1 : -1);

        __CLR4_4_15ic5iclb90p7cr.R.inc(8313);if ((((result.mant[mant.length-1] == 0)&&(__CLR4_4_15ic5iclb90p7cr.R.iget(8314)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(8315)==0&false))) {{ // if result is zero, set exp to zero
            __CLR4_4_15ic5iclb90p7cr.R.inc(8316);result.exp = 0;
        }

        }__CLR4_4_15ic5iclb90p7cr.R.inc(8317);if ((((md > (mant.length-1))&&(__CLR4_4_15ic5iclb90p7cr.R.iget(8318)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(8319)==0&false))) {{
            __CLR4_4_15ic5iclb90p7cr.R.inc(8320);excp = result.round(quotient[md-mant.length]);
        } }else {{
            __CLR4_4_15ic5iclb90p7cr.R.inc(8321);excp = result.round(0);
        }

        }__CLR4_4_15ic5iclb90p7cr.R.inc(8322);if ((((excp != 0)&&(__CLR4_4_15ic5iclb90p7cr.R.iget(8323)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(8324)==0&false))) {{
            __CLR4_4_15ic5iclb90p7cr.R.inc(8325);result = dotrap(excp, DIVIDE_TRAP, divisor, result);
        }

        }__CLR4_4_15ic5iclb90p7cr.R.inc(8326);return result;
    }finally{__CLR4_4_15ic5iclb90p7cr.R.flushNeeded();}}

    /** Divide by a single digit less than radix.
     *  Special case, so there are speed advantages. 0 &lt;= divisor &lt; radix
     * @param divisor divisor
     * @return quotient of this by divisor
     */
    public Dfp divide(int divisor) {try{__CLR4_4_15ic5iclb90p7cr.R.inc(8327);

        // Handle special cases
        __CLR4_4_15ic5iclb90p7cr.R.inc(8328);if ((((nans != FINITE)&&(__CLR4_4_15ic5iclb90p7cr.R.iget(8329)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(8330)==0&false))) {{
            __CLR4_4_15ic5iclb90p7cr.R.inc(8331);if ((((isNaN())&&(__CLR4_4_15ic5iclb90p7cr.R.iget(8332)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(8333)==0&false))) {{
                __CLR4_4_15ic5iclb90p7cr.R.inc(8334);return this;
            }

            }__CLR4_4_15ic5iclb90p7cr.R.inc(8335);if ((((nans == INFINITE)&&(__CLR4_4_15ic5iclb90p7cr.R.iget(8336)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(8337)==0&false))) {{
                __CLR4_4_15ic5iclb90p7cr.R.inc(8338);return newInstance(this);
            }
        }}

        // Test for divide by zero
        }__CLR4_4_15ic5iclb90p7cr.R.inc(8339);if ((((divisor == 0)&&(__CLR4_4_15ic5iclb90p7cr.R.iget(8340)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(8341)==0&false))) {{
            __CLR4_4_15ic5iclb90p7cr.R.inc(8342);field.setIEEEFlagsBits(DfpField.FLAG_DIV_ZERO);
            __CLR4_4_15ic5iclb90p7cr.R.inc(8343);Dfp result = newInstance(getZero());
            __CLR4_4_15ic5iclb90p7cr.R.inc(8344);result.sign = sign;
            __CLR4_4_15ic5iclb90p7cr.R.inc(8345);result.nans = INFINITE;
            __CLR4_4_15ic5iclb90p7cr.R.inc(8346);result = dotrap(DfpField.FLAG_DIV_ZERO, DIVIDE_TRAP, getZero(), result);
            __CLR4_4_15ic5iclb90p7cr.R.inc(8347);return result;
        }

        // range check divisor
        }__CLR4_4_15ic5iclb90p7cr.R.inc(8348);if ((((divisor < 0 || divisor >= RADIX)&&(__CLR4_4_15ic5iclb90p7cr.R.iget(8349)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(8350)==0&false))) {{
            __CLR4_4_15ic5iclb90p7cr.R.inc(8351);field.setIEEEFlagsBits(DfpField.FLAG_INVALID);
            __CLR4_4_15ic5iclb90p7cr.R.inc(8352);Dfp result = newInstance(getZero());
            __CLR4_4_15ic5iclb90p7cr.R.inc(8353);result.nans = QNAN;
            __CLR4_4_15ic5iclb90p7cr.R.inc(8354);result = dotrap(DfpField.FLAG_INVALID, DIVIDE_TRAP, result, result);
            __CLR4_4_15ic5iclb90p7cr.R.inc(8355);return result;
        }

        }__CLR4_4_15ic5iclb90p7cr.R.inc(8356);Dfp result = newInstance(this);

        __CLR4_4_15ic5iclb90p7cr.R.inc(8357);int rl = 0;
        __CLR4_4_15ic5iclb90p7cr.R.inc(8358);for (int i = mant.length-1; (((i >= 0)&&(__CLR4_4_15ic5iclb90p7cr.R.iget(8359)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(8360)==0&false)); i--) {{
            __CLR4_4_15ic5iclb90p7cr.R.inc(8361);final int r = rl*RADIX + result.mant[i];
            __CLR4_4_15ic5iclb90p7cr.R.inc(8362);final int rh = r / divisor;
            __CLR4_4_15ic5iclb90p7cr.R.inc(8363);rl = r - rh * divisor;
            __CLR4_4_15ic5iclb90p7cr.R.inc(8364);result.mant[i] = rh;
        }

        }__CLR4_4_15ic5iclb90p7cr.R.inc(8365);if ((((result.mant[mant.length-1] == 0)&&(__CLR4_4_15ic5iclb90p7cr.R.iget(8366)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(8367)==0&false))) {{
            // normalize
            __CLR4_4_15ic5iclb90p7cr.R.inc(8368);result.shiftLeft();
            __CLR4_4_15ic5iclb90p7cr.R.inc(8369);final int r = rl * RADIX;        // compute the next digit and put it in
            __CLR4_4_15ic5iclb90p7cr.R.inc(8370);final int rh = r / divisor;
            __CLR4_4_15ic5iclb90p7cr.R.inc(8371);rl = r - rh * divisor;
            __CLR4_4_15ic5iclb90p7cr.R.inc(8372);result.mant[0] = rh;
        }

        }__CLR4_4_15ic5iclb90p7cr.R.inc(8373);final int excp = result.round(rl * RADIX / divisor);  // do the rounding
        __CLR4_4_15ic5iclb90p7cr.R.inc(8374);if ((((excp != 0)&&(__CLR4_4_15ic5iclb90p7cr.R.iget(8375)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(8376)==0&false))) {{
            __CLR4_4_15ic5iclb90p7cr.R.inc(8377);result = dotrap(excp, DIVIDE_TRAP, result, result);
        }

        }__CLR4_4_15ic5iclb90p7cr.R.inc(8378);return result;

    }finally{__CLR4_4_15ic5iclb90p7cr.R.flushNeeded();}}

    /** {@inheritDoc} */
    public Dfp reciprocal() {try{__CLR4_4_15ic5iclb90p7cr.R.inc(8379);
        __CLR4_4_15ic5iclb90p7cr.R.inc(8380);return field.getOne().divide(this);
    }finally{__CLR4_4_15ic5iclb90p7cr.R.flushNeeded();}}

    /** Compute the square root.
     * @return square root of the instance
     * @since 3.2
     */
    public Dfp sqrt() {try{__CLR4_4_15ic5iclb90p7cr.R.inc(8381);

        // check for unusual cases
        __CLR4_4_15ic5iclb90p7cr.R.inc(8382);if ((((nans == FINITE && mant[mant.length-1] == 0)&&(__CLR4_4_15ic5iclb90p7cr.R.iget(8383)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(8384)==0&false))) {{
            // if zero
            __CLR4_4_15ic5iclb90p7cr.R.inc(8385);return newInstance(this);
        }

        }__CLR4_4_15ic5iclb90p7cr.R.inc(8386);if ((((nans != FINITE)&&(__CLR4_4_15ic5iclb90p7cr.R.iget(8387)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(8388)==0&false))) {{
            __CLR4_4_15ic5iclb90p7cr.R.inc(8389);if ((((nans == INFINITE && sign == 1)&&(__CLR4_4_15ic5iclb90p7cr.R.iget(8390)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(8391)==0&false))) {{
                // if positive infinity
                __CLR4_4_15ic5iclb90p7cr.R.inc(8392);return newInstance(this);
            }

            }__CLR4_4_15ic5iclb90p7cr.R.inc(8393);if ((((nans == QNAN)&&(__CLR4_4_15ic5iclb90p7cr.R.iget(8394)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(8395)==0&false))) {{
                __CLR4_4_15ic5iclb90p7cr.R.inc(8396);return newInstance(this);
            }

            }__CLR4_4_15ic5iclb90p7cr.R.inc(8397);if ((((nans == SNAN)&&(__CLR4_4_15ic5iclb90p7cr.R.iget(8398)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(8399)==0&false))) {{
                __CLR4_4_15ic5iclb90p7cr.R.inc(8400);Dfp result;

                __CLR4_4_15ic5iclb90p7cr.R.inc(8401);field.setIEEEFlagsBits(DfpField.FLAG_INVALID);
                __CLR4_4_15ic5iclb90p7cr.R.inc(8402);result = newInstance(this);
                __CLR4_4_15ic5iclb90p7cr.R.inc(8403);result = dotrap(DfpField.FLAG_INVALID, SQRT_TRAP, null, result);
                __CLR4_4_15ic5iclb90p7cr.R.inc(8404);return result;
            }
        }}

        }__CLR4_4_15ic5iclb90p7cr.R.inc(8405);if ((((sign == -1)&&(__CLR4_4_15ic5iclb90p7cr.R.iget(8406)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(8407)==0&false))) {{
            // if negative
            __CLR4_4_15ic5iclb90p7cr.R.inc(8408);Dfp result;

            __CLR4_4_15ic5iclb90p7cr.R.inc(8409);field.setIEEEFlagsBits(DfpField.FLAG_INVALID);
            __CLR4_4_15ic5iclb90p7cr.R.inc(8410);result = newInstance(this);
            __CLR4_4_15ic5iclb90p7cr.R.inc(8411);result.nans = QNAN;
            __CLR4_4_15ic5iclb90p7cr.R.inc(8412);result = dotrap(DfpField.FLAG_INVALID, SQRT_TRAP, null, result);
            __CLR4_4_15ic5iclb90p7cr.R.inc(8413);return result;
        }

        }__CLR4_4_15ic5iclb90p7cr.R.inc(8414);Dfp x = newInstance(this);

        /* Lets make a reasonable guess as to the size of the square root */
        __CLR4_4_15ic5iclb90p7cr.R.inc(8415);if ((((x.exp < -1 || x.exp > 1)&&(__CLR4_4_15ic5iclb90p7cr.R.iget(8416)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(8417)==0&false))) {{
            __CLR4_4_15ic5iclb90p7cr.R.inc(8418);x.exp = this.exp / 2;
        }

        /* Coarsely estimate the mantissa */
        }boolean __CLB4_4_1_bool3=false;__CLR4_4_15ic5iclb90p7cr.R.inc(8419);switch (x.mant[mant.length-1] / 2000) {
            case 0:if (!__CLB4_4_1_bool3) {__CLR4_4_15ic5iclb90p7cr.R.inc(8420);__CLB4_4_1_bool3=true;}
                __CLR4_4_15ic5iclb90p7cr.R.inc(8421);x.mant[mant.length-1] = x.mant[mant.length-1]/2+1;
                __CLR4_4_15ic5iclb90p7cr.R.inc(8422);break;
            case 2:if (!__CLB4_4_1_bool3) {__CLR4_4_15ic5iclb90p7cr.R.inc(8423);__CLB4_4_1_bool3=true;}
                __CLR4_4_15ic5iclb90p7cr.R.inc(8424);x.mant[mant.length-1] = 1500;
                __CLR4_4_15ic5iclb90p7cr.R.inc(8425);break;
            case 3:if (!__CLB4_4_1_bool3) {__CLR4_4_15ic5iclb90p7cr.R.inc(8426);__CLB4_4_1_bool3=true;}
                __CLR4_4_15ic5iclb90p7cr.R.inc(8427);x.mant[mant.length-1] = 2200;
                __CLR4_4_15ic5iclb90p7cr.R.inc(8428);break;
            default:if (!__CLB4_4_1_bool3) {__CLR4_4_15ic5iclb90p7cr.R.inc(8429);__CLB4_4_1_bool3=true;}
                __CLR4_4_15ic5iclb90p7cr.R.inc(8430);x.mant[mant.length-1] = 3000;
        }

        __CLR4_4_15ic5iclb90p7cr.R.inc(8431);Dfp dx = newInstance(x);

        /* Now that we have the first pass estimate, compute the rest
       by the formula dx = (y - x*x) / (2x); */

        __CLR4_4_15ic5iclb90p7cr.R.inc(8432);Dfp px  = getZero();
        __CLR4_4_15ic5iclb90p7cr.R.inc(8433);Dfp ppx = getZero();
        __CLR4_4_15ic5iclb90p7cr.R.inc(8434);while ((((x.unequal(px))&&(__CLR4_4_15ic5iclb90p7cr.R.iget(8435)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(8436)==0&false))) {{
            __CLR4_4_15ic5iclb90p7cr.R.inc(8437);dx = newInstance(x);
            __CLR4_4_15ic5iclb90p7cr.R.inc(8438);dx.sign = -1;
            __CLR4_4_15ic5iclb90p7cr.R.inc(8439);dx = dx.add(this.divide(x));
            __CLR4_4_15ic5iclb90p7cr.R.inc(8440);dx = dx.divide(2);
            __CLR4_4_15ic5iclb90p7cr.R.inc(8441);ppx = px;
            __CLR4_4_15ic5iclb90p7cr.R.inc(8442);px = x;
            __CLR4_4_15ic5iclb90p7cr.R.inc(8443);x = x.add(dx);

            __CLR4_4_15ic5iclb90p7cr.R.inc(8444);if ((((x.equals(ppx))&&(__CLR4_4_15ic5iclb90p7cr.R.iget(8445)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(8446)==0&false))) {{
                // alternating between two values
                __CLR4_4_15ic5iclb90p7cr.R.inc(8447);break;
            }

            // if dx is zero, break.  Note testing the most sig digit
            // is a sufficient test since dx is normalized
            }__CLR4_4_15ic5iclb90p7cr.R.inc(8448);if ((((dx.mant[mant.length-1] == 0)&&(__CLR4_4_15ic5iclb90p7cr.R.iget(8449)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(8450)==0&false))) {{
                __CLR4_4_15ic5iclb90p7cr.R.inc(8451);break;
            }
        }}

        }__CLR4_4_15ic5iclb90p7cr.R.inc(8452);return x;

    }finally{__CLR4_4_15ic5iclb90p7cr.R.flushNeeded();}}

    /** Get a string representation of the instance.
     * @return string representation of the instance
     */
    @Override
    public String toString() {try{__CLR4_4_15ic5iclb90p7cr.R.inc(8453);
        __CLR4_4_15ic5iclb90p7cr.R.inc(8454);if ((((nans != FINITE)&&(__CLR4_4_15ic5iclb90p7cr.R.iget(8455)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(8456)==0&false))) {{
            // if non-finite exceptional cases
            __CLR4_4_15ic5iclb90p7cr.R.inc(8457);if ((((nans == INFINITE)&&(__CLR4_4_15ic5iclb90p7cr.R.iget(8458)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(8459)==0&false))) {{
                __CLR4_4_15ic5iclb90p7cr.R.inc(8460);return ((((sign < 0) )&&(__CLR4_4_15ic5iclb90p7cr.R.iget(8461)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(8462)==0&false))? NEG_INFINITY_STRING : POS_INFINITY_STRING;
            } }else {{
                __CLR4_4_15ic5iclb90p7cr.R.inc(8463);return NAN_STRING;
            }
        }}

        }__CLR4_4_15ic5iclb90p7cr.R.inc(8464);if ((((exp > mant.length || exp < -1)&&(__CLR4_4_15ic5iclb90p7cr.R.iget(8465)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(8466)==0&false))) {{
            __CLR4_4_15ic5iclb90p7cr.R.inc(8467);return dfp2sci();
        }

        }__CLR4_4_15ic5iclb90p7cr.R.inc(8468);return dfp2string();

    }finally{__CLR4_4_15ic5iclb90p7cr.R.flushNeeded();}}

    /** Convert an instance to a string using scientific notation.
     * @return string representation of the instance in scientific notation
     */
    protected String dfp2sci() {try{__CLR4_4_15ic5iclb90p7cr.R.inc(8469);
        __CLR4_4_15ic5iclb90p7cr.R.inc(8470);char rawdigits[]    = new char[mant.length * 4];
        __CLR4_4_15ic5iclb90p7cr.R.inc(8471);char outputbuffer[] = new char[mant.length * 4 + 20];
        __CLR4_4_15ic5iclb90p7cr.R.inc(8472);int p;
        __CLR4_4_15ic5iclb90p7cr.R.inc(8473);int q;
        __CLR4_4_15ic5iclb90p7cr.R.inc(8474);int e;
        __CLR4_4_15ic5iclb90p7cr.R.inc(8475);int ae;
        __CLR4_4_15ic5iclb90p7cr.R.inc(8476);int shf;

        // Get all the digits
        __CLR4_4_15ic5iclb90p7cr.R.inc(8477);p = 0;
        __CLR4_4_15ic5iclb90p7cr.R.inc(8478);for (int i = mant.length - 1; (((i >= 0)&&(__CLR4_4_15ic5iclb90p7cr.R.iget(8479)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(8480)==0&false)); i--) {{
            __CLR4_4_15ic5iclb90p7cr.R.inc(8481);rawdigits[p++] = (char) ((mant[i] / 1000) + '0');
            __CLR4_4_15ic5iclb90p7cr.R.inc(8482);rawdigits[p++] = (char) (((mant[i] / 100) %10) + '0');
            __CLR4_4_15ic5iclb90p7cr.R.inc(8483);rawdigits[p++] = (char) (((mant[i] / 10) % 10) + '0');
            __CLR4_4_15ic5iclb90p7cr.R.inc(8484);rawdigits[p++] = (char) (((mant[i]) % 10) + '0');
        }

        // Find the first non-zero one
        }__CLR4_4_15ic5iclb90p7cr.R.inc(8485);for (p = 0; (((p < rawdigits.length)&&(__CLR4_4_15ic5iclb90p7cr.R.iget(8486)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(8487)==0&false)); p++) {{
            __CLR4_4_15ic5iclb90p7cr.R.inc(8488);if ((((rawdigits[p] != '0')&&(__CLR4_4_15ic5iclb90p7cr.R.iget(8489)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(8490)==0&false))) {{
                __CLR4_4_15ic5iclb90p7cr.R.inc(8491);break;
            }
        }}
        }__CLR4_4_15ic5iclb90p7cr.R.inc(8492);shf = p;

        // Now do the conversion
        __CLR4_4_15ic5iclb90p7cr.R.inc(8493);q = 0;
        __CLR4_4_15ic5iclb90p7cr.R.inc(8494);if ((((sign == -1)&&(__CLR4_4_15ic5iclb90p7cr.R.iget(8495)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(8496)==0&false))) {{
            __CLR4_4_15ic5iclb90p7cr.R.inc(8497);outputbuffer[q++] = '-';
        }

        }__CLR4_4_15ic5iclb90p7cr.R.inc(8498);if ((((p != rawdigits.length)&&(__CLR4_4_15ic5iclb90p7cr.R.iget(8499)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(8500)==0&false))) {{
            // there are non zero digits...
            __CLR4_4_15ic5iclb90p7cr.R.inc(8501);outputbuffer[q++] = rawdigits[p++];
            __CLR4_4_15ic5iclb90p7cr.R.inc(8502);outputbuffer[q++] = '.';

            __CLR4_4_15ic5iclb90p7cr.R.inc(8503);while ((((p<rawdigits.length)&&(__CLR4_4_15ic5iclb90p7cr.R.iget(8504)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(8505)==0&false))) {{
                __CLR4_4_15ic5iclb90p7cr.R.inc(8506);outputbuffer[q++] = rawdigits[p++];
            }
        }} }else {{
            __CLR4_4_15ic5iclb90p7cr.R.inc(8507);outputbuffer[q++] = '0';
            __CLR4_4_15ic5iclb90p7cr.R.inc(8508);outputbuffer[q++] = '.';
            __CLR4_4_15ic5iclb90p7cr.R.inc(8509);outputbuffer[q++] = '0';
            __CLR4_4_15ic5iclb90p7cr.R.inc(8510);outputbuffer[q++] = 'e';
            __CLR4_4_15ic5iclb90p7cr.R.inc(8511);outputbuffer[q++] = '0';
            __CLR4_4_15ic5iclb90p7cr.R.inc(8512);return new String(outputbuffer, 0, 5);
        }

        }__CLR4_4_15ic5iclb90p7cr.R.inc(8513);outputbuffer[q++] = 'e';

        // Find the msd of the exponent

        __CLR4_4_15ic5iclb90p7cr.R.inc(8514);e = exp * 4 - shf - 1;
        __CLR4_4_15ic5iclb90p7cr.R.inc(8515);ae = e;
        __CLR4_4_15ic5iclb90p7cr.R.inc(8516);if ((((e < 0)&&(__CLR4_4_15ic5iclb90p7cr.R.iget(8517)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(8518)==0&false))) {{
            __CLR4_4_15ic5iclb90p7cr.R.inc(8519);ae = -e;
        }

        // Find the largest p such that p < e
        }__CLR4_4_15ic5iclb90p7cr.R.inc(8520);for (p = 1000000000; (((p > ae)&&(__CLR4_4_15ic5iclb90p7cr.R.iget(8521)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(8522)==0&false)); p /= 10) {{
            // nothing to do
        }

        }__CLR4_4_15ic5iclb90p7cr.R.inc(8523);if ((((e < 0)&&(__CLR4_4_15ic5iclb90p7cr.R.iget(8524)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(8525)==0&false))) {{
            __CLR4_4_15ic5iclb90p7cr.R.inc(8526);outputbuffer[q++] = '-';
        }

        }__CLR4_4_15ic5iclb90p7cr.R.inc(8527);while ((((p > 0)&&(__CLR4_4_15ic5iclb90p7cr.R.iget(8528)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(8529)==0&false))) {{
            __CLR4_4_15ic5iclb90p7cr.R.inc(8530);outputbuffer[q++] = (char)(ae / p + '0');
            __CLR4_4_15ic5iclb90p7cr.R.inc(8531);ae = ae % p;
            __CLR4_4_15ic5iclb90p7cr.R.inc(8532);p = p / 10;
        }

        }__CLR4_4_15ic5iclb90p7cr.R.inc(8533);return new String(outputbuffer, 0, q);

    }finally{__CLR4_4_15ic5iclb90p7cr.R.flushNeeded();}}

    /** Convert an instance to a string using normal notation.
     * @return string representation of the instance in normal notation
     */
    protected String dfp2string() {try{__CLR4_4_15ic5iclb90p7cr.R.inc(8534);
        __CLR4_4_15ic5iclb90p7cr.R.inc(8535);char buffer[] = new char[mant.length*4 + 20];
        __CLR4_4_15ic5iclb90p7cr.R.inc(8536);int p = 1;
        __CLR4_4_15ic5iclb90p7cr.R.inc(8537);int q;
        __CLR4_4_15ic5iclb90p7cr.R.inc(8538);int e = exp;
        __CLR4_4_15ic5iclb90p7cr.R.inc(8539);boolean pointInserted = false;

        __CLR4_4_15ic5iclb90p7cr.R.inc(8540);buffer[0] = ' ';

        __CLR4_4_15ic5iclb90p7cr.R.inc(8541);if ((((e <= 0)&&(__CLR4_4_15ic5iclb90p7cr.R.iget(8542)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(8543)==0&false))) {{
            __CLR4_4_15ic5iclb90p7cr.R.inc(8544);buffer[p++] = '0';
            __CLR4_4_15ic5iclb90p7cr.R.inc(8545);buffer[p++] = '.';
            __CLR4_4_15ic5iclb90p7cr.R.inc(8546);pointInserted = true;
        }

        }__CLR4_4_15ic5iclb90p7cr.R.inc(8547);while ((((e < 0)&&(__CLR4_4_15ic5iclb90p7cr.R.iget(8548)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(8549)==0&false))) {{
            __CLR4_4_15ic5iclb90p7cr.R.inc(8550);buffer[p++] = '0';
            __CLR4_4_15ic5iclb90p7cr.R.inc(8551);buffer[p++] = '0';
            __CLR4_4_15ic5iclb90p7cr.R.inc(8552);buffer[p++] = '0';
            __CLR4_4_15ic5iclb90p7cr.R.inc(8553);buffer[p++] = '0';
            __CLR4_4_15ic5iclb90p7cr.R.inc(8554);e++;
        }

        }__CLR4_4_15ic5iclb90p7cr.R.inc(8555);for (int i = mant.length - 1; (((i >= 0)&&(__CLR4_4_15ic5iclb90p7cr.R.iget(8556)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(8557)==0&false)); i--) {{
            __CLR4_4_15ic5iclb90p7cr.R.inc(8558);buffer[p++] = (char) ((mant[i] / 1000) + '0');
            __CLR4_4_15ic5iclb90p7cr.R.inc(8559);buffer[p++] = (char) (((mant[i] / 100) % 10) + '0');
            __CLR4_4_15ic5iclb90p7cr.R.inc(8560);buffer[p++] = (char) (((mant[i] / 10) % 10) + '0');
            __CLR4_4_15ic5iclb90p7cr.R.inc(8561);buffer[p++] = (char) (((mant[i]) % 10) + '0');
            __CLR4_4_15ic5iclb90p7cr.R.inc(8562);if ((((--e == 0)&&(__CLR4_4_15ic5iclb90p7cr.R.iget(8563)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(8564)==0&false))) {{
                __CLR4_4_15ic5iclb90p7cr.R.inc(8565);buffer[p++] = '.';
                __CLR4_4_15ic5iclb90p7cr.R.inc(8566);pointInserted = true;
            }
        }}

        }__CLR4_4_15ic5iclb90p7cr.R.inc(8567);while ((((e > 0)&&(__CLR4_4_15ic5iclb90p7cr.R.iget(8568)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(8569)==0&false))) {{
            __CLR4_4_15ic5iclb90p7cr.R.inc(8570);buffer[p++] = '0';
            __CLR4_4_15ic5iclb90p7cr.R.inc(8571);buffer[p++] = '0';
            __CLR4_4_15ic5iclb90p7cr.R.inc(8572);buffer[p++] = '0';
            __CLR4_4_15ic5iclb90p7cr.R.inc(8573);buffer[p++] = '0';
            __CLR4_4_15ic5iclb90p7cr.R.inc(8574);e--;
        }

        }__CLR4_4_15ic5iclb90p7cr.R.inc(8575);if ((((!pointInserted)&&(__CLR4_4_15ic5iclb90p7cr.R.iget(8576)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(8577)==0&false))) {{
            // Ensure we have a radix point!
            __CLR4_4_15ic5iclb90p7cr.R.inc(8578);buffer[p++] = '.';
        }

        // Suppress leading zeros
        }__CLR4_4_15ic5iclb90p7cr.R.inc(8579);q = 1;
        __CLR4_4_15ic5iclb90p7cr.R.inc(8580);while ((((buffer[q] == '0')&&(__CLR4_4_15ic5iclb90p7cr.R.iget(8581)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(8582)==0&false))) {{
            __CLR4_4_15ic5iclb90p7cr.R.inc(8583);q++;
        }
        }__CLR4_4_15ic5iclb90p7cr.R.inc(8584);if ((((buffer[q] == '.')&&(__CLR4_4_15ic5iclb90p7cr.R.iget(8585)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(8586)==0&false))) {{
            __CLR4_4_15ic5iclb90p7cr.R.inc(8587);q--;
        }

        // Suppress trailing zeros
        }__CLR4_4_15ic5iclb90p7cr.R.inc(8588);while ((((buffer[p-1] == '0')&&(__CLR4_4_15ic5iclb90p7cr.R.iget(8589)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(8590)==0&false))) {{
            __CLR4_4_15ic5iclb90p7cr.R.inc(8591);p--;
        }

        // Insert sign
        }__CLR4_4_15ic5iclb90p7cr.R.inc(8592);if ((((sign < 0)&&(__CLR4_4_15ic5iclb90p7cr.R.iget(8593)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(8594)==0&false))) {{
            __CLR4_4_15ic5iclb90p7cr.R.inc(8595);buffer[--q] = '-';
        }

        }__CLR4_4_15ic5iclb90p7cr.R.inc(8596);return new String(buffer, q, p - q);

    }finally{__CLR4_4_15ic5iclb90p7cr.R.flushNeeded();}}

    /** Raises a trap.  This does not set the corresponding flag however.
     *  @param type the trap type
     *  @param what - name of routine trap occurred in
     *  @param oper - input operator to function
     *  @param result - the result computed prior to the trap
     *  @return The suggested return value from the trap handler
     */
    public Dfp dotrap(int type, String what, Dfp oper, Dfp result) {try{__CLR4_4_15ic5iclb90p7cr.R.inc(8597);
        __CLR4_4_15ic5iclb90p7cr.R.inc(8598);Dfp def = result;

        boolean __CLB4_4_1_bool4=false;__CLR4_4_15ic5iclb90p7cr.R.inc(8599);switch (type) {
            case DfpField.FLAG_INVALID:if (!__CLB4_4_1_bool4) {__CLR4_4_15ic5iclb90p7cr.R.inc(8600);__CLB4_4_1_bool4=true;}
                __CLR4_4_15ic5iclb90p7cr.R.inc(8601);def = newInstance(getZero());
                __CLR4_4_15ic5iclb90p7cr.R.inc(8602);def.sign = result.sign;
                __CLR4_4_15ic5iclb90p7cr.R.inc(8603);def.nans = QNAN;
                __CLR4_4_15ic5iclb90p7cr.R.inc(8604);break;

            case DfpField.FLAG_DIV_ZERO:if (!__CLB4_4_1_bool4) {__CLR4_4_15ic5iclb90p7cr.R.inc(8605);__CLB4_4_1_bool4=true;}
                __CLR4_4_15ic5iclb90p7cr.R.inc(8606);if ((((nans == FINITE && mant[mant.length-1] != 0)&&(__CLR4_4_15ic5iclb90p7cr.R.iget(8607)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(8608)==0&false))) {{
                    // normal case, we are finite, non-zero
                    __CLR4_4_15ic5iclb90p7cr.R.inc(8609);def = newInstance(getZero());
                    __CLR4_4_15ic5iclb90p7cr.R.inc(8610);def.sign = (byte)(sign*oper.sign);
                    __CLR4_4_15ic5iclb90p7cr.R.inc(8611);def.nans = INFINITE;
                }

                }__CLR4_4_15ic5iclb90p7cr.R.inc(8612);if ((((nans == FINITE && mant[mant.length-1] == 0)&&(__CLR4_4_15ic5iclb90p7cr.R.iget(8613)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(8614)==0&false))) {{
                    //  0/0
                    __CLR4_4_15ic5iclb90p7cr.R.inc(8615);def = newInstance(getZero());
                    __CLR4_4_15ic5iclb90p7cr.R.inc(8616);def.nans = QNAN;
                }

                }__CLR4_4_15ic5iclb90p7cr.R.inc(8617);if ((((nans == INFINITE || nans == QNAN)&&(__CLR4_4_15ic5iclb90p7cr.R.iget(8618)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(8619)==0&false))) {{
                    __CLR4_4_15ic5iclb90p7cr.R.inc(8620);def = newInstance(getZero());
                    __CLR4_4_15ic5iclb90p7cr.R.inc(8621);def.nans = QNAN;
                }

                }__CLR4_4_15ic5iclb90p7cr.R.inc(8622);if ((((nans == INFINITE || nans == SNAN)&&(__CLR4_4_15ic5iclb90p7cr.R.iget(8623)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(8624)==0&false))) {{
                    __CLR4_4_15ic5iclb90p7cr.R.inc(8625);def = newInstance(getZero());
                    __CLR4_4_15ic5iclb90p7cr.R.inc(8626);def.nans = QNAN;
                }
                }__CLR4_4_15ic5iclb90p7cr.R.inc(8627);break;

            case DfpField.FLAG_UNDERFLOW:if (!__CLB4_4_1_bool4) {__CLR4_4_15ic5iclb90p7cr.R.inc(8628);__CLB4_4_1_bool4=true;}
                __CLR4_4_15ic5iclb90p7cr.R.inc(8629);if ( ((((result.exp+mant.length) < MIN_EXP)&&(__CLR4_4_15ic5iclb90p7cr.R.iget(8630)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(8631)==0&false))) {{
                    __CLR4_4_15ic5iclb90p7cr.R.inc(8632);def = newInstance(getZero());
                    __CLR4_4_15ic5iclb90p7cr.R.inc(8633);def.sign = result.sign;
                } }else {{
                    __CLR4_4_15ic5iclb90p7cr.R.inc(8634);def = newInstance(result);  // gradual underflow
                }
                }__CLR4_4_15ic5iclb90p7cr.R.inc(8635);result.exp = result.exp + ERR_SCALE;
                __CLR4_4_15ic5iclb90p7cr.R.inc(8636);break;

            case DfpField.FLAG_OVERFLOW:if (!__CLB4_4_1_bool4) {__CLR4_4_15ic5iclb90p7cr.R.inc(8637);__CLB4_4_1_bool4=true;}
                __CLR4_4_15ic5iclb90p7cr.R.inc(8638);result.exp = result.exp - ERR_SCALE;
                __CLR4_4_15ic5iclb90p7cr.R.inc(8639);def = newInstance(getZero());
                __CLR4_4_15ic5iclb90p7cr.R.inc(8640);def.sign = result.sign;
                __CLR4_4_15ic5iclb90p7cr.R.inc(8641);def.nans = INFINITE;
                __CLR4_4_15ic5iclb90p7cr.R.inc(8642);break;

            default:if (!__CLB4_4_1_bool4) {__CLR4_4_15ic5iclb90p7cr.R.inc(8643);__CLB4_4_1_bool4=true;} __CLR4_4_15ic5iclb90p7cr.R.inc(8644);def = result; __CLR4_4_15ic5iclb90p7cr.R.inc(8645);break;
        }

        __CLR4_4_15ic5iclb90p7cr.R.inc(8646);return trap(type, what, oper, def, result);

    }finally{__CLR4_4_15ic5iclb90p7cr.R.flushNeeded();}}

    /** Trap handler.  Subclasses may override this to provide trap
     *  functionality per IEEE 854-1987.
     *
     *  @param type  The exception type - e.g. FLAG_OVERFLOW
     *  @param what  The name of the routine we were in e.g. divide()
     *  @param oper  An operand to this function if any
     *  @param def   The default return value if trap not enabled
     *  @param result    The result that is specified to be delivered per
     *                   IEEE 854, if any
     *  @return the value that should be return by the operation triggering the trap
     */
    protected Dfp trap(int type, String what, Dfp oper, Dfp def, Dfp result) {try{__CLR4_4_15ic5iclb90p7cr.R.inc(8647);
        __CLR4_4_15ic5iclb90p7cr.R.inc(8648);return def;
    }finally{__CLR4_4_15ic5iclb90p7cr.R.flushNeeded();}}

    /** Returns the type - one of FINITE, INFINITE, SNAN, QNAN.
     * @return type of the number
     */
    public int classify() {try{__CLR4_4_15ic5iclb90p7cr.R.inc(8649);
        __CLR4_4_15ic5iclb90p7cr.R.inc(8650);return nans;
    }finally{__CLR4_4_15ic5iclb90p7cr.R.flushNeeded();}}

    /** Creates an instance that is the same as x except that it has the sign of y.
     * abs(x) = dfp.copysign(x, dfp.one)
     * @param x number to get the value from
     * @param y number to get the sign from
     * @return a number with the value of x and the sign of y
     */
    public static Dfp copysign(final Dfp x, final Dfp y) {try{__CLR4_4_15ic5iclb90p7cr.R.inc(8651);
        __CLR4_4_15ic5iclb90p7cr.R.inc(8652);Dfp result = x.newInstance(x);
        __CLR4_4_15ic5iclb90p7cr.R.inc(8653);result.sign = y.sign;
        __CLR4_4_15ic5iclb90p7cr.R.inc(8654);return result;
    }finally{__CLR4_4_15ic5iclb90p7cr.R.flushNeeded();}}

    /** Returns the next number greater than this one in the direction of x.
     * If this==x then simply returns this.
     * @param x direction where to look at
     * @return closest number next to instance in the direction of x
     */
    public Dfp nextAfter(final Dfp x) {try{__CLR4_4_15ic5iclb90p7cr.R.inc(8655);

        // make sure we don't mix number with different precision
        __CLR4_4_15ic5iclb90p7cr.R.inc(8656);if ((((field.getRadixDigits() != x.field.getRadixDigits())&&(__CLR4_4_15ic5iclb90p7cr.R.iget(8657)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(8658)==0&false))) {{
            __CLR4_4_15ic5iclb90p7cr.R.inc(8659);field.setIEEEFlagsBits(DfpField.FLAG_INVALID);
            __CLR4_4_15ic5iclb90p7cr.R.inc(8660);final Dfp result = newInstance(getZero());
            __CLR4_4_15ic5iclb90p7cr.R.inc(8661);result.nans = QNAN;
            __CLR4_4_15ic5iclb90p7cr.R.inc(8662);return dotrap(DfpField.FLAG_INVALID, NEXT_AFTER_TRAP, x, result);
        }

        // if this is greater than x
        }__CLR4_4_15ic5iclb90p7cr.R.inc(8663);boolean up = false;
        __CLR4_4_15ic5iclb90p7cr.R.inc(8664);if ((((this.lessThan(x))&&(__CLR4_4_15ic5iclb90p7cr.R.iget(8665)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(8666)==0&false))) {{
            __CLR4_4_15ic5iclb90p7cr.R.inc(8667);up = true;
        }

        }__CLR4_4_15ic5iclb90p7cr.R.inc(8668);if ((((compare(this, x) == 0)&&(__CLR4_4_15ic5iclb90p7cr.R.iget(8669)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(8670)==0&false))) {{
            __CLR4_4_15ic5iclb90p7cr.R.inc(8671);return newInstance(x);
        }

        }__CLR4_4_15ic5iclb90p7cr.R.inc(8672);if ((((lessThan(getZero()))&&(__CLR4_4_15ic5iclb90p7cr.R.iget(8673)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(8674)==0&false))) {{
            __CLR4_4_15ic5iclb90p7cr.R.inc(8675);up = !up;
        }

        }__CLR4_4_15ic5iclb90p7cr.R.inc(8676);final Dfp inc;
        __CLR4_4_15ic5iclb90p7cr.R.inc(8677);Dfp result;
        __CLR4_4_15ic5iclb90p7cr.R.inc(8678);if ((((up)&&(__CLR4_4_15ic5iclb90p7cr.R.iget(8679)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(8680)==0&false))) {{
            __CLR4_4_15ic5iclb90p7cr.R.inc(8681);inc = newInstance(getOne());
            __CLR4_4_15ic5iclb90p7cr.R.inc(8682);inc.exp = this.exp-mant.length+1;
            __CLR4_4_15ic5iclb90p7cr.R.inc(8683);inc.sign = this.sign;

            __CLR4_4_15ic5iclb90p7cr.R.inc(8684);if ((((this.equals(getZero()))&&(__CLR4_4_15ic5iclb90p7cr.R.iget(8685)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(8686)==0&false))) {{
                __CLR4_4_15ic5iclb90p7cr.R.inc(8687);inc.exp = MIN_EXP-mant.length;
            }

            }__CLR4_4_15ic5iclb90p7cr.R.inc(8688);result = add(inc);
        } }else {{
            __CLR4_4_15ic5iclb90p7cr.R.inc(8689);inc = newInstance(getOne());
            __CLR4_4_15ic5iclb90p7cr.R.inc(8690);inc.exp = this.exp;
            __CLR4_4_15ic5iclb90p7cr.R.inc(8691);inc.sign = this.sign;

            __CLR4_4_15ic5iclb90p7cr.R.inc(8692);if ((((this.equals(inc))&&(__CLR4_4_15ic5iclb90p7cr.R.iget(8693)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(8694)==0&false))) {{
                __CLR4_4_15ic5iclb90p7cr.R.inc(8695);inc.exp = this.exp-mant.length;
            } }else {{
                __CLR4_4_15ic5iclb90p7cr.R.inc(8696);inc.exp = this.exp-mant.length+1;
            }

            }__CLR4_4_15ic5iclb90p7cr.R.inc(8697);if ((((this.equals(getZero()))&&(__CLR4_4_15ic5iclb90p7cr.R.iget(8698)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(8699)==0&false))) {{
                __CLR4_4_15ic5iclb90p7cr.R.inc(8700);inc.exp = MIN_EXP-mant.length;
            }

            }__CLR4_4_15ic5iclb90p7cr.R.inc(8701);result = this.subtract(inc);
        }

        }__CLR4_4_15ic5iclb90p7cr.R.inc(8702);if ((((result.classify() == INFINITE && this.classify() != INFINITE)&&(__CLR4_4_15ic5iclb90p7cr.R.iget(8703)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(8704)==0&false))) {{
            __CLR4_4_15ic5iclb90p7cr.R.inc(8705);field.setIEEEFlagsBits(DfpField.FLAG_INEXACT);
            __CLR4_4_15ic5iclb90p7cr.R.inc(8706);result = dotrap(DfpField.FLAG_INEXACT, NEXT_AFTER_TRAP, x, result);
        }

        }__CLR4_4_15ic5iclb90p7cr.R.inc(8707);if ((((result.equals(getZero()) && this.equals(getZero()) == false)&&(__CLR4_4_15ic5iclb90p7cr.R.iget(8708)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(8709)==0&false))) {{
            __CLR4_4_15ic5iclb90p7cr.R.inc(8710);field.setIEEEFlagsBits(DfpField.FLAG_INEXACT);
            __CLR4_4_15ic5iclb90p7cr.R.inc(8711);result = dotrap(DfpField.FLAG_INEXACT, NEXT_AFTER_TRAP, x, result);
        }

        }__CLR4_4_15ic5iclb90p7cr.R.inc(8712);return result;

    }finally{__CLR4_4_15ic5iclb90p7cr.R.flushNeeded();}}

    /** Convert the instance into a double.
     * @return a double approximating the instance
     * @see #toSplitDouble()
     */
    public double toDouble() {try{__CLR4_4_15ic5iclb90p7cr.R.inc(8713);

        __CLR4_4_15ic5iclb90p7cr.R.inc(8714);if ((((isInfinite())&&(__CLR4_4_15ic5iclb90p7cr.R.iget(8715)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(8716)==0&false))) {{
            __CLR4_4_15ic5iclb90p7cr.R.inc(8717);if ((((lessThan(getZero()))&&(__CLR4_4_15ic5iclb90p7cr.R.iget(8718)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(8719)==0&false))) {{
                __CLR4_4_15ic5iclb90p7cr.R.inc(8720);return Double.NEGATIVE_INFINITY;
            } }else {{
                __CLR4_4_15ic5iclb90p7cr.R.inc(8721);return Double.POSITIVE_INFINITY;
            }
        }}

        }__CLR4_4_15ic5iclb90p7cr.R.inc(8722);if ((((isNaN())&&(__CLR4_4_15ic5iclb90p7cr.R.iget(8723)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(8724)==0&false))) {{
            __CLR4_4_15ic5iclb90p7cr.R.inc(8725);return Double.NaN;
        }

        }__CLR4_4_15ic5iclb90p7cr.R.inc(8726);Dfp y = this;
        __CLR4_4_15ic5iclb90p7cr.R.inc(8727);boolean negate = false;
        __CLR4_4_15ic5iclb90p7cr.R.inc(8728);int cmp0 = compare(this, getZero());
        __CLR4_4_15ic5iclb90p7cr.R.inc(8729);if ((((cmp0 == 0)&&(__CLR4_4_15ic5iclb90p7cr.R.iget(8730)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(8731)==0&false))) {{
            __CLR4_4_15ic5iclb90p7cr.R.inc(8732);return (((sign < 0 )&&(__CLR4_4_15ic5iclb90p7cr.R.iget(8733)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(8734)==0&false))? -0.0 : +0.0;
        } }else {__CLR4_4_15ic5iclb90p7cr.R.inc(8735);if ((((cmp0 < 0)&&(__CLR4_4_15ic5iclb90p7cr.R.iget(8736)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(8737)==0&false))) {{
            __CLR4_4_15ic5iclb90p7cr.R.inc(8738);y = negate();
            __CLR4_4_15ic5iclb90p7cr.R.inc(8739);negate = true;
        }

        /* Find the exponent, first estimate by integer log10, then adjust.
         Should be faster than doing a natural logarithm.  */
        }}__CLR4_4_15ic5iclb90p7cr.R.inc(8740);int exponent = (int)(y.intLog10() * 3.32);
        __CLR4_4_15ic5iclb90p7cr.R.inc(8741);if ((((exponent < 0)&&(__CLR4_4_15ic5iclb90p7cr.R.iget(8742)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(8743)==0&false))) {{
            __CLR4_4_15ic5iclb90p7cr.R.inc(8744);exponent--;
        }

        }__CLR4_4_15ic5iclb90p7cr.R.inc(8745);Dfp tempDfp = DfpMath.pow(getTwo(), exponent);
        __CLR4_4_15ic5iclb90p7cr.R.inc(8746);while ((((tempDfp.lessThan(y) || tempDfp.equals(y))&&(__CLR4_4_15ic5iclb90p7cr.R.iget(8747)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(8748)==0&false))) {{
            __CLR4_4_15ic5iclb90p7cr.R.inc(8749);tempDfp = tempDfp.multiply(2);
            __CLR4_4_15ic5iclb90p7cr.R.inc(8750);exponent++;
        }
        }__CLR4_4_15ic5iclb90p7cr.R.inc(8751);exponent--;

        /* We have the exponent, now work on the mantissa */

        __CLR4_4_15ic5iclb90p7cr.R.inc(8752);y = y.divide(DfpMath.pow(getTwo(), exponent));
        __CLR4_4_15ic5iclb90p7cr.R.inc(8753);if ((((exponent > -1023)&&(__CLR4_4_15ic5iclb90p7cr.R.iget(8754)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(8755)==0&false))) {{
            __CLR4_4_15ic5iclb90p7cr.R.inc(8756);y = y.subtract(getOne());
        }

        }__CLR4_4_15ic5iclb90p7cr.R.inc(8757);if ((((exponent < -1074)&&(__CLR4_4_15ic5iclb90p7cr.R.iget(8758)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(8759)==0&false))) {{
            __CLR4_4_15ic5iclb90p7cr.R.inc(8760);return 0;
        }

        }__CLR4_4_15ic5iclb90p7cr.R.inc(8761);if ((((exponent > 1023)&&(__CLR4_4_15ic5iclb90p7cr.R.iget(8762)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(8763)==0&false))) {{
            __CLR4_4_15ic5iclb90p7cr.R.inc(8764);return (((negate )&&(__CLR4_4_15ic5iclb90p7cr.R.iget(8765)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(8766)==0&false))? Double.NEGATIVE_INFINITY : Double.POSITIVE_INFINITY;
        }


        }__CLR4_4_15ic5iclb90p7cr.R.inc(8767);y = y.multiply(newInstance(4503599627370496l)).rint();
        __CLR4_4_15ic5iclb90p7cr.R.inc(8768);String str = y.toString();
        __CLR4_4_15ic5iclb90p7cr.R.inc(8769);str = str.substring(0, str.length()-1);
        __CLR4_4_15ic5iclb90p7cr.R.inc(8770);long mantissa = Long.parseLong(str);

        __CLR4_4_15ic5iclb90p7cr.R.inc(8771);if ((((mantissa == 4503599627370496L)&&(__CLR4_4_15ic5iclb90p7cr.R.iget(8772)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(8773)==0&false))) {{
            // Handle special case where we round up to next power of two
            __CLR4_4_15ic5iclb90p7cr.R.inc(8774);mantissa = 0;
            __CLR4_4_15ic5iclb90p7cr.R.inc(8775);exponent++;
        }

        /* Its going to be subnormal, so make adjustments */
        }__CLR4_4_15ic5iclb90p7cr.R.inc(8776);if ((((exponent <= -1023)&&(__CLR4_4_15ic5iclb90p7cr.R.iget(8777)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(8778)==0&false))) {{
            __CLR4_4_15ic5iclb90p7cr.R.inc(8779);exponent--;
        }

        }__CLR4_4_15ic5iclb90p7cr.R.inc(8780);while ((((exponent < -1023)&&(__CLR4_4_15ic5iclb90p7cr.R.iget(8781)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(8782)==0&false))) {{
            __CLR4_4_15ic5iclb90p7cr.R.inc(8783);exponent++;
            __CLR4_4_15ic5iclb90p7cr.R.inc(8784);mantissa >>>= 1;
        }

        }__CLR4_4_15ic5iclb90p7cr.R.inc(8785);long bits = mantissa | ((exponent + 1023L) << 52);
        __CLR4_4_15ic5iclb90p7cr.R.inc(8786);double x = Double.longBitsToDouble(bits);

        __CLR4_4_15ic5iclb90p7cr.R.inc(8787);if ((((negate)&&(__CLR4_4_15ic5iclb90p7cr.R.iget(8788)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(8789)==0&false))) {{
            __CLR4_4_15ic5iclb90p7cr.R.inc(8790);x = -x;
        }

        }__CLR4_4_15ic5iclb90p7cr.R.inc(8791);return x;

    }finally{__CLR4_4_15ic5iclb90p7cr.R.flushNeeded();}}

    /** Convert the instance into a split double.
     * @return an array of two doubles which sum represent the instance
     * @see #toDouble()
     */
    public double[] toSplitDouble() {try{__CLR4_4_15ic5iclb90p7cr.R.inc(8792);
        __CLR4_4_15ic5iclb90p7cr.R.inc(8793);double split[] = new double[2];
        __CLR4_4_15ic5iclb90p7cr.R.inc(8794);long mask = 0xffffffffc0000000L;

        __CLR4_4_15ic5iclb90p7cr.R.inc(8795);split[0] = Double.longBitsToDouble(Double.doubleToLongBits(toDouble()) & mask);
        __CLR4_4_15ic5iclb90p7cr.R.inc(8796);split[1] = subtract(newInstance(split[0])).toDouble();

        __CLR4_4_15ic5iclb90p7cr.R.inc(8797);return split;
    }finally{__CLR4_4_15ic5iclb90p7cr.R.flushNeeded();}}

    /** {@inheritDoc}
     * @since 3.2
     */
    public double getReal() {try{__CLR4_4_15ic5iclb90p7cr.R.inc(8798);
        __CLR4_4_15ic5iclb90p7cr.R.inc(8799);return toDouble();
    }finally{__CLR4_4_15ic5iclb90p7cr.R.flushNeeded();}}

    /** {@inheritDoc}
     * @since 3.2
     */
    public Dfp add(final double a) {try{__CLR4_4_15ic5iclb90p7cr.R.inc(8800);
        __CLR4_4_15ic5iclb90p7cr.R.inc(8801);return add(newInstance(a));
    }finally{__CLR4_4_15ic5iclb90p7cr.R.flushNeeded();}}

    /** {@inheritDoc}
     * @since 3.2
     */
    public Dfp subtract(final double a) {try{__CLR4_4_15ic5iclb90p7cr.R.inc(8802);
        __CLR4_4_15ic5iclb90p7cr.R.inc(8803);return subtract(newInstance(a));
    }finally{__CLR4_4_15ic5iclb90p7cr.R.flushNeeded();}}

    /** {@inheritDoc}
     * @since 3.2
     */
    public Dfp multiply(final double a) {try{__CLR4_4_15ic5iclb90p7cr.R.inc(8804);
        __CLR4_4_15ic5iclb90p7cr.R.inc(8805);return multiply(newInstance(a));
    }finally{__CLR4_4_15ic5iclb90p7cr.R.flushNeeded();}}

    /** {@inheritDoc}
     * @since 3.2
     */
    public Dfp divide(final double a) {try{__CLR4_4_15ic5iclb90p7cr.R.inc(8806);
        __CLR4_4_15ic5iclb90p7cr.R.inc(8807);return divide(newInstance(a));
    }finally{__CLR4_4_15ic5iclb90p7cr.R.flushNeeded();}}

    /** {@inheritDoc}
     * @since 3.2
     */
    public Dfp remainder(final double a) {try{__CLR4_4_15ic5iclb90p7cr.R.inc(8808);
        __CLR4_4_15ic5iclb90p7cr.R.inc(8809);return remainder(newInstance(a));
    }finally{__CLR4_4_15ic5iclb90p7cr.R.flushNeeded();}}

    /** {@inheritDoc}
     * @since 3.2
     */
    public long round() {try{__CLR4_4_15ic5iclb90p7cr.R.inc(8810);
        __CLR4_4_15ic5iclb90p7cr.R.inc(8811);return FastMath.round(toDouble());
    }finally{__CLR4_4_15ic5iclb90p7cr.R.flushNeeded();}}

    /** {@inheritDoc}
     * @since 3.2
     */
    public Dfp signum() {try{__CLR4_4_15ic5iclb90p7cr.R.inc(8812);
        __CLR4_4_15ic5iclb90p7cr.R.inc(8813);if ((((isNaN() || isZero())&&(__CLR4_4_15ic5iclb90p7cr.R.iget(8814)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(8815)==0&false))) {{
            __CLR4_4_15ic5iclb90p7cr.R.inc(8816);return this;
        } }else {{
            __CLR4_4_15ic5iclb90p7cr.R.inc(8817);return newInstance((((sign > 0 )&&(__CLR4_4_15ic5iclb90p7cr.R.iget(8818)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(8819)==0&false))? +1 : -1);
        }
    }}finally{__CLR4_4_15ic5iclb90p7cr.R.flushNeeded();}}

    /** {@inheritDoc}
     * @since 3.2
     */
    public Dfp copySign(final Dfp s) {try{__CLR4_4_15ic5iclb90p7cr.R.inc(8820);
        __CLR4_4_15ic5iclb90p7cr.R.inc(8821);if (((((sign >= 0 && s.sign >= 0) || (sign < 0 && s.sign < 0))&&(__CLR4_4_15ic5iclb90p7cr.R.iget(8822)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(8823)==0&false))) {{ // Sign is currently OK
            __CLR4_4_15ic5iclb90p7cr.R.inc(8824);return this;
        }
        }__CLR4_4_15ic5iclb90p7cr.R.inc(8825);return negate(); // flip sign
    }finally{__CLR4_4_15ic5iclb90p7cr.R.flushNeeded();}}

    /** {@inheritDoc}
     * @since 3.2
     */
    public Dfp copySign(final double s) {try{__CLR4_4_15ic5iclb90p7cr.R.inc(8826);
        __CLR4_4_15ic5iclb90p7cr.R.inc(8827);long sb = Double.doubleToLongBits(s);
        __CLR4_4_15ic5iclb90p7cr.R.inc(8828);if (((((sign >= 0 && sb >= 0) || (sign < 0 && sb < 0))&&(__CLR4_4_15ic5iclb90p7cr.R.iget(8829)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(8830)==0&false))) {{ // Sign is currently OK
            __CLR4_4_15ic5iclb90p7cr.R.inc(8831);return this;
        }
        }__CLR4_4_15ic5iclb90p7cr.R.inc(8832);return negate(); // flip sign
    }finally{__CLR4_4_15ic5iclb90p7cr.R.flushNeeded();}}

    /** {@inheritDoc}
     * @since 3.2
     */
    public Dfp scalb(final int n) {try{__CLR4_4_15ic5iclb90p7cr.R.inc(8833);
        __CLR4_4_15ic5iclb90p7cr.R.inc(8834);return multiply(DfpMath.pow(getTwo(), n));
    }finally{__CLR4_4_15ic5iclb90p7cr.R.flushNeeded();}}

    /** {@inheritDoc}
     * @since 3.2
     */
    public Dfp hypot(final Dfp y) {try{__CLR4_4_15ic5iclb90p7cr.R.inc(8835);
        __CLR4_4_15ic5iclb90p7cr.R.inc(8836);return multiply(this).add(y.multiply(y)).sqrt();
    }finally{__CLR4_4_15ic5iclb90p7cr.R.flushNeeded();}}

    /** {@inheritDoc}
     * @since 3.2
     */
    public Dfp cbrt() {try{__CLR4_4_15ic5iclb90p7cr.R.inc(8837);
        __CLR4_4_15ic5iclb90p7cr.R.inc(8838);return rootN(3);
    }finally{__CLR4_4_15ic5iclb90p7cr.R.flushNeeded();}}

    /** {@inheritDoc}
     * @since 3.2
     */
    public Dfp rootN(final int n) {try{__CLR4_4_15ic5iclb90p7cr.R.inc(8839);
        __CLR4_4_15ic5iclb90p7cr.R.inc(8840);return ((((sign >= 0) )&&(__CLR4_4_15ic5iclb90p7cr.R.iget(8841)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(8842)==0&false))?
               DfpMath.pow(this, getOne().divide(n)) :
               DfpMath.pow(negate(), getOne().divide(n)).negate();
    }finally{__CLR4_4_15ic5iclb90p7cr.R.flushNeeded();}}

    /** {@inheritDoc}
     * @since 3.2
     */
    public Dfp pow(final double p) {try{__CLR4_4_15ic5iclb90p7cr.R.inc(8843);
        __CLR4_4_15ic5iclb90p7cr.R.inc(8844);return DfpMath.pow(this, newInstance(p));
    }finally{__CLR4_4_15ic5iclb90p7cr.R.flushNeeded();}}

    /** {@inheritDoc}
     * @since 3.2
     */
    public Dfp pow(final int n) {try{__CLR4_4_15ic5iclb90p7cr.R.inc(8845);
        __CLR4_4_15ic5iclb90p7cr.R.inc(8846);return DfpMath.pow(this, n);
    }finally{__CLR4_4_15ic5iclb90p7cr.R.flushNeeded();}}

    /** {@inheritDoc}
     * @since 3.2
     */
    public Dfp pow(final Dfp e) {try{__CLR4_4_15ic5iclb90p7cr.R.inc(8847);
        __CLR4_4_15ic5iclb90p7cr.R.inc(8848);return DfpMath.pow(this, e);
    }finally{__CLR4_4_15ic5iclb90p7cr.R.flushNeeded();}}

    /** {@inheritDoc}
     * @since 3.2
     */
    public Dfp exp() {try{__CLR4_4_15ic5iclb90p7cr.R.inc(8849);
        __CLR4_4_15ic5iclb90p7cr.R.inc(8850);return DfpMath.exp(this);
    }finally{__CLR4_4_15ic5iclb90p7cr.R.flushNeeded();}}

    /** {@inheritDoc}
     * @since 3.2
     */
    public Dfp expm1() {try{__CLR4_4_15ic5iclb90p7cr.R.inc(8851);
        __CLR4_4_15ic5iclb90p7cr.R.inc(8852);return DfpMath.exp(this).subtract(getOne());
    }finally{__CLR4_4_15ic5iclb90p7cr.R.flushNeeded();}}

    /** {@inheritDoc}
     * @since 3.2
     */
    public Dfp log() {try{__CLR4_4_15ic5iclb90p7cr.R.inc(8853);
        __CLR4_4_15ic5iclb90p7cr.R.inc(8854);return DfpMath.log(this);
    }finally{__CLR4_4_15ic5iclb90p7cr.R.flushNeeded();}}

    /** {@inheritDoc}
     * @since 3.2
     */
    public Dfp log1p() {try{__CLR4_4_15ic5iclb90p7cr.R.inc(8855);
        __CLR4_4_15ic5iclb90p7cr.R.inc(8856);return DfpMath.log(this.add(getOne()));
    }finally{__CLR4_4_15ic5iclb90p7cr.R.flushNeeded();}}

//  TODO: deactivate this implementation (and return type) in 4.0
    /** Get the exponent of the greatest power of 10 that is less than or equal to abs(this).
     *  @return integer base 10 logarithm
     *  @deprecated as of 3.2, replaced by {@link #intLog10()}, in 4.0 the return type
     *  will be changed to Dfp
     */
    @Deprecated
    public int log10()  {try{__CLR4_4_15ic5iclb90p7cr.R.inc(8857);
        __CLR4_4_15ic5iclb90p7cr.R.inc(8858);return intLog10();
    }finally{__CLR4_4_15ic5iclb90p7cr.R.flushNeeded();}}

//    TODO: activate this implementation (and return type) in 4.0
//    /** {@inheritDoc}
//     * @since 3.2
//     */
//    public Dfp log10() {
//        return DfpMath.log(this).divide(DfpMath.log(newInstance(10)));
//    }

    /** {@inheritDoc}
     * @since 3.2
     */
    public Dfp cos() {try{__CLR4_4_15ic5iclb90p7cr.R.inc(8859);
        __CLR4_4_15ic5iclb90p7cr.R.inc(8860);return DfpMath.cos(this);
    }finally{__CLR4_4_15ic5iclb90p7cr.R.flushNeeded();}}

    /** {@inheritDoc}
     * @since 3.2
     */
    public Dfp sin() {try{__CLR4_4_15ic5iclb90p7cr.R.inc(8861);
        __CLR4_4_15ic5iclb90p7cr.R.inc(8862);return DfpMath.sin(this);
    }finally{__CLR4_4_15ic5iclb90p7cr.R.flushNeeded();}}

    /** {@inheritDoc}
     * @since 3.2
     */
    public Dfp tan() {try{__CLR4_4_15ic5iclb90p7cr.R.inc(8863);
        __CLR4_4_15ic5iclb90p7cr.R.inc(8864);return DfpMath.tan(this);
    }finally{__CLR4_4_15ic5iclb90p7cr.R.flushNeeded();}}

    /** {@inheritDoc}
     * @since 3.2
     */
    public Dfp acos() {try{__CLR4_4_15ic5iclb90p7cr.R.inc(8865);
        __CLR4_4_15ic5iclb90p7cr.R.inc(8866);return DfpMath.acos(this);
    }finally{__CLR4_4_15ic5iclb90p7cr.R.flushNeeded();}}

    /** {@inheritDoc}
     * @since 3.2
     */
    public Dfp asin() {try{__CLR4_4_15ic5iclb90p7cr.R.inc(8867);
        __CLR4_4_15ic5iclb90p7cr.R.inc(8868);return DfpMath.asin(this);
    }finally{__CLR4_4_15ic5iclb90p7cr.R.flushNeeded();}}

    /** {@inheritDoc}
     * @since 3.2
     */
    public Dfp atan() {try{__CLR4_4_15ic5iclb90p7cr.R.inc(8869);
        __CLR4_4_15ic5iclb90p7cr.R.inc(8870);return DfpMath.atan(this);
    }finally{__CLR4_4_15ic5iclb90p7cr.R.flushNeeded();}}

    /** {@inheritDoc}
     * @since 3.2
     */
    public Dfp atan2(final Dfp x)
        throws DimensionMismatchException {try{__CLR4_4_15ic5iclb90p7cr.R.inc(8871);

        // compute r = sqrt(x^2+y^2)
        __CLR4_4_15ic5iclb90p7cr.R.inc(8872);final Dfp r = x.multiply(x).add(multiply(this)).sqrt();

        __CLR4_4_15ic5iclb90p7cr.R.inc(8873);if ((((x.sign >= 0)&&(__CLR4_4_15ic5iclb90p7cr.R.iget(8874)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(8875)==0&false))) {{

            // compute atan2(y, x) = 2 atan(y / (r + x))
            __CLR4_4_15ic5iclb90p7cr.R.inc(8876);return getTwo().multiply(divide(r.add(x)).atan());

        } }else {{

            // compute atan2(y, x) = +/- pi - 2 atan(y / (r - x))
            __CLR4_4_15ic5iclb90p7cr.R.inc(8877);final Dfp tmp = getTwo().multiply(divide(r.subtract(x)).atan());
            __CLR4_4_15ic5iclb90p7cr.R.inc(8878);final Dfp pmPi = newInstance(((((tmp.sign <= 0) )&&(__CLR4_4_15ic5iclb90p7cr.R.iget(8879)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(8880)==0&false))? -FastMath.PI : FastMath.PI);
            __CLR4_4_15ic5iclb90p7cr.R.inc(8881);return pmPi.subtract(tmp);

        }

    }}finally{__CLR4_4_15ic5iclb90p7cr.R.flushNeeded();}}

    /** {@inheritDoc}
     * @since 3.2
     */
    public Dfp cosh() {try{__CLR4_4_15ic5iclb90p7cr.R.inc(8882);
        __CLR4_4_15ic5iclb90p7cr.R.inc(8883);return DfpMath.exp(this).add(DfpMath.exp(negate())).divide(2);
    }finally{__CLR4_4_15ic5iclb90p7cr.R.flushNeeded();}}

    /** {@inheritDoc}
     * @since 3.2
     */
    public Dfp sinh() {try{__CLR4_4_15ic5iclb90p7cr.R.inc(8884);
        __CLR4_4_15ic5iclb90p7cr.R.inc(8885);return DfpMath.exp(this).subtract(DfpMath.exp(negate())).divide(2);
    }finally{__CLR4_4_15ic5iclb90p7cr.R.flushNeeded();}}

    /** {@inheritDoc}
     * @since 3.2
     */
    public Dfp tanh() {try{__CLR4_4_15ic5iclb90p7cr.R.inc(8886);
        __CLR4_4_15ic5iclb90p7cr.R.inc(8887);final Dfp ePlus  = DfpMath.exp(this);
        __CLR4_4_15ic5iclb90p7cr.R.inc(8888);final Dfp eMinus = DfpMath.exp(negate());
        __CLR4_4_15ic5iclb90p7cr.R.inc(8889);return ePlus.subtract(eMinus).divide(ePlus.add(eMinus));
    }finally{__CLR4_4_15ic5iclb90p7cr.R.flushNeeded();}}

    /** {@inheritDoc}
     * @since 3.2
     */
    public Dfp acosh() {try{__CLR4_4_15ic5iclb90p7cr.R.inc(8890);
        __CLR4_4_15ic5iclb90p7cr.R.inc(8891);return multiply(this).subtract(getOne()).sqrt().add(this).log();
    }finally{__CLR4_4_15ic5iclb90p7cr.R.flushNeeded();}}

    /** {@inheritDoc}
     * @since 3.2
     */
    public Dfp asinh() {try{__CLR4_4_15ic5iclb90p7cr.R.inc(8892);
        __CLR4_4_15ic5iclb90p7cr.R.inc(8893);return multiply(this).add(getOne()).sqrt().add(this).log();
    }finally{__CLR4_4_15ic5iclb90p7cr.R.flushNeeded();}}

    /** {@inheritDoc}
     * @since 3.2
     */
    public Dfp atanh() {try{__CLR4_4_15ic5iclb90p7cr.R.inc(8894);
        __CLR4_4_15ic5iclb90p7cr.R.inc(8895);return getOne().add(this).divide(getOne().subtract(this)).log().divide(2);
    }finally{__CLR4_4_15ic5iclb90p7cr.R.flushNeeded();}}

    /** {@inheritDoc}
     * @since 3.2
     */
    public Dfp linearCombination(final Dfp[] a, final Dfp[] b)
        throws DimensionMismatchException {try{__CLR4_4_15ic5iclb90p7cr.R.inc(8896);
        __CLR4_4_15ic5iclb90p7cr.R.inc(8897);if ((((a.length != b.length)&&(__CLR4_4_15ic5iclb90p7cr.R.iget(8898)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(8899)==0&false))) {{
            __CLR4_4_15ic5iclb90p7cr.R.inc(8900);throw new DimensionMismatchException(a.length, b.length);
        }
        }__CLR4_4_15ic5iclb90p7cr.R.inc(8901);Dfp r = getZero();
        __CLR4_4_15ic5iclb90p7cr.R.inc(8902);for (int i = 0; (((i < a.length)&&(__CLR4_4_15ic5iclb90p7cr.R.iget(8903)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(8904)==0&false)); ++i) {{
            __CLR4_4_15ic5iclb90p7cr.R.inc(8905);r = r.add(a[i].multiply(b[i]));
        }
        }__CLR4_4_15ic5iclb90p7cr.R.inc(8906);return r;
    }finally{__CLR4_4_15ic5iclb90p7cr.R.flushNeeded();}}

    /** {@inheritDoc}
     * @since 3.2
     */
    public Dfp linearCombination(final double[] a, final Dfp[] b)
        throws DimensionMismatchException {try{__CLR4_4_15ic5iclb90p7cr.R.inc(8907);
        __CLR4_4_15ic5iclb90p7cr.R.inc(8908);if ((((a.length != b.length)&&(__CLR4_4_15ic5iclb90p7cr.R.iget(8909)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(8910)==0&false))) {{
            __CLR4_4_15ic5iclb90p7cr.R.inc(8911);throw new DimensionMismatchException(a.length, b.length);
        }
        }__CLR4_4_15ic5iclb90p7cr.R.inc(8912);Dfp r = getZero();
        __CLR4_4_15ic5iclb90p7cr.R.inc(8913);for (int i = 0; (((i < a.length)&&(__CLR4_4_15ic5iclb90p7cr.R.iget(8914)!=0|true))||(__CLR4_4_15ic5iclb90p7cr.R.iget(8915)==0&false)); ++i) {{
            __CLR4_4_15ic5iclb90p7cr.R.inc(8916);r = r.add(b[i].multiply(a[i]));
        }
        }__CLR4_4_15ic5iclb90p7cr.R.inc(8917);return r;
    }finally{__CLR4_4_15ic5iclb90p7cr.R.flushNeeded();}}

    /** {@inheritDoc}
     * @since 3.2
     */
    public Dfp linearCombination(final Dfp a1, final Dfp b1, final Dfp a2, final Dfp b2) {try{__CLR4_4_15ic5iclb90p7cr.R.inc(8918);
        __CLR4_4_15ic5iclb90p7cr.R.inc(8919);return a1.multiply(b1).add(a2.multiply(b2));
    }finally{__CLR4_4_15ic5iclb90p7cr.R.flushNeeded();}}

    /** {@inheritDoc}
     * @since 3.2
     */
    public Dfp linearCombination(final double a1, final Dfp b1, final double a2, final Dfp b2) {try{__CLR4_4_15ic5iclb90p7cr.R.inc(8920);
        __CLR4_4_15ic5iclb90p7cr.R.inc(8921);return b1.multiply(a1).add(b2.multiply(a2));
    }finally{__CLR4_4_15ic5iclb90p7cr.R.flushNeeded();}}

    /** {@inheritDoc}
     * @since 3.2
     */
    public Dfp linearCombination(final Dfp a1, final Dfp b1,
                                 final Dfp a2, final Dfp b2,
                                 final Dfp a3, final Dfp b3) {try{__CLR4_4_15ic5iclb90p7cr.R.inc(8922);
        __CLR4_4_15ic5iclb90p7cr.R.inc(8923);return a1.multiply(b1).add(a2.multiply(b2)).add(a3.multiply(b3));
    }finally{__CLR4_4_15ic5iclb90p7cr.R.flushNeeded();}}

    /** {@inheritDoc}
     * @since 3.2
     */
    public Dfp linearCombination(final double a1, final Dfp b1,
                                 final double a2, final Dfp b2,
                                 final double a3, final Dfp b3) {try{__CLR4_4_15ic5iclb90p7cr.R.inc(8924);
        __CLR4_4_15ic5iclb90p7cr.R.inc(8925);return b1.multiply(a1).add(b2.multiply(a2)).add(b3.multiply(a3));
    }finally{__CLR4_4_15ic5iclb90p7cr.R.flushNeeded();}}

    /** {@inheritDoc}
     * @since 3.2
     */
    public Dfp linearCombination(final Dfp a1, final Dfp b1, final Dfp a2, final Dfp b2,
                                 final Dfp a3, final Dfp b3, final Dfp a4, final Dfp b4) {try{__CLR4_4_15ic5iclb90p7cr.R.inc(8926);
        __CLR4_4_15ic5iclb90p7cr.R.inc(8927);return a1.multiply(b1).add(a2.multiply(b2)).add(a3.multiply(b3)).add(a4.multiply(b4));
    }finally{__CLR4_4_15ic5iclb90p7cr.R.flushNeeded();}}

    /** {@inheritDoc}
     * @since 3.2
     */
    public Dfp linearCombination(final double a1, final Dfp b1, final double a2, final Dfp b2,
                                 final double a3, final Dfp b3, final double a4, final Dfp b4) {try{__CLR4_4_15ic5iclb90p7cr.R.inc(8928);
        __CLR4_4_15ic5iclb90p7cr.R.inc(8929);return b1.multiply(a1).add(b2.multiply(a2)).add(b3.multiply(a3)).add(b4.multiply(a4));
    }finally{__CLR4_4_15ic5iclb90p7cr.R.flushNeeded();}}

}
