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
 * This class is a Junit unit test for EthiopicChronology.
 *
 * @author Stephen Colebourne
 */
public class TestEthiopicChronology extends TestCase {static class __CLR4_4_1135r135rlc8azwmr{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672271031490L,8589935092L,51181,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final int MILLIS_PER_DAY = DateTimeConstants.MILLIS_PER_DAY;

    private static long SKIP = 1 * MILLIS_PER_DAY;

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    private static final DateTimeZone TOKYO = DateTimeZone.forID("Asia/Tokyo");
    private static final Chronology ETHIOPIC_UTC = EthiopicChronology.getInstanceUTC();
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

    public static void main(String[] args) {try{__CLR4_4_1135r135rlc8azwmr.R.inc(50751);
        __CLR4_4_1135r135rlc8azwmr.R.inc(50752);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1135r135rlc8azwmr.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1135r135rlc8azwmr.R.inc(50753);
        __CLR4_4_1135r135rlc8azwmr.R.inc(50754);SKIP = 1 * MILLIS_PER_DAY;
        __CLR4_4_1135r135rlc8azwmr.R.inc(50755);return new TestSuite(TestEthiopicChronology.class);
    }finally{__CLR4_4_1135r135rlc8azwmr.R.flushNeeded();}}

    public TestEthiopicChronology(String name) {
        super(name);__CLR4_4_1135r135rlc8azwmr.R.inc(50757);try{__CLR4_4_1135r135rlc8azwmr.R.inc(50756);
    }finally{__CLR4_4_1135r135rlc8azwmr.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1135r135rlc8azwmr.R.inc(50758);
        __CLR4_4_1135r135rlc8azwmr.R.inc(50759);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1135r135rlc8azwmr.R.inc(50760);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1135r135rlc8azwmr.R.inc(50761);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1135r135rlc8azwmr.R.inc(50762);originalLocale = Locale.getDefault();
        __CLR4_4_1135r135rlc8azwmr.R.inc(50763);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1135r135rlc8azwmr.R.inc(50764);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1135r135rlc8azwmr.R.inc(50765);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1135r135rlc8azwmr.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1135r135rlc8azwmr.R.inc(50766);
        __CLR4_4_1135r135rlc8azwmr.R.inc(50767);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1135r135rlc8azwmr.R.inc(50768);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1135r135rlc8azwmr.R.inc(50769);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1135r135rlc8azwmr.R.inc(50770);Locale.setDefault(originalLocale);
        __CLR4_4_1135r135rlc8azwmr.R.inc(50771);originalDateTimeZone = null;
        __CLR4_4_1135r135rlc8azwmr.R.inc(50772);originalTimeZone = null;
        __CLR4_4_1135r135rlc8azwmr.R.inc(50773);originalLocale = null;
    }finally{__CLR4_4_1135r135rlc8azwmr.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testFactoryUTC() {__CLR4_4_1135r135rlc8azwmr.R.globalSliceStart(getClass().getName(),50774);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19knvhv136e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1135r135rlc8azwmr.R.rethrow($CLV_t2$);}finally{__CLR4_4_1135r135rlc8azwmr.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestEthiopicChronology.testFactoryUTC",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),50774,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19knvhv136e(){try{__CLR4_4_1135r135rlc8azwmr.R.inc(50774);
        __CLR4_4_1135r135rlc8azwmr.R.inc(50775);assertEquals(DateTimeZone.UTC, EthiopicChronology.getInstanceUTC().getZone());
        __CLR4_4_1135r135rlc8azwmr.R.inc(50776);assertSame(EthiopicChronology.class, EthiopicChronology.getInstanceUTC().getClass());
    }finally{__CLR4_4_1135r135rlc8azwmr.R.flushNeeded();}}

    public void testFactory() {__CLR4_4_1135r135rlc8azwmr.R.globalSliceStart(getClass().getName(),50777);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_116tztt136h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1135r135rlc8azwmr.R.rethrow($CLV_t2$);}finally{__CLR4_4_1135r135rlc8azwmr.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestEthiopicChronology.testFactory",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),50777,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_116tztt136h(){try{__CLR4_4_1135r135rlc8azwmr.R.inc(50777);
        __CLR4_4_1135r135rlc8azwmr.R.inc(50778);assertEquals(LONDON, EthiopicChronology.getInstance().getZone());
        __CLR4_4_1135r135rlc8azwmr.R.inc(50779);assertSame(EthiopicChronology.class, EthiopicChronology.getInstance().getClass());
    }finally{__CLR4_4_1135r135rlc8azwmr.R.flushNeeded();}}

    public void testFactory_Zone() {__CLR4_4_1135r135rlc8azwmr.R.globalSliceStart(getClass().getName(),50780);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yy5ime136k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1135r135rlc8azwmr.R.rethrow($CLV_t2$);}finally{__CLR4_4_1135r135rlc8azwmr.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestEthiopicChronology.testFactory_Zone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),50780,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yy5ime136k(){try{__CLR4_4_1135r135rlc8azwmr.R.inc(50780);
        __CLR4_4_1135r135rlc8azwmr.R.inc(50781);assertEquals(TOKYO, EthiopicChronology.getInstance(TOKYO).getZone());
        __CLR4_4_1135r135rlc8azwmr.R.inc(50782);assertEquals(PARIS, EthiopicChronology.getInstance(PARIS).getZone());
        __CLR4_4_1135r135rlc8azwmr.R.inc(50783);assertEquals(LONDON, EthiopicChronology.getInstance(null).getZone());
        __CLR4_4_1135r135rlc8azwmr.R.inc(50784);assertSame(EthiopicChronology.class, EthiopicChronology.getInstance(TOKYO).getClass());
    }finally{__CLR4_4_1135r135rlc8azwmr.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testEquality() {__CLR4_4_1135r135rlc8azwmr.R.globalSliceStart(getClass().getName(),50785);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12agdql136p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1135r135rlc8azwmr.R.rethrow($CLV_t2$);}finally{__CLR4_4_1135r135rlc8azwmr.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestEthiopicChronology.testEquality",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),50785,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12agdql136p(){try{__CLR4_4_1135r135rlc8azwmr.R.inc(50785);
        __CLR4_4_1135r135rlc8azwmr.R.inc(50786);assertSame(EthiopicChronology.getInstance(TOKYO), EthiopicChronology.getInstance(TOKYO));
        __CLR4_4_1135r135rlc8azwmr.R.inc(50787);assertSame(EthiopicChronology.getInstance(LONDON), EthiopicChronology.getInstance(LONDON));
        __CLR4_4_1135r135rlc8azwmr.R.inc(50788);assertSame(EthiopicChronology.getInstance(PARIS), EthiopicChronology.getInstance(PARIS));
        __CLR4_4_1135r135rlc8azwmr.R.inc(50789);assertSame(EthiopicChronology.getInstanceUTC(), EthiopicChronology.getInstanceUTC());
        __CLR4_4_1135r135rlc8azwmr.R.inc(50790);assertSame(EthiopicChronology.getInstance(), EthiopicChronology.getInstance(LONDON));
    }finally{__CLR4_4_1135r135rlc8azwmr.R.flushNeeded();}}

    public void testWithUTC() {__CLR4_4_1135r135rlc8azwmr.R.globalSliceStart(getClass().getName(),50791);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19orv83136v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1135r135rlc8azwmr.R.rethrow($CLV_t2$);}finally{__CLR4_4_1135r135rlc8azwmr.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestEthiopicChronology.testWithUTC",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),50791,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19orv83136v(){try{__CLR4_4_1135r135rlc8azwmr.R.inc(50791);
        __CLR4_4_1135r135rlc8azwmr.R.inc(50792);assertSame(EthiopicChronology.getInstanceUTC(), EthiopicChronology.getInstance(LONDON).withUTC());
        __CLR4_4_1135r135rlc8azwmr.R.inc(50793);assertSame(EthiopicChronology.getInstanceUTC(), EthiopicChronology.getInstance(TOKYO).withUTC());
        __CLR4_4_1135r135rlc8azwmr.R.inc(50794);assertSame(EthiopicChronology.getInstanceUTC(), EthiopicChronology.getInstanceUTC().withUTC());
        __CLR4_4_1135r135rlc8azwmr.R.inc(50795);assertSame(EthiopicChronology.getInstanceUTC(), EthiopicChronology.getInstance().withUTC());
    }finally{__CLR4_4_1135r135rlc8azwmr.R.flushNeeded();}}

