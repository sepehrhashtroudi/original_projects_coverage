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

import org.joda.time.DateTimeConstants;
import org.joda.time.DateTimeUtils;
import org.joda.time.DateTimeZone;

/**
 * This class is a Junit unit test for JulianChronology.
 *
 * @author Stephen Colebourne
 */
public class TestJulianChronology extends TestCase {static class __CLR4_4_114o714o7lc8azwro{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672271031490L,8589935092L,52914,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

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

    public static void main(String[] args) {try{__CLR4_4_114o714o7lc8azwro.R.inc(52711);
        __CLR4_4_114o714o7lc8azwro.R.inc(52712);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_114o714o7lc8azwro.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_114o714o7lc8azwro.R.inc(52713);
        __CLR4_4_114o714o7lc8azwro.R.inc(52714);return new TestSuite(TestJulianChronology.class);
    }finally{__CLR4_4_114o714o7lc8azwro.R.flushNeeded();}}

    public TestJulianChronology(String name) {
        super(name);__CLR4_4_114o714o7lc8azwro.R.inc(52716);try{__CLR4_4_114o714o7lc8azwro.R.inc(52715);
    }finally{__CLR4_4_114o714o7lc8azwro.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_114o714o7lc8azwro.R.inc(52717);
        __CLR4_4_114o714o7lc8azwro.R.inc(52718);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_114o714o7lc8azwro.R.inc(52719);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_114o714o7lc8azwro.R.inc(52720);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_114o714o7lc8azwro.R.inc(52721);originalLocale = Locale.getDefault();
        __CLR4_4_114o714o7lc8azwro.R.inc(52722);DateTimeZone.setDefault(LONDON);
        __CLR4_4_114o714o7lc8azwro.R.inc(52723);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_114o714o7lc8azwro.R.inc(52724);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_114o714o7lc8azwro.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_114o714o7lc8azwro.R.inc(52725);
        __CLR4_4_114o714o7lc8azwro.R.inc(52726);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_114o714o7lc8azwro.R.inc(52727);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_114o714o7lc8azwro.R.inc(52728);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_114o714o7lc8azwro.R.inc(52729);Locale.setDefault(originalLocale);
        __CLR4_4_114o714o7lc8azwro.R.inc(52730);originalDateTimeZone = null;
        __CLR4_4_114o714o7lc8azwro.R.inc(52731);originalTimeZone = null;
        __CLR4_4_114o714o7lc8azwro.R.inc(52732);originalLocale = null;
    }finally{__CLR4_4_114o714o7lc8azwro.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testFactoryUTC() {__CLR4_4_114o714o7lc8azwro.R.globalSliceStart(getClass().getName(),52733);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19knvhv14ot();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_114o714o7lc8azwro.R.rethrow($CLV_t2$);}finally{__CLR4_4_114o714o7lc8azwro.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestJulianChronology.testFactoryUTC",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),52733,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19knvhv14ot(){try{__CLR4_4_114o714o7lc8azwro.R.inc(52733);
        __CLR4_4_114o714o7lc8azwro.R.inc(52734);assertEquals(DateTimeZone.UTC, JulianChronology.getInstanceUTC().getZone());
        __CLR4_4_114o714o7lc8azwro.R.inc(52735);assertSame(JulianChronology.class, JulianChronology.getInstanceUTC().getClass());
    }finally{__CLR4_4_114o714o7lc8azwro.R.flushNeeded();}}

    public void testFactory() {__CLR4_4_114o714o7lc8azwro.R.globalSliceStart(getClass().getName(),52736);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_116tztt14ow();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_114o714o7lc8azwro.R.rethrow($CLV_t2$);}finally{__CLR4_4_114o714o7lc8azwro.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestJulianChronology.testFactory",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),52736,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_116tztt14ow(){try{__CLR4_4_114o714o7lc8azwro.R.inc(52736);
        __CLR4_4_114o714o7lc8azwro.R.inc(52737);assertEquals(LONDON, JulianChronology.getInstance().getZone());
        __CLR4_4_114o714o7lc8azwro.R.inc(52738);assertSame(JulianChronology.class, JulianChronology.getInstance().getClass());
    }finally{__CLR4_4_114o714o7lc8azwro.R.flushNeeded();}}

