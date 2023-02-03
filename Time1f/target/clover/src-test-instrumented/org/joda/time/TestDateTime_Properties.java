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

import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.LenientChronology;
import org.joda.time.chrono.StrictChronology;

/**
 * This class is a Junit unit test for DateTime.
 *
 * @author Stephen Colebourne
 * @author Mike Schrag
 */
public class TestDateTime_Properties extends TestCase {static class __CLR4_4_1kwbkwblc8azunf{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672271031490L,8589935092L,28085,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    // Test in 2002/03 as time zones are more well known
    // (before the late 90's they were all over the place)

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final Chronology COPTIC_PARIS = CopticChronology.getInstance(PARIS);

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

    public static void main(String[] args) {try{__CLR4_4_1kwbkwblc8azunf.R.inc(27083);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27084);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1kwbkwblc8azunf.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1kwbkwblc8azunf.R.inc(27085);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27086);return new TestSuite(TestDateTime_Properties.class);
    }finally{__CLR4_4_1kwbkwblc8azunf.R.flushNeeded();}}

    public TestDateTime_Properties(String name) {
        super(name);__CLR4_4_1kwbkwblc8azunf.R.inc(27088);try{__CLR4_4_1kwbkwblc8azunf.R.inc(27087);
    }finally{__CLR4_4_1kwbkwblc8azunf.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1kwbkwblc8azunf.R.inc(27089);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27090);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27091);zone = DateTimeZone.getDefault();
        __CLR4_4_1kwbkwblc8azunf.R.inc(27092);locale = Locale.getDefault();
        __CLR4_4_1kwbkwblc8azunf.R.inc(27093);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27094);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1kwbkwblc8azunf.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1kwbkwblc8azunf.R.inc(27095);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27096);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1kwbkwblc8azunf.R.inc(27097);DateTimeZone.setDefault(zone);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27098);Locale.setDefault(locale);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27099);zone = null;
    }finally{__CLR4_4_1kwbkwblc8azunf.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testTest() {__CLR4_4_1kwbkwblc8azunf.R.globalSliceStart(getClass().getName(),27100);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1447pqjkws();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kwbkwblc8azunf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kwbkwblc8azunf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testTest",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27100,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1447pqjkws(){try{__CLR4_4_1kwbkwblc8azunf.R.inc(27100);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27101);assertEquals("2002-06-09T00:00:00.000Z", new Instant(TEST_TIME_NOW).toString());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27102);assertEquals("2002-04-05T12:24:00.000Z", new Instant(TEST_TIME1).toString());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27103);assertEquals("2003-05-06T14:28:00.000Z", new Instant(TEST_TIME2).toString());
    }finally{__CLR4_4_1kwbkwblc8azunf.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testPropertyGetEra() {__CLR4_4_1kwbkwblc8azunf.R.globalSliceStart(getClass().getName(),27104);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19gfrqkkww();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kwbkwblc8azunf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kwbkwblc8azunf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyGetEra",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27104,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19gfrqkkww(){try{__CLR4_4_1kwbkwblc8azunf.R.inc(27104);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27105);DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27106);assertSame(test.getChronology().era(), test.era().getField());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27107);assertEquals("era", test.era().getName());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27108);assertEquals("Property[era]", test.era().toString());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27109);assertSame(test, test.era().getDateTime());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27110);assertEquals(1, test.era().get());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27111);assertEquals("1", test.era().getAsString());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27112);assertEquals("AD", test.era().getAsText());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27113);assertEquals("AD", test.era().getField().getAsText(1, Locale.ENGLISH));
        __CLR4_4_1kwbkwblc8azunf.R.inc(27114);assertEquals("ap. J.-C.", test.era().getAsText(Locale.FRENCH));
        __CLR4_4_1kwbkwblc8azunf.R.inc(27115);assertEquals("ap. J.-C.", test.era().getField().getAsText(1, Locale.FRENCH));
        __CLR4_4_1kwbkwblc8azunf.R.inc(27116);assertEquals("AD", test.era().getAsShortText());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27117);assertEquals("AD", test.era().getField().getAsShortText(1, Locale.ENGLISH));
        __CLR4_4_1kwbkwblc8azunf.R.inc(27118);assertEquals("ap. J.-C.", test.era().getAsShortText(Locale.FRENCH));
        __CLR4_4_1kwbkwblc8azunf.R.inc(27119);assertEquals("ap. J.-C.", test.era().getField().getAsShortText(1, Locale.FRENCH));
        __CLR4_4_1kwbkwblc8azunf.R.inc(27120);assertEquals(test.getChronology().eras(), test.era().getDurationField());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27121);assertEquals(null, test.era().getRangeDurationField());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27122);assertEquals(2, test.era().getMaximumTextLength(null));
        __CLR4_4_1kwbkwblc8azunf.R.inc(27123);assertEquals(9, test.era().getMaximumTextLength(Locale.FRENCH));
        __CLR4_4_1kwbkwblc8azunf.R.inc(27124);assertEquals(2, test.era().getMaximumShortTextLength(null));
        __CLR4_4_1kwbkwblc8azunf.R.inc(27125);assertEquals(9, test.era().getMaximumShortTextLength(Locale.FRENCH));
    }finally{__CLR4_4_1kwbkwblc8azunf.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testPropertyGetYearOfEra() {__CLR4_4_1kwbkwblc8azunf.R.globalSliceStart(getClass().getName(),27126);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12tr0dkkxi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kwbkwblc8azunf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kwbkwblc8azunf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyGetYearOfEra",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27126,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12tr0dkkxi(){try{__CLR4_4_1kwbkwblc8azunf.R.inc(27126);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27127);DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27128);assertSame(test.getChronology().yearOfEra(), test.yearOfEra().getField());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27129);assertEquals("yearOfEra", test.yearOfEra().getName());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27130);assertEquals("Property[yearOfEra]", test.yearOfEra().toString());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27131);assertSame(test, test.yearOfEra().getDateTime());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27132);assertEquals(2004, test.yearOfEra().get());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27133);assertEquals("2004", test.yearOfEra().getAsString());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27134);assertEquals("2004", test.yearOfEra().getAsText());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27135);assertEquals("2004", test.yearOfEra().getAsText(Locale.FRENCH));
        __CLR4_4_1kwbkwblc8azunf.R.inc(27136);assertEquals("2004", test.yearOfEra().getAsShortText());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27137);assertEquals("2004", test.yearOfEra().getAsShortText(Locale.FRENCH));
        __CLR4_4_1kwbkwblc8azunf.R.inc(27138);assertEquals(test.getChronology().years(), test.yearOfEra().getDurationField());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27139);assertEquals(test.getChronology().eras(), test.yearOfEra().getRangeDurationField());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27140);assertEquals(9, test.yearOfEra().getMaximumTextLength(null));
        __CLR4_4_1kwbkwblc8azunf.R.inc(27141);assertEquals(9, test.yearOfEra().getMaximumShortTextLength(null));
    }finally{__CLR4_4_1kwbkwblc8azunf.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testPropertyGetCenturyOfEra() {__CLR4_4_1kwbkwblc8azunf.R.globalSliceStart(getClass().getName(),27142);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nozc5dkxy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kwbkwblc8azunf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kwbkwblc8azunf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyGetCenturyOfEra",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27142,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nozc5dkxy(){try{__CLR4_4_1kwbkwblc8azunf.R.inc(27142);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27143);DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27144);assertSame(test.getChronology().centuryOfEra(), test.centuryOfEra().getField());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27145);assertEquals("centuryOfEra", test.centuryOfEra().getName());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27146);assertEquals("Property[centuryOfEra]", test.centuryOfEra().toString());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27147);assertSame(test, test.centuryOfEra().getDateTime());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27148);assertEquals(20, test.centuryOfEra().get());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27149);assertEquals("20", test.centuryOfEra().getAsString());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27150);assertEquals("20", test.centuryOfEra().getAsText());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27151);assertEquals("20", test.centuryOfEra().getAsText(Locale.FRENCH));
        __CLR4_4_1kwbkwblc8azunf.R.inc(27152);assertEquals("20", test.centuryOfEra().getAsShortText());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27153);assertEquals("20", test.centuryOfEra().getAsShortText(Locale.FRENCH));
        __CLR4_4_1kwbkwblc8azunf.R.inc(27154);assertEquals(test.getChronology().centuries(), test.centuryOfEra().getDurationField());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27155);assertEquals(test.getChronology().eras(), test.centuryOfEra().getRangeDurationField());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27156);assertEquals(7, test.centuryOfEra().getMaximumTextLength(null));
        __CLR4_4_1kwbkwblc8azunf.R.inc(27157);assertEquals(7, test.centuryOfEra().getMaximumShortTextLength(null));
    }finally{__CLR4_4_1kwbkwblc8azunf.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testPropertyGetYearOfCentury() {__CLR4_4_1kwbkwblc8azunf.R.globalSliceStart(getClass().getName(),27158);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1m6mt7ckye();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kwbkwblc8azunf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kwbkwblc8azunf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyGetYearOfCentury",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27158,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1m6mt7ckye(){try{__CLR4_4_1kwbkwblc8azunf.R.inc(27158);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27159);DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27160);assertSame(test.getChronology().yearOfCentury(), test.yearOfCentury().getField());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27161);assertEquals("yearOfCentury", test.yearOfCentury().getName());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27162);assertEquals("Property[yearOfCentury]", test.yearOfCentury().toString());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27163);assertSame(test, test.yearOfCentury().getDateTime());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27164);assertEquals(4, test.yearOfCentury().get());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27165);assertEquals("4", test.yearOfCentury().getAsString());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27166);assertEquals("4", test.yearOfCentury().getAsText());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27167);assertEquals("4", test.yearOfCentury().getAsText(Locale.FRENCH));
        __CLR4_4_1kwbkwblc8azunf.R.inc(27168);assertEquals("4", test.yearOfCentury().getAsShortText());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27169);assertEquals("4", test.yearOfCentury().getAsShortText(Locale.FRENCH));
        __CLR4_4_1kwbkwblc8azunf.R.inc(27170);assertEquals(test.getChronology().years(), test.yearOfCentury().getDurationField());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27171);assertEquals(test.getChronology().centuries(), test.yearOfCentury().getRangeDurationField());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27172);assertEquals(2, test.yearOfCentury().getMaximumTextLength(null));
        __CLR4_4_1kwbkwblc8azunf.R.inc(27173);assertEquals(2, test.yearOfCentury().getMaximumShortTextLength(null));
    }finally{__CLR4_4_1kwbkwblc8azunf.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testPropertyGetWeekyear() {__CLR4_4_1kwbkwblc8azunf.R.globalSliceStart(getClass().getName(),27174);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1izv1ndkyu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kwbkwblc8azunf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kwbkwblc8azunf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyGetWeekyear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27174,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1izv1ndkyu(){try{__CLR4_4_1kwbkwblc8azunf.R.inc(27174);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27175);DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27176);assertSame(test.getChronology().weekyear(), test.weekyear().getField());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27177);assertEquals("weekyear", test.weekyear().getName());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27178);assertEquals("Property[weekyear]", test.weekyear().toString());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27179);assertSame(test, test.weekyear().getDateTime());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27180);assertEquals(2004, test.weekyear().get());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27181);assertEquals("2004", test.weekyear().getAsString());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27182);assertEquals("2004", test.weekyear().getAsText());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27183);assertEquals("2004", test.weekyear().getAsText(Locale.FRENCH));
        __CLR4_4_1kwbkwblc8azunf.R.inc(27184);assertEquals("2004", test.weekyear().getAsShortText());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27185);assertEquals("2004", test.weekyear().getAsShortText(Locale.FRENCH));
        __CLR4_4_1kwbkwblc8azunf.R.inc(27186);assertEquals(test.getChronology().weekyears(), test.weekyear().getDurationField());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27187);assertEquals(null, test.weekyear().getRangeDurationField());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27188);assertEquals(9, test.weekyear().getMaximumTextLength(null));
        __CLR4_4_1kwbkwblc8azunf.R.inc(27189);assertEquals(9, test.weekyear().getMaximumShortTextLength(null));
    }finally{__CLR4_4_1kwbkwblc8azunf.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testPropertyGetYear() {__CLR4_4_1kwbkwblc8azunf.R.globalSliceStart(getClass().getName(),27190);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tgqcqbkza();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kwbkwblc8azunf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kwbkwblc8azunf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyGetYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27190,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tgqcqbkza(){try{__CLR4_4_1kwbkwblc8azunf.R.inc(27190);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27191);DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27192);assertSame(test.getChronology().year(), test.year().getField());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27193);assertEquals("year", test.year().getName());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27194);assertEquals("Property[year]", test.year().toString());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27195);assertSame(test, test.year().getDateTime());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27196);assertEquals(2004, test.year().get());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27197);assertEquals("2004", test.year().getAsString());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27198);assertEquals("2004", test.year().getAsText());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27199);assertEquals("2004", test.year().getAsText(Locale.FRENCH));
        __CLR4_4_1kwbkwblc8azunf.R.inc(27200);assertEquals("2004", test.year().getAsShortText());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27201);assertEquals("2004", test.year().getAsShortText(Locale.FRENCH));
        __CLR4_4_1kwbkwblc8azunf.R.inc(27202);assertEquals(test.getChronology().years(), test.year().getDurationField());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27203);assertEquals(null, test.year().getRangeDurationField());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27204);assertEquals(9, test.year().getMaximumTextLength(null));
        __CLR4_4_1kwbkwblc8azunf.R.inc(27205);assertEquals(9, test.year().getMaximumShortTextLength(null));
        __CLR4_4_1kwbkwblc8azunf.R.inc(27206);assertEquals(-292275054, test.year().getMinimumValue());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27207);assertEquals(-292275054, test.year().getMinimumValueOverall());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27208);assertEquals(292278993, test.year().getMaximumValue());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27209);assertEquals(292278993, test.year().getMaximumValueOverall());
    }finally{__CLR4_4_1kwbkwblc8azunf.R.flushNeeded();}}

    public void testPropertyLeapYear() {__CLR4_4_1kwbkwblc8azunf.R.globalSliceStart(getClass().getName(),27210);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19ty437kzu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kwbkwblc8azunf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kwbkwblc8azunf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyLeapYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27210,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19ty437kzu(){try{__CLR4_4_1kwbkwblc8azunf.R.inc(27210);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27211);DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27212);assertEquals(true, test.year().isLeap());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27213);assertEquals(1, test.year().getLeapAmount());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27214);assertEquals(test.getChronology().days(), test.year().getLeapDurationField());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27215);test = new DateTime(2003, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27216);assertEquals(false, test.year().isLeap());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27217);assertEquals(0, test.year().getLeapAmount());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27218);assertEquals(test.getChronology().days(), test.year().getLeapDurationField());
    }finally{__CLR4_4_1kwbkwblc8azunf.R.flushNeeded();}}

    public void testPropertyAddYear() {__CLR4_4_1kwbkwblc8azunf.R.globalSliceStart(getClass().getName(),27219);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1c0tefyl03();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kwbkwblc8azunf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kwbkwblc8azunf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyAddYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27219,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1c0tefyl03(){try{__CLR4_4_1kwbkwblc8azunf.R.inc(27219);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27220);DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27221);DateTime copy = test.year().addToCopy(9);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27222);assertEquals("2004-06-09T00:00:00.000+01:00", test.toString());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27223);assertEquals("2013-06-09T00:00:00.000+01:00", copy.toString());
        
        __CLR4_4_1kwbkwblc8azunf.R.inc(27224);copy = test.year().addToCopy(0);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27225);assertEquals("2004-06-09T00:00:00.000+01:00", copy.toString());
        
        __CLR4_4_1kwbkwblc8azunf.R.inc(27226);copy = test.year().addToCopy(292277023 - 2004);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27227);assertEquals(292277023, copy.getYear());
        
        __CLR4_4_1kwbkwblc8azunf.R.inc(27228);try {
            __CLR4_4_1kwbkwblc8azunf.R.inc(27229);test.year().addToCopy(292278993 - 2004 + 1);
            __CLR4_4_1kwbkwblc8azunf.R.inc(27230);fail();
        } catch (IllegalArgumentException ex) {}
        
        __CLR4_4_1kwbkwblc8azunf.R.inc(27231);copy = test.year().addToCopy(-2004);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27232);assertEquals(0, copy.getYear());
        
        __CLR4_4_1kwbkwblc8azunf.R.inc(27233);copy = test.year().addToCopy(-2005);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27234);assertEquals(-1, copy.getYear());
        
        __CLR4_4_1kwbkwblc8azunf.R.inc(27235);try {
            __CLR4_4_1kwbkwblc8azunf.R.inc(27236);test.year().addToCopy(-292275054 - 2004 - 1);
            __CLR4_4_1kwbkwblc8azunf.R.inc(27237);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1kwbkwblc8azunf.R.flushNeeded();}}

    public void testPropertyAddWrapFieldYear() {__CLR4_4_1kwbkwblc8azunf.R.globalSliceStart(getClass().getName(),27238);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qjgig6l0m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kwbkwblc8azunf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kwbkwblc8azunf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyAddWrapFieldYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27238,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qjgig6l0m(){try{__CLR4_4_1kwbkwblc8azunf.R.inc(27238);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27239);DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27240);DateTime copy = test.year().addWrapFieldToCopy(9);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27241);assertEquals("2004-06-09T00:00:00.000+01:00", test.toString());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27242);assertEquals("2013-06-09T00:00:00.000+01:00", copy.toString());
        
        __CLR4_4_1kwbkwblc8azunf.R.inc(27243);copy = test.year().addWrapFieldToCopy(0);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27244);assertEquals(2004, copy.getYear());
        
        __CLR4_4_1kwbkwblc8azunf.R.inc(27245);copy = test.year().addWrapFieldToCopy(292278993 - 2004 + 1);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27246);assertEquals(-292275054, copy.getYear());
        
        __CLR4_4_1kwbkwblc8azunf.R.inc(27247);copy = test.year().addWrapFieldToCopy(-292275054 - 2004 - 1);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27248);assertEquals(292278993, copy.getYear());
    }finally{__CLR4_4_1kwbkwblc8azunf.R.flushNeeded();}}

    public void testPropertySetYear() {__CLR4_4_1kwbkwblc8azunf.R.globalSliceStart(getClass().getName(),27249);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1b9ziwxl0x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kwbkwblc8azunf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kwbkwblc8azunf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertySetYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27249,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1b9ziwxl0x(){try{__CLR4_4_1kwbkwblc8azunf.R.inc(27249);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27250);DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27251);DateTime copy = test.year().setCopy(1960);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27252);assertEquals("2004-06-09T00:00:00.000+01:00", test.toString());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27253);assertEquals("1960-06-09T00:00:00.000+01:00", copy.toString());
    }finally{__CLR4_4_1kwbkwblc8azunf.R.flushNeeded();}}

    public void testPropertySetTextYear() {__CLR4_4_1kwbkwblc8azunf.R.globalSliceStart(getClass().getName(),27254);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11qaw4sl12();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kwbkwblc8azunf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kwbkwblc8azunf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertySetTextYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27254,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11qaw4sl12(){try{__CLR4_4_1kwbkwblc8azunf.R.inc(27254);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27255);DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27256);DateTime copy = test.year().setCopy("1960");
        __CLR4_4_1kwbkwblc8azunf.R.inc(27257);assertEquals("2004-06-09T00:00:00.000+01:00", test.toString());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27258);assertEquals("1960-06-09T00:00:00.000+01:00", copy.toString());
    }finally{__CLR4_4_1kwbkwblc8azunf.R.flushNeeded();}}

    public void testPropertyCompareToYear() {__CLR4_4_1kwbkwblc8azunf.R.globalSliceStart(getClass().getName(),27259);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ft7abl17();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kwbkwblc8azunf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kwbkwblc8azunf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyCompareToYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27259,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ft7abl17(){try{__CLR4_4_1kwbkwblc8azunf.R.inc(27259);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27260);DateTime test1 = new DateTime(TEST_TIME1);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27261);DateTime test2 = new DateTime(TEST_TIME2);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27262);assertEquals(true, test1.year().compareTo(test2) < 0);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27263);assertEquals(true, test2.year().compareTo(test1) > 0);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27264);assertEquals(true, test1.year().compareTo(test1) == 0);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27265);try {
            __CLR4_4_1kwbkwblc8azunf.R.inc(27266);test1.year().compareTo((ReadableInstant) null);
            __CLR4_4_1kwbkwblc8azunf.R.inc(27267);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1kwbkwblc8azunf.R.flushNeeded();}}

    @SuppressWarnings("deprecation")
    public void testPropertyCompareToYear2() {__CLR4_4_1kwbkwblc8azunf.R.globalSliceStart(getClass().getName(),27268);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1t6ayqrl1g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kwbkwblc8azunf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kwbkwblc8azunf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyCompareToYear2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27268,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1t6ayqrl1g(){try{__CLR4_4_1kwbkwblc8azunf.R.inc(27268);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27269);DateTime test1 = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27270);YearMonthDay ymd1 = new YearMonthDay(2003, 6, 9);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27271);YearMonthDay ymd2 = new YearMonthDay(2004, 6, 9);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27272);YearMonthDay ymd3 = new YearMonthDay(2005, 6, 9);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27273);assertEquals(true, test1.year().compareTo(ymd1) > 0);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27274);assertEquals(true, test1.year().compareTo(ymd2) == 0);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27275);assertEquals(true, test1.year().compareTo(ymd3) < 0);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27276);try {
            __CLR4_4_1kwbkwblc8azunf.R.inc(27277);test1.year().compareTo((ReadablePartial) null);
            __CLR4_4_1kwbkwblc8azunf.R.inc(27278);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1kwbkwblc8azunf.R.flushNeeded();}}

    public void testPropertyEqualsHashCodeYear() {__CLR4_4_1kwbkwblc8azunf.R.globalSliceStart(getClass().getName(),27279);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18yslkrl1r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kwbkwblc8azunf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kwbkwblc8azunf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyEqualsHashCodeYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27279,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18yslkrl1r(){try{__CLR4_4_1kwbkwblc8azunf.R.inc(27279);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27280);DateTime test1 = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27281);assertEquals(true, test1.year().equals(test1.year()));
        __CLR4_4_1kwbkwblc8azunf.R.inc(27282);assertEquals(true, test1.year().equals(new DateTime(2004, 6, 9, 0, 0, 0, 0).year()));
        __CLR4_4_1kwbkwblc8azunf.R.inc(27283);assertEquals(false, test1.year().equals(new DateTime(2004, 6, 9, 0, 0, 0, 0).monthOfYear()));
        __CLR4_4_1kwbkwblc8azunf.R.inc(27284);assertEquals(false, test1.year().equals(new DateTime(2004, 6, 9, 0, 0, 0, 0, CopticChronology.getInstance()).year()));
        
        __CLR4_4_1kwbkwblc8azunf.R.inc(27285);assertEquals(true, test1.year().hashCode() == test1.year().hashCode());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27286);assertEquals(true, test1.year().hashCode() == new DateTime(2004, 6, 9, 0, 0, 0, 0).year().hashCode());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27287);assertEquals(false, test1.year().hashCode() == new DateTime(2004, 6, 9, 0, 0, 0, 0).monthOfYear().hashCode());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27288);assertEquals(false, test1.year().hashCode() == new DateTime(2004, 6, 9, 0, 0, 0, 0, CopticChronology.getInstance()).year().hashCode());
    }finally{__CLR4_4_1kwbkwblc8azunf.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testPropertyGetMonthOfYear() {__CLR4_4_1kwbkwblc8azunf.R.globalSliceStart(getClass().getName(),27289);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_140q40kl21();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kwbkwblc8azunf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kwbkwblc8azunf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyGetMonthOfYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27289,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_140q40kl21(){try{__CLR4_4_1kwbkwblc8azunf.R.inc(27289);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27290);DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27291);assertSame(test.getChronology().monthOfYear(), test.monthOfYear().getField());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27292);assertEquals("monthOfYear", test.monthOfYear().getName());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27293);assertEquals("Property[monthOfYear]", test.monthOfYear().toString());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27294);assertSame(test, test.monthOfYear().getDateTime());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27295);assertEquals(6, test.monthOfYear().get());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27296);assertEquals("6", test.monthOfYear().getAsString());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27297);assertEquals("June", test.monthOfYear().getAsText());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27298);assertEquals("June", test.monthOfYear().getField().getAsText(6, Locale.ENGLISH));
        __CLR4_4_1kwbkwblc8azunf.R.inc(27299);assertEquals("juin", test.monthOfYear().getAsText(Locale.FRENCH));
        __CLR4_4_1kwbkwblc8azunf.R.inc(27300);assertEquals("juin", test.monthOfYear().getField().getAsText(6, Locale.FRENCH));
        __CLR4_4_1kwbkwblc8azunf.R.inc(27301);assertEquals("Jun", test.monthOfYear().getAsShortText());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27302);assertEquals("Jun", test.monthOfYear().getField().getAsShortText(6, Locale.ENGLISH));
        __CLR4_4_1kwbkwblc8azunf.R.inc(27303);assertEquals("juin", test.monthOfYear().getAsShortText(Locale.FRENCH));
        __CLR4_4_1kwbkwblc8azunf.R.inc(27304);assertEquals("juin", test.monthOfYear().getField().getAsShortText(6, Locale.FRENCH));
        __CLR4_4_1kwbkwblc8azunf.R.inc(27305);assertEquals(test.getChronology().months(), test.monthOfYear().getDurationField());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27306);assertEquals(test.getChronology().years(), test.monthOfYear().getRangeDurationField());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27307);assertEquals(9, test.monthOfYear().getMaximumTextLength(null));
        __CLR4_4_1kwbkwblc8azunf.R.inc(27308);assertEquals(3, test.monthOfYear().getMaximumShortTextLength(null));
        __CLR4_4_1kwbkwblc8azunf.R.inc(27309);test = new DateTime(2004, 7, 9, 0, 0, 0, 0);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27310);assertEquals("juillet", test.monthOfYear().getAsText(Locale.FRENCH));
        __CLR4_4_1kwbkwblc8azunf.R.inc(27311);assertEquals("juillet", test.monthOfYear().getField().getAsText(7, Locale.FRENCH));
        __CLR4_4_1kwbkwblc8azunf.R.inc(27312);assertEquals("juil.", test.monthOfYear().getAsShortText(Locale.FRENCH));
        __CLR4_4_1kwbkwblc8azunf.R.inc(27313);assertEquals("juil.", test.monthOfYear().getField().getAsShortText(7, Locale.FRENCH));
        __CLR4_4_1kwbkwblc8azunf.R.inc(27314);assertEquals(1, test.monthOfYear().getMinimumValue());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27315);assertEquals(1, test.monthOfYear().getMinimumValueOverall());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27316);assertEquals(12, test.monthOfYear().getMaximumValue());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27317);assertEquals(12, test.monthOfYear().getMaximumValueOverall());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27318);assertEquals(1, test.monthOfYear().getMinimumValue());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27319);assertEquals(1, test.monthOfYear().getMinimumValueOverall());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27320);assertEquals(12, test.monthOfYear().getMaximumValue());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27321);assertEquals(12, test.monthOfYear().getMaximumValueOverall());
    }finally{__CLR4_4_1kwbkwblc8azunf.R.flushNeeded();}}

    public void testPropertyLeapMonthOfYear() {__CLR4_4_1kwbkwblc8azunf.R.globalSliceStart(getClass().getName(),27322);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1u62jn0l2y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kwbkwblc8azunf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kwbkwblc8azunf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyLeapMonthOfYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27322,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1u62jn0l2y(){try{__CLR4_4_1kwbkwblc8azunf.R.inc(27322);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27323);DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27324);assertEquals(false, test.monthOfYear().isLeap());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27325);assertEquals(0, test.monthOfYear().getLeapAmount());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27326);assertEquals(test.getChronology().days(), test.monthOfYear().getLeapDurationField());
        
        __CLR4_4_1kwbkwblc8azunf.R.inc(27327);test = new DateTime(2004, 2, 9, 0, 0, 0, 0);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27328);assertEquals(true, test.monthOfYear().isLeap());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27329);assertEquals(1, test.monthOfYear().getLeapAmount());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27330);assertEquals(test.getChronology().days(), test.monthOfYear().getLeapDurationField());
        
        __CLR4_4_1kwbkwblc8azunf.R.inc(27331);test = new DateTime(2003, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27332);assertEquals(false, test.monthOfYear().isLeap());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27333);assertEquals(0, test.monthOfYear().getLeapAmount());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27334);assertEquals(test.getChronology().days(), test.monthOfYear().getLeapDurationField());
        
        __CLR4_4_1kwbkwblc8azunf.R.inc(27335);test = new DateTime(2003, 2, 9, 0, 0, 0, 0);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27336);assertEquals(false, test.monthOfYear().isLeap());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27337);assertEquals(0, test.monthOfYear().getLeapAmount());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27338);assertEquals(test.getChronology().days(), test.monthOfYear().getLeapDurationField());
    }finally{__CLR4_4_1kwbkwblc8azunf.R.flushNeeded();}}

    public void testPropertyAddMonthOfYear() {__CLR4_4_1kwbkwblc8azunf.R.globalSliceStart(getClass().getName(),27339);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cfd7jl3f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kwbkwblc8azunf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kwbkwblc8azunf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyAddMonthOfYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27339,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cfd7jl3f(){try{__CLR4_4_1kwbkwblc8azunf.R.inc(27339);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27340);DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27341);DateTime copy = test.monthOfYear().addToCopy(6);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27342);assertEquals("2004-06-09T00:00:00.000+01:00", test.toString());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27343);assertEquals("2004-12-09T00:00:00.000Z", copy.toString());
        
        __CLR4_4_1kwbkwblc8azunf.R.inc(27344);copy = test.monthOfYear().addToCopy(7);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27345);assertEquals("2005-01-09T00:00:00.000Z", copy.toString());
        
        __CLR4_4_1kwbkwblc8azunf.R.inc(27346);copy = test.monthOfYear().addToCopy(-5);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27347);assertEquals("2004-01-09T00:00:00.000Z", copy.toString());
        
        __CLR4_4_1kwbkwblc8azunf.R.inc(27348);copy = test.monthOfYear().addToCopy(-6);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27349);assertEquals("2003-12-09T00:00:00.000Z", copy.toString());
        
        __CLR4_4_1kwbkwblc8azunf.R.inc(27350);test = new DateTime(2004, 1, 31, 0, 0, 0, 0);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27351);copy = test.monthOfYear().addToCopy(1);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27352);assertEquals("2004-01-31T00:00:00.000Z", test.toString());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27353);assertEquals("2004-02-29T00:00:00.000Z", copy.toString());
        
        __CLR4_4_1kwbkwblc8azunf.R.inc(27354);copy = test.monthOfYear().addToCopy(2);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27355);assertEquals("2004-03-31T00:00:00.000+01:00", copy.toString());
        
        __CLR4_4_1kwbkwblc8azunf.R.inc(27356);copy = test.monthOfYear().addToCopy(3);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27357);assertEquals("2004-04-30T00:00:00.000+01:00", copy.toString());
        
        __CLR4_4_1kwbkwblc8azunf.R.inc(27358);test = new DateTime(2003, 1, 31, 0, 0, 0, 0);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27359);copy = test.monthOfYear().addToCopy(1);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27360);assertEquals("2003-02-28T00:00:00.000Z", copy.toString());
    }finally{__CLR4_4_1kwbkwblc8azunf.R.flushNeeded();}}

    public void testPropertyAddWrapFieldMonthOfYear() {__CLR4_4_1kwbkwblc8azunf.R.globalSliceStart(getClass().getName(),27361);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1phvusll41();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kwbkwblc8azunf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kwbkwblc8azunf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyAddWrapFieldMonthOfYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27361,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1phvusll41(){try{__CLR4_4_1kwbkwblc8azunf.R.inc(27361);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27362);DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27363);DateTime copy = test.monthOfYear().addWrapFieldToCopy(4);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27364);assertEquals("2004-06-09T00:00:00.000+01:00", test.toString());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27365);assertEquals("2004-10-09T00:00:00.000+01:00", copy.toString());
        
        __CLR4_4_1kwbkwblc8azunf.R.inc(27366);copy = test.monthOfYear().addWrapFieldToCopy(8);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27367);assertEquals("2004-02-09T00:00:00.000Z", copy.toString());
        
        __CLR4_4_1kwbkwblc8azunf.R.inc(27368);copy = test.monthOfYear().addWrapFieldToCopy(-8);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27369);assertEquals("2004-10-09T00:00:00.000+01:00", copy.toString());
        
        __CLR4_4_1kwbkwblc8azunf.R.inc(27370);test = new DateTime(2004, 1, 31, 0, 0, 0, 0);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27371);copy = test.monthOfYear().addWrapFieldToCopy(1);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27372);assertEquals("2004-01-31T00:00:00.000Z", test.toString());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27373);assertEquals("2004-02-29T00:00:00.000Z", copy.toString());
        
        __CLR4_4_1kwbkwblc8azunf.R.inc(27374);copy = test.monthOfYear().addWrapFieldToCopy(2);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27375);assertEquals("2004-03-31T00:00:00.000+01:00", copy.toString());
        
        __CLR4_4_1kwbkwblc8azunf.R.inc(27376);copy = test.monthOfYear().addWrapFieldToCopy(3);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27377);assertEquals("2004-04-30T00:00:00.000+01:00", copy.toString());
        
        __CLR4_4_1kwbkwblc8azunf.R.inc(27378);test = new DateTime(2005, 1, 31, 0, 0, 0, 0);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27379);copy = test.monthOfYear().addWrapFieldToCopy(1);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27380);assertEquals("2005-01-31T00:00:00.000Z", test.toString());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27381);assertEquals("2005-02-28T00:00:00.000Z", copy.toString());
    }finally{__CLR4_4_1kwbkwblc8azunf.R.flushNeeded();}}

    public void testPropertySetMonthOfYear() {__CLR4_4_1kwbkwblc8azunf.R.globalSliceStart(getClass().getName(),27382);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1x2imu8l4m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kwbkwblc8azunf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kwbkwblc8azunf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertySetMonthOfYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27382,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1x2imu8l4m(){try{__CLR4_4_1kwbkwblc8azunf.R.inc(27382);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27383);DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27384);DateTime copy = test.monthOfYear().setCopy(12);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27385);assertEquals("2004-06-09T00:00:00.000+01:00", test.toString());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27386);assertEquals("2004-12-09T00:00:00.000Z", copy.toString());
        
        __CLR4_4_1kwbkwblc8azunf.R.inc(27387);test = new DateTime(2004, 1, 31, 0, 0, 0, 0);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27388);copy = test.monthOfYear().setCopy(2);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27389);assertEquals("2004-02-29T00:00:00.000Z", copy.toString());
        
        __CLR4_4_1kwbkwblc8azunf.R.inc(27390);try {
            __CLR4_4_1kwbkwblc8azunf.R.inc(27391);test.monthOfYear().setCopy(13);
            __CLR4_4_1kwbkwblc8azunf.R.inc(27392);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_1kwbkwblc8azunf.R.inc(27393);try {
            __CLR4_4_1kwbkwblc8azunf.R.inc(27394);test.monthOfYear().setCopy(0);
            __CLR4_4_1kwbkwblc8azunf.R.inc(27395);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1kwbkwblc8azunf.R.flushNeeded();}}

    public void testPropertySetTextMonthOfYear() {__CLR4_4_1kwbkwblc8azunf.R.globalSliceStart(getClass().getName(),27396);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kzotlfl50();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kwbkwblc8azunf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kwbkwblc8azunf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertySetTextMonthOfYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27396,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kzotlfl50(){try{__CLR4_4_1kwbkwblc8azunf.R.inc(27396);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27397);DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27398);DateTime copy = test.monthOfYear().setCopy("12");
        __CLR4_4_1kwbkwblc8azunf.R.inc(27399);assertEquals("2004-06-09T00:00:00.000+01:00", test.toString());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27400);assertEquals("2004-12-09T00:00:00.000Z", copy.toString());
        
        __CLR4_4_1kwbkwblc8azunf.R.inc(27401);copy = test.monthOfYear().setCopy("December");
        __CLR4_4_1kwbkwblc8azunf.R.inc(27402);assertEquals("2004-06-09T00:00:00.000+01:00", test.toString());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27403);assertEquals("2004-12-09T00:00:00.000Z", copy.toString());
        
        __CLR4_4_1kwbkwblc8azunf.R.inc(27404);copy = test.monthOfYear().setCopy("Dec");
        __CLR4_4_1kwbkwblc8azunf.R.inc(27405);assertEquals("2004-06-09T00:00:00.000+01:00", test.toString());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27406);assertEquals("2004-12-09T00:00:00.000Z", copy.toString());
    }finally{__CLR4_4_1kwbkwblc8azunf.R.flushNeeded();}}

    public void testPropertyCompareToMonthOfYear() {__CLR4_4_1kwbkwblc8azunf.R.globalSliceStart(getClass().getName(),27407);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q9bnr6l5b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kwbkwblc8azunf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kwbkwblc8azunf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyCompareToMonthOfYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27407,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q9bnr6l5b(){try{__CLR4_4_1kwbkwblc8azunf.R.inc(27407);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27408);DateTime test1 = new DateTime(TEST_TIME1);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27409);DateTime test2 = new DateTime(TEST_TIME2);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27410);assertEquals(true, test1.monthOfYear().compareTo(test2) < 0);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27411);assertEquals(true, test2.monthOfYear().compareTo(test1) > 0);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27412);assertEquals(true, test1.monthOfYear().compareTo(test1) == 0);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27413);try {
            __CLR4_4_1kwbkwblc8azunf.R.inc(27414);test1.monthOfYear().compareTo((ReadableInstant) null);
            __CLR4_4_1kwbkwblc8azunf.R.inc(27415);fail();
        } catch (IllegalArgumentException ex) {}
        
        __CLR4_4_1kwbkwblc8azunf.R.inc(27416);DateTime dt1 = new DateTime(TEST_TIME1);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27417);DateTime dt2 = new DateTime(TEST_TIME2);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27418);assertEquals(true, test1.monthOfYear().compareTo(dt2) < 0);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27419);assertEquals(true, test2.monthOfYear().compareTo(dt1) > 0);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27420);assertEquals(true, test1.monthOfYear().compareTo(dt1) == 0);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27421);try {
            __CLR4_4_1kwbkwblc8azunf.R.inc(27422);test1.monthOfYear().compareTo((ReadableInstant) null);
            __CLR4_4_1kwbkwblc8azunf.R.inc(27423);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1kwbkwblc8azunf.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testPropertyGetDayOfMonth() {__CLR4_4_1kwbkwblc8azunf.R.globalSliceStart(getClass().getName(),27424);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1198qu5l5s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kwbkwblc8azunf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kwbkwblc8azunf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyGetDayOfMonth",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27424,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1198qu5l5s(){try{__CLR4_4_1kwbkwblc8azunf.R.inc(27424);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27425);DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27426);assertSame(test.getChronology().dayOfMonth(), test.dayOfMonth().getField());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27427);assertEquals("dayOfMonth", test.dayOfMonth().getName());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27428);assertEquals("Property[dayOfMonth]", test.dayOfMonth().toString());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27429);assertSame(test, test.dayOfMonth().getDateTime());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27430);assertEquals(9, test.dayOfMonth().get());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27431);assertEquals("9", test.dayOfMonth().getAsString());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27432);assertEquals("9", test.dayOfMonth().getAsText());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27433);assertEquals("9", test.dayOfMonth().getAsText(Locale.FRENCH));
        __CLR4_4_1kwbkwblc8azunf.R.inc(27434);assertEquals("9", test.dayOfMonth().getAsShortText());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27435);assertEquals("9", test.dayOfMonth().getAsShortText(Locale.FRENCH));
        __CLR4_4_1kwbkwblc8azunf.R.inc(27436);assertEquals(test.getChronology().days(), test.dayOfMonth().getDurationField());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27437);assertEquals(test.getChronology().months(), test.dayOfMonth().getRangeDurationField());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27438);assertEquals(2, test.dayOfMonth().getMaximumTextLength(null));
        __CLR4_4_1kwbkwblc8azunf.R.inc(27439);assertEquals(2, test.dayOfMonth().getMaximumShortTextLength(null));
        __CLR4_4_1kwbkwblc8azunf.R.inc(27440);assertEquals(1, test.dayOfMonth().getMinimumValue());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27441);assertEquals(1, test.dayOfMonth().getMinimumValueOverall());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27442);assertEquals(30, test.dayOfMonth().getMaximumValue());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27443);assertEquals(31, test.dayOfMonth().getMaximumValueOverall());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27444);assertEquals(false, test.dayOfMonth().isLeap());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27445);assertEquals(0, test.dayOfMonth().getLeapAmount());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27446);assertEquals(null, test.dayOfMonth().getLeapDurationField());
    }finally{__CLR4_4_1kwbkwblc8azunf.R.flushNeeded();}}

    public void testPropertyGetMaxMinValuesDayOfMonth() {__CLR4_4_1kwbkwblc8azunf.R.globalSliceStart(getClass().getName(),27447);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13zmdrhl6f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kwbkwblc8azunf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kwbkwblc8azunf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyGetMaxMinValuesDayOfMonth",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27447,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13zmdrhl6f(){try{__CLR4_4_1kwbkwblc8azunf.R.inc(27447);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27448);DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27449);assertEquals(1, test.dayOfMonth().getMinimumValue());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27450);assertEquals(1, test.dayOfMonth().getMinimumValueOverall());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27451);assertEquals(30, test.dayOfMonth().getMaximumValue());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27452);assertEquals(31, test.dayOfMonth().getMaximumValueOverall());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27453);test = new DateTime(2004, 7, 9, 0, 0, 0, 0);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27454);assertEquals(31, test.dayOfMonth().getMaximumValue());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27455);test = new DateTime(2004, 2, 9, 0, 0, 0, 0);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27456);assertEquals(29, test.dayOfMonth().getMaximumValue());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27457);test = new DateTime(2003, 2, 9, 0, 0, 0, 0);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27458);assertEquals(28, test.dayOfMonth().getMaximumValue());
    }finally{__CLR4_4_1kwbkwblc8azunf.R.flushNeeded();}}

    public void testPropertyAddDayOfMonth() {__CLR4_4_1kwbkwblc8azunf.R.globalSliceStart(getClass().getName(),27459);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1o1ulyql6r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kwbkwblc8azunf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kwbkwblc8azunf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyAddDayOfMonth",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27459,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1o1ulyql6r(){try{__CLR4_4_1kwbkwblc8azunf.R.inc(27459);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27460);DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27461);DateTime copy = test.dayOfMonth().addToCopy(9);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27462);assertEquals("2004-06-09T00:00:00.000+01:00", test.toString());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27463);assertEquals("2004-06-18T00:00:00.000+01:00", copy.toString());
        
        __CLR4_4_1kwbkwblc8azunf.R.inc(27464);copy = test.dayOfMonth().addToCopy(21);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27465);assertEquals("2004-06-30T00:00:00.000+01:00", copy.toString());
        
        __CLR4_4_1kwbkwblc8azunf.R.inc(27466);copy = test.dayOfMonth().addToCopy(22);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27467);assertEquals("2004-07-01T00:00:00.000+01:00", copy.toString());
        
        __CLR4_4_1kwbkwblc8azunf.R.inc(27468);copy = test.dayOfMonth().addToCopy(22 + 30);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27469);assertEquals("2004-07-31T00:00:00.000+01:00", copy.toString());
        
        __CLR4_4_1kwbkwblc8azunf.R.inc(27470);copy = test.dayOfMonth().addToCopy(22 + 31);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27471);assertEquals("2004-08-01T00:00:00.000+01:00", copy.toString());

        __CLR4_4_1kwbkwblc8azunf.R.inc(27472);copy = test.dayOfMonth().addToCopy(21 + 31 + 31 + 30 + 31 + 30 + 31);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27473);assertEquals("2004-12-31T00:00:00.000Z", copy.toString());
        
        __CLR4_4_1kwbkwblc8azunf.R.inc(27474);copy = test.dayOfMonth().addToCopy(22 + 31 + 31 + 30 + 31 + 30 + 31);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27475);assertEquals("2005-01-01T00:00:00.000Z", copy.toString());
        
        __CLR4_4_1kwbkwblc8azunf.R.inc(27476);copy = test.dayOfMonth().addToCopy(-8);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27477);assertEquals("2004-06-01T00:00:00.000+01:00", copy.toString());
        
        __CLR4_4_1kwbkwblc8azunf.R.inc(27478);copy = test.dayOfMonth().addToCopy(-9);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27479);assertEquals("2004-05-31T00:00:00.000+01:00", copy.toString());
        
        __CLR4_4_1kwbkwblc8azunf.R.inc(27480);copy = test.dayOfMonth().addToCopy(-8 - 31 - 30 - 31 - 29 - 31);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27481);assertEquals("2004-01-01T00:00:00.000Z", copy.toString());
        
        __CLR4_4_1kwbkwblc8azunf.R.inc(27482);copy = test.dayOfMonth().addToCopy(-9 - 31 - 30 - 31 - 29 - 31);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27483);assertEquals("2003-12-31T00:00:00.000Z", copy.toString());
    }finally{__CLR4_4_1kwbkwblc8azunf.R.flushNeeded();}}

    public void testPropertyAddWrapFieldDayOfMonth() {__CLR4_4_1kwbkwblc8azunf.R.globalSliceStart(getClass().getName(),27484);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dfyjyil7g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kwbkwblc8azunf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kwbkwblc8azunf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyAddWrapFieldDayOfMonth",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27484,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dfyjyil7g(){try{__CLR4_4_1kwbkwblc8azunf.R.inc(27484);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27485);DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27486);DateTime copy = test.dayOfMonth().addWrapFieldToCopy(21);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27487);assertEquals("2004-06-09T00:00:00.000+01:00", test.toString());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27488);assertEquals("2004-06-30T00:00:00.000+01:00", copy.toString());
        
        __CLR4_4_1kwbkwblc8azunf.R.inc(27489);copy = test.dayOfMonth().addWrapFieldToCopy(22);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27490);assertEquals("2004-06-01T00:00:00.000+01:00", copy.toString());
        
        __CLR4_4_1kwbkwblc8azunf.R.inc(27491);copy = test.dayOfMonth().addWrapFieldToCopy(-12);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27492);assertEquals("2004-06-27T00:00:00.000+01:00", copy.toString());
        
        __CLR4_4_1kwbkwblc8azunf.R.inc(27493);test = new DateTime(2004, 7, 9, 0, 0, 0, 0);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27494);copy = test.dayOfMonth().addWrapFieldToCopy(21);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27495);assertEquals("2004-07-30T00:00:00.000+01:00", copy.toString());
    
        __CLR4_4_1kwbkwblc8azunf.R.inc(27496);copy = test.dayOfMonth().addWrapFieldToCopy(22);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27497);assertEquals("2004-07-31T00:00:00.000+01:00", copy.toString());
    
        __CLR4_4_1kwbkwblc8azunf.R.inc(27498);copy = test.dayOfMonth().addWrapFieldToCopy(23);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27499);assertEquals("2004-07-01T00:00:00.000+01:00", copy.toString());
    
        __CLR4_4_1kwbkwblc8azunf.R.inc(27500);copy = test.dayOfMonth().addWrapFieldToCopy(-12);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27501);assertEquals("2004-07-28T00:00:00.000+01:00", copy.toString());
    }finally{__CLR4_4_1kwbkwblc8azunf.R.flushNeeded();}}

    public void testPropertySetDayOfMonth() {__CLR4_4_1kwbkwblc8azunf.R.globalSliceStart(getClass().getName(),27502);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mz1n4hl7y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kwbkwblc8azunf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kwbkwblc8azunf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertySetDayOfMonth",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27502,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mz1n4hl7y(){try{__CLR4_4_1kwbkwblc8azunf.R.inc(27502);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27503);DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27504);DateTime copy = test.dayOfMonth().setCopy(12);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27505);assertEquals("2004-06-09T00:00:00.000+01:00", test.toString());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27506);assertEquals("2004-06-12T00:00:00.000+01:00", copy.toString());
        
        __CLR4_4_1kwbkwblc8azunf.R.inc(27507);try {
            __CLR4_4_1kwbkwblc8azunf.R.inc(27508);test.dayOfMonth().setCopy(31);
            __CLR4_4_1kwbkwblc8azunf.R.inc(27509);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_1kwbkwblc8azunf.R.inc(27510);try {
            __CLR4_4_1kwbkwblc8azunf.R.inc(27511);test.dayOfMonth().setCopy(0);
            __CLR4_4_1kwbkwblc8azunf.R.inc(27512);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1kwbkwblc8azunf.R.flushNeeded();}}

    public void testPropertySetTextDayOfMonth() {__CLR4_4_1kwbkwblc8azunf.R.globalSliceStart(getClass().getName(),27513);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_144rzx8l89();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kwbkwblc8azunf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kwbkwblc8azunf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertySetTextDayOfMonth",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27513,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_144rzx8l89(){try{__CLR4_4_1kwbkwblc8azunf.R.inc(27513);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27514);DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27515);DateTime copy = test.dayOfMonth().setCopy("12");
        __CLR4_4_1kwbkwblc8azunf.R.inc(27516);assertEquals("2004-06-09T00:00:00.000+01:00", test.toString());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27517);assertEquals("2004-06-12T00:00:00.000+01:00", copy.toString());
    }finally{__CLR4_4_1kwbkwblc8azunf.R.flushNeeded();}}

    public void testPropertyWithMaximumValueDayOfMonth() {__CLR4_4_1kwbkwblc8azunf.R.globalSliceStart(getClass().getName(),27518);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f2wa9el8e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kwbkwblc8azunf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kwbkwblc8azunf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyWithMaximumValueDayOfMonth",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27518,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f2wa9el8e(){try{__CLR4_4_1kwbkwblc8azunf.R.inc(27518);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27519);DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27520);DateTime copy = test.dayOfMonth().withMaximumValue();
        __CLR4_4_1kwbkwblc8azunf.R.inc(27521);assertEquals("2004-06-09T00:00:00.000+01:00", test.toString());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27522);assertEquals("2004-06-30T00:00:00.000+01:00", copy.toString());
    }finally{__CLR4_4_1kwbkwblc8azunf.R.flushNeeded();}}

    public void testPropertyWithMaximumValueMillisOfDayDSTGap() {__CLR4_4_1kwbkwblc8azunf.R.globalSliceStart(getClass().getName(),27523);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1zgr0snl8j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kwbkwblc8azunf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kwbkwblc8azunf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyWithMaximumValueMillisOfDayDSTGap",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27523,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1zgr0snl8j(){try{__CLR4_4_1kwbkwblc8azunf.R.inc(27523);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27524);DateTimeZone paris = DateTimeZone.forID("Europe/Paris");
        __CLR4_4_1kwbkwblc8azunf.R.inc(27525);DateTime dt = new DateTime(1926, 4, 17, 18, 0, 0, 0, paris);  // DST gap 23:00 to 00:00
        __CLR4_4_1kwbkwblc8azunf.R.inc(27526);DateTime test = dt.millisOfDay().withMaximumValue();
        __CLR4_4_1kwbkwblc8azunf.R.inc(27527);assertEquals("1926-04-17T22:59:59.999Z", test.toString());
    }finally{__CLR4_4_1kwbkwblc8azunf.R.flushNeeded();}}

    public void testPropertyWithMinimumValueDayOfMonth() {__CLR4_4_1kwbkwblc8azunf.R.globalSliceStart(getClass().getName(),27528);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1duofekl8o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kwbkwblc8azunf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kwbkwblc8azunf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyWithMinimumValueDayOfMonth",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27528,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1duofekl8o(){try{__CLR4_4_1kwbkwblc8azunf.R.inc(27528);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27529);DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27530);DateTime copy = test.dayOfMonth().withMinimumValue();
        __CLR4_4_1kwbkwblc8azunf.R.inc(27531);assertEquals("2004-06-09T00:00:00.000+01:00", test.toString());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27532);assertEquals("2004-06-01T00:00:00.000+01:00", copy.toString());
    }finally{__CLR4_4_1kwbkwblc8azunf.R.flushNeeded();}}

    public void testPropertyWithMinimumValueMillisOfDayDSTGap() {__CLR4_4_1kwbkwblc8azunf.R.globalSliceStart(getClass().getName(),27533);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uctn8nl8t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kwbkwblc8azunf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kwbkwblc8azunf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyWithMinimumValueMillisOfDayDSTGap",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27533,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uctn8nl8t(){try{__CLR4_4_1kwbkwblc8azunf.R.inc(27533);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27534);DateTimeZone gaza = DateTimeZone.forID("Asia/Gaza");
        __CLR4_4_1kwbkwblc8azunf.R.inc(27535);DateTime dt = new DateTime(2001, 4, 20, 18, 0, 0, 0, gaza);  // DST gap 00:00 to 01:00
        __CLR4_4_1kwbkwblc8azunf.R.inc(27536);DateTime test = dt.millisOfDay().withMinimumValue();
        __CLR4_4_1kwbkwblc8azunf.R.inc(27537);assertEquals("2001-04-20T01:00:00.000+03:00", test.toString());
    }finally{__CLR4_4_1kwbkwblc8azunf.R.flushNeeded();}}

    public void testPropertyCompareToDayOfMonth() {__CLR4_4_1kwbkwblc8azunf.R.globalSliceStart(getClass().getName(),27538);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wcwl0zl8y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kwbkwblc8azunf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kwbkwblc8azunf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyCompareToDayOfMonth",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27538,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wcwl0zl8y(){try{__CLR4_4_1kwbkwblc8azunf.R.inc(27538);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27539);DateTime test1 = new DateTime(TEST_TIME1);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27540);DateTime test2 = new DateTime(TEST_TIME2);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27541);assertEquals(true, test1.dayOfMonth().compareTo(test2) < 0);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27542);assertEquals(true, test2.dayOfMonth().compareTo(test1) > 0);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27543);assertEquals(true, test1.dayOfMonth().compareTo(test1) == 0);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27544);try {
            __CLR4_4_1kwbkwblc8azunf.R.inc(27545);test1.dayOfMonth().compareTo((ReadableInstant) null);
            __CLR4_4_1kwbkwblc8azunf.R.inc(27546);fail();
        } catch (IllegalArgumentException ex) {}
        
        __CLR4_4_1kwbkwblc8azunf.R.inc(27547);DateTime dt1 = new DateTime(TEST_TIME1);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27548);DateTime dt2 = new DateTime(TEST_TIME2);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27549);assertEquals(true, test1.dayOfMonth().compareTo(dt2) < 0);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27550);assertEquals(true, test2.dayOfMonth().compareTo(dt1) > 0);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27551);assertEquals(true, test1.dayOfMonth().compareTo(dt1) == 0);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27552);try {
            __CLR4_4_1kwbkwblc8azunf.R.inc(27553);test1.dayOfMonth().compareTo((ReadableInstant) null);
            __CLR4_4_1kwbkwblc8azunf.R.inc(27554);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1kwbkwblc8azunf.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testPropertyGetDayOfYear() {__CLR4_4_1kwbkwblc8azunf.R.globalSliceStart(getClass().getName(),27555);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fvk08l9f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kwbkwblc8azunf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kwbkwblc8azunf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyGetDayOfYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27555,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fvk08l9f(){try{__CLR4_4_1kwbkwblc8azunf.R.inc(27555);
        // 31+29+31+30+31+9 = 161
        __CLR4_4_1kwbkwblc8azunf.R.inc(27556);DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27557);assertSame(test.getChronology().dayOfYear(), test.dayOfYear().getField());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27558);assertEquals("dayOfYear", test.dayOfYear().getName());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27559);assertEquals("Property[dayOfYear]", test.dayOfYear().toString());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27560);assertSame(test, test.dayOfYear().getDateTime());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27561);assertEquals(161, test.dayOfYear().get());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27562);assertEquals("161", test.dayOfYear().getAsString());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27563);assertEquals("161", test.dayOfYear().getAsText());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27564);assertEquals("161", test.dayOfYear().getAsText(Locale.FRENCH));
        __CLR4_4_1kwbkwblc8azunf.R.inc(27565);assertEquals("161", test.dayOfYear().getAsShortText());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27566);assertEquals("161", test.dayOfYear().getAsShortText(Locale.FRENCH));
        __CLR4_4_1kwbkwblc8azunf.R.inc(27567);assertEquals(test.getChronology().days(), test.dayOfYear().getDurationField());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27568);assertEquals(test.getChronology().years(), test.dayOfYear().getRangeDurationField());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27569);assertEquals(3, test.dayOfYear().getMaximumTextLength(null));
        __CLR4_4_1kwbkwblc8azunf.R.inc(27570);assertEquals(3, test.dayOfYear().getMaximumShortTextLength(null));
        __CLR4_4_1kwbkwblc8azunf.R.inc(27571);assertEquals(false, test.dayOfYear().isLeap());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27572);assertEquals(0, test.dayOfYear().getLeapAmount());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27573);assertEquals(null, test.dayOfYear().getLeapDurationField());
    }finally{__CLR4_4_1kwbkwblc8azunf.R.flushNeeded();}}

    public void testPropertyGetMaxMinValuesDayOfYear() {__CLR4_4_1kwbkwblc8azunf.R.globalSliceStart(getClass().getName(),27574);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1u51gm0l9y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kwbkwblc8azunf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kwbkwblc8azunf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyGetMaxMinValuesDayOfYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27574,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1u51gm0l9y(){try{__CLR4_4_1kwbkwblc8azunf.R.inc(27574);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27575);DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27576);assertEquals(1, test.dayOfYear().getMinimumValue());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27577);assertEquals(1, test.dayOfYear().getMinimumValueOverall());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27578);assertEquals(366, test.dayOfYear().getMaximumValue());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27579);assertEquals(366, test.dayOfYear().getMaximumValueOverall());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27580);test = new DateTime(2002, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27581);assertEquals(365, test.dayOfYear().getMaximumValue());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27582);assertEquals(366, test.dayOfYear().getMaximumValueOverall());
    }finally{__CLR4_4_1kwbkwblc8azunf.R.flushNeeded();}}

    public void testPropertyAddDayOfYear() {__CLR4_4_1kwbkwblc8azunf.R.globalSliceStart(getClass().getName(),27583);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14adoxpla7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kwbkwblc8azunf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kwbkwblc8azunf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyAddDayOfYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27583,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14adoxpla7(){try{__CLR4_4_1kwbkwblc8azunf.R.inc(27583);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27584);DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27585);DateTime copy = test.dayOfYear().addToCopy(9);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27586);assertEquals("2004-06-09T00:00:00.000+01:00", test.toString());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27587);assertEquals("2004-06-18T00:00:00.000+01:00", copy.toString());
        
        __CLR4_4_1kwbkwblc8azunf.R.inc(27588);copy = test.dayOfYear().addToCopy(21);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27589);assertEquals("2004-06-30T00:00:00.000+01:00", copy.toString());
        
        __CLR4_4_1kwbkwblc8azunf.R.inc(27590);copy = test.dayOfYear().addToCopy(22);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27591);assertEquals("2004-07-01T00:00:00.000+01:00", copy.toString());
        
        __CLR4_4_1kwbkwblc8azunf.R.inc(27592);copy = test.dayOfYear().addToCopy(21 + 31 + 31 + 30 + 31 + 30 + 31);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27593);assertEquals("2004-12-31T00:00:00.000Z", copy.toString());
        
        __CLR4_4_1kwbkwblc8azunf.R.inc(27594);copy = test.dayOfYear().addToCopy(22 + 31 + 31 + 30 + 31 + 30 + 31);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27595);assertEquals("2005-01-01T00:00:00.000Z", copy.toString());
        
        __CLR4_4_1kwbkwblc8azunf.R.inc(27596);copy = test.dayOfYear().addToCopy(-8);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27597);assertEquals("2004-06-01T00:00:00.000+01:00", copy.toString());
        
        __CLR4_4_1kwbkwblc8azunf.R.inc(27598);copy = test.dayOfYear().addToCopy(-9);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27599);assertEquals("2004-05-31T00:00:00.000+01:00", copy.toString());
        
        __CLR4_4_1kwbkwblc8azunf.R.inc(27600);copy = test.dayOfYear().addToCopy(-8 - 31 - 30 - 31 - 29 - 31);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27601);assertEquals("2004-01-01T00:00:00.000Z", copy.toString());
        
        __CLR4_4_1kwbkwblc8azunf.R.inc(27602);copy = test.dayOfYear().addToCopy(-9 - 31 - 30 - 31 - 29 - 31);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27603);assertEquals("2003-12-31T00:00:00.000Z", copy.toString());
    }finally{__CLR4_4_1kwbkwblc8azunf.R.flushNeeded();}}

    public void testPropertyAddWrapFieldDayOfYear() {__CLR4_4_1kwbkwblc8azunf.R.globalSliceStart(getClass().getName(),27604);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_137fnwhlas();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kwbkwblc8azunf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kwbkwblc8azunf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyAddWrapFieldDayOfYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27604,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_137fnwhlas(){try{__CLR4_4_1kwbkwblc8azunf.R.inc(27604);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27605);DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27606);DateTime copy = test.dayOfYear().addWrapFieldToCopy(21);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27607);assertEquals("2004-06-09T00:00:00.000+01:00", test.toString());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27608);assertEquals("2004-06-30T00:00:00.000+01:00", copy.toString());
        
        __CLR4_4_1kwbkwblc8azunf.R.inc(27609);copy = test.dayOfYear().addWrapFieldToCopy(22);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27610);assertEquals("2004-07-01T00:00:00.000+01:00", copy.toString());
        
        __CLR4_4_1kwbkwblc8azunf.R.inc(27611);copy = test.dayOfYear().addWrapFieldToCopy(-12);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27612);assertEquals("2004-05-28T00:00:00.000+01:00", copy.toString());
        
        __CLR4_4_1kwbkwblc8azunf.R.inc(27613);copy = test.dayOfYear().addWrapFieldToCopy(205);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27614);assertEquals("2004-12-31T00:00:00.000Z", copy.toString());
        
        __CLR4_4_1kwbkwblc8azunf.R.inc(27615);copy = test.dayOfYear().addWrapFieldToCopy(206);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27616);assertEquals("2004-01-01T00:00:00.000Z", copy.toString());
        
        __CLR4_4_1kwbkwblc8azunf.R.inc(27617);copy = test.dayOfYear().addWrapFieldToCopy(-160);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27618);assertEquals("2004-01-01T00:00:00.000Z", copy.toString());
        
        __CLR4_4_1kwbkwblc8azunf.R.inc(27619);copy = test.dayOfYear().addWrapFieldToCopy(-161);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27620);assertEquals("2004-12-31T00:00:00.000Z", copy.toString());
    }finally{__CLR4_4_1kwbkwblc8azunf.R.flushNeeded();}}

    public void testPropertySetDayOfYear() {__CLR4_4_1kwbkwblc8azunf.R.globalSliceStart(getClass().getName(),27621);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tizt30lb9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kwbkwblc8azunf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kwbkwblc8azunf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertySetDayOfYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27621,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tizt30lb9(){try{__CLR4_4_1kwbkwblc8azunf.R.inc(27621);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27622);DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27623);DateTime copy = test.dayOfYear().setCopy(12);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27624);assertEquals("2004-06-09T00:00:00.000+01:00", test.toString());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27625);assertEquals("2004-01-12T00:00:00.000Z", copy.toString());
        
        __CLR4_4_1kwbkwblc8azunf.R.inc(27626);try {
            __CLR4_4_1kwbkwblc8azunf.R.inc(27627);test.dayOfYear().setCopy(367);
            __CLR4_4_1kwbkwblc8azunf.R.inc(27628);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_1kwbkwblc8azunf.R.inc(27629);try {
            __CLR4_4_1kwbkwblc8azunf.R.inc(27630);test.dayOfYear().setCopy(0);
            __CLR4_4_1kwbkwblc8azunf.R.inc(27631);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1kwbkwblc8azunf.R.flushNeeded();}}

    public void testPropertySetTextDayOfYear() {__CLR4_4_1kwbkwblc8azunf.R.globalSliceStart(getClass().getName(),27632);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hprj4hlbk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kwbkwblc8azunf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kwbkwblc8azunf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertySetTextDayOfYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27632,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hprj4hlbk(){try{__CLR4_4_1kwbkwblc8azunf.R.inc(27632);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27633);DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27634);DateTime copy = test.dayOfYear().setCopy("12");
        __CLR4_4_1kwbkwblc8azunf.R.inc(27635);assertEquals("2004-06-09T00:00:00.000+01:00", test.toString());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27636);assertEquals("2004-01-12T00:00:00.000Z", copy.toString());
    }finally{__CLR4_4_1kwbkwblc8azunf.R.flushNeeded();}}

    public void testPropertyCompareToDayOfYear() {__CLR4_4_1kwbkwblc8azunf.R.globalSliceStart(getClass().getName(),27637);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1c0og4ilbp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kwbkwblc8azunf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kwbkwblc8azunf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyCompareToDayOfYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27637,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1c0og4ilbp(){try{__CLR4_4_1kwbkwblc8azunf.R.inc(27637);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27638);DateTime test1 = new DateTime(TEST_TIME1);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27639);DateTime test2 = new DateTime(TEST_TIME2);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27640);assertEquals(true, test1.dayOfYear().compareTo(test2) < 0);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27641);assertEquals(true, test2.dayOfYear().compareTo(test1) > 0);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27642);assertEquals(true, test1.dayOfYear().compareTo(test1) == 0);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27643);try {
            __CLR4_4_1kwbkwblc8azunf.R.inc(27644);test1.dayOfYear().compareTo((ReadableInstant) null);
            __CLR4_4_1kwbkwblc8azunf.R.inc(27645);fail();
        } catch (IllegalArgumentException ex) {}
        
        __CLR4_4_1kwbkwblc8azunf.R.inc(27646);DateTime dt1 = new DateTime(TEST_TIME1);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27647);DateTime dt2 = new DateTime(TEST_TIME2);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27648);assertEquals(true, test1.dayOfYear().compareTo(dt2) < 0);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27649);assertEquals(true, test2.dayOfYear().compareTo(dt1) > 0);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27650);assertEquals(true, test1.dayOfYear().compareTo(dt1) == 0);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27651);try {
            __CLR4_4_1kwbkwblc8azunf.R.inc(27652);test1.dayOfYear().compareTo((ReadableInstant) null);
            __CLR4_4_1kwbkwblc8azunf.R.inc(27653);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1kwbkwblc8azunf.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testPropertyGetWeekOfWeekyear() {__CLR4_4_1kwbkwblc8azunf.R.globalSliceStart(getClass().getName(),27654);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1oty2c2lc6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kwbkwblc8azunf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kwbkwblc8azunf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyGetWeekOfWeekyear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27654,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1oty2c2lc6(){try{__CLR4_4_1kwbkwblc8azunf.R.inc(27654);
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
        __CLR4_4_1kwbkwblc8azunf.R.inc(27655);DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27656);assertSame(test.getChronology().weekOfWeekyear(), test.weekOfWeekyear().getField());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27657);assertEquals("weekOfWeekyear", test.weekOfWeekyear().getName());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27658);assertEquals("Property[weekOfWeekyear]", test.weekOfWeekyear().toString());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27659);assertSame(test, test.weekOfWeekyear().getDateTime());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27660);assertEquals(24, test.weekOfWeekyear().get());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27661);assertEquals("24", test.weekOfWeekyear().getAsString());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27662);assertEquals("24", test.weekOfWeekyear().getAsText());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27663);assertEquals("24", test.weekOfWeekyear().getAsText(Locale.FRENCH));
        __CLR4_4_1kwbkwblc8azunf.R.inc(27664);assertEquals("24", test.weekOfWeekyear().getAsShortText());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27665);assertEquals("24", test.weekOfWeekyear().getAsShortText(Locale.FRENCH));
        __CLR4_4_1kwbkwblc8azunf.R.inc(27666);assertEquals(test.getChronology().weeks(), test.weekOfWeekyear().getDurationField());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27667);assertEquals(test.getChronology().weekyears(), test.weekOfWeekyear().getRangeDurationField());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27668);assertEquals(2, test.weekOfWeekyear().getMaximumTextLength(null));
        __CLR4_4_1kwbkwblc8azunf.R.inc(27669);assertEquals(2, test.weekOfWeekyear().getMaximumShortTextLength(null));
        __CLR4_4_1kwbkwblc8azunf.R.inc(27670);assertEquals(false, test.weekOfWeekyear().isLeap());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27671);assertEquals(0, test.weekOfWeekyear().getLeapAmount());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27672);assertEquals(null, test.weekOfWeekyear().getLeapDurationField());
    }finally{__CLR4_4_1kwbkwblc8azunf.R.flushNeeded();}}

    public void testPropertyGetMaxMinValuesWeekOfWeekyear() {__CLR4_4_1kwbkwblc8azunf.R.globalSliceStart(getClass().getName(),27673);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_161bj0ilcp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kwbkwblc8azunf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kwbkwblc8azunf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyGetMaxMinValuesWeekOfWeekyear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27673,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_161bj0ilcp(){try{__CLR4_4_1kwbkwblc8azunf.R.inc(27673);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27674);DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27675);assertEquals(1, test.weekOfWeekyear().getMinimumValue());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27676);assertEquals(1, test.weekOfWeekyear().getMinimumValueOverall());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27677);assertEquals(53, test.weekOfWeekyear().getMaximumValue());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27678);assertEquals(53, test.weekOfWeekyear().getMaximumValueOverall());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27679);test = new DateTime(2005, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27680);assertEquals(52, test.weekOfWeekyear().getMaximumValue());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27681);assertEquals(53, test.weekOfWeekyear().getMaximumValueOverall());
    }finally{__CLR4_4_1kwbkwblc8azunf.R.flushNeeded();}}

    public void testPropertyAddWeekOfWeekyear() {__CLR4_4_1kwbkwblc8azunf.R.globalSliceStart(getClass().getName(),27682);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1o69karlcy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kwbkwblc8azunf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kwbkwblc8azunf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyAddWeekOfWeekyear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27682,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1o69karlcy(){try{__CLR4_4_1kwbkwblc8azunf.R.inc(27682);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27683);DateTime test = new DateTime(2004, 6, 7, 0, 0, 0, 0);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27684);DateTime copy = test.weekOfWeekyear().addToCopy(1);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27685);assertEquals("2004-06-07T00:00:00.000+01:00", test.toString());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27686);assertEquals("2004-06-14T00:00:00.000+01:00", copy.toString());
        
        __CLR4_4_1kwbkwblc8azunf.R.inc(27687);copy = test.weekOfWeekyear().addToCopy(29);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27688);assertEquals("2004-12-27T00:00:00.000Z", copy.toString());
        
        __CLR4_4_1kwbkwblc8azunf.R.inc(27689);copy = test.weekOfWeekyear().addToCopy(30);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27690);assertEquals("2005-01-03T00:00:00.000Z", copy.toString());
        
        __CLR4_4_1kwbkwblc8azunf.R.inc(27691);copy = test.weekOfWeekyear().addToCopy(-22);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27692);assertEquals("2004-01-05T00:00:00.000Z", copy.toString());
        
        __CLR4_4_1kwbkwblc8azunf.R.inc(27693);copy = test.weekOfWeekyear().addToCopy(-23);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27694);assertEquals("2003-12-29T00:00:00.000Z", copy.toString());
    }finally{__CLR4_4_1kwbkwblc8azunf.R.flushNeeded();}}

    public void testPropertyAddWrapFieldWeekOfWeekyear() {__CLR4_4_1kwbkwblc8azunf.R.globalSliceStart(getClass().getName(),27695);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11nrj95ldb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kwbkwblc8azunf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kwbkwblc8azunf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyAddWrapFieldWeekOfWeekyear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27695,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11nrj95ldb(){try{__CLR4_4_1kwbkwblc8azunf.R.inc(27695);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27696);DateTime test = new DateTime(2004, 6, 7, 0, 0, 0, 0);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27697);DateTime copy = test.weekOfWeekyear().addWrapFieldToCopy(1);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27698);assertEquals("2004-06-07T00:00:00.000+01:00", test.toString());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27699);assertEquals("2004-06-14T00:00:00.000+01:00", copy.toString());
        
        __CLR4_4_1kwbkwblc8azunf.R.inc(27700);copy = test.weekOfWeekyear().addWrapFieldToCopy(29);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27701);assertEquals("2004-12-27T00:00:00.000Z", copy.toString());
        
        __CLR4_4_1kwbkwblc8azunf.R.inc(27702);copy = test.weekOfWeekyear().addWrapFieldToCopy(30);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27703);assertEquals("2003-12-29T00:00:00.000Z", copy.toString());
        
        __CLR4_4_1kwbkwblc8azunf.R.inc(27704);copy = test.weekOfWeekyear().addWrapFieldToCopy(-23);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27705);assertEquals("2003-12-29T00:00:00.000Z", copy.toString());
    }finally{__CLR4_4_1kwbkwblc8azunf.R.flushNeeded();}}

    public void testPropertySetWeekOfWeekyear() {__CLR4_4_1kwbkwblc8azunf.R.globalSliceStart(getClass().getName(),27706);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1iobpweldm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kwbkwblc8azunf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kwbkwblc8azunf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertySetWeekOfWeekyear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27706,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1iobpweldm(){try{__CLR4_4_1kwbkwblc8azunf.R.inc(27706);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27707);DateTime test = new DateTime(2004, 6, 7, 0, 0, 0, 0);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27708);DateTime copy = test.weekOfWeekyear().setCopy(4);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27709);assertEquals("2004-06-07T00:00:00.000+01:00", test.toString());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27710);assertEquals("2004-01-19T00:00:00.000Z", copy.toString());
        
        __CLR4_4_1kwbkwblc8azunf.R.inc(27711);try {
            __CLR4_4_1kwbkwblc8azunf.R.inc(27712);test.weekOfWeekyear().setCopy(54);
            __CLR4_4_1kwbkwblc8azunf.R.inc(27713);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_1kwbkwblc8azunf.R.inc(27714);try {
            __CLR4_4_1kwbkwblc8azunf.R.inc(27715);test.weekOfWeekyear().setCopy(0);
            __CLR4_4_1kwbkwblc8azunf.R.inc(27716);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1kwbkwblc8azunf.R.flushNeeded();}}

    public void testPropertySetTextWeekOfWeekyear() {__CLR4_4_1kwbkwblc8azunf.R.globalSliceStart(getClass().getName(),27717);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1swdyyzldx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kwbkwblc8azunf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kwbkwblc8azunf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertySetTextWeekOfWeekyear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27717,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1swdyyzldx(){try{__CLR4_4_1kwbkwblc8azunf.R.inc(27717);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27718);DateTime test = new DateTime(2004, 6, 7, 0, 0, 0, 0);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27719);DateTime copy = test.weekOfWeekyear().setCopy("4");
        __CLR4_4_1kwbkwblc8azunf.R.inc(27720);assertEquals("2004-06-07T00:00:00.000+01:00", test.toString());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27721);assertEquals("2004-01-19T00:00:00.000Z", copy.toString());
    }finally{__CLR4_4_1kwbkwblc8azunf.R.flushNeeded();}}

    public void testPropertyCompareToWeekOfWeekyear() {__CLR4_4_1kwbkwblc8azunf.R.globalSliceStart(getClass().getName(),27722);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lona6cle2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kwbkwblc8azunf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kwbkwblc8azunf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyCompareToWeekOfWeekyear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27722,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lona6cle2(){try{__CLR4_4_1kwbkwblc8azunf.R.inc(27722);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27723);DateTime test1 = new DateTime(TEST_TIME1);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27724);DateTime test2 = new DateTime(TEST_TIME2);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27725);assertEquals(true, test1.weekOfWeekyear().compareTo(test2) < 0);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27726);assertEquals(true, test2.weekOfWeekyear().compareTo(test1) > 0);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27727);assertEquals(true, test1.weekOfWeekyear().compareTo(test1) == 0);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27728);try {
            __CLR4_4_1kwbkwblc8azunf.R.inc(27729);test1.weekOfWeekyear().compareTo((ReadableInstant) null);
            __CLR4_4_1kwbkwblc8azunf.R.inc(27730);fail();
        } catch (IllegalArgumentException ex) {}
        
        __CLR4_4_1kwbkwblc8azunf.R.inc(27731);DateTime dt1 = new DateTime(TEST_TIME1);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27732);DateTime dt2 = new DateTime(TEST_TIME2);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27733);assertEquals(true, test1.weekOfWeekyear().compareTo(dt2) < 0);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27734);assertEquals(true, test2.weekOfWeekyear().compareTo(dt1) > 0);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27735);assertEquals(true, test1.weekOfWeekyear().compareTo(dt1) == 0);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27736);try {
            __CLR4_4_1kwbkwblc8azunf.R.inc(27737);test1.weekOfWeekyear().compareTo((ReadableInstant) null);
            __CLR4_4_1kwbkwblc8azunf.R.inc(27738);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1kwbkwblc8azunf.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testPropertyGetDayOfWeek() {__CLR4_4_1kwbkwblc8azunf.R.globalSliceStart(getClass().getName(),27739);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ftu28vlej();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kwbkwblc8azunf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kwbkwblc8azunf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyGetDayOfWeek",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27739,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ftu28vlej(){try{__CLR4_4_1kwbkwblc8azunf.R.inc(27739);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27740);DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27741);assertSame(test.getChronology().dayOfWeek(), test.dayOfWeek().getField());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27742);assertEquals("dayOfWeek", test.dayOfWeek().getName());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27743);assertEquals("Property[dayOfWeek]", test.dayOfWeek().toString());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27744);assertSame(test, test.dayOfWeek().getDateTime());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27745);assertEquals(3, test.dayOfWeek().get());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27746);assertEquals("3", test.dayOfWeek().getAsString());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27747);assertEquals("Wednesday", test.dayOfWeek().getAsText());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27748);assertEquals("Wednesday", test.dayOfWeek().getField().getAsText(3, Locale.ENGLISH));
        __CLR4_4_1kwbkwblc8azunf.R.inc(27749);assertEquals("mercredi", test.dayOfWeek().getAsText(Locale.FRENCH));
        __CLR4_4_1kwbkwblc8azunf.R.inc(27750);assertEquals("mercredi", test.dayOfWeek().getField().getAsText(3, Locale.FRENCH));
        __CLR4_4_1kwbkwblc8azunf.R.inc(27751);assertEquals("Wed", test.dayOfWeek().getAsShortText());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27752);assertEquals("Wed", test.dayOfWeek().getField().getAsShortText(3, Locale.ENGLISH));
        __CLR4_4_1kwbkwblc8azunf.R.inc(27753);assertEquals("mer.", test.dayOfWeek().getAsShortText(Locale.FRENCH));
        __CLR4_4_1kwbkwblc8azunf.R.inc(27754);assertEquals("mer.", test.dayOfWeek().getField().getAsShortText(3, Locale.FRENCH));
        __CLR4_4_1kwbkwblc8azunf.R.inc(27755);assertEquals(test.getChronology().days(), test.dayOfWeek().getDurationField());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27756);assertEquals(test.getChronology().weeks(), test.dayOfWeek().getRangeDurationField());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27757);assertEquals(9, test.dayOfWeek().getMaximumTextLength(null));
        __CLR4_4_1kwbkwblc8azunf.R.inc(27758);assertEquals(8, test.dayOfWeek().getMaximumTextLength(Locale.FRENCH));
        __CLR4_4_1kwbkwblc8azunf.R.inc(27759);assertEquals(3, test.dayOfWeek().getMaximumShortTextLength(null));
        __CLR4_4_1kwbkwblc8azunf.R.inc(27760);assertEquals(4, test.dayOfWeek().getMaximumShortTextLength(Locale.FRENCH));
        __CLR4_4_1kwbkwblc8azunf.R.inc(27761);assertEquals(1, test.dayOfWeek().getMinimumValue());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27762);assertEquals(1, test.dayOfWeek().getMinimumValueOverall());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27763);assertEquals(7, test.dayOfWeek().getMaximumValue());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27764);assertEquals(7, test.dayOfWeek().getMaximumValueOverall());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27765);assertEquals(false, test.dayOfWeek().isLeap());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27766);assertEquals(0, test.dayOfWeek().getLeapAmount());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27767);assertEquals(null, test.dayOfWeek().getLeapDurationField());
    }finally{__CLR4_4_1kwbkwblc8azunf.R.flushNeeded();}}

    public void testPropertyAddDayOfWeek() {__CLR4_4_1kwbkwblc8azunf.R.globalSliceStart(getClass().getName(),27768);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1joc76clfc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kwbkwblc8azunf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kwbkwblc8azunf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyAddDayOfWeek",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27768,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1joc76clfc(){try{__CLR4_4_1kwbkwblc8azunf.R.inc(27768);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27769);DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27770);DateTime copy = test.dayOfWeek().addToCopy(1);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27771);assertEquals("2004-06-09T00:00:00.000+01:00", test.toString());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27772);assertEquals("2004-06-10T00:00:00.000+01:00", copy.toString());
        
        __CLR4_4_1kwbkwblc8azunf.R.inc(27773);copy = test.dayOfWeek().addToCopy(21);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27774);assertEquals("2004-06-30T00:00:00.000+01:00", copy.toString());
        
        __CLR4_4_1kwbkwblc8azunf.R.inc(27775);copy = test.dayOfWeek().addToCopy(22);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27776);assertEquals("2004-07-01T00:00:00.000+01:00", copy.toString());
        
        __CLR4_4_1kwbkwblc8azunf.R.inc(27777);copy = test.dayOfWeek().addToCopy(21 + 31 + 31 + 30 + 31 + 30 + 31);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27778);assertEquals("2004-12-31T00:00:00.000Z", copy.toString());
        
        __CLR4_4_1kwbkwblc8azunf.R.inc(27779);copy = test.dayOfWeek().addToCopy(22 + 31 + 31 + 30 + 31 + 30 + 31);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27780);assertEquals("2005-01-01T00:00:00.000Z", copy.toString());
        
        __CLR4_4_1kwbkwblc8azunf.R.inc(27781);copy = test.dayOfWeek().addToCopy(-8);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27782);assertEquals("2004-06-01T00:00:00.000+01:00", copy.toString());
        
        __CLR4_4_1kwbkwblc8azunf.R.inc(27783);copy = test.dayOfWeek().addToCopy(-9);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27784);assertEquals("2004-05-31T00:00:00.000+01:00", copy.toString());
        
        __CLR4_4_1kwbkwblc8azunf.R.inc(27785);copy = test.dayOfWeek().addToCopy(-8 - 31 - 30 - 31 - 29 - 31);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27786);assertEquals("2004-01-01T00:00:00.000Z", copy.toString());
        
        __CLR4_4_1kwbkwblc8azunf.R.inc(27787);copy = test.dayOfWeek().addToCopy(-9 - 31 - 30 - 31 - 29 - 31);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27788);assertEquals("2003-12-31T00:00:00.000Z", copy.toString());
    }finally{__CLR4_4_1kwbkwblc8azunf.R.flushNeeded();}}

    public void testPropertyAddLongDayOfWeek() {__CLR4_4_1kwbkwblc8azunf.R.globalSliceStart(getClass().getName(),27789);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_166ne0olfx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kwbkwblc8azunf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kwbkwblc8azunf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyAddLongDayOfWeek",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27789,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_166ne0olfx(){try{__CLR4_4_1kwbkwblc8azunf.R.inc(27789);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27790);DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27791);DateTime copy = test.dayOfWeek().addToCopy(1L);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27792);assertEquals("2004-06-09T00:00:00.000+01:00", test.toString());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27793);assertEquals("2004-06-10T00:00:00.000+01:00", copy.toString());
    }finally{__CLR4_4_1kwbkwblc8azunf.R.flushNeeded();}}        

    public void testPropertyAddWrapFieldDayOfWeek() {__CLR4_4_1kwbkwblc8azunf.R.globalSliceStart(getClass().getName(),27794);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ile654lg2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kwbkwblc8azunf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kwbkwblc8azunf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyAddWrapFieldDayOfWeek",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27794,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ile654lg2(){try{__CLR4_4_1kwbkwblc8azunf.R.inc(27794);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27795);DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0);  // Wed
        __CLR4_4_1kwbkwblc8azunf.R.inc(27796);DateTime copy = test.dayOfWeek().addWrapFieldToCopy(1);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27797);assertEquals("2004-06-09T00:00:00.000+01:00", test.toString());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27798);assertEquals("2004-06-10T00:00:00.000+01:00", copy.toString());
        
        __CLR4_4_1kwbkwblc8azunf.R.inc(27799);copy = test.dayOfWeek().addWrapFieldToCopy(5);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27800);assertEquals("2004-06-07T00:00:00.000+01:00", copy.toString());
        
        __CLR4_4_1kwbkwblc8azunf.R.inc(27801);copy = test.dayOfWeek().addWrapFieldToCopy(-10);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27802);assertEquals("2004-06-13T00:00:00.000+01:00", copy.toString());
        
        __CLR4_4_1kwbkwblc8azunf.R.inc(27803);test = new DateTime(2004, 6, 2, 0, 0, 0, 0);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27804);copy = test.dayOfWeek().addWrapFieldToCopy(5);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27805);assertEquals("2004-06-02T00:00:00.000+01:00", test.toString());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27806);assertEquals("2004-05-31T00:00:00.000+01:00", copy.toString());
    }finally{__CLR4_4_1kwbkwblc8azunf.R.flushNeeded();}}

    public void testPropertySetDayOfWeek() {__CLR4_4_1kwbkwblc8azunf.R.globalSliceStart(getClass().getName(),27807);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q45qnhlgf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kwbkwblc8azunf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kwbkwblc8azunf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertySetDayOfWeek",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27807,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q45qnhlgf(){try{__CLR4_4_1kwbkwblc8azunf.R.inc(27807);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27808);DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27809);DateTime copy = test.dayOfWeek().setCopy(4);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27810);assertEquals("2004-06-09T00:00:00.000+01:00", test.toString());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27811);assertEquals("2004-06-10T00:00:00.000+01:00", copy.toString());
        
        __CLR4_4_1kwbkwblc8azunf.R.inc(27812);try {
            __CLR4_4_1kwbkwblc8azunf.R.inc(27813);test.dayOfWeek().setCopy(8);
            __CLR4_4_1kwbkwblc8azunf.R.inc(27814);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_1kwbkwblc8azunf.R.inc(27815);try {
            __CLR4_4_1kwbkwblc8azunf.R.inc(27816);test.dayOfWeek().setCopy(0);
            __CLR4_4_1kwbkwblc8azunf.R.inc(27817);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1kwbkwblc8azunf.R.flushNeeded();}}

    public void testPropertySetTextDayOfWeek() {__CLR4_4_1kwbkwblc8azunf.R.globalSliceStart(getClass().getName(),27818);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12bt0vulgq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kwbkwblc8azunf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kwbkwblc8azunf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertySetTextDayOfWeek",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27818,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12bt0vulgq(){try{__CLR4_4_1kwbkwblc8azunf.R.inc(27818);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27819);DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27820);DateTime copy = test.dayOfWeek().setCopy("4");
        __CLR4_4_1kwbkwblc8azunf.R.inc(27821);assertEquals("2004-06-09T00:00:00.000+01:00", test.toString());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27822);assertEquals("2004-06-10T00:00:00.000+01:00", copy.toString());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27823);copy = test.dayOfWeek().setCopy("Mon");
        __CLR4_4_1kwbkwblc8azunf.R.inc(27824);assertEquals("2004-06-07T00:00:00.000+01:00", copy.toString());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27825);copy = test.dayOfWeek().setCopy("Tuesday");
        __CLR4_4_1kwbkwblc8azunf.R.inc(27826);assertEquals("2004-06-08T00:00:00.000+01:00", copy.toString());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27827);copy = test.dayOfWeek().setCopy("lundi", Locale.FRENCH);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27828);assertEquals("2004-06-07T00:00:00.000+01:00", copy.toString());
    }finally{__CLR4_4_1kwbkwblc8azunf.R.flushNeeded();}}

    public void testPropertyCompareToDayOfWeek() {__CLR4_4_1kwbkwblc8azunf.R.globalSliceStart(getClass().getName(),27829);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13da245lh1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kwbkwblc8azunf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kwbkwblc8azunf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyCompareToDayOfWeek",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27829,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13da245lh1(){try{__CLR4_4_1kwbkwblc8azunf.R.inc(27829);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27830);DateTime test1 = new DateTime(TEST_TIME1);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27831);DateTime test2 = new DateTime(TEST_TIME2);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27832);assertEquals(true, test2.dayOfWeek().compareTo(test1) < 0);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27833);assertEquals(true, test1.dayOfWeek().compareTo(test2) > 0);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27834);assertEquals(true, test1.dayOfWeek().compareTo(test1) == 0);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27835);try {
            __CLR4_4_1kwbkwblc8azunf.R.inc(27836);test1.dayOfWeek().compareTo((ReadableInstant) null);
            __CLR4_4_1kwbkwblc8azunf.R.inc(27837);fail();
        } catch (IllegalArgumentException ex) {}
        
        __CLR4_4_1kwbkwblc8azunf.R.inc(27838);DateTime dt1 = new DateTime(TEST_TIME1);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27839);DateTime dt2 = new DateTime(TEST_TIME2);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27840);assertEquals(true, test2.dayOfWeek().compareTo(dt1) < 0);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27841);assertEquals(true, test1.dayOfWeek().compareTo(dt2) > 0);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27842);assertEquals(true, test1.dayOfWeek().compareTo(dt1) == 0);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27843);try {
            __CLR4_4_1kwbkwblc8azunf.R.inc(27844);test1.dayOfWeek().compareTo((ReadableInstant) null);
            __CLR4_4_1kwbkwblc8azunf.R.inc(27845);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1kwbkwblc8azunf.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testPropertyGetHourOfDay() {__CLR4_4_1kwbkwblc8azunf.R.globalSliceStart(getClass().getName(),27846);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1i5x06xlhi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kwbkwblc8azunf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kwbkwblc8azunf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyGetHourOfDay",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27846,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1i5x06xlhi(){try{__CLR4_4_1kwbkwblc8azunf.R.inc(27846);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27847);DateTime test = new DateTime(2004, 6, 9, 13, 23, 43, 53);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27848);assertSame(test.getChronology().hourOfDay(), test.hourOfDay().getField());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27849);assertEquals("hourOfDay", test.hourOfDay().getName());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27850);assertEquals("Property[hourOfDay]", test.hourOfDay().toString());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27851);assertSame(test, test.hourOfDay().getDateTime());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27852);assertEquals(13, test.hourOfDay().get());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27853);assertEquals("13", test.hourOfDay().getAsString());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27854);assertEquals("13", test.hourOfDay().getAsText());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27855);assertEquals("13", test.hourOfDay().getAsText(Locale.FRENCH));
        __CLR4_4_1kwbkwblc8azunf.R.inc(27856);assertEquals("13", test.hourOfDay().getAsShortText());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27857);assertEquals("13", test.hourOfDay().getAsShortText(Locale.FRENCH));
        __CLR4_4_1kwbkwblc8azunf.R.inc(27858);assertEquals(test.getChronology().hours(), test.hourOfDay().getDurationField());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27859);assertEquals(test.getChronology().days(), test.hourOfDay().getRangeDurationField());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27860);assertEquals(2, test.hourOfDay().getMaximumTextLength(null));
        __CLR4_4_1kwbkwblc8azunf.R.inc(27861);assertEquals(2, test.hourOfDay().getMaximumShortTextLength(null));
    }finally{__CLR4_4_1kwbkwblc8azunf.R.flushNeeded();}}

    public void testPropertyGetDifferenceHourOfDay() {__CLR4_4_1kwbkwblc8azunf.R.globalSliceStart(getClass().getName(),27862);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nvom5glhy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kwbkwblc8azunf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kwbkwblc8azunf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyGetDifferenceHourOfDay",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27862,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nvom5glhy(){try{__CLR4_4_1kwbkwblc8azunf.R.inc(27862);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27863);DateTime test1 = new DateTime(2004, 6, 9, 13, 30, 0, 0);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27864);DateTime test2 = new DateTime(2004, 6, 9, 15, 30, 0, 0);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27865);assertEquals(-2, test1.hourOfDay().getDifference(test2));
        __CLR4_4_1kwbkwblc8azunf.R.inc(27866);assertEquals(2, test2.hourOfDay().getDifference(test1));
        __CLR4_4_1kwbkwblc8azunf.R.inc(27867);assertEquals(-2L, test1.hourOfDay().getDifferenceAsLong(test2));
        __CLR4_4_1kwbkwblc8azunf.R.inc(27868);assertEquals(2L, test2.hourOfDay().getDifferenceAsLong(test1));
        
        __CLR4_4_1kwbkwblc8azunf.R.inc(27869);DateTime test = new DateTime(TEST_TIME_NOW + (13L * DateTimeConstants.MILLIS_PER_HOUR));
        __CLR4_4_1kwbkwblc8azunf.R.inc(27870);assertEquals(13, test.hourOfDay().getDifference(null));
        __CLR4_4_1kwbkwblc8azunf.R.inc(27871);assertEquals(13L, test.hourOfDay().getDifferenceAsLong(null));
    }finally{__CLR4_4_1kwbkwblc8azunf.R.flushNeeded();}}

    public void testPropertyRoundFloorHourOfDay() {__CLR4_4_1kwbkwblc8azunf.R.globalSliceStart(getClass().getName(),27872);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rs37ctli8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kwbkwblc8azunf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kwbkwblc8azunf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyRoundFloorHourOfDay",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27872,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rs37ctli8(){try{__CLR4_4_1kwbkwblc8azunf.R.inc(27872);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27873);DateTime test = new DateTime(2004, 6, 9, 13, 30, 0, 0);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27874);DateTime copy = test.hourOfDay().roundFloorCopy();
        __CLR4_4_1kwbkwblc8azunf.R.inc(27875);assertEquals("2004-06-09T13:00:00.000+01:00", copy.toString());
    }finally{__CLR4_4_1kwbkwblc8azunf.R.flushNeeded();}}

    public void testPropertyRoundCeilingHourOfDay() {__CLR4_4_1kwbkwblc8azunf.R.globalSliceStart(getClass().getName(),27876);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1r72lgulic();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kwbkwblc8azunf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kwbkwblc8azunf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyRoundCeilingHourOfDay",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27876,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1r72lgulic(){try{__CLR4_4_1kwbkwblc8azunf.R.inc(27876);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27877);DateTime test = new DateTime(2004, 6, 9, 13, 30, 0, 0);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27878);DateTime copy = test.hourOfDay().roundCeilingCopy();
        __CLR4_4_1kwbkwblc8azunf.R.inc(27879);assertEquals("2004-06-09T14:00:00.000+01:00", copy.toString());
    }finally{__CLR4_4_1kwbkwblc8azunf.R.flushNeeded();}}

    public void testPropertyRoundHalfFloorHourOfDay() {__CLR4_4_1kwbkwblc8azunf.R.globalSliceStart(getClass().getName(),27880);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pcihmylig();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kwbkwblc8azunf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kwbkwblc8azunf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyRoundHalfFloorHourOfDay",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27880,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pcihmylig(){try{__CLR4_4_1kwbkwblc8azunf.R.inc(27880);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27881);DateTime test = new DateTime(2004, 6, 9, 13, 30, 0, 0);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27882);DateTime copy = test.hourOfDay().roundHalfFloorCopy();
        __CLR4_4_1kwbkwblc8azunf.R.inc(27883);assertEquals("2004-06-09T13:00:00.000+01:00", copy.toString());
        
        __CLR4_4_1kwbkwblc8azunf.R.inc(27884);test = new DateTime(2004, 6, 9, 13, 30, 0, 1);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27885);copy = test.hourOfDay().roundHalfFloorCopy();
        __CLR4_4_1kwbkwblc8azunf.R.inc(27886);assertEquals("2004-06-09T14:00:00.000+01:00", copy.toString());
        
        __CLR4_4_1kwbkwblc8azunf.R.inc(27887);test = new DateTime(2004, 6, 9, 13, 29, 59, 999);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27888);copy = test.hourOfDay().roundHalfFloorCopy();
        __CLR4_4_1kwbkwblc8azunf.R.inc(27889);assertEquals("2004-06-09T13:00:00.000+01:00", copy.toString());
    }finally{__CLR4_4_1kwbkwblc8azunf.R.flushNeeded();}}

    public void testPropertyRoundHalfCeilingHourOfDay() {__CLR4_4_1kwbkwblc8azunf.R.globalSliceStart(getClass().getName(),27890);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xftvazliq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kwbkwblc8azunf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kwbkwblc8azunf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyRoundHalfCeilingHourOfDay",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27890,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xftvazliq(){try{__CLR4_4_1kwbkwblc8azunf.R.inc(27890);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27891);DateTime test = new DateTime(2004, 6, 9, 13, 30, 0, 0);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27892);DateTime copy = test.hourOfDay().roundHalfCeilingCopy();
        __CLR4_4_1kwbkwblc8azunf.R.inc(27893);assertEquals("2004-06-09T14:00:00.000+01:00", copy.toString());
        
        __CLR4_4_1kwbkwblc8azunf.R.inc(27894);test = new DateTime(2004, 6, 9, 13, 30, 0, 1);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27895);copy = test.hourOfDay().roundHalfCeilingCopy();
        __CLR4_4_1kwbkwblc8azunf.R.inc(27896);assertEquals("2004-06-09T14:00:00.000+01:00", copy.toString());
        
        __CLR4_4_1kwbkwblc8azunf.R.inc(27897);test = new DateTime(2004, 6, 9, 13, 29, 59, 999);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27898);copy = test.hourOfDay().roundHalfCeilingCopy();
        __CLR4_4_1kwbkwblc8azunf.R.inc(27899);assertEquals("2004-06-09T13:00:00.000+01:00", copy.toString());
    }finally{__CLR4_4_1kwbkwblc8azunf.R.flushNeeded();}}

    public void testPropertyRoundHalfEvenHourOfDay() {__CLR4_4_1kwbkwblc8azunf.R.globalSliceStart(getClass().getName(),27900);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_136gyoclj0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kwbkwblc8azunf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kwbkwblc8azunf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyRoundHalfEvenHourOfDay",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27900,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_136gyoclj0(){try{__CLR4_4_1kwbkwblc8azunf.R.inc(27900);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27901);DateTime test = new DateTime(2004, 6, 9, 13, 30, 0, 0);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27902);DateTime copy = test.hourOfDay().roundHalfEvenCopy();
        __CLR4_4_1kwbkwblc8azunf.R.inc(27903);assertEquals("2004-06-09T14:00:00.000+01:00", copy.toString());
        
        __CLR4_4_1kwbkwblc8azunf.R.inc(27904);test = new DateTime(2004, 6, 9, 14, 30, 0, 0);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27905);copy = test.hourOfDay().roundHalfEvenCopy();
        __CLR4_4_1kwbkwblc8azunf.R.inc(27906);assertEquals("2004-06-09T14:00:00.000+01:00", copy.toString());
        
        __CLR4_4_1kwbkwblc8azunf.R.inc(27907);test = new DateTime(2004, 6, 9, 13, 30, 0, 1);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27908);copy = test.hourOfDay().roundHalfEvenCopy();
        __CLR4_4_1kwbkwblc8azunf.R.inc(27909);assertEquals("2004-06-09T14:00:00.000+01:00", copy.toString());
        
        __CLR4_4_1kwbkwblc8azunf.R.inc(27910);test = new DateTime(2004, 6, 9, 13, 29, 59, 999);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27911);copy = test.hourOfDay().roundHalfEvenCopy();
        __CLR4_4_1kwbkwblc8azunf.R.inc(27912);assertEquals("2004-06-09T13:00:00.000+01:00", copy.toString());
    }finally{__CLR4_4_1kwbkwblc8azunf.R.flushNeeded();}}

    public void testPropertyRemainderHourOfDay() {__CLR4_4_1kwbkwblc8azunf.R.globalSliceStart(getClass().getName(),27913);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sd0idyljd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kwbkwblc8azunf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kwbkwblc8azunf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyRemainderHourOfDay",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27913,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sd0idyljd(){try{__CLR4_4_1kwbkwblc8azunf.R.inc(27913);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27914);DateTime test = new DateTime(2004, 6, 9, 13, 30, 0, 0);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27915);assertEquals(30L * DateTimeConstants.MILLIS_PER_MINUTE, test.hourOfDay().remainder());
    }finally{__CLR4_4_1kwbkwblc8azunf.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testPropertyGetMinuteOfHour() {__CLR4_4_1kwbkwblc8azunf.R.globalSliceStart(getClass().getName(),27916);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jby1vfljg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kwbkwblc8azunf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kwbkwblc8azunf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyGetMinuteOfHour",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27916,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jby1vfljg(){try{__CLR4_4_1kwbkwblc8azunf.R.inc(27916);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27917);DateTime test = new DateTime(2004, 6, 9, 13, 23, 43, 53);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27918);assertSame(test.getChronology().minuteOfHour(), test.minuteOfHour().getField());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27919);assertEquals("minuteOfHour", test.minuteOfHour().getName());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27920);assertEquals("Property[minuteOfHour]", test.minuteOfHour().toString());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27921);assertSame(test, test.minuteOfHour().getDateTime());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27922);assertEquals(23, test.minuteOfHour().get());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27923);assertEquals("23", test.minuteOfHour().getAsString());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27924);assertEquals("23", test.minuteOfHour().getAsText());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27925);assertEquals("23", test.minuteOfHour().getAsText(Locale.FRENCH));
        __CLR4_4_1kwbkwblc8azunf.R.inc(27926);assertEquals("23", test.minuteOfHour().getAsShortText());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27927);assertEquals("23", test.minuteOfHour().getAsShortText(Locale.FRENCH));
        __CLR4_4_1kwbkwblc8azunf.R.inc(27928);assertEquals(test.getChronology().minutes(), test.minuteOfHour().getDurationField());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27929);assertEquals(test.getChronology().hours(), test.minuteOfHour().getRangeDurationField());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27930);assertEquals(2, test.minuteOfHour().getMaximumTextLength(null));
        __CLR4_4_1kwbkwblc8azunf.R.inc(27931);assertEquals(2, test.minuteOfHour().getMaximumShortTextLength(null));
    }finally{__CLR4_4_1kwbkwblc8azunf.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testPropertyGetMinuteOfDay() {__CLR4_4_1kwbkwblc8azunf.R.globalSliceStart(getClass().getName(),27932);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1p5v12vljw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kwbkwblc8azunf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kwbkwblc8azunf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyGetMinuteOfDay",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27932,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1p5v12vljw(){try{__CLR4_4_1kwbkwblc8azunf.R.inc(27932);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27933);DateTime test = new DateTime(2004, 6, 9, 13, 23, 43, 53);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27934);assertSame(test.getChronology().minuteOfDay(), test.minuteOfDay().getField());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27935);assertEquals("minuteOfDay", test.minuteOfDay().getName());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27936);assertEquals("Property[minuteOfDay]", test.minuteOfDay().toString());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27937);assertSame(test, test.minuteOfDay().getDateTime());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27938);assertEquals(803, test.minuteOfDay().get());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27939);assertEquals("803", test.minuteOfDay().getAsString());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27940);assertEquals("803", test.minuteOfDay().getAsText());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27941);assertEquals("803", test.minuteOfDay().getAsText(Locale.FRENCH));
        __CLR4_4_1kwbkwblc8azunf.R.inc(27942);assertEquals("803", test.minuteOfDay().getAsShortText());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27943);assertEquals("803", test.minuteOfDay().getAsShortText(Locale.FRENCH));
        __CLR4_4_1kwbkwblc8azunf.R.inc(27944);assertEquals(test.getChronology().minutes(), test.minuteOfDay().getDurationField());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27945);assertEquals(test.getChronology().days(), test.minuteOfDay().getRangeDurationField());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27946);assertEquals(4, test.minuteOfDay().getMaximumTextLength(null));
        __CLR4_4_1kwbkwblc8azunf.R.inc(27947);assertEquals(4, test.minuteOfDay().getMaximumShortTextLength(null));
    }finally{__CLR4_4_1kwbkwblc8azunf.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testPropertyGetSecondOfMinute() {__CLR4_4_1kwbkwblc8azunf.R.globalSliceStart(getClass().getName(),27948);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ul2igblkc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kwbkwblc8azunf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kwbkwblc8azunf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyGetSecondOfMinute",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27948,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ul2igblkc(){try{__CLR4_4_1kwbkwblc8azunf.R.inc(27948);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27949);DateTime test = new DateTime(2004, 6, 9, 13, 23, 43, 53);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27950);assertSame(test.getChronology().secondOfMinute(), test.secondOfMinute().getField());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27951);assertEquals("secondOfMinute", test.secondOfMinute().getName());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27952);assertEquals("Property[secondOfMinute]", test.secondOfMinute().toString());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27953);assertSame(test, test.secondOfMinute().getDateTime());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27954);assertEquals(43, test.secondOfMinute().get());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27955);assertEquals("43", test.secondOfMinute().getAsString());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27956);assertEquals("43", test.secondOfMinute().getAsText());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27957);assertEquals("43", test.secondOfMinute().getAsText(Locale.FRENCH));
        __CLR4_4_1kwbkwblc8azunf.R.inc(27958);assertEquals("43", test.secondOfMinute().getAsShortText());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27959);assertEquals("43", test.secondOfMinute().getAsShortText(Locale.FRENCH));
        __CLR4_4_1kwbkwblc8azunf.R.inc(27960);assertEquals(test.getChronology().seconds(), test.secondOfMinute().getDurationField());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27961);assertEquals(test.getChronology().minutes(), test.secondOfMinute().getRangeDurationField());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27962);assertEquals(2, test.secondOfMinute().getMaximumTextLength(null));
        __CLR4_4_1kwbkwblc8azunf.R.inc(27963);assertEquals(2, test.secondOfMinute().getMaximumShortTextLength(null));
    }finally{__CLR4_4_1kwbkwblc8azunf.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testPropertyGetSecondOfDay() {__CLR4_4_1kwbkwblc8azunf.R.globalSliceStart(getClass().getName(),27964);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1srw4fdlks();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kwbkwblc8azunf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kwbkwblc8azunf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyGetSecondOfDay",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27964,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1srw4fdlks(){try{__CLR4_4_1kwbkwblc8azunf.R.inc(27964);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27965);DateTime test = new DateTime(2004, 6, 9, 13, 23, 43, 53);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27966);assertSame(test.getChronology().secondOfDay(), test.secondOfDay().getField());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27967);assertEquals("secondOfDay", test.secondOfDay().getName());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27968);assertEquals("Property[secondOfDay]", test.secondOfDay().toString());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27969);assertSame(test, test.secondOfDay().getDateTime());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27970);assertEquals(48223, test.secondOfDay().get());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27971);assertEquals("48223", test.secondOfDay().getAsString());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27972);assertEquals("48223", test.secondOfDay().getAsText());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27973);assertEquals("48223", test.secondOfDay().getAsText(Locale.FRENCH));
        __CLR4_4_1kwbkwblc8azunf.R.inc(27974);assertEquals("48223", test.secondOfDay().getAsShortText());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27975);assertEquals("48223", test.secondOfDay().getAsShortText(Locale.FRENCH));
        __CLR4_4_1kwbkwblc8azunf.R.inc(27976);assertEquals(test.getChronology().seconds(), test.secondOfDay().getDurationField());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27977);assertEquals(test.getChronology().days(), test.secondOfDay().getRangeDurationField());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27978);assertEquals(5, test.secondOfDay().getMaximumTextLength(null));
        __CLR4_4_1kwbkwblc8azunf.R.inc(27979);assertEquals(5, test.secondOfDay().getMaximumShortTextLength(null));
    }finally{__CLR4_4_1kwbkwblc8azunf.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testPropertyGetMillisOfSecond() {__CLR4_4_1kwbkwblc8azunf.R.globalSliceStart(getClass().getName(),27980);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1je93bbll8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kwbkwblc8azunf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kwbkwblc8azunf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyGetMillisOfSecond",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27980,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1je93bbll8(){try{__CLR4_4_1kwbkwblc8azunf.R.inc(27980);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27981);DateTime test = new DateTime(2004, 6, 9, 13, 23, 43, 53);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27982);assertSame(test.getChronology().millisOfSecond(), test.millisOfSecond().getField());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27983);assertEquals("millisOfSecond", test.millisOfSecond().getName());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27984);assertEquals("Property[millisOfSecond]", test.millisOfSecond().toString());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27985);assertSame(test, test.millisOfSecond().getDateTime());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27986);assertEquals(53, test.millisOfSecond().get());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27987);assertEquals("53", test.millisOfSecond().getAsString());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27988);assertEquals("53", test.millisOfSecond().getAsText());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27989);assertEquals("53", test.millisOfSecond().getAsText(Locale.FRENCH));
        __CLR4_4_1kwbkwblc8azunf.R.inc(27990);assertEquals("53", test.millisOfSecond().getAsShortText());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27991);assertEquals("53", test.millisOfSecond().getAsShortText(Locale.FRENCH));
        __CLR4_4_1kwbkwblc8azunf.R.inc(27992);assertEquals(test.getChronology().millis(), test.millisOfSecond().getDurationField());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27993);assertEquals(test.getChronology().seconds(), test.millisOfSecond().getRangeDurationField());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27994);assertEquals(3, test.millisOfSecond().getMaximumTextLength(null));
        __CLR4_4_1kwbkwblc8azunf.R.inc(27995);assertEquals(3, test.millisOfSecond().getMaximumShortTextLength(null));
    }finally{__CLR4_4_1kwbkwblc8azunf.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testPropertyGetMillisOfDay() {__CLR4_4_1kwbkwblc8azunf.R.globalSliceStart(getClass().getName(),27996);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1eihskpllo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kwbkwblc8azunf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kwbkwblc8azunf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyGetMillisOfDay",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27996,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1eihskpllo(){try{__CLR4_4_1kwbkwblc8azunf.R.inc(27996);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27997);DateTime test = new DateTime(2004, 6, 9, 13, 23, 43, 53);
        __CLR4_4_1kwbkwblc8azunf.R.inc(27998);assertSame(test.getChronology().millisOfDay(), test.millisOfDay().getField());
        __CLR4_4_1kwbkwblc8azunf.R.inc(27999);assertEquals("millisOfDay", test.millisOfDay().getName());
        __CLR4_4_1kwbkwblc8azunf.R.inc(28000);assertEquals("Property[millisOfDay]", test.millisOfDay().toString());
        __CLR4_4_1kwbkwblc8azunf.R.inc(28001);assertSame(test, test.millisOfDay().getDateTime());
        __CLR4_4_1kwbkwblc8azunf.R.inc(28002);assertEquals(48223053, test.millisOfDay().get());
        __CLR4_4_1kwbkwblc8azunf.R.inc(28003);assertEquals("48223053", test.millisOfDay().getAsString());
        __CLR4_4_1kwbkwblc8azunf.R.inc(28004);assertEquals("48223053", test.millisOfDay().getAsText());
        __CLR4_4_1kwbkwblc8azunf.R.inc(28005);assertEquals("48223053", test.millisOfDay().getAsText(Locale.FRENCH));
        __CLR4_4_1kwbkwblc8azunf.R.inc(28006);assertEquals("48223053", test.millisOfDay().getAsShortText());
        __CLR4_4_1kwbkwblc8azunf.R.inc(28007);assertEquals("48223053", test.millisOfDay().getAsShortText(Locale.FRENCH));
        __CLR4_4_1kwbkwblc8azunf.R.inc(28008);assertEquals(test.getChronology().millis(), test.millisOfDay().getDurationField());
        __CLR4_4_1kwbkwblc8azunf.R.inc(28009);assertEquals(test.getChronology().days(), test.millisOfDay().getRangeDurationField());
        __CLR4_4_1kwbkwblc8azunf.R.inc(28010);assertEquals(8, test.millisOfDay().getMaximumTextLength(null));
        __CLR4_4_1kwbkwblc8azunf.R.inc(28011);assertEquals(8, test.millisOfDay().getMaximumShortTextLength(null));
    }finally{__CLR4_4_1kwbkwblc8azunf.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testPropertyToIntervalYearOfEra() {__CLR4_4_1kwbkwblc8azunf.R.globalSliceStart(getClass().getName(),28012);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dof34lm4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kwbkwblc8azunf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kwbkwblc8azunf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyToIntervalYearOfEra",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28012,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dof34lm4(){try{__CLR4_4_1kwbkwblc8azunf.R.inc(28012);
      __CLR4_4_1kwbkwblc8azunf.R.inc(28013);DateTime test = new DateTime(2004, 6, 9, 13, 23, 43, 53);
      __CLR4_4_1kwbkwblc8azunf.R.inc(28014);Interval testInterval = test.yearOfEra().toInterval();
      __CLR4_4_1kwbkwblc8azunf.R.inc(28015);assertEquals(new DateTime(2004, 1, 1, 0, 0, 0, 0), testInterval.getStart());
      __CLR4_4_1kwbkwblc8azunf.R.inc(28016);assertEquals(new DateTime(2005, 1, 1, 0, 0, 0, 0), testInterval.getEnd());
    }finally{__CLR4_4_1kwbkwblc8azunf.R.flushNeeded();}}

    public void testPropertyToIntervalYearOfCentury() {__CLR4_4_1kwbkwblc8azunf.R.globalSliceStart(getClass().getName(),28017);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1h9bdk0lm9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kwbkwblc8azunf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kwbkwblc8azunf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyToIntervalYearOfCentury",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28017,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1h9bdk0lm9(){try{__CLR4_4_1kwbkwblc8azunf.R.inc(28017);
      __CLR4_4_1kwbkwblc8azunf.R.inc(28018);DateTime test = new DateTime(2004, 6, 9, 13, 23, 43, 53);
      __CLR4_4_1kwbkwblc8azunf.R.inc(28019);Interval testInterval = test.yearOfCentury().toInterval();
      __CLR4_4_1kwbkwblc8azunf.R.inc(28020);assertEquals(new DateTime(2004, 1, 1, 0, 0, 0, 0), testInterval.getStart());
      __CLR4_4_1kwbkwblc8azunf.R.inc(28021);assertEquals(new DateTime(2005, 1, 1, 0, 0, 0, 0), testInterval.getEnd());
    }finally{__CLR4_4_1kwbkwblc8azunf.R.flushNeeded();}}

    public void testPropertyToIntervalYear() {__CLR4_4_1kwbkwblc8azunf.R.globalSliceStart(getClass().getName(),28022);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hg1pudlme();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kwbkwblc8azunf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kwbkwblc8azunf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyToIntervalYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28022,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hg1pudlme(){try{__CLR4_4_1kwbkwblc8azunf.R.inc(28022);
      __CLR4_4_1kwbkwblc8azunf.R.inc(28023);DateTime test = new DateTime(2004, 6, 9, 13, 23, 43, 53);
      __CLR4_4_1kwbkwblc8azunf.R.inc(28024);Interval testInterval = test.year().toInterval();
      __CLR4_4_1kwbkwblc8azunf.R.inc(28025);assertEquals(new DateTime(2004, 1, 1, 0, 0, 0, 0), testInterval.getStart());
      __CLR4_4_1kwbkwblc8azunf.R.inc(28026);assertEquals(new DateTime(2005, 1, 1, 0, 0, 0, 0), testInterval.getEnd());
    }finally{__CLR4_4_1kwbkwblc8azunf.R.flushNeeded();}}

    public void testPropertyToIntervalMonthOfYear() {__CLR4_4_1kwbkwblc8azunf.R.globalSliceStart(getClass().getName(),28027);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mybayclmj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kwbkwblc8azunf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kwbkwblc8azunf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyToIntervalMonthOfYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28027,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mybayclmj(){try{__CLR4_4_1kwbkwblc8azunf.R.inc(28027);
      __CLR4_4_1kwbkwblc8azunf.R.inc(28028);DateTime test = new DateTime(2004, 6, 9, 13, 23, 43, 53);
      __CLR4_4_1kwbkwblc8azunf.R.inc(28029);Interval testInterval = test.monthOfYear().toInterval();
      __CLR4_4_1kwbkwblc8azunf.R.inc(28030);assertEquals(new DateTime(2004, 6, 1, 0, 0, 0, 0), testInterval.getStart());
      __CLR4_4_1kwbkwblc8azunf.R.inc(28031);assertEquals(new DateTime(2004, 7, 1, 0, 0, 0, 0), testInterval.getEnd());
    }finally{__CLR4_4_1kwbkwblc8azunf.R.flushNeeded();}}

    public void testPropertyToIntervalDayOfMonth() {__CLR4_4_1kwbkwblc8azunf.R.globalSliceStart(getClass().getName(),28032);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1r3xijflmo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kwbkwblc8azunf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kwbkwblc8azunf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyToIntervalDayOfMonth",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28032,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1r3xijflmo(){try{__CLR4_4_1kwbkwblc8azunf.R.inc(28032);
      __CLR4_4_1kwbkwblc8azunf.R.inc(28033);DateTime test = new DateTime(2004, 6, 9, 13, 23, 43, 53);
      __CLR4_4_1kwbkwblc8azunf.R.inc(28034);Interval testInterval = test.dayOfMonth().toInterval();
      __CLR4_4_1kwbkwblc8azunf.R.inc(28035);assertEquals(new DateTime(2004, 6, 9, 0, 0, 0, 0), testInterval.getStart());
      __CLR4_4_1kwbkwblc8azunf.R.inc(28036);assertEquals(new DateTime(2004, 6, 10, 0, 0, 0, 0), testInterval.getEnd());

      __CLR4_4_1kwbkwblc8azunf.R.inc(28037);DateTime febTest = new DateTime(2004, 2, 29, 13, 23, 43, 53);
      __CLR4_4_1kwbkwblc8azunf.R.inc(28038);Interval febTestInterval = febTest.dayOfMonth().toInterval();
      __CLR4_4_1kwbkwblc8azunf.R.inc(28039);assertEquals(new DateTime(2004, 2, 29, 0, 0, 0, 0), febTestInterval.getStart());
      __CLR4_4_1kwbkwblc8azunf.R.inc(28040);assertEquals(new DateTime(2004, 3, 1, 0, 0, 0, 0), febTestInterval.getEnd());
    }finally{__CLR4_4_1kwbkwblc8azunf.R.flushNeeded();}}

    public void testPropertyToIntervalHourOfDay() {__CLR4_4_1kwbkwblc8azunf.R.globalSliceStart(getClass().getName(),28041);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ldcfnllmx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kwbkwblc8azunf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kwbkwblc8azunf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyToIntervalHourOfDay",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28041,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ldcfnllmx(){try{__CLR4_4_1kwbkwblc8azunf.R.inc(28041);
      __CLR4_4_1kwbkwblc8azunf.R.inc(28042);DateTime test = new DateTime(2004, 6, 9, 13, 23, 43, 53);
      __CLR4_4_1kwbkwblc8azunf.R.inc(28043);Interval testInterval = test.hourOfDay().toInterval();
      __CLR4_4_1kwbkwblc8azunf.R.inc(28044);assertEquals(new DateTime(2004, 6, 9, 13, 0, 0, 0), testInterval.getStart());
      __CLR4_4_1kwbkwblc8azunf.R.inc(28045);assertEquals(new DateTime(2004, 6, 9, 14, 0, 0, 0), testInterval.getEnd());

      __CLR4_4_1kwbkwblc8azunf.R.inc(28046);DateTime midnightTest = new DateTime(2004, 6, 9, 23, 23, 43, 53);
      __CLR4_4_1kwbkwblc8azunf.R.inc(28047);Interval midnightTestInterval = midnightTest.hourOfDay().toInterval();
      __CLR4_4_1kwbkwblc8azunf.R.inc(28048);assertEquals(new DateTime(2004, 6, 9, 23, 0, 0, 0), midnightTestInterval.getStart());
      __CLR4_4_1kwbkwblc8azunf.R.inc(28049);assertEquals(new DateTime(2004, 6, 10, 0, 0, 0, 0), midnightTestInterval.getEnd());
    }finally{__CLR4_4_1kwbkwblc8azunf.R.flushNeeded();}}

    public void testPropertyToIntervalMinuteOfHour() {__CLR4_4_1kwbkwblc8azunf.R.globalSliceStart(getClass().getName(),28050);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1zi18fxln6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kwbkwblc8azunf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kwbkwblc8azunf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyToIntervalMinuteOfHour",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28050,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1zi18fxln6(){try{__CLR4_4_1kwbkwblc8azunf.R.inc(28050);
      __CLR4_4_1kwbkwblc8azunf.R.inc(28051);DateTime test = new DateTime(2004, 6, 9, 13, 23, 43, 53);
      __CLR4_4_1kwbkwblc8azunf.R.inc(28052);Interval testInterval = test.minuteOfHour().toInterval();
      __CLR4_4_1kwbkwblc8azunf.R.inc(28053);assertEquals(new DateTime(2004, 6, 9, 13, 23, 0, 0), testInterval.getStart());
      __CLR4_4_1kwbkwblc8azunf.R.inc(28054);assertEquals(new DateTime(2004, 6, 9, 13, 24, 0, 0), testInterval.getEnd());
    }finally{__CLR4_4_1kwbkwblc8azunf.R.flushNeeded();}}

    public void testPropertyToIntervalSecondOfMinute() {__CLR4_4_1kwbkwblc8azunf.R.globalSliceStart(getClass().getName(),28055);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ttf6dplnb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kwbkwblc8azunf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kwbkwblc8azunf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyToIntervalSecondOfMinute",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28055,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ttf6dplnb(){try{__CLR4_4_1kwbkwblc8azunf.R.inc(28055);
      __CLR4_4_1kwbkwblc8azunf.R.inc(28056);DateTime test = new DateTime(2004, 6, 9, 13, 23, 43, 53);
      __CLR4_4_1kwbkwblc8azunf.R.inc(28057);Interval testInterval = test.secondOfMinute().toInterval();
      __CLR4_4_1kwbkwblc8azunf.R.inc(28058);assertEquals(new DateTime(2004, 6, 9, 13, 23, 43, 0), testInterval.getStart());
      __CLR4_4_1kwbkwblc8azunf.R.inc(28059);assertEquals(new DateTime(2004, 6, 9, 13, 23, 44, 0), testInterval.getEnd());
    }finally{__CLR4_4_1kwbkwblc8azunf.R.flushNeeded();}}

    public void testPropertyToIntervalMillisOfSecond() {__CLR4_4_1kwbkwblc8azunf.R.globalSliceStart(getClass().getName(),28060);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18rmq67lng();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kwbkwblc8azunf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kwbkwblc8azunf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyToIntervalMillisOfSecond",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28060,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18rmq67lng(){try{__CLR4_4_1kwbkwblc8azunf.R.inc(28060);
      __CLR4_4_1kwbkwblc8azunf.R.inc(28061);DateTime test = new DateTime(2004, 6, 9, 13, 23, 43, 53);
      __CLR4_4_1kwbkwblc8azunf.R.inc(28062);Interval testInterval = test.millisOfSecond().toInterval();
      __CLR4_4_1kwbkwblc8azunf.R.inc(28063);assertEquals(new DateTime(2004, 6, 9, 13, 23, 43, 53), testInterval.getStart());
      __CLR4_4_1kwbkwblc8azunf.R.inc(28064);assertEquals(new DateTime(2004, 6, 9, 13, 23, 43, 54), testInterval.getEnd());
    }finally{__CLR4_4_1kwbkwblc8azunf.R.flushNeeded();}}

    public void testPropertyEqualsHashCodeLenient() {__CLR4_4_1kwbkwblc8azunf.R.globalSliceStart(getClass().getName(),28065);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xoanxflnl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kwbkwblc8azunf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kwbkwblc8azunf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyEqualsHashCodeLenient",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28065,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xoanxflnl(){try{__CLR4_4_1kwbkwblc8azunf.R.inc(28065);
        __CLR4_4_1kwbkwblc8azunf.R.inc(28066);DateTime test1 = new DateTime(1970, 6, 9, 0, 0, 0, 0, LenientChronology.getInstance(COPTIC_PARIS));
        __CLR4_4_1kwbkwblc8azunf.R.inc(28067);DateTime test2 = new DateTime(1970, 6, 9, 0, 0, 0, 0, LenientChronology.getInstance(COPTIC_PARIS));
        __CLR4_4_1kwbkwblc8azunf.R.inc(28068);assertEquals(true, test1.dayOfMonth().equals(test2.dayOfMonth()));
        __CLR4_4_1kwbkwblc8azunf.R.inc(28069);assertEquals(true, test2.dayOfMonth().equals(test1.dayOfMonth()));
        __CLR4_4_1kwbkwblc8azunf.R.inc(28070);assertEquals(true, test1.dayOfMonth().equals(test1.dayOfMonth()));
        __CLR4_4_1kwbkwblc8azunf.R.inc(28071);assertEquals(true, test2.dayOfMonth().equals(test2.dayOfMonth()));
        __CLR4_4_1kwbkwblc8azunf.R.inc(28072);assertEquals(true, test1.dayOfMonth().hashCode() == test2.dayOfMonth().hashCode());
        __CLR4_4_1kwbkwblc8azunf.R.inc(28073);assertEquals(true, test1.dayOfMonth().hashCode() == test1.dayOfMonth().hashCode());
        __CLR4_4_1kwbkwblc8azunf.R.inc(28074);assertEquals(true, test2.dayOfMonth().hashCode() == test2.dayOfMonth().hashCode());
    }finally{__CLR4_4_1kwbkwblc8azunf.R.flushNeeded();}}

    public void testPropertyEqualsHashCodeStrict() {__CLR4_4_1kwbkwblc8azunf.R.globalSliceStart(getClass().getName(),28075);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ev6icvlnv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kwbkwblc8azunf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kwbkwblc8azunf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyEqualsHashCodeStrict",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28075,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ev6icvlnv(){try{__CLR4_4_1kwbkwblc8azunf.R.inc(28075);
        __CLR4_4_1kwbkwblc8azunf.R.inc(28076);DateTime test1 = new DateTime(1970, 6, 9, 0, 0, 0, 0, StrictChronology.getInstance(COPTIC_PARIS));
        __CLR4_4_1kwbkwblc8azunf.R.inc(28077);DateTime test2 = new DateTime(1970, 6, 9, 0, 0, 0, 0, StrictChronology.getInstance(COPTIC_PARIS));
        __CLR4_4_1kwbkwblc8azunf.R.inc(28078);assertEquals(true, test1.dayOfMonth().equals(test2.dayOfMonth()));
        __CLR4_4_1kwbkwblc8azunf.R.inc(28079);assertEquals(true, test2.dayOfMonth().equals(test1.dayOfMonth()));
        __CLR4_4_1kwbkwblc8azunf.R.inc(28080);assertEquals(true, test1.dayOfMonth().equals(test1.dayOfMonth()));
        __CLR4_4_1kwbkwblc8azunf.R.inc(28081);assertEquals(true, test2.dayOfMonth().equals(test2.dayOfMonth()));
        __CLR4_4_1kwbkwblc8azunf.R.inc(28082);assertEquals(true, test1.dayOfMonth().hashCode() == test2.dayOfMonth().hashCode());
        __CLR4_4_1kwbkwblc8azunf.R.inc(28083);assertEquals(true, test1.dayOfMonth().hashCode() == test1.dayOfMonth().hashCode());
        __CLR4_4_1kwbkwblc8azunf.R.inc(28084);assertEquals(true, test2.dayOfMonth().hashCode() == test2.dayOfMonth().hashCode());
    }finally{__CLR4_4_1kwbkwblc8azunf.R.flushNeeded();}}

}
