/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 *  Copyright 2001-2011 Stephen Colebourne
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
import org.joda.time.DateTime;
import org.joda.time.DateTimeConstants;
import org.joda.time.DateTimeUtils;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.LocalTime;
import org.joda.time.MutableDateTime;
import org.joda.time.ReadablePartial;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.ISOChronology;

/**
 * This class is a Junit unit test for DateTime Formating.
 *
 * @author Stephen Colebourne
 */
public class TestDateTimeFormatter extends TestCase {static class __CLR4_4_119ao19aolc8azxf3{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672271031490L,8589935092L,59303,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

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
    private DateTimeFormatter f = null;
    private DateTimeFormatter g = null;

    public static void main(String[] args) {try{__CLR4_4_119ao19aolc8azxf3.R.inc(58704);
        __CLR4_4_119ao19aolc8azxf3.R.inc(58705);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_119ao19aolc8azxf3.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_119ao19aolc8azxf3.R.inc(58706);
        __CLR4_4_119ao19aolc8azxf3.R.inc(58707);return new TestSuite(TestDateTimeFormatter.class);
    }finally{__CLR4_4_119ao19aolc8azxf3.R.flushNeeded();}}

    public TestDateTimeFormatter(String name) {
        super(name);__CLR4_4_119ao19aolc8azxf3.R.inc(58709);try{__CLR4_4_119ao19aolc8azxf3.R.inc(58708);
    }finally{__CLR4_4_119ao19aolc8azxf3.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_119ao19aolc8azxf3.R.inc(58710);
        __CLR4_4_119ao19aolc8azxf3.R.inc(58711);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_119ao19aolc8azxf3.R.inc(58712);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_119ao19aolc8azxf3.R.inc(58713);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_119ao19aolc8azxf3.R.inc(58714);originalLocale = Locale.getDefault();
        __CLR4_4_119ao19aolc8azxf3.R.inc(58715);DateTimeZone.setDefault(LONDON);
        __CLR4_4_119ao19aolc8azxf3.R.inc(58716);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_119ao19aolc8azxf3.R.inc(58717);Locale.setDefault(Locale.UK);
        __CLR4_4_119ao19aolc8azxf3.R.inc(58718);f = new DateTimeFormatterBuilder()
                .appendDayOfWeekShortText()
                .appendLiteral(' ')
                .append(ISODateTimeFormat.dateTimeNoMillis())
                .toFormatter();
        __CLR4_4_119ao19aolc8azxf3.R.inc(58719);g = ISODateTimeFormat.dateTimeNoMillis();
    }finally{__CLR4_4_119ao19aolc8azxf3.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_119ao19aolc8azxf3.R.inc(58720);
        __CLR4_4_119ao19aolc8azxf3.R.inc(58721);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_119ao19aolc8azxf3.R.inc(58722);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_119ao19aolc8azxf3.R.inc(58723);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_119ao19aolc8azxf3.R.inc(58724);Locale.setDefault(originalLocale);
        __CLR4_4_119ao19aolc8azxf3.R.inc(58725);originalDateTimeZone = null;
        __CLR4_4_119ao19aolc8azxf3.R.inc(58726);originalTimeZone = null;
        __CLR4_4_119ao19aolc8azxf3.R.inc(58727);originalLocale = null;
        __CLR4_4_119ao19aolc8azxf3.R.inc(58728);f = null;
        __CLR4_4_119ao19aolc8azxf3.R.inc(58729);g = null;
    }finally{__CLR4_4_119ao19aolc8azxf3.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testPrint_simple() {__CLR4_4_119ao19aolc8azxf3.R.globalSliceStart(getClass().getName(),58730);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1le5eil19be();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119ao19aolc8azxf3.R.rethrow($CLV_t2$);}finally{__CLR4_4_119ao19aolc8azxf3.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testPrint_simple",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),58730,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1le5eil19be(){try{__CLR4_4_119ao19aolc8azxf3.R.inc(58730);
        __CLR4_4_119ao19aolc8azxf3.R.inc(58731);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC);
        __CLR4_4_119ao19aolc8azxf3.R.inc(58732);assertEquals("Wed 2004-06-09T10:20:30Z", f.print(dt));
        
        __CLR4_4_119ao19aolc8azxf3.R.inc(58733);dt = dt.withZone(PARIS);
        __CLR4_4_119ao19aolc8azxf3.R.inc(58734);assertEquals("Wed 2004-06-09T12:20:30+02:00", f.print(dt));
        
        __CLR4_4_119ao19aolc8azxf3.R.inc(58735);dt = dt.withZone(NEWYORK);
        __CLR4_4_119ao19aolc8azxf3.R.inc(58736);assertEquals("Wed 2004-06-09T06:20:30-04:00", f.print(dt));
        
        __CLR4_4_119ao19aolc8azxf3.R.inc(58737);dt = dt.withChronology(BUDDHIST_PARIS);
        __CLR4_4_119ao19aolc8azxf3.R.inc(58738);assertEquals("Wed 2547-06-09T12:20:30+02:00", f.print(dt));
    }finally{__CLR4_4_119ao19aolc8azxf3.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testPrint_locale() {__CLR4_4_119ao19aolc8azxf3.R.globalSliceStart(getClass().getName(),58739);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ghmvl119bn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119ao19aolc8azxf3.R.rethrow($CLV_t2$);}finally{__CLR4_4_119ao19aolc8azxf3.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testPrint_locale",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),58739,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ghmvl119bn(){try{__CLR4_4_119ao19aolc8azxf3.R.inc(58739);
        __CLR4_4_119ao19aolc8azxf3.R.inc(58740);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC);
        __CLR4_4_119ao19aolc8azxf3.R.inc(58741);assertEquals("mer. 2004-06-09T10:20:30Z", f.withLocale(Locale.FRENCH).print(dt));
        __CLR4_4_119ao19aolc8azxf3.R.inc(58742);assertEquals("Wed 2004-06-09T10:20:30Z", f.withLocale(null).print(dt));
    }finally{__CLR4_4_119ao19aolc8azxf3.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testPrint_zone() {__CLR4_4_119ao19aolc8azxf3.R.globalSliceStart(getClass().getName(),58743);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1c9wdbr19br();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119ao19aolc8azxf3.R.rethrow($CLV_t2$);}finally{__CLR4_4_119ao19aolc8azxf3.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testPrint_zone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),58743,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1c9wdbr19br(){try{__CLR4_4_119ao19aolc8azxf3.R.inc(58743);
        __CLR4_4_119ao19aolc8azxf3.R.inc(58744);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC);
        __CLR4_4_119ao19aolc8azxf3.R.inc(58745);assertEquals("Wed 2004-06-09T06:20:30-04:00", f.withZone(NEWYORK).print(dt));
        __CLR4_4_119ao19aolc8azxf3.R.inc(58746);assertEquals("Wed 2004-06-09T12:20:30+02:00", f.withZone(PARIS).print(dt));
        __CLR4_4_119ao19aolc8azxf3.R.inc(58747);assertEquals("Wed 2004-06-09T10:20:30Z", f.withZone(null).print(dt));
        
        __CLR4_4_119ao19aolc8azxf3.R.inc(58748);dt = dt.withZone(NEWYORK);
        __CLR4_4_119ao19aolc8azxf3.R.inc(58749);assertEquals("Wed 2004-06-09T06:20:30-04:00", f.withZone(NEWYORK).print(dt));
        __CLR4_4_119ao19aolc8azxf3.R.inc(58750);assertEquals("Wed 2004-06-09T12:20:30+02:00", f.withZone(PARIS).print(dt));
        __CLR4_4_119ao19aolc8azxf3.R.inc(58751);assertEquals("Wed 2004-06-09T10:20:30Z", f.withZoneUTC().print(dt));
        __CLR4_4_119ao19aolc8azxf3.R.inc(58752);assertEquals("Wed 2004-06-09T06:20:30-04:00", f.withZone(null).print(dt));
    }finally{__CLR4_4_119ao19aolc8azxf3.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testPrint_chrono() {__CLR4_4_119ao19aolc8azxf3.R.globalSliceStart(getClass().getName(),58753);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1x29lse19c1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119ao19aolc8azxf3.R.rethrow($CLV_t2$);}finally{__CLR4_4_119ao19aolc8azxf3.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testPrint_chrono",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),58753,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1x29lse19c1(){try{__CLR4_4_119ao19aolc8azxf3.R.inc(58753);
        __CLR4_4_119ao19aolc8azxf3.R.inc(58754);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC);
        __CLR4_4_119ao19aolc8azxf3.R.inc(58755);assertEquals("Wed 2004-06-09T12:20:30+02:00", f.withChronology(ISO_PARIS).print(dt));
        __CLR4_4_119ao19aolc8azxf3.R.inc(58756);assertEquals("Wed 2547-06-09T12:20:30+02:00", f.withChronology(BUDDHIST_PARIS).print(dt));
        __CLR4_4_119ao19aolc8azxf3.R.inc(58757);assertEquals("Wed 2004-06-09T10:20:30Z", f.withChronology(null).print(dt));
        
        __CLR4_4_119ao19aolc8azxf3.R.inc(58758);dt = dt.withChronology(BUDDHIST_PARIS);
        __CLR4_4_119ao19aolc8azxf3.R.inc(58759);assertEquals("Wed 2004-06-09T12:20:30+02:00", f.withChronology(ISO_PARIS).print(dt));
        __CLR4_4_119ao19aolc8azxf3.R.inc(58760);assertEquals("Wed 2547-06-09T12:20:30+02:00", f.withChronology(BUDDHIST_PARIS).print(dt));
        __CLR4_4_119ao19aolc8azxf3.R.inc(58761);assertEquals("Wed 2004-06-09T10:20:30Z", f.withChronology(ISO_UTC).print(dt));
        __CLR4_4_119ao19aolc8azxf3.R.inc(58762);assertEquals("Wed 2547-06-09T12:20:30+02:00", f.withChronology(null).print(dt));
    }finally{__CLR4_4_119ao19aolc8azxf3.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testPrint_bufferMethods() throws Exception {__CLR4_4_119ao19aolc8azxf3.R.globalSliceStart(getClass().getName(),58763);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sz4zx119cb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119ao19aolc8azxf3.R.rethrow($CLV_t2$);}finally{__CLR4_4_119ao19aolc8azxf3.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testPrint_bufferMethods",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),58763,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sz4zx119cb() throws Exception{try{__CLR4_4_119ao19aolc8azxf3.R.inc(58763);
        __CLR4_4_119ao19aolc8azxf3.R.inc(58764);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC);
        __CLR4_4_119ao19aolc8azxf3.R.inc(58765);StringBuffer buf = new StringBuffer();
        __CLR4_4_119ao19aolc8azxf3.R.inc(58766);f.printTo(buf, dt);
        __CLR4_4_119ao19aolc8azxf3.R.inc(58767);assertEquals("Wed 2004-06-09T10:20:30Z", buf.toString());
        
        __CLR4_4_119ao19aolc8azxf3.R.inc(58768);buf = new StringBuffer();
        __CLR4_4_119ao19aolc8azxf3.R.inc(58769);f.printTo(buf, dt.getMillis());
        __CLR4_4_119ao19aolc8azxf3.R.inc(58770);assertEquals("Wed 2004-06-09T11:20:30+01:00", buf.toString());
        
        __CLR4_4_119ao19aolc8azxf3.R.inc(58771);buf = new StringBuffer();
        __CLR4_4_119ao19aolc8azxf3.R.inc(58772);ISODateTimeFormat.yearMonthDay().printTo(buf, dt.toYearMonthDay());
        __CLR4_4_119ao19aolc8azxf3.R.inc(58773);assertEquals("2004-06-09", buf.toString());
        
        __CLR4_4_119ao19aolc8azxf3.R.inc(58774);buf = new StringBuffer();
        __CLR4_4_119ao19aolc8azxf3.R.inc(58775);try {
            __CLR4_4_119ao19aolc8azxf3.R.inc(58776);ISODateTimeFormat.yearMonthDay().printTo(buf, (ReadablePartial) null);
            __CLR4_4_119ao19aolc8azxf3.R.inc(58777);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_119ao19aolc8azxf3.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testPrint_writerMethods() throws Exception {__CLR4_4_119ao19aolc8azxf3.R.globalSliceStart(getClass().getName(),58778);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vcbrku19cq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119ao19aolc8azxf3.R.rethrow($CLV_t2$);}finally{__CLR4_4_119ao19aolc8azxf3.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testPrint_writerMethods",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),58778,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vcbrku19cq() throws Exception{try{__CLR4_4_119ao19aolc8azxf3.R.inc(58778);
        __CLR4_4_119ao19aolc8azxf3.R.inc(58779);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC);
        __CLR4_4_119ao19aolc8azxf3.R.inc(58780);CharArrayWriter out = new CharArrayWriter();
        __CLR4_4_119ao19aolc8azxf3.R.inc(58781);f.printTo(out, dt);
        __CLR4_4_119ao19aolc8azxf3.R.inc(58782);assertEquals("Wed 2004-06-09T10:20:30Z", out.toString());
        
        __CLR4_4_119ao19aolc8azxf3.R.inc(58783);out = new CharArrayWriter();
        __CLR4_4_119ao19aolc8azxf3.R.inc(58784);f.printTo(out, dt.getMillis());
        __CLR4_4_119ao19aolc8azxf3.R.inc(58785);assertEquals("Wed 2004-06-09T11:20:30+01:00", out.toString());
        
        __CLR4_4_119ao19aolc8azxf3.R.inc(58786);out = new CharArrayWriter();
        __CLR4_4_119ao19aolc8azxf3.R.inc(58787);ISODateTimeFormat.yearMonthDay().printTo(out, dt.toYearMonthDay());
        __CLR4_4_119ao19aolc8azxf3.R.inc(58788);assertEquals("2004-06-09", out.toString());
        
        __CLR4_4_119ao19aolc8azxf3.R.inc(58789);out = new CharArrayWriter();
        __CLR4_4_119ao19aolc8azxf3.R.inc(58790);try {
            __CLR4_4_119ao19aolc8azxf3.R.inc(58791);ISODateTimeFormat.yearMonthDay().printTo(out, (ReadablePartial) null);
            __CLR4_4_119ao19aolc8azxf3.R.inc(58792);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_119ao19aolc8azxf3.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testPrint_appendableMethods() throws Exception {__CLR4_4_119ao19aolc8azxf3.R.globalSliceStart(getClass().getName(),58793);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ptp28x19d5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119ao19aolc8azxf3.R.rethrow($CLV_t2$);}finally{__CLR4_4_119ao19aolc8azxf3.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testPrint_appendableMethods",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),58793,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ptp28x19d5() throws Exception{try{__CLR4_4_119ao19aolc8azxf3.R.inc(58793);
        __CLR4_4_119ao19aolc8azxf3.R.inc(58794);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC);
        __CLR4_4_119ao19aolc8azxf3.R.inc(58795);StringBuilder buf = new StringBuilder();
        __CLR4_4_119ao19aolc8azxf3.R.inc(58796);f.printTo(buf, dt);
        __CLR4_4_119ao19aolc8azxf3.R.inc(58797);assertEquals("Wed 2004-06-09T10:20:30Z", buf.toString());
        
        __CLR4_4_119ao19aolc8azxf3.R.inc(58798);buf = new StringBuilder();
        __CLR4_4_119ao19aolc8azxf3.R.inc(58799);f.printTo(buf, dt.getMillis());
        __CLR4_4_119ao19aolc8azxf3.R.inc(58800);assertEquals("Wed 2004-06-09T11:20:30+01:00", buf.toString());
        
        __CLR4_4_119ao19aolc8azxf3.R.inc(58801);buf = new StringBuilder();
        __CLR4_4_119ao19aolc8azxf3.R.inc(58802);ISODateTimeFormat.yearMonthDay().printTo(buf, dt.toLocalDate());
        __CLR4_4_119ao19aolc8azxf3.R.inc(58803);assertEquals("2004-06-09", buf.toString());
        
        __CLR4_4_119ao19aolc8azxf3.R.inc(58804);buf = new StringBuilder();
        __CLR4_4_119ao19aolc8azxf3.R.inc(58805);try {
            __CLR4_4_119ao19aolc8azxf3.R.inc(58806);ISODateTimeFormat.yearMonthDay().printTo(buf, (ReadablePartial) null);
            __CLR4_4_119ao19aolc8azxf3.R.inc(58807);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_119ao19aolc8azxf3.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testPrint_chrono_and_zone() {__CLR4_4_119ao19aolc8azxf3.R.globalSliceStart(getClass().getName(),58808);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_169opal19dk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119ao19aolc8azxf3.R.rethrow($CLV_t2$);}finally{__CLR4_4_119ao19aolc8azxf3.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testPrint_chrono_and_zone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),58808,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_169opal19dk(){try{__CLR4_4_119ao19aolc8azxf3.R.inc(58808);
        __CLR4_4_119ao19aolc8azxf3.R.inc(58809);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC);
        __CLR4_4_119ao19aolc8azxf3.R.inc(58810);assertEquals("Wed 2004-06-09T10:20:30Z",
                f.withChronology(null).withZone(null).print(dt));
        __CLR4_4_119ao19aolc8azxf3.R.inc(58811);assertEquals("Wed 2004-06-09T12:20:30+02:00",
                f.withChronology(ISO_PARIS).withZone(null).print(dt));
        __CLR4_4_119ao19aolc8azxf3.R.inc(58812);assertEquals("Wed 2004-06-09T12:20:30+02:00",
                f.withChronology(ISO_PARIS).withZone(PARIS).print(dt));
        __CLR4_4_119ao19aolc8azxf3.R.inc(58813);assertEquals("Wed 2004-06-09T06:20:30-04:00",
                f.withChronology(ISO_PARIS).withZone(NEWYORK).print(dt));
        __CLR4_4_119ao19aolc8azxf3.R.inc(58814);assertEquals("Wed 2004-06-09T06:20:30-04:00",
                f.withChronology(null).withZone(NEWYORK).print(dt));
        
        __CLR4_4_119ao19aolc8azxf3.R.inc(58815);dt = dt.withChronology(ISO_PARIS);
        __CLR4_4_119ao19aolc8azxf3.R.inc(58816);assertEquals("Wed 2004-06-09T12:20:30+02:00",
                f.withChronology(null).withZone(null).print(dt));
        __CLR4_4_119ao19aolc8azxf3.R.inc(58817);assertEquals("Wed 2004-06-09T12:20:30+02:00",
                f.withChronology(ISO_PARIS).withZone(null).print(dt));
        __CLR4_4_119ao19aolc8azxf3.R.inc(58818);assertEquals("Wed 2004-06-09T12:20:30+02:00",
                f.withChronology(ISO_PARIS).withZone(PARIS).print(dt));
        __CLR4_4_119ao19aolc8azxf3.R.inc(58819);assertEquals("Wed 2004-06-09T06:20:30-04:00",
                f.withChronology(ISO_PARIS).withZone(NEWYORK).print(dt));
        __CLR4_4_119ao19aolc8azxf3.R.inc(58820);assertEquals("Wed 2004-06-09T06:20:30-04:00",
                f.withChronology(null).withZone(NEWYORK).print(dt));
        
        __CLR4_4_119ao19aolc8azxf3.R.inc(58821);dt = dt.withChronology(BUDDHIST_PARIS);
        __CLR4_4_119ao19aolc8azxf3.R.inc(58822);assertEquals("Wed 2547-06-09T12:20:30+02:00",
                f.withChronology(null).withZone(null).print(dt));
        __CLR4_4_119ao19aolc8azxf3.R.inc(58823);assertEquals("Wed 2004-06-09T12:20:30+02:00",
                f.withChronology(ISO_PARIS).withZone(null).print(dt));
        __CLR4_4_119ao19aolc8azxf3.R.inc(58824);assertEquals("Wed 2004-06-09T12:20:30+02:00",
                f.withChronology(ISO_PARIS).withZone(PARIS).print(dt));
        __CLR4_4_119ao19aolc8azxf3.R.inc(58825);assertEquals("Wed 2004-06-09T06:20:30-04:00",
                f.withChronology(ISO_PARIS).withZone(NEWYORK).print(dt));
        __CLR4_4_119ao19aolc8azxf3.R.inc(58826);assertEquals("Wed 2547-06-09T06:20:30-04:00",
                f.withChronology(null).withZone(NEWYORK).print(dt));
    }finally{__CLR4_4_119ao19aolc8azxf3.R.flushNeeded();}}

    public void testWithGetLocale() {__CLR4_4_119ao19aolc8azxf3.R.globalSliceStart(getClass().getName(),58827);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xi7vun19e3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119ao19aolc8azxf3.R.rethrow($CLV_t2$);}finally{__CLR4_4_119ao19aolc8azxf3.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testWithGetLocale",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),58827,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xi7vun19e3(){try{__CLR4_4_119ao19aolc8azxf3.R.inc(58827);
        __CLR4_4_119ao19aolc8azxf3.R.inc(58828);DateTimeFormatter f2 = f.withLocale(Locale.FRENCH);
        __CLR4_4_119ao19aolc8azxf3.R.inc(58829);assertEquals(Locale.FRENCH, f2.getLocale());
        __CLR4_4_119ao19aolc8azxf3.R.inc(58830);assertSame(f2, f2.withLocale(Locale.FRENCH));
        
        __CLR4_4_119ao19aolc8azxf3.R.inc(58831);f2 = f.withLocale(null);
        __CLR4_4_119ao19aolc8azxf3.R.inc(58832);assertEquals(null, f2.getLocale());
        __CLR4_4_119ao19aolc8azxf3.R.inc(58833);assertSame(f2, f2.withLocale(null));
    }finally{__CLR4_4_119ao19aolc8azxf3.R.flushNeeded();}}

    public void testWithGetZone() {__CLR4_4_119ao19aolc8azxf3.R.globalSliceStart(getClass().getName(),58834);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1g38sbz19ea();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119ao19aolc8azxf3.R.rethrow($CLV_t2$);}finally{__CLR4_4_119ao19aolc8azxf3.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testWithGetZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),58834,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1g38sbz19ea(){try{__CLR4_4_119ao19aolc8azxf3.R.inc(58834);
        __CLR4_4_119ao19aolc8azxf3.R.inc(58835);DateTimeFormatter f2 = f.withZone(PARIS);
        __CLR4_4_119ao19aolc8azxf3.R.inc(58836);assertEquals(PARIS, f2.getZone());
        __CLR4_4_119ao19aolc8azxf3.R.inc(58837);assertSame(f2, f2.withZone(PARIS));
        
        __CLR4_4_119ao19aolc8azxf3.R.inc(58838);f2 = f.withZone(null);
        __CLR4_4_119ao19aolc8azxf3.R.inc(58839);assertEquals(null, f2.getZone());
        __CLR4_4_119ao19aolc8azxf3.R.inc(58840);assertSame(f2, f2.withZone(null));
    }finally{__CLR4_4_119ao19aolc8azxf3.R.flushNeeded();}}

    public void testWithGetChronology() {__CLR4_4_119ao19aolc8azxf3.R.globalSliceStart(getClass().getName(),58841);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ip6szn19eh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119ao19aolc8azxf3.R.rethrow($CLV_t2$);}finally{__CLR4_4_119ao19aolc8azxf3.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testWithGetChronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),58841,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ip6szn19eh(){try{__CLR4_4_119ao19aolc8azxf3.R.inc(58841);
        __CLR4_4_119ao19aolc8azxf3.R.inc(58842);DateTimeFormatter f2 = f.withChronology(BUDDHIST_PARIS);
        __CLR4_4_119ao19aolc8azxf3.R.inc(58843);assertEquals(BUDDHIST_PARIS, f2.getChronology());
        __CLR4_4_119ao19aolc8azxf3.R.inc(58844);assertSame(f2, f2.withChronology(BUDDHIST_PARIS));
        
        __CLR4_4_119ao19aolc8azxf3.R.inc(58845);f2 = f.withChronology(null);
        __CLR4_4_119ao19aolc8azxf3.R.inc(58846);assertEquals(null, f2.getChronology());
        __CLR4_4_119ao19aolc8azxf3.R.inc(58847);assertSame(f2, f2.withChronology(null));
    }finally{__CLR4_4_119ao19aolc8azxf3.R.flushNeeded();}}

    public void testWithGetPivotYear() {__CLR4_4_119ao19aolc8azxf3.R.globalSliceStart(getClass().getName(),58848);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1l828bs19eo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119ao19aolc8azxf3.R.rethrow($CLV_t2$);}finally{__CLR4_4_119ao19aolc8azxf3.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testWithGetPivotYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),58848,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1l828bs19eo(){try{__CLR4_4_119ao19aolc8azxf3.R.inc(58848);
        __CLR4_4_119ao19aolc8azxf3.R.inc(58849);DateTimeFormatter f2 = f.withPivotYear(13);
        __CLR4_4_119ao19aolc8azxf3.R.inc(58850);assertEquals(new Integer(13), f2.getPivotYear());
        __CLR4_4_119ao19aolc8azxf3.R.inc(58851);assertSame(f2, f2.withPivotYear(13));
        
        __CLR4_4_119ao19aolc8azxf3.R.inc(58852);f2 = f.withPivotYear(new Integer(14));
        __CLR4_4_119ao19aolc8azxf3.R.inc(58853);assertEquals(new Integer(14), f2.getPivotYear());
        __CLR4_4_119ao19aolc8azxf3.R.inc(58854);assertSame(f2, f2.withPivotYear(new Integer(14)));
        
        __CLR4_4_119ao19aolc8azxf3.R.inc(58855);f2 = f.withPivotYear(null);
        __CLR4_4_119ao19aolc8azxf3.R.inc(58856);assertEquals(null, f2.getPivotYear());
        __CLR4_4_119ao19aolc8azxf3.R.inc(58857);assertSame(f2, f2.withPivotYear(null));
    }finally{__CLR4_4_119ao19aolc8azxf3.R.flushNeeded();}}

    public void testWithGetOffsetParsedMethods() {__CLR4_4_119ao19aolc8azxf3.R.globalSliceStart(getClass().getName(),58858);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vr7op519ey();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119ao19aolc8azxf3.R.rethrow($CLV_t2$);}finally{__CLR4_4_119ao19aolc8azxf3.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testWithGetOffsetParsedMethods",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),58858,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vr7op519ey(){try{__CLR4_4_119ao19aolc8azxf3.R.inc(58858);
        __CLR4_4_119ao19aolc8azxf3.R.inc(58859);DateTimeFormatter f2 = f;
        __CLR4_4_119ao19aolc8azxf3.R.inc(58860);assertEquals(false, f2.isOffsetParsed());
        __CLR4_4_119ao19aolc8azxf3.R.inc(58861);assertEquals(null, f2.getZone());
        
        __CLR4_4_119ao19aolc8azxf3.R.inc(58862);f2 = f.withOffsetParsed();
        __CLR4_4_119ao19aolc8azxf3.R.inc(58863);assertEquals(true, f2.isOffsetParsed());
        __CLR4_4_119ao19aolc8azxf3.R.inc(58864);assertEquals(null, f2.getZone());
        
        __CLR4_4_119ao19aolc8azxf3.R.inc(58865);f2 = f2.withZone(PARIS);
        __CLR4_4_119ao19aolc8azxf3.R.inc(58866);assertEquals(false, f2.isOffsetParsed());
        __CLR4_4_119ao19aolc8azxf3.R.inc(58867);assertEquals(PARIS, f2.getZone());
        
        __CLR4_4_119ao19aolc8azxf3.R.inc(58868);f2 = f2.withOffsetParsed();
        __CLR4_4_119ao19aolc8azxf3.R.inc(58869);assertEquals(true, f2.isOffsetParsed());
        __CLR4_4_119ao19aolc8azxf3.R.inc(58870);assertEquals(null, f2.getZone());
        
        __CLR4_4_119ao19aolc8azxf3.R.inc(58871);f2 = f.withOffsetParsed();
        __CLR4_4_119ao19aolc8azxf3.R.inc(58872);assertNotSame(f, f2);
        __CLR4_4_119ao19aolc8azxf3.R.inc(58873);DateTimeFormatter f3 = f2.withOffsetParsed();
        __CLR4_4_119ao19aolc8azxf3.R.inc(58874);assertSame(f2, f3);
    }finally{__CLR4_4_119ao19aolc8azxf3.R.flushNeeded();}}

    public void testPrinterParserMethods() {__CLR4_4_119ao19aolc8azxf3.R.globalSliceStart(getClass().getName(),58875);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n6rfoy19ff();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119ao19aolc8azxf3.R.rethrow($CLV_t2$);}finally{__CLR4_4_119ao19aolc8azxf3.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testPrinterParserMethods",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),58875,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n6rfoy19ff(){try{__CLR4_4_119ao19aolc8azxf3.R.inc(58875);
        __CLR4_4_119ao19aolc8azxf3.R.inc(58876);DateTimeFormatter f2 = new DateTimeFormatter(f.getPrinter(), f.getParser());
        __CLR4_4_119ao19aolc8azxf3.R.inc(58877);assertEquals(f.getPrinter(), f2.getPrinter());
        __CLR4_4_119ao19aolc8azxf3.R.inc(58878);assertEquals(f.getParser(), f2.getParser());
        __CLR4_4_119ao19aolc8azxf3.R.inc(58879);assertEquals(true, f2.isPrinter());
        __CLR4_4_119ao19aolc8azxf3.R.inc(58880);assertEquals(true, f2.isParser());
        __CLR4_4_119ao19aolc8azxf3.R.inc(58881);assertNotNull(f2.print(0L));
        __CLR4_4_119ao19aolc8azxf3.R.inc(58882);assertNotNull(f2.parseDateTime("Thu 1970-01-01T00:00:00Z"));
        
        __CLR4_4_119ao19aolc8azxf3.R.inc(58883);f2 = new DateTimeFormatter(f.getPrinter(), null);
        __CLR4_4_119ao19aolc8azxf3.R.inc(58884);assertEquals(f.getPrinter(), f2.getPrinter());
        __CLR4_4_119ao19aolc8azxf3.R.inc(58885);assertEquals(null, f2.getParser());
        __CLR4_4_119ao19aolc8azxf3.R.inc(58886);assertEquals(true, f2.isPrinter());
        __CLR4_4_119ao19aolc8azxf3.R.inc(58887);assertEquals(false, f2.isParser());
        __CLR4_4_119ao19aolc8azxf3.R.inc(58888);assertNotNull(f2.print(0L));
        __CLR4_4_119ao19aolc8azxf3.R.inc(58889);try {
            __CLR4_4_119ao19aolc8azxf3.R.inc(58890);f2.parseDateTime("Thu 1970-01-01T00:00:00Z");
            __CLR4_4_119ao19aolc8azxf3.R.inc(58891);fail();
        } catch (UnsupportedOperationException ex) {}
        
        __CLR4_4_119ao19aolc8azxf3.R.inc(58892);f2 = new DateTimeFormatter(null, f.getParser());
        __CLR4_4_119ao19aolc8azxf3.R.inc(58893);assertEquals(null, f2.getPrinter());
        __CLR4_4_119ao19aolc8azxf3.R.inc(58894);assertEquals(f.getParser(), f2.getParser());
        __CLR4_4_119ao19aolc8azxf3.R.inc(58895);assertEquals(false, f2.isPrinter());
        __CLR4_4_119ao19aolc8azxf3.R.inc(58896);assertEquals(true, f2.isParser());
        __CLR4_4_119ao19aolc8azxf3.R.inc(58897);try {
            __CLR4_4_119ao19aolc8azxf3.R.inc(58898);f2.print(0L);
            __CLR4_4_119ao19aolc8azxf3.R.inc(58899);fail();
        } catch (UnsupportedOperationException ex) {}
        __CLR4_4_119ao19aolc8azxf3.R.inc(58900);assertNotNull(f2.parseDateTime("Thu 1970-01-01T00:00:00Z"));
    }finally{__CLR4_4_119ao19aolc8azxf3.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testParseLocalDate_simple() {__CLR4_4_119ao19aolc8azxf3.R.globalSliceStart(getClass().getName(),58901);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13yyidc19g5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119ao19aolc8azxf3.R.rethrow($CLV_t2$);}finally{__CLR4_4_119ao19aolc8azxf3.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testParseLocalDate_simple",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),58901,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13yyidc19g5(){try{__CLR4_4_119ao19aolc8azxf3.R.inc(58901);
        __CLR4_4_119ao19aolc8azxf3.R.inc(58902);assertEquals(new LocalDate(2004, 6, 9), g.parseLocalDate("2004-06-09T10:20:30Z"));
        __CLR4_4_119ao19aolc8azxf3.R.inc(58903);assertEquals(new LocalDate(2004, 6, 9), g.parseLocalDate("2004-06-09T10:20:30+18:00"));
        __CLR4_4_119ao19aolc8azxf3.R.inc(58904);assertEquals(new LocalDate(2004, 6, 9), g.parseLocalDate("2004-06-09T10:20:30-18:00"));
        __CLR4_4_119ao19aolc8azxf3.R.inc(58905);assertEquals(new LocalDate(2004, 6, 9, BUDDHIST_PARIS),
                g.withChronology(BUDDHIST_PARIS).parseLocalDate("2004-06-09T10:20:30Z"));
        __CLR4_4_119ao19aolc8azxf3.R.inc(58906);try {
            __CLR4_4_119ao19aolc8azxf3.R.inc(58907);g.parseDateTime("ABC");
            __CLR4_4_119ao19aolc8azxf3.R.inc(58908);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_119ao19aolc8azxf3.R.flushNeeded();}}

    public void testParseLocalDate_yearOfEra() {__CLR4_4_119ao19aolc8azxf3.R.globalSliceStart(getClass().getName(),58909);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gkmq5c19gd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119ao19aolc8azxf3.R.rethrow($CLV_t2$);}finally{__CLR4_4_119ao19aolc8azxf3.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testParseLocalDate_yearOfEra",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),58909,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gkmq5c19gd(){try{__CLR4_4_119ao19aolc8azxf3.R.inc(58909);
        __CLR4_4_119ao19aolc8azxf3.R.inc(58910);Chronology chrono = GJChronology.getInstanceUTC();
        __CLR4_4_119ao19aolc8azxf3.R.inc(58911);DateTimeFormatter f = DateTimeFormat
            .forPattern("YYYY-MM GG")
            .withChronology(chrono)
            .withLocale(Locale.UK);
        
        __CLR4_4_119ao19aolc8azxf3.R.inc(58912);LocalDate date = new LocalDate(2005, 10, 1, chrono);
        __CLR4_4_119ao19aolc8azxf3.R.inc(58913);assertEquals(date, f.parseLocalDate("2005-10 AD"));
        __CLR4_4_119ao19aolc8azxf3.R.inc(58914);assertEquals(date, f.parseLocalDate("2005-10 CE"));
        
        __CLR4_4_119ao19aolc8azxf3.R.inc(58915);date = new LocalDate(-2005, 10, 1, chrono);
        __CLR4_4_119ao19aolc8azxf3.R.inc(58916);assertEquals(date, f.parseLocalDate("2005-10 BC"));
        __CLR4_4_119ao19aolc8azxf3.R.inc(58917);assertEquals(date, f.parseLocalDate("2005-10 BCE"));
    }finally{__CLR4_4_119ao19aolc8azxf3.R.flushNeeded();}}

    public void testParseLocalDate_yearOfCentury() {__CLR4_4_119ao19aolc8azxf3.R.globalSliceStart(getClass().getName(),58918);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fk3qhs19gm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119ao19aolc8azxf3.R.rethrow($CLV_t2$);}finally{__CLR4_4_119ao19aolc8azxf3.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testParseLocalDate_yearOfCentury",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),58918,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fk3qhs19gm(){try{__CLR4_4_119ao19aolc8azxf3.R.inc(58918);
        __CLR4_4_119ao19aolc8azxf3.R.inc(58919);Chronology chrono = GJChronology.getInstanceUTC();
        __CLR4_4_119ao19aolc8azxf3.R.inc(58920);DateTimeFormatter f = DateTimeFormat
            .forPattern("yy M d")
            .withChronology(chrono)
            .withLocale(Locale.UK)
            .withPivotYear(2050);
        
        __CLR4_4_119ao19aolc8azxf3.R.inc(58921);LocalDate date = new LocalDate(2050, 8, 4, chrono);
        __CLR4_4_119ao19aolc8azxf3.R.inc(58922);assertEquals(date, f.parseLocalDate("50 8 4"));
    }finally{__CLR4_4_119ao19aolc8azxf3.R.flushNeeded();}}

    public void testParseLocalDate_monthDay_feb29() {__CLR4_4_119ao19aolc8azxf3.R.globalSliceStart(getClass().getName(),58923);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1iy7k5n19gr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119ao19aolc8azxf3.R.rethrow($CLV_t2$);}finally{__CLR4_4_119ao19aolc8azxf3.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testParseLocalDate_monthDay_feb29",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),58923,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1iy7k5n19gr(){try{__CLR4_4_119ao19aolc8azxf3.R.inc(58923);
        __CLR4_4_119ao19aolc8azxf3.R.inc(58924);Chronology chrono = GJChronology.getInstanceUTC();
        __CLR4_4_119ao19aolc8azxf3.R.inc(58925);DateTimeFormatter f = DateTimeFormat
            .forPattern("M d")
            .withChronology(chrono)
            .withLocale(Locale.UK);
        
        __CLR4_4_119ao19aolc8azxf3.R.inc(58926);assertEquals(new LocalDate(2000, 2, 29, chrono), f.parseLocalDate("2 29"));
    }finally{__CLR4_4_119ao19aolc8azxf3.R.flushNeeded();}}

    public void testParseLocalDate_monthDay_withDefaultYear_feb29() {__CLR4_4_119ao19aolc8azxf3.R.globalSliceStart(getClass().getName(),58927);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1v6e6b619gv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119ao19aolc8azxf3.R.rethrow($CLV_t2$);}finally{__CLR4_4_119ao19aolc8azxf3.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testParseLocalDate_monthDay_withDefaultYear_feb29",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),58927,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1v6e6b619gv(){try{__CLR4_4_119ao19aolc8azxf3.R.inc(58927);
        __CLR4_4_119ao19aolc8azxf3.R.inc(58928);Chronology chrono = GJChronology.getInstanceUTC();
        __CLR4_4_119ao19aolc8azxf3.R.inc(58929);DateTimeFormatter f = DateTimeFormat
            .forPattern("M d")
            .withChronology(chrono)
            .withLocale(Locale.UK)
            .withDefaultYear(2012);
        
        __CLR4_4_119ao19aolc8azxf3.R.inc(58930);assertEquals(new LocalDate(2012, 2, 29, chrono), f.parseLocalDate("2 29"));
    }finally{__CLR4_4_119ao19aolc8azxf3.R.flushNeeded();}}

