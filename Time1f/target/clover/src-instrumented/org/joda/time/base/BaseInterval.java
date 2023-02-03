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
import org.joda.time.MutableInterval;
import org.joda.time.ReadWritableInterval;
import org.joda.time.ReadableDuration;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadableInterval;
import org.joda.time.ReadablePeriod;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.convert.ConverterManager;
import org.joda.time.convert.IntervalConverter;
import org.joda.time.field.FieldUtils;

/**
 * BaseInterval is an abstract implementation of ReadableInterval that stores
 * data in two <code>long</code> millisecond fields.
 * <p>
 * This class should generally not be used directly by API users.
 * The {@link ReadableInterval} interface should be used when different 
 * kinds of interval objects are to be referenced.
 * <p>
 * BaseInterval subclasses may be mutable and not thread-safe.
 *
 * @author Brian S O'Neill
 * @author Sean Geoghegan
 * @author Stephen Colebourne
 * @since 1.0
 */
public abstract class BaseInterval
        extends AbstractInterval
        implements ReadableInterval, Serializable {public static class __CLR4_4_15zi5zilc8azsos{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672271027956L,8589935092L,7844,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** Serialization version */
    private static final long serialVersionUID = 576586928732749278L;

    /** The chronology of the interval */
    private volatile Chronology iChronology;
    /** The start of the interval */
    private volatile long iStartMillis;
    /** The end of the interval */
    private volatile long iEndMillis;

    /**
     * Constructs an interval from a start and end instant.
     * 
     * @param startInstant  start of this interval, as milliseconds from 1970-01-01T00:00:00Z.
     * @param endInstant  end of this interval, as milliseconds from 1970-01-01T00:00:00Z.
     * @param chrono  the chronology to use, null is ISO default
     * @throws IllegalArgumentException if the end is before the start
     */
    protected BaseInterval(long startInstant, long endInstant, Chronology chrono) {
        super();__CLR4_4_15zi5zilc8azsos.R.inc(7759);try{__CLR4_4_15zi5zilc8azsos.R.inc(7758);
        __CLR4_4_15zi5zilc8azsos.R.inc(7760);iChronology = DateTimeUtils.getChronology(chrono);
        __CLR4_4_15zi5zilc8azsos.R.inc(7761);checkInterval(startInstant, endInstant);
        __CLR4_4_15zi5zilc8azsos.R.inc(7762);iStartMillis = startInstant;
        __CLR4_4_15zi5zilc8azsos.R.inc(7763);iEndMillis = endInstant;
    }finally{__CLR4_4_15zi5zilc8azsos.R.flushNeeded();}}

    /**
     * Constructs an interval from a start and end instant.
     * 
     * @param start  start of this interval, null means now
     * @param end  end of this interval, null means now
     * @throws IllegalArgumentException if the end is before the start
     */
    protected BaseInterval(ReadableInstant start, ReadableInstant end) {
        super();__CLR4_4_15zi5zilc8azsos.R.inc(7765);try{__CLR4_4_15zi5zilc8azsos.R.inc(7764);
        __CLR4_4_15zi5zilc8azsos.R.inc(7766);if ((((start == null && end == null)&&(__CLR4_4_15zi5zilc8azsos.R.iget(7767)!=0|true))||(__CLR4_4_15zi5zilc8azsos.R.iget(7768)==0&false))) {{
            __CLR4_4_15zi5zilc8azsos.R.inc(7769);iStartMillis = iEndMillis = DateTimeUtils.currentTimeMillis();
            __CLR4_4_15zi5zilc8azsos.R.inc(7770);iChronology = ISOChronology.getInstance();
        } }else {{
            __CLR4_4_15zi5zilc8azsos.R.inc(7771);iChronology = DateTimeUtils.getInstantChronology(start);
            __CLR4_4_15zi5zilc8azsos.R.inc(7772);iStartMillis = DateTimeUtils.getInstantMillis(start);
            __CLR4_4_15zi5zilc8azsos.R.inc(7773);iEndMillis = DateTimeUtils.getInstantMillis(end);
            __CLR4_4_15zi5zilc8azsos.R.inc(7774);checkInterval(iStartMillis, iEndMillis);
        }
    }}finally{__CLR4_4_15zi5zilc8azsos.R.flushNeeded();}}

    /**
     * Constructs an interval from a start instant and a duration.
     * 
     * @param start  start of this interval, null means now
     * @param duration  the duration of this interval, null means zero length
     * @throws IllegalArgumentException if the end is before the start
     * @throws ArithmeticException if the end instant exceeds the capacity of a long
     */
    protected BaseInterval(ReadableInstant start, ReadableDuration duration) {
        super();__CLR4_4_15zi5zilc8azsos.R.inc(7776);try{__CLR4_4_15zi5zilc8azsos.R.inc(7775);
        __CLR4_4_15zi5zilc8azsos.R.inc(7777);iChronology = DateTimeUtils.getInstantChronology(start);
        __CLR4_4_15zi5zilc8azsos.R.inc(7778);iStartMillis = DateTimeUtils.getInstantMillis(start);
        __CLR4_4_15zi5zilc8azsos.R.inc(7779);long durationMillis = DateTimeUtils.getDurationMillis(duration);
        __CLR4_4_15zi5zilc8azsos.R.inc(7780);iEndMillis = FieldUtils.safeAdd(iStartMillis, durationMillis);
        __CLR4_4_15zi5zilc8azsos.R.inc(7781);checkInterval(iStartMillis, iEndMillis);
    }finally{__CLR4_4_15zi5zilc8azsos.R.flushNeeded();}}

    /**
     * Constructs an interval from a millisecond duration and an end instant.
     * 
     * @param duration  the duration of this interval, null means zero length
     * @param end  end of this interval, null means now
     * @throws IllegalArgumentException if the end is before the start
     * @throws ArithmeticException if the start instant exceeds the capacity of a long
     */
    protected BaseInterval(ReadableDuration duration, ReadableInstant end) {
        super();__CLR4_4_15zi5zilc8azsos.R.inc(7783);try{__CLR4_4_15zi5zilc8azsos.R.inc(7782);
        __CLR4_4_15zi5zilc8azsos.R.inc(7784);iChronology = DateTimeUtils.getInstantChronology(end);
        __CLR4_4_15zi5zilc8azsos.R.inc(7785);iEndMillis = DateTimeUtils.getInstantMillis(end);
        __CLR4_4_15zi5zilc8azsos.R.inc(7786);long durationMillis = DateTimeUtils.getDurationMillis(duration);
        __CLR4_4_15zi5zilc8azsos.R.inc(7787);iStartMillis = FieldUtils.safeAdd(iEndMillis, -durationMillis);
        __CLR4_4_15zi5zilc8azsos.R.inc(7788);checkInterval(iStartMillis, iEndMillis);
    }finally{__CLR4_4_15zi5zilc8azsos.R.flushNeeded();}}

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
    protected BaseInterval(ReadableInstant start, ReadablePeriod period) {
        super();__CLR4_4_15zi5zilc8azsos.R.inc(7790);try{__CLR4_4_15zi5zilc8azsos.R.inc(7789);
        __CLR4_4_15zi5zilc8azsos.R.inc(7791);Chronology chrono = DateTimeUtils.getInstantChronology(start);
        __CLR4_4_15zi5zilc8azsos.R.inc(7792);iChronology = chrono;
        __CLR4_4_15zi5zilc8azsos.R.inc(7793);iStartMillis = DateTimeUtils.getInstantMillis(start);
        __CLR4_4_15zi5zilc8azsos.R.inc(7794);if ((((period == null)&&(__CLR4_4_15zi5zilc8azsos.R.iget(7795)!=0|true))||(__CLR4_4_15zi5zilc8azsos.R.iget(7796)==0&false))) {{
            __CLR4_4_15zi5zilc8azsos.R.inc(7797);iEndMillis = iStartMillis;
        } }else {{
            __CLR4_4_15zi5zilc8azsos.R.inc(7798);iEndMillis = chrono.add(period, iStartMillis, 1);
        }
        }__CLR4_4_15zi5zilc8azsos.R.inc(7799);checkInterval(iStartMillis, iEndMillis);
    }finally{__CLR4_4_15zi5zilc8azsos.R.flushNeeded();}}

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
    protected BaseInterval(ReadablePeriod period, ReadableInstant end) {
        super();__CLR4_4_15zi5zilc8azsos.R.inc(7801);try{__CLR4_4_15zi5zilc8azsos.R.inc(7800);
        __CLR4_4_15zi5zilc8azsos.R.inc(7802);Chronology chrono = DateTimeUtils.getInstantChronology(end);
        __CLR4_4_15zi5zilc8azsos.R.inc(7803);iChronology = chrono;
        __CLR4_4_15zi5zilc8azsos.R.inc(7804);iEndMillis = DateTimeUtils.getInstantMillis(end);
        __CLR4_4_15zi5zilc8azsos.R.inc(7805);if ((((period == null)&&(__CLR4_4_15zi5zilc8azsos.R.iget(7806)!=0|true))||(__CLR4_4_15zi5zilc8azsos.R.iget(7807)==0&false))) {{
            __CLR4_4_15zi5zilc8azsos.R.inc(7808);iStartMillis = iEndMillis;
        } }else {{
            __CLR4_4_15zi5zilc8azsos.R.inc(7809);iStartMillis = chrono.add(period, iEndMillis, -1);
        }
        }__CLR4_4_15zi5zilc8azsos.R.inc(7810);checkInterval(iStartMillis, iEndMillis);
    }finally{__CLR4_4_15zi5zilc8azsos.R.flushNeeded();}}

    /**
     * Constructs a time interval converting or copying from another object
     * that describes an interval.
     * 
     * @param interval  the time interval to copy
     * @param chrono  the chronology to use, null means let converter decide
     * @throws IllegalArgumentException if the interval is invalid
     */
    protected BaseInterval(Object interval, Chronology chrono) {
        super();__CLR4_4_15zi5zilc8azsos.R.inc(7812);try{__CLR4_4_15zi5zilc8azsos.R.inc(7811);
        __CLR4_4_15zi5zilc8azsos.R.inc(7813);IntervalConverter converter = ConverterManager.getInstance().getIntervalConverter(interval);
        __CLR4_4_15zi5zilc8azsos.R.inc(7814);if ((((converter.isReadableInterval(interval, chrono))&&(__CLR4_4_15zi5zilc8azsos.R.iget(7815)!=0|true))||(__CLR4_4_15zi5zilc8azsos.R.iget(7816)==0&false))) {{
            __CLR4_4_15zi5zilc8azsos.R.inc(7817);ReadableInterval input = (ReadableInterval) interval;
            __CLR4_4_15zi5zilc8azsos.R.inc(7818);iChronology = ((((chrono != null )&&(__CLR4_4_15zi5zilc8azsos.R.iget(7819)!=0|true))||(__CLR4_4_15zi5zilc8azsos.R.iget(7820)==0&false))? chrono : input.getChronology());
            __CLR4_4_15zi5zilc8azsos.R.inc(7821);iStartMillis = input.getStartMillis();
            __CLR4_4_15zi5zilc8azsos.R.inc(7822);iEndMillis = input.getEndMillis();
        } }else {__CLR4_4_15zi5zilc8azsos.R.inc(7823);if ((((this instanceof ReadWritableInterval)&&(__CLR4_4_15zi5zilc8azsos.R.iget(7824)!=0|true))||(__CLR4_4_15zi5zilc8azsos.R.iget(7825)==0&false))) {{
            __CLR4_4_15zi5zilc8azsos.R.inc(7826);converter.setInto((ReadWritableInterval) this, interval, chrono);
        } }else {{
            __CLR4_4_15zi5zilc8azsos.R.inc(7827);MutableInterval mi = new MutableInterval();
            __CLR4_4_15zi5zilc8azsos.R.inc(7828);converter.setInto(mi, interval, chrono);
            __CLR4_4_15zi5zilc8azsos.R.inc(7829);iChronology = mi.getChronology();
            __CLR4_4_15zi5zilc8azsos.R.inc(7830);iStartMillis = mi.getStartMillis();
            __CLR4_4_15zi5zilc8azsos.R.inc(7831);iEndMillis = mi.getEndMillis();
        }
        }}__CLR4_4_15zi5zilc8azsos.R.inc(7832);checkInterval(iStartMillis, iEndMillis);
    }finally{__CLR4_4_15zi5zilc8azsos.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Gets the chronology of this interval.
     *
     * @return the chronology
     */
    public Chronology getChronology() {try{__CLR4_4_15zi5zilc8azsos.R.inc(7833);
        __CLR4_4_15zi5zilc8azsos.R.inc(7834);return iChronology;
    }finally{__CLR4_4_15zi5zilc8azsos.R.flushNeeded();}}

    /**
     * Gets the start of this time interval which is inclusive.
     *
     * @return the start of the time interval,
     *  millisecond instant from 1970-01-01T00:00:00Z
     */
    public long getStartMillis() {try{__CLR4_4_15zi5zilc8azsos.R.inc(7835);
        __CLR4_4_15zi5zilc8azsos.R.inc(7836);return iStartMillis;
    }finally{__CLR4_4_15zi5zilc8azsos.R.flushNeeded();}}

    /**
     * Gets the end of this time interval which is exclusive.
     *
     * @return the end of the time interval,
     *  millisecond instant from 1970-01-01T00:00:00Z
     */
    public long getEndMillis() {try{__CLR4_4_15zi5zilc8azsos.R.inc(7837);
        __CLR4_4_15zi5zilc8azsos.R.inc(7838);return iEndMillis;
    }finally{__CLR4_4_15zi5zilc8azsos.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Sets this interval from two millisecond instants and a chronology.
     *
     * @param startInstant  the start of the time interval
     * @param endInstant  the start of the time interval
     * @param chrono  the chronology, not null
     * @throws IllegalArgumentException if the end is before the start
     */
    protected void setInterval(long startInstant, long endInstant, Chronology chrono) {try{__CLR4_4_15zi5zilc8azsos.R.inc(7839);
        __CLR4_4_15zi5zilc8azsos.R.inc(7840);checkInterval(startInstant, endInstant);
        __CLR4_4_15zi5zilc8azsos.R.inc(7841);iStartMillis = startInstant;
        __CLR4_4_15zi5zilc8azsos.R.inc(7842);iEndMillis = endInstant;
        __CLR4_4_15zi5zilc8azsos.R.inc(7843);iChronology = DateTimeUtils.getChronology(chrono);
    }finally{__CLR4_4_15zi5zilc8azsos.R.flushNeeded();}}

}