    public void testWithZone() {__CLR4_4_1135r135rlc8azwmr.R.globalSliceStart(getClass().getName(),50796);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1me3iet1370();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1135r135rlc8azwmr.R.rethrow($CLV_t2$);}finally{__CLR4_4_1135r135rlc8azwmr.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestEthiopicChronology.testWithZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),50796,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1me3iet1370(){try{__CLR4_4_1135r135rlc8azwmr.R.inc(50796);
        __CLR4_4_1135r135rlc8azwmr.R.inc(50797);assertSame(EthiopicChronology.getInstance(TOKYO), EthiopicChronology.getInstance(TOKYO).withZone(TOKYO));
        __CLR4_4_1135r135rlc8azwmr.R.inc(50798);assertSame(EthiopicChronology.getInstance(LONDON), EthiopicChronology.getInstance(TOKYO).withZone(LONDON));
        __CLR4_4_1135r135rlc8azwmr.R.inc(50799);assertSame(EthiopicChronology.getInstance(PARIS), EthiopicChronology.getInstance(TOKYO).withZone(PARIS));
        __CLR4_4_1135r135rlc8azwmr.R.inc(50800);assertSame(EthiopicChronology.getInstance(LONDON), EthiopicChronology.getInstance(TOKYO).withZone(null));
        __CLR4_4_1135r135rlc8azwmr.R.inc(50801);assertSame(EthiopicChronology.getInstance(PARIS), EthiopicChronology.getInstance().withZone(PARIS));
        __CLR4_4_1135r135rlc8azwmr.R.inc(50802);assertSame(EthiopicChronology.getInstance(PARIS), EthiopicChronology.getInstanceUTC().withZone(PARIS));
    }finally{__CLR4_4_1135r135rlc8azwmr.R.flushNeeded();}}

    public void testToString() {__CLR4_4_1135r135rlc8azwmr.R.globalSliceStart(getClass().getName(),50803);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hrxdid1377();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1135r135rlc8azwmr.R.rethrow($CLV_t2$);}finally{__CLR4_4_1135r135rlc8azwmr.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestEthiopicChronology.testToString",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),50803,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hrxdid1377(){try{__CLR4_4_1135r135rlc8azwmr.R.inc(50803);
        __CLR4_4_1135r135rlc8azwmr.R.inc(50804);assertEquals("EthiopicChronology[Europe/London]", EthiopicChronology.getInstance(LONDON).toString());
        __CLR4_4_1135r135rlc8azwmr.R.inc(50805);assertEquals("EthiopicChronology[Asia/Tokyo]", EthiopicChronology.getInstance(TOKYO).toString());
        __CLR4_4_1135r135rlc8azwmr.R.inc(50806);assertEquals("EthiopicChronology[Europe/London]", EthiopicChronology.getInstance().toString());
        __CLR4_4_1135r135rlc8azwmr.R.inc(50807);assertEquals("EthiopicChronology[UTC]", EthiopicChronology.getInstanceUTC().toString());
    }finally{__CLR4_4_1135r135rlc8azwmr.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testDurationFields() {__CLR4_4_1135r135rlc8azwmr.R.globalSliceStart(getClass().getName(),50808);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cnkzye137c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1135r135rlc8azwmr.R.rethrow($CLV_t2$);}finally{__CLR4_4_1135r135rlc8azwmr.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestEthiopicChronology.testDurationFields",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),50808,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cnkzye137c(){try{__CLR4_4_1135r135rlc8azwmr.R.inc(50808);
        __CLR4_4_1135r135rlc8azwmr.R.inc(50809);final EthiopicChronology ethiopic = EthiopicChronology.getInstance();
        __CLR4_4_1135r135rlc8azwmr.R.inc(50810);assertEquals("eras", ethiopic.eras().getName());
        __CLR4_4_1135r135rlc8azwmr.R.inc(50811);assertEquals("centuries", ethiopic.centuries().getName());
        __CLR4_4_1135r135rlc8azwmr.R.inc(50812);assertEquals("years", ethiopic.years().getName());
        __CLR4_4_1135r135rlc8azwmr.R.inc(50813);assertEquals("weekyears", ethiopic.weekyears().getName());
        __CLR4_4_1135r135rlc8azwmr.R.inc(50814);assertEquals("months", ethiopic.months().getName());
        __CLR4_4_1135r135rlc8azwmr.R.inc(50815);assertEquals("weeks", ethiopic.weeks().getName());
        __CLR4_4_1135r135rlc8azwmr.R.inc(50816);assertEquals("days", ethiopic.days().getName());
        __CLR4_4_1135r135rlc8azwmr.R.inc(50817);assertEquals("halfdays", ethiopic.halfdays().getName());
        __CLR4_4_1135r135rlc8azwmr.R.inc(50818);assertEquals("hours", ethiopic.hours().getName());
        __CLR4_4_1135r135rlc8azwmr.R.inc(50819);assertEquals("minutes", ethiopic.minutes().getName());
        __CLR4_4_1135r135rlc8azwmr.R.inc(50820);assertEquals("seconds", ethiopic.seconds().getName());
        __CLR4_4_1135r135rlc8azwmr.R.inc(50821);assertEquals("millis", ethiopic.millis().getName());
        
        __CLR4_4_1135r135rlc8azwmr.R.inc(50822);assertEquals(false, ethiopic.eras().isSupported());
        __CLR4_4_1135r135rlc8azwmr.R.inc(50823);assertEquals(true, ethiopic.centuries().isSupported());
        __CLR4_4_1135r135rlc8azwmr.R.inc(50824);assertEquals(true, ethiopic.years().isSupported());
        __CLR4_4_1135r135rlc8azwmr.R.inc(50825);assertEquals(true, ethiopic.weekyears().isSupported());
        __CLR4_4_1135r135rlc8azwmr.R.inc(50826);assertEquals(true, ethiopic.months().isSupported());
        __CLR4_4_1135r135rlc8azwmr.R.inc(50827);assertEquals(true, ethiopic.weeks().isSupported());
        __CLR4_4_1135r135rlc8azwmr.R.inc(50828);assertEquals(true, ethiopic.days().isSupported());
        __CLR4_4_1135r135rlc8azwmr.R.inc(50829);assertEquals(true, ethiopic.halfdays().isSupported());
        __CLR4_4_1135r135rlc8azwmr.R.inc(50830);assertEquals(true, ethiopic.hours().isSupported());
        __CLR4_4_1135r135rlc8azwmr.R.inc(50831);assertEquals(true, ethiopic.minutes().isSupported());
        __CLR4_4_1135r135rlc8azwmr.R.inc(50832);assertEquals(true, ethiopic.seconds().isSupported());
        __CLR4_4_1135r135rlc8azwmr.R.inc(50833);assertEquals(true, ethiopic.millis().isSupported());
        
        __CLR4_4_1135r135rlc8azwmr.R.inc(50834);assertEquals(false, ethiopic.centuries().isPrecise());
        __CLR4_4_1135r135rlc8azwmr.R.inc(50835);assertEquals(false, ethiopic.years().isPrecise());
        __CLR4_4_1135r135rlc8azwmr.R.inc(50836);assertEquals(false, ethiopic.weekyears().isPrecise());
        __CLR4_4_1135r135rlc8azwmr.R.inc(50837);assertEquals(false, ethiopic.months().isPrecise());
        __CLR4_4_1135r135rlc8azwmr.R.inc(50838);assertEquals(false, ethiopic.weeks().isPrecise());
        __CLR4_4_1135r135rlc8azwmr.R.inc(50839);assertEquals(false, ethiopic.days().isPrecise());
        __CLR4_4_1135r135rlc8azwmr.R.inc(50840);assertEquals(false, ethiopic.halfdays().isPrecise());
        __CLR4_4_1135r135rlc8azwmr.R.inc(50841);assertEquals(true, ethiopic.hours().isPrecise());
        __CLR4_4_1135r135rlc8azwmr.R.inc(50842);assertEquals(true, ethiopic.minutes().isPrecise());
        __CLR4_4_1135r135rlc8azwmr.R.inc(50843);assertEquals(true, ethiopic.seconds().isPrecise());
        __CLR4_4_1135r135rlc8azwmr.R.inc(50844);assertEquals(true, ethiopic.millis().isPrecise());
        
        __CLR4_4_1135r135rlc8azwmr.R.inc(50845);final EthiopicChronology ethiopicUTC = EthiopicChronology.getInstanceUTC();
        __CLR4_4_1135r135rlc8azwmr.R.inc(50846);assertEquals(false, ethiopicUTC.centuries().isPrecise());
        __CLR4_4_1135r135rlc8azwmr.R.inc(50847);assertEquals(false, ethiopicUTC.years().isPrecise());
        __CLR4_4_1135r135rlc8azwmr.R.inc(50848);assertEquals(false, ethiopicUTC.weekyears().isPrecise());
        __CLR4_4_1135r135rlc8azwmr.R.inc(50849);assertEquals(false, ethiopicUTC.months().isPrecise());
        __CLR4_4_1135r135rlc8azwmr.R.inc(50850);assertEquals(true, ethiopicUTC.weeks().isPrecise());
        __CLR4_4_1135r135rlc8azwmr.R.inc(50851);assertEquals(true, ethiopicUTC.days().isPrecise());
        __CLR4_4_1135r135rlc8azwmr.R.inc(50852);assertEquals(true, ethiopicUTC.halfdays().isPrecise());
        __CLR4_4_1135r135rlc8azwmr.R.inc(50853);assertEquals(true, ethiopicUTC.hours().isPrecise());
        __CLR4_4_1135r135rlc8azwmr.R.inc(50854);assertEquals(true, ethiopicUTC.minutes().isPrecise());
        __CLR4_4_1135r135rlc8azwmr.R.inc(50855);assertEquals(true, ethiopicUTC.seconds().isPrecise());
        __CLR4_4_1135r135rlc8azwmr.R.inc(50856);assertEquals(true, ethiopicUTC.millis().isPrecise());
        
        __CLR4_4_1135r135rlc8azwmr.R.inc(50857);final DateTimeZone gmt = DateTimeZone.forID("Etc/GMT");
        __CLR4_4_1135r135rlc8azwmr.R.inc(50858);final EthiopicChronology ethiopicGMT = EthiopicChronology.getInstance(gmt);
        __CLR4_4_1135r135rlc8azwmr.R.inc(50859);assertEquals(false, ethiopicGMT.centuries().isPrecise());
        __CLR4_4_1135r135rlc8azwmr.R.inc(50860);assertEquals(false, ethiopicGMT.years().isPrecise());
        __CLR4_4_1135r135rlc8azwmr.R.inc(50861);assertEquals(false, ethiopicGMT.weekyears().isPrecise());
        __CLR4_4_1135r135rlc8azwmr.R.inc(50862);assertEquals(false, ethiopicGMT.months().isPrecise());
        __CLR4_4_1135r135rlc8azwmr.R.inc(50863);assertEquals(true, ethiopicGMT.weeks().isPrecise());
        __CLR4_4_1135r135rlc8azwmr.R.inc(50864);assertEquals(true, ethiopicGMT.days().isPrecise());
        __CLR4_4_1135r135rlc8azwmr.R.inc(50865);assertEquals(true, ethiopicGMT.halfdays().isPrecise());
        __CLR4_4_1135r135rlc8azwmr.R.inc(50866);assertEquals(true, ethiopicGMT.hours().isPrecise());
        __CLR4_4_1135r135rlc8azwmr.R.inc(50867);assertEquals(true, ethiopicGMT.minutes().isPrecise());
        __CLR4_4_1135r135rlc8azwmr.R.inc(50868);assertEquals(true, ethiopicGMT.seconds().isPrecise());
        __CLR4_4_1135r135rlc8azwmr.R.inc(50869);assertEquals(true, ethiopicGMT.millis().isPrecise());
    }finally{__CLR4_4_1135r135rlc8azwmr.R.flushNeeded();}}

