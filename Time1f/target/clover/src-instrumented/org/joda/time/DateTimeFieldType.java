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

/**
 * Identifies a field, such as year or minuteOfHour, in a chronology-neutral way.
 * <p>
 * A field type defines the type of the field, such as hourOfDay.
 * If does not directly enable any calculations, however it does provide a
 * {@link #getField(Chronology)} method that returns the actual calculation engine
 * for a particular chronology.
 * It also provides access to the related {@link DurationFieldType}s.
 * <p>
 * Instances of <code>DateTimeFieldType</code> are singletons.
 * They can be compared using <code>==</code>.
 * <p>
 * If required, you can create your own field, for example a quarterOfYear.
 * You must create a subclass of <code>DateTimeFieldType</code> that defines the field type.
 * This class returns the actual calculation engine from {@link #getField(Chronology)}.
 * The subclass should implement equals and hashCode.
 *
 * @author Stephen Colebourne
 * @author Brian S O'Neill
 * @since 1.0
 */
@java.lang.SuppressWarnings({"fallthrough"}) public abstract class DateTimeFieldType implements Serializable {public static class __CLR4_4_1mdmdlc8azrox{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672271027956L,8589935092L,982,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** Serialization version */
    private static final long serialVersionUID = -42615285973990L;

    /** Ordinal values for standard field types. */
    static final byte
        ERA = 1,
        YEAR_OF_ERA = 2,
        CENTURY_OF_ERA = 3,
        YEAR_OF_CENTURY = 4,
        YEAR = 5,
        DAY_OF_YEAR = 6,
        MONTH_OF_YEAR = 7,
        DAY_OF_MONTH = 8,
        WEEKYEAR_OF_CENTURY = 9,
        WEEKYEAR = 10,
        WEEK_OF_WEEKYEAR = 11,
        DAY_OF_WEEK = 12,
        HALFDAY_OF_DAY = 13,
        HOUR_OF_HALFDAY = 14,
        CLOCKHOUR_OF_HALFDAY = 15,
        CLOCKHOUR_OF_DAY = 16,
        HOUR_OF_DAY = 17,
        MINUTE_OF_DAY = 18,
        MINUTE_OF_HOUR = 19,
        SECOND_OF_DAY = 20,
        SECOND_OF_MINUTE = 21,
        MILLIS_OF_DAY = 22,
        MILLIS_OF_SECOND = 23;

    /** The era field type. */
    private static final DateTimeFieldType ERA_TYPE = new StandardDateTimeFieldType(
        "era", ERA, DurationFieldType.eras(), null);
    /** The yearOfEra field type. */
    private static final DateTimeFieldType YEAR_OF_ERA_TYPE = new StandardDateTimeFieldType(
        "yearOfEra", YEAR_OF_ERA, DurationFieldType.years(), DurationFieldType.eras());
    /** The centuryOfEra field type. */
    private static final DateTimeFieldType CENTURY_OF_ERA_TYPE = new StandardDateTimeFieldType(
        "centuryOfEra", CENTURY_OF_ERA, DurationFieldType.centuries(), DurationFieldType.eras());
    /** The yearOfCentury field type. */
    private static final DateTimeFieldType YEAR_OF_CENTURY_TYPE = new StandardDateTimeFieldType(
        "yearOfCentury", YEAR_OF_CENTURY, DurationFieldType.years(), DurationFieldType.centuries());
    /** The year field type. */
    private static final DateTimeFieldType YEAR_TYPE = new StandardDateTimeFieldType(
        "year", YEAR, DurationFieldType.years(), null);
    /** The dayOfYear field type. */
    private static final DateTimeFieldType DAY_OF_YEAR_TYPE = new StandardDateTimeFieldType(
        "dayOfYear", DAY_OF_YEAR, DurationFieldType.days(), DurationFieldType.years());
    /** The monthOfYear field type. */
    private static final DateTimeFieldType MONTH_OF_YEAR_TYPE = new StandardDateTimeFieldType(
        "monthOfYear", MONTH_OF_YEAR, DurationFieldType.months(), DurationFieldType.years());
    /** The dayOfMonth field type. */
    private static final DateTimeFieldType DAY_OF_MONTH_TYPE = new StandardDateTimeFieldType(
        "dayOfMonth", DAY_OF_MONTH, DurationFieldType.days(), DurationFieldType.months());
    /** The weekyearOfCentury field type. */
    private static final DateTimeFieldType WEEKYEAR_OF_CENTURY_TYPE = new StandardDateTimeFieldType(
        "weekyearOfCentury", WEEKYEAR_OF_CENTURY, DurationFieldType.weekyears(), DurationFieldType.centuries());
    /** The weekyear field type. */
    private static final DateTimeFieldType WEEKYEAR_TYPE = new StandardDateTimeFieldType(
        "weekyear", WEEKYEAR, DurationFieldType.weekyears(), null);
    /** The weekOfWeekyear field type. */
    private static final DateTimeFieldType WEEK_OF_WEEKYEAR_TYPE = new StandardDateTimeFieldType(
        "weekOfWeekyear", WEEK_OF_WEEKYEAR, DurationFieldType.weeks(), DurationFieldType.weekyears());
    /** The dayOfWeek field type. */
    private static final DateTimeFieldType DAY_OF_WEEK_TYPE = new StandardDateTimeFieldType(
        "dayOfWeek", DAY_OF_WEEK, DurationFieldType.days(), DurationFieldType.weeks());

    /** The halfday field type. */
    private static final DateTimeFieldType HALFDAY_OF_DAY_TYPE = new StandardDateTimeFieldType(
        "halfdayOfDay", HALFDAY_OF_DAY, DurationFieldType.halfdays(), DurationFieldType.days());
    /** The hourOfHalfday field type. */
    private static final DateTimeFieldType HOUR_OF_HALFDAY_TYPE = new StandardDateTimeFieldType(
        "hourOfHalfday", HOUR_OF_HALFDAY, DurationFieldType.hours(), DurationFieldType.halfdays());
    /** The clockhourOfHalfday field type. */
    private static final DateTimeFieldType CLOCKHOUR_OF_HALFDAY_TYPE = new StandardDateTimeFieldType(
        "clockhourOfHalfday", CLOCKHOUR_OF_HALFDAY, DurationFieldType.hours(), DurationFieldType.halfdays());
    /** The clockhourOfDay field type. */
    private static final DateTimeFieldType CLOCKHOUR_OF_DAY_TYPE = new StandardDateTimeFieldType(
        "clockhourOfDay", CLOCKHOUR_OF_DAY, DurationFieldType.hours(), DurationFieldType.days());
    /** The hourOfDay field type. */
    private static final DateTimeFieldType HOUR_OF_DAY_TYPE = new StandardDateTimeFieldType(
        "hourOfDay", HOUR_OF_DAY, DurationFieldType.hours(), DurationFieldType.days());
    /** The minuteOfDay field type. */
    private static final DateTimeFieldType MINUTE_OF_DAY_TYPE = new StandardDateTimeFieldType(
        "minuteOfDay", MINUTE_OF_DAY, DurationFieldType.minutes(), DurationFieldType.days());
    /** The minuteOfHour field type. */
    private static final DateTimeFieldType MINUTE_OF_HOUR_TYPE = new StandardDateTimeFieldType(
        "minuteOfHour", MINUTE_OF_HOUR, DurationFieldType.minutes(), DurationFieldType.hours());
    /** The secondOfDay field type. */
    private static final DateTimeFieldType SECOND_OF_DAY_TYPE = new StandardDateTimeFieldType(
        "secondOfDay", SECOND_OF_DAY, DurationFieldType.seconds(), DurationFieldType.days());
    /** The secondOfMinute field type. */
    private static final DateTimeFieldType SECOND_OF_MINUTE_TYPE = new StandardDateTimeFieldType(
        "secondOfMinute", SECOND_OF_MINUTE, DurationFieldType.seconds(), DurationFieldType.minutes());
    /** The millisOfDay field type. */
    private static final DateTimeFieldType MILLIS_OF_DAY_TYPE = new StandardDateTimeFieldType(
        "millisOfDay", MILLIS_OF_DAY, DurationFieldType.millis(), DurationFieldType.days());
    /** The millisOfSecond field type. */
    private static final DateTimeFieldType MILLIS_OF_SECOND_TYPE = new StandardDateTimeFieldType(
        "millisOfSecond", MILLIS_OF_SECOND, DurationFieldType.millis(), DurationFieldType.seconds());

    /** The name of the field. */
    private final String iName;

    //-----------------------------------------------------------------------
    /**
     * Constructor.
     * 
     * @param name  the name to use
     */
    protected DateTimeFieldType(String name) {
        super();__CLR4_4_1mdmdlc8azrox.R.inc(806);try{__CLR4_4_1mdmdlc8azrox.R.inc(805);
        __CLR4_4_1mdmdlc8azrox.R.inc(807);iName = name;
    }finally{__CLR4_4_1mdmdlc8azrox.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Get the millis of second field type.
     * 
     * @return the DateTimeFieldType constant
     */
    public static DateTimeFieldType millisOfSecond() {try{__CLR4_4_1mdmdlc8azrox.R.inc(808);
        __CLR4_4_1mdmdlc8azrox.R.inc(809);return MILLIS_OF_SECOND_TYPE;
    }finally{__CLR4_4_1mdmdlc8azrox.R.flushNeeded();}}

    /**
     * Get the millis of day field type.
     * 
     * @return the DateTimeFieldType constant
     */
    public static DateTimeFieldType millisOfDay() {try{__CLR4_4_1mdmdlc8azrox.R.inc(810);
        __CLR4_4_1mdmdlc8azrox.R.inc(811);return MILLIS_OF_DAY_TYPE;
    }finally{__CLR4_4_1mdmdlc8azrox.R.flushNeeded();}}

    /**
     * Get the second of minute field type.
     * 
     * @return the DateTimeFieldType constant
     */
    public static DateTimeFieldType secondOfMinute() {try{__CLR4_4_1mdmdlc8azrox.R.inc(812);
        __CLR4_4_1mdmdlc8azrox.R.inc(813);return SECOND_OF_MINUTE_TYPE;
    }finally{__CLR4_4_1mdmdlc8azrox.R.flushNeeded();}}

    /**
     * Get the second of day field type.
     * 
     * @return the DateTimeFieldType constant
     */
    public static DateTimeFieldType secondOfDay() {try{__CLR4_4_1mdmdlc8azrox.R.inc(814);
        __CLR4_4_1mdmdlc8azrox.R.inc(815);return SECOND_OF_DAY_TYPE;
    }finally{__CLR4_4_1mdmdlc8azrox.R.flushNeeded();}}

    /**
     * Get the minute of hour field type.
     * 
     * @return the DateTimeFieldType constant
     */
    public static DateTimeFieldType minuteOfHour() {try{__CLR4_4_1mdmdlc8azrox.R.inc(816);
        __CLR4_4_1mdmdlc8azrox.R.inc(817);return MINUTE_OF_HOUR_TYPE;
    }finally{__CLR4_4_1mdmdlc8azrox.R.flushNeeded();}}

    /**
     * Get the minute of day field type.
     * 
     * @return the DateTimeFieldType constant
     */
    public static DateTimeFieldType minuteOfDay() {try{__CLR4_4_1mdmdlc8azrox.R.inc(818);
        __CLR4_4_1mdmdlc8azrox.R.inc(819);return MINUTE_OF_DAY_TYPE;
    }finally{__CLR4_4_1mdmdlc8azrox.R.flushNeeded();}}

    /**
     * Get the hour of day (0-23) field type.
     * 
     * @return the DateTimeFieldType constant
     */
    public static DateTimeFieldType hourOfDay() {try{__CLR4_4_1mdmdlc8azrox.R.inc(820);
        __CLR4_4_1mdmdlc8azrox.R.inc(821);return HOUR_OF_DAY_TYPE;
    }finally{__CLR4_4_1mdmdlc8azrox.R.flushNeeded();}}

    /**
     * Get the hour of day (offset to 1-24) field type.
     * 
     * @return the DateTimeFieldType constant
     */
    public static DateTimeFieldType clockhourOfDay() {try{__CLR4_4_1mdmdlc8azrox.R.inc(822);
        __CLR4_4_1mdmdlc8azrox.R.inc(823);return CLOCKHOUR_OF_DAY_TYPE;
    }finally{__CLR4_4_1mdmdlc8azrox.R.flushNeeded();}}

    /**
     * Get the hour of am/pm (0-11) field type.
     * 
     * @return the DateTimeFieldType constant
     */
    public static DateTimeFieldType hourOfHalfday() {try{__CLR4_4_1mdmdlc8azrox.R.inc(824);
        __CLR4_4_1mdmdlc8azrox.R.inc(825);return HOUR_OF_HALFDAY_TYPE;
    }finally{__CLR4_4_1mdmdlc8azrox.R.flushNeeded();}}

    /**
     * Get the hour of am/pm (offset to 1-12) field type.
     * 
     * @return the DateTimeFieldType constant
     */
    public static DateTimeFieldType clockhourOfHalfday() {try{__CLR4_4_1mdmdlc8azrox.R.inc(826);
        __CLR4_4_1mdmdlc8azrox.R.inc(827);return CLOCKHOUR_OF_HALFDAY_TYPE;
    }finally{__CLR4_4_1mdmdlc8azrox.R.flushNeeded();}}

    /**
     * Get the AM(0) PM(1) field type.
     * 
     * @return the DateTimeFieldType constant
     */
    public static DateTimeFieldType halfdayOfDay() {try{__CLR4_4_1mdmdlc8azrox.R.inc(828);
        __CLR4_4_1mdmdlc8azrox.R.inc(829);return HALFDAY_OF_DAY_TYPE;
    }finally{__CLR4_4_1mdmdlc8azrox.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Get the day of week field type.
     * 
     * @return the DateTimeFieldType constant
     */
    public static DateTimeFieldType dayOfWeek() {try{__CLR4_4_1mdmdlc8azrox.R.inc(830);
        __CLR4_4_1mdmdlc8azrox.R.inc(831);return DAY_OF_WEEK_TYPE;
    }finally{__CLR4_4_1mdmdlc8azrox.R.flushNeeded();}}

    /**
     * Get the day of month field type.
     * 
     * @return the DateTimeFieldType constant
     */
    public static DateTimeFieldType dayOfMonth() {try{__CLR4_4_1mdmdlc8azrox.R.inc(832);
        __CLR4_4_1mdmdlc8azrox.R.inc(833);return DAY_OF_MONTH_TYPE;
    }finally{__CLR4_4_1mdmdlc8azrox.R.flushNeeded();}}

    /**
     * Get the day of year field type.
     * 
     * @return the DateTimeFieldType constant
     */
    public static DateTimeFieldType dayOfYear() {try{__CLR4_4_1mdmdlc8azrox.R.inc(834);
        __CLR4_4_1mdmdlc8azrox.R.inc(835);return DAY_OF_YEAR_TYPE;
    }finally{__CLR4_4_1mdmdlc8azrox.R.flushNeeded();}}

    /**
     * Get the week of a week based year field type.
     * 
     * @return the DateTimeFieldType constant
     */
    public static DateTimeFieldType weekOfWeekyear() {try{__CLR4_4_1mdmdlc8azrox.R.inc(836);
        __CLR4_4_1mdmdlc8azrox.R.inc(837);return WEEK_OF_WEEKYEAR_TYPE;
    }finally{__CLR4_4_1mdmdlc8azrox.R.flushNeeded();}}

    /**
     * Get the year of a week based year field type.
     * 
     * @return the DateTimeFieldType constant
     */
    public static DateTimeFieldType weekyear() {try{__CLR4_4_1mdmdlc8azrox.R.inc(838);
        __CLR4_4_1mdmdlc8azrox.R.inc(839);return WEEKYEAR_TYPE;
    }finally{__CLR4_4_1mdmdlc8azrox.R.flushNeeded();}}

    /**
     * Get the year of a week based year within a century field type.
     * 
     * @return the DateTimeFieldType constant
     */
    public static DateTimeFieldType weekyearOfCentury() {try{__CLR4_4_1mdmdlc8azrox.R.inc(840);
        __CLR4_4_1mdmdlc8azrox.R.inc(841);return WEEKYEAR_OF_CENTURY_TYPE;
    }finally{__CLR4_4_1mdmdlc8azrox.R.flushNeeded();}}

    /**
     * Get the month of year field type.
     * 
     * @return the DateTimeFieldType constant
     */
    public static DateTimeFieldType monthOfYear() {try{__CLR4_4_1mdmdlc8azrox.R.inc(842);
        __CLR4_4_1mdmdlc8azrox.R.inc(843);return MONTH_OF_YEAR_TYPE;
    }finally{__CLR4_4_1mdmdlc8azrox.R.flushNeeded();}}

    /**
     * Get the year field type.
     * 
     * @return the DateTimeFieldType constant
     */
    public static DateTimeFieldType year() {try{__CLR4_4_1mdmdlc8azrox.R.inc(844);
        __CLR4_4_1mdmdlc8azrox.R.inc(845);return YEAR_TYPE;
    }finally{__CLR4_4_1mdmdlc8azrox.R.flushNeeded();}}

    /**
     * Get the year of era field type.
     * 
     * @return the DateTimeFieldType constant
     */
    public static DateTimeFieldType yearOfEra() {try{__CLR4_4_1mdmdlc8azrox.R.inc(846);
        __CLR4_4_1mdmdlc8azrox.R.inc(847);return YEAR_OF_ERA_TYPE;
    }finally{__CLR4_4_1mdmdlc8azrox.R.flushNeeded();}}

    /**
     * Get the year of century field type.
     * 
     * @return the DateTimeFieldType constant
     */
    public static DateTimeFieldType yearOfCentury() {try{__CLR4_4_1mdmdlc8azrox.R.inc(848);
        __CLR4_4_1mdmdlc8azrox.R.inc(849);return YEAR_OF_CENTURY_TYPE;
    }finally{__CLR4_4_1mdmdlc8azrox.R.flushNeeded();}}

    /**
     * Get the century of era field type.
     * 
     * @return the DateTimeFieldType constant
     */
    public static DateTimeFieldType centuryOfEra() {try{__CLR4_4_1mdmdlc8azrox.R.inc(850);
        __CLR4_4_1mdmdlc8azrox.R.inc(851);return CENTURY_OF_ERA_TYPE;
    }finally{__CLR4_4_1mdmdlc8azrox.R.flushNeeded();}}

    /**
     * Get the era field type.
     * 
     * @return the DateTimeFieldType constant
     */
    public static DateTimeFieldType era() {try{__CLR4_4_1mdmdlc8azrox.R.inc(852);
        __CLR4_4_1mdmdlc8azrox.R.inc(853);return ERA_TYPE;
    }finally{__CLR4_4_1mdmdlc8azrox.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Get the name of the field.
     * <p>
     * By convention, names follow a pattern of "dddOfRrr", where "ddd" represents
     * the (singular) duration unit field name and "Rrr" represents the (singular)
     * duration range field name. If the range field is not applicable, then
     * the name of the field is simply the (singular) duration field name.
     * 
     * @return field name
     */
    public String getName() {try{__CLR4_4_1mdmdlc8azrox.R.inc(854);
        __CLR4_4_1mdmdlc8azrox.R.inc(855);return iName;
    }finally{__CLR4_4_1mdmdlc8azrox.R.flushNeeded();}}

    /**
     * Get the duration unit of the field.
     * 
     * @return duration unit of the field, never null
     */
    public abstract DurationFieldType getDurationType();

    /**
     * Get the duration range of the field.
     * 
     * @return duration range of the field, null if unbounded
     */
    public abstract DurationFieldType getRangeDurationType();

    /**
     * Gets a suitable field for this type from the given Chronology.
     *
     * @param chronology  the chronology to use, null means ISOChronology in default zone
     * @return a suitable field
     */
    public abstract DateTimeField getField(Chronology chronology);

    /**
     * Checks whether this field supported in the given Chronology.
     *
     * @param chronology  the chronology to use, null means ISOChronology in default zone
     * @return true if supported
     */
    public boolean isSupported(Chronology chronology) {try{__CLR4_4_1mdmdlc8azrox.R.inc(856);
        __CLR4_4_1mdmdlc8azrox.R.inc(857);return getField(chronology).isSupported();
    }finally{__CLR4_4_1mdmdlc8azrox.R.flushNeeded();}}

    /**
     * Get a suitable debug string.
     * 
     * @return debug string
     */
    public String toString() {try{__CLR4_4_1mdmdlc8azrox.R.inc(858);
        __CLR4_4_1mdmdlc8azrox.R.inc(859);return getName();
    }finally{__CLR4_4_1mdmdlc8azrox.R.flushNeeded();}}

    private static class StandardDateTimeFieldType extends DateTimeFieldType {
        /** Serialization version */
        private static final long serialVersionUID = -9937958251642L;

        /** The ordinal of the standard field type, for switch statements */
        private final byte iOrdinal;

        /** The unit duration of the field. */
        private final transient DurationFieldType iUnitType;
        /** The range duration of the field. */
        private final transient DurationFieldType iRangeType;

        /**
         * Constructor.
         * 
         * @param name  the name to use
         * @param ordinal  the byte value for the oridinal index
         * @param unitType  the unit duration type
         * @param rangeType  the range duration type
         */
        StandardDateTimeFieldType(String name, byte ordinal,
                                  DurationFieldType unitType, DurationFieldType rangeType) {
            super(name);__CLR4_4_1mdmdlc8azrox.R.inc(861);try{__CLR4_4_1mdmdlc8azrox.R.inc(860);
            __CLR4_4_1mdmdlc8azrox.R.inc(862);iOrdinal = ordinal;
            __CLR4_4_1mdmdlc8azrox.R.inc(863);iUnitType = unitType;
            __CLR4_4_1mdmdlc8azrox.R.inc(864);iRangeType = rangeType;
        }finally{__CLR4_4_1mdmdlc8azrox.R.flushNeeded();}}

        /** @inheritdoc */
        public DurationFieldType getDurationType() {try{__CLR4_4_1mdmdlc8azrox.R.inc(865);
            __CLR4_4_1mdmdlc8azrox.R.inc(866);return iUnitType;
        }finally{__CLR4_4_1mdmdlc8azrox.R.flushNeeded();}}

        /** @inheritdoc */
        public DurationFieldType getRangeDurationType() {try{__CLR4_4_1mdmdlc8azrox.R.inc(867);
            __CLR4_4_1mdmdlc8azrox.R.inc(868);return iRangeType;
        }finally{__CLR4_4_1mdmdlc8azrox.R.flushNeeded();}}

        /** @inheritdoc */
        @Override
        public boolean equals(Object obj) {try{__CLR4_4_1mdmdlc8azrox.R.inc(869);
            __CLR4_4_1mdmdlc8azrox.R.inc(870);if ((((this == obj)&&(__CLR4_4_1mdmdlc8azrox.R.iget(871)!=0|true))||(__CLR4_4_1mdmdlc8azrox.R.iget(872)==0&false))) {{
                __CLR4_4_1mdmdlc8azrox.R.inc(873);return true;
            }
            }__CLR4_4_1mdmdlc8azrox.R.inc(874);if ((((obj instanceof StandardDateTimeFieldType)&&(__CLR4_4_1mdmdlc8azrox.R.iget(875)!=0|true))||(__CLR4_4_1mdmdlc8azrox.R.iget(876)==0&false))) {{
                __CLR4_4_1mdmdlc8azrox.R.inc(877);return iOrdinal == ((StandardDateTimeFieldType) obj).iOrdinal;
            }
            }__CLR4_4_1mdmdlc8azrox.R.inc(878);return false;
        }finally{__CLR4_4_1mdmdlc8azrox.R.flushNeeded();}}

        /** @inheritdoc */
        @Override
        public int hashCode() {try{__CLR4_4_1mdmdlc8azrox.R.inc(879);
            __CLR4_4_1mdmdlc8azrox.R.inc(880);return (1 << iOrdinal);
        }finally{__CLR4_4_1mdmdlc8azrox.R.flushNeeded();}}

        /** @inheritdoc */
        public DateTimeField getField(Chronology chronology) {try{__CLR4_4_1mdmdlc8azrox.R.inc(881);
            __CLR4_4_1mdmdlc8azrox.R.inc(882);chronology = DateTimeUtils.getChronology(chronology);

            boolean __CLB4_4_1_bool0=false;__CLR4_4_1mdmdlc8azrox.R.inc(883);switch (iOrdinal) {
                case ERA:if (!__CLB4_4_1_bool0) {__CLR4_4_1mdmdlc8azrox.R.inc(884);__CLB4_4_1_bool0=true;}
                    __CLR4_4_1mdmdlc8azrox.R.inc(885);return chronology.era();
                case YEAR_OF_ERA:if (!__CLB4_4_1_bool0) {__CLR4_4_1mdmdlc8azrox.R.inc(886);__CLB4_4_1_bool0=true;}
                    __CLR4_4_1mdmdlc8azrox.R.inc(887);return chronology.yearOfEra();
                case CENTURY_OF_ERA:if (!__CLB4_4_1_bool0) {__CLR4_4_1mdmdlc8azrox.R.inc(888);__CLB4_4_1_bool0=true;}
                    __CLR4_4_1mdmdlc8azrox.R.inc(889);return chronology.centuryOfEra();
                case YEAR_OF_CENTURY:if (!__CLB4_4_1_bool0) {__CLR4_4_1mdmdlc8azrox.R.inc(890);__CLB4_4_1_bool0=true;}
                    __CLR4_4_1mdmdlc8azrox.R.inc(891);return chronology.yearOfCentury();
                case YEAR:if (!__CLB4_4_1_bool0) {__CLR4_4_1mdmdlc8azrox.R.inc(892);__CLB4_4_1_bool0=true;}
                    __CLR4_4_1mdmdlc8azrox.R.inc(893);return chronology.year();
                case DAY_OF_YEAR:if (!__CLB4_4_1_bool0) {__CLR4_4_1mdmdlc8azrox.R.inc(894);__CLB4_4_1_bool0=true;}
                    __CLR4_4_1mdmdlc8azrox.R.inc(895);return chronology.dayOfYear();
                case MONTH_OF_YEAR:if (!__CLB4_4_1_bool0) {__CLR4_4_1mdmdlc8azrox.R.inc(896);__CLB4_4_1_bool0=true;}
                    __CLR4_4_1mdmdlc8azrox.R.inc(897);return chronology.monthOfYear();
                case DAY_OF_MONTH:if (!__CLB4_4_1_bool0) {__CLR4_4_1mdmdlc8azrox.R.inc(898);__CLB4_4_1_bool0=true;}
                    __CLR4_4_1mdmdlc8azrox.R.inc(899);return chronology.dayOfMonth();
                case WEEKYEAR_OF_CENTURY:if (!__CLB4_4_1_bool0) {__CLR4_4_1mdmdlc8azrox.R.inc(900);__CLB4_4_1_bool0=true;}
                    __CLR4_4_1mdmdlc8azrox.R.inc(901);return chronology.weekyearOfCentury();
                case WEEKYEAR:if (!__CLB4_4_1_bool0) {__CLR4_4_1mdmdlc8azrox.R.inc(902);__CLB4_4_1_bool0=true;}
                    __CLR4_4_1mdmdlc8azrox.R.inc(903);return chronology.weekyear();
                case WEEK_OF_WEEKYEAR:if (!__CLB4_4_1_bool0) {__CLR4_4_1mdmdlc8azrox.R.inc(904);__CLB4_4_1_bool0=true;}
                    __CLR4_4_1mdmdlc8azrox.R.inc(905);return chronology.weekOfWeekyear();
                case DAY_OF_WEEK:if (!__CLB4_4_1_bool0) {__CLR4_4_1mdmdlc8azrox.R.inc(906);__CLB4_4_1_bool0=true;}
                    __CLR4_4_1mdmdlc8azrox.R.inc(907);return chronology.dayOfWeek();
                case HALFDAY_OF_DAY:if (!__CLB4_4_1_bool0) {__CLR4_4_1mdmdlc8azrox.R.inc(908);__CLB4_4_1_bool0=true;}
                    __CLR4_4_1mdmdlc8azrox.R.inc(909);return chronology.halfdayOfDay();
                case HOUR_OF_HALFDAY:if (!__CLB4_4_1_bool0) {__CLR4_4_1mdmdlc8azrox.R.inc(910);__CLB4_4_1_bool0=true;}
                    __CLR4_4_1mdmdlc8azrox.R.inc(911);return chronology.hourOfHalfday();
                case CLOCKHOUR_OF_HALFDAY:if (!__CLB4_4_1_bool0) {__CLR4_4_1mdmdlc8azrox.R.inc(912);__CLB4_4_1_bool0=true;}
                    __CLR4_4_1mdmdlc8azrox.R.inc(913);return chronology.clockhourOfHalfday();
                case CLOCKHOUR_OF_DAY:if (!__CLB4_4_1_bool0) {__CLR4_4_1mdmdlc8azrox.R.inc(914);__CLB4_4_1_bool0=true;}
                    __CLR4_4_1mdmdlc8azrox.R.inc(915);return chronology.clockhourOfDay();
                case HOUR_OF_DAY:if (!__CLB4_4_1_bool0) {__CLR4_4_1mdmdlc8azrox.R.inc(916);__CLB4_4_1_bool0=true;}
                    __CLR4_4_1mdmdlc8azrox.R.inc(917);return chronology.hourOfDay();
                case MINUTE_OF_DAY:if (!__CLB4_4_1_bool0) {__CLR4_4_1mdmdlc8azrox.R.inc(918);__CLB4_4_1_bool0=true;}
                    __CLR4_4_1mdmdlc8azrox.R.inc(919);return chronology.minuteOfDay();
                case MINUTE_OF_HOUR:if (!__CLB4_4_1_bool0) {__CLR4_4_1mdmdlc8azrox.R.inc(920);__CLB4_4_1_bool0=true;}
                    __CLR4_4_1mdmdlc8azrox.R.inc(921);return chronology.minuteOfHour();
                case SECOND_OF_DAY:if (!__CLB4_4_1_bool0) {__CLR4_4_1mdmdlc8azrox.R.inc(922);__CLB4_4_1_bool0=true;}
                    __CLR4_4_1mdmdlc8azrox.R.inc(923);return chronology.secondOfDay();
                case SECOND_OF_MINUTE:if (!__CLB4_4_1_bool0) {__CLR4_4_1mdmdlc8azrox.R.inc(924);__CLB4_4_1_bool0=true;}
                    __CLR4_4_1mdmdlc8azrox.R.inc(925);return chronology.secondOfMinute();
                case MILLIS_OF_DAY:if (!__CLB4_4_1_bool0) {__CLR4_4_1mdmdlc8azrox.R.inc(926);__CLB4_4_1_bool0=true;}
                    __CLR4_4_1mdmdlc8azrox.R.inc(927);return chronology.millisOfDay();
                case MILLIS_OF_SECOND:if (!__CLB4_4_1_bool0) {__CLR4_4_1mdmdlc8azrox.R.inc(928);__CLB4_4_1_bool0=true;}
                    __CLR4_4_1mdmdlc8azrox.R.inc(929);return chronology.millisOfSecond();
                default:if (!__CLB4_4_1_bool0) {__CLR4_4_1mdmdlc8azrox.R.inc(930);__CLB4_4_1_bool0=true;}
                    // Shouldn't happen.
                    __CLR4_4_1mdmdlc8azrox.R.inc(931);throw new InternalError();
            }
        }finally{__CLR4_4_1mdmdlc8azrox.R.flushNeeded();}}

        /**
         * Ensure a singleton is returned.
         * 
         * @return the singleton type
         */
        private Object readResolve() {try{__CLR4_4_1mdmdlc8azrox.R.inc(932);
            boolean __CLB4_4_1_bool1=false;__CLR4_4_1mdmdlc8azrox.R.inc(933);switch (iOrdinal) {
                case ERA:if (!__CLB4_4_1_bool1) {__CLR4_4_1mdmdlc8azrox.R.inc(934);__CLB4_4_1_bool1=true;}
                    __CLR4_4_1mdmdlc8azrox.R.inc(935);return ERA_TYPE;
                case YEAR_OF_ERA:if (!__CLB4_4_1_bool1) {__CLR4_4_1mdmdlc8azrox.R.inc(936);__CLB4_4_1_bool1=true;}
                    __CLR4_4_1mdmdlc8azrox.R.inc(937);return YEAR_OF_ERA_TYPE;
                case CENTURY_OF_ERA:if (!__CLB4_4_1_bool1) {__CLR4_4_1mdmdlc8azrox.R.inc(938);__CLB4_4_1_bool1=true;}
                    __CLR4_4_1mdmdlc8azrox.R.inc(939);return CENTURY_OF_ERA_TYPE;
                case YEAR_OF_CENTURY:if (!__CLB4_4_1_bool1) {__CLR4_4_1mdmdlc8azrox.R.inc(940);__CLB4_4_1_bool1=true;}
                    __CLR4_4_1mdmdlc8azrox.R.inc(941);return YEAR_OF_CENTURY_TYPE;
                case YEAR:if (!__CLB4_4_1_bool1) {__CLR4_4_1mdmdlc8azrox.R.inc(942);__CLB4_4_1_bool1=true;}
                    __CLR4_4_1mdmdlc8azrox.R.inc(943);return YEAR_TYPE;
                case DAY_OF_YEAR:if (!__CLB4_4_1_bool1) {__CLR4_4_1mdmdlc8azrox.R.inc(944);__CLB4_4_1_bool1=true;}
                    __CLR4_4_1mdmdlc8azrox.R.inc(945);return DAY_OF_YEAR_TYPE;
                case MONTH_OF_YEAR:if (!__CLB4_4_1_bool1) {__CLR4_4_1mdmdlc8azrox.R.inc(946);__CLB4_4_1_bool1=true;}
                    __CLR4_4_1mdmdlc8azrox.R.inc(947);return MONTH_OF_YEAR_TYPE;
                case DAY_OF_MONTH:if (!__CLB4_4_1_bool1) {__CLR4_4_1mdmdlc8azrox.R.inc(948);__CLB4_4_1_bool1=true;}
                    __CLR4_4_1mdmdlc8azrox.R.inc(949);return DAY_OF_MONTH_TYPE;
                case WEEKYEAR_OF_CENTURY:if (!__CLB4_4_1_bool1) {__CLR4_4_1mdmdlc8azrox.R.inc(950);__CLB4_4_1_bool1=true;}
                    __CLR4_4_1mdmdlc8azrox.R.inc(951);return WEEKYEAR_OF_CENTURY_TYPE;
                case WEEKYEAR:if (!__CLB4_4_1_bool1) {__CLR4_4_1mdmdlc8azrox.R.inc(952);__CLB4_4_1_bool1=true;}
                    __CLR4_4_1mdmdlc8azrox.R.inc(953);return WEEKYEAR_TYPE;
                case WEEK_OF_WEEKYEAR:if (!__CLB4_4_1_bool1) {__CLR4_4_1mdmdlc8azrox.R.inc(954);__CLB4_4_1_bool1=true;}
                    __CLR4_4_1mdmdlc8azrox.R.inc(955);return WEEK_OF_WEEKYEAR_TYPE;
                case DAY_OF_WEEK:if (!__CLB4_4_1_bool1) {__CLR4_4_1mdmdlc8azrox.R.inc(956);__CLB4_4_1_bool1=true;}
                    __CLR4_4_1mdmdlc8azrox.R.inc(957);return DAY_OF_WEEK_TYPE;
                case HALFDAY_OF_DAY:if (!__CLB4_4_1_bool1) {__CLR4_4_1mdmdlc8azrox.R.inc(958);__CLB4_4_1_bool1=true;}
                    __CLR4_4_1mdmdlc8azrox.R.inc(959);return HALFDAY_OF_DAY_TYPE;
                case HOUR_OF_HALFDAY:if (!__CLB4_4_1_bool1) {__CLR4_4_1mdmdlc8azrox.R.inc(960);__CLB4_4_1_bool1=true;}
                    __CLR4_4_1mdmdlc8azrox.R.inc(961);return HOUR_OF_HALFDAY_TYPE;
                case CLOCKHOUR_OF_HALFDAY:if (!__CLB4_4_1_bool1) {__CLR4_4_1mdmdlc8azrox.R.inc(962);__CLB4_4_1_bool1=true;}
                    __CLR4_4_1mdmdlc8azrox.R.inc(963);return CLOCKHOUR_OF_HALFDAY_TYPE;
                case CLOCKHOUR_OF_DAY:if (!__CLB4_4_1_bool1) {__CLR4_4_1mdmdlc8azrox.R.inc(964);__CLB4_4_1_bool1=true;}
                    __CLR4_4_1mdmdlc8azrox.R.inc(965);return CLOCKHOUR_OF_DAY_TYPE;
                case HOUR_OF_DAY:if (!__CLB4_4_1_bool1) {__CLR4_4_1mdmdlc8azrox.R.inc(966);__CLB4_4_1_bool1=true;}
                    __CLR4_4_1mdmdlc8azrox.R.inc(967);return HOUR_OF_DAY_TYPE;
                case MINUTE_OF_DAY:if (!__CLB4_4_1_bool1) {__CLR4_4_1mdmdlc8azrox.R.inc(968);__CLB4_4_1_bool1=true;}
                    __CLR4_4_1mdmdlc8azrox.R.inc(969);return MINUTE_OF_DAY_TYPE;
                case MINUTE_OF_HOUR:if (!__CLB4_4_1_bool1) {__CLR4_4_1mdmdlc8azrox.R.inc(970);__CLB4_4_1_bool1=true;}
                    __CLR4_4_1mdmdlc8azrox.R.inc(971);return MINUTE_OF_HOUR_TYPE;
                case SECOND_OF_DAY:if (!__CLB4_4_1_bool1) {__CLR4_4_1mdmdlc8azrox.R.inc(972);__CLB4_4_1_bool1=true;}
                    __CLR4_4_1mdmdlc8azrox.R.inc(973);return SECOND_OF_DAY_TYPE;
                case SECOND_OF_MINUTE:if (!__CLB4_4_1_bool1) {__CLR4_4_1mdmdlc8azrox.R.inc(974);__CLB4_4_1_bool1=true;}
                    __CLR4_4_1mdmdlc8azrox.R.inc(975);return SECOND_OF_MINUTE_TYPE;
                case MILLIS_OF_DAY:if (!__CLB4_4_1_bool1) {__CLR4_4_1mdmdlc8azrox.R.inc(976);__CLB4_4_1_bool1=true;}
                    __CLR4_4_1mdmdlc8azrox.R.inc(977);return MILLIS_OF_DAY_TYPE;
                case MILLIS_OF_SECOND:if (!__CLB4_4_1_bool1) {__CLR4_4_1mdmdlc8azrox.R.inc(978);__CLB4_4_1_bool1=true;}
                    __CLR4_4_1mdmdlc8azrox.R.inc(979);return MILLIS_OF_SECOND_TYPE;
                default:if (!__CLB4_4_1_bool1) {__CLR4_4_1mdmdlc8azrox.R.inc(980);__CLB4_4_1_bool1=true;}
                    // Shouldn't happen.
                    __CLR4_4_1mdmdlc8azrox.R.inc(981);return this;
            }
        }finally{__CLR4_4_1mdmdlc8azrox.R.flushNeeded();}}
    }

}
