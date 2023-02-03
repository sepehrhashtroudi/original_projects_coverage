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

import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.chrono.JulianChronology;

/**
 * This class is a Junit unit test for TimeOfDay.
 *
 * @author Stephen Colebourne
 */
@SuppressWarnings("deprecation")
public class TestTimeOfDay_Constructors extends TestCase {static class __CLR4_4_110201020lc8azw9j{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672271031490L,8589935092L,47174,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final ISOChronology ISO_UTC = ISOChronology.getInstanceUTC();
    private static final int OFFSET = 1;
    
    private long TEST_TIME_NOW =
            10L * DateTimeConstants.MILLIS_PER_HOUR
            + 20L * DateTimeConstants.MILLIS_PER_MINUTE
            + 30L * DateTimeConstants.MILLIS_PER_SECOND
            + 40L;
            
    private long TEST_TIME1 =
        1L * DateTimeConstants.MILLIS_PER_HOUR
        + 2L * DateTimeConstants.MILLIS_PER_MINUTE
        + 3L * DateTimeConstants.MILLIS_PER_SECOND
        + 4L;
        
    private long TEST_TIME2 =
        1L * DateTimeConstants.MILLIS_PER_DAY
        + 5L * DateTimeConstants.MILLIS_PER_HOUR
        + 6L * DateTimeConstants.MILLIS_PER_MINUTE
        + 7L * DateTimeConstants.MILLIS_PER_SECOND
        + 8L;
        
    private DateTimeZone zone = null;

    public static void main(String[] args) {try{__CLR4_4_110201020lc8azw9j.R.inc(46728);
        __CLR4_4_110201020lc8azw9j.R.inc(46729);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_110201020lc8azw9j.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_110201020lc8azw9j.R.inc(46730);
        __CLR4_4_110201020lc8azw9j.R.inc(46731);return new TestSuite(TestTimeOfDay_Constructors.class);
    }finally{__CLR4_4_110201020lc8azw9j.R.flushNeeded();}}

