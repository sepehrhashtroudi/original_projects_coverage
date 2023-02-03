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
import org.joda.time.DateTimeConstants;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationField;
import org.joda.time.IllegalFieldValueException;
import org.joda.time.IllegalInstantException;
import org.joda.time.ReadablePartial;
import org.joda.time.field.BaseDateTimeField;
import org.joda.time.field.BaseDurationField;

/**
 * Wraps another Chronology to add support for time zones.
 * <p>
 * ZonedChronology is thread-safe and immutable.
 *
 * @author Brian S O'Neill
 * @author Stephen Colebourne
 * @since 1.0
 */
public final class ZonedChronology extends AssembledChronology {public static class __CLR4_4_1980980lc8azt24{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672271027956L,8589935092L,12317,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** Serialization lock */
    private static final long serialVersionUID = -1079258847191166848L;

    /**
     * Create a ZonedChronology for any chronology, overriding any time zone it
     * may already have.
     *
     * @param base base chronology to wrap
     * @param zone the time zone
     * @throws IllegalArgumentException if chronology or time zone is null
     */
    public static ZonedChronology getInstance(Chronology base, DateTimeZone zone) {try{__CLR4_4_1980980lc8azt24.R.inc(11952);
        __CLR4_4_1980980lc8azt24.R.inc(11953);if ((((base == null)&&(__CLR4_4_1980980lc8azt24.R.iget(11954)!=0|true))||(__CLR4_4_1980980lc8azt24.R.iget(11955)==0&false))) {{
            __CLR4_4_1980980lc8azt24.R.inc(11956);throw new IllegalArgumentException("Must supply a chronology");
        }
        }__CLR4_4_1980980lc8azt24.R.inc(11957);base = base.withUTC();
        __CLR4_4_1980980lc8azt24.R.inc(11958);if ((((base == null)&&(__CLR4_4_1980980lc8azt24.R.iget(11959)!=0|true))||(__CLR4_4_1980980lc8azt24.R.iget(11960)==0&false))) {{
            __CLR4_4_1980980lc8azt24.R.inc(11961);throw new IllegalArgumentException("UTC chronology must not be null");
        }
        }__CLR4_4_1980980lc8azt24.R.inc(11962);if ((((zone == null)&&(__CLR4_4_1980980lc8azt24.R.iget(11963)!=0|true))||(__CLR4_4_1980980lc8azt24.R.iget(11964)==0&false))) {{
            __CLR4_4_1980980lc8azt24.R.inc(11965);throw new IllegalArgumentException("DateTimeZone must not be null");
        }
        }__CLR4_4_1980980lc8azt24.R.inc(11966);return new ZonedChronology(base, zone);
    }finally{__CLR4_4_1980980lc8azt24.R.flushNeeded();}}

    static boolean useTimeArithmetic(DurationField field) {try{__CLR4_4_1980980lc8azt24.R.inc(11967);
        // Use time of day arithmetic rules for unit durations less than
        // typical time zone offsets.
        __CLR4_4_1980980lc8azt24.R.inc(11968);return field != null && field.getUnitMillis() < DateTimeConstants.MILLIS_PER_HOUR * 12;
    }finally{__CLR4_4_1980980lc8azt24.R.flushNeeded();}}

    /**
     * Restricted constructor
     *
     * @param base base chronology to wrap
     * @param zone the time zone
     */
    private ZonedChronology(Chronology base, DateTimeZone zone) {
        super(base, zone);__CLR4_4_1980980lc8azt24.R.inc(11970);try{__CLR4_4_1980980lc8azt24.R.inc(11969);
    }finally{__CLR4_4_1980980lc8azt24.R.flushNeeded();}}

    public DateTimeZone getZone() {try{__CLR4_4_1980980lc8azt24.R.inc(11971);
        __CLR4_4_1980980lc8azt24.R.inc(11972);return (DateTimeZone)getParam();
    }finally{__CLR4_4_1980980lc8azt24.R.flushNeeded();}}

    public Chronology withUTC() {try{__CLR4_4_1980980lc8azt24.R.inc(11973);
        __CLR4_4_1980980lc8azt24.R.inc(11974);return getBase();
    }finally{__CLR4_4_1980980lc8azt24.R.flushNeeded();}}

    public Chronology withZone(DateTimeZone zone) {try{__CLR4_4_1980980lc8azt24.R.inc(11975);
        __CLR4_4_1980980lc8azt24.R.inc(11976);if ((((zone == null)&&(__CLR4_4_1980980lc8azt24.R.iget(11977)!=0|true))||(__CLR4_4_1980980lc8azt24.R.iget(11978)==0&false))) {{
            __CLR4_4_1980980lc8azt24.R.inc(11979);zone = DateTimeZone.getDefault();
        }
        }__CLR4_4_1980980lc8azt24.R.inc(11980);if ((((zone == getParam())&&(__CLR4_4_1980980lc8azt24.R.iget(11981)!=0|true))||(__CLR4_4_1980980lc8azt24.R.iget(11982)==0&false))) {{
            __CLR4_4_1980980lc8azt24.R.inc(11983);return this;
        }
        }__CLR4_4_1980980lc8azt24.R.inc(11984);if ((((zone == DateTimeZone.UTC)&&(__CLR4_4_1980980lc8azt24.R.iget(11985)!=0|true))||(__CLR4_4_1980980lc8azt24.R.iget(11986)==0&false))) {{
            __CLR4_4_1980980lc8azt24.R.inc(11987);return getBase();
        }
        }__CLR4_4_1980980lc8azt24.R.inc(11988);return new ZonedChronology(getBase(), zone);
    }finally{__CLR4_4_1980980lc8azt24.R.flushNeeded();}}

    public long getDateTimeMillis(int year, int monthOfYear, int dayOfMonth,
                                  int millisOfDay)
        throws IllegalArgumentException
    {try{__CLR4_4_1980980lc8azt24.R.inc(11989);
        __CLR4_4_1980980lc8azt24.R.inc(11990);return localToUTC(getBase().getDateTimeMillis
                          (year, monthOfYear, dayOfMonth, millisOfDay));
    }finally{__CLR4_4_1980980lc8azt24.R.flushNeeded();}}

