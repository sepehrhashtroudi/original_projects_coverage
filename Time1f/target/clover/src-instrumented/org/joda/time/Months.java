/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 *  Copyright 2001-2010 Stephen Colebourne
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.joda.time;

import org.joda.convert.FromString;
import org.joda.convert.ToString;
import org.joda.time.base.BaseSingleFieldPeriod;
import org.joda.time.field.FieldUtils;
import org.joda.time.format.ISOPeriodFormat;
import org.joda.time.format.PeriodFormatter;

/**
 * An immutable time period representing a number of months.
 * <p>
 * <code>Months</code> is an immutable period that can only store months.
 * It does not store years, days or hours for example. As such it is a
 * type-safe way of representing a number of months in an application.
 * <p>
 * The number of months is set in the constructor, and may be queried using
 * <code>getMonths()</code>. Basic mathematical operations are provided -
 * <code>plus()</code>, <code>minus()</code>, <code>multipliedBy()</code> and
 * <code>dividedBy()</code>.
 * <p>
 * <code>Months</code> is thread-safe and immutable.
 *
 * @author Stephen Colebourne
 * @since 1.4
 */
@java.lang.SuppressWarnings({"fallthrough"}) public final class Months extends BaseSingleFieldPeriod {public static class __CLR4_4_13b23b2lc8azs7b{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672271027956L,8589935092L,4400,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** Constant representing zero months. */
    public static final Months ZERO = new Months(0);
    /** Constant representing one month. */
    public static final Months ONE = new Months(1);
    /** Constant representing two months. */
    public static final Months TWO = new Months(2);
    /** Constant representing three months. */
    public static final Months THREE = new Months(3);
    /** Constant representing four months. */
    public static final Months FOUR = new Months(4);
    /** Constant representing five months. */
    public static final Months FIVE = new Months(5);
    /** Constant representing six months. */
    public static final Months SIX = new Months(6);
    /** Constant representing seven months. */
    public static final Months SEVEN = new Months(7);
    /** Constant representing eight months. */
    public static final Months EIGHT = new Months(8);
    /** Constant representing nine months. */
    public static final Months NINE = new Months(9);
    /** Constant representing ten months. */
    public static final Months TEN = new Months(10);
    /** Constant representing eleven months. */
    public static final Months ELEVEN = new Months(11);
    /** Constant representing twelve months. */
    public static final Months TWELVE = new Months(12);
    /** Constant representing the maximum number of months that can be stored in this object. */
    public static final Months MAX_VALUE = new Months(Integer.MAX_VALUE);
    /** Constant representing the minimum number of months that can be stored in this object. */
    public static final Months MIN_VALUE = new Months(Integer.MIN_VALUE);

    /** The parser to use for this class. */
    private static final PeriodFormatter PARSER = ISOPeriodFormat.standard().withParseType(PeriodType.months());
    /** Serialization version. */
    private static final long serialVersionUID = 87525275727380867L;

    //-----------------------------------------------------------------------
    /**
     * Obtains an instance of <code>Months</code> that may be cached.
     * <code>Months</code> is immutable, so instances can be cached and shared.
     * This factory method provides access to shared instances.
     *
     * @param months  the number of months to obtain an instance for
     * @return the instance of Months
     */
    public static Months months(int months) {try{__CLR4_4_13b23b2lc8azs7b.R.inc(4286);
        boolean __CLB4_4_1_bool0=false;__CLR4_4_13b23b2lc8azs7b.R.inc(4287);switch (months) {
            case 0:if (!__CLB4_4_1_bool0) {__CLR4_4_13b23b2lc8azs7b.R.inc(4288);__CLB4_4_1_bool0=true;}
                __CLR4_4_13b23b2lc8azs7b.R.inc(4289);return ZERO;
            case 1:if (!__CLB4_4_1_bool0) {__CLR4_4_13b23b2lc8azs7b.R.inc(4290);__CLB4_4_1_bool0=true;}
                __CLR4_4_13b23b2lc8azs7b.R.inc(4291);return ONE;
            case 2:if (!__CLB4_4_1_bool0) {__CLR4_4_13b23b2lc8azs7b.R.inc(4292);__CLB4_4_1_bool0=true;}
                __CLR4_4_13b23b2lc8azs7b.R.inc(4293);return TWO;
            case 3:if (!__CLB4_4_1_bool0) {__CLR4_4_13b23b2lc8azs7b.R.inc(4294);__CLB4_4_1_bool0=true;}
                __CLR4_4_13b23b2lc8azs7b.R.inc(4295);return THREE;
            case 4:if (!__CLB4_4_1_bool0) {__CLR4_4_13b23b2lc8azs7b.R.inc(4296);__CLB4_4_1_bool0=true;}
                __CLR4_4_13b23b2lc8azs7b.R.inc(4297);return FOUR;
            case 5:if (!__CLB4_4_1_bool0) {__CLR4_4_13b23b2lc8azs7b.R.inc(4298);__CLB4_4_1_bool0=true;}
                __CLR4_4_13b23b2lc8azs7b.R.inc(4299);return FIVE;
            case 6:if (!__CLB4_4_1_bool0) {__CLR4_4_13b23b2lc8azs7b.R.inc(4300);__CLB4_4_1_bool0=true;}
                __CLR4_4_13b23b2lc8azs7b.R.inc(4301);return SIX;
            case 7:if (!__CLB4_4_1_bool0) {__CLR4_4_13b23b2lc8azs7b.R.inc(4302);__CLB4_4_1_bool0=true;}
                __CLR4_4_13b23b2lc8azs7b.R.inc(4303);return SEVEN;
            case 8:if (!__CLB4_4_1_bool0) {__CLR4_4_13b23b2lc8azs7b.R.inc(4304);__CLB4_4_1_bool0=true;}
                __CLR4_4_13b23b2lc8azs7b.R.inc(4305);return EIGHT;
            case 9:if (!__CLB4_4_1_bool0) {__CLR4_4_13b23b2lc8azs7b.R.inc(4306);__CLB4_4_1_bool0=true;}
                __CLR4_4_13b23b2lc8azs7b.R.inc(4307);return NINE;
            case 10:if (!__CLB4_4_1_bool0) {__CLR4_4_13b23b2lc8azs7b.R.inc(4308);__CLB4_4_1_bool0=true;}
                __CLR4_4_13b23b2lc8azs7b.R.inc(4309);return TEN;
            case 11:if (!__CLB4_4_1_bool0) {__CLR4_4_13b23b2lc8azs7b.R.inc(4310);__CLB4_4_1_bool0=true;}
                __CLR4_4_13b23b2lc8azs7b.R.inc(4311);return ELEVEN;
            case 12:if (!__CLB4_4_1_bool0) {__CLR4_4_13b23b2lc8azs7b.R.inc(4312);__CLB4_4_1_bool0=true;}
                __CLR4_4_13b23b2lc8azs7b.R.inc(4313);return TWELVE;
            case Integer.MAX_VALUE:if (!__CLB4_4_1_bool0) {__CLR4_4_13b23b2lc8azs7b.R.inc(4314);__CLB4_4_1_bool0=true;}
                __CLR4_4_13b23b2lc8azs7b.R.inc(4315);return MAX_VALUE;
            case Integer.MIN_VALUE:if (!__CLB4_4_1_bool0) {__CLR4_4_13b23b2lc8azs7b.R.inc(4316);__CLB4_4_1_bool0=true;}
                __CLR4_4_13b23b2lc8azs7b.R.inc(4317);return MIN_VALUE;
            default:if (!__CLB4_4_1_bool0) {__CLR4_4_13b23b2lc8azs7b.R.inc(4318);__CLB4_4_1_bool0=true;}
                __CLR4_4_13b23b2lc8azs7b.R.inc(4319);return new Months(months);
        }
    }finally{__CLR4_4_13b23b2lc8azs7b.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Creates a <code>Months</code> representing the number of whole months
     * between the two specified datetimes. This method corectly handles
     * any daylight savings time changes that may occur during the interval.
     *
     * @param start  the start instant, must not be null
     * @param end  the end instant, must not be null
     * @return the period in months
     * @throws IllegalArgumentException if the instants are null or invalid
     */
    public static Months monthsBetween(ReadableInstant start, ReadableInstant end) {try{__CLR4_4_13b23b2lc8azs7b.R.inc(4320);
        __CLR4_4_13b23b2lc8azs7b.R.inc(4321);int amount = BaseSingleFieldPeriod.between(start, end, DurationFieldType.months());
        __CLR4_4_13b23b2lc8azs7b.R.inc(4322);return Months.months(amount);
    }finally{__CLR4_4_13b23b2lc8azs7b.R.flushNeeded();}}

    /**
     * Creates a <code>Months</code> representing the number of whole months
     * between the two specified partial datetimes.
     * <p>
     * The two partials must contain the same fields, for example you can specify
     * two <code>LocalDate</code> objects.
     *
     * @param start  the start partial date, must not be null
     * @param end  the end partial date, must not be null
     * @return the period in months
     * @throws IllegalArgumentException if the partials are null or invalid
     */
    public static Months monthsBetween(ReadablePartial start, ReadablePartial end) {try{__CLR4_4_13b23b2lc8azs7b.R.inc(4323);
        __CLR4_4_13b23b2lc8azs7b.R.inc(4324);if ((((start instanceof LocalDate && end instanceof LocalDate)&&(__CLR4_4_13b23b2lc8azs7b.R.iget(4325)!=0|true))||(__CLR4_4_13b23b2lc8azs7b.R.iget(4326)==0&false)))   {{
            __CLR4_4_13b23b2lc8azs7b.R.inc(4327);Chronology chrono = DateTimeUtils.getChronology(start.getChronology());
            __CLR4_4_13b23b2lc8azs7b.R.inc(4328);int months = chrono.months().getDifference(
                    ((LocalDate) end).getLocalMillis(), ((LocalDate) start).getLocalMillis());
            __CLR4_4_13b23b2lc8azs7b.R.inc(4329);return Months.months(months);
        }
        }__CLR4_4_13b23b2lc8azs7b.R.inc(4330);int amount = BaseSingleFieldPeriod.between(start, end, ZERO);
        __CLR4_4_13b23b2lc8azs7b.R.inc(4331);return Months.months(amount);
    }finally{__CLR4_4_13b23b2lc8azs7b.R.flushNeeded();}}

    /**
     * Creates a <code>Months</code> representing the number of whole months
     * in the specified interval. This method corectly handles any daylight
     * savings time changes that may occur during the interval.
     *
     * @param interval  the interval to extract months from, null returns zero
     * @return the period in months
     * @throws IllegalArgumentException if the partials are null or invalid
     */
    public static Months monthsIn(ReadableInterval interval) {try{__CLR4_4_13b23b2lc8azs7b.R.inc(4332);
        __CLR4_4_13b23b2lc8azs7b.R.inc(4333);if ((((interval == null)&&(__CLR4_4_13b23b2lc8azs7b.R.iget(4334)!=0|true))||(__CLR4_4_13b23b2lc8azs7b.R.iget(4335)==0&false)))   {{
            __CLR4_4_13b23b2lc8azs7b.R.inc(4336);return Months.ZERO;
        }
        }__CLR4_4_13b23b2lc8azs7b.R.inc(4337);int amount = BaseSingleFieldPeriod.between(interval.getStart(), interval.getEnd(), DurationFieldType.months());
        __CLR4_4_13b23b2lc8azs7b.R.inc(4338);return Months.months(amount);
    }finally{__CLR4_4_13b23b2lc8azs7b.R.flushNeeded();}}

    /**
     * Creates a new <code>Months</code> by parsing a string in the ISO8601 format 'PnM'.
     * <p>
     * The parse will accept the full ISO syntax of PnYnMnWnDTnHnMnS however only the
     * months component may be non-zero. If any other component is non-zero, an exception
     * will be thrown.
     *
     * @param periodStr  the period string, null returns zero
     * @return the period in months
     * @throws IllegalArgumentException if the string format is invalid
     */
    @FromString
    public static Months parseMonths(String periodStr) {try{__CLR4_4_13b23b2lc8azs7b.R.inc(4339);
        __CLR4_4_13b23b2lc8azs7b.R.inc(4340);if ((((periodStr == null)&&(__CLR4_4_13b23b2lc8azs7b.R.iget(4341)!=0|true))||(__CLR4_4_13b23b2lc8azs7b.R.iget(4342)==0&false))) {{
            __CLR4_4_13b23b2lc8azs7b.R.inc(4343);return Months.ZERO;
        }
        }__CLR4_4_13b23b2lc8azs7b.R.inc(4344);Period p = PARSER.parsePeriod(periodStr);
        __CLR4_4_13b23b2lc8azs7b.R.inc(4345);return Months.months(p.getMonths());
    }finally{__CLR4_4_13b23b2lc8azs7b.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Creates a new instance representing a number of months.
     * You should consider using the factory method {@link #months(int)}
     * instead of the constructor.
     *
     * @param months  the number of months to represent
     */
    private Months(int months) {
        super(months);__CLR4_4_13b23b2lc8azs7b.R.inc(4347);try{__CLR4_4_13b23b2lc8azs7b.R.inc(4346);
    }finally{__CLR4_4_13b23b2lc8azs7b.R.flushNeeded();}}

    /**
     * Resolves singletons.
     * 
     * @return the singleton instance
     */
    private Object readResolve() {try{__CLR4_4_13b23b2lc8azs7b.R.inc(4348);
        __CLR4_4_13b23b2lc8azs7b.R.inc(4349);return Months.months(getValue());
    }finally{__CLR4_4_13b23b2lc8azs7b.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Gets the duration field type, which is <code>months</code>.
     *
     * @return the period type
     */
    public DurationFieldType getFieldType() {try{__CLR4_4_13b23b2lc8azs7b.R.inc(4350);
        __CLR4_4_13b23b2lc8azs7b.R.inc(4351);return DurationFieldType.months();
    }finally{__CLR4_4_13b23b2lc8azs7b.R.flushNeeded();}}

    /**
     * Gets the period type, which is <code>months</code>.
     *
     * @return the period type
     */
    public PeriodType getPeriodType() {try{__CLR4_4_13b23b2lc8azs7b.R.inc(4352);
        __CLR4_4_13b23b2lc8azs7b.R.inc(4353);return PeriodType.months();
    }finally{__CLR4_4_13b23b2lc8azs7b.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Gets the number of months that this period represents.
     *
     * @return the number of months in the period
     */
    public int getMonths() {try{__CLR4_4_13b23b2lc8azs7b.R.inc(4354);
        __CLR4_4_13b23b2lc8azs7b.R.inc(4355);return getValue();
    }finally{__CLR4_4_13b23b2lc8azs7b.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Returns a new instance with the specified number of months added.
     * <p>
     * This instance is immutable and unaffected by this method call.
     *
     * @param months  the amount of months to add, may be negative
     * @return the new period plus the specified number of months
     * @throws ArithmeticException if the result overflows an int
     */
    public Months plus(int months) {try{__CLR4_4_13b23b2lc8azs7b.R.inc(4356);
        __CLR4_4_13b23b2lc8azs7b.R.inc(4357);if ((((months == 0)&&(__CLR4_4_13b23b2lc8azs7b.R.iget(4358)!=0|true))||(__CLR4_4_13b23b2lc8azs7b.R.iget(4359)==0&false))) {{
            __CLR4_4_13b23b2lc8azs7b.R.inc(4360);return this;
        }
        }__CLR4_4_13b23b2lc8azs7b.R.inc(4361);return Months.months(FieldUtils.safeAdd(getValue(), months));
    }finally{__CLR4_4_13b23b2lc8azs7b.R.flushNeeded();}}

    /**
     * Returns a new instance with the specified number of months added.
     * <p>
     * This instance is immutable and unaffected by this method call.
     *
     * @param months  the amount of months to add, may be negative, null means zero
     * @return the new period plus the specified number of months
     * @throws ArithmeticException if the result overflows an int
     */
    public Months plus(Months months) {try{__CLR4_4_13b23b2lc8azs7b.R.inc(4362);
        __CLR4_4_13b23b2lc8azs7b.R.inc(4363);if ((((months == null)&&(__CLR4_4_13b23b2lc8azs7b.R.iget(4364)!=0|true))||(__CLR4_4_13b23b2lc8azs7b.R.iget(4365)==0&false))) {{
            __CLR4_4_13b23b2lc8azs7b.R.inc(4366);return this;
        }
        }__CLR4_4_13b23b2lc8azs7b.R.inc(4367);return plus(months.getValue());
    }finally{__CLR4_4_13b23b2lc8azs7b.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Returns a new instance with the specified number of months taken away.
     * <p>
     * This instance is immutable and unaffected by this method call.
     *
     * @param months  the amount of months to take away, may be negative
     * @return the new period minus the specified number of months
     * @throws ArithmeticException if the result overflows an int
     */
    public Months minus(int months) {try{__CLR4_4_13b23b2lc8azs7b.R.inc(4368);
        __CLR4_4_13b23b2lc8azs7b.R.inc(4369);return plus(FieldUtils.safeNegate(months));
    }finally{__CLR4_4_13b23b2lc8azs7b.R.flushNeeded();}}

    /**
     * Returns a new instance with the specified number of months taken away.
     * <p>
     * This instance is immutable and unaffected by this method call.
     *
     * @param months  the amount of months to take away, may be negative, null means zero
     * @return the new period minus the specified number of months
     * @throws ArithmeticException if the result overflows an int
     */
    public Months minus(Months months) {try{__CLR4_4_13b23b2lc8azs7b.R.inc(4370);
        __CLR4_4_13b23b2lc8azs7b.R.inc(4371);if ((((months == null)&&(__CLR4_4_13b23b2lc8azs7b.R.iget(4372)!=0|true))||(__CLR4_4_13b23b2lc8azs7b.R.iget(4373)==0&false))) {{
            __CLR4_4_13b23b2lc8azs7b.R.inc(4374);return this;
        }
        }__CLR4_4_13b23b2lc8azs7b.R.inc(4375);return minus(months.getValue());
    }finally{__CLR4_4_13b23b2lc8azs7b.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Returns a new instance with the months multiplied by the specified scalar.
     * <p>
     * This instance is immutable and unaffected by this method call.
     *
     * @param scalar  the amount to multiply by, may be negative
     * @return the new period multiplied by the specified scalar
     * @throws ArithmeticException if the result overflows an int
     */
    public Months multipliedBy(int scalar) {try{__CLR4_4_13b23b2lc8azs7b.R.inc(4376);
        __CLR4_4_13b23b2lc8azs7b.R.inc(4377);return Months.months(FieldUtils.safeMultiply(getValue(), scalar));
    }finally{__CLR4_4_13b23b2lc8azs7b.R.flushNeeded();}}

    /**
     * Returns a new instance with the months divided by the specified divisor.
     * The calculation uses integer division, thus 3 divided by 2 is 1.
     * <p>
     * This instance is immutable and unaffected by this method call.
     *
     * @param divisor  the amount to divide by, may be negative
     * @return the new period divided by the specified divisor
     * @throws ArithmeticException if the divisor is zero
     */
    public Months dividedBy(int divisor) {try{__CLR4_4_13b23b2lc8azs7b.R.inc(4378);
        __CLR4_4_13b23b2lc8azs7b.R.inc(4379);if ((((divisor == 1)&&(__CLR4_4_13b23b2lc8azs7b.R.iget(4380)!=0|true))||(__CLR4_4_13b23b2lc8azs7b.R.iget(4381)==0&false))) {{
            __CLR4_4_13b23b2lc8azs7b.R.inc(4382);return this;
        }
        }__CLR4_4_13b23b2lc8azs7b.R.inc(4383);return Months.months(getValue() / divisor);
    }finally{__CLR4_4_13b23b2lc8azs7b.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Returns a new instance with the months value negated.
     *
     * @return the new period with a negated value
     * @throws ArithmeticException if the result overflows an int
     */
    public Months negated() {try{__CLR4_4_13b23b2lc8azs7b.R.inc(4384);
        __CLR4_4_13b23b2lc8azs7b.R.inc(4385);return Months.months(FieldUtils.safeNegate(getValue()));
    }finally{__CLR4_4_13b23b2lc8azs7b.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Is this months instance greater than the specified number of months.
     *
     * @param other  the other period, null means zero
     * @return true if this months instance is greater than the specified one
     */
    public boolean isGreaterThan(Months other) {try{__CLR4_4_13b23b2lc8azs7b.R.inc(4386);
        __CLR4_4_13b23b2lc8azs7b.R.inc(4387);if ((((other == null)&&(__CLR4_4_13b23b2lc8azs7b.R.iget(4388)!=0|true))||(__CLR4_4_13b23b2lc8azs7b.R.iget(4389)==0&false))) {{
            __CLR4_4_13b23b2lc8azs7b.R.inc(4390);return getValue() > 0;
        }
        }__CLR4_4_13b23b2lc8azs7b.R.inc(4391);return getValue() > other.getValue();
    }finally{__CLR4_4_13b23b2lc8azs7b.R.flushNeeded();}}

    /**
     * Is this months instance less than the specified number of months.
     *
     * @param other  the other period, null means zero
     * @return true if this months instance is less than the specified one
     */
    public boolean isLessThan(Months other) {try{__CLR4_4_13b23b2lc8azs7b.R.inc(4392);
        __CLR4_4_13b23b2lc8azs7b.R.inc(4393);if ((((other == null)&&(__CLR4_4_13b23b2lc8azs7b.R.iget(4394)!=0|true))||(__CLR4_4_13b23b2lc8azs7b.R.iget(4395)==0&false))) {{
            __CLR4_4_13b23b2lc8azs7b.R.inc(4396);return getValue() < 0;
        }
        }__CLR4_4_13b23b2lc8azs7b.R.inc(4397);return getValue() < other.getValue();
    }finally{__CLR4_4_13b23b2lc8azs7b.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Gets this instance as a String in the ISO8601 duration format.
     * <p>
     * For example, "P4M" represents 4 months.
     *
     * @return the value as an ISO8601 string
     */
    @ToString
    public String toString() {try{__CLR4_4_13b23b2lc8azs7b.R.inc(4398);
        __CLR4_4_13b23b2lc8azs7b.R.inc(4399);return "P" + String.valueOf(getValue()) + "M";
    }finally{__CLR4_4_13b23b2lc8azs7b.R.flushNeeded();}}

}
