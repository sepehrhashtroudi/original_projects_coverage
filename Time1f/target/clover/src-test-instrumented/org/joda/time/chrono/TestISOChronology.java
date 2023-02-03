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

import org.joda.time.DateMidnight;
import org.joda.time.DateTime;
import org.joda.time.DateTimeConstants;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeUtils;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationField;
import org.joda.time.DurationFieldType;
import org.joda.time.IllegalFieldValueException;
import org.joda.time.Partial;
import org.joda.time.TimeOfDay;
import org.joda.time.YearMonthDay;

/**
 * This class is a Junit unit test for ISOChronology.
 *
 * @author Stephen Colebourne
 */
@SuppressWarnings("deprecation")
public class TestISOChronology extends TestCase {static class __CLR4_4_113z413z4lc8azwpd{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672271031490L,8589935092L,52127,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    private static final DateTimeZone TOKYO = DateTimeZone.forID("Asia/Tokyo");

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

    public static void main(String[] args) {try{__CLR4_4_113z413z4lc8azwpd.R.inc(51808);
        __CLR4_4_113z413z4lc8azwpd.R.inc(51809);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_113z413z4lc8azwpd.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_113z413z4lc8azwpd.R.inc(51810);
        __CLR4_4_113z413z4lc8azwpd.R.inc(51811);return new TestSuite(TestISOChronology.class);
    }finally{__CLR4_4_113z413z4lc8azwpd.R.flushNeeded();}}

    public TestISOChronology(String name) {
        super(name);__CLR4_4_113z413z4lc8azwpd.R.inc(51813);try{__CLR4_4_113z413z4lc8azwpd.R.inc(51812);
    }finally{__CLR4_4_113z413z4lc8azwpd.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_113z413z4lc8azwpd.R.inc(51814);
        __CLR4_4_113z413z4lc8azwpd.R.inc(51815);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_113z413z4lc8azwpd.R.inc(51816);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_113z413z4lc8azwpd.R.inc(51817);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_113z413z4lc8azwpd.R.inc(51818);originalLocale = Locale.getDefault();
        __CLR4_4_113z413z4lc8azwpd.R.inc(51819);DateTimeZone.setDefault(LONDON);
        __CLR4_4_113z413z4lc8azwpd.R.inc(51820);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_113z413z4lc8azwpd.R.inc(51821);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_113z413z4lc8azwpd.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_113z413z4lc8azwpd.R.inc(51822);
        __CLR4_4_113z413z4lc8azwpd.R.inc(51823);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_113z413z4lc8azwpd.R.inc(51824);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_113z413z4lc8azwpd.R.inc(51825);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_113z413z4lc8azwpd.R.inc(51826);Locale.setDefault(originalLocale);
        __CLR4_4_113z413z4lc8azwpd.R.inc(51827);originalDateTimeZone = null;
        __CLR4_4_113z413z4lc8azwpd.R.inc(51828);originalTimeZone = null;
        __CLR4_4_113z413z4lc8azwpd.R.inc(51829);originalLocale = null;
    }finally{__CLR4_4_113z413z4lc8azwpd.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testFactoryUTC() {__CLR4_4_113z413z4lc8azwpd.R.globalSliceStart(getClass().getName(),51830);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19knvhv13zq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_113z413z4lc8azwpd.R.rethrow($CLV_t2$);}finally{__CLR4_4_113z413z4lc8azwpd.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestISOChronology.testFactoryUTC",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),51830,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19knvhv13zq(){try{__CLR4_4_113z413z4lc8azwpd.R.inc(51830);
        __CLR4_4_113z413z4lc8azwpd.R.inc(51831);assertEquals(DateTimeZone.UTC, ISOChronology.getInstanceUTC().getZone());
        __CLR4_4_113z413z4lc8azwpd.R.inc(51832);assertSame(ISOChronology.class, ISOChronology.getInstanceUTC().getClass());
    }finally{__CLR4_4_113z413z4lc8azwpd.R.flushNeeded();}}

    public void testFactory() {__CLR4_4_113z413z4lc8azwpd.R.globalSliceStart(getClass().getName(),51833);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_116tztt13zt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_113z413z4lc8azwpd.R.rethrow($CLV_t2$);}finally{__CLR4_4_113z413z4lc8azwpd.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestISOChronology.testFactory",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),51833,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_116tztt13zt(){try{__CLR4_4_113z413z4lc8azwpd.R.inc(51833);
        __CLR4_4_113z413z4lc8azwpd.R.inc(51834);assertEquals(LONDON, ISOChronology.getInstance().getZone());
        __CLR4_4_113z413z4lc8azwpd.R.inc(51835);assertSame(ISOChronology.class, ISOChronology.getInstance().getClass());
    }finally{__CLR4_4_113z413z4lc8azwpd.R.flushNeeded();}}