    public void testDateFields() {__CLR4_4_1135r135rlc8azwmr.R.globalSliceStart(getClass().getName(),50870);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gkspeo1392();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1135r135rlc8azwmr.R.rethrow($CLV_t2$);}finally{__CLR4_4_1135r135rlc8azwmr.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestEthiopicChronology.testDateFields",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),50870,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gkspeo1392(){try{__CLR4_4_1135r135rlc8azwmr.R.inc(50870);
        __CLR4_4_1135r135rlc8azwmr.R.inc(50871);final EthiopicChronology ethiopic = EthiopicChronology.getInstance();
        __CLR4_4_1135r135rlc8azwmr.R.inc(50872);assertEquals("era", ethiopic.era().getName());
        __CLR4_4_1135r135rlc8azwmr.R.inc(50873);assertEquals("centuryOfEra", ethiopic.centuryOfEra().getName());
        __CLR4_4_1135r135rlc8azwmr.R.inc(50874);assertEquals("yearOfCentury", ethiopic.yearOfCentury().getName());
        __CLR4_4_1135r135rlc8azwmr.R.inc(50875);assertEquals("yearOfEra", ethiopic.yearOfEra().getName());
        __CLR4_4_1135r135rlc8azwmr.R.inc(50876);assertEquals("year", ethiopic.year().getName());
        __CLR4_4_1135r135rlc8azwmr.R.inc(50877);assertEquals("monthOfYear", ethiopic.monthOfYear().getName());
        __CLR4_4_1135r135rlc8azwmr.R.inc(50878);assertEquals("weekyearOfCentury", ethiopic.weekyearOfCentury().getName());
        __CLR4_4_1135r135rlc8azwmr.R.inc(50879);assertEquals("weekyear", ethiopic.weekyear().getName());
        __CLR4_4_1135r135rlc8azwmr.R.inc(50880);assertEquals("weekOfWeekyear", ethiopic.weekOfWeekyear().getName());
        __CLR4_4_1135r135rlc8azwmr.R.inc(50881);assertEquals("dayOfYear", ethiopic.dayOfYear().getName());
        __CLR4_4_1135r135rlc8azwmr.R.inc(50882);assertEquals("dayOfMonth", ethiopic.dayOfMonth().getName());
        __CLR4_4_1135r135rlc8azwmr.R.inc(50883);assertEquals("dayOfWeek", ethiopic.dayOfWeek().getName());
        
        __CLR4_4_1135r135rlc8azwmr.R.inc(50884);assertEquals(true, ethiopic.era().isSupported());
        __CLR4_4_1135r135rlc8azwmr.R.inc(50885);assertEquals(true, ethiopic.centuryOfEra().isSupported());
        __CLR4_4_1135r135rlc8azwmr.R.inc(50886);assertEquals(true, ethiopic.yearOfCentury().isSupported());
        __CLR4_4_1135r135rlc8azwmr.R.inc(50887);assertEquals(true, ethiopic.yearOfEra().isSupported());
        __CLR4_4_1135r135rlc8azwmr.R.inc(50888);assertEquals(true, ethiopic.year().isSupported());
        __CLR4_4_1135r135rlc8azwmr.R.inc(50889);assertEquals(true, ethiopic.monthOfYear().isSupported());
        __CLR4_4_1135r135rlc8azwmr.R.inc(50890);assertEquals(true, ethiopic.weekyearOfCentury().isSupported());
        __CLR4_4_1135r135rlc8azwmr.R.inc(50891);assertEquals(true, ethiopic.weekyear().isSupported());
        __CLR4_4_1135r135rlc8azwmr.R.inc(50892);assertEquals(true, ethiopic.weekOfWeekyear().isSupported());
        __CLR4_4_1135r135rlc8azwmr.R.inc(50893);assertEquals(true, ethiopic.dayOfYear().isSupported());
        __CLR4_4_1135r135rlc8azwmr.R.inc(50894);assertEquals(true, ethiopic.dayOfMonth().isSupported());
        __CLR4_4_1135r135rlc8azwmr.R.inc(50895);assertEquals(true, ethiopic.dayOfWeek().isSupported());
        
        __CLR4_4_1135r135rlc8azwmr.R.inc(50896);assertEquals(ethiopic.eras(), ethiopic.era().getDurationField());
        __CLR4_4_1135r135rlc8azwmr.R.inc(50897);assertEquals(ethiopic.centuries(), ethiopic.centuryOfEra().getDurationField());
        __CLR4_4_1135r135rlc8azwmr.R.inc(50898);assertEquals(ethiopic.years(), ethiopic.yearOfCentury().getDurationField());
        __CLR4_4_1135r135rlc8azwmr.R.inc(50899);assertEquals(ethiopic.years(), ethiopic.yearOfEra().getDurationField());
        __CLR4_4_1135r135rlc8azwmr.R.inc(50900);assertEquals(ethiopic.years(), ethiopic.year().getDurationField());
        __CLR4_4_1135r135rlc8azwmr.R.inc(50901);assertEquals(ethiopic.months(), ethiopic.monthOfYear().getDurationField());
        __CLR4_4_1135r135rlc8azwmr.R.inc(50902);assertEquals(ethiopic.weekyears(), ethiopic.weekyearOfCentury().getDurationField());
        __CLR4_4_1135r135rlc8azwmr.R.inc(50903);assertEquals(ethiopic.weekyears(), ethiopic.weekyear().getDurationField());
        __CLR4_4_1135r135rlc8azwmr.R.inc(50904);assertEquals(ethiopic.weeks(), ethiopic.weekOfWeekyear().getDurationField());
        __CLR4_4_1135r135rlc8azwmr.R.inc(50905);assertEquals(ethiopic.days(), ethiopic.dayOfYear().getDurationField());
        __CLR4_4_1135r135rlc8azwmr.R.inc(50906);assertEquals(ethiopic.days(), ethiopic.dayOfMonth().getDurationField());
        __CLR4_4_1135r135rlc8azwmr.R.inc(50907);assertEquals(ethiopic.days(), ethiopic.dayOfWeek().getDurationField());
        
        __CLR4_4_1135r135rlc8azwmr.R.inc(50908);assertEquals(null, ethiopic.era().getRangeDurationField());
        __CLR4_4_1135r135rlc8azwmr.R.inc(50909);assertEquals(ethiopic.eras(), ethiopic.centuryOfEra().getRangeDurationField());
        __CLR4_4_1135r135rlc8azwmr.R.inc(50910);assertEquals(ethiopic.centuries(), ethiopic.yearOfCentury().getRangeDurationField());
        __CLR4_4_1135r135rlc8azwmr.R.inc(50911);assertEquals(ethiopic.eras(), ethiopic.yearOfEra().getRangeDurationField());
        __CLR4_4_1135r135rlc8azwmr.R.inc(50912);assertEquals(null, ethiopic.year().getRangeDurationField());
        __CLR4_4_1135r135rlc8azwmr.R.inc(50913);assertEquals(ethiopic.years(), ethiopic.monthOfYear().getRangeDurationField());
        __CLR4_4_1135r135rlc8azwmr.R.inc(50914);assertEquals(ethiopic.centuries(), ethiopic.weekyearOfCentury().getRangeDurationField());
        __CLR4_4_1135r135rlc8azwmr.R.inc(50915);assertEquals(null, ethiopic.weekyear().getRangeDurationField());
        __CLR4_4_1135r135rlc8azwmr.R.inc(50916);assertEquals(ethiopic.weekyears(), ethiopic.weekOfWeekyear().getRangeDurationField());
        __CLR4_4_1135r135rlc8azwmr.R.inc(50917);assertEquals(ethiopic.years(), ethiopic.dayOfYear().getRangeDurationField());
        __CLR4_4_1135r135rlc8azwmr.R.inc(50918);assertEquals(ethiopic.months(), ethiopic.dayOfMonth().getRangeDurationField());
        __CLR4_4_1135r135rlc8azwmr.R.inc(50919);assertEquals(ethiopic.weeks(), ethiopic.dayOfWeek().getRangeDurationField());
    }finally{__CLR4_4_1135r135rlc8azwmr.R.flushNeeded();}}

