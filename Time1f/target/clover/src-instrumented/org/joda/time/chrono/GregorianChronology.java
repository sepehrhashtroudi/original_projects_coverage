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
package org.joda.time.chrono;

import java.util.HashMap;
import java.util.Map;

import org.joda.time.Chronology;
import org.joda.time.DateTimeConstants;
import org.joda.time.DateTimeZone;

/**
 * Implements a pure proleptic Gregorian calendar system, which defines every
 * fourth year as leap, unless the year is divisible by 100 and not by 400.
 * This improves upon the Julian calendar leap year rule.
 * <p>
 * Although the Gregorian calendar did not exist before 1582 CE, this
 * chronology assumes it did, thus it is proleptic. This implementation also
 * fixes the start of the year at January 1, and defines the year zero.
 * <p>
 * GregorianChronology is thread-safe and immutable.
 *
 * @see <a href="http://en.wikipedia.org/wiki/Gregorian_calendar">Wikipedia</a>
 * @see JulianChronology
 * @see GJChronology
 * 
 * @author Guy Allard
 * @author Stephen Colebourne
 * @author Brian S O'Neill
 * @since 1.0
 */
public final class GregorianChronology extends BasicGJChronology {public static class __CLR4_4_18fp8fplc8azsyo{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672271027956L,8589935092L,11022,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** Serialization lock */
    private static final long serialVersionUID = -861407383323710522L;

    private static final long MILLIS_PER_YEAR =
        (long) (365.2425 * DateTimeConstants.MILLIS_PER_DAY);

    private static final long MILLIS_PER_MONTH =
        (long) (365.2425 * DateTimeConstants.MILLIS_PER_DAY / 12);

    private static final int DAYS_0000_TO_1970 = 719527;

    /** The lowest year that can be fully supported. */
    private static final int MIN_YEAR = -292275054;

    /** The highest year that can be fully supported. */
    private static final int MAX_YEAR = 292278993;

    /** Singleton instance of a UTC GregorianChronology */
    private static final GregorianChronology INSTANCE_UTC;

    /** Cache of zone to chronology arrays */
    private static final Map<DateTimeZone, GregorianChronology[]> cCache = new HashMap<DateTimeZone, GregorianChronology[]>();

    static {try{__CLR4_4_18fp8fplc8azsyo.R.inc(10933);
        __CLR4_4_18fp8fplc8azsyo.R.inc(10934);INSTANCE_UTC = getInstance(DateTimeZone.UTC);
    }finally{__CLR4_4_18fp8fplc8azsyo.R.flushNeeded();}}

    /**
     * Gets an instance of the GregorianChronology.
     * The time zone of the returned instance is UTC.
     * 
     * @return a singleton UTC instance of the chronology
     */
    public static GregorianChronology getInstanceUTC() {try{__CLR4_4_18fp8fplc8azsyo.R.inc(10935);
        __CLR4_4_18fp8fplc8azsyo.R.inc(10936);return INSTANCE_UTC;
    }finally{__CLR4_4_18fp8fplc8azsyo.R.flushNeeded();}}

    /**
     * Gets an instance of the GregorianChronology in the default time zone.
     * 
     * @return a chronology in the default time zone
     */
    public static GregorianChronology getInstance() {try{__CLR4_4_18fp8fplc8azsyo.R.inc(10937);
        __CLR4_4_18fp8fplc8azsyo.R.inc(10938);return getInstance(DateTimeZone.getDefault(), 4);
    }finally{__CLR4_4_18fp8fplc8azsyo.R.flushNeeded();}}

    /**
     * Gets an instance of the GregorianChronology in the given time zone.
     * 
     * @param zone  the time zone to get the chronology in, null is default
     * @return a chronology in the specified time zone
     */
    public static GregorianChronology getInstance(DateTimeZone zone) {try{__CLR4_4_18fp8fplc8azsyo.R.inc(10939);
        __CLR4_4_18fp8fplc8azsyo.R.inc(10940);return getInstance(zone, 4);
    }finally{__CLR4_4_18fp8fplc8azsyo.R.flushNeeded();}}

