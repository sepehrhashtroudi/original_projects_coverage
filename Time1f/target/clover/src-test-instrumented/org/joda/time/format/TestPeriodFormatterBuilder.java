/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 *  Copyright 2001-2006 Stephen Colebourne
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
package org.joda.time.format;

import java.util.Locale;
import java.util.TimeZone;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.DateTimeConstants;
import org.joda.time.DateTimeUtils;
import org.joda.time.DateTimeZone;
import org.joda.time.Period;
import org.joda.time.PeriodType;

/**
 * This class is a Junit unit test for PeriodFormatterBuilder.
 *
 * @author Stephen Colebourne
 */
public class TestPeriodFormatterBuilder extends TestCase {static class __CLR4_4_11bnj1bnjlc8azxpl{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672271031490L,8589935092L,62287,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    
    private static final Period PERIOD = new Period(1, 2, 3, 4, 5, 6, 7, 8);
    private static final Period EMPTY_PERIOD = new Period(0, 0, 0, 0, 0, 0, 0, 0);
    private static final Period YEAR_DAY_PERIOD = new Period(1, 0, 0, 4, 5, 6, 7, 8, PeriodType.yearDayTime());
    private static final Period EMPTY_YEAR_DAY_PERIOD = new Period(0, 0, 0, 0, 0, 0, 0, 0, PeriodType.yearDayTime());
    private static final Period TIME_PERIOD = new Period(0, 0, 0, 0, 5, 6, 7, 8);
    private static final Period DATE_PERIOD = new Period(1, 2, 3, 4, 0, 0, 0, 0);

    //private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    //private static final DateTimeZone TOKYO = DateTimeZone.forID("Asia/Tokyo");

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
    
    private PeriodFormatterBuilder builder;

    public static void main(String[] args) {try{__CLR4_4_11bnj1bnjlc8azxpl.R.inc(61759);
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(61760);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_11bnj1bnjlc8azxpl.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_11bnj1bnjlc8azxpl.R.inc(61761);
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(61762);return new TestSuite(TestPeriodFormatterBuilder.class);
    }finally{__CLR4_4_11bnj1bnjlc8azxpl.R.flushNeeded();}}

    public TestPeriodFormatterBuilder(String name) {
        super(name);__CLR4_4_11bnj1bnjlc8azxpl.R.inc(61764);try{__CLR4_4_11bnj1bnjlc8azxpl.R.inc(61763);
    }finally{__CLR4_4_11bnj1bnjlc8azxpl.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_11bnj1bnjlc8azxpl.R.inc(61765);
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(61766);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(61767);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(61768);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(61769);originalLocale = Locale.getDefault();
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(61770);DateTimeZone.setDefault(LONDON);
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(61771);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(61772);Locale.setDefault(Locale.UK);
        
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(61773);builder = new PeriodFormatterBuilder();
    }finally{__CLR4_4_11bnj1bnjlc8azxpl.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_11bnj1bnjlc8azxpl.R.inc(61774);
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(61775);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(61776);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(61777);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(61778);Locale.setDefault(originalLocale);
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(61779);originalDateTimeZone = null;
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(61780);originalTimeZone = null;
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(61781);originalLocale = null;
    }finally{__CLR4_4_11bnj1bnjlc8azxpl.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testToFormatterPrinterParser() {__CLR4_4_11bnj1bnjlc8azxpl.R.globalSliceStart(getClass().getName(),61782);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16mxk3n1bo6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11bnj1bnjlc8azxpl.R.rethrow($CLV_t2$);}finally{__CLR4_4_11bnj1bnjlc8azxpl.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testToFormatterPrinterParser",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),61782,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16mxk3n1bo6(){try{__CLR4_4_11bnj1bnjlc8azxpl.R.inc(61782);
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(61783);builder.appendYears();
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(61784);assertNotNull(builder.toFormatter());
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(61785);assertNotNull(builder.toPrinter());
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(61786);assertNotNull(builder.toParser());
    }finally{__CLR4_4_11bnj1bnjlc8azxpl.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testFormatYears() {__CLR4_4_11bnj1bnjlc8azxpl.R.globalSliceStart(getClass().getName(),61787);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ugs2xg1bob();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11bnj1bnjlc8azxpl.R.rethrow($CLV_t2$);}finally{__CLR4_4_11bnj1bnjlc8azxpl.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatYears",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),61787,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ugs2xg1bob(){try{__CLR4_4_11bnj1bnjlc8azxpl.R.inc(61787);
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(61788);PeriodFormatter f = builder.appendYears().toFormatter();
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(61789);assertEquals("1", f.print(PERIOD));
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(61790);assertEquals(1, f.getPrinter().calculatePrintedLength(PERIOD, null));
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(61791);assertEquals(1, f.getPrinter().countFieldsToPrint(PERIOD, Integer.MAX_VALUE, null));
        
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(61792);Period p = new Period(0, 0, 0, 0, 0, 0, 0, 0);
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(61793);assertEquals("0", f.print(p));
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(61794);assertEquals(1, f.getPrinter().calculatePrintedLength(p, null));
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(61795);assertEquals(1, f.getPrinter().countFieldsToPrint(p, Integer.MAX_VALUE, null));
    }finally{__CLR4_4_11bnj1bnjlc8azxpl.R.flushNeeded();}}

    public void testFormatMonths() {__CLR4_4_11bnj1bnjlc8azxpl.R.globalSliceStart(getClass().getName(),61796);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ymy7nn1bok();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11bnj1bnjlc8azxpl.R.rethrow($CLV_t2$);}finally{__CLR4_4_11bnj1bnjlc8azxpl.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatMonths",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),61796,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ymy7nn1bok(){try{__CLR4_4_11bnj1bnjlc8azxpl.R.inc(61796);
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(61797);PeriodFormatter f = builder.appendMonths().toFormatter();
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(61798);assertEquals("2", f.print(PERIOD));
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(61799);assertEquals(1, f.getPrinter().calculatePrintedLength(PERIOD, null));
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(61800);assertEquals(1, f.getPrinter().countFieldsToPrint(PERIOD, Integer.MAX_VALUE, null));
        
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(61801);Period p = new Period(0, 0, 0, 0, 0, 0, 0, 0);
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(61802);assertEquals("0", f.print(p));
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(61803);assertEquals(1, f.getPrinter().calculatePrintedLength(p, null));
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(61804);assertEquals(1, f.getPrinter().countFieldsToPrint(p, Integer.MAX_VALUE, null));
    }finally{__CLR4_4_11bnj1bnjlc8azxpl.R.flushNeeded();}}

    public void testFormatWeeks() {__CLR4_4_11bnj1bnjlc8azxpl.R.globalSliceStart(getClass().getName(),61805);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a9pejh1bot();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11bnj1bnjlc8azxpl.R.rethrow($CLV_t2$);}finally{__CLR4_4_11bnj1bnjlc8azxpl.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatWeeks",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),61805,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a9pejh1bot(){try{__CLR4_4_11bnj1bnjlc8azxpl.R.inc(61805);
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(61806);PeriodFormatter f = builder.appendWeeks().toFormatter();
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(61807);assertEquals("3", f.print(PERIOD));
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(61808);assertEquals(1, f.getPrinter().calculatePrintedLength(PERIOD, null));
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(61809);assertEquals(1, f.getPrinter().countFieldsToPrint(PERIOD, Integer.MAX_VALUE, null));
        
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(61810);Period p = new Period(0, 0, 0, 0, 0, 0, 0, 0);
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(61811);assertEquals("0", f.print(p));
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(61812);assertEquals(1, f.getPrinter().calculatePrintedLength(p, null));
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(61813);assertEquals(1, f.getPrinter().countFieldsToPrint(p, Integer.MAX_VALUE, null));
    }finally{__CLR4_4_11bnj1bnjlc8azxpl.R.flushNeeded();}}

    public void testFormatDays() {__CLR4_4_11bnj1bnjlc8azxpl.R.globalSliceStart(getClass().getName(),61814);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nd0dqx1bp2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11bnj1bnjlc8azxpl.R.rethrow($CLV_t2$);}finally{__CLR4_4_11bnj1bnjlc8azxpl.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatDays",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),61814,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nd0dqx1bp2(){try{__CLR4_4_11bnj1bnjlc8azxpl.R.inc(61814);
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(61815);PeriodFormatter f = builder.appendDays().toFormatter();
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(61816);assertEquals("4", f.print(PERIOD));
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(61817);assertEquals(1, f.getPrinter().calculatePrintedLength(PERIOD, null));
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(61818);assertEquals(1, f.getPrinter().countFieldsToPrint(PERIOD, Integer.MAX_VALUE, null));
        
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(61819);Period p = new Period(0, 0, 0, 0, 0, 0, 0, 0);
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(61820);assertEquals("0", f.print(p));
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(61821);assertEquals(1, f.getPrinter().calculatePrintedLength(p, null));
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(61822);assertEquals(1, f.getPrinter().countFieldsToPrint(p, Integer.MAX_VALUE, null));
    }finally{__CLR4_4_11bnj1bnjlc8azxpl.R.flushNeeded();}}