    public void testTimeFields() {__CLR4_4_1135r135rlc8azwmr.R.globalSliceStart(getClass().getName(),50920);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11r11up13ag();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1135r135rlc8azwmr.R.rethrow($CLV_t2$);}finally{__CLR4_4_1135r135rlc8azwmr.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestEthiopicChronology.testTimeFields",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),50920,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11r11up13ag(){try{__CLR4_4_1135r135rlc8azwmr.R.inc(50920);
        __CLR4_4_1135r135rlc8azwmr.R.inc(50921);final EthiopicChronology ethiopic = EthiopicChronology.getInstance();
        __CLR4_4_1135r135rlc8azwmr.R.inc(50922);assertEquals("halfdayOfDay", ethiopic.halfdayOfDay().getName());
        __CLR4_4_1135r135rlc8azwmr.R.inc(50923);assertEquals("clockhourOfHalfday", ethiopic.clockhourOfHalfday().getName());
        __CLR4_4_1135r135rlc8azwmr.R.inc(50924);assertEquals("hourOfHalfday", ethiopic.hourOfHalfday().getName());
        __CLR4_4_1135r135rlc8azwmr.R.inc(50925);assertEquals("clockhourOfDay", ethiopic.clockhourOfDay().getName());
        __CLR4_4_1135r135rlc8azwmr.R.inc(50926);assertEquals("hourOfDay", ethiopic.hourOfDay().getName());
        __CLR4_4_1135r135rlc8azwmr.R.inc(50927);assertEquals("minuteOfDay", ethiopic.minuteOfDay().getName());
        __CLR4_4_1135r135rlc8azwmr.R.inc(50928);assertEquals("minuteOfHour", ethiopic.minuteOfHour().getName());
        __CLR4_4_1135r135rlc8azwmr.R.inc(50929);assertEquals("secondOfDay", ethiopic.secondOfDay().getName());
        __CLR4_4_1135r135rlc8azwmr.R.inc(50930);assertEquals("secondOfMinute", ethiopic.secondOfMinute().getName());
        __CLR4_4_1135r135rlc8azwmr.R.inc(50931);assertEquals("millisOfDay", ethiopic.millisOfDay().getName());
        __CLR4_4_1135r135rlc8azwmr.R.inc(50932);assertEquals("millisOfSecond", ethiopic.millisOfSecond().getName());
        
        __CLR4_4_1135r135rlc8azwmr.R.inc(50933);assertEquals(true, ethiopic.halfdayOfDay().isSupported());
        __CLR4_4_1135r135rlc8azwmr.R.inc(50934);assertEquals(true, ethiopic.clockhourOfHalfday().isSupported());
        __CLR4_4_1135r135rlc8azwmr.R.inc(50935);assertEquals(true, ethiopic.hourOfHalfday().isSupported());
        __CLR4_4_1135r135rlc8azwmr.R.inc(50936);assertEquals(true, ethiopic.clockhourOfDay().isSupported());
        __CLR4_4_1135r135rlc8azwmr.R.inc(50937);assertEquals(true, ethiopic.hourOfDay().isSupported());
        __CLR4_4_1135r135rlc8azwmr.R.inc(50938);assertEquals(true, ethiopic.minuteOfDay().isSupported());
        __CLR4_4_1135r135rlc8azwmr.R.inc(50939);assertEquals(true, ethiopic.minuteOfHour().isSupported());
        __CLR4_4_1135r135rlc8azwmr.R.inc(50940);assertEquals(true, ethiopic.secondOfDay().isSupported());
        __CLR4_4_1135r135rlc8azwmr.R.inc(50941);assertEquals(true, ethiopic.secondOfMinute().isSupported());
        __CLR4_4_1135r135rlc8azwmr.R.inc(50942);assertEquals(true, ethiopic.millisOfDay().isSupported());
        __CLR4_4_1135r135rlc8azwmr.R.inc(50943);assertEquals(true, ethiopic.millisOfSecond().isSupported());
    }finally{__CLR4_4_1135r135rlc8azwmr.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testEpoch() {__CLR4_4_1135r135rlc8azwmr.R.globalSliceStart(getClass().getName(),50944);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19p7wci13b4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1135r135rlc8azwmr.R.rethrow($CLV_t2$);}finally{__CLR4_4_1135r135rlc8azwmr.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestEthiopicChronology.testEpoch",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),50944,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19p7wci13b4(){try{__CLR4_4_1135r135rlc8azwmr.R.inc(50944);
        __CLR4_4_1135r135rlc8azwmr.R.inc(50945);DateTime epoch = new DateTime(1, 1, 1, 0, 0, 0, 0, ETHIOPIC_UTC);
        __CLR4_4_1135r135rlc8azwmr.R.inc(50946);assertEquals(new DateTime(8, 8, 29, 0, 0, 0, 0, JULIAN_UTC), epoch.withChronology(JULIAN_UTC));
    }finally{__CLR4_4_1135r135rlc8azwmr.R.flushNeeded();}}

