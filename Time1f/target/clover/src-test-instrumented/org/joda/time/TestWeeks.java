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
 * This class is a Junit unit test for Weeks.
 *
 * @author Stephen Colebourne
 */
public class TestWeeks extends TestCase {static class __CLR4_4_110rx10rxlc8azwc1{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672271031490L,8589935092L,47885,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    // Test in 2002/03 as time zones are more well known
    // (before the late 90's they were all over the place)
    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");

    public static void main(String[] args) {try{__CLR4_4_110rx10rxlc8azwc1.R.inc(47661);
        __CLR4_4_110rx10rxlc8azwc1.R.inc(47662);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_110rx10rxlc8azwc1.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_110rx10rxlc8azwc1.R.inc(47663);
        __CLR4_4_110rx10rxlc8azwc1.R.inc(47664);return new TestSuite(TestWeeks.class);
    }finally{__CLR4_4_110rx10rxlc8azwc1.R.flushNeeded();}}

    public TestWeeks(String name) {
        super(name);__CLR4_4_110rx10rxlc8azwc1.R.inc(47666);try{__CLR4_4_110rx10rxlc8azwc1.R.inc(47665);
    }finally{__CLR4_4_110rx10rxlc8azwc1.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_110rx10rxlc8azwc1.R.inc(47667);
    }finally{__CLR4_4_110rx10rxlc8azwc1.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_110rx10rxlc8azwc1.R.inc(47668);
    }finally{__CLR4_4_110rx10rxlc8azwc1.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testConstants() {__CLR4_4_110rx10rxlc8azwc1.R.globalSliceStart(getClass().getName(),47669);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15epzlw10s5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_110rx10rxlc8azwc1.R.rethrow($CLV_t2$);}finally{__CLR4_4_110rx10rxlc8azwc1.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestWeeks.testConstants",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),47669,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15epzlw10s5(){try{__CLR4_4_110rx10rxlc8azwc1.R.inc(47669);
        __CLR4_4_110rx10rxlc8azwc1.R.inc(47670);assertEquals(0, Weeks.ZERO.getWeeks());
        __CLR4_4_110rx10rxlc8azwc1.R.inc(47671);assertEquals(1, Weeks.ONE.getWeeks());
        __CLR4_4_110rx10rxlc8azwc1.R.inc(47672);assertEquals(2, Weeks.TWO.getWeeks());
        __CLR4_4_110rx10rxlc8azwc1.R.inc(47673);assertEquals(3, Weeks.THREE.getWeeks());
        __CLR4_4_110rx10rxlc8azwc1.R.inc(47674);assertEquals(Integer.MAX_VALUE, Weeks.MAX_VALUE.getWeeks());
        __CLR4_4_110rx10rxlc8azwc1.R.inc(47675);assertEquals(Integer.MIN_VALUE, Weeks.MIN_VALUE.getWeeks());
    }finally{__CLR4_4_110rx10rxlc8azwc1.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testFactory_weeks_int() {__CLR4_4_110rx10rxlc8azwc1.R.globalSliceStart(getClass().getName(),47676);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xs32q710sc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_110rx10rxlc8azwc1.R.rethrow($CLV_t2$);}finally{__CLR4_4_110rx10rxlc8azwc1.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestWeeks.testFactory_weeks_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),47676,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xs32q710sc(){try{__CLR4_4_110rx10rxlc8azwc1.R.inc(47676);
        __CLR4_4_110rx10rxlc8azwc1.R.inc(47677);assertSame(Weeks.ZERO, Weeks.weeks(0));
        __CLR4_4_110rx10rxlc8azwc1.R.inc(47678);assertSame(Weeks.ONE, Weeks.weeks(1));
        __CLR4_4_110rx10rxlc8azwc1.R.inc(47679);assertSame(Weeks.TWO, Weeks.weeks(2));
        __CLR4_4_110rx10rxlc8azwc1.R.inc(47680);assertSame(Weeks.THREE, Weeks.weeks(3));
        __CLR4_4_110rx10rxlc8azwc1.R.inc(47681);assertSame(Weeks.MAX_VALUE, Weeks.weeks(Integer.MAX_VALUE));
        __CLR4_4_110rx10rxlc8azwc1.R.inc(47682);assertSame(Weeks.MIN_VALUE, Weeks.weeks(Integer.MIN_VALUE));
        __CLR4_4_110rx10rxlc8azwc1.R.inc(47683);assertEquals(-1, Weeks.weeks(-1).getWeeks());
        __CLR4_4_110rx10rxlc8azwc1.R.inc(47684);assertEquals(4, Weeks.weeks(4).getWeeks());
    }finally{__CLR4_4_110rx10rxlc8azwc1.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testFactory_weeksBetween_RInstant() {__CLR4_4_110rx10rxlc8azwc1.R.globalSliceStart(getClass().getName(),47685);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fosy8510sl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_110rx10rxlc8azwc1.R.rethrow($CLV_t2$);}finally{__CLR4_4_110rx10rxlc8azwc1.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestWeeks.testFactory_weeksBetween_RInstant",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),47685,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fosy8510sl(){try{__CLR4_4_110rx10rxlc8azwc1.R.inc(47685);
        __CLR4_4_110rx10rxlc8azwc1.R.inc(47686);DateTime start = new DateTime(2006, 6, 9, 12, 0, 0, 0, PARIS);
        __CLR4_4_110rx10rxlc8azwc1.R.inc(47687);DateTime end1 = new DateTime(2006, 6, 30, 12, 0, 0, 0, PARIS);
        __CLR4_4_110rx10rxlc8azwc1.R.inc(47688);DateTime end2 = new DateTime(2006, 7, 21, 12, 0, 0, 0, PARIS);
        
        __CLR4_4_110rx10rxlc8azwc1.R.inc(47689);assertEquals(3, Weeks.weeksBetween(start, end1).getWeeks());
        __CLR4_4_110rx10rxlc8azwc1.R.inc(47690);assertEquals(0, Weeks.weeksBetween(start, start).getWeeks());
        __CLR4_4_110rx10rxlc8azwc1.R.inc(47691);assertEquals(0, Weeks.weeksBetween(end1, end1).getWeeks());
        __CLR4_4_110rx10rxlc8azwc1.R.inc(47692);assertEquals(-3, Weeks.weeksBetween(end1, start).getWeeks());
        __CLR4_4_110rx10rxlc8azwc1.R.inc(47693);assertEquals(6, Weeks.weeksBetween(start, end2).getWeeks());
    }finally{__CLR4_4_110rx10rxlc8azwc1.R.flushNeeded();}}

    @SuppressWarnings("deprecation")
    public void testFactory_weeksBetween_RPartial() {__CLR4_4_110rx10rxlc8azwc1.R.globalSliceStart(getClass().getName(),47694);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1w5wmp110su();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_110rx10rxlc8azwc1.R.rethrow($CLV_t2$);}finally{__CLR4_4_110rx10rxlc8azwc1.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestWeeks.testFactory_weeksBetween_RPartial",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),47694,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1w5wmp110su(){try{__CLR4_4_110rx10rxlc8azwc1.R.inc(47694);
        __CLR4_4_110rx10rxlc8azwc1.R.inc(47695);LocalDate start = new LocalDate(2006, 6, 9);
        __CLR4_4_110rx10rxlc8azwc1.R.inc(47696);LocalDate end1 = new LocalDate(2006, 6, 30);
        __CLR4_4_110rx10rxlc8azwc1.R.inc(47697);YearMonthDay end2 = new YearMonthDay(2006, 7, 21);
        
        __CLR4_4_110rx10rxlc8azwc1.R.inc(47698);assertEquals(3, Weeks.weeksBetween(start, end1).getWeeks());
        __CLR4_4_110rx10rxlc8azwc1.R.inc(47699);assertEquals(0, Weeks.weeksBetween(start, start).getWeeks());
        __CLR4_4_110rx10rxlc8azwc1.R.inc(47700);assertEquals(0, Weeks.weeksBetween(end1, end1).getWeeks());
        __CLR4_4_110rx10rxlc8azwc1.R.inc(47701);assertEquals(-3, Weeks.weeksBetween(end1, start).getWeeks());
        __CLR4_4_110rx10rxlc8azwc1.R.inc(47702);assertEquals(6, Weeks.weeksBetween(start, end2).getWeeks());
    }finally{__CLR4_4_110rx10rxlc8azwc1.R.flushNeeded();}}

    public void testFactory_weeksIn_RInterval() {__CLR4_4_110rx10rxlc8azwc1.R.globalSliceStart(getClass().getName(),47703);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15ldkzo10t3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_110rx10rxlc8azwc1.R.rethrow($CLV_t2$);}finally{__CLR4_4_110rx10rxlc8azwc1.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestWeeks.testFactory_weeksIn_RInterval",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),47703,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15ldkzo10t3(){try{__CLR4_4_110rx10rxlc8azwc1.R.inc(47703);
        __CLR4_4_110rx10rxlc8azwc1.R.inc(47704);DateTime start = new DateTime(2006, 6, 9, 12, 0, 0, 0, PARIS);
        __CLR4_4_110rx10rxlc8azwc1.R.inc(47705);DateTime end1 = new DateTime(2006, 6, 30, 12, 0, 0, 0, PARIS);
        __CLR4_4_110rx10rxlc8azwc1.R.inc(47706);DateTime end2 = new DateTime(2006, 7, 21, 12, 0, 0, 0, PARIS);
        
        __CLR4_4_110rx10rxlc8azwc1.R.inc(47707);assertEquals(0, Weeks.weeksIn((ReadableInterval) null).getWeeks());
        __CLR4_4_110rx10rxlc8azwc1.R.inc(47708);assertEquals(3, Weeks.weeksIn(new Interval(start, end1)).getWeeks());
        __CLR4_4_110rx10rxlc8azwc1.R.inc(47709);assertEquals(0, Weeks.weeksIn(new Interval(start, start)).getWeeks());
        __CLR4_4_110rx10rxlc8azwc1.R.inc(47710);assertEquals(0, Weeks.weeksIn(new Interval(end1, end1)).getWeeks());
        __CLR4_4_110rx10rxlc8azwc1.R.inc(47711);assertEquals(6, Weeks.weeksIn(new Interval(start, end2)).getWeeks());
    }finally{__CLR4_4_110rx10rxlc8azwc1.R.flushNeeded();}}

    public void testFactory_standardWeeksIn_RPeriod() {__CLR4_4_110rx10rxlc8azwc1.R.globalSliceStart(getClass().getName(),47712);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1446xn10tc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_110rx10rxlc8azwc1.R.rethrow($CLV_t2$);}finally{__CLR4_4_110rx10rxlc8azwc1.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestWeeks.testFactory_standardWeeksIn_RPeriod",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),47712,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1446xn10tc(){try{__CLR4_4_110rx10rxlc8azwc1.R.inc(47712);
        __CLR4_4_110rx10rxlc8azwc1.R.inc(47713);assertEquals(0, Weeks.standardWeeksIn((ReadablePeriod) null).getWeeks());
        __CLR4_4_110rx10rxlc8azwc1.R.inc(47714);assertEquals(0, Weeks.standardWeeksIn(Period.ZERO).getWeeks());
        __CLR4_4_110rx10rxlc8azwc1.R.inc(47715);assertEquals(1, Weeks.standardWeeksIn(new Period(0, 0, 1, 0, 0, 0, 0, 0)).getWeeks());
        __CLR4_4_110rx10rxlc8azwc1.R.inc(47716);assertEquals(123, Weeks.standardWeeksIn(Period.weeks(123)).getWeeks());
        __CLR4_4_110rx10rxlc8azwc1.R.inc(47717);assertEquals(-987, Weeks.standardWeeksIn(Period.weeks(-987)).getWeeks());
        __CLR4_4_110rx10rxlc8azwc1.R.inc(47718);assertEquals(1, Weeks.standardWeeksIn(Period.days(13)).getWeeks());
        __CLR4_4_110rx10rxlc8azwc1.R.inc(47719);assertEquals(2, Weeks.standardWeeksIn(Period.days(14)).getWeeks());
        __CLR4_4_110rx10rxlc8azwc1.R.inc(47720);assertEquals(2, Weeks.standardWeeksIn(Period.days(15)).getWeeks());
        __CLR4_4_110rx10rxlc8azwc1.R.inc(47721);try {
            __CLR4_4_110rx10rxlc8azwc1.R.inc(47722);Weeks.standardWeeksIn(Period.months(1));
            __CLR4_4_110rx10rxlc8azwc1.R.inc(47723);fail();
        } catch (IllegalArgumentException ex) {
            // expeceted
        }
    }finally{__CLR4_4_110rx10rxlc8azwc1.R.flushNeeded();}}

    public void testFactory_parseWeeks_String() {__CLR4_4_110rx10rxlc8azwc1.R.globalSliceStart(getClass().getName(),47724);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1oxubjw10to();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_110rx10rxlc8azwc1.R.rethrow($CLV_t2$);}finally{__CLR4_4_110rx10rxlc8azwc1.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestWeeks.testFactory_parseWeeks_String",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),47724,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1oxubjw10to(){try{__CLR4_4_110rx10rxlc8azwc1.R.inc(47724);
        __CLR4_4_110rx10rxlc8azwc1.R.inc(47725);assertEquals(0, Weeks.parseWeeks((String) null).getWeeks());
        __CLR4_4_110rx10rxlc8azwc1.R.inc(47726);assertEquals(0, Weeks.parseWeeks("P0W").getWeeks());
        __CLR4_4_110rx10rxlc8azwc1.R.inc(47727);assertEquals(1, Weeks.parseWeeks("P1W").getWeeks());
        __CLR4_4_110rx10rxlc8azwc1.R.inc(47728);assertEquals(-3, Weeks.parseWeeks("P-3W").getWeeks());
        __CLR4_4_110rx10rxlc8azwc1.R.inc(47729);assertEquals(2, Weeks.parseWeeks("P0Y0M2W").getWeeks());
        __CLR4_4_110rx10rxlc8azwc1.R.inc(47730);assertEquals(2, Weeks.parseWeeks("P2WT0H0M").getWeeks());
        __CLR4_4_110rx10rxlc8azwc1.R.inc(47731);try {
            __CLR4_4_110rx10rxlc8azwc1.R.inc(47732);Weeks.parseWeeks("P1Y1D");
            __CLR4_4_110rx10rxlc8azwc1.R.inc(47733);fail();
        } catch (IllegalArgumentException ex) {
            // expeceted
        }
        __CLR4_4_110rx10rxlc8azwc1.R.inc(47734);try {
            __CLR4_4_110rx10rxlc8azwc1.R.inc(47735);Weeks.parseWeeks("P1WT1H");
            __CLR4_4_110rx10rxlc8azwc1.R.inc(47736);fail();
        } catch (IllegalArgumentException ex) {
            // expeceted
        }
    }finally{__CLR4_4_110rx10rxlc8azwc1.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testGetMethods() {__CLR4_4_110rx10rxlc8azwc1.R.globalSliceStart(getClass().getName(),47737);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12sjdmz10u1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_110rx10rxlc8azwc1.R.rethrow($CLV_t2$);}finally{__CLR4_4_110rx10rxlc8azwc1.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestWeeks.testGetMethods",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),47737,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12sjdmz10u1(){try{__CLR4_4_110rx10rxlc8azwc1.R.inc(47737);
        __CLR4_4_110rx10rxlc8azwc1.R.inc(47738);Weeks test = Weeks.weeks(20);
        __CLR4_4_110rx10rxlc8azwc1.R.inc(47739);assertEquals(20, test.getWeeks());
    }finally{__CLR4_4_110rx10rxlc8azwc1.R.flushNeeded();}}

    public void testGetFieldType() {__CLR4_4_110rx10rxlc8azwc1.R.globalSliceStart(getClass().getName(),47740);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18z86mv10u4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_110rx10rxlc8azwc1.R.rethrow($CLV_t2$);}finally{__CLR4_4_110rx10rxlc8azwc1.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestWeeks.testGetFieldType",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),47740,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18z86mv10u4(){try{__CLR4_4_110rx10rxlc8azwc1.R.inc(47740);
        __CLR4_4_110rx10rxlc8azwc1.R.inc(47741);Weeks test = Weeks.weeks(20);
        __CLR4_4_110rx10rxlc8azwc1.R.inc(47742);assertEquals(DurationFieldType.weeks(), test.getFieldType());
    }finally{__CLR4_4_110rx10rxlc8azwc1.R.flushNeeded();}}