    public void testFactory_Zone() {__CLR4_4_113z413z4lc8azwpd.R.globalSliceStart(getClass().getName(),51836);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yy5ime13zw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_113z413z4lc8azwpd.R.rethrow($CLV_t2$);}finally{__CLR4_4_113z413z4lc8azwpd.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestISOChronology.testFactory_Zone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),51836,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yy5ime13zw(){try{__CLR4_4_113z413z4lc8azwpd.R.inc(51836);
        __CLR4_4_113z413z4lc8azwpd.R.inc(51837);assertEquals(TOKYO, ISOChronology.getInstance(TOKYO).getZone());
        __CLR4_4_113z413z4lc8azwpd.R.inc(51838);assertEquals(PARIS, ISOChronology.getInstance(PARIS).getZone());
        __CLR4_4_113z413z4lc8azwpd.R.inc(51839);assertEquals(LONDON, ISOChronology.getInstance(null).getZone());
        __CLR4_4_113z413z4lc8azwpd.R.inc(51840);assertSame(ISOChronology.class, ISOChronology.getInstance(TOKYO).getClass());
    }finally{__CLR4_4_113z413z4lc8azwpd.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testEquality() {__CLR4_4_113z413z4lc8azwpd.R.globalSliceStart(getClass().getName(),51841);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12agdql1401();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_113z413z4lc8azwpd.R.rethrow($CLV_t2$);}finally{__CLR4_4_113z413z4lc8azwpd.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestISOChronology.testEquality",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),51841,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12agdql1401(){try{__CLR4_4_113z413z4lc8azwpd.R.inc(51841);
        __CLR4_4_113z413z4lc8azwpd.R.inc(51842);assertSame(ISOChronology.getInstance(TOKYO), ISOChronology.getInstance(TOKYO));
        __CLR4_4_113z413z4lc8azwpd.R.inc(51843);assertSame(ISOChronology.getInstance(LONDON), ISOChronology.getInstance(LONDON));
        __CLR4_4_113z413z4lc8azwpd.R.inc(51844);assertSame(ISOChronology.getInstance(PARIS), ISOChronology.getInstance(PARIS));
        __CLR4_4_113z413z4lc8azwpd.R.inc(51845);assertSame(ISOChronology.getInstanceUTC(), ISOChronology.getInstanceUTC());
        __CLR4_4_113z413z4lc8azwpd.R.inc(51846);assertSame(ISOChronology.getInstance(), ISOChronology.getInstance(LONDON));
    }finally{__CLR4_4_113z413z4lc8azwpd.R.flushNeeded();}}

    public void testWithUTC() {__CLR4_4_113z413z4lc8azwpd.R.globalSliceStart(getClass().getName(),51847);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19orv831407();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_113z413z4lc8azwpd.R.rethrow($CLV_t2$);}finally{__CLR4_4_113z413z4lc8azwpd.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestISOChronology.testWithUTC",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),51847,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19orv831407(){try{__CLR4_4_113z413z4lc8azwpd.R.inc(51847);
        __CLR4_4_113z413z4lc8azwpd.R.inc(51848);assertSame(ISOChronology.getInstanceUTC(), ISOChronology.getInstance(LONDON).withUTC());
        __CLR4_4_113z413z4lc8azwpd.R.inc(51849);assertSame(ISOChronology.getInstanceUTC(), ISOChronology.getInstance(TOKYO).withUTC());
        __CLR4_4_113z413z4lc8azwpd.R.inc(51850);assertSame(ISOChronology.getInstanceUTC(), ISOChronology.getInstanceUTC().withUTC());
        __CLR4_4_113z413z4lc8azwpd.R.inc(51851);assertSame(ISOChronology.getInstanceUTC(), ISOChronology.getInstance().withUTC());
    }finally{__CLR4_4_113z413z4lc8azwpd.R.flushNeeded();}}

    public void testWithZone() {__CLR4_4_113z413z4lc8azwpd.R.globalSliceStart(getClass().getName(),51852);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1me3iet140c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_113z413z4lc8azwpd.R.rethrow($CLV_t2$);}finally{__CLR4_4_113z413z4lc8azwpd.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestISOChronology.testWithZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),51852,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1me3iet140c(){try{__CLR4_4_113z413z4lc8azwpd.R.inc(51852);
        __CLR4_4_113z413z4lc8azwpd.R.inc(51853);assertSame(ISOChronology.getInstance(TOKYO), ISOChronology.getInstance(TOKYO).withZone(TOKYO));
        __CLR4_4_113z413z4lc8azwpd.R.inc(51854);assertSame(ISOChronology.getInstance(LONDON), ISOChronology.getInstance(TOKYO).withZone(LONDON));
        __CLR4_4_113z413z4lc8azwpd.R.inc(51855);assertSame(ISOChronology.getInstance(PARIS), ISOChronology.getInstance(TOKYO).withZone(PARIS));
        __CLR4_4_113z413z4lc8azwpd.R.inc(51856);assertSame(ISOChronology.getInstance(LONDON), ISOChronology.getInstance(TOKYO).withZone(null));
        __CLR4_4_113z413z4lc8azwpd.R.inc(51857);assertSame(ISOChronology.getInstance(PARIS), ISOChronology.getInstance().withZone(PARIS));
        __CLR4_4_113z413z4lc8azwpd.R.inc(51858);assertSame(ISOChronology.getInstance(PARIS), ISOChronology.getInstanceUTC().withZone(PARIS));
    }finally{__CLR4_4_113z413z4lc8azwpd.R.flushNeeded();}}

