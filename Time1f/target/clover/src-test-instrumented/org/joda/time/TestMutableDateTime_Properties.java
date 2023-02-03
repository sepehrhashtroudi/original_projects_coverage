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

import java.util.Locale;

import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * This class is a Junit unit test for DateTime.
 *
 * @author Stephen Colebourne
 * @author Mike Schrag
 */
public class TestMutableDateTime_Properties extends TestCase {static class __CLR4_4_1tq5tq5lc8azvt9{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672271031490L,8589935092L,39061,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    // Test in 2002/03 as time zones are more well known
    // (before the late 90's they were all over the place)

    //private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    
    long y2002days = 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 
                     366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 
                     365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 +
                     366 + 365;
    long y2003days = 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 
                     366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 
                     365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 +
                     366 + 365 + 365;
    
    // 2002-06-09
    private long TEST_TIME_NOW =
            (y2002days + 31L + 28L + 31L + 30L + 31L + 9L -1L) * DateTimeConstants.MILLIS_PER_DAY;
            
    // 2002-04-05 Fri
    private long TEST_TIME1 =
            (y2002days + 31L + 28L + 31L + 5L -1L) * DateTimeConstants.MILLIS_PER_DAY
            + 12L * DateTimeConstants.MILLIS_PER_HOUR
            + 24L * DateTimeConstants.MILLIS_PER_MINUTE;
        
    // 2003-05-06 Tue
    private long TEST_TIME2 =
            (y2003days + 31L + 28L + 31L + 30L + 6L -1L) * DateTimeConstants.MILLIS_PER_DAY
            + 14L * DateTimeConstants.MILLIS_PER_HOUR
            + 28L * DateTimeConstants.MILLIS_PER_MINUTE;
        
    private DateTimeZone zone = null;
    private Locale locale = null;