    public void testGetPeriodType() {__CLR4_4_110rx10rxlc8azwc1.R.globalSliceStart(getClass().getName(),47743);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ivat1i10u7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_110rx10rxlc8azwc1.R.rethrow($CLV_t2$);}finally{__CLR4_4_110rx10rxlc8azwc1.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestWeeks.testGetPeriodType",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),47743,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ivat1i10u7(){try{__CLR4_4_110rx10rxlc8azwc1.R.inc(47743);
        __CLR4_4_110rx10rxlc8azwc1.R.inc(47744);Weeks test = Weeks.weeks(20);
        __CLR4_4_110rx10rxlc8azwc1.R.inc(47745);assertEquals(PeriodType.weeks(), test.getPeriodType());
    }finally{__CLR4_4_110rx10rxlc8azwc1.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testIsGreaterThan() {__CLR4_4_110rx10rxlc8azwc1.R.globalSliceStart(getClass().getName(),47746);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s5pnom10ua();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_110rx10rxlc8azwc1.R.rethrow($CLV_t2$);}finally{__CLR4_4_110rx10rxlc8azwc1.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestWeeks.testIsGreaterThan",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),47746,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s5pnom10ua(){try{__CLR4_4_110rx10rxlc8azwc1.R.inc(47746);
        __CLR4_4_110rx10rxlc8azwc1.R.inc(47747);assertEquals(true, Weeks.THREE.isGreaterThan(Weeks.TWO));
        __CLR4_4_110rx10rxlc8azwc1.R.inc(47748);assertEquals(false, Weeks.THREE.isGreaterThan(Weeks.THREE));
        __CLR4_4_110rx10rxlc8azwc1.R.inc(47749);assertEquals(false, Weeks.TWO.isGreaterThan(Weeks.THREE));
        __CLR4_4_110rx10rxlc8azwc1.R.inc(47750);assertEquals(true, Weeks.ONE.isGreaterThan(null));
        __CLR4_4_110rx10rxlc8azwc1.R.inc(47751);assertEquals(false, Weeks.weeks(-1).isGreaterThan(null));
    }finally{__CLR4_4_110rx10rxlc8azwc1.R.flushNeeded();}}

