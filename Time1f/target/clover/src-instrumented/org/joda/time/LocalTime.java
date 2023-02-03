/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 *  Copyright 2001-2011 Stephen Colebourne
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
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

import org.joda.convert.FromString;
import org.joda.convert.ToString;
import org.joda.time.base.BaseLocal;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.convert.ConverterManager;
import org.joda.time.convert.PartialConverter;
import org.joda.time.field.AbstractReadableInstantFieldProperty;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.ISODateTimeFormat;

/**
 * LocalTime is an immutable time class representing a time
 * without a time zone.
 * <p>
 * LocalTime implements the {@link ReadablePartial} interface.
 * To do this, the interface methods focus on the key fields -
 * HourOfDay, MinuteOfHour, SecondOfMinute and MillisOfSecond.
 * However, <b>all</b> time fields may in fact be queried.
 * <p>
 * Calculations on LocalTime are performed using a {@link Chronology}.
 * This chronology will be set internally to be in the UTC time zone
 * for all calculations.
 *
 * <p>Each individual field can be queried in two ways:
 * <ul>
 * <li><code>getHourOfDay()</code>
 * <li><code>hourOfDay().get()</code>
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
 * LocalTime is thread-safe and immutable, provided that the Chronology is as well.
 * All standard Chronology classes supplied are thread-safe and immutable.
 *
 * @author Stephen Colebourne
 * @since 1.3
 */
