/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 *  Copyright 2001-2013 Stephen Colebourne
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

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Locale;

import org.joda.convert.FromString;
import org.joda.time.base.BaseDateTime;
import org.joda.time.field.AbstractReadableInstantFieldProperty;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.ISODateTimeFormat;

/**
 * DateMidnight defines a date where the time component is fixed at midnight.
 * The class uses a time zone, thus midnight is local unless a UTC time zone is used.
 * <p>
 * It is important to emphasise that this class represents the time of midnight on
 * any given day.
 * Note that midnight is defined as 00:00, which is at the very start of a day.
 * <p>
 * This class does not represent a day, but the millisecond instant at midnight.
 * If you need a class that represents the whole day, then an {@link Interval} or
 * a {@link LocalDate} may be more suitable.
 * <p>
 * This class uses a Chronology internally. The Chronology determines how the
 * millisecond instant value is converted into the date time fields.
 * The default Chronology is <code>ISOChronology</code> which is the agreed
 * international standard and compatable with the modern Gregorian calendar.
 *
 * <p>Each individual field can be queried in two ways:
 * <ul>
 * <li><code>getDayOfMonth()</code>
 * <li><code>dayOfMonth().get()</code>
 * </ul>
 * The second technique also provides access to other useful methods on the
 * field:
 * <ul>
 * <li>numeric value
 * <li>text value
 * <li>short text value
 * <li>maximum/minimum values
 * <li>add/subtract
 * <li>set
 * <li>rounding
 * </ul>
 *
 * <p>
 * DateMidnight is thread-safe and immutable, provided that the Chronology is as well.
 * All standard Chronology classes supplied are thread-safe and immutable.
 *
 * @author Stephen Colebourne
 * @since 1.0
 * @deprecated The time of midnight does not exist in some time zones
 * where the daylight saving time forward shift skips the midnight hour.
 * Use {@link LocalDate} to represent a date without a time zone.
 * Or use {@link DateTime} to represent a full date and time, perhaps
 * using {@link DateTime#withTimeAtStartOfDay()} to get an instant at the
 * start of a day.
 */
