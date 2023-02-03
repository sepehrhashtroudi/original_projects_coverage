/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 *  Copyright 2001-2009 Stephen Colebourne
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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.joda.time.field.FieldUtils;

/**
 * Controls a period implementation by specifying which duration fields are to be used.
 * <p>
 * The following implementations are provided:
 * <ul>
 * <li>Standard - years, months, weeks, days, hours, minutes, seconds, millis
 * <li>YearMonthDayTime - years, months, days, hours, minutes, seconds, millis
 * <li>YearMonthDay - years, months, days
 * <li>YearWeekDayTime - years, weeks, days, hours, minutes, seconds, millis
 * <li>YearWeekDay - years, weeks, days
 * <li>YearDayTime - years, days, hours, minutes, seconds, millis
 * <li>YearDay - years, days, hours
 * <li>DayTime - days, hours, minutes, seconds, millis
 * <li>Time - hours, minutes, seconds, millis
 * <li>plus one for each single type
 * </ul>
 *
 * <p>
 * PeriodType is thread-safe and immutable, and all subclasses must be as well.
 *
 * @author Brian S O'Neill
 * @author Stephen Colebourne
 * @since 1.0
 */
public class PeriodType implements Serializable {public static class __CLR4_4_14h24h2lc8azsez{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672271027956L,8589935092L,6142,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /** Serialization version */
    private static final long serialVersionUID = 2274324892792009998L;

    /** Cache of all the known types. */
    private static final Map<PeriodType, Object> cTypes = new HashMap<PeriodType, Object>(32);

    static int YEAR_INDEX = 0;
    static int MONTH_INDEX = 1;
    static int WEEK_INDEX = 2;
    static int DAY_INDEX = 3;
    static int HOUR_INDEX = 4;
    static int MINUTE_INDEX = 5;
    static int SECOND_INDEX = 6;
    static int MILLI_INDEX = 7;
    
    private static PeriodType cStandard;
    private static PeriodType cYMDTime;
    private static PeriodType cYMD;
    private static PeriodType cYWDTime;
    private static PeriodType cYWD;
    private static PeriodType cYDTime;
    private static PeriodType cYD;
    private static PeriodType cDTime;
    private static PeriodType cTime;
    
    private static PeriodType cYears;
    private static PeriodType cMonths;
    private static PeriodType cWeeks;
    private static PeriodType cDays;
    private static PeriodType cHours;
    private static PeriodType cMinutes;
    private static PeriodType cSeconds;
    private static PeriodType cMillis;

    /**
     * Gets a type that defines all standard fields.
     * <ul>
     * <li>years
     * <li>months
     * <li>weeks
     * <li>days
     * <li>hours
     * <li>minutes
     * <li>seconds
     * <li>milliseconds
     * </ul>
     *
     * @return the period type
     */
    public static PeriodType standard() {try{__CLR4_4_14h24h2lc8azsez.R.inc(5798);
        __CLR4_4_14h24h2lc8azsez.R.inc(5799);PeriodType type = cStandard;
        __CLR4_4_14h24h2lc8azsez.R.inc(5800);if ((((type == null)&&(__CLR4_4_14h24h2lc8azsez.R.iget(5801)!=0|true))||(__CLR4_4_14h24h2lc8azsez.R.iget(5802)==0&false))) {{
            __CLR4_4_14h24h2lc8azsez.R.inc(5803);type = new PeriodType(
                "Standard",
                new DurationFieldType[] {
                    DurationFieldType.years(), DurationFieldType.months(),
                    DurationFieldType.weeks(), DurationFieldType.days(),
                    DurationFieldType.hours(), DurationFieldType.minutes(),
                    DurationFieldType.seconds(), DurationFieldType.millis(),
                },
                new int[] { 0, 1, 2, 3, 4, 5, 6, 7, }
            );
            __CLR4_4_14h24h2lc8azsez.R.inc(5804);cStandard = type;
        }
        }__CLR4_4_14h24h2lc8azsez.R.inc(5805);return type;
    }finally{__CLR4_4_14h24h2lc8azsez.R.flushNeeded();}}

    /**
     * Gets a type that defines all standard fields except weeks.
     * <ul>
     * <li>years
     * <li>months
     * <li>days
     * <li>hours
     * <li>minutes
     * <li>seconds
     * <li>milliseconds
     * </ul>
     *
     * @return the period type
     */
    public static PeriodType yearMonthDayTime() {try{__CLR4_4_14h24h2lc8azsez.R.inc(5806);
        __CLR4_4_14h24h2lc8azsez.R.inc(5807);PeriodType type = cYMDTime;
        __CLR4_4_14h24h2lc8azsez.R.inc(5808);if ((((type == null)&&(__CLR4_4_14h24h2lc8azsez.R.iget(5809)!=0|true))||(__CLR4_4_14h24h2lc8azsez.R.iget(5810)==0&false))) {{
            __CLR4_4_14h24h2lc8azsez.R.inc(5811);type = new PeriodType(
                "YearMonthDayTime",
                new DurationFieldType[] {
                    DurationFieldType.years(), DurationFieldType.months(),
                    DurationFieldType.days(),
                    DurationFieldType.hours(), DurationFieldType.minutes(),
                    DurationFieldType.seconds(), DurationFieldType.millis(),
                },
                new int[] { 0, 1, -1, 2, 3, 4, 5, 6, }
            );
            __CLR4_4_14h24h2lc8azsez.R.inc(5812);cYMDTime = type;
        }
        }__CLR4_4_14h24h2lc8azsez.R.inc(5813);return type;
    }finally{__CLR4_4_14h24h2lc8azsez.R.flushNeeded();}}

    /**
     * Gets a type that defines the year, month and day fields.
     * <ul>
     * <li>years
     * <li>months
     * <li>days
     * </ul>
     *
     * @return the period type
     * @since 1.1
     */
    public static PeriodType yearMonthDay() {try{__CLR4_4_14h24h2lc8azsez.R.inc(5814);
        __CLR4_4_14h24h2lc8azsez.R.inc(5815);PeriodType type = cYMD;
        __CLR4_4_14h24h2lc8azsez.R.inc(5816);if ((((type == null)&&(__CLR4_4_14h24h2lc8azsez.R.iget(5817)!=0|true))||(__CLR4_4_14h24h2lc8azsez.R.iget(5818)==0&false))) {{
            __CLR4_4_14h24h2lc8azsez.R.inc(5819);type = new PeriodType(
                "YearMonthDay",
                new DurationFieldType[] {
                    DurationFieldType.years(), DurationFieldType.months(),
                    DurationFieldType.days(),
                },
                new int[] { 0, 1, -1, 2, -1, -1, -1, -1, }
            );
            __CLR4_4_14h24h2lc8azsez.R.inc(5820);cYMD = type;
        }
        }__CLR4_4_14h24h2lc8azsez.R.inc(5821);return type;
    }finally{__CLR4_4_14h24h2lc8azsez.R.flushNeeded();}}

