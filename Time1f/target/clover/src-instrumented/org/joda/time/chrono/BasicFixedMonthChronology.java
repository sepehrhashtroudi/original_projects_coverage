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
package org.joda.time.chrono;

import org.joda.time.Chronology;
import org.joda.time.DateTimeConstants;

/**
 * Abstract implementation of a calendar system based around fixed length months.
 * <p>
 * As the month length is fixed various calculations can be optimised.
 * This implementation assumes any additional days after twelve
 * months fall into a thirteenth month.
 * <p>
 * BasicFixedMonthChronology is thread-safe and immutable, and all
 * subclasses must be as well.
 *
 * @author Brian S O'Neill
 * @author Stephen Colebourne
 * @since 1.2, refactored from CopticChronology
 */
abstract class BasicFixedMonthChronology extends BasicChronology {public static class __CLR4_4_173i73ilc8azst0{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672271027956L,8589935092L,9256,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** Serialization lock */
    private static final long serialVersionUID = 261387371998L;

    /** The length of the month. */
    static final int MONTH_LENGTH = 30;

    /** The typical millis per year. */
    static final long MILLIS_PER_YEAR =
        (long) (365.25 * DateTimeConstants.MILLIS_PER_DAY);

    /** The length of the month in millis. */
    static final long MILLIS_PER_MONTH = ((long) MONTH_LENGTH) * DateTimeConstants.MILLIS_PER_DAY;

