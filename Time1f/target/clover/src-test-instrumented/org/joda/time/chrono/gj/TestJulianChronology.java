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
package org.joda.time.chrono.gj;

import org.joda.time.DateTimeField;

/**
 * A reference Julian chronology implementation, intended for testing purposes
 * only. Correctness is favored over performance. The key functions for date
 * calculations are based on ones provided in "Calendrical Calculations", ISBN
 * 0-521-77752-6.
 *
 * @author Brian S O'Neill
 */
public final class TestJulianChronology extends TestGJChronology {static class __CLR4_4_115dj15djlc8azwuy{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672271031490L,8589935092L,53720,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final long JULIAN_EPOCH;

    static {try{__CLR4_4_115dj15djlc8azwuy.R.inc(53623);
        // Constant as defined in book.
        __CLR4_4_115dj15djlc8azwuy.R.inc(53624);JULIAN_EPOCH = new TestGregorianChronology().fixedFromGJ(0, 12, 30);
    }finally{__CLR4_4_115dj15djlc8azwuy.R.flushNeeded();}}

    /**
     * Constructs with an epoch of 1969-12-19.
     */
    public TestJulianChronology() {
        super(1969, 12, 19);__CLR4_4_115dj15djlc8azwuy.R.inc(53626);try{__CLR4_4_115dj15djlc8azwuy.R.inc(53625);
    }finally{__CLR4_4_115dj15djlc8azwuy.R.flushNeeded();}}

    public TestJulianChronology(int epochYear, int epochMonth, int epochDay) {
        super(epochYear, epochMonth, epochDay);__CLR4_4_115dj15djlc8azwuy.R.inc(53628);try{__CLR4_4_115dj15djlc8azwuy.R.inc(53627);
    }finally{__CLR4_4_115dj15djlc8azwuy.R.flushNeeded();}}

    public DateTimeField dayOfMonth() {try{__CLR4_4_115dj15djlc8azwuy.R.inc(53629);
        __CLR4_4_115dj15djlc8azwuy.R.inc(53630);return new TestJulianDayOfMonthField(this); 
    }finally{__CLR4_4_115dj15djlc8azwuy.R.flushNeeded();}}

    public DateTimeField weekyear() {try{__CLR4_4_115dj15djlc8azwuy.R.inc(53631);
        __CLR4_4_115dj15djlc8azwuy.R.inc(53632);return new TestJulianWeekyearField(this);
    }finally{__CLR4_4_115dj15djlc8azwuy.R.flushNeeded();}}

    public DateTimeField monthOfYear() {try{__CLR4_4_115dj15djlc8azwuy.R.inc(53633);
        __CLR4_4_115dj15djlc8azwuy.R.inc(53634);return new TestJulianMonthOfYearField(this);
    }finally{__CLR4_4_115dj15djlc8azwuy.R.flushNeeded();}}

    public DateTimeField year() {try{__CLR4_4_115dj15djlc8azwuy.R.inc(53635);
        __CLR4_4_115dj15djlc8azwuy.R.inc(53636);return new TestJulianYearField(this);
    }finally{__CLR4_4_115dj15djlc8azwuy.R.flushNeeded();}}

    public String toString() {try{__CLR4_4_115dj15djlc8azwuy.R.inc(53637);
        __CLR4_4_115dj15djlc8azwuy.R.inc(53638);return "TestJulianChronology";
    }finally{__CLR4_4_115dj15djlc8azwuy.R.flushNeeded();}}

    long millisPerYear() {try{__CLR4_4_115dj15djlc8azwuy.R.inc(53639);
        __CLR4_4_115dj15djlc8azwuy.R.inc(53640);return (long)(365.25 * MILLIS_PER_DAY);
    }finally{__CLR4_4_115dj15djlc8azwuy.R.flushNeeded();}}

    long millisPerMonth() {try{__CLR4_4_115dj15djlc8azwuy.R.inc(53641);
        __CLR4_4_115dj15djlc8azwuy.R.inc(53642);return (long)(365.25 * MILLIS_PER_DAY / 12);
    }finally{__CLR4_4_115dj15djlc8azwuy.R.flushNeeded();}}

    boolean isLeapYear(int year) {try{__CLR4_4_115dj15djlc8azwuy.R.inc(53643);
        __CLR4_4_115dj15djlc8azwuy.R.inc(53644);if ((((year == 0)&&(__CLR4_4_115dj15djlc8azwuy.R.iget(53645)!=0|true))||(__CLR4_4_115dj15djlc8azwuy.R.iget(53646)==0&false))) {{
            __CLR4_4_115dj15djlc8azwuy.R.inc(53647);throw new IllegalArgumentException("Illegal year: " + year);
        }
        }__CLR4_4_115dj15djlc8azwuy.R.inc(53648);return mod(year, 4) == ((((year > 0 )&&(__CLR4_4_115dj15djlc8azwuy.R.iget(53649)!=0|true))||(__CLR4_4_115dj15djlc8azwuy.R.iget(53650)==0&false))? 0 : 3);
    }finally{__CLR4_4_115dj15djlc8azwuy.R.flushNeeded();}}

