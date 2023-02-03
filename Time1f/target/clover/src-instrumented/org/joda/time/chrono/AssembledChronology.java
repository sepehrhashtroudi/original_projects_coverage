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

import java.io.IOException;
import java.io.ObjectInputStream;

import org.joda.time.Chronology;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationField;

/**
 * Abstract Chronology that enables chronologies to be assembled from
 * a container of fields.
 * <p>
 * AssembledChronology is thread-safe and immutable.
 *
 * @author Brian S O'Neill
 * @since 1.0
 */
public abstract class AssembledChronology extends BaseChronology {public static class __CLR4_4_16dd6ddlc8azsqu{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672271027956L,8589935092L,8645,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final long serialVersionUID = -6728465968995518215L;

    private final Chronology iBase;
    private final Object iParam;

    private transient DurationField iMillis;
    private transient DurationField iSeconds;
    private transient DurationField iMinutes;
    private transient DurationField iHours;
    private transient DurationField iHalfdays;

    private transient DurationField iDays;
    private transient DurationField iWeeks;
    private transient DurationField iWeekyears;
    private transient DurationField iMonths;
    private transient DurationField iYears;
    private transient DurationField iCenturies;
    private transient DurationField iEras;

    private transient DateTimeField iMillisOfSecond;
    private transient DateTimeField iMillisOfDay;
    private transient DateTimeField iSecondOfMinute;
    private transient DateTimeField iSecondOfDay;
    private transient DateTimeField iMinuteOfHour;
    private transient DateTimeField iMinuteOfDay;
    private transient DateTimeField iHourOfDay;
    private transient DateTimeField iClockhourOfDay;
    private transient DateTimeField iHourOfHalfday;
    private transient DateTimeField iClockhourOfHalfday;
    private transient DateTimeField iHalfdayOfDay;

    private transient DateTimeField iDayOfWeek;
    private transient DateTimeField iDayOfMonth;
    private transient DateTimeField iDayOfYear;
    private transient DateTimeField iWeekOfWeekyear;
    private transient DateTimeField iWeekyear;
    private transient DateTimeField iWeekyearOfCentury;
    private transient DateTimeField iMonthOfYear;
    private transient DateTimeField iYear;
    private transient DateTimeField iYearOfEra;
    private transient DateTimeField iYearOfCentury;
    private transient DateTimeField iCenturyOfEra;
    private transient DateTimeField iEra;

    // Bit set determines which base fields are used
    // bit 1 set: hourOfDay, minuteOfHour, secondOfMinute, and millisOfSecond fields
    // bit 2 set: millisOfDayField
    // bit 3 set: year, monthOfYear, and dayOfMonth fields
    private transient int iBaseFlags;

    /**
     * Constructor calls the assemble method, enabling subclasses to define its
     * supported fields. If a base chronology is supplied, the field set
     * initially contains references to each base chronology field.
     * <p>
     * Other methods in this class will delegate to the base chronology, if it
     * can be determined that the base chronology will produce the same results
     * as AbstractChronology.
     *
     * @param base optional base chronology to copy initial fields from
     * @param param optional param object avalable for assemble method
     */
    protected AssembledChronology(Chronology base, Object param) {try{__CLR4_4_16dd6ddlc8azsqu.R.inc(8257);
        __CLR4_4_16dd6ddlc8azsqu.R.inc(8258);iBase = base;
        __CLR4_4_16dd6ddlc8azsqu.R.inc(8259);iParam = param;
        __CLR4_4_16dd6ddlc8azsqu.R.inc(8260);setFields();
    }finally{__CLR4_4_16dd6ddlc8azsqu.R.flushNeeded();}}

    public DateTimeZone getZone() {try{__CLR4_4_16dd6ddlc8azsqu.R.inc(8261);
        __CLR4_4_16dd6ddlc8azsqu.R.inc(8262);Chronology base;
        __CLR4_4_16dd6ddlc8azsqu.R.inc(8263);if ((base = iBase) != null) {{
            __CLR4_4_16dd6ddlc8azsqu.R.inc(8266);return base.getZone();
        }
        }__CLR4_4_16dd6ddlc8azsqu.R.inc(8267);return null;
    }finally{__CLR4_4_16dd6ddlc8azsqu.R.flushNeeded();}}

    public long getDateTimeMillis(int year, int monthOfYear, int dayOfMonth,
                                  int millisOfDay)
        throws IllegalArgumentException
    {try{__CLR4_4_16dd6ddlc8azsqu.R.inc(8268);
        __CLR4_4_16dd6ddlc8azsqu.R.inc(8269);Chronology base;
        __CLR4_4_16dd6ddlc8azsqu.R.inc(8270);if ((base = iBase) != null && (iBaseFlags & 6) == 6) {{
            // Only call specialized implementation if applicable fields are the same.
            __CLR4_4_16dd6ddlc8azsqu.R.inc(8273);return base.getDateTimeMillis(year, monthOfYear, dayOfMonth, millisOfDay);
        }
        }__CLR4_4_16dd6ddlc8azsqu.R.inc(8274);return super.getDateTimeMillis(year, monthOfYear, dayOfMonth, millisOfDay);
    }finally{__CLR4_4_16dd6ddlc8azsqu.R.flushNeeded();}}