    /**
     * Gets a type that defines all standard fields except months.
     * <ul>
     * <li>years
     * <li>weeks
     * <li>days
     * <li>hours
     * <li>minutes
     * <li>seconds
     * <li>milliseconds
     * </ul>
     *
     * @return the period type
     */
    public static PeriodType yearWeekDayTime() {try{__CLR4_4_14h24h2lc8azsez.R.inc(5822);
        __CLR4_4_14h24h2lc8azsez.R.inc(5823);PeriodType type = cYWDTime;
        __CLR4_4_14h24h2lc8azsez.R.inc(5824);if ((((type == null)&&(__CLR4_4_14h24h2lc8azsez.R.iget(5825)!=0|true))||(__CLR4_4_14h24h2lc8azsez.R.iget(5826)==0&false))) {{
            __CLR4_4_14h24h2lc8azsez.R.inc(5827);type = new PeriodType(
                "YearWeekDayTime",
                new DurationFieldType[] {
                    DurationFieldType.years(),
                    DurationFieldType.weeks(), DurationFieldType.days(),
                    DurationFieldType.hours(), DurationFieldType.minutes(),
                    DurationFieldType.seconds(), DurationFieldType.millis(),
                },
                new int[] { 0, -1, 1, 2, 3, 4, 5, 6, }
            );
            __CLR4_4_14h24h2lc8azsez.R.inc(5828);cYWDTime = type;
        }
        }__CLR4_4_14h24h2lc8azsez.R.inc(5829);return type;
    }finally{__CLR4_4_14h24h2lc8azsez.R.flushNeeded();}}

    /**
     * Gets a type that defines year, week and day fields.
     * <ul>
     * <li>years
     * <li>weeks
     * <li>days
     * </ul>
     *
     * @return the period type
     * @since 1.1
     */
    public static PeriodType yearWeekDay() {try{__CLR4_4_14h24h2lc8azsez.R.inc(5830);
        __CLR4_4_14h24h2lc8azsez.R.inc(5831);PeriodType type = cYWD;
        __CLR4_4_14h24h2lc8azsez.R.inc(5832);if ((((type == null)&&(__CLR4_4_14h24h2lc8azsez.R.iget(5833)!=0|true))||(__CLR4_4_14h24h2lc8azsez.R.iget(5834)==0&false))) {{
            __CLR4_4_14h24h2lc8azsez.R.inc(5835);type = new PeriodType(
                "YearWeekDay",
                new DurationFieldType[] {
                    DurationFieldType.years(),
                    DurationFieldType.weeks(), DurationFieldType.days(),
                },
                new int[] { 0, -1, 1, 2, -1, -1, -1, -1, }
            );
            __CLR4_4_14h24h2lc8azsez.R.inc(5836);cYWD = type;
        }
        }__CLR4_4_14h24h2lc8azsez.R.inc(5837);return type;
    }finally{__CLR4_4_14h24h2lc8azsez.R.flushNeeded();}}

    /**
     * Gets a type that defines all standard fields except months and weeks.
     * <ul>
     * <li>years
     * <li>days
     * <li>hours
     * <li>minutes
     * <li>seconds
     * <li>milliseconds
     * </ul>
     *
     * @return the period type
     */
    public static PeriodType yearDayTime() {try{__CLR4_4_14h24h2lc8azsez.R.inc(5838);
        __CLR4_4_14h24h2lc8azsez.R.inc(5839);PeriodType type = cYDTime;
        __CLR4_4_14h24h2lc8azsez.R.inc(5840);if ((((type == null)&&(__CLR4_4_14h24h2lc8azsez.R.iget(5841)!=0|true))||(__CLR4_4_14h24h2lc8azsez.R.iget(5842)==0&false))) {{
            __CLR4_4_14h24h2lc8azsez.R.inc(5843);type = new PeriodType(
                "YearDayTime",
                new DurationFieldType[] {
                    DurationFieldType.years(), DurationFieldType.days(),
                    DurationFieldType.hours(), DurationFieldType.minutes(),
                    DurationFieldType.seconds(), DurationFieldType.millis(),
                },
                new int[] { 0, -1, -1, 1, 2, 3, 4, 5, }
            );
            __CLR4_4_14h24h2lc8azsez.R.inc(5844);cYDTime = type;
        }
        }__CLR4_4_14h24h2lc8azsez.R.inc(5845);return type;
    }finally{__CLR4_4_14h24h2lc8azsez.R.flushNeeded();}}

    /**
     * Gets a type that defines the year and day fields.
     * <ul>
     * <li>years
     * <li>days
     * </ul>
     *
     * @return the period type
     * @since 1.1
     */
    public static PeriodType yearDay() {try{__CLR4_4_14h24h2lc8azsez.R.inc(5846);
        __CLR4_4_14h24h2lc8azsez.R.inc(5847);PeriodType type = cYD;
        __CLR4_4_14h24h2lc8azsez.R.inc(5848);if ((((type == null)&&(__CLR4_4_14h24h2lc8azsez.R.iget(5849)!=0|true))||(__CLR4_4_14h24h2lc8azsez.R.iget(5850)==0&false))) {{
            __CLR4_4_14h24h2lc8azsez.R.inc(5851);type = new PeriodType(
                "YearDay",
                new DurationFieldType[] {
                    DurationFieldType.years(), DurationFieldType.days(),
                },
                new int[] { 0, -1, -1, 1, -1, -1, -1, -1, }
            );
            __CLR4_4_14h24h2lc8azsez.R.inc(5852);cYD = type;
        }
        }__CLR4_4_14h24h2lc8azsez.R.inc(5853);return type;
    }finally{__CLR4_4_14h24h2lc8azsez.R.flushNeeded();}}

