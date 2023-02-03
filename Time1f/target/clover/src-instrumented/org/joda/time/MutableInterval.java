/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 *  Copyright 2001-2005 Stephen Colebourne
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

import org.joda.time.base.BaseInterval;
import org.joda.time.field.FieldUtils;
import org.joda.time.format.ISODateTimeFormat;
import org.joda.time.format.ISOPeriodFormat;

/**
 * MutableInterval is the standard implementation of a mutable time interval.
 * <p>
 * A time interval represents a period of time between two instants.
 * Intervals are inclusive of the start instant and exclusive of the end.
 * The end instant is always greater than or equal to the start instant.
 * <p>
 * Intervals have a fixed millisecond duration.
 * This is the difference between the start and end instants.
 * The duration is represented separately by {@link ReadableDuration}.
 * As a result, intervals are not comparable.
 * To compare the length of two intervals, you should compare their durations.
 * <p>
 * An interval can also be converted to a {@link ReadablePeriod}.
 * This represents the difference between the start and end points in terms of fields
 * such as years and days.
 * <p>
 * If performing significant calculations on an interval, it may be faster to
 * convert an Interval object to a MutableInterval one.
 * <p>
 * MutableInterval is mutable and not thread-safe, unless concurrent threads
 * are not invoking mutator methods.
 *
 * @author Stephen Colebourne
 * @author Brian S O'Neill
 * @since 1.0
 */