    /**
     * Gets an instance of the GregorianChronology in the given time zone.
     * 
     * @param zone  the time zone to get the chronology in, null is default
     * @param minDaysInFirstWeek  minimum number of days in first week of the year; default is 4
     * @return a chronology in the specified time zone
     */
    public static GregorianChronology getInstance(DateTimeZone zone, int minDaysInFirstWeek) {try{__CLR4_4_18fp8fplc8azsyo.R.inc(10941);
        __CLR4_4_18fp8fplc8azsyo.R.inc(10942);if ((((zone == null)&&(__CLR4_4_18fp8fplc8azsyo.R.iget(10943)!=0|true))||(__CLR4_4_18fp8fplc8azsyo.R.iget(10944)==0&false))) {{
            __CLR4_4_18fp8fplc8azsyo.R.inc(10945);zone = DateTimeZone.getDefault();
        }
        }__CLR4_4_18fp8fplc8azsyo.R.inc(10946);GregorianChronology chrono;
        __CLR4_4_18fp8fplc8azsyo.R.inc(10947);synchronized (cCache) {
            __CLR4_4_18fp8fplc8azsyo.R.inc(10948);GregorianChronology[] chronos = cCache.get(zone);
            __CLR4_4_18fp8fplc8azsyo.R.inc(10949);if ((((chronos == null)&&(__CLR4_4_18fp8fplc8azsyo.R.iget(10950)!=0|true))||(__CLR4_4_18fp8fplc8azsyo.R.iget(10951)==0&false))) {{
                __CLR4_4_18fp8fplc8azsyo.R.inc(10952);chronos = new GregorianChronology[7];
                __CLR4_4_18fp8fplc8azsyo.R.inc(10953);cCache.put(zone, chronos);
            }
            }__CLR4_4_18fp8fplc8azsyo.R.inc(10954);try {
                __CLR4_4_18fp8fplc8azsyo.R.inc(10955);chrono = chronos[minDaysInFirstWeek - 1];
            } catch (ArrayIndexOutOfBoundsException e) {
                __CLR4_4_18fp8fplc8azsyo.R.inc(10956);throw new IllegalArgumentException
                    ("Invalid min days in first week: " + minDaysInFirstWeek);
            }
            __CLR4_4_18fp8fplc8azsyo.R.inc(10957);if ((((chrono == null)&&(__CLR4_4_18fp8fplc8azsyo.R.iget(10958)!=0|true))||(__CLR4_4_18fp8fplc8azsyo.R.iget(10959)==0&false))) {{
                __CLR4_4_18fp8fplc8azsyo.R.inc(10960);if ((((zone == DateTimeZone.UTC)&&(__CLR4_4_18fp8fplc8azsyo.R.iget(10961)!=0|true))||(__CLR4_4_18fp8fplc8azsyo.R.iget(10962)==0&false))) {{
                    __CLR4_4_18fp8fplc8azsyo.R.inc(10963);chrono = new GregorianChronology(null, null, minDaysInFirstWeek);
                } }else {{
                    __CLR4_4_18fp8fplc8azsyo.R.inc(10964);chrono = getInstance(DateTimeZone.UTC, minDaysInFirstWeek);
                    __CLR4_4_18fp8fplc8azsyo.R.inc(10965);chrono = new GregorianChronology
                        (ZonedChronology.getInstance(chrono, zone), null, minDaysInFirstWeek);
                }
                }__CLR4_4_18fp8fplc8azsyo.R.inc(10966);chronos[minDaysInFirstWeek - 1] = chrono;
            }
        }}
        __CLR4_4_18fp8fplc8azsyo.R.inc(10967);return chrono;
    }finally{__CLR4_4_18fp8fplc8azsyo.R.flushNeeded();}}

    // Constructors and instance variables
    //-----------------------------------------------------------------------

    /**
     * Restricted constructor
     */
    private GregorianChronology(Chronology base, Object param, int minDaysInFirstWeek) {
        super(base, param, minDaysInFirstWeek);__CLR4_4_18fp8fplc8azsyo.R.inc(10969);try{__CLR4_4_18fp8fplc8azsyo.R.inc(10968);
    }finally{__CLR4_4_18fp8fplc8azsyo.R.flushNeeded();}}