    public void testIsLessThan() {__CLR4_4_110rx10rxlc8azwc1.R.globalSliceStart(getClass().getName(),47752);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rmk0kd10ug();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_110rx10rxlc8azwc1.R.rethrow($CLV_t2$);}finally{__CLR4_4_110rx10rxlc8azwc1.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestWeeks.testIsLessThan",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),47752,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rmk0kd10ug(){try{__CLR4_4_110rx10rxlc8azwc1.R.inc(47752);
        __CLR4_4_110rx10rxlc8azwc1.R.inc(47753);assertEquals(false, Weeks.THREE.isLessThan(Weeks.TWO));
        __CLR4_4_110rx10rxlc8azwc1.R.inc(47754);assertEquals(false, Weeks.THREE.isLessThan(Weeks.THREE));
        __CLR4_4_110rx10rxlc8azwc1.R.inc(47755);assertEquals(true, Weeks.TWO.isLessThan(Weeks.THREE));
        __CLR4_4_110rx10rxlc8azwc1.R.inc(47756);assertEquals(false, Weeks.ONE.isLessThan(null));
        __CLR4_4_110rx10rxlc8azwc1.R.inc(47757);assertEquals(true, Weeks.weeks(-1).isLessThan(null));
    }finally{__CLR4_4_110rx10rxlc8azwc1.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testToString() {__CLR4_4_110rx10rxlc8azwc1.R.globalSliceStart(getClass().getName(),47758);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hrxdid10um();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_110rx10rxlc8azwc1.R.rethrow($CLV_t2$);}finally{__CLR4_4_110rx10rxlc8azwc1.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestWeeks.testToString",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),47758,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hrxdid10um(){try{__CLR4_4_110rx10rxlc8azwc1.R.inc(47758);
        __CLR4_4_110rx10rxlc8azwc1.R.inc(47759);Weeks test = Weeks.weeks(20);
        __CLR4_4_110rx10rxlc8azwc1.R.inc(47760);assertEquals("P20W", test.toString());
        
        __CLR4_4_110rx10rxlc8azwc1.R.inc(47761);test = Weeks.weeks(-20);
        __CLR4_4_110rx10rxlc8azwc1.R.inc(47762);assertEquals("P-20W", test.toString());
    }finally{__CLR4_4_110rx10rxlc8azwc1.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testSerialization() throws Exception {__CLR4_4_110rx10rxlc8azwc1.R.globalSliceStart(getClass().getName(),47763);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16m1on910ur();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_110rx10rxlc8azwc1.R.rethrow($CLV_t2$);}finally{__CLR4_4_110rx10rxlc8azwc1.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestWeeks.testSerialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),47763,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16m1on910ur() throws Exception{try{__CLR4_4_110rx10rxlc8azwc1.R.inc(47763);
        __CLR4_4_110rx10rxlc8azwc1.R.inc(47764);Weeks test = Weeks.THREE;
        
        __CLR4_4_110rx10rxlc8azwc1.R.inc(47765);ByteArrayOutputStream baos = new ByteArrayOutputStream();
        __CLR4_4_110rx10rxlc8azwc1.R.inc(47766);ObjectOutputStream oos = new ObjectOutputStream(baos);
        __CLR4_4_110rx10rxlc8azwc1.R.inc(47767);oos.writeObject(test);
        __CLR4_4_110rx10rxlc8azwc1.R.inc(47768);byte[] bytes = baos.toByteArray();
        __CLR4_4_110rx10rxlc8azwc1.R.inc(47769);oos.close();
        
        __CLR4_4_110rx10rxlc8azwc1.R.inc(47770);ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        __CLR4_4_110rx10rxlc8azwc1.R.inc(47771);ObjectInputStream ois = new ObjectInputStream(bais);
        __CLR4_4_110rx10rxlc8azwc1.R.inc(47772);Weeks result = (Weeks) ois.readObject();
        __CLR4_4_110rx10rxlc8azwc1.R.inc(47773);ois.close();
        
        __CLR4_4_110rx10rxlc8azwc1.R.inc(47774);assertSame(test, result);
    }finally{__CLR4_4_110rx10rxlc8azwc1.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testToStandardDays() {__CLR4_4_110rx10rxlc8azwc1.R.globalSliceStart(getClass().getName(),47775);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1eftdm010v3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_110rx10rxlc8azwc1.R.rethrow($CLV_t2$);}finally{__CLR4_4_110rx10rxlc8azwc1.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestWeeks.testToStandardDays",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),47775,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1eftdm010v3(){try{__CLR4_4_110rx10rxlc8azwc1.R.inc(47775);
        __CLR4_4_110rx10rxlc8azwc1.R.inc(47776);Weeks test = Weeks.weeks(2);
        __CLR4_4_110rx10rxlc8azwc1.R.inc(47777);Days expected = Days.days(14);
        __CLR4_4_110rx10rxlc8azwc1.R.inc(47778);assertEquals(expected, test.toStandardDays());
        
        __CLR4_4_110rx10rxlc8azwc1.R.inc(47779);try {
            __CLR4_4_110rx10rxlc8azwc1.R.inc(47780);Weeks.MAX_VALUE.toStandardDays();
            __CLR4_4_110rx10rxlc8azwc1.R.inc(47781);fail();
        } catch (ArithmeticException ex) {
            // expected
        }
    }finally{__CLR4_4_110rx10rxlc8azwc1.R.flushNeeded();}}

    public void testToStandardHours() {__CLR4_4_110rx10rxlc8azwc1.R.globalSliceStart(getClass().getName(),47782);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ikk7g10va();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_110rx10rxlc8azwc1.R.rethrow($CLV_t2$);}finally{__CLR4_4_110rx10rxlc8azwc1.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestWeeks.testToStandardHours",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),47782,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ikk7g10va(){try{__CLR4_4_110rx10rxlc8azwc1.R.inc(47782);
        __CLR4_4_110rx10rxlc8azwc1.R.inc(47783);Weeks test = Weeks.weeks(2);
        __CLR4_4_110rx10rxlc8azwc1.R.inc(47784);Hours expected = Hours.hours(2 * 7 * 24);
        __CLR4_4_110rx10rxlc8azwc1.R.inc(47785);assertEquals(expected, test.toStandardHours());
        
        __CLR4_4_110rx10rxlc8azwc1.R.inc(47786);try {
            __CLR4_4_110rx10rxlc8azwc1.R.inc(47787);Weeks.MAX_VALUE.toStandardHours();
            __CLR4_4_110rx10rxlc8azwc1.R.inc(47788);fail();
        } catch (ArithmeticException ex) {
            // expected
        }
    }finally{__CLR4_4_110rx10rxlc8azwc1.R.flushNeeded();}}

    public void testToStandardMinutes() {__CLR4_4_110rx10rxlc8azwc1.R.globalSliceStart(getClass().getName(),47789);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1r0kt4410vh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_110rx10rxlc8azwc1.R.rethrow($CLV_t2$);}finally{__CLR4_4_110rx10rxlc8azwc1.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestWeeks.testToStandardMinutes",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),47789,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1r0kt4410vh(){try{__CLR4_4_110rx10rxlc8azwc1.R.inc(47789);
        __CLR4_4_110rx10rxlc8azwc1.R.inc(47790);Weeks test = Weeks.weeks(2);
        __CLR4_4_110rx10rxlc8azwc1.R.inc(47791);Minutes expected = Minutes.minutes(2 * 7 * 24 * 60);
        __CLR4_4_110rx10rxlc8azwc1.R.inc(47792);assertEquals(expected, test.toStandardMinutes());
        
        __CLR4_4_110rx10rxlc8azwc1.R.inc(47793);try {
            __CLR4_4_110rx10rxlc8azwc1.R.inc(47794);Weeks.MAX_VALUE.toStandardMinutes();
            __CLR4_4_110rx10rxlc8azwc1.R.inc(47795);fail();
        } catch (ArithmeticException ex) {
            // expected
        }
    }finally{__CLR4_4_110rx10rxlc8azwc1.R.flushNeeded();}}

    public void testToStandardSeconds() {__CLR4_4_110rx10rxlc8azwc1.R.globalSliceStart(getClass().getName(),47796);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1emeoqs10vo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_110rx10rxlc8azwc1.R.rethrow($CLV_t2$);}finally{__CLR4_4_110rx10rxlc8azwc1.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestWeeks.testToStandardSeconds",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),47796,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1emeoqs10vo(){try{__CLR4_4_110rx10rxlc8azwc1.R.inc(47796);
        __CLR4_4_110rx10rxlc8azwc1.R.inc(47797);Weeks test = Weeks.weeks(2);
        __CLR4_4_110rx10rxlc8azwc1.R.inc(47798);Seconds expected = Seconds.seconds(2 * 7 * 24 * 60 * 60);
        __CLR4_4_110rx10rxlc8azwc1.R.inc(47799);assertEquals(expected, test.toStandardSeconds());
        
        __CLR4_4_110rx10rxlc8azwc1.R.inc(47800);try {
            __CLR4_4_110rx10rxlc8azwc1.R.inc(47801);Weeks.MAX_VALUE.toStandardSeconds();
            __CLR4_4_110rx10rxlc8azwc1.R.inc(47802);fail();
        } catch (ArithmeticException ex) {
            // expected
        }
    }finally{__CLR4_4_110rx10rxlc8azwc1.R.flushNeeded();}}

