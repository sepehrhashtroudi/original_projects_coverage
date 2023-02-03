/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 *  Copyright 2001-2010 Stephen Colebourne
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

import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

/**
 * This class is a Junit unit test for MonthDay. Based on {@link TestYearMonth_Constuctors} 
 */
public class TestMonthDay_Constructors extends TestCase {static class __CLR4_4_1sh6sh6lc8azvn4{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672271031490L,8589935092L,37104,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    private static final Chronology ISO_UTC = ISOChronology.getInstanceUTC();
    private static final Chronology GREGORIAN_UTC = GregorianChronology.getInstanceUTC();
    private static final Chronology GREGORIAN_PARIS = GregorianChronology.getInstance(PARIS);
    
    private long TEST_TIME_NOW =
            (31L + 28L + 31L + 30L + 31L + 9L -1L) * DateTimeConstants.MILLIS_PER_DAY;
            
    private long TEST_TIME1 =
        (31L + 28L + 31L + 6L -1L) * DateTimeConstants.MILLIS_PER_DAY
        + 12L * DateTimeConstants.MILLIS_PER_HOUR
        + 24L * DateTimeConstants.MILLIS_PER_MINUTE;
        
    private long TEST_TIME2 =
        (365L + 31L + 28L + 31L + 30L + 7L -1L) * DateTimeConstants.MILLIS_PER_DAY
        + 14L * DateTimeConstants.MILLIS_PER_HOUR
        + 28L * DateTimeConstants.MILLIS_PER_MINUTE;
        
    private DateTimeZone zone = null;

    public static void main(String[] args) {try{__CLR4_4_1sh6sh6lc8azvn4.R.inc(36906);
        __CLR4_4_1sh6sh6lc8azvn4.R.inc(36907);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1sh6sh6lc8azvn4.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1sh6sh6lc8azvn4.R.inc(36908);
        __CLR4_4_1sh6sh6lc8azvn4.R.inc(36909);return new TestSuite(TestMonthDay_Constructors.class);
    }finally{__CLR4_4_1sh6sh6lc8azvn4.R.flushNeeded();}}

