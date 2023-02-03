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

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDate;

/**
 * Test.
 */
public class TestGJDate extends TestCase {static class __CLR4_4_113rm13rmlc8azwo2{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672271031490L,8589935092L,51599,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public static void main(String[] args) {try{__CLR4_4_113rm13rmlc8azwo2.R.inc(51538);
        __CLR4_4_113rm13rmlc8azwo2.R.inc(51539);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_113rm13rmlc8azwo2.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_113rm13rmlc8azwo2.R.inc(51540);
        __CLR4_4_113rm13rmlc8azwo2.R.inc(51541);return new TestSuite(TestGJDate.class);
    }finally{__CLR4_4_113rm13rmlc8azwo2.R.flushNeeded();}}

    public TestGJDate(String name) {
        super(name);__CLR4_4_113rm13rmlc8azwo2.R.inc(51543);try{__CLR4_4_113rm13rmlc8azwo2.R.inc(51542);
    }finally{__CLR4_4_113rm13rmlc8azwo2.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_113rm13rmlc8azwo2.R.inc(51544);
    }finally{__CLR4_4_113rm13rmlc8azwo2.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_113rm13rmlc8azwo2.R.inc(51545);
    }finally{__CLR4_4_113rm13rmlc8azwo2.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    private static final Chronology GJ_CHRONOLOGY = GJChronology.getInstanceUTC();

    //-----------------------------------------------------------------------
    public void test_plusYears_positiveToPositive() {__CLR4_4_113rm13rmlc8azwo2.R.globalSliceStart(getClass().getName(),51546);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kdqyl813ru();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_113rm13rmlc8azwo2.R.rethrow($CLV_t2$);}finally{__CLR4_4_113rm13rmlc8azwo2.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestGJDate.test_plusYears_positiveToPositive",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),51546,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kdqyl813ru(){try{__CLR4_4_113rm13rmlc8azwo2.R.inc(51546);
        __CLR4_4_113rm13rmlc8azwo2.R.inc(51547);LocalDate date = new LocalDate(3, 6, 30, GJ_CHRONOLOGY);
        __CLR4_4_113rm13rmlc8azwo2.R.inc(51548);LocalDate expected = new LocalDate(7, 6, 30, GJ_CHRONOLOGY);
        __CLR4_4_113rm13rmlc8azwo2.R.inc(51549);assertEquals(expected, date.plusYears(4));
    }finally{__CLR4_4_113rm13rmlc8azwo2.R.flushNeeded();}}

    public void test_plusYears_positiveToZero() {__CLR4_4_113rm13rmlc8azwo2.R.globalSliceStart(getClass().getName(),51550);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1na1vpp13ry();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_113rm13rmlc8azwo2.R.rethrow($CLV_t2$);}finally{__CLR4_4_113rm13rmlc8azwo2.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestGJDate.test_plusYears_positiveToZero",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),51550,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1na1vpp13ry(){try{__CLR4_4_113rm13rmlc8azwo2.R.inc(51550);
        __CLR4_4_113rm13rmlc8azwo2.R.inc(51551);LocalDate date = new LocalDate(3, 6, 30, GJ_CHRONOLOGY);
        __CLR4_4_113rm13rmlc8azwo2.R.inc(51552);LocalDate expected = new LocalDate(-1, 6, 30, GJ_CHRONOLOGY);
        __CLR4_4_113rm13rmlc8azwo2.R.inc(51553);assertEquals(expected, date.plusYears(-3));
    }finally{__CLR4_4_113rm13rmlc8azwo2.R.flushNeeded();}}