    public void testToString() {__CLR4_4_113z413z4lc8azwpd.R.globalSliceStart(getClass().getName(),51859);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hrxdid140j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_113z413z4lc8azwpd.R.rethrow($CLV_t2$);}finally{__CLR4_4_113z413z4lc8azwpd.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestISOChronology.testToString",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),51859,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hrxdid140j(){try{__CLR4_4_113z413z4lc8azwpd.R.inc(51859);
        __CLR4_4_113z413z4lc8azwpd.R.inc(51860);assertEquals("ISOChronology[Europe/London]", ISOChronology.getInstance(LONDON).toString());
        __CLR4_4_113z413z4lc8azwpd.R.inc(51861);assertEquals("ISOChronology[Asia/Tokyo]", ISOChronology.getInstance(TOKYO).toString());
        __CLR4_4_113z413z4lc8azwpd.R.inc(51862);assertEquals("ISOChronology[Europe/London]", ISOChronology.getInstance().toString());
        __CLR4_4_113z413z4lc8azwpd.R.inc(51863);assertEquals("ISOChronology[UTC]", ISOChronology.getInstanceUTC().toString());
    }finally{__CLR4_4_113z413z4lc8azwpd.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testDurationFields() {__CLR4_4_113z413z4lc8azwpd.R.globalSliceStart(getClass().getName(),51864);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cnkzye140o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_113z413z4lc8azwpd.R.rethrow($CLV_t2$);}finally{__CLR4_4_113z413z4lc8azwpd.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestISOChronology.testDurationFields",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),51864,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cnkzye140o(){try{__CLR4_4_113z413z4lc8azwpd.R.inc(51864);
        __CLR4_4_113z413z4lc8azwpd.R.inc(51865);final ISOChronology iso = ISOChronology.getInstance();
        __CLR4_4_113z413z4lc8azwpd.R.inc(51866);assertEquals("eras", iso.eras().getName());
        __CLR4_4_113z413z4lc8azwpd.R.inc(51867);assertEquals("centuries", iso.centuries().getName());
        __CLR4_4_113z413z4lc8azwpd.R.inc(51868);assertEquals("years", iso.years().getName());
        __CLR4_4_113z413z4lc8azwpd.R.inc(51869);assertEquals("weekyears", iso.weekyears().getName());
        __CLR4_4_113z413z4lc8azwpd.R.inc(51870);assertEquals("months", iso.months().getName());
        __CLR4_4_113z413z4lc8azwpd.R.inc(51871);assertEquals("weeks", iso.weeks().getName());
        __CLR4_4_113z413z4lc8azwpd.R.inc(51872);assertEquals("days", iso.days().getName());
        __CLR4_4_113z413z4lc8azwpd.R.inc(51873);assertEquals("halfdays", iso.halfdays().getName());
        __CLR4_4_113z413z4lc8azwpd.R.inc(51874);assertEquals("hours", iso.hours().getName());
        __CLR4_4_113z413z4lc8azwpd.R.inc(51875);assertEquals("minutes", iso.minutes().getName());
        __CLR4_4_113z413z4lc8azwpd.R.inc(51876);assertEquals("seconds", iso.seconds().getName());
        __CLR4_4_113z413z4lc8azwpd.R.inc(51877);assertEquals("millis", iso.millis().getName());
        
        __CLR4_4_113z413z4lc8azwpd.R.inc(51878);assertEquals(false, iso.eras().isSupported());
        __CLR4_4_113z413z4lc8azwpd.R.inc(51879);assertEquals(true, iso.centuries().isSupported());
        __CLR4_4_113z413z4lc8azwpd.R.inc(51880);assertEquals(true, iso.years().isSupported());
        __CLR4_4_113z413z4lc8azwpd.R.inc(51881);assertEquals(true, iso.weekyears().isSupported());
        __CLR4_4_113z413z4lc8azwpd.R.inc(51882);assertEquals(true, iso.months().isSupported());
        __CLR4_4_113z413z4lc8azwpd.R.inc(51883);assertEquals(true, iso.weeks().isSupported());
        __CLR4_4_113z413z4lc8azwpd.R.inc(51884);assertEquals(true, iso.days().isSupported());
        __CLR4_4_113z413z4lc8azwpd.R.inc(51885);assertEquals(true, iso.halfdays().isSupported());
        __CLR4_4_113z413z4lc8azwpd.R.inc(51886);assertEquals(true, iso.hours().isSupported());
        __CLR4_4_113z413z4lc8azwpd.R.inc(51887);assertEquals(true, iso.minutes().isSupported());
        __CLR4_4_113z413z4lc8azwpd.R.inc(51888);assertEquals(true, iso.seconds().isSupported());
        __CLR4_4_113z413z4lc8azwpd.R.inc(51889);assertEquals(true, iso.millis().isSupported());
        
        __CLR4_4_113z413z4lc8azwpd.R.inc(51890);assertEquals(false, iso.centuries().isPrecise());
        __CLR4_4_113z413z4lc8azwpd.R.inc(51891);assertEquals(false, iso.years().isPrecise());
        __CLR4_4_113z413z4lc8azwpd.R.inc(51892);assertEquals(false, iso.weekyears().isPrecise());
        __CLR4_4_113z413z4lc8azwpd.R.inc(51893);assertEquals(false, iso.months().isPrecise());
        __CLR4_4_113z413z4lc8azwpd.R.inc(51894);assertEquals(false, iso.weeks().isPrecise());
        __CLR4_4_113z413z4lc8azwpd.R.inc(51895);assertEquals(false, iso.days().isPrecise());
        __CLR4_4_113z413z4lc8azwpd.R.inc(51896);assertEquals(false, iso.halfdays().isPrecise());
        __CLR4_4_113z413z4lc8azwpd.R.inc(51897);assertEquals(true, iso.hours().isPrecise());
        __CLR4_4_113z413z4lc8azwpd.R.inc(51898);assertEquals(true, iso.minutes().isPrecise());
        __CLR4_4_113z413z4lc8azwpd.R.inc(51899);assertEquals(true, iso.seconds().isPrecise());
        __CLR4_4_113z413z4lc8azwpd.R.inc(51900);assertEquals(true, iso.millis().isPrecise());
        
        __CLR4_4_113z413z4lc8azwpd.R.inc(51901);final ISOChronology isoUTC = ISOChronology.getInstanceUTC();
        __CLR4_4_113z413z4lc8azwpd.R.inc(51902);assertEquals(false, isoUTC.centuries().isPrecise());
        __CLR4_4_113z413z4lc8azwpd.R.inc(51903);assertEquals(false, isoUTC.years().isPrecise());
        __CLR4_4_113z413z4lc8azwpd.R.inc(51904);assertEquals(false, isoUTC.weekyears().isPrecise());
        __CLR4_4_113z413z4lc8azwpd.R.inc(51905);assertEquals(false, isoUTC.months().isPrecise());
        __CLR4_4_113z413z4lc8azwpd.R.inc(51906);assertEquals(true, isoUTC.weeks().isPrecise());
        __CLR4_4_113z413z4lc8azwpd.R.inc(51907);assertEquals(true, isoUTC.days().isPrecise());
        __CLR4_4_113z413z4lc8azwpd.R.inc(51908);assertEquals(true, isoUTC.halfdays().isPrecise());
        __CLR4_4_113z413z4lc8azwpd.R.inc(51909);assertEquals(true, isoUTC.hours().isPrecise());
        __CLR4_4_113z413z4lc8azwpd.R.inc(51910);assertEquals(true, isoUTC.minutes().isPrecise());
        __CLR4_4_113z413z4lc8azwpd.R.inc(51911);assertEquals(true, isoUTC.seconds().isPrecise());
        __CLR4_4_113z413z4lc8azwpd.R.inc(51912);assertEquals(true, isoUTC.millis().isPrecise());
        
        __CLR4_4_113z413z4lc8azwpd.R.inc(51913);final DateTimeZone gmt = DateTimeZone.forID("Etc/GMT");
        __CLR4_4_113z413z4lc8azwpd.R.inc(51914);final ISOChronology isoGMT = ISOChronology.getInstance(gmt);
        __CLR4_4_113z413z4lc8azwpd.R.inc(51915);assertEquals(false, isoGMT.centuries().isPrecise());
        __CLR4_4_113z413z4lc8azwpd.R.inc(51916);assertEquals(false, isoGMT.years().isPrecise());
        __CLR4_4_113z413z4lc8azwpd.R.inc(51917);assertEquals(false, isoGMT.weekyears().isPrecise());
        __CLR4_4_113z413z4lc8azwpd.R.inc(51918);assertEquals(false, isoGMT.months().isPrecise());
        __CLR4_4_113z413z4lc8azwpd.R.inc(51919);assertEquals(true, isoGMT.weeks().isPrecise());
        __CLR4_4_113z413z4lc8azwpd.R.inc(51920);assertEquals(true, isoGMT.days().isPrecise());
        __CLR4_4_113z413z4lc8azwpd.R.inc(51921);assertEquals(true, isoGMT.halfdays().isPrecise());
        __CLR4_4_113z413z4lc8azwpd.R.inc(51922);assertEquals(true, isoGMT.hours().isPrecise());
        __CLR4_4_113z413z4lc8azwpd.R.inc(51923);assertEquals(true, isoGMT.minutes().isPrecise());
        __CLR4_4_113z413z4lc8azwpd.R.inc(51924);assertEquals(true, isoGMT.seconds().isPrecise());
        __CLR4_4_113z413z4lc8azwpd.R.inc(51925);assertEquals(true, isoGMT.millis().isPrecise());
        
        __CLR4_4_113z413z4lc8azwpd.R.inc(51926);final DateTimeZone offset = DateTimeZone.forOffsetHours(1);
        __CLR4_4_113z413z4lc8azwpd.R.inc(51927);final ISOChronology isoOffset1 = ISOChronology.getInstance(offset);
        __CLR4_4_113z413z4lc8azwpd.R.inc(51928);assertEquals(false, isoOffset1.centuries().isPrecise());
        __CLR4_4_113z413z4lc8azwpd.R.inc(51929);assertEquals(false, isoOffset1.years().isPrecise());
        __CLR4_4_113z413z4lc8azwpd.R.inc(51930);assertEquals(false, isoOffset1.weekyears().isPrecise());
        __CLR4_4_113z413z4lc8azwpd.R.inc(51931);assertEquals(false, isoOffset1.months().isPrecise());
        __CLR4_4_113z413z4lc8azwpd.R.inc(51932);assertEquals(true, isoOffset1.weeks().isPrecise());
        __CLR4_4_113z413z4lc8azwpd.R.inc(51933);assertEquals(true, isoOffset1.days().isPrecise());
        __CLR4_4_113z413z4lc8azwpd.R.inc(51934);assertEquals(true, isoOffset1.halfdays().isPrecise());
        __CLR4_4_113z413z4lc8azwpd.R.inc(51935);assertEquals(true, isoOffset1.hours().isPrecise());
        __CLR4_4_113z413z4lc8azwpd.R.inc(51936);assertEquals(true, isoOffset1.minutes().isPrecise());
        __CLR4_4_113z413z4lc8azwpd.R.inc(51937);assertEquals(true, isoOffset1.seconds().isPrecise());
        __CLR4_4_113z413z4lc8azwpd.R.inc(51938);assertEquals(true, isoOffset1.millis().isPrecise());
    }finally{__CLR4_4_113z413z4lc8azwpd.R.flushNeeded();}}