    public void testToStandardDuration() {__CLR4_4_110rx10rxlc8azwc1.R.globalSliceStart(getClass().getName(),47803);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1izmvnp10vv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_110rx10rxlc8azwc1.R.rethrow($CLV_t2$);}finally{__CLR4_4_110rx10rxlc8azwc1.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestWeeks.testToStandardDuration",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),47803,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1izmvnp10vv(){try{__CLR4_4_110rx10rxlc8azwc1.R.inc(47803);
        __CLR4_4_110rx10rxlc8azwc1.R.inc(47804);Weeks test = Weeks.weeks(20);
        __CLR4_4_110rx10rxlc8azwc1.R.inc(47805);Duration expected = new Duration(20L * DateTimeConstants.MILLIS_PER_WEEK);
        __CLR4_4_110rx10rxlc8azwc1.R.inc(47806);assertEquals(expected, test.toStandardDuration());
        
        __CLR4_4_110rx10rxlc8azwc1.R.inc(47807);expected = new Duration(((long) Integer.MAX_VALUE) * DateTimeConstants.MILLIS_PER_WEEK);
        __CLR4_4_110rx10rxlc8azwc1.R.inc(47808);assertEquals(expected, Weeks.MAX_VALUE.toStandardDuration());
    }finally{__CLR4_4_110rx10rxlc8azwc1.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testPlus_int() {__CLR4_4_110rx10rxlc8azwc1.R.globalSliceStart(getClass().getName(),47809);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1scc4eb10w1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_110rx10rxlc8azwc1.R.rethrow($CLV_t2$);}finally{__CLR4_4_110rx10rxlc8azwc1.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestWeeks.testPlus_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),47809,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1scc4eb10w1(){try{__CLR4_4_110rx10rxlc8azwc1.R.inc(47809);
        __CLR4_4_110rx10rxlc8azwc1.R.inc(47810);Weeks test2 = Weeks.weeks(2);
        __CLR4_4_110rx10rxlc8azwc1.R.inc(47811);Weeks result = test2.plus(3);
        __CLR4_4_110rx10rxlc8azwc1.R.inc(47812);assertEquals(2, test2.getWeeks());
        __CLR4_4_110rx10rxlc8azwc1.R.inc(47813);assertEquals(5, result.getWeeks());
        
        __CLR4_4_110rx10rxlc8azwc1.R.inc(47814);assertEquals(1, Weeks.ONE.plus(0).getWeeks());
        
        __CLR4_4_110rx10rxlc8azwc1.R.inc(47815);try {
            __CLR4_4_110rx10rxlc8azwc1.R.inc(47816);Weeks.MAX_VALUE.plus(1);
            __CLR4_4_110rx10rxlc8azwc1.R.inc(47817);fail();
        } catch (ArithmeticException ex) {
            // expected
        }
    }finally{__CLR4_4_110rx10rxlc8azwc1.R.flushNeeded();}}

    public void testPlus_Weeks() {__CLR4_4_110rx10rxlc8azwc1.R.globalSliceStart(getClass().getName(),47818);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jghr0310wa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_110rx10rxlc8azwc1.R.rethrow($CLV_t2$);}finally{__CLR4_4_110rx10rxlc8azwc1.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestWeeks.testPlus_Weeks",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),47818,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jghr0310wa(){try{__CLR4_4_110rx10rxlc8azwc1.R.inc(47818);
        __CLR4_4_110rx10rxlc8azwc1.R.inc(47819);Weeks test2 = Weeks.weeks(2);
        __CLR4_4_110rx10rxlc8azwc1.R.inc(47820);Weeks test3 = Weeks.weeks(3);
        __CLR4_4_110rx10rxlc8azwc1.R.inc(47821);Weeks result = test2.plus(test3);
        __CLR4_4_110rx10rxlc8azwc1.R.inc(47822);assertEquals(2, test2.getWeeks());
        __CLR4_4_110rx10rxlc8azwc1.R.inc(47823);assertEquals(3, test3.getWeeks());
        __CLR4_4_110rx10rxlc8azwc1.R.inc(47824);assertEquals(5, result.getWeeks());
        
        __CLR4_4_110rx10rxlc8azwc1.R.inc(47825);assertEquals(1, Weeks.ONE.plus(Weeks.ZERO).getWeeks());
        __CLR4_4_110rx10rxlc8azwc1.R.inc(47826);assertEquals(1, Weeks.ONE.plus((Weeks) null).getWeeks());
        
        __CLR4_4_110rx10rxlc8azwc1.R.inc(47827);try {
            __CLR4_4_110rx10rxlc8azwc1.R.inc(47828);Weeks.MAX_VALUE.plus(Weeks.ONE);
            __CLR4_4_110rx10rxlc8azwc1.R.inc(47829);fail();
        } catch (ArithmeticException ex) {
            // expected
        }
    }finally{__CLR4_4_110rx10rxlc8azwc1.R.flushNeeded();}}