    public void testFormatHours() {__CLR4_4_11bnj1bnjlc8azxpl.R.globalSliceStart(getClass().getName(),61823);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yt94b71bpb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11bnj1bnjlc8azxpl.R.rethrow($CLV_t2$);}finally{__CLR4_4_11bnj1bnjlc8azxpl.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatHours",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),61823,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yt94b71bpb(){try{__CLR4_4_11bnj1bnjlc8azxpl.R.inc(61823);
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(61824);PeriodFormatter f = builder.appendHours().toFormatter();
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(61825);assertEquals("5", f.print(PERIOD));
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(61826);assertEquals(1, f.getPrinter().calculatePrintedLength(PERIOD, null));
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(61827);assertEquals(1, f.getPrinter().countFieldsToPrint(PERIOD, Integer.MAX_VALUE, null));
        
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(61828);Period p = new Period(0, 0, 0, 0, 0, 0, 0, 0);
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(61829);assertEquals("0", f.print(p));
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(61830);assertEquals(1, f.getPrinter().calculatePrintedLength(p, null));
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(61831);assertEquals(1, f.getPrinter().countFieldsToPrint(p, Integer.MAX_VALUE, null));
    }finally{__CLR4_4_11bnj1bnjlc8azxpl.R.flushNeeded();}}

    public void testFormatMinutes() {__CLR4_4_11bnj1bnjlc8azxpl.R.globalSliceStart(getClass().getName(),61832);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ow22gz1bpk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11bnj1bnjlc8azxpl.R.rethrow($CLV_t2$);}finally{__CLR4_4_11bnj1bnjlc8azxpl.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatMinutes",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),61832,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ow22gz1bpk(){try{__CLR4_4_11bnj1bnjlc8azxpl.R.inc(61832);
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(61833);PeriodFormatter f = builder.appendMinutes().toFormatter();
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(61834);assertEquals("6", f.print(PERIOD));
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(61835);assertEquals(1, f.getPrinter().calculatePrintedLength(PERIOD, null));
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(61836);assertEquals(1, f.getPrinter().countFieldsToPrint(PERIOD, Integer.MAX_VALUE, null));
        
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(61837);Period p = new Period(0, 0, 0, 0, 0, 0, 0, 0);
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(61838);assertEquals("0", f.print(p));
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(61839);assertEquals(1, f.getPrinter().calculatePrintedLength(p, null));
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(61840);assertEquals(1, f.getPrinter().countFieldsToPrint(p, Integer.MAX_VALUE, null));
    }finally{__CLR4_4_11bnj1bnjlc8azxpl.R.flushNeeded();}}

    public void testFormatSeconds() {__CLR4_4_11bnj1bnjlc8azxpl.R.globalSliceStart(getClass().getName(),61841);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1chvy3n1bpt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11bnj1bnjlc8azxpl.R.rethrow($CLV_t2$);}finally{__CLR4_4_11bnj1bnjlc8azxpl.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatSeconds",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),61841,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1chvy3n1bpt(){try{__CLR4_4_11bnj1bnjlc8azxpl.R.inc(61841);
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(61842);PeriodFormatter f = builder.appendSeconds().toFormatter();
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(61843);assertEquals("7", f.print(PERIOD));
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(61844);assertEquals(1, f.getPrinter().calculatePrintedLength(PERIOD, null));
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(61845);assertEquals(1, f.getPrinter().countFieldsToPrint(PERIOD, Integer.MAX_VALUE, null));
        
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(61846);Period p = new Period(0, 0, 0, 0, 0, 0, 0, 0);
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(61847);assertEquals("0", f.print(p));
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(61848);assertEquals(1, f.getPrinter().calculatePrintedLength(p, null));
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(61849);assertEquals(1, f.getPrinter().countFieldsToPrint(p, Integer.MAX_VALUE, null));
    }finally{__CLR4_4_11bnj1bnjlc8azxpl.R.flushNeeded();}}

    public void testFormatSecondsWithMillis() {__CLR4_4_11bnj1bnjlc8azxpl.R.globalSliceStart(getClass().getName(),61850);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1berp1z1bq2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11bnj1bnjlc8azxpl.R.rethrow($CLV_t2$);}finally{__CLR4_4_11bnj1bnjlc8azxpl.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatSecondsWithMillis",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),61850,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1berp1z1bq2(){try{__CLR4_4_11bnj1bnjlc8azxpl.R.inc(61850);
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(61851);PeriodFormatter f = builder.appendSecondsWithMillis().toFormatter();
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(61852);Period p = new Period(0, 0, 0, 0, 0, 0, 7, 0);
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(61853);assertEquals("7.000", f.print(p));
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(61854);assertEquals(5, f.getPrinter().calculatePrintedLength(p, null));
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(61855);assertEquals(1, f.getPrinter().countFieldsToPrint(p, Integer.MAX_VALUE, null));
        
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(61856);p = new Period(0, 0, 0, 0, 0, 0, 7, 1);
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(61857);assertEquals("7.001", f.print(p));
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(61858);assertEquals(5, f.getPrinter().calculatePrintedLength(p, null));
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(61859);assertEquals(1, f.getPrinter().countFieldsToPrint(p, Integer.MAX_VALUE, null));
        
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(61860);p = new Period(0, 0, 0, 0, 0, 0, 7, 999);
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(61861);assertEquals("7.999", f.print(p));
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(61862);assertEquals(5, f.getPrinter().calculatePrintedLength(p, null));
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(61863);assertEquals(1, f.getPrinter().countFieldsToPrint(p, Integer.MAX_VALUE, null));
        
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(61864);p = new Period(0, 0, 0, 0, 0, 0, 7, 1000);
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(61865);assertEquals("8.000", f.print(p));
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(61866);assertEquals(5, f.getPrinter().calculatePrintedLength(p, null));
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(61867);assertEquals(1, f.getPrinter().countFieldsToPrint(p, Integer.MAX_VALUE, null));
        
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(61868);p = new Period(0, 0, 0, 0, 0, 0, 7, 1001);
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(61869);assertEquals("8.001", f.print(p));
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(61870);assertEquals(5, f.getPrinter().calculatePrintedLength(p, null));
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(61871);assertEquals(1, f.getPrinter().countFieldsToPrint(p, Integer.MAX_VALUE, null));
        
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(61872);p = new Period(0, 0, 0, 0, 0, 0, 7, -1);
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(61873);assertEquals("6.999", f.print(p));
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(61874);assertEquals(5, f.getPrinter().calculatePrintedLength(p, null));
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(61875);assertEquals(1, f.getPrinter().countFieldsToPrint(p, Integer.MAX_VALUE, null));
        
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(61876);p = new Period(0, 0, 0, 0, 0, 0, -7, 1);
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(61877);assertEquals("-6.999", f.print(p));
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(61878);assertEquals(6, f.getPrinter().calculatePrintedLength(p, null));
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(61879);assertEquals(1, f.getPrinter().countFieldsToPrint(p, Integer.MAX_VALUE, null));
        
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(61880);p = new Period(0, 0, 0, 0, 0, 0, -7, -1);
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(61881);assertEquals("-7.001", f.print(p));
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(61882);assertEquals(6, f.getPrinter().calculatePrintedLength(p, null));
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(61883);assertEquals(1, f.getPrinter().countFieldsToPrint(p, Integer.MAX_VALUE, null));
        
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(61884);p = new Period(0, 0, 0, 0, 0, 0, 0, 0);
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(61885);assertEquals("0.000", f.print(p));
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(61886);assertEquals(5, f.getPrinter().calculatePrintedLength(p, null));
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(61887);assertEquals(1, f.getPrinter().countFieldsToPrint(p, Integer.MAX_VALUE, null));
    }finally{__CLR4_4_11bnj1bnjlc8azxpl.R.flushNeeded();}}

    public void testFormatSecondsWithOptionalMillis() {__CLR4_4_11bnj1bnjlc8azxpl.R.globalSliceStart(getClass().getName(),61888);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vw33131br4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11bnj1bnjlc8azxpl.R.rethrow($CLV_t2$);}finally{__CLR4_4_11bnj1bnjlc8azxpl.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatSecondsWithOptionalMillis",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),61888,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vw33131br4(){try{__CLR4_4_11bnj1bnjlc8azxpl.R.inc(61888);
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(61889);PeriodFormatter f = builder.appendSecondsWithOptionalMillis().toFormatter();
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(61890);Period p = new Period(0, 0, 0, 0, 0, 0, 7, 0);
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(61891);assertEquals("7", f.print(p));
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(61892);assertEquals(1, f.getPrinter().calculatePrintedLength(p, null));
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(61893);assertEquals(1, f.getPrinter().countFieldsToPrint(p, Integer.MAX_VALUE, null));
        
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(61894);p = new Period(0, 0, 0, 0, 0, 0, 7, 1);
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(61895);assertEquals("7.001", f.print(p));
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(61896);assertEquals(5, f.getPrinter().calculatePrintedLength(p, null));
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(61897);assertEquals(1, f.getPrinter().countFieldsToPrint(p, Integer.MAX_VALUE, null));
        
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(61898);p = new Period(0, 0, 0, 0, 0, 0, 7, 999);
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(61899);assertEquals("7.999", f.print(p));
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(61900);assertEquals(5, f.getPrinter().calculatePrintedLength(p, null));
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(61901);assertEquals(1, f.getPrinter().countFieldsToPrint(p, Integer.MAX_VALUE, null));
        
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(61902);p = new Period(0, 0, 0, 0, 0, 0, 7, 1000);
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(61903);assertEquals("8", f.print(p));
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(61904);assertEquals(1, f.getPrinter().calculatePrintedLength(p, null));
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(61905);assertEquals(1, f.getPrinter().countFieldsToPrint(p, Integer.MAX_VALUE, null));
        
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(61906);p = new Period(0, 0, 0, 0, 0, 0, 7, 1001);
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(61907);assertEquals("8.001", f.print(p));
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(61908);assertEquals(5, f.getPrinter().calculatePrintedLength(p, null));
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(61909);assertEquals(1, f.getPrinter().countFieldsToPrint(p, Integer.MAX_VALUE, null));
        
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(61910);p = new Period(0, 0, 0, 0, 0, 0, 7, -1);
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(61911);assertEquals("6.999", f.print(p));
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(61912);assertEquals(5, f.getPrinter().calculatePrintedLength(p, null));
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(61913);assertEquals(1, f.getPrinter().countFieldsToPrint(p, Integer.MAX_VALUE, null));
        
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(61914);p = new Period(0, 0, 0, 0, 0, 0, -7, 1);
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(61915);assertEquals("-6.999", f.print(p));
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(61916);assertEquals(6, f.getPrinter().calculatePrintedLength(p, null));
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(61917);assertEquals(1, f.getPrinter().countFieldsToPrint(p, Integer.MAX_VALUE, null));
        
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(61918);p = new Period(0, 0, 0, 0, 0, 0, -7, -1);
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(61919);assertEquals("-7.001", f.print(p));
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(61920);assertEquals(6, f.getPrinter().calculatePrintedLength(p, null));
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(61921);assertEquals(1, f.getPrinter().countFieldsToPrint(p, Integer.MAX_VALUE, null));
        
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(61922);p = new Period(0, 0, 0, 0, 0, 0, 0, 0);
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(61923);assertEquals("0", f.print(p));
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(61924);assertEquals(1, f.getPrinter().calculatePrintedLength(p, null));
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(61925);assertEquals(1, f.getPrinter().countFieldsToPrint(p, Integer.MAX_VALUE, null));
    }finally{__CLR4_4_11bnj1bnjlc8azxpl.R.flushNeeded();}}

    public void testFormatMillis() {__CLR4_4_11bnj1bnjlc8azxpl.R.globalSliceStart(getClass().getName(),61926);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lka3hy1bs6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11bnj1bnjlc8azxpl.R.rethrow($CLV_t2$);}finally{__CLR4_4_11bnj1bnjlc8azxpl.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatMillis",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),61926,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lka3hy1bs6(){try{__CLR4_4_11bnj1bnjlc8azxpl.R.inc(61926);
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(61927);PeriodFormatter f = builder.appendMillis().toFormatter();
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(61928);assertEquals("8", f.print(PERIOD));
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(61929);assertEquals(1, f.getPrinter().calculatePrintedLength(PERIOD, null));
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(61930);assertEquals(1, f.getPrinter().countFieldsToPrint(PERIOD, Integer.MAX_VALUE, null));
        
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(61931);Period p = new Period(0, 0, 0, 0, 0, 0, 0, 0);
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(61932);assertEquals("0", f.print(p));
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(61933);assertEquals(1, f.getPrinter().calculatePrintedLength(p, null));
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(61934);assertEquals(1, f.getPrinter().countFieldsToPrint(p, Integer.MAX_VALUE, null));
    }finally{__CLR4_4_11bnj1bnjlc8azxpl.R.flushNeeded();}}

    public void testFormatMillis3Digit() {__CLR4_4_11bnj1bnjlc8azxpl.R.globalSliceStart(getClass().getName(),61935);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tulg9c1bsf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11bnj1bnjlc8azxpl.R.rethrow($CLV_t2$);}finally{__CLR4_4_11bnj1bnjlc8azxpl.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatMillis3Digit",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),61935,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tulg9c1bsf(){try{__CLR4_4_11bnj1bnjlc8azxpl.R.inc(61935);
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(61936);PeriodFormatter f = builder.appendMillis3Digit().toFormatter();
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(61937);assertEquals("008", f.print(PERIOD));
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(61938);assertEquals(3, f.getPrinter().calculatePrintedLength(PERIOD, null));
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(61939);assertEquals(1, f.getPrinter().countFieldsToPrint(PERIOD, Integer.MAX_VALUE, null));
        
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(61940);Period p = new Period(0, 0, 0, 0, 0, 0, 0, 0);
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(61941);assertEquals("000", f.print(p));
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(61942);assertEquals(3, f.getPrinter().calculatePrintedLength(p, null));
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(61943);assertEquals(1, f.getPrinter().countFieldsToPrint(p, Integer.MAX_VALUE, null));
    }finally{__CLR4_4_11bnj1bnjlc8azxpl.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testFormatPrefixSimple1() {__CLR4_4_11bnj1bnjlc8azxpl.R.globalSliceStart(getClass().getName(),61944);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qnddlh1bso();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11bnj1bnjlc8azxpl.R.rethrow($CLV_t2$);}finally{__CLR4_4_11bnj1bnjlc8azxpl.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatPrefixSimple1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),61944,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qnddlh1bso(){try{__CLR4_4_11bnj1bnjlc8azxpl.R.inc(61944);
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(61945);PeriodFormatter f = builder.appendPrefix("Years:").appendYears().toFormatter();
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(61946);assertEquals("Years:1", f.print(PERIOD));
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(61947);assertEquals(7, f.getPrinter().calculatePrintedLength(PERIOD, null));
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(61948);assertEquals(1, f.getPrinter().countFieldsToPrint(PERIOD, Integer.MAX_VALUE, null));
        
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(61949);Period p = new Period(0, 0, 0, 0, 0, 0, 0, 0);
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(61950);assertEquals("Years:0", f.print(p));
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(61951);assertEquals(7, f.getPrinter().calculatePrintedLength(p, null));
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(61952);assertEquals(1, f.getPrinter().countFieldsToPrint(p, Integer.MAX_VALUE, null));
    }finally{__CLR4_4_11bnj1bnjlc8azxpl.R.flushNeeded();}}

    public void testFormatPrefixSimple2() {__CLR4_4_11bnj1bnjlc8azxpl.R.globalSliceStart(getClass().getName(),61953);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nedet01bsx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11bnj1bnjlc8azxpl.R.rethrow($CLV_t2$);}finally{__CLR4_4_11bnj1bnjlc8azxpl.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatPrefixSimple2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),61953,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nedet01bsx(){try{__CLR4_4_11bnj1bnjlc8azxpl.R.inc(61953);
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(61954);PeriodFormatter f = builder.appendPrefix("Hours:").appendHours().toFormatter();
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(61955);assertEquals("Hours:5", f.print(PERIOD));
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(61956);assertEquals(7, f.getPrinter().calculatePrintedLength(PERIOD, null));
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(61957);assertEquals(1, f.getPrinter().countFieldsToPrint(PERIOD, Integer.MAX_VALUE, null));
        
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(61958);Period p = new Period(0, 0, 0, 0, 0, 0, 0, 0);
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(61959);assertEquals("Hours:0", f.print(p));
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(61960);assertEquals(7, f.getPrinter().calculatePrintedLength(p, null));
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(61961);assertEquals(1, f.getPrinter().countFieldsToPrint(p, Integer.MAX_VALUE, null));
    }finally{__CLR4_4_11bnj1bnjlc8azxpl.R.flushNeeded();}}

    public void testFormatPrefixSimple3() {__CLR4_4_11bnj1bnjlc8azxpl.R.globalSliceStart(getClass().getName(),61962);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1k5dg0j1bt6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11bnj1bnjlc8azxpl.R.rethrow($CLV_t2$);}finally{__CLR4_4_11bnj1bnjlc8azxpl.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatPrefixSimple3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),61962,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1k5dg0j1bt6(){try{__CLR4_4_11bnj1bnjlc8azxpl.R.inc(61962);
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(61963);try {
            __CLR4_4_11bnj1bnjlc8azxpl.R.inc(61964);builder.appendPrefix(null);
            __CLR4_4_11bnj1bnjlc8azxpl.R.inc(61965);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_11bnj1bnjlc8azxpl.R.flushNeeded();}}

    public void testFormatPrefixPlural1() {__CLR4_4_11bnj1bnjlc8azxpl.R.globalSliceStart(getClass().getName(),61966);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vrj2w71bta();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11bnj1bnjlc8azxpl.R.rethrow($CLV_t2$);}finally{__CLR4_4_11bnj1bnjlc8azxpl.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatPrefixPlural1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),61966,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vrj2w71bta(){try{__CLR4_4_11bnj1bnjlc8azxpl.R.inc(61966);
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(61967);PeriodFormatter f = builder.appendPrefix("Year:", "Years:").appendYears().toFormatter();
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(61968);assertEquals("Year:1", f.print(PERIOD));
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(61969);assertEquals(6, f.getPrinter().calculatePrintedLength(PERIOD, null));
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(61970);assertEquals(1, f.getPrinter().countFieldsToPrint(PERIOD, Integer.MAX_VALUE, null));
        
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(61971);Period p = new Period(0, 0, 0, 0, 0, 0, 0, 0);
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(61972);assertEquals("Years:0", f.print(p));
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(61973);assertEquals(7, f.getPrinter().calculatePrintedLength(p, null));
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(61974);assertEquals(1, f.getPrinter().countFieldsToPrint(p, Integer.MAX_VALUE, null));
    }finally{__CLR4_4_11bnj1bnjlc8azxpl.R.flushNeeded();}}

    public void testFormatPrefixPlural2() {__CLR4_4_11bnj1bnjlc8azxpl.R.globalSliceStart(getClass().getName(),61975);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sij43q1btj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11bnj1bnjlc8azxpl.R.rethrow($CLV_t2$);}finally{__CLR4_4_11bnj1bnjlc8azxpl.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatPrefixPlural2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),61975,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sij43q1btj(){try{__CLR4_4_11bnj1bnjlc8azxpl.R.inc(61975);
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(61976);PeriodFormatter f = builder.appendPrefix("Hour:", "Hours:").appendHours().toFormatter();
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(61977);assertEquals("Hours:5", f.print(PERIOD));
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(61978);assertEquals(7, f.getPrinter().calculatePrintedLength(PERIOD, null));
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(61979);assertEquals(1, f.getPrinter().countFieldsToPrint(PERIOD, Integer.MAX_VALUE, null));
        
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(61980);Period p = new Period(0, 0, 0, 0, 0, 0, 0, 0);
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(61981);assertEquals("Hours:0", f.print(p));
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(61982);assertEquals(7, f.getPrinter().calculatePrintedLength(p, null));
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(61983);assertEquals(1, f.getPrinter().countFieldsToPrint(p, Integer.MAX_VALUE, null));
    }finally{__CLR4_4_11bnj1bnjlc8azxpl.R.flushNeeded();}}

    public void testFormatPrefixPlural3() {__CLR4_4_11bnj1bnjlc8azxpl.R.globalSliceStart(getClass().getName(),61984);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1p9j5b91bts();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11bnj1bnjlc8azxpl.R.rethrow($CLV_t2$);}finally{__CLR4_4_11bnj1bnjlc8azxpl.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatPrefixPlural3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),61984,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1p9j5b91bts(){try{__CLR4_4_11bnj1bnjlc8azxpl.R.inc(61984);
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(61985);try {
            __CLR4_4_11bnj1bnjlc8azxpl.R.inc(61986);builder.appendPrefix(null, "");
            __CLR4_4_11bnj1bnjlc8azxpl.R.inc(61987);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(61988);try {
            __CLR4_4_11bnj1bnjlc8azxpl.R.inc(61989);builder.appendPrefix("", null);
            __CLR4_4_11bnj1bnjlc8azxpl.R.inc(61990);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(61991);try {
            __CLR4_4_11bnj1bnjlc8azxpl.R.inc(61992);builder.appendPrefix(null, null);
            __CLR4_4_11bnj1bnjlc8azxpl.R.inc(61993);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_11bnj1bnjlc8azxpl.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testFormatSuffixSimple1() {__CLR4_4_11bnj1bnjlc8azxpl.R.globalSliceStart(getClass().getName(),61994);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ad0441bu2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11bnj1bnjlc8azxpl.R.rethrow($CLV_t2$);}finally{__CLR4_4_11bnj1bnjlc8azxpl.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatSuffixSimple1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),61994,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ad0441bu2(){try{__CLR4_4_11bnj1bnjlc8azxpl.R.inc(61994);
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(61995);PeriodFormatter f = builder.appendYears().appendSuffix(" years").toFormatter();
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(61996);assertEquals("1 years", f.print(PERIOD));
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(61997);assertEquals(7, f.getPrinter().calculatePrintedLength(PERIOD, null));
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(61998);assertEquals(1, f.getPrinter().countFieldsToPrint(PERIOD, Integer.MAX_VALUE, null));
        
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(61999);Period p = new Period(0, 0, 0, 0, 0, 0, 0, 0);
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62000);assertEquals("0 years", f.print(p));
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62001);assertEquals(7, f.getPrinter().calculatePrintedLength(p, null));
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62002);assertEquals(1, f.getPrinter().countFieldsToPrint(p, Integer.MAX_VALUE, null));
    }finally{__CLR4_4_11bnj1bnjlc8azxpl.R.flushNeeded();}}

    public void testFormatSuffixSimple2() {__CLR4_4_11bnj1bnjlc8azxpl.R.globalSliceStart(getClass().getName(),62003);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12ymyod1bub();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11bnj1bnjlc8azxpl.R.rethrow($CLV_t2$);}finally{__CLR4_4_11bnj1bnjlc8azxpl.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatSuffixSimple2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),62003,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12ymyod1bub(){try{__CLR4_4_11bnj1bnjlc8azxpl.R.inc(62003);
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62004);PeriodFormatter f = builder.appendHours().appendSuffix(" hours").toFormatter();
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62005);assertEquals("5 hours", f.print(PERIOD));
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62006);assertEquals(7, f.getPrinter().calculatePrintedLength(PERIOD, null));
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62007);assertEquals(1, f.getPrinter().countFieldsToPrint(PERIOD, Integer.MAX_VALUE, null));
        
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62008);Period p = new Period(0, 0, 0, 0, 0, 0, 0, 0);
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62009);assertEquals("0 hours", f.print(p));
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62010);assertEquals(7, f.getPrinter().calculatePrintedLength(p, null));
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62011);assertEquals(1, f.getPrinter().countFieldsToPrint(p, Integer.MAX_VALUE, null));
    }finally{__CLR4_4_11bnj1bnjlc8azxpl.R.flushNeeded();}}

    public void testFormatSuffixSimple3() {__CLR4_4_11bnj1bnjlc8azxpl.R.globalSliceStart(getClass().getName(),62012);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_167mxgu1buk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11bnj1bnjlc8azxpl.R.rethrow($CLV_t2$);}finally{__CLR4_4_11bnj1bnjlc8azxpl.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatSuffixSimple3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),62012,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_167mxgu1buk(){try{__CLR4_4_11bnj1bnjlc8azxpl.R.inc(62012);
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62013);try {
            __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62014);builder.appendSuffix(null);
            __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62015);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_11bnj1bnjlc8azxpl.R.flushNeeded();}}

    public void testFormatSuffixSimple4() {__CLR4_4_11bnj1bnjlc8azxpl.R.globalSliceStart(getClass().getName(),62016);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19gmw9b1buo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11bnj1bnjlc8azxpl.R.rethrow($CLV_t2$);}finally{__CLR4_4_11bnj1bnjlc8azxpl.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatSuffixSimple4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),62016,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19gmw9b1buo(){try{__CLR4_4_11bnj1bnjlc8azxpl.R.inc(62016);
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62017);try {
            __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62018);builder.appendSuffix(" hours");
            __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62019);fail();
        } catch (IllegalStateException ex) {}
    }finally{__CLR4_4_11bnj1bnjlc8azxpl.R.flushNeeded();}}

    public void testFormatSuffixPlural1() {__CLR4_4_11bnj1bnjlc8azxpl.R.globalSliceStart(getClass().getName(),62020);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15eipeu1bus();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11bnj1bnjlc8azxpl.R.rethrow($CLV_t2$);}finally{__CLR4_4_11bnj1bnjlc8azxpl.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatSuffixPlural1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),62020,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15eipeu1bus(){try{__CLR4_4_11bnj1bnjlc8azxpl.R.inc(62020);
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62021);PeriodFormatter f = builder.appendYears().appendSuffix(" year", " years").toFormatter();
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62022);assertEquals("1 year", f.print(PERIOD));
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62023);assertEquals(6, f.getPrinter().calculatePrintedLength(PERIOD, null));
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62024);assertEquals(1, f.getPrinter().countFieldsToPrint(PERIOD, Integer.MAX_VALUE, null));
        
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62025);Period p = new Period(0, 0, 0, 0, 0, 0, 0, 0);
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62026);assertEquals("0 years", f.print(p));
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62027);assertEquals(7, f.getPrinter().calculatePrintedLength(p, null));
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62028);assertEquals(1, f.getPrinter().countFieldsToPrint(p, Integer.MAX_VALUE, null));
    }finally{__CLR4_4_11bnj1bnjlc8azxpl.R.flushNeeded();}}

    public void testFormatSuffixPlural2() {__CLR4_4_11bnj1bnjlc8azxpl.R.globalSliceStart(getClass().getName(),62029);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_125iqmd1bv1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11bnj1bnjlc8azxpl.R.rethrow($CLV_t2$);}finally{__CLR4_4_11bnj1bnjlc8azxpl.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatSuffixPlural2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),62029,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_125iqmd1bv1(){try{__CLR4_4_11bnj1bnjlc8azxpl.R.inc(62029);
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62030);PeriodFormatter f = builder.appendHours().appendSuffix(" hour", " hours").toFormatter();
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62031);assertEquals("5 hours", f.print(PERIOD));
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62032);assertEquals(7, f.getPrinter().calculatePrintedLength(PERIOD, null));
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62033);assertEquals(1, f.getPrinter().countFieldsToPrint(PERIOD, Integer.MAX_VALUE, null));
        
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62034);Period p = new Period(0, 0, 0, 0, 0, 0, 0, 0);
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62035);assertEquals("0 hours", f.print(p));
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62036);assertEquals(7, f.getPrinter().calculatePrintedLength(p, null));
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62037);assertEquals(1, f.getPrinter().countFieldsToPrint(p, Integer.MAX_VALUE, null));
    }finally{__CLR4_4_11bnj1bnjlc8azxpl.R.flushNeeded();}}

    public void testFormatSuffixPlural3() {__CLR4_4_11bnj1bnjlc8azxpl.R.globalSliceStart(getClass().getName(),62038);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_113h8641bva();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11bnj1bnjlc8azxpl.R.rethrow($CLV_t2$);}finally{__CLR4_4_11bnj1bnjlc8azxpl.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatSuffixPlural3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),62038,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_113h8641bva(){try{__CLR4_4_11bnj1bnjlc8azxpl.R.inc(62038);
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62039);try {
            __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62040);builder.appendSuffix(null, "");
            __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62041);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62042);try {
            __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62043);builder.appendSuffix("", null);
            __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62044);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62045);try {
            __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62046);builder.appendSuffix(null, null);
            __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62047);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_11bnj1bnjlc8azxpl.R.flushNeeded();}}

    public void testFormatSuffixPlural4() {__CLR4_4_11bnj1bnjlc8azxpl.R.globalSliceStart(getClass().getName(),62048);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14ch6yl1bvk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11bnj1bnjlc8azxpl.R.rethrow($CLV_t2$);}finally{__CLR4_4_11bnj1bnjlc8azxpl.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatSuffixPlural4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),62048,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14ch6yl1bvk(){try{__CLR4_4_11bnj1bnjlc8azxpl.R.inc(62048);
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62049);try {
            __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62050);builder.appendSuffix(" hour", " hours");
            __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62051);fail();
        } catch (IllegalStateException ex) {}
    }finally{__CLR4_4_11bnj1bnjlc8azxpl.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testFormatPrefixSuffix() {__CLR4_4_11bnj1bnjlc8azxpl.R.globalSliceStart(getClass().getName(),62052);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1obbegd1bvo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11bnj1bnjlc8azxpl.R.rethrow($CLV_t2$);}finally{__CLR4_4_11bnj1bnjlc8azxpl.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatPrefixSuffix",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),62052,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1obbegd1bvo(){try{__CLR4_4_11bnj1bnjlc8azxpl.R.inc(62052);
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62053);PeriodFormatter f = builder.appendPrefix("P").appendYears().appendSuffix("Y").toFormatter();
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62054);assertEquals("P1Y", f.print(PERIOD));
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62055);assertEquals(3, f.getPrinter().calculatePrintedLength(PERIOD, null));
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62056);assertEquals(1, f.getPrinter().countFieldsToPrint(PERIOD, Integer.MAX_VALUE, null));
        
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62057);Period p = new Period(0, 0, 0, 0, 0, 0, 0, 0);
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62058);assertEquals("P0Y", f.print(p));
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62059);assertEquals(3, f.getPrinter().calculatePrintedLength(p, null));
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62060);assertEquals(1, f.getPrinter().countFieldsToPrint(p, Integer.MAX_VALUE, null));
    }finally{__CLR4_4_11bnj1bnjlc8azxpl.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testFormatSeparatorSimple() {__CLR4_4_11bnj1bnjlc8azxpl.R.globalSliceStart(getClass().getName(),62061);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ex7w171bvx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11bnj1bnjlc8azxpl.R.rethrow($CLV_t2$);}finally{__CLR4_4_11bnj1bnjlc8azxpl.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatSeparatorSimple",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),62061,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ex7w171bvx(){try{__CLR4_4_11bnj1bnjlc8azxpl.R.inc(62061);
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62062);PeriodFormatter f = builder.appendYears().appendSeparator("T").appendHours().toFormatter();
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62063);assertEquals("1T5", f.print(PERIOD));
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62064);assertEquals(3, f.getPrinter().calculatePrintedLength(PERIOD, null));
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62065);assertEquals(2, f.getPrinter().countFieldsToPrint(PERIOD, Integer.MAX_VALUE, null));
        
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62066);assertEquals("5", f.print(TIME_PERIOD));
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62067);assertEquals(1, f.getPrinter().calculatePrintedLength(TIME_PERIOD, null));
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62068);assertEquals(1, f.getPrinter().countFieldsToPrint(TIME_PERIOD, Integer.MAX_VALUE, null));
        
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62069);assertEquals("1", f.print(DATE_PERIOD));
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62070);assertEquals(1, f.getPrinter().calculatePrintedLength(DATE_PERIOD, null));
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62071);assertEquals(1, f.getPrinter().countFieldsToPrint(DATE_PERIOD, Integer.MAX_VALUE, null));
    }finally{__CLR4_4_11bnj1bnjlc8azxpl.R.flushNeeded();}}

    public void testFormatSeparatorComplex() {__CLR4_4_11bnj1bnjlc8azxpl.R.globalSliceStart(getClass().getName(),62072);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1k7oz6j1bw8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11bnj1bnjlc8azxpl.R.rethrow($CLV_t2$);}finally{__CLR4_4_11bnj1bnjlc8azxpl.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatSeparatorComplex",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),62072,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1k7oz6j1bw8(){try{__CLR4_4_11bnj1bnjlc8azxpl.R.inc(62072);
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62073);PeriodFormatter f = builder
            .appendYears().appendSeparator(", ", " and ")
            .appendHours().appendSeparator(", ", " and ")
            .appendMinutes().appendSeparator(", ", " and ")
            .toFormatter();
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62074);assertEquals("1, 5 and 6", f.print(PERIOD));
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62075);assertEquals(10, f.getPrinter().calculatePrintedLength(PERIOD, null));
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62076);assertEquals(3, f.getPrinter().countFieldsToPrint(PERIOD, Integer.MAX_VALUE, null));
        
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62077);assertEquals("5 and 6", f.print(TIME_PERIOD));
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62078);assertEquals(7, f.getPrinter().calculatePrintedLength(TIME_PERIOD, null));
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62079);assertEquals(2, f.getPrinter().countFieldsToPrint(TIME_PERIOD, Integer.MAX_VALUE, null));
        
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62080);assertEquals("1", f.print(DATE_PERIOD));
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62081);assertEquals(1, f.getPrinter().calculatePrintedLength(DATE_PERIOD, null));
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62082);assertEquals(1, f.getPrinter().countFieldsToPrint(DATE_PERIOD, Integer.MAX_VALUE, null));
    }finally{__CLR4_4_11bnj1bnjlc8azxpl.R.flushNeeded();}}

    public void testFormatSeparatorIfFieldsAfter() {__CLR4_4_11bnj1bnjlc8azxpl.R.globalSliceStart(getClass().getName(),62083);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rc8anl1bwj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11bnj1bnjlc8azxpl.R.rethrow($CLV_t2$);}finally{__CLR4_4_11bnj1bnjlc8azxpl.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatSeparatorIfFieldsAfter",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),62083,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rc8anl1bwj(){try{__CLR4_4_11bnj1bnjlc8azxpl.R.inc(62083);
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62084);PeriodFormatter f = builder.appendYears().appendSeparatorIfFieldsAfter("T").appendHours().toFormatter();
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62085);assertEquals("1T5", f.print(PERIOD));
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62086);assertEquals(3, f.getPrinter().calculatePrintedLength(PERIOD, null));
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62087);assertEquals(2, f.getPrinter().countFieldsToPrint(PERIOD, Integer.MAX_VALUE, null));
        
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62088);assertEquals("T5", f.print(TIME_PERIOD));
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62089);assertEquals(2, f.getPrinter().calculatePrintedLength(TIME_PERIOD, null));
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62090);assertEquals(1, f.getPrinter().countFieldsToPrint(TIME_PERIOD, Integer.MAX_VALUE, null));
        
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62091);assertEquals("1", f.print(DATE_PERIOD));
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62092);assertEquals(1, f.getPrinter().calculatePrintedLength(DATE_PERIOD, null));
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62093);assertEquals(1, f.getPrinter().countFieldsToPrint(DATE_PERIOD, Integer.MAX_VALUE, null));
    }finally{__CLR4_4_11bnj1bnjlc8azxpl.R.flushNeeded();}}

    public void testFormatSeparatorIfFieldsBefore() {__CLR4_4_11bnj1bnjlc8azxpl.R.globalSliceStart(getClass().getName(),62094);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a3f42g1bwu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11bnj1bnjlc8azxpl.R.rethrow($CLV_t2$);}finally{__CLR4_4_11bnj1bnjlc8azxpl.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatSeparatorIfFieldsBefore",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),62094,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a3f42g1bwu(){try{__CLR4_4_11bnj1bnjlc8azxpl.R.inc(62094);
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62095);PeriodFormatter f = builder.appendYears().appendSeparatorIfFieldsBefore("T").appendHours().toFormatter();
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62096);assertEquals("1T5", f.print(PERIOD));
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62097);assertEquals(3, f.getPrinter().calculatePrintedLength(PERIOD, null));
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62098);assertEquals(2, f.getPrinter().countFieldsToPrint(PERIOD, Integer.MAX_VALUE, null));
        
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62099);assertEquals("5", f.print(TIME_PERIOD));
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62100);assertEquals(1, f.getPrinter().calculatePrintedLength(TIME_PERIOD, null));
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62101);assertEquals(1, f.getPrinter().countFieldsToPrint(TIME_PERIOD, Integer.MAX_VALUE, null));
        
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62102);assertEquals("1T", f.print(DATE_PERIOD));
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62103);assertEquals(2, f.getPrinter().calculatePrintedLength(DATE_PERIOD, null));
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62104);assertEquals(1, f.getPrinter().countFieldsToPrint(DATE_PERIOD, Integer.MAX_VALUE, null));
    }finally{__CLR4_4_11bnj1bnjlc8azxpl.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testFormatLiteral() {__CLR4_4_11bnj1bnjlc8azxpl.R.globalSliceStart(getClass().getName(),62105);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1exmiml1bx5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11bnj1bnjlc8azxpl.R.rethrow($CLV_t2$);}finally{__CLR4_4_11bnj1bnjlc8azxpl.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatLiteral",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),62105,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1exmiml1bx5(){try{__CLR4_4_11bnj1bnjlc8azxpl.R.inc(62105);
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62106);PeriodFormatter f = builder.appendLiteral("HELLO").toFormatter();
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62107);assertEquals("HELLO", f.print(PERIOD));
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62108);assertEquals(5, f.getPrinter().calculatePrintedLength(PERIOD, null));
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62109);assertEquals(0, f.getPrinter().countFieldsToPrint(PERIOD, Integer.MAX_VALUE, null));
    }finally{__CLR4_4_11bnj1bnjlc8azxpl.R.flushNeeded();}}

    public void testFormatAppendFormatter() {__CLR4_4_11bnj1bnjlc8azxpl.R.globalSliceStart(getClass().getName(),62110);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rn8qwi1bxa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11bnj1bnjlc8azxpl.R.rethrow($CLV_t2$);}finally{__CLR4_4_11bnj1bnjlc8azxpl.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatAppendFormatter",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),62110,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rn8qwi1bxa(){try{__CLR4_4_11bnj1bnjlc8azxpl.R.inc(62110);
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62111);PeriodFormatter base = builder.appendYears().appendLiteral("-").toFormatter();
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62112);PeriodFormatter f = new PeriodFormatterBuilder().append(base).appendYears().toFormatter();
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62113);assertEquals("1-1", f.print(PERIOD));
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62114);assertEquals(3, f.getPrinter().calculatePrintedLength(PERIOD, null));
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62115);assertEquals(2, f.getPrinter().countFieldsToPrint(PERIOD, Integer.MAX_VALUE, null));
    }finally{__CLR4_4_11bnj1bnjlc8azxpl.R.flushNeeded();}}

    public void testFormatMinDigits() {__CLR4_4_11bnj1bnjlc8azxpl.R.globalSliceStart(getClass().getName(),62116);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wbkw0m1bxg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11bnj1bnjlc8azxpl.R.rethrow($CLV_t2$);}finally{__CLR4_4_11bnj1bnjlc8azxpl.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatMinDigits",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),62116,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wbkw0m1bxg(){try{__CLR4_4_11bnj1bnjlc8azxpl.R.inc(62116);
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62117);PeriodFormatter f = new PeriodFormatterBuilder().minimumPrintedDigits(4).appendYears().toFormatter();
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62118);assertEquals("0001", f.print(PERIOD));
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62119);assertEquals(4, f.getPrinter().calculatePrintedLength(PERIOD, null));
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62120);assertEquals(1, f.getPrinter().countFieldsToPrint(PERIOD, Integer.MAX_VALUE, null));
    }finally{__CLR4_4_11bnj1bnjlc8azxpl.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testFormatPrintZeroDefault() {__CLR4_4_11bnj1bnjlc8azxpl.R.globalSliceStart(getClass().getName(),62121);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tmp0n01bxl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11bnj1bnjlc8azxpl.R.rethrow($CLV_t2$);}finally{__CLR4_4_11bnj1bnjlc8azxpl.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatPrintZeroDefault",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),62121,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tmp0n01bxl(){try{__CLR4_4_11bnj1bnjlc8azxpl.R.inc(62121);
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62122);PeriodFormatter f =
            new PeriodFormatterBuilder()
                .appendYears().appendLiteral("-")
                .appendMonths().appendLiteral("-")
                .appendWeeks().appendLiteral("-")
                .appendDays().toFormatter();
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62123);assertEquals("1-2-3-4", f.print(PERIOD));
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62124);assertEquals(7, f.getPrinter().calculatePrintedLength(PERIOD, null));
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62125);assertEquals(4, f.getPrinter().countFieldsToPrint(PERIOD, Integer.MAX_VALUE, null));
        
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62126);assertEquals("---0", f.print(EMPTY_YEAR_DAY_PERIOD));
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62127);assertEquals(4, f.getPrinter().calculatePrintedLength(EMPTY_YEAR_DAY_PERIOD, null));
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62128);assertEquals(1, f.getPrinter().countFieldsToPrint(EMPTY_YEAR_DAY_PERIOD, Integer.MAX_VALUE, null));
        
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62129);assertEquals("1---4", f.print(YEAR_DAY_PERIOD));
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62130);assertEquals(5, f.getPrinter().calculatePrintedLength(YEAR_DAY_PERIOD, null));
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62131);assertEquals(2, f.getPrinter().countFieldsToPrint(YEAR_DAY_PERIOD, Integer.MAX_VALUE, null));
        
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62132);assertEquals("---0", f.print(EMPTY_PERIOD));
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62133);assertEquals(4, f.getPrinter().calculatePrintedLength(EMPTY_PERIOD, null));
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62134);assertEquals(1, f.getPrinter().countFieldsToPrint(EMPTY_PERIOD, Integer.MAX_VALUE, null));
        
        // test only last instance of same field is output
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62135);f = new PeriodFormatterBuilder()
                .appendYears().appendLiteral("-")
                .appendYears().toFormatter();
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62136);assertEquals("-0", f.print(EMPTY_PERIOD));
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62137);assertEquals(2, f.getPrinter().calculatePrintedLength(EMPTY_PERIOD, null));
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62138);assertEquals(1, f.getPrinter().countFieldsToPrint(EMPTY_PERIOD, Integer.MAX_VALUE, null));
    }finally{__CLR4_4_11bnj1bnjlc8azxpl.R.flushNeeded();}}

    public void testFormatPrintZeroRarelyLast() {__CLR4_4_11bnj1bnjlc8azxpl.R.globalSliceStart(getClass().getName(),62139);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1iewgeg1by3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11bnj1bnjlc8azxpl.R.rethrow($CLV_t2$);}finally{__CLR4_4_11bnj1bnjlc8azxpl.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatPrintZeroRarelyLast",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),62139,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1iewgeg1by3(){try{__CLR4_4_11bnj1bnjlc8azxpl.R.inc(62139);
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62140);PeriodFormatter f =
            new PeriodFormatterBuilder()
                .printZeroRarelyLast()
                .appendYears().appendLiteral("-")
                .appendMonths().appendLiteral("-")
                .appendWeeks().appendLiteral("-")
                .appendDays().toFormatter();
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62141);assertEquals("1-2-3-4", f.print(PERIOD));
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62142);assertEquals(7, f.getPrinter().calculatePrintedLength(PERIOD, null));
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62143);assertEquals(4, f.getPrinter().countFieldsToPrint(PERIOD, Integer.MAX_VALUE, null));
        
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62144);assertEquals("---0", f.print(EMPTY_YEAR_DAY_PERIOD));
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62145);assertEquals(4, f.getPrinter().calculatePrintedLength(EMPTY_YEAR_DAY_PERIOD, null));
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62146);assertEquals(1, f.getPrinter().countFieldsToPrint(EMPTY_YEAR_DAY_PERIOD, Integer.MAX_VALUE, null));
        
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62147);assertEquals("1---4", f.print(YEAR_DAY_PERIOD));
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62148);assertEquals(5, f.getPrinter().calculatePrintedLength(YEAR_DAY_PERIOD, null));
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62149);assertEquals(2, f.getPrinter().countFieldsToPrint(YEAR_DAY_PERIOD, Integer.MAX_VALUE, null));
        
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62150);assertEquals("---0", f.print(EMPTY_PERIOD));
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62151);assertEquals(4, f.getPrinter().calculatePrintedLength(EMPTY_PERIOD, null));
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62152);assertEquals(1, f.getPrinter().countFieldsToPrint(EMPTY_PERIOD, Integer.MAX_VALUE, null));
    }finally{__CLR4_4_11bnj1bnjlc8azxpl.R.flushNeeded();}}

    public void testFormatPrintZeroRarelyFirst() {__CLR4_4_11bnj1bnjlc8azxpl.R.globalSliceStart(getClass().getName(),62153);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12ohv241byh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11bnj1bnjlc8azxpl.R.rethrow($CLV_t2$);}finally{__CLR4_4_11bnj1bnjlc8azxpl.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatPrintZeroRarelyFirst",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),62153,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12ohv241byh(){try{__CLR4_4_11bnj1bnjlc8azxpl.R.inc(62153);
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62154);PeriodFormatter f =
            new PeriodFormatterBuilder()
                .printZeroRarelyFirst()
                .appendYears().appendLiteral("-")
                .appendMonths().appendLiteral("-")
                .appendWeeks().appendLiteral("-")
                .appendDays().toFormatter();
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62155);assertEquals("1-2-3-4", f.print(PERIOD));
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62156);assertEquals(7, f.getPrinter().calculatePrintedLength(PERIOD, null));
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62157);assertEquals(4, f.getPrinter().countFieldsToPrint(PERIOD, Integer.MAX_VALUE, null));
        
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62158);assertEquals("0---", f.print(EMPTY_YEAR_DAY_PERIOD));
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62159);assertEquals(4, f.getPrinter().calculatePrintedLength(EMPTY_YEAR_DAY_PERIOD, null));
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62160);assertEquals(1, f.getPrinter().countFieldsToPrint(EMPTY_YEAR_DAY_PERIOD, Integer.MAX_VALUE, null));
        
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62161);assertEquals("1---4", f.print(YEAR_DAY_PERIOD));
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62162);assertEquals(5, f.getPrinter().calculatePrintedLength(YEAR_DAY_PERIOD, null));
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62163);assertEquals(2, f.getPrinter().countFieldsToPrint(YEAR_DAY_PERIOD, Integer.MAX_VALUE, null));
        
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62164);assertEquals("0---", f.print(EMPTY_PERIOD));
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62165);assertEquals(4, f.getPrinter().calculatePrintedLength(EMPTY_PERIOD, null));
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62166);assertEquals(1, f.getPrinter().countFieldsToPrint(EMPTY_PERIOD, Integer.MAX_VALUE, null));
    }finally{__CLR4_4_11bnj1bnjlc8azxpl.R.flushNeeded();}}

    public void testFormatPrintZeroRarelyFirstYears() {__CLR4_4_11bnj1bnjlc8azxpl.R.globalSliceStart(getClass().getName(),62167);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1i4ejmg1byv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11bnj1bnjlc8azxpl.R.rethrow($CLV_t2$);}finally{__CLR4_4_11bnj1bnjlc8azxpl.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatPrintZeroRarelyFirstYears",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),62167,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1i4ejmg1byv(){try{__CLR4_4_11bnj1bnjlc8azxpl.R.inc(62167);
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62168);PeriodFormatter f = new PeriodFormatterBuilder()
            .printZeroRarelyFirst()
            .appendYears().toFormatter();
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62169);assertEquals("0", f.print(EMPTY_PERIOD));
    }finally{__CLR4_4_11bnj1bnjlc8azxpl.R.flushNeeded();}}

    public void testFormatPrintZeroRarelyFirstMonths() {__CLR4_4_11bnj1bnjlc8azxpl.R.globalSliceStart(getClass().getName(),62170);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1k1ly0f1byy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11bnj1bnjlc8azxpl.R.rethrow($CLV_t2$);}finally{__CLR4_4_11bnj1bnjlc8azxpl.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatPrintZeroRarelyFirstMonths",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),62170,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1k1ly0f1byy(){try{__CLR4_4_11bnj1bnjlc8azxpl.R.inc(62170);
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62171);PeriodFormatter f = new PeriodFormatterBuilder()
            .printZeroRarelyFirst()
            .appendMonths().toFormatter();
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62172);assertEquals("0", f.print(EMPTY_PERIOD));
    }finally{__CLR4_4_11bnj1bnjlc8azxpl.R.flushNeeded();}}

    public void testFormatPrintZeroRarelyFirstWeeks() {__CLR4_4_11bnj1bnjlc8azxpl.R.globalSliceStart(getClass().getName(),62173);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wpmtyp1bz1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11bnj1bnjlc8azxpl.R.rethrow($CLV_t2$);}finally{__CLR4_4_11bnj1bnjlc8azxpl.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatPrintZeroRarelyFirstWeeks",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),62173,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wpmtyp1bz1(){try{__CLR4_4_11bnj1bnjlc8azxpl.R.inc(62173);
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62174);PeriodFormatter f = new PeriodFormatterBuilder()
            .printZeroRarelyFirst()
            .appendWeeks().toFormatter();
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62175);assertEquals("0", f.print(EMPTY_PERIOD));
    }finally{__CLR4_4_11bnj1bnjlc8azxpl.R.flushNeeded();}}

    public void testFormatPrintZeroRarelyFirstDays() {__CLR4_4_11bnj1bnjlc8azxpl.R.globalSliceStart(getClass().getName(),62176);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mmy54d1bz4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11bnj1bnjlc8azxpl.R.rethrow($CLV_t2$);}finally{__CLR4_4_11bnj1bnjlc8azxpl.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatPrintZeroRarelyFirstDays",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),62176,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mmy54d1bz4(){try{__CLR4_4_11bnj1bnjlc8azxpl.R.inc(62176);
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62177);PeriodFormatter f = new PeriodFormatterBuilder()
            .printZeroRarelyFirst()
            .appendDays().toFormatter();
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62178);assertEquals("0", f.print(EMPTY_PERIOD));
    }finally{__CLR4_4_11bnj1bnjlc8azxpl.R.flushNeeded();}}

    public void testFormatPrintZeroRarelyFirstHours() {__CLR4_4_11bnj1bnjlc8azxpl.R.globalSliceStart(getClass().getName(),62179);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cdbovz1bz7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11bnj1bnjlc8azxpl.R.rethrow($CLV_t2$);}finally{__CLR4_4_11bnj1bnjlc8azxpl.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatPrintZeroRarelyFirstHours",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),62179,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cdbovz1bz7(){try{__CLR4_4_11bnj1bnjlc8azxpl.R.inc(62179);
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62180);PeriodFormatter f = new PeriodFormatterBuilder()
            .printZeroRarelyFirst()
            .appendHours().toFormatter();
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62181);assertEquals("0", f.print(EMPTY_PERIOD));
    }finally{__CLR4_4_11bnj1bnjlc8azxpl.R.flushNeeded();}}

    public void testFormatPrintZeroRarelyFirstMinutes() {__CLR4_4_11bnj1bnjlc8azxpl.R.globalSliceStart(getClass().getName(),62182);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jy60cx1bza();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11bnj1bnjlc8azxpl.R.rethrow($CLV_t2$);}finally{__CLR4_4_11bnj1bnjlc8azxpl.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatPrintZeroRarelyFirstMinutes",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),62182,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jy60cx1bza(){try{__CLR4_4_11bnj1bnjlc8azxpl.R.inc(62182);
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62183);PeriodFormatter f = new PeriodFormatterBuilder()
            .printZeroRarelyFirst()
            .appendMinutes().toFormatter();
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62184);assertEquals("0", f.print(EMPTY_PERIOD));
    }finally{__CLR4_4_11bnj1bnjlc8azxpl.R.flushNeeded();}}

    public void testFormatPrintZeroRarelyFirstSeconds() {__CLR4_4_11bnj1bnjlc8azxpl.R.globalSliceStart(getClass().getName(),62185);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wcc4q91bzd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11bnj1bnjlc8azxpl.R.rethrow($CLV_t2$);}finally{__CLR4_4_11bnj1bnjlc8azxpl.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatPrintZeroRarelyFirstSeconds",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),62185,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wcc4q91bzd(){try{__CLR4_4_11bnj1bnjlc8azxpl.R.inc(62185);
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62186);PeriodFormatter f = new PeriodFormatterBuilder()
            .printZeroRarelyFirst()
            .appendSeconds().toFormatter();
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62187);assertEquals("0", f.print(EMPTY_PERIOD));
    }finally{__CLR4_4_11bnj1bnjlc8azxpl.R.flushNeeded();}}

    public void testFormatPrintZeroIfSupported() {__CLR4_4_11bnj1bnjlc8azxpl.R.globalSliceStart(getClass().getName(),62188);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ozv3nw1bzg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11bnj1bnjlc8azxpl.R.rethrow($CLV_t2$);}finally{__CLR4_4_11bnj1bnjlc8azxpl.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatPrintZeroIfSupported",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),62188,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ozv3nw1bzg(){try{__CLR4_4_11bnj1bnjlc8azxpl.R.inc(62188);
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62189);PeriodFormatter f =
            new PeriodFormatterBuilder()
                .printZeroIfSupported()
                .appendYears().appendLiteral("-")
                .appendMonths().appendLiteral("-")
                .appendWeeks().appendLiteral("-")
                .appendDays().toFormatter();
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62190);assertEquals("1-2-3-4", f.print(PERIOD));
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62191);assertEquals(7, f.getPrinter().calculatePrintedLength(PERIOD, null));
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62192);assertEquals(4, f.getPrinter().countFieldsToPrint(PERIOD, Integer.MAX_VALUE, null));
        
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62193);assertEquals("0---0", f.print(EMPTY_YEAR_DAY_PERIOD));
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62194);assertEquals(5, f.getPrinter().calculatePrintedLength(EMPTY_YEAR_DAY_PERIOD, null));
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62195);assertEquals(2, f.getPrinter().countFieldsToPrint(EMPTY_YEAR_DAY_PERIOD, Integer.MAX_VALUE, null));
        
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62196);assertEquals("1---4", f.print(YEAR_DAY_PERIOD));
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62197);assertEquals(5, f.getPrinter().calculatePrintedLength(YEAR_DAY_PERIOD, null));
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62198);assertEquals(2, f.getPrinter().countFieldsToPrint(YEAR_DAY_PERIOD, Integer.MAX_VALUE, null));
        
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62199);assertEquals("0-0-0-0", f.print(EMPTY_PERIOD));
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62200);assertEquals(7, f.getPrinter().calculatePrintedLength(EMPTY_PERIOD, null));
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62201);assertEquals(4, f.getPrinter().countFieldsToPrint(EMPTY_PERIOD, Integer.MAX_VALUE, null));
    }finally{__CLR4_4_11bnj1bnjlc8azxpl.R.flushNeeded();}}

    public void testFormatPrintZeroAlways() {__CLR4_4_11bnj1bnjlc8azxpl.R.globalSliceStart(getClass().getName(),62202);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15286ji1bzu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11bnj1bnjlc8azxpl.R.rethrow($CLV_t2$);}finally{__CLR4_4_11bnj1bnjlc8azxpl.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatPrintZeroAlways",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),62202,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15286ji1bzu(){try{__CLR4_4_11bnj1bnjlc8azxpl.R.inc(62202);
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62203);PeriodFormatter f =
            new PeriodFormatterBuilder()
                .printZeroAlways()
                .appendYears().appendLiteral("-")
                .appendMonths().appendLiteral("-")
                .appendWeeks().appendLiteral("-")
                .appendDays().toFormatter();
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62204);assertEquals("1-2-3-4", f.print(PERIOD));
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62205);assertEquals(7, f.getPrinter().calculatePrintedLength(PERIOD, null));
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62206);assertEquals(4, f.getPrinter().countFieldsToPrint(PERIOD, Integer.MAX_VALUE, null));
        
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62207);assertEquals("0-0-0-0", f.print(EMPTY_YEAR_DAY_PERIOD));
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62208);assertEquals(7, f.getPrinter().calculatePrintedLength(EMPTY_YEAR_DAY_PERIOD, null));
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62209);assertEquals(4, f.getPrinter().countFieldsToPrint(EMPTY_YEAR_DAY_PERIOD, Integer.MAX_VALUE, null));
        
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62210);assertEquals("1-0-0-4", f.print(YEAR_DAY_PERIOD));
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62211);assertEquals(7, f.getPrinter().calculatePrintedLength(YEAR_DAY_PERIOD, null));
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62212);assertEquals(4, f.getPrinter().countFieldsToPrint(YEAR_DAY_PERIOD, Integer.MAX_VALUE, null));
        
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62213);assertEquals("0-0-0-0", f.print(EMPTY_PERIOD));
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62214);assertEquals(7, f.getPrinter().calculatePrintedLength(EMPTY_PERIOD, null));
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62215);assertEquals(4, f.getPrinter().countFieldsToPrint(EMPTY_PERIOD, Integer.MAX_VALUE, null));
    }finally{__CLR4_4_11bnj1bnjlc8azxpl.R.flushNeeded();}}

    public void testFormatPrintZeroNever() {__CLR4_4_11bnj1bnjlc8azxpl.R.globalSliceStart(getClass().getName(),62216);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18texk71c08();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11bnj1bnjlc8azxpl.R.rethrow($CLV_t2$);}finally{__CLR4_4_11bnj1bnjlc8azxpl.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatPrintZeroNever",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),62216,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18texk71c08(){try{__CLR4_4_11bnj1bnjlc8azxpl.R.inc(62216);
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62217);PeriodFormatter f =
            new PeriodFormatterBuilder()
                .printZeroNever()
                .appendYears().appendLiteral("-")
                .appendMonths().appendLiteral("-")
                .appendWeeks().appendLiteral("-")
                .appendDays().toFormatter();
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62218);assertEquals("1-2-3-4", f.print(PERIOD));
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62219);assertEquals(7, f.getPrinter().calculatePrintedLength(PERIOD, null));
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62220);assertEquals(4, f.getPrinter().countFieldsToPrint(PERIOD, Integer.MAX_VALUE, null));
        
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62221);assertEquals("---", f.print(EMPTY_YEAR_DAY_PERIOD));
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62222);assertEquals(3, f.getPrinter().calculatePrintedLength(EMPTY_YEAR_DAY_PERIOD, null));
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62223);assertEquals(0, f.getPrinter().countFieldsToPrint(EMPTY_YEAR_DAY_PERIOD, Integer.MAX_VALUE, null));
        
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62224);assertEquals("1---4", f.print(YEAR_DAY_PERIOD));
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62225);assertEquals(5, f.getPrinter().calculatePrintedLength(YEAR_DAY_PERIOD, null));
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62226);assertEquals(2, f.getPrinter().countFieldsToPrint(YEAR_DAY_PERIOD, Integer.MAX_VALUE, null));
        
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62227);assertEquals("---", f.print(EMPTY_PERIOD));
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62228);assertEquals(3, f.getPrinter().calculatePrintedLength(EMPTY_PERIOD, null));
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62229);assertEquals(0, f.getPrinter().countFieldsToPrint(EMPTY_PERIOD, Integer.MAX_VALUE, null));
    }finally{__CLR4_4_11bnj1bnjlc8azxpl.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testFormatAppend_PrinterParser_null_null() {__CLR4_4_11bnj1bnjlc8azxpl.R.globalSliceStart(getClass().getName(),62230);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17oc98c1c0m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11bnj1bnjlc8azxpl.R.rethrow($CLV_t2$);}finally{__CLR4_4_11bnj1bnjlc8azxpl.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatAppend_PrinterParser_null_null",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),62230,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17oc98c1c0m(){try{__CLR4_4_11bnj1bnjlc8azxpl.R.inc(62230);
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62231);try {
            __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62232);new PeriodFormatterBuilder().append(null, null);
            __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62233);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_11bnj1bnjlc8azxpl.R.flushNeeded();}}

    public void testFormatAppend_PrinterParser_Printer_null() {__CLR4_4_11bnj1bnjlc8azxpl.R.globalSliceStart(getClass().getName(),62234);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kkv8x71c0q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11bnj1bnjlc8azxpl.R.rethrow($CLV_t2$);}finally{__CLR4_4_11bnj1bnjlc8azxpl.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatAppend_PrinterParser_Printer_null",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),62234,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kkv8x71c0q(){try{__CLR4_4_11bnj1bnjlc8azxpl.R.inc(62234);
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62235);PeriodPrinter printer = new PeriodFormatterBuilder().appendYears().appendLiteral("-").toPrinter();
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62236);PeriodFormatterBuilder bld = new PeriodFormatterBuilder().append(printer, null).appendMonths();
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62237);assertNotNull(bld.toPrinter());
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62238);assertNull(bld.toParser());
        
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62239);PeriodFormatter f = bld.toFormatter();
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62240);assertEquals("1-2", f.print(PERIOD));
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62241);try {
            __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62242);f.parsePeriod("1-2");
            __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62243);fail();
        } catch (UnsupportedOperationException ex) {}
    }finally{__CLR4_4_11bnj1bnjlc8azxpl.R.flushNeeded();}}

    public void testFormatAppend_PrinterParser_null_Parser() {__CLR4_4_11bnj1bnjlc8azxpl.R.globalSliceStart(getClass().getName(),62244);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14orkho1c10();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11bnj1bnjlc8azxpl.R.rethrow($CLV_t2$);}finally{__CLR4_4_11bnj1bnjlc8azxpl.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatAppend_PrinterParser_null_Parser",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),62244,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14orkho1c10(){try{__CLR4_4_11bnj1bnjlc8azxpl.R.inc(62244);
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62245);PeriodParser parser = new PeriodFormatterBuilder().appendWeeks().appendLiteral("-").toParser();
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62246);PeriodFormatterBuilder bld = new PeriodFormatterBuilder().append(null, parser).appendMonths();
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62247);assertNull(bld.toPrinter());
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62248);assertNotNull(bld.toParser());
        
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62249);PeriodFormatter f = bld.toFormatter();
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62250);try {
            __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62251);f.print(PERIOD);
            __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62252);fail();
        } catch (UnsupportedOperationException ex) {}
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62253);assertEquals(new Period(0, 2, 1, 0, 0, 0, 0, 0), f.parsePeriod("1-2"));
    }finally{__CLR4_4_11bnj1bnjlc8azxpl.R.flushNeeded();}}

    public void testFormatAppend_PrinterParser_PrinterParser() {__CLR4_4_11bnj1bnjlc8azxpl.R.globalSliceStart(getClass().getName(),62254);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_149ksjm1c1a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11bnj1bnjlc8azxpl.R.rethrow($CLV_t2$);}finally{__CLR4_4_11bnj1bnjlc8azxpl.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatAppend_PrinterParser_PrinterParser",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),62254,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_149ksjm1c1a(){try{__CLR4_4_11bnj1bnjlc8azxpl.R.inc(62254);
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62255);PeriodPrinter printer = new PeriodFormatterBuilder().appendYears().appendLiteral("-").toPrinter();
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62256);PeriodParser parser = new PeriodFormatterBuilder().appendWeeks().appendLiteral("-").toParser();
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62257);PeriodFormatterBuilder bld = new PeriodFormatterBuilder().append(printer, parser).appendMonths();
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62258);assertNotNull(bld.toPrinter());
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62259);assertNotNull(bld.toParser());
        
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62260);PeriodFormatter f = bld.toFormatter();
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62261);assertEquals("1-2", f.print(PERIOD));
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62262);assertEquals(new Period(0, 2, 1, 0, 0, 0, 0, 0), f.parsePeriod("1-2"));
    }finally{__CLR4_4_11bnj1bnjlc8azxpl.R.flushNeeded();}}

    public void testFormatAppend_PrinterParser_Printer_null_null_Parser() {__CLR4_4_11bnj1bnjlc8azxpl.R.globalSliceStart(getClass().getName(),62263);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pks5711c1j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11bnj1bnjlc8azxpl.R.rethrow($CLV_t2$);}finally{__CLR4_4_11bnj1bnjlc8azxpl.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatAppend_PrinterParser_Printer_null_null_Parser",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),62263,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pks5711c1j(){try{__CLR4_4_11bnj1bnjlc8azxpl.R.inc(62263);
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62264);PeriodPrinter printer = new PeriodFormatterBuilder().appendYears().appendLiteral("-").toPrinter();
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62265);PeriodParser parser = new PeriodFormatterBuilder().appendWeeks().appendLiteral("-").toParser();
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62266);PeriodFormatterBuilder bld = new PeriodFormatterBuilder().append(printer, null).append(null, parser);
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62267);assertNull(bld.toPrinter());
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62268);assertNull(bld.toParser());
        
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62269);try {
            __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62270);bld.toFormatter();
            __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62271);fail();
        } catch (IllegalStateException ex) {}
    }finally{__CLR4_4_11bnj1bnjlc8azxpl.R.flushNeeded();}}

    public void testFormatAppend_PrinterParserThenClear() {__CLR4_4_11bnj1bnjlc8azxpl.R.globalSliceStart(getClass().getName(),62272);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wl76h21c1s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11bnj1bnjlc8azxpl.R.rethrow($CLV_t2$);}finally{__CLR4_4_11bnj1bnjlc8azxpl.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testFormatAppend_PrinterParserThenClear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),62272,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wl76h21c1s(){try{__CLR4_4_11bnj1bnjlc8azxpl.R.inc(62272);
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62273);PeriodPrinter printer = new PeriodFormatterBuilder().appendYears().appendLiteral("-").toPrinter();
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62274);PeriodParser parser = new PeriodFormatterBuilder().appendWeeks().appendLiteral("-").toParser();
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62275);PeriodFormatterBuilder bld = new PeriodFormatterBuilder().append(printer, null).append(null, parser);
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62276);assertNull(bld.toPrinter());
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62277);assertNull(bld.toParser());
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62278);bld.clear();
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62279);bld.appendMonths();
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62280);assertNotNull(bld.toPrinter());
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62281);assertNotNull(bld.toParser());
    }finally{__CLR4_4_11bnj1bnjlc8azxpl.R.flushNeeded();}}

    public void testBug2495455() {__CLR4_4_11bnj1bnjlc8azxpl.R.globalSliceStart(getClass().getName(),62282);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qw1fwl1c22();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11bnj1bnjlc8azxpl.R.rethrow($CLV_t2$);}finally{__CLR4_4_11bnj1bnjlc8azxpl.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatterBuilder.testBug2495455",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),62282,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qw1fwl1c22(){try{__CLR4_4_11bnj1bnjlc8azxpl.R.inc(62282);
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62283);PeriodFormatter pfmt1 = new PeriodFormatterBuilder()
            .appendLiteral("P")
            .appendYears()
            .appendSuffix("Y")
            .appendMonths()
            .appendSuffix("M")
            .appendWeeks()
            .appendSuffix("W")
            .appendDays()
            .appendSuffix("D")
            .appendSeparatorIfFieldsAfter("T")
            .appendHours()
            .appendSuffix("H")
            .appendMinutes()
            .appendSuffix("M")
            .appendSecondsWithOptionalMillis()
            .appendSuffix("S")
            .toFormatter();
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62284);PeriodFormatter pfmt2 = new PeriodFormatterBuilder()
            .append(ISOPeriodFormat.standard())
            .toFormatter();
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62285);pfmt1.parsePeriod("PT1003199059S");
        __CLR4_4_11bnj1bnjlc8azxpl.R.inc(62286);pfmt2.parsePeriod("PT1003199059S");
    }finally{__CLR4_4_11bnj1bnjlc8azxpl.R.flushNeeded();}}

}
