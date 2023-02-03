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
 * This class is a Junit unit test for Months.
 *
 * @author Stephen Colebourne
 */
public class TestMonths extends TestCase {static class __CLR4_4_1ssrssrlc8azvog{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672271031490L,8589935092L,37539,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    // Test in 2002/03 as time zones are more well known
    // (before the late 90's they were all over the place)
    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");

    public static void main(String[] args) {try{__CLR4_4_1ssrssrlc8azvog.R.inc(37323);
        __CLR4_4_1ssrssrlc8azvog.R.inc(37324);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1ssrssrlc8azvog.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1ssrssrlc8azvog.R.inc(37325);
        __CLR4_4_1ssrssrlc8azvog.R.inc(37326);return new TestSuite(TestMonths.class);
    }finally{__CLR4_4_1ssrssrlc8azvog.R.flushNeeded();}}

    public TestMonths(String name) {
        super(name);__CLR4_4_1ssrssrlc8azvog.R.inc(37328);try{__CLR4_4_1ssrssrlc8azvog.R.inc(37327);
    }finally{__CLR4_4_1ssrssrlc8azvog.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1ssrssrlc8azvog.R.inc(37329);
    }finally{__CLR4_4_1ssrssrlc8azvog.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1ssrssrlc8azvog.R.inc(37330);
    }finally{__CLR4_4_1ssrssrlc8azvog.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testConstants() {__CLR4_4_1ssrssrlc8azvog.R.globalSliceStart(getClass().getName(),37331);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15epzlwssz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ssrssrlc8azvog.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ssrssrlc8azvog.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonths.testConstants",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37331,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15epzlwssz(){try{__CLR4_4_1ssrssrlc8azvog.R.inc(37331);
        __CLR4_4_1ssrssrlc8azvog.R.inc(37332);assertEquals(0, Months.ZERO.getMonths());
        __CLR4_4_1ssrssrlc8azvog.R.inc(37333);assertEquals(1, Months.ONE.getMonths());
        __CLR4_4_1ssrssrlc8azvog.R.inc(37334);assertEquals(2, Months.TWO.getMonths());
        __CLR4_4_1ssrssrlc8azvog.R.inc(37335);assertEquals(3, Months.THREE.getMonths());
        __CLR4_4_1ssrssrlc8azvog.R.inc(37336);assertEquals(4, Months.FOUR.getMonths());
        __CLR4_4_1ssrssrlc8azvog.R.inc(37337);assertEquals(5, Months.FIVE.getMonths());
        __CLR4_4_1ssrssrlc8azvog.R.inc(37338);assertEquals(6, Months.SIX.getMonths());
        __CLR4_4_1ssrssrlc8azvog.R.inc(37339);assertEquals(7, Months.SEVEN.getMonths());
        __CLR4_4_1ssrssrlc8azvog.R.inc(37340);assertEquals(8, Months.EIGHT.getMonths());
        __CLR4_4_1ssrssrlc8azvog.R.inc(37341);assertEquals(9, Months.NINE.getMonths());
        __CLR4_4_1ssrssrlc8azvog.R.inc(37342);assertEquals(10, Months.TEN.getMonths());
        __CLR4_4_1ssrssrlc8azvog.R.inc(37343);assertEquals(11, Months.ELEVEN.getMonths());
        __CLR4_4_1ssrssrlc8azvog.R.inc(37344);assertEquals(12, Months.TWELVE.getMonths());
        __CLR4_4_1ssrssrlc8azvog.R.inc(37345);assertEquals(Integer.MAX_VALUE, Months.MAX_VALUE.getMonths());
        __CLR4_4_1ssrssrlc8azvog.R.inc(37346);assertEquals(Integer.MIN_VALUE, Months.MIN_VALUE.getMonths());
    }finally{__CLR4_4_1ssrssrlc8azvog.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testFactory_months_int() {__CLR4_4_1ssrssrlc8azvog.R.globalSliceStart(getClass().getName(),37347);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18yr969stf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ssrssrlc8azvog.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ssrssrlc8azvog.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonths.testFactory_months_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37347,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18yr969stf(){try{__CLR4_4_1ssrssrlc8azvog.R.inc(37347);
        __CLR4_4_1ssrssrlc8azvog.R.inc(37348);assertSame(Months.ZERO, Months.months(0));
        __CLR4_4_1ssrssrlc8azvog.R.inc(37349);assertSame(Months.ONE, Months.months(1));
        __CLR4_4_1ssrssrlc8azvog.R.inc(37350);assertSame(Months.TWO, Months.months(2));
        __CLR4_4_1ssrssrlc8azvog.R.inc(37351);assertSame(Months.THREE, Months.months(3));
        __CLR4_4_1ssrssrlc8azvog.R.inc(37352);assertSame(Months.FOUR, Months.months(4));
        __CLR4_4_1ssrssrlc8azvog.R.inc(37353);assertSame(Months.FIVE, Months.months(5));
        __CLR4_4_1ssrssrlc8azvog.R.inc(37354);assertSame(Months.SIX, Months.months(6));
        __CLR4_4_1ssrssrlc8azvog.R.inc(37355);assertSame(Months.SEVEN, Months.months(7));
        __CLR4_4_1ssrssrlc8azvog.R.inc(37356);assertSame(Months.EIGHT, Months.months(8));
        __CLR4_4_1ssrssrlc8azvog.R.inc(37357);assertSame(Months.NINE, Months.months(9));
        __CLR4_4_1ssrssrlc8azvog.R.inc(37358);assertSame(Months.TEN, Months.months(10));
        __CLR4_4_1ssrssrlc8azvog.R.inc(37359);assertSame(Months.ELEVEN, Months.months(11));
        __CLR4_4_1ssrssrlc8azvog.R.inc(37360);assertSame(Months.TWELVE, Months.months(12));
        __CLR4_4_1ssrssrlc8azvog.R.inc(37361);assertSame(Months.MAX_VALUE, Months.months(Integer.MAX_VALUE));
        __CLR4_4_1ssrssrlc8azvog.R.inc(37362);assertSame(Months.MIN_VALUE, Months.months(Integer.MIN_VALUE));
        __CLR4_4_1ssrssrlc8azvog.R.inc(37363);assertEquals(-1, Months.months(-1).getMonths());
        __CLR4_4_1ssrssrlc8azvog.R.inc(37364);assertEquals(13, Months.months(13).getMonths());
    }finally{__CLR4_4_1ssrssrlc8azvog.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testFactory_monthsBetween_RInstant() {__CLR4_4_1ssrssrlc8azvog.R.globalSliceStart(getClass().getName(),37365);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ru34yvstx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ssrssrlc8azvog.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ssrssrlc8azvog.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonths.testFactory_monthsBetween_RInstant",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37365,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ru34yvstx(){try{__CLR4_4_1ssrssrlc8azvog.R.inc(37365);
        __CLR4_4_1ssrssrlc8azvog.R.inc(37366);DateTime start = new DateTime(2006, 6, 9, 12, 0, 0, 0, PARIS);
        __CLR4_4_1ssrssrlc8azvog.R.inc(37367);DateTime end1 = new DateTime(2006, 9, 9, 12, 0, 0, 0, PARIS);
        __CLR4_4_1ssrssrlc8azvog.R.inc(37368);DateTime end2 = new DateTime(2006, 12, 9, 12, 0, 0, 0, PARIS);
        
        __CLR4_4_1ssrssrlc8azvog.R.inc(37369);assertEquals(3, Months.monthsBetween(start, end1).getMonths());
        __CLR4_4_1ssrssrlc8azvog.R.inc(37370);assertEquals(0, Months.monthsBetween(start, start).getMonths());
        __CLR4_4_1ssrssrlc8azvog.R.inc(37371);assertEquals(0, Months.monthsBetween(end1, end1).getMonths());
        __CLR4_4_1ssrssrlc8azvog.R.inc(37372);assertEquals(-3, Months.monthsBetween(end1, start).getMonths());
        __CLR4_4_1ssrssrlc8azvog.R.inc(37373);assertEquals(6, Months.monthsBetween(start, end2).getMonths());
    }finally{__CLR4_4_1ssrssrlc8azvog.R.flushNeeded();}}

    //-------------------------------------------------------------------------
    @SuppressWarnings("deprecation")
    public void testFactory_monthsBetween_RPartial_LocalDate() {__CLR4_4_1ssrssrlc8azvog.R.globalSliceStart(getClass().getName(),37374);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kc58wxsu6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ssrssrlc8azvog.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ssrssrlc8azvog.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonths.testFactory_monthsBetween_RPartial_LocalDate",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37374,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kc58wxsu6(){try{__CLR4_4_1ssrssrlc8azvog.R.inc(37374);
        __CLR4_4_1ssrssrlc8azvog.R.inc(37375);LocalDate start = new LocalDate(2006, 6, 9);
        __CLR4_4_1ssrssrlc8azvog.R.inc(37376);LocalDate end1 = new LocalDate(2006, 9, 9);
        __CLR4_4_1ssrssrlc8azvog.R.inc(37377);YearMonthDay end2 = new YearMonthDay(2006, 12, 9);
        
        __CLR4_4_1ssrssrlc8azvog.R.inc(37378);assertEquals(3, Months.monthsBetween(start, end1).getMonths());
        __CLR4_4_1ssrssrlc8azvog.R.inc(37379);assertEquals(0, Months.monthsBetween(start, start).getMonths());
        __CLR4_4_1ssrssrlc8azvog.R.inc(37380);assertEquals(0, Months.monthsBetween(end1, end1).getMonths());
        __CLR4_4_1ssrssrlc8azvog.R.inc(37381);assertEquals(-3, Months.monthsBetween(end1, start).getMonths());
        __CLR4_4_1ssrssrlc8azvog.R.inc(37382);assertEquals(6, Months.monthsBetween(start, end2).getMonths());
    }finally{__CLR4_4_1ssrssrlc8azvog.R.flushNeeded();}}

    public void testFactory_monthsBetween_RPartial_YearMonth() {__CLR4_4_1ssrssrlc8azvog.R.globalSliceStart(getClass().getName(),37383);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1k9s7u3suf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ssrssrlc8azvog.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ssrssrlc8azvog.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonths.testFactory_monthsBetween_RPartial_YearMonth",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37383,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1k9s7u3suf(){try{__CLR4_4_1ssrssrlc8azvog.R.inc(37383);
        __CLR4_4_1ssrssrlc8azvog.R.inc(37384);YearMonth start1 = new YearMonth(2011, 1);
        __CLR4_4_1ssrssrlc8azvog.R.inc(37385);for (int i = 0; (((i < 6)&&(__CLR4_4_1ssrssrlc8azvog.R.iget(37386)!=0|true))||(__CLR4_4_1ssrssrlc8azvog.R.iget(37387)==0&false)); i++) {{
            __CLR4_4_1ssrssrlc8azvog.R.inc(37388);YearMonth start2 = new YearMonth(2011 + i, 1);
            __CLR4_4_1ssrssrlc8azvog.R.inc(37389);YearMonth end = new YearMonth(2011 + i, 3);
            __CLR4_4_1ssrssrlc8azvog.R.inc(37390);assertEquals(i * 12 + 2, Months.monthsBetween(start1, end).getMonths());
            __CLR4_4_1ssrssrlc8azvog.R.inc(37391);assertEquals(2, Months.monthsBetween(start2, end).getMonths());
        }
    }}finally{__CLR4_4_1ssrssrlc8azvog.R.flushNeeded();}}

    public void testFactory_monthsBetween_RPartial_MonthDay() {__CLR4_4_1ssrssrlc8azvog.R.globalSliceStart(getClass().getName(),37392);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ruvefysuo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ssrssrlc8azvog.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ssrssrlc8azvog.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonths.testFactory_monthsBetween_RPartial_MonthDay",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37392,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ruvefysuo(){try{__CLR4_4_1ssrssrlc8azvog.R.inc(37392);
        __CLR4_4_1ssrssrlc8azvog.R.inc(37393);MonthDay start = new MonthDay(2, 1);
        __CLR4_4_1ssrssrlc8azvog.R.inc(37394);MonthDay end1 = new MonthDay(2, 28);
        __CLR4_4_1ssrssrlc8azvog.R.inc(37395);MonthDay end2 = new MonthDay(2, 29);
        __CLR4_4_1ssrssrlc8azvog.R.inc(37396);MonthDay end3 = new MonthDay(3, 1);
        
        __CLR4_4_1ssrssrlc8azvog.R.inc(37397);assertEquals(0, Months.monthsBetween(start, end1).getMonths());
        __CLR4_4_1ssrssrlc8azvog.R.inc(37398);assertEquals(0, Months.monthsBetween(start, end2).getMonths());
        __CLR4_4_1ssrssrlc8azvog.R.inc(37399);assertEquals(1, Months.monthsBetween(start, end3).getMonths());
        
        __CLR4_4_1ssrssrlc8azvog.R.inc(37400);assertEquals(0, Months.monthsBetween(end1, start).getMonths());
        __CLR4_4_1ssrssrlc8azvog.R.inc(37401);assertEquals(0, Months.monthsBetween(end2, start).getMonths());
        __CLR4_4_1ssrssrlc8azvog.R.inc(37402);assertEquals(-1, Months.monthsBetween(end3, start).getMonths());
    }finally{__CLR4_4_1ssrssrlc8azvog.R.flushNeeded();}}

    //-------------------------------------------------------------------------
    public void testFactory_monthsIn_RInterval() {__CLR4_4_1ssrssrlc8azvog.R.globalSliceStart(getClass().getName(),37403);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1981vkusuz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ssrssrlc8azvog.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ssrssrlc8azvog.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonths.testFactory_monthsIn_RInterval",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37403,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1981vkusuz(){try{__CLR4_4_1ssrssrlc8azvog.R.inc(37403);
        __CLR4_4_1ssrssrlc8azvog.R.inc(37404);DateTime start = new DateTime(2006, 6, 9, 12, 0, 0, 0, PARIS);
        __CLR4_4_1ssrssrlc8azvog.R.inc(37405);DateTime end1 = new DateTime(2006, 9, 9, 12, 0, 0, 0, PARIS);
        __CLR4_4_1ssrssrlc8azvog.R.inc(37406);DateTime end2 = new DateTime(2006, 12, 9, 12, 0, 0, 0, PARIS);
        
        __CLR4_4_1ssrssrlc8azvog.R.inc(37407);assertEquals(0, Months.monthsIn((ReadableInterval) null).getMonths());
        __CLR4_4_1ssrssrlc8azvog.R.inc(37408);assertEquals(3, Months.monthsIn(new Interval(start, end1)).getMonths());
        __CLR4_4_1ssrssrlc8azvog.R.inc(37409);assertEquals(0, Months.monthsIn(new Interval(start, start)).getMonths());
        __CLR4_4_1ssrssrlc8azvog.R.inc(37410);assertEquals(0, Months.monthsIn(new Interval(end1, end1)).getMonths());
        __CLR4_4_1ssrssrlc8azvog.R.inc(37411);assertEquals(6, Months.monthsIn(new Interval(start, end2)).getMonths());
    }finally{__CLR4_4_1ssrssrlc8azvog.R.flushNeeded();}}

    public void testFactory_parseMonths_String() {__CLR4_4_1ssrssrlc8azvog.R.globalSliceStart(getClass().getName(),37412);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rcdnpksv8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ssrssrlc8azvog.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ssrssrlc8azvog.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonths.testFactory_parseMonths_String",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37412,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rcdnpksv8(){try{__CLR4_4_1ssrssrlc8azvog.R.inc(37412);
        __CLR4_4_1ssrssrlc8azvog.R.inc(37413);assertEquals(0, Months.parseMonths((String) null).getMonths());
        __CLR4_4_1ssrssrlc8azvog.R.inc(37414);assertEquals(0, Months.parseMonths("P0M").getMonths());
        __CLR4_4_1ssrssrlc8azvog.R.inc(37415);assertEquals(1, Months.parseMonths("P1M").getMonths());
        __CLR4_4_1ssrssrlc8azvog.R.inc(37416);assertEquals(-3, Months.parseMonths("P-3M").getMonths());
        __CLR4_4_1ssrssrlc8azvog.R.inc(37417);assertEquals(2, Months.parseMonths("P0Y2M").getMonths());
        __CLR4_4_1ssrssrlc8azvog.R.inc(37418);assertEquals(2, Months.parseMonths("P2MT0H0M").getMonths());
        __CLR4_4_1ssrssrlc8azvog.R.inc(37419);try {
            __CLR4_4_1ssrssrlc8azvog.R.inc(37420);Months.parseMonths("P1Y1D");
            __CLR4_4_1ssrssrlc8azvog.R.inc(37421);fail();
        } catch (IllegalArgumentException ex) {
            // expeceted
        }
        __CLR4_4_1ssrssrlc8azvog.R.inc(37422);try {
            __CLR4_4_1ssrssrlc8azvog.R.inc(37423);Months.parseMonths("P1MT1H");
            __CLR4_4_1ssrssrlc8azvog.R.inc(37424);fail();
        } catch (IllegalArgumentException ex) {
            // expeceted
        }
    }finally{__CLR4_4_1ssrssrlc8azvog.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testGetMethods() {__CLR4_4_1ssrssrlc8azvog.R.globalSliceStart(getClass().getName(),37425);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12sjdmzsvl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ssrssrlc8azvog.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ssrssrlc8azvog.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonths.testGetMethods",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37425,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12sjdmzsvl(){try{__CLR4_4_1ssrssrlc8azvog.R.inc(37425);
        __CLR4_4_1ssrssrlc8azvog.R.inc(37426);Months test = Months.months(20);
        __CLR4_4_1ssrssrlc8azvog.R.inc(37427);assertEquals(20, test.getMonths());
    }finally{__CLR4_4_1ssrssrlc8azvog.R.flushNeeded();}}

    public void testGetFieldType() {__CLR4_4_1ssrssrlc8azvog.R.globalSliceStart(getClass().getName(),37428);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18z86mvsvo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ssrssrlc8azvog.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ssrssrlc8azvog.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonths.testGetFieldType",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37428,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18z86mvsvo(){try{__CLR4_4_1ssrssrlc8azvog.R.inc(37428);
        __CLR4_4_1ssrssrlc8azvog.R.inc(37429);Months test = Months.months(20);
        __CLR4_4_1ssrssrlc8azvog.R.inc(37430);assertEquals(DurationFieldType.months(), test.getFieldType());
    }finally{__CLR4_4_1ssrssrlc8azvog.R.flushNeeded();}}