    public TestMonthDay_Constructors(String name) {
        super(name);__CLR4_4_1sh6sh6lc8azvn4.R.inc(36911);try{__CLR4_4_1sh6sh6lc8azvn4.R.inc(36910);
    }finally{__CLR4_4_1sh6sh6lc8azvn4.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1sh6sh6lc8azvn4.R.inc(36912);
        __CLR4_4_1sh6sh6lc8azvn4.R.inc(36913);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1sh6sh6lc8azvn4.R.inc(36914);zone = DateTimeZone.getDefault();
        __CLR4_4_1sh6sh6lc8azvn4.R.inc(36915);DateTimeZone.setDefault(LONDON);
    }finally{__CLR4_4_1sh6sh6lc8azvn4.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1sh6sh6lc8azvn4.R.inc(36916);
        __CLR4_4_1sh6sh6lc8azvn4.R.inc(36917);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1sh6sh6lc8azvn4.R.inc(36918);DateTimeZone.setDefault(zone);
        __CLR4_4_1sh6sh6lc8azvn4.R.inc(36919);zone = null;
    }finally{__CLR4_4_1sh6sh6lc8azvn4.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testParse_noFormatter() throws Throwable {__CLR4_4_1sh6sh6lc8azvn4.R.globalSliceStart(getClass().getName(),36920);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1o2oqvishk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1sh6sh6lc8azvn4.R.rethrow($CLV_t2$);}finally{__CLR4_4_1sh6sh6lc8azvn4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Constructors.testParse_noFormatter",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36920,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1o2oqvishk() throws Throwable{try{__CLR4_4_1sh6sh6lc8azvn4.R.inc(36920);
        __CLR4_4_1sh6sh6lc8azvn4.R.inc(36921);assertEquals(new MonthDay(6, 30), MonthDay.parse("--06-30"));
        __CLR4_4_1sh6sh6lc8azvn4.R.inc(36922);assertEquals(new MonthDay(2, 29), MonthDay.parse("--02-29"));
        __CLR4_4_1sh6sh6lc8azvn4.R.inc(36923);assertEquals(new MonthDay(6, 30), MonthDay.parse("2010-06-30"));
        __CLR4_4_1sh6sh6lc8azvn4.R.inc(36924);assertEquals(new MonthDay(1, 2), MonthDay.parse("2010-002"));
    }finally{__CLR4_4_1sh6sh6lc8azvn4.R.flushNeeded();}}

    public void testParse_formatter() throws Throwable {__CLR4_4_1sh6sh6lc8azvn4.R.globalSliceStart(getClass().getName(),36925);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15wvtnxshp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1sh6sh6lc8azvn4.R.rethrow($CLV_t2$);}finally{__CLR4_4_1sh6sh6lc8azvn4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Constructors.testParse_formatter",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36925,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15wvtnxshp() throws Throwable{try{__CLR4_4_1sh6sh6lc8azvn4.R.inc(36925);
        __CLR4_4_1sh6sh6lc8azvn4.R.inc(36926);DateTimeFormatter f = DateTimeFormat.forPattern("yyyy--dd MM").withChronology(ISOChronology.getInstance(PARIS));
        __CLR4_4_1sh6sh6lc8azvn4.R.inc(36927);assertEquals(new MonthDay(6, 30), MonthDay.parse("2010--30 06", f));
    }finally{__CLR4_4_1sh6sh6lc8azvn4.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testFactory_FromCalendarFields() throws Exception {__CLR4_4_1sh6sh6lc8azvn4.R.globalSliceStart(getClass().getName(),36928);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wxckb3shs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1sh6sh6lc8azvn4.R.rethrow($CLV_t2$);}finally{__CLR4_4_1sh6sh6lc8azvn4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Constructors.testFactory_FromCalendarFields",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36928,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wxckb3shs() throws Exception{try{__CLR4_4_1sh6sh6lc8azvn4.R.inc(36928);
        __CLR4_4_1sh6sh6lc8azvn4.R.inc(36929);GregorianCalendar cal = new GregorianCalendar(1970, 1, 3, 4, 5, 6);
        __CLR4_4_1sh6sh6lc8azvn4.R.inc(36930);cal.set(Calendar.MILLISECOND, 7);
        __CLR4_4_1sh6sh6lc8azvn4.R.inc(36931);MonthDay expected = new MonthDay(2, 3);
        __CLR4_4_1sh6sh6lc8azvn4.R.inc(36932);assertEquals(expected, MonthDay.fromCalendarFields(cal));
        __CLR4_4_1sh6sh6lc8azvn4.R.inc(36933);try {
            __CLR4_4_1sh6sh6lc8azvn4.R.inc(36934);MonthDay.fromCalendarFields(null);
            __CLR4_4_1sh6sh6lc8azvn4.R.inc(36935);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1sh6sh6lc8azvn4.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testFactory_FromDateFields() throws Exception {__CLR4_4_1sh6sh6lc8azvn4.R.globalSliceStart(getClass().getName(),36936);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16u5j27si0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1sh6sh6lc8azvn4.R.rethrow($CLV_t2$);}finally{__CLR4_4_1sh6sh6lc8azvn4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Constructors.testFactory_FromDateFields",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36936,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16u5j27si0() throws Exception{try{__CLR4_4_1sh6sh6lc8azvn4.R.inc(36936);
        __CLR4_4_1sh6sh6lc8azvn4.R.inc(36937);GregorianCalendar cal = new GregorianCalendar(1970, 1, 3, 4, 5, 6);
        __CLR4_4_1sh6sh6lc8azvn4.R.inc(36938);cal.set(Calendar.MILLISECOND, 7);
        __CLR4_4_1sh6sh6lc8azvn4.R.inc(36939);MonthDay expected = new MonthDay(2, 3);
        __CLR4_4_1sh6sh6lc8azvn4.R.inc(36940);assertEquals(expected, MonthDay.fromDateFields(cal.getTime()));
        __CLR4_4_1sh6sh6lc8azvn4.R.inc(36941);try {
            __CLR4_4_1sh6sh6lc8azvn4.R.inc(36942);MonthDay.fromDateFields(null);
            __CLR4_4_1sh6sh6lc8azvn4.R.inc(36943);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1sh6sh6lc8azvn4.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Test constructor ()
     */
    public void testConstructor() throws Throwable {__CLR4_4_1sh6sh6lc8azvn4.R.globalSliceStart(getClass().getName(),36944);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uefs8hsi8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1sh6sh6lc8azvn4.R.rethrow($CLV_t2$);}finally{__CLR4_4_1sh6sh6lc8azvn4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Constructors.testConstructor",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36944,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uefs8hsi8() throws Throwable{try{__CLR4_4_1sh6sh6lc8azvn4.R.inc(36944);
        __CLR4_4_1sh6sh6lc8azvn4.R.inc(36945);MonthDay test = new MonthDay();
        __CLR4_4_1sh6sh6lc8azvn4.R.inc(36946);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1sh6sh6lc8azvn4.R.inc(36947);assertEquals(6, test.getMonthOfYear());
        __CLR4_4_1sh6sh6lc8azvn4.R.inc(36948);assertEquals(9, test.getDayOfMonth());
        __CLR4_4_1sh6sh6lc8azvn4.R.inc(36949);assertEquals(test, MonthDay.now());
    }finally{__CLR4_4_1sh6sh6lc8azvn4.R.flushNeeded();}}

    /**
     * Test constructor (DateTimeZone)
     */
    public void testConstructor_DateTimeZone() throws Throwable {__CLR4_4_1sh6sh6lc8azvn4.R.globalSliceStart(getClass().getName(),36950);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1z4m1k5sie();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1sh6sh6lc8azvn4.R.rethrow($CLV_t2$);}finally{__CLR4_4_1sh6sh6lc8azvn4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Constructors.testConstructor_DateTimeZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36950,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1z4m1k5sie() throws Throwable{try{__CLR4_4_1sh6sh6lc8azvn4.R.inc(36950);
        __CLR4_4_1sh6sh6lc8azvn4.R.inc(36951);DateTime dt = new DateTime(2005, 6, 30, 23, 59, 0, 0, LONDON);
        __CLR4_4_1sh6sh6lc8azvn4.R.inc(36952);DateTimeUtils.setCurrentMillisFixed(dt.getMillis());
        // 23:59 in London is 00:59 the following day in Paris
        
        __CLR4_4_1sh6sh6lc8azvn4.R.inc(36953);MonthDay test = new MonthDay(LONDON);
        __CLR4_4_1sh6sh6lc8azvn4.R.inc(36954);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1sh6sh6lc8azvn4.R.inc(36955);assertEquals(6, test.getMonthOfYear());
        __CLR4_4_1sh6sh6lc8azvn4.R.inc(36956);assertEquals(30, test.getDayOfMonth());
        __CLR4_4_1sh6sh6lc8azvn4.R.inc(36957);assertEquals(test, MonthDay.now(LONDON));
        
        __CLR4_4_1sh6sh6lc8azvn4.R.inc(36958);test = new MonthDay(PARIS);
        __CLR4_4_1sh6sh6lc8azvn4.R.inc(36959);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1sh6sh6lc8azvn4.R.inc(36960);assertEquals(7, test.getMonthOfYear());
        __CLR4_4_1sh6sh6lc8azvn4.R.inc(36961);assertEquals(1, test.getDayOfMonth());
        __CLR4_4_1sh6sh6lc8azvn4.R.inc(36962);assertEquals(test, MonthDay.now(PARIS));
    }finally{__CLR4_4_1sh6sh6lc8azvn4.R.flushNeeded();}}

    /**
     * Test constructor (DateTimeZone=null)
     */
    public void testConstructor_nullDateTimeZone() throws Throwable {__CLR4_4_1sh6sh6lc8azvn4.R.globalSliceStart(getClass().getName(),36963);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17zs1rosir();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1sh6sh6lc8azvn4.R.rethrow($CLV_t2$);}finally{__CLR4_4_1sh6sh6lc8azvn4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Constructors.testConstructor_nullDateTimeZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36963,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17zs1rosir() throws Throwable{try{__CLR4_4_1sh6sh6lc8azvn4.R.inc(36963);
        __CLR4_4_1sh6sh6lc8azvn4.R.inc(36964);DateTime dt = new DateTime(2005, 6, 30, 23, 59, 0, 0, LONDON);
        __CLR4_4_1sh6sh6lc8azvn4.R.inc(36965);DateTimeUtils.setCurrentMillisFixed(dt.getMillis());
        // 23:59 in London is 00:59 the following day in Paris
        
        __CLR4_4_1sh6sh6lc8azvn4.R.inc(36966);MonthDay test = new MonthDay((DateTimeZone) null);
        __CLR4_4_1sh6sh6lc8azvn4.R.inc(36967);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1sh6sh6lc8azvn4.R.inc(36968);assertEquals(6, test.getMonthOfYear());
        __CLR4_4_1sh6sh6lc8azvn4.R.inc(36969);assertEquals(30, test.getDayOfMonth());
    }finally{__CLR4_4_1sh6sh6lc8azvn4.R.flushNeeded();}}

    /**
     * Test constructor (Chronology)
     */
    public void testConstructor_Chronology() throws Throwable {__CLR4_4_1sh6sh6lc8azvn4.R.globalSliceStart(getClass().getName(),36970);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15931tisiy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1sh6sh6lc8azvn4.R.rethrow($CLV_t2$);}finally{__CLR4_4_1sh6sh6lc8azvn4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Constructors.testConstructor_Chronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36970,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15931tisiy() throws Throwable{try{__CLR4_4_1sh6sh6lc8azvn4.R.inc(36970);
        __CLR4_4_1sh6sh6lc8azvn4.R.inc(36971);MonthDay test = new MonthDay(GREGORIAN_PARIS);
        __CLR4_4_1sh6sh6lc8azvn4.R.inc(36972);assertEquals(GREGORIAN_UTC, test.getChronology());
        __CLR4_4_1sh6sh6lc8azvn4.R.inc(36973);assertEquals(6, test.getMonthOfYear());
        __CLR4_4_1sh6sh6lc8azvn4.R.inc(36974);assertEquals(9, test.getDayOfMonth());
        __CLR4_4_1sh6sh6lc8azvn4.R.inc(36975);assertEquals(test, MonthDay.now(GREGORIAN_PARIS));
    }finally{__CLR4_4_1sh6sh6lc8azvn4.R.flushNeeded();}}

    /**
     * Test constructor (Chronology=null)
     */
    public void testConstructor_nullChronology() throws Throwable {__CLR4_4_1sh6sh6lc8azvn4.R.globalSliceStart(getClass().getName(),36976);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15qcb6rsj4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1sh6sh6lc8azvn4.R.rethrow($CLV_t2$);}finally{__CLR4_4_1sh6sh6lc8azvn4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Constructors.testConstructor_nullChronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36976,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15qcb6rsj4() throws Throwable{try{__CLR4_4_1sh6sh6lc8azvn4.R.inc(36976);
        __CLR4_4_1sh6sh6lc8azvn4.R.inc(36977);MonthDay test = new MonthDay((Chronology) null);
        __CLR4_4_1sh6sh6lc8azvn4.R.inc(36978);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1sh6sh6lc8azvn4.R.inc(36979);assertEquals(6, test.getMonthOfYear());
        __CLR4_4_1sh6sh6lc8azvn4.R.inc(36980);assertEquals(9, test.getDayOfMonth());
    }finally{__CLR4_4_1sh6sh6lc8azvn4.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Test constructor (long)
     */
    public void testConstructor_long1() throws Throwable {__CLR4_4_1sh6sh6lc8azvn4.R.globalSliceStart(getClass().getName(),36981);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wi13crsj9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1sh6sh6lc8azvn4.R.rethrow($CLV_t2$);}finally{__CLR4_4_1sh6sh6lc8azvn4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Constructors.testConstructor_long1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36981,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wi13crsj9() throws Throwable{try{__CLR4_4_1sh6sh6lc8azvn4.R.inc(36981);
        __CLR4_4_1sh6sh6lc8azvn4.R.inc(36982);MonthDay test = new MonthDay(TEST_TIME1);
        __CLR4_4_1sh6sh6lc8azvn4.R.inc(36983);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1sh6sh6lc8azvn4.R.inc(36984);assertEquals(4, test.getMonthOfYear());
        __CLR4_4_1sh6sh6lc8azvn4.R.inc(36985);assertEquals(6, test.getDayOfMonth());
    }finally{__CLR4_4_1sh6sh6lc8azvn4.R.flushNeeded();}}

    /**
     * Test constructor (long)
     */
    public void testConstructor_long2() throws Throwable {__CLR4_4_1sh6sh6lc8azvn4.R.globalSliceStart(getClass().getName(),36986);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1t914kasje();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1sh6sh6lc8azvn4.R.rethrow($CLV_t2$);}finally{__CLR4_4_1sh6sh6lc8azvn4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Constructors.testConstructor_long2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36986,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1t914kasje() throws Throwable{try{__CLR4_4_1sh6sh6lc8azvn4.R.inc(36986);
        __CLR4_4_1sh6sh6lc8azvn4.R.inc(36987);MonthDay test = new MonthDay(TEST_TIME2);
        __CLR4_4_1sh6sh6lc8azvn4.R.inc(36988);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1sh6sh6lc8azvn4.R.inc(36989);assertEquals(5, test.getMonthOfYear());
        __CLR4_4_1sh6sh6lc8azvn4.R.inc(36990);assertEquals(7, test.getDayOfMonth());
    }finally{__CLR4_4_1sh6sh6lc8azvn4.R.flushNeeded();}}

    /**
     * Test constructor (long, Chronology)
     */
    public void testConstructor_long1_Chronology() throws Throwable {__CLR4_4_1sh6sh6lc8azvn4.R.globalSliceStart(getClass().getName(),36991);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_115wn5ssjj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1sh6sh6lc8azvn4.R.rethrow($CLV_t2$);}finally{__CLR4_4_1sh6sh6lc8azvn4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Constructors.testConstructor_long1_Chronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36991,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_115wn5ssjj() throws Throwable{try{__CLR4_4_1sh6sh6lc8azvn4.R.inc(36991);
        __CLR4_4_1sh6sh6lc8azvn4.R.inc(36992);MonthDay test = new MonthDay(TEST_TIME1, GREGORIAN_PARIS);
        __CLR4_4_1sh6sh6lc8azvn4.R.inc(36993);assertEquals(GREGORIAN_UTC, test.getChronology());
        __CLR4_4_1sh6sh6lc8azvn4.R.inc(36994);assertEquals(4, test.getMonthOfYear());
        __CLR4_4_1sh6sh6lc8azvn4.R.inc(36995);assertEquals(6, test.getDayOfMonth());
    }finally{__CLR4_4_1sh6sh6lc8azvn4.R.flushNeeded();}}

    /**
     * Test constructor (long, Chronology)
     */
    public void testConstructor_long2_Chronology() throws Throwable {__CLR4_4_1sh6sh6lc8azvn4.R.globalSliceStart(getClass().getName(),36996);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14nqmkhsjo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1sh6sh6lc8azvn4.R.rethrow($CLV_t2$);}finally{__CLR4_4_1sh6sh6lc8azvn4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Constructors.testConstructor_long2_Chronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36996,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14nqmkhsjo() throws Throwable{try{__CLR4_4_1sh6sh6lc8azvn4.R.inc(36996);
        __CLR4_4_1sh6sh6lc8azvn4.R.inc(36997);MonthDay test = new MonthDay(TEST_TIME2, GREGORIAN_PARIS);
        __CLR4_4_1sh6sh6lc8azvn4.R.inc(36998);assertEquals(GREGORIAN_UTC, test.getChronology());
        __CLR4_4_1sh6sh6lc8azvn4.R.inc(36999);assertEquals(5, test.getMonthOfYear());
        __CLR4_4_1sh6sh6lc8azvn4.R.inc(37000);assertEquals(7, test.getDayOfMonth());
    }finally{__CLR4_4_1sh6sh6lc8azvn4.R.flushNeeded();}}

    /**
     * Test constructor (long, Chronology=null)
     */
    public void testConstructor_long_nullChronology() throws Throwable {__CLR4_4_1sh6sh6lc8azvn4.R.globalSliceStart(getClass().getName(),37001);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nnhckusjt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1sh6sh6lc8azvn4.R.rethrow($CLV_t2$);}finally{__CLR4_4_1sh6sh6lc8azvn4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Constructors.testConstructor_long_nullChronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37001,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nnhckusjt() throws Throwable{try{__CLR4_4_1sh6sh6lc8azvn4.R.inc(37001);
        __CLR4_4_1sh6sh6lc8azvn4.R.inc(37002);MonthDay test = new MonthDay(TEST_TIME1, null);
        __CLR4_4_1sh6sh6lc8azvn4.R.inc(37003);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1sh6sh6lc8azvn4.R.inc(37004);assertEquals(4, test.getMonthOfYear());
        __CLR4_4_1sh6sh6lc8azvn4.R.inc(37005);assertEquals(6, test.getDayOfMonth());
    }finally{__CLR4_4_1sh6sh6lc8azvn4.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testConstructor_Object() throws Throwable {__CLR4_4_1sh6sh6lc8azvn4.R.globalSliceStart(getClass().getName(),37006);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1eplcebsjy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1sh6sh6lc8azvn4.R.rethrow($CLV_t2$);}finally{__CLR4_4_1sh6sh6lc8azvn4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Constructors.testConstructor_Object",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37006,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1eplcebsjy() throws Throwable{try{__CLR4_4_1sh6sh6lc8azvn4.R.inc(37006);
        __CLR4_4_1sh6sh6lc8azvn4.R.inc(37007);Date date = new Date(TEST_TIME1);
        __CLR4_4_1sh6sh6lc8azvn4.R.inc(37008);MonthDay test = new MonthDay(date);
        __CLR4_4_1sh6sh6lc8azvn4.R.inc(37009);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1sh6sh6lc8azvn4.R.inc(37010);assertEquals(4, test.getMonthOfYear());
        __CLR4_4_1sh6sh6lc8azvn4.R.inc(37011);assertEquals(6, test.getDayOfMonth());
    }finally{__CLR4_4_1sh6sh6lc8azvn4.R.flushNeeded();}}

    public void testConstructor_nullObject() throws Throwable {__CLR4_4_1sh6sh6lc8azvn4.R.globalSliceStart(getClass().getName(),37012);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lt59uksk4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1sh6sh6lc8azvn4.R.rethrow($CLV_t2$);}finally{__CLR4_4_1sh6sh6lc8azvn4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Constructors.testConstructor_nullObject",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37012,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lt59uksk4() throws Throwable{try{__CLR4_4_1sh6sh6lc8azvn4.R.inc(37012);
        __CLR4_4_1sh6sh6lc8azvn4.R.inc(37013);MonthDay test = new MonthDay((Object) null);
        __CLR4_4_1sh6sh6lc8azvn4.R.inc(37014);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1sh6sh6lc8azvn4.R.inc(37015);assertEquals(6, test.getMonthOfYear());
        __CLR4_4_1sh6sh6lc8azvn4.R.inc(37016);assertEquals(9, test.getDayOfMonth());
    }finally{__CLR4_4_1sh6sh6lc8azvn4.R.flushNeeded();}}

    public void testConstructor_ObjectString1() throws Throwable {__CLR4_4_1sh6sh6lc8azvn4.R.globalSliceStart(getClass().getName(),37017);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11c2b5dsk9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1sh6sh6lc8azvn4.R.rethrow($CLV_t2$);}finally{__CLR4_4_1sh6sh6lc8azvn4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Constructors.testConstructor_ObjectString1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37017,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11c2b5dsk9() throws Throwable{try{__CLR4_4_1sh6sh6lc8azvn4.R.inc(37017);
        __CLR4_4_1sh6sh6lc8azvn4.R.inc(37018);MonthDay test = new MonthDay("1972-12");
        __CLR4_4_1sh6sh6lc8azvn4.R.inc(37019);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1sh6sh6lc8azvn4.R.inc(37020);assertEquals(12, test.getMonthOfYear());
        __CLR4_4_1sh6sh6lc8azvn4.R.inc(37021);assertEquals(1, test.getDayOfMonth());
    }finally{__CLR4_4_1sh6sh6lc8azvn4.R.flushNeeded();}}

    public void testConstructor_ObjectString5() throws Throwable {__CLR4_4_1sh6sh6lc8azvn4.R.globalSliceStart(getClass().getName(),37022);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ec26b9ske();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1sh6sh6lc8azvn4.R.rethrow($CLV_t2$);}finally{__CLR4_4_1sh6sh6lc8azvn4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Constructors.testConstructor_ObjectString5",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37022,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ec26b9ske() throws Throwable{try{__CLR4_4_1sh6sh6lc8azvn4.R.inc(37022);
        __CLR4_4_1sh6sh6lc8azvn4.R.inc(37023);MonthDay test = new MonthDay("10");
        __CLR4_4_1sh6sh6lc8azvn4.R.inc(37024);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1sh6sh6lc8azvn4.R.inc(37025);assertEquals(1, test.getMonthOfYear());
        __CLR4_4_1sh6sh6lc8azvn4.R.inc(37026);assertEquals(1, test.getDayOfMonth());
    }finally{__CLR4_4_1sh6sh6lc8azvn4.R.flushNeeded();}}

    public void testConstructor_ObjectStringEx1() throws Throwable {__CLR4_4_1sh6sh6lc8azvn4.R.globalSliceStart(getClass().getName(),37027);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11dauleskj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1sh6sh6lc8azvn4.R.rethrow($CLV_t2$);}finally{__CLR4_4_1sh6sh6lc8azvn4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Constructors.testConstructor_ObjectStringEx1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37027,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11dauleskj() throws Throwable{try{__CLR4_4_1sh6sh6lc8azvn4.R.inc(37027);
        __CLR4_4_1sh6sh6lc8azvn4.R.inc(37028);try {
            __CLR4_4_1sh6sh6lc8azvn4.R.inc(37029);new MonthDay("T10:20:30.040");
            __CLR4_4_1sh6sh6lc8azvn4.R.inc(37030);fail();
        } catch (IllegalArgumentException ex) {
            // expected
        }
    }finally{__CLR4_4_1sh6sh6lc8azvn4.R.flushNeeded();}}

    public void testConstructor_ObjectStringEx2() throws Throwable {__CLR4_4_1sh6sh6lc8azvn4.R.globalSliceStart(getClass().getName(),37031);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11vp473skn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1sh6sh6lc8azvn4.R.rethrow($CLV_t2$);}finally{__CLR4_4_1sh6sh6lc8azvn4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Constructors.testConstructor_ObjectStringEx2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37031,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11vp473skn() throws Throwable{try{__CLR4_4_1sh6sh6lc8azvn4.R.inc(37031);
        __CLR4_4_1sh6sh6lc8azvn4.R.inc(37032);try {
            __CLR4_4_1sh6sh6lc8azvn4.R.inc(37033);new MonthDay("T10:20:30.040+14:00");
            __CLR4_4_1sh6sh6lc8azvn4.R.inc(37034);fail();
        } catch (IllegalArgumentException ex) {
            // expected
        }
    }finally{__CLR4_4_1sh6sh6lc8azvn4.R.flushNeeded();}}

    public void testConstructor_ObjectStringEx3() throws Throwable {__CLR4_4_1sh6sh6lc8azvn4.R.globalSliceStart(getClass().getName(),37035);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_154p2zkskr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1sh6sh6lc8azvn4.R.rethrow($CLV_t2$);}finally{__CLR4_4_1sh6sh6lc8azvn4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Constructors.testConstructor_ObjectStringEx3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37035,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_154p2zkskr() throws Throwable{try{__CLR4_4_1sh6sh6lc8azvn4.R.inc(37035);
        __CLR4_4_1sh6sh6lc8azvn4.R.inc(37036);try {
            __CLR4_4_1sh6sh6lc8azvn4.R.inc(37037);new MonthDay("10:20:30.040");
            __CLR4_4_1sh6sh6lc8azvn4.R.inc(37038);fail();
        } catch (IllegalArgumentException ex) {
            // expected
        }
    }finally{__CLR4_4_1sh6sh6lc8azvn4.R.flushNeeded();}}

    public void testConstructor_ObjectStringEx4() throws Throwable {__CLR4_4_1sh6sh6lc8azvn4.R.globalSliceStart(getClass().getName(),37039);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18dp1s1skv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1sh6sh6lc8azvn4.R.rethrow($CLV_t2$);}finally{__CLR4_4_1sh6sh6lc8azvn4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Constructors.testConstructor_ObjectStringEx4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37039,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18dp1s1skv() throws Throwable{try{__CLR4_4_1sh6sh6lc8azvn4.R.inc(37039);
        __CLR4_4_1sh6sh6lc8azvn4.R.inc(37040);try {
            __CLR4_4_1sh6sh6lc8azvn4.R.inc(37041);new MonthDay("10:20:30.040+14:00");
            __CLR4_4_1sh6sh6lc8azvn4.R.inc(37042);fail();
        } catch (IllegalArgumentException ex) {
            // expected
        }
    }finally{__CLR4_4_1sh6sh6lc8azvn4.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Test constructor (Object, Chronology)
     */
    public void testConstructor_Object_Chronology() throws Throwable {__CLR4_4_1sh6sh6lc8azvn4.R.globalSliceStart(getClass().getName(),37043);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vmnvd4skz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1sh6sh6lc8azvn4.R.rethrow($CLV_t2$);}finally{__CLR4_4_1sh6sh6lc8azvn4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Constructors.testConstructor_Object_Chronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37043,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vmnvd4skz() throws Throwable{try{__CLR4_4_1sh6sh6lc8azvn4.R.inc(37043);
        __CLR4_4_1sh6sh6lc8azvn4.R.inc(37044);Date date = new Date(TEST_TIME1);
        __CLR4_4_1sh6sh6lc8azvn4.R.inc(37045);MonthDay test = new MonthDay(date, GREGORIAN_PARIS);
        __CLR4_4_1sh6sh6lc8azvn4.R.inc(37046);assertEquals(GREGORIAN_UTC, test.getChronology());
        __CLR4_4_1sh6sh6lc8azvn4.R.inc(37047);assertEquals(4, test.getMonthOfYear());
        __CLR4_4_1sh6sh6lc8azvn4.R.inc(37048);assertEquals(6, test.getDayOfMonth());
    }finally{__CLR4_4_1sh6sh6lc8azvn4.R.flushNeeded();}}

    /**
     * Test constructor (Object=null, Chronology)
     */
    public void testConstructor_nullObject_Chronology() throws Throwable {__CLR4_4_1sh6sh6lc8azvn4.R.globalSliceStart(getClass().getName(),37049);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14q0uynsl5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1sh6sh6lc8azvn4.R.rethrow($CLV_t2$);}finally{__CLR4_4_1sh6sh6lc8azvn4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Constructors.testConstructor_nullObject_Chronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37049,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14q0uynsl5() throws Throwable{try{__CLR4_4_1sh6sh6lc8azvn4.R.inc(37049);
        __CLR4_4_1sh6sh6lc8azvn4.R.inc(37050);MonthDay test = new MonthDay((Object) null, GREGORIAN_PARIS);
        __CLR4_4_1sh6sh6lc8azvn4.R.inc(37051);assertEquals(GREGORIAN_UTC, test.getChronology());
        __CLR4_4_1sh6sh6lc8azvn4.R.inc(37052);assertEquals(6, test.getMonthOfYear());
        __CLR4_4_1sh6sh6lc8azvn4.R.inc(37053);assertEquals(9, test.getDayOfMonth());
    }finally{__CLR4_4_1sh6sh6lc8azvn4.R.flushNeeded();}}

    /**
     * Test constructor (Object, Chronology=null)
     */
    public void testConstructor_Object_nullChronology() throws Throwable {__CLR4_4_1sh6sh6lc8azvn4.R.globalSliceStart(getClass().getName(),37054);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yccijzsla();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1sh6sh6lc8azvn4.R.rethrow($CLV_t2$);}finally{__CLR4_4_1sh6sh6lc8azvn4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Constructors.testConstructor_Object_nullChronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37054,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yccijzsla() throws Throwable{try{__CLR4_4_1sh6sh6lc8azvn4.R.inc(37054);
        __CLR4_4_1sh6sh6lc8azvn4.R.inc(37055);Date date = new Date(TEST_TIME1);
        __CLR4_4_1sh6sh6lc8azvn4.R.inc(37056);MonthDay test = new MonthDay(date, null);
        __CLR4_4_1sh6sh6lc8azvn4.R.inc(37057);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1sh6sh6lc8azvn4.R.inc(37058);assertEquals(4, test.getMonthOfYear());
        __CLR4_4_1sh6sh6lc8azvn4.R.inc(37059);assertEquals(6, test.getDayOfMonth());
    }finally{__CLR4_4_1sh6sh6lc8azvn4.R.flushNeeded();}}

    /**
     * Test constructor (Object=null, Chronology=null)
     */
    public void testConstructor_nullObject_nullChronology() throws Throwable {__CLR4_4_1sh6sh6lc8azvn4.R.globalSliceStart(getClass().getName(),37060);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14dtve0slg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1sh6sh6lc8azvn4.R.rethrow($CLV_t2$);}finally{__CLR4_4_1sh6sh6lc8azvn4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Constructors.testConstructor_nullObject_nullChronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37060,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14dtve0slg() throws Throwable{try{__CLR4_4_1sh6sh6lc8azvn4.R.inc(37060);
        __CLR4_4_1sh6sh6lc8azvn4.R.inc(37061);MonthDay test = new MonthDay((Object) null, null);
        __CLR4_4_1sh6sh6lc8azvn4.R.inc(37062);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1sh6sh6lc8azvn4.R.inc(37063);assertEquals(6, test.getMonthOfYear());
        __CLR4_4_1sh6sh6lc8azvn4.R.inc(37064);assertEquals(9, test.getDayOfMonth());
    }finally{__CLR4_4_1sh6sh6lc8azvn4.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Test constructor (int, int)
     */
    public void testConstructor_int_int() throws Throwable {__CLR4_4_1sh6sh6lc8azvn4.R.globalSliceStart(getClass().getName(),37065);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1b5ioxbsll();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1sh6sh6lc8azvn4.R.rethrow($CLV_t2$);}finally{__CLR4_4_1sh6sh6lc8azvn4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Constructors.testConstructor_int_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37065,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1b5ioxbsll() throws Throwable{try{__CLR4_4_1sh6sh6lc8azvn4.R.inc(37065);
        __CLR4_4_1sh6sh6lc8azvn4.R.inc(37066);MonthDay test = new MonthDay(6, 30);
        __CLR4_4_1sh6sh6lc8azvn4.R.inc(37067);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1sh6sh6lc8azvn4.R.inc(37068);assertEquals(6, test.getMonthOfYear());
        __CLR4_4_1sh6sh6lc8azvn4.R.inc(37069);assertEquals(30, test.getDayOfMonth());
        __CLR4_4_1sh6sh6lc8azvn4.R.inc(37070);try {
            __CLR4_4_1sh6sh6lc8azvn4.R.inc(37071);new MonthDay(Integer.MIN_VALUE, 6);
            __CLR4_4_1sh6sh6lc8azvn4.R.inc(37072);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_1sh6sh6lc8azvn4.R.inc(37073);try {
            __CLR4_4_1sh6sh6lc8azvn4.R.inc(37074);new MonthDay(Integer.MAX_VALUE, 6);
            __CLR4_4_1sh6sh6lc8azvn4.R.inc(37075);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_1sh6sh6lc8azvn4.R.inc(37076);try {
            __CLR4_4_1sh6sh6lc8azvn4.R.inc(37077);new MonthDay(1970, 0);
            __CLR4_4_1sh6sh6lc8azvn4.R.inc(37078);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_1sh6sh6lc8azvn4.R.inc(37079);try {
            __CLR4_4_1sh6sh6lc8azvn4.R.inc(37080);new MonthDay(1970, 13);
            __CLR4_4_1sh6sh6lc8azvn4.R.inc(37081);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1sh6sh6lc8azvn4.R.flushNeeded();}}

    /**
     * Test constructor (int, int, Chronology)
     */
    public void testConstructor_int_int_Chronology() throws Throwable {__CLR4_4_1sh6sh6lc8azvn4.R.globalSliceStart(getClass().getName(),37082);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bb8f3esm2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1sh6sh6lc8azvn4.R.rethrow($CLV_t2$);}finally{__CLR4_4_1sh6sh6lc8azvn4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Constructors.testConstructor_int_int_Chronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37082,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bb8f3esm2() throws Throwable{try{__CLR4_4_1sh6sh6lc8azvn4.R.inc(37082);
        __CLR4_4_1sh6sh6lc8azvn4.R.inc(37083);MonthDay test = new MonthDay(6, 30, GREGORIAN_PARIS);
        __CLR4_4_1sh6sh6lc8azvn4.R.inc(37084);assertEquals(GREGORIAN_UTC, test.getChronology());
        __CLR4_4_1sh6sh6lc8azvn4.R.inc(37085);assertEquals(6, test.getMonthOfYear());
        __CLR4_4_1sh6sh6lc8azvn4.R.inc(37086);assertEquals(30, test.getDayOfMonth());
        __CLR4_4_1sh6sh6lc8azvn4.R.inc(37087);try {
            __CLR4_4_1sh6sh6lc8azvn4.R.inc(37088);new MonthDay(Integer.MIN_VALUE, 6, GREGORIAN_PARIS);
            __CLR4_4_1sh6sh6lc8azvn4.R.inc(37089);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_1sh6sh6lc8azvn4.R.inc(37090);try {
            __CLR4_4_1sh6sh6lc8azvn4.R.inc(37091);new MonthDay(Integer.MAX_VALUE, 6, GREGORIAN_PARIS);
            __CLR4_4_1sh6sh6lc8azvn4.R.inc(37092);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_1sh6sh6lc8azvn4.R.inc(37093);try {
            __CLR4_4_1sh6sh6lc8azvn4.R.inc(37094);new MonthDay(1970, 0, GREGORIAN_PARIS);
            __CLR4_4_1sh6sh6lc8azvn4.R.inc(37095);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_1sh6sh6lc8azvn4.R.inc(37096);try {
            __CLR4_4_1sh6sh6lc8azvn4.R.inc(37097);new MonthDay(1970, 13, GREGORIAN_PARIS);
            __CLR4_4_1sh6sh6lc8azvn4.R.inc(37098);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1sh6sh6lc8azvn4.R.flushNeeded();}}

    /**
     * Test constructor (int, int, Chronology=null)
     */
    public void testConstructor_int_int_nullChronology() throws Throwable {__CLR4_4_1sh6sh6lc8azvn4.R.globalSliceStart(getClass().getName(),37099);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1b34hdvsmj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1sh6sh6lc8azvn4.R.rethrow($CLV_t2$);}finally{__CLR4_4_1sh6sh6lc8azvn4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Constructors.testConstructor_int_int_nullChronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37099,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1b34hdvsmj() throws Throwable{try{__CLR4_4_1sh6sh6lc8azvn4.R.inc(37099);
        __CLR4_4_1sh6sh6lc8azvn4.R.inc(37100);MonthDay test = new MonthDay(6, 30, null);
        __CLR4_4_1sh6sh6lc8azvn4.R.inc(37101);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1sh6sh6lc8azvn4.R.inc(37102);assertEquals(6, test.getMonthOfYear());
        __CLR4_4_1sh6sh6lc8azvn4.R.inc(37103);assertEquals(30, test.getDayOfMonth());
    }finally{__CLR4_4_1sh6sh6lc8azvn4.R.flushNeeded();}}

}
