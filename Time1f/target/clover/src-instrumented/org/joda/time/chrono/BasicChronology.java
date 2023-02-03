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

import java.util.Locale;

import org.joda.time.Chronology;
import org.joda.time.DateTimeConstants;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationField;
import org.joda.time.DurationFieldType;
import org.joda.time.field.DividedDateTimeField;
import org.joda.time.field.FieldUtils;
import org.joda.time.field.MillisDurationField;
import org.joda.time.field.OffsetDateTimeField;
import org.joda.time.field.PreciseDateTimeField;
import org.joda.time.field.PreciseDurationField;
import org.joda.time.field.RemainderDateTimeField;
import org.joda.time.field.ZeroIsMaxDateTimeField;

/**
 * Abstract implementation for calendar systems that use a typical
 * day/month/year/leapYear model.
 * Most of the utility methods required by subclasses are package-private,
 * reflecting the intention that they be defined in the same package.
 * <p>
 * BasicChronology is thread-safe and immutable, and all subclasses must
 * be as well.
 *
 * @author Stephen Colebourne
 * @author Brian S O'Neill
 * @author Guy Allard
 * @since 1.2, renamed from BaseGJChronology
 */
abstract class BasicChronology extends AssembledChronology {public static class __CLR4_4_16t96t9lc8azssf{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672271027956L,8589935092L,9111,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** Serialization lock */
    private static final long serialVersionUID = 8283225332206808863L;

    private static final DurationField cMillisField;
    private static final DurationField cSecondsField;
    private static final DurationField cMinutesField;
    private static final DurationField cHoursField;
    private static final DurationField cHalfdaysField;
    private static final DurationField cDaysField;
    private static final DurationField cWeeksField;

    private static final DateTimeField cMillisOfSecondField;
    private static final DateTimeField cMillisOfDayField;
    private static final DateTimeField cSecondOfMinuteField;
    private static final DateTimeField cSecondOfDayField;
    private static final DateTimeField cMinuteOfHourField;
    private static final DateTimeField cMinuteOfDayField;
    private static final DateTimeField cHourOfDayField;
    private static final DateTimeField cHourOfHalfdayField;
    private static final DateTimeField cClockhourOfDayField;
    private static final DateTimeField cClockhourOfHalfdayField;
    private static final DateTimeField cHalfdayOfDayField;

    static {try{__CLR4_4_16t96t9lc8azssf.R.inc(8829);
        __CLR4_4_16t96t9lc8azssf.R.inc(8830);cMillisField = MillisDurationField.INSTANCE;
        __CLR4_4_16t96t9lc8azssf.R.inc(8831);cSecondsField = new PreciseDurationField
            (DurationFieldType.seconds(), DateTimeConstants.MILLIS_PER_SECOND);
        __CLR4_4_16t96t9lc8azssf.R.inc(8832);cMinutesField = new PreciseDurationField
            (DurationFieldType.minutes(), DateTimeConstants.MILLIS_PER_MINUTE);
        __CLR4_4_16t96t9lc8azssf.R.inc(8833);cHoursField = new PreciseDurationField
            (DurationFieldType.hours(), DateTimeConstants.MILLIS_PER_HOUR);
        __CLR4_4_16t96t9lc8azssf.R.inc(8834);cHalfdaysField = new PreciseDurationField
            (DurationFieldType.halfdays(), DateTimeConstants.MILLIS_PER_DAY / 2);
        __CLR4_4_16t96t9lc8azssf.R.inc(8835);cDaysField = new PreciseDurationField
            (DurationFieldType.days(), DateTimeConstants.MILLIS_PER_DAY);
        __CLR4_4_16t96t9lc8azssf.R.inc(8836);cWeeksField = new PreciseDurationField
            (DurationFieldType.weeks(), DateTimeConstants.MILLIS_PER_WEEK);

        __CLR4_4_16t96t9lc8azssf.R.inc(8837);cMillisOfSecondField = new PreciseDateTimeField
            (DateTimeFieldType.millisOfSecond(), cMillisField, cSecondsField);

        __CLR4_4_16t96t9lc8azssf.R.inc(8838);cMillisOfDayField = new PreciseDateTimeField
            (DateTimeFieldType.millisOfDay(), cMillisField, cDaysField);
             
        __CLR4_4_16t96t9lc8azssf.R.inc(8839);cSecondOfMinuteField = new PreciseDateTimeField
            (DateTimeFieldType.secondOfMinute(), cSecondsField, cMinutesField);

        __CLR4_4_16t96t9lc8azssf.R.inc(8840);cSecondOfDayField = new PreciseDateTimeField
            (DateTimeFieldType.secondOfDay(), cSecondsField, cDaysField);

        __CLR4_4_16t96t9lc8azssf.R.inc(8841);cMinuteOfHourField = new PreciseDateTimeField
            (DateTimeFieldType.minuteOfHour(), cMinutesField, cHoursField);

        __CLR4_4_16t96t9lc8azssf.R.inc(8842);cMinuteOfDayField = new PreciseDateTimeField
            (DateTimeFieldType.minuteOfDay(), cMinutesField, cDaysField);

        __CLR4_4_16t96t9lc8azssf.R.inc(8843);cHourOfDayField = new PreciseDateTimeField
            (DateTimeFieldType.hourOfDay(), cHoursField, cDaysField);

        __CLR4_4_16t96t9lc8azssf.R.inc(8844);cHourOfHalfdayField = new PreciseDateTimeField
            (DateTimeFieldType.hourOfHalfday(), cHoursField, cHalfdaysField);

        __CLR4_4_16t96t9lc8azssf.R.inc(8845);cClockhourOfDayField = new ZeroIsMaxDateTimeField
            (cHourOfDayField, DateTimeFieldType.clockhourOfDay());

        __CLR4_4_16t96t9lc8azssf.R.inc(8846);cClockhourOfHalfdayField = new ZeroIsMaxDateTimeField
            (cHourOfHalfdayField, DateTimeFieldType.clockhourOfHalfday());

        __CLR4_4_16t96t9lc8azssf.R.inc(8847);cHalfdayOfDayField = new HalfdayField();
    }finally{__CLR4_4_16t96t9lc8azssf.R.flushNeeded();}}

    private static final int CACHE_SIZE = 1 << 10;
    private static final int CACHE_MASK = CACHE_SIZE - 1;

