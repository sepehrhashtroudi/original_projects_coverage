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
package org.joda.time.format;

import java.io.CharArrayWriter;
import java.util.Locale;
import java.util.TimeZone;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.Chronology;
import org.joda.time.DateTimeConstants;
import org.joda.time.DateTimeUtils;
import org.joda.time.DateTimeZone;
import org.joda.time.MutablePeriod;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.ISOChronology;

/**
 * This class is a Junit unit test for Period Formating.
 *
 * @author Stephen Colebourne
 */
public class TestPeriodFormatter extends TestCase {static class __CLR4_4_11bke1bkelc8azxog{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672271031490L,8589935092L,61759,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final DateTimeZone UTC = DateTimeZone.UTC;
    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    private static final DateTimeZone TOKYO = DateTimeZone.forID("Asia/Tokyo");
    private static final DateTimeZone NEWYORK = DateTimeZone.forID("America/New_York");
    private static final Chronology ISO_UTC = ISOChronology.getInstanceUTC();
    private static final Chronology ISO_PARIS = ISOChronology.getInstance(PARIS);
    private static final Chronology BUDDHIST_PARIS = BuddhistChronology.getInstance(PARIS);

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
    private PeriodFormatter f = null;

    public static void main(String[] args) {try{__CLR4_4_11bke1bkelc8azxog.R.inc(61646);
        __CLR4_4_11bke1bkelc8azxog.R.inc(61647);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_11bke1bkelc8azxog.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_11bke1bkelc8azxog.R.inc(61648);
        __CLR4_4_11bke1bkelc8azxog.R.inc(61649);return new TestSuite(TestPeriodFormatter.class);
    }finally{__CLR4_4_11bke1bkelc8azxog.R.flushNeeded();}}

