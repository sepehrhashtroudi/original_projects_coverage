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
 * This class is a Junit unit test for LocalDate.
 *
 * @author Stephen Colebourne
 */
public class TestLocalDate_Constructors extends TestCase {static class __CLR4_4_1q6wq6wlc8azvee{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672271031490L,8589935092L,34327,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    private static final Chronology ISO_UTC = ISOChronology.getInstanceUTC();
    private static final Chronology BUDDHIST_UTC = BuddhistChronology.getInstanceUTC();
    private static final Chronology GREGORIAN_UTC = GregorianChronology.getInstanceUTC();
    private static final Chronology GREGORIAN_PARIS = GregorianChronology.getInstance(PARIS);
    
    private long TEST_TIME_NOW =
            (31L + 28L + 31L + 30L + 31L + 9L -1L) * DateTimeConstants.MILLIS_PER_DAY;
            
    private long TEST_TIME1 =
        (31L + 28L + 31L + 6L -1L) * DateTimeConstants.MILLIS_PER_DAY
        + 12L * DateTimeConstants.MILLIS_PER_HOUR
        + 24L * DateTimeConstants.MILLIS_PER_MINUTE;
    private long TEST_TIME1_ROUNDED =
        (31L + 28L + 31L + 6L -1L) * DateTimeConstants.MILLIS_PER_DAY;
    private long TEST_TIME2 =
        (365L + 31L + 28L + 31L + 30L + 7L -1L) * DateTimeConstants.MILLIS_PER_DAY
        + 14L * DateTimeConstants.MILLIS_PER_HOUR
        + 28L * DateTimeConstants.MILLIS_PER_MINUTE;

    private DateTimeZone zone = null;

    public static void main(String[] args) {try{__CLR4_4_1q6wq6wlc8azvee.R.inc(33944);
        __CLR4_4_1q6wq6wlc8azvee.R.inc(33945);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1q6wq6wlc8azvee.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1q6wq6wlc8azvee.R.inc(33946);
        __CLR4_4_1q6wq6wlc8azvee.R.inc(33947);return new TestSuite(TestLocalDate_Constructors.class);
    }finally{__CLR4_4_1q6wq6wlc8azvee.R.flushNeeded();}}