    public void testGetPeriodType() {__CLR4_4_1ssrssrlc8azvog.R.globalSliceStart(getClass().getName(),37431);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ivat1isvr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ssrssrlc8azvog.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ssrssrlc8azvog.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonths.testGetPeriodType",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37431,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ivat1isvr(){try{__CLR4_4_1ssrssrlc8azvog.R.inc(37431);
        __CLR4_4_1ssrssrlc8azvog.R.inc(37432);Months test = Months.months(20);
        __CLR4_4_1ssrssrlc8azvog.R.inc(37433);assertEquals(PeriodType.months(), test.getPeriodType());
    }finally{__CLR4_4_1ssrssrlc8azvog.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testIsGreaterThan() {__CLR4_4_1ssrssrlc8azvog.R.globalSliceStart(getClass().getName(),37434);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s5pnomsvu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ssrssrlc8azvog.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ssrssrlc8azvog.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonths.testIsGreaterThan",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37434,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s5pnomsvu(){try{__CLR4_4_1ssrssrlc8azvog.R.inc(37434);
        __CLR4_4_1ssrssrlc8azvog.R.inc(37435);assertEquals(true, Months.THREE.isGreaterThan(Months.TWO));
        __CLR4_4_1ssrssrlc8azvog.R.inc(37436);assertEquals(false, Months.THREE.isGreaterThan(Months.THREE));
        __CLR4_4_1ssrssrlc8azvog.R.inc(37437);assertEquals(false, Months.TWO.isGreaterThan(Months.THREE));
        __CLR4_4_1ssrssrlc8azvog.R.inc(37438);assertEquals(true, Months.ONE.isGreaterThan(null));
        __CLR4_4_1ssrssrlc8azvog.R.inc(37439);assertEquals(false, Months.months(-1).isGreaterThan(null));
    }finally{__CLR4_4_1ssrssrlc8azvog.R.flushNeeded();}}

