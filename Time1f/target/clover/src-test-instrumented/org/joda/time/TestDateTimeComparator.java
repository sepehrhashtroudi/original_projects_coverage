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
package org.joda.time;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.chrono.ISOChronology;
/**
 * This class is a Junit unit test for the
 * org.joda.time.DateTimeComparator class.
 *
 * @author Guy Allard
 */
public class TestDateTimeComparator extends TestCase {static class __CLR4_4_1i46i46lc8azu9l{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672271031490L,8589935092L,23926,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final Chronology ISO = ISOChronology.getInstance();
    
    public static void main(String[] args) {try{__CLR4_4_1i46i46lc8azu9l.R.inc(23478);
        __CLR4_4_1i46i46lc8azu9l.R.inc(23479);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1i46i46lc8azu9l.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1i46i46lc8azu9l.R.inc(23480);
        __CLR4_4_1i46i46lc8azu9l.R.inc(23481);return new TestSuite(TestDateTimeComparator.class);
    }finally{__CLR4_4_1i46i46lc8azu9l.R.flushNeeded();}}

    public TestDateTimeComparator(String name) {
        super(name);__CLR4_4_1i46i46lc8azu9l.R.inc(23483);try{__CLR4_4_1i46i46lc8azu9l.R.inc(23482);
    }finally{__CLR4_4_1i46i46lc8azu9l.R.flushNeeded();}}

    /**
     * A reference to a DateTime object.
     */
    DateTime aDateTime = null;
    /**
     * A reference to a DateTime object.
     */
    DateTime bDateTime = null;
    /**
     * A reference to a DateTimeComparator object
     * (a Comparator) for millis of seconds.
     */
    Comparator cMillis = null;
    /**
     * A reference to a DateTimeComparator object
     * (a Comparator) for seconds.
     */
    Comparator cSecond = null;
    /**
     * A reference to a DateTimeComparator object
     * (a Comparator) for minutes.
     */
    Comparator cMinute = null;
    /**
     * A reference to a DateTimeComparator object
     * (a Comparator) for hours.
     */
    Comparator cHour = null;
    /**
     * A reference to a DateTimeComparator object
     * (a Comparator) for day of the week.
     */
    Comparator cDayOfWeek = null;
    /**
     * A reference to a DateTimeComparator object
     * (a Comparator) for day of the month.
     */
    Comparator cDayOfMonth = null;
    /**
     * A reference to a DateTimeComparator object
     * (a Comparator) for day of the year.
     */
    Comparator cDayOfYear = null;
    /**
     * A reference to a DateTimeComparator object
     * (a Comparator) for week of the weekyear.
     */
    Comparator cWeekOfWeekyear = null;
    /**
     * A reference to a DateTimeComparator object
     * (a Comparator) for year given a week of the year.
     */
    Comparator cWeekyear = null;
    /**
     * A reference to a DateTimeComparator object
     * (a Comparator) for months.
     */
    Comparator cMonth = null;
    /**
     * A reference to a DateTimeComparator object
     * (a Comparator) for year.
     */
    Comparator cYear = null;
    /**
     * A reference to a DateTimeComparator object
     * (a Comparator) for the date portion of an
     * object.
     */
    Comparator cDate = null;
    /**
     * A reference to a DateTimeComparator object
     * (a Comparator) for the time portion of an
     * object.
     */
    Comparator cTime = null;
    /**
     * Junit <code>setUp()</code> method.
     */
    public void setUp() /* throws Exception */ {try{__CLR4_4_1i46i46lc8azu9l.R.inc(23484);
        __CLR4_4_1i46i46lc8azu9l.R.inc(23485);Chronology chrono = ISOChronology.getInstanceUTC();

        // super.setUp();
        // Obtain comparator's
        __CLR4_4_1i46i46lc8azu9l.R.inc(23486);cMillis = DateTimeComparator.getInstance(null, DateTimeFieldType.secondOfMinute());
        __CLR4_4_1i46i46lc8azu9l.R.inc(23487);cSecond = DateTimeComparator.getInstance(DateTimeFieldType.secondOfMinute(), DateTimeFieldType.minuteOfHour());
        __CLR4_4_1i46i46lc8azu9l.R.inc(23488);cMinute = DateTimeComparator.getInstance(DateTimeFieldType.minuteOfHour(), DateTimeFieldType.hourOfDay());
        __CLR4_4_1i46i46lc8azu9l.R.inc(23489);cHour = DateTimeComparator.getInstance(DateTimeFieldType.hourOfDay(), DateTimeFieldType.dayOfYear());
        __CLR4_4_1i46i46lc8azu9l.R.inc(23490);cDayOfWeek = DateTimeComparator.getInstance(DateTimeFieldType.dayOfWeek(), DateTimeFieldType.weekOfWeekyear());
        __CLR4_4_1i46i46lc8azu9l.R.inc(23491);cDayOfMonth = DateTimeComparator.getInstance(DateTimeFieldType.dayOfMonth(), DateTimeFieldType.monthOfYear());
        __CLR4_4_1i46i46lc8azu9l.R.inc(23492);cDayOfYear = DateTimeComparator.getInstance(DateTimeFieldType.dayOfYear(), DateTimeFieldType.year());
        __CLR4_4_1i46i46lc8azu9l.R.inc(23493);cWeekOfWeekyear = DateTimeComparator.getInstance(DateTimeFieldType.weekOfWeekyear(), DateTimeFieldType.weekyear());
        __CLR4_4_1i46i46lc8azu9l.R.inc(23494);cWeekyear = DateTimeComparator.getInstance(DateTimeFieldType.weekyear());
        __CLR4_4_1i46i46lc8azu9l.R.inc(23495);cMonth = DateTimeComparator.getInstance(DateTimeFieldType.monthOfYear(), DateTimeFieldType.year());
        __CLR4_4_1i46i46lc8azu9l.R.inc(23496);cYear = DateTimeComparator.getInstance(DateTimeFieldType.year());
        __CLR4_4_1i46i46lc8azu9l.R.inc(23497);cDate = DateTimeComparator.getDateOnlyInstance();
        __CLR4_4_1i46i46lc8azu9l.R.inc(23498);cTime = DateTimeComparator.getTimeOnlyInstance();
    }finally{__CLR4_4_1i46i46lc8azu9l.R.flushNeeded();}}

