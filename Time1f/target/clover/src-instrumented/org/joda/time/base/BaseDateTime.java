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
package org.joda.time.base;

import java.io.Serializable;

import org.joda.time.Chronology;
import org.joda.time.DateTimeUtils;
import org.joda.time.DateTimeZone;
import org.joda.time.ReadableDateTime;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.convert.ConverterManager;
import org.joda.time.convert.InstantConverter;

/**
 * BaseDateTime is an abstract implementation of ReadableDateTime that stores
 * data in <code>long</code> and <code>Chronology</code> fields.
 * <p>
 * This class should generally not be used directly by API users.
 * The {@link ReadableDateTime} interface should be used when different 
 * kinds of date/time objects are to be referenced.
 * <p>
 * BaseDateTime subclasses may be mutable and not thread-safe.
 *
 * @author Stephen Colebourne
 * @author Kandarp Shah
 * @author Brian S O'Neill
 * @since 1.0
 */
public abstract class BaseDateTime
        extends AbstractDateTime
        implements ReadableDateTime, Serializable {public static class __CLR4_4_15x35x3lc8azsnu{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672271027956L,8589935092L,7717,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** Serialization lock */
    private static final long serialVersionUID = -6728882245981L;

    /** The millis from 1970-01-01T00:00:00Z */
    private volatile long iMillis;
    /** The chronology to use */
    private volatile Chronology iChronology;

    //-----------------------------------------------------------------------
    /**
     * Constructs an instance set to the current system millisecond time
     * using <code>ISOChronology</code> in the default time zone.
     */
    public BaseDateTime() {
        this(DateTimeUtils.currentTimeMillis(), ISOChronology.getInstance());__CLR4_4_15x35x3lc8azsnu.R.inc(7672);try{__CLR4_4_15x35x3lc8azsnu.R.inc(7671);
    }finally{__CLR4_4_15x35x3lc8azsnu.R.flushNeeded();}}

    /**
     * Constructs an instance set to the current system millisecond time
     * using <code>ISOChronology</code> in the specified time zone.
     * <p>
     * If the specified time zone is null, the default zone is used.
     *
     * @param zone  the time zone, null means default zone
     */
    public BaseDateTime(DateTimeZone zone) {
        this(DateTimeUtils.currentTimeMillis(), ISOChronology.getInstance(zone));__CLR4_4_15x35x3lc8azsnu.R.inc(7674);try{__CLR4_4_15x35x3lc8azsnu.R.inc(7673);
    }finally{__CLR4_4_15x35x3lc8azsnu.R.flushNeeded();}}

    /**
     * Constructs an instance set to the current system millisecond time
     * using the specified chronology.
     * <p>
     * If the chronology is null, <code>ISOChronology</code>
     * in the default time zone is used.
     *
     * @param chronology  the chronology, null means ISOChronology in default zone
     */
    public BaseDateTime(Chronology chronology) {
        this(DateTimeUtils.currentTimeMillis(), chronology);__CLR4_4_15x35x3lc8azsnu.R.inc(7676);try{__CLR4_4_15x35x3lc8azsnu.R.inc(7675);
    }finally{__CLR4_4_15x35x3lc8azsnu.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Constructs an instance set to the milliseconds from 1970-01-01T00:00:00Z
     * using <code>ISOChronology</code> in the default time zone.
     *
     * @param instant  the milliseconds from 1970-01-01T00:00:00Z
     */
    public BaseDateTime(long instant) {
        this(instant, ISOChronology.getInstance());__CLR4_4_15x35x3lc8azsnu.R.inc(7678);try{__CLR4_4_15x35x3lc8azsnu.R.inc(7677);
    }finally{__CLR4_4_15x35x3lc8azsnu.R.flushNeeded();}}

    /**
     * Constructs an instance set to the milliseconds from 1970-01-01T00:00:00Z
     * using <code>ISOChronology</code> in the specified time zone.
     * <p>
     * If the specified time zone is null, the default zone is used.
     *
     * @param instant  the milliseconds from 1970-01-01T00:00:00Z
     * @param zone  the time zone, null means default zone
     */
    public BaseDateTime(long instant, DateTimeZone zone) {
        this(instant, ISOChronology.getInstance(zone));__CLR4_4_15x35x3lc8azsnu.R.inc(7680);try{__CLR4_4_15x35x3lc8azsnu.R.inc(7679);
    }finally{__CLR4_4_15x35x3lc8azsnu.R.flushNeeded();}}

    /**
     * Constructs an instance set to the milliseconds from 1970-01-01T00:00:00Z
     * using the specified chronology.
     * <p>
     * If the chronology is null, <code>ISOChronology</code>
     * in the default time zone is used.
     *
     * @param instant  the milliseconds from 1970-01-01T00:00:00Z
     * @param chronology  the chronology, null means ISOChronology in default zone
     */
    public BaseDateTime(long instant, Chronology chronology) {
        super();__CLR4_4_15x35x3lc8azsnu.R.inc(7682);try{__CLR4_4_15x35x3lc8azsnu.R.inc(7681);
        __CLR4_4_15x35x3lc8azsnu.R.inc(7683);iChronology = checkChronology(chronology);
        __CLR4_4_15x35x3lc8azsnu.R.inc(7684);iMillis = checkInstant(instant, iChronology);
    }finally{__CLR4_4_15x35x3lc8azsnu.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Constructs an instance from an Object that represents a datetime,
     * forcing the time zone to that specified.
     * <p>
     * If the object contains no chronology, <code>ISOChronology</code> is used.
     * If the specified time zone is null, the default zone is used.
     * <p>
     * The recognised object types are defined in
     * {@link org.joda.time.convert.ConverterManager ConverterManager} and
     * include ReadableInstant, String, Calendar and Date.
     *
     * @param instant  the datetime object
     * @param zone  the time zone
     * @throws IllegalArgumentException if the instant is invalid
     */
    public BaseDateTime(Object instant, DateTimeZone zone) {
        super();__CLR4_4_15x35x3lc8azsnu.R.inc(7686);try{__CLR4_4_15x35x3lc8azsnu.R.inc(7685);
        __CLR4_4_15x35x3lc8azsnu.R.inc(7687);InstantConverter converter = ConverterManager.getInstance().getInstantConverter(instant);
        __CLR4_4_15x35x3lc8azsnu.R.inc(7688);Chronology chrono = checkChronology(converter.getChronology(instant, zone));
        __CLR4_4_15x35x3lc8azsnu.R.inc(7689);iChronology = chrono;
        __CLR4_4_15x35x3lc8azsnu.R.inc(7690);iMillis = checkInstant(converter.getInstantMillis(instant, chrono), chrono);
    }finally{__CLR4_4_15x35x3lc8azsnu.R.flushNeeded();}}

    /**
     * Constructs an instance from an Object that represents a datetime,
     * using the specified chronology.
     * <p>
     * If the chronology is null, ISO in the default time zone is used.
     * <p>
     * The recognised object types are defined in
     * {@link org.joda.time.convert.ConverterManager ConverterManager} and
     * include ReadableInstant, String, Calendar and Date.
     *
     * @param instant  the datetime object
     * @param chronology  the chronology
     * @throws IllegalArgumentException if the instant is invalid
     */
    public BaseDateTime(Object instant, Chronology chronology) {
        super();__CLR4_4_15x35x3lc8azsnu.R.inc(7692);try{__CLR4_4_15x35x3lc8azsnu.R.inc(7691);
        __CLR4_4_15x35x3lc8azsnu.R.inc(7693);InstantConverter converter = ConverterManager.getInstance().getInstantConverter(instant);
        __CLR4_4_15x35x3lc8azsnu.R.inc(7694);iChronology = checkChronology(converter.getChronology(instant, chronology));
        __CLR4_4_15x35x3lc8azsnu.R.inc(7695);iMillis = checkInstant(converter.getInstantMillis(instant, chronology), iChronology);
    }finally{__CLR4_4_15x35x3lc8azsnu.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Constructs an instance from datetime field values
     * using <code>ISOChronology</code> in the default time zone.
     *
     * @param year  the year
     * @param monthOfYear  the month of the year
     * @param dayOfMonth  the day of the month
     * @param hourOfDay  the hour of the day
     * @param minuteOfHour  the minute of the hour
     * @param secondOfMinute  the second of the minute
     * @param millisOfSecond  the millisecond of the second
     */
    public BaseDateTime(
            int year,
            int monthOfYear,
            int dayOfMonth,
            int hourOfDay,
            int minuteOfHour,
            int secondOfMinute,
            int millisOfSecond) {
        this(year, monthOfYear, dayOfMonth, hourOfDay,
            minuteOfHour, secondOfMinute, millisOfSecond, ISOChronology.getInstance());__CLR4_4_15x35x3lc8azsnu.R.inc(7697);try{__CLR4_4_15x35x3lc8azsnu.R.inc(7696);
    }finally{__CLR4_4_15x35x3lc8azsnu.R.flushNeeded();}}

    /**
     * Constructs an instance from datetime field values
     * using <code>ISOChronology</code> in the specified time zone.
     * <p>
     * If the specified time zone is null, the default zone is used.
     *
     * @param year  the year
     * @param monthOfYear  the month of the year
     * @param dayOfMonth  the day of the month
     * @param hourOfDay  the hour of the day
     * @param minuteOfHour  the minute of the hour
     * @param secondOfMinute  the second of the minute
     * @param millisOfSecond  the millisecond of the second
     * @param zone  the time zone, null means default time zone
     */
    public BaseDateTime(
            int year,
            int monthOfYear,
            int dayOfMonth,
            int hourOfDay,
            int minuteOfHour,
            int secondOfMinute,
            int millisOfSecond,
            DateTimeZone zone) {
        this(year, monthOfYear, dayOfMonth, hourOfDay,
            minuteOfHour, secondOfMinute, millisOfSecond, ISOChronology.getInstance(zone));__CLR4_4_15x35x3lc8azsnu.R.inc(7699);try{__CLR4_4_15x35x3lc8azsnu.R.inc(7698);
    }finally{__CLR4_4_15x35x3lc8azsnu.R.flushNeeded();}}

    /**
     * Constructs an instance from datetime field values
     * using the specified chronology.
     * <p>
     * If the chronology is null, <code>ISOChronology</code>
     * in the default time zone is used.
     *
     * @param year  the year
     * @param monthOfYear  the month of the year
     * @param dayOfMonth  the day of the month
     * @param hourOfDay  the hour of the day
     * @param minuteOfHour  the minute of the hour
     * @param secondOfMinute  the second of the minute
     * @param millisOfSecond  the millisecond of the second
     * @param chronology  the chronology, null means ISOChronology in default zone
     */
    public BaseDateTime(
            int year,
            int monthOfYear,
            int dayOfMonth,
            int hourOfDay,
            int minuteOfHour,
            int secondOfMinute,
            int millisOfSecond,
            Chronology chronology) {
        super();__CLR4_4_15x35x3lc8azsnu.R.inc(7701);try{__CLR4_4_15x35x3lc8azsnu.R.inc(7700);
        __CLR4_4_15x35x3lc8azsnu.R.inc(7702);iChronology = checkChronology(chronology);
        __CLR4_4_15x35x3lc8azsnu.R.inc(7703);long instant = iChronology.getDateTimeMillis(year, monthOfYear, dayOfMonth,
            hourOfDay, minuteOfHour, secondOfMinute, millisOfSecond);
        __CLR4_4_15x35x3lc8azsnu.R.inc(7704);iMillis = checkInstant(instant, iChronology);
    }finally{__CLR4_4_15x35x3lc8azsnu.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Checks the specified chronology before storing it, potentially altering it.
     * This method must not access any instance variables.
     * <p>
     * This implementation converts nulls to ISOChronology in the default zone.
     *
     * @param chronology  the chronology to use, may be null
     * @return the chronology to store in this datetime, not null
     */
    protected Chronology checkChronology(Chronology chronology) {try{__CLR4_4_15x35x3lc8azsnu.R.inc(7705);
        __CLR4_4_15x35x3lc8azsnu.R.inc(7706);return DateTimeUtils.getChronology(chronology);
    }finally{__CLR4_4_15x35x3lc8azsnu.R.flushNeeded();}}

    /**
     * Checks the specified instant before storing it, potentially altering it.
     * This method must not access any instance variables.
     * <p>
     * This implementation simply returns the instant.
     *
     * @param instant  the milliseconds from 1970-01-01T00:00:00Z to round
     * @param chronology  the chronology to use, not null
     * @return the instant to store in this datetime
     */
    protected long checkInstant(long instant, Chronology chronology) {try{__CLR4_4_15x35x3lc8azsnu.R.inc(7707);
        __CLR4_4_15x35x3lc8azsnu.R.inc(7708);return instant;
    }finally{__CLR4_4_15x35x3lc8azsnu.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Gets the milliseconds of the datetime instant from the Java epoch
     * of 1970-01-01T00:00:00Z.
     * 
     * @return the number of milliseconds since 1970-01-01T00:00:00Z
     */
    public long getMillis() {try{__CLR4_4_15x35x3lc8azsnu.R.inc(7709);
        __CLR4_4_15x35x3lc8azsnu.R.inc(7710);return iMillis;
    }finally{__CLR4_4_15x35x3lc8azsnu.R.flushNeeded();}}

    /**
     * Gets the chronology of the datetime.
     * 
     * @return the Chronology that the datetime is using
     */
    public Chronology getChronology() {try{__CLR4_4_15x35x3lc8azsnu.R.inc(7711);
        __CLR4_4_15x35x3lc8azsnu.R.inc(7712);return iChronology;
    }finally{__CLR4_4_15x35x3lc8azsnu.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Sets the milliseconds of the datetime.
     * <p>
     * All changes to the millisecond field occurs via this method.
     * Override and block this method to make a subclass immutable.
     *
     * @param instant  the milliseconds since 1970-01-01T00:00:00Z to set the datetime to
     */
    protected void setMillis(long instant) {try{__CLR4_4_15x35x3lc8azsnu.R.inc(7713);
        __CLR4_4_15x35x3lc8azsnu.R.inc(7714);iMillis = checkInstant(instant, iChronology);
    }finally{__CLR4_4_15x35x3lc8azsnu.R.flushNeeded();}}

    /**
     * Sets the chronology of the datetime.
     * <p>
     * All changes to the chronology field occurs via this method.
     * Override and block this method to make a subclass immutable.
     *
     * @param chronology  the chronology to set
     */
    protected void setChronology(Chronology chronology) {try{__CLR4_4_15x35x3lc8azsnu.R.inc(7715);
        __CLR4_4_15x35x3lc8azsnu.R.inc(7716);iChronology = checkChronology(chronology);
    }finally{__CLR4_4_15x35x3lc8azsnu.R.flushNeeded();}}

}