    public void test_plusYears_positiveToNegative() {__CLR4_4_113rm13rmlc8azwo2.R.globalSliceStart(getClass().getName(),51554);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1u6ls8013s2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_113rm13rmlc8azwo2.R.rethrow($CLV_t2$);}finally{__CLR4_4_113rm13rmlc8azwo2.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestGJDate.test_plusYears_positiveToNegative",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),51554,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1u6ls8013s2(){try{__CLR4_4_113rm13rmlc8azwo2.R.inc(51554);
        __CLR4_4_113rm13rmlc8azwo2.R.inc(51555);LocalDate date = new LocalDate(3, 6, 30, GJ_CHRONOLOGY);
        __CLR4_4_113rm13rmlc8azwo2.R.inc(51556);LocalDate expected = new LocalDate(-2, 6, 30, GJ_CHRONOLOGY);
        __CLR4_4_113rm13rmlc8azwo2.R.inc(51557);assertEquals(expected, date.plusYears(-4));
    }finally{__CLR4_4_113rm13rmlc8azwo2.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void test_plusYears_negativeToNegative() {__CLR4_4_113rm13rmlc8azwo2.R.globalSliceStart(getClass().getName(),51558);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1164yxo13s6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_113rm13rmlc8azwo2.R.rethrow($CLV_t2$);}finally{__CLR4_4_113rm13rmlc8azwo2.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestGJDate.test_plusYears_negativeToNegative",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),51558,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1164yxo13s6(){try{__CLR4_4_113rm13rmlc8azwo2.R.inc(51558);
        __CLR4_4_113rm13rmlc8azwo2.R.inc(51559);LocalDate date = new LocalDate(-3, 6, 30, GJ_CHRONOLOGY);
        __CLR4_4_113rm13rmlc8azwo2.R.inc(51560);LocalDate expected = new LocalDate(-1, 6, 30, GJ_CHRONOLOGY);
        __CLR4_4_113rm13rmlc8azwo2.R.inc(51561);assertEquals(expected, date.plusYears(2));
    }finally{__CLR4_4_113rm13rmlc8azwo2.R.flushNeeded();}}

    public void test_plusYears_negativeToZero() {__CLR4_4_113rm13rmlc8azwo2.R.globalSliceStart(getClass().getName(),51562);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nuf2lr13sa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_113rm13rmlc8azwo2.R.rethrow($CLV_t2$);}finally{__CLR4_4_113rm13rmlc8azwo2.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestGJDate.test_plusYears_negativeToZero",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),51562,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nuf2lr13sa(){try{__CLR4_4_113rm13rmlc8azwo2.R.inc(51562);
        __CLR4_4_113rm13rmlc8azwo2.R.inc(51563);LocalDate date = new LocalDate(-3, 6, 30, GJ_CHRONOLOGY);
        __CLR4_4_113rm13rmlc8azwo2.R.inc(51564);LocalDate expected = new LocalDate(1, 6, 30, GJ_CHRONOLOGY);
        __CLR4_4_113rm13rmlc8azwo2.R.inc(51565);assertEquals(expected, date.plusYears(3));
    }finally{__CLR4_4_113rm13rmlc8azwo2.R.flushNeeded();}}

    public void test_plusYears_negativeToPositive() {__CLR4_4_113rm13rmlc8azwo2.R.globalSliceStart(getClass().getName(),51566);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lmwa3k13se();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_113rm13rmlc8azwo2.R.rethrow($CLV_t2$);}finally{__CLR4_4_113rm13rmlc8azwo2.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestGJDate.test_plusYears_negativeToPositive",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),51566,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lmwa3k13se(){try{__CLR4_4_113rm13rmlc8azwo2.R.inc(51566);
        __CLR4_4_113rm13rmlc8azwo2.R.inc(51567);LocalDate date = new LocalDate(-3, 6, 30, GJ_CHRONOLOGY);
        __CLR4_4_113rm13rmlc8azwo2.R.inc(51568);LocalDate expected = new LocalDate(2, 6, 30, GJ_CHRONOLOGY);
        __CLR4_4_113rm13rmlc8azwo2.R.inc(51569);assertEquals(expected, date.plusYears(4));
    }finally{__CLR4_4_113rm13rmlc8azwo2.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void test_plusYears_positiveToPositive_crossCutover() {__CLR4_4_113rm13rmlc8azwo2.R.globalSliceStart(getClass().getName(),51570);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1au07up13si();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_113rm13rmlc8azwo2.R.rethrow($CLV_t2$);}finally{__CLR4_4_113rm13rmlc8azwo2.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestGJDate.test_plusYears_positiveToPositive_crossCutover",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),51570,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1au07up13si(){try{__CLR4_4_113rm13rmlc8azwo2.R.inc(51570);
        __CLR4_4_113rm13rmlc8azwo2.R.inc(51571);LocalDate date = new LocalDate(3, 6, 30, GJ_CHRONOLOGY);
        __CLR4_4_113rm13rmlc8azwo2.R.inc(51572);LocalDate expected = new LocalDate(2007, 6, 30, GJ_CHRONOLOGY);
        __CLR4_4_113rm13rmlc8azwo2.R.inc(51573);assertEquals(expected, date.plusYears(2004));
    }finally{__CLR4_4_113rm13rmlc8azwo2.R.flushNeeded();}}