    public static void main(String[] args) {try{__CLR4_4_1tq5tq5lc8azvt9.R.inc(38525);
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38526);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1tq5tq5lc8azvt9.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1tq5tq5lc8azvt9.R.inc(38527);
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38528);return new TestSuite(TestMutableDateTime_Properties.class);
    }finally{__CLR4_4_1tq5tq5lc8azvt9.R.flushNeeded();}}

    public TestMutableDateTime_Properties(String name) {
        super(name);__CLR4_4_1tq5tq5lc8azvt9.R.inc(38530);try{__CLR4_4_1tq5tq5lc8azvt9.R.inc(38529);
    }finally{__CLR4_4_1tq5tq5lc8azvt9.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1tq5tq5lc8azvt9.R.inc(38531);
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38532);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38533);zone = DateTimeZone.getDefault();
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38534);locale = Locale.getDefault();
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38535);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38536);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1tq5tq5lc8azvt9.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1tq5tq5lc8azvt9.R.inc(38537);
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38538);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38539);DateTimeZone.setDefault(zone);
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38540);Locale.setDefault(locale);
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38541);zone = null;
    }finally{__CLR4_4_1tq5tq5lc8azvt9.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testTest() {__CLR4_4_1tq5tq5lc8azvt9.R.globalSliceStart(getClass().getName(),38542);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1447pqjtqm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tq5tq5lc8azvt9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tq5tq5lc8azvt9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testTest",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38542,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1447pqjtqm(){try{__CLR4_4_1tq5tq5lc8azvt9.R.inc(38542);
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38543);assertEquals("2002-06-09T00:00:00.000Z", new Instant(TEST_TIME_NOW).toString());
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38544);assertEquals("2002-04-05T12:24:00.000Z", new Instant(TEST_TIME1).toString());
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38545);assertEquals("2003-05-06T14:28:00.000Z", new Instant(TEST_TIME2).toString());
    }finally{__CLR4_4_1tq5tq5lc8azvt9.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testPropertyGetEra() {__CLR4_4_1tq5tq5lc8azvt9.R.globalSliceStart(getClass().getName(),38546);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19gfrqktqq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tq5tq5lc8azvt9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tq5tq5lc8azvt9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertyGetEra",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38546,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19gfrqktqq(){try{__CLR4_4_1tq5tq5lc8azvt9.R.inc(38546);
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38547);MutableDateTime test = new MutableDateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38548);assertSame(test.getChronology().era(), test.era().getField());
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38549);assertEquals("era", test.era().getName());
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38550);assertEquals("Property[era]", test.era().toString());
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38551);assertSame(test, test.era().getMutableDateTime());
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38552);assertEquals(1, test.era().get());
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38553);assertEquals("AD", test.era().getAsText());
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38554);assertEquals("ap. J.-C.", test.era().getAsText(Locale.FRENCH));
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38555);assertEquals("AD", test.era().getAsShortText());
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38556);assertEquals("ap. J.-C.", test.era().getAsShortText(Locale.FRENCH));
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38557);assertEquals(test.getChronology().eras(), test.era().getDurationField());
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38558);assertEquals(null, test.era().getRangeDurationField());
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38559);assertEquals(2, test.era().getMaximumTextLength(null));
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38560);assertEquals(9, test.era().getMaximumTextLength(Locale.FRENCH));
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38561);assertEquals(2, test.era().getMaximumShortTextLength(null));
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38562);assertEquals(9, test.era().getMaximumShortTextLength(Locale.FRENCH));
    }finally{__CLR4_4_1tq5tq5lc8azvt9.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testPropertyGetYearOfEra() {__CLR4_4_1tq5tq5lc8azvt9.R.globalSliceStart(getClass().getName(),38563);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12tr0dktr7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tq5tq5lc8azvt9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tq5tq5lc8azvt9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertyGetYearOfEra",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38563,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12tr0dktr7(){try{__CLR4_4_1tq5tq5lc8azvt9.R.inc(38563);
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38564);MutableDateTime test = new MutableDateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38565);assertSame(test.getChronology().yearOfEra(), test.yearOfEra().getField());
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38566);assertEquals("yearOfEra", test.yearOfEra().getName());
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38567);assertEquals("Property[yearOfEra]", test.yearOfEra().toString());
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38568);assertEquals(2004, test.yearOfEra().get());
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38569);assertEquals("2004", test.yearOfEra().getAsText());
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38570);assertEquals("2004", test.yearOfEra().getAsText(Locale.FRENCH));
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38571);assertEquals("2004", test.yearOfEra().getAsShortText());
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38572);assertEquals("2004", test.yearOfEra().getAsShortText(Locale.FRENCH));
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38573);assertEquals(test.getChronology().years(), test.yearOfEra().getDurationField());
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38574);assertEquals(test.getChronology().eras(), test.yearOfEra().getRangeDurationField());
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38575);assertEquals(9, test.yearOfEra().getMaximumTextLength(null));
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38576);assertEquals(9, test.yearOfEra().getMaximumShortTextLength(null));
    }finally{__CLR4_4_1tq5tq5lc8azvt9.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testPropertyGetCenturyOfEra() {__CLR4_4_1tq5tq5lc8azvt9.R.globalSliceStart(getClass().getName(),38577);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nozc5dtrl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tq5tq5lc8azvt9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tq5tq5lc8azvt9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertyGetCenturyOfEra",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38577,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nozc5dtrl(){try{__CLR4_4_1tq5tq5lc8azvt9.R.inc(38577);
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38578);MutableDateTime test = new MutableDateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38579);assertSame(test.getChronology().centuryOfEra(), test.centuryOfEra().getField());
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38580);assertEquals("centuryOfEra", test.centuryOfEra().getName());
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38581);assertEquals("Property[centuryOfEra]", test.centuryOfEra().toString());
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38582);assertEquals(20, test.centuryOfEra().get());
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38583);assertEquals("20", test.centuryOfEra().getAsText());
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38584);assertEquals("20", test.centuryOfEra().getAsText(Locale.FRENCH));
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38585);assertEquals("20", test.centuryOfEra().getAsShortText());
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38586);assertEquals("20", test.centuryOfEra().getAsShortText(Locale.FRENCH));
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38587);assertEquals(test.getChronology().centuries(), test.centuryOfEra().getDurationField());
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38588);assertEquals(test.getChronology().eras(), test.centuryOfEra().getRangeDurationField());
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38589);assertEquals(7, test.centuryOfEra().getMaximumTextLength(null));
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38590);assertEquals(7, test.centuryOfEra().getMaximumShortTextLength(null));
    }finally{__CLR4_4_1tq5tq5lc8azvt9.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testPropertyGetYearOfCentury() {__CLR4_4_1tq5tq5lc8azvt9.R.globalSliceStart(getClass().getName(),38591);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1m6mt7ctrz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tq5tq5lc8azvt9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tq5tq5lc8azvt9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertyGetYearOfCentury",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38591,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1m6mt7ctrz(){try{__CLR4_4_1tq5tq5lc8azvt9.R.inc(38591);
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38592);MutableDateTime test = new MutableDateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38593);assertSame(test.getChronology().yearOfCentury(), test.yearOfCentury().getField());
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38594);assertEquals("yearOfCentury", test.yearOfCentury().getName());
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38595);assertEquals("Property[yearOfCentury]", test.yearOfCentury().toString());
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38596);assertEquals(4, test.yearOfCentury().get());
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38597);assertEquals("4", test.yearOfCentury().getAsText());
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38598);assertEquals("4", test.yearOfCentury().getAsText(Locale.FRENCH));
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38599);assertEquals("4", test.yearOfCentury().getAsShortText());
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38600);assertEquals("4", test.yearOfCentury().getAsShortText(Locale.FRENCH));
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38601);assertEquals(test.getChronology().years(), test.yearOfCentury().getDurationField());
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38602);assertEquals(test.getChronology().centuries(), test.yearOfCentury().getRangeDurationField());
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38603);assertEquals(2, test.yearOfCentury().getMaximumTextLength(null));
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38604);assertEquals(2, test.yearOfCentury().getMaximumShortTextLength(null));
    }finally{__CLR4_4_1tq5tq5lc8azvt9.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testPropertyGetWeekyear() {__CLR4_4_1tq5tq5lc8azvt9.R.globalSliceStart(getClass().getName(),38605);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1izv1ndtsd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tq5tq5lc8azvt9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tq5tq5lc8azvt9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertyGetWeekyear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38605,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1izv1ndtsd(){try{__CLR4_4_1tq5tq5lc8azvt9.R.inc(38605);
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38606);MutableDateTime test = new MutableDateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38607);assertSame(test.getChronology().weekyear(), test.weekyear().getField());
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38608);assertEquals("weekyear", test.weekyear().getName());
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38609);assertEquals("Property[weekyear]", test.weekyear().toString());
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38610);assertEquals(2004, test.weekyear().get());
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38611);assertEquals("2004", test.weekyear().getAsText());
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38612);assertEquals("2004", test.weekyear().getAsText(Locale.FRENCH));
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38613);assertEquals("2004", test.weekyear().getAsShortText());
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38614);assertEquals("2004", test.weekyear().getAsShortText(Locale.FRENCH));
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38615);assertEquals(test.getChronology().weekyears(), test.weekyear().getDurationField());
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38616);assertEquals(null, test.weekyear().getRangeDurationField());
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38617);assertEquals(9, test.weekyear().getMaximumTextLength(null));
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38618);assertEquals(9, test.weekyear().getMaximumShortTextLength(null));
    }finally{__CLR4_4_1tq5tq5lc8azvt9.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testPropertyGetYear() {__CLR4_4_1tq5tq5lc8azvt9.R.globalSliceStart(getClass().getName(),38619);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tgqcqbtsr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tq5tq5lc8azvt9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tq5tq5lc8azvt9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertyGetYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38619,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tgqcqbtsr(){try{__CLR4_4_1tq5tq5lc8azvt9.R.inc(38619);
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38620);MutableDateTime test = new MutableDateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38621);assertSame(test.getChronology().year(), test.year().getField());
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38622);assertEquals("year", test.year().getName());
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38623);assertEquals("Property[year]", test.year().toString());
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38624);assertEquals(2004, test.year().get());
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38625);assertEquals("2004", test.year().getAsText());
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38626);assertEquals("2004", test.year().getAsText(Locale.FRENCH));
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38627);assertEquals("2004", test.year().getAsShortText());
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38628);assertEquals("2004", test.year().getAsShortText(Locale.FRENCH));
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38629);assertEquals(test.getChronology().years(), test.year().getDurationField());
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38630);assertEquals(null, test.year().getRangeDurationField());
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38631);assertEquals(9, test.year().getMaximumTextLength(null));
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38632);assertEquals(9, test.year().getMaximumShortTextLength(null));
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38633);assertEquals(-292275054, test.year().getMinimumValue());
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38634);assertEquals(-292275054, test.year().getMinimumValueOverall());
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38635);assertEquals(292278993, test.year().getMaximumValue());
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38636);assertEquals(292278993, test.year().getMaximumValueOverall());
    }finally{__CLR4_4_1tq5tq5lc8azvt9.R.flushNeeded();}}

    public void testPropertyAddYear() {__CLR4_4_1tq5tq5lc8azvt9.R.globalSliceStart(getClass().getName(),38637);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1c0tefytt9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tq5tq5lc8azvt9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tq5tq5lc8azvt9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertyAddYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38637,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1c0tefytt9(){try{__CLR4_4_1tq5tq5lc8azvt9.R.inc(38637);
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38638);MutableDateTime test = new MutableDateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38639);test.year().add(9);
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38640);assertEquals("2013-06-09T00:00:00.000+01:00", test.toString());
    }finally{__CLR4_4_1tq5tq5lc8azvt9.R.flushNeeded();}}

    public void testPropertyAddWrapFieldYear() {__CLR4_4_1tq5tq5lc8azvt9.R.globalSliceStart(getClass().getName(),38641);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qjgig6ttd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tq5tq5lc8azvt9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tq5tq5lc8azvt9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertyAddWrapFieldYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38641,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qjgig6ttd(){try{__CLR4_4_1tq5tq5lc8azvt9.R.inc(38641);
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38642);MutableDateTime test = new MutableDateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38643);test.year().addWrapField(9);
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38644);assertEquals("2013-06-09T00:00:00.000+01:00", test.toString());
    }finally{__CLR4_4_1tq5tq5lc8azvt9.R.flushNeeded();}}

    public void testPropertySetYear() {__CLR4_4_1tq5tq5lc8azvt9.R.globalSliceStart(getClass().getName(),38645);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1b9ziwxtth();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tq5tq5lc8azvt9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tq5tq5lc8azvt9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertySetYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38645,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1b9ziwxtth(){try{__CLR4_4_1tq5tq5lc8azvt9.R.inc(38645);
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38646);MutableDateTime test = new MutableDateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38647);test.year().set(1960);
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38648);assertEquals("1960-06-09T00:00:00.000+01:00", test.toString());
    }finally{__CLR4_4_1tq5tq5lc8azvt9.R.flushNeeded();}}

    public void testPropertySetTextYear() {__CLR4_4_1tq5tq5lc8azvt9.R.globalSliceStart(getClass().getName(),38649);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11qaw4sttl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tq5tq5lc8azvt9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tq5tq5lc8azvt9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertySetTextYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38649,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11qaw4sttl(){try{__CLR4_4_1tq5tq5lc8azvt9.R.inc(38649);
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38650);MutableDateTime test = new MutableDateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38651);test.year().set("1960");
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38652);assertEquals("1960-06-09T00:00:00.000+01:00", test.toString());
    }finally{__CLR4_4_1tq5tq5lc8azvt9.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testPropertyGetMonthOfYear() {__CLR4_4_1tq5tq5lc8azvt9.R.globalSliceStart(getClass().getName(),38653);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_140q40kttp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tq5tq5lc8azvt9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tq5tq5lc8azvt9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertyGetMonthOfYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38653,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_140q40kttp(){try{__CLR4_4_1tq5tq5lc8azvt9.R.inc(38653);
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38654);MutableDateTime test = new MutableDateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38655);assertSame(test.getChronology().monthOfYear(), test.monthOfYear().getField());
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38656);assertEquals("monthOfYear", test.monthOfYear().getName());
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38657);assertEquals("Property[monthOfYear]", test.monthOfYear().toString());
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38658);assertEquals(6, test.monthOfYear().get());
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38659);assertEquals("June", test.monthOfYear().getAsText());
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38660);assertEquals("juin", test.monthOfYear().getAsText(Locale.FRENCH));
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38661);assertEquals("Jun", test.monthOfYear().getAsShortText());
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38662);assertEquals("juin", test.monthOfYear().getAsShortText(Locale.FRENCH));
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38663);assertEquals(test.getChronology().months(), test.monthOfYear().getDurationField());
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38664);assertEquals(test.getChronology().years(), test.monthOfYear().getRangeDurationField());
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38665);assertEquals(9, test.monthOfYear().getMaximumTextLength(null));
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38666);assertEquals(3, test.monthOfYear().getMaximumShortTextLength(null));
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38667);test = new MutableDateTime(2004, 7, 9, 0, 0, 0, 0);
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38668);assertEquals("juillet", test.monthOfYear().getAsText(Locale.FRENCH));
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38669);assertEquals("juil.", test.monthOfYear().getAsShortText(Locale.FRENCH));
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38670);assertEquals(1, test.monthOfYear().getMinimumValue());
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38671);assertEquals(1, test.monthOfYear().getMinimumValueOverall());
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38672);assertEquals(12, test.monthOfYear().getMaximumValue());
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38673);assertEquals(12, test.monthOfYear().getMaximumValueOverall());
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38674);assertEquals(1, test.monthOfYear().getMinimumValue());
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38675);assertEquals(1, test.monthOfYear().getMinimumValueOverall());
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38676);assertEquals(12, test.monthOfYear().getMaximumValue());
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38677);assertEquals(12, test.monthOfYear().getMaximumValueOverall());
    }finally{__CLR4_4_1tq5tq5lc8azvt9.R.flushNeeded();}}

    public void testPropertyAddMonthOfYear() {__CLR4_4_1tq5tq5lc8azvt9.R.globalSliceStart(getClass().getName(),38678);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cfd7jtue();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tq5tq5lc8azvt9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tq5tq5lc8azvt9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertyAddMonthOfYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38678,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cfd7jtue(){try{__CLR4_4_1tq5tq5lc8azvt9.R.inc(38678);
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38679);MutableDateTime test = new MutableDateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38680);test.monthOfYear().add(6);
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38681);assertEquals("2004-12-09T00:00:00.000Z", test.toString());
    }finally{__CLR4_4_1tq5tq5lc8azvt9.R.flushNeeded();}}

    public void testPropertyAddWrapFieldMonthOfYear() {__CLR4_4_1tq5tq5lc8azvt9.R.globalSliceStart(getClass().getName(),38682);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1phvusltui();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tq5tq5lc8azvt9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tq5tq5lc8azvt9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertyAddWrapFieldMonthOfYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38682,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1phvusltui(){try{__CLR4_4_1tq5tq5lc8azvt9.R.inc(38682);
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38683);MutableDateTime test = new MutableDateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38684);test.monthOfYear().addWrapField(8);
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38685);assertEquals("2004-02-09T00:00:00.000Z", test.toString());
    }finally{__CLR4_4_1tq5tq5lc8azvt9.R.flushNeeded();}}

    public void testPropertySetMonthOfYear() {__CLR4_4_1tq5tq5lc8azvt9.R.globalSliceStart(getClass().getName(),38686);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1x2imu8tum();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tq5tq5lc8azvt9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tq5tq5lc8azvt9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertySetMonthOfYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38686,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1x2imu8tum(){try{__CLR4_4_1tq5tq5lc8azvt9.R.inc(38686);
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38687);MutableDateTime test = new MutableDateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38688);test.monthOfYear().set(12);
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38689);assertEquals("2004-12-09T00:00:00.000Z", test.toString());
    }finally{__CLR4_4_1tq5tq5lc8azvt9.R.flushNeeded();}}

    public void testPropertySetTextMonthOfYear() {__CLR4_4_1tq5tq5lc8azvt9.R.globalSliceStart(getClass().getName(),38690);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kzotlftuq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tq5tq5lc8azvt9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tq5tq5lc8azvt9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertySetTextMonthOfYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38690,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kzotlftuq(){try{__CLR4_4_1tq5tq5lc8azvt9.R.inc(38690);
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38691);MutableDateTime test = new MutableDateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38692);test.monthOfYear().set("12");
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38693);assertEquals("2004-12-09T00:00:00.000Z", test.toString());
        
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38694);test = new MutableDateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38695);test.monthOfYear().set("December");
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38696);assertEquals("2004-12-09T00:00:00.000Z", test.toString());
        
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38697);test = new MutableDateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38698);test.monthOfYear().set("Dec");
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38699);assertEquals("2004-12-09T00:00:00.000Z", test.toString());
    }finally{__CLR4_4_1tq5tq5lc8azvt9.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testPropertyGetDayOfMonth() {__CLR4_4_1tq5tq5lc8azvt9.R.globalSliceStart(getClass().getName(),38700);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1198qu5tv0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tq5tq5lc8azvt9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tq5tq5lc8azvt9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertyGetDayOfMonth",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38700,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1198qu5tv0(){try{__CLR4_4_1tq5tq5lc8azvt9.R.inc(38700);
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38701);MutableDateTime test = new MutableDateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38702);assertSame(test.getChronology().dayOfMonth(), test.dayOfMonth().getField());
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38703);assertEquals("dayOfMonth", test.dayOfMonth().getName());
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38704);assertEquals("Property[dayOfMonth]", test.dayOfMonth().toString());
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38705);assertEquals(9, test.dayOfMonth().get());
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38706);assertEquals("9", test.dayOfMonth().getAsText());
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38707);assertEquals("9", test.dayOfMonth().getAsText(Locale.FRENCH));
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38708);assertEquals("9", test.dayOfMonth().getAsShortText());
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38709);assertEquals("9", test.dayOfMonth().getAsShortText(Locale.FRENCH));
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38710);assertEquals(test.getChronology().days(), test.dayOfMonth().getDurationField());
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38711);assertEquals(test.getChronology().months(), test.dayOfMonth().getRangeDurationField());
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38712);assertEquals(2, test.dayOfMonth().getMaximumTextLength(null));
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38713);assertEquals(2, test.dayOfMonth().getMaximumShortTextLength(null));
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38714);assertEquals(1, test.dayOfMonth().getMinimumValue());
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38715);assertEquals(1, test.dayOfMonth().getMinimumValueOverall());
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38716);assertEquals(30, test.dayOfMonth().getMaximumValue());
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38717);assertEquals(31, test.dayOfMonth().getMaximumValueOverall());
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38718);assertEquals(false, test.dayOfMonth().isLeap());
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38719);assertEquals(0, test.dayOfMonth().getLeapAmount());
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38720);assertEquals(null, test.dayOfMonth().getLeapDurationField());
    }finally{__CLR4_4_1tq5tq5lc8azvt9.R.flushNeeded();}}

    public void testPropertyAddDayOfMonth() {__CLR4_4_1tq5tq5lc8azvt9.R.globalSliceStart(getClass().getName(),38721);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1o1ulyqtvl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tq5tq5lc8azvt9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tq5tq5lc8azvt9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertyAddDayOfMonth",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38721,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1o1ulyqtvl(){try{__CLR4_4_1tq5tq5lc8azvt9.R.inc(38721);
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38722);MutableDateTime test = new MutableDateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38723);test.dayOfMonth().add(9);
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38724);assertEquals("2004-06-18T00:00:00.000+01:00", test.toString());
    }finally{__CLR4_4_1tq5tq5lc8azvt9.R.flushNeeded();}}

    public void testPropertyAddWrapFieldDayOfMonth() {__CLR4_4_1tq5tq5lc8azvt9.R.globalSliceStart(getClass().getName(),38725);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dfyjyitvp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tq5tq5lc8azvt9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tq5tq5lc8azvt9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertyAddWrapFieldDayOfMonth",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38725,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dfyjyitvp(){try{__CLR4_4_1tq5tq5lc8azvt9.R.inc(38725);
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38726);MutableDateTime test = new MutableDateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38727);test.dayOfMonth().addWrapField(22);
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38728);assertEquals("2004-06-01T00:00:00.000+01:00", test.toString());
    }finally{__CLR4_4_1tq5tq5lc8azvt9.R.flushNeeded();}}

    public void testPropertySetDayOfMonth() {__CLR4_4_1tq5tq5lc8azvt9.R.globalSliceStart(getClass().getName(),38729);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mz1n4htvt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tq5tq5lc8azvt9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tq5tq5lc8azvt9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertySetDayOfMonth",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38729,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mz1n4htvt(){try{__CLR4_4_1tq5tq5lc8azvt9.R.inc(38729);
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38730);MutableDateTime test = new MutableDateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38731);test.dayOfMonth().set(12);
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38732);assertEquals("2004-06-12T00:00:00.000+01:00", test.toString());
    }finally{__CLR4_4_1tq5tq5lc8azvt9.R.flushNeeded();}}

    public void testPropertySetTextDayOfMonth() {__CLR4_4_1tq5tq5lc8azvt9.R.globalSliceStart(getClass().getName(),38733);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_144rzx8tvx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tq5tq5lc8azvt9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tq5tq5lc8azvt9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertySetTextDayOfMonth",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38733,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_144rzx8tvx(){try{__CLR4_4_1tq5tq5lc8azvt9.R.inc(38733);
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38734);MutableDateTime test = new MutableDateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38735);test.dayOfMonth().set("12");
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38736);assertEquals("2004-06-12T00:00:00.000+01:00", test.toString());
    }finally{__CLR4_4_1tq5tq5lc8azvt9.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testPropertyGetDayOfYear() {__CLR4_4_1tq5tq5lc8azvt9.R.globalSliceStart(getClass().getName(),38737);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fvk08tw1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tq5tq5lc8azvt9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tq5tq5lc8azvt9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertyGetDayOfYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38737,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fvk08tw1(){try{__CLR4_4_1tq5tq5lc8azvt9.R.inc(38737);
        // 31+29+31+30+31+9 = 161
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38738);MutableDateTime test = new MutableDateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38739);assertSame(test.getChronology().dayOfYear(), test.dayOfYear().getField());
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38740);assertEquals("dayOfYear", test.dayOfYear().getName());
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38741);assertEquals("Property[dayOfYear]", test.dayOfYear().toString());
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38742);assertEquals(161, test.dayOfYear().get());
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38743);assertEquals("161", test.dayOfYear().getAsText());
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38744);assertEquals("161", test.dayOfYear().getAsText(Locale.FRENCH));
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38745);assertEquals("161", test.dayOfYear().getAsShortText());
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38746);assertEquals("161", test.dayOfYear().getAsShortText(Locale.FRENCH));
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38747);assertEquals(test.getChronology().days(), test.dayOfYear().getDurationField());
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38748);assertEquals(test.getChronology().years(), test.dayOfYear().getRangeDurationField());
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38749);assertEquals(3, test.dayOfYear().getMaximumTextLength(null));
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38750);assertEquals(3, test.dayOfYear().getMaximumShortTextLength(null));
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38751);assertEquals(false, test.dayOfYear().isLeap());
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38752);assertEquals(0, test.dayOfYear().getLeapAmount());
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38753);assertEquals(null, test.dayOfYear().getLeapDurationField());
    }finally{__CLR4_4_1tq5tq5lc8azvt9.R.flushNeeded();}}

    public void testPropertyAddDayOfYear() {__CLR4_4_1tq5tq5lc8azvt9.R.globalSliceStart(getClass().getName(),38754);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14adoxptwi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tq5tq5lc8azvt9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tq5tq5lc8azvt9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertyAddDayOfYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38754,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14adoxptwi(){try{__CLR4_4_1tq5tq5lc8azvt9.R.inc(38754);
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38755);MutableDateTime test = new MutableDateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38756);test.dayOfYear().add(9);
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38757);assertEquals("2004-06-18T00:00:00.000+01:00", test.toString());
    }finally{__CLR4_4_1tq5tq5lc8azvt9.R.flushNeeded();}}

    public void testPropertyAddWrapFieldDayOfYear() {__CLR4_4_1tq5tq5lc8azvt9.R.globalSliceStart(getClass().getName(),38758);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_137fnwhtwm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tq5tq5lc8azvt9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tq5tq5lc8azvt9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertyAddWrapFieldDayOfYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38758,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_137fnwhtwm(){try{__CLR4_4_1tq5tq5lc8azvt9.R.inc(38758);
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38759);MutableDateTime test = new MutableDateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38760);test.dayOfYear().addWrapField(206);
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38761);assertEquals("2004-01-01T00:00:00.000Z", test.toString());
    }finally{__CLR4_4_1tq5tq5lc8azvt9.R.flushNeeded();}}

    public void testPropertySetDayOfYear() {__CLR4_4_1tq5tq5lc8azvt9.R.globalSliceStart(getClass().getName(),38762);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tizt30twq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tq5tq5lc8azvt9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tq5tq5lc8azvt9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertySetDayOfYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38762,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tizt30twq(){try{__CLR4_4_1tq5tq5lc8azvt9.R.inc(38762);
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38763);MutableDateTime test = new MutableDateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38764);test.dayOfYear().set(12);
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38765);assertEquals("2004-01-12T00:00:00.000Z", test.toString());
    }finally{__CLR4_4_1tq5tq5lc8azvt9.R.flushNeeded();}}

    public void testPropertySetTextDayOfYear() {__CLR4_4_1tq5tq5lc8azvt9.R.globalSliceStart(getClass().getName(),38766);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hprj4htwu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tq5tq5lc8azvt9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tq5tq5lc8azvt9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertySetTextDayOfYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38766,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hprj4htwu(){try{__CLR4_4_1tq5tq5lc8azvt9.R.inc(38766);
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38767);MutableDateTime test = new MutableDateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38768);test.dayOfYear().set("12");
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38769);assertEquals("2004-01-12T00:00:00.000Z", test.toString());
    }finally{__CLR4_4_1tq5tq5lc8azvt9.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testPropertyGetWeekOfWeekyear() {__CLR4_4_1tq5tq5lc8azvt9.R.globalSliceStart(getClass().getName(),38770);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1oty2c2twy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tq5tq5lc8azvt9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tq5tq5lc8azvt9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertyGetWeekOfWeekyear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38770,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1oty2c2twy(){try{__CLR4_4_1tq5tq5lc8azvt9.R.inc(38770);
        // 2002-01-01 = Thu
        // 2002-12-31 = Thu (+364 days)
        // 2003-12-30 = Thu (+364 days)
        // 2004-01-03 = Mon             W1
        // 2004-01-31 = Mon (+28 days)  W5
        // 2004-02-28 = Mon (+28 days)  W9
        // 2004-03-27 = Mon (+28 days)  W13
        // 2004-04-24 = Mon (+28 days)  W17
        // 2004-05-23 = Mon (+28 days)  W21
        // 2004-06-05 = Mon (+14 days)  W23
        // 2004-06-09 = Fri
        // 2004-12-25 = Mon             W52
        // 2005-01-01 = Mon             W1
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38771);MutableDateTime test = new MutableDateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38772);assertSame(test.getChronology().weekOfWeekyear(), test.weekOfWeekyear().getField());
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38773);assertEquals("weekOfWeekyear", test.weekOfWeekyear().getName());
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38774);assertEquals("Property[weekOfWeekyear]", test.weekOfWeekyear().toString());
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38775);assertEquals(24, test.weekOfWeekyear().get());
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38776);assertEquals("24", test.weekOfWeekyear().getAsText());
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38777);assertEquals("24", test.weekOfWeekyear().getAsText(Locale.FRENCH));
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38778);assertEquals("24", test.weekOfWeekyear().getAsShortText());
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38779);assertEquals("24", test.weekOfWeekyear().getAsShortText(Locale.FRENCH));
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38780);assertEquals(test.getChronology().weeks(), test.weekOfWeekyear().getDurationField());
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38781);assertEquals(test.getChronology().weekyears(), test.weekOfWeekyear().getRangeDurationField());
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38782);assertEquals(2, test.weekOfWeekyear().getMaximumTextLength(null));
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38783);assertEquals(2, test.weekOfWeekyear().getMaximumShortTextLength(null));
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38784);assertEquals(false, test.weekOfWeekyear().isLeap());
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38785);assertEquals(0, test.weekOfWeekyear().getLeapAmount());
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38786);assertEquals(null, test.weekOfWeekyear().getLeapDurationField());
    }finally{__CLR4_4_1tq5tq5lc8azvt9.R.flushNeeded();}}

    public void testPropertyAddWeekOfWeekyear() {__CLR4_4_1tq5tq5lc8azvt9.R.globalSliceStart(getClass().getName(),38787);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1o69kartxf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tq5tq5lc8azvt9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tq5tq5lc8azvt9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertyAddWeekOfWeekyear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38787,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1o69kartxf(){try{__CLR4_4_1tq5tq5lc8azvt9.R.inc(38787);
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38788);MutableDateTime test = new MutableDateTime(2004, 6, 7, 0, 0, 0, 0);
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38789);test.weekOfWeekyear().add(1);
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38790);assertEquals("2004-06-14T00:00:00.000+01:00", test.toString());
    }finally{__CLR4_4_1tq5tq5lc8azvt9.R.flushNeeded();}}

    public void testPropertyAddWrapFieldWeekOfWeekyear() {__CLR4_4_1tq5tq5lc8azvt9.R.globalSliceStart(getClass().getName(),38791);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11nrj95txj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tq5tq5lc8azvt9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tq5tq5lc8azvt9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertyAddWrapFieldWeekOfWeekyear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38791,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11nrj95txj(){try{__CLR4_4_1tq5tq5lc8azvt9.R.inc(38791);
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38792);MutableDateTime test = new MutableDateTime(2004, 6, 7, 0, 0, 0, 0);
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38793);test.weekOfWeekyear().addWrapField(30);
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38794);assertEquals("2003-12-29T00:00:00.000Z", test.toString());
    }finally{__CLR4_4_1tq5tq5lc8azvt9.R.flushNeeded();}}

    public void testPropertySetWeekOfWeekyear() {__CLR4_4_1tq5tq5lc8azvt9.R.globalSliceStart(getClass().getName(),38795);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1iobpwetxn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tq5tq5lc8azvt9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tq5tq5lc8azvt9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertySetWeekOfWeekyear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38795,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1iobpwetxn(){try{__CLR4_4_1tq5tq5lc8azvt9.R.inc(38795);
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38796);MutableDateTime test = new MutableDateTime(2004, 6, 7, 0, 0, 0, 0);
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38797);test.weekOfWeekyear().set(4);
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38798);assertEquals("2004-01-19T00:00:00.000Z", test.toString());
    }finally{__CLR4_4_1tq5tq5lc8azvt9.R.flushNeeded();}}

    public void testPropertySetTextWeekOfWeekyear() {__CLR4_4_1tq5tq5lc8azvt9.R.globalSliceStart(getClass().getName(),38799);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1swdyyztxr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tq5tq5lc8azvt9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tq5tq5lc8azvt9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertySetTextWeekOfWeekyear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38799,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1swdyyztxr(){try{__CLR4_4_1tq5tq5lc8azvt9.R.inc(38799);
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38800);MutableDateTime test = new MutableDateTime(2004, 6, 7, 0, 0, 0, 0);
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38801);test.weekOfWeekyear().set("4");
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38802);assertEquals("2004-01-19T00:00:00.000Z", test.toString());
    }finally{__CLR4_4_1tq5tq5lc8azvt9.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testPropertyGetDayOfWeek() {__CLR4_4_1tq5tq5lc8azvt9.R.globalSliceStart(getClass().getName(),38803);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ftu28vtxv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tq5tq5lc8azvt9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tq5tq5lc8azvt9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertyGetDayOfWeek",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38803,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ftu28vtxv(){try{__CLR4_4_1tq5tq5lc8azvt9.R.inc(38803);
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38804);MutableDateTime test = new MutableDateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38805);assertSame(test.getChronology().dayOfWeek(), test.dayOfWeek().getField());
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38806);assertEquals("dayOfWeek", test.dayOfWeek().getName());
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38807);assertEquals("Property[dayOfWeek]", test.dayOfWeek().toString());
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38808);assertEquals(3, test.dayOfWeek().get());
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38809);assertEquals("Wednesday", test.dayOfWeek().getAsText());
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38810);assertEquals("mercredi", test.dayOfWeek().getAsText(Locale.FRENCH));
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38811);assertEquals("Wed", test.dayOfWeek().getAsShortText());
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38812);assertEquals("mer.", test.dayOfWeek().getAsShortText(Locale.FRENCH));
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38813);assertEquals(test.getChronology().days(), test.dayOfWeek().getDurationField());
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38814);assertEquals(test.getChronology().weeks(), test.dayOfWeek().getRangeDurationField());
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38815);assertEquals(9, test.dayOfWeek().getMaximumTextLength(null));
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38816);assertEquals(8, test.dayOfWeek().getMaximumTextLength(Locale.FRENCH));
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38817);assertEquals(3, test.dayOfWeek().getMaximumShortTextLength(null));
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38818);assertEquals(4, test.dayOfWeek().getMaximumShortTextLength(Locale.FRENCH));
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38819);assertEquals(1, test.dayOfWeek().getMinimumValue());
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38820);assertEquals(1, test.dayOfWeek().getMinimumValueOverall());
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38821);assertEquals(7, test.dayOfWeek().getMaximumValue());
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38822);assertEquals(7, test.dayOfWeek().getMaximumValueOverall());
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38823);assertEquals(false, test.dayOfWeek().isLeap());
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38824);assertEquals(0, test.dayOfWeek().getLeapAmount());
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38825);assertEquals(null, test.dayOfWeek().getLeapDurationField());
    }finally{__CLR4_4_1tq5tq5lc8azvt9.R.flushNeeded();}}

    public void testPropertyAddDayOfWeek() {__CLR4_4_1tq5tq5lc8azvt9.R.globalSliceStart(getClass().getName(),38826);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1joc76ctyi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tq5tq5lc8azvt9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tq5tq5lc8azvt9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertyAddDayOfWeek",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38826,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1joc76ctyi(){try{__CLR4_4_1tq5tq5lc8azvt9.R.inc(38826);
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38827);MutableDateTime test = new MutableDateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38828);test.dayOfWeek().add(1);
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38829);assertEquals("2004-06-10T00:00:00.000+01:00", test.toString());
    }finally{__CLR4_4_1tq5tq5lc8azvt9.R.flushNeeded();}}

    public void testPropertyAddLongDayOfWeek() {__CLR4_4_1tq5tq5lc8azvt9.R.globalSliceStart(getClass().getName(),38830);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_166ne0otym();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tq5tq5lc8azvt9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tq5tq5lc8azvt9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertyAddLongDayOfWeek",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38830,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_166ne0otym(){try{__CLR4_4_1tq5tq5lc8azvt9.R.inc(38830);
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38831);MutableDateTime test = new MutableDateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38832);test.dayOfWeek().add(1L);
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38833);assertEquals("2004-06-10T00:00:00.000+01:00", test.toString());
    }finally{__CLR4_4_1tq5tq5lc8azvt9.R.flushNeeded();}}

    public void testPropertyAddWrapFieldDayOfWeek() {__CLR4_4_1tq5tq5lc8azvt9.R.globalSliceStart(getClass().getName(),38834);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ile654tyq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tq5tq5lc8azvt9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tq5tq5lc8azvt9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertyAddWrapFieldDayOfWeek",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38834,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ile654tyq(){try{__CLR4_4_1tq5tq5lc8azvt9.R.inc(38834);
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38835);MutableDateTime test = new MutableDateTime(2004, 6, 9, 0, 0, 0, 0);  // Wed
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38836);test.dayOfWeek().addWrapField(5);
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38837);assertEquals("2004-06-07T00:00:00.000+01:00", test.toString());
    }finally{__CLR4_4_1tq5tq5lc8azvt9.R.flushNeeded();}}

    public void testPropertySetDayOfWeek() {__CLR4_4_1tq5tq5lc8azvt9.R.globalSliceStart(getClass().getName(),38838);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q45qnhtyu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tq5tq5lc8azvt9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tq5tq5lc8azvt9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertySetDayOfWeek",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38838,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q45qnhtyu(){try{__CLR4_4_1tq5tq5lc8azvt9.R.inc(38838);
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38839);MutableDateTime test = new MutableDateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38840);test.dayOfWeek().set(4);
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38841);assertEquals("2004-06-10T00:00:00.000+01:00", test.toString());
    }finally{__CLR4_4_1tq5tq5lc8azvt9.R.flushNeeded();}}

    public void testPropertySetTextDayOfWeek() {__CLR4_4_1tq5tq5lc8azvt9.R.globalSliceStart(getClass().getName(),38842);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12bt0vutyy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tq5tq5lc8azvt9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tq5tq5lc8azvt9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertySetTextDayOfWeek",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38842,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12bt0vutyy(){try{__CLR4_4_1tq5tq5lc8azvt9.R.inc(38842);
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38843);MutableDateTime test = new MutableDateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38844);test.dayOfWeek().set("4");
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38845);assertEquals("2004-06-10T00:00:00.000+01:00", test.toString());
        
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38846);test = new MutableDateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38847);test.dayOfWeek().set("Mon");
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38848);assertEquals("2004-06-07T00:00:00.000+01:00", test.toString());
        
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38849);test = new MutableDateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38850);test.dayOfWeek().set("Tuesday");
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38851);assertEquals("2004-06-08T00:00:00.000+01:00", test.toString());
        
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38852);test = new MutableDateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38853);test.dayOfWeek().set("lundi", Locale.FRENCH);
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38854);assertEquals("2004-06-07T00:00:00.000+01:00", test.toString());
    }finally{__CLR4_4_1tq5tq5lc8azvt9.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testPropertyGetHourOfDay() {__CLR4_4_1tq5tq5lc8azvt9.R.globalSliceStart(getClass().getName(),38855);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1i5x06xtzb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tq5tq5lc8azvt9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tq5tq5lc8azvt9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertyGetHourOfDay",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38855,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1i5x06xtzb(){try{__CLR4_4_1tq5tq5lc8azvt9.R.inc(38855);
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38856);MutableDateTime test = new MutableDateTime(2004, 6, 9, 13, 23, 43, 53);
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38857);assertSame(test.getChronology().hourOfDay(), test.hourOfDay().getField());
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38858);assertEquals("hourOfDay", test.hourOfDay().getName());
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38859);assertEquals("Property[hourOfDay]", test.hourOfDay().toString());
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38860);assertEquals(13, test.hourOfDay().get());
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38861);assertEquals("13", test.hourOfDay().getAsText());
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38862);assertEquals("13", test.hourOfDay().getAsText(Locale.FRENCH));
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38863);assertEquals("13", test.hourOfDay().getAsShortText());
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38864);assertEquals("13", test.hourOfDay().getAsShortText(Locale.FRENCH));
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38865);assertEquals(test.getChronology().hours(), test.hourOfDay().getDurationField());
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38866);assertEquals(test.getChronology().days(), test.hourOfDay().getRangeDurationField());
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38867);assertEquals(2, test.hourOfDay().getMaximumTextLength(null));
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38868);assertEquals(2, test.hourOfDay().getMaximumShortTextLength(null));
    }finally{__CLR4_4_1tq5tq5lc8azvt9.R.flushNeeded();}}

    public void testPropertyRoundFloorHourOfDay() {__CLR4_4_1tq5tq5lc8azvt9.R.globalSliceStart(getClass().getName(),38869);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rs37cttzp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tq5tq5lc8azvt9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tq5tq5lc8azvt9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertyRoundFloorHourOfDay",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38869,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rs37cttzp(){try{__CLR4_4_1tq5tq5lc8azvt9.R.inc(38869);
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38870);MutableDateTime test = new MutableDateTime(2004, 6, 9, 13, 30, 0, 0);
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38871);test.hourOfDay().roundFloor();
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38872);assertEquals("2004-06-09T13:00:00.000+01:00", test.toString());
    }finally{__CLR4_4_1tq5tq5lc8azvt9.R.flushNeeded();}}

    public void testPropertyRoundCeilingHourOfDay() {__CLR4_4_1tq5tq5lc8azvt9.R.globalSliceStart(getClass().getName(),38873);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1r72lgutzt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tq5tq5lc8azvt9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tq5tq5lc8azvt9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertyRoundCeilingHourOfDay",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38873,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1r72lgutzt(){try{__CLR4_4_1tq5tq5lc8azvt9.R.inc(38873);
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38874);MutableDateTime test = new MutableDateTime(2004, 6, 9, 13, 30, 0, 0);
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38875);test.hourOfDay().roundCeiling();
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38876);assertEquals("2004-06-09T14:00:00.000+01:00", test.toString());
    }finally{__CLR4_4_1tq5tq5lc8azvt9.R.flushNeeded();}}

    public void testPropertyRoundHalfFloorHourOfDay() {__CLR4_4_1tq5tq5lc8azvt9.R.globalSliceStart(getClass().getName(),38877);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pcihmytzx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tq5tq5lc8azvt9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tq5tq5lc8azvt9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertyRoundHalfFloorHourOfDay",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38877,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pcihmytzx(){try{__CLR4_4_1tq5tq5lc8azvt9.R.inc(38877);
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38878);MutableDateTime test = new MutableDateTime(2004, 6, 9, 13, 30, 0, 0);
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38879);test.hourOfDay().roundHalfFloor();
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38880);assertEquals("2004-06-09T13:00:00.000+01:00", test.toString());
        
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38881);test = new MutableDateTime(2004, 6, 9, 13, 30, 0, 1);
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38882);test.hourOfDay().roundHalfFloor();
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38883);assertEquals("2004-06-09T14:00:00.000+01:00", test.toString());
        
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38884);test = new MutableDateTime(2004, 6, 9, 13, 29, 59, 999);
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38885);test.hourOfDay().roundHalfFloor();
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38886);assertEquals("2004-06-09T13:00:00.000+01:00", test.toString());
    }finally{__CLR4_4_1tq5tq5lc8azvt9.R.flushNeeded();}}

    public void testPropertyRoundHalfCeilingHourOfDay() {__CLR4_4_1tq5tq5lc8azvt9.R.globalSliceStart(getClass().getName(),38887);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xftvazu07();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tq5tq5lc8azvt9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tq5tq5lc8azvt9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertyRoundHalfCeilingHourOfDay",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38887,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xftvazu07(){try{__CLR4_4_1tq5tq5lc8azvt9.R.inc(38887);
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38888);MutableDateTime test = new MutableDateTime(2004, 6, 9, 13, 30, 0, 0);
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38889);test.hourOfDay().roundHalfCeiling();
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38890);assertEquals("2004-06-09T14:00:00.000+01:00", test.toString());
        
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38891);test = new MutableDateTime(2004, 6, 9, 13, 30, 0, 1);
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38892);test.hourOfDay().roundHalfCeiling();
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38893);assertEquals("2004-06-09T14:00:00.000+01:00", test.toString());
        
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38894);test = new MutableDateTime(2004, 6, 9, 13, 29, 59, 999);
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38895);test.hourOfDay().roundHalfCeiling();
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38896);assertEquals("2004-06-09T13:00:00.000+01:00", test.toString());
    }finally{__CLR4_4_1tq5tq5lc8azvt9.R.flushNeeded();}}

    public void testPropertyRoundHalfEvenHourOfDay() {__CLR4_4_1tq5tq5lc8azvt9.R.globalSliceStart(getClass().getName(),38897);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_136gyocu0h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tq5tq5lc8azvt9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tq5tq5lc8azvt9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertyRoundHalfEvenHourOfDay",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38897,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_136gyocu0h(){try{__CLR4_4_1tq5tq5lc8azvt9.R.inc(38897);
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38898);MutableDateTime test = new MutableDateTime(2004, 6, 9, 13, 30, 0, 0);
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38899);test.hourOfDay().roundHalfEven();
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38900);assertEquals("2004-06-09T14:00:00.000+01:00", test.toString());
        
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38901);test = new MutableDateTime(2004, 6, 9, 14, 30, 0, 0);
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38902);test.hourOfDay().roundHalfEven();
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38903);assertEquals("2004-06-09T14:00:00.000+01:00", test.toString());
        
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38904);test = new MutableDateTime(2004, 6, 9, 13, 30, 0, 1);
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38905);test.hourOfDay().roundHalfEven();
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38906);assertEquals("2004-06-09T14:00:00.000+01:00", test.toString());
        
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38907);test = new MutableDateTime(2004, 6, 9, 13, 29, 59, 999);
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38908);test.hourOfDay().roundHalfEven();
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38909);assertEquals("2004-06-09T13:00:00.000+01:00", test.toString());
    }finally{__CLR4_4_1tq5tq5lc8azvt9.R.flushNeeded();}}

    public void testPropertyRemainderHourOfDay() {__CLR4_4_1tq5tq5lc8azvt9.R.globalSliceStart(getClass().getName(),38910);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sd0idyu0u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tq5tq5lc8azvt9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tq5tq5lc8azvt9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertyRemainderHourOfDay",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38910,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sd0idyu0u(){try{__CLR4_4_1tq5tq5lc8azvt9.R.inc(38910);
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38911);MutableDateTime test = new MutableDateTime(2004, 6, 9, 13, 30, 0, 0);
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38912);assertEquals(30L * DateTimeConstants.MILLIS_PER_MINUTE, test.hourOfDay().remainder());
    }finally{__CLR4_4_1tq5tq5lc8azvt9.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testPropertyGetMinuteOfHour() {__CLR4_4_1tq5tq5lc8azvt9.R.globalSliceStart(getClass().getName(),38913);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jby1vfu0x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tq5tq5lc8azvt9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tq5tq5lc8azvt9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertyGetMinuteOfHour",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38913,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jby1vfu0x(){try{__CLR4_4_1tq5tq5lc8azvt9.R.inc(38913);
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38914);MutableDateTime test = new MutableDateTime(2004, 6, 9, 13, 23, 43, 53);
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38915);assertSame(test.getChronology().minuteOfHour(), test.minuteOfHour().getField());
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38916);assertEquals("minuteOfHour", test.minuteOfHour().getName());
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38917);assertEquals("Property[minuteOfHour]", test.minuteOfHour().toString());
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38918);assertEquals(23, test.minuteOfHour().get());
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38919);assertEquals("23", test.minuteOfHour().getAsText());
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38920);assertEquals("23", test.minuteOfHour().getAsText(Locale.FRENCH));
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38921);assertEquals("23", test.minuteOfHour().getAsShortText());
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38922);assertEquals("23", test.minuteOfHour().getAsShortText(Locale.FRENCH));
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38923);assertEquals(test.getChronology().minutes(), test.minuteOfHour().getDurationField());
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38924);assertEquals(test.getChronology().hours(), test.minuteOfHour().getRangeDurationField());
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38925);assertEquals(2, test.minuteOfHour().getMaximumTextLength(null));
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38926);assertEquals(2, test.minuteOfHour().getMaximumShortTextLength(null));
    }finally{__CLR4_4_1tq5tq5lc8azvt9.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testPropertyGetMinuteOfDay() {__CLR4_4_1tq5tq5lc8azvt9.R.globalSliceStart(getClass().getName(),38927);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1p5v12vu1b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tq5tq5lc8azvt9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tq5tq5lc8azvt9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertyGetMinuteOfDay",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38927,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1p5v12vu1b(){try{__CLR4_4_1tq5tq5lc8azvt9.R.inc(38927);
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38928);MutableDateTime test = new MutableDateTime(2004, 6, 9, 13, 23, 43, 53);
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38929);assertSame(test.getChronology().minuteOfDay(), test.minuteOfDay().getField());
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38930);assertEquals("minuteOfDay", test.minuteOfDay().getName());
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38931);assertEquals("Property[minuteOfDay]", test.minuteOfDay().toString());
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38932);assertEquals(803, test.minuteOfDay().get());
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38933);assertEquals("803", test.minuteOfDay().getAsText());
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38934);assertEquals("803", test.minuteOfDay().getAsText(Locale.FRENCH));
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38935);assertEquals("803", test.minuteOfDay().getAsShortText());
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38936);assertEquals("803", test.minuteOfDay().getAsShortText(Locale.FRENCH));
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38937);assertEquals(test.getChronology().minutes(), test.minuteOfDay().getDurationField());
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38938);assertEquals(test.getChronology().days(), test.minuteOfDay().getRangeDurationField());
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38939);assertEquals(4, test.minuteOfDay().getMaximumTextLength(null));
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38940);assertEquals(4, test.minuteOfDay().getMaximumShortTextLength(null));
    }finally{__CLR4_4_1tq5tq5lc8azvt9.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testPropertyGetSecondOfMinute() {__CLR4_4_1tq5tq5lc8azvt9.R.globalSliceStart(getClass().getName(),38941);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ul2igbu1p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tq5tq5lc8azvt9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tq5tq5lc8azvt9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertyGetSecondOfMinute",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38941,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ul2igbu1p(){try{__CLR4_4_1tq5tq5lc8azvt9.R.inc(38941);
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38942);MutableDateTime test = new MutableDateTime(2004, 6, 9, 13, 23, 43, 53);
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38943);assertSame(test.getChronology().secondOfMinute(), test.secondOfMinute().getField());
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38944);assertEquals("secondOfMinute", test.secondOfMinute().getName());
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38945);assertEquals("Property[secondOfMinute]", test.secondOfMinute().toString());
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38946);assertEquals(43, test.secondOfMinute().get());
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38947);assertEquals("43", test.secondOfMinute().getAsText());
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38948);assertEquals("43", test.secondOfMinute().getAsText(Locale.FRENCH));
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38949);assertEquals("43", test.secondOfMinute().getAsShortText());
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38950);assertEquals("43", test.secondOfMinute().getAsShortText(Locale.FRENCH));
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38951);assertEquals(test.getChronology().seconds(), test.secondOfMinute().getDurationField());
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38952);assertEquals(test.getChronology().minutes(), test.secondOfMinute().getRangeDurationField());
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38953);assertEquals(2, test.secondOfMinute().getMaximumTextLength(null));
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38954);assertEquals(2, test.secondOfMinute().getMaximumShortTextLength(null));
    }finally{__CLR4_4_1tq5tq5lc8azvt9.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testPropertyGetSecondOfDay() {__CLR4_4_1tq5tq5lc8azvt9.R.globalSliceStart(getClass().getName(),38955);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1srw4fdu23();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tq5tq5lc8azvt9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tq5tq5lc8azvt9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertyGetSecondOfDay",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38955,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1srw4fdu23(){try{__CLR4_4_1tq5tq5lc8azvt9.R.inc(38955);
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38956);MutableDateTime test = new MutableDateTime(2004, 6, 9, 13, 23, 43, 53);
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38957);assertSame(test.getChronology().secondOfDay(), test.secondOfDay().getField());
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38958);assertEquals("secondOfDay", test.secondOfDay().getName());
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38959);assertEquals("Property[secondOfDay]", test.secondOfDay().toString());
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38960);assertEquals(48223, test.secondOfDay().get());
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38961);assertEquals("48223", test.secondOfDay().getAsText());
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38962);assertEquals("48223", test.secondOfDay().getAsText(Locale.FRENCH));
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38963);assertEquals("48223", test.secondOfDay().getAsShortText());
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38964);assertEquals("48223", test.secondOfDay().getAsShortText(Locale.FRENCH));
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38965);assertEquals(test.getChronology().seconds(), test.secondOfDay().getDurationField());
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38966);assertEquals(test.getChronology().days(), test.secondOfDay().getRangeDurationField());
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38967);assertEquals(5, test.secondOfDay().getMaximumTextLength(null));
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38968);assertEquals(5, test.secondOfDay().getMaximumShortTextLength(null));
    }finally{__CLR4_4_1tq5tq5lc8azvt9.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testPropertyGetMillisOfSecond() {__CLR4_4_1tq5tq5lc8azvt9.R.globalSliceStart(getClass().getName(),38969);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1je93bbu2h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tq5tq5lc8azvt9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tq5tq5lc8azvt9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertyGetMillisOfSecond",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38969,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1je93bbu2h(){try{__CLR4_4_1tq5tq5lc8azvt9.R.inc(38969);
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38970);MutableDateTime test = new MutableDateTime(2004, 6, 9, 13, 23, 43, 53);
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38971);assertSame(test.getChronology().millisOfSecond(), test.millisOfSecond().getField());
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38972);assertEquals("millisOfSecond", test.millisOfSecond().getName());
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38973);assertEquals("Property[millisOfSecond]", test.millisOfSecond().toString());
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38974);assertEquals(53, test.millisOfSecond().get());
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38975);assertEquals("53", test.millisOfSecond().getAsText());
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38976);assertEquals("53", test.millisOfSecond().getAsText(Locale.FRENCH));
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38977);assertEquals("53", test.millisOfSecond().getAsShortText());
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38978);assertEquals("53", test.millisOfSecond().getAsShortText(Locale.FRENCH));
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38979);assertEquals(test.getChronology().millis(), test.millisOfSecond().getDurationField());
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38980);assertEquals(test.getChronology().seconds(), test.millisOfSecond().getRangeDurationField());
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38981);assertEquals(3, test.millisOfSecond().getMaximumTextLength(null));
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38982);assertEquals(3, test.millisOfSecond().getMaximumShortTextLength(null));
    }finally{__CLR4_4_1tq5tq5lc8azvt9.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testPropertyGetMillisOfDay() {__CLR4_4_1tq5tq5lc8azvt9.R.globalSliceStart(getClass().getName(),38983);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1eihskpu2v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tq5tq5lc8azvt9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tq5tq5lc8azvt9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertyGetMillisOfDay",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38983,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1eihskpu2v(){try{__CLR4_4_1tq5tq5lc8azvt9.R.inc(38983);
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38984);MutableDateTime test = new MutableDateTime(2004, 6, 9, 13, 23, 43, 53);
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38985);assertSame(test.getChronology().millisOfDay(), test.millisOfDay().getField());
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38986);assertEquals("millisOfDay", test.millisOfDay().getName());
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38987);assertEquals("Property[millisOfDay]", test.millisOfDay().toString());
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38988);assertEquals(48223053, test.millisOfDay().get());
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38989);assertEquals("48223053", test.millisOfDay().getAsText());
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38990);assertEquals("48223053", test.millisOfDay().getAsText(Locale.FRENCH));
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38991);assertEquals("48223053", test.millisOfDay().getAsShortText());
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38992);assertEquals("48223053", test.millisOfDay().getAsShortText(Locale.FRENCH));
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38993);assertEquals(test.getChronology().millis(), test.millisOfDay().getDurationField());
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38994);assertEquals(test.getChronology().days(), test.millisOfDay().getRangeDurationField());
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38995);assertEquals(8, test.millisOfDay().getMaximumTextLength(null));
        __CLR4_4_1tq5tq5lc8azvt9.R.inc(38996);assertEquals(8, test.millisOfDay().getMaximumShortTextLength(null));
    }finally{__CLR4_4_1tq5tq5lc8azvt9.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testPropertyToIntervalYearOfEra() {__CLR4_4_1tq5tq5lc8azvt9.R.globalSliceStart(getClass().getName(),38997);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dof34u39();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tq5tq5lc8azvt9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tq5tq5lc8azvt9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertyToIntervalYearOfEra",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38997,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dof34u39(){try{__CLR4_4_1tq5tq5lc8azvt9.R.inc(38997);
      __CLR4_4_1tq5tq5lc8azvt9.R.inc(38998);MutableDateTime test = new MutableDateTime(2004, 6, 9, 13, 23, 43, 53);
      __CLR4_4_1tq5tq5lc8azvt9.R.inc(38999);Interval testInterval = test.yearOfEra().toInterval();
      __CLR4_4_1tq5tq5lc8azvt9.R.inc(39000);assertEquals(new MutableDateTime(2004, 1, 1, 0, 0, 0, 0), testInterval.getStart());
      __CLR4_4_1tq5tq5lc8azvt9.R.inc(39001);assertEquals(new MutableDateTime(2005, 1, 1, 0, 0, 0, 0), testInterval.getEnd());
      __CLR4_4_1tq5tq5lc8azvt9.R.inc(39002);assertEquals(new MutableDateTime(2004, 6, 9, 13, 23, 43, 53), test);
    }finally{__CLR4_4_1tq5tq5lc8azvt9.R.flushNeeded();}}

    public void testPropertyToIntervalYearOfCentury() {__CLR4_4_1tq5tq5lc8azvt9.R.globalSliceStart(getClass().getName(),39003);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1h9bdk0u3f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tq5tq5lc8azvt9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tq5tq5lc8azvt9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertyToIntervalYearOfCentury",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39003,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1h9bdk0u3f(){try{__CLR4_4_1tq5tq5lc8azvt9.R.inc(39003);
      __CLR4_4_1tq5tq5lc8azvt9.R.inc(39004);MutableDateTime test = new MutableDateTime(2004, 6, 9, 13, 23, 43, 53);
      __CLR4_4_1tq5tq5lc8azvt9.R.inc(39005);Interval testInterval = test.yearOfCentury().toInterval();
      __CLR4_4_1tq5tq5lc8azvt9.R.inc(39006);assertEquals(new MutableDateTime(2004, 1, 1, 0, 0, 0, 0), testInterval.getStart());
      __CLR4_4_1tq5tq5lc8azvt9.R.inc(39007);assertEquals(new MutableDateTime(2005, 1, 1, 0, 0, 0, 0), testInterval.getEnd());
      __CLR4_4_1tq5tq5lc8azvt9.R.inc(39008);assertEquals(new MutableDateTime(2004, 6, 9, 13, 23, 43, 53), test);
    }finally{__CLR4_4_1tq5tq5lc8azvt9.R.flushNeeded();}}

    public void testPropertyToIntervalYear() {__CLR4_4_1tq5tq5lc8azvt9.R.globalSliceStart(getClass().getName(),39009);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hg1pudu3l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tq5tq5lc8azvt9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tq5tq5lc8azvt9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertyToIntervalYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39009,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hg1pudu3l(){try{__CLR4_4_1tq5tq5lc8azvt9.R.inc(39009);
      __CLR4_4_1tq5tq5lc8azvt9.R.inc(39010);MutableDateTime test = new MutableDateTime(2004, 6, 9, 13, 23, 43, 53);
      __CLR4_4_1tq5tq5lc8azvt9.R.inc(39011);Interval testInterval = test.year().toInterval();
      __CLR4_4_1tq5tq5lc8azvt9.R.inc(39012);assertEquals(new MutableDateTime(2004, 1, 1, 0, 0, 0, 0), testInterval.getStart());
      __CLR4_4_1tq5tq5lc8azvt9.R.inc(39013);assertEquals(new MutableDateTime(2005, 1, 1, 0, 0, 0, 0), testInterval.getEnd());
      __CLR4_4_1tq5tq5lc8azvt9.R.inc(39014);assertEquals(new MutableDateTime(2004, 6, 9, 13, 23, 43, 53), test);
    }finally{__CLR4_4_1tq5tq5lc8azvt9.R.flushNeeded();}}

    public void testPropertyToIntervalMonthOfYear() {__CLR4_4_1tq5tq5lc8azvt9.R.globalSliceStart(getClass().getName(),39015);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mybaycu3r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tq5tq5lc8azvt9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tq5tq5lc8azvt9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertyToIntervalMonthOfYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39015,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mybaycu3r(){try{__CLR4_4_1tq5tq5lc8azvt9.R.inc(39015);
      __CLR4_4_1tq5tq5lc8azvt9.R.inc(39016);MutableDateTime test = new MutableDateTime(2004, 6, 9, 13, 23, 43, 53);
      __CLR4_4_1tq5tq5lc8azvt9.R.inc(39017);Interval testInterval = test.monthOfYear().toInterval();
      __CLR4_4_1tq5tq5lc8azvt9.R.inc(39018);assertEquals(new MutableDateTime(2004, 6, 1, 0, 0, 0, 0), testInterval.getStart());
      __CLR4_4_1tq5tq5lc8azvt9.R.inc(39019);assertEquals(new MutableDateTime(2004, 7, 1, 0, 0, 0, 0), testInterval.getEnd());
      __CLR4_4_1tq5tq5lc8azvt9.R.inc(39020);assertEquals(new MutableDateTime(2004, 6, 9, 13, 23, 43, 53), test);
    }finally{__CLR4_4_1tq5tq5lc8azvt9.R.flushNeeded();}}

    public void testPropertyToIntervalDayOfMonth() {__CLR4_4_1tq5tq5lc8azvt9.R.globalSliceStart(getClass().getName(),39021);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1r3xijfu3x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tq5tq5lc8azvt9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tq5tq5lc8azvt9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertyToIntervalDayOfMonth",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39021,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1r3xijfu3x(){try{__CLR4_4_1tq5tq5lc8azvt9.R.inc(39021);
      __CLR4_4_1tq5tq5lc8azvt9.R.inc(39022);MutableDateTime test = new MutableDateTime(2004, 6, 9, 13, 23, 43, 53);
      __CLR4_4_1tq5tq5lc8azvt9.R.inc(39023);Interval testInterval = test.dayOfMonth().toInterval();
      __CLR4_4_1tq5tq5lc8azvt9.R.inc(39024);assertEquals(new MutableDateTime(2004, 6, 9, 0, 0, 0, 0), testInterval.getStart());
      __CLR4_4_1tq5tq5lc8azvt9.R.inc(39025);assertEquals(new MutableDateTime(2004, 6, 10, 0, 0, 0, 0), testInterval.getEnd());
      __CLR4_4_1tq5tq5lc8azvt9.R.inc(39026);assertEquals(new MutableDateTime(2004, 6, 9, 13, 23, 43, 53), test);

      __CLR4_4_1tq5tq5lc8azvt9.R.inc(39027);MutableDateTime febTest = new MutableDateTime(2004, 2, 29, 13, 23, 43, 53);
      __CLR4_4_1tq5tq5lc8azvt9.R.inc(39028);Interval febTestInterval = febTest.dayOfMonth().toInterval();
      __CLR4_4_1tq5tq5lc8azvt9.R.inc(39029);assertEquals(new MutableDateTime(2004, 2, 29, 0, 0, 0, 0), febTestInterval.getStart());
      __CLR4_4_1tq5tq5lc8azvt9.R.inc(39030);assertEquals(new MutableDateTime(2004, 3, 1, 0, 0, 0, 0), febTestInterval.getEnd());
      __CLR4_4_1tq5tq5lc8azvt9.R.inc(39031);assertEquals(new MutableDateTime(2004, 2, 29, 13, 23, 43, 53), febTest);
    }finally{__CLR4_4_1tq5tq5lc8azvt9.R.flushNeeded();}}

    public void testPropertyToIntervalHourOfDay() {__CLR4_4_1tq5tq5lc8azvt9.R.globalSliceStart(getClass().getName(),39032);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ldcfnlu48();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tq5tq5lc8azvt9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tq5tq5lc8azvt9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertyToIntervalHourOfDay",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39032,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ldcfnlu48(){try{__CLR4_4_1tq5tq5lc8azvt9.R.inc(39032);
      __CLR4_4_1tq5tq5lc8azvt9.R.inc(39033);MutableDateTime test = new MutableDateTime(2004, 6, 9, 13, 23, 43, 53);
      __CLR4_4_1tq5tq5lc8azvt9.R.inc(39034);Interval testInterval = test.hourOfDay().toInterval();
      __CLR4_4_1tq5tq5lc8azvt9.R.inc(39035);assertEquals(new MutableDateTime(2004, 6, 9, 13, 0, 0, 0), testInterval.getStart());
      __CLR4_4_1tq5tq5lc8azvt9.R.inc(39036);assertEquals(new MutableDateTime(2004, 6, 9, 14, 0, 0, 0), testInterval.getEnd());
      __CLR4_4_1tq5tq5lc8azvt9.R.inc(39037);assertEquals(new MutableDateTime(2004, 6, 9, 13, 23, 43, 53), test);

      __CLR4_4_1tq5tq5lc8azvt9.R.inc(39038);MutableDateTime midnightTest = new MutableDateTime(2004, 6, 9, 23, 23, 43, 53);
      __CLR4_4_1tq5tq5lc8azvt9.R.inc(39039);Interval midnightTestInterval = midnightTest.hourOfDay().toInterval();
      __CLR4_4_1tq5tq5lc8azvt9.R.inc(39040);assertEquals(new MutableDateTime(2004, 6, 9, 23, 0, 0, 0), midnightTestInterval.getStart());
      __CLR4_4_1tq5tq5lc8azvt9.R.inc(39041);assertEquals(new MutableDateTime(2004, 6, 10, 0, 0, 0, 0), midnightTestInterval.getEnd());
      __CLR4_4_1tq5tq5lc8azvt9.R.inc(39042);assertEquals(new MutableDateTime(2004, 6, 9, 23, 23, 43, 53), midnightTest);
    }finally{__CLR4_4_1tq5tq5lc8azvt9.R.flushNeeded();}}

    public void testPropertyToIntervalMinuteOfHour() {__CLR4_4_1tq5tq5lc8azvt9.R.globalSliceStart(getClass().getName(),39043);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1zi18fxu4j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tq5tq5lc8azvt9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tq5tq5lc8azvt9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertyToIntervalMinuteOfHour",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39043,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1zi18fxu4j(){try{__CLR4_4_1tq5tq5lc8azvt9.R.inc(39043);
      __CLR4_4_1tq5tq5lc8azvt9.R.inc(39044);MutableDateTime test = new MutableDateTime(2004, 6, 9, 13, 23, 43, 53);
      __CLR4_4_1tq5tq5lc8azvt9.R.inc(39045);Interval testInterval = test.minuteOfHour().toInterval();
      __CLR4_4_1tq5tq5lc8azvt9.R.inc(39046);assertEquals(new MutableDateTime(2004, 6, 9, 13, 23, 0, 0), testInterval.getStart());
      __CLR4_4_1tq5tq5lc8azvt9.R.inc(39047);assertEquals(new MutableDateTime(2004, 6, 9, 13, 24, 0, 0), testInterval.getEnd());
      __CLR4_4_1tq5tq5lc8azvt9.R.inc(39048);assertEquals(new MutableDateTime(2004, 6, 9, 13, 23, 43, 53), test);
    }finally{__CLR4_4_1tq5tq5lc8azvt9.R.flushNeeded();}}

    public void testPropertyToIntervalSecondOfMinute() {__CLR4_4_1tq5tq5lc8azvt9.R.globalSliceStart(getClass().getName(),39049);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ttf6dpu4p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tq5tq5lc8azvt9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tq5tq5lc8azvt9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertyToIntervalSecondOfMinute",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39049,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ttf6dpu4p(){try{__CLR4_4_1tq5tq5lc8azvt9.R.inc(39049);
      __CLR4_4_1tq5tq5lc8azvt9.R.inc(39050);MutableDateTime test = new MutableDateTime(2004, 6, 9, 13, 23, 43, 53);
      __CLR4_4_1tq5tq5lc8azvt9.R.inc(39051);Interval testInterval = test.secondOfMinute().toInterval();
      __CLR4_4_1tq5tq5lc8azvt9.R.inc(39052);assertEquals(new MutableDateTime(2004, 6, 9, 13, 23, 43, 0), testInterval.getStart());
      __CLR4_4_1tq5tq5lc8azvt9.R.inc(39053);assertEquals(new MutableDateTime(2004, 6, 9, 13, 23, 44, 0), testInterval.getEnd());
      __CLR4_4_1tq5tq5lc8azvt9.R.inc(39054);assertEquals(new MutableDateTime(2004, 6, 9, 13, 23, 43, 53), test);
    }finally{__CLR4_4_1tq5tq5lc8azvt9.R.flushNeeded();}}

    public void testPropertyToIntervalMillisOfSecond() {__CLR4_4_1tq5tq5lc8azvt9.R.globalSliceStart(getClass().getName(),39055);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18rmq67u4v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tq5tq5lc8azvt9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tq5tq5lc8azvt9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertyToIntervalMillisOfSecond",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39055,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18rmq67u4v(){try{__CLR4_4_1tq5tq5lc8azvt9.R.inc(39055);
      __CLR4_4_1tq5tq5lc8azvt9.R.inc(39056);MutableDateTime test = new MutableDateTime(2004, 6, 9, 13, 23, 43, 53);
      __CLR4_4_1tq5tq5lc8azvt9.R.inc(39057);Interval testInterval = test.millisOfSecond().toInterval();
      __CLR4_4_1tq5tq5lc8azvt9.R.inc(39058);assertEquals(new MutableDateTime(2004, 6, 9, 13, 23, 43, 53), testInterval.getStart());
      __CLR4_4_1tq5tq5lc8azvt9.R.inc(39059);assertEquals(new MutableDateTime(2004, 6, 9, 13, 23, 43, 54), testInterval.getEnd());
      __CLR4_4_1tq5tq5lc8azvt9.R.inc(39060);assertEquals(new MutableDateTime(2004, 6, 9, 13, 23, 43, 53), test);
    }finally{__CLR4_4_1tq5tq5lc8azvt9.R.flushNeeded();}}

}