    public long getDateTimeMillis(int year, int monthOfYear, int dayOfMonth,
                                  int hourOfDay, int minuteOfHour,
                                  int secondOfMinute, int millisOfSecond)
        throws IllegalArgumentException
    {try{__CLR4_4_1980980lc8azt24.R.inc(11991);
        __CLR4_4_1980980lc8azt24.R.inc(11992);return localToUTC(getBase().getDateTimeMillis
                          (year, monthOfYear, dayOfMonth, 
                           hourOfDay, minuteOfHour, secondOfMinute, millisOfSecond));
    }finally{__CLR4_4_1980980lc8azt24.R.flushNeeded();}}

    public long getDateTimeMillis(long instant,
                                  int hourOfDay, int minuteOfHour,
                                  int secondOfMinute, int millisOfSecond)
        throws IllegalArgumentException
    {try{__CLR4_4_1980980lc8azt24.R.inc(11993);
        __CLR4_4_1980980lc8azt24.R.inc(11994);return localToUTC(getBase().getDateTimeMillis
                          (instant + getZone().getOffset(instant),
                           hourOfDay, minuteOfHour, secondOfMinute, millisOfSecond));
    }finally{__CLR4_4_1980980lc8azt24.R.flushNeeded();}}

    /**
     * @param localInstant  the instant from 1970-01-01T00:00:00 local time
     * @return the instant from 1970-01-01T00:00:00Z
     */
    private long localToUTC(long localInstant) {try{__CLR4_4_1980980lc8azt24.R.inc(11995);
        __CLR4_4_1980980lc8azt24.R.inc(11996);DateTimeZone zone = getZone();
        __CLR4_4_1980980lc8azt24.R.inc(11997);int offset = zone.getOffsetFromLocal(localInstant);
        __CLR4_4_1980980lc8azt24.R.inc(11998);localInstant -= offset;
        __CLR4_4_1980980lc8azt24.R.inc(11999);if ((((offset != zone.getOffset(localInstant))&&(__CLR4_4_1980980lc8azt24.R.iget(12000)!=0|true))||(__CLR4_4_1980980lc8azt24.R.iget(12001)==0&false))) {{
            __CLR4_4_1980980lc8azt24.R.inc(12002);throw new IllegalInstantException(localInstant, zone.getID());
        }
        }__CLR4_4_1980980lc8azt24.R.inc(12003);return localInstant;
    }finally{__CLR4_4_1980980lc8azt24.R.flushNeeded();}}

    protected void assemble(Fields fields) {try{__CLR4_4_1980980lc8azt24.R.inc(12004);
        // Keep a local cache of converted fields so as not to create redundant
        // objects.
        __CLR4_4_1980980lc8azt24.R.inc(12005);HashMap<Object, Object> converted = new HashMap<Object, Object>();

        // Convert duration fields...

        __CLR4_4_1980980lc8azt24.R.inc(12006);fields.eras = convertField(fields.eras, converted);
        __CLR4_4_1980980lc8azt24.R.inc(12007);fields.centuries = convertField(fields.centuries, converted);
        __CLR4_4_1980980lc8azt24.R.inc(12008);fields.years = convertField(fields.years, converted);
        __CLR4_4_1980980lc8azt24.R.inc(12009);fields.months = convertField(fields.months, converted);
        __CLR4_4_1980980lc8azt24.R.inc(12010);fields.weekyears = convertField(fields.weekyears, converted);
        __CLR4_4_1980980lc8azt24.R.inc(12011);fields.weeks = convertField(fields.weeks, converted);
        __CLR4_4_1980980lc8azt24.R.inc(12012);fields.days = convertField(fields.days, converted);

        __CLR4_4_1980980lc8azt24.R.inc(12013);fields.halfdays = convertField(fields.halfdays, converted);
        __CLR4_4_1980980lc8azt24.R.inc(12014);fields.hours = convertField(fields.hours, converted);
        __CLR4_4_1980980lc8azt24.R.inc(12015);fields.minutes = convertField(fields.minutes, converted);
        __CLR4_4_1980980lc8azt24.R.inc(12016);fields.seconds = convertField(fields.seconds, converted);
        __CLR4_4_1980980lc8azt24.R.inc(12017);fields.millis = convertField(fields.millis, converted);

        // Convert datetime fields...

        __CLR4_4_1980980lc8azt24.R.inc(12018);fields.year = convertField(fields.year, converted);
        __CLR4_4_1980980lc8azt24.R.inc(12019);fields.yearOfEra = convertField(fields.yearOfEra, converted);
        __CLR4_4_1980980lc8azt24.R.inc(12020);fields.yearOfCentury = convertField(fields.yearOfCentury, converted);
        __CLR4_4_1980980lc8azt24.R.inc(12021);fields.centuryOfEra = convertField(fields.centuryOfEra, converted);
        __CLR4_4_1980980lc8azt24.R.inc(12022);fields.era = convertField(fields.era, converted);
        __CLR4_4_1980980lc8azt24.R.inc(12023);fields.dayOfWeek = convertField(fields.dayOfWeek, converted);
        __CLR4_4_1980980lc8azt24.R.inc(12024);fields.dayOfMonth = convertField(fields.dayOfMonth, converted);
        __CLR4_4_1980980lc8azt24.R.inc(12025);fields.dayOfYear = convertField(fields.dayOfYear, converted);
        __CLR4_4_1980980lc8azt24.R.inc(12026);fields.monthOfYear = convertField(fields.monthOfYear, converted);
        __CLR4_4_1980980lc8azt24.R.inc(12027);fields.weekOfWeekyear = convertField(fields.weekOfWeekyear, converted);
        __CLR4_4_1980980lc8azt24.R.inc(12028);fields.weekyear = convertField(fields.weekyear, converted);
        __CLR4_4_1980980lc8azt24.R.inc(12029);fields.weekyearOfCentury = convertField(fields.weekyearOfCentury, converted);

        __CLR4_4_1980980lc8azt24.R.inc(12030);fields.millisOfSecond = convertField(fields.millisOfSecond, converted);
        __CLR4_4_1980980lc8azt24.R.inc(12031);fields.millisOfDay = convertField(fields.millisOfDay, converted);
        __CLR4_4_1980980lc8azt24.R.inc(12032);fields.secondOfMinute = convertField(fields.secondOfMinute, converted);
        __CLR4_4_1980980lc8azt24.R.inc(12033);fields.secondOfDay = convertField(fields.secondOfDay, converted);
        __CLR4_4_1980980lc8azt24.R.inc(12034);fields.minuteOfHour = convertField(fields.minuteOfHour, converted);
        __CLR4_4_1980980lc8azt24.R.inc(12035);fields.minuteOfDay = convertField(fields.minuteOfDay, converted);
        __CLR4_4_1980980lc8azt24.R.inc(12036);fields.hourOfDay = convertField(fields.hourOfDay, converted);
        __CLR4_4_1980980lc8azt24.R.inc(12037);fields.hourOfHalfday = convertField(fields.hourOfHalfday, converted);
        __CLR4_4_1980980lc8azt24.R.inc(12038);fields.clockhourOfDay = convertField(fields.clockhourOfDay, converted);
        __CLR4_4_1980980lc8azt24.R.inc(12039);fields.clockhourOfHalfday = convertField(fields.clockhourOfHalfday, converted);
        __CLR4_4_1980980lc8azt24.R.inc(12040);fields.halfdayOfDay = convertField(fields.halfdayOfDay, converted);
    }finally{__CLR4_4_1980980lc8azt24.R.flushNeeded();}}