    public void testIsLessThan() {__CLR4_4_1ssrssrlc8azvog.R.globalSliceStart(getClass().getName(),37440);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rmk0kdsw0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ssrssrlc8azvog.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ssrssrlc8azvog.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonths.testIsLessThan",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37440,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rmk0kdsw0(){try{__CLR4_4_1ssrssrlc8azvog.R.inc(37440);
        __CLR4_4_1ssrssrlc8azvog.R.inc(37441);assertEquals(false, Months.THREE.isLessThan(Months.TWO));
        __CLR4_4_1ssrssrlc8azvog.R.inc(37442);assertEquals(false, Months.THREE.isLessThan(Months.THREE));
        __CLR4_4_1ssrssrlc8azvog.R.inc(37443);assertEquals(true, Months.TWO.isLessThan(Months.THREE));
        __CLR4_4_1ssrssrlc8azvog.R.inc(37444);assertEquals(false, Months.ONE.isLessThan(null));
        __CLR4_4_1ssrssrlc8azvog.R.inc(37445);assertEquals(true, Months.months(-1).isLessThan(null));
    }finally{__CLR4_4_1ssrssrlc8azvog.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testToString() {__CLR4_4_1ssrssrlc8azvog.R.globalSliceStart(getClass().getName(),37446);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hrxdidsw6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ssrssrlc8azvog.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ssrssrlc8azvog.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonths.testToString",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37446,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hrxdidsw6(){try{__CLR4_4_1ssrssrlc8azvog.R.inc(37446);
        __CLR4_4_1ssrssrlc8azvog.R.inc(37447);Months test = Months.months(20);
        __CLR4_4_1ssrssrlc8azvog.R.inc(37448);assertEquals("P20M", test.toString());
        
        __CLR4_4_1ssrssrlc8azvog.R.inc(37449);test = Months.months(-20);
        __CLR4_4_1ssrssrlc8azvog.R.inc(37450);assertEquals("P-20M", test.toString());
    }finally{__CLR4_4_1ssrssrlc8azvog.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testSerialization() throws Exception {__CLR4_4_1ssrssrlc8azvog.R.globalSliceStart(getClass().getName(),37451);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16m1on9swb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ssrssrlc8azvog.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ssrssrlc8azvog.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonths.testSerialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37451,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16m1on9swb() throws Exception{try{__CLR4_4_1ssrssrlc8azvog.R.inc(37451);
        __CLR4_4_1ssrssrlc8azvog.R.inc(37452);Months test = Months.THREE;
        
        __CLR4_4_1ssrssrlc8azvog.R.inc(37453);ByteArrayOutputStream baos = new ByteArrayOutputStream();
        __CLR4_4_1ssrssrlc8azvog.R.inc(37454);ObjectOutputStream oos = new ObjectOutputStream(baos);
        __CLR4_4_1ssrssrlc8azvog.R.inc(37455);oos.writeObject(test);
        __CLR4_4_1ssrssrlc8azvog.R.inc(37456);byte[] bytes = baos.toByteArray();
        __CLR4_4_1ssrssrlc8azvog.R.inc(37457);oos.close();
        
        __CLR4_4_1ssrssrlc8azvog.R.inc(37458);ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        __CLR4_4_1ssrssrlc8azvog.R.inc(37459);ObjectInputStream ois = new ObjectInputStream(bais);
        __CLR4_4_1ssrssrlc8azvog.R.inc(37460);Months result = (Months) ois.readObject();
        __CLR4_4_1ssrssrlc8azvog.R.inc(37461);ois.close();
        
        __CLR4_4_1ssrssrlc8azvog.R.inc(37462);assertSame(test, result);
    }finally{__CLR4_4_1ssrssrlc8azvog.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testPlus_int() {__CLR4_4_1ssrssrlc8azvog.R.globalSliceStart(getClass().getName(),37463);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1scc4ebswn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ssrssrlc8azvog.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ssrssrlc8azvog.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonths.testPlus_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37463,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1scc4ebswn(){try{__CLR4_4_1ssrssrlc8azvog.R.inc(37463);
        __CLR4_4_1ssrssrlc8azvog.R.inc(37464);Months test2 = Months.months(2);
        __CLR4_4_1ssrssrlc8azvog.R.inc(37465);Months result = test2.plus(3);
        __CLR4_4_1ssrssrlc8azvog.R.inc(37466);assertEquals(2, test2.getMonths());
        __CLR4_4_1ssrssrlc8azvog.R.inc(37467);assertEquals(5, result.getMonths());
        
        __CLR4_4_1ssrssrlc8azvog.R.inc(37468);assertEquals(1, Months.ONE.plus(0).getMonths());
        
        __CLR4_4_1ssrssrlc8azvog.R.inc(37469);try {
            __CLR4_4_1ssrssrlc8azvog.R.inc(37470);Months.MAX_VALUE.plus(1);
            __CLR4_4_1ssrssrlc8azvog.R.inc(37471);fail();
        } catch (ArithmeticException ex) {
            // expected
        }
    }finally{__CLR4_4_1ssrssrlc8azvog.R.flushNeeded();}}

    public void testPlus_Months() {__CLR4_4_1ssrssrlc8azvog.R.globalSliceStart(getClass().getName(),37472);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1zcwq25sww();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ssrssrlc8azvog.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ssrssrlc8azvog.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonths.testPlus_Months",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37472,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1zcwq25sww(){try{__CLR4_4_1ssrssrlc8azvog.R.inc(37472);
        __CLR4_4_1ssrssrlc8azvog.R.inc(37473);Months test2 = Months.months(2);
        __CLR4_4_1ssrssrlc8azvog.R.inc(37474);Months test3 = Months.months(3);
        __CLR4_4_1ssrssrlc8azvog.R.inc(37475);Months result = test2.plus(test3);
        __CLR4_4_1ssrssrlc8azvog.R.inc(37476);assertEquals(2, test2.getMonths());
        __CLR4_4_1ssrssrlc8azvog.R.inc(37477);assertEquals(3, test3.getMonths());
        __CLR4_4_1ssrssrlc8azvog.R.inc(37478);assertEquals(5, result.getMonths());
        
        __CLR4_4_1ssrssrlc8azvog.R.inc(37479);assertEquals(1, Months.ONE.plus(Months.ZERO).getMonths());
        __CLR4_4_1ssrssrlc8azvog.R.inc(37480);assertEquals(1, Months.ONE.plus((Months) null).getMonths());
        
        __CLR4_4_1ssrssrlc8azvog.R.inc(37481);try {
            __CLR4_4_1ssrssrlc8azvog.R.inc(37482);Months.MAX_VALUE.plus(Months.ONE);
            __CLR4_4_1ssrssrlc8azvog.R.inc(37483);fail();
        } catch (ArithmeticException ex) {
            // expected
        }
    }finally{__CLR4_4_1ssrssrlc8azvog.R.flushNeeded();}}

    public void testMinus_int() {__CLR4_4_1ssrssrlc8azvog.R.globalSliceStart(getClass().getName(),37484);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_118wkvpsx8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ssrssrlc8azvog.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ssrssrlc8azvog.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonths.testMinus_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37484,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_118wkvpsx8(){try{__CLR4_4_1ssrssrlc8azvog.R.inc(37484);
        __CLR4_4_1ssrssrlc8azvog.R.inc(37485);Months test2 = Months.months(2);
        __CLR4_4_1ssrssrlc8azvog.R.inc(37486);Months result = test2.minus(3);
        __CLR4_4_1ssrssrlc8azvog.R.inc(37487);assertEquals(2, test2.getMonths());
        __CLR4_4_1ssrssrlc8azvog.R.inc(37488);assertEquals(-1, result.getMonths());
        
        __CLR4_4_1ssrssrlc8azvog.R.inc(37489);assertEquals(1, Months.ONE.minus(0).getMonths());
        
        __CLR4_4_1ssrssrlc8azvog.R.inc(37490);try {
            __CLR4_4_1ssrssrlc8azvog.R.inc(37491);Months.MIN_VALUE.minus(1);
            __CLR4_4_1ssrssrlc8azvog.R.inc(37492);fail();
        } catch (ArithmeticException ex) {
            // expected
        }
    }finally{__CLR4_4_1ssrssrlc8azvog.R.flushNeeded();}}

    public void testMinus_Months() {__CLR4_4_1ssrssrlc8azvog.R.globalSliceStart(getClass().getName(),37493);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xqcf97sxh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ssrssrlc8azvog.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ssrssrlc8azvog.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonths.testMinus_Months",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37493,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xqcf97sxh(){try{__CLR4_4_1ssrssrlc8azvog.R.inc(37493);
        __CLR4_4_1ssrssrlc8azvog.R.inc(37494);Months test2 = Months.months(2);
        __CLR4_4_1ssrssrlc8azvog.R.inc(37495);Months test3 = Months.months(3);
        __CLR4_4_1ssrssrlc8azvog.R.inc(37496);Months result = test2.minus(test3);
        __CLR4_4_1ssrssrlc8azvog.R.inc(37497);assertEquals(2, test2.getMonths());
        __CLR4_4_1ssrssrlc8azvog.R.inc(37498);assertEquals(3, test3.getMonths());
        __CLR4_4_1ssrssrlc8azvog.R.inc(37499);assertEquals(-1, result.getMonths());
        
        __CLR4_4_1ssrssrlc8azvog.R.inc(37500);assertEquals(1, Months.ONE.minus(Months.ZERO).getMonths());
        __CLR4_4_1ssrssrlc8azvog.R.inc(37501);assertEquals(1, Months.ONE.minus((Months) null).getMonths());
        
        __CLR4_4_1ssrssrlc8azvog.R.inc(37502);try {
            __CLR4_4_1ssrssrlc8azvog.R.inc(37503);Months.MIN_VALUE.minus(Months.ONE);
            __CLR4_4_1ssrssrlc8azvog.R.inc(37504);fail();
        } catch (ArithmeticException ex) {
            // expected
        }
    }finally{__CLR4_4_1ssrssrlc8azvog.R.flushNeeded();}}

    public void testMultipliedBy_int() {__CLR4_4_1ssrssrlc8azvog.R.globalSliceStart(getClass().getName(),37505);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1szpsdpsxt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ssrssrlc8azvog.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ssrssrlc8azvog.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonths.testMultipliedBy_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37505,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1szpsdpsxt(){try{__CLR4_4_1ssrssrlc8azvog.R.inc(37505);
        __CLR4_4_1ssrssrlc8azvog.R.inc(37506);Months test = Months.months(2);
        __CLR4_4_1ssrssrlc8azvog.R.inc(37507);assertEquals(6, test.multipliedBy(3).getMonths());
        __CLR4_4_1ssrssrlc8azvog.R.inc(37508);assertEquals(2, test.getMonths());
        __CLR4_4_1ssrssrlc8azvog.R.inc(37509);assertEquals(-6, test.multipliedBy(-3).getMonths());
        __CLR4_4_1ssrssrlc8azvog.R.inc(37510);assertSame(test, test.multipliedBy(1));
        
        __CLR4_4_1ssrssrlc8azvog.R.inc(37511);Months halfMax = Months.months(Integer.MAX_VALUE / 2 + 1);
        __CLR4_4_1ssrssrlc8azvog.R.inc(37512);try {
            __CLR4_4_1ssrssrlc8azvog.R.inc(37513);halfMax.multipliedBy(2);
            __CLR4_4_1ssrssrlc8azvog.R.inc(37514);fail();
        } catch (ArithmeticException ex) {
            // expected
        }
    }finally{__CLR4_4_1ssrssrlc8azvog.R.flushNeeded();}}

    public void testDividedBy_int() {__CLR4_4_1ssrssrlc8azvog.R.globalSliceStart(getClass().getName(),37515);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q9i8qvsy3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ssrssrlc8azvog.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ssrssrlc8azvog.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonths.testDividedBy_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37515,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q9i8qvsy3(){try{__CLR4_4_1ssrssrlc8azvog.R.inc(37515);
        __CLR4_4_1ssrssrlc8azvog.R.inc(37516);Months test = Months.months(12);
        __CLR4_4_1ssrssrlc8azvog.R.inc(37517);assertEquals(6, test.dividedBy(2).getMonths());
        __CLR4_4_1ssrssrlc8azvog.R.inc(37518);assertEquals(12, test.getMonths());
        __CLR4_4_1ssrssrlc8azvog.R.inc(37519);assertEquals(4, test.dividedBy(3).getMonths());
        __CLR4_4_1ssrssrlc8azvog.R.inc(37520);assertEquals(3, test.dividedBy(4).getMonths());
        __CLR4_4_1ssrssrlc8azvog.R.inc(37521);assertEquals(2, test.dividedBy(5).getMonths());
        __CLR4_4_1ssrssrlc8azvog.R.inc(37522);assertEquals(2, test.dividedBy(6).getMonths());
        __CLR4_4_1ssrssrlc8azvog.R.inc(37523);assertSame(test, test.dividedBy(1));
        
        __CLR4_4_1ssrssrlc8azvog.R.inc(37524);try {
            __CLR4_4_1ssrssrlc8azvog.R.inc(37525);Months.ONE.dividedBy(0);
            __CLR4_4_1ssrssrlc8azvog.R.inc(37526);fail();
        } catch (ArithmeticException ex) {
            // expected
        }
    }finally{__CLR4_4_1ssrssrlc8azvog.R.flushNeeded();}}

    public void testNegated() {__CLR4_4_1ssrssrlc8azvog.R.globalSliceStart(getClass().getName(),37527);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1av3307syf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ssrssrlc8azvog.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ssrssrlc8azvog.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonths.testNegated",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37527,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1av3307syf(){try{__CLR4_4_1ssrssrlc8azvog.R.inc(37527);
        __CLR4_4_1ssrssrlc8azvog.R.inc(37528);Months test = Months.months(12);
        __CLR4_4_1ssrssrlc8azvog.R.inc(37529);assertEquals(-12, test.negated().getMonths());
        __CLR4_4_1ssrssrlc8azvog.R.inc(37530);assertEquals(12, test.getMonths());
        
        __CLR4_4_1ssrssrlc8azvog.R.inc(37531);try {
            __CLR4_4_1ssrssrlc8azvog.R.inc(37532);Months.MIN_VALUE.negated();
            __CLR4_4_1ssrssrlc8azvog.R.inc(37533);fail();
        } catch (ArithmeticException ex) {
            // expected
        }
    }finally{__CLR4_4_1ssrssrlc8azvog.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testAddToLocalDate() {__CLR4_4_1ssrssrlc8azvog.R.globalSliceStart(getClass().getName(),37534);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1thm5yusym();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ssrssrlc8azvog.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ssrssrlc8azvog.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonths.testAddToLocalDate",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37534,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1thm5yusym(){try{__CLR4_4_1ssrssrlc8azvog.R.inc(37534);
        __CLR4_4_1ssrssrlc8azvog.R.inc(37535);Months test = Months.months(3);
        __CLR4_4_1ssrssrlc8azvog.R.inc(37536);LocalDate date = new LocalDate(2006, 6, 1);
        __CLR4_4_1ssrssrlc8azvog.R.inc(37537);LocalDate expected = new LocalDate(2006, 9, 1);
        __CLR4_4_1ssrssrlc8azvog.R.inc(37538);assertEquals(expected, date.plus(test));
    }finally{__CLR4_4_1ssrssrlc8azvog.R.flushNeeded();}}

}
