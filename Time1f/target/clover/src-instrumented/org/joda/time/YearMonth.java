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
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

import org.joda.convert.FromString;
import org.joda.convert.ToString;
import org.joda.time.base.BasePartial;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.field.AbstractPartialFieldProperty;
import org.joda.time.field.FieldUtils;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.ISODateTimeFormat;

/**
 * YearMonth is an immutable partial supporting the year and monthOfYear fields.
 * <p>
 * NOTE: This class only supports the two fields listed above.
 * It is impossible to query any other fields, such as dayOfWeek or centuryOfEra.
 * <p>
 * Calculations on YearMonth are performed using a {@link Chronology}.
 * This chronology is set to be in the UTC time zone for all calculations.
 * <p>
 * One use case for this class is to store a credit card expiry date, as that only
 * references the year and month.
 * This class can be used as the gYearMonth type in XML Schema.
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
 * YearMonth is thread-safe and immutable, provided that the Chronology is as well.
 * All standard Chronology classes supplied are thread-safe and immutable.
 *
 * @author Stephen Colebourne
 * @since 2.0
 */
@java.lang.SuppressWarnings({"fallthrough"}) public final class YearMonth
        extends BasePartial
        implements ReadablePartial, Serializable {public static class __CLR4_4_152n52nlc8azsjq{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672271027956L,8589935092L,6775,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** Serialization version */
    private static final long serialVersionUID = 797544782896179L;
    /** The singleton set of field types */
    private static final DateTimeFieldType[] FIELD_TYPES = new DateTimeFieldType[] {
        DateTimeFieldType.year(),
        DateTimeFieldType.monthOfYear(),
    };

    /** The index of the year field in the field array */
    public static final int YEAR = 0;
    /** The index of the monthOfYear field in the field array */
    public static final int MONTH_OF_YEAR = 1;

    //-----------------------------------------------------------------------
    /**
     * Obtains a {@code YearMonth} set to the current system millisecond time
     * using <code>ISOChronology</code> in the default time zone.
     * The resulting object does not use the zone.
     * 
     * @return the current year-month, not null
     * @since 2.0
     */
    public static YearMonth now() {try{__CLR4_4_152n52nlc8azsjq.R.inc(6575);
        __CLR4_4_152n52nlc8azsjq.R.inc(6576);return new YearMonth();
    }finally{__CLR4_4_152n52nlc8azsjq.R.flushNeeded();}}

    /**
     * Obtains a {@code YearMonth} set to the current system millisecond time
     * using <code>ISOChronology</code> in the specified time zone.
     * The resulting object does not use the zone.
     *
     * @param zone  the time zone, not null
     * @return the current year-month, not null
     * @since 2.0
     */
    public static YearMonth now(DateTimeZone zone) {try{__CLR4_4_152n52nlc8azsjq.R.inc(6577);
        __CLR4_4_152n52nlc8azsjq.R.inc(6578);if ((((zone == null)&&(__CLR4_4_152n52nlc8azsjq.R.iget(6579)!=0|true))||(__CLR4_4_152n52nlc8azsjq.R.iget(6580)==0&false))) {{
            __CLR4_4_152n52nlc8azsjq.R.inc(6581);throw new NullPointerException("Zone must not be null");
        }
        }__CLR4_4_152n52nlc8azsjq.R.inc(6582);return new YearMonth(zone);
    }finally{__CLR4_4_152n52nlc8azsjq.R.flushNeeded();}}

    /**
     * Obtains a {@code YearMonth} set to the current system millisecond time
     * using the specified chronology.
     * The resulting object does not use the zone.
     *
     * @param chronology  the chronology, not null
     * @return the current year-month, not null
     * @since 2.0
     */
    public static YearMonth now(Chronology chronology) {try{__CLR4_4_152n52nlc8azsjq.R.inc(6583);
        __CLR4_4_152n52nlc8azsjq.R.inc(6584);if ((((chronology == null)&&(__CLR4_4_152n52nlc8azsjq.R.iget(6585)!=0|true))||(__CLR4_4_152n52nlc8azsjq.R.iget(6586)==0&false))) {{
            __CLR4_4_152n52nlc8azsjq.R.inc(6587);throw new NullPointerException("Chronology must not be null");
        }
        }__CLR4_4_152n52nlc8azsjq.R.inc(6588);return new YearMonth(chronology);
    }finally{__CLR4_4_152n52nlc8azsjq.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Parses a {@code YearMonth} from the specified string.
     * <p>
     * This uses {@link ISODateTimeFormat#localDateParser()}.
     * 
     * @param str  the string to parse, not null
     * @since 2.0
     */
    @FromString
    public static YearMonth parse(String str) {try{__CLR4_4_152n52nlc8azsjq.R.inc(6589);
        __CLR4_4_152n52nlc8azsjq.R.inc(6590);return parse(str, ISODateTimeFormat.localDateParser());
    }finally{__CLR4_4_152n52nlc8azsjq.R.flushNeeded();}}

    /**
     * Parses a {@code YearMonth} from the specified string using a formatter.
     * 
     * @param str  the string to parse, not null
     * @param formatter  the formatter to use, not null
     * @since 2.0
     */
    public static YearMonth parse(String str, DateTimeFormatter formatter) {try{__CLR4_4_152n52nlc8azsjq.R.inc(6591);
        __CLR4_4_152n52nlc8azsjq.R.inc(6592);LocalDate date = formatter.parseLocalDate(str);
        __CLR4_4_152n52nlc8azsjq.R.inc(6593);return new YearMonth(date.getYear(), date.getMonthOfYear());
    }finally{__CLR4_4_152n52nlc8azsjq.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Constructs a YearMonth from a <code>java.util.Calendar</code>
     * using exactly the same field values avoiding any time zone effects.
     * <p>
     * Each field is queried from the Calendar and assigned to the YearMonth.
     * <p>
     * This factory method ignores the type of the calendar and always
     * creates a YearMonth with ISO chronology. It is expected that you
     * will only pass in instances of <code>GregorianCalendar</code> however
     * this is not validated.
     *
     * @param calendar  the Calendar to extract fields from
     * @return the created YearMonth, never null
     * @throws IllegalArgumentException if the calendar is null
     * @throws IllegalArgumentException if the year or month is invalid for the ISO chronology
     */
    public static YearMonth fromCalendarFields(Calendar calendar) {try{__CLR4_4_152n52nlc8azsjq.R.inc(6594);
        __CLR4_4_152n52nlc8azsjq.R.inc(6595);if ((((calendar == null)&&(__CLR4_4_152n52nlc8azsjq.R.iget(6596)!=0|true))||(__CLR4_4_152n52nlc8azsjq.R.iget(6597)==0&false))) {{
            __CLR4_4_152n52nlc8azsjq.R.inc(6598);throw new IllegalArgumentException("The calendar must not be null");
        }
        }__CLR4_4_152n52nlc8azsjq.R.inc(6599);return new YearMonth(calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH) + 1);
    }finally{__CLR4_4_152n52nlc8azsjq.R.flushNeeded();}}

    /**
     * Constructs a YearMonth from a <code>java.util.Date</code>
     * using exactly the same field values avoiding any time zone effects.
     * <p>
     * Each field is queried from the Date and assigned to the YearMonth.
     * <p>
     * This factory method always creates a YearMonth with ISO chronology.
     *
     * @param date  the Date to extract fields from
     * @return the created YearMonth, never null
     * @throws IllegalArgumentException if the calendar is null
     * @throws IllegalArgumentException if the year or month is invalid for the ISO chronology
     */
    @SuppressWarnings("deprecation")
    public static YearMonth fromDateFields(Date date) {try{__CLR4_4_152n52nlc8azsjq.R.inc(6600);
        __CLR4_4_152n52nlc8azsjq.R.inc(6601);if ((((date == null)&&(__CLR4_4_152n52nlc8azsjq.R.iget(6602)!=0|true))||(__CLR4_4_152n52nlc8azsjq.R.iget(6603)==0&false))) {{
            __CLR4_4_152n52nlc8azsjq.R.inc(6604);throw new IllegalArgumentException("The date must not be null");
        }
        }__CLR4_4_152n52nlc8azsjq.R.inc(6605);return new YearMonth(date.getYear() + 1900, date.getMonth() + 1);
    }finally{__CLR4_4_152n52nlc8azsjq.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Constructs a YearMonth with the current year-month, using ISOChronology in
     * the default zone to extract the fields.
     * <p>
     * The constructor uses the default time zone, resulting in the local time
     * being initialised. Once the constructor is complete, all further calculations
     * are performed without reference to a time-zone (by switching to UTC).
     * 
     * @see #now()
     */
    public YearMonth() {
        super();__CLR4_4_152n52nlc8azsjq.R.inc(6607);try{__CLR4_4_152n52nlc8azsjq.R.inc(6606);
    }finally{__CLR4_4_152n52nlc8azsjq.R.flushNeeded();}}

    /**
     * Constructs a YearMonth with the current year-month, using ISOChronology in
     * the specified zone to extract the fields.
     * <p>
     * The constructor uses the specified time zone to obtain the current year-month.
     * Once the constructor is complete, all further calculations
     * are performed without reference to a time-zone (by switching to UTC).
     * 
     * @param zone  the zone to use, null means default zone
     * @see #now(DateTimeZone)
     */
    public YearMonth(DateTimeZone zone) {
        super(ISOChronology.getInstance(zone));__CLR4_4_152n52nlc8azsjq.R.inc(6609);try{__CLR4_4_152n52nlc8azsjq.R.inc(6608);
    }finally{__CLR4_4_152n52nlc8azsjq.R.flushNeeded();}}

    /**
     * Constructs a YearMonth with the current year-month, using the specified chronology
     * and zone to extract the fields.
     * <p>
     * The constructor uses the time zone of the chronology specified.
     * Once the constructor is complete, all further calculations are performed
     * without reference to a time-zone (by switching to UTC).
     *
     * @param chronology  the chronology, null means ISOChronology in the default zone
     * @see #now(Chronology)
     */
    public YearMonth(Chronology chronology) {
        super(chronology);__CLR4_4_152n52nlc8azsjq.R.inc(6611);try{__CLR4_4_152n52nlc8azsjq.R.inc(6610);
    }finally{__CLR4_4_152n52nlc8azsjq.R.flushNeeded();}}

    /**
     * Constructs a YearMonth extracting the partial fields from the specified
     * milliseconds using the ISOChronology in the default zone.
     * <p>
     * The constructor uses the default time zone, resulting in the local time
     * being initialised. Once the constructor is complete, all further calculations
     * are performed without reference to a time-zone (by switching to UTC).
     *
     * @param instant  the milliseconds from 1970-01-01T00:00:00Z
     */
    public YearMonth(long instant) {
        super(instant);__CLR4_4_152n52nlc8azsjq.R.inc(6613);try{__CLR4_4_152n52nlc8azsjq.R.inc(6612);
    }finally{__CLR4_4_152n52nlc8azsjq.R.flushNeeded();}}

    /**
     * Constructs a YearMonth extracting the partial fields from the specified
     * milliseconds using the chronology provided.
     * <p>
     * The constructor uses the time zone of the chronology specified.
     * Once the constructor is complete, all further calculations are performed
     * without reference to a time-zone (by switching to UTC).
     *
     * @param instant  the milliseconds from 1970-01-01T00:00:00Z
     * @param chronology  the chronology, null means ISOChronology in the default zone
     */
    public YearMonth(long instant, Chronology chronology) {
        super(instant, chronology);__CLR4_4_152n52nlc8azsjq.R.inc(6615);try{__CLR4_4_152n52nlc8azsjq.R.inc(6614);
    }finally{__CLR4_4_152n52nlc8azsjq.R.flushNeeded();}}

    /**
     * Constructs a YearMonth from an Object that represents some form of time.
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
    public YearMonth(Object instant) {
        super(instant, null, ISODateTimeFormat.localDateParser());__CLR4_4_152n52nlc8azsjq.R.inc(6617);try{__CLR4_4_152n52nlc8azsjq.R.inc(6616);
    }finally{__CLR4_4_152n52nlc8azsjq.R.flushNeeded();}}

    /**
     * Constructs a YearMonth from an Object that represents some form of time,
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
    public YearMonth(Object instant, Chronology chronology) {
        super(instant, DateTimeUtils.getChronology(chronology), ISODateTimeFormat.localDateParser());__CLR4_4_152n52nlc8azsjq.R.inc(6619);try{__CLR4_4_152n52nlc8azsjq.R.inc(6618);
    }finally{__CLR4_4_152n52nlc8azsjq.R.flushNeeded();}}

    /**
     * Constructs a YearMonth with specified year and month
     * using <code>ISOChronology</code>.
     * <p>
     * The constructor uses the no time zone initialising the fields as provided.
     * Once the constructor is complete, all further calculations
     * are performed without reference to a time-zone (by switching to UTC).
     *
     * @param year  the year
     * @param monthOfYear  the month of the year
     */
    public YearMonth(int year, int monthOfYear) {
        this(year, monthOfYear, null);__CLR4_4_152n52nlc8azsjq.R.inc(6621);try{__CLR4_4_152n52nlc8azsjq.R.inc(6620);
    }finally{__CLR4_4_152n52nlc8azsjq.R.flushNeeded();}}

    /**
     * Constructs an instance set to the specified year and month
     * using the specified chronology, whose zone is ignored.
     * <p>
     * If the chronology is null, <code>ISOChronology</code> is used.
     * <p>
     * The constructor uses the time zone of the chronology specified.
     * Once the constructor is complete, all further calculations are performed
     * without reference to a time-zone (by switching to UTC).
     *
     * @param year  the year
     * @param monthOfYear  the month of the year
     * @param chronology  the chronology, null means ISOChronology in the default zone
     */
    public YearMonth(int year, int monthOfYear, Chronology chronology) {
        super(new int[] {year, monthOfYear}, chronology);__CLR4_4_152n52nlc8azsjq.R.inc(6623);try{__CLR4_4_152n52nlc8azsjq.R.inc(6622);
    }finally{__CLR4_4_152n52nlc8azsjq.R.flushNeeded();}}

    /**
     * Constructs a YearMonth with chronology from this instance and new values.
     *
     * @param partial  the partial to base this new instance on
     * @param values  the new set of values
     */
    YearMonth(YearMonth partial, int[] values) {
        super(partial, values);__CLR4_4_152n52nlc8azsjq.R.inc(6625);try{__CLR4_4_152n52nlc8azsjq.R.inc(6624);
    }finally{__CLR4_4_152n52nlc8azsjq.R.flushNeeded();}}

    /**
     * Constructs a YearMonth with values from this instance and a new chronology.
     *
     * @param partial  the partial to base this new instance on
     * @param chrono  the new chronology
     */
    YearMonth(YearMonth partial, Chronology chrono) {
        super(partial, chrono);__CLR4_4_152n52nlc8azsjq.R.inc(6627);try{__CLR4_4_152n52nlc8azsjq.R.inc(6626);
    }finally{__CLR4_4_152n52nlc8azsjq.R.flushNeeded();}}

    /**
     * Handle broken serialization from other tools.
     * @return the resolved object, not null
     */
    private Object readResolve() {try{__CLR4_4_152n52nlc8azsjq.R.inc(6628);
        __CLR4_4_152n52nlc8azsjq.R.inc(6629);if ((((DateTimeZone.UTC.equals(getChronology().getZone()) == false)&&(__CLR4_4_152n52nlc8azsjq.R.iget(6630)!=0|true))||(__CLR4_4_152n52nlc8azsjq.R.iget(6631)==0&false))) {{
            __CLR4_4_152n52nlc8azsjq.R.inc(6632);return new YearMonth(this, getChronology().withUTC());
        }
        }__CLR4_4_152n52nlc8azsjq.R.inc(6633);return this;
    }finally{__CLR4_4_152n52nlc8azsjq.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Gets the number of fields in this partial, which is two.
     * The supported fields are Year and MonthOfYear.
     * Note that only these fields may be queried.
     *
     * @return the field count, two
     */
    public int size() {try{__CLR4_4_152n52nlc8azsjq.R.inc(6634);
        __CLR4_4_152n52nlc8azsjq.R.inc(6635);return 2;
    }finally{__CLR4_4_152n52nlc8azsjq.R.flushNeeded();}}

    /**
     * Gets the field for a specific index in the chronology specified.
     * <p>
     * This method must not use any instance variables.
     * 
     * @param index  the index to retrieve
     * @param chrono  the chronology to use
     * @return the field, never null
     */
    protected DateTimeField getField(int index, Chronology chrono) {try{__CLR4_4_152n52nlc8azsjq.R.inc(6636);
        boolean __CLB4_4_1_bool0=false;__CLR4_4_152n52nlc8azsjq.R.inc(6637);switch (index) {
            case YEAR:if (!__CLB4_4_1_bool0) {__CLR4_4_152n52nlc8azsjq.R.inc(6638);__CLB4_4_1_bool0=true;}
                __CLR4_4_152n52nlc8azsjq.R.inc(6639);return chrono.year();
            case MONTH_OF_YEAR:if (!__CLB4_4_1_bool0) {__CLR4_4_152n52nlc8azsjq.R.inc(6640);__CLB4_4_1_bool0=true;}
                __CLR4_4_152n52nlc8azsjq.R.inc(6641);return chrono.monthOfYear();
            default:if (!__CLB4_4_1_bool0) {__CLR4_4_152n52nlc8azsjq.R.inc(6642);__CLB4_4_1_bool0=true;}
                __CLR4_4_152n52nlc8azsjq.R.inc(6643);throw new IndexOutOfBoundsException("Invalid index: " + index);
        }
    }finally{__CLR4_4_152n52nlc8azsjq.R.flushNeeded();}}

    /**
     * Gets the field type at the specified index.
     *
     * @param index  the index to retrieve
     * @return the field at the specified index, never null
     * @throws IndexOutOfBoundsException if the index is invalid
     */
    public DateTimeFieldType getFieldType(int index) {try{__CLR4_4_152n52nlc8azsjq.R.inc(6644);
        __CLR4_4_152n52nlc8azsjq.R.inc(6645);return FIELD_TYPES[index];
    }finally{__CLR4_4_152n52nlc8azsjq.R.flushNeeded();}}

    /**
     * Gets an array of the field type of each of the fields that this partial supports.
     * <p>
     * The fields are returned largest to smallest, Year, Month.
     *
     * @return the array of field types (cloned), largest to smallest, never null
     */
    public DateTimeFieldType[] getFieldTypes() {try{__CLR4_4_152n52nlc8azsjq.R.inc(6646);
        __CLR4_4_152n52nlc8azsjq.R.inc(6647);return (DateTimeFieldType[]) FIELD_TYPES.clone();
    }finally{__CLR4_4_152n52nlc8azsjq.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Returns a copy of this year-month with the specified chronology.
     * This instance is immutable and unaffected by this method call.
     * <p>
     * This method retains the values of the fields, thus the result will
     * typically refer to a different instant.
     * <p>
     * The time zone of the specified chronology is ignored, as YearMonth
     * operates without a time zone.
     *
     * @param newChronology  the new chronology, null means ISO
     * @return a copy of this year-month with a different chronology, never null
     * @throws IllegalArgumentException if the values are invalid for the new chronology
     */
    public YearMonth withChronologyRetainFields(Chronology newChronology) {try{__CLR4_4_152n52nlc8azsjq.R.inc(6648);
        __CLR4_4_152n52nlc8azsjq.R.inc(6649);newChronology = DateTimeUtils.getChronology(newChronology);
        __CLR4_4_152n52nlc8azsjq.R.inc(6650);newChronology = newChronology.withUTC();
        __CLR4_4_152n52nlc8azsjq.R.inc(6651);if ((((newChronology == getChronology())&&(__CLR4_4_152n52nlc8azsjq.R.iget(6652)!=0|true))||(__CLR4_4_152n52nlc8azsjq.R.iget(6653)==0&false))) {{
            __CLR4_4_152n52nlc8azsjq.R.inc(6654);return this;
        } }else {{
            __CLR4_4_152n52nlc8azsjq.R.inc(6655);YearMonth newYearMonth = new YearMonth(this, newChronology);
            __CLR4_4_152n52nlc8azsjq.R.inc(6656);newChronology.validate(newYearMonth, getValues());
            __CLR4_4_152n52nlc8azsjq.R.inc(6657);return newYearMonth;
        }
    }}finally{__CLR4_4_152n52nlc8azsjq.R.flushNeeded();}}

    /**
     * Returns a copy of this year-month with the specified field set to a new value.
     * <p>
     * For example, if the field type is <code>monthOfYear</code> then the month
     * would be changed in the returned instance.
     * <p>
     * These three lines are equivalent:
     * <pre>
     * YearMonth updated = ym.withField(DateTimeFieldType.monthOfYear(), 6);
     * YearMonth updated = ym.monthOfYear().setCopy(6);
     * YearMonth updated = ym.property(DateTimeFieldType.monthOfYear()).setCopy(6);
     * </pre>
     *
     * @param fieldType  the field type to set, not null
     * @param value  the value to set
     * @return a copy of this instance with the field set, never null
     * @throws IllegalArgumentException if the value is null or invalid
     */
    public YearMonth withField(DateTimeFieldType fieldType, int value) {try{__CLR4_4_152n52nlc8azsjq.R.inc(6658);
        __CLR4_4_152n52nlc8azsjq.R.inc(6659);int index = indexOfSupported(fieldType);
        __CLR4_4_152n52nlc8azsjq.R.inc(6660);if ((((value == getValue(index))&&(__CLR4_4_152n52nlc8azsjq.R.iget(6661)!=0|true))||(__CLR4_4_152n52nlc8azsjq.R.iget(6662)==0&false))) {{
            __CLR4_4_152n52nlc8azsjq.R.inc(6663);return this;
        }
        }__CLR4_4_152n52nlc8azsjq.R.inc(6664);int[] newValues = getValues();
        __CLR4_4_152n52nlc8azsjq.R.inc(6665);newValues = getField(index).set(this, index, newValues, value);
        __CLR4_4_152n52nlc8azsjq.R.inc(6666);return new YearMonth(this, newValues);
    }finally{__CLR4_4_152n52nlc8azsjq.R.flushNeeded();}}

    /**
     * Returns a copy of this year-month with the value of the specified field increased.
     * <p>
     * If the addition is zero, then <code>this</code> is returned.
     * <p>
     * These three lines are equivalent:
     * <pre>
     * YearMonth added = ym.withFieldAdded(DurationFieldType.months(), 6);
     * YearMonth added = ym.plusMonths(6);
     * YearMonth added = ym.monthOfYear().addToCopy(6);
     * </pre>
     * 
     * @param fieldType  the field type to add to, not null
     * @param amount  the amount to add
     * @return a copy of this instance with the field updated, never null
     * @throws IllegalArgumentException if the value is null or invalid
     * @throws ArithmeticException if the new date-time exceeds the capacity
     */
    public YearMonth withFieldAdded(DurationFieldType fieldType, int amount) {try{__CLR4_4_152n52nlc8azsjq.R.inc(6667);
        __CLR4_4_152n52nlc8azsjq.R.inc(6668);int index = indexOfSupported(fieldType);
        __CLR4_4_152n52nlc8azsjq.R.inc(6669);if ((((amount == 0)&&(__CLR4_4_152n52nlc8azsjq.R.iget(6670)!=0|true))||(__CLR4_4_152n52nlc8azsjq.R.iget(6671)==0&false))) {{
            __CLR4_4_152n52nlc8azsjq.R.inc(6672);return this;
        }
        }__CLR4_4_152n52nlc8azsjq.R.inc(6673);int[] newValues = getValues();
        __CLR4_4_152n52nlc8azsjq.R.inc(6674);newValues = getField(index).add(this, index, newValues, amount);
        __CLR4_4_152n52nlc8azsjq.R.inc(6675);return new YearMonth(this, newValues);
    }finally{__CLR4_4_152n52nlc8azsjq.R.flushNeeded();}}

    /**
     * Returns a copy of this year-month with the specified period added.
     * <p>
     * If the addition is zero, then <code>this</code> is returned.
     * Fields in the period that aren't present in the partial are ignored.
     * <p>
     * This method is typically used to add multiple copies of complex
     * period instances. Adding one field is best achieved using methods
     * like {@link #withFieldAdded(DurationFieldType, int)}
     * or {@link #plusYears(int)}.
     * 
     * @param period  the period to add to this one, null means zero
     * @param scalar  the amount of times to add, such as -1 to subtract once
     * @return a copy of this instance with the period added, never null
     * @throws ArithmeticException if the new date-time exceeds the capacity
     */
    public YearMonth withPeriodAdded(ReadablePeriod period, int scalar) {try{__CLR4_4_152n52nlc8azsjq.R.inc(6676);
        __CLR4_4_152n52nlc8azsjq.R.inc(6677);if ((((period == null || scalar == 0)&&(__CLR4_4_152n52nlc8azsjq.R.iget(6678)!=0|true))||(__CLR4_4_152n52nlc8azsjq.R.iget(6679)==0&false))) {{
            __CLR4_4_152n52nlc8azsjq.R.inc(6680);return this;
        }
        }__CLR4_4_152n52nlc8azsjq.R.inc(6681);int[] newValues = getValues();
        __CLR4_4_152n52nlc8azsjq.R.inc(6682);for (int i = 0; (((i < period.size())&&(__CLR4_4_152n52nlc8azsjq.R.iget(6683)!=0|true))||(__CLR4_4_152n52nlc8azsjq.R.iget(6684)==0&false)); i++) {{
            __CLR4_4_152n52nlc8azsjq.R.inc(6685);DurationFieldType fieldType = period.getFieldType(i);
            __CLR4_4_152n52nlc8azsjq.R.inc(6686);int index = indexOf(fieldType);
            __CLR4_4_152n52nlc8azsjq.R.inc(6687);if ((((index >= 0)&&(__CLR4_4_152n52nlc8azsjq.R.iget(6688)!=0|true))||(__CLR4_4_152n52nlc8azsjq.R.iget(6689)==0&false))) {{
                __CLR4_4_152n52nlc8azsjq.R.inc(6690);newValues = getField(index).add(this, index, newValues,
                        FieldUtils.safeMultiply(period.getValue(i), scalar));
            }
        }}
        }__CLR4_4_152n52nlc8azsjq.R.inc(6691);return new YearMonth(this, newValues);
    }finally{__CLR4_4_152n52nlc8azsjq.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Returns a copy of this year-month with the specified period added.
     * <p>
     * If the amount is zero or null, then <code>this</code> is returned.
     * <p>
     * This method is typically used to add complex period instances.
     * Adding one field is best achieved using methods
     * like {@link #plusYears(int)}.
     * 
     * @param period  the duration to add to this one, null means zero
     * @return a copy of this instance with the period added, never null
     * @throws ArithmeticException if the new year-month exceeds the capacity
     */
    public YearMonth plus(ReadablePeriod period) {try{__CLR4_4_152n52nlc8azsjq.R.inc(6692);
        __CLR4_4_152n52nlc8azsjq.R.inc(6693);return withPeriodAdded(period, 1);
    }finally{__CLR4_4_152n52nlc8azsjq.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Returns a copy of this year-month plus the specified number of years.
     * <p>
     * This year-month instance is immutable and unaffected by this method call.
     * <p>
     * The following three lines are identical in effect:
     * <pre>
     * YearMonth added = ym.plusYears(6);
     * YearMonth added = ym.plus(Period.years(6));
     * YearMonth added = ym.withFieldAdded(DurationFieldType.years(), 6);
     * </pre>
     *
     * @param years  the amount of years to add, may be negative
     * @return the new year-month plus the increased years, never null
     */
    public YearMonth plusYears(int years) {try{__CLR4_4_152n52nlc8azsjq.R.inc(6694);
        __CLR4_4_152n52nlc8azsjq.R.inc(6695);return withFieldAdded(DurationFieldType.years(), years);
    }finally{__CLR4_4_152n52nlc8azsjq.R.flushNeeded();}}

    /**
     * Returns a copy of this year-month plus the specified number of months.
     * <p>
     * This year-month instance is immutable and unaffected by this method call.
     * <p>
     * The following three lines are identical in effect:
     * <pre>
     * YearMonth added = ym.plusMonths(6);
     * YearMonth added = ym.plus(Period.months(6));
     * YearMonth added = ym.withFieldAdded(DurationFieldType.months(), 6);
     * </pre>
     *
     * @param months  the amount of months to add, may be negative
     * @return the new year-month plus the increased months, never null
     */
    public YearMonth plusMonths(int months) {try{__CLR4_4_152n52nlc8azsjq.R.inc(6696);
        __CLR4_4_152n52nlc8azsjq.R.inc(6697);return withFieldAdded(DurationFieldType.months(), months);
    }finally{__CLR4_4_152n52nlc8azsjq.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Returns a copy of this year-month with the specified period taken away.
     * <p>
     * If the amount is zero or null, then <code>this</code> is returned.
     * <p>
     * This method is typically used to subtract complex period instances.
     * Subtracting one field is best achieved using methods
     * like {@link #minusYears(int)}.
     * 
     * @param period  the period to reduce this instant by
     * @return a copy of this instance with the period taken away, never null
     * @throws ArithmeticException if the new year-month exceeds the capacity
     */
    public YearMonth minus(ReadablePeriod period) {try{__CLR4_4_152n52nlc8azsjq.R.inc(6698);
        __CLR4_4_152n52nlc8azsjq.R.inc(6699);return withPeriodAdded(period, -1);
    }finally{__CLR4_4_152n52nlc8azsjq.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Returns a copy of this year-month minus the specified number of years.
     * <p>
     * This year-month instance is immutable and unaffected by this method call.
     * <p>
     * The following three lines are identical in effect:
     * <pre>
     * YearMonth subtracted = ym.minusYears(6);
     * YearMonth subtracted = ym.minus(Period.years(6));
     * YearMonth subtracted = ym.withFieldAdded(DurationFieldType.years(), -6);
     * </pre>
     *
     * @param years  the amount of years to subtract, may be negative
     * @return the new year-month minus the increased years, never null
     */
    public YearMonth minusYears(int years) {try{__CLR4_4_152n52nlc8azsjq.R.inc(6700);
        __CLR4_4_152n52nlc8azsjq.R.inc(6701);return withFieldAdded(DurationFieldType.years(), FieldUtils.safeNegate(years));
    }finally{__CLR4_4_152n52nlc8azsjq.R.flushNeeded();}}

    /**
     * Returns a copy of this year-month minus the specified number of months.
     * <p>
     * This year-month instance is immutable and unaffected by this method call.
     * <p>
     * The following three lines are identical in effect:
     * <pre>
     * YearMonth subtracted = ym.minusMonths(6);
     * YearMonth subtracted = ym.minus(Period.months(6));
     * YearMonth subtracted = ym.withFieldAdded(DurationFieldType.months(), -6);
     * </pre>
     *
     * @param months  the amount of months to subtract, may be negative
     * @return the new year-month minus the increased months, never null
     */
    public YearMonth minusMonths(int months) {try{__CLR4_4_152n52nlc8azsjq.R.inc(6702);
        __CLR4_4_152n52nlc8azsjq.R.inc(6703);return withFieldAdded(DurationFieldType.months(), FieldUtils.safeNegate(months));
    }finally{__CLR4_4_152n52nlc8azsjq.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Converts this object to a LocalDate with the same year-month and chronology.
     *
     * @param dayOfMonth the day of month to use, valid for chronology, such as 1-31 for ISO
     * @return a LocalDate with the same year-month and chronology, never null
     */
    public LocalDate toLocalDate(int dayOfMonth) {try{__CLR4_4_152n52nlc8azsjq.R.inc(6704);
        __CLR4_4_152n52nlc8azsjq.R.inc(6705);return new LocalDate(getYear(), getMonthOfYear(), dayOfMonth, getChronology());
    }finally{__CLR4_4_152n52nlc8azsjq.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Converts this object to an Interval representing the whole month.
     * <p>
     * The interval will use the chronology of the year-month in the default zone.
     * <p>
     * This instance is immutable and unaffected by this method call.
     *
     * @return an interval over the month, never null
     */
    public Interval toInterval() {try{__CLR4_4_152n52nlc8azsjq.R.inc(6706);
        __CLR4_4_152n52nlc8azsjq.R.inc(6707);return toInterval(null);
    }finally{__CLR4_4_152n52nlc8azsjq.R.flushNeeded();}}

    /**
     * Converts this object to an Interval representing the whole month.
     * <p>
     * The interval will use the chronology of the year-month in the specified zone.
     * <p>
     * This instance is immutable and unaffected by this method call.
     *
     * @param zone  the zone to get the Interval in, null means default
     * @return an interval over the month, never null
     */
    public Interval toInterval(DateTimeZone zone) {try{__CLR4_4_152n52nlc8azsjq.R.inc(6708);
        __CLR4_4_152n52nlc8azsjq.R.inc(6709);zone = DateTimeUtils.getZone(zone);
        __CLR4_4_152n52nlc8azsjq.R.inc(6710);DateTime start = toLocalDate(1).toDateTimeAtStartOfDay(zone);
        __CLR4_4_152n52nlc8azsjq.R.inc(6711);DateTime end = plusMonths(1).toLocalDate(1).toDateTimeAtStartOfDay(zone);
        __CLR4_4_152n52nlc8azsjq.R.inc(6712);return new Interval(start, end);
    }finally{__CLR4_4_152n52nlc8azsjq.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Get the year field value.
     *
     * @return the year
     */
    public int getYear() {try{__CLR4_4_152n52nlc8azsjq.R.inc(6713);
        __CLR4_4_152n52nlc8azsjq.R.inc(6714);return getValue(YEAR);
    }finally{__CLR4_4_152n52nlc8azsjq.R.flushNeeded();}}

    /**
     * Get the month of year field value.
     *
     * @return the month of year
     */
    public int getMonthOfYear() {try{__CLR4_4_152n52nlc8azsjq.R.inc(6715);
        __CLR4_4_152n52nlc8azsjq.R.inc(6716);return getValue(MONTH_OF_YEAR);
    }finally{__CLR4_4_152n52nlc8azsjq.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Returns a copy of this year-month with the year field updated.
     * <p>
     * YearMonth is immutable, so there are no set methods.
     * Instead, this method returns a new instance with the value of
     * year changed.
     *
     * @param year  the year to set
     * @return a copy of this object with the field set, never null
     * @throws IllegalArgumentException if the value is invalid
     */
    public YearMonth withYear(int year) {try{__CLR4_4_152n52nlc8azsjq.R.inc(6717);
        __CLR4_4_152n52nlc8azsjq.R.inc(6718);int[] newValues = getValues();
        __CLR4_4_152n52nlc8azsjq.R.inc(6719);newValues = getChronology().year().set(this, YEAR, newValues, year);
        __CLR4_4_152n52nlc8azsjq.R.inc(6720);return new YearMonth(this, newValues);
    }finally{__CLR4_4_152n52nlc8azsjq.R.flushNeeded();}}

    /**
     * Returns a copy of this year-month with the month of year field updated.
     * <p>
     * YearMonth is immutable, so there are no set methods.
     * Instead, this method returns a new instance with the value of
     * month of year changed.
     *
     * @param monthOfYear  the month of year to set
     * @return a copy of this object with the field set, never null
     * @throws IllegalArgumentException if the value is invalid
     */
    public YearMonth withMonthOfYear(int monthOfYear) {try{__CLR4_4_152n52nlc8azsjq.R.inc(6721);
        __CLR4_4_152n52nlc8azsjq.R.inc(6722);int[] newValues = getValues();
        __CLR4_4_152n52nlc8azsjq.R.inc(6723);newValues = getChronology().monthOfYear().set(this, MONTH_OF_YEAR, newValues, monthOfYear);
        __CLR4_4_152n52nlc8azsjq.R.inc(6724);return new YearMonth(this, newValues);
    }finally{__CLR4_4_152n52nlc8azsjq.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Gets the property object for the specified type, which contains
     * many useful methods.
     *
     * @param type  the field type to get the property for
     * @return the property object
     * @throws IllegalArgumentException if the field is null or unsupported
     */
    public Property property(DateTimeFieldType type) {try{__CLR4_4_152n52nlc8azsjq.R.inc(6725);
        __CLR4_4_152n52nlc8azsjq.R.inc(6726);return new Property(this, indexOfSupported(type));
    }finally{__CLR4_4_152n52nlc8azsjq.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Get the year field property which provides access to advanced functionality.
     * 
     * @return the year property
     */
    public Property year() {try{__CLR4_4_152n52nlc8azsjq.R.inc(6727);
        __CLR4_4_152n52nlc8azsjq.R.inc(6728);return new Property(this, YEAR);
    }finally{__CLR4_4_152n52nlc8azsjq.R.flushNeeded();}}

    /**
     * Get the month of year field property which provides access to advanced functionality.
     * 
     * @return the month of year property
     */
    public Property monthOfYear() {try{__CLR4_4_152n52nlc8azsjq.R.inc(6729);
        __CLR4_4_152n52nlc8azsjq.R.inc(6730);return new Property(this, MONTH_OF_YEAR);
    }finally{__CLR4_4_152n52nlc8azsjq.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Output the year-month in ISO8601 format (yyyy-MM).
     *
     * @return ISO8601 time formatted string.
     */
    @ToString
    public String toString() {try{__CLR4_4_152n52nlc8azsjq.R.inc(6731);
        __CLR4_4_152n52nlc8azsjq.R.inc(6732);return ISODateTimeFormat.yearMonth().print(this);
    }finally{__CLR4_4_152n52nlc8azsjq.R.flushNeeded();}}

    /**
     * Output the year-month using the specified format pattern.
     *
     * @param pattern  the pattern specification, null means use <code>toString</code>
     * @see org.joda.time.format.DateTimeFormat
     */
    public String toString(String pattern) {try{__CLR4_4_152n52nlc8azsjq.R.inc(6733);
        __CLR4_4_152n52nlc8azsjq.R.inc(6734);if ((((pattern == null)&&(__CLR4_4_152n52nlc8azsjq.R.iget(6735)!=0|true))||(__CLR4_4_152n52nlc8azsjq.R.iget(6736)==0&false))) {{
            __CLR4_4_152n52nlc8azsjq.R.inc(6737);return toString();
        }
        }__CLR4_4_152n52nlc8azsjq.R.inc(6738);return DateTimeFormat.forPattern(pattern).print(this);
    }finally{__CLR4_4_152n52nlc8azsjq.R.flushNeeded();}}

    /**
     * Output the year-month using the specified format pattern.
     *
     * @param pattern  the pattern specification, null means use <code>toString</code>
     * @param locale  Locale to use, null means default
     * @see org.joda.time.format.DateTimeFormat
     */
    public String toString(String pattern, Locale locale) throws IllegalArgumentException {try{__CLR4_4_152n52nlc8azsjq.R.inc(6739);
        __CLR4_4_152n52nlc8azsjq.R.inc(6740);if ((((pattern == null)&&(__CLR4_4_152n52nlc8azsjq.R.iget(6741)!=0|true))||(__CLR4_4_152n52nlc8azsjq.R.iget(6742)==0&false))) {{
            __CLR4_4_152n52nlc8azsjq.R.inc(6743);return toString();
        }
        }__CLR4_4_152n52nlc8azsjq.R.inc(6744);return DateTimeFormat.forPattern(pattern).withLocale(locale).print(this);
    }finally{__CLR4_4_152n52nlc8azsjq.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * The property class for <code>YearMonth</code>.
     * <p>
     * This class binds a <code>YearMonth</code> to a <code>DateTimeField</code>.
     * 
     * @author Stephen Colebourne
     * @since 2.0
     */
    public static class Property extends AbstractPartialFieldProperty implements Serializable {

        /** Serialization version */
        private static final long serialVersionUID = 5727734012190224363L;

        /** The partial */
        private final YearMonth iBase;
        /** The field index */
        private final int iFieldIndex;

        /**
         * Constructs a property.
         * 
         * @param partial  the partial instance
         * @param fieldIndex  the index in the partial
         */
        Property(YearMonth partial, int fieldIndex) {
            super();__CLR4_4_152n52nlc8azsjq.R.inc(6746);try{__CLR4_4_152n52nlc8azsjq.R.inc(6745);
            __CLR4_4_152n52nlc8azsjq.R.inc(6747);iBase = partial;
            __CLR4_4_152n52nlc8azsjq.R.inc(6748);iFieldIndex = fieldIndex;
        }finally{__CLR4_4_152n52nlc8azsjq.R.flushNeeded();}}

        /**
         * Gets the field that this property uses.
         * 
         * @return the field
         */
        public DateTimeField getField() {try{__CLR4_4_152n52nlc8azsjq.R.inc(6749);
            __CLR4_4_152n52nlc8azsjq.R.inc(6750);return iBase.getField(iFieldIndex);
        }finally{__CLR4_4_152n52nlc8azsjq.R.flushNeeded();}}

        /**
         * Gets the partial that this property belongs to.
         * 
         * @return the partial
         */
        protected ReadablePartial getReadablePartial() {try{__CLR4_4_152n52nlc8azsjq.R.inc(6751);
            __CLR4_4_152n52nlc8azsjq.R.inc(6752);return iBase;
        }finally{__CLR4_4_152n52nlc8azsjq.R.flushNeeded();}}

        /**
         * Gets the partial that this property belongs to.
         * 
         * @return the partial
         */
        public YearMonth getYearMonth() {try{__CLR4_4_152n52nlc8azsjq.R.inc(6753);
            __CLR4_4_152n52nlc8azsjq.R.inc(6754);return iBase;
        }finally{__CLR4_4_152n52nlc8azsjq.R.flushNeeded();}}

        /**
         * Gets the value of this field.
         * 
         * @return the field value
         */
        public int get() {try{__CLR4_4_152n52nlc8azsjq.R.inc(6755);
            __CLR4_4_152n52nlc8azsjq.R.inc(6756);return iBase.getValue(iFieldIndex);
        }finally{__CLR4_4_152n52nlc8azsjq.R.flushNeeded();}}

        //-----------------------------------------------------------------------
        /**
         * Adds to the value of this field in a copy of this YearMonth.
         * <p>
         * The value will be added to this field. If the value is too large to be
         * added solely to this field then it will affect larger fields.
         * Smaller fields are unaffected.
         * <p>
         * If the result would be too large, beyond the maximum year, then an
         * IllegalArgumentException is thrown.
         * <p>
         * The YearMonth attached to this property is unchanged by this call.
         * Instead, a new instance is returned.
         * 
         * @param valueToAdd  the value to add to the field in the copy
         * @return a copy of the YearMonth with the field value changed
         * @throws IllegalArgumentException if the value isn't valid
         */
        public YearMonth addToCopy(int valueToAdd) {try{__CLR4_4_152n52nlc8azsjq.R.inc(6757);
            __CLR4_4_152n52nlc8azsjq.R.inc(6758);int[] newValues = iBase.getValues();
            __CLR4_4_152n52nlc8azsjq.R.inc(6759);newValues = getField().add(iBase, iFieldIndex, newValues, valueToAdd);
            __CLR4_4_152n52nlc8azsjq.R.inc(6760);return new YearMonth(iBase, newValues);
        }finally{__CLR4_4_152n52nlc8azsjq.R.flushNeeded();}}

        /**
         * Adds to the value of this field in a copy of this YearMonth wrapping
         * within this field if the maximum value is reached.
         * <p>
         * The value will be added to this field. If the value is too large to be
         * added solely to this field then it wraps within this field.
         * Other fields are unaffected.
         * <p>
         * For example,
         * <code>2004-12</code> addWrapField one month returns <code>2004-01</code>.
         * <p>
         * The YearMonth attached to this property is unchanged by this call.
         * Instead, a new instance is returned.
         * 
         * @param valueToAdd  the value to add to the field in the copy
         * @return a copy of the YearMonth with the field value changed
         * @throws IllegalArgumentException if the value isn't valid
         */
        public YearMonth addWrapFieldToCopy(int valueToAdd) {try{__CLR4_4_152n52nlc8azsjq.R.inc(6761);
            __CLR4_4_152n52nlc8azsjq.R.inc(6762);int[] newValues = iBase.getValues();
            __CLR4_4_152n52nlc8azsjq.R.inc(6763);newValues = getField().addWrapField(iBase, iFieldIndex, newValues, valueToAdd);
            __CLR4_4_152n52nlc8azsjq.R.inc(6764);return new YearMonth(iBase, newValues);
        }finally{__CLR4_4_152n52nlc8azsjq.R.flushNeeded();}}

        //-----------------------------------------------------------------------
        /**
         * Sets this field in a copy of the YearMonth.
         * <p>
         * The YearMonth attached to this property is unchanged by this call.
         * Instead, a new instance is returned.
         * 
         * @param value  the value to set the field in the copy to
         * @return a copy of the YearMonth with the field value changed
         * @throws IllegalArgumentException if the value isn't valid
         */
        public YearMonth setCopy(int value) {try{__CLR4_4_152n52nlc8azsjq.R.inc(6765);
            __CLR4_4_152n52nlc8azsjq.R.inc(6766);int[] newValues = iBase.getValues();
            __CLR4_4_152n52nlc8azsjq.R.inc(6767);newValues = getField().set(iBase, iFieldIndex, newValues, value);
            __CLR4_4_152n52nlc8azsjq.R.inc(6768);return new YearMonth(iBase, newValues);
        }finally{__CLR4_4_152n52nlc8azsjq.R.flushNeeded();}}

        /**
         * Sets this field in a copy of the YearMonth to a parsed text value.
         * <p>
         * The YearMonth attached to this property is unchanged by this call.
         * Instead, a new instance is returned.
         * 
         * @param text  the text value to set
         * @param locale  optional locale to use for selecting a text symbol
         * @return a copy of the YearMonth with the field value changed
         * @throws IllegalArgumentException if the text value isn't valid
         */
        public YearMonth setCopy(String text, Locale locale) {try{__CLR4_4_152n52nlc8azsjq.R.inc(6769);
            __CLR4_4_152n52nlc8azsjq.R.inc(6770);int[] newValues = iBase.getValues();
            __CLR4_4_152n52nlc8azsjq.R.inc(6771);newValues = getField().set(iBase, iFieldIndex, newValues, text, locale);
            __CLR4_4_152n52nlc8azsjq.R.inc(6772);return new YearMonth(iBase, newValues);
        }finally{__CLR4_4_152n52nlc8azsjq.R.flushNeeded();}}

        /**
         * Sets this field in a copy of the YearMonth to a parsed text value.
         * <p>
         * The YearMonth attached to this property is unchanged by this call.
         * Instead, a new instance is returned.
         * 
         * @param text  the text value to set
         * @return a copy of the YearMonth with the field value changed
         * @throws IllegalArgumentException if the text value isn't valid
         */
        public YearMonth setCopy(String text) {try{__CLR4_4_152n52nlc8azsjq.R.inc(6773);
            __CLR4_4_152n52nlc8azsjq.R.inc(6774);return setCopy(text, null);
        }finally{__CLR4_4_152n52nlc8azsjq.R.flushNeeded();}}
    }

}