    public TestTimeOfDay_Constructors(String name) {
        super(name);__CLR4_4_110201020lc8azw9j.R.inc(46733);try{__CLR4_4_110201020lc8azw9j.R.inc(46732);
    }finally{__CLR4_4_110201020lc8azw9j.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_110201020lc8azw9j.R.inc(46734);
        __CLR4_4_110201020lc8azw9j.R.inc(46735);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_110201020lc8azw9j.R.inc(46736);zone = DateTimeZone.getDefault();
        __CLR4_4_110201020lc8azw9j.R.inc(46737);DateTimeZone.setDefault(LONDON);
        __CLR4_4_110201020lc8azw9j.R.inc(46738);java.util.TimeZone.setDefault(LONDON.toTimeZone());
    }finally{__CLR4_4_110201020lc8azw9j.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_110201020lc8azw9j.R.inc(46739);
        __CLR4_4_110201020lc8azw9j.R.inc(46740);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_110201020lc8azw9j.R.inc(46741);DateTimeZone.setDefault(zone);
        __CLR4_4_110201020lc8azw9j.R.inc(46742);java.util.TimeZone.setDefault(zone.toTimeZone());
        __CLR4_4_110201020lc8azw9j.R.inc(46743);zone = null;
    }finally{__CLR4_4_110201020lc8azw9j.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Test constructor ()
     */
    public void testConstantMidnight() throws Throwable {__CLR4_4_110201020lc8azw9j.R.globalSliceStart(getClass().getName(),46744);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1i1ix4j102g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_110201020lc8azw9j.R.rethrow($CLV_t2$);}finally{__CLR4_4_110201020lc8azw9j.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Constructors.testConstantMidnight",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),46744,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1i1ix4j102g() throws Throwable{try{__CLR4_4_110201020lc8azw9j.R.inc(46744);
        __CLR4_4_110201020lc8azw9j.R.inc(46745);TimeOfDay test = TimeOfDay.MIDNIGHT;
        __CLR4_4_110201020lc8azw9j.R.inc(46746);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_110201020lc8azw9j.R.inc(46747);assertEquals(0, test.getHourOfDay());
        __CLR4_4_110201020lc8azw9j.R.inc(46748);assertEquals(0, test.getMinuteOfHour());
        __CLR4_4_110201020lc8azw9j.R.inc(46749);assertEquals(0, test.getSecondOfMinute());
        __CLR4_4_110201020lc8azw9j.R.inc(46750);assertEquals(0, test.getMillisOfSecond());
    }finally{__CLR4_4_110201020lc8azw9j.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testFactory_FromCalendarFields() throws Exception {__CLR4_4_110201020lc8azw9j.R.globalSliceStart(getClass().getName(),46751);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wxckb3102n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_110201020lc8azw9j.R.rethrow($CLV_t2$);}finally{__CLR4_4_110201020lc8azw9j.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Constructors.testFactory_FromCalendarFields",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),46751,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wxckb3102n() throws Exception{try{__CLR4_4_110201020lc8azw9j.R.inc(46751);
        __CLR4_4_110201020lc8azw9j.R.inc(46752);GregorianCalendar cal = new GregorianCalendar(1970, 1, 3, 4, 5, 6);
        __CLR4_4_110201020lc8azw9j.R.inc(46753);cal.set(Calendar.MILLISECOND, 7);
        __CLR4_4_110201020lc8azw9j.R.inc(46754);TimeOfDay expected = new TimeOfDay(4, 5, 6, 7);
        __CLR4_4_110201020lc8azw9j.R.inc(46755);assertEquals(expected, TimeOfDay.fromCalendarFields(cal));
        __CLR4_4_110201020lc8azw9j.R.inc(46756);try {
            __CLR4_4_110201020lc8azw9j.R.inc(46757);TimeOfDay.fromCalendarFields(null);
            __CLR4_4_110201020lc8azw9j.R.inc(46758);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_110201020lc8azw9j.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testFactory_FromDateFields_after1970() throws Exception {__CLR4_4_110201020lc8azw9j.R.globalSliceStart(getClass().getName(),46759);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1c9oalf102v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_110201020lc8azw9j.R.rethrow($CLV_t2$);}finally{__CLR4_4_110201020lc8azw9j.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Constructors.testFactory_FromDateFields_after1970",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),46759,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1c9oalf102v() throws Exception{try{__CLR4_4_110201020lc8azw9j.R.inc(46759);
        __CLR4_4_110201020lc8azw9j.R.inc(46760);GregorianCalendar cal = new GregorianCalendar(1970, 1, 3, 4, 5, 6);
        __CLR4_4_110201020lc8azw9j.R.inc(46761);cal.set(Calendar.MILLISECOND, 7);
        __CLR4_4_110201020lc8azw9j.R.inc(46762);TimeOfDay expected = new TimeOfDay(4, 5, 6, 7);
        __CLR4_4_110201020lc8azw9j.R.inc(46763);assertEquals(expected, TimeOfDay.fromDateFields(cal.getTime()));
    }finally{__CLR4_4_110201020lc8azw9j.R.flushNeeded();}}

    public void testFactory_FromDateFields_before1970() throws Exception {__CLR4_4_110201020lc8azw9j.R.globalSliceStart(getClass().getName(),46764);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bn26q61030();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_110201020lc8azw9j.R.rethrow($CLV_t2$);}finally{__CLR4_4_110201020lc8azw9j.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Constructors.testFactory_FromDateFields_before1970",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),46764,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bn26q61030() throws Exception{try{__CLR4_4_110201020lc8azw9j.R.inc(46764);
        __CLR4_4_110201020lc8azw9j.R.inc(46765);GregorianCalendar cal = new GregorianCalendar(1969, 1, 3, 4, 5, 6);
        __CLR4_4_110201020lc8azw9j.R.inc(46766);cal.set(Calendar.MILLISECOND, 7);
        __CLR4_4_110201020lc8azw9j.R.inc(46767);TimeOfDay expected = new TimeOfDay(4, 5, 6, 7);
        __CLR4_4_110201020lc8azw9j.R.inc(46768);assertEquals(expected, TimeOfDay.fromDateFields(cal.getTime()));
    }finally{__CLR4_4_110201020lc8azw9j.R.flushNeeded();}}

    public void testFactory_FromDateFields_null() throws Exception {__CLR4_4_110201020lc8azw9j.R.globalSliceStart(getClass().getName(),46769);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1y25f1x1035();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_110201020lc8azw9j.R.rethrow($CLV_t2$);}finally{__CLR4_4_110201020lc8azw9j.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Constructors.testFactory_FromDateFields_null",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),46769,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1y25f1x1035() throws Exception{try{__CLR4_4_110201020lc8azw9j.R.inc(46769);
        __CLR4_4_110201020lc8azw9j.R.inc(46770);try {
            __CLR4_4_110201020lc8azw9j.R.inc(46771);TimeOfDay.fromDateFields(null);
            __CLR4_4_110201020lc8azw9j.R.inc(46772);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_110201020lc8azw9j.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Test factory (long)
     */
    public void testFactoryMillisOfDay_long1() throws Throwable {__CLR4_4_110201020lc8azw9j.R.globalSliceStart(getClass().getName(),46773);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ddptks1039();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_110201020lc8azw9j.R.rethrow($CLV_t2$);}finally{__CLR4_4_110201020lc8azw9j.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Constructors.testFactoryMillisOfDay_long1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),46773,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ddptks1039() throws Throwable{try{__CLR4_4_110201020lc8azw9j.R.inc(46773);
        __CLR4_4_110201020lc8azw9j.R.inc(46774);TimeOfDay test = TimeOfDay.fromMillisOfDay(TEST_TIME1);
        __CLR4_4_110201020lc8azw9j.R.inc(46775);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_110201020lc8azw9j.R.inc(46776);assertEquals(1, test.getHourOfDay());
        __CLR4_4_110201020lc8azw9j.R.inc(46777);assertEquals(2, test.getMinuteOfHour());
        __CLR4_4_110201020lc8azw9j.R.inc(46778);assertEquals(3, test.getSecondOfMinute());
        __CLR4_4_110201020lc8azw9j.R.inc(46779);assertEquals(4, test.getMillisOfSecond());
    }finally{__CLR4_4_110201020lc8azw9j.R.flushNeeded();}}

    /**
     * Test factory (long, Chronology)
     */
    public void testFactoryMillisOfDay_long1_Chronology() throws Throwable {__CLR4_4_110201020lc8azw9j.R.globalSliceStart(getClass().getName(),46780);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jh1w69103g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_110201020lc8azw9j.R.rethrow($CLV_t2$);}finally{__CLR4_4_110201020lc8azw9j.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Constructors.testFactoryMillisOfDay_long1_Chronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),46780,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jh1w69103g() throws Throwable{try{__CLR4_4_110201020lc8azw9j.R.inc(46780);
        __CLR4_4_110201020lc8azw9j.R.inc(46781);TimeOfDay test = TimeOfDay.fromMillisOfDay(TEST_TIME1, JulianChronology.getInstance());
        __CLR4_4_110201020lc8azw9j.R.inc(46782);assertEquals(JulianChronology.getInstanceUTC(), test.getChronology());
        __CLR4_4_110201020lc8azw9j.R.inc(46783);assertEquals(1, test.getHourOfDay());
        __CLR4_4_110201020lc8azw9j.R.inc(46784);assertEquals(2, test.getMinuteOfHour());
        __CLR4_4_110201020lc8azw9j.R.inc(46785);assertEquals(3, test.getSecondOfMinute());
        __CLR4_4_110201020lc8azw9j.R.inc(46786);assertEquals(4, test.getMillisOfSecond());
    }finally{__CLR4_4_110201020lc8azw9j.R.flushNeeded();}}

    /**
     * Test factory (long, Chronology=null)
     */
    public void testFactoryMillisOfDay_long_nullChronology() throws Throwable {__CLR4_4_110201020lc8azw9j.R.globalSliceStart(getClass().getName(),46787);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nd19g1103n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_110201020lc8azw9j.R.rethrow($CLV_t2$);}finally{__CLR4_4_110201020lc8azw9j.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Constructors.testFactoryMillisOfDay_long_nullChronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),46787,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nd19g1103n() throws Throwable{try{__CLR4_4_110201020lc8azw9j.R.inc(46787);
        __CLR4_4_110201020lc8azw9j.R.inc(46788);TimeOfDay test = TimeOfDay.fromMillisOfDay(TEST_TIME1, null);
        __CLR4_4_110201020lc8azw9j.R.inc(46789);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_110201020lc8azw9j.R.inc(46790);assertEquals(1, test.getHourOfDay());
        __CLR4_4_110201020lc8azw9j.R.inc(46791);assertEquals(2, test.getMinuteOfHour());
        __CLR4_4_110201020lc8azw9j.R.inc(46792);assertEquals(3, test.getSecondOfMinute());
        __CLR4_4_110201020lc8azw9j.R.inc(46793);assertEquals(4, test.getMillisOfSecond());
    }finally{__CLR4_4_110201020lc8azw9j.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Test constructor ()
     */
    public void testConstructor() throws Throwable {__CLR4_4_110201020lc8azw9j.R.globalSliceStart(getClass().getName(),46794);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uefs8h103u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_110201020lc8azw9j.R.rethrow($CLV_t2$);}finally{__CLR4_4_110201020lc8azw9j.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Constructors.testConstructor",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),46794,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uefs8h103u() throws Throwable{try{__CLR4_4_110201020lc8azw9j.R.inc(46794);
        __CLR4_4_110201020lc8azw9j.R.inc(46795);TimeOfDay test = new TimeOfDay();
        __CLR4_4_110201020lc8azw9j.R.inc(46796);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_110201020lc8azw9j.R.inc(46797);assertEquals(10 + OFFSET, test.getHourOfDay());
        __CLR4_4_110201020lc8azw9j.R.inc(46798);assertEquals(20, test.getMinuteOfHour());
        __CLR4_4_110201020lc8azw9j.R.inc(46799);assertEquals(30, test.getSecondOfMinute());
        __CLR4_4_110201020lc8azw9j.R.inc(46800);assertEquals(40, test.getMillisOfSecond());
    }finally{__CLR4_4_110201020lc8azw9j.R.flushNeeded();}}

    /**
     * Test constructor (DateTimeZone)
     */
    public void testConstructor_DateTimeZone() throws Throwable {__CLR4_4_110201020lc8azw9j.R.globalSliceStart(getClass().getName(),46801);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1z4m1k51041();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_110201020lc8azw9j.R.rethrow($CLV_t2$);}finally{__CLR4_4_110201020lc8azw9j.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Constructors.testConstructor_DateTimeZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),46801,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1z4m1k51041() throws Throwable{try{__CLR4_4_110201020lc8azw9j.R.inc(46801);
        __CLR4_4_110201020lc8azw9j.R.inc(46802);DateTime dt = new DateTime(2005, 6, 8, 23, 59, 30, 40, LONDON);
        __CLR4_4_110201020lc8azw9j.R.inc(46803);DateTimeUtils.setCurrentMillisFixed(dt.getMillis());
        // 23:59 in London is 00:59 the following day in Paris
        
        __CLR4_4_110201020lc8azw9j.R.inc(46804);TimeOfDay test = new TimeOfDay(LONDON);
        __CLR4_4_110201020lc8azw9j.R.inc(46805);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_110201020lc8azw9j.R.inc(46806);assertEquals(23, test.getHourOfDay());
        __CLR4_4_110201020lc8azw9j.R.inc(46807);assertEquals(59, test.getMinuteOfHour());
        __CLR4_4_110201020lc8azw9j.R.inc(46808);assertEquals(30, test.getSecondOfMinute());
        __CLR4_4_110201020lc8azw9j.R.inc(46809);assertEquals(40, test.getMillisOfSecond());
        
        __CLR4_4_110201020lc8azw9j.R.inc(46810);test = new TimeOfDay(PARIS);
        __CLR4_4_110201020lc8azw9j.R.inc(46811);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_110201020lc8azw9j.R.inc(46812);assertEquals(0, test.getHourOfDay());
        __CLR4_4_110201020lc8azw9j.R.inc(46813);assertEquals(59, test.getMinuteOfHour());
        __CLR4_4_110201020lc8azw9j.R.inc(46814);assertEquals(30, test.getSecondOfMinute());
        __CLR4_4_110201020lc8azw9j.R.inc(46815);assertEquals(40, test.getMillisOfSecond());
    }finally{__CLR4_4_110201020lc8azw9j.R.flushNeeded();}}

    /**
     * Test constructor (DateTimeZone=null)
     */
    public void testConstructor_nullDateTimeZone() throws Throwable {__CLR4_4_110201020lc8azw9j.R.globalSliceStart(getClass().getName(),46816);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17zs1ro104g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_110201020lc8azw9j.R.rethrow($CLV_t2$);}finally{__CLR4_4_110201020lc8azw9j.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Constructors.testConstructor_nullDateTimeZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),46816,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17zs1ro104g() throws Throwable{try{__CLR4_4_110201020lc8azw9j.R.inc(46816);
        __CLR4_4_110201020lc8azw9j.R.inc(46817);DateTime dt = new DateTime(2005, 6, 8, 23, 59, 30, 40, LONDON);
        __CLR4_4_110201020lc8azw9j.R.inc(46818);DateTimeUtils.setCurrentMillisFixed(dt.getMillis());
        // 23:59 in London is 00:59 the following day in Paris
        
        __CLR4_4_110201020lc8azw9j.R.inc(46819);TimeOfDay test = new TimeOfDay((DateTimeZone) null);
        __CLR4_4_110201020lc8azw9j.R.inc(46820);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_110201020lc8azw9j.R.inc(46821);assertEquals(23, test.getHourOfDay());
        __CLR4_4_110201020lc8azw9j.R.inc(46822);assertEquals(59, test.getMinuteOfHour());
        __CLR4_4_110201020lc8azw9j.R.inc(46823);assertEquals(30, test.getSecondOfMinute());
        __CLR4_4_110201020lc8azw9j.R.inc(46824);assertEquals(40, test.getMillisOfSecond());
    }finally{__CLR4_4_110201020lc8azw9j.R.flushNeeded();}}

    /**
     * Test constructor (Chronology)
     */
    public void testConstructor_Chronology() throws Throwable {__CLR4_4_110201020lc8azw9j.R.globalSliceStart(getClass().getName(),46825);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15931ti104p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_110201020lc8azw9j.R.rethrow($CLV_t2$);}finally{__CLR4_4_110201020lc8azw9j.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Constructors.testConstructor_Chronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),46825,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15931ti104p() throws Throwable{try{__CLR4_4_110201020lc8azw9j.R.inc(46825);
        __CLR4_4_110201020lc8azw9j.R.inc(46826);TimeOfDay test = new TimeOfDay(JulianChronology.getInstance());
        __CLR4_4_110201020lc8azw9j.R.inc(46827);assertEquals(JulianChronology.getInstanceUTC(), test.getChronology());
        __CLR4_4_110201020lc8azw9j.R.inc(46828);assertEquals(10 + OFFSET, test.getHourOfDay());
        __CLR4_4_110201020lc8azw9j.R.inc(46829);assertEquals(20, test.getMinuteOfHour());
        __CLR4_4_110201020lc8azw9j.R.inc(46830);assertEquals(30, test.getSecondOfMinute());
        __CLR4_4_110201020lc8azw9j.R.inc(46831);assertEquals(40, test.getMillisOfSecond());
    }finally{__CLR4_4_110201020lc8azw9j.R.flushNeeded();}}

    /**
     * Test constructor (Chronology=null)
     */
    public void testConstructor_nullChronology() throws Throwable {__CLR4_4_110201020lc8azw9j.R.globalSliceStart(getClass().getName(),46832);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15qcb6r104w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_110201020lc8azw9j.R.rethrow($CLV_t2$);}finally{__CLR4_4_110201020lc8azw9j.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Constructors.testConstructor_nullChronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),46832,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15qcb6r104w() throws Throwable{try{__CLR4_4_110201020lc8azw9j.R.inc(46832);
        __CLR4_4_110201020lc8azw9j.R.inc(46833);TimeOfDay test = new TimeOfDay((Chronology) null);
        __CLR4_4_110201020lc8azw9j.R.inc(46834);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_110201020lc8azw9j.R.inc(46835);assertEquals(10 + OFFSET, test.getHourOfDay());
        __CLR4_4_110201020lc8azw9j.R.inc(46836);assertEquals(20, test.getMinuteOfHour());
        __CLR4_4_110201020lc8azw9j.R.inc(46837);assertEquals(30, test.getSecondOfMinute());
        __CLR4_4_110201020lc8azw9j.R.inc(46838);assertEquals(40, test.getMillisOfSecond());
    }finally{__CLR4_4_110201020lc8azw9j.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Test constructor (long)
     */
    public void testConstructor_long1() throws Throwable {__CLR4_4_110201020lc8azw9j.R.globalSliceStart(getClass().getName(),46839);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wi13cr1053();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_110201020lc8azw9j.R.rethrow($CLV_t2$);}finally{__CLR4_4_110201020lc8azw9j.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Constructors.testConstructor_long1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),46839,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wi13cr1053() throws Throwable{try{__CLR4_4_110201020lc8azw9j.R.inc(46839);
        __CLR4_4_110201020lc8azw9j.R.inc(46840);TimeOfDay test = new TimeOfDay(TEST_TIME1);
        __CLR4_4_110201020lc8azw9j.R.inc(46841);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_110201020lc8azw9j.R.inc(46842);assertEquals(1 + OFFSET, test.getHourOfDay());
        __CLR4_4_110201020lc8azw9j.R.inc(46843);assertEquals(2, test.getMinuteOfHour());
        __CLR4_4_110201020lc8azw9j.R.inc(46844);assertEquals(3, test.getSecondOfMinute());
        __CLR4_4_110201020lc8azw9j.R.inc(46845);assertEquals(4, test.getMillisOfSecond());
    }finally{__CLR4_4_110201020lc8azw9j.R.flushNeeded();}}

    /**
     * Test constructor (long)
     */
    public void testConstructor_long2() throws Throwable {__CLR4_4_110201020lc8azw9j.R.globalSliceStart(getClass().getName(),46846);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1t914ka105a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_110201020lc8azw9j.R.rethrow($CLV_t2$);}finally{__CLR4_4_110201020lc8azw9j.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Constructors.testConstructor_long2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),46846,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1t914ka105a() throws Throwable{try{__CLR4_4_110201020lc8azw9j.R.inc(46846);
        __CLR4_4_110201020lc8azw9j.R.inc(46847);TimeOfDay test = new TimeOfDay(TEST_TIME2);
        __CLR4_4_110201020lc8azw9j.R.inc(46848);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_110201020lc8azw9j.R.inc(46849);assertEquals(5 + OFFSET, test.getHourOfDay());
        __CLR4_4_110201020lc8azw9j.R.inc(46850);assertEquals(6, test.getMinuteOfHour());
        __CLR4_4_110201020lc8azw9j.R.inc(46851);assertEquals(7, test.getSecondOfMinute());
        __CLR4_4_110201020lc8azw9j.R.inc(46852);assertEquals(8, test.getMillisOfSecond());
    }finally{__CLR4_4_110201020lc8azw9j.R.flushNeeded();}}

    /**
     * Test constructor (long, Chronology)
     */
    public void testConstructor_long1_Chronology() throws Throwable {__CLR4_4_110201020lc8azw9j.R.globalSliceStart(getClass().getName(),46853);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_115wn5s105h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_110201020lc8azw9j.R.rethrow($CLV_t2$);}finally{__CLR4_4_110201020lc8azw9j.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Constructors.testConstructor_long1_Chronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),46853,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_115wn5s105h() throws Throwable{try{__CLR4_4_110201020lc8azw9j.R.inc(46853);
        __CLR4_4_110201020lc8azw9j.R.inc(46854);TimeOfDay test = new TimeOfDay(TEST_TIME1, JulianChronology.getInstance());
        __CLR4_4_110201020lc8azw9j.R.inc(46855);assertEquals(JulianChronology.getInstanceUTC(), test.getChronology());
        __CLR4_4_110201020lc8azw9j.R.inc(46856);assertEquals(1 + OFFSET, test.getHourOfDay());
        __CLR4_4_110201020lc8azw9j.R.inc(46857);assertEquals(2, test.getMinuteOfHour());
        __CLR4_4_110201020lc8azw9j.R.inc(46858);assertEquals(3, test.getSecondOfMinute());
        __CLR4_4_110201020lc8azw9j.R.inc(46859);assertEquals(4, test.getMillisOfSecond());
    }finally{__CLR4_4_110201020lc8azw9j.R.flushNeeded();}}

    /**
     * Test constructor (long, Chronology)
     */
    public void testConstructor_long2_Chronology() throws Throwable {__CLR4_4_110201020lc8azw9j.R.globalSliceStart(getClass().getName(),46860);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14nqmkh105o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_110201020lc8azw9j.R.rethrow($CLV_t2$);}finally{__CLR4_4_110201020lc8azw9j.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Constructors.testConstructor_long2_Chronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),46860,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14nqmkh105o() throws Throwable{try{__CLR4_4_110201020lc8azw9j.R.inc(46860);
        __CLR4_4_110201020lc8azw9j.R.inc(46861);TimeOfDay test = new TimeOfDay(TEST_TIME2, JulianChronology.getInstance());
        __CLR4_4_110201020lc8azw9j.R.inc(46862);assertEquals(JulianChronology.getInstanceUTC(), test.getChronology());
        __CLR4_4_110201020lc8azw9j.R.inc(46863);assertEquals(5 + OFFSET, test.getHourOfDay());
        __CLR4_4_110201020lc8azw9j.R.inc(46864);assertEquals(6, test.getMinuteOfHour());
        __CLR4_4_110201020lc8azw9j.R.inc(46865);assertEquals(7, test.getSecondOfMinute());
        __CLR4_4_110201020lc8azw9j.R.inc(46866);assertEquals(8, test.getMillisOfSecond());
    }finally{__CLR4_4_110201020lc8azw9j.R.flushNeeded();}}

    /**
     * Test constructor (long, Chronology=null)
     */
    public void testConstructor_long_nullChronology() throws Throwable {__CLR4_4_110201020lc8azw9j.R.globalSliceStart(getClass().getName(),46867);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nnhcku105v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_110201020lc8azw9j.R.rethrow($CLV_t2$);}finally{__CLR4_4_110201020lc8azw9j.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Constructors.testConstructor_long_nullChronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),46867,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nnhcku105v() throws Throwable{try{__CLR4_4_110201020lc8azw9j.R.inc(46867);
        __CLR4_4_110201020lc8azw9j.R.inc(46868);TimeOfDay test = new TimeOfDay(TEST_TIME1, null);
        __CLR4_4_110201020lc8azw9j.R.inc(46869);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_110201020lc8azw9j.R.inc(46870);assertEquals(1 + OFFSET, test.getHourOfDay());
        __CLR4_4_110201020lc8azw9j.R.inc(46871);assertEquals(2, test.getMinuteOfHour());
        __CLR4_4_110201020lc8azw9j.R.inc(46872);assertEquals(3, test.getSecondOfMinute());
        __CLR4_4_110201020lc8azw9j.R.inc(46873);assertEquals(4, test.getMillisOfSecond());
    }finally{__CLR4_4_110201020lc8azw9j.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Test constructor (Object)
     */
    public void testConstructor_Object1() throws Throwable {__CLR4_4_110201020lc8azw9j.R.globalSliceStart(getClass().getName(),46874);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19oqxcy1062();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_110201020lc8azw9j.R.rethrow($CLV_t2$);}finally{__CLR4_4_110201020lc8azw9j.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Constructors.testConstructor_Object1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),46874,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19oqxcy1062() throws Throwable{try{__CLR4_4_110201020lc8azw9j.R.inc(46874);
        __CLR4_4_110201020lc8azw9j.R.inc(46875);Date date = new Date(TEST_TIME1);
        __CLR4_4_110201020lc8azw9j.R.inc(46876);TimeOfDay test = new TimeOfDay(date);
        __CLR4_4_110201020lc8azw9j.R.inc(46877);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_110201020lc8azw9j.R.inc(46878);assertEquals(1 + OFFSET, test.getHourOfDay());
        __CLR4_4_110201020lc8azw9j.R.inc(46879);assertEquals(2, test.getMinuteOfHour());
        __CLR4_4_110201020lc8azw9j.R.inc(46880);assertEquals(3, test.getSecondOfMinute());
        __CLR4_4_110201020lc8azw9j.R.inc(46881);assertEquals(4, test.getMillisOfSecond());
    }finally{__CLR4_4_110201020lc8azw9j.R.flushNeeded();}}

    /**
     * Test constructor (Object)
     */
    public void testConstructor_Object2() throws Throwable {__CLR4_4_110201020lc8azw9j.R.globalSliceStart(getClass().getName(),46882);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cxqw5f106a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_110201020lc8azw9j.R.rethrow($CLV_t2$);}finally{__CLR4_4_110201020lc8azw9j.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Constructors.testConstructor_Object2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),46882,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cxqw5f106a() throws Throwable{try{__CLR4_4_110201020lc8azw9j.R.inc(46882);
        __CLR4_4_110201020lc8azw9j.R.inc(46883);Calendar cal = new GregorianCalendar();
        __CLR4_4_110201020lc8azw9j.R.inc(46884);cal.setTime(new Date(TEST_TIME1));
        __CLR4_4_110201020lc8azw9j.R.inc(46885);TimeOfDay test = new TimeOfDay(cal);
        __CLR4_4_110201020lc8azw9j.R.inc(46886);assertEquals(GJChronology.getInstanceUTC(), test.getChronology());
        __CLR4_4_110201020lc8azw9j.R.inc(46887);assertEquals(1 + OFFSET, test.getHourOfDay());
        __CLR4_4_110201020lc8azw9j.R.inc(46888);assertEquals(2, test.getMinuteOfHour());
        __CLR4_4_110201020lc8azw9j.R.inc(46889);assertEquals(3, test.getSecondOfMinute());
        __CLR4_4_110201020lc8azw9j.R.inc(46890);assertEquals(4, test.getMillisOfSecond());
    }finally{__CLR4_4_110201020lc8azw9j.R.flushNeeded();}}

    /**
     * Test constructor (Object=null)
     */
    public void testConstructor_nullObject() throws Throwable {__CLR4_4_110201020lc8azw9j.R.globalSliceStart(getClass().getName(),46891);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lt59uk106j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_110201020lc8azw9j.R.rethrow($CLV_t2$);}finally{__CLR4_4_110201020lc8azw9j.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Constructors.testConstructor_nullObject",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),46891,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lt59uk106j() throws Throwable{try{__CLR4_4_110201020lc8azw9j.R.inc(46891);
        __CLR4_4_110201020lc8azw9j.R.inc(46892);TimeOfDay test = new TimeOfDay((Object) null);
        __CLR4_4_110201020lc8azw9j.R.inc(46893);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_110201020lc8azw9j.R.inc(46894);assertEquals(10 + OFFSET, test.getHourOfDay());
        __CLR4_4_110201020lc8azw9j.R.inc(46895);assertEquals(20, test.getMinuteOfHour());
        __CLR4_4_110201020lc8azw9j.R.inc(46896);assertEquals(30, test.getSecondOfMinute());
        __CLR4_4_110201020lc8azw9j.R.inc(46897);assertEquals(40, test.getMillisOfSecond());
    }finally{__CLR4_4_110201020lc8azw9j.R.flushNeeded();}}

    /**
     * Test constructor (Object)
     */
    public void testConstructor_todObject() throws Throwable {__CLR4_4_110201020lc8azw9j.R.globalSliceStart(getClass().getName(),46898);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12vel4106q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_110201020lc8azw9j.R.rethrow($CLV_t2$);}finally{__CLR4_4_110201020lc8azw9j.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Constructors.testConstructor_todObject",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),46898,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12vel4106q() throws Throwable{try{__CLR4_4_110201020lc8azw9j.R.inc(46898);
        __CLR4_4_110201020lc8azw9j.R.inc(46899);TimeOfDay base = new TimeOfDay(10, 20, 30, 40, CopticChronology.getInstance(PARIS));
        __CLR4_4_110201020lc8azw9j.R.inc(46900);TimeOfDay test = new TimeOfDay(base);
        __CLR4_4_110201020lc8azw9j.R.inc(46901);assertEquals(CopticChronology.getInstanceUTC(), test.getChronology());
        __CLR4_4_110201020lc8azw9j.R.inc(46902);assertEquals(10, test.getHourOfDay());
        __CLR4_4_110201020lc8azw9j.R.inc(46903);assertEquals(20, test.getMinuteOfHour());
        __CLR4_4_110201020lc8azw9j.R.inc(46904);assertEquals(30, test.getSecondOfMinute());
        __CLR4_4_110201020lc8azw9j.R.inc(46905);assertEquals(40, test.getMillisOfSecond());
    }finally{__CLR4_4_110201020lc8azw9j.R.flushNeeded();}}

    public void testConstructor_ObjectString1() throws Throwable {__CLR4_4_110201020lc8azw9j.R.globalSliceStart(getClass().getName(),46906);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11c2b5d106y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_110201020lc8azw9j.R.rethrow($CLV_t2$);}finally{__CLR4_4_110201020lc8azw9j.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Constructors.testConstructor_ObjectString1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),46906,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11c2b5d106y() throws Throwable{try{__CLR4_4_110201020lc8azw9j.R.inc(46906);
        __CLR4_4_110201020lc8azw9j.R.inc(46907);TimeOfDay test = new TimeOfDay("10:20:30.040");
        __CLR4_4_110201020lc8azw9j.R.inc(46908);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_110201020lc8azw9j.R.inc(46909);assertEquals(10, test.getHourOfDay());
        __CLR4_4_110201020lc8azw9j.R.inc(46910);assertEquals(20, test.getMinuteOfHour());
        __CLR4_4_110201020lc8azw9j.R.inc(46911);assertEquals(30, test.getSecondOfMinute());
        __CLR4_4_110201020lc8azw9j.R.inc(46912);assertEquals(40, test.getMillisOfSecond());
    }finally{__CLR4_4_110201020lc8azw9j.R.flushNeeded();}}

    public void testConstructor_ObjectString2() throws Throwable {__CLR4_4_110201020lc8azw9j.R.globalSliceStart(getClass().getName(),46913);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14l29xu1075();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_110201020lc8azw9j.R.rethrow($CLV_t2$);}finally{__CLR4_4_110201020lc8azw9j.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Constructors.testConstructor_ObjectString2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),46913,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14l29xu1075() throws Throwable{try{__CLR4_4_110201020lc8azw9j.R.inc(46913);
        __CLR4_4_110201020lc8azw9j.R.inc(46914);TimeOfDay test = new TimeOfDay("10:20:30.040+04:00");
        __CLR4_4_110201020lc8azw9j.R.inc(46915);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_110201020lc8azw9j.R.inc(46916);assertEquals(10 + OFFSET - 4, test.getHourOfDay());
        __CLR4_4_110201020lc8azw9j.R.inc(46917);assertEquals(20, test.getMinuteOfHour());
        __CLR4_4_110201020lc8azw9j.R.inc(46918);assertEquals(30, test.getSecondOfMinute());
        __CLR4_4_110201020lc8azw9j.R.inc(46919);assertEquals(40, test.getMillisOfSecond());
    }finally{__CLR4_4_110201020lc8azw9j.R.flushNeeded();}}

    public void testConstructor_ObjectString3() throws Throwable {__CLR4_4_110201020lc8azw9j.R.globalSliceStart(getClass().getName(),46920);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17u28qb107c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_110201020lc8azw9j.R.rethrow($CLV_t2$);}finally{__CLR4_4_110201020lc8azw9j.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Constructors.testConstructor_ObjectString3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),46920,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17u28qb107c() throws Throwable{try{__CLR4_4_110201020lc8azw9j.R.inc(46920);
        __CLR4_4_110201020lc8azw9j.R.inc(46921);TimeOfDay test = new TimeOfDay("T10:20:30.040");
        __CLR4_4_110201020lc8azw9j.R.inc(46922);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_110201020lc8azw9j.R.inc(46923);assertEquals(10, test.getHourOfDay());
        __CLR4_4_110201020lc8azw9j.R.inc(46924);assertEquals(20, test.getMinuteOfHour());
        __CLR4_4_110201020lc8azw9j.R.inc(46925);assertEquals(30, test.getSecondOfMinute());
        __CLR4_4_110201020lc8azw9j.R.inc(46926);assertEquals(40, test.getMillisOfSecond());
    }finally{__CLR4_4_110201020lc8azw9j.R.flushNeeded();}}

    public void testConstructor_ObjectString4() throws Throwable {__CLR4_4_110201020lc8azw9j.R.globalSliceStart(getClass().getName(),46927);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1b327is107j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_110201020lc8azw9j.R.rethrow($CLV_t2$);}finally{__CLR4_4_110201020lc8azw9j.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Constructors.testConstructor_ObjectString4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),46927,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1b327is107j() throws Throwable{try{__CLR4_4_110201020lc8azw9j.R.inc(46927);
        __CLR4_4_110201020lc8azw9j.R.inc(46928);TimeOfDay test = new TimeOfDay("T10:20:30.040+04:00");
        __CLR4_4_110201020lc8azw9j.R.inc(46929);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_110201020lc8azw9j.R.inc(46930);assertEquals(10 + OFFSET - 4, test.getHourOfDay());
        __CLR4_4_110201020lc8azw9j.R.inc(46931);assertEquals(20, test.getMinuteOfHour());
        __CLR4_4_110201020lc8azw9j.R.inc(46932);assertEquals(30, test.getSecondOfMinute());
        __CLR4_4_110201020lc8azw9j.R.inc(46933);assertEquals(40, test.getMillisOfSecond());
    }finally{__CLR4_4_110201020lc8azw9j.R.flushNeeded();}}

    public void testConstructor_ObjectString5() throws Throwable {__CLR4_4_110201020lc8azw9j.R.globalSliceStart(getClass().getName(),46934);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ec26b9107q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_110201020lc8azw9j.R.rethrow($CLV_t2$);}finally{__CLR4_4_110201020lc8azw9j.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Constructors.testConstructor_ObjectString5",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),46934,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ec26b9107q() throws Throwable{try{__CLR4_4_110201020lc8azw9j.R.inc(46934);
        __CLR4_4_110201020lc8azw9j.R.inc(46935);TimeOfDay test = new TimeOfDay("10:20");
        __CLR4_4_110201020lc8azw9j.R.inc(46936);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_110201020lc8azw9j.R.inc(46937);assertEquals(10, test.getHourOfDay());
        __CLR4_4_110201020lc8azw9j.R.inc(46938);assertEquals(20, test.getMinuteOfHour());
        __CLR4_4_110201020lc8azw9j.R.inc(46939);assertEquals(0, test.getSecondOfMinute());
        __CLR4_4_110201020lc8azw9j.R.inc(46940);assertEquals(0, test.getMillisOfSecond());
    }finally{__CLR4_4_110201020lc8azw9j.R.flushNeeded();}}

    public void testConstructor_ObjectString6() throws Throwable {__CLR4_4_110201020lc8azw9j.R.globalSliceStart(getClass().getName(),46941);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hl253q107x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_110201020lc8azw9j.R.rethrow($CLV_t2$);}finally{__CLR4_4_110201020lc8azw9j.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Constructors.testConstructor_ObjectString6",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),46941,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hl253q107x() throws Throwable{try{__CLR4_4_110201020lc8azw9j.R.inc(46941);
        __CLR4_4_110201020lc8azw9j.R.inc(46942);TimeOfDay test = new TimeOfDay("10");
        __CLR4_4_110201020lc8azw9j.R.inc(46943);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_110201020lc8azw9j.R.inc(46944);assertEquals(10, test.getHourOfDay());
        __CLR4_4_110201020lc8azw9j.R.inc(46945);assertEquals(0, test.getMinuteOfHour());
        __CLR4_4_110201020lc8azw9j.R.inc(46946);assertEquals(0, test.getSecondOfMinute());
        __CLR4_4_110201020lc8azw9j.R.inc(46947);assertEquals(0, test.getMillisOfSecond());
    }finally{__CLR4_4_110201020lc8azw9j.R.flushNeeded();}}

    public void testConstructor_ObjectStringEx1() throws Throwable {__CLR4_4_110201020lc8azw9j.R.globalSliceStart(getClass().getName(),46948);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11daule1084();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_110201020lc8azw9j.R.rethrow($CLV_t2$);}finally{__CLR4_4_110201020lc8azw9j.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Constructors.testConstructor_ObjectStringEx1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),46948,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11daule1084() throws Throwable{try{__CLR4_4_110201020lc8azw9j.R.inc(46948);
        __CLR4_4_110201020lc8azw9j.R.inc(46949);try {
            __CLR4_4_110201020lc8azw9j.R.inc(46950);new TimeOfDay("1970-04-06");
            __CLR4_4_110201020lc8azw9j.R.inc(46951);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_110201020lc8azw9j.R.flushNeeded();}}

    public void testConstructor_ObjectStringEx2() throws Throwable {__CLR4_4_110201020lc8azw9j.R.globalSliceStart(getClass().getName(),46952);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11vp4731088();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_110201020lc8azw9j.R.rethrow($CLV_t2$);}finally{__CLR4_4_110201020lc8azw9j.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Constructors.testConstructor_ObjectStringEx2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),46952,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11vp4731088() throws Throwable{try{__CLR4_4_110201020lc8azw9j.R.inc(46952);
        __CLR4_4_110201020lc8azw9j.R.inc(46953);try {
            __CLR4_4_110201020lc8azw9j.R.inc(46954);new TimeOfDay("1970-04-06T+14:00");
            __CLR4_4_110201020lc8azw9j.R.inc(46955);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_110201020lc8azw9j.R.flushNeeded();}}

    public void testConstructor_ObjectStringEx3() throws Throwable {__CLR4_4_110201020lc8azw9j.R.globalSliceStart(getClass().getName(),46956);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_154p2zk108c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_110201020lc8azw9j.R.rethrow($CLV_t2$);}finally{__CLR4_4_110201020lc8azw9j.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Constructors.testConstructor_ObjectStringEx3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),46956,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_154p2zk108c() throws Throwable{try{__CLR4_4_110201020lc8azw9j.R.inc(46956);
        __CLR4_4_110201020lc8azw9j.R.inc(46957);try {
            __CLR4_4_110201020lc8azw9j.R.inc(46958);new TimeOfDay("1970-04-06T10:20:30.040");
            __CLR4_4_110201020lc8azw9j.R.inc(46959);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_110201020lc8azw9j.R.flushNeeded();}}

    public void testConstructor_ObjectStringEx4() throws Throwable {__CLR4_4_110201020lc8azw9j.R.globalSliceStart(getClass().getName(),46960);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18dp1s1108g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_110201020lc8azw9j.R.rethrow($CLV_t2$);}finally{__CLR4_4_110201020lc8azw9j.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Constructors.testConstructor_ObjectStringEx4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),46960,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18dp1s1108g() throws Throwable{try{__CLR4_4_110201020lc8azw9j.R.inc(46960);
        __CLR4_4_110201020lc8azw9j.R.inc(46961);try {
            __CLR4_4_110201020lc8azw9j.R.inc(46962);new TimeOfDay("1970-04-06T10:20:30.040+14:00");
            __CLR4_4_110201020lc8azw9j.R.inc(46963);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_110201020lc8azw9j.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Test constructor (Object, Chronology)
     */
    public void testConstructor_Object_Chronology() throws Throwable {__CLR4_4_110201020lc8azw9j.R.globalSliceStart(getClass().getName(),46964);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vmnvd4108k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_110201020lc8azw9j.R.rethrow($CLV_t2$);}finally{__CLR4_4_110201020lc8azw9j.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Constructors.testConstructor_Object_Chronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),46964,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vmnvd4108k() throws Throwable{try{__CLR4_4_110201020lc8azw9j.R.inc(46964);
        __CLR4_4_110201020lc8azw9j.R.inc(46965);Date date = new Date(TEST_TIME1);
        __CLR4_4_110201020lc8azw9j.R.inc(46966);TimeOfDay test = new TimeOfDay(date, JulianChronology.getInstance());
        __CLR4_4_110201020lc8azw9j.R.inc(46967);assertEquals(JulianChronology.getInstanceUTC(), test.getChronology());
        __CLR4_4_110201020lc8azw9j.R.inc(46968);assertEquals(1 + OFFSET, test.getHourOfDay());
        __CLR4_4_110201020lc8azw9j.R.inc(46969);assertEquals(2, test.getMinuteOfHour());
        __CLR4_4_110201020lc8azw9j.R.inc(46970);assertEquals(3, test.getSecondOfMinute());
        __CLR4_4_110201020lc8azw9j.R.inc(46971);assertEquals(4, test.getMillisOfSecond());
    }finally{__CLR4_4_110201020lc8azw9j.R.flushNeeded();}}

    /**
     * Test constructor (Object, Chronology)
     */
    public void testConstructor2_Object_Chronology() throws Throwable {__CLR4_4_110201020lc8azw9j.R.globalSliceStart(getClass().getName(),46972);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12uyju2108s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_110201020lc8azw9j.R.rethrow($CLV_t2$);}finally{__CLR4_4_110201020lc8azw9j.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Constructors.testConstructor2_Object_Chronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),46972,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12uyju2108s() throws Throwable{try{__CLR4_4_110201020lc8azw9j.R.inc(46972);
        __CLR4_4_110201020lc8azw9j.R.inc(46973);TimeOfDay test = new TimeOfDay("T10:20");
        __CLR4_4_110201020lc8azw9j.R.inc(46974);assertEquals(10, test.getHourOfDay());
        __CLR4_4_110201020lc8azw9j.R.inc(46975);assertEquals(20, test.getMinuteOfHour());
        __CLR4_4_110201020lc8azw9j.R.inc(46976);assertEquals(0, test.getSecondOfMinute());
        __CLR4_4_110201020lc8azw9j.R.inc(46977);assertEquals(0, test.getMillisOfSecond());
        
        __CLR4_4_110201020lc8azw9j.R.inc(46978);try {
            __CLR4_4_110201020lc8azw9j.R.inc(46979);new TimeOfDay("T1020");
            __CLR4_4_110201020lc8azw9j.R.inc(46980);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_110201020lc8azw9j.R.flushNeeded();}}

    /**
     * Test constructor (Object=null, Chronology)
     */
    public void testConstructor_nullObject_Chronology() throws Throwable {__CLR4_4_110201020lc8azw9j.R.globalSliceStart(getClass().getName(),46981);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14q0uyn1091();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_110201020lc8azw9j.R.rethrow($CLV_t2$);}finally{__CLR4_4_110201020lc8azw9j.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Constructors.testConstructor_nullObject_Chronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),46981,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14q0uyn1091() throws Throwable{try{__CLR4_4_110201020lc8azw9j.R.inc(46981);
        __CLR4_4_110201020lc8azw9j.R.inc(46982);TimeOfDay test = new TimeOfDay((Object) null, JulianChronology.getInstance());
        __CLR4_4_110201020lc8azw9j.R.inc(46983);assertEquals(JulianChronology.getInstanceUTC(), test.getChronology());
        __CLR4_4_110201020lc8azw9j.R.inc(46984);assertEquals(10 + OFFSET, test.getHourOfDay());
        __CLR4_4_110201020lc8azw9j.R.inc(46985);assertEquals(20, test.getMinuteOfHour());
        __CLR4_4_110201020lc8azw9j.R.inc(46986);assertEquals(30, test.getSecondOfMinute());
        __CLR4_4_110201020lc8azw9j.R.inc(46987);assertEquals(40, test.getMillisOfSecond());
    }finally{__CLR4_4_110201020lc8azw9j.R.flushNeeded();}}

    /**
     * Test constructor (Object, Chronology=null)
     */
    public void testConstructor_Object_nullChronology() throws Throwable {__CLR4_4_110201020lc8azw9j.R.globalSliceStart(getClass().getName(),46988);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yccijz1098();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_110201020lc8azw9j.R.rethrow($CLV_t2$);}finally{__CLR4_4_110201020lc8azw9j.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Constructors.testConstructor_Object_nullChronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),46988,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yccijz1098() throws Throwable{try{__CLR4_4_110201020lc8azw9j.R.inc(46988);
        __CLR4_4_110201020lc8azw9j.R.inc(46989);Date date = new Date(TEST_TIME1);
        __CLR4_4_110201020lc8azw9j.R.inc(46990);TimeOfDay test = new TimeOfDay(date, null);
        __CLR4_4_110201020lc8azw9j.R.inc(46991);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_110201020lc8azw9j.R.inc(46992);assertEquals(1 + OFFSET, test.getHourOfDay());
        __CLR4_4_110201020lc8azw9j.R.inc(46993);assertEquals(2, test.getMinuteOfHour());
        __CLR4_4_110201020lc8azw9j.R.inc(46994);assertEquals(3, test.getSecondOfMinute());
        __CLR4_4_110201020lc8azw9j.R.inc(46995);assertEquals(4, test.getMillisOfSecond());
    }finally{__CLR4_4_110201020lc8azw9j.R.flushNeeded();}}

    /**
     * Test constructor (Object=null, Chronology=null)
     */
    public void testConstructor_nullObject_nullChronology() throws Throwable {__CLR4_4_110201020lc8azw9j.R.globalSliceStart(getClass().getName(),46996);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14dtve0109g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_110201020lc8azw9j.R.rethrow($CLV_t2$);}finally{__CLR4_4_110201020lc8azw9j.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Constructors.testConstructor_nullObject_nullChronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),46996,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14dtve0109g() throws Throwable{try{__CLR4_4_110201020lc8azw9j.R.inc(46996);
        __CLR4_4_110201020lc8azw9j.R.inc(46997);TimeOfDay test = new TimeOfDay((Object) null, null);
        __CLR4_4_110201020lc8azw9j.R.inc(46998);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_110201020lc8azw9j.R.inc(46999);assertEquals(10 + OFFSET, test.getHourOfDay());
        __CLR4_4_110201020lc8azw9j.R.inc(47000);assertEquals(20, test.getMinuteOfHour());
        __CLR4_4_110201020lc8azw9j.R.inc(47001);assertEquals(30, test.getSecondOfMinute());
        __CLR4_4_110201020lc8azw9j.R.inc(47002);assertEquals(40, test.getMillisOfSecond());
    }finally{__CLR4_4_110201020lc8azw9j.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Test constructor (int, int)
     */
    public void testConstructor_int_int() throws Throwable {__CLR4_4_110201020lc8azw9j.R.globalSliceStart(getClass().getName(),47003);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1b5ioxb109n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_110201020lc8azw9j.R.rethrow($CLV_t2$);}finally{__CLR4_4_110201020lc8azw9j.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Constructors.testConstructor_int_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),47003,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1b5ioxb109n() throws Throwable{try{__CLR4_4_110201020lc8azw9j.R.inc(47003);
        __CLR4_4_110201020lc8azw9j.R.inc(47004);TimeOfDay test = new TimeOfDay(10, 20);
        __CLR4_4_110201020lc8azw9j.R.inc(47005);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_110201020lc8azw9j.R.inc(47006);assertEquals(10, test.getHourOfDay());
        __CLR4_4_110201020lc8azw9j.R.inc(47007);assertEquals(20, test.getMinuteOfHour());
        __CLR4_4_110201020lc8azw9j.R.inc(47008);assertEquals(0, test.getSecondOfMinute());
        __CLR4_4_110201020lc8azw9j.R.inc(47009);assertEquals(0, test.getMillisOfSecond());
        __CLR4_4_110201020lc8azw9j.R.inc(47010);try {
            __CLR4_4_110201020lc8azw9j.R.inc(47011);new TimeOfDay(-1, 20);
            __CLR4_4_110201020lc8azw9j.R.inc(47012);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_110201020lc8azw9j.R.inc(47013);try {
            __CLR4_4_110201020lc8azw9j.R.inc(47014);new TimeOfDay(24, 20);
            __CLR4_4_110201020lc8azw9j.R.inc(47015);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_110201020lc8azw9j.R.inc(47016);try {
            __CLR4_4_110201020lc8azw9j.R.inc(47017);new TimeOfDay(10, -1);
            __CLR4_4_110201020lc8azw9j.R.inc(47018);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_110201020lc8azw9j.R.inc(47019);try {
            __CLR4_4_110201020lc8azw9j.R.inc(47020);new TimeOfDay(10, 60);
            __CLR4_4_110201020lc8azw9j.R.inc(47021);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_110201020lc8azw9j.R.flushNeeded();}}

    /**
     * Test constructor (int, int, int, Chronology)
     */
    public void testConstructor_int_int_Chronology() throws Throwable {__CLR4_4_110201020lc8azw9j.R.globalSliceStart(getClass().getName(),47022);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bb8f3e10a6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_110201020lc8azw9j.R.rethrow($CLV_t2$);}finally{__CLR4_4_110201020lc8azw9j.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Constructors.testConstructor_int_int_Chronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),47022,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bb8f3e10a6() throws Throwable{try{__CLR4_4_110201020lc8azw9j.R.inc(47022);
        __CLR4_4_110201020lc8azw9j.R.inc(47023);TimeOfDay test = new TimeOfDay(10, 20, JulianChronology.getInstance());
        __CLR4_4_110201020lc8azw9j.R.inc(47024);assertEquals(JulianChronology.getInstanceUTC(), test.getChronology());
        __CLR4_4_110201020lc8azw9j.R.inc(47025);assertEquals(10, test.getHourOfDay());
        __CLR4_4_110201020lc8azw9j.R.inc(47026);assertEquals(20, test.getMinuteOfHour());
        __CLR4_4_110201020lc8azw9j.R.inc(47027);assertEquals(0, test.getSecondOfMinute());
        __CLR4_4_110201020lc8azw9j.R.inc(47028);assertEquals(0, test.getMillisOfSecond());
        __CLR4_4_110201020lc8azw9j.R.inc(47029);try {
            __CLR4_4_110201020lc8azw9j.R.inc(47030);new TimeOfDay(-1, 20, JulianChronology.getInstance());
            __CLR4_4_110201020lc8azw9j.R.inc(47031);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_110201020lc8azw9j.R.inc(47032);try {
            __CLR4_4_110201020lc8azw9j.R.inc(47033);new TimeOfDay(24, 20, JulianChronology.getInstance());
            __CLR4_4_110201020lc8azw9j.R.inc(47034);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_110201020lc8azw9j.R.inc(47035);try {
            __CLR4_4_110201020lc8azw9j.R.inc(47036);new TimeOfDay(10, -1, JulianChronology.getInstance());
            __CLR4_4_110201020lc8azw9j.R.inc(47037);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_110201020lc8azw9j.R.inc(47038);try {
            __CLR4_4_110201020lc8azw9j.R.inc(47039);new TimeOfDay(10, 60, JulianChronology.getInstance());
            __CLR4_4_110201020lc8azw9j.R.inc(47040);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_110201020lc8azw9j.R.flushNeeded();}}

    /**
     * Test constructor (int, int, int, Chronology=null)
     */
    public void testConstructor_int_int_nullChronology() throws Throwable {__CLR4_4_110201020lc8azw9j.R.globalSliceStart(getClass().getName(),47041);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1b34hdv10ap();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_110201020lc8azw9j.R.rethrow($CLV_t2$);}finally{__CLR4_4_110201020lc8azw9j.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Constructors.testConstructor_int_int_nullChronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),47041,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1b34hdv10ap() throws Throwable{try{__CLR4_4_110201020lc8azw9j.R.inc(47041);
        __CLR4_4_110201020lc8azw9j.R.inc(47042);TimeOfDay test = new TimeOfDay(10, 20, null);
        __CLR4_4_110201020lc8azw9j.R.inc(47043);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_110201020lc8azw9j.R.inc(47044);assertEquals(10, test.getHourOfDay());
        __CLR4_4_110201020lc8azw9j.R.inc(47045);assertEquals(20, test.getMinuteOfHour());
        __CLR4_4_110201020lc8azw9j.R.inc(47046);assertEquals(0, test.getSecondOfMinute());
        __CLR4_4_110201020lc8azw9j.R.inc(47047);assertEquals(0, test.getMillisOfSecond());
    }finally{__CLR4_4_110201020lc8azw9j.R.flushNeeded();}}

    /**
     * Test constructor (int, int, int)
     */
    public void testConstructor_int_int_int() throws Throwable {__CLR4_4_110201020lc8azw9j.R.globalSliceStart(getClass().getName(),47048);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bd9uqn10aw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_110201020lc8azw9j.R.rethrow($CLV_t2$);}finally{__CLR4_4_110201020lc8azw9j.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Constructors.testConstructor_int_int_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),47048,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bd9uqn10aw() throws Throwable{try{__CLR4_4_110201020lc8azw9j.R.inc(47048);
        __CLR4_4_110201020lc8azw9j.R.inc(47049);TimeOfDay test = new TimeOfDay(10, 20, 30);
        __CLR4_4_110201020lc8azw9j.R.inc(47050);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_110201020lc8azw9j.R.inc(47051);assertEquals(10, test.getHourOfDay());
        __CLR4_4_110201020lc8azw9j.R.inc(47052);assertEquals(20, test.getMinuteOfHour());
        __CLR4_4_110201020lc8azw9j.R.inc(47053);assertEquals(30, test.getSecondOfMinute());
        __CLR4_4_110201020lc8azw9j.R.inc(47054);assertEquals(0, test.getMillisOfSecond());
        __CLR4_4_110201020lc8azw9j.R.inc(47055);try {
            __CLR4_4_110201020lc8azw9j.R.inc(47056);new TimeOfDay(-1, 20, 30);
            __CLR4_4_110201020lc8azw9j.R.inc(47057);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_110201020lc8azw9j.R.inc(47058);try {
            __CLR4_4_110201020lc8azw9j.R.inc(47059);new TimeOfDay(24, 20, 30);
            __CLR4_4_110201020lc8azw9j.R.inc(47060);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_110201020lc8azw9j.R.inc(47061);try {
            __CLR4_4_110201020lc8azw9j.R.inc(47062);new TimeOfDay(10, -1, 30);
            __CLR4_4_110201020lc8azw9j.R.inc(47063);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_110201020lc8azw9j.R.inc(47064);try {
            __CLR4_4_110201020lc8azw9j.R.inc(47065);new TimeOfDay(10, 60, 30);
            __CLR4_4_110201020lc8azw9j.R.inc(47066);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_110201020lc8azw9j.R.inc(47067);try {
            __CLR4_4_110201020lc8azw9j.R.inc(47068);new TimeOfDay(10, 20, -1);
            __CLR4_4_110201020lc8azw9j.R.inc(47069);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_110201020lc8azw9j.R.inc(47070);try {
            __CLR4_4_110201020lc8azw9j.R.inc(47071);new TimeOfDay(10, 20, 60);
            __CLR4_4_110201020lc8azw9j.R.inc(47072);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_110201020lc8azw9j.R.flushNeeded();}}

    /**
     * Test constructor (int, int, int, Chronology)
     */
    public void testConstructor_int_int_int_Chronology() throws Throwable {__CLR4_4_110201020lc8azw9j.R.globalSliceStart(getClass().getName(),47073);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1o62uzq10bl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_110201020lc8azw9j.R.rethrow($CLV_t2$);}finally{__CLR4_4_110201020lc8azw9j.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Constructors.testConstructor_int_int_int_Chronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),47073,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1o62uzq10bl() throws Throwable{try{__CLR4_4_110201020lc8azw9j.R.inc(47073);
        __CLR4_4_110201020lc8azw9j.R.inc(47074);TimeOfDay test = new TimeOfDay(10, 20, 30, JulianChronology.getInstance());
        __CLR4_4_110201020lc8azw9j.R.inc(47075);assertEquals(JulianChronology.getInstanceUTC(), test.getChronology());
        __CLR4_4_110201020lc8azw9j.R.inc(47076);assertEquals(10, test.getHourOfDay());
        __CLR4_4_110201020lc8azw9j.R.inc(47077);assertEquals(20, test.getMinuteOfHour());
        __CLR4_4_110201020lc8azw9j.R.inc(47078);assertEquals(30, test.getSecondOfMinute());
        __CLR4_4_110201020lc8azw9j.R.inc(47079);assertEquals(0, test.getMillisOfSecond());
        __CLR4_4_110201020lc8azw9j.R.inc(47080);try {
            __CLR4_4_110201020lc8azw9j.R.inc(47081);new TimeOfDay(-1, 20, 30, JulianChronology.getInstance());
            __CLR4_4_110201020lc8azw9j.R.inc(47082);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_110201020lc8azw9j.R.inc(47083);try {
            __CLR4_4_110201020lc8azw9j.R.inc(47084);new TimeOfDay(24, 20, 30, JulianChronology.getInstance());
            __CLR4_4_110201020lc8azw9j.R.inc(47085);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_110201020lc8azw9j.R.inc(47086);try {
            __CLR4_4_110201020lc8azw9j.R.inc(47087);new TimeOfDay(10, -1, 30, JulianChronology.getInstance());
            __CLR4_4_110201020lc8azw9j.R.inc(47088);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_110201020lc8azw9j.R.inc(47089);try {
            __CLR4_4_110201020lc8azw9j.R.inc(47090);new TimeOfDay(10, 60, 30, JulianChronology.getInstance());
            __CLR4_4_110201020lc8azw9j.R.inc(47091);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_110201020lc8azw9j.R.inc(47092);try {
            __CLR4_4_110201020lc8azw9j.R.inc(47093);new TimeOfDay(10, 20, -1, JulianChronology.getInstance());
            __CLR4_4_110201020lc8azw9j.R.inc(47094);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_110201020lc8azw9j.R.inc(47095);try {
            __CLR4_4_110201020lc8azw9j.R.inc(47096);new TimeOfDay(10, 20, 60, JulianChronology.getInstance());
            __CLR4_4_110201020lc8azw9j.R.inc(47097);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_110201020lc8azw9j.R.flushNeeded();}}

    /**
     * Test constructor (int, int, int, Chronology=null)
     */
    public void testConstructor_int_int_int_nullChronology() throws Throwable {__CLR4_4_110201020lc8azw9j.R.globalSliceStart(getClass().getName(),47098);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uph3gt10ca();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_110201020lc8azw9j.R.rethrow($CLV_t2$);}finally{__CLR4_4_110201020lc8azw9j.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Constructors.testConstructor_int_int_int_nullChronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),47098,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uph3gt10ca() throws Throwable{try{__CLR4_4_110201020lc8azw9j.R.inc(47098);
        __CLR4_4_110201020lc8azw9j.R.inc(47099);TimeOfDay test = new TimeOfDay(10, 20, 30, null);
        __CLR4_4_110201020lc8azw9j.R.inc(47100);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_110201020lc8azw9j.R.inc(47101);assertEquals(10, test.getHourOfDay());
        __CLR4_4_110201020lc8azw9j.R.inc(47102);assertEquals(20, test.getMinuteOfHour());
        __CLR4_4_110201020lc8azw9j.R.inc(47103);assertEquals(30, test.getSecondOfMinute());
        __CLR4_4_110201020lc8azw9j.R.inc(47104);assertEquals(0, test.getMillisOfSecond());
    }finally{__CLR4_4_110201020lc8azw9j.R.flushNeeded();}}

    /**
     * Test constructor (int, int, int, int)
     */
    public void testConstructor_int_int_int_int() throws Throwable {__CLR4_4_110201020lc8azw9j.R.globalSliceStart(getClass().getName(),47105);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hjvai910ch();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_110201020lc8azw9j.R.rethrow($CLV_t2$);}finally{__CLR4_4_110201020lc8azw9j.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Constructors.testConstructor_int_int_int_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),47105,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hjvai910ch() throws Throwable{try{__CLR4_4_110201020lc8azw9j.R.inc(47105);
        __CLR4_4_110201020lc8azw9j.R.inc(47106);TimeOfDay test = new TimeOfDay(10, 20, 30, 40);
        __CLR4_4_110201020lc8azw9j.R.inc(47107);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_110201020lc8azw9j.R.inc(47108);assertEquals(10, test.getHourOfDay());
        __CLR4_4_110201020lc8azw9j.R.inc(47109);assertEquals(20, test.getMinuteOfHour());
        __CLR4_4_110201020lc8azw9j.R.inc(47110);assertEquals(30, test.getSecondOfMinute());
        __CLR4_4_110201020lc8azw9j.R.inc(47111);assertEquals(40, test.getMillisOfSecond());
        __CLR4_4_110201020lc8azw9j.R.inc(47112);try {
            __CLR4_4_110201020lc8azw9j.R.inc(47113);new TimeOfDay(-1, 20, 30, 40);
            __CLR4_4_110201020lc8azw9j.R.inc(47114);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_110201020lc8azw9j.R.inc(47115);try {
            __CLR4_4_110201020lc8azw9j.R.inc(47116);new TimeOfDay(24, 20, 30, 40);
            __CLR4_4_110201020lc8azw9j.R.inc(47117);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_110201020lc8azw9j.R.inc(47118);try {
            __CLR4_4_110201020lc8azw9j.R.inc(47119);new TimeOfDay(10, -1, 30, 40);
            __CLR4_4_110201020lc8azw9j.R.inc(47120);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_110201020lc8azw9j.R.inc(47121);try {
            __CLR4_4_110201020lc8azw9j.R.inc(47122);new TimeOfDay(10, 60, 30, 40);
            __CLR4_4_110201020lc8azw9j.R.inc(47123);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_110201020lc8azw9j.R.inc(47124);try {
            __CLR4_4_110201020lc8azw9j.R.inc(47125);new TimeOfDay(10, 20, -1, 40);
            __CLR4_4_110201020lc8azw9j.R.inc(47126);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_110201020lc8azw9j.R.inc(47127);try {
            __CLR4_4_110201020lc8azw9j.R.inc(47128);new TimeOfDay(10, 20, 60, 40);
            __CLR4_4_110201020lc8azw9j.R.inc(47129);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_110201020lc8azw9j.R.inc(47130);try {
            __CLR4_4_110201020lc8azw9j.R.inc(47131);new TimeOfDay(10, 20, 30, -1);
            __CLR4_4_110201020lc8azw9j.R.inc(47132);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_110201020lc8azw9j.R.inc(47133);try {
            __CLR4_4_110201020lc8azw9j.R.inc(47134);new TimeOfDay(10, 20, 30, 1000);
            __CLR4_4_110201020lc8azw9j.R.inc(47135);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_110201020lc8azw9j.R.flushNeeded();}}

    /**
     * Test constructor (int, int, int, int, Chronology)
     */
    public void testConstructor_int_int_int_int_Chronology() throws Throwable {__CLR4_4_110201020lc8azw9j.R.globalSliceStart(getClass().getName(),47136);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_152fm4q10dc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_110201020lc8azw9j.R.rethrow($CLV_t2$);}finally{__CLR4_4_110201020lc8azw9j.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Constructors.testConstructor_int_int_int_int_Chronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),47136,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_152fm4q10dc() throws Throwable{try{__CLR4_4_110201020lc8azw9j.R.inc(47136);
        __CLR4_4_110201020lc8azw9j.R.inc(47137);TimeOfDay test = new TimeOfDay(10, 20, 30, 40, JulianChronology.getInstance());
        __CLR4_4_110201020lc8azw9j.R.inc(47138);assertEquals(JulianChronology.getInstanceUTC(), test.getChronology());
        __CLR4_4_110201020lc8azw9j.R.inc(47139);assertEquals(10, test.getHourOfDay());
        __CLR4_4_110201020lc8azw9j.R.inc(47140);assertEquals(20, test.getMinuteOfHour());
        __CLR4_4_110201020lc8azw9j.R.inc(47141);assertEquals(30, test.getSecondOfMinute());
        __CLR4_4_110201020lc8azw9j.R.inc(47142);assertEquals(40, test.getMillisOfSecond());
        __CLR4_4_110201020lc8azw9j.R.inc(47143);try {
            __CLR4_4_110201020lc8azw9j.R.inc(47144);new TimeOfDay(-1, 20, 30, 40, JulianChronology.getInstance());
            __CLR4_4_110201020lc8azw9j.R.inc(47145);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_110201020lc8azw9j.R.inc(47146);try {
            __CLR4_4_110201020lc8azw9j.R.inc(47147);new TimeOfDay(24, 20, 30, 40, JulianChronology.getInstance());
            __CLR4_4_110201020lc8azw9j.R.inc(47148);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_110201020lc8azw9j.R.inc(47149);try {
            __CLR4_4_110201020lc8azw9j.R.inc(47150);new TimeOfDay(10, -1, 30, 40, JulianChronology.getInstance());
            __CLR4_4_110201020lc8azw9j.R.inc(47151);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_110201020lc8azw9j.R.inc(47152);try {
            __CLR4_4_110201020lc8azw9j.R.inc(47153);new TimeOfDay(10, 60, 30, 40, JulianChronology.getInstance());
            __CLR4_4_110201020lc8azw9j.R.inc(47154);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_110201020lc8azw9j.R.inc(47155);try {
            __CLR4_4_110201020lc8azw9j.R.inc(47156);new TimeOfDay(10, 20, -1, 40, JulianChronology.getInstance());
            __CLR4_4_110201020lc8azw9j.R.inc(47157);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_110201020lc8azw9j.R.inc(47158);try {
            __CLR4_4_110201020lc8azw9j.R.inc(47159);new TimeOfDay(10, 20, 60, 40, JulianChronology.getInstance());
            __CLR4_4_110201020lc8azw9j.R.inc(47160);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_110201020lc8azw9j.R.inc(47161);try {
            __CLR4_4_110201020lc8azw9j.R.inc(47162);new TimeOfDay(10, 20, 30, -1, JulianChronology.getInstance());
            __CLR4_4_110201020lc8azw9j.R.inc(47163);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_110201020lc8azw9j.R.inc(47164);try {
            __CLR4_4_110201020lc8azw9j.R.inc(47165);new TimeOfDay(10, 20, 30, 1000, JulianChronology.getInstance());
            __CLR4_4_110201020lc8azw9j.R.inc(47166);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_110201020lc8azw9j.R.flushNeeded();}}

    /**
     * Test constructor (int, int, int, int, Chronology=null)
     */
    public void testConstructor_int_int_int_int_nullChronology() throws Throwable {__CLR4_4_110201020lc8azw9j.R.globalSliceStart(getClass().getName(),47167);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ah63rx10e7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_110201020lc8azw9j.R.rethrow($CLV_t2$);}finally{__CLR4_4_110201020lc8azw9j.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Constructors.testConstructor_int_int_int_int_nullChronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),47167,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ah63rx10e7() throws Throwable{try{__CLR4_4_110201020lc8azw9j.R.inc(47167);
        __CLR4_4_110201020lc8azw9j.R.inc(47168);TimeOfDay test = new TimeOfDay(10, 20, 30, 40, null);
        __CLR4_4_110201020lc8azw9j.R.inc(47169);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_110201020lc8azw9j.R.inc(47170);assertEquals(10, test.getHourOfDay());
        __CLR4_4_110201020lc8azw9j.R.inc(47171);assertEquals(20, test.getMinuteOfHour());
        __CLR4_4_110201020lc8azw9j.R.inc(47172);assertEquals(30, test.getSecondOfMinute());
        __CLR4_4_110201020lc8azw9j.R.inc(47173);assertEquals(40, test.getMillisOfSecond());
    }finally{__CLR4_4_110201020lc8azw9j.R.flushNeeded();}}

}
