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
 * This class is a Junit unit test for YearMonth.
 *
 * @author Stephen Colebourne
 */
public class TestYearMonth_Constructors extends TestCase {static class __CLR4_4_1124s124slc8azwi5{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672271031490L,8589935092L,49616,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

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

    public static void main(String[] args) {try{__CLR4_4_1124s124slc8azwi5.R.inc(49420);
        __CLR4_4_1124s124slc8azwi5.R.inc(49421);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1124s124slc8azwi5.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1124s124slc8azwi5.R.inc(49422);
        __CLR4_4_1124s124slc8azwi5.R.inc(49423);return new TestSuite(TestYearMonth_Constructors.class);
    }finally{__CLR4_4_1124s124slc8azwi5.R.flushNeeded();}}

    public TestYearMonth_Constructors(String name) {
        super(name);__CLR4_4_1124s124slc8azwi5.R.inc(49425);try{__CLR4_4_1124s124slc8azwi5.R.inc(49424);
    }finally{__CLR4_4_1124s124slc8azwi5.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1124s124slc8azwi5.R.inc(49426);
        __CLR4_4_1124s124slc8azwi5.R.inc(49427);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1124s124slc8azwi5.R.inc(49428);zone = DateTimeZone.getDefault();
        __CLR4_4_1124s124slc8azwi5.R.inc(49429);DateTimeZone.setDefault(LONDON);
    }finally{__CLR4_4_1124s124slc8azwi5.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1124s124slc8azwi5.R.inc(49430);
        __CLR4_4_1124s124slc8azwi5.R.inc(49431);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1124s124slc8azwi5.R.inc(49432);DateTimeZone.setDefault(zone);
        __CLR4_4_1124s124slc8azwi5.R.inc(49433);zone = null;
    }finally{__CLR4_4_1124s124slc8azwi5.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testParse_noFormatter() throws Throwable {__CLR4_4_1124s124slc8azwi5.R.globalSliceStart(getClass().getName(),49434);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1o2oqvi1256();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1124s124slc8azwi5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1124s124slc8azwi5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Constructors.testParse_noFormatter",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),49434,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1o2oqvi1256() throws Throwable{try{__CLR4_4_1124s124slc8azwi5.R.inc(49434);
        __CLR4_4_1124s124slc8azwi5.R.inc(49435);assertEquals(new YearMonth(2010, 6), YearMonth.parse("2010-06-30"));
        __CLR4_4_1124s124slc8azwi5.R.inc(49436);assertEquals(new YearMonth(2010, 1), YearMonth.parse("2010-002"));
    }finally{__CLR4_4_1124s124slc8azwi5.R.flushNeeded();}}

    public void testParse_formatter() throws Throwable {__CLR4_4_1124s124slc8azwi5.R.globalSliceStart(getClass().getName(),49437);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15wvtnx1259();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1124s124slc8azwi5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1124s124slc8azwi5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Constructors.testParse_formatter",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),49437,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15wvtnx1259() throws Throwable{try{__CLR4_4_1124s124slc8azwi5.R.inc(49437);
        __CLR4_4_1124s124slc8azwi5.R.inc(49438);DateTimeFormatter f = DateTimeFormat.forPattern("yyyy--MM").withChronology(ISOChronology.getInstance(PARIS));
        __CLR4_4_1124s124slc8azwi5.R.inc(49439);assertEquals(new YearMonth(2010, 6), YearMonth.parse("2010--06", f));
    }finally{__CLR4_4_1124s124slc8azwi5.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testFactory_FromCalendarFields() throws Exception {__CLR4_4_1124s124slc8azwi5.R.globalSliceStart(getClass().getName(),49440);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wxckb3125c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1124s124slc8azwi5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1124s124slc8azwi5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Constructors.testFactory_FromCalendarFields",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),49440,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wxckb3125c() throws Exception{try{__CLR4_4_1124s124slc8azwi5.R.inc(49440);
        __CLR4_4_1124s124slc8azwi5.R.inc(49441);GregorianCalendar cal = new GregorianCalendar(1970, 1, 3, 4, 5, 6);
        __CLR4_4_1124s124slc8azwi5.R.inc(49442);cal.set(Calendar.MILLISECOND, 7);
        __CLR4_4_1124s124slc8azwi5.R.inc(49443);YearMonth expected = new YearMonth(1970, 2);
        __CLR4_4_1124s124slc8azwi5.R.inc(49444);assertEquals(expected, YearMonth.fromCalendarFields(cal));
        __CLR4_4_1124s124slc8azwi5.R.inc(49445);try {
            __CLR4_4_1124s124slc8azwi5.R.inc(49446);YearMonth.fromCalendarFields(null);
            __CLR4_4_1124s124slc8azwi5.R.inc(49447);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1124s124slc8azwi5.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testFactory_FromDateFields() throws Exception {__CLR4_4_1124s124slc8azwi5.R.globalSliceStart(getClass().getName(),49448);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16u5j27125k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1124s124slc8azwi5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1124s124slc8azwi5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Constructors.testFactory_FromDateFields",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),49448,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16u5j27125k() throws Exception{try{__CLR4_4_1124s124slc8azwi5.R.inc(49448);
        __CLR4_4_1124s124slc8azwi5.R.inc(49449);GregorianCalendar cal = new GregorianCalendar(1970, 1, 3, 4, 5, 6);
        __CLR4_4_1124s124slc8azwi5.R.inc(49450);cal.set(Calendar.MILLISECOND, 7);
        __CLR4_4_1124s124slc8azwi5.R.inc(49451);YearMonth expected = new YearMonth(1970, 2);
        __CLR4_4_1124s124slc8azwi5.R.inc(49452);assertEquals(expected, YearMonth.fromDateFields(cal.getTime()));
        __CLR4_4_1124s124slc8azwi5.R.inc(49453);try {
            __CLR4_4_1124s124slc8azwi5.R.inc(49454);YearMonth.fromDateFields(null);
            __CLR4_4_1124s124slc8azwi5.R.inc(49455);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1124s124slc8azwi5.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Test constructor ()
     */
    public void testConstructor() throws Throwable {__CLR4_4_1124s124slc8azwi5.R.globalSliceStart(getClass().getName(),49456);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uefs8h125s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1124s124slc8azwi5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1124s124slc8azwi5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Constructors.testConstructor",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),49456,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uefs8h125s() throws Throwable{try{__CLR4_4_1124s124slc8azwi5.R.inc(49456);
        __CLR4_4_1124s124slc8azwi5.R.inc(49457);YearMonth test = new YearMonth();
        __CLR4_4_1124s124slc8azwi5.R.inc(49458);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1124s124slc8azwi5.R.inc(49459);assertEquals(1970, test.getYear());
        __CLR4_4_1124s124slc8azwi5.R.inc(49460);assertEquals(6, test.getMonthOfYear());
        __CLR4_4_1124s124slc8azwi5.R.inc(49461);assertEquals(test, YearMonth.now());
    }finally{__CLR4_4_1124s124slc8azwi5.R.flushNeeded();}}

    /**
     * Test constructor (DateTimeZone)
     */
    public void testConstructor_DateTimeZone() throws Throwable {__CLR4_4_1124s124slc8azwi5.R.globalSliceStart(getClass().getName(),49462);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1z4m1k5125y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1124s124slc8azwi5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1124s124slc8azwi5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Constructors.testConstructor_DateTimeZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),49462,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1z4m1k5125y() throws Throwable{try{__CLR4_4_1124s124slc8azwi5.R.inc(49462);
        __CLR4_4_1124s124slc8azwi5.R.inc(49463);DateTime dt = new DateTime(2005, 6, 30, 23, 59, 0, 0, LONDON);
        __CLR4_4_1124s124slc8azwi5.R.inc(49464);DateTimeUtils.setCurrentMillisFixed(dt.getMillis());
        // 23:59 in London is 00:59 the following day in Paris
        
        __CLR4_4_1124s124slc8azwi5.R.inc(49465);YearMonth test = new YearMonth(LONDON);
        __CLR4_4_1124s124slc8azwi5.R.inc(49466);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1124s124slc8azwi5.R.inc(49467);assertEquals(2005, test.getYear());
        __CLR4_4_1124s124slc8azwi5.R.inc(49468);assertEquals(6, test.getMonthOfYear());
        __CLR4_4_1124s124slc8azwi5.R.inc(49469);assertEquals(test, YearMonth.now(LONDON));
        
        __CLR4_4_1124s124slc8azwi5.R.inc(49470);test = new YearMonth(PARIS);
        __CLR4_4_1124s124slc8azwi5.R.inc(49471);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1124s124slc8azwi5.R.inc(49472);assertEquals(2005, test.getYear());
        __CLR4_4_1124s124slc8azwi5.R.inc(49473);assertEquals(7, test.getMonthOfYear());
        __CLR4_4_1124s124slc8azwi5.R.inc(49474);assertEquals(test, YearMonth.now(PARIS));
    }finally{__CLR4_4_1124s124slc8azwi5.R.flushNeeded();}}

    /**
     * Test constructor (DateTimeZone=null)
     */
    public void testConstructor_nullDateTimeZone() throws Throwable {__CLR4_4_1124s124slc8azwi5.R.globalSliceStart(getClass().getName(),49475);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17zs1ro126b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1124s124slc8azwi5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1124s124slc8azwi5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Constructors.testConstructor_nullDateTimeZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),49475,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17zs1ro126b() throws Throwable{try{__CLR4_4_1124s124slc8azwi5.R.inc(49475);
        __CLR4_4_1124s124slc8azwi5.R.inc(49476);DateTime dt = new DateTime(2005, 6, 30, 23, 59, 0, 0, LONDON);
        __CLR4_4_1124s124slc8azwi5.R.inc(49477);DateTimeUtils.setCurrentMillisFixed(dt.getMillis());
        // 23:59 in London is 00:59 the following day in Paris
        
        __CLR4_4_1124s124slc8azwi5.R.inc(49478);YearMonth test = new YearMonth((DateTimeZone) null);
        __CLR4_4_1124s124slc8azwi5.R.inc(49479);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1124s124slc8azwi5.R.inc(49480);assertEquals(2005, test.getYear());
        __CLR4_4_1124s124slc8azwi5.R.inc(49481);assertEquals(6, test.getMonthOfYear());
    }finally{__CLR4_4_1124s124slc8azwi5.R.flushNeeded();}}

    /**
     * Test constructor (Chronology)
     */
    public void testConstructor_Chronology() throws Throwable {__CLR4_4_1124s124slc8azwi5.R.globalSliceStart(getClass().getName(),49482);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15931ti126i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1124s124slc8azwi5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1124s124slc8azwi5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Constructors.testConstructor_Chronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),49482,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15931ti126i() throws Throwable{try{__CLR4_4_1124s124slc8azwi5.R.inc(49482);
        __CLR4_4_1124s124slc8azwi5.R.inc(49483);YearMonth test = new YearMonth(GREGORIAN_PARIS);
        __CLR4_4_1124s124slc8azwi5.R.inc(49484);assertEquals(GREGORIAN_UTC, test.getChronology());
        __CLR4_4_1124s124slc8azwi5.R.inc(49485);assertEquals(1970, test.getYear());
        __CLR4_4_1124s124slc8azwi5.R.inc(49486);assertEquals(6, test.getMonthOfYear());
        __CLR4_4_1124s124slc8azwi5.R.inc(49487);assertEquals(test, YearMonth.now(GREGORIAN_PARIS));
    }finally{__CLR4_4_1124s124slc8azwi5.R.flushNeeded();}}

    /**
     * Test constructor (Chronology=null)
     */
    public void testConstructor_nullChronology() throws Throwable {__CLR4_4_1124s124slc8azwi5.R.globalSliceStart(getClass().getName(),49488);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15qcb6r126o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1124s124slc8azwi5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1124s124slc8azwi5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Constructors.testConstructor_nullChronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),49488,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15qcb6r126o() throws Throwable{try{__CLR4_4_1124s124slc8azwi5.R.inc(49488);
        __CLR4_4_1124s124slc8azwi5.R.inc(49489);YearMonth test = new YearMonth((Chronology) null);
        __CLR4_4_1124s124slc8azwi5.R.inc(49490);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1124s124slc8azwi5.R.inc(49491);assertEquals(1970, test.getYear());
        __CLR4_4_1124s124slc8azwi5.R.inc(49492);assertEquals(6, test.getMonthOfYear());
    }finally{__CLR4_4_1124s124slc8azwi5.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Test constructor (long)
     */
    public void testConstructor_long1() throws Throwable {__CLR4_4_1124s124slc8azwi5.R.globalSliceStart(getClass().getName(),49493);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wi13cr126t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1124s124slc8azwi5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1124s124slc8azwi5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Constructors.testConstructor_long1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),49493,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wi13cr126t() throws Throwable{try{__CLR4_4_1124s124slc8azwi5.R.inc(49493);
        __CLR4_4_1124s124slc8azwi5.R.inc(49494);YearMonth test = new YearMonth(TEST_TIME1);
        __CLR4_4_1124s124slc8azwi5.R.inc(49495);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1124s124slc8azwi5.R.inc(49496);assertEquals(1970, test.getYear());
        __CLR4_4_1124s124slc8azwi5.R.inc(49497);assertEquals(4, test.getMonthOfYear());
    }finally{__CLR4_4_1124s124slc8azwi5.R.flushNeeded();}}

    /**
     * Test constructor (long)
     */
    public void testConstructor_long2() throws Throwable {__CLR4_4_1124s124slc8azwi5.R.globalSliceStart(getClass().getName(),49498);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1t914ka126y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1124s124slc8azwi5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1124s124slc8azwi5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Constructors.testConstructor_long2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),49498,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1t914ka126y() throws Throwable{try{__CLR4_4_1124s124slc8azwi5.R.inc(49498);
        __CLR4_4_1124s124slc8azwi5.R.inc(49499);YearMonth test = new YearMonth(TEST_TIME2);
        __CLR4_4_1124s124slc8azwi5.R.inc(49500);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1124s124slc8azwi5.R.inc(49501);assertEquals(1971, test.getYear());
        __CLR4_4_1124s124slc8azwi5.R.inc(49502);assertEquals(5, test.getMonthOfYear());
    }finally{__CLR4_4_1124s124slc8azwi5.R.flushNeeded();}}

    /**
     * Test constructor (long, Chronology)
     */
    public void testConstructor_long1_Chronology() throws Throwable {__CLR4_4_1124s124slc8azwi5.R.globalSliceStart(getClass().getName(),49503);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_115wn5s1273();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1124s124slc8azwi5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1124s124slc8azwi5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Constructors.testConstructor_long1_Chronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),49503,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_115wn5s1273() throws Throwable{try{__CLR4_4_1124s124slc8azwi5.R.inc(49503);
        __CLR4_4_1124s124slc8azwi5.R.inc(49504);YearMonth test = new YearMonth(TEST_TIME1, GREGORIAN_PARIS);
        __CLR4_4_1124s124slc8azwi5.R.inc(49505);assertEquals(GREGORIAN_UTC, test.getChronology());
        __CLR4_4_1124s124slc8azwi5.R.inc(49506);assertEquals(1970, test.getYear());
        __CLR4_4_1124s124slc8azwi5.R.inc(49507);assertEquals(4, test.getMonthOfYear());
    }finally{__CLR4_4_1124s124slc8azwi5.R.flushNeeded();}}

    /**
     * Test constructor (long, Chronology)
     */
    public void testConstructor_long2_Chronology() throws Throwable {__CLR4_4_1124s124slc8azwi5.R.globalSliceStart(getClass().getName(),49508);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14nqmkh1278();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1124s124slc8azwi5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1124s124slc8azwi5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Constructors.testConstructor_long2_Chronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),49508,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14nqmkh1278() throws Throwable{try{__CLR4_4_1124s124slc8azwi5.R.inc(49508);
        __CLR4_4_1124s124slc8azwi5.R.inc(49509);YearMonth test = new YearMonth(TEST_TIME2, GREGORIAN_PARIS);
        __CLR4_4_1124s124slc8azwi5.R.inc(49510);assertEquals(GREGORIAN_UTC, test.getChronology());
        __CLR4_4_1124s124slc8azwi5.R.inc(49511);assertEquals(1971, test.getYear());
        __CLR4_4_1124s124slc8azwi5.R.inc(49512);assertEquals(5, test.getMonthOfYear());
    }finally{__CLR4_4_1124s124slc8azwi5.R.flushNeeded();}}

    /**
     * Test constructor (long, Chronology=null)
     */
    public void testConstructor_long_nullChronology() throws Throwable {__CLR4_4_1124s124slc8azwi5.R.globalSliceStart(getClass().getName(),49513);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nnhcku127d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1124s124slc8azwi5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1124s124slc8azwi5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Constructors.testConstructor_long_nullChronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),49513,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nnhcku127d() throws Throwable{try{__CLR4_4_1124s124slc8azwi5.R.inc(49513);
        __CLR4_4_1124s124slc8azwi5.R.inc(49514);YearMonth test = new YearMonth(TEST_TIME1, null);
        __CLR4_4_1124s124slc8azwi5.R.inc(49515);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1124s124slc8azwi5.R.inc(49516);assertEquals(1970, test.getYear());
        __CLR4_4_1124s124slc8azwi5.R.inc(49517);assertEquals(4, test.getMonthOfYear());
    }finally{__CLR4_4_1124s124slc8azwi5.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testConstructor_Object() throws Throwable {__CLR4_4_1124s124slc8azwi5.R.globalSliceStart(getClass().getName(),49518);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1eplceb127i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1124s124slc8azwi5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1124s124slc8azwi5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Constructors.testConstructor_Object",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),49518,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1eplceb127i() throws Throwable{try{__CLR4_4_1124s124slc8azwi5.R.inc(49518);
        __CLR4_4_1124s124slc8azwi5.R.inc(49519);Date date = new Date(TEST_TIME1);
        __CLR4_4_1124s124slc8azwi5.R.inc(49520);YearMonth test = new YearMonth(date);
        __CLR4_4_1124s124slc8azwi5.R.inc(49521);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1124s124slc8azwi5.R.inc(49522);assertEquals(1970, test.getYear());
        __CLR4_4_1124s124slc8azwi5.R.inc(49523);assertEquals(4, test.getMonthOfYear());
    }finally{__CLR4_4_1124s124slc8azwi5.R.flushNeeded();}}

    public void testConstructor_nullObject() throws Throwable {__CLR4_4_1124s124slc8azwi5.R.globalSliceStart(getClass().getName(),49524);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lt59uk127o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1124s124slc8azwi5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1124s124slc8azwi5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Constructors.testConstructor_nullObject",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),49524,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lt59uk127o() throws Throwable{try{__CLR4_4_1124s124slc8azwi5.R.inc(49524);
        __CLR4_4_1124s124slc8azwi5.R.inc(49525);YearMonth test = new YearMonth((Object) null);
        __CLR4_4_1124s124slc8azwi5.R.inc(49526);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1124s124slc8azwi5.R.inc(49527);assertEquals(1970, test.getYear());
        __CLR4_4_1124s124slc8azwi5.R.inc(49528);assertEquals(6, test.getMonthOfYear());
    }finally{__CLR4_4_1124s124slc8azwi5.R.flushNeeded();}}

    public void testConstructor_ObjectString1() throws Throwable {__CLR4_4_1124s124slc8azwi5.R.globalSliceStart(getClass().getName(),49529);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11c2b5d127t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1124s124slc8azwi5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1124s124slc8azwi5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Constructors.testConstructor_ObjectString1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),49529,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11c2b5d127t() throws Throwable{try{__CLR4_4_1124s124slc8azwi5.R.inc(49529);
        __CLR4_4_1124s124slc8azwi5.R.inc(49530);YearMonth test = new YearMonth("1972-12");
        __CLR4_4_1124s124slc8azwi5.R.inc(49531);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1124s124slc8azwi5.R.inc(49532);assertEquals(1972, test.getYear());
        __CLR4_4_1124s124slc8azwi5.R.inc(49533);assertEquals(12, test.getMonthOfYear());
    }finally{__CLR4_4_1124s124slc8azwi5.R.flushNeeded();}}

    public void testConstructor_ObjectString5() throws Throwable {__CLR4_4_1124s124slc8azwi5.R.globalSliceStart(getClass().getName(),49534);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ec26b9127y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1124s124slc8azwi5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1124s124slc8azwi5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Constructors.testConstructor_ObjectString5",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),49534,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ec26b9127y() throws Throwable{try{__CLR4_4_1124s124slc8azwi5.R.inc(49534);
        __CLR4_4_1124s124slc8azwi5.R.inc(49535);YearMonth test = new YearMonth("10");
        __CLR4_4_1124s124slc8azwi5.R.inc(49536);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1124s124slc8azwi5.R.inc(49537);assertEquals(10, test.getYear());
        __CLR4_4_1124s124slc8azwi5.R.inc(49538);assertEquals(1, test.getMonthOfYear());
    }finally{__CLR4_4_1124s124slc8azwi5.R.flushNeeded();}}

    public void testConstructor_ObjectStringEx1() throws Throwable {__CLR4_4_1124s124slc8azwi5.R.globalSliceStart(getClass().getName(),49539);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11daule1283();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1124s124slc8azwi5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1124s124slc8azwi5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Constructors.testConstructor_ObjectStringEx1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),49539,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11daule1283() throws Throwable{try{__CLR4_4_1124s124slc8azwi5.R.inc(49539);
        __CLR4_4_1124s124slc8azwi5.R.inc(49540);try {
            __CLR4_4_1124s124slc8azwi5.R.inc(49541);new YearMonth("T10:20:30.040");
            __CLR4_4_1124s124slc8azwi5.R.inc(49542);fail();
        } catch (IllegalArgumentException ex) {
            // expected
        }
    }finally{__CLR4_4_1124s124slc8azwi5.R.flushNeeded();}}

    public void testConstructor_ObjectStringEx2() throws Throwable {__CLR4_4_1124s124slc8azwi5.R.globalSliceStart(getClass().getName(),49543);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11vp4731287();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1124s124slc8azwi5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1124s124slc8azwi5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Constructors.testConstructor_ObjectStringEx2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),49543,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11vp4731287() throws Throwable{try{__CLR4_4_1124s124slc8azwi5.R.inc(49543);
        __CLR4_4_1124s124slc8azwi5.R.inc(49544);try {
            __CLR4_4_1124s124slc8azwi5.R.inc(49545);new YearMonth("T10:20:30.040+14:00");
            __CLR4_4_1124s124slc8azwi5.R.inc(49546);fail();
        } catch (IllegalArgumentException ex) {
            // expected
        }
    }finally{__CLR4_4_1124s124slc8azwi5.R.flushNeeded();}}

    public void testConstructor_ObjectStringEx3() throws Throwable {__CLR4_4_1124s124slc8azwi5.R.globalSliceStart(getClass().getName(),49547);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_154p2zk128b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1124s124slc8azwi5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1124s124slc8azwi5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Constructors.testConstructor_ObjectStringEx3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),49547,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_154p2zk128b() throws Throwable{try{__CLR4_4_1124s124slc8azwi5.R.inc(49547);
        __CLR4_4_1124s124slc8azwi5.R.inc(49548);try {
            __CLR4_4_1124s124slc8azwi5.R.inc(49549);new YearMonth("10:20:30.040");
            __CLR4_4_1124s124slc8azwi5.R.inc(49550);fail();
        } catch (IllegalArgumentException ex) {
            // expected
        }
    }finally{__CLR4_4_1124s124slc8azwi5.R.flushNeeded();}}

    public void testConstructor_ObjectStringEx4() throws Throwable {__CLR4_4_1124s124slc8azwi5.R.globalSliceStart(getClass().getName(),49551);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18dp1s1128f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1124s124slc8azwi5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1124s124slc8azwi5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Constructors.testConstructor_ObjectStringEx4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),49551,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18dp1s1128f() throws Throwable{try{__CLR4_4_1124s124slc8azwi5.R.inc(49551);
        __CLR4_4_1124s124slc8azwi5.R.inc(49552);try {
            __CLR4_4_1124s124slc8azwi5.R.inc(49553);new YearMonth("10:20:30.040+14:00");
            __CLR4_4_1124s124slc8azwi5.R.inc(49554);fail();
        } catch (IllegalArgumentException ex) {
            // expected
        }
    }finally{__CLR4_4_1124s124slc8azwi5.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Test constructor (Object, Chronology)
     */
    public void testConstructor_Object_Chronology() throws Throwable {__CLR4_4_1124s124slc8azwi5.R.globalSliceStart(getClass().getName(),49555);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vmnvd4128j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1124s124slc8azwi5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1124s124slc8azwi5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Constructors.testConstructor_Object_Chronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),49555,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vmnvd4128j() throws Throwable{try{__CLR4_4_1124s124slc8azwi5.R.inc(49555);
        __CLR4_4_1124s124slc8azwi5.R.inc(49556);Date date = new Date(TEST_TIME1);
        __CLR4_4_1124s124slc8azwi5.R.inc(49557);YearMonth test = new YearMonth(date, GREGORIAN_PARIS);
        __CLR4_4_1124s124slc8azwi5.R.inc(49558);assertEquals(GREGORIAN_UTC, test.getChronology());
        __CLR4_4_1124s124slc8azwi5.R.inc(49559);assertEquals(1970, test.getYear());
        __CLR4_4_1124s124slc8azwi5.R.inc(49560);assertEquals(4, test.getMonthOfYear());
    }finally{__CLR4_4_1124s124slc8azwi5.R.flushNeeded();}}

    /**
     * Test constructor (Object=null, Chronology)
     */
    public void testConstructor_nullObject_Chronology() throws Throwable {__CLR4_4_1124s124slc8azwi5.R.globalSliceStart(getClass().getName(),49561);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14q0uyn128p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1124s124slc8azwi5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1124s124slc8azwi5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Constructors.testConstructor_nullObject_Chronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),49561,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14q0uyn128p() throws Throwable{try{__CLR4_4_1124s124slc8azwi5.R.inc(49561);
        __CLR4_4_1124s124slc8azwi5.R.inc(49562);YearMonth test = new YearMonth((Object) null, GREGORIAN_PARIS);
        __CLR4_4_1124s124slc8azwi5.R.inc(49563);assertEquals(GREGORIAN_UTC, test.getChronology());
        __CLR4_4_1124s124slc8azwi5.R.inc(49564);assertEquals(1970, test.getYear());
        __CLR4_4_1124s124slc8azwi5.R.inc(49565);assertEquals(6, test.getMonthOfYear());
    }finally{__CLR4_4_1124s124slc8azwi5.R.flushNeeded();}}

    /**
     * Test constructor (Object, Chronology=null)
     */
    public void testConstructor_Object_nullChronology() throws Throwable {__CLR4_4_1124s124slc8azwi5.R.globalSliceStart(getClass().getName(),49566);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yccijz128u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1124s124slc8azwi5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1124s124slc8azwi5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Constructors.testConstructor_Object_nullChronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),49566,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yccijz128u() throws Throwable{try{__CLR4_4_1124s124slc8azwi5.R.inc(49566);
        __CLR4_4_1124s124slc8azwi5.R.inc(49567);Date date = new Date(TEST_TIME1);
        __CLR4_4_1124s124slc8azwi5.R.inc(49568);YearMonth test = new YearMonth(date, null);
        __CLR4_4_1124s124slc8azwi5.R.inc(49569);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1124s124slc8azwi5.R.inc(49570);assertEquals(1970, test.getYear());
        __CLR4_4_1124s124slc8azwi5.R.inc(49571);assertEquals(4, test.getMonthOfYear());
    }finally{__CLR4_4_1124s124slc8azwi5.R.flushNeeded();}}

    /**
     * Test constructor (Object=null, Chronology=null)
     */
    public void testConstructor_nullObject_nullChronology() throws Throwable {__CLR4_4_1124s124slc8azwi5.R.globalSliceStart(getClass().getName(),49572);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14dtve01290();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1124s124slc8azwi5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1124s124slc8azwi5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Constructors.testConstructor_nullObject_nullChronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),49572,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14dtve01290() throws Throwable{try{__CLR4_4_1124s124slc8azwi5.R.inc(49572);
        __CLR4_4_1124s124slc8azwi5.R.inc(49573);YearMonth test = new YearMonth((Object) null, null);
        __CLR4_4_1124s124slc8azwi5.R.inc(49574);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1124s124slc8azwi5.R.inc(49575);assertEquals(1970, test.getYear());
        __CLR4_4_1124s124slc8azwi5.R.inc(49576);assertEquals(6, test.getMonthOfYear());
    }finally{__CLR4_4_1124s124slc8azwi5.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Test constructor (int, int)
     */
    public void testConstructor_int_int() throws Throwable {__CLR4_4_1124s124slc8azwi5.R.globalSliceStart(getClass().getName(),49577);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1b5ioxb1295();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1124s124slc8azwi5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1124s124slc8azwi5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Constructors.testConstructor_int_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),49577,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1b5ioxb1295() throws Throwable{try{__CLR4_4_1124s124slc8azwi5.R.inc(49577);
        __CLR4_4_1124s124slc8azwi5.R.inc(49578);YearMonth test = new YearMonth(1970, 6);
        __CLR4_4_1124s124slc8azwi5.R.inc(49579);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1124s124slc8azwi5.R.inc(49580);assertEquals(1970, test.getYear());
        __CLR4_4_1124s124slc8azwi5.R.inc(49581);assertEquals(6, test.getMonthOfYear());
        __CLR4_4_1124s124slc8azwi5.R.inc(49582);try {
            __CLR4_4_1124s124slc8azwi5.R.inc(49583);new YearMonth(Integer.MIN_VALUE, 6);
            __CLR4_4_1124s124slc8azwi5.R.inc(49584);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_1124s124slc8azwi5.R.inc(49585);try {
            __CLR4_4_1124s124slc8azwi5.R.inc(49586);new YearMonth(Integer.MAX_VALUE, 6);
            __CLR4_4_1124s124slc8azwi5.R.inc(49587);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_1124s124slc8azwi5.R.inc(49588);try {
            __CLR4_4_1124s124slc8azwi5.R.inc(49589);new YearMonth(1970, 0);
            __CLR4_4_1124s124slc8azwi5.R.inc(49590);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_1124s124slc8azwi5.R.inc(49591);try {
            __CLR4_4_1124s124slc8azwi5.R.inc(49592);new YearMonth(1970, 13);
            __CLR4_4_1124s124slc8azwi5.R.inc(49593);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1124s124slc8azwi5.R.flushNeeded();}}

    /**
     * Test constructor (int, int, Chronology)
     */
    public void testConstructor_int_int_Chronology() throws Throwable {__CLR4_4_1124s124slc8azwi5.R.globalSliceStart(getClass().getName(),49594);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bb8f3e129m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1124s124slc8azwi5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1124s124slc8azwi5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Constructors.testConstructor_int_int_Chronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),49594,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bb8f3e129m() throws Throwable{try{__CLR4_4_1124s124slc8azwi5.R.inc(49594);
        __CLR4_4_1124s124slc8azwi5.R.inc(49595);YearMonth test = new YearMonth(1970, 6, GREGORIAN_PARIS);
        __CLR4_4_1124s124slc8azwi5.R.inc(49596);assertEquals(GREGORIAN_UTC, test.getChronology());
        __CLR4_4_1124s124slc8azwi5.R.inc(49597);assertEquals(1970, test.getYear());
        __CLR4_4_1124s124slc8azwi5.R.inc(49598);assertEquals(6, test.getMonthOfYear());
        __CLR4_4_1124s124slc8azwi5.R.inc(49599);try {
            __CLR4_4_1124s124slc8azwi5.R.inc(49600);new YearMonth(Integer.MIN_VALUE, 6, GREGORIAN_PARIS);
            __CLR4_4_1124s124slc8azwi5.R.inc(49601);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_1124s124slc8azwi5.R.inc(49602);try {
            __CLR4_4_1124s124slc8azwi5.R.inc(49603);new YearMonth(Integer.MAX_VALUE, 6, GREGORIAN_PARIS);
            __CLR4_4_1124s124slc8azwi5.R.inc(49604);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_1124s124slc8azwi5.R.inc(49605);try {
            __CLR4_4_1124s124slc8azwi5.R.inc(49606);new YearMonth(1970, 0, GREGORIAN_PARIS);
            __CLR4_4_1124s124slc8azwi5.R.inc(49607);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_1124s124slc8azwi5.R.inc(49608);try {
            __CLR4_4_1124s124slc8azwi5.R.inc(49609);new YearMonth(1970, 13, GREGORIAN_PARIS);
            __CLR4_4_1124s124slc8azwi5.R.inc(49610);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1124s124slc8azwi5.R.flushNeeded();}}

    /**
     * Test constructor (int, int, Chronology=null)
     */
    public void testConstructor_int_int_nullChronology() throws Throwable {__CLR4_4_1124s124slc8azwi5.R.globalSliceStart(getClass().getName(),49611);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1b34hdv12a3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1124s124slc8azwi5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1124s124slc8azwi5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Constructors.testConstructor_int_int_nullChronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),49611,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1b34hdv12a3() throws Throwable{try{__CLR4_4_1124s124slc8azwi5.R.inc(49611);
        __CLR4_4_1124s124slc8azwi5.R.inc(49612);YearMonth test = new YearMonth(1970, 6, null);
        __CLR4_4_1124s124slc8azwi5.R.inc(49613);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1124s124slc8azwi5.R.inc(49614);assertEquals(1970, test.getYear());
        __CLR4_4_1124s124slc8azwi5.R.inc(49615);assertEquals(6, test.getMonthOfYear());
    }finally{__CLR4_4_1124s124slc8azwi5.R.flushNeeded();}}

}
