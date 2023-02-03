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

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

import org.joda.time.base.BasePartial;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.field.AbstractPartialFieldProperty;
import org.joda.time.field.FieldUtils;
import org.joda.time.format.ISODateTimeFormat;

/**
 * TimeOfDay is an immutable partial supporting the hour, minute, second
 * and millisecond fields.
 * <p>
 * NOTE: This class only supports the four fields listed above. Thus, you
 * cannot query the millisOfDay or secondOfDay fields for example.
 * The new <code>LocalTime</code> class removes this restriction.
 * <p>
 * Calculations on TimeOfDay are performed using a {@link Chronology}.
 * This chronology is set to be in the UTC time zone for all calculations.
 * <p>
 * Each individual field can be queried in two ways:
 * <ul>
 * <li><code>getHourOfDay()</code>
 * <li><code>hourOfDay().get()</code>
 * </ul>
 * The second technique also provides access to other useful methods on the
 * field:
 * <ul>
 * <li>numeric value - <code>hourOfDay().get()</code>
 * <li>text value - <code>hourOfDay().getAsText()</code>
 * <li>short text value - <code>hourOfDay().getAsShortText()</code>
 * <li>maximum/minimum values - <code>hourOfDay().getMaximumValue()</code>
 * <li>add/subtract - <code>hourOfDay().addToCopy()</code>
 * <li>set - <code>hourOfDay().setCopy()</code>
 * </ul>
 * <p>
 * TimeOfDay is thread-safe and immutable, provided that the Chronology is as well.
 * All standard Chronology classes supplied are thread-safe and immutable.
 *
 * @author Stephen Colebourne
 * @author Brian S O'Neill
 * @since 1.0
 * @deprecated Use LocalTime which has a much better internal implementation and
 *  has been available since 1.3
 */