    public long getDateTimeMillis(int year, int monthOfYear, int dayOfMonth,
                                  int hourOfDay, int minuteOfHour,
                                  int secondOfMinute, int millisOfSecond)
        throws IllegalArgumentException
    {try{__CLR4_4_16dd6ddlc8azsqu.R.inc(8275);
        __CLR4_4_16dd6ddlc8azsqu.R.inc(8276);Chronology base;
        __CLR4_4_16dd6ddlc8azsqu.R.inc(8277);if ((base = iBase) != null && (iBaseFlags & 5) == 5) {{
            // Only call specialized implementation if applicable fields are the same.
            __CLR4_4_16dd6ddlc8azsqu.R.inc(8280);return base.getDateTimeMillis(year, monthOfYear, dayOfMonth,
                                          hourOfDay, minuteOfHour, secondOfMinute, millisOfSecond);
        }
        }__CLR4_4_16dd6ddlc8azsqu.R.inc(8281);return super.getDateTimeMillis(year, monthOfYear, dayOfMonth,
                                       hourOfDay, minuteOfHour, secondOfMinute, millisOfSecond);
    }finally{__CLR4_4_16dd6ddlc8azsqu.R.flushNeeded();}}

    public long getDateTimeMillis(long instant,
                                  int hourOfDay, int minuteOfHour,
                                  int secondOfMinute, int millisOfSecond)
        throws IllegalArgumentException
    {try{__CLR4_4_16dd6ddlc8azsqu.R.inc(8282);
        __CLR4_4_16dd6ddlc8azsqu.R.inc(8283);Chronology base;
        __CLR4_4_16dd6ddlc8azsqu.R.inc(8284);if ((base = iBase) != null && (iBaseFlags & 1) == 1) {{
            // Only call specialized implementation if applicable fields are the same.
            __CLR4_4_16dd6ddlc8azsqu.R.inc(8287);return base.getDateTimeMillis
                (instant, hourOfDay, minuteOfHour, secondOfMinute, millisOfSecond);
        }
        }__CLR4_4_16dd6ddlc8azsqu.R.inc(8288);return super.getDateTimeMillis
            (instant, hourOfDay, minuteOfHour, secondOfMinute, millisOfSecond);
    }finally{__CLR4_4_16dd6ddlc8azsqu.R.flushNeeded();}}

    public final DurationField millis() {try{__CLR4_4_16dd6ddlc8azsqu.R.inc(8289);
        __CLR4_4_16dd6ddlc8azsqu.R.inc(8290);return iMillis;
    }finally{__CLR4_4_16dd6ddlc8azsqu.R.flushNeeded();}}

    public final DateTimeField millisOfSecond() {try{__CLR4_4_16dd6ddlc8azsqu.R.inc(8291);
        __CLR4_4_16dd6ddlc8azsqu.R.inc(8292);return iMillisOfSecond;
    }finally{__CLR4_4_16dd6ddlc8azsqu.R.flushNeeded();}}

    public final DateTimeField millisOfDay() {try{__CLR4_4_16dd6ddlc8azsqu.R.inc(8293);
        __CLR4_4_16dd6ddlc8azsqu.R.inc(8294);return iMillisOfDay;
    }finally{__CLR4_4_16dd6ddlc8azsqu.R.flushNeeded();}}

    public final DurationField seconds() {try{__CLR4_4_16dd6ddlc8azsqu.R.inc(8295);
        __CLR4_4_16dd6ddlc8azsqu.R.inc(8296);return iSeconds;
    }finally{__CLR4_4_16dd6ddlc8azsqu.R.flushNeeded();}}

    public final DateTimeField secondOfMinute() {try{__CLR4_4_16dd6ddlc8azsqu.R.inc(8297);
        __CLR4_4_16dd6ddlc8azsqu.R.inc(8298);return iSecondOfMinute;
    }finally{__CLR4_4_16dd6ddlc8azsqu.R.flushNeeded();}}

    public final DateTimeField secondOfDay() {try{__CLR4_4_16dd6ddlc8azsqu.R.inc(8299);
        __CLR4_4_16dd6ddlc8azsqu.R.inc(8300);return iSecondOfDay;
    }finally{__CLR4_4_16dd6ddlc8azsqu.R.flushNeeded();}}

    public final DurationField minutes() {try{__CLR4_4_16dd6ddlc8azsqu.R.inc(8301);
        __CLR4_4_16dd6ddlc8azsqu.R.inc(8302);return iMinutes;
    }finally{__CLR4_4_16dd6ddlc8azsqu.R.flushNeeded();}}

    public final DateTimeField minuteOfHour() {try{__CLR4_4_16dd6ddlc8azsqu.R.inc(8303);
        __CLR4_4_16dd6ddlc8azsqu.R.inc(8304);return iMinuteOfHour;
    }finally{__CLR4_4_16dd6ddlc8azsqu.R.flushNeeded();}}