    public void testMinus_int() {__CLR4_4_110rx10rxlc8azwc1.R.globalSliceStart(getClass().getName(),47830);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_118wkvp10wm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_110rx10rxlc8azwc1.R.rethrow($CLV_t2$);}finally{__CLR4_4_110rx10rxlc8azwc1.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestWeeks.testMinus_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),47830,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_118wkvp10wm(){try{__CLR4_4_110rx10rxlc8azwc1.R.inc(47830);
        __CLR4_4_110rx10rxlc8azwc1.R.inc(47831);Weeks test2 = Weeks.weeks(2);
        __CLR4_4_110rx10rxlc8azwc1.R.inc(47832);Weeks result = test2.minus(3);
        __CLR4_4_110rx10rxlc8azwc1.R.inc(47833);assertEquals(2, test2.getWeeks());
        __CLR4_4_110rx10rxlc8azwc1.R.inc(47834);assertEquals(-1, result.getWeeks());
        
        __CLR4_4_110rx10rxlc8azwc1.R.inc(47835);assertEquals(1, Weeks.ONE.minus(0).getWeeks());
        
        __CLR4_4_110rx10rxlc8azwc1.R.inc(47836);try {
            __CLR4_4_110rx10rxlc8azwc1.R.inc(47837);Weeks.MIN_VALUE.minus(1);
            __CLR4_4_110rx10rxlc8azwc1.R.inc(47838);fail();
        } catch (ArithmeticException ex) {
            // expected
        }
    }finally{__CLR4_4_110rx10rxlc8azwc1.R.flushNeeded();}}