    public void testEra() {__CLR4_4_1135r135rlc8azwmr.R.globalSliceStart(getClass().getName(),50947);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13euvzd13b7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1135r135rlc8azwmr.R.rethrow($CLV_t2$);}finally{__CLR4_4_1135r135rlc8azwmr.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestEthiopicChronology.testEra",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),50947,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13euvzd13b7(){try{__CLR4_4_1135r135rlc8azwmr.R.inc(50947);
        __CLR4_4_1135r135rlc8azwmr.R.inc(50948);assertEquals(1, EthiopicChronology.EE);
        __CLR4_4_1135r135rlc8azwmr.R.inc(50949);try {
            __CLR4_4_1135r135rlc8azwmr.R.inc(50950);new DateTime(-1, 13, 5, 0, 0, 0, 0, ETHIOPIC_UTC);
            __CLR4_4_1135r135rlc8azwmr.R.inc(50951);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1135r135rlc8azwmr.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Tests era, year, monthOfYear, dayOfMonth and dayOfWeek.
     */
    public void testCalendar() {__CLR4_4_1135r135rlc8azwmr.R.globalSliceStart(getClass().getName(),50952);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1odnsqf13bc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1135r135rlc8azwmr.R.rethrow($CLV_t2$);}finally{__CLR4_4_1135r135rlc8azwmr.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestEthiopicChronology.testCalendar",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),50952,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1odnsqf13bc(){try{__CLR4_4_1135r135rlc8azwmr.R.inc(50952);
        __CLR4_4_1135r135rlc8azwmr.R.inc(50953);if ((((TestAll.FAST)&&(__CLR4_4_1135r135rlc8azwmr.R.iget(50954)!=0|true))||(__CLR4_4_1135r135rlc8azwmr.R.iget(50955)==0&false))) {{
            __CLR4_4_1135r135rlc8azwmr.R.inc(50956);return;
        }
        }__CLR4_4_1135r135rlc8azwmr.R.inc(50957);System.out.println("\nTestEthiopicChronology.testCalendar");
        __CLR4_4_1135r135rlc8azwmr.R.inc(50958);DateTime epoch = new DateTime(1, 1, 1, 0, 0, 0, 0, ETHIOPIC_UTC);
        __CLR4_4_1135r135rlc8azwmr.R.inc(50959);long millis = epoch.getMillis();
        __CLR4_4_1135r135rlc8azwmr.R.inc(50960);long end = new DateTime(3000, 1, 1, 0, 0, 0, 0, ISO_UTC).getMillis();
        __CLR4_4_1135r135rlc8azwmr.R.inc(50961);DateTimeField dayOfWeek = ETHIOPIC_UTC.dayOfWeek();
        __CLR4_4_1135r135rlc8azwmr.R.inc(50962);DateTimeField dayOfYear = ETHIOPIC_UTC.dayOfYear();
        __CLR4_4_1135r135rlc8azwmr.R.inc(50963);DateTimeField dayOfMonth = ETHIOPIC_UTC.dayOfMonth();
        __CLR4_4_1135r135rlc8azwmr.R.inc(50964);DateTimeField monthOfYear = ETHIOPIC_UTC.monthOfYear();
        __CLR4_4_1135r135rlc8azwmr.R.inc(50965);DateTimeField year = ETHIOPIC_UTC.year();
        __CLR4_4_1135r135rlc8azwmr.R.inc(50966);DateTimeField yearOfEra = ETHIOPIC_UTC.yearOfEra();
        __CLR4_4_1135r135rlc8azwmr.R.inc(50967);DateTimeField era = ETHIOPIC_UTC.era();
        __CLR4_4_1135r135rlc8azwmr.R.inc(50968);int expectedDOW = new DateTime(8, 8, 29, 0, 0, 0, 0, JULIAN_UTC).getDayOfWeek();
        __CLR4_4_1135r135rlc8azwmr.R.inc(50969);int expectedDOY = 1;
        __CLR4_4_1135r135rlc8azwmr.R.inc(50970);int expectedDay = 1;
        __CLR4_4_1135r135rlc8azwmr.R.inc(50971);int expectedMonth = 1;
        __CLR4_4_1135r135rlc8azwmr.R.inc(50972);int expectedYear = 1;
        __CLR4_4_1135r135rlc8azwmr.R.inc(50973);while ((((millis < end)&&(__CLR4_4_1135r135rlc8azwmr.R.iget(50974)!=0|true))||(__CLR4_4_1135r135rlc8azwmr.R.iget(50975)==0&false))) {{
            __CLR4_4_1135r135rlc8azwmr.R.inc(50976);int dowValue = dayOfWeek.get(millis);
            __CLR4_4_1135r135rlc8azwmr.R.inc(50977);int doyValue = dayOfYear.get(millis);
            __CLR4_4_1135r135rlc8azwmr.R.inc(50978);int dayValue = dayOfMonth.get(millis);
            __CLR4_4_1135r135rlc8azwmr.R.inc(50979);int monthValue = monthOfYear.get(millis);
            __CLR4_4_1135r135rlc8azwmr.R.inc(50980);int yearValue = year.get(millis);
            __CLR4_4_1135r135rlc8azwmr.R.inc(50981);int yearOfEraValue = yearOfEra.get(millis);
            __CLR4_4_1135r135rlc8azwmr.R.inc(50982);int monthLen = dayOfMonth.getMaximumValue(millis);
            __CLR4_4_1135r135rlc8azwmr.R.inc(50983);if ((((monthValue < 1 || monthValue > 13)&&(__CLR4_4_1135r135rlc8azwmr.R.iget(50984)!=0|true))||(__CLR4_4_1135r135rlc8azwmr.R.iget(50985)==0&false))) {{
                __CLR4_4_1135r135rlc8azwmr.R.inc(50986);fail("Bad month: " + millis);
            }
            
            // test era
            }__CLR4_4_1135r135rlc8azwmr.R.inc(50987);assertEquals(1, era.get(millis));
            __CLR4_4_1135r135rlc8azwmr.R.inc(50988);assertEquals("EE", era.getAsText(millis));
            __CLR4_4_1135r135rlc8azwmr.R.inc(50989);assertEquals("EE", era.getAsShortText(millis));
            
            // test date
            __CLR4_4_1135r135rlc8azwmr.R.inc(50990);assertEquals(expectedYear, yearValue);
            __CLR4_4_1135r135rlc8azwmr.R.inc(50991);assertEquals(expectedYear, yearOfEraValue);
            __CLR4_4_1135r135rlc8azwmr.R.inc(50992);assertEquals(expectedMonth, monthValue);
            __CLR4_4_1135r135rlc8azwmr.R.inc(50993);assertEquals(expectedDay, dayValue);
            __CLR4_4_1135r135rlc8azwmr.R.inc(50994);assertEquals(expectedDOW, dowValue);
            __CLR4_4_1135r135rlc8azwmr.R.inc(50995);assertEquals(expectedDOY, doyValue);
            
            // test leap year
            __CLR4_4_1135r135rlc8azwmr.R.inc(50996);assertEquals(yearValue % 4 == 3, year.isLeap(millis));
            
            // test month length
            __CLR4_4_1135r135rlc8azwmr.R.inc(50997);if ((((monthValue == 13)&&(__CLR4_4_1135r135rlc8azwmr.R.iget(50998)!=0|true))||(__CLR4_4_1135r135rlc8azwmr.R.iget(50999)==0&false))) {{
                __CLR4_4_1135r135rlc8azwmr.R.inc(51000);assertEquals(yearValue % 4 == 3, monthOfYear.isLeap(millis));
                __CLR4_4_1135r135rlc8azwmr.R.inc(51001);if ((((yearValue % 4 == 3)&&(__CLR4_4_1135r135rlc8azwmr.R.iget(51002)!=0|true))||(__CLR4_4_1135r135rlc8azwmr.R.iget(51003)==0&false))) {{
                    __CLR4_4_1135r135rlc8azwmr.R.inc(51004);assertEquals(6, monthLen);
                } }else {{
                    __CLR4_4_1135r135rlc8azwmr.R.inc(51005);assertEquals(5, monthLen);
                }
            }} }else {{
                __CLR4_4_1135r135rlc8azwmr.R.inc(51006);assertEquals(30, monthLen);
            }
            
            // recalculate date
            }__CLR4_4_1135r135rlc8azwmr.R.inc(51007);expectedDOW = (((expectedDOW + 1) - 1) % 7) + 1;
            __CLR4_4_1135r135rlc8azwmr.R.inc(51008);expectedDay++;
            __CLR4_4_1135r135rlc8azwmr.R.inc(51009);expectedDOY++;
            __CLR4_4_1135r135rlc8azwmr.R.inc(51010);if ((((expectedDay == 31 && expectedMonth < 13)&&(__CLR4_4_1135r135rlc8azwmr.R.iget(51011)!=0|true))||(__CLR4_4_1135r135rlc8azwmr.R.iget(51012)==0&false))) {{
                __CLR4_4_1135r135rlc8azwmr.R.inc(51013);expectedDay = 1;
                __CLR4_4_1135r135rlc8azwmr.R.inc(51014);expectedMonth++;
            } }else {__CLR4_4_1135r135rlc8azwmr.R.inc(51015);if ((((expectedMonth == 13)&&(__CLR4_4_1135r135rlc8azwmr.R.iget(51016)!=0|true))||(__CLR4_4_1135r135rlc8azwmr.R.iget(51017)==0&false))) {{
                __CLR4_4_1135r135rlc8azwmr.R.inc(51018);if ((((expectedYear % 4 == 3 && expectedDay == 7)&&(__CLR4_4_1135r135rlc8azwmr.R.iget(51019)!=0|true))||(__CLR4_4_1135r135rlc8azwmr.R.iget(51020)==0&false))) {{
                    __CLR4_4_1135r135rlc8azwmr.R.inc(51021);expectedDay = 1;
                    __CLR4_4_1135r135rlc8azwmr.R.inc(51022);expectedMonth = 1;
                    __CLR4_4_1135r135rlc8azwmr.R.inc(51023);expectedYear++;
                    __CLR4_4_1135r135rlc8azwmr.R.inc(51024);expectedDOY = 1;
                } }else {__CLR4_4_1135r135rlc8azwmr.R.inc(51025);if ((((expectedYear % 4 != 3 && expectedDay == 6)&&(__CLR4_4_1135r135rlc8azwmr.R.iget(51026)!=0|true))||(__CLR4_4_1135r135rlc8azwmr.R.iget(51027)==0&false))) {{
                    __CLR4_4_1135r135rlc8azwmr.R.inc(51028);expectedDay = 1;
                    __CLR4_4_1135r135rlc8azwmr.R.inc(51029);expectedMonth = 1;
                    __CLR4_4_1135r135rlc8azwmr.R.inc(51030);expectedYear++;
                    __CLR4_4_1135r135rlc8azwmr.R.inc(51031);expectedDOY = 1;
                }
            }}}
            }}__CLR4_4_1135r135rlc8azwmr.R.inc(51032);millis += SKIP;
        }
    }}finally{__CLR4_4_1135r135rlc8azwmr.R.flushNeeded();}}

    public void testSampleDate() {__CLR4_4_1135r135rlc8azwmr.R.globalSliceStart(getClass().getName(),51033);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vytbnz13dl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1135r135rlc8azwmr.R.rethrow($CLV_t2$);}finally{__CLR4_4_1135r135rlc8azwmr.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestEthiopicChronology.testSampleDate",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),51033,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vytbnz13dl(){try{__CLR4_4_1135r135rlc8azwmr.R.inc(51033);
        __CLR4_4_1135r135rlc8azwmr.R.inc(51034);DateTime dt = new DateTime(2004, 6, 9, 0, 0, 0, 0, ISO_UTC).withChronology(ETHIOPIC_UTC);
        __CLR4_4_1135r135rlc8azwmr.R.inc(51035);assertEquals(EthiopicChronology.EE, dt.getEra());
        __CLR4_4_1135r135rlc8azwmr.R.inc(51036);assertEquals(20, dt.getCenturyOfEra());  // TODO confirm
        __CLR4_4_1135r135rlc8azwmr.R.inc(51037);assertEquals(96, dt.getYearOfCentury());
        __CLR4_4_1135r135rlc8azwmr.R.inc(51038);assertEquals(1996, dt.getYearOfEra());
        
        __CLR4_4_1135r135rlc8azwmr.R.inc(51039);assertEquals(1996, dt.getYear());
        __CLR4_4_1135r135rlc8azwmr.R.inc(51040);Property fld = dt.year();
        __CLR4_4_1135r135rlc8azwmr.R.inc(51041);assertEquals(false, fld.isLeap());
        __CLR4_4_1135r135rlc8azwmr.R.inc(51042);assertEquals(0, fld.getLeapAmount());
        __CLR4_4_1135r135rlc8azwmr.R.inc(51043);assertEquals(DurationFieldType.days(), fld.getLeapDurationField().getType());
        __CLR4_4_1135r135rlc8azwmr.R.inc(51044);assertEquals(new DateTime(1997, 10, 2, 0, 0, 0, 0, ETHIOPIC_UTC), fld.addToCopy(1));
        
        __CLR4_4_1135r135rlc8azwmr.R.inc(51045);assertEquals(10, dt.getMonthOfYear());
        __CLR4_4_1135r135rlc8azwmr.R.inc(51046);fld = dt.monthOfYear();
        __CLR4_4_1135r135rlc8azwmr.R.inc(51047);assertEquals(false, fld.isLeap());
        __CLR4_4_1135r135rlc8azwmr.R.inc(51048);assertEquals(0, fld.getLeapAmount());
        __CLR4_4_1135r135rlc8azwmr.R.inc(51049);assertEquals(DurationFieldType.days(), fld.getLeapDurationField().getType());
        __CLR4_4_1135r135rlc8azwmr.R.inc(51050);assertEquals(1, fld.getMinimumValue());
        __CLR4_4_1135r135rlc8azwmr.R.inc(51051);assertEquals(1, fld.getMinimumValueOverall());
        __CLR4_4_1135r135rlc8azwmr.R.inc(51052);assertEquals(13, fld.getMaximumValue());
        __CLR4_4_1135r135rlc8azwmr.R.inc(51053);assertEquals(13, fld.getMaximumValueOverall());
        __CLR4_4_1135r135rlc8azwmr.R.inc(51054);assertEquals(new DateTime(1997, 1, 2, 0, 0, 0, 0, ETHIOPIC_UTC), fld.addToCopy(4));
        __CLR4_4_1135r135rlc8azwmr.R.inc(51055);assertEquals(new DateTime(1996, 1, 2, 0, 0, 0, 0, ETHIOPIC_UTC), fld.addWrapFieldToCopy(4));
        
        __CLR4_4_1135r135rlc8azwmr.R.inc(51056);assertEquals(2, dt.getDayOfMonth());
        __CLR4_4_1135r135rlc8azwmr.R.inc(51057);fld = dt.dayOfMonth();
        __CLR4_4_1135r135rlc8azwmr.R.inc(51058);assertEquals(false, fld.isLeap());
        __CLR4_4_1135r135rlc8azwmr.R.inc(51059);assertEquals(0, fld.getLeapAmount());
        __CLR4_4_1135r135rlc8azwmr.R.inc(51060);assertEquals(null, fld.getLeapDurationField());
        __CLR4_4_1135r135rlc8azwmr.R.inc(51061);assertEquals(1, fld.getMinimumValue());
        __CLR4_4_1135r135rlc8azwmr.R.inc(51062);assertEquals(1, fld.getMinimumValueOverall());
        __CLR4_4_1135r135rlc8azwmr.R.inc(51063);assertEquals(30, fld.getMaximumValue());
        __CLR4_4_1135r135rlc8azwmr.R.inc(51064);assertEquals(30, fld.getMaximumValueOverall());
        __CLR4_4_1135r135rlc8azwmr.R.inc(51065);assertEquals(new DateTime(1996, 10, 3, 0, 0, 0, 0, ETHIOPIC_UTC), fld.addToCopy(1));
        
        __CLR4_4_1135r135rlc8azwmr.R.inc(51066);assertEquals(DateTimeConstants.WEDNESDAY, dt.getDayOfWeek());
        __CLR4_4_1135r135rlc8azwmr.R.inc(51067);fld = dt.dayOfWeek();
        __CLR4_4_1135r135rlc8azwmr.R.inc(51068);assertEquals(false, fld.isLeap());
        __CLR4_4_1135r135rlc8azwmr.R.inc(51069);assertEquals(0, fld.getLeapAmount());
        __CLR4_4_1135r135rlc8azwmr.R.inc(51070);assertEquals(null, fld.getLeapDurationField());
        __CLR4_4_1135r135rlc8azwmr.R.inc(51071);assertEquals(1, fld.getMinimumValue());
        __CLR4_4_1135r135rlc8azwmr.R.inc(51072);assertEquals(1, fld.getMinimumValueOverall());
        __CLR4_4_1135r135rlc8azwmr.R.inc(51073);assertEquals(7, fld.getMaximumValue());
        __CLR4_4_1135r135rlc8azwmr.R.inc(51074);assertEquals(7, fld.getMaximumValueOverall());
        __CLR4_4_1135r135rlc8azwmr.R.inc(51075);assertEquals(new DateTime(1996, 10, 3, 0, 0, 0, 0, ETHIOPIC_UTC), fld.addToCopy(1));
        
        __CLR4_4_1135r135rlc8azwmr.R.inc(51076);assertEquals(9 * 30 + 2, dt.getDayOfYear());
        __CLR4_4_1135r135rlc8azwmr.R.inc(51077);fld = dt.dayOfYear();
        __CLR4_4_1135r135rlc8azwmr.R.inc(51078);assertEquals(false, fld.isLeap());
        __CLR4_4_1135r135rlc8azwmr.R.inc(51079);assertEquals(0, fld.getLeapAmount());
        __CLR4_4_1135r135rlc8azwmr.R.inc(51080);assertEquals(null, fld.getLeapDurationField());
        __CLR4_4_1135r135rlc8azwmr.R.inc(51081);assertEquals(1, fld.getMinimumValue());
        __CLR4_4_1135r135rlc8azwmr.R.inc(51082);assertEquals(1, fld.getMinimumValueOverall());
        __CLR4_4_1135r135rlc8azwmr.R.inc(51083);assertEquals(365, fld.getMaximumValue());
        __CLR4_4_1135r135rlc8azwmr.R.inc(51084);assertEquals(366, fld.getMaximumValueOverall());
        __CLR4_4_1135r135rlc8azwmr.R.inc(51085);assertEquals(new DateTime(1996, 10, 3, 0, 0, 0, 0, ETHIOPIC_UTC), fld.addToCopy(1));
        
        __CLR4_4_1135r135rlc8azwmr.R.inc(51086);assertEquals(0, dt.getHourOfDay());
        __CLR4_4_1135r135rlc8azwmr.R.inc(51087);assertEquals(0, dt.getMinuteOfHour());
        __CLR4_4_1135r135rlc8azwmr.R.inc(51088);assertEquals(0, dt.getSecondOfMinute());
        __CLR4_4_1135r135rlc8azwmr.R.inc(51089);assertEquals(0, dt.getMillisOfSecond());
    }finally{__CLR4_4_1135r135rlc8azwmr.R.flushNeeded();}}

