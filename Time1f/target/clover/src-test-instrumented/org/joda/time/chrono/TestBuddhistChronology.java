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
import org.joda.time.Period;

/**
 * This class is a Junit unit test for BuddhistChronology.
 *
 * @author Stephen Colebourne
 */
public class TestBuddhistChronology extends TestCase {static class __CLR4_4_112m212m2lc8azwkc{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672271031490L,8589935092L,50321,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static int SKIP = 1 * DateTimeConstants.MILLIS_PER_DAY;
    
    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    private static final DateTimeZone TOKYO = DateTimeZone.forID("Asia/Tokyo");
    private static final Chronology BUDDHIST_UTC = BuddhistChronology.getInstanceUTC();
    private static final Chronology JULIAN_UTC = JulianChronology.getInstanceUTC();
    private static final Chronology GJ_UTC = GJChronology.getInstanceUTC();
    private static final Chronology ISO_UTC = ISOChronology.getInstanceUTC();

    long y2002days = 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 
                     366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 
                     365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 +
                     366 + 365;
    // 2002-06-09
    private long TEST_TIME_NOW =
            (y2002days + 31L + 28L + 31L + 30L + 31L + 9L -1L) * DateTimeConstants.MILLIS_PER_DAY;

    private DateTimeZone originalDateTimeZone = null;
    private TimeZone originalTimeZone = null;
    private Locale originalLocale = null;

    public static void main(String[] args) {try{__CLR4_4_112m212m2lc8azwkc.R.inc(50042);
        __CLR4_4_112m212m2lc8azwkc.R.inc(50043);SKIP = 1 * DateTimeConstants.MILLIS_PER_DAY;
        __CLR4_4_112m212m2lc8azwkc.R.inc(50044);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_112m212m2lc8azwkc.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_112m212m2lc8azwkc.R.inc(50045);
        __CLR4_4_112m212m2lc8azwkc.R.inc(50046);return new TestSuite(TestBuddhistChronology.class);
    }finally{__CLR4_4_112m212m2lc8azwkc.R.flushNeeded();}}

    public TestBuddhistChronology(String name) {
        super(name);__CLR4_4_112m212m2lc8azwkc.R.inc(50048);try{__CLR4_4_112m212m2lc8azwkc.R.inc(50047);
    }finally{__CLR4_4_112m212m2lc8azwkc.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_112m212m2lc8azwkc.R.inc(50049);
        __CLR4_4_112m212m2lc8azwkc.R.inc(50050);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_112m212m2lc8azwkc.R.inc(50051);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_112m212m2lc8azwkc.R.inc(50052);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_112m212m2lc8azwkc.R.inc(50053);originalLocale = Locale.getDefault();
        __CLR4_4_112m212m2lc8azwkc.R.inc(50054);DateTimeZone.setDefault(LONDON);
        __CLR4_4_112m212m2lc8azwkc.R.inc(50055);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_112m212m2lc8azwkc.R.inc(50056);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_112m212m2lc8azwkc.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_112m212m2lc8azwkc.R.inc(50057);
        __CLR4_4_112m212m2lc8azwkc.R.inc(50058);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_112m212m2lc8azwkc.R.inc(50059);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_112m212m2lc8azwkc.R.inc(50060);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_112m212m2lc8azwkc.R.inc(50061);Locale.setDefault(originalLocale);
        __CLR4_4_112m212m2lc8azwkc.R.inc(50062);originalDateTimeZone = null;
        __CLR4_4_112m212m2lc8azwkc.R.inc(50063);originalTimeZone = null;
        __CLR4_4_112m212m2lc8azwkc.R.inc(50064);originalLocale = null;
    }finally{__CLR4_4_112m212m2lc8azwkc.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testFactoryUTC() {__CLR4_4_112m212m2lc8azwkc.R.globalSliceStart(getClass().getName(),50065);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19knvhv12mp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_112m212m2lc8azwkc.R.rethrow($CLV_t2$);}finally{__CLR4_4_112m212m2lc8azwkc.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestBuddhistChronology.testFactoryUTC",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),50065,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19knvhv12mp(){try{__CLR4_4_112m212m2lc8azwkc.R.inc(50065);
        __CLR4_4_112m212m2lc8azwkc.R.inc(50066);assertEquals(DateTimeZone.UTC, BuddhistChronology.getInstanceUTC().getZone());
        __CLR4_4_112m212m2lc8azwkc.R.inc(50067);assertSame(BuddhistChronology.class, BuddhistChronology.getInstanceUTC().getClass());
    }finally{__CLR4_4_112m212m2lc8azwkc.R.flushNeeded();}}

    public void testFactory() {__CLR4_4_112m212m2lc8azwkc.R.globalSliceStart(getClass().getName(),50068);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_116tztt12ms();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_112m212m2lc8azwkc.R.rethrow($CLV_t2$);}finally{__CLR4_4_112m212m2lc8azwkc.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestBuddhistChronology.testFactory",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),50068,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_116tztt12ms(){try{__CLR4_4_112m212m2lc8azwkc.R.inc(50068);
        __CLR4_4_112m212m2lc8azwkc.R.inc(50069);assertEquals(LONDON, BuddhistChronology.getInstance().getZone());
        __CLR4_4_112m212m2lc8azwkc.R.inc(50070);assertSame(BuddhistChronology.class, BuddhistChronology.getInstance().getClass());
    }finally{__CLR4_4_112m212m2lc8azwkc.R.flushNeeded();}}

