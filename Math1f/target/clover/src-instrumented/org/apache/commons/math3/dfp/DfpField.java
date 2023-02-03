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

import org.apache.commons.math3.Field;
import org.apache.commons.math3.FieldElement;

/** Field for Decimal floating point instances.
 * @version $Id$
 * @since 2.2
 */
public class DfpField implements Field<Dfp> {public static class __CLR4_4_171v71vlb90p7e4{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,9371,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** Enumerate for rounding modes. */
    public enum RoundingMode {

        /** Rounds toward zero (truncation). */
        ROUND_DOWN,

        /** Rounds away from zero if discarded digit is non-zero. */
        ROUND_UP,

        /** Rounds towards nearest unless both are equidistant in which case it rounds away from zero. */
        ROUND_HALF_UP,

        /** Rounds towards nearest unless both are equidistant in which case it rounds toward zero. */
        ROUND_HALF_DOWN,

        /** Rounds towards nearest unless both are equidistant in which case it rounds toward the even neighbor.
         * This is the default as  specified by IEEE 854-1987
         */
        ROUND_HALF_EVEN,

        /** Rounds towards nearest unless both are equidistant in which case it rounds toward the odd neighbor.  */
        ROUND_HALF_ODD,

        /** Rounds towards positive infinity. */
        ROUND_CEIL,

        /** Rounds towards negative infinity. */
        ROUND_FLOOR;

    }

    /** IEEE 854-1987 flag for invalid operation. */
    public static final int FLAG_INVALID   =  1;

    /** IEEE 854-1987 flag for division by zero. */
    public static final int FLAG_DIV_ZERO  =  2;

    /** IEEE 854-1987 flag for overflow. */
    public static final int FLAG_OVERFLOW  =  4;

    /** IEEE 854-1987 flag for underflow. */
    public static final int FLAG_UNDERFLOW =  8;

    /** IEEE 854-1987 flag for inexact result. */
    public static final int FLAG_INEXACT   = 16;

    /** High precision string representation of &radic;2. */
    private static String sqr2String;

    // Note: the static strings are set up (once) by the ctor and @GuardedBy("DfpField.class")

    /** High precision string representation of &radic;2 / 2. */
    private static String sqr2ReciprocalString;

    /** High precision string representation of &radic;3. */
    private static String sqr3String;

    /** High precision string representation of &radic;3 / 3. */
    private static String sqr3ReciprocalString;

    /** High precision string representation of &pi;. */
    private static String piString;

    /** High precision string representation of e. */
    private static String eString;

    /** High precision string representation of ln(2). */
    private static String ln2String;

    /** High precision string representation of ln(5). */
    private static String ln5String;

    /** High precision string representation of ln(10). */
    private static String ln10String;

    /** The number of radix digits.
     * Note these depend on the radix which is 10000 digits,
     * so each one is equivalent to 4 decimal digits.
     */
    private final int radixDigits;

    /** A {@link Dfp} with value 0. */
    private final Dfp zero;

    /** A {@link Dfp} with value 1. */
    private final Dfp one;

    /** A {@link Dfp} with value 2. */
    private final Dfp two;

    /** A {@link Dfp} with value &radic;2. */
    private final Dfp sqr2;

    /** A two elements {@link Dfp} array with value &radic;2 split in two pieces. */
    private final Dfp[] sqr2Split;

    /** A {@link Dfp} with value &radic;2 / 2. */
    private final Dfp sqr2Reciprocal;

    /** A {@link Dfp} with value &radic;3. */
    private final Dfp sqr3;

    /** A {@link Dfp} with value &radic;3 / 3. */
    private final Dfp sqr3Reciprocal;

    /** A {@link Dfp} with value &pi;. */
    private final Dfp pi;

    /** A two elements {@link Dfp} array with value &pi; split in two pieces. */
    private final Dfp[] piSplit;

    /** A {@link Dfp} with value e. */
    private final Dfp e;

    /** A two elements {@link Dfp} array with value e split in two pieces. */
    private final Dfp[] eSplit;

    /** A {@link Dfp} with value ln(2). */
    private final Dfp ln2;

    /** A two elements {@link Dfp} array with value ln(2) split in two pieces. */
    private final Dfp[] ln2Split;

    /** A {@link Dfp} with value ln(5). */
    private final Dfp ln5;

    /** A two elements {@link Dfp} array with value ln(5) split in two pieces. */
    private final Dfp[] ln5Split;

    /** A {@link Dfp} with value ln(10). */
    private final Dfp ln10;

    /** Current rounding mode. */
    private RoundingMode rMode;

    /** IEEE 854-1987 signals. */
    private int ieeeFlags;

    /** Create a factory for the specified number of radix digits.
     * <p>
     * Note that since the {@link Dfp} class uses 10000 as its radix, each radix
     * digit is equivalent to 4 decimal digits. This implies that asking for
     * 13, 14, 15 or 16 decimal digits will really lead to a 4 radix 10000 digits in
     * all cases.
     * </p>
     * @param decimalDigits minimal number of decimal digits.
     */
    public DfpField(final int decimalDigits) {
        this(decimalDigits, true);__CLR4_4_171v71vlb90p7e4.R.inc(9140);try{__CLR4_4_171v71vlb90p7e4.R.inc(9139);
    }finally{__CLR4_4_171v71vlb90p7e4.R.flushNeeded();}}

