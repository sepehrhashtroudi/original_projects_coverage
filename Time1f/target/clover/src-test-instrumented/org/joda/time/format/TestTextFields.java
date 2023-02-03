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
package org.joda.time.format;

import java.util.Locale;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.MutableDateTime;
import org.joda.time.chrono.ISOChronology;

/**
 * Makes sure that text fields are correct for English.
 *
 * @author Brian S O'Neill
 */
public class TestTextFields extends TestCase {static class __CLR4_4_11c271c27lc8azxpy{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672271031490L,8589935092L,62366,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final DateTimeZone[] ZONES = {
        DateTimeZone.UTC,
        DateTimeZone.forID("Europe/Paris"),
        DateTimeZone.forID("Europe/London"),
        DateTimeZone.forID("Asia/Tokyo"),
        DateTimeZone.forID("America/Los_Angeles"),
    };

    private static final String[] MONTHS = {
        null,
        "January", "February", "March", "April", "May", "June",
        "July", "August", "September", "October", "November", "December"
    };

    private static final String[] WEEKDAYS = {
        null,
        "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"
    };

    private static final String[] HALFDAYS = {
        "AM", "PM"
    };

    private DateTimeZone originalDateTimeZone = null;
    private Locale originalLocale = null;

    public static void main(String[] args) {try{__CLR4_4_11c271c27lc8azxpy.R.inc(62287);
        __CLR4_4_11c271c27lc8azxpy.R.inc(62288);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_11c271c27lc8azxpy.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_11c271c27lc8azxpy.R.inc(62289);
        __CLR4_4_11c271c27lc8azxpy.R.inc(62290);return new TestSuite(TestTextFields.class);
    }finally{__CLR4_4_11c271c27lc8azxpy.R.flushNeeded();}}

    public TestTextFields(String name) {
        super(name);__CLR4_4_11c271c27lc8azxpy.R.inc(62292);try{__CLR4_4_11c271c27lc8azxpy.R.inc(62291);
    }finally{__CLR4_4_11c271c27lc8azxpy.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_11c271c27lc8azxpy.R.inc(62293);
        __CLR4_4_11c271c27lc8azxpy.R.inc(62294);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_11c271c27lc8azxpy.R.inc(62295);originalLocale = Locale.getDefault();
        __CLR4_4_11c271c27lc8azxpy.R.inc(62296);DateTimeZone.setDefault(ZONES[0]);
        __CLR4_4_11c271c27lc8azxpy.R.inc(62297);Locale.setDefault(Locale.ENGLISH);
    }finally{__CLR4_4_11c271c27lc8azxpy.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_11c271c27lc8azxpy.R.inc(62298);
        __CLR4_4_11c271c27lc8azxpy.R.inc(62299);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_11c271c27lc8azxpy.R.inc(62300);Locale.setDefault(originalLocale);
        __CLR4_4_11c271c27lc8azxpy.R.inc(62301);originalDateTimeZone = null;
        __CLR4_4_11c271c27lc8azxpy.R.inc(62302);originalLocale = null;
    }finally{__CLR4_4_11c271c27lc8azxpy.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testMonthNames_monthStart() {__CLR4_4_11c271c27lc8azxpy.R.globalSliceStart(getClass().getName(),62303);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1va8dym1c2n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11c271c27lc8azxpy.R.rethrow($CLV_t2$);}finally{__CLR4_4_11c271c27lc8azxpy.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestTextFields.testMonthNames_monthStart",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),62303,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1va8dym1c2n(){try{__CLR4_4_11c271c27lc8azxpy.R.inc(62303);
        __CLR4_4_11c271c27lc8azxpy.R.inc(62304);DateTimeFormatter printer = DateTimeFormat.forPattern("MMMM");
        __CLR4_4_11c271c27lc8azxpy.R.inc(62305);for (int i=0; (((i<ZONES.length)&&(__CLR4_4_11c271c27lc8azxpy.R.iget(62306)!=0|true))||(__CLR4_4_11c271c27lc8azxpy.R.iget(62307)==0&false)); i++) {{
            __CLR4_4_11c271c27lc8azxpy.R.inc(62308);for (int month=1; (((month<=12)&&(__CLR4_4_11c271c27lc8azxpy.R.iget(62309)!=0|true))||(__CLR4_4_11c271c27lc8azxpy.R.iget(62310)==0&false)); month++) {{
                __CLR4_4_11c271c27lc8azxpy.R.inc(62311);DateTime dt = new DateTime(2004, month, 1, 1, 20, 30, 40, ZONES[i]);
                __CLR4_4_11c271c27lc8azxpy.R.inc(62312);String monthText = printer.print(dt);
                __CLR4_4_11c271c27lc8azxpy.R.inc(62313);assertEquals(MONTHS[month], monthText);
            }
        }}
    }}finally{__CLR4_4_11c271c27lc8azxpy.R.flushNeeded();}}

    public void testMonthNames_monthMiddle() {__CLR4_4_11c271c27lc8azxpy.R.globalSliceStart(getClass().getName(),62314);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1msk4tl1c2y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11c271c27lc8azxpy.R.rethrow($CLV_t2$);}finally{__CLR4_4_11c271c27lc8azxpy.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestTextFields.testMonthNames_monthMiddle",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),62314,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1msk4tl1c2y(){try{__CLR4_4_11c271c27lc8azxpy.R.inc(62314);
        __CLR4_4_11c271c27lc8azxpy.R.inc(62315);DateTimeFormatter printer = DateTimeFormat.forPattern("MMMM");
        __CLR4_4_11c271c27lc8azxpy.R.inc(62316);for (int i=0; (((i<ZONES.length)&&(__CLR4_4_11c271c27lc8azxpy.R.iget(62317)!=0|true))||(__CLR4_4_11c271c27lc8azxpy.R.iget(62318)==0&false)); i++) {{
            __CLR4_4_11c271c27lc8azxpy.R.inc(62319);for (int month=1; (((month<=12)&&(__CLR4_4_11c271c27lc8azxpy.R.iget(62320)!=0|true))||(__CLR4_4_11c271c27lc8azxpy.R.iget(62321)==0&false)); month++) {{
                __CLR4_4_11c271c27lc8azxpy.R.inc(62322);DateTime dt = new DateTime(2004, month, 15, 12, 20, 30, 40, ZONES[i]);
                __CLR4_4_11c271c27lc8azxpy.R.inc(62323);String monthText = printer.print(dt);
                __CLR4_4_11c271c27lc8azxpy.R.inc(62324);assertEquals(MONTHS[month], monthText);
            }
        }}
    }}finally{__CLR4_4_11c271c27lc8azxpy.R.flushNeeded();}}

