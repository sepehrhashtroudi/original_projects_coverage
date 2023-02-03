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
import org.joda.time.DateTimeUtils;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationField;
import org.joda.time.DurationFieldType;
import org.joda.time.IllegalFieldValueException;
import org.joda.time.Instant;
import org.joda.time.Period;
import org.joda.time.TimeOfDay;
import org.joda.time.YearMonthDay;

/**
 * This class is a Junit unit test for GJChronology.
 *
 * @author Stephen Colebourne
 */
@SuppressWarnings("deprecation")
public class TestGJChronology extends TestCase {static class __CLR4_4_113hp13hplc8azwnp{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672271031490L,8589935092L,51538,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

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

    public static void main(String[] args) {try{__CLR4_4_113hp13hplc8azwnp.R.inc(51181);
        __CLR4_4_113hp13hplc8azwnp.R.inc(51182);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_113hp13hplc8azwnp.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_113hp13hplc8azwnp.R.inc(51183);
        __CLR4_4_113hp13hplc8azwnp.R.inc(51184);return new TestSuite(TestGJChronology.class);
    }finally{__CLR4_4_113hp13hplc8azwnp.R.flushNeeded();}}

    public TestGJChronology(String name) {
        super(name);__CLR4_4_113hp13hplc8azwnp.R.inc(51186);try{__CLR4_4_113hp13hplc8azwnp.R.inc(51185);
    }finally{__CLR4_4_113hp13hplc8azwnp.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_113hp13hplc8azwnp.R.inc(51187);
        __CLR4_4_113hp13hplc8azwnp.R.inc(51188);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_113hp13hplc8azwnp.R.inc(51189);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_113hp13hplc8azwnp.R.inc(51190);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_113hp13hplc8azwnp.R.inc(51191);originalLocale = Locale.getDefault();
        __CLR4_4_113hp13hplc8azwnp.R.inc(51192);DateTimeZone.setDefault(LONDON);
        __CLR4_4_113hp13hplc8azwnp.R.inc(51193);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_113hp13hplc8azwnp.R.inc(51194);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_113hp13hplc8azwnp.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_113hp13hplc8azwnp.R.inc(51195);
        __CLR4_4_113hp13hplc8azwnp.R.inc(51196);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_113hp13hplc8azwnp.R.inc(51197);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_113hp13hplc8azwnp.R.inc(51198);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_113hp13hplc8azwnp.R.inc(51199);Locale.setDefault(originalLocale);
        __CLR4_4_113hp13hplc8azwnp.R.inc(51200);originalDateTimeZone = null;
        __CLR4_4_113hp13hplc8azwnp.R.inc(51201);originalTimeZone = null;
        __CLR4_4_113hp13hplc8azwnp.R.inc(51202);originalLocale = null;
    }finally{__CLR4_4_113hp13hplc8azwnp.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testFactoryUTC() {__CLR4_4_113hp13hplc8azwnp.R.globalSliceStart(getClass().getName(),51203);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19knvhv13ib();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_113hp13hplc8azwnp.R.rethrow($CLV_t2$);}finally{__CLR4_4_113hp13hplc8azwnp.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestGJChronology.testFactoryUTC",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),51203,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19knvhv13ib(){try{__CLR4_4_113hp13hplc8azwnp.R.inc(51203);
        __CLR4_4_113hp13hplc8azwnp.R.inc(51204);assertEquals(DateTimeZone.UTC, GJChronology.getInstanceUTC().getZone());
        __CLR4_4_113hp13hplc8azwnp.R.inc(51205);assertSame(GJChronology.class, GJChronology.getInstanceUTC().getClass());
    }finally{__CLR4_4_113hp13hplc8azwnp.R.flushNeeded();}}

    public void testFactory() {__CLR4_4_113hp13hplc8azwnp.R.globalSliceStart(getClass().getName(),51206);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_116tztt13ie();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_113hp13hplc8azwnp.R.rethrow($CLV_t2$);}finally{__CLR4_4_113hp13hplc8azwnp.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestGJChronology.testFactory",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),51206,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_116tztt13ie(){try{__CLR4_4_113hp13hplc8azwnp.R.inc(51206);
        __CLR4_4_113hp13hplc8azwnp.R.inc(51207);assertEquals(LONDON, GJChronology.getInstance().getZone());
        __CLR4_4_113hp13hplc8azwnp.R.inc(51208);assertSame(GJChronology.class, GJChronology.getInstance().getClass());
    }finally{__CLR4_4_113hp13hplc8azwnp.R.flushNeeded();}}

    public void testFactory_Zone() {__CLR4_4_113hp13hplc8azwnp.R.globalSliceStart(getClass().getName(),51209);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yy5ime13ih();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_113hp13hplc8azwnp.R.rethrow($CLV_t2$);}finally{__CLR4_4_113hp13hplc8azwnp.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestGJChronology.testFactory_Zone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),51209,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yy5ime13ih(){try{__CLR4_4_113hp13hplc8azwnp.R.inc(51209);
        __CLR4_4_113hp13hplc8azwnp.R.inc(51210);assertEquals(TOKYO, GJChronology.getInstance(TOKYO).getZone());
        __CLR4_4_113hp13hplc8azwnp.R.inc(51211);assertEquals(PARIS, GJChronology.getInstance(PARIS).getZone());
        __CLR4_4_113hp13hplc8azwnp.R.inc(51212);assertEquals(LONDON, GJChronology.getInstance(null).getZone());
        __CLR4_4_113hp13hplc8azwnp.R.inc(51213);assertSame(GJChronology.class, GJChronology.getInstance(TOKYO).getClass());
    }finally{__CLR4_4_113hp13hplc8azwnp.R.flushNeeded();}}

