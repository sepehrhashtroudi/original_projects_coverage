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

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * This class is a Junit unit test for Hours.
 *
 * @author Stephen Colebourne
 */
public class TestHours extends TestCase {static class __CLR4_4_1mezmezlc8azurc{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672271031490L,8589935092L,29280,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    // Test in 2002/03 as time zones are more well known
    // (before the late 90's they were all over the place)
    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");

    public static void main(String[] args) {try{__CLR4_4_1mezmezlc8azurc.R.inc(29051);
        __CLR4_4_1mezmezlc8azurc.R.inc(29052);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1mezmezlc8azurc.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1mezmezlc8azurc.R.inc(29053);
        __CLR4_4_1mezmezlc8azurc.R.inc(29054);return new TestSuite(TestHours.class);
    }finally{__CLR4_4_1mezmezlc8azurc.R.flushNeeded();}}

    public TestHours(String name) {
        super(name);__CLR4_4_1mezmezlc8azurc.R.inc(29056);try{__CLR4_4_1mezmezlc8azurc.R.inc(29055);
    }finally{__CLR4_4_1mezmezlc8azurc.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1mezmezlc8azurc.R.inc(29057);
    }finally{__CLR4_4_1mezmezlc8azurc.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1mezmezlc8azurc.R.inc(29058);
    }finally{__CLR4_4_1mezmezlc8azurc.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testConstants() {__CLR4_4_1mezmezlc8azurc.R.globalSliceStart(getClass().getName(),29059);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15epzlwmf7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mezmezlc8azurc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mezmezlc8azurc.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestHours.testConstants",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29059,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15epzlwmf7(){try{__CLR4_4_1mezmezlc8azurc.R.inc(29059);
        __CLR4_4_1mezmezlc8azurc.R.inc(29060);assertEquals(0, Hours.ZERO.getHours());
        __CLR4_4_1mezmezlc8azurc.R.inc(29061);assertEquals(1, Hours.ONE.getHours());
        __CLR4_4_1mezmezlc8azurc.R.inc(29062);assertEquals(2, Hours.TWO.getHours());
        __CLR4_4_1mezmezlc8azurc.R.inc(29063);assertEquals(3, Hours.THREE.getHours());
        __CLR4_4_1mezmezlc8azurc.R.inc(29064);assertEquals(4, Hours.FOUR.getHours());
        __CLR4_4_1mezmezlc8azurc.R.inc(29065);assertEquals(5, Hours.FIVE.getHours());
        __CLR4_4_1mezmezlc8azurc.R.inc(29066);assertEquals(6, Hours.SIX.getHours());
        __CLR4_4_1mezmezlc8azurc.R.inc(29067);assertEquals(7, Hours.SEVEN.getHours());
        __CLR4_4_1mezmezlc8azurc.R.inc(29068);assertEquals(8, Hours.EIGHT.getHours());
        __CLR4_4_1mezmezlc8azurc.R.inc(29069);assertEquals(Integer.MAX_VALUE, Hours.MAX_VALUE.getHours());
        __CLR4_4_1mezmezlc8azurc.R.inc(29070);assertEquals(Integer.MIN_VALUE, Hours.MIN_VALUE.getHours());
    }finally{__CLR4_4_1mezmezlc8azurc.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testFactory_hours_int() {__CLR4_4_1mezmezlc8azurc.R.globalSliceStart(getClass().getName(),29071);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kel8ynmfj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mezmezlc8azurc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mezmezlc8azurc.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestHours.testFactory_hours_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29071,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kel8ynmfj(){try{__CLR4_4_1mezmezlc8azurc.R.inc(29071);
        __CLR4_4_1mezmezlc8azurc.R.inc(29072);assertSame(Hours.ZERO, Hours.hours(0));
        __CLR4_4_1mezmezlc8azurc.R.inc(29073);assertSame(Hours.ONE, Hours.hours(1));
        __CLR4_4_1mezmezlc8azurc.R.inc(29074);assertSame(Hours.TWO, Hours.hours(2));
        __CLR4_4_1mezmezlc8azurc.R.inc(29075);assertSame(Hours.THREE, Hours.hours(3));
        __CLR4_4_1mezmezlc8azurc.R.inc(29076);assertSame(Hours.FOUR, Hours.hours(4));
        __CLR4_4_1mezmezlc8azurc.R.inc(29077);assertSame(Hours.FIVE, Hours.hours(5));
        __CLR4_4_1mezmezlc8azurc.R.inc(29078);assertSame(Hours.SIX, Hours.hours(6));
        __CLR4_4_1mezmezlc8azurc.R.inc(29079);assertSame(Hours.SEVEN, Hours.hours(7));
        __CLR4_4_1mezmezlc8azurc.R.inc(29080);assertSame(Hours.EIGHT, Hours.hours(8));
        __CLR4_4_1mezmezlc8azurc.R.inc(29081);assertSame(Hours.MAX_VALUE, Hours.hours(Integer.MAX_VALUE));
        __CLR4_4_1mezmezlc8azurc.R.inc(29082);assertSame(Hours.MIN_VALUE, Hours.hours(Integer.MIN_VALUE));
        __CLR4_4_1mezmezlc8azurc.R.inc(29083);assertEquals(-1, Hours.hours(-1).getHours());
        __CLR4_4_1mezmezlc8azurc.R.inc(29084);assertEquals(9, Hours.hours(9).getHours());
    }finally{__CLR4_4_1mezmezlc8azurc.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testFactory_hoursBetween_RInstant() {__CLR4_4_1mezmezlc8azurc.R.globalSliceStart(getClass().getName(),29085);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_120ilp1mfx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mezmezlc8azurc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mezmezlc8azurc.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestHours.testFactory_hoursBetween_RInstant",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29085,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_120ilp1mfx(){try{__CLR4_4_1mezmezlc8azurc.R.inc(29085);
        __CLR4_4_1mezmezlc8azurc.R.inc(29086);DateTime start = new DateTime(2006, 6, 9, 12, 0, 0, 0, PARIS);
        __CLR4_4_1mezmezlc8azurc.R.inc(29087);DateTime end1 = new DateTime(2006, 6, 9, 15, 0, 0, 0, PARIS);
        __CLR4_4_1mezmezlc8azurc.R.inc(29088);DateTime end2 = new DateTime(2006, 6, 9, 18, 0, 0, 0, PARIS);
        
        __CLR4_4_1mezmezlc8azurc.R.inc(29089);assertEquals(3, Hours.hoursBetween(start, end1).getHours());
        __CLR4_4_1mezmezlc8azurc.R.inc(29090);assertEquals(0, Hours.hoursBetween(start, start).getHours());
        __CLR4_4_1mezmezlc8azurc.R.inc(29091);assertEquals(0, Hours.hoursBetween(end1, end1).getHours());
        __CLR4_4_1mezmezlc8azurc.R.inc(29092);assertEquals(-3, Hours.hoursBetween(end1, start).getHours());
        __CLR4_4_1mezmezlc8azurc.R.inc(29093);assertEquals(6, Hours.hoursBetween(start, end2).getHours());
    }finally{__CLR4_4_1mezmezlc8azurc.R.flushNeeded();}}

    public void testFactory_hoursBetween_RPartial() {__CLR4_4_1mezmezlc8azurc.R.globalSliceStart(getClass().getName(),29094);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ihma5xmg6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mezmezlc8azurc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mezmezlc8azurc.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestHours.testFactory_hoursBetween_RPartial",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29094,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ihma5xmg6(){try{__CLR4_4_1mezmezlc8azurc.R.inc(29094);
        __CLR4_4_1mezmezlc8azurc.R.inc(29095);LocalTime start = new LocalTime(12, 0);
        __CLR4_4_1mezmezlc8azurc.R.inc(29096);LocalTime end1 = new LocalTime(15, 0);
        __CLR4_4_1mezmezlc8azurc.R.inc(29097);@SuppressWarnings("deprecation")
        TimeOfDay end2 = new TimeOfDay(18, 0);
        
        __CLR4_4_1mezmezlc8azurc.R.inc(29098);assertEquals(3, Hours.hoursBetween(start, end1).getHours());
        __CLR4_4_1mezmezlc8azurc.R.inc(29099);assertEquals(0, Hours.hoursBetween(start, start).getHours());
        __CLR4_4_1mezmezlc8azurc.R.inc(29100);assertEquals(0, Hours.hoursBetween(end1, end1).getHours());
        __CLR4_4_1mezmezlc8azurc.R.inc(29101);assertEquals(-3, Hours.hoursBetween(end1, start).getHours());
        __CLR4_4_1mezmezlc8azurc.R.inc(29102);assertEquals(6, Hours.hoursBetween(start, end2).getHours());
    }finally{__CLR4_4_1mezmezlc8azurc.R.flushNeeded();}}

    public void testFactory_hoursIn_RInterval() {__CLR4_4_1mezmezlc8azurc.R.globalSliceStart(getClass().getName(),29103);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1662vf0mgf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mezmezlc8azurc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mezmezlc8azurc.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestHours.testFactory_hoursIn_RInterval",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29103,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1662vf0mgf(){try{__CLR4_4_1mezmezlc8azurc.R.inc(29103);
        __CLR4_4_1mezmezlc8azurc.R.inc(29104);DateTime start = new DateTime(2006, 6, 9, 12, 0, 0, 0, PARIS);
        __CLR4_4_1mezmezlc8azurc.R.inc(29105);DateTime end1 = new DateTime(2006, 6, 9, 15, 0, 0, 0, PARIS);
        __CLR4_4_1mezmezlc8azurc.R.inc(29106);DateTime end2 = new DateTime(2006, 6, 9, 18, 0, 0, 0, PARIS);
        
        __CLR4_4_1mezmezlc8azurc.R.inc(29107);assertEquals(0, Hours.hoursIn((ReadableInterval) null).getHours());
        __CLR4_4_1mezmezlc8azurc.R.inc(29108);assertEquals(3, Hours.hoursIn(new Interval(start, end1)).getHours());
        __CLR4_4_1mezmezlc8azurc.R.inc(29109);assertEquals(0, Hours.hoursIn(new Interval(start, start)).getHours());
        __CLR4_4_1mezmezlc8azurc.R.inc(29110);assertEquals(0, Hours.hoursIn(new Interval(end1, end1)).getHours());
        __CLR4_4_1mezmezlc8azurc.R.inc(29111);assertEquals(6, Hours.hoursIn(new Interval(start, end2)).getHours());
    }finally{__CLR4_4_1mezmezlc8azurc.R.flushNeeded();}}

    public void testFactory_standardHoursIn_RPeriod() {__CLR4_4_1mezmezlc8azurc.R.globalSliceStart(getClass().getName(),29112);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18bwylnmgo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mezmezlc8azurc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mezmezlc8azurc.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestHours.testFactory_standardHoursIn_RPeriod",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29112,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18bwylnmgo(){try{__CLR4_4_1mezmezlc8azurc.R.inc(29112);
        __CLR4_4_1mezmezlc8azurc.R.inc(29113);assertEquals(0, Hours.standardHoursIn((ReadablePeriod) null).getHours());
        __CLR4_4_1mezmezlc8azurc.R.inc(29114);assertEquals(0, Hours.standardHoursIn(Period.ZERO).getHours());
        __CLR4_4_1mezmezlc8azurc.R.inc(29115);assertEquals(1, Hours.standardHoursIn(new Period(0, 0, 0, 0, 1, 0, 0, 0)).getHours());
        __CLR4_4_1mezmezlc8azurc.R.inc(29116);assertEquals(123, Hours.standardHoursIn(Period.hours(123)).getHours());
        __CLR4_4_1mezmezlc8azurc.R.inc(29117);assertEquals(-987, Hours.standardHoursIn(Period.hours(-987)).getHours());
        __CLR4_4_1mezmezlc8azurc.R.inc(29118);assertEquals(1, Hours.standardHoursIn(Period.minutes(119)).getHours());
        __CLR4_4_1mezmezlc8azurc.R.inc(29119);assertEquals(2, Hours.standardHoursIn(Period.minutes(120)).getHours());
        __CLR4_4_1mezmezlc8azurc.R.inc(29120);assertEquals(2, Hours.standardHoursIn(Period.minutes(121)).getHours());
        __CLR4_4_1mezmezlc8azurc.R.inc(29121);assertEquals(48, Hours.standardHoursIn(Period.days(2)).getHours());
        __CLR4_4_1mezmezlc8azurc.R.inc(29122);try {
            __CLR4_4_1mezmezlc8azurc.R.inc(29123);Hours.standardHoursIn(Period.months(1));
            __CLR4_4_1mezmezlc8azurc.R.inc(29124);fail();
        } catch (IllegalArgumentException ex) {
            // expeceted
        }
    }finally{__CLR4_4_1mezmezlc8azurc.R.flushNeeded();}}

    public void testFactory_parseHours_String() {__CLR4_4_1mezmezlc8azurc.R.globalSliceStart(getClass().getName(),29125);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17surxwmh1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mezmezlc8azurc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mezmezlc8azurc.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestHours.testFactory_parseHours_String",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29125,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17surxwmh1(){try{__CLR4_4_1mezmezlc8azurc.R.inc(29125);
        __CLR4_4_1mezmezlc8azurc.R.inc(29126);assertEquals(0, Hours.parseHours((String) null).getHours());
        __CLR4_4_1mezmezlc8azurc.R.inc(29127);assertEquals(0, Hours.parseHours("PT0H").getHours());
        __CLR4_4_1mezmezlc8azurc.R.inc(29128);assertEquals(1, Hours.parseHours("PT1H").getHours());
        __CLR4_4_1mezmezlc8azurc.R.inc(29129);assertEquals(-3, Hours.parseHours("PT-3H").getHours());
        __CLR4_4_1mezmezlc8azurc.R.inc(29130);assertEquals(2, Hours.parseHours("P0Y0M0DT2H").getHours());
        __CLR4_4_1mezmezlc8azurc.R.inc(29131);assertEquals(2, Hours.parseHours("PT2H0M").getHours());
        __CLR4_4_1mezmezlc8azurc.R.inc(29132);try {
            __CLR4_4_1mezmezlc8azurc.R.inc(29133);Hours.parseHours("P1Y1D");
            __CLR4_4_1mezmezlc8azurc.R.inc(29134);fail();
        } catch (IllegalArgumentException ex) {
            // expeceted
        }
        __CLR4_4_1mezmezlc8azurc.R.inc(29135);try {
            __CLR4_4_1mezmezlc8azurc.R.inc(29136);Hours.parseHours("P1DT1H");
            __CLR4_4_1mezmezlc8azurc.R.inc(29137);fail();
        } catch (IllegalArgumentException ex) {
            // expeceted
        }
    }finally{__CLR4_4_1mezmezlc8azurc.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testGetMethods() {__CLR4_4_1mezmezlc8azurc.R.globalSliceStart(getClass().getName(),29138);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12sjdmzmhe();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mezmezlc8azurc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mezmezlc8azurc.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestHours.testGetMethods",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29138,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12sjdmzmhe(){try{__CLR4_4_1mezmezlc8azurc.R.inc(29138);
        __CLR4_4_1mezmezlc8azurc.R.inc(29139);Hours test = Hours.hours(20);
        __CLR4_4_1mezmezlc8azurc.R.inc(29140);assertEquals(20, test.getHours());
    }finally{__CLR4_4_1mezmezlc8azurc.R.flushNeeded();}}

    public void testGetFieldType() {__CLR4_4_1mezmezlc8azurc.R.globalSliceStart(getClass().getName(),29141);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18z86mvmhh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mezmezlc8azurc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mezmezlc8azurc.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestHours.testGetFieldType",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29141,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18z86mvmhh(){try{__CLR4_4_1mezmezlc8azurc.R.inc(29141);
        __CLR4_4_1mezmezlc8azurc.R.inc(29142);Hours test = Hours.hours(20);
        __CLR4_4_1mezmezlc8azurc.R.inc(29143);assertEquals(DurationFieldType.hours(), test.getFieldType());
    }finally{__CLR4_4_1mezmezlc8azurc.R.flushNeeded();}}

    public void testGetPeriodType() {__CLR4_4_1mezmezlc8azurc.R.globalSliceStart(getClass().getName(),29144);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ivat1imhk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mezmezlc8azurc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mezmezlc8azurc.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestHours.testGetPeriodType",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29144,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ivat1imhk(){try{__CLR4_4_1mezmezlc8azurc.R.inc(29144);
        __CLR4_4_1mezmezlc8azurc.R.inc(29145);Hours test = Hours.hours(20);
        __CLR4_4_1mezmezlc8azurc.R.inc(29146);assertEquals(PeriodType.hours(), test.getPeriodType());
    }finally{__CLR4_4_1mezmezlc8azurc.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testIsGreaterThan() {__CLR4_4_1mezmezlc8azurc.R.globalSliceStart(getClass().getName(),29147);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s5pnommhn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mezmezlc8azurc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mezmezlc8azurc.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestHours.testIsGreaterThan",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29147,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s5pnommhn(){try{__CLR4_4_1mezmezlc8azurc.R.inc(29147);
        __CLR4_4_1mezmezlc8azurc.R.inc(29148);assertEquals(true, Hours.THREE.isGreaterThan(Hours.TWO));
        __CLR4_4_1mezmezlc8azurc.R.inc(29149);assertEquals(false, Hours.THREE.isGreaterThan(Hours.THREE));
        __CLR4_4_1mezmezlc8azurc.R.inc(29150);assertEquals(false, Hours.TWO.isGreaterThan(Hours.THREE));
        __CLR4_4_1mezmezlc8azurc.R.inc(29151);assertEquals(true, Hours.ONE.isGreaterThan(null));
        __CLR4_4_1mezmezlc8azurc.R.inc(29152);assertEquals(false, Hours.hours(-1).isGreaterThan(null));
    }finally{__CLR4_4_1mezmezlc8azurc.R.flushNeeded();}}

    public void testIsLessThan() {__CLR4_4_1mezmezlc8azurc.R.globalSliceStart(getClass().getName(),29153);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rmk0kdmht();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mezmezlc8azurc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mezmezlc8azurc.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestHours.testIsLessThan",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29153,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rmk0kdmht(){try{__CLR4_4_1mezmezlc8azurc.R.inc(29153);
        __CLR4_4_1mezmezlc8azurc.R.inc(29154);assertEquals(false, Hours.THREE.isLessThan(Hours.TWO));
        __CLR4_4_1mezmezlc8azurc.R.inc(29155);assertEquals(false, Hours.THREE.isLessThan(Hours.THREE));
        __CLR4_4_1mezmezlc8azurc.R.inc(29156);assertEquals(true, Hours.TWO.isLessThan(Hours.THREE));
        __CLR4_4_1mezmezlc8azurc.R.inc(29157);assertEquals(false, Hours.ONE.isLessThan(null));
        __CLR4_4_1mezmezlc8azurc.R.inc(29158);assertEquals(true, Hours.hours(-1).isLessThan(null));
    }finally{__CLR4_4_1mezmezlc8azurc.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testToString() {__CLR4_4_1mezmezlc8azurc.R.globalSliceStart(getClass().getName(),29159);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hrxdidmhz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mezmezlc8azurc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mezmezlc8azurc.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestHours.testToString",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29159,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hrxdidmhz(){try{__CLR4_4_1mezmezlc8azurc.R.inc(29159);
        __CLR4_4_1mezmezlc8azurc.R.inc(29160);Hours test = Hours.hours(20);
        __CLR4_4_1mezmezlc8azurc.R.inc(29161);assertEquals("PT20H", test.toString());
        
        __CLR4_4_1mezmezlc8azurc.R.inc(29162);test = Hours.hours(-20);
        __CLR4_4_1mezmezlc8azurc.R.inc(29163);assertEquals("PT-20H", test.toString());
    }finally{__CLR4_4_1mezmezlc8azurc.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testSerialization() throws Exception {__CLR4_4_1mezmezlc8azurc.R.globalSliceStart(getClass().getName(),29164);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16m1on9mi4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mezmezlc8azurc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mezmezlc8azurc.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestHours.testSerialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29164,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16m1on9mi4() throws Exception{try{__CLR4_4_1mezmezlc8azurc.R.inc(29164);
        __CLR4_4_1mezmezlc8azurc.R.inc(29165);Hours test = Hours.SEVEN;
        
        __CLR4_4_1mezmezlc8azurc.R.inc(29166);ByteArrayOutputStream baos = new ByteArrayOutputStream();
        __CLR4_4_1mezmezlc8azurc.R.inc(29167);ObjectOutputStream oos = new ObjectOutputStream(baos);
        __CLR4_4_1mezmezlc8azurc.R.inc(29168);oos.writeObject(test);
        __CLR4_4_1mezmezlc8azurc.R.inc(29169);byte[] bytes = baos.toByteArray();
        __CLR4_4_1mezmezlc8azurc.R.inc(29170);oos.close();
        
        __CLR4_4_1mezmezlc8azurc.R.inc(29171);ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        __CLR4_4_1mezmezlc8azurc.R.inc(29172);ObjectInputStream ois = new ObjectInputStream(bais);
        __CLR4_4_1mezmezlc8azurc.R.inc(29173);Hours result = (Hours) ois.readObject();
        __CLR4_4_1mezmezlc8azurc.R.inc(29174);ois.close();
        
        __CLR4_4_1mezmezlc8azurc.R.inc(29175);assertSame(test, result);
    }finally{__CLR4_4_1mezmezlc8azurc.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testToStandardWeeks() {__CLR4_4_1mezmezlc8azurc.R.globalSliceStart(getClass().getName(),29176);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pfkyx0mig();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mezmezlc8azurc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mezmezlc8azurc.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestHours.testToStandardWeeks",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29176,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pfkyx0mig(){try{__CLR4_4_1mezmezlc8azurc.R.inc(29176);
        __CLR4_4_1mezmezlc8azurc.R.inc(29177);Hours test = Hours.hours(24 * 7 * 2);
        __CLR4_4_1mezmezlc8azurc.R.inc(29178);Weeks expected = Weeks.weeks(2);
        __CLR4_4_1mezmezlc8azurc.R.inc(29179);assertEquals(expected, test.toStandardWeeks());
    }finally{__CLR4_4_1mezmezlc8azurc.R.flushNeeded();}}

    public void testToStandardDays() {__CLR4_4_1mezmezlc8azurc.R.globalSliceStart(getClass().getName(),29180);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1eftdm0mik();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mezmezlc8azurc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mezmezlc8azurc.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestHours.testToStandardDays",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29180,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1eftdm0mik(){try{__CLR4_4_1mezmezlc8azurc.R.inc(29180);
        __CLR4_4_1mezmezlc8azurc.R.inc(29181);Hours test = Hours.hours(24 * 2);
        __CLR4_4_1mezmezlc8azurc.R.inc(29182);Days expected = Days.days(2);
        __CLR4_4_1mezmezlc8azurc.R.inc(29183);assertEquals(expected, test.toStandardDays());
    }finally{__CLR4_4_1mezmezlc8azurc.R.flushNeeded();}}

    public void testToStandardMinutes() {__CLR4_4_1mezmezlc8azurc.R.globalSliceStart(getClass().getName(),29184);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1r0kt44mio();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mezmezlc8azurc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mezmezlc8azurc.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestHours.testToStandardMinutes",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29184,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1r0kt44mio(){try{__CLR4_4_1mezmezlc8azurc.R.inc(29184);
        __CLR4_4_1mezmezlc8azurc.R.inc(29185);Hours test = Hours.hours(3);
        __CLR4_4_1mezmezlc8azurc.R.inc(29186);Minutes expected = Minutes.minutes(3 * 60);
        __CLR4_4_1mezmezlc8azurc.R.inc(29187);assertEquals(expected, test.toStandardMinutes());
        
        __CLR4_4_1mezmezlc8azurc.R.inc(29188);try {
            __CLR4_4_1mezmezlc8azurc.R.inc(29189);Hours.MAX_VALUE.toStandardMinutes();
            __CLR4_4_1mezmezlc8azurc.R.inc(29190);fail();
        } catch (ArithmeticException ex) {
            // expected
        }
    }finally{__CLR4_4_1mezmezlc8azurc.R.flushNeeded();}}

    public void testToStandardSeconds() {__CLR4_4_1mezmezlc8azurc.R.globalSliceStart(getClass().getName(),29191);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1emeoqsmiv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mezmezlc8azurc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mezmezlc8azurc.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestHours.testToStandardSeconds",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29191,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1emeoqsmiv(){try{__CLR4_4_1mezmezlc8azurc.R.inc(29191);
        __CLR4_4_1mezmezlc8azurc.R.inc(29192);Hours test = Hours.hours(3);
        __CLR4_4_1mezmezlc8azurc.R.inc(29193);Seconds expected = Seconds.seconds(3 * 60 * 60);
        __CLR4_4_1mezmezlc8azurc.R.inc(29194);assertEquals(expected, test.toStandardSeconds());
        
        __CLR4_4_1mezmezlc8azurc.R.inc(29195);try {
            __CLR4_4_1mezmezlc8azurc.R.inc(29196);Hours.MAX_VALUE.toStandardSeconds();
            __CLR4_4_1mezmezlc8azurc.R.inc(29197);fail();
        } catch (ArithmeticException ex) {
            // expected
        }
    }finally{__CLR4_4_1mezmezlc8azurc.R.flushNeeded();}}

    public void testToStandardDuration() {__CLR4_4_1mezmezlc8azurc.R.globalSliceStart(getClass().getName(),29198);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1izmvnpmj2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mezmezlc8azurc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mezmezlc8azurc.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestHours.testToStandardDuration",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29198,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1izmvnpmj2(){try{__CLR4_4_1mezmezlc8azurc.R.inc(29198);
        __CLR4_4_1mezmezlc8azurc.R.inc(29199);Hours test = Hours.hours(20);
        __CLR4_4_1mezmezlc8azurc.R.inc(29200);Duration expected = new Duration(20L * DateTimeConstants.MILLIS_PER_HOUR);
        __CLR4_4_1mezmezlc8azurc.R.inc(29201);assertEquals(expected, test.toStandardDuration());
        
        __CLR4_4_1mezmezlc8azurc.R.inc(29202);expected = new Duration(((long) Integer.MAX_VALUE) * DateTimeConstants.MILLIS_PER_HOUR);
        __CLR4_4_1mezmezlc8azurc.R.inc(29203);assertEquals(expected, Hours.MAX_VALUE.toStandardDuration());
    }finally{__CLR4_4_1mezmezlc8azurc.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testPlus_int() {__CLR4_4_1mezmezlc8azurc.R.globalSliceStart(getClass().getName(),29204);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1scc4ebmj8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mezmezlc8azurc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mezmezlc8azurc.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestHours.testPlus_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29204,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1scc4ebmj8(){try{__CLR4_4_1mezmezlc8azurc.R.inc(29204);
        __CLR4_4_1mezmezlc8azurc.R.inc(29205);Hours test2 = Hours.hours(2);
        __CLR4_4_1mezmezlc8azurc.R.inc(29206);Hours result = test2.plus(3);
        __CLR4_4_1mezmezlc8azurc.R.inc(29207);assertEquals(2, test2.getHours());
        __CLR4_4_1mezmezlc8azurc.R.inc(29208);assertEquals(5, result.getHours());
        
        __CLR4_4_1mezmezlc8azurc.R.inc(29209);assertEquals(1, Hours.ONE.plus(0).getHours());
        
        __CLR4_4_1mezmezlc8azurc.R.inc(29210);try {
            __CLR4_4_1mezmezlc8azurc.R.inc(29211);Hours.MAX_VALUE.plus(1);
            __CLR4_4_1mezmezlc8azurc.R.inc(29212);fail();
        } catch (ArithmeticException ex) {
            // expected
        }
    }finally{__CLR4_4_1mezmezlc8azurc.R.flushNeeded();}}

    public void testPlus_Hours() {__CLR4_4_1mezmezlc8azurc.R.globalSliceStart(getClass().getName(),29213);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pmgrulmjh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mezmezlc8azurc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mezmezlc8azurc.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestHours.testPlus_Hours",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29213,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pmgrulmjh(){try{__CLR4_4_1mezmezlc8azurc.R.inc(29213);
        __CLR4_4_1mezmezlc8azurc.R.inc(29214);Hours test2 = Hours.hours(2);
        __CLR4_4_1mezmezlc8azurc.R.inc(29215);Hours test3 = Hours.hours(3);
        __CLR4_4_1mezmezlc8azurc.R.inc(29216);Hours result = test2.plus(test3);
        __CLR4_4_1mezmezlc8azurc.R.inc(29217);assertEquals(2, test2.getHours());
        __CLR4_4_1mezmezlc8azurc.R.inc(29218);assertEquals(3, test3.getHours());
        __CLR4_4_1mezmezlc8azurc.R.inc(29219);assertEquals(5, result.getHours());
        
        __CLR4_4_1mezmezlc8azurc.R.inc(29220);assertEquals(1, Hours.ONE.plus(Hours.ZERO).getHours());
        __CLR4_4_1mezmezlc8azurc.R.inc(29221);assertEquals(1, Hours.ONE.plus((Hours) null).getHours());
        
        __CLR4_4_1mezmezlc8azurc.R.inc(29222);try {
            __CLR4_4_1mezmezlc8azurc.R.inc(29223);Hours.MAX_VALUE.plus(Hours.ONE);
            __CLR4_4_1mezmezlc8azurc.R.inc(29224);fail();
        } catch (ArithmeticException ex) {
            // expected
        }
    }finally{__CLR4_4_1mezmezlc8azurc.R.flushNeeded();}}

    public void testMinus_int() {__CLR4_4_1mezmezlc8azurc.R.globalSliceStart(getClass().getName(),29225);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_118wkvpmjt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mezmezlc8azurc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mezmezlc8azurc.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestHours.testMinus_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29225,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_118wkvpmjt(){try{__CLR4_4_1mezmezlc8azurc.R.inc(29225);
        __CLR4_4_1mezmezlc8azurc.R.inc(29226);Hours test2 = Hours.hours(2);
        __CLR4_4_1mezmezlc8azurc.R.inc(29227);Hours result = test2.minus(3);
        __CLR4_4_1mezmezlc8azurc.R.inc(29228);assertEquals(2, test2.getHours());
        __CLR4_4_1mezmezlc8azurc.R.inc(29229);assertEquals(-1, result.getHours());
        
        __CLR4_4_1mezmezlc8azurc.R.inc(29230);assertEquals(1, Hours.ONE.minus(0).getHours());
        
        __CLR4_4_1mezmezlc8azurc.R.inc(29231);try {
            __CLR4_4_1mezmezlc8azurc.R.inc(29232);Hours.MIN_VALUE.minus(1);
            __CLR4_4_1mezmezlc8azurc.R.inc(29233);fail();
        } catch (ArithmeticException ex) {
            // expected
        }
    }finally{__CLR4_4_1mezmezlc8azurc.R.flushNeeded();}}

    public void testMinus_Hours() {__CLR4_4_1mezmezlc8azurc.R.globalSliceStart(getClass().getName(),29234);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_143zd9xmk2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mezmezlc8azurc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mezmezlc8azurc.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestHours.testMinus_Hours",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29234,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_143zd9xmk2(){try{__CLR4_4_1mezmezlc8azurc.R.inc(29234);
        __CLR4_4_1mezmezlc8azurc.R.inc(29235);Hours test2 = Hours.hours(2);
        __CLR4_4_1mezmezlc8azurc.R.inc(29236);Hours test3 = Hours.hours(3);
        __CLR4_4_1mezmezlc8azurc.R.inc(29237);Hours result = test2.minus(test3);
        __CLR4_4_1mezmezlc8azurc.R.inc(29238);assertEquals(2, test2.getHours());
        __CLR4_4_1mezmezlc8azurc.R.inc(29239);assertEquals(3, test3.getHours());
        __CLR4_4_1mezmezlc8azurc.R.inc(29240);assertEquals(-1, result.getHours());
        
        __CLR4_4_1mezmezlc8azurc.R.inc(29241);assertEquals(1, Hours.ONE.minus(Hours.ZERO).getHours());
        __CLR4_4_1mezmezlc8azurc.R.inc(29242);assertEquals(1, Hours.ONE.minus((Hours) null).getHours());
        
        __CLR4_4_1mezmezlc8azurc.R.inc(29243);try {
            __CLR4_4_1mezmezlc8azurc.R.inc(29244);Hours.MIN_VALUE.minus(Hours.ONE);
            __CLR4_4_1mezmezlc8azurc.R.inc(29245);fail();
        } catch (ArithmeticException ex) {
            // expected
        }
    }finally{__CLR4_4_1mezmezlc8azurc.R.flushNeeded();}}

    public void testMultipliedBy_int() {__CLR4_4_1mezmezlc8azurc.R.globalSliceStart(getClass().getName(),29246);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1szpsdpmke();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mezmezlc8azurc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mezmezlc8azurc.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestHours.testMultipliedBy_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29246,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1szpsdpmke(){try{__CLR4_4_1mezmezlc8azurc.R.inc(29246);
        __CLR4_4_1mezmezlc8azurc.R.inc(29247);Hours test = Hours.hours(2);
        __CLR4_4_1mezmezlc8azurc.R.inc(29248);assertEquals(6, test.multipliedBy(3).getHours());
        __CLR4_4_1mezmezlc8azurc.R.inc(29249);assertEquals(2, test.getHours());
        __CLR4_4_1mezmezlc8azurc.R.inc(29250);assertEquals(-6, test.multipliedBy(-3).getHours());
        __CLR4_4_1mezmezlc8azurc.R.inc(29251);assertSame(test, test.multipliedBy(1));
        
        __CLR4_4_1mezmezlc8azurc.R.inc(29252);Hours halfMax = Hours.hours(Integer.MAX_VALUE / 2 + 1);
        __CLR4_4_1mezmezlc8azurc.R.inc(29253);try {
            __CLR4_4_1mezmezlc8azurc.R.inc(29254);halfMax.multipliedBy(2);
            __CLR4_4_1mezmezlc8azurc.R.inc(29255);fail();
        } catch (ArithmeticException ex) {
            // expected
        }
    }finally{__CLR4_4_1mezmezlc8azurc.R.flushNeeded();}}

    public void testDividedBy_int() {__CLR4_4_1mezmezlc8azurc.R.globalSliceStart(getClass().getName(),29256);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q9i8qvmko();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mezmezlc8azurc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mezmezlc8azurc.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestHours.testDividedBy_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29256,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q9i8qvmko(){try{__CLR4_4_1mezmezlc8azurc.R.inc(29256);
        __CLR4_4_1mezmezlc8azurc.R.inc(29257);Hours test = Hours.hours(12);
        __CLR4_4_1mezmezlc8azurc.R.inc(29258);assertEquals(6, test.dividedBy(2).getHours());
        __CLR4_4_1mezmezlc8azurc.R.inc(29259);assertEquals(12, test.getHours());
        __CLR4_4_1mezmezlc8azurc.R.inc(29260);assertEquals(4, test.dividedBy(3).getHours());
        __CLR4_4_1mezmezlc8azurc.R.inc(29261);assertEquals(3, test.dividedBy(4).getHours());
        __CLR4_4_1mezmezlc8azurc.R.inc(29262);assertEquals(2, test.dividedBy(5).getHours());
        __CLR4_4_1mezmezlc8azurc.R.inc(29263);assertEquals(2, test.dividedBy(6).getHours());
        __CLR4_4_1mezmezlc8azurc.R.inc(29264);assertSame(test, test.dividedBy(1));
        
        __CLR4_4_1mezmezlc8azurc.R.inc(29265);try {
            __CLR4_4_1mezmezlc8azurc.R.inc(29266);Hours.ONE.dividedBy(0);
            __CLR4_4_1mezmezlc8azurc.R.inc(29267);fail();
        } catch (ArithmeticException ex) {
            // expected
        }
    }finally{__CLR4_4_1mezmezlc8azurc.R.flushNeeded();}}

    public void testNegated() {__CLR4_4_1mezmezlc8azurc.R.globalSliceStart(getClass().getName(),29268);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1av3307ml0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mezmezlc8azurc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mezmezlc8azurc.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestHours.testNegated",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29268,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1av3307ml0(){try{__CLR4_4_1mezmezlc8azurc.R.inc(29268);
        __CLR4_4_1mezmezlc8azurc.R.inc(29269);Hours test = Hours.hours(12);
        __CLR4_4_1mezmezlc8azurc.R.inc(29270);assertEquals(-12, test.negated().getHours());
        __CLR4_4_1mezmezlc8azurc.R.inc(29271);assertEquals(12, test.getHours());
        
        __CLR4_4_1mezmezlc8azurc.R.inc(29272);try {
            __CLR4_4_1mezmezlc8azurc.R.inc(29273);Hours.MIN_VALUE.negated();
            __CLR4_4_1mezmezlc8azurc.R.inc(29274);fail();
        } catch (ArithmeticException ex) {
            // expected
        }
    }finally{__CLR4_4_1mezmezlc8azurc.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testAddToLocalDate() {__CLR4_4_1mezmezlc8azurc.R.globalSliceStart(getClass().getName(),29275);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1thm5yuml7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mezmezlc8azurc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mezmezlc8azurc.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestHours.testAddToLocalDate",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29275,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1thm5yuml7(){try{__CLR4_4_1mezmezlc8azurc.R.inc(29275);
        __CLR4_4_1mezmezlc8azurc.R.inc(29276);Hours test = Hours.hours(26);
        __CLR4_4_1mezmezlc8azurc.R.inc(29277);LocalDateTime date = new LocalDateTime(2006, 6, 1, 0, 0, 0, 0);
        __CLR4_4_1mezmezlc8azurc.R.inc(29278);LocalDateTime expected = new LocalDateTime(2006, 6, 2, 2, 0, 0, 0);
        __CLR4_4_1mezmezlc8azurc.R.inc(29279);assertEquals(expected, date.plus(test));
    }finally{__CLR4_4_1mezmezlc8azurc.R.flushNeeded();}}

}
