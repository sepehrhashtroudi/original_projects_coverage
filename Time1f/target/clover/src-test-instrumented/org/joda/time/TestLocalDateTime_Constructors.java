/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 *  Copyright 2001-2013 Stephen Colebourne
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

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

/**
 * This class is a Junit unit test for LocalDateTime.
 *
 * @author Stephen Colebourne
 */
public class TestLocalDateTime_Constructors extends TestCase {static class __CLR4_4_1onaonalc8azv6z{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672271031490L,8589935092L,32485,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone MOSCOW = DateTimeZone.forID("Europe/Moscow");
    private static final Chronology ISO_UTC = ISOChronology.getInstanceUTC();
    private static final Chronology GREGORIAN_UTC = GregorianChronology.getInstanceUTC();
    private static final Chronology GREGORIAN_PARIS = GregorianChronology.getInstance(PARIS);
    private static final Chronology GREGORIAN_MOSCOW = GregorianChronology.getInstance(MOSCOW);
    private static final Chronology BUDDHIST_UTC = BuddhistChronology.getInstanceUTC();
    private static final int OFFSET_PARIS = PARIS.getOffset(0L) / DateTimeConstants.MILLIS_PER_HOUR;
    private static final int OFFSET_MOSCOW = MOSCOW.getOffset(0L) / DateTimeConstants.MILLIS_PER_HOUR;
    
    private long MILLIS_OF_DAY =
        10L * DateTimeConstants.MILLIS_PER_HOUR
        + 20L * DateTimeConstants.MILLIS_PER_MINUTE
        + 30L * DateTimeConstants.MILLIS_PER_SECOND
        + 40L;
    private long TEST_TIME_NOW =
        (31L + 28L + 31L + 30L + 31L + 9L -1L) * DateTimeConstants.MILLIS_PER_DAY
        + MILLIS_OF_DAY;

    private long TEST_TIME1 =
        (31L + 28L + 31L + 6L -1L) * DateTimeConstants.MILLIS_PER_DAY
        + 12L * DateTimeConstants.MILLIS_PER_HOUR
        + 24L * DateTimeConstants.MILLIS_PER_MINUTE;
    private long TEST_TIME2 =
        (365L + 31L + 28L + 31L + 30L + 7L -1L) * DateTimeConstants.MILLIS_PER_DAY
        + 14L * DateTimeConstants.MILLIS_PER_HOUR
        + 28L * DateTimeConstants.MILLIS_PER_MINUTE;

    private DateTimeZone zone = null;

    public static void main(String[] args) {try{__CLR4_4_1onaonalc8azv6z.R.inc(31942);
        __CLR4_4_1onaonalc8azv6z.R.inc(31943);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1onaonalc8azv6z.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1onaonalc8azv6z.R.inc(31944);
        __CLR4_4_1onaonalc8azv6z.R.inc(31945);return new TestSuite(TestLocalDateTime_Constructors.class);
    }finally{__CLR4_4_1onaonalc8azv6z.R.flushNeeded();}}