    /** Create a factory for the specified number of radix digits.
     * <p>
     * Note that since the {@link Dfp} class uses 10000 as its radix, each radix
     * digit is equivalent to 4 decimal digits. This implies that asking for
     * 13, 14, 15 or 16 decimal digits will really lead to a 4 radix 10000 digits in
     * all cases.
     * </p>
     * @param decimalDigits minimal number of decimal digits
     * @param computeConstants if true, the transcendental constants for the given precision
     * must be computed (setting this flag to false is RESERVED for the internal recursive call)
     */
    private DfpField(final int decimalDigits, final boolean computeConstants) {try{__CLR4_4_171v71vlb90p7e4.R.inc(9141);

        __CLR4_4_171v71vlb90p7e4.R.inc(9142);this.radixDigits = ((((decimalDigits < 13) )&&(__CLR4_4_171v71vlb90p7e4.R.iget(9143)!=0|true))||(__CLR4_4_171v71vlb90p7e4.R.iget(9144)==0&false))? 4 : (decimalDigits + 3) / 4;
        __CLR4_4_171v71vlb90p7e4.R.inc(9145);this.rMode       = RoundingMode.ROUND_HALF_EVEN;
        __CLR4_4_171v71vlb90p7e4.R.inc(9146);this.ieeeFlags   = 0;
        __CLR4_4_171v71vlb90p7e4.R.inc(9147);this.zero        = new Dfp(this, 0);
        __CLR4_4_171v71vlb90p7e4.R.inc(9148);this.one         = new Dfp(this, 1);
        __CLR4_4_171v71vlb90p7e4.R.inc(9149);this.two         = new Dfp(this, 2);

        __CLR4_4_171v71vlb90p7e4.R.inc(9150);if ((((computeConstants)&&(__CLR4_4_171v71vlb90p7e4.R.iget(9151)!=0|true))||(__CLR4_4_171v71vlb90p7e4.R.iget(9152)==0&false))) {{
            // set up transcendental constants
            __CLR4_4_171v71vlb90p7e4.R.inc(9153);synchronized (DfpField.class) {

                // as a heuristic to circumvent Table-Maker's Dilemma, we set the string
                // representation of the constants to be at least 3 times larger than the
                // number of decimal digits, also as an attempt to really compute these
                // constants only once, we set a minimum number of digits
                __CLR4_4_171v71vlb90p7e4.R.inc(9154);computeStringConstants(((((decimalDigits < 67) )&&(__CLR4_4_171v71vlb90p7e4.R.iget(9155)!=0|true))||(__CLR4_4_171v71vlb90p7e4.R.iget(9156)==0&false))? 200 : (3 * decimalDigits));

                // set up the constants at current field accuracy
                __CLR4_4_171v71vlb90p7e4.R.inc(9157);sqr2           = new Dfp(this, sqr2String);
                __CLR4_4_171v71vlb90p7e4.R.inc(9158);sqr2Split      = split(sqr2String);
                __CLR4_4_171v71vlb90p7e4.R.inc(9159);sqr2Reciprocal = new Dfp(this, sqr2ReciprocalString);
                __CLR4_4_171v71vlb90p7e4.R.inc(9160);sqr3           = new Dfp(this, sqr3String);
                __CLR4_4_171v71vlb90p7e4.R.inc(9161);sqr3Reciprocal = new Dfp(this, sqr3ReciprocalString);
                __CLR4_4_171v71vlb90p7e4.R.inc(9162);pi             = new Dfp(this, piString);
                __CLR4_4_171v71vlb90p7e4.R.inc(9163);piSplit        = split(piString);
                __CLR4_4_171v71vlb90p7e4.R.inc(9164);e              = new Dfp(this, eString);
                __CLR4_4_171v71vlb90p7e4.R.inc(9165);eSplit         = split(eString);
                __CLR4_4_171v71vlb90p7e4.R.inc(9166);ln2            = new Dfp(this, ln2String);
                __CLR4_4_171v71vlb90p7e4.R.inc(9167);ln2Split       = split(ln2String);
                __CLR4_4_171v71vlb90p7e4.R.inc(9168);ln5            = new Dfp(this, ln5String);
                __CLR4_4_171v71vlb90p7e4.R.inc(9169);ln5Split       = split(ln5String);
                __CLR4_4_171v71vlb90p7e4.R.inc(9170);ln10           = new Dfp(this, ln10String);

            }
        } }else {{
            // dummy settings for unused constants
            __CLR4_4_171v71vlb90p7e4.R.inc(9171);sqr2           = null;
            __CLR4_4_171v71vlb90p7e4.R.inc(9172);sqr2Split      = null;
            __CLR4_4_171v71vlb90p7e4.R.inc(9173);sqr2Reciprocal = null;
            __CLR4_4_171v71vlb90p7e4.R.inc(9174);sqr3           = null;
            __CLR4_4_171v71vlb90p7e4.R.inc(9175);sqr3Reciprocal = null;
            __CLR4_4_171v71vlb90p7e4.R.inc(9176);pi             = null;
            __CLR4_4_171v71vlb90p7e4.R.inc(9177);piSplit        = null;
            __CLR4_4_171v71vlb90p7e4.R.inc(9178);e              = null;
            __CLR4_4_171v71vlb90p7e4.R.inc(9179);eSplit         = null;
            __CLR4_4_171v71vlb90p7e4.R.inc(9180);ln2            = null;
            __CLR4_4_171v71vlb90p7e4.R.inc(9181);ln2Split       = null;
            __CLR4_4_171v71vlb90p7e4.R.inc(9182);ln5            = null;
            __CLR4_4_171v71vlb90p7e4.R.inc(9183);ln5Split       = null;
            __CLR4_4_171v71vlb90p7e4.R.inc(9184);ln10           = null;
        }

    }}finally{__CLR4_4_171v71vlb90p7e4.R.flushNeeded();}}