    /**
     * Serialization singleton
     */
    private Object readResolve() {try{__CLR4_4_18fp8fplc8azsyo.R.inc(10970);
        __CLR4_4_18fp8fplc8azsyo.R.inc(10971);Chronology base = getBase();
        __CLR4_4_18fp8fplc8azsyo.R.inc(10972);int minDays = getMinimumDaysInFirstWeek();
        __CLR4_4_18fp8fplc8azsyo.R.inc(10973);minDays = ((((minDays == 0 )&&(__CLR4_4_18fp8fplc8azsyo.R.iget(10974)!=0|true))||(__CLR4_4_18fp8fplc8azsyo.R.iget(10975)==0&false))? 4 : minDays);  // handle rename of BaseGJChronology
        __CLR4_4_18fp8fplc8azsyo.R.inc(10976);return (((base == null )&&(__CLR4_4_18fp8fplc8azsyo.R.iget(10977)!=0|true))||(__CLR4_4_18fp8fplc8azsyo.R.iget(10978)==0&false))?
                getInstance(DateTimeZone.UTC, minDays) :
                    getInstance(base.getZone(), minDays);
    }finally{__CLR4_4_18fp8fplc8azsyo.R.flushNeeded();}}

    // Conversion
    //-----------------------------------------------------------------------
    /**
     * Gets the Chronology in the UTC time zone.
     * 
     * @return the chronology in UTC
     */
    public Chronology withUTC() {try{__CLR4_4_18fp8fplc8azsyo.R.inc(10979);
        __CLR4_4_18fp8fplc8azsyo.R.inc(10980);return INSTANCE_UTC;
    }finally{__CLR4_4_18fp8fplc8azsyo.R.flushNeeded();}}

    /**
     * Gets the Chronology in a specific time zone.
     * 
     * @param zone  the zone to get the chronology in, null is default
     * @return the chronology
     */
    public Chronology withZone(DateTimeZone zone) {try{__CLR4_4_18fp8fplc8azsyo.R.inc(10981);
        __CLR4_4_18fp8fplc8azsyo.R.inc(10982);if ((((zone == null)&&(__CLR4_4_18fp8fplc8azsyo.R.iget(10983)!=0|true))||(__CLR4_4_18fp8fplc8azsyo.R.iget(10984)==0&false))) {{
            __CLR4_4_18fp8fplc8azsyo.R.inc(10985);zone = DateTimeZone.getDefault();
        }
        }__CLR4_4_18fp8fplc8azsyo.R.inc(10986);if ((((zone == getZone())&&(__CLR4_4_18fp8fplc8azsyo.R.iget(10987)!=0|true))||(__CLR4_4_18fp8fplc8azsyo.R.iget(10988)==0&false))) {{
            __CLR4_4_18fp8fplc8azsyo.R.inc(10989);return this;
        }
        }__CLR4_4_18fp8fplc8azsyo.R.inc(10990);return getInstance(zone);
    }finally{__CLR4_4_18fp8fplc8azsyo.R.flushNeeded();}}

    protected void assemble(Fields fields) {try{__CLR4_4_18fp8fplc8azsyo.R.inc(10991);
        __CLR4_4_18fp8fplc8azsyo.R.inc(10992);if ((((getBase() == null)&&(__CLR4_4_18fp8fplc8azsyo.R.iget(10993)!=0|true))||(__CLR4_4_18fp8fplc8azsyo.R.iget(10994)==0&false))) {{
            __CLR4_4_18fp8fplc8azsyo.R.inc(10995);super.assemble(fields);
        }
    }}finally{__CLR4_4_18fp8fplc8azsyo.R.flushNeeded();}}

    boolean isLeapYear(int year) {try{__CLR4_4_18fp8fplc8azsyo.R.inc(10996);
        __CLR4_4_18fp8fplc8azsyo.R.inc(10997);return ((year & 3) == 0) && ((year % 100) != 0 || (year % 400) == 0);
    }finally{__CLR4_4_18fp8fplc8azsyo.R.flushNeeded();}}

