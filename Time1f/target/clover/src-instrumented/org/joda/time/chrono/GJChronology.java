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
package org.joda.time.chrono;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

import org.joda.time.Chronology;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeUtils;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationField;
import org.joda.time.IllegalFieldValueException;
import org.joda.time.Instant;
import org.joda.time.LocalDate;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadablePartial;
import org.joda.time.field.BaseDateTimeField;
import org.joda.time.field.DecoratedDurationField;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.ISODateTimeFormat;

/**
 * Implements the Gregorian/Julian calendar system which is the calendar system
 * used in most of the world. Wherever possible, it is recommended to use the
 * {@link ISOChronology} instead.
 * <p>
 * The Gregorian calendar replaced the Julian calendar, and the point in time
 * when this chronology switches can be controlled using the second parameter
 * of the getInstance method. By default this cutover is set to the date the
 * Gregorian calendar was first instituted, October 15, 1582.
 * <p>
 * Before this date, this chronology uses the proleptic Julian calendar
 * (proleptic means extending indefinitely). The Julian calendar has leap years
 * every four years, whereas the Gregorian has special rules for 100 and 400
 * years. A meaningful result will thus be obtained for all input values.
 * However before 8 CE, Julian leap years were irregular, and before 45 BCE
 * there was no Julian calendar.
 * <p>
 * This chronology differs from
 * {@link java.util.GregorianCalendar GregorianCalendar} in that years
 * in BCE are returned correctly. Thus year 1 BCE is returned as -1 instead of 1.
 * The yearOfEra field produces results compatible with GregorianCalendar.
 * <p>
 * The Julian calendar does not have a year zero, and so year -1 is followed by
 * year 1. If the Gregorian cutover date is specified at or before year -1
 * (Julian), year zero is defined. In other words, the proleptic Gregorian
 * chronology used by this class has a year zero.
 * <p>
 * To create a pure proleptic Julian chronology, use {@link JulianChronology},
 * and to create a pure proleptic Gregorian chronology, use
 * {@link GregorianChronology}.
 * <p>
 * GJChronology is thread-safe and immutable.
 * 
 * @author Brian S O'Neill
 * @author Stephen Colebourne
 * @since 1.0
 */
public final class GJChronology extends AssembledChronology {public static class __CLR4_4_17r87r8lc8azsxd{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672271027956L,8589935092L,10646,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** Serialization lock */
    private static final long serialVersionUID = -2545574827706931671L;

    /**
     * Convert a datetime from one chronology to another.
     */
    private static long convertByYear(long instant, Chronology from, Chronology to) {try{__CLR4_4_17r87r8lc8azsxd.R.inc(10052);
        __CLR4_4_17r87r8lc8azsxd.R.inc(10053);return to.getDateTimeMillis
            (from.year().get(instant),
             from.monthOfYear().get(instant),
             from.dayOfMonth().get(instant),
             from.millisOfDay().get(instant));
    }finally{__CLR4_4_17r87r8lc8azsxd.R.flushNeeded();}}

    /**
     * Convert a datetime from one chronology to another.
     */
    private static long convertByWeekyear(final long instant, Chronology from, Chronology to) {try{__CLR4_4_17r87r8lc8azsxd.R.inc(10054);
        __CLR4_4_17r87r8lc8azsxd.R.inc(10055);long newInstant;
        __CLR4_4_17r87r8lc8azsxd.R.inc(10056);newInstant = to.weekyear().set(0, from.weekyear().get(instant));
        __CLR4_4_17r87r8lc8azsxd.R.inc(10057);newInstant = to.weekOfWeekyear().set(newInstant, from.weekOfWeekyear().get(instant));
        __CLR4_4_17r87r8lc8azsxd.R.inc(10058);newInstant = to.dayOfWeek().set(newInstant, from.dayOfWeek().get(instant));
        __CLR4_4_17r87r8lc8azsxd.R.inc(10059);newInstant = to.millisOfDay().set(newInstant, from.millisOfDay().get(instant));
        __CLR4_4_17r87r8lc8azsxd.R.inc(10060);return newInstant;
    }finally{__CLR4_4_17r87r8lc8azsxd.R.flushNeeded();}}

    /**
     * The default GregorianJulian cutover point.
     */
    static final Instant DEFAULT_CUTOVER = new Instant(-12219292800000L);

    /** Cache of zone to chronology list */
    private static final Map<DateTimeZone, ArrayList<GJChronology>> cCache = new HashMap<DateTimeZone, ArrayList<GJChronology>>();

    /**
     * Factory method returns instances of the default GJ cutover
     * chronology. This uses a cutover date of October 15, 1582 (Gregorian)
     * 00:00:00 UTC. For this value, October 4, 1582 (Julian) is followed by
     * October 15, 1582 (Gregorian).
     *
     * <p>The first day of the week is designated to be
     * {@link org.joda.time.DateTimeConstants#MONDAY Monday},
     * and the minimum days in the first week of the year is 4.
     *
     * <p>The time zone of the returned instance is UTC.
     */
    public static GJChronology getInstanceUTC() {try{__CLR4_4_17r87r8lc8azsxd.R.inc(10061);
        __CLR4_4_17r87r8lc8azsxd.R.inc(10062);return getInstance(DateTimeZone.UTC, DEFAULT_CUTOVER, 4);
    }finally{__CLR4_4_17r87r8lc8azsxd.R.flushNeeded();}}

    /**
     * Factory method returns instances of the default GJ cutover
     * chronology. This uses a cutover date of October 15, 1582 (Gregorian)
     * 00:00:00 UTC. For this value, October 4, 1582 (Julian) is followed by
     * October 15, 1582 (Gregorian).
     *
     * <p>The first day of the week is designated to be
     * {@link org.joda.time.DateTimeConstants#MONDAY Monday},
     * and the minimum days in the first week of the year is 4.
     *
     * <p>The returned chronology is in the default time zone.
     */
    public static GJChronology getInstance() {try{__CLR4_4_17r87r8lc8azsxd.R.inc(10063);
        __CLR4_4_17r87r8lc8azsxd.R.inc(10064);return getInstance(DateTimeZone.getDefault(), DEFAULT_CUTOVER, 4);
    }finally{__CLR4_4_17r87r8lc8azsxd.R.flushNeeded();}}

    /**
     * Factory method returns instances of the GJ cutover chronology. This uses
     * a cutover date of October 15, 1582 (Gregorian) 00:00:00 UTC. For this
     * value, October 4, 1582 (Julian) is followed by October 15, 1582
     * (Gregorian).
     *
     * <p>The first day of the week is designated to be
     * {@link org.joda.time.DateTimeConstants#MONDAY Monday},
     * and the minimum days in the first week of the year is 4.
     *
     * @param zone  the time zone to use, null is default
     */
    public static GJChronology getInstance(DateTimeZone zone) {try{__CLR4_4_17r87r8lc8azsxd.R.inc(10065);
        __CLR4_4_17r87r8lc8azsxd.R.inc(10066);return getInstance(zone, DEFAULT_CUTOVER, 4);
    }finally{__CLR4_4_17r87r8lc8azsxd.R.flushNeeded();}}

    /**
     * Factory method returns instances of the GJ cutover chronology. Any
     * cutover date may be specified.
     *
     * <p>The first day of the week is designated to be
     * {@link org.joda.time.DateTimeConstants#MONDAY Monday},
     * and the minimum days in the first week of the year is 4.
     *
     * @param zone  the time zone to use, null is default
     * @param gregorianCutover  the cutover to use, null means default
     */
    public static GJChronology getInstance(
            DateTimeZone zone,
            ReadableInstant gregorianCutover) {try{__CLR4_4_17r87r8lc8azsxd.R.inc(10067);
        
        __CLR4_4_17r87r8lc8azsxd.R.inc(10068);return getInstance(zone, gregorianCutover, 4);
    }finally{__CLR4_4_17r87r8lc8azsxd.R.flushNeeded();}}
    
    /**
     * Factory method returns instances of the GJ cutover chronology. Any
     * cutover date may be specified.
     *
     * @param zone  the time zone to use, null is default
     * @param gregorianCutover  the cutover to use, null means default
     * @param minDaysInFirstWeek  minimum number of days in first week of the year; default is 4
     */
    public static synchronized GJChronology getInstance(
            DateTimeZone zone,
            ReadableInstant gregorianCutover,
            int minDaysInFirstWeek) {try{__CLR4_4_17r87r8lc8azsxd.R.inc(10069);
        
        __CLR4_4_17r87r8lc8azsxd.R.inc(10070);zone = DateTimeUtils.getZone(zone);
        __CLR4_4_17r87r8lc8azsxd.R.inc(10071);Instant cutoverInstant;
        __CLR4_4_17r87r8lc8azsxd.R.inc(10072);if ((((gregorianCutover == null)&&(__CLR4_4_17r87r8lc8azsxd.R.iget(10073)!=0|true))||(__CLR4_4_17r87r8lc8azsxd.R.iget(10074)==0&false))) {{
            __CLR4_4_17r87r8lc8azsxd.R.inc(10075);cutoverInstant = DEFAULT_CUTOVER;
        } }else {{
            __CLR4_4_17r87r8lc8azsxd.R.inc(10076);cutoverInstant = gregorianCutover.toInstant();
            __CLR4_4_17r87r8lc8azsxd.R.inc(10077);LocalDate cutoverDate = new LocalDate(cutoverInstant.getMillis(), GregorianChronology.getInstance(zone));
            __CLR4_4_17r87r8lc8azsxd.R.inc(10078);if ((((cutoverDate.getYear() <= 0)&&(__CLR4_4_17r87r8lc8azsxd.R.iget(10079)!=0|true))||(__CLR4_4_17r87r8lc8azsxd.R.iget(10080)==0&false))) {{
                __CLR4_4_17r87r8lc8azsxd.R.inc(10081);throw new IllegalArgumentException("Cutover too early. Must be on or after 0001-01-01.");
            }
        }}

        }__CLR4_4_17r87r8lc8azsxd.R.inc(10082);GJChronology chrono;
        __CLR4_4_17r87r8lc8azsxd.R.inc(10083);synchronized (cCache) {
            __CLR4_4_17r87r8lc8azsxd.R.inc(10084);ArrayList<GJChronology> chronos = cCache.get(zone);
            __CLR4_4_17r87r8lc8azsxd.R.inc(10085);if ((((chronos == null)&&(__CLR4_4_17r87r8lc8azsxd.R.iget(10086)!=0|true))||(__CLR4_4_17r87r8lc8azsxd.R.iget(10087)==0&false))) {{
                __CLR4_4_17r87r8lc8azsxd.R.inc(10088);chronos = new ArrayList<GJChronology>(2);
                __CLR4_4_17r87r8lc8azsxd.R.inc(10089);cCache.put(zone, chronos);
            } }else {{
                __CLR4_4_17r87r8lc8azsxd.R.inc(10090);for (int i = chronos.size(); (((--i >= 0)&&(__CLR4_4_17r87r8lc8azsxd.R.iget(10091)!=0|true))||(__CLR4_4_17r87r8lc8azsxd.R.iget(10092)==0&false));) {{
                    __CLR4_4_17r87r8lc8azsxd.R.inc(10093);chrono = chronos.get(i);
                    __CLR4_4_17r87r8lc8azsxd.R.inc(10094);if ((((minDaysInFirstWeek == chrono.getMinimumDaysInFirstWeek() &&
                        cutoverInstant.equals(chrono.getGregorianCutover()))&&(__CLR4_4_17r87r8lc8azsxd.R.iget(10095)!=0|true))||(__CLR4_4_17r87r8lc8azsxd.R.iget(10096)==0&false))) {{
                        
                        __CLR4_4_17r87r8lc8azsxd.R.inc(10097);return chrono;
                    }
                }}
            }}
            }__CLR4_4_17r87r8lc8azsxd.R.inc(10098);if ((((zone == DateTimeZone.UTC)&&(__CLR4_4_17r87r8lc8azsxd.R.iget(10099)!=0|true))||(__CLR4_4_17r87r8lc8azsxd.R.iget(10100)==0&false))) {{
                __CLR4_4_17r87r8lc8azsxd.R.inc(10101);chrono = new GJChronology
                    (JulianChronology.getInstance(zone, minDaysInFirstWeek),
                     GregorianChronology.getInstance(zone, minDaysInFirstWeek),
                     cutoverInstant);
            } }else {{
                __CLR4_4_17r87r8lc8azsxd.R.inc(10102);chrono = getInstance(DateTimeZone.UTC, cutoverInstant, minDaysInFirstWeek);
                __CLR4_4_17r87r8lc8azsxd.R.inc(10103);chrono = new GJChronology
                    (ZonedChronology.getInstance(chrono, zone),
                     chrono.iJulianChronology,
                     chrono.iGregorianChronology,
                     chrono.iCutoverInstant);
            }
            }__CLR4_4_17r87r8lc8azsxd.R.inc(10104);chronos.add(chrono);
        }
        __CLR4_4_17r87r8lc8azsxd.R.inc(10105);return chrono;
    }finally{__CLR4_4_17r87r8lc8azsxd.R.flushNeeded();}}