    /** Get the number of radix digits of the {@link Dfp} instances built by this factory.
     * @return number of radix digits
     */
    public int getRadixDigits() {try{__CLR4_4_171v71vlb90p7e4.R.inc(9185);
        __CLR4_4_171v71vlb90p7e4.R.inc(9186);return radixDigits;
    }finally{__CLR4_4_171v71vlb90p7e4.R.flushNeeded();}}

    /** Set the rounding mode.
     *  If not set, the default value is {@link RoundingMode#ROUND_HALF_EVEN}.
     * @param mode desired rounding mode
     * Note that the rounding mode is common to all {@link Dfp} instances
     * belonging to the current {@link DfpField} in the system and will
     * affect all future calculations.
     */
    public void setRoundingMode(final RoundingMode mode) {try{__CLR4_4_171v71vlb90p7e4.R.inc(9187);
        __CLR4_4_171v71vlb90p7e4.R.inc(9188);rMode = mode;
    }finally{__CLR4_4_171v71vlb90p7e4.R.flushNeeded();}}

    /** Get the current rounding mode.
     * @return current rounding mode
     */
    public RoundingMode getRoundingMode() {try{__CLR4_4_171v71vlb90p7e4.R.inc(9189);
        __CLR4_4_171v71vlb90p7e4.R.inc(9190);return rMode;
    }finally{__CLR4_4_171v71vlb90p7e4.R.flushNeeded();}}

    /** Get the IEEE 854 status flags.
     * @return IEEE 854 status flags
     * @see #clearIEEEFlags()
     * @see #setIEEEFlags(int)
     * @see #setIEEEFlagsBits(int)
     * @see #FLAG_INVALID
     * @see #FLAG_DIV_ZERO
     * @see #FLAG_OVERFLOW
     * @see #FLAG_UNDERFLOW
     * @see #FLAG_INEXACT
     */
    public int getIEEEFlags() {try{__CLR4_4_171v71vlb90p7e4.R.inc(9191);
        __CLR4_4_171v71vlb90p7e4.R.inc(9192);return ieeeFlags;
    }finally{__CLR4_4_171v71vlb90p7e4.R.flushNeeded();}}

    /** Clears the IEEE 854 status flags.
     * @see #getIEEEFlags()
     * @see #setIEEEFlags(int)
     * @see #setIEEEFlagsBits(int)
     * @see #FLAG_INVALID
     * @see #FLAG_DIV_ZERO
     * @see #FLAG_OVERFLOW
     * @see #FLAG_UNDERFLOW
     * @see #FLAG_INEXACT
     */
    public void clearIEEEFlags() {try{__CLR4_4_171v71vlb90p7e4.R.inc(9193);
        __CLR4_4_171v71vlb90p7e4.R.inc(9194);ieeeFlags = 0;
    }finally{__CLR4_4_171v71vlb90p7e4.R.flushNeeded();}}

    /** Sets the IEEE 854 status flags.
     * @param flags desired value for the flags
     * @see #getIEEEFlags()
     * @see #clearIEEEFlags()
     * @see #setIEEEFlagsBits(int)
     * @see #FLAG_INVALID
     * @see #FLAG_DIV_ZERO
     * @see #FLAG_OVERFLOW
     * @see #FLAG_UNDERFLOW
     * @see #FLAG_INEXACT
     */
    public void setIEEEFlags(final int flags) {try{__CLR4_4_171v71vlb90p7e4.R.inc(9195);
        __CLR4_4_171v71vlb90p7e4.R.inc(9196);ieeeFlags = flags & (FLAG_INVALID | FLAG_DIV_ZERO | FLAG_OVERFLOW | FLAG_UNDERFLOW | FLAG_INEXACT);
    }finally{__CLR4_4_171v71vlb90p7e4.R.flushNeeded();}}

    /** Sets some bits in the IEEE 854 status flags, without changing the already set bits.
     * <p>
     * Calling this method is equivalent to call {@code setIEEEFlags(getIEEEFlags() | bits)}
     * </p>
     * @param bits bits to set
     * @see #getIEEEFlags()
     * @see #clearIEEEFlags()
     * @see #setIEEEFlags(int)
     * @see #FLAG_INVALID
     * @see #FLAG_DIV_ZERO
     * @see #FLAG_OVERFLOW
     * @see #FLAG_UNDERFLOW
     * @see #FLAG_INEXACT
     */
    public void setIEEEFlagsBits(final int bits) {try{__CLR4_4_171v71vlb90p7e4.R.inc(9197);
        __CLR4_4_171v71vlb90p7e4.R.inc(9198);ieeeFlags |= bits & (FLAG_INVALID | FLAG_DIV_ZERO | FLAG_OVERFLOW | FLAG_UNDERFLOW | FLAG_INEXACT);
    }finally{__CLR4_4_171v71vlb90p7e4.R.flushNeeded();}}

    /** Makes a {@link Dfp} with a value of 0.
     * @return a new {@link Dfp} with a value of 0
     */
    public Dfp newDfp() {try{__CLR4_4_171v71vlb90p7e4.R.inc(9199);
        __CLR4_4_171v71vlb90p7e4.R.inc(9200);return new Dfp(this);
    }finally{__CLR4_4_171v71vlb90p7e4.R.flushNeeded();}}

    /** Create an instance from a byte value.
     * @param x value to convert to an instance
     * @return a new {@link Dfp} with the same value as x
     */
    public Dfp newDfp(final byte x) {try{__CLR4_4_171v71vlb90p7e4.R.inc(9201);
        __CLR4_4_171v71vlb90p7e4.R.inc(9202);return new Dfp(this, x);
    }finally{__CLR4_4_171v71vlb90p7e4.R.flushNeeded();}}