    //-----------------------------------------------------------------------
    /**
     * Restricted constructor.
     *
     * @param base  the base chronology
     * @param param  the init parameter
     * @param minDaysInFirstWeek  the minimum days in the first week
     */
    BasicFixedMonthChronology(Chronology base, Object param, int minDaysInFirstWeek) {
        super(base, param, minDaysInFirstWeek);__CLR4_4_173i73ilc8azst0.R.inc(9199);try{__CLR4_4_173i73ilc8azst0.R.inc(9198);
    }finally{__CLR4_4_173i73ilc8azst0.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    long setYear(long instant, int year) {try{__CLR4_4_173i73ilc8azst0.R.inc(9200);
        // optimsed implementation of set, due to fixed months
        __CLR4_4_173i73ilc8azst0.R.inc(9201);int thisYear = getYear(instant);
        __CLR4_4_173i73ilc8azst0.R.inc(9202);int dayOfYear = getDayOfYear(instant, thisYear);
        __CLR4_4_173i73ilc8azst0.R.inc(9203);int millisOfDay = getMillisOfDay(instant);

        __CLR4_4_173i73ilc8azst0.R.inc(9204);if ((((dayOfYear > 365)&&(__CLR4_4_173i73ilc8azst0.R.iget(9205)!=0|true))||(__CLR4_4_173i73ilc8azst0.R.iget(9206)==0&false))) {{
            // Current year is leap, and day is leap.
            __CLR4_4_173i73ilc8azst0.R.inc(9207);if ((((!isLeapYear(year))&&(__CLR4_4_173i73ilc8azst0.R.iget(9208)!=0|true))||(__CLR4_4_173i73ilc8azst0.R.iget(9209)==0&false))) {{
                // Moving to a non-leap year, leap day doesn't exist.
                __CLR4_4_173i73ilc8azst0.R.inc(9210);dayOfYear--;
            }
        }}

        }__CLR4_4_173i73ilc8azst0.R.inc(9211);instant = getYearMonthDayMillis(year, 1, dayOfYear);
        __CLR4_4_173i73ilc8azst0.R.inc(9212);instant += millisOfDay;
        __CLR4_4_173i73ilc8azst0.R.inc(9213);return instant;
    }finally{__CLR4_4_173i73ilc8azst0.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    long getYearDifference(long minuendInstant, long subtrahendInstant) {try{__CLR4_4_173i73ilc8azst0.R.inc(9214);
        // optimsed implementation of getDifference, due to fixed months
        __CLR4_4_173i73ilc8azst0.R.inc(9215);int minuendYear = getYear(minuendInstant);
        __CLR4_4_173i73ilc8azst0.R.inc(9216);int subtrahendYear = getYear(subtrahendInstant);

        // Inlined remainder method to avoid duplicate calls to get.
        __CLR4_4_173i73ilc8azst0.R.inc(9217);long minuendRem = minuendInstant - getYearMillis(minuendYear);
        __CLR4_4_173i73ilc8azst0.R.inc(9218);long subtrahendRem = subtrahendInstant - getYearMillis(subtrahendYear);

        __CLR4_4_173i73ilc8azst0.R.inc(9219);int difference = minuendYear - subtrahendYear;
        __CLR4_4_173i73ilc8azst0.R.inc(9220);if ((((minuendRem < subtrahendRem)&&(__CLR4_4_173i73ilc8azst0.R.iget(9221)!=0|true))||(__CLR4_4_173i73ilc8azst0.R.iget(9222)==0&false))) {{
            __CLR4_4_173i73ilc8azst0.R.inc(9223);difference--;
        }
        }__CLR4_4_173i73ilc8azst0.R.inc(9224);return difference;
    }finally{__CLR4_4_173i73ilc8azst0.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    long getTotalMillisByYearMonth(int year, int month) {try{__CLR4_4_173i73ilc8azst0.R.inc(9225);
        __CLR4_4_173i73ilc8azst0.R.inc(9226);return ((month - 1) * MILLIS_PER_MONTH);
    }finally{__CLR4_4_173i73ilc8azst0.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    int getDayOfMonth(long millis) {try{__CLR4_4_173i73ilc8azst0.R.inc(9227);
        // optimised for fixed months
        __CLR4_4_173i73ilc8azst0.R.inc(9228);return (getDayOfYear(millis) - 1) % MONTH_LENGTH + 1;
    }finally{__CLR4_4_173i73ilc8azst0.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    boolean isLeapYear(int year) {try{__CLR4_4_173i73ilc8azst0.R.inc(9229);
        __CLR4_4_173i73ilc8azst0.R.inc(9230);return (year & 3) == 3;
    }finally{__CLR4_4_173i73ilc8azst0.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    int getDaysInYearMonth(int year, int month) {try{__CLR4_4_173i73ilc8azst0.R.inc(9231);
        __CLR4_4_173i73ilc8azst0.R.inc(9232);return ((((month != 13) )&&(__CLR4_4_173i73ilc8azst0.R.iget(9233)!=0|true))||(__CLR4_4_173i73ilc8azst0.R.iget(9234)==0&false))? MONTH_LENGTH : ((((isLeapYear(year) )&&(__CLR4_4_173i73ilc8azst0.R.iget(9235)!=0|true))||(__CLR4_4_173i73ilc8azst0.R.iget(9236)==0&false))? 6 : 5);
    }finally{__CLR4_4_173i73ilc8azst0.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    int getDaysInMonthMax() {try{__CLR4_4_173i73ilc8azst0.R.inc(9237);
        __CLR4_4_173i73ilc8azst0.R.inc(9238);return MONTH_LENGTH;
    }finally{__CLR4_4_173i73ilc8azst0.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    int getDaysInMonthMax(int month) {try{__CLR4_4_173i73ilc8azst0.R.inc(9239);
        __CLR4_4_173i73ilc8azst0.R.inc(9240);return ((((month != 13 )&&(__CLR4_4_173i73ilc8azst0.R.iget(9241)!=0|true))||(__CLR4_4_173i73ilc8azst0.R.iget(9242)==0&false))? MONTH_LENGTH : 6);
    }finally{__CLR4_4_173i73ilc8azst0.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    int getMonthOfYear(long millis) {try{__CLR4_4_173i73ilc8azst0.R.inc(9243);
        __CLR4_4_173i73ilc8azst0.R.inc(9244);return (getDayOfYear(millis) - 1) / MONTH_LENGTH + 1;
    }finally{__CLR4_4_173i73ilc8azst0.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    int getMonthOfYear(long millis, int year) {try{__CLR4_4_173i73ilc8azst0.R.inc(9245);
        __CLR4_4_173i73ilc8azst0.R.inc(9246);long monthZeroBased = (millis - getYearMillis(year)) / MILLIS_PER_MONTH;
        __CLR4_4_173i73ilc8azst0.R.inc(9247);return ((int) monthZeroBased) + 1;
    }finally{__CLR4_4_173i73ilc8azst0.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    int getMaxMonth() {try{__CLR4_4_173i73ilc8azst0.R.inc(9248);
        __CLR4_4_173i73ilc8azst0.R.inc(9249);return 13;
    }finally{__CLR4_4_173i73ilc8azst0.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    long getAverageMillisPerYear() {try{__CLR4_4_173i73ilc8azst0.R.inc(9250);
        __CLR4_4_173i73ilc8azst0.R.inc(9251);return MILLIS_PER_YEAR;
    }finally{__CLR4_4_173i73ilc8azst0.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    long getAverageMillisPerYearDividedByTwo() {try{__CLR4_4_173i73ilc8azst0.R.inc(9252);
        __CLR4_4_173i73ilc8azst0.R.inc(9253);return MILLIS_PER_YEAR / 2;
    }finally{__CLR4_4_173i73ilc8azst0.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    long getAverageMillisPerMonth() {try{__CLR4_4_173i73ilc8azst0.R.inc(9254);
        __CLR4_4_173i73ilc8azst0.R.inc(9255);return MILLIS_PER_MONTH;
    }finally{__CLR4_4_173i73ilc8azst0.R.flushNeeded();}}

}