    public final DateTimeField minuteOfDay() {try{__CLR4_4_16dd6ddlc8azsqu.R.inc(8305);
        __CLR4_4_16dd6ddlc8azsqu.R.inc(8306);return iMinuteOfDay;
    }finally{__CLR4_4_16dd6ddlc8azsqu.R.flushNeeded();}}

    public final DurationField hours() {try{__CLR4_4_16dd6ddlc8azsqu.R.inc(8307);
        __CLR4_4_16dd6ddlc8azsqu.R.inc(8308);return iHours;
    }finally{__CLR4_4_16dd6ddlc8azsqu.R.flushNeeded();}}

    public final DateTimeField hourOfDay() {try{__CLR4_4_16dd6ddlc8azsqu.R.inc(8309);
        __CLR4_4_16dd6ddlc8azsqu.R.inc(8310);return iHourOfDay;
    }finally{__CLR4_4_16dd6ddlc8azsqu.R.flushNeeded();}}

    public final DateTimeField clockhourOfDay() {try{__CLR4_4_16dd6ddlc8azsqu.R.inc(8311);
        __CLR4_4_16dd6ddlc8azsqu.R.inc(8312);return iClockhourOfDay;
    }finally{__CLR4_4_16dd6ddlc8azsqu.R.flushNeeded();}}

    public final DurationField halfdays() {try{__CLR4_4_16dd6ddlc8azsqu.R.inc(8313);
        __CLR4_4_16dd6ddlc8azsqu.R.inc(8314);return iHalfdays;
    }finally{__CLR4_4_16dd6ddlc8azsqu.R.flushNeeded();}}

    public final DateTimeField hourOfHalfday() {try{__CLR4_4_16dd6ddlc8azsqu.R.inc(8315);
        __CLR4_4_16dd6ddlc8azsqu.R.inc(8316);return iHourOfHalfday;
    }finally{__CLR4_4_16dd6ddlc8azsqu.R.flushNeeded();}}

    public final DateTimeField clockhourOfHalfday() {try{__CLR4_4_16dd6ddlc8azsqu.R.inc(8317);
        __CLR4_4_16dd6ddlc8azsqu.R.inc(8318);return iClockhourOfHalfday;
    }finally{__CLR4_4_16dd6ddlc8azsqu.R.flushNeeded();}}

    public final DateTimeField halfdayOfDay() {try{__CLR4_4_16dd6ddlc8azsqu.R.inc(8319);
        __CLR4_4_16dd6ddlc8azsqu.R.inc(8320);return iHalfdayOfDay;
    }finally{__CLR4_4_16dd6ddlc8azsqu.R.flushNeeded();}}

    public final DurationField days() {try{__CLR4_4_16dd6ddlc8azsqu.R.inc(8321);
        __CLR4_4_16dd6ddlc8azsqu.R.inc(8322);return iDays;
    }finally{__CLR4_4_16dd6ddlc8azsqu.R.flushNeeded();}}

    public final DateTimeField dayOfWeek() {try{__CLR4_4_16dd6ddlc8azsqu.R.inc(8323);
        __CLR4_4_16dd6ddlc8azsqu.R.inc(8324);return iDayOfWeek;
    }finally{__CLR4_4_16dd6ddlc8azsqu.R.flushNeeded();}}

    public final DateTimeField dayOfMonth() {try{__CLR4_4_16dd6ddlc8azsqu.R.inc(8325);
        __CLR4_4_16dd6ddlc8azsqu.R.inc(8326);return iDayOfMonth;
    }finally{__CLR4_4_16dd6ddlc8azsqu.R.flushNeeded();}}

    public final DateTimeField dayOfYear() {try{__CLR4_4_16dd6ddlc8azsqu.R.inc(8327);
        __CLR4_4_16dd6ddlc8azsqu.R.inc(8328);return iDayOfYear;
    }finally{__CLR4_4_16dd6ddlc8azsqu.R.flushNeeded();}}

    public final DurationField weeks() {try{__CLR4_4_16dd6ddlc8azsqu.R.inc(8329);
        __CLR4_4_16dd6ddlc8azsqu.R.inc(8330);return iWeeks;
    }finally{__CLR4_4_16dd6ddlc8azsqu.R.flushNeeded();}}

    public final DateTimeField weekOfWeekyear() {try{__CLR4_4_16dd6ddlc8azsqu.R.inc(8331);
        __CLR4_4_16dd6ddlc8azsqu.R.inc(8332);return iWeekOfWeekyear;
    }finally{__CLR4_4_16dd6ddlc8azsqu.R.flushNeeded();}}

    public final DurationField weekyears() {try{__CLR4_4_16dd6ddlc8azsqu.R.inc(8333);
        __CLR4_4_16dd6ddlc8azsqu.R.inc(8334);return iWeekyears;
    }finally{__CLR4_4_16dd6ddlc8azsqu.R.flushNeeded();}}

    public final DateTimeField weekyear() {try{__CLR4_4_16dd6ddlc8azsqu.R.inc(8335);
        __CLR4_4_16dd6ddlc8azsqu.R.inc(8336);return iWeekyear;
    }finally{__CLR4_4_16dd6ddlc8azsqu.R.flushNeeded();}}