    /** Create an instance from an int value.
     * @param x value to convert to an instance
     * @return a new {@link Dfp} with the same value as x
     */
    public Dfp newDfp(final int x) {try{__CLR4_4_171v71vlb90p7e4.R.inc(9203);
        __CLR4_4_171v71vlb90p7e4.R.inc(9204);return new Dfp(this, x);
    }finally{__CLR4_4_171v71vlb90p7e4.R.flushNeeded();}}

    /** Create an instance from a long value.
     * @param x value to convert to an instance
     * @return a new {@link Dfp} with the same value as x
     */
    public Dfp newDfp(final long x) {try{__CLR4_4_171v71vlb90p7e4.R.inc(9205);
        __CLR4_4_171v71vlb90p7e4.R.inc(9206);return new Dfp(this, x);
    }finally{__CLR4_4_171v71vlb90p7e4.R.flushNeeded();}}

    /** Create an instance from a double value.
     * @param x value to convert to an instance
     * @return a new {@link Dfp} with the same value as x
     */
    public Dfp newDfp(final double x) {try{__CLR4_4_171v71vlb90p7e4.R.inc(9207);
        __CLR4_4_171v71vlb90p7e4.R.inc(9208);return new Dfp(this, x);
    }finally{__CLR4_4_171v71vlb90p7e4.R.flushNeeded();}}

    /** Copy constructor.
     * @param d instance to copy
     * @return a new {@link Dfp} with the same value as d
     */
    public Dfp newDfp(Dfp d) {try{__CLR4_4_171v71vlb90p7e4.R.inc(9209);
        __CLR4_4_171v71vlb90p7e4.R.inc(9210);return new Dfp(d);
    }finally{__CLR4_4_171v71vlb90p7e4.R.flushNeeded();}}

    /** Create a {@link Dfp} given a String representation.
     * @param s string representation of the instance
     * @return a new {@link Dfp} parsed from specified string
     */
    public Dfp newDfp(final String s) {try{__CLR4_4_171v71vlb90p7e4.R.inc(9211);
        __CLR4_4_171v71vlb90p7e4.R.inc(9212);return new Dfp(this, s);
    }finally{__CLR4_4_171v71vlb90p7e4.R.flushNeeded();}}

    /** Creates a {@link Dfp} with a non-finite value.
     * @param sign sign of the Dfp to create
     * @param nans code of the value, must be one of {@link Dfp#INFINITE},
     * {@link Dfp#SNAN},  {@link Dfp#QNAN}
     * @return a new {@link Dfp} with a non-finite value
     */
    public Dfp newDfp(final byte sign, final byte nans) {try{__CLR4_4_171v71vlb90p7e4.R.inc(9213);
        __CLR4_4_171v71vlb90p7e4.R.inc(9214);return new Dfp(this, sign, nans);
    }finally{__CLR4_4_171v71vlb90p7e4.R.flushNeeded();}}

    /** Get the constant 0.
     * @return a {@link Dfp} with value 0
     */
    public Dfp getZero() {try{__CLR4_4_171v71vlb90p7e4.R.inc(9215);
        __CLR4_4_171v71vlb90p7e4.R.inc(9216);return zero;
    }finally{__CLR4_4_171v71vlb90p7e4.R.flushNeeded();}}

    /** Get the constant 1.
     * @return a {@link Dfp} with value 1
     */
    public Dfp getOne() {try{__CLR4_4_171v71vlb90p7e4.R.inc(9217);
        __CLR4_4_171v71vlb90p7e4.R.inc(9218);return one;
    }finally{__CLR4_4_171v71vlb90p7e4.R.flushNeeded();}}

    /** {@inheritDoc} */
    public Class<? extends FieldElement<Dfp>> getRuntimeClass() {try{__CLR4_4_171v71vlb90p7e4.R.inc(9219);
        __CLR4_4_171v71vlb90p7e4.R.inc(9220);return Dfp.class;
    }finally{__CLR4_4_171v71vlb90p7e4.R.flushNeeded();}}

    /** Get the constant 2.
     * @return a {@link Dfp} with value 2
     */
    public Dfp getTwo() {try{__CLR4_4_171v71vlb90p7e4.R.inc(9221);
        __CLR4_4_171v71vlb90p7e4.R.inc(9222);return two;
    }finally{__CLR4_4_171v71vlb90p7e4.R.flushNeeded();}}

    /** Get the constant &radic;2.
     * @return a {@link Dfp} with value &radic;2
     */
    public Dfp getSqr2() {try{__CLR4_4_171v71vlb90p7e4.R.inc(9223);
        __CLR4_4_171v71vlb90p7e4.R.inc(9224);return sqr2;
    }finally{__CLR4_4_171v71vlb90p7e4.R.flushNeeded();}}

    /** Get the constant &radic;2 split in two pieces.
     * @return a {@link Dfp} with value &radic;2 split in two pieces
     */
    public Dfp[] getSqr2Split() {try{__CLR4_4_171v71vlb90p7e4.R.inc(9225);
        __CLR4_4_171v71vlb90p7e4.R.inc(9226);return sqr2Split.clone();
    }finally{__CLR4_4_171v71vlb90p7e4.R.flushNeeded();}}

    /** Get the constant &radic;2 / 2.
     * @return a {@link Dfp} with value &radic;2 / 2
     */
    public Dfp getSqr2Reciprocal() {try{__CLR4_4_171v71vlb90p7e4.R.inc(9227);
        __CLR4_4_171v71vlb90p7e4.R.inc(9228);return sqr2Reciprocal;
    }finally{__CLR4_4_171v71vlb90p7e4.R.flushNeeded();}}