    public void testSampleDateWithZone() {__CLR4_4_1135r135rlc8azwmr.R.globalSliceStart(getClass().getName(),51090);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gh4f6l13f6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1135r135rlc8azwmr.R.rethrow($CLV_t2$);}finally{__CLR4_4_1135r135rlc8azwmr.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestEthiopicChronology.testSampleDateWithZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),51090,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gh4f6l13f6(){try{__CLR4_4_1135r135rlc8azwmr.R.inc(51090);
        __CLR4_4_1135r135rlc8azwmr.R.inc(51091);DateTime dt = new DateTime(2004, 6, 9, 12, 0, 0, 0, PARIS).withChronology(ETHIOPIC_UTC);
        __CLR4_4_1135r135rlc8azwmr.R.inc(51092);assertEquals(EthiopicChronology.EE, dt.getEra());
        __CLR4_4_1135r135rlc8azwmr.R.inc(51093);assertEquals(1996, dt.getYear());
        __CLR4_4_1135r135rlc8azwmr.R.inc(51094);assertEquals(1996, dt.getYearOfEra());
        __CLR4_4_1135r135rlc8azwmr.R.inc(51095);assertEquals(10, dt.getMonthOfYear());
        __CLR4_4_1135r135rlc8azwmr.R.inc(51096);assertEquals(2, dt.getDayOfMonth());
        __CLR4_4_1135r135rlc8azwmr.R.inc(51097);assertEquals(10, dt.getHourOfDay());  // PARIS is UTC+2 in summer (12-2=10)
        __CLR4_4_1135r135rlc8azwmr.R.inc(51098);assertEquals(0, dt.getMinuteOfHour());
        __CLR4_4_1135r135rlc8azwmr.R.inc(51099);assertEquals(0, dt.getSecondOfMinute());
        __CLR4_4_1135r135rlc8azwmr.R.inc(51100);assertEquals(0, dt.getMillisOfSecond());
    }finally{__CLR4_4_1135r135rlc8azwmr.R.flushNeeded();}}