    /**
     * @return days from 0001-01-01
     */
    long fixedFromGJ(int year, int monthOfYear, int dayOfMonth) {try{__CLR4_4_115dj15djlc8azwuy.R.inc(53651);
        __CLR4_4_115dj15djlc8azwuy.R.inc(53652);if ((((year == 0)&&(__CLR4_4_115dj15djlc8azwuy.R.iget(53653)!=0|true))||(__CLR4_4_115dj15djlc8azwuy.R.iget(53654)==0&false))) {{
            __CLR4_4_115dj15djlc8azwuy.R.inc(53655);throw new IllegalArgumentException("Illegal year: " + year);
        }
        }__CLR4_4_115dj15djlc8azwuy.R.inc(53656);int y = ((((year < 0) )&&(__CLR4_4_115dj15djlc8azwuy.R.iget(53657)!=0|true))||(__CLR4_4_115dj15djlc8azwuy.R.iget(53658)==0&false))? year + 1 : year;
        __CLR4_4_115dj15djlc8azwuy.R.inc(53659);long y_m1 = y - 1;
        __CLR4_4_115dj15djlc8azwuy.R.inc(53660);long f = JULIAN_EPOCH - 1 + 365 * y_m1 + div(y_m1, 4)
            + div(367 * monthOfYear - 362, 12) + dayOfMonth;
        __CLR4_4_115dj15djlc8azwuy.R.inc(53661);if ((((monthOfYear > 2)&&(__CLR4_4_115dj15djlc8azwuy.R.iget(53662)!=0|true))||(__CLR4_4_115dj15djlc8azwuy.R.iget(53663)==0&false))) {{
            __CLR4_4_115dj15djlc8azwuy.R.inc(53664);f += (((isLeapYear(year) )&&(__CLR4_4_115dj15djlc8azwuy.R.iget(53665)!=0|true))||(__CLR4_4_115dj15djlc8azwuy.R.iget(53666)==0&false))? -1 : -2;
        }
        }__CLR4_4_115dj15djlc8azwuy.R.inc(53667);return f;
    }finally{__CLR4_4_115dj15djlc8azwuy.R.flushNeeded();}}

    /**
     * @param date days from 0001-01-01
     * @return gj year
     */
    int gjYearFromFixed(long date) {try{__CLR4_4_115dj15djlc8azwuy.R.inc(53668);
        __CLR4_4_115dj15djlc8azwuy.R.inc(53669);return gjFromFixed(date)[0];
    }finally{__CLR4_4_115dj15djlc8azwuy.R.flushNeeded();}}

    /**
     * @param date days from 0001-01-01
     * @return gj year, monthOfYear, dayOfMonth
     */
    int[] gjFromFixed(long date) {try{__CLR4_4_115dj15djlc8azwuy.R.inc(53670);
        __CLR4_4_115dj15djlc8azwuy.R.inc(53671);long approx = div(4 * (date - JULIAN_EPOCH) + 1464, 1461);
        __CLR4_4_115dj15djlc8azwuy.R.inc(53672);long year = ((((approx <= 0) )&&(__CLR4_4_115dj15djlc8azwuy.R.iget(53673)!=0|true))||(__CLR4_4_115dj15djlc8azwuy.R.iget(53674)==0&false))? approx - 1 : approx;
        __CLR4_4_115dj15djlc8azwuy.R.inc(53675);int year_i = (int)year;
        __CLR4_4_115dj15djlc8azwuy.R.inc(53676);if ((((year_i != year)&&(__CLR4_4_115dj15djlc8azwuy.R.iget(53677)!=0|true))||(__CLR4_4_115dj15djlc8azwuy.R.iget(53678)==0&false))) {{
            __CLR4_4_115dj15djlc8azwuy.R.inc(53679);throw new RuntimeException("year cannot be cast to an int: " + year);
        }
        }__CLR4_4_115dj15djlc8azwuy.R.inc(53680);long priorDays = date - fixedFromGJ(year_i, 1, 1);
        __CLR4_4_115dj15djlc8azwuy.R.inc(53681);long correction;
        __CLR4_4_115dj15djlc8azwuy.R.inc(53682);if ((((date < fixedFromGJ(year_i, 3, 1))&&(__CLR4_4_115dj15djlc8azwuy.R.iget(53683)!=0|true))||(__CLR4_4_115dj15djlc8azwuy.R.iget(53684)==0&false))) {{
            __CLR4_4_115dj15djlc8azwuy.R.inc(53685);correction = 0;
        } }else {__CLR4_4_115dj15djlc8azwuy.R.inc(53686);if ((((isLeapYear(year_i))&&(__CLR4_4_115dj15djlc8azwuy.R.iget(53687)!=0|true))||(__CLR4_4_115dj15djlc8azwuy.R.iget(53688)==0&false))) {{
            __CLR4_4_115dj15djlc8azwuy.R.inc(53689);correction = 1;
        } }else {{
            __CLR4_4_115dj15djlc8azwuy.R.inc(53690);correction = 2;
        }
        }}__CLR4_4_115dj15djlc8azwuy.R.inc(53691);int monthOfYear = (int)div(12 * (priorDays + correction) + 373, 367);
        __CLR4_4_115dj15djlc8azwuy.R.inc(53692);int day = (int)(date - fixedFromGJ(year_i, monthOfYear, 1) + 1);

        __CLR4_4_115dj15djlc8azwuy.R.inc(53693);return new int[]{year_i, monthOfYear, day};
    }finally{__CLR4_4_115dj15djlc8azwuy.R.flushNeeded();}}