    /** Get the constant &radic;3.
     * @return a {@link Dfp} with value &radic;3
     */
    public Dfp getSqr3() {try{__CLR4_4_171v71vlb90p7e4.R.inc(9229);
        __CLR4_4_171v71vlb90p7e4.R.inc(9230);return sqr3;
    }finally{__CLR4_4_171v71vlb90p7e4.R.flushNeeded();}}

    /** Get the constant &radic;3 / 3.
     * @return a {@link Dfp} with value &radic;3 / 3
     */
    public Dfp getSqr3Reciprocal() {try{__CLR4_4_171v71vlb90p7e4.R.inc(9231);
        __CLR4_4_171v71vlb90p7e4.R.inc(9232);return sqr3Reciprocal;
    }finally{__CLR4_4_171v71vlb90p7e4.R.flushNeeded();}}

    /** Get the constant &pi;.
     * @return a {@link Dfp} with value &pi;
     */
    public Dfp getPi() {try{__CLR4_4_171v71vlb90p7e4.R.inc(9233);
        __CLR4_4_171v71vlb90p7e4.R.inc(9234);return pi;
    }finally{__CLR4_4_171v71vlb90p7e4.R.flushNeeded();}}

    /** Get the constant &pi; split in two pieces.
     * @return a {@link Dfp} with value &pi; split in two pieces
     */
    public Dfp[] getPiSplit() {try{__CLR4_4_171v71vlb90p7e4.R.inc(9235);
        __CLR4_4_171v71vlb90p7e4.R.inc(9236);return piSplit.clone();
    }finally{__CLR4_4_171v71vlb90p7e4.R.flushNeeded();}}

    /** Get the constant e.
     * @return a {@link Dfp} with value e
     */
    public Dfp getE() {try{__CLR4_4_171v71vlb90p7e4.R.inc(9237);
        __CLR4_4_171v71vlb90p7e4.R.inc(9238);return e;
    }finally{__CLR4_4_171v71vlb90p7e4.R.flushNeeded();}}

    /** Get the constant e split in two pieces.
     * @return a {@link Dfp} with value e split in two pieces
     */
    public Dfp[] getESplit() {try{__CLR4_4_171v71vlb90p7e4.R.inc(9239);
        __CLR4_4_171v71vlb90p7e4.R.inc(9240);return eSplit.clone();
    }finally{__CLR4_4_171v71vlb90p7e4.R.flushNeeded();}}

    /** Get the constant ln(2).
     * @return a {@link Dfp} with value ln(2)
     */
    public Dfp getLn2() {try{__CLR4_4_171v71vlb90p7e4.R.inc(9241);
        __CLR4_4_171v71vlb90p7e4.R.inc(9242);return ln2;
    }finally{__CLR4_4_171v71vlb90p7e4.R.flushNeeded();}}

    /** Get the constant ln(2) split in two pieces.
     * @return a {@link Dfp} with value ln(2) split in two pieces
     */
    public Dfp[] getLn2Split() {try{__CLR4_4_171v71vlb90p7e4.R.inc(9243);
        __CLR4_4_171v71vlb90p7e4.R.inc(9244);return ln2Split.clone();
    }finally{__CLR4_4_171v71vlb90p7e4.R.flushNeeded();}}

    /** Get the constant ln(5).
     * @return a {@link Dfp} with value ln(5)
     */
    public Dfp getLn5() {try{__CLR4_4_171v71vlb90p7e4.R.inc(9245);
        __CLR4_4_171v71vlb90p7e4.R.inc(9246);return ln5;
    }finally{__CLR4_4_171v71vlb90p7e4.R.flushNeeded();}}

    /** Get the constant ln(5) split in two pieces.
     * @return a {@link Dfp} with value ln(5) split in two pieces
     */
    public Dfp[] getLn5Split() {try{__CLR4_4_171v71vlb90p7e4.R.inc(9247);
        __CLR4_4_171v71vlb90p7e4.R.inc(9248);return ln5Split.clone();
    }finally{__CLR4_4_171v71vlb90p7e4.R.flushNeeded();}}

    /** Get the constant ln(10).
     * @return a {@link Dfp} with value ln(10)
     */
    public Dfp getLn10() {try{__CLR4_4_171v71vlb90p7e4.R.inc(9249);
        __CLR4_4_171v71vlb90p7e4.R.inc(9250);return ln10;
    }finally{__CLR4_4_171v71vlb90p7e4.R.flushNeeded();}}

