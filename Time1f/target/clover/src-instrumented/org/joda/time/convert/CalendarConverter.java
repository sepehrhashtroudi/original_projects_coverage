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
package org.joda.time.convert;

import java.util.Calendar;
import java.util.GregorianCalendar;

import org.joda.time.Chronology;
import org.joda.time.DateTimeZone;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.chrono.JulianChronology;

/**
 * CalendarConverter converts a java util Calendar to an instant or partial.
 * The Calendar is converted to milliseconds and the chronology that best
 * matches the calendar.
 *
 * @author Stephen Colebourne
 * @since 1.0
 */
final class CalendarConverter extends AbstractConverter
        implements InstantConverter, PartialConverter {public static class __CLR4_4_19iq9iqlc8azt2i{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672271027956L,8589935092L,12376,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Singleton instance.
     */
    static final CalendarConverter INSTANCE = new CalendarConverter();

    /**
     * Restricted constructor.
     */
    protected CalendarConverter() {
        super();__CLR4_4_19iq9iqlc8azt2i.R.inc(12339);try{__CLR4_4_19iq9iqlc8azt2i.R.inc(12338);
    }finally{__CLR4_4_19iq9iqlc8azt2i.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Gets the chronology.
     * <p>
     * If a chronology is specified then it is used.
     * Otherwise, it is the GJChronology if a GregorianCalendar is used,
     * BuddhistChronology if a BuddhistCalendar is used or ISOChronology otherwise.
     * The time zone is extracted from the calendar if possible, default used if not.
     * 
     * @param object  the Calendar to convert, must not be null
     * @param chrono  the chronology to use, null means use Calendar
     * @return the chronology, never null
     * @throws NullPointerException if the object is null
     * @throws ClassCastException if the object is an invalid type
     */
    public Chronology getChronology(Object object, Chronology chrono) {try{__CLR4_4_19iq9iqlc8azt2i.R.inc(12340);
        __CLR4_4_19iq9iqlc8azt2i.R.inc(12341);if ((((chrono != null)&&(__CLR4_4_19iq9iqlc8azt2i.R.iget(12342)!=0|true))||(__CLR4_4_19iq9iqlc8azt2i.R.iget(12343)==0&false))) {{
            __CLR4_4_19iq9iqlc8azt2i.R.inc(12344);return chrono;
        }
        }__CLR4_4_19iq9iqlc8azt2i.R.inc(12345);Calendar cal = (Calendar) object;
        __CLR4_4_19iq9iqlc8azt2i.R.inc(12346);DateTimeZone zone = null;
        __CLR4_4_19iq9iqlc8azt2i.R.inc(12347);try {
            __CLR4_4_19iq9iqlc8azt2i.R.inc(12348);zone = DateTimeZone.forTimeZone(cal.getTimeZone());
            
        } catch (IllegalArgumentException ex) {
            __CLR4_4_19iq9iqlc8azt2i.R.inc(12349);zone = DateTimeZone.getDefault();
        }
        __CLR4_4_19iq9iqlc8azt2i.R.inc(12350);return getChronology(cal, zone);
    }finally{__CLR4_4_19iq9iqlc8azt2i.R.flushNeeded();}}

    /**
     * Gets the chronology, which is the GJChronology if a GregorianCalendar is used,
     * BuddhistChronology if a BuddhistCalendar is used or ISOChronology otherwise.
     * The time zone specified is used in preference to that on the calendar.
     * 
     * @param object  the Calendar to convert, must not be null
     * @param zone  the specified zone to use, null means default zone
     * @return the chronology, never null
     * @throws NullPointerException if the object is null
     * @throws ClassCastException if the object is an invalid type
     */
    public Chronology getChronology(Object object, DateTimeZone zone) {try{__CLR4_4_19iq9iqlc8azt2i.R.inc(12351);
        __CLR4_4_19iq9iqlc8azt2i.R.inc(12352);if ((((object.getClass().getName().endsWith(".BuddhistCalendar"))&&(__CLR4_4_19iq9iqlc8azt2i.R.iget(12353)!=0|true))||(__CLR4_4_19iq9iqlc8azt2i.R.iget(12354)==0&false))) {{
            __CLR4_4_19iq9iqlc8azt2i.R.inc(12355);return BuddhistChronology.getInstance(zone);
        } }else {__CLR4_4_19iq9iqlc8azt2i.R.inc(12356);if ((((object instanceof GregorianCalendar)&&(__CLR4_4_19iq9iqlc8azt2i.R.iget(12357)!=0|true))||(__CLR4_4_19iq9iqlc8azt2i.R.iget(12358)==0&false))) {{
            __CLR4_4_19iq9iqlc8azt2i.R.inc(12359);GregorianCalendar gc = (GregorianCalendar) object;
            __CLR4_4_19iq9iqlc8azt2i.R.inc(12360);long cutover = gc.getGregorianChange().getTime();
            __CLR4_4_19iq9iqlc8azt2i.R.inc(12361);if ((((cutover == Long.MIN_VALUE)&&(__CLR4_4_19iq9iqlc8azt2i.R.iget(12362)!=0|true))||(__CLR4_4_19iq9iqlc8azt2i.R.iget(12363)==0&false))) {{
                __CLR4_4_19iq9iqlc8azt2i.R.inc(12364);return GregorianChronology.getInstance(zone);
            } }else {__CLR4_4_19iq9iqlc8azt2i.R.inc(12365);if ((((cutover == Long.MAX_VALUE)&&(__CLR4_4_19iq9iqlc8azt2i.R.iget(12366)!=0|true))||(__CLR4_4_19iq9iqlc8azt2i.R.iget(12367)==0&false))) {{
                __CLR4_4_19iq9iqlc8azt2i.R.inc(12368);return JulianChronology.getInstance(zone);
            } }else {{
                __CLR4_4_19iq9iqlc8azt2i.R.inc(12369);return GJChronology.getInstance(zone, cutover, 4);
            }
        }}} }else {{
            __CLR4_4_19iq9iqlc8azt2i.R.inc(12370);return ISOChronology.getInstance(zone);
        }
    }}}finally{__CLR4_4_19iq9iqlc8azt2i.R.flushNeeded();}}

    /**
     * Gets the millis, which is the Calendar millis value.
     * 
     * @param object  the Calendar to convert, must not be null
     * @param chrono  the chronology result from getChronology, non-null
     * @return the millisecond value
     * @throws NullPointerException if the object is null
     * @throws ClassCastException if the object is an invalid type
     */
    public long getInstantMillis(Object object, Chronology chrono) {try{__CLR4_4_19iq9iqlc8azt2i.R.inc(12371);
        __CLR4_4_19iq9iqlc8azt2i.R.inc(12372);Calendar calendar = (Calendar) object;
        __CLR4_4_19iq9iqlc8azt2i.R.inc(12373);return calendar.getTime().getTime();
    }finally{__CLR4_4_19iq9iqlc8azt2i.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Returns Calendar.class.
     * 
     * @return Calendar.class
     */
    public Class<?> getSupportedType() {try{__CLR4_4_19iq9iqlc8azt2i.R.inc(12374);
        __CLR4_4_19iq9iqlc8azt2i.R.inc(12375);return Calendar.class;
    }finally{__CLR4_4_19iq9iqlc8azt2i.R.flushNeeded();}}

}