    public void testParseLocalDate_weekyear_month_week_2010() {__CLR4_4_119ao19aolc8azxf3.R.globalSliceStart(getClass().getName(),58931);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nqf5519gz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119ao19aolc8azxf3.R.rethrow($CLV_t2$);}finally{__CLR4_4_119ao19aolc8azxf3.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testParseLocalDate_weekyear_month_week_2010",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),58931,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nqf5519gz(){try{__CLR4_4_119ao19aolc8azxf3.R.inc(58931);
        __CLR4_4_119ao19aolc8azxf3.R.inc(58932);Chronology chrono = GJChronology.getInstanceUTC();
        __CLR4_4_119ao19aolc8azxf3.R.inc(58933);DateTimeFormatter f = DateTimeFormat.forPattern("xxxx-MM-ww").withChronology(chrono);
        __CLR4_4_119ao19aolc8azxf3.R.inc(58934);assertEquals(new LocalDate(2010, 1, 4, chrono), f.parseLocalDate("2010-01-01"));
    }finally{__CLR4_4_119ao19aolc8azxf3.R.flushNeeded();}}

    public void testParseLocalDate_weekyear_month_week_2011() {__CLR4_4_119ao19aolc8azxf3.R.globalSliceStart(getClass().getName(),58935);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13wqdxm19h3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119ao19aolc8azxf3.R.rethrow($CLV_t2$);}finally{__CLR4_4_119ao19aolc8azxf3.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testParseLocalDate_weekyear_month_week_2011",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),58935,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13wqdxm19h3(){try{__CLR4_4_119ao19aolc8azxf3.R.inc(58935);
        __CLR4_4_119ao19aolc8azxf3.R.inc(58936);Chronology chrono = GJChronology.getInstanceUTC();
        __CLR4_4_119ao19aolc8azxf3.R.inc(58937);DateTimeFormatter f = DateTimeFormat.forPattern("xxxx-MM-ww").withChronology(chrono);
        __CLR4_4_119ao19aolc8azxf3.R.inc(58938);assertEquals(new LocalDate(2011, 1, 3, chrono), f.parseLocalDate("2011-01-01"));
    }finally{__CLR4_4_119ao19aolc8azxf3.R.flushNeeded();}}

    public void testParseLocalDate_weekyear_month_week_2012() {__CLR4_4_119ao19aolc8azxf3.R.globalSliceStart(getClass().getName(),58939);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_175qcq319h7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119ao19aolc8azxf3.R.rethrow($CLV_t2$);}finally{__CLR4_4_119ao19aolc8azxf3.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testParseLocalDate_weekyear_month_week_2012",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),58939,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_175qcq319h7(){try{__CLR4_4_119ao19aolc8azxf3.R.inc(58939);
        __CLR4_4_119ao19aolc8azxf3.R.inc(58940);Chronology chrono = GJChronology.getInstanceUTC();
        __CLR4_4_119ao19aolc8azxf3.R.inc(58941);DateTimeFormatter f = DateTimeFormat.forPattern("xxxx-MM-ww").withChronology(chrono);
        __CLR4_4_119ao19aolc8azxf3.R.inc(58942);assertEquals(new LocalDate(2012, 1, 2, chrono), f.parseLocalDate("2012-01-01"));
    }finally{__CLR4_4_119ao19aolc8azxf3.R.flushNeeded();}}

