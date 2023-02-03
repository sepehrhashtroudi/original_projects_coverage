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

import java.util.HashMap;
import java.util.Locale;

import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationField;
import org.joda.time.MutableDateTime;
import org.joda.time.ReadableDateTime;
import org.joda.time.field.DecoratedDateTimeField;
import org.joda.time.field.DecoratedDurationField;
import org.joda.time.field.FieldUtils;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.ISODateTimeFormat;

/**
 * Wraps another Chronology to impose limits on the range of instants that
 * the fields within a Chronology may support. The limits are applied to both
 * DateTimeFields and DurationFields.
 * <p>
 * Methods in DateTimeField and DurationField throw an IllegalArgumentException
 * whenever given an input instant that is outside the limits or when an
 * attempt is made to move an instant outside the limits.
 * <p>
 * LimitChronology is thread-safe and immutable.
 *
 * @author Brian S O'Neill
 * @author Stephen Colebourne
 * @since 1.0
 */
public final class LimitChronology extends AssembledChronology {public static class __CLR4_4_18wr8wrlc8azt0z{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672271027956L,8589935092L,11879,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** Serialization lock */
    private static final long serialVersionUID = 7670866536893052522L;

    /**
     * Wraps another chronology, with datetime limits. When withUTC or
     * withZone is called, the returned LimitChronology instance has
     * the same limits, except they are time zone adjusted.
     *
     * @param base  base chronology to wrap
     * @param lowerLimit  inclusive lower limit, or null if none
     * @param upperLimit  exclusive upper limit, or null if none
     * @throws IllegalArgumentException if chronology is null or limits are invalid
     */
    public static LimitChronology getInstance(Chronology base,
                                              ReadableDateTime lowerLimit,
                                              ReadableDateTime upperLimit) {try{__CLR4_4_18wr8wrlc8azt0z.R.inc(11547);
        __CLR4_4_18wr8wrlc8azt0z.R.inc(11548);if ((((base == null)&&(__CLR4_4_18wr8wrlc8azt0z.R.iget(11549)!=0|true))||(__CLR4_4_18wr8wrlc8azt0z.R.iget(11550)==0&false))) {{
            __CLR4_4_18wr8wrlc8azt0z.R.inc(11551);throw new IllegalArgumentException("Must supply a chronology");
        }

        }__CLR4_4_18wr8wrlc8azt0z.R.inc(11552);lowerLimit = (((lowerLimit == null )&&(__CLR4_4_18wr8wrlc8azt0z.R.iget(11553)!=0|true))||(__CLR4_4_18wr8wrlc8azt0z.R.iget(11554)==0&false))? null : lowerLimit.toDateTime();
        __CLR4_4_18wr8wrlc8azt0z.R.inc(11555);upperLimit = (((upperLimit == null )&&(__CLR4_4_18wr8wrlc8azt0z.R.iget(11556)!=0|true))||(__CLR4_4_18wr8wrlc8azt0z.R.iget(11557)==0&false))? null : upperLimit.toDateTime();

        __CLR4_4_18wr8wrlc8azt0z.R.inc(11558);if ((((lowerLimit != null && upperLimit != null)&&(__CLR4_4_18wr8wrlc8azt0z.R.iget(11559)!=0|true))||(__CLR4_4_18wr8wrlc8azt0z.R.iget(11560)==0&false))) {{
            __CLR4_4_18wr8wrlc8azt0z.R.inc(11561);if ((((!lowerLimit.isBefore(upperLimit))&&(__CLR4_4_18wr8wrlc8azt0z.R.iget(11562)!=0|true))||(__CLR4_4_18wr8wrlc8azt0z.R.iget(11563)==0&false))) {{
                __CLR4_4_18wr8wrlc8azt0z.R.inc(11564);throw new IllegalArgumentException
                    ("The lower limit must be come before than the upper limit");
            }
        }}

        }__CLR4_4_18wr8wrlc8azt0z.R.inc(11565);return new LimitChronology(base, (DateTime)lowerLimit, (DateTime)upperLimit);
    }finally{__CLR4_4_18wr8wrlc8azt0z.R.flushNeeded();}}

    final DateTime iLowerLimit;
    final DateTime iUpperLimit;

    private transient LimitChronology iWithUTC;

    /**
     * Wraps another chronology, with datetime limits. When withUTC or
     * withZone is called, the returned LimitChronology instance has
     * the same limits, except they are time zone adjusted.
     *
     * @param lowerLimit  inclusive lower limit, or null if none
     * @param upperLimit  exclusive upper limit, or null if none
     */
    private LimitChronology(Chronology base,
                            DateTime lowerLimit, DateTime upperLimit) {
        super(base, null);__CLR4_4_18wr8wrlc8azt0z.R.inc(11567);try{__CLR4_4_18wr8wrlc8azt0z.R.inc(11566);
        // These can be set after assembly.
        __CLR4_4_18wr8wrlc8azt0z.R.inc(11568);iLowerLimit = lowerLimit;
        __CLR4_4_18wr8wrlc8azt0z.R.inc(11569);iUpperLimit = upperLimit;
    }finally{__CLR4_4_18wr8wrlc8azt0z.R.flushNeeded();}}

    /**
     * Returns the inclusive lower limit instant.
     * 
     * @return lower limit
     */
    public DateTime getLowerLimit() {try{__CLR4_4_18wr8wrlc8azt0z.R.inc(11570);
        __CLR4_4_18wr8wrlc8azt0z.R.inc(11571);return iLowerLimit;
    }finally{__CLR4_4_18wr8wrlc8azt0z.R.flushNeeded();}}

    /**
     * Returns the inclusive upper limit instant.
     * 
     * @return upper limit
     */
    public DateTime getUpperLimit() {try{__CLR4_4_18wr8wrlc8azt0z.R.inc(11572);
        __CLR4_4_18wr8wrlc8azt0z.R.inc(11573);return iUpperLimit;
    }finally{__CLR4_4_18wr8wrlc8azt0z.R.flushNeeded();}}