    public void testFactory_Zone_long_int() {__CLR4_4_113hp13hplc8azwnp.R.globalSliceStart(getClass().getName(),51214);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16bh80x13im();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_113hp13hplc8azwnp.R.rethrow($CLV_t2$);}finally{__CLR4_4_113hp13hplc8azwnp.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestGJChronology.testFactory_Zone_long_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),51214,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16bh80x13im(){try{__CLR4_4_113hp13hplc8azwnp.R.inc(51214);
        __CLR4_4_113hp13hplc8azwnp.R.inc(51215);GJChronology chrono = GJChronology.getInstance(TOKYO, 0L, 2);
        __CLR4_4_113hp13hplc8azwnp.R.inc(51216);assertEquals(TOKYO, chrono.getZone());
        __CLR4_4_113hp13hplc8azwnp.R.inc(51217);assertEquals(new Instant(0L), chrono.getGregorianCutover());
        __CLR4_4_113hp13hplc8azwnp.R.inc(51218);assertEquals(2, chrono.getMinimumDaysInFirstWeek());
        __CLR4_4_113hp13hplc8azwnp.R.inc(51219);assertSame(GJChronology.class, GJChronology.getInstance(TOKYO, 0L, 2).getClass());
        
        __CLR4_4_113hp13hplc8azwnp.R.inc(51220);try {
            __CLR4_4_113hp13hplc8azwnp.R.inc(51221);GJChronology.getInstance(TOKYO, 0L, 0);
            __CLR4_4_113hp13hplc8azwnp.R.inc(51222);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_113hp13hplc8azwnp.R.inc(51223);try {
            __CLR4_4_113hp13hplc8azwnp.R.inc(51224);GJChronology.getInstance(TOKYO, 0L, 8);
            __CLR4_4_113hp13hplc8azwnp.R.inc(51225);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_113hp13hplc8azwnp.R.flushNeeded();}}

    public void testFactory_Zone_RI() {__CLR4_4_113hp13hplc8azwnp.R.globalSliceStart(getClass().getName(),51226);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ytide213iy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_113hp13hplc8azwnp.R.rethrow($CLV_t2$);}finally{__CLR4_4_113hp13hplc8azwnp.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestGJChronology.testFactory_Zone_RI",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),51226,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ytide213iy(){try{__CLR4_4_113hp13hplc8azwnp.R.inc(51226);
        __CLR4_4_113hp13hplc8azwnp.R.inc(51227);GJChronology chrono = GJChronology.getInstance(TOKYO, new Instant(0L));
        __CLR4_4_113hp13hplc8azwnp.R.inc(51228);assertEquals(TOKYO, chrono.getZone());
        __CLR4_4_113hp13hplc8azwnp.R.inc(51229);assertEquals(new Instant(0L), chrono.getGregorianCutover());
        __CLR4_4_113hp13hplc8azwnp.R.inc(51230);assertSame(GJChronology.class, GJChronology.getInstance(TOKYO, new Instant(0L)).getClass());
        
        __CLR4_4_113hp13hplc8azwnp.R.inc(51231);DateTime cutover = new DateTime(1582, 10, 15, 0, 0, 0, 0, DateTimeZone.UTC);
        __CLR4_4_113hp13hplc8azwnp.R.inc(51232);chrono = GJChronology.getInstance(TOKYO, null);
        __CLR4_4_113hp13hplc8azwnp.R.inc(51233);assertEquals(TOKYO, chrono.getZone());
        __CLR4_4_113hp13hplc8azwnp.R.inc(51234);assertEquals(cutover.toInstant(), chrono.getGregorianCutover());
    }finally{__CLR4_4_113hp13hplc8azwnp.R.flushNeeded();}}

    public void testFactory_Zone_RI_int() {__CLR4_4_113hp13hplc8azwnp.R.globalSliceStart(getClass().getName(),51235);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nohw5613j7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_113hp13hplc8azwnp.R.rethrow($CLV_t2$);}finally{__CLR4_4_113hp13hplc8azwnp.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestGJChronology.testFactory_Zone_RI_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),51235,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nohw5613j7(){try{__CLR4_4_113hp13hplc8azwnp.R.inc(51235);
        __CLR4_4_113hp13hplc8azwnp.R.inc(51236);GJChronology chrono = GJChronology.getInstance(TOKYO, new Instant(0L), 2);
        __CLR4_4_113hp13hplc8azwnp.R.inc(51237);assertEquals(TOKYO, chrono.getZone());
        __CLR4_4_113hp13hplc8azwnp.R.inc(51238);assertEquals(new Instant(0L), chrono.getGregorianCutover());
        __CLR4_4_113hp13hplc8azwnp.R.inc(51239);assertEquals(2, chrono.getMinimumDaysInFirstWeek());
        __CLR4_4_113hp13hplc8azwnp.R.inc(51240);assertSame(GJChronology.class, GJChronology.getInstance(TOKYO, new Instant(0L), 2).getClass());
        
        __CLR4_4_113hp13hplc8azwnp.R.inc(51241);DateTime cutover = new DateTime(1582, 10, 15, 0, 0, 0, 0, DateTimeZone.UTC);
        __CLR4_4_113hp13hplc8azwnp.R.inc(51242);chrono = GJChronology.getInstance(TOKYO, null, 2);
        __CLR4_4_113hp13hplc8azwnp.R.inc(51243);assertEquals(TOKYO, chrono.getZone());
        __CLR4_4_113hp13hplc8azwnp.R.inc(51244);assertEquals(cutover.toInstant(), chrono.getGregorianCutover());
        __CLR4_4_113hp13hplc8azwnp.R.inc(51245);assertEquals(2, chrono.getMinimumDaysInFirstWeek());
        
        __CLR4_4_113hp13hplc8azwnp.R.inc(51246);try {
            __CLR4_4_113hp13hplc8azwnp.R.inc(51247);GJChronology.getInstance(TOKYO, new Instant(0L), 0);
            __CLR4_4_113hp13hplc8azwnp.R.inc(51248);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_113hp13hplc8azwnp.R.inc(51249);try {
            __CLR4_4_113hp13hplc8azwnp.R.inc(51250);GJChronology.getInstance(TOKYO, new Instant(0L), 8);
            __CLR4_4_113hp13hplc8azwnp.R.inc(51251);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_113hp13hplc8azwnp.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testEquality() {__CLR4_4_113hp13hplc8azwnp.R.globalSliceStart(getClass().getName(),51252);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12agdql13jo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_113hp13hplc8azwnp.R.rethrow($CLV_t2$);}finally{__CLR4_4_113hp13hplc8azwnp.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestGJChronology.testEquality",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),51252,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12agdql13jo(){try{__CLR4_4_113hp13hplc8azwnp.R.inc(51252);
        __CLR4_4_113hp13hplc8azwnp.R.inc(51253);assertSame(GJChronology.getInstance(TOKYO), GJChronology.getInstance(TOKYO));
        __CLR4_4_113hp13hplc8azwnp.R.inc(51254);assertSame(GJChronology.getInstance(LONDON), GJChronology.getInstance(LONDON));
        __CLR4_4_113hp13hplc8azwnp.R.inc(51255);assertSame(GJChronology.getInstance(PARIS), GJChronology.getInstance(PARIS));
        __CLR4_4_113hp13hplc8azwnp.R.inc(51256);assertSame(GJChronology.getInstanceUTC(), GJChronology.getInstanceUTC());
        __CLR4_4_113hp13hplc8azwnp.R.inc(51257);assertSame(GJChronology.getInstance(), GJChronology.getInstance(LONDON));
    }finally{__CLR4_4_113hp13hplc8azwnp.R.flushNeeded();}}

    public void testWithUTC() {__CLR4_4_113hp13hplc8azwnp.R.globalSliceStart(getClass().getName(),51258);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19orv8313ju();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_113hp13hplc8azwnp.R.rethrow($CLV_t2$);}finally{__CLR4_4_113hp13hplc8azwnp.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestGJChronology.testWithUTC",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),51258,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19orv8313ju(){try{__CLR4_4_113hp13hplc8azwnp.R.inc(51258);
        __CLR4_4_113hp13hplc8azwnp.R.inc(51259);assertSame(GJChronology.getInstanceUTC(), GJChronology.getInstance(LONDON).withUTC());
        __CLR4_4_113hp13hplc8azwnp.R.inc(51260);assertSame(GJChronology.getInstanceUTC(), GJChronology.getInstance(TOKYO).withUTC());
        __CLR4_4_113hp13hplc8azwnp.R.inc(51261);assertSame(GJChronology.getInstanceUTC(), GJChronology.getInstanceUTC().withUTC());
        __CLR4_4_113hp13hplc8azwnp.R.inc(51262);assertSame(GJChronology.getInstanceUTC(), GJChronology.getInstance().withUTC());
    }finally{__CLR4_4_113hp13hplc8azwnp.R.flushNeeded();}}

    public void testWithZone() {__CLR4_4_113hp13hplc8azwnp.R.globalSliceStart(getClass().getName(),51263);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1me3iet13jz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_113hp13hplc8azwnp.R.rethrow($CLV_t2$);}finally{__CLR4_4_113hp13hplc8azwnp.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestGJChronology.testWithZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),51263,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1me3iet13jz(){try{__CLR4_4_113hp13hplc8azwnp.R.inc(51263);
        __CLR4_4_113hp13hplc8azwnp.R.inc(51264);assertSame(GJChronology.getInstance(TOKYO), GJChronology.getInstance(TOKYO).withZone(TOKYO));
        __CLR4_4_113hp13hplc8azwnp.R.inc(51265);assertSame(GJChronology.getInstance(LONDON), GJChronology.getInstance(TOKYO).withZone(LONDON));
        __CLR4_4_113hp13hplc8azwnp.R.inc(51266);assertSame(GJChronology.getInstance(PARIS), GJChronology.getInstance(TOKYO).withZone(PARIS));
        __CLR4_4_113hp13hplc8azwnp.R.inc(51267);assertSame(GJChronology.getInstance(LONDON), GJChronology.getInstance(TOKYO).withZone(null));
        __CLR4_4_113hp13hplc8azwnp.R.inc(51268);assertSame(GJChronology.getInstance(PARIS), GJChronology.getInstance().withZone(PARIS));
        __CLR4_4_113hp13hplc8azwnp.R.inc(51269);assertSame(GJChronology.getInstance(PARIS), GJChronology.getInstanceUTC().withZone(PARIS));
    }finally{__CLR4_4_113hp13hplc8azwnp.R.flushNeeded();}}

    public void testToString() {__CLR4_4_113hp13hplc8azwnp.R.globalSliceStart(getClass().getName(),51270);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hrxdid13k6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_113hp13hplc8azwnp.R.rethrow($CLV_t2$);}finally{__CLR4_4_113hp13hplc8azwnp.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestGJChronology.testToString",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),51270,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hrxdid13k6(){try{__CLR4_4_113hp13hplc8azwnp.R.inc(51270);
        __CLR4_4_113hp13hplc8azwnp.R.inc(51271);assertEquals("GJChronology[Europe/London]", GJChronology.getInstance(LONDON).toString());
        __CLR4_4_113hp13hplc8azwnp.R.inc(51272);assertEquals("GJChronology[Asia/Tokyo]", GJChronology.getInstance(TOKYO).toString());
        __CLR4_4_113hp13hplc8azwnp.R.inc(51273);assertEquals("GJChronology[Europe/London]", GJChronology.getInstance().toString());
        __CLR4_4_113hp13hplc8azwnp.R.inc(51274);assertEquals("GJChronology[UTC]", GJChronology.getInstanceUTC().toString());
        __CLR4_4_113hp13hplc8azwnp.R.inc(51275);assertEquals("GJChronology[UTC,cutover=1970-01-01]", GJChronology.getInstance(DateTimeZone.UTC, 0L, 4).toString());
        __CLR4_4_113hp13hplc8azwnp.R.inc(51276);assertEquals("GJChronology[UTC,cutover=1970-01-01T00:00:00.001Z,mdfw=2]", GJChronology.getInstance(DateTimeZone.UTC, 1L, 2).toString());
    }finally{__CLR4_4_113hp13hplc8azwnp.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testDurationFields() {__CLR4_4_113hp13hplc8azwnp.R.globalSliceStart(getClass().getName(),51277);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cnkzye13kd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_113hp13hplc8azwnp.R.rethrow($CLV_t2$);}finally{__CLR4_4_113hp13hplc8azwnp.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestGJChronology.testDurationFields",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),51277,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cnkzye13kd(){try{__CLR4_4_113hp13hplc8azwnp.R.inc(51277);
        __CLR4_4_113hp13hplc8azwnp.R.inc(51278);final GJChronology gj = GJChronology.getInstance();
        __CLR4_4_113hp13hplc8azwnp.R.inc(51279);assertEquals("eras", gj.eras().getName());
        __CLR4_4_113hp13hplc8azwnp.R.inc(51280);assertEquals("centuries", gj.centuries().getName());
        __CLR4_4_113hp13hplc8azwnp.R.inc(51281);assertEquals("years", gj.years().getName());
        __CLR4_4_113hp13hplc8azwnp.R.inc(51282);assertEquals("weekyears", gj.weekyears().getName());
        __CLR4_4_113hp13hplc8azwnp.R.inc(51283);assertEquals("months", gj.months().getName());
        __CLR4_4_113hp13hplc8azwnp.R.inc(51284);assertEquals("weeks", gj.weeks().getName());
        __CLR4_4_113hp13hplc8azwnp.R.inc(51285);assertEquals("halfdays", gj.halfdays().getName());
        __CLR4_4_113hp13hplc8azwnp.R.inc(51286);assertEquals("days", gj.days().getName());
        __CLR4_4_113hp13hplc8azwnp.R.inc(51287);assertEquals("hours", gj.hours().getName());
        __CLR4_4_113hp13hplc8azwnp.R.inc(51288);assertEquals("minutes", gj.minutes().getName());
        __CLR4_4_113hp13hplc8azwnp.R.inc(51289);assertEquals("seconds", gj.seconds().getName());
        __CLR4_4_113hp13hplc8azwnp.R.inc(51290);assertEquals("millis", gj.millis().getName());
        
        __CLR4_4_113hp13hplc8azwnp.R.inc(51291);assertEquals(false, gj.eras().isSupported());
        __CLR4_4_113hp13hplc8azwnp.R.inc(51292);assertEquals(true, gj.centuries().isSupported());
        __CLR4_4_113hp13hplc8azwnp.R.inc(51293);assertEquals(true, gj.years().isSupported());
        __CLR4_4_113hp13hplc8azwnp.R.inc(51294);assertEquals(true, gj.weekyears().isSupported());
        __CLR4_4_113hp13hplc8azwnp.R.inc(51295);assertEquals(true, gj.months().isSupported());
        __CLR4_4_113hp13hplc8azwnp.R.inc(51296);assertEquals(true, gj.weeks().isSupported());
        __CLR4_4_113hp13hplc8azwnp.R.inc(51297);assertEquals(true, gj.days().isSupported());
        __CLR4_4_113hp13hplc8azwnp.R.inc(51298);assertEquals(true, gj.halfdays().isSupported());
        __CLR4_4_113hp13hplc8azwnp.R.inc(51299);assertEquals(true, gj.hours().isSupported());
        __CLR4_4_113hp13hplc8azwnp.R.inc(51300);assertEquals(true, gj.minutes().isSupported());
        __CLR4_4_113hp13hplc8azwnp.R.inc(51301);assertEquals(true, gj.seconds().isSupported());
        __CLR4_4_113hp13hplc8azwnp.R.inc(51302);assertEquals(true, gj.millis().isSupported());
        
        __CLR4_4_113hp13hplc8azwnp.R.inc(51303);assertEquals(false, gj.centuries().isPrecise());
        __CLR4_4_113hp13hplc8azwnp.R.inc(51304);assertEquals(false, gj.years().isPrecise());
        __CLR4_4_113hp13hplc8azwnp.R.inc(51305);assertEquals(false, gj.weekyears().isPrecise());
        __CLR4_4_113hp13hplc8azwnp.R.inc(51306);assertEquals(false, gj.months().isPrecise());
        __CLR4_4_113hp13hplc8azwnp.R.inc(51307);assertEquals(false, gj.weeks().isPrecise());
        __CLR4_4_113hp13hplc8azwnp.R.inc(51308);assertEquals(false, gj.days().isPrecise());
        __CLR4_4_113hp13hplc8azwnp.R.inc(51309);assertEquals(false, gj.halfdays().isPrecise());
        __CLR4_4_113hp13hplc8azwnp.R.inc(51310);assertEquals(true, gj.hours().isPrecise());
        __CLR4_4_113hp13hplc8azwnp.R.inc(51311);assertEquals(true, gj.minutes().isPrecise());
        __CLR4_4_113hp13hplc8azwnp.R.inc(51312);assertEquals(true, gj.seconds().isPrecise());
        __CLR4_4_113hp13hplc8azwnp.R.inc(51313);assertEquals(true, gj.millis().isPrecise());
        
        __CLR4_4_113hp13hplc8azwnp.R.inc(51314);final GJChronology gjUTC = GJChronology.getInstanceUTC();
        __CLR4_4_113hp13hplc8azwnp.R.inc(51315);assertEquals(false, gjUTC.centuries().isPrecise());
        __CLR4_4_113hp13hplc8azwnp.R.inc(51316);assertEquals(false, gjUTC.years().isPrecise());
        __CLR4_4_113hp13hplc8azwnp.R.inc(51317);assertEquals(false, gjUTC.weekyears().isPrecise());
        __CLR4_4_113hp13hplc8azwnp.R.inc(51318);assertEquals(false, gjUTC.months().isPrecise());
        __CLR4_4_113hp13hplc8azwnp.R.inc(51319);assertEquals(true, gjUTC.weeks().isPrecise());
        __CLR4_4_113hp13hplc8azwnp.R.inc(51320);assertEquals(true, gjUTC.days().isPrecise());
        __CLR4_4_113hp13hplc8azwnp.R.inc(51321);assertEquals(true, gjUTC.halfdays().isPrecise());
        __CLR4_4_113hp13hplc8azwnp.R.inc(51322);assertEquals(true, gjUTC.hours().isPrecise());
        __CLR4_4_113hp13hplc8azwnp.R.inc(51323);assertEquals(true, gjUTC.minutes().isPrecise());
        __CLR4_4_113hp13hplc8azwnp.R.inc(51324);assertEquals(true, gjUTC.seconds().isPrecise());
        __CLR4_4_113hp13hplc8azwnp.R.inc(51325);assertEquals(true, gjUTC.millis().isPrecise());
        
        __CLR4_4_113hp13hplc8azwnp.R.inc(51326);final DateTimeZone gmt = DateTimeZone.forID("Etc/GMT");
        __CLR4_4_113hp13hplc8azwnp.R.inc(51327);final GJChronology gjGMT = GJChronology.getInstance(gmt);
        __CLR4_4_113hp13hplc8azwnp.R.inc(51328);assertEquals(false, gjGMT.centuries().isPrecise());
        __CLR4_4_113hp13hplc8azwnp.R.inc(51329);assertEquals(false, gjGMT.years().isPrecise());
        __CLR4_4_113hp13hplc8azwnp.R.inc(51330);assertEquals(false, gjGMT.weekyears().isPrecise());
        __CLR4_4_113hp13hplc8azwnp.R.inc(51331);assertEquals(false, gjGMT.months().isPrecise());
        __CLR4_4_113hp13hplc8azwnp.R.inc(51332);assertEquals(true, gjGMT.weeks().isPrecise());
        __CLR4_4_113hp13hplc8azwnp.R.inc(51333);assertEquals(true, gjGMT.days().isPrecise());
        __CLR4_4_113hp13hplc8azwnp.R.inc(51334);assertEquals(true, gjGMT.halfdays().isPrecise());
        __CLR4_4_113hp13hplc8azwnp.R.inc(51335);assertEquals(true, gjGMT.hours().isPrecise());
        __CLR4_4_113hp13hplc8azwnp.R.inc(51336);assertEquals(true, gjGMT.minutes().isPrecise());
        __CLR4_4_113hp13hplc8azwnp.R.inc(51337);assertEquals(true, gjGMT.seconds().isPrecise());
        __CLR4_4_113hp13hplc8azwnp.R.inc(51338);assertEquals(true, gjGMT.millis().isPrecise());
    }finally{__CLR4_4_113hp13hplc8azwnp.R.flushNeeded();}}

    public void testDateFields() {__CLR4_4_113hp13hplc8azwnp.R.globalSliceStart(getClass().getName(),51339);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gkspeo13m3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_113hp13hplc8azwnp.R.rethrow($CLV_t2$);}finally{__CLR4_4_113hp13hplc8azwnp.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestGJChronology.testDateFields",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),51339,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gkspeo13m3(){try{__CLR4_4_113hp13hplc8azwnp.R.inc(51339);
        __CLR4_4_113hp13hplc8azwnp.R.inc(51340);final GJChronology gj = GJChronology.getInstance();
        __CLR4_4_113hp13hplc8azwnp.R.inc(51341);assertEquals("era", gj.era().getName());
        __CLR4_4_113hp13hplc8azwnp.R.inc(51342);assertEquals("centuryOfEra", gj.centuryOfEra().getName());
        __CLR4_4_113hp13hplc8azwnp.R.inc(51343);assertEquals("yearOfCentury", gj.yearOfCentury().getName());
        __CLR4_4_113hp13hplc8azwnp.R.inc(51344);assertEquals("yearOfEra", gj.yearOfEra().getName());
        __CLR4_4_113hp13hplc8azwnp.R.inc(51345);assertEquals("year", gj.year().getName());
        __CLR4_4_113hp13hplc8azwnp.R.inc(51346);assertEquals("monthOfYear", gj.monthOfYear().getName());
        __CLR4_4_113hp13hplc8azwnp.R.inc(51347);assertEquals("weekyearOfCentury", gj.weekyearOfCentury().getName());
        __CLR4_4_113hp13hplc8azwnp.R.inc(51348);assertEquals("weekyear", gj.weekyear().getName());
        __CLR4_4_113hp13hplc8azwnp.R.inc(51349);assertEquals("weekOfWeekyear", gj.weekOfWeekyear().getName());
        __CLR4_4_113hp13hplc8azwnp.R.inc(51350);assertEquals("dayOfYear", gj.dayOfYear().getName());
        __CLR4_4_113hp13hplc8azwnp.R.inc(51351);assertEquals("dayOfMonth", gj.dayOfMonth().getName());
        __CLR4_4_113hp13hplc8azwnp.R.inc(51352);assertEquals("dayOfWeek", gj.dayOfWeek().getName());
        
        __CLR4_4_113hp13hplc8azwnp.R.inc(51353);assertEquals(true, gj.era().isSupported());
        __CLR4_4_113hp13hplc8azwnp.R.inc(51354);assertEquals(true, gj.centuryOfEra().isSupported());
        __CLR4_4_113hp13hplc8azwnp.R.inc(51355);assertEquals(true, gj.yearOfCentury().isSupported());
        __CLR4_4_113hp13hplc8azwnp.R.inc(51356);assertEquals(true, gj.yearOfEra().isSupported());
        __CLR4_4_113hp13hplc8azwnp.R.inc(51357);assertEquals(true, gj.year().isSupported());
        __CLR4_4_113hp13hplc8azwnp.R.inc(51358);assertEquals(true, gj.monthOfYear().isSupported());
        __CLR4_4_113hp13hplc8azwnp.R.inc(51359);assertEquals(true, gj.weekyearOfCentury().isSupported());
        __CLR4_4_113hp13hplc8azwnp.R.inc(51360);assertEquals(true, gj.weekyear().isSupported());
        __CLR4_4_113hp13hplc8azwnp.R.inc(51361);assertEquals(true, gj.weekOfWeekyear().isSupported());
        __CLR4_4_113hp13hplc8azwnp.R.inc(51362);assertEquals(true, gj.dayOfYear().isSupported());
        __CLR4_4_113hp13hplc8azwnp.R.inc(51363);assertEquals(true, gj.dayOfMonth().isSupported());
        __CLR4_4_113hp13hplc8azwnp.R.inc(51364);assertEquals(true, gj.dayOfWeek().isSupported());
        
        __CLR4_4_113hp13hplc8azwnp.R.inc(51365);assertEquals(gj.eras(), gj.era().getDurationField());
        __CLR4_4_113hp13hplc8azwnp.R.inc(51366);assertEquals(gj.centuries(), gj.centuryOfEra().getDurationField());
        __CLR4_4_113hp13hplc8azwnp.R.inc(51367);assertEquals(gj.years(), gj.yearOfCentury().getDurationField());
        __CLR4_4_113hp13hplc8azwnp.R.inc(51368);assertEquals(gj.years(), gj.yearOfEra().getDurationField());
        __CLR4_4_113hp13hplc8azwnp.R.inc(51369);assertEquals(gj.years(), gj.year().getDurationField());
        __CLR4_4_113hp13hplc8azwnp.R.inc(51370);assertEquals(gj.months(), gj.monthOfYear().getDurationField());
        __CLR4_4_113hp13hplc8azwnp.R.inc(51371);assertEquals(gj.weekyears(), gj.weekyearOfCentury().getDurationField());
        __CLR4_4_113hp13hplc8azwnp.R.inc(51372);assertEquals(gj.weekyears(), gj.weekyear().getDurationField());
        __CLR4_4_113hp13hplc8azwnp.R.inc(51373);assertEquals(gj.weeks(), gj.weekOfWeekyear().getDurationField());
        __CLR4_4_113hp13hplc8azwnp.R.inc(51374);assertEquals(gj.days(), gj.dayOfYear().getDurationField());
        __CLR4_4_113hp13hplc8azwnp.R.inc(51375);assertEquals(gj.days(), gj.dayOfMonth().getDurationField());
        __CLR4_4_113hp13hplc8azwnp.R.inc(51376);assertEquals(gj.days(), gj.dayOfWeek().getDurationField());
        
        __CLR4_4_113hp13hplc8azwnp.R.inc(51377);assertEquals(null, gj.era().getRangeDurationField());
        __CLR4_4_113hp13hplc8azwnp.R.inc(51378);assertEquals(gj.eras(), gj.centuryOfEra().getRangeDurationField());
        __CLR4_4_113hp13hplc8azwnp.R.inc(51379);assertEquals(gj.centuries(), gj.yearOfCentury().getRangeDurationField());
        __CLR4_4_113hp13hplc8azwnp.R.inc(51380);assertEquals(gj.eras(), gj.yearOfEra().getRangeDurationField());
        __CLR4_4_113hp13hplc8azwnp.R.inc(51381);assertEquals(null, gj.year().getRangeDurationField());
        __CLR4_4_113hp13hplc8azwnp.R.inc(51382);assertEquals(gj.years(), gj.monthOfYear().getRangeDurationField());
        __CLR4_4_113hp13hplc8azwnp.R.inc(51383);assertEquals(gj.centuries(), gj.weekyearOfCentury().getRangeDurationField());
        __CLR4_4_113hp13hplc8azwnp.R.inc(51384);assertEquals(null, gj.weekyear().getRangeDurationField());
        __CLR4_4_113hp13hplc8azwnp.R.inc(51385);assertEquals(gj.weekyears(), gj.weekOfWeekyear().getRangeDurationField());
        __CLR4_4_113hp13hplc8azwnp.R.inc(51386);assertEquals(gj.years(), gj.dayOfYear().getRangeDurationField());
        __CLR4_4_113hp13hplc8azwnp.R.inc(51387);assertEquals(gj.months(), gj.dayOfMonth().getRangeDurationField());
        __CLR4_4_113hp13hplc8azwnp.R.inc(51388);assertEquals(gj.weeks(), gj.dayOfWeek().getRangeDurationField());
    }finally{__CLR4_4_113hp13hplc8azwnp.R.flushNeeded();}}

    public void testTimeFields() {__CLR4_4_113hp13hplc8azwnp.R.globalSliceStart(getClass().getName(),51389);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11r11up13nh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_113hp13hplc8azwnp.R.rethrow($CLV_t2$);}finally{__CLR4_4_113hp13hplc8azwnp.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestGJChronology.testTimeFields",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),51389,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11r11up13nh(){try{__CLR4_4_113hp13hplc8azwnp.R.inc(51389);
        __CLR4_4_113hp13hplc8azwnp.R.inc(51390);final GJChronology gj = GJChronology.getInstance();
        __CLR4_4_113hp13hplc8azwnp.R.inc(51391);assertEquals("halfdayOfDay", gj.halfdayOfDay().getName());
        __CLR4_4_113hp13hplc8azwnp.R.inc(51392);assertEquals("clockhourOfHalfday", gj.clockhourOfHalfday().getName());
        __CLR4_4_113hp13hplc8azwnp.R.inc(51393);assertEquals("hourOfHalfday", gj.hourOfHalfday().getName());
        __CLR4_4_113hp13hplc8azwnp.R.inc(51394);assertEquals("clockhourOfDay", gj.clockhourOfDay().getName());
        __CLR4_4_113hp13hplc8azwnp.R.inc(51395);assertEquals("hourOfDay", gj.hourOfDay().getName());
        __CLR4_4_113hp13hplc8azwnp.R.inc(51396);assertEquals("minuteOfDay", gj.minuteOfDay().getName());
        __CLR4_4_113hp13hplc8azwnp.R.inc(51397);assertEquals("minuteOfHour", gj.minuteOfHour().getName());
        __CLR4_4_113hp13hplc8azwnp.R.inc(51398);assertEquals("secondOfDay", gj.secondOfDay().getName());
        __CLR4_4_113hp13hplc8azwnp.R.inc(51399);assertEquals("secondOfMinute", gj.secondOfMinute().getName());
        __CLR4_4_113hp13hplc8azwnp.R.inc(51400);assertEquals("millisOfDay", gj.millisOfDay().getName());
        __CLR4_4_113hp13hplc8azwnp.R.inc(51401);assertEquals("millisOfSecond", gj.millisOfSecond().getName());
        
        __CLR4_4_113hp13hplc8azwnp.R.inc(51402);assertEquals(true, gj.halfdayOfDay().isSupported());
        __CLR4_4_113hp13hplc8azwnp.R.inc(51403);assertEquals(true, gj.clockhourOfHalfday().isSupported());
        __CLR4_4_113hp13hplc8azwnp.R.inc(51404);assertEquals(true, gj.hourOfHalfday().isSupported());
        __CLR4_4_113hp13hplc8azwnp.R.inc(51405);assertEquals(true, gj.clockhourOfDay().isSupported());
        __CLR4_4_113hp13hplc8azwnp.R.inc(51406);assertEquals(true, gj.hourOfDay().isSupported());
        __CLR4_4_113hp13hplc8azwnp.R.inc(51407);assertEquals(true, gj.minuteOfDay().isSupported());
        __CLR4_4_113hp13hplc8azwnp.R.inc(51408);assertEquals(true, gj.minuteOfHour().isSupported());
        __CLR4_4_113hp13hplc8azwnp.R.inc(51409);assertEquals(true, gj.secondOfDay().isSupported());
        __CLR4_4_113hp13hplc8azwnp.R.inc(51410);assertEquals(true, gj.secondOfMinute().isSupported());
        __CLR4_4_113hp13hplc8azwnp.R.inc(51411);assertEquals(true, gj.millisOfDay().isSupported());
        __CLR4_4_113hp13hplc8azwnp.R.inc(51412);assertEquals(true, gj.millisOfSecond().isSupported());
    }finally{__CLR4_4_113hp13hplc8azwnp.R.flushNeeded();}}

    public void testIllegalDates() {__CLR4_4_113hp13hplc8azwnp.R.globalSliceStart(getClass().getName(),51413);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fftx8813o5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_113hp13hplc8azwnp.R.rethrow($CLV_t2$);}finally{__CLR4_4_113hp13hplc8azwnp.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestGJChronology.testIllegalDates",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),51413,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fftx8813o5(){try{__CLR4_4_113hp13hplc8azwnp.R.inc(51413);
        __CLR4_4_113hp13hplc8azwnp.R.inc(51414);try {
            __CLR4_4_113hp13hplc8azwnp.R.inc(51415);new DateTime(1582, 10, 5, 0, 0, 0, 0, GJChronology.getInstance(DateTimeZone.UTC));
            __CLR4_4_113hp13hplc8azwnp.R.inc(51416);fail("Constructed illegal date");
        } catch (IllegalArgumentException e) { /* good */ }

        __CLR4_4_113hp13hplc8azwnp.R.inc(51417);try {
            __CLR4_4_113hp13hplc8azwnp.R.inc(51418);new DateTime(1582, 10, 14, 0, 0, 0, 0, GJChronology.getInstance(DateTimeZone.UTC));
            __CLR4_4_113hp13hplc8azwnp.R.inc(51419);fail("Constructed illegal date");
        } catch (IllegalArgumentException e) { /* good */ }
    }finally{__CLR4_4_113hp13hplc8azwnp.R.flushNeeded();}}

