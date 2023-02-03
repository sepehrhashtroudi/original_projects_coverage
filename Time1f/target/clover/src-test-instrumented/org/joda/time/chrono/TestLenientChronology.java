/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 *  Copyright 2001-2007 Stephen Colebourne
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

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.MockZone;

/**
 *
 * @author Brian S O'Neill
 * @author Blair Martin
 */
public class TestLenientChronology extends TestCase {static class __CLR4_4_114tu14tulc8azwry{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672271031490L,8589935092L,52989,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public static void main(String[] args) {try{__CLR4_4_114tu14tulc8azwry.R.inc(52914);
        __CLR4_4_114tu14tulc8azwry.R.inc(52915);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_114tu14tulc8azwry.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_114tu14tulc8azwry.R.inc(52916);
        __CLR4_4_114tu14tulc8azwry.R.inc(52917);return new TestSuite(TestLenientChronology.class);
    }finally{__CLR4_4_114tu14tulc8azwry.R.flushNeeded();}}

    public TestLenientChronology(String name) {
        super(name);__CLR4_4_114tu14tulc8azwry.R.inc(52919);try{__CLR4_4_114tu14tulc8azwry.R.inc(52918);
    }finally{__CLR4_4_114tu14tulc8azwry.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_114tu14tulc8azwry.R.inc(52920);
    }finally{__CLR4_4_114tu14tulc8azwry.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_114tu14tulc8azwry.R.inc(52921);
    }finally{__CLR4_4_114tu14tulc8azwry.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void test_setYear() {__CLR4_4_114tu14tulc8azwry.R.globalSliceStart(getClass().getName(),52922);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tpoaah14u2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_114tu14tulc8azwry.R.rethrow($CLV_t2$);}finally{__CLR4_4_114tu14tulc8azwry.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestLenientChronology.test_setYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),52922,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tpoaah14u2(){try{__CLR4_4_114tu14tulc8azwry.R.inc(52922);
        __CLR4_4_114tu14tulc8azwry.R.inc(52923);Chronology zone = LenientChronology.getInstance(ISOChronology.getInstanceUTC());
        __CLR4_4_114tu14tulc8azwry.R.inc(52924);DateTime dt = new DateTime(2007, 1, 1, 0, 0 ,0, 0, zone);
        __CLR4_4_114tu14tulc8azwry.R.inc(52925);assertEquals("2007-01-01T00:00:00.000Z", dt.toString());
        __CLR4_4_114tu14tulc8azwry.R.inc(52926);dt = dt.withYear(2008);
        __CLR4_4_114tu14tulc8azwry.R.inc(52927);assertEquals("2008-01-01T00:00:00.000Z", dt.toString());
    }finally{__CLR4_4_114tu14tulc8azwry.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void test_setMonthOfYear() {__CLR4_4_114tu14tulc8azwry.R.globalSliceStart(getClass().getName(),52928);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jqwiwq14u8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_114tu14tulc8azwry.R.rethrow($CLV_t2$);}finally{__CLR4_4_114tu14tulc8azwry.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestLenientChronology.test_setMonthOfYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),52928,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jqwiwq14u8(){try{__CLR4_4_114tu14tulc8azwry.R.inc(52928);
        __CLR4_4_114tu14tulc8azwry.R.inc(52929);Chronology zone = LenientChronology.getInstance(ISOChronology.getInstanceUTC());
        __CLR4_4_114tu14tulc8azwry.R.inc(52930);DateTime dt = new DateTime(2007, 1, 1, 0, 0 ,0, 0, zone);
        __CLR4_4_114tu14tulc8azwry.R.inc(52931);assertEquals("2007-01-01T00:00:00.000Z", dt.toString());
        __CLR4_4_114tu14tulc8azwry.R.inc(52932);dt = dt.withMonthOfYear(13);
        __CLR4_4_114tu14tulc8azwry.R.inc(52933);assertEquals("2008-01-01T00:00:00.000Z", dt.toString());
        __CLR4_4_114tu14tulc8azwry.R.inc(52934);dt = dt.withMonthOfYear(0);
        __CLR4_4_114tu14tulc8azwry.R.inc(52935);assertEquals("2007-12-01T00:00:00.000Z", dt.toString());
    }finally{__CLR4_4_114tu14tulc8azwry.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void test_setDayOfMonth() {__CLR4_4_114tu14tulc8azwry.R.globalSliceStart(getClass().getName(),52936);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1izb2h14ug();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_114tu14tulc8azwry.R.rethrow($CLV_t2$);}finally{__CLR4_4_114tu14tulc8azwry.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestLenientChronology.test_setDayOfMonth",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),52936,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1izb2h14ug(){try{__CLR4_4_114tu14tulc8azwry.R.inc(52936);
        __CLR4_4_114tu14tulc8azwry.R.inc(52937);Chronology zone = LenientChronology.getInstance(ISOChronology.getInstanceUTC());
        __CLR4_4_114tu14tulc8azwry.R.inc(52938);DateTime dt = new DateTime(2007, 1, 1, 0, 0 ,0, 0, zone);
        __CLR4_4_114tu14tulc8azwry.R.inc(52939);assertEquals("2007-01-01T00:00:00.000Z", dt.toString());
        __CLR4_4_114tu14tulc8azwry.R.inc(52940);dt = dt.withDayOfMonth(32);
        __CLR4_4_114tu14tulc8azwry.R.inc(52941);assertEquals("2007-02-01T00:00:00.000Z", dt.toString());
        __CLR4_4_114tu14tulc8azwry.R.inc(52942);dt = dt.withDayOfMonth(0);
        __CLR4_4_114tu14tulc8azwry.R.inc(52943);assertEquals("2007-01-31T00:00:00.000Z", dt.toString());
    }finally{__CLR4_4_114tu14tulc8azwry.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void test_setHourOfDay() {__CLR4_4_114tu14tulc8azwry.R.globalSliceStart(getClass().getName(),52944);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dn0hjn14uo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_114tu14tulc8azwry.R.rethrow($CLV_t2$);}finally{__CLR4_4_114tu14tulc8azwry.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestLenientChronology.test_setHourOfDay",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),52944,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dn0hjn14uo(){try{__CLR4_4_114tu14tulc8azwry.R.inc(52944);
        __CLR4_4_114tu14tulc8azwry.R.inc(52945);Chronology zone = LenientChronology.getInstance(ISOChronology.getInstanceUTC());
        __CLR4_4_114tu14tulc8azwry.R.inc(52946);DateTime dt = new DateTime(2007, 1, 1, 0, 0 ,0, 0, zone);
        __CLR4_4_114tu14tulc8azwry.R.inc(52947);assertEquals("2007-01-01T00:00:00.000Z", dt.toString());
        __CLR4_4_114tu14tulc8azwry.R.inc(52948);dt = dt.withHourOfDay(24);
        __CLR4_4_114tu14tulc8azwry.R.inc(52949);assertEquals("2007-01-02T00:00:00.000Z", dt.toString());
        __CLR4_4_114tu14tulc8azwry.R.inc(52950);dt = dt.withHourOfDay(-1);
        __CLR4_4_114tu14tulc8azwry.R.inc(52951);assertEquals("2007-01-01T23:00:00.000Z", dt.toString());
    }finally{__CLR4_4_114tu14tulc8azwry.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    //------------------------ Bug ------------------------------------------
    //-----------------------------------------------------------------------
    public void testNearDstTransition() {__CLR4_4_114tu14tulc8azwry.R.globalSliceStart(getClass().getName(),52952);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ugohh514uw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_114tu14tulc8azwry.R.rethrow($CLV_t2$);}finally{__CLR4_4_114tu14tulc8azwry.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestLenientChronology.testNearDstTransition",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),52952,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ugohh514uw(){try{__CLR4_4_114tu14tulc8azwry.R.inc(52952);
        // This is just a regression test. Test case provided by Blair Martin.

        __CLR4_4_114tu14tulc8azwry.R.inc(52953);int hour = 23;
        __CLR4_4_114tu14tulc8azwry.R.inc(52954);DateTime dt;

        __CLR4_4_114tu14tulc8azwry.R.inc(52955);dt = new DateTime(2006, 10, 29, hour, 0, 0, 0,
                          ISOChronology.getInstance(DateTimeZone.forID("America/Los_Angeles")));
        __CLR4_4_114tu14tulc8azwry.R.inc(52956);assertEquals(hour, dt.getHourOfDay()); // OK - no LenientChronology

        __CLR4_4_114tu14tulc8azwry.R.inc(52957);dt = new DateTime(2006, 10, 29, hour, 0, 0, 0,
                          LenientChronology.getInstance
                          (ISOChronology.getInstance(DateTimeZone.forOffsetHours(-8))));
        __CLR4_4_114tu14tulc8azwry.R.inc(52958);assertEquals(hour, dt.getHourOfDay()); // OK - no TZ ID

        __CLR4_4_114tu14tulc8azwry.R.inc(52959);dt = new DateTime(2006, 10, 29, hour, 0, 0, 0,
                          LenientChronology.getInstance
                          (ISOChronology.getInstance(DateTimeZone.forID("America/Los_Angeles"))));

        __CLR4_4_114tu14tulc8azwry.R.inc(52960);assertEquals(hour, dt.getHourOfDay()); // Used to fail - hour was 22
    }finally{__CLR4_4_114tu14tulc8azwry.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    //------------------------ Bug [1755161] --------------------------------
    //-----------------------------------------------------------------------
    /** Mock zone simulating America/Grand_Turk cutover at midnight 2007-04-01 */
    private static long CUTOVER_TURK = 1175403600000L;
    private static int OFFSET_TURK = -18000000;  // -05:00
    private static final DateTimeZone MOCK_TURK = new MockZone(CUTOVER_TURK, OFFSET_TURK, 3600);

    //-----------------------------------------------------------------------
    public void test_MockTurkIsCorrect() {__CLR4_4_114tu14tulc8azwry.R.globalSliceStart(getClass().getName(),52961);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gjm8zu14v5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_114tu14tulc8azwry.R.rethrow($CLV_t2$);}finally{__CLR4_4_114tu14tulc8azwry.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestLenientChronology.test_MockTurkIsCorrect",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),52961,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gjm8zu14v5(){try{__CLR4_4_114tu14tulc8azwry.R.inc(52961);
        __CLR4_4_114tu14tulc8azwry.R.inc(52962);DateTime pre = new DateTime(CUTOVER_TURK - 1L, MOCK_TURK);
        __CLR4_4_114tu14tulc8azwry.R.inc(52963);assertEquals("2007-03-31T23:59:59.999-05:00", pre.toString());
        __CLR4_4_114tu14tulc8azwry.R.inc(52964);DateTime at = new DateTime(CUTOVER_TURK, MOCK_TURK);
        __CLR4_4_114tu14tulc8azwry.R.inc(52965);assertEquals("2007-04-01T01:00:00.000-04:00", at.toString());
        __CLR4_4_114tu14tulc8azwry.R.inc(52966);DateTime post = new DateTime(CUTOVER_TURK + 1L, MOCK_TURK);
        __CLR4_4_114tu14tulc8azwry.R.inc(52967);assertEquals("2007-04-01T01:00:00.001-04:00", post.toString());
    }finally{__CLR4_4_114tu14tulc8azwry.R.flushNeeded();}}

    public void test_lenientChrononolgy_Chicago() {__CLR4_4_114tu14tulc8azwry.R.globalSliceStart(getClass().getName(),52968);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1m71mo214vc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_114tu14tulc8azwry.R.rethrow($CLV_t2$);}finally{__CLR4_4_114tu14tulc8azwry.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestLenientChronology.test_lenientChrononolgy_Chicago",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),52968,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1m71mo214vc(){try{__CLR4_4_114tu14tulc8azwry.R.inc(52968);
        __CLR4_4_114tu14tulc8azwry.R.inc(52969);DateTimeZone zone = DateTimeZone.forID("America/Chicago");
        __CLR4_4_114tu14tulc8azwry.R.inc(52970);Chronology lenient = LenientChronology.getInstance(ISOChronology.getInstance(zone));
        __CLR4_4_114tu14tulc8azwry.R.inc(52971);DateTime dt = new DateTime(2007, 3, 11, 2, 30, 0, 0, lenient);
        __CLR4_4_114tu14tulc8azwry.R.inc(52972);assertEquals("2007-03-11T03:30:00.000-05:00", dt.toString());
    }finally{__CLR4_4_114tu14tulc8azwry.R.flushNeeded();}}

    public void test_lenientChrononolgy_Turk() {__CLR4_4_114tu14tulc8azwry.R.globalSliceStart(getClass().getName(),52973);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1p8sexc14vh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_114tu14tulc8azwry.R.rethrow($CLV_t2$);}finally{__CLR4_4_114tu14tulc8azwry.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestLenientChronology.test_lenientChrononolgy_Turk",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),52973,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1p8sexc14vh(){try{__CLR4_4_114tu14tulc8azwry.R.inc(52973);
        __CLR4_4_114tu14tulc8azwry.R.inc(52974);Chronology lenient = LenientChronology.getInstance(ISOChronology.getInstance(MOCK_TURK));
        __CLR4_4_114tu14tulc8azwry.R.inc(52975);DateTime dt = new DateTime(2007, 4, 1, 0, 30, 0, 0, lenient);
        __CLR4_4_114tu14tulc8azwry.R.inc(52976);assertEquals("2007-04-01T01:30:00.000-04:00", dt.toString());
    }finally{__CLR4_4_114tu14tulc8azwry.R.flushNeeded();}}

    public void test_strictChrononolgy_Chicago() {__CLR4_4_114tu14tulc8azwry.R.globalSliceStart(getClass().getName(),52977);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1k19nii14vl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_114tu14tulc8azwry.R.rethrow($CLV_t2$);}finally{__CLR4_4_114tu14tulc8azwry.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestLenientChronology.test_strictChrononolgy_Chicago",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),52977,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1k19nii14vl(){try{__CLR4_4_114tu14tulc8azwry.R.inc(52977);
        __CLR4_4_114tu14tulc8azwry.R.inc(52978);DateTimeZone zone = DateTimeZone.forID("America/Chicago");
        __CLR4_4_114tu14tulc8azwry.R.inc(52979);Chronology lenient = StrictChronology.getInstance(ISOChronology.getInstance(zone));
        __CLR4_4_114tu14tulc8azwry.R.inc(52980);try {
            __CLR4_4_114tu14tulc8azwry.R.inc(52981);new DateTime(2007, 3, 11, 2, 30, 0, 0, lenient);
            __CLR4_4_114tu14tulc8azwry.R.inc(52982);fail();
        } catch (IllegalArgumentException ex) {
            // expected
        }
    }finally{__CLR4_4_114tu14tulc8azwry.R.flushNeeded();}}

    public void test_isoChrononolgy_Chicago() {__CLR4_4_114tu14tulc8azwry.R.globalSliceStart(getClass().getName(),52983);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yjf52s14vr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_114tu14tulc8azwry.R.rethrow($CLV_t2$);}finally{__CLR4_4_114tu14tulc8azwry.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestLenientChronology.test_isoChrononolgy_Chicago",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),52983,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yjf52s14vr(){try{__CLR4_4_114tu14tulc8azwry.R.inc(52983);
        __CLR4_4_114tu14tulc8azwry.R.inc(52984);DateTimeZone zone = DateTimeZone.forID("America/Chicago");
        __CLR4_4_114tu14tulc8azwry.R.inc(52985);Chronology lenient = ISOChronology.getInstance(zone);
        __CLR4_4_114tu14tulc8azwry.R.inc(52986);try {
            __CLR4_4_114tu14tulc8azwry.R.inc(52987);new DateTime(2007, 3, 11, 2, 30, 0, 0, lenient);
            __CLR4_4_114tu14tulc8azwry.R.inc(52988);fail();
        } catch (IllegalArgumentException ex) {
            // expected
        }
    }finally{__CLR4_4_114tu14tulc8azwry.R.flushNeeded();}}

}
