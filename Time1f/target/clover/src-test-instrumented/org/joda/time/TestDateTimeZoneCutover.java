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
package org.joda.time;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.chrono.GregorianChronology;
import org.joda.time.tz.DateTimeZoneBuilder;

/**
 * This class is a JUnit test for DateTimeZone.
 *
 * @author Stephen Colebourne
 */
public class TestDateTimeZoneCutover extends TestCase {static class __CLR4_4_1jbejbelc8azugb{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672271031490L,8589935092L,25883,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public static void main(String[] args) {try{__CLR4_4_1jbejbelc8azugb.R.inc(25034);
        __CLR4_4_1jbejbelc8azugb.R.inc(25035);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1jbejbelc8azugb.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1jbejbelc8azugb.R.inc(25036);
        __CLR4_4_1jbejbelc8azugb.R.inc(25037);return new TestSuite(TestDateTimeZoneCutover.class);
    }finally{__CLR4_4_1jbejbelc8azugb.R.flushNeeded();}}

    public TestDateTimeZoneCutover(String name) {
        super(name);__CLR4_4_1jbejbelc8azugb.R.inc(25039);try{__CLR4_4_1jbejbelc8azugb.R.inc(25038);
    }finally{__CLR4_4_1jbejbelc8azugb.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1jbejbelc8azugb.R.inc(25040);
    }finally{__CLR4_4_1jbejbelc8azugb.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1jbejbelc8azugb.R.inc(25041);
    }finally{__CLR4_4_1jbejbelc8azugb.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    //------------------------ Bug [1710316] --------------------------------
    //-----------------------------------------------------------------------
    // The behaviour of getOffsetFromLocal is defined in its javadoc
    // However, this definition doesn't work for all DateTimeField operations
    
    /** Mock zone simulating Asia/Gaza cutover at midnight 2007-04-01 */
    private static long CUTOVER_GAZA = 1175378400000L;
    private static int OFFSET_GAZA = 7200000;  // +02:00
    private static final DateTimeZone MOCK_GAZA = new MockZone(CUTOVER_GAZA, OFFSET_GAZA, 3600);

    //-----------------------------------------------------------------------
    public void test_MockGazaIsCorrect() {__CLR4_4_1jbejbelc8azugb.R.globalSliceStart(getClass().getName(),25042);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qu0asvjbm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jbejbelc8azugb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jbejbelc8azugb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_MockGazaIsCorrect",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25042,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qu0asvjbm(){try{__CLR4_4_1jbejbelc8azugb.R.inc(25042);
        __CLR4_4_1jbejbelc8azugb.R.inc(25043);DateTime pre = new DateTime(CUTOVER_GAZA - 1L, MOCK_GAZA);
        __CLR4_4_1jbejbelc8azugb.R.inc(25044);assertEquals("2007-03-31T23:59:59.999+02:00", pre.toString());
        __CLR4_4_1jbejbelc8azugb.R.inc(25045);DateTime at = new DateTime(CUTOVER_GAZA, MOCK_GAZA);
        __CLR4_4_1jbejbelc8azugb.R.inc(25046);assertEquals("2007-04-01T01:00:00.000+03:00", at.toString());
        __CLR4_4_1jbejbelc8azugb.R.inc(25047);DateTime post = new DateTime(CUTOVER_GAZA + 1L, MOCK_GAZA);
        __CLR4_4_1jbejbelc8azugb.R.inc(25048);assertEquals("2007-04-01T01:00:00.001+03:00", post.toString());
    }finally{__CLR4_4_1jbejbelc8azugb.R.flushNeeded();}}

    public void test_getOffsetFromLocal_Gaza() {__CLR4_4_1jbejbelc8azugb.R.globalSliceStart(getClass().getName(),25049);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fug3mqjbt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jbejbelc8azugb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jbejbelc8azugb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_getOffsetFromLocal_Gaza",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25049,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fug3mqjbt(){try{__CLR4_4_1jbejbelc8azugb.R.inc(25049);
        __CLR4_4_1jbejbelc8azugb.R.inc(25050);doTest_getOffsetFromLocal_Gaza(-1, 23, 0, "2007-03-31T23:00:00.000+02:00");
        __CLR4_4_1jbejbelc8azugb.R.inc(25051);doTest_getOffsetFromLocal_Gaza(-1, 23, 30, "2007-03-31T23:30:00.000+02:00");
        __CLR4_4_1jbejbelc8azugb.R.inc(25052);doTest_getOffsetFromLocal_Gaza(0, 0, 0, "2007-04-01T01:00:00.000+03:00");
        __CLR4_4_1jbejbelc8azugb.R.inc(25053);doTest_getOffsetFromLocal_Gaza(0, 0, 30, "2007-04-01T01:30:00.000+03:00");
        __CLR4_4_1jbejbelc8azugb.R.inc(25054);doTest_getOffsetFromLocal_Gaza(0, 1, 0, "2007-04-01T01:00:00.000+03:00");
        __CLR4_4_1jbejbelc8azugb.R.inc(25055);doTest_getOffsetFromLocal_Gaza(0, 1, 30, "2007-04-01T01:30:00.000+03:00");
        __CLR4_4_1jbejbelc8azugb.R.inc(25056);doTest_getOffsetFromLocal_Gaza(0, 2, 0, "2007-04-01T02:00:00.000+03:00");
        __CLR4_4_1jbejbelc8azugb.R.inc(25057);doTest_getOffsetFromLocal_Gaza(0, 3, 0, "2007-04-01T03:00:00.000+03:00");
        __CLR4_4_1jbejbelc8azugb.R.inc(25058);doTest_getOffsetFromLocal_Gaza(0, 4, 0, "2007-04-01T04:00:00.000+03:00");
        __CLR4_4_1jbejbelc8azugb.R.inc(25059);doTest_getOffsetFromLocal_Gaza(0, 5, 0, "2007-04-01T05:00:00.000+03:00");
        __CLR4_4_1jbejbelc8azugb.R.inc(25060);doTest_getOffsetFromLocal_Gaza(0, 6, 0, "2007-04-01T06:00:00.000+03:00");
    }finally{__CLR4_4_1jbejbelc8azugb.R.flushNeeded();}}

    private void doTest_getOffsetFromLocal_Gaza(int days, int hour, int min, String expected) {try{__CLR4_4_1jbejbelc8azugb.R.inc(25061);
        __CLR4_4_1jbejbelc8azugb.R.inc(25062);DateTime dt = new DateTime(2007, 4, 1, hour, min, 0, 0, DateTimeZone.UTC).plusDays(days);
        __CLR4_4_1jbejbelc8azugb.R.inc(25063);int offset = MOCK_GAZA.getOffsetFromLocal(dt.getMillis());
        __CLR4_4_1jbejbelc8azugb.R.inc(25064);DateTime res = new DateTime(dt.getMillis() - offset, MOCK_GAZA);
        __CLR4_4_1jbejbelc8azugb.R.inc(25065);assertEquals(res.toString(), expected, res.toString());
    }finally{__CLR4_4_1jbejbelc8azugb.R.flushNeeded();}}

    public void test_DateTime_roundFloor_Gaza() {__CLR4_4_1jbejbelc8azugb.R.globalSliceStart(getClass().getName(),25066);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tiiys2jca();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jbejbelc8azugb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jbejbelc8azugb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_DateTime_roundFloor_Gaza",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25066,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tiiys2jca(){try{__CLR4_4_1jbejbelc8azugb.R.inc(25066);
        __CLR4_4_1jbejbelc8azugb.R.inc(25067);DateTime dt = new DateTime(2007, 4, 1, 8, 0, 0, 0, MOCK_GAZA);
        __CLR4_4_1jbejbelc8azugb.R.inc(25068);assertEquals("2007-04-01T08:00:00.000+03:00", dt.toString());
        __CLR4_4_1jbejbelc8azugb.R.inc(25069);DateTime rounded = dt.dayOfMonth().roundFloorCopy();
        __CLR4_4_1jbejbelc8azugb.R.inc(25070);assertEquals("2007-04-01T01:00:00.000+03:00", rounded.toString());
    }finally{__CLR4_4_1jbejbelc8azugb.R.flushNeeded();}}