    public void testMinus_Weeks() {__CLR4_4_110rx10rxlc8azwc1.R.globalSliceStart(getClass().getName(),47839);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lu65uj10wv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_110rx10rxlc8azwc1.R.rethrow($CLV_t2$);}finally{__CLR4_4_110rx10rxlc8azwc1.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestWeeks.testMinus_Weeks",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),47839,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lu65uj10wv(){try{__CLR4_4_110rx10rxlc8azwc1.R.inc(47839);
        __CLR4_4_110rx10rxlc8azwc1.R.inc(47840);Weeks test2 = Weeks.weeks(2);
        __CLR4_4_110rx10rxlc8azwc1.R.inc(47841);Weeks test3 = Weeks.weeks(3);
        __CLR4_4_110rx10rxlc8azwc1.R.inc(47842);Weeks result = test2.minus(test3);
        __CLR4_4_110rx10rxlc8azwc1.R.inc(47843);assertEquals(2, test2.getWeeks());
        __CLR4_4_110rx10rxlc8azwc1.R.inc(47844);assertEquals(3, test3.getWeeks());
        __CLR4_4_110rx10rxlc8azwc1.R.inc(47845);assertEquals(-1, result.getWeeks());
        
        __CLR4_4_110rx10rxlc8azwc1.R.inc(47846);assertEquals(1, Weeks.ONE.minus(Weeks.ZERO).getWeeks());
        __CLR4_4_110rx10rxlc8azwc1.R.inc(47847);assertEquals(1, Weeks.ONE.minus((Weeks) null).getWeeks());
        
        __CLR4_4_110rx10rxlc8azwc1.R.inc(47848);try {
            __CLR4_4_110rx10rxlc8azwc1.R.inc(47849);Weeks.MIN_VALUE.minus(Weeks.ONE);
            __CLR4_4_110rx10rxlc8azwc1.R.inc(47850);fail();
        } catch (ArithmeticException ex) {
            // expected
        }
    }finally{__CLR4_4_110rx10rxlc8azwc1.R.flushNeeded();}}