    public TestPeriodFormatter(String name) {
        super(name);__CLR4_4_11bke1bkelc8azxog.R.inc(61651);try{__CLR4_4_11bke1bkelc8azxog.R.inc(61650);
    }finally{__CLR4_4_11bke1bkelc8azxog.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_11bke1bkelc8azxog.R.inc(61652);
        __CLR4_4_11bke1bkelc8azxog.R.inc(61653);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_11bke1bkelc8azxog.R.inc(61654);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_11bke1bkelc8azxog.R.inc(61655);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_11bke1bkelc8azxog.R.inc(61656);originalLocale = Locale.getDefault();
        __CLR4_4_11bke1bkelc8azxog.R.inc(61657);DateTimeZone.setDefault(LONDON);
        __CLR4_4_11bke1bkelc8azxog.R.inc(61658);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_11bke1bkelc8azxog.R.inc(61659);Locale.setDefault(Locale.UK);
        __CLR4_4_11bke1bkelc8azxog.R.inc(61660);f = ISOPeriodFormat.standard();
    }finally{__CLR4_4_11bke1bkelc8azxog.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_11bke1bkelc8azxog.R.inc(61661);
        __CLR4_4_11bke1bkelc8azxog.R.inc(61662);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_11bke1bkelc8azxog.R.inc(61663);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_11bke1bkelc8azxog.R.inc(61664);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_11bke1bkelc8azxog.R.inc(61665);Locale.setDefault(originalLocale);
        __CLR4_4_11bke1bkelc8azxog.R.inc(61666);originalDateTimeZone = null;
        __CLR4_4_11bke1bkelc8azxog.R.inc(61667);originalTimeZone = null;
        __CLR4_4_11bke1bkelc8azxog.R.inc(61668);originalLocale = null;
        __CLR4_4_11bke1bkelc8azxog.R.inc(61669);f = null;
    }finally{__CLR4_4_11bke1bkelc8azxog.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testPrint_simple() {__CLR4_4_11bke1bkelc8azxog.R.globalSliceStart(getClass().getName(),61670);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1le5eil1bl2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11bke1bkelc8azxog.R.rethrow($CLV_t2$);}finally{__CLR4_4_11bke1bkelc8azxog.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatter.testPrint_simple",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),61670,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1le5eil1bl2(){try{__CLR4_4_11bke1bkelc8azxog.R.inc(61670);
        __CLR4_4_11bke1bkelc8azxog.R.inc(61671);Period p = new Period(1, 2, 3, 4, 5, 6, 7, 8);
        __CLR4_4_11bke1bkelc8azxog.R.inc(61672);assertEquals("P1Y2M3W4DT5H6M7.008S", f.print(p));
    }finally{__CLR4_4_11bke1bkelc8azxog.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testPrint_bufferMethods() throws Exception {__CLR4_4_11bke1bkelc8azxog.R.globalSliceStart(getClass().getName(),61673);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sz4zx11bl5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11bke1bkelc8azxog.R.rethrow($CLV_t2$);}finally{__CLR4_4_11bke1bkelc8azxog.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatter.testPrint_bufferMethods",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),61673,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sz4zx11bl5() throws Exception{try{__CLR4_4_11bke1bkelc8azxog.R.inc(61673);
        __CLR4_4_11bke1bkelc8azxog.R.inc(61674);Period p = new Period(1, 2, 3, 4, 5, 6, 7, 8);
        __CLR4_4_11bke1bkelc8azxog.R.inc(61675);StringBuffer buf = new StringBuffer();
        __CLR4_4_11bke1bkelc8azxog.R.inc(61676);f.printTo(buf, p);
        __CLR4_4_11bke1bkelc8azxog.R.inc(61677);assertEquals("P1Y2M3W4DT5H6M7.008S", buf.toString());
        
        __CLR4_4_11bke1bkelc8azxog.R.inc(61678);buf = new StringBuffer();
        __CLR4_4_11bke1bkelc8azxog.R.inc(61679);try {
            __CLR4_4_11bke1bkelc8azxog.R.inc(61680);f.printTo(buf, null);
            __CLR4_4_11bke1bkelc8azxog.R.inc(61681);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_11bke1bkelc8azxog.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testPrint_writerMethods() throws Exception {__CLR4_4_11bke1bkelc8azxog.R.globalSliceStart(getClass().getName(),61682);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vcbrku1ble();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11bke1bkelc8azxog.R.rethrow($CLV_t2$);}finally{__CLR4_4_11bke1bkelc8azxog.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatter.testPrint_writerMethods",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),61682,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vcbrku1ble() throws Exception{try{__CLR4_4_11bke1bkelc8azxog.R.inc(61682);
        __CLR4_4_11bke1bkelc8azxog.R.inc(61683);Period p = new Period(1, 2, 3, 4, 5, 6, 7, 8);
        __CLR4_4_11bke1bkelc8azxog.R.inc(61684);CharArrayWriter out = new CharArrayWriter();
        __CLR4_4_11bke1bkelc8azxog.R.inc(61685);f.printTo(out, p);
        __CLR4_4_11bke1bkelc8azxog.R.inc(61686);assertEquals("P1Y2M3W4DT5H6M7.008S", out.toString());
        
        __CLR4_4_11bke1bkelc8azxog.R.inc(61687);out = new CharArrayWriter();
        __CLR4_4_11bke1bkelc8azxog.R.inc(61688);try {
            __CLR4_4_11bke1bkelc8azxog.R.inc(61689);f.printTo(out, null);
            __CLR4_4_11bke1bkelc8azxog.R.inc(61690);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_11bke1bkelc8azxog.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testWithGetLocaleMethods() {__CLR4_4_11bke1bkelc8azxog.R.globalSliceStart(getClass().getName(),61691);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14siwo11bln();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11bke1bkelc8azxog.R.rethrow($CLV_t2$);}finally{__CLR4_4_11bke1bkelc8azxog.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatter.testWithGetLocaleMethods",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),61691,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14siwo11bln(){try{__CLR4_4_11bke1bkelc8azxog.R.inc(61691);
        __CLR4_4_11bke1bkelc8azxog.R.inc(61692);PeriodFormatter f2 = f.withLocale(Locale.FRENCH);
        __CLR4_4_11bke1bkelc8azxog.R.inc(61693);assertEquals(Locale.FRENCH, f2.getLocale());
        __CLR4_4_11bke1bkelc8azxog.R.inc(61694);assertSame(f2, f2.withLocale(Locale.FRENCH));
        
        __CLR4_4_11bke1bkelc8azxog.R.inc(61695);f2 = f.withLocale(null);
        __CLR4_4_11bke1bkelc8azxog.R.inc(61696);assertEquals(null, f2.getLocale());
        __CLR4_4_11bke1bkelc8azxog.R.inc(61697);assertSame(f2, f2.withLocale(null));
    }finally{__CLR4_4_11bke1bkelc8azxog.R.flushNeeded();}}

    public void testWithGetParseTypeMethods() {__CLR4_4_11bke1bkelc8azxog.R.globalSliceStart(getClass().getName(),61698);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fuqf561blu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11bke1bkelc8azxog.R.rethrow($CLV_t2$);}finally{__CLR4_4_11bke1bkelc8azxog.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatter.testWithGetParseTypeMethods",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),61698,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fuqf561blu(){try{__CLR4_4_11bke1bkelc8azxog.R.inc(61698);
        __CLR4_4_11bke1bkelc8azxog.R.inc(61699);PeriodFormatter f2 = f.withParseType(PeriodType.dayTime());
        __CLR4_4_11bke1bkelc8azxog.R.inc(61700);assertEquals(PeriodType.dayTime(), f2.getParseType());
        __CLR4_4_11bke1bkelc8azxog.R.inc(61701);assertSame(f2, f2.withParseType(PeriodType.dayTime()));
        
        __CLR4_4_11bke1bkelc8azxog.R.inc(61702);f2 = f.withParseType(null);
        __CLR4_4_11bke1bkelc8azxog.R.inc(61703);assertEquals(null, f2.getParseType());
        __CLR4_4_11bke1bkelc8azxog.R.inc(61704);assertSame(f2, f2.withParseType(null));
    }finally{__CLR4_4_11bke1bkelc8azxog.R.flushNeeded();}}

    public void testPrinterParserMethods() {__CLR4_4_11bke1bkelc8azxog.R.globalSliceStart(getClass().getName(),61705);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n6rfoy1bm1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11bke1bkelc8azxog.R.rethrow($CLV_t2$);}finally{__CLR4_4_11bke1bkelc8azxog.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatter.testPrinterParserMethods",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),61705,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n6rfoy1bm1(){try{__CLR4_4_11bke1bkelc8azxog.R.inc(61705);
        __CLR4_4_11bke1bkelc8azxog.R.inc(61706);Period p = new Period(1, 2, 3, 4, 5, 6, 7, 8);
        __CLR4_4_11bke1bkelc8azxog.R.inc(61707);PeriodFormatter f2 = new PeriodFormatter(f.getPrinter(), f.getParser());
        __CLR4_4_11bke1bkelc8azxog.R.inc(61708);assertEquals(f.getPrinter(), f2.getPrinter());
        __CLR4_4_11bke1bkelc8azxog.R.inc(61709);assertEquals(f.getParser(), f2.getParser());
        __CLR4_4_11bke1bkelc8azxog.R.inc(61710);assertEquals(true, f2.isPrinter());
        __CLR4_4_11bke1bkelc8azxog.R.inc(61711);assertEquals(true, f2.isParser());
        __CLR4_4_11bke1bkelc8azxog.R.inc(61712);assertNotNull(f2.print(p));
        __CLR4_4_11bke1bkelc8azxog.R.inc(61713);assertNotNull(f2.parsePeriod("P1Y2M3W4DT5H6M7.008S"));
        
        __CLR4_4_11bke1bkelc8azxog.R.inc(61714);f2 = new PeriodFormatter(f.getPrinter(), null);
        __CLR4_4_11bke1bkelc8azxog.R.inc(61715);assertEquals(f.getPrinter(), f2.getPrinter());
        __CLR4_4_11bke1bkelc8azxog.R.inc(61716);assertEquals(null, f2.getParser());
        __CLR4_4_11bke1bkelc8azxog.R.inc(61717);assertEquals(true, f2.isPrinter());
        __CLR4_4_11bke1bkelc8azxog.R.inc(61718);assertEquals(false, f2.isParser());
        __CLR4_4_11bke1bkelc8azxog.R.inc(61719);assertNotNull(f2.print(p));
        __CLR4_4_11bke1bkelc8azxog.R.inc(61720);try {
            __CLR4_4_11bke1bkelc8azxog.R.inc(61721);assertNotNull(f2.parsePeriod("P1Y2M3W4DT5H6M7.008S"));
            __CLR4_4_11bke1bkelc8azxog.R.inc(61722);fail();
        } catch (UnsupportedOperationException ex) {}
        
        __CLR4_4_11bke1bkelc8azxog.R.inc(61723);f2 = new PeriodFormatter(null, f.getParser());
        __CLR4_4_11bke1bkelc8azxog.R.inc(61724);assertEquals(null, f2.getPrinter());
        __CLR4_4_11bke1bkelc8azxog.R.inc(61725);assertEquals(f.getParser(), f2.getParser());
        __CLR4_4_11bke1bkelc8azxog.R.inc(61726);assertEquals(false, f2.isPrinter());
        __CLR4_4_11bke1bkelc8azxog.R.inc(61727);assertEquals(true, f2.isParser());
        __CLR4_4_11bke1bkelc8azxog.R.inc(61728);try {
            __CLR4_4_11bke1bkelc8azxog.R.inc(61729);f2.print(p);
            __CLR4_4_11bke1bkelc8azxog.R.inc(61730);fail();
        } catch (UnsupportedOperationException ex) {}
        __CLR4_4_11bke1bkelc8azxog.R.inc(61731);assertNotNull(f2.parsePeriod("P1Y2M3W4DT5H6M7.008S"));
    }finally{__CLR4_4_11bke1bkelc8azxog.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testParsePeriod_simple() {__CLR4_4_11bke1bkelc8azxog.R.globalSliceStart(getClass().getName(),61732);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ipzvqi1bms();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11bke1bkelc8azxog.R.rethrow($CLV_t2$);}finally{__CLR4_4_11bke1bkelc8azxog.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatter.testParsePeriod_simple",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),61732,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ipzvqi1bms(){try{__CLR4_4_11bke1bkelc8azxog.R.inc(61732);
        __CLR4_4_11bke1bkelc8azxog.R.inc(61733);Period expect = new Period(1, 2, 3, 4, 5, 6, 7, 8);
        __CLR4_4_11bke1bkelc8azxog.R.inc(61734);assertEquals(expect, f.parsePeriod("P1Y2M3W4DT5H6M7.008S"));
        
        __CLR4_4_11bke1bkelc8azxog.R.inc(61735);try {
            __CLR4_4_11bke1bkelc8azxog.R.inc(61736);f.parsePeriod("ABC");
            __CLR4_4_11bke1bkelc8azxog.R.inc(61737);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_11bke1bkelc8azxog.R.flushNeeded();}}

    public void testParsePeriod_parseType() {__CLR4_4_11bke1bkelc8azxog.R.globalSliceStart(getClass().getName(),61738);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yw999z1bmy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11bke1bkelc8azxog.R.rethrow($CLV_t2$);}finally{__CLR4_4_11bke1bkelc8azxog.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatter.testParsePeriod_parseType",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),61738,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yw999z1bmy(){try{__CLR4_4_11bke1bkelc8azxog.R.inc(61738);
        __CLR4_4_11bke1bkelc8azxog.R.inc(61739);Period expect = new Period(0, 0, 0, 4, 5, 6, 7, 8, PeriodType.dayTime());
        __CLR4_4_11bke1bkelc8azxog.R.inc(61740);assertEquals(expect, f.withParseType(PeriodType.dayTime()).parsePeriod("P4DT5H6M7.008S"));
        __CLR4_4_11bke1bkelc8azxog.R.inc(61741);try {
            __CLR4_4_11bke1bkelc8azxog.R.inc(61742);f.withParseType(PeriodType.dayTime()).parsePeriod("P3W4DT5H6M7.008S");
            __CLR4_4_11bke1bkelc8azxog.R.inc(61743);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_11bke1bkelc8azxog.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testParseMutablePeriod_simple() {__CLR4_4_11bke1bkelc8azxog.R.globalSliceStart(getClass().getName(),61744);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1crtn21bn4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11bke1bkelc8azxog.R.rethrow($CLV_t2$);}finally{__CLR4_4_11bke1bkelc8azxog.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatter.testParseMutablePeriod_simple",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),61744,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1crtn21bn4(){try{__CLR4_4_11bke1bkelc8azxog.R.inc(61744);
        __CLR4_4_11bke1bkelc8azxog.R.inc(61745);MutablePeriod expect = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        __CLR4_4_11bke1bkelc8azxog.R.inc(61746);assertEquals(expect, f.parseMutablePeriod("P1Y2M3W4DT5H6M7.008S"));
        
        __CLR4_4_11bke1bkelc8azxog.R.inc(61747);try {
            __CLR4_4_11bke1bkelc8azxog.R.inc(61748);f.parseMutablePeriod("ABC");
            __CLR4_4_11bke1bkelc8azxog.R.inc(61749);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_11bke1bkelc8azxog.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testParseInto_simple() {__CLR4_4_11bke1bkelc8azxog.R.globalSliceStart(getClass().getName(),61750);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1of64s71bna();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11bke1bkelc8azxog.R.rethrow($CLV_t2$);}finally{__CLR4_4_11bke1bkelc8azxog.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatter.testParseInto_simple",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),61750,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1of64s71bna(){try{__CLR4_4_11bke1bkelc8azxog.R.inc(61750);
        __CLR4_4_11bke1bkelc8azxog.R.inc(61751);MutablePeriod expect = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        __CLR4_4_11bke1bkelc8azxog.R.inc(61752);MutablePeriod result = new MutablePeriod();
        __CLR4_4_11bke1bkelc8azxog.R.inc(61753);assertEquals(20, f.parseInto(result, "P1Y2M3W4DT5H6M7.008S", 0));
        __CLR4_4_11bke1bkelc8azxog.R.inc(61754);assertEquals(expect, result);
        
        __CLR4_4_11bke1bkelc8azxog.R.inc(61755);try {
            __CLR4_4_11bke1bkelc8azxog.R.inc(61756);f.parseInto(null, "P1Y2M3W4DT5H6M7.008S", 0);
            __CLR4_4_11bke1bkelc8azxog.R.inc(61757);fail();
        } catch (IllegalArgumentException ex) {}
        
        __CLR4_4_11bke1bkelc8azxog.R.inc(61758);assertEquals(~0, f.parseInto(result, "ABC", 0));
    }finally{__CLR4_4_11bke1bkelc8azxog.R.flushNeeded();}}

}
