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

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.joda.convert.FromString;
import org.joda.convert.ToString;
import org.joda.time.base.BasePartial;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.field.AbstractPartialFieldProperty;
import org.joda.time.field.FieldUtils;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.DateTimeFormatterBuilder;
import org.joda.time.format.ISODateTimeFormat;

/**
 * MonthDay is an immutable partial supporting the monthOfYear and dayOfMonth fields.
 * <p>
 * NOTE: This class only supports the two fields listed above.
 * It is impossible to query any other fields, such as dayOfWeek or centuryOfEra.
 * <p>
 * Calculations on MonthDay are performed using a {@link Chronology}.
 * This chronology is set to be in the UTC time zone for all calculations.
 * <p>
 * One use case for this class is to store a birthday without the year (to avoid
 * storing the age of the person).
 * This class can be used as the gMonthDay type in XML Schema.
 * <p>
 * Each individual field can be queried in two ways:
 * <ul>
 * <li><code>getMonthOfYear()</code>
 * <li><code>monthOfYear().get()</code>
 * </ul>
 * The second technique also provides access to other useful methods on the
 * field:
 * <ul>
 * <li>numeric value - <code>monthOfYear().get()</code>
 * <li>text value - <code>monthOfYear().getAsText()</code>
 * <li>short text value - <code>monthOfYear().getAsShortText()</code>
 * <li>maximum/minimum values - <code>monthOfYear().getMaximumValue()</code>
 * <li>add/subtract - <code>monthOfYear().addToCopy()</code>
 * <li>set - <code>monthOfYear().setCopy()</code>
 * </ul>
 * <p>
 * MonthDay is thread-safe and immutable, provided that the Chronology is as well.
 * All standard Chronology classes supplied are thread-safe and immutable.
 *
 * @author Chris Pheby
 * @since 2.0
 */
