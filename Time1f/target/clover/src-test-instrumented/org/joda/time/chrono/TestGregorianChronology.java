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
import org.joda.time.DateMidnight;
import org.joda.time.DateTimeConstants;
import org.joda.time.DateTimeUtils;
import org.joda.time.DateTimeZone;
import org.joda.time.YearMonthDay;

/**
 * This class is a Junit unit test for GregorianChronology.
 *
 * @author Stephen Colebourne
 */
@SuppressWarnings("deprecation")
public class TestGregorianChronology extends TestCase {static class __CLR4_4_113tb13tblc8azwol{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672271031490L,8589935092L,51808,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

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

    public static void main(String[] args) {try{__CLR4_4_113tb13tblc8azwol.R.inc(51599);
        __CLR4_4_113tb13tblc8azwol.R.inc(51600);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_113tb13tblc8azwol.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_113tb13tblc8azwol.R.inc(51601);
        __CLR4_4_113tb13tblc8azwol.R.inc(51602);return new TestSuite(TestGregorianChronology.class);
    }finally{__CLR4_4_113tb13tblc8azwol.R.flushNeeded();}}

    public TestGregorianChronology(String name) {
        super(name);__CLR4_4_113tb13tblc8azwol.R.inc(51604);try{__CLR4_4_113tb13tblc8azwol.R.inc(51603);
    }finally{__CLR4_4_113tb13tblc8azwol.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_113tb13tblc8azwol.R.inc(51605);
        __CLR4_4_113tb13tblc8azwol.R.inc(51606);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_113tb13tblc8azwol.R.inc(51607);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_113tb13tblc8azwol.R.inc(51608);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_113tb13tblc8azwol.R.inc(51609);originalLocale = Locale.getDefault();
        __CLR4_4_113tb13tblc8azwol.R.inc(51610);DateTimeZone.setDefault(LONDON);
        __CLR4_4_113tb13tblc8azwol.R.inc(51611);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_113tb13tblc8azwol.R.inc(51612);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_113tb13tblc8azwol.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_113tb13tblc8azwol.R.inc(51613);
        __CLR4_4_113tb13tblc8azwol.R.inc(51614);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_113tb13tblc8azwol.R.inc(51615);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_113tb13tblc8azwol.R.inc(51616);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_113tb13tblc8azwol.R.inc(51617);Locale.setDefault(originalLocale);
        __CLR4_4_113tb13tblc8azwol.R.inc(51618);originalDateTimeZone = null;
        __CLR4_4_113tb13tblc8azwol.R.inc(51619);originalTimeZone = null;
        __CLR4_4_113tb13tblc8azwol.R.inc(51620);originalLocale = null;
    }finally{__CLR4_4_113tb13tblc8azwol.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testFactoryUTC() {__CLR4_4_113tb13tblc8azwol.R.globalSliceStart(getClass().getName(),51621);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19knvhv13tx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_113tb13tblc8azwol.R.rethrow($CLV_t2$);}finally{__CLR4_4_113tb13tblc8azwol.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestGregorianChronology.testFactoryUTC",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),51621,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19knvhv13tx(){try{__CLR4_4_113tb13tblc8azwol.R.inc(51621);
        __CLR4_4_113tb13tblc8azwol.R.inc(51622);assertEquals(DateTimeZone.UTC, GregorianChronology.getInstanceUTC().getZone());
        __CLR4_4_113tb13tblc8azwol.R.inc(51623);assertSame(GregorianChronology.class, GregorianChronology.getInstanceUTC().getClass());
    }finally{__CLR4_4_113tb13tblc8azwol.R.flushNeeded();}}

    public void testFactory() {__CLR4_4_113tb13tblc8azwol.R.globalSliceStart(getClass().getName(),51624);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_116tztt13u0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_113tb13tblc8azwol.R.rethrow($CLV_t2$);}finally{__CLR4_4_113tb13tblc8azwol.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestGregorianChronology.testFactory",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),51624,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_116tztt13u0(){try{__CLR4_4_113tb13tblc8azwol.R.inc(51624);
        __CLR4_4_113tb13tblc8azwol.R.inc(51625);assertEquals(LONDON, GregorianChronology.getInstance().getZone());
        __CLR4_4_113tb13tblc8azwol.R.inc(51626);assertSame(GregorianChronology.class, GregorianChronology.getInstance().getClass());
    }finally{__CLR4_4_113tb13tblc8azwol.R.flushNeeded();}}