    public void testFactory_Zone() {__CLR4_4_112m212m2lc8azwkc.R.globalSliceStart(getClass().getName(),50071);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yy5ime12mv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_112m212m2lc8azwkc.R.rethrow($CLV_t2$);}finally{__CLR4_4_112m212m2lc8azwkc.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestBuddhistChronology.testFactory_Zone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),50071,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yy5ime12mv(){try{__CLR4_4_112m212m2lc8azwkc.R.inc(50071);
        __CLR4_4_112m212m2lc8azwkc.R.inc(50072);assertEquals(TOKYO, BuddhistChronology.getInstance(TOKYO).getZone());
        __CLR4_4_112m212m2lc8azwkc.R.inc(50073);assertEquals(PARIS, BuddhistChronology.getInstance(PARIS).getZone());
        __CLR4_4_112m212m2lc8azwkc.R.inc(50074);assertEquals(LONDON, BuddhistChronology.getInstance(null).getZone());
        __CLR4_4_112m212m2lc8azwkc.R.inc(50075);assertSame(BuddhistChronology.class, BuddhistChronology.getInstance(TOKYO).getClass());
    }finally{__CLR4_4_112m212m2lc8azwkc.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testEquality() {__CLR4_4_112m212m2lc8azwkc.R.globalSliceStart(getClass().getName(),50076);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12agdql12n0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_112m212m2lc8azwkc.R.rethrow($CLV_t2$);}finally{__CLR4_4_112m212m2lc8azwkc.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestBuddhistChronology.testEquality",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),50076,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12agdql12n0(){try{__CLR4_4_112m212m2lc8azwkc.R.inc(50076);
        __CLR4_4_112m212m2lc8azwkc.R.inc(50077);assertSame(BuddhistChronology.getInstance(TOKYO), BuddhistChronology.getInstance(TOKYO));
        __CLR4_4_112m212m2lc8azwkc.R.inc(50078);assertSame(BuddhistChronology.getInstance(LONDON), BuddhistChronology.getInstance(LONDON));
        __CLR4_4_112m212m2lc8azwkc.R.inc(50079);assertSame(BuddhistChronology.getInstance(PARIS), BuddhistChronology.getInstance(PARIS));
        __CLR4_4_112m212m2lc8azwkc.R.inc(50080);assertSame(BuddhistChronology.getInstanceUTC(), BuddhistChronology.getInstanceUTC());
        __CLR4_4_112m212m2lc8azwkc.R.inc(50081);assertSame(BuddhistChronology.getInstance(), BuddhistChronology.getInstance(LONDON));
    }finally{__CLR4_4_112m212m2lc8azwkc.R.flushNeeded();}}

    public void testWithUTC() {__CLR4_4_112m212m2lc8azwkc.R.globalSliceStart(getClass().getName(),50082);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19orv8312n6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_112m212m2lc8azwkc.R.rethrow($CLV_t2$);}finally{__CLR4_4_112m212m2lc8azwkc.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestBuddhistChronology.testWithUTC",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),50082,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19orv8312n6(){try{__CLR4_4_112m212m2lc8azwkc.R.inc(50082);
        __CLR4_4_112m212m2lc8azwkc.R.inc(50083);assertSame(BuddhistChronology.getInstanceUTC(), BuddhistChronology.getInstance(LONDON).withUTC());
        __CLR4_4_112m212m2lc8azwkc.R.inc(50084);assertSame(BuddhistChronology.getInstanceUTC(), BuddhistChronology.getInstance(TOKYO).withUTC());
        __CLR4_4_112m212m2lc8azwkc.R.inc(50085);assertSame(BuddhistChronology.getInstanceUTC(), BuddhistChronology.getInstanceUTC().withUTC());
        __CLR4_4_112m212m2lc8azwkc.R.inc(50086);assertSame(BuddhistChronology.getInstanceUTC(), BuddhistChronology.getInstance().withUTC());
    }finally{__CLR4_4_112m212m2lc8azwkc.R.flushNeeded();}}

    public void testWithZone() {__CLR4_4_112m212m2lc8azwkc.R.globalSliceStart(getClass().getName(),50087);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1me3iet12nb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_112m212m2lc8azwkc.R.rethrow($CLV_t2$);}finally{__CLR4_4_112m212m2lc8azwkc.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestBuddhistChronology.testWithZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),50087,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1me3iet12nb(){try{__CLR4_4_112m212m2lc8azwkc.R.inc(50087);
        __CLR4_4_112m212m2lc8azwkc.R.inc(50088);assertSame(BuddhistChronology.getInstance(TOKYO), BuddhistChronology.getInstance(TOKYO).withZone(TOKYO));
        __CLR4_4_112m212m2lc8azwkc.R.inc(50089);assertSame(BuddhistChronology.getInstance(LONDON), BuddhistChronology.getInstance(TOKYO).withZone(LONDON));
        __CLR4_4_112m212m2lc8azwkc.R.inc(50090);assertSame(BuddhistChronology.getInstance(PARIS), BuddhistChronology.getInstance(TOKYO).withZone(PARIS));
        __CLR4_4_112m212m2lc8azwkc.R.inc(50091);assertSame(BuddhistChronology.getInstance(LONDON), BuddhistChronology.getInstance(TOKYO).withZone(null));
        __CLR4_4_112m212m2lc8azwkc.R.inc(50092);assertSame(BuddhistChronology.getInstance(PARIS), BuddhistChronology.getInstance().withZone(PARIS));
        __CLR4_4_112m212m2lc8azwkc.R.inc(50093);assertSame(BuddhistChronology.getInstance(PARIS), BuddhistChronology.getInstanceUTC().withZone(PARIS));
    }finally{__CLR4_4_112m212m2lc8azwkc.R.flushNeeded();}}

