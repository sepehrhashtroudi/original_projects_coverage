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

import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.ISOChronology;

/**
 * This class is a Junit unit test for YearMonthDay.
 *
 * @author Stephen Colebourne
 */
@SuppressWarnings("deprecation")
public class TestYearMonthDay_Constructors extends TestCase {static class __CLR4_4_111cj11cjlc8azwen{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672271031490L,8589935092L,48649,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

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

    public static void main(String[] args) {try{__CLR4_4_111cj11cjlc8azwen.R.inc(48403);
        __CLR4_4_111cj11cjlc8azwen.R.inc(48404);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_111cj11cjlc8azwen.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_111cj11cjlc8azwen.R.inc(48405);
        __CLR4_4_111cj11cjlc8azwen.R.inc(48406);return new TestSuite(TestYearMonthDay_Constructors.class);
    }finally{__CLR4_4_111cj11cjlc8azwen.R.flushNeeded();}}

    public TestYearMonthDay_Constructors(String name) {
        super(name);__CLR4_4_111cj11cjlc8azwen.R.inc(48408);try{__CLR4_4_111cj11cjlc8azwen.R.inc(48407);
    }finally{__CLR4_4_111cj11cjlc8azwen.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_111cj11cjlc8azwen.R.inc(48409);
        __CLR4_4_111cj11cjlc8azwen.R.inc(48410);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_111cj11cjlc8azwen.R.inc(48411);zone = DateTimeZone.getDefault();
        __CLR4_4_111cj11cjlc8azwen.R.inc(48412);DateTimeZone.setDefault(LONDON);
    }finally{__CLR4_4_111cj11cjlc8azwen.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_111cj11cjlc8azwen.R.inc(48413);
        __CLR4_4_111cj11cjlc8azwen.R.inc(48414);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_111cj11cjlc8azwen.R.inc(48415);DateTimeZone.setDefault(zone);
        __CLR4_4_111cj11cjlc8azwen.R.inc(48416);zone = null;
    }finally{__CLR4_4_111cj11cjlc8azwen.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testFactory_FromCalendarFields() throws Exception {__CLR4_4_111cj11cjlc8azwen.R.globalSliceStart(getClass().getName(),48417);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wxckb311cx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_111cj11cjlc8azwen.R.rethrow($CLV_t2$);}finally{__CLR4_4_111cj11cjlc8azwen.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Constructors.testFactory_FromCalendarFields",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),48417,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wxckb311cx() throws Exception{try{__CLR4_4_111cj11cjlc8azwen.R.inc(48417);
        __CLR4_4_111cj11cjlc8azwen.R.inc(48418);GregorianCalendar cal = new GregorianCalendar(1970, 1, 3, 4, 5, 6);
        __CLR4_4_111cj11cjlc8azwen.R.inc(48419);cal.set(Calendar.MILLISECOND, 7);
        __CLR4_4_111cj11cjlc8azwen.R.inc(48420);YearMonthDay expected = new YearMonthDay(1970, 2, 3);
        __CLR4_4_111cj11cjlc8azwen.R.inc(48421);assertEquals(expected, YearMonthDay.fromCalendarFields(cal));
        __CLR4_4_111cj11cjlc8azwen.R.inc(48422);try {
            __CLR4_4_111cj11cjlc8azwen.R.inc(48423);YearMonthDay.fromCalendarFields(null);
            __CLR4_4_111cj11cjlc8azwen.R.inc(48424);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_111cj11cjlc8azwen.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testFactory_FromDateFields() throws Exception {__CLR4_4_111cj11cjlc8azwen.R.globalSliceStart(getClass().getName(),48425);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16u5j2711d5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_111cj11cjlc8azwen.R.rethrow($CLV_t2$);}finally{__CLR4_4_111cj11cjlc8azwen.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Constructors.testFactory_FromDateFields",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),48425,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16u5j2711d5() throws Exception{try{__CLR4_4_111cj11cjlc8azwen.R.inc(48425);
        __CLR4_4_111cj11cjlc8azwen.R.inc(48426);GregorianCalendar cal = new GregorianCalendar(1970, 1, 3, 4, 5, 6);
        __CLR4_4_111cj11cjlc8azwen.R.inc(48427);cal.set(Calendar.MILLISECOND, 7);
        __CLR4_4_111cj11cjlc8azwen.R.inc(48428);YearMonthDay expected = new YearMonthDay(1970, 2, 3);
        __CLR4_4_111cj11cjlc8azwen.R.inc(48429);assertEquals(expected, YearMonthDay.fromDateFields(cal.getTime()));
        __CLR4_4_111cj11cjlc8azwen.R.inc(48430);try {
            __CLR4_4_111cj11cjlc8azwen.R.inc(48431);YearMonthDay.fromDateFields(null);
            __CLR4_4_111cj11cjlc8azwen.R.inc(48432);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_111cj11cjlc8azwen.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Test constructor ()
     */
    public void testConstructor() throws Throwable {__CLR4_4_111cj11cjlc8azwen.R.globalSliceStart(getClass().getName(),48433);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uefs8h11dd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_111cj11cjlc8azwen.R.rethrow($CLV_t2$);}finally{__CLR4_4_111cj11cjlc8azwen.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Constructors.testConstructor",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),48433,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uefs8h11dd() throws Throwable{try{__CLR4_4_111cj11cjlc8azwen.R.inc(48433);
        __CLR4_4_111cj11cjlc8azwen.R.inc(48434);YearMonthDay test = new YearMonthDay();
        __CLR4_4_111cj11cjlc8azwen.R.inc(48435);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_111cj11cjlc8azwen.R.inc(48436);assertEquals(1970, test.getYear());
        __CLR4_4_111cj11cjlc8azwen.R.inc(48437);assertEquals(6, test.getMonthOfYear());
        __CLR4_4_111cj11cjlc8azwen.R.inc(48438);assertEquals(9, test.getDayOfMonth());
    }finally{__CLR4_4_111cj11cjlc8azwen.R.flushNeeded();}}

    /**
     * Test constructor (DateTimeZone)
     */
    public void testConstructor_DateTimeZone() throws Throwable {__CLR4_4_111cj11cjlc8azwen.R.globalSliceStart(getClass().getName(),48439);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1z4m1k511dj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_111cj11cjlc8azwen.R.rethrow($CLV_t2$);}finally{__CLR4_4_111cj11cjlc8azwen.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Constructors.testConstructor_DateTimeZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),48439,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1z4m1k511dj() throws Throwable{try{__CLR4_4_111cj11cjlc8azwen.R.inc(48439);
        __CLR4_4_111cj11cjlc8azwen.R.inc(48440);DateTime dt = new DateTime(2005, 6, 8, 23, 59, 0, 0, LONDON);
        __CLR4_4_111cj11cjlc8azwen.R.inc(48441);DateTimeUtils.setCurrentMillisFixed(dt.getMillis());
        // 23:59 in London is 00:59 the following day in Paris
        
        __CLR4_4_111cj11cjlc8azwen.R.inc(48442);YearMonthDay test = new YearMonthDay(LONDON);
        __CLR4_4_111cj11cjlc8azwen.R.inc(48443);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_111cj11cjlc8azwen.R.inc(48444);assertEquals(2005, test.getYear());
        __CLR4_4_111cj11cjlc8azwen.R.inc(48445);assertEquals(6, test.getMonthOfYear());
        __CLR4_4_111cj11cjlc8azwen.R.inc(48446);assertEquals(8, test.getDayOfMonth());
        
        __CLR4_4_111cj11cjlc8azwen.R.inc(48447);test = new YearMonthDay(PARIS);
        __CLR4_4_111cj11cjlc8azwen.R.inc(48448);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_111cj11cjlc8azwen.R.inc(48449);assertEquals(2005, test.getYear());
        __CLR4_4_111cj11cjlc8azwen.R.inc(48450);assertEquals(6, test.getMonthOfYear());
        __CLR4_4_111cj11cjlc8azwen.R.inc(48451);assertEquals(9, test.getDayOfMonth());
    }finally{__CLR4_4_111cj11cjlc8azwen.R.flushNeeded();}}

    /**
     * Test constructor (DateTimeZone=null)
     */
    public void testConstructor_nullDateTimeZone() throws Throwable {__CLR4_4_111cj11cjlc8azwen.R.globalSliceStart(getClass().getName(),48452);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17zs1ro11dw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_111cj11cjlc8azwen.R.rethrow($CLV_t2$);}finally{__CLR4_4_111cj11cjlc8azwen.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Constructors.testConstructor_nullDateTimeZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),48452,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17zs1ro11dw() throws Throwable{try{__CLR4_4_111cj11cjlc8azwen.R.inc(48452);
        __CLR4_4_111cj11cjlc8azwen.R.inc(48453);DateTime dt = new DateTime(2005, 6, 8, 23, 59, 0, 0, LONDON);
        __CLR4_4_111cj11cjlc8azwen.R.inc(48454);DateTimeUtils.setCurrentMillisFixed(dt.getMillis());
        // 23:59 in London is 00:59 the following day in Paris
        
        __CLR4_4_111cj11cjlc8azwen.R.inc(48455);YearMonthDay test = new YearMonthDay((DateTimeZone) null);
        __CLR4_4_111cj11cjlc8azwen.R.inc(48456);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_111cj11cjlc8azwen.R.inc(48457);assertEquals(2005, test.getYear());
        __CLR4_4_111cj11cjlc8azwen.R.inc(48458);assertEquals(6, test.getMonthOfYear());
        __CLR4_4_111cj11cjlc8azwen.R.inc(48459);assertEquals(8, test.getDayOfMonth());
    }finally{__CLR4_4_111cj11cjlc8azwen.R.flushNeeded();}}

    /**
     * Test constructor (Chronology)
     */
    public void testConstructor_Chronology() throws Throwable {__CLR4_4_111cj11cjlc8azwen.R.globalSliceStart(getClass().getName(),48460);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15931ti11e4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_111cj11cjlc8azwen.R.rethrow($CLV_t2$);}finally{__CLR4_4_111cj11cjlc8azwen.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Constructors.testConstructor_Chronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),48460,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15931ti11e4() throws Throwable{try{__CLR4_4_111cj11cjlc8azwen.R.inc(48460);
        __CLR4_4_111cj11cjlc8azwen.R.inc(48461);YearMonthDay test = new YearMonthDay(GREGORIAN_PARIS);
        __CLR4_4_111cj11cjlc8azwen.R.inc(48462);assertEquals(GREGORIAN_UTC, test.getChronology());
        __CLR4_4_111cj11cjlc8azwen.R.inc(48463);assertEquals(1970, test.getYear());
        __CLR4_4_111cj11cjlc8azwen.R.inc(48464);assertEquals(6, test.getMonthOfYear());
        __CLR4_4_111cj11cjlc8azwen.R.inc(48465);assertEquals(9, test.getDayOfMonth());
    }finally{__CLR4_4_111cj11cjlc8azwen.R.flushNeeded();}}

    /**
     * Test constructor (Chronology=null)
     */
    public void testConstructor_nullChronology() throws Throwable {__CLR4_4_111cj11cjlc8azwen.R.globalSliceStart(getClass().getName(),48466);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15qcb6r11ea();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_111cj11cjlc8azwen.R.rethrow($CLV_t2$);}finally{__CLR4_4_111cj11cjlc8azwen.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Constructors.testConstructor_nullChronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),48466,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15qcb6r11ea() throws Throwable{try{__CLR4_4_111cj11cjlc8azwen.R.inc(48466);
        __CLR4_4_111cj11cjlc8azwen.R.inc(48467);YearMonthDay test = new YearMonthDay((Chronology) null);
        __CLR4_4_111cj11cjlc8azwen.R.inc(48468);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_111cj11cjlc8azwen.R.inc(48469);assertEquals(1970, test.getYear());
        __CLR4_4_111cj11cjlc8azwen.R.inc(48470);assertEquals(6, test.getMonthOfYear());
        __CLR4_4_111cj11cjlc8azwen.R.inc(48471);assertEquals(9, test.getDayOfMonth());
    }finally{__CLR4_4_111cj11cjlc8azwen.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Test constructor (long)
     */
    public void testConstructor_long1() throws Throwable {__CLR4_4_111cj11cjlc8azwen.R.globalSliceStart(getClass().getName(),48472);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wi13cr11eg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_111cj11cjlc8azwen.R.rethrow($CLV_t2$);}finally{__CLR4_4_111cj11cjlc8azwen.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Constructors.testConstructor_long1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),48472,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wi13cr11eg() throws Throwable{try{__CLR4_4_111cj11cjlc8azwen.R.inc(48472);
        __CLR4_4_111cj11cjlc8azwen.R.inc(48473);YearMonthDay test = new YearMonthDay(TEST_TIME1);
        __CLR4_4_111cj11cjlc8azwen.R.inc(48474);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_111cj11cjlc8azwen.R.inc(48475);assertEquals(1970, test.getYear());
        __CLR4_4_111cj11cjlc8azwen.R.inc(48476);assertEquals(4, test.getMonthOfYear());
        __CLR4_4_111cj11cjlc8azwen.R.inc(48477);assertEquals(6, test.getDayOfMonth());
    }finally{__CLR4_4_111cj11cjlc8azwen.R.flushNeeded();}}

    /**
     * Test constructor (long)
     */
    public void testConstructor_long2() throws Throwable {__CLR4_4_111cj11cjlc8azwen.R.globalSliceStart(getClass().getName(),48478);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1t914ka11em();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_111cj11cjlc8azwen.R.rethrow($CLV_t2$);}finally{__CLR4_4_111cj11cjlc8azwen.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Constructors.testConstructor_long2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),48478,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1t914ka11em() throws Throwable{try{__CLR4_4_111cj11cjlc8azwen.R.inc(48478);
        __CLR4_4_111cj11cjlc8azwen.R.inc(48479);YearMonthDay test = new YearMonthDay(TEST_TIME2);
        __CLR4_4_111cj11cjlc8azwen.R.inc(48480);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_111cj11cjlc8azwen.R.inc(48481);assertEquals(1971, test.getYear());
        __CLR4_4_111cj11cjlc8azwen.R.inc(48482);assertEquals(5, test.getMonthOfYear());
        __CLR4_4_111cj11cjlc8azwen.R.inc(48483);assertEquals(7, test.getDayOfMonth());
    }finally{__CLR4_4_111cj11cjlc8azwen.R.flushNeeded();}}

    /**
     * Test constructor (long, Chronology)
     */
    public void testConstructor_long1_Chronology() throws Throwable {__CLR4_4_111cj11cjlc8azwen.R.globalSliceStart(getClass().getName(),48484);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_115wn5s11es();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_111cj11cjlc8azwen.R.rethrow($CLV_t2$);}finally{__CLR4_4_111cj11cjlc8azwen.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Constructors.testConstructor_long1_Chronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),48484,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_115wn5s11es() throws Throwable{try{__CLR4_4_111cj11cjlc8azwen.R.inc(48484);
        __CLR4_4_111cj11cjlc8azwen.R.inc(48485);YearMonthDay test = new YearMonthDay(TEST_TIME1, GREGORIAN_PARIS);
        __CLR4_4_111cj11cjlc8azwen.R.inc(48486);assertEquals(GREGORIAN_UTC, test.getChronology());
        __CLR4_4_111cj11cjlc8azwen.R.inc(48487);assertEquals(1970, test.getYear());
        __CLR4_4_111cj11cjlc8azwen.R.inc(48488);assertEquals(4, test.getMonthOfYear());
        __CLR4_4_111cj11cjlc8azwen.R.inc(48489);assertEquals(6, test.getDayOfMonth());
    }finally{__CLR4_4_111cj11cjlc8azwen.R.flushNeeded();}}

    /**
     * Test constructor (long, Chronology)
     */
    public void testConstructor_long2_Chronology() throws Throwable {__CLR4_4_111cj11cjlc8azwen.R.globalSliceStart(getClass().getName(),48490);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14nqmkh11ey();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_111cj11cjlc8azwen.R.rethrow($CLV_t2$);}finally{__CLR4_4_111cj11cjlc8azwen.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Constructors.testConstructor_long2_Chronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),48490,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14nqmkh11ey() throws Throwable{try{__CLR4_4_111cj11cjlc8azwen.R.inc(48490);
        __CLR4_4_111cj11cjlc8azwen.R.inc(48491);YearMonthDay test = new YearMonthDay(TEST_TIME2, GREGORIAN_PARIS);
        __CLR4_4_111cj11cjlc8azwen.R.inc(48492);assertEquals(GREGORIAN_UTC, test.getChronology());
        __CLR4_4_111cj11cjlc8azwen.R.inc(48493);assertEquals(1971, test.getYear());
        __CLR4_4_111cj11cjlc8azwen.R.inc(48494);assertEquals(5, test.getMonthOfYear());
        __CLR4_4_111cj11cjlc8azwen.R.inc(48495);assertEquals(7, test.getDayOfMonth());
    }finally{__CLR4_4_111cj11cjlc8azwen.R.flushNeeded();}}

    /**
     * Test constructor (long, Chronology=null)
     */
    public void testConstructor_long_nullChronology() throws Throwable {__CLR4_4_111cj11cjlc8azwen.R.globalSliceStart(getClass().getName(),48496);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nnhcku11f4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_111cj11cjlc8azwen.R.rethrow($CLV_t2$);}finally{__CLR4_4_111cj11cjlc8azwen.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Constructors.testConstructor_long_nullChronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),48496,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nnhcku11f4() throws Throwable{try{__CLR4_4_111cj11cjlc8azwen.R.inc(48496);
        __CLR4_4_111cj11cjlc8azwen.R.inc(48497);YearMonthDay test = new YearMonthDay(TEST_TIME1, null);
        __CLR4_4_111cj11cjlc8azwen.R.inc(48498);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_111cj11cjlc8azwen.R.inc(48499);assertEquals(1970, test.getYear());
        __CLR4_4_111cj11cjlc8azwen.R.inc(48500);assertEquals(4, test.getMonthOfYear());
        __CLR4_4_111cj11cjlc8azwen.R.inc(48501);assertEquals(6, test.getDayOfMonth());
    }finally{__CLR4_4_111cj11cjlc8azwen.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testConstructor_Object() throws Throwable {__CLR4_4_111cj11cjlc8azwen.R.globalSliceStart(getClass().getName(),48502);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1eplceb11fa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_111cj11cjlc8azwen.R.rethrow($CLV_t2$);}finally{__CLR4_4_111cj11cjlc8azwen.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Constructors.testConstructor_Object",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),48502,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1eplceb11fa() throws Throwable{try{__CLR4_4_111cj11cjlc8azwen.R.inc(48502);
        __CLR4_4_111cj11cjlc8azwen.R.inc(48503);Date date = new Date(TEST_TIME1);
        __CLR4_4_111cj11cjlc8azwen.R.inc(48504);YearMonthDay test = new YearMonthDay(date);
        __CLR4_4_111cj11cjlc8azwen.R.inc(48505);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_111cj11cjlc8azwen.R.inc(48506);assertEquals(1970, test.getYear());
        __CLR4_4_111cj11cjlc8azwen.R.inc(48507);assertEquals(4, test.getMonthOfYear());
        __CLR4_4_111cj11cjlc8azwen.R.inc(48508);assertEquals(6, test.getDayOfMonth());
    }finally{__CLR4_4_111cj11cjlc8azwen.R.flushNeeded();}}

    public void testConstructor_nullObject() throws Throwable {__CLR4_4_111cj11cjlc8azwen.R.globalSliceStart(getClass().getName(),48509);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lt59uk11fh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_111cj11cjlc8azwen.R.rethrow($CLV_t2$);}finally{__CLR4_4_111cj11cjlc8azwen.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Constructors.testConstructor_nullObject",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),48509,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lt59uk11fh() throws Throwable{try{__CLR4_4_111cj11cjlc8azwen.R.inc(48509);
        __CLR4_4_111cj11cjlc8azwen.R.inc(48510);YearMonthDay test = new YearMonthDay((Object) null);
        __CLR4_4_111cj11cjlc8azwen.R.inc(48511);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_111cj11cjlc8azwen.R.inc(48512);assertEquals(1970, test.getYear());
        __CLR4_4_111cj11cjlc8azwen.R.inc(48513);assertEquals(6, test.getMonthOfYear());
        __CLR4_4_111cj11cjlc8azwen.R.inc(48514);assertEquals(9, test.getDayOfMonth());
    }finally{__CLR4_4_111cj11cjlc8azwen.R.flushNeeded();}}

    public void testConstructor_ObjectString1() throws Throwable {__CLR4_4_111cj11cjlc8azwen.R.globalSliceStart(getClass().getName(),48515);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11c2b5d11fn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_111cj11cjlc8azwen.R.rethrow($CLV_t2$);}finally{__CLR4_4_111cj11cjlc8azwen.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Constructors.testConstructor_ObjectString1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),48515,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11c2b5d11fn() throws Throwable{try{__CLR4_4_111cj11cjlc8azwen.R.inc(48515);
        __CLR4_4_111cj11cjlc8azwen.R.inc(48516);YearMonthDay test = new YearMonthDay("1972-12-03");
        __CLR4_4_111cj11cjlc8azwen.R.inc(48517);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_111cj11cjlc8azwen.R.inc(48518);assertEquals(1972, test.getYear());
        __CLR4_4_111cj11cjlc8azwen.R.inc(48519);assertEquals(12, test.getMonthOfYear());
        __CLR4_4_111cj11cjlc8azwen.R.inc(48520);assertEquals(3, test.getDayOfMonth());
    }finally{__CLR4_4_111cj11cjlc8azwen.R.flushNeeded();}}

    public void testConstructor_ObjectString2() throws Throwable {__CLR4_4_111cj11cjlc8azwen.R.globalSliceStart(getClass().getName(),48521);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14l29xu11ft();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_111cj11cjlc8azwen.R.rethrow($CLV_t2$);}finally{__CLR4_4_111cj11cjlc8azwen.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Constructors.testConstructor_ObjectString2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),48521,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14l29xu11ft() throws Throwable{try{__CLR4_4_111cj11cjlc8azwen.R.inc(48521);
        __CLR4_4_111cj11cjlc8azwen.R.inc(48522);YearMonthDay test = new YearMonthDay("1972-12-03T+14:00");
        __CLR4_4_111cj11cjlc8azwen.R.inc(48523);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_111cj11cjlc8azwen.R.inc(48524);assertEquals(1972, test.getYear());
        __CLR4_4_111cj11cjlc8azwen.R.inc(48525);assertEquals(12, test.getMonthOfYear());
        __CLR4_4_111cj11cjlc8azwen.R.inc(48526);assertEquals(2, test.getDayOfMonth());  // timezone
    }finally{__CLR4_4_111cj11cjlc8azwen.R.flushNeeded();}}

    public void testConstructor_ObjectString3() throws Throwable {__CLR4_4_111cj11cjlc8azwen.R.globalSliceStart(getClass().getName(),48527);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17u28qb11fz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_111cj11cjlc8azwen.R.rethrow($CLV_t2$);}finally{__CLR4_4_111cj11cjlc8azwen.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Constructors.testConstructor_ObjectString3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),48527,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17u28qb11fz() throws Throwable{try{__CLR4_4_111cj11cjlc8azwen.R.inc(48527);
        __CLR4_4_111cj11cjlc8azwen.R.inc(48528);YearMonthDay test = new YearMonthDay("1972-12-03T10:20:30.040");
        __CLR4_4_111cj11cjlc8azwen.R.inc(48529);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_111cj11cjlc8azwen.R.inc(48530);assertEquals(1972, test.getYear());
        __CLR4_4_111cj11cjlc8azwen.R.inc(48531);assertEquals(12, test.getMonthOfYear());
        __CLR4_4_111cj11cjlc8azwen.R.inc(48532);assertEquals(3, test.getDayOfMonth());
    }finally{__CLR4_4_111cj11cjlc8azwen.R.flushNeeded();}}

    public void testConstructor_ObjectString4() throws Throwable {__CLR4_4_111cj11cjlc8azwen.R.globalSliceStart(getClass().getName(),48533);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1b327is11g5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_111cj11cjlc8azwen.R.rethrow($CLV_t2$);}finally{__CLR4_4_111cj11cjlc8azwen.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Constructors.testConstructor_ObjectString4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),48533,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1b327is11g5() throws Throwable{try{__CLR4_4_111cj11cjlc8azwen.R.inc(48533);
        __CLR4_4_111cj11cjlc8azwen.R.inc(48534);YearMonthDay test = new YearMonthDay("1972-12-03T10:20:30.040+14:00");
        __CLR4_4_111cj11cjlc8azwen.R.inc(48535);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_111cj11cjlc8azwen.R.inc(48536);assertEquals(1972, test.getYear());
        __CLR4_4_111cj11cjlc8azwen.R.inc(48537);assertEquals(12, test.getMonthOfYear());
        __CLR4_4_111cj11cjlc8azwen.R.inc(48538);assertEquals(2, test.getDayOfMonth());  // timezone
    }finally{__CLR4_4_111cj11cjlc8azwen.R.flushNeeded();}}

    public void testConstructor_ObjectString5() throws Throwable {__CLR4_4_111cj11cjlc8azwen.R.globalSliceStart(getClass().getName(),48539);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ec26b911gb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_111cj11cjlc8azwen.R.rethrow($CLV_t2$);}finally{__CLR4_4_111cj11cjlc8azwen.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Constructors.testConstructor_ObjectString5",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),48539,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ec26b911gb() throws Throwable{try{__CLR4_4_111cj11cjlc8azwen.R.inc(48539);
        __CLR4_4_111cj11cjlc8azwen.R.inc(48540);YearMonthDay test = new YearMonthDay("10");
        __CLR4_4_111cj11cjlc8azwen.R.inc(48541);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_111cj11cjlc8azwen.R.inc(48542);assertEquals(10, test.getYear());
        __CLR4_4_111cj11cjlc8azwen.R.inc(48543);assertEquals(1, test.getMonthOfYear());
        __CLR4_4_111cj11cjlc8azwen.R.inc(48544);assertEquals(1, test.getDayOfMonth());
    }finally{__CLR4_4_111cj11cjlc8azwen.R.flushNeeded();}}

    public void testConstructor_ObjectStringEx1() throws Throwable {__CLR4_4_111cj11cjlc8azwen.R.globalSliceStart(getClass().getName(),48545);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11daule11gh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_111cj11cjlc8azwen.R.rethrow($CLV_t2$);}finally{__CLR4_4_111cj11cjlc8azwen.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Constructors.testConstructor_ObjectStringEx1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),48545,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11daule11gh() throws Throwable{try{__CLR4_4_111cj11cjlc8azwen.R.inc(48545);
        __CLR4_4_111cj11cjlc8azwen.R.inc(48546);try {
            __CLR4_4_111cj11cjlc8azwen.R.inc(48547);new YearMonthDay("T10:20:30.040");
            __CLR4_4_111cj11cjlc8azwen.R.inc(48548);fail();
        } catch (IllegalArgumentException ex) {
            // expected
        }
    }finally{__CLR4_4_111cj11cjlc8azwen.R.flushNeeded();}}

    public void testConstructor_ObjectStringEx2() throws Throwable {__CLR4_4_111cj11cjlc8azwen.R.globalSliceStart(getClass().getName(),48549);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11vp47311gl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_111cj11cjlc8azwen.R.rethrow($CLV_t2$);}finally{__CLR4_4_111cj11cjlc8azwen.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Constructors.testConstructor_ObjectStringEx2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),48549,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11vp47311gl() throws Throwable{try{__CLR4_4_111cj11cjlc8azwen.R.inc(48549);
        __CLR4_4_111cj11cjlc8azwen.R.inc(48550);try {
            __CLR4_4_111cj11cjlc8azwen.R.inc(48551);new YearMonthDay("T10:20:30.040+14:00");
            __CLR4_4_111cj11cjlc8azwen.R.inc(48552);fail();
        } catch (IllegalArgumentException ex) {
            // expected
        }
    }finally{__CLR4_4_111cj11cjlc8azwen.R.flushNeeded();}}

    public void testConstructor_ObjectStringEx3() throws Throwable {__CLR4_4_111cj11cjlc8azwen.R.globalSliceStart(getClass().getName(),48553);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_154p2zk11gp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_111cj11cjlc8azwen.R.rethrow($CLV_t2$);}finally{__CLR4_4_111cj11cjlc8azwen.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Constructors.testConstructor_ObjectStringEx3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),48553,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_154p2zk11gp() throws Throwable{try{__CLR4_4_111cj11cjlc8azwen.R.inc(48553);
        __CLR4_4_111cj11cjlc8azwen.R.inc(48554);try {
            __CLR4_4_111cj11cjlc8azwen.R.inc(48555);new YearMonthDay("10:20:30.040");
            __CLR4_4_111cj11cjlc8azwen.R.inc(48556);fail();
        } catch (IllegalArgumentException ex) {
            // expected
        }
    }finally{__CLR4_4_111cj11cjlc8azwen.R.flushNeeded();}}

    public void testConstructor_ObjectStringEx4() throws Throwable {__CLR4_4_111cj11cjlc8azwen.R.globalSliceStart(getClass().getName(),48557);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18dp1s111gt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_111cj11cjlc8azwen.R.rethrow($CLV_t2$);}finally{__CLR4_4_111cj11cjlc8azwen.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Constructors.testConstructor_ObjectStringEx4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),48557,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18dp1s111gt() throws Throwable{try{__CLR4_4_111cj11cjlc8azwen.R.inc(48557);
        __CLR4_4_111cj11cjlc8azwen.R.inc(48558);try {
            __CLR4_4_111cj11cjlc8azwen.R.inc(48559);new YearMonthDay("10:20:30.040+14:00");
            __CLR4_4_111cj11cjlc8azwen.R.inc(48560);fail();
        } catch (IllegalArgumentException ex) {
            // expected
        }
    }finally{__CLR4_4_111cj11cjlc8azwen.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Test constructor (Object, Chronology)
     */
    public void testConstructor_Object_Chronology() throws Throwable {__CLR4_4_111cj11cjlc8azwen.R.globalSliceStart(getClass().getName(),48561);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vmnvd411gx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_111cj11cjlc8azwen.R.rethrow($CLV_t2$);}finally{__CLR4_4_111cj11cjlc8azwen.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Constructors.testConstructor_Object_Chronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),48561,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vmnvd411gx() throws Throwable{try{__CLR4_4_111cj11cjlc8azwen.R.inc(48561);
        __CLR4_4_111cj11cjlc8azwen.R.inc(48562);Date date = new Date(TEST_TIME1);
        __CLR4_4_111cj11cjlc8azwen.R.inc(48563);YearMonthDay test = new YearMonthDay(date, GREGORIAN_PARIS);
        __CLR4_4_111cj11cjlc8azwen.R.inc(48564);assertEquals(GREGORIAN_UTC, test.getChronology());
        __CLR4_4_111cj11cjlc8azwen.R.inc(48565);assertEquals(1970, test.getYear());
        __CLR4_4_111cj11cjlc8azwen.R.inc(48566);assertEquals(4, test.getMonthOfYear());
        __CLR4_4_111cj11cjlc8azwen.R.inc(48567);assertEquals(6, test.getDayOfMonth());
    }finally{__CLR4_4_111cj11cjlc8azwen.R.flushNeeded();}}

    /**
     * Test constructor (Object=null, Chronology)
     */
    public void testConstructor_nullObject_Chronology() throws Throwable {__CLR4_4_111cj11cjlc8azwen.R.globalSliceStart(getClass().getName(),48568);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14q0uyn11h4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_111cj11cjlc8azwen.R.rethrow($CLV_t2$);}finally{__CLR4_4_111cj11cjlc8azwen.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Constructors.testConstructor_nullObject_Chronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),48568,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14q0uyn11h4() throws Throwable{try{__CLR4_4_111cj11cjlc8azwen.R.inc(48568);
        __CLR4_4_111cj11cjlc8azwen.R.inc(48569);YearMonthDay test = new YearMonthDay((Object) null, GREGORIAN_PARIS);
        __CLR4_4_111cj11cjlc8azwen.R.inc(48570);assertEquals(GREGORIAN_UTC, test.getChronology());
        __CLR4_4_111cj11cjlc8azwen.R.inc(48571);assertEquals(1970, test.getYear());
        __CLR4_4_111cj11cjlc8azwen.R.inc(48572);assertEquals(6, test.getMonthOfYear());
        __CLR4_4_111cj11cjlc8azwen.R.inc(48573);assertEquals(9, test.getDayOfMonth());
    }finally{__CLR4_4_111cj11cjlc8azwen.R.flushNeeded();}}

    /**
     * Test constructor (Object, Chronology=null)
     */
    public void testConstructor_Object_nullChronology() throws Throwable {__CLR4_4_111cj11cjlc8azwen.R.globalSliceStart(getClass().getName(),48574);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yccijz11ha();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_111cj11cjlc8azwen.R.rethrow($CLV_t2$);}finally{__CLR4_4_111cj11cjlc8azwen.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Constructors.testConstructor_Object_nullChronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),48574,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yccijz11ha() throws Throwable{try{__CLR4_4_111cj11cjlc8azwen.R.inc(48574);
        __CLR4_4_111cj11cjlc8azwen.R.inc(48575);Date date = new Date(TEST_TIME1);
        __CLR4_4_111cj11cjlc8azwen.R.inc(48576);YearMonthDay test = new YearMonthDay(date, null);
        __CLR4_4_111cj11cjlc8azwen.R.inc(48577);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_111cj11cjlc8azwen.R.inc(48578);assertEquals(1970, test.getYear());
        __CLR4_4_111cj11cjlc8azwen.R.inc(48579);assertEquals(4, test.getMonthOfYear());
        __CLR4_4_111cj11cjlc8azwen.R.inc(48580);assertEquals(6, test.getDayOfMonth());
    }finally{__CLR4_4_111cj11cjlc8azwen.R.flushNeeded();}}

    /**
     * Test constructor (Object=null, Chronology=null)
     */
    public void testConstructor_nullObject_nullChronology() throws Throwable {__CLR4_4_111cj11cjlc8azwen.R.globalSliceStart(getClass().getName(),48581);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14dtve011hh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_111cj11cjlc8azwen.R.rethrow($CLV_t2$);}finally{__CLR4_4_111cj11cjlc8azwen.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Constructors.testConstructor_nullObject_nullChronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),48581,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14dtve011hh() throws Throwable{try{__CLR4_4_111cj11cjlc8azwen.R.inc(48581);
        __CLR4_4_111cj11cjlc8azwen.R.inc(48582);YearMonthDay test = new YearMonthDay((Object) null, null);
        __CLR4_4_111cj11cjlc8azwen.R.inc(48583);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_111cj11cjlc8azwen.R.inc(48584);assertEquals(1970, test.getYear());
        __CLR4_4_111cj11cjlc8azwen.R.inc(48585);assertEquals(6, test.getMonthOfYear());
        __CLR4_4_111cj11cjlc8azwen.R.inc(48586);assertEquals(9, test.getDayOfMonth());
    }finally{__CLR4_4_111cj11cjlc8azwen.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Test constructor (int, int, int)
     */
    public void testConstructor_int_int_int() throws Throwable {__CLR4_4_111cj11cjlc8azwen.R.globalSliceStart(getClass().getName(),48587);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bd9uqn11hn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_111cj11cjlc8azwen.R.rethrow($CLV_t2$);}finally{__CLR4_4_111cj11cjlc8azwen.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Constructors.testConstructor_int_int_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),48587,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bd9uqn11hn() throws Throwable{try{__CLR4_4_111cj11cjlc8azwen.R.inc(48587);
        __CLR4_4_111cj11cjlc8azwen.R.inc(48588);YearMonthDay test = new YearMonthDay(1970, 6, 9);
        __CLR4_4_111cj11cjlc8azwen.R.inc(48589);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_111cj11cjlc8azwen.R.inc(48590);assertEquals(1970, test.getYear());
        __CLR4_4_111cj11cjlc8azwen.R.inc(48591);assertEquals(6, test.getMonthOfYear());
        __CLR4_4_111cj11cjlc8azwen.R.inc(48592);assertEquals(9, test.getDayOfMonth());
        __CLR4_4_111cj11cjlc8azwen.R.inc(48593);try {
            __CLR4_4_111cj11cjlc8azwen.R.inc(48594);new YearMonthDay(Integer.MIN_VALUE, 6, 9);
            __CLR4_4_111cj11cjlc8azwen.R.inc(48595);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_111cj11cjlc8azwen.R.inc(48596);try {
            __CLR4_4_111cj11cjlc8azwen.R.inc(48597);new YearMonthDay(Integer.MAX_VALUE, 6, 9);
            __CLR4_4_111cj11cjlc8azwen.R.inc(48598);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_111cj11cjlc8azwen.R.inc(48599);try {
            __CLR4_4_111cj11cjlc8azwen.R.inc(48600);new YearMonthDay(1970, 0, 9);
            __CLR4_4_111cj11cjlc8azwen.R.inc(48601);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_111cj11cjlc8azwen.R.inc(48602);try {
            __CLR4_4_111cj11cjlc8azwen.R.inc(48603);new YearMonthDay(1970, 13, 9);
            __CLR4_4_111cj11cjlc8azwen.R.inc(48604);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_111cj11cjlc8azwen.R.inc(48605);try {
            __CLR4_4_111cj11cjlc8azwen.R.inc(48606);new YearMonthDay(1970, 6, 0);
            __CLR4_4_111cj11cjlc8azwen.R.inc(48607);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_111cj11cjlc8azwen.R.inc(48608);try {
            __CLR4_4_111cj11cjlc8azwen.R.inc(48609);new YearMonthDay(1970, 6, 31);
            __CLR4_4_111cj11cjlc8azwen.R.inc(48610);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_111cj11cjlc8azwen.R.inc(48611);new YearMonthDay(1970, 7, 31);
        __CLR4_4_111cj11cjlc8azwen.R.inc(48612);try {
            __CLR4_4_111cj11cjlc8azwen.R.inc(48613);new YearMonthDay(1970, 7, 32);
            __CLR4_4_111cj11cjlc8azwen.R.inc(48614);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_111cj11cjlc8azwen.R.flushNeeded();}}

    /**
     * Test constructor (int, int, int, Chronology)
     */
    public void testConstructor_int_int_int_Chronology() throws Throwable {__CLR4_4_111cj11cjlc8azwen.R.globalSliceStart(getClass().getName(),48615);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1o62uzq11if();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_111cj11cjlc8azwen.R.rethrow($CLV_t2$);}finally{__CLR4_4_111cj11cjlc8azwen.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Constructors.testConstructor_int_int_int_Chronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),48615,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1o62uzq11if() throws Throwable{try{__CLR4_4_111cj11cjlc8azwen.R.inc(48615);
        __CLR4_4_111cj11cjlc8azwen.R.inc(48616);YearMonthDay test = new YearMonthDay(1970, 6, 9, GREGORIAN_PARIS);
        __CLR4_4_111cj11cjlc8azwen.R.inc(48617);assertEquals(GREGORIAN_UTC, test.getChronology());
        __CLR4_4_111cj11cjlc8azwen.R.inc(48618);assertEquals(1970, test.getYear());
        __CLR4_4_111cj11cjlc8azwen.R.inc(48619);assertEquals(6, test.getMonthOfYear());
        __CLR4_4_111cj11cjlc8azwen.R.inc(48620);assertEquals(9, test.getDayOfMonth());
        __CLR4_4_111cj11cjlc8azwen.R.inc(48621);try {
            __CLR4_4_111cj11cjlc8azwen.R.inc(48622);new YearMonthDay(Integer.MIN_VALUE, 6, 9, GREGORIAN_PARIS);
            __CLR4_4_111cj11cjlc8azwen.R.inc(48623);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_111cj11cjlc8azwen.R.inc(48624);try {
            __CLR4_4_111cj11cjlc8azwen.R.inc(48625);new YearMonthDay(Integer.MAX_VALUE, 6, 9, GREGORIAN_PARIS);
            __CLR4_4_111cj11cjlc8azwen.R.inc(48626);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_111cj11cjlc8azwen.R.inc(48627);try {
            __CLR4_4_111cj11cjlc8azwen.R.inc(48628);new YearMonthDay(1970, 0, 9, GREGORIAN_PARIS);
            __CLR4_4_111cj11cjlc8azwen.R.inc(48629);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_111cj11cjlc8azwen.R.inc(48630);try {
            __CLR4_4_111cj11cjlc8azwen.R.inc(48631);new YearMonthDay(1970, 13, 9, GREGORIAN_PARIS);
            __CLR4_4_111cj11cjlc8azwen.R.inc(48632);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_111cj11cjlc8azwen.R.inc(48633);try {
            __CLR4_4_111cj11cjlc8azwen.R.inc(48634);new YearMonthDay(1970, 6, 0, GREGORIAN_PARIS);
            __CLR4_4_111cj11cjlc8azwen.R.inc(48635);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_111cj11cjlc8azwen.R.inc(48636);try {
            __CLR4_4_111cj11cjlc8azwen.R.inc(48637);new YearMonthDay(1970, 6, 31, GREGORIAN_PARIS);
            __CLR4_4_111cj11cjlc8azwen.R.inc(48638);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_111cj11cjlc8azwen.R.inc(48639);new YearMonthDay(1970, 7, 31, GREGORIAN_PARIS);
        __CLR4_4_111cj11cjlc8azwen.R.inc(48640);try {
            __CLR4_4_111cj11cjlc8azwen.R.inc(48641);new YearMonthDay(1970, 7, 32, GREGORIAN_PARIS);
            __CLR4_4_111cj11cjlc8azwen.R.inc(48642);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_111cj11cjlc8azwen.R.flushNeeded();}}

    /**
     * Test constructor (int, int, int, Chronology=null)
     */
    public void testConstructor_int_int_int_nullChronology() throws Throwable {__CLR4_4_111cj11cjlc8azwen.R.globalSliceStart(getClass().getName(),48643);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uph3gt11j7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_111cj11cjlc8azwen.R.rethrow($CLV_t2$);}finally{__CLR4_4_111cj11cjlc8azwen.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Constructors.testConstructor_int_int_int_nullChronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),48643,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uph3gt11j7() throws Throwable{try{__CLR4_4_111cj11cjlc8azwen.R.inc(48643);
        __CLR4_4_111cj11cjlc8azwen.R.inc(48644);YearMonthDay test = new YearMonthDay(1970, 6, 9, null);
        __CLR4_4_111cj11cjlc8azwen.R.inc(48645);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_111cj11cjlc8azwen.R.inc(48646);assertEquals(1970, test.getYear());
        __CLR4_4_111cj11cjlc8azwen.R.inc(48647);assertEquals(6, test.getMonthOfYear());
        __CLR4_4_111cj11cjlc8azwen.R.inc(48648);assertEquals(9, test.getDayOfMonth());
    }finally{__CLR4_4_111cj11cjlc8azwen.R.flushNeeded();}}

}