    public void testDurationYear() {__CLR4_4_1135r135rlc8azwmr.R.globalSliceStart(getClass().getName(),51101);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14rec9613fh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1135r135rlc8azwmr.R.rethrow($CLV_t2$);}finally{__CLR4_4_1135r135rlc8azwmr.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestEthiopicChronology.testDurationYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),51101,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14rec9613fh(){try{__CLR4_4_1135r135rlc8azwmr.R.inc(51101);
        // Leap 1999, NotLeap 1996,97,98
        __CLR4_4_1135r135rlc8azwmr.R.inc(51102);DateTime dt96 = new DateTime(1996, 10, 2, 0, 0, 0, 0, ETHIOPIC_UTC);
        __CLR4_4_1135r135rlc8azwmr.R.inc(51103);DateTime dt97 = new DateTime(1997, 10, 2, 0, 0, 0, 0, ETHIOPIC_UTC);
        __CLR4_4_1135r135rlc8azwmr.R.inc(51104);DateTime dt98 = new DateTime(1998, 10, 2, 0, 0, 0, 0, ETHIOPIC_UTC);
        __CLR4_4_1135r135rlc8azwmr.R.inc(51105);DateTime dt99 = new DateTime(1999, 10, 2, 0, 0, 0, 0, ETHIOPIC_UTC);
        __CLR4_4_1135r135rlc8azwmr.R.inc(51106);DateTime dt00 = new DateTime(2000, 10, 2, 0, 0, 0, 0, ETHIOPIC_UTC);
        
        __CLR4_4_1135r135rlc8azwmr.R.inc(51107);DurationField fld = dt96.year().getDurationField();
        __CLR4_4_1135r135rlc8azwmr.R.inc(51108);assertEquals(ETHIOPIC_UTC.years(), fld);
        __CLR4_4_1135r135rlc8azwmr.R.inc(51109);assertEquals(1L * 365L * MILLIS_PER_DAY, fld.getMillis(1, dt96.getMillis()));
        __CLR4_4_1135r135rlc8azwmr.R.inc(51110);assertEquals(2L * 365L * MILLIS_PER_DAY, fld.getMillis(2, dt96.getMillis()));
        __CLR4_4_1135r135rlc8azwmr.R.inc(51111);assertEquals(3L * 365L * MILLIS_PER_DAY, fld.getMillis(3, dt96.getMillis()));
        __CLR4_4_1135r135rlc8azwmr.R.inc(51112);assertEquals((4L * 365L + 1L) * MILLIS_PER_DAY, fld.getMillis(4, dt96.getMillis()));
        
        __CLR4_4_1135r135rlc8azwmr.R.inc(51113);assertEquals(((4L * 365L + 1L) * MILLIS_PER_DAY) / 4, fld.getMillis(1));
        __CLR4_4_1135r135rlc8azwmr.R.inc(51114);assertEquals(((4L * 365L + 1L) * MILLIS_PER_DAY) / 2, fld.getMillis(2));
        
        __CLR4_4_1135r135rlc8azwmr.R.inc(51115);assertEquals(1L * 365L * MILLIS_PER_DAY, fld.getMillis(1L, dt96.getMillis()));
        __CLR4_4_1135r135rlc8azwmr.R.inc(51116);assertEquals(2L * 365L * MILLIS_PER_DAY, fld.getMillis(2L, dt96.getMillis()));
        __CLR4_4_1135r135rlc8azwmr.R.inc(51117);assertEquals(3L * 365L * MILLIS_PER_DAY, fld.getMillis(3L, dt96.getMillis()));
        __CLR4_4_1135r135rlc8azwmr.R.inc(51118);assertEquals((4L * 365L + 1L) * MILLIS_PER_DAY, fld.getMillis(4L, dt96.getMillis()));
        
        __CLR4_4_1135r135rlc8azwmr.R.inc(51119);assertEquals(((4L * 365L + 1L) * MILLIS_PER_DAY) / 4, fld.getMillis(1L));
        __CLR4_4_1135r135rlc8azwmr.R.inc(51120);assertEquals(((4L * 365L + 1L) * MILLIS_PER_DAY) / 2, fld.getMillis(2L));
        
        __CLR4_4_1135r135rlc8azwmr.R.inc(51121);assertEquals(((4L * 365L + 1L) * MILLIS_PER_DAY) / 4, fld.getUnitMillis());
        
        __CLR4_4_1135r135rlc8azwmr.R.inc(51122);assertEquals(0, fld.getValue(1L * 365L * MILLIS_PER_DAY - 1L, dt96.getMillis()));
        __CLR4_4_1135r135rlc8azwmr.R.inc(51123);assertEquals(1, fld.getValue(1L * 365L * MILLIS_PER_DAY, dt96.getMillis()));
        __CLR4_4_1135r135rlc8azwmr.R.inc(51124);assertEquals(1, fld.getValue(1L * 365L * MILLIS_PER_DAY + 1L, dt96.getMillis()));
        __CLR4_4_1135r135rlc8azwmr.R.inc(51125);assertEquals(1, fld.getValue(2L * 365L * MILLIS_PER_DAY - 1L, dt96.getMillis()));
        __CLR4_4_1135r135rlc8azwmr.R.inc(51126);assertEquals(2, fld.getValue(2L * 365L * MILLIS_PER_DAY, dt96.getMillis()));
        __CLR4_4_1135r135rlc8azwmr.R.inc(51127);assertEquals(2, fld.getValue(2L * 365L * MILLIS_PER_DAY + 1L, dt96.getMillis()));
        __CLR4_4_1135r135rlc8azwmr.R.inc(51128);assertEquals(2, fld.getValue(3L * 365L * MILLIS_PER_DAY - 1L, dt96.getMillis()));
        __CLR4_4_1135r135rlc8azwmr.R.inc(51129);assertEquals(3, fld.getValue(3L * 365L * MILLIS_PER_DAY, dt96.getMillis()));
        __CLR4_4_1135r135rlc8azwmr.R.inc(51130);assertEquals(3, fld.getValue(3L * 365L * MILLIS_PER_DAY + 1L, dt96.getMillis()));
        __CLR4_4_1135r135rlc8azwmr.R.inc(51131);assertEquals(3, fld.getValue((4L * 365L + 1L) * MILLIS_PER_DAY - 1L, dt96.getMillis()));
        __CLR4_4_1135r135rlc8azwmr.R.inc(51132);assertEquals(4, fld.getValue((4L * 365L + 1L) * MILLIS_PER_DAY, dt96.getMillis()));
        __CLR4_4_1135r135rlc8azwmr.R.inc(51133);assertEquals(4, fld.getValue((4L * 365L + 1L) * MILLIS_PER_DAY + 1L, dt96.getMillis()));
        
        __CLR4_4_1135r135rlc8azwmr.R.inc(51134);assertEquals(dt97.getMillis(), fld.add(dt96.getMillis(), 1));
        __CLR4_4_1135r135rlc8azwmr.R.inc(51135);assertEquals(dt98.getMillis(), fld.add(dt96.getMillis(), 2));
        __CLR4_4_1135r135rlc8azwmr.R.inc(51136);assertEquals(dt99.getMillis(), fld.add(dt96.getMillis(), 3));
        __CLR4_4_1135r135rlc8azwmr.R.inc(51137);assertEquals(dt00.getMillis(), fld.add(dt96.getMillis(), 4));
        
        __CLR4_4_1135r135rlc8azwmr.R.inc(51138);assertEquals(dt97.getMillis(), fld.add(dt96.getMillis(), 1L));
        __CLR4_4_1135r135rlc8azwmr.R.inc(51139);assertEquals(dt98.getMillis(), fld.add(dt96.getMillis(), 2L));
        __CLR4_4_1135r135rlc8azwmr.R.inc(51140);assertEquals(dt99.getMillis(), fld.add(dt96.getMillis(), 3L));
        __CLR4_4_1135r135rlc8azwmr.R.inc(51141);assertEquals(dt00.getMillis(), fld.add(dt96.getMillis(), 4L));
    }finally{__CLR4_4_1135r135rlc8azwmr.R.flushNeeded();}}