    public void testToString() {__CLR4_4_112m212m2lc8azwkc.R.globalSliceStart(getClass().getName(),50094);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hrxdid12ni();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_112m212m2lc8azwkc.R.rethrow($CLV_t2$);}finally{__CLR4_4_112m212m2lc8azwkc.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestBuddhistChronology.testToString",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),50094,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hrxdid12ni(){try{__CLR4_4_112m212m2lc8azwkc.R.inc(50094);
        __CLR4_4_112m212m2lc8azwkc.R.inc(50095);assertEquals("BuddhistChronology[Europe/London]", BuddhistChronology.getInstance(LONDON).toString());
        __CLR4_4_112m212m2lc8azwkc.R.inc(50096);assertEquals("BuddhistChronology[Asia/Tokyo]", BuddhistChronology.getInstance(TOKYO).toString());
        __CLR4_4_112m212m2lc8azwkc.R.inc(50097);assertEquals("BuddhistChronology[Europe/London]", BuddhistChronology.getInstance().toString());
        __CLR4_4_112m212m2lc8azwkc.R.inc(50098);assertEquals("BuddhistChronology[UTC]", BuddhistChronology.getInstanceUTC().toString());
    }finally{__CLR4_4_112m212m2lc8azwkc.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testDurationFields() {__CLR4_4_112m212m2lc8azwkc.R.globalSliceStart(getClass().getName(),50099);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cnkzye12nn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_112m212m2lc8azwkc.R.rethrow($CLV_t2$);}finally{__CLR4_4_112m212m2lc8azwkc.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestBuddhistChronology.testDurationFields",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),50099,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cnkzye12nn(){try{__CLR4_4_112m212m2lc8azwkc.R.inc(50099);
        __CLR4_4_112m212m2lc8azwkc.R.inc(50100);final BuddhistChronology buddhist = BuddhistChronology.getInstance();
        __CLR4_4_112m212m2lc8azwkc.R.inc(50101);assertEquals("eras", buddhist.eras().getName());
        __CLR4_4_112m212m2lc8azwkc.R.inc(50102);assertEquals("centuries", buddhist.centuries().getName());
        __CLR4_4_112m212m2lc8azwkc.R.inc(50103);assertEquals("years", buddhist.years().getName());
        __CLR4_4_112m212m2lc8azwkc.R.inc(50104);assertEquals("weekyears", buddhist.weekyears().getName());
        __CLR4_4_112m212m2lc8azwkc.R.inc(50105);assertEquals("months", buddhist.months().getName());
        __CLR4_4_112m212m2lc8azwkc.R.inc(50106);assertEquals("weeks", buddhist.weeks().getName());
        __CLR4_4_112m212m2lc8azwkc.R.inc(50107);assertEquals("days", buddhist.days().getName());
        __CLR4_4_112m212m2lc8azwkc.R.inc(50108);assertEquals("halfdays", GregorianChronology.getInstance().halfdays().getName());
        __CLR4_4_112m212m2lc8azwkc.R.inc(50109);assertEquals("hours", buddhist.hours().getName());
        __CLR4_4_112m212m2lc8azwkc.R.inc(50110);assertEquals("minutes", buddhist.minutes().getName());
        __CLR4_4_112m212m2lc8azwkc.R.inc(50111);assertEquals("seconds", buddhist.seconds().getName());
        __CLR4_4_112m212m2lc8azwkc.R.inc(50112);assertEquals("millis", buddhist.millis().getName());
        
        __CLR4_4_112m212m2lc8azwkc.R.inc(50113);assertEquals(false, buddhist.eras().isSupported());
        __CLR4_4_112m212m2lc8azwkc.R.inc(50114);assertEquals(true, buddhist.centuries().isSupported());
        __CLR4_4_112m212m2lc8azwkc.R.inc(50115);assertEquals(true, buddhist.years().isSupported());
        __CLR4_4_112m212m2lc8azwkc.R.inc(50116);assertEquals(true, buddhist.weekyears().isSupported());
        __CLR4_4_112m212m2lc8azwkc.R.inc(50117);assertEquals(true, buddhist.months().isSupported());
        __CLR4_4_112m212m2lc8azwkc.R.inc(50118);assertEquals(true, buddhist.weeks().isSupported());
        __CLR4_4_112m212m2lc8azwkc.R.inc(50119);assertEquals(true, buddhist.days().isSupported());
        __CLR4_4_112m212m2lc8azwkc.R.inc(50120);assertEquals(true, buddhist.halfdays().isSupported());
        __CLR4_4_112m212m2lc8azwkc.R.inc(50121);assertEquals(true, buddhist.hours().isSupported());
        __CLR4_4_112m212m2lc8azwkc.R.inc(50122);assertEquals(true, buddhist.minutes().isSupported());
        __CLR4_4_112m212m2lc8azwkc.R.inc(50123);assertEquals(true, buddhist.seconds().isSupported());
        __CLR4_4_112m212m2lc8azwkc.R.inc(50124);assertEquals(true, buddhist.millis().isSupported());
        
        __CLR4_4_112m212m2lc8azwkc.R.inc(50125);assertEquals(false, buddhist.centuries().isPrecise());
        __CLR4_4_112m212m2lc8azwkc.R.inc(50126);assertEquals(false, buddhist.years().isPrecise());
        __CLR4_4_112m212m2lc8azwkc.R.inc(50127);assertEquals(false, buddhist.weekyears().isPrecise());
        __CLR4_4_112m212m2lc8azwkc.R.inc(50128);assertEquals(false, buddhist.months().isPrecise());
        __CLR4_4_112m212m2lc8azwkc.R.inc(50129);assertEquals(false, buddhist.weeks().isPrecise());
        __CLR4_4_112m212m2lc8azwkc.R.inc(50130);assertEquals(false, buddhist.days().isPrecise());
        __CLR4_4_112m212m2lc8azwkc.R.inc(50131);assertEquals(false, buddhist.halfdays().isPrecise());
        __CLR4_4_112m212m2lc8azwkc.R.inc(50132);assertEquals(true, buddhist.hours().isPrecise());
        __CLR4_4_112m212m2lc8azwkc.R.inc(50133);assertEquals(true, buddhist.minutes().isPrecise());
        __CLR4_4_112m212m2lc8azwkc.R.inc(50134);assertEquals(true, buddhist.seconds().isPrecise());
        __CLR4_4_112m212m2lc8azwkc.R.inc(50135);assertEquals(true, buddhist.millis().isPrecise());
        
        __CLR4_4_112m212m2lc8azwkc.R.inc(50136);final BuddhistChronology buddhistUTC = BuddhistChronology.getInstanceUTC();
        __CLR4_4_112m212m2lc8azwkc.R.inc(50137);assertEquals(false, buddhistUTC.centuries().isPrecise());
        __CLR4_4_112m212m2lc8azwkc.R.inc(50138);assertEquals(false, buddhistUTC.years().isPrecise());
        __CLR4_4_112m212m2lc8azwkc.R.inc(50139);assertEquals(false, buddhistUTC.weekyears().isPrecise());
        __CLR4_4_112m212m2lc8azwkc.R.inc(50140);assertEquals(false, buddhistUTC.months().isPrecise());
        __CLR4_4_112m212m2lc8azwkc.R.inc(50141);assertEquals(true, buddhistUTC.weeks().isPrecise());
        __CLR4_4_112m212m2lc8azwkc.R.inc(50142);assertEquals(true, buddhistUTC.days().isPrecise());
        __CLR4_4_112m212m2lc8azwkc.R.inc(50143);assertEquals(true, buddhistUTC.halfdays().isPrecise());
        __CLR4_4_112m212m2lc8azwkc.R.inc(50144);assertEquals(true, buddhistUTC.hours().isPrecise());
        __CLR4_4_112m212m2lc8azwkc.R.inc(50145);assertEquals(true, buddhistUTC.minutes().isPrecise());
        __CLR4_4_112m212m2lc8azwkc.R.inc(50146);assertEquals(true, buddhistUTC.seconds().isPrecise());
        __CLR4_4_112m212m2lc8azwkc.R.inc(50147);assertEquals(true, buddhistUTC.millis().isPrecise());
        
        __CLR4_4_112m212m2lc8azwkc.R.inc(50148);final DateTimeZone gmt = DateTimeZone.forID("Etc/GMT");
        __CLR4_4_112m212m2lc8azwkc.R.inc(50149);final BuddhistChronology buddhistGMT = BuddhistChronology.getInstance(gmt);
        __CLR4_4_112m212m2lc8azwkc.R.inc(50150);assertEquals(false, buddhistGMT.centuries().isPrecise());
        __CLR4_4_112m212m2lc8azwkc.R.inc(50151);assertEquals(false, buddhistGMT.years().isPrecise());
        __CLR4_4_112m212m2lc8azwkc.R.inc(50152);assertEquals(false, buddhistGMT.weekyears().isPrecise());
        __CLR4_4_112m212m2lc8azwkc.R.inc(50153);assertEquals(false, buddhistGMT.months().isPrecise());
        __CLR4_4_112m212m2lc8azwkc.R.inc(50154);assertEquals(true, buddhistGMT.weeks().isPrecise());
        __CLR4_4_112m212m2lc8azwkc.R.inc(50155);assertEquals(true, buddhistGMT.days().isPrecise());
        __CLR4_4_112m212m2lc8azwkc.R.inc(50156);assertEquals(true, buddhistGMT.halfdays().isPrecise());
        __CLR4_4_112m212m2lc8azwkc.R.inc(50157);assertEquals(true, buddhistGMT.hours().isPrecise());
        __CLR4_4_112m212m2lc8azwkc.R.inc(50158);assertEquals(true, buddhistGMT.minutes().isPrecise());
        __CLR4_4_112m212m2lc8azwkc.R.inc(50159);assertEquals(true, buddhistGMT.seconds().isPrecise());
        __CLR4_4_112m212m2lc8azwkc.R.inc(50160);assertEquals(true, buddhistGMT.millis().isPrecise());
    }finally{__CLR4_4_112m212m2lc8azwkc.R.flushNeeded();}}