    private DurationField convertField(DurationField field, HashMap<Object, Object> converted) {try{__CLR4_4_1980980lc8azt24.R.inc(12041);
        __CLR4_4_1980980lc8azt24.R.inc(12042);if ((((field == null || !field.isSupported())&&(__CLR4_4_1980980lc8azt24.R.iget(12043)!=0|true))||(__CLR4_4_1980980lc8azt24.R.iget(12044)==0&false))) {{
            __CLR4_4_1980980lc8azt24.R.inc(12045);return field;
        }
        }__CLR4_4_1980980lc8azt24.R.inc(12046);if ((((converted.containsKey(field))&&(__CLR4_4_1980980lc8azt24.R.iget(12047)!=0|true))||(__CLR4_4_1980980lc8azt24.R.iget(12048)==0&false))) {{
            __CLR4_4_1980980lc8azt24.R.inc(12049);return (DurationField)converted.get(field);
        }
        }__CLR4_4_1980980lc8azt24.R.inc(12050);ZonedDurationField zonedField = new ZonedDurationField(field, getZone());
        __CLR4_4_1980980lc8azt24.R.inc(12051);converted.put(field, zonedField);
        __CLR4_4_1980980lc8azt24.R.inc(12052);return zonedField;
    }finally{__CLR4_4_1980980lc8azt24.R.flushNeeded();}}