    public void testDateFields() {__CLR4_4_113z413z4lc8azwpd.R.globalSliceStart(getClass().getName(),51939);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gkspeo142r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_113z413z4lc8azwpd.R.rethrow($CLV_t2$);}finally{__CLR4_4_113z413z4lc8azwpd.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestISOChronology.testDateFields",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),51939,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gkspeo142r(){try{__CLR4_4_113z413z4lc8azwpd.R.inc(51939);
        __CLR4_4_113z413z4lc8azwpd.R.inc(51940);final ISOChronology iso = ISOChronology.getInstance();
        __CLR4_4_113z413z4lc8azwpd.R.inc(51941);assertEquals("era", iso.era().getName());
        __CLR4_4_113z413z4lc8azwpd.R.inc(51942);assertEquals("centuryOfEra", iso.centuryOfEra().getName());
        __CLR4_4_113z413z4lc8azwpd.R.inc(51943);assertEquals("yearOfCentury", iso.yearOfCentury().getName());
        __CLR4_4_113z413z4lc8azwpd.R.inc(51944);assertEquals("yearOfEra", iso.yearOfEra().getName());
        __CLR4_4_113z413z4lc8azwpd.R.inc(51945);assertEquals("year", iso.year().getName());
        __CLR4_4_113z413z4lc8azwpd.R.inc(51946);assertEquals("monthOfYear", iso.monthOfYear().getName());
        __CLR4_4_113z413z4lc8azwpd.R.inc(51947);assertEquals("weekyearOfCentury", iso.weekyearOfCentury().getName());
        __CLR4_4_113z413z4lc8azwpd.R.inc(51948);assertEquals("weekyear", iso.weekyear().getName());
        __CLR4_4_113z413z4lc8azwpd.R.inc(51949);assertEquals("weekOfWeekyear", iso.weekOfWeekyear().getName());
        __CLR4_4_113z413z4lc8azwpd.R.inc(51950);assertEquals("dayOfYear", iso.dayOfYear().getName());
        __CLR4_4_113z413z4lc8azwpd.R.inc(51951);assertEquals("dayOfMonth", iso.dayOfMonth().getName());
        __CLR4_4_113z413z4lc8azwpd.R.inc(51952);assertEquals("dayOfWeek", iso.dayOfWeek().getName());
        
        __CLR4_4_113z413z4lc8azwpd.R.inc(51953);assertEquals(true, iso.era().isSupported());
        __CLR4_4_113z413z4lc8azwpd.R.inc(51954);assertEquals(true, iso.centuryOfEra().isSupported());
        __CLR4_4_113z413z4lc8azwpd.R.inc(51955);assertEquals(true, iso.yearOfCentury().isSupported());
        __CLR4_4_113z413z4lc8azwpd.R.inc(51956);assertEquals(true, iso.yearOfEra().isSupported());
        __CLR4_4_113z413z4lc8azwpd.R.inc(51957);assertEquals(true, iso.year().isSupported());
        __CLR4_4_113z413z4lc8azwpd.R.inc(51958);assertEquals(true, iso.monthOfYear().isSupported());
        __CLR4_4_113z413z4lc8azwpd.R.inc(51959);assertEquals(true, iso.weekyearOfCentury().isSupported());
        __CLR4_4_113z413z4lc8azwpd.R.inc(51960);assertEquals(true, iso.weekyear().isSupported());
        __CLR4_4_113z413z4lc8azwpd.R.inc(51961);assertEquals(true, iso.weekOfWeekyear().isSupported());
        __CLR4_4_113z413z4lc8azwpd.R.inc(51962);assertEquals(true, iso.dayOfYear().isSupported());
        __CLR4_4_113z413z4lc8azwpd.R.inc(51963);assertEquals(true, iso.dayOfMonth().isSupported());
        __CLR4_4_113z413z4lc8azwpd.R.inc(51964);assertEquals(true, iso.dayOfWeek().isSupported());
        
        __CLR4_4_113z413z4lc8azwpd.R.inc(51965);assertEquals(iso.eras(), iso.era().getDurationField());
        __CLR4_4_113z413z4lc8azwpd.R.inc(51966);assertEquals(iso.centuries(), iso.centuryOfEra().getDurationField());
        __CLR4_4_113z413z4lc8azwpd.R.inc(51967);assertEquals(iso.years(), iso.yearOfCentury().getDurationField());
        __CLR4_4_113z413z4lc8azwpd.R.inc(51968);assertEquals(iso.years(), iso.yearOfEra().getDurationField());
        __CLR4_4_113z413z4lc8azwpd.R.inc(51969);assertEquals(iso.years(), iso.year().getDurationField());
        __CLR4_4_113z413z4lc8azwpd.R.inc(51970);assertEquals(iso.months(), iso.monthOfYear().getDurationField());
        __CLR4_4_113z413z4lc8azwpd.R.inc(51971);assertEquals(iso.weekyears(), iso.weekyearOfCentury().getDurationField());
        __CLR4_4_113z413z4lc8azwpd.R.inc(51972);assertEquals(iso.weekyears(), iso.weekyear().getDurationField());
        __CLR4_4_113z413z4lc8azwpd.R.inc(51973);assertEquals(iso.weeks(), iso.weekOfWeekyear().getDurationField());
        __CLR4_4_113z413z4lc8azwpd.R.inc(51974);assertEquals(iso.days(), iso.dayOfYear().getDurationField());
        __CLR4_4_113z413z4lc8azwpd.R.inc(51975);assertEquals(iso.days(), iso.dayOfMonth().getDurationField());
        __CLR4_4_113z413z4lc8azwpd.R.inc(51976);assertEquals(iso.days(), iso.dayOfWeek().getDurationField());
        
        __CLR4_4_113z413z4lc8azwpd.R.inc(51977);assertEquals(null, iso.era().getRangeDurationField());
        __CLR4_4_113z413z4lc8azwpd.R.inc(51978);assertEquals(iso.eras(), iso.centuryOfEra().getRangeDurationField());
        __CLR4_4_113z413z4lc8azwpd.R.inc(51979);assertEquals(iso.centuries(), iso.yearOfCentury().getRangeDurationField());
        __CLR4_4_113z413z4lc8azwpd.R.inc(51980);assertEquals(iso.eras(), iso.yearOfEra().getRangeDurationField());
        __CLR4_4_113z413z4lc8azwpd.R.inc(51981);assertEquals(null, iso.year().getRangeDurationField());
        __CLR4_4_113z413z4lc8azwpd.R.inc(51982);assertEquals(iso.years(), iso.monthOfYear().getRangeDurationField());
        __CLR4_4_113z413z4lc8azwpd.R.inc(51983);assertEquals(iso.centuries(), iso.weekyearOfCentury().getRangeDurationField());
        __CLR4_4_113z413z4lc8azwpd.R.inc(51984);assertEquals(null, iso.weekyear().getRangeDurationField());
        __CLR4_4_113z413z4lc8azwpd.R.inc(51985);assertEquals(iso.weekyears(), iso.weekOfWeekyear().getRangeDurationField());
        __CLR4_4_113z413z4lc8azwpd.R.inc(51986);assertEquals(iso.years(), iso.dayOfYear().getRangeDurationField());
        __CLR4_4_113z413z4lc8azwpd.R.inc(51987);assertEquals(iso.months(), iso.dayOfMonth().getRangeDurationField());
        __CLR4_4_113z413z4lc8azwpd.R.inc(51988);assertEquals(iso.weeks(), iso.dayOfWeek().getRangeDurationField());
    }finally{__CLR4_4_113z413z4lc8azwpd.R.flushNeeded();}}