    public void testDurationMonth() {__CLR4_4_1135r135rlc8azwmr.R.globalSliceStart(getClass().getName(),51142);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19eaj3313gm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1135r135rlc8azwmr.R.rethrow($CLV_t2$);}finally{__CLR4_4_1135r135rlc8azwmr.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestEthiopicChronology.testDurationMonth",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),51142,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19eaj3313gm(){try{__CLR4_4_1135r135rlc8azwmr.R.inc(51142);
        // Leap 1999, NotLeap 1996,97,98
        __CLR4_4_1135r135rlc8azwmr.R.inc(51143);DateTime dt11 = new DateTime(1999, 11, 2, 0, 0, 0, 0, ETHIOPIC_UTC);
        __CLR4_4_1135r135rlc8azwmr.R.inc(51144);DateTime dt12 = new DateTime(1999, 12, 2, 0, 0, 0, 0, ETHIOPIC_UTC);
        __CLR4_4_1135r135rlc8azwmr.R.inc(51145);DateTime dt13 = new DateTime(1999, 13, 2, 0, 0, 0, 0, ETHIOPIC_UTC);
        __CLR4_4_1135r135rlc8azwmr.R.inc(51146);DateTime dt01 = new DateTime(2000, 1, 2, 0, 0, 0, 0, ETHIOPIC_UTC);
        
        __CLR4_4_1135r135rlc8azwmr.R.inc(51147);DurationField fld = dt11.monthOfYear().getDurationField();
        __CLR4_4_1135r135rlc8azwmr.R.inc(51148);assertEquals(ETHIOPIC_UTC.months(), fld);
        __CLR4_4_1135r135rlc8azwmr.R.inc(51149);assertEquals(1L * 30L * MILLIS_PER_DAY, fld.getMillis(1, dt11.getMillis()));
        __CLR4_4_1135r135rlc8azwmr.R.inc(51150);assertEquals(2L * 30L * MILLIS_PER_DAY, fld.getMillis(2, dt11.getMillis()));
        __CLR4_4_1135r135rlc8azwmr.R.inc(51151);assertEquals((2L * 30L + 6L) * MILLIS_PER_DAY, fld.getMillis(3, dt11.getMillis()));
        __CLR4_4_1135r135rlc8azwmr.R.inc(51152);assertEquals((3L * 30L + 6L) * MILLIS_PER_DAY, fld.getMillis(4, dt11.getMillis()));
        
        __CLR4_4_1135r135rlc8azwmr.R.inc(51153);assertEquals(1L * 30L * MILLIS_PER_DAY, fld.getMillis(1));
        __CLR4_4_1135r135rlc8azwmr.R.inc(51154);assertEquals(2L * 30L * MILLIS_PER_DAY, fld.getMillis(2));
        __CLR4_4_1135r135rlc8azwmr.R.inc(51155);assertEquals(13L * 30L * MILLIS_PER_DAY, fld.getMillis(13));
        
        __CLR4_4_1135r135rlc8azwmr.R.inc(51156);assertEquals(1L * 30L * MILLIS_PER_DAY, fld.getMillis(1L, dt11.getMillis()));
        __CLR4_4_1135r135rlc8azwmr.R.inc(51157);assertEquals(2L * 30L * MILLIS_PER_DAY, fld.getMillis(2L, dt11.getMillis()));
        __CLR4_4_1135r135rlc8azwmr.R.inc(51158);assertEquals((2L * 30L + 6L) * MILLIS_PER_DAY, fld.getMillis(3L, dt11.getMillis()));
        __CLR4_4_1135r135rlc8azwmr.R.inc(51159);assertEquals((3L * 30L + 6L) * MILLIS_PER_DAY, fld.getMillis(4L, dt11.getMillis()));
        
        __CLR4_4_1135r135rlc8azwmr.R.inc(51160);assertEquals(1L * 30L * MILLIS_PER_DAY, fld.getMillis(1L));
        __CLR4_4_1135r135rlc8azwmr.R.inc(51161);assertEquals(2L * 30L * MILLIS_PER_DAY, fld.getMillis(2L));
        __CLR4_4_1135r135rlc8azwmr.R.inc(51162);assertEquals(13L * 30L * MILLIS_PER_DAY, fld.getMillis(13L));
        
        __CLR4_4_1135r135rlc8azwmr.R.inc(51163);assertEquals(0, fld.getValue(1L * 30L * MILLIS_PER_DAY - 1L, dt11.getMillis()));
        __CLR4_4_1135r135rlc8azwmr.R.inc(51164);assertEquals(1, fld.getValue(1L * 30L * MILLIS_PER_DAY, dt11.getMillis()));
        __CLR4_4_1135r135rlc8azwmr.R.inc(51165);assertEquals(1, fld.getValue(1L * 30L * MILLIS_PER_DAY + 1L, dt11.getMillis()));
        __CLR4_4_1135r135rlc8azwmr.R.inc(51166);assertEquals(1, fld.getValue(2L * 30L * MILLIS_PER_DAY - 1L, dt11.getMillis()));
        __CLR4_4_1135r135rlc8azwmr.R.inc(51167);assertEquals(2, fld.getValue(2L * 30L * MILLIS_PER_DAY, dt11.getMillis()));
        __CLR4_4_1135r135rlc8azwmr.R.inc(51168);assertEquals(2, fld.getValue(2L * 30L * MILLIS_PER_DAY + 1L, dt11.getMillis()));
        __CLR4_4_1135r135rlc8azwmr.R.inc(51169);assertEquals(2, fld.getValue((2L * 30L + 6L) * MILLIS_PER_DAY - 1L, dt11.getMillis()));
        __CLR4_4_1135r135rlc8azwmr.R.inc(51170);assertEquals(3, fld.getValue((2L * 30L + 6L) * MILLIS_PER_DAY, dt11.getMillis()));
        __CLR4_4_1135r135rlc8azwmr.R.inc(51171);assertEquals(3, fld.getValue((2L * 30L + 6L) * MILLIS_PER_DAY + 1L, dt11.getMillis()));
        __CLR4_4_1135r135rlc8azwmr.R.inc(51172);assertEquals(3, fld.getValue((3L * 30L + 6L) * MILLIS_PER_DAY - 1L, dt11.getMillis()));
        __CLR4_4_1135r135rlc8azwmr.R.inc(51173);assertEquals(4, fld.getValue((3L * 30L + 6L) * MILLIS_PER_DAY, dt11.getMillis()));
        __CLR4_4_1135r135rlc8azwmr.R.inc(51174);assertEquals(4, fld.getValue((3L * 30L + 6L) * MILLIS_PER_DAY + 1L, dt11.getMillis()));
        
        __CLR4_4_1135r135rlc8azwmr.R.inc(51175);assertEquals(dt12.getMillis(), fld.add(dt11.getMillis(), 1));
        __CLR4_4_1135r135rlc8azwmr.R.inc(51176);assertEquals(dt13.getMillis(), fld.add(dt11.getMillis(), 2));
        __CLR4_4_1135r135rlc8azwmr.R.inc(51177);assertEquals(dt01.getMillis(), fld.add(dt11.getMillis(), 3));
        
        __CLR4_4_1135r135rlc8azwmr.R.inc(51178);assertEquals(dt12.getMillis(), fld.add(dt11.getMillis(), 1L));
        __CLR4_4_1135r135rlc8azwmr.R.inc(51179);assertEquals(dt13.getMillis(), fld.add(dt11.getMillis(), 2L));
        __CLR4_4_1135r135rlc8azwmr.R.inc(51180);assertEquals(dt01.getMillis(), fld.add(dt11.getMillis(), 3L));
    }finally{__CLR4_4_1135r135rlc8azwmr.R.flushNeeded();}}

}
