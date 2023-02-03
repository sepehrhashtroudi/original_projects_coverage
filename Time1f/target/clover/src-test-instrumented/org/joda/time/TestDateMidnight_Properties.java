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
@SuppressWarnings("deprecation")
public class TestDateMidnight_Properties extends TestCase {static class __CLR4_4_1htthttlc8azu86{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672271031490L,8589935092L,23478,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
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

    public static void main(String[] args) {try{__CLR4_4_1htthttlc8azu86.R.inc(23105);
        __CLR4_4_1htthttlc8azu86.R.inc(23106);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1htthttlc8azu86.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1htthttlc8azu86.R.inc(23107);
        __CLR4_4_1htthttlc8azu86.R.inc(23108);return new TestSuite(TestDateMidnight_Properties.class);
    }finally{__CLR4_4_1htthttlc8azu86.R.flushNeeded();}}

    public TestDateMidnight_Properties(String name) {
        super(name);__CLR4_4_1htthttlc8azu86.R.inc(23110);try{__CLR4_4_1htthttlc8azu86.R.inc(23109);
    }finally{__CLR4_4_1htthttlc8azu86.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1htthttlc8azu86.R.inc(23111);
        __CLR4_4_1htthttlc8azu86.R.inc(23112);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1htthttlc8azu86.R.inc(23113);zone = DateTimeZone.getDefault();
        __CLR4_4_1htthttlc8azu86.R.inc(23114);locale = Locale.getDefault();
        __CLR4_4_1htthttlc8azu86.R.inc(23115);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1htthttlc8azu86.R.inc(23116);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1htthttlc8azu86.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1htthttlc8azu86.R.inc(23117);
        __CLR4_4_1htthttlc8azu86.R.inc(23118);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1htthttlc8azu86.R.inc(23119);DateTimeZone.setDefault(zone);
        __CLR4_4_1htthttlc8azu86.R.inc(23120);Locale.setDefault(locale);
        __CLR4_4_1htthttlc8azu86.R.inc(23121);zone = null;
    }finally{__CLR4_4_1htthttlc8azu86.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testTest() {__CLR4_4_1htthttlc8azu86.R.globalSliceStart(getClass().getName(),23122);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1447pqjhua();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1htthttlc8azu86.R.rethrow($CLV_t2$);}finally{__CLR4_4_1htthttlc8azu86.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Properties.testTest",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23122,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1447pqjhua(){try{__CLR4_4_1htthttlc8azu86.R.inc(23122);
        __CLR4_4_1htthttlc8azu86.R.inc(23123);assertEquals("2002-06-09T00:00:00.000Z", new Instant(TEST_TIME_NOW).toString());
        __CLR4_4_1htthttlc8azu86.R.inc(23124);assertEquals("2002-04-05T12:24:00.000Z", new Instant(TEST_TIME1).toString());
        __CLR4_4_1htthttlc8azu86.R.inc(23125);assertEquals("2003-05-06T14:28:00.000Z", new Instant(TEST_TIME2).toString());
    }finally{__CLR4_4_1htthttlc8azu86.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testPropertyGetEra() {__CLR4_4_1htthttlc8azu86.R.globalSliceStart(getClass().getName(),23126);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19gfrqkhue();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1htthttlc8azu86.R.rethrow($CLV_t2$);}finally{__CLR4_4_1htthttlc8azu86.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Properties.testPropertyGetEra",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23126,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19gfrqkhue(){try{__CLR4_4_1htthttlc8azu86.R.inc(23126);
        __CLR4_4_1htthttlc8azu86.R.inc(23127);DateMidnight test = new DateMidnight(2004, 6, 9);
        __CLR4_4_1htthttlc8azu86.R.inc(23128);assertSame(test.getChronology().era(), test.era().getField());
        __CLR4_4_1htthttlc8azu86.R.inc(23129);assertEquals("era", test.era().getName());
        __CLR4_4_1htthttlc8azu86.R.inc(23130);assertEquals("Property[era]", test.era().toString());
        __CLR4_4_1htthttlc8azu86.R.inc(23131);assertSame(test, test.era().getDateMidnight());
        __CLR4_4_1htthttlc8azu86.R.inc(23132);assertEquals(1, test.era().get());
        __CLR4_4_1htthttlc8azu86.R.inc(23133);assertEquals("AD", test.era().getAsText());
        __CLR4_4_1htthttlc8azu86.R.inc(23134);assertEquals("ap. J.-C.", test.era().getAsText(Locale.FRENCH));
        __CLR4_4_1htthttlc8azu86.R.inc(23135);assertEquals("AD", test.era().getAsShortText());
        __CLR4_4_1htthttlc8azu86.R.inc(23136);assertEquals("ap. J.-C.", test.era().getAsShortText(Locale.FRENCH));
        __CLR4_4_1htthttlc8azu86.R.inc(23137);assertEquals(test.getChronology().eras(), test.era().getDurationField());
        __CLR4_4_1htthttlc8azu86.R.inc(23138);assertEquals(null, test.era().getRangeDurationField());
        __CLR4_4_1htthttlc8azu86.R.inc(23139);assertEquals(2, test.era().getMaximumTextLength(null));
        __CLR4_4_1htthttlc8azu86.R.inc(23140);assertEquals(9, test.era().getMaximumTextLength(Locale.FRENCH));
        __CLR4_4_1htthttlc8azu86.R.inc(23141);assertEquals(2, test.era().getMaximumShortTextLength(null));
        __CLR4_4_1htthttlc8azu86.R.inc(23142);assertEquals(9, test.era().getMaximumShortTextLength(Locale.FRENCH));
    }finally{__CLR4_4_1htthttlc8azu86.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testPropertyGetYearOfEra() {__CLR4_4_1htthttlc8azu86.R.globalSliceStart(getClass().getName(),23143);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12tr0dkhuv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1htthttlc8azu86.R.rethrow($CLV_t2$);}finally{__CLR4_4_1htthttlc8azu86.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Properties.testPropertyGetYearOfEra",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23143,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12tr0dkhuv(){try{__CLR4_4_1htthttlc8azu86.R.inc(23143);
        __CLR4_4_1htthttlc8azu86.R.inc(23144);DateMidnight test = new DateMidnight(2004, 6, 9);
        __CLR4_4_1htthttlc8azu86.R.inc(23145);assertSame(test.getChronology().yearOfEra(), test.yearOfEra().getField());
        __CLR4_4_1htthttlc8azu86.R.inc(23146);assertEquals("yearOfEra", test.yearOfEra().getName());
        __CLR4_4_1htthttlc8azu86.R.inc(23147);assertEquals("Property[yearOfEra]", test.yearOfEra().toString());
        __CLR4_4_1htthttlc8azu86.R.inc(23148);assertSame(test, test.yearOfEra().getDateMidnight());
        __CLR4_4_1htthttlc8azu86.R.inc(23149);assertEquals(2004, test.yearOfEra().get());
        __CLR4_4_1htthttlc8azu86.R.inc(23150);assertEquals("2004", test.yearOfEra().getAsText());
        __CLR4_4_1htthttlc8azu86.R.inc(23151);assertEquals("2004", test.yearOfEra().getAsText(Locale.FRENCH));
        __CLR4_4_1htthttlc8azu86.R.inc(23152);assertEquals("2004", test.yearOfEra().getAsShortText());
        __CLR4_4_1htthttlc8azu86.R.inc(23153);assertEquals("2004", test.yearOfEra().getAsShortText(Locale.FRENCH));
        __CLR4_4_1htthttlc8azu86.R.inc(23154);assertEquals(test.getChronology().years(), test.yearOfEra().getDurationField());
        __CLR4_4_1htthttlc8azu86.R.inc(23155);assertEquals(test.getChronology().eras(), test.yearOfEra().getRangeDurationField());
        __CLR4_4_1htthttlc8azu86.R.inc(23156);assertEquals(9, test.yearOfEra().getMaximumTextLength(null));
        __CLR4_4_1htthttlc8azu86.R.inc(23157);assertEquals(9, test.yearOfEra().getMaximumShortTextLength(null));
    }finally{__CLR4_4_1htthttlc8azu86.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testPropertyGetCenturyOfEra() {__CLR4_4_1htthttlc8azu86.R.globalSliceStart(getClass().getName(),23158);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nozc5dhva();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1htthttlc8azu86.R.rethrow($CLV_t2$);}finally{__CLR4_4_1htthttlc8azu86.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Properties.testPropertyGetCenturyOfEra",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23158,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nozc5dhva(){try{__CLR4_4_1htthttlc8azu86.R.inc(23158);
        __CLR4_4_1htthttlc8azu86.R.inc(23159);DateMidnight test = new DateMidnight(2004, 6, 9);
        __CLR4_4_1htthttlc8azu86.R.inc(23160);assertSame(test.getChronology().centuryOfEra(), test.centuryOfEra().getField());
        __CLR4_4_1htthttlc8azu86.R.inc(23161);assertEquals("centuryOfEra", test.centuryOfEra().getName());
        __CLR4_4_1htthttlc8azu86.R.inc(23162);assertEquals("Property[centuryOfEra]", test.centuryOfEra().toString());
        __CLR4_4_1htthttlc8azu86.R.inc(23163);assertSame(test, test.centuryOfEra().getDateMidnight());
        __CLR4_4_1htthttlc8azu86.R.inc(23164);assertEquals(20, test.centuryOfEra().get());
        __CLR4_4_1htthttlc8azu86.R.inc(23165);assertEquals("20", test.centuryOfEra().getAsText());
        __CLR4_4_1htthttlc8azu86.R.inc(23166);assertEquals("20", test.centuryOfEra().getAsText(Locale.FRENCH));
        __CLR4_4_1htthttlc8azu86.R.inc(23167);assertEquals("20", test.centuryOfEra().getAsShortText());
        __CLR4_4_1htthttlc8azu86.R.inc(23168);assertEquals("20", test.centuryOfEra().getAsShortText(Locale.FRENCH));
        __CLR4_4_1htthttlc8azu86.R.inc(23169);assertEquals(test.getChronology().centuries(), test.centuryOfEra().getDurationField());
        __CLR4_4_1htthttlc8azu86.R.inc(23170);assertEquals(test.getChronology().eras(), test.centuryOfEra().getRangeDurationField());
        __CLR4_4_1htthttlc8azu86.R.inc(23171);assertEquals(7, test.centuryOfEra().getMaximumTextLength(null));
        __CLR4_4_1htthttlc8azu86.R.inc(23172);assertEquals(7, test.centuryOfEra().getMaximumShortTextLength(null));
    }finally{__CLR4_4_1htthttlc8azu86.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testPropertyGetYearOfCentury() {__CLR4_4_1htthttlc8azu86.R.globalSliceStart(getClass().getName(),23173);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1m6mt7chvp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1htthttlc8azu86.R.rethrow($CLV_t2$);}finally{__CLR4_4_1htthttlc8azu86.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Properties.testPropertyGetYearOfCentury",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23173,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1m6mt7chvp(){try{__CLR4_4_1htthttlc8azu86.R.inc(23173);
        __CLR4_4_1htthttlc8azu86.R.inc(23174);DateMidnight test = new DateMidnight(2004, 6, 9);
        __CLR4_4_1htthttlc8azu86.R.inc(23175);assertSame(test.getChronology().yearOfCentury(), test.yearOfCentury().getField());
        __CLR4_4_1htthttlc8azu86.R.inc(23176);assertEquals("yearOfCentury", test.yearOfCentury().getName());
        __CLR4_4_1htthttlc8azu86.R.inc(23177);assertEquals("Property[yearOfCentury]", test.yearOfCentury().toString());
        __CLR4_4_1htthttlc8azu86.R.inc(23178);assertSame(test, test.yearOfCentury().getDateMidnight());
        __CLR4_4_1htthttlc8azu86.R.inc(23179);assertEquals(4, test.yearOfCentury().get());
        __CLR4_4_1htthttlc8azu86.R.inc(23180);assertEquals("4", test.yearOfCentury().getAsText());
        __CLR4_4_1htthttlc8azu86.R.inc(23181);assertEquals("4", test.yearOfCentury().getAsText(Locale.FRENCH));
        __CLR4_4_1htthttlc8azu86.R.inc(23182);assertEquals("4", test.yearOfCentury().getAsShortText());
        __CLR4_4_1htthttlc8azu86.R.inc(23183);assertEquals("4", test.yearOfCentury().getAsShortText(Locale.FRENCH));
        __CLR4_4_1htthttlc8azu86.R.inc(23184);assertEquals(test.getChronology().years(), test.yearOfCentury().getDurationField());
        __CLR4_4_1htthttlc8azu86.R.inc(23185);assertEquals(test.getChronology().centuries(), test.yearOfCentury().getRangeDurationField());
        __CLR4_4_1htthttlc8azu86.R.inc(23186);assertEquals(2, test.yearOfCentury().getMaximumTextLength(null));
        __CLR4_4_1htthttlc8azu86.R.inc(23187);assertEquals(2, test.yearOfCentury().getMaximumShortTextLength(null));
    }finally{__CLR4_4_1htthttlc8azu86.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testPropertyGetWeekyear() {__CLR4_4_1htthttlc8azu86.R.globalSliceStart(getClass().getName(),23188);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1izv1ndhw4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1htthttlc8azu86.R.rethrow($CLV_t2$);}finally{__CLR4_4_1htthttlc8azu86.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Properties.testPropertyGetWeekyear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23188,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1izv1ndhw4(){try{__CLR4_4_1htthttlc8azu86.R.inc(23188);
        __CLR4_4_1htthttlc8azu86.R.inc(23189);DateMidnight test = new DateMidnight(2004, 6, 9);
        __CLR4_4_1htthttlc8azu86.R.inc(23190);assertSame(test.getChronology().weekyear(), test.weekyear().getField());
        __CLR4_4_1htthttlc8azu86.R.inc(23191);assertEquals("weekyear", test.weekyear().getName());
        __CLR4_4_1htthttlc8azu86.R.inc(23192);assertEquals("Property[weekyear]", test.weekyear().toString());
        __CLR4_4_1htthttlc8azu86.R.inc(23193);assertSame(test, test.weekyear().getDateMidnight());
        __CLR4_4_1htthttlc8azu86.R.inc(23194);assertEquals(2004, test.weekyear().get());
        __CLR4_4_1htthttlc8azu86.R.inc(23195);assertEquals("2004", test.weekyear().getAsText());
        __CLR4_4_1htthttlc8azu86.R.inc(23196);assertEquals("2004", test.weekyear().getAsText(Locale.FRENCH));
        __CLR4_4_1htthttlc8azu86.R.inc(23197);assertEquals("2004", test.weekyear().getAsShortText());
        __CLR4_4_1htthttlc8azu86.R.inc(23198);assertEquals("2004", test.weekyear().getAsShortText(Locale.FRENCH));
        __CLR4_4_1htthttlc8azu86.R.inc(23199);assertEquals(test.getChronology().weekyears(), test.weekyear().getDurationField());
        __CLR4_4_1htthttlc8azu86.R.inc(23200);assertEquals(null, test.weekyear().getRangeDurationField());
        __CLR4_4_1htthttlc8azu86.R.inc(23201);assertEquals(9, test.weekyear().getMaximumTextLength(null));
        __CLR4_4_1htthttlc8azu86.R.inc(23202);assertEquals(9, test.weekyear().getMaximumShortTextLength(null));
    }finally{__CLR4_4_1htthttlc8azu86.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testPropertyGetYear() {__CLR4_4_1htthttlc8azu86.R.globalSliceStart(getClass().getName(),23203);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tgqcqbhwj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1htthttlc8azu86.R.rethrow($CLV_t2$);}finally{__CLR4_4_1htthttlc8azu86.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Properties.testPropertyGetYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23203,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tgqcqbhwj(){try{__CLR4_4_1htthttlc8azu86.R.inc(23203);
        __CLR4_4_1htthttlc8azu86.R.inc(23204);DateMidnight test = new DateMidnight(2004, 6, 9);
        __CLR4_4_1htthttlc8azu86.R.inc(23205);assertSame(test.getChronology().year(), test.year().getField());
        __CLR4_4_1htthttlc8azu86.R.inc(23206);assertEquals("year", test.year().getName());
        __CLR4_4_1htthttlc8azu86.R.inc(23207);assertEquals("Property[year]", test.year().toString());
        __CLR4_4_1htthttlc8azu86.R.inc(23208);assertSame(test, test.year().getDateMidnight());
        __CLR4_4_1htthttlc8azu86.R.inc(23209);assertEquals(2004, test.year().get());
        __CLR4_4_1htthttlc8azu86.R.inc(23210);assertEquals("2004", test.year().getAsText());
        __CLR4_4_1htthttlc8azu86.R.inc(23211);assertEquals("2004", test.year().getAsText(Locale.FRENCH));
        __CLR4_4_1htthttlc8azu86.R.inc(23212);assertEquals("2004", test.year().getAsShortText());
        __CLR4_4_1htthttlc8azu86.R.inc(23213);assertEquals("2004", test.year().getAsShortText(Locale.FRENCH));
        __CLR4_4_1htthttlc8azu86.R.inc(23214);assertEquals(test.getChronology().years(), test.year().getDurationField());
        __CLR4_4_1htthttlc8azu86.R.inc(23215);assertEquals(null, test.year().getRangeDurationField());
        __CLR4_4_1htthttlc8azu86.R.inc(23216);assertEquals(9, test.year().getMaximumTextLength(null));
        __CLR4_4_1htthttlc8azu86.R.inc(23217);assertEquals(9, test.year().getMaximumShortTextLength(null));
        __CLR4_4_1htthttlc8azu86.R.inc(23218);assertEquals(-292275054, test.year().getMinimumValue());
        __CLR4_4_1htthttlc8azu86.R.inc(23219);assertEquals(-292275054, test.year().getMinimumValueOverall());
        __CLR4_4_1htthttlc8azu86.R.inc(23220);assertEquals(292278993, test.year().getMaximumValue());
        __CLR4_4_1htthttlc8azu86.R.inc(23221);assertEquals(292278993, test.year().getMaximumValueOverall());
    }finally{__CLR4_4_1htthttlc8azu86.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testPropertyGetMonthOfYear() {__CLR4_4_1htthttlc8azu86.R.globalSliceStart(getClass().getName(),23222);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_140q40khx2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1htthttlc8azu86.R.rethrow($CLV_t2$);}finally{__CLR4_4_1htthttlc8azu86.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Properties.testPropertyGetMonthOfYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23222,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_140q40khx2(){try{__CLR4_4_1htthttlc8azu86.R.inc(23222);
        __CLR4_4_1htthttlc8azu86.R.inc(23223);DateMidnight test = new DateMidnight(2004, 6, 9);
        __CLR4_4_1htthttlc8azu86.R.inc(23224);assertSame(test.getChronology().monthOfYear(), test.monthOfYear().getField());
        __CLR4_4_1htthttlc8azu86.R.inc(23225);assertEquals("monthOfYear", test.monthOfYear().getName());
        __CLR4_4_1htthttlc8azu86.R.inc(23226);assertEquals("Property[monthOfYear]", test.monthOfYear().toString());
        __CLR4_4_1htthttlc8azu86.R.inc(23227);assertSame(test, test.monthOfYear().getDateMidnight());
        __CLR4_4_1htthttlc8azu86.R.inc(23228);assertEquals(6, test.monthOfYear().get());
        __CLR4_4_1htthttlc8azu86.R.inc(23229);assertEquals("6", test.monthOfYear().getAsString());
        __CLR4_4_1htthttlc8azu86.R.inc(23230);assertEquals("June", test.monthOfYear().getAsText());
        __CLR4_4_1htthttlc8azu86.R.inc(23231);assertEquals("juin", test.monthOfYear().getAsText(Locale.FRENCH));
        __CLR4_4_1htthttlc8azu86.R.inc(23232);assertEquals("Jun", test.monthOfYear().getAsShortText());
        __CLR4_4_1htthttlc8azu86.R.inc(23233);assertEquals("juin", test.monthOfYear().getAsShortText(Locale.FRENCH));
        __CLR4_4_1htthttlc8azu86.R.inc(23234);assertEquals(test.getChronology().months(), test.monthOfYear().getDurationField());
        __CLR4_4_1htthttlc8azu86.R.inc(23235);assertEquals(test.getChronology().years(), test.monthOfYear().getRangeDurationField());
        __CLR4_4_1htthttlc8azu86.R.inc(23236);assertEquals(9, test.monthOfYear().getMaximumTextLength(null));
        __CLR4_4_1htthttlc8azu86.R.inc(23237);assertEquals(3, test.monthOfYear().getMaximumShortTextLength(null));
        __CLR4_4_1htthttlc8azu86.R.inc(23238);test = new DateMidnight(2004, 7, 9);
        __CLR4_4_1htthttlc8azu86.R.inc(23239);assertEquals("juillet", test.monthOfYear().getAsText(Locale.FRENCH));
        __CLR4_4_1htthttlc8azu86.R.inc(23240);assertEquals("juil.", test.monthOfYear().getAsShortText(Locale.FRENCH));
        __CLR4_4_1htthttlc8azu86.R.inc(23241);assertEquals(1, test.monthOfYear().getMinimumValue());
        __CLR4_4_1htthttlc8azu86.R.inc(23242);assertEquals(1, test.monthOfYear().getMinimumValueOverall());
        __CLR4_4_1htthttlc8azu86.R.inc(23243);assertEquals(12, test.monthOfYear().getMaximumValue());
        __CLR4_4_1htthttlc8azu86.R.inc(23244);assertEquals(12, test.monthOfYear().getMaximumValueOverall());
        __CLR4_4_1htthttlc8azu86.R.inc(23245);assertEquals(1, test.monthOfYear().getMinimumValue());
        __CLR4_4_1htthttlc8azu86.R.inc(23246);assertEquals(1, test.monthOfYear().getMinimumValueOverall());
        __CLR4_4_1htthttlc8azu86.R.inc(23247);assertEquals(12, test.monthOfYear().getMaximumValue());
        __CLR4_4_1htthttlc8azu86.R.inc(23248);assertEquals(12, test.monthOfYear().getMaximumValueOverall());
    }finally{__CLR4_4_1htthttlc8azu86.R.flushNeeded();}}

    public void testPropertySetMonthOfYear() {__CLR4_4_1htthttlc8azu86.R.globalSliceStart(getClass().getName(),23249);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1x2imu8hxt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1htthttlc8azu86.R.rethrow($CLV_t2$);}finally{__CLR4_4_1htthttlc8azu86.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Properties.testPropertySetMonthOfYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23249,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1x2imu8hxt(){try{__CLR4_4_1htthttlc8azu86.R.inc(23249);
        __CLR4_4_1htthttlc8azu86.R.inc(23250);DateMidnight test = new DateMidnight(2004, 6, 9);
        __CLR4_4_1htthttlc8azu86.R.inc(23251);DateMidnight copy = test.monthOfYear().setCopy(8);
        __CLR4_4_1htthttlc8azu86.R.inc(23252);assertEquals(2004, copy.getYear());
        __CLR4_4_1htthttlc8azu86.R.inc(23253);assertEquals(8, copy.getMonthOfYear());
        __CLR4_4_1htthttlc8azu86.R.inc(23254);assertEquals(9, copy.getDayOfMonth());
    }finally{__CLR4_4_1htthttlc8azu86.R.flushNeeded();}}

    public void testPropertySetTextMonthOfYear() {__CLR4_4_1htthttlc8azu86.R.globalSliceStart(getClass().getName(),23255);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kzotlfhxz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1htthttlc8azu86.R.rethrow($CLV_t2$);}finally{__CLR4_4_1htthttlc8azu86.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Properties.testPropertySetTextMonthOfYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23255,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kzotlfhxz(){try{__CLR4_4_1htthttlc8azu86.R.inc(23255);
        __CLR4_4_1htthttlc8azu86.R.inc(23256);DateMidnight test = new DateMidnight(2004, 6, 9);
        __CLR4_4_1htthttlc8azu86.R.inc(23257);DateMidnight copy = test.monthOfYear().setCopy("8");
        __CLR4_4_1htthttlc8azu86.R.inc(23258);assertEquals(2004, copy.getYear());
        __CLR4_4_1htthttlc8azu86.R.inc(23259);assertEquals(8, copy.getMonthOfYear());
        __CLR4_4_1htthttlc8azu86.R.inc(23260);assertEquals(9, copy.getDayOfMonth());
    }finally{__CLR4_4_1htthttlc8azu86.R.flushNeeded();}}

    public void testPropertySetTextLocaleMonthOfYear() {__CLR4_4_1htthttlc8azu86.R.globalSliceStart(getClass().getName(),23261);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yfg7yxhy5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1htthttlc8azu86.R.rethrow($CLV_t2$);}finally{__CLR4_4_1htthttlc8azu86.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Properties.testPropertySetTextLocaleMonthOfYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23261,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yfg7yxhy5(){try{__CLR4_4_1htthttlc8azu86.R.inc(23261);
        __CLR4_4_1htthttlc8azu86.R.inc(23262);DateMidnight test = new DateMidnight(2004, 6, 9);
        __CLR4_4_1htthttlc8azu86.R.inc(23263);DateMidnight copy = test.monthOfYear().setCopy("mars", Locale.FRENCH);
        __CLR4_4_1htthttlc8azu86.R.inc(23264);assertEquals(2004, copy.getYear());
        __CLR4_4_1htthttlc8azu86.R.inc(23265);assertEquals(3, copy.getMonthOfYear());
        __CLR4_4_1htthttlc8azu86.R.inc(23266);assertEquals(9, copy.getDayOfMonth());
    }finally{__CLR4_4_1htthttlc8azu86.R.flushNeeded();}}

    public void testPropertyAddMonthOfYear() {__CLR4_4_1htthttlc8azu86.R.globalSliceStart(getClass().getName(),23267);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cfd7jhyb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1htthttlc8azu86.R.rethrow($CLV_t2$);}finally{__CLR4_4_1htthttlc8azu86.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Properties.testPropertyAddMonthOfYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23267,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cfd7jhyb(){try{__CLR4_4_1htthttlc8azu86.R.inc(23267);
        __CLR4_4_1htthttlc8azu86.R.inc(23268);DateMidnight test = new DateMidnight(2004, 6, 9);
        __CLR4_4_1htthttlc8azu86.R.inc(23269);DateMidnight copy = test.monthOfYear().addToCopy(8);
        __CLR4_4_1htthttlc8azu86.R.inc(23270);assertEquals(2005, copy.getYear());
        __CLR4_4_1htthttlc8azu86.R.inc(23271);assertEquals(2, copy.getMonthOfYear());
        __CLR4_4_1htthttlc8azu86.R.inc(23272);assertEquals(9, copy.getDayOfMonth());
    }finally{__CLR4_4_1htthttlc8azu86.R.flushNeeded();}}

    public void testPropertyAddLongMonthOfYear() {__CLR4_4_1htthttlc8azu86.R.globalSliceStart(getClass().getName(),23273);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1x3wc05hyh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1htthttlc8azu86.R.rethrow($CLV_t2$);}finally{__CLR4_4_1htthttlc8azu86.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Properties.testPropertyAddLongMonthOfYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23273,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1x3wc05hyh(){try{__CLR4_4_1htthttlc8azu86.R.inc(23273);
        __CLR4_4_1htthttlc8azu86.R.inc(23274);DateMidnight test = new DateMidnight(2004, 6, 9);
        __CLR4_4_1htthttlc8azu86.R.inc(23275);DateMidnight copy = test.monthOfYear().addToCopy(8L);
        __CLR4_4_1htthttlc8azu86.R.inc(23276);assertEquals(2005, copy.getYear());
        __CLR4_4_1htthttlc8azu86.R.inc(23277);assertEquals(2, copy.getMonthOfYear());
        __CLR4_4_1htthttlc8azu86.R.inc(23278);assertEquals(9, copy.getDayOfMonth());
    }finally{__CLR4_4_1htthttlc8azu86.R.flushNeeded();}}

    public void testPropertyAddWrapFieldMonthOfYear() {__CLR4_4_1htthttlc8azu86.R.globalSliceStart(getClass().getName(),23279);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1phvuslhyn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1htthttlc8azu86.R.rethrow($CLV_t2$);}finally{__CLR4_4_1htthttlc8azu86.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Properties.testPropertyAddWrapFieldMonthOfYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23279,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1phvuslhyn(){try{__CLR4_4_1htthttlc8azu86.R.inc(23279);
        __CLR4_4_1htthttlc8azu86.R.inc(23280);DateMidnight test = new DateMidnight(2004, 6, 9);
        __CLR4_4_1htthttlc8azu86.R.inc(23281);DateMidnight copy = test.monthOfYear().addWrapFieldToCopy(8);
        __CLR4_4_1htthttlc8azu86.R.inc(23282);assertEquals(2004, copy.getYear());
        __CLR4_4_1htthttlc8azu86.R.inc(23283);assertEquals(2, copy.getMonthOfYear());
        __CLR4_4_1htthttlc8azu86.R.inc(23284);assertEquals(9, copy.getDayOfMonth());
    }finally{__CLR4_4_1htthttlc8azu86.R.flushNeeded();}}

    public void testPropertyGetDifferenceMonthOfYear() {__CLR4_4_1htthttlc8azu86.R.globalSliceStart(getClass().getName(),23285);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17u7nynhyt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1htthttlc8azu86.R.rethrow($CLV_t2$);}finally{__CLR4_4_1htthttlc8azu86.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Properties.testPropertyGetDifferenceMonthOfYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23285,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17u7nynhyt(){try{__CLR4_4_1htthttlc8azu86.R.inc(23285);
        __CLR4_4_1htthttlc8azu86.R.inc(23286);DateMidnight test1 = new DateMidnight(2004, 6, 9);
        __CLR4_4_1htthttlc8azu86.R.inc(23287);DateMidnight test2 = new DateMidnight(2004, 8, 9);
        __CLR4_4_1htthttlc8azu86.R.inc(23288);assertEquals(-2, test1.monthOfYear().getDifference(test2));
        __CLR4_4_1htthttlc8azu86.R.inc(23289);assertEquals(2, test2.monthOfYear().getDifference(test1));
        __CLR4_4_1htthttlc8azu86.R.inc(23290);assertEquals(-2L, test1.monthOfYear().getDifferenceAsLong(test2));
        __CLR4_4_1htthttlc8azu86.R.inc(23291);assertEquals(2L, test2.monthOfYear().getDifferenceAsLong(test1));
    }finally{__CLR4_4_1htthttlc8azu86.R.flushNeeded();}}

    public void testPropertyRoundFloorMonthOfYear() {__CLR4_4_1htthttlc8azu86.R.globalSliceStart(getClass().getName(),23292);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ofqj5ihz0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1htthttlc8azu86.R.rethrow($CLV_t2$);}finally{__CLR4_4_1htthttlc8azu86.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Properties.testPropertyRoundFloorMonthOfYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23292,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ofqj5ihz0(){try{__CLR4_4_1htthttlc8azu86.R.inc(23292);
        __CLR4_4_1htthttlc8azu86.R.inc(23293);DateMidnight test = new DateMidnight(2004, 6, 16);
        __CLR4_4_1htthttlc8azu86.R.inc(23294);DateMidnight copy = test.monthOfYear().roundFloorCopy();
        __CLR4_4_1htthttlc8azu86.R.inc(23295);assertEquals("2004-06-01T00:00:00.000+01:00", copy.toString());
    }finally{__CLR4_4_1htthttlc8azu86.R.flushNeeded();}}

    public void testPropertyRoundCeilingMonthOfYear() {__CLR4_4_1htthttlc8azu86.R.globalSliceStart(getClass().getName(),23296);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1h82dtxhz4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1htthttlc8azu86.R.rethrow($CLV_t2$);}finally{__CLR4_4_1htthttlc8azu86.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Properties.testPropertyRoundCeilingMonthOfYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23296,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1h82dtxhz4(){try{__CLR4_4_1htthttlc8azu86.R.inc(23296);
        __CLR4_4_1htthttlc8azu86.R.inc(23297);DateMidnight test = new DateMidnight(2004, 6, 16);
        __CLR4_4_1htthttlc8azu86.R.inc(23298);DateMidnight copy = test.monthOfYear().roundCeilingCopy();
        __CLR4_4_1htthttlc8azu86.R.inc(23299);assertEquals("2004-07-01T00:00:00.000+01:00", copy.toString());
    }finally{__CLR4_4_1htthttlc8azu86.R.flushNeeded();}}

    public void testPropertyRoundHalfFloorMonthOfYear() {__CLR4_4_1htthttlc8azu86.R.globalSliceStart(getClass().getName(),23300);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1i6z9bdhz8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1htthttlc8azu86.R.rethrow($CLV_t2$);}finally{__CLR4_4_1htthttlc8azu86.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Properties.testPropertyRoundHalfFloorMonthOfYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23300,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1i6z9bdhz8(){try{__CLR4_4_1htthttlc8azu86.R.inc(23300);
        __CLR4_4_1htthttlc8azu86.R.inc(23301);DateMidnight test = new DateMidnight(2004, 6, 16);
        __CLR4_4_1htthttlc8azu86.R.inc(23302);DateMidnight copy = test.monthOfYear().roundHalfFloorCopy();
        __CLR4_4_1htthttlc8azu86.R.inc(23303);assertEquals("2004-06-01T00:00:00.000+01:00", copy.toString());
        
        __CLR4_4_1htthttlc8azu86.R.inc(23304);test = new DateMidnight(2004, 6, 17);
        __CLR4_4_1htthttlc8azu86.R.inc(23305);copy = test.monthOfYear().roundHalfFloorCopy();
        __CLR4_4_1htthttlc8azu86.R.inc(23306);assertEquals("2004-07-01T00:00:00.000+01:00", copy.toString());
        
        __CLR4_4_1htthttlc8azu86.R.inc(23307);test = new DateMidnight(2004, 6, 15);
        __CLR4_4_1htthttlc8azu86.R.inc(23308);copy = test.monthOfYear().roundHalfFloorCopy();
        __CLR4_4_1htthttlc8azu86.R.inc(23309);assertEquals("2004-06-01T00:00:00.000+01:00", copy.toString());
    }finally{__CLR4_4_1htthttlc8azu86.R.flushNeeded();}}

    public void testPropertyRoundHalfCeilingMonthOfYear() {__CLR4_4_1htthttlc8azu86.R.globalSliceStart(getClass().getName(),23310);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fyils8hzi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1htthttlc8azu86.R.rethrow($CLV_t2$);}finally{__CLR4_4_1htthttlc8azu86.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Properties.testPropertyRoundHalfCeilingMonthOfYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23310,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fyils8hzi(){try{__CLR4_4_1htthttlc8azu86.R.inc(23310);
        __CLR4_4_1htthttlc8azu86.R.inc(23311);DateMidnight test = new DateMidnight(2004, 6, 16);
        __CLR4_4_1htthttlc8azu86.R.inc(23312);DateMidnight copy = test.monthOfYear().roundHalfCeilingCopy();
        __CLR4_4_1htthttlc8azu86.R.inc(23313);assertEquals("2004-07-01T00:00:00.000+01:00", copy.toString());
        
        __CLR4_4_1htthttlc8azu86.R.inc(23314);test = new DateMidnight(2004, 6, 17);
        __CLR4_4_1htthttlc8azu86.R.inc(23315);copy = test.monthOfYear().roundHalfCeilingCopy();
        __CLR4_4_1htthttlc8azu86.R.inc(23316);assertEquals("2004-07-01T00:00:00.000+01:00", copy.toString());
        
        __CLR4_4_1htthttlc8azu86.R.inc(23317);test = new DateMidnight(2004, 6, 15);
        __CLR4_4_1htthttlc8azu86.R.inc(23318);copy = test.monthOfYear().roundHalfCeilingCopy();
        __CLR4_4_1htthttlc8azu86.R.inc(23319);assertEquals("2004-06-01T00:00:00.000+01:00", copy.toString());
    }finally{__CLR4_4_1htthttlc8azu86.R.flushNeeded();}}

    public void testPropertyRoundHalfEvenMonthOfYear() {__CLR4_4_1htthttlc8azu86.R.globalSliceStart(getClass().getName(),23320);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1c7xynbhzs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1htthttlc8azu86.R.rethrow($CLV_t2$);}finally{__CLR4_4_1htthttlc8azu86.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Properties.testPropertyRoundHalfEvenMonthOfYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23320,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1c7xynbhzs(){try{__CLR4_4_1htthttlc8azu86.R.inc(23320);
        __CLR4_4_1htthttlc8azu86.R.inc(23321);DateMidnight test = new DateMidnight(2004, 6, 16);
        __CLR4_4_1htthttlc8azu86.R.inc(23322);DateMidnight copy = test.monthOfYear().roundHalfEvenCopy();
        __CLR4_4_1htthttlc8azu86.R.inc(23323);assertEquals("2004-06-01T00:00:00.000+01:00", copy.toString());
        
        __CLR4_4_1htthttlc8azu86.R.inc(23324);test = new DateMidnight(2004, 9, 16);
        __CLR4_4_1htthttlc8azu86.R.inc(23325);copy = test.monthOfYear().roundHalfEvenCopy();
        __CLR4_4_1htthttlc8azu86.R.inc(23326);assertEquals("2004-10-01T00:00:00.000+01:00", copy.toString());
        
        __CLR4_4_1htthttlc8azu86.R.inc(23327);test = new DateMidnight(2004, 6, 17);
        __CLR4_4_1htthttlc8azu86.R.inc(23328);copy = test.monthOfYear().roundHalfEvenCopy();
        __CLR4_4_1htthttlc8azu86.R.inc(23329);assertEquals("2004-07-01T00:00:00.000+01:00", copy.toString());
        
        __CLR4_4_1htthttlc8azu86.R.inc(23330);test = new DateMidnight(2004, 6, 15);
        __CLR4_4_1htthttlc8azu86.R.inc(23331);copy = test.monthOfYear().roundHalfEvenCopy();
        __CLR4_4_1htthttlc8azu86.R.inc(23332);assertEquals("2004-06-01T00:00:00.000+01:00", copy.toString());
    }finally{__CLR4_4_1htthttlc8azu86.R.flushNeeded();}}

    public void testPropertyRemainderMonthOfYear() {__CLR4_4_1htthttlc8azu86.R.globalSliceStart(getClass().getName(),23333);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1y3jhjxi05();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1htthttlc8azu86.R.rethrow($CLV_t2$);}finally{__CLR4_4_1htthttlc8azu86.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Properties.testPropertyRemainderMonthOfYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23333,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1y3jhjxi05(){try{__CLR4_4_1htthttlc8azu86.R.inc(23333);
        __CLR4_4_1htthttlc8azu86.R.inc(23334);DateMidnight test = new DateMidnight(2004, 6, 9);
        __CLR4_4_1htthttlc8azu86.R.inc(23335);assertEquals((9L - 1L) * DateTimeConstants.MILLIS_PER_DAY, test.monthOfYear().remainder());
    }finally{__CLR4_4_1htthttlc8azu86.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testPropertyGetDayOfMonth() {__CLR4_4_1htthttlc8azu86.R.globalSliceStart(getClass().getName(),23336);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1198qu5i08();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1htthttlc8azu86.R.rethrow($CLV_t2$);}finally{__CLR4_4_1htthttlc8azu86.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Properties.testPropertyGetDayOfMonth",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23336,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1198qu5i08(){try{__CLR4_4_1htthttlc8azu86.R.inc(23336);
        __CLR4_4_1htthttlc8azu86.R.inc(23337);DateMidnight test = new DateMidnight(2004, 6, 9);
        __CLR4_4_1htthttlc8azu86.R.inc(23338);assertSame(test.getChronology().dayOfMonth(), test.dayOfMonth().getField());
        __CLR4_4_1htthttlc8azu86.R.inc(23339);assertEquals("dayOfMonth", test.dayOfMonth().getName());
        __CLR4_4_1htthttlc8azu86.R.inc(23340);assertEquals("Property[dayOfMonth]", test.dayOfMonth().toString());
        __CLR4_4_1htthttlc8azu86.R.inc(23341);assertSame(test, test.dayOfMonth().getDateMidnight());
        __CLR4_4_1htthttlc8azu86.R.inc(23342);assertEquals(9, test.dayOfMonth().get());
        __CLR4_4_1htthttlc8azu86.R.inc(23343);assertEquals("9", test.dayOfMonth().getAsText());
        __CLR4_4_1htthttlc8azu86.R.inc(23344);assertEquals("9", test.dayOfMonth().getAsText(Locale.FRENCH));
        __CLR4_4_1htthttlc8azu86.R.inc(23345);assertEquals("9", test.dayOfMonth().getAsShortText());
        __CLR4_4_1htthttlc8azu86.R.inc(23346);assertEquals("9", test.dayOfMonth().getAsShortText(Locale.FRENCH));
        __CLR4_4_1htthttlc8azu86.R.inc(23347);assertEquals(test.getChronology().days(), test.dayOfMonth().getDurationField());
        __CLR4_4_1htthttlc8azu86.R.inc(23348);assertEquals(test.getChronology().months(), test.dayOfMonth().getRangeDurationField());
        __CLR4_4_1htthttlc8azu86.R.inc(23349);assertEquals(2, test.dayOfMonth().getMaximumTextLength(null));
        __CLR4_4_1htthttlc8azu86.R.inc(23350);assertEquals(2, test.dayOfMonth().getMaximumShortTextLength(null));
        __CLR4_4_1htthttlc8azu86.R.inc(23351);assertEquals(1, test.dayOfMonth().getMinimumValue());
        __CLR4_4_1htthttlc8azu86.R.inc(23352);assertEquals(1, test.dayOfMonth().getMinimumValueOverall());
        __CLR4_4_1htthttlc8azu86.R.inc(23353);assertEquals(30, test.dayOfMonth().getMaximumValue());
        __CLR4_4_1htthttlc8azu86.R.inc(23354);assertEquals(31, test.dayOfMonth().getMaximumValueOverall());
        __CLR4_4_1htthttlc8azu86.R.inc(23355);assertEquals(false, test.dayOfMonth().isLeap());
        __CLR4_4_1htthttlc8azu86.R.inc(23356);assertEquals(0, test.dayOfMonth().getLeapAmount());
        __CLR4_4_1htthttlc8azu86.R.inc(23357);assertEquals(null, test.dayOfMonth().getLeapDurationField());
    }finally{__CLR4_4_1htthttlc8azu86.R.flushNeeded();}}

    public void testPropertyWithMaximumValueDayOfMonth() {__CLR4_4_1htthttlc8azu86.R.globalSliceStart(getClass().getName(),23358);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f2wa9ei0u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1htthttlc8azu86.R.rethrow($CLV_t2$);}finally{__CLR4_4_1htthttlc8azu86.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Properties.testPropertyWithMaximumValueDayOfMonth",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23358,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f2wa9ei0u(){try{__CLR4_4_1htthttlc8azu86.R.inc(23358);
        __CLR4_4_1htthttlc8azu86.R.inc(23359);DateMidnight test = new DateMidnight(2004, 6, 9);
        __CLR4_4_1htthttlc8azu86.R.inc(23360);DateMidnight copy = test.dayOfMonth().withMaximumValue();
        __CLR4_4_1htthttlc8azu86.R.inc(23361);assertEquals("2004-06-09T00:00:00.000+01:00", test.toString());
        __CLR4_4_1htthttlc8azu86.R.inc(23362);assertEquals("2004-06-30T00:00:00.000+01:00", copy.toString());
    }finally{__CLR4_4_1htthttlc8azu86.R.flushNeeded();}}

    public void testPropertyWithMinimumValueDayOfMonth() {__CLR4_4_1htthttlc8azu86.R.globalSliceStart(getClass().getName(),23363);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1duofeki0z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1htthttlc8azu86.R.rethrow($CLV_t2$);}finally{__CLR4_4_1htthttlc8azu86.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Properties.testPropertyWithMinimumValueDayOfMonth",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23363,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1duofeki0z(){try{__CLR4_4_1htthttlc8azu86.R.inc(23363);
        __CLR4_4_1htthttlc8azu86.R.inc(23364);DateMidnight test = new DateMidnight(2004, 6, 9);
        __CLR4_4_1htthttlc8azu86.R.inc(23365);DateMidnight copy = test.dayOfMonth().withMinimumValue();
        __CLR4_4_1htthttlc8azu86.R.inc(23366);assertEquals("2004-06-09T00:00:00.000+01:00", test.toString());
        __CLR4_4_1htthttlc8azu86.R.inc(23367);assertEquals("2004-06-01T00:00:00.000+01:00", copy.toString());
    }finally{__CLR4_4_1htthttlc8azu86.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testPropertyGetDayOfYear() {__CLR4_4_1htthttlc8azu86.R.globalSliceStart(getClass().getName(),23368);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fvk08i14();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1htthttlc8azu86.R.rethrow($CLV_t2$);}finally{__CLR4_4_1htthttlc8azu86.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Properties.testPropertyGetDayOfYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23368,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fvk08i14(){try{__CLR4_4_1htthttlc8azu86.R.inc(23368);
        // 31+29+31+30+31+9 = 161
        __CLR4_4_1htthttlc8azu86.R.inc(23369);DateMidnight test = new DateMidnight(2004, 6, 9);
        __CLR4_4_1htthttlc8azu86.R.inc(23370);assertSame(test.getChronology().dayOfYear(), test.dayOfYear().getField());
        __CLR4_4_1htthttlc8azu86.R.inc(23371);assertEquals("dayOfYear", test.dayOfYear().getName());
        __CLR4_4_1htthttlc8azu86.R.inc(23372);assertEquals("Property[dayOfYear]", test.dayOfYear().toString());
        __CLR4_4_1htthttlc8azu86.R.inc(23373);assertSame(test, test.dayOfYear().getDateMidnight());
        __CLR4_4_1htthttlc8azu86.R.inc(23374);assertEquals(161, test.dayOfYear().get());
        __CLR4_4_1htthttlc8azu86.R.inc(23375);assertEquals("161", test.dayOfYear().getAsText());
        __CLR4_4_1htthttlc8azu86.R.inc(23376);assertEquals("161", test.dayOfYear().getAsText(Locale.FRENCH));
        __CLR4_4_1htthttlc8azu86.R.inc(23377);assertEquals("161", test.dayOfYear().getAsShortText());
        __CLR4_4_1htthttlc8azu86.R.inc(23378);assertEquals("161", test.dayOfYear().getAsShortText(Locale.FRENCH));
        __CLR4_4_1htthttlc8azu86.R.inc(23379);assertEquals(test.getChronology().days(), test.dayOfYear().getDurationField());
        __CLR4_4_1htthttlc8azu86.R.inc(23380);assertEquals(test.getChronology().years(), test.dayOfYear().getRangeDurationField());
        __CLR4_4_1htthttlc8azu86.R.inc(23381);assertEquals(3, test.dayOfYear().getMaximumTextLength(null));
        __CLR4_4_1htthttlc8azu86.R.inc(23382);assertEquals(3, test.dayOfYear().getMaximumShortTextLength(null));
        __CLR4_4_1htthttlc8azu86.R.inc(23383);assertEquals(false, test.dayOfYear().isLeap());
        __CLR4_4_1htthttlc8azu86.R.inc(23384);assertEquals(0, test.dayOfYear().getLeapAmount());
        __CLR4_4_1htthttlc8azu86.R.inc(23385);assertEquals(null, test.dayOfYear().getLeapDurationField());
    }finally{__CLR4_4_1htthttlc8azu86.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testPropertyGetWeekOfWeekyear() {__CLR4_4_1htthttlc8azu86.R.globalSliceStart(getClass().getName(),23386);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1oty2c2i1m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1htthttlc8azu86.R.rethrow($CLV_t2$);}finally{__CLR4_4_1htthttlc8azu86.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Properties.testPropertyGetWeekOfWeekyear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23386,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1oty2c2i1m(){try{__CLR4_4_1htthttlc8azu86.R.inc(23386);
        __CLR4_4_1htthttlc8azu86.R.inc(23387);DateMidnight test = new DateMidnight(2004, 6, 9);
        __CLR4_4_1htthttlc8azu86.R.inc(23388);assertSame(test.getChronology().weekOfWeekyear(), test.weekOfWeekyear().getField());
        __CLR4_4_1htthttlc8azu86.R.inc(23389);assertEquals("weekOfWeekyear", test.weekOfWeekyear().getName());
        __CLR4_4_1htthttlc8azu86.R.inc(23390);assertEquals("Property[weekOfWeekyear]", test.weekOfWeekyear().toString());
        __CLR4_4_1htthttlc8azu86.R.inc(23391);assertSame(test, test.weekOfWeekyear().getDateMidnight());
        __CLR4_4_1htthttlc8azu86.R.inc(23392);assertEquals(24, test.weekOfWeekyear().get());
        __CLR4_4_1htthttlc8azu86.R.inc(23393);assertEquals("24", test.weekOfWeekyear().getAsText());
        __CLR4_4_1htthttlc8azu86.R.inc(23394);assertEquals("24", test.weekOfWeekyear().getAsText(Locale.FRENCH));
        __CLR4_4_1htthttlc8azu86.R.inc(23395);assertEquals("24", test.weekOfWeekyear().getAsShortText());
        __CLR4_4_1htthttlc8azu86.R.inc(23396);assertEquals("24", test.weekOfWeekyear().getAsShortText(Locale.FRENCH));
        __CLR4_4_1htthttlc8azu86.R.inc(23397);assertEquals(test.getChronology().weeks(), test.weekOfWeekyear().getDurationField());
        __CLR4_4_1htthttlc8azu86.R.inc(23398);assertEquals(test.getChronology().weekyears(), test.weekOfWeekyear().getRangeDurationField());
        __CLR4_4_1htthttlc8azu86.R.inc(23399);assertEquals(2, test.weekOfWeekyear().getMaximumTextLength(null));
        __CLR4_4_1htthttlc8azu86.R.inc(23400);assertEquals(2, test.weekOfWeekyear().getMaximumShortTextLength(null));
        __CLR4_4_1htthttlc8azu86.R.inc(23401);assertEquals(false, test.weekOfWeekyear().isLeap());
        __CLR4_4_1htthttlc8azu86.R.inc(23402);assertEquals(0, test.weekOfWeekyear().getLeapAmount());
        __CLR4_4_1htthttlc8azu86.R.inc(23403);assertEquals(null, test.weekOfWeekyear().getLeapDurationField());
    }finally{__CLR4_4_1htthttlc8azu86.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testPropertyGetDayOfWeek() {__CLR4_4_1htthttlc8azu86.R.globalSliceStart(getClass().getName(),23404);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ftu28vi24();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1htthttlc8azu86.R.rethrow($CLV_t2$);}finally{__CLR4_4_1htthttlc8azu86.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Properties.testPropertyGetDayOfWeek",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23404,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ftu28vi24(){try{__CLR4_4_1htthttlc8azu86.R.inc(23404);
        __CLR4_4_1htthttlc8azu86.R.inc(23405);DateMidnight test = new DateMidnight(2004, 6, 9);
        __CLR4_4_1htthttlc8azu86.R.inc(23406);assertSame(test.getChronology().dayOfWeek(), test.dayOfWeek().getField());
        __CLR4_4_1htthttlc8azu86.R.inc(23407);assertEquals("dayOfWeek", test.dayOfWeek().getName());
        __CLR4_4_1htthttlc8azu86.R.inc(23408);assertEquals("Property[dayOfWeek]", test.dayOfWeek().toString());
        __CLR4_4_1htthttlc8azu86.R.inc(23409);assertSame(test, test.dayOfWeek().getDateMidnight());
        __CLR4_4_1htthttlc8azu86.R.inc(23410);assertEquals(3, test.dayOfWeek().get());
        __CLR4_4_1htthttlc8azu86.R.inc(23411);assertEquals("3", test.dayOfWeek().getAsString());
        __CLR4_4_1htthttlc8azu86.R.inc(23412);assertEquals("Wednesday", test.dayOfWeek().getAsText());
        __CLR4_4_1htthttlc8azu86.R.inc(23413);assertEquals("mercredi", test.dayOfWeek().getAsText(Locale.FRENCH));
        __CLR4_4_1htthttlc8azu86.R.inc(23414);assertEquals("Wed", test.dayOfWeek().getAsShortText());
        __CLR4_4_1htthttlc8azu86.R.inc(23415);assertEquals("mer.", test.dayOfWeek().getAsShortText(Locale.FRENCH));
        __CLR4_4_1htthttlc8azu86.R.inc(23416);assertEquals(test.getChronology().days(), test.dayOfWeek().getDurationField());
        __CLR4_4_1htthttlc8azu86.R.inc(23417);assertEquals(test.getChronology().weeks(), test.dayOfWeek().getRangeDurationField());
        __CLR4_4_1htthttlc8azu86.R.inc(23418);assertEquals(9, test.dayOfWeek().getMaximumTextLength(null));
        __CLR4_4_1htthttlc8azu86.R.inc(23419);assertEquals(8, test.dayOfWeek().getMaximumTextLength(Locale.FRENCH));
        __CLR4_4_1htthttlc8azu86.R.inc(23420);assertEquals(3, test.dayOfWeek().getMaximumShortTextLength(null));
        __CLR4_4_1htthttlc8azu86.R.inc(23421);assertEquals(4, test.dayOfWeek().getMaximumShortTextLength(Locale.FRENCH));
        __CLR4_4_1htthttlc8azu86.R.inc(23422);assertEquals(1, test.dayOfWeek().getMinimumValue());
        __CLR4_4_1htthttlc8azu86.R.inc(23423);assertEquals(1, test.dayOfWeek().getMinimumValueOverall());
        __CLR4_4_1htthttlc8azu86.R.inc(23424);assertEquals(7, test.dayOfWeek().getMaximumValue());
        __CLR4_4_1htthttlc8azu86.R.inc(23425);assertEquals(7, test.dayOfWeek().getMaximumValueOverall());
        __CLR4_4_1htthttlc8azu86.R.inc(23426);assertEquals(false, test.dayOfWeek().isLeap());
        __CLR4_4_1htthttlc8azu86.R.inc(23427);assertEquals(0, test.dayOfWeek().getLeapAmount());
        __CLR4_4_1htthttlc8azu86.R.inc(23428);assertEquals(null, test.dayOfWeek().getLeapDurationField());
    }finally{__CLR4_4_1htthttlc8azu86.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testPropertyToIntervalYearOfEra() {__CLR4_4_1htthttlc8azu86.R.globalSliceStart(getClass().getName(),23429);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dof34i2t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1htthttlc8azu86.R.rethrow($CLV_t2$);}finally{__CLR4_4_1htthttlc8azu86.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Properties.testPropertyToIntervalYearOfEra",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23429,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dof34i2t(){try{__CLR4_4_1htthttlc8azu86.R.inc(23429);
      __CLR4_4_1htthttlc8azu86.R.inc(23430);DateMidnight test = new DateMidnight(2004, 6, 9);
      __CLR4_4_1htthttlc8azu86.R.inc(23431);Interval testInterval = test.yearOfEra().toInterval();
      __CLR4_4_1htthttlc8azu86.R.inc(23432);assertEquals(new DateMidnight(2004, 1, 1), testInterval.getStart());
      __CLR4_4_1htthttlc8azu86.R.inc(23433);assertEquals(new DateMidnight(2005, 1, 1), testInterval.getEnd());
    }finally{__CLR4_4_1htthttlc8azu86.R.flushNeeded();}}

    public void testPropertyToIntervalYearOfCentury() {__CLR4_4_1htthttlc8azu86.R.globalSliceStart(getClass().getName(),23434);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1h9bdk0i2y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1htthttlc8azu86.R.rethrow($CLV_t2$);}finally{__CLR4_4_1htthttlc8azu86.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Properties.testPropertyToIntervalYearOfCentury",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23434,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1h9bdk0i2y(){try{__CLR4_4_1htthttlc8azu86.R.inc(23434);
      __CLR4_4_1htthttlc8azu86.R.inc(23435);DateMidnight test = new DateMidnight(2004, 6, 9);
      __CLR4_4_1htthttlc8azu86.R.inc(23436);Interval testInterval = test.yearOfCentury().toInterval();
      __CLR4_4_1htthttlc8azu86.R.inc(23437);assertEquals(new DateMidnight(2004, 1, 1), testInterval.getStart());
      __CLR4_4_1htthttlc8azu86.R.inc(23438);assertEquals(new DateMidnight(2005, 1, 1), testInterval.getEnd());
    }finally{__CLR4_4_1htthttlc8azu86.R.flushNeeded();}}

    public void testPropertyToIntervalYear() {__CLR4_4_1htthttlc8azu86.R.globalSliceStart(getClass().getName(),23439);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hg1pudi33();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1htthttlc8azu86.R.rethrow($CLV_t2$);}finally{__CLR4_4_1htthttlc8azu86.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Properties.testPropertyToIntervalYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23439,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hg1pudi33(){try{__CLR4_4_1htthttlc8azu86.R.inc(23439);
      __CLR4_4_1htthttlc8azu86.R.inc(23440);DateMidnight test = new DateMidnight(2004, 6, 9);
      __CLR4_4_1htthttlc8azu86.R.inc(23441);Interval testInterval = test.year().toInterval();
      __CLR4_4_1htthttlc8azu86.R.inc(23442);assertEquals(new DateMidnight(2004, 1, 1), testInterval.getStart());
      __CLR4_4_1htthttlc8azu86.R.inc(23443);assertEquals(new DateMidnight(2005, 1, 1), testInterval.getEnd());
    }finally{__CLR4_4_1htthttlc8azu86.R.flushNeeded();}}

    public void testPropertyToIntervalMonthOfYear() {__CLR4_4_1htthttlc8azu86.R.globalSliceStart(getClass().getName(),23444);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mybayci38();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1htthttlc8azu86.R.rethrow($CLV_t2$);}finally{__CLR4_4_1htthttlc8azu86.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Properties.testPropertyToIntervalMonthOfYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23444,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mybayci38(){try{__CLR4_4_1htthttlc8azu86.R.inc(23444);
      __CLR4_4_1htthttlc8azu86.R.inc(23445);DateMidnight test = new DateMidnight(2004, 6, 9);
      __CLR4_4_1htthttlc8azu86.R.inc(23446);Interval testInterval = test.monthOfYear().toInterval();
      __CLR4_4_1htthttlc8azu86.R.inc(23447);assertEquals(new DateMidnight(2004, 6, 1), testInterval.getStart());
      __CLR4_4_1htthttlc8azu86.R.inc(23448);assertEquals(new DateMidnight(2004, 7, 1), testInterval.getEnd());
    }finally{__CLR4_4_1htthttlc8azu86.R.flushNeeded();}}

    public void testPropertyToIntervalDayOfMonth() {__CLR4_4_1htthttlc8azu86.R.globalSliceStart(getClass().getName(),23449);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1r3xijfi3d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1htthttlc8azu86.R.rethrow($CLV_t2$);}finally{__CLR4_4_1htthttlc8azu86.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Properties.testPropertyToIntervalDayOfMonth",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23449,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1r3xijfi3d(){try{__CLR4_4_1htthttlc8azu86.R.inc(23449);
      __CLR4_4_1htthttlc8azu86.R.inc(23450);DateMidnight test = new DateMidnight(2004, 6, 9);
      __CLR4_4_1htthttlc8azu86.R.inc(23451);Interval testInterval = test.dayOfMonth().toInterval();
      __CLR4_4_1htthttlc8azu86.R.inc(23452);assertEquals(new DateMidnight(2004, 6, 9), testInterval.getStart());
      __CLR4_4_1htthttlc8azu86.R.inc(23453);assertEquals(new DateMidnight(2004, 6, 10), testInterval.getEnd());

      __CLR4_4_1htthttlc8azu86.R.inc(23454);DateMidnight febTest = new DateMidnight(2004, 2, 29);
      __CLR4_4_1htthttlc8azu86.R.inc(23455);Interval febTestInterval = febTest.dayOfMonth().toInterval();
      __CLR4_4_1htthttlc8azu86.R.inc(23456);assertEquals(new DateMidnight(2004, 2, 29), febTestInterval.getStart());
      __CLR4_4_1htthttlc8azu86.R.inc(23457);assertEquals(new DateMidnight(2004, 3, 1), febTestInterval.getEnd());
    }finally{__CLR4_4_1htthttlc8azu86.R.flushNeeded();}}

    public void testPropertyEqualsHashCodeLenient() {__CLR4_4_1htthttlc8azu86.R.globalSliceStart(getClass().getName(),23458);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xoanxfi3m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1htthttlc8azu86.R.rethrow($CLV_t2$);}finally{__CLR4_4_1htthttlc8azu86.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Properties.testPropertyEqualsHashCodeLenient",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23458,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xoanxfi3m(){try{__CLR4_4_1htthttlc8azu86.R.inc(23458);
        __CLR4_4_1htthttlc8azu86.R.inc(23459);DateMidnight test1 = new DateMidnight(1970, 6, 9, LenientChronology.getInstance(COPTIC_PARIS));
        __CLR4_4_1htthttlc8azu86.R.inc(23460);DateMidnight test2 = new DateMidnight(1970, 6, 9, LenientChronology.getInstance(COPTIC_PARIS));
        __CLR4_4_1htthttlc8azu86.R.inc(23461);assertEquals(true, test1.dayOfMonth().equals(test2.dayOfMonth()));
        __CLR4_4_1htthttlc8azu86.R.inc(23462);assertEquals(true, test2.dayOfMonth().equals(test1.dayOfMonth()));
        __CLR4_4_1htthttlc8azu86.R.inc(23463);assertEquals(true, test1.dayOfMonth().equals(test1.dayOfMonth()));
        __CLR4_4_1htthttlc8azu86.R.inc(23464);assertEquals(true, test2.dayOfMonth().equals(test2.dayOfMonth()));
        __CLR4_4_1htthttlc8azu86.R.inc(23465);assertEquals(true, test1.dayOfMonth().hashCode() == test2.dayOfMonth().hashCode());
        __CLR4_4_1htthttlc8azu86.R.inc(23466);assertEquals(true, test1.dayOfMonth().hashCode() == test1.dayOfMonth().hashCode());
        __CLR4_4_1htthttlc8azu86.R.inc(23467);assertEquals(true, test2.dayOfMonth().hashCode() == test2.dayOfMonth().hashCode());
    }finally{__CLR4_4_1htthttlc8azu86.R.flushNeeded();}}

    public void testPropertyEqualsHashCodeStrict() {__CLR4_4_1htthttlc8azu86.R.globalSliceStart(getClass().getName(),23468);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ev6icvi3w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1htthttlc8azu86.R.rethrow($CLV_t2$);}finally{__CLR4_4_1htthttlc8azu86.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Properties.testPropertyEqualsHashCodeStrict",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23468,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ev6icvi3w(){try{__CLR4_4_1htthttlc8azu86.R.inc(23468);
        __CLR4_4_1htthttlc8azu86.R.inc(23469);DateMidnight test1 = new DateMidnight(1970, 6, 9, StrictChronology.getInstance(COPTIC_PARIS));
        __CLR4_4_1htthttlc8azu86.R.inc(23470);DateMidnight test2 = new DateMidnight(1970, 6, 9, StrictChronology.getInstance(COPTIC_PARIS));
        __CLR4_4_1htthttlc8azu86.R.inc(23471);assertEquals(true, test1.dayOfMonth().equals(test2.dayOfMonth()));
        __CLR4_4_1htthttlc8azu86.R.inc(23472);assertEquals(true, test2.dayOfMonth().equals(test1.dayOfMonth()));
        __CLR4_4_1htthttlc8azu86.R.inc(23473);assertEquals(true, test1.dayOfMonth().equals(test1.dayOfMonth()));
        __CLR4_4_1htthttlc8azu86.R.inc(23474);assertEquals(true, test2.dayOfMonth().equals(test2.dayOfMonth()));
        __CLR4_4_1htthttlc8azu86.R.inc(23475);assertEquals(true, test1.dayOfMonth().hashCode() == test2.dayOfMonth().hashCode());
        __CLR4_4_1htthttlc8azu86.R.inc(23476);assertEquals(true, test1.dayOfMonth().hashCode() == test1.dayOfMonth().hashCode());
        __CLR4_4_1htthttlc8azu86.R.inc(23477);assertEquals(true, test2.dayOfMonth().hashCode() == test2.dayOfMonth().hashCode());
    }finally{__CLR4_4_1htthttlc8azu86.R.flushNeeded();}}

}