    public final DateTimeField weekyearOfCentury() {try{__CLR4_4_16dd6ddlc8azsqu.R.inc(8337);
        __CLR4_4_16dd6ddlc8azsqu.R.inc(8338);return iWeekyearOfCentury;
    }finally{__CLR4_4_16dd6ddlc8azsqu.R.flushNeeded();}}

    public final DurationField months() {try{__CLR4_4_16dd6ddlc8azsqu.R.inc(8339);
        __CLR4_4_16dd6ddlc8azsqu.R.inc(8340);return iMonths;
    }finally{__CLR4_4_16dd6ddlc8azsqu.R.flushNeeded();}}

    public final DateTimeField monthOfYear() {try{__CLR4_4_16dd6ddlc8azsqu.R.inc(8341);
        __CLR4_4_16dd6ddlc8azsqu.R.inc(8342);return iMonthOfYear;
    }finally{__CLR4_4_16dd6ddlc8azsqu.R.flushNeeded();}}

    public final DurationField years() {try{__CLR4_4_16dd6ddlc8azsqu.R.inc(8343);
        __CLR4_4_16dd6ddlc8azsqu.R.inc(8344);return iYears;
    }finally{__CLR4_4_16dd6ddlc8azsqu.R.flushNeeded();}}

    public final DateTimeField year() {try{__CLR4_4_16dd6ddlc8azsqu.R.inc(8345);
        __CLR4_4_16dd6ddlc8azsqu.R.inc(8346);return iYear;
    }finally{__CLR4_4_16dd6ddlc8azsqu.R.flushNeeded();}}

    public final DateTimeField yearOfEra() {try{__CLR4_4_16dd6ddlc8azsqu.R.inc(8347);
        __CLR4_4_16dd6ddlc8azsqu.R.inc(8348);return iYearOfEra;
    }finally{__CLR4_4_16dd6ddlc8azsqu.R.flushNeeded();}}

    public final DateTimeField yearOfCentury() {try{__CLR4_4_16dd6ddlc8azsqu.R.inc(8349);
        __CLR4_4_16dd6ddlc8azsqu.R.inc(8350);return iYearOfCentury;
    }finally{__CLR4_4_16dd6ddlc8azsqu.R.flushNeeded();}}

    public final DurationField centuries() {try{__CLR4_4_16dd6ddlc8azsqu.R.inc(8351);
        __CLR4_4_16dd6ddlc8azsqu.R.inc(8352);return iCenturies;
    }finally{__CLR4_4_16dd6ddlc8azsqu.R.flushNeeded();}}

    public final DateTimeField centuryOfEra() {try{__CLR4_4_16dd6ddlc8azsqu.R.inc(8353);
        __CLR4_4_16dd6ddlc8azsqu.R.inc(8354);return iCenturyOfEra;
    }finally{__CLR4_4_16dd6ddlc8azsqu.R.flushNeeded();}}

    public final DurationField eras() {try{__CLR4_4_16dd6ddlc8azsqu.R.inc(8355);
        __CLR4_4_16dd6ddlc8azsqu.R.inc(8356);return iEras;
    }finally{__CLR4_4_16dd6ddlc8azsqu.R.flushNeeded();}}

    public final DateTimeField era() {try{__CLR4_4_16dd6ddlc8azsqu.R.inc(8357);
        __CLR4_4_16dd6ddlc8azsqu.R.inc(8358);return iEra;
    }finally{__CLR4_4_16dd6ddlc8azsqu.R.flushNeeded();}}

    /**
     * Invoked by the constructor and after deserialization to allow subclasses
     * to define all of its supported fields. All unset fields default to
     * unsupported instances.
     *
     * @param fields container of fields
     */
    protected abstract void assemble(Fields fields);

    /**
     * Returns the same base chronology as passed into the constructor.
     */
    protected final Chronology getBase() {try{__CLR4_4_16dd6ddlc8azsqu.R.inc(8359);
        __CLR4_4_16dd6ddlc8azsqu.R.inc(8360);return iBase;
    }finally{__CLR4_4_16dd6ddlc8azsqu.R.flushNeeded();}}

    /**
     * Returns the same param object as passed into the constructor.
     */
    protected final Object getParam() {try{__CLR4_4_16dd6ddlc8azsqu.R.inc(8361);
        __CLR4_4_16dd6ddlc8azsqu.R.inc(8362);return iParam;
    }finally{__CLR4_4_16dd6ddlc8azsqu.R.flushNeeded();}}