public class MutableInterval
        extends BaseInterval
        implements ReadWritableInterval, Cloneable, Serializable {public static class __CLR4_4_13ny3nylc8azs9d{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672271027956L,8589935092L,4833,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** Serialization version */
    private static final long serialVersionUID = -5982824024992428470L;

    //-----------------------------------------------------------------------
    /**
     * Parses a {@code MutableInterval} from the specified string.
     * <p>
     * The String formats are described by {@link ISODateTimeFormat#dateTimeParser()}
     * and {@link ISOPeriodFormat#standard()}, and may be 'datetime/datetime',
     * 'datetime/period' or 'period/datetime'.
     * 
     * @param str  the string to parse, not null
     * @since 2.0
     */
    public static MutableInterval parse(String str) {try{__CLR4_4_13ny3nylc8azs9d.R.inc(4750);
        __CLR4_4_13ny3nylc8azs9d.R.inc(4751);return new MutableInterval(str);
    }finally{__CLR4_4_13ny3nylc8azs9d.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Constructs a zero length time interval from 1970-01-01 to 1970-01-01.
     */
    public MutableInterval() {
        super(0L, 0L, null);__CLR4_4_13ny3nylc8azs9d.R.inc(4753);try{__CLR4_4_13ny3nylc8azs9d.R.inc(4752);
    }finally{__CLR4_4_13ny3nylc8azs9d.R.flushNeeded();}}

    /**
     * Constructs an interval from a start and end instant with the ISO default chronology.
     * 
     * @param startInstant  start of this interval, as milliseconds from 1970-01-01T00:00:00Z.
     * @param endInstant  end of this interval, as milliseconds from 1970-01-01T00:00:00Z.
     * @throws IllegalArgumentException if the end is before the start
     */
    public MutableInterval(long startInstant, long endInstant) {
        super(startInstant, endInstant, null);__CLR4_4_13ny3nylc8azs9d.R.inc(4755);try{__CLR4_4_13ny3nylc8azs9d.R.inc(4754);
    }finally{__CLR4_4_13ny3nylc8azs9d.R.flushNeeded();}}

    /**
     * Constructs an interval from a start and end instant with a chronology.
     * 
     * @param chronology  the chronology to use, null is ISO default
     * @param startInstant  start of this interval, as milliseconds from 1970-01-01T00:00:00Z.
     * @param endInstant  end of this interval, as milliseconds from 1970-01-01T00:00:00Z.
     * @throws IllegalArgumentException if the end is before the start
     */
    public MutableInterval(long startInstant, long endInstant, Chronology chronology) {
        super(startInstant, endInstant, chronology);__CLR4_4_13ny3nylc8azs9d.R.inc(4757);try{__CLR4_4_13ny3nylc8azs9d.R.inc(4756);
    }finally{__CLR4_4_13ny3nylc8azs9d.R.flushNeeded();}}

    /**
     * Constructs an interval from a start and end instant.
     * <p>
     * The chronology used is that of the start instant.
     * 
     * @param start  start of this interval, null means now
     * @param end  end of this interval, null means now
     * @throws IllegalArgumentException if the end is before the start
     */
    public MutableInterval(ReadableInstant start, ReadableInstant end) {
        super(start, end);__CLR4_4_13ny3nylc8azs9d.R.inc(4759);try{__CLR4_4_13ny3nylc8azs9d.R.inc(4758);
    }finally{__CLR4_4_13ny3nylc8azs9d.R.flushNeeded();}}

    /**
     * Constructs an interval from a start instant and a duration.
     * 
     * @param start  start of this interval, null means now
     * @param duration  the duration of this interval, null means zero length
     * @throws IllegalArgumentException if the end is before the start
     * @throws ArithmeticException if the end instant exceeds the capacity of a long
     */
    public MutableInterval(ReadableInstant start, ReadableDuration duration) {
        super(start, duration);__CLR4_4_13ny3nylc8azs9d.R.inc(4761);try{__CLR4_4_13ny3nylc8azs9d.R.inc(4760);
    }finally{__CLR4_4_13ny3nylc8azs9d.R.flushNeeded();}}

    /**
     * Constructs an interval from a millisecond duration and an end instant.
     * 
     * @param duration  the duration of this interval, null means zero length
     * @param end  end of this interval, null means now
     * @throws IllegalArgumentException if the end is before the start
     * @throws ArithmeticException if the start instant exceeds the capacity of a long
     */
    public MutableInterval(ReadableDuration duration, ReadableInstant end) {
        super(duration, end);__CLR4_4_13ny3nylc8azs9d.R.inc(4763);try{__CLR4_4_13ny3nylc8azs9d.R.inc(4762);
    }finally{__CLR4_4_13ny3nylc8azs9d.R.flushNeeded();}}

    /**
     * Constructs an interval from a start instant and a time period.
     * <p>
     * When forming the interval, the chronology from the instant is used
     * if present, otherwise the chronology of the period is used.
     * 
     * @param start  start of this interval, null means now
     * @param period  the period of this interval, null means zero length
     * @throws IllegalArgumentException if the end is before the start
     * @throws ArithmeticException if the end instant exceeds the capacity of a long
     */
    public MutableInterval(ReadableInstant start, ReadablePeriod period) {
        super(start, period);__CLR4_4_13ny3nylc8azs9d.R.inc(4765);try{__CLR4_4_13ny3nylc8azs9d.R.inc(4764);
    }finally{__CLR4_4_13ny3nylc8azs9d.R.flushNeeded();}}

    /**
     * Constructs an interval from a time period and an end instant.
     * <p>
     * When forming the interval, the chronology from the instant is used
     * if present, otherwise the chronology of the period is used.
     * 
     * @param period  the period of this interval, null means zero length
     * @param end  end of this interval, null means now
     * @throws IllegalArgumentException if the end is before the start
     * @throws ArithmeticException if the start instant exceeds the capacity of a long
     */
    public MutableInterval(ReadablePeriod period, ReadableInstant end) {
        super(period, end);__CLR4_4_13ny3nylc8azs9d.R.inc(4767);try{__CLR4_4_13ny3nylc8azs9d.R.inc(4766);
    }finally{__CLR4_4_13ny3nylc8azs9d.R.flushNeeded();}}

    /**
     * Constructs a time interval by converting or copying from another object.
     * <p>
     * The recognised object types are defined in
     * {@link org.joda.time.convert.ConverterManager ConverterManager} and
     * include ReadableInterval and String.
     * The String formats are described by {@link ISODateTimeFormat#dateTimeParser()}
     * and {@link ISOPeriodFormat#standard()}, and may be 'datetime/datetime',
     * 'datetime/period' or 'period/datetime'.
     * 
     * @param interval  the time interval to copy
     * @throws IllegalArgumentException if the interval is invalid
     */
    public MutableInterval(Object interval) {
        super(interval, null);__CLR4_4_13ny3nylc8azs9d.R.inc(4769);try{__CLR4_4_13ny3nylc8azs9d.R.inc(4768);
    }finally{__CLR4_4_13ny3nylc8azs9d.R.flushNeeded();}}

    /**
     * Constructs a time interval by converting or copying from another object,
     * overriding the chronology.
     * <p>
     * The recognised object types are defined in
     * {@link org.joda.time.convert.ConverterManager ConverterManager} and
     * include ReadableInterval and String.
     * The String formats are described by {@link ISODateTimeFormat#dateTimeParser()}
     * and {@link ISOPeriodFormat#standard()}, and may be 'datetime/datetime',
     * 'datetime/period' or 'period/datetime'.
     * 
     * @param interval  the time interval to copy
     * @param chronology  the chronology to use, null means ISO default
     * @throws IllegalArgumentException if the interval is invalid
     */
    public MutableInterval(Object interval, Chronology chronology) {
        super(interval, chronology);__CLR4_4_13ny3nylc8azs9d.R.inc(4771);try{__CLR4_4_13ny3nylc8azs9d.R.inc(4770);
    }finally{__CLR4_4_13ny3nylc8azs9d.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Sets this interval from two millisecond instants retaining the chronology.
     *
     * @param startInstant  the start of the time interval
     * @param endInstant  the start of the time interval
     * @throws IllegalArgumentException if the end is before the start
     */
    public void setInterval(long startInstant, long endInstant) {try{__CLR4_4_13ny3nylc8azs9d.R.inc(4772);
        __CLR4_4_13ny3nylc8azs9d.R.inc(4773);super.setInterval(startInstant, endInstant, getChronology());
    }finally{__CLR4_4_13ny3nylc8azs9d.R.flushNeeded();}}

    /**
     * Sets this interval to be the same as another.
     *
     * @param interval  the interval to copy
     * @throws IllegalArgumentException if the interval is null
     */
    public void setInterval(ReadableInterval interval) {try{__CLR4_4_13ny3nylc8azs9d.R.inc(4774);
        __CLR4_4_13ny3nylc8azs9d.R.inc(4775);if ((((interval == null)&&(__CLR4_4_13ny3nylc8azs9d.R.iget(4776)!=0|true))||(__CLR4_4_13ny3nylc8azs9d.R.iget(4777)==0&false))) {{
            __CLR4_4_13ny3nylc8azs9d.R.inc(4778);throw new IllegalArgumentException("Interval must not be null");
        }
        }__CLR4_4_13ny3nylc8azs9d.R.inc(4779);long startMillis = interval.getStartMillis();
        __CLR4_4_13ny3nylc8azs9d.R.inc(4780);long endMillis = interval.getEndMillis();
        __CLR4_4_13ny3nylc8azs9d.R.inc(4781);Chronology chrono = interval.getChronology();
        __CLR4_4_13ny3nylc8azs9d.R.inc(4782);super.setInterval(startMillis, endMillis, chrono);
    }finally{__CLR4_4_13ny3nylc8azs9d.R.flushNeeded();}}

    /**
     * Sets this interval from two instants, replacing the chronology with
     * that from the start instant.
     *
     * @param start  the start of the time interval
     * @param end  the start of the time interval
     * @throws IllegalArgumentException if the end is before the start
     */
    public void setInterval(ReadableInstant start, ReadableInstant end) {try{__CLR4_4_13ny3nylc8azs9d.R.inc(4783);
        __CLR4_4_13ny3nylc8azs9d.R.inc(4784);if ((((start == null && end == null)&&(__CLR4_4_13ny3nylc8azs9d.R.iget(4785)!=0|true))||(__CLR4_4_13ny3nylc8azs9d.R.iget(4786)==0&false))) {{
            __CLR4_4_13ny3nylc8azs9d.R.inc(4787);long now = DateTimeUtils.currentTimeMillis();
            __CLR4_4_13ny3nylc8azs9d.R.inc(4788);setInterval(now, now);
        } }else {{
            __CLR4_4_13ny3nylc8azs9d.R.inc(4789);long startMillis = DateTimeUtils.getInstantMillis(start);
            __CLR4_4_13ny3nylc8azs9d.R.inc(4790);long endMillis = DateTimeUtils.getInstantMillis(end);
            __CLR4_4_13ny3nylc8azs9d.R.inc(4791);Chronology chrono = DateTimeUtils.getInstantChronology(start);
            __CLR4_4_13ny3nylc8azs9d.R.inc(4792);super.setInterval(startMillis, endMillis, chrono);
        }
    }}finally{__CLR4_4_13ny3nylc8azs9d.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Sets the chronology of this time interval.
     *
     * @param chrono  the chronology to use, null means ISO default
     */
    public void setChronology(Chronology chrono) {try{__CLR4_4_13ny3nylc8azs9d.R.inc(4793);
        __CLR4_4_13ny3nylc8azs9d.R.inc(4794);super.setInterval(getStartMillis(), getEndMillis(), chrono);
    }finally{__CLR4_4_13ny3nylc8azs9d.R.flushNeeded();}}

    /**
     * Sets the start of this time interval.
     *
     * @param startInstant  the start of the time interval,
     *  millisecond instant from 1970-01-01T00:00:00Z
     * @throws IllegalArgumentException if the end is before the start
     */
    public void setStartMillis(long startInstant) {try{__CLR4_4_13ny3nylc8azs9d.R.inc(4795);
        __CLR4_4_13ny3nylc8azs9d.R.inc(4796);super.setInterval(startInstant, getEndMillis(), getChronology());
    }finally{__CLR4_4_13ny3nylc8azs9d.R.flushNeeded();}}

    /**
     * Sets the start of this time interval as an Instant.
     *
     * @param start  the start of the time interval, null means now
     * @throws IllegalArgumentException if the end is before the start
     */
    public void setStart(ReadableInstant start) {try{__CLR4_4_13ny3nylc8azs9d.R.inc(4797);
        __CLR4_4_13ny3nylc8azs9d.R.inc(4798);long startMillis = DateTimeUtils.getInstantMillis(start);
        __CLR4_4_13ny3nylc8azs9d.R.inc(4799);super.setInterval(startMillis, getEndMillis(), getChronology());
    }finally{__CLR4_4_13ny3nylc8azs9d.R.flushNeeded();}}

    /** 
     * Sets the end of this time interval.
     *
     * @param endInstant  the end of the time interval,
     *  millisecond instant from 1970-01-01T00:00:00Z
     * @throws IllegalArgumentException if the end is before the start
     */
    public void setEndMillis(long endInstant) {try{__CLR4_4_13ny3nylc8azs9d.R.inc(4800);
        __CLR4_4_13ny3nylc8azs9d.R.inc(4801);super.setInterval(getStartMillis(), endInstant, getChronology());
    }finally{__CLR4_4_13ny3nylc8azs9d.R.flushNeeded();}}

    /** 
     * Sets the end of this time interval as an Instant.
     *
     * @param end  the end of the time interval, null means now
     * @throws IllegalArgumentException if the end is before the start
     */
    public void setEnd(ReadableInstant end) {try{__CLR4_4_13ny3nylc8azs9d.R.inc(4802);
        __CLR4_4_13ny3nylc8azs9d.R.inc(4803);long endMillis = DateTimeUtils.getInstantMillis(end);
        __CLR4_4_13ny3nylc8azs9d.R.inc(4804);super.setInterval(getStartMillis(), endMillis, getChronology());
    }finally{__CLR4_4_13ny3nylc8azs9d.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Sets the duration of this time interval, preserving the start instant.
     *
     * @param duration  new duration for interval
     * @throws IllegalArgumentException if the end is before the start
     * @throws ArithmeticException if the end instant exceeds the capacity of a long
     */
    public void setDurationAfterStart(long duration) {try{__CLR4_4_13ny3nylc8azs9d.R.inc(4805);
        __CLR4_4_13ny3nylc8azs9d.R.inc(4806);setEndMillis(FieldUtils.safeAdd(getStartMillis(), duration));
    }finally{__CLR4_4_13ny3nylc8azs9d.R.flushNeeded();}}

    /**
     * Sets the duration of this time interval, preserving the end instant.
     *
     * @param duration  new duration for interval
     * @throws IllegalArgumentException if the end is before the start
     * @throws ArithmeticException if the start instant exceeds the capacity of a long
     */
    public void setDurationBeforeEnd(long duration) {try{__CLR4_4_13ny3nylc8azs9d.R.inc(4807);
        __CLR4_4_13ny3nylc8azs9d.R.inc(4808);setStartMillis(FieldUtils.safeAdd(getEndMillis(), -duration));
    }finally{__CLR4_4_13ny3nylc8azs9d.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Sets the duration of this time interval, preserving the start instant.
     *
     * @param duration  new duration for interval, null means zero length
     * @throws IllegalArgumentException if the end is before the start
     * @throws ArithmeticException if the end instant exceeds the capacity of a long
     */
    public void setDurationAfterStart(ReadableDuration duration) {try{__CLR4_4_13ny3nylc8azs9d.R.inc(4809);
        __CLR4_4_13ny3nylc8azs9d.R.inc(4810);long durationMillis = DateTimeUtils.getDurationMillis(duration);
        __CLR4_4_13ny3nylc8azs9d.R.inc(4811);setEndMillis(FieldUtils.safeAdd(getStartMillis(), durationMillis));
    }finally{__CLR4_4_13ny3nylc8azs9d.R.flushNeeded();}}

    /**
     * Sets the duration of this time interval, preserving the end instant.
     *
     * @param duration  new duration for interval, null means zero length
     * @throws IllegalArgumentException if the end is before the start
     * @throws ArithmeticException if the start instant exceeds the capacity of a long
     */
    public void setDurationBeforeEnd(ReadableDuration duration) {try{__CLR4_4_13ny3nylc8azs9d.R.inc(4812);
        __CLR4_4_13ny3nylc8azs9d.R.inc(4813);long durationMillis = DateTimeUtils.getDurationMillis(duration);
        __CLR4_4_13ny3nylc8azs9d.R.inc(4814);setStartMillis(FieldUtils.safeAdd(getEndMillis(), -durationMillis));
    }finally{__CLR4_4_13ny3nylc8azs9d.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Sets the period of this time interval, preserving the start instant
     * and using the ISOChronology in the default zone for calculations.
     *
     * @param period  new period for interval, null means zero length
     * @throws IllegalArgumentException if the end is before the start
     * @throws ArithmeticException if the end instant exceeds the capacity of a long
     */
    public void setPeriodAfterStart(ReadablePeriod period) {try{__CLR4_4_13ny3nylc8azs9d.R.inc(4815);
        __CLR4_4_13ny3nylc8azs9d.R.inc(4816);if ((((period == null)&&(__CLR4_4_13ny3nylc8azs9d.R.iget(4817)!=0|true))||(__CLR4_4_13ny3nylc8azs9d.R.iget(4818)==0&false))) {{
            __CLR4_4_13ny3nylc8azs9d.R.inc(4819);setEndMillis(getStartMillis());
        } }else {{
            __CLR4_4_13ny3nylc8azs9d.R.inc(4820);setEndMillis(getChronology().add(period, getStartMillis(), 1));
        }
    }}finally{__CLR4_4_13ny3nylc8azs9d.R.flushNeeded();}}

    /**
     * Sets the period of this time interval, preserving the end instant
     * and using the ISOChronology in the default zone for calculations.
     *
     * @param period  new period for interval, null means zero length
     * @throws IllegalArgumentException if the end is before the start
     * @throws ArithmeticException if the start instant exceeds the capacity of a long
     */
    public void setPeriodBeforeEnd(ReadablePeriod period) {try{__CLR4_4_13ny3nylc8azs9d.R.inc(4821);
        __CLR4_4_13ny3nylc8azs9d.R.inc(4822);if ((((period == null)&&(__CLR4_4_13ny3nylc8azs9d.R.iget(4823)!=0|true))||(__CLR4_4_13ny3nylc8azs9d.R.iget(4824)==0&false))) {{
            __CLR4_4_13ny3nylc8azs9d.R.inc(4825);setStartMillis(getEndMillis());
        } }else {{
            __CLR4_4_13ny3nylc8azs9d.R.inc(4826);setStartMillis(getChronology().add(period, getEndMillis(), -1));
        }
    }}finally{__CLR4_4_13ny3nylc8azs9d.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Clone this object without having to cast the returned object.
     *
     * @return a clone of the this object.
     */
    public MutableInterval copy() {try{__CLR4_4_13ny3nylc8azs9d.R.inc(4827);
        __CLR4_4_13ny3nylc8azs9d.R.inc(4828);return (MutableInterval) clone();
    }finally{__CLR4_4_13ny3nylc8azs9d.R.flushNeeded();}}

    /**
     * Clone this object.
     *
     * @return a clone of this object.
     */
    public Object clone() {try{__CLR4_4_13ny3nylc8azs9d.R.inc(4829);
        __CLR4_4_13ny3nylc8azs9d.R.inc(4830);try {
            __CLR4_4_13ny3nylc8azs9d.R.inc(4831);return super.clone();
        } catch (CloneNotSupportedException ex) {
            __CLR4_4_13ny3nylc8azs9d.R.inc(4832);throw new InternalError("Clone error");
        }
    }finally{__CLR4_4_13ny3nylc8azs9d.R.flushNeeded();}}

}