    long calculateFirstDayOfYearMillis(int year) {try{__CLR4_4_18fp8fplc8azsyo.R.inc(10998);
        // Initial value is just temporary.
        __CLR4_4_18fp8fplc8azsyo.R.inc(10999);int leapYears = year / 100;
        __CLR4_4_18fp8fplc8azsyo.R.inc(11000);if ((((year < 0)&&(__CLR4_4_18fp8fplc8azsyo.R.iget(11001)!=0|true))||(__CLR4_4_18fp8fplc8azsyo.R.iget(11002)==0&false))) {{
            // Add 3 before shifting right since /4 and >>2 behave differently
            // on negative numbers. When the expression is written as
            // (year / 4) - (year / 100) + (year / 400),
            // it works for both positive and negative values, except this optimization
            // eliminates two divisions.
            __CLR4_4_18fp8fplc8azsyo.R.inc(11003);leapYears = ((year + 3) >> 2) - leapYears + ((leapYears + 3) >> 2) - 1;
        } }else {{
            __CLR4_4_18fp8fplc8azsyo.R.inc(11004);leapYears = (year >> 2) - leapYears + (leapYears >> 2);
            __CLR4_4_18fp8fplc8azsyo.R.inc(11005);if ((((isLeapYear(year))&&(__CLR4_4_18fp8fplc8azsyo.R.iget(11006)!=0|true))||(__CLR4_4_18fp8fplc8azsyo.R.iget(11007)==0&false))) {{
                __CLR4_4_18fp8fplc8azsyo.R.inc(11008);leapYears--;
            }
        }}

        }__CLR4_4_18fp8fplc8azsyo.R.inc(11009);return (year * 365L + (leapYears - DAYS_0000_TO_1970)) * DateTimeConstants.MILLIS_PER_DAY;
    }finally{__CLR4_4_18fp8fplc8azsyo.R.flushNeeded();}}

    int getMinYear() {try{__CLR4_4_18fp8fplc8azsyo.R.inc(11010);
        __CLR4_4_18fp8fplc8azsyo.R.inc(11011);return MIN_YEAR;
    }finally{__CLR4_4_18fp8fplc8azsyo.R.flushNeeded();}}

    int getMaxYear() {try{__CLR4_4_18fp8fplc8azsyo.R.inc(11012);
        __CLR4_4_18fp8fplc8azsyo.R.inc(11013);return MAX_YEAR;
    }finally{__CLR4_4_18fp8fplc8azsyo.R.flushNeeded();}}

    long getAverageMillisPerYear() {try{__CLR4_4_18fp8fplc8azsyo.R.inc(11014);
        __CLR4_4_18fp8fplc8azsyo.R.inc(11015);return MILLIS_PER_YEAR;
    }finally{__CLR4_4_18fp8fplc8azsyo.R.flushNeeded();}}

    long getAverageMillisPerYearDividedByTwo() {try{__CLR4_4_18fp8fplc8azsyo.R.inc(11016);
        __CLR4_4_18fp8fplc8azsyo.R.inc(11017);return MILLIS_PER_YEAR / 2;
    }finally{__CLR4_4_18fp8fplc8azsyo.R.flushNeeded();}}

    long getAverageMillisPerMonth() {try{__CLR4_4_18fp8fplc8azsyo.R.inc(11018);
        __CLR4_4_18fp8fplc8azsyo.R.inc(11019);return MILLIS_PER_MONTH;
    }finally{__CLR4_4_18fp8fplc8azsyo.R.flushNeeded();}}

    long getApproxMillisAtEpochDividedByTwo() {try{__CLR4_4_18fp8fplc8azsyo.R.inc(11020);
        __CLR4_4_18fp8fplc8azsyo.R.inc(11021);return (1970L * MILLIS_PER_YEAR) / 2;
    }finally{__CLR4_4_18fp8fplc8azsyo.R.flushNeeded();}}

}
