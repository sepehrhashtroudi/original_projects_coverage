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
import org.joda.time.DurationFieldType;
import org.joda.time.DateTime.Property;

/**
 * This class is a Junit unit test for IslamicChronology.
 *
 * @author Stephen Colebourne
 */
@java.lang.SuppressWarnings({"fallthrough"}) public class TestIslamicChronology extends TestCase {static class __CLR4_4_1147z147zlc8azwqz{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672271031490L,8589935092L,52711,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static long SKIP = 1 * DateTimeConstants.MILLIS_PER_DAY;

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    private static final DateTimeZone TOKYO = DateTimeZone.forID("Asia/Tokyo");
    private static final Chronology ISLAMIC_UTC = IslamicChronology.getInstanceUTC();
    private static final Chronology JULIAN_UTC = JulianChronology.getInstanceUTC();
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

    public static void main(String[] args) {try{__CLR4_4_1147z147zlc8azwqz.R.inc(52127);
        __CLR4_4_1147z147zlc8azwqz.R.inc(52128);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1147z147zlc8azwqz.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1147z147zlc8azwqz.R.inc(52129);
        __CLR4_4_1147z147zlc8azwqz.R.inc(52130);SKIP = 1 * DateTimeConstants.MILLIS_PER_DAY;
        __CLR4_4_1147z147zlc8azwqz.R.inc(52131);return new TestSuite(TestIslamicChronology.class);
    }finally{__CLR4_4_1147z147zlc8azwqz.R.flushNeeded();}}

    public TestIslamicChronology(String name) {
        super(name);__CLR4_4_1147z147zlc8azwqz.R.inc(52133);try{__CLR4_4_1147z147zlc8azwqz.R.inc(52132);
    }finally{__CLR4_4_1147z147zlc8azwqz.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1147z147zlc8azwqz.R.inc(52134);
        __CLR4_4_1147z147zlc8azwqz.R.inc(52135);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1147z147zlc8azwqz.R.inc(52136);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1147z147zlc8azwqz.R.inc(52137);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1147z147zlc8azwqz.R.inc(52138);originalLocale = Locale.getDefault();
        __CLR4_4_1147z147zlc8azwqz.R.inc(52139);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1147z147zlc8azwqz.R.inc(52140);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1147z147zlc8azwqz.R.inc(52141);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1147z147zlc8azwqz.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1147z147zlc8azwqz.R.inc(52142);
        __CLR4_4_1147z147zlc8azwqz.R.inc(52143);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1147z147zlc8azwqz.R.inc(52144);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1147z147zlc8azwqz.R.inc(52145);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1147z147zlc8azwqz.R.inc(52146);Locale.setDefault(originalLocale);
        __CLR4_4_1147z147zlc8azwqz.R.inc(52147);originalDateTimeZone = null;
        __CLR4_4_1147z147zlc8azwqz.R.inc(52148);originalTimeZone = null;
        __CLR4_4_1147z147zlc8azwqz.R.inc(52149);originalLocale = null;
    }finally{__CLR4_4_1147z147zlc8azwqz.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testFactoryUTC() {__CLR4_4_1147z147zlc8azwqz.R.globalSliceStart(getClass().getName(),52150);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19knvhv148m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1147z147zlc8azwqz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1147z147zlc8azwqz.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestIslamicChronology.testFactoryUTC",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),52150,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19knvhv148m(){try{__CLR4_4_1147z147zlc8azwqz.R.inc(52150);
        __CLR4_4_1147z147zlc8azwqz.R.inc(52151);assertEquals(DateTimeZone.UTC, IslamicChronology.getInstanceUTC().getZone());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52152);assertSame(IslamicChronology.class, IslamicChronology.getInstanceUTC().getClass());
    }finally{__CLR4_4_1147z147zlc8azwqz.R.flushNeeded();}}

    public void testFactory() {__CLR4_4_1147z147zlc8azwqz.R.globalSliceStart(getClass().getName(),52153);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_116tztt148p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1147z147zlc8azwqz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1147z147zlc8azwqz.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestIslamicChronology.testFactory",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),52153,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_116tztt148p(){try{__CLR4_4_1147z147zlc8azwqz.R.inc(52153);
        __CLR4_4_1147z147zlc8azwqz.R.inc(52154);assertEquals(LONDON, IslamicChronology.getInstance().getZone());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52155);assertSame(IslamicChronology.class, IslamicChronology.getInstance().getClass());
    }finally{__CLR4_4_1147z147zlc8azwqz.R.flushNeeded();}}

    public void testFactory_Zone() {__CLR4_4_1147z147zlc8azwqz.R.globalSliceStart(getClass().getName(),52156);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yy5ime148s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1147z147zlc8azwqz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1147z147zlc8azwqz.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestIslamicChronology.testFactory_Zone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),52156,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yy5ime148s(){try{__CLR4_4_1147z147zlc8azwqz.R.inc(52156);
        __CLR4_4_1147z147zlc8azwqz.R.inc(52157);assertEquals(TOKYO, IslamicChronology.getInstance(TOKYO).getZone());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52158);assertEquals(PARIS, IslamicChronology.getInstance(PARIS).getZone());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52159);assertEquals(LONDON, IslamicChronology.getInstance(null).getZone());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52160);assertSame(IslamicChronology.class, IslamicChronology.getInstance(TOKYO).getClass());
    }finally{__CLR4_4_1147z147zlc8azwqz.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testEquality() {__CLR4_4_1147z147zlc8azwqz.R.globalSliceStart(getClass().getName(),52161);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12agdql148x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1147z147zlc8azwqz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1147z147zlc8azwqz.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestIslamicChronology.testEquality",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),52161,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12agdql148x(){try{__CLR4_4_1147z147zlc8azwqz.R.inc(52161);
        __CLR4_4_1147z147zlc8azwqz.R.inc(52162);assertSame(IslamicChronology.getInstance(TOKYO), IslamicChronology.getInstance(TOKYO));
        __CLR4_4_1147z147zlc8azwqz.R.inc(52163);assertSame(IslamicChronology.getInstance(LONDON), IslamicChronology.getInstance(LONDON));
        __CLR4_4_1147z147zlc8azwqz.R.inc(52164);assertSame(IslamicChronology.getInstance(PARIS), IslamicChronology.getInstance(PARIS));
        __CLR4_4_1147z147zlc8azwqz.R.inc(52165);assertSame(IslamicChronology.getInstanceUTC(), IslamicChronology.getInstanceUTC());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52166);assertSame(IslamicChronology.getInstance(), IslamicChronology.getInstance(LONDON));
    }finally{__CLR4_4_1147z147zlc8azwqz.R.flushNeeded();}}

    public void testWithUTC() {__CLR4_4_1147z147zlc8azwqz.R.globalSliceStart(getClass().getName(),52167);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19orv831493();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1147z147zlc8azwqz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1147z147zlc8azwqz.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestIslamicChronology.testWithUTC",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),52167,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19orv831493(){try{__CLR4_4_1147z147zlc8azwqz.R.inc(52167);
        __CLR4_4_1147z147zlc8azwqz.R.inc(52168);assertSame(IslamicChronology.getInstanceUTC(), IslamicChronology.getInstance(LONDON).withUTC());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52169);assertSame(IslamicChronology.getInstanceUTC(), IslamicChronology.getInstance(TOKYO).withUTC());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52170);assertSame(IslamicChronology.getInstanceUTC(), IslamicChronology.getInstanceUTC().withUTC());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52171);assertSame(IslamicChronology.getInstanceUTC(), IslamicChronology.getInstance().withUTC());
    }finally{__CLR4_4_1147z147zlc8azwqz.R.flushNeeded();}}

    public void testWithZone() {__CLR4_4_1147z147zlc8azwqz.R.globalSliceStart(getClass().getName(),52172);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1me3iet1498();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1147z147zlc8azwqz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1147z147zlc8azwqz.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestIslamicChronology.testWithZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),52172,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1me3iet1498(){try{__CLR4_4_1147z147zlc8azwqz.R.inc(52172);
        __CLR4_4_1147z147zlc8azwqz.R.inc(52173);assertSame(IslamicChronology.getInstance(TOKYO), IslamicChronology.getInstance(TOKYO).withZone(TOKYO));
        __CLR4_4_1147z147zlc8azwqz.R.inc(52174);assertSame(IslamicChronology.getInstance(LONDON), IslamicChronology.getInstance(TOKYO).withZone(LONDON));
        __CLR4_4_1147z147zlc8azwqz.R.inc(52175);assertSame(IslamicChronology.getInstance(PARIS), IslamicChronology.getInstance(TOKYO).withZone(PARIS));
        __CLR4_4_1147z147zlc8azwqz.R.inc(52176);assertSame(IslamicChronology.getInstance(LONDON), IslamicChronology.getInstance(TOKYO).withZone(null));
        __CLR4_4_1147z147zlc8azwqz.R.inc(52177);assertSame(IslamicChronology.getInstance(PARIS), IslamicChronology.getInstance().withZone(PARIS));
        __CLR4_4_1147z147zlc8azwqz.R.inc(52178);assertSame(IslamicChronology.getInstance(PARIS), IslamicChronology.getInstanceUTC().withZone(PARIS));
    }finally{__CLR4_4_1147z147zlc8azwqz.R.flushNeeded();}}

    public void testToString() {__CLR4_4_1147z147zlc8azwqz.R.globalSliceStart(getClass().getName(),52179);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hrxdid149f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1147z147zlc8azwqz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1147z147zlc8azwqz.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestIslamicChronology.testToString",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),52179,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hrxdid149f(){try{__CLR4_4_1147z147zlc8azwqz.R.inc(52179);
        __CLR4_4_1147z147zlc8azwqz.R.inc(52180);assertEquals("IslamicChronology[Europe/London]", IslamicChronology.getInstance(LONDON).toString());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52181);assertEquals("IslamicChronology[Asia/Tokyo]", IslamicChronology.getInstance(TOKYO).toString());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52182);assertEquals("IslamicChronology[Europe/London]", IslamicChronology.getInstance().toString());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52183);assertEquals("IslamicChronology[UTC]", IslamicChronology.getInstanceUTC().toString());
    }finally{__CLR4_4_1147z147zlc8azwqz.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testDurationFields() {__CLR4_4_1147z147zlc8azwqz.R.globalSliceStart(getClass().getName(),52184);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cnkzye149k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1147z147zlc8azwqz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1147z147zlc8azwqz.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestIslamicChronology.testDurationFields",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),52184,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cnkzye149k(){try{__CLR4_4_1147z147zlc8azwqz.R.inc(52184);
        __CLR4_4_1147z147zlc8azwqz.R.inc(52185);final IslamicChronology islamic = IslamicChronology.getInstance();
        __CLR4_4_1147z147zlc8azwqz.R.inc(52186);assertEquals("eras", islamic.eras().getName());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52187);assertEquals("centuries", islamic.centuries().getName());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52188);assertEquals("years", islamic.years().getName());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52189);assertEquals("weekyears", islamic.weekyears().getName());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52190);assertEquals("months", islamic.months().getName());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52191);assertEquals("weeks", islamic.weeks().getName());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52192);assertEquals("days", islamic.days().getName());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52193);assertEquals("halfdays", islamic.halfdays().getName());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52194);assertEquals("hours", islamic.hours().getName());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52195);assertEquals("minutes", islamic.minutes().getName());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52196);assertEquals("seconds", islamic.seconds().getName());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52197);assertEquals("millis", islamic.millis().getName());
        
        __CLR4_4_1147z147zlc8azwqz.R.inc(52198);assertEquals(false, islamic.eras().isSupported());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52199);assertEquals(true, islamic.centuries().isSupported());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52200);assertEquals(true, islamic.years().isSupported());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52201);assertEquals(true, islamic.weekyears().isSupported());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52202);assertEquals(true, islamic.months().isSupported());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52203);assertEquals(true, islamic.weeks().isSupported());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52204);assertEquals(true, islamic.days().isSupported());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52205);assertEquals(true, islamic.halfdays().isSupported());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52206);assertEquals(true, islamic.hours().isSupported());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52207);assertEquals(true, islamic.minutes().isSupported());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52208);assertEquals(true, islamic.seconds().isSupported());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52209);assertEquals(true, islamic.millis().isSupported());
        
        __CLR4_4_1147z147zlc8azwqz.R.inc(52210);assertEquals(false, islamic.centuries().isPrecise());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52211);assertEquals(false, islamic.years().isPrecise());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52212);assertEquals(false, islamic.weekyears().isPrecise());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52213);assertEquals(false, islamic.months().isPrecise());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52214);assertEquals(false, islamic.weeks().isPrecise());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52215);assertEquals(false, islamic.days().isPrecise());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52216);assertEquals(false, islamic.halfdays().isPrecise());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52217);assertEquals(true, islamic.hours().isPrecise());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52218);assertEquals(true, islamic.minutes().isPrecise());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52219);assertEquals(true, islamic.seconds().isPrecise());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52220);assertEquals(true, islamic.millis().isPrecise());
        
        __CLR4_4_1147z147zlc8azwqz.R.inc(52221);final IslamicChronology islamicUTC = IslamicChronology.getInstanceUTC();
        __CLR4_4_1147z147zlc8azwqz.R.inc(52222);assertEquals(false, islamicUTC.centuries().isPrecise());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52223);assertEquals(false, islamicUTC.years().isPrecise());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52224);assertEquals(false, islamicUTC.weekyears().isPrecise());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52225);assertEquals(false, islamicUTC.months().isPrecise());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52226);assertEquals(true, islamicUTC.weeks().isPrecise());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52227);assertEquals(true, islamicUTC.days().isPrecise());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52228);assertEquals(true, islamicUTC.halfdays().isPrecise());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52229);assertEquals(true, islamicUTC.hours().isPrecise());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52230);assertEquals(true, islamicUTC.minutes().isPrecise());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52231);assertEquals(true, islamicUTC.seconds().isPrecise());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52232);assertEquals(true, islamicUTC.millis().isPrecise());
        
        __CLR4_4_1147z147zlc8azwqz.R.inc(52233);final DateTimeZone gmt = DateTimeZone.forID("Etc/GMT");
        __CLR4_4_1147z147zlc8azwqz.R.inc(52234);final IslamicChronology islamicGMT = IslamicChronology.getInstance(gmt);
        __CLR4_4_1147z147zlc8azwqz.R.inc(52235);assertEquals(false, islamicGMT.centuries().isPrecise());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52236);assertEquals(false, islamicGMT.years().isPrecise());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52237);assertEquals(false, islamicGMT.weekyears().isPrecise());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52238);assertEquals(false, islamicGMT.months().isPrecise());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52239);assertEquals(true, islamicGMT.weeks().isPrecise());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52240);assertEquals(true, islamicGMT.days().isPrecise());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52241);assertEquals(true, islamicGMT.halfdays().isPrecise());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52242);assertEquals(true, islamicGMT.hours().isPrecise());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52243);assertEquals(true, islamicGMT.minutes().isPrecise());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52244);assertEquals(true, islamicGMT.seconds().isPrecise());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52245);assertEquals(true, islamicGMT.millis().isPrecise());
    }finally{__CLR4_4_1147z147zlc8azwqz.R.flushNeeded();}}

    public void testDateFields() {__CLR4_4_1147z147zlc8azwqz.R.globalSliceStart(getClass().getName(),52246);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gkspeo14ba();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1147z147zlc8azwqz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1147z147zlc8azwqz.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestIslamicChronology.testDateFields",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),52246,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gkspeo14ba(){try{__CLR4_4_1147z147zlc8azwqz.R.inc(52246);
        __CLR4_4_1147z147zlc8azwqz.R.inc(52247);final IslamicChronology islamic = IslamicChronology.getInstance();
        __CLR4_4_1147z147zlc8azwqz.R.inc(52248);assertEquals("era", islamic.era().getName());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52249);assertEquals("centuryOfEra", islamic.centuryOfEra().getName());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52250);assertEquals("yearOfCentury", islamic.yearOfCentury().getName());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52251);assertEquals("yearOfEra", islamic.yearOfEra().getName());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52252);assertEquals("year", islamic.year().getName());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52253);assertEquals("monthOfYear", islamic.monthOfYear().getName());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52254);assertEquals("weekyearOfCentury", islamic.weekyearOfCentury().getName());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52255);assertEquals("weekyear", islamic.weekyear().getName());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52256);assertEquals("weekOfWeekyear", islamic.weekOfWeekyear().getName());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52257);assertEquals("dayOfYear", islamic.dayOfYear().getName());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52258);assertEquals("dayOfMonth", islamic.dayOfMonth().getName());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52259);assertEquals("dayOfWeek", islamic.dayOfWeek().getName());
        
        __CLR4_4_1147z147zlc8azwqz.R.inc(52260);assertEquals(true, islamic.era().isSupported());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52261);assertEquals(true, islamic.centuryOfEra().isSupported());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52262);assertEquals(true, islamic.yearOfCentury().isSupported());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52263);assertEquals(true, islamic.yearOfEra().isSupported());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52264);assertEquals(true, islamic.year().isSupported());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52265);assertEquals(true, islamic.monthOfYear().isSupported());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52266);assertEquals(true, islamic.weekyearOfCentury().isSupported());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52267);assertEquals(true, islamic.weekyear().isSupported());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52268);assertEquals(true, islamic.weekOfWeekyear().isSupported());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52269);assertEquals(true, islamic.dayOfYear().isSupported());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52270);assertEquals(true, islamic.dayOfMonth().isSupported());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52271);assertEquals(true, islamic.dayOfWeek().isSupported());
        
        __CLR4_4_1147z147zlc8azwqz.R.inc(52272);assertEquals(islamic.eras(), islamic.era().getDurationField());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52273);assertEquals(islamic.centuries(), islamic.centuryOfEra().getDurationField());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52274);assertEquals(islamic.years(), islamic.yearOfCentury().getDurationField());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52275);assertEquals(islamic.years(), islamic.yearOfEra().getDurationField());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52276);assertEquals(islamic.years(), islamic.year().getDurationField());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52277);assertEquals(islamic.months(), islamic.monthOfYear().getDurationField());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52278);assertEquals(islamic.weekyears(), islamic.weekyearOfCentury().getDurationField());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52279);assertEquals(islamic.weekyears(), islamic.weekyear().getDurationField());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52280);assertEquals(islamic.weeks(), islamic.weekOfWeekyear().getDurationField());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52281);assertEquals(islamic.days(), islamic.dayOfYear().getDurationField());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52282);assertEquals(islamic.days(), islamic.dayOfMonth().getDurationField());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52283);assertEquals(islamic.days(), islamic.dayOfWeek().getDurationField());
        
        __CLR4_4_1147z147zlc8azwqz.R.inc(52284);assertEquals(null, islamic.era().getRangeDurationField());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52285);assertEquals(islamic.eras(), islamic.centuryOfEra().getRangeDurationField());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52286);assertEquals(islamic.centuries(), islamic.yearOfCentury().getRangeDurationField());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52287);assertEquals(islamic.eras(), islamic.yearOfEra().getRangeDurationField());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52288);assertEquals(null, islamic.year().getRangeDurationField());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52289);assertEquals(islamic.years(), islamic.monthOfYear().getRangeDurationField());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52290);assertEquals(islamic.centuries(), islamic.weekyearOfCentury().getRangeDurationField());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52291);assertEquals(null, islamic.weekyear().getRangeDurationField());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52292);assertEquals(islamic.weekyears(), islamic.weekOfWeekyear().getRangeDurationField());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52293);assertEquals(islamic.years(), islamic.dayOfYear().getRangeDurationField());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52294);assertEquals(islamic.months(), islamic.dayOfMonth().getRangeDurationField());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52295);assertEquals(islamic.weeks(), islamic.dayOfWeek().getRangeDurationField());
    }finally{__CLR4_4_1147z147zlc8azwqz.R.flushNeeded();}}

    public void testTimeFields() {__CLR4_4_1147z147zlc8azwqz.R.globalSliceStart(getClass().getName(),52296);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11r11up14co();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1147z147zlc8azwqz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1147z147zlc8azwqz.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestIslamicChronology.testTimeFields",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),52296,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11r11up14co(){try{__CLR4_4_1147z147zlc8azwqz.R.inc(52296);
        __CLR4_4_1147z147zlc8azwqz.R.inc(52297);final IslamicChronology islamic = IslamicChronology.getInstance();
        __CLR4_4_1147z147zlc8azwqz.R.inc(52298);assertEquals("halfdayOfDay", islamic.halfdayOfDay().getName());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52299);assertEquals("clockhourOfHalfday", islamic.clockhourOfHalfday().getName());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52300);assertEquals("hourOfHalfday", islamic.hourOfHalfday().getName());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52301);assertEquals("clockhourOfDay", islamic.clockhourOfDay().getName());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52302);assertEquals("hourOfDay", islamic.hourOfDay().getName());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52303);assertEquals("minuteOfDay", islamic.minuteOfDay().getName());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52304);assertEquals("minuteOfHour", islamic.minuteOfHour().getName());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52305);assertEquals("secondOfDay", islamic.secondOfDay().getName());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52306);assertEquals("secondOfMinute", islamic.secondOfMinute().getName());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52307);assertEquals("millisOfDay", islamic.millisOfDay().getName());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52308);assertEquals("millisOfSecond", islamic.millisOfSecond().getName());
        
        __CLR4_4_1147z147zlc8azwqz.R.inc(52309);assertEquals(true, islamic.halfdayOfDay().isSupported());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52310);assertEquals(true, islamic.clockhourOfHalfday().isSupported());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52311);assertEquals(true, islamic.hourOfHalfday().isSupported());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52312);assertEquals(true, islamic.clockhourOfDay().isSupported());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52313);assertEquals(true, islamic.hourOfDay().isSupported());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52314);assertEquals(true, islamic.minuteOfDay().isSupported());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52315);assertEquals(true, islamic.minuteOfHour().isSupported());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52316);assertEquals(true, islamic.secondOfDay().isSupported());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52317);assertEquals(true, islamic.secondOfMinute().isSupported());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52318);assertEquals(true, islamic.millisOfDay().isSupported());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52319);assertEquals(true, islamic.millisOfSecond().isSupported());
    }finally{__CLR4_4_1147z147zlc8azwqz.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testEpoch() {__CLR4_4_1147z147zlc8azwqz.R.globalSliceStart(getClass().getName(),52320);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19p7wci14dc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1147z147zlc8azwqz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1147z147zlc8azwqz.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestIslamicChronology.testEpoch",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),52320,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19p7wci14dc(){try{__CLR4_4_1147z147zlc8azwqz.R.inc(52320);
        __CLR4_4_1147z147zlc8azwqz.R.inc(52321);DateTime epoch = new DateTime(1, 1, 1, 0, 0, 0, 0, ISLAMIC_UTC);
        __CLR4_4_1147z147zlc8azwqz.R.inc(52322);DateTime expectedEpoch = new DateTime(622, 7, 16, 0, 0, 0, 0, JULIAN_UTC);
        __CLR4_4_1147z147zlc8azwqz.R.inc(52323);assertEquals(expectedEpoch.getMillis(), epoch.getMillis());
    }finally{__CLR4_4_1147z147zlc8azwqz.R.flushNeeded();}}

    public void testEra() {__CLR4_4_1147z147zlc8azwqz.R.globalSliceStart(getClass().getName(),52324);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13euvzd14dg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1147z147zlc8azwqz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1147z147zlc8azwqz.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestIslamicChronology.testEra",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),52324,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13euvzd14dg(){try{__CLR4_4_1147z147zlc8azwqz.R.inc(52324);
        __CLR4_4_1147z147zlc8azwqz.R.inc(52325);assertEquals(1, IslamicChronology.AH);
        __CLR4_4_1147z147zlc8azwqz.R.inc(52326);try {
            __CLR4_4_1147z147zlc8azwqz.R.inc(52327);new DateTime(-1, 13, 5, 0, 0, 0, 0, ISLAMIC_UTC);
            __CLR4_4_1147z147zlc8azwqz.R.inc(52328);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1147z147zlc8azwqz.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testFieldConstructor() {__CLR4_4_1147z147zlc8azwqz.R.globalSliceStart(getClass().getName(),52329);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1suazq114dl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1147z147zlc8azwqz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1147z147zlc8azwqz.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestIslamicChronology.testFieldConstructor",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),52329,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1suazq114dl(){try{__CLR4_4_1147z147zlc8azwqz.R.inc(52329);
        __CLR4_4_1147z147zlc8azwqz.R.inc(52330);DateTime date = new DateTime(1364, 12, 6, 0, 0, 0, 0, ISLAMIC_UTC);
        __CLR4_4_1147z147zlc8azwqz.R.inc(52331);DateTime expectedDate = new DateTime(1945, 11, 12, 0, 0, 0, 0, ISO_UTC);
        __CLR4_4_1147z147zlc8azwqz.R.inc(52332);assertEquals(expectedDate.getMillis(), date.getMillis());
    }finally{__CLR4_4_1147z147zlc8azwqz.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Tests era, year, monthOfYear, dayOfMonth and dayOfWeek.
     */
    public void testCalendar() {__CLR4_4_1147z147zlc8azwqz.R.globalSliceStart(getClass().getName(),52333);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1odnsqf14dp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1147z147zlc8azwqz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1147z147zlc8azwqz.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestIslamicChronology.testCalendar",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),52333,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1odnsqf14dp(){try{__CLR4_4_1147z147zlc8azwqz.R.inc(52333);
        __CLR4_4_1147z147zlc8azwqz.R.inc(52334);if ((((TestAll.FAST)&&(__CLR4_4_1147z147zlc8azwqz.R.iget(52335)!=0|true))||(__CLR4_4_1147z147zlc8azwqz.R.iget(52336)==0&false))) {{
            __CLR4_4_1147z147zlc8azwqz.R.inc(52337);return;
        }
        }__CLR4_4_1147z147zlc8azwqz.R.inc(52338);System.out.println("\nTestIslamicChronology.testCalendar");
        __CLR4_4_1147z147zlc8azwqz.R.inc(52339);DateTime epoch = new DateTime(1, 1, 1, 0, 0, 0, 0, ISLAMIC_UTC);
        __CLR4_4_1147z147zlc8azwqz.R.inc(52340);long millis = epoch.getMillis();
        __CLR4_4_1147z147zlc8azwqz.R.inc(52341);long end = new DateTime(3000, 1, 1, 0, 0, 0, 0, ISO_UTC).getMillis();
        __CLR4_4_1147z147zlc8azwqz.R.inc(52342);DateTimeField dayOfWeek = ISLAMIC_UTC.dayOfWeek();
        __CLR4_4_1147z147zlc8azwqz.R.inc(52343);DateTimeField dayOfYear = ISLAMIC_UTC.dayOfYear();
        __CLR4_4_1147z147zlc8azwqz.R.inc(52344);DateTimeField dayOfMonth = ISLAMIC_UTC.dayOfMonth();
        __CLR4_4_1147z147zlc8azwqz.R.inc(52345);DateTimeField monthOfYear = ISLAMIC_UTC.monthOfYear();
        __CLR4_4_1147z147zlc8azwqz.R.inc(52346);DateTimeField year = ISLAMIC_UTC.year();
        __CLR4_4_1147z147zlc8azwqz.R.inc(52347);DateTimeField yearOfEra = ISLAMIC_UTC.yearOfEra();
        __CLR4_4_1147z147zlc8azwqz.R.inc(52348);DateTimeField era = ISLAMIC_UTC.era();
        __CLR4_4_1147z147zlc8azwqz.R.inc(52349);int expectedDOW = new DateTime(622, 7, 16, 0, 0, 0, 0, JULIAN_UTC).getDayOfWeek();
        __CLR4_4_1147z147zlc8azwqz.R.inc(52350);int expectedDOY = 1;
        __CLR4_4_1147z147zlc8azwqz.R.inc(52351);int expectedDay = 1;
        __CLR4_4_1147z147zlc8azwqz.R.inc(52352);int expectedMonth = 1;
        __CLR4_4_1147z147zlc8azwqz.R.inc(52353);int expectedYear = 1;
        __CLR4_4_1147z147zlc8azwqz.R.inc(52354);while ((((millis < end)&&(__CLR4_4_1147z147zlc8azwqz.R.iget(52355)!=0|true))||(__CLR4_4_1147z147zlc8azwqz.R.iget(52356)==0&false))) {{
            __CLR4_4_1147z147zlc8azwqz.R.inc(52357);int dowValue = dayOfWeek.get(millis);
            __CLR4_4_1147z147zlc8azwqz.R.inc(52358);int doyValue = dayOfYear.get(millis);
            __CLR4_4_1147z147zlc8azwqz.R.inc(52359);int dayValue = dayOfMonth.get(millis);
            __CLR4_4_1147z147zlc8azwqz.R.inc(52360);int monthValue = monthOfYear.get(millis);
            __CLR4_4_1147z147zlc8azwqz.R.inc(52361);int yearValue = year.get(millis);
            __CLR4_4_1147z147zlc8azwqz.R.inc(52362);int yearOfEraValue = yearOfEra.get(millis);
            __CLR4_4_1147z147zlc8azwqz.R.inc(52363);int dayOfYearLen = dayOfYear.getMaximumValue(millis);
            __CLR4_4_1147z147zlc8azwqz.R.inc(52364);int monthLen = dayOfMonth.getMaximumValue(millis);
            __CLR4_4_1147z147zlc8azwqz.R.inc(52365);if ((((monthValue < 1 || monthValue > 12)&&(__CLR4_4_1147z147zlc8azwqz.R.iget(52366)!=0|true))||(__CLR4_4_1147z147zlc8azwqz.R.iget(52367)==0&false))) {{
                __CLR4_4_1147z147zlc8azwqz.R.inc(52368);fail("Bad month: " + millis);
            }
            
            // test era
            }__CLR4_4_1147z147zlc8azwqz.R.inc(52369);assertEquals(1, era.get(millis));
            __CLR4_4_1147z147zlc8azwqz.R.inc(52370);assertEquals("AH", era.getAsText(millis));
            __CLR4_4_1147z147zlc8azwqz.R.inc(52371);assertEquals("AH", era.getAsShortText(millis));
            
            // test date
            __CLR4_4_1147z147zlc8azwqz.R.inc(52372);assertEquals(expectedDOY, doyValue);
            __CLR4_4_1147z147zlc8azwqz.R.inc(52373);assertEquals(expectedMonth, monthValue);
            __CLR4_4_1147z147zlc8azwqz.R.inc(52374);assertEquals(expectedDay, dayValue);
            __CLR4_4_1147z147zlc8azwqz.R.inc(52375);assertEquals(expectedDOW, dowValue);
            __CLR4_4_1147z147zlc8azwqz.R.inc(52376);assertEquals(expectedYear, yearValue);
            __CLR4_4_1147z147zlc8azwqz.R.inc(52377);assertEquals(expectedYear, yearOfEraValue);
            
            // test leap year
            __CLR4_4_1147z147zlc8azwqz.R.inc(52378);boolean leap = ((11 * yearValue + 14) % 30) < 11;
            __CLR4_4_1147z147zlc8azwqz.R.inc(52379);assertEquals(leap, year.isLeap(millis));
            
            // test month length
            boolean __CLB4_4_1_bool0=false;__CLR4_4_1147z147zlc8azwqz.R.inc(52380);switch (monthValue) {
                case 1:if (!__CLB4_4_1_bool0) {__CLR4_4_1147z147zlc8azwqz.R.inc(52381);__CLB4_4_1_bool0=true;}
                case 3:if (!__CLB4_4_1_bool0) {__CLR4_4_1147z147zlc8azwqz.R.inc(52382);__CLB4_4_1_bool0=true;}
                case 5:if (!__CLB4_4_1_bool0) {__CLR4_4_1147z147zlc8azwqz.R.inc(52383);__CLB4_4_1_bool0=true;}
                case 7:if (!__CLB4_4_1_bool0) {__CLR4_4_1147z147zlc8azwqz.R.inc(52384);__CLB4_4_1_bool0=true;}
                case 9:if (!__CLB4_4_1_bool0) {__CLR4_4_1147z147zlc8azwqz.R.inc(52385);__CLB4_4_1_bool0=true;}
                case 11:if (!__CLB4_4_1_bool0) {__CLR4_4_1147z147zlc8azwqz.R.inc(52386);__CLB4_4_1_bool0=true;}
                    __CLR4_4_1147z147zlc8azwqz.R.inc(52387);assertEquals(30, monthLen);
                    __CLR4_4_1147z147zlc8azwqz.R.inc(52388);break;
                case 2:if (!__CLB4_4_1_bool0) {__CLR4_4_1147z147zlc8azwqz.R.inc(52389);__CLB4_4_1_bool0=true;}
                case 4:if (!__CLB4_4_1_bool0) {__CLR4_4_1147z147zlc8azwqz.R.inc(52390);__CLB4_4_1_bool0=true;}
                case 6:if (!__CLB4_4_1_bool0) {__CLR4_4_1147z147zlc8azwqz.R.inc(52391);__CLB4_4_1_bool0=true;}
                case 8:if (!__CLB4_4_1_bool0) {__CLR4_4_1147z147zlc8azwqz.R.inc(52392);__CLB4_4_1_bool0=true;}
                case 10:if (!__CLB4_4_1_bool0) {__CLR4_4_1147z147zlc8azwqz.R.inc(52393);__CLB4_4_1_bool0=true;}
                    __CLR4_4_1147z147zlc8azwqz.R.inc(52394);assertEquals(29, monthLen);
                    __CLR4_4_1147z147zlc8azwqz.R.inc(52395);break;
                case 12:if (!__CLB4_4_1_bool0) {__CLR4_4_1147z147zlc8azwqz.R.inc(52396);__CLB4_4_1_bool0=true;}
                    __CLR4_4_1147z147zlc8azwqz.R.inc(52397);assertEquals(((((leap )&&(__CLR4_4_1147z147zlc8azwqz.R.iget(52398)!=0|true))||(__CLR4_4_1147z147zlc8azwqz.R.iget(52399)==0&false))? 30 : 29), monthLen);
                    __CLR4_4_1147z147zlc8azwqz.R.inc(52400);break;
            }
            
            // test year length
            __CLR4_4_1147z147zlc8azwqz.R.inc(52401);assertEquals(((((leap )&&(__CLR4_4_1147z147zlc8azwqz.R.iget(52402)!=0|true))||(__CLR4_4_1147z147zlc8azwqz.R.iget(52403)==0&false))? 355 : 354), dayOfYearLen);
            
            // recalculate date
            __CLR4_4_1147z147zlc8azwqz.R.inc(52404);expectedDOW = (((expectedDOW + 1) - 1) % 7) + 1;
            __CLR4_4_1147z147zlc8azwqz.R.inc(52405);expectedDay++;
            __CLR4_4_1147z147zlc8azwqz.R.inc(52406);expectedDOY++;
            __CLR4_4_1147z147zlc8azwqz.R.inc(52407);if ((((expectedDay > monthLen)&&(__CLR4_4_1147z147zlc8azwqz.R.iget(52408)!=0|true))||(__CLR4_4_1147z147zlc8azwqz.R.iget(52409)==0&false))) {{
                __CLR4_4_1147z147zlc8azwqz.R.inc(52410);expectedDay = 1;
                __CLR4_4_1147z147zlc8azwqz.R.inc(52411);expectedMonth++;
                __CLR4_4_1147z147zlc8azwqz.R.inc(52412);if ((((expectedMonth == 13)&&(__CLR4_4_1147z147zlc8azwqz.R.iget(52413)!=0|true))||(__CLR4_4_1147z147zlc8azwqz.R.iget(52414)==0&false))) {{
                    __CLR4_4_1147z147zlc8azwqz.R.inc(52415);expectedMonth = 1;
                    __CLR4_4_1147z147zlc8azwqz.R.inc(52416);expectedDOY = 1;
                    __CLR4_4_1147z147zlc8azwqz.R.inc(52417);expectedYear++;
                }
            }}
            }__CLR4_4_1147z147zlc8azwqz.R.inc(52418);millis += SKIP;
        }
    }}finally{__CLR4_4_1147z147zlc8azwqz.R.flushNeeded();}}

    public void testSampleDate1() {__CLR4_4_1147z147zlc8azwqz.R.globalSliceStart(getClass().getName(),52419);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s1c24y14g3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1147z147zlc8azwqz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1147z147zlc8azwqz.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestIslamicChronology.testSampleDate1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),52419,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s1c24y14g3(){try{__CLR4_4_1147z147zlc8azwqz.R.inc(52419);
        __CLR4_4_1147z147zlc8azwqz.R.inc(52420);DateTime dt = new DateTime(1945, 11, 12, 0, 0, 0, 0, ISO_UTC);
        __CLR4_4_1147z147zlc8azwqz.R.inc(52421);dt = dt.withChronology(ISLAMIC_UTC);
        __CLR4_4_1147z147zlc8azwqz.R.inc(52422);assertEquals(IslamicChronology.AH, dt.getEra());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52423);assertEquals(14, dt.getCenturyOfEra());  // TODO confirm
        __CLR4_4_1147z147zlc8azwqz.R.inc(52424);assertEquals(64, dt.getYearOfCentury());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52425);assertEquals(1364, dt.getYearOfEra());
        
        __CLR4_4_1147z147zlc8azwqz.R.inc(52426);assertEquals(1364, dt.getYear());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52427);Property fld = dt.year();
        __CLR4_4_1147z147zlc8azwqz.R.inc(52428);assertEquals(false, fld.isLeap());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52429);assertEquals(0, fld.getLeapAmount());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52430);assertEquals(DurationFieldType.days(), fld.getLeapDurationField().getType());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52431);assertEquals(new DateTime(1365, 12, 6, 0, 0, 0, 0, ISLAMIC_UTC), fld.addToCopy(1));
        
        __CLR4_4_1147z147zlc8azwqz.R.inc(52432);assertEquals(12, dt.getMonthOfYear());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52433);fld = dt.monthOfYear();
        __CLR4_4_1147z147zlc8azwqz.R.inc(52434);assertEquals(false, fld.isLeap());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52435);assertEquals(0, fld.getLeapAmount());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52436);assertEquals(DurationFieldType.days(), fld.getLeapDurationField().getType());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52437);assertEquals(1, fld.getMinimumValue());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52438);assertEquals(1, fld.getMinimumValueOverall());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52439);assertEquals(12, fld.getMaximumValue());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52440);assertEquals(12, fld.getMaximumValueOverall());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52441);assertEquals(new DateTime(1365, 1, 6, 0, 0, 0, 0, ISLAMIC_UTC), fld.addToCopy(1));
        __CLR4_4_1147z147zlc8azwqz.R.inc(52442);assertEquals(new DateTime(1364, 1, 6, 0, 0, 0, 0, ISLAMIC_UTC), fld.addWrapFieldToCopy(1));
        
        __CLR4_4_1147z147zlc8azwqz.R.inc(52443);assertEquals(6, dt.getDayOfMonth());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52444);fld = dt.dayOfMonth();
        __CLR4_4_1147z147zlc8azwqz.R.inc(52445);assertEquals(false, fld.isLeap());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52446);assertEquals(0, fld.getLeapAmount());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52447);assertEquals(null, fld.getLeapDurationField());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52448);assertEquals(1, fld.getMinimumValue());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52449);assertEquals(1, fld.getMinimumValueOverall());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52450);assertEquals(29, fld.getMaximumValue());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52451);assertEquals(30, fld.getMaximumValueOverall());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52452);assertEquals(new DateTime(1364, 12, 7, 0, 0, 0, 0, ISLAMIC_UTC), fld.addToCopy(1));
        
        __CLR4_4_1147z147zlc8azwqz.R.inc(52453);assertEquals(DateTimeConstants.MONDAY, dt.getDayOfWeek());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52454);fld = dt.dayOfWeek();
        __CLR4_4_1147z147zlc8azwqz.R.inc(52455);assertEquals(false, fld.isLeap());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52456);assertEquals(0, fld.getLeapAmount());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52457);assertEquals(null, fld.getLeapDurationField());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52458);assertEquals(1, fld.getMinimumValue());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52459);assertEquals(1, fld.getMinimumValueOverall());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52460);assertEquals(7, fld.getMaximumValue());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52461);assertEquals(7, fld.getMaximumValueOverall());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52462);assertEquals(new DateTime(1364, 12, 7, 0, 0, 0, 0, ISLAMIC_UTC), fld.addToCopy(1));
        
        __CLR4_4_1147z147zlc8azwqz.R.inc(52463);assertEquals(6 * 30 + 5 * 29 + 6, dt.getDayOfYear());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52464);fld = dt.dayOfYear();
        __CLR4_4_1147z147zlc8azwqz.R.inc(52465);assertEquals(false, fld.isLeap());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52466);assertEquals(0, fld.getLeapAmount());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52467);assertEquals(null, fld.getLeapDurationField());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52468);assertEquals(1, fld.getMinimumValue());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52469);assertEquals(1, fld.getMinimumValueOverall());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52470);assertEquals(354, fld.getMaximumValue());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52471);assertEquals(355, fld.getMaximumValueOverall());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52472);assertEquals(new DateTime(1364, 12, 7, 0, 0, 0, 0, ISLAMIC_UTC), fld.addToCopy(1));
        
        __CLR4_4_1147z147zlc8azwqz.R.inc(52473);assertEquals(0, dt.getHourOfDay());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52474);assertEquals(0, dt.getMinuteOfHour());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52475);assertEquals(0, dt.getSecondOfMinute());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52476);assertEquals(0, dt.getMillisOfSecond());
    }finally{__CLR4_4_1147z147zlc8azwqz.R.flushNeeded();}}

    public void testSampleDate2() {__CLR4_4_1147z147zlc8azwqz.R.globalSliceStart(getClass().getName(),52477);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1osc3ch14hp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1147z147zlc8azwqz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1147z147zlc8azwqz.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestIslamicChronology.testSampleDate2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),52477,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1osc3ch14hp(){try{__CLR4_4_1147z147zlc8azwqz.R.inc(52477);
        __CLR4_4_1147z147zlc8azwqz.R.inc(52478);DateTime dt = new DateTime(2005, 11, 26, 0, 0, 0, 0, ISO_UTC);
        __CLR4_4_1147z147zlc8azwqz.R.inc(52479);dt = dt.withChronology(ISLAMIC_UTC);
        __CLR4_4_1147z147zlc8azwqz.R.inc(52480);assertEquals(IslamicChronology.AH, dt.getEra());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52481);assertEquals(15, dt.getCenturyOfEra());  // TODO confirm
        __CLR4_4_1147z147zlc8azwqz.R.inc(52482);assertEquals(26, dt.getYearOfCentury());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52483);assertEquals(1426, dt.getYearOfEra());
        
        __CLR4_4_1147z147zlc8azwqz.R.inc(52484);assertEquals(1426, dt.getYear());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52485);Property fld = dt.year();
        __CLR4_4_1147z147zlc8azwqz.R.inc(52486);assertEquals(true, fld.isLeap());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52487);assertEquals(1, fld.getLeapAmount());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52488);assertEquals(DurationFieldType.days(), fld.getLeapDurationField().getType());
        
        __CLR4_4_1147z147zlc8azwqz.R.inc(52489);assertEquals(10, dt.getMonthOfYear());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52490);fld = dt.monthOfYear();
        __CLR4_4_1147z147zlc8azwqz.R.inc(52491);assertEquals(false, fld.isLeap());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52492);assertEquals(0, fld.getLeapAmount());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52493);assertEquals(DurationFieldType.days(), fld.getLeapDurationField().getType());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52494);assertEquals(1, fld.getMinimumValue());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52495);assertEquals(1, fld.getMinimumValueOverall());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52496);assertEquals(12, fld.getMaximumValue());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52497);assertEquals(12, fld.getMaximumValueOverall());
        
        __CLR4_4_1147z147zlc8azwqz.R.inc(52498);assertEquals(24, dt.getDayOfMonth());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52499);fld = dt.dayOfMonth();
        __CLR4_4_1147z147zlc8azwqz.R.inc(52500);assertEquals(false, fld.isLeap());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52501);assertEquals(0, fld.getLeapAmount());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52502);assertEquals(null, fld.getLeapDurationField());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52503);assertEquals(1, fld.getMinimumValue());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52504);assertEquals(1, fld.getMinimumValueOverall());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52505);assertEquals(29, fld.getMaximumValue());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52506);assertEquals(30, fld.getMaximumValueOverall());
        
        __CLR4_4_1147z147zlc8azwqz.R.inc(52507);assertEquals(DateTimeConstants.SATURDAY, dt.getDayOfWeek());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52508);fld = dt.dayOfWeek();
        __CLR4_4_1147z147zlc8azwqz.R.inc(52509);assertEquals(false, fld.isLeap());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52510);assertEquals(0, fld.getLeapAmount());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52511);assertEquals(null, fld.getLeapDurationField());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52512);assertEquals(1, fld.getMinimumValue());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52513);assertEquals(1, fld.getMinimumValueOverall());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52514);assertEquals(7, fld.getMaximumValue());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52515);assertEquals(7, fld.getMaximumValueOverall());
        
        __CLR4_4_1147z147zlc8azwqz.R.inc(52516);assertEquals(5 * 30 + 4 * 29 + 24, dt.getDayOfYear());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52517);fld = dt.dayOfYear();
        __CLR4_4_1147z147zlc8azwqz.R.inc(52518);assertEquals(false, fld.isLeap());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52519);assertEquals(0, fld.getLeapAmount());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52520);assertEquals(null, fld.getLeapDurationField());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52521);assertEquals(1, fld.getMinimumValue());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52522);assertEquals(1, fld.getMinimumValueOverall());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52523);assertEquals(355, fld.getMaximumValue());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52524);assertEquals(355, fld.getMaximumValueOverall());
        
        __CLR4_4_1147z147zlc8azwqz.R.inc(52525);assertEquals(0, dt.getHourOfDay());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52526);assertEquals(0, dt.getMinuteOfHour());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52527);assertEquals(0, dt.getSecondOfMinute());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52528);assertEquals(0, dt.getMillisOfSecond());
    }finally{__CLR4_4_1147z147zlc8azwqz.R.flushNeeded();}}

    public void testSampleDate3() {__CLR4_4_1147z147zlc8azwqz.R.globalSliceStart(getClass().getName(),52529);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ljc4k014j5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1147z147zlc8azwqz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1147z147zlc8azwqz.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestIslamicChronology.testSampleDate3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),52529,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ljc4k014j5(){try{__CLR4_4_1147z147zlc8azwqz.R.inc(52529);
        __CLR4_4_1147z147zlc8azwqz.R.inc(52530);DateTime dt = new DateTime(1426, 12, 24, 0, 0, 0, 0, ISLAMIC_UTC);
        __CLR4_4_1147z147zlc8azwqz.R.inc(52531);assertEquals(IslamicChronology.AH, dt.getEra());
        
        __CLR4_4_1147z147zlc8azwqz.R.inc(52532);assertEquals(1426, dt.getYear());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52533);Property fld = dt.year();
        __CLR4_4_1147z147zlc8azwqz.R.inc(52534);assertEquals(true, fld.isLeap());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52535);assertEquals(1, fld.getLeapAmount());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52536);assertEquals(DurationFieldType.days(), fld.getLeapDurationField().getType());
        
        __CLR4_4_1147z147zlc8azwqz.R.inc(52537);assertEquals(12, dt.getMonthOfYear());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52538);fld = dt.monthOfYear();
        __CLR4_4_1147z147zlc8azwqz.R.inc(52539);assertEquals(true, fld.isLeap());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52540);assertEquals(1, fld.getLeapAmount());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52541);assertEquals(DurationFieldType.days(), fld.getLeapDurationField().getType());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52542);assertEquals(1, fld.getMinimumValue());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52543);assertEquals(1, fld.getMinimumValueOverall());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52544);assertEquals(12, fld.getMaximumValue());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52545);assertEquals(12, fld.getMaximumValueOverall());
        
        __CLR4_4_1147z147zlc8azwqz.R.inc(52546);assertEquals(24, dt.getDayOfMonth());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52547);fld = dt.dayOfMonth();
        __CLR4_4_1147z147zlc8azwqz.R.inc(52548);assertEquals(false, fld.isLeap());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52549);assertEquals(0, fld.getLeapAmount());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52550);assertEquals(null, fld.getLeapDurationField());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52551);assertEquals(1, fld.getMinimumValue());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52552);assertEquals(1, fld.getMinimumValueOverall());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52553);assertEquals(30, fld.getMaximumValue());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52554);assertEquals(30, fld.getMaximumValueOverall());
        
        __CLR4_4_1147z147zlc8azwqz.R.inc(52555);assertEquals(DateTimeConstants.TUESDAY, dt.getDayOfWeek());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52556);fld = dt.dayOfWeek();
        __CLR4_4_1147z147zlc8azwqz.R.inc(52557);assertEquals(false, fld.isLeap());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52558);assertEquals(0, fld.getLeapAmount());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52559);assertEquals(null, fld.getLeapDurationField());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52560);assertEquals(1, fld.getMinimumValue());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52561);assertEquals(1, fld.getMinimumValueOverall());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52562);assertEquals(7, fld.getMaximumValue());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52563);assertEquals(7, fld.getMaximumValueOverall());
        
        __CLR4_4_1147z147zlc8azwqz.R.inc(52564);assertEquals(6 * 30 + 5 * 29 + 24, dt.getDayOfYear());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52565);fld = dt.dayOfYear();
        __CLR4_4_1147z147zlc8azwqz.R.inc(52566);assertEquals(false, fld.isLeap());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52567);assertEquals(0, fld.getLeapAmount());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52568);assertEquals(null, fld.getLeapDurationField());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52569);assertEquals(1, fld.getMinimumValue());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52570);assertEquals(1, fld.getMinimumValueOverall());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52571);assertEquals(355, fld.getMaximumValue());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52572);assertEquals(355, fld.getMaximumValueOverall());
        
        __CLR4_4_1147z147zlc8azwqz.R.inc(52573);assertEquals(0, dt.getHourOfDay());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52574);assertEquals(0, dt.getMinuteOfHour());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52575);assertEquals(0, dt.getSecondOfMinute());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52576);assertEquals(0, dt.getMillisOfSecond());
    }finally{__CLR4_4_1147z147zlc8azwqz.R.flushNeeded();}}

    public void testSampleDateWithZone() {__CLR4_4_1147z147zlc8azwqz.R.globalSliceStart(getClass().getName(),52577);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gh4f6l14kh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1147z147zlc8azwqz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1147z147zlc8azwqz.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestIslamicChronology.testSampleDateWithZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),52577,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gh4f6l14kh(){try{__CLR4_4_1147z147zlc8azwqz.R.inc(52577);
        __CLR4_4_1147z147zlc8azwqz.R.inc(52578);DateTime dt = new DateTime(2005, 11, 26, 12, 0, 0, 0, PARIS).withChronology(ISLAMIC_UTC);
        __CLR4_4_1147z147zlc8azwqz.R.inc(52579);assertEquals(IslamicChronology.AH, dt.getEra());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52580);assertEquals(1426, dt.getYear());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52581);assertEquals(10, dt.getMonthOfYear());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52582);assertEquals(24, dt.getDayOfMonth());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52583);assertEquals(11, dt.getHourOfDay());  // PARIS is UTC+1 in summer (12-1=11)
        __CLR4_4_1147z147zlc8azwqz.R.inc(52584);assertEquals(0, dt.getMinuteOfHour());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52585);assertEquals(0, dt.getSecondOfMinute());
        __CLR4_4_1147z147zlc8azwqz.R.inc(52586);assertEquals(0, dt.getMillisOfSecond());
    }finally{__CLR4_4_1147z147zlc8azwqz.R.flushNeeded();}}

    public void test15BasedLeapYear() {__CLR4_4_1147z147zlc8azwqz.R.globalSliceStart(getClass().getName(),52587);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1isr11314kr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1147z147zlc8azwqz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1147z147zlc8azwqz.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestIslamicChronology.test15BasedLeapYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),52587,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1isr11314kr(){try{__CLR4_4_1147z147zlc8azwqz.R.inc(52587);
        __CLR4_4_1147z147zlc8azwqz.R.inc(52588);assertEquals(false, IslamicChronology.LEAP_YEAR_15_BASED.isLeapYear(1));
        __CLR4_4_1147z147zlc8azwqz.R.inc(52589);assertEquals(true, IslamicChronology.LEAP_YEAR_15_BASED.isLeapYear(2));
        __CLR4_4_1147z147zlc8azwqz.R.inc(52590);assertEquals(false, IslamicChronology.LEAP_YEAR_15_BASED.isLeapYear(3));
        __CLR4_4_1147z147zlc8azwqz.R.inc(52591);assertEquals(false, IslamicChronology.LEAP_YEAR_15_BASED.isLeapYear(4));
        __CLR4_4_1147z147zlc8azwqz.R.inc(52592);assertEquals(true, IslamicChronology.LEAP_YEAR_15_BASED.isLeapYear(5));
        __CLR4_4_1147z147zlc8azwqz.R.inc(52593);assertEquals(false, IslamicChronology.LEAP_YEAR_15_BASED.isLeapYear(6));
        __CLR4_4_1147z147zlc8azwqz.R.inc(52594);assertEquals(true, IslamicChronology.LEAP_YEAR_15_BASED.isLeapYear(7));
        __CLR4_4_1147z147zlc8azwqz.R.inc(52595);assertEquals(false, IslamicChronology.LEAP_YEAR_15_BASED.isLeapYear(8));
        __CLR4_4_1147z147zlc8azwqz.R.inc(52596);assertEquals(false, IslamicChronology.LEAP_YEAR_15_BASED.isLeapYear(9));
        __CLR4_4_1147z147zlc8azwqz.R.inc(52597);assertEquals(true, IslamicChronology.LEAP_YEAR_15_BASED.isLeapYear(10));
        __CLR4_4_1147z147zlc8azwqz.R.inc(52598);assertEquals(false, IslamicChronology.LEAP_YEAR_15_BASED.isLeapYear(11));
        __CLR4_4_1147z147zlc8azwqz.R.inc(52599);assertEquals(false, IslamicChronology.LEAP_YEAR_15_BASED.isLeapYear(12));
        __CLR4_4_1147z147zlc8azwqz.R.inc(52600);assertEquals(true, IslamicChronology.LEAP_YEAR_15_BASED.isLeapYear(13));
        __CLR4_4_1147z147zlc8azwqz.R.inc(52601);assertEquals(false, IslamicChronology.LEAP_YEAR_15_BASED.isLeapYear(14));
        __CLR4_4_1147z147zlc8azwqz.R.inc(52602);assertEquals(true, IslamicChronology.LEAP_YEAR_15_BASED.isLeapYear(15));
        __CLR4_4_1147z147zlc8azwqz.R.inc(52603);assertEquals(false, IslamicChronology.LEAP_YEAR_15_BASED.isLeapYear(16));
        __CLR4_4_1147z147zlc8azwqz.R.inc(52604);assertEquals(false, IslamicChronology.LEAP_YEAR_15_BASED.isLeapYear(17));
        __CLR4_4_1147z147zlc8azwqz.R.inc(52605);assertEquals(true, IslamicChronology.LEAP_YEAR_15_BASED.isLeapYear(18));
        __CLR4_4_1147z147zlc8azwqz.R.inc(52606);assertEquals(false, IslamicChronology.LEAP_YEAR_15_BASED.isLeapYear(19));
        __CLR4_4_1147z147zlc8azwqz.R.inc(52607);assertEquals(false, IslamicChronology.LEAP_YEAR_15_BASED.isLeapYear(20));
        __CLR4_4_1147z147zlc8azwqz.R.inc(52608);assertEquals(true, IslamicChronology.LEAP_YEAR_15_BASED.isLeapYear(21));
        __CLR4_4_1147z147zlc8azwqz.R.inc(52609);assertEquals(false, IslamicChronology.LEAP_YEAR_15_BASED.isLeapYear(22));
        __CLR4_4_1147z147zlc8azwqz.R.inc(52610);assertEquals(false, IslamicChronology.LEAP_YEAR_15_BASED.isLeapYear(23));
        __CLR4_4_1147z147zlc8azwqz.R.inc(52611);assertEquals(true, IslamicChronology.LEAP_YEAR_15_BASED.isLeapYear(24));
        __CLR4_4_1147z147zlc8azwqz.R.inc(52612);assertEquals(false, IslamicChronology.LEAP_YEAR_15_BASED.isLeapYear(25));
        __CLR4_4_1147z147zlc8azwqz.R.inc(52613);assertEquals(true, IslamicChronology.LEAP_YEAR_15_BASED.isLeapYear(26));
        __CLR4_4_1147z147zlc8azwqz.R.inc(52614);assertEquals(false, IslamicChronology.LEAP_YEAR_15_BASED.isLeapYear(27));
        __CLR4_4_1147z147zlc8azwqz.R.inc(52615);assertEquals(false, IslamicChronology.LEAP_YEAR_15_BASED.isLeapYear(28));
        __CLR4_4_1147z147zlc8azwqz.R.inc(52616);assertEquals(true, IslamicChronology.LEAP_YEAR_15_BASED.isLeapYear(29));
        __CLR4_4_1147z147zlc8azwqz.R.inc(52617);assertEquals(false, IslamicChronology.LEAP_YEAR_15_BASED.isLeapYear(30));
    }finally{__CLR4_4_1147z147zlc8azwqz.R.flushNeeded();}}

    public void test16BasedLeapYear() {__CLR4_4_1147z147zlc8azwqz.R.globalSliceStart(getClass().getName(),52618);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vn9eiw14lm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1147z147zlc8azwqz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1147z147zlc8azwqz.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestIslamicChronology.test16BasedLeapYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),52618,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vn9eiw14lm(){try{__CLR4_4_1147z147zlc8azwqz.R.inc(52618);
        __CLR4_4_1147z147zlc8azwqz.R.inc(52619);assertEquals(false, IslamicChronology.LEAP_YEAR_16_BASED.isLeapYear(1));
        __CLR4_4_1147z147zlc8azwqz.R.inc(52620);assertEquals(true, IslamicChronology.LEAP_YEAR_16_BASED.isLeapYear(2));
        __CLR4_4_1147z147zlc8azwqz.R.inc(52621);assertEquals(false, IslamicChronology.LEAP_YEAR_16_BASED.isLeapYear(3));
        __CLR4_4_1147z147zlc8azwqz.R.inc(52622);assertEquals(false, IslamicChronology.LEAP_YEAR_16_BASED.isLeapYear(4));
        __CLR4_4_1147z147zlc8azwqz.R.inc(52623);assertEquals(true, IslamicChronology.LEAP_YEAR_16_BASED.isLeapYear(5));
        __CLR4_4_1147z147zlc8azwqz.R.inc(52624);assertEquals(false, IslamicChronology.LEAP_YEAR_16_BASED.isLeapYear(6));
        __CLR4_4_1147z147zlc8azwqz.R.inc(52625);assertEquals(true, IslamicChronology.LEAP_YEAR_16_BASED.isLeapYear(7));
        __CLR4_4_1147z147zlc8azwqz.R.inc(52626);assertEquals(false, IslamicChronology.LEAP_YEAR_16_BASED.isLeapYear(8));
        __CLR4_4_1147z147zlc8azwqz.R.inc(52627);assertEquals(false, IslamicChronology.LEAP_YEAR_16_BASED.isLeapYear(9));
        __CLR4_4_1147z147zlc8azwqz.R.inc(52628);assertEquals(true, IslamicChronology.LEAP_YEAR_16_BASED.isLeapYear(10));
        __CLR4_4_1147z147zlc8azwqz.R.inc(52629);assertEquals(false, IslamicChronology.LEAP_YEAR_16_BASED.isLeapYear(11));
        __CLR4_4_1147z147zlc8azwqz.R.inc(52630);assertEquals(false, IslamicChronology.LEAP_YEAR_16_BASED.isLeapYear(12));
        __CLR4_4_1147z147zlc8azwqz.R.inc(52631);assertEquals(true, IslamicChronology.LEAP_YEAR_16_BASED.isLeapYear(13));
        __CLR4_4_1147z147zlc8azwqz.R.inc(52632);assertEquals(false, IslamicChronology.LEAP_YEAR_16_BASED.isLeapYear(14));
        __CLR4_4_1147z147zlc8azwqz.R.inc(52633);assertEquals(false, IslamicChronology.LEAP_YEAR_16_BASED.isLeapYear(15));
        __CLR4_4_1147z147zlc8azwqz.R.inc(52634);assertEquals(true, IslamicChronology.LEAP_YEAR_16_BASED.isLeapYear(16));
        __CLR4_4_1147z147zlc8azwqz.R.inc(52635);assertEquals(false, IslamicChronology.LEAP_YEAR_16_BASED.isLeapYear(17));
        __CLR4_4_1147z147zlc8azwqz.R.inc(52636);assertEquals(true, IslamicChronology.LEAP_YEAR_16_BASED.isLeapYear(18));
        __CLR4_4_1147z147zlc8azwqz.R.inc(52637);assertEquals(false, IslamicChronology.LEAP_YEAR_16_BASED.isLeapYear(19));
        __CLR4_4_1147z147zlc8azwqz.R.inc(52638);assertEquals(false, IslamicChronology.LEAP_YEAR_16_BASED.isLeapYear(20));
        __CLR4_4_1147z147zlc8azwqz.R.inc(52639);assertEquals(true, IslamicChronology.LEAP_YEAR_16_BASED.isLeapYear(21));
        __CLR4_4_1147z147zlc8azwqz.R.inc(52640);assertEquals(false, IslamicChronology.LEAP_YEAR_16_BASED.isLeapYear(22));
        __CLR4_4_1147z147zlc8azwqz.R.inc(52641);assertEquals(false, IslamicChronology.LEAP_YEAR_16_BASED.isLeapYear(23));
        __CLR4_4_1147z147zlc8azwqz.R.inc(52642);assertEquals(true, IslamicChronology.LEAP_YEAR_16_BASED.isLeapYear(24));
        __CLR4_4_1147z147zlc8azwqz.R.inc(52643);assertEquals(false, IslamicChronology.LEAP_YEAR_16_BASED.isLeapYear(25));
        __CLR4_4_1147z147zlc8azwqz.R.inc(52644);assertEquals(true, IslamicChronology.LEAP_YEAR_16_BASED.isLeapYear(26));
        __CLR4_4_1147z147zlc8azwqz.R.inc(52645);assertEquals(false, IslamicChronology.LEAP_YEAR_16_BASED.isLeapYear(27));
        __CLR4_4_1147z147zlc8azwqz.R.inc(52646);assertEquals(false, IslamicChronology.LEAP_YEAR_16_BASED.isLeapYear(28));
        __CLR4_4_1147z147zlc8azwqz.R.inc(52647);assertEquals(true, IslamicChronology.LEAP_YEAR_16_BASED.isLeapYear(29));
        __CLR4_4_1147z147zlc8azwqz.R.inc(52648);assertEquals(false, IslamicChronology.LEAP_YEAR_16_BASED.isLeapYear(30));
    }finally{__CLR4_4_1147z147zlc8azwqz.R.flushNeeded();}}

    public void testIndianBasedLeapYear() {__CLR4_4_1147z147zlc8azwqz.R.globalSliceStart(getClass().getName(),52649);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ekitrq14mh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1147z147zlc8azwqz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1147z147zlc8azwqz.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestIslamicChronology.testIndianBasedLeapYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),52649,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ekitrq14mh(){try{__CLR4_4_1147z147zlc8azwqz.R.inc(52649);
        __CLR4_4_1147z147zlc8azwqz.R.inc(52650);assertEquals(false, IslamicChronology.LEAP_YEAR_INDIAN.isLeapYear(1));
        __CLR4_4_1147z147zlc8azwqz.R.inc(52651);assertEquals(true, IslamicChronology.LEAP_YEAR_INDIAN.isLeapYear(2));
        __CLR4_4_1147z147zlc8azwqz.R.inc(52652);assertEquals(false, IslamicChronology.LEAP_YEAR_INDIAN.isLeapYear(3));
        __CLR4_4_1147z147zlc8azwqz.R.inc(52653);assertEquals(false, IslamicChronology.LEAP_YEAR_INDIAN.isLeapYear(4));
        __CLR4_4_1147z147zlc8azwqz.R.inc(52654);assertEquals(true, IslamicChronology.LEAP_YEAR_INDIAN.isLeapYear(5));
        __CLR4_4_1147z147zlc8azwqz.R.inc(52655);assertEquals(false, IslamicChronology.LEAP_YEAR_INDIAN.isLeapYear(6));
        __CLR4_4_1147z147zlc8azwqz.R.inc(52656);assertEquals(false, IslamicChronology.LEAP_YEAR_INDIAN.isLeapYear(7));
        __CLR4_4_1147z147zlc8azwqz.R.inc(52657);assertEquals(true, IslamicChronology.LEAP_YEAR_INDIAN.isLeapYear(8));
        __CLR4_4_1147z147zlc8azwqz.R.inc(52658);assertEquals(false, IslamicChronology.LEAP_YEAR_INDIAN.isLeapYear(9));
        __CLR4_4_1147z147zlc8azwqz.R.inc(52659);assertEquals(true, IslamicChronology.LEAP_YEAR_INDIAN.isLeapYear(10));
        __CLR4_4_1147z147zlc8azwqz.R.inc(52660);assertEquals(false, IslamicChronology.LEAP_YEAR_INDIAN.isLeapYear(11));
        __CLR4_4_1147z147zlc8azwqz.R.inc(52661);assertEquals(false, IslamicChronology.LEAP_YEAR_INDIAN.isLeapYear(12));
        __CLR4_4_1147z147zlc8azwqz.R.inc(52662);assertEquals(true, IslamicChronology.LEAP_YEAR_INDIAN.isLeapYear(13));
        __CLR4_4_1147z147zlc8azwqz.R.inc(52663);assertEquals(false, IslamicChronology.LEAP_YEAR_INDIAN.isLeapYear(14));
        __CLR4_4_1147z147zlc8azwqz.R.inc(52664);assertEquals(false, IslamicChronology.LEAP_YEAR_INDIAN.isLeapYear(15));
        __CLR4_4_1147z147zlc8azwqz.R.inc(52665);assertEquals(true, IslamicChronology.LEAP_YEAR_INDIAN.isLeapYear(16));
        __CLR4_4_1147z147zlc8azwqz.R.inc(52666);assertEquals(false, IslamicChronology.LEAP_YEAR_INDIAN.isLeapYear(17));
        __CLR4_4_1147z147zlc8azwqz.R.inc(52667);assertEquals(false, IslamicChronology.LEAP_YEAR_INDIAN.isLeapYear(18));
        __CLR4_4_1147z147zlc8azwqz.R.inc(52668);assertEquals(true, IslamicChronology.LEAP_YEAR_INDIAN.isLeapYear(19));
        __CLR4_4_1147z147zlc8azwqz.R.inc(52669);assertEquals(false, IslamicChronology.LEAP_YEAR_INDIAN.isLeapYear(20));
        __CLR4_4_1147z147zlc8azwqz.R.inc(52670);assertEquals(true, IslamicChronology.LEAP_YEAR_INDIAN.isLeapYear(21));
        __CLR4_4_1147z147zlc8azwqz.R.inc(52671);assertEquals(false, IslamicChronology.LEAP_YEAR_INDIAN.isLeapYear(22));
        __CLR4_4_1147z147zlc8azwqz.R.inc(52672);assertEquals(false, IslamicChronology.LEAP_YEAR_INDIAN.isLeapYear(23));
        __CLR4_4_1147z147zlc8azwqz.R.inc(52673);assertEquals(true, IslamicChronology.LEAP_YEAR_INDIAN.isLeapYear(24));
        __CLR4_4_1147z147zlc8azwqz.R.inc(52674);assertEquals(false, IslamicChronology.LEAP_YEAR_INDIAN.isLeapYear(25));
        __CLR4_4_1147z147zlc8azwqz.R.inc(52675);assertEquals(false, IslamicChronology.LEAP_YEAR_INDIAN.isLeapYear(26));
        __CLR4_4_1147z147zlc8azwqz.R.inc(52676);assertEquals(true, IslamicChronology.LEAP_YEAR_INDIAN.isLeapYear(27));
        __CLR4_4_1147z147zlc8azwqz.R.inc(52677);assertEquals(false, IslamicChronology.LEAP_YEAR_INDIAN.isLeapYear(28));
        __CLR4_4_1147z147zlc8azwqz.R.inc(52678);assertEquals(true, IslamicChronology.LEAP_YEAR_INDIAN.isLeapYear(29));
        __CLR4_4_1147z147zlc8azwqz.R.inc(52679);assertEquals(false, IslamicChronology.LEAP_YEAR_INDIAN.isLeapYear(30));
    }finally{__CLR4_4_1147z147zlc8azwqz.R.flushNeeded();}}

    public void testHabashAlHasibBasedLeapYear() {__CLR4_4_1147z147zlc8azwqz.R.globalSliceStart(getClass().getName(),52680);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ghpnhy14nc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1147z147zlc8azwqz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1147z147zlc8azwqz.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestIslamicChronology.testHabashAlHasibBasedLeapYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),52680,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ghpnhy14nc(){try{__CLR4_4_1147z147zlc8azwqz.R.inc(52680);
        __CLR4_4_1147z147zlc8azwqz.R.inc(52681);assertEquals(false, IslamicChronology.LEAP_YEAR_HABASH_AL_HASIB.isLeapYear(1));
        __CLR4_4_1147z147zlc8azwqz.R.inc(52682);assertEquals(true, IslamicChronology.LEAP_YEAR_HABASH_AL_HASIB.isLeapYear(2));
        __CLR4_4_1147z147zlc8azwqz.R.inc(52683);assertEquals(false, IslamicChronology.LEAP_YEAR_HABASH_AL_HASIB.isLeapYear(3));
        __CLR4_4_1147z147zlc8azwqz.R.inc(52684);assertEquals(false, IslamicChronology.LEAP_YEAR_HABASH_AL_HASIB.isLeapYear(4));
        __CLR4_4_1147z147zlc8azwqz.R.inc(52685);assertEquals(true, IslamicChronology.LEAP_YEAR_HABASH_AL_HASIB.isLeapYear(5));
        __CLR4_4_1147z147zlc8azwqz.R.inc(52686);assertEquals(false, IslamicChronology.LEAP_YEAR_HABASH_AL_HASIB.isLeapYear(6));
        __CLR4_4_1147z147zlc8azwqz.R.inc(52687);assertEquals(false, IslamicChronology.LEAP_YEAR_HABASH_AL_HASIB.isLeapYear(7));
        __CLR4_4_1147z147zlc8azwqz.R.inc(52688);assertEquals(true, IslamicChronology.LEAP_YEAR_HABASH_AL_HASIB.isLeapYear(8));
        __CLR4_4_1147z147zlc8azwqz.R.inc(52689);assertEquals(false, IslamicChronology.LEAP_YEAR_HABASH_AL_HASIB.isLeapYear(9));
        __CLR4_4_1147z147zlc8azwqz.R.inc(52690);assertEquals(false, IslamicChronology.LEAP_YEAR_HABASH_AL_HASIB.isLeapYear(10));
        __CLR4_4_1147z147zlc8azwqz.R.inc(52691);assertEquals(true, IslamicChronology.LEAP_YEAR_HABASH_AL_HASIB.isLeapYear(11));
        __CLR4_4_1147z147zlc8azwqz.R.inc(52692);assertEquals(false, IslamicChronology.LEAP_YEAR_HABASH_AL_HASIB.isLeapYear(12));
        __CLR4_4_1147z147zlc8azwqz.R.inc(52693);assertEquals(true, IslamicChronology.LEAP_YEAR_HABASH_AL_HASIB.isLeapYear(13));
        __CLR4_4_1147z147zlc8azwqz.R.inc(52694);assertEquals(false, IslamicChronology.LEAP_YEAR_HABASH_AL_HASIB.isLeapYear(14));
        __CLR4_4_1147z147zlc8azwqz.R.inc(52695);assertEquals(false, IslamicChronology.LEAP_YEAR_HABASH_AL_HASIB.isLeapYear(15));
        __CLR4_4_1147z147zlc8azwqz.R.inc(52696);assertEquals(true, IslamicChronology.LEAP_YEAR_HABASH_AL_HASIB.isLeapYear(16));
        __CLR4_4_1147z147zlc8azwqz.R.inc(52697);assertEquals(false, IslamicChronology.LEAP_YEAR_HABASH_AL_HASIB.isLeapYear(17));
        __CLR4_4_1147z147zlc8azwqz.R.inc(52698);assertEquals(false, IslamicChronology.LEAP_YEAR_HABASH_AL_HASIB.isLeapYear(18));
        __CLR4_4_1147z147zlc8azwqz.R.inc(52699);assertEquals(true, IslamicChronology.LEAP_YEAR_HABASH_AL_HASIB.isLeapYear(19));
        __CLR4_4_1147z147zlc8azwqz.R.inc(52700);assertEquals(false, IslamicChronology.LEAP_YEAR_HABASH_AL_HASIB.isLeapYear(20));
        __CLR4_4_1147z147zlc8azwqz.R.inc(52701);assertEquals(true, IslamicChronology.LEAP_YEAR_HABASH_AL_HASIB.isLeapYear(21));
        __CLR4_4_1147z147zlc8azwqz.R.inc(52702);assertEquals(false, IslamicChronology.LEAP_YEAR_HABASH_AL_HASIB.isLeapYear(22));
        __CLR4_4_1147z147zlc8azwqz.R.inc(52703);assertEquals(false, IslamicChronology.LEAP_YEAR_HABASH_AL_HASIB.isLeapYear(23));
        __CLR4_4_1147z147zlc8azwqz.R.inc(52704);assertEquals(true, IslamicChronology.LEAP_YEAR_HABASH_AL_HASIB.isLeapYear(24));
        __CLR4_4_1147z147zlc8azwqz.R.inc(52705);assertEquals(false, IslamicChronology.LEAP_YEAR_HABASH_AL_HASIB.isLeapYear(25));
        __CLR4_4_1147z147zlc8azwqz.R.inc(52706);assertEquals(false, IslamicChronology.LEAP_YEAR_HABASH_AL_HASIB.isLeapYear(26));
        __CLR4_4_1147z147zlc8azwqz.R.inc(52707);assertEquals(true, IslamicChronology.LEAP_YEAR_HABASH_AL_HASIB.isLeapYear(27));
        __CLR4_4_1147z147zlc8azwqz.R.inc(52708);assertEquals(false, IslamicChronology.LEAP_YEAR_HABASH_AL_HASIB.isLeapYear(28));
        __CLR4_4_1147z147zlc8azwqz.R.inc(52709);assertEquals(false, IslamicChronology.LEAP_YEAR_HABASH_AL_HASIB.isLeapYear(29));
        __CLR4_4_1147z147zlc8azwqz.R.inc(52710);assertEquals(true, IslamicChronology.LEAP_YEAR_HABASH_AL_HASIB.isLeapYear(30));
    }finally{__CLR4_4_1147z147zlc8azwqz.R.flushNeeded();}}

}