    /**
     * If this LimitChronology is already UTC, then this is
     * returned. Otherwise, a new instance is returned, with the limits
     * adjusted to the new time zone.
     */
    public Chronology withUTC() {try{__CLR4_4_18wr8wrlc8azt0z.R.inc(11574);
        __CLR4_4_18wr8wrlc8azt0z.R.inc(11575);return withZone(DateTimeZone.UTC);
    }finally{__CLR4_4_18wr8wrlc8azt0z.R.flushNeeded();}}

    /**
     * If this LimitChronology has the same time zone as the one given, then
     * this is returned. Otherwise, a new instance is returned, with the limits
     * adjusted to the new time zone.
     */
    public Chronology withZone(DateTimeZone zone) {try{__CLR4_4_18wr8wrlc8azt0z.R.inc(11576);
        __CLR4_4_18wr8wrlc8azt0z.R.inc(11577);if ((((zone == null)&&(__CLR4_4_18wr8wrlc8azt0z.R.iget(11578)!=0|true))||(__CLR4_4_18wr8wrlc8azt0z.R.iget(11579)==0&false))) {{
            __CLR4_4_18wr8wrlc8azt0z.R.inc(11580);zone = DateTimeZone.getDefault();
        }
        }__CLR4_4_18wr8wrlc8azt0z.R.inc(11581);if ((((zone == getZone())&&(__CLR4_4_18wr8wrlc8azt0z.R.iget(11582)!=0|true))||(__CLR4_4_18wr8wrlc8azt0z.R.iget(11583)==0&false))) {{
            __CLR4_4_18wr8wrlc8azt0z.R.inc(11584);return this;
        }

        }__CLR4_4_18wr8wrlc8azt0z.R.inc(11585);if ((((zone == DateTimeZone.UTC && iWithUTC != null)&&(__CLR4_4_18wr8wrlc8azt0z.R.iget(11586)!=0|true))||(__CLR4_4_18wr8wrlc8azt0z.R.iget(11587)==0&false))) {{
            __CLR4_4_18wr8wrlc8azt0z.R.inc(11588);return iWithUTC;
        }

        }__CLR4_4_18wr8wrlc8azt0z.R.inc(11589);DateTime lowerLimit = iLowerLimit;
        __CLR4_4_18wr8wrlc8azt0z.R.inc(11590);if ((((lowerLimit != null)&&(__CLR4_4_18wr8wrlc8azt0z.R.iget(11591)!=0|true))||(__CLR4_4_18wr8wrlc8azt0z.R.iget(11592)==0&false))) {{
            __CLR4_4_18wr8wrlc8azt0z.R.inc(11593);MutableDateTime mdt = lowerLimit.toMutableDateTime();
            __CLR4_4_18wr8wrlc8azt0z.R.inc(11594);mdt.setZoneRetainFields(zone);
            __CLR4_4_18wr8wrlc8azt0z.R.inc(11595);lowerLimit = mdt.toDateTime();
        }

        }__CLR4_4_18wr8wrlc8azt0z.R.inc(11596);DateTime upperLimit = iUpperLimit;
        __CLR4_4_18wr8wrlc8azt0z.R.inc(11597);if ((((upperLimit != null)&&(__CLR4_4_18wr8wrlc8azt0z.R.iget(11598)!=0|true))||(__CLR4_4_18wr8wrlc8azt0z.R.iget(11599)==0&false))) {{
            __CLR4_4_18wr8wrlc8azt0z.R.inc(11600);MutableDateTime mdt = upperLimit.toMutableDateTime();
            __CLR4_4_18wr8wrlc8azt0z.R.inc(11601);mdt.setZoneRetainFields(zone);
            __CLR4_4_18wr8wrlc8azt0z.R.inc(11602);upperLimit = mdt.toDateTime();
        }
        
        }__CLR4_4_18wr8wrlc8azt0z.R.inc(11603);LimitChronology chrono = getInstance
            (getBase().withZone(zone), lowerLimit, upperLimit);

        __CLR4_4_18wr8wrlc8azt0z.R.inc(11604);if ((((zone == DateTimeZone.UTC)&&(__CLR4_4_18wr8wrlc8azt0z.R.iget(11605)!=0|true))||(__CLR4_4_18wr8wrlc8azt0z.R.iget(11606)==0&false))) {{
            __CLR4_4_18wr8wrlc8azt0z.R.inc(11607);iWithUTC = chrono;
        }

        }__CLR4_4_18wr8wrlc8azt0z.R.inc(11608);return chrono;
    }finally{__CLR4_4_18wr8wrlc8azt0z.R.flushNeeded();}}

    public long getDateTimeMillis(int year, int monthOfYear, int dayOfMonth,
                                  int millisOfDay)
        throws IllegalArgumentException
    {try{__CLR4_4_18wr8wrlc8azt0z.R.inc(11609);
        __CLR4_4_18wr8wrlc8azt0z.R.inc(11610);long instant = getBase().getDateTimeMillis(year, monthOfYear, dayOfMonth, millisOfDay);
        __CLR4_4_18wr8wrlc8azt0z.R.inc(11611);checkLimits(instant, "resulting");
        __CLR4_4_18wr8wrlc8azt0z.R.inc(11612);return instant;
    }finally{__CLR4_4_18wr8wrlc8azt0z.R.flushNeeded();}}

    public long getDateTimeMillis(int year, int monthOfYear, int dayOfMonth,
                                  int hourOfDay, int minuteOfHour,
                                  int secondOfMinute, int millisOfSecond)
        throws IllegalArgumentException
    {try{__CLR4_4_18wr8wrlc8azt0z.R.inc(11613);
        __CLR4_4_18wr8wrlc8azt0z.R.inc(11614);long instant = getBase().getDateTimeMillis
            (year, monthOfYear, dayOfMonth,
             hourOfDay, minuteOfHour, secondOfMinute, millisOfSecond);
        __CLR4_4_18wr8wrlc8azt0z.R.inc(11615);checkLimits(instant, "resulting");
        __CLR4_4_18wr8wrlc8azt0z.R.inc(11616);return instant;
    }finally{__CLR4_4_18wr8wrlc8azt0z.R.flushNeeded();}}

