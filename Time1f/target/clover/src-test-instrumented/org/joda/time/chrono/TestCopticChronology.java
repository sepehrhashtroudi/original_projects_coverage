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
package org.joda.time.chrono;

import java.util.Locale;
import java.util.TimeZone;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeConstants;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeUtils;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationField;
import org.joda.time.DurationFieldType;
import org.joda.time.DateTime.Property;

/**
 * This class is a Junit unit test for CopticChronology.
 *
 * @author Stephen Colebourne
 */
public class TestCopticChronology extends TestCase {static class __CLR4_4_112tt12ttlc8azwlj{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672271031490L,8589935092L,50751,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final int MILLIS_PER_DAY = DateTimeConstants.MILLIS_PER_DAY;

    private static long SKIP = 1 * MILLIS_PER_DAY;

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    private static final DateTimeZone TOKYO = DateTimeZone.forID("Asia/Tokyo");
    private static final Chronology COPTIC_UTC = CopticChronology.getInstanceUTC();
    private static final Chronology JULIAN_UTC = JulianChronology.getInstanceUTC();
    private static final Chronology ISO_UTC = ISOChronology.getInstanceUTC();

    long y2002days = 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 
                     366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 
                     365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 +
                     366 + 365;
    // 2002-06-09
    private long TEST_TIME_NOW =
            (y2002days + 31L + 28L + 31L + 30L + 31L + 9L -1L) * MILLIS_PER_DAY;

    private DateTimeZone originalDateTimeZone = null;
    private TimeZone originalTimeZone = null;
    private Locale originalLocale = null;