    /**
     * Gets a type that defines all standard fields from days downwards.
     * <ul>
     * <li>days
     * <li>hours
     * <li>minutes
     * <li>seconds
     * <li>milliseconds
     * </ul>
     *
     * @return the period type
     */
    public static PeriodType dayTime() {try{__CLR4_4_14h24h2lc8azsez.R.inc(5854);
        __CLR4_4_14h24h2lc8azsez.R.inc(5855);PeriodType type = cDTime;
        __CLR4_4_14h24h2lc8azsez.R.inc(5856);if ((((type == null)&&(__CLR4_4_14h24h2lc8azsez.R.iget(5857)!=0|true))||(__CLR4_4_14h24h2lc8azsez.R.iget(5858)==0&false))) {{
            __CLR4_4_14h24h2lc8azsez.R.inc(5859);type = new PeriodType(
                "DayTime",
                new DurationFieldType[] {
                    DurationFieldType.days(),
                    DurationFieldType.hours(), DurationFieldType.minutes(),
                    DurationFieldType.seconds(), DurationFieldType.millis(),
                },
                new int[] { -1, -1, -1, 0, 1, 2, 3, 4, }
            );
            __CLR4_4_14h24h2lc8azsez.R.inc(5860);cDTime = type;
        }
        }__CLR4_4_14h24h2lc8azsez.R.inc(5861);return type;
    }finally{__CLR4_4_14h24h2lc8azsez.R.flushNeeded();}}

    /**
     * Gets a type that defines all standard time fields.
     * <ul>
     * <li>hours
     * <li>minutes
     * <li>seconds
     * <li>milliseconds
     * </ul>
     *
     * @return the period type
     */
    public static PeriodType time() {try{__CLR4_4_14h24h2lc8azsez.R.inc(5862);
        __CLR4_4_14h24h2lc8azsez.R.inc(5863);PeriodType type = cTime;
        __CLR4_4_14h24h2lc8azsez.R.inc(5864);if ((((type == null)&&(__CLR4_4_14h24h2lc8azsez.R.iget(5865)!=0|true))||(__CLR4_4_14h24h2lc8azsez.R.iget(5866)==0&false))) {{
            __CLR4_4_14h24h2lc8azsez.R.inc(5867);type = new PeriodType(
                "Time",
                new DurationFieldType[] {
                    DurationFieldType.hours(), DurationFieldType.minutes(),
                    DurationFieldType.seconds(), DurationFieldType.millis(),
                },
                new int[] { -1, -1, -1, -1, 0, 1, 2, 3, }
            );
            __CLR4_4_14h24h2lc8azsez.R.inc(5868);cTime = type;
        }
        }__CLR4_4_14h24h2lc8azsez.R.inc(5869);return type;
    }finally{__CLR4_4_14h24h2lc8azsez.R.flushNeeded();}}

    /**
     * Gets a type that defines just the years field.
     *
     * @return the period type
     */
    public static PeriodType years() {try{__CLR4_4_14h24h2lc8azsez.R.inc(5870);
        __CLR4_4_14h24h2lc8azsez.R.inc(5871);PeriodType type = cYears;
        __CLR4_4_14h24h2lc8azsez.R.inc(5872);if ((((type == null)&&(__CLR4_4_14h24h2lc8azsez.R.iget(5873)!=0|true))||(__CLR4_4_14h24h2lc8azsez.R.iget(5874)==0&false))) {{
            __CLR4_4_14h24h2lc8azsez.R.inc(5875);type = new PeriodType(
                "Years",
                new DurationFieldType[] { DurationFieldType.years() },
                new int[] { 0, -1, -1, -1, -1, -1, -1, -1, }
            );
            __CLR4_4_14h24h2lc8azsez.R.inc(5876);cYears = type;
        }
        }__CLR4_4_14h24h2lc8azsez.R.inc(5877);return type;
    }finally{__CLR4_4_14h24h2lc8azsez.R.flushNeeded();}}

    /**
     * Gets a type that defines just the months field.
     *
     * @return the period type
     */
    public static PeriodType months() {try{__CLR4_4_14h24h2lc8azsez.R.inc(5878);
        __CLR4_4_14h24h2lc8azsez.R.inc(5879);PeriodType type = cMonths;
        __CLR4_4_14h24h2lc8azsez.R.inc(5880);if ((((type == null)&&(__CLR4_4_14h24h2lc8azsez.R.iget(5881)!=0|true))||(__CLR4_4_14h24h2lc8azsez.R.iget(5882)==0&false))) {{
            __CLR4_4_14h24h2lc8azsez.R.inc(5883);type = new PeriodType(
                "Months",
                new DurationFieldType[] { DurationFieldType.months() },
                new int[] { -1, 0, -1, -1, -1, -1, -1, -1, }
            );
            __CLR4_4_14h24h2lc8azsez.R.inc(5884);cMonths = type;
        }
        }__CLR4_4_14h24h2lc8azsez.R.inc(5885);return type;
    }finally{__CLR4_4_14h24h2lc8azsez.R.flushNeeded();}}

    /**
     * Gets a type that defines just the weeks field.
     *
     * @return the period type
     */
    public static PeriodType weeks() {try{__CLR4_4_14h24h2lc8azsez.R.inc(5886);
        __CLR4_4_14h24h2lc8azsez.R.inc(5887);PeriodType type = cWeeks;
        __CLR4_4_14h24h2lc8azsez.R.inc(5888);if ((((type == null)&&(__CLR4_4_14h24h2lc8azsez.R.iget(5889)!=0|true))||(__CLR4_4_14h24h2lc8azsez.R.iget(5890)==0&false))) {{
            __CLR4_4_14h24h2lc8azsez.R.inc(5891);type = new PeriodType(
                "Weeks",
                new DurationFieldType[] { DurationFieldType.weeks() },
                new int[] { -1, -1, 0, -1, -1, -1, -1, -1, }
            );
            __CLR4_4_14h24h2lc8azsez.R.inc(5892);cWeeks = type;
        }
        }__CLR4_4_14h24h2lc8azsez.R.inc(5893);return type;
    }finally{__CLR4_4_14h24h2lc8azsez.R.flushNeeded();}}

    /**
     * Gets a type that defines just the days field.
     *
     * @return the period type
     */
    public static PeriodType days() {try{__CLR4_4_14h24h2lc8azsez.R.inc(5894);
        __CLR4_4_14h24h2lc8azsez.R.inc(5895);PeriodType type = cDays;
        __CLR4_4_14h24h2lc8azsez.R.inc(5896);if ((((type == null)&&(__CLR4_4_14h24h2lc8azsez.R.iget(5897)!=0|true))||(__CLR4_4_14h24h2lc8azsez.R.iget(5898)==0&false))) {{
            __CLR4_4_14h24h2lc8azsez.R.inc(5899);type = new PeriodType(
                "Days",
                new DurationFieldType[] { DurationFieldType.days() },
                new int[] { -1, -1, -1, 0, -1, -1, -1, -1, }
            );
            __CLR4_4_14h24h2lc8azsez.R.inc(5900);cDays = type;
        }
        }__CLR4_4_14h24h2lc8azsez.R.inc(5901);return type;
    }finally{__CLR4_4_14h24h2lc8azsez.R.flushNeeded();}}

