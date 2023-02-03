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
 * An immutable time period representing a number of hours.
 * <p>
 * <code>Hours</code> is an immutable period that can only store hours.
 * It does not store years, months or minutes for example. As such it is a
 * type-safe way of representing a number of hours in an application.
 * <p>
 * The number of hours is set in the constructor, and may be queried using
 * <code>getHours()</code>. Basic mathematical operations are provided -
 * <code>plus()</code>, <code>minus()</code>, <code>multipliedBy()</code> and
 * <code>dividedBy()</code>.
 * <p>
 * <code>Hours</code> is thread-safe and immutable.
 *
 * @author Stephen Colebourne
 * @since 1.4
 */
@java.lang.SuppressWarnings({"fallthrough"}) public final class Hours extends BaseSingleFieldPeriod {public static class __CLR4_4_11kg1kglc8azrwy{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672271027956L,8589935092L,2152,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** Constant representing zero hours. */
    public static final Hours ZERO = new Hours(0);
    /** Constant representing one hour. */
    public static final Hours ONE = new Hours(1);
    /** Constant representing two hours. */
    public static final Hours TWO = new Hours(2);
    /** Constant representing three hours. */
    public static final Hours THREE = new Hours(3);
    /** Constant representing four hours. */
    public static final Hours FOUR = new Hours(4);
    /** Constant representing five hours. */
    public static final Hours FIVE = new Hours(5);
    /** Constant representing six hours. */
    public static final Hours SIX = new Hours(6);
    /** Constant representing seven hours. */
    public static final Hours SEVEN = new Hours(7);
    /** Constant representing eight hours. */
    public static final Hours EIGHT = new Hours(8);
    /** Constant representing the maximum number of hours that can be stored in this object. */
    public static final Hours MAX_VALUE = new Hours(Integer.MAX_VALUE);
    /** Constant representing the minimum number of hours that can be stored in this object. */
    public static final Hours MIN_VALUE = new Hours(Integer.MIN_VALUE);

    /** The paser to use for this class. */
    private static final PeriodFormatter PARSER = ISOPeriodFormat.standard().withParseType(PeriodType.hours());
    /** Serialization version. */
    private static final long serialVersionUID = 87525275727380864L;

    //-----------------------------------------------------------------------
    /**
     * Obtains an instance of <code>Hours</code> that may be cached.
     * <code>Hours</code> is immutable, so instances can be cached and shared.
     * This factory method provides access to shared instances.
     *
     * @param hours  the number of hours to obtain an instance for
     * @return the instance of Hours
     */
    public static Hours hours(int hours) {try{__CLR4_4_11kg1kglc8azrwy.R.inc(2032);
        boolean __CLB4_4_1_bool0=false;__CLR4_4_11kg1kglc8azrwy.R.inc(2033);switch (hours) {
            case 0:if (!__CLB4_4_1_bool0) {__CLR4_4_11kg1kglc8azrwy.R.inc(2034);__CLB4_4_1_bool0=true;}
                __CLR4_4_11kg1kglc8azrwy.R.inc(2035);return ZERO;
            case 1:if (!__CLB4_4_1_bool0) {__CLR4_4_11kg1kglc8azrwy.R.inc(2036);__CLB4_4_1_bool0=true;}
                __CLR4_4_11kg1kglc8azrwy.R.inc(2037);return ONE;
            case 2:if (!__CLB4_4_1_bool0) {__CLR4_4_11kg1kglc8azrwy.R.inc(2038);__CLB4_4_1_bool0=true;}
                __CLR4_4_11kg1kglc8azrwy.R.inc(2039);return TWO;
            case 3:if (!__CLB4_4_1_bool0) {__CLR4_4_11kg1kglc8azrwy.R.inc(2040);__CLB4_4_1_bool0=true;}
                __CLR4_4_11kg1kglc8azrwy.R.inc(2041);return THREE;
            case 4:if (!__CLB4_4_1_bool0) {__CLR4_4_11kg1kglc8azrwy.R.inc(2042);__CLB4_4_1_bool0=true;}
                __CLR4_4_11kg1kglc8azrwy.R.inc(2043);return FOUR;
            case 5:if (!__CLB4_4_1_bool0) {__CLR4_4_11kg1kglc8azrwy.R.inc(2044);__CLB4_4_1_bool0=true;}
                __CLR4_4_11kg1kglc8azrwy.R.inc(2045);return FIVE;
            case 6:if (!__CLB4_4_1_bool0) {__CLR4_4_11kg1kglc8azrwy.R.inc(2046);__CLB4_4_1_bool0=true;}
                __CLR4_4_11kg1kglc8azrwy.R.inc(2047);return SIX;
            case 7:if (!__CLB4_4_1_bool0) {__CLR4_4_11kg1kglc8azrwy.R.inc(2048);__CLB4_4_1_bool0=true;}
                __CLR4_4_11kg1kglc8azrwy.R.inc(2049);return SEVEN;
            case 8:if (!__CLB4_4_1_bool0) {__CLR4_4_11kg1kglc8azrwy.R.inc(2050);__CLB4_4_1_bool0=true;}
                __CLR4_4_11kg1kglc8azrwy.R.inc(2051);return EIGHT;
            case Integer.MAX_VALUE:if (!__CLB4_4_1_bool0) {__CLR4_4_11kg1kglc8azrwy.R.inc(2052);__CLB4_4_1_bool0=true;}
                __CLR4_4_11kg1kglc8azrwy.R.inc(2053);return MAX_VALUE;
            case Integer.MIN_VALUE:if (!__CLB4_4_1_bool0) {__CLR4_4_11kg1kglc8azrwy.R.inc(2054);__CLB4_4_1_bool0=true;}
                __CLR4_4_11kg1kglc8azrwy.R.inc(2055);return MIN_VALUE;
            default:if (!__CLB4_4_1_bool0) {__CLR4_4_11kg1kglc8azrwy.R.inc(2056);__CLB4_4_1_bool0=true;}
                __CLR4_4_11kg1kglc8azrwy.R.inc(2057);return new Hours(hours);
        }
    }finally{__CLR4_4_11kg1kglc8azrwy.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Creates a <code>Hours</code> representing the number of whole hours
     * between the two specified datetimes.
     *
     * @param start  the start instant, must not be null
     * @param end  the end instant, must not be null
     * @return the period in hours
     * @throws IllegalArgumentException if the instants are null or invalid
     */
    public static Hours hoursBetween(ReadableInstant start, ReadableInstant end) {try{__CLR4_4_11kg1kglc8azrwy.R.inc(2058);
        __CLR4_4_11kg1kglc8azrwy.R.inc(2059);int amount = BaseSingleFieldPeriod.between(start, end, DurationFieldType.hours());
        __CLR4_4_11kg1kglc8azrwy.R.inc(2060);return Hours.hours(amount);
    }finally{__CLR4_4_11kg1kglc8azrwy.R.flushNeeded();}}

    /**
     * Creates a <code>Hours</code> representing the number of whole hours
     * between the two specified partial datetimes.
     * <p>
     * The two partials must contain the same fields, for example you can specify
     * two <code>LocalTime</code> objects.
     *
     * @param start  the start partial date, must not be null
     * @param end  the end partial date, must not be null
     * @return the period in hours
     * @throws IllegalArgumentException if the partials are null or invalid
     */
    public static Hours hoursBetween(ReadablePartial start, ReadablePartial end) {try{__CLR4_4_11kg1kglc8azrwy.R.inc(2061);
        __CLR4_4_11kg1kglc8azrwy.R.inc(2062);if ((((start instanceof LocalTime && end instanceof LocalTime)&&(__CLR4_4_11kg1kglc8azrwy.R.iget(2063)!=0|true))||(__CLR4_4_11kg1kglc8azrwy.R.iget(2064)==0&false)))   {{
            __CLR4_4_11kg1kglc8azrwy.R.inc(2065);Chronology chrono = DateTimeUtils.getChronology(start.getChronology());
            __CLR4_4_11kg1kglc8azrwy.R.inc(2066);int hours = chrono.hours().getDifference(
                    ((LocalTime) end).getLocalMillis(), ((LocalTime) start).getLocalMillis());
            __CLR4_4_11kg1kglc8azrwy.R.inc(2067);return Hours.hours(hours);
        }
        }__CLR4_4_11kg1kglc8azrwy.R.inc(2068);int amount = BaseSingleFieldPeriod.between(start, end, ZERO);
        __CLR4_4_11kg1kglc8azrwy.R.inc(2069);return Hours.hours(amount);
    }finally{__CLR4_4_11kg1kglc8azrwy.R.flushNeeded();}}

    /**
     * Creates a <code>Hours</code> representing the number of whole hours
     * in the specified interval.
     *
     * @param interval  the interval to extract hours from, null returns zero
     * @return the period in hours
     * @throws IllegalArgumentException if the partials are null or invalid
     */
    public static Hours hoursIn(ReadableInterval interval) {try{__CLR4_4_11kg1kglc8azrwy.R.inc(2070);
        __CLR4_4_11kg1kglc8azrwy.R.inc(2071);if ((((interval == null)&&(__CLR4_4_11kg1kglc8azrwy.R.iget(2072)!=0|true))||(__CLR4_4_11kg1kglc8azrwy.R.iget(2073)==0&false)))   {{
            __CLR4_4_11kg1kglc8azrwy.R.inc(2074);return Hours.ZERO;
        }
        }__CLR4_4_11kg1kglc8azrwy.R.inc(2075);int amount = BaseSingleFieldPeriod.between(interval.getStart(), interval.getEnd(), DurationFieldType.hours());
        __CLR4_4_11kg1kglc8azrwy.R.inc(2076);return Hours.hours(amount);
    }finally{__CLR4_4_11kg1kglc8azrwy.R.flushNeeded();}}

    /**
     * Creates a new <code>Hours</code> representing the number of complete
     * standard length hours in the specified period.
     * <p>
     * This factory method converts all fields from the period to hours using standardised
     * durations for each field. Only those fields which have a precise duration in
     * the ISO UTC chronology can be converted.
     * <ul>
     * <li>One week consists of 7 days.
     * <li>One day consists of 24 hours.
     * <li>One hour consists of 60 minutes.
     * <li>One minute consists of 60 seconds.
     * <li>One second consists of 1000 milliseconds.
     * </ul>
     * Months and Years are imprecise and periods containing these values cannot be converted.
     *
     * @param period  the period to get the number of hours from, null returns zero
     * @return the period in hours
     * @throws IllegalArgumentException if the period contains imprecise duration values
     */
    public static Hours standardHoursIn(ReadablePeriod period) {try{__CLR4_4_11kg1kglc8azrwy.R.inc(2077);
        __CLR4_4_11kg1kglc8azrwy.R.inc(2078);int amount = BaseSingleFieldPeriod.standardPeriodIn(period, DateTimeConstants.MILLIS_PER_HOUR);
        __CLR4_4_11kg1kglc8azrwy.R.inc(2079);return Hours.hours(amount);
    }finally{__CLR4_4_11kg1kglc8azrwy.R.flushNeeded();}}

    /**
     * Creates a new <code>Hours</code> by parsing a string in the ISO8601 format 'PTnH'.
     * <p>
     * The parse will accept the full ISO syntax of PnYnMnWnDTnHnMnS however only the
     * hours component may be non-zero. If any other component is non-zero, an exception
     * will be thrown.
     *
     * @param periodStr  the period string, null returns zero
     * @return the period in hours
     * @throws IllegalArgumentException if the string format is invalid
     */
    @FromString
    public static Hours parseHours(String periodStr) {try{__CLR4_4_11kg1kglc8azrwy.R.inc(2080);
        __CLR4_4_11kg1kglc8azrwy.R.inc(2081);if ((((periodStr == null)&&(__CLR4_4_11kg1kglc8azrwy.R.iget(2082)!=0|true))||(__CLR4_4_11kg1kglc8azrwy.R.iget(2083)==0&false))) {{
            __CLR4_4_11kg1kglc8azrwy.R.inc(2084);return Hours.ZERO;
        }
        }__CLR4_4_11kg1kglc8azrwy.R.inc(2085);Period p = PARSER.parsePeriod(periodStr);
        __CLR4_4_11kg1kglc8azrwy.R.inc(2086);return Hours.hours(p.getHours());
    }finally{__CLR4_4_11kg1kglc8azrwy.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Creates a new instance representing a number of hours.
     * You should consider using the factory method {@link #hours(int)}
     * instead of the constructor.
     *
     * @param hours  the number of hours to represent
     */
    private Hours(int hours) {
        super(hours);__CLR4_4_11kg1kglc8azrwy.R.inc(2088);try{__CLR4_4_11kg1kglc8azrwy.R.inc(2087);
    }finally{__CLR4_4_11kg1kglc8azrwy.R.flushNeeded();}}

    /**
     * Resolves singletons.
     * 
     * @return the singleton instance
     */
    private Object readResolve() {try{__CLR4_4_11kg1kglc8azrwy.R.inc(2089);
        __CLR4_4_11kg1kglc8azrwy.R.inc(2090);return Hours.hours(getValue());
    }finally{__CLR4_4_11kg1kglc8azrwy.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Gets the duration field type, which is <code>hours</code>.
     *
     * @return the period type
     */
    public DurationFieldType getFieldType() {try{__CLR4_4_11kg1kglc8azrwy.R.inc(2091);
        __CLR4_4_11kg1kglc8azrwy.R.inc(2092);return DurationFieldType.hours();
    }finally{__CLR4_4_11kg1kglc8azrwy.R.flushNeeded();}}

    /**
     * Gets the period type, which is <code>hours</code>.
     *
     * @return the period type
     */
    public PeriodType getPeriodType() {try{__CLR4_4_11kg1kglc8azrwy.R.inc(2093);
        __CLR4_4_11kg1kglc8azrwy.R.inc(2094);return PeriodType.hours();
    }finally{__CLR4_4_11kg1kglc8azrwy.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Converts this period in hours to a period in weeks assuming a
     * 7 day week and 24 hour day.
     * <p>
     * This method allows you to convert between different types of period.
     * However to achieve this it makes the assumption that all weeks are 7 days
     * long and all days are 24 hours long.
     * This is not true when daylight savings time is considered, and may also
     * not be true for some unusual chronologies. However, it is included as it
     * is a useful operation for many applications and business rules.
     * 
     * @return a period representing the number of whole weeks for this number of hours
     */
    public Weeks toStandardWeeks() {try{__CLR4_4_11kg1kglc8azrwy.R.inc(2095);
        __CLR4_4_11kg1kglc8azrwy.R.inc(2096);return Weeks.weeks(getValue() / DateTimeConstants.HOURS_PER_WEEK);
    }finally{__CLR4_4_11kg1kglc8azrwy.R.flushNeeded();}}

    /**
     * Converts this period in hours to a period in days assuming a
     * 24 hour day.
     * <p>
     * This method allows you to convert between different types of period.
     * However to achieve this it makes the assumption that all days are 24 hours long.
     * This is not true when daylight savings time is considered, and may also
     * not be true for some unusual chronologies. However, it is included as it
     * is a useful operation for many applications and business rules.
     * 
     * @return a period representing the number of whole days for this number of hours
     */
    public Days toStandardDays() {try{__CLR4_4_11kg1kglc8azrwy.R.inc(2097);
        __CLR4_4_11kg1kglc8azrwy.R.inc(2098);return Days.days(getValue() / DateTimeConstants.HOURS_PER_DAY);
    }finally{__CLR4_4_11kg1kglc8azrwy.R.flushNeeded();}}

    /**
     * Converts this period in hours to a period in minutes assuming a
     * 60 minute hour.
     * <p>
     * This method allows you to convert between different types of period.
     * However to achieve this it makes the assumption that all hours are 60 minutes long.
     * This may not be true for some unusual chronologies. However, it is included
     * as it is a useful operation for many applications and business rules.
     * 
     * @return a period representing the number of minutes for this number of hours
     * @throws ArithmeticException if the number of minutes is too large to be represented
     */
    public Minutes toStandardMinutes() {try{__CLR4_4_11kg1kglc8azrwy.R.inc(2099);
        __CLR4_4_11kg1kglc8azrwy.R.inc(2100);return Minutes.minutes(FieldUtils.safeMultiply(getValue(), DateTimeConstants.MINUTES_PER_HOUR));
    }finally{__CLR4_4_11kg1kglc8azrwy.R.flushNeeded();}}

    /**
     * Converts this period in hours to a period in seconds assuming a
     * 60 minute hour and 60 second minute.
     * <p>
     * This method allows you to convert between different types of period.
     * However to achieve this it makes the assumption that all hours are
     * 60 minutes long and all minutes are 60 seconds long.
     * This may not be true for some unusual chronologies. However, it is included
     * as it is a useful operation for many applications and business rules.
     * 
     * @return a period representing the number of seconds for this number of hours
     * @throws ArithmeticException if the number of seconds is too large to be represented
     */
    public Seconds toStandardSeconds() {try{__CLR4_4_11kg1kglc8azrwy.R.inc(2101);
        __CLR4_4_11kg1kglc8azrwy.R.inc(2102);return Seconds.seconds(FieldUtils.safeMultiply(getValue(), DateTimeConstants.SECONDS_PER_HOUR));
    }finally{__CLR4_4_11kg1kglc8azrwy.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Converts this period in hours to a duration in milliseconds assuming a
     * 60 minute hour and 60 second minute.
     * <p>
     * This method allows you to convert from a period to a duration.
     * However to achieve this it makes the assumption that all hours are
     * 60 minutes and all minutes are 60 seconds. This might not be true for an
     * unusual chronology, for example one that takes leap seconds into account.
     * However, the method is included as it is a useful operation for many
     * applications and business rules.
     *
     * @return a duration equivalent to this number of hours
     */
    public Duration toStandardDuration() {try{__CLR4_4_11kg1kglc8azrwy.R.inc(2103);
        __CLR4_4_11kg1kglc8azrwy.R.inc(2104);long hours = getValue();  // assign to a long
        __CLR4_4_11kg1kglc8azrwy.R.inc(2105);return new Duration(hours * DateTimeConstants.MILLIS_PER_HOUR);
    }finally{__CLR4_4_11kg1kglc8azrwy.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Gets the number of hours that this period represents.
     *
     * @return the number of hours in the period
     */
    public int getHours() {try{__CLR4_4_11kg1kglc8azrwy.R.inc(2106);
        __CLR4_4_11kg1kglc8azrwy.R.inc(2107);return getValue();
    }finally{__CLR4_4_11kg1kglc8azrwy.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Returns a new instance with the specified number of hours added.
     * <p>
     * This instance is immutable and unaffected by this method call.
     *
     * @param hours  the amount of hours to add, may be negative
     * @return the new period plus the specified number of hours
     * @throws ArithmeticException if the result overflows an int
     */
    public Hours plus(int hours) {try{__CLR4_4_11kg1kglc8azrwy.R.inc(2108);
        __CLR4_4_11kg1kglc8azrwy.R.inc(2109);if ((((hours == 0)&&(__CLR4_4_11kg1kglc8azrwy.R.iget(2110)!=0|true))||(__CLR4_4_11kg1kglc8azrwy.R.iget(2111)==0&false))) {{
            __CLR4_4_11kg1kglc8azrwy.R.inc(2112);return this;
        }
        }__CLR4_4_11kg1kglc8azrwy.R.inc(2113);return Hours.hours(FieldUtils.safeAdd(getValue(), hours));
    }finally{__CLR4_4_11kg1kglc8azrwy.R.flushNeeded();}}

    /**
     * Returns a new instance with the specified number of hours added.
     * <p>
     * This instance is immutable and unaffected by this method call.
     *
     * @param hours  the amount of hours to add, may be negative, null means zero
     * @return the new period plus the specified number of hours
     * @throws ArithmeticException if the result overflows an int
     */
    public Hours plus(Hours hours) {try{__CLR4_4_11kg1kglc8azrwy.R.inc(2114);
        __CLR4_4_11kg1kglc8azrwy.R.inc(2115);if ((((hours == null)&&(__CLR4_4_11kg1kglc8azrwy.R.iget(2116)!=0|true))||(__CLR4_4_11kg1kglc8azrwy.R.iget(2117)==0&false))) {{
            __CLR4_4_11kg1kglc8azrwy.R.inc(2118);return this;
        }
        }__CLR4_4_11kg1kglc8azrwy.R.inc(2119);return plus(hours.getValue());
    }finally{__CLR4_4_11kg1kglc8azrwy.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Returns a new instance with the specified number of hours taken away.
     * <p>
     * This instance is immutable and unaffected by this method call.
     *
     * @param hours  the amount of hours to take away, may be negative
     * @return the new period minus the specified number of hours
     * @throws ArithmeticException if the result overflows an int
     */
    public Hours minus(int hours) {try{__CLR4_4_11kg1kglc8azrwy.R.inc(2120);
        __CLR4_4_11kg1kglc8azrwy.R.inc(2121);return plus(FieldUtils.safeNegate(hours));
    }finally{__CLR4_4_11kg1kglc8azrwy.R.flushNeeded();}}

    /**
     * Returns a new instance with the specified number of hours taken away.
     * <p>
     * This instance is immutable and unaffected by this method call.
     *
     * @param hours  the amount of hours to take away, may be negative, null means zero
     * @return the new period minus the specified number of hours
     * @throws ArithmeticException if the result overflows an int
     */
    public Hours minus(Hours hours) {try{__CLR4_4_11kg1kglc8azrwy.R.inc(2122);
        __CLR4_4_11kg1kglc8azrwy.R.inc(2123);if ((((hours == null)&&(__CLR4_4_11kg1kglc8azrwy.R.iget(2124)!=0|true))||(__CLR4_4_11kg1kglc8azrwy.R.iget(2125)==0&false))) {{
            __CLR4_4_11kg1kglc8azrwy.R.inc(2126);return this;
        }
        }__CLR4_4_11kg1kglc8azrwy.R.inc(2127);return minus(hours.getValue());
    }finally{__CLR4_4_11kg1kglc8azrwy.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Returns a new instance with the hours multiplied by the specified scalar.
     * <p>
     * This instance is immutable and unaffected by this method call.
     *
     * @param scalar  the amount to multiply by, may be negative
     * @return the new period multiplied by the specified scalar
     * @throws ArithmeticException if the result overflows an int
     */
    public Hours multipliedBy(int scalar) {try{__CLR4_4_11kg1kglc8azrwy.R.inc(2128);
        __CLR4_4_11kg1kglc8azrwy.R.inc(2129);return Hours.hours(FieldUtils.safeMultiply(getValue(), scalar));
    }finally{__CLR4_4_11kg1kglc8azrwy.R.flushNeeded();}}

    /**
     * Returns a new instance with the hours divided by the specified divisor.
     * The calculation uses integer division, thus 3 divided by 2 is 1.
     * <p>
     * This instance is immutable and unaffected by this method call.
     *
     * @param divisor  the amount to divide by, may be negative
     * @return the new period divided by the specified divisor
     * @throws ArithmeticException if the divisor is zero
     */
    public Hours dividedBy(int divisor) {try{__CLR4_4_11kg1kglc8azrwy.R.inc(2130);
        __CLR4_4_11kg1kglc8azrwy.R.inc(2131);if ((((divisor == 1)&&(__CLR4_4_11kg1kglc8azrwy.R.iget(2132)!=0|true))||(__CLR4_4_11kg1kglc8azrwy.R.iget(2133)==0&false))) {{
            __CLR4_4_11kg1kglc8azrwy.R.inc(2134);return this;
        }
        }__CLR4_4_11kg1kglc8azrwy.R.inc(2135);return Hours.hours(getValue() / divisor);
    }finally{__CLR4_4_11kg1kglc8azrwy.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Returns a new instance with the hours value negated.
     *
     * @return the new period with a negated value
     * @throws ArithmeticException if the result overflows an int
     */
    public Hours negated() {try{__CLR4_4_11kg1kglc8azrwy.R.inc(2136);
        __CLR4_4_11kg1kglc8azrwy.R.inc(2137);return Hours.hours(FieldUtils.safeNegate(getValue()));
    }finally{__CLR4_4_11kg1kglc8azrwy.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Is this hours instance greater than the specified number of hours.
     *
     * @param other  the other period, null means zero
     * @return true if this hours instance is greater than the specified one
     */
    public boolean isGreaterThan(Hours other) {try{__CLR4_4_11kg1kglc8azrwy.R.inc(2138);
        __CLR4_4_11kg1kglc8azrwy.R.inc(2139);if ((((other == null)&&(__CLR4_4_11kg1kglc8azrwy.R.iget(2140)!=0|true))||(__CLR4_4_11kg1kglc8azrwy.R.iget(2141)==0&false))) {{
            __CLR4_4_11kg1kglc8azrwy.R.inc(2142);return getValue() > 0;
        }
        }__CLR4_4_11kg1kglc8azrwy.R.inc(2143);return getValue() > other.getValue();
    }finally{__CLR4_4_11kg1kglc8azrwy.R.flushNeeded();}}

    /**
     * Is this hours instance less than the specified number of hours.
     *
     * @param other  the other period, null means zero
     * @return true if this hours instance is less than the specified one
     */
    public boolean isLessThan(Hours other) {try{__CLR4_4_11kg1kglc8azrwy.R.inc(2144);
        __CLR4_4_11kg1kglc8azrwy.R.inc(2145);if ((((other == null)&&(__CLR4_4_11kg1kglc8azrwy.R.iget(2146)!=0|true))||(__CLR4_4_11kg1kglc8azrwy.R.iget(2147)==0&false))) {{
            __CLR4_4_11kg1kglc8azrwy.R.inc(2148);return getValue() < 0;
        }
        }__CLR4_4_11kg1kglc8azrwy.R.inc(2149);return getValue() < other.getValue();
    }finally{__CLR4_4_11kg1kglc8azrwy.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Gets this instance as a String in the ISO8601 duration format.
     * <p>
     * For example, "PT4H" represents 4 hours.
     *
     * @return the value as an ISO8601 string
     */
    @ToString
    public String toString() {try{__CLR4_4_11kg1kglc8azrwy.R.inc(2150);
        __CLR4_4_11kg1kglc8azrwy.R.inc(2151);return "PT" + String.valueOf(getValue()) + "H";
    }finally{__CLR4_4_11kg1kglc8azrwy.R.flushNeeded();}}

}