    private void setFields() {try{__CLR4_4_16dd6ddlc8azsqu.R.inc(8363);
        __CLR4_4_16dd6ddlc8azsqu.R.inc(8364);Fields fields = new Fields();
        __CLR4_4_16dd6ddlc8azsqu.R.inc(8365);if ((((iBase != null)&&(__CLR4_4_16dd6ddlc8azsqu.R.iget(8366)!=0|true))||(__CLR4_4_16dd6ddlc8azsqu.R.iget(8367)==0&false))) {{
            __CLR4_4_16dd6ddlc8azsqu.R.inc(8368);fields.copyFieldsFrom(iBase);
        }
        }__CLR4_4_16dd6ddlc8azsqu.R.inc(8369);assemble(fields);

        {
            __CLR4_4_16dd6ddlc8azsqu.R.inc(8370);DurationField f;
            __CLR4_4_16dd6ddlc8azsqu.R.inc(8371);iMillis    = (f = fields.millis)    != null ? f : super.millis();
            __CLR4_4_16dd6ddlc8azsqu.R.inc(8374);iSeconds   = (f = fields.seconds)   != null ? f : super.seconds();
            __CLR4_4_16dd6ddlc8azsqu.R.inc(8377);iMinutes   = (f = fields.minutes)   != null ? f : super.minutes();
            __CLR4_4_16dd6ddlc8azsqu.R.inc(8380);iHours     = (f = fields.hours)     != null ? f : super.hours();
            __CLR4_4_16dd6ddlc8azsqu.R.inc(8383);iHalfdays  = (f = fields.halfdays)  != null ? f : super.halfdays();
            __CLR4_4_16dd6ddlc8azsqu.R.inc(8386);iDays      = (f = fields.days)      != null ? f : super.days();
            __CLR4_4_16dd6ddlc8azsqu.R.inc(8389);iWeeks     = (f = fields.weeks)     != null ? f : super.weeks();
            __CLR4_4_16dd6ddlc8azsqu.R.inc(8392);iWeekyears = (f = fields.weekyears) != null ? f : super.weekyears();
            __CLR4_4_16dd6ddlc8azsqu.R.inc(8395);iMonths    = (f = fields.months)    != null ? f : super.months();
            __CLR4_4_16dd6ddlc8azsqu.R.inc(8398);iYears     = (f = fields.years)     != null ? f : super.years();
            __CLR4_4_16dd6ddlc8azsqu.R.inc(8401);iCenturies = (f = fields.centuries) != null ? f : super.centuries();
            __CLR4_4_16dd6ddlc8azsqu.R.inc(8404);iEras      = (f = fields.eras)      != null ? f : super.eras();
        }

        {
            __CLR4_4_16dd6ddlc8azsqu.R.inc(8407);DateTimeField f;
            __CLR4_4_16dd6ddlc8azsqu.R.inc(8408);iMillisOfSecond     = (f = fields.millisOfSecond)     != null ? f : super.millisOfSecond();
            __CLR4_4_16dd6ddlc8azsqu.R.inc(8411);iMillisOfDay        = (f = fields.millisOfDay)        != null ? f : super.millisOfDay();
            __CLR4_4_16dd6ddlc8azsqu.R.inc(8414);iSecondOfMinute     = (f = fields.secondOfMinute)     != null ? f : super.secondOfMinute();
            __CLR4_4_16dd6ddlc8azsqu.R.inc(8417);iSecondOfDay        = (f = fields.secondOfDay)        != null ? f : super.secondOfDay();
            __CLR4_4_16dd6ddlc8azsqu.R.inc(8420);iMinuteOfHour       = (f = fields.minuteOfHour)       != null ? f : super.minuteOfHour();
            __CLR4_4_16dd6ddlc8azsqu.R.inc(8423);iMinuteOfDay        = (f = fields.minuteOfDay)        != null ? f : super.minuteOfDay();
            __CLR4_4_16dd6ddlc8azsqu.R.inc(8426);iHourOfDay          = (f = fields.hourOfDay)          != null ? f : super.hourOfDay();
            __CLR4_4_16dd6ddlc8azsqu.R.inc(8429);iClockhourOfDay     = (f = fields.clockhourOfDay)     != null ? f : super.clockhourOfDay();
            __CLR4_4_16dd6ddlc8azsqu.R.inc(8432);iHourOfHalfday      = (f = fields.hourOfHalfday)      != null ? f : super.hourOfHalfday();
            __CLR4_4_16dd6ddlc8azsqu.R.inc(8435);iClockhourOfHalfday = (f = fields.clockhourOfHalfday) != null ? f : super.clockhourOfHalfday();
            __CLR4_4_16dd6ddlc8azsqu.R.inc(8438);iHalfdayOfDay       = (f = fields.halfdayOfDay)       != null ? f : super.halfdayOfDay();
            __CLR4_4_16dd6ddlc8azsqu.R.inc(8441);iDayOfWeek          = (f = fields.dayOfWeek)          != null ? f : super.dayOfWeek();
            __CLR4_4_16dd6ddlc8azsqu.R.inc(8444);iDayOfMonth         = (f = fields.dayOfMonth)         != null ? f : super.dayOfMonth();
            __CLR4_4_16dd6ddlc8azsqu.R.inc(8447);iDayOfYear          = (f = fields.dayOfYear)          != null ? f : super.dayOfYear();
            __CLR4_4_16dd6ddlc8azsqu.R.inc(8450);iWeekOfWeekyear     = (f = fields.weekOfWeekyear)     != null ? f : super.weekOfWeekyear();
            __CLR4_4_16dd6ddlc8azsqu.R.inc(8453);iWeekyear           = (f = fields.weekyear)           != null ? f : super.weekyear();
            __CLR4_4_16dd6ddlc8azsqu.R.inc(8456);iWeekyearOfCentury  = (f = fields.weekyearOfCentury)  != null ? f : super.weekyearOfCentury();
            __CLR4_4_16dd6ddlc8azsqu.R.inc(8459);iMonthOfYear        = (f = fields.monthOfYear)        != null ? f : super.monthOfYear();
            __CLR4_4_16dd6ddlc8azsqu.R.inc(8462);iYear               = (f = fields.year)               != null ? f : super.year();
            __CLR4_4_16dd6ddlc8azsqu.R.inc(8465);iYearOfEra          = (f = fields.yearOfEra)          != null ? f : super.yearOfEra();
            __CLR4_4_16dd6ddlc8azsqu.R.inc(8468);iYearOfCentury      = (f = fields.yearOfCentury)      != null ? f : super.yearOfCentury();
            __CLR4_4_16dd6ddlc8azsqu.R.inc(8471);iCenturyOfEra       = (f = fields.centuryOfEra)       != null ? f : super.centuryOfEra();
            __CLR4_4_16dd6ddlc8azsqu.R.inc(8474);iEra                = (f = fields.era)                != null ? f : super.era();
        }

        __CLR4_4_16dd6ddlc8azsqu.R.inc(8477);int flags;
        __CLR4_4_16dd6ddlc8azsqu.R.inc(8478);if ((((iBase == null)&&(__CLR4_4_16dd6ddlc8azsqu.R.iget(8479)!=0|true))||(__CLR4_4_16dd6ddlc8azsqu.R.iget(8480)==0&false))) {{
            __CLR4_4_16dd6ddlc8azsqu.R.inc(8481);flags = 0;
        } }else {{
            __CLR4_4_16dd6ddlc8azsqu.R.inc(8482);flags = 
                (((((iHourOfDay      == iBase.hourOfDay()      &&
                  iMinuteOfHour   == iBase.minuteOfHour()   &&
                  iSecondOfMinute == iBase.secondOfMinute() &&
                  iMillisOfSecond == iBase.millisOfSecond()   ) )&&(__CLR4_4_16dd6ddlc8azsqu.R.iget(8483)!=0|true))||(__CLR4_4_16dd6ddlc8azsqu.R.iget(8484)==0&false))? 1 : 0) |

                (((((iMillisOfDay == iBase.millisOfDay()) )&&(__CLR4_4_16dd6ddlc8azsqu.R.iget(8485)!=0|true))||(__CLR4_4_16dd6ddlc8azsqu.R.iget(8486)==0&false))? 2 : 0) |

                (((((iYear        == iBase.year()        &&
                  iMonthOfYear == iBase.monthOfYear() &&
                  iDayOfMonth  == iBase.dayOfMonth()    ) )&&(__CLR4_4_16dd6ddlc8azsqu.R.iget(8487)!=0|true))||(__CLR4_4_16dd6ddlc8azsqu.R.iget(8488)==0&false))? 4 : 0);
        }

        }__CLR4_4_16dd6ddlc8azsqu.R.inc(8489);iBaseFlags = flags;
    }finally{__CLR4_4_16dd6ddlc8azsqu.R.flushNeeded();}}

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {try{__CLR4_4_16dd6ddlc8azsqu.R.inc(8490);
        __CLR4_4_16dd6ddlc8azsqu.R.inc(8491);in.defaultReadObject();
        __CLR4_4_16dd6ddlc8azsqu.R.inc(8492);setFields();
    }finally{__CLR4_4_16dd6ddlc8azsqu.R.flushNeeded();}}