    /**
     * Factory method returns instances of the GJ cutover chronology. Any
     * cutover date may be specified.
     *
     * @param zone  the time zone to use, null is default
     * @param gregorianCutover  the cutover to use
     * @param minDaysInFirstWeek  minimum number of days in first week of the year; default is 4
     */
    public static GJChronology getInstance(
            DateTimeZone zone,
            long gregorianCutover,
            int minDaysInFirstWeek) {try{__CLR4_4_17r87r8lc8azsxd.R.inc(10106);
        
        __CLR4_4_17r87r8lc8azsxd.R.inc(10107);Instant cutoverInstant;
        __CLR4_4_17r87r8lc8azsxd.R.inc(10108);if ((((gregorianCutover == DEFAULT_CUTOVER.getMillis())&&(__CLR4_4_17r87r8lc8azsxd.R.iget(10109)!=0|true))||(__CLR4_4_17r87r8lc8azsxd.R.iget(10110)==0&false))) {{
            __CLR4_4_17r87r8lc8azsxd.R.inc(10111);cutoverInstant = null;
        } }else {{
            __CLR4_4_17r87r8lc8azsxd.R.inc(10112);cutoverInstant = new Instant(gregorianCutover);
        }
        }__CLR4_4_17r87r8lc8azsxd.R.inc(10113);return getInstance(zone, cutoverInstant, minDaysInFirstWeek);
    }finally{__CLR4_4_17r87r8lc8azsxd.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    private JulianChronology iJulianChronology;
    private GregorianChronology iGregorianChronology;
    private Instant iCutoverInstant;

    private long iCutoverMillis;
    private long iGapDuration;

    /**
     * @param julian chronology used before the cutover instant
     * @param gregorian chronology used at and after the cutover instant
     * @param cutoverInstant instant when the gregorian chronology began
     */
    private GJChronology(JulianChronology julian,
                         GregorianChronology gregorian,
                         Instant cutoverInstant) {
        super(null, new Object[] {julian, gregorian, cutoverInstant});__CLR4_4_17r87r8lc8azsxd.R.inc(10115);try{__CLR4_4_17r87r8lc8azsxd.R.inc(10114);
    }finally{__CLR4_4_17r87r8lc8azsxd.R.flushNeeded();}}

    /**
     * Called when applying a time zone.
     */
    private GJChronology(Chronology base,
                         JulianChronology julian,
                         GregorianChronology gregorian,
                         Instant cutoverInstant) {
        super(base, new Object[] {julian, gregorian, cutoverInstant});__CLR4_4_17r87r8lc8azsxd.R.inc(10117);try{__CLR4_4_17r87r8lc8azsxd.R.inc(10116);
    }finally{__CLR4_4_17r87r8lc8azsxd.R.flushNeeded();}}

    /**
     * Serialization singleton
     */
    private Object readResolve() {try{__CLR4_4_17r87r8lc8azsxd.R.inc(10118);
        __CLR4_4_17r87r8lc8azsxd.R.inc(10119);return getInstance(getZone(), iCutoverInstant, getMinimumDaysInFirstWeek());
    }finally{__CLR4_4_17r87r8lc8azsxd.R.flushNeeded();}}

    public DateTimeZone getZone() {try{__CLR4_4_17r87r8lc8azsxd.R.inc(10120);
        __CLR4_4_17r87r8lc8azsxd.R.inc(10121);Chronology base;
        __CLR4_4_17r87r8lc8azsxd.R.inc(10122);if ((base = getBase()) != null) {{
            __CLR4_4_17r87r8lc8azsxd.R.inc(10125);return base.getZone();
        }
        }__CLR4_4_17r87r8lc8azsxd.R.inc(10126);return DateTimeZone.UTC;
    }finally{__CLR4_4_17r87r8lc8azsxd.R.flushNeeded();}}

    // Conversion
    //-----------------------------------------------------------------------
    /**
     * Gets the Chronology in the UTC time zone.
     * 
     * @return the chronology in UTC
     */
    public Chronology withUTC() {try{__CLR4_4_17r87r8lc8azsxd.R.inc(10127);
        __CLR4_4_17r87r8lc8azsxd.R.inc(10128);return withZone(DateTimeZone.UTC);
    }finally{__CLR4_4_17r87r8lc8azsxd.R.flushNeeded();}}

    /**
     * Gets the Chronology in a specific time zone.
     * 
     * @param zone  the zone to get the chronology in, null is default
     * @return the chronology
     */
    public Chronology withZone(DateTimeZone zone) {try{__CLR4_4_17r87r8lc8azsxd.R.inc(10129);
        __CLR4_4_17r87r8lc8azsxd.R.inc(10130);if ((((zone == null)&&(__CLR4_4_17r87r8lc8azsxd.R.iget(10131)!=0|true))||(__CLR4_4_17r87r8lc8azsxd.R.iget(10132)==0&false))) {{
            __CLR4_4_17r87r8lc8azsxd.R.inc(10133);zone = DateTimeZone.getDefault();
        }
        }__CLR4_4_17r87r8lc8azsxd.R.inc(10134);if ((((zone == getZone())&&(__CLR4_4_17r87r8lc8azsxd.R.iget(10135)!=0|true))||(__CLR4_4_17r87r8lc8azsxd.R.iget(10136)==0&false))) {{
            __CLR4_4_17r87r8lc8azsxd.R.inc(10137);return this;
        }
        }__CLR4_4_17r87r8lc8azsxd.R.inc(10138);return getInstance(zone, iCutoverInstant, getMinimumDaysInFirstWeek());
    }finally{__CLR4_4_17r87r8lc8azsxd.R.flushNeeded();}}

    public long getDateTimeMillis(int year, int monthOfYear, int dayOfMonth,
                                  int millisOfDay)
        throws IllegalArgumentException
    {try{__CLR4_4_17r87r8lc8azsxd.R.inc(10139);
        __CLR4_4_17r87r8lc8azsxd.R.inc(10140);Chronology base;
        __CLR4_4_17r87r8lc8azsxd.R.inc(10141);if ((base = getBase()) != null) {{
            __CLR4_4_17r87r8lc8azsxd.R.inc(10144);return base.getDateTimeMillis(year, monthOfYear, dayOfMonth, millisOfDay);
        }

        // Assume date is Gregorian.
        }__CLR4_4_17r87r8lc8azsxd.R.inc(10145);long instant = iGregorianChronology.getDateTimeMillis
            (year, monthOfYear, dayOfMonth, millisOfDay);
        __CLR4_4_17r87r8lc8azsxd.R.inc(10146);if ((((instant < iCutoverMillis)&&(__CLR4_4_17r87r8lc8azsxd.R.iget(10147)!=0|true))||(__CLR4_4_17r87r8lc8azsxd.R.iget(10148)==0&false))) {{
            // Maybe it's Julian.
            __CLR4_4_17r87r8lc8azsxd.R.inc(10149);instant = iJulianChronology.getDateTimeMillis
                (year, monthOfYear, dayOfMonth, millisOfDay);
            __CLR4_4_17r87r8lc8azsxd.R.inc(10150);if ((((instant >= iCutoverMillis)&&(__CLR4_4_17r87r8lc8azsxd.R.iget(10151)!=0|true))||(__CLR4_4_17r87r8lc8azsxd.R.iget(10152)==0&false))) {{
                // Okay, it's in the illegal cutover gap.
                __CLR4_4_17r87r8lc8azsxd.R.inc(10153);throw new IllegalArgumentException("Specified date does not exist");
            }
        }}
        }__CLR4_4_17r87r8lc8azsxd.R.inc(10154);return instant;
    }finally{__CLR4_4_17r87r8lc8azsxd.R.flushNeeded();}}

    public long getDateTimeMillis(int year, int monthOfYear, int dayOfMonth,
                                  int hourOfDay, int minuteOfHour,
                                  int secondOfMinute, int millisOfSecond)
        throws IllegalArgumentException
    {try{__CLR4_4_17r87r8lc8azsxd.R.inc(10155);
        __CLR4_4_17r87r8lc8azsxd.R.inc(10156);Chronology base;
        __CLR4_4_17r87r8lc8azsxd.R.inc(10157);if ((base = getBase()) != null) {{
            __CLR4_4_17r87r8lc8azsxd.R.inc(10160);return base.getDateTimeMillis
                (year, monthOfYear, dayOfMonth,
                 hourOfDay, minuteOfHour, secondOfMinute, millisOfSecond);
        }

        // Assume date is Gregorian.
        }__CLR4_4_17r87r8lc8azsxd.R.inc(10161);long instant;
        __CLR4_4_17r87r8lc8azsxd.R.inc(10162);try {
            __CLR4_4_17r87r8lc8azsxd.R.inc(10163);instant = iGregorianChronology.getDateTimeMillis
                (year, monthOfYear, dayOfMonth,
                 hourOfDay, minuteOfHour, secondOfMinute, millisOfSecond);
        } catch (IllegalFieldValueException ex) {
            __CLR4_4_17r87r8lc8azsxd.R.inc(10164);if ((((monthOfYear != 2 || dayOfMonth != 29)&&(__CLR4_4_17r87r8lc8azsxd.R.iget(10165)!=0|true))||(__CLR4_4_17r87r8lc8azsxd.R.iget(10166)==0&false))) {{
                __CLR4_4_17r87r8lc8azsxd.R.inc(10167);throw ex;
            }
            }__CLR4_4_17r87r8lc8azsxd.R.inc(10168);instant = iGregorianChronology.getDateTimeMillis
                (year, monthOfYear, 28,
                 hourOfDay, minuteOfHour, secondOfMinute, millisOfSecond);
            __CLR4_4_17r87r8lc8azsxd.R.inc(10169);if ((((instant >= iCutoverMillis)&&(__CLR4_4_17r87r8lc8azsxd.R.iget(10170)!=0|true))||(__CLR4_4_17r87r8lc8azsxd.R.iget(10171)==0&false))) {{
                __CLR4_4_17r87r8lc8azsxd.R.inc(10172);throw ex;
            }
        }}
        __CLR4_4_17r87r8lc8azsxd.R.inc(10173);if ((((instant < iCutoverMillis)&&(__CLR4_4_17r87r8lc8azsxd.R.iget(10174)!=0|true))||(__CLR4_4_17r87r8lc8azsxd.R.iget(10175)==0&false))) {{
            // Maybe it's Julian.
            __CLR4_4_17r87r8lc8azsxd.R.inc(10176);instant = iJulianChronology.getDateTimeMillis
                (year, monthOfYear, dayOfMonth,
                 hourOfDay, minuteOfHour, secondOfMinute, millisOfSecond);
            __CLR4_4_17r87r8lc8azsxd.R.inc(10177);if ((((instant >= iCutoverMillis)&&(__CLR4_4_17r87r8lc8azsxd.R.iget(10178)!=0|true))||(__CLR4_4_17r87r8lc8azsxd.R.iget(10179)==0&false))) {{
                // Okay, it's in the illegal cutover gap.
                __CLR4_4_17r87r8lc8azsxd.R.inc(10180);throw new IllegalArgumentException("Specified date does not exist");
            }
        }}
        }__CLR4_4_17r87r8lc8azsxd.R.inc(10181);return instant;
    }finally{__CLR4_4_17r87r8lc8azsxd.R.flushNeeded();}}

    /**
     * Gets the cutover instant between Gregorian and Julian chronologies.
     * @return the cutover instant
     */
    public Instant getGregorianCutover() {try{__CLR4_4_17r87r8lc8azsxd.R.inc(10182);
        __CLR4_4_17r87r8lc8azsxd.R.inc(10183);return iCutoverInstant;
    }finally{__CLR4_4_17r87r8lc8azsxd.R.flushNeeded();}}

    /**
     * Gets the minimum days needed for a week to be the first week in a year.
     * 
     * @return the minimum days
     */
    public int getMinimumDaysInFirstWeek() {try{__CLR4_4_17r87r8lc8azsxd.R.inc(10184);
        __CLR4_4_17r87r8lc8azsxd.R.inc(10185);return iGregorianChronology.getMinimumDaysInFirstWeek();
    }finally{__CLR4_4_17r87r8lc8azsxd.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Checks if this chronology instance equals another.
     * 
     * @param obj  the object to compare to
     * @return true if equal
     * @since 1.6
     */
    public boolean equals(Object obj) {try{__CLR4_4_17r87r8lc8azsxd.R.inc(10186);
        __CLR4_4_17r87r8lc8azsxd.R.inc(10187);if ((((this == obj)&&(__CLR4_4_17r87r8lc8azsxd.R.iget(10188)!=0|true))||(__CLR4_4_17r87r8lc8azsxd.R.iget(10189)==0&false))) {{
            __CLR4_4_17r87r8lc8azsxd.R.inc(10190);return true;
        }
        }__CLR4_4_17r87r8lc8azsxd.R.inc(10191);if ((((obj instanceof GJChronology)&&(__CLR4_4_17r87r8lc8azsxd.R.iget(10192)!=0|true))||(__CLR4_4_17r87r8lc8azsxd.R.iget(10193)==0&false))) {{
            __CLR4_4_17r87r8lc8azsxd.R.inc(10194);GJChronology chrono = (GJChronology) obj;
            __CLR4_4_17r87r8lc8azsxd.R.inc(10195);return iCutoverMillis == chrono.iCutoverMillis &&
                    getMinimumDaysInFirstWeek() == chrono.getMinimumDaysInFirstWeek() &&
                    getZone().equals(chrono.getZone());
        }
        }__CLR4_4_17r87r8lc8azsxd.R.inc(10196);return false;
    }finally{__CLR4_4_17r87r8lc8azsxd.R.flushNeeded();}}

    /**
     * A suitable hash code for the chronology.
     * 
     * @return the hash code
     * @since 1.6
     */
    public int hashCode() {try{__CLR4_4_17r87r8lc8azsxd.R.inc(10197);
        __CLR4_4_17r87r8lc8azsxd.R.inc(10198);return "GJ".hashCode() * 11 + getZone().hashCode() +
                getMinimumDaysInFirstWeek() + iCutoverInstant.hashCode();
    }finally{__CLR4_4_17r87r8lc8azsxd.R.flushNeeded();}}

    // Output
    //-----------------------------------------------------------------------
    /**
     * Gets a debugging toString.
     * 
     * @return a debugging string
     */
    public String toString() {try{__CLR4_4_17r87r8lc8azsxd.R.inc(10199);
        __CLR4_4_17r87r8lc8azsxd.R.inc(10200);StringBuffer sb = new StringBuffer(60);
        __CLR4_4_17r87r8lc8azsxd.R.inc(10201);sb.append("GJChronology");
        __CLR4_4_17r87r8lc8azsxd.R.inc(10202);sb.append('[');
        __CLR4_4_17r87r8lc8azsxd.R.inc(10203);sb.append(getZone().getID());
        
        __CLR4_4_17r87r8lc8azsxd.R.inc(10204);if ((((iCutoverMillis != DEFAULT_CUTOVER.getMillis())&&(__CLR4_4_17r87r8lc8azsxd.R.iget(10205)!=0|true))||(__CLR4_4_17r87r8lc8azsxd.R.iget(10206)==0&false))) {{
            __CLR4_4_17r87r8lc8azsxd.R.inc(10207);sb.append(",cutover=");
            __CLR4_4_17r87r8lc8azsxd.R.inc(10208);DateTimeFormatter printer;
            __CLR4_4_17r87r8lc8azsxd.R.inc(10209);if ((((withUTC().dayOfYear().remainder(iCutoverMillis) == 0)&&(__CLR4_4_17r87r8lc8azsxd.R.iget(10210)!=0|true))||(__CLR4_4_17r87r8lc8azsxd.R.iget(10211)==0&false))) {{
                __CLR4_4_17r87r8lc8azsxd.R.inc(10212);printer = ISODateTimeFormat.date();
            } }else {{
                __CLR4_4_17r87r8lc8azsxd.R.inc(10213);printer = ISODateTimeFormat.dateTime();
            }
            }__CLR4_4_17r87r8lc8azsxd.R.inc(10214);printer.withChronology(withUTC()).printTo(sb, iCutoverMillis);
        }
        
        }__CLR4_4_17r87r8lc8azsxd.R.inc(10215);if ((((getMinimumDaysInFirstWeek() != 4)&&(__CLR4_4_17r87r8lc8azsxd.R.iget(10216)!=0|true))||(__CLR4_4_17r87r8lc8azsxd.R.iget(10217)==0&false))) {{
            __CLR4_4_17r87r8lc8azsxd.R.inc(10218);sb.append(",mdfw=");
            __CLR4_4_17r87r8lc8azsxd.R.inc(10219);sb.append(getMinimumDaysInFirstWeek());
        }
        }__CLR4_4_17r87r8lc8azsxd.R.inc(10220);sb.append(']');
        
        __CLR4_4_17r87r8lc8azsxd.R.inc(10221);return sb.toString();
    }finally{__CLR4_4_17r87r8lc8azsxd.R.flushNeeded();}}

    protected void assemble(Fields fields) {try{__CLR4_4_17r87r8lc8azsxd.R.inc(10222);
        __CLR4_4_17r87r8lc8azsxd.R.inc(10223);Object[] params = (Object[])getParam();

        __CLR4_4_17r87r8lc8azsxd.R.inc(10224);JulianChronology julian = (JulianChronology)params[0];
        __CLR4_4_17r87r8lc8azsxd.R.inc(10225);GregorianChronology gregorian = (GregorianChronology)params[1];
        __CLR4_4_17r87r8lc8azsxd.R.inc(10226);Instant cutoverInstant = (Instant)params[2];
        __CLR4_4_17r87r8lc8azsxd.R.inc(10227);iCutoverMillis = cutoverInstant.getMillis();

        __CLR4_4_17r87r8lc8azsxd.R.inc(10228);iJulianChronology = julian;
        __CLR4_4_17r87r8lc8azsxd.R.inc(10229);iGregorianChronology = gregorian;
        __CLR4_4_17r87r8lc8azsxd.R.inc(10230);iCutoverInstant = cutoverInstant;

        __CLR4_4_17r87r8lc8azsxd.R.inc(10231);if ((((getBase() != null)&&(__CLR4_4_17r87r8lc8azsxd.R.iget(10232)!=0|true))||(__CLR4_4_17r87r8lc8azsxd.R.iget(10233)==0&false))) {{
            __CLR4_4_17r87r8lc8azsxd.R.inc(10234);return;
        }

        }__CLR4_4_17r87r8lc8azsxd.R.inc(10235);if ((((julian.getMinimumDaysInFirstWeek() != gregorian.getMinimumDaysInFirstWeek())&&(__CLR4_4_17r87r8lc8azsxd.R.iget(10236)!=0|true))||(__CLR4_4_17r87r8lc8azsxd.R.iget(10237)==0&false))) {{
            __CLR4_4_17r87r8lc8azsxd.R.inc(10238);throw new IllegalArgumentException();
        }

        // Compute difference between the chronologies at the cutover instant
        }__CLR4_4_17r87r8lc8azsxd.R.inc(10239);iGapDuration = iCutoverMillis - julianToGregorianByYear(iCutoverMillis);

        // Begin field definitions.

        // First just copy all the Gregorian fields and then override those
        // that need special attention.
        __CLR4_4_17r87r8lc8azsxd.R.inc(10240);fields.copyFieldsFrom(gregorian);
        
        // Assuming cutover is at midnight, all time of day fields can be
        // gregorian since they are unaffected by cutover.

        // Verify assumption.
        __CLR4_4_17r87r8lc8azsxd.R.inc(10241);if ((((gregorian.millisOfDay().get(iCutoverMillis) == 0)&&(__CLR4_4_17r87r8lc8azsxd.R.iget(10242)!=0|true))||(__CLR4_4_17r87r8lc8azsxd.R.iget(10243)==0&false))) {{
            // Cutover is sometime in the day, so cutover fields are required
            // for time of day.

            __CLR4_4_17r87r8lc8azsxd.R.inc(10244);fields.millisOfSecond = new CutoverField(julian.millisOfSecond(), fields.millisOfSecond, iCutoverMillis);
            __CLR4_4_17r87r8lc8azsxd.R.inc(10245);fields.millisOfDay = new CutoverField(julian.millisOfDay(), fields.millisOfDay, iCutoverMillis);
            __CLR4_4_17r87r8lc8azsxd.R.inc(10246);fields.secondOfMinute = new CutoverField(julian.secondOfMinute(), fields.secondOfMinute, iCutoverMillis);
            __CLR4_4_17r87r8lc8azsxd.R.inc(10247);fields.secondOfDay = new CutoverField(julian.secondOfDay(), fields.secondOfDay, iCutoverMillis);
            __CLR4_4_17r87r8lc8azsxd.R.inc(10248);fields.minuteOfHour = new CutoverField(julian.minuteOfHour(), fields.minuteOfHour, iCutoverMillis);
            __CLR4_4_17r87r8lc8azsxd.R.inc(10249);fields.minuteOfDay = new CutoverField(julian.minuteOfDay(), fields.minuteOfDay, iCutoverMillis);
            __CLR4_4_17r87r8lc8azsxd.R.inc(10250);fields.hourOfDay = new CutoverField(julian.hourOfDay(), fields.hourOfDay, iCutoverMillis);
            __CLR4_4_17r87r8lc8azsxd.R.inc(10251);fields.hourOfHalfday = new CutoverField(julian.hourOfHalfday(), fields.hourOfHalfday, iCutoverMillis);
            __CLR4_4_17r87r8lc8azsxd.R.inc(10252);fields.clockhourOfDay = new CutoverField(julian.clockhourOfDay(), fields.clockhourOfDay, iCutoverMillis);
            __CLR4_4_17r87r8lc8azsxd.R.inc(10253);fields.clockhourOfHalfday = new CutoverField(julian.clockhourOfHalfday(),
                                                         fields.clockhourOfHalfday, iCutoverMillis);
            __CLR4_4_17r87r8lc8azsxd.R.inc(10254);fields.halfdayOfDay = new CutoverField(julian.halfdayOfDay(), fields.halfdayOfDay, iCutoverMillis);
        }

        // These fields just require basic cutover support.
        }{
            __CLR4_4_17r87r8lc8azsxd.R.inc(10255);fields.era = new CutoverField(julian.era(), fields.era, iCutoverMillis);
        }

        // These fields are special because they have imprecise durations. The
        // family of addition methods need special attention. Override affected
        // duration fields as well.
        {
            __CLR4_4_17r87r8lc8azsxd.R.inc(10256);fields.year = new ImpreciseCutoverField(
                julian.year(), fields.year, iCutoverMillis);
            __CLR4_4_17r87r8lc8azsxd.R.inc(10257);fields.years = fields.year.getDurationField();
            __CLR4_4_17r87r8lc8azsxd.R.inc(10258);fields.yearOfEra = new ImpreciseCutoverField(
                julian.yearOfEra(), fields.yearOfEra, fields.years, iCutoverMillis);
            
            __CLR4_4_17r87r8lc8azsxd.R.inc(10259);fields.centuryOfEra = new ImpreciseCutoverField(
                julian.centuryOfEra(), fields.centuryOfEra, iCutoverMillis);
            __CLR4_4_17r87r8lc8azsxd.R.inc(10260);fields.centuries = fields.centuryOfEra.getDurationField();
            
            __CLR4_4_17r87r8lc8azsxd.R.inc(10261);fields.yearOfCentury = new ImpreciseCutoverField(
                julian.yearOfCentury(), fields.yearOfCentury, fields.years, fields.centuries, iCutoverMillis);
            
            __CLR4_4_17r87r8lc8azsxd.R.inc(10262);fields.monthOfYear = new ImpreciseCutoverField(
                julian.monthOfYear(), fields.monthOfYear, null, fields.years, iCutoverMillis);
            __CLR4_4_17r87r8lc8azsxd.R.inc(10263);fields.months = fields.monthOfYear.getDurationField();
            
            __CLR4_4_17r87r8lc8azsxd.R.inc(10264);fields.weekyear = new ImpreciseCutoverField(
                julian.weekyear(), fields.weekyear, null, iCutoverMillis, true);
            __CLR4_4_17r87r8lc8azsxd.R.inc(10265);fields.weekyears = fields.weekyear.getDurationField();
            __CLR4_4_17r87r8lc8azsxd.R.inc(10266);fields.weekyearOfCentury = new ImpreciseCutoverField(
                julian.weekyearOfCentury(), fields.weekyearOfCentury, fields.weekyears, fields.centuries, iCutoverMillis);
        }

        // DayOfYear and weekOfWeekyear require special handling since cutover
        // year has fewer days and weeks. Extend the cutover to the start of
        // the next year or weekyear. This keeps the sequence unbroken during
        // the cutover year.

        {
            __CLR4_4_17r87r8lc8azsxd.R.inc(10267);long cutover = gregorian.year().roundCeiling(iCutoverMillis);
            __CLR4_4_17r87r8lc8azsxd.R.inc(10268);fields.dayOfYear = new CutoverField(
                julian.dayOfYear(), fields.dayOfYear, fields.years, cutover, false);
        }

        {
            __CLR4_4_17r87r8lc8azsxd.R.inc(10269);long cutover = gregorian.weekyear().roundCeiling(iCutoverMillis);
            __CLR4_4_17r87r8lc8azsxd.R.inc(10270);fields.weekOfWeekyear = new CutoverField(
                julian.weekOfWeekyear(), fields.weekOfWeekyear, fields.weekyears, cutover, true);
        }

        // These fields require basic cutover support, except they must link to
        // imprecise durations.
        {
            __CLR4_4_17r87r8lc8azsxd.R.inc(10271);CutoverField cf = new CutoverField
                (julian.dayOfMonth(), fields.dayOfMonth, iCutoverMillis);
            __CLR4_4_17r87r8lc8azsxd.R.inc(10272);cf.iRangeDurationField = fields.months;
            __CLR4_4_17r87r8lc8azsxd.R.inc(10273);fields.dayOfMonth = cf;
        }
    }finally{__CLR4_4_17r87r8lc8azsxd.R.flushNeeded();}}

    long julianToGregorianByYear(long instant) {try{__CLR4_4_17r87r8lc8azsxd.R.inc(10274);
        __CLR4_4_17r87r8lc8azsxd.R.inc(10275);return convertByYear(instant, iJulianChronology, iGregorianChronology);
    }finally{__CLR4_4_17r87r8lc8azsxd.R.flushNeeded();}}

    long gregorianToJulianByYear(long instant) {try{__CLR4_4_17r87r8lc8azsxd.R.inc(10276);
        __CLR4_4_17r87r8lc8azsxd.R.inc(10277);return convertByYear(instant, iGregorianChronology, iJulianChronology);
    }finally{__CLR4_4_17r87r8lc8azsxd.R.flushNeeded();}}

    long julianToGregorianByWeekyear(long instant) {try{__CLR4_4_17r87r8lc8azsxd.R.inc(10278);
        __CLR4_4_17r87r8lc8azsxd.R.inc(10279);return convertByWeekyear(instant, iJulianChronology, iGregorianChronology);
    }finally{__CLR4_4_17r87r8lc8azsxd.R.flushNeeded();}}

    long gregorianToJulianByWeekyear(long instant) {try{__CLR4_4_17r87r8lc8azsxd.R.inc(10280);
        __CLR4_4_17r87r8lc8azsxd.R.inc(10281);return convertByWeekyear(instant, iGregorianChronology, iJulianChronology);
    }finally{__CLR4_4_17r87r8lc8azsxd.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * This basic cutover field adjusts calls to 'get' and 'set' methods, and
     * assumes that calls to add and addWrapField are unaffected by the cutover.
     */
    private class CutoverField extends BaseDateTimeField {
        @SuppressWarnings("unused")
        private static final long serialVersionUID = 3528501219481026402L;

        final DateTimeField iJulianField;
        final DateTimeField iGregorianField;
        final long iCutover;
        final boolean iConvertByWeekyear;

        protected DurationField iDurationField;
        protected DurationField iRangeDurationField;

        /**
         * @param julianField field from the chronology used before the cutover instant
         * @param gregorianField field from the chronology used at and after the cutover
         * @param cutoverMillis  the millis of the cutover
         */
        CutoverField(DateTimeField julianField, DateTimeField gregorianField, long cutoverMillis) {
            this(julianField, gregorianField, cutoverMillis, false);__CLR4_4_17r87r8lc8azsxd.R.inc(10283);try{__CLR4_4_17r87r8lc8azsxd.R.inc(10282);
        }finally{__CLR4_4_17r87r8lc8azsxd.R.flushNeeded();}}

        /**
         * @param julianField field from the chronology used before the cutover instant
         * @param gregorianField field from the chronology used at and after the cutover
         * @param cutoverMillis  the millis of the cutover
         * @param convertByWeekyear
         */
        CutoverField(DateTimeField julianField, DateTimeField gregorianField,
                     long cutoverMillis, boolean convertByWeekyear) {
            this(julianField, gregorianField, null, cutoverMillis, convertByWeekyear);__CLR4_4_17r87r8lc8azsxd.R.inc(10285);try{__CLR4_4_17r87r8lc8azsxd.R.inc(10284);
        }finally{__CLR4_4_17r87r8lc8azsxd.R.flushNeeded();}}

        /**
         * @param julianField field from the chronology used before the cutover instant
         * @param gregorianField field from the chronology used at and after the cutover
         * @param rangeField  the range field
         * @param cutoverMillis  the millis of the cutover
         * @param convertByWeekyear
         */
        CutoverField(DateTimeField julianField, DateTimeField gregorianField,
                     DurationField rangeField, long cutoverMillis, boolean convertByWeekyear) {
            super(gregorianField.getType());__CLR4_4_17r87r8lc8azsxd.R.inc(10287);try{__CLR4_4_17r87r8lc8azsxd.R.inc(10286);
            __CLR4_4_17r87r8lc8azsxd.R.inc(10288);iJulianField = julianField;
            __CLR4_4_17r87r8lc8azsxd.R.inc(10289);iGregorianField = gregorianField;
            __CLR4_4_17r87r8lc8azsxd.R.inc(10290);iCutover = cutoverMillis;
            __CLR4_4_17r87r8lc8azsxd.R.inc(10291);iConvertByWeekyear = convertByWeekyear;
            // Although average length of Julian and Gregorian years differ,
            // use the Gregorian duration field because it is more accurate.
            __CLR4_4_17r87r8lc8azsxd.R.inc(10292);iDurationField = gregorianField.getDurationField();
            __CLR4_4_17r87r8lc8azsxd.R.inc(10293);if ((((rangeField == null)&&(__CLR4_4_17r87r8lc8azsxd.R.iget(10294)!=0|true))||(__CLR4_4_17r87r8lc8azsxd.R.iget(10295)==0&false))) {{
                __CLR4_4_17r87r8lc8azsxd.R.inc(10296);rangeField = gregorianField.getRangeDurationField();
                __CLR4_4_17r87r8lc8azsxd.R.inc(10297);if ((((rangeField == null)&&(__CLR4_4_17r87r8lc8azsxd.R.iget(10298)!=0|true))||(__CLR4_4_17r87r8lc8azsxd.R.iget(10299)==0&false))) {{
                    __CLR4_4_17r87r8lc8azsxd.R.inc(10300);rangeField = julianField.getRangeDurationField();
                }
            }}
            }__CLR4_4_17r87r8lc8azsxd.R.inc(10301);iRangeDurationField = rangeField;
        }finally{__CLR4_4_17r87r8lc8azsxd.R.flushNeeded();}}

        public boolean isLenient() {try{__CLR4_4_17r87r8lc8azsxd.R.inc(10302);
            __CLR4_4_17r87r8lc8azsxd.R.inc(10303);return false;
        }finally{__CLR4_4_17r87r8lc8azsxd.R.flushNeeded();}}

        public int get(long instant) {try{__CLR4_4_17r87r8lc8azsxd.R.inc(10304);
            __CLR4_4_17r87r8lc8azsxd.R.inc(10305);if ((((instant >= iCutover)&&(__CLR4_4_17r87r8lc8azsxd.R.iget(10306)!=0|true))||(__CLR4_4_17r87r8lc8azsxd.R.iget(10307)==0&false))) {{
                __CLR4_4_17r87r8lc8azsxd.R.inc(10308);return iGregorianField.get(instant);
            } }else {{
                __CLR4_4_17r87r8lc8azsxd.R.inc(10309);return iJulianField.get(instant);
            }
        }}finally{__CLR4_4_17r87r8lc8azsxd.R.flushNeeded();}}

        public String getAsText(long instant, Locale locale) {try{__CLR4_4_17r87r8lc8azsxd.R.inc(10310);
            __CLR4_4_17r87r8lc8azsxd.R.inc(10311);if ((((instant >= iCutover)&&(__CLR4_4_17r87r8lc8azsxd.R.iget(10312)!=0|true))||(__CLR4_4_17r87r8lc8azsxd.R.iget(10313)==0&false))) {{
                __CLR4_4_17r87r8lc8azsxd.R.inc(10314);return iGregorianField.getAsText(instant, locale);
            } }else {{
                __CLR4_4_17r87r8lc8azsxd.R.inc(10315);return iJulianField.getAsText(instant, locale);
            }
        }}finally{__CLR4_4_17r87r8lc8azsxd.R.flushNeeded();}}

        public String getAsText(int fieldValue, Locale locale) {try{__CLR4_4_17r87r8lc8azsxd.R.inc(10316);
            __CLR4_4_17r87r8lc8azsxd.R.inc(10317);return iGregorianField.getAsText(fieldValue, locale);
        }finally{__CLR4_4_17r87r8lc8azsxd.R.flushNeeded();}}

        public String getAsShortText(long instant, Locale locale) {try{__CLR4_4_17r87r8lc8azsxd.R.inc(10318);
            __CLR4_4_17r87r8lc8azsxd.R.inc(10319);if ((((instant >= iCutover)&&(__CLR4_4_17r87r8lc8azsxd.R.iget(10320)!=0|true))||(__CLR4_4_17r87r8lc8azsxd.R.iget(10321)==0&false))) {{
                __CLR4_4_17r87r8lc8azsxd.R.inc(10322);return iGregorianField.getAsShortText(instant, locale);
            } }else {{
                __CLR4_4_17r87r8lc8azsxd.R.inc(10323);return iJulianField.getAsShortText(instant, locale);
            }
        }}finally{__CLR4_4_17r87r8lc8azsxd.R.flushNeeded();}}

        public String getAsShortText(int fieldValue, Locale locale) {try{__CLR4_4_17r87r8lc8azsxd.R.inc(10324);
            __CLR4_4_17r87r8lc8azsxd.R.inc(10325);return iGregorianField.getAsShortText(fieldValue, locale);
        }finally{__CLR4_4_17r87r8lc8azsxd.R.flushNeeded();}}

        public long add(long instant, int value) {try{__CLR4_4_17r87r8lc8azsxd.R.inc(10326);
            __CLR4_4_17r87r8lc8azsxd.R.inc(10327);return iGregorianField.add(instant, value);
        }finally{__CLR4_4_17r87r8lc8azsxd.R.flushNeeded();}}

        public long add(long instant, long value) {try{__CLR4_4_17r87r8lc8azsxd.R.inc(10328);
            __CLR4_4_17r87r8lc8azsxd.R.inc(10329);return iGregorianField.add(instant, value);
        }finally{__CLR4_4_17r87r8lc8azsxd.R.flushNeeded();}}

        public int[] add(ReadablePartial partial, int fieldIndex, int[] values, int valueToAdd) {try{__CLR4_4_17r87r8lc8azsxd.R.inc(10330);
            // overridden as superclass algorithm can't handle
            // 2004-02-29 + 48 months -> 2008-02-29 type dates
            __CLR4_4_17r87r8lc8azsxd.R.inc(10331);if ((((valueToAdd == 0)&&(__CLR4_4_17r87r8lc8azsxd.R.iget(10332)!=0|true))||(__CLR4_4_17r87r8lc8azsxd.R.iget(10333)==0&false))) {{
                __CLR4_4_17r87r8lc8azsxd.R.inc(10334);return values;
            }
            }__CLR4_4_17r87r8lc8azsxd.R.inc(10335);if ((((DateTimeUtils.isContiguous(partial))&&(__CLR4_4_17r87r8lc8azsxd.R.iget(10336)!=0|true))||(__CLR4_4_17r87r8lc8azsxd.R.iget(10337)==0&false))) {{
                __CLR4_4_17r87r8lc8azsxd.R.inc(10338);long instant = 0L;
                __CLR4_4_17r87r8lc8azsxd.R.inc(10339);for (int i = 0, isize = partial.size(); (((i < isize)&&(__CLR4_4_17r87r8lc8azsxd.R.iget(10340)!=0|true))||(__CLR4_4_17r87r8lc8azsxd.R.iget(10341)==0&false)); i++) {{
                    __CLR4_4_17r87r8lc8azsxd.R.inc(10342);instant = partial.getFieldType(i).getField(GJChronology.this).set(instant, values[i]);
                }
                }__CLR4_4_17r87r8lc8azsxd.R.inc(10343);instant = add(instant, valueToAdd);
                __CLR4_4_17r87r8lc8azsxd.R.inc(10344);return GJChronology.this.get(partial, instant);
            } }else {{
                __CLR4_4_17r87r8lc8azsxd.R.inc(10345);return super.add(partial, fieldIndex, values, valueToAdd);
            }
        }}finally{__CLR4_4_17r87r8lc8azsxd.R.flushNeeded();}}

        public int getDifference(long minuendInstant, long subtrahendInstant) {try{__CLR4_4_17r87r8lc8azsxd.R.inc(10346);
            __CLR4_4_17r87r8lc8azsxd.R.inc(10347);return iGregorianField.getDifference(minuendInstant, subtrahendInstant);
        }finally{__CLR4_4_17r87r8lc8azsxd.R.flushNeeded();}}

        public long getDifferenceAsLong(long minuendInstant, long subtrahendInstant) {try{__CLR4_4_17r87r8lc8azsxd.R.inc(10348);
            __CLR4_4_17r87r8lc8azsxd.R.inc(10349);return iGregorianField.getDifferenceAsLong(minuendInstant, subtrahendInstant);
        }finally{__CLR4_4_17r87r8lc8azsxd.R.flushNeeded();}}

        public long set(long instant, int value) {try{__CLR4_4_17r87r8lc8azsxd.R.inc(10350);
            __CLR4_4_17r87r8lc8azsxd.R.inc(10351);if ((((instant >= iCutover)&&(__CLR4_4_17r87r8lc8azsxd.R.iget(10352)!=0|true))||(__CLR4_4_17r87r8lc8azsxd.R.iget(10353)==0&false))) {{
                __CLR4_4_17r87r8lc8azsxd.R.inc(10354);instant = iGregorianField.set(instant, value);
                __CLR4_4_17r87r8lc8azsxd.R.inc(10355);if ((((instant < iCutover)&&(__CLR4_4_17r87r8lc8azsxd.R.iget(10356)!=0|true))||(__CLR4_4_17r87r8lc8azsxd.R.iget(10357)==0&false))) {{
                    // Only adjust if gap fully crossed.
                    __CLR4_4_17r87r8lc8azsxd.R.inc(10358);if ((((instant + iGapDuration < iCutover)&&(__CLR4_4_17r87r8lc8azsxd.R.iget(10359)!=0|true))||(__CLR4_4_17r87r8lc8azsxd.R.iget(10360)==0&false))) {{
                        __CLR4_4_17r87r8lc8azsxd.R.inc(10361);instant = gregorianToJulian(instant);
                    }
                    // Verify that new value stuck.
                    }__CLR4_4_17r87r8lc8azsxd.R.inc(10362);if ((((get(instant) != value)&&(__CLR4_4_17r87r8lc8azsxd.R.iget(10363)!=0|true))||(__CLR4_4_17r87r8lc8azsxd.R.iget(10364)==0&false))) {{
                        __CLR4_4_17r87r8lc8azsxd.R.inc(10365);throw new IllegalFieldValueException
                            (iGregorianField.getType(), Integer.valueOf(value), null, null);
                    }
                }}
            }} }else {{
                __CLR4_4_17r87r8lc8azsxd.R.inc(10366);instant = iJulianField.set(instant, value);
                __CLR4_4_17r87r8lc8azsxd.R.inc(10367);if ((((instant >= iCutover)&&(__CLR4_4_17r87r8lc8azsxd.R.iget(10368)!=0|true))||(__CLR4_4_17r87r8lc8azsxd.R.iget(10369)==0&false))) {{
                    // Only adjust if gap fully crossed.
                    __CLR4_4_17r87r8lc8azsxd.R.inc(10370);if ((((instant - iGapDuration >= iCutover)&&(__CLR4_4_17r87r8lc8azsxd.R.iget(10371)!=0|true))||(__CLR4_4_17r87r8lc8azsxd.R.iget(10372)==0&false))) {{
                        __CLR4_4_17r87r8lc8azsxd.R.inc(10373);instant = julianToGregorian(instant);
                    }
                    // Verify that new value stuck.
                    }__CLR4_4_17r87r8lc8azsxd.R.inc(10374);if ((((get(instant) != value)&&(__CLR4_4_17r87r8lc8azsxd.R.iget(10375)!=0|true))||(__CLR4_4_17r87r8lc8azsxd.R.iget(10376)==0&false))) {{
                       __CLR4_4_17r87r8lc8azsxd.R.inc(10377);throw new IllegalFieldValueException
                            (iJulianField.getType(), Integer.valueOf(value), null, null);
                    }
                }}
            }}
            }__CLR4_4_17r87r8lc8azsxd.R.inc(10378);return instant;
        }finally{__CLR4_4_17r87r8lc8azsxd.R.flushNeeded();}}

        public long set(long instant, String text, Locale locale) {try{__CLR4_4_17r87r8lc8azsxd.R.inc(10379);
            __CLR4_4_17r87r8lc8azsxd.R.inc(10380);if ((((instant >= iCutover)&&(__CLR4_4_17r87r8lc8azsxd.R.iget(10381)!=0|true))||(__CLR4_4_17r87r8lc8azsxd.R.iget(10382)==0&false))) {{
                __CLR4_4_17r87r8lc8azsxd.R.inc(10383);instant = iGregorianField.set(instant, text, locale);
                __CLR4_4_17r87r8lc8azsxd.R.inc(10384);if ((((instant < iCutover)&&(__CLR4_4_17r87r8lc8azsxd.R.iget(10385)!=0|true))||(__CLR4_4_17r87r8lc8azsxd.R.iget(10386)==0&false))) {{
                    // Only adjust if gap fully crossed.
                    __CLR4_4_17r87r8lc8azsxd.R.inc(10387);if ((((instant + iGapDuration < iCutover)&&(__CLR4_4_17r87r8lc8azsxd.R.iget(10388)!=0|true))||(__CLR4_4_17r87r8lc8azsxd.R.iget(10389)==0&false))) {{
                        __CLR4_4_17r87r8lc8azsxd.R.inc(10390);instant = gregorianToJulian(instant);
                    }
                    // Cannot verify that new value stuck because set may be lenient.
                }}
            }} }else {{
                __CLR4_4_17r87r8lc8azsxd.R.inc(10391);instant = iJulianField.set(instant, text, locale);
                __CLR4_4_17r87r8lc8azsxd.R.inc(10392);if ((((instant >= iCutover)&&(__CLR4_4_17r87r8lc8azsxd.R.iget(10393)!=0|true))||(__CLR4_4_17r87r8lc8azsxd.R.iget(10394)==0&false))) {{
                    // Only adjust if gap fully crossed.
                    __CLR4_4_17r87r8lc8azsxd.R.inc(10395);if ((((instant - iGapDuration >= iCutover)&&(__CLR4_4_17r87r8lc8azsxd.R.iget(10396)!=0|true))||(__CLR4_4_17r87r8lc8azsxd.R.iget(10397)==0&false))) {{
                        __CLR4_4_17r87r8lc8azsxd.R.inc(10398);instant = julianToGregorian(instant);
                    }
                    // Cannot verify that new value stuck because set may be lenient.
                }}
            }}
            }__CLR4_4_17r87r8lc8azsxd.R.inc(10399);return instant;
        }finally{__CLR4_4_17r87r8lc8azsxd.R.flushNeeded();}}

        public DurationField getDurationField() {try{__CLR4_4_17r87r8lc8azsxd.R.inc(10400);
            __CLR4_4_17r87r8lc8azsxd.R.inc(10401);return iDurationField;
        }finally{__CLR4_4_17r87r8lc8azsxd.R.flushNeeded();}}

        public DurationField getRangeDurationField() {try{__CLR4_4_17r87r8lc8azsxd.R.inc(10402);
            __CLR4_4_17r87r8lc8azsxd.R.inc(10403);return iRangeDurationField;
        }finally{__CLR4_4_17r87r8lc8azsxd.R.flushNeeded();}}

        public boolean isLeap(long instant) {try{__CLR4_4_17r87r8lc8azsxd.R.inc(10404);
            __CLR4_4_17r87r8lc8azsxd.R.inc(10405);if ((((instant >= iCutover)&&(__CLR4_4_17r87r8lc8azsxd.R.iget(10406)!=0|true))||(__CLR4_4_17r87r8lc8azsxd.R.iget(10407)==0&false))) {{
                __CLR4_4_17r87r8lc8azsxd.R.inc(10408);return iGregorianField.isLeap(instant);
            } }else {{
                __CLR4_4_17r87r8lc8azsxd.R.inc(10409);return iJulianField.isLeap(instant);
            }
        }}finally{__CLR4_4_17r87r8lc8azsxd.R.flushNeeded();}}

        public int getLeapAmount(long instant) {try{__CLR4_4_17r87r8lc8azsxd.R.inc(10410);
            __CLR4_4_17r87r8lc8azsxd.R.inc(10411);if ((((instant >= iCutover)&&(__CLR4_4_17r87r8lc8azsxd.R.iget(10412)!=0|true))||(__CLR4_4_17r87r8lc8azsxd.R.iget(10413)==0&false))) {{
                __CLR4_4_17r87r8lc8azsxd.R.inc(10414);return iGregorianField.getLeapAmount(instant);
            } }else {{
                __CLR4_4_17r87r8lc8azsxd.R.inc(10415);return iJulianField.getLeapAmount(instant);
            }
        }}finally{__CLR4_4_17r87r8lc8azsxd.R.flushNeeded();}}

        public DurationField getLeapDurationField() {try{__CLR4_4_17r87r8lc8azsxd.R.inc(10416);
            __CLR4_4_17r87r8lc8azsxd.R.inc(10417);return iGregorianField.getLeapDurationField();
        }finally{__CLR4_4_17r87r8lc8azsxd.R.flushNeeded();}}


        public int getMinimumValue() {try{__CLR4_4_17r87r8lc8azsxd.R.inc(10418);
            // For all precise fields, the Julian and Gregorian limits are
            // identical. Choose Julian to tighten up the year limits.
            __CLR4_4_17r87r8lc8azsxd.R.inc(10419);return iJulianField.getMinimumValue();
        }finally{__CLR4_4_17r87r8lc8azsxd.R.flushNeeded();}}

        public int getMinimumValue(ReadablePartial partial) {try{__CLR4_4_17r87r8lc8azsxd.R.inc(10420);
            __CLR4_4_17r87r8lc8azsxd.R.inc(10421);return iJulianField.getMinimumValue(partial);
        }finally{__CLR4_4_17r87r8lc8azsxd.R.flushNeeded();}}

        public int getMinimumValue(ReadablePartial partial, int[] values) {try{__CLR4_4_17r87r8lc8azsxd.R.inc(10422);
            __CLR4_4_17r87r8lc8azsxd.R.inc(10423);return iJulianField.getMinimumValue(partial, values);
        }finally{__CLR4_4_17r87r8lc8azsxd.R.flushNeeded();}}

        public int getMinimumValue(long instant) {try{__CLR4_4_17r87r8lc8azsxd.R.inc(10424);
            __CLR4_4_17r87r8lc8azsxd.R.inc(10425);if ((((instant < iCutover)&&(__CLR4_4_17r87r8lc8azsxd.R.iget(10426)!=0|true))||(__CLR4_4_17r87r8lc8azsxd.R.iget(10427)==0&false))) {{
                __CLR4_4_17r87r8lc8azsxd.R.inc(10428);return iJulianField.getMinimumValue(instant);
            }

            }__CLR4_4_17r87r8lc8azsxd.R.inc(10429);int min = iGregorianField.getMinimumValue(instant);

            // Because the cutover may reduce the length of this field, verify
            // the minimum by setting it.
            __CLR4_4_17r87r8lc8azsxd.R.inc(10430);instant = iGregorianField.set(instant, min);
            __CLR4_4_17r87r8lc8azsxd.R.inc(10431);if ((((instant < iCutover)&&(__CLR4_4_17r87r8lc8azsxd.R.iget(10432)!=0|true))||(__CLR4_4_17r87r8lc8azsxd.R.iget(10433)==0&false))) {{
                __CLR4_4_17r87r8lc8azsxd.R.inc(10434);min = iGregorianField.get(iCutover);
            }

            }__CLR4_4_17r87r8lc8azsxd.R.inc(10435);return min;
        }finally{__CLR4_4_17r87r8lc8azsxd.R.flushNeeded();}}

        public int getMaximumValue() {try{__CLR4_4_17r87r8lc8azsxd.R.inc(10436);
            // For all precise fields, the Julian and Gregorian limits are
            // identical.
            __CLR4_4_17r87r8lc8azsxd.R.inc(10437);return iGregorianField.getMaximumValue();
        }finally{__CLR4_4_17r87r8lc8azsxd.R.flushNeeded();}}

        public int getMaximumValue(long instant) {try{__CLR4_4_17r87r8lc8azsxd.R.inc(10438);
            __CLR4_4_17r87r8lc8azsxd.R.inc(10439);if ((((instant >= iCutover)&&(__CLR4_4_17r87r8lc8azsxd.R.iget(10440)!=0|true))||(__CLR4_4_17r87r8lc8azsxd.R.iget(10441)==0&false))) {{
                __CLR4_4_17r87r8lc8azsxd.R.inc(10442);return iGregorianField.getMaximumValue(instant);
            }

            }__CLR4_4_17r87r8lc8azsxd.R.inc(10443);int max = iJulianField.getMaximumValue(instant);

            // Because the cutover may reduce the length of this field, verify
            // the maximum by setting it.
            __CLR4_4_17r87r8lc8azsxd.R.inc(10444);instant = iJulianField.set(instant, max);
            __CLR4_4_17r87r8lc8azsxd.R.inc(10445);if ((((instant >= iCutover)&&(__CLR4_4_17r87r8lc8azsxd.R.iget(10446)!=0|true))||(__CLR4_4_17r87r8lc8azsxd.R.iget(10447)==0&false))) {{
                __CLR4_4_17r87r8lc8azsxd.R.inc(10448);max = iJulianField.get(iJulianField.add(iCutover, -1));
            }

            }__CLR4_4_17r87r8lc8azsxd.R.inc(10449);return max;
        }finally{__CLR4_4_17r87r8lc8azsxd.R.flushNeeded();}}

        public int getMaximumValue(ReadablePartial partial) {try{__CLR4_4_17r87r8lc8azsxd.R.inc(10450);
            __CLR4_4_17r87r8lc8azsxd.R.inc(10451);long instant = GJChronology.getInstanceUTC().set(partial, 0L);
            __CLR4_4_17r87r8lc8azsxd.R.inc(10452);return getMaximumValue(instant);
        }finally{__CLR4_4_17r87r8lc8azsxd.R.flushNeeded();}}

        public int getMaximumValue(ReadablePartial partial, int[] values) {try{__CLR4_4_17r87r8lc8azsxd.R.inc(10453);
            __CLR4_4_17r87r8lc8azsxd.R.inc(10454);Chronology chrono = GJChronology.getInstanceUTC();
            __CLR4_4_17r87r8lc8azsxd.R.inc(10455);long instant = 0L;
            __CLR4_4_17r87r8lc8azsxd.R.inc(10456);for (int i = 0, isize = partial.size(); (((i < isize)&&(__CLR4_4_17r87r8lc8azsxd.R.iget(10457)!=0|true))||(__CLR4_4_17r87r8lc8azsxd.R.iget(10458)==0&false)); i++) {{
                __CLR4_4_17r87r8lc8azsxd.R.inc(10459);DateTimeField field = partial.getFieldType(i).getField(chrono);
                __CLR4_4_17r87r8lc8azsxd.R.inc(10460);if ((((values[i] <= field.getMaximumValue(instant))&&(__CLR4_4_17r87r8lc8azsxd.R.iget(10461)!=0|true))||(__CLR4_4_17r87r8lc8azsxd.R.iget(10462)==0&false))) {{
                    __CLR4_4_17r87r8lc8azsxd.R.inc(10463);instant = field.set(instant, values[i]);
                }
            }}
            }__CLR4_4_17r87r8lc8azsxd.R.inc(10464);return getMaximumValue(instant);
        }finally{__CLR4_4_17r87r8lc8azsxd.R.flushNeeded();}}

        public long roundFloor(long instant) {try{__CLR4_4_17r87r8lc8azsxd.R.inc(10465);
            __CLR4_4_17r87r8lc8azsxd.R.inc(10466);if ((((instant >= iCutover)&&(__CLR4_4_17r87r8lc8azsxd.R.iget(10467)!=0|true))||(__CLR4_4_17r87r8lc8azsxd.R.iget(10468)==0&false))) {{
                __CLR4_4_17r87r8lc8azsxd.R.inc(10469);instant = iGregorianField.roundFloor(instant);
                __CLR4_4_17r87r8lc8azsxd.R.inc(10470);if ((((instant < iCutover)&&(__CLR4_4_17r87r8lc8azsxd.R.iget(10471)!=0|true))||(__CLR4_4_17r87r8lc8azsxd.R.iget(10472)==0&false))) {{
                    // Only adjust if gap fully crossed.
                    __CLR4_4_17r87r8lc8azsxd.R.inc(10473);if ((((instant + iGapDuration < iCutover)&&(__CLR4_4_17r87r8lc8azsxd.R.iget(10474)!=0|true))||(__CLR4_4_17r87r8lc8azsxd.R.iget(10475)==0&false))) {{
                        __CLR4_4_17r87r8lc8azsxd.R.inc(10476);instant = gregorianToJulian(instant);
                    }
                }}
            }} }else {{
                __CLR4_4_17r87r8lc8azsxd.R.inc(10477);instant = iJulianField.roundFloor(instant);
            }
            }__CLR4_4_17r87r8lc8azsxd.R.inc(10478);return instant;
        }finally{__CLR4_4_17r87r8lc8azsxd.R.flushNeeded();}}

        public long roundCeiling(long instant) {try{__CLR4_4_17r87r8lc8azsxd.R.inc(10479);
            __CLR4_4_17r87r8lc8azsxd.R.inc(10480);if ((((instant >= iCutover)&&(__CLR4_4_17r87r8lc8azsxd.R.iget(10481)!=0|true))||(__CLR4_4_17r87r8lc8azsxd.R.iget(10482)==0&false))) {{
                __CLR4_4_17r87r8lc8azsxd.R.inc(10483);instant = iGregorianField.roundCeiling(instant);
            } }else {{
                __CLR4_4_17r87r8lc8azsxd.R.inc(10484);instant = iJulianField.roundCeiling(instant);
                __CLR4_4_17r87r8lc8azsxd.R.inc(10485);if ((((instant >= iCutover)&&(__CLR4_4_17r87r8lc8azsxd.R.iget(10486)!=0|true))||(__CLR4_4_17r87r8lc8azsxd.R.iget(10487)==0&false))) {{
                    // Only adjust if gap fully crossed.
                    __CLR4_4_17r87r8lc8azsxd.R.inc(10488);if ((((instant - iGapDuration >= iCutover)&&(__CLR4_4_17r87r8lc8azsxd.R.iget(10489)!=0|true))||(__CLR4_4_17r87r8lc8azsxd.R.iget(10490)==0&false))) {{
                        __CLR4_4_17r87r8lc8azsxd.R.inc(10491);instant = julianToGregorian(instant);
                    }
                }}
            }}
            }__CLR4_4_17r87r8lc8azsxd.R.inc(10492);return instant;
        }finally{__CLR4_4_17r87r8lc8azsxd.R.flushNeeded();}}

        public int getMaximumTextLength(Locale locale) {try{__CLR4_4_17r87r8lc8azsxd.R.inc(10493);
            __CLR4_4_17r87r8lc8azsxd.R.inc(10494);return Math.max(iJulianField.getMaximumTextLength(locale),
                            iGregorianField.getMaximumTextLength(locale));
        }finally{__CLR4_4_17r87r8lc8azsxd.R.flushNeeded();}}

        public int getMaximumShortTextLength(Locale locale) {try{__CLR4_4_17r87r8lc8azsxd.R.inc(10495);
            __CLR4_4_17r87r8lc8azsxd.R.inc(10496);return Math.max(iJulianField.getMaximumShortTextLength(locale),
                            iGregorianField.getMaximumShortTextLength(locale));
        }finally{__CLR4_4_17r87r8lc8azsxd.R.flushNeeded();}}

        protected long julianToGregorian(long instant) {try{__CLR4_4_17r87r8lc8azsxd.R.inc(10497);
            __CLR4_4_17r87r8lc8azsxd.R.inc(10498);if ((((iConvertByWeekyear)&&(__CLR4_4_17r87r8lc8azsxd.R.iget(10499)!=0|true))||(__CLR4_4_17r87r8lc8azsxd.R.iget(10500)==0&false))) {{
                __CLR4_4_17r87r8lc8azsxd.R.inc(10501);return julianToGregorianByWeekyear(instant);
            } }else {{
                __CLR4_4_17r87r8lc8azsxd.R.inc(10502);return julianToGregorianByYear(instant);
            }
        }}finally{__CLR4_4_17r87r8lc8azsxd.R.flushNeeded();}}

        protected long gregorianToJulian(long instant) {try{__CLR4_4_17r87r8lc8azsxd.R.inc(10503);
            __CLR4_4_17r87r8lc8azsxd.R.inc(10504);if ((((iConvertByWeekyear)&&(__CLR4_4_17r87r8lc8azsxd.R.iget(10505)!=0|true))||(__CLR4_4_17r87r8lc8azsxd.R.iget(10506)==0&false))) {{
                __CLR4_4_17r87r8lc8azsxd.R.inc(10507);return gregorianToJulianByWeekyear(instant);
            } }else {{
                __CLR4_4_17r87r8lc8azsxd.R.inc(10508);return gregorianToJulianByYear(instant);
            }
        }}finally{__CLR4_4_17r87r8lc8azsxd.R.flushNeeded();}}
    }

    //-----------------------------------------------------------------------
    /**
     * Cutover field for variable length fields. These fields internally call
     * set whenever add is called. As a result, the same correction applied to
     * set must be applied to add and addWrapField. Knowing when to use this
     * field requires specific knowledge of how the GJ fields are implemented.
     */
    private final class ImpreciseCutoverField extends CutoverField {
        @SuppressWarnings("unused")
        private static final long serialVersionUID = 3410248757173576441L;

        /**
         * Creates a duration field that links back to this.
         */
        ImpreciseCutoverField(DateTimeField julianField, DateTimeField gregorianField, long cutoverMillis) {
            this(julianField, gregorianField, null, cutoverMillis, false);__CLR4_4_17r87r8lc8azsxd.R.inc(10510);try{__CLR4_4_17r87r8lc8azsxd.R.inc(10509);
        }finally{__CLR4_4_17r87r8lc8azsxd.R.flushNeeded();}}

        /**
         * Uses a shared duration field rather than creating a new one.
         *
         * @param durationField shared duration field
         */
        ImpreciseCutoverField(DateTimeField julianField, DateTimeField gregorianField,
                              DurationField durationField, long cutoverMillis)
        {
            this(julianField, gregorianField, durationField, cutoverMillis, false);__CLR4_4_17r87r8lc8azsxd.R.inc(10512);try{__CLR4_4_17r87r8lc8azsxd.R.inc(10511);
        }finally{__CLR4_4_17r87r8lc8azsxd.R.flushNeeded();}}

        /**
         * Uses shared duration fields rather than creating a new one.
         *
         * @param durationField shared duration field
         */
        ImpreciseCutoverField(DateTimeField julianField, DateTimeField gregorianField,
                              DurationField durationField, DurationField rangeDurationField, long cutoverMillis)
        {
            this(julianField, gregorianField, durationField, cutoverMillis, false);__CLR4_4_17r87r8lc8azsxd.R.inc(10514);try{__CLR4_4_17r87r8lc8azsxd.R.inc(10513);
            __CLR4_4_17r87r8lc8azsxd.R.inc(10515);iRangeDurationField = rangeDurationField;
        }finally{__CLR4_4_17r87r8lc8azsxd.R.flushNeeded();}}

        /**
         * Uses a shared duration field rather than creating a new one.
         *
         * @param durationField shared duration field
         */
        ImpreciseCutoverField(DateTimeField julianField, DateTimeField gregorianField,
                              DurationField durationField,
                              long cutoverMillis, boolean convertByWeekyear)
        {
            super(julianField, gregorianField, cutoverMillis, convertByWeekyear);__CLR4_4_17r87r8lc8azsxd.R.inc(10517);try{__CLR4_4_17r87r8lc8azsxd.R.inc(10516);
            __CLR4_4_17r87r8lc8azsxd.R.inc(10518);if ((((durationField == null)&&(__CLR4_4_17r87r8lc8azsxd.R.iget(10519)!=0|true))||(__CLR4_4_17r87r8lc8azsxd.R.iget(10520)==0&false))) {{
                __CLR4_4_17r87r8lc8azsxd.R.inc(10521);durationField = new LinkedDurationField(iDurationField, this);
            }
            }__CLR4_4_17r87r8lc8azsxd.R.inc(10522);iDurationField = durationField;
        }finally{__CLR4_4_17r87r8lc8azsxd.R.flushNeeded();}}

        public long add(long instant, int value) {try{__CLR4_4_17r87r8lc8azsxd.R.inc(10523);
            __CLR4_4_17r87r8lc8azsxd.R.inc(10524);if ((((instant >= iCutover)&&(__CLR4_4_17r87r8lc8azsxd.R.iget(10525)!=0|true))||(__CLR4_4_17r87r8lc8azsxd.R.iget(10526)==0&false))) {{
                __CLR4_4_17r87r8lc8azsxd.R.inc(10527);instant = iGregorianField.add(instant, value);
                __CLR4_4_17r87r8lc8azsxd.R.inc(10528);if ((((instant < iCutover)&&(__CLR4_4_17r87r8lc8azsxd.R.iget(10529)!=0|true))||(__CLR4_4_17r87r8lc8azsxd.R.iget(10530)==0&false))) {{
                    // Only adjust if gap fully crossed.
                    __CLR4_4_17r87r8lc8azsxd.R.inc(10531);if ((((instant + iGapDuration < iCutover)&&(__CLR4_4_17r87r8lc8azsxd.R.iget(10532)!=0|true))||(__CLR4_4_17r87r8lc8azsxd.R.iget(10533)==0&false))) {{
                        __CLR4_4_17r87r8lc8azsxd.R.inc(10534);if ((((iConvertByWeekyear)&&(__CLR4_4_17r87r8lc8azsxd.R.iget(10535)!=0|true))||(__CLR4_4_17r87r8lc8azsxd.R.iget(10536)==0&false))) {{
                            __CLR4_4_17r87r8lc8azsxd.R.inc(10537);int wyear = iGregorianChronology.weekyear().get(instant);
                            __CLR4_4_17r87r8lc8azsxd.R.inc(10538);if ((((wyear <= 0)&&(__CLR4_4_17r87r8lc8azsxd.R.iget(10539)!=0|true))||(__CLR4_4_17r87r8lc8azsxd.R.iget(10540)==0&false))) {{
                                __CLR4_4_17r87r8lc8azsxd.R.inc(10541);instant = iGregorianChronology.weekyear().add(instant, -1);
                            }
                        }} }else {{
                            __CLR4_4_17r87r8lc8azsxd.R.inc(10542);int year = iGregorianChronology.year().get(instant);
                            __CLR4_4_17r87r8lc8azsxd.R.inc(10543);if ((((year <= 0)&&(__CLR4_4_17r87r8lc8azsxd.R.iget(10544)!=0|true))||(__CLR4_4_17r87r8lc8azsxd.R.iget(10545)==0&false))) {{
                                __CLR4_4_17r87r8lc8azsxd.R.inc(10546);instant = iGregorianChronology.year().add(instant, -1);
                            }
                        }}
                        }__CLR4_4_17r87r8lc8azsxd.R.inc(10547);instant = gregorianToJulian(instant);
                    }
                }}
            }} }else {{
                __CLR4_4_17r87r8lc8azsxd.R.inc(10548);instant = iJulianField.add(instant, value);
                __CLR4_4_17r87r8lc8azsxd.R.inc(10549);if ((((instant >= iCutover)&&(__CLR4_4_17r87r8lc8azsxd.R.iget(10550)!=0|true))||(__CLR4_4_17r87r8lc8azsxd.R.iget(10551)==0&false))) {{
                    // Only adjust if gap fully crossed.
                    __CLR4_4_17r87r8lc8azsxd.R.inc(10552);if ((((instant - iGapDuration >= iCutover)&&(__CLR4_4_17r87r8lc8azsxd.R.iget(10553)!=0|true))||(__CLR4_4_17r87r8lc8azsxd.R.iget(10554)==0&false))) {{
                        // no special handling for year zero as cutover always after year zero
                        __CLR4_4_17r87r8lc8azsxd.R.inc(10555);instant = julianToGregorian(instant);
                    }
                }}
            }}
            }__CLR4_4_17r87r8lc8azsxd.R.inc(10556);return instant;
        }finally{__CLR4_4_17r87r8lc8azsxd.R.flushNeeded();}}
        
        public long add(long instant, long value) {try{__CLR4_4_17r87r8lc8azsxd.R.inc(10557);
            __CLR4_4_17r87r8lc8azsxd.R.inc(10558);if ((((instant >= iCutover)&&(__CLR4_4_17r87r8lc8azsxd.R.iget(10559)!=0|true))||(__CLR4_4_17r87r8lc8azsxd.R.iget(10560)==0&false))) {{
                __CLR4_4_17r87r8lc8azsxd.R.inc(10561);instant = iGregorianField.add(instant, value);
                __CLR4_4_17r87r8lc8azsxd.R.inc(10562);if ((((instant < iCutover)&&(__CLR4_4_17r87r8lc8azsxd.R.iget(10563)!=0|true))||(__CLR4_4_17r87r8lc8azsxd.R.iget(10564)==0&false))) {{
                    // Only adjust if gap fully crossed.
                    __CLR4_4_17r87r8lc8azsxd.R.inc(10565);if ((((instant + iGapDuration < iCutover)&&(__CLR4_4_17r87r8lc8azsxd.R.iget(10566)!=0|true))||(__CLR4_4_17r87r8lc8azsxd.R.iget(10567)==0&false))) {{
                        __CLR4_4_17r87r8lc8azsxd.R.inc(10568);if ((((iConvertByWeekyear)&&(__CLR4_4_17r87r8lc8azsxd.R.iget(10569)!=0|true))||(__CLR4_4_17r87r8lc8azsxd.R.iget(10570)==0&false))) {{
                            __CLR4_4_17r87r8lc8azsxd.R.inc(10571);int wyear = iGregorianChronology.weekyear().get(instant);
                            __CLR4_4_17r87r8lc8azsxd.R.inc(10572);if ((((wyear <= 0)&&(__CLR4_4_17r87r8lc8azsxd.R.iget(10573)!=0|true))||(__CLR4_4_17r87r8lc8azsxd.R.iget(10574)==0&false))) {{
                                __CLR4_4_17r87r8lc8azsxd.R.inc(10575);instant = iGregorianChronology.weekyear().add(instant, -1);
                            }
                        }} }else {{
                            __CLR4_4_17r87r8lc8azsxd.R.inc(10576);int year = iGregorianChronology.year().get(instant);
                            __CLR4_4_17r87r8lc8azsxd.R.inc(10577);if ((((year <= 0)&&(__CLR4_4_17r87r8lc8azsxd.R.iget(10578)!=0|true))||(__CLR4_4_17r87r8lc8azsxd.R.iget(10579)==0&false))) {{
                                __CLR4_4_17r87r8lc8azsxd.R.inc(10580);instant = iGregorianChronology.year().add(instant, -1);
                            }
                        }}
                        }__CLR4_4_17r87r8lc8azsxd.R.inc(10581);instant = gregorianToJulian(instant);
                    }
                }}
            }} }else {{
                __CLR4_4_17r87r8lc8azsxd.R.inc(10582);instant = iJulianField.add(instant, value);
                __CLR4_4_17r87r8lc8azsxd.R.inc(10583);if ((((instant >= iCutover)&&(__CLR4_4_17r87r8lc8azsxd.R.iget(10584)!=0|true))||(__CLR4_4_17r87r8lc8azsxd.R.iget(10585)==0&false))) {{
                    // Only adjust if gap fully crossed.
                    __CLR4_4_17r87r8lc8azsxd.R.inc(10586);if ((((instant - iGapDuration >= iCutover)&&(__CLR4_4_17r87r8lc8azsxd.R.iget(10587)!=0|true))||(__CLR4_4_17r87r8lc8azsxd.R.iget(10588)==0&false))) {{
                        // no special handling for year zero as cutover always after year zero
                        __CLR4_4_17r87r8lc8azsxd.R.inc(10589);instant = julianToGregorian(instant);
                    }
                }}
            }}
            }__CLR4_4_17r87r8lc8azsxd.R.inc(10590);return instant;
        }finally{__CLR4_4_17r87r8lc8azsxd.R.flushNeeded();}}

        public int getDifference(long minuendInstant, long subtrahendInstant) {try{__CLR4_4_17r87r8lc8azsxd.R.inc(10591);
            __CLR4_4_17r87r8lc8azsxd.R.inc(10592);if ((((minuendInstant >= iCutover)&&(__CLR4_4_17r87r8lc8azsxd.R.iget(10593)!=0|true))||(__CLR4_4_17r87r8lc8azsxd.R.iget(10594)==0&false))) {{
                __CLR4_4_17r87r8lc8azsxd.R.inc(10595);if ((((subtrahendInstant >= iCutover)&&(__CLR4_4_17r87r8lc8azsxd.R.iget(10596)!=0|true))||(__CLR4_4_17r87r8lc8azsxd.R.iget(10597)==0&false))) {{
                    __CLR4_4_17r87r8lc8azsxd.R.inc(10598);return iGregorianField.getDifference(minuendInstant, subtrahendInstant);
                }
                // Remember, the add is being reversed. Since subtrahend is
                // Julian, convert minuend to Julian to match.
                }__CLR4_4_17r87r8lc8azsxd.R.inc(10599);minuendInstant = gregorianToJulian(minuendInstant);
                __CLR4_4_17r87r8lc8azsxd.R.inc(10600);return iJulianField.getDifference(minuendInstant, subtrahendInstant);
            } }else {{
                __CLR4_4_17r87r8lc8azsxd.R.inc(10601);if ((((subtrahendInstant < iCutover)&&(__CLR4_4_17r87r8lc8azsxd.R.iget(10602)!=0|true))||(__CLR4_4_17r87r8lc8azsxd.R.iget(10603)==0&false))) {{
                    __CLR4_4_17r87r8lc8azsxd.R.inc(10604);return iJulianField.getDifference(minuendInstant, subtrahendInstant);
                }
                // Remember, the add is being reversed. Since subtrahend is
                // Gregorian, convert minuend to Gregorian to match.
                }__CLR4_4_17r87r8lc8azsxd.R.inc(10605);minuendInstant = julianToGregorian(minuendInstant);
                __CLR4_4_17r87r8lc8azsxd.R.inc(10606);return iGregorianField.getDifference(minuendInstant, subtrahendInstant);
            }
        }}finally{__CLR4_4_17r87r8lc8azsxd.R.flushNeeded();}}

        public long getDifferenceAsLong(long minuendInstant, long subtrahendInstant) {try{__CLR4_4_17r87r8lc8azsxd.R.inc(10607);
            __CLR4_4_17r87r8lc8azsxd.R.inc(10608);if ((((minuendInstant >= iCutover)&&(__CLR4_4_17r87r8lc8azsxd.R.iget(10609)!=0|true))||(__CLR4_4_17r87r8lc8azsxd.R.iget(10610)==0&false))) {{
                __CLR4_4_17r87r8lc8azsxd.R.inc(10611);if ((((subtrahendInstant >= iCutover)&&(__CLR4_4_17r87r8lc8azsxd.R.iget(10612)!=0|true))||(__CLR4_4_17r87r8lc8azsxd.R.iget(10613)==0&false))) {{
                    __CLR4_4_17r87r8lc8azsxd.R.inc(10614);return iGregorianField.getDifferenceAsLong(minuendInstant, subtrahendInstant);
                }
                // Remember, the add is being reversed. Since subtrahend is
                // Julian, convert minuend to Julian to match.
                }__CLR4_4_17r87r8lc8azsxd.R.inc(10615);minuendInstant = gregorianToJulian(minuendInstant);
                __CLR4_4_17r87r8lc8azsxd.R.inc(10616);return iJulianField.getDifferenceAsLong(minuendInstant, subtrahendInstant);
            } }else {{
                __CLR4_4_17r87r8lc8azsxd.R.inc(10617);if ((((subtrahendInstant < iCutover)&&(__CLR4_4_17r87r8lc8azsxd.R.iget(10618)!=0|true))||(__CLR4_4_17r87r8lc8azsxd.R.iget(10619)==0&false))) {{
                    __CLR4_4_17r87r8lc8azsxd.R.inc(10620);return iJulianField.getDifferenceAsLong(minuendInstant, subtrahendInstant);
                }
                // Remember, the add is being reversed. Since subtrahend is
                // Gregorian, convert minuend to Gregorian to match.
                }__CLR4_4_17r87r8lc8azsxd.R.inc(10621);minuendInstant = julianToGregorian(minuendInstant);
                __CLR4_4_17r87r8lc8azsxd.R.inc(10622);return iGregorianField.getDifferenceAsLong(minuendInstant, subtrahendInstant);
            }
        }}finally{__CLR4_4_17r87r8lc8azsxd.R.flushNeeded();}}

        // Since the imprecise fields have durations longer than the gap
        // duration, keep these methods simple. The inherited implementations
        // produce incorrect results.
        //
        // Degenerate case: If this field is a month, and the cutover is set
        // far into the future, then the gap duration may be so large as to
        // reduce the number of months in a year. If the missing month(s) are
        // at the beginning or end of the year, then the minimum and maximum
        // values are not 1 and 12. I don't expect this case to ever occur.

        public int getMinimumValue(long instant) {try{__CLR4_4_17r87r8lc8azsxd.R.inc(10623);
            __CLR4_4_17r87r8lc8azsxd.R.inc(10624);if ((((instant >= iCutover)&&(__CLR4_4_17r87r8lc8azsxd.R.iget(10625)!=0|true))||(__CLR4_4_17r87r8lc8azsxd.R.iget(10626)==0&false))) {{
                __CLR4_4_17r87r8lc8azsxd.R.inc(10627);return iGregorianField.getMinimumValue(instant);
            } }else {{
                __CLR4_4_17r87r8lc8azsxd.R.inc(10628);return iJulianField.getMinimumValue(instant);
            }
        }}finally{__CLR4_4_17r87r8lc8azsxd.R.flushNeeded();}}

        public int getMaximumValue(long instant) {try{__CLR4_4_17r87r8lc8azsxd.R.inc(10629);
            __CLR4_4_17r87r8lc8azsxd.R.inc(10630);if ((((instant >= iCutover)&&(__CLR4_4_17r87r8lc8azsxd.R.iget(10631)!=0|true))||(__CLR4_4_17r87r8lc8azsxd.R.iget(10632)==0&false))) {{
                __CLR4_4_17r87r8lc8azsxd.R.inc(10633);return iGregorianField.getMaximumValue(instant);
            } }else {{
                __CLR4_4_17r87r8lc8azsxd.R.inc(10634);return iJulianField.getMaximumValue(instant);
            }
        }}finally{__CLR4_4_17r87r8lc8azsxd.R.flushNeeded();}}
    }

    //-----------------------------------------------------------------------
    /**
     * Links the duration back to a ImpreciseCutoverField.
     */
    private static class LinkedDurationField extends DecoratedDurationField {
        private static final long serialVersionUID = 4097975388007713084L;

        private final ImpreciseCutoverField iField;

        LinkedDurationField(DurationField durationField, ImpreciseCutoverField dateTimeField) {
            super(durationField, durationField.getType());__CLR4_4_17r87r8lc8azsxd.R.inc(10636);try{__CLR4_4_17r87r8lc8azsxd.R.inc(10635);
            __CLR4_4_17r87r8lc8azsxd.R.inc(10637);iField = dateTimeField;
        }finally{__CLR4_4_17r87r8lc8azsxd.R.flushNeeded();}}

        public long add(long instant, int value) {try{__CLR4_4_17r87r8lc8azsxd.R.inc(10638);
            __CLR4_4_17r87r8lc8azsxd.R.inc(10639);return iField.add(instant, value);
        }finally{__CLR4_4_17r87r8lc8azsxd.R.flushNeeded();}}

        public long add(long instant, long value) {try{__CLR4_4_17r87r8lc8azsxd.R.inc(10640);
            __CLR4_4_17r87r8lc8azsxd.R.inc(10641);return iField.add(instant, value);
        }finally{__CLR4_4_17r87r8lc8azsxd.R.flushNeeded();}}

        public int getDifference(long minuendInstant, long subtrahendInstant) {try{__CLR4_4_17r87r8lc8azsxd.R.inc(10642);
            __CLR4_4_17r87r8lc8azsxd.R.inc(10643);return iField.getDifference(minuendInstant, subtrahendInstant);
        }finally{__CLR4_4_17r87r8lc8azsxd.R.flushNeeded();}}

        public long getDifferenceAsLong(long minuendInstant, long subtrahendInstant) {try{__CLR4_4_17r87r8lc8azsxd.R.inc(10644);
            __CLR4_4_17r87r8lc8azsxd.R.inc(10645);return iField.getDifferenceAsLong(minuendInstant, subtrahendInstant);
        }finally{__CLR4_4_17r87r8lc8azsxd.R.flushNeeded();}}
    }

}
