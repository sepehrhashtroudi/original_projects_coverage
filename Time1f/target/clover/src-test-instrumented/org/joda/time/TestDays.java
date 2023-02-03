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
 * This class is a Junit unit test for Days.
 *
 * @author Stephen Colebourne
 */
public class TestDays extends TestCase {static class __CLR4_4_1lo5lo5lc8azuoe{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672271031490L,8589935092L,28337,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    // Test in 2002/03 as time zones are more well known
    // (before the late 90's they were all over the place)
    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");

    public static void main(String[] args) {try{__CLR4_4_1lo5lo5lc8azuoe.R.inc(28085);
        __CLR4_4_1lo5lo5lc8azuoe.R.inc(28086);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1lo5lo5lc8azuoe.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1lo5lo5lc8azuoe.R.inc(28087);
        __CLR4_4_1lo5lo5lc8azuoe.R.inc(28088);return new TestSuite(TestDays.class);
    }finally{__CLR4_4_1lo5lo5lc8azuoe.R.flushNeeded();}}

    public TestDays(String name) {
        super(name);__CLR4_4_1lo5lo5lc8azuoe.R.inc(28090);try{__CLR4_4_1lo5lo5lc8azuoe.R.inc(28089);
    }finally{__CLR4_4_1lo5lo5lc8azuoe.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1lo5lo5lc8azuoe.R.inc(28091);
    }finally{__CLR4_4_1lo5lo5lc8azuoe.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1lo5lo5lc8azuoe.R.inc(28092);
    }finally{__CLR4_4_1lo5lo5lc8azuoe.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testConstants() {__CLR4_4_1lo5lo5lc8azuoe.R.globalSliceStart(getClass().getName(),28093);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15epzlwlod();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lo5lo5lc8azuoe.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lo5lo5lc8azuoe.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDays.testConstants",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28093,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15epzlwlod(){try{__CLR4_4_1lo5lo5lc8azuoe.R.inc(28093);
        __CLR4_4_1lo5lo5lc8azuoe.R.inc(28094);assertEquals(0, Days.ZERO.getDays());
        __CLR4_4_1lo5lo5lc8azuoe.R.inc(28095);assertEquals(1, Days.ONE.getDays());
        __CLR4_4_1lo5lo5lc8azuoe.R.inc(28096);assertEquals(2, Days.TWO.getDays());
        __CLR4_4_1lo5lo5lc8azuoe.R.inc(28097);assertEquals(3, Days.THREE.getDays());
        __CLR4_4_1lo5lo5lc8azuoe.R.inc(28098);assertEquals(4, Days.FOUR.getDays());
        __CLR4_4_1lo5lo5lc8azuoe.R.inc(28099);assertEquals(5, Days.FIVE.getDays());
        __CLR4_4_1lo5lo5lc8azuoe.R.inc(28100);assertEquals(6, Days.SIX.getDays());
        __CLR4_4_1lo5lo5lc8azuoe.R.inc(28101);assertEquals(7, Days.SEVEN.getDays());
        __CLR4_4_1lo5lo5lc8azuoe.R.inc(28102);assertEquals(Integer.MAX_VALUE, Days.MAX_VALUE.getDays());
        __CLR4_4_1lo5lo5lc8azuoe.R.inc(28103);assertEquals(Integer.MIN_VALUE, Days.MIN_VALUE.getDays());
    }finally{__CLR4_4_1lo5lo5lc8azuoe.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testFactory_days_int() {__CLR4_4_1lo5lo5lc8azuoe.R.globalSliceStart(getClass().getName(),28104);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tvjcizloo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lo5lo5lc8azuoe.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lo5lo5lc8azuoe.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDays.testFactory_days_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28104,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tvjcizloo(){try{__CLR4_4_1lo5lo5lc8azuoe.R.inc(28104);
        __CLR4_4_1lo5lo5lc8azuoe.R.inc(28105);assertSame(Days.ZERO, Days.days(0));
        __CLR4_4_1lo5lo5lc8azuoe.R.inc(28106);assertSame(Days.ONE, Days.days(1));
        __CLR4_4_1lo5lo5lc8azuoe.R.inc(28107);assertSame(Days.TWO, Days.days(2));
        __CLR4_4_1lo5lo5lc8azuoe.R.inc(28108);assertSame(Days.THREE, Days.days(3));
        __CLR4_4_1lo5lo5lc8azuoe.R.inc(28109);assertSame(Days.FOUR, Days.days(4));
        __CLR4_4_1lo5lo5lc8azuoe.R.inc(28110);assertSame(Days.FIVE, Days.days(5));
        __CLR4_4_1lo5lo5lc8azuoe.R.inc(28111);assertSame(Days.SIX, Days.days(6));
        __CLR4_4_1lo5lo5lc8azuoe.R.inc(28112);assertSame(Days.SEVEN, Days.days(7));
        __CLR4_4_1lo5lo5lc8azuoe.R.inc(28113);assertSame(Days.MAX_VALUE, Days.days(Integer.MAX_VALUE));
        __CLR4_4_1lo5lo5lc8azuoe.R.inc(28114);assertSame(Days.MIN_VALUE, Days.days(Integer.MIN_VALUE));
        __CLR4_4_1lo5lo5lc8azuoe.R.inc(28115);assertEquals(-1, Days.days(-1).getDays());
        __CLR4_4_1lo5lo5lc8azuoe.R.inc(28116);assertEquals(8, Days.days(8).getDays());
    }finally{__CLR4_4_1lo5lo5lc8azuoe.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testFactory_daysBetween_RInstant() {__CLR4_4_1lo5lo5lc8azuoe.R.globalSliceStart(getClass().getName(),28117);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14clw8llp1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lo5lo5lc8azuoe.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lo5lo5lc8azuoe.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDays.testFactory_daysBetween_RInstant",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28117,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14clw8llp1(){try{__CLR4_4_1lo5lo5lc8azuoe.R.inc(28117);
        __CLR4_4_1lo5lo5lc8azuoe.R.inc(28118);DateTime start = new DateTime(2006, 6, 9, 12, 0, 0, 0, PARIS);
        __CLR4_4_1lo5lo5lc8azuoe.R.inc(28119);DateTime end1 = new DateTime(2006, 6, 12, 12, 0, 0, 0, PARIS);
        __CLR4_4_1lo5lo5lc8azuoe.R.inc(28120);DateTime end2 = new DateTime(2006, 6, 15, 18, 0, 0, 0, PARIS);
        
        __CLR4_4_1lo5lo5lc8azuoe.R.inc(28121);assertEquals(3, Days.daysBetween(start, end1).getDays());
        __CLR4_4_1lo5lo5lc8azuoe.R.inc(28122);assertEquals(0, Days.daysBetween(start, start).getDays());
        __CLR4_4_1lo5lo5lc8azuoe.R.inc(28123);assertEquals(0, Days.daysBetween(end1, end1).getDays());
        __CLR4_4_1lo5lo5lc8azuoe.R.inc(28124);assertEquals(-3, Days.daysBetween(end1, start).getDays());
        __CLR4_4_1lo5lo5lc8azuoe.R.inc(28125);assertEquals(6, Days.daysBetween(start, end2).getDays());
    }finally{__CLR4_4_1lo5lo5lc8azuoe.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @SuppressWarnings("deprecation")
    public void testFactory_daysBetween_RPartial_LocalDate() {__CLR4_4_1lo5lo5lc8azuoe.R.globalSliceStart(getClass().getName(),28126);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1885qezlpa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lo5lo5lc8azuoe.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lo5lo5lc8azuoe.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDays.testFactory_daysBetween_RPartial_LocalDate",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28126,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1885qezlpa(){try{__CLR4_4_1lo5lo5lc8azuoe.R.inc(28126);
        __CLR4_4_1lo5lo5lc8azuoe.R.inc(28127);LocalDate start = new LocalDate(2006, 6, 9);
        __CLR4_4_1lo5lo5lc8azuoe.R.inc(28128);LocalDate end1 = new LocalDate(2006, 6, 12);
        __CLR4_4_1lo5lo5lc8azuoe.R.inc(28129);YearMonthDay end2 = new YearMonthDay(2006, 6, 15);
        
        __CLR4_4_1lo5lo5lc8azuoe.R.inc(28130);assertEquals(3, Days.daysBetween(start, end1).getDays());
        __CLR4_4_1lo5lo5lc8azuoe.R.inc(28131);assertEquals(0, Days.daysBetween(start, start).getDays());
        __CLR4_4_1lo5lo5lc8azuoe.R.inc(28132);assertEquals(0, Days.daysBetween(end1, end1).getDays());
        __CLR4_4_1lo5lo5lc8azuoe.R.inc(28133);assertEquals(-3, Days.daysBetween(end1, start).getDays());
        __CLR4_4_1lo5lo5lc8azuoe.R.inc(28134);assertEquals(6, Days.daysBetween(start, end2).getDays());
    }finally{__CLR4_4_1lo5lo5lc8azuoe.R.flushNeeded();}}

    public void testFactory_daysBetween_RPartial_YearMonth() {__CLR4_4_1lo5lo5lc8azuoe.R.globalSliceStart(getClass().getName(),28135);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18airhtlpj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lo5lo5lc8azuoe.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lo5lo5lc8azuoe.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDays.testFactory_daysBetween_RPartial_YearMonth",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28135,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18airhtlpj(){try{__CLR4_4_1lo5lo5lc8azuoe.R.inc(28135);
        __CLR4_4_1lo5lo5lc8azuoe.R.inc(28136);YearMonth start1 = new YearMonth(2011, 1);
        __CLR4_4_1lo5lo5lc8azuoe.R.inc(28137);YearMonth start2 = new YearMonth(2012, 1);
        __CLR4_4_1lo5lo5lc8azuoe.R.inc(28138);YearMonth end1 = new YearMonth(2011, 3);
        __CLR4_4_1lo5lo5lc8azuoe.R.inc(28139);YearMonth end2 = new YearMonth(2012, 3);
        
        __CLR4_4_1lo5lo5lc8azuoe.R.inc(28140);assertEquals(59, Days.daysBetween(start1, end1).getDays());
        __CLR4_4_1lo5lo5lc8azuoe.R.inc(28141);assertEquals(60, Days.daysBetween(start2, end2).getDays());
        
        __CLR4_4_1lo5lo5lc8azuoe.R.inc(28142);assertEquals(-59, Days.daysBetween(end1, start1).getDays());
        __CLR4_4_1lo5lo5lc8azuoe.R.inc(28143);assertEquals(-60, Days.daysBetween(end2, start2).getDays());
    }finally{__CLR4_4_1lo5lo5lc8azuoe.R.flushNeeded();}}

    public void testFactory_daysBetween_RPartial_MonthDay() {__CLR4_4_1lo5lo5lc8azuoe.R.globalSliceStart(getClass().getName(),28144);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_185nlz6lps();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lo5lo5lc8azuoe.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lo5lo5lc8azuoe.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDays.testFactory_daysBetween_RPartial_MonthDay",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28144,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_185nlz6lps(){try{__CLR4_4_1lo5lo5lc8azuoe.R.inc(28144);
        __CLR4_4_1lo5lo5lc8azuoe.R.inc(28145);MonthDay start1 = new MonthDay(2, 1);
        __CLR4_4_1lo5lo5lc8azuoe.R.inc(28146);MonthDay start2 = new MonthDay(2, 28);
        __CLR4_4_1lo5lo5lc8azuoe.R.inc(28147);MonthDay end1 = new MonthDay(2, 28);
        __CLR4_4_1lo5lo5lc8azuoe.R.inc(28148);MonthDay end2 = new MonthDay(2, 29);
        
        __CLR4_4_1lo5lo5lc8azuoe.R.inc(28149);assertEquals(27, Days.daysBetween(start1, end1).getDays());
        __CLR4_4_1lo5lo5lc8azuoe.R.inc(28150);assertEquals(28, Days.daysBetween(start1, end2).getDays());
        __CLR4_4_1lo5lo5lc8azuoe.R.inc(28151);assertEquals(0, Days.daysBetween(start2, end1).getDays());
        __CLR4_4_1lo5lo5lc8azuoe.R.inc(28152);assertEquals(1, Days.daysBetween(start2, end2).getDays());
        
        __CLR4_4_1lo5lo5lc8azuoe.R.inc(28153);assertEquals(-27, Days.daysBetween(end1, start1).getDays());
        __CLR4_4_1lo5lo5lc8azuoe.R.inc(28154);assertEquals(-28, Days.daysBetween(end2, start1).getDays());
        __CLR4_4_1lo5lo5lc8azuoe.R.inc(28155);assertEquals(0, Days.daysBetween(end1, start2).getDays());
        __CLR4_4_1lo5lo5lc8azuoe.R.inc(28156);assertEquals(-1, Days.daysBetween(end2, start2).getDays());
    }finally{__CLR4_4_1lo5lo5lc8azuoe.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testFactory_daysIn_RInterval() {__CLR4_4_1lo5lo5lc8azuoe.R.globalSliceStart(getClass().getName(),28157);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ccy282lq5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lo5lo5lc8azuoe.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lo5lo5lc8azuoe.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDays.testFactory_daysIn_RInterval",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28157,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ccy282lq5(){try{__CLR4_4_1lo5lo5lc8azuoe.R.inc(28157);
        __CLR4_4_1lo5lo5lc8azuoe.R.inc(28158);DateTime start = new DateTime(2006, 6, 9, 12, 0, 0, 0, PARIS);
        __CLR4_4_1lo5lo5lc8azuoe.R.inc(28159);DateTime end1 = new DateTime(2006, 6, 12, 12, 0, 0, 0, PARIS);
        __CLR4_4_1lo5lo5lc8azuoe.R.inc(28160);DateTime end2 = new DateTime(2006, 6, 15, 18, 0, 0, 0, PARIS);
        
        __CLR4_4_1lo5lo5lc8azuoe.R.inc(28161);assertEquals(0, Days.daysIn((ReadableInterval) null).getDays());
        __CLR4_4_1lo5lo5lc8azuoe.R.inc(28162);assertEquals(3, Days.daysIn(new Interval(start, end1)).getDays());
        __CLR4_4_1lo5lo5lc8azuoe.R.inc(28163);assertEquals(0, Days.daysIn(new Interval(start, start)).getDays());
        __CLR4_4_1lo5lo5lc8azuoe.R.inc(28164);assertEquals(0, Days.daysIn(new Interval(end1, end1)).getDays());
        __CLR4_4_1lo5lo5lc8azuoe.R.inc(28165);assertEquals(6, Days.daysIn(new Interval(start, end2)).getDays());
    }finally{__CLR4_4_1lo5lo5lc8azuoe.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testFactory_standardDaysIn_RPeriod() {__CLR4_4_1lo5lo5lc8azuoe.R.globalSliceStart(getClass().getName(),28166);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13el4cblqe();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lo5lo5lc8azuoe.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lo5lo5lc8azuoe.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDays.testFactory_standardDaysIn_RPeriod",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28166,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13el4cblqe(){try{__CLR4_4_1lo5lo5lc8azuoe.R.inc(28166);
        __CLR4_4_1lo5lo5lc8azuoe.R.inc(28167);assertEquals(0, Days.standardDaysIn((ReadablePeriod) null).getDays());
        __CLR4_4_1lo5lo5lc8azuoe.R.inc(28168);assertEquals(0, Days.standardDaysIn(Period.ZERO).getDays());
        __CLR4_4_1lo5lo5lc8azuoe.R.inc(28169);assertEquals(1, Days.standardDaysIn(new Period(0, 0, 0, 1, 0, 0, 0, 0)).getDays());
        __CLR4_4_1lo5lo5lc8azuoe.R.inc(28170);assertEquals(123, Days.standardDaysIn(Period.days(123)).getDays());
        __CLR4_4_1lo5lo5lc8azuoe.R.inc(28171);assertEquals(-987, Days.standardDaysIn(Period.days(-987)).getDays());
        __CLR4_4_1lo5lo5lc8azuoe.R.inc(28172);assertEquals(1, Days.standardDaysIn(Period.hours(47)).getDays());
        __CLR4_4_1lo5lo5lc8azuoe.R.inc(28173);assertEquals(2, Days.standardDaysIn(Period.hours(48)).getDays());
        __CLR4_4_1lo5lo5lc8azuoe.R.inc(28174);assertEquals(2, Days.standardDaysIn(Period.hours(49)).getDays());
        __CLR4_4_1lo5lo5lc8azuoe.R.inc(28175);assertEquals(14, Days.standardDaysIn(Period.weeks(2)).getDays());
        __CLR4_4_1lo5lo5lc8azuoe.R.inc(28176);try {
            __CLR4_4_1lo5lo5lc8azuoe.R.inc(28177);Days.standardDaysIn(Period.months(1));
            __CLR4_4_1lo5lo5lc8azuoe.R.inc(28178);fail();
        } catch (IllegalArgumentException ex) {
            // expeceted
        }
    }finally{__CLR4_4_1lo5lo5lc8azuoe.R.flushNeeded();}}

    public void testFactory_parseDays_String() {__CLR4_4_1lo5lo5lc8azuoe.R.globalSliceStart(getClass().getName(),28179);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1r32aclqr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lo5lo5lc8azuoe.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lo5lo5lc8azuoe.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDays.testFactory_parseDays_String",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28179,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1r32aclqr(){try{__CLR4_4_1lo5lo5lc8azuoe.R.inc(28179);
        __CLR4_4_1lo5lo5lc8azuoe.R.inc(28180);assertEquals(0, Days.parseDays((String) null).getDays());
        __CLR4_4_1lo5lo5lc8azuoe.R.inc(28181);assertEquals(0, Days.parseDays("P0D").getDays());
        __CLR4_4_1lo5lo5lc8azuoe.R.inc(28182);assertEquals(1, Days.parseDays("P1D").getDays());
        __CLR4_4_1lo5lo5lc8azuoe.R.inc(28183);assertEquals(-3, Days.parseDays("P-3D").getDays());
        __CLR4_4_1lo5lo5lc8azuoe.R.inc(28184);assertEquals(2, Days.parseDays("P0Y0M2D").getDays());
        __CLR4_4_1lo5lo5lc8azuoe.R.inc(28185);assertEquals(2, Days.parseDays("P2DT0H0M").getDays());
        __CLR4_4_1lo5lo5lc8azuoe.R.inc(28186);try {
            __CLR4_4_1lo5lo5lc8azuoe.R.inc(28187);Days.parseDays("P1Y1D");
            __CLR4_4_1lo5lo5lc8azuoe.R.inc(28188);fail();
        } catch (IllegalArgumentException ex) {
            // expeceted
        }
        __CLR4_4_1lo5lo5lc8azuoe.R.inc(28189);try {
            __CLR4_4_1lo5lo5lc8azuoe.R.inc(28190);Days.parseDays("P1DT1H");
            __CLR4_4_1lo5lo5lc8azuoe.R.inc(28191);fail();
        } catch (IllegalArgumentException ex) {
            // expeceted
        }
    }finally{__CLR4_4_1lo5lo5lc8azuoe.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testGetMethods() {__CLR4_4_1lo5lo5lc8azuoe.R.globalSliceStart(getClass().getName(),28192);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12sjdmzlr4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lo5lo5lc8azuoe.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lo5lo5lc8azuoe.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDays.testGetMethods",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28192,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12sjdmzlr4(){try{__CLR4_4_1lo5lo5lc8azuoe.R.inc(28192);
        __CLR4_4_1lo5lo5lc8azuoe.R.inc(28193);Days test = Days.days(20);
        __CLR4_4_1lo5lo5lc8azuoe.R.inc(28194);assertEquals(20, test.getDays());
    }finally{__CLR4_4_1lo5lo5lc8azuoe.R.flushNeeded();}}

    public void testGetFieldType() {__CLR4_4_1lo5lo5lc8azuoe.R.globalSliceStart(getClass().getName(),28195);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18z86mvlr7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lo5lo5lc8azuoe.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lo5lo5lc8azuoe.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDays.testGetFieldType",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28195,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18z86mvlr7(){try{__CLR4_4_1lo5lo5lc8azuoe.R.inc(28195);
        __CLR4_4_1lo5lo5lc8azuoe.R.inc(28196);Days test = Days.days(20);
        __CLR4_4_1lo5lo5lc8azuoe.R.inc(28197);assertEquals(DurationFieldType.days(), test.getFieldType());
    }finally{__CLR4_4_1lo5lo5lc8azuoe.R.flushNeeded();}}

    public void testGetPeriodType() {__CLR4_4_1lo5lo5lc8azuoe.R.globalSliceStart(getClass().getName(),28198);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ivat1ilra();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lo5lo5lc8azuoe.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lo5lo5lc8azuoe.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDays.testGetPeriodType",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28198,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ivat1ilra(){try{__CLR4_4_1lo5lo5lc8azuoe.R.inc(28198);
        __CLR4_4_1lo5lo5lc8azuoe.R.inc(28199);Days test = Days.days(20);
        __CLR4_4_1lo5lo5lc8azuoe.R.inc(28200);assertEquals(PeriodType.days(), test.getPeriodType());
    }finally{__CLR4_4_1lo5lo5lc8azuoe.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testIsGreaterThan() {__CLR4_4_1lo5lo5lc8azuoe.R.globalSliceStart(getClass().getName(),28201);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s5pnomlrd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lo5lo5lc8azuoe.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lo5lo5lc8azuoe.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDays.testIsGreaterThan",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28201,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s5pnomlrd(){try{__CLR4_4_1lo5lo5lc8azuoe.R.inc(28201);
        __CLR4_4_1lo5lo5lc8azuoe.R.inc(28202);assertEquals(true, Days.THREE.isGreaterThan(Days.TWO));
        __CLR4_4_1lo5lo5lc8azuoe.R.inc(28203);assertEquals(false, Days.THREE.isGreaterThan(Days.THREE));
        __CLR4_4_1lo5lo5lc8azuoe.R.inc(28204);assertEquals(false, Days.TWO.isGreaterThan(Days.THREE));
        __CLR4_4_1lo5lo5lc8azuoe.R.inc(28205);assertEquals(true, Days.ONE.isGreaterThan(null));
        __CLR4_4_1lo5lo5lc8azuoe.R.inc(28206);assertEquals(false, Days.days(-1).isGreaterThan(null));
    }finally{__CLR4_4_1lo5lo5lc8azuoe.R.flushNeeded();}}

    public void testIsLessThan() {__CLR4_4_1lo5lo5lc8azuoe.R.globalSliceStart(getClass().getName(),28207);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rmk0kdlrj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lo5lo5lc8azuoe.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lo5lo5lc8azuoe.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDays.testIsLessThan",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28207,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rmk0kdlrj(){try{__CLR4_4_1lo5lo5lc8azuoe.R.inc(28207);
        __CLR4_4_1lo5lo5lc8azuoe.R.inc(28208);assertEquals(false, Days.THREE.isLessThan(Days.TWO));
        __CLR4_4_1lo5lo5lc8azuoe.R.inc(28209);assertEquals(false, Days.THREE.isLessThan(Days.THREE));
        __CLR4_4_1lo5lo5lc8azuoe.R.inc(28210);assertEquals(true, Days.TWO.isLessThan(Days.THREE));
        __CLR4_4_1lo5lo5lc8azuoe.R.inc(28211);assertEquals(false, Days.ONE.isLessThan(null));
        __CLR4_4_1lo5lo5lc8azuoe.R.inc(28212);assertEquals(true, Days.days(-1).isLessThan(null));
    }finally{__CLR4_4_1lo5lo5lc8azuoe.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testToString() {__CLR4_4_1lo5lo5lc8azuoe.R.globalSliceStart(getClass().getName(),28213);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hrxdidlrp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lo5lo5lc8azuoe.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lo5lo5lc8azuoe.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDays.testToString",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28213,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hrxdidlrp(){try{__CLR4_4_1lo5lo5lc8azuoe.R.inc(28213);
        __CLR4_4_1lo5lo5lc8azuoe.R.inc(28214);Days test = Days.days(20);
        __CLR4_4_1lo5lo5lc8azuoe.R.inc(28215);assertEquals("P20D", test.toString());
        
        __CLR4_4_1lo5lo5lc8azuoe.R.inc(28216);test = Days.days(-20);
        __CLR4_4_1lo5lo5lc8azuoe.R.inc(28217);assertEquals("P-20D", test.toString());
    }finally{__CLR4_4_1lo5lo5lc8azuoe.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testSerialization() throws Exception {__CLR4_4_1lo5lo5lc8azuoe.R.globalSliceStart(getClass().getName(),28218);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16m1on9lru();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lo5lo5lc8azuoe.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lo5lo5lc8azuoe.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDays.testSerialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28218,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16m1on9lru() throws Exception{try{__CLR4_4_1lo5lo5lc8azuoe.R.inc(28218);
        __CLR4_4_1lo5lo5lc8azuoe.R.inc(28219);Days test = Days.SEVEN;
        
        __CLR4_4_1lo5lo5lc8azuoe.R.inc(28220);ByteArrayOutputStream baos = new ByteArrayOutputStream();
        __CLR4_4_1lo5lo5lc8azuoe.R.inc(28221);ObjectOutputStream oos = new ObjectOutputStream(baos);
        __CLR4_4_1lo5lo5lc8azuoe.R.inc(28222);oos.writeObject(test);
        __CLR4_4_1lo5lo5lc8azuoe.R.inc(28223);byte[] bytes = baos.toByteArray();
        __CLR4_4_1lo5lo5lc8azuoe.R.inc(28224);oos.close();
        
        __CLR4_4_1lo5lo5lc8azuoe.R.inc(28225);ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        __CLR4_4_1lo5lo5lc8azuoe.R.inc(28226);ObjectInputStream ois = new ObjectInputStream(bais);
        __CLR4_4_1lo5lo5lc8azuoe.R.inc(28227);Days result = (Days) ois.readObject();
        __CLR4_4_1lo5lo5lc8azuoe.R.inc(28228);ois.close();
        
        __CLR4_4_1lo5lo5lc8azuoe.R.inc(28229);assertSame(test, result);
    }finally{__CLR4_4_1lo5lo5lc8azuoe.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testToStandardWeeks() {__CLR4_4_1lo5lo5lc8azuoe.R.globalSliceStart(getClass().getName(),28230);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pfkyx0ls6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lo5lo5lc8azuoe.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lo5lo5lc8azuoe.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDays.testToStandardWeeks",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28230,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pfkyx0ls6(){try{__CLR4_4_1lo5lo5lc8azuoe.R.inc(28230);
        __CLR4_4_1lo5lo5lc8azuoe.R.inc(28231);Days test = Days.days(14);
        __CLR4_4_1lo5lo5lc8azuoe.R.inc(28232);Weeks expected = Weeks.weeks(2);
        __CLR4_4_1lo5lo5lc8azuoe.R.inc(28233);assertEquals(expected, test.toStandardWeeks());
    }finally{__CLR4_4_1lo5lo5lc8azuoe.R.flushNeeded();}}

    public void testToStandardHours() {__CLR4_4_1lo5lo5lc8azuoe.R.globalSliceStart(getClass().getName(),28234);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ikk7glsa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lo5lo5lc8azuoe.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lo5lo5lc8azuoe.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDays.testToStandardHours",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28234,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ikk7glsa(){try{__CLR4_4_1lo5lo5lc8azuoe.R.inc(28234);
        __CLR4_4_1lo5lo5lc8azuoe.R.inc(28235);Days test = Days.days(2);
        __CLR4_4_1lo5lo5lc8azuoe.R.inc(28236);Hours expected = Hours.hours(2 * 24);
        __CLR4_4_1lo5lo5lc8azuoe.R.inc(28237);assertEquals(expected, test.toStandardHours());
        
        __CLR4_4_1lo5lo5lc8azuoe.R.inc(28238);try {
            __CLR4_4_1lo5lo5lc8azuoe.R.inc(28239);Days.MAX_VALUE.toStandardHours();
            __CLR4_4_1lo5lo5lc8azuoe.R.inc(28240);fail();
        } catch (ArithmeticException ex) {
            // expected
        }
    }finally{__CLR4_4_1lo5lo5lc8azuoe.R.flushNeeded();}}

    public void testToStandardMinutes() {__CLR4_4_1lo5lo5lc8azuoe.R.globalSliceStart(getClass().getName(),28241);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1r0kt44lsh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lo5lo5lc8azuoe.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lo5lo5lc8azuoe.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDays.testToStandardMinutes",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28241,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1r0kt44lsh(){try{__CLR4_4_1lo5lo5lc8azuoe.R.inc(28241);
        __CLR4_4_1lo5lo5lc8azuoe.R.inc(28242);Days test = Days.days(2);
        __CLR4_4_1lo5lo5lc8azuoe.R.inc(28243);Minutes expected = Minutes.minutes(2 * 24 * 60);
        __CLR4_4_1lo5lo5lc8azuoe.R.inc(28244);assertEquals(expected, test.toStandardMinutes());
        
        __CLR4_4_1lo5lo5lc8azuoe.R.inc(28245);try {
            __CLR4_4_1lo5lo5lc8azuoe.R.inc(28246);Days.MAX_VALUE.toStandardMinutes();
            __CLR4_4_1lo5lo5lc8azuoe.R.inc(28247);fail();
        } catch (ArithmeticException ex) {
            // expected
        }
    }finally{__CLR4_4_1lo5lo5lc8azuoe.R.flushNeeded();}}

    public void testToStandardSeconds() {__CLR4_4_1lo5lo5lc8azuoe.R.globalSliceStart(getClass().getName(),28248);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1emeoqslso();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lo5lo5lc8azuoe.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lo5lo5lc8azuoe.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDays.testToStandardSeconds",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28248,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1emeoqslso(){try{__CLR4_4_1lo5lo5lc8azuoe.R.inc(28248);
        __CLR4_4_1lo5lo5lc8azuoe.R.inc(28249);Days test = Days.days(2);
        __CLR4_4_1lo5lo5lc8azuoe.R.inc(28250);Seconds expected = Seconds.seconds(2 * 24 * 60 * 60);
        __CLR4_4_1lo5lo5lc8azuoe.R.inc(28251);assertEquals(expected, test.toStandardSeconds());
        
        __CLR4_4_1lo5lo5lc8azuoe.R.inc(28252);try {
            __CLR4_4_1lo5lo5lc8azuoe.R.inc(28253);Days.MAX_VALUE.toStandardSeconds();
            __CLR4_4_1lo5lo5lc8azuoe.R.inc(28254);fail();
        } catch (ArithmeticException ex) {
            // expected
        }
    }finally{__CLR4_4_1lo5lo5lc8azuoe.R.flushNeeded();}}

    public void testToStandardDuration() {__CLR4_4_1lo5lo5lc8azuoe.R.globalSliceStart(getClass().getName(),28255);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1izmvnplsv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lo5lo5lc8azuoe.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lo5lo5lc8azuoe.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDays.testToStandardDuration",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28255,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1izmvnplsv(){try{__CLR4_4_1lo5lo5lc8azuoe.R.inc(28255);
        __CLR4_4_1lo5lo5lc8azuoe.R.inc(28256);Days test = Days.days(20);
        __CLR4_4_1lo5lo5lc8azuoe.R.inc(28257);Duration expected = new Duration(20L * DateTimeConstants.MILLIS_PER_DAY);
        __CLR4_4_1lo5lo5lc8azuoe.R.inc(28258);assertEquals(expected, test.toStandardDuration());
        
        __CLR4_4_1lo5lo5lc8azuoe.R.inc(28259);expected = new Duration(((long) Integer.MAX_VALUE) * DateTimeConstants.MILLIS_PER_DAY);
        __CLR4_4_1lo5lo5lc8azuoe.R.inc(28260);assertEquals(expected, Days.MAX_VALUE.toStandardDuration());
    }finally{__CLR4_4_1lo5lo5lc8azuoe.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testPlus_int() {__CLR4_4_1lo5lo5lc8azuoe.R.globalSliceStart(getClass().getName(),28261);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1scc4eblt1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lo5lo5lc8azuoe.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lo5lo5lc8azuoe.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDays.testPlus_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28261,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1scc4eblt1(){try{__CLR4_4_1lo5lo5lc8azuoe.R.inc(28261);
        __CLR4_4_1lo5lo5lc8azuoe.R.inc(28262);Days test2 = Days.days(2);
        __CLR4_4_1lo5lo5lc8azuoe.R.inc(28263);Days result = test2.plus(3);
        __CLR4_4_1lo5lo5lc8azuoe.R.inc(28264);assertEquals(2, test2.getDays());
        __CLR4_4_1lo5lo5lc8azuoe.R.inc(28265);assertEquals(5, result.getDays());
        
        __CLR4_4_1lo5lo5lc8azuoe.R.inc(28266);assertEquals(1, Days.ONE.plus(0).getDays());
        
        __CLR4_4_1lo5lo5lc8azuoe.R.inc(28267);try {
            __CLR4_4_1lo5lo5lc8azuoe.R.inc(28268);Days.MAX_VALUE.plus(1);
            __CLR4_4_1lo5lo5lc8azuoe.R.inc(28269);fail();
        } catch (ArithmeticException ex) {
            // expected
        }
    }finally{__CLR4_4_1lo5lo5lc8azuoe.R.flushNeeded();}}

    public void testPlus_Days() {__CLR4_4_1lo5lo5lc8azuoe.R.globalSliceStart(getClass().getName(),28270);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_170xe27lta();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lo5lo5lc8azuoe.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lo5lo5lc8azuoe.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDays.testPlus_Days",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28270,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_170xe27lta(){try{__CLR4_4_1lo5lo5lc8azuoe.R.inc(28270);
        __CLR4_4_1lo5lo5lc8azuoe.R.inc(28271);Days test2 = Days.days(2);
        __CLR4_4_1lo5lo5lc8azuoe.R.inc(28272);Days test3 = Days.days(3);
        __CLR4_4_1lo5lo5lc8azuoe.R.inc(28273);Days result = test2.plus(test3);
        __CLR4_4_1lo5lo5lc8azuoe.R.inc(28274);assertEquals(2, test2.getDays());
        __CLR4_4_1lo5lo5lc8azuoe.R.inc(28275);assertEquals(3, test3.getDays());
        __CLR4_4_1lo5lo5lc8azuoe.R.inc(28276);assertEquals(5, result.getDays());
        
        __CLR4_4_1lo5lo5lc8azuoe.R.inc(28277);assertEquals(1, Days.ONE.plus(Days.ZERO).getDays());
        __CLR4_4_1lo5lo5lc8azuoe.R.inc(28278);assertEquals(1, Days.ONE.plus((Days) null).getDays());
        
        __CLR4_4_1lo5lo5lc8azuoe.R.inc(28279);try {
            __CLR4_4_1lo5lo5lc8azuoe.R.inc(28280);Days.MAX_VALUE.plus(Days.ONE);
            __CLR4_4_1lo5lo5lc8azuoe.R.inc(28281);fail();
        } catch (ArithmeticException ex) {
            // expected
        }
    }finally{__CLR4_4_1lo5lo5lc8azuoe.R.flushNeeded();}}

    public void testMinus_int() {__CLR4_4_1lo5lo5lc8azuoe.R.globalSliceStart(getClass().getName(),28282);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_118wkvpltm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lo5lo5lc8azuoe.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lo5lo5lc8azuoe.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDays.testMinus_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28282,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_118wkvpltm(){try{__CLR4_4_1lo5lo5lc8azuoe.R.inc(28282);
        __CLR4_4_1lo5lo5lc8azuoe.R.inc(28283);Days test2 = Days.days(2);
        __CLR4_4_1lo5lo5lc8azuoe.R.inc(28284);Days result = test2.minus(3);
        __CLR4_4_1lo5lo5lc8azuoe.R.inc(28285);assertEquals(2, test2.getDays());
        __CLR4_4_1lo5lo5lc8azuoe.R.inc(28286);assertEquals(-1, result.getDays());
        
        __CLR4_4_1lo5lo5lc8azuoe.R.inc(28287);assertEquals(1, Days.ONE.minus(0).getDays());
        
        __CLR4_4_1lo5lo5lc8azuoe.R.inc(28288);try {
            __CLR4_4_1lo5lo5lc8azuoe.R.inc(28289);Days.MIN_VALUE.minus(1);
            __CLR4_4_1lo5lo5lc8azuoe.R.inc(28290);fail();
        } catch (ArithmeticException ex) {
            // expected
        }
    }finally{__CLR4_4_1lo5lo5lc8azuoe.R.flushNeeded();}}

    public void testMinus_Days() {__CLR4_4_1lo5lo5lc8azuoe.R.globalSliceStart(getClass().getName(),28291);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15e1gm7ltv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lo5lo5lc8azuoe.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lo5lo5lc8azuoe.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDays.testMinus_Days",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28291,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15e1gm7ltv(){try{__CLR4_4_1lo5lo5lc8azuoe.R.inc(28291);
        __CLR4_4_1lo5lo5lc8azuoe.R.inc(28292);Days test2 = Days.days(2);
        __CLR4_4_1lo5lo5lc8azuoe.R.inc(28293);Days test3 = Days.days(3);
        __CLR4_4_1lo5lo5lc8azuoe.R.inc(28294);Days result = test2.minus(test3);
        __CLR4_4_1lo5lo5lc8azuoe.R.inc(28295);assertEquals(2, test2.getDays());
        __CLR4_4_1lo5lo5lc8azuoe.R.inc(28296);assertEquals(3, test3.getDays());
        __CLR4_4_1lo5lo5lc8azuoe.R.inc(28297);assertEquals(-1, result.getDays());
        
        __CLR4_4_1lo5lo5lc8azuoe.R.inc(28298);assertEquals(1, Days.ONE.minus(Days.ZERO).getDays());
        __CLR4_4_1lo5lo5lc8azuoe.R.inc(28299);assertEquals(1, Days.ONE.minus((Days) null).getDays());
        
        __CLR4_4_1lo5lo5lc8azuoe.R.inc(28300);try {
            __CLR4_4_1lo5lo5lc8azuoe.R.inc(28301);Days.MIN_VALUE.minus(Days.ONE);
            __CLR4_4_1lo5lo5lc8azuoe.R.inc(28302);fail();
        } catch (ArithmeticException ex) {
            // expected
        }
    }finally{__CLR4_4_1lo5lo5lc8azuoe.R.flushNeeded();}}

    public void testMultipliedBy_int() {__CLR4_4_1lo5lo5lc8azuoe.R.globalSliceStart(getClass().getName(),28303);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1szpsdplu7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lo5lo5lc8azuoe.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lo5lo5lc8azuoe.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDays.testMultipliedBy_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28303,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1szpsdplu7(){try{__CLR4_4_1lo5lo5lc8azuoe.R.inc(28303);
        __CLR4_4_1lo5lo5lc8azuoe.R.inc(28304);Days test = Days.days(2);
        __CLR4_4_1lo5lo5lc8azuoe.R.inc(28305);assertEquals(6, test.multipliedBy(3).getDays());
        __CLR4_4_1lo5lo5lc8azuoe.R.inc(28306);assertEquals(2, test.getDays());
        __CLR4_4_1lo5lo5lc8azuoe.R.inc(28307);assertEquals(-6, test.multipliedBy(-3).getDays());
        __CLR4_4_1lo5lo5lc8azuoe.R.inc(28308);assertSame(test, test.multipliedBy(1));
        
        __CLR4_4_1lo5lo5lc8azuoe.R.inc(28309);Days halfMax = Days.days(Integer.MAX_VALUE / 2 + 1);
        __CLR4_4_1lo5lo5lc8azuoe.R.inc(28310);try {
            __CLR4_4_1lo5lo5lc8azuoe.R.inc(28311);halfMax.multipliedBy(2);
            __CLR4_4_1lo5lo5lc8azuoe.R.inc(28312);fail();
        } catch (ArithmeticException ex) {
            // expected
        }
    }finally{__CLR4_4_1lo5lo5lc8azuoe.R.flushNeeded();}}

    public void testDividedBy_int() {__CLR4_4_1lo5lo5lc8azuoe.R.globalSliceStart(getClass().getName(),28313);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q9i8qvluh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lo5lo5lc8azuoe.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lo5lo5lc8azuoe.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDays.testDividedBy_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28313,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q9i8qvluh(){try{__CLR4_4_1lo5lo5lc8azuoe.R.inc(28313);
        __CLR4_4_1lo5lo5lc8azuoe.R.inc(28314);Days test = Days.days(12);
        __CLR4_4_1lo5lo5lc8azuoe.R.inc(28315);assertEquals(6, test.dividedBy(2).getDays());
        __CLR4_4_1lo5lo5lc8azuoe.R.inc(28316);assertEquals(12, test.getDays());
        __CLR4_4_1lo5lo5lc8azuoe.R.inc(28317);assertEquals(4, test.dividedBy(3).getDays());
        __CLR4_4_1lo5lo5lc8azuoe.R.inc(28318);assertEquals(3, test.dividedBy(4).getDays());
        __CLR4_4_1lo5lo5lc8azuoe.R.inc(28319);assertEquals(2, test.dividedBy(5).getDays());
        __CLR4_4_1lo5lo5lc8azuoe.R.inc(28320);assertEquals(2, test.dividedBy(6).getDays());
        __CLR4_4_1lo5lo5lc8azuoe.R.inc(28321);assertSame(test, test.dividedBy(1));
        
        __CLR4_4_1lo5lo5lc8azuoe.R.inc(28322);try {
            __CLR4_4_1lo5lo5lc8azuoe.R.inc(28323);Days.ONE.dividedBy(0);
            __CLR4_4_1lo5lo5lc8azuoe.R.inc(28324);fail();
        } catch (ArithmeticException ex) {
            // expected
        }
    }finally{__CLR4_4_1lo5lo5lc8azuoe.R.flushNeeded();}}

    public void testNegated() {__CLR4_4_1lo5lo5lc8azuoe.R.globalSliceStart(getClass().getName(),28325);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1av3307lut();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lo5lo5lc8azuoe.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lo5lo5lc8azuoe.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDays.testNegated",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28325,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1av3307lut(){try{__CLR4_4_1lo5lo5lc8azuoe.R.inc(28325);
        __CLR4_4_1lo5lo5lc8azuoe.R.inc(28326);Days test = Days.days(12);
        __CLR4_4_1lo5lo5lc8azuoe.R.inc(28327);assertEquals(-12, test.negated().getDays());
        __CLR4_4_1lo5lo5lc8azuoe.R.inc(28328);assertEquals(12, test.getDays());
        
        __CLR4_4_1lo5lo5lc8azuoe.R.inc(28329);try {
            __CLR4_4_1lo5lo5lc8azuoe.R.inc(28330);Days.MIN_VALUE.negated();
            __CLR4_4_1lo5lo5lc8azuoe.R.inc(28331);fail();
        } catch (ArithmeticException ex) {
            // expected
        }
    }finally{__CLR4_4_1lo5lo5lc8azuoe.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testAddToLocalDate() {__CLR4_4_1lo5lo5lc8azuoe.R.globalSliceStart(getClass().getName(),28332);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1thm5yulv0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lo5lo5lc8azuoe.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lo5lo5lc8azuoe.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDays.testAddToLocalDate",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28332,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1thm5yulv0(){try{__CLR4_4_1lo5lo5lc8azuoe.R.inc(28332);
        __CLR4_4_1lo5lo5lc8azuoe.R.inc(28333);Days test = Days.days(20);
        __CLR4_4_1lo5lo5lc8azuoe.R.inc(28334);LocalDate date = new LocalDate(2006, 6, 1);
        __CLR4_4_1lo5lo5lc8azuoe.R.inc(28335);LocalDate expected = new LocalDate(2006, 6, 21);
        __CLR4_4_1lo5lo5lc8azuoe.R.inc(28336);assertEquals(expected, date.plus(test));
    }finally{__CLR4_4_1lo5lo5lc8azuoe.R.flushNeeded();}}

}