    /**
     * A container of fields used for assembling a chronology.
     */
    public static final class Fields {
        public DurationField millis;
        public DurationField seconds;
        public DurationField minutes;
        public DurationField hours;
        public DurationField halfdays;
    
        public DurationField days;
        public DurationField weeks;
        public DurationField weekyears;
        public DurationField months;
        public DurationField years;
        public DurationField centuries;
        public DurationField eras;
    
        public DateTimeField millisOfSecond;
        public DateTimeField millisOfDay;
        public DateTimeField secondOfMinute;
        public DateTimeField secondOfDay;
        public DateTimeField minuteOfHour;
        public DateTimeField minuteOfDay;
        public DateTimeField hourOfDay;
        public DateTimeField clockhourOfDay;
        public DateTimeField hourOfHalfday;
        public DateTimeField clockhourOfHalfday;
        public DateTimeField halfdayOfDay;
    
        public DateTimeField dayOfWeek;
        public DateTimeField dayOfMonth;
        public DateTimeField dayOfYear;
        public DateTimeField weekOfWeekyear;
        public DateTimeField weekyear;
        public DateTimeField weekyearOfCentury;
        public DateTimeField monthOfYear;
        public DateTimeField year;
        public DateTimeField yearOfEra;
        public DateTimeField yearOfCentury;
        public DateTimeField centuryOfEra;
        public DateTimeField era;

        Fields() {try{__CLR4_4_16dd6ddlc8azsqu.R.inc(8493);
        }finally{__CLR4_4_16dd6ddlc8azsqu.R.flushNeeded();}}