    public void testParseEquivalence() {__CLR4_4_113hp13hplc8azwnp.R.globalSliceStart(getClass().getName(),51420);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1c5g6b213oc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_113hp13hplc8azwnp.R.rethrow($CLV_t2$);}finally{__CLR4_4_113hp13hplc8azwnp.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestGJChronology.testParseEquivalence",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),51420,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1c5g6b213oc(){try{__CLR4_4_113hp13hplc8azwnp.R.inc(51420);
        __CLR4_4_113hp13hplc8azwnp.R.inc(51421);testParse("1581-01-01T01:23:45.678", 1581, 1, 1, 1, 23, 45, 678);
        __CLR4_4_113hp13hplc8azwnp.R.inc(51422);testParse("1581-06-30", 1581, 6, 30, 0, 0, 0, 0);
        __CLR4_4_113hp13hplc8azwnp.R.inc(51423);testParse("1582-01-01T01:23:45.678", 1582, 1, 1, 1, 23, 45, 678);
        __CLR4_4_113hp13hplc8azwnp.R.inc(51424);testParse("1582-06-30T01:23:45.678", 1582, 6, 30, 1, 23, 45, 678);
        __CLR4_4_113hp13hplc8azwnp.R.inc(51425);testParse("1582-10-04", 1582, 10, 4, 0, 0, 0, 0);
        __CLR4_4_113hp13hplc8azwnp.R.inc(51426);testParse("1582-10-15", 1582, 10, 15, 0, 0, 0, 0);
        __CLR4_4_113hp13hplc8azwnp.R.inc(51427);testParse("1582-12-31", 1582, 12, 31, 0, 0, 0, 0);
        __CLR4_4_113hp13hplc8azwnp.R.inc(51428);testParse("1583-12-31", 1583, 12, 31, 0, 0, 0, 0);
    }finally{__CLR4_4_113hp13hplc8azwnp.R.flushNeeded();}}