    public long getDateTimeMillis(long instant,
                                  int hourOfDay, int minuteOfHour,
                                  int secondOfMinute, int millisOfSecond)
        throws IllegalArgumentException
    {try{__CLR4_4_18wr8wrlc8azt0z.R.inc(11617);
        __CLR4_4_18wr8wrlc8azt0z.R.inc(11618);checkLimits(instant, null);
        __CLR4_4_18wr8wrlc8azt0z.R.inc(11619);instant = getBase().getDateTimeMillis
            (instant, hourOfDay, minuteOfHour, secondOfMinute, millisOfSecond);
        __CLR4_4_18wr8wrlc8azt0z.R.inc(11620);checkLimits(instant, "resulting");
        __CLR4_4_18wr8wrlc8azt0z.R.inc(11621);return instant;
    }finally{__CLR4_4_18wr8wrlc8azt0z.R.flushNeeded();}}

    protected void assemble(Fields fields) {try{__CLR4_4_18wr8wrlc8azt0z.R.inc(11622);
        // Keep a local cache of converted fields so as not to create redundant
        // objects.
        __CLR4_4_18wr8wrlc8azt0z.R.inc(11623);HashMap<Object, Object> converted = new HashMap<Object, Object>();

        // Convert duration fields...

        __CLR4_4_18wr8wrlc8azt0z.R.inc(11624);fields.eras = convertField(fields.eras, converted);
        __CLR4_4_18wr8wrlc8azt0z.R.inc(11625);fields.centuries = convertField(fields.centuries, converted);
        __CLR4_4_18wr8wrlc8azt0z.R.inc(11626);fields.years = convertField(fields.years, converted);
        __CLR4_4_18wr8wrlc8azt0z.R.inc(11627);fields.months = convertField(fields.months, converted);
        __CLR4_4_18wr8wrlc8azt0z.R.inc(11628);fields.weekyears = convertField(fields.weekyears, converted);
        __CLR4_4_18wr8wrlc8azt0z.R.inc(11629);fields.weeks = convertField(fields.weeks, converted);
        __CLR4_4_18wr8wrlc8azt0z.R.inc(11630);fields.days = convertField(fields.days, converted);

        __CLR4_4_18wr8wrlc8azt0z.R.inc(11631);fields.halfdays = convertField(fields.halfdays, converted);
        __CLR4_4_18wr8wrlc8azt0z.R.inc(11632);fields.hours = convertField(fields.hours, converted);
        __CLR4_4_18wr8wrlc8azt0z.R.inc(11633);fields.minutes = convertField(fields.minutes, converted);
        __CLR4_4_18wr8wrlc8azt0z.R.inc(11634);fields.seconds = convertField(fields.seconds, converted);
        __CLR4_4_18wr8wrlc8azt0z.R.inc(11635);fields.millis = convertField(fields.millis, converted);

        // Convert datetime fields...

        __CLR4_4_18wr8wrlc8azt0z.R.inc(11636);fields.year = convertField(fields.year, converted);
        __CLR4_4_18wr8wrlc8azt0z.R.inc(11637);fields.yearOfEra = convertField(fields.yearOfEra, converted);
        __CLR4_4_18wr8wrlc8azt0z.R.inc(11638);fields.yearOfCentury = convertField(fields.yearOfCentury, converted);
        __CLR4_4_18wr8wrlc8azt0z.R.inc(11639);fields.centuryOfEra = convertField(fields.centuryOfEra, converted);
        __CLR4_4_18wr8wrlc8azt0z.R.inc(11640);fields.era = convertField(fields.era, converted);
        __CLR4_4_18wr8wrlc8azt0z.R.inc(11641);fields.dayOfWeek = convertField(fields.dayOfWeek, converted);
        __CLR4_4_18wr8wrlc8azt0z.R.inc(11642);fields.dayOfMonth = convertField(fields.dayOfMonth, converted);
        __CLR4_4_18wr8wrlc8azt0z.R.inc(11643);fields.dayOfYear = convertField(fields.dayOfYear, converted);
        __CLR4_4_18wr8wrlc8azt0z.R.inc(11644);fields.monthOfYear = convertField(fields.monthOfYear, converted);
        __CLR4_4_18wr8wrlc8azt0z.R.inc(11645);fields.weekOfWeekyear = convertField(fields.weekOfWeekyear, converted);
        __CLR4_4_18wr8wrlc8azt0z.R.inc(11646);fields.weekyear = convertField(fields.weekyear, converted);
        __CLR4_4_18wr8wrlc8azt0z.R.inc(11647);fields.weekyearOfCentury = convertField(fields.weekyearOfCentury, converted);

        __CLR4_4_18wr8wrlc8azt0z.R.inc(11648);fields.millisOfSecond = convertField(fields.millisOfSecond, converted);
        __CLR4_4_18wr8wrlc8azt0z.R.inc(11649);fields.millisOfDay = convertField(fields.millisOfDay, converted);
        __CLR4_4_18wr8wrlc8azt0z.R.inc(11650);fields.secondOfMinute = convertField(fields.secondOfMinute, converted);
        __CLR4_4_18wr8wrlc8azt0z.R.inc(11651);fields.secondOfDay = convertField(fields.secondOfDay, converted);
        __CLR4_4_18wr8wrlc8azt0z.R.inc(11652);fields.minuteOfHour = convertField(fields.minuteOfHour, converted);
        __CLR4_4_18wr8wrlc8azt0z.R.inc(11653);fields.minuteOfDay = convertField(fields.minuteOfDay, converted);
        __CLR4_4_18wr8wrlc8azt0z.R.inc(11654);fields.hourOfDay = convertField(fields.hourOfDay, converted);
        __CLR4_4_18wr8wrlc8azt0z.R.inc(11655);fields.hourOfHalfday = convertField(fields.hourOfHalfday, converted);
        __CLR4_4_18wr8wrlc8azt0z.R.inc(11656);fields.clockhourOfDay = convertField(fields.clockhourOfDay, converted);
        __CLR4_4_18wr8wrlc8azt0z.R.inc(11657);fields.clockhourOfHalfday = convertField(fields.clockhourOfHalfday, converted);
        __CLR4_4_18wr8wrlc8azt0z.R.inc(11658);fields.halfdayOfDay = convertField(fields.halfdayOfDay, converted);
    }finally{__CLR4_4_18wr8wrlc8azt0z.R.flushNeeded();}}