    public void test_DateTime_roundCeiling_Gaza() {__CLR4_4_1jbejbelc8azugb.R.globalSliceStart(getClass().getName(),25071);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19qg0rljcf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jbejbelc8azugb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jbejbelc8azugb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_DateTime_roundCeiling_Gaza",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25071,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19qg0rljcf(){try{__CLR4_4_1jbejbelc8azugb.R.inc(25071);
        __CLR4_4_1jbejbelc8azugb.R.inc(25072);DateTime dt = new DateTime(2007, 3, 31, 20, 0, 0, 0, MOCK_GAZA);
        __CLR4_4_1jbejbelc8azugb.R.inc(25073);assertEquals("2007-03-31T20:00:00.000+02:00", dt.toString());
        __CLR4_4_1jbejbelc8azugb.R.inc(25074);DateTime rounded = dt.dayOfMonth().roundCeilingCopy();
        __CLR4_4_1jbejbelc8azugb.R.inc(25075);assertEquals("2007-04-01T01:00:00.000+03:00", rounded.toString());
    }finally{__CLR4_4_1jbejbelc8azugb.R.flushNeeded();}}

    public void test_DateTime_setHourZero_Gaza() {__CLR4_4_1jbejbelc8azugb.R.globalSliceStart(getClass().getName(),25076);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1huptqojck();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jbejbelc8azugb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jbejbelc8azugb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_DateTime_setHourZero_Gaza",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25076,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1huptqojck(){try{__CLR4_4_1jbejbelc8azugb.R.inc(25076);
        __CLR4_4_1jbejbelc8azugb.R.inc(25077);DateTime dt = new DateTime(2007, 4, 1, 8, 0, 0, 0, MOCK_GAZA);
        __CLR4_4_1jbejbelc8azugb.R.inc(25078);assertEquals("2007-04-01T08:00:00.000+03:00", dt.toString());
        __CLR4_4_1jbejbelc8azugb.R.inc(25079);try {
            __CLR4_4_1jbejbelc8azugb.R.inc(25080);dt.hourOfDay().setCopy(0);
            __CLR4_4_1jbejbelc8azugb.R.inc(25081);fail();
        } catch (IllegalFieldValueException ex) {
            // expected
        }
    }finally{__CLR4_4_1jbejbelc8azugb.R.flushNeeded();}}

    public void test_DateTime_withHourZero_Gaza() {__CLR4_4_1jbejbelc8azugb.R.globalSliceStart(getClass().getName(),25082);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yn44kijcq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jbejbelc8azugb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jbejbelc8azugb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_DateTime_withHourZero_Gaza",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25082,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yn44kijcq(){try{__CLR4_4_1jbejbelc8azugb.R.inc(25082);
        __CLR4_4_1jbejbelc8azugb.R.inc(25083);DateTime dt = new DateTime(2007, 4, 1, 8, 0, 0, 0, MOCK_GAZA);
        __CLR4_4_1jbejbelc8azugb.R.inc(25084);assertEquals("2007-04-01T08:00:00.000+03:00", dt.toString());
        __CLR4_4_1jbejbelc8azugb.R.inc(25085);try {
            __CLR4_4_1jbejbelc8azugb.R.inc(25086);dt.withHourOfDay(0);
            __CLR4_4_1jbejbelc8azugb.R.inc(25087);fail();
        } catch (IllegalFieldValueException ex) {
            // expected
        }
    }finally{__CLR4_4_1jbejbelc8azugb.R.flushNeeded();}}

    public void test_DateTime_withDay_Gaza() {__CLR4_4_1jbejbelc8azugb.R.globalSliceStart(getClass().getName(),25088);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16dzvy0jcw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jbejbelc8azugb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jbejbelc8azugb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_DateTime_withDay_Gaza",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25088,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16dzvy0jcw(){try{__CLR4_4_1jbejbelc8azugb.R.inc(25088);
        __CLR4_4_1jbejbelc8azugb.R.inc(25089);DateTime dt = new DateTime(2007, 4, 2, 0, 0, 0, 0, MOCK_GAZA);
        __CLR4_4_1jbejbelc8azugb.R.inc(25090);assertEquals("2007-04-02T00:00:00.000+03:00", dt.toString());
        __CLR4_4_1jbejbelc8azugb.R.inc(25091);DateTime res = dt.withDayOfMonth(1);
        __CLR4_4_1jbejbelc8azugb.R.inc(25092);assertEquals("2007-04-01T01:00:00.000+03:00", res.toString());
    }finally{__CLR4_4_1jbejbelc8azugb.R.flushNeeded();}}

    public void test_DateTime_minusHour_Gaza() {__CLR4_4_1jbejbelc8azugb.R.globalSliceStart(getClass().getName(),25093);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14gu3aujd1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jbejbelc8azugb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jbejbelc8azugb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_DateTime_minusHour_Gaza",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25093,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14gu3aujd1(){try{__CLR4_4_1jbejbelc8azugb.R.inc(25093);
        __CLR4_4_1jbejbelc8azugb.R.inc(25094);DateTime dt = new DateTime(2007, 4, 1, 8, 0, 0, 0, MOCK_GAZA);
        __CLR4_4_1jbejbelc8azugb.R.inc(25095);assertEquals("2007-04-01T08:00:00.000+03:00", dt.toString());
        
        __CLR4_4_1jbejbelc8azugb.R.inc(25096);DateTime minus7 = dt.minusHours(7);
        __CLR4_4_1jbejbelc8azugb.R.inc(25097);assertEquals("2007-04-01T01:00:00.000+03:00", minus7.toString());
        __CLR4_4_1jbejbelc8azugb.R.inc(25098);DateTime minus8 = dt.minusHours(8);
        __CLR4_4_1jbejbelc8azugb.R.inc(25099);assertEquals("2007-03-31T23:00:00.000+02:00", minus8.toString());
        __CLR4_4_1jbejbelc8azugb.R.inc(25100);DateTime minus9 = dt.minusHours(9);
        __CLR4_4_1jbejbelc8azugb.R.inc(25101);assertEquals("2007-03-31T22:00:00.000+02:00", minus9.toString());
    }finally{__CLR4_4_1jbejbelc8azugb.R.flushNeeded();}}

    public void test_DateTime_plusHour_Gaza() {__CLR4_4_1jbejbelc8azugb.R.globalSliceStart(getClass().getName(),25102);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rexwlujda();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jbejbelc8azugb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jbejbelc8azugb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_DateTime_plusHour_Gaza",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25102,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rexwlujda(){try{__CLR4_4_1jbejbelc8azugb.R.inc(25102);
        __CLR4_4_1jbejbelc8azugb.R.inc(25103);DateTime dt = new DateTime(2007, 3, 31, 16, 0, 0, 0, MOCK_GAZA);
        __CLR4_4_1jbejbelc8azugb.R.inc(25104);assertEquals("2007-03-31T16:00:00.000+02:00", dt.toString());
        
        __CLR4_4_1jbejbelc8azugb.R.inc(25105);DateTime plus7 = dt.plusHours(7);
        __CLR4_4_1jbejbelc8azugb.R.inc(25106);assertEquals("2007-03-31T23:00:00.000+02:00", plus7.toString());
        __CLR4_4_1jbejbelc8azugb.R.inc(25107);DateTime plus8 = dt.plusHours(8);
        __CLR4_4_1jbejbelc8azugb.R.inc(25108);assertEquals("2007-04-01T01:00:00.000+03:00", plus8.toString());
        __CLR4_4_1jbejbelc8azugb.R.inc(25109);DateTime plus9 = dt.plusHours(9);
        __CLR4_4_1jbejbelc8azugb.R.inc(25110);assertEquals("2007-04-01T02:00:00.000+03:00", plus9.toString());
    }finally{__CLR4_4_1jbejbelc8azugb.R.flushNeeded();}}

    public void test_DateTime_minusDay_Gaza() {__CLR4_4_1jbejbelc8azugb.R.globalSliceStart(getClass().getName(),25111);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1x3t9jwjdj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jbejbelc8azugb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jbejbelc8azugb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_DateTime_minusDay_Gaza",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25111,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1x3t9jwjdj(){try{__CLR4_4_1jbejbelc8azugb.R.inc(25111);
        __CLR4_4_1jbejbelc8azugb.R.inc(25112);DateTime dt = new DateTime(2007, 4, 2, 0, 0, 0, 0, MOCK_GAZA);
        __CLR4_4_1jbejbelc8azugb.R.inc(25113);assertEquals("2007-04-02T00:00:00.000+03:00", dt.toString());
        
        __CLR4_4_1jbejbelc8azugb.R.inc(25114);DateTime minus1 = dt.minusDays(1);
        __CLR4_4_1jbejbelc8azugb.R.inc(25115);assertEquals("2007-04-01T01:00:00.000+03:00", minus1.toString());
        __CLR4_4_1jbejbelc8azugb.R.inc(25116);DateTime minus2 = dt.minusDays(2);
        __CLR4_4_1jbejbelc8azugb.R.inc(25117);assertEquals("2007-03-31T00:00:00.000+02:00", minus2.toString());
    }finally{__CLR4_4_1jbejbelc8azugb.R.flushNeeded();}}

    public void test_DateTime_plusDay_Gaza() {__CLR4_4_1jbejbelc8azugb.R.globalSliceStart(getClass().getName(),25118);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kmfahojdq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jbejbelc8azugb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jbejbelc8azugb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_DateTime_plusDay_Gaza",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25118,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kmfahojdq(){try{__CLR4_4_1jbejbelc8azugb.R.inc(25118);
        __CLR4_4_1jbejbelc8azugb.R.inc(25119);DateTime dt = new DateTime(2007, 3, 31, 0, 0, 0, 0, MOCK_GAZA);
        __CLR4_4_1jbejbelc8azugb.R.inc(25120);assertEquals("2007-03-31T00:00:00.000+02:00", dt.toString());
        
        __CLR4_4_1jbejbelc8azugb.R.inc(25121);DateTime plus1 = dt.plusDays(1);
        __CLR4_4_1jbejbelc8azugb.R.inc(25122);assertEquals("2007-04-01T01:00:00.000+03:00", plus1.toString());
        __CLR4_4_1jbejbelc8azugb.R.inc(25123);DateTime plus2 = dt.plusDays(2);
        __CLR4_4_1jbejbelc8azugb.R.inc(25124);assertEquals("2007-04-02T00:00:00.000+03:00", plus2.toString());
    }finally{__CLR4_4_1jbejbelc8azugb.R.flushNeeded();}}

    public void test_DateTime_plusDayMidGap_Gaza() {__CLR4_4_1jbejbelc8azugb.R.globalSliceStart(getClass().getName(),25125);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xlwpgyjdx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jbejbelc8azugb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jbejbelc8azugb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_DateTime_plusDayMidGap_Gaza",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25125,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xlwpgyjdx(){try{__CLR4_4_1jbejbelc8azugb.R.inc(25125);
        __CLR4_4_1jbejbelc8azugb.R.inc(25126);DateTime dt = new DateTime(2007, 3, 31, 0, 30, 0, 0, MOCK_GAZA);
        __CLR4_4_1jbejbelc8azugb.R.inc(25127);assertEquals("2007-03-31T00:30:00.000+02:00", dt.toString());
        
        __CLR4_4_1jbejbelc8azugb.R.inc(25128);DateTime plus1 = dt.plusDays(1);
        __CLR4_4_1jbejbelc8azugb.R.inc(25129);assertEquals("2007-04-01T01:30:00.000+03:00", plus1.toString());
        __CLR4_4_1jbejbelc8azugb.R.inc(25130);DateTime plus2 = dt.plusDays(2);
        __CLR4_4_1jbejbelc8azugb.R.inc(25131);assertEquals("2007-04-02T00:30:00.000+03:00", plus2.toString());
    }finally{__CLR4_4_1jbejbelc8azugb.R.flushNeeded();}}

    public void test_DateTime_addWrapFieldDay_Gaza() {__CLR4_4_1jbejbelc8azugb.R.globalSliceStart(getClass().getName(),25132);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gvxwpdje4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jbejbelc8azugb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jbejbelc8azugb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_DateTime_addWrapFieldDay_Gaza",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25132,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gvxwpdje4(){try{__CLR4_4_1jbejbelc8azugb.R.inc(25132);
        __CLR4_4_1jbejbelc8azugb.R.inc(25133);DateTime dt = new DateTime(2007, 4, 30, 0, 0, 0, 0, MOCK_GAZA);
        __CLR4_4_1jbejbelc8azugb.R.inc(25134);assertEquals("2007-04-30T00:00:00.000+03:00", dt.toString());
        
        __CLR4_4_1jbejbelc8azugb.R.inc(25135);DateTime plus1 = dt.dayOfMonth().addWrapFieldToCopy(1);
        __CLR4_4_1jbejbelc8azugb.R.inc(25136);assertEquals("2007-04-01T01:00:00.000+03:00", plus1.toString());
        __CLR4_4_1jbejbelc8azugb.R.inc(25137);DateTime plus2 = dt.dayOfMonth().addWrapFieldToCopy(2);
        __CLR4_4_1jbejbelc8azugb.R.inc(25138);assertEquals("2007-04-02T00:00:00.000+03:00", plus2.toString());
    }finally{__CLR4_4_1jbejbelc8azugb.R.flushNeeded();}}

    public void test_DateTime_withZoneRetainFields_Gaza() {__CLR4_4_1jbejbelc8azugb.R.globalSliceStart(getClass().getName(),25139);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1r8jqhsjeb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jbejbelc8azugb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jbejbelc8azugb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_DateTime_withZoneRetainFields_Gaza",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25139,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1r8jqhsjeb(){try{__CLR4_4_1jbejbelc8azugb.R.inc(25139);
        __CLR4_4_1jbejbelc8azugb.R.inc(25140);DateTime dt = new DateTime(2007, 4, 1, 0, 0, 0, 0, DateTimeZone.UTC);
        __CLR4_4_1jbejbelc8azugb.R.inc(25141);assertEquals("2007-04-01T00:00:00.000Z", dt.toString());
        
        __CLR4_4_1jbejbelc8azugb.R.inc(25142);DateTime res = dt.withZoneRetainFields(MOCK_GAZA);
        __CLR4_4_1jbejbelc8azugb.R.inc(25143);assertEquals("2007-04-01T01:00:00.000+03:00", res.toString());
    }finally{__CLR4_4_1jbejbelc8azugb.R.flushNeeded();}}

    public void test_MutableDateTime_withZoneRetainFields_Gaza() {__CLR4_4_1jbejbelc8azugb.R.globalSliceStart(getClass().getName(),25144);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hhs2jwjeg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jbejbelc8azugb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jbejbelc8azugb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_MutableDateTime_withZoneRetainFields_Gaza",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25144,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hhs2jwjeg(){try{__CLR4_4_1jbejbelc8azugb.R.inc(25144);
        __CLR4_4_1jbejbelc8azugb.R.inc(25145);MutableDateTime dt = new MutableDateTime(2007, 4, 1, 0, 0, 0, 0, DateTimeZone.UTC);
        __CLR4_4_1jbejbelc8azugb.R.inc(25146);assertEquals("2007-04-01T00:00:00.000Z", dt.toString());
        
        __CLR4_4_1jbejbelc8azugb.R.inc(25147);dt.setZoneRetainFields(MOCK_GAZA);
        __CLR4_4_1jbejbelc8azugb.R.inc(25148);assertEquals("2007-04-01T01:00:00.000+03:00", dt.toString());
    }finally{__CLR4_4_1jbejbelc8azugb.R.flushNeeded();}}

    public void test_LocalDate_new_Gaza() {__CLR4_4_1jbejbelc8azugb.R.globalSliceStart(getClass().getName(),25149);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ig4u4mjel();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jbejbelc8azugb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jbejbelc8azugb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_LocalDate_new_Gaza",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25149,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ig4u4mjel(){try{__CLR4_4_1jbejbelc8azugb.R.inc(25149);
        __CLR4_4_1jbejbelc8azugb.R.inc(25150);LocalDate date1 = new LocalDate(CUTOVER_GAZA, MOCK_GAZA);
        __CLR4_4_1jbejbelc8azugb.R.inc(25151);assertEquals("2007-04-01", date1.toString());
        
        __CLR4_4_1jbejbelc8azugb.R.inc(25152);LocalDate date2 = new LocalDate(CUTOVER_GAZA - 1, MOCK_GAZA);
        __CLR4_4_1jbejbelc8azugb.R.inc(25153);assertEquals("2007-03-31", date2.toString());
    }finally{__CLR4_4_1jbejbelc8azugb.R.flushNeeded();}}

    public void test_LocalDate_toDateMidnight_Gaza() {__CLR4_4_1jbejbelc8azugb.R.globalSliceStart(getClass().getName(),25154);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sn7hidjeq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jbejbelc8azugb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jbejbelc8azugb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_LocalDate_toDateMidnight_Gaza",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25154,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sn7hidjeq(){try{__CLR4_4_1jbejbelc8azugb.R.inc(25154);
        __CLR4_4_1jbejbelc8azugb.R.inc(25155);LocalDate date = new LocalDate(2007, 4, 1);
        __CLR4_4_1jbejbelc8azugb.R.inc(25156);try {
            __CLR4_4_1jbejbelc8azugb.R.inc(25157);date.toDateMidnight(MOCK_GAZA);
            __CLR4_4_1jbejbelc8azugb.R.inc(25158);fail();
        } catch (IllegalInstantException ex) {
            __CLR4_4_1jbejbelc8azugb.R.inc(25159);assertEquals(true, ex.getMessage().startsWith("Illegal instant due to time zone offset transition"));
        }
    }finally{__CLR4_4_1jbejbelc8azugb.R.flushNeeded();}}

    public void test_DateTime_new_Gaza() {__CLR4_4_1jbejbelc8azugb.R.globalSliceStart(getClass().getName(),25160);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1r9jc4ijew();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jbejbelc8azugb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jbejbelc8azugb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_DateTime_new_Gaza",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25160,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1r9jc4ijew(){try{__CLR4_4_1jbejbelc8azugb.R.inc(25160);
        __CLR4_4_1jbejbelc8azugb.R.inc(25161);try {
            __CLR4_4_1jbejbelc8azugb.R.inc(25162);new DateTime(2007, 4, 1, 0, 0, 0, 0, MOCK_GAZA);
            __CLR4_4_1jbejbelc8azugb.R.inc(25163);fail();
        } catch (IllegalInstantException ex) {
            __CLR4_4_1jbejbelc8azugb.R.inc(25164);assertEquals(true, ex.getMessage().indexOf("Illegal instant due to time zone offset transition") >= 0);
        }
    }finally{__CLR4_4_1jbejbelc8azugb.R.flushNeeded();}}

    public void test_DateTime_newValid_Gaza() {__CLR4_4_1jbejbelc8azugb.R.globalSliceStart(getClass().getName(),25165);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1z22i18jf1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jbejbelc8azugb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jbejbelc8azugb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_DateTime_newValid_Gaza",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25165,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1z22i18jf1(){try{__CLR4_4_1jbejbelc8azugb.R.inc(25165);
        __CLR4_4_1jbejbelc8azugb.R.inc(25166);new DateTime(2007, 3, 31, 19, 0, 0, 0, MOCK_GAZA);
        __CLR4_4_1jbejbelc8azugb.R.inc(25167);new DateTime(2007, 3, 31, 20, 0, 0, 0, MOCK_GAZA);
        __CLR4_4_1jbejbelc8azugb.R.inc(25168);new DateTime(2007, 3, 31, 21, 0, 0, 0, MOCK_GAZA);
        __CLR4_4_1jbejbelc8azugb.R.inc(25169);new DateTime(2007, 3, 31, 22, 0, 0, 0, MOCK_GAZA);
        __CLR4_4_1jbejbelc8azugb.R.inc(25170);new DateTime(2007, 3, 31, 23, 0, 0, 0, MOCK_GAZA);
        __CLR4_4_1jbejbelc8azugb.R.inc(25171);new DateTime(2007, 4, 1, 1, 0, 0, 0, MOCK_GAZA);
        __CLR4_4_1jbejbelc8azugb.R.inc(25172);new DateTime(2007, 4, 1, 2, 0, 0, 0, MOCK_GAZA);
        __CLR4_4_1jbejbelc8azugb.R.inc(25173);new DateTime(2007, 4, 1, 3, 0, 0, 0, MOCK_GAZA);
    }finally{__CLR4_4_1jbejbelc8azugb.R.flushNeeded();}}

    public void test_DateTime_parse_Gaza() {__CLR4_4_1jbejbelc8azugb.R.globalSliceStart(getClass().getName(),25174);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1b3u3zpjfa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jbejbelc8azugb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jbejbelc8azugb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_DateTime_parse_Gaza",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25174,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1b3u3zpjfa(){try{__CLR4_4_1jbejbelc8azugb.R.inc(25174);
        __CLR4_4_1jbejbelc8azugb.R.inc(25175);try {
            __CLR4_4_1jbejbelc8azugb.R.inc(25176);new DateTime("2007-04-01T00:00", MOCK_GAZA);
            __CLR4_4_1jbejbelc8azugb.R.inc(25177);fail();
        } catch (IllegalInstantException ex) {
            __CLR4_4_1jbejbelc8azugb.R.inc(25178);assertEquals(true, ex.getMessage().indexOf("Illegal instant due to time zone offset transition") >= 0);
        }
    }finally{__CLR4_4_1jbejbelc8azugb.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    //------------------------ Bug [1710316] --------------------------------
    //-----------------------------------------------------------------------
    /** Mock zone simulating America/Grand_Turk cutover at midnight 2007-04-01 */
    private static long CUTOVER_TURK = 1175403600000L;
    private static int OFFSET_TURK = -18000000;  // -05:00
    private static final DateTimeZone MOCK_TURK = new MockZone(CUTOVER_TURK, OFFSET_TURK, 3600);

    //-----------------------------------------------------------------------
    public void test_MockTurkIsCorrect() {__CLR4_4_1jbejbelc8azugb.R.globalSliceStart(getClass().getName(),25179);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gjm8zujff();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jbejbelc8azugb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jbejbelc8azugb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_MockTurkIsCorrect",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25179,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gjm8zujff(){try{__CLR4_4_1jbejbelc8azugb.R.inc(25179);
        __CLR4_4_1jbejbelc8azugb.R.inc(25180);DateTime pre = new DateTime(CUTOVER_TURK - 1L, MOCK_TURK);
        __CLR4_4_1jbejbelc8azugb.R.inc(25181);assertEquals("2007-03-31T23:59:59.999-05:00", pre.toString());
        __CLR4_4_1jbejbelc8azugb.R.inc(25182);DateTime at = new DateTime(CUTOVER_TURK, MOCK_TURK);
        __CLR4_4_1jbejbelc8azugb.R.inc(25183);assertEquals("2007-04-01T01:00:00.000-04:00", at.toString());
        __CLR4_4_1jbejbelc8azugb.R.inc(25184);DateTime post = new DateTime(CUTOVER_TURK + 1L, MOCK_TURK);
        __CLR4_4_1jbejbelc8azugb.R.inc(25185);assertEquals("2007-04-01T01:00:00.001-04:00", post.toString());
    }finally{__CLR4_4_1jbejbelc8azugb.R.flushNeeded();}}

    public void test_getOffsetFromLocal_Turk() {__CLR4_4_1jbejbelc8azugb.R.globalSliceStart(getClass().getName(),25186);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qycsedjfm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jbejbelc8azugb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jbejbelc8azugb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_getOffsetFromLocal_Turk",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25186,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qycsedjfm(){try{__CLR4_4_1jbejbelc8azugb.R.inc(25186);
        __CLR4_4_1jbejbelc8azugb.R.inc(25187);doTest_getOffsetFromLocal_Turk(-1, 23, 0, "2007-03-31T23:00:00.000-05:00");
        __CLR4_4_1jbejbelc8azugb.R.inc(25188);doTest_getOffsetFromLocal_Turk(-1, 23, 30, "2007-03-31T23:30:00.000-05:00");
        __CLR4_4_1jbejbelc8azugb.R.inc(25189);doTest_getOffsetFromLocal_Turk(0, 0, 0, "2007-04-01T01:00:00.000-04:00");
        __CLR4_4_1jbejbelc8azugb.R.inc(25190);doTest_getOffsetFromLocal_Turk(0, 0, 30, "2007-04-01T01:30:00.000-04:00");
        __CLR4_4_1jbejbelc8azugb.R.inc(25191);doTest_getOffsetFromLocal_Turk(0, 1, 0, "2007-04-01T01:00:00.000-04:00");
        __CLR4_4_1jbejbelc8azugb.R.inc(25192);doTest_getOffsetFromLocal_Turk(0, 1, 30, "2007-04-01T01:30:00.000-04:00");
        __CLR4_4_1jbejbelc8azugb.R.inc(25193);doTest_getOffsetFromLocal_Turk(0, 2, 0, "2007-04-01T02:00:00.000-04:00");
        __CLR4_4_1jbejbelc8azugb.R.inc(25194);doTest_getOffsetFromLocal_Turk(0, 3, 0, "2007-04-01T03:00:00.000-04:00");
        __CLR4_4_1jbejbelc8azugb.R.inc(25195);doTest_getOffsetFromLocal_Turk(0, 4, 0, "2007-04-01T04:00:00.000-04:00");
        __CLR4_4_1jbejbelc8azugb.R.inc(25196);doTest_getOffsetFromLocal_Turk(0, 5, 0, "2007-04-01T05:00:00.000-04:00");
        __CLR4_4_1jbejbelc8azugb.R.inc(25197);doTest_getOffsetFromLocal_Turk(0, 6, 0, "2007-04-01T06:00:00.000-04:00");
    }finally{__CLR4_4_1jbejbelc8azugb.R.flushNeeded();}}

    private void doTest_getOffsetFromLocal_Turk(int days, int hour, int min, String expected) {try{__CLR4_4_1jbejbelc8azugb.R.inc(25198);
        __CLR4_4_1jbejbelc8azugb.R.inc(25199);DateTime dt = new DateTime(2007, 4, 1, hour, min, 0, 0, DateTimeZone.UTC).plusDays(days);
        __CLR4_4_1jbejbelc8azugb.R.inc(25200);int offset = MOCK_TURK.getOffsetFromLocal(dt.getMillis());
        __CLR4_4_1jbejbelc8azugb.R.inc(25201);DateTime res = new DateTime(dt.getMillis() - offset, MOCK_TURK);
        __CLR4_4_1jbejbelc8azugb.R.inc(25202);assertEquals(res.toString(), expected, res.toString());
    }finally{__CLR4_4_1jbejbelc8azugb.R.flushNeeded();}}

    public void test_DateTime_roundFloor_Turk() {__CLR4_4_1jbejbelc8azugb.R.globalSliceStart(getClass().getName(),25203);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1da9x91jg3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jbejbelc8azugb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jbejbelc8azugb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_DateTime_roundFloor_Turk",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25203,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1da9x91jg3(){try{__CLR4_4_1jbejbelc8azugb.R.inc(25203);
        __CLR4_4_1jbejbelc8azugb.R.inc(25204);DateTime dt = new DateTime(2007, 4, 1, 8, 0, 0, 0, MOCK_TURK);
        __CLR4_4_1jbejbelc8azugb.R.inc(25205);assertEquals("2007-04-01T08:00:00.000-04:00", dt.toString());
        __CLR4_4_1jbejbelc8azugb.R.inc(25206);DateTime rounded = dt.dayOfMonth().roundFloorCopy();
        __CLR4_4_1jbejbelc8azugb.R.inc(25207);assertEquals("2007-04-01T01:00:00.000-04:00", rounded.toString());
    }finally{__CLR4_4_1jbejbelc8azugb.R.flushNeeded();}}

    public void test_DateTime_roundFloorNotDST_Turk() {__CLR4_4_1jbejbelc8azugb.R.globalSliceStart(getClass().getName(),25208);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_140ic9ljg8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jbejbelc8azugb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jbejbelc8azugb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_DateTime_roundFloorNotDST_Turk",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25208,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_140ic9ljg8(){try{__CLR4_4_1jbejbelc8azugb.R.inc(25208);
        __CLR4_4_1jbejbelc8azugb.R.inc(25209);DateTime dt = new DateTime(2007, 4, 2, 8, 0, 0, 0, MOCK_TURK);
        __CLR4_4_1jbejbelc8azugb.R.inc(25210);assertEquals("2007-04-02T08:00:00.000-04:00", dt.toString());
        __CLR4_4_1jbejbelc8azugb.R.inc(25211);DateTime rounded = dt.dayOfMonth().roundFloorCopy();
        __CLR4_4_1jbejbelc8azugb.R.inc(25212);assertEquals("2007-04-02T00:00:00.000-04:00", rounded.toString());
    }finally{__CLR4_4_1jbejbelc8azugb.R.flushNeeded();}}

    public void test_DateTime_roundCeiling_Turk() {__CLR4_4_1jbejbelc8azugb.R.globalSliceStart(getClass().getName(),25213);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1x2cv9ijgd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jbejbelc8azugb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jbejbelc8azugb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_DateTime_roundCeiling_Turk",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25213,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1x2cv9ijgd(){try{__CLR4_4_1jbejbelc8azugb.R.inc(25213);
        __CLR4_4_1jbejbelc8azugb.R.inc(25214);DateTime dt = new DateTime(2007, 3, 31, 20, 0, 0, 0, MOCK_TURK);
        __CLR4_4_1jbejbelc8azugb.R.inc(25215);assertEquals("2007-03-31T20:00:00.000-05:00", dt.toString());
        __CLR4_4_1jbejbelc8azugb.R.inc(25216);DateTime rounded = dt.dayOfMonth().roundCeilingCopy();
        __CLR4_4_1jbejbelc8azugb.R.inc(25217);assertEquals("2007-04-01T01:00:00.000-04:00", rounded.toString());
    }finally{__CLR4_4_1jbejbelc8azugb.R.flushNeeded();}}

    public void test_DateTime_setHourZero_Turk() {__CLR4_4_1jbejbelc8azugb.R.globalSliceStart(getClass().getName(),25218);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1oy32afjgi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jbejbelc8azugb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jbejbelc8azugb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_DateTime_setHourZero_Turk",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25218,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1oy32afjgi(){try{__CLR4_4_1jbejbelc8azugb.R.inc(25218);
        __CLR4_4_1jbejbelc8azugb.R.inc(25219);DateTime dt = new DateTime(2007, 4, 1, 8, 0, 0, 0, MOCK_TURK);
        __CLR4_4_1jbejbelc8azugb.R.inc(25220);assertEquals("2007-04-01T08:00:00.000-04:00", dt.toString());
        __CLR4_4_1jbejbelc8azugb.R.inc(25221);try {
            __CLR4_4_1jbejbelc8azugb.R.inc(25222);dt.hourOfDay().setCopy(0);
            __CLR4_4_1jbejbelc8azugb.R.inc(25223);fail();
        } catch (IllegalFieldValueException ex) {
            // expected
        }
    }finally{__CLR4_4_1jbejbelc8azugb.R.flushNeeded();}}

    public void test_DateTime_withHourZero_Turk() {__CLR4_4_1jbejbelc8azugb.R.globalSliceStart(getClass().getName(),25224);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16esymhjgo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jbejbelc8azugb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jbejbelc8azugb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_DateTime_withHourZero_Turk",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25224,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16esymhjgo(){try{__CLR4_4_1jbejbelc8azugb.R.inc(25224);
        __CLR4_4_1jbejbelc8azugb.R.inc(25225);DateTime dt = new DateTime(2007, 4, 1, 8, 0, 0, 0, MOCK_TURK);
        __CLR4_4_1jbejbelc8azugb.R.inc(25226);assertEquals("2007-04-01T08:00:00.000-04:00", dt.toString());
        __CLR4_4_1jbejbelc8azugb.R.inc(25227);try {
            __CLR4_4_1jbejbelc8azugb.R.inc(25228);dt.withHourOfDay(0);
            __CLR4_4_1jbejbelc8azugb.R.inc(25229);fail();
        } catch (IllegalFieldValueException ex) {
            // expected
        }
    }finally{__CLR4_4_1jbejbelc8azugb.R.flushNeeded();}}

    public void test_DateTime_withDay_Turk() {__CLR4_4_1jbejbelc8azugb.R.globalSliceStart(getClass().getName(),25230);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1luba01jgu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jbejbelc8azugb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jbejbelc8azugb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_DateTime_withDay_Turk",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25230,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1luba01jgu(){try{__CLR4_4_1jbejbelc8azugb.R.inc(25230);
        __CLR4_4_1jbejbelc8azugb.R.inc(25231);DateTime dt = new DateTime(2007, 4, 2, 0, 0, 0, 0, MOCK_TURK);
        __CLR4_4_1jbejbelc8azugb.R.inc(25232);assertEquals("2007-04-02T00:00:00.000-04:00", dt.toString());
        __CLR4_4_1jbejbelc8azugb.R.inc(25233);DateTime res = dt.withDayOfMonth(1);
        __CLR4_4_1jbejbelc8azugb.R.inc(25234);assertEquals("2007-04-01T01:00:00.000-04:00", res.toString());
    }finally{__CLR4_4_1jbejbelc8azugb.R.flushNeeded();}}

    public void test_DateTime_minusHour_Turk() {__CLR4_4_1jbejbelc8azugb.R.globalSliceStart(getClass().getName(),25235);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nrh2n7jgz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jbejbelc8azugb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jbejbelc8azugb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_DateTime_minusHour_Turk",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25235,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nrh2n7jgz(){try{__CLR4_4_1jbejbelc8azugb.R.inc(25235);
        __CLR4_4_1jbejbelc8azugb.R.inc(25236);DateTime dt = new DateTime(2007, 4, 1, 8, 0, 0, 0, MOCK_TURK);
        __CLR4_4_1jbejbelc8azugb.R.inc(25237);assertEquals("2007-04-01T08:00:00.000-04:00", dt.toString());
        
        __CLR4_4_1jbejbelc8azugb.R.inc(25238);DateTime minus7 = dt.minusHours(7);
        __CLR4_4_1jbejbelc8azugb.R.inc(25239);assertEquals("2007-04-01T01:00:00.000-04:00", minus7.toString());
        __CLR4_4_1jbejbelc8azugb.R.inc(25240);DateTime minus8 = dt.minusHours(8);
        __CLR4_4_1jbejbelc8azugb.R.inc(25241);assertEquals("2007-03-31T23:00:00.000-05:00", minus8.toString());
        __CLR4_4_1jbejbelc8azugb.R.inc(25242);DateTime minus9 = dt.minusHours(9);
        __CLR4_4_1jbejbelc8azugb.R.inc(25243);assertEquals("2007-03-31T22:00:00.000-05:00", minus9.toString());
    }finally{__CLR4_4_1jbejbelc8azugb.R.flushNeeded();}}

    public void test_DateTime_plusHour_Turk() {__CLR4_4_1jbejbelc8azugb.R.globalSliceStart(getClass().getName(),25244);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fduzf9jh8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jbejbelc8azugb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jbejbelc8azugb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_DateTime_plusHour_Turk",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25244,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fduzf9jh8(){try{__CLR4_4_1jbejbelc8azugb.R.inc(25244);
        __CLR4_4_1jbejbelc8azugb.R.inc(25245);DateTime dt = new DateTime(2007, 3, 31, 16, 0, 0, 0, MOCK_TURK);
        __CLR4_4_1jbejbelc8azugb.R.inc(25246);assertEquals("2007-03-31T16:00:00.000-05:00", dt.toString());
        
        __CLR4_4_1jbejbelc8azugb.R.inc(25247);DateTime plus7 = dt.plusHours(7);
        __CLR4_4_1jbejbelc8azugb.R.inc(25248);assertEquals("2007-03-31T23:00:00.000-05:00", plus7.toString());
        __CLR4_4_1jbejbelc8azugb.R.inc(25249);DateTime plus8 = dt.plusHours(8);
        __CLR4_4_1jbejbelc8azugb.R.inc(25250);assertEquals("2007-04-01T01:00:00.000-04:00", plus8.toString());
        __CLR4_4_1jbejbelc8azugb.R.inc(25251);DateTime plus9 = dt.plusHours(9);
        __CLR4_4_1jbejbelc8azugb.R.inc(25252);assertEquals("2007-04-01T02:00:00.000-04:00", plus9.toString());
    }finally{__CLR4_4_1jbejbelc8azugb.R.flushNeeded();}}

    public void test_DateTime_minusDay_Turk() {__CLR4_4_1jbejbelc8azugb.R.globalSliceStart(getClass().getName(),25253);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14vi3lvjhh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jbejbelc8azugb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jbejbelc8azugb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_DateTime_minusDay_Turk",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25253,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14vi3lvjhh(){try{__CLR4_4_1jbejbelc8azugb.R.inc(25253);
        __CLR4_4_1jbejbelc8azugb.R.inc(25254);DateTime dt = new DateTime(2007, 4, 2, 0, 0, 0, 0, MOCK_TURK);
        __CLR4_4_1jbejbelc8azugb.R.inc(25255);assertEquals("2007-04-02T00:00:00.000-04:00", dt.toString());
        
        __CLR4_4_1jbejbelc8azugb.R.inc(25256);DateTime minus1 = dt.minusDays(1);
        __CLR4_4_1jbejbelc8azugb.R.inc(25257);assertEquals("2007-04-01T01:00:00.000-04:00", minus1.toString());
        __CLR4_4_1jbejbelc8azugb.R.inc(25258);DateTime minus2 = dt.minusDays(2);
        __CLR4_4_1jbejbelc8azugb.R.inc(25259);assertEquals("2007-03-31T00:00:00.000-05:00", minus2.toString());
    }finally{__CLR4_4_1jbejbelc8azugb.R.flushNeeded();}}

    public void test_DateTime_plusDay_Turk() {__CLR4_4_1jbejbelc8azugb.R.globalSliceStart(getClass().getName(),25260);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1m6dljfjho();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jbejbelc8azugb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jbejbelc8azugb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_DateTime_plusDay_Turk",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25260,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1m6dljfjho(){try{__CLR4_4_1jbejbelc8azugb.R.inc(25260);
        __CLR4_4_1jbejbelc8azugb.R.inc(25261);DateTime dt = new DateTime(2007, 3, 31, 0, 0, 0, 0, MOCK_TURK);
        __CLR4_4_1jbejbelc8azugb.R.inc(25262);assertEquals("2007-03-31T00:00:00.000-05:00", dt.toString());
        
        __CLR4_4_1jbejbelc8azugb.R.inc(25263);DateTime plus1 = dt.plusDays(1);
        __CLR4_4_1jbejbelc8azugb.R.inc(25264);assertEquals("2007-04-01T01:00:00.000-04:00", plus1.toString());
        __CLR4_4_1jbejbelc8azugb.R.inc(25265);DateTime plus2 = dt.plusDays(2);
        __CLR4_4_1jbejbelc8azugb.R.inc(25266);assertEquals("2007-04-02T00:00:00.000-04:00", plus2.toString());
    }finally{__CLR4_4_1jbejbelc8azugb.R.flushNeeded();}}

    public void test_DateTime_plusDayMidGap_Turk() {__CLR4_4_1jbejbelc8azugb.R.globalSliceStart(getClass().getName(),25267);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15dljixjhv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jbejbelc8azugb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jbejbelc8azugb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_DateTime_plusDayMidGap_Turk",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25267,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15dljixjhv(){try{__CLR4_4_1jbejbelc8azugb.R.inc(25267);
        __CLR4_4_1jbejbelc8azugb.R.inc(25268);DateTime dt = new DateTime(2007, 3, 31, 0, 30, 0, 0, MOCK_TURK);
        __CLR4_4_1jbejbelc8azugb.R.inc(25269);assertEquals("2007-03-31T00:30:00.000-05:00", dt.toString());
        
        __CLR4_4_1jbejbelc8azugb.R.inc(25270);DateTime plus1 = dt.plusDays(1);
        __CLR4_4_1jbejbelc8azugb.R.inc(25271);assertEquals("2007-04-01T01:30:00.000-04:00", plus1.toString());
        __CLR4_4_1jbejbelc8azugb.R.inc(25272);DateTime plus2 = dt.plusDays(2);
        __CLR4_4_1jbejbelc8azugb.R.inc(25273);assertEquals("2007-04-02T00:30:00.000-04:00", plus2.toString());
    }finally{__CLR4_4_1jbejbelc8azugb.R.flushNeeded();}}

    public void test_DateTime_addWrapFieldDay_Turk() {__CLR4_4_1jbejbelc8azugb.R.globalSliceStart(getClass().getName(),25274);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pwuzbqji2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jbejbelc8azugb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jbejbelc8azugb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_DateTime_addWrapFieldDay_Turk",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25274,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pwuzbqji2(){try{__CLR4_4_1jbejbelc8azugb.R.inc(25274);
        __CLR4_4_1jbejbelc8azugb.R.inc(25275);DateTime dt = new DateTime(2007, 4, 30, 0, 0, 0, 0, MOCK_TURK);
        __CLR4_4_1jbejbelc8azugb.R.inc(25276);assertEquals("2007-04-30T00:00:00.000-04:00", dt.toString());
        
        __CLR4_4_1jbejbelc8azugb.R.inc(25277);DateTime plus1 = dt.dayOfMonth().addWrapFieldToCopy(1);
        __CLR4_4_1jbejbelc8azugb.R.inc(25278);assertEquals("2007-04-01T01:00:00.000-04:00", plus1.toString());
        __CLR4_4_1jbejbelc8azugb.R.inc(25279);DateTime plus2 = dt.dayOfMonth().addWrapFieldToCopy(2);
        __CLR4_4_1jbejbelc8azugb.R.inc(25280);assertEquals("2007-04-02T00:00:00.000-04:00", plus2.toString());
    }finally{__CLR4_4_1jbejbelc8azugb.R.flushNeeded();}}

    public void test_DateTime_withZoneRetainFields_Turk() {__CLR4_4_1jbejbelc8azugb.R.globalSliceStart(getClass().getName(),25281);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1zrfg9ji9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jbejbelc8azugb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jbejbelc8azugb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_DateTime_withZoneRetainFields_Turk",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25281,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1zrfg9ji9(){try{__CLR4_4_1jbejbelc8azugb.R.inc(25281);
        __CLR4_4_1jbejbelc8azugb.R.inc(25282);DateTime dt = new DateTime(2007, 4, 1, 0, 0, 0, 0, DateTimeZone.UTC);
        __CLR4_4_1jbejbelc8azugb.R.inc(25283);assertEquals("2007-04-01T00:00:00.000Z", dt.toString());
        
        __CLR4_4_1jbejbelc8azugb.R.inc(25284);DateTime res = dt.withZoneRetainFields(MOCK_TURK);
        __CLR4_4_1jbejbelc8azugb.R.inc(25285);assertEquals("2007-04-01T01:00:00.000-04:00", res.toString());
    }finally{__CLR4_4_1jbejbelc8azugb.R.flushNeeded();}}

    public void test_MutableDateTime_setZoneRetainFields_Turk() {__CLR4_4_1jbejbelc8azugb.R.globalSliceStart(getClass().getName(),25286);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12sezj5jie();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jbejbelc8azugb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jbejbelc8azugb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_MutableDateTime_setZoneRetainFields_Turk",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25286,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12sezj5jie(){try{__CLR4_4_1jbejbelc8azugb.R.inc(25286);
        __CLR4_4_1jbejbelc8azugb.R.inc(25287);MutableDateTime dt = new MutableDateTime(2007, 4, 1, 0, 0, 0, 0, DateTimeZone.UTC);
        __CLR4_4_1jbejbelc8azugb.R.inc(25288);assertEquals("2007-04-01T00:00:00.000Z", dt.toString());
        
        __CLR4_4_1jbejbelc8azugb.R.inc(25289);dt.setZoneRetainFields(MOCK_TURK);
        __CLR4_4_1jbejbelc8azugb.R.inc(25290);assertEquals("2007-04-01T01:00:00.000-04:00", dt.toString());
    }finally{__CLR4_4_1jbejbelc8azugb.R.flushNeeded();}}

    public void test_LocalDate_new_Turk() {__CLR4_4_1jbejbelc8azugb.R.globalSliceStart(getClass().getName(),25291);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19s6btfjij();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jbejbelc8azugb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jbejbelc8azugb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_LocalDate_new_Turk",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25291,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19s6btfjij(){try{__CLR4_4_1jbejbelc8azugb.R.inc(25291);
        __CLR4_4_1jbejbelc8azugb.R.inc(25292);LocalDate date1 = new LocalDate(CUTOVER_TURK, MOCK_TURK);
        __CLR4_4_1jbejbelc8azugb.R.inc(25293);assertEquals("2007-04-01", date1.toString());
        
        __CLR4_4_1jbejbelc8azugb.R.inc(25294);LocalDate date2 = new LocalDate(CUTOVER_TURK - 1, MOCK_TURK);
        __CLR4_4_1jbejbelc8azugb.R.inc(25295);assertEquals("2007-03-31", date2.toString());
    }finally{__CLR4_4_1jbejbelc8azugb.R.flushNeeded();}}

    public void test_LocalDate_toDateMidnight_Turk() {__CLR4_4_1jbejbelc8azugb.R.globalSliceStart(getClass().getName(),25296);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ewbkcjio();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jbejbelc8azugb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jbejbelc8azugb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_LocalDate_toDateMidnight_Turk",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25296,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ewbkcjio(){try{__CLR4_4_1jbejbelc8azugb.R.inc(25296);
        __CLR4_4_1jbejbelc8azugb.R.inc(25297);LocalDate date = new LocalDate(2007, 4, 1);
        __CLR4_4_1jbejbelc8azugb.R.inc(25298);try {
            __CLR4_4_1jbejbelc8azugb.R.inc(25299);date.toDateMidnight(MOCK_TURK);
            __CLR4_4_1jbejbelc8azugb.R.inc(25300);fail();
        } catch (IllegalInstantException ex) {
            __CLR4_4_1jbejbelc8azugb.R.inc(25301);assertEquals(true, ex.getMessage().startsWith("Illegal instant due to time zone offset transition"));
        }
    }finally{__CLR4_4_1jbejbelc8azugb.R.flushNeeded();}}

    public void test_DateTime_new_Turk() {__CLR4_4_1jbejbelc8azugb.R.globalSliceStart(getClass().getName(),25302);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yrttjjiu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jbejbelc8azugb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jbejbelc8azugb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_DateTime_new_Turk",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25302,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yrttjjiu(){try{__CLR4_4_1jbejbelc8azugb.R.inc(25302);
        __CLR4_4_1jbejbelc8azugb.R.inc(25303);try {
            __CLR4_4_1jbejbelc8azugb.R.inc(25304);new DateTime(2007, 4, 1, 0, 0, 0, 0, MOCK_TURK);
            __CLR4_4_1jbejbelc8azugb.R.inc(25305);fail();
        } catch (IllegalInstantException ex) {
            __CLR4_4_1jbejbelc8azugb.R.inc(25306);assertEquals(true, ex.getMessage().indexOf("Illegal instant due to time zone offset transition") >= 0);
        }
    }finally{__CLR4_4_1jbejbelc8azugb.R.flushNeeded();}}

    public void test_DateTime_newValid_Turk() {__CLR4_4_1jbejbelc8azugb.R.globalSliceStart(getClass().getName(),25307);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16trc37jiz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jbejbelc8azugb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jbejbelc8azugb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_DateTime_newValid_Turk",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25307,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16trc37jiz(){try{__CLR4_4_1jbejbelc8azugb.R.inc(25307);
        __CLR4_4_1jbejbelc8azugb.R.inc(25308);new DateTime(2007, 3, 31, 23, 0, 0, 0, MOCK_TURK);
        __CLR4_4_1jbejbelc8azugb.R.inc(25309);new DateTime(2007, 4, 1, 1, 0, 0, 0, MOCK_TURK);
        __CLR4_4_1jbejbelc8azugb.R.inc(25310);new DateTime(2007, 4, 1, 2, 0, 0, 0, MOCK_TURK);
        __CLR4_4_1jbejbelc8azugb.R.inc(25311);new DateTime(2007, 4, 1, 3, 0, 0, 0, MOCK_TURK);
        __CLR4_4_1jbejbelc8azugb.R.inc(25312);new DateTime(2007, 4, 1, 4, 0, 0, 0, MOCK_TURK);
        __CLR4_4_1jbejbelc8azugb.R.inc(25313);new DateTime(2007, 4, 1, 5, 0, 0, 0, MOCK_TURK);
        __CLR4_4_1jbejbelc8azugb.R.inc(25314);new DateTime(2007, 4, 1, 6, 0, 0, 0, MOCK_TURK);
    }finally{__CLR4_4_1jbejbelc8azugb.R.flushNeeded();}}

    public void test_DateTime_parse_Turk() {__CLR4_4_1jbejbelc8azugb.R.globalSliceStart(getClass().getName(),25315);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1h4h1ycjj7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jbejbelc8azugb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jbejbelc8azugb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_DateTime_parse_Turk",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25315,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1h4h1ycjj7(){try{__CLR4_4_1jbejbelc8azugb.R.inc(25315);
        __CLR4_4_1jbejbelc8azugb.R.inc(25316);try {
            __CLR4_4_1jbejbelc8azugb.R.inc(25317);new DateTime("2007-04-01T00:00", MOCK_TURK);
            __CLR4_4_1jbejbelc8azugb.R.inc(25318);fail();
        } catch (IllegalInstantException ex) {
            __CLR4_4_1jbejbelc8azugb.R.inc(25319);assertEquals(true, ex.getMessage().indexOf("Illegal instant due to time zone offset transition") >= 0);
        }
    }finally{__CLR4_4_1jbejbelc8azugb.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    //-----------------------------------------------------------------------
    //-----------------------------------------------------------------------
    /** America/New_York cutover from 01:59 to 03:00 on 2007-03-11 */
    private static long CUTOVER_NEW_YORK_SPRING = 1173596400000L;  // 2007-03-11T03:00:00.000-04:00
    private static final DateTimeZone ZONE_NEW_YORK = DateTimeZone.forID("America/New_York");
//  DateTime x = new DateTime(2007, 1, 1, 0, 0, 0, 0, ZONE_NEW_YORK);
//  System.out.println(ZONE_NEW_YORK.nextTransition(x.getMillis()));
//  DateTime y = new DateTime(ZONE_NEW_YORK.nextTransition(x.getMillis()), ZONE_NEW_YORK);
//  System.out.println(y);

    //-----------------------------------------------------------------------
    public void test_NewYorkIsCorrect_Spring() {__CLR4_4_1jbejbelc8azugb.R.globalSliceStart(getClass().getName(),25320);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1k96ml1jjc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jbejbelc8azugb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jbejbelc8azugb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_NewYorkIsCorrect_Spring",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25320,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1k96ml1jjc(){try{__CLR4_4_1jbejbelc8azugb.R.inc(25320);
        __CLR4_4_1jbejbelc8azugb.R.inc(25321);DateTime pre = new DateTime(CUTOVER_NEW_YORK_SPRING - 1L, ZONE_NEW_YORK);
        __CLR4_4_1jbejbelc8azugb.R.inc(25322);assertEquals("2007-03-11T01:59:59.999-05:00", pre.toString());
        __CLR4_4_1jbejbelc8azugb.R.inc(25323);DateTime at = new DateTime(CUTOVER_NEW_YORK_SPRING, ZONE_NEW_YORK);
        __CLR4_4_1jbejbelc8azugb.R.inc(25324);assertEquals("2007-03-11T03:00:00.000-04:00", at.toString());
        __CLR4_4_1jbejbelc8azugb.R.inc(25325);DateTime post = new DateTime(CUTOVER_NEW_YORK_SPRING + 1L, ZONE_NEW_YORK);
        __CLR4_4_1jbejbelc8azugb.R.inc(25326);assertEquals("2007-03-11T03:00:00.001-04:00", post.toString());
    }finally{__CLR4_4_1jbejbelc8azugb.R.flushNeeded();}}

    public void test_getOffsetFromLocal_NewYork_Spring() {__CLR4_4_1jbejbelc8azugb.R.globalSliceStart(getClass().getName(),25327);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bbtr9ejjj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jbejbelc8azugb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jbejbelc8azugb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_getOffsetFromLocal_NewYork_Spring",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25327,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bbtr9ejjj(){try{__CLR4_4_1jbejbelc8azugb.R.inc(25327);
        __CLR4_4_1jbejbelc8azugb.R.inc(25328);doTest_getOffsetFromLocal(3, 11, 1, 0, "2007-03-11T01:00:00.000-05:00", ZONE_NEW_YORK);
        __CLR4_4_1jbejbelc8azugb.R.inc(25329);doTest_getOffsetFromLocal(3, 11, 1,30, "2007-03-11T01:30:00.000-05:00", ZONE_NEW_YORK);
        
        __CLR4_4_1jbejbelc8azugb.R.inc(25330);doTest_getOffsetFromLocal(3, 11, 2, 0, "2007-03-11T03:00:00.000-04:00", ZONE_NEW_YORK);
        __CLR4_4_1jbejbelc8azugb.R.inc(25331);doTest_getOffsetFromLocal(3, 11, 2,30, "2007-03-11T03:30:00.000-04:00", ZONE_NEW_YORK);
        
        __CLR4_4_1jbejbelc8azugb.R.inc(25332);doTest_getOffsetFromLocal(3, 11, 3, 0, "2007-03-11T03:00:00.000-04:00", ZONE_NEW_YORK);
        __CLR4_4_1jbejbelc8azugb.R.inc(25333);doTest_getOffsetFromLocal(3, 11, 3,30, "2007-03-11T03:30:00.000-04:00", ZONE_NEW_YORK);
        __CLR4_4_1jbejbelc8azugb.R.inc(25334);doTest_getOffsetFromLocal(3, 11, 4, 0, "2007-03-11T04:00:00.000-04:00", ZONE_NEW_YORK);
        __CLR4_4_1jbejbelc8azugb.R.inc(25335);doTest_getOffsetFromLocal(3, 11, 5, 0, "2007-03-11T05:00:00.000-04:00", ZONE_NEW_YORK);
        __CLR4_4_1jbejbelc8azugb.R.inc(25336);doTest_getOffsetFromLocal(3, 11, 6, 0, "2007-03-11T06:00:00.000-04:00", ZONE_NEW_YORK);
        __CLR4_4_1jbejbelc8azugb.R.inc(25337);doTest_getOffsetFromLocal(3, 11, 7, 0, "2007-03-11T07:00:00.000-04:00", ZONE_NEW_YORK);
        __CLR4_4_1jbejbelc8azugb.R.inc(25338);doTest_getOffsetFromLocal(3, 11, 8, 0, "2007-03-11T08:00:00.000-04:00", ZONE_NEW_YORK);
    }finally{__CLR4_4_1jbejbelc8azugb.R.flushNeeded();}}

    public void test_DateTime_setHourAcross_NewYork_Spring() {__CLR4_4_1jbejbelc8azugb.R.globalSliceStart(getClass().getName(),25339);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_152jlw5jjv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jbejbelc8azugb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jbejbelc8azugb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_DateTime_setHourAcross_NewYork_Spring",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25339,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_152jlw5jjv(){try{__CLR4_4_1jbejbelc8azugb.R.inc(25339);
        __CLR4_4_1jbejbelc8azugb.R.inc(25340);DateTime dt = new DateTime(2007, 3, 11, 0, 0, 0, 0, ZONE_NEW_YORK);
        __CLR4_4_1jbejbelc8azugb.R.inc(25341);assertEquals("2007-03-11T00:00:00.000-05:00", dt.toString());
        __CLR4_4_1jbejbelc8azugb.R.inc(25342);DateTime res = dt.hourOfDay().setCopy(4);
        __CLR4_4_1jbejbelc8azugb.R.inc(25343);assertEquals("2007-03-11T04:00:00.000-04:00", res.toString());
    }finally{__CLR4_4_1jbejbelc8azugb.R.flushNeeded();}}

    public void test_DateTime_setHourForward_NewYork_Spring() {__CLR4_4_1jbejbelc8azugb.R.globalSliceStart(getClass().getName(),25344);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19efg1fjk0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jbejbelc8azugb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jbejbelc8azugb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_DateTime_setHourForward_NewYork_Spring",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25344,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19efg1fjk0(){try{__CLR4_4_1jbejbelc8azugb.R.inc(25344);
        __CLR4_4_1jbejbelc8azugb.R.inc(25345);DateTime dt = new DateTime(2007, 3, 11, 0, 0, 0, 0, ZONE_NEW_YORK);
        __CLR4_4_1jbejbelc8azugb.R.inc(25346);assertEquals("2007-03-11T00:00:00.000-05:00", dt.toString());
        
        __CLR4_4_1jbejbelc8azugb.R.inc(25347);try {
            __CLR4_4_1jbejbelc8azugb.R.inc(25348);dt.hourOfDay().setCopy(2);
            __CLR4_4_1jbejbelc8azugb.R.inc(25349);fail();
        } catch (IllegalFieldValueException ex) {
            // expected
        }
    }finally{__CLR4_4_1jbejbelc8azugb.R.flushNeeded();}}

    public void test_DateTime_setHourBack_NewYork_Spring() {__CLR4_4_1jbejbelc8azugb.R.globalSliceStart(getClass().getName(),25350);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16h3azxjk6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jbejbelc8azugb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jbejbelc8azugb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_DateTime_setHourBack_NewYork_Spring",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25350,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16h3azxjk6(){try{__CLR4_4_1jbejbelc8azugb.R.inc(25350);
        __CLR4_4_1jbejbelc8azugb.R.inc(25351);DateTime dt = new DateTime(2007, 3, 11, 8, 0, 0, 0, ZONE_NEW_YORK);
        __CLR4_4_1jbejbelc8azugb.R.inc(25352);assertEquals("2007-03-11T08:00:00.000-04:00", dt.toString());
        
        __CLR4_4_1jbejbelc8azugb.R.inc(25353);try {
            __CLR4_4_1jbejbelc8azugb.R.inc(25354);dt.hourOfDay().setCopy(2);
            __CLR4_4_1jbejbelc8azugb.R.inc(25355);fail();
        } catch (IllegalFieldValueException ex) {
            // expected
        }
    }finally{__CLR4_4_1jbejbelc8azugb.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void test_DateTime_roundFloor_day_NewYork_Spring_preCutover() {__CLR4_4_1jbejbelc8azugb.R.globalSliceStart(getClass().getName(),25356);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nxxt73jkc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jbejbelc8azugb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jbejbelc8azugb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_DateTime_roundFloor_day_NewYork_Spring_preCutover",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25356,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nxxt73jkc(){try{__CLR4_4_1jbejbelc8azugb.R.inc(25356);
        __CLR4_4_1jbejbelc8azugb.R.inc(25357);DateTime dt = new DateTime(2007, 3, 11, 1, 30, 0, 0, ZONE_NEW_YORK);
        __CLR4_4_1jbejbelc8azugb.R.inc(25358);assertEquals("2007-03-11T01:30:00.000-05:00", dt.toString());
        __CLR4_4_1jbejbelc8azugb.R.inc(25359);DateTime rounded = dt.dayOfMonth().roundFloorCopy();
        __CLR4_4_1jbejbelc8azugb.R.inc(25360);assertEquals("2007-03-11T00:00:00.000-05:00", rounded.toString());
    }finally{__CLR4_4_1jbejbelc8azugb.R.flushNeeded();}}

    public void test_DateTime_roundFloor_day_NewYork_Spring_postCutover() {__CLR4_4_1jbejbelc8azugb.R.globalSliceStart(getClass().getName(),25361);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14qqc08jkh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jbejbelc8azugb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jbejbelc8azugb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_DateTime_roundFloor_day_NewYork_Spring_postCutover",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25361,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14qqc08jkh(){try{__CLR4_4_1jbejbelc8azugb.R.inc(25361);
        __CLR4_4_1jbejbelc8azugb.R.inc(25362);DateTime dt = new DateTime(2007, 3, 11, 3, 30, 0, 0, ZONE_NEW_YORK);
        __CLR4_4_1jbejbelc8azugb.R.inc(25363);assertEquals("2007-03-11T03:30:00.000-04:00", dt.toString());
        __CLR4_4_1jbejbelc8azugb.R.inc(25364);DateTime rounded = dt.dayOfMonth().roundFloorCopy();
        __CLR4_4_1jbejbelc8azugb.R.inc(25365);assertEquals("2007-03-11T00:00:00.000-05:00", rounded.toString());
    }finally{__CLR4_4_1jbejbelc8azugb.R.flushNeeded();}}

    public void test_DateTime_roundFloor_hour_NewYork_Spring_preCutover() {__CLR4_4_1jbejbelc8azugb.R.globalSliceStart(getClass().getName(),25366);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q0tnvvjkm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jbejbelc8azugb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jbejbelc8azugb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_DateTime_roundFloor_hour_NewYork_Spring_preCutover",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25366,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q0tnvvjkm(){try{__CLR4_4_1jbejbelc8azugb.R.inc(25366);
        __CLR4_4_1jbejbelc8azugb.R.inc(25367);DateTime dt = new DateTime(2007, 3, 11, 1, 30, 0, 0, ZONE_NEW_YORK);
        __CLR4_4_1jbejbelc8azugb.R.inc(25368);assertEquals("2007-03-11T01:30:00.000-05:00", dt.toString());
        __CLR4_4_1jbejbelc8azugb.R.inc(25369);DateTime rounded = dt.hourOfDay().roundFloorCopy();
        __CLR4_4_1jbejbelc8azugb.R.inc(25370);assertEquals("2007-03-11T01:00:00.000-05:00", rounded.toString());
    }finally{__CLR4_4_1jbejbelc8azugb.R.flushNeeded();}}

    public void test_DateTime_roundFloor_hour_NewYork_Spring_postCutover() {__CLR4_4_1jbejbelc8azugb.R.globalSliceStart(getClass().getName(),25371);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11syamsjkr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jbejbelc8azugb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jbejbelc8azugb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_DateTime_roundFloor_hour_NewYork_Spring_postCutover",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25371,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11syamsjkr(){try{__CLR4_4_1jbejbelc8azugb.R.inc(25371);
        __CLR4_4_1jbejbelc8azugb.R.inc(25372);DateTime dt = new DateTime(2007, 3, 11, 3, 30, 0, 0, ZONE_NEW_YORK);
        __CLR4_4_1jbejbelc8azugb.R.inc(25373);assertEquals("2007-03-11T03:30:00.000-04:00", dt.toString());
        __CLR4_4_1jbejbelc8azugb.R.inc(25374);DateTime rounded = dt.hourOfDay().roundFloorCopy();
        __CLR4_4_1jbejbelc8azugb.R.inc(25375);assertEquals("2007-03-11T03:00:00.000-04:00", rounded.toString());
    }finally{__CLR4_4_1jbejbelc8azugb.R.flushNeeded();}}

    public void test_DateTime_roundFloor_minute_NewYork_Spring_preCutover() {__CLR4_4_1jbejbelc8azugb.R.globalSliceStart(getClass().getName(),25376);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dr92xxjkw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jbejbelc8azugb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jbejbelc8azugb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_DateTime_roundFloor_minute_NewYork_Spring_preCutover",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25376,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dr92xxjkw(){try{__CLR4_4_1jbejbelc8azugb.R.inc(25376);
        __CLR4_4_1jbejbelc8azugb.R.inc(25377);DateTime dt = new DateTime(2007, 3, 11, 1, 30, 40, 0, ZONE_NEW_YORK);
        __CLR4_4_1jbejbelc8azugb.R.inc(25378);assertEquals("2007-03-11T01:30:40.000-05:00", dt.toString());
        __CLR4_4_1jbejbelc8azugb.R.inc(25379);DateTime rounded = dt.minuteOfHour().roundFloorCopy();
        __CLR4_4_1jbejbelc8azugb.R.inc(25380);assertEquals("2007-03-11T01:30:00.000-05:00", rounded.toString());
    }finally{__CLR4_4_1jbejbelc8azugb.R.flushNeeded();}}

    public void test_DateTime_roundFloor_minute_NewYork_Spring_postCutover() {__CLR4_4_1jbejbelc8azugb.R.globalSliceStart(getClass().getName(),25381);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rgegp0jl1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jbejbelc8azugb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jbejbelc8azugb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_DateTime_roundFloor_minute_NewYork_Spring_postCutover",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25381,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rgegp0jl1(){try{__CLR4_4_1jbejbelc8azugb.R.inc(25381);
        __CLR4_4_1jbejbelc8azugb.R.inc(25382);DateTime dt = new DateTime(2007, 3, 11, 3, 30, 40, 0, ZONE_NEW_YORK);
        __CLR4_4_1jbejbelc8azugb.R.inc(25383);assertEquals("2007-03-11T03:30:40.000-04:00", dt.toString());
        __CLR4_4_1jbejbelc8azugb.R.inc(25384);DateTime rounded = dt.minuteOfHour().roundFloorCopy();
        __CLR4_4_1jbejbelc8azugb.R.inc(25385);assertEquals("2007-03-11T03:30:00.000-04:00", rounded.toString());
    }finally{__CLR4_4_1jbejbelc8azugb.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void test_DateTime_roundCeiling_day_NewYork_Spring_preCutover() {__CLR4_4_1jbejbelc8azugb.R.globalSliceStart(getClass().getName(),25386);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sg8h9cjl6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jbejbelc8azugb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jbejbelc8azugb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_DateTime_roundCeiling_day_NewYork_Spring_preCutover",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25386,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sg8h9cjl6(){try{__CLR4_4_1jbejbelc8azugb.R.inc(25386);
        __CLR4_4_1jbejbelc8azugb.R.inc(25387);DateTime dt = new DateTime(2007, 3, 11, 1, 30, 0, 0, ZONE_NEW_YORK);
        __CLR4_4_1jbejbelc8azugb.R.inc(25388);assertEquals("2007-03-11T01:30:00.000-05:00", dt.toString());
        __CLR4_4_1jbejbelc8azugb.R.inc(25389);DateTime rounded = dt.dayOfMonth().roundCeilingCopy();
        __CLR4_4_1jbejbelc8azugb.R.inc(25390);assertEquals("2007-03-12T00:00:00.000-04:00", rounded.toString());
    }finally{__CLR4_4_1jbejbelc8azugb.R.flushNeeded();}}

    public void test_DateTime_roundCeiling_day_NewYork_Spring_postCutover() {__CLR4_4_1jbejbelc8azugb.R.globalSliceStart(getClass().getName(),25391);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1e8wlavjlb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jbejbelc8azugb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jbejbelc8azugb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_DateTime_roundCeiling_day_NewYork_Spring_postCutover",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25391,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1e8wlavjlb(){try{__CLR4_4_1jbejbelc8azugb.R.inc(25391);
        __CLR4_4_1jbejbelc8azugb.R.inc(25392);DateTime dt = new DateTime(2007, 3, 11, 3, 30, 0, 0, ZONE_NEW_YORK);
        __CLR4_4_1jbejbelc8azugb.R.inc(25393);assertEquals("2007-03-11T03:30:00.000-04:00", dt.toString());
        __CLR4_4_1jbejbelc8azugb.R.inc(25394);DateTime rounded = dt.dayOfMonth().roundCeilingCopy();
        __CLR4_4_1jbejbelc8azugb.R.inc(25395);assertEquals("2007-03-12T00:00:00.000-04:00", rounded.toString());
    }finally{__CLR4_4_1jbejbelc8azugb.R.flushNeeded();}}

    public void test_DateTime_roundCeiling_hour_NewYork_Spring_preCutover() {__CLR4_4_1jbejbelc8azugb.R.globalSliceStart(getClass().getName(),25396);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1zi44smjlg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jbejbelc8azugb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jbejbelc8azugb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_DateTime_roundCeiling_hour_NewYork_Spring_preCutover",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25396,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1zi44smjlg(){try{__CLR4_4_1jbejbelc8azugb.R.inc(25396);
        __CLR4_4_1jbejbelc8azugb.R.inc(25397);DateTime dt = new DateTime(2007, 3, 11, 1, 30, 0, 0, ZONE_NEW_YORK);
        __CLR4_4_1jbejbelc8azugb.R.inc(25398);assertEquals("2007-03-11T01:30:00.000-05:00", dt.toString());
        __CLR4_4_1jbejbelc8azugb.R.inc(25399);DateTime rounded = dt.hourOfDay().roundCeilingCopy();
        __CLR4_4_1jbejbelc8azugb.R.inc(25400);assertEquals("2007-03-11T03:00:00.000-04:00", rounded.toString());
    }finally{__CLR4_4_1jbejbelc8azugb.R.flushNeeded();}}

    public void test_DateTime_roundCeiling_hour_NewYork_Spring_postCutover() {__CLR4_4_1jbejbelc8azugb.R.globalSliceStart(getClass().getName(),25401);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18pzhmljll();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jbejbelc8azugb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jbejbelc8azugb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_DateTime_roundCeiling_hour_NewYork_Spring_postCutover",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25401,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18pzhmljll(){try{__CLR4_4_1jbejbelc8azugb.R.inc(25401);
        __CLR4_4_1jbejbelc8azugb.R.inc(25402);DateTime dt = new DateTime(2007, 3, 11, 3, 30, 0, 0, ZONE_NEW_YORK);
        __CLR4_4_1jbejbelc8azugb.R.inc(25403);assertEquals("2007-03-11T03:30:00.000-04:00", dt.toString());
        __CLR4_4_1jbejbelc8azugb.R.inc(25404);DateTime rounded = dt.hourOfDay().roundCeilingCopy();
        __CLR4_4_1jbejbelc8azugb.R.inc(25405);assertEquals("2007-03-11T04:00:00.000-04:00", rounded.toString());
    }finally{__CLR4_4_1jbejbelc8azugb.R.flushNeeded();}}

    public void test_DateTime_roundCeiling_minute_NewYork_Spring_preCutover() {__CLR4_4_1jbejbelc8azugb.R.globalSliceStart(getClass().getName(),25406);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sfe17ujlq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jbejbelc8azugb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jbejbelc8azugb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_DateTime_roundCeiling_minute_NewYork_Spring_preCutover",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25406,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sfe17ujlq(){try{__CLR4_4_1jbejbelc8azugb.R.inc(25406);
        __CLR4_4_1jbejbelc8azugb.R.inc(25407);DateTime dt = new DateTime(2007, 3, 11, 1, 30, 40, 0, ZONE_NEW_YORK);
        __CLR4_4_1jbejbelc8azugb.R.inc(25408);assertEquals("2007-03-11T01:30:40.000-05:00", dt.toString());
        __CLR4_4_1jbejbelc8azugb.R.inc(25409);DateTime rounded = dt.minuteOfHour().roundCeilingCopy();
        __CLR4_4_1jbejbelc8azugb.R.inc(25410);assertEquals("2007-03-11T01:31:00.000-05:00", rounded.toString());
    }finally{__CLR4_4_1jbejbelc8azugb.R.flushNeeded();}}

    public void test_DateTime_roundCeiling_minute_NewYork_Spring_postCutover() {__CLR4_4_1jbejbelc8azugb.R.globalSliceStart(getClass().getName(),25411);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11ph4p9jlv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jbejbelc8azugb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jbejbelc8azugb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_DateTime_roundCeiling_minute_NewYork_Spring_postCutover",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25411,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11ph4p9jlv(){try{__CLR4_4_1jbejbelc8azugb.R.inc(25411);
        __CLR4_4_1jbejbelc8azugb.R.inc(25412);DateTime dt = new DateTime(2007, 3, 11, 3, 30, 40, 0, ZONE_NEW_YORK);
        __CLR4_4_1jbejbelc8azugb.R.inc(25413);assertEquals("2007-03-11T03:30:40.000-04:00", dt.toString());
        __CLR4_4_1jbejbelc8azugb.R.inc(25414);DateTime rounded = dt.minuteOfHour().roundCeilingCopy();
        __CLR4_4_1jbejbelc8azugb.R.inc(25415);assertEquals("2007-03-11T03:31:00.000-04:00", rounded.toString());
    }finally{__CLR4_4_1jbejbelc8azugb.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /** America/New_York cutover from 01:59 to 01:00 on 2007-11-04 */
    private static long CUTOVER_NEW_YORK_AUTUMN = 1194156000000L;  // 2007-11-04T01:00:00.000-05:00

    //-----------------------------------------------------------------------
    public void test_NewYorkIsCorrect_Autumn() {__CLR4_4_1jbejbelc8azugb.R.globalSliceStart(getClass().getName(),25416);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_199bayqjm0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jbejbelc8azugb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jbejbelc8azugb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_NewYorkIsCorrect_Autumn",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25416,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_199bayqjm0(){try{__CLR4_4_1jbejbelc8azugb.R.inc(25416);
        __CLR4_4_1jbejbelc8azugb.R.inc(25417);DateTime pre = new DateTime(CUTOVER_NEW_YORK_AUTUMN - 1L, ZONE_NEW_YORK);
        __CLR4_4_1jbejbelc8azugb.R.inc(25418);assertEquals("2007-11-04T01:59:59.999-04:00", pre.toString());
        __CLR4_4_1jbejbelc8azugb.R.inc(25419);DateTime at = new DateTime(CUTOVER_NEW_YORK_AUTUMN, ZONE_NEW_YORK);
        __CLR4_4_1jbejbelc8azugb.R.inc(25420);assertEquals("2007-11-04T01:00:00.000-05:00", at.toString());
        __CLR4_4_1jbejbelc8azugb.R.inc(25421);DateTime post = new DateTime(CUTOVER_NEW_YORK_AUTUMN + 1L, ZONE_NEW_YORK);
        __CLR4_4_1jbejbelc8azugb.R.inc(25422);assertEquals("2007-11-04T01:00:00.001-05:00", post.toString());
    }finally{__CLR4_4_1jbejbelc8azugb.R.flushNeeded();}}

    public void test_getOffsetFromLocal_NewYork_Autumn() {__CLR4_4_1jbejbelc8azugb.R.globalSliceStart(getClass().getName(),25423);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1u6sd5zjm7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jbejbelc8azugb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jbejbelc8azugb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_getOffsetFromLocal_NewYork_Autumn",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25423,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1u6sd5zjm7(){try{__CLR4_4_1jbejbelc8azugb.R.inc(25423);
        __CLR4_4_1jbejbelc8azugb.R.inc(25424);doTest_getOffsetFromLocal(11, 4, 0, 0, "2007-11-04T00:00:00.000-04:00", ZONE_NEW_YORK);
        __CLR4_4_1jbejbelc8azugb.R.inc(25425);doTest_getOffsetFromLocal(11, 4, 0,30, "2007-11-04T00:30:00.000-04:00", ZONE_NEW_YORK);
        
        __CLR4_4_1jbejbelc8azugb.R.inc(25426);doTest_getOffsetFromLocal(11, 4, 1, 0, "2007-11-04T01:00:00.000-04:00", ZONE_NEW_YORK);
        __CLR4_4_1jbejbelc8azugb.R.inc(25427);doTest_getOffsetFromLocal(11, 4, 1,30, "2007-11-04T01:30:00.000-04:00", ZONE_NEW_YORK);
        
        __CLR4_4_1jbejbelc8azugb.R.inc(25428);doTest_getOffsetFromLocal(11, 4, 2, 0, "2007-11-04T02:00:00.000-05:00", ZONE_NEW_YORK);
        __CLR4_4_1jbejbelc8azugb.R.inc(25429);doTest_getOffsetFromLocal(11, 4, 2,30, "2007-11-04T02:30:00.000-05:00", ZONE_NEW_YORK);
        __CLR4_4_1jbejbelc8azugb.R.inc(25430);doTest_getOffsetFromLocal(11, 4, 3, 0, "2007-11-04T03:00:00.000-05:00", ZONE_NEW_YORK);
        __CLR4_4_1jbejbelc8azugb.R.inc(25431);doTest_getOffsetFromLocal(11, 4, 3,30, "2007-11-04T03:30:00.000-05:00", ZONE_NEW_YORK);
        __CLR4_4_1jbejbelc8azugb.R.inc(25432);doTest_getOffsetFromLocal(11, 4, 4, 0, "2007-11-04T04:00:00.000-05:00", ZONE_NEW_YORK);
        __CLR4_4_1jbejbelc8azugb.R.inc(25433);doTest_getOffsetFromLocal(11, 4, 5, 0, "2007-11-04T05:00:00.000-05:00", ZONE_NEW_YORK);
        __CLR4_4_1jbejbelc8azugb.R.inc(25434);doTest_getOffsetFromLocal(11, 4, 6, 0, "2007-11-04T06:00:00.000-05:00", ZONE_NEW_YORK);
        __CLR4_4_1jbejbelc8azugb.R.inc(25435);doTest_getOffsetFromLocal(11, 4, 7, 0, "2007-11-04T07:00:00.000-05:00", ZONE_NEW_YORK);
        __CLR4_4_1jbejbelc8azugb.R.inc(25436);doTest_getOffsetFromLocal(11, 4, 8, 0, "2007-11-04T08:00:00.000-05:00", ZONE_NEW_YORK);
    }finally{__CLR4_4_1jbejbelc8azugb.R.flushNeeded();}}

    public void test_DateTime_constructor_NewYork_Autumn() {__CLR4_4_1jbejbelc8azugb.R.globalSliceStart(getClass().getName(),25437);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16ks9pzjml();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jbejbelc8azugb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jbejbelc8azugb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_DateTime_constructor_NewYork_Autumn",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25437,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16ks9pzjml(){try{__CLR4_4_1jbejbelc8azugb.R.inc(25437);
        __CLR4_4_1jbejbelc8azugb.R.inc(25438);DateTime dt = new DateTime(2007, 11, 4, 1, 30, ZONE_NEW_YORK);
        __CLR4_4_1jbejbelc8azugb.R.inc(25439);assertEquals("2007-11-04T01:30:00.000-04:00", dt.toString());
    }finally{__CLR4_4_1jbejbelc8azugb.R.flushNeeded();}}

    public void test_DateTime_plusHour_NewYork_Autumn() {__CLR4_4_1jbejbelc8azugb.R.globalSliceStart(getClass().getName(),25440);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17mdorbjmo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jbejbelc8azugb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jbejbelc8azugb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_DateTime_plusHour_NewYork_Autumn",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25440,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17mdorbjmo(){try{__CLR4_4_1jbejbelc8azugb.R.inc(25440);
        __CLR4_4_1jbejbelc8azugb.R.inc(25441);DateTime dt = new DateTime(2007, 11, 3, 18, 0, 0, 0, ZONE_NEW_YORK);
        __CLR4_4_1jbejbelc8azugb.R.inc(25442);assertEquals("2007-11-03T18:00:00.000-04:00", dt.toString());
        
        __CLR4_4_1jbejbelc8azugb.R.inc(25443);DateTime plus6 = dt.plusHours(6);
        __CLR4_4_1jbejbelc8azugb.R.inc(25444);assertEquals("2007-11-04T00:00:00.000-04:00", plus6.toString());
        __CLR4_4_1jbejbelc8azugb.R.inc(25445);DateTime plus7 = dt.plusHours(7);
        __CLR4_4_1jbejbelc8azugb.R.inc(25446);assertEquals("2007-11-04T01:00:00.000-04:00", plus7.toString());
        __CLR4_4_1jbejbelc8azugb.R.inc(25447);DateTime plus8 = dt.plusHours(8);
        __CLR4_4_1jbejbelc8azugb.R.inc(25448);assertEquals("2007-11-04T01:00:00.000-05:00", plus8.toString());
        __CLR4_4_1jbejbelc8azugb.R.inc(25449);DateTime plus9 = dt.plusHours(9);
        __CLR4_4_1jbejbelc8azugb.R.inc(25450);assertEquals("2007-11-04T02:00:00.000-05:00", plus9.toString());
    }finally{__CLR4_4_1jbejbelc8azugb.R.flushNeeded();}}

    public void test_DateTime_minusHour_NewYork_Autumn() {__CLR4_4_1jbejbelc8azugb.R.globalSliceStart(getClass().getName(),25451);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1aimrjljmz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jbejbelc8azugb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jbejbelc8azugb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_DateTime_minusHour_NewYork_Autumn",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25451,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1aimrjljmz(){try{__CLR4_4_1jbejbelc8azugb.R.inc(25451);
        __CLR4_4_1jbejbelc8azugb.R.inc(25452);DateTime dt = new DateTime(2007, 11, 4, 8, 0, 0, 0, ZONE_NEW_YORK);
        __CLR4_4_1jbejbelc8azugb.R.inc(25453);assertEquals("2007-11-04T08:00:00.000-05:00", dt.toString());
        
        __CLR4_4_1jbejbelc8azugb.R.inc(25454);DateTime minus6 = dt.minusHours(6);
        __CLR4_4_1jbejbelc8azugb.R.inc(25455);assertEquals("2007-11-04T02:00:00.000-05:00", minus6.toString());
        __CLR4_4_1jbejbelc8azugb.R.inc(25456);DateTime minus7 = dt.minusHours(7);
        __CLR4_4_1jbejbelc8azugb.R.inc(25457);assertEquals("2007-11-04T01:00:00.000-05:00", minus7.toString());
        __CLR4_4_1jbejbelc8azugb.R.inc(25458);DateTime minus8 = dt.minusHours(8);
        __CLR4_4_1jbejbelc8azugb.R.inc(25459);assertEquals("2007-11-04T01:00:00.000-04:00", minus8.toString());
        __CLR4_4_1jbejbelc8azugb.R.inc(25460);DateTime minus9 = dt.minusHours(9);
        __CLR4_4_1jbejbelc8azugb.R.inc(25461);assertEquals("2007-11-04T00:00:00.000-04:00", minus9.toString());
    }finally{__CLR4_4_1jbejbelc8azugb.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void test_DateTime_roundFloor_day_NewYork_Autumn_preCutover() {__CLR4_4_1jbejbelc8azugb.R.globalSliceStart(getClass().getName(),25462);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1r0l6yijna();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jbejbelc8azugb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jbejbelc8azugb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_DateTime_roundFloor_day_NewYork_Autumn_preCutover",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25462,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1r0l6yijna(){try{__CLR4_4_1jbejbelc8azugb.R.inc(25462);
        __CLR4_4_1jbejbelc8azugb.R.inc(25463);DateTime dt = new DateTime(2007, 11, 4, 1, 30, 0, 0, ZONE_NEW_YORK);
        __CLR4_4_1jbejbelc8azugb.R.inc(25464);assertEquals("2007-11-04T01:30:00.000-04:00", dt.toString());
        __CLR4_4_1jbejbelc8azugb.R.inc(25465);DateTime rounded = dt.dayOfMonth().roundFloorCopy();
        __CLR4_4_1jbejbelc8azugb.R.inc(25466);assertEquals("2007-11-04T00:00:00.000-04:00", rounded.toString());
    }finally{__CLR4_4_1jbejbelc8azugb.R.flushNeeded();}}

    public void test_DateTime_roundFloor_day_NewYork_Autumn_postCutover() {__CLR4_4_1jbejbelc8azugb.R.globalSliceStart(getClass().getName(),25467);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cb5lcfjnf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jbejbelc8azugb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jbejbelc8azugb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_DateTime_roundFloor_day_NewYork_Autumn_postCutover",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25467,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cb5lcfjnf(){try{__CLR4_4_1jbejbelc8azugb.R.inc(25467);
        __CLR4_4_1jbejbelc8azugb.R.inc(25468);DateTime dt = new DateTime(2007, 11, 4, 1, 30, 0, 0, ZONE_NEW_YORK).plusHours(1);
        __CLR4_4_1jbejbelc8azugb.R.inc(25469);assertEquals("2007-11-04T01:30:00.000-05:00", dt.toString());
        __CLR4_4_1jbejbelc8azugb.R.inc(25470);DateTime rounded = dt.dayOfMonth().roundFloorCopy();
        __CLR4_4_1jbejbelc8azugb.R.inc(25471);assertEquals("2007-11-04T00:00:00.000-04:00", rounded.toString());
    }finally{__CLR4_4_1jbejbelc8azugb.R.flushNeeded();}}

    public void test_DateTime_roundFloor_hourOfDay_NewYork_Autumn_preCutover() {__CLR4_4_1jbejbelc8azugb.R.globalSliceStart(getClass().getName(),25472);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dhwhmzjnk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jbejbelc8azugb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jbejbelc8azugb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_DateTime_roundFloor_hourOfDay_NewYork_Autumn_preCutover",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25472,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dhwhmzjnk(){try{__CLR4_4_1jbejbelc8azugb.R.inc(25472);
        __CLR4_4_1jbejbelc8azugb.R.inc(25473);DateTime dt = new DateTime(2007, 11, 4, 1, 30, 0, 0, ZONE_NEW_YORK);
        __CLR4_4_1jbejbelc8azugb.R.inc(25474);assertEquals("2007-11-04T01:30:00.000-04:00", dt.toString());
        __CLR4_4_1jbejbelc8azugb.R.inc(25475);DateTime rounded = dt.hourOfDay().roundFloorCopy();
        __CLR4_4_1jbejbelc8azugb.R.inc(25476);assertEquals("2007-11-04T01:00:00.000-04:00", rounded.toString());
    }finally{__CLR4_4_1jbejbelc8azugb.R.flushNeeded();}}

    public void test_DateTime_roundFloor_hourOfDay_NewYork_Autumn_postCutover() {__CLR4_4_1jbejbelc8azugb.R.globalSliceStart(getClass().getName(),25477);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yxyeesjnp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jbejbelc8azugb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jbejbelc8azugb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_DateTime_roundFloor_hourOfDay_NewYork_Autumn_postCutover",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25477,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yxyeesjnp(){try{__CLR4_4_1jbejbelc8azugb.R.inc(25477);
        __CLR4_4_1jbejbelc8azugb.R.inc(25478);DateTime dt = new DateTime(2007, 11, 4, 1, 30, 0, 0, ZONE_NEW_YORK).plusHours(1);
        __CLR4_4_1jbejbelc8azugb.R.inc(25479);assertEquals("2007-11-04T01:30:00.000-05:00", dt.toString());
        __CLR4_4_1jbejbelc8azugb.R.inc(25480);DateTime rounded = dt.hourOfDay().roundFloorCopy();
        __CLR4_4_1jbejbelc8azugb.R.inc(25481);assertEquals("2007-11-04T01:00:00.000-05:00", rounded.toString());
    }finally{__CLR4_4_1jbejbelc8azugb.R.flushNeeded();}}

    public void test_DateTime_roundFloor_minuteOfHour_NewYork_Autumn_preCutover() {__CLR4_4_1jbejbelc8azugb.R.globalSliceStart(getClass().getName(),25482);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ce4gr7jnu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jbejbelc8azugb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jbejbelc8azugb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_DateTime_roundFloor_minuteOfHour_NewYork_Autumn_preCutover",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25482,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ce4gr7jnu(){try{__CLR4_4_1jbejbelc8azugb.R.inc(25482);
        __CLR4_4_1jbejbelc8azugb.R.inc(25483);DateTime dt = new DateTime(2007, 11, 4, 1, 30, 40, 0, ZONE_NEW_YORK);
        __CLR4_4_1jbejbelc8azugb.R.inc(25484);assertEquals("2007-11-04T01:30:40.000-04:00", dt.toString());
        __CLR4_4_1jbejbelc8azugb.R.inc(25485);DateTime rounded = dt.minuteOfHour().roundFloorCopy();
        __CLR4_4_1jbejbelc8azugb.R.inc(25486);assertEquals("2007-11-04T01:30:00.000-04:00", rounded.toString());
    }finally{__CLR4_4_1jbejbelc8azugb.R.flushNeeded();}}

    public void test_DateTime_roundFloor_minuteOfHour_NewYork_Autumn_postCutover() {__CLR4_4_1jbejbelc8azugb.R.globalSliceStart(getClass().getName(),25487);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1eukn3ejnz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jbejbelc8azugb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jbejbelc8azugb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_DateTime_roundFloor_minuteOfHour_NewYork_Autumn_postCutover",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25487,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1eukn3ejnz(){try{__CLR4_4_1jbejbelc8azugb.R.inc(25487);
        __CLR4_4_1jbejbelc8azugb.R.inc(25488);DateTime dt = new DateTime(2007, 11, 4, 1, 30, 40, 0, ZONE_NEW_YORK).plusHours(1);
        __CLR4_4_1jbejbelc8azugb.R.inc(25489);assertEquals("2007-11-04T01:30:40.000-05:00", dt.toString());
        __CLR4_4_1jbejbelc8azugb.R.inc(25490);DateTime rounded = dt.minuteOfHour().roundFloorCopy();
        __CLR4_4_1jbejbelc8azugb.R.inc(25491);assertEquals("2007-11-04T01:30:00.000-05:00", rounded.toString());
    }finally{__CLR4_4_1jbejbelc8azugb.R.flushNeeded();}}

    public void test_DateTime_roundFloor_secondOfMinute_NewYork_Autumn_preCutover() {__CLR4_4_1jbejbelc8azugb.R.globalSliceStart(getClass().getName(),25492);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1z19nctjo4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jbejbelc8azugb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jbejbelc8azugb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_DateTime_roundFloor_secondOfMinute_NewYork_Autumn_preCutover",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25492,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1z19nctjo4(){try{__CLR4_4_1jbejbelc8azugb.R.inc(25492);
        __CLR4_4_1jbejbelc8azugb.R.inc(25493);DateTime dt = new DateTime(2007, 11, 4, 1, 30, 40, 500, ZONE_NEW_YORK);
        __CLR4_4_1jbejbelc8azugb.R.inc(25494);assertEquals("2007-11-04T01:30:40.500-04:00", dt.toString());
        __CLR4_4_1jbejbelc8azugb.R.inc(25495);DateTime rounded = dt.secondOfMinute().roundFloorCopy();
        __CLR4_4_1jbejbelc8azugb.R.inc(25496);assertEquals("2007-11-04T01:30:40.000-04:00", rounded.toString());
    }finally{__CLR4_4_1jbejbelc8azugb.R.flushNeeded();}}

    public void test_DateTime_roundFloor_secondOfMinute_NewYork_Autumn_postCutover() {__CLR4_4_1jbejbelc8azugb.R.globalSliceStart(getClass().getName(),25497);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16jmyxyjo9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jbejbelc8azugb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jbejbelc8azugb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_DateTime_roundFloor_secondOfMinute_NewYork_Autumn_postCutover",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25497,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16jmyxyjo9(){try{__CLR4_4_1jbejbelc8azugb.R.inc(25497);
        __CLR4_4_1jbejbelc8azugb.R.inc(25498);DateTime dt = new DateTime(2007, 11, 4, 1, 30, 40, 500, ZONE_NEW_YORK).plusHours(1);
        __CLR4_4_1jbejbelc8azugb.R.inc(25499);assertEquals("2007-11-04T01:30:40.500-05:00", dt.toString());
        __CLR4_4_1jbejbelc8azugb.R.inc(25500);DateTime rounded = dt.secondOfMinute().roundFloorCopy();
        __CLR4_4_1jbejbelc8azugb.R.inc(25501);assertEquals("2007-11-04T01:30:40.000-05:00", rounded.toString());
    }finally{__CLR4_4_1jbejbelc8azugb.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void test_DateTime_roundCeiling_day_NewYork_Autumn_preCutover() {__CLR4_4_1jbejbelc8azugb.R.globalSliceStart(getClass().getName(),25502);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18dnfftjoe();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jbejbelc8azugb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jbejbelc8azugb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_DateTime_roundCeiling_day_NewYork_Autumn_preCutover",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25502,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18dnfftjoe(){try{__CLR4_4_1jbejbelc8azugb.R.inc(25502);
        __CLR4_4_1jbejbelc8azugb.R.inc(25503);DateTime dt = new DateTime(2007, 11, 4, 1, 30, 0, 0, ZONE_NEW_YORK);
        __CLR4_4_1jbejbelc8azugb.R.inc(25504);assertEquals("2007-11-04T01:30:00.000-04:00", dt.toString());
        __CLR4_4_1jbejbelc8azugb.R.inc(25505);DateTime rounded = dt.dayOfMonth().roundCeilingCopy();
        __CLR4_4_1jbejbelc8azugb.R.inc(25506);assertEquals("2007-11-05T00:00:00.000-05:00", rounded.toString());
    }finally{__CLR4_4_1jbejbelc8azugb.R.flushNeeded();}}

    public void test_DateTime_roundCeiling_day_NewYork_Autumn_postCutover() {__CLR4_4_1jbejbelc8azugb.R.globalSliceStart(getClass().getName(),25507);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12szc1sjoj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jbejbelc8azugb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jbejbelc8azugb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_DateTime_roundCeiling_day_NewYork_Autumn_postCutover",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25507,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12szc1sjoj(){try{__CLR4_4_1jbejbelc8azugb.R.inc(25507);
        __CLR4_4_1jbejbelc8azugb.R.inc(25508);DateTime dt = new DateTime(2007, 11, 4, 1, 30, 0, 0, ZONE_NEW_YORK).plusHours(1);
        __CLR4_4_1jbejbelc8azugb.R.inc(25509);assertEquals("2007-11-04T01:30:00.000-05:00", dt.toString());
        __CLR4_4_1jbejbelc8azugb.R.inc(25510);DateTime rounded = dt.dayOfMonth().roundCeilingCopy();
        __CLR4_4_1jbejbelc8azugb.R.inc(25511);assertEquals("2007-11-05T00:00:00.000-05:00", rounded.toString());
    }finally{__CLR4_4_1jbejbelc8azugb.R.flushNeeded();}}

    public void test_DateTime_roundCeiling_hourOfDay_NewYork_Autumn_preCutover() {__CLR4_4_1jbejbelc8azugb.R.globalSliceStart(getClass().getName(),25512);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ht717ojoo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jbejbelc8azugb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jbejbelc8azugb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_DateTime_roundCeiling_hourOfDay_NewYork_Autumn_preCutover",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25512,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ht717ojoo(){try{__CLR4_4_1jbejbelc8azugb.R.inc(25512);
        __CLR4_4_1jbejbelc8azugb.R.inc(25513);DateTime dt = new DateTime(2007, 11, 4, 1, 30, 0, 0, ZONE_NEW_YORK);
        __CLR4_4_1jbejbelc8azugb.R.inc(25514);assertEquals("2007-11-04T01:30:00.000-04:00", dt.toString());
        __CLR4_4_1jbejbelc8azugb.R.inc(25515);DateTime rounded = dt.hourOfDay().roundCeilingCopy();
        __CLR4_4_1jbejbelc8azugb.R.inc(25516);assertEquals("2007-11-04T01:00:00.000-05:00", rounded.toString());
    }finally{__CLR4_4_1jbejbelc8azugb.R.flushNeeded();}}

    public void test_DateTime_roundCeiling_hourOfDay_NewYork_Autumn_postCutover() {__CLR4_4_1jbejbelc8azugb.R.globalSliceStart(getClass().getName(),25517);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1b2ev51jot();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jbejbelc8azugb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jbejbelc8azugb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_DateTime_roundCeiling_hourOfDay_NewYork_Autumn_postCutover",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25517,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1b2ev51jot(){try{__CLR4_4_1jbejbelc8azugb.R.inc(25517);
        __CLR4_4_1jbejbelc8azugb.R.inc(25518);DateTime dt = new DateTime(2007, 11, 4, 1, 30, 0, 0, ZONE_NEW_YORK).plusHours(1);
        __CLR4_4_1jbejbelc8azugb.R.inc(25519);assertEquals("2007-11-04T01:30:00.000-05:00", dt.toString());
        __CLR4_4_1jbejbelc8azugb.R.inc(25520);DateTime rounded = dt.hourOfDay().roundCeilingCopy();
        __CLR4_4_1jbejbelc8azugb.R.inc(25521);assertEquals("2007-11-04T02:00:00.000-05:00", rounded.toString());
    }finally{__CLR4_4_1jbejbelc8azugb.R.flushNeeded();}}

    public void test_DateTime_roundCeiling_minuteOfHour_NewYork_Autumn_preCutover() {__CLR4_4_1jbejbelc8azugb.R.globalSliceStart(getClass().getName(),25522);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ad0ricjoy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jbejbelc8azugb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jbejbelc8azugb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_DateTime_roundCeiling_minuteOfHour_NewYork_Autumn_preCutover",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25522,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ad0ricjoy(){try{__CLR4_4_1jbejbelc8azugb.R.inc(25522);
        __CLR4_4_1jbejbelc8azugb.R.inc(25523);DateTime dt = new DateTime(2007, 11, 4, 1, 30, 40, 0, ZONE_NEW_YORK);
        __CLR4_4_1jbejbelc8azugb.R.inc(25524);assertEquals("2007-11-04T01:30:40.000-04:00", dt.toString());
        __CLR4_4_1jbejbelc8azugb.R.inc(25525);DateTime rounded = dt.minuteOfHour().roundCeilingCopy();
        __CLR4_4_1jbejbelc8azugb.R.inc(25526);assertEquals("2007-11-04T01:31:00.000-04:00", rounded.toString());
    }finally{__CLR4_4_1jbejbelc8azugb.R.flushNeeded();}}

    public void test_DateTime_roundCeiling_minuteOfHour_NewYork_Autumn_postCutover() {__CLR4_4_1jbejbelc8azugb.R.globalSliceStart(getClass().getName(),25527);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16rnbqzjp3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jbejbelc8azugb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jbejbelc8azugb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_DateTime_roundCeiling_minuteOfHour_NewYork_Autumn_postCutover",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25527,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16rnbqzjp3(){try{__CLR4_4_1jbejbelc8azugb.R.inc(25527);
        __CLR4_4_1jbejbelc8azugb.R.inc(25528);DateTime dt = new DateTime(2007, 11, 4, 1, 30, 40, 0, ZONE_NEW_YORK).plusHours(1);
        __CLR4_4_1jbejbelc8azugb.R.inc(25529);assertEquals("2007-11-04T01:30:40.000-05:00", dt.toString());
        __CLR4_4_1jbejbelc8azugb.R.inc(25530);DateTime rounded = dt.minuteOfHour().roundCeilingCopy();
        __CLR4_4_1jbejbelc8azugb.R.inc(25531);assertEquals("2007-11-04T01:31:00.000-05:00", rounded.toString());
    }finally{__CLR4_4_1jbejbelc8azugb.R.flushNeeded();}}

    public void test_DateTime_roundCeiling_secondOfMinute_NewYork_Autumn_preCutover() {__CLR4_4_1jbejbelc8azugb.R.globalSliceStart(getClass().getName(),25532);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12e2yesjp8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jbejbelc8azugb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jbejbelc8azugb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_DateTime_roundCeiling_secondOfMinute_NewYork_Autumn_preCutover",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25532,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12e2yesjp8(){try{__CLR4_4_1jbejbelc8azugb.R.inc(25532);
        __CLR4_4_1jbejbelc8azugb.R.inc(25533);DateTime dt = new DateTime(2007, 11, 4, 1, 30, 40, 500, ZONE_NEW_YORK);
        __CLR4_4_1jbejbelc8azugb.R.inc(25534);assertEquals("2007-11-04T01:30:40.500-04:00", dt.toString());
        __CLR4_4_1jbejbelc8azugb.R.inc(25535);DateTime rounded = dt.secondOfMinute().roundCeilingCopy();
        __CLR4_4_1jbejbelc8azugb.R.inc(25536);assertEquals("2007-11-04T01:30:41.000-04:00", rounded.toString());
    }finally{__CLR4_4_1jbejbelc8azugb.R.flushNeeded();}}

    public void test_DateTime_roundCeiling_secondOfMinute_NewYork_Autumn_postCutover() {__CLR4_4_1jbejbelc8azugb.R.globalSliceStart(getClass().getName(),25537);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1u9ou39jpd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jbejbelc8azugb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jbejbelc8azugb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_DateTime_roundCeiling_secondOfMinute_NewYork_Autumn_postCutover",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25537,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1u9ou39jpd(){try{__CLR4_4_1jbejbelc8azugb.R.inc(25537);
        __CLR4_4_1jbejbelc8azugb.R.inc(25538);DateTime dt = new DateTime(2007, 11, 4, 1, 30, 40, 500, ZONE_NEW_YORK).plusHours(1);
        __CLR4_4_1jbejbelc8azugb.R.inc(25539);assertEquals("2007-11-04T01:30:40.500-05:00", dt.toString());
        __CLR4_4_1jbejbelc8azugb.R.inc(25540);DateTime rounded = dt.secondOfMinute().roundCeilingCopy();
        __CLR4_4_1jbejbelc8azugb.R.inc(25541);assertEquals("2007-11-04T01:30:41.000-05:00", rounded.toString());
    }finally{__CLR4_4_1jbejbelc8azugb.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /** Europe/Moscow cutover from 01:59 to 03:00 on 2007-03-25 */
    private static long CUTOVER_MOSCOW_SPRING = 1174777200000L;  // 2007-03-25T03:00:00.000+04:00
    private static final DateTimeZone ZONE_MOSCOW = DateTimeZone.forID("Europe/Moscow");

    //-----------------------------------------------------------------------
    public void test_MoscowIsCorrect_Spring() {__CLR4_4_1jbejbelc8azugb.R.globalSliceStart(getClass().getName(),25542);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wzsxmujpi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jbejbelc8azugb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jbejbelc8azugb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_MoscowIsCorrect_Spring",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25542,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wzsxmujpi(){try{__CLR4_4_1jbejbelc8azugb.R.inc(25542);
//      DateTime x = new DateTime(2007, 7, 1, 0, 0, 0, 0, ZONE_MOSCOW);
//      System.out.println(ZONE_MOSCOW.nextTransition(x.getMillis()));
//      DateTime y = new DateTime(ZONE_MOSCOW.nextTransition(x.getMillis()), ZONE_MOSCOW);
//      System.out.println(y);
        __CLR4_4_1jbejbelc8azugb.R.inc(25543);DateTime pre = new DateTime(CUTOVER_MOSCOW_SPRING - 1L, ZONE_MOSCOW);
        __CLR4_4_1jbejbelc8azugb.R.inc(25544);assertEquals("2007-03-25T01:59:59.999+03:00", pre.toString());
        __CLR4_4_1jbejbelc8azugb.R.inc(25545);DateTime at = new DateTime(CUTOVER_MOSCOW_SPRING, ZONE_MOSCOW);
        __CLR4_4_1jbejbelc8azugb.R.inc(25546);assertEquals("2007-03-25T03:00:00.000+04:00", at.toString());
        __CLR4_4_1jbejbelc8azugb.R.inc(25547);DateTime post = new DateTime(CUTOVER_MOSCOW_SPRING + 1L, ZONE_MOSCOW);
        __CLR4_4_1jbejbelc8azugb.R.inc(25548);assertEquals("2007-03-25T03:00:00.001+04:00", post.toString());
    }finally{__CLR4_4_1jbejbelc8azugb.R.flushNeeded();}}

    public void test_getOffsetFromLocal_Moscow_Spring() {__CLR4_4_1jbejbelc8azugb.R.globalSliceStart(getClass().getName(),25549);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vshwhrjpp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jbejbelc8azugb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jbejbelc8azugb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_getOffsetFromLocal_Moscow_Spring",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25549,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vshwhrjpp(){try{__CLR4_4_1jbejbelc8azugb.R.inc(25549);
        __CLR4_4_1jbejbelc8azugb.R.inc(25550);doTest_getOffsetFromLocal(3, 25, 1, 0, "2007-03-25T01:00:00.000+03:00", ZONE_MOSCOW);
        __CLR4_4_1jbejbelc8azugb.R.inc(25551);doTest_getOffsetFromLocal(3, 25, 1,30, "2007-03-25T01:30:00.000+03:00", ZONE_MOSCOW);
        
        __CLR4_4_1jbejbelc8azugb.R.inc(25552);doTest_getOffsetFromLocal(3, 25, 2, 0, "2007-03-25T03:00:00.000+04:00", ZONE_MOSCOW);
        __CLR4_4_1jbejbelc8azugb.R.inc(25553);doTest_getOffsetFromLocal(3, 25, 2,30, "2007-03-25T03:30:00.000+04:00", ZONE_MOSCOW);
        
        __CLR4_4_1jbejbelc8azugb.R.inc(25554);doTest_getOffsetFromLocal(3, 25, 3, 0, "2007-03-25T03:00:00.000+04:00", ZONE_MOSCOW);
        __CLR4_4_1jbejbelc8azugb.R.inc(25555);doTest_getOffsetFromLocal(3, 25, 3,30, "2007-03-25T03:30:00.000+04:00", ZONE_MOSCOW);
        __CLR4_4_1jbejbelc8azugb.R.inc(25556);doTest_getOffsetFromLocal(3, 25, 4, 0, "2007-03-25T04:00:00.000+04:00", ZONE_MOSCOW);
        __CLR4_4_1jbejbelc8azugb.R.inc(25557);doTest_getOffsetFromLocal(3, 25, 5, 0, "2007-03-25T05:00:00.000+04:00", ZONE_MOSCOW);
        __CLR4_4_1jbejbelc8azugb.R.inc(25558);doTest_getOffsetFromLocal(3, 25, 6, 0, "2007-03-25T06:00:00.000+04:00", ZONE_MOSCOW);
        __CLR4_4_1jbejbelc8azugb.R.inc(25559);doTest_getOffsetFromLocal(3, 25, 7, 0, "2007-03-25T07:00:00.000+04:00", ZONE_MOSCOW);
        __CLR4_4_1jbejbelc8azugb.R.inc(25560);doTest_getOffsetFromLocal(3, 25, 8, 0, "2007-03-25T08:00:00.000+04:00", ZONE_MOSCOW);
    }finally{__CLR4_4_1jbejbelc8azugb.R.flushNeeded();}}

    public void test_DateTime_setHourAcross_Moscow_Spring() {__CLR4_4_1jbejbelc8azugb.R.globalSliceStart(getClass().getName(),25561);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tjmcxkjq1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jbejbelc8azugb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jbejbelc8azugb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_DateTime_setHourAcross_Moscow_Spring",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25561,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tjmcxkjq1(){try{__CLR4_4_1jbejbelc8azugb.R.inc(25561);
        __CLR4_4_1jbejbelc8azugb.R.inc(25562);DateTime dt = new DateTime(2007, 3, 25, 0, 0, 0, 0, ZONE_MOSCOW);
        __CLR4_4_1jbejbelc8azugb.R.inc(25563);assertEquals("2007-03-25T00:00:00.000+03:00", dt.toString());
        __CLR4_4_1jbejbelc8azugb.R.inc(25564);DateTime res = dt.hourOfDay().setCopy(4);
        __CLR4_4_1jbejbelc8azugb.R.inc(25565);assertEquals("2007-03-25T04:00:00.000+04:00", res.toString());
    }finally{__CLR4_4_1jbejbelc8azugb.R.flushNeeded();}}

    public void test_DateTime_setHourForward_Moscow_Spring() {__CLR4_4_1jbejbelc8azugb.R.globalSliceStart(getClass().getName(),25566);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1g9i25sjq6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jbejbelc8azugb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jbejbelc8azugb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_DateTime_setHourForward_Moscow_Spring",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25566,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1g9i25sjq6(){try{__CLR4_4_1jbejbelc8azugb.R.inc(25566);
        __CLR4_4_1jbejbelc8azugb.R.inc(25567);DateTime dt = new DateTime(2007, 3, 25, 0, 0, 0, 0, ZONE_MOSCOW);
        __CLR4_4_1jbejbelc8azugb.R.inc(25568);assertEquals("2007-03-25T00:00:00.000+03:00", dt.toString());
        
        __CLR4_4_1jbejbelc8azugb.R.inc(25569);try {
            __CLR4_4_1jbejbelc8azugb.R.inc(25570);dt.hourOfDay().setCopy(2);
            __CLR4_4_1jbejbelc8azugb.R.inc(25571);fail();
        } catch (IllegalFieldValueException ex) {
            // expected
        }
    }finally{__CLR4_4_1jbejbelc8azugb.R.flushNeeded();}}

    public void test_DateTime_setHourBack_Moscow_Spring() {__CLR4_4_1jbejbelc8azugb.R.globalSliceStart(getClass().getName(),25572);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fr2cwgjqc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jbejbelc8azugb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jbejbelc8azugb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_DateTime_setHourBack_Moscow_Spring",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25572,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fr2cwgjqc(){try{__CLR4_4_1jbejbelc8azugb.R.inc(25572);
        __CLR4_4_1jbejbelc8azugb.R.inc(25573);DateTime dt = new DateTime(2007, 3, 25, 8, 0, 0, 0, ZONE_MOSCOW);
        __CLR4_4_1jbejbelc8azugb.R.inc(25574);assertEquals("2007-03-25T08:00:00.000+04:00", dt.toString());
        
        __CLR4_4_1jbejbelc8azugb.R.inc(25575);try {
            __CLR4_4_1jbejbelc8azugb.R.inc(25576);dt.hourOfDay().setCopy(2);
            __CLR4_4_1jbejbelc8azugb.R.inc(25577);fail();
        } catch (IllegalFieldValueException ex) {
            // expected
        }
    }finally{__CLR4_4_1jbejbelc8azugb.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /** America/New_York cutover from 02:59 to 02:00 on 2007-10-28 */
    private static long CUTOVER_MOSCOW_AUTUMN = 1193526000000L;  // 2007-10-28T02:00:00.000+03:00

    //-----------------------------------------------------------------------
    public void test_MoscowIsCorrect_Autumn() {__CLR4_4_1jbejbelc8azugb.R.globalSliceStart(getClass().getName(),25578);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18it6sjjqi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jbejbelc8azugb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jbejbelc8azugb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_MoscowIsCorrect_Autumn",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25578,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18it6sjjqi(){try{__CLR4_4_1jbejbelc8azugb.R.inc(25578);
        __CLR4_4_1jbejbelc8azugb.R.inc(25579);DateTime pre = new DateTime(CUTOVER_MOSCOW_AUTUMN - 1L, ZONE_MOSCOW);
        __CLR4_4_1jbejbelc8azugb.R.inc(25580);assertEquals("2007-10-28T02:59:59.999+04:00", pre.toString());
        __CLR4_4_1jbejbelc8azugb.R.inc(25581);DateTime at = new DateTime(CUTOVER_MOSCOW_AUTUMN, ZONE_MOSCOW);
        __CLR4_4_1jbejbelc8azugb.R.inc(25582);assertEquals("2007-10-28T02:00:00.000+03:00", at.toString());
        __CLR4_4_1jbejbelc8azugb.R.inc(25583);DateTime post = new DateTime(CUTOVER_MOSCOW_AUTUMN + 1L, ZONE_MOSCOW);
        __CLR4_4_1jbejbelc8azugb.R.inc(25584);assertEquals("2007-10-28T02:00:00.001+03:00", post.toString());
    }finally{__CLR4_4_1jbejbelc8azugb.R.flushNeeded();}}

    public void test_getOffsetFromLocal_Moscow_Autumn() {__CLR4_4_1jbejbelc8azugb.R.globalSliceStart(getClass().getName(),25585);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_129zyy0jqp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jbejbelc8azugb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jbejbelc8azugb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_getOffsetFromLocal_Moscow_Autumn",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25585,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_129zyy0jqp(){try{__CLR4_4_1jbejbelc8azugb.R.inc(25585);
        __CLR4_4_1jbejbelc8azugb.R.inc(25586);doTest_getOffsetFromLocal(10, 28, 0, 0, "2007-10-28T00:00:00.000+04:00", ZONE_MOSCOW);
        __CLR4_4_1jbejbelc8azugb.R.inc(25587);doTest_getOffsetFromLocal(10, 28, 0,30, "2007-10-28T00:30:00.000+04:00", ZONE_MOSCOW);
        __CLR4_4_1jbejbelc8azugb.R.inc(25588);doTest_getOffsetFromLocal(10, 28, 1, 0, "2007-10-28T01:00:00.000+04:00", ZONE_MOSCOW);
        __CLR4_4_1jbejbelc8azugb.R.inc(25589);doTest_getOffsetFromLocal(10, 28, 1,30, "2007-10-28T01:30:00.000+04:00", ZONE_MOSCOW);
        
        __CLR4_4_1jbejbelc8azugb.R.inc(25590);doTest_getOffsetFromLocal(10, 28, 2, 0, "2007-10-28T02:00:00.000+04:00", ZONE_MOSCOW);
        __CLR4_4_1jbejbelc8azugb.R.inc(25591);doTest_getOffsetFromLocal(10, 28, 2,30, "2007-10-28T02:30:00.000+04:00", ZONE_MOSCOW);
        __CLR4_4_1jbejbelc8azugb.R.inc(25592);doTest_getOffsetFromLocal(10, 28, 2,30,59,999, "2007-10-28T02:30:59.999+04:00", ZONE_MOSCOW);
        __CLR4_4_1jbejbelc8azugb.R.inc(25593);doTest_getOffsetFromLocal(10, 28, 2,59,59,998, "2007-10-28T02:59:59.998+04:00", ZONE_MOSCOW);
        __CLR4_4_1jbejbelc8azugb.R.inc(25594);doTest_getOffsetFromLocal(10, 28, 2,59,59,999, "2007-10-28T02:59:59.999+04:00", ZONE_MOSCOW);
        
        __CLR4_4_1jbejbelc8azugb.R.inc(25595);doTest_getOffsetFromLocal(10, 28, 3, 0, "2007-10-28T03:00:00.000+03:00", ZONE_MOSCOW);
        __CLR4_4_1jbejbelc8azugb.R.inc(25596);doTest_getOffsetFromLocal(10, 28, 3,30, "2007-10-28T03:30:00.000+03:00", ZONE_MOSCOW);
        __CLR4_4_1jbejbelc8azugb.R.inc(25597);doTest_getOffsetFromLocal(10, 28, 4, 0, "2007-10-28T04:00:00.000+03:00", ZONE_MOSCOW);
        __CLR4_4_1jbejbelc8azugb.R.inc(25598);doTest_getOffsetFromLocal(10, 28, 5, 0, "2007-10-28T05:00:00.000+03:00", ZONE_MOSCOW);
        __CLR4_4_1jbejbelc8azugb.R.inc(25599);doTest_getOffsetFromLocal(10, 28, 6, 0, "2007-10-28T06:00:00.000+03:00", ZONE_MOSCOW);
        __CLR4_4_1jbejbelc8azugb.R.inc(25600);doTest_getOffsetFromLocal(10, 28, 7, 0, "2007-10-28T07:00:00.000+03:00", ZONE_MOSCOW);
        __CLR4_4_1jbejbelc8azugb.R.inc(25601);doTest_getOffsetFromLocal(10, 28, 8, 0, "2007-10-28T08:00:00.000+03:00", ZONE_MOSCOW);
    }finally{__CLR4_4_1jbejbelc8azugb.R.flushNeeded();}}

    public void test_getOffsetFromLocal_Moscow_Autumn_overlap_mins() {__CLR4_4_1jbejbelc8azugb.R.globalSliceStart(getClass().getName(),25602);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gx93cyjr6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jbejbelc8azugb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jbejbelc8azugb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_getOffsetFromLocal_Moscow_Autumn_overlap_mins",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25602,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gx93cyjr6(){try{__CLR4_4_1jbejbelc8azugb.R.inc(25602);
        __CLR4_4_1jbejbelc8azugb.R.inc(25603);for (int min = 0; (((min < 60)&&(__CLR4_4_1jbejbelc8azugb.R.iget(25604)!=0|true))||(__CLR4_4_1jbejbelc8azugb.R.iget(25605)==0&false)); min++) {{
            __CLR4_4_1jbejbelc8azugb.R.inc(25606);if ((((min < 10)&&(__CLR4_4_1jbejbelc8azugb.R.iget(25607)!=0|true))||(__CLR4_4_1jbejbelc8azugb.R.iget(25608)==0&false))) {{
                __CLR4_4_1jbejbelc8azugb.R.inc(25609);doTest_getOffsetFromLocal(10, 28, 2, min, "2007-10-28T02:0" + min + ":00.000+04:00", ZONE_MOSCOW);
            } }else {{
                __CLR4_4_1jbejbelc8azugb.R.inc(25610);doTest_getOffsetFromLocal(10, 28, 2, min, "2007-10-28T02:" + min + ":00.000+04:00", ZONE_MOSCOW);
            }
        }}
    }}finally{__CLR4_4_1jbejbelc8azugb.R.flushNeeded();}}

    public void test_DateTime_constructor_Moscow_Autumn() {__CLR4_4_1jbejbelc8azugb.R.globalSliceStart(getClass().getName(),25611);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1176mrejrf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jbejbelc8azugb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jbejbelc8azugb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_DateTime_constructor_Moscow_Autumn",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25611,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1176mrejrf(){try{__CLR4_4_1jbejbelc8azugb.R.inc(25611);
        __CLR4_4_1jbejbelc8azugb.R.inc(25612);DateTime dt = new DateTime(2007, 10, 28, 2, 30, ZONE_MOSCOW);
        __CLR4_4_1jbejbelc8azugb.R.inc(25613);assertEquals("2007-10-28T02:30:00.000+04:00", dt.toString());
    }finally{__CLR4_4_1jbejbelc8azugb.R.flushNeeded();}}

    public void test_DateTime_plusHour_Moscow_Autumn() {__CLR4_4_1jbejbelc8azugb.R.globalSliceStart(getClass().getName(),25614);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xmm8c8jri();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jbejbelc8azugb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jbejbelc8azugb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_DateTime_plusHour_Moscow_Autumn",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25614,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xmm8c8jri(){try{__CLR4_4_1jbejbelc8azugb.R.inc(25614);
        __CLR4_4_1jbejbelc8azugb.R.inc(25615);DateTime dt = new DateTime(2007, 10, 27, 19, 0, 0, 0, ZONE_MOSCOW);
        __CLR4_4_1jbejbelc8azugb.R.inc(25616);assertEquals("2007-10-27T19:00:00.000+04:00", dt.toString());
        
        __CLR4_4_1jbejbelc8azugb.R.inc(25617);DateTime plus6 = dt.plusHours(6);
        __CLR4_4_1jbejbelc8azugb.R.inc(25618);assertEquals("2007-10-28T01:00:00.000+04:00", plus6.toString());
        __CLR4_4_1jbejbelc8azugb.R.inc(25619);DateTime plus7 = dt.plusHours(7);
        __CLR4_4_1jbejbelc8azugb.R.inc(25620);assertEquals("2007-10-28T02:00:00.000+04:00", plus7.toString());
        __CLR4_4_1jbejbelc8azugb.R.inc(25621);DateTime plus8 = dt.plusHours(8);
        __CLR4_4_1jbejbelc8azugb.R.inc(25622);assertEquals("2007-10-28T02:00:00.000+03:00", plus8.toString());
        __CLR4_4_1jbejbelc8azugb.R.inc(25623);DateTime plus9 = dt.plusHours(9);
        __CLR4_4_1jbejbelc8azugb.R.inc(25624);assertEquals("2007-10-28T03:00:00.000+03:00", plus9.toString());
    }finally{__CLR4_4_1jbejbelc8azugb.R.flushNeeded();}}

    public void test_DateTime_minusHour_Moscow_Autumn() {__CLR4_4_1jbejbelc8azugb.R.globalSliceStart(getClass().getName(),25625);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ur2ce8jrt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jbejbelc8azugb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jbejbelc8azugb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_DateTime_minusHour_Moscow_Autumn",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25625,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ur2ce8jrt(){try{__CLR4_4_1jbejbelc8azugb.R.inc(25625);
        __CLR4_4_1jbejbelc8azugb.R.inc(25626);DateTime dt = new DateTime(2007, 10, 28, 9, 0, 0, 0, ZONE_MOSCOW);
        __CLR4_4_1jbejbelc8azugb.R.inc(25627);assertEquals("2007-10-28T09:00:00.000+03:00", dt.toString());
        
        __CLR4_4_1jbejbelc8azugb.R.inc(25628);DateTime minus6 = dt.minusHours(6);
        __CLR4_4_1jbejbelc8azugb.R.inc(25629);assertEquals("2007-10-28T03:00:00.000+03:00", minus6.toString());
        __CLR4_4_1jbejbelc8azugb.R.inc(25630);DateTime minus7 = dt.minusHours(7);
        __CLR4_4_1jbejbelc8azugb.R.inc(25631);assertEquals("2007-10-28T02:00:00.000+03:00", minus7.toString());
        __CLR4_4_1jbejbelc8azugb.R.inc(25632);DateTime minus8 = dt.minusHours(8);
        __CLR4_4_1jbejbelc8azugb.R.inc(25633);assertEquals("2007-10-28T02:00:00.000+04:00", minus8.toString());
        __CLR4_4_1jbejbelc8azugb.R.inc(25634);DateTime minus9 = dt.minusHours(9);
        __CLR4_4_1jbejbelc8azugb.R.inc(25635);assertEquals("2007-10-28T01:00:00.000+04:00", minus9.toString());
    }finally{__CLR4_4_1jbejbelc8azugb.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    //-----------------------------------------------------------------------
    //-----------------------------------------------------------------------
    /** America/Guatemala cutover from 23:59 to 23:00 on 2006-09-30 */
    private static long CUTOVER_GUATEMALA_AUTUMN = 1159678800000L; // 2006-09-30T23:00:00.000-06:00
    private static final DateTimeZone ZONE_GUATEMALA = DateTimeZone.forID("America/Guatemala");

    //-----------------------------------------------------------------------
    public void test_GuatemataIsCorrect_Autumn() {__CLR4_4_1jbejbelc8azugb.R.globalSliceStart(getClass().getName(),25636);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16srrl8js4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jbejbelc8azugb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jbejbelc8azugb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_GuatemataIsCorrect_Autumn",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25636,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16srrl8js4(){try{__CLR4_4_1jbejbelc8azugb.R.inc(25636);
        __CLR4_4_1jbejbelc8azugb.R.inc(25637);DateTime pre = new DateTime(CUTOVER_GUATEMALA_AUTUMN - 1L, ZONE_GUATEMALA);
        __CLR4_4_1jbejbelc8azugb.R.inc(25638);assertEquals("2006-09-30T23:59:59.999-05:00", pre.toString());
        __CLR4_4_1jbejbelc8azugb.R.inc(25639);DateTime at = new DateTime(CUTOVER_GUATEMALA_AUTUMN, ZONE_GUATEMALA);
        __CLR4_4_1jbejbelc8azugb.R.inc(25640);assertEquals("2006-09-30T23:00:00.000-06:00", at.toString());
        __CLR4_4_1jbejbelc8azugb.R.inc(25641);DateTime post = new DateTime(CUTOVER_GUATEMALA_AUTUMN + 1L, ZONE_GUATEMALA);
        __CLR4_4_1jbejbelc8azugb.R.inc(25642);assertEquals("2006-09-30T23:00:00.001-06:00", post.toString());
    }finally{__CLR4_4_1jbejbelc8azugb.R.flushNeeded();}}

    public void test_getOffsetFromLocal_Guatemata_Autumn() {__CLR4_4_1jbejbelc8azugb.R.globalSliceStart(getClass().getName(),25643);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tdmnfzjsb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jbejbelc8azugb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jbejbelc8azugb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_getOffsetFromLocal_Guatemata_Autumn",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25643,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tdmnfzjsb(){try{__CLR4_4_1jbejbelc8azugb.R.inc(25643);
        __CLR4_4_1jbejbelc8azugb.R.inc(25644);doTest_getOffsetFromLocal( 2006, 9,30,23, 0,
                                  "2006-09-30T23:00:00.000-05:00", ZONE_GUATEMALA);
        __CLR4_4_1jbejbelc8azugb.R.inc(25645);doTest_getOffsetFromLocal( 2006, 9,30,23,30,
                                  "2006-09-30T23:30:00.000-05:00", ZONE_GUATEMALA);
        
        __CLR4_4_1jbejbelc8azugb.R.inc(25646);doTest_getOffsetFromLocal( 2006, 9,30,23, 0,
                                  "2006-09-30T23:00:00.000-05:00", ZONE_GUATEMALA);
        __CLR4_4_1jbejbelc8azugb.R.inc(25647);doTest_getOffsetFromLocal( 2006, 9,30,23,30,
                                  "2006-09-30T23:30:00.000-05:00", ZONE_GUATEMALA);
        
        __CLR4_4_1jbejbelc8azugb.R.inc(25648);doTest_getOffsetFromLocal( 2006,10, 1, 0, 0,
                                  "2006-10-01T00:00:00.000-06:00", ZONE_GUATEMALA);
        __CLR4_4_1jbejbelc8azugb.R.inc(25649);doTest_getOffsetFromLocal( 2006,10, 1, 0,30,
                                  "2006-10-01T00:30:00.000-06:00", ZONE_GUATEMALA);
        __CLR4_4_1jbejbelc8azugb.R.inc(25650);doTest_getOffsetFromLocal( 2006,10, 1, 1, 0,
                                  "2006-10-01T01:00:00.000-06:00", ZONE_GUATEMALA);
        __CLR4_4_1jbejbelc8azugb.R.inc(25651);doTest_getOffsetFromLocal( 2006,10, 1, 1,30,
                                  "2006-10-01T01:30:00.000-06:00", ZONE_GUATEMALA);
        __CLR4_4_1jbejbelc8azugb.R.inc(25652);doTest_getOffsetFromLocal( 2006,10, 1, 2, 0,
                                  "2006-10-01T02:00:00.000-06:00", ZONE_GUATEMALA);
        __CLR4_4_1jbejbelc8azugb.R.inc(25653);doTest_getOffsetFromLocal( 2006,10, 1, 2,30,
                                  "2006-10-01T02:30:00.000-06:00", ZONE_GUATEMALA);
        __CLR4_4_1jbejbelc8azugb.R.inc(25654);doTest_getOffsetFromLocal( 2006,10, 1, 3, 0,
                                  "2006-10-01T03:00:00.000-06:00", ZONE_GUATEMALA);
        __CLR4_4_1jbejbelc8azugb.R.inc(25655);doTest_getOffsetFromLocal( 2006,10, 1, 3,30,
                                  "2006-10-01T03:30:00.000-06:00", ZONE_GUATEMALA);
        __CLR4_4_1jbejbelc8azugb.R.inc(25656);doTest_getOffsetFromLocal( 2006,10, 1, 4, 0,
                                  "2006-10-01T04:00:00.000-06:00", ZONE_GUATEMALA);
        __CLR4_4_1jbejbelc8azugb.R.inc(25657);doTest_getOffsetFromLocal( 2006,10, 1, 4,30,
                                  "2006-10-01T04:30:00.000-06:00", ZONE_GUATEMALA);
        __CLR4_4_1jbejbelc8azugb.R.inc(25658);doTest_getOffsetFromLocal( 2006,10, 1, 5, 0,
                                  "2006-10-01T05:00:00.000-06:00", ZONE_GUATEMALA);
        __CLR4_4_1jbejbelc8azugb.R.inc(25659);doTest_getOffsetFromLocal( 2006,10, 1, 5,30,
                                  "2006-10-01T05:30:00.000-06:00", ZONE_GUATEMALA);
        __CLR4_4_1jbejbelc8azugb.R.inc(25660);doTest_getOffsetFromLocal( 2006,10, 1, 6, 0,
                                  "2006-10-01T06:00:00.000-06:00", ZONE_GUATEMALA);
        __CLR4_4_1jbejbelc8azugb.R.inc(25661);doTest_getOffsetFromLocal( 2006,10, 1, 6,30,
                                  "2006-10-01T06:30:00.000-06:00", ZONE_GUATEMALA);
    }finally{__CLR4_4_1jbejbelc8azugb.R.flushNeeded();}}

    public void test_DateTime_plusHour_Guatemata_Autumn() {__CLR4_4_1jbejbelc8azugb.R.globalSliceStart(getClass().getName(),25662);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jb0lhdjsu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jbejbelc8azugb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jbejbelc8azugb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_DateTime_plusHour_Guatemata_Autumn",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25662,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jb0lhdjsu(){try{__CLR4_4_1jbejbelc8azugb.R.inc(25662);
        __CLR4_4_1jbejbelc8azugb.R.inc(25663);DateTime dt = new DateTime(2006, 9, 30, 20, 0, 0, 0, ZONE_GUATEMALA);
        __CLR4_4_1jbejbelc8azugb.R.inc(25664);assertEquals("2006-09-30T20:00:00.000-05:00", dt.toString());
        
        __CLR4_4_1jbejbelc8azugb.R.inc(25665);DateTime plus1 = dt.plusHours(1);
        __CLR4_4_1jbejbelc8azugb.R.inc(25666);assertEquals("2006-09-30T21:00:00.000-05:00", plus1.toString());
        __CLR4_4_1jbejbelc8azugb.R.inc(25667);DateTime plus2 = dt.plusHours(2);
        __CLR4_4_1jbejbelc8azugb.R.inc(25668);assertEquals("2006-09-30T22:00:00.000-05:00", plus2.toString());
        __CLR4_4_1jbejbelc8azugb.R.inc(25669);DateTime plus3 = dt.plusHours(3);
        __CLR4_4_1jbejbelc8azugb.R.inc(25670);assertEquals("2006-09-30T23:00:00.000-05:00", plus3.toString());
        __CLR4_4_1jbejbelc8azugb.R.inc(25671);DateTime plus4 = dt.plusHours(4);
        __CLR4_4_1jbejbelc8azugb.R.inc(25672);assertEquals("2006-09-30T23:00:00.000-06:00", plus4.toString());
        __CLR4_4_1jbejbelc8azugb.R.inc(25673);DateTime plus5 = dt.plusHours(5);
        __CLR4_4_1jbejbelc8azugb.R.inc(25674);assertEquals("2006-10-01T00:00:00.000-06:00", plus5.toString());
        __CLR4_4_1jbejbelc8azugb.R.inc(25675);DateTime plus6 = dt.plusHours(6);
        __CLR4_4_1jbejbelc8azugb.R.inc(25676);assertEquals("2006-10-01T01:00:00.000-06:00", plus6.toString());
        __CLR4_4_1jbejbelc8azugb.R.inc(25677);DateTime plus7 = dt.plusHours(7);
        __CLR4_4_1jbejbelc8azugb.R.inc(25678);assertEquals("2006-10-01T02:00:00.000-06:00", plus7.toString());
    }finally{__CLR4_4_1jbejbelc8azugb.R.flushNeeded();}}

    public void test_DateTime_minusHour_Guatemata_Autumn() {__CLR4_4_1jbejbelc8azugb.R.globalSliceStart(getClass().getName(),25679);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19xh58njtb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jbejbelc8azugb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jbejbelc8azugb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_DateTime_minusHour_Guatemata_Autumn",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25679,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19xh58njtb(){try{__CLR4_4_1jbejbelc8azugb.R.inc(25679);
        __CLR4_4_1jbejbelc8azugb.R.inc(25680);DateTime dt = new DateTime(2006, 10, 1, 2, 0, 0, 0, ZONE_GUATEMALA);
        __CLR4_4_1jbejbelc8azugb.R.inc(25681);assertEquals("2006-10-01T02:00:00.000-06:00", dt.toString());
        
        __CLR4_4_1jbejbelc8azugb.R.inc(25682);DateTime minus1 = dt.minusHours(1);
        __CLR4_4_1jbejbelc8azugb.R.inc(25683);assertEquals("2006-10-01T01:00:00.000-06:00", minus1.toString());
        __CLR4_4_1jbejbelc8azugb.R.inc(25684);DateTime minus2 = dt.minusHours(2);
        __CLR4_4_1jbejbelc8azugb.R.inc(25685);assertEquals("2006-10-01T00:00:00.000-06:00", minus2.toString());
        __CLR4_4_1jbejbelc8azugb.R.inc(25686);DateTime minus3 = dt.minusHours(3);
        __CLR4_4_1jbejbelc8azugb.R.inc(25687);assertEquals("2006-09-30T23:00:00.000-06:00", minus3.toString());
        __CLR4_4_1jbejbelc8azugb.R.inc(25688);DateTime minus4 = dt.minusHours(4);
        __CLR4_4_1jbejbelc8azugb.R.inc(25689);assertEquals("2006-09-30T23:00:00.000-05:00", minus4.toString());
        __CLR4_4_1jbejbelc8azugb.R.inc(25690);DateTime minus5 = dt.minusHours(5);
        __CLR4_4_1jbejbelc8azugb.R.inc(25691);assertEquals("2006-09-30T22:00:00.000-05:00", minus5.toString());
        __CLR4_4_1jbejbelc8azugb.R.inc(25692);DateTime minus6 = dt.minusHours(6);
        __CLR4_4_1jbejbelc8azugb.R.inc(25693);assertEquals("2006-09-30T21:00:00.000-05:00", minus6.toString());
        __CLR4_4_1jbejbelc8azugb.R.inc(25694);DateTime minus7 = dt.minusHours(7);
        __CLR4_4_1jbejbelc8azugb.R.inc(25695);assertEquals("2006-09-30T20:00:00.000-05:00", minus7.toString());
    }finally{__CLR4_4_1jbejbelc8azugb.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    //-----------------------------------------------------------------------
    //-----------------------------------------------------------------------

    public void test_DateTime_JustAfterLastEverOverlap() {__CLR4_4_1jbejbelc8azugb.R.globalSliceStart(getClass().getName(),25696);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bpgbhdjts();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jbejbelc8azugb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jbejbelc8azugb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_DateTime_JustAfterLastEverOverlap",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25696,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bpgbhdjts(){try{__CLR4_4_1jbejbelc8azugb.R.inc(25696);
        // based on America/Argentina/Catamarca in file 2009s
        __CLR4_4_1jbejbelc8azugb.R.inc(25697);DateTimeZone zone = new DateTimeZoneBuilder()
            .setStandardOffset(-3 * DateTimeConstants.MILLIS_PER_HOUR)
            .addRecurringSavings("SUMMER", 1 * DateTimeConstants.MILLIS_PER_HOUR, 2000, 2008,
                                    'w', 4, 10, 0, true, 23 * DateTimeConstants.MILLIS_PER_HOUR)
            .addRecurringSavings("WINTER", 0, 2000, 2008,
                                    'w', 8, 10, 0, true, 0 * DateTimeConstants.MILLIS_PER_HOUR)
            .toDateTimeZone("Zone", false);
        
        __CLR4_4_1jbejbelc8azugb.R.inc(25698);LocalDate date = new LocalDate(2008, 8, 10);
        __CLR4_4_1jbejbelc8azugb.R.inc(25699);assertEquals("2008-08-10", date.toString());
        
        __CLR4_4_1jbejbelc8azugb.R.inc(25700);DateTime dt = date.toDateTimeAtStartOfDay(zone);
        __CLR4_4_1jbejbelc8azugb.R.inc(25701);assertEquals("2008-08-10T00:00:00.000-03:00", dt.toString());
    }finally{__CLR4_4_1jbejbelc8azugb.R.flushNeeded();}}