    public void testFactory_Zone() {__CLR4_4_113tb13tblc8azwol.R.globalSliceStart(getClass().getName(),51627);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yy5ime13u3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_113tb13tblc8azwol.R.rethrow($CLV_t2$);}finally{__CLR4_4_113tb13tblc8azwol.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestGregorianChronology.testFactory_Zone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),51627,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yy5ime13u3(){try{__CLR4_4_113tb13tblc8azwol.R.inc(51627);
        __CLR4_4_113tb13tblc8azwol.R.inc(51628);assertEquals(TOKYO, GregorianChronology.getInstance(TOKYO).getZone());
        __CLR4_4_113tb13tblc8azwol.R.inc(51629);assertEquals(PARIS, GregorianChronology.getInstance(PARIS).getZone());
        __CLR4_4_113tb13tblc8azwol.R.inc(51630);assertEquals(LONDON, GregorianChronology.getInstance(null).getZone());
        __CLR4_4_113tb13tblc8azwol.R.inc(51631);assertSame(GregorianChronology.class, GregorianChronology.getInstance(TOKYO).getClass());
    }finally{__CLR4_4_113tb13tblc8azwol.R.flushNeeded();}}

    public void testFactory_Zone_int() {__CLR4_4_113tb13tblc8azwol.R.globalSliceStart(getClass().getName(),51632);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rvgr1213u8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_113tb13tblc8azwol.R.rethrow($CLV_t2$);}finally{__CLR4_4_113tb13tblc8azwol.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestGregorianChronology.testFactory_Zone_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),51632,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rvgr1213u8(){try{__CLR4_4_113tb13tblc8azwol.R.inc(51632);
        __CLR4_4_113tb13tblc8azwol.R.inc(51633);GregorianChronology chrono = GregorianChronology.getInstance(TOKYO, 2);
        __CLR4_4_113tb13tblc8azwol.R.inc(51634);assertEquals(TOKYO, chrono.getZone());
        __CLR4_4_113tb13tblc8azwol.R.inc(51635);assertEquals(2, chrono.getMinimumDaysInFirstWeek());
        
        __CLR4_4_113tb13tblc8azwol.R.inc(51636);try {
            __CLR4_4_113tb13tblc8azwol.R.inc(51637);GregorianChronology.getInstance(TOKYO, 0);
            __CLR4_4_113tb13tblc8azwol.R.inc(51638);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_113tb13tblc8azwol.R.inc(51639);try {
            __CLR4_4_113tb13tblc8azwol.R.inc(51640);GregorianChronology.getInstance(TOKYO, 8);
            __CLR4_4_113tb13tblc8azwol.R.inc(51641);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_113tb13tblc8azwol.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testEquality() {__CLR4_4_113tb13tblc8azwol.R.globalSliceStart(getClass().getName(),51642);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12agdql13ui();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_113tb13tblc8azwol.R.rethrow($CLV_t2$);}finally{__CLR4_4_113tb13tblc8azwol.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestGregorianChronology.testEquality",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),51642,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12agdql13ui(){try{__CLR4_4_113tb13tblc8azwol.R.inc(51642);
        __CLR4_4_113tb13tblc8azwol.R.inc(51643);assertSame(GregorianChronology.getInstance(TOKYO), GregorianChronology.getInstance(TOKYO));
        __CLR4_4_113tb13tblc8azwol.R.inc(51644);assertSame(GregorianChronology.getInstance(LONDON), GregorianChronology.getInstance(LONDON));
        __CLR4_4_113tb13tblc8azwol.R.inc(51645);assertSame(GregorianChronology.getInstance(PARIS), GregorianChronology.getInstance(PARIS));
        __CLR4_4_113tb13tblc8azwol.R.inc(51646);assertSame(GregorianChronology.getInstanceUTC(), GregorianChronology.getInstanceUTC());
        __CLR4_4_113tb13tblc8azwol.R.inc(51647);assertSame(GregorianChronology.getInstance(), GregorianChronology.getInstance(LONDON));
    }finally{__CLR4_4_113tb13tblc8azwol.R.flushNeeded();}}

    public void testWithUTC() {__CLR4_4_113tb13tblc8azwol.R.globalSliceStart(getClass().getName(),51648);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19orv8313uo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_113tb13tblc8azwol.R.rethrow($CLV_t2$);}finally{__CLR4_4_113tb13tblc8azwol.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestGregorianChronology.testWithUTC",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),51648,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19orv8313uo(){try{__CLR4_4_113tb13tblc8azwol.R.inc(51648);
        __CLR4_4_113tb13tblc8azwol.R.inc(51649);assertSame(GregorianChronology.getInstanceUTC(), GregorianChronology.getInstance(LONDON).withUTC());
        __CLR4_4_113tb13tblc8azwol.R.inc(51650);assertSame(GregorianChronology.getInstanceUTC(), GregorianChronology.getInstance(TOKYO).withUTC());
        __CLR4_4_113tb13tblc8azwol.R.inc(51651);assertSame(GregorianChronology.getInstanceUTC(), GregorianChronology.getInstanceUTC().withUTC());
        __CLR4_4_113tb13tblc8azwol.R.inc(51652);assertSame(GregorianChronology.getInstanceUTC(), GregorianChronology.getInstance().withUTC());
    }finally{__CLR4_4_113tb13tblc8azwol.R.flushNeeded();}}

    public void testWithZone() {__CLR4_4_113tb13tblc8azwol.R.globalSliceStart(getClass().getName(),51653);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1me3iet13ut();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_113tb13tblc8azwol.R.rethrow($CLV_t2$);}finally{__CLR4_4_113tb13tblc8azwol.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestGregorianChronology.testWithZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),51653,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1me3iet13ut(){try{__CLR4_4_113tb13tblc8azwol.R.inc(51653);
        __CLR4_4_113tb13tblc8azwol.R.inc(51654);assertSame(GregorianChronology.getInstance(TOKYO), GregorianChronology.getInstance(TOKYO).withZone(TOKYO));
        __CLR4_4_113tb13tblc8azwol.R.inc(51655);assertSame(GregorianChronology.getInstance(LONDON), GregorianChronology.getInstance(TOKYO).withZone(LONDON));
        __CLR4_4_113tb13tblc8azwol.R.inc(51656);assertSame(GregorianChronology.getInstance(PARIS), GregorianChronology.getInstance(TOKYO).withZone(PARIS));
        __CLR4_4_113tb13tblc8azwol.R.inc(51657);assertSame(GregorianChronology.getInstance(LONDON), GregorianChronology.getInstance(TOKYO).withZone(null));
        __CLR4_4_113tb13tblc8azwol.R.inc(51658);assertSame(GregorianChronology.getInstance(PARIS), GregorianChronology.getInstance().withZone(PARIS));
        __CLR4_4_113tb13tblc8azwol.R.inc(51659);assertSame(GregorianChronology.getInstance(PARIS), GregorianChronology.getInstanceUTC().withZone(PARIS));
    }finally{__CLR4_4_113tb13tblc8azwol.R.flushNeeded();}}

    public void testToString() {__CLR4_4_113tb13tblc8azwol.R.globalSliceStart(getClass().getName(),51660);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hrxdid13v0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_113tb13tblc8azwol.R.rethrow($CLV_t2$);}finally{__CLR4_4_113tb13tblc8azwol.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestGregorianChronology.testToString",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),51660,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hrxdid13v0(){try{__CLR4_4_113tb13tblc8azwol.R.inc(51660);
        __CLR4_4_113tb13tblc8azwol.R.inc(51661);assertEquals("GregorianChronology[Europe/London]", GregorianChronology.getInstance(LONDON).toString());
        __CLR4_4_113tb13tblc8azwol.R.inc(51662);assertEquals("GregorianChronology[Asia/Tokyo]", GregorianChronology.getInstance(TOKYO).toString());
        __CLR4_4_113tb13tblc8azwol.R.inc(51663);assertEquals("GregorianChronology[Europe/London]", GregorianChronology.getInstance().toString());
        __CLR4_4_113tb13tblc8azwol.R.inc(51664);assertEquals("GregorianChronology[UTC]", GregorianChronology.getInstanceUTC().toString());
        __CLR4_4_113tb13tblc8azwol.R.inc(51665);assertEquals("GregorianChronology[UTC,mdfw=2]", GregorianChronology.getInstance(DateTimeZone.UTC, 2).toString());
    }finally{__CLR4_4_113tb13tblc8azwol.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testDurationFields() {__CLR4_4_113tb13tblc8azwol.R.globalSliceStart(getClass().getName(),51666);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cnkzye13v6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_113tb13tblc8azwol.R.rethrow($CLV_t2$);}finally{__CLR4_4_113tb13tblc8azwol.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestGregorianChronology.testDurationFields",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),51666,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cnkzye13v6(){try{__CLR4_4_113tb13tblc8azwol.R.inc(51666);
        __CLR4_4_113tb13tblc8azwol.R.inc(51667);final GregorianChronology greg = GregorianChronology.getInstance();
        __CLR4_4_113tb13tblc8azwol.R.inc(51668);assertEquals("eras", greg.eras().getName());
        __CLR4_4_113tb13tblc8azwol.R.inc(51669);assertEquals("centuries", greg.centuries().getName());
        __CLR4_4_113tb13tblc8azwol.R.inc(51670);assertEquals("years", greg.years().getName());
        __CLR4_4_113tb13tblc8azwol.R.inc(51671);assertEquals("weekyears", greg.weekyears().getName());
        __CLR4_4_113tb13tblc8azwol.R.inc(51672);assertEquals("months", greg.months().getName());
        __CLR4_4_113tb13tblc8azwol.R.inc(51673);assertEquals("weeks", greg.weeks().getName());
        __CLR4_4_113tb13tblc8azwol.R.inc(51674);assertEquals("days", greg.days().getName());
        __CLR4_4_113tb13tblc8azwol.R.inc(51675);assertEquals("halfdays", greg.halfdays().getName());
        __CLR4_4_113tb13tblc8azwol.R.inc(51676);assertEquals("hours", greg.hours().getName());
        __CLR4_4_113tb13tblc8azwol.R.inc(51677);assertEquals("minutes", greg.minutes().getName());
        __CLR4_4_113tb13tblc8azwol.R.inc(51678);assertEquals("seconds", greg.seconds().getName());
        __CLR4_4_113tb13tblc8azwol.R.inc(51679);assertEquals("millis", greg.millis().getName());
        
        __CLR4_4_113tb13tblc8azwol.R.inc(51680);assertEquals(false, greg.eras().isSupported());
        __CLR4_4_113tb13tblc8azwol.R.inc(51681);assertEquals(true, greg.centuries().isSupported());
        __CLR4_4_113tb13tblc8azwol.R.inc(51682);assertEquals(true, greg.years().isSupported());
        __CLR4_4_113tb13tblc8azwol.R.inc(51683);assertEquals(true, greg.weekyears().isSupported());
        __CLR4_4_113tb13tblc8azwol.R.inc(51684);assertEquals(true, greg.months().isSupported());
        __CLR4_4_113tb13tblc8azwol.R.inc(51685);assertEquals(true, greg.weeks().isSupported());
        __CLR4_4_113tb13tblc8azwol.R.inc(51686);assertEquals(true, greg.days().isSupported());
        __CLR4_4_113tb13tblc8azwol.R.inc(51687);assertEquals(true, greg.halfdays().isSupported());
        __CLR4_4_113tb13tblc8azwol.R.inc(51688);assertEquals(true, greg.hours().isSupported());
        __CLR4_4_113tb13tblc8azwol.R.inc(51689);assertEquals(true, greg.minutes().isSupported());
        __CLR4_4_113tb13tblc8azwol.R.inc(51690);assertEquals(true, greg.seconds().isSupported());
        __CLR4_4_113tb13tblc8azwol.R.inc(51691);assertEquals(true, greg.millis().isSupported());
        
        __CLR4_4_113tb13tblc8azwol.R.inc(51692);assertEquals(false, greg.centuries().isPrecise());
        __CLR4_4_113tb13tblc8azwol.R.inc(51693);assertEquals(false, greg.years().isPrecise());
        __CLR4_4_113tb13tblc8azwol.R.inc(51694);assertEquals(false, greg.weekyears().isPrecise());
        __CLR4_4_113tb13tblc8azwol.R.inc(51695);assertEquals(false, greg.months().isPrecise());
        __CLR4_4_113tb13tblc8azwol.R.inc(51696);assertEquals(false, greg.weeks().isPrecise());
        __CLR4_4_113tb13tblc8azwol.R.inc(51697);assertEquals(false, greg.days().isPrecise());
        __CLR4_4_113tb13tblc8azwol.R.inc(51698);assertEquals(false, greg.halfdays().isPrecise());
        __CLR4_4_113tb13tblc8azwol.R.inc(51699);assertEquals(true, greg.hours().isPrecise());
        __CLR4_4_113tb13tblc8azwol.R.inc(51700);assertEquals(true, greg.minutes().isPrecise());
        __CLR4_4_113tb13tblc8azwol.R.inc(51701);assertEquals(true, greg.seconds().isPrecise());
        __CLR4_4_113tb13tblc8azwol.R.inc(51702);assertEquals(true, greg.millis().isPrecise());
        
        __CLR4_4_113tb13tblc8azwol.R.inc(51703);final GregorianChronology gregUTC = GregorianChronology.getInstanceUTC();
        __CLR4_4_113tb13tblc8azwol.R.inc(51704);assertEquals(false, gregUTC.centuries().isPrecise());
        __CLR4_4_113tb13tblc8azwol.R.inc(51705);assertEquals(false, gregUTC.years().isPrecise());
        __CLR4_4_113tb13tblc8azwol.R.inc(51706);assertEquals(false, gregUTC.weekyears().isPrecise());
        __CLR4_4_113tb13tblc8azwol.R.inc(51707);assertEquals(false, gregUTC.months().isPrecise());
        __CLR4_4_113tb13tblc8azwol.R.inc(51708);assertEquals(true, gregUTC.weeks().isPrecise());
        __CLR4_4_113tb13tblc8azwol.R.inc(51709);assertEquals(true, gregUTC.days().isPrecise());
        __CLR4_4_113tb13tblc8azwol.R.inc(51710);assertEquals(true, gregUTC.halfdays().isPrecise());
        __CLR4_4_113tb13tblc8azwol.R.inc(51711);assertEquals(true, gregUTC.hours().isPrecise());
        __CLR4_4_113tb13tblc8azwol.R.inc(51712);assertEquals(true, gregUTC.minutes().isPrecise());
        __CLR4_4_113tb13tblc8azwol.R.inc(51713);assertEquals(true, gregUTC.seconds().isPrecise());
        __CLR4_4_113tb13tblc8azwol.R.inc(51714);assertEquals(true, gregUTC.millis().isPrecise());
        
        __CLR4_4_113tb13tblc8azwol.R.inc(51715);final DateTimeZone gmt = DateTimeZone.forID("Etc/GMT");
        __CLR4_4_113tb13tblc8azwol.R.inc(51716);final GregorianChronology gregGMT = GregorianChronology.getInstance(gmt);
        __CLR4_4_113tb13tblc8azwol.R.inc(51717);assertEquals(false, gregGMT.centuries().isPrecise());
        __CLR4_4_113tb13tblc8azwol.R.inc(51718);assertEquals(false, gregGMT.years().isPrecise());
        __CLR4_4_113tb13tblc8azwol.R.inc(51719);assertEquals(false, gregGMT.weekyears().isPrecise());
        __CLR4_4_113tb13tblc8azwol.R.inc(51720);assertEquals(false, gregGMT.months().isPrecise());
        __CLR4_4_113tb13tblc8azwol.R.inc(51721);assertEquals(true, gregGMT.weeks().isPrecise());
        __CLR4_4_113tb13tblc8azwol.R.inc(51722);assertEquals(true, gregGMT.days().isPrecise());
        __CLR4_4_113tb13tblc8azwol.R.inc(51723);assertEquals(true, gregGMT.halfdays().isPrecise());
        __CLR4_4_113tb13tblc8azwol.R.inc(51724);assertEquals(true, gregGMT.hours().isPrecise());
        __CLR4_4_113tb13tblc8azwol.R.inc(51725);assertEquals(true, gregGMT.minutes().isPrecise());
        __CLR4_4_113tb13tblc8azwol.R.inc(51726);assertEquals(true, gregGMT.seconds().isPrecise());
        __CLR4_4_113tb13tblc8azwol.R.inc(51727);assertEquals(true, gregGMT.millis().isPrecise());
    }finally{__CLR4_4_113tb13tblc8azwol.R.flushNeeded();}}

    public void testDateFields() {__CLR4_4_113tb13tblc8azwol.R.globalSliceStart(getClass().getName(),51728);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gkspeo13ww();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_113tb13tblc8azwol.R.rethrow($CLV_t2$);}finally{__CLR4_4_113tb13tblc8azwol.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestGregorianChronology.testDateFields",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),51728,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gkspeo13ww(){try{__CLR4_4_113tb13tblc8azwol.R.inc(51728);
        __CLR4_4_113tb13tblc8azwol.R.inc(51729);final GregorianChronology greg = GregorianChronology.getInstance();
        __CLR4_4_113tb13tblc8azwol.R.inc(51730);assertEquals("era", greg.era().getName());
        __CLR4_4_113tb13tblc8azwol.R.inc(51731);assertEquals("centuryOfEra", greg.centuryOfEra().getName());
        __CLR4_4_113tb13tblc8azwol.R.inc(51732);assertEquals("yearOfCentury", greg.yearOfCentury().getName());
        __CLR4_4_113tb13tblc8azwol.R.inc(51733);assertEquals("yearOfEra", greg.yearOfEra().getName());
        __CLR4_4_113tb13tblc8azwol.R.inc(51734);assertEquals("year", greg.year().getName());
        __CLR4_4_113tb13tblc8azwol.R.inc(51735);assertEquals("monthOfYear", greg.monthOfYear().getName());
        __CLR4_4_113tb13tblc8azwol.R.inc(51736);assertEquals("weekyearOfCentury", greg.weekyearOfCentury().getName());
        __CLR4_4_113tb13tblc8azwol.R.inc(51737);assertEquals("weekyear", greg.weekyear().getName());
        __CLR4_4_113tb13tblc8azwol.R.inc(51738);assertEquals("weekOfWeekyear", greg.weekOfWeekyear().getName());
        __CLR4_4_113tb13tblc8azwol.R.inc(51739);assertEquals("dayOfYear", greg.dayOfYear().getName());
        __CLR4_4_113tb13tblc8azwol.R.inc(51740);assertEquals("dayOfMonth", greg.dayOfMonth().getName());
        __CLR4_4_113tb13tblc8azwol.R.inc(51741);assertEquals("dayOfWeek", greg.dayOfWeek().getName());
        
        __CLR4_4_113tb13tblc8azwol.R.inc(51742);assertEquals(true, greg.era().isSupported());
        __CLR4_4_113tb13tblc8azwol.R.inc(51743);assertEquals(true, greg.centuryOfEra().isSupported());
        __CLR4_4_113tb13tblc8azwol.R.inc(51744);assertEquals(true, greg.yearOfCentury().isSupported());
        __CLR4_4_113tb13tblc8azwol.R.inc(51745);assertEquals(true, greg.yearOfEra().isSupported());
        __CLR4_4_113tb13tblc8azwol.R.inc(51746);assertEquals(true, greg.year().isSupported());
        __CLR4_4_113tb13tblc8azwol.R.inc(51747);assertEquals(true, greg.monthOfYear().isSupported());
        __CLR4_4_113tb13tblc8azwol.R.inc(51748);assertEquals(true, greg.weekyearOfCentury().isSupported());
        __CLR4_4_113tb13tblc8azwol.R.inc(51749);assertEquals(true, greg.weekyear().isSupported());
        __CLR4_4_113tb13tblc8azwol.R.inc(51750);assertEquals(true, greg.weekOfWeekyear().isSupported());
        __CLR4_4_113tb13tblc8azwol.R.inc(51751);assertEquals(true, greg.dayOfYear().isSupported());
        __CLR4_4_113tb13tblc8azwol.R.inc(51752);assertEquals(true, greg.dayOfMonth().isSupported());
        __CLR4_4_113tb13tblc8azwol.R.inc(51753);assertEquals(true, greg.dayOfWeek().isSupported());
        
        __CLR4_4_113tb13tblc8azwol.R.inc(51754);assertEquals(greg.eras(), greg.era().getDurationField());
        __CLR4_4_113tb13tblc8azwol.R.inc(51755);assertEquals(greg.centuries(), greg.centuryOfEra().getDurationField());
        __CLR4_4_113tb13tblc8azwol.R.inc(51756);assertEquals(greg.years(), greg.yearOfCentury().getDurationField());
        __CLR4_4_113tb13tblc8azwol.R.inc(51757);assertEquals(greg.years(), greg.yearOfEra().getDurationField());
        __CLR4_4_113tb13tblc8azwol.R.inc(51758);assertEquals(greg.years(), greg.year().getDurationField());
        __CLR4_4_113tb13tblc8azwol.R.inc(51759);assertEquals(greg.months(), greg.monthOfYear().getDurationField());
        __CLR4_4_113tb13tblc8azwol.R.inc(51760);assertEquals(greg.weekyears(), greg.weekyearOfCentury().getDurationField());
        __CLR4_4_113tb13tblc8azwol.R.inc(51761);assertEquals(greg.weekyears(), greg.weekyear().getDurationField());
        __CLR4_4_113tb13tblc8azwol.R.inc(51762);assertEquals(greg.weeks(), greg.weekOfWeekyear().getDurationField());
        __CLR4_4_113tb13tblc8azwol.R.inc(51763);assertEquals(greg.days(), greg.dayOfYear().getDurationField());
        __CLR4_4_113tb13tblc8azwol.R.inc(51764);assertEquals(greg.days(), greg.dayOfMonth().getDurationField());
        __CLR4_4_113tb13tblc8azwol.R.inc(51765);assertEquals(greg.days(), greg.dayOfWeek().getDurationField());
        
        __CLR4_4_113tb13tblc8azwol.R.inc(51766);assertEquals(null, greg.era().getRangeDurationField());
        __CLR4_4_113tb13tblc8azwol.R.inc(51767);assertEquals(greg.eras(), greg.centuryOfEra().getRangeDurationField());
        __CLR4_4_113tb13tblc8azwol.R.inc(51768);assertEquals(greg.centuries(), greg.yearOfCentury().getRangeDurationField());
        __CLR4_4_113tb13tblc8azwol.R.inc(51769);assertEquals(greg.eras(), greg.yearOfEra().getRangeDurationField());
        __CLR4_4_113tb13tblc8azwol.R.inc(51770);assertEquals(null, greg.year().getRangeDurationField());
        __CLR4_4_113tb13tblc8azwol.R.inc(51771);assertEquals(greg.years(), greg.monthOfYear().getRangeDurationField());
        __CLR4_4_113tb13tblc8azwol.R.inc(51772);assertEquals(greg.centuries(), greg.weekyearOfCentury().getRangeDurationField());
        __CLR4_4_113tb13tblc8azwol.R.inc(51773);assertEquals(null, greg.weekyear().getRangeDurationField());
        __CLR4_4_113tb13tblc8azwol.R.inc(51774);assertEquals(greg.weekyears(), greg.weekOfWeekyear().getRangeDurationField());
        __CLR4_4_113tb13tblc8azwol.R.inc(51775);assertEquals(greg.years(), greg.dayOfYear().getRangeDurationField());
        __CLR4_4_113tb13tblc8azwol.R.inc(51776);assertEquals(greg.months(), greg.dayOfMonth().getRangeDurationField());
        __CLR4_4_113tb13tblc8azwol.R.inc(51777);assertEquals(greg.weeks(), greg.dayOfWeek().getRangeDurationField());
    }finally{__CLR4_4_113tb13tblc8azwol.R.flushNeeded();}}

    public void testTimeFields() {__CLR4_4_113tb13tblc8azwol.R.globalSliceStart(getClass().getName(),51778);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11r11up13ya();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_113tb13tblc8azwol.R.rethrow($CLV_t2$);}finally{__CLR4_4_113tb13tblc8azwol.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestGregorianChronology.testTimeFields",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),51778,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11r11up13ya(){try{__CLR4_4_113tb13tblc8azwol.R.inc(51778);
        __CLR4_4_113tb13tblc8azwol.R.inc(51779);final GregorianChronology greg = GregorianChronology.getInstance();
        __CLR4_4_113tb13tblc8azwol.R.inc(51780);assertEquals("halfdayOfDay", greg.halfdayOfDay().getName());
        __CLR4_4_113tb13tblc8azwol.R.inc(51781);assertEquals("clockhourOfHalfday", greg.clockhourOfHalfday().getName());
        __CLR4_4_113tb13tblc8azwol.R.inc(51782);assertEquals("hourOfHalfday", greg.hourOfHalfday().getName());
        __CLR4_4_113tb13tblc8azwol.R.inc(51783);assertEquals("clockhourOfDay", greg.clockhourOfDay().getName());
        __CLR4_4_113tb13tblc8azwol.R.inc(51784);assertEquals("hourOfDay", greg.hourOfDay().getName());
        __CLR4_4_113tb13tblc8azwol.R.inc(51785);assertEquals("minuteOfDay", greg.minuteOfDay().getName());
        __CLR4_4_113tb13tblc8azwol.R.inc(51786);assertEquals("minuteOfHour", greg.minuteOfHour().getName());
        __CLR4_4_113tb13tblc8azwol.R.inc(51787);assertEquals("secondOfDay", greg.secondOfDay().getName());
        __CLR4_4_113tb13tblc8azwol.R.inc(51788);assertEquals("secondOfMinute", greg.secondOfMinute().getName());
        __CLR4_4_113tb13tblc8azwol.R.inc(51789);assertEquals("millisOfDay", greg.millisOfDay().getName());
        __CLR4_4_113tb13tblc8azwol.R.inc(51790);assertEquals("millisOfSecond", greg.millisOfSecond().getName());
        
        __CLR4_4_113tb13tblc8azwol.R.inc(51791);assertEquals(true, greg.halfdayOfDay().isSupported());
        __CLR4_4_113tb13tblc8azwol.R.inc(51792);assertEquals(true, greg.clockhourOfHalfday().isSupported());
        __CLR4_4_113tb13tblc8azwol.R.inc(51793);assertEquals(true, greg.hourOfHalfday().isSupported());
        __CLR4_4_113tb13tblc8azwol.R.inc(51794);assertEquals(true, greg.clockhourOfDay().isSupported());
        __CLR4_4_113tb13tblc8azwol.R.inc(51795);assertEquals(true, greg.hourOfDay().isSupported());
        __CLR4_4_113tb13tblc8azwol.R.inc(51796);assertEquals(true, greg.minuteOfDay().isSupported());
        __CLR4_4_113tb13tblc8azwol.R.inc(51797);assertEquals(true, greg.minuteOfHour().isSupported());
        __CLR4_4_113tb13tblc8azwol.R.inc(51798);assertEquals(true, greg.secondOfDay().isSupported());
        __CLR4_4_113tb13tblc8azwol.R.inc(51799);assertEquals(true, greg.secondOfMinute().isSupported());
        __CLR4_4_113tb13tblc8azwol.R.inc(51800);assertEquals(true, greg.millisOfDay().isSupported());
        __CLR4_4_113tb13tblc8azwol.R.inc(51801);assertEquals(true, greg.millisOfSecond().isSupported());
    }finally{__CLR4_4_113tb13tblc8azwol.R.flushNeeded();}}