    public void testMonthNames_monthEnd() {__CLR4_4_11c271c27lc8azxpy.R.globalSliceStart(getClass().getName(),62325);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kghfax1c39();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11c271c27lc8azxpy.R.rethrow($CLV_t2$);}finally{__CLR4_4_11c271c27lc8azxpy.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestTextFields.testMonthNames_monthEnd",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),62325,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kghfax1c39(){try{__CLR4_4_11c271c27lc8azxpy.R.inc(62325);
        __CLR4_4_11c271c27lc8azxpy.R.inc(62326);DateTimeFormatter printer = DateTimeFormat.forPattern("MMMM");
        __CLR4_4_11c271c27lc8azxpy.R.inc(62327);for (int i=0; (((i<ZONES.length)&&(__CLR4_4_11c271c27lc8azxpy.R.iget(62328)!=0|true))||(__CLR4_4_11c271c27lc8azxpy.R.iget(62329)==0&false)); i++) {{
            __CLR4_4_11c271c27lc8azxpy.R.inc(62330);Chronology chrono = ISOChronology.getInstance(ZONES[i]);
            __CLR4_4_11c271c27lc8azxpy.R.inc(62331);for (int month=1; (((month<=12)&&(__CLR4_4_11c271c27lc8azxpy.R.iget(62332)!=0|true))||(__CLR4_4_11c271c27lc8azxpy.R.iget(62333)==0&false)); month++) {{
                __CLR4_4_11c271c27lc8azxpy.R.inc(62334);DateTime dt = new DateTime(2004, month, 1, 23, 20, 30, 40, chrono);
                __CLR4_4_11c271c27lc8azxpy.R.inc(62335);int lastDay = chrono.dayOfMonth().getMaximumValue(dt.getMillis());
                __CLR4_4_11c271c27lc8azxpy.R.inc(62336);dt = new DateTime(2004, month, lastDay, 23, 20, 30, 40, chrono);
                __CLR4_4_11c271c27lc8azxpy.R.inc(62337);String monthText = printer.print(dt);
                __CLR4_4_11c271c27lc8azxpy.R.inc(62338);assertEquals(MONTHS[month], monthText);
            }
        }}
    }}finally{__CLR4_4_11c271c27lc8azxpy.R.flushNeeded();}}