@Deprecated
public final class DateMidnight
        extends BaseDateTime
        implements ReadableDateTime, Serializable {public static class __CLR4_4_100lc8azrho{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672271027956L,8589935092L,284,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    
    /** Serialization lock */
    private static final long serialVersionUID = 156371964018738L;

    //-----------------------------------------------------------------------
    /**
     * Obtains a {@code DateMidnight} set to the current system millisecond time
     * using <code>ISOChronology</code> in the default time zone.
     * The constructed object will have a local time of midnight.
     * 
     * @return the current date, not null
     * @since 2.0
     */
    public static DateMidnight now() {try{__CLR4_4_100lc8azrho.R.inc(0);
        __CLR4_4_100lc8azrho.R.inc(1);return new DateMidnight();
    }finally{__CLR4_4_100lc8azrho.R.flushNeeded();}}

    /**
     * Obtains a {@code DateMidnight} set to the current system millisecond time
     * using <code>ISOChronology</code> in the specified time zone.
     * The constructed object will have a local time of midnight.
     *
     * @param zone  the time zone, not null
     * @return the current date, not null
     * @since 2.0
     */
    public static DateMidnight now(DateTimeZone zone) {try{__CLR4_4_100lc8azrho.R.inc(2);
        __CLR4_4_100lc8azrho.R.inc(3);if ((((zone == null)&&(__CLR4_4_100lc8azrho.R.iget(4)!=0|true))||(__CLR4_4_100lc8azrho.R.iget(5)==0&false))) {{
            __CLR4_4_100lc8azrho.R.inc(6);throw new NullPointerException("Zone must not be null");
        }
        }__CLR4_4_100lc8azrho.R.inc(7);return new DateMidnight(zone);
    }finally{__CLR4_4_100lc8azrho.R.flushNeeded();}}

    /**
     * Obtains a {@code DateMidnight} set to the current system millisecond time
     * using the specified chronology.
     * The constructed object will have a local time of midnight.
     *
     * @param chronology  the chronology, not null
     * @return the current date, not null
     * @since 2.0
     */
    public static DateMidnight now(Chronology chronology) {try{__CLR4_4_100lc8azrho.R.inc(8);
        __CLR4_4_100lc8azrho.R.inc(9);if ((((chronology == null)&&(__CLR4_4_100lc8azrho.R.iget(10)!=0|true))||(__CLR4_4_100lc8azrho.R.iget(11)==0&false))) {{
            __CLR4_4_100lc8azrho.R.inc(12);throw new NullPointerException("Chronology must not be null");
        }
        }__CLR4_4_100lc8azrho.R.inc(13);return new DateMidnight(chronology);
    }finally{__CLR4_4_100lc8azrho.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Parses a {@code DateMidnight} from the specified string.
     * <p>
     * This uses {@link ISODateTimeFormat#dateTimeParser()}.
     * 
     * @param str  the string to parse, not null
     * @since 2.0
     */
    @FromString
    public static DateMidnight parse(String str) {try{__CLR4_4_100lc8azrho.R.inc(14);
        __CLR4_4_100lc8azrho.R.inc(15);return parse(str, ISODateTimeFormat.dateTimeParser().withOffsetParsed());
    }finally{__CLR4_4_100lc8azrho.R.flushNeeded();}}

    /**
     * Parses a {@code DateMidnight} from the specified string using a formatter.
     * 
     * @param str  the string to parse, not null
     * @param formatter  the formatter to use, not null
     * @since 2.0
     */
    public static DateMidnight parse(String str, DateTimeFormatter formatter) {try{__CLR4_4_100lc8azrho.R.inc(16);
        __CLR4_4_100lc8azrho.R.inc(17);return formatter.parseDateTime(str).toDateMidnight();
    }finally{__CLR4_4_100lc8azrho.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Constructs an instance set to the current system millisecond time
     * using <code>ISOChronology</code> in the default time zone.
     * The constructed object will have a local time of midnight.
     * 
     * @see #now()
     */
    public DateMidnight() {
        super();__CLR4_4_100lc8azrho.R.inc(19);try{__CLR4_4_100lc8azrho.R.inc(18);
    }finally{__CLR4_4_100lc8azrho.R.flushNeeded();}}

    /**
     * Constructs an instance set to the current system millisecond time
     * using <code>ISOChronology</code> in the specified time zone.
     * The constructed object will have a local time of midnight.
     * <p>
     * If the specified time zone is null, the default zone is used.
     *
     * @param zone  the time zone, null means default zone
     * @see #now(DateTimeZone)
     */
    public DateMidnight(DateTimeZone zone) {
        super(zone);__CLR4_4_100lc8azrho.R.inc(21);try{__CLR4_4_100lc8azrho.R.inc(20);
    }finally{__CLR4_4_100lc8azrho.R.flushNeeded();}}

    /**
     * Constructs an instance set to the current system millisecond time
     * using the specified chronology.
     * The constructed object will have a local time of midnight.
     * <p>
     * If the chronology is null, <code>ISOChronology</code>
     * in the default time zone is used.
     *
     * @param chronology  the chronology, null means ISOChronology in default zone
     * @see #now(Chronology)
     */
    public DateMidnight(Chronology chronology) {
        super(chronology);__CLR4_4_100lc8azrho.R.inc(23);try{__CLR4_4_100lc8azrho.R.inc(22);
    }finally{__CLR4_4_100lc8azrho.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Constructs an instance set to the milliseconds from 1970-01-01T00:00:00Z
     * using <code>ISOChronology</code> in the default time zone.
     * The constructed object will have a local time of midnight.
     *
     * @param instant  the milliseconds from 1970-01-01T00:00:00Z
     */
    public DateMidnight(long instant) {
        super(instant);__CLR4_4_100lc8azrho.R.inc(25);try{__CLR4_4_100lc8azrho.R.inc(24);
    }finally{__CLR4_4_100lc8azrho.R.flushNeeded();}}

    /**
     * Constructs an instance set to the milliseconds from 1970-01-01T00:00:00Z
     * using <code>ISOChronology</code> in the specified time zone.
     * The constructed object will have a local time of midnight.
     * <p>
     * If the specified time zone is null, the default zone is used.
     *
     * @param instant  the milliseconds from 1970-01-01T00:00:00Z
     * @param zone  the time zone, null means default zone
     */
    public DateMidnight(long instant, DateTimeZone zone) {
        super(instant, zone);__CLR4_4_100lc8azrho.R.inc(27);try{__CLR4_4_100lc8azrho.R.inc(26);
    }finally{__CLR4_4_100lc8azrho.R.flushNeeded();}}

    /**
     * Constructs an instance set to the milliseconds from 1970-01-01T00:00:00Z
     * using the specified chronology.
     * The constructed object will have a local time of midnight.
     * <p>
     * If the chronology is null, <code>ISOChronology</code>
     * in the default time zone is used.
     *
     * @param instant  the milliseconds from 1970-01-01T00:00:00Z
     * @param chronology  the chronology, null means ISOChronology in default zone
     */
    public DateMidnight(long instant, Chronology chronology) {
        super(instant, chronology);__CLR4_4_100lc8azrho.R.inc(29);try{__CLR4_4_100lc8azrho.R.inc(28);
    }finally{__CLR4_4_100lc8azrho.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Constructs an instance from an Object that represents a datetime.
     * The constructed object will have a local time of midnight.
     * <p>
     * If the object implies a chronology (such as GregorianCalendar does),
     * then that chronology will be used. Otherwise, ISO default is used.
     * Thus if a GregorianCalendar is passed in, the chronology used will
     * be GJ, but if a Date is passed in the chronology will be ISO.
     * <p>
     * The recognised object types are defined in
     * {@link org.joda.time.convert.ConverterManager ConverterManager} and
     * include ReadableInstant, String, Calendar and Date.
     * The String formats are described by {@link ISODateTimeFormat#dateTimeParser()}.
     *
     * @param instant  the datetime object, null means now
     * @throws IllegalArgumentException if the instant is invalid
     */
    public DateMidnight(Object instant) {
        super(instant, (Chronology) null);__CLR4_4_100lc8azrho.R.inc(31);try{__CLR4_4_100lc8azrho.R.inc(30);
    }finally{__CLR4_4_100lc8azrho.R.flushNeeded();}}

    /**
     * Constructs an instance from an Object that represents a datetime,
     * forcing the time zone to that specified.
     * The constructed object will have a local time of midnight.
     * <p>
     * If the object implies a chronology (such as GregorianCalendar does),
     * then that chronology will be used, but with the time zone adjusted.
     * Otherwise, ISO is used in the specified time zone.
     * If the specified time zone is null, the default zone is used.
     * Thus if a GregorianCalendar is passed in, the chronology used will
     * be GJ, but if a Date is passed in the chronology will be ISO.
     * <p>
     * The recognised object types are defined in
     * {@link org.joda.time.convert.ConverterManager ConverterManager} and
     * include ReadableInstant, String, Calendar and Date.
     * The String formats are described by {@link ISODateTimeFormat#dateTimeParser()}.
     *
     * @param instant  the datetime object, null means now
     * @param zone  the time zone, null means default time zone
     * @throws IllegalArgumentException if the instant is invalid
     */
    public DateMidnight(Object instant, DateTimeZone zone) {
        super(instant, zone);__CLR4_4_100lc8azrho.R.inc(33);try{__CLR4_4_100lc8azrho.R.inc(32);
    }finally{__CLR4_4_100lc8azrho.R.flushNeeded();}}

    /**
     * Constructs an instance from an Object that represents a datetime,
     * using the specified chronology.
     * The constructed object will have a local time of midnight.
     * <p>
     * If the chronology is null, ISO in the default time zone is used.
     * Any chronology implied by the object (such as GregorianCalendar does)
     * is ignored.
     * <p>
     * The recognised object types are defined in
     * {@link org.joda.time.convert.ConverterManager ConverterManager} and
     * include ReadableInstant, String, Calendar and Date.
     * The String formats are described by {@link ISODateTimeFormat#dateTimeParser()}.
     *
     * @param instant  the datetime object, null means now
     * @param chronology  the chronology, null means ISOChronology in default zone
     * @throws IllegalArgumentException if the instant is invalid
     */
    public DateMidnight(Object instant, Chronology chronology) {
        super(instant, DateTimeUtils.getChronology(chronology));__CLR4_4_100lc8azrho.R.inc(35);try{__CLR4_4_100lc8azrho.R.inc(34);
    }finally{__CLR4_4_100lc8azrho.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Constructs an instance from datetime field values
     * using <code>ISOChronology</code> in the default time zone.
     * The constructed object will have a local time of midnight.
     *
     * @param year  the year
     * @param monthOfYear  the month of the year, from 1 to 12
     * @param dayOfMonth  the day of the month, from 1 to 31
     */
    public DateMidnight(int year, int monthOfYear, int dayOfMonth) {
        super(year, monthOfYear, dayOfMonth, 0, 0, 0, 0);__CLR4_4_100lc8azrho.R.inc(37);try{__CLR4_4_100lc8azrho.R.inc(36);
    }finally{__CLR4_4_100lc8azrho.R.flushNeeded();}}

    /**
     * Constructs an instance from datetime field values
     * using <code>ISOChronology</code> in the specified time zone.
     * The constructed object will have a local time of midnight.
     * <p>
     * If the specified time zone is null, the default zone is used.
     *
     * @param year  the year
     * @param monthOfYear  the month of the year, from 1 to 12
     * @param dayOfMonth  the day of the month, from 1 to 31
     * @param zone  the time zone, null means default time zone
     */
    public DateMidnight(int year, int monthOfYear, int dayOfMonth, DateTimeZone zone) {
        super(year, monthOfYear, dayOfMonth, 0, 0, 0, 0, zone);__CLR4_4_100lc8azrho.R.inc(39);try{__CLR4_4_100lc8azrho.R.inc(38);
    }finally{__CLR4_4_100lc8azrho.R.flushNeeded();}}

    /**
     * Constructs an instance from datetime field values
     * using the specified chronology.
     * The constructed object will have a local time of midnight.
     * <p>
     * If the chronology is null, <code>ISOChronology</code>
     * in the default time zone is used.
     *
     * @param year  the year, valid values defined by the chronology
     * @param monthOfYear  the month of the year, valid values defined by the chronology
     * @param dayOfMonth  the day of the month, valid values defined by the chronology
     * @param chronology  the chronology, null means ISOChronology in default zone
     */
    public DateMidnight(int year, int monthOfYear, int dayOfMonth, Chronology chronology) {
        super(year, monthOfYear, dayOfMonth, 0, 0, 0, 0, chronology);__CLR4_4_100lc8azrho.R.inc(41);try{__CLR4_4_100lc8azrho.R.inc(40);
    }finally{__CLR4_4_100lc8azrho.R.flushNeeded();}}

    /**
     * Rounds the specified instant to midnight.
     *
     * @param instant  the milliseconds from 1970-01-01T00:00:00Z to round
     * @param chronology  the chronology to use, not null
     * @return the updated instant, rounded to midnight
     */
    protected long checkInstant(long instant, Chronology chronology) {try{__CLR4_4_100lc8azrho.R.inc(42);
        __CLR4_4_100lc8azrho.R.inc(43);return chronology.dayOfMonth().roundFloor(instant);
    }finally{__CLR4_4_100lc8azrho.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Returns a copy of this date with a different millisecond instant.
     * The returned object will have a local time of midnight.
     * <p>
     * Only the millis will change, the chronology and time zone are kept.
     * The returned object will be either be a new instance or <code>this</code>.
     *
     * @param newMillis  the new millis, from 1970-01-01T00:00:00Z
     * @return a copy of this instant with different millis
     */
    public DateMidnight withMillis(long newMillis) {try{__CLR4_4_100lc8azrho.R.inc(44);
        __CLR4_4_100lc8azrho.R.inc(45);Chronology chrono = getChronology();
        __CLR4_4_100lc8azrho.R.inc(46);newMillis = checkInstant(newMillis, chrono);
        __CLR4_4_100lc8azrho.R.inc(47);return ((((newMillis == getMillis() )&&(__CLR4_4_100lc8azrho.R.iget(48)!=0|true))||(__CLR4_4_100lc8azrho.R.iget(49)==0&false))? this : new DateMidnight(newMillis, chrono));
    }finally{__CLR4_4_100lc8azrho.R.flushNeeded();}}

    /**
     * Returns a copy of this date with a different chronology, potentially
     * changing the day in unexpected ways.
     * <p>
     * This method creates a new DateMidnight using the midnight millisecond value
     * and the new chronology. If the same or similar chronology is specified, but
     * with a different time zone, the day may change. This occurs because the new
     * DateMidnight rounds down the millisecond value to get to midnight, and the
     * time zone change may result in a rounding down to a different day.
     * <p>
     * For example, changing time zone from London (+00:00) to Paris (+01:00) will
     * retain the same day, but changing from Paris to London will change the day.
     * (When its midnight in London its the same day in Paris, but when its midnight
     * in Paris its still the previous day in London)
     * <p>
     * To avoid these unusual effects, use {@link #withZoneRetainFields(DateTimeZone)}
     * to change time zones.
     *
     * @param newChronology  the new chronology
     * @return a copy of this instant with a different chronology
     */
    public DateMidnight withChronology(Chronology newChronology) {try{__CLR4_4_100lc8azrho.R.inc(50);
        __CLR4_4_100lc8azrho.R.inc(51);return ((((newChronology == getChronology() )&&(__CLR4_4_100lc8azrho.R.iget(52)!=0|true))||(__CLR4_4_100lc8azrho.R.iget(53)==0&false))? this : new DateMidnight(getMillis(), newChronology));
    }finally{__CLR4_4_100lc8azrho.R.flushNeeded();}}

    /**
     * Returns a copy of this date with a different time zone, preserving the day
     * The returned object will have a local time of midnight in the new zone on
     * the same day as the original instant.
     *
     * @param newZone  the new time zone, null means default
     * @return a copy of this instant with a different time zone
     */
    public DateMidnight withZoneRetainFields(DateTimeZone newZone) {try{__CLR4_4_100lc8azrho.R.inc(54);
        __CLR4_4_100lc8azrho.R.inc(55);newZone = DateTimeUtils.getZone(newZone);
        __CLR4_4_100lc8azrho.R.inc(56);DateTimeZone originalZone = DateTimeUtils.getZone(getZone());
        __CLR4_4_100lc8azrho.R.inc(57);if ((((newZone == originalZone)&&(__CLR4_4_100lc8azrho.R.iget(58)!=0|true))||(__CLR4_4_100lc8azrho.R.iget(59)==0&false))) {{
            __CLR4_4_100lc8azrho.R.inc(60);return this;
        }
        
        }__CLR4_4_100lc8azrho.R.inc(61);long millis = originalZone.getMillisKeepLocal(newZone, getMillis());
        __CLR4_4_100lc8azrho.R.inc(62);return new DateMidnight(millis, getChronology().withZone(newZone));
    }finally{__CLR4_4_100lc8azrho.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Returns a copy of this date with the partial set of fields replacing those
     * from this instance.
     * <p>
     * For example, if the partial is a <code>LocalDate</code> then the date fields
     * would be changed in the returned instance.
     * If the partial is null, then <code>this</code> is returned.
     *
     * @param partial  the partial set of fields to apply to this datetime, null ignored
     * @return a copy of this datetime with a different set of fields
     * @throws IllegalArgumentException if any value is invalid
     */
    public DateMidnight withFields(ReadablePartial partial) {try{__CLR4_4_100lc8azrho.R.inc(63);
        __CLR4_4_100lc8azrho.R.inc(64);if ((((partial == null)&&(__CLR4_4_100lc8azrho.R.iget(65)!=0|true))||(__CLR4_4_100lc8azrho.R.iget(66)==0&false))) {{
            __CLR4_4_100lc8azrho.R.inc(67);return this;
        }
        }__CLR4_4_100lc8azrho.R.inc(68);return withMillis(getChronology().set(partial, getMillis()));
    }finally{__CLR4_4_100lc8azrho.R.flushNeeded();}}

    /**
     * Returns a copy of this date with the specified field set to a new value.
     * <p>
     * For example, if the field type is <code>dayOfMonth</code> then the day of month
     * field would be changed in the returned instance.
     * If the field type is null, then <code>this</code> is returned.
     * <p>
     * These three lines are equivalent:
     * <pre>
     * DateTime updated = dt.withField(DateTimeFieldType.dayOfMonth(), 6);
     * DateTime updated = dt.dayOfMonth().setCopy(6);
     * DateTime updated = dt.property(DateTimeFieldType.dayOfMonth()).setCopy(6);
     * </pre>
     *
     * @param fieldType  the field type to set, not null
     * @param value  the value to set
     * @return a copy of this datetime with the field set
     * @throws IllegalArgumentException if the value is null or invalid
     */
    public DateMidnight withField(DateTimeFieldType fieldType, int value) {try{__CLR4_4_100lc8azrho.R.inc(69);
        __CLR4_4_100lc8azrho.R.inc(70);if ((((fieldType == null)&&(__CLR4_4_100lc8azrho.R.iget(71)!=0|true))||(__CLR4_4_100lc8azrho.R.iget(72)==0&false))) {{
            __CLR4_4_100lc8azrho.R.inc(73);throw new IllegalArgumentException("Field must not be null");
        }
        }__CLR4_4_100lc8azrho.R.inc(74);long instant = fieldType.getField(getChronology()).set(getMillis(), value);
        __CLR4_4_100lc8azrho.R.inc(75);return withMillis(instant);
    }finally{__CLR4_4_100lc8azrho.R.flushNeeded();}}

    /**
     * Returns a copy of this date with the value of the specified field increased.
     * <p>
     * If the addition is zero or the field is null, then <code>this</code> is returned.
     * <p>
     * These three lines are equivalent:
     * <pre>
     * DateMidnight added = dt.withFieldAdded(DateTimeFieldType.year(), 6);
     * DateMidnight added = dt.plusYears(6);
     * DateMidnight added = dt.year().addToCopy(6);
     * </pre>
     * 
     * @param fieldType  the field type to add to, not null
     * @param amount  the amount to add
     * @return a copy of this datetime with the field updated
     * @throws IllegalArgumentException if the value is null or invalid
     * @throws ArithmeticException if the new datetime exceeds the capacity of a long
     */
    public DateMidnight withFieldAdded(DurationFieldType fieldType, int amount) {try{__CLR4_4_100lc8azrho.R.inc(76);
        __CLR4_4_100lc8azrho.R.inc(77);if ((((fieldType == null)&&(__CLR4_4_100lc8azrho.R.iget(78)!=0|true))||(__CLR4_4_100lc8azrho.R.iget(79)==0&false))) {{
            __CLR4_4_100lc8azrho.R.inc(80);throw new IllegalArgumentException("Field must not be null");
        }
        }__CLR4_4_100lc8azrho.R.inc(81);if ((((amount == 0)&&(__CLR4_4_100lc8azrho.R.iget(82)!=0|true))||(__CLR4_4_100lc8azrho.R.iget(83)==0&false))) {{
            __CLR4_4_100lc8azrho.R.inc(84);return this;
        }
        }__CLR4_4_100lc8azrho.R.inc(85);long instant = fieldType.getField(getChronology()).add(getMillis(), amount);
        __CLR4_4_100lc8azrho.R.inc(86);return withMillis(instant);
    }finally{__CLR4_4_100lc8azrho.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Returns a copy of this date with the specified duration added.
     * <p>
     * If the addition is zero, then <code>this</code> is returned.
     * 
     * @param durationToAdd  the duration to add to this one
     * @param scalar  the amount of times to add, such as -1 to subtract once
     * @return a copy of this datetime with the duration added
     * @throws ArithmeticException if the new datetime exceeds the capacity of a long
     */
    public DateMidnight withDurationAdded(long durationToAdd, int scalar) {try{__CLR4_4_100lc8azrho.R.inc(87);
        __CLR4_4_100lc8azrho.R.inc(88);if ((((durationToAdd == 0 || scalar == 0)&&(__CLR4_4_100lc8azrho.R.iget(89)!=0|true))||(__CLR4_4_100lc8azrho.R.iget(90)==0&false))) {{
            __CLR4_4_100lc8azrho.R.inc(91);return this;
        }
        }__CLR4_4_100lc8azrho.R.inc(92);long instant = getChronology().add(getMillis(), durationToAdd, scalar);
        __CLR4_4_100lc8azrho.R.inc(93);return withMillis(instant);
    }finally{__CLR4_4_100lc8azrho.R.flushNeeded();}}

    /**
     * Returns a copy of this date with the specified duration added.
     * <p>
     * If the addition is zero, then <code>this</code> is returned.
     * 
     * @param durationToAdd  the duration to add to this one, null means zero
     * @param scalar  the amount of times to add, such as -1 to subtract once
     * @return a copy of this datetime with the duration added
     * @throws ArithmeticException if the new datetime exceeds the capacity of a long
     */
    public DateMidnight withDurationAdded(ReadableDuration durationToAdd, int scalar) {try{__CLR4_4_100lc8azrho.R.inc(94);
        __CLR4_4_100lc8azrho.R.inc(95);if ((((durationToAdd == null || scalar == 0)&&(__CLR4_4_100lc8azrho.R.iget(96)!=0|true))||(__CLR4_4_100lc8azrho.R.iget(97)==0&false))) {{
            __CLR4_4_100lc8azrho.R.inc(98);return this;
        }
        }__CLR4_4_100lc8azrho.R.inc(99);return withDurationAdded(durationToAdd.getMillis(), scalar);
    }finally{__CLR4_4_100lc8azrho.R.flushNeeded();}}

    /**
     * Returns a copy of this date with the specified period added.
     * <p>
     * If the addition is zero, then <code>this</code> is returned.
     * <p>
     * This method is typically used to add multiple copies of complex
     * period instances. Adding one field is best achieved using methods
     * like {@link #withFieldAdded(DurationFieldType, int)}
     * or {@link #plusYears(int)}.
     * 
     * @param period  the period to add to this one, null means zero
     * @param scalar  the amount of times to add, such as -1 to subtract once
     * @return a copy of this datetime with the period added
     * @throws ArithmeticException if the new datetime exceeds the capacity of a long
     */
    public DateMidnight withPeriodAdded(ReadablePeriod period, int scalar) {try{__CLR4_4_100lc8azrho.R.inc(100);
        __CLR4_4_100lc8azrho.R.inc(101);if ((((period == null || scalar == 0)&&(__CLR4_4_100lc8azrho.R.iget(102)!=0|true))||(__CLR4_4_100lc8azrho.R.iget(103)==0&false))) {{
            __CLR4_4_100lc8azrho.R.inc(104);return this;
        }
        }__CLR4_4_100lc8azrho.R.inc(105);long instant = getChronology().add(period, getMillis(), scalar);
        __CLR4_4_100lc8azrho.R.inc(106);return withMillis(instant);
    }finally{__CLR4_4_100lc8azrho.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Returns a copy of this date with the specified duration added.
     * <p>
     * If the amount is zero, then <code>this</code> is returned.
     * 
     * @param duration  the duration, in millis, to add to this one
     * @return a copy of this datetime with the duration added
     * @throws ArithmeticException if the new datetime exceeds the capacity of a long
     */
    public DateMidnight plus(long duration) {try{__CLR4_4_100lc8azrho.R.inc(107);
        __CLR4_4_100lc8azrho.R.inc(108);return withDurationAdded(duration, 1);
    }finally{__CLR4_4_100lc8azrho.R.flushNeeded();}}

    /**
     * Returns a copy of this date with the specified duration added.
     * <p>
     * If the amount is zero or null, then <code>this</code> is returned.
     * 
     * @param duration  the duration to add to this one, null means zero
     * @return a copy of this datetime with the duration added
     * @throws ArithmeticException if the new datetime exceeds the capacity of a long
     */
    public DateMidnight plus(ReadableDuration duration) {try{__CLR4_4_100lc8azrho.R.inc(109);
        __CLR4_4_100lc8azrho.R.inc(110);return withDurationAdded(duration, 1);
    }finally{__CLR4_4_100lc8azrho.R.flushNeeded();}}

    /**
     * Returns a copy of this date with the specified period added.
     * <p>
     * If the amount is zero or null, then <code>this</code> is returned.
     * <p>
     * This method is typically used to add complex period instances.
     * Adding one field is best achieved using methods
     * like {@link #plusYears(int)}.
     * 
     * @param period  the duration to add to this one, null means zero
     * @return a copy of this datetime with the period added
     * @throws ArithmeticException if the new datetime exceeds the capacity of a long
     */
    public DateMidnight plus(ReadablePeriod period) {try{__CLR4_4_100lc8azrho.R.inc(111);
        __CLR4_4_100lc8azrho.R.inc(112);return withPeriodAdded(period, 1);
    }finally{__CLR4_4_100lc8azrho.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Returns a copy of this date plus the specified number of years.
     * <p>
     * This datetime instance is immutable and unaffected by this method call.
     * <p>
     * The following three lines are identical in effect:
     * <pre>
     * DateMidnight added = dt.plusYears(6);
     * DateMidnight added = dt.plus(Period.years(6));
     * DateMidnight added = dt.withFieldAdded(DurationFieldType.years(), 6);
     * </pre>
     *
     * @param years  the amount of years to add, may be negative
     * @return the new datetime plus the increased years
     * @since 1.1
     */
    public DateMidnight plusYears(int years) {try{__CLR4_4_100lc8azrho.R.inc(113);
        __CLR4_4_100lc8azrho.R.inc(114);if ((((years == 0)&&(__CLR4_4_100lc8azrho.R.iget(115)!=0|true))||(__CLR4_4_100lc8azrho.R.iget(116)==0&false))) {{
            __CLR4_4_100lc8azrho.R.inc(117);return this;
        }
        }__CLR4_4_100lc8azrho.R.inc(118);long instant = getChronology().years().add(getMillis(), years);
        __CLR4_4_100lc8azrho.R.inc(119);return withMillis(instant);
    }finally{__CLR4_4_100lc8azrho.R.flushNeeded();}}

    /**
     * Returns a copy of this date plus the specified number of months.
     * <p>
     * This datetime instance is immutable and unaffected by this method call.
     * <p>
     * The following three lines are identical in effect:
     * <pre>
     * DateMidnight added = dt.plusMonths(6);
     * DateMidnight added = dt.plus(Period.months(6));
     * DateMidnight added = dt.withFieldAdded(DurationFieldType.months(), 6);
     * </pre>
     *
     * @param months  the amount of months to add, may be negative
     * @return the new datetime plus the increased months
     * @since 1.1
     */
    public DateMidnight plusMonths(int months) {try{__CLR4_4_100lc8azrho.R.inc(120);
        __CLR4_4_100lc8azrho.R.inc(121);if ((((months == 0)&&(__CLR4_4_100lc8azrho.R.iget(122)!=0|true))||(__CLR4_4_100lc8azrho.R.iget(123)==0&false))) {{
            __CLR4_4_100lc8azrho.R.inc(124);return this;
        }
        }__CLR4_4_100lc8azrho.R.inc(125);long instant = getChronology().months().add(getMillis(), months);
        __CLR4_4_100lc8azrho.R.inc(126);return withMillis(instant);
    }finally{__CLR4_4_100lc8azrho.R.flushNeeded();}}

    /**
     * Returns a copy of this date plus the specified number of weeks.
     * <p>
     * This datetime instance is immutable and unaffected by this method call.
     * <p>
     * The following three lines are identical in effect:
     * <pre>
     * DateMidnight added = dt.plusWeeks(6);
     * DateMidnight added = dt.plus(Period.weeks(6));
     * DateMidnight added = dt.withFieldAdded(DurationFieldType.weeks(), 6);
     * </pre>
     *
     * @param weeks  the amount of weeks to add, may be negative
     * @return the new datetime plus the increased weeks
     * @since 1.1
     */
    public DateMidnight plusWeeks(int weeks) {try{__CLR4_4_100lc8azrho.R.inc(127);
        __CLR4_4_100lc8azrho.R.inc(128);if ((((weeks == 0)&&(__CLR4_4_100lc8azrho.R.iget(129)!=0|true))||(__CLR4_4_100lc8azrho.R.iget(130)==0&false))) {{
            __CLR4_4_100lc8azrho.R.inc(131);return this;
        }
        }__CLR4_4_100lc8azrho.R.inc(132);long instant = getChronology().weeks().add(getMillis(), weeks);
        __CLR4_4_100lc8azrho.R.inc(133);return withMillis(instant);
    }finally{__CLR4_4_100lc8azrho.R.flushNeeded();}}

    /**
     * Returns a copy of this date plus the specified number of days.
     * <p>
     * This datetime instance is immutable and unaffected by this method call.
     * <p>
     * The following three lines are identical in effect:
     * <pre>
     * DateMidnight added = dt.plusDays(6);
     * DateMidnight added = dt.plus(Period.days(6));
     * DateMidnight added = dt.withFieldAdded(DurationFieldType.days(), 6);
     * </pre>
     *
     * @param days  the amount of days to add, may be negative
     * @return the new datetime plus the increased days
     * @since 1.1
     */
    public DateMidnight plusDays(int days) {try{__CLR4_4_100lc8azrho.R.inc(134);
        __CLR4_4_100lc8azrho.R.inc(135);if ((((days == 0)&&(__CLR4_4_100lc8azrho.R.iget(136)!=0|true))||(__CLR4_4_100lc8azrho.R.iget(137)==0&false))) {{
            __CLR4_4_100lc8azrho.R.inc(138);return this;
        }
        }__CLR4_4_100lc8azrho.R.inc(139);long instant = getChronology().days().add(getMillis(), days);
        __CLR4_4_100lc8azrho.R.inc(140);return withMillis(instant);
    }finally{__CLR4_4_100lc8azrho.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Returns a copy of this date with the specified duration taken away.
     * <p>
     * If the amount is zero or null, then <code>this</code> is returned.
     * 
     * @param duration  the duration, in millis, to reduce this instant by
     * @return a copy of this datetime with the duration taken away
     * @throws ArithmeticException if the new datetime exceeds the capacity of a long
     */
    public DateMidnight minus(long duration) {try{__CLR4_4_100lc8azrho.R.inc(141);
        __CLR4_4_100lc8azrho.R.inc(142);return withDurationAdded(duration, -1);
    }finally{__CLR4_4_100lc8azrho.R.flushNeeded();}}

    /**
     * Returns a copy of this date with the specified duration taken away.
     * <p>
     * If the amount is zero or null, then <code>this</code> is returned.
     * 
     * @param duration  the duration to reduce this instant by
     * @return a copy of this datetime with the duration taken away
     * @throws ArithmeticException if the new datetime exceeds the capacity of a long
     */
    public DateMidnight minus(ReadableDuration duration) {try{__CLR4_4_100lc8azrho.R.inc(143);
        __CLR4_4_100lc8azrho.R.inc(144);return withDurationAdded(duration, -1);
    }finally{__CLR4_4_100lc8azrho.R.flushNeeded();}}

    /**
     * Returns a copy of this date with the specified period taken away.
     * <p>
     * If the amount is zero or null, then <code>this</code> is returned.
     * <p>
     * This method is typically used to subtract complex period instances.
     * Subtracting one field is best achieved using methods
     * like {@link #minusYears(int)}.
     * 
     * @param period  the period to reduce this instant by
     * @return a copy of this datetime with the period taken away
     * @throws ArithmeticException if the new datetime exceeds the capacity of a long
     */
    public DateMidnight minus(ReadablePeriod period) {try{__CLR4_4_100lc8azrho.R.inc(145);
        __CLR4_4_100lc8azrho.R.inc(146);return withPeriodAdded(period, -1);
    }finally{__CLR4_4_100lc8azrho.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Returns a copy of this date minus the specified number of years.
     * <p>
     * This datetime instance is immutable and unaffected by this method call.
     * <p>
     * The following three lines are identical in effect:
     * <pre>
     * DateTime subtracted = dt.minusYears(6);
     * DateTime subtracted = dt.minus(Period.years(6));
     * DateTime subtracted = dt.withFieldAdded(DurationFieldType.years(), -6);
     * </pre>
     *
     * @param years  the amount of years to subtract, may be negative
     * @return the new datetime minus the increased years
     * @since 1.1
     */
    public DateMidnight minusYears(int years) {try{__CLR4_4_100lc8azrho.R.inc(147);
        __CLR4_4_100lc8azrho.R.inc(148);if ((((years == 0)&&(__CLR4_4_100lc8azrho.R.iget(149)!=0|true))||(__CLR4_4_100lc8azrho.R.iget(150)==0&false))) {{
            __CLR4_4_100lc8azrho.R.inc(151);return this;
        }
        }__CLR4_4_100lc8azrho.R.inc(152);long instant = getChronology().years().subtract(getMillis(), years);
        __CLR4_4_100lc8azrho.R.inc(153);return withMillis(instant);
    }finally{__CLR4_4_100lc8azrho.R.flushNeeded();}}

    /**
     * Returns a copy of this date minus the specified number of months.
     * <p>
     * This datetime instance is immutable and unaffected by this method call.
     * <p>
     * The following three lines are identical in effect:
     * <pre>
     * DateMidnight subtracted = dt.minusMonths(6);
     * DateMidnight subtracted = dt.minus(Period.months(6));
     * DateMidnight subtracted = dt.withFieldAdded(DurationFieldType.months(), -6);
     * </pre>
     *
     * @param months  the amount of months to subtract, may be negative
     * @return the new datetime minus the increased months
     * @since 1.1
     */
    public DateMidnight minusMonths(int months) {try{__CLR4_4_100lc8azrho.R.inc(154);
        __CLR4_4_100lc8azrho.R.inc(155);if ((((months == 0)&&(__CLR4_4_100lc8azrho.R.iget(156)!=0|true))||(__CLR4_4_100lc8azrho.R.iget(157)==0&false))) {{
            __CLR4_4_100lc8azrho.R.inc(158);return this;
        }
        }__CLR4_4_100lc8azrho.R.inc(159);long instant = getChronology().months().subtract(getMillis(), months);
        __CLR4_4_100lc8azrho.R.inc(160);return withMillis(instant);
    }finally{__CLR4_4_100lc8azrho.R.flushNeeded();}}

    /**
     * Returns a copy of this date minus the specified number of weeks.
     * <p>
     * This datetime instance is immutable and unaffected by this method call.
     * <p>
     * The following three lines are identical in effect:
     * <pre>
     * DateMidnight subtracted = dt.minusWeeks(6);
     * DateMidnight subtracted = dt.minus(Period.weeks(6));
     * DateMidnight subtracted = dt.withFieldAdded(DurationFieldType.weeks(), -6);
     * </pre>
     *
     * @param weeks  the amount of weeks to subtract, may be negative
     * @return the new datetime minus the increased weeks
     * @since 1.1
     */
    public DateMidnight minusWeeks(int weeks) {try{__CLR4_4_100lc8azrho.R.inc(161);
        __CLR4_4_100lc8azrho.R.inc(162);if ((((weeks == 0)&&(__CLR4_4_100lc8azrho.R.iget(163)!=0|true))||(__CLR4_4_100lc8azrho.R.iget(164)==0&false))) {{
            __CLR4_4_100lc8azrho.R.inc(165);return this;
        }
        }__CLR4_4_100lc8azrho.R.inc(166);long instant = getChronology().weeks().subtract(getMillis(), weeks);
        __CLR4_4_100lc8azrho.R.inc(167);return withMillis(instant);
    }finally{__CLR4_4_100lc8azrho.R.flushNeeded();}}

    /**
     * Returns a copy of this date minus the specified number of days.
     * <p>
     * This datetime instance is immutable and unaffected by this method call.
     * <p>
     * The following three lines are identical in effect:
     * <pre>
     * DateMidnight subtracted = dt.minusDays(6);
     * DateMidnight subtracted = dt.minus(Period.days(6));
     * DateMidnight subtracted = dt.withFieldAdded(DurationFieldType.days(), -6);
     * </pre>
     *
     * @param days  the amount of days to subtract, may be negative
     * @return the new datetime minus the increased days
     * @since 1.1
     */
    public DateMidnight minusDays(int days) {try{__CLR4_4_100lc8azrho.R.inc(168);
        __CLR4_4_100lc8azrho.R.inc(169);if ((((days == 0)&&(__CLR4_4_100lc8azrho.R.iget(170)!=0|true))||(__CLR4_4_100lc8azrho.R.iget(171)==0&false))) {{
            __CLR4_4_100lc8azrho.R.inc(172);return this;
        }
        }__CLR4_4_100lc8azrho.R.inc(173);long instant = getChronology().days().subtract(getMillis(), days);
        __CLR4_4_100lc8azrho.R.inc(174);return withMillis(instant);
    }finally{__CLR4_4_100lc8azrho.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Gets the property object for the specified type, which contains many useful methods.
     *
     * @param type  the field type to get the chronology for
     * @return the property object
     * @throws IllegalArgumentException if the field is null or unsupported
     */
    public Property property(DateTimeFieldType type) {try{__CLR4_4_100lc8azrho.R.inc(175);
        __CLR4_4_100lc8azrho.R.inc(176);if ((((type == null)&&(__CLR4_4_100lc8azrho.R.iget(177)!=0|true))||(__CLR4_4_100lc8azrho.R.iget(178)==0&false))) {{
            __CLR4_4_100lc8azrho.R.inc(179);throw new IllegalArgumentException("The DateTimeFieldType must not be null");
        }
        }__CLR4_4_100lc8azrho.R.inc(180);DateTimeField field = type.getField(getChronology());
        __CLR4_4_100lc8azrho.R.inc(181);if ((((field.isSupported() == false)&&(__CLR4_4_100lc8azrho.R.iget(182)!=0|true))||(__CLR4_4_100lc8azrho.R.iget(183)==0&false))) {{
            __CLR4_4_100lc8azrho.R.inc(184);throw new IllegalArgumentException("Field '" + type + "' is not supported");
        }
        }__CLR4_4_100lc8azrho.R.inc(185);return new Property(this, field);
    }finally{__CLR4_4_100lc8azrho.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Converts this object to a <code>YearMonthDay</code> using the
     * same date and chronology.
     * 
     * @return a YearMonthDay using the same millis and chronology
     * @deprecated Use LocalDate instead of YearMonthDay
     */
    @Deprecated
    public YearMonthDay toYearMonthDay() {try{__CLR4_4_100lc8azrho.R.inc(186);
        __CLR4_4_100lc8azrho.R.inc(187);return new YearMonthDay(getMillis(), getChronology());
    }finally{__CLR4_4_100lc8azrho.R.flushNeeded();}}

    /**
     * Converts this object to a <code>LocalDate</code> with the
     * same date and chronology.
     *
     * @return a LocalDate with the same date and chronology
     * @since 1.3
     */
    public LocalDate toLocalDate() {try{__CLR4_4_100lc8azrho.R.inc(188);
        __CLR4_4_100lc8azrho.R.inc(189);return new LocalDate(getMillis(), getChronology());
    }finally{__CLR4_4_100lc8azrho.R.flushNeeded();}}

    /**
     * Converts this object to an <code>Interval</code> encompassing
     * the whole of this day.
     * <p>
     * The interval starts at midnight 00:00 and ends at 00:00 the following day,
     * (which is not included in the interval, as intervals are half-open).
     * 
     * @return an interval over the day
     */
    public Interval toInterval() {try{__CLR4_4_100lc8azrho.R.inc(190);
        __CLR4_4_100lc8azrho.R.inc(191);Chronology chrono = getChronology();
        __CLR4_4_100lc8azrho.R.inc(192);long start = getMillis();
        __CLR4_4_100lc8azrho.R.inc(193);long end = DurationFieldType.days().getField(chrono).add(start, 1);
        __CLR4_4_100lc8azrho.R.inc(194);return new Interval(start, end, chrono);
    }finally{__CLR4_4_100lc8azrho.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Returns a copy of this date with the era field updated.
     * <p>
     * DateMidnight is immutable, so there are no set methods.
     * Instead, this method returns a new instance with the value of
     * era changed.
     *
     * @param era  the era to set
     * @return a copy of this object with the field set
     * @throws IllegalArgumentException if the value is invalid
     * @since 1.3
     */
    public DateMidnight withEra(int era) {try{__CLR4_4_100lc8azrho.R.inc(195);
        __CLR4_4_100lc8azrho.R.inc(196);return withMillis(getChronology().era().set(getMillis(), era));
    }finally{__CLR4_4_100lc8azrho.R.flushNeeded();}}

    /**
     * Returns a copy of this date with the century of era field updated.
     * <p>
     * DateMidnight is immutable, so there are no set methods.
     * Instead, this method returns a new instance with the value of
     * century of era changed.
     *
     * @param centuryOfEra  the centurey of era to set
     * @return a copy of this object with the field set
     * @throws IllegalArgumentException if the value is invalid
     * @since 1.3
     */
    public DateMidnight withCenturyOfEra(int centuryOfEra) {try{__CLR4_4_100lc8azrho.R.inc(197);
        __CLR4_4_100lc8azrho.R.inc(198);return withMillis(getChronology().centuryOfEra().set(getMillis(), centuryOfEra));
    }finally{__CLR4_4_100lc8azrho.R.flushNeeded();}}

    /**
     * Returns a copy of this date with the year of era field updated.
     * <p>
     * DateMidnight is immutable, so there are no set methods.
     * Instead, this method returns a new instance with the value of
     * year of era changed.
     *
     * @param yearOfEra  the year of era to set
     * @return a copy of this object with the field set
     * @throws IllegalArgumentException if the value is invalid
     * @since 1.3
     */
    public DateMidnight withYearOfEra(int yearOfEra) {try{__CLR4_4_100lc8azrho.R.inc(199);
        __CLR4_4_100lc8azrho.R.inc(200);return withMillis(getChronology().yearOfEra().set(getMillis(), yearOfEra));
    }finally{__CLR4_4_100lc8azrho.R.flushNeeded();}}

    /**
     * Returns a copy of this date with the year of century field updated.
     * <p>
     * DateMidnight is immutable, so there are no set methods.
     * Instead, this method returns a new instance with the value of
     * year of century changed.
     *
     * @param yearOfCentury  the year of century to set
     * @return a copy of this object with the field set
     * @throws IllegalArgumentException if the value is invalid
     * @since 1.3
     */
    public DateMidnight withYearOfCentury(int yearOfCentury) {try{__CLR4_4_100lc8azrho.R.inc(201);
        __CLR4_4_100lc8azrho.R.inc(202);return withMillis(getChronology().yearOfCentury().set(getMillis(), yearOfCentury));
    }finally{__CLR4_4_100lc8azrho.R.flushNeeded();}}

    /**
     * Returns a copy of this date with the year field updated.
     * <p>
     * DateMidnight is immutable, so there are no set methods.
     * Instead, this method returns a new instance with the value of
     * year changed.
     *
     * @param year  the year to set
     * @return a copy of this object with the field set
     * @throws IllegalArgumentException if the value is invalid
     * @since 1.3
     */
    public DateMidnight withYear(int year) {try{__CLR4_4_100lc8azrho.R.inc(203);
        __CLR4_4_100lc8azrho.R.inc(204);return withMillis(getChronology().year().set(getMillis(), year));
    }finally{__CLR4_4_100lc8azrho.R.flushNeeded();}}

    /**
     * Returns a copy of this date with the weekyear field updated.
     * <p>
     * The weekyear is the year that matches with the weekOfWeekyear field.
     * In the standard ISO8601 week algorithm, the first week of the year
     * is that in which at least 4 days are in the year. As a result of this
     * definition, day 1 of the first week may be in the previous year.
     * The weekyear allows you to query the effective year for that day.
     * <p>
     * DateMidnight is immutable, so there are no set methods.
     * Instead, this method returns a new instance with the value of
     * weekyear changed.
     *
     * @param weekyear  the weekyear to set
     * @return a copy of this object with the field set
     * @throws IllegalArgumentException if the value is invalid
     * @since 1.3
     */
    public DateMidnight withWeekyear(int weekyear) {try{__CLR4_4_100lc8azrho.R.inc(205);
        __CLR4_4_100lc8azrho.R.inc(206);return withMillis(getChronology().weekyear().set(getMillis(), weekyear));
    }finally{__CLR4_4_100lc8azrho.R.flushNeeded();}}

    /**
     * Returns a copy of this date with the month of year field updated.
     * <p>
     * DateMidnight is immutable, so there are no set methods.
     * Instead, this method returns a new instance with the value of
     * month of year changed.
     *
     * @param monthOfYear  the month of year to set
     * @return a copy of this object with the field set
     * @throws IllegalArgumentException if the value is invalid
     * @since 1.3
     */
    public DateMidnight withMonthOfYear(int monthOfYear) {try{__CLR4_4_100lc8azrho.R.inc(207);
        __CLR4_4_100lc8azrho.R.inc(208);return withMillis(getChronology().monthOfYear().set(getMillis(), monthOfYear));
    }finally{__CLR4_4_100lc8azrho.R.flushNeeded();}}

    /**
     * Returns a copy of this date with the week of weekyear field updated.
     * <p>
     * This field is associated with the "weekyear" via {@link #withWeekyear(int)}.
     * In the standard ISO8601 week algorithm, the first week of the year
     * is that in which at least 4 days are in the year. As a result of this
     * definition, day 1 of the first week may be in the previous year.
     * <p>
     * DateMidnight is immutable, so there are no set methods.
     * Instead, this method returns a new instance with the value of
     * week of weekyear changed.
     *
     * @param weekOfWeekyear  the week of weekyear to set
     * @return a copy of this object with the field set
     * @throws IllegalArgumentException if the value is invalid
     * @since 1.3
     */
    public DateMidnight withWeekOfWeekyear(int weekOfWeekyear) {try{__CLR4_4_100lc8azrho.R.inc(209);
        __CLR4_4_100lc8azrho.R.inc(210);return withMillis(getChronology().weekOfWeekyear().set(getMillis(), weekOfWeekyear));
    }finally{__CLR4_4_100lc8azrho.R.flushNeeded();}}

    /**
     * Returns a copy of this date with the day of year field updated.
     * <p>
     * DateMidnight is immutable, so there are no set methods.
     * Instead, this method returns a new instance with the value of
     * day of year changed.
     *
     * @param dayOfYear  the day of year to set
     * @return a copy of this object with the field set
     * @throws IllegalArgumentException if the value is invalid
     * @since 1.3
     */
    public DateMidnight withDayOfYear(int dayOfYear) {try{__CLR4_4_100lc8azrho.R.inc(211);
        __CLR4_4_100lc8azrho.R.inc(212);return withMillis(getChronology().dayOfYear().set(getMillis(), dayOfYear));
    }finally{__CLR4_4_100lc8azrho.R.flushNeeded();}}

    /**
     * Returns a copy of this date with the day of month field updated.
     * <p>
     * DateMidnight is immutable, so there are no set methods.
     * Instead, this method returns a new instance with the value of
     * day of month changed.
     *
     * @param dayOfMonth  the day of month to set
     * @return a copy of this object with the field set
     * @throws IllegalArgumentException if the value is invalid
     * @since 1.3
     */
    public DateMidnight withDayOfMonth(int dayOfMonth) {try{__CLR4_4_100lc8azrho.R.inc(213);
        __CLR4_4_100lc8azrho.R.inc(214);return withMillis(getChronology().dayOfMonth().set(getMillis(), dayOfMonth));
    }finally{__CLR4_4_100lc8azrho.R.flushNeeded();}}

    /**
     * Returns a copy of this date with the day of week field updated.
     * <p>
     * DateMidnight is immutable, so there are no set methods.
     * Instead, this method returns a new instance with the value of
     * day of week changed.
     *
     * @param dayOfWeek  the day of week to set
     * @return a copy of this object with the field set
     * @throws IllegalArgumentException if the value is invalid
     * @since 1.3
     */
    public DateMidnight withDayOfWeek(int dayOfWeek) {try{__CLR4_4_100lc8azrho.R.inc(215);
        __CLR4_4_100lc8azrho.R.inc(216);return withMillis(getChronology().dayOfWeek().set(getMillis(), dayOfWeek));
    }finally{__CLR4_4_100lc8azrho.R.flushNeeded();}}

    // Date properties
    //-----------------------------------------------------------------------
    /**
     * Get the era property which provides access to advanced functionality.
     * 
     * @return the era property
     */
    public Property era() {try{__CLR4_4_100lc8azrho.R.inc(217);
        __CLR4_4_100lc8azrho.R.inc(218);return new Property(this, getChronology().era());
    }finally{__CLR4_4_100lc8azrho.R.flushNeeded();}}

    /**
     * Get the century of era property which provides access to advanced functionality.
     * 
     * @return the year of era property
     */
    public Property centuryOfEra() {try{__CLR4_4_100lc8azrho.R.inc(219);
        __CLR4_4_100lc8azrho.R.inc(220);return new Property(this, getChronology().centuryOfEra());
    }finally{__CLR4_4_100lc8azrho.R.flushNeeded();}}

    /**
     * Get the year of century property which provides access to advanced functionality.
     * 
     * @return the year of era property
     */
    public Property yearOfCentury() {try{__CLR4_4_100lc8azrho.R.inc(221);
        __CLR4_4_100lc8azrho.R.inc(222);return new Property(this, getChronology().yearOfCentury());
    }finally{__CLR4_4_100lc8azrho.R.flushNeeded();}}

    /**
     * Get the year of era property which provides access to advanced functionality.
     * 
     * @return the year of era property
     */
    public Property yearOfEra() {try{__CLR4_4_100lc8azrho.R.inc(223);
        __CLR4_4_100lc8azrho.R.inc(224);return new Property(this, getChronology().yearOfEra());
    }finally{__CLR4_4_100lc8azrho.R.flushNeeded();}}

    /**
     * Get the year property which provides access to advanced functionality.
     * 
     * @return the year property
     */
    public Property year() {try{__CLR4_4_100lc8azrho.R.inc(225);
        __CLR4_4_100lc8azrho.R.inc(226);return new Property(this, getChronology().year());
    }finally{__CLR4_4_100lc8azrho.R.flushNeeded();}}

    /**
     * Get the year of a week based year property which provides access to advanced functionality.
     * 
     * @return the year of a week based year property
     */
    public Property weekyear() {try{__CLR4_4_100lc8azrho.R.inc(227);
        __CLR4_4_100lc8azrho.R.inc(228);return new Property(this, getChronology().weekyear());
    }finally{__CLR4_4_100lc8azrho.R.flushNeeded();}}

    /**
     * Get the month of year property which provides access to advanced functionality.
     * 
     * @return the month of year property
     */
    public Property monthOfYear() {try{__CLR4_4_100lc8azrho.R.inc(229);
        __CLR4_4_100lc8azrho.R.inc(230);return new Property(this, getChronology().monthOfYear());
    }finally{__CLR4_4_100lc8azrho.R.flushNeeded();}}

    /**
     * Get the week of a week based year property which provides access to advanced functionality.
     * 
     * @return the week of a week based year property
     */
    public Property weekOfWeekyear() {try{__CLR4_4_100lc8azrho.R.inc(231);
        __CLR4_4_100lc8azrho.R.inc(232);return new Property(this, getChronology().weekOfWeekyear());
    }finally{__CLR4_4_100lc8azrho.R.flushNeeded();}}

    /**
     * Get the day of year property which provides access to advanced functionality.
     * 
     * @return the day of year property
     */
    public Property dayOfYear() {try{__CLR4_4_100lc8azrho.R.inc(233);
        __CLR4_4_100lc8azrho.R.inc(234);return new Property(this, getChronology().dayOfYear());
    }finally{__CLR4_4_100lc8azrho.R.flushNeeded();}}

    /**
     * Get the day of month property which provides access to advanced functionality.
     * 
     * @return the day of month property
     */
    public Property dayOfMonth() {try{__CLR4_4_100lc8azrho.R.inc(235);
        __CLR4_4_100lc8azrho.R.inc(236);return new Property(this, getChronology().dayOfMonth());
    }finally{__CLR4_4_100lc8azrho.R.flushNeeded();}}

    /**
     * Get the day of week property which provides access to advanced functionality.
     * 
     * @return the day of week property
     */
    public Property dayOfWeek() {try{__CLR4_4_100lc8azrho.R.inc(237);
        __CLR4_4_100lc8azrho.R.inc(238);return new Property(this, getChronology().dayOfWeek());
    }finally{__CLR4_4_100lc8azrho.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * DateMidnight.Property binds a DateMidnight to a DateTimeField allowing powerful
     * datetime functionality to be easily accessed.
     * <p>
     * The simplest use of this class is as an alternative get method, here used to
     * get the year '1972' (as an int) and the month 'December' (as a String).
     * <pre>
     * DateMidnight dt = new DateMidnight(1972, 12, 3);
     * int year = dt.year().get();
     * String monthStr = dt.monthOfYear().getAsText();
     * </pre>
     * <p>
     * Methods are also provided that allow date modification. These return new instances
     * of DateMidnight - they do not modify the original. The example below yields two
     * independent immutable date objects 20 years apart.
     * <pre>
     * DateMidnight dt = new DateMidnight(1972, 12, 3);
     * DateMidnight dt20 = dt.year().addToCopy(20);
     * </pre>
     * Serious modification of dates (ie. more than just changing one or two fields)
     * should use the {@link org.joda.time.MutableDateTime MutableDateTime} class.
     * <p>
     * DateMidnight.Property itself is thread-safe and immutable.
     *
     * @author Stephen Colebourne
     * @author Brian S O'Neill
     * @since 1.0
     */
    public static final class Property extends AbstractReadableInstantFieldProperty {
    
        /** Serialization lock */
        private static final long serialVersionUID = 257629620L;
        
        /** The instant this property is working against */
        private DateMidnight iInstant;
        /** The field this property is working against */
        private DateTimeField iField;
        
        /**
         * Constructor.
         * 
         * @param instant  the instant to set
         * @param field  the field to use
         */
        Property(DateMidnight instant, DateTimeField field) {
            super();__CLR4_4_100lc8azrho.R.inc(240);try{__CLR4_4_100lc8azrho.R.inc(239);
            __CLR4_4_100lc8azrho.R.inc(241);iInstant = instant;
            __CLR4_4_100lc8azrho.R.inc(242);iField = field;
        }finally{__CLR4_4_100lc8azrho.R.flushNeeded();}}

        /**
         * Writes the property in a safe serialization format.
         */
        private void writeObject(ObjectOutputStream oos) throws IOException {try{__CLR4_4_100lc8azrho.R.inc(243);
            __CLR4_4_100lc8azrho.R.inc(244);oos.writeObject(iInstant);
            __CLR4_4_100lc8azrho.R.inc(245);oos.writeObject(iField.getType());
        }finally{__CLR4_4_100lc8azrho.R.flushNeeded();}}

        /**
         * Reads the property from a safe serialization format.
         */
        private void readObject(ObjectInputStream oos) throws IOException, ClassNotFoundException {try{__CLR4_4_100lc8azrho.R.inc(246);
            __CLR4_4_100lc8azrho.R.inc(247);iInstant = (DateMidnight) oos.readObject();
            __CLR4_4_100lc8azrho.R.inc(248);DateTimeFieldType type = (DateTimeFieldType) oos.readObject();
            __CLR4_4_100lc8azrho.R.inc(249);iField = type.getField(iInstant.getChronology());
        }finally{__CLR4_4_100lc8azrho.R.flushNeeded();}}

        //-----------------------------------------------------------------------
        /**
         * Gets the field being used.
         * 
         * @return the field
         */
        public DateTimeField getField() {try{__CLR4_4_100lc8azrho.R.inc(250);
            __CLR4_4_100lc8azrho.R.inc(251);return iField;
        }finally{__CLR4_4_100lc8azrho.R.flushNeeded();}}

        /**
         * Gets the milliseconds of the datetime that this property is linked to.
         * 
         * @return the milliseconds
         */
        protected long getMillis() {try{__CLR4_4_100lc8azrho.R.inc(252);
            __CLR4_4_100lc8azrho.R.inc(253);return iInstant.getMillis();
        }finally{__CLR4_4_100lc8azrho.R.flushNeeded();}}

        /**
         * Gets the chronology of the datetime that this property is linked to.
         * 
         * @return the chronology
         * @since 1.4
         */
        protected Chronology getChronology() {try{__CLR4_4_100lc8azrho.R.inc(254);
            __CLR4_4_100lc8azrho.R.inc(255);return iInstant.getChronology();
        }finally{__CLR4_4_100lc8azrho.R.flushNeeded();}}

        /**
         * Gets the datetime being used.
         * 
         * @return the datetime
         */
        public DateMidnight getDateMidnight() {try{__CLR4_4_100lc8azrho.R.inc(256);
            __CLR4_4_100lc8azrho.R.inc(257);return iInstant;
        }finally{__CLR4_4_100lc8azrho.R.flushNeeded();}}

        //-----------------------------------------------------------------------
        /**
         * Adds to this field in a copy of this DateMidnight.
         * <p>
         * The DateMidnight attached to this property is unchanged by this call.
         * This operation is faster than converting a DateMidnight to a MutableDateTime
         * and back again when setting one field. When setting multiple fields,
         * it is generally quicker to make the conversion to MutableDateTime.
         * 
         * @param value  the value to add to the field in the copy
         * @return a copy of the DateMidnight with the field value changed
         * @throws IllegalArgumentException if the value isn't valid
         */
        public DateMidnight addToCopy(int value) {try{__CLR4_4_100lc8azrho.R.inc(258);
            __CLR4_4_100lc8azrho.R.inc(259);return iInstant.withMillis(iField.add(iInstant.getMillis(), value));
        }finally{__CLR4_4_100lc8azrho.R.flushNeeded();}}

        /**
         * Adds to this field in a copy of this DateMidnight.
         * <p>
         * The DateMidnight attached to this property is unchanged by this call.
         * This operation is faster than converting a DateMidnight to a MutableDateTime
         * and back again when setting one field. When setting multiple fields,
         * it is generally quicker to make the conversion to MutableDateTime.
         * 
         * @param value  the value to add to the field in the copy
         * @return a copy of the DateMidnight with the field value changed
         * @throws IllegalArgumentException if the value isn't valid
         */
        public DateMidnight addToCopy(long value) {try{__CLR4_4_100lc8azrho.R.inc(260);
            __CLR4_4_100lc8azrho.R.inc(261);return iInstant.withMillis(iField.add(iInstant.getMillis(), value));
        }finally{__CLR4_4_100lc8azrho.R.flushNeeded();}}

        /**
         * Adds to this field, possibly wrapped, in a copy of this DateMidnight.
         * A wrapped operation only changes this field.
         * Thus 31st January addWrapField one day goes to the 1st January.
         * <p>
         * The DateMidnight attached to this property is unchanged by this call.
         * This operation is faster than converting a DateMidnight to a MutableDateTime
         * and back again when setting one field. When setting multiple fields,
         * it is generally quicker to make the conversion to MutableDateTime.
         * 
         * @param value  the value to add to the field in the copy
         * @return a copy of the DateMidnight with the field value changed
         * @throws IllegalArgumentException if the value isn't valid
         */
        public DateMidnight addWrapFieldToCopy(int value) {try{__CLR4_4_100lc8azrho.R.inc(262);
            __CLR4_4_100lc8azrho.R.inc(263);return iInstant.withMillis(iField.addWrapField(iInstant.getMillis(), value));
        }finally{__CLR4_4_100lc8azrho.R.flushNeeded();}}

        //-----------------------------------------------------------------------
        /**
         * Sets this field in a copy of the DateMidnight.
         * <p>
         * The DateMidnight attached to this property is unchanged by this call.
         * This operation is faster than converting a DateMidnight to a MutableDateTime
         * and back again when setting one field. When setting multiple fields,
         * it is generally quicker to make the conversion to MutableDateTime.
         * 
         * @param value  the value to set the field in the copy to
         * @return a copy of the DateMidnight with the field value changed
         * @throws IllegalArgumentException if the value isn't valid
         */
        public DateMidnight setCopy(int value) {try{__CLR4_4_100lc8azrho.R.inc(264);
            __CLR4_4_100lc8azrho.R.inc(265);return iInstant.withMillis(iField.set(iInstant.getMillis(), value));
        }finally{__CLR4_4_100lc8azrho.R.flushNeeded();}}
    
        /**
         * Sets this field in a copy of the DateMidnight to a parsed text value.
         * <p>
         * The DateMidnight attached to this property is unchanged by this call.
         * This operation is faster than converting a DateMidnight to a MutableDateTime
         * and back again when setting one field. When setting multiple fields,
         * it is generally quicker to make the conversion to MutableDateTime.
         * 
         * @param text  the text value to set
         * @param locale  optional locale to use for selecting a text symbol
         * @return a copy of the DateMidnight with the field value changed
         * @throws IllegalArgumentException if the text value isn't valid
         */
        public DateMidnight setCopy(String text, Locale locale) {try{__CLR4_4_100lc8azrho.R.inc(266);
            __CLR4_4_100lc8azrho.R.inc(267);return iInstant.withMillis(iField.set(iInstant.getMillis(), text, locale));
        }finally{__CLR4_4_100lc8azrho.R.flushNeeded();}}

        /**
         * Sets this field in a copy of the DateMidnight to a parsed text value.
         * <p>
         * The DateMidnight attached to this property is unchanged by this call.
         * This operation is faster than converting a DateMidnight to a MutableDateTime
         * and back again when setting one field. When setting multiple fields,
         * it is generally quicker to make the conversion to MutableDateTime.
         * 
         * @param text  the text value to set
         * @return a copy of the DateMidnight with the field value changed
         * @throws IllegalArgumentException if the text value isn't valid
         */
        public DateMidnight setCopy(String text) {try{__CLR4_4_100lc8azrho.R.inc(268);
            __CLR4_4_100lc8azrho.R.inc(269);return setCopy(text, null);
        }finally{__CLR4_4_100lc8azrho.R.flushNeeded();}}

        //-----------------------------------------------------------------------
        /**
         * Returns a new DateMidnight with this field set to the maximum value
         * for this field.
         * <p>
         * This operation is useful for obtaining a DateTime on the last day
         * of the month, as month lengths vary.
         * <pre>
         * DateMidnight lastDayOfMonth = dt.dayOfMonth().withMaximumValue();
         * </pre>
         * <p>
         * The DateMidnight attached to this property is unchanged by this call.
         *
         * @return a copy of the DateMidnight with this field set to its maximum
         * @since 1.2
         */
        public DateMidnight withMaximumValue() {try{__CLR4_4_100lc8azrho.R.inc(270);
            __CLR4_4_100lc8azrho.R.inc(271);return setCopy(getMaximumValue());
        }finally{__CLR4_4_100lc8azrho.R.flushNeeded();}}
        
        /**
         * Returns a new DateMidnight with this field set to the minimum value
         * for this field.
         * <p>
         * The DateMidnight attached to this property is unchanged by this call.
         *
         * @return a copy of the DateMidnight with this field set to its minimum
         * @since 1.2
         */
        public DateMidnight withMinimumValue() {try{__CLR4_4_100lc8azrho.R.inc(272);
            __CLR4_4_100lc8azrho.R.inc(273);return setCopy(getMinimumValue());
        }finally{__CLR4_4_100lc8azrho.R.flushNeeded();}}
        
        //-----------------------------------------------------------------------
        /**
         * Rounds to the lowest whole unit of this field on a copy of this DateMidnight.
         *
         * @return a copy of the DateMidnight with the field value changed
         */
        public DateMidnight roundFloorCopy() {try{__CLR4_4_100lc8azrho.R.inc(274);
            __CLR4_4_100lc8azrho.R.inc(275);return iInstant.withMillis(iField.roundFloor(iInstant.getMillis()));
        }finally{__CLR4_4_100lc8azrho.R.flushNeeded();}}

        /**
         * Rounds to the highest whole unit of this field on a copy of this DateMidnight.
         *
         * @return a copy of the DateMidnight with the field value changed
         */
        public DateMidnight roundCeilingCopy() {try{__CLR4_4_100lc8azrho.R.inc(276);
            __CLR4_4_100lc8azrho.R.inc(277);return iInstant.withMillis(iField.roundCeiling(iInstant.getMillis()));
        }finally{__CLR4_4_100lc8azrho.R.flushNeeded();}}

        /**
         * Rounds to the nearest whole unit of this field on a copy of this DateMidnight,
         * favoring the floor if halfway.
         *
         * @return a copy of the DateMidnight with the field value changed
         */
        public DateMidnight roundHalfFloorCopy() {try{__CLR4_4_100lc8azrho.R.inc(278);
            __CLR4_4_100lc8azrho.R.inc(279);return iInstant.withMillis(iField.roundHalfFloor(iInstant.getMillis()));
        }finally{__CLR4_4_100lc8azrho.R.flushNeeded();}}

        /**
         * Rounds to the nearest whole unit of this field on a copy of this DateMidnight,
         * favoring the ceiling if halfway.
         *
         * @return a copy of the DateMidnight with the field value changed
         */
        public DateMidnight roundHalfCeilingCopy() {try{__CLR4_4_100lc8azrho.R.inc(280);
            __CLR4_4_100lc8azrho.R.inc(281);return iInstant.withMillis(iField.roundHalfCeiling(iInstant.getMillis()));
        }finally{__CLR4_4_100lc8azrho.R.flushNeeded();}}

        /**
         * Rounds to the nearest whole unit of this field on a copy of this DateMidnight.
         * If halfway, the ceiling is favored over the floor only if it makes this field's value even.
         *
         * @return a copy of the DateMidnight with the field value changed
         */
        public DateMidnight roundHalfEvenCopy() {try{__CLR4_4_100lc8azrho.R.inc(282);
            __CLR4_4_100lc8azrho.R.inc(283);return iInstant.withMillis(iField.roundHalfEven(iInstant.getMillis()));
        }finally{__CLR4_4_100lc8azrho.R.flushNeeded();}}

    }
}