    public void testDateFields() {__CLR4_4_112m212m2lc8azwkc.R.globalSliceStart(getClass().getName(),50161);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gkspeo12pd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_112m212m2lc8azwkc.R.rethrow($CLV_t2$);}finally{__CLR4_4_112m212m2lc8azwkc.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestBuddhistChronology.testDateFields",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),50161,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gkspeo12pd(){try{__CLR4_4_112m212m2lc8azwkc.R.inc(50161);
        __CLR4_4_112m212m2lc8azwkc.R.inc(50162);final BuddhistChronology buddhist = BuddhistChronology.getInstance();
        __CLR4_4_112m212m2lc8azwkc.R.inc(50163);assertEquals("era", buddhist.era().getName());
        __CLR4_4_112m212m2lc8azwkc.R.inc(50164);assertEquals("centuryOfEra", buddhist.centuryOfEra().getName());
        __CLR4_4_112m212m2lc8azwkc.R.inc(50165);assertEquals("yearOfCentury", buddhist.yearOfCentury().getName());
        __CLR4_4_112m212m2lc8azwkc.R.inc(50166);assertEquals("yearOfEra", buddhist.yearOfEra().getName());
        __CLR4_4_112m212m2lc8azwkc.R.inc(50167);assertEquals("year", buddhist.year().getName());
        __CLR4_4_112m212m2lc8azwkc.R.inc(50168);assertEquals("monthOfYear", buddhist.monthOfYear().getName());
        __CLR4_4_112m212m2lc8azwkc.R.inc(50169);assertEquals("weekyearOfCentury", buddhist.weekyearOfCentury().getName());
        __CLR4_4_112m212m2lc8azwkc.R.inc(50170);assertEquals("weekyear", buddhist.weekyear().getName());
        __CLR4_4_112m212m2lc8azwkc.R.inc(50171);assertEquals("weekOfWeekyear", buddhist.weekOfWeekyear().getName());
        __CLR4_4_112m212m2lc8azwkc.R.inc(50172);assertEquals("dayOfYear", buddhist.dayOfYear().getName());
        __CLR4_4_112m212m2lc8azwkc.R.inc(50173);assertEquals("dayOfMonth", buddhist.dayOfMonth().getName());
        __CLR4_4_112m212m2lc8azwkc.R.inc(50174);assertEquals("dayOfWeek", buddhist.dayOfWeek().getName());
        
        __CLR4_4_112m212m2lc8azwkc.R.inc(50175);assertEquals(true, buddhist.era().isSupported());
        __CLR4_4_112m212m2lc8azwkc.R.inc(50176);assertEquals(true, buddhist.centuryOfEra().isSupported());
        __CLR4_4_112m212m2lc8azwkc.R.inc(50177);assertEquals(true, buddhist.yearOfCentury().isSupported());
        __CLR4_4_112m212m2lc8azwkc.R.inc(50178);assertEquals(true, buddhist.yearOfEra().isSupported());
        __CLR4_4_112m212m2lc8azwkc.R.inc(50179);assertEquals(true, buddhist.year().isSupported());
        __CLR4_4_112m212m2lc8azwkc.R.inc(50180);assertEquals(true, buddhist.monthOfYear().isSupported());
        __CLR4_4_112m212m2lc8azwkc.R.inc(50181);assertEquals(true, buddhist.weekyearOfCentury().isSupported());
        __CLR4_4_112m212m2lc8azwkc.R.inc(50182);assertEquals(true, buddhist.weekyear().isSupported());
        __CLR4_4_112m212m2lc8azwkc.R.inc(50183);assertEquals(true, buddhist.weekOfWeekyear().isSupported());
        __CLR4_4_112m212m2lc8azwkc.R.inc(50184);assertEquals(true, buddhist.dayOfYear().isSupported());
        __CLR4_4_112m212m2lc8azwkc.R.inc(50185);assertEquals(true, buddhist.dayOfMonth().isSupported());
        __CLR4_4_112m212m2lc8azwkc.R.inc(50186);assertEquals(true, buddhist.dayOfWeek().isSupported());
        
        __CLR4_4_112m212m2lc8azwkc.R.inc(50187);assertEquals(buddhist.eras(), buddhist.era().getDurationField());
        __CLR4_4_112m212m2lc8azwkc.R.inc(50188);assertEquals(buddhist.centuries(), buddhist.centuryOfEra().getDurationField());
        __CLR4_4_112m212m2lc8azwkc.R.inc(50189);assertEquals(buddhist.years(), buddhist.yearOfCentury().getDurationField());
        __CLR4_4_112m212m2lc8azwkc.R.inc(50190);assertEquals(buddhist.years(), buddhist.yearOfEra().getDurationField());
        __CLR4_4_112m212m2lc8azwkc.R.inc(50191);assertEquals(buddhist.years(), buddhist.year().getDurationField());
        __CLR4_4_112m212m2lc8azwkc.R.inc(50192);assertEquals(buddhist.months(), buddhist.monthOfYear().getDurationField());
        __CLR4_4_112m212m2lc8azwkc.R.inc(50193);assertEquals(buddhist.weekyears(), buddhist.weekyearOfCentury().getDurationField());
        __CLR4_4_112m212m2lc8azwkc.R.inc(50194);assertEquals(buddhist.weekyears(), buddhist.weekyear().getDurationField());
        __CLR4_4_112m212m2lc8azwkc.R.inc(50195);assertEquals(buddhist.weeks(), buddhist.weekOfWeekyear().getDurationField());
        __CLR4_4_112m212m2lc8azwkc.R.inc(50196);assertEquals(buddhist.days(), buddhist.dayOfYear().getDurationField());
        __CLR4_4_112m212m2lc8azwkc.R.inc(50197);assertEquals(buddhist.days(), buddhist.dayOfMonth().getDurationField());
        __CLR4_4_112m212m2lc8azwkc.R.inc(50198);assertEquals(buddhist.days(), buddhist.dayOfWeek().getDurationField());
        
        __CLR4_4_112m212m2lc8azwkc.R.inc(50199);assertEquals(null, buddhist.era().getRangeDurationField());
        __CLR4_4_112m212m2lc8azwkc.R.inc(50200);assertEquals(buddhist.eras(), buddhist.centuryOfEra().getRangeDurationField());
        __CLR4_4_112m212m2lc8azwkc.R.inc(50201);assertEquals(buddhist.centuries(), buddhist.yearOfCentury().getRangeDurationField());
        __CLR4_4_112m212m2lc8azwkc.R.inc(50202);assertEquals(buddhist.eras(), buddhist.yearOfEra().getRangeDurationField());
        __CLR4_4_112m212m2lc8azwkc.R.inc(50203);assertEquals(null, buddhist.year().getRangeDurationField());
        __CLR4_4_112m212m2lc8azwkc.R.inc(50204);assertEquals(buddhist.years(), buddhist.monthOfYear().getRangeDurationField());
        __CLR4_4_112m212m2lc8azwkc.R.inc(50205);assertEquals(buddhist.centuries(), buddhist.weekyearOfCentury().getRangeDurationField());
        __CLR4_4_112m212m2lc8azwkc.R.inc(50206);assertEquals(null, buddhist.weekyear().getRangeDurationField());
        __CLR4_4_112m212m2lc8azwkc.R.inc(50207);assertEquals(buddhist.weekyears(), buddhist.weekOfWeekyear().getRangeDurationField());
        __CLR4_4_112m212m2lc8azwkc.R.inc(50208);assertEquals(buddhist.years(), buddhist.dayOfYear().getRangeDurationField());
        __CLR4_4_112m212m2lc8azwkc.R.inc(50209);assertEquals(buddhist.months(), buddhist.dayOfMonth().getRangeDurationField());
        __CLR4_4_112m212m2lc8azwkc.R.inc(50210);assertEquals(buddhist.weeks(), buddhist.dayOfWeek().getRangeDurationField());
    }finally{__CLR4_4_112m212m2lc8azwkc.R.flushNeeded();}}