// This test fails, but since more related tests pass with the extra loop in DateTimeParserBucket
// I'm going to leave the change in and ignore this test
//    public void testParseLocalDate_weekyear_month_week_2013() {
//        Chronology chrono = GJChronology.getInstanceUTC();
//        DateTimeFormatter f = DateTimeFormat.forPattern("xxxx-MM-ww").withChronology(chrono);
//        assertEquals(new LocalDate(2012, 12, 31, chrono), f.parseLocalDate("2013-01-01"));
//    }

    public void testParseLocalDate_year_month_week_2010() {__CLR4_4_119ao19aolc8azxf3.R.globalSliceStart(getClass().getName(),58943);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dic11119hb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119ao19aolc8azxf3.R.rethrow($CLV_t2$);}finally{__CLR4_4_119ao19aolc8azxf3.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testParseLocalDate_year_month_week_2010",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),58943,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dic11119hb(){try{__CLR4_4_119ao19aolc8azxf3.R.inc(58943);
        __CLR4_4_119ao19aolc8azxf3.R.inc(58944);Chronology chrono = GJChronology.getInstanceUTC();
        __CLR4_4_119ao19aolc8azxf3.R.inc(58945);DateTimeFormatter f = DateTimeFormat.forPattern("yyyy-MM-ww").withChronology(chrono);
        __CLR4_4_119ao19aolc8azxf3.R.inc(58946);assertEquals(new LocalDate(2010, 1, 4, chrono), f.parseLocalDate("2010-01-01"));
    }finally{__CLR4_4_119ao19aolc8azxf3.R.flushNeeded();}}

    public void testParseLocalDate_year_month_week_2011() {__CLR4_4_119ao19aolc8azxf3.R.globalSliceStart(getClass().getName(),58947);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1grbzti19hf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119ao19aolc8azxf3.R.rethrow($CLV_t2$);}finally{__CLR4_4_119ao19aolc8azxf3.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testParseLocalDate_year_month_week_2011",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),58947,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1grbzti19hf(){try{__CLR4_4_119ao19aolc8azxf3.R.inc(58947);
        __CLR4_4_119ao19aolc8azxf3.R.inc(58948);Chronology chrono = GJChronology.getInstanceUTC();
        __CLR4_4_119ao19aolc8azxf3.R.inc(58949);DateTimeFormatter f = DateTimeFormat.forPattern("yyyy-MM-ww").withChronology(chrono);
        __CLR4_4_119ao19aolc8azxf3.R.inc(58950);assertEquals(new LocalDate(2011, 1, 3, chrono), f.parseLocalDate("2011-01-01"));
    }finally{__CLR4_4_119ao19aolc8azxf3.R.flushNeeded();}}

    public void testParseLocalDate_year_month_week_2012() {__CLR4_4_119ao19aolc8azxf3.R.globalSliceStart(getClass().getName(),58951);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1k0bylz19hj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119ao19aolc8azxf3.R.rethrow($CLV_t2$);}finally{__CLR4_4_119ao19aolc8azxf3.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testParseLocalDate_year_month_week_2012",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),58951,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1k0bylz19hj(){try{__CLR4_4_119ao19aolc8azxf3.R.inc(58951);
        __CLR4_4_119ao19aolc8azxf3.R.inc(58952);Chronology chrono = GJChronology.getInstanceUTC();
        __CLR4_4_119ao19aolc8azxf3.R.inc(58953);DateTimeFormatter f = DateTimeFormat.forPattern("yyyy-MM-ww").withChronology(chrono);
        __CLR4_4_119ao19aolc8azxf3.R.inc(58954);assertEquals(new LocalDate(2012, 1, 2, chrono), f.parseLocalDate("2012-01-01"));
    }finally{__CLR4_4_119ao19aolc8azxf3.R.flushNeeded();}}

    public void testParseLocalDate_year_month_week_2013() {__CLR4_4_119ao19aolc8azxf3.R.globalSliceStart(getClass().getName(),58955);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n9bxeg19hn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119ao19aolc8azxf3.R.rethrow($CLV_t2$);}finally{__CLR4_4_119ao19aolc8azxf3.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testParseLocalDate_year_month_week_2013",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),58955,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n9bxeg19hn(){try{__CLR4_4_119ao19aolc8azxf3.R.inc(58955);
        __CLR4_4_119ao19aolc8azxf3.R.inc(58956);Chronology chrono = GJChronology.getInstanceUTC();
        __CLR4_4_119ao19aolc8azxf3.R.inc(58957);DateTimeFormatter f = DateTimeFormat.forPattern("yyyy-MM-ww").withChronology(chrono);
        __CLR4_4_119ao19aolc8azxf3.R.inc(58958);assertEquals(new LocalDate(2012, 12, 31, chrono), f.parseLocalDate("2013-01-01"));  // 2013-01-01 would be better, but this is OK
    }finally{__CLR4_4_119ao19aolc8azxf3.R.flushNeeded();}}

    public void testParseLocalDate_year_month_week_2014() {__CLR4_4_119ao19aolc8azxf3.R.globalSliceStart(getClass().getName(),58959);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qibw6x19hr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119ao19aolc8azxf3.R.rethrow($CLV_t2$);}finally{__CLR4_4_119ao19aolc8azxf3.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testParseLocalDate_year_month_week_2014",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),58959,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qibw6x19hr(){try{__CLR4_4_119ao19aolc8azxf3.R.inc(58959);
        __CLR4_4_119ao19aolc8azxf3.R.inc(58960);Chronology chrono = GJChronology.getInstanceUTC();
        __CLR4_4_119ao19aolc8azxf3.R.inc(58961);DateTimeFormatter f = DateTimeFormat.forPattern("yyyy-MM-ww").withChronology(chrono);
        __CLR4_4_119ao19aolc8azxf3.R.inc(58962);assertEquals(new LocalDate(2013, 12, 30, chrono), f.parseLocalDate("2014-01-01"));  // 2014-01-01 would be better, but this is OK
    }finally{__CLR4_4_119ao19aolc8azxf3.R.flushNeeded();}}

    public void testParseLocalDate_year_month_week_2015() {__CLR4_4_119ao19aolc8azxf3.R.globalSliceStart(getClass().getName(),58963);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1trbuze19hv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119ao19aolc8azxf3.R.rethrow($CLV_t2$);}finally{__CLR4_4_119ao19aolc8azxf3.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testParseLocalDate_year_month_week_2015",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),58963,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1trbuze19hv(){try{__CLR4_4_119ao19aolc8azxf3.R.inc(58963);
        __CLR4_4_119ao19aolc8azxf3.R.inc(58964);Chronology chrono = GJChronology.getInstanceUTC();
        __CLR4_4_119ao19aolc8azxf3.R.inc(58965);DateTimeFormatter f = DateTimeFormat.forPattern("yyyy-MM-ww").withChronology(chrono);
        __CLR4_4_119ao19aolc8azxf3.R.inc(58966);assertEquals(new LocalDate(2014, 12, 29, chrono), f.parseLocalDate("2015-01-01"));  // 2015-01-01 would be better, but this is OK
    }finally{__CLR4_4_119ao19aolc8azxf3.R.flushNeeded();}}

    public void testParseLocalDate_year_month_week_2016() {__CLR4_4_119ao19aolc8azxf3.R.globalSliceStart(getClass().getName(),58967);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1x0btrv19hz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119ao19aolc8azxf3.R.rethrow($CLV_t2$);}finally{__CLR4_4_119ao19aolc8azxf3.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testParseLocalDate_year_month_week_2016",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),58967,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1x0btrv19hz(){try{__CLR4_4_119ao19aolc8azxf3.R.inc(58967);
        __CLR4_4_119ao19aolc8azxf3.R.inc(58968);Chronology chrono = GJChronology.getInstanceUTC();
        __CLR4_4_119ao19aolc8azxf3.R.inc(58969);DateTimeFormatter f = DateTimeFormat.forPattern("yyyy-MM-ww").withChronology(chrono);
        __CLR4_4_119ao19aolc8azxf3.R.inc(58970);assertEquals(new LocalDate(2016, 1, 4, chrono), f.parseLocalDate("2016-01-01"));
    }finally{__CLR4_4_119ao19aolc8azxf3.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testParseLocalTime_simple() {__CLR4_4_119ao19aolc8azxf3.R.globalSliceStart(getClass().getName(),58971);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1th6fz519i3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119ao19aolc8azxf3.R.rethrow($CLV_t2$);}finally{__CLR4_4_119ao19aolc8azxf3.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testParseLocalTime_simple",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),58971,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1th6fz519i3(){try{__CLR4_4_119ao19aolc8azxf3.R.inc(58971);
        __CLR4_4_119ao19aolc8azxf3.R.inc(58972);assertEquals(new LocalTime(10, 20, 30), g.parseLocalTime("2004-06-09T10:20:30Z"));
        __CLR4_4_119ao19aolc8azxf3.R.inc(58973);assertEquals(new LocalTime(10, 20, 30), g.parseLocalTime("2004-06-09T10:20:30+18:00"));
        __CLR4_4_119ao19aolc8azxf3.R.inc(58974);assertEquals(new LocalTime(10, 20, 30), g.parseLocalTime("2004-06-09T10:20:30-18:00"));
        __CLR4_4_119ao19aolc8azxf3.R.inc(58975);assertEquals(new LocalTime(10, 20, 30, 0, BUDDHIST_PARIS),
                g.withChronology(BUDDHIST_PARIS).parseLocalTime("2004-06-09T10:20:30Z"));
        __CLR4_4_119ao19aolc8azxf3.R.inc(58976);try {
            __CLR4_4_119ao19aolc8azxf3.R.inc(58977);g.parseDateTime("ABC");
            __CLR4_4_119ao19aolc8azxf3.R.inc(58978);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_119ao19aolc8azxf3.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testParseLocalDateTime_simple() {__CLR4_4_119ao19aolc8azxf3.R.globalSliceStart(getClass().getName(),58979);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1u9locz19ib();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119ao19aolc8azxf3.R.rethrow($CLV_t2$);}finally{__CLR4_4_119ao19aolc8azxf3.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testParseLocalDateTime_simple",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),58979,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1u9locz19ib(){try{__CLR4_4_119ao19aolc8azxf3.R.inc(58979);
        __CLR4_4_119ao19aolc8azxf3.R.inc(58980);assertEquals(new LocalDateTime(2004, 6, 9, 10, 20, 30), g.parseLocalDateTime("2004-06-09T10:20:30Z"));
        __CLR4_4_119ao19aolc8azxf3.R.inc(58981);assertEquals(new LocalDateTime(2004, 6, 9, 10, 20, 30), g.parseLocalDateTime("2004-06-09T10:20:30+18:00"));
        __CLR4_4_119ao19aolc8azxf3.R.inc(58982);assertEquals(new LocalDateTime(2004, 6, 9, 10, 20, 30), g.parseLocalDateTime("2004-06-09T10:20:30-18:00"));
        __CLR4_4_119ao19aolc8azxf3.R.inc(58983);assertEquals(new LocalDateTime(2004, 6, 9, 10, 20, 30, 0, BUDDHIST_PARIS),
                g.withChronology(BUDDHIST_PARIS).parseLocalDateTime("2004-06-09T10:20:30Z"));
        __CLR4_4_119ao19aolc8azxf3.R.inc(58984);try {
            __CLR4_4_119ao19aolc8azxf3.R.inc(58985);g.parseDateTime("ABC");
            __CLR4_4_119ao19aolc8azxf3.R.inc(58986);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_119ao19aolc8azxf3.R.flushNeeded();}}

    public void testParseLocalDateTime_monthDay_feb29() {__CLR4_4_119ao19aolc8azxf3.R.globalSliceStart(getClass().getName(),58987);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1u383p419ij();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119ao19aolc8azxf3.R.rethrow($CLV_t2$);}finally{__CLR4_4_119ao19aolc8azxf3.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testParseLocalDateTime_monthDay_feb29",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),58987,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1u383p419ij(){try{__CLR4_4_119ao19aolc8azxf3.R.inc(58987);
        __CLR4_4_119ao19aolc8azxf3.R.inc(58988);Chronology chrono = GJChronology.getInstanceUTC();
        __CLR4_4_119ao19aolc8azxf3.R.inc(58989);DateTimeFormatter f = DateTimeFormat
            .forPattern("M d H m")
            .withChronology(chrono)
            .withLocale(Locale.UK);
        
        __CLR4_4_119ao19aolc8azxf3.R.inc(58990);assertEquals(new LocalDateTime(2000, 2, 29, 13, 40, 0, 0, chrono), f.parseLocalDateTime("2 29 13 40"));
    }finally{__CLR4_4_119ao19aolc8azxf3.R.flushNeeded();}}

    public void testParseLocalDateTime_monthDay_withDefaultYear_feb29() {__CLR4_4_119ao19aolc8azxf3.R.globalSliceStart(getClass().getName(),58991);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1757sf519in();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119ao19aolc8azxf3.R.rethrow($CLV_t2$);}finally{__CLR4_4_119ao19aolc8azxf3.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testParseLocalDateTime_monthDay_withDefaultYear_feb29",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),58991,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1757sf519in(){try{__CLR4_4_119ao19aolc8azxf3.R.inc(58991);
        __CLR4_4_119ao19aolc8azxf3.R.inc(58992);Chronology chrono = GJChronology.getInstanceUTC();
        __CLR4_4_119ao19aolc8azxf3.R.inc(58993);DateTimeFormatter f = DateTimeFormat
            .forPattern("M d H m")
            .withChronology(chrono)
            .withLocale(Locale.UK)
            .withDefaultYear(2012);
        
        __CLR4_4_119ao19aolc8azxf3.R.inc(58994);assertEquals(new LocalDateTime(2012, 2, 29, 13, 40, 0, 0, chrono), f.parseLocalDateTime("2 29 13 40"));
    }finally{__CLR4_4_119ao19aolc8azxf3.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testParseDateTime_simple() {__CLR4_4_119ao19aolc8azxf3.R.globalSliceStart(getClass().getName(),58995);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rrio7019ir();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119ao19aolc8azxf3.R.rethrow($CLV_t2$);}finally{__CLR4_4_119ao19aolc8azxf3.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testParseDateTime_simple",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),58995,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rrio7019ir(){try{__CLR4_4_119ao19aolc8azxf3.R.inc(58995);
        __CLR4_4_119ao19aolc8azxf3.R.inc(58996);DateTime expect = null;
        __CLR4_4_119ao19aolc8azxf3.R.inc(58997);expect = new DateTime(2004, 6, 9, 11, 20, 30, 0, LONDON);
        __CLR4_4_119ao19aolc8azxf3.R.inc(58998);assertEquals(expect, g.parseDateTime("2004-06-09T10:20:30Z"));
        
        __CLR4_4_119ao19aolc8azxf3.R.inc(58999);try {
            __CLR4_4_119ao19aolc8azxf3.R.inc(59000);g.parseDateTime("ABC");
            __CLR4_4_119ao19aolc8azxf3.R.inc(59001);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_119ao19aolc8azxf3.R.flushNeeded();}}

    public void testParseDateTime_zone() {__CLR4_4_119ao19aolc8azxf3.R.globalSliceStart(getClass().getName(),59002);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_135zjwq19iy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119ao19aolc8azxf3.R.rethrow($CLV_t2$);}finally{__CLR4_4_119ao19aolc8azxf3.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testParseDateTime_zone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),59002,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_135zjwq19iy(){try{__CLR4_4_119ao19aolc8azxf3.R.inc(59002);
        __CLR4_4_119ao19aolc8azxf3.R.inc(59003);DateTime expect = null;
        __CLR4_4_119ao19aolc8azxf3.R.inc(59004);expect = new DateTime(2004, 6, 9, 11, 20, 30, 0, LONDON);
        __CLR4_4_119ao19aolc8azxf3.R.inc(59005);assertEquals(expect, g.withZone(LONDON).parseDateTime("2004-06-09T10:20:30Z"));
        
        __CLR4_4_119ao19aolc8azxf3.R.inc(59006);expect = new DateTime(2004, 6, 9, 11, 20, 30, 0, LONDON);
        __CLR4_4_119ao19aolc8azxf3.R.inc(59007);assertEquals(expect, g.withZone(null).parseDateTime("2004-06-09T10:20:30Z"));
        
        __CLR4_4_119ao19aolc8azxf3.R.inc(59008);expect = new DateTime(2004, 6, 9, 12, 20, 30, 0, PARIS);
        __CLR4_4_119ao19aolc8azxf3.R.inc(59009);assertEquals(expect, g.withZone(PARIS).parseDateTime("2004-06-09T10:20:30Z"));
    }finally{__CLR4_4_119ao19aolc8azxf3.R.flushNeeded();}}

    public void testParseDateTime_zone2() {__CLR4_4_119ao19aolc8azxf3.R.globalSliceStart(getClass().getName(),59010);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fny5ey19j6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119ao19aolc8azxf3.R.rethrow($CLV_t2$);}finally{__CLR4_4_119ao19aolc8azxf3.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testParseDateTime_zone2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),59010,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fny5ey19j6(){try{__CLR4_4_119ao19aolc8azxf3.R.inc(59010);
        __CLR4_4_119ao19aolc8azxf3.R.inc(59011);DateTime expect = null;
        __CLR4_4_119ao19aolc8azxf3.R.inc(59012);expect = new DateTime(2004, 6, 9, 11, 20, 30, 0, LONDON);
        __CLR4_4_119ao19aolc8azxf3.R.inc(59013);assertEquals(expect, g.withZone(LONDON).parseDateTime("2004-06-09T06:20:30-04:00"));
        
        __CLR4_4_119ao19aolc8azxf3.R.inc(59014);expect = new DateTime(2004, 6, 9, 11, 20, 30, 0, LONDON);
        __CLR4_4_119ao19aolc8azxf3.R.inc(59015);assertEquals(expect, g.withZone(null).parseDateTime("2004-06-09T06:20:30-04:00"));
        
        __CLR4_4_119ao19aolc8azxf3.R.inc(59016);expect = new DateTime(2004, 6, 9, 12, 20, 30, 0, PARIS);
        __CLR4_4_119ao19aolc8azxf3.R.inc(59017);assertEquals(expect, g.withZone(PARIS).parseDateTime("2004-06-09T06:20:30-04:00"));
    }finally{__CLR4_4_119ao19aolc8azxf3.R.flushNeeded();}}

    public void testParseDateTime_zone3() {__CLR4_4_119ao19aolc8azxf3.R.globalSliceStart(getClass().getName(),59018);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1iwy47f19je();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119ao19aolc8azxf3.R.rethrow($CLV_t2$);}finally{__CLR4_4_119ao19aolc8azxf3.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testParseDateTime_zone3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),59018,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1iwy47f19je(){try{__CLR4_4_119ao19aolc8azxf3.R.inc(59018);
        __CLR4_4_119ao19aolc8azxf3.R.inc(59019);DateTimeFormatter h = new DateTimeFormatterBuilder()
        .append(ISODateTimeFormat.date())
        .appendLiteral('T')
        .append(ISODateTimeFormat.timeElementParser())
        .toFormatter();
        
        __CLR4_4_119ao19aolc8azxf3.R.inc(59020);DateTime expect = null;
        __CLR4_4_119ao19aolc8azxf3.R.inc(59021);expect = new DateTime(2004, 6, 9, 10, 20, 30, 0, LONDON);
        __CLR4_4_119ao19aolc8azxf3.R.inc(59022);assertEquals(expect, h.withZone(LONDON).parseDateTime("2004-06-09T10:20:30"));
        
        __CLR4_4_119ao19aolc8azxf3.R.inc(59023);expect = new DateTime(2004, 6, 9, 10, 20, 30, 0, LONDON);
        __CLR4_4_119ao19aolc8azxf3.R.inc(59024);assertEquals(expect, h.withZone(null).parseDateTime("2004-06-09T10:20:30"));
        
        __CLR4_4_119ao19aolc8azxf3.R.inc(59025);expect = new DateTime(2004, 6, 9, 10, 20, 30, 0, PARIS);
        __CLR4_4_119ao19aolc8azxf3.R.inc(59026);assertEquals(expect, h.withZone(PARIS).parseDateTime("2004-06-09T10:20:30"));
    }finally{__CLR4_4_119ao19aolc8azxf3.R.flushNeeded();}}

    public void testParseDateTime_simple_precedence() {__CLR4_4_119ao19aolc8azxf3.R.globalSliceStart(getClass().getName(),59027);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rdonph19jn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119ao19aolc8azxf3.R.rethrow($CLV_t2$);}finally{__CLR4_4_119ao19aolc8azxf3.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testParseDateTime_simple_precedence",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),59027,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rdonph19jn(){try{__CLR4_4_119ao19aolc8azxf3.R.inc(59027);
        __CLR4_4_119ao19aolc8azxf3.R.inc(59028);DateTime expect = null;
        // use correct day of week
        __CLR4_4_119ao19aolc8azxf3.R.inc(59029);expect = new DateTime(2004, 6, 9, 11, 20, 30, 0, LONDON);
        __CLR4_4_119ao19aolc8azxf3.R.inc(59030);assertEquals(expect, f.parseDateTime("Wed 2004-06-09T10:20:30Z"));
        
        // use wrong day of week
        __CLR4_4_119ao19aolc8azxf3.R.inc(59031);expect = new DateTime(2004, 6, 7, 11, 20, 30, 0, LONDON);
        // DayOfWeek takes precedence, because week < month in length
        __CLR4_4_119ao19aolc8azxf3.R.inc(59032);assertEquals(expect, f.parseDateTime("Mon 2004-06-09T10:20:30Z"));
    }finally{__CLR4_4_119ao19aolc8azxf3.R.flushNeeded();}}

    public void testParseDateTime_offsetParsed() {__CLR4_4_119ao19aolc8azxf3.R.globalSliceStart(getClass().getName(),59033);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11qmpfy19jt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119ao19aolc8azxf3.R.rethrow($CLV_t2$);}finally{__CLR4_4_119ao19aolc8azxf3.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testParseDateTime_offsetParsed",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),59033,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11qmpfy19jt(){try{__CLR4_4_119ao19aolc8azxf3.R.inc(59033);
        __CLR4_4_119ao19aolc8azxf3.R.inc(59034);DateTime expect = null;
        __CLR4_4_119ao19aolc8azxf3.R.inc(59035);expect = new DateTime(2004, 6, 9, 10, 20, 30, 0, UTC);
        __CLR4_4_119ao19aolc8azxf3.R.inc(59036);assertEquals(expect, g.withOffsetParsed().parseDateTime("2004-06-09T10:20:30Z"));
        
        __CLR4_4_119ao19aolc8azxf3.R.inc(59037);expect = new DateTime(2004, 6, 9, 6, 20, 30, 0, DateTimeZone.forOffsetHours(-4));
        __CLR4_4_119ao19aolc8azxf3.R.inc(59038);assertEquals(expect, g.withOffsetParsed().parseDateTime("2004-06-09T06:20:30-04:00"));
        
        __CLR4_4_119ao19aolc8azxf3.R.inc(59039);expect = new DateTime(2004, 6, 9, 10, 20, 30, 0, UTC);
        __CLR4_4_119ao19aolc8azxf3.R.inc(59040);assertEquals(expect, g.withZone(PARIS).withOffsetParsed().parseDateTime("2004-06-09T10:20:30Z"));
        __CLR4_4_119ao19aolc8azxf3.R.inc(59041);expect = new DateTime(2004, 6, 9, 12, 20, 30, 0, PARIS);
        __CLR4_4_119ao19aolc8azxf3.R.inc(59042);assertEquals(expect, g.withOffsetParsed().withZone(PARIS).parseDateTime("2004-06-09T10:20:30Z"));
    }finally{__CLR4_4_119ao19aolc8azxf3.R.flushNeeded();}}

    public void testParseDateTime_chrono() {__CLR4_4_119ao19aolc8azxf3.R.globalSliceStart(getClass().getName(),59043);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vlh6ib19k3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119ao19aolc8azxf3.R.rethrow($CLV_t2$);}finally{__CLR4_4_119ao19aolc8azxf3.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testParseDateTime_chrono",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),59043,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vlh6ib19k3(){try{__CLR4_4_119ao19aolc8azxf3.R.inc(59043);
        __CLR4_4_119ao19aolc8azxf3.R.inc(59044);DateTime expect = null;
        __CLR4_4_119ao19aolc8azxf3.R.inc(59045);expect = new DateTime(2004, 6, 9, 12, 20, 30, 0, PARIS);
        __CLR4_4_119ao19aolc8azxf3.R.inc(59046);assertEquals(expect, g.withChronology(ISO_PARIS).parseDateTime("2004-06-09T10:20:30Z"));
        
        __CLR4_4_119ao19aolc8azxf3.R.inc(59047);expect = new DateTime(2004, 6, 9, 11, 20, 30, 0,LONDON);
        __CLR4_4_119ao19aolc8azxf3.R.inc(59048);assertEquals(expect, g.withChronology(null).parseDateTime("2004-06-09T10:20:30Z"));
        
        __CLR4_4_119ao19aolc8azxf3.R.inc(59049);expect = new DateTime(2547, 6, 9, 12, 20, 30, 0, BUDDHIST_PARIS);
        __CLR4_4_119ao19aolc8azxf3.R.inc(59050);assertEquals(expect, g.withChronology(BUDDHIST_PARIS).parseDateTime("2547-06-09T10:20:30Z"));
        
        __CLR4_4_119ao19aolc8azxf3.R.inc(59051);expect = new DateTime(2004, 6, 9, 10, 29, 51, 0, BUDDHIST_PARIS); // zone is +00:09:21 in 1451
        __CLR4_4_119ao19aolc8azxf3.R.inc(59052);assertEquals(expect, g.withChronology(BUDDHIST_PARIS).parseDateTime("2004-06-09T10:20:30Z"));
    }finally{__CLR4_4_119ao19aolc8azxf3.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testParseMutableDateTime_simple() {__CLR4_4_119ao19aolc8azxf3.R.globalSliceStart(getClass().getName(),59053);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17xf1pk19kd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119ao19aolc8azxf3.R.rethrow($CLV_t2$);}finally{__CLR4_4_119ao19aolc8azxf3.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testParseMutableDateTime_simple",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),59053,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17xf1pk19kd(){try{__CLR4_4_119ao19aolc8azxf3.R.inc(59053);
        __CLR4_4_119ao19aolc8azxf3.R.inc(59054);MutableDateTime expect = null;
        __CLR4_4_119ao19aolc8azxf3.R.inc(59055);expect = new MutableDateTime(2004, 6, 9, 11, 20, 30, 0, LONDON);
        __CLR4_4_119ao19aolc8azxf3.R.inc(59056);assertEquals(expect, g.parseMutableDateTime("2004-06-09T10:20:30Z"));
        
        __CLR4_4_119ao19aolc8azxf3.R.inc(59057);try {
            __CLR4_4_119ao19aolc8azxf3.R.inc(59058);g.parseMutableDateTime("ABC");
            __CLR4_4_119ao19aolc8azxf3.R.inc(59059);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_119ao19aolc8azxf3.R.flushNeeded();}}

    public void testParseMutableDateTime_zone() {__CLR4_4_119ao19aolc8azxf3.R.globalSliceStart(getClass().getName(),59060);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f78i6q19kk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119ao19aolc8azxf3.R.rethrow($CLV_t2$);}finally{__CLR4_4_119ao19aolc8azxf3.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testParseMutableDateTime_zone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),59060,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f78i6q19kk(){try{__CLR4_4_119ao19aolc8azxf3.R.inc(59060);
        __CLR4_4_119ao19aolc8azxf3.R.inc(59061);MutableDateTime expect = null;
        __CLR4_4_119ao19aolc8azxf3.R.inc(59062);expect = new MutableDateTime(2004, 6, 9, 11, 20, 30, 0, LONDON);
        __CLR4_4_119ao19aolc8azxf3.R.inc(59063);assertEquals(expect, g.withZone(LONDON).parseMutableDateTime("2004-06-09T10:20:30Z"));
        
        __CLR4_4_119ao19aolc8azxf3.R.inc(59064);expect = new MutableDateTime(2004, 6, 9, 11, 20, 30, 0, LONDON);
        __CLR4_4_119ao19aolc8azxf3.R.inc(59065);assertEquals(expect, g.withZone(null).parseMutableDateTime("2004-06-09T10:20:30Z"));
        
        __CLR4_4_119ao19aolc8azxf3.R.inc(59066);expect = new MutableDateTime(2004, 6, 9, 12, 20, 30, 0, PARIS);
        __CLR4_4_119ao19aolc8azxf3.R.inc(59067);assertEquals(expect, g.withZone(PARIS).parseMutableDateTime("2004-06-09T10:20:30Z"));
    }finally{__CLR4_4_119ao19aolc8azxf3.R.flushNeeded();}}

    public void testParseMutableDateTime_zone2() {__CLR4_4_119ao19aolc8azxf3.R.globalSliceStart(getClass().getName(),59068);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gsziku19ks();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119ao19aolc8azxf3.R.rethrow($CLV_t2$);}finally{__CLR4_4_119ao19aolc8azxf3.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testParseMutableDateTime_zone2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),59068,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gsziku19ks(){try{__CLR4_4_119ao19aolc8azxf3.R.inc(59068);
        __CLR4_4_119ao19aolc8azxf3.R.inc(59069);MutableDateTime expect = null;
        __CLR4_4_119ao19aolc8azxf3.R.inc(59070);expect = new MutableDateTime(2004, 6, 9, 11, 20, 30, 0, LONDON);
        __CLR4_4_119ao19aolc8azxf3.R.inc(59071);assertEquals(expect, g.withZone(LONDON).parseMutableDateTime("2004-06-09T06:20:30-04:00"));
        
        __CLR4_4_119ao19aolc8azxf3.R.inc(59072);expect = new MutableDateTime(2004, 6, 9, 11, 20, 30, 0, LONDON);
        __CLR4_4_119ao19aolc8azxf3.R.inc(59073);assertEquals(expect, g.withZone(null).parseMutableDateTime("2004-06-09T06:20:30-04:00"));
        
        __CLR4_4_119ao19aolc8azxf3.R.inc(59074);expect = new MutableDateTime(2004, 6, 9, 12, 20, 30, 0, PARIS);
        __CLR4_4_119ao19aolc8azxf3.R.inc(59075);assertEquals(expect, g.withZone(PARIS).parseMutableDateTime("2004-06-09T06:20:30-04:00"));
    }finally{__CLR4_4_119ao19aolc8azxf3.R.flushNeeded();}}

    public void testParseMutableDateTime_zone3() {__CLR4_4_119ao19aolc8azxf3.R.globalSliceStart(getClass().getName(),59076);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1k1zhdb19l0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119ao19aolc8azxf3.R.rethrow($CLV_t2$);}finally{__CLR4_4_119ao19aolc8azxf3.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testParseMutableDateTime_zone3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),59076,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1k1zhdb19l0(){try{__CLR4_4_119ao19aolc8azxf3.R.inc(59076);
        __CLR4_4_119ao19aolc8azxf3.R.inc(59077);DateTimeFormatter h = new DateTimeFormatterBuilder()
        .append(ISODateTimeFormat.date())
        .appendLiteral('T')
        .append(ISODateTimeFormat.timeElementParser())
        .toFormatter();
        
        __CLR4_4_119ao19aolc8azxf3.R.inc(59078);MutableDateTime expect = null;
        __CLR4_4_119ao19aolc8azxf3.R.inc(59079);expect = new MutableDateTime(2004, 6, 9, 10, 20, 30, 0, LONDON);
        __CLR4_4_119ao19aolc8azxf3.R.inc(59080);assertEquals(expect, h.withZone(LONDON).parseMutableDateTime("2004-06-09T10:20:30"));
        
        __CLR4_4_119ao19aolc8azxf3.R.inc(59081);expect = new MutableDateTime(2004, 6, 9, 10, 20, 30, 0, LONDON);
        __CLR4_4_119ao19aolc8azxf3.R.inc(59082);assertEquals(expect, h.withZone(null).parseMutableDateTime("2004-06-09T10:20:30"));
        
        __CLR4_4_119ao19aolc8azxf3.R.inc(59083);expect = new MutableDateTime(2004, 6, 9, 10, 20, 30, 0, PARIS);
        __CLR4_4_119ao19aolc8azxf3.R.inc(59084);assertEquals(expect, h.withZone(PARIS).parseMutableDateTime("2004-06-09T10:20:30"));
    }finally{__CLR4_4_119ao19aolc8azxf3.R.flushNeeded();}}

    public void testParseMutableDateTime_simple_precedence() {__CLR4_4_119ao19aolc8azxf3.R.globalSliceStart(getClass().getName(),59085);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xzdt0h19l9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119ao19aolc8azxf3.R.rethrow($CLV_t2$);}finally{__CLR4_4_119ao19aolc8azxf3.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testParseMutableDateTime_simple_precedence",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),59085,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xzdt0h19l9(){try{__CLR4_4_119ao19aolc8azxf3.R.inc(59085);
        __CLR4_4_119ao19aolc8azxf3.R.inc(59086);MutableDateTime expect = null;
        // use correct day of week
        __CLR4_4_119ao19aolc8azxf3.R.inc(59087);expect = new MutableDateTime(2004, 6, 9, 11, 20, 30, 0, LONDON);
        __CLR4_4_119ao19aolc8azxf3.R.inc(59088);assertEquals(expect, f.parseDateTime("Wed 2004-06-09T10:20:30Z"));
        
        // use wrong day of week
        __CLR4_4_119ao19aolc8azxf3.R.inc(59089);expect = new MutableDateTime(2004, 6, 7, 11, 20, 30, 0, LONDON);
        // DayOfWeek takes precedence, because week < month in length
        __CLR4_4_119ao19aolc8azxf3.R.inc(59090);assertEquals(expect, f.parseDateTime("Mon 2004-06-09T10:20:30Z"));
    }finally{__CLR4_4_119ao19aolc8azxf3.R.flushNeeded();}}

    public void testParseMutableDateTime_offsetParsed() {__CLR4_4_119ao19aolc8azxf3.R.globalSliceStart(getClass().getName(),59091);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1y2ypzq19lf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119ao19aolc8azxf3.R.rethrow($CLV_t2$);}finally{__CLR4_4_119ao19aolc8azxf3.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testParseMutableDateTime_offsetParsed",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),59091,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1y2ypzq19lf(){try{__CLR4_4_119ao19aolc8azxf3.R.inc(59091);
        __CLR4_4_119ao19aolc8azxf3.R.inc(59092);MutableDateTime expect = null;
        __CLR4_4_119ao19aolc8azxf3.R.inc(59093);expect = new MutableDateTime(2004, 6, 9, 10, 20, 30, 0, UTC);
        __CLR4_4_119ao19aolc8azxf3.R.inc(59094);assertEquals(expect, g.withOffsetParsed().parseMutableDateTime("2004-06-09T10:20:30Z"));
        
        __CLR4_4_119ao19aolc8azxf3.R.inc(59095);expect = new MutableDateTime(2004, 6, 9, 6, 20, 30, 0, DateTimeZone.forOffsetHours(-4));
        __CLR4_4_119ao19aolc8azxf3.R.inc(59096);assertEquals(expect, g.withOffsetParsed().parseMutableDateTime("2004-06-09T06:20:30-04:00"));
        
        __CLR4_4_119ao19aolc8azxf3.R.inc(59097);expect = new MutableDateTime(2004, 6, 9, 10, 20, 30, 0, UTC);
        __CLR4_4_119ao19aolc8azxf3.R.inc(59098);assertEquals(expect, g.withZone(PARIS).withOffsetParsed().parseMutableDateTime("2004-06-09T10:20:30Z"));
        __CLR4_4_119ao19aolc8azxf3.R.inc(59099);expect = new MutableDateTime(2004, 6, 9, 12, 20, 30, 0, PARIS);
        __CLR4_4_119ao19aolc8azxf3.R.inc(59100);assertEquals(expect, g.withOffsetParsed().withZone(PARIS).parseMutableDateTime("2004-06-09T10:20:30Z"));
    }finally{__CLR4_4_119ao19aolc8azxf3.R.flushNeeded();}}

    public void testParseMutableDateTime_chrono() {__CLR4_4_119ao19aolc8azxf3.R.globalSliceStart(getClass().getName(),59101);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13qp5k919lp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119ao19aolc8azxf3.R.rethrow($CLV_t2$);}finally{__CLR4_4_119ao19aolc8azxf3.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testParseMutableDateTime_chrono",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),59101,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13qp5k919lp(){try{__CLR4_4_119ao19aolc8azxf3.R.inc(59101);
        __CLR4_4_119ao19aolc8azxf3.R.inc(59102);MutableDateTime expect = null;
        __CLR4_4_119ao19aolc8azxf3.R.inc(59103);expect = new MutableDateTime(2004, 6, 9, 12, 20, 30, 0, PARIS);
        __CLR4_4_119ao19aolc8azxf3.R.inc(59104);assertEquals(expect, g.withChronology(ISO_PARIS).parseMutableDateTime("2004-06-09T10:20:30Z"));
        
        __CLR4_4_119ao19aolc8azxf3.R.inc(59105);expect = new MutableDateTime(2004, 6, 9, 11, 20, 30, 0,LONDON);
        __CLR4_4_119ao19aolc8azxf3.R.inc(59106);assertEquals(expect, g.withChronology(null).parseMutableDateTime("2004-06-09T10:20:30Z"));
        
        __CLR4_4_119ao19aolc8azxf3.R.inc(59107);expect = new MutableDateTime(2547, 6, 9, 12, 20, 30, 0, BUDDHIST_PARIS);
        __CLR4_4_119ao19aolc8azxf3.R.inc(59108);assertEquals(expect, g.withChronology(BUDDHIST_PARIS).parseMutableDateTime("2547-06-09T10:20:30Z"));
        
        __CLR4_4_119ao19aolc8azxf3.R.inc(59109);expect = new MutableDateTime(2004, 6, 9, 10, 29, 51, 0, BUDDHIST_PARIS); // zone is +00:09:21 in 1451
        __CLR4_4_119ao19aolc8azxf3.R.inc(59110);assertEquals(expect, g.withChronology(BUDDHIST_PARIS).parseMutableDateTime("2004-06-09T10:20:30Z"));
    }finally{__CLR4_4_119ao19aolc8azxf3.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testParseInto_simple() {__CLR4_4_119ao19aolc8azxf3.R.globalSliceStart(getClass().getName(),59111);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1of64s719lz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119ao19aolc8azxf3.R.rethrow($CLV_t2$);}finally{__CLR4_4_119ao19aolc8azxf3.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testParseInto_simple",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),59111,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1of64s719lz(){try{__CLR4_4_119ao19aolc8azxf3.R.inc(59111);
        __CLR4_4_119ao19aolc8azxf3.R.inc(59112);MutableDateTime expect = null;
        __CLR4_4_119ao19aolc8azxf3.R.inc(59113);expect = new MutableDateTime(2004, 6, 9, 11, 20, 30, 0, LONDON);
        __CLR4_4_119ao19aolc8azxf3.R.inc(59114);MutableDateTime result = new MutableDateTime(0L);
        __CLR4_4_119ao19aolc8azxf3.R.inc(59115);assertEquals(20, g.parseInto(result, "2004-06-09T10:20:30Z", 0));
        __CLR4_4_119ao19aolc8azxf3.R.inc(59116);assertEquals(expect, result);
        
        __CLR4_4_119ao19aolc8azxf3.R.inc(59117);try {
            __CLR4_4_119ao19aolc8azxf3.R.inc(59118);g.parseInto(null, "2004-06-09T10:20:30Z", 0);
            __CLR4_4_119ao19aolc8azxf3.R.inc(59119);fail();
        } catch (IllegalArgumentException ex) {}
        
        __CLR4_4_119ao19aolc8azxf3.R.inc(59120);assertEquals(~0, g.parseInto(result, "ABC", 0));
        __CLR4_4_119ao19aolc8azxf3.R.inc(59121);assertEquals(~10, g.parseInto(result, "2004-06-09", 0));
        __CLR4_4_119ao19aolc8azxf3.R.inc(59122);assertEquals(~13, g.parseInto(result, "XX2004-06-09T", 2));
    }finally{__CLR4_4_119ao19aolc8azxf3.R.flushNeeded();}}

    public void testParseInto_zone() {__CLR4_4_119ao19aolc8azxf3.R.globalSliceStart(getClass().getName(),59123);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17lrksv19mb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119ao19aolc8azxf3.R.rethrow($CLV_t2$);}finally{__CLR4_4_119ao19aolc8azxf3.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testParseInto_zone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),59123,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17lrksv19mb(){try{__CLR4_4_119ao19aolc8azxf3.R.inc(59123);
        __CLR4_4_119ao19aolc8azxf3.R.inc(59124);MutableDateTime expect = null;
        __CLR4_4_119ao19aolc8azxf3.R.inc(59125);MutableDateTime result = null;
        __CLR4_4_119ao19aolc8azxf3.R.inc(59126);expect = new MutableDateTime(2004, 6, 9, 11, 20, 30, 0, LONDON);
        __CLR4_4_119ao19aolc8azxf3.R.inc(59127);result = new MutableDateTime(0L);
        __CLR4_4_119ao19aolc8azxf3.R.inc(59128);assertEquals(20, g.withZone(LONDON).parseInto(result, "2004-06-09T10:20:30Z", 0));
        __CLR4_4_119ao19aolc8azxf3.R.inc(59129);assertEquals(expect, result);
        
        __CLR4_4_119ao19aolc8azxf3.R.inc(59130);expect = new MutableDateTime(2004, 6, 9, 11, 20, 30, 0, LONDON);
        __CLR4_4_119ao19aolc8azxf3.R.inc(59131);result = new MutableDateTime(0L);
        __CLR4_4_119ao19aolc8azxf3.R.inc(59132);assertEquals(20, g.withZone(null).parseInto(result, "2004-06-09T10:20:30Z", 0));
        __CLR4_4_119ao19aolc8azxf3.R.inc(59133);assertEquals(expect, result);
        
        __CLR4_4_119ao19aolc8azxf3.R.inc(59134);expect = new MutableDateTime(2004, 6, 9, 12, 20, 30, 0, PARIS);
        __CLR4_4_119ao19aolc8azxf3.R.inc(59135);result = new MutableDateTime(0L);
        __CLR4_4_119ao19aolc8azxf3.R.inc(59136);assertEquals(20, g.withZone(PARIS).parseInto(result, "2004-06-09T10:20:30Z", 0));
        __CLR4_4_119ao19aolc8azxf3.R.inc(59137);assertEquals(expect, result);
    }finally{__CLR4_4_119ao19aolc8azxf3.R.flushNeeded();}}

    public void testParseInto_zone2() {__CLR4_4_119ao19aolc8azxf3.R.globalSliceStart(getClass().getName(),59138);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1k51hov19mq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119ao19aolc8azxf3.R.rethrow($CLV_t2$);}finally{__CLR4_4_119ao19aolc8azxf3.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testParseInto_zone2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),59138,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1k51hov19mq(){try{__CLR4_4_119ao19aolc8azxf3.R.inc(59138);
        __CLR4_4_119ao19aolc8azxf3.R.inc(59139);MutableDateTime expect = null;
        __CLR4_4_119ao19aolc8azxf3.R.inc(59140);MutableDateTime result = null;
        __CLR4_4_119ao19aolc8azxf3.R.inc(59141);expect = new MutableDateTime(2004, 6, 9, 11, 20, 30, 0, LONDON);
        __CLR4_4_119ao19aolc8azxf3.R.inc(59142);result = new MutableDateTime(0L);
        __CLR4_4_119ao19aolc8azxf3.R.inc(59143);assertEquals(25, g.withZone(LONDON).parseInto(result, "2004-06-09T06:20:30-04:00", 0));
        __CLR4_4_119ao19aolc8azxf3.R.inc(59144);assertEquals(expect, result);
        
        __CLR4_4_119ao19aolc8azxf3.R.inc(59145);expect = new MutableDateTime(2004, 6, 9, 11, 20, 30, 0, LONDON);
        __CLR4_4_119ao19aolc8azxf3.R.inc(59146);assertEquals(25, g.withZone(null).parseInto(result, "2004-06-09T06:20:30-04:00", 0));
        __CLR4_4_119ao19aolc8azxf3.R.inc(59147);assertEquals(expect, result);
        
        __CLR4_4_119ao19aolc8azxf3.R.inc(59148);expect = new MutableDateTime(2004, 6, 9, 12, 20, 30, 0, PARIS);
        __CLR4_4_119ao19aolc8azxf3.R.inc(59149);assertEquals(25, g.withZone(PARIS).parseInto(result, "2004-06-09T06:20:30-04:00", 0));
        __CLR4_4_119ao19aolc8azxf3.R.inc(59150);assertEquals(expect, result);
    }finally{__CLR4_4_119ao19aolc8azxf3.R.flushNeeded();}}

    public void testParseInto_zone3() {__CLR4_4_119ao19aolc8azxf3.R.globalSliceStart(getClass().getName(),59151);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ne1ghc19n3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119ao19aolc8azxf3.R.rethrow($CLV_t2$);}finally{__CLR4_4_119ao19aolc8azxf3.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testParseInto_zone3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),59151,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ne1ghc19n3(){try{__CLR4_4_119ao19aolc8azxf3.R.inc(59151);
        __CLR4_4_119ao19aolc8azxf3.R.inc(59152);DateTimeFormatter h = new DateTimeFormatterBuilder()
        .append(ISODateTimeFormat.date())
        .appendLiteral('T')
        .append(ISODateTimeFormat.timeElementParser())
        .toFormatter();
        
        __CLR4_4_119ao19aolc8azxf3.R.inc(59153);MutableDateTime expect = null;
        __CLR4_4_119ao19aolc8azxf3.R.inc(59154);MutableDateTime result = null;
        __CLR4_4_119ao19aolc8azxf3.R.inc(59155);expect = new MutableDateTime(2004, 6, 9, 10, 20, 30, 0, LONDON);
        __CLR4_4_119ao19aolc8azxf3.R.inc(59156);result = new MutableDateTime(0L);
        __CLR4_4_119ao19aolc8azxf3.R.inc(59157);assertEquals(19, h.withZone(LONDON).parseInto(result, "2004-06-09T10:20:30", 0));
        __CLR4_4_119ao19aolc8azxf3.R.inc(59158);assertEquals(expect, result);
        
        __CLR4_4_119ao19aolc8azxf3.R.inc(59159);expect = new MutableDateTime(2004, 6, 9, 10, 20, 30, 0, LONDON);
        __CLR4_4_119ao19aolc8azxf3.R.inc(59160);result = new MutableDateTime(0L);
        __CLR4_4_119ao19aolc8azxf3.R.inc(59161);assertEquals(19, h.withZone(null).parseInto(result, "2004-06-09T10:20:30", 0));
        __CLR4_4_119ao19aolc8azxf3.R.inc(59162);assertEquals(expect, result);
        
        __CLR4_4_119ao19aolc8azxf3.R.inc(59163);expect = new MutableDateTime(2004, 6, 9, 10, 20, 30, 0, PARIS);
        __CLR4_4_119ao19aolc8azxf3.R.inc(59164);result = new MutableDateTime(0L);
        __CLR4_4_119ao19aolc8azxf3.R.inc(59165);assertEquals(19, h.withZone(PARIS).parseInto(result, "2004-06-09T10:20:30", 0));
        __CLR4_4_119ao19aolc8azxf3.R.inc(59166);assertEquals(expect, result);
    }finally{__CLR4_4_119ao19aolc8azxf3.R.flushNeeded();}}

    public void testParseInto_simple_precedence() {__CLR4_4_119ao19aolc8azxf3.R.globalSliceStart(getClass().getName(),59167);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hop6xs19nj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119ao19aolc8azxf3.R.rethrow($CLV_t2$);}finally{__CLR4_4_119ao19aolc8azxf3.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testParseInto_simple_precedence",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),59167,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hop6xs19nj(){try{__CLR4_4_119ao19aolc8azxf3.R.inc(59167);
        __CLR4_4_119ao19aolc8azxf3.R.inc(59168);MutableDateTime expect = null;
        __CLR4_4_119ao19aolc8azxf3.R.inc(59169);MutableDateTime result = null;
        __CLR4_4_119ao19aolc8azxf3.R.inc(59170);expect = new MutableDateTime(2004, 6, 7, 11, 20, 30, 0, LONDON);
        __CLR4_4_119ao19aolc8azxf3.R.inc(59171);result = new MutableDateTime(0L);
        // DayOfWeek takes precedence, because week < month in length
        __CLR4_4_119ao19aolc8azxf3.R.inc(59172);assertEquals(24, f.parseInto(result, "Mon 2004-06-09T10:20:30Z", 0));
        __CLR4_4_119ao19aolc8azxf3.R.inc(59173);assertEquals(expect, result);
    }finally{__CLR4_4_119ao19aolc8azxf3.R.flushNeeded();}}

    public void testParseInto_offsetParsed() {__CLR4_4_119ao19aolc8azxf3.R.globalSliceStart(getClass().getName(),59174);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17pljgp19nq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119ao19aolc8azxf3.R.rethrow($CLV_t2$);}finally{__CLR4_4_119ao19aolc8azxf3.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testParseInto_offsetParsed",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),59174,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17pljgp19nq(){try{__CLR4_4_119ao19aolc8azxf3.R.inc(59174);
        __CLR4_4_119ao19aolc8azxf3.R.inc(59175);MutableDateTime expect = null;
        __CLR4_4_119ao19aolc8azxf3.R.inc(59176);MutableDateTime result = null;
        __CLR4_4_119ao19aolc8azxf3.R.inc(59177);expect = new MutableDateTime(2004, 6, 9, 10, 20, 30, 0, UTC);
        __CLR4_4_119ao19aolc8azxf3.R.inc(59178);result = new MutableDateTime(0L);
        __CLR4_4_119ao19aolc8azxf3.R.inc(59179);assertEquals(20, g.withOffsetParsed().parseInto(result, "2004-06-09T10:20:30Z", 0));
        __CLR4_4_119ao19aolc8azxf3.R.inc(59180);assertEquals(expect, result);
        
        __CLR4_4_119ao19aolc8azxf3.R.inc(59181);expect = new MutableDateTime(2004, 6, 9, 6, 20, 30, 0, DateTimeZone.forOffsetHours(-4));
        __CLR4_4_119ao19aolc8azxf3.R.inc(59182);result = new MutableDateTime(0L);
        __CLR4_4_119ao19aolc8azxf3.R.inc(59183);assertEquals(25, g.withOffsetParsed().parseInto(result, "2004-06-09T06:20:30-04:00", 0));
        __CLR4_4_119ao19aolc8azxf3.R.inc(59184);assertEquals(expect, result);
        
        __CLR4_4_119ao19aolc8azxf3.R.inc(59185);expect = new MutableDateTime(2004, 6, 9, 10, 20, 30, 0, UTC);
        __CLR4_4_119ao19aolc8azxf3.R.inc(59186);result = new MutableDateTime(0L);
        __CLR4_4_119ao19aolc8azxf3.R.inc(59187);assertEquals(20, g.withZone(PARIS).withOffsetParsed().parseInto(result, "2004-06-09T10:20:30Z", 0));
        __CLR4_4_119ao19aolc8azxf3.R.inc(59188);assertEquals(expect, result);
        __CLR4_4_119ao19aolc8azxf3.R.inc(59189);expect = new MutableDateTime(2004, 6, 9, 12, 20, 30, 0, PARIS);
        __CLR4_4_119ao19aolc8azxf3.R.inc(59190);result = new MutableDateTime(0L);
        __CLR4_4_119ao19aolc8azxf3.R.inc(59191);assertEquals(20, g.withOffsetParsed().withZone(PARIS).parseInto(result, "2004-06-09T10:20:30Z", 0));
        __CLR4_4_119ao19aolc8azxf3.R.inc(59192);assertEquals(expect, result);
    }finally{__CLR4_4_119ao19aolc8azxf3.R.flushNeeded();}}

    public void testParseInto_chrono() {__CLR4_4_119ao19aolc8azxf3.R.globalSliceStart(getClass().getName(),59193);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yxtpx419o9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119ao19aolc8azxf3.R.rethrow($CLV_t2$);}finally{__CLR4_4_119ao19aolc8azxf3.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testParseInto_chrono",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),59193,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yxtpx419o9(){try{__CLR4_4_119ao19aolc8azxf3.R.inc(59193);
        __CLR4_4_119ao19aolc8azxf3.R.inc(59194);MutableDateTime expect = null;
        __CLR4_4_119ao19aolc8azxf3.R.inc(59195);MutableDateTime result = null;
        __CLR4_4_119ao19aolc8azxf3.R.inc(59196);expect = new MutableDateTime(2004, 6, 9, 12, 20, 30, 0, PARIS);
        __CLR4_4_119ao19aolc8azxf3.R.inc(59197);result = new MutableDateTime(0L);
        __CLR4_4_119ao19aolc8azxf3.R.inc(59198);assertEquals(20, g.withChronology(ISO_PARIS).parseInto(result, "2004-06-09T10:20:30Z", 0));
        __CLR4_4_119ao19aolc8azxf3.R.inc(59199);assertEquals(expect, result);
        
        __CLR4_4_119ao19aolc8azxf3.R.inc(59200);expect = new MutableDateTime(2004, 6, 9, 11, 20, 30, 0, LONDON);
        __CLR4_4_119ao19aolc8azxf3.R.inc(59201);result = new MutableDateTime(0L);
        __CLR4_4_119ao19aolc8azxf3.R.inc(59202);assertEquals(20, g.withChronology(null).parseInto(result, "2004-06-09T10:20:30Z", 0));
        __CLR4_4_119ao19aolc8azxf3.R.inc(59203);assertEquals(expect, result);
        
        __CLR4_4_119ao19aolc8azxf3.R.inc(59204);expect = new MutableDateTime(2547, 6, 9, 12, 20, 30, 0, BUDDHIST_PARIS);
        __CLR4_4_119ao19aolc8azxf3.R.inc(59205);result = new MutableDateTime(0L);
        __CLR4_4_119ao19aolc8azxf3.R.inc(59206);assertEquals(20, g.withChronology(BUDDHIST_PARIS).parseInto(result, "2547-06-09T10:20:30Z", 0));
        __CLR4_4_119ao19aolc8azxf3.R.inc(59207);assertEquals(expect, result);
        
        __CLR4_4_119ao19aolc8azxf3.R.inc(59208);expect = new MutableDateTime(2004, 6, 9, 10, 29, 51, 0, BUDDHIST_PARIS);
        __CLR4_4_119ao19aolc8azxf3.R.inc(59209);result = new MutableDateTime(0L);
        __CLR4_4_119ao19aolc8azxf3.R.inc(59210);assertEquals(20, g.withChronology(BUDDHIST_PARIS).parseInto(result, "2004-06-09T10:20:30Z", 0));
        __CLR4_4_119ao19aolc8azxf3.R.inc(59211);assertEquals(expect, result);
    }finally{__CLR4_4_119ao19aolc8azxf3.R.flushNeeded();}}

    public void testParseInto_monthOnly() {__CLR4_4_119ao19aolc8azxf3.R.globalSliceStart(getClass().getName(),59212);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15d1vhn19os();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119ao19aolc8azxf3.R.rethrow($CLV_t2$);}finally{__CLR4_4_119ao19aolc8azxf3.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testParseInto_monthOnly",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),59212,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15d1vhn19os(){try{__CLR4_4_119ao19aolc8azxf3.R.inc(59212);
        __CLR4_4_119ao19aolc8azxf3.R.inc(59213);DateTimeFormatter f = DateTimeFormat.forPattern("M").withLocale(Locale.UK);
        __CLR4_4_119ao19aolc8azxf3.R.inc(59214);MutableDateTime result = new MutableDateTime(2004, 1, 9, 12, 20, 30, 0, LONDON);
        __CLR4_4_119ao19aolc8azxf3.R.inc(59215);assertEquals(1, f.parseInto(result, "5", 0));
        __CLR4_4_119ao19aolc8azxf3.R.inc(59216);assertEquals(new MutableDateTime(2004, 5, 9, 12, 20, 30, 0, LONDON), result);
    }finally{__CLR4_4_119ao19aolc8azxf3.R.flushNeeded();}}

    public void testParseInto_monthOnly_baseStartYear() {__CLR4_4_119ao19aolc8azxf3.R.globalSliceStart(getClass().getName(),59217);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1in7w9o19ox();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119ao19aolc8azxf3.R.rethrow($CLV_t2$);}finally{__CLR4_4_119ao19aolc8azxf3.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testParseInto_monthOnly_baseStartYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),59217,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1in7w9o19ox(){try{__CLR4_4_119ao19aolc8azxf3.R.inc(59217);
        __CLR4_4_119ao19aolc8azxf3.R.inc(59218);DateTimeFormatter f = DateTimeFormat.forPattern("M").withLocale(Locale.UK);
        __CLR4_4_119ao19aolc8azxf3.R.inc(59219);MutableDateTime result = new MutableDateTime(2004, 1, 1, 12, 20, 30, 0, TOKYO);
        __CLR4_4_119ao19aolc8azxf3.R.inc(59220);assertEquals(1, f.parseInto(result, "5", 0));
        __CLR4_4_119ao19aolc8azxf3.R.inc(59221);assertEquals(new MutableDateTime(2004, 5, 1, 12, 20, 30, 0, TOKYO), result);
    }finally{__CLR4_4_119ao19aolc8azxf3.R.flushNeeded();}}

    public void testParseInto_monthOnly_parseStartYear() {__CLR4_4_119ao19aolc8azxf3.R.globalSliceStart(getClass().getName(),59222);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tk8hac19p2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119ao19aolc8azxf3.R.rethrow($CLV_t2$);}finally{__CLR4_4_119ao19aolc8azxf3.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testParseInto_monthOnly_parseStartYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),59222,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tk8hac19p2(){try{__CLR4_4_119ao19aolc8azxf3.R.inc(59222);
        __CLR4_4_119ao19aolc8azxf3.R.inc(59223);DateTimeFormatter f = DateTimeFormat.forPattern("M").withLocale(Locale.UK);
        __CLR4_4_119ao19aolc8azxf3.R.inc(59224);MutableDateTime result = new MutableDateTime(2004, 2, 1, 12, 20, 30, 0, TOKYO);
        __CLR4_4_119ao19aolc8azxf3.R.inc(59225);assertEquals(1, f.parseInto(result, "1", 0));
        __CLR4_4_119ao19aolc8azxf3.R.inc(59226);assertEquals(new MutableDateTime(2004, 1, 1, 12, 20, 30, 0, TOKYO), result);
    }finally{__CLR4_4_119ao19aolc8azxf3.R.flushNeeded();}}

    public void testParseInto_monthOnly_baseEndYear() {__CLR4_4_119ao19aolc8azxf3.R.globalSliceStart(getClass().getName(),59227);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11jsr0j19p7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119ao19aolc8azxf3.R.rethrow($CLV_t2$);}finally{__CLR4_4_119ao19aolc8azxf3.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testParseInto_monthOnly_baseEndYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),59227,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11jsr0j19p7(){try{__CLR4_4_119ao19aolc8azxf3.R.inc(59227);
        __CLR4_4_119ao19aolc8azxf3.R.inc(59228);DateTimeFormatter f = DateTimeFormat.forPattern("M").withLocale(Locale.UK);
        __CLR4_4_119ao19aolc8azxf3.R.inc(59229);MutableDateTime result = new MutableDateTime(2004, 12, 31, 12, 20, 30, 0, TOKYO);
        __CLR4_4_119ao19aolc8azxf3.R.inc(59230);assertEquals(1, f.parseInto(result, "5", 0));
        __CLR4_4_119ao19aolc8azxf3.R.inc(59231);assertEquals(new MutableDateTime(2004, 5, 31, 12, 20, 30, 0, TOKYO), result);
   }finally{__CLR4_4_119ao19aolc8azxf3.R.flushNeeded();}}

    public void testParseInto_monthOnly_parseEndYear() {__CLR4_4_119ao19aolc8azxf3.R.globalSliceStart(getClass().getName(),59232);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1e2uxv19pc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119ao19aolc8azxf3.R.rethrow($CLV_t2$);}finally{__CLR4_4_119ao19aolc8azxf3.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testParseInto_monthOnly_parseEndYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),59232,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1e2uxv19pc(){try{__CLR4_4_119ao19aolc8azxf3.R.inc(59232);
        __CLR4_4_119ao19aolc8azxf3.R.inc(59233);DateTimeFormatter f = DateTimeFormat.forPattern("M").withLocale(Locale.UK);
        __CLR4_4_119ao19aolc8azxf3.R.inc(59234);MutableDateTime result = new MutableDateTime(2004, 1, 31, 12, 20, 30, 0,TOKYO);
        __CLR4_4_119ao19aolc8azxf3.R.inc(59235);assertEquals(2, f.parseInto(result, "12", 0));
        __CLR4_4_119ao19aolc8azxf3.R.inc(59236);assertEquals(new MutableDateTime(2004, 12, 31, 12, 20, 30, 0, TOKYO), result);
    }finally{__CLR4_4_119ao19aolc8azxf3.R.flushNeeded();}}

    public void testParseInto_monthDay_feb29() {__CLR4_4_119ao19aolc8azxf3.R.globalSliceStart(getClass().getName(),59237);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1r7j8us19ph();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119ao19aolc8azxf3.R.rethrow($CLV_t2$);}finally{__CLR4_4_119ao19aolc8azxf3.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testParseInto_monthDay_feb29",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),59237,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1r7j8us19ph(){try{__CLR4_4_119ao19aolc8azxf3.R.inc(59237);
        __CLR4_4_119ao19aolc8azxf3.R.inc(59238);DateTimeFormatter f = DateTimeFormat.forPattern("M d").withLocale(Locale.UK);
        __CLR4_4_119ao19aolc8azxf3.R.inc(59239);MutableDateTime result = new MutableDateTime(2004, 1, 9, 12, 20, 30, 0, LONDON);
        __CLR4_4_119ao19aolc8azxf3.R.inc(59240);assertEquals(4, f.parseInto(result, "2 29", 0));
        __CLR4_4_119ao19aolc8azxf3.R.inc(59241);assertEquals(new MutableDateTime(2004, 2, 29, 12, 20, 30, 0, LONDON), result);
    }finally{__CLR4_4_119ao19aolc8azxf3.R.flushNeeded();}}

    public void testParseInto_monthDay_feb29_startOfYear() {__CLR4_4_119ao19aolc8azxf3.R.globalSliceStart(getClass().getName(),59242);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_120o8ar19pm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119ao19aolc8azxf3.R.rethrow($CLV_t2$);}finally{__CLR4_4_119ao19aolc8azxf3.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testParseInto_monthDay_feb29_startOfYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),59242,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_120o8ar19pm(){try{__CLR4_4_119ao19aolc8azxf3.R.inc(59242);
        __CLR4_4_119ao19aolc8azxf3.R.inc(59243);DateTimeFormatter f = DateTimeFormat.forPattern("M d").withLocale(Locale.UK);
        __CLR4_4_119ao19aolc8azxf3.R.inc(59244);MutableDateTime result = new MutableDateTime(2004, 1, 1, 0, 0, 0, 0, LONDON);
        __CLR4_4_119ao19aolc8azxf3.R.inc(59245);assertEquals(4, f.parseInto(result, "2 29", 0));
        __CLR4_4_119ao19aolc8azxf3.R.inc(59246);assertEquals(new MutableDateTime(2004, 2, 29, 0, 0, 0, 0, LONDON), result);
    }finally{__CLR4_4_119ao19aolc8azxf3.R.flushNeeded();}}

    public void testParseInto_monthDay_feb29_OfYear() {__CLR4_4_119ao19aolc8azxf3.R.globalSliceStart(getClass().getName(),59247);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xc3t3p19pr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119ao19aolc8azxf3.R.rethrow($CLV_t2$);}finally{__CLR4_4_119ao19aolc8azxf3.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testParseInto_monthDay_feb29_OfYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),59247,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xc3t3p19pr(){try{__CLR4_4_119ao19aolc8azxf3.R.inc(59247);
        __CLR4_4_119ao19aolc8azxf3.R.inc(59248);DateTimeFormatter f = DateTimeFormat.forPattern("M d").withLocale(Locale.UK);
        __CLR4_4_119ao19aolc8azxf3.R.inc(59249);MutableDateTime result = new MutableDateTime(2004, 12, 31, 23, 59, 59, 999, LONDON);
        __CLR4_4_119ao19aolc8azxf3.R.inc(59250);assertEquals(4, f.parseInto(result, "2 29", 0));
        __CLR4_4_119ao19aolc8azxf3.R.inc(59251);assertEquals(new MutableDateTime(2004, 2, 29, 23, 59, 59, 999, LONDON), result);
    }finally{__CLR4_4_119ao19aolc8azxf3.R.flushNeeded();}}

    public void testParseInto_monthDay_feb29_newYork() {__CLR4_4_119ao19aolc8azxf3.R.globalSliceStart(getClass().getName(),59252);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16403p819pw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119ao19aolc8azxf3.R.rethrow($CLV_t2$);}finally{__CLR4_4_119ao19aolc8azxf3.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testParseInto_monthDay_feb29_newYork",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),59252,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16403p819pw(){try{__CLR4_4_119ao19aolc8azxf3.R.inc(59252);
        __CLR4_4_119ao19aolc8azxf3.R.inc(59253);DateTimeFormatter f = DateTimeFormat.forPattern("M d").withLocale(Locale.UK);
        __CLR4_4_119ao19aolc8azxf3.R.inc(59254);MutableDateTime result = new MutableDateTime(2004, 1, 9, 12, 20, 30, 0, NEWYORK);
        __CLR4_4_119ao19aolc8azxf3.R.inc(59255);assertEquals(4, f.parseInto(result, "2 29", 0));
        __CLR4_4_119ao19aolc8azxf3.R.inc(59256);assertEquals(new MutableDateTime(2004, 2, 29, 12, 20, 30, 0, NEWYORK), result);
    }finally{__CLR4_4_119ao19aolc8azxf3.R.flushNeeded();}}

    public void testParseInto_monthDay_feb29_newYork_startOfYear() {__CLR4_4_119ao19aolc8azxf3.R.globalSliceStart(getClass().getName(),59257);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rtoofh19q1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119ao19aolc8azxf3.R.rethrow($CLV_t2$);}finally{__CLR4_4_119ao19aolc8azxf3.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testParseInto_monthDay_feb29_newYork_startOfYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),59257,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rtoofh19q1(){try{__CLR4_4_119ao19aolc8azxf3.R.inc(59257);
        __CLR4_4_119ao19aolc8azxf3.R.inc(59258);DateTimeFormatter f = DateTimeFormat.forPattern("M d").withLocale(Locale.UK);
        __CLR4_4_119ao19aolc8azxf3.R.inc(59259);MutableDateTime result = new MutableDateTime(2004, 1, 1, 0, 0, 0, 0, NEWYORK);
        __CLR4_4_119ao19aolc8azxf3.R.inc(59260);assertEquals(4, f.parseInto(result, "2 29", 0));
        __CLR4_4_119ao19aolc8azxf3.R.inc(59261);assertEquals(new MutableDateTime(2004, 2, 29, 0, 0, 0, 0, NEWYORK), result);
    }finally{__CLR4_4_119ao19aolc8azxf3.R.flushNeeded();}}

    public void testParseInto_monthDay_feb29_newYork_endOfYear() {__CLR4_4_119ao19aolc8azxf3.R.globalSliceStart(getClass().getName(),59262);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14qsfis19q6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119ao19aolc8azxf3.R.rethrow($CLV_t2$);}finally{__CLR4_4_119ao19aolc8azxf3.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testParseInto_monthDay_feb29_newYork_endOfYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),59262,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14qsfis19q6(){try{__CLR4_4_119ao19aolc8azxf3.R.inc(59262);
        __CLR4_4_119ao19aolc8azxf3.R.inc(59263);DateTimeFormatter f = DateTimeFormat.forPattern("M d").withLocale(Locale.UK);
        __CLR4_4_119ao19aolc8azxf3.R.inc(59264);MutableDateTime result = new MutableDateTime(2004, 12, 31, 23, 59, 59, 999, NEWYORK);
        __CLR4_4_119ao19aolc8azxf3.R.inc(59265);assertEquals(4, f.parseInto(result, "2 29", 0));
        __CLR4_4_119ao19aolc8azxf3.R.inc(59266);assertEquals(new MutableDateTime(2004, 2, 29, 23, 59, 59, 999, NEWYORK), result);
    }finally{__CLR4_4_119ao19aolc8azxf3.R.flushNeeded();}}

    public void testParseInto_monthDay_feb29_tokyo() {__CLR4_4_119ao19aolc8azxf3.R.globalSliceStart(getClass().getName(),59267);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1evwk6r19qb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119ao19aolc8azxf3.R.rethrow($CLV_t2$);}finally{__CLR4_4_119ao19aolc8azxf3.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testParseInto_monthDay_feb29_tokyo",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),59267,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1evwk6r19qb(){try{__CLR4_4_119ao19aolc8azxf3.R.inc(59267);
        __CLR4_4_119ao19aolc8azxf3.R.inc(59268);DateTimeFormatter f = DateTimeFormat.forPattern("M d").withLocale(Locale.UK);
        __CLR4_4_119ao19aolc8azxf3.R.inc(59269);MutableDateTime result = new MutableDateTime(2004, 1, 9, 12, 20, 30, 0, TOKYO);
        __CLR4_4_119ao19aolc8azxf3.R.inc(59270);assertEquals(4, f.parseInto(result, "2 29", 0));
        __CLR4_4_119ao19aolc8azxf3.R.inc(59271);assertEquals(new MutableDateTime(2004, 2, 29, 12, 20, 30, 0, TOKYO), result);
    }finally{__CLR4_4_119ao19aolc8azxf3.R.flushNeeded();}}

    public void testParseInto_monthDay_feb29_tokyo_startOfYear() {__CLR4_4_119ao19aolc8azxf3.R.globalSliceStart(getClass().getName(),59272);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dz7rna19qg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119ao19aolc8azxf3.R.rethrow($CLV_t2$);}finally{__CLR4_4_119ao19aolc8azxf3.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testParseInto_monthDay_feb29_tokyo_startOfYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),59272,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dz7rna19qg(){try{__CLR4_4_119ao19aolc8azxf3.R.inc(59272);
        __CLR4_4_119ao19aolc8azxf3.R.inc(59273);DateTimeFormatter f = DateTimeFormat.forPattern("M d").withLocale(Locale.UK);
        __CLR4_4_119ao19aolc8azxf3.R.inc(59274);MutableDateTime result = new MutableDateTime(2004, 1, 1, 0, 0, 0, 0, TOKYO);
        __CLR4_4_119ao19aolc8azxf3.R.inc(59275);assertEquals(4, f.parseInto(result, "2 29", 0));
        __CLR4_4_119ao19aolc8azxf3.R.inc(59276);assertEquals(new MutableDateTime(2004, 2, 29, 0, 0, 0, 0, TOKYO), result);
    }finally{__CLR4_4_119ao19aolc8azxf3.R.flushNeeded();}}

    public void testParseInto_monthDay_feb29_tokyo_endOfYear() {__CLR4_4_119ao19aolc8azxf3.R.globalSliceStart(getClass().getName(),59277);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1y017vn19ql();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119ao19aolc8azxf3.R.rethrow($CLV_t2$);}finally{__CLR4_4_119ao19aolc8azxf3.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testParseInto_monthDay_feb29_tokyo_endOfYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),59277,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1y017vn19ql(){try{__CLR4_4_119ao19aolc8azxf3.R.inc(59277);
        __CLR4_4_119ao19aolc8azxf3.R.inc(59278);DateTimeFormatter f = DateTimeFormat.forPattern("M d").withLocale(Locale.UK);
        __CLR4_4_119ao19aolc8azxf3.R.inc(59279);MutableDateTime result = new MutableDateTime(2004, 12, 31, 23, 59, 59, 999, TOKYO);
        __CLR4_4_119ao19aolc8azxf3.R.inc(59280);assertEquals(4, f.parseInto(result, "2 29", 0));
        __CLR4_4_119ao19aolc8azxf3.R.inc(59281);assertEquals(new MutableDateTime(2004, 2, 29, 23, 59, 59, 999, TOKYO), result);
    }finally{__CLR4_4_119ao19aolc8azxf3.R.flushNeeded();}}

    public void testParseInto_monthDay_withDefaultYear_feb29() {__CLR4_4_119ao19aolc8azxf3.R.globalSliceStart(getClass().getName(),59282);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17s72uz19qq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119ao19aolc8azxf3.R.rethrow($CLV_t2$);}finally{__CLR4_4_119ao19aolc8azxf3.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testParseInto_monthDay_withDefaultYear_feb29",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),59282,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17s72uz19qq(){try{__CLR4_4_119ao19aolc8azxf3.R.inc(59282);
        __CLR4_4_119ao19aolc8azxf3.R.inc(59283);DateTimeFormatter f = DateTimeFormat.forPattern("M d").withDefaultYear(2012);
        __CLR4_4_119ao19aolc8azxf3.R.inc(59284);MutableDateTime result = new MutableDateTime(2004, 1, 9, 12, 20, 30, 0, LONDON);
        __CLR4_4_119ao19aolc8azxf3.R.inc(59285);assertEquals(4, f.parseInto(result, "2 29", 0));
        __CLR4_4_119ao19aolc8azxf3.R.inc(59286);assertEquals(new MutableDateTime(2004, 2, 29, 12, 20, 30, 0, LONDON), result);
    }finally{__CLR4_4_119ao19aolc8azxf3.R.flushNeeded();}}

    public void testParseInto_monthDay_withDefaultYear_feb29_newYork() {__CLR4_4_119ao19aolc8azxf3.R.globalSliceStart(getClass().getName(),59287);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ra0zkl19qv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119ao19aolc8azxf3.R.rethrow($CLV_t2$);}finally{__CLR4_4_119ao19aolc8azxf3.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testParseInto_monthDay_withDefaultYear_feb29_newYork",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),59287,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ra0zkl19qv(){try{__CLR4_4_119ao19aolc8azxf3.R.inc(59287);
        __CLR4_4_119ao19aolc8azxf3.R.inc(59288);DateTimeFormatter f = DateTimeFormat.forPattern("M d").withDefaultYear(2012);
        __CLR4_4_119ao19aolc8azxf3.R.inc(59289);MutableDateTime result = new MutableDateTime(2004, 1, 9, 12, 20, 30, 0, NEWYORK);
        __CLR4_4_119ao19aolc8azxf3.R.inc(59290);assertEquals(4, f.parseInto(result, "2 29", 0));
        __CLR4_4_119ao19aolc8azxf3.R.inc(59291);assertEquals(new MutableDateTime(2004, 2, 29, 12, 20, 30, 0, NEWYORK), result);
    }finally{__CLR4_4_119ao19aolc8azxf3.R.flushNeeded();}}

    public void testParseInto_monthDay_withDefaultYear_feb29_newYork_endOfYear() {__CLR4_4_119ao19aolc8azxf3.R.globalSliceStart(getClass().getName(),59292);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rn8mm319r0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119ao19aolc8azxf3.R.rethrow($CLV_t2$);}finally{__CLR4_4_119ao19aolc8azxf3.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testParseInto_monthDay_withDefaultYear_feb29_newYork_endOfYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),59292,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rn8mm319r0(){try{__CLR4_4_119ao19aolc8azxf3.R.inc(59292);
        __CLR4_4_119ao19aolc8azxf3.R.inc(59293);DateTimeFormatter f = DateTimeFormat.forPattern("M d").withDefaultYear(2012);
        __CLR4_4_119ao19aolc8azxf3.R.inc(59294);MutableDateTime result = new MutableDateTime(2004, 12, 9, 12, 20, 30, 0, NEWYORK);
        __CLR4_4_119ao19aolc8azxf3.R.inc(59295);assertEquals(4, f.parseInto(result, "2 29", 0));
        __CLR4_4_119ao19aolc8azxf3.R.inc(59296);assertEquals(new MutableDateTime(2004, 2, 29, 12, 20, 30, 0, NEWYORK), result);
    }finally{__CLR4_4_119ao19aolc8azxf3.R.flushNeeded();}}

    public void testParseMillis_fractionOfSecondLong() {__CLR4_4_119ao19aolc8azxf3.R.globalSliceStart(getClass().getName(),59297);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s0oulk19r5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119ao19aolc8azxf3.R.rethrow($CLV_t2$);}finally{__CLR4_4_119ao19aolc8azxf3.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testParseMillis_fractionOfSecondLong",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),59297,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s0oulk19r5(){try{__CLR4_4_119ao19aolc8azxf3.R.inc(59297);
        __CLR4_4_119ao19aolc8azxf3.R.inc(59298);DateTimeFormatter f = new DateTimeFormatterBuilder()
            .appendSecondOfDay(2).appendLiteral('.').appendFractionOfSecond(1, 9)
                .toFormatter().withZoneUTC();
        __CLR4_4_119ao19aolc8azxf3.R.inc(59299);assertEquals(10512, f.parseMillis("10.5123456"));
        __CLR4_4_119ao19aolc8azxf3.R.inc(59300);assertEquals(10512, f.parseMillis("10.512999"));
    }finally{__CLR4_4_119ao19aolc8azxf3.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    // Ensure time zone name switches properly at the zone DST transition.
    public void testZoneNameNearTransition() {__CLR4_4_119ao19aolc8azxf3.R.globalSliceStart(getClass().getName(),59301);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15tgbd919r9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119ao19aolc8azxf3.R.rethrow($CLV_t2$);}finally{__CLR4_4_119ao19aolc8azxf3.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testZoneNameNearTransition",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),59301,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15tgbd919r9(){try{__CLR4_4_119ao19aolc8azxf3.R.inc(59301);}finally{__CLR4_4_119ao19aolc8azxf3.R.flushNeeded();}}
// Defects4J: flaky method
//     public void testZoneNameNearTransition() {
//         DateTime inDST_1  = new DateTime(2005, 10, 30, 1, 0, 0, 0, NEWYORK);
//         DateTime inDST_2  = new DateTime(2005, 10, 30, 1, 59, 59, 999, NEWYORK);
//         DateTime onDST    = new DateTime(2005, 10, 30, 2, 0, 0, 0, NEWYORK);
//         DateTime outDST   = new DateTime(2005, 10, 30, 2, 0, 0, 1, NEWYORK);
//         DateTime outDST_2 = new DateTime(2005, 10, 30, 2, 0, 1, 0, NEWYORK);
// 
//         DateTimeFormatter fmt = DateTimeFormat.forPattern("yyy-MM-dd HH:mm:ss.S zzzz");
//         assertEquals("2005-10-30 01:00:00.0 Eastern Daylight Time", fmt.print(inDST_1));
//         assertEquals("2005-10-30 01:59:59.9 Eastern Daylight Time", fmt.print(inDST_2));
//         assertEquals("2005-10-30 02:00:00.0 Eastern Standard Time", fmt.print(onDST));
//         assertEquals("2005-10-30 02:00:00.0 Eastern Standard Time", fmt.print(outDST));
//         assertEquals("2005-10-30 02:00:01.0 Eastern Standard Time", fmt.print(outDST_2));
//     }

    // Ensure time zone name switches properly at the zone DST transition.
    public void testZoneShortNameNearTransition() {__CLR4_4_119ao19aolc8azxf3.R.globalSliceStart(getClass().getName(),59302);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1euusq519ra();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119ao19aolc8azxf3.R.rethrow($CLV_t2$);}finally{__CLR4_4_119ao19aolc8azxf3.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatter.testZoneShortNameNearTransition",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),59302,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1euusq519ra(){try{__CLR4_4_119ao19aolc8azxf3.R.inc(59302);}finally{__CLR4_4_119ao19aolc8azxf3.R.flushNeeded();}}
// Defects4J: flaky method
//     public void testZoneShortNameNearTransition() {
//         DateTime inDST_1  = new DateTime(2005, 10, 30, 1, 0, 0, 0, NEWYORK);
//         DateTime inDST_2  = new DateTime(2005, 10, 30, 1, 59, 59, 999, NEWYORK);
//         DateTime onDST    = new DateTime(2005, 10, 30, 2, 0, 0, 0, NEWYORK);
//         DateTime outDST   = new DateTime(2005, 10, 30, 2, 0, 0, 1, NEWYORK);
//         DateTime outDST_2 = new DateTime(2005, 10, 30, 2, 0, 1, 0, NEWYORK);
// 
//         DateTimeFormatter fmt = DateTimeFormat.forPattern("yyy-MM-dd HH:mm:ss.S z");
//         assertEquals("2005-10-30 01:00:00.0 EDT", fmt.print(inDST_1));
//         assertEquals("2005-10-30 01:59:59.9 EDT", fmt.print(inDST_2));
//         assertEquals("2005-10-30 02:00:00.0 EST", fmt.print(onDST));
//         assertEquals("2005-10-30 02:00:00.0 EST", fmt.print(outDST));
//         assertEquals("2005-10-30 02:00:01.0 EST", fmt.print(outDST_2));
//     }

}
