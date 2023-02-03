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
 * An immutable time period representing a number of weeks.
 * <p>
 * <code>Weeks</code> is an immutable period that can only store weeks.
 * It does not store years, months or hours for example. As such it is a
 * type-safe way of representing a number of weeks in an application.
 * <p>
 * The number of weeks is set in the constructor, and may be queried using
 * <code>getWeeks()</code>. Basic mathematical operations are provided -
 * <code>plus()</code>, <code>minus()</code>, <code>multipliedBy()</code> and
 * <code>dividedBy()</code>.
 * <p>
 * <code>Weeks</code> is thread-safe and immutable.
 *
 * @author Stephen Colebourne
 * @since 1.4
 */
@java.lang.SuppressWarnings({"fallthrough"}) public final class Weeks extends BaseSingleFieldPeriod {public static class __CLR4_4_14zl4zllc8azsit{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672271027956L,8589935092L,6575,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** Constant representing zero weeks. */
    public static final Weeks ZERO = new Weeks(0);
    /** Constant representing one week. */
    public static final Weeks ONE = new Weeks(1);
    /** Constant representing two weeks. */
    public static final Weeks TWO = new Weeks(2);
    /** Constant representing three weeks. */
    public static final Weeks THREE = new Weeks(3);
    /** Constant representing the maximum number of weeks that can be stored in this object. */
    public static final Weeks MAX_VALUE = new Weeks(Integer.MAX_VALUE);
    /** Constant representing the minimum number of weeks that can be stored in this object. */
    public static final Weeks MIN_VALUE = new Weeks(Integer.MIN_VALUE);

    /** The paser to use for this class. */
    private static final PeriodFormatter PARSER = ISOPeriodFormat.standard().withParseType(PeriodType.weeks());
    /** Serialization version. */
    private static final long serialVersionUID = 87525275727380866L;

    //-----------------------------------------------------------------------
    /**
     * Obtains an instance of <code>Weeks</code> that may be cached.
     * <code>Weeks</code> is immutable, so instances can be cached and shared.
     * This factory method provides access to shared instances.
     *
     * @param weeks  the number of weeks to obtain an instance for
     * @return the instance of Weeks
     */
    public static Weeks weeks(int weeks) {try{__CLR4_4_14zl4zllc8azsit.R.inc(6465);
        boolean __CLB4_4_1_bool0=false;__CLR4_4_14zl4zllc8azsit.R.inc(6466);switch (weeks) {
            case 0:if (!__CLB4_4_1_bool0) {__CLR4_4_14zl4zllc8azsit.R.inc(6467);__CLB4_4_1_bool0=true;}
                __CLR4_4_14zl4zllc8azsit.R.inc(6468);return ZERO;
            case 1:if (!__CLB4_4_1_bool0) {__CLR4_4_14zl4zllc8azsit.R.inc(6469);__CLB4_4_1_bool0=true;}
                __CLR4_4_14zl4zllc8azsit.R.inc(6470);return ONE;
            case 2:if (!__CLB4_4_1_bool0) {__CLR4_4_14zl4zllc8azsit.R.inc(6471);__CLB4_4_1_bool0=true;}
                __CLR4_4_14zl4zllc8azsit.R.inc(6472);return TWO;
            case 3:if (!__CLB4_4_1_bool0) {__CLR4_4_14zl4zllc8azsit.R.inc(6473);__CLB4_4_1_bool0=true;}
                __CLR4_4_14zl4zllc8azsit.R.inc(6474);return THREE;
            case Integer.MAX_VALUE:if (!__CLB4_4_1_bool0) {__CLR4_4_14zl4zllc8azsit.R.inc(6475);__CLB4_4_1_bool0=true;}
                __CLR4_4_14zl4zllc8azsit.R.inc(6476);return MAX_VALUE;
            case Integer.MIN_VALUE:if (!__CLB4_4_1_bool0) {__CLR4_4_14zl4zllc8azsit.R.inc(6477);__CLB4_4_1_bool0=true;}
                __CLR4_4_14zl4zllc8azsit.R.inc(6478);return MIN_VALUE;
            default:if (!__CLB4_4_1_bool0) {__CLR4_4_14zl4zllc8azsit.R.inc(6479);__CLB4_4_1_bool0=true;}
                __CLR4_4_14zl4zllc8azsit.R.inc(6480);return new Weeks(weeks);
        }
    }finally{__CLR4_4_14zl4zllc8azsit.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Creates a <code>Weeks</code> representing the number of whole weeks
     * between the two specified datetimes.
     *
     * @param start  the start instant, must not be null
     * @param end  the end instant, must not be null
     * @return the period in weeks
     * @throws IllegalArgumentException if the instants are null or invalid
     */
    public static Weeks weeksBetween(ReadableInstant start, ReadableInstant end) {try{__CLR4_4_14zl4zllc8azsit.R.inc(6481);
        __CLR4_4_14zl4zllc8azsit.R.inc(6482);int amount = BaseSingleFieldPeriod.between(start, end, DurationFieldType.weeks());
        __CLR4_4_14zl4zllc8azsit.R.inc(6483);return Weeks.weeks(amount);
    }finally{__CLR4_4_14zl4zllc8azsit.R.flushNeeded();}}

    /**
     * Creates a <code>Weeks</code> representing the number of whole weeks
     * between the two specified partial datetimes.
     * <p>
     * The two partials must contain the same fields, for example you can specify
     * two <code>LocalDate</code> objects.
     *
     * @param start  the start partial date, must not be null
     * @param end  the end partial date, must not be null
     * @return the period in weeks
     * @throws IllegalArgumentException if the partials are null or invalid
     */
    public static Weeks weeksBetween(ReadablePartial start, ReadablePartial end) {try{__CLR4_4_14zl4zllc8azsit.R.inc(6484);
        __CLR4_4_14zl4zllc8azsit.R.inc(6485);if ((((start instanceof LocalDate && end instanceof LocalDate)&&(__CLR4_4_14zl4zllc8azsit.R.iget(6486)!=0|true))||(__CLR4_4_14zl4zllc8azsit.R.iget(6487)==0&false)))   {{
            __CLR4_4_14zl4zllc8azsit.R.inc(6488);Chronology chrono = DateTimeUtils.getChronology(start.getChronology());
            __CLR4_4_14zl4zllc8azsit.R.inc(6489);int weeks = chrono.weeks().getDifference(
                    ((LocalDate) end).getLocalMillis(), ((LocalDate) start).getLocalMillis());
            __CLR4_4_14zl4zllc8azsit.R.inc(6490);return Weeks.weeks(weeks);
        }
        }__CLR4_4_14zl4zllc8azsit.R.inc(6491);int amount = BaseSingleFieldPeriod.between(start, end, ZERO);
        __CLR4_4_14zl4zllc8azsit.R.inc(6492);return Weeks.weeks(amount);
    }finally{__CLR4_4_14zl4zllc8azsit.R.flushNeeded();}}

    /**
     * Creates a <code>Weeks</code> representing the number of whole weeks
     * in the specified interval.
     *
     * @param interval  the interval to extract weeks from, null returns zero
     * @return the period in weeks
     * @throws IllegalArgumentException if the partials are null or invalid
     */
    public static Weeks weeksIn(ReadableInterval interval) {try{__CLR4_4_14zl4zllc8azsit.R.inc(6493);
        __CLR4_4_14zl4zllc8azsit.R.inc(6494);if ((((interval == null)&&(__CLR4_4_14zl4zllc8azsit.R.iget(6495)!=0|true))||(__CLR4_4_14zl4zllc8azsit.R.iget(6496)==0&false)))   {{
            __CLR4_4_14zl4zllc8azsit.R.inc(6497);return Weeks.ZERO;
        }
        }__CLR4_4_14zl4zllc8azsit.R.inc(6498);int amount = BaseSingleFieldPeriod.between(interval.getStart(), interval.getEnd(), DurationFieldType.weeks());
        __CLR4_4_14zl4zllc8azsit.R.inc(6499);return Weeks.weeks(amount);
    }finally{__CLR4_4_14zl4zllc8azsit.R.flushNeeded();}}

    /**
     * Creates a new <code>Weeks</code> representing the number of complete
     * standard length weeks in the specified period.
     * <p>
     * This factory method converts all fields from the period to hours using standardised
     * durations for each field. Only those fields which have a precise duration in
     * the ISO UTC chronology can be converted.
     * <ul>
     * <li>One week consists of 7 days.
     * <li>One day consists of 24 hours.
     * <li>One hour consists of 60 minutes.
     * <li>One minute consists of 60 weeks.
     * <li>One second consists of 1000 milliseconds.
     * </ul>
     * Months and Years are imprecise and periods containing these values cannot be converted.
     *
     * @param period  the period to get the number of hours from, null returns zero
     * @return the period in weeks
     * @throws IllegalArgumentException if the period contains imprecise duration values
     */
    public static Weeks standardWeeksIn(ReadablePeriod period) {try{__CLR4_4_14zl4zllc8azsit.R.inc(6500);
        __CLR4_4_14zl4zllc8azsit.R.inc(6501);int amount = BaseSingleFieldPeriod.standardPeriodIn(period, DateTimeConstants.MILLIS_PER_WEEK);
        __CLR4_4_14zl4zllc8azsit.R.inc(6502);return Weeks.weeks(amount);
    }finally{__CLR4_4_14zl4zllc8azsit.R.flushNeeded();}}

    /**
     * Creates a new <code>Weeks</code> by parsing a string in the ISO8601 format 'PnW'.
     * <p>
     * The parse will accept the full ISO syntax of PnYnMnWnDTnHnMnS however only the
     * weeks component may be non-zero. If any other component is non-zero, an exception
     * will be thrown.
     *
     * @param periodStr  the period string, null returns zero
     * @return the period in weeks
     * @throws IllegalArgumentException if the string format is invalid
     */
    @FromString
    public static Weeks parseWeeks(String periodStr) {try{__CLR4_4_14zl4zllc8azsit.R.inc(6503);
        __CLR4_4_14zl4zllc8azsit.R.inc(6504);if ((((periodStr == null)&&(__CLR4_4_14zl4zllc8azsit.R.iget(6505)!=0|true))||(__CLR4_4_14zl4zllc8azsit.R.iget(6506)==0&false))) {{
            __CLR4_4_14zl4zllc8azsit.R.inc(6507);return Weeks.ZERO;
        }
        }__CLR4_4_14zl4zllc8azsit.R.inc(6508);Period p = PARSER.parsePeriod(periodStr);
        __CLR4_4_14zl4zllc8azsit.R.inc(6509);return Weeks.weeks(p.getWeeks());
    }finally{__CLR4_4_14zl4zllc8azsit.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Creates a new instance representing a number of weeks.
     * You should consider using the factory method {@link #weeks(int)}
     * instead of the constructor.
     *
     * @param weeks  the number of weeks to represent
     */
    private Weeks(int weeks) {
        super(weeks);__CLR4_4_14zl4zllc8azsit.R.inc(6511);try{__CLR4_4_14zl4zllc8azsit.R.inc(6510);
    }finally{__CLR4_4_14zl4zllc8azsit.R.flushNeeded();}}

    /**
     * Resolves singletons.
     * 
     * @return the singleton instance
     */
    private Object readResolve() {try{__CLR4_4_14zl4zllc8azsit.R.inc(6512);
        __CLR4_4_14zl4zllc8azsit.R.inc(6513);return Weeks.weeks(getValue());
    }finally{__CLR4_4_14zl4zllc8azsit.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Gets the duration field type, which is <code>weeks</code>.
     *
     * @return the period type
     */
    public DurationFieldType getFieldType() {try{__CLR4_4_14zl4zllc8azsit.R.inc(6514);
        __CLR4_4_14zl4zllc8azsit.R.inc(6515);return DurationFieldType.weeks();
    }finally{__CLR4_4_14zl4zllc8azsit.R.flushNeeded();}}

    /**
     * Gets the period type, which is <code>weeks</code>.
     *
     * @return the period type
     */
    public PeriodType getPeriodType() {try{__CLR4_4_14zl4zllc8azsit.R.inc(6516);
        __CLR4_4_14zl4zllc8azsit.R.inc(6517);return PeriodType.weeks();
    }finally{__CLR4_4_14zl4zllc8azsit.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Converts this period in weeks to a period in days assuming a
     * 7 day week.
     * <p>
     * This method allows you to convert between different types of period.
     * However to achieve this it makes the assumption that all weeks are
     * 7 days long.
     * This may not be true for some unusual chronologies. However, it is included
     * as it is a useful operation for many applications and business rules.
     * 
     * @return a period representing the number of days for this number of weeks
     * @throws ArithmeticException if the number of days is too large to be represented
     */
    public Days toStandardDays() {try{__CLR4_4_14zl4zllc8azsit.R.inc(6518);
        __CLR4_4_14zl4zllc8azsit.R.inc(6519);return Days.days(FieldUtils.safeMultiply(getValue(), DateTimeConstants.DAYS_PER_WEEK));
    }finally{__CLR4_4_14zl4zllc8azsit.R.flushNeeded();}}

    /**
     * Converts this period in weeks to a period in hours assuming a
     * 7 day week and 24 hour day.
     * <p>
     * This method allows you to convert between different types of period.
     * However to achieve this it makes the assumption that all weeks are
     * 7 days long and all days are 24 hours long.
     * This is not true when daylight savings is considered and may also not
     * be true for some unusual chronologies. However, it is included
     * as it is a useful operation for many applications and business rules.
     * 
     * @return a period representing the number of hours for this number of weeks
     * @throws ArithmeticException if the number of hours is too large to be represented
     */
    public Hours toStandardHours() {try{__CLR4_4_14zl4zllc8azsit.R.inc(6520);
        __CLR4_4_14zl4zllc8azsit.R.inc(6521);return Hours.hours(FieldUtils.safeMultiply(getValue(), DateTimeConstants.HOURS_PER_WEEK));
    }finally{__CLR4_4_14zl4zllc8azsit.R.flushNeeded();}}

    /**
     * Converts this period in weeks to a period in minutes assuming a
     * 7 day week, 24 hour day and 60 minute hour.
     * <p>
     * This method allows you to convert between different types of period.
     * However to achieve this it makes the assumption that all weeks are
     * 7 days long, all days are 24 hours long and all hours are 60 minutes long.
     * This is not true when daylight savings is considered and may also not
     * be true for some unusual chronologies. However, it is included
     * as it is a useful operation for many applications and business rules.
     * 
     * @return a period representing the number of minutes for this number of weeks
     * @throws ArithmeticException if the number of minutes is too large to be represented
     */
    public Minutes toStandardMinutes() {try{__CLR4_4_14zl4zllc8azsit.R.inc(6522);
        __CLR4_4_14zl4zllc8azsit.R.inc(6523);return Minutes.minutes(FieldUtils.safeMultiply(getValue(), DateTimeConstants.MINUTES_PER_WEEK));
    }finally{__CLR4_4_14zl4zllc8azsit.R.flushNeeded();}}

    /**
     * Converts this period in weeks to a period in seconds assuming a
     * 7 day week, 24 hour day, 60 minute hour and 60 second minute.
     * <p>
     * This method allows you to convert between different types of period.
     * However to achieve this it makes the assumption that all weeks are
     * 7 days long, all days are 24 hours long, all hours are 60 minutes long
     * and all minutes are 60 seconds long.
     * This is not true when daylight savings is considered and may also not
     * be true for some unusual chronologies. However, it is included
     * as it is a useful operation for many applications and business rules.
     * 
     * @return a period representing the number of seconds for this number of weeks
     * @throws ArithmeticException if the number of seconds is too large to be represented
     */
    public Seconds toStandardSeconds() {try{__CLR4_4_14zl4zllc8azsit.R.inc(6524);
        __CLR4_4_14zl4zllc8azsit.R.inc(6525);return Seconds.seconds(FieldUtils.safeMultiply(getValue(), DateTimeConstants.SECONDS_PER_WEEK));
    }finally{__CLR4_4_14zl4zllc8azsit.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Converts this period in weeks to a duration in milliweeks assuming a
     * 7 day week, 24 hour day, 60 minute hour and 60 second minute.
     * <p>
     * This method allows you to convert from a period to a duration.
     * However to achieve this it makes the assumption that all weeks are
     * 7 days long, all days are 24 hours long, all hours are 60 minutes long
     * and all minutes are 60 seconds long.
     * This is not true when daylight savings time is considered, and may also
     * not be true for some unusual chronologies. However, it is included as it
     * is a useful operation for many applications and business rules.
     * 
     * @return a duration equivalent to this number of weeks
     */
    public Duration toStandardDuration() {try{__CLR4_4_14zl4zllc8azsit.R.inc(6526);
        __CLR4_4_14zl4zllc8azsit.R.inc(6527);long weeks = getValue();  // assign to a long
        __CLR4_4_14zl4zllc8azsit.R.inc(6528);return new Duration(weeks * DateTimeConstants.MILLIS_PER_WEEK);
    }finally{__CLR4_4_14zl4zllc8azsit.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Gets the number of weeks that this period represents.
     *
     * @return the number of weeks in the period
     */
    public int getWeeks() {try{__CLR4_4_14zl4zllc8azsit.R.inc(6529);
        __CLR4_4_14zl4zllc8azsit.R.inc(6530);return getValue();
    }finally{__CLR4_4_14zl4zllc8azsit.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Returns a new instance with the specified number of weeks added.
     * <p>
     * This instance is immutable and unaffected by this method call.
     *
     * @param weeks  the amount of weeks to add, may be negative
     * @return the new period plus the specified number of weeks
     * @throws ArithmeticException if the result overflows an int
     */
    public Weeks plus(int weeks) {try{__CLR4_4_14zl4zllc8azsit.R.inc(6531);
        __CLR4_4_14zl4zllc8azsit.R.inc(6532);if ((((weeks == 0)&&(__CLR4_4_14zl4zllc8azsit.R.iget(6533)!=0|true))||(__CLR4_4_14zl4zllc8azsit.R.iget(6534)==0&false))) {{
            __CLR4_4_14zl4zllc8azsit.R.inc(6535);return this;
        }
        }__CLR4_4_14zl4zllc8azsit.R.inc(6536);return Weeks.weeks(FieldUtils.safeAdd(getValue(), weeks));
    }finally{__CLR4_4_14zl4zllc8azsit.R.flushNeeded();}}

    /**
     * Returns a new instance with the specified number of weeks added.
     * <p>
     * This instance is immutable and unaffected by this method call.
     *
     * @param weeks  the amount of weeks to add, may be negative, null means zero
     * @return the new period plus the specified number of weeks
     * @throws ArithmeticException if the result overflows an int
     */
    public Weeks plus(Weeks weeks) {try{__CLR4_4_14zl4zllc8azsit.R.inc(6537);
        __CLR4_4_14zl4zllc8azsit.R.inc(6538);if ((((weeks == null)&&(__CLR4_4_14zl4zllc8azsit.R.iget(6539)!=0|true))||(__CLR4_4_14zl4zllc8azsit.R.iget(6540)==0&false))) {{
            __CLR4_4_14zl4zllc8azsit.R.inc(6541);return this;
        }
        }__CLR4_4_14zl4zllc8azsit.R.inc(6542);return plus(weeks.getValue());
    }finally{__CLR4_4_14zl4zllc8azsit.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Returns a new instance with the specified number of weeks taken away.
     * <p>
     * This instance is immutable and unaffected by this method call.
     *
     * @param weeks  the amount of weeks to take away, may be negative
     * @return the new period minus the specified number of weeks
     * @throws ArithmeticException if the result overflows an int
     */
    public Weeks minus(int weeks) {try{__CLR4_4_14zl4zllc8azsit.R.inc(6543);
        __CLR4_4_14zl4zllc8azsit.R.inc(6544);return plus(FieldUtils.safeNegate(weeks));
    }finally{__CLR4_4_14zl4zllc8azsit.R.flushNeeded();}}

    /**
     * Returns a new instance with the specified number of weeks taken away.
     * <p>
     * This instance is immutable and unaffected by this method call.
     *
     * @param weeks  the amount of weeks to take away, may be negative, null means zero
     * @return the new period minus the specified number of weeks
     * @throws ArithmeticException if the result overflows an int
     */
    public Weeks minus(Weeks weeks) {try{__CLR4_4_14zl4zllc8azsit.R.inc(6545);
        __CLR4_4_14zl4zllc8azsit.R.inc(6546);if ((((weeks == null)&&(__CLR4_4_14zl4zllc8azsit.R.iget(6547)!=0|true))||(__CLR4_4_14zl4zllc8azsit.R.iget(6548)==0&false))) {{
            __CLR4_4_14zl4zllc8azsit.R.inc(6549);return this;
        }
        }__CLR4_4_14zl4zllc8azsit.R.inc(6550);return minus(weeks.getValue());
    }finally{__CLR4_4_14zl4zllc8azsit.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Returns a new instance with the weeks multiplied by the specified scalar.
     * <p>
     * This instance is immutable and unaffected by this method call.
     *
     * @param scalar  the amount to multiply by, may be negative
     * @return the new period multiplied by the specified scalar
     * @throws ArithmeticException if the result overflows an int
     */
    public Weeks multipliedBy(int scalar) {try{__CLR4_4_14zl4zllc8azsit.R.inc(6551);
        __CLR4_4_14zl4zllc8azsit.R.inc(6552);return Weeks.weeks(FieldUtils.safeMultiply(getValue(), scalar));
    }finally{__CLR4_4_14zl4zllc8azsit.R.flushNeeded();}}

    /**
     * Returns a new instance with the weeks divided by the specified divisor.
     * The calculation uses integer division, thus 3 divided by 2 is 1.
     * <p>
     * This instance is immutable and unaffected by this method call.
     *
     * @param divisor  the amount to divide by, may be negative
     * @return the new period divided by the specified divisor
     * @throws ArithmeticException if the divisor is zero
     */
    public Weeks dividedBy(int divisor) {try{__CLR4_4_14zl4zllc8azsit.R.inc(6553);
        __CLR4_4_14zl4zllc8azsit.R.inc(6554);if ((((divisor == 1)&&(__CLR4_4_14zl4zllc8azsit.R.iget(6555)!=0|true))||(__CLR4_4_14zl4zllc8azsit.R.iget(6556)==0&false))) {{
            __CLR4_4_14zl4zllc8azsit.R.inc(6557);return this;
        }
        }__CLR4_4_14zl4zllc8azsit.R.inc(6558);return Weeks.weeks(getValue() / divisor);
    }finally{__CLR4_4_14zl4zllc8azsit.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Returns a new instance with the weeks value negated.
     *
     * @return the new period with a negated value
     * @throws ArithmeticException if the result overflows an int
     */
    public Weeks negated() {try{__CLR4_4_14zl4zllc8azsit.R.inc(6559);
        __CLR4_4_14zl4zllc8azsit.R.inc(6560);return Weeks.weeks(FieldUtils.safeNegate(getValue()));
    }finally{__CLR4_4_14zl4zllc8azsit.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Is this weeks instance greater than the specified number of weeks.
     *
     * @param other  the other period, null means zero
     * @return true if this weeks instance is greater than the specified one
     */
    public boolean isGreaterThan(Weeks other) {try{__CLR4_4_14zl4zllc8azsit.R.inc(6561);
        __CLR4_4_14zl4zllc8azsit.R.inc(6562);if ((((other == null)&&(__CLR4_4_14zl4zllc8azsit.R.iget(6563)!=0|true))||(__CLR4_4_14zl4zllc8azsit.R.iget(6564)==0&false))) {{
            __CLR4_4_14zl4zllc8azsit.R.inc(6565);return getValue() > 0;
        }
        }__CLR4_4_14zl4zllc8azsit.R.inc(6566);return getValue() > other.getValue();
    }finally{__CLR4_4_14zl4zllc8azsit.R.flushNeeded();}}

    /**
     * Is this weeks instance less than the specified number of weeks.
     *
     * @param other  the other period, null means zero
     * @return true if this weeks instance is less than the specified one
     */
    public boolean isLessThan(Weeks other) {try{__CLR4_4_14zl4zllc8azsit.R.inc(6567);
        __CLR4_4_14zl4zllc8azsit.R.inc(6568);if ((((other == null)&&(__CLR4_4_14zl4zllc8azsit.R.iget(6569)!=0|true))||(__CLR4_4_14zl4zllc8azsit.R.iget(6570)==0&false))) {{
            __CLR4_4_14zl4zllc8azsit.R.inc(6571);return getValue() < 0;
        }
        }__CLR4_4_14zl4zllc8azsit.R.inc(6572);return getValue() < other.getValue();
    }finally{__CLR4_4_14zl4zllc8azsit.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Gets this instance as a String in the ISO8601 duration format.
     * <p>
     * For example, "P4W" represents 4 weeks.
     *
     * @return the value as an ISO8601 string
     */
    @ToString
    public String toString() {try{__CLR4_4_14zl4zllc8azsit.R.inc(6573);
        __CLR4_4_14zl4zllc8azsit.R.inc(6574);return "P" + String.valueOf(getValue()) + "W";
    }finally{__CLR4_4_14zl4zllc8azsit.R.flushNeeded();}}

}