    /**
     * Junit <code>tearDown()</code> method.
     */
    protected void tearDown() /* throws Exception */ {try{__CLR4_4_1i46i46lc8azu9l.R.inc(23499);
        // super.tearDown();
        __CLR4_4_1i46i46lc8azu9l.R.inc(23500);aDateTime = null;
        __CLR4_4_1i46i46lc8azu9l.R.inc(23501);bDateTime = null;
        //
        __CLR4_4_1i46i46lc8azu9l.R.inc(23502);cMillis = null;
        __CLR4_4_1i46i46lc8azu9l.R.inc(23503);cSecond = null;
        __CLR4_4_1i46i46lc8azu9l.R.inc(23504);cMinute = null;
        __CLR4_4_1i46i46lc8azu9l.R.inc(23505);cHour = null;
        __CLR4_4_1i46i46lc8azu9l.R.inc(23506);cDayOfWeek = null;
        __CLR4_4_1i46i46lc8azu9l.R.inc(23507);cDayOfMonth = null;
        __CLR4_4_1i46i46lc8azu9l.R.inc(23508);cDayOfYear = null;
        __CLR4_4_1i46i46lc8azu9l.R.inc(23509);cWeekOfWeekyear = null;
        __CLR4_4_1i46i46lc8azu9l.R.inc(23510);cWeekyear = null;
        __CLR4_4_1i46i46lc8azu9l.R.inc(23511);cMonth = null;
        __CLR4_4_1i46i46lc8azu9l.R.inc(23512);cYear = null;
        __CLR4_4_1i46i46lc8azu9l.R.inc(23513);cDate = null;
        __CLR4_4_1i46i46lc8azu9l.R.inc(23514);cTime = null;
    }finally{__CLR4_4_1i46i46lc8azu9l.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testClass() {__CLR4_4_1i46i46lc8azu9l.R.globalSliceStart(getClass().getName(),23515);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11x2ulvi57();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i46i46lc8azu9l.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i46i46lc8azu9l.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeComparator.testClass",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23515,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11x2ulvi57(){try{__CLR4_4_1i46i46lc8azu9l.R.inc(23515);
        __CLR4_4_1i46i46lc8azu9l.R.inc(23516);assertEquals(true, Modifier.isPublic(DateTimeComparator.class.getModifiers()));
        __CLR4_4_1i46i46lc8azu9l.R.inc(23517);assertEquals(false, Modifier.isFinal(DateTimeComparator.class.getModifiers()));
        __CLR4_4_1i46i46lc8azu9l.R.inc(23518);assertEquals(1, DateTimeComparator.class.getDeclaredConstructors().length);
        __CLR4_4_1i46i46lc8azu9l.R.inc(23519);assertEquals(true, Modifier.isProtected(DateTimeComparator.class.getDeclaredConstructors()[0].getModifiers()));
    }finally{__CLR4_4_1i46i46lc8azu9l.R.flushNeeded();}}
    
    //-----------------------------------------------------------------------
    public void testStaticGetInstance() {__CLR4_4_1i46i46lc8azu9l.R.globalSliceStart(getClass().getName(),23520);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13v2xpui5c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i46i46lc8azu9l.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i46i46lc8azu9l.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeComparator.testStaticGetInstance",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23520,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13v2xpui5c(){try{__CLR4_4_1i46i46lc8azu9l.R.inc(23520);
        __CLR4_4_1i46i46lc8azu9l.R.inc(23521);DateTimeComparator c = DateTimeComparator.getInstance();
        __CLR4_4_1i46i46lc8azu9l.R.inc(23522);assertEquals(null, c.getLowerLimit());
        __CLR4_4_1i46i46lc8azu9l.R.inc(23523);assertEquals(null, c.getUpperLimit());
        __CLR4_4_1i46i46lc8azu9l.R.inc(23524);assertEquals("DateTimeComparator[]", c.toString());
    }finally{__CLR4_4_1i46i46lc8azu9l.R.flushNeeded();}}        
    public void testStaticGetDateOnlyInstance() {__CLR4_4_1i46i46lc8azu9l.R.globalSliceStart(getClass().getName(),23525);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vhl7d8i5h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i46i46lc8azu9l.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i46i46lc8azu9l.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeComparator.testStaticGetDateOnlyInstance",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23525,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vhl7d8i5h(){try{__CLR4_4_1i46i46lc8azu9l.R.inc(23525);
        __CLR4_4_1i46i46lc8azu9l.R.inc(23526);DateTimeComparator c = DateTimeComparator.getDateOnlyInstance();
        __CLR4_4_1i46i46lc8azu9l.R.inc(23527);assertEquals(DateTimeFieldType.dayOfYear(), c.getLowerLimit());
        __CLR4_4_1i46i46lc8azu9l.R.inc(23528);assertEquals(null, c.getUpperLimit());
        __CLR4_4_1i46i46lc8azu9l.R.inc(23529);assertEquals("DateTimeComparator[dayOfYear-]", c.toString());
        
        __CLR4_4_1i46i46lc8azu9l.R.inc(23530);assertSame(DateTimeComparator.getDateOnlyInstance(), DateTimeComparator.getDateOnlyInstance());
    }finally{__CLR4_4_1i46i46lc8azu9l.R.flushNeeded();}}
    public void testStaticGetTimeOnlyInstance() {__CLR4_4_1i46i46lc8azu9l.R.globalSliceStart(getClass().getName(),23531);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nssea3i5n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i46i46lc8azu9l.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i46i46lc8azu9l.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeComparator.testStaticGetTimeOnlyInstance",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23531,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nssea3i5n(){try{__CLR4_4_1i46i46lc8azu9l.R.inc(23531);
        __CLR4_4_1i46i46lc8azu9l.R.inc(23532);DateTimeComparator c = DateTimeComparator.getTimeOnlyInstance();
        __CLR4_4_1i46i46lc8azu9l.R.inc(23533);assertEquals(null, c.getLowerLimit());
        __CLR4_4_1i46i46lc8azu9l.R.inc(23534);assertEquals(DateTimeFieldType.dayOfYear(), c.getUpperLimit());
        __CLR4_4_1i46i46lc8azu9l.R.inc(23535);assertEquals("DateTimeComparator[-dayOfYear]", c.toString());
        
        __CLR4_4_1i46i46lc8azu9l.R.inc(23536);assertSame(DateTimeComparator.getTimeOnlyInstance(), DateTimeComparator.getTimeOnlyInstance());
    }finally{__CLR4_4_1i46i46lc8azu9l.R.flushNeeded();}}
    public void testStaticGetInstanceLower() {__CLR4_4_1i46i46lc8azu9l.R.globalSliceStart(getClass().getName(),23537);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11rcsn1i5t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i46i46lc8azu9l.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i46i46lc8azu9l.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeComparator.testStaticGetInstanceLower",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23537,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11rcsn1i5t(){try{__CLR4_4_1i46i46lc8azu9l.R.inc(23537);
        __CLR4_4_1i46i46lc8azu9l.R.inc(23538);DateTimeComparator c = DateTimeComparator.getInstance(DateTimeFieldType.hourOfDay());
        __CLR4_4_1i46i46lc8azu9l.R.inc(23539);assertEquals(DateTimeFieldType.hourOfDay(), c.getLowerLimit());
        __CLR4_4_1i46i46lc8azu9l.R.inc(23540);assertEquals(null, c.getUpperLimit());
        __CLR4_4_1i46i46lc8azu9l.R.inc(23541);assertEquals("DateTimeComparator[hourOfDay-]", c.toString());
        
        __CLR4_4_1i46i46lc8azu9l.R.inc(23542);c = DateTimeComparator.getInstance(null);
        __CLR4_4_1i46i46lc8azu9l.R.inc(23543);assertSame(DateTimeComparator.getInstance(), c);
    }finally{__CLR4_4_1i46i46lc8azu9l.R.flushNeeded();}}
    public void testStaticGetInstanceLowerUpper() {__CLR4_4_1i46i46lc8azu9l.R.globalSliceStart(getClass().getName(),23544);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1as60z1i60();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i46i46lc8azu9l.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i46i46lc8azu9l.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeComparator.testStaticGetInstanceLowerUpper",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23544,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1as60z1i60(){try{__CLR4_4_1i46i46lc8azu9l.R.inc(23544);
        __CLR4_4_1i46i46lc8azu9l.R.inc(23545);DateTimeComparator c = DateTimeComparator.getInstance(DateTimeFieldType.hourOfDay(), DateTimeFieldType.dayOfYear());
        __CLR4_4_1i46i46lc8azu9l.R.inc(23546);assertEquals(DateTimeFieldType.hourOfDay(), c.getLowerLimit());
        __CLR4_4_1i46i46lc8azu9l.R.inc(23547);assertEquals(DateTimeFieldType.dayOfYear(), c.getUpperLimit());
        __CLR4_4_1i46i46lc8azu9l.R.inc(23548);assertEquals("DateTimeComparator[hourOfDay-dayOfYear]", c.toString());
        
        __CLR4_4_1i46i46lc8azu9l.R.inc(23549);c = DateTimeComparator.getInstance(DateTimeFieldType.hourOfDay(), DateTimeFieldType.hourOfDay());
        __CLR4_4_1i46i46lc8azu9l.R.inc(23550);assertEquals(DateTimeFieldType.hourOfDay(), c.getLowerLimit());
        __CLR4_4_1i46i46lc8azu9l.R.inc(23551);assertEquals(DateTimeFieldType.hourOfDay(), c.getUpperLimit());
        __CLR4_4_1i46i46lc8azu9l.R.inc(23552);assertEquals("DateTimeComparator[hourOfDay]", c.toString());
        
        __CLR4_4_1i46i46lc8azu9l.R.inc(23553);c = DateTimeComparator.getInstance(null, null);
        __CLR4_4_1i46i46lc8azu9l.R.inc(23554);assertSame(DateTimeComparator.getInstance(), c);
        
        __CLR4_4_1i46i46lc8azu9l.R.inc(23555);c = DateTimeComparator.getInstance(DateTimeFieldType.dayOfYear(), null);
        __CLR4_4_1i46i46lc8azu9l.R.inc(23556);assertSame(DateTimeComparator.getDateOnlyInstance(), c);
        
        __CLR4_4_1i46i46lc8azu9l.R.inc(23557);c = DateTimeComparator.getInstance(null, DateTimeFieldType.dayOfYear());
        __CLR4_4_1i46i46lc8azu9l.R.inc(23558);assertSame(DateTimeComparator.getTimeOnlyInstance(), c);
    }finally{__CLR4_4_1i46i46lc8azu9l.R.flushNeeded();}}
    
    //-----------------------------------------------------------------------
    public void testEqualsHashCode() {__CLR4_4_1i46i46lc8azu9l.R.globalSliceStart(getClass().getName(),23559);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q5in77i6f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i46i46lc8azu9l.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i46i46lc8azu9l.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeComparator.testEqualsHashCode",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23559,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q5in77i6f(){try{__CLR4_4_1i46i46lc8azu9l.R.inc(23559);
        __CLR4_4_1i46i46lc8azu9l.R.inc(23560);DateTimeComparator c1 = DateTimeComparator.getInstance();
        __CLR4_4_1i46i46lc8azu9l.R.inc(23561);assertEquals(true, c1.equals(c1));
        __CLR4_4_1i46i46lc8azu9l.R.inc(23562);assertEquals(false, c1.equals(null));
        __CLR4_4_1i46i46lc8azu9l.R.inc(23563);assertEquals(true, c1.hashCode() == c1.hashCode());
        
        __CLR4_4_1i46i46lc8azu9l.R.inc(23564);DateTimeComparator c2 = DateTimeComparator.getTimeOnlyInstance();
        __CLR4_4_1i46i46lc8azu9l.R.inc(23565);assertEquals(true, c2.equals(c2));
        __CLR4_4_1i46i46lc8azu9l.R.inc(23566);assertEquals(false, c2.equals(c1));
        __CLR4_4_1i46i46lc8azu9l.R.inc(23567);assertEquals(false, c1.equals(c2));
        __CLR4_4_1i46i46lc8azu9l.R.inc(23568);assertEquals(false, c2.equals(null));
        __CLR4_4_1i46i46lc8azu9l.R.inc(23569);assertEquals(false, c1.hashCode() == c2.hashCode());
        
        __CLR4_4_1i46i46lc8azu9l.R.inc(23570);DateTimeComparator c3 = DateTimeComparator.getTimeOnlyInstance();
        __CLR4_4_1i46i46lc8azu9l.R.inc(23571);assertEquals(true, c3.equals(c3));
        __CLR4_4_1i46i46lc8azu9l.R.inc(23572);assertEquals(false, c3.equals(c1));
        __CLR4_4_1i46i46lc8azu9l.R.inc(23573);assertEquals(true, c3.equals(c2));
        __CLR4_4_1i46i46lc8azu9l.R.inc(23574);assertEquals(false, c1.equals(c3));
        __CLR4_4_1i46i46lc8azu9l.R.inc(23575);assertEquals(true, c2.equals(c3));
        __CLR4_4_1i46i46lc8azu9l.R.inc(23576);assertEquals(false, c1.hashCode() == c3.hashCode());
        __CLR4_4_1i46i46lc8azu9l.R.inc(23577);assertEquals(true, c2.hashCode() == c3.hashCode());
        
        __CLR4_4_1i46i46lc8azu9l.R.inc(23578);DateTimeComparator c4 = DateTimeComparator.getDateOnlyInstance();
        __CLR4_4_1i46i46lc8azu9l.R.inc(23579);assertEquals(false, c4.hashCode() == c3.hashCode());
    }finally{__CLR4_4_1i46i46lc8azu9l.R.flushNeeded();}}
    
    //-----------------------------------------------------------------------
    public void testSerialization1() throws Exception {__CLR4_4_1i46i46lc8azu9l.R.globalSliceStart(getClass().getName(),23580);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vfkbx6i70();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i46i46lc8azu9l.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i46i46lc8azu9l.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeComparator.testSerialization1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23580,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vfkbx6i70() throws Exception{try{__CLR4_4_1i46i46lc8azu9l.R.inc(23580);
        __CLR4_4_1i46i46lc8azu9l.R.inc(23581);DateTimeField f = ISO.dayOfYear();
        __CLR4_4_1i46i46lc8azu9l.R.inc(23582);f.toString();
        __CLR4_4_1i46i46lc8azu9l.R.inc(23583);DateTimeComparator c = DateTimeComparator.getInstance(DateTimeFieldType.hourOfDay(), DateTimeFieldType.dayOfYear());
        
        __CLR4_4_1i46i46lc8azu9l.R.inc(23584);ByteArrayOutputStream baos = new ByteArrayOutputStream();
        __CLR4_4_1i46i46lc8azu9l.R.inc(23585);ObjectOutputStream oos = new ObjectOutputStream(baos);
        __CLR4_4_1i46i46lc8azu9l.R.inc(23586);oos.writeObject(c);
        __CLR4_4_1i46i46lc8azu9l.R.inc(23587);byte[] bytes = baos.toByteArray();
        __CLR4_4_1i46i46lc8azu9l.R.inc(23588);oos.close();
        
        __CLR4_4_1i46i46lc8azu9l.R.inc(23589);ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        __CLR4_4_1i46i46lc8azu9l.R.inc(23590);ObjectInputStream ois = new ObjectInputStream(bais);
        __CLR4_4_1i46i46lc8azu9l.R.inc(23591);DateTimeComparator result = (DateTimeComparator) ois.readObject();
        __CLR4_4_1i46i46lc8azu9l.R.inc(23592);ois.close();
        
        __CLR4_4_1i46i46lc8azu9l.R.inc(23593);assertEquals(c, result);
    }finally{__CLR4_4_1i46i46lc8azu9l.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testSerialization2() throws Exception {__CLR4_4_1i46i46lc8azu9l.R.globalSliceStart(getClass().getName(),23594);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yokapni7e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i46i46lc8azu9l.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i46i46lc8azu9l.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeComparator.testSerialization2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23594,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yokapni7e() throws Exception{try{__CLR4_4_1i46i46lc8azu9l.R.inc(23594);
        __CLR4_4_1i46i46lc8azu9l.R.inc(23595);DateTimeComparator c = DateTimeComparator.getInstance();
        
        __CLR4_4_1i46i46lc8azu9l.R.inc(23596);ByteArrayOutputStream baos = new ByteArrayOutputStream();
        __CLR4_4_1i46i46lc8azu9l.R.inc(23597);ObjectOutputStream oos = new ObjectOutputStream(baos);
        __CLR4_4_1i46i46lc8azu9l.R.inc(23598);oos.writeObject(c);
        __CLR4_4_1i46i46lc8azu9l.R.inc(23599);byte[] bytes = baos.toByteArray();
        __CLR4_4_1i46i46lc8azu9l.R.inc(23600);oos.close();
        
        __CLR4_4_1i46i46lc8azu9l.R.inc(23601);ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        __CLR4_4_1i46i46lc8azu9l.R.inc(23602);ObjectInputStream ois = new ObjectInputStream(bais);
        __CLR4_4_1i46i46lc8azu9l.R.inc(23603);DateTimeComparator result = (DateTimeComparator) ois.readObject();
        __CLR4_4_1i46i46lc8azu9l.R.inc(23604);ois.close();
        
        __CLR4_4_1i46i46lc8azu9l.R.inc(23605);assertSame(c, result);
    }finally{__CLR4_4_1i46i46lc8azu9l.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Test all basic comparator operation with DateTime objects.
     */
    public void testBasicComps1() {__CLR4_4_1i46i46lc8azu9l.R.globalSliceStart(getClass().getName(),23606);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lxsdbki7q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i46i46lc8azu9l.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i46i46lc8azu9l.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeComparator.testBasicComps1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23606,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lxsdbki7q(){try{__CLR4_4_1i46i46lc8azu9l.R.inc(23606);
        __CLR4_4_1i46i46lc8azu9l.R.inc(23607);aDateTime = new DateTime( System.currentTimeMillis(), DateTimeZone.UTC );
        __CLR4_4_1i46i46lc8azu9l.R.inc(23608);bDateTime = new DateTime( aDateTime.getMillis(), DateTimeZone.UTC );
        __CLR4_4_1i46i46lc8azu9l.R.inc(23609);assertEquals( "getMillis", aDateTime.getMillis(),
            bDateTime.getMillis() );
        __CLR4_4_1i46i46lc8azu9l.R.inc(23610);assertEquals( "MILLIS", 0, cMillis.compare( aDateTime, bDateTime ) );
        __CLR4_4_1i46i46lc8azu9l.R.inc(23611);assertEquals( "SECOND", 0, cSecond.compare( aDateTime, bDateTime ) );
        __CLR4_4_1i46i46lc8azu9l.R.inc(23612);assertEquals( "MINUTE", 0, cMinute.compare( aDateTime, bDateTime ) );
        __CLR4_4_1i46i46lc8azu9l.R.inc(23613);assertEquals( "HOUR", 0, cHour.compare( aDateTime, bDateTime ) );
        __CLR4_4_1i46i46lc8azu9l.R.inc(23614);assertEquals( "DOW", 0, cDayOfWeek.compare( aDateTime, bDateTime ) );
        __CLR4_4_1i46i46lc8azu9l.R.inc(23615);assertEquals( "DOM", 0, cDayOfMonth.compare( aDateTime, bDateTime ) );
        __CLR4_4_1i46i46lc8azu9l.R.inc(23616);assertEquals( "DOY", 0, cDayOfYear.compare( aDateTime, bDateTime ) );
        __CLR4_4_1i46i46lc8azu9l.R.inc(23617);assertEquals( "WOW", 0, cWeekOfWeekyear.compare( aDateTime, bDateTime ) );
        __CLR4_4_1i46i46lc8azu9l.R.inc(23618);assertEquals( "WY", 0, cWeekyear.compare( aDateTime, bDateTime ) );
        __CLR4_4_1i46i46lc8azu9l.R.inc(23619);assertEquals( "MONTH", 0, cMonth.compare( aDateTime, bDateTime ) );
        __CLR4_4_1i46i46lc8azu9l.R.inc(23620);assertEquals( "YEAR", 0, cYear.compare( aDateTime, bDateTime ) );
        __CLR4_4_1i46i46lc8azu9l.R.inc(23621);assertEquals( "DATE", 0, cDate.compare( aDateTime, bDateTime ) );
        __CLR4_4_1i46i46lc8azu9l.R.inc(23622);assertEquals( "TIME", 0, cTime.compare( aDateTime, bDateTime ) );
    }finally{__CLR4_4_1i46i46lc8azu9l.R.flushNeeded();}}   // end of testBasicComps


    /**
     * Test all basic comparator operation with ReadableInstant objects.
     */
    public void testBasicComps2() {__CLR4_4_1i46i46lc8azu9l.R.globalSliceStart(getClass().getName(),23623);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1p6sc41i87();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i46i46lc8azu9l.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i46i46lc8azu9l.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeComparator.testBasicComps2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23623,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1p6sc41i87(){try{__CLR4_4_1i46i46lc8azu9l.R.inc(23623);
        __CLR4_4_1i46i46lc8azu9l.R.inc(23624);ReadableInstant aDateTime = new DateTime( System.currentTimeMillis(), DateTimeZone.UTC );
        __CLR4_4_1i46i46lc8azu9l.R.inc(23625);ReadableInstant bDateTime = new DateTime( aDateTime.getMillis(), DateTimeZone.UTC );
        __CLR4_4_1i46i46lc8azu9l.R.inc(23626);assertEquals( "getMillis", aDateTime.getMillis(),
            bDateTime.getMillis() );
        __CLR4_4_1i46i46lc8azu9l.R.inc(23627);assertEquals( "MILLIS", 0, cMillis.compare( aDateTime, bDateTime ) );
        __CLR4_4_1i46i46lc8azu9l.R.inc(23628);assertEquals( "SECOND", 0, cSecond.compare( aDateTime, bDateTime ) );
        __CLR4_4_1i46i46lc8azu9l.R.inc(23629);assertEquals( "MINUTE", 0, cMinute.compare( aDateTime, bDateTime ) );
        __CLR4_4_1i46i46lc8azu9l.R.inc(23630);assertEquals( "HOUR", 0, cHour.compare( aDateTime, bDateTime ) );
        __CLR4_4_1i46i46lc8azu9l.R.inc(23631);assertEquals( "DOW", 0, cDayOfWeek.compare( aDateTime, bDateTime ) );
        __CLR4_4_1i46i46lc8azu9l.R.inc(23632);assertEquals( "DOM", 0, cDayOfMonth.compare( aDateTime, bDateTime ) );
        __CLR4_4_1i46i46lc8azu9l.R.inc(23633);assertEquals( "DOY", 0, cDayOfYear.compare( aDateTime, bDateTime ) );
        __CLR4_4_1i46i46lc8azu9l.R.inc(23634);assertEquals( "WOW", 0, cWeekOfWeekyear.compare( aDateTime, bDateTime ) );
        __CLR4_4_1i46i46lc8azu9l.R.inc(23635);assertEquals( "WY", 0, cWeekyear.compare( aDateTime, bDateTime ) );
        __CLR4_4_1i46i46lc8azu9l.R.inc(23636);assertEquals( "MONTH", 0, cMonth.compare( aDateTime, bDateTime ) );
        __CLR4_4_1i46i46lc8azu9l.R.inc(23637);assertEquals( "YEAR", 0, cYear.compare( aDateTime, bDateTime ) );
        __CLR4_4_1i46i46lc8azu9l.R.inc(23638);assertEquals( "DATE", 0, cDate.compare( aDateTime, bDateTime ) );
        __CLR4_4_1i46i46lc8azu9l.R.inc(23639);assertEquals( "TIME", 0, cTime.compare( aDateTime, bDateTime ) );
    }finally{__CLR4_4_1i46i46lc8azu9l.R.flushNeeded();}}   // end of testBasicComps

    /**
     * Test all basic comparator operation with java Date objects.
     */
    public void testBasicComps3() {__CLR4_4_1i46i46lc8azu9l.R.globalSliceStart(getClass().getName(),23640);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sfsawii8o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i46i46lc8azu9l.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i46i46lc8azu9l.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeComparator.testBasicComps3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23640,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sfsawii8o(){try{__CLR4_4_1i46i46lc8azu9l.R.inc(23640);
        __CLR4_4_1i46i46lc8azu9l.R.inc(23641);Date aDateTime
            = new Date( System.currentTimeMillis() );
        __CLR4_4_1i46i46lc8azu9l.R.inc(23642);Date bDateTime
            = new Date( aDateTime.getTime() );
        __CLR4_4_1i46i46lc8azu9l.R.inc(23643);assertEquals( "MILLIS", 0, cMillis.compare( aDateTime, bDateTime ) );
        __CLR4_4_1i46i46lc8azu9l.R.inc(23644);assertEquals( "SECOND", 0, cSecond.compare( aDateTime, bDateTime ) );
        __CLR4_4_1i46i46lc8azu9l.R.inc(23645);assertEquals( "MINUTE", 0, cMinute.compare( aDateTime, bDateTime ) );
        __CLR4_4_1i46i46lc8azu9l.R.inc(23646);assertEquals( "HOUR", 0, cHour.compare( aDateTime, bDateTime ) );
        __CLR4_4_1i46i46lc8azu9l.R.inc(23647);assertEquals( "DOW", 0, cDayOfWeek.compare( aDateTime, bDateTime ) );
        __CLR4_4_1i46i46lc8azu9l.R.inc(23648);assertEquals( "DOM", 0, cDayOfMonth.compare( aDateTime, bDateTime ) );
        __CLR4_4_1i46i46lc8azu9l.R.inc(23649);assertEquals( "DOY", 0, cDayOfYear.compare( aDateTime, bDateTime ) );
        __CLR4_4_1i46i46lc8azu9l.R.inc(23650);assertEquals( "WOW", 0, cWeekOfWeekyear.compare( aDateTime, bDateTime ) );
        __CLR4_4_1i46i46lc8azu9l.R.inc(23651);assertEquals( "WY", 0, cWeekyear.compare( aDateTime, bDateTime ) );
        __CLR4_4_1i46i46lc8azu9l.R.inc(23652);assertEquals( "MONTH", 0, cMonth.compare( aDateTime, bDateTime ) );
        __CLR4_4_1i46i46lc8azu9l.R.inc(23653);assertEquals( "YEAR", 0, cYear.compare( aDateTime, bDateTime ) );
        __CLR4_4_1i46i46lc8azu9l.R.inc(23654);assertEquals( "DATE", 0, cDate.compare( aDateTime, bDateTime ) );
        __CLR4_4_1i46i46lc8azu9l.R.inc(23655);assertEquals( "TIME", 0, cTime.compare( aDateTime, bDateTime ) );
    }finally{__CLR4_4_1i46i46lc8azu9l.R.flushNeeded();}}   // end of testBasicComps

    /**
     * Test all basic comparator operation with Long objects.
     */
    public void testBasicComps4() {__CLR4_4_1i46i46lc8azu9l.R.globalSliceStart(getClass().getName(),23656);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vos9ozi94();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i46i46lc8azu9l.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i46i46lc8azu9l.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeComparator.testBasicComps4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23656,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vos9ozi94(){try{__CLR4_4_1i46i46lc8azu9l.R.inc(23656);
        __CLR4_4_1i46i46lc8azu9l.R.inc(23657);Long aDateTime
            = new Long( System.currentTimeMillis() );
        __CLR4_4_1i46i46lc8azu9l.R.inc(23658);Long bDateTime
            = new Long( aDateTime.longValue() );
        __CLR4_4_1i46i46lc8azu9l.R.inc(23659);assertEquals( "MILLIS", 0, cMillis.compare( aDateTime, bDateTime ) );
        __CLR4_4_1i46i46lc8azu9l.R.inc(23660);assertEquals( "SECOND", 0, cSecond.compare( aDateTime, bDateTime ) );
        __CLR4_4_1i46i46lc8azu9l.R.inc(23661);assertEquals( "MINUTE", 0, cMinute.compare( aDateTime, bDateTime ) );
        __CLR4_4_1i46i46lc8azu9l.R.inc(23662);assertEquals( "HOUR", 0, cHour.compare( aDateTime, bDateTime ) );
        __CLR4_4_1i46i46lc8azu9l.R.inc(23663);assertEquals( "DOW", 0, cDayOfWeek.compare( aDateTime, bDateTime ) );
        __CLR4_4_1i46i46lc8azu9l.R.inc(23664);assertEquals( "DOM", 0, cDayOfMonth.compare( aDateTime, bDateTime ) );
        __CLR4_4_1i46i46lc8azu9l.R.inc(23665);assertEquals( "DOY", 0, cDayOfYear.compare( aDateTime, bDateTime ) );
        __CLR4_4_1i46i46lc8azu9l.R.inc(23666);assertEquals( "WOW", 0, cWeekOfWeekyear.compare( aDateTime, bDateTime ) );
        __CLR4_4_1i46i46lc8azu9l.R.inc(23667);assertEquals( "WY", 0, cWeekyear.compare( aDateTime, bDateTime ) );
        __CLR4_4_1i46i46lc8azu9l.R.inc(23668);assertEquals( "MONTH", 0, cMonth.compare( aDateTime, bDateTime ) );
        __CLR4_4_1i46i46lc8azu9l.R.inc(23669);assertEquals( "YEAR", 0, cYear.compare( aDateTime, bDateTime ) );
        __CLR4_4_1i46i46lc8azu9l.R.inc(23670);assertEquals( "DATE", 0, cDate.compare( aDateTime, bDateTime ) );
        __CLR4_4_1i46i46lc8azu9l.R.inc(23671);assertEquals( "TIME", 0, cTime.compare( aDateTime, bDateTime ) );
    }finally{__CLR4_4_1i46i46lc8azu9l.R.flushNeeded();}}   // end of testBasicComps

    /**
     * Test all basic comparator operation with Calendar objects.
     */
    public void testBasicComps5() {__CLR4_4_1i46i46lc8azu9l.R.globalSliceStart(getClass().getName(),23672);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yxs8hgi9k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i46i46lc8azu9l.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i46i46lc8azu9l.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeComparator.testBasicComps5",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23672,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yxs8hgi9k(){try{__CLR4_4_1i46i46lc8azu9l.R.inc(23672);
        __CLR4_4_1i46i46lc8azu9l.R.inc(23673);Calendar aDateTime
            = Calendar.getInstance();   // right now
        __CLR4_4_1i46i46lc8azu9l.R.inc(23674);Calendar bDateTime = aDateTime;
        __CLR4_4_1i46i46lc8azu9l.R.inc(23675);assertEquals( "MILLIS", 0, cMillis.compare( aDateTime, bDateTime ) );
        __CLR4_4_1i46i46lc8azu9l.R.inc(23676);assertEquals( "SECOND", 0, cSecond.compare( aDateTime, bDateTime ) );
        __CLR4_4_1i46i46lc8azu9l.R.inc(23677);assertEquals( "MINUTE", 0, cMinute.compare( aDateTime, bDateTime ) );
        __CLR4_4_1i46i46lc8azu9l.R.inc(23678);assertEquals( "HOUR", 0, cHour.compare( aDateTime, bDateTime ) );
        __CLR4_4_1i46i46lc8azu9l.R.inc(23679);assertEquals( "DOW", 0, cDayOfWeek.compare( aDateTime, bDateTime ) );
        __CLR4_4_1i46i46lc8azu9l.R.inc(23680);assertEquals( "DOM", 0, cDayOfMonth.compare( aDateTime, bDateTime ) );
        __CLR4_4_1i46i46lc8azu9l.R.inc(23681);assertEquals( "DOY", 0, cDayOfYear.compare( aDateTime, bDateTime ) );
        __CLR4_4_1i46i46lc8azu9l.R.inc(23682);assertEquals( "WOW", 0, cWeekOfWeekyear.compare( aDateTime, bDateTime ) );
        __CLR4_4_1i46i46lc8azu9l.R.inc(23683);assertEquals( "WY", 0, cWeekyear.compare( aDateTime, bDateTime ) );
        __CLR4_4_1i46i46lc8azu9l.R.inc(23684);assertEquals( "MONTH", 0, cMonth.compare( aDateTime, bDateTime ) );
        __CLR4_4_1i46i46lc8azu9l.R.inc(23685);assertEquals( "YEAR", 0, cYear.compare( aDateTime, bDateTime ) );
        __CLR4_4_1i46i46lc8azu9l.R.inc(23686);assertEquals( "DATE", 0, cDate.compare( aDateTime, bDateTime ) );
        __CLR4_4_1i46i46lc8azu9l.R.inc(23687);assertEquals( "TIME", 0, cTime.compare( aDateTime, bDateTime ) );
    }finally{__CLR4_4_1i46i46lc8azu9l.R.flushNeeded();}}   // end of testBasicComps


    /**
     * Test unequal comparisons with millis of second comparators.
     */
    public void testMillis() {__CLR4_4_1i46i46lc8azu9l.R.globalSliceStart(getClass().getName(),23688);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ol9hs1ia0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i46i46lc8azu9l.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i46i46lc8azu9l.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeComparator.testMillis",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23688,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ol9hs1ia0(){try{__CLR4_4_1i46i46lc8azu9l.R.inc(23688);}finally{__CLR4_4_1i46i46lc8azu9l.R.flushNeeded();}}
// Defects4J: flaky method
//     public void testMillis() {
//         aDateTime = new DateTime( System.currentTimeMillis(), DateTimeZone.UTC );
//         bDateTime = new DateTime( aDateTime.getMillis() + 1, DateTimeZone.UTC );
//         assertEquals( "MillisM1", -1, cMillis.compare( aDateTime, bDateTime ) );
//         assertEquals( "MillisP1", 1, cMillis.compare( bDateTime, aDateTime ) );
//     }   // end of testMillis

    /**
     * Test unequal comparisons with second comparators.
     */
    public void testSecond() {__CLR4_4_1i46i46lc8azu9l.R.globalSliceStart(getClass().getName(),23689);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fss53nia1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i46i46lc8azu9l.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i46i46lc8azu9l.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeComparator.testSecond",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23689,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fss53nia1(){try{__CLR4_4_1i46i46lc8azu9l.R.inc(23689);
        __CLR4_4_1i46i46lc8azu9l.R.inc(23690);aDateTime = getADate( "1969-12-31T23:59:58" );
        __CLR4_4_1i46i46lc8azu9l.R.inc(23691);bDateTime = getADate( "1969-12-31T23:50:59" );
        __CLR4_4_1i46i46lc8azu9l.R.inc(23692);assertEquals( "SecondM1a", -1, cSecond.compare( aDateTime, bDateTime ) );
        __CLR4_4_1i46i46lc8azu9l.R.inc(23693);assertEquals( "SecondP1a", 1, cSecond.compare( bDateTime, aDateTime ) );
        __CLR4_4_1i46i46lc8azu9l.R.inc(23694);aDateTime = getADate( "1970-01-01T00:00:00" );
        __CLR4_4_1i46i46lc8azu9l.R.inc(23695);bDateTime = getADate( "1970-01-01T00:00:01" );
        __CLR4_4_1i46i46lc8azu9l.R.inc(23696);assertEquals( "SecondM1b", -1, cSecond.compare( aDateTime, bDateTime ) );
        __CLR4_4_1i46i46lc8azu9l.R.inc(23697);assertEquals( "SecondP1b", 1, cSecond.compare( bDateTime, aDateTime ) );
    }finally{__CLR4_4_1i46i46lc8azu9l.R.flushNeeded();}}   // end of testSecond

    /**
     * Test unequal comparisons with minute comparators.
     */
    public void testMinute() {__CLR4_4_1i46i46lc8azu9l.R.globalSliceStart(getClass().getName(),23698);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1y7jtu5iaa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i46i46lc8azu9l.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i46i46lc8azu9l.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeComparator.testMinute",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23698,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1y7jtu5iaa(){try{__CLR4_4_1i46i46lc8azu9l.R.inc(23698);
        __CLR4_4_1i46i46lc8azu9l.R.inc(23699);aDateTime = getADate( "1969-12-31T23:58:00" );
        __CLR4_4_1i46i46lc8azu9l.R.inc(23700);bDateTime = getADate( "1969-12-31T23:59:00" );
        __CLR4_4_1i46i46lc8azu9l.R.inc(23701);assertEquals( "MinuteM1a", -1, cMinute.compare( aDateTime, bDateTime ) );
        __CLR4_4_1i46i46lc8azu9l.R.inc(23702);assertEquals( "MinuteP1a", 1, cMinute.compare( bDateTime, aDateTime ) );
        __CLR4_4_1i46i46lc8azu9l.R.inc(23703);aDateTime = getADate( "1970-01-01T00:00:00" );
        __CLR4_4_1i46i46lc8azu9l.R.inc(23704);bDateTime = getADate( "1970-01-01T00:01:00" );
        __CLR4_4_1i46i46lc8azu9l.R.inc(23705);assertEquals( "MinuteM1b", -1, cMinute.compare( aDateTime, bDateTime ) );
        __CLR4_4_1i46i46lc8azu9l.R.inc(23706);assertEquals( "MinuteP1b", 1, cMinute.compare( bDateTime, aDateTime ) );
    }finally{__CLR4_4_1i46i46lc8azu9l.R.flushNeeded();}}   // end of testMinute

    /**
     * Test unequal comparisons with hour comparators.
     */
    public void testHour() {__CLR4_4_1i46i46lc8azu9l.R.globalSliceStart(getClass().getName(),23707);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mit1wjiaj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i46i46lc8azu9l.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i46i46lc8azu9l.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeComparator.testHour",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23707,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mit1wjiaj(){try{__CLR4_4_1i46i46lc8azu9l.R.inc(23707);
        __CLR4_4_1i46i46lc8azu9l.R.inc(23708);aDateTime = getADate( "1969-12-31T22:00:00" );
        __CLR4_4_1i46i46lc8azu9l.R.inc(23709);bDateTime = getADate( "1969-12-31T23:00:00" );
        __CLR4_4_1i46i46lc8azu9l.R.inc(23710);assertEquals( "HourM1a", -1, cHour.compare( aDateTime, bDateTime ) );
        __CLR4_4_1i46i46lc8azu9l.R.inc(23711);assertEquals( "HourP1a", 1, cHour.compare( bDateTime, aDateTime ) );
        __CLR4_4_1i46i46lc8azu9l.R.inc(23712);aDateTime = getADate( "1970-01-01T00:00:00" );
        __CLR4_4_1i46i46lc8azu9l.R.inc(23713);bDateTime = getADate( "1970-01-01T01:00:00" );
        __CLR4_4_1i46i46lc8azu9l.R.inc(23714);assertEquals( "HourM1b", -1, cHour.compare( aDateTime, bDateTime ) );
        __CLR4_4_1i46i46lc8azu9l.R.inc(23715);assertEquals( "HourP1b", 1, cHour.compare( bDateTime, aDateTime ) );
        __CLR4_4_1i46i46lc8azu9l.R.inc(23716);aDateTime = getADate( "1969-12-31T23:59:59" );
        __CLR4_4_1i46i46lc8azu9l.R.inc(23717);bDateTime = getADate( "1970-01-01T00:00:00" );
        __CLR4_4_1i46i46lc8azu9l.R.inc(23718);assertEquals( "HourP1c", 1, cHour.compare( aDateTime, bDateTime ) );
        __CLR4_4_1i46i46lc8azu9l.R.inc(23719);assertEquals( "HourM1c", -1, cHour.compare( bDateTime, aDateTime ) );
    }finally{__CLR4_4_1i46i46lc8azu9l.R.flushNeeded();}}   // end of testHour

    /**
     * Test unequal comparisons with day of week comparators.
     */
    public void testDOW() {__CLR4_4_1i46i46lc8azu9l.R.globalSliceStart(getClass().getName(),23720);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11mmwf3iaw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i46i46lc8azu9l.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i46i46lc8azu9l.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeComparator.testDOW",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23720,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11mmwf3iaw(){try{__CLR4_4_1i46i46lc8azu9l.R.inc(23720);
        /*
         * Dates chosen when I wrote the code, so I know what day of
         * the week it is.
         */
        __CLR4_4_1i46i46lc8azu9l.R.inc(23721);aDateTime = getADate( "2002-04-12T00:00:00" );
        __CLR4_4_1i46i46lc8azu9l.R.inc(23722);bDateTime = getADate( "2002-04-13T00:00:00" );
        __CLR4_4_1i46i46lc8azu9l.R.inc(23723);assertEquals( "DOWM1a", -1, cDayOfWeek.compare( aDateTime, bDateTime ) );
        __CLR4_4_1i46i46lc8azu9l.R.inc(23724);assertEquals( "DOWP1a", 1, cDayOfWeek.compare( bDateTime, aDateTime ) );
    }finally{__CLR4_4_1i46i46lc8azu9l.R.flushNeeded();}}   // end of testDOW

    /**
     * Test unequal comparisons with day of month comparators.
     */
    public void testDOM() {__CLR4_4_1i46i46lc8azu9l.R.globalSliceStart(getClass().getName(),23725);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1y4mkbtib1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i46i46lc8azu9l.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i46i46lc8azu9l.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeComparator.testDOM",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23725,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1y4mkbtib1(){try{__CLR4_4_1i46i46lc8azu9l.R.inc(23725);
        __CLR4_4_1i46i46lc8azu9l.R.inc(23726);aDateTime = getADate( "2002-04-12T00:00:00" );
        __CLR4_4_1i46i46lc8azu9l.R.inc(23727);bDateTime = getADate( "2002-04-13T00:00:00" );
        __CLR4_4_1i46i46lc8azu9l.R.inc(23728);assertEquals( "DOMM1a", -1, cDayOfMonth.compare( aDateTime, bDateTime ) );
        __CLR4_4_1i46i46lc8azu9l.R.inc(23729);assertEquals( "DOMP1a", 1, cDayOfMonth.compare( bDateTime, aDateTime ) );
        __CLR4_4_1i46i46lc8azu9l.R.inc(23730);aDateTime = getADate( "2000-12-01T00:00:00" );
        __CLR4_4_1i46i46lc8azu9l.R.inc(23731);bDateTime = getADate( "1814-04-30T00:00:00" );
        __CLR4_4_1i46i46lc8azu9l.R.inc(23732);assertEquals( "DOMM1b", -1, cDayOfMonth.compare( aDateTime, bDateTime ) );
        __CLR4_4_1i46i46lc8azu9l.R.inc(23733);assertEquals( "DOMP1b", 1, cDayOfMonth.compare( bDateTime, aDateTime ) );
    }finally{__CLR4_4_1i46i46lc8azu9l.R.flushNeeded();}}   // end of testDOM

    /**
     * Test unequal comparisons with day of year comparators.
     */
    public void testDOY() {__CLR4_4_1i46i46lc8azu9l.R.globalSliceStart(getClass().getName(),23734);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14vd15viba();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i46i46lc8azu9l.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i46i46lc8azu9l.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeComparator.testDOY",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23734,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14vd15viba(){try{__CLR4_4_1i46i46lc8azu9l.R.inc(23734);
        __CLR4_4_1i46i46lc8azu9l.R.inc(23735);aDateTime = getADate( "2002-04-12T00:00:00" );
        __CLR4_4_1i46i46lc8azu9l.R.inc(23736);bDateTime = getADate( "2002-04-13T00:00:00" );
        __CLR4_4_1i46i46lc8azu9l.R.inc(23737);assertEquals( "DOYM1a", -1, cDayOfYear.compare( aDateTime, bDateTime ) );
        __CLR4_4_1i46i46lc8azu9l.R.inc(23738);assertEquals( "DOYP1a", 1, cDayOfYear.compare( bDateTime, aDateTime ) );
        __CLR4_4_1i46i46lc8azu9l.R.inc(23739);aDateTime = getADate( "2000-02-29T00:00:00" );
        __CLR4_4_1i46i46lc8azu9l.R.inc(23740);bDateTime = getADate( "1814-11-30T00:00:00" );
        __CLR4_4_1i46i46lc8azu9l.R.inc(23741);assertEquals( "DOYM1b", -1, cDayOfYear.compare( aDateTime, bDateTime ) );
        __CLR4_4_1i46i46lc8azu9l.R.inc(23742);assertEquals( "DOYP1b", 1, cDayOfYear.compare( bDateTime, aDateTime ) );
    }finally{__CLR4_4_1i46i46lc8azu9l.R.flushNeeded();}}   // end of testDOY

    /**
     * Test unequal comparisons with week of weekyear comparators.
     */
    public void testWOW() {__CLR4_4_1i46i46lc8azu9l.R.globalSliceStart(getClass().getName(),23743);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sua15gibj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i46i46lc8azu9l.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i46i46lc8azu9l.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeComparator.testWOW",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23743,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sua15gibj(){try{__CLR4_4_1i46i46lc8azu9l.R.inc(23743);
        // 1st week of year contains Jan 04.
        __CLR4_4_1i46i46lc8azu9l.R.inc(23744);aDateTime = getADate( "2000-01-04T00:00:00" );
        __CLR4_4_1i46i46lc8azu9l.R.inc(23745);bDateTime = getADate( "2000-01-11T00:00:00" );
        __CLR4_4_1i46i46lc8azu9l.R.inc(23746);assertEquals( "WOWM1a", -1,
            cWeekOfWeekyear.compare( aDateTime, bDateTime ) );
        __CLR4_4_1i46i46lc8azu9l.R.inc(23747);assertEquals( "WOWP1a", 1,
            cWeekOfWeekyear.compare( bDateTime, aDateTime ) );
        __CLR4_4_1i46i46lc8azu9l.R.inc(23748);aDateTime = getADate( "2000-01-04T00:00:00" );
        __CLR4_4_1i46i46lc8azu9l.R.inc(23749);bDateTime = getADate( "1999-12-31T00:00:00" );
        __CLR4_4_1i46i46lc8azu9l.R.inc(23750);assertEquals( "WOWM1b", -1,
            cWeekOfWeekyear.compare( aDateTime, bDateTime ) );
        __CLR4_4_1i46i46lc8azu9l.R.inc(23751);assertEquals( "WOWP1b", 1,
            cWeekOfWeekyear.compare( bDateTime, aDateTime ) );
    }finally{__CLR4_4_1i46i46lc8azu9l.R.flushNeeded();}}   // end of testMillis

    /**
     * Test unequal comparisons with year given the week comparators.
     */
    public void testWOYY() {__CLR4_4_1i46i46lc8azu9l.R.globalSliceStart(getClass().getName(),23752);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dg15dbibs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i46i46lc8azu9l.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i46i46lc8azu9l.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeComparator.testWOYY",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23752,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dg15dbibs(){try{__CLR4_4_1i46i46lc8azu9l.R.inc(23752);
        // How do I test the end conditions of this?
        // Don't understand ......
        __CLR4_4_1i46i46lc8azu9l.R.inc(23753);aDateTime = getADate( "1998-12-31T23:59:59" );
        __CLR4_4_1i46i46lc8azu9l.R.inc(23754);bDateTime = getADate( "1999-01-01T00:00:00" );
        __CLR4_4_1i46i46lc8azu9l.R.inc(23755);assertEquals( "YOYYZ", 0, cWeekyear.compare( aDateTime, bDateTime ) );
        __CLR4_4_1i46i46lc8azu9l.R.inc(23756);bDateTime = getADate( "1999-01-04T00:00:00" );
        __CLR4_4_1i46i46lc8azu9l.R.inc(23757);assertEquals( "YOYYM1", -1, cWeekyear.compare( aDateTime, bDateTime ) );
        __CLR4_4_1i46i46lc8azu9l.R.inc(23758);assertEquals( "YOYYP1", 1, cWeekyear.compare( bDateTime, aDateTime ) );
    }finally{__CLR4_4_1i46i46lc8azu9l.R.flushNeeded();}}   // end of testWOYY

    /**
     * Test unequal comparisons with month comparators.
     */
    public void testMonth() {__CLR4_4_1i46i46lc8azu9l.R.globalSliceStart(getClass().getName(),23759);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18kdx0ribz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i46i46lc8azu9l.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i46i46lc8azu9l.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeComparator.testMonth",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23759,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18kdx0ribz(){try{__CLR4_4_1i46i46lc8azu9l.R.inc(23759);
        __CLR4_4_1i46i46lc8azu9l.R.inc(23760);aDateTime = getADate( "2002-04-30T00:00:00" );
        __CLR4_4_1i46i46lc8azu9l.R.inc(23761);bDateTime = getADate( "2002-05-01T00:00:00" );
        __CLR4_4_1i46i46lc8azu9l.R.inc(23762);assertEquals( "MONTHM1a", -1, cMonth.compare( aDateTime, bDateTime ) );
        __CLR4_4_1i46i46lc8azu9l.R.inc(23763);assertEquals( "MONTHP1a", 1, cMonth.compare( bDateTime, aDateTime ) );
        __CLR4_4_1i46i46lc8azu9l.R.inc(23764);aDateTime = getADate( "1900-01-01T00:00:00" );
        __CLR4_4_1i46i46lc8azu9l.R.inc(23765);bDateTime = getADate( "1899-12-31T00:00:00" );
        __CLR4_4_1i46i46lc8azu9l.R.inc(23766);assertEquals( "MONTHM1b", -1, cMonth.compare( aDateTime, bDateTime ) );
        __CLR4_4_1i46i46lc8azu9l.R.inc(23767);assertEquals( "MONTHP1b", 1, cMonth.compare( bDateTime, aDateTime ) );
    }finally{__CLR4_4_1i46i46lc8azu9l.R.flushNeeded();}}   // end of testMonth

    /**
     * Test unequal comparisons with year comparators.
     */
    public void testYear() {__CLR4_4_1i46i46lc8azu9l.R.globalSliceStart(getClass().getName(),23768);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fu0vqiic8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i46i46lc8azu9l.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i46i46lc8azu9l.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeComparator.testYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23768,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fu0vqiic8(){try{__CLR4_4_1i46i46lc8azu9l.R.inc(23768);
        __CLR4_4_1i46i46lc8azu9l.R.inc(23769);aDateTime = getADate( "2000-01-01T00:00:00" );
        __CLR4_4_1i46i46lc8azu9l.R.inc(23770);bDateTime = getADate( "2001-01-01T00:00:00" );
        __CLR4_4_1i46i46lc8azu9l.R.inc(23771);assertEquals( "YEARM1a", -1, cYear.compare( aDateTime, bDateTime ) );
        __CLR4_4_1i46i46lc8azu9l.R.inc(23772);assertEquals( "YEARP1a", 1, cYear.compare( bDateTime, aDateTime ) );
        __CLR4_4_1i46i46lc8azu9l.R.inc(23773);aDateTime = getADate( "1968-12-31T23:59:59" );
        __CLR4_4_1i46i46lc8azu9l.R.inc(23774);bDateTime = getADate( "1970-01-01T00:00:00" );
        __CLR4_4_1i46i46lc8azu9l.R.inc(23775);assertEquals( "YEARM1b", -1, cYear.compare( aDateTime, bDateTime ) );
        __CLR4_4_1i46i46lc8azu9l.R.inc(23776);assertEquals( "YEARP1b", 1, cYear.compare( bDateTime, aDateTime ) );
        __CLR4_4_1i46i46lc8azu9l.R.inc(23777);aDateTime = getADate( "1969-12-31T23:59:59" );
        __CLR4_4_1i46i46lc8azu9l.R.inc(23778);bDateTime = getADate( "1970-01-01T00:00:00" );
        __CLR4_4_1i46i46lc8azu9l.R.inc(23779);assertEquals( "YEARM1c", -1, cYear.compare( aDateTime, bDateTime ) );
        __CLR4_4_1i46i46lc8azu9l.R.inc(23780);assertEquals( "YEARP1c", 1, cYear.compare( bDateTime, aDateTime ) );
    }finally{__CLR4_4_1i46i46lc8azu9l.R.flushNeeded();}}   // end of testYear

    /*
     * 'List' processing tests follow.
     */

     /**
      * Test sorting with full default comparator.
      */
     public void testListBasic() {__CLR4_4_1i46i46lc8azu9l.R.globalSliceStart(getClass().getName(),23781);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_150qit7icl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i46i46lc8azu9l.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i46i46lc8azu9l.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeComparator.testListBasic",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23781,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_150qit7icl(){try{__CLR4_4_1i46i46lc8azu9l.R.inc(23781);
        __CLR4_4_1i46i46lc8azu9l.R.inc(23782);String[] dtStrs = {
            "1999-02-01T00:00:00",
            "1998-01-20T00:00:00"
        };
        //
        __CLR4_4_1i46i46lc8azu9l.R.inc(23783);List sl = loadAList( dtStrs );
        __CLR4_4_1i46i46lc8azu9l.R.inc(23784);boolean isSorted1 = isListSorted( sl );
        __CLR4_4_1i46i46lc8azu9l.R.inc(23785);Collections.sort( sl );
        __CLR4_4_1i46i46lc8azu9l.R.inc(23786);boolean isSorted2 = isListSorted( sl );
        __CLR4_4_1i46i46lc8azu9l.R.inc(23787);assertEquals("ListBasic", !isSorted1, isSorted2);
     }finally{__CLR4_4_1i46i46lc8azu9l.R.flushNeeded();}} // end of testListBasic

     /**
      * Test sorting with millis of second comparator.
      */
    public void testListMillis() {__CLR4_4_1i46i46lc8azu9l.R.globalSliceStart(getClass().getName(),23788);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sz6yppics();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i46i46lc8azu9l.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i46i46lc8azu9l.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeComparator.testListMillis",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23788,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sz6yppics(){try{__CLR4_4_1i46i46lc8azu9l.R.inc(23788);
        //
        __CLR4_4_1i46i46lc8azu9l.R.inc(23789);List sl = new ArrayList();
        __CLR4_4_1i46i46lc8azu9l.R.inc(23790);long base = 12345L * 1000L;
        __CLR4_4_1i46i46lc8azu9l.R.inc(23791);sl.add( new DateTime( base + 999L, DateTimeZone.UTC ) );
        __CLR4_4_1i46i46lc8azu9l.R.inc(23792);sl.add( new DateTime( base + 222L, DateTimeZone.UTC ) );
        __CLR4_4_1i46i46lc8azu9l.R.inc(23793);sl.add( new DateTime( base + 456L, DateTimeZone.UTC ) );
        __CLR4_4_1i46i46lc8azu9l.R.inc(23794);sl.add( new DateTime( base + 888L, DateTimeZone.UTC ) );
        __CLR4_4_1i46i46lc8azu9l.R.inc(23795);sl.add( new DateTime( base + 123L, DateTimeZone.UTC ) );
        __CLR4_4_1i46i46lc8azu9l.R.inc(23796);sl.add( new DateTime( base + 000L, DateTimeZone.UTC ) );
        //
        __CLR4_4_1i46i46lc8azu9l.R.inc(23797);boolean isSorted1 = isListSorted( sl );
        __CLR4_4_1i46i46lc8azu9l.R.inc(23798);Collections.sort( sl, cMillis );
        __CLR4_4_1i46i46lc8azu9l.R.inc(23799);boolean isSorted2 = isListSorted( sl );
        __CLR4_4_1i46i46lc8azu9l.R.inc(23800);assertEquals("ListLillis", !isSorted1, isSorted2);
    }finally{__CLR4_4_1i46i46lc8azu9l.R.flushNeeded();}} // end of testListSecond


     /**
      * Test sorting with second comparator.
      */
    public void testListSecond() {__CLR4_4_1i46i46lc8azu9l.R.globalSliceStart(getClass().getName(),23801);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1x9fql1id5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i46i46lc8azu9l.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i46i46lc8azu9l.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeComparator.testListSecond",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23801,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1x9fql1id5(){try{__CLR4_4_1i46i46lc8azu9l.R.inc(23801);
        __CLR4_4_1i46i46lc8azu9l.R.inc(23802);String[] dtStrs = {
            "1999-02-01T00:00:10",
            "1999-02-01T00:00:30",
            "1999-02-01T00:00:25",
            "1999-02-01T00:00:18",
            "1999-02-01T00:00:01",
            "1999-02-01T00:00:59",
            "1999-02-01T00:00:22"
        };
        //
        __CLR4_4_1i46i46lc8azu9l.R.inc(23803);List sl = loadAList( dtStrs );
        __CLR4_4_1i46i46lc8azu9l.R.inc(23804);boolean isSorted1 = isListSorted( sl );
        __CLR4_4_1i46i46lc8azu9l.R.inc(23805);Collections.sort( sl, cSecond );
        __CLR4_4_1i46i46lc8azu9l.R.inc(23806);boolean isSorted2 = isListSorted( sl );
        __CLR4_4_1i46i46lc8azu9l.R.inc(23807);assertEquals("ListSecond", !isSorted1, isSorted2);
    }finally{__CLR4_4_1i46i46lc8azu9l.R.flushNeeded();}} // end of testListSecond

     /**
      * Test sorting with minute comparator.
      */
    public void testListMinute() {__CLR4_4_1i46i46lc8azu9l.R.globalSliceStart(getClass().getName(),23808);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gqw8cridc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i46i46lc8azu9l.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i46i46lc8azu9l.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeComparator.testListMinute",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23808,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gqw8cridc(){try{__CLR4_4_1i46i46lc8azu9l.R.inc(23808);
        __CLR4_4_1i46i46lc8azu9l.R.inc(23809);String[] dtStrs = {
            "1999-02-01T00:10:00",
            "1999-02-01T00:30:00",
            "1999-02-01T00:25:00",
            "1999-02-01T00:18:00",
            "1999-02-01T00:01:00",
            "1999-02-01T00:59:00",
            "1999-02-01T00:22:00"
        };
        //
        __CLR4_4_1i46i46lc8azu9l.R.inc(23810);List sl = loadAList( dtStrs );
        __CLR4_4_1i46i46lc8azu9l.R.inc(23811);boolean isSorted1 = isListSorted( sl );
        __CLR4_4_1i46i46lc8azu9l.R.inc(23812);Collections.sort( sl, cMinute );
        __CLR4_4_1i46i46lc8azu9l.R.inc(23813);boolean isSorted2 = isListSorted( sl );
        __CLR4_4_1i46i46lc8azu9l.R.inc(23814);assertEquals("ListMinute", !isSorted1, isSorted2);
    }finally{__CLR4_4_1i46i46lc8azu9l.R.flushNeeded();}} // end of testListMinute

     /**
      * Test sorting with hour comparator.
      */
    public void testListHour() {__CLR4_4_1i46i46lc8azu9l.R.globalSliceStart(getClass().getName(),23815);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1esabrvidj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i46i46lc8azu9l.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i46i46lc8azu9l.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeComparator.testListHour",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23815,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1esabrvidj(){try{__CLR4_4_1i46i46lc8azu9l.R.inc(23815);
        __CLR4_4_1i46i46lc8azu9l.R.inc(23816);String[] dtStrs = {
            "1999-02-01T10:00:00",
            "1999-02-01T23:00:00",
            "1999-02-01T01:00:00",
            "1999-02-01T15:00:00",
            "1999-02-01T05:00:00",
            "1999-02-01T20:00:00",
            "1999-02-01T17:00:00"
        };
        //
        __CLR4_4_1i46i46lc8azu9l.R.inc(23817);List sl = loadAList( dtStrs );
        __CLR4_4_1i46i46lc8azu9l.R.inc(23818);boolean isSorted1 = isListSorted( sl );
        __CLR4_4_1i46i46lc8azu9l.R.inc(23819);Collections.sort( sl, cHour );
        __CLR4_4_1i46i46lc8azu9l.R.inc(23820);boolean isSorted2 = isListSorted( sl );
        __CLR4_4_1i46i46lc8azu9l.R.inc(23821);assertEquals("ListHour", !isSorted1, isSorted2);
    }finally{__CLR4_4_1i46i46lc8azu9l.R.flushNeeded();}} // end of testListHour


     /**
      * Test sorting with day of week comparator.
      */
    public void testListDOW() {__CLR4_4_1i46i46lc8azu9l.R.globalSliceStart(getClass().getName(),23822);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19l9dnhidq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i46i46lc8azu9l.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i46i46lc8azu9l.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeComparator.testListDOW",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23822,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19l9dnhidq(){try{__CLR4_4_1i46i46lc8azu9l.R.inc(23822);
        __CLR4_4_1i46i46lc8azu9l.R.inc(23823);String[] dtStrs = {
            /* 2002-04-15 = Monday */
            "2002-04-21T10:00:00",
            "2002-04-16T10:00:00",
            "2002-04-15T10:00:00",
            "2002-04-17T10:00:00",
            "2002-04-19T10:00:00",
            "2002-04-18T10:00:00",
            "2002-04-20T10:00:00"
        };
        //
        __CLR4_4_1i46i46lc8azu9l.R.inc(23824);List sl = loadAList( dtStrs );
        __CLR4_4_1i46i46lc8azu9l.R.inc(23825);boolean isSorted1 = isListSorted( sl );
        __CLR4_4_1i46i46lc8azu9l.R.inc(23826);Collections.sort( sl, cDayOfWeek );
        __CLR4_4_1i46i46lc8azu9l.R.inc(23827);boolean isSorted2 = isListSorted( sl );
        __CLR4_4_1i46i46lc8azu9l.R.inc(23828);assertEquals("ListDOW", !isSorted1, isSorted2);
    }finally{__CLR4_4_1i46i46lc8azu9l.R.flushNeeded();}} // end of testListDOW

     /**
      * Test sorting with day of month comparator.
      */
    public void testListDOM() {__CLR4_4_1i46i46lc8azu9l.R.globalSliceStart(getClass().getName(),23829);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sxv0exidx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i46i46lc8azu9l.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i46i46lc8azu9l.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeComparator.testListDOM",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23829,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sxv0exidx(){try{__CLR4_4_1i46i46lc8azu9l.R.inc(23829);
        __CLR4_4_1i46i46lc8azu9l.R.inc(23830);String[] dtStrs = {
            /* 2002-04-14 = Sunday */
            "2002-04-20T10:00:00",
            "2002-04-16T10:00:00",
            "2002-04-15T10:00:00",
            "2002-04-17T10:00:00",
            "2002-04-19T10:00:00",
            "2002-04-18T10:00:00",
            "2002-04-14T10:00:00"
        };
        //
        __CLR4_4_1i46i46lc8azu9l.R.inc(23831);List sl = loadAList( dtStrs );
        __CLR4_4_1i46i46lc8azu9l.R.inc(23832);boolean isSorted1 = isListSorted( sl );
        __CLR4_4_1i46i46lc8azu9l.R.inc(23833);Collections.sort( sl, cDayOfMonth );
        __CLR4_4_1i46i46lc8azu9l.R.inc(23834);boolean isSorted2 = isListSorted( sl );
        __CLR4_4_1i46i46lc8azu9l.R.inc(23835);assertEquals("ListDOM", !isSorted1, isSorted2);
    }finally{__CLR4_4_1i46i46lc8azu9l.R.flushNeeded();}} // end of testListDOM

     /**
      * Test sorting with day of year comparator.
      */
    public void testListDOY() {__CLR4_4_1i46i46lc8azu9l.R.globalSliceStart(getClass().getName(),23836);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1339g2jie4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i46i46lc8azu9l.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i46i46lc8azu9l.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeComparator.testListDOY",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23836,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1339g2jie4(){try{__CLR4_4_1i46i46lc8azu9l.R.inc(23836);
        __CLR4_4_1i46i46lc8azu9l.R.inc(23837);String[] dtStrs = {
            "2002-04-20T10:00:00",
            "2002-01-16T10:00:00",
            "2002-12-31T10:00:00",
            "2002-09-14T10:00:00",
            "2002-09-19T10:00:00",
            "2002-02-14T10:00:00",
            "2002-10-30T10:00:00"
        };
        //
        __CLR4_4_1i46i46lc8azu9l.R.inc(23838);List sl = loadAList( dtStrs );
        __CLR4_4_1i46i46lc8azu9l.R.inc(23839);boolean isSorted1 = isListSorted( sl );
        __CLR4_4_1i46i46lc8azu9l.R.inc(23840);Collections.sort( sl, cDayOfYear );
        __CLR4_4_1i46i46lc8azu9l.R.inc(23841);boolean isSorted2 = isListSorted( sl );
        __CLR4_4_1i46i46lc8azu9l.R.inc(23842);assertEquals("ListDOY", !isSorted1, isSorted2);
    }finally{__CLR4_4_1i46i46lc8azu9l.R.flushNeeded();}} // end of testListDOY

     /**
      * Test sorting with week of weekyear comparator.
      */
    public void testListWOW() {__CLR4_4_1i46i46lc8azu9l.R.globalSliceStart(getClass().getName(),23843);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kvnjx2ieb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i46i46lc8azu9l.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i46i46lc8azu9l.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeComparator.testListWOW",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23843,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kvnjx2ieb(){try{__CLR4_4_1i46i46lc8azu9l.R.inc(23843);
        __CLR4_4_1i46i46lc8azu9l.R.inc(23844);String[] dtStrs = {
            "2002-04-01T10:00:00",
            "2002-01-01T10:00:00",
            "2002-12-01T10:00:00",
            "2002-09-01T10:00:00",
            "2002-09-01T10:00:00",
            "2002-02-01T10:00:00",
            "2002-10-01T10:00:00"
        };
        //
        __CLR4_4_1i46i46lc8azu9l.R.inc(23845);List sl = loadAList( dtStrs );
        __CLR4_4_1i46i46lc8azu9l.R.inc(23846);boolean isSorted1 = isListSorted( sl );
        __CLR4_4_1i46i46lc8azu9l.R.inc(23847);Collections.sort( sl, cWeekOfWeekyear );
        __CLR4_4_1i46i46lc8azu9l.R.inc(23848);boolean isSorted2 = isListSorted( sl );
        __CLR4_4_1i46i46lc8azu9l.R.inc(23849);assertEquals("ListWOW", !isSorted1, isSorted2);
    }finally{__CLR4_4_1i46i46lc8azu9l.R.flushNeeded();}} // end of testListWOW

     /**
      * Test sorting with year (given week) comparator.
      */
    public void testListYOYY() {__CLR4_4_1i46i46lc8azu9l.R.globalSliceStart(getClass().getName(),23850);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xkfiq5iei();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i46i46lc8azu9l.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i46i46lc8azu9l.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeComparator.testListYOYY",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23850,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xkfiq5iei(){try{__CLR4_4_1i46i46lc8azu9l.R.inc(23850);
        // ?? How to catch end conditions ??
        __CLR4_4_1i46i46lc8azu9l.R.inc(23851);String[] dtStrs = {
            "2010-04-01T10:00:00",
            "2002-01-01T10:00:00"
        };
        //
        __CLR4_4_1i46i46lc8azu9l.R.inc(23852);List sl = loadAList( dtStrs );
        __CLR4_4_1i46i46lc8azu9l.R.inc(23853);boolean isSorted1 = isListSorted( sl );
        __CLR4_4_1i46i46lc8azu9l.R.inc(23854);Collections.sort( sl, cWeekyear );
        __CLR4_4_1i46i46lc8azu9l.R.inc(23855);boolean isSorted2 = isListSorted( sl );
        __CLR4_4_1i46i46lc8azu9l.R.inc(23856);assertEquals("ListYOYY", !isSorted1, isSorted2);
    }finally{__CLR4_4_1i46i46lc8azu9l.R.flushNeeded();}} // end of testListYOYY


     /**
      * Test sorting with month comparator.
      */
    public void testListMonth() {__CLR4_4_1i46i46lc8azu9l.R.globalSliceStart(getClass().getName(),23857);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bhpzdjiep();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i46i46lc8azu9l.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i46i46lc8azu9l.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeComparator.testListMonth",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23857,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bhpzdjiep(){try{__CLR4_4_1i46i46lc8azu9l.R.inc(23857);
        __CLR4_4_1i46i46lc8azu9l.R.inc(23858);String[] dtStrs = {
            "2002-04-01T10:00:00",
            "2002-01-01T10:00:00",
            "2002-12-01T10:00:00",
            "2002-09-01T10:00:00",
            "2002-09-01T10:00:00",
            "2002-02-01T10:00:00",
            "2002-10-01T10:00:00"
        };
        //
        __CLR4_4_1i46i46lc8azu9l.R.inc(23859);List sl = loadAList( dtStrs );
        __CLR4_4_1i46i46lc8azu9l.R.inc(23860);boolean isSorted1 = isListSorted( sl );
        __CLR4_4_1i46i46lc8azu9l.R.inc(23861);Collections.sort( sl, cMonth );
        __CLR4_4_1i46i46lc8azu9l.R.inc(23862);boolean isSorted2 = isListSorted( sl );
        __CLR4_4_1i46i46lc8azu9l.R.inc(23863);assertEquals("ListMonth", !isSorted1, isSorted2);
    }finally{__CLR4_4_1i46i46lc8azu9l.R.flushNeeded();}} // end of testListMonth

     /**
      * Test sorting with year comparator.
      */
     public void testListYear() {__CLR4_4_1i46i46lc8azu9l.R.globalSliceStart(getClass().getName(),23864);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lh2hxwiew();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i46i46lc8azu9l.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i46i46lc8azu9l.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeComparator.testListYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23864,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lh2hxwiew(){try{__CLR4_4_1i46i46lc8azu9l.R.inc(23864);
        __CLR4_4_1i46i46lc8azu9l.R.inc(23865);String[] dtStrs = {
            "1999-02-01T00:00:00",
            "1998-02-01T00:00:00",
            "2525-02-01T00:00:00",
            "1776-02-01T00:00:00",
            "1863-02-01T00:00:00",
            "1066-02-01T00:00:00",
            "2100-02-01T00:00:00"
        };
        //
        __CLR4_4_1i46i46lc8azu9l.R.inc(23866);List sl = loadAList( dtStrs );
        __CLR4_4_1i46i46lc8azu9l.R.inc(23867);boolean isSorted1 = isListSorted( sl );
        __CLR4_4_1i46i46lc8azu9l.R.inc(23868);Collections.sort( sl, cYear );
        __CLR4_4_1i46i46lc8azu9l.R.inc(23869);boolean isSorted2 = isListSorted( sl );
        __CLR4_4_1i46i46lc8azu9l.R.inc(23870);assertEquals("ListYear", !isSorted1, isSorted2);
     }finally{__CLR4_4_1i46i46lc8azu9l.R.flushNeeded();}} // end of testListYear

     /**
      * Test sorting with date only comparator.
      */
    public void testListDate() {__CLR4_4_1i46i46lc8azu9l.R.globalSliceStart(getClass().getName(),23871);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1obr06dif3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i46i46lc8azu9l.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i46i46lc8azu9l.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeComparator.testListDate",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23871,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1obr06dif3(){try{__CLR4_4_1i46i46lc8azu9l.R.inc(23871);
        __CLR4_4_1i46i46lc8azu9l.R.inc(23872);String[] dtStrs = {
            "1999-02-01T00:00:00",
            "1998-10-03T00:00:00",
            "2525-05-20T00:00:00",
            "1776-12-25T00:00:00",
            "1863-01-31T00:00:00",
            "1066-09-22T00:00:00",
            "2100-07-04T00:00:00"
        };
        //
        __CLR4_4_1i46i46lc8azu9l.R.inc(23873);List sl = loadAList( dtStrs );
        __CLR4_4_1i46i46lc8azu9l.R.inc(23874);boolean isSorted1 = isListSorted( sl );
        __CLR4_4_1i46i46lc8azu9l.R.inc(23875);Collections.sort( sl, cDate );
        __CLR4_4_1i46i46lc8azu9l.R.inc(23876);boolean isSorted2 = isListSorted( sl );
        __CLR4_4_1i46i46lc8azu9l.R.inc(23877);assertEquals("ListDate", !isSorted1, isSorted2);
    }finally{__CLR4_4_1i46i46lc8azu9l.R.flushNeeded();}} // end of testListDate

     /**
      * Test sorting with time only comparator.
      */
    public void testListTime() {__CLR4_4_1i46i46lc8azu9l.R.globalSliceStart(getClass().getName(),23878);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ix3kroifa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i46i46lc8azu9l.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i46i46lc8azu9l.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeComparator.testListTime",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23878,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ix3kroifa(){try{__CLR4_4_1i46i46lc8azu9l.R.inc(23878);
        __CLR4_4_1i46i46lc8azu9l.R.inc(23879);String[] dtStrs = {
            "1999-02-01T01:02:05",
            "1999-02-01T22:22:22",
            "1999-02-01T05:30:45",
            "1999-02-01T09:17:59",
            "1999-02-01T09:17:58",
            "1999-02-01T15:30:00",
            "1999-02-01T17:00:44"
        };
        //
        __CLR4_4_1i46i46lc8azu9l.R.inc(23880);List sl = loadAList( dtStrs );
        __CLR4_4_1i46i46lc8azu9l.R.inc(23881);boolean isSorted1 = isListSorted( sl );
        __CLR4_4_1i46i46lc8azu9l.R.inc(23882);Collections.sort( sl, cTime );
        __CLR4_4_1i46i46lc8azu9l.R.inc(23883);boolean isSorted2 = isListSorted( sl );
        __CLR4_4_1i46i46lc8azu9l.R.inc(23884);assertEquals("ListTime", !isSorted1, isSorted2);
    }finally{__CLR4_4_1i46i46lc8azu9l.R.flushNeeded();}} // end of testListTime


    /**
     * Test comparator operation with null object(s).
     */
    public void testNullDT() {__CLR4_4_1i46i46lc8azu9l.R.globalSliceStart(getClass().getName(),23885);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1d0skswifh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i46i46lc8azu9l.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i46i46lc8azu9l.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeComparator.testNullDT",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23885,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1d0skswifh(){try{__CLR4_4_1i46i46lc8azu9l.R.inc(23885);
        // null means now
        __CLR4_4_1i46i46lc8azu9l.R.inc(23886);aDateTime = getADate("2000-01-01T00:00:00");
        __CLR4_4_1i46i46lc8azu9l.R.inc(23887);assertTrue(cYear.compare(null, aDateTime) > 0);
        __CLR4_4_1i46i46lc8azu9l.R.inc(23888);assertTrue(cYear.compare(aDateTime, null) < 0);
    }finally{__CLR4_4_1i46i46lc8azu9l.R.flushNeeded();}}

    /**
     * Test comparator operation with an invalid object type.
     */
    public void testInvalidObj() {__CLR4_4_1i46i46lc8azu9l.R.globalSliceStart(getClass().getName(),23889);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18mlwzrifl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i46i46lc8azu9l.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i46i46lc8azu9l.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeComparator.testInvalidObj",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23889,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18mlwzrifl(){try{__CLR4_4_1i46i46lc8azu9l.R.inc(23889);
        __CLR4_4_1i46i46lc8azu9l.R.inc(23890);aDateTime = getADate("2000-01-01T00:00:00");
        __CLR4_4_1i46i46lc8azu9l.R.inc(23891);try {
            __CLR4_4_1i46i46lc8azu9l.R.inc(23892);cYear.compare("FreeBird", aDateTime);
            __CLR4_4_1i46i46lc8azu9l.R.inc(23893);fail("Invalid object failed");
        } catch (IllegalArgumentException cce) {}
    }finally{__CLR4_4_1i46i46lc8azu9l.R.flushNeeded();}}

    // private convenience methods
    //-----------------------------------------------------------------------
    /**
     * Creates a date to test with.
     */
    private DateTime getADate(String s) {try{__CLR4_4_1i46i46lc8azu9l.R.inc(23894);
        __CLR4_4_1i46i46lc8azu9l.R.inc(23895);DateTime retDT = null;
        __CLR4_4_1i46i46lc8azu9l.R.inc(23896);try {
            __CLR4_4_1i46i46lc8azu9l.R.inc(23897);retDT = new DateTime(s, DateTimeZone.UTC);
        } catch (IllegalArgumentException pe) {
            __CLR4_4_1i46i46lc8azu9l.R.inc(23898);pe.printStackTrace();
        }
        __CLR4_4_1i46i46lc8azu9l.R.inc(23899);return retDT;
    }finally{__CLR4_4_1i46i46lc8azu9l.R.flushNeeded();}}

    /**
     * Load a string array.
     */
    private List loadAList(String[] someStrs) {try{__CLR4_4_1i46i46lc8azu9l.R.inc(23900);
        __CLR4_4_1i46i46lc8azu9l.R.inc(23901);List newList = new ArrayList();
        __CLR4_4_1i46i46lc8azu9l.R.inc(23902);try {
            __CLR4_4_1i46i46lc8azu9l.R.inc(23903);for (int i = 0; (((i < someStrs.length)&&(__CLR4_4_1i46i46lc8azu9l.R.iget(23904)!=0|true))||(__CLR4_4_1i46i46lc8azu9l.R.iget(23905)==0&false)); ++i) {{
                __CLR4_4_1i46i46lc8azu9l.R.inc(23906);newList.add(new DateTime(someStrs[i], DateTimeZone.UTC));
            } // end of the for
        }} catch (IllegalArgumentException pe) {
            __CLR4_4_1i46i46lc8azu9l.R.inc(23907);pe.printStackTrace();
        }
        __CLR4_4_1i46i46lc8azu9l.R.inc(23908);return newList;
    }finally{__CLR4_4_1i46i46lc8azu9l.R.flushNeeded();}}

    /**
     * Check if the list is sorted.
     */
    private boolean isListSorted(List tl) {try{__CLR4_4_1i46i46lc8azu9l.R.inc(23909);
        // tl must be populated with DateTime objects.
        __CLR4_4_1i46i46lc8azu9l.R.inc(23910);DateTime lhDT = (DateTime)tl.get(0);
        __CLR4_4_1i46i46lc8azu9l.R.inc(23911);DateTime rhDT = null;
        __CLR4_4_1i46i46lc8azu9l.R.inc(23912);Long lhVal = new Long( lhDT.getMillis() );
        __CLR4_4_1i46i46lc8azu9l.R.inc(23913);Long rhVal = null;
        __CLR4_4_1i46i46lc8azu9l.R.inc(23914);for (int i = 1; (((i < tl.size())&&(__CLR4_4_1i46i46lc8azu9l.R.iget(23915)!=0|true))||(__CLR4_4_1i46i46lc8azu9l.R.iget(23916)==0&false)); ++i) {{
            __CLR4_4_1i46i46lc8azu9l.R.inc(23917);rhDT = (DateTime)tl.get(i);
            __CLR4_4_1i46i46lc8azu9l.R.inc(23918);rhVal = new Long( rhDT.getMillis() );
            __CLR4_4_1i46i46lc8azu9l.R.inc(23919);if ( (((lhVal.compareTo( rhVal) > 0 )&&(__CLR4_4_1i46i46lc8azu9l.R.iget(23920)!=0|true))||(__CLR4_4_1i46i46lc8azu9l.R.iget(23921)==0&false))) {__CLR4_4_1i46i46lc8azu9l.R.inc(23922);return false;
            //
            }__CLR4_4_1i46i46lc8azu9l.R.inc(23923);lhVal = rhVal;  // swap for next iteration
            __CLR4_4_1i46i46lc8azu9l.R.inc(23924);lhDT = rhDT;    // swap for next iteration
        }
        }__CLR4_4_1i46i46lc8azu9l.R.inc(23925);return true;
    }finally{__CLR4_4_1i46i46lc8azu9l.R.flushNeeded();}}

}
