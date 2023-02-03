/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 *  Copyright 2001-2005 Stephen Colebourne
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
import java.util.TimeZone;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.base.AbstractInterval;
import org.joda.time.chrono.ISOChronology;

/**
 * This class is a Junit unit test for Instant.
 *
 * @author Stephen Colebourne
 */
public class TestMutableInterval_Updates extends TestCase {static class __CLR4_4_1v0bv0blc8azvxn{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672271031490L,8589935092L,40399,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    // Test in 2002/03 as time zones are more well known
    // (before the late 90's they were all over the place)

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
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
            
    // 2002-04-05
    private long TEST_TIME1 =
            (y2002days + 31L + 28L + 31L + 5L -1L) * DateTimeConstants.MILLIS_PER_DAY
            + 12L * DateTimeConstants.MILLIS_PER_HOUR
            + 24L * DateTimeConstants.MILLIS_PER_MINUTE;
        
    // 2003-05-06
    private long TEST_TIME2 =
            (y2003days + 31L + 28L + 31L + 30L + 6L -1L) * DateTimeConstants.MILLIS_PER_DAY
            + 14L * DateTimeConstants.MILLIS_PER_HOUR
            + 28L * DateTimeConstants.MILLIS_PER_MINUTE;
        
    private DateTimeZone originalDateTimeZone = null;
    private TimeZone originalTimeZone = null;
    private Locale originalLocale = null;

    public static void main(String[] args) {try{__CLR4_4_1v0bv0blc8azvxn.R.inc(40187);
        __CLR4_4_1v0bv0blc8azvxn.R.inc(40188);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1v0bv0blc8azvxn.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1v0bv0blc8azvxn.R.inc(40189);
        __CLR4_4_1v0bv0blc8azvxn.R.inc(40190);return new TestSuite(TestMutableInterval_Updates.class);
    }finally{__CLR4_4_1v0bv0blc8azvxn.R.flushNeeded();}}