    public void testWeekdayNames() {__CLR4_4_11c271c27lc8azxpy.R.globalSliceStart(getClass().getName(),62339);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f6cjp51c3n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11c271c27lc8azxpy.R.rethrow($CLV_t2$);}finally{__CLR4_4_11c271c27lc8azxpy.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestTextFields.testWeekdayNames",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),62339,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f6cjp51c3n(){try{__CLR4_4_11c271c27lc8azxpy.R.inc(62339);
        __CLR4_4_11c271c27lc8azxpy.R.inc(62340);DateTimeFormatter printer = DateTimeFormat.forPattern("EEEE");
        __CLR4_4_11c271c27lc8azxpy.R.inc(62341);for (int i=0; (((i<ZONES.length)&&(__CLR4_4_11c271c27lc8azxpy.R.iget(62342)!=0|true))||(__CLR4_4_11c271c27lc8azxpy.R.iget(62343)==0&false)); i++) {{
            __CLR4_4_11c271c27lc8azxpy.R.inc(62344);MutableDateTime mdt = new MutableDateTime(2004, 1, 1, 1, 20, 30, 40, ZONES[i]);
            __CLR4_4_11c271c27lc8azxpy.R.inc(62345);for (int day=1; (((day<=366)&&(__CLR4_4_11c271c27lc8azxpy.R.iget(62346)!=0|true))||(__CLR4_4_11c271c27lc8azxpy.R.iget(62347)==0&false)); day++) {{
                __CLR4_4_11c271c27lc8azxpy.R.inc(62348);mdt.setDayOfYear(day);
                __CLR4_4_11c271c27lc8azxpy.R.inc(62349);int weekday = mdt.getDayOfWeek();
                __CLR4_4_11c271c27lc8azxpy.R.inc(62350);String weekdayText = printer.print(mdt);
                __CLR4_4_11c271c27lc8azxpy.R.inc(62351);assertEquals(WEEKDAYS[weekday], weekdayText);
            }
        }}
    }}finally{__CLR4_4_11c271c27lc8azxpy.R.flushNeeded();}}

    public void testHalfdayNames() {__CLR4_4_11c271c27lc8azxpy.R.globalSliceStart(getClass().getName(),62352);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f5lpew1c40();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11c271c27lc8azxpy.R.rethrow($CLV_t2$);}finally{__CLR4_4_11c271c27lc8azxpy.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestTextFields.testHalfdayNames",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),62352,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f5lpew1c40(){try{__CLR4_4_11c271c27lc8azxpy.R.inc(62352);
        __CLR4_4_11c271c27lc8azxpy.R.inc(62353);DateTimeFormatter printer = DateTimeFormat.forPattern("a");
        __CLR4_4_11c271c27lc8azxpy.R.inc(62354);for (int i=0; (((i<ZONES.length)&&(__CLR4_4_11c271c27lc8azxpy.R.iget(62355)!=0|true))||(__CLR4_4_11c271c27lc8azxpy.R.iget(62356)==0&false)); i++) {{
            __CLR4_4_11c271c27lc8azxpy.R.inc(62357);Chronology chrono = ISOChronology.getInstance(ZONES[i]);
            __CLR4_4_11c271c27lc8azxpy.R.inc(62358);MutableDateTime mdt = new MutableDateTime(2004, 5, 30, 0, 20, 30, 40, chrono);
            __CLR4_4_11c271c27lc8azxpy.R.inc(62359);for (int hour=0; (((hour<24)&&(__CLR4_4_11c271c27lc8azxpy.R.iget(62360)!=0|true))||(__CLR4_4_11c271c27lc8azxpy.R.iget(62361)==0&false)); hour++) {{
                __CLR4_4_11c271c27lc8azxpy.R.inc(62362);mdt.setHourOfDay(hour);
                __CLR4_4_11c271c27lc8azxpy.R.inc(62363);int halfday = mdt.get(chrono.halfdayOfDay());
                __CLR4_4_11c271c27lc8azxpy.R.inc(62364);String halfdayText = printer.print(mdt);
                __CLR4_4_11c271c27lc8azxpy.R.inc(62365);assertEquals(HALFDAYS[halfday], halfdayText);
            }
        }}
    }}finally{__CLR4_4_11c271c27lc8azxpy.R.flushNeeded();}}
}