    public void testMultipliedBy_int() {__CLR4_4_110rx10rxlc8azwc1.R.globalSliceStart(getClass().getName(),47851);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1szpsdp10x7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_110rx10rxlc8azwc1.R.rethrow($CLV_t2$);}finally{__CLR4_4_110rx10rxlc8azwc1.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestWeeks.testMultipliedBy_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),47851,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1szpsdp10x7(){try{__CLR4_4_110rx10rxlc8azwc1.R.inc(47851);
        __CLR4_4_110rx10rxlc8azwc1.R.inc(47852);Weeks test = Weeks.weeks(2);
        __CLR4_4_110rx10rxlc8azwc1.R.inc(47853);assertEquals(6, test.multipliedBy(3).getWeeks());
        __CLR4_4_110rx10rxlc8azwc1.R.inc(47854);assertEquals(2, test.getWeeks());
        __CLR4_4_110rx10rxlc8azwc1.R.inc(47855);assertEquals(-6, test.multipliedBy(-3).getWeeks());
        __CLR4_4_110rx10rxlc8azwc1.R.inc(47856);assertSame(test, test.multipliedBy(1));
        
        __CLR4_4_110rx10rxlc8azwc1.R.inc(47857);Weeks halfMax = Weeks.weeks(Integer.MAX_VALUE / 2 + 1);
        __CLR4_4_110rx10rxlc8azwc1.R.inc(47858);try {
            __CLR4_4_110rx10rxlc8azwc1.R.inc(47859);halfMax.multipliedBy(2);
            __CLR4_4_110rx10rxlc8azwc1.R.inc(47860);fail();
        } catch (ArithmeticException ex) {
            // expected
        }
    }finally{__CLR4_4_110rx10rxlc8azwc1.R.flushNeeded();}}