    public TestMutableInterval_Updates(String name) {
        super(name);__CLR4_4_1v0bv0blc8azvxn.R.inc(40192);try{__CLR4_4_1v0bv0blc8azvxn.R.inc(40191);
    }finally{__CLR4_4_1v0bv0blc8azvxn.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1v0bv0blc8azvxn.R.inc(40193);
        __CLR4_4_1v0bv0blc8azvxn.R.inc(40194);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1v0bv0blc8azvxn.R.inc(40195);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1v0bv0blc8azvxn.R.inc(40196);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1v0bv0blc8azvxn.R.inc(40197);originalLocale = Locale.getDefault();
        __CLR4_4_1v0bv0blc8azvxn.R.inc(40198);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1v0bv0blc8azvxn.R.inc(40199);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1v0bv0blc8azvxn.R.inc(40200);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1v0bv0blc8azvxn.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1v0bv0blc8azvxn.R.inc(40201);
        __CLR4_4_1v0bv0blc8azvxn.R.inc(40202);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1v0bv0blc8azvxn.R.inc(40203);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1v0bv0blc8azvxn.R.inc(40204);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1v0bv0blc8azvxn.R.inc(40205);Locale.setDefault(originalLocale);
        __CLR4_4_1v0bv0blc8azvxn.R.inc(40206);originalDateTimeZone = null;
        __CLR4_4_1v0bv0blc8azvxn.R.inc(40207);originalTimeZone = null;
        __CLR4_4_1v0bv0blc8azvxn.R.inc(40208);originalLocale = null;
    }finally{__CLR4_4_1v0bv0blc8azvxn.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testTest() {__CLR4_4_1v0bv0blc8azvxn.R.globalSliceStart(getClass().getName(),40209);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1447pqjv0x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1v0bv0blc8azvxn.R.rethrow($CLV_t2$);}finally{__CLR4_4_1v0bv0blc8azvxn.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Updates.testTest",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40209,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1447pqjv0x(){try{__CLR4_4_1v0bv0blc8azvxn.R.inc(40209);
        __CLR4_4_1v0bv0blc8azvxn.R.inc(40210);assertEquals("2002-06-09T00:00:00.000Z", new Instant(TEST_TIME_NOW).toString());
        __CLR4_4_1v0bv0blc8azvxn.R.inc(40211);assertEquals("2002-04-05T12:24:00.000Z", new Instant(TEST_TIME1).toString());
        __CLR4_4_1v0bv0blc8azvxn.R.inc(40212);assertEquals("2003-05-06T14:28:00.000Z", new Instant(TEST_TIME2).toString());
    }finally{__CLR4_4_1v0bv0blc8azvxn.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testSetInterval_long_long1() {__CLR4_4_1v0bv0blc8azvxn.R.globalSliceStart(getClass().getName(),40213);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15np4tfv11();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1v0bv0blc8azvxn.R.rethrow($CLV_t2$);}finally{__CLR4_4_1v0bv0blc8azvxn.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Updates.testSetInterval_long_long1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40213,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15np4tfv11(){try{__CLR4_4_1v0bv0blc8azvxn.R.inc(40213);
        __CLR4_4_1v0bv0blc8azvxn.R.inc(40214);MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2);
        __CLR4_4_1v0bv0blc8azvxn.R.inc(40215);test.setInterval(TEST_TIME1 - 1, TEST_TIME2 + 1);
        __CLR4_4_1v0bv0blc8azvxn.R.inc(40216);assertEquals(TEST_TIME1 - 1, test.getStartMillis());
        __CLR4_4_1v0bv0blc8azvxn.R.inc(40217);assertEquals(TEST_TIME2 + 1, test.getEndMillis());
    }finally{__CLR4_4_1v0bv0blc8azvxn.R.flushNeeded();}}

    public void testSetInterval_long_long2() {__CLR4_4_1v0bv0blc8azvxn.R.globalSliceStart(getClass().getName(),40218);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18wp3lwv16();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1v0bv0blc8azvxn.R.rethrow($CLV_t2$);}finally{__CLR4_4_1v0bv0blc8azvxn.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Updates.testSetInterval_long_long2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40218,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18wp3lwv16(){try{__CLR4_4_1v0bv0blc8azvxn.R.inc(40218);
        __CLR4_4_1v0bv0blc8azvxn.R.inc(40219);MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2);
        __CLR4_4_1v0bv0blc8azvxn.R.inc(40220);try {
            __CLR4_4_1v0bv0blc8azvxn.R.inc(40221);test.setInterval(TEST_TIME1 - 1, TEST_TIME1 - 2);
            __CLR4_4_1v0bv0blc8azvxn.R.inc(40222);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1v0bv0blc8azvxn.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testSetInterval_RI_RI1() {__CLR4_4_1v0bv0blc8azvxn.R.globalSliceStart(getClass().getName(),40223);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1om0b0jv1b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1v0bv0blc8azvxn.R.rethrow($CLV_t2$);}finally{__CLR4_4_1v0bv0blc8azvxn.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Updates.testSetInterval_RI_RI1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40223,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1om0b0jv1b(){try{__CLR4_4_1v0bv0blc8azvxn.R.inc(40223);
        __CLR4_4_1v0bv0blc8azvxn.R.inc(40224);MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2);
        __CLR4_4_1v0bv0blc8azvxn.R.inc(40225);test.setInterval(new Instant(TEST_TIME1 - 1), new Instant(TEST_TIME2 + 1));
        __CLR4_4_1v0bv0blc8azvxn.R.inc(40226);assertEquals(TEST_TIME1 - 1, test.getStartMillis());
        __CLR4_4_1v0bv0blc8azvxn.R.inc(40227);assertEquals(TEST_TIME2 + 1, test.getEndMillis());
    }finally{__CLR4_4_1v0bv0blc8azvxn.R.flushNeeded();}}

    public void testSetInterval_RI_RI2() {__CLR4_4_1v0bv0blc8azvxn.R.globalSliceStart(getClass().getName(),40228);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rv09t0v1g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1v0bv0blc8azvxn.R.rethrow($CLV_t2$);}finally{__CLR4_4_1v0bv0blc8azvxn.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Updates.testSetInterval_RI_RI2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40228,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rv09t0v1g(){try{__CLR4_4_1v0bv0blc8azvxn.R.inc(40228);
        __CLR4_4_1v0bv0blc8azvxn.R.inc(40229);MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2);
        __CLR4_4_1v0bv0blc8azvxn.R.inc(40230);try {
            __CLR4_4_1v0bv0blc8azvxn.R.inc(40231);test.setInterval(new Instant(TEST_TIME1 - 1), new Instant(TEST_TIME1 - 2));
            __CLR4_4_1v0bv0blc8azvxn.R.inc(40232);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1v0bv0blc8azvxn.R.flushNeeded();}}

    public void testSetInterval_RI_RI3() {__CLR4_4_1v0bv0blc8azvxn.R.globalSliceStart(getClass().getName(),40233);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1v408lhv1l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1v0bv0blc8azvxn.R.rethrow($CLV_t2$);}finally{__CLR4_4_1v0bv0blc8azvxn.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Updates.testSetInterval_RI_RI3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40233,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1v408lhv1l(){try{__CLR4_4_1v0bv0blc8azvxn.R.inc(40233);
        __CLR4_4_1v0bv0blc8azvxn.R.inc(40234);MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2);
        __CLR4_4_1v0bv0blc8azvxn.R.inc(40235);test.setInterval(null, new Instant(TEST_TIME2 + 1));
        __CLR4_4_1v0bv0blc8azvxn.R.inc(40236);assertEquals(TEST_TIME_NOW, test.getStartMillis());
        __CLR4_4_1v0bv0blc8azvxn.R.inc(40237);assertEquals(TEST_TIME2 + 1, test.getEndMillis());
    }finally{__CLR4_4_1v0bv0blc8azvxn.R.flushNeeded();}}

    public void testSetInterval_RI_RI4() {__CLR4_4_1v0bv0blc8azvxn.R.globalSliceStart(getClass().getName(),40238);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yd07dyv1q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1v0bv0blc8azvxn.R.rethrow($CLV_t2$);}finally{__CLR4_4_1v0bv0blc8azvxn.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Updates.testSetInterval_RI_RI4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40238,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yd07dyv1q(){try{__CLR4_4_1v0bv0blc8azvxn.R.inc(40238);
        __CLR4_4_1v0bv0blc8azvxn.R.inc(40239);MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2);
        __CLR4_4_1v0bv0blc8azvxn.R.inc(40240);test.setInterval(new Instant(TEST_TIME1 - 1), null);
        __CLR4_4_1v0bv0blc8azvxn.R.inc(40241);assertEquals(TEST_TIME1 - 1, test.getStartMillis());
        __CLR4_4_1v0bv0blc8azvxn.R.inc(40242);assertEquals(TEST_TIME_NOW, test.getEndMillis());
    }finally{__CLR4_4_1v0bv0blc8azvxn.R.flushNeeded();}}

    public void testSetInterval_RI_RI5() {__CLR4_4_1v0bv0blc8azvxn.R.globalSliceStart(getClass().getName(),40243);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xf3vspv1v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1v0bv0blc8azvxn.R.rethrow($CLV_t2$);}finally{__CLR4_4_1v0bv0blc8azvxn.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Updates.testSetInterval_RI_RI5",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40243,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xf3vspv1v(){try{__CLR4_4_1v0bv0blc8azvxn.R.inc(40243);
        __CLR4_4_1v0bv0blc8azvxn.R.inc(40244);MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2);
        __CLR4_4_1v0bv0blc8azvxn.R.inc(40245);test.setInterval(null, null);
        __CLR4_4_1v0bv0blc8azvxn.R.inc(40246);assertEquals(TEST_TIME_NOW, test.getStartMillis());
        __CLR4_4_1v0bv0blc8azvxn.R.inc(40247);assertEquals(TEST_TIME_NOW, test.getEndMillis());
    }finally{__CLR4_4_1v0bv0blc8azvxn.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testSetInterval_RInterval1() {__CLR4_4_1v0bv0blc8azvxn.R.globalSliceStart(getClass().getName(),40248);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hx0x57v20();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1v0bv0blc8azvxn.R.rethrow($CLV_t2$);}finally{__CLR4_4_1v0bv0blc8azvxn.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Updates.testSetInterval_RInterval1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40248,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hx0x57v20(){try{__CLR4_4_1v0bv0blc8azvxn.R.inc(40248);
        __CLR4_4_1v0bv0blc8azvxn.R.inc(40249);MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2);
        __CLR4_4_1v0bv0blc8azvxn.R.inc(40250);test.setInterval(new Interval(TEST_TIME1 - 1, TEST_TIME2 + 1));
        __CLR4_4_1v0bv0blc8azvxn.R.inc(40251);assertEquals(TEST_TIME1 - 1, test.getStartMillis());
        __CLR4_4_1v0bv0blc8azvxn.R.inc(40252);assertEquals(TEST_TIME2 + 1, test.getEndMillis());
    }finally{__CLR4_4_1v0bv0blc8azvxn.R.flushNeeded();}}

    public void testSetInterval_RInterval2() {__CLR4_4_1v0bv0blc8azvxn.R.globalSliceStart(getClass().getName(),40253);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1l60vxov25();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1v0bv0blc8azvxn.R.rethrow($CLV_t2$);}finally{__CLR4_4_1v0bv0blc8azvxn.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Updates.testSetInterval_RInterval2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40253,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1l60vxov25(){try{__CLR4_4_1v0bv0blc8azvxn.R.inc(40253);
        __CLR4_4_1v0bv0blc8azvxn.R.inc(40254);MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2);
        __CLR4_4_1v0bv0blc8azvxn.R.inc(40255);try {
            __CLR4_4_1v0bv0blc8azvxn.R.inc(40256);test.setInterval(new MockBadInterval());
            __CLR4_4_1v0bv0blc8azvxn.R.inc(40257);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1v0bv0blc8azvxn.R.flushNeeded();}}
    
    class MockBadInterval extends AbstractInterval {
        public Chronology getChronology() {try{__CLR4_4_1v0bv0blc8azvxn.R.inc(40258);
            __CLR4_4_1v0bv0blc8azvxn.R.inc(40259);return ISOChronology.getInstance();
        }finally{__CLR4_4_1v0bv0blc8azvxn.R.flushNeeded();}}
        public long getStartMillis() {try{__CLR4_4_1v0bv0blc8azvxn.R.inc(40260);
            __CLR4_4_1v0bv0blc8azvxn.R.inc(40261);return TEST_TIME1 - 1;
        }finally{__CLR4_4_1v0bv0blc8azvxn.R.flushNeeded();}}
        public long getEndMillis() {try{__CLR4_4_1v0bv0blc8azvxn.R.inc(40262);
            __CLR4_4_1v0bv0blc8azvxn.R.inc(40263);return TEST_TIME1 - 2;
        }finally{__CLR4_4_1v0bv0blc8azvxn.R.flushNeeded();}}
    }

    public void testSetInterval_RInterval3() {__CLR4_4_1v0bv0blc8azvxn.R.globalSliceStart(getClass().getName(),40264);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1of0uq5v2g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1v0bv0blc8azvxn.R.rethrow($CLV_t2$);}finally{__CLR4_4_1v0bv0blc8azvxn.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Updates.testSetInterval_RInterval3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40264,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1of0uq5v2g(){try{__CLR4_4_1v0bv0blc8azvxn.R.inc(40264);
        __CLR4_4_1v0bv0blc8azvxn.R.inc(40265);MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2);
        __CLR4_4_1v0bv0blc8azvxn.R.inc(40266);try {
            __CLR4_4_1v0bv0blc8azvxn.R.inc(40267);test.setInterval(null);
            __CLR4_4_1v0bv0blc8azvxn.R.inc(40268);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1v0bv0blc8azvxn.R.flushNeeded();}}
    
    //-----------------------------------------------------------------------
    public void testSetStartMillis_long1() {__CLR4_4_1v0bv0blc8azvxn.R.globalSliceStart(getClass().getName(),40269);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wqei5xv2l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1v0bv0blc8azvxn.R.rethrow($CLV_t2$);}finally{__CLR4_4_1v0bv0blc8azvxn.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Updates.testSetStartMillis_long1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40269,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wqei5xv2l(){try{__CLR4_4_1v0bv0blc8azvxn.R.inc(40269);
        __CLR4_4_1v0bv0blc8azvxn.R.inc(40270);MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2);
        __CLR4_4_1v0bv0blc8azvxn.R.inc(40271);test.setStartMillis(TEST_TIME1 - 1);
        __CLR4_4_1v0bv0blc8azvxn.R.inc(40272);assertEquals(TEST_TIME1 - 1, test.getStartMillis());
        __CLR4_4_1v0bv0blc8azvxn.R.inc(40273);assertEquals(TEST_TIME2, test.getEndMillis());
    }finally{__CLR4_4_1v0bv0blc8azvxn.R.flushNeeded();}}

    public void testSetStartMillis_long2() {__CLR4_4_1v0bv0blc8azvxn.R.globalSliceStart(getClass().getName(),40274);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1z1pl0qv2q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1v0bv0blc8azvxn.R.rethrow($CLV_t2$);}finally{__CLR4_4_1v0bv0blc8azvxn.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Updates.testSetStartMillis_long2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40274,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1z1pl0qv2q(){try{__CLR4_4_1v0bv0blc8azvxn.R.inc(40274);
        __CLR4_4_1v0bv0blc8azvxn.R.inc(40275);MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2);
        __CLR4_4_1v0bv0blc8azvxn.R.inc(40276);try {
            __CLR4_4_1v0bv0blc8azvxn.R.inc(40277);test.setStartMillis(TEST_TIME2 + 1);
            __CLR4_4_1v0bv0blc8azvxn.R.inc(40278);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1v0bv0blc8azvxn.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testSetStart_RI1() {__CLR4_4_1v0bv0blc8azvxn.R.globalSliceStart(getClass().getName(),40279);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1r7ekbwv2v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1v0bv0blc8azvxn.R.rethrow($CLV_t2$);}finally{__CLR4_4_1v0bv0blc8azvxn.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Updates.testSetStart_RI1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40279,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1r7ekbwv2v(){try{__CLR4_4_1v0bv0blc8azvxn.R.inc(40279);
        __CLR4_4_1v0bv0blc8azvxn.R.inc(40280);MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2);
        __CLR4_4_1v0bv0blc8azvxn.R.inc(40281);test.setStart(new Instant(TEST_TIME1 - 1));
        __CLR4_4_1v0bv0blc8azvxn.R.inc(40282);assertEquals(TEST_TIME1 - 1, test.getStartMillis());
        __CLR4_4_1v0bv0blc8azvxn.R.inc(40283);assertEquals(TEST_TIME2, test.getEndMillis());
    }finally{__CLR4_4_1v0bv0blc8azvxn.R.flushNeeded();}}

    public void testSetStart_RI2() {__CLR4_4_1v0bv0blc8azvxn.R.globalSliceStart(getClass().getName(),40284);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nyeljfv30();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1v0bv0blc8azvxn.R.rethrow($CLV_t2$);}finally{__CLR4_4_1v0bv0blc8azvxn.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Updates.testSetStart_RI2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40284,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nyeljfv30(){try{__CLR4_4_1v0bv0blc8azvxn.R.inc(40284);
        __CLR4_4_1v0bv0blc8azvxn.R.inc(40285);MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2);
        __CLR4_4_1v0bv0blc8azvxn.R.inc(40286);try {
            __CLR4_4_1v0bv0blc8azvxn.R.inc(40287);test.setStart(new Instant(TEST_TIME2 + 1));
            __CLR4_4_1v0bv0blc8azvxn.R.inc(40288);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1v0bv0blc8azvxn.R.flushNeeded();}}

    public void testSetStart_RI3() {__CLR4_4_1v0bv0blc8azvxn.R.globalSliceStart(getClass().getName(),40289);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kpemqyv35();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1v0bv0blc8azvxn.R.rethrow($CLV_t2$);}finally{__CLR4_4_1v0bv0blc8azvxn.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Updates.testSetStart_RI3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40289,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kpemqyv35(){try{__CLR4_4_1v0bv0blc8azvxn.R.inc(40289);
        __CLR4_4_1v0bv0blc8azvxn.R.inc(40290);MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2);
        __CLR4_4_1v0bv0blc8azvxn.R.inc(40291);test.setStart(null);
        __CLR4_4_1v0bv0blc8azvxn.R.inc(40292);assertEquals(TEST_TIME_NOW, test.getStartMillis());
        __CLR4_4_1v0bv0blc8azvxn.R.inc(40293);assertEquals(TEST_TIME2, test.getEndMillis());
    }finally{__CLR4_4_1v0bv0blc8azvxn.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testSetEndMillis_long1() {__CLR4_4_1v0bv0blc8azvxn.R.globalSliceStart(getClass().getName(),40294);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kb9zriv3a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1v0bv0blc8azvxn.R.rethrow($CLV_t2$);}finally{__CLR4_4_1v0bv0blc8azvxn.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Updates.testSetEndMillis_long1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40294,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kb9zriv3a(){try{__CLR4_4_1v0bv0blc8azvxn.R.inc(40294);
        __CLR4_4_1v0bv0blc8azvxn.R.inc(40295);MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2);
        __CLR4_4_1v0bv0blc8azvxn.R.inc(40296);test.setEndMillis(TEST_TIME2 + 1);
        __CLR4_4_1v0bv0blc8azvxn.R.inc(40297);assertEquals(TEST_TIME1, test.getStartMillis());
        __CLR4_4_1v0bv0blc8azvxn.R.inc(40298);assertEquals(TEST_TIME2 + 1, test.getEndMillis());
    }finally{__CLR4_4_1v0bv0blc8azvxn.R.flushNeeded();}}

    public void testSetEndMillis_long2() {__CLR4_4_1v0bv0blc8azvxn.R.globalSliceStart(getClass().getName(),40299);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nk9yjzv3f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1v0bv0blc8azvxn.R.rethrow($CLV_t2$);}finally{__CLR4_4_1v0bv0blc8azvxn.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Updates.testSetEndMillis_long2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40299,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nk9yjzv3f(){try{__CLR4_4_1v0bv0blc8azvxn.R.inc(40299);
        __CLR4_4_1v0bv0blc8azvxn.R.inc(40300);MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2);
        __CLR4_4_1v0bv0blc8azvxn.R.inc(40301);try {
            __CLR4_4_1v0bv0blc8azvxn.R.inc(40302);test.setEndMillis(TEST_TIME1 - 1);
            __CLR4_4_1v0bv0blc8azvxn.R.inc(40303);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1v0bv0blc8azvxn.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testSetEnd_RI1() {__CLR4_4_1v0bv0blc8azvxn.R.globalSliceStart(getClass().getName(),40304);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1izmfe5v3k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1v0bv0blc8azvxn.R.rethrow($CLV_t2$);}finally{__CLR4_4_1v0bv0blc8azvxn.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Updates.testSetEnd_RI1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40304,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1izmfe5v3k(){try{__CLR4_4_1v0bv0blc8azvxn.R.inc(40304);
        __CLR4_4_1v0bv0blc8azvxn.R.inc(40305);MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2);
        __CLR4_4_1v0bv0blc8azvxn.R.inc(40306);test.setEnd(new Instant(TEST_TIME2 + 1));
        __CLR4_4_1v0bv0blc8azvxn.R.inc(40307);assertEquals(TEST_TIME1, test.getStartMillis());
        __CLR4_4_1v0bv0blc8azvxn.R.inc(40308);assertEquals(TEST_TIME2 + 1, test.getEndMillis());
    }finally{__CLR4_4_1v0bv0blc8azvxn.R.flushNeeded();}}

    public void testSetEnd_RI2() {__CLR4_4_1v0bv0blc8azvxn.R.globalSliceStart(getClass().getName(),40309);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1m8me6mv3p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1v0bv0blc8azvxn.R.rethrow($CLV_t2$);}finally{__CLR4_4_1v0bv0blc8azvxn.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Updates.testSetEnd_RI2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40309,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1m8me6mv3p(){try{__CLR4_4_1v0bv0blc8azvxn.R.inc(40309);
        __CLR4_4_1v0bv0blc8azvxn.R.inc(40310);MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2);
        __CLR4_4_1v0bv0blc8azvxn.R.inc(40311);try {
            __CLR4_4_1v0bv0blc8azvxn.R.inc(40312);test.setEnd(new Instant(TEST_TIME1 - 1));
            __CLR4_4_1v0bv0blc8azvxn.R.inc(40313);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1v0bv0blc8azvxn.R.flushNeeded();}}

    public void testSetEnd_RI3() {__CLR4_4_1v0bv0blc8azvxn.R.globalSliceStart(getClass().getName(),40314);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1phmcz3v3u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1v0bv0blc8azvxn.R.rethrow($CLV_t2$);}finally{__CLR4_4_1v0bv0blc8azvxn.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Updates.testSetEnd_RI3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40314,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1phmcz3v3u(){try{__CLR4_4_1v0bv0blc8azvxn.R.inc(40314);
        __CLR4_4_1v0bv0blc8azvxn.R.inc(40315);MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2);
        __CLR4_4_1v0bv0blc8azvxn.R.inc(40316);test.setEnd(null);
        __CLR4_4_1v0bv0blc8azvxn.R.inc(40317);assertEquals(TEST_TIME1, test.getStartMillis());
        __CLR4_4_1v0bv0blc8azvxn.R.inc(40318);assertEquals(TEST_TIME_NOW, test.getEndMillis());
    }finally{__CLR4_4_1v0bv0blc8azvxn.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testSetDurationAfterStart_long1() {__CLR4_4_1v0bv0blc8azvxn.R.globalSliceStart(getClass().getName(),40319);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hqwmxzv3z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1v0bv0blc8azvxn.R.rethrow($CLV_t2$);}finally{__CLR4_4_1v0bv0blc8azvxn.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Updates.testSetDurationAfterStart_long1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40319,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hqwmxzv3z(){try{__CLR4_4_1v0bv0blc8azvxn.R.inc(40319);
        __CLR4_4_1v0bv0blc8azvxn.R.inc(40320);MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2);
        __CLR4_4_1v0bv0blc8azvxn.R.inc(40321);test.setDurationAfterStart(123L);
        __CLR4_4_1v0bv0blc8azvxn.R.inc(40322);assertEquals(TEST_TIME1, test.getStartMillis());
        __CLR4_4_1v0bv0blc8azvxn.R.inc(40323);assertEquals(TEST_TIME1 + 123L, test.getEndMillis());
    }finally{__CLR4_4_1v0bv0blc8azvxn.R.flushNeeded();}}

    public void testSeDurationAfterStart_long2() {__CLR4_4_1v0bv0blc8azvxn.R.globalSliceStart(getClass().getName(),40324);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fmhcbgv44();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1v0bv0blc8azvxn.R.rethrow($CLV_t2$);}finally{__CLR4_4_1v0bv0blc8azvxn.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Updates.testSeDurationAfterStart_long2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40324,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fmhcbgv44(){try{__CLR4_4_1v0bv0blc8azvxn.R.inc(40324);
        __CLR4_4_1v0bv0blc8azvxn.R.inc(40325);MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2);
        __CLR4_4_1v0bv0blc8azvxn.R.inc(40326);try {
            __CLR4_4_1v0bv0blc8azvxn.R.inc(40327);test.setDurationAfterStart(-1);
            __CLR4_4_1v0bv0blc8azvxn.R.inc(40328);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1v0bv0blc8azvxn.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testSetDurationAfterStart_RI1() {__CLR4_4_1v0bv0blc8azvxn.R.globalSliceStart(getClass().getName(),40329);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15oxywcv49();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1v0bv0blc8azvxn.R.rethrow($CLV_t2$);}finally{__CLR4_4_1v0bv0blc8azvxn.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Updates.testSetDurationAfterStart_RI1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40329,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15oxywcv49(){try{__CLR4_4_1v0bv0blc8azvxn.R.inc(40329);
        __CLR4_4_1v0bv0blc8azvxn.R.inc(40330);MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2);
        __CLR4_4_1v0bv0blc8azvxn.R.inc(40331);test.setDurationAfterStart(new Duration(123L));
        __CLR4_4_1v0bv0blc8azvxn.R.inc(40332);assertEquals(TEST_TIME1, test.getStartMillis());
        __CLR4_4_1v0bv0blc8azvxn.R.inc(40333);assertEquals(TEST_TIME1 + 123L, test.getEndMillis());
    }finally{__CLR4_4_1v0bv0blc8azvxn.R.flushNeeded();}}

    public void testSeDurationAfterStart_RI2() {__CLR4_4_1v0bv0blc8azvxn.R.globalSliceStart(getClass().getName(),40334);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fj0fxbv4e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1v0bv0blc8azvxn.R.rethrow($CLV_t2$);}finally{__CLR4_4_1v0bv0blc8azvxn.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Updates.testSeDurationAfterStart_RI2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40334,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fj0fxbv4e(){try{__CLR4_4_1v0bv0blc8azvxn.R.inc(40334);
        __CLR4_4_1v0bv0blc8azvxn.R.inc(40335);MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2);
        __CLR4_4_1v0bv0blc8azvxn.R.inc(40336);try {
            __CLR4_4_1v0bv0blc8azvxn.R.inc(40337);test.setDurationAfterStart(new Duration(-1));
            __CLR4_4_1v0bv0blc8azvxn.R.inc(40338);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1v0bv0blc8azvxn.R.flushNeeded();}}

    public void testSetDurationAfterStart_RI3() {__CLR4_4_1v0bv0blc8azvxn.R.globalSliceStart(getClass().getName(),40339);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1c6xwhav4j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1v0bv0blc8azvxn.R.rethrow($CLV_t2$);}finally{__CLR4_4_1v0bv0blc8azvxn.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Updates.testSetDurationAfterStart_RI3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40339,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1c6xwhav4j(){try{__CLR4_4_1v0bv0blc8azvxn.R.inc(40339);
        __CLR4_4_1v0bv0blc8azvxn.R.inc(40340);MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2);
        __CLR4_4_1v0bv0blc8azvxn.R.inc(40341);test.setDurationAfterStart(null);
        __CLR4_4_1v0bv0blc8azvxn.R.inc(40342);assertEquals(TEST_TIME1, test.getStartMillis());
        __CLR4_4_1v0bv0blc8azvxn.R.inc(40343);assertEquals(TEST_TIME1, test.getEndMillis());
    }finally{__CLR4_4_1v0bv0blc8azvxn.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testSetDurationBeforeEnd_long1() {__CLR4_4_1v0bv0blc8azvxn.R.globalSliceStart(getClass().getName(),40344);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ves4wlv4o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1v0bv0blc8azvxn.R.rethrow($CLV_t2$);}finally{__CLR4_4_1v0bv0blc8azvxn.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Updates.testSetDurationBeforeEnd_long1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40344,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ves4wlv4o(){try{__CLR4_4_1v0bv0blc8azvxn.R.inc(40344);
        __CLR4_4_1v0bv0blc8azvxn.R.inc(40345);MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2);
        __CLR4_4_1v0bv0blc8azvxn.R.inc(40346);test.setDurationBeforeEnd(123L);
        __CLR4_4_1v0bv0blc8azvxn.R.inc(40347);assertEquals(TEST_TIME2 - 123L, test.getStartMillis());
        __CLR4_4_1v0bv0blc8azvxn.R.inc(40348);assertEquals(TEST_TIME2, test.getEndMillis());
    }finally{__CLR4_4_1v0bv0blc8azvxn.R.flushNeeded();}}

    public void testSeDurationBeforeEnd_long2() {__CLR4_4_1v0bv0blc8azvxn.R.globalSliceStart(getClass().getName(),40349);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dmp2lav4t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1v0bv0blc8azvxn.R.rethrow($CLV_t2$);}finally{__CLR4_4_1v0bv0blc8azvxn.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Updates.testSeDurationBeforeEnd_long2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40349,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dmp2lav4t(){try{__CLR4_4_1v0bv0blc8azvxn.R.inc(40349);
        __CLR4_4_1v0bv0blc8azvxn.R.inc(40350);MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2);
        __CLR4_4_1v0bv0blc8azvxn.R.inc(40351);try {
            __CLR4_4_1v0bv0blc8azvxn.R.inc(40352);test.setDurationBeforeEnd(-1);
            __CLR4_4_1v0bv0blc8azvxn.R.inc(40353);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1v0bv0blc8azvxn.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testSetDurationBeforeEnd_RI1() {__CLR4_4_1v0bv0blc8azvxn.R.globalSliceStart(getClass().getName(),40354);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ndplyv4y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1v0bv0blc8azvxn.R.rethrow($CLV_t2$);}finally{__CLR4_4_1v0bv0blc8azvxn.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Updates.testSetDurationBeforeEnd_RI1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40354,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ndplyv4y(){try{__CLR4_4_1v0bv0blc8azvxn.R.inc(40354);
        __CLR4_4_1v0bv0blc8azvxn.R.inc(40355);MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2);
        __CLR4_4_1v0bv0blc8azvxn.R.inc(40356);test.setDurationBeforeEnd(new Duration(123L));
        __CLR4_4_1v0bv0blc8azvxn.R.inc(40357);assertEquals(TEST_TIME2 - 123L, test.getStartMillis());
        __CLR4_4_1v0bv0blc8azvxn.R.inc(40358);assertEquals(TEST_TIME2, test.getEndMillis());
    }finally{__CLR4_4_1v0bv0blc8azvxn.R.flushNeeded();}}

    public void testSeDurationBeforeEnd_RI2() {__CLR4_4_1v0bv0blc8azvxn.R.globalSliceStart(getClass().getName(),40359);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1u9mhp5v53();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1v0bv0blc8azvxn.R.rethrow($CLV_t2$);}finally{__CLR4_4_1v0bv0blc8azvxn.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Updates.testSeDurationBeforeEnd_RI2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40359,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1u9mhp5v53(){try{__CLR4_4_1v0bv0blc8azvxn.R.inc(40359);
        __CLR4_4_1v0bv0blc8azvxn.R.inc(40360);MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2);
        __CLR4_4_1v0bv0blc8azvxn.R.inc(40361);try {
            __CLR4_4_1v0bv0blc8azvxn.R.inc(40362);test.setDurationBeforeEnd(new Duration(-1));
            __CLR4_4_1v0bv0blc8azvxn.R.inc(40363);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1v0bv0blc8azvxn.R.flushNeeded();}}

    public void testSetDurationBeforeEnd_RI3() {__CLR4_4_1v0bv0blc8azvxn.R.globalSliceStart(getClass().getName(),40364);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15um7z0v58();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1v0bv0blc8azvxn.R.rethrow($CLV_t2$);}finally{__CLR4_4_1v0bv0blc8azvxn.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Updates.testSetDurationBeforeEnd_RI3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40364,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15um7z0v58(){try{__CLR4_4_1v0bv0blc8azvxn.R.inc(40364);
        __CLR4_4_1v0bv0blc8azvxn.R.inc(40365);MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2);
        __CLR4_4_1v0bv0blc8azvxn.R.inc(40366);test.setDurationBeforeEnd(null);
        __CLR4_4_1v0bv0blc8azvxn.R.inc(40367);assertEquals(TEST_TIME2, test.getStartMillis());
        __CLR4_4_1v0bv0blc8azvxn.R.inc(40368);assertEquals(TEST_TIME2, test.getEndMillis());
    }finally{__CLR4_4_1v0bv0blc8azvxn.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testSetPeriodAfterStart_RI1() {__CLR4_4_1v0bv0blc8azvxn.R.globalSliceStart(getClass().getName(),40369);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qc8q0pv5d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1v0bv0blc8azvxn.R.rethrow($CLV_t2$);}finally{__CLR4_4_1v0bv0blc8azvxn.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Updates.testSetPeriodAfterStart_RI1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40369,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qc8q0pv5d(){try{__CLR4_4_1v0bv0blc8azvxn.R.inc(40369);
        __CLR4_4_1v0bv0blc8azvxn.R.inc(40370);MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2);
        __CLR4_4_1v0bv0blc8azvxn.R.inc(40371);test.setPeriodAfterStart(new Period(123L));
        __CLR4_4_1v0bv0blc8azvxn.R.inc(40372);assertEquals(TEST_TIME1, test.getStartMillis());
        __CLR4_4_1v0bv0blc8azvxn.R.inc(40373);assertEquals(TEST_TIME1 + 123L, test.getEndMillis());
    }finally{__CLR4_4_1v0bv0blc8azvxn.R.flushNeeded();}}

    public void testSePeriodAfterStart_RI2() {__CLR4_4_1v0bv0blc8azvxn.R.globalSliceStart(getClass().getName(),40374);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1af7r2qv5i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1v0bv0blc8azvxn.R.rethrow($CLV_t2$);}finally{__CLR4_4_1v0bv0blc8azvxn.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Updates.testSePeriodAfterStart_RI2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40374,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1af7r2qv5i(){try{__CLR4_4_1v0bv0blc8azvxn.R.inc(40374);
        __CLR4_4_1v0bv0blc8azvxn.R.inc(40375);MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2);
        __CLR4_4_1v0bv0blc8azvxn.R.inc(40376);try {
            __CLR4_4_1v0bv0blc8azvxn.R.inc(40377);test.setPeriodAfterStart(new Period(-1L));
            __CLR4_4_1v0bv0blc8azvxn.R.inc(40378);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1v0bv0blc8azvxn.R.flushNeeded();}}

    public void testSetPeriodAfterStart_RI3() {__CLR4_4_1v0bv0blc8azvxn.R.globalSliceStart(getClass().getName(),40379);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wu8nlnv5n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1v0bv0blc8azvxn.R.rethrow($CLV_t2$);}finally{__CLR4_4_1v0bv0blc8azvxn.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Updates.testSetPeriodAfterStart_RI3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40379,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wu8nlnv5n(){try{__CLR4_4_1v0bv0blc8azvxn.R.inc(40379);
        __CLR4_4_1v0bv0blc8azvxn.R.inc(40380);MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2);
        __CLR4_4_1v0bv0blc8azvxn.R.inc(40381);test.setPeriodAfterStart(null);
        __CLR4_4_1v0bv0blc8azvxn.R.inc(40382);assertEquals(TEST_TIME1, test.getStartMillis());
        __CLR4_4_1v0bv0blc8azvxn.R.inc(40383);assertEquals(TEST_TIME1, test.getEndMillis());
    }finally{__CLR4_4_1v0bv0blc8azvxn.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testSetPeriodBeforeEnd_RI1() {__CLR4_4_1v0bv0blc8azvxn.R.globalSliceStart(getClass().getName(),40384);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lh2lv5s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1v0bv0blc8azvxn.R.rethrow($CLV_t2$);}finally{__CLR4_4_1v0bv0blc8azvxn.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Updates.testSetPeriodBeforeEnd_RI1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40384,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lh2lv5s(){try{__CLR4_4_1v0bv0blc8azvxn.R.inc(40384);
        __CLR4_4_1v0bv0blc8azvxn.R.inc(40385);MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2);
        __CLR4_4_1v0bv0blc8azvxn.R.inc(40386);test.setPeriodBeforeEnd(new Period(123L));
        __CLR4_4_1v0bv0blc8azvxn.R.inc(40387);assertEquals(TEST_TIME2 - 123L, test.getStartMillis());
        __CLR4_4_1v0bv0blc8azvxn.R.inc(40388);assertEquals(TEST_TIME2, test.getEndMillis());
    }finally{__CLR4_4_1v0bv0blc8azvxn.R.flushNeeded();}}

    public void testSePeriodBeforeEnd_RI2() {__CLR4_4_1v0bv0blc8azvxn.R.globalSliceStart(getClass().getName(),40389);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1i0ji4av5x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1v0bv0blc8azvxn.R.rethrow($CLV_t2$);}finally{__CLR4_4_1v0bv0blc8azvxn.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Updates.testSePeriodBeforeEnd_RI2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40389,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1i0ji4av5x(){try{__CLR4_4_1v0bv0blc8azvxn.R.inc(40389);
        __CLR4_4_1v0bv0blc8azvxn.R.inc(40390);MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2);
        __CLR4_4_1v0bv0blc8azvxn.R.inc(40391);try {
            __CLR4_4_1v0bv0blc8azvxn.R.inc(40392);test.setPeriodBeforeEnd(new Period(-1L));
            __CLR4_4_1v0bv0blc8azvxn.R.inc(40393);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1v0bv0blc8azvxn.R.flushNeeded();}}

    public void testSetPeriodBeforeEnd_RI3() {__CLR4_4_1v0bv0blc8azvxn.R.globalSliceStart(getClass().getName(),40394);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16ilenjv62();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1v0bv0blc8azvxn.R.rethrow($CLV_t2$);}finally{__CLR4_4_1v0bv0blc8azvxn.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Updates.testSetPeriodBeforeEnd_RI3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40394,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16ilenjv62(){try{__CLR4_4_1v0bv0blc8azvxn.R.inc(40394);
        __CLR4_4_1v0bv0blc8azvxn.R.inc(40395);MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2);
        __CLR4_4_1v0bv0blc8azvxn.R.inc(40396);test.setPeriodBeforeEnd(null);
        __CLR4_4_1v0bv0blc8azvxn.R.inc(40397);assertEquals(TEST_TIME2, test.getStartMillis());
        __CLR4_4_1v0bv0blc8azvxn.R.inc(40398);assertEquals(TEST_TIME2, test.getEndMillis());
    }finally{__CLR4_4_1v0bv0blc8azvxn.R.flushNeeded();}}

}