    /** Breaks a string representation up into two {@link Dfp}'s.
     * The split is such that the sum of them is equivalent to the input string,
     * but has higher precision than using a single Dfp.
     * @param a string representation of the number to split
     * @return an array of two {@link Dfp Dfp} instances which sum equals a
     */
    private Dfp[] split(final String a) {try{__CLR4_4_171v71vlb90p7e4.R.inc(9251);
      __CLR4_4_171v71vlb90p7e4.R.inc(9252);Dfp result[] = new Dfp[2];
      __CLR4_4_171v71vlb90p7e4.R.inc(9253);boolean leading = true;
      __CLR4_4_171v71vlb90p7e4.R.inc(9254);int sp = 0;
      __CLR4_4_171v71vlb90p7e4.R.inc(9255);int sig = 0;

      __CLR4_4_171v71vlb90p7e4.R.inc(9256);char[] buf = new char[a.length()];

      __CLR4_4_171v71vlb90p7e4.R.inc(9257);for (int i = 0; (((i < buf.length)&&(__CLR4_4_171v71vlb90p7e4.R.iget(9258)!=0|true))||(__CLR4_4_171v71vlb90p7e4.R.iget(9259)==0&false)); i++) {{
        __CLR4_4_171v71vlb90p7e4.R.inc(9260);buf[i] = a.charAt(i);

        __CLR4_4_171v71vlb90p7e4.R.inc(9261);if ((((buf[i] >= '1' && buf[i] <= '9')&&(__CLR4_4_171v71vlb90p7e4.R.iget(9262)!=0|true))||(__CLR4_4_171v71vlb90p7e4.R.iget(9263)==0&false))) {{
            __CLR4_4_171v71vlb90p7e4.R.inc(9264);leading = false;
        }

        }__CLR4_4_171v71vlb90p7e4.R.inc(9265);if ((((buf[i] == '.')&&(__CLR4_4_171v71vlb90p7e4.R.iget(9266)!=0|true))||(__CLR4_4_171v71vlb90p7e4.R.iget(9267)==0&false))) {{
          __CLR4_4_171v71vlb90p7e4.R.inc(9268);sig += (400 - sig) % 4;
          __CLR4_4_171v71vlb90p7e4.R.inc(9269);leading = false;
        }

        }__CLR4_4_171v71vlb90p7e4.R.inc(9270);if ((((sig == (radixDigits / 2) * 4)&&(__CLR4_4_171v71vlb90p7e4.R.iget(9271)!=0|true))||(__CLR4_4_171v71vlb90p7e4.R.iget(9272)==0&false))) {{
          __CLR4_4_171v71vlb90p7e4.R.inc(9273);sp = i;
          __CLR4_4_171v71vlb90p7e4.R.inc(9274);break;
        }

        }__CLR4_4_171v71vlb90p7e4.R.inc(9275);if ((((buf[i] >= '0' && buf[i] <= '9' && !leading)&&(__CLR4_4_171v71vlb90p7e4.R.iget(9276)!=0|true))||(__CLR4_4_171v71vlb90p7e4.R.iget(9277)==0&false))) {{
            __CLR4_4_171v71vlb90p7e4.R.inc(9278);sig ++;
        }
      }}

      }__CLR4_4_171v71vlb90p7e4.R.inc(9279);result[0] = new Dfp(this, new String(buf, 0, sp));

      __CLR4_4_171v71vlb90p7e4.R.inc(9280);for (int i = 0; (((i < buf.length)&&(__CLR4_4_171v71vlb90p7e4.R.iget(9281)!=0|true))||(__CLR4_4_171v71vlb90p7e4.R.iget(9282)==0&false)); i++) {{
        __CLR4_4_171v71vlb90p7e4.R.inc(9283);buf[i] = a.charAt(i);
        __CLR4_4_171v71vlb90p7e4.R.inc(9284);if ((((buf[i] >= '0' && buf[i] <= '9' && i < sp)&&(__CLR4_4_171v71vlb90p7e4.R.iget(9285)!=0|true))||(__CLR4_4_171v71vlb90p7e4.R.iget(9286)==0&false))) {{
            __CLR4_4_171v71vlb90p7e4.R.inc(9287);buf[i] = '0';
        }
      }}

      }__CLR4_4_171v71vlb90p7e4.R.inc(9288);result[1] = new Dfp(this, new String(buf));

      __CLR4_4_171v71vlb90p7e4.R.inc(9289);return result;

    }finally{__CLR4_4_171v71vlb90p7e4.R.flushNeeded();}}

    /** Recompute the high precision string constants.
     * @param highPrecisionDecimalDigits precision at which the string constants mus be computed
     */
    private static void computeStringConstants(final int highPrecisionDecimalDigits) {try{__CLR4_4_171v71vlb90p7e4.R.inc(9290);
        __CLR4_4_171v71vlb90p7e4.R.inc(9291);if ((((sqr2String == null || sqr2String.length() < highPrecisionDecimalDigits - 3)&&(__CLR4_4_171v71vlb90p7e4.R.iget(9292)!=0|true))||(__CLR4_4_171v71vlb90p7e4.R.iget(9293)==0&false))) {{

            // recompute the string representation of the transcendental constants
            __CLR4_4_171v71vlb90p7e4.R.inc(9294);final DfpField highPrecisionField = new DfpField(highPrecisionDecimalDigits, false);
            __CLR4_4_171v71vlb90p7e4.R.inc(9295);final Dfp highPrecisionOne        = new Dfp(highPrecisionField, 1);
            __CLR4_4_171v71vlb90p7e4.R.inc(9296);final Dfp highPrecisionTwo        = new Dfp(highPrecisionField, 2);
            __CLR4_4_171v71vlb90p7e4.R.inc(9297);final Dfp highPrecisionThree      = new Dfp(highPrecisionField, 3);

            __CLR4_4_171v71vlb90p7e4.R.inc(9298);final Dfp highPrecisionSqr2 = highPrecisionTwo.sqrt();
            __CLR4_4_171v71vlb90p7e4.R.inc(9299);sqr2String           = highPrecisionSqr2.toString();
            __CLR4_4_171v71vlb90p7e4.R.inc(9300);sqr2ReciprocalString = highPrecisionOne.divide(highPrecisionSqr2).toString();

            __CLR4_4_171v71vlb90p7e4.R.inc(9301);final Dfp highPrecisionSqr3 = highPrecisionThree.sqrt();
            __CLR4_4_171v71vlb90p7e4.R.inc(9302);sqr3String           = highPrecisionSqr3.toString();
            __CLR4_4_171v71vlb90p7e4.R.inc(9303);sqr3ReciprocalString = highPrecisionOne.divide(highPrecisionSqr3).toString();

            __CLR4_4_171v71vlb90p7e4.R.inc(9304);piString   = computePi(highPrecisionOne, highPrecisionTwo, highPrecisionThree).toString();
            __CLR4_4_171v71vlb90p7e4.R.inc(9305);eString    = computeExp(highPrecisionOne, highPrecisionOne).toString();
            __CLR4_4_171v71vlb90p7e4.R.inc(9306);ln2String  = computeLn(highPrecisionTwo, highPrecisionOne, highPrecisionTwo).toString();
            __CLR4_4_171v71vlb90p7e4.R.inc(9307);ln5String  = computeLn(new Dfp(highPrecisionField, 5),  highPrecisionOne, highPrecisionTwo).toString();
            __CLR4_4_171v71vlb90p7e4.R.inc(9308);ln10String = computeLn(new Dfp(highPrecisionField, 10), highPrecisionOne, highPrecisionTwo).toString();

        }
    }}finally{__CLR4_4_171v71vlb90p7e4.R.flushNeeded();}}