    private void testParse(String str,
                           int year, int month, int day,
                           int hour, int minute, int second, int millis) {try{__CLR4_4_113hp13hplc8azwnp.R.inc(51429);
        __CLR4_4_113hp13hplc8azwnp.R.inc(51430);assertEquals(new DateTime(str, GJChronology.getInstance(DateTimeZone.UTC)),
                     new DateTime(year, month, day, hour, minute, second, millis,
                                  GJChronology.getInstance(DateTimeZone.UTC)));
    }finally{__CLR4_4_113hp13hplc8azwnp.R.flushNeeded();}}

    public void testCutoverAddYears() {__CLR4_4_113hp13hplc8azwnp.R.globalSliceStart(getClass().getName(),51431);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jhk7og13on();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_113hp13hplc8azwnp.R.rethrow($CLV_t2$);}finally{__CLR4_4_113hp13hplc8azwnp.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestGJChronology.testCutoverAddYears",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),51431,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jhk7og13on(){try{__CLR4_4_113hp13hplc8azwnp.R.inc(51431);
        __CLR4_4_113hp13hplc8azwnp.R.inc(51432);testAdd("1582-01-01", DurationFieldType.years(), 1, "1583-01-01");
        __CLR4_4_113hp13hplc8azwnp.R.inc(51433);testAdd("1582-02-15", DurationFieldType.years(), 1, "1583-02-15");
        __CLR4_4_113hp13hplc8azwnp.R.inc(51434);testAdd("1582-02-28", DurationFieldType.years(), 1, "1583-02-28");
        __CLR4_4_113hp13hplc8azwnp.R.inc(51435);testAdd("1582-03-01", DurationFieldType.years(), 1, "1583-03-01");
        __CLR4_4_113hp13hplc8azwnp.R.inc(51436);testAdd("1582-09-30", DurationFieldType.years(), 1, "1583-09-30");
        __CLR4_4_113hp13hplc8azwnp.R.inc(51437);testAdd("1582-10-01", DurationFieldType.years(), 1, "1583-10-01");
        __CLR4_4_113hp13hplc8azwnp.R.inc(51438);testAdd("1582-10-04", DurationFieldType.years(), 1, "1583-10-04");
        __CLR4_4_113hp13hplc8azwnp.R.inc(51439);testAdd("1582-10-15", DurationFieldType.years(), 1, "1583-10-15");
        __CLR4_4_113hp13hplc8azwnp.R.inc(51440);testAdd("1582-10-16", DurationFieldType.years(), 1, "1583-10-16");

        // Leap years...
        __CLR4_4_113hp13hplc8azwnp.R.inc(51441);testAdd("1580-01-01", DurationFieldType.years(), 4, "1584-01-01");
        __CLR4_4_113hp13hplc8azwnp.R.inc(51442);testAdd("1580-02-29", DurationFieldType.years(), 4, "1584-02-29");
        __CLR4_4_113hp13hplc8azwnp.R.inc(51443);testAdd("1580-10-01", DurationFieldType.years(), 4, "1584-10-01");
        __CLR4_4_113hp13hplc8azwnp.R.inc(51444);testAdd("1580-10-10", DurationFieldType.years(), 4, "1584-10-10");
        __CLR4_4_113hp13hplc8azwnp.R.inc(51445);testAdd("1580-10-15", DurationFieldType.years(), 4, "1584-10-15");
        __CLR4_4_113hp13hplc8azwnp.R.inc(51446);testAdd("1580-12-31", DurationFieldType.years(), 4, "1584-12-31");
    }finally{__CLR4_4_113hp13hplc8azwnp.R.flushNeeded();}}

    public void testCutoverAddWeekyears() {__CLR4_4_113hp13hplc8azwnp.R.globalSliceStart(getClass().getName(),51447);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ydlu3w13p3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_113hp13hplc8azwnp.R.rethrow($CLV_t2$);}finally{__CLR4_4_113hp13hplc8azwnp.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestGJChronology.testCutoverAddWeekyears",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),51447,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ydlu3w13p3(){try{__CLR4_4_113hp13hplc8azwnp.R.inc(51447);
        __CLR4_4_113hp13hplc8azwnp.R.inc(51448);testAdd("1582-W01-1", DurationFieldType.weekyears(), 1, "1583-W01-1");
        __CLR4_4_113hp13hplc8azwnp.R.inc(51449);testAdd("1582-W39-1", DurationFieldType.weekyears(), 1, "1583-W39-1");
        __CLR4_4_113hp13hplc8azwnp.R.inc(51450);testAdd("1583-W45-1", DurationFieldType.weekyears(), 1, "1584-W45-1");

        // This test fails, but I'm not sure if its worth fixing. The date
        // falls after the cutover, but in the cutover year. The add operation
        // is performed completely within the gregorian calendar, with no
        // crossing of the cutover. As a result, no special correction is
        // applied. Since the full gregorian year of 1582 has a different week
        // numbers than the full julian year of 1582, the week number is off by
        // one after the addition.
        //
        //testAdd("1582-W42-1", DurationFieldType.weekyears(), 1, "1583-W42-1");

        // Leap years...
        __CLR4_4_113hp13hplc8azwnp.R.inc(51451);testAdd("1580-W01-1", DurationFieldType.weekyears(), 4, "1584-W01-1");
        __CLR4_4_113hp13hplc8azwnp.R.inc(51452);testAdd("1580-W30-7", DurationFieldType.weekyears(), 4, "1584-W30-7");
        __CLR4_4_113hp13hplc8azwnp.R.inc(51453);testAdd("1580-W50-7", DurationFieldType.weekyears(), 4, "1584-W50-7");
    }finally{__CLR4_4_113hp13hplc8azwnp.R.flushNeeded();}}

    public void testCutoverAddMonths() {__CLR4_4_113hp13hplc8azwnp.R.globalSliceStart(getClass().getName(),51454);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ma9rpl13pa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_113hp13hplc8azwnp.R.rethrow($CLV_t2$);}finally{__CLR4_4_113hp13hplc8azwnp.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestGJChronology.testCutoverAddMonths",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),51454,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ma9rpl13pa(){try{__CLR4_4_113hp13hplc8azwnp.R.inc(51454);
        __CLR4_4_113hp13hplc8azwnp.R.inc(51455);testAdd("1582-01-01", DurationFieldType.months(), 1, "1582-02-01");
        __CLR4_4_113hp13hplc8azwnp.R.inc(51456);testAdd("1582-01-01", DurationFieldType.months(), 6, "1582-07-01");
        __CLR4_4_113hp13hplc8azwnp.R.inc(51457);testAdd("1582-01-01", DurationFieldType.months(), 12, "1583-01-01");
        __CLR4_4_113hp13hplc8azwnp.R.inc(51458);testAdd("1582-11-15", DurationFieldType.months(), 1, "1582-12-15");

        __CLR4_4_113hp13hplc8azwnp.R.inc(51459);testAdd("1582-09-04", DurationFieldType.months(), 2, "1582-11-04");
        __CLR4_4_113hp13hplc8azwnp.R.inc(51460);testAdd("1582-09-05", DurationFieldType.months(), 2, "1582-11-05");
        __CLR4_4_113hp13hplc8azwnp.R.inc(51461);testAdd("1582-09-10", DurationFieldType.months(), 2, "1582-11-10");
        __CLR4_4_113hp13hplc8azwnp.R.inc(51462);testAdd("1582-09-15", DurationFieldType.months(), 2, "1582-11-15");


        // Leap years...
        __CLR4_4_113hp13hplc8azwnp.R.inc(51463);testAdd("1580-01-01", DurationFieldType.months(), 48, "1584-01-01");
        __CLR4_4_113hp13hplc8azwnp.R.inc(51464);testAdd("1580-02-29", DurationFieldType.months(), 48, "1584-02-29");
        __CLR4_4_113hp13hplc8azwnp.R.inc(51465);testAdd("1580-10-01", DurationFieldType.months(), 48, "1584-10-01");
        __CLR4_4_113hp13hplc8azwnp.R.inc(51466);testAdd("1580-10-10", DurationFieldType.months(), 48, "1584-10-10");
        __CLR4_4_113hp13hplc8azwnp.R.inc(51467);testAdd("1580-10-15", DurationFieldType.months(), 48, "1584-10-15");
        __CLR4_4_113hp13hplc8azwnp.R.inc(51468);testAdd("1580-12-31", DurationFieldType.months(), 48, "1584-12-31");
    }finally{__CLR4_4_113hp13hplc8azwnp.R.flushNeeded();}}

    public void testCutoverAddWeeks() {__CLR4_4_113hp13hplc8azwnp.R.globalSliceStart(getClass().getName(),51469);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vch5wp13pp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_113hp13hplc8azwnp.R.rethrow($CLV_t2$);}finally{__CLR4_4_113hp13hplc8azwnp.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestGJChronology.testCutoverAddWeeks",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),51469,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vch5wp13pp(){try{__CLR4_4_113hp13hplc8azwnp.R.inc(51469);
        __CLR4_4_113hp13hplc8azwnp.R.inc(51470);testAdd("1582-01-01", DurationFieldType.weeks(), 1, "1582-01-08");
        __CLR4_4_113hp13hplc8azwnp.R.inc(51471);testAdd("1583-01-01", DurationFieldType.weeks(), 1, "1583-01-08");

        // Weeks are precise, and so cutover is not ignored.
        __CLR4_4_113hp13hplc8azwnp.R.inc(51472);testAdd("1582-10-01", DurationFieldType.weeks(), 2, "1582-10-25");
        __CLR4_4_113hp13hplc8azwnp.R.inc(51473);testAdd("1582-W01-1", DurationFieldType.weeks(), 51, "1583-W01-1");
    }finally{__CLR4_4_113hp13hplc8azwnp.R.flushNeeded();}}

    public void testCutoverAddDays() {__CLR4_4_113hp13hplc8azwnp.R.globalSliceStart(getClass().getName(),51474);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1r9ibtx13pu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_113hp13hplc8azwnp.R.rethrow($CLV_t2$);}finally{__CLR4_4_113hp13hplc8azwnp.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestGJChronology.testCutoverAddDays",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),51474,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1r9ibtx13pu(){try{__CLR4_4_113hp13hplc8azwnp.R.inc(51474);
        __CLR4_4_113hp13hplc8azwnp.R.inc(51475);testAdd("1582-10-03", DurationFieldType.days(), 1, "1582-10-04");
        __CLR4_4_113hp13hplc8azwnp.R.inc(51476);testAdd("1582-10-04", DurationFieldType.days(), 1, "1582-10-15");
        __CLR4_4_113hp13hplc8azwnp.R.inc(51477);testAdd("1582-10-15", DurationFieldType.days(), 1, "1582-10-16");

        __CLR4_4_113hp13hplc8azwnp.R.inc(51478);testAdd("1582-09-30", DurationFieldType.days(), 10, "1582-10-20");
        __CLR4_4_113hp13hplc8azwnp.R.inc(51479);testAdd("1582-10-04", DurationFieldType.days(), 10, "1582-10-24");
        __CLR4_4_113hp13hplc8azwnp.R.inc(51480);testAdd("1582-10-15", DurationFieldType.days(), 10, "1582-10-25");
    }finally{__CLR4_4_113hp13hplc8azwnp.R.flushNeeded();}}

    public void testYearEndAddDays() {__CLR4_4_113hp13hplc8azwnp.R.globalSliceStart(getClass().getName(),51481);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1iulrxp13q1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_113hp13hplc8azwnp.R.rethrow($CLV_t2$);}finally{__CLR4_4_113hp13hplc8azwnp.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestGJChronology.testYearEndAddDays",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),51481,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1iulrxp13q1(){try{__CLR4_4_113hp13hplc8azwnp.R.inc(51481);
        __CLR4_4_113hp13hplc8azwnp.R.inc(51482);testAdd("1582-11-05", DurationFieldType.days(), 28, "1582-12-03");
        __CLR4_4_113hp13hplc8azwnp.R.inc(51483);testAdd("1582-12-05", DurationFieldType.days(), 28, "1583-01-02");
        
        __CLR4_4_113hp13hplc8azwnp.R.inc(51484);testAdd("2005-11-05", DurationFieldType.days(), 28, "2005-12-03");
        __CLR4_4_113hp13hplc8azwnp.R.inc(51485);testAdd("2005-12-05", DurationFieldType.days(), 28, "2006-01-02");
    }finally{__CLR4_4_113hp13hplc8azwnp.R.flushNeeded();}}

    public void testSubtractDays() {__CLR4_4_113hp13hplc8azwnp.R.globalSliceStart(getClass().getName(),51486);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12k0un013q6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_113hp13hplc8azwnp.R.rethrow($CLV_t2$);}finally{__CLR4_4_113hp13hplc8azwnp.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestGJChronology.testSubtractDays",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),51486,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12k0un013q6(){try{__CLR4_4_113hp13hplc8azwnp.R.inc(51486);
        // This is a test for a bug in version 1.0. The dayOfMonth range
        // duration field did not match the monthOfYear duration field. This
        // caused an exception to be thrown when subtracting days.
        __CLR4_4_113hp13hplc8azwnp.R.inc(51487);DateTime dt = new DateTime
            (1112306400000L, GJChronology.getInstance(DateTimeZone.forID("Europe/Berlin")));
        __CLR4_4_113hp13hplc8azwnp.R.inc(51488);YearMonthDay ymd = dt.toYearMonthDay();
        __CLR4_4_113hp13hplc8azwnp.R.inc(51489);while ((((ymd.toDateTimeAtMidnight().getDayOfWeek() != DateTimeConstants.MONDAY)&&(__CLR4_4_113hp13hplc8azwnp.R.iget(51490)!=0|true))||(__CLR4_4_113hp13hplc8azwnp.R.iget(51491)==0&false))) {{ 
            __CLR4_4_113hp13hplc8azwnp.R.inc(51492);ymd = ymd.minus(Period.days(1));
        }
    }}finally{__CLR4_4_113hp13hplc8azwnp.R.flushNeeded();}}

    private void testAdd(String start, DurationFieldType type, int amt, String end) {try{__CLR4_4_113hp13hplc8azwnp.R.inc(51493);
        __CLR4_4_113hp13hplc8azwnp.R.inc(51494);DateTime dtStart = new DateTime(start, GJChronology.getInstance(DateTimeZone.UTC));
        __CLR4_4_113hp13hplc8azwnp.R.inc(51495);DateTime dtEnd = new DateTime(end, GJChronology.getInstance(DateTimeZone.UTC));
        __CLR4_4_113hp13hplc8azwnp.R.inc(51496);assertEquals(dtEnd, dtStart.withFieldAdded(type, amt));
        __CLR4_4_113hp13hplc8azwnp.R.inc(51497);assertEquals(dtStart, dtEnd.withFieldAdded(type, -amt));

        __CLR4_4_113hp13hplc8azwnp.R.inc(51498);DurationField field = type.getField(GJChronology.getInstance(DateTimeZone.UTC));
        __CLR4_4_113hp13hplc8azwnp.R.inc(51499);int diff = field.getDifference(dtEnd.getMillis(), dtStart.getMillis());
        __CLR4_4_113hp13hplc8azwnp.R.inc(51500);assertEquals(amt, diff);
        
        __CLR4_4_113hp13hplc8azwnp.R.inc(51501);if ((((type == DurationFieldType.years() ||
            type == DurationFieldType.months() ||
            type == DurationFieldType.days())&&(__CLR4_4_113hp13hplc8azwnp.R.iget(51502)!=0|true))||(__CLR4_4_113hp13hplc8azwnp.R.iget(51503)==0&false))) {{
            __CLR4_4_113hp13hplc8azwnp.R.inc(51504);YearMonthDay ymdStart = new YearMonthDay(start, GJChronology.getInstance(DateTimeZone.UTC));
            __CLR4_4_113hp13hplc8azwnp.R.inc(51505);YearMonthDay ymdEnd = new YearMonthDay(end, GJChronology.getInstance(DateTimeZone.UTC));
            __CLR4_4_113hp13hplc8azwnp.R.inc(51506);assertEquals(ymdEnd, ymdStart.withFieldAdded(type, amt));
            __CLR4_4_113hp13hplc8azwnp.R.inc(51507);assertEquals(ymdStart, ymdEnd.withFieldAdded(type, -amt));
        }
    }}finally{__CLR4_4_113hp13hplc8azwnp.R.flushNeeded();}}

    public void testTimeOfDayAdd() {__CLR4_4_113hp13hplc8azwnp.R.globalSliceStart(getClass().getName(),51508);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1c1zvq613qs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_113hp13hplc8azwnp.R.rethrow($CLV_t2$);}finally{__CLR4_4_113hp13hplc8azwnp.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestGJChronology.testTimeOfDayAdd",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),51508,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1c1zvq613qs(){try{__CLR4_4_113hp13hplc8azwnp.R.inc(51508);
        __CLR4_4_113hp13hplc8azwnp.R.inc(51509);TimeOfDay start = new TimeOfDay(12, 30, GJChronology.getInstance());
        __CLR4_4_113hp13hplc8azwnp.R.inc(51510);TimeOfDay end = new TimeOfDay(10, 30, GJChronology.getInstance());
        __CLR4_4_113hp13hplc8azwnp.R.inc(51511);assertEquals(end, start.plusHours(22));
        __CLR4_4_113hp13hplc8azwnp.R.inc(51512);assertEquals(start, end.minusHours(22));
        __CLR4_4_113hp13hplc8azwnp.R.inc(51513);assertEquals(end, start.plusMinutes(22 * 60));
        __CLR4_4_113hp13hplc8azwnp.R.inc(51514);assertEquals(start, end.minusMinutes(22 * 60));
    }finally{__CLR4_4_113hp13hplc8azwnp.R.flushNeeded();}}

    public void testMaximumValue() {__CLR4_4_113hp13hplc8azwnp.R.globalSliceStart(getClass().getName(),51515);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qnw3be13qz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_113hp13hplc8azwnp.R.rethrow($CLV_t2$);}finally{__CLR4_4_113hp13hplc8azwnp.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestGJChronology.testMaximumValue",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),51515,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qnw3be13qz(){try{__CLR4_4_113hp13hplc8azwnp.R.inc(51515);
        __CLR4_4_113hp13hplc8azwnp.R.inc(51516);DateMidnight dt = new DateMidnight(1570, 1, 1, GJChronology.getInstance());
        __CLR4_4_113hp13hplc8azwnp.R.inc(51517);while ((((dt.getYear() < 1590)&&(__CLR4_4_113hp13hplc8azwnp.R.iget(51518)!=0|true))||(__CLR4_4_113hp13hplc8azwnp.R.iget(51519)==0&false))) {{
            __CLR4_4_113hp13hplc8azwnp.R.inc(51520);dt = dt.plusDays(1);
            __CLR4_4_113hp13hplc8azwnp.R.inc(51521);YearMonthDay ymd = dt.toYearMonthDay();
            __CLR4_4_113hp13hplc8azwnp.R.inc(51522);assertEquals(dt.year().getMaximumValue(), ymd.year().getMaximumValue());
            __CLR4_4_113hp13hplc8azwnp.R.inc(51523);assertEquals(dt.monthOfYear().getMaximumValue(), ymd.monthOfYear().getMaximumValue());
            __CLR4_4_113hp13hplc8azwnp.R.inc(51524);assertEquals(dt.dayOfMonth().getMaximumValue(), ymd.dayOfMonth().getMaximumValue());
        }
    }}finally{__CLR4_4_113hp13hplc8azwnp.R.flushNeeded();}}

    public void testPartialGetAsText() {__CLR4_4_113hp13hplc8azwnp.R.globalSliceStart(getClass().getName(),51525);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gbm38313r9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_113hp13hplc8azwnp.R.rethrow($CLV_t2$);}finally{__CLR4_4_113hp13hplc8azwnp.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestGJChronology.testPartialGetAsText",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),51525,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gbm38313r9(){try{__CLR4_4_113hp13hplc8azwnp.R.inc(51525);
        __CLR4_4_113hp13hplc8azwnp.R.inc(51526);GJChronology chrono = GJChronology.getInstance(TOKYO);
        __CLR4_4_113hp13hplc8azwnp.R.inc(51527);assertEquals("January", new YearMonthDay("2005-01-01", chrono).monthOfYear().getAsText());
        __CLR4_4_113hp13hplc8azwnp.R.inc(51528);assertEquals("Jan", new YearMonthDay("2005-01-01", chrono).monthOfYear().getAsShortText());
    }finally{__CLR4_4_113hp13hplc8azwnp.R.flushNeeded();}}

    public void testLeapYearRulesConstruction() {__CLR4_4_113hp13hplc8azwnp.R.globalSliceStart(getClass().getName(),51529);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14eiwuw13rd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_113hp13hplc8azwnp.R.rethrow($CLV_t2$);}finally{__CLR4_4_113hp13hplc8azwnp.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestGJChronology.testLeapYearRulesConstruction",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),51529,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14eiwuw13rd(){try{__CLR4_4_113hp13hplc8azwnp.R.inc(51529);
        // 1500 not leap in Gregorian, but is leap in Julian
        __CLR4_4_113hp13hplc8azwnp.R.inc(51530);DateMidnight dt = new DateMidnight(1500, 2, 29, GJChronology.getInstanceUTC());
        __CLR4_4_113hp13hplc8azwnp.R.inc(51531);assertEquals(dt.getYear(), 1500);
        __CLR4_4_113hp13hplc8azwnp.R.inc(51532);assertEquals(dt.getMonthOfYear(), 2);
        __CLR4_4_113hp13hplc8azwnp.R.inc(51533);assertEquals(dt.getDayOfMonth(), 29);
    }finally{__CLR4_4_113hp13hplc8azwnp.R.flushNeeded();}}

    public void testLeapYearRulesConstructionInvalid() {__CLR4_4_113hp13hplc8azwnp.R.globalSliceStart(getClass().getName(),51534);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13yvlo313ri();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_113hp13hplc8azwnp.R.rethrow($CLV_t2$);}finally{__CLR4_4_113hp13hplc8azwnp.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestGJChronology.testLeapYearRulesConstructionInvalid",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),51534,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13yvlo313ri(){try{__CLR4_4_113hp13hplc8azwnp.R.inc(51534);
        // 1500 not leap in Gregorian, but is leap in Julian
        __CLR4_4_113hp13hplc8azwnp.R.inc(51535);try {
            __CLR4_4_113hp13hplc8azwnp.R.inc(51536);new DateMidnight(1500, 2, 30, GJChronology.getInstanceUTC());
            __CLR4_4_113hp13hplc8azwnp.R.inc(51537);fail();
        } catch (IllegalFieldValueException ex) {
            // good
        }
    }finally{__CLR4_4_113hp13hplc8azwnp.R.flushNeeded();}}

}