@java.lang.SuppressWarnings({"fallthrough"}) public final class MonthDay
        extends BasePartial
        implements ReadablePartial, Serializable {public static class __CLR4_4_135m35mlc8azs6o{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672271027956L,8589935092L,4286,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** Serialization version */
    private static final long serialVersionUID = 2954560699050434609L;

    /** The singleton set of field types */
    private static final DateTimeFieldType[] FIELD_TYPES = new DateTimeFieldType[] {
        DateTimeFieldType.monthOfYear(),
        DateTimeFieldType.dayOfMonth(), };

    /** The singleton set of field types */
    private static final DateTimeFormatter PARSER = new DateTimeFormatterBuilder()
        .appendOptional(ISODateTimeFormat.localDateParser().getParser())
        .appendOptional(DateTimeFormat.forPattern("--MM-dd").getParser()).toFormatter();

    /** The index of the monthOfYear field in the field array */
    public static final int MONTH_OF_YEAR = 0;
    /** The index of the day field in the field array */
    public static final int DAY_OF_MONTH = 1;

    //-----------------------------------------------------------------------
    /**
     * Obtains a {@code MonthDay} set to the current system millisecond time
     * using <code>ISOChronology</code> in the default time zone.
     * The resulting object does not use the zone.
     * 
     * @return the current month-day, not null
     * @since 2.0
     */
    public static MonthDay now() {try{__CLR4_4_135m35mlc8azs6o.R.inc(4090);
        __CLR4_4_135m35mlc8azs6o.R.inc(4091);return new MonthDay();
    }finally{__CLR4_4_135m35mlc8azs6o.R.flushNeeded();}}

    /**
     * Obtains a {@code MonthDay} set to the current system millisecond time
     * using <code>ISOChronology</code> in the specified time zone.
     * The resulting object does not use the zone.
     *
     * @param zone  the time zone, not null
     * @return the current month-day, not null
     * @since 2.0
     */
    public static MonthDay now(DateTimeZone zone) {try{__CLR4_4_135m35mlc8azs6o.R.inc(4092);
        __CLR4_4_135m35mlc8azs6o.R.inc(4093);if ((((zone == null)&&(__CLR4_4_135m35mlc8azs6o.R.iget(4094)!=0|true))||(__CLR4_4_135m35mlc8azs6o.R.iget(4095)==0&false))) {{
            __CLR4_4_135m35mlc8azs6o.R.inc(4096);throw new NullPointerException("Zone must not be null");
        }
        }__CLR4_4_135m35mlc8azs6o.R.inc(4097);return new MonthDay(zone);
    }finally{__CLR4_4_135m35mlc8azs6o.R.flushNeeded();}}

    /**
     * Obtains a {@code MonthDay} set to the current system millisecond time
     * using the specified chronology.
     * The resulting object does not use the zone.
     *
     * @param chronology  the chronology, not null
     * @return the current month-day, not null
     * @since 2.0
     */
    public static MonthDay now(Chronology chronology) {try{__CLR4_4_135m35mlc8azs6o.R.inc(4098);
        __CLR4_4_135m35mlc8azs6o.R.inc(4099);if ((((chronology == null)&&(__CLR4_4_135m35mlc8azs6o.R.iget(4100)!=0|true))||(__CLR4_4_135m35mlc8azs6o.R.iget(4101)==0&false))) {{
            __CLR4_4_135m35mlc8azs6o.R.inc(4102);throw new NullPointerException("Chronology must not be null");
        }
        }__CLR4_4_135m35mlc8azs6o.R.inc(4103);return new MonthDay(chronology);
    }finally{__CLR4_4_135m35mlc8azs6o.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Parses a {@code MonthDay} from the specified string.
     * <p>
     * This uses {@link ISODateTimeFormat#localDateParser()} or the format {@code --MM-dd}.
     * 
     * @param str  the string to parse, not null
     * @since 2.0
     */
    @FromString
    public static MonthDay parse(String str) {try{__CLR4_4_135m35mlc8azs6o.R.inc(4104);
        __CLR4_4_135m35mlc8azs6o.R.inc(4105);return parse(str, PARSER);
    }finally{__CLR4_4_135m35mlc8azs6o.R.flushNeeded();}}

    /**
     * Parses a {@code MonthDay} from the specified string using a formatter.
     * 
     * @param str  the string to parse, not null
     * @param formatter  the formatter to use, not null
     * @since 2.0
     */
    public static MonthDay parse(String str, DateTimeFormatter formatter) {try{__CLR4_4_135m35mlc8azs6o.R.inc(4106);
        __CLR4_4_135m35mlc8azs6o.R.inc(4107);LocalDate date = formatter.parseLocalDate(str);
        __CLR4_4_135m35mlc8azs6o.R.inc(4108);return new MonthDay(date.getMonthOfYear(), date.getDayOfMonth());
    }finally{__CLR4_4_135m35mlc8azs6o.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Constructs a MonthDay from a <code>java.util.Calendar</code>
     * using exactly the same field values avoiding any time zone effects.
     * <p>
     * Each field is queried from the Calendar and assigned to the MonthDay.
     * <p>
     * This factory method ignores the type of the calendar and always
     * creates a MonthDay with ISO chronology. It is expected that you
     * will only pass in instances of <code>GregorianCalendar</code> however
     * this is not validated.
     *
     * @param calendar  the Calendar to extract fields from
     * @return the created MonthDay, never null
     * @throws IllegalArgumentException if the calendar is null
     * @throws IllegalArgumentException if the monthOfYear or dayOfMonth is invalid for the ISO chronology
     */
    public static MonthDay fromCalendarFields(Calendar calendar) {try{__CLR4_4_135m35mlc8azs6o.R.inc(4109);
        __CLR4_4_135m35mlc8azs6o.R.inc(4110);if ((((calendar == null)&&(__CLR4_4_135m35mlc8azs6o.R.iget(4111)!=0|true))||(__CLR4_4_135m35mlc8azs6o.R.iget(4112)==0&false))) {{
            __CLR4_4_135m35mlc8azs6o.R.inc(4113);throw new IllegalArgumentException("The calendar must not be null");
        }
        }__CLR4_4_135m35mlc8azs6o.R.inc(4114);return new MonthDay(calendar.get(Calendar.MONTH) + 1, calendar.get(Calendar.DAY_OF_MONTH));
    }finally{__CLR4_4_135m35mlc8azs6o.R.flushNeeded();}}

    /**
     * Constructs a MonthDay from a <code>java.util.Date</code>
     * using exactly the same field values avoiding any time zone effects.
     * <p>
     * Each field is queried from the Date and assigned to the MonthDay.
     * <p>
     * This factory method always creates a MonthDay with ISO chronology.
     *
     * @param date  the Date to extract fields from
     * @return the created MonthDay, never null
     * @throws IllegalArgumentException if the calendar is null
     * @throws IllegalArgumentException if the monthOfYear or dayOfMonth is invalid for the ISO chronology
     */
    @SuppressWarnings("deprecation")
    public static MonthDay fromDateFields(Date date) {try{__CLR4_4_135m35mlc8azs6o.R.inc(4115);
        __CLR4_4_135m35mlc8azs6o.R.inc(4116);if ((((date == null)&&(__CLR4_4_135m35mlc8azs6o.R.iget(4117)!=0|true))||(__CLR4_4_135m35mlc8azs6o.R.iget(4118)==0&false))) {{
            __CLR4_4_135m35mlc8azs6o.R.inc(4119);throw new IllegalArgumentException("The date must not be null");
        }
        }__CLR4_4_135m35mlc8azs6o.R.inc(4120);return new MonthDay(date.getMonth() + 1, date.getDate());
    }finally{__CLR4_4_135m35mlc8azs6o.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Constructs a MonthDay with the current monthOfYear, using ISOChronology in
     * the default zone to extract the fields.
     * <p>
     * The constructor uses the default time zone, resulting in the local time
     * being initialised. Once the constructor is complete, all further calculations
     * are performed without reference to a time-zone (by switching to UTC).
     * 
     * @see #now()
     */
    public MonthDay() {
        super();__CLR4_4_135m35mlc8azs6o.R.inc(4122);try{__CLR4_4_135m35mlc8azs6o.R.inc(4121);
    }finally{__CLR4_4_135m35mlc8azs6o.R.flushNeeded();}}

    /**
     * Constructs a MonthDay with the current month-day, using ISOChronology in
     * the specified zone to extract the fields.
     * <p>
     * The constructor uses the specified time zone to obtain the current month-day.
     * Once the constructor is complete, all further calculations
     * are performed without reference to a time-zone (by switching to UTC).
     * 
     * @param zone  the zone to use, null means default zone
     * @see #now(DateTimeZone)
     */
    public MonthDay(DateTimeZone zone) {
        super(ISOChronology.getInstance(zone));__CLR4_4_135m35mlc8azs6o.R.inc(4124);try{__CLR4_4_135m35mlc8azs6o.R.inc(4123);
    }finally{__CLR4_4_135m35mlc8azs6o.R.flushNeeded();}}

    /**
     * Constructs a MonthDay with the current month-day, using the specified chronology
     * and zone to extract the fields.
     * <p>
     * The constructor uses the time zone of the chronology specified.
     * Once the constructor is complete, all further calculations are performed
     * without reference to a time-zone (by switching to UTC).
     *
     * @param chronology  the chronology, null means ISOChronology in the default zone
     * @see #now(Chronology)
     */
    public MonthDay(Chronology chronology) {
        super(chronology);__CLR4_4_135m35mlc8azs6o.R.inc(4126);try{__CLR4_4_135m35mlc8azs6o.R.inc(4125);
    }finally{__CLR4_4_135m35mlc8azs6o.R.flushNeeded();}}

    /**
     * Constructs a MonthDay extracting the partial fields from the specified
     * milliseconds using the ISOChronology in the default zone.
     * <p>
     * The constructor uses the default time zone, resulting in the local time
     * being initialised. Once the constructor is complete, all further calculations
     * are performed without reference to a time-zone (by switching to UTC).
     *
     * @param instant  the milliseconds from 1970-01-01T00:00:00Z
     */
    public MonthDay(long instant) {
        super(instant);__CLR4_4_135m35mlc8azs6o.R.inc(4128);try{__CLR4_4_135m35mlc8azs6o.R.inc(4127);
    }finally{__CLR4_4_135m35mlc8azs6o.R.flushNeeded();}}

    /**
     * Constructs a MonthDay extracting the partial fields from the specified
     * milliseconds using the chronology provided.
     * <p>
     * The constructor uses the time zone of the chronology specified.
     * Once the constructor is complete, all further calculations are performed
     * without reference to a time-zone (by switching to UTC).
     *
     * @param instant  the milliseconds from 1970-01-01T00:00:00Z
     * @param chronology  the chronology, null means ISOChronology in the default zone
     */
    public MonthDay(long instant, Chronology chronology) {
        super(instant, chronology);__CLR4_4_135m35mlc8azs6o.R.inc(4130);try{__CLR4_4_135m35mlc8azs6o.R.inc(4129);
    }finally{__CLR4_4_135m35mlc8azs6o.R.flushNeeded();}}

    /**
     * Constructs a MonthDay from an Object that represents some form of time.
     * <p>
     * The recognised object types are defined in
     * {@link org.joda.time.convert.ConverterManager ConverterManager} and
     * include ReadableInstant, String, Calendar and Date.
     * The String formats are described by {@link ISODateTimeFormat#localDateParser()}.
     * <p>
     * The chronology used will be derived from the object, defaulting to ISO.
     *
     * @param instant  the date-time object, null means now
     * @throws IllegalArgumentException if the instant is invalid
     */
    public MonthDay(Object instant) {
        super(instant, null, ISODateTimeFormat.localDateParser());__CLR4_4_135m35mlc8azs6o.R.inc(4132);try{__CLR4_4_135m35mlc8azs6o.R.inc(4131);
    }finally{__CLR4_4_135m35mlc8azs6o.R.flushNeeded();}}

    /**
     * Constructs a MonthDay from an Object that represents some form of time,
     * using the specified chronology.
     * <p>
     * The recognised object types are defined in
     * {@link org.joda.time.convert.ConverterManager ConverterManager} and
     * include ReadableInstant, String, Calendar and Date.
     * The String formats are described by {@link ISODateTimeFormat#localDateParser()}.
     * <p>
     * The constructor uses the time zone of the chronology specified.
     * Once the constructor is complete, all further calculations are performed
     * without reference to a time-zone (by switching to UTC).
     * The specified chronology overrides that of the object.
     *
     * @param instant  the date-time object, null means now
     * @param chronology  the chronology, null means ISO default
     * @throws IllegalArgumentException if the instant is invalid
     */
    public MonthDay(Object instant, Chronology chronology) {
        super(instant, DateTimeUtils.getChronology(chronology), ISODateTimeFormat.localDateParser());__CLR4_4_135m35mlc8azs6o.R.inc(4134);try{__CLR4_4_135m35mlc8azs6o.R.inc(4133);
    }finally{__CLR4_4_135m35mlc8azs6o.R.flushNeeded();}}

    /**
     * Constructs a MonthDay with specified year and month
     * using <code>ISOChronology</code>.
     * <p>
     * The constructor uses the no time zone initialising the fields as provided.
     * Once the constructor is complete, all further calculations
     * are performed without reference to a time-zone (by switching to UTC).
     *
     * @param monthOfYear  the month of the year
     * @param dayOfMonth  the day of the month
     */
    public MonthDay(int monthOfYear, int dayOfMonth) {
        this(monthOfYear, dayOfMonth, null);__CLR4_4_135m35mlc8azs6o.R.inc(4136);try{__CLR4_4_135m35mlc8azs6o.R.inc(4135);
    }finally{__CLR4_4_135m35mlc8azs6o.R.flushNeeded();}}

    /**
     * Constructs an instance set to the specified monthOfYear and dayOfMonth
     * using the specified chronology, whose zone is ignored.
     * <p>
     * If the chronology is null, <code>ISOChronology</code> is used.
     * <p>
     * The constructor uses the time zone of the chronology specified.
     * Once the constructor is complete, all further calculations are performed
     * without reference to a time-zone (by switching to UTC).
     *
     * @param monthOfYear  the month of the year
     * @param dayOfMonth  the day of the month
     * @param chronology  the chronology, null means ISOChronology in the default zone
     */
    public MonthDay(int monthOfYear, int dayOfMonth, Chronology chronology) {
        super(new int[] {monthOfYear, dayOfMonth}, chronology);__CLR4_4_135m35mlc8azs6o.R.inc(4138);try{__CLR4_4_135m35mlc8azs6o.R.inc(4137);
    }finally{__CLR4_4_135m35mlc8azs6o.R.flushNeeded();}}

    /**
     * Constructs a MonthDay with chronology from this instance and new values.
     *
     * @param partial  the partial to base this new instance on
     * @param values  the new set of values
     */
    MonthDay(MonthDay partial, int[] values) {
        super(partial, values);__CLR4_4_135m35mlc8azs6o.R.inc(4140);try{__CLR4_4_135m35mlc8azs6o.R.inc(4139);
    }finally{__CLR4_4_135m35mlc8azs6o.R.flushNeeded();}}

    /**
     * Constructs a MonthDay with values from this instance and a new chronology.
     *
     * @param partial  the partial to base this new instance on
     * @param chrono  the new chronology
     */
    MonthDay(MonthDay partial, Chronology chrono) {
        super(partial, chrono);__CLR4_4_135m35mlc8azs6o.R.inc(4142);try{__CLR4_4_135m35mlc8azs6o.R.inc(4141);
    }finally{__CLR4_4_135m35mlc8azs6o.R.flushNeeded();}}

    /**
     * Handle broken serialization from other tools.
     * @return the resolved object, not null
     */
    private Object readResolve() {try{__CLR4_4_135m35mlc8azs6o.R.inc(4143);
        __CLR4_4_135m35mlc8azs6o.R.inc(4144);if ((((DateTimeZone.UTC.equals(getChronology().getZone()) == false)&&(__CLR4_4_135m35mlc8azs6o.R.iget(4145)!=0|true))||(__CLR4_4_135m35mlc8azs6o.R.iget(4146)==0&false))) {{
            __CLR4_4_135m35mlc8azs6o.R.inc(4147);return new MonthDay(this, getChronology().withUTC());
        }
        }__CLR4_4_135m35mlc8azs6o.R.inc(4148);return this;
    }finally{__CLR4_4_135m35mlc8azs6o.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Gets the number of fields in this partial, which is two.
     * The supported fields are MonthOfYear and DayOfMonth.
     * Note that only these fields may be queried.
     *
     * @return the field count, two
     */
    public int size() {try{__CLR4_4_135m35mlc8azs6o.R.inc(4149);
        __CLR4_4_135m35mlc8azs6o.R.inc(4150);return 2;
    }finally{__CLR4_4_135m35mlc8azs6o.R.flushNeeded();}}

    /**
     * Gets the field for a specific index in the chronology specified.
     * <p>
     * This method must not use any instance variables.
     * 
     * @param index  the index to retrieve
     * @param chrono  the chronology to use
     * @return the field, never null
     */
    protected DateTimeField getField(int index, Chronology chrono) {try{__CLR4_4_135m35mlc8azs6o.R.inc(4151);
        boolean __CLB4_4_1_bool0=false;__CLR4_4_135m35mlc8azs6o.R.inc(4152);switch (index) {
        case MONTH_OF_YEAR:if (!__CLB4_4_1_bool0) {__CLR4_4_135m35mlc8azs6o.R.inc(4153);__CLB4_4_1_bool0=true;}
            __CLR4_4_135m35mlc8azs6o.R.inc(4154);return chrono.monthOfYear();
        case DAY_OF_MONTH:if (!__CLB4_4_1_bool0) {__CLR4_4_135m35mlc8azs6o.R.inc(4155);__CLB4_4_1_bool0=true;}
            __CLR4_4_135m35mlc8azs6o.R.inc(4156);return chrono.dayOfMonth();
        default:if (!__CLB4_4_1_bool0) {__CLR4_4_135m35mlc8azs6o.R.inc(4157);__CLB4_4_1_bool0=true;}
            __CLR4_4_135m35mlc8azs6o.R.inc(4158);throw new IndexOutOfBoundsException("Invalid index: " + index);
        }
    }finally{__CLR4_4_135m35mlc8azs6o.R.flushNeeded();}}

    /**
     * Gets the field type at the specified index.
     *
     * @param index  the index to retrieve
     * @return the field at the specified index, never null
     * @throws IndexOutOfBoundsException if the index is invalid
     */
    public DateTimeFieldType getFieldType(int index) {try{__CLR4_4_135m35mlc8azs6o.R.inc(4159);
        __CLR4_4_135m35mlc8azs6o.R.inc(4160);return FIELD_TYPES[index];
    }finally{__CLR4_4_135m35mlc8azs6o.R.flushNeeded();}}

    /**
     * Gets an array of the field type of each of the fields that this partial supports.
     * <p>
     * The fields are returned largest to smallest, Month, Day.
     *
     * @return the array of field types (cloned), largest to smallest, never null
     */
    public DateTimeFieldType[] getFieldTypes() {try{__CLR4_4_135m35mlc8azs6o.R.inc(4161);
        __CLR4_4_135m35mlc8azs6o.R.inc(4162);return (DateTimeFieldType[]) FIELD_TYPES.clone();
    }finally{__CLR4_4_135m35mlc8azs6o.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Returns a copy of this month-day with the specified chronology.
     * This instance is immutable and unaffected by this method call.
     * <p>
     * This method retains the values of the fields, thus the result will
     * typically refer to a different instant.
     * <p>
     * The time zone of the specified chronology is ignored, as MonthDay
     * operates without a time zone.
     *
     * @param newChronology  the new chronology, null means ISO
     * @return a copy of this month-day with a different chronology, never null
     * @throws IllegalArgumentException if the values are invalid for the new chronology
     */
    public MonthDay withChronologyRetainFields(Chronology newChronology) {try{__CLR4_4_135m35mlc8azs6o.R.inc(4163);
        __CLR4_4_135m35mlc8azs6o.R.inc(4164);newChronology = DateTimeUtils.getChronology(newChronology);
        __CLR4_4_135m35mlc8azs6o.R.inc(4165);newChronology = newChronology.withUTC();
        __CLR4_4_135m35mlc8azs6o.R.inc(4166);if ((((newChronology == getChronology())&&(__CLR4_4_135m35mlc8azs6o.R.iget(4167)!=0|true))||(__CLR4_4_135m35mlc8azs6o.R.iget(4168)==0&false))) {{
            __CLR4_4_135m35mlc8azs6o.R.inc(4169);return this;
        } }else {{
            __CLR4_4_135m35mlc8azs6o.R.inc(4170);MonthDay newMonthDay = new MonthDay(this, newChronology);
            __CLR4_4_135m35mlc8azs6o.R.inc(4171);newChronology.validate(newMonthDay, getValues());
            __CLR4_4_135m35mlc8azs6o.R.inc(4172);return newMonthDay;
        }
    }}finally{__CLR4_4_135m35mlc8azs6o.R.flushNeeded();}}

    /**
     * Returns a copy of this month-day with the specified field set to a new value.
     * <p>
     * For example, if the field type is <code>dayOfMonth</code> then the day
     * would be changed in the returned instance.
     * <p>
     * These three lines are equivalent:
     * <pre>
     * MonthDay updated = md.withField(DateTimeFieldType.dayOfMonth(), 6);
     * MonthDay updated = md.dayOfMonth().setCopy(6);
     * MonthDay updated = md.property(DateTimeFieldType.dayOfMonth()).setCopy(6);
     * </pre>
     *
     * @param fieldType  the field type to set, not null
     * @param value  the value to set
     * @return a copy of this instance with the field set, never null
     * @throws IllegalArgumentException if the value is null or invalid
     */
    public MonthDay withField(DateTimeFieldType fieldType, int value) {try{__CLR4_4_135m35mlc8azs6o.R.inc(4173);
        __CLR4_4_135m35mlc8azs6o.R.inc(4174);int index = indexOfSupported(fieldType);
        __CLR4_4_135m35mlc8azs6o.R.inc(4175);if ((((value == getValue(index))&&(__CLR4_4_135m35mlc8azs6o.R.iget(4176)!=0|true))||(__CLR4_4_135m35mlc8azs6o.R.iget(4177)==0&false))) {{
            __CLR4_4_135m35mlc8azs6o.R.inc(4178);return this;
        }
        }__CLR4_4_135m35mlc8azs6o.R.inc(4179);int[] newValues = getValues();
        __CLR4_4_135m35mlc8azs6o.R.inc(4180);newValues = getField(index).set(this, index, newValues, value);
        __CLR4_4_135m35mlc8azs6o.R.inc(4181);return new MonthDay(this, newValues);
    }finally{__CLR4_4_135m35mlc8azs6o.R.flushNeeded();}}

    /**
     * Returns a copy of this month-day with the value of the specified field increased.
     * <p>
     * If the addition is zero, then <code>this</code> is returned.
     * <p>
     * These three lines are equivalent:
     * <pre>
     * MonthDay added = md.withFieldAdded(DurationFieldType.days(), 6);
     * MonthDay added = md.plusDays(6);
     * MonthDay added = md.dayOfMonth().addToCopy(6);
     * </pre>
     * 
     * @param fieldType  the field type to add to, not null
     * @param amount  the amount to add
     * @return a copy of this instance with the field updated, never null
     * @throws IllegalArgumentException if the value is null or invalid
     * @throws ArithmeticException if the new date-time exceeds the capacity
     */
    public MonthDay withFieldAdded(DurationFieldType fieldType, int amount) {try{__CLR4_4_135m35mlc8azs6o.R.inc(4182);
        __CLR4_4_135m35mlc8azs6o.R.inc(4183);int index = indexOfSupported(fieldType);
        __CLR4_4_135m35mlc8azs6o.R.inc(4184);if ((((amount == 0)&&(__CLR4_4_135m35mlc8azs6o.R.iget(4185)!=0|true))||(__CLR4_4_135m35mlc8azs6o.R.iget(4186)==0&false))) {{
            __CLR4_4_135m35mlc8azs6o.R.inc(4187);return this;
        }
        }__CLR4_4_135m35mlc8azs6o.R.inc(4188);int[] newValues = getValues();
        __CLR4_4_135m35mlc8azs6o.R.inc(4189);newValues = getField(index).add(this, index, newValues, amount);
        __CLR4_4_135m35mlc8azs6o.R.inc(4190);return new MonthDay(this, newValues);
    }finally{__CLR4_4_135m35mlc8azs6o.R.flushNeeded();}}

    /**
     * Returns a copy of this month-day with the specified period added.
     * <p>
     * If the addition is zero, then <code>this</code> is returned.
     * Fields in the period that aren't present in the partial are ignored.
     * <p>
     * This method is typically used to add multiple copies of complex
     * period instances. Adding one field is best achieved using methods
     * like {@link #withFieldAdded(DurationFieldType, int)}
     * or {@link #plusMonths(int)}.
     * 
     * @param period  the period to add to this one, null means zero
     * @param scalar  the amount of times to add, such as -1 to subtract once
     * @return a copy of this instance with the period added, never null
     * @throws ArithmeticException if the new date-time exceeds the capacity
     */
    public MonthDay withPeriodAdded(ReadablePeriod period, int scalar) {try{__CLR4_4_135m35mlc8azs6o.R.inc(4191);
        __CLR4_4_135m35mlc8azs6o.R.inc(4192);if ((((period == null || scalar == 0)&&(__CLR4_4_135m35mlc8azs6o.R.iget(4193)!=0|true))||(__CLR4_4_135m35mlc8azs6o.R.iget(4194)==0&false))) {{
            __CLR4_4_135m35mlc8azs6o.R.inc(4195);return this;
        }
        }__CLR4_4_135m35mlc8azs6o.R.inc(4196);int[] newValues = getValues();
        __CLR4_4_135m35mlc8azs6o.R.inc(4197);for (int i = 0; (((i < period.size())&&(__CLR4_4_135m35mlc8azs6o.R.iget(4198)!=0|true))||(__CLR4_4_135m35mlc8azs6o.R.iget(4199)==0&false)); i++) {{
            __CLR4_4_135m35mlc8azs6o.R.inc(4200);DurationFieldType fieldType = period.getFieldType(i);
            __CLR4_4_135m35mlc8azs6o.R.inc(4201);int index = indexOf(fieldType);
            __CLR4_4_135m35mlc8azs6o.R.inc(4202);if ((((index >= 0)&&(__CLR4_4_135m35mlc8azs6o.R.iget(4203)!=0|true))||(__CLR4_4_135m35mlc8azs6o.R.iget(4204)==0&false))) {{
                __CLR4_4_135m35mlc8azs6o.R.inc(4205);newValues = getField(index).add(this, index, newValues,
                        FieldUtils.safeMultiply(period.getValue(i), scalar));
            }
        }}
        }__CLR4_4_135m35mlc8azs6o.R.inc(4206);return new MonthDay(this, newValues);
    }finally{__CLR4_4_135m35mlc8azs6o.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Returns a copy of this month-day with the specified period added.
     * <p>
     * If the amount is zero or null, then <code>this</code> is returned.
     * <p>
     * This method is typically used to add complex period instances.
     * Adding one field is best achieved using methods
     * like {@link #plusMonths(int)}.
     * 
     * @param period  the duration to add to this one, null means zero
     * @return a copy of this instance with the period added, never null
     * @throws ArithmeticException if the new month-day exceeds the capacity
     */
    public MonthDay plus(ReadablePeriod period) {try{__CLR4_4_135m35mlc8azs6o.R.inc(4207);
        __CLR4_4_135m35mlc8azs6o.R.inc(4208);return withPeriodAdded(period, 1);
    }finally{__CLR4_4_135m35mlc8azs6o.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Returns a copy of this month-day plus the specified number of months.
     * <p>
     * This month-day instance is immutable and unaffected by this method call.
     * The month will wrap at the end of the year from December to January.
     * The day will be adjusted to the last valid value if necessary.
     * <p>
     * The following three lines are identical in effect:
     * <pre>
     * MonthDay added = md.plusMonths(6);
     * MonthDay added = md.plus(Period.months(6));
     * MonthDay added = md.withFieldAdded(DurationFieldType.months(), 6);
     * </pre>
     *
     * @param months  the amount of months to add, may be negative
     * @return the new month-day plus the increased months, never null
     */
    public MonthDay plusMonths(int months) {try{__CLR4_4_135m35mlc8azs6o.R.inc(4209);
        __CLR4_4_135m35mlc8azs6o.R.inc(4210);return withFieldAdded(DurationFieldType.months(), months);
    }finally{__CLR4_4_135m35mlc8azs6o.R.flushNeeded();}}

    /**
     * Returns a copy of this month-day plus the specified number of days.
     * <p>
     * This month-day instance is immutable and unaffected by this method call.
     * The month will wrap at the end of the year from December to January.
     * <p>
     * The following three lines are identical in effect:
     * <pre>
     * MonthDay added = md.plusDays(6);
     * MonthDay added = md.plus(Period.days(6));
     * MonthDay added = md.withFieldAdded(DurationFieldType.days(), 6);
     * </pre>
     *
     * @param days  the amount of days to add, may be negative
     * @return the new month-day plus the increased days, never null
     */
    public MonthDay plusDays(int days) {try{__CLR4_4_135m35mlc8azs6o.R.inc(4211);
        __CLR4_4_135m35mlc8azs6o.R.inc(4212);return withFieldAdded(DurationFieldType.days(), days);
    }finally{__CLR4_4_135m35mlc8azs6o.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Returns a copy of this month-day with the specified period taken away.
     * <p>
     * If the amount is zero or null, then <code>this</code> is returned.
     * <p>
     * This method is typically used to subtract complex period instances.
     * Subtracting one field is best achieved using methods
     * like {@link #minusMonths(int)}.
     * 
     * @param period  the period to reduce this instant by
     * @return a copy of this instance with the period taken away, never null
     * @throws ArithmeticException if the new month-day exceeds the capacity
     */
    public MonthDay minus(ReadablePeriod period) {try{__CLR4_4_135m35mlc8azs6o.R.inc(4213);
        __CLR4_4_135m35mlc8azs6o.R.inc(4214);return withPeriodAdded(period, -1);
    }finally{__CLR4_4_135m35mlc8azs6o.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Returns a copy of this month-day minus the specified number of months.
     * <p>
     * This MonthDay instance is immutable and unaffected by this method call.
     * The month will wrap at the end of the year from January to December.
     * The day will be adjusted to the last valid value if necessary.
     * <p>
     * The following three lines are identical in effect:
     * <pre>
     * MonthDay subtracted = md.minusMonths(6);
     * MonthDay subtracted = md.minus(Period.months(6));
     * MonthDay subtracted = md.withFieldAdded(DurationFieldType.months(), -6);
     * </pre>
     *
     * @param months  the amount of months to subtract, may be negative
     * @return the new month-day minus the increased months, never null
     */
    public MonthDay minusMonths(int months) {try{__CLR4_4_135m35mlc8azs6o.R.inc(4215);
        __CLR4_4_135m35mlc8azs6o.R.inc(4216);return withFieldAdded(DurationFieldType.months(), FieldUtils.safeNegate(months));
    }finally{__CLR4_4_135m35mlc8azs6o.R.flushNeeded();}}

    /**
     * Returns a copy of this month-day minus the specified number of months.
     * <p>
     * This month-day instance is immutable and unaffected by this method call.
     * The month will wrap at the end of the year from January to December.
     * <p>
     * The following three lines are identical in effect:
     * <pre>
     * MonthDay subtracted = md.minusDays(6);
     * MonthDay subtracted = md.minus(Period.days(6));
     * MonthDay subtracted = md.withFieldAdded(DurationFieldType.days(), -6);
     * </pre>
     *
     * @param days  the amount of days to subtract, may be negative
     * @return the new month-day minus the increased days, never null
     */
    public MonthDay minusDays(int days) {try{__CLR4_4_135m35mlc8azs6o.R.inc(4217);
        __CLR4_4_135m35mlc8azs6o.R.inc(4218);return withFieldAdded(DurationFieldType.days(), FieldUtils.safeNegate(days));
    }finally{__CLR4_4_135m35mlc8azs6o.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Converts this object to a LocalDate with the same month-day and chronology.
     *
     * @param year  the year to use, valid for chronology
     * @return a LocalDate with the same month-day and chronology, never null
     */
    public LocalDate toLocalDate(int year) {try{__CLR4_4_135m35mlc8azs6o.R.inc(4219);
        __CLR4_4_135m35mlc8azs6o.R.inc(4220);return new LocalDate(year, getMonthOfYear(), getDayOfMonth(), getChronology());
    }finally{__CLR4_4_135m35mlc8azs6o.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Get the month of year field value.
     *
     * @return the month of year
     */
    public int getMonthOfYear() {try{__CLR4_4_135m35mlc8azs6o.R.inc(4221);
        __CLR4_4_135m35mlc8azs6o.R.inc(4222);return getValue(MONTH_OF_YEAR);
    }finally{__CLR4_4_135m35mlc8azs6o.R.flushNeeded();}}

    /**
     * Get the day of month field value.
     *
     * @return the day of month
     */
    public int getDayOfMonth() {try{__CLR4_4_135m35mlc8azs6o.R.inc(4223);
        __CLR4_4_135m35mlc8azs6o.R.inc(4224);return getValue(DAY_OF_MONTH);
    }finally{__CLR4_4_135m35mlc8azs6o.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Returns a copy of this month-day with the month of year field updated.
     * <p>
     * MonthDay is immutable, so there are no set methods.
     * Instead, this method returns a new instance with the value of
     * month of year changed.
     *
     * @param monthOfYear  the month of year to set
     * @return a copy of this object with the field set, never null
     * @throws IllegalArgumentException if the value is invalid
     */
    public MonthDay withMonthOfYear(int monthOfYear) {try{__CLR4_4_135m35mlc8azs6o.R.inc(4225);
        __CLR4_4_135m35mlc8azs6o.R.inc(4226);int[] newValues = getValues();
        __CLR4_4_135m35mlc8azs6o.R.inc(4227);newValues = getChronology().monthOfYear().set(this, MONTH_OF_YEAR, newValues, monthOfYear);
        __CLR4_4_135m35mlc8azs6o.R.inc(4228);return new MonthDay(this, newValues);
    }finally{__CLR4_4_135m35mlc8azs6o.R.flushNeeded();}}

    /**
     * Returns a copy of this month-day with the day of month field updated.
     * <p>
     * MonthDay is immutable, so there are no set methods.
     * Instead, this method returns a new instance with the value of
     * day of month changed.
     *
     * @param dayOfMonth  the day of month to set
     * @return a copy of this object with the field set, never null
     * @throws IllegalArgumentException if the value is invalid
     */
    public MonthDay withDayOfMonth(int dayOfMonth) {try{__CLR4_4_135m35mlc8azs6o.R.inc(4229);
        __CLR4_4_135m35mlc8azs6o.R.inc(4230);int[] newValues = getValues();
        __CLR4_4_135m35mlc8azs6o.R.inc(4231);newValues = getChronology().dayOfMonth().set(this, DAY_OF_MONTH, newValues, dayOfMonth);
        __CLR4_4_135m35mlc8azs6o.R.inc(4232);return new MonthDay(this, newValues);
    }finally{__CLR4_4_135m35mlc8azs6o.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Gets the property object for the specified type, which contains
     * many useful methods.
     *
     * @param type  the field type to get the property for
     * @return the property object
     * @throws IllegalArgumentException if the field is null or unsupported
     */
    public Property property(DateTimeFieldType type) {try{__CLR4_4_135m35mlc8azs6o.R.inc(4233);
        __CLR4_4_135m35mlc8azs6o.R.inc(4234);return new Property(this, indexOfSupported(type));
    }finally{__CLR4_4_135m35mlc8azs6o.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Get the month of year field property which provides access to advanced functionality.
     * 
     * @return the month of year property
     */
    public Property monthOfYear() {try{__CLR4_4_135m35mlc8azs6o.R.inc(4235);
        __CLR4_4_135m35mlc8azs6o.R.inc(4236);return new Property(this, MONTH_OF_YEAR);
    }finally{__CLR4_4_135m35mlc8azs6o.R.flushNeeded();}}

    /**
     * Get the day of month field property which provides access to advanced functionality.
     * 
     * @return the day of month property
     */
    public Property dayOfMonth() {try{__CLR4_4_135m35mlc8azs6o.R.inc(4237);
        __CLR4_4_135m35mlc8azs6o.R.inc(4238);return new Property(this, DAY_OF_MONTH);
    }finally{__CLR4_4_135m35mlc8azs6o.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Output the month-day in ISO8601 format (--MM-dd).
     *
     * @return ISO8601 time formatted string.
     */
    @ToString
    public String toString() {try{__CLR4_4_135m35mlc8azs6o.R.inc(4239);
        __CLR4_4_135m35mlc8azs6o.R.inc(4240);List<DateTimeFieldType> fields = new ArrayList<DateTimeFieldType>();
        __CLR4_4_135m35mlc8azs6o.R.inc(4241);fields.add(DateTimeFieldType.monthOfYear());
        __CLR4_4_135m35mlc8azs6o.R.inc(4242);fields.add(DateTimeFieldType.dayOfMonth());
        __CLR4_4_135m35mlc8azs6o.R.inc(4243);return ISODateTimeFormat.forFields(fields, true, true).print(this);
    }finally{__CLR4_4_135m35mlc8azs6o.R.flushNeeded();}}

    /**
     * Output the month-day using the specified format pattern.
     *
     * @param pattern  the pattern specification, null means use <code>toString</code>
     * @see org.joda.time.format.DateTimeFormat
     */
    public String toString(String pattern) {try{__CLR4_4_135m35mlc8azs6o.R.inc(4244);
        __CLR4_4_135m35mlc8azs6o.R.inc(4245);if ((((pattern == null)&&(__CLR4_4_135m35mlc8azs6o.R.iget(4246)!=0|true))||(__CLR4_4_135m35mlc8azs6o.R.iget(4247)==0&false))) {{
            __CLR4_4_135m35mlc8azs6o.R.inc(4248);return toString();
        }
        }__CLR4_4_135m35mlc8azs6o.R.inc(4249);return DateTimeFormat.forPattern(pattern).print(this);
    }finally{__CLR4_4_135m35mlc8azs6o.R.flushNeeded();}}

    /**
     * Output the month-day using the specified format pattern.
     *
     * @param pattern  the pattern specification, null means use <code>toString</code>
     * @param locale  Locale to use, null means default
     * @see org.joda.time.format.DateTimeFormat
     */
    public String toString(String pattern, Locale locale) throws IllegalArgumentException {try{__CLR4_4_135m35mlc8azs6o.R.inc(4250);
        __CLR4_4_135m35mlc8azs6o.R.inc(4251);if ((((pattern == null)&&(__CLR4_4_135m35mlc8azs6o.R.iget(4252)!=0|true))||(__CLR4_4_135m35mlc8azs6o.R.iget(4253)==0&false))) {{
            __CLR4_4_135m35mlc8azs6o.R.inc(4254);return toString();
        }
        }__CLR4_4_135m35mlc8azs6o.R.inc(4255);return DateTimeFormat.forPattern(pattern).withLocale(locale).print(this);
    }finally{__CLR4_4_135m35mlc8azs6o.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * The property class for <code>MonthDay</code>.
     * <p>
     * This class binds a <code>YearMonth</code> to a <code>DateTimeField</code>.
     * 
     * @author Chris Pheby
     * @since 2.0
     */
    public static class Property extends AbstractPartialFieldProperty implements Serializable {

        /** Serialization version */
        private static final long serialVersionUID = 5727734012190224363L;

        /** The partial */
        private final MonthDay iBase;
        /** The field index */
        private final int iFieldIndex;

        /**
         * Constructs a property.
         * 
         * @param partial  the partial instance
         * @param fieldIndex  the index in the partial
         */
        Property(MonthDay partial, int fieldIndex) {
            super();__CLR4_4_135m35mlc8azs6o.R.inc(4257);try{__CLR4_4_135m35mlc8azs6o.R.inc(4256);
            __CLR4_4_135m35mlc8azs6o.R.inc(4258);iBase = partial;
            __CLR4_4_135m35mlc8azs6o.R.inc(4259);iFieldIndex = fieldIndex;
        }finally{__CLR4_4_135m35mlc8azs6o.R.flushNeeded();}}

        /**
         * Gets the field that this property uses.
         * 
         * @return the field
         */
        public DateTimeField getField() {try{__CLR4_4_135m35mlc8azs6o.R.inc(4260);
            __CLR4_4_135m35mlc8azs6o.R.inc(4261);return iBase.getField(iFieldIndex);
        }finally{__CLR4_4_135m35mlc8azs6o.R.flushNeeded();}}

        /**
         * Gets the partial that this property belongs to.
         * 
         * @return the partial
         */
        protected ReadablePartial getReadablePartial() {try{__CLR4_4_135m35mlc8azs6o.R.inc(4262);
            __CLR4_4_135m35mlc8azs6o.R.inc(4263);return iBase;
        }finally{__CLR4_4_135m35mlc8azs6o.R.flushNeeded();}}

        /**
         * Gets the partial that this property belongs to.
         * 
         * @return the partial
         */
        public MonthDay getMonthDay() {try{__CLR4_4_135m35mlc8azs6o.R.inc(4264);
            __CLR4_4_135m35mlc8azs6o.R.inc(4265);return iBase;
        }finally{__CLR4_4_135m35mlc8azs6o.R.flushNeeded();}}

        /**
         * Gets the value of this field.
         * 
         * @return the field value
         */
        public int get() {try{__CLR4_4_135m35mlc8azs6o.R.inc(4266);
            __CLR4_4_135m35mlc8azs6o.R.inc(4267);return iBase.getValue(iFieldIndex);
        }finally{__CLR4_4_135m35mlc8azs6o.R.flushNeeded();}}

        //-----------------------------------------------------------------------
        /**
         * Adds to the value of this field in a copy of this MonthDay.
         * <p>
         * The value will be added to this field. If the value is too large to be
         * added solely to this field then it will affect larger fields.
         * Smaller fields are unaffected.
         * <p>
         * The MonthDay attached to this property is unchanged by this call.
         * Instead, a new instance is returned.
         * 
         * @param valueToAdd  the value to add to the field in the copy
         * @return a copy of the MonthDay with the field value changed
         * @throws IllegalArgumentException if the value isn't valid
         */
        public MonthDay addToCopy(int valueToAdd) {try{__CLR4_4_135m35mlc8azs6o.R.inc(4268);
            __CLR4_4_135m35mlc8azs6o.R.inc(4269);int[] newValues = iBase.getValues();
            __CLR4_4_135m35mlc8azs6o.R.inc(4270);newValues = getField().add(iBase, iFieldIndex, newValues, valueToAdd);
            __CLR4_4_135m35mlc8azs6o.R.inc(4271);return new MonthDay(iBase, newValues);
        }finally{__CLR4_4_135m35mlc8azs6o.R.flushNeeded();}}

        /**
         * Adds to the value of this field in a copy of this MonthDay wrapping
         * within this field if the maximum value is reached.
         * <p>
         * The value will be added to this field. If the value is too large to be
         * added solely to this field then it wraps within this field.
         * Other fields are unaffected.
         * <p>
         * For example,
         * <code>--12-30</code> addWrapField one month returns <code>--01-30</code>.
         * <p>
         * The MonthDay attached to this property is unchanged by this call.
         * Instead, a new instance is returned.
         * 
         * @param valueToAdd  the value to add to the field in the copy
         * @return a copy of the MonthDay with the field value changed
         * @throws IllegalArgumentException if the value isn't valid
         */
        public MonthDay addWrapFieldToCopy(int valueToAdd) {try{__CLR4_4_135m35mlc8azs6o.R.inc(4272);
            __CLR4_4_135m35mlc8azs6o.R.inc(4273);int[] newValues = iBase.getValues();
            __CLR4_4_135m35mlc8azs6o.R.inc(4274);newValues = getField().addWrapField(iBase, iFieldIndex, newValues, valueToAdd);
            __CLR4_4_135m35mlc8azs6o.R.inc(4275);return new MonthDay(iBase, newValues);
        }finally{__CLR4_4_135m35mlc8azs6o.R.flushNeeded();}}

        //-----------------------------------------------------------------------
        /**
         * Sets this field in a copy of the MonthDay.
         * <p>
         * The MonthDay attached to this property is unchanged by this call.
         * Instead, a new instance is returned.
         * 
         * @param value  the value to set the field in the copy to
         * @return a copy of the MonthDay with the field value changed
         * @throws IllegalArgumentException if the value isn't valid
         */
        public MonthDay setCopy(int value) {try{__CLR4_4_135m35mlc8azs6o.R.inc(4276);
            __CLR4_4_135m35mlc8azs6o.R.inc(4277);int[] newValues = iBase.getValues();
            __CLR4_4_135m35mlc8azs6o.R.inc(4278);newValues = getField().set(iBase, iFieldIndex, newValues, value);
            __CLR4_4_135m35mlc8azs6o.R.inc(4279);return new MonthDay(iBase, newValues);
        }finally{__CLR4_4_135m35mlc8azs6o.R.flushNeeded();}}

        /**
         * Sets this field in a copy of the MonthDay to a parsed text value.
         * <p>
         * The MonthDay attached to this property is unchanged by this call.
         * Instead, a new instance is returned.
         * 
         * @param text  the text value to set
         * @param locale  optional locale to use for selecting a text symbol
         * @return a copy of the MonthDay with the field value changed
         * @throws IllegalArgumentException if the text value isn't valid
         */
        public MonthDay setCopy(String text, Locale locale) {try{__CLR4_4_135m35mlc8azs6o.R.inc(4280);
            __CLR4_4_135m35mlc8azs6o.R.inc(4281);int[] newValues = iBase.getValues();
            __CLR4_4_135m35mlc8azs6o.R.inc(4282);newValues = getField().set(iBase, iFieldIndex, newValues, text, locale);
            __CLR4_4_135m35mlc8azs6o.R.inc(4283);return new MonthDay(iBase, newValues);
        }finally{__CLR4_4_135m35mlc8azs6o.R.flushNeeded();}}

        /**
         * Sets this field in a copy of the MonthDay to a parsed text value.
         * <p>
         * The MonthDay attached to this property is unchanged by this call.
         * Instead, a new instance is returned.
         * 
         * @param text  the text value to set
         * @return a copy of the MonthDay with the field value changed
         * @throws IllegalArgumentException if the text value isn't valid
         */
        public MonthDay setCopy(String text) {try{__CLR4_4_135m35mlc8azs6o.R.inc(4284);
            __CLR4_4_135m35mlc8azs6o.R.inc(4285);return setCopy(text, null);
        }finally{__CLR4_4_135m35mlc8azs6o.R.flushNeeded();}}
    }

}