@java.lang.SuppressWarnings({"fallthrough"}) public final class LocalTime
        extends BaseLocal
        implements ReadablePartial, Serializable {public static class __CLR4_4_12rb2rblc8azs5e{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672271027956L,8589935092L,3980,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** Serialization lock */
    private static final long serialVersionUID = -12873158713873L;

    /** Constant for midnight. */
    public static final LocalTime MIDNIGHT = new LocalTime(0, 0, 0, 0);

    /** The index of the hourOfDay field in the field array */
    private static final int HOUR_OF_DAY = 0;
    /** The index of the minuteOfHour field in the field array */
    private static final int MINUTE_OF_HOUR = 1;
    /** The index of the secondOfMinute field in the field array */
    private static final int SECOND_OF_MINUTE = 2;
    /** The index of the millisOfSecond field in the field array */
    private static final int MILLIS_OF_SECOND = 3;
    /** Set of known duration types. */
    private static final Set<DurationFieldType> TIME_DURATION_TYPES = new HashSet<DurationFieldType>();
    static {try{__CLR4_4_12rb2rblc8azs5e.R.inc(3575);
        __CLR4_4_12rb2rblc8azs5e.R.inc(3576);TIME_DURATION_TYPES.add(DurationFieldType.millis());
        __CLR4_4_12rb2rblc8azs5e.R.inc(3577);TIME_DURATION_TYPES.add(DurationFieldType.seconds());
        __CLR4_4_12rb2rblc8azs5e.R.inc(3578);TIME_DURATION_TYPES.add(DurationFieldType.minutes());
        __CLR4_4_12rb2rblc8azs5e.R.inc(3579);TIME_DURATION_TYPES.add(DurationFieldType.hours());
    }finally{__CLR4_4_12rb2rblc8azs5e.R.flushNeeded();}}

    /** The local millis from 1970-01-01T00:00:00 */
    private final long iLocalMillis;
    /** The chronology to use, in UTC */
    private final Chronology iChronology;

    //-----------------------------------------------------------------------
    /**
     * Obtains a {@code LocalTime} set to the current system millisecond time
     * using <code>ISOChronology</code> in the default time zone.
     * The resulting object does not use the zone.
     * 
     * @return the current time, not null
     * @since 2.0
     */
    public static LocalTime now() {try{__CLR4_4_12rb2rblc8azs5e.R.inc(3580);
        __CLR4_4_12rb2rblc8azs5e.R.inc(3581);return new LocalTime();
    }finally{__CLR4_4_12rb2rblc8azs5e.R.flushNeeded();}}

    /**
     * Obtains a {@code LocalTime} set to the current system millisecond time
     * using <code>ISOChronology</code> in the specified time zone.
     * The resulting object does not use the zone.
     *
     * @param zone  the time zone, not null
     * @return the current time, not null
     * @since 2.0
     */
    public static LocalTime now(DateTimeZone zone) {try{__CLR4_4_12rb2rblc8azs5e.R.inc(3582);
        __CLR4_4_12rb2rblc8azs5e.R.inc(3583);if ((((zone == null)&&(__CLR4_4_12rb2rblc8azs5e.R.iget(3584)!=0|true))||(__CLR4_4_12rb2rblc8azs5e.R.iget(3585)==0&false))) {{
            __CLR4_4_12rb2rblc8azs5e.R.inc(3586);throw new NullPointerException("Zone must not be null");
        }
        }__CLR4_4_12rb2rblc8azs5e.R.inc(3587);return new LocalTime(zone);
    }finally{__CLR4_4_12rb2rblc8azs5e.R.flushNeeded();}}

    /**
     * Obtains a {@code LocalTime} set to the current system millisecond time
     * using the specified chronology.
     * The resulting object does not use the zone.
     *
     * @param chronology  the chronology, not null
     * @return the current time, not null
     * @since 2.0
     */
    public static LocalTime now(Chronology chronology) {try{__CLR4_4_12rb2rblc8azs5e.R.inc(3588);
        __CLR4_4_12rb2rblc8azs5e.R.inc(3589);if ((((chronology == null)&&(__CLR4_4_12rb2rblc8azs5e.R.iget(3590)!=0|true))||(__CLR4_4_12rb2rblc8azs5e.R.iget(3591)==0&false))) {{
            __CLR4_4_12rb2rblc8azs5e.R.inc(3592);throw new NullPointerException("Chronology must not be null");
        }
        }__CLR4_4_12rb2rblc8azs5e.R.inc(3593);return new LocalTime(chronology);
    }finally{__CLR4_4_12rb2rblc8azs5e.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Parses a {@code LocalTime} from the specified string.
     * <p>
     * This uses {@link ISODateTimeFormat#localTimeParser()}.
     * 
     * @param str  the string to parse, not null
     * @since 2.0
     */
    @FromString
    public static LocalTime parse(String str) {try{__CLR4_4_12rb2rblc8azs5e.R.inc(3594);
        __CLR4_4_12rb2rblc8azs5e.R.inc(3595);return parse(str, ISODateTimeFormat.localTimeParser());
    }finally{__CLR4_4_12rb2rblc8azs5e.R.flushNeeded();}}

    /**
     * Parses a {@code LocalTime} from the specified string using a formatter.
     * 
     * @param str  the string to parse, not null
     * @param formatter  the formatter to use, not null
     * @since 2.0
     */
    public static LocalTime parse(String str, DateTimeFormatter formatter) {try{__CLR4_4_12rb2rblc8azs5e.R.inc(3596);
        __CLR4_4_12rb2rblc8azs5e.R.inc(3597);return formatter.parseLocalTime(str);
    }finally{__CLR4_4_12rb2rblc8azs5e.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Constructs a LocalTime from the specified millis of day using the
     * ISO chronology.
     * <p>
     * The millisOfDay value may exceed the number of millis in one day,
     * but additional days will be ignored.
     * This method uses the UTC time zone internally.
     *
     * @param millisOfDay  the number of milliseconds into a day to convert
     */
    public static LocalTime fromMillisOfDay(long millisOfDay) {try{__CLR4_4_12rb2rblc8azs5e.R.inc(3598);
        __CLR4_4_12rb2rblc8azs5e.R.inc(3599);return fromMillisOfDay(millisOfDay, null);
    }finally{__CLR4_4_12rb2rblc8azs5e.R.flushNeeded();}}

    /**
     * Constructs a LocalTime from the specified millis of day using the
     * specified chronology.
     * <p>
     * The millisOfDay value may exceed the number of millis in one day,
     * but additional days will be ignored.
     * This method uses the UTC time zone internally.
     *
     * @param millisOfDay  the number of milliseconds into a day to convert
     * @param chrono  the chronology, null means ISO chronology
     */
    public static LocalTime fromMillisOfDay(long millisOfDay, Chronology chrono) {try{__CLR4_4_12rb2rblc8azs5e.R.inc(3600);
        __CLR4_4_12rb2rblc8azs5e.R.inc(3601);chrono = DateTimeUtils.getChronology(chrono).withUTC();
        __CLR4_4_12rb2rblc8azs5e.R.inc(3602);return new LocalTime(millisOfDay, chrono);
    }finally{__CLR4_4_12rb2rblc8azs5e.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Constructs a LocalTime from a <code>java.util.Calendar</code>
     * using exactly the same field values.
     * <p>
     * Each field is queried from the Calendar and assigned to the LocalTime.
     * This is useful if you have been using the Calendar as a local time,
     * ignoring the zone.
     * <p>
     * One advantage of this method is that this method is unaffected if the
     * version of the time zone data differs between the JDK and Joda-Time.
     * That is because the local field values are transferred, calculated using
     * the JDK time zone data and without using the Joda-Time time zone data.
     * <p>
     * This factory method ignores the type of the calendar and always
     * creates a LocalTime with ISO chronology. It is expected that you
     * will only pass in instances of <code>GregorianCalendar</code> however
     * this is not validated.
     *
     * @param calendar  the Calendar to extract fields from
     * @return the created LocalTime
     * @throws IllegalArgumentException if the calendar is null
     * @throws IllegalArgumentException if the date is invalid for the ISO chronology
     */
    public static LocalTime fromCalendarFields(Calendar calendar) {try{__CLR4_4_12rb2rblc8azs5e.R.inc(3603);
        __CLR4_4_12rb2rblc8azs5e.R.inc(3604);if ((((calendar == null)&&(__CLR4_4_12rb2rblc8azs5e.R.iget(3605)!=0|true))||(__CLR4_4_12rb2rblc8azs5e.R.iget(3606)==0&false))) {{
            __CLR4_4_12rb2rblc8azs5e.R.inc(3607);throw new IllegalArgumentException("The calendar must not be null");
        }
        }__CLR4_4_12rb2rblc8azs5e.R.inc(3608);return new LocalTime(
            calendar.get(Calendar.HOUR_OF_DAY),
            calendar.get(Calendar.MINUTE),
            calendar.get(Calendar.SECOND),
            calendar.get(Calendar.MILLISECOND)
        );
    }finally{__CLR4_4_12rb2rblc8azs5e.R.flushNeeded();}}

    /**
     * Constructs a LocalTime from a <code>java.util.Date</code>
     * using exactly the same field values.
     * <p>
     * Each field is queried from the Date and assigned to the LocalTime.
     * This is useful if you have been using the Date as a local time,
     * ignoring the zone.
     * <p>
     * One advantage of this method is that this method is unaffected if the
     * version of the time zone data differs between the JDK and Joda-Time.
     * That is because the local field values are transferred, calculated using
     * the JDK time zone data and without using the Joda-Time time zone data.
     * <p>
     * This factory method always creates a LocalTime with ISO chronology.
     *
     * @param date  the Date to extract fields from
     * @return the created LocalTime
     * @throws IllegalArgumentException if the calendar is null
     * @throws IllegalArgumentException if the date is invalid for the ISO chronology
     */
    @SuppressWarnings("deprecation")
    public static LocalTime fromDateFields(Date date) {try{__CLR4_4_12rb2rblc8azs5e.R.inc(3609);
        __CLR4_4_12rb2rblc8azs5e.R.inc(3610);if ((((date == null)&&(__CLR4_4_12rb2rblc8azs5e.R.iget(3611)!=0|true))||(__CLR4_4_12rb2rblc8azs5e.R.iget(3612)==0&false))) {{
            __CLR4_4_12rb2rblc8azs5e.R.inc(3613);throw new IllegalArgumentException("The date must not be null");
        }
        }__CLR4_4_12rb2rblc8azs5e.R.inc(3614);return new LocalTime(
            date.getHours(),
            date.getMinutes(),
            date.getSeconds(),
            (((int) (date.getTime() % 1000)) + 1000) % 1000
        );
    }finally{__CLR4_4_12rb2rblc8azs5e.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Constructs an instance set to the current local time evaluated using
     * ISO chronology in the default zone.
     * <p>
     * Once the constructor is completed, the zone is no longer used.
     * 
     * @see #now()
     */
    public LocalTime() {
        this(DateTimeUtils.currentTimeMillis(), ISOChronology.getInstance());__CLR4_4_12rb2rblc8azs5e.R.inc(3616);try{__CLR4_4_12rb2rblc8azs5e.R.inc(3615);
    }finally{__CLR4_4_12rb2rblc8azs5e.R.flushNeeded();}}

    /**
     * Constructs an instance set to the current local time evaluated using
     * ISO chronology in the specified zone.
     * <p>
     * If the specified time zone is null, the default zone is used.
     * Once the constructor is completed, the zone is no longer used.
     *
     * @param zone  the time zone, null means default zone
     * @see #now(DateTimeZone)
     */
    public LocalTime(DateTimeZone zone) {
        this(DateTimeUtils.currentTimeMillis(), ISOChronology.getInstance(zone));__CLR4_4_12rb2rblc8azs5e.R.inc(3618);try{__CLR4_4_12rb2rblc8azs5e.R.inc(3617);
    }finally{__CLR4_4_12rb2rblc8azs5e.R.flushNeeded();}}

    /**
     * Constructs an instance set to the current local time evaluated using
     * specified chronology and zone.
     * <p>
     * If the chronology is null, ISO chronology in the default time zone is used.
     * Once the constructor is completed, the zone is no longer used.
     *
     * @param chronology  the chronology, null means ISOChronology in default zone
     * @see #now(Chronology)
     */
    public LocalTime(Chronology chronology) {
        this(DateTimeUtils.currentTimeMillis(), chronology);__CLR4_4_12rb2rblc8azs5e.R.inc(3620);try{__CLR4_4_12rb2rblc8azs5e.R.inc(3619);
    }finally{__CLR4_4_12rb2rblc8azs5e.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Constructs an instance set to the local time defined by the specified
     * instant evaluated using ISO chronology in the default zone.
     * <p>
     * Once the constructor is completed, the zone is no longer used.
     *
     * @param instant  the milliseconds from 1970-01-01T00:00:00Z
     */
    public LocalTime(long instant) {
        this(instant, ISOChronology.getInstance());__CLR4_4_12rb2rblc8azs5e.R.inc(3622);try{__CLR4_4_12rb2rblc8azs5e.R.inc(3621);
    }finally{__CLR4_4_12rb2rblc8azs5e.R.flushNeeded();}}

    /**
     * Constructs an instance set to the local time defined by the specified
     * instant evaluated using ISO chronology in the specified zone.
     * <p>
     * If the specified time zone is null, the default zone is used.
     * Once the constructor is completed, the zone is no longer used.
     *
     * @param instant  the milliseconds from 1970-01-01T00:00:00Z
     * @param zone  the time zone, null means default zone
     */
    public LocalTime(long instant, DateTimeZone zone) {
        this(instant, ISOChronology.getInstance(zone));__CLR4_4_12rb2rblc8azs5e.R.inc(3624);try{__CLR4_4_12rb2rblc8azs5e.R.inc(3623);
    }finally{__CLR4_4_12rb2rblc8azs5e.R.flushNeeded();}}

    /**
     * Constructs an instance set to the local time defined by the specified
     * instant evaluated using the specified chronology.
     * <p>
     * If the chronology is null, ISO chronology in the default zone is used.
     * Once the constructor is completed, the zone is no longer used.
     *
     * @param instant  the milliseconds from 1970-01-01T00:00:00Z
     * @param chronology  the chronology, null means ISOChronology in default zone
     */
    public LocalTime(long instant, Chronology chronology) {try{__CLR4_4_12rb2rblc8azs5e.R.inc(3625);
        __CLR4_4_12rb2rblc8azs5e.R.inc(3626);chronology = DateTimeUtils.getChronology(chronology);
        
        __CLR4_4_12rb2rblc8azs5e.R.inc(3627);long localMillis = chronology.getZone().getMillisKeepLocal(DateTimeZone.UTC, instant);
        __CLR4_4_12rb2rblc8azs5e.R.inc(3628);chronology = chronology.withUTC();
        __CLR4_4_12rb2rblc8azs5e.R.inc(3629);iLocalMillis = chronology.millisOfDay().get(localMillis);
        __CLR4_4_12rb2rblc8azs5e.R.inc(3630);iChronology = chronology;
    }finally{__CLR4_4_12rb2rblc8azs5e.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Constructs an instance from an Object that represents a datetime.
     * <p>
     * If the object contains no chronology, <code>ISOChronology</code> is used.
     * If the object contains no time zone, the default zone is used.
     * Once the constructor is completed, the zone is no longer used.
     * <p>
     * The recognised object types are defined in
     * {@link org.joda.time.convert.ConverterManager ConverterManager} and
     * include ReadablePartial, ReadableInstant, String, Calendar and Date.
     * The String formats are described by {@link ISODateTimeFormat#localTimeParser()}.
     * The default String converter ignores the zone and only parses the field values.
     *
     * @param instant  the datetime object
     * @throws IllegalArgumentException if the instant is invalid
     */
    public LocalTime(Object instant) {
        this(instant, (Chronology) null);__CLR4_4_12rb2rblc8azs5e.R.inc(3632);try{__CLR4_4_12rb2rblc8azs5e.R.inc(3631);
    }finally{__CLR4_4_12rb2rblc8azs5e.R.flushNeeded();}}

    /**
     * Constructs an instance from an Object that represents a datetime,
     * forcing the time zone to that specified.
     * <p>
     * If the object contains no chronology, <code>ISOChronology</code> is used.
     * If the specified time zone is null, the default zone is used.
     * Once the constructor is completed, the zone is no longer used.
     * <p>
     * The recognised object types are defined in
     * {@link org.joda.time.convert.ConverterManager ConverterManager} and
     * include ReadablePartial, ReadableInstant, String, Calendar and Date.
     * The String formats are described by {@link ISODateTimeFormat#localTimeParser()}.
     * The default String converter ignores the zone and only parses the field values.
     *
     * @param instant  the datetime object
     * @param zone  the time zone
     * @throws IllegalArgumentException if the instant is invalid
     */
    public LocalTime(Object instant, DateTimeZone zone) {try{__CLR4_4_12rb2rblc8azs5e.R.inc(3633);
        __CLR4_4_12rb2rblc8azs5e.R.inc(3634);PartialConverter converter = ConverterManager.getInstance().getPartialConverter(instant);
        __CLR4_4_12rb2rblc8azs5e.R.inc(3635);Chronology chronology = converter.getChronology(instant, zone);
        __CLR4_4_12rb2rblc8azs5e.R.inc(3636);chronology = DateTimeUtils.getChronology(chronology);
        __CLR4_4_12rb2rblc8azs5e.R.inc(3637);iChronology = chronology.withUTC();
        __CLR4_4_12rb2rblc8azs5e.R.inc(3638);int[] values = converter.getPartialValues(this, instant, chronology, ISODateTimeFormat.localTimeParser());
        __CLR4_4_12rb2rblc8azs5e.R.inc(3639);iLocalMillis = iChronology.getDateTimeMillis(0L, values[0], values[1], values[2], values[3]);
    }finally{__CLR4_4_12rb2rblc8azs5e.R.flushNeeded();}}

    /**
     * Constructs an instance from an Object that represents a datetime,
     * using the specified chronology.
     * <p>
     * If the chronology is null, ISO in the default time zone is used.
     * Once the constructor is completed, the zone is no longer used.
     * <p>
     * The recognised object types are defined in
     * {@link org.joda.time.convert.ConverterManager ConverterManager} and
     * include ReadablePartial, ReadableInstant, String, Calendar and Date.
     * The String formats are described by {@link ISODateTimeFormat#localTimeParser()}.
     * The default String converter ignores the zone and only parses the field values.
     *
     * @param instant  the datetime object
     * @param chronology  the chronology
     * @throws IllegalArgumentException if the instant is invalid
     */
    public LocalTime(Object instant, Chronology chronology) {try{__CLR4_4_12rb2rblc8azs5e.R.inc(3640);
        __CLR4_4_12rb2rblc8azs5e.R.inc(3641);PartialConverter converter = ConverterManager.getInstance().getPartialConverter(instant);
        __CLR4_4_12rb2rblc8azs5e.R.inc(3642);chronology = converter.getChronology(instant, chronology);
        __CLR4_4_12rb2rblc8azs5e.R.inc(3643);chronology = DateTimeUtils.getChronology(chronology);
        __CLR4_4_12rb2rblc8azs5e.R.inc(3644);iChronology = chronology.withUTC();
        __CLR4_4_12rb2rblc8azs5e.R.inc(3645);int[] values = converter.getPartialValues(this, instant, chronology, ISODateTimeFormat.localTimeParser());
        __CLR4_4_12rb2rblc8azs5e.R.inc(3646);iLocalMillis = iChronology.getDateTimeMillis(0L, values[0], values[1], values[2], values[3]);
    }finally{__CLR4_4_12rb2rblc8azs5e.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Constructs an instance set to the specified time
     * using <code>ISOChronology</code>.
     *
     * @param hourOfDay  the hour of the day, from 0 to 23
     * @param minuteOfHour  the minute of the hour, from 0 to 59
     */
    public LocalTime(
            int hourOfDay,
            int minuteOfHour) {
        this(hourOfDay, minuteOfHour, 0, 0, ISOChronology.getInstanceUTC());__CLR4_4_12rb2rblc8azs5e.R.inc(3648);try{__CLR4_4_12rb2rblc8azs5e.R.inc(3647);
    }finally{__CLR4_4_12rb2rblc8azs5e.R.flushNeeded();}}

    /**
     * Constructs an instance set to the specified time
     * using <code>ISOChronology</code>.
     *
     * @param hourOfDay  the hour of the day, from 0 to 23
     * @param minuteOfHour  the minute of the hour, from 0 to 59
     * @param secondOfMinute  the second of the minute, from 0 to 59
     */
    public LocalTime(
            int hourOfDay,
            int minuteOfHour,
            int secondOfMinute) {
        this(hourOfDay, minuteOfHour, secondOfMinute, 0, ISOChronology.getInstanceUTC());__CLR4_4_12rb2rblc8azs5e.R.inc(3650);try{__CLR4_4_12rb2rblc8azs5e.R.inc(3649);
    }finally{__CLR4_4_12rb2rblc8azs5e.R.flushNeeded();}}

    /**
     * Constructs an instance set to the specified time
     * using <code>ISOChronology</code>.
     *
     * @param hourOfDay  the hour of the day, from 0 to 23
     * @param minuteOfHour  the minute of the hour, from 0 to 59
     * @param secondOfMinute  the second of the minute, from 0 to 59
     * @param millisOfSecond  the millisecond of the second, from 0 to 999
     */
    public LocalTime(
            int hourOfDay,
            int minuteOfHour,
            int secondOfMinute,
            int millisOfSecond) {
        this(hourOfDay, minuteOfHour, secondOfMinute,
                millisOfSecond, ISOChronology.getInstanceUTC());__CLR4_4_12rb2rblc8azs5e.R.inc(3652);try{__CLR4_4_12rb2rblc8azs5e.R.inc(3651);
    }finally{__CLR4_4_12rb2rblc8azs5e.R.flushNeeded();}}

    /**
     * Constructs an instance set to the specified time
     * using the specified chronology, whose zone is ignored.
     * <p>
     * If the chronology is null, <code>ISOChronology</code> is used.
     *
     * @param hourOfDay  the hour of the day, valid values defined by the chronology
     * @param minuteOfHour  the minute of the hour, valid values defined by the chronology
     * @param secondOfMinute  the second of the minute, valid values defined by the chronology
     * @param millisOfSecond  the millisecond of the second, valid values defined by the chronology
     * @param chronology  the chronology, null means ISOChronology in default zone
     */
    public LocalTime(
            int hourOfDay,
            int minuteOfHour,
            int secondOfMinute,
            int millisOfSecond,
            Chronology chronology) {
        super();__CLR4_4_12rb2rblc8azs5e.R.inc(3654);try{__CLR4_4_12rb2rblc8azs5e.R.inc(3653);
        __CLR4_4_12rb2rblc8azs5e.R.inc(3655);chronology = DateTimeUtils.getChronology(chronology).withUTC();
        __CLR4_4_12rb2rblc8azs5e.R.inc(3656);long instant = chronology.getDateTimeMillis(
            0L, hourOfDay, minuteOfHour, secondOfMinute, millisOfSecond);
        __CLR4_4_12rb2rblc8azs5e.R.inc(3657);iChronology = chronology;
        __CLR4_4_12rb2rblc8azs5e.R.inc(3658);iLocalMillis = instant;
    }finally{__CLR4_4_12rb2rblc8azs5e.R.flushNeeded();}}

    /**
     * Handle broken serialization from other tools.
     * @return the resolved object, not null
     */
    private Object readResolve() {try{__CLR4_4_12rb2rblc8azs5e.R.inc(3659);
        __CLR4_4_12rb2rblc8azs5e.R.inc(3660);if ((((iChronology == null)&&(__CLR4_4_12rb2rblc8azs5e.R.iget(3661)!=0|true))||(__CLR4_4_12rb2rblc8azs5e.R.iget(3662)==0&false))) {{
            __CLR4_4_12rb2rblc8azs5e.R.inc(3663);return new LocalTime(iLocalMillis, ISOChronology.getInstanceUTC());
        }
        }__CLR4_4_12rb2rblc8azs5e.R.inc(3664);if ((((DateTimeZone.UTC.equals(iChronology.getZone()) == false)&&(__CLR4_4_12rb2rblc8azs5e.R.iget(3665)!=0|true))||(__CLR4_4_12rb2rblc8azs5e.R.iget(3666)==0&false))) {{
            __CLR4_4_12rb2rblc8azs5e.R.inc(3667);return new LocalTime(iLocalMillis, iChronology.withUTC());
        }
        }__CLR4_4_12rb2rblc8azs5e.R.inc(3668);return this;
    }finally{__CLR4_4_12rb2rblc8azs5e.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Gets the number of fields in this partial, which is four.
     * The supported fields are HourOfDay, MinuteOfHour, SecondOfMinute
     * and MillisOfSecond.
     *
     * @return the field count, four
     */
    public int size() {try{__CLR4_4_12rb2rblc8azs5e.R.inc(3669);
        __CLR4_4_12rb2rblc8azs5e.R.inc(3670);return 4;
    }finally{__CLR4_4_12rb2rblc8azs5e.R.flushNeeded();}}

    /**
     * Gets the field for a specific index in the chronology specified.
     * <p>
     * This method must not use any instance variables.
     *
     * @param index  the index to retrieve
     * @param chrono  the chronology to use
     * @return the field
     */
    protected DateTimeField getField(int index, Chronology chrono) {try{__CLR4_4_12rb2rblc8azs5e.R.inc(3671);
        boolean __CLB4_4_1_bool0=false;__CLR4_4_12rb2rblc8azs5e.R.inc(3672);switch (index) {
            case HOUR_OF_DAY:if (!__CLB4_4_1_bool0) {__CLR4_4_12rb2rblc8azs5e.R.inc(3673);__CLB4_4_1_bool0=true;}
                __CLR4_4_12rb2rblc8azs5e.R.inc(3674);return chrono.hourOfDay();
            case MINUTE_OF_HOUR:if (!__CLB4_4_1_bool0) {__CLR4_4_12rb2rblc8azs5e.R.inc(3675);__CLB4_4_1_bool0=true;}
                __CLR4_4_12rb2rblc8azs5e.R.inc(3676);return chrono.minuteOfHour();
            case SECOND_OF_MINUTE:if (!__CLB4_4_1_bool0) {__CLR4_4_12rb2rblc8azs5e.R.inc(3677);__CLB4_4_1_bool0=true;}
                __CLR4_4_12rb2rblc8azs5e.R.inc(3678);return chrono.secondOfMinute();
            case MILLIS_OF_SECOND:if (!__CLB4_4_1_bool0) {__CLR4_4_12rb2rblc8azs5e.R.inc(3679);__CLB4_4_1_bool0=true;}
                __CLR4_4_12rb2rblc8azs5e.R.inc(3680);return chrono.millisOfSecond();
            default:if (!__CLB4_4_1_bool0) {__CLR4_4_12rb2rblc8azs5e.R.inc(3681);__CLB4_4_1_bool0=true;}
                __CLR4_4_12rb2rblc8azs5e.R.inc(3682);throw new IndexOutOfBoundsException("Invalid index: " + index);
        }
    }finally{__CLR4_4_12rb2rblc8azs5e.R.flushNeeded();}}

    /**
     * Gets the value of the field at the specifed index.
     * <p>
     * This method is required to support the <code>ReadablePartial</code>
     * interface. The supported fields are HourOfDay, MinuteOfHour,
     * SecondOfMinute and MillisOfSecond.
     *
     * @param index  the index, zero to three
     * @return the value
     * @throws IndexOutOfBoundsException if the index is invalid
     */
    public int getValue(int index) {try{__CLR4_4_12rb2rblc8azs5e.R.inc(3683);
        boolean __CLB4_4_1_bool1=false;__CLR4_4_12rb2rblc8azs5e.R.inc(3684);switch (index) {
            case HOUR_OF_DAY:if (!__CLB4_4_1_bool1) {__CLR4_4_12rb2rblc8azs5e.R.inc(3685);__CLB4_4_1_bool1=true;}
                __CLR4_4_12rb2rblc8azs5e.R.inc(3686);return getChronology().hourOfDay().get(getLocalMillis());
            case MINUTE_OF_HOUR:if (!__CLB4_4_1_bool1) {__CLR4_4_12rb2rblc8azs5e.R.inc(3687);__CLB4_4_1_bool1=true;}
                __CLR4_4_12rb2rblc8azs5e.R.inc(3688);return getChronology().minuteOfHour().get(getLocalMillis());
            case SECOND_OF_MINUTE:if (!__CLB4_4_1_bool1) {__CLR4_4_12rb2rblc8azs5e.R.inc(3689);__CLB4_4_1_bool1=true;}
                __CLR4_4_12rb2rblc8azs5e.R.inc(3690);return getChronology().secondOfMinute().get(getLocalMillis());
            case MILLIS_OF_SECOND:if (!__CLB4_4_1_bool1) {__CLR4_4_12rb2rblc8azs5e.R.inc(3691);__CLB4_4_1_bool1=true;}
                __CLR4_4_12rb2rblc8azs5e.R.inc(3692);return getChronology().millisOfSecond().get(getLocalMillis());
            default:if (!__CLB4_4_1_bool1) {__CLR4_4_12rb2rblc8azs5e.R.inc(3693);__CLB4_4_1_bool1=true;}
                __CLR4_4_12rb2rblc8azs5e.R.inc(3694);throw new IndexOutOfBoundsException("Invalid index: " + index);
        }
    }finally{__CLR4_4_12rb2rblc8azs5e.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Get the value of one of the fields of time.
     * <p>
     * This method gets the value of the specified field.
     * For example:
     * <pre>
     * DateTime dt = new DateTime();
     * int hourOfDay = dt.get(DateTimeFieldType.hourOfDay());
     * </pre>
     *
     * @param fieldType  a field type, usually obtained from DateTimeFieldType, not null
     * @return the value of that field
     * @throws IllegalArgumentException if the field type is null
     */
    public int get(DateTimeFieldType fieldType) {try{__CLR4_4_12rb2rblc8azs5e.R.inc(3695);
        __CLR4_4_12rb2rblc8azs5e.R.inc(3696);if ((((fieldType == null)&&(__CLR4_4_12rb2rblc8azs5e.R.iget(3697)!=0|true))||(__CLR4_4_12rb2rblc8azs5e.R.iget(3698)==0&false))) {{
            __CLR4_4_12rb2rblc8azs5e.R.inc(3699);throw new IllegalArgumentException("The DateTimeFieldType must not be null");
        }
        }__CLR4_4_12rb2rblc8azs5e.R.inc(3700);if ((((isSupported(fieldType) == false)&&(__CLR4_4_12rb2rblc8azs5e.R.iget(3701)!=0|true))||(__CLR4_4_12rb2rblc8azs5e.R.iget(3702)==0&false))) {{
            __CLR4_4_12rb2rblc8azs5e.R.inc(3703);throw new IllegalArgumentException("Field '" + fieldType + "' is not supported");
        }
        }__CLR4_4_12rb2rblc8azs5e.R.inc(3704);return fieldType.getField(getChronology()).get(getLocalMillis());
    }finally{__CLR4_4_12rb2rblc8azs5e.R.flushNeeded();}}

    /**
     * Checks if the field type specified is supported by this
     * local time and chronology.
     * This can be used to avoid exceptions in {@link #get(DateTimeFieldType)}.
     *
     * @param type  a field type, usually obtained from DateTimeFieldType
     * @return true if the field type is supported
     */
    public boolean isSupported(DateTimeFieldType type) {try{__CLR4_4_12rb2rblc8azs5e.R.inc(3705);
        __CLR4_4_12rb2rblc8azs5e.R.inc(3706);if ((((type == null)&&(__CLR4_4_12rb2rblc8azs5e.R.iget(3707)!=0|true))||(__CLR4_4_12rb2rblc8azs5e.R.iget(3708)==0&false))) {{
            __CLR4_4_12rb2rblc8azs5e.R.inc(3709);return false;
        }
        }__CLR4_4_12rb2rblc8azs5e.R.inc(3710);if ((((isSupported(type.getDurationType()) == false)&&(__CLR4_4_12rb2rblc8azs5e.R.iget(3711)!=0|true))||(__CLR4_4_12rb2rblc8azs5e.R.iget(3712)==0&false))) {{
            __CLR4_4_12rb2rblc8azs5e.R.inc(3713);return false;
        }
        }__CLR4_4_12rb2rblc8azs5e.R.inc(3714);DurationFieldType range = type.getRangeDurationType();
        __CLR4_4_12rb2rblc8azs5e.R.inc(3715);return (isSupported(range) || range == DurationFieldType.days());
    }finally{__CLR4_4_12rb2rblc8azs5e.R.flushNeeded();}}

    /**
     * Checks if the duration type specified is supported by this
     * local time and chronology.
     *
     * @param type  a duration type, usually obtained from DurationFieldType
     * @return true if the field type is supported
     */
    public boolean isSupported(DurationFieldType type) {try{__CLR4_4_12rb2rblc8azs5e.R.inc(3716);
        __CLR4_4_12rb2rblc8azs5e.R.inc(3717);if ((((type == null)&&(__CLR4_4_12rb2rblc8azs5e.R.iget(3718)!=0|true))||(__CLR4_4_12rb2rblc8azs5e.R.iget(3719)==0&false))) {{
            __CLR4_4_12rb2rblc8azs5e.R.inc(3720);return false;
        }
        }__CLR4_4_12rb2rblc8azs5e.R.inc(3721);DurationField field = type.getField(getChronology());
        __CLR4_4_12rb2rblc8azs5e.R.inc(3722);if ((((TIME_DURATION_TYPES.contains(type) ||
            field.getUnitMillis() < getChronology().days().getUnitMillis())&&(__CLR4_4_12rb2rblc8azs5e.R.iget(3723)!=0|true))||(__CLR4_4_12rb2rblc8azs5e.R.iget(3724)==0&false))) {{
            __CLR4_4_12rb2rblc8azs5e.R.inc(3725);return field.isSupported();
        }
        }__CLR4_4_12rb2rblc8azs5e.R.inc(3726);return false;
    }finally{__CLR4_4_12rb2rblc8azs5e.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Gets the local milliseconds from the Java epoch
     * of 1970-01-01T00:00:00 (not fixed to any specific time zone).
     * 
     * @return the number of milliseconds since 1970-01-01T00:00:00
     * @since 1.5 (previously private)
     */
    protected long getLocalMillis() {try{__CLR4_4_12rb2rblc8azs5e.R.inc(3727);
        __CLR4_4_12rb2rblc8azs5e.R.inc(3728);return iLocalMillis;
    }finally{__CLR4_4_12rb2rblc8azs5e.R.flushNeeded();}}

    /**
     * Gets the chronology of the time.
     * 
     * @return the Chronology that the time is using
     */
    public Chronology getChronology() {try{__CLR4_4_12rb2rblc8azs5e.R.inc(3729);
        __CLR4_4_12rb2rblc8azs5e.R.inc(3730);return iChronology;
    }finally{__CLR4_4_12rb2rblc8azs5e.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Compares this ReadablePartial with another returning true if the chronology,
     * field types and values are equal.
     *
     * @param partial  an object to check against
     * @return true if fields and values are equal
     */
    public boolean equals(Object partial) {try{__CLR4_4_12rb2rblc8azs5e.R.inc(3731);
        // override to perform faster
        __CLR4_4_12rb2rblc8azs5e.R.inc(3732);if ((((this == partial)&&(__CLR4_4_12rb2rblc8azs5e.R.iget(3733)!=0|true))||(__CLR4_4_12rb2rblc8azs5e.R.iget(3734)==0&false))) {{
            __CLR4_4_12rb2rblc8azs5e.R.inc(3735);return true;
        }
        }__CLR4_4_12rb2rblc8azs5e.R.inc(3736);if ((((partial instanceof LocalTime)&&(__CLR4_4_12rb2rblc8azs5e.R.iget(3737)!=0|true))||(__CLR4_4_12rb2rblc8azs5e.R.iget(3738)==0&false))) {{
            __CLR4_4_12rb2rblc8azs5e.R.inc(3739);LocalTime other = (LocalTime) partial;
            __CLR4_4_12rb2rblc8azs5e.R.inc(3740);if ((((iChronology.equals(other.iChronology))&&(__CLR4_4_12rb2rblc8azs5e.R.iget(3741)!=0|true))||(__CLR4_4_12rb2rblc8azs5e.R.iget(3742)==0&false))) {{
                __CLR4_4_12rb2rblc8azs5e.R.inc(3743);return iLocalMillis == other.iLocalMillis;
            }
        }}
        }__CLR4_4_12rb2rblc8azs5e.R.inc(3744);return super.equals(partial);
    }finally{__CLR4_4_12rb2rblc8azs5e.R.flushNeeded();}}

    /**
     * Compares this partial with another returning an integer
     * indicating the order.
     * <p>
     * The fields are compared in order, from largest to smallest.
     * The first field that is non-equal is used to determine the result.
     * <p>
     * The specified object must be a partial instance whose field types
     * match those of this partial.
     *
     * @param partial  an object to check against
     * @return negative if this is less, zero if equal, positive if greater
     * @throws ClassCastException if the partial is the wrong class
     *  or if it has field types that don't match
     * @throws NullPointerException if the partial is null
     */
    public int compareTo(ReadablePartial partial) {try{__CLR4_4_12rb2rblc8azs5e.R.inc(3745);
        // override to perform faster
        __CLR4_4_12rb2rblc8azs5e.R.inc(3746);if ((((this == partial)&&(__CLR4_4_12rb2rblc8azs5e.R.iget(3747)!=0|true))||(__CLR4_4_12rb2rblc8azs5e.R.iget(3748)==0&false))) {{
            __CLR4_4_12rb2rblc8azs5e.R.inc(3749);return 0;
        }
        }__CLR4_4_12rb2rblc8azs5e.R.inc(3750);if ((((partial instanceof LocalTime)&&(__CLR4_4_12rb2rblc8azs5e.R.iget(3751)!=0|true))||(__CLR4_4_12rb2rblc8azs5e.R.iget(3752)==0&false))) {{
            __CLR4_4_12rb2rblc8azs5e.R.inc(3753);LocalTime other = (LocalTime) partial;
            __CLR4_4_12rb2rblc8azs5e.R.inc(3754);if ((((iChronology.equals(other.iChronology))&&(__CLR4_4_12rb2rblc8azs5e.R.iget(3755)!=0|true))||(__CLR4_4_12rb2rblc8azs5e.R.iget(3756)==0&false))) {{
                __CLR4_4_12rb2rblc8azs5e.R.inc(3757);return ((((iLocalMillis < other.iLocalMillis )&&(__CLR4_4_12rb2rblc8azs5e.R.iget(3758)!=0|true))||(__CLR4_4_12rb2rblc8azs5e.R.iget(3759)==0&false))? -1 :
                            ((((iLocalMillis == other.iLocalMillis )&&(__CLR4_4_12rb2rblc8azs5e.R.iget(3760)!=0|true))||(__CLR4_4_12rb2rblc8azs5e.R.iget(3761)==0&false))? 0 : 1));

            }
        }}
        }__CLR4_4_12rb2rblc8azs5e.R.inc(3762);return super.compareTo(partial);
    }finally{__CLR4_4_12rb2rblc8azs5e.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Returns a copy of this time with different local millis.
     * <p>
     * The returned object will be a new instance of the same type.
     * Only the millis will change, the chronology is kept.
     * The returned object will be either be a new instance or <code>this</code>.
     *
     * @param newMillis  the new millis, from 1970-01-01T00:00:00
     * @return a copy of this time with different millis
     */
    LocalTime withLocalMillis(long newMillis) {try{__CLR4_4_12rb2rblc8azs5e.R.inc(3763);
        __CLR4_4_12rb2rblc8azs5e.R.inc(3764);return ((((newMillis == getLocalMillis() )&&(__CLR4_4_12rb2rblc8azs5e.R.iget(3765)!=0|true))||(__CLR4_4_12rb2rblc8azs5e.R.iget(3766)==0&false))? this : new LocalTime(newMillis, getChronology()));
    }finally{__CLR4_4_12rb2rblc8azs5e.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Returns a copy of this time with the partial set of fields replacing
     * those from this instance.
     * <p>
     * For example, if the partial contains an hour and minute then those two
     * fields will be changed in the returned instance.
     * Unsupported fields are ignored.
     * If the partial is null, then <code>this</code> is returned.
     *
     * @param partial  the partial set of fields to apply to this time, null ignored
     * @return a copy of this time with a different set of fields
     * @throws IllegalArgumentException if any value is invalid
     */
    public LocalTime withFields(ReadablePartial partial) {try{__CLR4_4_12rb2rblc8azs5e.R.inc(3767);
        __CLR4_4_12rb2rblc8azs5e.R.inc(3768);if ((((partial == null)&&(__CLR4_4_12rb2rblc8azs5e.R.iget(3769)!=0|true))||(__CLR4_4_12rb2rblc8azs5e.R.iget(3770)==0&false))) {{
            __CLR4_4_12rb2rblc8azs5e.R.inc(3771);return this;
        }
        }__CLR4_4_12rb2rblc8azs5e.R.inc(3772);return withLocalMillis(getChronology().set(partial, getLocalMillis()));
    }finally{__CLR4_4_12rb2rblc8azs5e.R.flushNeeded();}}

    /**
     * Returns a copy of this time with the specified field set
     * to a new value.
     * <p>
     * For example, if the field type is <code>hourOfDay</code> then the hour of day
     * field would be changed in the returned instance.
     * If the field type is null, then <code>this</code> is returned.
     * <p>
     * These lines are equivalent:
     * <pre>
     * LocalTime updated = dt.withHourOfDay(6);
     * LocalTime updated = dt.withField(DateTimeFieldType.hourOfDay(), 6);
     * </pre>
     *
     * @param fieldType  the field type to set, not null
     * @param value  the value to set
     * @return a copy of this time with the field set
     * @throws IllegalArgumentException if the value is null or invalid
     */
    public LocalTime withField(DateTimeFieldType fieldType, int value) {try{__CLR4_4_12rb2rblc8azs5e.R.inc(3773);
        __CLR4_4_12rb2rblc8azs5e.R.inc(3774);if ((((fieldType == null)&&(__CLR4_4_12rb2rblc8azs5e.R.iget(3775)!=0|true))||(__CLR4_4_12rb2rblc8azs5e.R.iget(3776)==0&false))) {{
            __CLR4_4_12rb2rblc8azs5e.R.inc(3777);throw new IllegalArgumentException("Field must not be null");
        }
        }__CLR4_4_12rb2rblc8azs5e.R.inc(3778);if ((((isSupported(fieldType) == false)&&(__CLR4_4_12rb2rblc8azs5e.R.iget(3779)!=0|true))||(__CLR4_4_12rb2rblc8azs5e.R.iget(3780)==0&false))) {{
            __CLR4_4_12rb2rblc8azs5e.R.inc(3781);throw new IllegalArgumentException("Field '" + fieldType + "' is not supported");
        }
        }__CLR4_4_12rb2rblc8azs5e.R.inc(3782);long instant = fieldType.getField(getChronology()).set(getLocalMillis(), value);
        __CLR4_4_12rb2rblc8azs5e.R.inc(3783);return withLocalMillis(instant);
    }finally{__CLR4_4_12rb2rblc8azs5e.R.flushNeeded();}}

    /**
     * Returns a copy of this time with the value of the specified
     * field increased.
     * <p>
     * If the addition is zero or the field is null, then <code>this</code>
     * is returned.
     * <p>
     * If the addition causes the maximum value of the field to be exceeded,
     * then the value will wrap. Thus 23:59 plus two minutes yields 00:01.
     * <p>
     * These lines are equivalent:
     * <pre>
     * LocalTime added = dt.plusHours(6);
     * LocalTime added = dt.withFieldAdded(DurationFieldType.hours(), 6);
     * </pre>
     *
     * @param fieldType  the field type to add to, not null
     * @param amount  the amount to add
     * @return a copy of this time with the field updated
     * @throws IllegalArgumentException if the value is null or invalid
     * @throws ArithmeticException if the result exceeds the internal capacity
     */
    public LocalTime withFieldAdded(DurationFieldType fieldType, int amount) {try{__CLR4_4_12rb2rblc8azs5e.R.inc(3784);
        __CLR4_4_12rb2rblc8azs5e.R.inc(3785);if ((((fieldType == null)&&(__CLR4_4_12rb2rblc8azs5e.R.iget(3786)!=0|true))||(__CLR4_4_12rb2rblc8azs5e.R.iget(3787)==0&false))) {{
            __CLR4_4_12rb2rblc8azs5e.R.inc(3788);throw new IllegalArgumentException("Field must not be null");
        }
        }__CLR4_4_12rb2rblc8azs5e.R.inc(3789);if ((((isSupported(fieldType) == false)&&(__CLR4_4_12rb2rblc8azs5e.R.iget(3790)!=0|true))||(__CLR4_4_12rb2rblc8azs5e.R.iget(3791)==0&false))) {{
            __CLR4_4_12rb2rblc8azs5e.R.inc(3792);throw new IllegalArgumentException("Field '" + fieldType + "' is not supported");
        }
        }__CLR4_4_12rb2rblc8azs5e.R.inc(3793);if ((((amount == 0)&&(__CLR4_4_12rb2rblc8azs5e.R.iget(3794)!=0|true))||(__CLR4_4_12rb2rblc8azs5e.R.iget(3795)==0&false))) {{
            __CLR4_4_12rb2rblc8azs5e.R.inc(3796);return this;
        }
        }__CLR4_4_12rb2rblc8azs5e.R.inc(3797);long instant = fieldType.getField(getChronology()).add(getLocalMillis(), amount);
        __CLR4_4_12rb2rblc8azs5e.R.inc(3798);return withLocalMillis(instant);
    }finally{__CLR4_4_12rb2rblc8azs5e.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Returns a copy of this time with the specified period added.
     * <p>
     * If the addition is zero, then <code>this</code> is returned.
     * <p>
     * This method is typically used to add multiple copies of complex
     * period instances. Adding one field is best achieved using methods
     * like {@link #withFieldAdded(DurationFieldType, int)}
     * or {@link #plusHours(int)}.
     *
     * @param period  the period to add to this one, null means zero
     * @param scalar  the amount of times to add, such as -1 to subtract once
     * @return a copy of this time with the period added
     * @throws ArithmeticException if the result exceeds the internal capacity
     */
    public LocalTime withPeriodAdded(ReadablePeriod period, int scalar) {try{__CLR4_4_12rb2rblc8azs5e.R.inc(3799);
        __CLR4_4_12rb2rblc8azs5e.R.inc(3800);if ((((period == null || scalar == 0)&&(__CLR4_4_12rb2rblc8azs5e.R.iget(3801)!=0|true))||(__CLR4_4_12rb2rblc8azs5e.R.iget(3802)==0&false))) {{
            __CLR4_4_12rb2rblc8azs5e.R.inc(3803);return this;
        }
        }__CLR4_4_12rb2rblc8azs5e.R.inc(3804);long instant = getChronology().add(period, getLocalMillis(), scalar);
        __CLR4_4_12rb2rblc8azs5e.R.inc(3805);return withLocalMillis(instant);
    }finally{__CLR4_4_12rb2rblc8azs5e.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Returns a copy of this time with the specified period added.
     * <p>
     * If the amount is zero or null, then <code>this</code> is returned.
     * <p>
     * This method is typically used to add complex period instances.
     * Adding one field is best achieved using methods
     * like {@link #plusHours(int)}.
     * 
     * @param period  the period to add to this one, null means zero
     * @return a copy of this time with the period added
     * @throws ArithmeticException if the result exceeds the internal capacity
     */
    public LocalTime plus(ReadablePeriod period) {try{__CLR4_4_12rb2rblc8azs5e.R.inc(3806);
        __CLR4_4_12rb2rblc8azs5e.R.inc(3807);return withPeriodAdded(period, 1);
    }finally{__CLR4_4_12rb2rblc8azs5e.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Returns a copy of this time plus the specified number of hours.
     * <p>
     * This LocalTime instance is immutable and unaffected by this method call.
     * <p>
     * The following three lines are identical in effect:
     * <pre>
     * LocalTime added = dt.plusHours(6);
     * LocalTime added = dt.plus(Period.hours(6));
     * LocalTime added = dt.withFieldAdded(DurationFieldType.hours(), 6);
     * </pre>
     *
     * @param hours  the amount of hours to add, may be negative
     * @return the new LocalTime plus the increased hours
     */
    public LocalTime plusHours(int hours) {try{__CLR4_4_12rb2rblc8azs5e.R.inc(3808);
        __CLR4_4_12rb2rblc8azs5e.R.inc(3809);if ((((hours == 0)&&(__CLR4_4_12rb2rblc8azs5e.R.iget(3810)!=0|true))||(__CLR4_4_12rb2rblc8azs5e.R.iget(3811)==0&false))) {{
            __CLR4_4_12rb2rblc8azs5e.R.inc(3812);return this;
        }
        }__CLR4_4_12rb2rblc8azs5e.R.inc(3813);long instant = getChronology().hours().add(getLocalMillis(), hours);
        __CLR4_4_12rb2rblc8azs5e.R.inc(3814);return withLocalMillis(instant);
    }finally{__CLR4_4_12rb2rblc8azs5e.R.flushNeeded();}}

    /**
     * Returns a copy of this time plus the specified number of minutes.
     * <p>
     * This LocalTime instance is immutable and unaffected by this method call.
     * <p>
     * The following three lines are identical in effect:
     * <pre>
     * LocalTime added = dt.plusMinutes(6);
     * LocalTime added = dt.plus(Period.minutes(6));
     * LocalTime added = dt.withFieldAdded(DurationFieldType.minutes(), 6);
     * </pre>
     *
     * @param minutes  the amount of minutes to add, may be negative
     * @return the new LocalTime plus the increased minutes
     */
    public LocalTime plusMinutes(int minutes) {try{__CLR4_4_12rb2rblc8azs5e.R.inc(3815);
        __CLR4_4_12rb2rblc8azs5e.R.inc(3816);if ((((minutes == 0)&&(__CLR4_4_12rb2rblc8azs5e.R.iget(3817)!=0|true))||(__CLR4_4_12rb2rblc8azs5e.R.iget(3818)==0&false))) {{
            __CLR4_4_12rb2rblc8azs5e.R.inc(3819);return this;
        }
        }__CLR4_4_12rb2rblc8azs5e.R.inc(3820);long instant = getChronology().minutes().add(getLocalMillis(), minutes);
        __CLR4_4_12rb2rblc8azs5e.R.inc(3821);return withLocalMillis(instant);
    }finally{__CLR4_4_12rb2rblc8azs5e.R.flushNeeded();}}

    /**
     * Returns a copy of this time plus the specified number of seconds.
     * <p>
     * This LocalTime instance is immutable and unaffected by this method call.
     * <p>
     * The following three lines are identical in effect:
     * <pre>
     * LocalTime added = dt.plusSeconds(6);
     * LocalTime added = dt.plus(Period.seconds(6));
     * LocalTime added = dt.withFieldAdded(DurationFieldType.seconds(), 6);
     * </pre>
     *
     * @param seconds  the amount of seconds to add, may be negative
     * @return the new LocalTime plus the increased seconds
     */
    public LocalTime plusSeconds(int seconds) {try{__CLR4_4_12rb2rblc8azs5e.R.inc(3822);
        __CLR4_4_12rb2rblc8azs5e.R.inc(3823);if ((((seconds == 0)&&(__CLR4_4_12rb2rblc8azs5e.R.iget(3824)!=0|true))||(__CLR4_4_12rb2rblc8azs5e.R.iget(3825)==0&false))) {{
            __CLR4_4_12rb2rblc8azs5e.R.inc(3826);return this;
        }
        }__CLR4_4_12rb2rblc8azs5e.R.inc(3827);long instant = getChronology().seconds().add(getLocalMillis(), seconds);
        __CLR4_4_12rb2rblc8azs5e.R.inc(3828);return withLocalMillis(instant);
    }finally{__CLR4_4_12rb2rblc8azs5e.R.flushNeeded();}}

    /**
     * Returns a copy of this time plus the specified number of millis.
     * <p>
     * This LocalTime instance is immutable and unaffected by this method call.
     * <p>
     * The following three lines are identical in effect:
     * <pre>
     * LocalTime added = dt.plusMillis(6);
     * LocalTime added = dt.plus(Period.millis(6));
     * LocalTime added = dt.withFieldAdded(DurationFieldType.millis(), 6);
     * </pre>
     *
     * @param millis  the amount of millis to add, may be negative
     * @return the new LocalTime plus the increased millis
     */
    public LocalTime plusMillis(int millis) {try{__CLR4_4_12rb2rblc8azs5e.R.inc(3829);
        __CLR4_4_12rb2rblc8azs5e.R.inc(3830);if ((((millis == 0)&&(__CLR4_4_12rb2rblc8azs5e.R.iget(3831)!=0|true))||(__CLR4_4_12rb2rblc8azs5e.R.iget(3832)==0&false))) {{
            __CLR4_4_12rb2rblc8azs5e.R.inc(3833);return this;
        }
        }__CLR4_4_12rb2rblc8azs5e.R.inc(3834);long instant = getChronology().millis().add(getLocalMillis(), millis);
        __CLR4_4_12rb2rblc8azs5e.R.inc(3835);return withLocalMillis(instant);
    }finally{__CLR4_4_12rb2rblc8azs5e.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Returns a copy of this time with the specified period taken away.
     * <p>
     * If the amount is zero or null, then <code>this</code> is returned.
     * <p>
     * This method is typically used to subtract complex period instances.
     * Subtracting one field is best achieved using methods
     * like {@link #minusHours(int)}.
     * 
     * @param period  the period to reduce this instant by
     * @return a copy of this time with the period taken away
     * @throws ArithmeticException if the result exceeds the internal capacity
     */
    public LocalTime minus(ReadablePeriod period) {try{__CLR4_4_12rb2rblc8azs5e.R.inc(3836);
        __CLR4_4_12rb2rblc8azs5e.R.inc(3837);return withPeriodAdded(period, -1);
    }finally{__CLR4_4_12rb2rblc8azs5e.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Returns a copy of this time minus the specified number of hours.
     * <p>
     * This LocalTime instance is immutable and unaffected by this method call.
     * <p>
     * The following three lines are identical in effect:
     * <pre>
     * LocalTime subtracted = dt.minusHours(6);
     * LocalTime subtracted = dt.minus(Period.hours(6));
     * LocalTime subtracted = dt.withFieldAdded(DurationFieldType.hours(), -6);
     * </pre>
     *
     * @param hours  the amount of hours to subtract, may be negative
     * @return the new LocalTime minus the increased hours
     */
    public LocalTime minusHours(int hours) {try{__CLR4_4_12rb2rblc8azs5e.R.inc(3838);
        __CLR4_4_12rb2rblc8azs5e.R.inc(3839);if ((((hours == 0)&&(__CLR4_4_12rb2rblc8azs5e.R.iget(3840)!=0|true))||(__CLR4_4_12rb2rblc8azs5e.R.iget(3841)==0&false))) {{
            __CLR4_4_12rb2rblc8azs5e.R.inc(3842);return this;
        }
        }__CLR4_4_12rb2rblc8azs5e.R.inc(3843);long instant = getChronology().hours().subtract(getLocalMillis(), hours);
        __CLR4_4_12rb2rblc8azs5e.R.inc(3844);return withLocalMillis(instant);
    }finally{__CLR4_4_12rb2rblc8azs5e.R.flushNeeded();}}

    /**
     * Returns a copy of this time minus the specified number of minutes.
     * <p>
     * This LocalTime instance is immutable and unaffected by this method call.
     * <p>
     * The following three lines are identical in effect:
     * <pre>
     * LocalTime subtracted = dt.minusMinutes(6);
     * LocalTime subtracted = dt.minus(Period.minutes(6));
     * LocalTime subtracted = dt.withFieldAdded(DurationFieldType.minutes(), -6);
     * </pre>
     *
     * @param minutes  the amount of minutes to subtract, may be negative
     * @return the new LocalTime minus the increased minutes
     */
    public LocalTime minusMinutes(int minutes) {try{__CLR4_4_12rb2rblc8azs5e.R.inc(3845);
        __CLR4_4_12rb2rblc8azs5e.R.inc(3846);if ((((minutes == 0)&&(__CLR4_4_12rb2rblc8azs5e.R.iget(3847)!=0|true))||(__CLR4_4_12rb2rblc8azs5e.R.iget(3848)==0&false))) {{
            __CLR4_4_12rb2rblc8azs5e.R.inc(3849);return this;
        }
        }__CLR4_4_12rb2rblc8azs5e.R.inc(3850);long instant = getChronology().minutes().subtract(getLocalMillis(), minutes);
        __CLR4_4_12rb2rblc8azs5e.R.inc(3851);return withLocalMillis(instant);
    }finally{__CLR4_4_12rb2rblc8azs5e.R.flushNeeded();}}

    /**
     * Returns a copy of this time minus the specified number of seconds.
     * <p>
     * This LocalTime instance is immutable and unaffected by this method call.
     * <p>
     * The following three lines are identical in effect:
     * <pre>
     * LocalTime subtracted = dt.minusSeconds(6);
     * LocalTime subtracted = dt.minus(Period.seconds(6));
     * LocalTime subtracted = dt.withFieldAdded(DurationFieldType.seconds(), -6);
     * </pre>
     *
     * @param seconds  the amount of seconds to subtract, may be negative
     * @return the new LocalTime minus the increased seconds
     */
    public LocalTime minusSeconds(int seconds) {try{__CLR4_4_12rb2rblc8azs5e.R.inc(3852);
        __CLR4_4_12rb2rblc8azs5e.R.inc(3853);if ((((seconds == 0)&&(__CLR4_4_12rb2rblc8azs5e.R.iget(3854)!=0|true))||(__CLR4_4_12rb2rblc8azs5e.R.iget(3855)==0&false))) {{
            __CLR4_4_12rb2rblc8azs5e.R.inc(3856);return this;
        }
        }__CLR4_4_12rb2rblc8azs5e.R.inc(3857);long instant = getChronology().seconds().subtract(getLocalMillis(), seconds);
        __CLR4_4_12rb2rblc8azs5e.R.inc(3858);return withLocalMillis(instant);
    }finally{__CLR4_4_12rb2rblc8azs5e.R.flushNeeded();}}

    /**
     * Returns a copy of this time minus the specified number of millis.
     * <p>
     * This LocalTime instance is immutable and unaffected by this method call.
     * <p>
     * The following three lines are identical in effect:
     * <pre>
     * LocalTime subtracted = dt.minusMillis(6);
     * LocalTime subtracted = dt.minus(Period.millis(6));
     * LocalTime subtracted = dt.withFieldAdded(DurationFieldType.millis(), -6);
     * </pre>
     *
     * @param millis  the amount of millis to subtract, may be negative
     * @return the new LocalTime minus the increased millis
     */
    public LocalTime minusMillis(int millis) {try{__CLR4_4_12rb2rblc8azs5e.R.inc(3859);
        __CLR4_4_12rb2rblc8azs5e.R.inc(3860);if ((((millis == 0)&&(__CLR4_4_12rb2rblc8azs5e.R.iget(3861)!=0|true))||(__CLR4_4_12rb2rblc8azs5e.R.iget(3862)==0&false))) {{
            __CLR4_4_12rb2rblc8azs5e.R.inc(3863);return this;
        }
        }__CLR4_4_12rb2rblc8azs5e.R.inc(3864);long instant = getChronology().millis().subtract(getLocalMillis(), millis);
        __CLR4_4_12rb2rblc8azs5e.R.inc(3865);return withLocalMillis(instant);
    }finally{__CLR4_4_12rb2rblc8azs5e.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Gets the property object for the specified type, which contains
     * many useful methods.
     *
     * @param fieldType  the field type to get the chronology for
     * @return the property object
     * @throws IllegalArgumentException if the field is null or unsupported
     */
    public Property property(DateTimeFieldType fieldType) {try{__CLR4_4_12rb2rblc8azs5e.R.inc(3866);
        __CLR4_4_12rb2rblc8azs5e.R.inc(3867);if ((((fieldType == null)&&(__CLR4_4_12rb2rblc8azs5e.R.iget(3868)!=0|true))||(__CLR4_4_12rb2rblc8azs5e.R.iget(3869)==0&false))) {{
            __CLR4_4_12rb2rblc8azs5e.R.inc(3870);throw new IllegalArgumentException("The DateTimeFieldType must not be null");
        }
        }__CLR4_4_12rb2rblc8azs5e.R.inc(3871);if ((((isSupported(fieldType) == false)&&(__CLR4_4_12rb2rblc8azs5e.R.iget(3872)!=0|true))||(__CLR4_4_12rb2rblc8azs5e.R.iget(3873)==0&false))) {{
            __CLR4_4_12rb2rblc8azs5e.R.inc(3874);throw new IllegalArgumentException("Field '" + fieldType + "' is not supported");
        }
        }__CLR4_4_12rb2rblc8azs5e.R.inc(3875);return new Property(this, fieldType.getField(getChronology()));
    }finally{__CLR4_4_12rb2rblc8azs5e.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Get the hour of day field value.
     *
     * @return the hour of day
     */
    public int getHourOfDay() {try{__CLR4_4_12rb2rblc8azs5e.R.inc(3876);
        __CLR4_4_12rb2rblc8azs5e.R.inc(3877);return getChronology().hourOfDay().get(getLocalMillis());
    }finally{__CLR4_4_12rb2rblc8azs5e.R.flushNeeded();}}

    /**
     * Get the minute of hour field value.
     *
     * @return the minute of hour
     */
    public int getMinuteOfHour() {try{__CLR4_4_12rb2rblc8azs5e.R.inc(3878);
        __CLR4_4_12rb2rblc8azs5e.R.inc(3879);return getChronology().minuteOfHour().get(getLocalMillis());
    }finally{__CLR4_4_12rb2rblc8azs5e.R.flushNeeded();}}

    /**
     * Get the second of minute field value.
     *
     * @return the second of minute
     */
    public int getSecondOfMinute() {try{__CLR4_4_12rb2rblc8azs5e.R.inc(3880);
        __CLR4_4_12rb2rblc8azs5e.R.inc(3881);return getChronology().secondOfMinute().get(getLocalMillis());
    }finally{__CLR4_4_12rb2rblc8azs5e.R.flushNeeded();}}

    /**
     * Get the millis of second field value.
     *
     * @return the millis of second
     */
    public int getMillisOfSecond() {try{__CLR4_4_12rb2rblc8azs5e.R.inc(3882);
        __CLR4_4_12rb2rblc8azs5e.R.inc(3883);return getChronology().millisOfSecond().get(getLocalMillis());
    }finally{__CLR4_4_12rb2rblc8azs5e.R.flushNeeded();}}

    /**
     * Get the millis of day field value.
     *
     * @return the millis of day
     */
    public int getMillisOfDay() {try{__CLR4_4_12rb2rblc8azs5e.R.inc(3884);
        __CLR4_4_12rb2rblc8azs5e.R.inc(3885);return getChronology().millisOfDay().get(getLocalMillis());
    }finally{__CLR4_4_12rb2rblc8azs5e.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Returns a copy of this time with the hour of day field updated.
     * <p>
     * LocalTime is immutable, so there are no set methods.
     * Instead, this method returns a new instance with the value of
     * hour of day changed.
     *
     * @param hour  the hour of day to set
     * @return a copy of this object with the field set
     * @throws IllegalArgumentException if the value is invalid
     */
    public LocalTime withHourOfDay(int hour) {try{__CLR4_4_12rb2rblc8azs5e.R.inc(3886);
        __CLR4_4_12rb2rblc8azs5e.R.inc(3887);return withLocalMillis(getChronology().hourOfDay().set(getLocalMillis(), hour));
    }finally{__CLR4_4_12rb2rblc8azs5e.R.flushNeeded();}}

    /**
     * Returns a copy of this time with the minute of hour field updated.
     * <p>
     * LocalTime is immutable, so there are no set methods.
     * Instead, this method returns a new instance with the value of
     * minute of hour changed.
     *
     * @param minute  the minute of hour to set
     * @return a copy of this object with the field set
     * @throws IllegalArgumentException if the value is invalid
     */
    public LocalTime withMinuteOfHour(int minute) {try{__CLR4_4_12rb2rblc8azs5e.R.inc(3888);
        __CLR4_4_12rb2rblc8azs5e.R.inc(3889);return withLocalMillis(getChronology().minuteOfHour().set(getLocalMillis(), minute));
    }finally{__CLR4_4_12rb2rblc8azs5e.R.flushNeeded();}}

    /**
     * Returns a copy of this time with the second of minute field updated.
     * <p>
     * LocalTime is immutable, so there are no set methods.
     * Instead, this method returns a new instance with the value of
     * second of minute changed.
     *
     * @param second  the second of minute to set
     * @return a copy of this object with the field set
     * @throws IllegalArgumentException if the value is invalid
     */
    public LocalTime withSecondOfMinute(int second) {try{__CLR4_4_12rb2rblc8azs5e.R.inc(3890);
        __CLR4_4_12rb2rblc8azs5e.R.inc(3891);return withLocalMillis(getChronology().secondOfMinute().set(getLocalMillis(), second));
    }finally{__CLR4_4_12rb2rblc8azs5e.R.flushNeeded();}}

    /**
     * Returns a copy of this time with the millis of second field updated.
     * <p>
     * LocalTime is immutable, so there are no set methods.
     * Instead, this method returns a new instance with the value of
     * millis of second changed.
     *
     * @param millis  the millis of second to set
     * @return a copy of this object with the field set
     * @throws IllegalArgumentException if the value is invalid
     */
    public LocalTime withMillisOfSecond(int millis) {try{__CLR4_4_12rb2rblc8azs5e.R.inc(3892);
        __CLR4_4_12rb2rblc8azs5e.R.inc(3893);return withLocalMillis(getChronology().millisOfSecond().set(getLocalMillis(), millis));
    }finally{__CLR4_4_12rb2rblc8azs5e.R.flushNeeded();}}

    /**
     * Returns a copy of this time with the millis of day field updated.
     * <p>
     * LocalTime is immutable, so there are no set methods.
     * Instead, this method returns a new instance with the value of
     * millis of day changed.
     *
     * @param millis  the millis of day to set
     * @return a copy of this object with the field set
     * @throws IllegalArgumentException if the value is invalid
     */
    public LocalTime withMillisOfDay(int millis) {try{__CLR4_4_12rb2rblc8azs5e.R.inc(3894);
        __CLR4_4_12rb2rblc8azs5e.R.inc(3895);return withLocalMillis(getChronology().millisOfDay().set(getLocalMillis(), millis));
    }finally{__CLR4_4_12rb2rblc8azs5e.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Get the hour of day field property which provides access to advanced functionality.
     * 
     * @return the hour of day property
     */
    public Property hourOfDay() {try{__CLR4_4_12rb2rblc8azs5e.R.inc(3896);
        __CLR4_4_12rb2rblc8azs5e.R.inc(3897);return new Property(this, getChronology().hourOfDay());
    }finally{__CLR4_4_12rb2rblc8azs5e.R.flushNeeded();}}

    /**
     * Get the minute of hour field property which provides access to advanced functionality.
     * 
     * @return the minute of hour property
     */
    public Property minuteOfHour() {try{__CLR4_4_12rb2rblc8azs5e.R.inc(3898);
        __CLR4_4_12rb2rblc8azs5e.R.inc(3899);return new Property(this, getChronology().minuteOfHour());
    }finally{__CLR4_4_12rb2rblc8azs5e.R.flushNeeded();}}

    /**
     * Get the second of minute field property which provides access to advanced functionality.
     * 
     * @return the second of minute property
     */
    public Property secondOfMinute() {try{__CLR4_4_12rb2rblc8azs5e.R.inc(3900);
        __CLR4_4_12rb2rblc8azs5e.R.inc(3901);return new Property(this, getChronology().secondOfMinute());
    }finally{__CLR4_4_12rb2rblc8azs5e.R.flushNeeded();}}

    /**
     * Get the millis of second property which provides access to advanced functionality.
     * 
     * @return the millis of second property
     */
    public Property millisOfSecond() {try{__CLR4_4_12rb2rblc8azs5e.R.inc(3902);
        __CLR4_4_12rb2rblc8azs5e.R.inc(3903);return new Property(this, getChronology().millisOfSecond());
    }finally{__CLR4_4_12rb2rblc8azs5e.R.flushNeeded();}}

    /**
     * Get the millis of day property which provides access to advanced functionality.
     * 
     * @return the millis of day property
     */
    public Property millisOfDay() {try{__CLR4_4_12rb2rblc8azs5e.R.inc(3904);
        __CLR4_4_12rb2rblc8azs5e.R.inc(3905);return new Property(this, getChronology().millisOfDay());
    }finally{__CLR4_4_12rb2rblc8azs5e.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Converts this LocalTime to a full datetime using the default time zone
     * setting the time fields from this instance and the date fields from
     * the current date.
     *
     * @return this time as a datetime using todays date
     */
    public DateTime toDateTimeToday() {try{__CLR4_4_12rb2rblc8azs5e.R.inc(3906);
        __CLR4_4_12rb2rblc8azs5e.R.inc(3907);return toDateTimeToday(null);
    }finally{__CLR4_4_12rb2rblc8azs5e.R.flushNeeded();}}

    /**
     * Converts this LocalTime to a full datetime using the specified time zone
     * setting the time fields from this instance and the date fields from
     * the current time.
     * <p>
     * This method uses the chronology from this instance plus the time zone
     * specified.
     *
     * @param zone  the zone to use, null means default
     * @return this time as a datetime using todays date
     */
    public DateTime toDateTimeToday(DateTimeZone zone) {try{__CLR4_4_12rb2rblc8azs5e.R.inc(3908);
        __CLR4_4_12rb2rblc8azs5e.R.inc(3909);Chronology chrono = getChronology().withZone(zone);
        __CLR4_4_12rb2rblc8azs5e.R.inc(3910);long instantMillis = DateTimeUtils.currentTimeMillis();
        __CLR4_4_12rb2rblc8azs5e.R.inc(3911);long resolved = chrono.set(this, instantMillis);
        __CLR4_4_12rb2rblc8azs5e.R.inc(3912);return new DateTime(resolved, chrono);
    }finally{__CLR4_4_12rb2rblc8azs5e.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Output the time in ISO8601 format (HH:mm:ss.SSS).
     * 
     * @return ISO8601 time formatted string.
     */
    @ToString
    public String toString() {try{__CLR4_4_12rb2rblc8azs5e.R.inc(3913);
        __CLR4_4_12rb2rblc8azs5e.R.inc(3914);return ISODateTimeFormat.time().print(this);
    }finally{__CLR4_4_12rb2rblc8azs5e.R.flushNeeded();}}

    /**
     * Output the time using the specified format pattern.
     *
     * @param pattern  the pattern specification, null means use <code>toString</code>
     * @see org.joda.time.format.DateTimeFormat
     */
    public String toString(String pattern) {try{__CLR4_4_12rb2rblc8azs5e.R.inc(3915);
        __CLR4_4_12rb2rblc8azs5e.R.inc(3916);if ((((pattern == null)&&(__CLR4_4_12rb2rblc8azs5e.R.iget(3917)!=0|true))||(__CLR4_4_12rb2rblc8azs5e.R.iget(3918)==0&false))) {{
            __CLR4_4_12rb2rblc8azs5e.R.inc(3919);return toString();
        }
        }__CLR4_4_12rb2rblc8azs5e.R.inc(3920);return DateTimeFormat.forPattern(pattern).print(this);
    }finally{__CLR4_4_12rb2rblc8azs5e.R.flushNeeded();}}

    /**
     * Output the time using the specified format pattern.
     *
     * @param pattern  the pattern specification, null means use <code>toString</code>
     * @param locale  Locale to use, null means default
     * @see org.joda.time.format.DateTimeFormat
     */
    public String toString(String pattern, Locale locale) throws IllegalArgumentException {try{__CLR4_4_12rb2rblc8azs5e.R.inc(3921);
        __CLR4_4_12rb2rblc8azs5e.R.inc(3922);if ((((pattern == null)&&(__CLR4_4_12rb2rblc8azs5e.R.iget(3923)!=0|true))||(__CLR4_4_12rb2rblc8azs5e.R.iget(3924)==0&false))) {{
            __CLR4_4_12rb2rblc8azs5e.R.inc(3925);return toString();
        }
        }__CLR4_4_12rb2rblc8azs5e.R.inc(3926);return DateTimeFormat.forPattern(pattern).withLocale(locale).print(this);
    }finally{__CLR4_4_12rb2rblc8azs5e.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * LocalTime.Property binds a LocalTime to a DateTimeField allowing
     * powerful datetime functionality to be easily accessed.
     * <p>
     * The simplest use of this class is as an alternative get method, here used to
     * get the minute '30'.
     * <pre>
     * LocalTime dt = new LocalTime(12, 30);
     * int year = dt.minuteOfHour().get();
     * </pre>
     * <p>
     * Methods are also provided that allow time modification. These return
     * new instances of LocalTime - they do not modify the original. The example
     * below yields two independent immutable date objects 2 hours apart.
     * <pre>
     * LocalTime dt1230 = new LocalTime(12, 30);
     * LocalTime dt1430 = dt1230.hourOfDay().setCopy(14);
     * </pre>
     * <p>
     * LocalTime.Property itself is thread-safe and immutable, as well as the
     * LocalTime being operated on.
     *
     * @author Stephen Colebourne
     * @author Brian S O'Neill
     * @since 1.3
     */
    public static final class Property extends AbstractReadableInstantFieldProperty {
        
        /** Serialization version */
        private static final long serialVersionUID = -325842547277223L;
        
        /** The instant this property is working against */
        private transient LocalTime iInstant;
        /** The field this property is working against */
        private transient DateTimeField iField;
        
        /**
         * Constructor.
         * 
         * @param instant  the instant to set
         * @param field  the field to use
         */
        Property(LocalTime instant, DateTimeField field) {
            super();__CLR4_4_12rb2rblc8azs5e.R.inc(3928);try{__CLR4_4_12rb2rblc8azs5e.R.inc(3927);
            __CLR4_4_12rb2rblc8azs5e.R.inc(3929);iInstant = instant;
            __CLR4_4_12rb2rblc8azs5e.R.inc(3930);iField = field;
        }finally{__CLR4_4_12rb2rblc8azs5e.R.flushNeeded();}}
        
        /**
         * Writes the property in a safe serialization format.
         */
        private void writeObject(ObjectOutputStream oos) throws IOException {try{__CLR4_4_12rb2rblc8azs5e.R.inc(3931);
            __CLR4_4_12rb2rblc8azs5e.R.inc(3932);oos.writeObject(iInstant);
            __CLR4_4_12rb2rblc8azs5e.R.inc(3933);oos.writeObject(iField.getType());
        }finally{__CLR4_4_12rb2rblc8azs5e.R.flushNeeded();}}
        
        /**
         * Reads the property from a safe serialization format.
         */
        private void readObject(ObjectInputStream oos) throws IOException, ClassNotFoundException {try{__CLR4_4_12rb2rblc8azs5e.R.inc(3934);
            __CLR4_4_12rb2rblc8azs5e.R.inc(3935);iInstant = (LocalTime) oos.readObject();
            __CLR4_4_12rb2rblc8azs5e.R.inc(3936);DateTimeFieldType type = (DateTimeFieldType) oos.readObject();
            __CLR4_4_12rb2rblc8azs5e.R.inc(3937);iField = type.getField(iInstant.getChronology());
        }finally{__CLR4_4_12rb2rblc8azs5e.R.flushNeeded();}}
        
        //-----------------------------------------------------------------------
        /**
         * Gets the field being used.
         * 
         * @return the field
         */
        public DateTimeField getField() {try{__CLR4_4_12rb2rblc8azs5e.R.inc(3938);
            __CLR4_4_12rb2rblc8azs5e.R.inc(3939);return iField;
        }finally{__CLR4_4_12rb2rblc8azs5e.R.flushNeeded();}}
        
        /**
         * Gets the milliseconds of the time that this property is linked to.
         * 
         * @return the milliseconds
         */
        protected long getMillis() {try{__CLR4_4_12rb2rblc8azs5e.R.inc(3940);
            __CLR4_4_12rb2rblc8azs5e.R.inc(3941);return iInstant.getLocalMillis();
        }finally{__CLR4_4_12rb2rblc8azs5e.R.flushNeeded();}}
        
        /**
         * Gets the chronology of the datetime that this property is linked to.
         * 
         * @return the chronology
         * @since 1.4
         */
        protected Chronology getChronology() {try{__CLR4_4_12rb2rblc8azs5e.R.inc(3942);
            __CLR4_4_12rb2rblc8azs5e.R.inc(3943);return iInstant.getChronology();
        }finally{__CLR4_4_12rb2rblc8azs5e.R.flushNeeded();}}
        
        /**
         * Gets the LocalTime object linked to this property.
         * 
         * @return the linked LocalTime
         */
        public LocalTime getLocalTime() {try{__CLR4_4_12rb2rblc8azs5e.R.inc(3944);
            __CLR4_4_12rb2rblc8azs5e.R.inc(3945);return iInstant;
        }finally{__CLR4_4_12rb2rblc8azs5e.R.flushNeeded();}}
        
        //-----------------------------------------------------------------------
        /**
         * Adds to this field in a copy of this LocalTime.
         * <p>
         * The LocalTime attached to this property is unchanged by this call.
         *
         * @param value  the value to add to the field in the copy
         * @return a copy of the LocalTime with the field value changed
         */
        public LocalTime addCopy(int value) {try{__CLR4_4_12rb2rblc8azs5e.R.inc(3946);
            __CLR4_4_12rb2rblc8azs5e.R.inc(3947);return iInstant.withLocalMillis(iField.add(iInstant.getLocalMillis(), value));
        }finally{__CLR4_4_12rb2rblc8azs5e.R.flushNeeded();}}
        
        /**
         * Adds to this field in a copy of this LocalTime.
         * If the addition exceeds the maximum value (eg. 23:59) it will
         * wrap to the minimum value (eg. 00:00).
         * <p>
         * The LocalTime attached to this property is unchanged by this call.
         *
         * @param value  the value to add to the field in the copy
         * @return a copy of the LocalTime with the field value changed
         */
        public LocalTime addCopy(long value) {try{__CLR4_4_12rb2rblc8azs5e.R.inc(3948);
            __CLR4_4_12rb2rblc8azs5e.R.inc(3949);return iInstant.withLocalMillis(iField.add(iInstant.getLocalMillis(), value));
        }finally{__CLR4_4_12rb2rblc8azs5e.R.flushNeeded();}}
        
        /**
         * Adds to this field in a copy of this LocalTime.
         * If the addition exceeds the maximum value (eg. 23:59) then
         * an exception will be thrown.
         * Contrast this behaviour to {@link #addCopy(int)}.
         * <p>
         * The LocalTime attached to this property is unchanged by this call.
         *
         * @param value  the value to add to the field in the copy
         * @return a copy of the LocalTime with the field value changed
         * @throws IllegalArgumentException if the result is invalid
         */
        public LocalTime addNoWrapToCopy(int value) {try{__CLR4_4_12rb2rblc8azs5e.R.inc(3950);
            __CLR4_4_12rb2rblc8azs5e.R.inc(3951);long millis = iField.add(iInstant.getLocalMillis(), value);
            __CLR4_4_12rb2rblc8azs5e.R.inc(3952);long rounded = iInstant.getChronology().millisOfDay().get(millis);
            __CLR4_4_12rb2rblc8azs5e.R.inc(3953);if ((((rounded != millis)&&(__CLR4_4_12rb2rblc8azs5e.R.iget(3954)!=0|true))||(__CLR4_4_12rb2rblc8azs5e.R.iget(3955)==0&false))) {{
                __CLR4_4_12rb2rblc8azs5e.R.inc(3956);throw new IllegalArgumentException("The addition exceeded the boundaries of LocalTime");
            }
            }__CLR4_4_12rb2rblc8azs5e.R.inc(3957);return iInstant.withLocalMillis(millis);
        }finally{__CLR4_4_12rb2rblc8azs5e.R.flushNeeded();}}
        
        /**
         * Adds to this field, possibly wrapped, in a copy of this LocalTime.
         * A field wrapped operation only changes this field.
         * Thus 10:59 plusWrapField one minute goes to 10:00.
         * <p>
         * The LocalTime attached to this property is unchanged by this call.
         *
         * @param value  the value to add to the field in the copy
         * @return a copy of the LocalTime with the field value changed
         * @throws IllegalArgumentException if the value isn't valid
         */
        public LocalTime addWrapFieldToCopy(int value) {try{__CLR4_4_12rb2rblc8azs5e.R.inc(3958);
            __CLR4_4_12rb2rblc8azs5e.R.inc(3959);return iInstant.withLocalMillis(iField.addWrapField(iInstant.getLocalMillis(), value));
        }finally{__CLR4_4_12rb2rblc8azs5e.R.flushNeeded();}}
        
        //-----------------------------------------------------------------------
        /**
         * Sets this field in a copy of the LocalTime.
         * <p>
         * The LocalTime attached to this property is unchanged by this call.
         *
         * @param value  the value to set the field in the copy to
         * @return a copy of the LocalTime with the field value changed
         * @throws IllegalArgumentException if the value isn't valid
         */
        public LocalTime setCopy(int value) {try{__CLR4_4_12rb2rblc8azs5e.R.inc(3960);
            __CLR4_4_12rb2rblc8azs5e.R.inc(3961);return iInstant.withLocalMillis(iField.set(iInstant.getLocalMillis(), value));
        }finally{__CLR4_4_12rb2rblc8azs5e.R.flushNeeded();}}
        
        /**
         * Sets this field in a copy of the LocalTime to a parsed text value.
         * <p>
         * The LocalTime attached to this property is unchanged by this call.
         *
         * @param text  the text value to set
         * @param locale  optional locale to use for selecting a text symbol
         * @return a copy of the LocalTime with the field value changed
         * @throws IllegalArgumentException if the text value isn't valid
         */
        public LocalTime setCopy(String text, Locale locale) {try{__CLR4_4_12rb2rblc8azs5e.R.inc(3962);
            __CLR4_4_12rb2rblc8azs5e.R.inc(3963);return iInstant.withLocalMillis(iField.set(iInstant.getLocalMillis(), text, locale));
        }finally{__CLR4_4_12rb2rblc8azs5e.R.flushNeeded();}}
        
        /**
         * Sets this field in a copy of the LocalTime to a parsed text value.
         * <p>
         * The LocalTime attached to this property is unchanged by this call.
         *
         * @param text  the text value to set
         * @return a copy of the LocalTime with the field value changed
         * @throws IllegalArgumentException if the text value isn't valid
         */
        public LocalTime setCopy(String text) {try{__CLR4_4_12rb2rblc8azs5e.R.inc(3964);
            __CLR4_4_12rb2rblc8azs5e.R.inc(3965);return setCopy(text, null);
        }finally{__CLR4_4_12rb2rblc8azs5e.R.flushNeeded();}}
        
        //-----------------------------------------------------------------------
        /**
         * Returns a new LocalTime with this field set to the maximum value
         * for this field.
         * <p>
         * The LocalTime attached to this property is unchanged by this call.
         *
         * @return a copy of the LocalTime with this field set to its maximum
         */
        public LocalTime withMaximumValue() {try{__CLR4_4_12rb2rblc8azs5e.R.inc(3966);
            __CLR4_4_12rb2rblc8azs5e.R.inc(3967);return setCopy(getMaximumValue());
        }finally{__CLR4_4_12rb2rblc8azs5e.R.flushNeeded();}}
        
        /**
         * Returns a new LocalTime with this field set to the minimum value
         * for this field.
         * <p>
         * The LocalTime attached to this property is unchanged by this call.
         *
         * @return a copy of the LocalTime with this field set to its minimum
         */
        public LocalTime withMinimumValue() {try{__CLR4_4_12rb2rblc8azs5e.R.inc(3968);
            __CLR4_4_12rb2rblc8azs5e.R.inc(3969);return setCopy(getMinimumValue());
        }finally{__CLR4_4_12rb2rblc8azs5e.R.flushNeeded();}}
        
        //-----------------------------------------------------------------------
        /**
         * Rounds to the lowest whole unit of this field on a copy of this
         * LocalTime.
         * <p>
         * For example, rounding floor on the hourOfDay field of a LocalTime
         * where the time is 10:30 would result in new LocalTime with the
         * time of 10:00.
         *
         * @return a copy of the LocalTime with the field value changed
         */
        public LocalTime roundFloorCopy() {try{__CLR4_4_12rb2rblc8azs5e.R.inc(3970);
            __CLR4_4_12rb2rblc8azs5e.R.inc(3971);return iInstant.withLocalMillis(iField.roundFloor(iInstant.getLocalMillis()));
        }finally{__CLR4_4_12rb2rblc8azs5e.R.flushNeeded();}}
        
        /**
         * Rounds to the highest whole unit of this field on a copy of this
         * LocalTime.
         * <p>
         * For example, rounding floor on the hourOfDay field of a LocalTime
         * where the time is 10:30 would result in new LocalTime with the
         * time of 11:00.
         *
         * @return a copy of the LocalTime with the field value changed
         */
        public LocalTime roundCeilingCopy() {try{__CLR4_4_12rb2rblc8azs5e.R.inc(3972);
            __CLR4_4_12rb2rblc8azs5e.R.inc(3973);return iInstant.withLocalMillis(iField.roundCeiling(iInstant.getLocalMillis()));
        }finally{__CLR4_4_12rb2rblc8azs5e.R.flushNeeded();}}
        
        /**
         * Rounds to the nearest whole unit of this field on a copy of this
         * LocalTime, favoring the floor if halfway.
         *
         * @return a copy of the LocalTime with the field value changed
         */
        public LocalTime roundHalfFloorCopy() {try{__CLR4_4_12rb2rblc8azs5e.R.inc(3974);
            __CLR4_4_12rb2rblc8azs5e.R.inc(3975);return iInstant.withLocalMillis(iField.roundHalfFloor(iInstant.getLocalMillis()));
        }finally{__CLR4_4_12rb2rblc8azs5e.R.flushNeeded();}}
        
        /**
         * Rounds to the nearest whole unit of this field on a copy of this
         * LocalTime, favoring the ceiling if halfway.
         *
         * @return a copy of the LocalTime with the field value changed
         */
        public LocalTime roundHalfCeilingCopy() {try{__CLR4_4_12rb2rblc8azs5e.R.inc(3976);
            __CLR4_4_12rb2rblc8azs5e.R.inc(3977);return iInstant.withLocalMillis(iField.roundHalfCeiling(iInstant.getLocalMillis()));
        }finally{__CLR4_4_12rb2rblc8azs5e.R.flushNeeded();}}
        
        /**
         * Rounds to the nearest whole unit of this field on a copy of this
         * LocalTime.  If halfway, the ceiling is favored over the floor
         * only if it makes this field's value even.
         *
         * @return a copy of the LocalTime with the field value changed
         */
        public LocalTime roundHalfEvenCopy() {try{__CLR4_4_12rb2rblc8azs5e.R.inc(3978);
            __CLR4_4_12rb2rblc8azs5e.R.inc(3979);return iInstant.withLocalMillis(iField.roundHalfEven(iInstant.getLocalMillis()));
        }finally{__CLR4_4_12rb2rblc8azs5e.R.flushNeeded();}}
    }

}
