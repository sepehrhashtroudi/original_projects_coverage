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
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

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
 * LocalDateTime is an unmodifiable datetime class representing a
 * datetime without a time zone.
 * <p>
 * LocalDateTime implements the {@link ReadablePartial} interface.
 * To do this, certain methods focus on key fields Year, MonthOfYear,
 * DayOfYear and MillisOfDay.
 * However, <b>all</b> fields may in fact be queried.
 * <p>
 * Internally, LocalDateTime uses a single millisecond-based value to
 * represent the local datetime. This value is only used internally and
 * is not exposed to applications.
 * <p>
 * Calculations on LocalDateTime are performed using a {@link Chronology}.
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
 * LocalDateTime is thread-safe and immutable, provided that the Chronology is as well.
 * All standard Chronology classes supplied are thread-safe and immutable.
 *
 * @author Stephen Colebourne
 * @since 1.3
 */
@java.lang.SuppressWarnings({"fallthrough"}) public final class LocalDateTime
        extends BaseLocal
        implements ReadablePartial, Serializable {public static class __CLR4_4_12bl2bllc8azs3x{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672271027956L,8589935092L,3575,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** Serialization lock */
    private static final long serialVersionUID = -268716875315837168L;

    /** The index of the year field in the field array */
    private static final int YEAR = 0;
    /** The index of the monthOfYear field in the field array */
    private static final int MONTH_OF_YEAR = 1;
    /** The index of the dayOfMonth field in the field array */
    private static final int DAY_OF_MONTH = 2;
    /** The index of the millis field in the field array */
    private static final int MILLIS_OF_DAY = 3;

    /** The local millis from 1970-01-01T00:00:00 */
    private final long iLocalMillis;
    /** The chronology to use in UTC */
    private final Chronology iChronology;

    //-----------------------------------------------------------------------
    /**
     * Obtains a {@code LocalDateTime} set to the current system millisecond time
     * using <code>ISOChronology</code> in the default time zone.
     * The resulting object does not use the zone.
     * 
     * @return the current date, not null
     * @since 2.0
     */
    public static LocalDateTime now() {try{__CLR4_4_12bl2bllc8azs3x.R.inc(3009);
        __CLR4_4_12bl2bllc8azs3x.R.inc(3010);return new LocalDateTime();
    }finally{__CLR4_4_12bl2bllc8azs3x.R.flushNeeded();}}

    /**
     * Obtains a {@code LocalDateTime} set to the current system millisecond time
     * using <code>ISOChronology</code> in the specified time zone.
     * The resulting object does not use the zone.
     *
     * @param zone  the time zone, not null
     * @return the current date, not null
     * @since 2.0
     */
    public static LocalDateTime now(DateTimeZone zone) {try{__CLR4_4_12bl2bllc8azs3x.R.inc(3011);
        __CLR4_4_12bl2bllc8azs3x.R.inc(3012);if ((((zone == null)&&(__CLR4_4_12bl2bllc8azs3x.R.iget(3013)!=0|true))||(__CLR4_4_12bl2bllc8azs3x.R.iget(3014)==0&false))) {{
            __CLR4_4_12bl2bllc8azs3x.R.inc(3015);throw new NullPointerException("Zone must not be null");
        }
        }__CLR4_4_12bl2bllc8azs3x.R.inc(3016);return new LocalDateTime(zone);
    }finally{__CLR4_4_12bl2bllc8azs3x.R.flushNeeded();}}

    /**
     * Obtains a {@code LocalDateTime} set to the current system millisecond time
     * using the specified chronology.
     * The resulting object does not use the zone.
     *
     * @param chronology  the chronology, not null
     * @return the current date, not null
     * @since 2.0
     */
    public static LocalDateTime now(Chronology chronology) {try{__CLR4_4_12bl2bllc8azs3x.R.inc(3017);
        __CLR4_4_12bl2bllc8azs3x.R.inc(3018);if ((((chronology == null)&&(__CLR4_4_12bl2bllc8azs3x.R.iget(3019)!=0|true))||(__CLR4_4_12bl2bllc8azs3x.R.iget(3020)==0&false))) {{
            __CLR4_4_12bl2bllc8azs3x.R.inc(3021);throw new NullPointerException("Chronology must not be null");
        }
        }__CLR4_4_12bl2bllc8azs3x.R.inc(3022);return new LocalDateTime(chronology);
    }finally{__CLR4_4_12bl2bllc8azs3x.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Parses a {@code LocalDateTime} from the specified string.
     * <p>
     * This uses {@link ISODateTimeFormat#localDateOptionalTimeParser()}.
     * 
     * @param str  the string to parse, not null
     * @since 2.0
     */
    @FromString
    public static LocalDateTime parse(String str) {try{__CLR4_4_12bl2bllc8azs3x.R.inc(3023);
        __CLR4_4_12bl2bllc8azs3x.R.inc(3024);return parse(str, ISODateTimeFormat.localDateOptionalTimeParser());
    }finally{__CLR4_4_12bl2bllc8azs3x.R.flushNeeded();}}

    /**
     * Parses a {@code LocalDateTime} from the specified string using a formatter.
     * 
     * @param str  the string to parse, not null
     * @param formatter  the formatter to use, not null
     * @since 2.0
     */
    public static LocalDateTime parse(String str, DateTimeFormatter formatter) {try{__CLR4_4_12bl2bllc8azs3x.R.inc(3025);
        __CLR4_4_12bl2bllc8azs3x.R.inc(3026);return formatter.parseLocalDateTime(str);
    }finally{__CLR4_4_12bl2bllc8azs3x.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Constructs a LocalDateTime from a <code>java.util.Calendar</code>
     * using exactly the same field values.
     * <p>
     * Each field is queried from the Calendar and assigned to the LocalDateTime.
     * This is useful if you have been using the Calendar as a local date,
     * ignoring the zone.
     * <p>
     * One advantage of this method is that this method is unaffected if the
     * version of the time zone data differs between the JDK and Joda-Time.
     * That is because the local field values are transferred, calculated using
     * the JDK time zone data and without using the Joda-Time time zone data.
     * <p>
     * This factory method ignores the type of the calendar and always
     * creates a LocalDateTime with ISO chronology. It is expected that you
     * will only pass in instances of <code>GregorianCalendar</code> however
     * this is not validated.
     *
     * @param calendar  the Calendar to extract fields from, not null
     * @return the created local date-time, not null
     * @throws IllegalArgumentException if the calendar is null
     * @throws IllegalArgumentException if the date is invalid for the ISO chronology
     */
    public static LocalDateTime fromCalendarFields(Calendar calendar) {try{__CLR4_4_12bl2bllc8azs3x.R.inc(3027);
        __CLR4_4_12bl2bllc8azs3x.R.inc(3028);if ((((calendar == null)&&(__CLR4_4_12bl2bllc8azs3x.R.iget(3029)!=0|true))||(__CLR4_4_12bl2bllc8azs3x.R.iget(3030)==0&false))) {{
            __CLR4_4_12bl2bllc8azs3x.R.inc(3031);throw new IllegalArgumentException("The calendar must not be null");
        }
        }__CLR4_4_12bl2bllc8azs3x.R.inc(3032);int era = calendar.get(Calendar.ERA);
        __CLR4_4_12bl2bllc8azs3x.R.inc(3033);int yearOfEra = calendar.get(Calendar.YEAR);
        __CLR4_4_12bl2bllc8azs3x.R.inc(3034);return new LocalDateTime(
            ((((era == GregorianCalendar.AD )&&(__CLR4_4_12bl2bllc8azs3x.R.iget(3035)!=0|true))||(__CLR4_4_12bl2bllc8azs3x.R.iget(3036)==0&false))? yearOfEra : 1 - yearOfEra),
            calendar.get(Calendar.MONTH) + 1,
            calendar.get(Calendar.DAY_OF_MONTH),
            calendar.get(Calendar.HOUR_OF_DAY),
            calendar.get(Calendar.MINUTE),
            calendar.get(Calendar.SECOND),
            calendar.get(Calendar.MILLISECOND)
        );
    }finally{__CLR4_4_12bl2bllc8azs3x.R.flushNeeded();}}

    /**
     * Constructs a LocalDateTime from a <code>java.util.Date</code>
     * using exactly the same field values.
     * <p>
     * Each field is queried from the Date and assigned to the LocalDateTime.
     * This is useful if you have been using the Date as a local date,
     * ignoring the zone.
     * <p>
     * One advantage of this method is that this method is unaffected if the
     * version of the time zone data differs between the JDK and Joda-Time.
     * That is because the local field values are transferred, calculated using
     * the JDK time zone data and without using the Joda-Time time zone data.
     * <p>
     * This factory method always creates a LocalDateTime with ISO chronology.
     *
     * @param date  the Date to extract fields from, not null
     * @return the created local date-time, not null
     * @throws IllegalArgumentException if the calendar is null
     * @throws IllegalArgumentException if the date is invalid for the ISO chronology
     */
    @SuppressWarnings("deprecation")
    public static LocalDateTime fromDateFields(Date date) {try{__CLR4_4_12bl2bllc8azs3x.R.inc(3037);
        __CLR4_4_12bl2bllc8azs3x.R.inc(3038);if ((((date == null)&&(__CLR4_4_12bl2bllc8azs3x.R.iget(3039)!=0|true))||(__CLR4_4_12bl2bllc8azs3x.R.iget(3040)==0&false))) {{
            __CLR4_4_12bl2bllc8azs3x.R.inc(3041);throw new IllegalArgumentException("The date must not be null");
        }
        }__CLR4_4_12bl2bllc8azs3x.R.inc(3042);if ((((date.getTime() < 0)&&(__CLR4_4_12bl2bllc8azs3x.R.iget(3043)!=0|true))||(__CLR4_4_12bl2bllc8azs3x.R.iget(3044)==0&false))) {{
            // handle years in era BC
            __CLR4_4_12bl2bllc8azs3x.R.inc(3045);GregorianCalendar cal = new GregorianCalendar();
            __CLR4_4_12bl2bllc8azs3x.R.inc(3046);cal.setTime(date);
            __CLR4_4_12bl2bllc8azs3x.R.inc(3047);return fromCalendarFields(cal);
        }
        }__CLR4_4_12bl2bllc8azs3x.R.inc(3048);return new LocalDateTime(
            date.getYear() + 1900,
            date.getMonth() + 1,
            date.getDate(),
            date.getHours(),
            date.getMinutes(),
            date.getSeconds(),
            (((int) (date.getTime() % 1000)) + 1000) % 1000
        );
    }finally{__CLR4_4_12bl2bllc8azs3x.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Constructs an instance set to the current local time evaluated using
     * ISO chronology in the default zone.
     * <p>
     * Once the constructor is completed, the zone is no longer used.
     * 
     * @see #now()
     */
    public LocalDateTime() {
        this(DateTimeUtils.currentTimeMillis(), ISOChronology.getInstance());__CLR4_4_12bl2bllc8azs3x.R.inc(3050);try{__CLR4_4_12bl2bllc8azs3x.R.inc(3049);
    }finally{__CLR4_4_12bl2bllc8azs3x.R.flushNeeded();}}

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
    public LocalDateTime(DateTimeZone zone) {
        this(DateTimeUtils.currentTimeMillis(), ISOChronology.getInstance(zone));__CLR4_4_12bl2bllc8azs3x.R.inc(3052);try{__CLR4_4_12bl2bllc8azs3x.R.inc(3051);
    }finally{__CLR4_4_12bl2bllc8azs3x.R.flushNeeded();}}

    /**
     * Constructs an instance set to the current local time evaluated using
     * specified chronology.
     * <p>
     * If the chronology is null, ISO chronology in the default time zone is used.
     * Once the constructor is completed, the zone is no longer used.
     *
     * @param chronology  the chronology, null means ISOChronology in default zone
     * @see #now(Chronology)
     */
    public LocalDateTime(Chronology chronology) {
        this(DateTimeUtils.currentTimeMillis(), chronology);__CLR4_4_12bl2bllc8azs3x.R.inc(3054);try{__CLR4_4_12bl2bllc8azs3x.R.inc(3053);
    }finally{__CLR4_4_12bl2bllc8azs3x.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Constructs an instance set to the local time defined by the specified
     * instant evaluated using ISO chronology in the default zone.
     * <p>
     * Once the constructor is completed, the zone is no longer used.
     *
     * @param instant  the milliseconds from 1970-01-01T00:00:00Z
     */
    public LocalDateTime(long instant) {
        this(instant, ISOChronology.getInstance());__CLR4_4_12bl2bllc8azs3x.R.inc(3056);try{__CLR4_4_12bl2bllc8azs3x.R.inc(3055);
    }finally{__CLR4_4_12bl2bllc8azs3x.R.flushNeeded();}}

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
    public LocalDateTime(long instant, DateTimeZone zone) {
        this(instant, ISOChronology.getInstance(zone));__CLR4_4_12bl2bllc8azs3x.R.inc(3058);try{__CLR4_4_12bl2bllc8azs3x.R.inc(3057);
    }finally{__CLR4_4_12bl2bllc8azs3x.R.flushNeeded();}}

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
    public LocalDateTime(long instant, Chronology chronology) {try{__CLR4_4_12bl2bllc8azs3x.R.inc(3059);
        __CLR4_4_12bl2bllc8azs3x.R.inc(3060);chronology = DateTimeUtils.getChronology(chronology);
        
        __CLR4_4_12bl2bllc8azs3x.R.inc(3061);long localMillis = chronology.getZone().getMillisKeepLocal(DateTimeZone.UTC, instant);
        __CLR4_4_12bl2bllc8azs3x.R.inc(3062);iLocalMillis = localMillis;
        __CLR4_4_12bl2bllc8azs3x.R.inc(3063);iChronology = chronology.withUTC();
    }finally{__CLR4_4_12bl2bllc8azs3x.R.flushNeeded();}}

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
     * The String formats are described by {@link ISODateTimeFormat#localDateOptionalTimeParser()}.
     * The default String converter ignores the zone and only parses the field values.
     *
     * @param instant  the datetime object
     * @throws IllegalArgumentException if the instant is invalid
     */
    public LocalDateTime(Object instant) {
        this(instant, (Chronology) null);__CLR4_4_12bl2bllc8azs3x.R.inc(3065);try{__CLR4_4_12bl2bllc8azs3x.R.inc(3064);
    }finally{__CLR4_4_12bl2bllc8azs3x.R.flushNeeded();}}

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
     * The String formats are described by {@link ISODateTimeFormat#localDateOptionalTimeParser()}.
     * The default String converter ignores the zone and only parses the field values.
     *
     * @param instant  the datetime object
     * @param zone  the time zone
     * @throws IllegalArgumentException if the instant is invalid
     */
    public LocalDateTime(Object instant, DateTimeZone zone) {try{__CLR4_4_12bl2bllc8azs3x.R.inc(3066);
        __CLR4_4_12bl2bllc8azs3x.R.inc(3067);PartialConverter converter = ConverterManager.getInstance().getPartialConverter(instant);
        __CLR4_4_12bl2bllc8azs3x.R.inc(3068);Chronology chronology = converter.getChronology(instant, zone);
        __CLR4_4_12bl2bllc8azs3x.R.inc(3069);chronology = DateTimeUtils.getChronology(chronology);
        __CLR4_4_12bl2bllc8azs3x.R.inc(3070);iChronology = chronology.withUTC();
        __CLR4_4_12bl2bllc8azs3x.R.inc(3071);int[] values = converter.getPartialValues(this, instant, chronology, ISODateTimeFormat.localDateOptionalTimeParser());
        __CLR4_4_12bl2bllc8azs3x.R.inc(3072);iLocalMillis = iChronology.getDateTimeMillis(values[0], values[1], values[2], values[3]);
    }finally{__CLR4_4_12bl2bllc8azs3x.R.flushNeeded();}}

    /**
     * Constructs an instance from an Object that represents a datetime,
     * using the specified chronology.
     * <p>
     * If the chronology is null, ISO in the default time zone is used.
     * Once the constructor is completed, the zone is no longer used.
     * If the instant contains a chronology, it will be ignored.
     * For example, passing a {@code LocalDate} and a different chronology
     * will return a date with the year/month/day from the date applied
     * unaltered to the specified chronology.
     * <p>
     * The recognised object types are defined in
     * {@link org.joda.time.convert.ConverterManager ConverterManager} and
     * include ReadablePartial, ReadableInstant, String, Calendar and Date.
     * The String formats are described by {@link ISODateTimeFormat#localDateOptionalTimeParser()}.
     * The default String converter ignores the zone and only parses the field values.
     *
     * @param instant  the datetime object
     * @param chronology  the chronology
     * @throws IllegalArgumentException if the instant is invalid
     */
    public LocalDateTime(Object instant, Chronology chronology) {try{__CLR4_4_12bl2bllc8azs3x.R.inc(3073);
        __CLR4_4_12bl2bllc8azs3x.R.inc(3074);PartialConverter converter = ConverterManager.getInstance().getPartialConverter(instant);
        __CLR4_4_12bl2bllc8azs3x.R.inc(3075);chronology = converter.getChronology(instant, chronology);
        __CLR4_4_12bl2bllc8azs3x.R.inc(3076);chronology = DateTimeUtils.getChronology(chronology);
        __CLR4_4_12bl2bllc8azs3x.R.inc(3077);iChronology = chronology.withUTC();
        __CLR4_4_12bl2bllc8azs3x.R.inc(3078);int[] values = converter.getPartialValues(this, instant, chronology, ISODateTimeFormat.localDateOptionalTimeParser());
        __CLR4_4_12bl2bllc8azs3x.R.inc(3079);iLocalMillis = iChronology.getDateTimeMillis(values[0], values[1], values[2], values[3]);
    }finally{__CLR4_4_12bl2bllc8azs3x.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Constructs an instance set to the specified date and time
     * using <code>ISOChronology</code>.
     *
     * @param year  the year
     * @param monthOfYear  the month of the year, from 1 to 12
     * @param dayOfMonth  the day of the month, from 1 to 31
     * @param hourOfDay  the hour of the day, from 0 to 23
     * @param minuteOfHour  the minute of the hour, from 0 to 59
     */
    public LocalDateTime(
            int year,
            int monthOfYear,
            int dayOfMonth,
            int hourOfDay,
            int minuteOfHour) {
        this(year, monthOfYear, dayOfMonth, hourOfDay,
            minuteOfHour, 0, 0, ISOChronology.getInstanceUTC());__CLR4_4_12bl2bllc8azs3x.R.inc(3081);try{__CLR4_4_12bl2bllc8azs3x.R.inc(3080);
    }finally{__CLR4_4_12bl2bllc8azs3x.R.flushNeeded();}}

    /**
     * Constructs an instance set to the specified date and time
     * using <code>ISOChronology</code>.
     *
     * @param year  the year
     * @param monthOfYear  the month of the year, from 1 to 12
     * @param dayOfMonth  the day of the month, from 1 to 31
     * @param hourOfDay  the hour of the day, from 0 to 23
     * @param minuteOfHour  the minute of the hour, from 0 to 59
     * @param secondOfMinute  the second of the minute, from 0 to 59
     */
    public LocalDateTime(
            int year,
            int monthOfYear,
            int dayOfMonth,
            int hourOfDay,
            int minuteOfHour,
            int secondOfMinute) {
        this(year, monthOfYear, dayOfMonth, hourOfDay,
            minuteOfHour, secondOfMinute, 0, ISOChronology.getInstanceUTC());__CLR4_4_12bl2bllc8azs3x.R.inc(3083);try{__CLR4_4_12bl2bllc8azs3x.R.inc(3082);
    }finally{__CLR4_4_12bl2bllc8azs3x.R.flushNeeded();}}

    /**
     * Constructs an instance set to the specified date and time
     * using <code>ISOChronology</code>.
     *
     * @param year  the year
     * @param monthOfYear  the month of the year, from 1 to 12
     * @param dayOfMonth  the day of the month, from 1 to 31
     * @param hourOfDay  the hour of the day, from 0 to 23
     * @param minuteOfHour  the minute of the hour, from 0 to 59
     * @param secondOfMinute  the second of the minute, from 0 to 59
     * @param millisOfSecond  the millisecond of the second, from 0 to 999
     */
    public LocalDateTime(
            int year,
            int monthOfYear,
            int dayOfMonth,
            int hourOfDay,
            int minuteOfHour,
            int secondOfMinute,
            int millisOfSecond) {
        this(year, monthOfYear, dayOfMonth, hourOfDay,
            minuteOfHour, secondOfMinute, millisOfSecond, ISOChronology.getInstanceUTC());__CLR4_4_12bl2bllc8azs3x.R.inc(3085);try{__CLR4_4_12bl2bllc8azs3x.R.inc(3084);
    }finally{__CLR4_4_12bl2bllc8azs3x.R.flushNeeded();}}

    /**
     * Constructs an instance set to the specified date and time
     * using the specified chronology, whose zone is ignored.
     * <p>
     * If the chronology is null, <code>ISOChronology</code> is used.
     *
     * @param year  the year, valid values defined by the chronology
     * @param monthOfYear  the month of the year, valid values defined by the chronology
     * @param dayOfMonth  the day of the month, valid values defined by the chronology
     * @param hourOfDay  the hour of the day, valid values defined by the chronology
     * @param minuteOfHour  the minute of the hour, valid values defined by the chronology
     * @param secondOfMinute  the second of the minute, valid values defined by the chronology
     * @param millisOfSecond  the millisecond of the second, valid values defined by the chronology
     * @param chronology  the chronology, null means ISOChronology in default zone
     */
    public LocalDateTime(
            int year,
            int monthOfYear,
            int dayOfMonth,
            int hourOfDay,
            int minuteOfHour,
            int secondOfMinute,
            int millisOfSecond,
            Chronology chronology) {
        super();__CLR4_4_12bl2bllc8azs3x.R.inc(3087);try{__CLR4_4_12bl2bllc8azs3x.R.inc(3086);
        __CLR4_4_12bl2bllc8azs3x.R.inc(3088);chronology = DateTimeUtils.getChronology(chronology).withUTC();
        __CLR4_4_12bl2bllc8azs3x.R.inc(3089);long instant = chronology.getDateTimeMillis(year, monthOfYear, dayOfMonth,
            hourOfDay, minuteOfHour, secondOfMinute, millisOfSecond);
        __CLR4_4_12bl2bllc8azs3x.R.inc(3090);iChronology = chronology;
        __CLR4_4_12bl2bllc8azs3x.R.inc(3091);iLocalMillis = instant;
    }finally{__CLR4_4_12bl2bllc8azs3x.R.flushNeeded();}}

    /**
     * Handle broken serialization from other tools.
     * @return the resolved object, not null
     */
    private Object readResolve() {try{__CLR4_4_12bl2bllc8azs3x.R.inc(3092);
        __CLR4_4_12bl2bllc8azs3x.R.inc(3093);if ((((iChronology == null)&&(__CLR4_4_12bl2bllc8azs3x.R.iget(3094)!=0|true))||(__CLR4_4_12bl2bllc8azs3x.R.iget(3095)==0&false))) {{
            __CLR4_4_12bl2bllc8azs3x.R.inc(3096);return new LocalDateTime(iLocalMillis, ISOChronology.getInstanceUTC());
        }
        }__CLR4_4_12bl2bllc8azs3x.R.inc(3097);if ((((DateTimeZone.UTC.equals(iChronology.getZone()) == false)&&(__CLR4_4_12bl2bllc8azs3x.R.iget(3098)!=0|true))||(__CLR4_4_12bl2bllc8azs3x.R.iget(3099)==0&false))) {{
            __CLR4_4_12bl2bllc8azs3x.R.inc(3100);return new LocalDateTime(iLocalMillis, iChronology.withUTC());
        }
        }__CLR4_4_12bl2bllc8azs3x.R.inc(3101);return this;
    }finally{__CLR4_4_12bl2bllc8azs3x.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Gets the number of fields in this partial, which is four.
     * The supported fields are Year, MonthOfDay, DayOfMonth and MillisOfDay.
     *
     * @return the field count, four
     */
    public int size() {try{__CLR4_4_12bl2bllc8azs3x.R.inc(3102);
        __CLR4_4_12bl2bllc8azs3x.R.inc(3103);return 4;
    }finally{__CLR4_4_12bl2bllc8azs3x.R.flushNeeded();}}

    /**
     * Gets the field for a specific index in the chronology specified.
     * <p>
     * This method must not use any instance variables.
     *
     * @param index  the index to retrieve
     * @param chrono  the chronology to use
     * @return the field
     */
    protected DateTimeField getField(int index, Chronology chrono) {try{__CLR4_4_12bl2bllc8azs3x.R.inc(3104);
        boolean __CLB4_4_1_bool0=false;__CLR4_4_12bl2bllc8azs3x.R.inc(3105);switch (index) {
            case YEAR:if (!__CLB4_4_1_bool0) {__CLR4_4_12bl2bllc8azs3x.R.inc(3106);__CLB4_4_1_bool0=true;}
                __CLR4_4_12bl2bllc8azs3x.R.inc(3107);return chrono.year();
            case MONTH_OF_YEAR:if (!__CLB4_4_1_bool0) {__CLR4_4_12bl2bllc8azs3x.R.inc(3108);__CLB4_4_1_bool0=true;}
                __CLR4_4_12bl2bllc8azs3x.R.inc(3109);return chrono.monthOfYear();
            case DAY_OF_MONTH:if (!__CLB4_4_1_bool0) {__CLR4_4_12bl2bllc8azs3x.R.inc(3110);__CLB4_4_1_bool0=true;}
                __CLR4_4_12bl2bllc8azs3x.R.inc(3111);return chrono.dayOfMonth();
            case MILLIS_OF_DAY:if (!__CLB4_4_1_bool0) {__CLR4_4_12bl2bllc8azs3x.R.inc(3112);__CLB4_4_1_bool0=true;}
                __CLR4_4_12bl2bllc8azs3x.R.inc(3113);return chrono.millisOfDay();
            default:if (!__CLB4_4_1_bool0) {__CLR4_4_12bl2bllc8azs3x.R.inc(3114);__CLB4_4_1_bool0=true;}
                __CLR4_4_12bl2bllc8azs3x.R.inc(3115);throw new IndexOutOfBoundsException("Invalid index: " + index);
        }
    }finally{__CLR4_4_12bl2bllc8azs3x.R.flushNeeded();}}

    /**
     * Gets the value of the field at the specifed index.
     * <p>
     * This method is required to support the <code>ReadablePartial</code>
     * interface. The supported fields are Year, MonthOfDay, DayOfMonth and MillisOfDay.
     *
     * @param index  the index, zero to two
     * @return the value
     * @throws IndexOutOfBoundsException if the index is invalid
     */
    public int getValue(int index) {try{__CLR4_4_12bl2bllc8azs3x.R.inc(3116);
        boolean __CLB4_4_1_bool1=false;__CLR4_4_12bl2bllc8azs3x.R.inc(3117);switch (index) {
            case YEAR:if (!__CLB4_4_1_bool1) {__CLR4_4_12bl2bllc8azs3x.R.inc(3118);__CLB4_4_1_bool1=true;}
                __CLR4_4_12bl2bllc8azs3x.R.inc(3119);return getChronology().year().get(getLocalMillis());
            case MONTH_OF_YEAR:if (!__CLB4_4_1_bool1) {__CLR4_4_12bl2bllc8azs3x.R.inc(3120);__CLB4_4_1_bool1=true;}
                __CLR4_4_12bl2bllc8azs3x.R.inc(3121);return getChronology().monthOfYear().get(getLocalMillis());
            case DAY_OF_MONTH:if (!__CLB4_4_1_bool1) {__CLR4_4_12bl2bllc8azs3x.R.inc(3122);__CLB4_4_1_bool1=true;}
                __CLR4_4_12bl2bllc8azs3x.R.inc(3123);return getChronology().dayOfMonth().get(getLocalMillis());
            case MILLIS_OF_DAY:if (!__CLB4_4_1_bool1) {__CLR4_4_12bl2bllc8azs3x.R.inc(3124);__CLB4_4_1_bool1=true;}
                __CLR4_4_12bl2bllc8azs3x.R.inc(3125);return getChronology().millisOfDay().get(getLocalMillis());
            default:if (!__CLB4_4_1_bool1) {__CLR4_4_12bl2bllc8azs3x.R.inc(3126);__CLB4_4_1_bool1=true;}
                __CLR4_4_12bl2bllc8azs3x.R.inc(3127);throw new IndexOutOfBoundsException("Invalid index: " + index);
        }
    }finally{__CLR4_4_12bl2bllc8azs3x.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Get the value of one of the fields of a datetime.
     * <p>
     * This method gets the value of the specified field.
     * For example:
     * <pre>
     * DateTime dt = new DateTime();
     * int year = dt.get(DateTimeFieldType.year());
     * </pre>
     *
     * @param type  a field type, usually obtained from DateTimeFieldType, not null
     * @return the value of that field
     * @throws IllegalArgumentException if the field type is null
     */
    public int get(DateTimeFieldType type) {try{__CLR4_4_12bl2bllc8azs3x.R.inc(3128);
        __CLR4_4_12bl2bllc8azs3x.R.inc(3129);if ((((type == null)&&(__CLR4_4_12bl2bllc8azs3x.R.iget(3130)!=0|true))||(__CLR4_4_12bl2bllc8azs3x.R.iget(3131)==0&false))) {{
            __CLR4_4_12bl2bllc8azs3x.R.inc(3132);throw new IllegalArgumentException("The DateTimeFieldType must not be null");
        }
        }__CLR4_4_12bl2bllc8azs3x.R.inc(3133);return type.getField(getChronology()).get(getLocalMillis());
    }finally{__CLR4_4_12bl2bllc8azs3x.R.flushNeeded();}}

    /**
     * Checks if the field type specified is supported by this
     * local datetime and chronology.
     * This can be used to avoid exceptions in {@link #get(DateTimeFieldType)}.
     *
     * @param type  a field type, usually obtained from DateTimeFieldType
     * @return true if the field type is supported
     */
    public boolean isSupported(DateTimeFieldType type) {try{__CLR4_4_12bl2bllc8azs3x.R.inc(3134);
        __CLR4_4_12bl2bllc8azs3x.R.inc(3135);if ((((type == null)&&(__CLR4_4_12bl2bllc8azs3x.R.iget(3136)!=0|true))||(__CLR4_4_12bl2bllc8azs3x.R.iget(3137)==0&false))) {{
            __CLR4_4_12bl2bllc8azs3x.R.inc(3138);return false;
        }
        }__CLR4_4_12bl2bllc8azs3x.R.inc(3139);return type.getField(getChronology()).isSupported();
    }finally{__CLR4_4_12bl2bllc8azs3x.R.flushNeeded();}}

    /**
     * Checks if the duration type specified is supported by this
     * local datetime and chronology.
     *
     * @param type  a duration type, usually obtained from DurationFieldType
     * @return true if the field type is supported
     */
    public boolean isSupported(DurationFieldType type) {try{__CLR4_4_12bl2bllc8azs3x.R.inc(3140);
        __CLR4_4_12bl2bllc8azs3x.R.inc(3141);if ((((type == null)&&(__CLR4_4_12bl2bllc8azs3x.R.iget(3142)!=0|true))||(__CLR4_4_12bl2bllc8azs3x.R.iget(3143)==0&false))) {{
            __CLR4_4_12bl2bllc8azs3x.R.inc(3144);return false;
        }
        }__CLR4_4_12bl2bllc8azs3x.R.inc(3145);return type.getField(getChronology()).isSupported();
    }finally{__CLR4_4_12bl2bllc8azs3x.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Gets the milliseconds of the datetime instant from the Java epoch
     * of 1970-01-01T00:00:00 (not fixed to any specific time zone).
     *
     * @return the number of milliseconds since 1970-01-01T00:00:00
     * @since 1.5 (previously private)
     */
    protected long getLocalMillis() {try{__CLR4_4_12bl2bllc8azs3x.R.inc(3146);
        __CLR4_4_12bl2bllc8azs3x.R.inc(3147);return iLocalMillis;
    }finally{__CLR4_4_12bl2bllc8azs3x.R.flushNeeded();}}

    /**
     * Gets the chronology of the datetime.
     *
     * @return the Chronology that the datetime is using
     */
    public Chronology getChronology() {try{__CLR4_4_12bl2bllc8azs3x.R.inc(3148);
        __CLR4_4_12bl2bllc8azs3x.R.inc(3149);return iChronology;
    }finally{__CLR4_4_12bl2bllc8azs3x.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Compares this ReadablePartial with another returning true if the chronology,
     * field types and values are equal.
     *
     * @param partial  an object to check against
     * @return true if fields and values are equal
     */
    public boolean equals(Object partial) {try{__CLR4_4_12bl2bllc8azs3x.R.inc(3150);
        // override to perform faster
        __CLR4_4_12bl2bllc8azs3x.R.inc(3151);if ((((this == partial)&&(__CLR4_4_12bl2bllc8azs3x.R.iget(3152)!=0|true))||(__CLR4_4_12bl2bllc8azs3x.R.iget(3153)==0&false))) {{
            __CLR4_4_12bl2bllc8azs3x.R.inc(3154);return true;
        }
        }__CLR4_4_12bl2bllc8azs3x.R.inc(3155);if ((((partial instanceof LocalDateTime)&&(__CLR4_4_12bl2bllc8azs3x.R.iget(3156)!=0|true))||(__CLR4_4_12bl2bllc8azs3x.R.iget(3157)==0&false))) {{
            __CLR4_4_12bl2bllc8azs3x.R.inc(3158);LocalDateTime other = (LocalDateTime) partial;
            __CLR4_4_12bl2bllc8azs3x.R.inc(3159);if ((((iChronology.equals(other.iChronology))&&(__CLR4_4_12bl2bllc8azs3x.R.iget(3160)!=0|true))||(__CLR4_4_12bl2bllc8azs3x.R.iget(3161)==0&false))) {{
                __CLR4_4_12bl2bllc8azs3x.R.inc(3162);return iLocalMillis == other.iLocalMillis;
            }
        }}
        }__CLR4_4_12bl2bllc8azs3x.R.inc(3163);return super.equals(partial);
    }finally{__CLR4_4_12bl2bllc8azs3x.R.flushNeeded();}}

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
    public int compareTo(ReadablePartial partial) {try{__CLR4_4_12bl2bllc8azs3x.R.inc(3164);
        // override to perform faster
        __CLR4_4_12bl2bllc8azs3x.R.inc(3165);if ((((this == partial)&&(__CLR4_4_12bl2bllc8azs3x.R.iget(3166)!=0|true))||(__CLR4_4_12bl2bllc8azs3x.R.iget(3167)==0&false))) {{
            __CLR4_4_12bl2bllc8azs3x.R.inc(3168);return 0;
        }
        }__CLR4_4_12bl2bllc8azs3x.R.inc(3169);if ((((partial instanceof LocalDateTime)&&(__CLR4_4_12bl2bllc8azs3x.R.iget(3170)!=0|true))||(__CLR4_4_12bl2bllc8azs3x.R.iget(3171)==0&false))) {{
            __CLR4_4_12bl2bllc8azs3x.R.inc(3172);LocalDateTime other = (LocalDateTime) partial;
            __CLR4_4_12bl2bllc8azs3x.R.inc(3173);if ((((iChronology.equals(other.iChronology))&&(__CLR4_4_12bl2bllc8azs3x.R.iget(3174)!=0|true))||(__CLR4_4_12bl2bllc8azs3x.R.iget(3175)==0&false))) {{
                __CLR4_4_12bl2bllc8azs3x.R.inc(3176);return ((((iLocalMillis < other.iLocalMillis )&&(__CLR4_4_12bl2bllc8azs3x.R.iget(3177)!=0|true))||(__CLR4_4_12bl2bllc8azs3x.R.iget(3178)==0&false))? -1 :
                            ((((iLocalMillis == other.iLocalMillis )&&(__CLR4_4_12bl2bllc8azs3x.R.iget(3179)!=0|true))||(__CLR4_4_12bl2bllc8azs3x.R.iget(3180)==0&false))? 0 : 1));

            }
        }}
        }__CLR4_4_12bl2bllc8azs3x.R.inc(3181);return super.compareTo(partial);
    }finally{__CLR4_4_12bl2bllc8azs3x.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Converts this object to a DateTime using the default zone.
     * <p>
     * This method will throw an exception if the datetime that would be
     * created does not exist when the time zone is taken into account.
     * 
     * @return <code>this</code>
     */
    public DateTime toDateTime() {try{__CLR4_4_12bl2bllc8azs3x.R.inc(3182);
        __CLR4_4_12bl2bllc8azs3x.R.inc(3183);return toDateTime((DateTimeZone) null);
    }finally{__CLR4_4_12bl2bllc8azs3x.R.flushNeeded();}}

    /**
     * Converts this object to a DateTime using the specified zone.
     * <p>
     * This method will throw an exception if the datetime that would be
     * created does not exist when the time zone is taken into account.
     * 
     * @param zone time zone to apply, or default if null
     * @return a DateTime using the same millis
     */
    public DateTime toDateTime(DateTimeZone zone) {try{__CLR4_4_12bl2bllc8azs3x.R.inc(3184);
        __CLR4_4_12bl2bllc8azs3x.R.inc(3185);zone = DateTimeUtils.getZone(zone);
        __CLR4_4_12bl2bllc8azs3x.R.inc(3186);Chronology chrono = iChronology.withZone(zone);
        __CLR4_4_12bl2bllc8azs3x.R.inc(3187);return new DateTime(
                getYear(), getMonthOfYear(), getDayOfMonth(),
                getHourOfDay(), getMinuteOfHour(),
                getSecondOfMinute(), getMillisOfSecond(), chrono);
    }finally{__CLR4_4_12bl2bllc8azs3x.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Converts this object to a LocalDate with the same date and chronology.
     *
     * @return a LocalDate with the same date and chronology
     */
    public LocalDate toLocalDate() {try{__CLR4_4_12bl2bllc8azs3x.R.inc(3188);
        __CLR4_4_12bl2bllc8azs3x.R.inc(3189);return new LocalDate(getLocalMillis(), getChronology());
    }finally{__CLR4_4_12bl2bllc8azs3x.R.flushNeeded();}}

    /**
     * Converts this object to a LocalTime with the same time and chronology.
     *
     * @return a LocalTime with the same time and chronology
     */
    public LocalTime toLocalTime() {try{__CLR4_4_12bl2bllc8azs3x.R.inc(3190);
        __CLR4_4_12bl2bllc8azs3x.R.inc(3191);return new LocalTime(getLocalMillis(), getChronology());
    }finally{__CLR4_4_12bl2bllc8azs3x.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Get the date time as a <code>java.util.Date</code>.
     * <p>
     * The <code>Date</code> object created has exactly the same fields as this
     * date-time, except when the time would be invalid due to a daylight savings
     * gap. In that case, the time will be set to the earliest valid time after the gap.
     * <p>
     * In the case of a daylight savings overlap, the earlier instant is selected.
     * <p>
     * Converting to a JDK Date is full of complications as the JDK Date constructor
     * doesn't behave as you might expect around DST transitions. This method works
     * by taking a first guess and then adjusting. This also handles the situation
     * where the JDK time zone data differs from the Joda-Time time zone data.
     *
     * @return a Date initialised with this date-time, never null
     * @since 2.0
     */
    @SuppressWarnings("deprecation")
    public Date toDate() {try{__CLR4_4_12bl2bllc8azs3x.R.inc(3192);
        __CLR4_4_12bl2bllc8azs3x.R.inc(3193);int dom = getDayOfMonth();
        __CLR4_4_12bl2bllc8azs3x.R.inc(3194);Date date = new Date(getYear() - 1900, getMonthOfYear() - 1, dom,
                        getHourOfDay(), getMinuteOfHour(), getSecondOfMinute());
        __CLR4_4_12bl2bllc8azs3x.R.inc(3195);date.setTime(date.getTime() + getMillisOfSecond());
        __CLR4_4_12bl2bllc8azs3x.R.inc(3196);return correctDstTransition(date, TimeZone.getDefault());
    }finally{__CLR4_4_12bl2bllc8azs3x.R.flushNeeded();}}

    /**
     * Get the date time as a <code>java.util.Date</code> using the specified time zone.
     * <p>
     * The <code>Date</code> object created has exactly the same fields as this
     * date-time, except when the time would be invalid due to a daylight savings
     * gap. In that case, the time will be set to the earliest valid time after the gap.
     * <p>
     * In the case of a daylight savings overlap, the earlier instant is selected.
     * <p>
     * Converting to a JDK Date is full of complications as the JDK Date constructor
     * doesn't behave as you might expect around DST transitions. This method works
     * by taking a first guess and then adjusting. This also handles the situation
     * where the JDK time zone data differs from the Joda-Time time zone data.
     * <p>
     * Unlike {@link #toDate()}, this implementation does not rely on Java's synchronized
     * time zone initialization logic, and should demonstrate better concurrent performance
     * characteristics.
     *
     * @return a Date initialised with this date-time, never null
     * @since 2.3
     */
    public Date toDate(final TimeZone timeZone) {try{__CLR4_4_12bl2bllc8azs3x.R.inc(3197);
        __CLR4_4_12bl2bllc8azs3x.R.inc(3198);final Calendar calendar = Calendar.getInstance(timeZone);
        __CLR4_4_12bl2bllc8azs3x.R.inc(3199);calendar.clear();
        __CLR4_4_12bl2bllc8azs3x.R.inc(3200);calendar.set(getYear(), getMonthOfYear() - 1, getDayOfMonth(),
                    getHourOfDay(), getMinuteOfHour(), getSecondOfMinute());
        __CLR4_4_12bl2bllc8azs3x.R.inc(3201);Date date = calendar.getTime();
        __CLR4_4_12bl2bllc8azs3x.R.inc(3202);date.setTime(date.getTime() + getMillisOfSecond());
        __CLR4_4_12bl2bllc8azs3x.R.inc(3203);return correctDstTransition(date, timeZone);
    }finally{__CLR4_4_12bl2bllc8azs3x.R.flushNeeded();}}

    /**
     * Correct <code>date</code> in case of DST overlap.
     * <p>
     * The <code>Date</code> object created has exactly the same fields as this
     * date-time, except when the time would be invalid due to a daylight savings
     * gap. In that case, the time will be set to the earliest valid time after the gap.
     * <p>
     * In the case of a daylight savings overlap, the earlier instant is selected.
     * <p>
     * Converting to a JDK Date is full of complications as the JDK Date constructor
     * doesn't behave as you might expect around DST transitions. This method works
     * by taking a first guess and then adjusting. This also handles the situation
     * where the JDK time zone data differs from the Joda-Time time zone data.
     * @see #toDate()
     */
    private Date correctDstTransition(Date date, final TimeZone timeZone) {try{__CLR4_4_12bl2bllc8azs3x.R.inc(3204);
        __CLR4_4_12bl2bllc8azs3x.R.inc(3205);Calendar calendar = Calendar.getInstance(timeZone);
        __CLR4_4_12bl2bllc8azs3x.R.inc(3206);calendar.setTime(date);
        __CLR4_4_12bl2bllc8azs3x.R.inc(3207);LocalDateTime check = LocalDateTime.fromCalendarFields(calendar);
        __CLR4_4_12bl2bllc8azs3x.R.inc(3208);if ((((check.isBefore(this))&&(__CLR4_4_12bl2bllc8azs3x.R.iget(3209)!=0|true))||(__CLR4_4_12bl2bllc8azs3x.R.iget(3210)==0&false))) {{
            // DST gap
            // move forward in units of one minute until equal/after
            __CLR4_4_12bl2bllc8azs3x.R.inc(3211);while ((((check.isBefore(this))&&(__CLR4_4_12bl2bllc8azs3x.R.iget(3212)!=0|true))||(__CLR4_4_12bl2bllc8azs3x.R.iget(3213)==0&false))) {{
                __CLR4_4_12bl2bllc8azs3x.R.inc(3214);calendar.setTimeInMillis(calendar.getTimeInMillis() + 60000);
                __CLR4_4_12bl2bllc8azs3x.R.inc(3215);check = LocalDateTime.fromCalendarFields(calendar);
            }
            // move back in units of one second until date wrong
            }__CLR4_4_12bl2bllc8azs3x.R.inc(3216);while ((((check.isBefore(this) == false)&&(__CLR4_4_12bl2bllc8azs3x.R.iget(3217)!=0|true))||(__CLR4_4_12bl2bllc8azs3x.R.iget(3218)==0&false))) {{
                __CLR4_4_12bl2bllc8azs3x.R.inc(3219);calendar.setTimeInMillis(calendar.getTimeInMillis() - 1000);
                __CLR4_4_12bl2bllc8azs3x.R.inc(3220);check = LocalDateTime.fromCalendarFields(calendar);
            }
            }__CLR4_4_12bl2bllc8azs3x.R.inc(3221);calendar.setTimeInMillis(calendar.getTimeInMillis() + 1000);
        } }else {__CLR4_4_12bl2bllc8azs3x.R.inc(3222);if ((((check.equals(this))&&(__CLR4_4_12bl2bllc8azs3x.R.iget(3223)!=0|true))||(__CLR4_4_12bl2bllc8azs3x.R.iget(3224)==0&false))) {{
            // check for DST overlap
            __CLR4_4_12bl2bllc8azs3x.R.inc(3225);final Calendar earlier = Calendar.getInstance(timeZone);
            __CLR4_4_12bl2bllc8azs3x.R.inc(3226);earlier.setTimeInMillis(calendar.getTimeInMillis() - timeZone.getDSTSavings());
            __CLR4_4_12bl2bllc8azs3x.R.inc(3227);check = LocalDateTime.fromCalendarFields(earlier);
            __CLR4_4_12bl2bllc8azs3x.R.inc(3228);if ((((check.equals(this))&&(__CLR4_4_12bl2bllc8azs3x.R.iget(3229)!=0|true))||(__CLR4_4_12bl2bllc8azs3x.R.iget(3230)==0&false))) {{
                __CLR4_4_12bl2bllc8azs3x.R.inc(3231);calendar = earlier;
            }
        }}
        }}__CLR4_4_12bl2bllc8azs3x.R.inc(3232);return calendar.getTime();
    }finally{__CLR4_4_12bl2bllc8azs3x.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Returns a copy of this datetime with different local millis.
     * <p>
     * The returned object will be a new instance of the same type.
     * Only the millis will change, the chronology is kept.
     * The returned object will be either be a new instance or <code>this</code>.
     *
     * @param newMillis  the new millis, from 1970-01-01T00:00:00
     * @return a copy of this datetime with different millis
     */
    LocalDateTime withLocalMillis(long newMillis) {try{__CLR4_4_12bl2bllc8azs3x.R.inc(3233);
        __CLR4_4_12bl2bllc8azs3x.R.inc(3234);return ((((newMillis == getLocalMillis() )&&(__CLR4_4_12bl2bllc8azs3x.R.iget(3235)!=0|true))||(__CLR4_4_12bl2bllc8azs3x.R.iget(3236)==0&false))? this : new LocalDateTime(newMillis, getChronology()));
    }finally{__CLR4_4_12bl2bllc8azs3x.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Returns a copy of this datetime with the specified date,
     * retaining the time fields.
     * <p>
     * If the date is already the date passed in, then <code>this</code> is returned.
     * <p>
     * To set a single field use the properties, for example:
     * <pre>
     * DateTime set = dt.monthOfYear().setCopy(6);
     * </pre>
     *
     * @param year  the new year value
     * @param monthOfYear  the new monthOfYear value
     * @param dayOfMonth  the new dayOfMonth value
     * @return a copy of this datetime with a different date
     * @throws IllegalArgumentException if any value if invalid
     */
    public LocalDateTime withDate(int year, int monthOfYear, int dayOfMonth) {try{__CLR4_4_12bl2bllc8azs3x.R.inc(3237);
        __CLR4_4_12bl2bllc8azs3x.R.inc(3238);Chronology chrono = getChronology();
        __CLR4_4_12bl2bllc8azs3x.R.inc(3239);long instant = getLocalMillis();
        __CLR4_4_12bl2bllc8azs3x.R.inc(3240);instant = chrono.year().set(instant, year);
        __CLR4_4_12bl2bllc8azs3x.R.inc(3241);instant = chrono.monthOfYear().set(instant, monthOfYear);
        __CLR4_4_12bl2bllc8azs3x.R.inc(3242);instant = chrono.dayOfMonth().set(instant, dayOfMonth);
        __CLR4_4_12bl2bllc8azs3x.R.inc(3243);return withLocalMillis(instant);
    }finally{__CLR4_4_12bl2bllc8azs3x.R.flushNeeded();}}

    /**
     * Returns a copy of this datetime with the specified time,
     * retaining the date fields.
     * <p>
     * If the time is already the time passed in, then <code>this</code> is returned.
     * <p>
     * To set a single field use the properties, for example:
     * <pre>
     * LocalDateTime set = dt.hourOfDay().setCopy(6);
     * </pre>
     *
     * @param hourOfDay  the hour of the day
     * @param minuteOfHour  the minute of the hour
     * @param secondOfMinute  the second of the minute
     * @param millisOfSecond  the millisecond of the second
     * @return a copy of this datetime with a different time
     * @throws IllegalArgumentException if any value if invalid
     */
    public LocalDateTime withTime(int hourOfDay, int minuteOfHour, int secondOfMinute, int millisOfSecond) {try{__CLR4_4_12bl2bllc8azs3x.R.inc(3244);
        __CLR4_4_12bl2bllc8azs3x.R.inc(3245);Chronology chrono = getChronology();
        __CLR4_4_12bl2bllc8azs3x.R.inc(3246);long instant = getLocalMillis();
        __CLR4_4_12bl2bllc8azs3x.R.inc(3247);instant = chrono.hourOfDay().set(instant, hourOfDay);
        __CLR4_4_12bl2bllc8azs3x.R.inc(3248);instant = chrono.minuteOfHour().set(instant, minuteOfHour);
        __CLR4_4_12bl2bllc8azs3x.R.inc(3249);instant = chrono.secondOfMinute().set(instant, secondOfMinute);
        __CLR4_4_12bl2bllc8azs3x.R.inc(3250);instant = chrono.millisOfSecond().set(instant, millisOfSecond);
        __CLR4_4_12bl2bllc8azs3x.R.inc(3251);return withLocalMillis(instant);
    }finally{__CLR4_4_12bl2bllc8azs3x.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Returns a copy of this datetime with the partial set of fields
     * replacing those from this instance.
     * <p>
     * For example, if the partial is a <code>TimeOfDay</code> then the time fields
     * would be changed in the returned instance.
     * If the partial is null, then <code>this</code> is returned.
     *
     * @param partial  the partial set of fields to apply to this datetime, null ignored
     * @return a copy of this datetime with a different set of fields
     * @throws IllegalArgumentException if any value is invalid
     */
    public LocalDateTime withFields(ReadablePartial partial) {try{__CLR4_4_12bl2bllc8azs3x.R.inc(3252);
        __CLR4_4_12bl2bllc8azs3x.R.inc(3253);if ((((partial == null)&&(__CLR4_4_12bl2bllc8azs3x.R.iget(3254)!=0|true))||(__CLR4_4_12bl2bllc8azs3x.R.iget(3255)==0&false))) {{
            __CLR4_4_12bl2bllc8azs3x.R.inc(3256);return this;
        }
        }__CLR4_4_12bl2bllc8azs3x.R.inc(3257);return withLocalMillis(getChronology().set(partial, getLocalMillis()));
    }finally{__CLR4_4_12bl2bllc8azs3x.R.flushNeeded();}}

    /**
     * Returns a copy of this datetime with the specified field set to a new value.
     * <p>
     * For example, if the field type is <code>hourOfDay</code> then the hour of day
     * field would be changed in the returned instance.
     * If the field type is null, then <code>this</code> is returned.
     * <p>
     * These three lines are equivalent:
     * <pre>
     * LocalDateTime updated = dt.withField(DateTimeFieldType.dayOfMonth(), 6);
     * LocalDateTime updated = dt.dayOfMonth().setCopy(6);
     * LocalDateTime updated = dt.property(DateTimeFieldType.dayOfMonth()).setCopy(6);
     * </pre>
     *
     * @param fieldType  the field type to set, not null
     * @param value  the value to set
     * @return a copy of this datetime with the field set
     * @throws IllegalArgumentException if the value is null or invalid
     */
    public LocalDateTime withField(DateTimeFieldType fieldType, int value) {try{__CLR4_4_12bl2bllc8azs3x.R.inc(3258);
        __CLR4_4_12bl2bllc8azs3x.R.inc(3259);if ((((fieldType == null)&&(__CLR4_4_12bl2bllc8azs3x.R.iget(3260)!=0|true))||(__CLR4_4_12bl2bllc8azs3x.R.iget(3261)==0&false))) {{
            __CLR4_4_12bl2bllc8azs3x.R.inc(3262);throw new IllegalArgumentException("Field must not be null");
        }
        }__CLR4_4_12bl2bllc8azs3x.R.inc(3263);long instant = fieldType.getField(getChronology()).set(getLocalMillis(), value);
        __CLR4_4_12bl2bllc8azs3x.R.inc(3264);return withLocalMillis(instant);
    }finally{__CLR4_4_12bl2bllc8azs3x.R.flushNeeded();}}

    /**
     * Returns a copy of this datetime with the value of the specified
     * field increased.
     * <p>
     * If the addition is zero or the field is null, then <code>this</code> is returned.
     * <p>
     * These three lines are equivalent:
     * <pre>
     * LocalDateTime added = dt.withFieldAdded(DurationFieldType.years(), 6);
     * LocalDateTime added = dt.plusYears(6);
     * LocalDateTime added = dt.plus(Period.years(6));
     * </pre>
     *
     * @param fieldType  the field type to add to, not null
     * @param amount  the amount to add
     * @return a copy of this datetime with the field updated
     * @throws IllegalArgumentException if the value is null or invalid
     * @throws ArithmeticException if the result exceeds the internal capacity
     */
    public LocalDateTime withFieldAdded(DurationFieldType fieldType, int amount) {try{__CLR4_4_12bl2bllc8azs3x.R.inc(3265);
        __CLR4_4_12bl2bllc8azs3x.R.inc(3266);if ((((fieldType == null)&&(__CLR4_4_12bl2bllc8azs3x.R.iget(3267)!=0|true))||(__CLR4_4_12bl2bllc8azs3x.R.iget(3268)==0&false))) {{
            __CLR4_4_12bl2bllc8azs3x.R.inc(3269);throw new IllegalArgumentException("Field must not be null");
        }
        }__CLR4_4_12bl2bllc8azs3x.R.inc(3270);if ((((amount == 0)&&(__CLR4_4_12bl2bllc8azs3x.R.iget(3271)!=0|true))||(__CLR4_4_12bl2bllc8azs3x.R.iget(3272)==0&false))) {{
            __CLR4_4_12bl2bllc8azs3x.R.inc(3273);return this;
        }
        }__CLR4_4_12bl2bllc8azs3x.R.inc(3274);long instant = fieldType.getField(getChronology()).add(getLocalMillis(), amount);
        __CLR4_4_12bl2bllc8azs3x.R.inc(3275);return withLocalMillis(instant);
    }finally{__CLR4_4_12bl2bllc8azs3x.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Returns a copy of this datetime with the specified duration added.
     * <p>
     * If the addition is zero, then <code>this</code> is returned.
     *
     * @param durationToAdd  the duration to add to this one, null means zero
     * @param scalar  the amount of times to add, such as -1 to subtract once
     * @return a copy of this datetime with the duration added
     * @throws ArithmeticException if the result exceeds the internal capacity
     */
    public LocalDateTime withDurationAdded(ReadableDuration durationToAdd, int scalar) {try{__CLR4_4_12bl2bllc8azs3x.R.inc(3276);
        __CLR4_4_12bl2bllc8azs3x.R.inc(3277);if ((((durationToAdd == null || scalar == 0)&&(__CLR4_4_12bl2bllc8azs3x.R.iget(3278)!=0|true))||(__CLR4_4_12bl2bllc8azs3x.R.iget(3279)==0&false))) {{
            __CLR4_4_12bl2bllc8azs3x.R.inc(3280);return this;
        }
        }__CLR4_4_12bl2bllc8azs3x.R.inc(3281);long instant = getChronology().add(getLocalMillis(), durationToAdd.getMillis(), scalar);
        __CLR4_4_12bl2bllc8azs3x.R.inc(3282);return withLocalMillis(instant);
    }finally{__CLR4_4_12bl2bllc8azs3x.R.flushNeeded();}}

    /**
     * Returns a copy of this datetime with the specified period added.
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
     * @throws ArithmeticException if the result exceeds the internal capacity
     */
    public LocalDateTime withPeriodAdded(ReadablePeriod period, int scalar) {try{__CLR4_4_12bl2bllc8azs3x.R.inc(3283);
        __CLR4_4_12bl2bllc8azs3x.R.inc(3284);if ((((period == null || scalar == 0)&&(__CLR4_4_12bl2bllc8azs3x.R.iget(3285)!=0|true))||(__CLR4_4_12bl2bllc8azs3x.R.iget(3286)==0&false))) {{
            __CLR4_4_12bl2bllc8azs3x.R.inc(3287);return this;
        }
        }__CLR4_4_12bl2bllc8azs3x.R.inc(3288);long instant = getChronology().add(period, getLocalMillis(), scalar);
        __CLR4_4_12bl2bllc8azs3x.R.inc(3289);return withLocalMillis(instant);
    }finally{__CLR4_4_12bl2bllc8azs3x.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Returns a copy of this datetime with the specified duration added.
     * <p>
     * If the amount is zero or null, then <code>this</code> is returned.
     *
     * @param duration  the duration to add to this one, null means zero
     * @return a copy of this datetime with the duration added
     * @throws ArithmeticException if the result exceeds the internal capacity
     */
    public LocalDateTime plus(ReadableDuration duration) {try{__CLR4_4_12bl2bllc8azs3x.R.inc(3290);
        __CLR4_4_12bl2bllc8azs3x.R.inc(3291);return withDurationAdded(duration, 1);
    }finally{__CLR4_4_12bl2bllc8azs3x.R.flushNeeded();}}

    /**
     * Returns a copy of this datetime with the specified period added.
     * <p>
     * If the amount is zero or null, then <code>this</code> is returned.
     * <p>
     * This method is typically used to add complex period instances.
     * Adding one field is best achieved using methods
     * like {@link #plusYears(int)}.
     *
     * @param period  the period to add to this one, null means zero
     * @return a copy of this datetime with the period added
     * @throws ArithmeticException if the result exceeds the internal capacity
     */
    public LocalDateTime plus(ReadablePeriod period) {try{__CLR4_4_12bl2bllc8azs3x.R.inc(3292);
        __CLR4_4_12bl2bllc8azs3x.R.inc(3293);return withPeriodAdded(period, 1);
    }finally{__CLR4_4_12bl2bllc8azs3x.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Returns a copy of this datetime plus the specified number of years.
     * <p>
     * This LocalDateTime instance is immutable and unaffected by this method call.
     * <p>
     * The following three lines are identical in effect:
     * <pre>
     * LocalDateTime added = dt.plusYears(6);
     * LocalDateTime added = dt.plus(Period.years(6));
     * LocalDateTime added = dt.withFieldAdded(DurationFieldType.years(), 6);
     * </pre>
     *
     * @param years  the amount of years to add, may be negative
     * @return the new LocalDateTime plus the increased years
     */
    public LocalDateTime plusYears(int years) {try{__CLR4_4_12bl2bllc8azs3x.R.inc(3294);
        __CLR4_4_12bl2bllc8azs3x.R.inc(3295);if ((((years == 0)&&(__CLR4_4_12bl2bllc8azs3x.R.iget(3296)!=0|true))||(__CLR4_4_12bl2bllc8azs3x.R.iget(3297)==0&false))) {{
            __CLR4_4_12bl2bllc8azs3x.R.inc(3298);return this;
        }
        }__CLR4_4_12bl2bllc8azs3x.R.inc(3299);long instant = getChronology().years().add(getLocalMillis(), years);
        __CLR4_4_12bl2bllc8azs3x.R.inc(3300);return withLocalMillis(instant);
    }finally{__CLR4_4_12bl2bllc8azs3x.R.flushNeeded();}}

    /**
     * Returns a copy of this datetime plus the specified number of months.
     * <p>
     * This LocalDateTime instance is immutable and unaffected by this method call.
     * <p>
     * The following three lines are identical in effect:
     * <pre>
     * LocalDateTime added = dt.plusMonths(6);
     * LocalDateTime added = dt.plus(Period.months(6));
     * LocalDateTime added = dt.withFieldAdded(DurationFieldType.months(), 6);
     * </pre>
     *
     * @param months  the amount of months to add, may be negative
     * @return the new LocalDateTime plus the increased months
     */
    public LocalDateTime plusMonths(int months) {try{__CLR4_4_12bl2bllc8azs3x.R.inc(3301);
        __CLR4_4_12bl2bllc8azs3x.R.inc(3302);if ((((months == 0)&&(__CLR4_4_12bl2bllc8azs3x.R.iget(3303)!=0|true))||(__CLR4_4_12bl2bllc8azs3x.R.iget(3304)==0&false))) {{
            __CLR4_4_12bl2bllc8azs3x.R.inc(3305);return this;
        }
        }__CLR4_4_12bl2bllc8azs3x.R.inc(3306);long instant = getChronology().months().add(getLocalMillis(), months);
        __CLR4_4_12bl2bllc8azs3x.R.inc(3307);return withLocalMillis(instant);
    }finally{__CLR4_4_12bl2bllc8azs3x.R.flushNeeded();}}

    /**
     * Returns a copy of this datetime plus the specified number of weeks.
     * <p>
     * This LocalDateTime instance is immutable and unaffected by this method call.
     * <p>
     * The following three lines are identical in effect:
     * <pre>
     * LocalDateTime added = dt.plusWeeks(6);
     * LocalDateTime added = dt.plus(Period.weeks(6));
     * LocalDateTime added = dt.withFieldAdded(DurationFieldType.weeks(), 6);
     * </pre>
     *
     * @param weeks  the amount of weeks to add, may be negative
     * @return the new LocalDateTime plus the increased weeks
     */
    public LocalDateTime plusWeeks(int weeks) {try{__CLR4_4_12bl2bllc8azs3x.R.inc(3308);
        __CLR4_4_12bl2bllc8azs3x.R.inc(3309);if ((((weeks == 0)&&(__CLR4_4_12bl2bllc8azs3x.R.iget(3310)!=0|true))||(__CLR4_4_12bl2bllc8azs3x.R.iget(3311)==0&false))) {{
            __CLR4_4_12bl2bllc8azs3x.R.inc(3312);return this;
        }
        }__CLR4_4_12bl2bllc8azs3x.R.inc(3313);long instant = getChronology().weeks().add(getLocalMillis(), weeks);
        __CLR4_4_12bl2bllc8azs3x.R.inc(3314);return withLocalMillis(instant);
    }finally{__CLR4_4_12bl2bllc8azs3x.R.flushNeeded();}}

    /**
     * Returns a copy of this datetime plus the specified number of days.
     * <p>
     * This LocalDateTime instance is immutable and unaffected by this method call.
     * <p>
     * The following three lines are identical in effect:
     * <pre>
     * LocalDateTime added = dt.plusDays(6);
     * LocalDateTime added = dt.plus(Period.days(6));
     * LocalDateTime added = dt.withFieldAdded(DurationFieldType.days(), 6);
     * </pre>
     *
     * @param days  the amount of days to add, may be negative
     * @return the new LocalDateTime plus the increased days
     */
    public LocalDateTime plusDays(int days) {try{__CLR4_4_12bl2bllc8azs3x.R.inc(3315);
        __CLR4_4_12bl2bllc8azs3x.R.inc(3316);if ((((days == 0)&&(__CLR4_4_12bl2bllc8azs3x.R.iget(3317)!=0|true))||(__CLR4_4_12bl2bllc8azs3x.R.iget(3318)==0&false))) {{
            __CLR4_4_12bl2bllc8azs3x.R.inc(3319);return this;
        }
        }__CLR4_4_12bl2bllc8azs3x.R.inc(3320);long instant = getChronology().days().add(getLocalMillis(), days);
        __CLR4_4_12bl2bllc8azs3x.R.inc(3321);return withLocalMillis(instant);
    }finally{__CLR4_4_12bl2bllc8azs3x.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Returns a copy of this datetime plus the specified number of hours.
     * <p>
     * This LocalDateTime instance is immutable and unaffected by this method call.
     * <p>
     * The following three lines are identical in effect:
     * <pre>
     * LocalDateTime added = dt.plusHours(6);
     * LocalDateTime added = dt.plus(Period.hours(6));
     * LocalDateTime added = dt.withFieldAdded(DurationFieldType.hours(), 6);
     * </pre>
     *
     * @param hours  the amount of hours to add, may be negative
     * @return the new LocalDateTime plus the increased hours
     */
    public LocalDateTime plusHours(int hours) {try{__CLR4_4_12bl2bllc8azs3x.R.inc(3322);
        __CLR4_4_12bl2bllc8azs3x.R.inc(3323);if ((((hours == 0)&&(__CLR4_4_12bl2bllc8azs3x.R.iget(3324)!=0|true))||(__CLR4_4_12bl2bllc8azs3x.R.iget(3325)==0&false))) {{
            __CLR4_4_12bl2bllc8azs3x.R.inc(3326);return this;
        }
        }__CLR4_4_12bl2bllc8azs3x.R.inc(3327);long instant = getChronology().hours().add(getLocalMillis(), hours);
        __CLR4_4_12bl2bllc8azs3x.R.inc(3328);return withLocalMillis(instant);
    }finally{__CLR4_4_12bl2bllc8azs3x.R.flushNeeded();}}

    /**
     * Returns a copy of this datetime plus the specified number of minutes.
     * <p>
     * This LocalDateTime instance is immutable and unaffected by this method call.
     * <p>
     * The following three lines are identical in effect:
     * <pre>
     * LocalDateTime added = dt.plusMinutes(6);
     * LocalDateTime added = dt.plus(Period.minutes(6));
     * LocalDateTime added = dt.withFieldAdded(DurationFieldType.minutes(), 6);
     * </pre>
     *
     * @param minutes  the amount of minutes to add, may be negative
     * @return the new LocalDateTime plus the increased minutes
     */
    public LocalDateTime plusMinutes(int minutes) {try{__CLR4_4_12bl2bllc8azs3x.R.inc(3329);
        __CLR4_4_12bl2bllc8azs3x.R.inc(3330);if ((((minutes == 0)&&(__CLR4_4_12bl2bllc8azs3x.R.iget(3331)!=0|true))||(__CLR4_4_12bl2bllc8azs3x.R.iget(3332)==0&false))) {{
            __CLR4_4_12bl2bllc8azs3x.R.inc(3333);return this;
        }
        }__CLR4_4_12bl2bllc8azs3x.R.inc(3334);long instant = getChronology().minutes().add(getLocalMillis(), minutes);
        __CLR4_4_12bl2bllc8azs3x.R.inc(3335);return withLocalMillis(instant);
    }finally{__CLR4_4_12bl2bllc8azs3x.R.flushNeeded();}}

    /**
     * Returns a copy of this datetime plus the specified number of seconds.
     * <p>
     * This LocalDateTime instance is immutable and unaffected by this method call.
     * <p>
     * The following three lines are identical in effect:
     * <pre>
     * LocalDateTime added = dt.plusSeconds(6);
     * LocalDateTime added = dt.plus(Period.seconds(6));
     * LocalDateTime added = dt.withFieldAdded(DurationFieldType.seconds(), 6);
     * </pre>
     *
     * @param seconds  the amount of seconds to add, may be negative
     * @return the new LocalDateTime plus the increased seconds
     */
    public LocalDateTime plusSeconds(int seconds) {try{__CLR4_4_12bl2bllc8azs3x.R.inc(3336);
        __CLR4_4_12bl2bllc8azs3x.R.inc(3337);if ((((seconds == 0)&&(__CLR4_4_12bl2bllc8azs3x.R.iget(3338)!=0|true))||(__CLR4_4_12bl2bllc8azs3x.R.iget(3339)==0&false))) {{
            __CLR4_4_12bl2bllc8azs3x.R.inc(3340);return this;
        }
        }__CLR4_4_12bl2bllc8azs3x.R.inc(3341);long instant = getChronology().seconds().add(getLocalMillis(), seconds);
        __CLR4_4_12bl2bllc8azs3x.R.inc(3342);return withLocalMillis(instant);
    }finally{__CLR4_4_12bl2bllc8azs3x.R.flushNeeded();}}

    /**
     * Returns a copy of this datetime plus the specified number of millis.
     * <p>
     * This LocalDateTime instance is immutable and unaffected by this method call.
     * <p>
     * The following three lines are identical in effect:
     * <pre>
     * LocalDateTime added = dt.plusMillis(6);
     * LocalDateTime added = dt.plus(Period.millis(6));
     * LocalDateTime added = dt.withFieldAdded(DurationFieldType.millis(), 6);
     * </pre>
     *
     * @param millis  the amount of millis to add, may be negative
     * @return the new LocalDateTime plus the increased millis
     */
    public LocalDateTime plusMillis(int millis) {try{__CLR4_4_12bl2bllc8azs3x.R.inc(3343);
        __CLR4_4_12bl2bllc8azs3x.R.inc(3344);if ((((millis == 0)&&(__CLR4_4_12bl2bllc8azs3x.R.iget(3345)!=0|true))||(__CLR4_4_12bl2bllc8azs3x.R.iget(3346)==0&false))) {{
            __CLR4_4_12bl2bllc8azs3x.R.inc(3347);return this;
        }
        }__CLR4_4_12bl2bllc8azs3x.R.inc(3348);long instant = getChronology().millis().add(getLocalMillis(), millis);
        __CLR4_4_12bl2bllc8azs3x.R.inc(3349);return withLocalMillis(instant);
    }finally{__CLR4_4_12bl2bllc8azs3x.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Returns a copy of this datetime with the specified duration taken away.
     * <p>
     * If the amount is zero or null, then <code>this</code> is returned.
     *
     * @param duration  the duration to reduce this instant by
     * @return a copy of this datetime with the duration taken away
     * @throws ArithmeticException if the result exceeds the internal capacity
     */
    public LocalDateTime minus(ReadableDuration duration) {try{__CLR4_4_12bl2bllc8azs3x.R.inc(3350);
        __CLR4_4_12bl2bllc8azs3x.R.inc(3351);return withDurationAdded(duration, -1);
    }finally{__CLR4_4_12bl2bllc8azs3x.R.flushNeeded();}}

    /**
     * Returns a copy of this datetime with the specified period taken away.
     * <p>
     * If the amount is zero or null, then <code>this</code> is returned.
     * <p>
     * This method is typically used to subtract complex period instances.
     * Subtracting one field is best achieved using methods
     * like {@link #minusYears(int)}.
     *
     * @param period  the period to reduce this instant by
     * @return a copy of this datetime with the period taken away
     * @throws ArithmeticException if the result exceeds the internal capacity
     */
    public LocalDateTime minus(ReadablePeriod period) {try{__CLR4_4_12bl2bllc8azs3x.R.inc(3352);
        __CLR4_4_12bl2bllc8azs3x.R.inc(3353);return withPeriodAdded(period, -1);
    }finally{__CLR4_4_12bl2bllc8azs3x.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Returns a copy of this datetime minus the specified number of years.
     * <p>
     * This LocalDateTime instance is immutable and unaffected by this method call.
     * <p>
     * The following three lines are identical in effect:
     * <pre>
     * LocalDateTime subtracted = dt.minusYears(6);
     * LocalDateTime subtracted = dt.minus(Period.years(6));
     * LocalDateTime subtracted = dt.withFieldAdded(DurationFieldType.years(), -6);
     * </pre>
     *
     * @param years  the amount of years to subtract, may be negative
     * @return the new LocalDateTime minus the increased years
     */
    public LocalDateTime minusYears(int years) {try{__CLR4_4_12bl2bllc8azs3x.R.inc(3354);
        __CLR4_4_12bl2bllc8azs3x.R.inc(3355);if ((((years == 0)&&(__CLR4_4_12bl2bllc8azs3x.R.iget(3356)!=0|true))||(__CLR4_4_12bl2bllc8azs3x.R.iget(3357)==0&false))) {{
            __CLR4_4_12bl2bllc8azs3x.R.inc(3358);return this;
        }
        }__CLR4_4_12bl2bllc8azs3x.R.inc(3359);long instant = getChronology().years().subtract(getLocalMillis(), years);
        __CLR4_4_12bl2bllc8azs3x.R.inc(3360);return withLocalMillis(instant);
    }finally{__CLR4_4_12bl2bllc8azs3x.R.flushNeeded();}}

    /**
     * Returns a copy of this datetime minus the specified number of months.
     * <p>
     * This LocalDateTime instance is immutable and unaffected by this method call.
     * <p>
     * The following three lines are identical in effect:
     * <pre>
     * LocalDateTime subtracted = dt.minusMonths(6);
     * LocalDateTime subtracted = dt.minus(Period.months(6));
     * LocalDateTime subtracted = dt.withFieldAdded(DurationFieldType.months(), -6);
     * </pre>
     *
     * @param months  the amount of months to subtract, may be negative
     * @return the new LocalDateTime minus the increased months
     */
    public LocalDateTime minusMonths(int months) {try{__CLR4_4_12bl2bllc8azs3x.R.inc(3361);
        __CLR4_4_12bl2bllc8azs3x.R.inc(3362);if ((((months == 0)&&(__CLR4_4_12bl2bllc8azs3x.R.iget(3363)!=0|true))||(__CLR4_4_12bl2bllc8azs3x.R.iget(3364)==0&false))) {{
            __CLR4_4_12bl2bllc8azs3x.R.inc(3365);return this;
        }
        }__CLR4_4_12bl2bllc8azs3x.R.inc(3366);long instant = getChronology().months().subtract(getLocalMillis(), months);
        __CLR4_4_12bl2bllc8azs3x.R.inc(3367);return withLocalMillis(instant);
    }finally{__CLR4_4_12bl2bllc8azs3x.R.flushNeeded();}}

    /**
     * Returns a copy of this datetime minus the specified number of weeks.
     * <p>
     * This LocalDateTime instance is immutable and unaffected by this method call.
     * <p>
     * The following three lines are identical in effect:
     * <pre>
     * LocalDateTime subtracted = dt.minusWeeks(6);
     * LocalDateTime subtracted = dt.minus(Period.weeks(6));
     * LocalDateTime subtracted = dt.withFieldAdded(DurationFieldType.weeks(), -6);
     * </pre>
     *
     * @param weeks  the amount of weeks to subtract, may be negative
     * @return the new LocalDateTime minus the increased weeks
     */
    public LocalDateTime minusWeeks(int weeks) {try{__CLR4_4_12bl2bllc8azs3x.R.inc(3368);
        __CLR4_4_12bl2bllc8azs3x.R.inc(3369);if ((((weeks == 0)&&(__CLR4_4_12bl2bllc8azs3x.R.iget(3370)!=0|true))||(__CLR4_4_12bl2bllc8azs3x.R.iget(3371)==0&false))) {{
            __CLR4_4_12bl2bllc8azs3x.R.inc(3372);return this;
        }
        }__CLR4_4_12bl2bllc8azs3x.R.inc(3373);long instant = getChronology().weeks().subtract(getLocalMillis(), weeks);
        __CLR4_4_12bl2bllc8azs3x.R.inc(3374);return withLocalMillis(instant);
    }finally{__CLR4_4_12bl2bllc8azs3x.R.flushNeeded();}}

    /**
     * Returns a copy of this datetime minus the specified number of days.
     * <p>
     * This LocalDateTime instance is immutable and unaffected by this method call.
     * <p>
     * The following three lines are identical in effect:
     * <pre>
     * LocalDateTime subtracted = dt.minusDays(6);
     * LocalDateTime subtracted = dt.minus(Period.days(6));
     * LocalDateTime subtracted = dt.withFieldAdded(DurationFieldType.days(), -6);
     * </pre>
     *
     * @param days  the amount of days to subtract, may be negative
     * @return the new LocalDateTime minus the increased days
     */
    public LocalDateTime minusDays(int days) {try{__CLR4_4_12bl2bllc8azs3x.R.inc(3375);
        __CLR4_4_12bl2bllc8azs3x.R.inc(3376);if ((((days == 0)&&(__CLR4_4_12bl2bllc8azs3x.R.iget(3377)!=0|true))||(__CLR4_4_12bl2bllc8azs3x.R.iget(3378)==0&false))) {{
            __CLR4_4_12bl2bllc8azs3x.R.inc(3379);return this;
        }
        }__CLR4_4_12bl2bllc8azs3x.R.inc(3380);long instant = getChronology().days().subtract(getLocalMillis(), days);
        __CLR4_4_12bl2bllc8azs3x.R.inc(3381);return withLocalMillis(instant);
    }finally{__CLR4_4_12bl2bllc8azs3x.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Returns a copy of this datetime minus the specified number of hours.
     * <p>
     * This LocalDateTime instance is immutable and unaffected by this method call.
     * <p>
     * The following three lines are identical in effect:
     * <pre>
     * LocalDateTime subtracted = dt.minusHours(6);
     * LocalDateTime subtracted = dt.minus(Period.hours(6));
     * LocalDateTime subtracted = dt.withFieldAdded(DurationFieldType.hours(), -6);
     * </pre>
     *
     * @param hours  the amount of hours to subtract, may be negative
     * @return the new LocalDateTime minus the increased hours
     */
    public LocalDateTime minusHours(int hours) {try{__CLR4_4_12bl2bllc8azs3x.R.inc(3382);
        __CLR4_4_12bl2bllc8azs3x.R.inc(3383);if ((((hours == 0)&&(__CLR4_4_12bl2bllc8azs3x.R.iget(3384)!=0|true))||(__CLR4_4_12bl2bllc8azs3x.R.iget(3385)==0&false))) {{
            __CLR4_4_12bl2bllc8azs3x.R.inc(3386);return this;
        }
        }__CLR4_4_12bl2bllc8azs3x.R.inc(3387);long instant = getChronology().hours().subtract(getLocalMillis(), hours);
        __CLR4_4_12bl2bllc8azs3x.R.inc(3388);return withLocalMillis(instant);
    }finally{__CLR4_4_12bl2bllc8azs3x.R.flushNeeded();}}

    /**
     * Returns a copy of this datetime minus the specified number of minutes.
     * <p>
     * This LocalDateTime instance is immutable and unaffected by this method call.
     * <p>
     * The following three lines are identical in effect:
     * <pre>
     * LocalDateTime subtracted = dt.minusMinutes(6);
     * LocalDateTime subtracted = dt.minus(Period.minutes(6));
     * LocalDateTime subtracted = dt.withFieldAdded(DurationFieldType.minutes(), -6);
     * </pre>
     *
     * @param minutes  the amount of minutes to subtract, may be negative
     * @return the new LocalDateTime minus the increased minutes
     */
    public LocalDateTime minusMinutes(int minutes) {try{__CLR4_4_12bl2bllc8azs3x.R.inc(3389);
        __CLR4_4_12bl2bllc8azs3x.R.inc(3390);if ((((minutes == 0)&&(__CLR4_4_12bl2bllc8azs3x.R.iget(3391)!=0|true))||(__CLR4_4_12bl2bllc8azs3x.R.iget(3392)==0&false))) {{
            __CLR4_4_12bl2bllc8azs3x.R.inc(3393);return this;
        }
        }__CLR4_4_12bl2bllc8azs3x.R.inc(3394);long instant = getChronology().minutes().subtract(getLocalMillis(), minutes);
        __CLR4_4_12bl2bllc8azs3x.R.inc(3395);return withLocalMillis(instant);
    }finally{__CLR4_4_12bl2bllc8azs3x.R.flushNeeded();}}

    /**
     * Returns a copy of this datetime minus the specified number of seconds.
     * <p>
     * This LocalDateTime instance is immutable and unaffected by this method call.
     * <p>
     * The following three lines are identical in effect:
     * <pre>
     * LocalDateTime subtracted = dt.minusSeconds(6);
     * LocalDateTime subtracted = dt.minus(Period.seconds(6));
     * LocalDateTime subtracted = dt.withFieldAdded(DurationFieldType.seconds(), -6);
     * </pre>
     *
     * @param seconds  the amount of seconds to subtract, may be negative
     * @return the new LocalDateTime minus the increased seconds
     */
    public LocalDateTime minusSeconds(int seconds) {try{__CLR4_4_12bl2bllc8azs3x.R.inc(3396);
        __CLR4_4_12bl2bllc8azs3x.R.inc(3397);if ((((seconds == 0)&&(__CLR4_4_12bl2bllc8azs3x.R.iget(3398)!=0|true))||(__CLR4_4_12bl2bllc8azs3x.R.iget(3399)==0&false))) {{
            __CLR4_4_12bl2bllc8azs3x.R.inc(3400);return this;
        }
        }__CLR4_4_12bl2bllc8azs3x.R.inc(3401);long instant = getChronology().seconds().subtract(getLocalMillis(), seconds);
        __CLR4_4_12bl2bllc8azs3x.R.inc(3402);return withLocalMillis(instant);
    }finally{__CLR4_4_12bl2bllc8azs3x.R.flushNeeded();}}

    /**
     * Returns a copy of this datetime minus the specified number of millis.
     * <p>
     * This LocalDateTime instance is immutable and unaffected by this method call.
     * <p>
     * The following three lines are identical in effect:
     * <pre>
     * LocalDateTime subtracted = dt.minusMillis(6);
     * LocalDateTime subtracted = dt.minus(Period.millis(6));
     * LocalDateTime subtracted = dt.withFieldAdded(DurationFieldType.millis(), -6);
     * </pre>
     *
     * @param millis  the amount of millis to subtract, may be negative
     * @return the new LocalDateTime minus the increased millis
     */
    public LocalDateTime minusMillis(int millis) {try{__CLR4_4_12bl2bllc8azs3x.R.inc(3403);
        __CLR4_4_12bl2bllc8azs3x.R.inc(3404);if ((((millis == 0)&&(__CLR4_4_12bl2bllc8azs3x.R.iget(3405)!=0|true))||(__CLR4_4_12bl2bllc8azs3x.R.iget(3406)==0&false))) {{
            __CLR4_4_12bl2bllc8azs3x.R.inc(3407);return this;
        }
        }__CLR4_4_12bl2bllc8azs3x.R.inc(3408);long instant = getChronology().millis().subtract(getLocalMillis(), millis);
        __CLR4_4_12bl2bllc8azs3x.R.inc(3409);return withLocalMillis(instant);
    }finally{__CLR4_4_12bl2bllc8azs3x.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Gets the property object for the specified type, which contains many
     * useful methods.
     *
     * @param fieldType  the field type to get the chronology for
     * @return the property object
     * @throws IllegalArgumentException if the field is null or unsupported
     */
    public Property property(DateTimeFieldType fieldType) {try{__CLR4_4_12bl2bllc8azs3x.R.inc(3410);
        __CLR4_4_12bl2bllc8azs3x.R.inc(3411);if ((((fieldType == null)&&(__CLR4_4_12bl2bllc8azs3x.R.iget(3412)!=0|true))||(__CLR4_4_12bl2bllc8azs3x.R.iget(3413)==0&false))) {{
            __CLR4_4_12bl2bllc8azs3x.R.inc(3414);throw new IllegalArgumentException("The DateTimeFieldType must not be null");
        }
        }__CLR4_4_12bl2bllc8azs3x.R.inc(3415);if ((((isSupported(fieldType) == false)&&(__CLR4_4_12bl2bllc8azs3x.R.iget(3416)!=0|true))||(__CLR4_4_12bl2bllc8azs3x.R.iget(3417)==0&false))) {{
            __CLR4_4_12bl2bllc8azs3x.R.inc(3418);throw new IllegalArgumentException("Field '" + fieldType + "' is not supported");
        }
        }__CLR4_4_12bl2bllc8azs3x.R.inc(3419);return new Property(this, fieldType.getField(getChronology()));
    }finally{__CLR4_4_12bl2bllc8azs3x.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Get the era field value.
     *
     * @return the era
     */
    public int getEra() {try{__CLR4_4_12bl2bllc8azs3x.R.inc(3420);
        __CLR4_4_12bl2bllc8azs3x.R.inc(3421);return getChronology().era().get(getLocalMillis());
    }finally{__CLR4_4_12bl2bllc8azs3x.R.flushNeeded();}}

    /**
     * Get the year of era field value.
     *
     * @return the year of era
     */
    public int getCenturyOfEra() {try{__CLR4_4_12bl2bllc8azs3x.R.inc(3422);
        __CLR4_4_12bl2bllc8azs3x.R.inc(3423);return getChronology().centuryOfEra().get(getLocalMillis());
    }finally{__CLR4_4_12bl2bllc8azs3x.R.flushNeeded();}}

    /**
     * Get the year of era field value.
     *
     * @return the year of era
     */
    public int getYearOfEra() {try{__CLR4_4_12bl2bllc8azs3x.R.inc(3424);
        __CLR4_4_12bl2bllc8azs3x.R.inc(3425);return getChronology().yearOfEra().get(getLocalMillis());
    }finally{__CLR4_4_12bl2bllc8azs3x.R.flushNeeded();}}

    /**
     * Get the year of century field value.
     *
     * @return the year of century
     */
    public int getYearOfCentury() {try{__CLR4_4_12bl2bllc8azs3x.R.inc(3426);
        __CLR4_4_12bl2bllc8azs3x.R.inc(3427);return getChronology().yearOfCentury().get(getLocalMillis());
    }finally{__CLR4_4_12bl2bllc8azs3x.R.flushNeeded();}}

    /**
     * Get the year field value.
     *
     * @return the year
     */
    public int getYear() {try{__CLR4_4_12bl2bllc8azs3x.R.inc(3428);
        __CLR4_4_12bl2bllc8azs3x.R.inc(3429);return getChronology().year().get(getLocalMillis());
    }finally{__CLR4_4_12bl2bllc8azs3x.R.flushNeeded();}}

    /**
     * Get the weekyear field value.
     * <p>
     * The weekyear is the year that matches with the weekOfWeekyear field.
     * In the standard ISO8601 week algorithm, the first week of the year
     * is that in which at least 4 days are in the year. As a result of this
     * definition, day 1 of the first week may be in the previous year.
     * The weekyear allows you to query the effective year for that day.
     *
     * @return the weekyear
     */
    public int getWeekyear() {try{__CLR4_4_12bl2bllc8azs3x.R.inc(3430);
        __CLR4_4_12bl2bllc8azs3x.R.inc(3431);return getChronology().weekyear().get(getLocalMillis());
    }finally{__CLR4_4_12bl2bllc8azs3x.R.flushNeeded();}}

    /**
     * Get the month of year field value.
     *
     * @return the month of year
     */
    public int getMonthOfYear() {try{__CLR4_4_12bl2bllc8azs3x.R.inc(3432);
        __CLR4_4_12bl2bllc8azs3x.R.inc(3433);return getChronology().monthOfYear().get(getLocalMillis());
    }finally{__CLR4_4_12bl2bllc8azs3x.R.flushNeeded();}}

    /**
     * Get the week of weekyear field value.
     * <p>
     * This field is associated with the "weekyear" via {@link #getWeekyear()}.
     * In the standard ISO8601 week algorithm, the first week of the year
     * is that in which at least 4 days are in the year. As a result of this
     * definition, day 1 of the first week may be in the previous year.
     *
     * @return the week of a week based year
     */
    public int getWeekOfWeekyear() {try{__CLR4_4_12bl2bllc8azs3x.R.inc(3434);
        __CLR4_4_12bl2bllc8azs3x.R.inc(3435);return getChronology().weekOfWeekyear().get(getLocalMillis());
    }finally{__CLR4_4_12bl2bllc8azs3x.R.flushNeeded();}}

    /**
     * Get the day of year field value.
     *
     * @return the day of year
     */
    public int getDayOfYear() {try{__CLR4_4_12bl2bllc8azs3x.R.inc(3436);
        __CLR4_4_12bl2bllc8azs3x.R.inc(3437);return getChronology().dayOfYear().get(getLocalMillis());
    }finally{__CLR4_4_12bl2bllc8azs3x.R.flushNeeded();}}

    /**
     * Get the day of month field value.
     * <p>
     * The values for the day of month are defined in {@link org.joda.time.DateTimeConstants}.
     *
     * @return the day of month
     */
    public int getDayOfMonth() {try{__CLR4_4_12bl2bllc8azs3x.R.inc(3438);
        __CLR4_4_12bl2bllc8azs3x.R.inc(3439);return getChronology().dayOfMonth().get(getLocalMillis());
    }finally{__CLR4_4_12bl2bllc8azs3x.R.flushNeeded();}}

    /**
     * Get the day of week field value.
     * <p>
     * The values for the day of week are defined in {@link org.joda.time.DateTimeConstants}.
     *
     * @return the day of week
     */
    public int getDayOfWeek() {try{__CLR4_4_12bl2bllc8azs3x.R.inc(3440);
        __CLR4_4_12bl2bllc8azs3x.R.inc(3441);return getChronology().dayOfWeek().get(getLocalMillis());
    }finally{__CLR4_4_12bl2bllc8azs3x.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Get the hour of day field value.
     *
     * @return the hour of day
     */
    public int getHourOfDay() {try{__CLR4_4_12bl2bllc8azs3x.R.inc(3442);
        __CLR4_4_12bl2bllc8azs3x.R.inc(3443);return getChronology().hourOfDay().get(getLocalMillis());
    }finally{__CLR4_4_12bl2bllc8azs3x.R.flushNeeded();}}

    /**
     * Get the minute of hour field value.
     *
     * @return the minute of hour
     */
    public int getMinuteOfHour() {try{__CLR4_4_12bl2bllc8azs3x.R.inc(3444);
        __CLR4_4_12bl2bllc8azs3x.R.inc(3445);return getChronology().minuteOfHour().get(getLocalMillis());
    }finally{__CLR4_4_12bl2bllc8azs3x.R.flushNeeded();}}

    /**
     * Get the second of minute field value.
     *
     * @return the second of minute
     */
    public int getSecondOfMinute() {try{__CLR4_4_12bl2bllc8azs3x.R.inc(3446);
        __CLR4_4_12bl2bllc8azs3x.R.inc(3447);return getChronology().secondOfMinute().get(getLocalMillis());
    }finally{__CLR4_4_12bl2bllc8azs3x.R.flushNeeded();}}

    /**
     * Get the millis of second field value.
     *
     * @return the millis of second
     */
    public int getMillisOfSecond() {try{__CLR4_4_12bl2bllc8azs3x.R.inc(3448);
        __CLR4_4_12bl2bllc8azs3x.R.inc(3449);return getChronology().millisOfSecond().get(getLocalMillis());
    }finally{__CLR4_4_12bl2bllc8azs3x.R.flushNeeded();}}

    /**
     * Get the millis of day field value.
     *
     * @return the millis of day
     */
    public int getMillisOfDay() {try{__CLR4_4_12bl2bllc8azs3x.R.inc(3450);
        __CLR4_4_12bl2bllc8azs3x.R.inc(3451);return getChronology().millisOfDay().get(getLocalMillis());
    }finally{__CLR4_4_12bl2bllc8azs3x.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Returns a copy of this datetime with the era field updated.
     * <p>
     * LocalDateTime is immutable, so there are no set methods.
     * Instead, this method returns a new instance with the value of
     * era changed.
     *
     * @param era  the era to set
     * @return a copy of this object with the field set
     * @throws IllegalArgumentException if the value is invalid
     */
    public LocalDateTime withEra(int era) {try{__CLR4_4_12bl2bllc8azs3x.R.inc(3452);
        __CLR4_4_12bl2bllc8azs3x.R.inc(3453);return withLocalMillis(getChronology().era().set(getLocalMillis(), era));
    }finally{__CLR4_4_12bl2bllc8azs3x.R.flushNeeded();}}

    /**
     * Returns a copy of this datetime with the century of era field updated.
     * <p>
     * LocalDateTime is immutable, so there are no set methods.
     * Instead, this method returns a new instance with the value of
     * century of era changed.
     *
     * @param centuryOfEra  the centurey of era to set
     * @return a copy of this object with the field set
     * @throws IllegalArgumentException if the value is invalid
     */
    public LocalDateTime withCenturyOfEra(int centuryOfEra) {try{__CLR4_4_12bl2bllc8azs3x.R.inc(3454);
        __CLR4_4_12bl2bllc8azs3x.R.inc(3455);return withLocalMillis(getChronology().centuryOfEra().set(getLocalMillis(), centuryOfEra));
    }finally{__CLR4_4_12bl2bllc8azs3x.R.flushNeeded();}}

    /**
     * Returns a copy of this datetime with the year of era field updated.
     * <p>
     * LocalDateTime is immutable, so there are no set methods.
     * Instead, this method returns a new instance with the value of
     * year of era changed.
     *
     * @param yearOfEra  the year of era to set
     * @return a copy of this object with the field set
     * @throws IllegalArgumentException if the value is invalid
     */
    public LocalDateTime withYearOfEra(int yearOfEra) {try{__CLR4_4_12bl2bllc8azs3x.R.inc(3456);
        __CLR4_4_12bl2bllc8azs3x.R.inc(3457);return withLocalMillis(getChronology().yearOfEra().set(getLocalMillis(), yearOfEra));
    }finally{__CLR4_4_12bl2bllc8azs3x.R.flushNeeded();}}

    /**
     * Returns a copy of this datetime with the year of century field updated.
     * <p>
     * LocalDateTime is immutable, so there are no set methods.
     * Instead, this method returns a new instance with the value of
     * year of century changed.
     *
     * @param yearOfCentury  the year of century to set
     * @return a copy of this object with the field set
     * @throws IllegalArgumentException if the value is invalid
     */
    public LocalDateTime withYearOfCentury(int yearOfCentury) {try{__CLR4_4_12bl2bllc8azs3x.R.inc(3458);
        __CLR4_4_12bl2bllc8azs3x.R.inc(3459);return withLocalMillis(getChronology().yearOfCentury().set(getLocalMillis(), yearOfCentury));
    }finally{__CLR4_4_12bl2bllc8azs3x.R.flushNeeded();}}

    /**
     * Returns a copy of this datetime with the year field updated.
     * <p>
     * LocalDateTime is immutable, so there are no set methods.
     * Instead, this method returns a new instance with the value of
     * year changed.
     *
     * @param year  the year to set
     * @return a copy of this object with the field set
     * @throws IllegalArgumentException if the value is invalid
     */
    public LocalDateTime withYear(int year) {try{__CLR4_4_12bl2bllc8azs3x.R.inc(3460);
        __CLR4_4_12bl2bllc8azs3x.R.inc(3461);return withLocalMillis(getChronology().year().set(getLocalMillis(), year));
    }finally{__CLR4_4_12bl2bllc8azs3x.R.flushNeeded();}}

    /**
     * Returns a copy of this datetime with the weekyear field updated.
     * <p>
     * The weekyear is the year that matches with the weekOfWeekyear field.
     * In the standard ISO8601 week algorithm, the first week of the year
     * is that in which at least 4 days are in the year. As a result of this
     * definition, day 1 of the first week may be in the previous year.
     * The weekyear allows you to query the effective year for that day.
     * <p>
     * LocalDateTime is immutable, so there are no set methods.
     * Instead, this method returns a new instance with the value of
     * weekyear changed.
     *
     * @param weekyear  the weekyear to set
     * @return a copy of this object with the field set
     * @throws IllegalArgumentException if the value is invalid
     */
    public LocalDateTime withWeekyear(int weekyear) {try{__CLR4_4_12bl2bllc8azs3x.R.inc(3462);
        __CLR4_4_12bl2bllc8azs3x.R.inc(3463);return withLocalMillis(getChronology().weekyear().set(getLocalMillis(), weekyear));
    }finally{__CLR4_4_12bl2bllc8azs3x.R.flushNeeded();}}

    /**
     * Returns a copy of this datetime with the month of year field updated.
     * <p>
     * LocalDateTime is immutable, so there are no set methods.
     * Instead, this method returns a new instance with the value of
     * month of year changed.
     *
     * @param monthOfYear  the month of year to set
     * @return a copy of this object with the field set
     * @throws IllegalArgumentException if the value is invalid
     */
    public LocalDateTime withMonthOfYear(int monthOfYear) {try{__CLR4_4_12bl2bllc8azs3x.R.inc(3464);
        __CLR4_4_12bl2bllc8azs3x.R.inc(3465);return withLocalMillis(getChronology().monthOfYear().set(getLocalMillis(), monthOfYear));
    }finally{__CLR4_4_12bl2bllc8azs3x.R.flushNeeded();}}

    /**
     * Returns a copy of this datetime with the week of weekyear field updated.
     * <p>
     * This field is associated with the "weekyear" via {@link #withWeekyear(int)}.
     * In the standard ISO8601 week algorithm, the first week of the year
     * is that in which at least 4 days are in the year. As a result of this
     * definition, day 1 of the first week may be in the previous year.
     * <p>
     * LocalDateTime is immutable, so there are no set methods.
     * Instead, this method returns a new instance with the value of
     * week of weekyear changed.
     *
     * @param weekOfWeekyear  the week of weekyear to set
     * @return a copy of this object with the field set
     * @throws IllegalArgumentException if the value is invalid
     */
    public LocalDateTime withWeekOfWeekyear(int weekOfWeekyear) {try{__CLR4_4_12bl2bllc8azs3x.R.inc(3466);
        __CLR4_4_12bl2bllc8azs3x.R.inc(3467);return withLocalMillis(getChronology().weekOfWeekyear().set(getLocalMillis(), weekOfWeekyear));
    }finally{__CLR4_4_12bl2bllc8azs3x.R.flushNeeded();}}

    /**
     * Returns a copy of this datetime with the day of year field updated.
     * <p>
     * LocalDateTime is immutable, so there are no set methods.
     * Instead, this method returns a new instance with the value of
     * day of year changed.
     *
     * @param dayOfYear  the day of year to set
     * @return a copy of this object with the field set
     * @throws IllegalArgumentException if the value is invalid
     */
    public LocalDateTime withDayOfYear(int dayOfYear) {try{__CLR4_4_12bl2bllc8azs3x.R.inc(3468);
        __CLR4_4_12bl2bllc8azs3x.R.inc(3469);return withLocalMillis(getChronology().dayOfYear().set(getLocalMillis(), dayOfYear));
    }finally{__CLR4_4_12bl2bllc8azs3x.R.flushNeeded();}}

    /**
     * Returns a copy of this datetime with the day of month field updated.
     * <p>
     * LocalDateTime is immutable, so there are no set methods.
     * Instead, this method returns a new instance with the value of
     * day of month changed.
     *
     * @param dayOfMonth  the day of month to set
     * @return a copy of this object with the field set
     * @throws IllegalArgumentException if the value is invalid
     */
    public LocalDateTime withDayOfMonth(int dayOfMonth) {try{__CLR4_4_12bl2bllc8azs3x.R.inc(3470);
        __CLR4_4_12bl2bllc8azs3x.R.inc(3471);return withLocalMillis(getChronology().dayOfMonth().set(getLocalMillis(), dayOfMonth));
    }finally{__CLR4_4_12bl2bllc8azs3x.R.flushNeeded();}}

    /**
     * Returns a copy of this datetime with the day of week field updated.
     * <p>
     * LocalDateTime is immutable, so there are no set methods.
     * Instead, this method returns a new instance with the value of
     * day of week changed.
     *
     * @param dayOfWeek  the day of week to set
     * @return a copy of this object with the field set
     * @throws IllegalArgumentException if the value is invalid
     */
    public LocalDateTime withDayOfWeek(int dayOfWeek) {try{__CLR4_4_12bl2bllc8azs3x.R.inc(3472);
        __CLR4_4_12bl2bllc8azs3x.R.inc(3473);return withLocalMillis(getChronology().dayOfWeek().set(getLocalMillis(), dayOfWeek));
    }finally{__CLR4_4_12bl2bllc8azs3x.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Returns a copy of this datetime with the hour of day field updated.
     * <p>
     * LocalDateTime is immutable, so there are no set methods.
     * Instead, this method returns a new instance with the value of
     * hour of day changed.
     *
     * @param hour  the hour of day to set
     * @return a copy of this object with the field set
     * @throws IllegalArgumentException if the value is invalid
     */
    public LocalDateTime withHourOfDay(int hour) {try{__CLR4_4_12bl2bllc8azs3x.R.inc(3474);
        __CLR4_4_12bl2bllc8azs3x.R.inc(3475);return withLocalMillis(getChronology().hourOfDay().set(getLocalMillis(), hour));
    }finally{__CLR4_4_12bl2bllc8azs3x.R.flushNeeded();}}

    /**
     * Returns a copy of this datetime with the minute of hour field updated.
     * <p>
     * LocalDateTime is immutable, so there are no set methods.
     * Instead, this method returns a new instance with the value of
     * minute of hour changed.
     *
     * @param minute  the minute of hour to set
     * @return a copy of this object with the field set
     * @throws IllegalArgumentException if the value is invalid
     */
    public LocalDateTime withMinuteOfHour(int minute) {try{__CLR4_4_12bl2bllc8azs3x.R.inc(3476);
        __CLR4_4_12bl2bllc8azs3x.R.inc(3477);return withLocalMillis(getChronology().minuteOfHour().set(getLocalMillis(), minute));
    }finally{__CLR4_4_12bl2bllc8azs3x.R.flushNeeded();}}

    /**
     * Returns a copy of this datetime with the second of minute field updated.
     * <p>
     * LocalDateTime is immutable, so there are no set methods.
     * Instead, this method returns a new instance with the value of
     * second of minute changed.
     *
     * @param second  the second of minute to set
     * @return a copy of this object with the field set
     * @throws IllegalArgumentException if the value is invalid
     */
    public LocalDateTime withSecondOfMinute(int second) {try{__CLR4_4_12bl2bllc8azs3x.R.inc(3478);
        __CLR4_4_12bl2bllc8azs3x.R.inc(3479);return withLocalMillis(getChronology().secondOfMinute().set(getLocalMillis(), second));
    }finally{__CLR4_4_12bl2bllc8azs3x.R.flushNeeded();}}

    /**
     * Returns a copy of this datetime with the millis of second field updated.
     * <p>
     * LocalDateTime is immutable, so there are no set methods.
     * Instead, this method returns a new instance with the value of
     * millis of second changed.
     *
     * @param millis  the millis of second to set
     * @return a copy of this object with the field set
     * @throws IllegalArgumentException if the value is invalid
     */
    public LocalDateTime withMillisOfSecond(int millis) {try{__CLR4_4_12bl2bllc8azs3x.R.inc(3480);
        __CLR4_4_12bl2bllc8azs3x.R.inc(3481);return withLocalMillis(getChronology().millisOfSecond().set(getLocalMillis(), millis));
    }finally{__CLR4_4_12bl2bllc8azs3x.R.flushNeeded();}}

    /**
     * Returns a copy of this datetime with the millis of day field updated.
     * <p>
     * LocalDateTime is immutable, so there are no set methods.
     * Instead, this method returns a new instance with the value of
     * millis of day changed.
     *
     * @param millis  the millis of day to set
     * @return a copy of this object with the field set
     * @throws IllegalArgumentException if the value is invalid
     */
    public LocalDateTime withMillisOfDay(int millis) {try{__CLR4_4_12bl2bllc8azs3x.R.inc(3482);
        __CLR4_4_12bl2bllc8azs3x.R.inc(3483);return withLocalMillis(getChronology().millisOfDay().set(getLocalMillis(), millis));
    }finally{__CLR4_4_12bl2bllc8azs3x.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Get the era property which provides access to advanced functionality.
     *
     * @return the era property
     */
    public Property era() {try{__CLR4_4_12bl2bllc8azs3x.R.inc(3484);
        __CLR4_4_12bl2bllc8azs3x.R.inc(3485);return new Property(this, getChronology().era());
    }finally{__CLR4_4_12bl2bllc8azs3x.R.flushNeeded();}}

    /**
     * Get the century of era property which provides access to advanced functionality.
     *
     * @return the year of era property
     */
    public Property centuryOfEra() {try{__CLR4_4_12bl2bllc8azs3x.R.inc(3486);
        __CLR4_4_12bl2bllc8azs3x.R.inc(3487);return new Property(this, getChronology().centuryOfEra());
    }finally{__CLR4_4_12bl2bllc8azs3x.R.flushNeeded();}}

    /**
     * Get the year of century property which provides access to advanced functionality.
     *
     * @return the year of era property
     */
    public Property yearOfCentury() {try{__CLR4_4_12bl2bllc8azs3x.R.inc(3488);
        __CLR4_4_12bl2bllc8azs3x.R.inc(3489);return new Property(this, getChronology().yearOfCentury());
    }finally{__CLR4_4_12bl2bllc8azs3x.R.flushNeeded();}}

    /**
     * Get the year of era property which provides access to advanced functionality.
     *
     * @return the year of era property
     */
    public Property yearOfEra() {try{__CLR4_4_12bl2bllc8azs3x.R.inc(3490);
        __CLR4_4_12bl2bllc8azs3x.R.inc(3491);return new Property(this, getChronology().yearOfEra());
    }finally{__CLR4_4_12bl2bllc8azs3x.R.flushNeeded();}}

    /**
     * Get the year property which provides access to advanced functionality.
     *
     * @return the year property
     */
    public Property year() {try{__CLR4_4_12bl2bllc8azs3x.R.inc(3492);
        __CLR4_4_12bl2bllc8azs3x.R.inc(3493);return new Property(this, getChronology().year());
    }finally{__CLR4_4_12bl2bllc8azs3x.R.flushNeeded();}}

    /**
     * Get the weekyear property which provides access to advanced functionality.
     *
     * @return the weekyear property
     */
    public Property weekyear() {try{__CLR4_4_12bl2bllc8azs3x.R.inc(3494);
        __CLR4_4_12bl2bllc8azs3x.R.inc(3495);return new Property(this, getChronology().weekyear());
    }finally{__CLR4_4_12bl2bllc8azs3x.R.flushNeeded();}}

    /**
     * Get the month of year property which provides access to advanced functionality.
     *
     * @return the month of year property
     */
    public Property monthOfYear() {try{__CLR4_4_12bl2bllc8azs3x.R.inc(3496);
        __CLR4_4_12bl2bllc8azs3x.R.inc(3497);return new Property(this, getChronology().monthOfYear());
    }finally{__CLR4_4_12bl2bllc8azs3x.R.flushNeeded();}}

    /**
     * Get the week of a week based year property which provides access to advanced functionality.
     *
     * @return the week of a week based year property
     */
    public Property weekOfWeekyear() {try{__CLR4_4_12bl2bllc8azs3x.R.inc(3498);
        __CLR4_4_12bl2bllc8azs3x.R.inc(3499);return new Property(this, getChronology().weekOfWeekyear());
    }finally{__CLR4_4_12bl2bllc8azs3x.R.flushNeeded();}}

    /**
     * Get the day of year property which provides access to advanced functionality.
     *
     * @return the day of year property
     */
    public Property dayOfYear() {try{__CLR4_4_12bl2bllc8azs3x.R.inc(3500);
        __CLR4_4_12bl2bllc8azs3x.R.inc(3501);return new Property(this, getChronology().dayOfYear());
    }finally{__CLR4_4_12bl2bllc8azs3x.R.flushNeeded();}}

    /**
     * Get the day of month property which provides access to advanced functionality.
     *
     * @return the day of month property
     */
    public Property dayOfMonth() {try{__CLR4_4_12bl2bllc8azs3x.R.inc(3502);
        __CLR4_4_12bl2bllc8azs3x.R.inc(3503);return new Property(this, getChronology().dayOfMonth());
    }finally{__CLR4_4_12bl2bllc8azs3x.R.flushNeeded();}}

    /**
     * Get the day of week property which provides access to advanced functionality.
     *
     * @return the day of week property
     */
    public Property dayOfWeek() {try{__CLR4_4_12bl2bllc8azs3x.R.inc(3504);
        __CLR4_4_12bl2bllc8azs3x.R.inc(3505);return new Property(this, getChronology().dayOfWeek());
    }finally{__CLR4_4_12bl2bllc8azs3x.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Get the hour of day field property which provides access to advanced functionality.
     * 
     * @return the hour of day property
     */
    public Property hourOfDay() {try{__CLR4_4_12bl2bllc8azs3x.R.inc(3506);
        __CLR4_4_12bl2bllc8azs3x.R.inc(3507);return new Property(this, getChronology().hourOfDay());
    }finally{__CLR4_4_12bl2bllc8azs3x.R.flushNeeded();}}

    /**
     * Get the minute of hour field property which provides access to advanced functionality.
     * 
     * @return the minute of hour property
     */
    public Property minuteOfHour() {try{__CLR4_4_12bl2bllc8azs3x.R.inc(3508);
        __CLR4_4_12bl2bllc8azs3x.R.inc(3509);return new Property(this, getChronology().minuteOfHour());
    }finally{__CLR4_4_12bl2bllc8azs3x.R.flushNeeded();}}

    /**
     * Get the second of minute field property which provides access to advanced functionality.
     * 
     * @return the second of minute property
     */
    public Property secondOfMinute() {try{__CLR4_4_12bl2bllc8azs3x.R.inc(3510);
        __CLR4_4_12bl2bllc8azs3x.R.inc(3511);return new Property(this, getChronology().secondOfMinute());
    }finally{__CLR4_4_12bl2bllc8azs3x.R.flushNeeded();}}

    /**
     * Get the millis of second property which provides access to advanced functionality.
     * 
     * @return the millis of second property
     */
    public Property millisOfSecond() {try{__CLR4_4_12bl2bllc8azs3x.R.inc(3512);
        __CLR4_4_12bl2bllc8azs3x.R.inc(3513);return new Property(this, getChronology().millisOfSecond());
    }finally{__CLR4_4_12bl2bllc8azs3x.R.flushNeeded();}}

    /**
     * Get the millis of day property which provides access to advanced functionality.
     * 
     * @return the millis of day property
     */
    public Property millisOfDay() {try{__CLR4_4_12bl2bllc8azs3x.R.inc(3514);
        __CLR4_4_12bl2bllc8azs3x.R.inc(3515);return new Property(this, getChronology().millisOfDay());
    }finally{__CLR4_4_12bl2bllc8azs3x.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Output the date time in ISO8601 format (yyyy-MM-ddTHH:mm:ss.SSS).
     * 
     * @return ISO8601 time formatted string.
     */
    @ToString
    public String toString() {try{__CLR4_4_12bl2bllc8azs3x.R.inc(3516);
        __CLR4_4_12bl2bllc8azs3x.R.inc(3517);return ISODateTimeFormat.dateTime().print(this);
    }finally{__CLR4_4_12bl2bllc8azs3x.R.flushNeeded();}}

    /**
     * Output the date using the specified format pattern.
     *
     * @param pattern  the pattern specification, null means use <code>toString</code>
     * @see org.joda.time.format.DateTimeFormat
     */
    public String toString(String pattern) {try{__CLR4_4_12bl2bllc8azs3x.R.inc(3518);
        __CLR4_4_12bl2bllc8azs3x.R.inc(3519);if ((((pattern == null)&&(__CLR4_4_12bl2bllc8azs3x.R.iget(3520)!=0|true))||(__CLR4_4_12bl2bllc8azs3x.R.iget(3521)==0&false))) {{
            __CLR4_4_12bl2bllc8azs3x.R.inc(3522);return toString();
        }
        }__CLR4_4_12bl2bllc8azs3x.R.inc(3523);return DateTimeFormat.forPattern(pattern).print(this);
    }finally{__CLR4_4_12bl2bllc8azs3x.R.flushNeeded();}}

    /**
     * Output the date using the specified format pattern.
     *
     * @param pattern  the pattern specification, null means use <code>toString</code>
     * @param locale  Locale to use, null means default
     * @see org.joda.time.format.DateTimeFormat
     */
    public String toString(String pattern, Locale locale) throws IllegalArgumentException {try{__CLR4_4_12bl2bllc8azs3x.R.inc(3524);
        __CLR4_4_12bl2bllc8azs3x.R.inc(3525);if ((((pattern == null)&&(__CLR4_4_12bl2bllc8azs3x.R.iget(3526)!=0|true))||(__CLR4_4_12bl2bllc8azs3x.R.iget(3527)==0&false))) {{
            __CLR4_4_12bl2bllc8azs3x.R.inc(3528);return toString();
        }
        }__CLR4_4_12bl2bllc8azs3x.R.inc(3529);return DateTimeFormat.forPattern(pattern).withLocale(locale).print(this);
    }finally{__CLR4_4_12bl2bllc8azs3x.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * LocalDateTime.Property binds a LocalDateTime to a DateTimeField allowing
     * powerful datetime functionality to be easily accessed.
     * <p>
     * The simplest use of this class is as an alternative get method, here used to
     * get the year '1972' (as an int) and the month 'December' (as a String).
     * <pre>
     * LocalDateTime dt = new LocalDateTime(1972, 12, 3, 0, 0);
     * int year = dt.year().get();
     * String monthStr = dt.month().getAsText();
     * </pre>
     * <p>
     * Methods are also provided that allow date modification. These return
     * new instances of LocalDateTime - they do not modify the original.
     * The example below yields two independent immutable date objects
     * 20 years apart.
     * <pre>
     * LocalDateTime dt = new LocalDateTime(1972, 12, 3, 0, 0);
     * LocalDateTime dt1920 = dt.year().setCopy(1920);
     * </pre>
     * <p>
     * LocalDateTime.Property itself is thread-safe and immutable, as well as the
     * LocalDateTime being operated on.
     *
     * @author Stephen Colebourne
     * @author Brian S O'Neill
     * @since 1.3
     */
    public static final class Property extends AbstractReadableInstantFieldProperty {
        
        /** Serialization version */
        private static final long serialVersionUID = -358138762846288L;
        
        /** The instant this property is working against */
        private transient LocalDateTime iInstant;
        /** The field this property is working against */
        private transient DateTimeField iField;
        
        /**
         * Constructor.
         * 
         * @param instant  the instant to set
         * @param field  the field to use
         */
        Property(LocalDateTime instant, DateTimeField field) {
            super();__CLR4_4_12bl2bllc8azs3x.R.inc(3531);try{__CLR4_4_12bl2bllc8azs3x.R.inc(3530);
            __CLR4_4_12bl2bllc8azs3x.R.inc(3532);iInstant = instant;
            __CLR4_4_12bl2bllc8azs3x.R.inc(3533);iField = field;
        }finally{__CLR4_4_12bl2bllc8azs3x.R.flushNeeded();}}
        
        /**
         * Writes the property in a safe serialization format.
         */
        private void writeObject(ObjectOutputStream oos) throws IOException {try{__CLR4_4_12bl2bllc8azs3x.R.inc(3534);
            __CLR4_4_12bl2bllc8azs3x.R.inc(3535);oos.writeObject(iInstant);
            __CLR4_4_12bl2bllc8azs3x.R.inc(3536);oos.writeObject(iField.getType());
        }finally{__CLR4_4_12bl2bllc8azs3x.R.flushNeeded();}}

        /**
         * Reads the property from a safe serialization format.
         */
        private void readObject(ObjectInputStream oos) throws IOException, ClassNotFoundException {try{__CLR4_4_12bl2bllc8azs3x.R.inc(3537);
            __CLR4_4_12bl2bllc8azs3x.R.inc(3538);iInstant = (LocalDateTime) oos.readObject();
            __CLR4_4_12bl2bllc8azs3x.R.inc(3539);DateTimeFieldType type = (DateTimeFieldType) oos.readObject();
            __CLR4_4_12bl2bllc8azs3x.R.inc(3540);iField = type.getField(iInstant.getChronology());
        }finally{__CLR4_4_12bl2bllc8azs3x.R.flushNeeded();}}

        //-----------------------------------------------------------------------
        /**
         * Gets the field being used.
         * 
         * @return the field
         */
        public DateTimeField getField() {try{__CLR4_4_12bl2bllc8azs3x.R.inc(3541);
            __CLR4_4_12bl2bllc8azs3x.R.inc(3542);return iField;
        }finally{__CLR4_4_12bl2bllc8azs3x.R.flushNeeded();}}
        
        /**
         * Gets the milliseconds of the datetime that this property is linked to.
         * 
         * @return the milliseconds
         */
        protected long getMillis() {try{__CLR4_4_12bl2bllc8azs3x.R.inc(3543);
            __CLR4_4_12bl2bllc8azs3x.R.inc(3544);return iInstant.getLocalMillis();
        }finally{__CLR4_4_12bl2bllc8azs3x.R.flushNeeded();}}
        
        /**
         * Gets the chronology of the datetime that this property is linked to.
         * 
         * @return the chronology
         * @since 1.4
         */
        protected Chronology getChronology() {try{__CLR4_4_12bl2bllc8azs3x.R.inc(3545);
            __CLR4_4_12bl2bllc8azs3x.R.inc(3546);return iInstant.getChronology();
        }finally{__CLR4_4_12bl2bllc8azs3x.R.flushNeeded();}}
        
        /**
         * Gets the LocalDateTime object linked to this property.
         * 
         * @return the linked LocalDateTime
         */
        public LocalDateTime getLocalDateTime() {try{__CLR4_4_12bl2bllc8azs3x.R.inc(3547);
            __CLR4_4_12bl2bllc8azs3x.R.inc(3548);return iInstant;
        }finally{__CLR4_4_12bl2bllc8azs3x.R.flushNeeded();}}
        
        //-----------------------------------------------------------------------
        /**
         * Adds to this field in a copy of this LocalDateTime.
         * <p>
         * The LocalDateTime attached to this property is unchanged by this call.
         *
         * @param value  the value to add to the field in the copy
         * @return a copy of the LocalDateTime with the field value changed
         * @throws IllegalArgumentException if the value isn't valid
         */
        public LocalDateTime addToCopy(int value) {try{__CLR4_4_12bl2bllc8azs3x.R.inc(3549);
            __CLR4_4_12bl2bllc8azs3x.R.inc(3550);return iInstant.withLocalMillis(iField.add(iInstant.getLocalMillis(), value));
        }finally{__CLR4_4_12bl2bllc8azs3x.R.flushNeeded();}}
        
        /**
         * Adds to this field in a copy of this LocalDateTime.
         * <p>
         * The LocalDateTime attached to this property is unchanged by this call.
         *
         * @param value  the value to add to the field in the copy
         * @return a copy of the LocalDateTime with the field value changed
         * @throws IllegalArgumentException if the value isn't valid
         */
        public LocalDateTime addToCopy(long value) {try{__CLR4_4_12bl2bllc8azs3x.R.inc(3551);
            __CLR4_4_12bl2bllc8azs3x.R.inc(3552);return iInstant.withLocalMillis(iField.add(iInstant.getLocalMillis(), value));
        }finally{__CLR4_4_12bl2bllc8azs3x.R.flushNeeded();}}
        
        /**
         * Adds to this field, possibly wrapped, in a copy of this LocalDateTime.
         * A field wrapped operation only changes this field.
         * Thus 31st January addWrapField one day goes to the 1st January.
         * <p>
         * The LocalDateTime attached to this property is unchanged by this call.
         *
         * @param value  the value to add to the field in the copy
         * @return a copy of the LocalDateTime with the field value changed
         * @throws IllegalArgumentException if the value isn't valid
         */
        public LocalDateTime addWrapFieldToCopy(int value) {try{__CLR4_4_12bl2bllc8azs3x.R.inc(3553);
            __CLR4_4_12bl2bllc8azs3x.R.inc(3554);return iInstant.withLocalMillis(iField.addWrapField(iInstant.getLocalMillis(), value));
        }finally{__CLR4_4_12bl2bllc8azs3x.R.flushNeeded();}}
        
        //-----------------------------------------------------------------------
        /**
         * Sets this field in a copy of the LocalDateTime.
         * <p>
         * The LocalDateTime attached to this property is unchanged by this call.
         *
         * @param value  the value to set the field in the copy to
         * @return a copy of the LocalDateTime with the field value changed
         * @throws IllegalArgumentException if the value isn't valid
         */
        public LocalDateTime setCopy(int value) {try{__CLR4_4_12bl2bllc8azs3x.R.inc(3555);
            __CLR4_4_12bl2bllc8azs3x.R.inc(3556);return iInstant.withLocalMillis(iField.set(iInstant.getLocalMillis(), value));
        }finally{__CLR4_4_12bl2bllc8azs3x.R.flushNeeded();}}
        
        /**
         * Sets this field in a copy of the LocalDateTime to a parsed text value.
         * <p>
         * The LocalDateTime attached to this property is unchanged by this call.
         *
         * @param text  the text value to set
         * @param locale  optional locale to use for selecting a text symbol
         * @return a copy of the LocalDateTime with the field value changed
         * @throws IllegalArgumentException if the text value isn't valid
         */
        public LocalDateTime setCopy(String text, Locale locale) {try{__CLR4_4_12bl2bllc8azs3x.R.inc(3557);
            __CLR4_4_12bl2bllc8azs3x.R.inc(3558);return iInstant.withLocalMillis(iField.set(iInstant.getLocalMillis(), text, locale));
        }finally{__CLR4_4_12bl2bllc8azs3x.R.flushNeeded();}}
        
        /**
         * Sets this field in a copy of the LocalDateTime to a parsed text value.
         * <p>
         * The LocalDateTime attached to this property is unchanged by this call.
         *
         * @param text  the text value to set
         * @return a copy of the LocalDateTime with the field value changed
         * @throws IllegalArgumentException if the text value isn't valid
         */
        public LocalDateTime setCopy(String text) {try{__CLR4_4_12bl2bllc8azs3x.R.inc(3559);
            __CLR4_4_12bl2bllc8azs3x.R.inc(3560);return setCopy(text, null);
        }finally{__CLR4_4_12bl2bllc8azs3x.R.flushNeeded();}}
        
        //-----------------------------------------------------------------------
        /**
         * Returns a new LocalDateTime with this field set to the maximum value
         * for this field.
         * <p>
         * This operation is useful for obtaining a LocalDateTime on the last day
         * of the month, as month lengths vary.
         * <pre>
         * LocalDateTime lastDayOfMonth = dt.dayOfMonth().withMaximumValue();
         * </pre>
         * <p>
         * The LocalDateTime attached to this property is unchanged by this call.
         *
         * @return a copy of the LocalDateTime with this field set to its maximum
         */
        public LocalDateTime withMaximumValue() {try{__CLR4_4_12bl2bllc8azs3x.R.inc(3561);
            __CLR4_4_12bl2bllc8azs3x.R.inc(3562);return setCopy(getMaximumValue());
        }finally{__CLR4_4_12bl2bllc8azs3x.R.flushNeeded();}}
        
        /**
         * Returns a new LocalDateTime with this field set to the minimum value
         * for this field.
         * <p>
         * The LocalDateTime attached to this property is unchanged by this call.
         *
         * @return a copy of the LocalDateTime with this field set to its minimum
         */
        public LocalDateTime withMinimumValue() {try{__CLR4_4_12bl2bllc8azs3x.R.inc(3563);
            __CLR4_4_12bl2bllc8azs3x.R.inc(3564);return setCopy(getMinimumValue());
        }finally{__CLR4_4_12bl2bllc8azs3x.R.flushNeeded();}}
        
        //-----------------------------------------------------------------------
        /**
         * Rounds to the lowest whole unit of this field on a copy of this
         * LocalDateTime.
         * <p>
         * For example, rounding floor on the hourOfDay field of a LocalDateTime
         * where the time is 10:30 would result in new LocalDateTime with the
         * time of 10:00.
         *
         * @return a copy of the LocalDateTime with the field value changed
         */
        public LocalDateTime roundFloorCopy() {try{__CLR4_4_12bl2bllc8azs3x.R.inc(3565);
            __CLR4_4_12bl2bllc8azs3x.R.inc(3566);return iInstant.withLocalMillis(iField.roundFloor(iInstant.getLocalMillis()));
        }finally{__CLR4_4_12bl2bllc8azs3x.R.flushNeeded();}}
        
        /**
         * Rounds to the highest whole unit of this field on a copy of this
         * LocalDateTime.
         * <p>
         * For example, rounding floor on the hourOfDay field of a LocalDateTime
         * where the time is 10:30 would result in new LocalDateTime with the
         * time of 11:00.
         *
         * @return a copy of the LocalDateTime with the field value changed
         */
        public LocalDateTime roundCeilingCopy() {try{__CLR4_4_12bl2bllc8azs3x.R.inc(3567);
            __CLR4_4_12bl2bllc8azs3x.R.inc(3568);return iInstant.withLocalMillis(iField.roundCeiling(iInstant.getLocalMillis()));
        }finally{__CLR4_4_12bl2bllc8azs3x.R.flushNeeded();}}
        
        /**
         * Rounds to the nearest whole unit of this field on a copy of this
         * LocalDateTime, favoring the floor if halfway.
         *
         * @return a copy of the LocalDateTime with the field value changed
         */
        public LocalDateTime roundHalfFloorCopy() {try{__CLR4_4_12bl2bllc8azs3x.R.inc(3569);
            __CLR4_4_12bl2bllc8azs3x.R.inc(3570);return iInstant.withLocalMillis(iField.roundHalfFloor(iInstant.getLocalMillis()));
        }finally{__CLR4_4_12bl2bllc8azs3x.R.flushNeeded();}}
        
        /**
         * Rounds to the nearest whole unit of this field on a copy of this
         * LocalDateTime, favoring the ceiling if halfway.
         *
         * @return a copy of the LocalDateTime with the field value changed
         */
        public LocalDateTime roundHalfCeilingCopy() {try{__CLR4_4_12bl2bllc8azs3x.R.inc(3571);
            __CLR4_4_12bl2bllc8azs3x.R.inc(3572);return iInstant.withLocalMillis(iField.roundHalfCeiling(iInstant.getLocalMillis()));
        }finally{__CLR4_4_12bl2bllc8azs3x.R.flushNeeded();}}
        
        /**
         * Rounds to the nearest whole unit of this field on a copy of this
         * LocalDateTime.  If halfway, the ceiling is favored over the floor
         * only if it makes this field's value even.
         *
         * @return a copy of the LocalDateTime with the field value changed
         */
        public LocalDateTime roundHalfEvenCopy() {try{__CLR4_4_12bl2bllc8azs3x.R.inc(3573);
            __CLR4_4_12bl2bllc8azs3x.R.inc(3574);return iInstant.withLocalMillis(iField.roundHalfEven(iInstant.getLocalMillis()));
        }finally{__CLR4_4_12bl2bllc8azs3x.R.flushNeeded();}}
    }

}