    /**
     * Gets a type that defines just the hours field.
     *
     * @return the period type
     */
    public static PeriodType hours() {try{__CLR4_4_14h24h2lc8azsez.R.inc(5902);
        __CLR4_4_14h24h2lc8azsez.R.inc(5903);PeriodType type = cHours;
        __CLR4_4_14h24h2lc8azsez.R.inc(5904);if ((((type == null)&&(__CLR4_4_14h24h2lc8azsez.R.iget(5905)!=0|true))||(__CLR4_4_14h24h2lc8azsez.R.iget(5906)==0&false))) {{
            __CLR4_4_14h24h2lc8azsez.R.inc(5907);type = new PeriodType(
                "Hours",
                new DurationFieldType[] { DurationFieldType.hours() },
                new int[] { -1, -1, -1, -1, 0, -1, -1, -1, }
            );
            __CLR4_4_14h24h2lc8azsez.R.inc(5908);cHours = type;
        }
        }__CLR4_4_14h24h2lc8azsez.R.inc(5909);return type;
    }finally{__CLR4_4_14h24h2lc8azsez.R.flushNeeded();}}

    /**
     * Gets a type that defines just the minutes field.
     *
     * @return the period type
     */
    public static PeriodType minutes() {try{__CLR4_4_14h24h2lc8azsez.R.inc(5910);
        __CLR4_4_14h24h2lc8azsez.R.inc(5911);PeriodType type = cMinutes;
        __CLR4_4_14h24h2lc8azsez.R.inc(5912);if ((((type == null)&&(__CLR4_4_14h24h2lc8azsez.R.iget(5913)!=0|true))||(__CLR4_4_14h24h2lc8azsez.R.iget(5914)==0&false))) {{
            __CLR4_4_14h24h2lc8azsez.R.inc(5915);type = new PeriodType(
                "Minutes",
                new DurationFieldType[] { DurationFieldType.minutes() },
                new int[] { -1, -1, -1, -1, -1, 0, -1, -1, }
            );
            __CLR4_4_14h24h2lc8azsez.R.inc(5916);cMinutes = type;
        }
        }__CLR4_4_14h24h2lc8azsez.R.inc(5917);return type;
    }finally{__CLR4_4_14h24h2lc8azsez.R.flushNeeded();}}

    /**
     * Gets a type that defines just the seconds field.
     *
     * @return the period type
     */
    public static PeriodType seconds() {try{__CLR4_4_14h24h2lc8azsez.R.inc(5918);
        __CLR4_4_14h24h2lc8azsez.R.inc(5919);PeriodType type = cSeconds;
        __CLR4_4_14h24h2lc8azsez.R.inc(5920);if ((((type == null)&&(__CLR4_4_14h24h2lc8azsez.R.iget(5921)!=0|true))||(__CLR4_4_14h24h2lc8azsez.R.iget(5922)==0&false))) {{
            __CLR4_4_14h24h2lc8azsez.R.inc(5923);type = new PeriodType(
                "Seconds",
                new DurationFieldType[] { DurationFieldType.seconds() },
                new int[] { -1, -1, -1, -1, -1, -1, 0, -1, }
            );
            __CLR4_4_14h24h2lc8azsez.R.inc(5924);cSeconds = type;
        }
        }__CLR4_4_14h24h2lc8azsez.R.inc(5925);return type;
    }finally{__CLR4_4_14h24h2lc8azsez.R.flushNeeded();}}

    /**
     * Gets a type that defines just the millis field.
     *
     * @return the period type
     */
    public static PeriodType millis() {try{__CLR4_4_14h24h2lc8azsez.R.inc(5926);
        __CLR4_4_14h24h2lc8azsez.R.inc(5927);PeriodType type = cMillis;
        __CLR4_4_14h24h2lc8azsez.R.inc(5928);if ((((type == null)&&(__CLR4_4_14h24h2lc8azsez.R.iget(5929)!=0|true))||(__CLR4_4_14h24h2lc8azsez.R.iget(5930)==0&false))) {{
            __CLR4_4_14h24h2lc8azsez.R.inc(5931);type = new PeriodType(
                "Millis",
                new DurationFieldType[] { DurationFieldType.millis() },
                new int[] { -1, -1, -1, -1, -1, -1, -1, 0, }
            );
            __CLR4_4_14h24h2lc8azsez.R.inc(5932);cMillis = type;
        }
        }__CLR4_4_14h24h2lc8azsez.R.inc(5933);return type;
    }finally{__CLR4_4_14h24h2lc8azsez.R.flushNeeded();}}

