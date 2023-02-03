/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 *  Copyright 2001-2006 Stephen Colebourne
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
import org.joda.time.chrono.ISOChronology;
import org.joda.time.format.ISODateTimeFormat;
import org.joda.time.format.ISOPeriodFormat;

/**
 * Interval is the standard implementation of an immutable time interval.
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
 * Interval is thread-safe and immutable.
 *
 * @author Brian S O'Neill
 * @author Sean Geoghegan
 * @author Stephen Colebourne
 * @author Julen Parra
 * @since 1.0
 */
public final class Interval
        extends BaseInterval
        implements ReadableInterval, Serializable {public static class __CLR4_4_11tk1tklc8azryx{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672271027956L,8589935092L,2477,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** Serialization version */
    private static final long serialVersionUID = 4922451897541386752L;

    //-----------------------------------------------------------------------
    /**
     * Parses a {@code Interval} from the specified string.
     * <p>
     * The String formats are described by {@link ISODateTimeFormat#dateTimeParser()}
     * and {@link ISOPeriodFormat#standard()}, and may be 'datetime/datetime',
     * 'datetime/period' or 'period/datetime'.
     * 
     * @param str  the string to parse, not null
     * @since 2.0
     */
    public static Interval parse(String str) {try{__CLR4_4_11tk1tklc8azryx.R.inc(2360);
        __CLR4_4_11tk1tklc8azryx.R.inc(2361);return new Interval(str);
    }finally{__CLR4_4_11tk1tklc8azryx.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Constructs an interval from a start and end instant with the ISO
     * default chronology in the default time zone.
     * 
     * @param startInstant  start of this interval, as milliseconds from 1970-01-01T00:00:00Z.
     * @param endInstant  end of this interval, as milliseconds from 1970-01-01T00:00:00Z.
     * @throws IllegalArgumentException if the end is before the start
     */
    public Interval(long startInstant, long endInstant) {
        super(startInstant, endInstant, null);__CLR4_4_11tk1tklc8azryx.R.inc(2363);try{__CLR4_4_11tk1tklc8azryx.R.inc(2362);
    }finally{__CLR4_4_11tk1tklc8azryx.R.flushNeeded();}}

    /**
     * Constructs an interval from a start and end instant with the ISO
     * default chronology in the specified time zone.
     * 
     * @param startInstant  start of this interval, as milliseconds from 1970-01-01T00:00:00Z.
     * @param endInstant  end of this interval, as milliseconds from 1970-01-01T00:00:00Z.
     * @param zone  the time zone to use, null means default zone
     * @throws IllegalArgumentException if the end is before the start
     * @since 1.5
     */
    public Interval(long startInstant, long endInstant, DateTimeZone zone) {
        super(startInstant, endInstant, ISOChronology.getInstance(zone));__CLR4_4_11tk1tklc8azryx.R.inc(2365);try{__CLR4_4_11tk1tklc8azryx.R.inc(2364);
    }finally{__CLR4_4_11tk1tklc8azryx.R.flushNeeded();}}

    /**
     * Constructs an interval from a start and end instant with the
     * specified chronology.
     * 
     * @param chronology  the chronology to use, null is ISO default
     * @param startInstant  start of this interval, as milliseconds from 1970-01-01T00:00:00Z.
     * @param endInstant  end of this interval, as milliseconds from 1970-01-01T00:00:00Z.
     * @throws IllegalArgumentException if the end is before the start
     */
    public Interval(long startInstant, long endInstant, Chronology chronology) {
        super(startInstant, endInstant, chronology);__CLR4_4_11tk1tklc8azryx.R.inc(2367);try{__CLR4_4_11tk1tklc8azryx.R.inc(2366);
    }finally{__CLR4_4_11tk1tklc8azryx.R.flushNeeded();}}

    /**
     * Constructs an interval from a start and end instant.
     * <p>
     * The chronology used is that of the start instant.
     * 
     * @param start  start of this interval, null means now
     * @param end  end of this interval, null means now
     * @throws IllegalArgumentException if the end is before the start
     */
    public Interval(ReadableInstant start, ReadableInstant end) {
        super(start, end);__CLR4_4_11tk1tklc8azryx.R.inc(2369);try{__CLR4_4_11tk1tklc8azryx.R.inc(2368);
    }finally{__CLR4_4_11tk1tklc8azryx.R.flushNeeded();}}

    /**
     * Constructs an interval from a start instant and a duration.
     * 
     * @param start  start of this interval, null means now
     * @param duration  the duration of this interval, null means zero length
     * @throws IllegalArgumentException if the end is before the start
     * @throws ArithmeticException if the end instant exceeds the capacity of a long
     */
    public Interval(ReadableInstant start, ReadableDuration duration) {
        super(start, duration);__CLR4_4_11tk1tklc8azryx.R.inc(2371);try{__CLR4_4_11tk1tklc8azryx.R.inc(2370);
    }finally{__CLR4_4_11tk1tklc8azryx.R.flushNeeded();}}

    /**
     * Constructs an interval from a millisecond duration and an end instant.
     * 
     * @param duration  the duration of this interval, null means zero length
     * @param end  end of this interval, null means now
     * @throws IllegalArgumentException if the end is before the start
     * @throws ArithmeticException if the start instant exceeds the capacity of a long
     */
    public Interval(ReadableDuration duration, ReadableInstant end) {
        super(duration, end);__CLR4_4_11tk1tklc8azryx.R.inc(2373);try{__CLR4_4_11tk1tklc8azryx.R.inc(2372);
    }finally{__CLR4_4_11tk1tklc8azryx.R.flushNeeded();}}

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
    public Interval(ReadableInstant start, ReadablePeriod period) {
        super(start, period);__CLR4_4_11tk1tklc8azryx.R.inc(2375);try{__CLR4_4_11tk1tklc8azryx.R.inc(2374);
    }finally{__CLR4_4_11tk1tklc8azryx.R.flushNeeded();}}

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
    public Interval(ReadablePeriod period, ReadableInstant end) {
        super(period, end);__CLR4_4_11tk1tklc8azryx.R.inc(2377);try{__CLR4_4_11tk1tklc8azryx.R.inc(2376);
    }finally{__CLR4_4_11tk1tklc8azryx.R.flushNeeded();}}

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
    public Interval(Object interval) {
        super(interval, null);__CLR4_4_11tk1tklc8azryx.R.inc(2379);try{__CLR4_4_11tk1tklc8azryx.R.inc(2378);
    }finally{__CLR4_4_11tk1tklc8azryx.R.flushNeeded();}}

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
    public Interval(Object interval, Chronology chronology) {
        super(interval, chronology);__CLR4_4_11tk1tklc8azryx.R.inc(2381);try{__CLR4_4_11tk1tklc8azryx.R.inc(2380);
    }finally{__CLR4_4_11tk1tklc8azryx.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Get this interval as an immutable <code>Interval</code> object
     * by returning <code>this</code>.
     *
     * @return <code>this</code>
     */
    public Interval toInterval() {try{__CLR4_4_11tk1tklc8azryx.R.inc(2382);
        __CLR4_4_11tk1tklc8azryx.R.inc(2383);return this;
    }finally{__CLR4_4_11tk1tklc8azryx.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Gets the overlap between this interval and another interval.
     * <p>
     * Intervals are inclusive of the start instant and exclusive of the end.
     * An interval overlaps another if it shares some common part of the
     * datetime continuum. This method returns the amount of the overlap,
     * only if the intervals actually do overlap.
     * If the intervals do not overlap, then null is returned.
     * <p>
     * When two intervals are compared the result is one of three states:
     * (a) they abut, (b) there is a gap between them, (c) they overlap.
     * The abuts state takes precedence over the other two, thus a zero duration
     * interval at the start of a larger interval abuts and does not overlap.
     * <p>
     * The chronology of the returned interval is the same as that of
     * this interval (the chronology of the interval parameter is not used).
     * Note that the use of the chronology was only correctly implemented
     * in version 1.3.
     *
     * @param interval  the interval to examine, null means now
     * @return the overlap interval, null if no overlap
     * @since 1.1
     */
    public Interval overlap(ReadableInterval interval) {try{__CLR4_4_11tk1tklc8azryx.R.inc(2384);
        __CLR4_4_11tk1tklc8azryx.R.inc(2385);interval = DateTimeUtils.getReadableInterval(interval);
        __CLR4_4_11tk1tklc8azryx.R.inc(2386);if ((((overlaps(interval) == false)&&(__CLR4_4_11tk1tklc8azryx.R.iget(2387)!=0|true))||(__CLR4_4_11tk1tklc8azryx.R.iget(2388)==0&false))) {{
            __CLR4_4_11tk1tklc8azryx.R.inc(2389);return null;
        }
        }__CLR4_4_11tk1tklc8azryx.R.inc(2390);long start = Math.max(getStartMillis(), interval.getStartMillis());
        __CLR4_4_11tk1tklc8azryx.R.inc(2391);long end = Math.min(getEndMillis(), interval.getEndMillis());
        __CLR4_4_11tk1tklc8azryx.R.inc(2392);return new Interval(start, end, getChronology());
    }finally{__CLR4_4_11tk1tklc8azryx.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Gets the gap between this interval and another interval.
     * The other interval can be either before or after this interval.
     * <p>
     * Intervals are inclusive of the start instant and exclusive of the end.
     * An interval has a gap to another interval if there is a non-zero
     * duration between them. This method returns the amount of the gap only
     * if the intervals do actually have a gap between them.
     * If the intervals overlap or abut, then null is returned.
     * <p>
     * When two intervals are compared the result is one of three states:
     * (a) they abut, (b) there is a gap between them, (c) they overlap.
     * The abuts state takes precedence over the other two, thus a zero duration
     * interval at the start of a larger interval abuts and does not overlap.
     * <p>
     * The chronology of the returned interval is the same as that of
     * this interval (the chronology of the interval parameter is not used).
     * Note that the use of the chronology was only correctly implemented
     * in version 1.3.
     *
     * @param interval  the interval to examine, null means now
     * @return the gap interval, null if no gap
     * @since 1.1
     */
    public Interval gap(ReadableInterval interval) {try{__CLR4_4_11tk1tklc8azryx.R.inc(2393);
        __CLR4_4_11tk1tklc8azryx.R.inc(2394);interval = DateTimeUtils.getReadableInterval(interval);
        __CLR4_4_11tk1tklc8azryx.R.inc(2395);long otherStart = interval.getStartMillis();
        __CLR4_4_11tk1tklc8azryx.R.inc(2396);long otherEnd = interval.getEndMillis();
        __CLR4_4_11tk1tklc8azryx.R.inc(2397);long thisStart = getStartMillis();
        __CLR4_4_11tk1tklc8azryx.R.inc(2398);long thisEnd = getEndMillis();
        __CLR4_4_11tk1tklc8azryx.R.inc(2399);if ((((thisStart > otherEnd)&&(__CLR4_4_11tk1tklc8azryx.R.iget(2400)!=0|true))||(__CLR4_4_11tk1tklc8azryx.R.iget(2401)==0&false))) {{
            __CLR4_4_11tk1tklc8azryx.R.inc(2402);return new Interval(otherEnd, thisStart, getChronology());
        } }else {__CLR4_4_11tk1tklc8azryx.R.inc(2403);if ((((otherStart > thisEnd)&&(__CLR4_4_11tk1tklc8azryx.R.iget(2404)!=0|true))||(__CLR4_4_11tk1tklc8azryx.R.iget(2405)==0&false))) {{
            __CLR4_4_11tk1tklc8azryx.R.inc(2406);return new Interval(thisEnd, otherStart, getChronology());
        } }else {{
            __CLR4_4_11tk1tklc8azryx.R.inc(2407);return null;
        }
    }}}finally{__CLR4_4_11tk1tklc8azryx.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Does this interval abut with the interval specified.
     * <p>
     * Intervals are inclusive of the start instant and exclusive of the end.
     * An interval abuts if it starts immediately after, or ends immediately
     * before this interval without overlap.
     * A zero duration interval abuts with itself.
     * <p>
     * When two intervals are compared the result is one of three states:
     * (a) they abut, (b) there is a gap between them, (c) they overlap.
     * The abuts state takes precedence over the other two, thus a zero duration
     * interval at the start of a larger interval abuts and does not overlap.
     * <p>
     * For example:
     * <pre>
     * [09:00 to 10:00) abuts [08:00 to 08:30)  = false (completely before)
     * [09:00 to 10:00) abuts [08:00 to 09:00)  = true
     * [09:00 to 10:00) abuts [08:00 to 09:01)  = false (overlaps)
     * 
     * [09:00 to 10:00) abuts [09:00 to 09:00)  = true
     * [09:00 to 10:00) abuts [09:00 to 09:01)  = false (overlaps)
     * 
     * [09:00 to 10:00) abuts [10:00 to 10:00)  = true
     * [09:00 to 10:00) abuts [10:00 to 10:30)  = true
     * 
     * [09:00 to 10:00) abuts [10:30 to 11:00)  = false (completely after)
     * 
     * [14:00 to 14:00) abuts [14:00 to 14:00)  = true
     * [14:00 to 14:00) abuts [14:00 to 15:00)  = true
     * [14:00 to 14:00) abuts [13:00 to 14:00)  = true
     * </pre>
     *
     * @param interval  the interval to examine, null means now
     * @return true if the interval abuts
     * @since 1.1
     */
    public boolean abuts(ReadableInterval interval) {try{__CLR4_4_11tk1tklc8azryx.R.inc(2408);
        __CLR4_4_11tk1tklc8azryx.R.inc(2409);if ((((interval == null)&&(__CLR4_4_11tk1tklc8azryx.R.iget(2410)!=0|true))||(__CLR4_4_11tk1tklc8azryx.R.iget(2411)==0&false))) {{
            __CLR4_4_11tk1tklc8azryx.R.inc(2412);long now = DateTimeUtils.currentTimeMillis();
            __CLR4_4_11tk1tklc8azryx.R.inc(2413);return (getStartMillis() == now || getEndMillis() == now);
        } }else {{
            __CLR4_4_11tk1tklc8azryx.R.inc(2414);return (interval.getEndMillis() == getStartMillis() ||
                    getEndMillis() == interval.getStartMillis());
        }
    }}finally{__CLR4_4_11tk1tklc8azryx.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Creates a new interval with the same start and end, but a different chronology.
     *
     * @param chronology  the chronology to use, null means ISO default
     * @return an interval with a different chronology
     */
    public Interval withChronology(Chronology chronology) {try{__CLR4_4_11tk1tklc8azryx.R.inc(2415);
        __CLR4_4_11tk1tklc8azryx.R.inc(2416);if ((((getChronology() == chronology)&&(__CLR4_4_11tk1tklc8azryx.R.iget(2417)!=0|true))||(__CLR4_4_11tk1tklc8azryx.R.iget(2418)==0&false))) {{
            __CLR4_4_11tk1tklc8azryx.R.inc(2419);return this;
        }
        }__CLR4_4_11tk1tklc8azryx.R.inc(2420);return new Interval(getStartMillis(), getEndMillis(), chronology);
    }finally{__CLR4_4_11tk1tklc8azryx.R.flushNeeded();}}

    /**
     * Creates a new interval with the specified start millisecond instant.
     *
     * @param startInstant  the start instant for the new interval
     * @return an interval with the end from this interval and the specified start
     * @throws IllegalArgumentException if the resulting interval has end before start
     */
    public Interval withStartMillis(long startInstant) {try{__CLR4_4_11tk1tklc8azryx.R.inc(2421);
        __CLR4_4_11tk1tklc8azryx.R.inc(2422);if ((((startInstant == getStartMillis())&&(__CLR4_4_11tk1tklc8azryx.R.iget(2423)!=0|true))||(__CLR4_4_11tk1tklc8azryx.R.iget(2424)==0&false))) {{
            __CLR4_4_11tk1tklc8azryx.R.inc(2425);return this;
        }
        }__CLR4_4_11tk1tklc8azryx.R.inc(2426);return new Interval(startInstant, getEndMillis(), getChronology());
    }finally{__CLR4_4_11tk1tklc8azryx.R.flushNeeded();}}

    /**
     * Creates a new interval with the specified start instant.
     *
     * @param start  the start instant for the new interval, null means now
     * @return an interval with the end from this interval and the specified start
     * @throws IllegalArgumentException if the resulting interval has end before start
     */
    public Interval withStart(ReadableInstant start) {try{__CLR4_4_11tk1tklc8azryx.R.inc(2427);
        __CLR4_4_11tk1tklc8azryx.R.inc(2428);long startMillis = DateTimeUtils.getInstantMillis(start);
        __CLR4_4_11tk1tklc8azryx.R.inc(2429);return withStartMillis(startMillis);
    }finally{__CLR4_4_11tk1tklc8azryx.R.flushNeeded();}}

    /**
     * Creates a new interval with the specified start millisecond instant.
     *
     * @param endInstant  the end instant for the new interval
     * @return an interval with the start from this interval and the specified end
     * @throws IllegalArgumentException if the resulting interval has end before start
     */
    public Interval withEndMillis(long endInstant) {try{__CLR4_4_11tk1tklc8azryx.R.inc(2430);
        __CLR4_4_11tk1tklc8azryx.R.inc(2431);if ((((endInstant == getEndMillis())&&(__CLR4_4_11tk1tklc8azryx.R.iget(2432)!=0|true))||(__CLR4_4_11tk1tklc8azryx.R.iget(2433)==0&false))) {{
            __CLR4_4_11tk1tklc8azryx.R.inc(2434);return this;
        }
        }__CLR4_4_11tk1tklc8azryx.R.inc(2435);return new Interval(getStartMillis(), endInstant, getChronology());
    }finally{__CLR4_4_11tk1tklc8azryx.R.flushNeeded();}}

    /**
     * Creates a new interval with the specified end instant.
     *
     * @param end  the end instant for the new interval, null means now
     * @return an interval with the start from this interval and the specified end
     * @throws IllegalArgumentException if the resulting interval has end before start
     */
    public Interval withEnd(ReadableInstant end) {try{__CLR4_4_11tk1tklc8azryx.R.inc(2436);
        __CLR4_4_11tk1tklc8azryx.R.inc(2437);long endMillis = DateTimeUtils.getInstantMillis(end);
        __CLR4_4_11tk1tklc8azryx.R.inc(2438);return withEndMillis(endMillis);
    }finally{__CLR4_4_11tk1tklc8azryx.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Creates a new interval with the specified duration after the start instant.
     *
     * @param duration  the duration to add to the start to get the new end instant, null means zero
     * @return an interval with the start from this interval and a calculated end
     * @throws IllegalArgumentException if the duration is negative
     */
    public Interval withDurationAfterStart(ReadableDuration duration) {try{__CLR4_4_11tk1tklc8azryx.R.inc(2439);
        __CLR4_4_11tk1tklc8azryx.R.inc(2440);long durationMillis = DateTimeUtils.getDurationMillis(duration);
        __CLR4_4_11tk1tklc8azryx.R.inc(2441);if ((((durationMillis == toDurationMillis())&&(__CLR4_4_11tk1tklc8azryx.R.iget(2442)!=0|true))||(__CLR4_4_11tk1tklc8azryx.R.iget(2443)==0&false))) {{
            __CLR4_4_11tk1tklc8azryx.R.inc(2444);return this;
        }
        }__CLR4_4_11tk1tklc8azryx.R.inc(2445);Chronology chrono = getChronology();
        __CLR4_4_11tk1tklc8azryx.R.inc(2446);long startMillis = getStartMillis();
        __CLR4_4_11tk1tklc8azryx.R.inc(2447);long endMillis = chrono.add(startMillis, durationMillis, 1);
        __CLR4_4_11tk1tklc8azryx.R.inc(2448);return new Interval(startMillis, endMillis, chrono);
    }finally{__CLR4_4_11tk1tklc8azryx.R.flushNeeded();}}

    /**
     * Creates a new interval with the specified duration before the end instant.
     *
     * @param duration  the duration to add to the start to get the new end instant, null means zero
     * @return an interval with the start from this interval and a calculated end
     * @throws IllegalArgumentException if the duration is negative
     */
    public Interval withDurationBeforeEnd(ReadableDuration duration) {try{__CLR4_4_11tk1tklc8azryx.R.inc(2449);
        __CLR4_4_11tk1tklc8azryx.R.inc(2450);long durationMillis = DateTimeUtils.getDurationMillis(duration);
        __CLR4_4_11tk1tklc8azryx.R.inc(2451);if ((((durationMillis == toDurationMillis())&&(__CLR4_4_11tk1tklc8azryx.R.iget(2452)!=0|true))||(__CLR4_4_11tk1tklc8azryx.R.iget(2453)==0&false))) {{
            __CLR4_4_11tk1tklc8azryx.R.inc(2454);return this;
        }
        }__CLR4_4_11tk1tklc8azryx.R.inc(2455);Chronology chrono = getChronology();
        __CLR4_4_11tk1tklc8azryx.R.inc(2456);long endMillis = getEndMillis();
        __CLR4_4_11tk1tklc8azryx.R.inc(2457);long startMillis = chrono.add(endMillis, durationMillis, -1);
        __CLR4_4_11tk1tklc8azryx.R.inc(2458);return new Interval(startMillis, endMillis, chrono);
    }finally{__CLR4_4_11tk1tklc8azryx.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Creates a new interval with the specified period after the start instant.
     *
     * @param period  the period to add to the start to get the new end instant, null means zero
     * @return an interval with the start from this interval and a calculated end
     * @throws IllegalArgumentException if the period is negative
     */
    public Interval withPeriodAfterStart(ReadablePeriod period) {try{__CLR4_4_11tk1tklc8azryx.R.inc(2459);
        __CLR4_4_11tk1tklc8azryx.R.inc(2460);if ((((period == null)&&(__CLR4_4_11tk1tklc8azryx.R.iget(2461)!=0|true))||(__CLR4_4_11tk1tklc8azryx.R.iget(2462)==0&false))) {{
            __CLR4_4_11tk1tklc8azryx.R.inc(2463);return withDurationAfterStart(null);
        }
        }__CLR4_4_11tk1tklc8azryx.R.inc(2464);Chronology chrono = getChronology();
        __CLR4_4_11tk1tklc8azryx.R.inc(2465);long startMillis = getStartMillis();
        __CLR4_4_11tk1tklc8azryx.R.inc(2466);long endMillis = chrono.add(period, startMillis, 1);
        __CLR4_4_11tk1tklc8azryx.R.inc(2467);return new Interval(startMillis, endMillis, chrono);
    }finally{__CLR4_4_11tk1tklc8azryx.R.flushNeeded();}}

    /**
     * Creates a new interval with the specified period before the end instant.
     *
     * @param period  the period to add to the start to get the new end instant, null means zero
     * @return an interval with the start from this interval and a calculated end
     * @throws IllegalArgumentException if the period is negative
     */
    public Interval withPeriodBeforeEnd(ReadablePeriod period) {try{__CLR4_4_11tk1tklc8azryx.R.inc(2468);
        __CLR4_4_11tk1tklc8azryx.R.inc(2469);if ((((period == null)&&(__CLR4_4_11tk1tklc8azryx.R.iget(2470)!=0|true))||(__CLR4_4_11tk1tklc8azryx.R.iget(2471)==0&false))) {{
            __CLR4_4_11tk1tklc8azryx.R.inc(2472);return withDurationBeforeEnd(null);
        }
        }__CLR4_4_11tk1tklc8azryx.R.inc(2473);Chronology chrono = getChronology();
        __CLR4_4_11tk1tklc8azryx.R.inc(2474);long endMillis = getEndMillis();
        __CLR4_4_11tk1tklc8azryx.R.inc(2475);long startMillis = chrono.add(period, endMillis, -1);
        __CLR4_4_11tk1tklc8azryx.R.inc(2476);return new Interval(startMillis, endMillis, chrono);
    }finally{__CLR4_4_11tk1tklc8azryx.R.flushNeeded();}}

}