@java.lang.SuppressWarnings({"fallthrough"}) @Deprecated
public final class TimeOfDay
        extends BasePartial
        implements ReadablePartial, Serializable {public static class __CLR4_4_14to4tolc8azsi5{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672271027956L,8589935092L,6465,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    // NOTE: No toDateTime(YearMonthDay) as semantics are confusing when
    // different chronologies

    /** Serialization version */
    private static final long serialVersionUID = 3633353405803318660L;
    /** The singleton set of field types */
    private static final DateTimeFieldType[] FIELD_TYPES = new DateTimeFieldType[] {
        DateTimeFieldType.hourOfDay(),
        DateTimeFieldType.minuteOfHour(),
        DateTimeFieldType.secondOfMinute(),
        DateTimeFieldType.millisOfSecond(),
    };

    /** Constant for midnight. */
    public static final TimeOfDay MIDNIGHT = new TimeOfDay(0, 0, 0, 0);

    /** The index of the hourOfDay field in the field array */
    public static final int HOUR_OF_DAY = 0;
    /** The index of the minuteOfHour field in the field array */
    public static final int MINUTE_OF_HOUR = 1;
    /** The index of the secondOfMinute field in the field array */
    public static final int SECOND_OF_MINUTE = 2;
    /** The index of the millisOfSecond field in the field array */
    public static final int MILLIS_OF_SECOND = 3;

    //-----------------------------------------------------------------------
    /**
     * Constructs a TimeOfDay from a <code>java.util.Calendar</code>
     * using exactly the same field values avoiding any time zone effects.
     * <p>
     * Each field is queried from the Calendar and assigned to the TimeOfDay.
     * This is useful to ensure that the field values are the same in the
     * created TimeOfDay no matter what the time zone is. For example, if
     * the Calendar states that the time is 04:29, then the created TimeOfDay
     * will always have the time 04:29 irrespective of time zone issues.
     * <p>
     * This factory method ignores the type of the calendar and always
     * creates a TimeOfDay with ISO chronology.
     *
     * @param calendar  the Calendar to extract fields from
     * @return the created TimeOfDay
     * @throws IllegalArgumentException if the calendar is null
     * @throws IllegalArgumentException if the time is invalid for the ISO chronology
     * @since 1.2
     */
    public static TimeOfDay fromCalendarFields(Calendar calendar) {try{__CLR4_4_14to4tolc8azsi5.R.inc(6252);
        __CLR4_4_14to4tolc8azsi5.R.inc(6253);if ((((calendar == null)&&(__CLR4_4_14to4tolc8azsi5.R.iget(6254)!=0|true))||(__CLR4_4_14to4tolc8azsi5.R.iget(6255)==0&false))) {{
            __CLR4_4_14to4tolc8azsi5.R.inc(6256);throw new IllegalArgumentException("The calendar must not be null");
        }
        }__CLR4_4_14to4tolc8azsi5.R.inc(6257);return new TimeOfDay(
            calendar.get(Calendar.HOUR_OF_DAY),
            calendar.get(Calendar.MINUTE),
            calendar.get(Calendar.SECOND),
            calendar.get(Calendar.MILLISECOND)
        );
    }finally{__CLR4_4_14to4tolc8azsi5.R.flushNeeded();}}

    /**
     * Constructs a TimeOfDay from a <code>java.util.Date</code>
     * using exactly the same field values avoiding any time zone effects.
     * <p>
     * Each field is queried from the Date and assigned to the TimeOfDay.
     * This is useful to ensure that the field values are the same in the
     * created TimeOfDay no matter what the time zone is. For example, if
     * the Calendar states that the time is 04:29, then the created TimeOfDay
     * will always have the time 04:29 irrespective of time zone issues.
     * <p>
     * This factory method always creates a TimeOfDay with ISO chronology.
     *
     * @param date  the Date to extract fields from
     * @return the created TimeOfDay
     * @throws IllegalArgumentException if the calendar is null
     * @throws IllegalArgumentException if the date is invalid for the ISO chronology
     * @since 1.2
     */
    public static TimeOfDay fromDateFields(Date date) {try{__CLR4_4_14to4tolc8azsi5.R.inc(6258);
        __CLR4_4_14to4tolc8azsi5.R.inc(6259);if ((((date == null)&&(__CLR4_4_14to4tolc8azsi5.R.iget(6260)!=0|true))||(__CLR4_4_14to4tolc8azsi5.R.iget(6261)==0&false))) {{
            __CLR4_4_14to4tolc8azsi5.R.inc(6262);throw new IllegalArgumentException("The date must not be null");
        }
        }__CLR4_4_14to4tolc8azsi5.R.inc(6263);return new TimeOfDay(
            date.getHours(),
            date.getMinutes(),
            date.getSeconds(),
            (((int) (date.getTime() % 1000)) + 1000) % 1000
        );
    }finally{__CLR4_4_14to4tolc8azsi5.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Constructs a TimeOfDay from the specified millis of day using the
     * ISO chronology.
     * <p>
     * The millisOfDay value may exceed the number of millis in one day,
     * but additional days will be ignored.
     * This method uses the UTC time zone internally.
     *
     * @param millisOfDay  the number of milliseconds into a day to convert
     */
    public static TimeOfDay fromMillisOfDay(long millisOfDay) {try{__CLR4_4_14to4tolc8azsi5.R.inc(6264);
        __CLR4_4_14to4tolc8azsi5.R.inc(6265);return fromMillisOfDay(millisOfDay, null);
    }finally{__CLR4_4_14to4tolc8azsi5.R.flushNeeded();}}

    /**
     * Constructs a TimeOfDay from the specified millis of day using the
     * specified chronology.
     * <p>
     * The millisOfDay value may exceed the number of millis in one day,
     * but additional days will be ignored.
     * This method uses the UTC time zone internally.
     *
     * @param millisOfDay  the number of milliseconds into a day to convert
     * @param chrono  the chronology, null means ISO chronology
     */
    public static TimeOfDay fromMillisOfDay(long millisOfDay, Chronology chrono) {try{__CLR4_4_14to4tolc8azsi5.R.inc(6266);
        __CLR4_4_14to4tolc8azsi5.R.inc(6267);chrono = DateTimeUtils.getChronology(chrono);
        __CLR4_4_14to4tolc8azsi5.R.inc(6268);chrono = chrono.withUTC();
        __CLR4_4_14to4tolc8azsi5.R.inc(6269);return new TimeOfDay(millisOfDay, chrono);
    }finally{__CLR4_4_14to4tolc8azsi5.R.flushNeeded();}}

    // Constructors
    //-----------------------------------------------------------------------
    /**
     * Constructs a TimeOfDay with the current time, using ISOChronology in
     * the default zone to extract the fields.
     * <p>
     * The constructor uses the default time zone, resulting in the local time
     * being initialised. Once the constructor is complete, all further calculations
     * are performed without reference to a timezone (by switching to UTC).
     */
    public TimeOfDay() {
        super();__CLR4_4_14to4tolc8azsi5.R.inc(6271);try{__CLR4_4_14to4tolc8azsi5.R.inc(6270);
    }finally{__CLR4_4_14to4tolc8azsi5.R.flushNeeded();}}

    /**
     * Constructs a TimeOfDay with the current time, using ISOChronology in
     * the specified zone to extract the fields.
     * <p>
     * The constructor uses the specified time zone to obtain the current time.
     * Once the constructor is complete, all further calculations
     * are performed without reference to a timezone (by switching to UTC).
     * 
     * @param zone  the zone to use, null means default zone
     * @since 1.1
     */
    public TimeOfDay(DateTimeZone zone) {
        super(ISOChronology.getInstance(zone));__CLR4_4_14to4tolc8azsi5.R.inc(6273);try{__CLR4_4_14to4tolc8azsi5.R.inc(6272);
    }finally{__CLR4_4_14to4tolc8azsi5.R.flushNeeded();}}

    /**
     * Constructs a TimeOfDay with the current time, using the specified chronology
     * and zone to extract the fields.
     * <p>
     * The constructor uses the time zone of the chronology specified.
     * Once the constructor is complete, all further calculations are performed
     * without reference to a timezone (by switching to UTC).
     *
     * @param chronology  the chronology, null means ISOChronology in the default zone
     */
    public TimeOfDay(Chronology chronology) {
        super(chronology);__CLR4_4_14to4tolc8azsi5.R.inc(6275);try{__CLR4_4_14to4tolc8azsi5.R.inc(6274);
    }finally{__CLR4_4_14to4tolc8azsi5.R.flushNeeded();}}

    /**
     * Constructs a TimeOfDay extracting the partial fields from the specified
     * milliseconds using the ISOChronology in the default zone.
     * <p>
     * The constructor uses the default time zone, resulting in the local time
     * being initialised. Once the constructor is complete, all further calculations
     * are performed without reference to a timezone (by switching to UTC).
     *
     * @param instant  the milliseconds from 1970-01-01T00:00:00Z
     */
    public TimeOfDay(long instant) {
        super(instant);__CLR4_4_14to4tolc8azsi5.R.inc(6277);try{__CLR4_4_14to4tolc8azsi5.R.inc(6276);
    }finally{__CLR4_4_14to4tolc8azsi5.R.flushNeeded();}}

    /**
     * Constructs a TimeOfDay extracting the partial fields from the specified
     * milliseconds using the chronology provided.
     * <p>
     * The constructor uses the time zone of the chronology specified.
     * Once the constructor is complete, all further calculations are performed
     * without reference to a timezone (by switching to UTC).
     *
     * @param instant  the milliseconds from 1970-01-01T00:00:00Z
     * @param chronology  the chronology, null means ISOChronology in the default zone
     */
    public TimeOfDay(long instant, Chronology chronology) {
        super(instant, chronology);__CLR4_4_14to4tolc8azsi5.R.inc(6279);try{__CLR4_4_14to4tolc8azsi5.R.inc(6278);
    }finally{__CLR4_4_14to4tolc8azsi5.R.flushNeeded();}}

    /**
     * Constructs a TimeOfDay from an Object that represents a time.
     * <p>
     * The recognised object types are defined in
     * {@link org.joda.time.convert.ConverterManager ConverterManager} and
     * include ReadableInstant, String, Calendar and Date.
     * The String formats are described by {@link ISODateTimeFormat#timeParser()}.
     * <p>
     * The chronology used will be derived from the object, defaulting to ISO.
     * <p>
     * NOTE: Prior to v1.3 the string format was described by
     * {@link ISODateTimeFormat#dateTimeParser()}. Dates are now rejected.
     *
     * @param instant  the datetime object, null means now
     * @throws IllegalArgumentException if the instant is invalid
     */
    public TimeOfDay(Object instant) {
        super(instant, null, ISODateTimeFormat.timeParser());__CLR4_4_14to4tolc8azsi5.R.inc(6281);try{__CLR4_4_14to4tolc8azsi5.R.inc(6280);
    }finally{__CLR4_4_14to4tolc8azsi5.R.flushNeeded();}}

    /**
     * Constructs a TimeOfDay from an Object that represents a time, using the
     * specified chronology.
     * <p>
     * The recognised object types are defined in
     * {@link org.joda.time.convert.ConverterManager ConverterManager} and
     * include ReadableInstant, String, Calendar and Date.
     * The String formats are described by {@link ISODateTimeFormat#timeParser()}.
     * <p>
     * The constructor uses the time zone of the chronology specified.
     * Once the constructor is complete, all further calculations are performed
     * without reference to a timezone (by switching to UTC).
     * The specified chronology overrides that of the object.
     * <p>
     * NOTE: Prior to v1.3 the string format was described by
     * {@link ISODateTimeFormat#dateTimeParser()}. Dates are now rejected.
     *
     * @param instant  the datetime object, null means now
     * @param chronology  the chronology, null means ISO default
     * @throws IllegalArgumentException if the instant is invalid
     */
    public TimeOfDay(Object instant, Chronology chronology) {
        super(instant, DateTimeUtils.getChronology(chronology), ISODateTimeFormat.timeParser());__CLR4_4_14to4tolc8azsi5.R.inc(6283);try{__CLR4_4_14to4tolc8azsi5.R.inc(6282);
    }finally{__CLR4_4_14to4tolc8azsi5.R.flushNeeded();}}

    /**
     * Constructs a TimeOfDay with specified hour and minute and zero seconds and milliseconds
     * using <code>ISOChronology</code> in the default zone.
     * <p>
     * The constructor uses the no time zone initialising the fields as provided.
     * Once the constructor is complete, all further calculations
     * are performed without reference to a timezone (by switching to UTC).
     *
     * @param hourOfDay  the hour of the day
     * @param minuteOfHour  the minute of the hour
     */
    public TimeOfDay(int hourOfDay, int minuteOfHour) {
        this(hourOfDay, minuteOfHour, 0, 0, null);__CLR4_4_14to4tolc8azsi5.R.inc(6285);try{__CLR4_4_14to4tolc8azsi5.R.inc(6284);
    }finally{__CLR4_4_14to4tolc8azsi5.R.flushNeeded();}}

    /**
     * Constructs a TimeOfDay with specified hour and minute and zero seconds and milliseconds.
     * <p>
     * The constructor uses the time zone of the chronology specified.
     * Once the constructor is complete, all further calculations are performed
     * without reference to a timezone (by switching to UTC).
     *
     * @param hourOfDay  the hour of the day
     * @param minuteOfHour  the minute of the hour
     * @param chronology  the chronology, null means ISOChronology in the default zone
     */
    public TimeOfDay(int hourOfDay, int minuteOfHour, Chronology chronology) {
        this(hourOfDay, minuteOfHour, 0, 0, chronology);__CLR4_4_14to4tolc8azsi5.R.inc(6287);try{__CLR4_4_14to4tolc8azsi5.R.inc(6286);
    }finally{__CLR4_4_14to4tolc8azsi5.R.flushNeeded();}}

    /**
     * Constructs a TimeOfDay with specified time field values and zero milliseconds
     * using <code>ISOChronology</code> in the default zone.
     * <p>
     * The constructor uses the no time zone initialising the fields as provided.
     * Once the constructor is complete, all further calculations
     * are performed without reference to a timezone (by switching to UTC).
     *
     * @param hourOfDay  the hour of the day
     * @param minuteOfHour  the minute of the hour
     * @param secondOfMinute  the second of the minute
     */
    public TimeOfDay(int hourOfDay, int minuteOfHour, int secondOfMinute) {
        this(hourOfDay, minuteOfHour, secondOfMinute, 0, null);__CLR4_4_14to4tolc8azsi5.R.inc(6289);try{__CLR4_4_14to4tolc8azsi5.R.inc(6288);
    }finally{__CLR4_4_14to4tolc8azsi5.R.flushNeeded();}}

    /**
     * Constructs a TimeOfDay with specified time field values and zero milliseconds.
     * <p>
     * The constructor uses the time zone of the chronology specified.
     * Once the constructor is complete, all further calculations are performed
     * without reference to a timezone (by switching to UTC).
     *
     * @param hourOfDay  the hour of the day
     * @param minuteOfHour  the minute of the hour
     * @param secondOfMinute  the second of the minute
     * @param chronology  the chronology, null means ISOChronology in the default zone
     */
    public TimeOfDay(int hourOfDay, int minuteOfHour, int secondOfMinute, Chronology chronology) {
        this(hourOfDay, minuteOfHour, secondOfMinute, 0, chronology);__CLR4_4_14to4tolc8azsi5.R.inc(6291);try{__CLR4_4_14to4tolc8azsi5.R.inc(6290);
    }finally{__CLR4_4_14to4tolc8azsi5.R.flushNeeded();}}

    /**
     * Constructs a TimeOfDay with specified time field values using
     * <code>ISOChronology</code> in the default zone.
     * <p>
     * The constructor uses the no time zone initialising the fields as provided.
     * Once the constructor is complete, all further calculations
     * are performed without reference to a timezone (by switching to UTC).
     *
     * @param hourOfDay  the hour of the day
     * @param minuteOfHour  the minute of the hour
     * @param secondOfMinute  the second of the minute
     * @param millisOfSecond  the millisecond of the second
     */
    public TimeOfDay(int hourOfDay, int minuteOfHour, int secondOfMinute, int millisOfSecond) {
        this(hourOfDay, minuteOfHour, secondOfMinute, millisOfSecond, null);__CLR4_4_14to4tolc8azsi5.R.inc(6293);try{__CLR4_4_14to4tolc8azsi5.R.inc(6292);
    }finally{__CLR4_4_14to4tolc8azsi5.R.flushNeeded();}}

    /**
     * Constructs a TimeOfDay with specified time field values and chronology.
     * <p>
     * The constructor uses the time zone of the chronology specified.
     * Once the constructor is complete, all further calculations are performed
     * without reference to a timezone (by switching to UTC).
     *
     * @param hourOfDay  the hour of the day
     * @param minuteOfHour  the minute of the hour
     * @param secondOfMinute  the second of the minute
     * @param millisOfSecond  the millisecond of the second
     * @param chronology  the chronology, null means ISOChronology in the default zone
     */
    public TimeOfDay(int hourOfDay, int minuteOfHour,
            int secondOfMinute, int millisOfSecond, Chronology chronology) {
        super(new int[] {hourOfDay, minuteOfHour, secondOfMinute, millisOfSecond}, chronology);__CLR4_4_14to4tolc8azsi5.R.inc(6295);try{__CLR4_4_14to4tolc8azsi5.R.inc(6294);
    }finally{__CLR4_4_14to4tolc8azsi5.R.flushNeeded();}}

    /**
     * Constructs a TimeOfDay with chronology from this instance and new values.
     *
     * @param partial  the partial to base this new instance on
     * @param values  the new set of values
     */
    TimeOfDay(TimeOfDay partial, int[] values) {
        super(partial, values);__CLR4_4_14to4tolc8azsi5.R.inc(6297);try{__CLR4_4_14to4tolc8azsi5.R.inc(6296);
    }finally{__CLR4_4_14to4tolc8azsi5.R.flushNeeded();}}

    /**
     * Constructs a TimeOfDay with values from this instance and a new chronology.
     *
     * @param partial  the partial to base this new instance on
     * @param chrono  the new chronology
     */
    TimeOfDay(TimeOfDay partial, Chronology chrono) {
        super(partial, chrono);__CLR4_4_14to4tolc8azsi5.R.inc(6299);try{__CLR4_4_14to4tolc8azsi5.R.inc(6298);
    }finally{__CLR4_4_14to4tolc8azsi5.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Gets the number of fields in this partial.
     * 
     * @return the field count
     */
    public int size() {try{__CLR4_4_14to4tolc8azsi5.R.inc(6300);
        __CLR4_4_14to4tolc8azsi5.R.inc(6301);return 4;
    }finally{__CLR4_4_14to4tolc8azsi5.R.flushNeeded();}}

    /**
     * Gets the field for a specific index in the chronology specified.
     * <p>
     * This method must not use any instance variables.
     * 
     * @param index  the index to retrieve
     * @param chrono  the chronology to use
     * @return the field
     */
    protected DateTimeField getField(int index, Chronology chrono) {try{__CLR4_4_14to4tolc8azsi5.R.inc(6302);
        boolean __CLB4_4_1_bool0=false;__CLR4_4_14to4tolc8azsi5.R.inc(6303);switch (index) {
            case HOUR_OF_DAY:if (!__CLB4_4_1_bool0) {__CLR4_4_14to4tolc8azsi5.R.inc(6304);__CLB4_4_1_bool0=true;}
                __CLR4_4_14to4tolc8azsi5.R.inc(6305);return chrono.hourOfDay();
            case MINUTE_OF_HOUR:if (!__CLB4_4_1_bool0) {__CLR4_4_14to4tolc8azsi5.R.inc(6306);__CLB4_4_1_bool0=true;}
                __CLR4_4_14to4tolc8azsi5.R.inc(6307);return chrono.minuteOfHour();
            case SECOND_OF_MINUTE:if (!__CLB4_4_1_bool0) {__CLR4_4_14to4tolc8azsi5.R.inc(6308);__CLB4_4_1_bool0=true;}
                __CLR4_4_14to4tolc8azsi5.R.inc(6309);return chrono.secondOfMinute();
            case MILLIS_OF_SECOND:if (!__CLB4_4_1_bool0) {__CLR4_4_14to4tolc8azsi5.R.inc(6310);__CLB4_4_1_bool0=true;}
                __CLR4_4_14to4tolc8azsi5.R.inc(6311);return chrono.millisOfSecond();
            default:if (!__CLB4_4_1_bool0) {__CLR4_4_14to4tolc8azsi5.R.inc(6312);__CLB4_4_1_bool0=true;}
                __CLR4_4_14to4tolc8azsi5.R.inc(6313);throw new IndexOutOfBoundsException("Invalid index: " + index);
        }
    }finally{__CLR4_4_14to4tolc8azsi5.R.flushNeeded();}}

    /**
     * Gets the field type at the specified index.
     *
     * @param index  the index to retrieve
     * @return the field at the specified index
     * @throws IndexOutOfBoundsException if the index is invalid
     */
    public DateTimeFieldType getFieldType(int index) {try{__CLR4_4_14to4tolc8azsi5.R.inc(6314);
        __CLR4_4_14to4tolc8azsi5.R.inc(6315);return FIELD_TYPES[index];
    }finally{__CLR4_4_14to4tolc8azsi5.R.flushNeeded();}}

    /**
     * Gets an array of the field type of each of the fields that this partial supports.
     * <p>
     * The fields are returned largest to smallest, Hour, Minute, Second, Millis.
     *
     * @return the array of field types (cloned), largest to smallest
     */
    public DateTimeFieldType[] getFieldTypes() {try{__CLR4_4_14to4tolc8azsi5.R.inc(6316);
        __CLR4_4_14to4tolc8azsi5.R.inc(6317);return (DateTimeFieldType[]) FIELD_TYPES.clone();
    }finally{__CLR4_4_14to4tolc8azsi5.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Returns a copy of this time with the specified chronology.
     * This instance is immutable and unaffected by this method call.
     * <p>
     * This method retains the values of the fields, thus the result will
     * typically refer to a different instant.
     * <p>
     * The time zone of the specified chronology is ignored, as TimeOfDay
     * operates without a time zone.
     *
     * @param newChronology  the new chronology, null means ISO
     * @return a copy of this datetime with a different chronology
     * @throws IllegalArgumentException if the values are invalid for the new chronology
     */
    public TimeOfDay withChronologyRetainFields(Chronology newChronology) {try{__CLR4_4_14to4tolc8azsi5.R.inc(6318);
        __CLR4_4_14to4tolc8azsi5.R.inc(6319);newChronology = DateTimeUtils.getChronology(newChronology);
        __CLR4_4_14to4tolc8azsi5.R.inc(6320);newChronology = newChronology.withUTC();
        __CLR4_4_14to4tolc8azsi5.R.inc(6321);if ((((newChronology == getChronology())&&(__CLR4_4_14to4tolc8azsi5.R.iget(6322)!=0|true))||(__CLR4_4_14to4tolc8azsi5.R.iget(6323)==0&false))) {{
            __CLR4_4_14to4tolc8azsi5.R.inc(6324);return this;
        } }else {{
            __CLR4_4_14to4tolc8azsi5.R.inc(6325);TimeOfDay newTimeOfDay = new TimeOfDay(this, newChronology);
            __CLR4_4_14to4tolc8azsi5.R.inc(6326);newChronology.validate(newTimeOfDay, getValues());
            __CLR4_4_14to4tolc8azsi5.R.inc(6327);return newTimeOfDay;
        }
    }}finally{__CLR4_4_14to4tolc8azsi5.R.flushNeeded();}}

    /**
     * Returns a copy of this time with the specified field set to a new value.
     * <p>
     * For example, if the field type is <code>minuteOfHour</code> then the day
     * would be changed in the returned instance.
     * <p>
     * These three lines are equivalent:
     * <pre>
     * TimeOfDay updated = tod.withField(DateTimeFieldType.minuteOfHour(), 6);
     * TimeOfDay updated = tod.minuteOfHour().setCopy(6);
     * TimeOfDay updated = tod.property(DateTimeFieldType.minuteOfHour()).setCopy(6);
     * </pre>
     *
     * @param fieldType  the field type to set, not null
     * @param value  the value to set
     * @return a copy of this instance with the field set
     * @throws IllegalArgumentException if the value is null or invalid
     */
    public TimeOfDay withField(DateTimeFieldType fieldType, int value) {try{__CLR4_4_14to4tolc8azsi5.R.inc(6328);
        __CLR4_4_14to4tolc8azsi5.R.inc(6329);int index = indexOfSupported(fieldType);
        __CLR4_4_14to4tolc8azsi5.R.inc(6330);if ((((value == getValue(index))&&(__CLR4_4_14to4tolc8azsi5.R.iget(6331)!=0|true))||(__CLR4_4_14to4tolc8azsi5.R.iget(6332)==0&false))) {{
            __CLR4_4_14to4tolc8azsi5.R.inc(6333);return this;
        }
        }__CLR4_4_14to4tolc8azsi5.R.inc(6334);int[] newValues = getValues();
        __CLR4_4_14to4tolc8azsi5.R.inc(6335);newValues = getField(index).set(this, index, newValues, value);
        __CLR4_4_14to4tolc8azsi5.R.inc(6336);return new TimeOfDay(this, newValues);
    }finally{__CLR4_4_14to4tolc8azsi5.R.flushNeeded();}}

    /**
     * Returns a copy of this time with the value of the specified field increased,
     * wrapping to what would be a new day if required.
     * <p>
     * If the addition is zero, then <code>this</code> is returned.
     * <p>
     * These three lines are equivalent:
     * <pre>
     * TimeOfDay added = tod.withFieldAdded(DurationFieldType.minutes(), 6);
     * TimeOfDay added = tod.plusMinutes(6);
     * TimeOfDay added = tod.minuteOfHour().addToCopy(6);
     * </pre>
     * 
     * @param fieldType  the field type to add to, not null
     * @param amount  the amount to add
     * @return a copy of this instance with the field updated
     * @throws IllegalArgumentException if the value is null or invalid
     * @throws ArithmeticException if the new datetime exceeds the capacity
     */
    public TimeOfDay withFieldAdded(DurationFieldType fieldType, int amount) {try{__CLR4_4_14to4tolc8azsi5.R.inc(6337);
        __CLR4_4_14to4tolc8azsi5.R.inc(6338);int index = indexOfSupported(fieldType);
        __CLR4_4_14to4tolc8azsi5.R.inc(6339);if ((((amount == 0)&&(__CLR4_4_14to4tolc8azsi5.R.iget(6340)!=0|true))||(__CLR4_4_14to4tolc8azsi5.R.iget(6341)==0&false))) {{
            __CLR4_4_14to4tolc8azsi5.R.inc(6342);return this;
        }
        }__CLR4_4_14to4tolc8azsi5.R.inc(6343);int[] newValues = getValues();
        __CLR4_4_14to4tolc8azsi5.R.inc(6344);newValues = getField(index).addWrapPartial(this, index, newValues, amount);
        __CLR4_4_14to4tolc8azsi5.R.inc(6345);return new TimeOfDay(this, newValues);
    }finally{__CLR4_4_14to4tolc8azsi5.R.flushNeeded();}}

    /**
     * Returns a copy of this time with the specified period added,
     * wrapping to what would be a new day if required.
     * <p>
     * If the addition is zero, then <code>this</code> is returned.
     * Fields in the period that aren't present in the partial are ignored.
     * <p>
     * This method is typically used to add multiple copies of complex
     * period instances. Adding one field is best achieved using methods
     * like {@link #withFieldAdded(DurationFieldType, int)}
     * or {@link #plusHours(int)}.
     * 
     * @param period  the period to add to this one, null means zero
     * @param scalar  the amount of times to add, such as -1 to subtract once
     * @return a copy of this instance with the period added
     * @throws ArithmeticException if the new datetime exceeds the capacity
     */
    public TimeOfDay withPeriodAdded(ReadablePeriod period, int scalar) {try{__CLR4_4_14to4tolc8azsi5.R.inc(6346);
        __CLR4_4_14to4tolc8azsi5.R.inc(6347);if ((((period == null || scalar == 0)&&(__CLR4_4_14to4tolc8azsi5.R.iget(6348)!=0|true))||(__CLR4_4_14to4tolc8azsi5.R.iget(6349)==0&false))) {{
            __CLR4_4_14to4tolc8azsi5.R.inc(6350);return this;
        }
        }__CLR4_4_14to4tolc8azsi5.R.inc(6351);int[] newValues = getValues();
        __CLR4_4_14to4tolc8azsi5.R.inc(6352);for (int i = 0; (((i < period.size())&&(__CLR4_4_14to4tolc8azsi5.R.iget(6353)!=0|true))||(__CLR4_4_14to4tolc8azsi5.R.iget(6354)==0&false)); i++) {{
            __CLR4_4_14to4tolc8azsi5.R.inc(6355);DurationFieldType fieldType = period.getFieldType(i);
            __CLR4_4_14to4tolc8azsi5.R.inc(6356);int index = indexOf(fieldType);
            __CLR4_4_14to4tolc8azsi5.R.inc(6357);if ((((index >= 0)&&(__CLR4_4_14to4tolc8azsi5.R.iget(6358)!=0|true))||(__CLR4_4_14to4tolc8azsi5.R.iget(6359)==0&false))) {{
                __CLR4_4_14to4tolc8azsi5.R.inc(6360);newValues = getField(index).addWrapPartial(this, index, newValues,
                        FieldUtils.safeMultiply(period.getValue(i), scalar));
            }
        }}
        }__CLR4_4_14to4tolc8azsi5.R.inc(6361);return new TimeOfDay(this, newValues);
    }finally{__CLR4_4_14to4tolc8azsi5.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Returns a copy of this time with the specified period added,
     * wrapping to what would be a new day if required.
     * <p>
     * If the amount is zero or null, then <code>this</code> is returned.
     * <p>
     * This method is typically used to add complex period instances.
     * Adding one field is best achieved using methods
     * like {@link #plusHours(int)}.
     * 
     * @param period  the duration to add to this one, null means zero
     * @return a copy of this instance with the period added
     * @throws ArithmeticException if the new datetime exceeds the capacity of a long
     */
    public TimeOfDay plus(ReadablePeriod period) {try{__CLR4_4_14to4tolc8azsi5.R.inc(6362);
        __CLR4_4_14to4tolc8azsi5.R.inc(6363);return withPeriodAdded(period, 1);
    }finally{__CLR4_4_14to4tolc8azsi5.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Returns a copy of this time plus the specified number of hours.
     * <p>
     * This time instance is immutable and unaffected by this method call.
     * <p>
     * The following three lines are identical in effect:
     * <pre>
     * TimeOfDay added = dt.plusHours(6);
     * TimeOfDay added = dt.plus(Period.hours(6));
     * TimeOfDay added = dt.withFieldAdded(DurationFieldType.hours(), 6);
     * </pre>
     *
     * @param hours  the amount of hours to add, may be negative
     * @return the new time plus the increased hours
     * @since 1.1
     */
    public TimeOfDay plusHours(int hours) {try{__CLR4_4_14to4tolc8azsi5.R.inc(6364);
        __CLR4_4_14to4tolc8azsi5.R.inc(6365);return withFieldAdded(DurationFieldType.hours(), hours);
    }finally{__CLR4_4_14to4tolc8azsi5.R.flushNeeded();}}

    /**
     * Returns a copy of this time plus the specified number of minutes.
     * <p>
     * This time instance is immutable and unaffected by this method call.
     * <p>
     * The following three lines are identical in effect:
     * <pre>
     * TimeOfDay added = dt.plusMinutes(6);
     * TimeOfDay added = dt.plus(Period.minutes(6));
     * TimeOfDay added = dt.withFieldAdded(DurationFieldType.minutes(), 6);
     * </pre>
     *
     * @param minutes  the amount of minutes to add, may be negative
     * @return the new time plus the increased minutes
     * @since 1.1
     */
    public TimeOfDay plusMinutes(int minutes) {try{__CLR4_4_14to4tolc8azsi5.R.inc(6366);
        __CLR4_4_14to4tolc8azsi5.R.inc(6367);return withFieldAdded(DurationFieldType.minutes(), minutes);
    }finally{__CLR4_4_14to4tolc8azsi5.R.flushNeeded();}}

    /**
     * Returns a copy of this time plus the specified number of seconds.
     * <p>
     * This time instance is immutable and unaffected by this method call.
     * <p>
     * The following three lines are identical in effect:
     * <pre>
     * TimeOfDay added = dt.plusSeconds(6);
     * TimeOfDay added = dt.plus(Period.seconds(6));
     * TimeOfDay added = dt.withFieldAdded(DurationFieldType.seconds(), 6);
     * </pre>
     *
     * @param seconds  the amount of seconds to add, may be negative
     * @return the new time plus the increased seconds
     * @since 1.1
     */
    public TimeOfDay plusSeconds(int seconds) {try{__CLR4_4_14to4tolc8azsi5.R.inc(6368);
        __CLR4_4_14to4tolc8azsi5.R.inc(6369);return withFieldAdded(DurationFieldType.seconds(), seconds);
    }finally{__CLR4_4_14to4tolc8azsi5.R.flushNeeded();}}

    /**
     * Returns a copy of this time plus the specified number of millis.
     * <p>
     * This time instance is immutable and unaffected by this method call.
     * <p>
     * The following three lines are identical in effect:
     * <pre>
     * TimeOfDay added = dt.plusMillis(6);
     * TimeOfDay added = dt.plus(Period.millis(6));
     * TimeOfDay added = dt.withFieldAdded(DurationFieldType.millis(), 6);
     * </pre>
     *
     * @param millis  the amount of millis to add, may be negative
     * @return the new time plus the increased millis
     * @since 1.1
     */
    public TimeOfDay plusMillis(int millis) {try{__CLR4_4_14to4tolc8azsi5.R.inc(6370);
        __CLR4_4_14to4tolc8azsi5.R.inc(6371);return withFieldAdded(DurationFieldType.millis(), millis);
    }finally{__CLR4_4_14to4tolc8azsi5.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Returns a copy of this time with the specified period taken away,
     * wrapping to what would be a new day if required.
     * <p>
     * If the amount is zero or null, then <code>this</code> is returned.
     * <p>
     * This method is typically used to subtract complex period instances.
     * Subtracting one field is best achieved using methods
     * like {@link #minusHours(int)}.
     * 
     * @param period  the period to reduce this instant by
     * @return a copy of this instance with the period taken away
     * @throws ArithmeticException if the new time exceeds capacity
     */
    public TimeOfDay minus(ReadablePeriod period) {try{__CLR4_4_14to4tolc8azsi5.R.inc(6372);
        __CLR4_4_14to4tolc8azsi5.R.inc(6373);return withPeriodAdded(period, -1);
    }finally{__CLR4_4_14to4tolc8azsi5.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Returns a copy of this time minus the specified number of hours.
     * <p>
     * This time instance is immutable and unaffected by this method call.
     * <p>
     * The following three lines are identical in effect:
     * <pre>
     * TimeOfDay subtracted = dt.minusHours(6);
     * TimeOfDay subtracted = dt.minus(Period.hours(6));
     * TimeOfDay subtracted = dt.withFieldAdded(DurationFieldType.hours(), -6);
     * </pre>
     *
     * @param hours  the amount of hours to subtract, may be negative
     * @return the new time minus the increased hours
     * @since 1.1
     */
    public TimeOfDay minusHours(int hours) {try{__CLR4_4_14to4tolc8azsi5.R.inc(6374);
        __CLR4_4_14to4tolc8azsi5.R.inc(6375);return withFieldAdded(DurationFieldType.hours(), FieldUtils.safeNegate(hours));
    }finally{__CLR4_4_14to4tolc8azsi5.R.flushNeeded();}}

    /**
     * Returns a copy of this time minus the specified number of minutes.
     * <p>
     * This time instance is immutable and unaffected by this method call.
     * <p>
     * The following three lines are identical in effect:
     * <pre>
     * TimeOfDay subtracted = dt.minusMinutes(6);
     * TimeOfDay subtracted = dt.minus(Period.minutes(6));
     * TimeOfDay subtracted = dt.withFieldAdded(DurationFieldType.minutes(), -6);
     * </pre>
     *
     * @param minutes  the amount of minutes to subtract, may be negative
     * @return the new time minus the increased minutes
     * @since 1.1
     */
    public TimeOfDay minusMinutes(int minutes) {try{__CLR4_4_14to4tolc8azsi5.R.inc(6376);
        __CLR4_4_14to4tolc8azsi5.R.inc(6377);return withFieldAdded(DurationFieldType.minutes(), FieldUtils.safeNegate(minutes));
    }finally{__CLR4_4_14to4tolc8azsi5.R.flushNeeded();}}

    /**
     * Returns a copy of this time minus the specified number of seconds.
     * <p>
     * This time instance is immutable and unaffected by this method call.
     * <p>
     * The following three lines are identical in effect:
     * <pre>
     * TimeOfDay subtracted = dt.minusSeconds(6);
     * TimeOfDay subtracted = dt.minus(Period.seconds(6));
     * TimeOfDay subtracted = dt.withFieldAdded(DurationFieldType.seconds(), -6);
     * </pre>
     *
     * @param seconds  the amount of seconds to subtract, may be negative
     * @return the new time minus the increased seconds
     * @since 1.1
     */
    public TimeOfDay minusSeconds(int seconds) {try{__CLR4_4_14to4tolc8azsi5.R.inc(6378);
        __CLR4_4_14to4tolc8azsi5.R.inc(6379);return withFieldAdded(DurationFieldType.seconds(), FieldUtils.safeNegate(seconds));
    }finally{__CLR4_4_14to4tolc8azsi5.R.flushNeeded();}}

    /**
     * Returns a copy of this time minus the specified number of millis.
     * <p>
     * This time instance is immutable and unaffected by this method call.
     * <p>
     * The following three lines are identical in effect:
     * <pre>
     * TimeOfDay subtracted = dt.minusMillis(6);
     * TimeOfDay subtracted = dt.minus(Period.millis(6));
     * TimeOfDay subtracted = dt.withFieldAdded(DurationFieldType.millis(), -6);
     * </pre>
     *
     * @param millis  the amount of millis to subtract, may be negative
     * @return the new time minus the increased millis
     * @since 1.1
     */
    public TimeOfDay minusMillis(int millis) {try{__CLR4_4_14to4tolc8azsi5.R.inc(6380);
        __CLR4_4_14to4tolc8azsi5.R.inc(6381);return withFieldAdded(DurationFieldType.millis(), FieldUtils.safeNegate(millis));
    }finally{__CLR4_4_14to4tolc8azsi5.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Gets the property object for the specified type, which contains
     * many useful methods.
     *
     * @param type  the field type to get the property for
     * @return the property object
     * @throws IllegalArgumentException if the field is null or unsupported
     */
    public Property property(DateTimeFieldType type) {try{__CLR4_4_14to4tolc8azsi5.R.inc(6382);
        __CLR4_4_14to4tolc8azsi5.R.inc(6383);return new Property(this, indexOfSupported(type));
    }finally{__CLR4_4_14to4tolc8azsi5.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Converts this object to a LocalTime with the same time and chronology.
     *
     * @return a LocalTime with the same time and chronology
     * @since 1.3
     */
    public LocalTime toLocalTime() {try{__CLR4_4_14to4tolc8azsi5.R.inc(6384);
        __CLR4_4_14to4tolc8azsi5.R.inc(6385);return new LocalTime(getHourOfDay(), getMinuteOfHour(),
                getSecondOfMinute(), getMillisOfSecond(), getChronology());
    }finally{__CLR4_4_14to4tolc8azsi5.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Converts this partial to a full datetime using the default time zone
     * setting the time fields from this instance and the date fields from
     * the current time.
     *
     * @return this date as a datetime with the time as the current time
     */
    public DateTime toDateTimeToday() {try{__CLR4_4_14to4tolc8azsi5.R.inc(6386);
        __CLR4_4_14to4tolc8azsi5.R.inc(6387);return toDateTimeToday(null);
    }finally{__CLR4_4_14to4tolc8azsi5.R.flushNeeded();}}

    /**
     * Converts this partial to a full datetime using the specified time zone
     * setting the time fields from this instance and the date fields from
     * the current time.
     * <p>
     * This method uses the chronology from this instance plus the time zone
     * specified.
     *
     * @param zone  the zone to use, null means default
     * @return this date as a datetime with the time as the current time
     */
    public DateTime toDateTimeToday(DateTimeZone zone) {try{__CLR4_4_14to4tolc8azsi5.R.inc(6388);
        __CLR4_4_14to4tolc8azsi5.R.inc(6389);Chronology chrono = getChronology().withZone(zone);
        __CLR4_4_14to4tolc8azsi5.R.inc(6390);long instantMillis = DateTimeUtils.currentTimeMillis();
        __CLR4_4_14to4tolc8azsi5.R.inc(6391);long resolved = chrono.set(this, instantMillis);
        __CLR4_4_14to4tolc8azsi5.R.inc(6392);return new DateTime(resolved, chrono);
    }finally{__CLR4_4_14to4tolc8azsi5.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Get the hour of day (0-23) field value.
     *
     * @return the hour of day
     */
    public int getHourOfDay() {try{__CLR4_4_14to4tolc8azsi5.R.inc(6393);
        __CLR4_4_14to4tolc8azsi5.R.inc(6394);return getValue(HOUR_OF_DAY);
    }finally{__CLR4_4_14to4tolc8azsi5.R.flushNeeded();}}

    /**
     * Get the minute of hour field value.
     *
     * @return the minute of hour
     */
    public int getMinuteOfHour() {try{__CLR4_4_14to4tolc8azsi5.R.inc(6395);
        __CLR4_4_14to4tolc8azsi5.R.inc(6396);return getValue(MINUTE_OF_HOUR);
    }finally{__CLR4_4_14to4tolc8azsi5.R.flushNeeded();}}

    /**
     * Get the second of minute field value.
     *
     * @return the second of minute
     */
    public int getSecondOfMinute() {try{__CLR4_4_14to4tolc8azsi5.R.inc(6397);
        __CLR4_4_14to4tolc8azsi5.R.inc(6398);return getValue(SECOND_OF_MINUTE);
    }finally{__CLR4_4_14to4tolc8azsi5.R.flushNeeded();}}

    /**
     * Get the millis of second field value.
     *
     * @return the millis of second
     */
    public int getMillisOfSecond() {try{__CLR4_4_14to4tolc8azsi5.R.inc(6399);
        __CLR4_4_14to4tolc8azsi5.R.inc(6400);return getValue(MILLIS_OF_SECOND);
    }finally{__CLR4_4_14to4tolc8azsi5.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Returns a copy of this time with the hour of day field updated.
     * <p>
     * TimeOfDay is immutable, so there are no set methods.
     * Instead, this method returns a new instance with the value of
     * hour of day changed.
     *
     * @param hour  the hour of day to set
     * @return a copy of this object with the field set
     * @throws IllegalArgumentException if the value is invalid
     * @since 1.3
     */
    public TimeOfDay withHourOfDay(int hour) {try{__CLR4_4_14to4tolc8azsi5.R.inc(6401);
        __CLR4_4_14to4tolc8azsi5.R.inc(6402);int[] newValues = getValues();
        __CLR4_4_14to4tolc8azsi5.R.inc(6403);newValues = getChronology().hourOfDay().set(this, HOUR_OF_DAY, newValues, hour);
        __CLR4_4_14to4tolc8azsi5.R.inc(6404);return new TimeOfDay(this, newValues);
    }finally{__CLR4_4_14to4tolc8azsi5.R.flushNeeded();}}

    /**
     * Returns a copy of this time with the minute of hour field updated.
     * <p>
     * TimeOfDay is immutable, so there are no set methods.
     * Instead, this method returns a new instance with the value of
     * minute of hour changed.
     *
     * @param minute  the minute of hour to set
     * @return a copy of this object with the field set
     * @throws IllegalArgumentException if the value is invalid
     * @since 1.3
     */
    public TimeOfDay withMinuteOfHour(int minute) {try{__CLR4_4_14to4tolc8azsi5.R.inc(6405);
        __CLR4_4_14to4tolc8azsi5.R.inc(6406);int[] newValues = getValues();
        __CLR4_4_14to4tolc8azsi5.R.inc(6407);newValues = getChronology().minuteOfHour().set(this, MINUTE_OF_HOUR, newValues, minute);
        __CLR4_4_14to4tolc8azsi5.R.inc(6408);return new TimeOfDay(this, newValues);
    }finally{__CLR4_4_14to4tolc8azsi5.R.flushNeeded();}}

    /**
     * Returns a copy of this time with the second of minute field updated.
     * <p>
     * TimeOfDay is immutable, so there are no set methods.
     * Instead, this method returns a new instance with the value of
     * second of minute changed.
     *
     * @param second  the second of minute to set
     * @return a copy of this object with the field set
     * @throws IllegalArgumentException if the value is invalid
     * @since 1.3
     */
    public TimeOfDay withSecondOfMinute(int second) {try{__CLR4_4_14to4tolc8azsi5.R.inc(6409);
        __CLR4_4_14to4tolc8azsi5.R.inc(6410);int[] newValues = getValues();
        __CLR4_4_14to4tolc8azsi5.R.inc(6411);newValues = getChronology().secondOfMinute().set(this, SECOND_OF_MINUTE, newValues, second);
        __CLR4_4_14to4tolc8azsi5.R.inc(6412);return new TimeOfDay(this, newValues);
    }finally{__CLR4_4_14to4tolc8azsi5.R.flushNeeded();}}

    /**
     * Returns a copy of this time with the millis of second field updated.
     * <p>
     * TimeOfDay is immutable, so there are no set methods.
     * Instead, this method returns a new instance with the value of
     * millis of second changed.
     *
     * @param millis  the millis of second to set
     * @return a copy of this object with the field set
     * @throws IllegalArgumentException if the value is invalid
     * @since 1.3
     */
    public TimeOfDay withMillisOfSecond(int millis) {try{__CLR4_4_14to4tolc8azsi5.R.inc(6413);
        __CLR4_4_14to4tolc8azsi5.R.inc(6414);int[] newValues = getValues();
        __CLR4_4_14to4tolc8azsi5.R.inc(6415);newValues = getChronology().millisOfSecond().set(this, MILLIS_OF_SECOND, newValues, millis);
        __CLR4_4_14to4tolc8azsi5.R.inc(6416);return new TimeOfDay(this, newValues);
    }finally{__CLR4_4_14to4tolc8azsi5.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Get the hour of day field property which provides access to advanced functionality.
     * 
     * @return the hour of day property
     */
    public Property hourOfDay() {try{__CLR4_4_14to4tolc8azsi5.R.inc(6417);
        __CLR4_4_14to4tolc8azsi5.R.inc(6418);return new Property(this, HOUR_OF_DAY);
    }finally{__CLR4_4_14to4tolc8azsi5.R.flushNeeded();}}

    /**
     * Get the minute of hour field property which provides access to advanced functionality.
     * 
     * @return the minute of hour property
     */
    public Property minuteOfHour() {try{__CLR4_4_14to4tolc8azsi5.R.inc(6419);
        __CLR4_4_14to4tolc8azsi5.R.inc(6420);return new Property(this, MINUTE_OF_HOUR);
    }finally{__CLR4_4_14to4tolc8azsi5.R.flushNeeded();}}

    /**
     * Get the second of minute field property which provides access to advanced functionality.
     * 
     * @return the second of minute property
     */
    public Property secondOfMinute() {try{__CLR4_4_14to4tolc8azsi5.R.inc(6421);
        __CLR4_4_14to4tolc8azsi5.R.inc(6422);return new Property(this, SECOND_OF_MINUTE);
    }finally{__CLR4_4_14to4tolc8azsi5.R.flushNeeded();}}

    /**
     * Get the millis of second property which provides access to advanced functionality.
     * 
     * @return the millis of second property
     */
    public Property millisOfSecond() {try{__CLR4_4_14to4tolc8azsi5.R.inc(6423);
        __CLR4_4_14to4tolc8azsi5.R.inc(6424);return new Property(this, MILLIS_OF_SECOND);
    }finally{__CLR4_4_14to4tolc8azsi5.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Output the time in the ISO8601 format THH:mm:ss.SSS.
     * 
     * @return ISO8601 formatted string
     */
    public String toString() {try{__CLR4_4_14to4tolc8azsi5.R.inc(6425);
        __CLR4_4_14to4tolc8azsi5.R.inc(6426);return ISODateTimeFormat.tTime().print(this);
    }finally{__CLR4_4_14to4tolc8azsi5.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * The property class for <code>TimeOfDay</code>.
     * <p>
     * This class binds a <code>TimeOfDay</code> to a <code>DateTimeField</code>.
     * 
     * @author Stephen Colebourne
     * @since 1.0
     * @deprecated Use LocalTime which has a much better internal implementation
     */
    @Deprecated
    public static class Property extends AbstractPartialFieldProperty implements Serializable {

        /** Serialization version */
        private static final long serialVersionUID = 5598459141741063833L;

        /** The partial */
        private final TimeOfDay iTimeOfDay;
        /** The field index */
        private final int iFieldIndex;

        /**
         * Constructs a property.
         * 
         * @param partial  the partial instance
         * @param fieldIndex  the index in the partial
         */
        Property(TimeOfDay partial, int fieldIndex) {
            super();__CLR4_4_14to4tolc8azsi5.R.inc(6428);try{__CLR4_4_14to4tolc8azsi5.R.inc(6427);
            __CLR4_4_14to4tolc8azsi5.R.inc(6429);iTimeOfDay = partial;
            __CLR4_4_14to4tolc8azsi5.R.inc(6430);iFieldIndex = fieldIndex;
        }finally{__CLR4_4_14to4tolc8azsi5.R.flushNeeded();}}

        /**
         * Gets the field that this property uses.
         * 
         * @return the field
         */
        public DateTimeField getField() {try{__CLR4_4_14to4tolc8azsi5.R.inc(6431);
            __CLR4_4_14to4tolc8azsi5.R.inc(6432);return iTimeOfDay.getField(iFieldIndex);
        }finally{__CLR4_4_14to4tolc8azsi5.R.flushNeeded();}}

        /**
         * Gets the partial that this property belongs to.
         * 
         * @return the partial
         */
        protected ReadablePartial getReadablePartial() {try{__CLR4_4_14to4tolc8azsi5.R.inc(6433);
            __CLR4_4_14to4tolc8azsi5.R.inc(6434);return iTimeOfDay;
        }finally{__CLR4_4_14to4tolc8azsi5.R.flushNeeded();}}

        /**
         * Gets the partial that this property belongs to.
         * 
         * @return the partial
         */
        public TimeOfDay getTimeOfDay() {try{__CLR4_4_14to4tolc8azsi5.R.inc(6435);
            __CLR4_4_14to4tolc8azsi5.R.inc(6436);return iTimeOfDay;
        }finally{__CLR4_4_14to4tolc8azsi5.R.flushNeeded();}}

        /**
         * Gets the value of this field.
         * 
         * @return the field value
         */
        public int get() {try{__CLR4_4_14to4tolc8azsi5.R.inc(6437);
            __CLR4_4_14to4tolc8azsi5.R.inc(6438);return iTimeOfDay.getValue(iFieldIndex);
        }finally{__CLR4_4_14to4tolc8azsi5.R.flushNeeded();}}

        //-----------------------------------------------------------------------
        /**
         * Adds to the value of this field in a copy of this TimeOfDay,
         * wrapping to what would be the next day if necessary.
         * <p>
         * The value will be added to this field. If the value is too large to be
         * added solely to this field then it will affect larger fields.
         * Smaller fields are unaffected.
         * <p>
         * If the result would be too large, beyond 23:59:59:999, then the
         * calculation wraps to 00:00:00.000. For the alternate strict behaviour
         * with no wrapping see {@link #addNoWrapToCopy(int)}.
         * <p>
         * The TimeOfDay attached to this property is unchanged by this call.
         * Instead, a new instance is returned.
         * 
         * @param valueToAdd  the value to add to the field in the copy
         * @return a copy of the TimeOfDay with the field value changed
         * @throws IllegalArgumentException if the value isn't valid
         */
        public TimeOfDay addToCopy(int valueToAdd) {try{__CLR4_4_14to4tolc8azsi5.R.inc(6439);
            __CLR4_4_14to4tolc8azsi5.R.inc(6440);int[] newValues = iTimeOfDay.getValues();
            __CLR4_4_14to4tolc8azsi5.R.inc(6441);newValues = getField().addWrapPartial(iTimeOfDay, iFieldIndex, newValues, valueToAdd);
            __CLR4_4_14to4tolc8azsi5.R.inc(6442);return new TimeOfDay(iTimeOfDay, newValues);
        }finally{__CLR4_4_14to4tolc8azsi5.R.flushNeeded();}}

        /**
         * Adds to the value of this field in a copy of this TimeOfDay,
         * throwing an Exception if the bounds are exceeded.
         * <p>
         * The value will be added to this field. If the value is too large to be
         * added solely to this field then it will affect larger fields.
         * Smaller fields are unaffected.
         * <p>
         * If the result would be too large (beyond 23:59:59:999) or too
         * small (less than 00:00:00.000) then an Execption is thrown.
         * For the alternate behaviour which wraps to the next 'day',
         * see {@link #addToCopy(int)}.
         * <p>
         * The TimeOfDay attached to this property is unchanged by this call.
         * Instead, a new instance is returned.
         * 
         * @param valueToAdd  the value to add to the field in the copy
         * @return a copy of the TimeOfDay with the field value changed
         * @throws IllegalArgumentException if the value isn't valid
         */
        public TimeOfDay addNoWrapToCopy(int valueToAdd) {try{__CLR4_4_14to4tolc8azsi5.R.inc(6443);
            __CLR4_4_14to4tolc8azsi5.R.inc(6444);int[] newValues = iTimeOfDay.getValues();
            __CLR4_4_14to4tolc8azsi5.R.inc(6445);newValues = getField().add(iTimeOfDay, iFieldIndex, newValues, valueToAdd);
            __CLR4_4_14to4tolc8azsi5.R.inc(6446);return new TimeOfDay(iTimeOfDay, newValues);
        }finally{__CLR4_4_14to4tolc8azsi5.R.flushNeeded();}}

        /**
         * Adds to the value of this field in a copy of this TimeOfDay wrapping
         * within this field if the maximum value is reached.
         * <p>
         * The value will be added to this field. If the value is too large to be
         * added solely to this field then it wraps within this field.
         * Other fields are unaffected.
         * <p>
         * For example,
         * <code>12:59:37</code> addWrapField one minute returns <code>12:00:37</code>.
         * <p>
         * The TimeOfDay attached to this property is unchanged by this call.
         * Instead, a new instance is returned.
         * 
         * @param valueToAdd  the value to add to the field in the copy
         * @return a copy of the TimeOfDay with the field value changed
         * @throws IllegalArgumentException if the value isn't valid
         */
        public TimeOfDay addWrapFieldToCopy(int valueToAdd) {try{__CLR4_4_14to4tolc8azsi5.R.inc(6447);
            __CLR4_4_14to4tolc8azsi5.R.inc(6448);int[] newValues = iTimeOfDay.getValues();
            __CLR4_4_14to4tolc8azsi5.R.inc(6449);newValues = getField().addWrapField(iTimeOfDay, iFieldIndex, newValues, valueToAdd);
            __CLR4_4_14to4tolc8azsi5.R.inc(6450);return new TimeOfDay(iTimeOfDay, newValues);
        }finally{__CLR4_4_14to4tolc8azsi5.R.flushNeeded();}}

        //-----------------------------------------------------------------------
        /**
         * Sets this field in a copy of the TimeOfDay.
         * <p>
         * The TimeOfDay attached to this property is unchanged by this call.
         * Instead, a new instance is returned.
         * 
         * @param value  the value to set the field in the copy to
         * @return a copy of the TimeOfDay with the field value changed
         * @throws IllegalArgumentException if the value isn't valid
         */
        public TimeOfDay setCopy(int value) {try{__CLR4_4_14to4tolc8azsi5.R.inc(6451);
            __CLR4_4_14to4tolc8azsi5.R.inc(6452);int[] newValues = iTimeOfDay.getValues();
            __CLR4_4_14to4tolc8azsi5.R.inc(6453);newValues = getField().set(iTimeOfDay, iFieldIndex, newValues, value);
            __CLR4_4_14to4tolc8azsi5.R.inc(6454);return new TimeOfDay(iTimeOfDay, newValues);
        }finally{__CLR4_4_14to4tolc8azsi5.R.flushNeeded();}}

        /**
         * Sets this field in a copy of the TimeOfDay to a parsed text value.
         * <p>
         * The TimeOfDay attached to this property is unchanged by this call.
         * Instead, a new instance is returned.
         * 
         * @param text  the text value to set
         * @param locale  optional locale to use for selecting a text symbol
         * @return a copy of the TimeOfDay with the field value changed
         * @throws IllegalArgumentException if the text value isn't valid
         */
        public TimeOfDay setCopy(String text, Locale locale) {try{__CLR4_4_14to4tolc8azsi5.R.inc(6455);
            __CLR4_4_14to4tolc8azsi5.R.inc(6456);int[] newValues = iTimeOfDay.getValues();
            __CLR4_4_14to4tolc8azsi5.R.inc(6457);newValues = getField().set(iTimeOfDay, iFieldIndex, newValues, text, locale);
            __CLR4_4_14to4tolc8azsi5.R.inc(6458);return new TimeOfDay(iTimeOfDay, newValues);
        }finally{__CLR4_4_14to4tolc8azsi5.R.flushNeeded();}}

        /**
         * Sets this field in a copy of the TimeOfDay to a parsed text value.
         * <p>
         * The TimeOfDay attached to this property is unchanged by this call.
         * Instead, a new instance is returned.
         * 
         * @param text  the text value to set
         * @return a copy of the TimeOfDay with the field value changed
         * @throws IllegalArgumentException if the text value isn't valid
         */
        public TimeOfDay setCopy(String text) {try{__CLR4_4_14to4tolc8azsi5.R.inc(6459);
            __CLR4_4_14to4tolc8azsi5.R.inc(6460);return setCopy(text, null);
        }finally{__CLR4_4_14to4tolc8azsi5.R.flushNeeded();}}

        //-----------------------------------------------------------------------
        /**
         * Returns a new TimeOfDay with this field set to the maximum value
         * for this field.
         * <p>
         * The TimeOfDay attached to this property is unchanged by this call.
         *
         * @return a copy of the TimeOfDay with this field set to its maximum
         * @since 1.2
         */
        public TimeOfDay withMaximumValue() {try{__CLR4_4_14to4tolc8azsi5.R.inc(6461);
            __CLR4_4_14to4tolc8azsi5.R.inc(6462);return setCopy(getMaximumValue());
        }finally{__CLR4_4_14to4tolc8azsi5.R.flushNeeded();}}

        /**
         * Returns a new TimeOfDay with this field set to the minimum value
         * for this field.
         * <p>
         * The TimeOfDay attached to this property is unchanged by this call.
         *
         * @return a copy of the TimeOfDay with this field set to its minimum
         * @since 1.2
         */
        public TimeOfDay withMinimumValue() {try{__CLR4_4_14to4tolc8azsi5.R.inc(6463);
            __CLR4_4_14to4tolc8azsi5.R.inc(6464);return setCopy(getMinimumValue());
        }finally{__CLR4_4_14to4tolc8azsi5.R.flushNeeded();}}
    }

}