    private DateTimeField convertField(DateTimeField field, HashMap<Object, Object> converted) {try{__CLR4_4_1980980lc8azt24.R.inc(12053);
        __CLR4_4_1980980lc8azt24.R.inc(12054);if ((((field == null || !field.isSupported())&&(__CLR4_4_1980980lc8azt24.R.iget(12055)!=0|true))||(__CLR4_4_1980980lc8azt24.R.iget(12056)==0&false))) {{
            __CLR4_4_1980980lc8azt24.R.inc(12057);return field;
        }
        }__CLR4_4_1980980lc8azt24.R.inc(12058);if ((((converted.containsKey(field))&&(__CLR4_4_1980980lc8azt24.R.iget(12059)!=0|true))||(__CLR4_4_1980980lc8azt24.R.iget(12060)==0&false))) {{
            __CLR4_4_1980980lc8azt24.R.inc(12061);return (DateTimeField)converted.get(field);
        }
        }__CLR4_4_1980980lc8azt24.R.inc(12062);ZonedDateTimeField zonedField =
            new ZonedDateTimeField(field, getZone(),
                                   convertField(field.getDurationField(), converted),
                                   convertField(field.getRangeDurationField(), converted),
                                   convertField(field.getLeapDurationField(), converted));
        __CLR4_4_1980980lc8azt24.R.inc(12063);converted.put(field, zonedField);
        __CLR4_4_1980980lc8azt24.R.inc(12064);return zonedField;
    }finally{__CLR4_4_1980980lc8azt24.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * A zoned chronology is only equal to a zoned chronology with the
     * same base chronology and zone.
     * 
     * @param obj  the object to compare to
     * @return true if equal
     * @since 1.4
     */
    public boolean equals(Object obj) {try{__CLR4_4_1980980lc8azt24.R.inc(12065);
        __CLR4_4_1980980lc8azt24.R.inc(12066);if ((((this == obj)&&(__CLR4_4_1980980lc8azt24.R.iget(12067)!=0|true))||(__CLR4_4_1980980lc8azt24.R.iget(12068)==0&false))) {{
            __CLR4_4_1980980lc8azt24.R.inc(12069);return true;
        }
        }__CLR4_4_1980980lc8azt24.R.inc(12070);if ((((obj instanceof ZonedChronology == false)&&(__CLR4_4_1980980lc8azt24.R.iget(12071)!=0|true))||(__CLR4_4_1980980lc8azt24.R.iget(12072)==0&false))) {{
            __CLR4_4_1980980lc8azt24.R.inc(12073);return false;
        }
        }__CLR4_4_1980980lc8azt24.R.inc(12074);ZonedChronology chrono = (ZonedChronology) obj;
        __CLR4_4_1980980lc8azt24.R.inc(12075);return
            getBase().equals(chrono.getBase()) &&
            getZone().equals(chrono.getZone());
    }finally{__CLR4_4_1980980lc8azt24.R.flushNeeded();}}

    /**
     * A suitable hashcode for the chronology.
     * 
     * @return the hashcode
     * @since 1.4
     */
    public int hashCode() {try{__CLR4_4_1980980lc8azt24.R.inc(12076);
        __CLR4_4_1980980lc8azt24.R.inc(12077);return 326565 + getZone().hashCode() * 11 + getBase().hashCode() * 7;
    }finally{__CLR4_4_1980980lc8azt24.R.flushNeeded();}}

    /**
     * A debugging string for the chronology.
     * 
     * @return the debugging string
     */
    public String toString() {try{__CLR4_4_1980980lc8azt24.R.inc(12078);
        __CLR4_4_1980980lc8azt24.R.inc(12079);return "ZonedChronology[" + getBase() + ", " + getZone().getID() + ']';
    }finally{__CLR4_4_1980980lc8azt24.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /*
     * Because time durations are typically smaller than time zone offsets, the
     * arithmetic methods subtract the original offset. This produces a more
     * expected behavior when crossing time zone offset transitions. For dates,
     * the new offset is subtracted off. This behavior, if applied to time
     * fields, can nullify or reverse an add when crossing a transition.
     */
    static class ZonedDurationField extends BaseDurationField {
        private static final long serialVersionUID = -485345310999208286L;

        final DurationField iField;
        final boolean iTimeField;
        final DateTimeZone iZone;

        ZonedDurationField(DurationField field, DateTimeZone zone) {
            super(field.getType());__CLR4_4_1980980lc8azt24.R.inc(12081);try{__CLR4_4_1980980lc8azt24.R.inc(12080);
            __CLR4_4_1980980lc8azt24.R.inc(12082);if ((((!field.isSupported())&&(__CLR4_4_1980980lc8azt24.R.iget(12083)!=0|true))||(__CLR4_4_1980980lc8azt24.R.iget(12084)==0&false))) {{
                __CLR4_4_1980980lc8azt24.R.inc(12085);throw new IllegalArgumentException();
            }
            }__CLR4_4_1980980lc8azt24.R.inc(12086);iField = field;
            __CLR4_4_1980980lc8azt24.R.inc(12087);iTimeField = useTimeArithmetic(field);
            __CLR4_4_1980980lc8azt24.R.inc(12088);iZone = zone;
        }finally{__CLR4_4_1980980lc8azt24.R.flushNeeded();}}

        public boolean isPrecise() {try{__CLR4_4_1980980lc8azt24.R.inc(12089);
            __CLR4_4_1980980lc8azt24.R.inc(12090);return (((iTimeField )&&(__CLR4_4_1980980lc8azt24.R.iget(12091)!=0|true))||(__CLR4_4_1980980lc8azt24.R.iget(12092)==0&false))? iField.isPrecise() : iField.isPrecise() && this.iZone.isFixed();
        }finally{__CLR4_4_1980980lc8azt24.R.flushNeeded();}}

        public long getUnitMillis() {try{__CLR4_4_1980980lc8azt24.R.inc(12093);
            __CLR4_4_1980980lc8azt24.R.inc(12094);return iField.getUnitMillis();
        }finally{__CLR4_4_1980980lc8azt24.R.flushNeeded();}}

        public int getValue(long duration, long instant) {try{__CLR4_4_1980980lc8azt24.R.inc(12095);
            __CLR4_4_1980980lc8azt24.R.inc(12096);return iField.getValue(duration, addOffset(instant));
        }finally{__CLR4_4_1980980lc8azt24.R.flushNeeded();}}

        public long getValueAsLong(long duration, long instant) {try{__CLR4_4_1980980lc8azt24.R.inc(12097);
            __CLR4_4_1980980lc8azt24.R.inc(12098);return iField.getValueAsLong(duration, addOffset(instant));
        }finally{__CLR4_4_1980980lc8azt24.R.flushNeeded();}}

        public long getMillis(int value, long instant) {try{__CLR4_4_1980980lc8azt24.R.inc(12099);
            __CLR4_4_1980980lc8azt24.R.inc(12100);return iField.getMillis(value, addOffset(instant));
        }finally{__CLR4_4_1980980lc8azt24.R.flushNeeded();}}

        public long getMillis(long value, long instant) {try{__CLR4_4_1980980lc8azt24.R.inc(12101);
            __CLR4_4_1980980lc8azt24.R.inc(12102);return iField.getMillis(value, addOffset(instant));
        }finally{__CLR4_4_1980980lc8azt24.R.flushNeeded();}}

        public long add(long instant, int value) {try{__CLR4_4_1980980lc8azt24.R.inc(12103);
            __CLR4_4_1980980lc8azt24.R.inc(12104);int offset = getOffsetToAdd(instant);
            __CLR4_4_1980980lc8azt24.R.inc(12105);instant = iField.add(instant + offset, value);
            __CLR4_4_1980980lc8azt24.R.inc(12106);return instant - ((((iTimeField )&&(__CLR4_4_1980980lc8azt24.R.iget(12107)!=0|true))||(__CLR4_4_1980980lc8azt24.R.iget(12108)==0&false))? offset : getOffsetFromLocalToSubtract(instant));
        }finally{__CLR4_4_1980980lc8azt24.R.flushNeeded();}}

        public long add(long instant, long value) {try{__CLR4_4_1980980lc8azt24.R.inc(12109);
            __CLR4_4_1980980lc8azt24.R.inc(12110);int offset = getOffsetToAdd(instant);
            __CLR4_4_1980980lc8azt24.R.inc(12111);instant = iField.add(instant + offset, value);
            __CLR4_4_1980980lc8azt24.R.inc(12112);return instant - ((((iTimeField )&&(__CLR4_4_1980980lc8azt24.R.iget(12113)!=0|true))||(__CLR4_4_1980980lc8azt24.R.iget(12114)==0&false))? offset : getOffsetFromLocalToSubtract(instant));
        }finally{__CLR4_4_1980980lc8azt24.R.flushNeeded();}}

        public int getDifference(long minuendInstant, long subtrahendInstant) {try{__CLR4_4_1980980lc8azt24.R.inc(12115);
            __CLR4_4_1980980lc8azt24.R.inc(12116);int offset = getOffsetToAdd(subtrahendInstant);
            __CLR4_4_1980980lc8azt24.R.inc(12117);return iField.getDifference
                (minuendInstant + ((((iTimeField )&&(__CLR4_4_1980980lc8azt24.R.iget(12118)!=0|true))||(__CLR4_4_1980980lc8azt24.R.iget(12119)==0&false))? offset : getOffsetToAdd(minuendInstant)),
                 subtrahendInstant + offset);
        }finally{__CLR4_4_1980980lc8azt24.R.flushNeeded();}}

        public long getDifferenceAsLong(long minuendInstant, long subtrahendInstant) {try{__CLR4_4_1980980lc8azt24.R.inc(12120);
            __CLR4_4_1980980lc8azt24.R.inc(12121);int offset = getOffsetToAdd(subtrahendInstant);
            __CLR4_4_1980980lc8azt24.R.inc(12122);return iField.getDifferenceAsLong
                (minuendInstant + ((((iTimeField )&&(__CLR4_4_1980980lc8azt24.R.iget(12123)!=0|true))||(__CLR4_4_1980980lc8azt24.R.iget(12124)==0&false))? offset : getOffsetToAdd(minuendInstant)),
                 subtrahendInstant + offset);
        }finally{__CLR4_4_1980980lc8azt24.R.flushNeeded();}}

        private int getOffsetToAdd(long instant) {try{__CLR4_4_1980980lc8azt24.R.inc(12125);
            __CLR4_4_1980980lc8azt24.R.inc(12126);int offset = this.iZone.getOffset(instant);
            __CLR4_4_1980980lc8azt24.R.inc(12127);long sum = instant + offset;
            // If there is a sign change, but the two values have the same sign...
            __CLR4_4_1980980lc8azt24.R.inc(12128);if (((((instant ^ sum) < 0 && (instant ^ offset) >= 0)&&(__CLR4_4_1980980lc8azt24.R.iget(12129)!=0|true))||(__CLR4_4_1980980lc8azt24.R.iget(12130)==0&false))) {{
                __CLR4_4_1980980lc8azt24.R.inc(12131);throw new ArithmeticException("Adding time zone offset caused overflow");
            }
            }__CLR4_4_1980980lc8azt24.R.inc(12132);return offset;
        }finally{__CLR4_4_1980980lc8azt24.R.flushNeeded();}}

        private int getOffsetFromLocalToSubtract(long instant) {try{__CLR4_4_1980980lc8azt24.R.inc(12133);
            __CLR4_4_1980980lc8azt24.R.inc(12134);int offset = this.iZone.getOffsetFromLocal(instant);
            __CLR4_4_1980980lc8azt24.R.inc(12135);long diff = instant - offset;
            // If there is a sign change, but the two values have different signs...
            __CLR4_4_1980980lc8azt24.R.inc(12136);if (((((instant ^ diff) < 0 && (instant ^ offset) < 0)&&(__CLR4_4_1980980lc8azt24.R.iget(12137)!=0|true))||(__CLR4_4_1980980lc8azt24.R.iget(12138)==0&false))) {{
                __CLR4_4_1980980lc8azt24.R.inc(12139);throw new ArithmeticException("Subtracting time zone offset caused overflow");
            }
            }__CLR4_4_1980980lc8azt24.R.inc(12140);return offset;
        }finally{__CLR4_4_1980980lc8azt24.R.flushNeeded();}}

        private long addOffset(long instant) {try{__CLR4_4_1980980lc8azt24.R.inc(12141);
            __CLR4_4_1980980lc8azt24.R.inc(12142);return iZone.convertUTCToLocal(instant);
        }finally{__CLR4_4_1980980lc8azt24.R.flushNeeded();}}

        @Override
        public boolean equals(Object obj) {try{__CLR4_4_1980980lc8azt24.R.inc(12143);
            __CLR4_4_1980980lc8azt24.R.inc(12144);if ((((this == obj)&&(__CLR4_4_1980980lc8azt24.R.iget(12145)!=0|true))||(__CLR4_4_1980980lc8azt24.R.iget(12146)==0&false))) {{
                __CLR4_4_1980980lc8azt24.R.inc(12147);return true;
            } }else {__CLR4_4_1980980lc8azt24.R.inc(12148);if ((((obj instanceof ZonedDurationField)&&(__CLR4_4_1980980lc8azt24.R.iget(12149)!=0|true))||(__CLR4_4_1980980lc8azt24.R.iget(12150)==0&false))) {{
                __CLR4_4_1980980lc8azt24.R.inc(12151);ZonedDurationField other = (ZonedDurationField) obj;
                __CLR4_4_1980980lc8azt24.R.inc(12152);return iField.equals(other.iField) &&
                       iZone.equals(other.iZone);
            }
            }}__CLR4_4_1980980lc8azt24.R.inc(12153);return false;
        }finally{__CLR4_4_1980980lc8azt24.R.flushNeeded();}}

        @Override
        public int hashCode() {try{__CLR4_4_1980980lc8azt24.R.inc(12154);
            __CLR4_4_1980980lc8azt24.R.inc(12155);return iField.hashCode() ^ iZone.hashCode();
        }finally{__CLR4_4_1980980lc8azt24.R.flushNeeded();}}
    }

    /**
     * A DateTimeField that decorates another to add timezone behaviour.
     * <p>
     * This class converts passed in instants to local wall time, and vice
     * versa on output.
     */
    static final class ZonedDateTimeField extends BaseDateTimeField {
        @SuppressWarnings("unused")
        private static final long serialVersionUID = -3968986277775529794L;

        final DateTimeField iField;
        final DateTimeZone iZone;
        final DurationField iDurationField;
        final boolean iTimeField;
        final DurationField iRangeDurationField;
        final DurationField iLeapDurationField;

        ZonedDateTimeField(DateTimeField field,
                           DateTimeZone zone,
                           DurationField durationField,
                           DurationField rangeDurationField,
                           DurationField leapDurationField) {
            super(field.getType());__CLR4_4_1980980lc8azt24.R.inc(12157);try{__CLR4_4_1980980lc8azt24.R.inc(12156);
            __CLR4_4_1980980lc8azt24.R.inc(12158);if ((((!field.isSupported())&&(__CLR4_4_1980980lc8azt24.R.iget(12159)!=0|true))||(__CLR4_4_1980980lc8azt24.R.iget(12160)==0&false))) {{
                __CLR4_4_1980980lc8azt24.R.inc(12161);throw new IllegalArgumentException();
            }
            }__CLR4_4_1980980lc8azt24.R.inc(12162);iField = field;
            __CLR4_4_1980980lc8azt24.R.inc(12163);iZone = zone;
            __CLR4_4_1980980lc8azt24.R.inc(12164);iDurationField = durationField;
            __CLR4_4_1980980lc8azt24.R.inc(12165);iTimeField = useTimeArithmetic(durationField);
            __CLR4_4_1980980lc8azt24.R.inc(12166);iRangeDurationField = rangeDurationField;
            __CLR4_4_1980980lc8azt24.R.inc(12167);iLeapDurationField = leapDurationField;
        }finally{__CLR4_4_1980980lc8azt24.R.flushNeeded();}}

        public boolean isLenient() {try{__CLR4_4_1980980lc8azt24.R.inc(12168);
            __CLR4_4_1980980lc8azt24.R.inc(12169);return iField.isLenient();
        }finally{__CLR4_4_1980980lc8azt24.R.flushNeeded();}}

        public int get(long instant) {try{__CLR4_4_1980980lc8azt24.R.inc(12170);
            __CLR4_4_1980980lc8azt24.R.inc(12171);long localInstant = iZone.convertUTCToLocal(instant);
            __CLR4_4_1980980lc8azt24.R.inc(12172);return iField.get(localInstant);
        }finally{__CLR4_4_1980980lc8azt24.R.flushNeeded();}}

        public String getAsText(long instant, Locale locale) {try{__CLR4_4_1980980lc8azt24.R.inc(12173);
            __CLR4_4_1980980lc8azt24.R.inc(12174);long localInstant = iZone.convertUTCToLocal(instant);
            __CLR4_4_1980980lc8azt24.R.inc(12175);return iField.getAsText(localInstant, locale);
        }finally{__CLR4_4_1980980lc8azt24.R.flushNeeded();}}

        public String getAsShortText(long instant, Locale locale) {try{__CLR4_4_1980980lc8azt24.R.inc(12176);
            __CLR4_4_1980980lc8azt24.R.inc(12177);long localInstant = iZone.convertUTCToLocal(instant);
            __CLR4_4_1980980lc8azt24.R.inc(12178);return iField.getAsShortText(localInstant, locale);
        }finally{__CLR4_4_1980980lc8azt24.R.flushNeeded();}}

        public String getAsText(int fieldValue, Locale locale) {try{__CLR4_4_1980980lc8azt24.R.inc(12179);
            __CLR4_4_1980980lc8azt24.R.inc(12180);return iField.getAsText(fieldValue, locale);
        }finally{__CLR4_4_1980980lc8azt24.R.flushNeeded();}}

        public String getAsShortText(int fieldValue, Locale locale) {try{__CLR4_4_1980980lc8azt24.R.inc(12181);
            __CLR4_4_1980980lc8azt24.R.inc(12182);return iField.getAsShortText(fieldValue, locale);
        }finally{__CLR4_4_1980980lc8azt24.R.flushNeeded();}}

        public long add(long instant, int value) {try{__CLR4_4_1980980lc8azt24.R.inc(12183);
            __CLR4_4_1980980lc8azt24.R.inc(12184);if ((((iTimeField)&&(__CLR4_4_1980980lc8azt24.R.iget(12185)!=0|true))||(__CLR4_4_1980980lc8azt24.R.iget(12186)==0&false))) {{
                __CLR4_4_1980980lc8azt24.R.inc(12187);int offset = getOffsetToAdd(instant);
                __CLR4_4_1980980lc8azt24.R.inc(12188);long localInstant = iField.add(instant + offset, value);
                __CLR4_4_1980980lc8azt24.R.inc(12189);return localInstant - offset;
            } }else {{
               __CLR4_4_1980980lc8azt24.R.inc(12190);long localInstant = iZone.convertUTCToLocal(instant);
               __CLR4_4_1980980lc8azt24.R.inc(12191);localInstant = iField.add(localInstant, value);
               __CLR4_4_1980980lc8azt24.R.inc(12192);return iZone.convertLocalToUTC(localInstant, false, instant);
            }
        }}finally{__CLR4_4_1980980lc8azt24.R.flushNeeded();}}

        public long add(long instant, long value) {try{__CLR4_4_1980980lc8azt24.R.inc(12193);
            __CLR4_4_1980980lc8azt24.R.inc(12194);if ((((iTimeField)&&(__CLR4_4_1980980lc8azt24.R.iget(12195)!=0|true))||(__CLR4_4_1980980lc8azt24.R.iget(12196)==0&false))) {{
                __CLR4_4_1980980lc8azt24.R.inc(12197);int offset = getOffsetToAdd(instant);
                __CLR4_4_1980980lc8azt24.R.inc(12198);long localInstant = iField.add(instant + offset, value);
                __CLR4_4_1980980lc8azt24.R.inc(12199);return localInstant - offset;
            } }else {{
               __CLR4_4_1980980lc8azt24.R.inc(12200);long localInstant = iZone.convertUTCToLocal(instant);
               __CLR4_4_1980980lc8azt24.R.inc(12201);localInstant = iField.add(localInstant, value);
               __CLR4_4_1980980lc8azt24.R.inc(12202);return iZone.convertLocalToUTC(localInstant, false, instant);
            }
        }}finally{__CLR4_4_1980980lc8azt24.R.flushNeeded();}}

        public long addWrapField(long instant, int value) {try{__CLR4_4_1980980lc8azt24.R.inc(12203);
            __CLR4_4_1980980lc8azt24.R.inc(12204);if ((((iTimeField)&&(__CLR4_4_1980980lc8azt24.R.iget(12205)!=0|true))||(__CLR4_4_1980980lc8azt24.R.iget(12206)==0&false))) {{
                __CLR4_4_1980980lc8azt24.R.inc(12207);int offset = getOffsetToAdd(instant);
                __CLR4_4_1980980lc8azt24.R.inc(12208);long localInstant = iField.addWrapField(instant + offset, value);
                __CLR4_4_1980980lc8azt24.R.inc(12209);return localInstant - offset;
            } }else {{
                __CLR4_4_1980980lc8azt24.R.inc(12210);long localInstant = iZone.convertUTCToLocal(instant);
                __CLR4_4_1980980lc8azt24.R.inc(12211);localInstant = iField.addWrapField(localInstant, value);
                __CLR4_4_1980980lc8azt24.R.inc(12212);return iZone.convertLocalToUTC(localInstant, false, instant);
            }
        }}finally{__CLR4_4_1980980lc8azt24.R.flushNeeded();}}

        public long set(long instant, int value) {try{__CLR4_4_1980980lc8azt24.R.inc(12213);
            __CLR4_4_1980980lc8azt24.R.inc(12214);long localInstant = iZone.convertUTCToLocal(instant);
            __CLR4_4_1980980lc8azt24.R.inc(12215);localInstant = iField.set(localInstant, value);
            __CLR4_4_1980980lc8azt24.R.inc(12216);long result = iZone.convertLocalToUTC(localInstant, false, instant);
            __CLR4_4_1980980lc8azt24.R.inc(12217);if ((((get(result) != value)&&(__CLR4_4_1980980lc8azt24.R.iget(12218)!=0|true))||(__CLR4_4_1980980lc8azt24.R.iget(12219)==0&false))) {{
                __CLR4_4_1980980lc8azt24.R.inc(12220);IllegalInstantException cause = new IllegalInstantException(localInstant,  iZone.getID());
                __CLR4_4_1980980lc8azt24.R.inc(12221);IllegalFieldValueException ex = new IllegalFieldValueException(iField.getType(), Integer.valueOf(value), cause.getMessage());
                __CLR4_4_1980980lc8azt24.R.inc(12222);ex.initCause(cause);
                __CLR4_4_1980980lc8azt24.R.inc(12223);throw ex;
            }
            }__CLR4_4_1980980lc8azt24.R.inc(12224);return result;
        }finally{__CLR4_4_1980980lc8azt24.R.flushNeeded();}}

        public long set(long instant, String text, Locale locale) {try{__CLR4_4_1980980lc8azt24.R.inc(12225);
            // cannot verify that new value stuck because set may be lenient
            __CLR4_4_1980980lc8azt24.R.inc(12226);long localInstant = iZone.convertUTCToLocal(instant);
            __CLR4_4_1980980lc8azt24.R.inc(12227);localInstant = iField.set(localInstant, text, locale);
            __CLR4_4_1980980lc8azt24.R.inc(12228);return iZone.convertLocalToUTC(localInstant, false, instant);
        }finally{__CLR4_4_1980980lc8azt24.R.flushNeeded();}}

        public int getDifference(long minuendInstant, long subtrahendInstant) {try{__CLR4_4_1980980lc8azt24.R.inc(12229);
            __CLR4_4_1980980lc8azt24.R.inc(12230);int offset = getOffsetToAdd(subtrahendInstant);
            __CLR4_4_1980980lc8azt24.R.inc(12231);return iField.getDifference
                (minuendInstant + ((((iTimeField )&&(__CLR4_4_1980980lc8azt24.R.iget(12232)!=0|true))||(__CLR4_4_1980980lc8azt24.R.iget(12233)==0&false))? offset : getOffsetToAdd(minuendInstant)),
                 subtrahendInstant + offset);
        }finally{__CLR4_4_1980980lc8azt24.R.flushNeeded();}}

        public long getDifferenceAsLong(long minuendInstant, long subtrahendInstant) {try{__CLR4_4_1980980lc8azt24.R.inc(12234);
            __CLR4_4_1980980lc8azt24.R.inc(12235);int offset = getOffsetToAdd(subtrahendInstant);
            __CLR4_4_1980980lc8azt24.R.inc(12236);return iField.getDifferenceAsLong
                (minuendInstant + ((((iTimeField )&&(__CLR4_4_1980980lc8azt24.R.iget(12237)!=0|true))||(__CLR4_4_1980980lc8azt24.R.iget(12238)==0&false))? offset : getOffsetToAdd(minuendInstant)),
                 subtrahendInstant + offset);
        }finally{__CLR4_4_1980980lc8azt24.R.flushNeeded();}}

        public final DurationField getDurationField() {try{__CLR4_4_1980980lc8azt24.R.inc(12239);
            __CLR4_4_1980980lc8azt24.R.inc(12240);return iDurationField;
        }finally{__CLR4_4_1980980lc8azt24.R.flushNeeded();}}

        public final DurationField getRangeDurationField() {try{__CLR4_4_1980980lc8azt24.R.inc(12241);
            __CLR4_4_1980980lc8azt24.R.inc(12242);return iRangeDurationField;
        }finally{__CLR4_4_1980980lc8azt24.R.flushNeeded();}}

        public boolean isLeap(long instant) {try{__CLR4_4_1980980lc8azt24.R.inc(12243);
            __CLR4_4_1980980lc8azt24.R.inc(12244);long localInstant = iZone.convertUTCToLocal(instant);
            __CLR4_4_1980980lc8azt24.R.inc(12245);return iField.isLeap(localInstant);
        }finally{__CLR4_4_1980980lc8azt24.R.flushNeeded();}}

        public int getLeapAmount(long instant) {try{__CLR4_4_1980980lc8azt24.R.inc(12246);
            __CLR4_4_1980980lc8azt24.R.inc(12247);long localInstant = iZone.convertUTCToLocal(instant);
            __CLR4_4_1980980lc8azt24.R.inc(12248);return iField.getLeapAmount(localInstant);
        }finally{__CLR4_4_1980980lc8azt24.R.flushNeeded();}}

        public final DurationField getLeapDurationField() {try{__CLR4_4_1980980lc8azt24.R.inc(12249);
            __CLR4_4_1980980lc8azt24.R.inc(12250);return iLeapDurationField;
        }finally{__CLR4_4_1980980lc8azt24.R.flushNeeded();}}

        public long roundFloor(long instant) {try{__CLR4_4_1980980lc8azt24.R.inc(12251);
            __CLR4_4_1980980lc8azt24.R.inc(12252);if ((((iTimeField)&&(__CLR4_4_1980980lc8azt24.R.iget(12253)!=0|true))||(__CLR4_4_1980980lc8azt24.R.iget(12254)==0&false))) {{
                __CLR4_4_1980980lc8azt24.R.inc(12255);int offset = getOffsetToAdd(instant);
                __CLR4_4_1980980lc8azt24.R.inc(12256);instant = iField.roundFloor(instant + offset);
                __CLR4_4_1980980lc8azt24.R.inc(12257);return instant - offset;
            } }else {{
                __CLR4_4_1980980lc8azt24.R.inc(12258);long localInstant = iZone.convertUTCToLocal(instant);
                __CLR4_4_1980980lc8azt24.R.inc(12259);localInstant = iField.roundFloor(localInstant);
                __CLR4_4_1980980lc8azt24.R.inc(12260);return iZone.convertLocalToUTC(localInstant, false, instant);
            }
        }}finally{__CLR4_4_1980980lc8azt24.R.flushNeeded();}}

        public long roundCeiling(long instant) {try{__CLR4_4_1980980lc8azt24.R.inc(12261);
            __CLR4_4_1980980lc8azt24.R.inc(12262);if ((((iTimeField)&&(__CLR4_4_1980980lc8azt24.R.iget(12263)!=0|true))||(__CLR4_4_1980980lc8azt24.R.iget(12264)==0&false))) {{
                __CLR4_4_1980980lc8azt24.R.inc(12265);int offset = getOffsetToAdd(instant);
                __CLR4_4_1980980lc8azt24.R.inc(12266);instant = iField.roundCeiling(instant + offset);
                __CLR4_4_1980980lc8azt24.R.inc(12267);return instant - offset;
            } }else {{
                __CLR4_4_1980980lc8azt24.R.inc(12268);long localInstant = iZone.convertUTCToLocal(instant);
                __CLR4_4_1980980lc8azt24.R.inc(12269);localInstant = iField.roundCeiling(localInstant);
                __CLR4_4_1980980lc8azt24.R.inc(12270);return iZone.convertLocalToUTC(localInstant, false, instant);
            }
        }}finally{__CLR4_4_1980980lc8azt24.R.flushNeeded();}}

        public long remainder(long instant) {try{__CLR4_4_1980980lc8azt24.R.inc(12271);
            __CLR4_4_1980980lc8azt24.R.inc(12272);long localInstant = iZone.convertUTCToLocal(instant);
            __CLR4_4_1980980lc8azt24.R.inc(12273);return iField.remainder(localInstant);
        }finally{__CLR4_4_1980980lc8azt24.R.flushNeeded();}}

        public int getMinimumValue() {try{__CLR4_4_1980980lc8azt24.R.inc(12274);
            __CLR4_4_1980980lc8azt24.R.inc(12275);return iField.getMinimumValue();
        }finally{__CLR4_4_1980980lc8azt24.R.flushNeeded();}}

        public int getMinimumValue(long instant) {try{__CLR4_4_1980980lc8azt24.R.inc(12276);
            __CLR4_4_1980980lc8azt24.R.inc(12277);long localInstant = iZone.convertUTCToLocal(instant);
            __CLR4_4_1980980lc8azt24.R.inc(12278);return iField.getMinimumValue(localInstant);
        }finally{__CLR4_4_1980980lc8azt24.R.flushNeeded();}}

        public int getMinimumValue(ReadablePartial instant) {try{__CLR4_4_1980980lc8azt24.R.inc(12279);
            __CLR4_4_1980980lc8azt24.R.inc(12280);return iField.getMinimumValue(instant);
        }finally{__CLR4_4_1980980lc8azt24.R.flushNeeded();}}

        public int getMinimumValue(ReadablePartial instant, int[] values) {try{__CLR4_4_1980980lc8azt24.R.inc(12281);
            __CLR4_4_1980980lc8azt24.R.inc(12282);return iField.getMinimumValue(instant, values);
        }finally{__CLR4_4_1980980lc8azt24.R.flushNeeded();}}

        public int getMaximumValue() {try{__CLR4_4_1980980lc8azt24.R.inc(12283);
            __CLR4_4_1980980lc8azt24.R.inc(12284);return iField.getMaximumValue();
        }finally{__CLR4_4_1980980lc8azt24.R.flushNeeded();}}

        public int getMaximumValue(long instant) {try{__CLR4_4_1980980lc8azt24.R.inc(12285);
            __CLR4_4_1980980lc8azt24.R.inc(12286);long localInstant = iZone.convertUTCToLocal(instant);
            __CLR4_4_1980980lc8azt24.R.inc(12287);return iField.getMaximumValue(localInstant);
        }finally{__CLR4_4_1980980lc8azt24.R.flushNeeded();}}

        public int getMaximumValue(ReadablePartial instant) {try{__CLR4_4_1980980lc8azt24.R.inc(12288);
            __CLR4_4_1980980lc8azt24.R.inc(12289);return iField.getMaximumValue(instant);
        }finally{__CLR4_4_1980980lc8azt24.R.flushNeeded();}}

        public int getMaximumValue(ReadablePartial instant, int[] values) {try{__CLR4_4_1980980lc8azt24.R.inc(12290);
            __CLR4_4_1980980lc8azt24.R.inc(12291);return iField.getMaximumValue(instant, values);
        }finally{__CLR4_4_1980980lc8azt24.R.flushNeeded();}}

        public int getMaximumTextLength(Locale locale) {try{__CLR4_4_1980980lc8azt24.R.inc(12292);
            __CLR4_4_1980980lc8azt24.R.inc(12293);return iField.getMaximumTextLength(locale);
        }finally{__CLR4_4_1980980lc8azt24.R.flushNeeded();}}

        public int getMaximumShortTextLength(Locale locale) {try{__CLR4_4_1980980lc8azt24.R.inc(12294);
            __CLR4_4_1980980lc8azt24.R.inc(12295);return iField.getMaximumShortTextLength(locale);
        }finally{__CLR4_4_1980980lc8azt24.R.flushNeeded();}}

        private int getOffsetToAdd(long instant) {try{__CLR4_4_1980980lc8azt24.R.inc(12296);
            __CLR4_4_1980980lc8azt24.R.inc(12297);int offset = this.iZone.getOffset(instant);
            __CLR4_4_1980980lc8azt24.R.inc(12298);long sum = instant + offset;
            // If there is a sign change, but the two values have the same sign...
            __CLR4_4_1980980lc8azt24.R.inc(12299);if (((((instant ^ sum) < 0 && (instant ^ offset) >= 0)&&(__CLR4_4_1980980lc8azt24.R.iget(12300)!=0|true))||(__CLR4_4_1980980lc8azt24.R.iget(12301)==0&false))) {{
                __CLR4_4_1980980lc8azt24.R.inc(12302);throw new ArithmeticException("Adding time zone offset caused overflow");
            }
            }__CLR4_4_1980980lc8azt24.R.inc(12303);return offset;
        }finally{__CLR4_4_1980980lc8azt24.R.flushNeeded();}}

        @Override
        public boolean equals(Object obj) {try{__CLR4_4_1980980lc8azt24.R.inc(12304);
            __CLR4_4_1980980lc8azt24.R.inc(12305);if ((((this == obj)&&(__CLR4_4_1980980lc8azt24.R.iget(12306)!=0|true))||(__CLR4_4_1980980lc8azt24.R.iget(12307)==0&false))) {{
                __CLR4_4_1980980lc8azt24.R.inc(12308);return true;
            } }else {__CLR4_4_1980980lc8azt24.R.inc(12309);if ((((obj instanceof ZonedDateTimeField)&&(__CLR4_4_1980980lc8azt24.R.iget(12310)!=0|true))||(__CLR4_4_1980980lc8azt24.R.iget(12311)==0&false))) {{
                __CLR4_4_1980980lc8azt24.R.inc(12312);ZonedDateTimeField other = (ZonedDateTimeField) obj;
                __CLR4_4_1980980lc8azt24.R.inc(12313);return iField.equals(other.iField) &&
                       iZone.equals(other.iZone) &&
                       iDurationField.equals(other.iDurationField) &&
                       iRangeDurationField.equals(other.iRangeDurationField);
            }
            }}__CLR4_4_1980980lc8azt24.R.inc(12314);return false;
        }finally{__CLR4_4_1980980lc8azt24.R.flushNeeded();}}

        @Override
        public int hashCode() {try{__CLR4_4_1980980lc8azt24.R.inc(12315);
            __CLR4_4_1980980lc8azt24.R.inc(12316);return iField.hashCode() ^ iZone.hashCode();
        }finally{__CLR4_4_1980980lc8azt24.R.flushNeeded();}}
    }

}