    private DurationField convertField(DurationField field, HashMap<Object, Object> converted) {try{__CLR4_4_18wr8wrlc8azt0z.R.inc(11659);
        __CLR4_4_18wr8wrlc8azt0z.R.inc(11660);if ((((field == null || !field.isSupported())&&(__CLR4_4_18wr8wrlc8azt0z.R.iget(11661)!=0|true))||(__CLR4_4_18wr8wrlc8azt0z.R.iget(11662)==0&false))) {{
            __CLR4_4_18wr8wrlc8azt0z.R.inc(11663);return field;
        }
        }__CLR4_4_18wr8wrlc8azt0z.R.inc(11664);if ((((converted.containsKey(field))&&(__CLR4_4_18wr8wrlc8azt0z.R.iget(11665)!=0|true))||(__CLR4_4_18wr8wrlc8azt0z.R.iget(11666)==0&false))) {{
            __CLR4_4_18wr8wrlc8azt0z.R.inc(11667);return (DurationField)converted.get(field);
        }
        }__CLR4_4_18wr8wrlc8azt0z.R.inc(11668);LimitDurationField limitField = new LimitDurationField(field);
        __CLR4_4_18wr8wrlc8azt0z.R.inc(11669);converted.put(field, limitField);
        __CLR4_4_18wr8wrlc8azt0z.R.inc(11670);return limitField;
    }finally{__CLR4_4_18wr8wrlc8azt0z.R.flushNeeded();}}

    private DateTimeField convertField(DateTimeField field, HashMap<Object, Object> converted) {try{__CLR4_4_18wr8wrlc8azt0z.R.inc(11671);
        __CLR4_4_18wr8wrlc8azt0z.R.inc(11672);if ((((field == null || !field.isSupported())&&(__CLR4_4_18wr8wrlc8azt0z.R.iget(11673)!=0|true))||(__CLR4_4_18wr8wrlc8azt0z.R.iget(11674)==0&false))) {{
            __CLR4_4_18wr8wrlc8azt0z.R.inc(11675);return field;
        }
        }__CLR4_4_18wr8wrlc8azt0z.R.inc(11676);if ((((converted.containsKey(field))&&(__CLR4_4_18wr8wrlc8azt0z.R.iget(11677)!=0|true))||(__CLR4_4_18wr8wrlc8azt0z.R.iget(11678)==0&false))) {{
            __CLR4_4_18wr8wrlc8azt0z.R.inc(11679);return (DateTimeField)converted.get(field);
        }
        }__CLR4_4_18wr8wrlc8azt0z.R.inc(11680);LimitDateTimeField limitField =
            new LimitDateTimeField(field,
                                   convertField(field.getDurationField(), converted),
                                   convertField(field.getRangeDurationField(), converted),
                                   convertField(field.getLeapDurationField(), converted));
        __CLR4_4_18wr8wrlc8azt0z.R.inc(11681);converted.put(field, limitField);
        __CLR4_4_18wr8wrlc8azt0z.R.inc(11682);return limitField;
    }finally{__CLR4_4_18wr8wrlc8azt0z.R.flushNeeded();}}