    private transient final YearInfo[] iYearInfoCache = new YearInfo[CACHE_SIZE];

    private final int iMinDaysInFirstWeek;

    BasicChronology(Chronology base, Object param, int minDaysInFirstWeek) {
        super(base, param);__CLR4_4_16t96t9lc8azssf.R.inc(8849);try{__CLR4_4_16t96t9lc8azssf.R.inc(8848);

        __CLR4_4_16t96t9lc8azssf.R.inc(8850);if ((((minDaysInFirstWeek < 1 || minDaysInFirstWeek > 7)&&(__CLR4_4_16t96t9lc8azssf.R.iget(8851)!=0|true))||(__CLR4_4_16t96t9lc8azssf.R.iget(8852)==0&false))) {{
            __CLR4_4_16t96t9lc8azssf.R.inc(8853);throw new IllegalArgumentException
                ("Invalid min days in first week: " + minDaysInFirstWeek);
        }

        }__CLR4_4_16t96t9lc8azssf.R.inc(8854);iMinDaysInFirstWeek = minDaysInFirstWeek;
    }finally{__CLR4_4_16t96t9lc8azssf.R.flushNeeded();}}

    public DateTimeZone getZone() {try{__CLR4_4_16t96t9lc8azssf.R.inc(8855);
        __CLR4_4_16t96t9lc8azssf.R.inc(8856);Chronology base;
        __CLR4_4_16t96t9lc8azssf.R.inc(8857);if ((base = getBase()) != null) {{
            __CLR4_4_16t96t9lc8azssf.R.inc(8860);return base.getZone();
        }
        }__CLR4_4_16t96t9lc8azssf.R.inc(8861);return DateTimeZone.UTC;
    }finally{__CLR4_4_16t96t9lc8azssf.R.flushNeeded();}}

    public long getDateTimeMillis(
            int year, int monthOfYear, int dayOfMonth, int millisOfDay)
            throws IllegalArgumentException {try{__CLR4_4_16t96t9lc8azssf.R.inc(8862);
        __CLR4_4_16t96t9lc8azssf.R.inc(8863);Chronology base;
        __CLR4_4_16t96t9lc8azssf.R.inc(8864);if ((base = getBase()) != null) {{
            __CLR4_4_16t96t9lc8azssf.R.inc(8867);return base.getDateTimeMillis(year, monthOfYear, dayOfMonth, millisOfDay);
        }

        }__CLR4_4_16t96t9lc8azssf.R.inc(8868);FieldUtils.verifyValueBounds
            (DateTimeFieldType.millisOfDay(), millisOfDay, 0, DateTimeConstants.MILLIS_PER_DAY - 1);
        __CLR4_4_16t96t9lc8azssf.R.inc(8869);return getDateMidnightMillis(year, monthOfYear, dayOfMonth) + millisOfDay;
    }finally{__CLR4_4_16t96t9lc8azssf.R.flushNeeded();}}

    public long getDateTimeMillis(
            int year, int monthOfYear, int dayOfMonth,
            int hourOfDay, int minuteOfHour, int secondOfMinute, int millisOfSecond)
            throws IllegalArgumentException {try{__CLR4_4_16t96t9lc8azssf.R.inc(8870);
        __CLR4_4_16t96t9lc8azssf.R.inc(8871);Chronology base;
        __CLR4_4_16t96t9lc8azssf.R.inc(8872);if ((base = getBase()) != null) {{
            __CLR4_4_16t96t9lc8azssf.R.inc(8875);return base.getDateTimeMillis(year, monthOfYear, dayOfMonth,
                                          hourOfDay, minuteOfHour, secondOfMinute, millisOfSecond);
        }

        }__CLR4_4_16t96t9lc8azssf.R.inc(8876);FieldUtils.verifyValueBounds(DateTimeFieldType.hourOfDay(), hourOfDay, 0, 23);
        __CLR4_4_16t96t9lc8azssf.R.inc(8877);FieldUtils.verifyValueBounds(DateTimeFieldType.minuteOfHour(), minuteOfHour, 0, 59);
        __CLR4_4_16t96t9lc8azssf.R.inc(8878);FieldUtils.verifyValueBounds(DateTimeFieldType.secondOfMinute(), secondOfMinute, 0, 59);
        __CLR4_4_16t96t9lc8azssf.R.inc(8879);FieldUtils.verifyValueBounds(DateTimeFieldType.millisOfSecond(), millisOfSecond, 0, 999);

        __CLR4_4_16t96t9lc8azssf.R.inc(8880);return getDateMidnightMillis(year, monthOfYear, dayOfMonth)
            + hourOfDay * DateTimeConstants.MILLIS_PER_HOUR
            + minuteOfHour * DateTimeConstants.MILLIS_PER_MINUTE
            + secondOfMinute * DateTimeConstants.MILLIS_PER_SECOND
            + millisOfSecond;
    }finally{__CLR4_4_16t96t9lc8azssf.R.flushNeeded();}}