    /** Compute &pi; using Jonathan and Peter Borwein quartic formula.
     * @param one constant with value 1 at desired precision
     * @param two constant with value 2 at desired precision
     * @param three constant with value 3 at desired precision
     * @return &pi;
     */
    private static Dfp computePi(final Dfp one, final Dfp two, final Dfp three) {try{__CLR4_4_171v71vlb90p7e4.R.inc(9309);

        __CLR4_4_171v71vlb90p7e4.R.inc(9310);Dfp sqrt2   = two.sqrt();
        __CLR4_4_171v71vlb90p7e4.R.inc(9311);Dfp yk      = sqrt2.subtract(one);
        __CLR4_4_171v71vlb90p7e4.R.inc(9312);Dfp four    = two.add(two);
        __CLR4_4_171v71vlb90p7e4.R.inc(9313);Dfp two2kp3 = two;
        __CLR4_4_171v71vlb90p7e4.R.inc(9314);Dfp ak      = two.multiply(three.subtract(two.multiply(sqrt2)));

        // The formula converges quartically. This means the number of correct
        // digits is multiplied by 4 at each iteration! Five iterations are
        // sufficient for about 160 digits, eight iterations give about
        // 10000 digits (this has been checked) and 20 iterations more than
        // 160 billions of digits (this has NOT been checked).
        // So the limit here is considered sufficient for most purposes ...
        __CLR4_4_171v71vlb90p7e4.R.inc(9315);for (int i = 1; (((i < 20)&&(__CLR4_4_171v71vlb90p7e4.R.iget(9316)!=0|true))||(__CLR4_4_171v71vlb90p7e4.R.iget(9317)==0&false)); i++) {{
            __CLR4_4_171v71vlb90p7e4.R.inc(9318);final Dfp ykM1 = yk;

            __CLR4_4_171v71vlb90p7e4.R.inc(9319);final Dfp y2         = yk.multiply(yk);
            __CLR4_4_171v71vlb90p7e4.R.inc(9320);final Dfp oneMinusY4 = one.subtract(y2.multiply(y2));
            __CLR4_4_171v71vlb90p7e4.R.inc(9321);final Dfp s          = oneMinusY4.sqrt().sqrt();
            __CLR4_4_171v71vlb90p7e4.R.inc(9322);yk = one.subtract(s).divide(one.add(s));

            __CLR4_4_171v71vlb90p7e4.R.inc(9323);two2kp3 = two2kp3.multiply(four);

            __CLR4_4_171v71vlb90p7e4.R.inc(9324);final Dfp p = one.add(yk);
            __CLR4_4_171v71vlb90p7e4.R.inc(9325);final Dfp p2 = p.multiply(p);
            __CLR4_4_171v71vlb90p7e4.R.inc(9326);ak = ak.multiply(p2.multiply(p2)).subtract(two2kp3.multiply(yk).multiply(one.add(yk).add(yk.multiply(yk))));

            __CLR4_4_171v71vlb90p7e4.R.inc(9327);if ((((yk.equals(ykM1))&&(__CLR4_4_171v71vlb90p7e4.R.iget(9328)!=0|true))||(__CLR4_4_171v71vlb90p7e4.R.iget(9329)==0&false))) {{
                __CLR4_4_171v71vlb90p7e4.R.inc(9330);break;
            }
        }}

        }__CLR4_4_171v71vlb90p7e4.R.inc(9331);return one.divide(ak);

    }finally{__CLR4_4_171v71vlb90p7e4.R.flushNeeded();}}

