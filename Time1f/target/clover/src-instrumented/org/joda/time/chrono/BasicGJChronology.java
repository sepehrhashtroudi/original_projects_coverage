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
 * Abstract Chronology for implementing chronologies based on Gregorian/Julian formulae.
 * Most of the utility methods required by subclasses are package-private,
 * reflecting the intention that they be defined in the same package.
 * <p>
 * BasicGJChronology is thread-safe and immutable, and all subclasses must
 * be as well.
 *
 * @author Stephen Colebourne
 * @author Brian S O'Neill
 * @author Guy Allard
 * @since 1.2, refactored from CommonGJChronology
 */
abstract class BasicGJChronology extends BasicChronology {public static class __CLR4_4_1754754lc8azstz{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672271027956L,8589935092L,9385,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** Serialization lock */
    private static final long serialVersionUID = 538276888268L;

    // These arrays are NOT public. We trust ourselves not to alter the array.
    // They use zero-based array indexes so the that valid range of months is
    // automatically checked.
    private static final int[] MIN_DAYS_PER_MONTH_ARRAY = {
        31,28,31,30,31,30,31,31,30,31,30,31
    };
    private static final int[] MAX_DAYS_PER_MONTH_ARRAY = {
        31,29,31,30,31,30,31,31,30,31,30,31
    };
    private static final long[] MIN_TOTAL_MILLIS_BY_MONTH_ARRAY;
    private static final long[] MAX_TOTAL_MILLIS_BY_MONTH_ARRAY;
    private static final long FEB_29 = (31L + 29 - 1) * DateTimeConstants.MILLIS_PER_DAY;

    static {try{__CLR4_4_1754754lc8azstz.R.inc(9256);
        __CLR4_4_1754754lc8azstz.R.inc(9257);MIN_TOTAL_MILLIS_BY_MONTH_ARRAY = new long[12];
        __CLR4_4_1754754lc8azstz.R.inc(9258);MAX_TOTAL_MILLIS_BY_MONTH_ARRAY = new long[12];

        __CLR4_4_1754754lc8azstz.R.inc(9259);long minSum = 0;
        __CLR4_4_1754754lc8azstz.R.inc(9260);long maxSum = 0;
        __CLR4_4_1754754lc8azstz.R.inc(9261);for (int i = 0; (((i < 11)&&(__CLR4_4_1754754lc8azstz.R.iget(9262)!=0|true))||(__CLR4_4_1754754lc8azstz.R.iget(9263)==0&false)); i++) {{
            __CLR4_4_1754754lc8azstz.R.inc(9264);long millis = MIN_DAYS_PER_MONTH_ARRAY[i]
                * (long)DateTimeConstants.MILLIS_PER_DAY;
            __CLR4_4_1754754lc8azstz.R.inc(9265);minSum += millis;
            __CLR4_4_1754754lc8azstz.R.inc(9266);MIN_TOTAL_MILLIS_BY_MONTH_ARRAY[i + 1] = minSum;

            __CLR4_4_1754754lc8azstz.R.inc(9267);millis = MAX_DAYS_PER_MONTH_ARRAY[i]
                * (long)DateTimeConstants.MILLIS_PER_DAY;
            __CLR4_4_1754754lc8azstz.R.inc(9268);maxSum += millis;
            __CLR4_4_1754754lc8azstz.R.inc(9269);MAX_TOTAL_MILLIS_BY_MONTH_ARRAY[i + 1] = maxSum;
        }
    }}finally{__CLR4_4_1754754lc8azstz.R.flushNeeded();}}