    public void testTimeFields() {__CLR4_4_112m212m2lc8azwkc.R.globalSliceStart(getClass().getName(),50211);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11r11up12qr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_112m212m2lc8azwkc.R.rethrow($CLV_t2$);}finally{__CLR4_4_112m212m2lc8azwkc.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestBuddhistChronology.testTimeFields",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),50211,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11r11up12qr(){try{__CLR4_4_112m212m2lc8azwkc.R.inc(50211);
        __CLR4_4_112m212m2lc8azwkc.R.inc(50212);final BuddhistChronology buddhist = BuddhistChronology.getInstance();
        __CLR4_4_112m212m2lc8azwkc.R.inc(50213);assertEquals("halfdayOfDay", buddhist.halfdayOfDay().getName());
        __CLR4_4_112m212m2lc8azwkc.R.inc(50214);assertEquals("clockhourOfHalfday", buddhist.clockhourOfHalfday().getName());
        __CLR4_4_112m212m2lc8azwkc.R.inc(50215);assertEquals("hourOfHalfday", buddhist.hourOfHalfday().getName());
        __CLR4_4_112m212m2lc8azwkc.R.inc(50216);assertEquals("clockhourOfDay", buddhist.clockhourOfDay().getName());
        __CLR4_4_112m212m2lc8azwkc.R.inc(50217);assertEquals("hourOfDay", buddhist.hourOfDay().getName());
        __CLR4_4_112m212m2lc8azwkc.R.inc(50218);assertEquals("minuteOfDay", buddhist.minuteOfDay().getName());
        __CLR4_4_112m212m2lc8azwkc.R.inc(50219);assertEquals("minuteOfHour", buddhist.minuteOfHour().getName());
        __CLR4_4_112m212m2lc8azwkc.R.inc(50220);assertEquals("secondOfDay", buddhist.secondOfDay().getName());
        __CLR4_4_112m212m2lc8azwkc.R.inc(50221);assertEquals("secondOfMinute", buddhist.secondOfMinute().getName());
        __CLR4_4_112m212m2lc8azwkc.R.inc(50222);assertEquals("millisOfDay", buddhist.millisOfDay().getName());
        __CLR4_4_112m212m2lc8azwkc.R.inc(50223);assertEquals("millisOfSecond", buddhist.millisOfSecond().getName());
        
        __CLR4_4_112m212m2lc8azwkc.R.inc(50224);assertEquals(true, buddhist.halfdayOfDay().isSupported());
        __CLR4_4_112m212m2lc8azwkc.R.inc(50225);assertEquals(true, buddhist.clockhourOfHalfday().isSupported());
        __CLR4_4_112m212m2lc8azwkc.R.inc(50226);assertEquals(true, buddhist.hourOfHalfday().isSupported());
        __CLR4_4_112m212m2lc8azwkc.R.inc(50227);assertEquals(true, buddhist.clockhourOfDay().isSupported());
        __CLR4_4_112m212m2lc8azwkc.R.inc(50228);assertEquals(true, buddhist.hourOfDay().isSupported());
        __CLR4_4_112m212m2lc8azwkc.R.inc(50229);assertEquals(true, buddhist.minuteOfDay().isSupported());
        __CLR4_4_112m212m2lc8azwkc.R.inc(50230);assertEquals(true, buddhist.minuteOfHour().isSupported());
        __CLR4_4_112m212m2lc8azwkc.R.inc(50231);assertEquals(true, buddhist.secondOfDay().isSupported());
        __CLR4_4_112m212m2lc8azwkc.R.inc(50232);assertEquals(true, buddhist.secondOfMinute().isSupported());
        __CLR4_4_112m212m2lc8azwkc.R.inc(50233);assertEquals(true, buddhist.millisOfDay().isSupported());
        __CLR4_4_112m212m2lc8azwkc.R.inc(50234);assertEquals(true, buddhist.millisOfSecond().isSupported());
    }finally{__CLR4_4_112m212m2lc8azwkc.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testEpoch() {__CLR4_4_112m212m2lc8azwkc.R.globalSliceStart(getClass().getName(),50235);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19p7wci12rf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_112m212m2lc8azwkc.R.rethrow($CLV_t2$);}finally{__CLR4_4_112m212m2lc8azwkc.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestBuddhistChronology.testEpoch",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),50235,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19p7wci12rf(){try{__CLR4_4_112m212m2lc8azwkc.R.inc(50235);
        __CLR4_4_112m212m2lc8azwkc.R.inc(50236);DateTime epoch = new DateTime(1, 1, 1, 0, 0, 0, 0, BUDDHIST_UTC);
        __CLR4_4_112m212m2lc8azwkc.R.inc(50237);assertEquals(new DateTime(-543, 1, 1, 0, 0, 0, 0, JULIAN_UTC), epoch.withChronology(JULIAN_UTC));
    }finally{__CLR4_4_112m212m2lc8azwkc.R.flushNeeded();}}