    public static void main(String[] args) {try{__CLR4_4_112tt12ttlc8azwlj.R.inc(50321);
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50322);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_112tt12ttlc8azwlj.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_112tt12ttlc8azwlj.R.inc(50323);
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50324);SKIP = 1 * MILLIS_PER_DAY;
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50325);return new TestSuite(TestCopticChronology.class);
    }finally{__CLR4_4_112tt12ttlc8azwlj.R.flushNeeded();}}

    public TestCopticChronology(String name) {
        super(name);__CLR4_4_112tt12ttlc8azwlj.R.inc(50327);try{__CLR4_4_112tt12ttlc8azwlj.R.inc(50326);
    }finally{__CLR4_4_112tt12ttlc8azwlj.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_112tt12ttlc8azwlj.R.inc(50328);
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50329);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50330);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50331);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50332);originalLocale = Locale.getDefault();
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50333);DateTimeZone.setDefault(LONDON);
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50334);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50335);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_112tt12ttlc8azwlj.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_112tt12ttlc8azwlj.R.inc(50336);
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50337);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50338);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50339);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50340);Locale.setDefault(originalLocale);
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50341);originalDateTimeZone = null;
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50342);originalTimeZone = null;
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50343);originalLocale = null;
    }finally{__CLR4_4_112tt12ttlc8azwlj.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testFactoryUTC() {__CLR4_4_112tt12ttlc8azwlj.R.globalSliceStart(getClass().getName(),50344);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19knvhv12ug();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_112tt12ttlc8azwlj.R.rethrow($CLV_t2$);}finally{__CLR4_4_112tt12ttlc8azwlj.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestCopticChronology.testFactoryUTC",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),50344,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19knvhv12ug(){try{__CLR4_4_112tt12ttlc8azwlj.R.inc(50344);
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50345);assertEquals(DateTimeZone.UTC, CopticChronology.getInstanceUTC().getZone());
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50346);assertSame(CopticChronology.class, CopticChronology.getInstanceUTC().getClass());
    }finally{__CLR4_4_112tt12ttlc8azwlj.R.flushNeeded();}}

    public void testFactory() {__CLR4_4_112tt12ttlc8azwlj.R.globalSliceStart(getClass().getName(),50347);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_116tztt12uj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_112tt12ttlc8azwlj.R.rethrow($CLV_t2$);}finally{__CLR4_4_112tt12ttlc8azwlj.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestCopticChronology.testFactory",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),50347,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_116tztt12uj(){try{__CLR4_4_112tt12ttlc8azwlj.R.inc(50347);
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50348);assertEquals(LONDON, CopticChronology.getInstance().getZone());
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50349);assertSame(CopticChronology.class, CopticChronology.getInstance().getClass());
    }finally{__CLR4_4_112tt12ttlc8azwlj.R.flushNeeded();}}

    public void testFactory_Zone() {__CLR4_4_112tt12ttlc8azwlj.R.globalSliceStart(getClass().getName(),50350);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yy5ime12um();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_112tt12ttlc8azwlj.R.rethrow($CLV_t2$);}finally{__CLR4_4_112tt12ttlc8azwlj.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestCopticChronology.testFactory_Zone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),50350,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yy5ime12um(){try{__CLR4_4_112tt12ttlc8azwlj.R.inc(50350);
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50351);assertEquals(TOKYO, CopticChronology.getInstance(TOKYO).getZone());
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50352);assertEquals(PARIS, CopticChronology.getInstance(PARIS).getZone());
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50353);assertEquals(LONDON, CopticChronology.getInstance(null).getZone());
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50354);assertSame(CopticChronology.class, CopticChronology.getInstance(TOKYO).getClass());
    }finally{__CLR4_4_112tt12ttlc8azwlj.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testEquality() {__CLR4_4_112tt12ttlc8azwlj.R.globalSliceStart(getClass().getName(),50355);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12agdql12ur();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_112tt12ttlc8azwlj.R.rethrow($CLV_t2$);}finally{__CLR4_4_112tt12ttlc8azwlj.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestCopticChronology.testEquality",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),50355,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12agdql12ur(){try{__CLR4_4_112tt12ttlc8azwlj.R.inc(50355);
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50356);assertSame(CopticChronology.getInstance(TOKYO), CopticChronology.getInstance(TOKYO));
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50357);assertSame(CopticChronology.getInstance(LONDON), CopticChronology.getInstance(LONDON));
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50358);assertSame(CopticChronology.getInstance(PARIS), CopticChronology.getInstance(PARIS));
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50359);assertSame(CopticChronology.getInstanceUTC(), CopticChronology.getInstanceUTC());
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50360);assertSame(CopticChronology.getInstance(), CopticChronology.getInstance(LONDON));
    }finally{__CLR4_4_112tt12ttlc8azwlj.R.flushNeeded();}}

    public void testWithUTC() {__CLR4_4_112tt12ttlc8azwlj.R.globalSliceStart(getClass().getName(),50361);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19orv8312ux();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_112tt12ttlc8azwlj.R.rethrow($CLV_t2$);}finally{__CLR4_4_112tt12ttlc8azwlj.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestCopticChronology.testWithUTC",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),50361,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19orv8312ux(){try{__CLR4_4_112tt12ttlc8azwlj.R.inc(50361);
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50362);assertSame(CopticChronology.getInstanceUTC(), CopticChronology.getInstance(LONDON).withUTC());
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50363);assertSame(CopticChronology.getInstanceUTC(), CopticChronology.getInstance(TOKYO).withUTC());
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50364);assertSame(CopticChronology.getInstanceUTC(), CopticChronology.getInstanceUTC().withUTC());
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50365);assertSame(CopticChronology.getInstanceUTC(), CopticChronology.getInstance().withUTC());
    }finally{__CLR4_4_112tt12ttlc8azwlj.R.flushNeeded();}}

    public void testWithZone() {__CLR4_4_112tt12ttlc8azwlj.R.globalSliceStart(getClass().getName(),50366);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1me3iet12v2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_112tt12ttlc8azwlj.R.rethrow($CLV_t2$);}finally{__CLR4_4_112tt12ttlc8azwlj.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestCopticChronology.testWithZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),50366,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1me3iet12v2(){try{__CLR4_4_112tt12ttlc8azwlj.R.inc(50366);
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50367);assertSame(CopticChronology.getInstance(TOKYO), CopticChronology.getInstance(TOKYO).withZone(TOKYO));
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50368);assertSame(CopticChronology.getInstance(LONDON), CopticChronology.getInstance(TOKYO).withZone(LONDON));
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50369);assertSame(CopticChronology.getInstance(PARIS), CopticChronology.getInstance(TOKYO).withZone(PARIS));
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50370);assertSame(CopticChronology.getInstance(LONDON), CopticChronology.getInstance(TOKYO).withZone(null));
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50371);assertSame(CopticChronology.getInstance(PARIS), CopticChronology.getInstance().withZone(PARIS));
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50372);assertSame(CopticChronology.getInstance(PARIS), CopticChronology.getInstanceUTC().withZone(PARIS));
    }finally{__CLR4_4_112tt12ttlc8azwlj.R.flushNeeded();}}

    public void testToString() {__CLR4_4_112tt12ttlc8azwlj.R.globalSliceStart(getClass().getName(),50373);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hrxdid12v9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_112tt12ttlc8azwlj.R.rethrow($CLV_t2$);}finally{__CLR4_4_112tt12ttlc8azwlj.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestCopticChronology.testToString",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),50373,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hrxdid12v9(){try{__CLR4_4_112tt12ttlc8azwlj.R.inc(50373);
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50374);assertEquals("CopticChronology[Europe/London]", CopticChronology.getInstance(LONDON).toString());
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50375);assertEquals("CopticChronology[Asia/Tokyo]", CopticChronology.getInstance(TOKYO).toString());
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50376);assertEquals("CopticChronology[Europe/London]", CopticChronology.getInstance().toString());
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50377);assertEquals("CopticChronology[UTC]", CopticChronology.getInstanceUTC().toString());
    }finally{__CLR4_4_112tt12ttlc8azwlj.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testDurationFields() {__CLR4_4_112tt12ttlc8azwlj.R.globalSliceStart(getClass().getName(),50378);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cnkzye12ve();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_112tt12ttlc8azwlj.R.rethrow($CLV_t2$);}finally{__CLR4_4_112tt12ttlc8azwlj.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestCopticChronology.testDurationFields",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),50378,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cnkzye12ve(){try{__CLR4_4_112tt12ttlc8azwlj.R.inc(50378);
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50379);final CopticChronology coptic = CopticChronology.getInstance();
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50380);assertEquals("eras", coptic.eras().getName());
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50381);assertEquals("centuries", coptic.centuries().getName());
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50382);assertEquals("years", coptic.years().getName());
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50383);assertEquals("weekyears", coptic.weekyears().getName());
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50384);assertEquals("months", coptic.months().getName());
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50385);assertEquals("weeks", coptic.weeks().getName());
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50386);assertEquals("days", coptic.days().getName());
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50387);assertEquals("halfdays", coptic.halfdays().getName());
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50388);assertEquals("hours", coptic.hours().getName());
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50389);assertEquals("minutes", coptic.minutes().getName());
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50390);assertEquals("seconds", coptic.seconds().getName());
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50391);assertEquals("millis", coptic.millis().getName());
        
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50392);assertEquals(false, coptic.eras().isSupported());
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50393);assertEquals(true, coptic.centuries().isSupported());
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50394);assertEquals(true, coptic.years().isSupported());
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50395);assertEquals(true, coptic.weekyears().isSupported());
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50396);assertEquals(true, coptic.months().isSupported());
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50397);assertEquals(true, coptic.weeks().isSupported());
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50398);assertEquals(true, coptic.days().isSupported());
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50399);assertEquals(true, coptic.halfdays().isSupported());
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50400);assertEquals(true, coptic.hours().isSupported());
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50401);assertEquals(true, coptic.minutes().isSupported());
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50402);assertEquals(true, coptic.seconds().isSupported());
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50403);assertEquals(true, coptic.millis().isSupported());
        
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50404);assertEquals(false, coptic.centuries().isPrecise());
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50405);assertEquals(false, coptic.years().isPrecise());
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50406);assertEquals(false, coptic.weekyears().isPrecise());
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50407);assertEquals(false, coptic.months().isPrecise());
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50408);assertEquals(false, coptic.weeks().isPrecise());
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50409);assertEquals(false, coptic.days().isPrecise());
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50410);assertEquals(false, coptic.halfdays().isPrecise());
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50411);assertEquals(true, coptic.hours().isPrecise());
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50412);assertEquals(true, coptic.minutes().isPrecise());
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50413);assertEquals(true, coptic.seconds().isPrecise());
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50414);assertEquals(true, coptic.millis().isPrecise());
        
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50415);final CopticChronology copticUTC = CopticChronology.getInstanceUTC();
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50416);assertEquals(false, copticUTC.centuries().isPrecise());
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50417);assertEquals(false, copticUTC.years().isPrecise());
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50418);assertEquals(false, copticUTC.weekyears().isPrecise());
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50419);assertEquals(false, copticUTC.months().isPrecise());
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50420);assertEquals(true, copticUTC.weeks().isPrecise());
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50421);assertEquals(true, copticUTC.days().isPrecise());
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50422);assertEquals(true, copticUTC.halfdays().isPrecise());
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50423);assertEquals(true, copticUTC.hours().isPrecise());
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50424);assertEquals(true, copticUTC.minutes().isPrecise());
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50425);assertEquals(true, copticUTC.seconds().isPrecise());
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50426);assertEquals(true, copticUTC.millis().isPrecise());
        
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50427);final DateTimeZone gmt = DateTimeZone.forID("Etc/GMT");
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50428);final CopticChronology copticGMT = CopticChronology.getInstance(gmt);
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50429);assertEquals(false, copticGMT.centuries().isPrecise());
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50430);assertEquals(false, copticGMT.years().isPrecise());
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50431);assertEquals(false, copticGMT.weekyears().isPrecise());
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50432);assertEquals(false, copticGMT.months().isPrecise());
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50433);assertEquals(true, copticGMT.weeks().isPrecise());
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50434);assertEquals(true, copticGMT.days().isPrecise());
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50435);assertEquals(true, copticGMT.halfdays().isPrecise());
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50436);assertEquals(true, copticGMT.hours().isPrecise());
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50437);assertEquals(true, copticGMT.minutes().isPrecise());
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50438);assertEquals(true, copticGMT.seconds().isPrecise());
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50439);assertEquals(true, copticGMT.millis().isPrecise());
    }finally{__CLR4_4_112tt12ttlc8azwlj.R.flushNeeded();}}

    public void testDateFields() {__CLR4_4_112tt12ttlc8azwlj.R.globalSliceStart(getClass().getName(),50440);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gkspeo12x4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_112tt12ttlc8azwlj.R.rethrow($CLV_t2$);}finally{__CLR4_4_112tt12ttlc8azwlj.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestCopticChronology.testDateFields",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),50440,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gkspeo12x4(){try{__CLR4_4_112tt12ttlc8azwlj.R.inc(50440);
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50441);final CopticChronology coptic = CopticChronology.getInstance();
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50442);assertEquals("era", coptic.era().getName());
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50443);assertEquals("centuryOfEra", coptic.centuryOfEra().getName());
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50444);assertEquals("yearOfCentury", coptic.yearOfCentury().getName());
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50445);assertEquals("yearOfEra", coptic.yearOfEra().getName());
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50446);assertEquals("year", coptic.year().getName());
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50447);assertEquals("monthOfYear", coptic.monthOfYear().getName());
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50448);assertEquals("weekyearOfCentury", coptic.weekyearOfCentury().getName());
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50449);assertEquals("weekyear", coptic.weekyear().getName());
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50450);assertEquals("weekOfWeekyear", coptic.weekOfWeekyear().getName());
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50451);assertEquals("dayOfYear", coptic.dayOfYear().getName());
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50452);assertEquals("dayOfMonth", coptic.dayOfMonth().getName());
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50453);assertEquals("dayOfWeek", coptic.dayOfWeek().getName());
        
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50454);assertEquals(true, coptic.era().isSupported());
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50455);assertEquals(true, coptic.centuryOfEra().isSupported());
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50456);assertEquals(true, coptic.yearOfCentury().isSupported());
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50457);assertEquals(true, coptic.yearOfEra().isSupported());
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50458);assertEquals(true, coptic.year().isSupported());
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50459);assertEquals(true, coptic.monthOfYear().isSupported());
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50460);assertEquals(true, coptic.weekyearOfCentury().isSupported());
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50461);assertEquals(true, coptic.weekyear().isSupported());
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50462);assertEquals(true, coptic.weekOfWeekyear().isSupported());
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50463);assertEquals(true, coptic.dayOfYear().isSupported());
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50464);assertEquals(true, coptic.dayOfMonth().isSupported());
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50465);assertEquals(true, coptic.dayOfWeek().isSupported());
        
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50466);assertEquals(coptic.eras(), coptic.era().getDurationField());
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50467);assertEquals(coptic.centuries(), coptic.centuryOfEra().getDurationField());
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50468);assertEquals(coptic.years(), coptic.yearOfCentury().getDurationField());
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50469);assertEquals(coptic.years(), coptic.yearOfEra().getDurationField());
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50470);assertEquals(coptic.years(), coptic.year().getDurationField());
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50471);assertEquals(coptic.months(), coptic.monthOfYear().getDurationField());
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50472);assertEquals(coptic.weekyears(), coptic.weekyearOfCentury().getDurationField());
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50473);assertEquals(coptic.weekyears(), coptic.weekyear().getDurationField());
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50474);assertEquals(coptic.weeks(), coptic.weekOfWeekyear().getDurationField());
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50475);assertEquals(coptic.days(), coptic.dayOfYear().getDurationField());
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50476);assertEquals(coptic.days(), coptic.dayOfMonth().getDurationField());
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50477);assertEquals(coptic.days(), coptic.dayOfWeek().getDurationField());
        
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50478);assertEquals(null, coptic.era().getRangeDurationField());
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50479);assertEquals(coptic.eras(), coptic.centuryOfEra().getRangeDurationField());
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50480);assertEquals(coptic.centuries(), coptic.yearOfCentury().getRangeDurationField());
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50481);assertEquals(coptic.eras(), coptic.yearOfEra().getRangeDurationField());
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50482);assertEquals(null, coptic.year().getRangeDurationField());
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50483);assertEquals(coptic.years(), coptic.monthOfYear().getRangeDurationField());
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50484);assertEquals(coptic.centuries(), coptic.weekyearOfCentury().getRangeDurationField());
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50485);assertEquals(null, coptic.weekyear().getRangeDurationField());
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50486);assertEquals(coptic.weekyears(), coptic.weekOfWeekyear().getRangeDurationField());
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50487);assertEquals(coptic.years(), coptic.dayOfYear().getRangeDurationField());
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50488);assertEquals(coptic.months(), coptic.dayOfMonth().getRangeDurationField());
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50489);assertEquals(coptic.weeks(), coptic.dayOfWeek().getRangeDurationField());
    }finally{__CLR4_4_112tt12ttlc8azwlj.R.flushNeeded();}}

    public void testTimeFields() {__CLR4_4_112tt12ttlc8azwlj.R.globalSliceStart(getClass().getName(),50490);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11r11up12yi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_112tt12ttlc8azwlj.R.rethrow($CLV_t2$);}finally{__CLR4_4_112tt12ttlc8azwlj.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestCopticChronology.testTimeFields",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),50490,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11r11up12yi(){try{__CLR4_4_112tt12ttlc8azwlj.R.inc(50490);
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50491);final CopticChronology coptic = CopticChronology.getInstance();
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50492);assertEquals("halfdayOfDay", coptic.halfdayOfDay().getName());
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50493);assertEquals("clockhourOfHalfday", coptic.clockhourOfHalfday().getName());
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50494);assertEquals("hourOfHalfday", coptic.hourOfHalfday().getName());
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50495);assertEquals("clockhourOfDay", coptic.clockhourOfDay().getName());
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50496);assertEquals("hourOfDay", coptic.hourOfDay().getName());
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50497);assertEquals("minuteOfDay", coptic.minuteOfDay().getName());
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50498);assertEquals("minuteOfHour", coptic.minuteOfHour().getName());
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50499);assertEquals("secondOfDay", coptic.secondOfDay().getName());
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50500);assertEquals("secondOfMinute", coptic.secondOfMinute().getName());
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50501);assertEquals("millisOfDay", coptic.millisOfDay().getName());
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50502);assertEquals("millisOfSecond", coptic.millisOfSecond().getName());
        
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50503);assertEquals(true, coptic.halfdayOfDay().isSupported());
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50504);assertEquals(true, coptic.clockhourOfHalfday().isSupported());
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50505);assertEquals(true, coptic.hourOfHalfday().isSupported());
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50506);assertEquals(true, coptic.clockhourOfDay().isSupported());
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50507);assertEquals(true, coptic.hourOfDay().isSupported());
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50508);assertEquals(true, coptic.minuteOfDay().isSupported());
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50509);assertEquals(true, coptic.minuteOfHour().isSupported());
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50510);assertEquals(true, coptic.secondOfDay().isSupported());
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50511);assertEquals(true, coptic.secondOfMinute().isSupported());
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50512);assertEquals(true, coptic.millisOfDay().isSupported());
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50513);assertEquals(true, coptic.millisOfSecond().isSupported());
    }finally{__CLR4_4_112tt12ttlc8azwlj.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testEpoch() {__CLR4_4_112tt12ttlc8azwlj.R.globalSliceStart(getClass().getName(),50514);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19p7wci12z6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_112tt12ttlc8azwlj.R.rethrow($CLV_t2$);}finally{__CLR4_4_112tt12ttlc8azwlj.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestCopticChronology.testEpoch",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),50514,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19p7wci12z6(){try{__CLR4_4_112tt12ttlc8azwlj.R.inc(50514);
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50515);DateTime epoch = new DateTime(1, 1, 1, 0, 0, 0, 0, COPTIC_UTC);
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50516);assertEquals(new DateTime(284, 8, 29, 0, 0, 0, 0, JULIAN_UTC), epoch.withChronology(JULIAN_UTC));
    }finally{__CLR4_4_112tt12ttlc8azwlj.R.flushNeeded();}}

    public void testEra() {__CLR4_4_112tt12ttlc8azwlj.R.globalSliceStart(getClass().getName(),50517);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13euvzd12z9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_112tt12ttlc8azwlj.R.rethrow($CLV_t2$);}finally{__CLR4_4_112tt12ttlc8azwlj.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestCopticChronology.testEra",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),50517,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13euvzd12z9(){try{__CLR4_4_112tt12ttlc8azwlj.R.inc(50517);
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50518);assertEquals(1, CopticChronology.AM);
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50519);try {
            __CLR4_4_112tt12ttlc8azwlj.R.inc(50520);new DateTime(-1, 13, 5, 0, 0, 0, 0, COPTIC_UTC);
            __CLR4_4_112tt12ttlc8azwlj.R.inc(50521);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_112tt12ttlc8azwlj.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Tests era, year, monthOfYear, dayOfMonth and dayOfWeek.
     */
    public void testCalendar() {__CLR4_4_112tt12ttlc8azwlj.R.globalSliceStart(getClass().getName(),50522);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1odnsqf12ze();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_112tt12ttlc8azwlj.R.rethrow($CLV_t2$);}finally{__CLR4_4_112tt12ttlc8azwlj.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestCopticChronology.testCalendar",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),50522,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1odnsqf12ze(){try{__CLR4_4_112tt12ttlc8azwlj.R.inc(50522);
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50523);if ((((TestAll.FAST)&&(__CLR4_4_112tt12ttlc8azwlj.R.iget(50524)!=0|true))||(__CLR4_4_112tt12ttlc8azwlj.R.iget(50525)==0&false))) {{
            __CLR4_4_112tt12ttlc8azwlj.R.inc(50526);return;
        }
        }__CLR4_4_112tt12ttlc8azwlj.R.inc(50527);System.out.println("\nTestCopticChronology.testCalendar");
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50528);DateTime epoch = new DateTime(1, 1, 1, 0, 0, 0, 0, COPTIC_UTC);
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50529);long millis = epoch.getMillis();
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50530);long end = new DateTime(3000, 1, 1, 0, 0, 0, 0, ISO_UTC).getMillis();
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50531);DateTimeField dayOfWeek = COPTIC_UTC.dayOfWeek();
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50532);DateTimeField dayOfYear = COPTIC_UTC.dayOfYear();
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50533);DateTimeField dayOfMonth = COPTIC_UTC.dayOfMonth();
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50534);DateTimeField monthOfYear = COPTIC_UTC.monthOfYear();
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50535);DateTimeField year = COPTIC_UTC.year();
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50536);DateTimeField yearOfEra = COPTIC_UTC.yearOfEra();
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50537);DateTimeField era = COPTIC_UTC.era();
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50538);int expectedDOW = new DateTime(284, 8, 29, 0, 0, 0, 0, JULIAN_UTC).getDayOfWeek();
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50539);int expectedDOY = 1;
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50540);int expectedDay = 1;
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50541);int expectedMonth = 1;
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50542);int expectedYear = 1;
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50543);while ((((millis < end)&&(__CLR4_4_112tt12ttlc8azwlj.R.iget(50544)!=0|true))||(__CLR4_4_112tt12ttlc8azwlj.R.iget(50545)==0&false))) {{
            __CLR4_4_112tt12ttlc8azwlj.R.inc(50546);int dowValue = dayOfWeek.get(millis);
            __CLR4_4_112tt12ttlc8azwlj.R.inc(50547);int doyValue = dayOfYear.get(millis);
            __CLR4_4_112tt12ttlc8azwlj.R.inc(50548);int dayValue = dayOfMonth.get(millis);
            __CLR4_4_112tt12ttlc8azwlj.R.inc(50549);int monthValue = monthOfYear.get(millis);
            __CLR4_4_112tt12ttlc8azwlj.R.inc(50550);int yearValue = year.get(millis);
            __CLR4_4_112tt12ttlc8azwlj.R.inc(50551);int yearOfEraValue = yearOfEra.get(millis);
            __CLR4_4_112tt12ttlc8azwlj.R.inc(50552);int monthLen = dayOfMonth.getMaximumValue(millis);
            __CLR4_4_112tt12ttlc8azwlj.R.inc(50553);if ((((monthValue < 1 || monthValue > 13)&&(__CLR4_4_112tt12ttlc8azwlj.R.iget(50554)!=0|true))||(__CLR4_4_112tt12ttlc8azwlj.R.iget(50555)==0&false))) {{
                __CLR4_4_112tt12ttlc8azwlj.R.inc(50556);fail("Bad month: " + millis);
            }
            
            // test era
            }__CLR4_4_112tt12ttlc8azwlj.R.inc(50557);assertEquals(1, era.get(millis));
            __CLR4_4_112tt12ttlc8azwlj.R.inc(50558);assertEquals("AM", era.getAsText(millis));
            __CLR4_4_112tt12ttlc8azwlj.R.inc(50559);assertEquals("AM", era.getAsShortText(millis));
            
            // test date
            __CLR4_4_112tt12ttlc8azwlj.R.inc(50560);assertEquals(expectedYear, yearValue);
            __CLR4_4_112tt12ttlc8azwlj.R.inc(50561);assertEquals(expectedYear, yearOfEraValue);
            __CLR4_4_112tt12ttlc8azwlj.R.inc(50562);assertEquals(expectedMonth, monthValue);
            __CLR4_4_112tt12ttlc8azwlj.R.inc(50563);assertEquals(expectedDay, dayValue);
            __CLR4_4_112tt12ttlc8azwlj.R.inc(50564);assertEquals(expectedDOW, dowValue);
            __CLR4_4_112tt12ttlc8azwlj.R.inc(50565);assertEquals(expectedDOY, doyValue);
            
            // test leap year
            __CLR4_4_112tt12ttlc8azwlj.R.inc(50566);assertEquals(yearValue % 4 == 3, year.isLeap(millis));
            
            // test month length
            __CLR4_4_112tt12ttlc8azwlj.R.inc(50567);if ((((monthValue == 13)&&(__CLR4_4_112tt12ttlc8azwlj.R.iget(50568)!=0|true))||(__CLR4_4_112tt12ttlc8azwlj.R.iget(50569)==0&false))) {{
                __CLR4_4_112tt12ttlc8azwlj.R.inc(50570);assertEquals(yearValue % 4 == 3, monthOfYear.isLeap(millis));
                __CLR4_4_112tt12ttlc8azwlj.R.inc(50571);if ((((yearValue % 4 == 3)&&(__CLR4_4_112tt12ttlc8azwlj.R.iget(50572)!=0|true))||(__CLR4_4_112tt12ttlc8azwlj.R.iget(50573)==0&false))) {{
                    __CLR4_4_112tt12ttlc8azwlj.R.inc(50574);assertEquals(6, monthLen);
                } }else {{
                    __CLR4_4_112tt12ttlc8azwlj.R.inc(50575);assertEquals(5, monthLen);
                }
            }} }else {{
                __CLR4_4_112tt12ttlc8azwlj.R.inc(50576);assertEquals(30, monthLen);
            }
            
            // recalculate date
            }__CLR4_4_112tt12ttlc8azwlj.R.inc(50577);expectedDOW = (((expectedDOW + 1) - 1) % 7) + 1;
            __CLR4_4_112tt12ttlc8azwlj.R.inc(50578);expectedDay++;
            __CLR4_4_112tt12ttlc8azwlj.R.inc(50579);expectedDOY++;
            __CLR4_4_112tt12ttlc8azwlj.R.inc(50580);if ((((expectedDay == 31 && expectedMonth < 13)&&(__CLR4_4_112tt12ttlc8azwlj.R.iget(50581)!=0|true))||(__CLR4_4_112tt12ttlc8azwlj.R.iget(50582)==0&false))) {{
                __CLR4_4_112tt12ttlc8azwlj.R.inc(50583);expectedDay = 1;
                __CLR4_4_112tt12ttlc8azwlj.R.inc(50584);expectedMonth++;
            } }else {__CLR4_4_112tt12ttlc8azwlj.R.inc(50585);if ((((expectedMonth == 13)&&(__CLR4_4_112tt12ttlc8azwlj.R.iget(50586)!=0|true))||(__CLR4_4_112tt12ttlc8azwlj.R.iget(50587)==0&false))) {{
                __CLR4_4_112tt12ttlc8azwlj.R.inc(50588);if ((((expectedYear % 4 == 3 && expectedDay == 7)&&(__CLR4_4_112tt12ttlc8azwlj.R.iget(50589)!=0|true))||(__CLR4_4_112tt12ttlc8azwlj.R.iget(50590)==0&false))) {{
                    __CLR4_4_112tt12ttlc8azwlj.R.inc(50591);expectedDay = 1;
                    __CLR4_4_112tt12ttlc8azwlj.R.inc(50592);expectedMonth = 1;
                    __CLR4_4_112tt12ttlc8azwlj.R.inc(50593);expectedYear++;
                    __CLR4_4_112tt12ttlc8azwlj.R.inc(50594);expectedDOY = 1;
                } }else {__CLR4_4_112tt12ttlc8azwlj.R.inc(50595);if ((((expectedYear % 4 != 3 && expectedDay == 6)&&(__CLR4_4_112tt12ttlc8azwlj.R.iget(50596)!=0|true))||(__CLR4_4_112tt12ttlc8azwlj.R.iget(50597)==0&false))) {{
                    __CLR4_4_112tt12ttlc8azwlj.R.inc(50598);expectedDay = 1;
                    __CLR4_4_112tt12ttlc8azwlj.R.inc(50599);expectedMonth = 1;
                    __CLR4_4_112tt12ttlc8azwlj.R.inc(50600);expectedYear++;
                    __CLR4_4_112tt12ttlc8azwlj.R.inc(50601);expectedDOY = 1;
                }
            }}}
            }}__CLR4_4_112tt12ttlc8azwlj.R.inc(50602);millis += SKIP;
        }
    }}finally{__CLR4_4_112tt12ttlc8azwlj.R.flushNeeded();}}

    public void testSampleDate() {__CLR4_4_112tt12ttlc8azwlj.R.globalSliceStart(getClass().getName(),50603);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vytbnz131n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_112tt12ttlc8azwlj.R.rethrow($CLV_t2$);}finally{__CLR4_4_112tt12ttlc8azwlj.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestCopticChronology.testSampleDate",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),50603,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vytbnz131n(){try{__CLR4_4_112tt12ttlc8azwlj.R.inc(50603);
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50604);DateTime dt = new DateTime(2004, 6, 9, 0, 0, 0, 0, ISO_UTC).withChronology(COPTIC_UTC);
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50605);assertEquals(CopticChronology.AM, dt.getEra());
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50606);assertEquals(18, dt.getCenturyOfEra());  // TODO confirm
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50607);assertEquals(20, dt.getYearOfCentury());
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50608);assertEquals(1720, dt.getYearOfEra());
        
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50609);assertEquals(1720, dt.getYear());
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50610);Property fld = dt.year();
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50611);assertEquals(false, fld.isLeap());
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50612);assertEquals(0, fld.getLeapAmount());
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50613);assertEquals(DurationFieldType.days(), fld.getLeapDurationField().getType());
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50614);assertEquals(new DateTime(1721, 10, 2, 0, 0, 0, 0, COPTIC_UTC), fld.addToCopy(1));
        
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50615);assertEquals(10, dt.getMonthOfYear());
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50616);fld = dt.monthOfYear();
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50617);assertEquals(false, fld.isLeap());
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50618);assertEquals(0, fld.getLeapAmount());
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50619);assertEquals(DurationFieldType.days(), fld.getLeapDurationField().getType());
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50620);assertEquals(1, fld.getMinimumValue());
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50621);assertEquals(1, fld.getMinimumValueOverall());
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50622);assertEquals(13, fld.getMaximumValue());
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50623);assertEquals(13, fld.getMaximumValueOverall());
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50624);assertEquals(new DateTime(1721, 1, 2, 0, 0, 0, 0, COPTIC_UTC), fld.addToCopy(4));
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50625);assertEquals(new DateTime(1720, 1, 2, 0, 0, 0, 0, COPTIC_UTC), fld.addWrapFieldToCopy(4));
        
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50626);assertEquals(2, dt.getDayOfMonth());
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50627);fld = dt.dayOfMonth();
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50628);assertEquals(false, fld.isLeap());
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50629);assertEquals(0, fld.getLeapAmount());
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50630);assertEquals(null, fld.getLeapDurationField());
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50631);assertEquals(1, fld.getMinimumValue());
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50632);assertEquals(1, fld.getMinimumValueOverall());
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50633);assertEquals(30, fld.getMaximumValue());
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50634);assertEquals(30, fld.getMaximumValueOverall());
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50635);assertEquals(new DateTime(1720, 10, 3, 0, 0, 0, 0, COPTIC_UTC), fld.addToCopy(1));
        
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50636);assertEquals(DateTimeConstants.WEDNESDAY, dt.getDayOfWeek());
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50637);fld = dt.dayOfWeek();
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50638);assertEquals(false, fld.isLeap());
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50639);assertEquals(0, fld.getLeapAmount());
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50640);assertEquals(null, fld.getLeapDurationField());
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50641);assertEquals(1, fld.getMinimumValue());
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50642);assertEquals(1, fld.getMinimumValueOverall());
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50643);assertEquals(7, fld.getMaximumValue());
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50644);assertEquals(7, fld.getMaximumValueOverall());
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50645);assertEquals(new DateTime(1720, 10, 3, 0, 0, 0, 0, COPTIC_UTC), fld.addToCopy(1));
        
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50646);assertEquals(9 * 30 + 2, dt.getDayOfYear());
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50647);fld = dt.dayOfYear();
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50648);assertEquals(false, fld.isLeap());
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50649);assertEquals(0, fld.getLeapAmount());
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50650);assertEquals(null, fld.getLeapDurationField());
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50651);assertEquals(1, fld.getMinimumValue());
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50652);assertEquals(1, fld.getMinimumValueOverall());
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50653);assertEquals(365, fld.getMaximumValue());
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50654);assertEquals(366, fld.getMaximumValueOverall());
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50655);assertEquals(new DateTime(1720, 10, 3, 0, 0, 0, 0, COPTIC_UTC), fld.addToCopy(1));
        
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50656);assertEquals(0, dt.getHourOfDay());
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50657);assertEquals(0, dt.getMinuteOfHour());
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50658);assertEquals(0, dt.getSecondOfMinute());
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50659);assertEquals(0, dt.getMillisOfSecond());
    }finally{__CLR4_4_112tt12ttlc8azwlj.R.flushNeeded();}}

    public void testSampleDateWithZone() {__CLR4_4_112tt12ttlc8azwlj.R.globalSliceStart(getClass().getName(),50660);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gh4f6l1338();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_112tt12ttlc8azwlj.R.rethrow($CLV_t2$);}finally{__CLR4_4_112tt12ttlc8azwlj.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestCopticChronology.testSampleDateWithZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),50660,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gh4f6l1338(){try{__CLR4_4_112tt12ttlc8azwlj.R.inc(50660);
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50661);DateTime dt = new DateTime(2004, 6, 9, 12, 0, 0, 0, PARIS).withChronology(COPTIC_UTC);
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50662);assertEquals(CopticChronology.AM, dt.getEra());
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50663);assertEquals(1720, dt.getYear());
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50664);assertEquals(1720, dt.getYearOfEra());
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50665);assertEquals(10, dt.getMonthOfYear());
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50666);assertEquals(2, dt.getDayOfMonth());
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50667);assertEquals(10, dt.getHourOfDay());  // PARIS is UTC+2 in summer (12-2=10)
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50668);assertEquals(0, dt.getMinuteOfHour());
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50669);assertEquals(0, dt.getSecondOfMinute());
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50670);assertEquals(0, dt.getMillisOfSecond());
    }finally{__CLR4_4_112tt12ttlc8azwlj.R.flushNeeded();}}

    public void testDurationYear() {__CLR4_4_112tt12ttlc8azwlj.R.globalSliceStart(getClass().getName(),50671);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14rec96133j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_112tt12ttlc8azwlj.R.rethrow($CLV_t2$);}finally{__CLR4_4_112tt12ttlc8azwlj.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestCopticChronology.testDurationYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),50671,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14rec96133j(){try{__CLR4_4_112tt12ttlc8azwlj.R.inc(50671);
        // Leap 1723
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50672);DateTime dt20 = new DateTime(1720, 10, 2, 0, 0, 0, 0, COPTIC_UTC);
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50673);DateTime dt21 = new DateTime(1721, 10, 2, 0, 0, 0, 0, COPTIC_UTC);
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50674);DateTime dt22 = new DateTime(1722, 10, 2, 0, 0, 0, 0, COPTIC_UTC);
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50675);DateTime dt23 = new DateTime(1723, 10, 2, 0, 0, 0, 0, COPTIC_UTC);
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50676);DateTime dt24 = new DateTime(1724, 10, 2, 0, 0, 0, 0, COPTIC_UTC);
        
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50677);DurationField fld = dt20.year().getDurationField();
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50678);assertEquals(COPTIC_UTC.years(), fld);
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50679);assertEquals(1L * 365L * MILLIS_PER_DAY, fld.getMillis(1, dt20.getMillis()));
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50680);assertEquals(2L * 365L * MILLIS_PER_DAY, fld.getMillis(2, dt20.getMillis()));
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50681);assertEquals(3L * 365L * MILLIS_PER_DAY, fld.getMillis(3, dt20.getMillis()));
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50682);assertEquals((4L * 365L + 1L) * MILLIS_PER_DAY, fld.getMillis(4, dt20.getMillis()));
        
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50683);assertEquals(((4L * 365L + 1L) * MILLIS_PER_DAY) / 4, fld.getMillis(1));
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50684);assertEquals(((4L * 365L + 1L) * MILLIS_PER_DAY) / 2, fld.getMillis(2));
        
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50685);assertEquals(1L * 365L * MILLIS_PER_DAY, fld.getMillis(1L, dt20.getMillis()));
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50686);assertEquals(2L * 365L * MILLIS_PER_DAY, fld.getMillis(2L, dt20.getMillis()));
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50687);assertEquals(3L * 365L * MILLIS_PER_DAY, fld.getMillis(3L, dt20.getMillis()));
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50688);assertEquals((4L * 365L + 1L) * MILLIS_PER_DAY, fld.getMillis(4L, dt20.getMillis()));
        
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50689);assertEquals(((4L * 365L + 1L) * MILLIS_PER_DAY) / 4, fld.getMillis(1L));
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50690);assertEquals(((4L * 365L + 1L) * MILLIS_PER_DAY) / 2, fld.getMillis(2L));
        
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50691);assertEquals(((4L * 365L + 1L) * MILLIS_PER_DAY) / 4, fld.getUnitMillis());
        
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50692);assertEquals(0, fld.getValue(1L * 365L * MILLIS_PER_DAY - 1L, dt20.getMillis()));
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50693);assertEquals(1, fld.getValue(1L * 365L * MILLIS_PER_DAY, dt20.getMillis()));
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50694);assertEquals(1, fld.getValue(1L * 365L * MILLIS_PER_DAY + 1L, dt20.getMillis()));
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50695);assertEquals(1, fld.getValue(2L * 365L * MILLIS_PER_DAY - 1L, dt20.getMillis()));
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50696);assertEquals(2, fld.getValue(2L * 365L * MILLIS_PER_DAY, dt20.getMillis()));
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50697);assertEquals(2, fld.getValue(2L * 365L * MILLIS_PER_DAY + 1L, dt20.getMillis()));
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50698);assertEquals(2, fld.getValue(3L * 365L * MILLIS_PER_DAY - 1L, dt20.getMillis()));
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50699);assertEquals(3, fld.getValue(3L * 365L * MILLIS_PER_DAY, dt20.getMillis()));
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50700);assertEquals(3, fld.getValue(3L * 365L * MILLIS_PER_DAY + 1L, dt20.getMillis()));
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50701);assertEquals(3, fld.getValue((4L * 365L + 1L) * MILLIS_PER_DAY - 1L, dt20.getMillis()));
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50702);assertEquals(4, fld.getValue((4L * 365L + 1L) * MILLIS_PER_DAY, dt20.getMillis()));
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50703);assertEquals(4, fld.getValue((4L * 365L + 1L) * MILLIS_PER_DAY + 1L, dt20.getMillis()));
        
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50704);assertEquals(dt21.getMillis(), fld.add(dt20.getMillis(), 1));
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50705);assertEquals(dt22.getMillis(), fld.add(dt20.getMillis(), 2));
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50706);assertEquals(dt23.getMillis(), fld.add(dt20.getMillis(), 3));
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50707);assertEquals(dt24.getMillis(), fld.add(dt20.getMillis(), 4));
        
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50708);assertEquals(dt21.getMillis(), fld.add(dt20.getMillis(), 1L));
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50709);assertEquals(dt22.getMillis(), fld.add(dt20.getMillis(), 2L));
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50710);assertEquals(dt23.getMillis(), fld.add(dt20.getMillis(), 3L));
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50711);assertEquals(dt24.getMillis(), fld.add(dt20.getMillis(), 4L));
    }finally{__CLR4_4_112tt12ttlc8azwlj.R.flushNeeded();}}

    public void testDurationMonth() {__CLR4_4_112tt12ttlc8azwlj.R.globalSliceStart(getClass().getName(),50712);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19eaj33134o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_112tt12ttlc8azwlj.R.rethrow($CLV_t2$);}finally{__CLR4_4_112tt12ttlc8azwlj.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestCopticChronology.testDurationMonth",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),50712,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19eaj33134o(){try{__CLR4_4_112tt12ttlc8azwlj.R.inc(50712);
        // Leap 1723
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50713);DateTime dt11 = new DateTime(1723, 11, 2, 0, 0, 0, 0, COPTIC_UTC);
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50714);DateTime dt12 = new DateTime(1723, 12, 2, 0, 0, 0, 0, COPTIC_UTC);
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50715);DateTime dt13 = new DateTime(1723, 13, 2, 0, 0, 0, 0, COPTIC_UTC);
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50716);DateTime dt01 = new DateTime(1724, 1, 2, 0, 0, 0, 0, COPTIC_UTC);
        
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50717);DurationField fld = dt11.monthOfYear().getDurationField();
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50718);assertEquals(COPTIC_UTC.months(), fld);
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50719);assertEquals(1L * 30L * MILLIS_PER_DAY, fld.getMillis(1, dt11.getMillis()));
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50720);assertEquals(2L * 30L * MILLIS_PER_DAY, fld.getMillis(2, dt11.getMillis()));
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50721);assertEquals((2L * 30L + 6L) * MILLIS_PER_DAY, fld.getMillis(3, dt11.getMillis()));
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50722);assertEquals((3L * 30L + 6L) * MILLIS_PER_DAY, fld.getMillis(4, dt11.getMillis()));
        
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50723);assertEquals(1L * 30L * MILLIS_PER_DAY, fld.getMillis(1));
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50724);assertEquals(2L * 30L * MILLIS_PER_DAY, fld.getMillis(2));
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50725);assertEquals(13L * 30L * MILLIS_PER_DAY, fld.getMillis(13));
        
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50726);assertEquals(1L * 30L * MILLIS_PER_DAY, fld.getMillis(1L, dt11.getMillis()));
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50727);assertEquals(2L * 30L * MILLIS_PER_DAY, fld.getMillis(2L, dt11.getMillis()));
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50728);assertEquals((2L * 30L + 6L) * MILLIS_PER_DAY, fld.getMillis(3L, dt11.getMillis()));
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50729);assertEquals((3L * 30L + 6L) * MILLIS_PER_DAY, fld.getMillis(4L, dt11.getMillis()));
        
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50730);assertEquals(1L * 30L * MILLIS_PER_DAY, fld.getMillis(1L));
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50731);assertEquals(2L * 30L * MILLIS_PER_DAY, fld.getMillis(2L));
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50732);assertEquals(13L * 30L * MILLIS_PER_DAY, fld.getMillis(13L));
        
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50733);assertEquals(0, fld.getValue(1L * 30L * MILLIS_PER_DAY - 1L, dt11.getMillis()));
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50734);assertEquals(1, fld.getValue(1L * 30L * MILLIS_PER_DAY, dt11.getMillis()));
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50735);assertEquals(1, fld.getValue(1L * 30L * MILLIS_PER_DAY + 1L, dt11.getMillis()));
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50736);assertEquals(1, fld.getValue(2L * 30L * MILLIS_PER_DAY - 1L, dt11.getMillis()));
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50737);assertEquals(2, fld.getValue(2L * 30L * MILLIS_PER_DAY, dt11.getMillis()));
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50738);assertEquals(2, fld.getValue(2L * 30L * MILLIS_PER_DAY + 1L, dt11.getMillis()));
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50739);assertEquals(2, fld.getValue((2L * 30L + 6L) * MILLIS_PER_DAY - 1L, dt11.getMillis()));
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50740);assertEquals(3, fld.getValue((2L * 30L + 6L) * MILLIS_PER_DAY, dt11.getMillis()));
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50741);assertEquals(3, fld.getValue((2L * 30L + 6L) * MILLIS_PER_DAY + 1L, dt11.getMillis()));
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50742);assertEquals(3, fld.getValue((3L * 30L + 6L) * MILLIS_PER_DAY - 1L, dt11.getMillis()));
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50743);assertEquals(4, fld.getValue((3L * 30L + 6L) * MILLIS_PER_DAY, dt11.getMillis()));
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50744);assertEquals(4, fld.getValue((3L * 30L + 6L) * MILLIS_PER_DAY + 1L, dt11.getMillis()));
        
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50745);assertEquals(dt12.getMillis(), fld.add(dt11.getMillis(), 1));
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50746);assertEquals(dt13.getMillis(), fld.add(dt11.getMillis(), 2));
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50747);assertEquals(dt01.getMillis(), fld.add(dt11.getMillis(), 3));
        
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50748);assertEquals(dt12.getMillis(), fld.add(dt11.getMillis(), 1L));
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50749);assertEquals(dt13.getMillis(), fld.add(dt11.getMillis(), 2L));
        __CLR4_4_112tt12ttlc8azwlj.R.inc(50750);assertEquals(dt01.getMillis(), fld.add(dt11.getMillis(), 3L));
    }finally{__CLR4_4_112tt12ttlc8azwlj.R.flushNeeded();}}

}