    /**
     * Gets a period type that contains the duration types of the array.
     * <p>
     * Only the 8 standard duration field types are supported.
     *
     * @param types  the types to include in the array.
     * @return the period type
     * @since 1.1
     */
    public static synchronized PeriodType forFields(DurationFieldType[] types) {try{__CLR4_4_14h24h2lc8azsez.R.inc(5934);
        __CLR4_4_14h24h2lc8azsez.R.inc(5935);if ((((types == null || types.length == 0)&&(__CLR4_4_14h24h2lc8azsez.R.iget(5936)!=0|true))||(__CLR4_4_14h24h2lc8azsez.R.iget(5937)==0&false))) {{
            __CLR4_4_14h24h2lc8azsez.R.inc(5938);throw new IllegalArgumentException("Types array must not be null or empty");
        }
        }__CLR4_4_14h24h2lc8azsez.R.inc(5939);for (int i = 0; (((i < types.length)&&(__CLR4_4_14h24h2lc8azsez.R.iget(5940)!=0|true))||(__CLR4_4_14h24h2lc8azsez.R.iget(5941)==0&false)); i++) {{
            __CLR4_4_14h24h2lc8azsez.R.inc(5942);if ((((types[i] == null)&&(__CLR4_4_14h24h2lc8azsez.R.iget(5943)!=0|true))||(__CLR4_4_14h24h2lc8azsez.R.iget(5944)==0&false))) {{
                __CLR4_4_14h24h2lc8azsez.R.inc(5945);throw new IllegalArgumentException("Types array must not contain null");
            }
        }}
        }__CLR4_4_14h24h2lc8azsez.R.inc(5946);Map<PeriodType, Object> cache = cTypes;
        __CLR4_4_14h24h2lc8azsez.R.inc(5947);if ((((cache.isEmpty())&&(__CLR4_4_14h24h2lc8azsez.R.iget(5948)!=0|true))||(__CLR4_4_14h24h2lc8azsez.R.iget(5949)==0&false))) {{
            __CLR4_4_14h24h2lc8azsez.R.inc(5950);cache.put(standard(), standard());
            __CLR4_4_14h24h2lc8azsez.R.inc(5951);cache.put(yearMonthDayTime(), yearMonthDayTime());
            __CLR4_4_14h24h2lc8azsez.R.inc(5952);cache.put(yearMonthDay(), yearMonthDay());
            __CLR4_4_14h24h2lc8azsez.R.inc(5953);cache.put(yearWeekDayTime(), yearWeekDayTime());
            __CLR4_4_14h24h2lc8azsez.R.inc(5954);cache.put(yearWeekDay(), yearWeekDay());
            __CLR4_4_14h24h2lc8azsez.R.inc(5955);cache.put(yearDayTime(), yearDayTime());
            __CLR4_4_14h24h2lc8azsez.R.inc(5956);cache.put(yearDay(), yearDay());
            __CLR4_4_14h24h2lc8azsez.R.inc(5957);cache.put(dayTime(), dayTime());
            __CLR4_4_14h24h2lc8azsez.R.inc(5958);cache.put(time(), time());
            __CLR4_4_14h24h2lc8azsez.R.inc(5959);cache.put(years(), years());
            __CLR4_4_14h24h2lc8azsez.R.inc(5960);cache.put(months(), months());
            __CLR4_4_14h24h2lc8azsez.R.inc(5961);cache.put(weeks(), weeks());
            __CLR4_4_14h24h2lc8azsez.R.inc(5962);cache.put(days(), days());
            __CLR4_4_14h24h2lc8azsez.R.inc(5963);cache.put(hours(), hours());
            __CLR4_4_14h24h2lc8azsez.R.inc(5964);cache.put(minutes(), minutes());
            __CLR4_4_14h24h2lc8azsez.R.inc(5965);cache.put(seconds(), seconds());
            __CLR4_4_14h24h2lc8azsez.R.inc(5966);cache.put(millis(), millis());
        }
        }__CLR4_4_14h24h2lc8azsez.R.inc(5967);PeriodType inPartType = new PeriodType(null, types, null);
        __CLR4_4_14h24h2lc8azsez.R.inc(5968);Object cached = cache.get(inPartType);
        __CLR4_4_14h24h2lc8azsez.R.inc(5969);if ((((cached instanceof PeriodType)&&(__CLR4_4_14h24h2lc8azsez.R.iget(5970)!=0|true))||(__CLR4_4_14h24h2lc8azsez.R.iget(5971)==0&false))) {{
            __CLR4_4_14h24h2lc8azsez.R.inc(5972);return (PeriodType) cached;
        }
        }__CLR4_4_14h24h2lc8azsez.R.inc(5973);if ((((cached != null)&&(__CLR4_4_14h24h2lc8azsez.R.iget(5974)!=0|true))||(__CLR4_4_14h24h2lc8azsez.R.iget(5975)==0&false))) {{
            __CLR4_4_14h24h2lc8azsez.R.inc(5976);throw new IllegalArgumentException("PeriodType does not support fields: " + cached);
        }
        }__CLR4_4_14h24h2lc8azsez.R.inc(5977);PeriodType type = standard();
        __CLR4_4_14h24h2lc8azsez.R.inc(5978);List<DurationFieldType> list = new ArrayList<DurationFieldType>(Arrays.asList(types));
        __CLR4_4_14h24h2lc8azsez.R.inc(5979);if ((((list.remove(DurationFieldType.years()) == false)&&(__CLR4_4_14h24h2lc8azsez.R.iget(5980)!=0|true))||(__CLR4_4_14h24h2lc8azsez.R.iget(5981)==0&false))) {{
            __CLR4_4_14h24h2lc8azsez.R.inc(5982);type = type.withYearsRemoved();
        }
        }__CLR4_4_14h24h2lc8azsez.R.inc(5983);if ((((list.remove(DurationFieldType.months()) == false)&&(__CLR4_4_14h24h2lc8azsez.R.iget(5984)!=0|true))||(__CLR4_4_14h24h2lc8azsez.R.iget(5985)==0&false))) {{
            __CLR4_4_14h24h2lc8azsez.R.inc(5986);type = type.withMonthsRemoved();
        }
        }__CLR4_4_14h24h2lc8azsez.R.inc(5987);if ((((list.remove(DurationFieldType.weeks()) == false)&&(__CLR4_4_14h24h2lc8azsez.R.iget(5988)!=0|true))||(__CLR4_4_14h24h2lc8azsez.R.iget(5989)==0&false))) {{
            __CLR4_4_14h24h2lc8azsez.R.inc(5990);type = type.withWeeksRemoved();
        }
        }__CLR4_4_14h24h2lc8azsez.R.inc(5991);if ((((list.remove(DurationFieldType.days()) == false)&&(__CLR4_4_14h24h2lc8azsez.R.iget(5992)!=0|true))||(__CLR4_4_14h24h2lc8azsez.R.iget(5993)==0&false))) {{
            __CLR4_4_14h24h2lc8azsez.R.inc(5994);type = type.withDaysRemoved();
        }
        }__CLR4_4_14h24h2lc8azsez.R.inc(5995);if ((((list.remove(DurationFieldType.hours()) == false)&&(__CLR4_4_14h24h2lc8azsez.R.iget(5996)!=0|true))||(__CLR4_4_14h24h2lc8azsez.R.iget(5997)==0&false))) {{
            __CLR4_4_14h24h2lc8azsez.R.inc(5998);type = type.withHoursRemoved();
        }
        }__CLR4_4_14h24h2lc8azsez.R.inc(5999);if ((((list.remove(DurationFieldType.minutes()) == false)&&(__CLR4_4_14h24h2lc8azsez.R.iget(6000)!=0|true))||(__CLR4_4_14h24h2lc8azsez.R.iget(6001)==0&false))) {{
            __CLR4_4_14h24h2lc8azsez.R.inc(6002);type = type.withMinutesRemoved();
        }
        }__CLR4_4_14h24h2lc8azsez.R.inc(6003);if ((((list.remove(DurationFieldType.seconds()) == false)&&(__CLR4_4_14h24h2lc8azsez.R.iget(6004)!=0|true))||(__CLR4_4_14h24h2lc8azsez.R.iget(6005)==0&false))) {{
            __CLR4_4_14h24h2lc8azsez.R.inc(6006);type = type.withSecondsRemoved();
        }
        }__CLR4_4_14h24h2lc8azsez.R.inc(6007);if ((((list.remove(DurationFieldType.millis()) == false)&&(__CLR4_4_14h24h2lc8azsez.R.iget(6008)!=0|true))||(__CLR4_4_14h24h2lc8azsez.R.iget(6009)==0&false))) {{
            __CLR4_4_14h24h2lc8azsez.R.inc(6010);type = type.withMillisRemoved();
        }
        }__CLR4_4_14h24h2lc8azsez.R.inc(6011);if ((((list.size() > 0)&&(__CLR4_4_14h24h2lc8azsez.R.iget(6012)!=0|true))||(__CLR4_4_14h24h2lc8azsez.R.iget(6013)==0&false))) {{
            __CLR4_4_14h24h2lc8azsez.R.inc(6014);cache.put(inPartType, list);
            __CLR4_4_14h24h2lc8azsez.R.inc(6015);throw new IllegalArgumentException("PeriodType does not support fields: " + list);
        }
        // recheck cache in case initial array order was wrong
        }__CLR4_4_14h24h2lc8azsez.R.inc(6016);PeriodType checkPartType = new PeriodType(null, type.iTypes, null);
        __CLR4_4_14h24h2lc8azsez.R.inc(6017);PeriodType checkedType = (PeriodType) cache.get(checkPartType);
        __CLR4_4_14h24h2lc8azsez.R.inc(6018);if ((((checkedType != null)&&(__CLR4_4_14h24h2lc8azsez.R.iget(6019)!=0|true))||(__CLR4_4_14h24h2lc8azsez.R.iget(6020)==0&false))) {{
            __CLR4_4_14h24h2lc8azsez.R.inc(6021);cache.put(checkPartType, checkedType);
            __CLR4_4_14h24h2lc8azsez.R.inc(6022);return checkedType;
        }
        }__CLR4_4_14h24h2lc8azsez.R.inc(6023);cache.put(checkPartType, type);
        __CLR4_4_14h24h2lc8azsez.R.inc(6024);return type;
    }finally{__CLR4_4_14h24h2lc8azsez.R.flushNeeded();}}