    public void testMaximumValue() {__CLR4_4_113tb13tblc8azwol.R.globalSliceStart(getClass().getName(),51802);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qnw3be13yy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_113tb13tblc8azwol.R.rethrow($CLV_t2$);}finally{__CLR4_4_113tb13tblc8azwol.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestGregorianChronology.testMaximumValue",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),51802,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qnw3be13yy(){try{__CLR4_4_113tb13tblc8azwol.R.inc(51802);
        __CLR4_4_113tb13tblc8azwol.R.inc(51803);YearMonthDay ymd1 = new YearMonthDay(1999, DateTimeConstants.FEBRUARY, 1);
        __CLR4_4_113tb13tblc8azwol.R.inc(51804);DateMidnight dm1 = new DateMidnight(1999, DateTimeConstants.FEBRUARY, 1);
        __CLR4_4_113tb13tblc8azwol.R.inc(51805);Chronology chrono = GregorianChronology.getInstance();
        __CLR4_4_113tb13tblc8azwol.R.inc(51806);assertEquals(28, chrono.dayOfMonth().getMaximumValue(ymd1));
        __CLR4_4_113tb13tblc8azwol.R.inc(51807);assertEquals(28, chrono.dayOfMonth().getMaximumValue(dm1.getMillis()));
    }finally{__CLR4_4_113tb13tblc8azwol.R.flushNeeded();}}

}
