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
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.IllegalFieldValueException;
import org.joda.time.field.SkipDateTimeField;

/**
 * Implements a pure proleptic Julian calendar system, which defines every
 * fourth year as leap. This implementation follows the leap year rule
 * strictly, even for dates before 8 CE, where leap years were actually
 * irregular. In the Julian calendar, year zero does not exist: 1 BCE is
 * followed by 1 CE.
 * <p>
 * Although the Julian calendar did not exist before 45 BCE, this chronology
 * assumes it did, thus it is proleptic. This implementation also fixes the
 * start of the year at January 1.
 * <p>
 * JulianChronology is thread-safe and immutable.
 *
 * @see <a href="http://en.wikipedia.org/wiki/Julian_calendar">Wikipedia</a>
 * @see GregorianChronology
 * @see GJChronology
 *
 * @author Guy Allard
 * @author Brian S O'Neill
 * @author Stephen Colebourne
 * @since 1.0
 */
public final class JulianChronology extends BasicGJChronology {public static class __CLR4_4_18rt8rtlc8azt02{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672271027956L,8589935092L,11474,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** Serialization lock */
    private static final long serialVersionUID = -8731039522547897247L;

    private static final long MILLIS_PER_YEAR =
        (long) (365.25 * DateTimeConstants.MILLIS_PER_DAY);

    private static final long MILLIS_PER_MONTH =
        (long) (365.25 * DateTimeConstants.MILLIS_PER_DAY / 12);

    /** The lowest year that can be fully supported. */
    private static final int MIN_YEAR = -292269054;

    /** The highest year that can be fully supported. */
    private static final int MAX_YEAR = 292272992;

    /** Singleton instance of a UTC JulianChronology */
    private static final JulianChronology INSTANCE_UTC;

    /** Cache of zone to chronology arrays */
    private static final Map<DateTimeZone, JulianChronology[]> cCache = new HashMap<DateTimeZone, JulianChronology[]>();

    static {try{__CLR4_4_18rt8rtlc8azt02.R.inc(11369);
        __CLR4_4_18rt8rtlc8azt02.R.inc(11370);INSTANCE_UTC = getInstance(DateTimeZone.UTC);
    }finally{__CLR4_4_18rt8rtlc8azt02.R.flushNeeded();}}

    static int adjustYearForSet(int year) {try{__CLR4_4_18rt8rtlc8azt02.R.inc(11371);
        __CLR4_4_18rt8rtlc8azt02.R.inc(11372);if ((((year <= 0)&&(__CLR4_4_18rt8rtlc8azt02.R.iget(11373)!=0|true))||(__CLR4_4_18rt8rtlc8azt02.R.iget(11374)==0&false))) {{
            __CLR4_4_18rt8rtlc8azt02.R.inc(11375);if ((((year == 0)&&(__CLR4_4_18rt8rtlc8azt02.R.iget(11376)!=0|true))||(__CLR4_4_18rt8rtlc8azt02.R.iget(11377)==0&false))) {{
                __CLR4_4_18rt8rtlc8azt02.R.inc(11378);throw new IllegalFieldValueException
                    (DateTimeFieldType.year(), Integer.valueOf(year), null, null);
            }
            }__CLR4_4_18rt8rtlc8azt02.R.inc(11379);year++;
        }
        }__CLR4_4_18rt8rtlc8azt02.R.inc(11380);return year;
    }finally{__CLR4_4_18rt8rtlc8azt02.R.flushNeeded();}}

    /**
     * Gets an instance of the JulianChronology.
     * The time zone of the returned instance is UTC.
     * 
     * @return a singleton UTC instance of the chronology
     */
    public static JulianChronology getInstanceUTC() {try{__CLR4_4_18rt8rtlc8azt02.R.inc(11381);
        __CLR4_4_18rt8rtlc8azt02.R.inc(11382);return INSTANCE_UTC;
    }finally{__CLR4_4_18rt8rtlc8azt02.R.flushNeeded();}}

    /**
     * Gets an instance of the JulianChronology in the default time zone.
     * 
     * @return a chronology in the default time zone
     */
    public static JulianChronology getInstance() {try{__CLR4_4_18rt8rtlc8azt02.R.inc(11383);
        __CLR4_4_18rt8rtlc8azt02.R.inc(11384);return getInstance(DateTimeZone.getDefault(), 4);
    }finally{__CLR4_4_18rt8rtlc8azt02.R.flushNeeded();}}