    public void test_plusYears_positiveToZero_crossCutover() {__CLR4_4_113rm13rmlc8azwo2.R.globalSliceStart(getClass().getName(),51574);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vlstv413sm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_113rm13rmlc8azwo2.R.rethrow($CLV_t2$);}finally{__CLR4_4_113rm13rmlc8azwo2.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestGJDate.test_plusYears_positiveToZero_crossCutover",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),51574,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vlstv413sm(){try{__CLR4_4_113rm13rmlc8azwo2.R.inc(51574);
        __CLR4_4_113rm13rmlc8azwo2.R.inc(51575);LocalDate date = new LocalDate(2003, 6, 30, GJ_CHRONOLOGY);
        __CLR4_4_113rm13rmlc8azwo2.R.inc(51576);LocalDate expected = new LocalDate(-1, 6, 30, GJ_CHRONOLOGY);
        __CLR4_4_113rm13rmlc8azwo2.R.inc(51577);assertEquals(expected, date.plusYears(-2003));
    }finally{__CLR4_4_113rm13rmlc8azwo2.R.flushNeeded();}}

    public void test_plusYears_positiveToNegative_crossCutover() {__CLR4_4_113rm13rmlc8azwo2.R.globalSliceStart(getClass().getName(),51578);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1w94ef113sq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_113rm13rmlc8azwo2.R.rethrow($CLV_t2$);}finally{__CLR4_4_113rm13rmlc8azwo2.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestGJDate.test_plusYears_positiveToNegative_crossCutover",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),51578,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1w94ef113sq(){try{__CLR4_4_113rm13rmlc8azwo2.R.inc(51578);
        __CLR4_4_113rm13rmlc8azwo2.R.inc(51579);LocalDate date = new LocalDate(2003, 6, 30, GJ_CHRONOLOGY);
        __CLR4_4_113rm13rmlc8azwo2.R.inc(51580);LocalDate expected = new LocalDate(-2, 6, 30, GJ_CHRONOLOGY);
        __CLR4_4_113rm13rmlc8azwo2.R.inc(51581);assertEquals(expected, date.plusYears(-2004));
    }finally{__CLR4_4_113rm13rmlc8azwo2.R.flushNeeded();}}

    public void test_plusYears_negativeToPositive_crossCutover() {__CLR4_4_113rm13rmlc8azwo2.R.globalSliceStart(getClass().getName(),51582);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vja0hp13su();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_113rm13rmlc8azwo2.R.rethrow($CLV_t2$);}finally{__CLR4_4_113rm13rmlc8azwo2.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestGJDate.test_plusYears_negativeToPositive_crossCutover",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),51582,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vja0hp13su(){try{__CLR4_4_113rm13rmlc8azwo2.R.inc(51582);
        __CLR4_4_113rm13rmlc8azwo2.R.inc(51583);LocalDate date = new LocalDate(-3, 6, 30, GJ_CHRONOLOGY);
        __CLR4_4_113rm13rmlc8azwo2.R.inc(51584);LocalDate expected = new LocalDate(2002, 6, 30, GJ_CHRONOLOGY);
        __CLR4_4_113rm13rmlc8azwo2.R.inc(51585);assertEquals(expected, date.plusYears(2004));
    }finally{__CLR4_4_113rm13rmlc8azwo2.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void test_plusWeekyears_positiveToZero_crossCutover() {__CLR4_4_113rm13rmlc8azwo2.R.globalSliceStart(getClass().getName(),51586);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1d8e4kk13sy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_113rm13rmlc8azwo2.R.rethrow($CLV_t2$);}finally{__CLR4_4_113rm13rmlc8azwo2.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestGJDate.test_plusWeekyears_positiveToZero_crossCutover",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),51586,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1d8e4kk13sy(){try{__CLR4_4_113rm13rmlc8azwo2.R.inc(51586);
        __CLR4_4_113rm13rmlc8azwo2.R.inc(51587);LocalDate date = new LocalDate(2003, 6, 30, GJ_CHRONOLOGY);
        __CLR4_4_113rm13rmlc8azwo2.R.inc(51588);LocalDate expected = new LocalDate(-1, 6, 30, GJ_CHRONOLOGY).withWeekOfWeekyear(date.getWeekOfWeekyear()).withDayOfWeek(date.getDayOfWeek());
        __CLR4_4_113rm13rmlc8azwo2.R.inc(51589);assertEquals(expected, date.weekyear().addToCopy(-2003));
    }finally{__CLR4_4_113rm13rmlc8azwo2.R.flushNeeded();}}

    public void test_plusWeekyears_positiveToNegative_crossCutover() {__CLR4_4_113rm13rmlc8azwo2.R.globalSliceStart(getClass().getName(),51590);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lpam4v13t2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_113rm13rmlc8azwo2.R.rethrow($CLV_t2$);}finally{__CLR4_4_113rm13rmlc8azwo2.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestGJDate.test_plusWeekyears_positiveToNegative_crossCutover",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),51590,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lpam4v13t2(){try{__CLR4_4_113rm13rmlc8azwo2.R.inc(51590);
        __CLR4_4_113rm13rmlc8azwo2.R.inc(51591);LocalDate date = new LocalDate(2003, 6, 30, GJ_CHRONOLOGY);
        __CLR4_4_113rm13rmlc8azwo2.R.inc(51592);LocalDate expected = new LocalDate(-2, 6, 30, GJ_CHRONOLOGY).withWeekOfWeekyear(date.getWeekOfWeekyear()).withDayOfWeek(date.getDayOfWeek());
        __CLR4_4_113rm13rmlc8azwo2.R.inc(51593);assertEquals(expected, date.weekyear().addToCopy(-2004));
    }finally{__CLR4_4_113rm13rmlc8azwo2.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void test_cutoverPreZero() {__CLR4_4_113rm13rmlc8azwo2.R.globalSliceStart(getClass().getName(),51594);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17lwd6f13t6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_113rm13rmlc8azwo2.R.rethrow($CLV_t2$);}finally{__CLR4_4_113rm13rmlc8azwo2.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestGJDate.test_cutoverPreZero",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),51594,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17lwd6f13t6(){try{__CLR4_4_113rm13rmlc8azwo2.R.inc(51594);
        __CLR4_4_113rm13rmlc8azwo2.R.inc(51595);DateTime cutover = new LocalDate(-2, 6, 30, ISOChronology.getInstanceUTC()).toDateTimeAtStartOfDay(DateTimeZone.UTC);
        __CLR4_4_113rm13rmlc8azwo2.R.inc(51596);try {
            __CLR4_4_113rm13rmlc8azwo2.R.inc(51597);GJChronology.getInstance(DateTimeZone.UTC, cutover);
            __CLR4_4_113rm13rmlc8azwo2.R.inc(51598);fail();
        } catch (IllegalArgumentException ex) {
            // expected
        }
    }finally{__CLR4_4_113rm13rmlc8azwo2.R.flushNeeded();}}

}