    long fixedFromISO(int weekyear, int weekOfWeekyear, int dayOfWeek) {try{__CLR4_4_115dj15djlc8azwuy.R.inc(53694);
        __CLR4_4_115dj15djlc8azwuy.R.inc(53695);if ((((weekyear == 0)&&(__CLR4_4_115dj15djlc8azwuy.R.iget(53696)!=0|true))||(__CLR4_4_115dj15djlc8azwuy.R.iget(53697)==0&false))) {{
            __CLR4_4_115dj15djlc8azwuy.R.inc(53698);throw new IllegalArgumentException("Illegal weekyear: " + weekyear);
        }
        }__CLR4_4_115dj15djlc8azwuy.R.inc(53699);if ((((weekyear == 1)&&(__CLR4_4_115dj15djlc8azwuy.R.iget(53700)!=0|true))||(__CLR4_4_115dj15djlc8azwuy.R.iget(53701)==0&false))) {{
            __CLR4_4_115dj15djlc8azwuy.R.inc(53702);weekyear = -1;
        } }else {{
            __CLR4_4_115dj15djlc8azwuy.R.inc(53703);weekyear--;
        }
        }__CLR4_4_115dj15djlc8azwuy.R.inc(53704);return nthWeekday(weekOfWeekyear, 0, weekyear, 12, 28) + dayOfWeek;
    }finally{__CLR4_4_115dj15djlc8azwuy.R.flushNeeded();}}

    /**
     * @param date days from 0001-01-01
     * @return iso weekyear, weekOfWeekyear, dayOfWeek (1=Monday to 7)
     */
    int[] isoFromFixed(long date) {try{__CLR4_4_115dj15djlc8azwuy.R.inc(53705);
        __CLR4_4_115dj15djlc8azwuy.R.inc(53706);int weekyear = gjYearFromFixed(date - 3);
        __CLR4_4_115dj15djlc8azwuy.R.inc(53707);int nextWeekyear;
        __CLR4_4_115dj15djlc8azwuy.R.inc(53708);if ((((weekyear == -1)&&(__CLR4_4_115dj15djlc8azwuy.R.iget(53709)!=0|true))||(__CLR4_4_115dj15djlc8azwuy.R.iget(53710)==0&false))) {{
            __CLR4_4_115dj15djlc8azwuy.R.inc(53711);nextWeekyear = 1;
        } }else {{
            __CLR4_4_115dj15djlc8azwuy.R.inc(53712);nextWeekyear = weekyear + 1;
        }
        }__CLR4_4_115dj15djlc8azwuy.R.inc(53713);if ((((date >= fixedFromISO(nextWeekyear, 1, 1))&&(__CLR4_4_115dj15djlc8azwuy.R.iget(53714)!=0|true))||(__CLR4_4_115dj15djlc8azwuy.R.iget(53715)==0&false))) {{
            __CLR4_4_115dj15djlc8azwuy.R.inc(53716);weekyear = nextWeekyear;
        }
        }__CLR4_4_115dj15djlc8azwuy.R.inc(53717);int weekOfWeekyear = (int)(div(date - fixedFromISO(weekyear, 1, 1), 7) + 1);
        __CLR4_4_115dj15djlc8azwuy.R.inc(53718);int dayOfWeek = (int)amod(date, 7);
        __CLR4_4_115dj15djlc8azwuy.R.inc(53719);return new int[]{weekyear, weekOfWeekyear, dayOfWeek};
    }finally{__CLR4_4_115dj15djlc8azwuy.R.flushNeeded();}}
}