    /**
     * Gets an instance of the JulianChronology in the given time zone.
     * 
     * @param zone  the time zone to get the chronology in, null is default
     * @return a chronology in the specified time zone
     */
    public static JulianChronology getInstance(DateTimeZone zone) {try{__CLR4_4_18rt8rtlc8azt02.R.inc(11385);
        __CLR4_4_18rt8rtlc8azt02.R.inc(11386);return getInstance(zone, 4);
    }finally{__CLR4_4_18rt8rtlc8azt02.R.flushNeeded();}}

    /**
     * Gets an instance of the JulianChronology in the given time zone.
     * 
     * @param zone  the time zone to get the chronology in, null is default
     * @param minDaysInFirstWeek  minimum number of days in first week of the year; default is 4
     * @return a chronology in the specified time zone
     */
    public static JulianChronology getInstance(DateTimeZone zone, int minDaysInFirstWeek) {try{__CLR4_4_18rt8rtlc8azt02.R.inc(11387);
        __CLR4_4_18rt8rtlc8azt02.R.inc(11388);if ((((zone == null)&&(__CLR4_4_18rt8rtlc8azt02.R.iget(11389)!=0|true))||(__CLR4_4_18rt8rtlc8azt02.R.iget(11390)==0&false))) {{
            __CLR4_4_18rt8rtlc8azt02.R.inc(11391);zone = DateTimeZone.getDefault();
        }
        }__CLR4_4_18rt8rtlc8azt02.R.inc(11392);JulianChronology chrono;
        __CLR4_4_18rt8rtlc8azt02.R.inc(11393);synchronized (cCache) {
            __CLR4_4_18rt8rtlc8azt02.R.inc(11394);JulianChronology[] chronos = cCache.get(zone);
            __CLR4_4_18rt8rtlc8azt02.R.inc(11395);if ((((chronos == null)&&(__CLR4_4_18rt8rtlc8azt02.R.iget(11396)!=0|true))||(__CLR4_4_18rt8rtlc8azt02.R.iget(11397)==0&false))) {{
                __CLR4_4_18rt8rtlc8azt02.R.inc(11398);chronos = new JulianChronology[7];
                __CLR4_4_18rt8rtlc8azt02.R.inc(11399);cCache.put(zone, chronos);
            }
            }__CLR4_4_18rt8rtlc8azt02.R.inc(11400);try {
                __CLR4_4_18rt8rtlc8azt02.R.inc(11401);chrono = chronos[minDaysInFirstWeek - 1];
            } catch (ArrayIndexOutOfBoundsException e) {
                __CLR4_4_18rt8rtlc8azt02.R.inc(11402);throw new IllegalArgumentException
                    ("Invalid min days in first week: " + minDaysInFirstWeek);
            }
            __CLR4_4_18rt8rtlc8azt02.R.inc(11403);if ((((chrono == null)&&(__CLR4_4_18rt8rtlc8azt02.R.iget(11404)!=0|true))||(__CLR4_4_18rt8rtlc8azt02.R.iget(11405)==0&false))) {{
                __CLR4_4_18rt8rtlc8azt02.R.inc(11406);if ((((zone == DateTimeZone.UTC)&&(__CLR4_4_18rt8rtlc8azt02.R.iget(11407)!=0|true))||(__CLR4_4_18rt8rtlc8azt02.R.iget(11408)==0&false))) {{
                    __CLR4_4_18rt8rtlc8azt02.R.inc(11409);chrono = new JulianChronology(null, null, minDaysInFirstWeek);
                } }else {{
                    __CLR4_4_18rt8rtlc8azt02.R.inc(11410);chrono = getInstance(DateTimeZone.UTC, minDaysInFirstWeek);
                    __CLR4_4_18rt8rtlc8azt02.R.inc(11411);chrono = new JulianChronology
                        (ZonedChronology.getInstance(chrono, zone), null, minDaysInFirstWeek);
                }
                }__CLR4_4_18rt8rtlc8azt02.R.inc(11412);chronos[minDaysInFirstWeek - 1] = chrono;
            }
        }}
        __CLR4_4_18rt8rtlc8azt02.R.inc(11413);return chrono;
    }finally{__CLR4_4_18rt8rtlc8azt02.R.flushNeeded();}}

    // Constructors and instance variables
    //-----------------------------------------------------------------------

    /**
     * Restricted constructor
     */
    JulianChronology(Chronology base, Object param, int minDaysInFirstWeek) {
        super(base, param, minDaysInFirstWeek);__CLR4_4_18rt8rtlc8azt02.R.inc(11415);try{__CLR4_4_18rt8rtlc8azt02.R.inc(11414);
    }finally{__CLR4_4_18rt8rtlc8azt02.R.flushNeeded();}}