    public void testFactory_Zone() {__CLR4_4_114o714o7lc8azwro.R.globalSliceStart(getClass().getName(),52739);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yy5ime14oz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_114o714o7lc8azwro.R.rethrow($CLV_t2$);}finally{__CLR4_4_114o714o7lc8azwro.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestJulianChronology.testFactory_Zone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),52739,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yy5ime14oz(){try{__CLR4_4_114o714o7lc8azwro.R.inc(52739);
        __CLR4_4_114o714o7lc8azwro.R.inc(52740);assertEquals(TOKYO, JulianChronology.getInstance(TOKYO).getZone());
        __CLR4_4_114o714o7lc8azwro.R.inc(52741);assertEquals(PARIS, JulianChronology.getInstance(PARIS).getZone());
        __CLR4_4_114o714o7lc8azwro.R.inc(52742);assertEquals(LONDON, JulianChronology.getInstance(null).getZone());
        __CLR4_4_114o714o7lc8azwro.R.inc(52743);assertSame(JulianChronology.class, JulianChronology.getInstance(TOKYO).getClass());
    }finally{__CLR4_4_114o714o7lc8azwro.R.flushNeeded();}}

    public void testFactory_Zone_int() {__CLR4_4_114o714o7lc8azwro.R.globalSliceStart(getClass().getName(),52744);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rvgr1214p4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_114o714o7lc8azwro.R.rethrow($CLV_t2$);}finally{__CLR4_4_114o714o7lc8azwro.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestJulianChronology.testFactory_Zone_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),52744,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rvgr1214p4(){try{__CLR4_4_114o714o7lc8azwro.R.inc(52744);
        __CLR4_4_114o714o7lc8azwro.R.inc(52745);JulianChronology chrono = JulianChronology.getInstance(TOKYO, 2);
        __CLR4_4_114o714o7lc8azwro.R.inc(52746);assertEquals(TOKYO, chrono.getZone());
        __CLR4_4_114o714o7lc8azwro.R.inc(52747);assertEquals(2, chrono.getMinimumDaysInFirstWeek());
        
        __CLR4_4_114o714o7lc8azwro.R.inc(52748);try {
            __CLR4_4_114o714o7lc8azwro.R.inc(52749);JulianChronology.getInstance(TOKYO, 0);
            __CLR4_4_114o714o7lc8azwro.R.inc(52750);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_114o714o7lc8azwro.R.inc(52751);try {
            __CLR4_4_114o714o7lc8azwro.R.inc(52752);JulianChronology.getInstance(TOKYO, 8);
            __CLR4_4_114o714o7lc8azwro.R.inc(52753);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_114o714o7lc8azwro.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testEquality() {__CLR4_4_114o714o7lc8azwro.R.globalSliceStart(getClass().getName(),52754);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12agdql14pe();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_114o714o7lc8azwro.R.rethrow($CLV_t2$);}finally{__CLR4_4_114o714o7lc8azwro.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestJulianChronology.testEquality",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),52754,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12agdql14pe(){try{__CLR4_4_114o714o7lc8azwro.R.inc(52754);
        __CLR4_4_114o714o7lc8azwro.R.inc(52755);assertSame(JulianChronology.getInstance(TOKYO), JulianChronology.getInstance(TOKYO));
        __CLR4_4_114o714o7lc8azwro.R.inc(52756);assertSame(JulianChronology.getInstance(LONDON), JulianChronology.getInstance(LONDON));
        __CLR4_4_114o714o7lc8azwro.R.inc(52757);assertSame(JulianChronology.getInstance(PARIS), JulianChronology.getInstance(PARIS));
        __CLR4_4_114o714o7lc8azwro.R.inc(52758);assertSame(JulianChronology.getInstanceUTC(), JulianChronology.getInstanceUTC());
        __CLR4_4_114o714o7lc8azwro.R.inc(52759);assertSame(JulianChronology.getInstance(), JulianChronology.getInstance(LONDON));
    }finally{__CLR4_4_114o714o7lc8azwro.R.flushNeeded();}}

    public void testWithUTC() {__CLR4_4_114o714o7lc8azwro.R.globalSliceStart(getClass().getName(),52760);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19orv8314pk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_114o714o7lc8azwro.R.rethrow($CLV_t2$);}finally{__CLR4_4_114o714o7lc8azwro.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestJulianChronology.testWithUTC",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),52760,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19orv8314pk(){try{__CLR4_4_114o714o7lc8azwro.R.inc(52760);
        __CLR4_4_114o714o7lc8azwro.R.inc(52761);assertSame(JulianChronology.getInstanceUTC(), JulianChronology.getInstance(LONDON).withUTC());
        __CLR4_4_114o714o7lc8azwro.R.inc(52762);assertSame(JulianChronology.getInstanceUTC(), JulianChronology.getInstance(TOKYO).withUTC());
        __CLR4_4_114o714o7lc8azwro.R.inc(52763);assertSame(JulianChronology.getInstanceUTC(), JulianChronology.getInstanceUTC().withUTC());
        __CLR4_4_114o714o7lc8azwro.R.inc(52764);assertSame(JulianChronology.getInstanceUTC(), JulianChronology.getInstance().withUTC());
    }finally{__CLR4_4_114o714o7lc8azwro.R.flushNeeded();}}

    public void testWithZone() {__CLR4_4_114o714o7lc8azwro.R.globalSliceStart(getClass().getName(),52765);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1me3iet14pp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_114o714o7lc8azwro.R.rethrow($CLV_t2$);}finally{__CLR4_4_114o714o7lc8azwro.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestJulianChronology.testWithZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),52765,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1me3iet14pp(){try{__CLR4_4_114o714o7lc8azwro.R.inc(52765);
        __CLR4_4_114o714o7lc8azwro.R.inc(52766);assertSame(JulianChronology.getInstance(TOKYO), JulianChronology.getInstance(TOKYO).withZone(TOKYO));
        __CLR4_4_114o714o7lc8azwro.R.inc(52767);assertSame(JulianChronology.getInstance(LONDON), JulianChronology.getInstance(TOKYO).withZone(LONDON));
        __CLR4_4_114o714o7lc8azwro.R.inc(52768);assertSame(JulianChronology.getInstance(PARIS), JulianChronology.getInstance(TOKYO).withZone(PARIS));
        __CLR4_4_114o714o7lc8azwro.R.inc(52769);assertSame(JulianChronology.getInstance(LONDON), JulianChronology.getInstance(TOKYO).withZone(null));
        __CLR4_4_114o714o7lc8azwro.R.inc(52770);assertSame(JulianChronology.getInstance(PARIS), JulianChronology.getInstance().withZone(PARIS));
        __CLR4_4_114o714o7lc8azwro.R.inc(52771);assertSame(JulianChronology.getInstance(PARIS), JulianChronology.getInstanceUTC().withZone(PARIS));
    }finally{__CLR4_4_114o714o7lc8azwro.R.flushNeeded();}}

    public void testToString() {__CLR4_4_114o714o7lc8azwro.R.globalSliceStart(getClass().getName(),52772);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hrxdid14pw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_114o714o7lc8azwro.R.rethrow($CLV_t2$);}finally{__CLR4_4_114o714o7lc8azwro.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestJulianChronology.testToString",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),52772,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hrxdid14pw(){try{__CLR4_4_114o714o7lc8azwro.R.inc(52772);
        __CLR4_4_114o714o7lc8azwro.R.inc(52773);assertEquals("JulianChronology[Europe/London]", JulianChronology.getInstance(LONDON).toString());
        __CLR4_4_114o714o7lc8azwro.R.inc(52774);assertEquals("JulianChronology[Asia/Tokyo]", JulianChronology.getInstance(TOKYO).toString());
        __CLR4_4_114o714o7lc8azwro.R.inc(52775);assertEquals("JulianChronology[Europe/London]", JulianChronology.getInstance().toString());
        __CLR4_4_114o714o7lc8azwro.R.inc(52776);assertEquals("JulianChronology[UTC]", JulianChronology.getInstanceUTC().toString());
        __CLR4_4_114o714o7lc8azwro.R.inc(52777);assertEquals("JulianChronology[UTC,mdfw=2]", JulianChronology.getInstance(DateTimeZone.UTC, 2).toString());
    }finally{__CLR4_4_114o714o7lc8azwro.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testDurationFields() {__CLR4_4_114o714o7lc8azwro.R.globalSliceStart(getClass().getName(),52778);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cnkzye14q2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_114o714o7lc8azwro.R.rethrow($CLV_t2$);}finally{__CLR4_4_114o714o7lc8azwro.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestJulianChronology.testDurationFields",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),52778,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cnkzye14q2(){try{__CLR4_4_114o714o7lc8azwro.R.inc(52778);
        __CLR4_4_114o714o7lc8azwro.R.inc(52779);final JulianChronology julian = JulianChronology.getInstance();
        __CLR4_4_114o714o7lc8azwro.R.inc(52780);assertEquals("eras", julian.eras().getName());
        __CLR4_4_114o714o7lc8azwro.R.inc(52781);assertEquals("centuries", julian.centuries().getName());
        __CLR4_4_114o714o7lc8azwro.R.inc(52782);assertEquals("years", julian.years().getName());
        __CLR4_4_114o714o7lc8azwro.R.inc(52783);assertEquals("weekyears", julian.weekyears().getName());
        __CLR4_4_114o714o7lc8azwro.R.inc(52784);assertEquals("months", julian.months().getName());
        __CLR4_4_114o714o7lc8azwro.R.inc(52785);assertEquals("weeks", julian.weeks().getName());
        __CLR4_4_114o714o7lc8azwro.R.inc(52786);assertEquals("days", julian.days().getName());
        __CLR4_4_114o714o7lc8azwro.R.inc(52787);assertEquals("halfdays", julian.halfdays().getName());
        __CLR4_4_114o714o7lc8azwro.R.inc(52788);assertEquals("hours", julian.hours().getName());
        __CLR4_4_114o714o7lc8azwro.R.inc(52789);assertEquals("minutes", julian.minutes().getName());
        __CLR4_4_114o714o7lc8azwro.R.inc(52790);assertEquals("seconds", julian.seconds().getName());
        __CLR4_4_114o714o7lc8azwro.R.inc(52791);assertEquals("millis", julian.millis().getName());
        
        __CLR4_4_114o714o7lc8azwro.R.inc(52792);assertEquals(false, julian.eras().isSupported());
        __CLR4_4_114o714o7lc8azwro.R.inc(52793);assertEquals(true, julian.centuries().isSupported());
        __CLR4_4_114o714o7lc8azwro.R.inc(52794);assertEquals(true, julian.years().isSupported());
        __CLR4_4_114o714o7lc8azwro.R.inc(52795);assertEquals(true, julian.weekyears().isSupported());
        __CLR4_4_114o714o7lc8azwro.R.inc(52796);assertEquals(true, julian.months().isSupported());
        __CLR4_4_114o714o7lc8azwro.R.inc(52797);assertEquals(true, julian.weeks().isSupported());
        __CLR4_4_114o714o7lc8azwro.R.inc(52798);assertEquals(true, julian.days().isSupported());
        __CLR4_4_114o714o7lc8azwro.R.inc(52799);assertEquals(true, julian.halfdays().isSupported());
        __CLR4_4_114o714o7lc8azwro.R.inc(52800);assertEquals(true, julian.hours().isSupported());
        __CLR4_4_114o714o7lc8azwro.R.inc(52801);assertEquals(true, julian.minutes().isSupported());
        __CLR4_4_114o714o7lc8azwro.R.inc(52802);assertEquals(true, julian.seconds().isSupported());
        __CLR4_4_114o714o7lc8azwro.R.inc(52803);assertEquals(true, julian.millis().isSupported());
        
        __CLR4_4_114o714o7lc8azwro.R.inc(52804);assertEquals(false, julian.centuries().isPrecise());
        __CLR4_4_114o714o7lc8azwro.R.inc(52805);assertEquals(false, julian.years().isPrecise());
        __CLR4_4_114o714o7lc8azwro.R.inc(52806);assertEquals(false, julian.weekyears().isPrecise());
        __CLR4_4_114o714o7lc8azwro.R.inc(52807);assertEquals(false, julian.months().isPrecise());
        __CLR4_4_114o714o7lc8azwro.R.inc(52808);assertEquals(false, julian.weeks().isPrecise());
        __CLR4_4_114o714o7lc8azwro.R.inc(52809);assertEquals(false, julian.days().isPrecise());
        __CLR4_4_114o714o7lc8azwro.R.inc(52810);assertEquals(false, julian.halfdays().isPrecise());
        __CLR4_4_114o714o7lc8azwro.R.inc(52811);assertEquals(true, julian.hours().isPrecise());
        __CLR4_4_114o714o7lc8azwro.R.inc(52812);assertEquals(true, julian.minutes().isPrecise());
        __CLR4_4_114o714o7lc8azwro.R.inc(52813);assertEquals(true, julian.seconds().isPrecise());
        __CLR4_4_114o714o7lc8azwro.R.inc(52814);assertEquals(true, julian.millis().isPrecise());
        
        __CLR4_4_114o714o7lc8azwro.R.inc(52815);final JulianChronology julianUTC = JulianChronology.getInstanceUTC();
        __CLR4_4_114o714o7lc8azwro.R.inc(52816);assertEquals(false, julianUTC.centuries().isPrecise());
        __CLR4_4_114o714o7lc8azwro.R.inc(52817);assertEquals(false, julianUTC.years().isPrecise());
        __CLR4_4_114o714o7lc8azwro.R.inc(52818);assertEquals(false, julianUTC.weekyears().isPrecise());
        __CLR4_4_114o714o7lc8azwro.R.inc(52819);assertEquals(false, julianUTC.months().isPrecise());
        __CLR4_4_114o714o7lc8azwro.R.inc(52820);assertEquals(true, julianUTC.weeks().isPrecise());
        __CLR4_4_114o714o7lc8azwro.R.inc(52821);assertEquals(true, julianUTC.days().isPrecise());
        __CLR4_4_114o714o7lc8azwro.R.inc(52822);assertEquals(true, julianUTC.halfdays().isPrecise());
        __CLR4_4_114o714o7lc8azwro.R.inc(52823);assertEquals(true, julianUTC.hours().isPrecise());
        __CLR4_4_114o714o7lc8azwro.R.inc(52824);assertEquals(true, julianUTC.minutes().isPrecise());
        __CLR4_4_114o714o7lc8azwro.R.inc(52825);assertEquals(true, julianUTC.seconds().isPrecise());
        __CLR4_4_114o714o7lc8azwro.R.inc(52826);assertEquals(true, julianUTC.millis().isPrecise());
        
        __CLR4_4_114o714o7lc8azwro.R.inc(52827);final DateTimeZone gmt = DateTimeZone.forID("Etc/GMT");
        __CLR4_4_114o714o7lc8azwro.R.inc(52828);final JulianChronology julianGMT = JulianChronology.getInstance(gmt);
        __CLR4_4_114o714o7lc8azwro.R.inc(52829);assertEquals(false, julianGMT.centuries().isPrecise());
        __CLR4_4_114o714o7lc8azwro.R.inc(52830);assertEquals(false, julianGMT.years().isPrecise());
        __CLR4_4_114o714o7lc8azwro.R.inc(52831);assertEquals(false, julianGMT.weekyears().isPrecise());
        __CLR4_4_114o714o7lc8azwro.R.inc(52832);assertEquals(false, julianGMT.months().isPrecise());
        __CLR4_4_114o714o7lc8azwro.R.inc(52833);assertEquals(true, julianGMT.weeks().isPrecise());
        __CLR4_4_114o714o7lc8azwro.R.inc(52834);assertEquals(true, julianGMT.days().isPrecise());
        __CLR4_4_114o714o7lc8azwro.R.inc(52835);assertEquals(true, julianGMT.halfdays().isPrecise());
        __CLR4_4_114o714o7lc8azwro.R.inc(52836);assertEquals(true, julianGMT.hours().isPrecise());
        __CLR4_4_114o714o7lc8azwro.R.inc(52837);assertEquals(true, julianGMT.minutes().isPrecise());
        __CLR4_4_114o714o7lc8azwro.R.inc(52838);assertEquals(true, julianGMT.seconds().isPrecise());
        __CLR4_4_114o714o7lc8azwro.R.inc(52839);assertEquals(true, julianGMT.millis().isPrecise());
    }finally{__CLR4_4_114o714o7lc8azwro.R.flushNeeded();}}

    public void testDateFields() {__CLR4_4_114o714o7lc8azwro.R.globalSliceStart(getClass().getName(),52840);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gkspeo14rs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_114o714o7lc8azwro.R.rethrow($CLV_t2$);}finally{__CLR4_4_114o714o7lc8azwro.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestJulianChronology.testDateFields",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),52840,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gkspeo14rs(){try{__CLR4_4_114o714o7lc8azwro.R.inc(52840);
        __CLR4_4_114o714o7lc8azwro.R.inc(52841);final JulianChronology julian = JulianChronology.getInstance();
        __CLR4_4_114o714o7lc8azwro.R.inc(52842);assertEquals("era", julian.era().getName());
        __CLR4_4_114o714o7lc8azwro.R.inc(52843);assertEquals("centuryOfEra", julian.centuryOfEra().getName());
        __CLR4_4_114o714o7lc8azwro.R.inc(52844);assertEquals("yearOfCentury", julian.yearOfCentury().getName());
        __CLR4_4_114o714o7lc8azwro.R.inc(52845);assertEquals("yearOfEra", julian.yearOfEra().getName());
        __CLR4_4_114o714o7lc8azwro.R.inc(52846);assertEquals("year", julian.year().getName());
        __CLR4_4_114o714o7lc8azwro.R.inc(52847);assertEquals("monthOfYear", julian.monthOfYear().getName());
        __CLR4_4_114o714o7lc8azwro.R.inc(52848);assertEquals("weekyearOfCentury", julian.weekyearOfCentury().getName());
        __CLR4_4_114o714o7lc8azwro.R.inc(52849);assertEquals("weekyear", julian.weekyear().getName());
        __CLR4_4_114o714o7lc8azwro.R.inc(52850);assertEquals("weekOfWeekyear", julian.weekOfWeekyear().getName());
        __CLR4_4_114o714o7lc8azwro.R.inc(52851);assertEquals("dayOfYear", julian.dayOfYear().getName());
        __CLR4_4_114o714o7lc8azwro.R.inc(52852);assertEquals("dayOfMonth", julian.dayOfMonth().getName());
        __CLR4_4_114o714o7lc8azwro.R.inc(52853);assertEquals("dayOfWeek", julian.dayOfWeek().getName());
        
        __CLR4_4_114o714o7lc8azwro.R.inc(52854);assertEquals(true, julian.era().isSupported());
        __CLR4_4_114o714o7lc8azwro.R.inc(52855);assertEquals(true, julian.centuryOfEra().isSupported());
        __CLR4_4_114o714o7lc8azwro.R.inc(52856);assertEquals(true, julian.yearOfCentury().isSupported());
        __CLR4_4_114o714o7lc8azwro.R.inc(52857);assertEquals(true, julian.yearOfEra().isSupported());
        __CLR4_4_114o714o7lc8azwro.R.inc(52858);assertEquals(true, julian.year().isSupported());
        __CLR4_4_114o714o7lc8azwro.R.inc(52859);assertEquals(true, julian.monthOfYear().isSupported());
        __CLR4_4_114o714o7lc8azwro.R.inc(52860);assertEquals(true, julian.weekyearOfCentury().isSupported());
        __CLR4_4_114o714o7lc8azwro.R.inc(52861);assertEquals(true, julian.weekyear().isSupported());
        __CLR4_4_114o714o7lc8azwro.R.inc(52862);assertEquals(true, julian.weekOfWeekyear().isSupported());
        __CLR4_4_114o714o7lc8azwro.R.inc(52863);assertEquals(true, julian.dayOfYear().isSupported());
        __CLR4_4_114o714o7lc8azwro.R.inc(52864);assertEquals(true, julian.dayOfMonth().isSupported());
        __CLR4_4_114o714o7lc8azwro.R.inc(52865);assertEquals(true, julian.dayOfWeek().isSupported());
        
        __CLR4_4_114o714o7lc8azwro.R.inc(52866);assertEquals(julian.eras(), julian.era().getDurationField());
        __CLR4_4_114o714o7lc8azwro.R.inc(52867);assertEquals(julian.centuries(), julian.centuryOfEra().getDurationField());
        __CLR4_4_114o714o7lc8azwro.R.inc(52868);assertEquals(julian.years(), julian.yearOfCentury().getDurationField());
        __CLR4_4_114o714o7lc8azwro.R.inc(52869);assertEquals(julian.years(), julian.yearOfEra().getDurationField());
        __CLR4_4_114o714o7lc8azwro.R.inc(52870);assertEquals(julian.years(), julian.year().getDurationField());
        __CLR4_4_114o714o7lc8azwro.R.inc(52871);assertEquals(julian.months(), julian.monthOfYear().getDurationField());
        __CLR4_4_114o714o7lc8azwro.R.inc(52872);assertEquals(julian.weekyears(), julian.weekyearOfCentury().getDurationField());
        __CLR4_4_114o714o7lc8azwro.R.inc(52873);assertEquals(julian.weekyears(), julian.weekyear().getDurationField());
        __CLR4_4_114o714o7lc8azwro.R.inc(52874);assertEquals(julian.weeks(), julian.weekOfWeekyear().getDurationField());
        __CLR4_4_114o714o7lc8azwro.R.inc(52875);assertEquals(julian.days(), julian.dayOfYear().getDurationField());
        __CLR4_4_114o714o7lc8azwro.R.inc(52876);assertEquals(julian.days(), julian.dayOfMonth().getDurationField());
        __CLR4_4_114o714o7lc8azwro.R.inc(52877);assertEquals(julian.days(), julian.dayOfWeek().getDurationField());
        
        __CLR4_4_114o714o7lc8azwro.R.inc(52878);assertEquals(null, julian.era().getRangeDurationField());
        __CLR4_4_114o714o7lc8azwro.R.inc(52879);assertEquals(julian.eras(), julian.centuryOfEra().getRangeDurationField());
        __CLR4_4_114o714o7lc8azwro.R.inc(52880);assertEquals(julian.centuries(), julian.yearOfCentury().getRangeDurationField());
        __CLR4_4_114o714o7lc8azwro.R.inc(52881);assertEquals(julian.eras(), julian.yearOfEra().getRangeDurationField());
        __CLR4_4_114o714o7lc8azwro.R.inc(52882);assertEquals(null, julian.year().getRangeDurationField());
        __CLR4_4_114o714o7lc8azwro.R.inc(52883);assertEquals(julian.years(), julian.monthOfYear().getRangeDurationField());
        __CLR4_4_114o714o7lc8azwro.R.inc(52884);assertEquals(julian.centuries(), julian.weekyearOfCentury().getRangeDurationField());
        __CLR4_4_114o714o7lc8azwro.R.inc(52885);assertEquals(null, julian.weekyear().getRangeDurationField());
        __CLR4_4_114o714o7lc8azwro.R.inc(52886);assertEquals(julian.weekyears(), julian.weekOfWeekyear().getRangeDurationField());
        __CLR4_4_114o714o7lc8azwro.R.inc(52887);assertEquals(julian.years(), julian.dayOfYear().getRangeDurationField());
        __CLR4_4_114o714o7lc8azwro.R.inc(52888);assertEquals(julian.months(), julian.dayOfMonth().getRangeDurationField());
        __CLR4_4_114o714o7lc8azwro.R.inc(52889);assertEquals(julian.weeks(), julian.dayOfWeek().getRangeDurationField());
    }finally{__CLR4_4_114o714o7lc8azwro.R.flushNeeded();}}

    public void testTimeFields() {__CLR4_4_114o714o7lc8azwro.R.globalSliceStart(getClass().getName(),52890);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11r11up14t6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_114o714o7lc8azwro.R.rethrow($CLV_t2$);}finally{__CLR4_4_114o714o7lc8azwro.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestJulianChronology.testTimeFields",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),52890,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11r11up14t6(){try{__CLR4_4_114o714o7lc8azwro.R.inc(52890);
        __CLR4_4_114o714o7lc8azwro.R.inc(52891);final JulianChronology julian = JulianChronology.getInstance();
        __CLR4_4_114o714o7lc8azwro.R.inc(52892);assertEquals("halfdayOfDay", julian.halfdayOfDay().getName());
        __CLR4_4_114o714o7lc8azwro.R.inc(52893);assertEquals("clockhourOfHalfday", julian.clockhourOfHalfday().getName());
        __CLR4_4_114o714o7lc8azwro.R.inc(52894);assertEquals("hourOfHalfday", julian.hourOfHalfday().getName());
        __CLR4_4_114o714o7lc8azwro.R.inc(52895);assertEquals("clockhourOfDay", julian.clockhourOfDay().getName());
        __CLR4_4_114o714o7lc8azwro.R.inc(52896);assertEquals("hourOfDay", julian.hourOfDay().getName());
        __CLR4_4_114o714o7lc8azwro.R.inc(52897);assertEquals("minuteOfDay", julian.minuteOfDay().getName());
        __CLR4_4_114o714o7lc8azwro.R.inc(52898);assertEquals("minuteOfHour", julian.minuteOfHour().getName());
        __CLR4_4_114o714o7lc8azwro.R.inc(52899);assertEquals("secondOfDay", julian.secondOfDay().getName());
        __CLR4_4_114o714o7lc8azwro.R.inc(52900);assertEquals("secondOfMinute", julian.secondOfMinute().getName());
        __CLR4_4_114o714o7lc8azwro.R.inc(52901);assertEquals("millisOfDay", julian.millisOfDay().getName());
        __CLR4_4_114o714o7lc8azwro.R.inc(52902);assertEquals("millisOfSecond", julian.millisOfSecond().getName());
        
        __CLR4_4_114o714o7lc8azwro.R.inc(52903);assertEquals(true, julian.halfdayOfDay().isSupported());
        __CLR4_4_114o714o7lc8azwro.R.inc(52904);assertEquals(true, julian.clockhourOfHalfday().isSupported());
        __CLR4_4_114o714o7lc8azwro.R.inc(52905);assertEquals(true, julian.hourOfHalfday().isSupported());
        __CLR4_4_114o714o7lc8azwro.R.inc(52906);assertEquals(true, julian.clockhourOfDay().isSupported());
        __CLR4_4_114o714o7lc8azwro.R.inc(52907);assertEquals(true, julian.hourOfDay().isSupported());
        __CLR4_4_114o714o7lc8azwro.R.inc(52908);assertEquals(true, julian.minuteOfDay().isSupported());
        __CLR4_4_114o714o7lc8azwro.R.inc(52909);assertEquals(true, julian.minuteOfHour().isSupported());
        __CLR4_4_114o714o7lc8azwro.R.inc(52910);assertEquals(true, julian.secondOfDay().isSupported());
        __CLR4_4_114o714o7lc8azwro.R.inc(52911);assertEquals(true, julian.secondOfMinute().isSupported());
        __CLR4_4_114o714o7lc8azwro.R.inc(52912);assertEquals(true, julian.millisOfDay().isSupported());
        __CLR4_4_114o714o7lc8azwro.R.inc(52913);assertEquals(true, julian.millisOfSecond().isSupported());
    }finally{__CLR4_4_114o714o7lc8azwro.R.flushNeeded();}}

}