    public TestLocalDateTime_Constructors(String name) {
        super(name);__CLR4_4_1onaonalc8azv6z.R.inc(31947);try{__CLR4_4_1onaonalc8azv6z.R.inc(31946);
    }finally{__CLR4_4_1onaonalc8azv6z.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1onaonalc8azv6z.R.inc(31948);
        __CLR4_4_1onaonalc8azv6z.R.inc(31949);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1onaonalc8azv6z.R.inc(31950);zone = DateTimeZone.getDefault();
        __CLR4_4_1onaonalc8azv6z.R.inc(31951);DateTimeZone.setDefault(MOSCOW);
    }finally{__CLR4_4_1onaonalc8azv6z.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1onaonalc8azv6z.R.inc(31952);
        __CLR4_4_1onaonalc8azv6z.R.inc(31953);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1onaonalc8azv6z.R.inc(31954);DateTimeZone.setDefault(zone);
        __CLR4_4_1onaonalc8azv6z.R.inc(31955);zone = null;
    }finally{__CLR4_4_1onaonalc8azv6z.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testParse_noFormatter() throws Throwable {__CLR4_4_1onaonalc8azv6z.R.globalSliceStart(getClass().getName(),31956);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1o2oqviono();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1onaonalc8azv6z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1onaonalc8azv6z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Constructors.testParse_noFormatter",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31956,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1o2oqviono() throws Throwable{try{__CLR4_4_1onaonalc8azv6z.R.inc(31956);
        __CLR4_4_1onaonalc8azv6z.R.inc(31957);assertEquals(new LocalDateTime(2010, 6, 30, 1, 20), LocalDateTime.parse("2010-06-30T01:20"));
        __CLR4_4_1onaonalc8azv6z.R.inc(31958);assertEquals(new LocalDateTime(2010, 1, 2, 14, 50, 30, 432), LocalDateTime.parse("2010-002T14:50:30.432"));
    }finally{__CLR4_4_1onaonalc8azv6z.R.flushNeeded();}}

    public void testParse_formatter() throws Throwable {__CLR4_4_1onaonalc8azv6z.R.globalSliceStart(getClass().getName(),31959);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15wvtnxonr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1onaonalc8azv6z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1onaonalc8azv6z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Constructors.testParse_formatter",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31959,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15wvtnxonr() throws Throwable{try{__CLR4_4_1onaonalc8azv6z.R.inc(31959);
        __CLR4_4_1onaonalc8azv6z.R.inc(31960);DateTimeFormatter f = DateTimeFormat.forPattern("yyyy--dd MM HH").withChronology(ISOChronology.getInstance(PARIS));
        __CLR4_4_1onaonalc8azv6z.R.inc(31961);assertEquals(new LocalDateTime(2010, 6, 30, 13, 0), LocalDateTime.parse("2010--30 06 13", f));
    }finally{__CLR4_4_1onaonalc8azv6z.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testFactory_fromCalendarFields() throws Exception {__CLR4_4_1onaonalc8azv6z.R.globalSliceStart(getClass().getName(),31962);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1l8hq5ronu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1onaonalc8azv6z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1onaonalc8azv6z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Constructors.testFactory_fromCalendarFields",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31962,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1l8hq5ronu() throws Exception{try{__CLR4_4_1onaonalc8azv6z.R.inc(31962);
        __CLR4_4_1onaonalc8azv6z.R.inc(31963);GregorianCalendar cal = new GregorianCalendar(1970, 1, 3, 4, 5, 6);
        __CLR4_4_1onaonalc8azv6z.R.inc(31964);cal.set(Calendar.MILLISECOND, 7);
        __CLR4_4_1onaonalc8azv6z.R.inc(31965);LocalDateTime expected = new LocalDateTime(1970, 2, 3, 4, 5, 6, 7);
        __CLR4_4_1onaonalc8azv6z.R.inc(31966);assertEquals(expected, LocalDateTime.fromCalendarFields(cal));
    }finally{__CLR4_4_1onaonalc8azv6z.R.flushNeeded();}}

    public void testFactory_fromCalendarFields_beforeYearZero1() throws Exception {__CLR4_4_1onaonalc8azv6z.R.globalSliceStart(getClass().getName(),31967);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_146vol9onz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1onaonalc8azv6z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1onaonalc8azv6z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Constructors.testFactory_fromCalendarFields_beforeYearZero1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31967,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_146vol9onz() throws Exception{try{__CLR4_4_1onaonalc8azv6z.R.inc(31967);
        __CLR4_4_1onaonalc8azv6z.R.inc(31968);GregorianCalendar cal = new GregorianCalendar(1, 1, 3, 4, 5, 6);
        __CLR4_4_1onaonalc8azv6z.R.inc(31969);cal.set(Calendar.ERA, GregorianCalendar.BC);
        __CLR4_4_1onaonalc8azv6z.R.inc(31970);cal.set(Calendar.MILLISECOND, 7);
        __CLR4_4_1onaonalc8azv6z.R.inc(31971);LocalDateTime expected = new LocalDateTime(0, 2, 3, 4, 5, 6, 7);
        __CLR4_4_1onaonalc8azv6z.R.inc(31972);assertEquals(expected, LocalDateTime.fromCalendarFields(cal));
    }finally{__CLR4_4_1onaonalc8azv6z.R.flushNeeded();}}

    public void testFactory_fromCalendarFields_beforeYearZero3() throws Exception {__CLR4_4_1onaonalc8azv6z.R.globalSliceStart(getClass().getName(),31973);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1aovm67oo5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1onaonalc8azv6z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1onaonalc8azv6z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Constructors.testFactory_fromCalendarFields_beforeYearZero3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31973,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1aovm67oo5() throws Exception{try{__CLR4_4_1onaonalc8azv6z.R.inc(31973);
        __CLR4_4_1onaonalc8azv6z.R.inc(31974);GregorianCalendar cal = new GregorianCalendar(3, 1, 3, 4, 5, 6);
        __CLR4_4_1onaonalc8azv6z.R.inc(31975);cal.set(Calendar.ERA, GregorianCalendar.BC);
        __CLR4_4_1onaonalc8azv6z.R.inc(31976);cal.set(Calendar.MILLISECOND, 7);
        __CLR4_4_1onaonalc8azv6z.R.inc(31977);LocalDateTime expected = new LocalDateTime(-2, 2, 3, 4, 5, 6, 7);
        __CLR4_4_1onaonalc8azv6z.R.inc(31978);assertEquals(expected, LocalDateTime.fromCalendarFields(cal));
    }finally{__CLR4_4_1onaonalc8azv6z.R.flushNeeded();}}

    public void testFactory_fromCalendarFields_null() throws Exception {__CLR4_4_1onaonalc8azv6z.R.globalSliceStart(getClass().getName(),31979);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qcawzfoob();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1onaonalc8azv6z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1onaonalc8azv6z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Constructors.testFactory_fromCalendarFields_null",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31979,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qcawzfoob() throws Exception{try{__CLR4_4_1onaonalc8azv6z.R.inc(31979);
        __CLR4_4_1onaonalc8azv6z.R.inc(31980);try {
            __CLR4_4_1onaonalc8azv6z.R.inc(31981);LocalDateTime.fromCalendarFields((Calendar) null);
            __CLR4_4_1onaonalc8azv6z.R.inc(31982);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1onaonalc8azv6z.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testFactory_fromDateFields_after1970() throws Exception {__CLR4_4_1onaonalc8azv6z.R.globalSliceStart(getClass().getName(),31983);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16vvmm5oof();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1onaonalc8azv6z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1onaonalc8azv6z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Constructors.testFactory_fromDateFields_after1970",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31983,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16vvmm5oof() throws Exception{try{__CLR4_4_1onaonalc8azv6z.R.inc(31983);
        __CLR4_4_1onaonalc8azv6z.R.inc(31984);GregorianCalendar cal = new GregorianCalendar(1970, 1, 3, 4, 5, 6);
        __CLR4_4_1onaonalc8azv6z.R.inc(31985);cal.set(Calendar.MILLISECOND, 7);
        __CLR4_4_1onaonalc8azv6z.R.inc(31986);LocalDateTime expected = new LocalDateTime(1970, 2, 3, 4, 5 ,6, 7);
        __CLR4_4_1onaonalc8azv6z.R.inc(31987);assertEquals(expected, LocalDateTime.fromDateFields(cal.getTime()));
    }finally{__CLR4_4_1onaonalc8azv6z.R.flushNeeded();}}

    public void testFactory_fromDateFields_before1970() throws Exception {__CLR4_4_1onaonalc8azv6z.R.globalSliceStart(getClass().getName(),31988);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xuspjmook();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1onaonalc8azv6z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1onaonalc8azv6z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Constructors.testFactory_fromDateFields_before1970",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31988,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xuspjmook() throws Exception{try{__CLR4_4_1onaonalc8azv6z.R.inc(31988);
        __CLR4_4_1onaonalc8azv6z.R.inc(31989);GregorianCalendar cal = new GregorianCalendar(1969, 1, 3, 4, 5, 6);
        __CLR4_4_1onaonalc8azv6z.R.inc(31990);cal.set(Calendar.MILLISECOND, 7);
        __CLR4_4_1onaonalc8azv6z.R.inc(31991);LocalDateTime expected = new LocalDateTime(1969, 2, 3, 4, 5 ,6, 7);
        __CLR4_4_1onaonalc8azv6z.R.inc(31992);assertEquals(expected, LocalDateTime.fromDateFields(cal.getTime()));
    }finally{__CLR4_4_1onaonalc8azv6z.R.flushNeeded();}}

    public void testFactory_fromDateFields_beforeYearZero1() throws Exception {__CLR4_4_1onaonalc8azv6z.R.globalSliceStart(getClass().getName(),31993);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tr9m3xoop();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1onaonalc8azv6z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1onaonalc8azv6z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Constructors.testFactory_fromDateFields_beforeYearZero1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31993,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tr9m3xoop() throws Exception{try{__CLR4_4_1onaonalc8azv6z.R.inc(31993);
        __CLR4_4_1onaonalc8azv6z.R.inc(31994);GregorianCalendar cal = new GregorianCalendar(1, 1, 3, 4, 5, 6);
        __CLR4_4_1onaonalc8azv6z.R.inc(31995);cal.set(Calendar.ERA, GregorianCalendar.BC);
        __CLR4_4_1onaonalc8azv6z.R.inc(31996);cal.set(Calendar.MILLISECOND, 7);
        __CLR4_4_1onaonalc8azv6z.R.inc(31997);LocalDateTime expected = new LocalDateTime(0, 2, 3, 4, 5, 6, 7);
        __CLR4_4_1onaonalc8azv6z.R.inc(31998);assertEquals(expected, LocalDateTime.fromDateFields(cal.getTime()));
    }finally{__CLR4_4_1onaonalc8azv6z.R.flushNeeded();}}

    public void testFactory_fromDateFields_beforeYearZero3() throws Exception {__CLR4_4_1onaonalc8azv6z.R.globalSliceStart(getClass().getName(),31999);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yruia9oov();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1onaonalc8azv6z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1onaonalc8azv6z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Constructors.testFactory_fromDateFields_beforeYearZero3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31999,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yruia9oov() throws Exception{try{__CLR4_4_1onaonalc8azv6z.R.inc(31999);
        __CLR4_4_1onaonalc8azv6z.R.inc(32000);GregorianCalendar cal = new GregorianCalendar(3, 1, 3, 4, 5, 6);
        __CLR4_4_1onaonalc8azv6z.R.inc(32001);cal.set(Calendar.ERA, GregorianCalendar.BC);
        __CLR4_4_1onaonalc8azv6z.R.inc(32002);cal.set(Calendar.MILLISECOND, 7);
        __CLR4_4_1onaonalc8azv6z.R.inc(32003);LocalDateTime expected = new LocalDateTime(-2, 2, 3, 4, 5, 6, 7);
        __CLR4_4_1onaonalc8azv6z.R.inc(32004);assertEquals(expected, LocalDateTime.fromDateFields(cal.getTime()));
    }finally{__CLR4_4_1onaonalc8azv6z.R.flushNeeded();}}

    public void testFactory_fromDateFields_null() throws Exception {__CLR4_4_1onaonalc8azv6z.R.globalSliceStart(getClass().getName(),32005);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qt5qc5op1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1onaonalc8azv6z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1onaonalc8azv6z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Constructors.testFactory_fromDateFields_null",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32005,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qt5qc5op1() throws Exception{try{__CLR4_4_1onaonalc8azv6z.R.inc(32005);
        __CLR4_4_1onaonalc8azv6z.R.inc(32006);try {
            __CLR4_4_1onaonalc8azv6z.R.inc(32007);LocalDateTime.fromDateFields((Date) null);
            __CLR4_4_1onaonalc8azv6z.R.inc(32008);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1onaonalc8azv6z.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testConstructor() throws Throwable {__CLR4_4_1onaonalc8azv6z.R.globalSliceStart(getClass().getName(),32009);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uefs8hop5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1onaonalc8azv6z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1onaonalc8azv6z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Constructors.testConstructor",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32009,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uefs8hop5() throws Throwable{try{__CLR4_4_1onaonalc8azv6z.R.inc(32009);
        __CLR4_4_1onaonalc8azv6z.R.inc(32010);LocalDateTime test = new LocalDateTime();
        __CLR4_4_1onaonalc8azv6z.R.inc(32011);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1onaonalc8azv6z.R.inc(32012);assertEquals(1970, test.getYear());
        __CLR4_4_1onaonalc8azv6z.R.inc(32013);assertEquals(6, test.getMonthOfYear());
        __CLR4_4_1onaonalc8azv6z.R.inc(32014);assertEquals(9, test.getDayOfMonth());
        __CLR4_4_1onaonalc8azv6z.R.inc(32015);assertEquals(10 + OFFSET_MOSCOW, test.getHourOfDay());
        __CLR4_4_1onaonalc8azv6z.R.inc(32016);assertEquals(20, test.getMinuteOfHour());
        __CLR4_4_1onaonalc8azv6z.R.inc(32017);assertEquals(30, test.getSecondOfMinute());
        __CLR4_4_1onaonalc8azv6z.R.inc(32018);assertEquals(40, test.getMillisOfSecond());
        __CLR4_4_1onaonalc8azv6z.R.inc(32019);assertEquals(test, LocalDateTime.now());
    }finally{__CLR4_4_1onaonalc8azv6z.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testConstructor_DateTimeZone() throws Throwable {__CLR4_4_1onaonalc8azv6z.R.globalSliceStart(getClass().getName(),32020);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1z4m1k5opg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1onaonalc8azv6z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1onaonalc8azv6z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Constructors.testConstructor_DateTimeZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32020,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1z4m1k5opg() throws Throwable{try{__CLR4_4_1onaonalc8azv6z.R.inc(32020);
        __CLR4_4_1onaonalc8azv6z.R.inc(32021);DateTime dt = new DateTime(2005, 6, 8, 23, 59, 0, 0, LONDON);
        __CLR4_4_1onaonalc8azv6z.R.inc(32022);DateTimeUtils.setCurrentMillisFixed(dt.getMillis());
        // 23:59 in London is 00:59 the following day in Paris
        
        __CLR4_4_1onaonalc8azv6z.R.inc(32023);LocalDateTime test = new LocalDateTime(LONDON);
        __CLR4_4_1onaonalc8azv6z.R.inc(32024);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1onaonalc8azv6z.R.inc(32025);assertEquals(2005, test.getYear());
        __CLR4_4_1onaonalc8azv6z.R.inc(32026);assertEquals(6, test.getMonthOfYear());
        __CLR4_4_1onaonalc8azv6z.R.inc(32027);assertEquals(8, test.getDayOfMonth());
        __CLR4_4_1onaonalc8azv6z.R.inc(32028);assertEquals(23, test.getHourOfDay());
        __CLR4_4_1onaonalc8azv6z.R.inc(32029);assertEquals(59, test.getMinuteOfHour());
        __CLR4_4_1onaonalc8azv6z.R.inc(32030);assertEquals(0, test.getSecondOfMinute());
        __CLR4_4_1onaonalc8azv6z.R.inc(32031);assertEquals(0, test.getMillisOfSecond());
        __CLR4_4_1onaonalc8azv6z.R.inc(32032);assertEquals(test, LocalDateTime.now(LONDON));
        
        __CLR4_4_1onaonalc8azv6z.R.inc(32033);test = new LocalDateTime(PARIS);
        __CLR4_4_1onaonalc8azv6z.R.inc(32034);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1onaonalc8azv6z.R.inc(32035);assertEquals(2005, test.getYear());
        __CLR4_4_1onaonalc8azv6z.R.inc(32036);assertEquals(6, test.getMonthOfYear());
        __CLR4_4_1onaonalc8azv6z.R.inc(32037);assertEquals(9, test.getDayOfMonth());
        __CLR4_4_1onaonalc8azv6z.R.inc(32038);assertEquals(0, test.getHourOfDay());
        __CLR4_4_1onaonalc8azv6z.R.inc(32039);assertEquals(59, test.getMinuteOfHour());
        __CLR4_4_1onaonalc8azv6z.R.inc(32040);assertEquals(0, test.getSecondOfMinute());
        __CLR4_4_1onaonalc8azv6z.R.inc(32041);assertEquals(0, test.getMillisOfSecond());
        __CLR4_4_1onaonalc8azv6z.R.inc(32042);assertEquals(test, LocalDateTime.now(PARIS));
    }finally{__CLR4_4_1onaonalc8azv6z.R.flushNeeded();}}

    public void testConstructor_nullDateTimeZone() throws Throwable {__CLR4_4_1onaonalc8azv6z.R.globalSliceStart(getClass().getName(),32043);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17zs1rooq3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1onaonalc8azv6z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1onaonalc8azv6z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Constructors.testConstructor_nullDateTimeZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32043,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17zs1rooq3() throws Throwable{try{__CLR4_4_1onaonalc8azv6z.R.inc(32043);
        __CLR4_4_1onaonalc8azv6z.R.inc(32044);LocalDateTime test = new LocalDateTime((DateTimeZone) null);
        __CLR4_4_1onaonalc8azv6z.R.inc(32045);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1onaonalc8azv6z.R.inc(32046);assertEquals(1970, test.getYear());
        __CLR4_4_1onaonalc8azv6z.R.inc(32047);assertEquals(6, test.getMonthOfYear());
        __CLR4_4_1onaonalc8azv6z.R.inc(32048);assertEquals(9, test.getDayOfMonth());
        __CLR4_4_1onaonalc8azv6z.R.inc(32049);assertEquals(10 + OFFSET_MOSCOW, test.getHourOfDay());
        __CLR4_4_1onaonalc8azv6z.R.inc(32050);assertEquals(20, test.getMinuteOfHour());
        __CLR4_4_1onaonalc8azv6z.R.inc(32051);assertEquals(30, test.getSecondOfMinute());
        __CLR4_4_1onaonalc8azv6z.R.inc(32052);assertEquals(40, test.getMillisOfSecond());
    }finally{__CLR4_4_1onaonalc8azv6z.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testConstructor_Chronology() throws Throwable {__CLR4_4_1onaonalc8azv6z.R.globalSliceStart(getClass().getName(),32053);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15931tioqd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1onaonalc8azv6z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1onaonalc8azv6z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Constructors.testConstructor_Chronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32053,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15931tioqd() throws Throwable{try{__CLR4_4_1onaonalc8azv6z.R.inc(32053);
        __CLR4_4_1onaonalc8azv6z.R.inc(32054);LocalDateTime test = new LocalDateTime(GREGORIAN_PARIS);
        __CLR4_4_1onaonalc8azv6z.R.inc(32055);assertEquals(GREGORIAN_UTC, test.getChronology());
        __CLR4_4_1onaonalc8azv6z.R.inc(32056);assertEquals(1970, test.getYear());
        __CLR4_4_1onaonalc8azv6z.R.inc(32057);assertEquals(6, test.getMonthOfYear());
        __CLR4_4_1onaonalc8azv6z.R.inc(32058);assertEquals(9, test.getDayOfMonth());
        __CLR4_4_1onaonalc8azv6z.R.inc(32059);assertEquals(10 + OFFSET_PARIS, test.getHourOfDay());
        __CLR4_4_1onaonalc8azv6z.R.inc(32060);assertEquals(20, test.getMinuteOfHour());
        __CLR4_4_1onaonalc8azv6z.R.inc(32061);assertEquals(30, test.getSecondOfMinute());
        __CLR4_4_1onaonalc8azv6z.R.inc(32062);assertEquals(40, test.getMillisOfSecond());
        __CLR4_4_1onaonalc8azv6z.R.inc(32063);assertEquals(test, LocalDateTime.now(GREGORIAN_PARIS));
    }finally{__CLR4_4_1onaonalc8azv6z.R.flushNeeded();}}

    public void testConstructor_nullChronology() throws Throwable {__CLR4_4_1onaonalc8azv6z.R.globalSliceStart(getClass().getName(),32064);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15qcb6roqo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1onaonalc8azv6z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1onaonalc8azv6z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Constructors.testConstructor_nullChronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32064,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15qcb6roqo() throws Throwable{try{__CLR4_4_1onaonalc8azv6z.R.inc(32064);
        __CLR4_4_1onaonalc8azv6z.R.inc(32065);LocalDateTime test = new LocalDateTime((Chronology) null);
        __CLR4_4_1onaonalc8azv6z.R.inc(32066);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1onaonalc8azv6z.R.inc(32067);assertEquals(1970, test.getYear());
        __CLR4_4_1onaonalc8azv6z.R.inc(32068);assertEquals(6, test.getMonthOfYear());
        __CLR4_4_1onaonalc8azv6z.R.inc(32069);assertEquals(9, test.getDayOfMonth());
        __CLR4_4_1onaonalc8azv6z.R.inc(32070);assertEquals(10 + OFFSET_MOSCOW, test.getHourOfDay());
        __CLR4_4_1onaonalc8azv6z.R.inc(32071);assertEquals(20, test.getMinuteOfHour());
        __CLR4_4_1onaonalc8azv6z.R.inc(32072);assertEquals(30, test.getSecondOfMinute());
        __CLR4_4_1onaonalc8azv6z.R.inc(32073);assertEquals(40, test.getMillisOfSecond());
    }finally{__CLR4_4_1onaonalc8azv6z.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testConstructor_long1() throws Throwable {__CLR4_4_1onaonalc8azv6z.R.globalSliceStart(getClass().getName(),32074);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wi13croqy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1onaonalc8azv6z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1onaonalc8azv6z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Constructors.testConstructor_long1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32074,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wi13croqy() throws Throwable{try{__CLR4_4_1onaonalc8azv6z.R.inc(32074);
        __CLR4_4_1onaonalc8azv6z.R.inc(32075);LocalDateTime test = new LocalDateTime(TEST_TIME1);
        __CLR4_4_1onaonalc8azv6z.R.inc(32076);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1onaonalc8azv6z.R.inc(32077);assertEquals(1970, test.getYear());
        __CLR4_4_1onaonalc8azv6z.R.inc(32078);assertEquals(4, test.getMonthOfYear());
        __CLR4_4_1onaonalc8azv6z.R.inc(32079);assertEquals(6, test.getDayOfMonth());
        __CLR4_4_1onaonalc8azv6z.R.inc(32080);assertEquals(12 + OFFSET_MOSCOW, test.getHourOfDay());
        __CLR4_4_1onaonalc8azv6z.R.inc(32081);assertEquals(24, test.getMinuteOfHour());
        __CLR4_4_1onaonalc8azv6z.R.inc(32082);assertEquals(0, test.getSecondOfMinute());
        __CLR4_4_1onaonalc8azv6z.R.inc(32083);assertEquals(0, test.getMillisOfSecond());
    }finally{__CLR4_4_1onaonalc8azv6z.R.flushNeeded();}}

    public void testConstructor_long2() throws Throwable {__CLR4_4_1onaonalc8azv6z.R.globalSliceStart(getClass().getName(),32084);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1t914kaor8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1onaonalc8azv6z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1onaonalc8azv6z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Constructors.testConstructor_long2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32084,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1t914kaor8() throws Throwable{try{__CLR4_4_1onaonalc8azv6z.R.inc(32084);
        __CLR4_4_1onaonalc8azv6z.R.inc(32085);LocalDateTime test = new LocalDateTime(TEST_TIME2);
        __CLR4_4_1onaonalc8azv6z.R.inc(32086);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1onaonalc8azv6z.R.inc(32087);assertEquals(1971, test.getYear());
        __CLR4_4_1onaonalc8azv6z.R.inc(32088);assertEquals(5, test.getMonthOfYear());
        __CLR4_4_1onaonalc8azv6z.R.inc(32089);assertEquals(7, test.getDayOfMonth());
        __CLR4_4_1onaonalc8azv6z.R.inc(32090);assertEquals(14 + OFFSET_MOSCOW, test.getHourOfDay());
        __CLR4_4_1onaonalc8azv6z.R.inc(32091);assertEquals(28, test.getMinuteOfHour());
        __CLR4_4_1onaonalc8azv6z.R.inc(32092);assertEquals(0, test.getSecondOfMinute());
        __CLR4_4_1onaonalc8azv6z.R.inc(32093);assertEquals(0, test.getMillisOfSecond());
    }finally{__CLR4_4_1onaonalc8azv6z.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testConstructor_long1_DateTimeZone() throws Throwable {__CLR4_4_1onaonalc8azv6z.R.globalSliceStart(getClass().getName(),32094);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mej2a9ori();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1onaonalc8azv6z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1onaonalc8azv6z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Constructors.testConstructor_long1_DateTimeZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32094,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mej2a9ori() throws Throwable{try{__CLR4_4_1onaonalc8azv6z.R.inc(32094);
        __CLR4_4_1onaonalc8azv6z.R.inc(32095);LocalDateTime test = new LocalDateTime(TEST_TIME1, PARIS);
        __CLR4_4_1onaonalc8azv6z.R.inc(32096);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1onaonalc8azv6z.R.inc(32097);assertEquals(1970, test.getYear());
        __CLR4_4_1onaonalc8azv6z.R.inc(32098);assertEquals(4, test.getMonthOfYear());
        __CLR4_4_1onaonalc8azv6z.R.inc(32099);assertEquals(6, test.getDayOfMonth());
        __CLR4_4_1onaonalc8azv6z.R.inc(32100);assertEquals(12 + OFFSET_PARIS, test.getHourOfDay());
        __CLR4_4_1onaonalc8azv6z.R.inc(32101);assertEquals(24, test.getMinuteOfHour());
        __CLR4_4_1onaonalc8azv6z.R.inc(32102);assertEquals(0, test.getSecondOfMinute());
        __CLR4_4_1onaonalc8azv6z.R.inc(32103);assertEquals(0, test.getMillisOfSecond());
    }finally{__CLR4_4_1onaonalc8azv6z.R.flushNeeded();}}

    public void testConstructor_long2_DateTimeZone() throws Throwable {__CLR4_4_1onaonalc8azv6z.R.globalSliceStart(getClass().getName(),32104);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s1hd9qors();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1onaonalc8azv6z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1onaonalc8azv6z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Constructors.testConstructor_long2_DateTimeZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32104,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s1hd9qors() throws Throwable{try{__CLR4_4_1onaonalc8azv6z.R.inc(32104);
        __CLR4_4_1onaonalc8azv6z.R.inc(32105);LocalDateTime test = new LocalDateTime(TEST_TIME2, PARIS);
        __CLR4_4_1onaonalc8azv6z.R.inc(32106);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1onaonalc8azv6z.R.inc(32107);assertEquals(1971, test.getYear());
        __CLR4_4_1onaonalc8azv6z.R.inc(32108);assertEquals(5, test.getMonthOfYear());
        __CLR4_4_1onaonalc8azv6z.R.inc(32109);assertEquals(7, test.getDayOfMonth());
        __CLR4_4_1onaonalc8azv6z.R.inc(32110);assertEquals(14 + OFFSET_PARIS, test.getHourOfDay());
        __CLR4_4_1onaonalc8azv6z.R.inc(32111);assertEquals(28, test.getMinuteOfHour());
        __CLR4_4_1onaonalc8azv6z.R.inc(32112);assertEquals(0, test.getSecondOfMinute());
        __CLR4_4_1onaonalc8azv6z.R.inc(32113);assertEquals(0, test.getMillisOfSecond());
    }finally{__CLR4_4_1onaonalc8azv6z.R.flushNeeded();}}

    public void testConstructor_long_nullDateTimeZone() throws Throwable {__CLR4_4_1onaonalc8azv6z.R.globalSliceStart(getClass().getName(),32114);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uv35a9os2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1onaonalc8azv6z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1onaonalc8azv6z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Constructors.testConstructor_long_nullDateTimeZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32114,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uv35a9os2() throws Throwable{try{__CLR4_4_1onaonalc8azv6z.R.inc(32114);
        __CLR4_4_1onaonalc8azv6z.R.inc(32115);LocalDateTime test = new LocalDateTime(TEST_TIME1, (DateTimeZone) null);
        __CLR4_4_1onaonalc8azv6z.R.inc(32116);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1onaonalc8azv6z.R.inc(32117);assertEquals(1970, test.getYear());
        __CLR4_4_1onaonalc8azv6z.R.inc(32118);assertEquals(4, test.getMonthOfYear());
        __CLR4_4_1onaonalc8azv6z.R.inc(32119);assertEquals(6, test.getDayOfMonth());
        __CLR4_4_1onaonalc8azv6z.R.inc(32120);assertEquals(12 + OFFSET_MOSCOW, test.getHourOfDay());
        __CLR4_4_1onaonalc8azv6z.R.inc(32121);assertEquals(24, test.getMinuteOfHour());
        __CLR4_4_1onaonalc8azv6z.R.inc(32122);assertEquals(0, test.getSecondOfMinute());
        __CLR4_4_1onaonalc8azv6z.R.inc(32123);assertEquals(0, test.getMillisOfSecond());
    }finally{__CLR4_4_1onaonalc8azv6z.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testConstructor_long1_Chronology() throws Throwable {__CLR4_4_1onaonalc8azv6z.R.globalSliceStart(getClass().getName(),32124);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_115wn5sosc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1onaonalc8azv6z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1onaonalc8azv6z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Constructors.testConstructor_long1_Chronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32124,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_115wn5sosc() throws Throwable{try{__CLR4_4_1onaonalc8azv6z.R.inc(32124);
        __CLR4_4_1onaonalc8azv6z.R.inc(32125);LocalDateTime test = new LocalDateTime(TEST_TIME1, GREGORIAN_PARIS);
        __CLR4_4_1onaonalc8azv6z.R.inc(32126);assertEquals(GREGORIAN_UTC, test.getChronology());
        __CLR4_4_1onaonalc8azv6z.R.inc(32127);assertEquals(1970, test.getYear());
        __CLR4_4_1onaonalc8azv6z.R.inc(32128);assertEquals(4, test.getMonthOfYear());
        __CLR4_4_1onaonalc8azv6z.R.inc(32129);assertEquals(6, test.getDayOfMonth());
        __CLR4_4_1onaonalc8azv6z.R.inc(32130);assertEquals(12 + OFFSET_PARIS, test.getHourOfDay());
        __CLR4_4_1onaonalc8azv6z.R.inc(32131);assertEquals(24, test.getMinuteOfHour());
        __CLR4_4_1onaonalc8azv6z.R.inc(32132);assertEquals(0, test.getSecondOfMinute());
        __CLR4_4_1onaonalc8azv6z.R.inc(32133);assertEquals(0, test.getMillisOfSecond());
    }finally{__CLR4_4_1onaonalc8azv6z.R.flushNeeded();}}

    public void testConstructor_long2_Chronology() throws Throwable {__CLR4_4_1onaonalc8azv6z.R.globalSliceStart(getClass().getName(),32134);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14nqmkhosm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1onaonalc8azv6z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1onaonalc8azv6z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Constructors.testConstructor_long2_Chronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32134,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14nqmkhosm() throws Throwable{try{__CLR4_4_1onaonalc8azv6z.R.inc(32134);
        __CLR4_4_1onaonalc8azv6z.R.inc(32135);LocalDateTime test = new LocalDateTime(TEST_TIME2, GREGORIAN_PARIS);
        __CLR4_4_1onaonalc8azv6z.R.inc(32136);assertEquals(GREGORIAN_UTC, test.getChronology());
        __CLR4_4_1onaonalc8azv6z.R.inc(32137);assertEquals(1971, test.getYear());
        __CLR4_4_1onaonalc8azv6z.R.inc(32138);assertEquals(5, test.getMonthOfYear());
        __CLR4_4_1onaonalc8azv6z.R.inc(32139);assertEquals(7, test.getDayOfMonth());
        __CLR4_4_1onaonalc8azv6z.R.inc(32140);assertEquals(14 + OFFSET_PARIS, test.getHourOfDay());
        __CLR4_4_1onaonalc8azv6z.R.inc(32141);assertEquals(28, test.getMinuteOfHour());
        __CLR4_4_1onaonalc8azv6z.R.inc(32142);assertEquals(0, test.getSecondOfMinute());
        __CLR4_4_1onaonalc8azv6z.R.inc(32143);assertEquals(0, test.getMillisOfSecond());
    }finally{__CLR4_4_1onaonalc8azv6z.R.flushNeeded();}}

    public void testConstructor_long_nullChronology() throws Throwable {__CLR4_4_1onaonalc8azv6z.R.globalSliceStart(getClass().getName(),32144);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nnhckuosw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1onaonalc8azv6z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1onaonalc8azv6z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Constructors.testConstructor_long_nullChronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32144,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nnhckuosw() throws Throwable{try{__CLR4_4_1onaonalc8azv6z.R.inc(32144);
        __CLR4_4_1onaonalc8azv6z.R.inc(32145);LocalDateTime test = new LocalDateTime(TEST_TIME1, (Chronology) null);
        __CLR4_4_1onaonalc8azv6z.R.inc(32146);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1onaonalc8azv6z.R.inc(32147);assertEquals(1970, test.getYear());
        __CLR4_4_1onaonalc8azv6z.R.inc(32148);assertEquals(4, test.getMonthOfYear());
        __CLR4_4_1onaonalc8azv6z.R.inc(32149);assertEquals(6, test.getDayOfMonth());
        __CLR4_4_1onaonalc8azv6z.R.inc(32150);assertEquals(12 + OFFSET_MOSCOW, test.getHourOfDay());
        __CLR4_4_1onaonalc8azv6z.R.inc(32151);assertEquals(24, test.getMinuteOfHour());
        __CLR4_4_1onaonalc8azv6z.R.inc(32152);assertEquals(0, test.getSecondOfMinute());
        __CLR4_4_1onaonalc8azv6z.R.inc(32153);assertEquals(0, test.getMillisOfSecond());
    }finally{__CLR4_4_1onaonalc8azv6z.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testConstructor_Object1() throws Throwable {__CLR4_4_1onaonalc8azv6z.R.globalSliceStart(getClass().getName(),32154);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19oqxcyot6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1onaonalc8azv6z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1onaonalc8azv6z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Constructors.testConstructor_Object1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32154,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19oqxcyot6() throws Throwable{try{__CLR4_4_1onaonalc8azv6z.R.inc(32154);
        __CLR4_4_1onaonalc8azv6z.R.inc(32155);Date date = new Date(TEST_TIME1);
        __CLR4_4_1onaonalc8azv6z.R.inc(32156);LocalDateTime test = new LocalDateTime(date);
        __CLR4_4_1onaonalc8azv6z.R.inc(32157);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1onaonalc8azv6z.R.inc(32158);assertEquals(1970, test.getYear());
        __CLR4_4_1onaonalc8azv6z.R.inc(32159);assertEquals(4, test.getMonthOfYear());
        __CLR4_4_1onaonalc8azv6z.R.inc(32160);assertEquals(6, test.getDayOfMonth());
        __CLR4_4_1onaonalc8azv6z.R.inc(32161);assertEquals(12 + OFFSET_MOSCOW, test.getHourOfDay());
        __CLR4_4_1onaonalc8azv6z.R.inc(32162);assertEquals(24, test.getMinuteOfHour());
        __CLR4_4_1onaonalc8azv6z.R.inc(32163);assertEquals(0, test.getSecondOfMinute());
        __CLR4_4_1onaonalc8azv6z.R.inc(32164);assertEquals(0, test.getMillisOfSecond());
    }finally{__CLR4_4_1onaonalc8azv6z.R.flushNeeded();}}

    public void testConstructor_nullObject() throws Throwable {__CLR4_4_1onaonalc8azv6z.R.globalSliceStart(getClass().getName(),32165);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lt59ukoth();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1onaonalc8azv6z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1onaonalc8azv6z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Constructors.testConstructor_nullObject",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32165,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lt59ukoth() throws Throwable{try{__CLR4_4_1onaonalc8azv6z.R.inc(32165);
        __CLR4_4_1onaonalc8azv6z.R.inc(32166);LocalDateTime test = new LocalDateTime((Object) null);
        __CLR4_4_1onaonalc8azv6z.R.inc(32167);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1onaonalc8azv6z.R.inc(32168);assertEquals(1970, test.getYear());
        __CLR4_4_1onaonalc8azv6z.R.inc(32169);assertEquals(6, test.getMonthOfYear());
        __CLR4_4_1onaonalc8azv6z.R.inc(32170);assertEquals(9, test.getDayOfMonth());
        __CLR4_4_1onaonalc8azv6z.R.inc(32171);assertEquals(10 + OFFSET_MOSCOW, test.getHourOfDay());
        __CLR4_4_1onaonalc8azv6z.R.inc(32172);assertEquals(20, test.getMinuteOfHour());
        __CLR4_4_1onaonalc8azv6z.R.inc(32173);assertEquals(30, test.getSecondOfMinute());
        __CLR4_4_1onaonalc8azv6z.R.inc(32174);assertEquals(40, test.getMillisOfSecond());
    }finally{__CLR4_4_1onaonalc8azv6z.R.flushNeeded();}}

    public void testConstructor_ObjectString1() throws Throwable {__CLR4_4_1onaonalc8azv6z.R.globalSliceStart(getClass().getName(),32175);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11c2b5dotr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1onaonalc8azv6z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1onaonalc8azv6z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Constructors.testConstructor_ObjectString1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32175,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11c2b5dotr() throws Throwable{try{__CLR4_4_1onaonalc8azv6z.R.inc(32175);
        __CLR4_4_1onaonalc8azv6z.R.inc(32176);LocalDateTime test = new LocalDateTime("1972-04-06");
        __CLR4_4_1onaonalc8azv6z.R.inc(32177);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1onaonalc8azv6z.R.inc(32178);assertEquals(1972, test.getYear());
        __CLR4_4_1onaonalc8azv6z.R.inc(32179);assertEquals(4, test.getMonthOfYear());
        __CLR4_4_1onaonalc8azv6z.R.inc(32180);assertEquals(6, test.getDayOfMonth());
        __CLR4_4_1onaonalc8azv6z.R.inc(32181);assertEquals(0, test.getHourOfDay());
        __CLR4_4_1onaonalc8azv6z.R.inc(32182);assertEquals(0, test.getMinuteOfHour());
        __CLR4_4_1onaonalc8azv6z.R.inc(32183);assertEquals(0, test.getSecondOfMinute());
        __CLR4_4_1onaonalc8azv6z.R.inc(32184);assertEquals(0, test.getMillisOfSecond());
    }finally{__CLR4_4_1onaonalc8azv6z.R.flushNeeded();}}

    public void testConstructor_ObjectString2() throws Throwable {__CLR4_4_1onaonalc8azv6z.R.globalSliceStart(getClass().getName(),32185);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14l29xuou1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1onaonalc8azv6z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1onaonalc8azv6z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Constructors.testConstructor_ObjectString2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32185,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14l29xuou1() throws Throwable{try{__CLR4_4_1onaonalc8azv6z.R.inc(32185);
        __CLR4_4_1onaonalc8azv6z.R.inc(32186);LocalDateTime test = new LocalDateTime("1972-037");
        __CLR4_4_1onaonalc8azv6z.R.inc(32187);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1onaonalc8azv6z.R.inc(32188);assertEquals(1972, test.getYear());
        __CLR4_4_1onaonalc8azv6z.R.inc(32189);assertEquals(2, test.getMonthOfYear());
        __CLR4_4_1onaonalc8azv6z.R.inc(32190);assertEquals(6, test.getDayOfMonth());
        __CLR4_4_1onaonalc8azv6z.R.inc(32191);assertEquals(0, test.getHourOfDay());
        __CLR4_4_1onaonalc8azv6z.R.inc(32192);assertEquals(0, test.getMinuteOfHour());
        __CLR4_4_1onaonalc8azv6z.R.inc(32193);assertEquals(0, test.getSecondOfMinute());
        __CLR4_4_1onaonalc8azv6z.R.inc(32194);assertEquals(0, test.getMillisOfSecond());
    }finally{__CLR4_4_1onaonalc8azv6z.R.flushNeeded();}}

    public void testConstructor_ObjectString3() throws Throwable {__CLR4_4_1onaonalc8azv6z.R.globalSliceStart(getClass().getName(),32195);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17u28qboub();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1onaonalc8azv6z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1onaonalc8azv6z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Constructors.testConstructor_ObjectString3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32195,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17u28qboub() throws Throwable{try{__CLR4_4_1onaonalc8azv6z.R.inc(32195);
        __CLR4_4_1onaonalc8azv6z.R.inc(32196);LocalDateTime test = new LocalDateTime("1972-04-06T10:20:30.040");
        __CLR4_4_1onaonalc8azv6z.R.inc(32197);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1onaonalc8azv6z.R.inc(32198);assertEquals(1972, test.getYear());
        __CLR4_4_1onaonalc8azv6z.R.inc(32199);assertEquals(4, test.getMonthOfYear());
        __CLR4_4_1onaonalc8azv6z.R.inc(32200);assertEquals(6, test.getDayOfMonth());
        __CLR4_4_1onaonalc8azv6z.R.inc(32201);assertEquals(10, test.getHourOfDay());
        __CLR4_4_1onaonalc8azv6z.R.inc(32202);assertEquals(20, test.getMinuteOfHour());
        __CLR4_4_1onaonalc8azv6z.R.inc(32203);assertEquals(30, test.getSecondOfMinute());
        __CLR4_4_1onaonalc8azv6z.R.inc(32204);assertEquals(40, test.getMillisOfSecond());
    }finally{__CLR4_4_1onaonalc8azv6z.R.flushNeeded();}}

    public void testConstructor_ObjectString4() throws Throwable {__CLR4_4_1onaonalc8azv6z.R.globalSliceStart(getClass().getName(),32205);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1b327isoul();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1onaonalc8azv6z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1onaonalc8azv6z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Constructors.testConstructor_ObjectString4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32205,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1b327isoul() throws Throwable{try{__CLR4_4_1onaonalc8azv6z.R.inc(32205);
        __CLR4_4_1onaonalc8azv6z.R.inc(32206);LocalDateTime test = new LocalDateTime("1972-04-06T10:20");
        __CLR4_4_1onaonalc8azv6z.R.inc(32207);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1onaonalc8azv6z.R.inc(32208);assertEquals(1972, test.getYear());
        __CLR4_4_1onaonalc8azv6z.R.inc(32209);assertEquals(4, test.getMonthOfYear());
        __CLR4_4_1onaonalc8azv6z.R.inc(32210);assertEquals(6, test.getDayOfMonth());
        __CLR4_4_1onaonalc8azv6z.R.inc(32211);assertEquals(10, test.getHourOfDay());
        __CLR4_4_1onaonalc8azv6z.R.inc(32212);assertEquals(20, test.getMinuteOfHour());
        __CLR4_4_1onaonalc8azv6z.R.inc(32213);assertEquals(0, test.getSecondOfMinute());
        __CLR4_4_1onaonalc8azv6z.R.inc(32214);assertEquals(0, test.getMillisOfSecond());
    }finally{__CLR4_4_1onaonalc8azv6z.R.flushNeeded();}}

    public void testConstructor_ObjectStringEx1() throws Throwable {__CLR4_4_1onaonalc8azv6z.R.globalSliceStart(getClass().getName(),32215);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11dauleouv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1onaonalc8azv6z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1onaonalc8azv6z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Constructors.testConstructor_ObjectStringEx1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32215,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11dauleouv() throws Throwable{try{__CLR4_4_1onaonalc8azv6z.R.inc(32215);
        __CLR4_4_1onaonalc8azv6z.R.inc(32216);try {
            __CLR4_4_1onaonalc8azv6z.R.inc(32217);new LocalDateTime("1970-04-06T+14:00");
            __CLR4_4_1onaonalc8azv6z.R.inc(32218);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1onaonalc8azv6z.R.flushNeeded();}}

    public void testConstructor_ObjectStringEx2() throws Throwable {__CLR4_4_1onaonalc8azv6z.R.globalSliceStart(getClass().getName(),32219);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11vp473ouz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1onaonalc8azv6z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1onaonalc8azv6z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Constructors.testConstructor_ObjectStringEx2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32219,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11vp473ouz() throws Throwable{try{__CLR4_4_1onaonalc8azv6z.R.inc(32219);
        __CLR4_4_1onaonalc8azv6z.R.inc(32220);try {
            __CLR4_4_1onaonalc8azv6z.R.inc(32221);new LocalDateTime("1970-04-06T10:20:30.040+14:00");
            __CLR4_4_1onaonalc8azv6z.R.inc(32222);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1onaonalc8azv6z.R.flushNeeded();}}

    public void testConstructor_ObjectStringEx3() throws Throwable {__CLR4_4_1onaonalc8azv6z.R.globalSliceStart(getClass().getName(),32223);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_154p2zkov3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1onaonalc8azv6z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1onaonalc8azv6z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Constructors.testConstructor_ObjectStringEx3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32223,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_154p2zkov3() throws Throwable{try{__CLR4_4_1onaonalc8azv6z.R.inc(32223);
        __CLR4_4_1onaonalc8azv6z.R.inc(32224);try {
            __CLR4_4_1onaonalc8azv6z.R.inc(32225);new LocalDateTime("T10:20:30.040");
            __CLR4_4_1onaonalc8azv6z.R.inc(32226);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1onaonalc8azv6z.R.flushNeeded();}}

    public void testConstructor_ObjectStringEx4() throws Throwable {__CLR4_4_1onaonalc8azv6z.R.globalSliceStart(getClass().getName(),32227);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18dp1s1ov7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1onaonalc8azv6z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1onaonalc8azv6z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Constructors.testConstructor_ObjectStringEx4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32227,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18dp1s1ov7() throws Throwable{try{__CLR4_4_1onaonalc8azv6z.R.inc(32227);
        __CLR4_4_1onaonalc8azv6z.R.inc(32228);try {
            __CLR4_4_1onaonalc8azv6z.R.inc(32229);new LocalDateTime("T10:20:30.040+14:00");
            __CLR4_4_1onaonalc8azv6z.R.inc(32230);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1onaonalc8azv6z.R.flushNeeded();}}

    public void testConstructor_ObjectStringEx5() throws Throwable {__CLR4_4_1onaonalc8azv6z.R.globalSliceStart(getClass().getName(),32231);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bmp0kiovb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1onaonalc8azv6z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1onaonalc8azv6z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Constructors.testConstructor_ObjectStringEx5",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32231,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bmp0kiovb() throws Throwable{try{__CLR4_4_1onaonalc8azv6z.R.inc(32231);
        __CLR4_4_1onaonalc8azv6z.R.inc(32232);try {
            __CLR4_4_1onaonalc8azv6z.R.inc(32233);new LocalDateTime("10:20:30.040");
            __CLR4_4_1onaonalc8azv6z.R.inc(32234);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1onaonalc8azv6z.R.flushNeeded();}}

    public void testConstructor_ObjectStringEx6() throws Throwable {__CLR4_4_1onaonalc8azv6z.R.globalSliceStart(getClass().getName(),32235);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1evozczovf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1onaonalc8azv6z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1onaonalc8azv6z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Constructors.testConstructor_ObjectStringEx6",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32235,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1evozczovf() throws Throwable{try{__CLR4_4_1onaonalc8azv6z.R.inc(32235);
        __CLR4_4_1onaonalc8azv6z.R.inc(32236);try {
            __CLR4_4_1onaonalc8azv6z.R.inc(32237);new LocalDateTime("10:20:30.040+14:00");
            __CLR4_4_1onaonalc8azv6z.R.inc(32238);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1onaonalc8azv6z.R.flushNeeded();}}

    public void testConstructor_ObjectLocalDateTime() throws Throwable {__CLR4_4_1onaonalc8azv6z.R.globalSliceStart(getClass().getName(),32239);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kto907ovj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1onaonalc8azv6z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1onaonalc8azv6z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Constructors.testConstructor_ObjectLocalDateTime",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32239,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kto907ovj() throws Throwable{try{__CLR4_4_1onaonalc8azv6z.R.inc(32239);
        __CLR4_4_1onaonalc8azv6z.R.inc(32240);LocalDateTime dt = new LocalDateTime(1970, 5, 6, 10, 20, 30, 40, BUDDHIST_UTC);
        __CLR4_4_1onaonalc8azv6z.R.inc(32241);LocalDateTime test = new LocalDateTime(dt);
        __CLR4_4_1onaonalc8azv6z.R.inc(32242);assertEquals(BUDDHIST_UTC, test.getChronology());
        __CLR4_4_1onaonalc8azv6z.R.inc(32243);assertEquals(1970, test.getYear());
        __CLR4_4_1onaonalc8azv6z.R.inc(32244);assertEquals(5, test.getMonthOfYear());
        __CLR4_4_1onaonalc8azv6z.R.inc(32245);assertEquals(6, test.getDayOfMonth());
        __CLR4_4_1onaonalc8azv6z.R.inc(32246);assertEquals(10, test.getHourOfDay());
        __CLR4_4_1onaonalc8azv6z.R.inc(32247);assertEquals(20, test.getMinuteOfHour());
        __CLR4_4_1onaonalc8azv6z.R.inc(32248);assertEquals(30, test.getSecondOfMinute());
        __CLR4_4_1onaonalc8azv6z.R.inc(32249);assertEquals(40, test.getMillisOfSecond());
    }finally{__CLR4_4_1onaonalc8azv6z.R.flushNeeded();}}

    public void testConstructor_ObjectLocalDate() throws Throwable {__CLR4_4_1onaonalc8azv6z.R.globalSliceStart(getClass().getName(),32250);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1drwkayovu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1onaonalc8azv6z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1onaonalc8azv6z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Constructors.testConstructor_ObjectLocalDate",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32250,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1drwkayovu() throws Throwable{try{__CLR4_4_1onaonalc8azv6z.R.inc(32250);
        __CLR4_4_1onaonalc8azv6z.R.inc(32251);LocalDate date = new LocalDate(1970, 5, 6);
        __CLR4_4_1onaonalc8azv6z.R.inc(32252);try {
            __CLR4_4_1onaonalc8azv6z.R.inc(32253);new LocalDateTime(date);
            __CLR4_4_1onaonalc8azv6z.R.inc(32254);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1onaonalc8azv6z.R.flushNeeded();}}

    public void testConstructor_ObjectLocalTime() throws Throwable {__CLR4_4_1onaonalc8azv6z.R.globalSliceStart(getClass().getName(),32255);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18d94w9ovz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1onaonalc8azv6z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1onaonalc8azv6z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Constructors.testConstructor_ObjectLocalTime",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32255,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18d94w9ovz() throws Throwable{try{__CLR4_4_1onaonalc8azv6z.R.inc(32255);
        __CLR4_4_1onaonalc8azv6z.R.inc(32256);LocalTime time = new LocalTime(10, 20, 30, 40);
        __CLR4_4_1onaonalc8azv6z.R.inc(32257);try {
            __CLR4_4_1onaonalc8azv6z.R.inc(32258);new LocalDateTime(time);
            __CLR4_4_1onaonalc8azv6z.R.inc(32259);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1onaonalc8azv6z.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testConstructor_Object_DateTimeZone() throws Throwable {__CLR4_4_1onaonalc8azv6z.R.globalSliceStart(getClass().getName(),32260);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pk74vrow4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1onaonalc8azv6z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1onaonalc8azv6z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Constructors.testConstructor_Object_DateTimeZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32260,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pk74vrow4() throws Throwable{try{__CLR4_4_1onaonalc8azv6z.R.inc(32260);
        __CLR4_4_1onaonalc8azv6z.R.inc(32261);Date date = new Date(TEST_TIME1);
        __CLR4_4_1onaonalc8azv6z.R.inc(32262);LocalDateTime test = new LocalDateTime(date, PARIS);
        __CLR4_4_1onaonalc8azv6z.R.inc(32263);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1onaonalc8azv6z.R.inc(32264);assertEquals(1970, test.getYear());
        __CLR4_4_1onaonalc8azv6z.R.inc(32265);assertEquals(4, test.getMonthOfYear());
        __CLR4_4_1onaonalc8azv6z.R.inc(32266);assertEquals(6, test.getDayOfMonth());
        __CLR4_4_1onaonalc8azv6z.R.inc(32267);assertEquals(12 + OFFSET_PARIS, test.getHourOfDay());
        __CLR4_4_1onaonalc8azv6z.R.inc(32268);assertEquals(24, test.getMinuteOfHour());
        __CLR4_4_1onaonalc8azv6z.R.inc(32269);assertEquals(0, test.getSecondOfMinute());
        __CLR4_4_1onaonalc8azv6z.R.inc(32270);assertEquals(0, test.getMillisOfSecond());
    }finally{__CLR4_4_1onaonalc8azv6z.R.flushNeeded();}}

    public void testConstructor_Object_DateTimeZoneMoscow() throws Throwable {__CLR4_4_1onaonalc8azv6z.R.globalSliceStart(getClass().getName(),32271);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1opb0hdowf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1onaonalc8azv6z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1onaonalc8azv6z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Constructors.testConstructor_Object_DateTimeZoneMoscow",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32271,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1opb0hdowf() throws Throwable{try{__CLR4_4_1onaonalc8azv6z.R.inc(32271);
        __CLR4_4_1onaonalc8azv6z.R.inc(32272);LocalDateTime test = new LocalDateTime("1970-04-06T12:24:00", MOSCOW);
        __CLR4_4_1onaonalc8azv6z.R.inc(32273);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1onaonalc8azv6z.R.inc(32274);assertEquals(1970, test.getYear());
        __CLR4_4_1onaonalc8azv6z.R.inc(32275);assertEquals(4, test.getMonthOfYear());
        __CLR4_4_1onaonalc8azv6z.R.inc(32276);assertEquals(6, test.getDayOfMonth());
        __CLR4_4_1onaonalc8azv6z.R.inc(32277);assertEquals(12, test.getHourOfDay());
        __CLR4_4_1onaonalc8azv6z.R.inc(32278);assertEquals(24, test.getMinuteOfHour());
        __CLR4_4_1onaonalc8azv6z.R.inc(32279);assertEquals(0, test.getSecondOfMinute());
        __CLR4_4_1onaonalc8azv6z.R.inc(32280);assertEquals(0, test.getMillisOfSecond());
    }finally{__CLR4_4_1onaonalc8azv6z.R.flushNeeded();}}

    public void testConstructor_Object_DateTimeZoneMoscowBadDateTime() throws Throwable {__CLR4_4_1onaonalc8azv6z.R.globalSliceStart(getClass().getName(),32281);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gk2d6rowp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1onaonalc8azv6z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1onaonalc8azv6z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Constructors.testConstructor_Object_DateTimeZoneMoscowBadDateTime",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32281,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gk2d6rowp() throws Throwable{try{__CLR4_4_1onaonalc8azv6z.R.inc(32281);
        // 1981-03-31T23:59:59.999+03:00 followed by 1981-04-01T01:00:00.000+04:00
        // 1981-09-30T23:59:59.999+04:00 followed by 1981-09-30T23:00:00.000+03:00
        
        // when a DST non-existing time is passed in, it should still work (ie. zone ignored)
        __CLR4_4_1onaonalc8azv6z.R.inc(32282);LocalDateTime test = new LocalDateTime("1981-04-01T00:30:00", MOSCOW);  // doesnt exist
        __CLR4_4_1onaonalc8azv6z.R.inc(32283);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1onaonalc8azv6z.R.inc(32284);assertEquals(1981, test.getYear());
        __CLR4_4_1onaonalc8azv6z.R.inc(32285);assertEquals(4, test.getMonthOfYear());
        __CLR4_4_1onaonalc8azv6z.R.inc(32286);assertEquals(1, test.getDayOfMonth());
        __CLR4_4_1onaonalc8azv6z.R.inc(32287);assertEquals(0, test.getHourOfDay());
        __CLR4_4_1onaonalc8azv6z.R.inc(32288);assertEquals(30, test.getMinuteOfHour());
        __CLR4_4_1onaonalc8azv6z.R.inc(32289);assertEquals(0, test.getSecondOfMinute());
        __CLR4_4_1onaonalc8azv6z.R.inc(32290);assertEquals(0, test.getMillisOfSecond());
    }finally{__CLR4_4_1onaonalc8azv6z.R.flushNeeded();}}

    public void testConstructor_nullObject_DateTimeZone() throws Throwable {__CLR4_4_1onaonalc8azv6z.R.globalSliceStart(getClass().getName(),32291);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wxoowgowz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1onaonalc8azv6z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1onaonalc8azv6z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Constructors.testConstructor_nullObject_DateTimeZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32291,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wxoowgowz() throws Throwable{try{__CLR4_4_1onaonalc8azv6z.R.inc(32291);
        __CLR4_4_1onaonalc8azv6z.R.inc(32292);LocalDateTime test = new LocalDateTime((Object) null, PARIS);
        __CLR4_4_1onaonalc8azv6z.R.inc(32293);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1onaonalc8azv6z.R.inc(32294);assertEquals(1970, test.getYear());
        __CLR4_4_1onaonalc8azv6z.R.inc(32295);assertEquals(6, test.getMonthOfYear());
        __CLR4_4_1onaonalc8azv6z.R.inc(32296);assertEquals(9, test.getDayOfMonth());
        __CLR4_4_1onaonalc8azv6z.R.inc(32297);assertEquals(10 + OFFSET_PARIS, test.getHourOfDay());
        __CLR4_4_1onaonalc8azv6z.R.inc(32298);assertEquals(20, test.getMinuteOfHour());
        __CLR4_4_1onaonalc8azv6z.R.inc(32299);assertEquals(30, test.getSecondOfMinute());
        __CLR4_4_1onaonalc8azv6z.R.inc(32300);assertEquals(40, test.getMillisOfSecond());
    }finally{__CLR4_4_1onaonalc8azv6z.R.flushNeeded();}}

    public void testConstructor_Object_nullDateTimeZone() throws Throwable {__CLR4_4_1onaonalc8azv6z.R.globalSliceStart(getClass().getName(),32301);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_151w5y6ox9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1onaonalc8azv6z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1onaonalc8azv6z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Constructors.testConstructor_Object_nullDateTimeZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32301,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_151w5y6ox9() throws Throwable{try{__CLR4_4_1onaonalc8azv6z.R.inc(32301);
        __CLR4_4_1onaonalc8azv6z.R.inc(32302);Date date = new Date(TEST_TIME1);
        __CLR4_4_1onaonalc8azv6z.R.inc(32303);LocalDateTime test = new LocalDateTime(date, (DateTimeZone) null);
        __CLR4_4_1onaonalc8azv6z.R.inc(32304);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1onaonalc8azv6z.R.inc(32305);assertEquals(1970, test.getYear());
        __CLR4_4_1onaonalc8azv6z.R.inc(32306);assertEquals(4, test.getMonthOfYear());
        __CLR4_4_1onaonalc8azv6z.R.inc(32307);assertEquals(6, test.getDayOfMonth());
        __CLR4_4_1onaonalc8azv6z.R.inc(32308);assertEquals(12 + OFFSET_MOSCOW, test.getHourOfDay());
        __CLR4_4_1onaonalc8azv6z.R.inc(32309);assertEquals(24, test.getMinuteOfHour());
        __CLR4_4_1onaonalc8azv6z.R.inc(32310);assertEquals(0, test.getSecondOfMinute());
        __CLR4_4_1onaonalc8azv6z.R.inc(32311);assertEquals(0, test.getMillisOfSecond());
    }finally{__CLR4_4_1onaonalc8azv6z.R.flushNeeded();}}

    public void testConstructor_nullObject_nullDateTimeZone() throws Throwable {__CLR4_4_1onaonalc8azv6z.R.globalSliceStart(getClass().getName(),32312);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hv60h5oxk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1onaonalc8azv6z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1onaonalc8azv6z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Constructors.testConstructor_nullObject_nullDateTimeZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32312,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hv60h5oxk() throws Throwable{try{__CLR4_4_1onaonalc8azv6z.R.inc(32312);
        __CLR4_4_1onaonalc8azv6z.R.inc(32313);LocalDateTime test = new LocalDateTime((Object) null, (DateTimeZone) null);
        __CLR4_4_1onaonalc8azv6z.R.inc(32314);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1onaonalc8azv6z.R.inc(32315);assertEquals(1970, test.getYear());
        __CLR4_4_1onaonalc8azv6z.R.inc(32316);assertEquals(6, test.getMonthOfYear());
        __CLR4_4_1onaonalc8azv6z.R.inc(32317);assertEquals(9, test.getDayOfMonth());
        __CLR4_4_1onaonalc8azv6z.R.inc(32318);assertEquals(10 + OFFSET_MOSCOW, test.getHourOfDay());
        __CLR4_4_1onaonalc8azv6z.R.inc(32319);assertEquals(20, test.getMinuteOfHour());
        __CLR4_4_1onaonalc8azv6z.R.inc(32320);assertEquals(30, test.getSecondOfMinute());
        __CLR4_4_1onaonalc8azv6z.R.inc(32321);assertEquals(40, test.getMillisOfSecond());
    }finally{__CLR4_4_1onaonalc8azv6z.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testConstructor_Object_Chronology() throws Throwable {__CLR4_4_1onaonalc8azv6z.R.globalSliceStart(getClass().getName(),32322);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vmnvd4oxu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1onaonalc8azv6z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1onaonalc8azv6z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Constructors.testConstructor_Object_Chronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32322,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vmnvd4oxu() throws Throwable{try{__CLR4_4_1onaonalc8azv6z.R.inc(32322);
        __CLR4_4_1onaonalc8azv6z.R.inc(32323);Date date = new Date(TEST_TIME1);
        __CLR4_4_1onaonalc8azv6z.R.inc(32324);LocalDateTime test = new LocalDateTime(date, GREGORIAN_PARIS);
        __CLR4_4_1onaonalc8azv6z.R.inc(32325);assertEquals(GREGORIAN_UTC, test.getChronology());
        __CLR4_4_1onaonalc8azv6z.R.inc(32326);assertEquals(1970, test.getYear());
        __CLR4_4_1onaonalc8azv6z.R.inc(32327);assertEquals(4, test.getMonthOfYear());
        __CLR4_4_1onaonalc8azv6z.R.inc(32328);assertEquals(6, test.getDayOfMonth());
        __CLR4_4_1onaonalc8azv6z.R.inc(32329);assertEquals(12 + OFFSET_PARIS, test.getHourOfDay());
        __CLR4_4_1onaonalc8azv6z.R.inc(32330);assertEquals(24, test.getMinuteOfHour());
        __CLR4_4_1onaonalc8azv6z.R.inc(32331);assertEquals(0, test.getSecondOfMinute());
        __CLR4_4_1onaonalc8azv6z.R.inc(32332);assertEquals(0, test.getMillisOfSecond());
    }finally{__CLR4_4_1onaonalc8azv6z.R.flushNeeded();}}

    public void testConstructor_Object_Chronology_crossChronology() throws Throwable {__CLR4_4_1onaonalc8azv6z.R.globalSliceStart(getClass().getName(),32333);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15vy7vloy5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1onaonalc8azv6z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1onaonalc8azv6z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Constructors.testConstructor_Object_Chronology_crossChronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32333,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15vy7vloy5() throws Throwable{try{__CLR4_4_1onaonalc8azv6z.R.inc(32333);
        __CLR4_4_1onaonalc8azv6z.R.inc(32334);LocalDateTime input = new LocalDateTime(1970, 4, 6, 12, 30, 0, 0, ISO_UTC);
        __CLR4_4_1onaonalc8azv6z.R.inc(32335);LocalDateTime test = new LocalDateTime(input, BUDDHIST_UTC);
        __CLR4_4_1onaonalc8azv6z.R.inc(32336);assertEquals(BUDDHIST_UTC, test.getChronology());
        __CLR4_4_1onaonalc8azv6z.R.inc(32337);assertEquals(1970, test.getYear());
        __CLR4_4_1onaonalc8azv6z.R.inc(32338);assertEquals(4, test.getMonthOfYear());
        __CLR4_4_1onaonalc8azv6z.R.inc(32339);assertEquals(6, test.getDayOfMonth());
        __CLR4_4_1onaonalc8azv6z.R.inc(32340);assertEquals(12, test.getHourOfDay());
        __CLR4_4_1onaonalc8azv6z.R.inc(32341);assertEquals(30, test.getMinuteOfHour());
        __CLR4_4_1onaonalc8azv6z.R.inc(32342);assertEquals(0, test.getSecondOfMinute());
        __CLR4_4_1onaonalc8azv6z.R.inc(32343);assertEquals(0, test.getMillisOfSecond());
    }finally{__CLR4_4_1onaonalc8azv6z.R.flushNeeded();}}

    public void testConstructor_Object_ChronologyMoscow() throws Throwable {__CLR4_4_1onaonalc8azv6z.R.globalSliceStart(getClass().getName(),32344);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sthuv6oyg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1onaonalc8azv6z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1onaonalc8azv6z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Constructors.testConstructor_Object_ChronologyMoscow",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32344,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sthuv6oyg() throws Throwable{try{__CLR4_4_1onaonalc8azv6z.R.inc(32344);
        __CLR4_4_1onaonalc8azv6z.R.inc(32345);LocalDateTime test = new LocalDateTime("1970-04-06T12:24:00", GREGORIAN_MOSCOW);
        __CLR4_4_1onaonalc8azv6z.R.inc(32346);assertEquals(GREGORIAN_UTC, test.getChronology());
        __CLR4_4_1onaonalc8azv6z.R.inc(32347);assertEquals(1970, test.getYear());
        __CLR4_4_1onaonalc8azv6z.R.inc(32348);assertEquals(4, test.getMonthOfYear());
        __CLR4_4_1onaonalc8azv6z.R.inc(32349);assertEquals(6, test.getDayOfMonth());
        __CLR4_4_1onaonalc8azv6z.R.inc(32350);assertEquals(12, test.getHourOfDay());
        __CLR4_4_1onaonalc8azv6z.R.inc(32351);assertEquals(24, test.getMinuteOfHour());
        __CLR4_4_1onaonalc8azv6z.R.inc(32352);assertEquals(0, test.getSecondOfMinute());
        __CLR4_4_1onaonalc8azv6z.R.inc(32353);assertEquals(0, test.getMillisOfSecond());
    }finally{__CLR4_4_1onaonalc8azv6z.R.flushNeeded();}}

    public void testConstructor_Object_ChronologyMoscowBadDateTime() throws Throwable {__CLR4_4_1onaonalc8azv6z.R.globalSliceStart(getClass().getName(),32354);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rbdrg4oyq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1onaonalc8azv6z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1onaonalc8azv6z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Constructors.testConstructor_Object_ChronologyMoscowBadDateTime",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32354,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rbdrg4oyq() throws Throwable{try{__CLR4_4_1onaonalc8azv6z.R.inc(32354);
        // 1981-03-31T23:59:59.999+03:00 followed by 1981-04-01T01:00:00.000+04:00
        // 1981-09-30T23:59:59.999+04:00 followed by 1981-09-30T23:00:00.000+03:00
        
        // when a DST non-existing time is passed in, it should still work (ie. zone ignored)
        __CLR4_4_1onaonalc8azv6z.R.inc(32355);LocalDateTime test = new LocalDateTime("1981-04-01T00:30:00", GREGORIAN_MOSCOW);  // doesnt exist
        __CLR4_4_1onaonalc8azv6z.R.inc(32356);assertEquals(GREGORIAN_UTC, test.getChronology());
        __CLR4_4_1onaonalc8azv6z.R.inc(32357);assertEquals(1981, test.getYear());
        __CLR4_4_1onaonalc8azv6z.R.inc(32358);assertEquals(4, test.getMonthOfYear());
        __CLR4_4_1onaonalc8azv6z.R.inc(32359);assertEquals(1, test.getDayOfMonth());
        __CLR4_4_1onaonalc8azv6z.R.inc(32360);assertEquals(0, test.getHourOfDay());
        __CLR4_4_1onaonalc8azv6z.R.inc(32361);assertEquals(30, test.getMinuteOfHour());
        __CLR4_4_1onaonalc8azv6z.R.inc(32362);assertEquals(0, test.getSecondOfMinute());
        __CLR4_4_1onaonalc8azv6z.R.inc(32363);assertEquals(0, test.getMillisOfSecond());
    }finally{__CLR4_4_1onaonalc8azv6z.R.flushNeeded();}}

    public void testConstructor_nullObject_Chronology() throws Throwable {__CLR4_4_1onaonalc8azv6z.R.globalSliceStart(getClass().getName(),32364);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14q0uynoz0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1onaonalc8azv6z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1onaonalc8azv6z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Constructors.testConstructor_nullObject_Chronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32364,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14q0uynoz0() throws Throwable{try{__CLR4_4_1onaonalc8azv6z.R.inc(32364);
        __CLR4_4_1onaonalc8azv6z.R.inc(32365);LocalDateTime test = new LocalDateTime((Object) null, GREGORIAN_PARIS);
        __CLR4_4_1onaonalc8azv6z.R.inc(32366);assertEquals(GREGORIAN_UTC, test.getChronology());
        __CLR4_4_1onaonalc8azv6z.R.inc(32367);assertEquals(1970, test.getYear());
        __CLR4_4_1onaonalc8azv6z.R.inc(32368);assertEquals(6, test.getMonthOfYear());
        __CLR4_4_1onaonalc8azv6z.R.inc(32369);assertEquals(9, test.getDayOfMonth());
        __CLR4_4_1onaonalc8azv6z.R.inc(32370);assertEquals(10 + OFFSET_PARIS, test.getHourOfDay());
        __CLR4_4_1onaonalc8azv6z.R.inc(32371);assertEquals(20, test.getMinuteOfHour());
        __CLR4_4_1onaonalc8azv6z.R.inc(32372);assertEquals(30, test.getSecondOfMinute());
        __CLR4_4_1onaonalc8azv6z.R.inc(32373);assertEquals(40, test.getMillisOfSecond());
    }finally{__CLR4_4_1onaonalc8azv6z.R.flushNeeded();}}

    public void testConstructor_Object_nullChronology() throws Throwable {__CLR4_4_1onaonalc8azv6z.R.globalSliceStart(getClass().getName(),32374);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yccijzoza();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1onaonalc8azv6z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1onaonalc8azv6z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Constructors.testConstructor_Object_nullChronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32374,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yccijzoza() throws Throwable{try{__CLR4_4_1onaonalc8azv6z.R.inc(32374);
        __CLR4_4_1onaonalc8azv6z.R.inc(32375);Date date = new Date(TEST_TIME1);
        __CLR4_4_1onaonalc8azv6z.R.inc(32376);LocalDateTime test = new LocalDateTime(date, (Chronology) null);
        __CLR4_4_1onaonalc8azv6z.R.inc(32377);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1onaonalc8azv6z.R.inc(32378);assertEquals(1970, test.getYear());
        __CLR4_4_1onaonalc8azv6z.R.inc(32379);assertEquals(4, test.getMonthOfYear());
        __CLR4_4_1onaonalc8azv6z.R.inc(32380);assertEquals(6, test.getDayOfMonth());
        __CLR4_4_1onaonalc8azv6z.R.inc(32381);assertEquals(12 + OFFSET_MOSCOW, test.getHourOfDay());
        __CLR4_4_1onaonalc8azv6z.R.inc(32382);assertEquals(24, test.getMinuteOfHour());
        __CLR4_4_1onaonalc8azv6z.R.inc(32383);assertEquals(0, test.getSecondOfMinute());
        __CLR4_4_1onaonalc8azv6z.R.inc(32384);assertEquals(0, test.getMillisOfSecond());
    }finally{__CLR4_4_1onaonalc8azv6z.R.flushNeeded();}}

    public void testConstructor_nullObject_nullChronology() throws Throwable {__CLR4_4_1onaonalc8azv6z.R.globalSliceStart(getClass().getName(),32385);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14dtve0ozl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1onaonalc8azv6z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1onaonalc8azv6z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Constructors.testConstructor_nullObject_nullChronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32385,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14dtve0ozl() throws Throwable{try{__CLR4_4_1onaonalc8azv6z.R.inc(32385);
        __CLR4_4_1onaonalc8azv6z.R.inc(32386);LocalDateTime test = new LocalDateTime((Object) null, (Chronology) null);
        __CLR4_4_1onaonalc8azv6z.R.inc(32387);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1onaonalc8azv6z.R.inc(32388);assertEquals(1970, test.getYear());
        __CLR4_4_1onaonalc8azv6z.R.inc(32389);assertEquals(6, test.getMonthOfYear());
        __CLR4_4_1onaonalc8azv6z.R.inc(32390);assertEquals(9, test.getDayOfMonth());
        __CLR4_4_1onaonalc8azv6z.R.inc(32391);assertEquals(10 + OFFSET_MOSCOW, test.getHourOfDay());
        __CLR4_4_1onaonalc8azv6z.R.inc(32392);assertEquals(20, test.getMinuteOfHour());
        __CLR4_4_1onaonalc8azv6z.R.inc(32393);assertEquals(30, test.getSecondOfMinute());
        __CLR4_4_1onaonalc8azv6z.R.inc(32394);assertEquals(40, test.getMillisOfSecond());
    }finally{__CLR4_4_1onaonalc8azv6z.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testConstructor_int_int_int_int_int() throws Throwable {__CLR4_4_1onaonalc8azv6z.R.globalSliceStart(getClass().getName(),32395);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14wtbr5ozv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1onaonalc8azv6z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1onaonalc8azv6z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Constructors.testConstructor_int_int_int_int_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32395,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14wtbr5ozv() throws Throwable{try{__CLR4_4_1onaonalc8azv6z.R.inc(32395);
        __CLR4_4_1onaonalc8azv6z.R.inc(32396);LocalDateTime test = new LocalDateTime(2005, 6, 9, 10, 20);
        __CLR4_4_1onaonalc8azv6z.R.inc(32397);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1onaonalc8azv6z.R.inc(32398);assertEquals(2005, test.getYear());
        __CLR4_4_1onaonalc8azv6z.R.inc(32399);assertEquals(6, test.getMonthOfYear());
        __CLR4_4_1onaonalc8azv6z.R.inc(32400);assertEquals(9, test.getDayOfMonth());
        __CLR4_4_1onaonalc8azv6z.R.inc(32401);assertEquals(10, test.getHourOfDay());
        __CLR4_4_1onaonalc8azv6z.R.inc(32402);assertEquals(20, test.getMinuteOfHour());
        __CLR4_4_1onaonalc8azv6z.R.inc(32403);assertEquals(0, test.getSecondOfMinute());
        __CLR4_4_1onaonalc8azv6z.R.inc(32404);assertEquals(0, test.getMillisOfSecond());
    }finally{__CLR4_4_1onaonalc8azv6z.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testConstructor_int_int_int_int_int_int() throws Throwable {__CLR4_4_1onaonalc8azv6z.R.globalSliceStart(getClass().getName(),32405);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tj7janp05();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1onaonalc8azv6z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1onaonalc8azv6z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Constructors.testConstructor_int_int_int_int_int_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32405,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tj7janp05() throws Throwable{try{__CLR4_4_1onaonalc8azv6z.R.inc(32405);
        __CLR4_4_1onaonalc8azv6z.R.inc(32406);LocalDateTime test = new LocalDateTime(2005, 6, 9, 10, 20, 30);
        __CLR4_4_1onaonalc8azv6z.R.inc(32407);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1onaonalc8azv6z.R.inc(32408);assertEquals(2005, test.getYear());
        __CLR4_4_1onaonalc8azv6z.R.inc(32409);assertEquals(6, test.getMonthOfYear());
        __CLR4_4_1onaonalc8azv6z.R.inc(32410);assertEquals(9, test.getDayOfMonth());
        __CLR4_4_1onaonalc8azv6z.R.inc(32411);assertEquals(10, test.getHourOfDay());
        __CLR4_4_1onaonalc8azv6z.R.inc(32412);assertEquals(20, test.getMinuteOfHour());
        __CLR4_4_1onaonalc8azv6z.R.inc(32413);assertEquals(30, test.getSecondOfMinute());
        __CLR4_4_1onaonalc8azv6z.R.inc(32414);assertEquals(0, test.getMillisOfSecond());
    }finally{__CLR4_4_1onaonalc8azv6z.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testConstructor_int_int_int_int_int_int_int() throws Throwable {__CLR4_4_1onaonalc8azv6z.R.globalSliceStart(getClass().getName(),32415);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ofcjttp0f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1onaonalc8azv6z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1onaonalc8azv6z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Constructors.testConstructor_int_int_int_int_int_int_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32415,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ofcjttp0f() throws Throwable{try{__CLR4_4_1onaonalc8azv6z.R.inc(32415);
        __CLR4_4_1onaonalc8azv6z.R.inc(32416);LocalDateTime test = new LocalDateTime(2005, 6, 9, 10, 20, 30, 40);
        __CLR4_4_1onaonalc8azv6z.R.inc(32417);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1onaonalc8azv6z.R.inc(32418);assertEquals(2005, test.getYear());
        __CLR4_4_1onaonalc8azv6z.R.inc(32419);assertEquals(6, test.getMonthOfYear());
        __CLR4_4_1onaonalc8azv6z.R.inc(32420);assertEquals(9, test.getDayOfMonth());
        __CLR4_4_1onaonalc8azv6z.R.inc(32421);assertEquals(10, test.getHourOfDay());
        __CLR4_4_1onaonalc8azv6z.R.inc(32422);assertEquals(20, test.getMinuteOfHour());
        __CLR4_4_1onaonalc8azv6z.R.inc(32423);assertEquals(30, test.getSecondOfMinute());
        __CLR4_4_1onaonalc8azv6z.R.inc(32424);assertEquals(40, test.getMillisOfSecond());
        __CLR4_4_1onaonalc8azv6z.R.inc(32425);try {
            __CLR4_4_1onaonalc8azv6z.R.inc(32426);new LocalDateTime(Integer.MIN_VALUE, 6, 9, 10, 20, 30, 40);
            __CLR4_4_1onaonalc8azv6z.R.inc(32427);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_1onaonalc8azv6z.R.inc(32428);try {
            __CLR4_4_1onaonalc8azv6z.R.inc(32429);new LocalDateTime(Integer.MAX_VALUE, 6, 9, 10, 20, 30, 40);
            __CLR4_4_1onaonalc8azv6z.R.inc(32430);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_1onaonalc8azv6z.R.inc(32431);try {
            __CLR4_4_1onaonalc8azv6z.R.inc(32432);new LocalDateTime(2005, 0, 9, 10, 20, 30, 40);
            __CLR4_4_1onaonalc8azv6z.R.inc(32433);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_1onaonalc8azv6z.R.inc(32434);try {
            __CLR4_4_1onaonalc8azv6z.R.inc(32435);new LocalDateTime(2005, 13, 9, 10, 20, 30, 40);
            __CLR4_4_1onaonalc8azv6z.R.inc(32436);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_1onaonalc8azv6z.R.inc(32437);try {
            __CLR4_4_1onaonalc8azv6z.R.inc(32438);new LocalDateTime(2005, 6, 0, 10, 20, 30, 40);
            __CLR4_4_1onaonalc8azv6z.R.inc(32439);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_1onaonalc8azv6z.R.inc(32440);try {
            __CLR4_4_1onaonalc8azv6z.R.inc(32441);new LocalDateTime(2005, 6, 31, 10, 20, 30, 40);
            __CLR4_4_1onaonalc8azv6z.R.inc(32442);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_1onaonalc8azv6z.R.inc(32443);new LocalDateTime(2005, 7, 31, 10, 20, 30, 40);
        __CLR4_4_1onaonalc8azv6z.R.inc(32444);try {
            __CLR4_4_1onaonalc8azv6z.R.inc(32445);new LocalDateTime(2005, 7, 32, 10, 20, 30, 40);
            __CLR4_4_1onaonalc8azv6z.R.inc(32446);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1onaonalc8azv6z.R.flushNeeded();}}

    public void testConstructor_int_int_int_Chronology() throws Throwable {__CLR4_4_1onaonalc8azv6z.R.globalSliceStart(getClass().getName(),32447);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1o62uzqp1b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1onaonalc8azv6z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1onaonalc8azv6z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Constructors.testConstructor_int_int_int_Chronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32447,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1o62uzqp1b() throws Throwable{try{__CLR4_4_1onaonalc8azv6z.R.inc(32447);
        __CLR4_4_1onaonalc8azv6z.R.inc(32448);LocalDateTime test = new LocalDateTime(2005, 6, 9, 10, 20, 30, 40, GREGORIAN_PARIS);
        __CLR4_4_1onaonalc8azv6z.R.inc(32449);assertEquals(GREGORIAN_UTC, test.getChronology());
        __CLR4_4_1onaonalc8azv6z.R.inc(32450);assertEquals(2005, test.getYear());
        __CLR4_4_1onaonalc8azv6z.R.inc(32451);assertEquals(6, test.getMonthOfYear());
        __CLR4_4_1onaonalc8azv6z.R.inc(32452);assertEquals(9, test.getDayOfMonth());
        __CLR4_4_1onaonalc8azv6z.R.inc(32453);assertEquals(10, test.getHourOfDay());  // PARIS has no effect
        __CLR4_4_1onaonalc8azv6z.R.inc(32454);assertEquals(20, test.getMinuteOfHour());
        __CLR4_4_1onaonalc8azv6z.R.inc(32455);assertEquals(30, test.getSecondOfMinute());
        __CLR4_4_1onaonalc8azv6z.R.inc(32456);assertEquals(40, test.getMillisOfSecond());
        __CLR4_4_1onaonalc8azv6z.R.inc(32457);try {
            __CLR4_4_1onaonalc8azv6z.R.inc(32458);new LocalDateTime(Integer.MIN_VALUE, 6, 9, 10, 20, 30, 40, GREGORIAN_PARIS);
            __CLR4_4_1onaonalc8azv6z.R.inc(32459);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_1onaonalc8azv6z.R.inc(32460);try {
            __CLR4_4_1onaonalc8azv6z.R.inc(32461);new LocalDateTime(Integer.MAX_VALUE, 6, 9, 10, 20, 30, 40, GREGORIAN_PARIS);
            __CLR4_4_1onaonalc8azv6z.R.inc(32462);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_1onaonalc8azv6z.R.inc(32463);try {
            __CLR4_4_1onaonalc8azv6z.R.inc(32464);new LocalDateTime(2005, 0, 9, 10, 20, 30, 40, GREGORIAN_PARIS);
            __CLR4_4_1onaonalc8azv6z.R.inc(32465);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_1onaonalc8azv6z.R.inc(32466);try {
            __CLR4_4_1onaonalc8azv6z.R.inc(32467);new LocalDateTime(2005, 13, 9, 10, 20, 30, 40, GREGORIAN_PARIS);
            __CLR4_4_1onaonalc8azv6z.R.inc(32468);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_1onaonalc8azv6z.R.inc(32469);try {
            __CLR4_4_1onaonalc8azv6z.R.inc(32470);new LocalDateTime(2005, 6, 0, 10, 20, 30, 40, GREGORIAN_PARIS);
            __CLR4_4_1onaonalc8azv6z.R.inc(32471);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_1onaonalc8azv6z.R.inc(32472);try {
            __CLR4_4_1onaonalc8azv6z.R.inc(32473);new LocalDateTime(2005, 6, 31, 10, 20, 30, 40, GREGORIAN_PARIS);
            __CLR4_4_1onaonalc8azv6z.R.inc(32474);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_1onaonalc8azv6z.R.inc(32475);new LocalDateTime(2005, 7, 31, 10, 20, 30, 40, GREGORIAN_PARIS);
        __CLR4_4_1onaonalc8azv6z.R.inc(32476);try {
            __CLR4_4_1onaonalc8azv6z.R.inc(32477);new LocalDateTime(2005, 7, 32, 10, 20, 30, 40, GREGORIAN_PARIS);
            __CLR4_4_1onaonalc8azv6z.R.inc(32478);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1onaonalc8azv6z.R.flushNeeded();}}

    public void testConstructor_int_int_int_nullChronology() throws Throwable {__CLR4_4_1onaonalc8azv6z.R.globalSliceStart(getClass().getName(),32479);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uph3gtp27();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1onaonalc8azv6z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1onaonalc8azv6z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Constructors.testConstructor_int_int_int_nullChronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32479,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uph3gtp27() throws Throwable{try{__CLR4_4_1onaonalc8azv6z.R.inc(32479);
        __CLR4_4_1onaonalc8azv6z.R.inc(32480);LocalDateTime test = new LocalDateTime(2005, 6, 9, 10, 20, 30, 40, null);
        __CLR4_4_1onaonalc8azv6z.R.inc(32481);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1onaonalc8azv6z.R.inc(32482);assertEquals(2005, test.getYear());
        __CLR4_4_1onaonalc8azv6z.R.inc(32483);assertEquals(6, test.getMonthOfYear());
        __CLR4_4_1onaonalc8azv6z.R.inc(32484);assertEquals(9, test.getDayOfMonth());
    }finally{__CLR4_4_1onaonalc8azv6z.R.flushNeeded();}}

}