    //-----------------------------------------------------------------------    
    /** The name of the type */
    private final String iName;
    /** The array of types */
    private final DurationFieldType[] iTypes;
    /** The array of indices */
    private final int[] iIndices;

    /**
     * Constructor.
     *
     * @param name  the name
     * @param types  the types
     * @param indices  the indices
     */
    protected PeriodType(String name, DurationFieldType[] types, int[] indices) {
        super();__CLR4_4_14h24h2lc8azsez.R.inc(6026);try{__CLR4_4_14h24h2lc8azsez.R.inc(6025);
        __CLR4_4_14h24h2lc8azsez.R.inc(6027);iName = name;
        __CLR4_4_14h24h2lc8azsez.R.inc(6028);iTypes = types;
        __CLR4_4_14h24h2lc8azsez.R.inc(6029);iIndices = indices;
    }finally{__CLR4_4_14h24h2lc8azsez.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Gets the name of the period type.
     * 
     * @return the name
     */
    public String getName() {try{__CLR4_4_14h24h2lc8azsez.R.inc(6030);
        __CLR4_4_14h24h2lc8azsez.R.inc(6031);return iName;
    }finally{__CLR4_4_14h24h2lc8azsez.R.flushNeeded();}}

    /**
     * Gets the number of fields in the period type.
     * 
     * @return the number of fields
     */
    public int size() {try{__CLR4_4_14h24h2lc8azsez.R.inc(6032);
        __CLR4_4_14h24h2lc8azsez.R.inc(6033);return iTypes.length;
    }finally{__CLR4_4_14h24h2lc8azsez.R.flushNeeded();}}

    /**
     * Gets the field type by index.
     * 
     * @param index  the index to retrieve
     * @return the field type
     * @throws IndexOutOfBoundsException if the index is invalid
     */
    public DurationFieldType getFieldType(int index) {try{__CLR4_4_14h24h2lc8azsez.R.inc(6034);
        __CLR4_4_14h24h2lc8azsez.R.inc(6035);return iTypes[index];
    }finally{__CLR4_4_14h24h2lc8azsez.R.flushNeeded();}}

    /**
     * Checks whether the field specified is supported by this period.
     *
     * @param type  the type to check, may be null which returns false
     * @return true if the field is supported
     */
    public boolean isSupported(DurationFieldType type) {try{__CLR4_4_14h24h2lc8azsez.R.inc(6036);
        __CLR4_4_14h24h2lc8azsez.R.inc(6037);return (indexOf(type) >= 0);
    }finally{__CLR4_4_14h24h2lc8azsez.R.flushNeeded();}}

    /**
     * Gets the index of the field in this period.
     *
     * @param type  the type to check, may be null which returns -1
     * @return the index of -1 if not supported
     */
    public int indexOf(DurationFieldType type) {try{__CLR4_4_14h24h2lc8azsez.R.inc(6038);
        __CLR4_4_14h24h2lc8azsez.R.inc(6039);for (int i = 0, isize = size(); (((i < isize)&&(__CLR4_4_14h24h2lc8azsez.R.iget(6040)!=0|true))||(__CLR4_4_14h24h2lc8azsez.R.iget(6041)==0&false)); i++) {{
            __CLR4_4_14h24h2lc8azsez.R.inc(6042);if ((((iTypes[i] == type)&&(__CLR4_4_14h24h2lc8azsez.R.iget(6043)!=0|true))||(__CLR4_4_14h24h2lc8azsez.R.iget(6044)==0&false))) {{
                __CLR4_4_14h24h2lc8azsez.R.inc(6045);return i;
            }
        }}
        }__CLR4_4_14h24h2lc8azsez.R.inc(6046);return -1;
    }finally{__CLR4_4_14h24h2lc8azsez.R.flushNeeded();}}

    /**
     * Gets a debugging to string.
     * 
     * @return a string
     */
    public String toString() {try{__CLR4_4_14h24h2lc8azsez.R.inc(6047);
        __CLR4_4_14h24h2lc8azsez.R.inc(6048);return "PeriodType[" + getName() + "]";
    }finally{__CLR4_4_14h24h2lc8azsez.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Gets the indexed field part of the period.
     * 
     * @param period  the period to query
     * @param index  the index to use
     * @return the value of the field, zero if unsupported
     */
    int getIndexedField(ReadablePeriod period, int index) {try{__CLR4_4_14h24h2lc8azsez.R.inc(6049);
        __CLR4_4_14h24h2lc8azsez.R.inc(6050);int realIndex = iIndices[index];
        __CLR4_4_14h24h2lc8azsez.R.inc(6051);return ((((realIndex == -1 )&&(__CLR4_4_14h24h2lc8azsez.R.iget(6052)!=0|true))||(__CLR4_4_14h24h2lc8azsez.R.iget(6053)==0&false))? 0 : period.getValue(realIndex));
    }finally{__CLR4_4_14h24h2lc8azsez.R.flushNeeded();}}

    /**
     * Sets the indexed field part of the period.
     * 
     * @param period  the period to query
     * @param index  the index to use
     * @param values  the array to populate
     * @param newValue  the value to set
     * @throws UnsupportedOperationException if not supported
     */
    boolean setIndexedField(ReadablePeriod period, int index, int[] values, int newValue) {try{__CLR4_4_14h24h2lc8azsez.R.inc(6054);
        __CLR4_4_14h24h2lc8azsez.R.inc(6055);int realIndex = iIndices[index];
        __CLR4_4_14h24h2lc8azsez.R.inc(6056);if ((((realIndex == -1)&&(__CLR4_4_14h24h2lc8azsez.R.iget(6057)!=0|true))||(__CLR4_4_14h24h2lc8azsez.R.iget(6058)==0&false))) {{
            __CLR4_4_14h24h2lc8azsez.R.inc(6059);throw new UnsupportedOperationException("Field is not supported");
        }
        }__CLR4_4_14h24h2lc8azsez.R.inc(6060);values[realIndex] = newValue;
        __CLR4_4_14h24h2lc8azsez.R.inc(6061);return true;
    }finally{__CLR4_4_14h24h2lc8azsez.R.flushNeeded();}}

    /**
     * Adds to the indexed field part of the period.
     * 
     * @param period  the period to query
     * @param index  the index to use
     * @param values  the array to populate
     * @param valueToAdd  the value to add
     * @return true if the array is updated
     * @throws UnsupportedOperationException if not supported
     */
    boolean addIndexedField(ReadablePeriod period, int index, int[] values, int valueToAdd) {try{__CLR4_4_14h24h2lc8azsez.R.inc(6062);
        __CLR4_4_14h24h2lc8azsez.R.inc(6063);if ((((valueToAdd == 0)&&(__CLR4_4_14h24h2lc8azsez.R.iget(6064)!=0|true))||(__CLR4_4_14h24h2lc8azsez.R.iget(6065)==0&false))) {{
            __CLR4_4_14h24h2lc8azsez.R.inc(6066);return false;
        }
        }__CLR4_4_14h24h2lc8azsez.R.inc(6067);int realIndex = iIndices[index];
        __CLR4_4_14h24h2lc8azsez.R.inc(6068);if ((((realIndex == -1)&&(__CLR4_4_14h24h2lc8azsez.R.iget(6069)!=0|true))||(__CLR4_4_14h24h2lc8azsez.R.iget(6070)==0&false))) {{
            __CLR4_4_14h24h2lc8azsez.R.inc(6071);throw new UnsupportedOperationException("Field is not supported");
        }
        }__CLR4_4_14h24h2lc8azsez.R.inc(6072);values[realIndex] = FieldUtils.safeAdd(values[realIndex], valueToAdd);
        __CLR4_4_14h24h2lc8azsez.R.inc(6073);return true;
    }finally{__CLR4_4_14h24h2lc8azsez.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Returns a version of this PeriodType instance that does not support years.
     * 
     * @return a new period type that supports the original set of fields except years
     */
    public PeriodType withYearsRemoved() {try{__CLR4_4_14h24h2lc8azsez.R.inc(6074);
        __CLR4_4_14h24h2lc8azsez.R.inc(6075);return withFieldRemoved(0, "NoYears");
    }finally{__CLR4_4_14h24h2lc8azsez.R.flushNeeded();}}

    /**
     * Returns a version of this PeriodType instance that does not support months.
     * 
     * @return a new period type that supports the original set of fields except months
     */
    public PeriodType withMonthsRemoved() {try{__CLR4_4_14h24h2lc8azsez.R.inc(6076);
        __CLR4_4_14h24h2lc8azsez.R.inc(6077);return withFieldRemoved(1, "NoMonths");
    }finally{__CLR4_4_14h24h2lc8azsez.R.flushNeeded();}}

    /**
     * Returns a version of this PeriodType instance that does not support weeks.
     * 
     * @return a new period type that supports the original set of fields except weeks
     */
    public PeriodType withWeeksRemoved() {try{__CLR4_4_14h24h2lc8azsez.R.inc(6078);
        __CLR4_4_14h24h2lc8azsez.R.inc(6079);return withFieldRemoved(2, "NoWeeks");
    }finally{__CLR4_4_14h24h2lc8azsez.R.flushNeeded();}}

    /**
     * Returns a version of this PeriodType instance that does not support days.
     * 
     * @return a new period type that supports the original set of fields except days
     */
    public PeriodType withDaysRemoved() {try{__CLR4_4_14h24h2lc8azsez.R.inc(6080);
        __CLR4_4_14h24h2lc8azsez.R.inc(6081);return withFieldRemoved(3, "NoDays");
    }finally{__CLR4_4_14h24h2lc8azsez.R.flushNeeded();}}

    /**
     * Returns a version of this PeriodType instance that does not support hours.
     * 
     * @return a new period type that supports the original set of fields except hours
     */
    public PeriodType withHoursRemoved() {try{__CLR4_4_14h24h2lc8azsez.R.inc(6082);
        __CLR4_4_14h24h2lc8azsez.R.inc(6083);return withFieldRemoved(4, "NoHours");
    }finally{__CLR4_4_14h24h2lc8azsez.R.flushNeeded();}}

    /**
     * Returns a version of this PeriodType instance that does not support minutes.
     * 
     * @return a new period type that supports the original set of fields except minutes
     */
    public PeriodType withMinutesRemoved() {try{__CLR4_4_14h24h2lc8azsez.R.inc(6084);
        __CLR4_4_14h24h2lc8azsez.R.inc(6085);return withFieldRemoved(5, "NoMinutes");
    }finally{__CLR4_4_14h24h2lc8azsez.R.flushNeeded();}}

    /**
     * Returns a version of this PeriodType instance that does not support seconds.
     * 
     * @return a new period type that supports the original set of fields except seconds
     */
    public PeriodType withSecondsRemoved() {try{__CLR4_4_14h24h2lc8azsez.R.inc(6086);
        __CLR4_4_14h24h2lc8azsez.R.inc(6087);return withFieldRemoved(6, "NoSeconds");
    }finally{__CLR4_4_14h24h2lc8azsez.R.flushNeeded();}}

    /**
     * Returns a version of this PeriodType instance that does not support milliseconds.
     * 
     * @return a new period type that supports the original set of fields except milliseconds
     */
    public PeriodType withMillisRemoved() {try{__CLR4_4_14h24h2lc8azsez.R.inc(6088);
        __CLR4_4_14h24h2lc8azsez.R.inc(6089);return withFieldRemoved(7, "NoMillis");
    }finally{__CLR4_4_14h24h2lc8azsez.R.flushNeeded();}}

    /**
     * Removes the field specified by indices index.
     * 
     * @param indicesIndex  the index to remove
     * @param name  the name addition
     * @return the new type
     */
    private PeriodType withFieldRemoved(int indicesIndex, String name) {try{__CLR4_4_14h24h2lc8azsez.R.inc(6090);
        __CLR4_4_14h24h2lc8azsez.R.inc(6091);int fieldIndex = iIndices[indicesIndex];
        __CLR4_4_14h24h2lc8azsez.R.inc(6092);if ((((fieldIndex == -1)&&(__CLR4_4_14h24h2lc8azsez.R.iget(6093)!=0|true))||(__CLR4_4_14h24h2lc8azsez.R.iget(6094)==0&false))) {{
            __CLR4_4_14h24h2lc8azsez.R.inc(6095);return this;
        }
        
        }__CLR4_4_14h24h2lc8azsez.R.inc(6096);DurationFieldType[] types = new DurationFieldType[size() - 1];
        __CLR4_4_14h24h2lc8azsez.R.inc(6097);for (int i = 0; (((i < iTypes.length)&&(__CLR4_4_14h24h2lc8azsez.R.iget(6098)!=0|true))||(__CLR4_4_14h24h2lc8azsez.R.iget(6099)==0&false)); i++) {{
            __CLR4_4_14h24h2lc8azsez.R.inc(6100);if ((((i < fieldIndex)&&(__CLR4_4_14h24h2lc8azsez.R.iget(6101)!=0|true))||(__CLR4_4_14h24h2lc8azsez.R.iget(6102)==0&false))) {{
                __CLR4_4_14h24h2lc8azsez.R.inc(6103);types[i] = iTypes[i];
            } }else {__CLR4_4_14h24h2lc8azsez.R.inc(6104);if ((((i > fieldIndex)&&(__CLR4_4_14h24h2lc8azsez.R.iget(6105)!=0|true))||(__CLR4_4_14h24h2lc8azsez.R.iget(6106)==0&false))) {{
                __CLR4_4_14h24h2lc8azsez.R.inc(6107);types[i - 1] = iTypes[i];
            }
        }}}
        
        }__CLR4_4_14h24h2lc8azsez.R.inc(6108);int[] indices = new int[8];
        __CLR4_4_14h24h2lc8azsez.R.inc(6109);for (int i = 0; (((i < indices.length)&&(__CLR4_4_14h24h2lc8azsez.R.iget(6110)!=0|true))||(__CLR4_4_14h24h2lc8azsez.R.iget(6111)==0&false)); i++) {{
            __CLR4_4_14h24h2lc8azsez.R.inc(6112);if ((((i < indicesIndex)&&(__CLR4_4_14h24h2lc8azsez.R.iget(6113)!=0|true))||(__CLR4_4_14h24h2lc8azsez.R.iget(6114)==0&false))) {{
                __CLR4_4_14h24h2lc8azsez.R.inc(6115);indices[i] = iIndices[i];
            } }else {__CLR4_4_14h24h2lc8azsez.R.inc(6116);if ((((i > indicesIndex)&&(__CLR4_4_14h24h2lc8azsez.R.iget(6117)!=0|true))||(__CLR4_4_14h24h2lc8azsez.R.iget(6118)==0&false))) {{
                __CLR4_4_14h24h2lc8azsez.R.inc(6119);indices[i] = ((((iIndices[i] == -1 )&&(__CLR4_4_14h24h2lc8azsez.R.iget(6120)!=0|true))||(__CLR4_4_14h24h2lc8azsez.R.iget(6121)==0&false))? -1 : iIndices[i] - 1);
            } }else {{
                __CLR4_4_14h24h2lc8azsez.R.inc(6122);indices[i] = -1;
            }
        }}}
        }__CLR4_4_14h24h2lc8azsez.R.inc(6123);return new PeriodType(getName() + name, types, indices);
    }finally{__CLR4_4_14h24h2lc8azsez.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Compares this type to another object.
     * To be equal, the object must be a PeriodType with the same set of fields.
     * 
     * @param obj  the object to compare to
     * @return true if equal
     */
    public boolean equals(Object obj) {try{__CLR4_4_14h24h2lc8azsez.R.inc(6124);
        __CLR4_4_14h24h2lc8azsez.R.inc(6125);if ((((this == obj)&&(__CLR4_4_14h24h2lc8azsez.R.iget(6126)!=0|true))||(__CLR4_4_14h24h2lc8azsez.R.iget(6127)==0&false))) {{
            __CLR4_4_14h24h2lc8azsez.R.inc(6128);return true;
        }
        }__CLR4_4_14h24h2lc8azsez.R.inc(6129);if ((((obj instanceof PeriodType == false)&&(__CLR4_4_14h24h2lc8azsez.R.iget(6130)!=0|true))||(__CLR4_4_14h24h2lc8azsez.R.iget(6131)==0&false))) {{
            __CLR4_4_14h24h2lc8azsez.R.inc(6132);return false;
        }
        }__CLR4_4_14h24h2lc8azsez.R.inc(6133);PeriodType other = (PeriodType) obj;
        __CLR4_4_14h24h2lc8azsez.R.inc(6134);return (Arrays.equals(iTypes, other.iTypes));
    }finally{__CLR4_4_14h24h2lc8azsez.R.flushNeeded();}}

    /**
     * Returns a hashcode based on the field types.
     * 
     * @return a suitable hashcode
     */
    public int hashCode() {try{__CLR4_4_14h24h2lc8azsez.R.inc(6135);
        __CLR4_4_14h24h2lc8azsez.R.inc(6136);int hash = 0;
        __CLR4_4_14h24h2lc8azsez.R.inc(6137);for (int i = 0; (((i < iTypes.length)&&(__CLR4_4_14h24h2lc8azsez.R.iget(6138)!=0|true))||(__CLR4_4_14h24h2lc8azsez.R.iget(6139)==0&false)); i++) {{
            __CLR4_4_14h24h2lc8azsez.R.inc(6140);hash += iTypes[i].hashCode();
        }
        }__CLR4_4_14h24h2lc8azsez.R.inc(6141);return hash;
    }finally{__CLR4_4_14h24h2lc8azsez.R.flushNeeded();}}

}