//    public void test_toDateMidnight_SaoPaolo() {
//        // RFE: 1684259
//        DateTimeZone zone = DateTimeZone.forID("America/Sao_Paulo");
//        LocalDate baseDate = new LocalDate(2006, 11, 5);
//        DateMidnight dm = baseDate.toDateMidnight(zone);
//        assertEquals("2006-11-05T00:00:00.000-03:00", dm.toString());
//        DateTime dt = baseDate.toDateTimeAtMidnight(zone);
//        assertEquals("2006-11-05T00:00:00.000-03:00", dt.toString());
//    }

    //-----------------------------------------------------------------------
    private static final DateTimeZone ZONE_PARIS = DateTimeZone.forID("Europe/Paris");

    public void testWithMinuteOfHourInDstChange_mockZone() {__CLR4_4_1jbejbelc8azugb.R.globalSliceStart(getClass().getName(),25702);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wo7i0djty();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jbejbelc8azugb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jbejbelc8azugb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.testWithMinuteOfHourInDstChange_mockZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25702,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wo7i0djty(){try{__CLR4_4_1jbejbelc8azugb.R.inc(25702);
        __CLR4_4_1jbejbelc8azugb.R.inc(25703);DateTime cutover = new DateTime(2010, 10, 31, 1, 15, DateTimeZone.forOffsetHoursMinutes(0, 30));
        __CLR4_4_1jbejbelc8azugb.R.inc(25704);assertEquals("2010-10-31T01:15:00.000+00:30", cutover.toString());
        __CLR4_4_1jbejbelc8azugb.R.inc(25705);DateTimeZone halfHourZone = new MockZone(cutover.getMillis(), 3600000, -1800);
        __CLR4_4_1jbejbelc8azugb.R.inc(25706);DateTime pre = new DateTime(2010, 10, 31, 1, 0, halfHourZone);
        __CLR4_4_1jbejbelc8azugb.R.inc(25707);assertEquals("2010-10-31T01:00:00.000+01:00", pre.toString());
        __CLR4_4_1jbejbelc8azugb.R.inc(25708);DateTime post = new DateTime(2010, 10, 31, 1, 59, halfHourZone);
        __CLR4_4_1jbejbelc8azugb.R.inc(25709);assertEquals("2010-10-31T01:59:00.000+00:30", post.toString());
        
        __CLR4_4_1jbejbelc8azugb.R.inc(25710);DateTime testPre1 = pre.withMinuteOfHour(30);
        __CLR4_4_1jbejbelc8azugb.R.inc(25711);assertEquals("2010-10-31T01:30:00.000+01:00", testPre1.toString());  // retain offset
        __CLR4_4_1jbejbelc8azugb.R.inc(25712);DateTime testPre2 = pre.withMinuteOfHour(50);
        __CLR4_4_1jbejbelc8azugb.R.inc(25713);assertEquals("2010-10-31T01:50:00.000+00:30", testPre2.toString());
        
        __CLR4_4_1jbejbelc8azugb.R.inc(25714);DateTime testPost1 = post.withMinuteOfHour(30);
        __CLR4_4_1jbejbelc8azugb.R.inc(25715);assertEquals("2010-10-31T01:30:00.000+00:30", testPost1.toString());  // retain offset
        __CLR4_4_1jbejbelc8azugb.R.inc(25716);DateTime testPost2 = post.withMinuteOfHour(10);
        __CLR4_4_1jbejbelc8azugb.R.inc(25717);assertEquals("2010-10-31T01:10:00.000+01:00", testPost2.toString());
    }finally{__CLR4_4_1jbejbelc8azugb.R.flushNeeded();}}

    public void testWithHourOfDayInDstChange() {__CLR4_4_1jbejbelc8azugb.R.globalSliceStart(getClass().getName(),25718);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14lklsijue();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jbejbelc8azugb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jbejbelc8azugb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.testWithHourOfDayInDstChange",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25718,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14lklsijue(){try{__CLR4_4_1jbejbelc8azugb.R.inc(25718);
        __CLR4_4_1jbejbelc8azugb.R.inc(25719);DateTime dateTime = new DateTime("2010-10-31T02:30:10.123+02:00", ZONE_PARIS);
        __CLR4_4_1jbejbelc8azugb.R.inc(25720);assertEquals("2010-10-31T02:30:10.123+02:00", dateTime.toString());
        __CLR4_4_1jbejbelc8azugb.R.inc(25721);DateTime test = dateTime.withHourOfDay(2);
        __CLR4_4_1jbejbelc8azugb.R.inc(25722);assertEquals("2010-10-31T02:30:10.123+02:00", test.toString());
    }finally{__CLR4_4_1jbejbelc8azugb.R.flushNeeded();}}

    public void testWithMinuteOfHourInDstChange() {__CLR4_4_1jbejbelc8azugb.R.globalSliceStart(getClass().getName(),25723);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19gkl2ojuj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jbejbelc8azugb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jbejbelc8azugb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.testWithMinuteOfHourInDstChange",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25723,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19gkl2ojuj(){try{__CLR4_4_1jbejbelc8azugb.R.inc(25723);
        __CLR4_4_1jbejbelc8azugb.R.inc(25724);DateTime dateTime = new DateTime("2010-10-31T02:30:10.123+02:00", ZONE_PARIS);
        __CLR4_4_1jbejbelc8azugb.R.inc(25725);assertEquals("2010-10-31T02:30:10.123+02:00", dateTime.toString());
        __CLR4_4_1jbejbelc8azugb.R.inc(25726);DateTime test = dateTime.withMinuteOfHour(0);
        __CLR4_4_1jbejbelc8azugb.R.inc(25727);assertEquals("2010-10-31T02:00:10.123+02:00", test.toString());
    }finally{__CLR4_4_1jbejbelc8azugb.R.flushNeeded();}}

    public void testWithSecondOfMinuteInDstChange() {__CLR4_4_1jbejbelc8azugb.R.globalSliceStart(getClass().getName(),25728);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vjv128juo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jbejbelc8azugb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jbejbelc8azugb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.testWithSecondOfMinuteInDstChange",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25728,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vjv128juo(){try{__CLR4_4_1jbejbelc8azugb.R.inc(25728);
        __CLR4_4_1jbejbelc8azugb.R.inc(25729);DateTime dateTime = new DateTime("2010-10-31T02:30:10.123+02:00", ZONE_PARIS);
        __CLR4_4_1jbejbelc8azugb.R.inc(25730);assertEquals("2010-10-31T02:30:10.123+02:00", dateTime.toString());
        __CLR4_4_1jbejbelc8azugb.R.inc(25731);DateTime test = dateTime.withSecondOfMinute(0);
        __CLR4_4_1jbejbelc8azugb.R.inc(25732);assertEquals("2010-10-31T02:30:00.123+02:00", test.toString());
    }finally{__CLR4_4_1jbejbelc8azugb.R.flushNeeded();}}

    public void testWithMillisOfSecondInDstChange_Paris_summer() {__CLR4_4_1jbejbelc8azugb.R.globalSliceStart(getClass().getName(),25733);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vtl71ejut();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jbejbelc8azugb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jbejbelc8azugb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.testWithMillisOfSecondInDstChange_Paris_summer",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25733,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vtl71ejut(){try{__CLR4_4_1jbejbelc8azugb.R.inc(25733);
        __CLR4_4_1jbejbelc8azugb.R.inc(25734);DateTime dateTime = new DateTime("2010-10-31T02:30:10.123+02:00", ZONE_PARIS);
        __CLR4_4_1jbejbelc8azugb.R.inc(25735);assertEquals("2010-10-31T02:30:10.123+02:00", dateTime.toString());
        __CLR4_4_1jbejbelc8azugb.R.inc(25736);DateTime test = dateTime.withMillisOfSecond(0);
        __CLR4_4_1jbejbelc8azugb.R.inc(25737);assertEquals("2010-10-31T02:30:10.000+02:00", test.toString());
    }finally{__CLR4_4_1jbejbelc8azugb.R.flushNeeded();}}

    public void testWithMillisOfSecondInDstChange_Paris_winter() {__CLR4_4_1jbejbelc8azugb.R.globalSliceStart(getClass().getName(),25738);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yrge2gjuy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jbejbelc8azugb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jbejbelc8azugb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.testWithMillisOfSecondInDstChange_Paris_winter",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25738,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yrge2gjuy(){try{__CLR4_4_1jbejbelc8azugb.R.inc(25738);
        __CLR4_4_1jbejbelc8azugb.R.inc(25739);DateTime dateTime = new DateTime("2010-10-31T02:30:10.123+01:00", ZONE_PARIS);
        __CLR4_4_1jbejbelc8azugb.R.inc(25740);assertEquals("2010-10-31T02:30:10.123+01:00", dateTime.toString());
        __CLR4_4_1jbejbelc8azugb.R.inc(25741);DateTime test = dateTime.withMillisOfSecond(0);
        __CLR4_4_1jbejbelc8azugb.R.inc(25742);assertEquals("2010-10-31T02:30:10.000+01:00", test.toString());
    }finally{__CLR4_4_1jbejbelc8azugb.R.flushNeeded();}}

    public void testWithMillisOfSecondInDstChange_NewYork_summer() {__CLR4_4_1jbejbelc8azugb.R.globalSliceStart(getClass().getName(),25743);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1b4pnaajv3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jbejbelc8azugb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jbejbelc8azugb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.testWithMillisOfSecondInDstChange_NewYork_summer",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25743,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1b4pnaajv3(){try{__CLR4_4_1jbejbelc8azugb.R.inc(25743);
        __CLR4_4_1jbejbelc8azugb.R.inc(25744);DateTime dateTime = new DateTime("2007-11-04T01:30:00.123-04:00", ZONE_NEW_YORK);
        __CLR4_4_1jbejbelc8azugb.R.inc(25745);assertEquals("2007-11-04T01:30:00.123-04:00", dateTime.toString());
        __CLR4_4_1jbejbelc8azugb.R.inc(25746);DateTime test = dateTime.withMillisOfSecond(0);
        __CLR4_4_1jbejbelc8azugb.R.inc(25747);assertEquals("2007-11-04T01:30:00.000-04:00", test.toString());
    }finally{__CLR4_4_1jbejbelc8azugb.R.flushNeeded();}}

    public void testWithMillisOfSecondInDstChange_NewYork_winter() {__CLR4_4_1jbejbelc8azugb.R.globalSliceStart(getClass().getName(),25748);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_186ug98jv8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jbejbelc8azugb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jbejbelc8azugb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.testWithMillisOfSecondInDstChange_NewYork_winter",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25748,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_186ug98jv8(){try{__CLR4_4_1jbejbelc8azugb.R.inc(25748);
        __CLR4_4_1jbejbelc8azugb.R.inc(25749);DateTime dateTime = new DateTime("2007-11-04T01:30:00.123-05:00", ZONE_NEW_YORK);
        __CLR4_4_1jbejbelc8azugb.R.inc(25750);assertEquals("2007-11-04T01:30:00.123-05:00", dateTime.toString());
        __CLR4_4_1jbejbelc8azugb.R.inc(25751);DateTime test = dateTime.withMillisOfSecond(0);
        __CLR4_4_1jbejbelc8azugb.R.inc(25752);assertEquals("2007-11-04T01:30:00.000-05:00", test.toString());
    }finally{__CLR4_4_1jbejbelc8azugb.R.flushNeeded();}}

    public void testPlusMinutesInDstChange() {__CLR4_4_1jbejbelc8azugb.R.globalSliceStart(getClass().getName(),25753);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1l2nz8cjvd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jbejbelc8azugb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jbejbelc8azugb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.testPlusMinutesInDstChange",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25753,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1l2nz8cjvd(){try{__CLR4_4_1jbejbelc8azugb.R.inc(25753);
        __CLR4_4_1jbejbelc8azugb.R.inc(25754);DateTime dateTime = new DateTime("2010-10-31T02:30:10.123+02:00", ZONE_PARIS);
        __CLR4_4_1jbejbelc8azugb.R.inc(25755);assertEquals("2010-10-31T02:30:10.123+02:00", dateTime.toString());
        __CLR4_4_1jbejbelc8azugb.R.inc(25756);DateTime test = dateTime.plusMinutes(1);
        __CLR4_4_1jbejbelc8azugb.R.inc(25757);assertEquals("2010-10-31T02:31:10.123+02:00", test.toString());
    }finally{__CLR4_4_1jbejbelc8azugb.R.flushNeeded();}}

    public void testPlusSecondsInDstChange() {__CLR4_4_1jbejbelc8azugb.R.globalSliceStart(getClass().getName(),25758);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1h0pkxwjvi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jbejbelc8azugb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jbejbelc8azugb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.testPlusSecondsInDstChange",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25758,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1h0pkxwjvi(){try{__CLR4_4_1jbejbelc8azugb.R.inc(25758);
        __CLR4_4_1jbejbelc8azugb.R.inc(25759);DateTime dateTime = new DateTime("2010-10-31T02:30:10.123+02:00", ZONE_PARIS);
        __CLR4_4_1jbejbelc8azugb.R.inc(25760);assertEquals("2010-10-31T02:30:10.123+02:00", dateTime.toString());
        __CLR4_4_1jbejbelc8azugb.R.inc(25761);DateTime test = dateTime.plusSeconds(1);
        __CLR4_4_1jbejbelc8azugb.R.inc(25762);assertEquals("2010-10-31T02:30:11.123+02:00", test.toString());
    }finally{__CLR4_4_1jbejbelc8azugb.R.flushNeeded();}}

    public void testPlusMillisInDstChange() {__CLR4_4_1jbejbelc8azugb.R.globalSliceStart(getClass().getName(),25763);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1duj0rpjvn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jbejbelc8azugb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jbejbelc8azugb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.testPlusMillisInDstChange",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25763,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1duj0rpjvn(){try{__CLR4_4_1jbejbelc8azugb.R.inc(25763);
        __CLR4_4_1jbejbelc8azugb.R.inc(25764);DateTime dateTime = new DateTime("2010-10-31T02:30:10.123+02:00", ZONE_PARIS);
        __CLR4_4_1jbejbelc8azugb.R.inc(25765);assertEquals("2010-10-31T02:30:10.123+02:00", dateTime.toString());
        __CLR4_4_1jbejbelc8azugb.R.inc(25766);DateTime test = dateTime.plusMillis(1);
        __CLR4_4_1jbejbelc8azugb.R.inc(25767);assertEquals("2010-10-31T02:30:10.124+02:00", test.toString());
    }finally{__CLR4_4_1jbejbelc8azugb.R.flushNeeded();}}

    public void testBug2182444_usCentral() {__CLR4_4_1jbejbelc8azugb.R.globalSliceStart(getClass().getName(),25768);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bdt1hkjvs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jbejbelc8azugb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jbejbelc8azugb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.testBug2182444_usCentral",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25768,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bdt1hkjvs(){try{__CLR4_4_1jbejbelc8azugb.R.inc(25768);
        __CLR4_4_1jbejbelc8azugb.R.inc(25769);Chronology chronUSCentral = GregorianChronology.getInstance(DateTimeZone.forID("US/Central"));
        __CLR4_4_1jbejbelc8azugb.R.inc(25770);Chronology chronUTC = GregorianChronology.getInstance(DateTimeZone.UTC);
        __CLR4_4_1jbejbelc8azugb.R.inc(25771);DateTime usCentralStandardInUTC = new DateTime(2008, 11, 2, 7, 0, 0, 0, chronUTC);
        __CLR4_4_1jbejbelc8azugb.R.inc(25772);DateTime usCentralDaylightInUTC = new DateTime(2008, 11, 2, 6, 0, 0, 0, chronUTC);
        __CLR4_4_1jbejbelc8azugb.R.inc(25773);assertTrue("Should be standard time", chronUSCentral.getZone().isStandardOffset(usCentralStandardInUTC.getMillis()));
        __CLR4_4_1jbejbelc8azugb.R.inc(25774);assertFalse("Should be daylight time", chronUSCentral.getZone().isStandardOffset(usCentralDaylightInUTC.getMillis()));
        
        __CLR4_4_1jbejbelc8azugb.R.inc(25775);DateTime usCentralStandardInUSCentral = usCentralStandardInUTC.toDateTime(chronUSCentral);
        __CLR4_4_1jbejbelc8azugb.R.inc(25776);DateTime usCentralDaylightInUSCentral = usCentralDaylightInUTC.toDateTime(chronUSCentral);
        __CLR4_4_1jbejbelc8azugb.R.inc(25777);assertEquals(1, usCentralStandardInUSCentral.getHourOfDay());
        __CLR4_4_1jbejbelc8azugb.R.inc(25778);assertEquals(usCentralStandardInUSCentral.getHourOfDay(), usCentralDaylightInUSCentral.getHourOfDay());
        __CLR4_4_1jbejbelc8azugb.R.inc(25779);assertTrue(usCentralStandardInUSCentral.getMillis() != usCentralDaylightInUSCentral.getMillis());
        __CLR4_4_1jbejbelc8azugb.R.inc(25780);assertEquals(usCentralStandardInUSCentral, usCentralStandardInUSCentral.withHourOfDay(1));
        __CLR4_4_1jbejbelc8azugb.R.inc(25781);assertEquals(usCentralStandardInUSCentral.getMillis() + 3, usCentralStandardInUSCentral.withMillisOfSecond(3).getMillis());
        __CLR4_4_1jbejbelc8azugb.R.inc(25782);assertEquals(usCentralDaylightInUSCentral, usCentralDaylightInUSCentral.withHourOfDay(1));
        __CLR4_4_1jbejbelc8azugb.R.inc(25783);assertEquals(usCentralDaylightInUSCentral.getMillis() + 3, usCentralDaylightInUSCentral.withMillisOfSecond(3).getMillis());
    }finally{__CLR4_4_1jbejbelc8azugb.R.flushNeeded();}}

    public void testBug2182444_ausNSW() {__CLR4_4_1jbejbelc8azugb.R.globalSliceStart(getClass().getName(),25784);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14bhxeojw8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jbejbelc8azugb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jbejbelc8azugb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.testBug2182444_ausNSW",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25784,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14bhxeojw8(){try{__CLR4_4_1jbejbelc8azugb.R.inc(25784);
        __CLR4_4_1jbejbelc8azugb.R.inc(25785);Chronology chronAusNSW = GregorianChronology.getInstance(DateTimeZone.forID("Australia/NSW"));
        __CLR4_4_1jbejbelc8azugb.R.inc(25786);Chronology chronUTC = GregorianChronology.getInstance(DateTimeZone.UTC);
        __CLR4_4_1jbejbelc8azugb.R.inc(25787);DateTime australiaNSWStandardInUTC = new DateTime(2008, 4, 5, 16, 0, 0, 0, chronUTC);
        __CLR4_4_1jbejbelc8azugb.R.inc(25788);DateTime australiaNSWDaylightInUTC = new DateTime(2008, 4, 5, 15, 0, 0, 0, chronUTC);
        __CLR4_4_1jbejbelc8azugb.R.inc(25789);assertTrue("Should be standard time", chronAusNSW.getZone().isStandardOffset(australiaNSWStandardInUTC.getMillis()));
        __CLR4_4_1jbejbelc8azugb.R.inc(25790);assertFalse("Should be daylight time", chronAusNSW.getZone().isStandardOffset(australiaNSWDaylightInUTC.getMillis()));
        
        __CLR4_4_1jbejbelc8azugb.R.inc(25791);DateTime australiaNSWStandardInAustraliaNSW = australiaNSWStandardInUTC.toDateTime(chronAusNSW);
        __CLR4_4_1jbejbelc8azugb.R.inc(25792);DateTime australiaNSWDaylightInAusraliaNSW = australiaNSWDaylightInUTC.toDateTime(chronAusNSW);
        __CLR4_4_1jbejbelc8azugb.R.inc(25793);assertEquals(2, australiaNSWStandardInAustraliaNSW.getHourOfDay());
        __CLR4_4_1jbejbelc8azugb.R.inc(25794);assertEquals(australiaNSWStandardInAustraliaNSW.getHourOfDay(), australiaNSWDaylightInAusraliaNSW.getHourOfDay());
        __CLR4_4_1jbejbelc8azugb.R.inc(25795);assertTrue(australiaNSWStandardInAustraliaNSW.getMillis() != australiaNSWDaylightInAusraliaNSW.getMillis());
        __CLR4_4_1jbejbelc8azugb.R.inc(25796);assertEquals(australiaNSWStandardInAustraliaNSW, australiaNSWStandardInAustraliaNSW.withHourOfDay(2));
        __CLR4_4_1jbejbelc8azugb.R.inc(25797);assertEquals(australiaNSWStandardInAustraliaNSW.getMillis() + 3, australiaNSWStandardInAustraliaNSW.withMillisOfSecond(3).getMillis());
        __CLR4_4_1jbejbelc8azugb.R.inc(25798);assertEquals(australiaNSWDaylightInAusraliaNSW, australiaNSWDaylightInAusraliaNSW.withHourOfDay(2));
        __CLR4_4_1jbejbelc8azugb.R.inc(25799);assertEquals(australiaNSWDaylightInAusraliaNSW.getMillis() + 3, australiaNSWDaylightInAusraliaNSW.withMillisOfSecond(3).getMillis());
    }finally{__CLR4_4_1jbejbelc8azugb.R.flushNeeded();}}

    public void testPeriod() {__CLR4_4_1jbejbelc8azugb.R.globalSliceStart(getClass().getName(),25800);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1w8wo2ijwo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jbejbelc8azugb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jbejbelc8azugb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.testPeriod",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25800,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1w8wo2ijwo(){try{__CLR4_4_1jbejbelc8azugb.R.inc(25800);
        __CLR4_4_1jbejbelc8azugb.R.inc(25801);DateTime a = new DateTime("2010-10-31T02:00:00.000+02:00", ZONE_PARIS);
        __CLR4_4_1jbejbelc8azugb.R.inc(25802);DateTime b = new DateTime("2010-10-31T02:01:00.000+02:00", ZONE_PARIS);
        __CLR4_4_1jbejbelc8azugb.R.inc(25803);Period period = new Period(a, b, PeriodType.standard());
        __CLR4_4_1jbejbelc8azugb.R.inc(25804);assertEquals("PT1M", period.toString());
    }finally{__CLR4_4_1jbejbelc8azugb.R.flushNeeded();}}

    public void testForum4013394_retainOffsetWhenRetainFields_sameOffsetsDifferentZones() {__CLR4_4_1jbejbelc8azugb.R.globalSliceStart(getClass().getName(),25805);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ycks1qjwt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jbejbelc8azugb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jbejbelc8azugb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.testForum4013394_retainOffsetWhenRetainFields_sameOffsetsDifferentZones",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25805,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ycks1qjwt(){try{__CLR4_4_1jbejbelc8azugb.R.inc(25805);
        __CLR4_4_1jbejbelc8azugb.R.inc(25806);final DateTimeZone fromDTZ = DateTimeZone.forID("Europe/London");
        __CLR4_4_1jbejbelc8azugb.R.inc(25807);final DateTimeZone toDTZ = DateTimeZone.forID("Europe/Lisbon");
        __CLR4_4_1jbejbelc8azugb.R.inc(25808);DateTime baseBefore = new DateTime(2007, 10, 28, 1, 15, fromDTZ).minusHours(1);
        __CLR4_4_1jbejbelc8azugb.R.inc(25809);DateTime baseAfter = new DateTime(2007, 10, 28, 1, 15, fromDTZ);
        __CLR4_4_1jbejbelc8azugb.R.inc(25810);DateTime testBefore = baseBefore.withZoneRetainFields(toDTZ);
        __CLR4_4_1jbejbelc8azugb.R.inc(25811);DateTime testAfter = baseAfter.withZoneRetainFields(toDTZ);
        // toString ignores time-zone but includes offset
        __CLR4_4_1jbejbelc8azugb.R.inc(25812);assertEquals(baseBefore.toString(), testBefore.toString());
        __CLR4_4_1jbejbelc8azugb.R.inc(25813);assertEquals(baseAfter.toString(), testAfter.toString());
    }finally{__CLR4_4_1jbejbelc8azugb.R.flushNeeded();}}

    //-------------------------------------------------------------------------
    public void testBug3192457_adjustOffset() {__CLR4_4_1jbejbelc8azugb.R.globalSliceStart(getClass().getName(),25814);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1b5kf05jx2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jbejbelc8azugb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jbejbelc8azugb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.testBug3192457_adjustOffset",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25814,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1b5kf05jx2(){try{__CLR4_4_1jbejbelc8azugb.R.inc(25814);
        __CLR4_4_1jbejbelc8azugb.R.inc(25815);final DateTimeZone zone = DateTimeZone.forID("Europe/Paris");
        __CLR4_4_1jbejbelc8azugb.R.inc(25816);DateTime base = new DateTime(2007, 10, 28, 3, 15, zone);
        __CLR4_4_1jbejbelc8azugb.R.inc(25817);DateTime baseBefore = base.minusHours(2);
        __CLR4_4_1jbejbelc8azugb.R.inc(25818);DateTime baseAfter = base.minusHours(1);
        
        __CLR4_4_1jbejbelc8azugb.R.inc(25819);assertSame(base, base.withEarlierOffsetAtOverlap());
        __CLR4_4_1jbejbelc8azugb.R.inc(25820);assertSame(base, base.withLaterOffsetAtOverlap());
        
        __CLR4_4_1jbejbelc8azugb.R.inc(25821);assertSame(baseBefore, baseBefore.withEarlierOffsetAtOverlap());
        __CLR4_4_1jbejbelc8azugb.R.inc(25822);assertEquals(baseAfter, baseBefore.withLaterOffsetAtOverlap());
        
        __CLR4_4_1jbejbelc8azugb.R.inc(25823);assertSame(baseAfter, baseAfter.withLaterOffsetAtOverlap());
        __CLR4_4_1jbejbelc8azugb.R.inc(25824);assertEquals(baseBefore, baseAfter.withEarlierOffsetAtOverlap());
    }finally{__CLR4_4_1jbejbelc8azugb.R.flushNeeded();}}

    public void testBug3476684_adjustOffset() {__CLR4_4_1jbejbelc8azugb.R.globalSliceStart(getClass().getName(),25825);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mys6jcjxd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jbejbelc8azugb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jbejbelc8azugb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.testBug3476684_adjustOffset",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25825,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mys6jcjxd(){try{__CLR4_4_1jbejbelc8azugb.R.inc(25825);
        __CLR4_4_1jbejbelc8azugb.R.inc(25826);final DateTimeZone zone = DateTimeZone.forID("America/Sao_Paulo");
        __CLR4_4_1jbejbelc8azugb.R.inc(25827);DateTime base = new DateTime(2012, 2, 25, 22, 15, zone);
        __CLR4_4_1jbejbelc8azugb.R.inc(25828);DateTime baseBefore = base.plusHours(1);  // 23:15 (first)
        __CLR4_4_1jbejbelc8azugb.R.inc(25829);DateTime baseAfter = base.plusHours(2);  // 23:15 (second)
        
        __CLR4_4_1jbejbelc8azugb.R.inc(25830);assertSame(base, base.withEarlierOffsetAtOverlap());
        __CLR4_4_1jbejbelc8azugb.R.inc(25831);assertSame(base, base.withLaterOffsetAtOverlap());
        
        __CLR4_4_1jbejbelc8azugb.R.inc(25832);assertSame(baseBefore, baseBefore.withEarlierOffsetAtOverlap());
        __CLR4_4_1jbejbelc8azugb.R.inc(25833);assertEquals(baseAfter, baseBefore.withLaterOffsetAtOverlap());
        
        __CLR4_4_1jbejbelc8azugb.R.inc(25834);assertSame(baseAfter, baseAfter.withLaterOffsetAtOverlap());
        __CLR4_4_1jbejbelc8azugb.R.inc(25835);assertEquals(baseBefore, baseAfter.withEarlierOffsetAtOverlap());
    }finally{__CLR4_4_1jbejbelc8azugb.R.flushNeeded();}}

    public void testBug3476684_adjustOffset_springGap() {__CLR4_4_1jbejbelc8azugb.R.globalSliceStart(getClass().getName(),25836);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_124ldwijxo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jbejbelc8azugb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jbejbelc8azugb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.testBug3476684_adjustOffset_springGap",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25836,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_124ldwijxo(){try{__CLR4_4_1jbejbelc8azugb.R.inc(25836);
      __CLR4_4_1jbejbelc8azugb.R.inc(25837);final DateTimeZone zone = DateTimeZone.forID("America/Sao_Paulo");
      __CLR4_4_1jbejbelc8azugb.R.inc(25838);DateTime base = new DateTime(2011, 10, 15, 22, 15, zone);
      __CLR4_4_1jbejbelc8azugb.R.inc(25839);DateTime baseBefore = base.plusHours(1);  // 23:15
      __CLR4_4_1jbejbelc8azugb.R.inc(25840);DateTime baseAfter = base.plusHours(2);  // 01:15
      
      __CLR4_4_1jbejbelc8azugb.R.inc(25841);assertSame(base, base.withEarlierOffsetAtOverlap());
      __CLR4_4_1jbejbelc8azugb.R.inc(25842);assertSame(base, base.withLaterOffsetAtOverlap());
      
      __CLR4_4_1jbejbelc8azugb.R.inc(25843);assertSame(baseBefore, baseBefore.withEarlierOffsetAtOverlap());
      __CLR4_4_1jbejbelc8azugb.R.inc(25844);assertEquals(baseBefore, baseBefore.withLaterOffsetAtOverlap());
      
      __CLR4_4_1jbejbelc8azugb.R.inc(25845);assertSame(baseAfter, baseAfter.withLaterOffsetAtOverlap());
      __CLR4_4_1jbejbelc8azugb.R.inc(25846);assertEquals(baseAfter, baseAfter.withEarlierOffsetAtOverlap());
  }finally{__CLR4_4_1jbejbelc8azugb.R.flushNeeded();}}

    // ensure Summer time picked
    //-----------------------------------------------------------------------
    public void testDateTimeCreation_athens() {__CLR4_4_1jbejbelc8azugb.R.globalSliceStart(getClass().getName(),25847);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1z9nr9rjxz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jbejbelc8azugb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jbejbelc8azugb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.testDateTimeCreation_athens",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25847,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1z9nr9rjxz(){try{__CLR4_4_1jbejbelc8azugb.R.inc(25847);
        __CLR4_4_1jbejbelc8azugb.R.inc(25848);DateTimeZone zone = DateTimeZone.forID("Europe/Athens");
        __CLR4_4_1jbejbelc8azugb.R.inc(25849);DateTime base = new DateTime(2011, 10, 30, 3, 15, zone);
        __CLR4_4_1jbejbelc8azugb.R.inc(25850);assertEquals("2011-10-30T03:15:00.000+03:00", base.toString());
        __CLR4_4_1jbejbelc8azugb.R.inc(25851);assertEquals("2011-10-30T03:15:00.000+02:00", base.plusHours(1).toString());
    }finally{__CLR4_4_1jbejbelc8azugb.R.flushNeeded();}}

    public void testDateTimeCreation_paris() {__CLR4_4_1jbejbelc8azugb.R.globalSliceStart(getClass().getName(),25852);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18zwc81jy4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jbejbelc8azugb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jbejbelc8azugb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.testDateTimeCreation_paris",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25852,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18zwc81jy4(){try{__CLR4_4_1jbejbelc8azugb.R.inc(25852);
        __CLR4_4_1jbejbelc8azugb.R.inc(25853);DateTimeZone zone = DateTimeZone.forID("Europe/Paris");
        __CLR4_4_1jbejbelc8azugb.R.inc(25854);DateTime base = new DateTime(2011, 10, 30, 2, 15, zone);
        __CLR4_4_1jbejbelc8azugb.R.inc(25855);assertEquals("2011-10-30T02:15:00.000+02:00", base.toString());
        __CLR4_4_1jbejbelc8azugb.R.inc(25856);assertEquals("2011-10-30T02:15:00.000+01:00", base.plusHours(1).toString());
    }finally{__CLR4_4_1jbejbelc8azugb.R.flushNeeded();}}

    public void testDateTimeCreation_london() {__CLR4_4_1jbejbelc8azugb.R.globalSliceStart(getClass().getName(),25857);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mzakdqjy9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jbejbelc8azugb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jbejbelc8azugb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.testDateTimeCreation_london",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25857,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mzakdqjy9(){try{__CLR4_4_1jbejbelc8azugb.R.inc(25857);
        __CLR4_4_1jbejbelc8azugb.R.inc(25858);DateTimeZone zone = DateTimeZone.forID("Europe/London");
        __CLR4_4_1jbejbelc8azugb.R.inc(25859);DateTime base = new DateTime(2011, 10, 30, 1, 15, zone);
        __CLR4_4_1jbejbelc8azugb.R.inc(25860);assertEquals("2011-10-30T01:15:00.000+01:00", base.toString());
        __CLR4_4_1jbejbelc8azugb.R.inc(25861);assertEquals("2011-10-30T01:15:00.000Z", base.plusHours(1).toString());
    }finally{__CLR4_4_1jbejbelc8azugb.R.flushNeeded();}}

    public void testDateTimeCreation_newYork() {__CLR4_4_1jbejbelc8azugb.R.globalSliceStart(getClass().getName(),25862);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16d81wdjye();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jbejbelc8azugb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jbejbelc8azugb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.testDateTimeCreation_newYork",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25862,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16d81wdjye(){try{__CLR4_4_1jbejbelc8azugb.R.inc(25862);
        __CLR4_4_1jbejbelc8azugb.R.inc(25863);DateTimeZone zone = DateTimeZone.forID("America/New_York");
        __CLR4_4_1jbejbelc8azugb.R.inc(25864);DateTime base = new DateTime(2010, 11, 7, 1, 15, zone);
        __CLR4_4_1jbejbelc8azugb.R.inc(25865);assertEquals("2010-11-07T01:15:00.000-04:00", base.toString());
        __CLR4_4_1jbejbelc8azugb.R.inc(25866);assertEquals("2010-11-07T01:15:00.000-05:00", base.plusHours(1).toString());
    }finally{__CLR4_4_1jbejbelc8azugb.R.flushNeeded();}}

    public void testDateTimeCreation_losAngeles() {__CLR4_4_1jbejbelc8azugb.R.globalSliceStart(getClass().getName(),25867);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gyhk9ljyj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jbejbelc8azugb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jbejbelc8azugb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.testDateTimeCreation_losAngeles",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25867,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gyhk9ljyj(){try{__CLR4_4_1jbejbelc8azugb.R.inc(25867);
        __CLR4_4_1jbejbelc8azugb.R.inc(25868);DateTimeZone zone = DateTimeZone.forID("America/Los_Angeles");
        __CLR4_4_1jbejbelc8azugb.R.inc(25869);DateTime base = new DateTime(2010, 11, 7, 1, 15, zone);
        __CLR4_4_1jbejbelc8azugb.R.inc(25870);assertEquals("2010-11-07T01:15:00.000-07:00", base.toString());
        __CLR4_4_1jbejbelc8azugb.R.inc(25871);assertEquals("2010-11-07T01:15:00.000-08:00", base.plusHours(1).toString());
    }finally{__CLR4_4_1jbejbelc8azugb.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    //-----------------------------------------------------------------------
    //-----------------------------------------------------------------------
    private void doTest_getOffsetFromLocal(int month, int day, int hour, int min, String expected, DateTimeZone zone) {try{__CLR4_4_1jbejbelc8azugb.R.inc(25872);
        __CLR4_4_1jbejbelc8azugb.R.inc(25873);doTest_getOffsetFromLocal(2007, month, day, hour, min, 0, 0, expected, zone);
    }finally{__CLR4_4_1jbejbelc8azugb.R.flushNeeded();}}

    private void doTest_getOffsetFromLocal(int month, int day, int hour, int min, int sec, int milli, String expected, DateTimeZone zone) {try{__CLR4_4_1jbejbelc8azugb.R.inc(25874);
        __CLR4_4_1jbejbelc8azugb.R.inc(25875);doTest_getOffsetFromLocal(2007, month, day, hour, min, sec, milli, expected, zone);
    }finally{__CLR4_4_1jbejbelc8azugb.R.flushNeeded();}}

    private void doTest_getOffsetFromLocal(int year, int month, int day, int hour, int min, String expected, DateTimeZone zone) {try{__CLR4_4_1jbejbelc8azugb.R.inc(25876);
        __CLR4_4_1jbejbelc8azugb.R.inc(25877);doTest_getOffsetFromLocal(year, month, day, hour, min, 0, 0, expected, zone);
    }finally{__CLR4_4_1jbejbelc8azugb.R.flushNeeded();}}

    private void doTest_getOffsetFromLocal(int year, int month, int day, int hour, int min, int sec, int milli, String expected, DateTimeZone zone) {try{__CLR4_4_1jbejbelc8azugb.R.inc(25878);
        __CLR4_4_1jbejbelc8azugb.R.inc(25879);DateTime dt = new DateTime(year, month, day, hour, min, sec, milli, DateTimeZone.UTC);
        __CLR4_4_1jbejbelc8azugb.R.inc(25880);int offset = zone.getOffsetFromLocal(dt.getMillis());
        __CLR4_4_1jbejbelc8azugb.R.inc(25881);DateTime res = new DateTime(dt.getMillis() - offset, zone);
        __CLR4_4_1jbejbelc8azugb.R.inc(25882);assertEquals(res.toString(), expected, res.toString());
    }finally{__CLR4_4_1jbejbelc8azugb.R.flushNeeded();}}

}
