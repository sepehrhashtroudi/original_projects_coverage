/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 *  Copyright 2001-2011 Stephen Colebourne
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
package org.joda.time.base;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.ReadableDateTime;
import org.joda.time.format.DateTimeFormat;

/**
 * AbstractDateTime provides the common behaviour for datetime classes.
 * <p>
 * This class should generally not be used directly by API users.
 * The {@link ReadableDateTime} interface should be used when different 
 * kinds of date/time objects are to be referenced.
 * <p>
 * Whenever you want to implement <code>ReadableDateTime</code> you should
 * extend this class.
 * <p>
 * AbstractDateTime subclasses may be mutable and not thread-safe.
 *
 * @author Brian S O'Neill
 * @author Stephen Colebourne
 * @since 1.0
 */
public abstract class AbstractDateTime
        extends AbstractInstant
        implements ReadableDateTime {public static class __CLR4_4_15gm5gmlc8azslm{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672271027956L,8589935092L,7148,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Constructor.
     */
    protected AbstractDateTime() {
        super();__CLR4_4_15gm5gmlc8azslm.R.inc(7079);try{__CLR4_4_15gm5gmlc8azslm.R.inc(7078);
    }finally{__CLR4_4_15gm5gmlc8azslm.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Get the value of one of the fields of a datetime.
     * <p>
     * This method uses the chronology of the datetime to obtain the value.
     * It is essentially a generic way of calling one of the get methods.
     *
     * @param type  a field type, usually obtained from DateTimeFieldType
     * @return the value of that field
     * @throws IllegalArgumentException if the field type is null
     */
    public int get(DateTimeFieldType type) {try{__CLR4_4_15gm5gmlc8azslm.R.inc(7080);
        __CLR4_4_15gm5gmlc8azslm.R.inc(7081);if ((((type == null)&&(__CLR4_4_15gm5gmlc8azslm.R.iget(7082)!=0|true))||(__CLR4_4_15gm5gmlc8azslm.R.iget(7083)==0&false))) {{
            __CLR4_4_15gm5gmlc8azslm.R.inc(7084);throw new IllegalArgumentException("The DateTimeFieldType must not be null");
        }
        }__CLR4_4_15gm5gmlc8azslm.R.inc(7085);return type.getField(getChronology()).get(getMillis());
    }finally{__CLR4_4_15gm5gmlc8azslm.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Get the era field value.
     * 
     * @return the era
     */
    public int getEra() {try{__CLR4_4_15gm5gmlc8azslm.R.inc(7086);
        __CLR4_4_15gm5gmlc8azslm.R.inc(7087);return getChronology().era().get(getMillis());
    }finally{__CLR4_4_15gm5gmlc8azslm.R.flushNeeded();}}

    /**
     * Get the year of era field value.
     * 
     * @return the year of era
     */
    public int getCenturyOfEra() {try{__CLR4_4_15gm5gmlc8azslm.R.inc(7088);
        __CLR4_4_15gm5gmlc8azslm.R.inc(7089);return getChronology().centuryOfEra().get(getMillis());
    }finally{__CLR4_4_15gm5gmlc8azslm.R.flushNeeded();}}

    /**
     * Get the year of era field value.
     * 
     * @return the year of era
     */
    public int getYearOfEra() {try{__CLR4_4_15gm5gmlc8azslm.R.inc(7090);
        __CLR4_4_15gm5gmlc8azslm.R.inc(7091);return getChronology().yearOfEra().get(getMillis());
    }finally{__CLR4_4_15gm5gmlc8azslm.R.flushNeeded();}}

    /**
     * Get the year of century field value.
     * 
     * @return the year of century
     */
    public int getYearOfCentury() {try{__CLR4_4_15gm5gmlc8azslm.R.inc(7092);
        __CLR4_4_15gm5gmlc8azslm.R.inc(7093);return getChronology().yearOfCentury().get(getMillis());
    }finally{__CLR4_4_15gm5gmlc8azslm.R.flushNeeded();}}

    /**
     * Get the year field value.
     * 
     * @return the year
     */
    public int getYear() {try{__CLR4_4_15gm5gmlc8azslm.R.inc(7094);
        __CLR4_4_15gm5gmlc8azslm.R.inc(7095);return getChronology().year().get(getMillis());
    }finally{__CLR4_4_15gm5gmlc8azslm.R.flushNeeded();}}

    /**
     * Get the weekyear field value.
     * <p>
     * The weekyear is the year that matches with the weekOfWeekyear field.
     * In the standard ISO8601 week algorithm, the first week of the year
     * is that in which at least 4 days are in the year. As a result of this
     * definition, day 1 of the first week may be in the previous year.
     * The weekyear allows you to query the effective year for that day.
     * 
     * @return the year of a week based year
     */
    public int getWeekyear() {try{__CLR4_4_15gm5gmlc8azslm.R.inc(7096);
        __CLR4_4_15gm5gmlc8azslm.R.inc(7097);return getChronology().weekyear().get(getMillis());
    }finally{__CLR4_4_15gm5gmlc8azslm.R.flushNeeded();}}

    /**
     * Get the month of year field value.
     * 
     * @return the month of year
     */
    public int getMonthOfYear() {try{__CLR4_4_15gm5gmlc8azslm.R.inc(7098);
        __CLR4_4_15gm5gmlc8azslm.R.inc(7099);return getChronology().monthOfYear().get(getMillis());
    }finally{__CLR4_4_15gm5gmlc8azslm.R.flushNeeded();}}

    /**
     * Get the week of weekyear field value.
     * <p>
     * This field is associated with the "weekyear" via {@link #getWeekyear()}.
     * In the standard ISO8601 week algorithm, the first week of the year
     * is that in which at least 4 days are in the year. As a result of this
     * definition, day 1 of the first week may be in the previous year.
     * 
     * @return the week of a week based year
     */
    public int getWeekOfWeekyear() {try{__CLR4_4_15gm5gmlc8azslm.R.inc(7100);
        __CLR4_4_15gm5gmlc8azslm.R.inc(7101);return getChronology().weekOfWeekyear().get(getMillis());
    }finally{__CLR4_4_15gm5gmlc8azslm.R.flushNeeded();}}

    /**
     * Get the day of year field value.
     * 
     * @return the day of year
     */
    public int getDayOfYear() {try{__CLR4_4_15gm5gmlc8azslm.R.inc(7102);
        __CLR4_4_15gm5gmlc8azslm.R.inc(7103);return getChronology().dayOfYear().get(getMillis());
    }finally{__CLR4_4_15gm5gmlc8azslm.R.flushNeeded();}}

    /**
     * Get the day of month field value.
     * <p>
     * The values for the day of month are defined in {@link org.joda.time.DateTimeConstants}.
     * 
     * @return the day of month
     */
    public int getDayOfMonth() {try{__CLR4_4_15gm5gmlc8azslm.R.inc(7104);
        __CLR4_4_15gm5gmlc8azslm.R.inc(7105);return getChronology().dayOfMonth().get(getMillis());
    }finally{__CLR4_4_15gm5gmlc8azslm.R.flushNeeded();}}

    /**
     * Get the day of week field value.
     * <p>
     * The values for the day of week are defined in {@link org.joda.time.DateTimeConstants}.
     * 
     * @return the day of week
     */
    public int getDayOfWeek() {try{__CLR4_4_15gm5gmlc8azslm.R.inc(7106);
        __CLR4_4_15gm5gmlc8azslm.R.inc(7107);return getChronology().dayOfWeek().get(getMillis());
    }finally{__CLR4_4_15gm5gmlc8azslm.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Get the hour of day field value.
     *
     * @return the hour of day
     */
    public int getHourOfDay() {try{__CLR4_4_15gm5gmlc8azslm.R.inc(7108);
        __CLR4_4_15gm5gmlc8azslm.R.inc(7109);return getChronology().hourOfDay().get(getMillis());
    }finally{__CLR4_4_15gm5gmlc8azslm.R.flushNeeded();}}

    /**
     * Get the minute of day field value.
     *
     * @return the minute of day
     */
    public int getMinuteOfDay() {try{__CLR4_4_15gm5gmlc8azslm.R.inc(7110);
        __CLR4_4_15gm5gmlc8azslm.R.inc(7111);return getChronology().minuteOfDay().get(getMillis());
    }finally{__CLR4_4_15gm5gmlc8azslm.R.flushNeeded();}}

    /**
     * Get the minute of hour field value.
     *
     * @return the minute of hour
     */
    public int getMinuteOfHour() {try{__CLR4_4_15gm5gmlc8azslm.R.inc(7112);
        __CLR4_4_15gm5gmlc8azslm.R.inc(7113);return getChronology().minuteOfHour().get(getMillis());
    }finally{__CLR4_4_15gm5gmlc8azslm.R.flushNeeded();}}

    /**
     * Get the second of day field value.
     *
     * @return the second of day
     */
    public int getSecondOfDay() {try{__CLR4_4_15gm5gmlc8azslm.R.inc(7114);
        __CLR4_4_15gm5gmlc8azslm.R.inc(7115);return getChronology().secondOfDay().get(getMillis());
    }finally{__CLR4_4_15gm5gmlc8azslm.R.flushNeeded();}}

    /**
     * Get the second of minute field value.
     *
     * @return the second of minute
     */
    public int getSecondOfMinute() {try{__CLR4_4_15gm5gmlc8azslm.R.inc(7116);
        __CLR4_4_15gm5gmlc8azslm.R.inc(7117);return getChronology().secondOfMinute().get(getMillis());
    }finally{__CLR4_4_15gm5gmlc8azslm.R.flushNeeded();}}

    /**
     * Get the millis of day field value.
     *
     * @return the millis of day
     */
    public int getMillisOfDay() {try{__CLR4_4_15gm5gmlc8azslm.R.inc(7118);
        __CLR4_4_15gm5gmlc8azslm.R.inc(7119);return getChronology().millisOfDay().get(getMillis());
    }finally{__CLR4_4_15gm5gmlc8azslm.R.flushNeeded();}}

    /**
     * Get the millis of second field value.
     *
     * @return the millis of second
     */
    public int getMillisOfSecond() {try{__CLR4_4_15gm5gmlc8azslm.R.inc(7120);
        __CLR4_4_15gm5gmlc8azslm.R.inc(7121);return getChronology().millisOfSecond().get(getMillis());
    }finally{__CLR4_4_15gm5gmlc8azslm.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Get the date time as a <code>java.util.Calendar</code>, assigning
     * exactly the same millisecond instant.
     * The locale is passed in, enabling Calendar to select the correct
     * localized subclass.
     * <p>
     * The JDK and Joda-Time both have time zone implementations and these
     * differ in accuracy. Joda-Time's implementation is generally more up to
     * date and thus more accurate - for example JDK1.3 has no historical data.
     * The effect of this is that the field values of the <code>Calendar</code>
     * may differ from those of this object, even though the milliseond value
     * is the same. Most of the time this just means that the JDK field values
     * are wrong, as our time zone information is more up to date.
     *
     * @param locale  the locale to get the Calendar for, or default if null
     * @return a localized Calendar initialised with this datetime
     */
    public Calendar toCalendar(Locale locale) {try{__CLR4_4_15gm5gmlc8azslm.R.inc(7122);
        __CLR4_4_15gm5gmlc8azslm.R.inc(7123);if ((((locale == null)&&(__CLR4_4_15gm5gmlc8azslm.R.iget(7124)!=0|true))||(__CLR4_4_15gm5gmlc8azslm.R.iget(7125)==0&false))) {{
            __CLR4_4_15gm5gmlc8azslm.R.inc(7126);locale = Locale.getDefault();
        }
        }__CLR4_4_15gm5gmlc8azslm.R.inc(7127);DateTimeZone zone = getZone();
        __CLR4_4_15gm5gmlc8azslm.R.inc(7128);Calendar cal = Calendar.getInstance(zone.toTimeZone(), locale);
        __CLR4_4_15gm5gmlc8azslm.R.inc(7129);cal.setTime(toDate());
        __CLR4_4_15gm5gmlc8azslm.R.inc(7130);return cal;
    }finally{__CLR4_4_15gm5gmlc8azslm.R.flushNeeded();}}

    /**
     * Get the date time as a <code>java.util.GregorianCalendar</code>,
     * assigning exactly the same millisecond instant.
     * <p>
     * The JDK and Joda-Time both have time zone implementations and these
     * differ in accuracy. Joda-Time's implementation is generally more up to
     * date and thus more accurate - for example JDK1.3 has no historical data.
     * The effect of this is that the field values of the <code>Calendar</code>
     * may differ from those of this object, even though the milliseond value
     * is the same. Most of the time this just means that the JDK field values
     * are wrong, as our time zone information is more up to date.
     *
     * @return a GregorianCalendar initialised with this datetime
     */
    public GregorianCalendar toGregorianCalendar() {try{__CLR4_4_15gm5gmlc8azslm.R.inc(7131);
        __CLR4_4_15gm5gmlc8azslm.R.inc(7132);DateTimeZone zone = getZone();
        __CLR4_4_15gm5gmlc8azslm.R.inc(7133);GregorianCalendar cal = new GregorianCalendar(zone.toTimeZone());
        __CLR4_4_15gm5gmlc8azslm.R.inc(7134);cal.setTime(toDate());
        __CLR4_4_15gm5gmlc8azslm.R.inc(7135);return cal;
    }finally{__CLR4_4_15gm5gmlc8azslm.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Output the instant using the specified format pattern.
     *
     * @param pattern  the pattern specification, null means use <code>toString</code>
     * @see  org.joda.time.format.DateTimeFormat
     */
    public String toString(String pattern) {try{__CLR4_4_15gm5gmlc8azslm.R.inc(7136);
        __CLR4_4_15gm5gmlc8azslm.R.inc(7137);if ((((pattern == null)&&(__CLR4_4_15gm5gmlc8azslm.R.iget(7138)!=0|true))||(__CLR4_4_15gm5gmlc8azslm.R.iget(7139)==0&false))) {{
            __CLR4_4_15gm5gmlc8azslm.R.inc(7140);return toString();
        }
        }__CLR4_4_15gm5gmlc8azslm.R.inc(7141);return DateTimeFormat.forPattern(pattern).print(this);
    }finally{__CLR4_4_15gm5gmlc8azslm.R.flushNeeded();}}

    /**
     * Output the instant using the specified format pattern.
     *
     * @param pattern  the pattern specification, null means use <code>toString</code>
     * @param locale  Locale to use, null means default
     * @see  org.joda.time.format.DateTimeFormat
     */
    public String toString(String pattern, Locale locale) throws IllegalArgumentException {try{__CLR4_4_15gm5gmlc8azslm.R.inc(7142);
        __CLR4_4_15gm5gmlc8azslm.R.inc(7143);if ((((pattern == null)&&(__CLR4_4_15gm5gmlc8azslm.R.iget(7144)!=0|true))||(__CLR4_4_15gm5gmlc8azslm.R.iget(7145)==0&false))) {{
            __CLR4_4_15gm5gmlc8azslm.R.inc(7146);return toString();
        }
        }__CLR4_4_15gm5gmlc8azslm.R.inc(7147);return DateTimeFormat.forPattern(pattern).withLocale(locale).print(this);
    }finally{__CLR4_4_15gm5gmlc8azslm.R.flushNeeded();}}

}