    /**
     * Constructor.
     */
    BasicGJChronology(Chronology base, Object param, int minDaysInFirstWeek) {
        super(base, param, minDaysInFirstWeek);__CLR4_4_1754754lc8azstz.R.inc(9271);try{__CLR4_4_1754754lc8azstz.R.inc(9270);
    }finally{__CLR4_4_1754754lc8azstz.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    int getMonthOfYear(long millis, int year) {try{__CLR4_4_1754754lc8azstz.R.inc(9272);
        // Perform a binary search to get the month. To make it go even faster,
        // compare using ints instead of longs. The number of milliseconds per
        // year exceeds the limit of a 32-bit int's capacity, so divide by
        // 1024. No precision is lost (except time of day) since the number of
        // milliseconds per day contains 1024 as a factor. After the division,
        // the instant isn't measured in milliseconds, but in units of
        // (128/125)seconds.

        __CLR4_4_1754754lc8azstz.R.inc(9273);int i = (int)((millis - getYearMillis(year)) >> 10);

        // There are 86400000 milliseconds per day, but divided by 1024 is
        // 84375. There are 84375 (128/125)seconds per day.

        __CLR4_4_1754754lc8azstz.R.inc(9274);return
            ((((isLeapYear(year))
            )&&(__CLR4_4_1754754lc8azstz.R.iget(9275)!=0|true))||(__CLR4_4_1754754lc8azstz.R.iget(9276)==0&false))? (((((i < 182 * 84375)
               )&&(__CLR4_4_1754754lc8azstz.R.iget(9277)!=0|true))||(__CLR4_4_1754754lc8azstz.R.iget(9278)==0&false))? (((((i < 91 * 84375)
                  )&&(__CLR4_4_1754754lc8azstz.R.iget(9279)!=0|true))||(__CLR4_4_1754754lc8azstz.R.iget(9280)==0&false))? (((((i < 31 * 84375) )&&(__CLR4_4_1754754lc8azstz.R.iget(9281)!=0|true))||(__CLR4_4_1754754lc8azstz.R.iget(9282)==0&false))? 1 : ((((i < 60 * 84375) )&&(__CLR4_4_1754754lc8azstz.R.iget(9283)!=0|true))||(__CLR4_4_1754754lc8azstz.R.iget(9284)==0&false))? 2 : 3)
                  : (((((i < 121 * 84375) )&&(__CLR4_4_1754754lc8azstz.R.iget(9285)!=0|true))||(__CLR4_4_1754754lc8azstz.R.iget(9286)==0&false))? 4 : ((((i < 152 * 84375) )&&(__CLR4_4_1754754lc8azstz.R.iget(9287)!=0|true))||(__CLR4_4_1754754lc8azstz.R.iget(9288)==0&false))? 5 : 6))
               : (((((i < 274 * 84375)
                  )&&(__CLR4_4_1754754lc8azstz.R.iget(9289)!=0|true))||(__CLR4_4_1754754lc8azstz.R.iget(9290)==0&false))? (((((i < 213 * 84375) )&&(__CLR4_4_1754754lc8azstz.R.iget(9291)!=0|true))||(__CLR4_4_1754754lc8azstz.R.iget(9292)==0&false))? 7 : ((((i < 244 * 84375) )&&(__CLR4_4_1754754lc8azstz.R.iget(9293)!=0|true))||(__CLR4_4_1754754lc8azstz.R.iget(9294)==0&false))? 8 : 9)
                  : (((((i < 305 * 84375) )&&(__CLR4_4_1754754lc8azstz.R.iget(9295)!=0|true))||(__CLR4_4_1754754lc8azstz.R.iget(9296)==0&false))? 10 : ((((i < 335 * 84375) )&&(__CLR4_4_1754754lc8azstz.R.iget(9297)!=0|true))||(__CLR4_4_1754754lc8azstz.R.iget(9298)==0&false))? 11 : 12)))
            : (((((i < 181 * 84375)
               )&&(__CLR4_4_1754754lc8azstz.R.iget(9299)!=0|true))||(__CLR4_4_1754754lc8azstz.R.iget(9300)==0&false))? (((((i < 90 * 84375)
                  )&&(__CLR4_4_1754754lc8azstz.R.iget(9301)!=0|true))||(__CLR4_4_1754754lc8azstz.R.iget(9302)==0&false))? (((((i < 31 * 84375) )&&(__CLR4_4_1754754lc8azstz.R.iget(9303)!=0|true))||(__CLR4_4_1754754lc8azstz.R.iget(9304)==0&false))? 1 : ((((i < 59 * 84375) )&&(__CLR4_4_1754754lc8azstz.R.iget(9305)!=0|true))||(__CLR4_4_1754754lc8azstz.R.iget(9306)==0&false))? 2 : 3)
                  : (((((i < 120 * 84375) )&&(__CLR4_4_1754754lc8azstz.R.iget(9307)!=0|true))||(__CLR4_4_1754754lc8azstz.R.iget(9308)==0&false))? 4 : ((((i < 151 * 84375) )&&(__CLR4_4_1754754lc8azstz.R.iget(9309)!=0|true))||(__CLR4_4_1754754lc8azstz.R.iget(9310)==0&false))? 5 : 6))
               : (((((i < 273 * 84375)
                  )&&(__CLR4_4_1754754lc8azstz.R.iget(9311)!=0|true))||(__CLR4_4_1754754lc8azstz.R.iget(9312)==0&false))? (((((i < 212 * 84375) )&&(__CLR4_4_1754754lc8azstz.R.iget(9313)!=0|true))||(__CLR4_4_1754754lc8azstz.R.iget(9314)==0&false))? 7 : ((((i < 243 * 84375) )&&(__CLR4_4_1754754lc8azstz.R.iget(9315)!=0|true))||(__CLR4_4_1754754lc8azstz.R.iget(9316)==0&false))? 8 : 9)
                  : (((((i < 304 * 84375) )&&(__CLR4_4_1754754lc8azstz.R.iget(9317)!=0|true))||(__CLR4_4_1754754lc8azstz.R.iget(9318)==0&false))? 10 : ((((i < 334 * 84375) )&&(__CLR4_4_1754754lc8azstz.R.iget(9319)!=0|true))||(__CLR4_4_1754754lc8azstz.R.iget(9320)==0&false))? 11 : 12)));
    }finally{__CLR4_4_1754754lc8azstz.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Gets the number of days in the specified month and year.
     * 
     * @param year  the year
     * @param month  the month
     * @return the number of days
     */
    int getDaysInYearMonth(int year, int month) {try{__CLR4_4_1754754lc8azstz.R.inc(9321);
        __CLR4_4_1754754lc8azstz.R.inc(9322);if ((((isLeapYear(year))&&(__CLR4_4_1754754lc8azstz.R.iget(9323)!=0|true))||(__CLR4_4_1754754lc8azstz.R.iget(9324)==0&false))) {{
            __CLR4_4_1754754lc8azstz.R.inc(9325);return MAX_DAYS_PER_MONTH_ARRAY[month - 1];
        } }else {{
            __CLR4_4_1754754lc8azstz.R.inc(9326);return MIN_DAYS_PER_MONTH_ARRAY[month - 1];
        }
    }}finally{__CLR4_4_1754754lc8azstz.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    int getDaysInMonthMax(int month) {try{__CLR4_4_1754754lc8azstz.R.inc(9327);
        __CLR4_4_1754754lc8azstz.R.inc(9328);return MAX_DAYS_PER_MONTH_ARRAY[month - 1];
    }finally{__CLR4_4_1754754lc8azstz.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    int getDaysInMonthMaxForSet(long instant, int value) {try{__CLR4_4_1754754lc8azstz.R.inc(9329);
        __CLR4_4_1754754lc8azstz.R.inc(9330);return (((((value > 28 || value < 1) )&&(__CLR4_4_1754754lc8azstz.R.iget(9331)!=0|true))||(__CLR4_4_1754754lc8azstz.R.iget(9332)==0&false))? getDaysInMonthMax(instant) : 28);
    }finally{__CLR4_4_1754754lc8azstz.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    long getTotalMillisByYearMonth(int year, int month) {try{__CLR4_4_1754754lc8azstz.R.inc(9333);
        __CLR4_4_1754754lc8azstz.R.inc(9334);if ((((isLeapYear(year))&&(__CLR4_4_1754754lc8azstz.R.iget(9335)!=0|true))||(__CLR4_4_1754754lc8azstz.R.iget(9336)==0&false))) {{
            __CLR4_4_1754754lc8azstz.R.inc(9337);return MAX_TOTAL_MILLIS_BY_MONTH_ARRAY[month - 1];
        } }else {{
            __CLR4_4_1754754lc8azstz.R.inc(9338);return MIN_TOTAL_MILLIS_BY_MONTH_ARRAY[month - 1];
        }
    }}finally{__CLR4_4_1754754lc8azstz.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    long getYearDifference(long minuendInstant, long subtrahendInstant) {try{__CLR4_4_1754754lc8azstz.R.inc(9339);
        __CLR4_4_1754754lc8azstz.R.inc(9340);int minuendYear = getYear(minuendInstant);
        __CLR4_4_1754754lc8azstz.R.inc(9341);int subtrahendYear = getYear(subtrahendInstant);
    
        // Inlined remainder method to avoid duplicate calls to get.
        __CLR4_4_1754754lc8azstz.R.inc(9342);long minuendRem = minuendInstant - getYearMillis(minuendYear);
        __CLR4_4_1754754lc8azstz.R.inc(9343);long subtrahendRem = subtrahendInstant - getYearMillis(subtrahendYear);
    
        // Balance leap year differences on remainders.
        __CLR4_4_1754754lc8azstz.R.inc(9344);if ((((subtrahendRem >= FEB_29)&&(__CLR4_4_1754754lc8azstz.R.iget(9345)!=0|true))||(__CLR4_4_1754754lc8azstz.R.iget(9346)==0&false))) {{
            __CLR4_4_1754754lc8azstz.R.inc(9347);if ((((isLeapYear(subtrahendYear))&&(__CLR4_4_1754754lc8azstz.R.iget(9348)!=0|true))||(__CLR4_4_1754754lc8azstz.R.iget(9349)==0&false))) {{
                __CLR4_4_1754754lc8azstz.R.inc(9350);if ((((!isLeapYear(minuendYear))&&(__CLR4_4_1754754lc8azstz.R.iget(9351)!=0|true))||(__CLR4_4_1754754lc8azstz.R.iget(9352)==0&false))) {{
                    __CLR4_4_1754754lc8azstz.R.inc(9353);subtrahendRem -= DateTimeConstants.MILLIS_PER_DAY;
                }
            }} }else {__CLR4_4_1754754lc8azstz.R.inc(9354);if ((((minuendRem >= FEB_29 && isLeapYear(minuendYear))&&(__CLR4_4_1754754lc8azstz.R.iget(9355)!=0|true))||(__CLR4_4_1754754lc8azstz.R.iget(9356)==0&false))) {{
                __CLR4_4_1754754lc8azstz.R.inc(9357);minuendRem -= DateTimeConstants.MILLIS_PER_DAY;
            }
        }}}
    
        }__CLR4_4_1754754lc8azstz.R.inc(9358);int difference = minuendYear - subtrahendYear;
        __CLR4_4_1754754lc8azstz.R.inc(9359);if ((((minuendRem < subtrahendRem)&&(__CLR4_4_1754754lc8azstz.R.iget(9360)!=0|true))||(__CLR4_4_1754754lc8azstz.R.iget(9361)==0&false))) {{
            __CLR4_4_1754754lc8azstz.R.inc(9362);difference--;
        }
        }__CLR4_4_1754754lc8azstz.R.inc(9363);return difference;
    }finally{__CLR4_4_1754754lc8azstz.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    long setYear(long instant, int year) {try{__CLR4_4_1754754lc8azstz.R.inc(9364);
        __CLR4_4_1754754lc8azstz.R.inc(9365);int thisYear = getYear(instant);
        __CLR4_4_1754754lc8azstz.R.inc(9366);int dayOfYear = getDayOfYear(instant, thisYear);
        __CLR4_4_1754754lc8azstz.R.inc(9367);int millisOfDay = getMillisOfDay(instant);

        __CLR4_4_1754754lc8azstz.R.inc(9368);if ((((dayOfYear > (31 + 28))&&(__CLR4_4_1754754lc8azstz.R.iget(9369)!=0|true))||(__CLR4_4_1754754lc8azstz.R.iget(9370)==0&false))) {{ // after Feb 28
            __CLR4_4_1754754lc8azstz.R.inc(9371);if ((((isLeapYear(thisYear))&&(__CLR4_4_1754754lc8azstz.R.iget(9372)!=0|true))||(__CLR4_4_1754754lc8azstz.R.iget(9373)==0&false))) {{
                // Current date is Feb 29 or later.
                __CLR4_4_1754754lc8azstz.R.inc(9374);if ((((!isLeapYear(year))&&(__CLR4_4_1754754lc8azstz.R.iget(9375)!=0|true))||(__CLR4_4_1754754lc8azstz.R.iget(9376)==0&false))) {{
                    // Moving to a non-leap year, Feb 29 does not exist.
                    __CLR4_4_1754754lc8azstz.R.inc(9377);dayOfYear--;
                }
            }} }else {{
                // Current date is Mar 01 or later.
                __CLR4_4_1754754lc8azstz.R.inc(9378);if ((((isLeapYear(year))&&(__CLR4_4_1754754lc8azstz.R.iget(9379)!=0|true))||(__CLR4_4_1754754lc8azstz.R.iget(9380)==0&false))) {{
                    // Moving to a leap year, account for Feb 29.
                    __CLR4_4_1754754lc8azstz.R.inc(9381);dayOfYear++;
                }
            }}
        }}

        }__CLR4_4_1754754lc8azstz.R.inc(9382);instant = getYearMonthDayMillis(year, 1, dayOfYear);
        __CLR4_4_1754754lc8azstz.R.inc(9383);instant += millisOfDay;

        __CLR4_4_1754754lc8azstz.R.inc(9384);return instant;
    }finally{__CLR4_4_1754754lc8azstz.R.flushNeeded();}}

}