    /**
     * Serialization singleton
     */
    private Object readResolve() {try{__CLR4_4_18rt8rtlc8azt02.R.inc(11416);
        __CLR4_4_18rt8rtlc8azt02.R.inc(11417);Chronology base = getBase();
        __CLR4_4_18rt8rtlc8azt02.R.inc(11418);int minDays = getMinimumDaysInFirstWeek();
        __CLR4_4_18rt8rtlc8azt02.R.inc(11419);minDays = ((((minDays == 0 )&&(__CLR4_4_18rt8rtlc8azt02.R.iget(11420)!=0|true))||(__CLR4_4_18rt8rtlc8azt02.R.iget(11421)==0&false))? 4 : minDays);  // handle rename of BaseGJChronology
        __CLR4_4_18rt8rtlc8azt02.R.inc(11422);return (((base == null )&&(__CLR4_4_18rt8rtlc8azt02.R.iget(11423)!=0|true))||(__CLR4_4_18rt8rtlc8azt02.R.iget(11424)==0&false))?
                getInstance(DateTimeZone.UTC, minDays) :
                    getInstance(base.getZone(), minDays);
    }finally{__CLR4_4_18rt8rtlc8azt02.R.flushNeeded();}}

    // Conversion
    //-----------------------------------------------------------------------
    /**
     * Gets the Chronology in the UTC time zone.
     * 
     * @return the chronology in UTC
     */
    public Chronology withUTC() {try{__CLR4_4_18rt8rtlc8azt02.R.inc(11425);
        __CLR4_4_18rt8rtlc8azt02.R.inc(11426);return INSTANCE_UTC;
    }finally{__CLR4_4_18rt8rtlc8azt02.R.flushNeeded();}}

    /**
     * Gets the Chronology in a specific time zone.
     * 
     * @param zone  the zone to get the chronology in, null is default
     * @return the chronology
     */
    public Chronology withZone(DateTimeZone zone) {try{__CLR4_4_18rt8rtlc8azt02.R.inc(11427);
        __CLR4_4_18rt8rtlc8azt02.R.inc(11428);if ((((zone == null)&&(__CLR4_4_18rt8rtlc8azt02.R.iget(11429)!=0|true))||(__CLR4_4_18rt8rtlc8azt02.R.iget(11430)==0&false))) {{
            __CLR4_4_18rt8rtlc8azt02.R.inc(11431);zone = DateTimeZone.getDefault();
        }
        }__CLR4_4_18rt8rtlc8azt02.R.inc(11432);if ((((zone == getZone())&&(__CLR4_4_18rt8rtlc8azt02.R.iget(11433)!=0|true))||(__CLR4_4_18rt8rtlc8azt02.R.iget(11434)==0&false))) {{
            __CLR4_4_18rt8rtlc8azt02.R.inc(11435);return this;
        }
        }__CLR4_4_18rt8rtlc8azt02.R.inc(11436);return getInstance(zone);
    }finally{__CLR4_4_18rt8rtlc8azt02.R.flushNeeded();}}

    long getDateMidnightMillis(int year, int monthOfYear, int dayOfMonth)
        throws IllegalArgumentException
    {try{__CLR4_4_18rt8rtlc8azt02.R.inc(11437);
        __CLR4_4_18rt8rtlc8azt02.R.inc(11438);return super.getDateMidnightMillis(adjustYearForSet(year), monthOfYear, dayOfMonth);
    }finally{__CLR4_4_18rt8rtlc8azt02.R.flushNeeded();}}

    boolean isLeapYear(int year) {try{__CLR4_4_18rt8rtlc8azt02.R.inc(11439);
        __CLR4_4_18rt8rtlc8azt02.R.inc(11440);return (year & 3) == 0;
    }finally{__CLR4_4_18rt8rtlc8azt02.R.flushNeeded();}}