    public int getMinimumDaysInFirstWeek() {try{__CLR4_4_16t96t9lc8azssf.R.inc(8881);
        __CLR4_4_16t96t9lc8azssf.R.inc(8882);return iMinDaysInFirstWeek;
    }finally{__CLR4_4_16t96t9lc8azssf.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Checks if this chronology instance equals another.
     * 
     * @param obj  the object to compare to
     * @return true if equal
     * @since 1.6
     */
    public boolean equals(Object obj) {try{__CLR4_4_16t96t9lc8azssf.R.inc(8883);
        __CLR4_4_16t96t9lc8azssf.R.inc(8884);if ((((this == obj)&&(__CLR4_4_16t96t9lc8azssf.R.iget(8885)!=0|true))||(__CLR4_4_16t96t9lc8azssf.R.iget(8886)==0&false))) {{
            __CLR4_4_16t96t9lc8azssf.R.inc(8887);return true;
        }
        }__CLR4_4_16t96t9lc8azssf.R.inc(8888);if ((((obj != null && getClass() == obj.getClass())&&(__CLR4_4_16t96t9lc8azssf.R.iget(8889)!=0|true))||(__CLR4_4_16t96t9lc8azssf.R.iget(8890)==0&false))) {{
            __CLR4_4_16t96t9lc8azssf.R.inc(8891);BasicChronology chrono = (BasicChronology) obj;
            __CLR4_4_16t96t9lc8azssf.R.inc(8892);return getMinimumDaysInFirstWeek() == chrono.getMinimumDaysInFirstWeek() &&
                    getZone().equals(chrono.getZone());
        }
        }__CLR4_4_16t96t9lc8azssf.R.inc(8893);return false;
    }finally{__CLR4_4_16t96t9lc8azssf.R.flushNeeded();}}

    /**
     * A suitable hash code for the chronology.
     * 
     * @return the hash code
     * @since 1.6
     */
    public int hashCode() {try{__CLR4_4_16t96t9lc8azssf.R.inc(8894);
        __CLR4_4_16t96t9lc8azssf.R.inc(8895);return getClass().getName().hashCode() * 11 + getZone().hashCode() + getMinimumDaysInFirstWeek();
    }finally{__CLR4_4_16t96t9lc8azssf.R.flushNeeded();}}

    // Output
    //-----------------------------------------------------------------------
    /**
     * Gets a debugging toString.
     * 
     * @return a debugging string
     */
    public String toString() {try{__CLR4_4_16t96t9lc8azssf.R.inc(8896);
        __CLR4_4_16t96t9lc8azssf.R.inc(8897);StringBuilder sb = new StringBuilder(60);
        __CLR4_4_16t96t9lc8azssf.R.inc(8898);String name = getClass().getName();
        __CLR4_4_16t96t9lc8azssf.R.inc(8899);int index = name.lastIndexOf('.');
        __CLR4_4_16t96t9lc8azssf.R.inc(8900);if ((((index >= 0)&&(__CLR4_4_16t96t9lc8azssf.R.iget(8901)!=0|true))||(__CLR4_4_16t96t9lc8azssf.R.iget(8902)==0&false))) {{
            __CLR4_4_16t96t9lc8azssf.R.inc(8903);name = name.substring(index + 1);
        }
        }__CLR4_4_16t96t9lc8azssf.R.inc(8904);sb.append(name);
        __CLR4_4_16t96t9lc8azssf.R.inc(8905);sb.append('[');
        __CLR4_4_16t96t9lc8azssf.R.inc(8906);DateTimeZone zone = getZone();
        __CLR4_4_16t96t9lc8azssf.R.inc(8907);if ((((zone != null)&&(__CLR4_4_16t96t9lc8azssf.R.iget(8908)!=0|true))||(__CLR4_4_16t96t9lc8azssf.R.iget(8909)==0&false))) {{
            __CLR4_4_16t96t9lc8azssf.R.inc(8910);sb.append(zone.getID());
        }
        }__CLR4_4_16t96t9lc8azssf.R.inc(8911);if ((((getMinimumDaysInFirstWeek() != 4)&&(__CLR4_4_16t96t9lc8azssf.R.iget(8912)!=0|true))||(__CLR4_4_16t96t9lc8azssf.R.iget(8913)==0&false))) {{
            __CLR4_4_16t96t9lc8azssf.R.inc(8914);sb.append(",mdfw=");
            __CLR4_4_16t96t9lc8azssf.R.inc(8915);sb.append(getMinimumDaysInFirstWeek());
        }
        }__CLR4_4_16t96t9lc8azssf.R.inc(8916);sb.append(']');
        __CLR4_4_16t96t9lc8azssf.R.inc(8917);return sb.toString();
    }finally{__CLR4_4_16t96t9lc8azssf.R.flushNeeded();}}

    protected void assemble(Fields fields) {try{__CLR4_4_16t96t9lc8azssf.R.inc(8918);
        // First copy fields that are the same for all Gregorian and Julian
        // chronologies.

        __CLR4_4_16t96t9lc8azssf.R.inc(8919);fields.millis = cMillisField;
        __CLR4_4_16t96t9lc8azssf.R.inc(8920);fields.seconds = cSecondsField;
        __CLR4_4_16t96t9lc8azssf.R.inc(8921);fields.minutes = cMinutesField;
        __CLR4_4_16t96t9lc8azssf.R.inc(8922);fields.hours = cHoursField;
        __CLR4_4_16t96t9lc8azssf.R.inc(8923);fields.halfdays = cHalfdaysField;
        __CLR4_4_16t96t9lc8azssf.R.inc(8924);fields.days = cDaysField;
        __CLR4_4_16t96t9lc8azssf.R.inc(8925);fields.weeks = cWeeksField;

        __CLR4_4_16t96t9lc8azssf.R.inc(8926);fields.millisOfSecond = cMillisOfSecondField;
        __CLR4_4_16t96t9lc8azssf.R.inc(8927);fields.millisOfDay = cMillisOfDayField;
        __CLR4_4_16t96t9lc8azssf.R.inc(8928);fields.secondOfMinute = cSecondOfMinuteField;
        __CLR4_4_16t96t9lc8azssf.R.inc(8929);fields.secondOfDay = cSecondOfDayField;
        __CLR4_4_16t96t9lc8azssf.R.inc(8930);fields.minuteOfHour = cMinuteOfHourField;
        __CLR4_4_16t96t9lc8azssf.R.inc(8931);fields.minuteOfDay = cMinuteOfDayField;
        __CLR4_4_16t96t9lc8azssf.R.inc(8932);fields.hourOfDay = cHourOfDayField;
        __CLR4_4_16t96t9lc8azssf.R.inc(8933);fields.hourOfHalfday = cHourOfHalfdayField;
        __CLR4_4_16t96t9lc8azssf.R.inc(8934);fields.clockhourOfDay = cClockhourOfDayField;
        __CLR4_4_16t96t9lc8azssf.R.inc(8935);fields.clockhourOfHalfday = cClockhourOfHalfdayField;
        __CLR4_4_16t96t9lc8azssf.R.inc(8936);fields.halfdayOfDay = cHalfdayOfDayField;

        // Now create fields that have unique behavior for Gregorian and Julian
        // chronologies.

        __CLR4_4_16t96t9lc8azssf.R.inc(8937);fields.year = new BasicYearDateTimeField(this);
        __CLR4_4_16t96t9lc8azssf.R.inc(8938);fields.yearOfEra = new GJYearOfEraDateTimeField(fields.year, this);

        // Define one-based centuryOfEra and yearOfCentury.
        __CLR4_4_16t96t9lc8azssf.R.inc(8939);DateTimeField field = new OffsetDateTimeField(
            fields.yearOfEra, 99);
        __CLR4_4_16t96t9lc8azssf.R.inc(8940);fields.centuryOfEra = new DividedDateTimeField(
            field, DateTimeFieldType.centuryOfEra(), 100);
        __CLR4_4_16t96t9lc8azssf.R.inc(8941);fields.centuries = fields.centuryOfEra.getDurationField();
        
        __CLR4_4_16t96t9lc8azssf.R.inc(8942);field = new RemainderDateTimeField(
            (DividedDateTimeField) fields.centuryOfEra);
        __CLR4_4_16t96t9lc8azssf.R.inc(8943);fields.yearOfCentury = new OffsetDateTimeField(
            field, DateTimeFieldType.yearOfCentury(), 1);

        __CLR4_4_16t96t9lc8azssf.R.inc(8944);fields.era = new GJEraDateTimeField(this);
        __CLR4_4_16t96t9lc8azssf.R.inc(8945);fields.dayOfWeek = new GJDayOfWeekDateTimeField(this, fields.days);
        __CLR4_4_16t96t9lc8azssf.R.inc(8946);fields.dayOfMonth = new BasicDayOfMonthDateTimeField(this, fields.days);
        __CLR4_4_16t96t9lc8azssf.R.inc(8947);fields.dayOfYear = new BasicDayOfYearDateTimeField(this, fields.days);
        __CLR4_4_16t96t9lc8azssf.R.inc(8948);fields.monthOfYear = new GJMonthOfYearDateTimeField(this);
        __CLR4_4_16t96t9lc8azssf.R.inc(8949);fields.weekyear = new BasicWeekyearDateTimeField(this);
        __CLR4_4_16t96t9lc8azssf.R.inc(8950);fields.weekOfWeekyear = new BasicWeekOfWeekyearDateTimeField(this, fields.weeks);
        
        __CLR4_4_16t96t9lc8azssf.R.inc(8951);field = new RemainderDateTimeField(
            fields.weekyear, fields.centuries, DateTimeFieldType.weekyearOfCentury(), 100);
        __CLR4_4_16t96t9lc8azssf.R.inc(8952);fields.weekyearOfCentury = new OffsetDateTimeField(
            field, DateTimeFieldType.weekyearOfCentury(), 1);
        
        // The remaining (imprecise) durations are available from the newly
        // created datetime fields.
        __CLR4_4_16t96t9lc8azssf.R.inc(8953);fields.years = fields.year.getDurationField();
        __CLR4_4_16t96t9lc8azssf.R.inc(8954);fields.months = fields.monthOfYear.getDurationField();
        __CLR4_4_16t96t9lc8azssf.R.inc(8955);fields.weekyears = fields.weekyear.getDurationField();
    }finally{__CLR4_4_16t96t9lc8azssf.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Get the number of days in the year.
     *
     * @return 366
     */
    int getDaysInYearMax() {try{__CLR4_4_16t96t9lc8azssf.R.inc(8956);
        __CLR4_4_16t96t9lc8azssf.R.inc(8957);return 366;
    }finally{__CLR4_4_16t96t9lc8azssf.R.flushNeeded();}}

    /**
     * Get the number of days in the year.
     *
     * @param year  the year to use
     * @return 366 if a leap year, otherwise 365
     */
    int getDaysInYear(int year) {try{__CLR4_4_16t96t9lc8azssf.R.inc(8958);
        __CLR4_4_16t96t9lc8azssf.R.inc(8959);return (((isLeapYear(year) )&&(__CLR4_4_16t96t9lc8azssf.R.iget(8960)!=0|true))||(__CLR4_4_16t96t9lc8azssf.R.iget(8961)==0&false))? 366 : 365;
    }finally{__CLR4_4_16t96t9lc8azssf.R.flushNeeded();}}

    /**
     * Get the number of weeks in the year.
     *
     * @param year  the year to use
     * @return number of weeks in the year
     */
    int getWeeksInYear(int year) {try{__CLR4_4_16t96t9lc8azssf.R.inc(8962);
        __CLR4_4_16t96t9lc8azssf.R.inc(8963);long firstWeekMillis1 = getFirstWeekOfYearMillis(year);
        __CLR4_4_16t96t9lc8azssf.R.inc(8964);long firstWeekMillis2 = getFirstWeekOfYearMillis(year + 1);
        __CLR4_4_16t96t9lc8azssf.R.inc(8965);return (int) ((firstWeekMillis2 - firstWeekMillis1) / DateTimeConstants.MILLIS_PER_WEEK);
    }finally{__CLR4_4_16t96t9lc8azssf.R.flushNeeded();}}

    /**
     * Get the millis for the first week of a year.
     *
     * @param year  the year to use
     * @return millis
     */
    long getFirstWeekOfYearMillis(int year) {try{__CLR4_4_16t96t9lc8azssf.R.inc(8966);
        __CLR4_4_16t96t9lc8azssf.R.inc(8967);long jan1millis = getYearMillis(year);
        __CLR4_4_16t96t9lc8azssf.R.inc(8968);int jan1dayOfWeek = getDayOfWeek(jan1millis);
        
        __CLR4_4_16t96t9lc8azssf.R.inc(8969);if ((((jan1dayOfWeek > (8 - iMinDaysInFirstWeek))&&(__CLR4_4_16t96t9lc8azssf.R.iget(8970)!=0|true))||(__CLR4_4_16t96t9lc8azssf.R.iget(8971)==0&false))) {{
            // First week is end of previous year because it doesn't have enough days.
            __CLR4_4_16t96t9lc8azssf.R.inc(8972);return jan1millis + (8 - jan1dayOfWeek)
                * (long)DateTimeConstants.MILLIS_PER_DAY;
        } }else {{
            // First week is start of this year because it has enough days.
            __CLR4_4_16t96t9lc8azssf.R.inc(8973);return jan1millis - (jan1dayOfWeek - 1)
                * (long)DateTimeConstants.MILLIS_PER_DAY;
        }
    }}finally{__CLR4_4_16t96t9lc8azssf.R.flushNeeded();}}

    /**
     * Get the milliseconds for the start of a year.
     *
     * @param year The year to use.
     * @return millis from 1970-01-01T00:00:00Z
     */
    long getYearMillis(int year) {try{__CLR4_4_16t96t9lc8azssf.R.inc(8974);
        __CLR4_4_16t96t9lc8azssf.R.inc(8975);return getYearInfo(year).iFirstDayMillis;
    }finally{__CLR4_4_16t96t9lc8azssf.R.flushNeeded();}}

    /**
     * Get the milliseconds for the start of a month.
     *
     * @param year The year to use.
     * @param month The month to use
     * @return millis from 1970-01-01T00:00:00Z
     */
    long getYearMonthMillis(int year, int month) {try{__CLR4_4_16t96t9lc8azssf.R.inc(8976);
        __CLR4_4_16t96t9lc8azssf.R.inc(8977);long millis = getYearMillis(year);
        __CLR4_4_16t96t9lc8azssf.R.inc(8978);millis += getTotalMillisByYearMonth(year, month);
        __CLR4_4_16t96t9lc8azssf.R.inc(8979);return millis;
    }finally{__CLR4_4_16t96t9lc8azssf.R.flushNeeded();}}

    /**
     * Get the milliseconds for a particular date.
     *
     * @param year The year to use.
     * @param month The month to use
     * @param dayOfMonth The day of the month to use
     * @return millis from 1970-01-01T00:00:00Z
     */
    long getYearMonthDayMillis(int year, int month, int dayOfMonth) {try{__CLR4_4_16t96t9lc8azssf.R.inc(8980);
        __CLR4_4_16t96t9lc8azssf.R.inc(8981);long millis = getYearMillis(year);
        __CLR4_4_16t96t9lc8azssf.R.inc(8982);millis += getTotalMillisByYearMonth(year, month);
        __CLR4_4_16t96t9lc8azssf.R.inc(8983);return millis + (dayOfMonth - 1) * (long)DateTimeConstants.MILLIS_PER_DAY;
    }finally{__CLR4_4_16t96t9lc8azssf.R.flushNeeded();}}
    
    /**
     * @param instant millis from 1970-01-01T00:00:00Z
     */
    int getYear(long instant) {try{__CLR4_4_16t96t9lc8azssf.R.inc(8984);
        // Get an initial estimate of the year, and the millis value that
        // represents the start of that year. Then verify estimate and fix if
        // necessary.

        // Initial estimate uses values divided by two to avoid overflow.
        __CLR4_4_16t96t9lc8azssf.R.inc(8985);long unitMillis = getAverageMillisPerYearDividedByTwo();
        __CLR4_4_16t96t9lc8azssf.R.inc(8986);long i2 = (instant >> 1) + getApproxMillisAtEpochDividedByTwo();
        __CLR4_4_16t96t9lc8azssf.R.inc(8987);if ((((i2 < 0)&&(__CLR4_4_16t96t9lc8azssf.R.iget(8988)!=0|true))||(__CLR4_4_16t96t9lc8azssf.R.iget(8989)==0&false))) {{
            __CLR4_4_16t96t9lc8azssf.R.inc(8990);i2 = i2 - unitMillis + 1;
        }
        }__CLR4_4_16t96t9lc8azssf.R.inc(8991);int year = (int) (i2 / unitMillis);

        __CLR4_4_16t96t9lc8azssf.R.inc(8992);long yearStart = getYearMillis(year);
        __CLR4_4_16t96t9lc8azssf.R.inc(8993);long diff = instant - yearStart;

        __CLR4_4_16t96t9lc8azssf.R.inc(8994);if ((((diff < 0)&&(__CLR4_4_16t96t9lc8azssf.R.iget(8995)!=0|true))||(__CLR4_4_16t96t9lc8azssf.R.iget(8996)==0&false))) {{
            __CLR4_4_16t96t9lc8azssf.R.inc(8997);year--;
        } }else {__CLR4_4_16t96t9lc8azssf.R.inc(8998);if ((((diff >= DateTimeConstants.MILLIS_PER_DAY * 365L)&&(__CLR4_4_16t96t9lc8azssf.R.iget(8999)!=0|true))||(__CLR4_4_16t96t9lc8azssf.R.iget(9000)==0&false))) {{
            // One year may need to be added to fix estimate.
            __CLR4_4_16t96t9lc8azssf.R.inc(9001);long oneYear;
            __CLR4_4_16t96t9lc8azssf.R.inc(9002);if ((((isLeapYear(year))&&(__CLR4_4_16t96t9lc8azssf.R.iget(9003)!=0|true))||(__CLR4_4_16t96t9lc8azssf.R.iget(9004)==0&false))) {{
                __CLR4_4_16t96t9lc8azssf.R.inc(9005);oneYear = DateTimeConstants.MILLIS_PER_DAY * 366L;
            } }else {{
                __CLR4_4_16t96t9lc8azssf.R.inc(9006);oneYear = DateTimeConstants.MILLIS_PER_DAY * 365L;
            }

            }__CLR4_4_16t96t9lc8azssf.R.inc(9007);yearStart += oneYear;

            __CLR4_4_16t96t9lc8azssf.R.inc(9008);if ((((yearStart <= instant)&&(__CLR4_4_16t96t9lc8azssf.R.iget(9009)!=0|true))||(__CLR4_4_16t96t9lc8azssf.R.iget(9010)==0&false))) {{
                // Didn't go too far, so actually add one year.
                __CLR4_4_16t96t9lc8azssf.R.inc(9011);year++;
            }
        }}

        }}__CLR4_4_16t96t9lc8azssf.R.inc(9012);return year;
    }finally{__CLR4_4_16t96t9lc8azssf.R.flushNeeded();}}

    /**
     * @param millis from 1970-01-01T00:00:00Z
     */
    int getMonthOfYear(long millis) {try{__CLR4_4_16t96t9lc8azssf.R.inc(9013);
        __CLR4_4_16t96t9lc8azssf.R.inc(9014);return getMonthOfYear(millis, getYear(millis));
    }finally{__CLR4_4_16t96t9lc8azssf.R.flushNeeded();}}

    /**
     * @param millis from 1970-01-01T00:00:00Z
     * @param year precalculated year of millis
     */
    abstract int getMonthOfYear(long millis, int year);

    /**
     * @param millis from 1970-01-01T00:00:00Z
     */
    int getDayOfMonth(long millis) {try{__CLR4_4_16t96t9lc8azssf.R.inc(9015);
        __CLR4_4_16t96t9lc8azssf.R.inc(9016);int year = getYear(millis);
        __CLR4_4_16t96t9lc8azssf.R.inc(9017);int month = getMonthOfYear(millis, year);
        __CLR4_4_16t96t9lc8azssf.R.inc(9018);return getDayOfMonth(millis, year, month);
    }finally{__CLR4_4_16t96t9lc8azssf.R.flushNeeded();}}

    /**
     * @param millis from 1970-01-01T00:00:00Z
     * @param year precalculated year of millis
     */
    int getDayOfMonth(long millis, int year) {try{__CLR4_4_16t96t9lc8azssf.R.inc(9019);
        __CLR4_4_16t96t9lc8azssf.R.inc(9020);int month = getMonthOfYear(millis, year);
        __CLR4_4_16t96t9lc8azssf.R.inc(9021);return getDayOfMonth(millis, year, month);
    }finally{__CLR4_4_16t96t9lc8azssf.R.flushNeeded();}}

    /**
     * @param millis from 1970-01-01T00:00:00Z
     * @param year precalculated year of millis
     * @param month precalculated month of millis
     */
    int getDayOfMonth(long millis, int year, int month) {try{__CLR4_4_16t96t9lc8azssf.R.inc(9022);
        __CLR4_4_16t96t9lc8azssf.R.inc(9023);long dateMillis = getYearMillis(year);
        __CLR4_4_16t96t9lc8azssf.R.inc(9024);dateMillis += getTotalMillisByYearMonth(year, month);
        __CLR4_4_16t96t9lc8azssf.R.inc(9025);return (int) ((millis - dateMillis) / DateTimeConstants.MILLIS_PER_DAY) + 1;
    }finally{__CLR4_4_16t96t9lc8azssf.R.flushNeeded();}}

    /**
     * @param instant millis from 1970-01-01T00:00:00Z
     */
    int getDayOfYear(long instant) {try{__CLR4_4_16t96t9lc8azssf.R.inc(9026);
        __CLR4_4_16t96t9lc8azssf.R.inc(9027);return getDayOfYear(instant, getYear(instant));
    }finally{__CLR4_4_16t96t9lc8azssf.R.flushNeeded();}}

    /**
     * @param instant millis from 1970-01-01T00:00:00Z
     * @param year precalculated year of millis
     */
    int getDayOfYear(long instant, int year) {try{__CLR4_4_16t96t9lc8azssf.R.inc(9028);
        __CLR4_4_16t96t9lc8azssf.R.inc(9029);long yearStart = getYearMillis(year);
        __CLR4_4_16t96t9lc8azssf.R.inc(9030);return (int) ((instant - yearStart) / DateTimeConstants.MILLIS_PER_DAY) + 1;
    }finally{__CLR4_4_16t96t9lc8azssf.R.flushNeeded();}}

    /**
     * @param instant millis from 1970-01-01T00:00:00Z
     */
    int getWeekyear(long instant) {try{__CLR4_4_16t96t9lc8azssf.R.inc(9031);
        __CLR4_4_16t96t9lc8azssf.R.inc(9032);int year = getYear(instant);
        __CLR4_4_16t96t9lc8azssf.R.inc(9033);int week = getWeekOfWeekyear(instant, year);
        __CLR4_4_16t96t9lc8azssf.R.inc(9034);if ((((week == 1)&&(__CLR4_4_16t96t9lc8azssf.R.iget(9035)!=0|true))||(__CLR4_4_16t96t9lc8azssf.R.iget(9036)==0&false))) {{
            __CLR4_4_16t96t9lc8azssf.R.inc(9037);return getYear(instant + DateTimeConstants.MILLIS_PER_WEEK);
        } }else {__CLR4_4_16t96t9lc8azssf.R.inc(9038);if ((((week > 51)&&(__CLR4_4_16t96t9lc8azssf.R.iget(9039)!=0|true))||(__CLR4_4_16t96t9lc8azssf.R.iget(9040)==0&false))) {{
            __CLR4_4_16t96t9lc8azssf.R.inc(9041);return getYear(instant - (2 * DateTimeConstants.MILLIS_PER_WEEK));
        } }else {{
            __CLR4_4_16t96t9lc8azssf.R.inc(9042);return year;
        }
    }}}finally{__CLR4_4_16t96t9lc8azssf.R.flushNeeded();}}

    /**
     * @param instant millis from 1970-01-01T00:00:00Z
     */
    int getWeekOfWeekyear(long instant) {try{__CLR4_4_16t96t9lc8azssf.R.inc(9043);
        __CLR4_4_16t96t9lc8azssf.R.inc(9044);return getWeekOfWeekyear(instant, getYear(instant));
    }finally{__CLR4_4_16t96t9lc8azssf.R.flushNeeded();}}

    /**
     * @param instant millis from 1970-01-01T00:00:00Z
     * @param year precalculated year of millis
     */
    int getWeekOfWeekyear(long instant, int year) {try{__CLR4_4_16t96t9lc8azssf.R.inc(9045);
        __CLR4_4_16t96t9lc8azssf.R.inc(9046);long firstWeekMillis1 = getFirstWeekOfYearMillis(year);
        __CLR4_4_16t96t9lc8azssf.R.inc(9047);if ((((instant < firstWeekMillis1)&&(__CLR4_4_16t96t9lc8azssf.R.iget(9048)!=0|true))||(__CLR4_4_16t96t9lc8azssf.R.iget(9049)==0&false))) {{
            __CLR4_4_16t96t9lc8azssf.R.inc(9050);return getWeeksInYear(year - 1);
        }
        }__CLR4_4_16t96t9lc8azssf.R.inc(9051);long firstWeekMillis2 = getFirstWeekOfYearMillis(year + 1);
        __CLR4_4_16t96t9lc8azssf.R.inc(9052);if ((((instant >= firstWeekMillis2)&&(__CLR4_4_16t96t9lc8azssf.R.iget(9053)!=0|true))||(__CLR4_4_16t96t9lc8azssf.R.iget(9054)==0&false))) {{
            __CLR4_4_16t96t9lc8azssf.R.inc(9055);return 1;
        }
        }__CLR4_4_16t96t9lc8azssf.R.inc(9056);return (int) ((instant - firstWeekMillis1) / DateTimeConstants.MILLIS_PER_WEEK) + 1;
    }finally{__CLR4_4_16t96t9lc8azssf.R.flushNeeded();}}

    /**
     * @param instant millis from 1970-01-01T00:00:00Z
     */
    int getDayOfWeek(long instant) {try{__CLR4_4_16t96t9lc8azssf.R.inc(9057);
        // 1970-01-01 is day of week 4, Thursday.

        __CLR4_4_16t96t9lc8azssf.R.inc(9058);long daysSince19700101;
        __CLR4_4_16t96t9lc8azssf.R.inc(9059);if ((((instant >= 0)&&(__CLR4_4_16t96t9lc8azssf.R.iget(9060)!=0|true))||(__CLR4_4_16t96t9lc8azssf.R.iget(9061)==0&false))) {{
            __CLR4_4_16t96t9lc8azssf.R.inc(9062);daysSince19700101 = instant / DateTimeConstants.MILLIS_PER_DAY;
        } }else {{
            __CLR4_4_16t96t9lc8azssf.R.inc(9063);daysSince19700101 = (instant - (DateTimeConstants.MILLIS_PER_DAY - 1))
                / DateTimeConstants.MILLIS_PER_DAY;
            __CLR4_4_16t96t9lc8azssf.R.inc(9064);if ((((daysSince19700101 < -3)&&(__CLR4_4_16t96t9lc8azssf.R.iget(9065)!=0|true))||(__CLR4_4_16t96t9lc8azssf.R.iget(9066)==0&false))) {{
                __CLR4_4_16t96t9lc8azssf.R.inc(9067);return 7 + (int) ((daysSince19700101 + 4) % 7);
            }
        }}

        }__CLR4_4_16t96t9lc8azssf.R.inc(9068);return 1 + (int) ((daysSince19700101 + 3) % 7);
    }finally{__CLR4_4_16t96t9lc8azssf.R.flushNeeded();}}

    /**
     * @param instant millis from 1970-01-01T00:00:00Z
     */
    int getMillisOfDay(long instant) {try{__CLR4_4_16t96t9lc8azssf.R.inc(9069);
        __CLR4_4_16t96t9lc8azssf.R.inc(9070);if ((((instant >= 0)&&(__CLR4_4_16t96t9lc8azssf.R.iget(9071)!=0|true))||(__CLR4_4_16t96t9lc8azssf.R.iget(9072)==0&false))) {{
            __CLR4_4_16t96t9lc8azssf.R.inc(9073);return (int) (instant % DateTimeConstants.MILLIS_PER_DAY);
        } }else {{
            __CLR4_4_16t96t9lc8azssf.R.inc(9074);return (DateTimeConstants.MILLIS_PER_DAY - 1)
                + (int) ((instant + 1) % DateTimeConstants.MILLIS_PER_DAY);
        }
    }}finally{__CLR4_4_16t96t9lc8azssf.R.flushNeeded();}}

    /**
     * Gets the maximum number of days in any month.
     * 
     * @return 31
     */
    int getDaysInMonthMax() {try{__CLR4_4_16t96t9lc8azssf.R.inc(9075);
        __CLR4_4_16t96t9lc8azssf.R.inc(9076);return 31;
    }finally{__CLR4_4_16t96t9lc8azssf.R.flushNeeded();}}

    /**
     * Gets the maximum number of days in the month specified by the instant.
     * 
     * @param instant  millis from 1970-01-01T00:00:00Z
     * @return the maximum number of days in the month
     */
    int getDaysInMonthMax(long instant) {try{__CLR4_4_16t96t9lc8azssf.R.inc(9077);
        __CLR4_4_16t96t9lc8azssf.R.inc(9078);int thisYear = getYear(instant);
        __CLR4_4_16t96t9lc8azssf.R.inc(9079);int thisMonth = getMonthOfYear(instant, thisYear);
        __CLR4_4_16t96t9lc8azssf.R.inc(9080);return getDaysInYearMonth(thisYear, thisMonth);
    }finally{__CLR4_4_16t96t9lc8azssf.R.flushNeeded();}}

    /**
     * Gets the maximum number of days in the month specified by the instant.
     * The value represents what the user is trying to set, and can be
     * used to optimise this method.
     * 
     * @param instant  millis from 1970-01-01T00:00:00Z
     * @param value  the value being set
     * @return the maximum number of days in the month
     */
    int getDaysInMonthMaxForSet(long instant, int value) {try{__CLR4_4_16t96t9lc8azssf.R.inc(9081);
        __CLR4_4_16t96t9lc8azssf.R.inc(9082);return getDaysInMonthMax(instant);
    }finally{__CLR4_4_16t96t9lc8azssf.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Gets the milliseconds for a date at midnight.
     * 
     * @param year  the year
     * @param monthOfYear  the month
     * @param dayOfMonth  the day
     * @return the milliseconds
     */
    long getDateMidnightMillis(int year, int monthOfYear, int dayOfMonth) {try{__CLR4_4_16t96t9lc8azssf.R.inc(9083);
        __CLR4_4_16t96t9lc8azssf.R.inc(9084);FieldUtils.verifyValueBounds(DateTimeFieldType.year(), year, getMinYear(), getMaxYear());
        __CLR4_4_16t96t9lc8azssf.R.inc(9085);FieldUtils.verifyValueBounds(DateTimeFieldType.monthOfYear(), monthOfYear, 1, getMaxMonth(year));
        __CLR4_4_16t96t9lc8azssf.R.inc(9086);FieldUtils.verifyValueBounds(DateTimeFieldType.dayOfMonth(), dayOfMonth, 1, getDaysInYearMonth(year, monthOfYear));
        __CLR4_4_16t96t9lc8azssf.R.inc(9087);return getYearMonthDayMillis(year, monthOfYear, dayOfMonth);
    }finally{__CLR4_4_16t96t9lc8azssf.R.flushNeeded();}}

    /**
     * Gets the difference between the two instants in years.
     * 
     * @param minuendInstant  the first instant
     * @param subtrahendInstant  the second instant
     * @return the difference
     */
    abstract long getYearDifference(long minuendInstant, long subtrahendInstant);

    /**
     * Is the specified year a leap year?
     * 
     * @param year  the year to test
     * @return true if leap
     */
    abstract boolean isLeapYear(int year);

    /**
     * Gets the number of days in the specified month and year.
     * 
     * @param year  the year
     * @param month  the month
     * @return the number of days
     */
    abstract int getDaysInYearMonth(int year, int month);

    /**
     * Gets the maximum days in the specified month.
     * 
     * @param month  the month
     * @return the max days
     */
    abstract int getDaysInMonthMax(int month);

    /**
     * Gets the total number of millis elapsed in this year at the start
     * of the specified month, such as zero for month 1.
     * 
     * @param year  the year
     * @param month  the month
     * @return the elapsed millis at the start of the month
     */
    abstract long getTotalMillisByYearMonth(int year, int month);

    /**
     * Gets the millisecond value of the first day of the year.
     * 
     * @return the milliseconds for the first of the year
     */
    abstract long calculateFirstDayOfYearMillis(int year);

    /**
     * Gets the minimum supported year.
     * 
     * @return the year
     */
    abstract int getMinYear();

    /**
     * Gets the maximum supported year.
     * 
     * @return the year
     */
    abstract int getMaxYear();

    /**
     * Gets the maximum month for the specified year.
     * This implementation calls getMaxMonth().
     * 
     * @param year  the year
     * @return the maximum month value
     */
    int getMaxMonth(int year) {try{__CLR4_4_16t96t9lc8azssf.R.inc(9088);
        __CLR4_4_16t96t9lc8azssf.R.inc(9089);return getMaxMonth();
    }finally{__CLR4_4_16t96t9lc8azssf.R.flushNeeded();}}

    /**
     * Gets the maximum number of months.
     * 
     * @return 12
     */
    int getMaxMonth() {try{__CLR4_4_16t96t9lc8azssf.R.inc(9090);
        __CLR4_4_16t96t9lc8azssf.R.inc(9091);return 12;
    }finally{__CLR4_4_16t96t9lc8azssf.R.flushNeeded();}}

    /**
     * Gets an average value for the milliseconds per year.
     * 
     * @return the millis per year
     */
    abstract long getAverageMillisPerYear();

    /**
     * Gets an average value for the milliseconds per year, divided by two.
     * 
     * @return the millis per year divided by two
     */
    abstract long getAverageMillisPerYearDividedByTwo();

    /**
     * Gets an average value for the milliseconds per month.
     * 
     * @return the millis per month
     */
    abstract long getAverageMillisPerMonth();

    /**
     * Returns a constant representing the approximate number of milliseconds
     * elapsed from year 0 of this chronology, divided by two. This constant
     * <em>must</em> be defined as:
     * <pre>
     *    (yearAtEpoch * averageMillisPerYear + millisOfYearAtEpoch) / 2
     * </pre>
     * where epoch is 1970-01-01 (Gregorian).
     */
    abstract long getApproxMillisAtEpochDividedByTwo();

    /**
     * Sets the year from an instant and year.
     * 
     * @param instant  millis from 1970-01-01T00:00:00Z
     * @param year  the year to set
     * @return the updated millis
     */
    abstract long setYear(long instant, int year);

    //-----------------------------------------------------------------------
    // Although accessed by multiple threads, this method doesn't need to be synchronized.
    private YearInfo getYearInfo(int year) {try{__CLR4_4_16t96t9lc8azssf.R.inc(9092);
        __CLR4_4_16t96t9lc8azssf.R.inc(9093);YearInfo info = iYearInfoCache[year & CACHE_MASK];
        __CLR4_4_16t96t9lc8azssf.R.inc(9094);if ((((info == null || info.iYear != year)&&(__CLR4_4_16t96t9lc8azssf.R.iget(9095)!=0|true))||(__CLR4_4_16t96t9lc8azssf.R.iget(9096)==0&false))) {{
            __CLR4_4_16t96t9lc8azssf.R.inc(9097);info = new YearInfo(year, calculateFirstDayOfYearMillis(year));
            __CLR4_4_16t96t9lc8azssf.R.inc(9098);iYearInfoCache[year & CACHE_MASK] = info;
        }
        }__CLR4_4_16t96t9lc8azssf.R.inc(9099);return info;
    }finally{__CLR4_4_16t96t9lc8azssf.R.flushNeeded();}}

    private static class HalfdayField extends PreciseDateTimeField {
        @SuppressWarnings("unused")
        private static final long serialVersionUID = 581601443656929254L;

        HalfdayField() {
            super(DateTimeFieldType.halfdayOfDay(), cHalfdaysField, cDaysField);__CLR4_4_16t96t9lc8azssf.R.inc(9101);try{__CLR4_4_16t96t9lc8azssf.R.inc(9100);
        }finally{__CLR4_4_16t96t9lc8azssf.R.flushNeeded();}}

        public String getAsText(int fieldValue, Locale locale) {try{__CLR4_4_16t96t9lc8azssf.R.inc(9102);
            __CLR4_4_16t96t9lc8azssf.R.inc(9103);return GJLocaleSymbols.forLocale(locale).halfdayValueToText(fieldValue);
        }finally{__CLR4_4_16t96t9lc8azssf.R.flushNeeded();}}

        public long set(long millis, String text, Locale locale) {try{__CLR4_4_16t96t9lc8azssf.R.inc(9104);
            __CLR4_4_16t96t9lc8azssf.R.inc(9105);return set(millis, GJLocaleSymbols.forLocale(locale).halfdayTextToValue(text));
        }finally{__CLR4_4_16t96t9lc8azssf.R.flushNeeded();}}

        public int getMaximumTextLength(Locale locale) {try{__CLR4_4_16t96t9lc8azssf.R.inc(9106);
            __CLR4_4_16t96t9lc8azssf.R.inc(9107);return GJLocaleSymbols.forLocale(locale).getHalfdayMaxTextLength();
        }finally{__CLR4_4_16t96t9lc8azssf.R.flushNeeded();}}
    }

    private static class YearInfo {
        public final int iYear;
        public final long iFirstDayMillis;

        YearInfo(int year, long firstDayMillis) {try{__CLR4_4_16t96t9lc8azssf.R.inc(9108);
            __CLR4_4_16t96t9lc8azssf.R.inc(9109);iYear = year;
            __CLR4_4_16t96t9lc8azssf.R.inc(9110);iFirstDayMillis = firstDayMillis;
        }finally{__CLR4_4_16t96t9lc8azssf.R.flushNeeded();}}
    }

}