    public void testTimeFields() {__CLR4_4_113z413z4lc8azwpd.R.globalSliceStart(getClass().getName(),51989);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11r11up1445();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_113z413z4lc8azwpd.R.rethrow($CLV_t2$);}finally{__CLR4_4_113z413z4lc8azwpd.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestISOChronology.testTimeFields",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),51989,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11r11up1445(){try{__CLR4_4_113z413z4lc8azwpd.R.inc(51989);
        __CLR4_4_113z413z4lc8azwpd.R.inc(51990);final ISOChronology iso = ISOChronology.getInstance();
        __CLR4_4_113z413z4lc8azwpd.R.inc(51991);assertEquals("halfdayOfDay", iso.halfdayOfDay().getName());
        __CLR4_4_113z413z4lc8azwpd.R.inc(51992);assertEquals("clockhourOfHalfday", iso.clockhourOfHalfday().getName());
        __CLR4_4_113z413z4lc8azwpd.R.inc(51993);assertEquals("hourOfHalfday", iso.hourOfHalfday().getName());
        __CLR4_4_113z413z4lc8azwpd.R.inc(51994);assertEquals("clockhourOfDay", iso.clockhourOfDay().getName());
        __CLR4_4_113z413z4lc8azwpd.R.inc(51995);assertEquals("hourOfDay", iso.hourOfDay().getName());
        __CLR4_4_113z413z4lc8azwpd.R.inc(51996);assertEquals("minuteOfDay", iso.minuteOfDay().getName());
        __CLR4_4_113z413z4lc8azwpd.R.inc(51997);assertEquals("minuteOfHour", iso.minuteOfHour().getName());
        __CLR4_4_113z413z4lc8azwpd.R.inc(51998);assertEquals("secondOfDay", iso.secondOfDay().getName());
        __CLR4_4_113z413z4lc8azwpd.R.inc(51999);assertEquals("secondOfMinute", iso.secondOfMinute().getName());
        __CLR4_4_113z413z4lc8azwpd.R.inc(52000);assertEquals("millisOfDay", iso.millisOfDay().getName());
        __CLR4_4_113z413z4lc8azwpd.R.inc(52001);assertEquals("millisOfSecond", iso.millisOfSecond().getName());
        
        __CLR4_4_113z413z4lc8azwpd.R.inc(52002);assertEquals(true, iso.halfdayOfDay().isSupported());
        __CLR4_4_113z413z4lc8azwpd.R.inc(52003);assertEquals(true, iso.clockhourOfHalfday().isSupported());
        __CLR4_4_113z413z4lc8azwpd.R.inc(52004);assertEquals(true, iso.hourOfHalfday().isSupported());
        __CLR4_4_113z413z4lc8azwpd.R.inc(52005);assertEquals(true, iso.clockhourOfDay().isSupported());
        __CLR4_4_113z413z4lc8azwpd.R.inc(52006);assertEquals(true, iso.hourOfDay().isSupported());
        __CLR4_4_113z413z4lc8azwpd.R.inc(52007);assertEquals(true, iso.minuteOfDay().isSupported());
        __CLR4_4_113z413z4lc8azwpd.R.inc(52008);assertEquals(true, iso.minuteOfHour().isSupported());
        __CLR4_4_113z413z4lc8azwpd.R.inc(52009);assertEquals(true, iso.secondOfDay().isSupported());
        __CLR4_4_113z413z4lc8azwpd.R.inc(52010);assertEquals(true, iso.secondOfMinute().isSupported());
        __CLR4_4_113z413z4lc8azwpd.R.inc(52011);assertEquals(true, iso.millisOfDay().isSupported());
        __CLR4_4_113z413z4lc8azwpd.R.inc(52012);assertEquals(true, iso.millisOfSecond().isSupported());
    }finally{__CLR4_4_113z413z4lc8azwpd.R.flushNeeded();}}

    public void testMaxYear() {__CLR4_4_113z413z4lc8azwpd.R.globalSliceStart(getClass().getName(),52013);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1m1xq9i144t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_113z413z4lc8azwpd.R.rethrow($CLV_t2$);}finally{__CLR4_4_113z413z4lc8azwpd.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestISOChronology.testMaxYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),52013,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1m1xq9i144t(){try{__CLR4_4_113z413z4lc8azwpd.R.inc(52013);
        __CLR4_4_113z413z4lc8azwpd.R.inc(52014);final ISOChronology chrono = ISOChronology.getInstanceUTC();
        __CLR4_4_113z413z4lc8azwpd.R.inc(52015);final int maxYear = chrono.year().getMaximumValue();

        __CLR4_4_113z413z4lc8azwpd.R.inc(52016);DateTime start = new DateTime(maxYear, 1, 1, 0, 0, 0, 0, chrono);
        __CLR4_4_113z413z4lc8azwpd.R.inc(52017);DateTime end = new DateTime(maxYear, 12, 31, 23, 59, 59, 999, chrono);
        __CLR4_4_113z413z4lc8azwpd.R.inc(52018);assertTrue(start.getMillis() > 0);
        __CLR4_4_113z413z4lc8azwpd.R.inc(52019);assertTrue(end.getMillis() > start.getMillis());
        __CLR4_4_113z413z4lc8azwpd.R.inc(52020);assertEquals(maxYear, start.getYear());
        __CLR4_4_113z413z4lc8azwpd.R.inc(52021);assertEquals(maxYear, end.getYear());
        __CLR4_4_113z413z4lc8azwpd.R.inc(52022);long delta = end.getMillis() - start.getMillis();
        __CLR4_4_113z413z4lc8azwpd.R.inc(52023);long expectedDelta = 
            ((((start.year().isLeap() )&&(__CLR4_4_113z413z4lc8azwpd.R.iget(52024)!=0|true))||(__CLR4_4_113z413z4lc8azwpd.R.iget(52025)==0&false))? 366L : 365L) * DateTimeConstants.MILLIS_PER_DAY - 1;
        __CLR4_4_113z413z4lc8azwpd.R.inc(52026);assertEquals(expectedDelta, delta);

        __CLR4_4_113z413z4lc8azwpd.R.inc(52027);assertEquals(start, new DateTime(maxYear + "-01-01T00:00:00.000Z", chrono));
        __CLR4_4_113z413z4lc8azwpd.R.inc(52028);assertEquals(end, new DateTime(maxYear + "-12-31T23:59:59.999Z", chrono));

        __CLR4_4_113z413z4lc8azwpd.R.inc(52029);try {
            __CLR4_4_113z413z4lc8azwpd.R.inc(52030);start.plusYears(1);
            __CLR4_4_113z413z4lc8azwpd.R.inc(52031);fail();
        } catch (IllegalFieldValueException e) {
        }

        __CLR4_4_113z413z4lc8azwpd.R.inc(52032);try {
            __CLR4_4_113z413z4lc8azwpd.R.inc(52033);end.plusYears(1);
            __CLR4_4_113z413z4lc8azwpd.R.inc(52034);fail();
        } catch (IllegalFieldValueException e) {
        }

        __CLR4_4_113z413z4lc8azwpd.R.inc(52035);assertEquals(maxYear + 1, chrono.year().get(Long.MAX_VALUE));
    }finally{__CLR4_4_113z413z4lc8azwpd.R.flushNeeded();}}

    public void testMinYear() {__CLR4_4_113z413z4lc8azwpd.R.globalSliceStart(getClass().getName(),52036);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n3ynhg145g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_113z413z4lc8azwpd.R.rethrow($CLV_t2$);}finally{__CLR4_4_113z413z4lc8azwpd.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestISOChronology.testMinYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),52036,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n3ynhg145g(){try{__CLR4_4_113z413z4lc8azwpd.R.inc(52036);
        __CLR4_4_113z413z4lc8azwpd.R.inc(52037);final ISOChronology chrono = ISOChronology.getInstanceUTC();
        __CLR4_4_113z413z4lc8azwpd.R.inc(52038);final int minYear = chrono.year().getMinimumValue();

        __CLR4_4_113z413z4lc8azwpd.R.inc(52039);DateTime start = new DateTime(minYear, 1, 1, 0, 0, 0, 0, chrono);
        __CLR4_4_113z413z4lc8azwpd.R.inc(52040);DateTime end = new DateTime(minYear, 12, 31, 23, 59, 59, 999, chrono);
        __CLR4_4_113z413z4lc8azwpd.R.inc(52041);assertTrue(start.getMillis() < 0);
        __CLR4_4_113z413z4lc8azwpd.R.inc(52042);assertTrue(end.getMillis() > start.getMillis());
        __CLR4_4_113z413z4lc8azwpd.R.inc(52043);assertEquals(minYear, start.getYear());
        __CLR4_4_113z413z4lc8azwpd.R.inc(52044);assertEquals(minYear, end.getYear());
        __CLR4_4_113z413z4lc8azwpd.R.inc(52045);long delta = end.getMillis() - start.getMillis();
        __CLR4_4_113z413z4lc8azwpd.R.inc(52046);long expectedDelta = 
            ((((start.year().isLeap() )&&(__CLR4_4_113z413z4lc8azwpd.R.iget(52047)!=0|true))||(__CLR4_4_113z413z4lc8azwpd.R.iget(52048)==0&false))? 366L : 365L) * DateTimeConstants.MILLIS_PER_DAY - 1;
        __CLR4_4_113z413z4lc8azwpd.R.inc(52049);assertEquals(expectedDelta, delta);

        __CLR4_4_113z413z4lc8azwpd.R.inc(52050);assertEquals(start, new DateTime(minYear + "-01-01T00:00:00.000Z", chrono));
        __CLR4_4_113z413z4lc8azwpd.R.inc(52051);assertEquals(end, new DateTime(minYear + "-12-31T23:59:59.999Z", chrono));

        __CLR4_4_113z413z4lc8azwpd.R.inc(52052);try {
            __CLR4_4_113z413z4lc8azwpd.R.inc(52053);start.minusYears(1);
            __CLR4_4_113z413z4lc8azwpd.R.inc(52054);fail();
        } catch (IllegalFieldValueException e) {
        }

        __CLR4_4_113z413z4lc8azwpd.R.inc(52055);try {
            __CLR4_4_113z413z4lc8azwpd.R.inc(52056);end.minusYears(1);
            __CLR4_4_113z413z4lc8azwpd.R.inc(52057);fail();
        } catch (IllegalFieldValueException e) {
        }

        __CLR4_4_113z413z4lc8azwpd.R.inc(52058);assertEquals(minYear - 1, chrono.year().get(Long.MIN_VALUE));
    }finally{__CLR4_4_113z413z4lc8azwpd.R.flushNeeded();}}

    public void testCutoverAddYears() {__CLR4_4_113z413z4lc8azwpd.R.globalSliceStart(getClass().getName(),52059);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jhk7og1463();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_113z413z4lc8azwpd.R.rethrow($CLV_t2$);}finally{__CLR4_4_113z413z4lc8azwpd.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestISOChronology.testCutoverAddYears",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),52059,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jhk7og1463(){try{__CLR4_4_113z413z4lc8azwpd.R.inc(52059);
        __CLR4_4_113z413z4lc8azwpd.R.inc(52060);testAdd("1582-01-01", DurationFieldType.years(), 1, "1583-01-01");
        __CLR4_4_113z413z4lc8azwpd.R.inc(52061);testAdd("1582-02-15", DurationFieldType.years(), 1, "1583-02-15");
        __CLR4_4_113z413z4lc8azwpd.R.inc(52062);testAdd("1582-02-28", DurationFieldType.years(), 1, "1583-02-28");
        __CLR4_4_113z413z4lc8azwpd.R.inc(52063);testAdd("1582-03-01", DurationFieldType.years(), 1, "1583-03-01");
        __CLR4_4_113z413z4lc8azwpd.R.inc(52064);testAdd("1582-09-30", DurationFieldType.years(), 1, "1583-09-30");
        __CLR4_4_113z413z4lc8azwpd.R.inc(52065);testAdd("1582-10-01", DurationFieldType.years(), 1, "1583-10-01");
        __CLR4_4_113z413z4lc8azwpd.R.inc(52066);testAdd("1582-10-04", DurationFieldType.years(), 1, "1583-10-04");
        __CLR4_4_113z413z4lc8azwpd.R.inc(52067);testAdd("1582-10-15", DurationFieldType.years(), 1, "1583-10-15");
        __CLR4_4_113z413z4lc8azwpd.R.inc(52068);testAdd("1582-10-16", DurationFieldType.years(), 1, "1583-10-16");
        __CLR4_4_113z413z4lc8azwpd.R.inc(52069);testAdd("1580-01-01", DurationFieldType.years(), 4, "1584-01-01");
        __CLR4_4_113z413z4lc8azwpd.R.inc(52070);testAdd("1580-02-29", DurationFieldType.years(), 4, "1584-02-29");
        __CLR4_4_113z413z4lc8azwpd.R.inc(52071);testAdd("1580-10-01", DurationFieldType.years(), 4, "1584-10-01");
        __CLR4_4_113z413z4lc8azwpd.R.inc(52072);testAdd("1580-10-10", DurationFieldType.years(), 4, "1584-10-10");
        __CLR4_4_113z413z4lc8azwpd.R.inc(52073);testAdd("1580-10-15", DurationFieldType.years(), 4, "1584-10-15");
        __CLR4_4_113z413z4lc8azwpd.R.inc(52074);testAdd("1580-12-31", DurationFieldType.years(), 4, "1584-12-31");
    }finally{__CLR4_4_113z413z4lc8azwpd.R.flushNeeded();}}

    public void testAddMonths() {__CLR4_4_113z413z4lc8azwpd.R.globalSliceStart(getClass().getName(),52075);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n5eqa1146j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_113z413z4lc8azwpd.R.rethrow($CLV_t2$);}finally{__CLR4_4_113z413z4lc8azwpd.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestISOChronology.testAddMonths",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),52075,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n5eqa1146j(){try{__CLR4_4_113z413z4lc8azwpd.R.inc(52075);
        __CLR4_4_113z413z4lc8azwpd.R.inc(52076);testAdd("1582-01-01", DurationFieldType.months(), 1, "1582-02-01");
        __CLR4_4_113z413z4lc8azwpd.R.inc(52077);testAdd("1582-01-01", DurationFieldType.months(), 6, "1582-07-01");
        __CLR4_4_113z413z4lc8azwpd.R.inc(52078);testAdd("1582-01-01", DurationFieldType.months(), 12, "1583-01-01");
        __CLR4_4_113z413z4lc8azwpd.R.inc(52079);testAdd("1582-11-15", DurationFieldType.months(), 1, "1582-12-15");
        __CLR4_4_113z413z4lc8azwpd.R.inc(52080);testAdd("1582-09-04", DurationFieldType.months(), 2, "1582-11-04");
        __CLR4_4_113z413z4lc8azwpd.R.inc(52081);testAdd("1582-09-05", DurationFieldType.months(), 2, "1582-11-05");
        __CLR4_4_113z413z4lc8azwpd.R.inc(52082);testAdd("1582-09-10", DurationFieldType.months(), 2, "1582-11-10");
        __CLR4_4_113z413z4lc8azwpd.R.inc(52083);testAdd("1582-09-15", DurationFieldType.months(), 2, "1582-11-15");
        __CLR4_4_113z413z4lc8azwpd.R.inc(52084);testAdd("1580-01-01", DurationFieldType.months(), 48, "1584-01-01");
        __CLR4_4_113z413z4lc8azwpd.R.inc(52085);testAdd("1580-02-29", DurationFieldType.months(), 48, "1584-02-29");
        __CLR4_4_113z413z4lc8azwpd.R.inc(52086);testAdd("1580-10-01", DurationFieldType.months(), 48, "1584-10-01");
        __CLR4_4_113z413z4lc8azwpd.R.inc(52087);testAdd("1580-10-10", DurationFieldType.months(), 48, "1584-10-10");
        __CLR4_4_113z413z4lc8azwpd.R.inc(52088);testAdd("1580-10-15", DurationFieldType.months(), 48, "1584-10-15");
        __CLR4_4_113z413z4lc8azwpd.R.inc(52089);testAdd("1580-12-31", DurationFieldType.months(), 48, "1584-12-31");
    }finally{__CLR4_4_113z413z4lc8azwpd.R.flushNeeded();}}

    private void testAdd(String start, DurationFieldType type, int amt, String end) {try{__CLR4_4_113z413z4lc8azwpd.R.inc(52090);
        __CLR4_4_113z413z4lc8azwpd.R.inc(52091);DateTime dtStart = new DateTime(start, ISOChronology.getInstanceUTC());
        __CLR4_4_113z413z4lc8azwpd.R.inc(52092);DateTime dtEnd = new DateTime(end, ISOChronology.getInstanceUTC());
        __CLR4_4_113z413z4lc8azwpd.R.inc(52093);assertEquals(dtEnd, dtStart.withFieldAdded(type, amt));
        __CLR4_4_113z413z4lc8azwpd.R.inc(52094);assertEquals(dtStart, dtEnd.withFieldAdded(type, -amt));

        __CLR4_4_113z413z4lc8azwpd.R.inc(52095);DurationField field = type.getField(ISOChronology.getInstanceUTC());
        __CLR4_4_113z413z4lc8azwpd.R.inc(52096);int diff = field.getDifference(dtEnd.getMillis(), dtStart.getMillis());
        __CLR4_4_113z413z4lc8azwpd.R.inc(52097);assertEquals(amt, diff);
        
        __CLR4_4_113z413z4lc8azwpd.R.inc(52098);if ((((type == DurationFieldType.years() ||
            type == DurationFieldType.months() ||
            type == DurationFieldType.days())&&(__CLR4_4_113z413z4lc8azwpd.R.iget(52099)!=0|true))||(__CLR4_4_113z413z4lc8azwpd.R.iget(52100)==0&false))) {{
            __CLR4_4_113z413z4lc8azwpd.R.inc(52101);YearMonthDay ymdStart = new YearMonthDay(start, ISOChronology.getInstanceUTC());
            __CLR4_4_113z413z4lc8azwpd.R.inc(52102);YearMonthDay ymdEnd = new YearMonthDay(end, ISOChronology.getInstanceUTC());
            __CLR4_4_113z413z4lc8azwpd.R.inc(52103);assertEquals(ymdEnd, ymdStart.withFieldAdded(type, amt));
            __CLR4_4_113z413z4lc8azwpd.R.inc(52104);assertEquals(ymdStart, ymdEnd.withFieldAdded(type, -amt));
        }
    }}finally{__CLR4_4_113z413z4lc8azwpd.R.flushNeeded();}}

    public void testTimeOfDayAdd() {__CLR4_4_113z413z4lc8azwpd.R.globalSliceStart(getClass().getName(),52105);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1c1zvq6147d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_113z413z4lc8azwpd.R.rethrow($CLV_t2$);}finally{__CLR4_4_113z413z4lc8azwpd.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestISOChronology.testTimeOfDayAdd",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),52105,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1c1zvq6147d(){try{__CLR4_4_113z413z4lc8azwpd.R.inc(52105);
        __CLR4_4_113z413z4lc8azwpd.R.inc(52106);TimeOfDay start = new TimeOfDay(12, 30);
        __CLR4_4_113z413z4lc8azwpd.R.inc(52107);TimeOfDay end = new TimeOfDay(10, 30);
        __CLR4_4_113z413z4lc8azwpd.R.inc(52108);assertEquals(end, start.plusHours(22));
        __CLR4_4_113z413z4lc8azwpd.R.inc(52109);assertEquals(start, end.minusHours(22));
        __CLR4_4_113z413z4lc8azwpd.R.inc(52110);assertEquals(end, start.plusMinutes(22 * 60));
        __CLR4_4_113z413z4lc8azwpd.R.inc(52111);assertEquals(start, end.minusMinutes(22 * 60));
    }finally{__CLR4_4_113z413z4lc8azwpd.R.flushNeeded();}}

    public void testPartialDayOfYearAdd() {__CLR4_4_113z413z4lc8azwpd.R.globalSliceStart(getClass().getName(),52112);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12worqx147k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_113z413z4lc8azwpd.R.rethrow($CLV_t2$);}finally{__CLR4_4_113z413z4lc8azwpd.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestISOChronology.testPartialDayOfYearAdd",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),52112,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12worqx147k(){try{__CLR4_4_113z413z4lc8azwpd.R.inc(52112);
        __CLR4_4_113z413z4lc8azwpd.R.inc(52113);Partial start = new Partial().with(DateTimeFieldType.year(), 2000).with(DateTimeFieldType.dayOfYear(), 366);
        __CLR4_4_113z413z4lc8azwpd.R.inc(52114);Partial end = new Partial().with(DateTimeFieldType.year(), 2004).with(DateTimeFieldType.dayOfYear(), 366);
        __CLR4_4_113z413z4lc8azwpd.R.inc(52115);assertEquals(end, start.withFieldAdded(DurationFieldType.days(), 365 + 365 + 365 + 366));
        __CLR4_4_113z413z4lc8azwpd.R.inc(52116);assertEquals(start, end.withFieldAdded(DurationFieldType.days(), -(365 + 365 + 365 + 366)));
    }finally{__CLR4_4_113z413z4lc8azwpd.R.flushNeeded();}}

    public void testMaximumValue() {__CLR4_4_113z413z4lc8azwpd.R.globalSliceStart(getClass().getName(),52117);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qnw3be147p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_113z413z4lc8azwpd.R.rethrow($CLV_t2$);}finally{__CLR4_4_113z413z4lc8azwpd.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestISOChronology.testMaximumValue",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),52117,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qnw3be147p(){try{__CLR4_4_113z413z4lc8azwpd.R.inc(52117);
        __CLR4_4_113z413z4lc8azwpd.R.inc(52118);DateMidnight dt = new DateMidnight(1570, 1, 1);
        __CLR4_4_113z413z4lc8azwpd.R.inc(52119);while ((((dt.getYear() < 1590)&&(__CLR4_4_113z413z4lc8azwpd.R.iget(52120)!=0|true))||(__CLR4_4_113z413z4lc8azwpd.R.iget(52121)==0&false))) {{
            __CLR4_4_113z413z4lc8azwpd.R.inc(52122);dt = dt.plusDays(1);
            __CLR4_4_113z413z4lc8azwpd.R.inc(52123);YearMonthDay ymd = dt.toYearMonthDay();
            __CLR4_4_113z413z4lc8azwpd.R.inc(52124);assertEquals(dt.year().getMaximumValue(), ymd.year().getMaximumValue());
            __CLR4_4_113z413z4lc8azwpd.R.inc(52125);assertEquals(dt.monthOfYear().getMaximumValue(), ymd.monthOfYear().getMaximumValue());
            __CLR4_4_113z413z4lc8azwpd.R.inc(52126);assertEquals(dt.dayOfMonth().getMaximumValue(), ymd.dayOfMonth().getMaximumValue());
        }
    }}finally{__CLR4_4_113z413z4lc8azwpd.R.flushNeeded();}}

}