    void checkLimits(long instant, String desc) {try{__CLR4_4_18wr8wrlc8azt0z.R.inc(11683);
        __CLR4_4_18wr8wrlc8azt0z.R.inc(11684);DateTime limit;
        __CLR4_4_18wr8wrlc8azt0z.R.inc(11685);if ((limit = iLowerLimit) != null && instant < limit.getMillis()) {{
            __CLR4_4_18wr8wrlc8azt0z.R.inc(11688);throw new LimitException(desc, true);
        }
        }__CLR4_4_18wr8wrlc8azt0z.R.inc(11689);if ((limit = iUpperLimit) != null && instant >= limit.getMillis()) {{
            __CLR4_4_18wr8wrlc8azt0z.R.inc(11692);throw new LimitException(desc, false);
        }
    }}finally{__CLR4_4_18wr8wrlc8azt0z.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * A limit chronology is only equal to a limit chronology with the
     * same base chronology and limits.
     * 
     * @param obj  the object to compare to
     * @return true if equal
     * @since 1.4
     */
    public boolean equals(Object obj) {try{__CLR4_4_18wr8wrlc8azt0z.R.inc(11693);
        __CLR4_4_18wr8wrlc8azt0z.R.inc(11694);if ((((this == obj)&&(__CLR4_4_18wr8wrlc8azt0z.R.iget(11695)!=0|true))||(__CLR4_4_18wr8wrlc8azt0z.R.iget(11696)==0&false))) {{
            __CLR4_4_18wr8wrlc8azt0z.R.inc(11697);return true;
        }
        }__CLR4_4_18wr8wrlc8azt0z.R.inc(11698);if ((((obj instanceof LimitChronology == false)&&(__CLR4_4_18wr8wrlc8azt0z.R.iget(11699)!=0|true))||(__CLR4_4_18wr8wrlc8azt0z.R.iget(11700)==0&false))) {{
            __CLR4_4_18wr8wrlc8azt0z.R.inc(11701);return false;
        }
        }__CLR4_4_18wr8wrlc8azt0z.R.inc(11702);LimitChronology chrono = (LimitChronology) obj;
        __CLR4_4_18wr8wrlc8azt0z.R.inc(11703);return
            getBase().equals(chrono.getBase()) &&
            FieldUtils.equals(getLowerLimit(), chrono.getLowerLimit()) &&
            FieldUtils.equals(getUpperLimit(), chrono.getUpperLimit());
    }finally{__CLR4_4_18wr8wrlc8azt0z.R.flushNeeded();}}

    /**
     * A suitable hashcode for the chronology.
     * 
     * @return the hashcode
     * @since 1.4
     */
    public int hashCode() {try{__CLR4_4_18wr8wrlc8azt0z.R.inc(11704);
        __CLR4_4_18wr8wrlc8azt0z.R.inc(11705);int hash = 317351877;
        __CLR4_4_18wr8wrlc8azt0z.R.inc(11706);hash += ((((getLowerLimit() != null )&&(__CLR4_4_18wr8wrlc8azt0z.R.iget(11707)!=0|true))||(__CLR4_4_18wr8wrlc8azt0z.R.iget(11708)==0&false))? getLowerLimit().hashCode() : 0);
        __CLR4_4_18wr8wrlc8azt0z.R.inc(11709);hash += ((((getUpperLimit() != null )&&(__CLR4_4_18wr8wrlc8azt0z.R.iget(11710)!=0|true))||(__CLR4_4_18wr8wrlc8azt0z.R.iget(11711)==0&false))? getUpperLimit().hashCode() : 0);
        __CLR4_4_18wr8wrlc8azt0z.R.inc(11712);hash += getBase().hashCode() * 7;
        __CLR4_4_18wr8wrlc8azt0z.R.inc(11713);return hash;
    }finally{__CLR4_4_18wr8wrlc8azt0z.R.flushNeeded();}}

    /**
     * A debugging string for the chronology.
     * 
     * @return the debugging string
     */
    public String toString() {try{__CLR4_4_18wr8wrlc8azt0z.R.inc(11714);
        __CLR4_4_18wr8wrlc8azt0z.R.inc(11715);return "LimitChronology[" + getBase().toString() + ", " +
            ((((getLowerLimit() == null )&&(__CLR4_4_18wr8wrlc8azt0z.R.iget(11716)!=0|true))||(__CLR4_4_18wr8wrlc8azt0z.R.iget(11717)==0&false))? "NoLimit" : getLowerLimit().toString()) + ", " +
            ((((getUpperLimit() == null )&&(__CLR4_4_18wr8wrlc8azt0z.R.iget(11718)!=0|true))||(__CLR4_4_18wr8wrlc8azt0z.R.iget(11719)==0&false))? "NoLimit" : getUpperLimit().toString()) + ']';
    }finally{__CLR4_4_18wr8wrlc8azt0z.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Extends IllegalArgumentException such that the exception message is not
     * generated unless it is actually requested.
     */
    private class LimitException extends IllegalArgumentException {
        private static final long serialVersionUID = -5924689995607498581L;

        private final boolean iIsLow;

        LimitException(String desc, boolean isLow) {
            super(desc);__CLR4_4_18wr8wrlc8azt0z.R.inc(11721);try{__CLR4_4_18wr8wrlc8azt0z.R.inc(11720);
            __CLR4_4_18wr8wrlc8azt0z.R.inc(11722);iIsLow = isLow;
        }finally{__CLR4_4_18wr8wrlc8azt0z.R.flushNeeded();}}

        public String getMessage() {try{__CLR4_4_18wr8wrlc8azt0z.R.inc(11723);
            __CLR4_4_18wr8wrlc8azt0z.R.inc(11724);StringBuffer buf = new StringBuffer(85);
            __CLR4_4_18wr8wrlc8azt0z.R.inc(11725);buf.append("The");
            __CLR4_4_18wr8wrlc8azt0z.R.inc(11726);String desc = super.getMessage();
            __CLR4_4_18wr8wrlc8azt0z.R.inc(11727);if ((((desc != null)&&(__CLR4_4_18wr8wrlc8azt0z.R.iget(11728)!=0|true))||(__CLR4_4_18wr8wrlc8azt0z.R.iget(11729)==0&false))) {{
                __CLR4_4_18wr8wrlc8azt0z.R.inc(11730);buf.append(' ');
                __CLR4_4_18wr8wrlc8azt0z.R.inc(11731);buf.append(desc);
            }
            }__CLR4_4_18wr8wrlc8azt0z.R.inc(11732);buf.append(" instant is ");

            __CLR4_4_18wr8wrlc8azt0z.R.inc(11733);DateTimeFormatter p = ISODateTimeFormat.dateTime();
            __CLR4_4_18wr8wrlc8azt0z.R.inc(11734);p = p.withChronology(getBase());
            __CLR4_4_18wr8wrlc8azt0z.R.inc(11735);if ((((iIsLow)&&(__CLR4_4_18wr8wrlc8azt0z.R.iget(11736)!=0|true))||(__CLR4_4_18wr8wrlc8azt0z.R.iget(11737)==0&false))) {{
                __CLR4_4_18wr8wrlc8azt0z.R.inc(11738);buf.append("below the supported minimum of ");
                __CLR4_4_18wr8wrlc8azt0z.R.inc(11739);p.printTo(buf, getLowerLimit().getMillis());
            } }else {{
                __CLR4_4_18wr8wrlc8azt0z.R.inc(11740);buf.append("above the supported maximum of ");
                __CLR4_4_18wr8wrlc8azt0z.R.inc(11741);p.printTo(buf, getUpperLimit().getMillis());
            }
            
            }__CLR4_4_18wr8wrlc8azt0z.R.inc(11742);buf.append(" (");
            __CLR4_4_18wr8wrlc8azt0z.R.inc(11743);buf.append(getBase());
            __CLR4_4_18wr8wrlc8azt0z.R.inc(11744);buf.append(')');

            __CLR4_4_18wr8wrlc8azt0z.R.inc(11745);return buf.toString();
        }finally{__CLR4_4_18wr8wrlc8azt0z.R.flushNeeded();}}

        public String toString() {try{__CLR4_4_18wr8wrlc8azt0z.R.inc(11746);
            __CLR4_4_18wr8wrlc8azt0z.R.inc(11747);return "IllegalArgumentException: " + getMessage();
        }finally{__CLR4_4_18wr8wrlc8azt0z.R.flushNeeded();}}
    }

    private class LimitDurationField extends DecoratedDurationField {
        private static final long serialVersionUID = 8049297699408782284L;

        LimitDurationField(DurationField field) {
            super(field, field.getType());__CLR4_4_18wr8wrlc8azt0z.R.inc(11749);try{__CLR4_4_18wr8wrlc8azt0z.R.inc(11748);
        }finally{__CLR4_4_18wr8wrlc8azt0z.R.flushNeeded();}}

        public int getValue(long duration, long instant) {try{__CLR4_4_18wr8wrlc8azt0z.R.inc(11750);
            __CLR4_4_18wr8wrlc8azt0z.R.inc(11751);checkLimits(instant, null);
            __CLR4_4_18wr8wrlc8azt0z.R.inc(11752);return getWrappedField().getValue(duration, instant);
        }finally{__CLR4_4_18wr8wrlc8azt0z.R.flushNeeded();}}

        public long getValueAsLong(long duration, long instant) {try{__CLR4_4_18wr8wrlc8azt0z.R.inc(11753);
            __CLR4_4_18wr8wrlc8azt0z.R.inc(11754);checkLimits(instant, null);
            __CLR4_4_18wr8wrlc8azt0z.R.inc(11755);return getWrappedField().getValueAsLong(duration, instant);
        }finally{__CLR4_4_18wr8wrlc8azt0z.R.flushNeeded();}}

        public long getMillis(int value, long instant) {try{__CLR4_4_18wr8wrlc8azt0z.R.inc(11756);
            __CLR4_4_18wr8wrlc8azt0z.R.inc(11757);checkLimits(instant, null);
            __CLR4_4_18wr8wrlc8azt0z.R.inc(11758);return getWrappedField().getMillis(value, instant);
        }finally{__CLR4_4_18wr8wrlc8azt0z.R.flushNeeded();}}

        public long getMillis(long value, long instant) {try{__CLR4_4_18wr8wrlc8azt0z.R.inc(11759);
            __CLR4_4_18wr8wrlc8azt0z.R.inc(11760);checkLimits(instant, null);
            __CLR4_4_18wr8wrlc8azt0z.R.inc(11761);return getWrappedField().getMillis(value, instant);
        }finally{__CLR4_4_18wr8wrlc8azt0z.R.flushNeeded();}}

        public long add(long instant, int amount) {try{__CLR4_4_18wr8wrlc8azt0z.R.inc(11762);
            __CLR4_4_18wr8wrlc8azt0z.R.inc(11763);checkLimits(instant, null);
            __CLR4_4_18wr8wrlc8azt0z.R.inc(11764);long result = getWrappedField().add(instant, amount);
            __CLR4_4_18wr8wrlc8azt0z.R.inc(11765);checkLimits(result, "resulting");
            __CLR4_4_18wr8wrlc8azt0z.R.inc(11766);return result;
        }finally{__CLR4_4_18wr8wrlc8azt0z.R.flushNeeded();}}

        public long add(long instant, long amount) {try{__CLR4_4_18wr8wrlc8azt0z.R.inc(11767);
            __CLR4_4_18wr8wrlc8azt0z.R.inc(11768);checkLimits(instant, null);
            __CLR4_4_18wr8wrlc8azt0z.R.inc(11769);long result = getWrappedField().add(instant, amount);
            __CLR4_4_18wr8wrlc8azt0z.R.inc(11770);checkLimits(result, "resulting");
            __CLR4_4_18wr8wrlc8azt0z.R.inc(11771);return result;
        }finally{__CLR4_4_18wr8wrlc8azt0z.R.flushNeeded();}}

        public int getDifference(long minuendInstant, long subtrahendInstant) {try{__CLR4_4_18wr8wrlc8azt0z.R.inc(11772);
            __CLR4_4_18wr8wrlc8azt0z.R.inc(11773);checkLimits(minuendInstant, "minuend");
            __CLR4_4_18wr8wrlc8azt0z.R.inc(11774);checkLimits(subtrahendInstant, "subtrahend");
            __CLR4_4_18wr8wrlc8azt0z.R.inc(11775);return getWrappedField().getDifference(minuendInstant, subtrahendInstant);
        }finally{__CLR4_4_18wr8wrlc8azt0z.R.flushNeeded();}}

        public long getDifferenceAsLong(long minuendInstant, long subtrahendInstant) {try{__CLR4_4_18wr8wrlc8azt0z.R.inc(11776);
            __CLR4_4_18wr8wrlc8azt0z.R.inc(11777);checkLimits(minuendInstant, "minuend");
            __CLR4_4_18wr8wrlc8azt0z.R.inc(11778);checkLimits(subtrahendInstant, "subtrahend");
            __CLR4_4_18wr8wrlc8azt0z.R.inc(11779);return getWrappedField().getDifferenceAsLong(minuendInstant, subtrahendInstant);
        }finally{__CLR4_4_18wr8wrlc8azt0z.R.flushNeeded();}}

    }

    private class LimitDateTimeField extends DecoratedDateTimeField {
        @SuppressWarnings("unused")
        private static final long serialVersionUID = -2435306746995699312L;

        private final DurationField iDurationField;
        private final DurationField iRangeDurationField;
        private final DurationField iLeapDurationField;

        LimitDateTimeField(DateTimeField field,
                           DurationField durationField,
                           DurationField rangeDurationField,
                           DurationField leapDurationField) {
            super(field, field.getType());__CLR4_4_18wr8wrlc8azt0z.R.inc(11781);try{__CLR4_4_18wr8wrlc8azt0z.R.inc(11780);
            __CLR4_4_18wr8wrlc8azt0z.R.inc(11782);iDurationField = durationField;
            __CLR4_4_18wr8wrlc8azt0z.R.inc(11783);iRangeDurationField = rangeDurationField;
            __CLR4_4_18wr8wrlc8azt0z.R.inc(11784);iLeapDurationField = leapDurationField;
        }finally{__CLR4_4_18wr8wrlc8azt0z.R.flushNeeded();}}

        public int get(long instant) {try{__CLR4_4_18wr8wrlc8azt0z.R.inc(11785);
            __CLR4_4_18wr8wrlc8azt0z.R.inc(11786);checkLimits(instant, null);
            __CLR4_4_18wr8wrlc8azt0z.R.inc(11787);return getWrappedField().get(instant);
        }finally{__CLR4_4_18wr8wrlc8azt0z.R.flushNeeded();}}
        
        public String getAsText(long instant, Locale locale) {try{__CLR4_4_18wr8wrlc8azt0z.R.inc(11788);
            __CLR4_4_18wr8wrlc8azt0z.R.inc(11789);checkLimits(instant, null);
            __CLR4_4_18wr8wrlc8azt0z.R.inc(11790);return getWrappedField().getAsText(instant, locale);
        }finally{__CLR4_4_18wr8wrlc8azt0z.R.flushNeeded();}}
        
        public String getAsShortText(long instant, Locale locale) {try{__CLR4_4_18wr8wrlc8azt0z.R.inc(11791);
            __CLR4_4_18wr8wrlc8azt0z.R.inc(11792);checkLimits(instant, null);
            __CLR4_4_18wr8wrlc8azt0z.R.inc(11793);return getWrappedField().getAsShortText(instant, locale);
        }finally{__CLR4_4_18wr8wrlc8azt0z.R.flushNeeded();}}
        
        public long add(long instant, int amount) {try{__CLR4_4_18wr8wrlc8azt0z.R.inc(11794);
            __CLR4_4_18wr8wrlc8azt0z.R.inc(11795);checkLimits(instant, null);
            __CLR4_4_18wr8wrlc8azt0z.R.inc(11796);long result = getWrappedField().add(instant, amount);
            __CLR4_4_18wr8wrlc8azt0z.R.inc(11797);checkLimits(result, "resulting");
            __CLR4_4_18wr8wrlc8azt0z.R.inc(11798);return result;
        }finally{__CLR4_4_18wr8wrlc8azt0z.R.flushNeeded();}}

        public long add(long instant, long amount) {try{__CLR4_4_18wr8wrlc8azt0z.R.inc(11799);
            __CLR4_4_18wr8wrlc8azt0z.R.inc(11800);checkLimits(instant, null);
            __CLR4_4_18wr8wrlc8azt0z.R.inc(11801);long result = getWrappedField().add(instant, amount);
            __CLR4_4_18wr8wrlc8azt0z.R.inc(11802);checkLimits(result, "resulting");
            __CLR4_4_18wr8wrlc8azt0z.R.inc(11803);return result;
        }finally{__CLR4_4_18wr8wrlc8azt0z.R.flushNeeded();}}

        public long addWrapField(long instant, int amount) {try{__CLR4_4_18wr8wrlc8azt0z.R.inc(11804);
            __CLR4_4_18wr8wrlc8azt0z.R.inc(11805);checkLimits(instant, null);
            __CLR4_4_18wr8wrlc8azt0z.R.inc(11806);long result = getWrappedField().addWrapField(instant, amount);
            __CLR4_4_18wr8wrlc8azt0z.R.inc(11807);checkLimits(result, "resulting");
            __CLR4_4_18wr8wrlc8azt0z.R.inc(11808);return result;
        }finally{__CLR4_4_18wr8wrlc8azt0z.R.flushNeeded();}}
        
        public int getDifference(long minuendInstant, long subtrahendInstant) {try{__CLR4_4_18wr8wrlc8azt0z.R.inc(11809);
            __CLR4_4_18wr8wrlc8azt0z.R.inc(11810);checkLimits(minuendInstant, "minuend");
            __CLR4_4_18wr8wrlc8azt0z.R.inc(11811);checkLimits(subtrahendInstant, "subtrahend");
            __CLR4_4_18wr8wrlc8azt0z.R.inc(11812);return getWrappedField().getDifference(minuendInstant, subtrahendInstant);
        }finally{__CLR4_4_18wr8wrlc8azt0z.R.flushNeeded();}}
        
        public long getDifferenceAsLong(long minuendInstant, long subtrahendInstant) {try{__CLR4_4_18wr8wrlc8azt0z.R.inc(11813);
            __CLR4_4_18wr8wrlc8azt0z.R.inc(11814);checkLimits(minuendInstant, "minuend");
            __CLR4_4_18wr8wrlc8azt0z.R.inc(11815);checkLimits(subtrahendInstant, "subtrahend");
            __CLR4_4_18wr8wrlc8azt0z.R.inc(11816);return getWrappedField().getDifferenceAsLong(minuendInstant, subtrahendInstant);
        }finally{__CLR4_4_18wr8wrlc8azt0z.R.flushNeeded();}}
        
        public long set(long instant, int value) {try{__CLR4_4_18wr8wrlc8azt0z.R.inc(11817);
            __CLR4_4_18wr8wrlc8azt0z.R.inc(11818);checkLimits(instant, null);
            __CLR4_4_18wr8wrlc8azt0z.R.inc(11819);long result = getWrappedField().set(instant, value);
            __CLR4_4_18wr8wrlc8azt0z.R.inc(11820);checkLimits(result, "resulting");
            __CLR4_4_18wr8wrlc8azt0z.R.inc(11821);return result;
        }finally{__CLR4_4_18wr8wrlc8azt0z.R.flushNeeded();}}
        
        public long set(long instant, String text, Locale locale) {try{__CLR4_4_18wr8wrlc8azt0z.R.inc(11822);
            __CLR4_4_18wr8wrlc8azt0z.R.inc(11823);checkLimits(instant, null);
            __CLR4_4_18wr8wrlc8azt0z.R.inc(11824);long result = getWrappedField().set(instant, text, locale);
            __CLR4_4_18wr8wrlc8azt0z.R.inc(11825);checkLimits(result, "resulting");
            __CLR4_4_18wr8wrlc8azt0z.R.inc(11826);return result;
        }finally{__CLR4_4_18wr8wrlc8azt0z.R.flushNeeded();}}
        
        public final DurationField getDurationField() {try{__CLR4_4_18wr8wrlc8azt0z.R.inc(11827);
            __CLR4_4_18wr8wrlc8azt0z.R.inc(11828);return iDurationField;
        }finally{__CLR4_4_18wr8wrlc8azt0z.R.flushNeeded();}}

        public final DurationField getRangeDurationField() {try{__CLR4_4_18wr8wrlc8azt0z.R.inc(11829);
            __CLR4_4_18wr8wrlc8azt0z.R.inc(11830);return iRangeDurationField;
        }finally{__CLR4_4_18wr8wrlc8azt0z.R.flushNeeded();}}

        public boolean isLeap(long instant) {try{__CLR4_4_18wr8wrlc8azt0z.R.inc(11831);
            __CLR4_4_18wr8wrlc8azt0z.R.inc(11832);checkLimits(instant, null);
            __CLR4_4_18wr8wrlc8azt0z.R.inc(11833);return getWrappedField().isLeap(instant);
        }finally{__CLR4_4_18wr8wrlc8azt0z.R.flushNeeded();}}
        
        public int getLeapAmount(long instant) {try{__CLR4_4_18wr8wrlc8azt0z.R.inc(11834);
            __CLR4_4_18wr8wrlc8azt0z.R.inc(11835);checkLimits(instant, null);
            __CLR4_4_18wr8wrlc8azt0z.R.inc(11836);return getWrappedField().getLeapAmount(instant);
        }finally{__CLR4_4_18wr8wrlc8azt0z.R.flushNeeded();}}
        
        public final DurationField getLeapDurationField() {try{__CLR4_4_18wr8wrlc8azt0z.R.inc(11837);
            __CLR4_4_18wr8wrlc8azt0z.R.inc(11838);return iLeapDurationField;
        }finally{__CLR4_4_18wr8wrlc8azt0z.R.flushNeeded();}}
        
        public long roundFloor(long instant) {try{__CLR4_4_18wr8wrlc8azt0z.R.inc(11839);
            __CLR4_4_18wr8wrlc8azt0z.R.inc(11840);checkLimits(instant, null);
            __CLR4_4_18wr8wrlc8azt0z.R.inc(11841);long result = getWrappedField().roundFloor(instant);
            __CLR4_4_18wr8wrlc8azt0z.R.inc(11842);checkLimits(result, "resulting");
            __CLR4_4_18wr8wrlc8azt0z.R.inc(11843);return result;
        }finally{__CLR4_4_18wr8wrlc8azt0z.R.flushNeeded();}}
        
        public long roundCeiling(long instant) {try{__CLR4_4_18wr8wrlc8azt0z.R.inc(11844);
            __CLR4_4_18wr8wrlc8azt0z.R.inc(11845);checkLimits(instant, null);
            __CLR4_4_18wr8wrlc8azt0z.R.inc(11846);long result = getWrappedField().roundCeiling(instant);
            __CLR4_4_18wr8wrlc8azt0z.R.inc(11847);checkLimits(result, "resulting");
            __CLR4_4_18wr8wrlc8azt0z.R.inc(11848);return result;
        }finally{__CLR4_4_18wr8wrlc8azt0z.R.flushNeeded();}}
        
        public long roundHalfFloor(long instant) {try{__CLR4_4_18wr8wrlc8azt0z.R.inc(11849);
            __CLR4_4_18wr8wrlc8azt0z.R.inc(11850);checkLimits(instant, null);
            __CLR4_4_18wr8wrlc8azt0z.R.inc(11851);long result = getWrappedField().roundHalfFloor(instant);
            __CLR4_4_18wr8wrlc8azt0z.R.inc(11852);checkLimits(result, "resulting");
            __CLR4_4_18wr8wrlc8azt0z.R.inc(11853);return result;
        }finally{__CLR4_4_18wr8wrlc8azt0z.R.flushNeeded();}}
        
        public long roundHalfCeiling(long instant) {try{__CLR4_4_18wr8wrlc8azt0z.R.inc(11854);
            __CLR4_4_18wr8wrlc8azt0z.R.inc(11855);checkLimits(instant, null);
            __CLR4_4_18wr8wrlc8azt0z.R.inc(11856);long result = getWrappedField().roundHalfCeiling(instant);
            __CLR4_4_18wr8wrlc8azt0z.R.inc(11857);checkLimits(result, "resulting");
            __CLR4_4_18wr8wrlc8azt0z.R.inc(11858);return result;
        }finally{__CLR4_4_18wr8wrlc8azt0z.R.flushNeeded();}}
        
        public long roundHalfEven(long instant) {try{__CLR4_4_18wr8wrlc8azt0z.R.inc(11859);
            __CLR4_4_18wr8wrlc8azt0z.R.inc(11860);checkLimits(instant, null);
            __CLR4_4_18wr8wrlc8azt0z.R.inc(11861);long result = getWrappedField().roundHalfEven(instant);
            __CLR4_4_18wr8wrlc8azt0z.R.inc(11862);checkLimits(result, "resulting");
            __CLR4_4_18wr8wrlc8azt0z.R.inc(11863);return result;
        }finally{__CLR4_4_18wr8wrlc8azt0z.R.flushNeeded();}}
        
        public long remainder(long instant) {try{__CLR4_4_18wr8wrlc8azt0z.R.inc(11864);
            __CLR4_4_18wr8wrlc8azt0z.R.inc(11865);checkLimits(instant, null);
            __CLR4_4_18wr8wrlc8azt0z.R.inc(11866);long result = getWrappedField().remainder(instant);
            __CLR4_4_18wr8wrlc8azt0z.R.inc(11867);checkLimits(result, "resulting");
            __CLR4_4_18wr8wrlc8azt0z.R.inc(11868);return result;
        }finally{__CLR4_4_18wr8wrlc8azt0z.R.flushNeeded();}}

        public int getMinimumValue(long instant) {try{__CLR4_4_18wr8wrlc8azt0z.R.inc(11869);
            __CLR4_4_18wr8wrlc8azt0z.R.inc(11870);checkLimits(instant, null);
            __CLR4_4_18wr8wrlc8azt0z.R.inc(11871);return getWrappedField().getMinimumValue(instant);
        }finally{__CLR4_4_18wr8wrlc8azt0z.R.flushNeeded();}}

        public int getMaximumValue(long instant) {try{__CLR4_4_18wr8wrlc8azt0z.R.inc(11872);
            __CLR4_4_18wr8wrlc8azt0z.R.inc(11873);checkLimits(instant, null);
            __CLR4_4_18wr8wrlc8azt0z.R.inc(11874);return getWrappedField().getMaximumValue(instant);
        }finally{__CLR4_4_18wr8wrlc8azt0z.R.flushNeeded();}}

        public int getMaximumTextLength(Locale locale) {try{__CLR4_4_18wr8wrlc8azt0z.R.inc(11875);
            __CLR4_4_18wr8wrlc8azt0z.R.inc(11876);return getWrappedField().getMaximumTextLength(locale);
        }finally{__CLR4_4_18wr8wrlc8azt0z.R.flushNeeded();}}

        public int getMaximumShortTextLength(Locale locale) {try{__CLR4_4_18wr8wrlc8azt0z.R.inc(11877);
            __CLR4_4_18wr8wrlc8azt0z.R.inc(11878);return getWrappedField().getMaximumShortTextLength(locale);
        }finally{__CLR4_4_18wr8wrlc8azt0z.R.flushNeeded();}}

    }

}