    public void testDividedBy_int() {__CLR4_4_110rx10rxlc8azwc1.R.globalSliceStart(getClass().getName(),47861);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q9i8qv10xh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_110rx10rxlc8azwc1.R.rethrow($CLV_t2$);}finally{__CLR4_4_110rx10rxlc8azwc1.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestWeeks.testDividedBy_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),47861,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q9i8qv10xh(){try{__CLR4_4_110rx10rxlc8azwc1.R.inc(47861);
        __CLR4_4_110rx10rxlc8azwc1.R.inc(47862);Weeks test = Weeks.weeks(12);
        __CLR4_4_110rx10rxlc8azwc1.R.inc(47863);assertEquals(6, test.dividedBy(2).getWeeks());
        __CLR4_4_110rx10rxlc8azwc1.R.inc(47864);assertEquals(12, test.getWeeks());
        __CLR4_4_110rx10rxlc8azwc1.R.inc(47865);assertEquals(4, test.dividedBy(3).getWeeks());
        __CLR4_4_110rx10rxlc8azwc1.R.inc(47866);assertEquals(3, test.dividedBy(4).getWeeks());
        __CLR4_4_110rx10rxlc8azwc1.R.inc(47867);assertEquals(2, test.dividedBy(5).getWeeks());
        __CLR4_4_110rx10rxlc8azwc1.R.inc(47868);assertEquals(2, test.dividedBy(6).getWeeks());
        __CLR4_4_110rx10rxlc8azwc1.R.inc(47869);assertSame(test, test.dividedBy(1));
        
        __CLR4_4_110rx10rxlc8azwc1.R.inc(47870);try {
            __CLR4_4_110rx10rxlc8azwc1.R.inc(47871);Weeks.ONE.dividedBy(0);
            __CLR4_4_110rx10rxlc8azwc1.R.inc(47872);fail();
        } catch (ArithmeticException ex) {
            // expected
        }
    }finally{__CLR4_4_110rx10rxlc8azwc1.R.flushNeeded();}}

    public void testNegated() {__CLR4_4_110rx10rxlc8azwc1.R.globalSliceStart(getClass().getName(),47873);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1av330710xt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_110rx10rxlc8azwc1.R.rethrow($CLV_t2$);}finally{__CLR4_4_110rx10rxlc8azwc1.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestWeeks.testNegated",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),47873,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1av330710xt(){try{__CLR4_4_110rx10rxlc8azwc1.R.inc(47873);
        __CLR4_4_110rx10rxlc8azwc1.R.inc(47874);Weeks test = Weeks.weeks(12);
        __CLR4_4_110rx10rxlc8azwc1.R.inc(47875);assertEquals(-12, test.negated().getWeeks());
        __CLR4_4_110rx10rxlc8azwc1.R.inc(47876);assertEquals(12, test.getWeeks());
        
        __CLR4_4_110rx10rxlc8azwc1.R.inc(47877);try {
            __CLR4_4_110rx10rxlc8azwc1.R.inc(47878);Weeks.MIN_VALUE.negated();
            __CLR4_4_110rx10rxlc8azwc1.R.inc(47879);fail();
        } catch (ArithmeticException ex) {
            // expected
        }
    }finally{__CLR4_4_110rx10rxlc8azwc1.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testAddToLocalDate() {__CLR4_4_110rx10rxlc8azwc1.R.globalSliceStart(getClass().getName(),47880);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1thm5yu10y0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_110rx10rxlc8azwc1.R.rethrow($CLV_t2$);}finally{__CLR4_4_110rx10rxlc8azwc1.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestWeeks.testAddToLocalDate",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),47880,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1thm5yu10y0(){try{__CLR4_4_110rx10rxlc8azwc1.R.inc(47880);
        __CLR4_4_110rx10rxlc8azwc1.R.inc(47881);Weeks test = Weeks.weeks(3);
        __CLR4_4_110rx10rxlc8azwc1.R.inc(47882);LocalDate date = new LocalDate(2006, 6, 1);
        __CLR4_4_110rx10rxlc8azwc1.R.inc(47883);LocalDate expected = new LocalDate(2006, 6, 22);
        __CLR4_4_110rx10rxlc8azwc1.R.inc(47884);assertEquals(expected, date.plus(test));
    }finally{__CLR4_4_110rx10rxlc8azwc1.R.flushNeeded();}}

}