    public TestLocalDate_Constructors(String name) {
        super(name);__CLR4_4_1q6wq6wlc8azvee.R.inc(33949);try{__CLR4_4_1q6wq6wlc8azvee.R.inc(33948);
    }finally{__CLR4_4_1q6wq6wlc8azvee.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1q6wq6wlc8azvee.R.inc(33950);
        __CLR4_4_1q6wq6wlc8azvee.R.inc(33951);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1q6wq6wlc8azvee.R.inc(33952);zone = DateTimeZone.getDefault();
        __CLR4_4_1q6wq6wlc8azvee.R.inc(33953);DateTimeZone.setDefault(LONDON);
    }finally{__CLR4_4_1q6wq6wlc8azvee.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1q6wq6wlc8azvee.R.inc(33954);
        __CLR4_4_1q6wq6wlc8azvee.R.inc(33955);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1q6wq6wlc8azvee.R.inc(33956);DateTimeZone.setDefault(zone);
        __CLR4_4_1q6wq6wlc8azvee.R.inc(33957);zone = null;
    }finally{__CLR4_4_1q6wq6wlc8azvee.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testParse_noFormatter() throws Throwable {__CLR4_4_1q6wq6wlc8azvee.R.globalSliceStart(getClass().getName(),33958);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1o2oqviq7a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1q6wq6wlc8azvee.R.rethrow($CLV_t2$);}finally{__CLR4_4_1q6wq6wlc8azvee.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Constructors.testParse_noFormatter",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33958,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1o2oqviq7a() throws Throwable{try{__CLR4_4_1q6wq6wlc8azvee.R.inc(33958);
        __CLR4_4_1q6wq6wlc8azvee.R.inc(33959);assertEquals(new LocalDate(2010, 6, 30), LocalDate.parse("2010-06-30"));
        __CLR4_4_1q6wq6wlc8azvee.R.inc(33960);assertEquals(new LocalDate(2010, 1, 2), LocalDate.parse("2010-002"));
    }finally{__CLR4_4_1q6wq6wlc8azvee.R.flushNeeded();}}

    public void testParse_formatter() throws Throwable {__CLR4_4_1q6wq6wlc8azvee.R.globalSliceStart(getClass().getName(),33961);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15wvtnxq7d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1q6wq6wlc8azvee.R.rethrow($CLV_t2$);}finally{__CLR4_4_1q6wq6wlc8azvee.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Constructors.testParse_formatter",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33961,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15wvtnxq7d() throws Throwable{try{__CLR4_4_1q6wq6wlc8azvee.R.inc(33961);
        __CLR4_4_1q6wq6wlc8azvee.R.inc(33962);DateTimeFormatter f = DateTimeFormat.forPattern("yyyy--dd MM").withChronology(ISOChronology.getInstance(PARIS));
        __CLR4_4_1q6wq6wlc8azvee.R.inc(33963);assertEquals(new LocalDate(2010, 6, 30), LocalDate.parse("2010--30 06", f));
    }finally{__CLR4_4_1q6wq6wlc8azvee.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testFactory_fromCalendarFields() throws Exception {__CLR4_4_1q6wq6wlc8azvee.R.globalSliceStart(getClass().getName(),33964);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1l8hq5rq7g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1q6wq6wlc8azvee.R.rethrow($CLV_t2$);}finally{__CLR4_4_1q6wq6wlc8azvee.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Constructors.testFactory_fromCalendarFields",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33964,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1l8hq5rq7g() throws Exception{try{__CLR4_4_1q6wq6wlc8azvee.R.inc(33964);
        __CLR4_4_1q6wq6wlc8azvee.R.inc(33965);GregorianCalendar cal = new GregorianCalendar(1970, 1, 3, 4, 5, 6);
        __CLR4_4_1q6wq6wlc8azvee.R.inc(33966);cal.set(Calendar.MILLISECOND, 7);
        __CLR4_4_1q6wq6wlc8azvee.R.inc(33967);LocalDate expected = new LocalDate(1970, 2, 3);
        __CLR4_4_1q6wq6wlc8azvee.R.inc(33968);assertEquals(expected, LocalDate.fromCalendarFields(cal));
    }finally{__CLR4_4_1q6wq6wlc8azvee.R.flushNeeded();}}

    public void testFactory_fromCalendarFields_beforeYearZero1() throws Exception {__CLR4_4_1q6wq6wlc8azvee.R.globalSliceStart(getClass().getName(),33969);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_146vol9q7l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1q6wq6wlc8azvee.R.rethrow($CLV_t2$);}finally{__CLR4_4_1q6wq6wlc8azvee.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Constructors.testFactory_fromCalendarFields_beforeYearZero1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33969,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_146vol9q7l() throws Exception{try{__CLR4_4_1q6wq6wlc8azvee.R.inc(33969);
        __CLR4_4_1q6wq6wlc8azvee.R.inc(33970);GregorianCalendar cal = new GregorianCalendar(1, 1, 3, 4, 5, 6);
        __CLR4_4_1q6wq6wlc8azvee.R.inc(33971);cal.set(Calendar.ERA, GregorianCalendar.BC);
        __CLR4_4_1q6wq6wlc8azvee.R.inc(33972);cal.set(Calendar.MILLISECOND, 7);
        __CLR4_4_1q6wq6wlc8azvee.R.inc(33973);LocalDate expected = new LocalDate(0, 2, 3);
        __CLR4_4_1q6wq6wlc8azvee.R.inc(33974);assertEquals(expected, LocalDate.fromCalendarFields(cal));
    }finally{__CLR4_4_1q6wq6wlc8azvee.R.flushNeeded();}}

    public void testFactory_fromCalendarFields_beforeYearZero3() throws Exception {__CLR4_4_1q6wq6wlc8azvee.R.globalSliceStart(getClass().getName(),33975);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1aovm67q7r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1q6wq6wlc8azvee.R.rethrow($CLV_t2$);}finally{__CLR4_4_1q6wq6wlc8azvee.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Constructors.testFactory_fromCalendarFields_beforeYearZero3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33975,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1aovm67q7r() throws Exception{try{__CLR4_4_1q6wq6wlc8azvee.R.inc(33975);
        __CLR4_4_1q6wq6wlc8azvee.R.inc(33976);GregorianCalendar cal = new GregorianCalendar(3, 1, 3, 4, 5, 6);
        __CLR4_4_1q6wq6wlc8azvee.R.inc(33977);cal.set(Calendar.ERA, GregorianCalendar.BC);
        __CLR4_4_1q6wq6wlc8azvee.R.inc(33978);cal.set(Calendar.MILLISECOND, 7);
        __CLR4_4_1q6wq6wlc8azvee.R.inc(33979);LocalDate expected = new LocalDate(-2, 2, 3);
        __CLR4_4_1q6wq6wlc8azvee.R.inc(33980);assertEquals(expected, LocalDate.fromCalendarFields(cal));
    }finally{__CLR4_4_1q6wq6wlc8azvee.R.flushNeeded();}}

    public void testFactory_fromCalendarFields_null() throws Exception {__CLR4_4_1q6wq6wlc8azvee.R.globalSliceStart(getClass().getName(),33981);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qcawzfq7x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1q6wq6wlc8azvee.R.rethrow($CLV_t2$);}finally{__CLR4_4_1q6wq6wlc8azvee.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Constructors.testFactory_fromCalendarFields_null",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33981,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qcawzfq7x() throws Exception{try{__CLR4_4_1q6wq6wlc8azvee.R.inc(33981);
        __CLR4_4_1q6wq6wlc8azvee.R.inc(33982);try {
            __CLR4_4_1q6wq6wlc8azvee.R.inc(33983);LocalDate.fromCalendarFields((Calendar) null);
            __CLR4_4_1q6wq6wlc8azvee.R.inc(33984);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1q6wq6wlc8azvee.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testFactory_fromDateFields_after1970() throws Exception {__CLR4_4_1q6wq6wlc8azvee.R.globalSliceStart(getClass().getName(),33985);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16vvmm5q81();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1q6wq6wlc8azvee.R.rethrow($CLV_t2$);}finally{__CLR4_4_1q6wq6wlc8azvee.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Constructors.testFactory_fromDateFields_after1970",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33985,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16vvmm5q81() throws Exception{try{__CLR4_4_1q6wq6wlc8azvee.R.inc(33985);
        __CLR4_4_1q6wq6wlc8azvee.R.inc(33986);GregorianCalendar cal = new GregorianCalendar(1970, 1, 3, 4, 5, 6);
        __CLR4_4_1q6wq6wlc8azvee.R.inc(33987);cal.set(Calendar.MILLISECOND, 7);
        __CLR4_4_1q6wq6wlc8azvee.R.inc(33988);LocalDate expected = new LocalDate(1970, 2, 3);
        __CLR4_4_1q6wq6wlc8azvee.R.inc(33989);assertEquals(expected, LocalDate.fromDateFields(cal.getTime()));
    }finally{__CLR4_4_1q6wq6wlc8azvee.R.flushNeeded();}}

    public void testFactory_fromDateFields_before1970() throws Exception {__CLR4_4_1q6wq6wlc8azvee.R.globalSliceStart(getClass().getName(),33990);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xuspjmq86();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1q6wq6wlc8azvee.R.rethrow($CLV_t2$);}finally{__CLR4_4_1q6wq6wlc8azvee.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Constructors.testFactory_fromDateFields_before1970",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33990,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xuspjmq86() throws Exception{try{__CLR4_4_1q6wq6wlc8azvee.R.inc(33990);
        __CLR4_4_1q6wq6wlc8azvee.R.inc(33991);GregorianCalendar cal = new GregorianCalendar(1969, 1, 3, 4, 5, 6);
        __CLR4_4_1q6wq6wlc8azvee.R.inc(33992);cal.set(Calendar.MILLISECOND, 7);
        __CLR4_4_1q6wq6wlc8azvee.R.inc(33993);LocalDate expected = new LocalDate(1969, 2, 3);
        __CLR4_4_1q6wq6wlc8azvee.R.inc(33994);assertEquals(expected, LocalDate.fromDateFields(cal.getTime()));
    }finally{__CLR4_4_1q6wq6wlc8azvee.R.flushNeeded();}}

    public void testFactory_fromDateFields_beforeYearZero1() throws Exception {__CLR4_4_1q6wq6wlc8azvee.R.globalSliceStart(getClass().getName(),33995);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tr9m3xq8b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1q6wq6wlc8azvee.R.rethrow($CLV_t2$);}finally{__CLR4_4_1q6wq6wlc8azvee.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Constructors.testFactory_fromDateFields_beforeYearZero1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33995,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tr9m3xq8b() throws Exception{try{__CLR4_4_1q6wq6wlc8azvee.R.inc(33995);
        __CLR4_4_1q6wq6wlc8azvee.R.inc(33996);GregorianCalendar cal = new GregorianCalendar(1, 1, 3, 4, 5, 6);
        __CLR4_4_1q6wq6wlc8azvee.R.inc(33997);cal.set(Calendar.ERA, GregorianCalendar.BC);
        __CLR4_4_1q6wq6wlc8azvee.R.inc(33998);cal.set(Calendar.MILLISECOND, 7);
        __CLR4_4_1q6wq6wlc8azvee.R.inc(33999);LocalDate expected = new LocalDate(0, 2, 3);
        __CLR4_4_1q6wq6wlc8azvee.R.inc(34000);assertEquals(expected, LocalDate.fromDateFields(cal.getTime()));
    }finally{__CLR4_4_1q6wq6wlc8azvee.R.flushNeeded();}}

    public void testFactory_fromDateFields_beforeYearZero3() throws Exception {__CLR4_4_1q6wq6wlc8azvee.R.globalSliceStart(getClass().getName(),34001);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yruia9q8h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1q6wq6wlc8azvee.R.rethrow($CLV_t2$);}finally{__CLR4_4_1q6wq6wlc8azvee.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Constructors.testFactory_fromDateFields_beforeYearZero3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34001,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yruia9q8h() throws Exception{try{__CLR4_4_1q6wq6wlc8azvee.R.inc(34001);
        __CLR4_4_1q6wq6wlc8azvee.R.inc(34002);GregorianCalendar cal = new GregorianCalendar(3, 1, 3, 4, 5, 6);
        __CLR4_4_1q6wq6wlc8azvee.R.inc(34003);cal.set(Calendar.ERA, GregorianCalendar.BC);
        __CLR4_4_1q6wq6wlc8azvee.R.inc(34004);cal.set(Calendar.MILLISECOND, 7);
        __CLR4_4_1q6wq6wlc8azvee.R.inc(34005);LocalDate expected = new LocalDate(-2, 2, 3);
        __CLR4_4_1q6wq6wlc8azvee.R.inc(34006);assertEquals(expected, LocalDate.fromDateFields(cal.getTime()));
    }finally{__CLR4_4_1q6wq6wlc8azvee.R.flushNeeded();}}

    public void testFactory_fromDateFields_null() throws Exception {__CLR4_4_1q6wq6wlc8azvee.R.globalSliceStart(getClass().getName(),34007);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qt5qc5q8n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1q6wq6wlc8azvee.R.rethrow($CLV_t2$);}finally{__CLR4_4_1q6wq6wlc8azvee.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Constructors.testFactory_fromDateFields_null",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34007,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qt5qc5q8n() throws Exception{try{__CLR4_4_1q6wq6wlc8azvee.R.inc(34007);
        __CLR4_4_1q6wq6wlc8azvee.R.inc(34008);try {
            __CLR4_4_1q6wq6wlc8azvee.R.inc(34009);LocalDate.fromDateFields((Date) null);
            __CLR4_4_1q6wq6wlc8azvee.R.inc(34010);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1q6wq6wlc8azvee.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testConstructor() throws Throwable {__CLR4_4_1q6wq6wlc8azvee.R.globalSliceStart(getClass().getName(),34011);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uefs8hq8r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1q6wq6wlc8azvee.R.rethrow($CLV_t2$);}finally{__CLR4_4_1q6wq6wlc8azvee.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Constructors.testConstructor",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34011,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uefs8hq8r() throws Throwable{try{__CLR4_4_1q6wq6wlc8azvee.R.inc(34011);
        __CLR4_4_1q6wq6wlc8azvee.R.inc(34012);LocalDate test = new LocalDate();
        __CLR4_4_1q6wq6wlc8azvee.R.inc(34013);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1q6wq6wlc8azvee.R.inc(34014);assertEquals(1970, test.getYear());
        __CLR4_4_1q6wq6wlc8azvee.R.inc(34015);assertEquals(6, test.getMonthOfYear());
        __CLR4_4_1q6wq6wlc8azvee.R.inc(34016);assertEquals(9, test.getDayOfMonth());
        __CLR4_4_1q6wq6wlc8azvee.R.inc(34017);assertEquals(test, LocalDate.now());
    }finally{__CLR4_4_1q6wq6wlc8azvee.R.flushNeeded();}}

    public void testConstructor_DateTimeZone() throws Throwable {__CLR4_4_1q6wq6wlc8azvee.R.globalSliceStart(getClass().getName(),34018);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1z4m1k5q8y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1q6wq6wlc8azvee.R.rethrow($CLV_t2$);}finally{__CLR4_4_1q6wq6wlc8azvee.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Constructors.testConstructor_DateTimeZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34018,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1z4m1k5q8y() throws Throwable{try{__CLR4_4_1q6wq6wlc8azvee.R.inc(34018);
        __CLR4_4_1q6wq6wlc8azvee.R.inc(34019);DateTime dt = new DateTime(2005, 6, 8, 23, 59, 0, 0, LONDON);
        __CLR4_4_1q6wq6wlc8azvee.R.inc(34020);DateTimeUtils.setCurrentMillisFixed(dt.getMillis());
        // 23:59 in London is 00:59 the following day in Paris
        
        __CLR4_4_1q6wq6wlc8azvee.R.inc(34021);LocalDate test = new LocalDate(LONDON);
        __CLR4_4_1q6wq6wlc8azvee.R.inc(34022);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1q6wq6wlc8azvee.R.inc(34023);assertEquals(2005, test.getYear());
        __CLR4_4_1q6wq6wlc8azvee.R.inc(34024);assertEquals(6, test.getMonthOfYear());
        __CLR4_4_1q6wq6wlc8azvee.R.inc(34025);assertEquals(8, test.getDayOfMonth());
        __CLR4_4_1q6wq6wlc8azvee.R.inc(34026);assertEquals(test, LocalDate.now(LONDON));
        
        __CLR4_4_1q6wq6wlc8azvee.R.inc(34027);test = new LocalDate(PARIS);
        __CLR4_4_1q6wq6wlc8azvee.R.inc(34028);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1q6wq6wlc8azvee.R.inc(34029);assertEquals(2005, test.getYear());
        __CLR4_4_1q6wq6wlc8azvee.R.inc(34030);assertEquals(6, test.getMonthOfYear());
        __CLR4_4_1q6wq6wlc8azvee.R.inc(34031);assertEquals(9, test.getDayOfMonth());
        __CLR4_4_1q6wq6wlc8azvee.R.inc(34032);assertEquals(test, LocalDate.now(PARIS));
    }finally{__CLR4_4_1q6wq6wlc8azvee.R.flushNeeded();}}

    public void testConstructor_nullDateTimeZone() throws Throwable {__CLR4_4_1q6wq6wlc8azvee.R.globalSliceStart(getClass().getName(),34033);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17zs1roq9d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1q6wq6wlc8azvee.R.rethrow($CLV_t2$);}finally{__CLR4_4_1q6wq6wlc8azvee.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Constructors.testConstructor_nullDateTimeZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34033,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17zs1roq9d() throws Throwable{try{__CLR4_4_1q6wq6wlc8azvee.R.inc(34033);
        __CLR4_4_1q6wq6wlc8azvee.R.inc(34034);DateTime dt = new DateTime(2005, 6, 8, 23, 59, 0, 0, LONDON);
        __CLR4_4_1q6wq6wlc8azvee.R.inc(34035);DateTimeUtils.setCurrentMillisFixed(dt.getMillis());
        // 23:59 in London is 00:59 the following day in Paris
        
        __CLR4_4_1q6wq6wlc8azvee.R.inc(34036);LocalDate test = new LocalDate((DateTimeZone) null);
        __CLR4_4_1q6wq6wlc8azvee.R.inc(34037);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1q6wq6wlc8azvee.R.inc(34038);assertEquals(2005, test.getYear());
        __CLR4_4_1q6wq6wlc8azvee.R.inc(34039);assertEquals(6, test.getMonthOfYear());
        __CLR4_4_1q6wq6wlc8azvee.R.inc(34040);assertEquals(8, test.getDayOfMonth());
    }finally{__CLR4_4_1q6wq6wlc8azvee.R.flushNeeded();}}

    public void testConstructor_Chronology() throws Throwable {__CLR4_4_1q6wq6wlc8azvee.R.globalSliceStart(getClass().getName(),34041);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15931tiq9l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1q6wq6wlc8azvee.R.rethrow($CLV_t2$);}finally{__CLR4_4_1q6wq6wlc8azvee.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Constructors.testConstructor_Chronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34041,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15931tiq9l() throws Throwable{try{__CLR4_4_1q6wq6wlc8azvee.R.inc(34041);
        __CLR4_4_1q6wq6wlc8azvee.R.inc(34042);LocalDate test = new LocalDate(GREGORIAN_PARIS);
        __CLR4_4_1q6wq6wlc8azvee.R.inc(34043);assertEquals(GREGORIAN_UTC, test.getChronology());
        __CLR4_4_1q6wq6wlc8azvee.R.inc(34044);assertEquals(1970, test.getYear());
        __CLR4_4_1q6wq6wlc8azvee.R.inc(34045);assertEquals(6, test.getMonthOfYear());
        __CLR4_4_1q6wq6wlc8azvee.R.inc(34046);assertEquals(9, test.getDayOfMonth());
        __CLR4_4_1q6wq6wlc8azvee.R.inc(34047);assertEquals(test, LocalDate.now(GREGORIAN_PARIS));
    }finally{__CLR4_4_1q6wq6wlc8azvee.R.flushNeeded();}}

    public void testConstructor_nullChronology() throws Throwable {__CLR4_4_1q6wq6wlc8azvee.R.globalSliceStart(getClass().getName(),34048);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15qcb6rq9s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1q6wq6wlc8azvee.R.rethrow($CLV_t2$);}finally{__CLR4_4_1q6wq6wlc8azvee.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Constructors.testConstructor_nullChronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34048,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15qcb6rq9s() throws Throwable{try{__CLR4_4_1q6wq6wlc8azvee.R.inc(34048);
        __CLR4_4_1q6wq6wlc8azvee.R.inc(34049);LocalDate test = new LocalDate((Chronology) null);
        __CLR4_4_1q6wq6wlc8azvee.R.inc(34050);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1q6wq6wlc8azvee.R.inc(34051);assertEquals(1970, test.getYear());
        __CLR4_4_1q6wq6wlc8azvee.R.inc(34052);assertEquals(6, test.getMonthOfYear());
        __CLR4_4_1q6wq6wlc8azvee.R.inc(34053);assertEquals(9, test.getDayOfMonth());
    }finally{__CLR4_4_1q6wq6wlc8azvee.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testConstructor_long1() throws Throwable {__CLR4_4_1q6wq6wlc8azvee.R.globalSliceStart(getClass().getName(),34054);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wi13crq9y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1q6wq6wlc8azvee.R.rethrow($CLV_t2$);}finally{__CLR4_4_1q6wq6wlc8azvee.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Constructors.testConstructor_long1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34054,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wi13crq9y() throws Throwable{try{__CLR4_4_1q6wq6wlc8azvee.R.inc(34054);
        __CLR4_4_1q6wq6wlc8azvee.R.inc(34055);LocalDate test = new LocalDate(TEST_TIME1);
        __CLR4_4_1q6wq6wlc8azvee.R.inc(34056);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1q6wq6wlc8azvee.R.inc(34057);assertEquals(1970, test.getYear());
        __CLR4_4_1q6wq6wlc8azvee.R.inc(34058);assertEquals(4, test.getMonthOfYear());
        __CLR4_4_1q6wq6wlc8azvee.R.inc(34059);assertEquals(6, test.getDayOfMonth());
    }finally{__CLR4_4_1q6wq6wlc8azvee.R.flushNeeded();}}

    public void testConstructor_long2() throws Throwable {__CLR4_4_1q6wq6wlc8azvee.R.globalSliceStart(getClass().getName(),34060);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1t914kaqa4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1q6wq6wlc8azvee.R.rethrow($CLV_t2$);}finally{__CLR4_4_1q6wq6wlc8azvee.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Constructors.testConstructor_long2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34060,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1t914kaqa4() throws Throwable{try{__CLR4_4_1q6wq6wlc8azvee.R.inc(34060);
        __CLR4_4_1q6wq6wlc8azvee.R.inc(34061);LocalDate test = new LocalDate(TEST_TIME2);
        __CLR4_4_1q6wq6wlc8azvee.R.inc(34062);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1q6wq6wlc8azvee.R.inc(34063);assertEquals(1971, test.getYear());
        __CLR4_4_1q6wq6wlc8azvee.R.inc(34064);assertEquals(5, test.getMonthOfYear());
        __CLR4_4_1q6wq6wlc8azvee.R.inc(34065);assertEquals(7, test.getDayOfMonth());
    }finally{__CLR4_4_1q6wq6wlc8azvee.R.flushNeeded();}}

    public void testConstructor_long1_DateTimeZone() throws Throwable {__CLR4_4_1q6wq6wlc8azvee.R.globalSliceStart(getClass().getName(),34066);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mej2a9qaa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1q6wq6wlc8azvee.R.rethrow($CLV_t2$);}finally{__CLR4_4_1q6wq6wlc8azvee.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Constructors.testConstructor_long1_DateTimeZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34066,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mej2a9qaa() throws Throwable{try{__CLR4_4_1q6wq6wlc8azvee.R.inc(34066);
        __CLR4_4_1q6wq6wlc8azvee.R.inc(34067);LocalDate test = new LocalDate(TEST_TIME1, PARIS);
        __CLR4_4_1q6wq6wlc8azvee.R.inc(34068);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1q6wq6wlc8azvee.R.inc(34069);assertEquals(1970, test.getYear());
        __CLR4_4_1q6wq6wlc8azvee.R.inc(34070);assertEquals(4, test.getMonthOfYear());
        __CLR4_4_1q6wq6wlc8azvee.R.inc(34071);assertEquals(6, test.getDayOfMonth());
        __CLR4_4_1q6wq6wlc8azvee.R.inc(34072);assertEquals(TEST_TIME1_ROUNDED, test.getLocalMillis());
    }finally{__CLR4_4_1q6wq6wlc8azvee.R.flushNeeded();}}

    public void testConstructor_long2_DateTimeZone() throws Throwable {__CLR4_4_1q6wq6wlc8azvee.R.globalSliceStart(getClass().getName(),34073);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s1hd9qqah();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1q6wq6wlc8azvee.R.rethrow($CLV_t2$);}finally{__CLR4_4_1q6wq6wlc8azvee.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Constructors.testConstructor_long2_DateTimeZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34073,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s1hd9qqah() throws Throwable{try{__CLR4_4_1q6wq6wlc8azvee.R.inc(34073);
        __CLR4_4_1q6wq6wlc8azvee.R.inc(34074);LocalDate test = new LocalDate(TEST_TIME2, PARIS);
        __CLR4_4_1q6wq6wlc8azvee.R.inc(34075);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1q6wq6wlc8azvee.R.inc(34076);assertEquals(1971, test.getYear());
        __CLR4_4_1q6wq6wlc8azvee.R.inc(34077);assertEquals(5, test.getMonthOfYear());
        __CLR4_4_1q6wq6wlc8azvee.R.inc(34078);assertEquals(7, test.getDayOfMonth());
    }finally{__CLR4_4_1q6wq6wlc8azvee.R.flushNeeded();}}

    public void testConstructor_long3_DateTimeZone() throws Throwable {__CLR4_4_1q6wq6wlc8azvee.R.globalSliceStart(getClass().getName(),34079);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17gdqulqan();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1q6wq6wlc8azvee.R.rethrow($CLV_t2$);}finally{__CLR4_4_1q6wq6wlc8azvee.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Constructors.testConstructor_long3_DateTimeZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34079,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17gdqulqan() throws Throwable{try{__CLR4_4_1q6wq6wlc8azvee.R.inc(34079);
        __CLR4_4_1q6wq6wlc8azvee.R.inc(34080);DateTime dt = new DateTime(2006, 6, 9, 0, 0, 0, 0, PARIS);
        __CLR4_4_1q6wq6wlc8azvee.R.inc(34081);DateTime dtUTC = new DateTime(2006, 6, 9, 0, 0, 0, 0, DateTimeZone.UTC);
        
        __CLR4_4_1q6wq6wlc8azvee.R.inc(34082);LocalDate test = new LocalDate(dt.getMillis(), PARIS);
        __CLR4_4_1q6wq6wlc8azvee.R.inc(34083);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1q6wq6wlc8azvee.R.inc(34084);assertEquals(2006, test.getYear());
        __CLR4_4_1q6wq6wlc8azvee.R.inc(34085);assertEquals(6, test.getMonthOfYear());
        __CLR4_4_1q6wq6wlc8azvee.R.inc(34086);assertEquals(9, test.getDayOfMonth());
        __CLR4_4_1q6wq6wlc8azvee.R.inc(34087);assertEquals(dtUTC.getMillis(), test.getLocalMillis());
    }finally{__CLR4_4_1q6wq6wlc8azvee.R.flushNeeded();}}

    public void testConstructor_long4_DateTimeZone() throws Throwable {__CLR4_4_1q6wq6wlc8azvee.R.globalSliceStart(getClass().getName(),34088);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1d4pvkkqaw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1q6wq6wlc8azvee.R.rethrow($CLV_t2$);}finally{__CLR4_4_1q6wq6wlc8azvee.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Constructors.testConstructor_long4_DateTimeZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34088,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1d4pvkkqaw() throws Throwable{try{__CLR4_4_1q6wq6wlc8azvee.R.inc(34088);
        __CLR4_4_1q6wq6wlc8azvee.R.inc(34089);DateTime dt = new DateTime(2006, 6, 9, 23, 59, 59, 999, PARIS);
        __CLR4_4_1q6wq6wlc8azvee.R.inc(34090);DateTime dtUTC = new DateTime(2006, 6, 9, 0, 0, 0, 0, DateTimeZone.UTC);
        
        __CLR4_4_1q6wq6wlc8azvee.R.inc(34091);LocalDate test = new LocalDate(dt.getMillis(), PARIS);
        __CLR4_4_1q6wq6wlc8azvee.R.inc(34092);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1q6wq6wlc8azvee.R.inc(34093);assertEquals(2006, test.getYear());
        __CLR4_4_1q6wq6wlc8azvee.R.inc(34094);assertEquals(6, test.getMonthOfYear());
        __CLR4_4_1q6wq6wlc8azvee.R.inc(34095);assertEquals(9, test.getDayOfMonth());
        __CLR4_4_1q6wq6wlc8azvee.R.inc(34096);assertEquals(dtUTC.getMillis(), test.getLocalMillis());
    }finally{__CLR4_4_1q6wq6wlc8azvee.R.flushNeeded();}}

    public void testConstructor_long_nullDateTimeZone() throws Throwable {__CLR4_4_1q6wq6wlc8azvee.R.globalSliceStart(getClass().getName(),34097);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uv35a9qb5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1q6wq6wlc8azvee.R.rethrow($CLV_t2$);}finally{__CLR4_4_1q6wq6wlc8azvee.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Constructors.testConstructor_long_nullDateTimeZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34097,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uv35a9qb5() throws Throwable{try{__CLR4_4_1q6wq6wlc8azvee.R.inc(34097);
        __CLR4_4_1q6wq6wlc8azvee.R.inc(34098);LocalDate test = new LocalDate(TEST_TIME1, (DateTimeZone) null);
        __CLR4_4_1q6wq6wlc8azvee.R.inc(34099);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1q6wq6wlc8azvee.R.inc(34100);assertEquals(1970, test.getYear());
        __CLR4_4_1q6wq6wlc8azvee.R.inc(34101);assertEquals(4, test.getMonthOfYear());
        __CLR4_4_1q6wq6wlc8azvee.R.inc(34102);assertEquals(6, test.getDayOfMonth());
    }finally{__CLR4_4_1q6wq6wlc8azvee.R.flushNeeded();}}

    public void testConstructor_long1_Chronology() throws Throwable {__CLR4_4_1q6wq6wlc8azvee.R.globalSliceStart(getClass().getName(),34103);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_115wn5sqbb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1q6wq6wlc8azvee.R.rethrow($CLV_t2$);}finally{__CLR4_4_1q6wq6wlc8azvee.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Constructors.testConstructor_long1_Chronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34103,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_115wn5sqbb() throws Throwable{try{__CLR4_4_1q6wq6wlc8azvee.R.inc(34103);
        __CLR4_4_1q6wq6wlc8azvee.R.inc(34104);LocalDate test = new LocalDate(TEST_TIME1, GREGORIAN_PARIS);
        __CLR4_4_1q6wq6wlc8azvee.R.inc(34105);assertEquals(GREGORIAN_UTC, test.getChronology());
        __CLR4_4_1q6wq6wlc8azvee.R.inc(34106);assertEquals(1970, test.getYear());
        __CLR4_4_1q6wq6wlc8azvee.R.inc(34107);assertEquals(4, test.getMonthOfYear());
        __CLR4_4_1q6wq6wlc8azvee.R.inc(34108);assertEquals(6, test.getDayOfMonth());
    }finally{__CLR4_4_1q6wq6wlc8azvee.R.flushNeeded();}}

    public void testConstructor_long2_Chronology() throws Throwable {__CLR4_4_1q6wq6wlc8azvee.R.globalSliceStart(getClass().getName(),34109);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14nqmkhqbh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1q6wq6wlc8azvee.R.rethrow($CLV_t2$);}finally{__CLR4_4_1q6wq6wlc8azvee.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Constructors.testConstructor_long2_Chronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34109,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14nqmkhqbh() throws Throwable{try{__CLR4_4_1q6wq6wlc8azvee.R.inc(34109);
        __CLR4_4_1q6wq6wlc8azvee.R.inc(34110);LocalDate test = new LocalDate(TEST_TIME2, GREGORIAN_PARIS);
        __CLR4_4_1q6wq6wlc8azvee.R.inc(34111);assertEquals(GREGORIAN_UTC, test.getChronology());
        __CLR4_4_1q6wq6wlc8azvee.R.inc(34112);assertEquals(1971, test.getYear());
        __CLR4_4_1q6wq6wlc8azvee.R.inc(34113);assertEquals(5, test.getMonthOfYear());
        __CLR4_4_1q6wq6wlc8azvee.R.inc(34114);assertEquals(7, test.getDayOfMonth());
    }finally{__CLR4_4_1q6wq6wlc8azvee.R.flushNeeded();}}

    public void testConstructor_long_nullChronology() throws Throwable {__CLR4_4_1q6wq6wlc8azvee.R.globalSliceStart(getClass().getName(),34115);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nnhckuqbn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1q6wq6wlc8azvee.R.rethrow($CLV_t2$);}finally{__CLR4_4_1q6wq6wlc8azvee.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Constructors.testConstructor_long_nullChronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34115,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nnhckuqbn() throws Throwable{try{__CLR4_4_1q6wq6wlc8azvee.R.inc(34115);
        __CLR4_4_1q6wq6wlc8azvee.R.inc(34116);LocalDate test = new LocalDate(TEST_TIME1, (Chronology) null);
        __CLR4_4_1q6wq6wlc8azvee.R.inc(34117);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1q6wq6wlc8azvee.R.inc(34118);assertEquals(1970, test.getYear());
        __CLR4_4_1q6wq6wlc8azvee.R.inc(34119);assertEquals(4, test.getMonthOfYear());
        __CLR4_4_1q6wq6wlc8azvee.R.inc(34120);assertEquals(6, test.getDayOfMonth());
    }finally{__CLR4_4_1q6wq6wlc8azvee.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testConstructor_Object1() throws Throwable {__CLR4_4_1q6wq6wlc8azvee.R.globalSliceStart(getClass().getName(),34121);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19oqxcyqbt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1q6wq6wlc8azvee.R.rethrow($CLV_t2$);}finally{__CLR4_4_1q6wq6wlc8azvee.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Constructors.testConstructor_Object1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34121,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19oqxcyqbt() throws Throwable{try{__CLR4_4_1q6wq6wlc8azvee.R.inc(34121);
        __CLR4_4_1q6wq6wlc8azvee.R.inc(34122);Date date = new Date(TEST_TIME1);
        __CLR4_4_1q6wq6wlc8azvee.R.inc(34123);LocalDate test = new LocalDate(date);
        __CLR4_4_1q6wq6wlc8azvee.R.inc(34124);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1q6wq6wlc8azvee.R.inc(34125);assertEquals(1970, test.getYear());
        __CLR4_4_1q6wq6wlc8azvee.R.inc(34126);assertEquals(4, test.getMonthOfYear());
        __CLR4_4_1q6wq6wlc8azvee.R.inc(34127);assertEquals(6, test.getDayOfMonth());
    }finally{__CLR4_4_1q6wq6wlc8azvee.R.flushNeeded();}}

    public void testConstructor_nullObject() throws Throwable {__CLR4_4_1q6wq6wlc8azvee.R.globalSliceStart(getClass().getName(),34128);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lt59ukqc0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1q6wq6wlc8azvee.R.rethrow($CLV_t2$);}finally{__CLR4_4_1q6wq6wlc8azvee.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Constructors.testConstructor_nullObject",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34128,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lt59ukqc0() throws Throwable{try{__CLR4_4_1q6wq6wlc8azvee.R.inc(34128);
        __CLR4_4_1q6wq6wlc8azvee.R.inc(34129);LocalDate test = new LocalDate((Object) null);
        __CLR4_4_1q6wq6wlc8azvee.R.inc(34130);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1q6wq6wlc8azvee.R.inc(34131);assertEquals(1970, test.getYear());
        __CLR4_4_1q6wq6wlc8azvee.R.inc(34132);assertEquals(6, test.getMonthOfYear());
        __CLR4_4_1q6wq6wlc8azvee.R.inc(34133);assertEquals(9, test.getDayOfMonth());
    }finally{__CLR4_4_1q6wq6wlc8azvee.R.flushNeeded();}}

    public void testConstructor_ObjectString1() throws Throwable {__CLR4_4_1q6wq6wlc8azvee.R.globalSliceStart(getClass().getName(),34134);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11c2b5dqc6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1q6wq6wlc8azvee.R.rethrow($CLV_t2$);}finally{__CLR4_4_1q6wq6wlc8azvee.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Constructors.testConstructor_ObjectString1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34134,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11c2b5dqc6() throws Throwable{try{__CLR4_4_1q6wq6wlc8azvee.R.inc(34134);
        __CLR4_4_1q6wq6wlc8azvee.R.inc(34135);LocalDate test = new LocalDate("1972-04-06");
        __CLR4_4_1q6wq6wlc8azvee.R.inc(34136);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1q6wq6wlc8azvee.R.inc(34137);assertEquals(1972, test.getYear());
        __CLR4_4_1q6wq6wlc8azvee.R.inc(34138);assertEquals(4, test.getMonthOfYear());
        __CLR4_4_1q6wq6wlc8azvee.R.inc(34139);assertEquals(6, test.getDayOfMonth());
    }finally{__CLR4_4_1q6wq6wlc8azvee.R.flushNeeded();}}

    public void testConstructor_ObjectString2() throws Throwable {__CLR4_4_1q6wq6wlc8azvee.R.globalSliceStart(getClass().getName(),34140);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14l29xuqcc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1q6wq6wlc8azvee.R.rethrow($CLV_t2$);}finally{__CLR4_4_1q6wq6wlc8azvee.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Constructors.testConstructor_ObjectString2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34140,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14l29xuqcc() throws Throwable{try{__CLR4_4_1q6wq6wlc8azvee.R.inc(34140);
        __CLR4_4_1q6wq6wlc8azvee.R.inc(34141);LocalDate test = new LocalDate("1972-037");
        __CLR4_4_1q6wq6wlc8azvee.R.inc(34142);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1q6wq6wlc8azvee.R.inc(34143);assertEquals(1972, test.getYear());
        __CLR4_4_1q6wq6wlc8azvee.R.inc(34144);assertEquals(2, test.getMonthOfYear());
        __CLR4_4_1q6wq6wlc8azvee.R.inc(34145);assertEquals(6, test.getDayOfMonth());
    }finally{__CLR4_4_1q6wq6wlc8azvee.R.flushNeeded();}}

    public void testConstructor_ObjectString3() throws Throwable {__CLR4_4_1q6wq6wlc8azvee.R.globalSliceStart(getClass().getName(),34146);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17u28qbqci();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1q6wq6wlc8azvee.R.rethrow($CLV_t2$);}finally{__CLR4_4_1q6wq6wlc8azvee.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Constructors.testConstructor_ObjectString3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34146,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17u28qbqci() throws Throwable{try{__CLR4_4_1q6wq6wlc8azvee.R.inc(34146);
        __CLR4_4_1q6wq6wlc8azvee.R.inc(34147);LocalDate test = new LocalDate("1972-02");
        __CLR4_4_1q6wq6wlc8azvee.R.inc(34148);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1q6wq6wlc8azvee.R.inc(34149);assertEquals(1972, test.getYear());
        __CLR4_4_1q6wq6wlc8azvee.R.inc(34150);assertEquals(2, test.getMonthOfYear());
        __CLR4_4_1q6wq6wlc8azvee.R.inc(34151);assertEquals(1, test.getDayOfMonth());
    }finally{__CLR4_4_1q6wq6wlc8azvee.R.flushNeeded();}}

    public void testConstructor_ObjectStringEx1() throws Throwable {__CLR4_4_1q6wq6wlc8azvee.R.globalSliceStart(getClass().getName(),34152);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11dauleqco();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1q6wq6wlc8azvee.R.rethrow($CLV_t2$);}finally{__CLR4_4_1q6wq6wlc8azvee.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Constructors.testConstructor_ObjectStringEx1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34152,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11dauleqco() throws Throwable{try{__CLR4_4_1q6wq6wlc8azvee.R.inc(34152);
        __CLR4_4_1q6wq6wlc8azvee.R.inc(34153);try {
            __CLR4_4_1q6wq6wlc8azvee.R.inc(34154);new LocalDate("1970-04-06T+14:00");
            __CLR4_4_1q6wq6wlc8azvee.R.inc(34155);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1q6wq6wlc8azvee.R.flushNeeded();}}

    public void testConstructor_ObjectStringEx2() throws Throwable {__CLR4_4_1q6wq6wlc8azvee.R.globalSliceStart(getClass().getName(),34156);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11vp473qcs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1q6wq6wlc8azvee.R.rethrow($CLV_t2$);}finally{__CLR4_4_1q6wq6wlc8azvee.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Constructors.testConstructor_ObjectStringEx2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34156,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11vp473qcs() throws Throwable{try{__CLR4_4_1q6wq6wlc8azvee.R.inc(34156);
        __CLR4_4_1q6wq6wlc8azvee.R.inc(34157);try {
            __CLR4_4_1q6wq6wlc8azvee.R.inc(34158);new LocalDate("1970-04-06T10:20:30.040");
            __CLR4_4_1q6wq6wlc8azvee.R.inc(34159);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1q6wq6wlc8azvee.R.flushNeeded();}}

    public void testConstructor_ObjectStringEx3() throws Throwable {__CLR4_4_1q6wq6wlc8azvee.R.globalSliceStart(getClass().getName(),34160);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_154p2zkqcw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1q6wq6wlc8azvee.R.rethrow($CLV_t2$);}finally{__CLR4_4_1q6wq6wlc8azvee.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Constructors.testConstructor_ObjectStringEx3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34160,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_154p2zkqcw() throws Throwable{try{__CLR4_4_1q6wq6wlc8azvee.R.inc(34160);
        __CLR4_4_1q6wq6wlc8azvee.R.inc(34161);try {
            __CLR4_4_1q6wq6wlc8azvee.R.inc(34162);new LocalDate("1970-04-06T10:20:30.040+14:00");
            __CLR4_4_1q6wq6wlc8azvee.R.inc(34163);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1q6wq6wlc8azvee.R.flushNeeded();}}

    public void testConstructor_ObjectStringEx4() throws Throwable {__CLR4_4_1q6wq6wlc8azvee.R.globalSliceStart(getClass().getName(),34164);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18dp1s1qd0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1q6wq6wlc8azvee.R.rethrow($CLV_t2$);}finally{__CLR4_4_1q6wq6wlc8azvee.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Constructors.testConstructor_ObjectStringEx4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34164,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18dp1s1qd0() throws Throwable{try{__CLR4_4_1q6wq6wlc8azvee.R.inc(34164);
        __CLR4_4_1q6wq6wlc8azvee.R.inc(34165);try {
            __CLR4_4_1q6wq6wlc8azvee.R.inc(34166);new LocalDate("T10:20:30.040");
            __CLR4_4_1q6wq6wlc8azvee.R.inc(34167);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1q6wq6wlc8azvee.R.flushNeeded();}}

    public void testConstructor_ObjectStringEx5() throws Throwable {__CLR4_4_1q6wq6wlc8azvee.R.globalSliceStart(getClass().getName(),34168);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bmp0kiqd4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1q6wq6wlc8azvee.R.rethrow($CLV_t2$);}finally{__CLR4_4_1q6wq6wlc8azvee.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Constructors.testConstructor_ObjectStringEx5",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34168,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bmp0kiqd4() throws Throwable{try{__CLR4_4_1q6wq6wlc8azvee.R.inc(34168);
        __CLR4_4_1q6wq6wlc8azvee.R.inc(34169);try {
            __CLR4_4_1q6wq6wlc8azvee.R.inc(34170);new LocalDate("T10:20:30.040+14:00");
            __CLR4_4_1q6wq6wlc8azvee.R.inc(34171);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1q6wq6wlc8azvee.R.flushNeeded();}}

    public void testConstructor_ObjectStringEx6() throws Throwable {__CLR4_4_1q6wq6wlc8azvee.R.globalSliceStart(getClass().getName(),34172);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1evozczqd8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1q6wq6wlc8azvee.R.rethrow($CLV_t2$);}finally{__CLR4_4_1q6wq6wlc8azvee.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Constructors.testConstructor_ObjectStringEx6",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34172,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1evozczqd8() throws Throwable{try{__CLR4_4_1q6wq6wlc8azvee.R.inc(34172);
        __CLR4_4_1q6wq6wlc8azvee.R.inc(34173);try {
            __CLR4_4_1q6wq6wlc8azvee.R.inc(34174);new LocalDate("10:20:30.040");
            __CLR4_4_1q6wq6wlc8azvee.R.inc(34175);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1q6wq6wlc8azvee.R.flushNeeded();}}

    public void testConstructor_ObjectStringEx7() throws Throwable {__CLR4_4_1q6wq6wlc8azvee.R.globalSliceStart(getClass().getName(),34176);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1i4oy5gqdc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1q6wq6wlc8azvee.R.rethrow($CLV_t2$);}finally{__CLR4_4_1q6wq6wlc8azvee.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Constructors.testConstructor_ObjectStringEx7",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34176,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1i4oy5gqdc() throws Throwable{try{__CLR4_4_1q6wq6wlc8azvee.R.inc(34176);
        __CLR4_4_1q6wq6wlc8azvee.R.inc(34177);try {
            __CLR4_4_1q6wq6wlc8azvee.R.inc(34178);new LocalDate("10:20:30.040+14:00");
            __CLR4_4_1q6wq6wlc8azvee.R.inc(34179);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1q6wq6wlc8azvee.R.flushNeeded();}}

    public void testConstructor_ObjectLocalDate() throws Throwable {__CLR4_4_1q6wq6wlc8azvee.R.globalSliceStart(getClass().getName(),34180);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1drwkayqdg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1q6wq6wlc8azvee.R.rethrow($CLV_t2$);}finally{__CLR4_4_1q6wq6wlc8azvee.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Constructors.testConstructor_ObjectLocalDate",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34180,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1drwkayqdg() throws Throwable{try{__CLR4_4_1q6wq6wlc8azvee.R.inc(34180);
        __CLR4_4_1q6wq6wlc8azvee.R.inc(34181);LocalDate date = new LocalDate(1970, 4, 6, BUDDHIST_UTC);
        __CLR4_4_1q6wq6wlc8azvee.R.inc(34182);LocalDate test = new LocalDate(date);
        __CLR4_4_1q6wq6wlc8azvee.R.inc(34183);assertEquals(BUDDHIST_UTC, test.getChronology());
        __CLR4_4_1q6wq6wlc8azvee.R.inc(34184);assertEquals(1970, test.getYear());
        __CLR4_4_1q6wq6wlc8azvee.R.inc(34185);assertEquals(4, test.getMonthOfYear());
        __CLR4_4_1q6wq6wlc8azvee.R.inc(34186);assertEquals(6, test.getDayOfMonth());
    }finally{__CLR4_4_1q6wq6wlc8azvee.R.flushNeeded();}}

    public void testConstructor_ObjectLocalTime() throws Throwable {__CLR4_4_1q6wq6wlc8azvee.R.globalSliceStart(getClass().getName(),34187);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18d94w9qdn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1q6wq6wlc8azvee.R.rethrow($CLV_t2$);}finally{__CLR4_4_1q6wq6wlc8azvee.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Constructors.testConstructor_ObjectLocalTime",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34187,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18d94w9qdn() throws Throwable{try{__CLR4_4_1q6wq6wlc8azvee.R.inc(34187);
        __CLR4_4_1q6wq6wlc8azvee.R.inc(34188);LocalTime time = new LocalTime(10, 20, 30, 40, BUDDHIST_UTC);
        __CLR4_4_1q6wq6wlc8azvee.R.inc(34189);try {
            __CLR4_4_1q6wq6wlc8azvee.R.inc(34190);new LocalDate(time);
            __CLR4_4_1q6wq6wlc8azvee.R.inc(34191);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1q6wq6wlc8azvee.R.flushNeeded();}}

    public void testConstructor_ObjectLocalDateTime() throws Throwable {__CLR4_4_1q6wq6wlc8azvee.R.globalSliceStart(getClass().getName(),34192);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kto907qds();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1q6wq6wlc8azvee.R.rethrow($CLV_t2$);}finally{__CLR4_4_1q6wq6wlc8azvee.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Constructors.testConstructor_ObjectLocalDateTime",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34192,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kto907qds() throws Throwable{try{__CLR4_4_1q6wq6wlc8azvee.R.inc(34192);
        __CLR4_4_1q6wq6wlc8azvee.R.inc(34193);LocalDateTime dt = new LocalDateTime(1970, 5, 6, 10, 20, 30, 40, BUDDHIST_UTC);
        __CLR4_4_1q6wq6wlc8azvee.R.inc(34194);LocalDate test = new LocalDate(dt);
        __CLR4_4_1q6wq6wlc8azvee.R.inc(34195);assertEquals(BUDDHIST_UTC, test.getChronology());
        __CLR4_4_1q6wq6wlc8azvee.R.inc(34196);assertEquals(1970, test.getYear());
        __CLR4_4_1q6wq6wlc8azvee.R.inc(34197);assertEquals(5, test.getMonthOfYear());
        __CLR4_4_1q6wq6wlc8azvee.R.inc(34198);assertEquals(6, test.getDayOfMonth());
    }finally{__CLR4_4_1q6wq6wlc8azvee.R.flushNeeded();}}

    @SuppressWarnings("deprecation")
    public void testConstructor_ObjectYearMonthDay() throws Throwable {__CLR4_4_1q6wq6wlc8azvee.R.globalSliceStart(getClass().getName(),34199);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1x7cbiuqdz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1q6wq6wlc8azvee.R.rethrow($CLV_t2$);}finally{__CLR4_4_1q6wq6wlc8azvee.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Constructors.testConstructor_ObjectYearMonthDay",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34199,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1x7cbiuqdz() throws Throwable{try{__CLR4_4_1q6wq6wlc8azvee.R.inc(34199);
        __CLR4_4_1q6wq6wlc8azvee.R.inc(34200);YearMonthDay date = new YearMonthDay(1970, 4, 6, BUDDHIST_UTC);
        __CLR4_4_1q6wq6wlc8azvee.R.inc(34201);LocalDate test = new LocalDate(date);
        __CLR4_4_1q6wq6wlc8azvee.R.inc(34202);assertEquals(BUDDHIST_UTC, test.getChronology());
        __CLR4_4_1q6wq6wlc8azvee.R.inc(34203);assertEquals(1970, test.getYear());
        __CLR4_4_1q6wq6wlc8azvee.R.inc(34204);assertEquals(4, test.getMonthOfYear());
        __CLR4_4_1q6wq6wlc8azvee.R.inc(34205);assertEquals(6, test.getDayOfMonth());
    }finally{__CLR4_4_1q6wq6wlc8azvee.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testConstructor_Object_DateTimeZone() throws Throwable {__CLR4_4_1q6wq6wlc8azvee.R.globalSliceStart(getClass().getName(),34206);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pk74vrqe6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1q6wq6wlc8azvee.R.rethrow($CLV_t2$);}finally{__CLR4_4_1q6wq6wlc8azvee.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Constructors.testConstructor_Object_DateTimeZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34206,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pk74vrqe6() throws Throwable{try{__CLR4_4_1q6wq6wlc8azvee.R.inc(34206);
        __CLR4_4_1q6wq6wlc8azvee.R.inc(34207);Date date = new Date(TEST_TIME1);
        __CLR4_4_1q6wq6wlc8azvee.R.inc(34208);LocalDate test = new LocalDate(date, PARIS);
        __CLR4_4_1q6wq6wlc8azvee.R.inc(34209);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1q6wq6wlc8azvee.R.inc(34210);assertEquals(1970, test.getYear());
        __CLR4_4_1q6wq6wlc8azvee.R.inc(34211);assertEquals(4, test.getMonthOfYear());
        __CLR4_4_1q6wq6wlc8azvee.R.inc(34212);assertEquals(6, test.getDayOfMonth());
    }finally{__CLR4_4_1q6wq6wlc8azvee.R.flushNeeded();}}

    public void testConstructor_nullObject_DateTimeZone() throws Throwable {__CLR4_4_1q6wq6wlc8azvee.R.globalSliceStart(getClass().getName(),34213);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wxoowgqed();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1q6wq6wlc8azvee.R.rethrow($CLV_t2$);}finally{__CLR4_4_1q6wq6wlc8azvee.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Constructors.testConstructor_nullObject_DateTimeZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34213,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wxoowgqed() throws Throwable{try{__CLR4_4_1q6wq6wlc8azvee.R.inc(34213);
        __CLR4_4_1q6wq6wlc8azvee.R.inc(34214);LocalDate test = new LocalDate((Object) null, PARIS);
        __CLR4_4_1q6wq6wlc8azvee.R.inc(34215);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1q6wq6wlc8azvee.R.inc(34216);assertEquals(1970, test.getYear());
        __CLR4_4_1q6wq6wlc8azvee.R.inc(34217);assertEquals(6, test.getMonthOfYear());
        __CLR4_4_1q6wq6wlc8azvee.R.inc(34218);assertEquals(9, test.getDayOfMonth());
    }finally{__CLR4_4_1q6wq6wlc8azvee.R.flushNeeded();}}

    public void testConstructor_Object_nullDateTimeZone() throws Throwable {__CLR4_4_1q6wq6wlc8azvee.R.globalSliceStart(getClass().getName(),34219);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_151w5y6qej();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1q6wq6wlc8azvee.R.rethrow($CLV_t2$);}finally{__CLR4_4_1q6wq6wlc8azvee.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Constructors.testConstructor_Object_nullDateTimeZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34219,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_151w5y6qej() throws Throwable{try{__CLR4_4_1q6wq6wlc8azvee.R.inc(34219);
        __CLR4_4_1q6wq6wlc8azvee.R.inc(34220);Date date = new Date(TEST_TIME1);
        __CLR4_4_1q6wq6wlc8azvee.R.inc(34221);LocalDate test = new LocalDate(date, (DateTimeZone) null);
        __CLR4_4_1q6wq6wlc8azvee.R.inc(34222);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1q6wq6wlc8azvee.R.inc(34223);assertEquals(1970, test.getYear());
        __CLR4_4_1q6wq6wlc8azvee.R.inc(34224);assertEquals(4, test.getMonthOfYear());
        __CLR4_4_1q6wq6wlc8azvee.R.inc(34225);assertEquals(6, test.getDayOfMonth());
    }finally{__CLR4_4_1q6wq6wlc8azvee.R.flushNeeded();}}

    public void testConstructor_nullObject_nullDateTimeZone() throws Throwable {__CLR4_4_1q6wq6wlc8azvee.R.globalSliceStart(getClass().getName(),34226);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hv60h5qeq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1q6wq6wlc8azvee.R.rethrow($CLV_t2$);}finally{__CLR4_4_1q6wq6wlc8azvee.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Constructors.testConstructor_nullObject_nullDateTimeZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34226,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hv60h5qeq() throws Throwable{try{__CLR4_4_1q6wq6wlc8azvee.R.inc(34226);
        __CLR4_4_1q6wq6wlc8azvee.R.inc(34227);LocalDate test = new LocalDate((Object) null, (DateTimeZone) null);
        __CLR4_4_1q6wq6wlc8azvee.R.inc(34228);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1q6wq6wlc8azvee.R.inc(34229);assertEquals(1970, test.getYear());
        __CLR4_4_1q6wq6wlc8azvee.R.inc(34230);assertEquals(6, test.getMonthOfYear());
        __CLR4_4_1q6wq6wlc8azvee.R.inc(34231);assertEquals(9, test.getDayOfMonth());
    }finally{__CLR4_4_1q6wq6wlc8azvee.R.flushNeeded();}}

    public void testConstructor_Object_Chronology() throws Throwable {__CLR4_4_1q6wq6wlc8azvee.R.globalSliceStart(getClass().getName(),34232);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vmnvd4qew();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1q6wq6wlc8azvee.R.rethrow($CLV_t2$);}finally{__CLR4_4_1q6wq6wlc8azvee.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Constructors.testConstructor_Object_Chronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34232,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vmnvd4qew() throws Throwable{try{__CLR4_4_1q6wq6wlc8azvee.R.inc(34232);
        __CLR4_4_1q6wq6wlc8azvee.R.inc(34233);Date date = new Date(TEST_TIME1);
        __CLR4_4_1q6wq6wlc8azvee.R.inc(34234);LocalDate test = new LocalDate(date, GREGORIAN_PARIS);
        __CLR4_4_1q6wq6wlc8azvee.R.inc(34235);assertEquals(GREGORIAN_UTC, test.getChronology());
        __CLR4_4_1q6wq6wlc8azvee.R.inc(34236);assertEquals(1970, test.getYear());
        __CLR4_4_1q6wq6wlc8azvee.R.inc(34237);assertEquals(4, test.getMonthOfYear());
        __CLR4_4_1q6wq6wlc8azvee.R.inc(34238);assertEquals(6, test.getDayOfMonth());
    }finally{__CLR4_4_1q6wq6wlc8azvee.R.flushNeeded();}}

    public void testConstructor_Object_Chronology_crossChronology() throws Throwable {__CLR4_4_1q6wq6wlc8azvee.R.globalSliceStart(getClass().getName(),34239);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15vy7vlqf3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1q6wq6wlc8azvee.R.rethrow($CLV_t2$);}finally{__CLR4_4_1q6wq6wlc8azvee.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Constructors.testConstructor_Object_Chronology_crossChronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34239,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15vy7vlqf3() throws Throwable{try{__CLR4_4_1q6wq6wlc8azvee.R.inc(34239);
        __CLR4_4_1q6wq6wlc8azvee.R.inc(34240);LocalDate input = new LocalDate(1970, 4, 6, ISO_UTC);
        __CLR4_4_1q6wq6wlc8azvee.R.inc(34241);LocalDate test = new LocalDate(input, BUDDHIST_UTC);
        __CLR4_4_1q6wq6wlc8azvee.R.inc(34242);assertEquals(BUDDHIST_UTC, test.getChronology());
        __CLR4_4_1q6wq6wlc8azvee.R.inc(34243);assertEquals(1970, test.getYear());
        __CLR4_4_1q6wq6wlc8azvee.R.inc(34244);assertEquals(4, test.getMonthOfYear());
        __CLR4_4_1q6wq6wlc8azvee.R.inc(34245);assertEquals(6, test.getDayOfMonth());
    }finally{__CLR4_4_1q6wq6wlc8azvee.R.flushNeeded();}}

    public void testConstructor_nullObject_Chronology() throws Throwable {__CLR4_4_1q6wq6wlc8azvee.R.globalSliceStart(getClass().getName(),34246);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14q0uynqfa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1q6wq6wlc8azvee.R.rethrow($CLV_t2$);}finally{__CLR4_4_1q6wq6wlc8azvee.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Constructors.testConstructor_nullObject_Chronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34246,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14q0uynqfa() throws Throwable{try{__CLR4_4_1q6wq6wlc8azvee.R.inc(34246);
        __CLR4_4_1q6wq6wlc8azvee.R.inc(34247);LocalDate test = new LocalDate((Object) null, GREGORIAN_PARIS);
        __CLR4_4_1q6wq6wlc8azvee.R.inc(34248);assertEquals(GREGORIAN_UTC, test.getChronology());
        __CLR4_4_1q6wq6wlc8azvee.R.inc(34249);assertEquals(1970, test.getYear());
        __CLR4_4_1q6wq6wlc8azvee.R.inc(34250);assertEquals(6, test.getMonthOfYear());
        __CLR4_4_1q6wq6wlc8azvee.R.inc(34251);assertEquals(9, test.getDayOfMonth());
    }finally{__CLR4_4_1q6wq6wlc8azvee.R.flushNeeded();}}

    public void testConstructor_Object_nullChronology() throws Throwable {__CLR4_4_1q6wq6wlc8azvee.R.globalSliceStart(getClass().getName(),34252);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yccijzqfg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1q6wq6wlc8azvee.R.rethrow($CLV_t2$);}finally{__CLR4_4_1q6wq6wlc8azvee.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Constructors.testConstructor_Object_nullChronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34252,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yccijzqfg() throws Throwable{try{__CLR4_4_1q6wq6wlc8azvee.R.inc(34252);
        __CLR4_4_1q6wq6wlc8azvee.R.inc(34253);Date date = new Date(TEST_TIME1);
        __CLR4_4_1q6wq6wlc8azvee.R.inc(34254);LocalDate test = new LocalDate(date, (Chronology) null);
        __CLR4_4_1q6wq6wlc8azvee.R.inc(34255);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1q6wq6wlc8azvee.R.inc(34256);assertEquals(1970, test.getYear());
        __CLR4_4_1q6wq6wlc8azvee.R.inc(34257);assertEquals(4, test.getMonthOfYear());
        __CLR4_4_1q6wq6wlc8azvee.R.inc(34258);assertEquals(6, test.getDayOfMonth());
    }finally{__CLR4_4_1q6wq6wlc8azvee.R.flushNeeded();}}

    public void testConstructor_nullObject_nullChronology() throws Throwable {__CLR4_4_1q6wq6wlc8azvee.R.globalSliceStart(getClass().getName(),34259);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14dtve0qfn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1q6wq6wlc8azvee.R.rethrow($CLV_t2$);}finally{__CLR4_4_1q6wq6wlc8azvee.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Constructors.testConstructor_nullObject_nullChronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34259,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14dtve0qfn() throws Throwable{try{__CLR4_4_1q6wq6wlc8azvee.R.inc(34259);
        __CLR4_4_1q6wq6wlc8azvee.R.inc(34260);LocalDate test = new LocalDate((Object) null, (Chronology) null);
        __CLR4_4_1q6wq6wlc8azvee.R.inc(34261);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1q6wq6wlc8azvee.R.inc(34262);assertEquals(1970, test.getYear());
        __CLR4_4_1q6wq6wlc8azvee.R.inc(34263);assertEquals(6, test.getMonthOfYear());
        __CLR4_4_1q6wq6wlc8azvee.R.inc(34264);assertEquals(9, test.getDayOfMonth());
    }finally{__CLR4_4_1q6wq6wlc8azvee.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testConstructor_int_int_int() throws Throwable {__CLR4_4_1q6wq6wlc8azvee.R.globalSliceStart(getClass().getName(),34265);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bd9uqnqft();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1q6wq6wlc8azvee.R.rethrow($CLV_t2$);}finally{__CLR4_4_1q6wq6wlc8azvee.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Constructors.testConstructor_int_int_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34265,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bd9uqnqft() throws Throwable{try{__CLR4_4_1q6wq6wlc8azvee.R.inc(34265);
        __CLR4_4_1q6wq6wlc8azvee.R.inc(34266);LocalDate test = new LocalDate(1970, 6, 9);
        __CLR4_4_1q6wq6wlc8azvee.R.inc(34267);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1q6wq6wlc8azvee.R.inc(34268);assertEquals(1970, test.getYear());
        __CLR4_4_1q6wq6wlc8azvee.R.inc(34269);assertEquals(6, test.getMonthOfYear());
        __CLR4_4_1q6wq6wlc8azvee.R.inc(34270);assertEquals(9, test.getDayOfMonth());
        __CLR4_4_1q6wq6wlc8azvee.R.inc(34271);try {
            __CLR4_4_1q6wq6wlc8azvee.R.inc(34272);new LocalDate(Integer.MIN_VALUE, 6, 9);
            __CLR4_4_1q6wq6wlc8azvee.R.inc(34273);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_1q6wq6wlc8azvee.R.inc(34274);try {
            __CLR4_4_1q6wq6wlc8azvee.R.inc(34275);new LocalDate(Integer.MAX_VALUE, 6, 9);
            __CLR4_4_1q6wq6wlc8azvee.R.inc(34276);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_1q6wq6wlc8azvee.R.inc(34277);try {
            __CLR4_4_1q6wq6wlc8azvee.R.inc(34278);new LocalDate(1970, 0, 9);
            __CLR4_4_1q6wq6wlc8azvee.R.inc(34279);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_1q6wq6wlc8azvee.R.inc(34280);try {
            __CLR4_4_1q6wq6wlc8azvee.R.inc(34281);new LocalDate(1970, 13, 9);
            __CLR4_4_1q6wq6wlc8azvee.R.inc(34282);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_1q6wq6wlc8azvee.R.inc(34283);try {
            __CLR4_4_1q6wq6wlc8azvee.R.inc(34284);new LocalDate(1970, 6, 0);
            __CLR4_4_1q6wq6wlc8azvee.R.inc(34285);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_1q6wq6wlc8azvee.R.inc(34286);try {
            __CLR4_4_1q6wq6wlc8azvee.R.inc(34287);new LocalDate(1970, 6, 31);
            __CLR4_4_1q6wq6wlc8azvee.R.inc(34288);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_1q6wq6wlc8azvee.R.inc(34289);new LocalDate(1970, 7, 31);
        __CLR4_4_1q6wq6wlc8azvee.R.inc(34290);try {
            __CLR4_4_1q6wq6wlc8azvee.R.inc(34291);new LocalDate(1970, 7, 32);
            __CLR4_4_1q6wq6wlc8azvee.R.inc(34292);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1q6wq6wlc8azvee.R.flushNeeded();}}

    public void testConstructor_int_int_int_Chronology() throws Throwable {__CLR4_4_1q6wq6wlc8azvee.R.globalSliceStart(getClass().getName(),34293);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1o62uzqqgl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1q6wq6wlc8azvee.R.rethrow($CLV_t2$);}finally{__CLR4_4_1q6wq6wlc8azvee.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Constructors.testConstructor_int_int_int_Chronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34293,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1o62uzqqgl() throws Throwable{try{__CLR4_4_1q6wq6wlc8azvee.R.inc(34293);
        __CLR4_4_1q6wq6wlc8azvee.R.inc(34294);LocalDate test = new LocalDate(1970, 6, 9, GREGORIAN_PARIS);
        __CLR4_4_1q6wq6wlc8azvee.R.inc(34295);assertEquals(GREGORIAN_UTC, test.getChronology());
        __CLR4_4_1q6wq6wlc8azvee.R.inc(34296);assertEquals(1970, test.getYear());
        __CLR4_4_1q6wq6wlc8azvee.R.inc(34297);assertEquals(6, test.getMonthOfYear());
        __CLR4_4_1q6wq6wlc8azvee.R.inc(34298);assertEquals(9, test.getDayOfMonth());
        __CLR4_4_1q6wq6wlc8azvee.R.inc(34299);try {
            __CLR4_4_1q6wq6wlc8azvee.R.inc(34300);new LocalDate(Integer.MIN_VALUE, 6, 9, GREGORIAN_PARIS);
            __CLR4_4_1q6wq6wlc8azvee.R.inc(34301);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_1q6wq6wlc8azvee.R.inc(34302);try {
            __CLR4_4_1q6wq6wlc8azvee.R.inc(34303);new LocalDate(Integer.MAX_VALUE, 6, 9, GREGORIAN_PARIS);
            __CLR4_4_1q6wq6wlc8azvee.R.inc(34304);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_1q6wq6wlc8azvee.R.inc(34305);try {
            __CLR4_4_1q6wq6wlc8azvee.R.inc(34306);new LocalDate(1970, 0, 9, GREGORIAN_PARIS);
            __CLR4_4_1q6wq6wlc8azvee.R.inc(34307);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_1q6wq6wlc8azvee.R.inc(34308);try {
            __CLR4_4_1q6wq6wlc8azvee.R.inc(34309);new LocalDate(1970, 13, 9, GREGORIAN_PARIS);
            __CLR4_4_1q6wq6wlc8azvee.R.inc(34310);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_1q6wq6wlc8azvee.R.inc(34311);try {
            __CLR4_4_1q6wq6wlc8azvee.R.inc(34312);new LocalDate(1970, 6, 0, GREGORIAN_PARIS);
            __CLR4_4_1q6wq6wlc8azvee.R.inc(34313);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_1q6wq6wlc8azvee.R.inc(34314);try {
            __CLR4_4_1q6wq6wlc8azvee.R.inc(34315);new LocalDate(1970, 6, 31, GREGORIAN_PARIS);
            __CLR4_4_1q6wq6wlc8azvee.R.inc(34316);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_1q6wq6wlc8azvee.R.inc(34317);new LocalDate(1970, 7, 31, GREGORIAN_PARIS);
        __CLR4_4_1q6wq6wlc8azvee.R.inc(34318);try {
            __CLR4_4_1q6wq6wlc8azvee.R.inc(34319);new LocalDate(1970, 7, 32, GREGORIAN_PARIS);
            __CLR4_4_1q6wq6wlc8azvee.R.inc(34320);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1q6wq6wlc8azvee.R.flushNeeded();}}

    public void testConstructor_int_int_int_nullChronology() throws Throwable {__CLR4_4_1q6wq6wlc8azvee.R.globalSliceStart(getClass().getName(),34321);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uph3gtqhd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1q6wq6wlc8azvee.R.rethrow($CLV_t2$);}finally{__CLR4_4_1q6wq6wlc8azvee.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Constructors.testConstructor_int_int_int_nullChronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34321,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uph3gtqhd() throws Throwable{try{__CLR4_4_1q6wq6wlc8azvee.R.inc(34321);
        __CLR4_4_1q6wq6wlc8azvee.R.inc(34322);LocalDate test = new LocalDate(1970, 6, 9, null);
        __CLR4_4_1q6wq6wlc8azvee.R.inc(34323);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1q6wq6wlc8azvee.R.inc(34324);assertEquals(1970, test.getYear());
        __CLR4_4_1q6wq6wlc8azvee.R.inc(34325);assertEquals(6, test.getMonthOfYear());
        __CLR4_4_1q6wq6wlc8azvee.R.inc(34326);assertEquals(9, test.getDayOfMonth());
    }finally{__CLR4_4_1q6wq6wlc8azvee.R.flushNeeded();}}

}