        /**
         * Copy the supported fields from a chronology into this container.
         */
        public void copyFieldsFrom(Chronology chrono) {try{__CLR4_4_16dd6ddlc8azsqu.R.inc(8494);
            {
                __CLR4_4_16dd6ddlc8azsqu.R.inc(8495);DurationField f;
                __CLR4_4_16dd6ddlc8azsqu.R.inc(8496);if (isSupported(f = chrono.millis())) {{
                    __CLR4_4_16dd6ddlc8azsqu.R.inc(8499);millis = f;
                }
                }__CLR4_4_16dd6ddlc8azsqu.R.inc(8500);if (isSupported(f = chrono.seconds())) {{
                    __CLR4_4_16dd6ddlc8azsqu.R.inc(8503);seconds = f;
                }
                }__CLR4_4_16dd6ddlc8azsqu.R.inc(8504);if (isSupported(f = chrono.minutes())) {{
                    __CLR4_4_16dd6ddlc8azsqu.R.inc(8507);minutes = f;
                }
                }__CLR4_4_16dd6ddlc8azsqu.R.inc(8508);if (isSupported(f = chrono.hours())) {{
                    __CLR4_4_16dd6ddlc8azsqu.R.inc(8511);hours = f;
                }
                }__CLR4_4_16dd6ddlc8azsqu.R.inc(8512);if (isSupported(f = chrono.halfdays())) {{
                    __CLR4_4_16dd6ddlc8azsqu.R.inc(8515);halfdays = f;
                }
                }__CLR4_4_16dd6ddlc8azsqu.R.inc(8516);if (isSupported(f = chrono.days())) {{
                    __CLR4_4_16dd6ddlc8azsqu.R.inc(8519);days = f;
                }
                }__CLR4_4_16dd6ddlc8azsqu.R.inc(8520);if (isSupported(f = chrono.weeks())) {{
                    __CLR4_4_16dd6ddlc8azsqu.R.inc(8523);weeks = f;
                }
                }__CLR4_4_16dd6ddlc8azsqu.R.inc(8524);if (isSupported(f = chrono.weekyears())) {{
                    __CLR4_4_16dd6ddlc8azsqu.R.inc(8527);weekyears = f;
                }
                }__CLR4_4_16dd6ddlc8azsqu.R.inc(8528);if (isSupported(f = chrono.months())) {{
                    __CLR4_4_16dd6ddlc8azsqu.R.inc(8531);months = f;
                }
                }__CLR4_4_16dd6ddlc8azsqu.R.inc(8532);if (isSupported(f = chrono.years())) {{
                    __CLR4_4_16dd6ddlc8azsqu.R.inc(8535);years = f;
                }
                }__CLR4_4_16dd6ddlc8azsqu.R.inc(8536);if (isSupported(f = chrono.centuries())) {{
                    __CLR4_4_16dd6ddlc8azsqu.R.inc(8539);centuries = f;
                }
                }__CLR4_4_16dd6ddlc8azsqu.R.inc(8540);if (isSupported(f = chrono.eras())) {{
                    __CLR4_4_16dd6ddlc8azsqu.R.inc(8543);eras = f;
                }
            }}

            {
                __CLR4_4_16dd6ddlc8azsqu.R.inc(8544);DateTimeField f;
                __CLR4_4_16dd6ddlc8azsqu.R.inc(8545);if (isSupported(f = chrono.millisOfSecond())) {{
                    __CLR4_4_16dd6ddlc8azsqu.R.inc(8548);millisOfSecond = f;
                }
                }__CLR4_4_16dd6ddlc8azsqu.R.inc(8549);if (isSupported(f = chrono.millisOfDay())) {{
                    __CLR4_4_16dd6ddlc8azsqu.R.inc(8552);millisOfDay = f;
                }
                }__CLR4_4_16dd6ddlc8azsqu.R.inc(8553);if (isSupported(f = chrono.secondOfMinute())) {{
                    __CLR4_4_16dd6ddlc8azsqu.R.inc(8556);secondOfMinute = f;
                }
                }__CLR4_4_16dd6ddlc8azsqu.R.inc(8557);if (isSupported(f = chrono.secondOfDay())) {{
                    __CLR4_4_16dd6ddlc8azsqu.R.inc(8560);secondOfDay = f;
                }
                }__CLR4_4_16dd6ddlc8azsqu.R.inc(8561);if (isSupported(f = chrono.minuteOfHour())) {{
                    __CLR4_4_16dd6ddlc8azsqu.R.inc(8564);minuteOfHour = f;
                }
                }__CLR4_4_16dd6ddlc8azsqu.R.inc(8565);if (isSupported(f = chrono.minuteOfDay())) {{
                    __CLR4_4_16dd6ddlc8azsqu.R.inc(8568);minuteOfDay = f;
                }
                }__CLR4_4_16dd6ddlc8azsqu.R.inc(8569);if (isSupported(f = chrono.hourOfDay())) {{
                    __CLR4_4_16dd6ddlc8azsqu.R.inc(8572);hourOfDay = f;
                }
                }__CLR4_4_16dd6ddlc8azsqu.R.inc(8573);if (isSupported(f = chrono.clockhourOfDay())) {{
                    __CLR4_4_16dd6ddlc8azsqu.R.inc(8576);clockhourOfDay = f;
                }
                }__CLR4_4_16dd6ddlc8azsqu.R.inc(8577);if (isSupported(f = chrono.hourOfHalfday())) {{
                    __CLR4_4_16dd6ddlc8azsqu.R.inc(8580);hourOfHalfday = f;
                }
                }__CLR4_4_16dd6ddlc8azsqu.R.inc(8581);if (isSupported(f = chrono.clockhourOfHalfday())) {{
                    __CLR4_4_16dd6ddlc8azsqu.R.inc(8584);clockhourOfHalfday = f;
                }
                }__CLR4_4_16dd6ddlc8azsqu.R.inc(8585);if (isSupported(f = chrono.halfdayOfDay())) {{
                    __CLR4_4_16dd6ddlc8azsqu.R.inc(8588);halfdayOfDay = f;
                }
                }__CLR4_4_16dd6ddlc8azsqu.R.inc(8589);if (isSupported(f = chrono.dayOfWeek())) {{
                    __CLR4_4_16dd6ddlc8azsqu.R.inc(8592);dayOfWeek = f;
                }
                }__CLR4_4_16dd6ddlc8azsqu.R.inc(8593);if (isSupported(f = chrono.dayOfMonth())) {{
                    __CLR4_4_16dd6ddlc8azsqu.R.inc(8596);dayOfMonth = f;
                }
                }__CLR4_4_16dd6ddlc8azsqu.R.inc(8597);if (isSupported(f = chrono.dayOfYear())) {{
                    __CLR4_4_16dd6ddlc8azsqu.R.inc(8600);dayOfYear = f;
                }
                }__CLR4_4_16dd6ddlc8azsqu.R.inc(8601);if (isSupported(f = chrono.weekOfWeekyear())) {{
                    __CLR4_4_16dd6ddlc8azsqu.R.inc(8604);weekOfWeekyear = f;
                }
                }__CLR4_4_16dd6ddlc8azsqu.R.inc(8605);if (isSupported(f = chrono.weekyear())) {{
                    __CLR4_4_16dd6ddlc8azsqu.R.inc(8608);weekyear = f;
                }
                }__CLR4_4_16dd6ddlc8azsqu.R.inc(8609);if (isSupported(f = chrono.weekyearOfCentury())) {{
                    __CLR4_4_16dd6ddlc8azsqu.R.inc(8612);weekyearOfCentury = f;
                }
                }__CLR4_4_16dd6ddlc8azsqu.R.inc(8613);if (isSupported(f = chrono.monthOfYear())) {{
                    __CLR4_4_16dd6ddlc8azsqu.R.inc(8616);monthOfYear = f;
                }
                }__CLR4_4_16dd6ddlc8azsqu.R.inc(8617);if (isSupported(f = chrono.year())) {{
                    __CLR4_4_16dd6ddlc8azsqu.R.inc(8620);year = f;
                }
                }__CLR4_4_16dd6ddlc8azsqu.R.inc(8621);if (isSupported(f = chrono.yearOfEra())) {{
                    __CLR4_4_16dd6ddlc8azsqu.R.inc(8624);yearOfEra = f;
                }
                }__CLR4_4_16dd6ddlc8azsqu.R.inc(8625);if (isSupported(f = chrono.yearOfCentury())) {{
                    __CLR4_4_16dd6ddlc8azsqu.R.inc(8628);yearOfCentury = f;
                }
                }__CLR4_4_16dd6ddlc8azsqu.R.inc(8629);if (isSupported(f = chrono.centuryOfEra())) {{
                    __CLR4_4_16dd6ddlc8azsqu.R.inc(8632);centuryOfEra = f;
                }
                }__CLR4_4_16dd6ddlc8azsqu.R.inc(8633);if (isSupported(f = chrono.era())) {{
                    __CLR4_4_16dd6ddlc8azsqu.R.inc(8636);era = f;
                }
            }}
        }finally{__CLR4_4_16dd6ddlc8azsqu.R.flushNeeded();}}

        private static boolean isSupported(DurationField field) {try{__CLR4_4_16dd6ddlc8azsqu.R.inc(8637);
            __CLR4_4_16dd6ddlc8azsqu.R.inc(8638);return (((field == null )&&(__CLR4_4_16dd6ddlc8azsqu.R.iget(8639)!=0|true))||(__CLR4_4_16dd6ddlc8azsqu.R.iget(8640)==0&false))? false : field.isSupported();
        }finally{__CLR4_4_16dd6ddlc8azsqu.R.flushNeeded();}}

        private static boolean isSupported(DateTimeField field) {try{__CLR4_4_16dd6ddlc8azsqu.R.inc(8641);
            __CLR4_4_16dd6ddlc8azsqu.R.inc(8642);return (((field == null )&&(__CLR4_4_16dd6ddlc8azsqu.R.iget(8643)!=0|true))||(__CLR4_4_16dd6ddlc8azsqu.R.iget(8644)==0&false))? false : field.isSupported();
        }finally{__CLR4_4_16dd6ddlc8azsqu.R.flushNeeded();}}
    }
}