    long calculateFirstDayOfYearMillis(int year) {try{__CLR4_4_18rt8rtlc8azt02.R.inc(11441);
        // Java epoch is 1970-01-01 Gregorian which is 1969-12-19 Julian.
        // Calculate relative to the nearest leap year and account for the
        // difference later.

        __CLR4_4_18rt8rtlc8azt02.R.inc(11442);int relativeYear = year - 1968;
        __CLR4_4_18rt8rtlc8azt02.R.inc(11443);int leapYears;
        __CLR4_4_18rt8rtlc8azt02.R.inc(11444);if ((((relativeYear <= 0)&&(__CLR4_4_18rt8rtlc8azt02.R.iget(11445)!=0|true))||(__CLR4_4_18rt8rtlc8azt02.R.iget(11446)==0&false))) {{
            // Add 3 before shifting right since /4 and >>2 behave differently
            // on negative numbers.
            __CLR4_4_18rt8rtlc8azt02.R.inc(11447);leapYears = (relativeYear + 3) >> 2;
        } }else {{
            __CLR4_4_18rt8rtlc8azt02.R.inc(11448);leapYears = relativeYear >> 2;
            // For post 1968 an adjustment is needed as jan1st is before leap day
            __CLR4_4_18rt8rtlc8azt02.R.inc(11449);if ((((!isLeapYear(year))&&(__CLR4_4_18rt8rtlc8azt02.R.iget(11450)!=0|true))||(__CLR4_4_18rt8rtlc8azt02.R.iget(11451)==0&false))) {{
                __CLR4_4_18rt8rtlc8azt02.R.inc(11452);leapYears++;
            }
        }}
        
        }__CLR4_4_18rt8rtlc8azt02.R.inc(11453);long millis = (relativeYear * 365L + leapYears) * (long)DateTimeConstants.MILLIS_PER_DAY;

        // Adjust to account for difference between 1968-01-01 and 1969-12-19.

        __CLR4_4_18rt8rtlc8azt02.R.inc(11454);return millis - (366L + 352) * DateTimeConstants.MILLIS_PER_DAY;
    }finally{__CLR4_4_18rt8rtlc8azt02.R.flushNeeded();}}

    int getMinYear() {try{__CLR4_4_18rt8rtlc8azt02.R.inc(11455);
        __CLR4_4_18rt8rtlc8azt02.R.inc(11456);return MIN_YEAR;
    }finally{__CLR4_4_18rt8rtlc8azt02.R.flushNeeded();}}

    int getMaxYear() {try{__CLR4_4_18rt8rtlc8azt02.R.inc(11457);
        __CLR4_4_18rt8rtlc8azt02.R.inc(11458);return MAX_YEAR;
    }finally{__CLR4_4_18rt8rtlc8azt02.R.flushNeeded();}}

    long getAverageMillisPerYear() {try{__CLR4_4_18rt8rtlc8azt02.R.inc(11459);
        __CLR4_4_18rt8rtlc8azt02.R.inc(11460);return MILLIS_PER_YEAR;
    }finally{__CLR4_4_18rt8rtlc8azt02.R.flushNeeded();}}

    long getAverageMillisPerYearDividedByTwo() {try{__CLR4_4_18rt8rtlc8azt02.R.inc(11461);
        __CLR4_4_18rt8rtlc8azt02.R.inc(11462);return MILLIS_PER_YEAR / 2;
    }finally{__CLR4_4_18rt8rtlc8azt02.R.flushNeeded();}}

    long getAverageMillisPerMonth() {try{__CLR4_4_18rt8rtlc8azt02.R.inc(11463);
        __CLR4_4_18rt8rtlc8azt02.R.inc(11464);return MILLIS_PER_MONTH;
    }finally{__CLR4_4_18rt8rtlc8azt02.R.flushNeeded();}}

    long getApproxMillisAtEpochDividedByTwo() {try{__CLR4_4_18rt8rtlc8azt02.R.inc(11465);
        __CLR4_4_18rt8rtlc8azt02.R.inc(11466);return (1969L * MILLIS_PER_YEAR + 352L * DateTimeConstants.MILLIS_PER_DAY) / 2;
    }finally{__CLR4_4_18rt8rtlc8azt02.R.flushNeeded();}}

    protected void assemble(Fields fields) {try{__CLR4_4_18rt8rtlc8azt02.R.inc(11467);
        __CLR4_4_18rt8rtlc8azt02.R.inc(11468);if ((((getBase() == null)&&(__CLR4_4_18rt8rtlc8azt02.R.iget(11469)!=0|true))||(__CLR4_4_18rt8rtlc8azt02.R.iget(11470)==0&false))) {{
            __CLR4_4_18rt8rtlc8azt02.R.inc(11471);super.assemble(fields);
            // Julian chronology has no year zero.
            __CLR4_4_18rt8rtlc8azt02.R.inc(11472);fields.year = new SkipDateTimeField(this, fields.year);
            __CLR4_4_18rt8rtlc8azt02.R.inc(11473);fields.weekyear = new SkipDateTimeField(this, fields.weekyear);
        }
    }}finally{__CLR4_4_18rt8rtlc8azt02.R.flushNeeded();}}

}