    public void testEra() {__CLR4_4_112m212m2lc8azwkc.R.globalSliceStart(getClass().getName(),50238);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13euvzd12ri();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_112m212m2lc8azwkc.R.rethrow($CLV_t2$);}finally{__CLR4_4_112m212m2lc8azwkc.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestBuddhistChronology.testEra",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),50238,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13euvzd12ri(){try{__CLR4_4_112m212m2lc8azwkc.R.inc(50238);
        __CLR4_4_112m212m2lc8azwkc.R.inc(50239);assertEquals(1, BuddhistChronology.BE);
        __CLR4_4_112m212m2lc8azwkc.R.inc(50240);try {
            __CLR4_4_112m212m2lc8azwkc.R.inc(50241);new DateTime(-1, 13, 5, 0, 0, 0, 0, BUDDHIST_UTC);
            __CLR4_4_112m212m2lc8azwkc.R.inc(50242);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_112m212m2lc8azwkc.R.flushNeeded();}}

    public void testKeyYears() {__CLR4_4_112m212m2lc8azwkc.R.globalSliceStart(getClass().getName(),50243);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_134eu7k12rn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_112m212m2lc8azwkc.R.rethrow($CLV_t2$);}finally{__CLR4_4_112m212m2lc8azwkc.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestBuddhistChronology.testKeyYears",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),50243,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_134eu7k12rn(){try{__CLR4_4_112m212m2lc8azwkc.R.inc(50243);
        __CLR4_4_112m212m2lc8azwkc.R.inc(50244);DateTime bd = new DateTime(2513, 1, 1, 0, 0, 0, 0, BUDDHIST_UTC);
        __CLR4_4_112m212m2lc8azwkc.R.inc(50245);DateTime jd = new DateTime(1970, 1, 1, 0, 0, 0, 0, GJ_UTC);
        __CLR4_4_112m212m2lc8azwkc.R.inc(50246);assertEquals(jd, bd.withChronology(GJ_UTC));
        __CLR4_4_112m212m2lc8azwkc.R.inc(50247);assertEquals(2513, bd.getYear());
        __CLR4_4_112m212m2lc8azwkc.R.inc(50248);assertEquals(2513, bd.getYearOfEra());
        __CLR4_4_112m212m2lc8azwkc.R.inc(50249);assertEquals(2513, bd.plus(Period.weeks(1)).getWeekyear());
        
        __CLR4_4_112m212m2lc8azwkc.R.inc(50250);bd = new DateTime(2126, 1, 1, 0, 0, 0, 0, BUDDHIST_UTC);
        __CLR4_4_112m212m2lc8azwkc.R.inc(50251);jd = new DateTime(1583, 1, 1, 0, 0, 0, 0, GJ_UTC);
        __CLR4_4_112m212m2lc8azwkc.R.inc(50252);assertEquals(jd, bd.withChronology(GJ_UTC));
        __CLR4_4_112m212m2lc8azwkc.R.inc(50253);assertEquals(2126, bd.getYear());
        __CLR4_4_112m212m2lc8azwkc.R.inc(50254);assertEquals(2126, bd.getYearOfEra());
        __CLR4_4_112m212m2lc8azwkc.R.inc(50255);assertEquals(2126, bd.plus(Period.weeks(1)).getWeekyear());
        
        __CLR4_4_112m212m2lc8azwkc.R.inc(50256);bd = new DateTime(2125, 1, 1, 0, 0, 0, 0, BUDDHIST_UTC);
        __CLR4_4_112m212m2lc8azwkc.R.inc(50257);jd = new DateTime(1582, 1, 1, 0, 0, 0, 0, GJ_UTC);
        __CLR4_4_112m212m2lc8azwkc.R.inc(50258);assertEquals(jd, bd.withChronology(GJ_UTC));
        __CLR4_4_112m212m2lc8azwkc.R.inc(50259);assertEquals(2125, bd.getYear());
        __CLR4_4_112m212m2lc8azwkc.R.inc(50260);assertEquals(2125, bd.getYearOfEra());
        __CLR4_4_112m212m2lc8azwkc.R.inc(50261);assertEquals(2125, bd.plus(Period.weeks(1)).getWeekyear());
        
        __CLR4_4_112m212m2lc8azwkc.R.inc(50262);bd = new DateTime(544, 1, 1, 0, 0, 0, 0, BUDDHIST_UTC);
        __CLR4_4_112m212m2lc8azwkc.R.inc(50263);jd = new DateTime(1, 1, 1, 0, 0, 0, 0, GJ_UTC);
        __CLR4_4_112m212m2lc8azwkc.R.inc(50264);assertEquals(jd, bd.withChronology(GJ_UTC));
        __CLR4_4_112m212m2lc8azwkc.R.inc(50265);assertEquals(544, bd.getYear());
        __CLR4_4_112m212m2lc8azwkc.R.inc(50266);assertEquals(544, bd.getYearOfEra());
        __CLR4_4_112m212m2lc8azwkc.R.inc(50267);assertEquals(544, bd.plus(Period.weeks(1)).getWeekyear());
        
        __CLR4_4_112m212m2lc8azwkc.R.inc(50268);bd = new DateTime(543, 1, 1, 0, 0, 0, 0, BUDDHIST_UTC);
        __CLR4_4_112m212m2lc8azwkc.R.inc(50269);jd = new DateTime(-1, 1, 1, 0, 0, 0, 0, GJ_UTC);
        __CLR4_4_112m212m2lc8azwkc.R.inc(50270);assertEquals(jd, bd.withChronology(GJ_UTC));
        __CLR4_4_112m212m2lc8azwkc.R.inc(50271);assertEquals(543, bd.getYear());
        __CLR4_4_112m212m2lc8azwkc.R.inc(50272);assertEquals(543, bd.getYearOfEra());
        __CLR4_4_112m212m2lc8azwkc.R.inc(50273);assertEquals(543, bd.plus(Period.weeks(1)).getWeekyear());
        
        __CLR4_4_112m212m2lc8azwkc.R.inc(50274);bd = new DateTime(1, 1, 1, 0, 0, 0, 0, BUDDHIST_UTC);
        __CLR4_4_112m212m2lc8azwkc.R.inc(50275);jd = new DateTime(-543, 1, 1, 0, 0, 0, 0, GJ_UTC);
        __CLR4_4_112m212m2lc8azwkc.R.inc(50276);assertEquals(jd, bd.withChronology(GJ_UTC));
        __CLR4_4_112m212m2lc8azwkc.R.inc(50277);assertEquals(1, bd.getYear());
        __CLR4_4_112m212m2lc8azwkc.R.inc(50278);assertEquals(1, bd.getYearOfEra());
        __CLR4_4_112m212m2lc8azwkc.R.inc(50279);assertEquals(1, bd.plus(Period.weeks(1)).getWeekyear());
    }finally{__CLR4_4_112m212m2lc8azwkc.R.flushNeeded();}}

    public void testCalendar() {__CLR4_4_112m212m2lc8azwkc.R.globalSliceStart(getClass().getName(),50280);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1odnsqf12so();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_112m212m2lc8azwkc.R.rethrow($CLV_t2$);}finally{__CLR4_4_112m212m2lc8azwkc.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestBuddhistChronology.testCalendar",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),50280,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1odnsqf12so(){try{__CLR4_4_112m212m2lc8azwkc.R.inc(50280);
        __CLR4_4_112m212m2lc8azwkc.R.inc(50281);if ((((TestAll.FAST)&&(__CLR4_4_112m212m2lc8azwkc.R.iget(50282)!=0|true))||(__CLR4_4_112m212m2lc8azwkc.R.iget(50283)==0&false))) {{
            __CLR4_4_112m212m2lc8azwkc.R.inc(50284);return;
        }
        }__CLR4_4_112m212m2lc8azwkc.R.inc(50285);System.out.println("\nTestBuddhistChronology.testCalendar");
        __CLR4_4_112m212m2lc8azwkc.R.inc(50286);DateTime epoch = new DateTime(1, 1, 1, 0, 0, 0, 0, BUDDHIST_UTC);
        __CLR4_4_112m212m2lc8azwkc.R.inc(50287);long millis = epoch.getMillis();
        __CLR4_4_112m212m2lc8azwkc.R.inc(50288);long end = new DateTime(3000, 1, 1, 0, 0, 0, 0, ISO_UTC).getMillis();
        __CLR4_4_112m212m2lc8azwkc.R.inc(50289);DateTimeField dayOfWeek = BUDDHIST_UTC.dayOfWeek();
        __CLR4_4_112m212m2lc8azwkc.R.inc(50290);DateTimeField weekOfWeekyear = GJ_UTC.weekOfWeekyear();
        __CLR4_4_112m212m2lc8azwkc.R.inc(50291);DateTimeField dayOfYear = BUDDHIST_UTC.dayOfYear();
        __CLR4_4_112m212m2lc8azwkc.R.inc(50292);DateTimeField dayOfMonth = BUDDHIST_UTC.dayOfMonth();
        __CLR4_4_112m212m2lc8azwkc.R.inc(50293);DateTimeField monthOfYear = BUDDHIST_UTC.monthOfYear();
        __CLR4_4_112m212m2lc8azwkc.R.inc(50294);DateTimeField year = BUDDHIST_UTC.year();
        __CLR4_4_112m212m2lc8azwkc.R.inc(50295);DateTimeField yearOfEra = BUDDHIST_UTC.yearOfEra();
        __CLR4_4_112m212m2lc8azwkc.R.inc(50296);DateTimeField era = BUDDHIST_UTC.era();
        __CLR4_4_112m212m2lc8azwkc.R.inc(50297);DateTimeField gjDayOfWeek = GJ_UTC.dayOfWeek();
        __CLR4_4_112m212m2lc8azwkc.R.inc(50298);DateTimeField gjWeekOfWeekyear = GJ_UTC.weekOfWeekyear();
        __CLR4_4_112m212m2lc8azwkc.R.inc(50299);DateTimeField gjDayOfYear = GJ_UTC.dayOfYear();
        __CLR4_4_112m212m2lc8azwkc.R.inc(50300);DateTimeField gjDayOfMonth = GJ_UTC.dayOfMonth();
        __CLR4_4_112m212m2lc8azwkc.R.inc(50301);DateTimeField gjMonthOfYear = GJ_UTC.monthOfYear();
        __CLR4_4_112m212m2lc8azwkc.R.inc(50302);DateTimeField gjYear = GJ_UTC.year();
        __CLR4_4_112m212m2lc8azwkc.R.inc(50303);while ((((millis < end)&&(__CLR4_4_112m212m2lc8azwkc.R.iget(50304)!=0|true))||(__CLR4_4_112m212m2lc8azwkc.R.iget(50305)==0&false))) {{
            __CLR4_4_112m212m2lc8azwkc.R.inc(50306);assertEquals(gjDayOfWeek.get(millis), dayOfWeek.get(millis));
            __CLR4_4_112m212m2lc8azwkc.R.inc(50307);assertEquals(gjDayOfYear.get(millis), dayOfYear.get(millis));
            __CLR4_4_112m212m2lc8azwkc.R.inc(50308);assertEquals(gjDayOfMonth.get(millis), dayOfMonth.get(millis));
            __CLR4_4_112m212m2lc8azwkc.R.inc(50309);assertEquals(gjMonthOfYear.get(millis), monthOfYear.get(millis));
            __CLR4_4_112m212m2lc8azwkc.R.inc(50310);assertEquals(gjWeekOfWeekyear.get(millis), weekOfWeekyear.get(millis));
            __CLR4_4_112m212m2lc8azwkc.R.inc(50311);assertEquals(1, era.get(millis));
            __CLR4_4_112m212m2lc8azwkc.R.inc(50312);int yearValue = gjYear.get(millis);
            __CLR4_4_112m212m2lc8azwkc.R.inc(50313);if ((((yearValue <= 0)&&(__CLR4_4_112m212m2lc8azwkc.R.iget(50314)!=0|true))||(__CLR4_4_112m212m2lc8azwkc.R.iget(50315)==0&false))) {{
                __CLR4_4_112m212m2lc8azwkc.R.inc(50316);yearValue++;
            }
            }__CLR4_4_112m212m2lc8azwkc.R.inc(50317);yearValue += 543;
            __CLR4_4_112m212m2lc8azwkc.R.inc(50318);assertEquals(yearValue, year.get(millis));
            __CLR4_4_112m212m2lc8azwkc.R.inc(50319);assertEquals(yearValue, yearOfEra.get(millis));
            __CLR4_4_112m212m2lc8azwkc.R.inc(50320);millis += SKIP;
        }
    }}finally{__CLR4_4_112m212m2lc8azwkc.R.flushNeeded();}}

}