    /** Compute exp(a).
     * @param a number for which we want the exponential
     * @param one constant with value 1 at desired precision
     * @return exp(a)
     */
    public static Dfp computeExp(final Dfp a, final Dfp one) {try{__CLR4_4_171v71vlb90p7e4.R.inc(9332);

        __CLR4_4_171v71vlb90p7e4.R.inc(9333);Dfp y  = new Dfp(one);
        __CLR4_4_171v71vlb90p7e4.R.inc(9334);Dfp py = new Dfp(one);
        __CLR4_4_171v71vlb90p7e4.R.inc(9335);Dfp f  = new Dfp(one);
        __CLR4_4_171v71vlb90p7e4.R.inc(9336);Dfp fi = new Dfp(one);
        __CLR4_4_171v71vlb90p7e4.R.inc(9337);Dfp x  = new Dfp(one);

        __CLR4_4_171v71vlb90p7e4.R.inc(9338);for (int i = 0; (((i < 10000)&&(__CLR4_4_171v71vlb90p7e4.R.iget(9339)!=0|true))||(__CLR4_4_171v71vlb90p7e4.R.iget(9340)==0&false)); i++) {{
            __CLR4_4_171v71vlb90p7e4.R.inc(9341);x = x.multiply(a);
            __CLR4_4_171v71vlb90p7e4.R.inc(9342);y = y.add(x.divide(f));
            __CLR4_4_171v71vlb90p7e4.R.inc(9343);fi = fi.add(one);
            __CLR4_4_171v71vlb90p7e4.R.inc(9344);f = f.multiply(fi);
            __CLR4_4_171v71vlb90p7e4.R.inc(9345);if ((((y.equals(py))&&(__CLR4_4_171v71vlb90p7e4.R.iget(9346)!=0|true))||(__CLR4_4_171v71vlb90p7e4.R.iget(9347)==0&false))) {{
                __CLR4_4_171v71vlb90p7e4.R.inc(9348);break;
            }
            }__CLR4_4_171v71vlb90p7e4.R.inc(9349);py = new Dfp(y);
        }

        }__CLR4_4_171v71vlb90p7e4.R.inc(9350);return y;

    }finally{__CLR4_4_171v71vlb90p7e4.R.flushNeeded();}}


    /** Compute ln(a).
     *
     *  Let f(x) = ln(x),
     *
     *  We know that f'(x) = 1/x, thus from Taylor's theorem we have:
     *
     *           -----          n+1         n
     *  f(x) =   \           (-1)    (x - 1)
     *           /          ----------------    for 1 <= n <= infinity
     *           -----             n
     *
     *  or
     *                       2        3       4
     *                   (x-1)   (x-1)    (x-1)
     *  ln(x) =  (x-1) - ----- + ------ - ------ + ...
     *                     2       3        4
     *
     *  alternatively,
     *
     *                  2    3   4
     *                 x    x   x
     *  ln(x+1) =  x - -  + - - - + ...
     *                 2    3   4
     *
     *  This series can be used to compute ln(x), but it converges too slowly.
     *
     *  If we substitute -x for x above, we get
     *
     *                   2    3    4
     *                  x    x    x
     *  ln(1-x) =  -x - -  - -  - - + ...
     *                  2    3    4
     *
     *  Note that all terms are now negative.  Because the even powered ones
     *  absorbed the sign.  Now, subtract the series above from the previous
     *  one to get ln(x+1) - ln(1-x).  Note the even terms cancel out leaving
     *  only the odd ones
     *
     *                             3     5      7
     *                           2x    2x     2x
     *  ln(x+1) - ln(x-1) = 2x + --- + --- + ---- + ...
     *                            3     5      7
     *
     *  By the property of logarithms that ln(a) - ln(b) = ln (a/b) we have:
     *
     *                                3        5        7
     *      x+1           /          x        x        x          \
     *  ln ----- =   2 *  |  x  +   ----  +  ----  +  ---- + ...  |
     *      x-1           \          3        5        7          /
     *
     *  But now we want to find ln(a), so we need to find the value of x
     *  such that a = (x+1)/(x-1).   This is easily solved to find that
     *  x = (a-1)/(a+1).
     * @param a number for which we want the exponential
     * @param one constant with value 1 at desired precision
     * @param two constant with value 2 at desired precision
     * @return ln(a)
     */

    public static Dfp computeLn(final Dfp a, final Dfp one, final Dfp two) {try{__CLR4_4_171v71vlb90p7e4.R.inc(9351);

        __CLR4_4_171v71vlb90p7e4.R.inc(9352);int den = 1;
        __CLR4_4_171v71vlb90p7e4.R.inc(9353);Dfp x = a.add(new Dfp(a.getField(), -1)).divide(a.add(one));

        __CLR4_4_171v71vlb90p7e4.R.inc(9354);Dfp y = new Dfp(x);
        __CLR4_4_171v71vlb90p7e4.R.inc(9355);Dfp num = new Dfp(x);
        __CLR4_4_171v71vlb90p7e4.R.inc(9356);Dfp py = new Dfp(y);
        __CLR4_4_171v71vlb90p7e4.R.inc(9357);for (int i = 0; (((i < 10000)&&(__CLR4_4_171v71vlb90p7e4.R.iget(9358)!=0|true))||(__CLR4_4_171v71vlb90p7e4.R.iget(9359)==0&false)); i++) {{
            __CLR4_4_171v71vlb90p7e4.R.inc(9360);num = num.multiply(x);
            __CLR4_4_171v71vlb90p7e4.R.inc(9361);num = num.multiply(x);
            __CLR4_4_171v71vlb90p7e4.R.inc(9362);den = den + 2;
            __CLR4_4_171v71vlb90p7e4.R.inc(9363);Dfp t = num.divide(den);
            __CLR4_4_171v71vlb90p7e4.R.inc(9364);y = y.add(t);
            __CLR4_4_171v71vlb90p7e4.R.inc(9365);if ((((y.equals(py))&&(__CLR4_4_171v71vlb90p7e4.R.iget(9366)!=0|true))||(__CLR4_4_171v71vlb90p7e4.R.iget(9367)==0&false))) {{
                __CLR4_4_171v71vlb90p7e4.R.inc(9368);break;
            }
            }__CLR4_4_171v71vlb90p7e4.R.inc(9369);py = new Dfp(y);
        }

        }__CLR4_4_171v71vlb90p7e4.R.inc(9370);return y.multiply(two);

    }finally{__CLR4_4_171v71vlb90p7e4.R.flushNeeded();}}

}
